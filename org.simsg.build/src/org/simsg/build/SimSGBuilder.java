package org.simsg.build;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.gervarro.eclipse.workspace.util.AntPatternCondition;
import org.moflon.core.build.AbstractVisitorBuilder;
import org.moflon.core.build.CleanVisitor;
import org.moflon.core.utilities.ErrorReporter;
import org.moflon.core.utilities.MoflonUtil;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.emf.codegen.CodeGenerator;
import org.moflon.emf.codegen.resource.GenModelResource;

/**
 * This builder triggers a basic code generation workflow for all Ecore models
 * in /model
 *
 */
public class SimSGBuilder extends IncrementalProjectBuilder {
	public static final Logger logger = Logger.getLogger(SimSGBuilder.class);
	
	public static final String DEFAULT_RULE_LOCATION = "/src/**";
	public static final String DEFAULT_METAMODEL_LOCATION = "/model";
	public static final String DEFAULT_MODEL_LOCATION = "/model";

	private static final String SIMSG_BUILDER_ID = "org.simsg.build.SimSGBuilder";

	/**
	 * Initializes the visitor condition
	 *
	 * This builder gets triggered whenever any ecore file in /models changes
	 */
	public SimSGBuilder() {
		//super(new AntPatternCondition(getTriggerPatterns()));
	}
	
	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {
		IResourceDelta delta = getDelta(getProject());
		if(delta == null) {
			return null;
		}
		
		if(kind == FULL_BUILD || kind == CLEAN_BUILD ) {
			for(int i = 0; i<delta.getAffectedChildren().length; i++) {
				processResourceDelta(delta.getAffectedChildren()[i], kind, args, monitor);
			}
		}
		return null;
	}
	
	private static String[] getTriggerPatterns() {
		List<String> patterns = new ArrayList<>();
		patterns.add(DEFAULT_METAMODEL_LOCATION+"/*.ecore");
		patterns.add(DEFAULT_RULE_LOCATION+"/*.gt");
		patterns.add(DEFAULT_MODEL_LOCATION+"/*.xmi");
		return patterns.stream().toArray(String[]::new);
	}

	public static String getId() {
		return SIMSG_BUILDER_ID;
	}

	/**
	 * This builder locks the surrounding project
	 */
	@Override
	public ISchedulingRule getRule(final int kind, final Map<String, String> args) {
		return getProject();
	}

	/**
	 * The cleans generated code and problem markers
	 */
	@Override
	protected void clean(final IProgressMonitor monitor) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Cleaning " + getProject(), 4);

//		deleteProblemMarkers();
		subMon.worked(1);

