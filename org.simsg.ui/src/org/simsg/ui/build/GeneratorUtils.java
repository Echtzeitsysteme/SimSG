package org.simsg.ui.build;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternModelPackage;
import org.gervarro.eclipse.workspace.util.AntPatternCondition;
import org.moflon.core.build.CleanVisitor;
import org.moflon.core.utilities.MoflonUtil;
import org.moflon.emf.codegen.CodeGenerator;
import org.moflon.emf.codegen.StandalonePackageDescriptor;
import org.moflon.emf.codegen.resource.GenModelResource;
import org.moflon.emf.codegen.resource.GenModelResourceFactory;

public final class GeneratorUtils {
	
	public static final GenModelResource findOrCreateGenModel(final IProject project, final IFolder modelFolder, final IResource ecoreFile, 
			final IProgressMonitor monitor) throws IOException, CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Generating genmodel: " + project, 2);
		URI ecoreUri = URI.createPlatformResourceURI(project.getName()+"/"+ecoreFile.getProjectRelativePath().toPortableString(), true);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource resource = rs.getResource(ecoreUri, true);	
		
		if(resource == null) {
			throw new IOException("Could not load resource: " + ecoreUri.path());
		}
		
		EPackage metamodel = (EPackage) resource.getContents().get(0);
		subMon.worked(0);
		
		URI genmodelUri = URI.createFileURI(modelFolder.getFile(metamodel.getName()+".genmodel").getProjectRelativePath().toPortableString());
		IFile genmodelFile = project.getFile(genmodelUri.toFileString());
		if(genmodelFile.exists()) {
			genmodelFile.delete(false, null);
		}
		
		rs.getPackageRegistry().put("http://www.eclipse.org/emf/2002/GenModel",
				new StandalonePackageDescriptor("org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage"));
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("genmodel",
				new GenModelResourceFactory());
		
		final GenModelResource genModelResource = (GenModelResource) rs.createResource(genmodelUri);
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModelResource.getContents().add(genModel);

		adjustRegistry(genModel, rs);

		loadDefaultGenModelContent(genModel);
        genModel.setModelDirectory(project.getFullPath().toPortableString()+"/src-gen");
        genModel.getForeignModel().add(new Path(ecoreUri.path()).lastSegment());
        genModel.setModelName(metamodel.getName());
        genModel.setModelPluginID(metamodel.getName());
        genModel.setSuppressEMFMetaData(false);
        genModel.setCanGenerate(true);
        genModel.setContainmentProxies(false);
        genModel.setDynamicTemplates(false);
        genModel.setGenerateSchema(true);
        genModel.setUpdateClasspath(false);
        
        List<EPackage> ePack = new LinkedList<>();
        ePack.add(metamodel);
        genModel.initialize(ePack);

        genModel.validate();
        genModel.reconcile();
        
        for (final GenPackage genPackage : genModel.getGenPackages()) {
			setDefaultPackagePrefixes(genPackage);
		}
        
        GenPackage genPackage = (GenPackage) genModel.getGenPackages().get(0);
        genPackage.setPrefix(metamodel.getNsPrefix());
        subMon.worked(1);
        
		return genModelResource;
	}
	
	public static void generateMetaModelCode(final GenModelResource genModelResource, final IProject project, 
			final IProgressMonitor monitor) throws IOException, CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Generating model code: " + project, 2);
		
		CodeGenerator generator = new CodeGenerator();
		GenModel genModel = (GenModel)genModelResource.getContents().get(0);
        generator.setInput(genModel);
        generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, genModel.getModelName(), BasicMonitor.toMonitor(monitor));
        subMon.worked(0);
        
        // Somehow the generator creates these useless XSD-files. We don't need those -> delete
        removeGeneratedCode(project, "model/*.xsd");
		subMon.worked(1);
	}
	
	public static void adjustRegistry(final GenModel genModel, ResourceSet rs) {
		// Ugly hack added by gervarro: GenModel has to be screwed
		final EPackage.Registry registry = rs.getPackageRegistry();
		rs.setPackageRegistry(new EPackageRegistryImpl(registry));
		genModel.getExtendedMetaData();
		rs.setPackageRegistry(registry);
	}
	
	public static void loadDefaultGenModelContent(final GenModel genModel) {
		genModel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);
		genModel.setImporterID("org.eclipse.emf.importer.ecore");
		genModel.setCodeFormatting(true);
		genModel.setOperationReflection(true);
		genModel.setUpdateClasspath(false);
		genModel.setCanGenerate(true);
	}
	
	public static void setDefaultPackagePrefixes(final GenPackage genPackage) {
		genPackage.setPrefix(MoflonUtil.lastCapitalizedSegmentOf(genPackage.getPrefix()));
		for (final GenPackage subPackage : genPackage.getSubGenPackages()) {
			setDefaultPackagePrefixes(subPackage);
		}
	}
	
	public static void removeGeneratedCode(final IProject project, final String pattern) throws CoreException {
		final CleanVisitor cleanVisitor = new CleanVisitor(project, //
				new AntPatternCondition(new String[] { pattern }) //
				);
		project.accept(cleanVisitor, IResource.DEPTH_INFINITE, IResource.NONE);
	}
	
	public static final Resource loadXmi(final IResource xmiResource) throws IOException {
		IBeXPatternModelPackage.eINSTANCE.getClass();
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		final ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		rs.setPackageRegistry(EPackage.Registry.INSTANCE);
		
		URI resourceURI = URI.createPlatformResourceURI(xmiResource.getFullPath().toPortableString(), true);
		final Resource resource = rs.getResource(resourceURI, true);
		if(resource == null) {
			throw new IOException("Could not load resource: " + resourceURI.path());
		}
		return resource;
	}

}