		removeGeneratedCode(getProject());
		subMon.worked(3);
	}

	/**
	 * Converts the given {@link Status} to problem markers in the Eclipse UI
	 *
	 * @param status the status to be converted
	 * @param file   the file contains problems
	 */
	public void handleErrorsInEclipse(final IStatus status, final IFile file) {
		final String reporterClass = "org.simsg.ui.errorhandling.MultiStatusAwareErrorReporter";
		final ErrorReporter eclipseErrorReporter = (ErrorReporter) Platform.getAdapterManager().loadAdapter(file,
				reporterClass);
		if (eclipseErrorReporter != null) {
			eclipseErrorReporter.report(status);
		} else {
			logger.error(String.format("Could not load error reporter '%s' to report status", reporterClass));
		}
	}
	
	protected void processResourceDelta(IResourceDelta resourceDelta, final int kind, Map<String, String> args,
			final IProgressMonitor monitor) {
		IProject project = getProject();
		IResource resource = resourceDelta.getResource();
		
		if(!resource.getProject().equals(project)) {
			return;
		}
		
		String[] triggerPatterns = getTriggerPatterns();
		
		if(resource.getFullPath().toPortableString().endsWith(triggerPatterns[0])) {
			processResource(resource, kind, args, monitor);
			return;
		}
		
		
		if(resource.getFullPath().toPortableString().endsWith(triggerPatterns[1])) {
			
			return;
		}


		if(resource.getFullPath().toPortableString().endsWith(triggerPatterns[2])) {
			
			return;
		}
	}


	protected void processResource(IResource resource, final int kind, Map<String, String> args,
			final IProgressMonitor monitor) {

		final IProject project = resource.getProject();
		final SubMonitor subMon = SubMonitor.convert(monitor, "Building SimSGProject: " + project, 9);
		
		try {
			createFoldersIfNecessary(project, subMon.split(1));
		} catch (OperationCanceledException | CoreException e) {
			logger.error("Could not create necessary folders. Error: \n" + e.getMessage());
		}
		subMon.worked(0);
		
		// Build meta-model code
		if(WorkspaceHelper.isFile(resource) && resource.getName().endsWith(".ecore")) {
			GenModel genmodel = null;
			try {
				genmodel = findOrCreateGenModel(project, resource, subMon);
			} catch (IOException | CoreException e) {
				logger.error("Could not load or create genmodel. Error: \n" + e.getMessage());
			}
			
			try {
				generateMetaModelCode(genmodel, project, subMon);
			} catch (IOException e) {
				logger.error("Could not generate metamodel code. Error: \n" + e.getMessage());
			}
			
		}
		subMon.worked(2);
		
		// Build eMoflon-api code and generate gt-rule & ibex-pattern models
		if(WorkspaceHelper.isFile(resource) && resource.getName().endsWith(".gt")) {
			
		}
		
		// Build eMoflon-api code
		if(WorkspaceHelper.isFile(resource) && resource.getName().endsWith(".xmi")) {
			
		}
		
//		if (WorkspaceHelper.isXcoreFile(resource))
//			resource = convertXcoreToEcore(resource);
//
//		if (WorkspaceHelper.isEcoreFile(resource))
//			buildEcoreFile(resource, monitor);
	}
	
	protected GenModel findOrCreateGenModel(final IProject project, IResource ecoreFile, 
			final IProgressMonitor monitor) throws IOException, CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Generating genmodel: " + project, 2);
		URI ecoreUri = URI.createPlatformResourceURI(ecoreFile.getProjectRelativePath().toPortableString(), true);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource resource = rs.getResource(ecoreUri, true);	
		
		if(resource == null) {
			throw new IOException("Could not load resource: " + ecoreUri.path());
		}
		
		EPackage metamodel = (EPackage) resource.getContents().get(0);
		subMon.worked(0);
		
		URI genmodelUri = ecoreUri.trimFileExtension().appendFileExtension("genmodel");
		IFile genmodelFile = project.getFile(genmodelUri.toFileString());
		if(genmodelFile.exists()) {
			genmodelFile.delete(false, null);
		}
		
		final GenModelResource genModelResource = (GenModelResource) rs.createResource(genmodelUri);
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModelResource.getContents().add(genModel);

		adjustRegistry(genModel, rs);

		loadDefaultGenModelContent(genModel);
		 
        //genModel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);
        genModel.setModelDirectory("/src-gen/");
        genModel.getForeignModel().add(ecoreFile.getProjectRelativePath().toPortableString());
        genModel.setModelName(metamodel.getName());
        genModel.setModelPluginID(project.getName());
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
        genPackage.setPrefix(project.getName());
        subMon.worked(1);
        
		return genModel;
	}
	
	protected void generateMetaModelCode(GenModel genModel, final IProject project, 
			final IProgressMonitor monitor) throws IOException {
		CodeGenerator generator = new CodeGenerator();
        generator.setInput(genModel);
        generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, project.getName(), (Monitor) monitor);

        try {
        	final GenModelResource genModelResource = (GenModelResource)genModel.eResource();
        	genModelResource.getDefaultSaveOptions().put(XMLResource.OPTION_ENCODING, "UTF-8");
            genModelResource.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
            genModelResource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            String msg = null;
            if (e instanceof FileNotFoundException) {
                msg = "Unable to open output file ";
            } else {
                msg = "Unexpected IO Exception writing ";
            }
            throw new IOException(msg, e);
        }
	}
	
	protected void adjustRegistry(final GenModel genModel, ResourceSet rs) {
		// Ugly hack added by gervarro: GenModel has to be screwed
		final EPackage.Registry registry = rs.getPackageRegistry();
		rs.setPackageRegistry(new EPackageRegistryImpl(registry));
		genModel.getExtendedMetaData();
		rs.setPackageRegistry(registry);
	}
	
	public void loadDefaultGenModelContent(final GenModel genModel) {
		genModel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);
		//genModel.setModelName(genModel.eResource().getURI().trimFileExtension().lastSegment());
		genModel.setImporterID("org.eclipse.emf.importer.ecore");
		genModel.setCodeFormatting(true);
		genModel.setOperationReflection(true);
		genModel.setUpdateClasspath(false);
		genModel.setCanGenerate(true);
	}
	
	private void setDefaultPackagePrefixes(final GenPackage genPackage) {
		genPackage.setPrefix(MoflonUtil.lastCapitalizedSegmentOf(genPackage.getPrefix()));
		for (final GenPackage subPackage : genPackage.getSubGenPackages()) {
			setDefaultPackagePrefixes(subPackage);
		}
	}

	protected final AntPatternCondition getTriggerCondition(final IProject project) {
		return new AntPatternCondition(new String[0]);
	}

	/**
	 * Handles errors and warning produced by the code generation task
	 *
	 * @param status the {@link IStatus} that contains the errors and warnings
	 */
	protected void handleErrorsAndWarnings(final IStatus status, final IFile ecoreFile) throws CoreException {
		if (status.matches(IStatus.ERROR)) {
			handleErrorsInEclipse(status, ecoreFile);
		}
	}

	/**
	 * Removes all contents in /gen, but preserves all versioning files
	 *
	 * @param project the project to be cleaned
	 * @throws CoreException if cleaning fails
	 */
	private void removeGeneratedCode(final IProject project) throws CoreException {
		final CleanVisitor cleanVisitor = new CleanVisitor(project, //
				new AntPatternCondition(new String[] { "src-gen/**" }) //
				);
		project.accept(cleanVisitor, IResource.DEPTH_INFINITE, IResource.NONE);
	}


	private static void createFoldersIfNecessary(final IProject project, final IProgressMonitor monitor)
			throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating folders within project " + project, 4);

		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getSourceFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getBinFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getModelFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder("src-gen"), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder("instances"), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder("instances/simulation_definitions"), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder("instances/simulation_results"), subMon.split(1));
	}

	

}
