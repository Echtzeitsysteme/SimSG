package org.simsg.ui.build;

import GTLanguage.GTNode;
import GTLanguage.GTRule;
import GTLanguage.GTRuleSet;
import IBeXLanguage.IBeXPatternSet;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.jar.Manifest;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.ibex.gt.codegen.EClassifiersManager;
import org.emoflon.ibex.gt.codegen.GTEngineExtension;
import org.emoflon.ibex.gt.codegen.JavaFileGenerator;
import org.emoflon.ibex.gt.editor.ui.builder.GTBuilderExtension;
import org.gervarro.eclipse.workspace.util.AntPatternCondition;
import org.moflon.core.build.AbstractVisitorBuilder;
import org.moflon.core.build.CleanVisitor;
import org.moflon.core.plugins.manifest.ManifestFileUpdater;
import org.moflon.core.propertycontainer.MoflonPropertiesContainerHelper;
import org.moflon.core.utilities.ErrorReporter;
import org.moflon.core.utilities.ExtensionsUtil;
import org.moflon.core.utilities.MoflonUtil;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.emf.codegen.CodeGenerator;
import org.moflon.emf.codegen.StandalonePackageDescriptor;
import org.moflon.emf.codegen.resource.GenModelResource;
import org.moflon.emf.codegen.resource.GenModelResourceFactory;

/**
 * This builder triggers a basic code generation workflow for all Ecore models
 * in /model
 *
 */
public class SimSGBuilder extends IncrementalProjectBuilder {
	public static final Logger logger = Logger.getLogger(SimSGBuilder.class);
	
	public static final String DEFAULT_SRC_LOCATION = "src";
	public static final String DEFAULT_METAMODEL_LOCATION = "model";
	public static final String DEFAULT_MODEL_LOCATION = "model";

	private static final String SIMSG_BUILDER_ID = "org.simsg.build.SimSGBuilder";
	
	private IFolder srcFolder;
	private IFolder metaModelFolder;
	private IFolder modelFolder;

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
		IProject project = getProject();
		final SubMonitor subMon = SubMonitor.convert(monitor, "Building SimSGProject: " + project, 1);
		
		if(kind == FULL_BUILD || kind == CLEAN_BUILD ) {
			fullBuild(project, monitor);
		}
		subMon.worked(1);
		
		return null;
	}

	public static String getId() {
		return SIMSG_BUILDER_ID;
	}

//	/**
//	 * This builder locks the surrounding project
//	 */
//	@Override
//	public ISchedulingRule getRule(final int kind, final Map<String, String> args) {
//		return getProject();
//	}
	
	protected void fullBuild(final IProject project, final IProgressMonitor monitor) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Generating code: " + getProject(), 7);
		
		// clean old code
		GeneratorUtils.removeGeneratedCode(project, "src-gen/**");
		subMon.worked(0);
		
		// create necessary folders
		try {
			createFoldersIfNecessary(project, subMon.split(1));
		} catch (OperationCanceledException | CoreException e) {
			logger.error("Could not create necessary folders. Error: \n" + e.getMessage());
		}

		srcFolder = getProject().getFolder(DEFAULT_SRC_LOCATION);
		metaModelFolder = getProject().getFolder(DEFAULT_METAMODEL_LOCATION);
		modelFolder  = getProject().getFolder(DEFAULT_MODEL_LOCATION);
		
		subMon.worked(1);
		
		// build metamodel code
		for(IResource resource : metaModelFolder.members()) {
			if(WorkspaceHelper.isFile(resource) && resource.getName().endsWith(".ecore")) {
				GenModelResource genModelResource = null;
				try {
					genModelResource = GeneratorUtils.findOrCreateGenModel(project, metaModelFolder, resource, subMon);
				} catch (IOException | CoreException e) {
					logger.error("Could not load or create genmodel. Error: \n" + e.getMessage());
				}
				
				try {
					GeneratorUtils.generateMetaModelCode(genModelResource, project, subMon);
				} catch (IOException e) {
					logger.error("Could not generate metamodel code. Error: \n" + e.getMessage());
				}
				
			}
		}
		subMon.worked(3);
		
		// build eMoflon api code
		for(IResource resource : modelFolder.members()) {
			if(WorkspaceHelper.isFile(resource) && resource.getName().endsWith(".xmi")) {
				GTRuleSet gtRules = null;
				try {
					Resource xmiResource = GeneratorUtils.loadXmi(resource);
					Object content = xmiResource.getContents().get(0);
					if(content instanceof GTRuleSet) {
						gtRules = (GTRuleSet)content;
					}
					if(content instanceof IBeXPatternSet) {
						resource.copy(project.getFile("src-gen/"+project.getName().replace(".", "/")+"/api/ibex-patterns.xmi").getFullPath(), false, monitor);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					logger.error("Could not load resource. Error: \n" + e.getMessage());
				}
				
				if(gtRules == null)
					continue;
				
				IFolder apiPackage = project.getFolder("src-gen/"+project.getName().replace(".", "/")+"/api");
				final Registry packageRegistry = gtRules.eResource().getResourceSet().getPackageRegistry();
				findAllEPackages(gtRules, packageRegistry);
				
				generateAPI(project, apiPackage, gtRules, packageRegistry);
				updateManifest(project, this::processManifestForPackage);
			}
		}
		subMon.worked(6);
		
		IFolder packagePath = project.getFolder(project.getName().replace(".", "/"));
		// build HiPE engine code
		collectEngineBuilderExtensions().forEach(ext->ext.run(project, packagePath.getProjectRelativePath()));
		
		
	}
	
	private void findAllEPackages(final GTRuleSet gtRules, final Registry packageRegistry) {
		for(GTRule rule : gtRules.getRules()) {
			for(GTNode node : rule.getNodes()) {
				EPackage foreign = node.getType().getEPackage();
				if(!packageRegistry.containsKey(foreign.getNsURI())) {
					packageRegistry.put(foreign.getNsURI(), foreign);
				}
			}
			for(GTNode node : rule.getRuleNodes()) {
				EPackage foreign = node.getType().getEPackage();
				if(!packageRegistry.containsKey(foreign.getNsURI())) {
					packageRegistry.put(foreign.getNsURI(), foreign);
				}
			}
		}
	}
	
	

	private void generateAPI(final IProject project, final IFolder apiPackage, final GTRuleSet gtRuleSet,
			final Registry packageRegistry) {
		JavaFileGenerator generator = new JavaFileGenerator(getClassNamePrefix(project), project.getName(), createEClassifierManager(packageRegistry));
		IFolder matchesPackage = ensureFolderExists(apiPackage.getFolder("matches"));
		IFolder rulesPackage = ensureFolderExists(apiPackage.getFolder("rules"));
		gtRuleSet.getRules().forEach(gtRule -> {
			generator.generateMatchClass(matchesPackage, gtRule);
			generator.generateRuleClass(rulesPackage, gtRule);
		});

		generator.generateAPIClass(apiPackage, gtRuleSet,
				String.format("%s/%s/%s/api/ibex-patterns.xmi", project.getName(), "src-gen", project.getName()));
		generator.generateAppClass(apiPackage);
		collectEngineExtensions().forEach(e -> generator.generateAppClassForEngine(apiPackage, e));
	}
	
	private void updateManifest(final IProject project, final BiFunction<IProject, Manifest, Boolean> updateFunction) {
		try {
			new ManifestFileUpdater().processManifest(project, manifest -> updateFunction.apply(project, manifest));
		} catch (CoreException e) {
			logger.error("Failed to update MANIFEST.MF.");
		}
	}
	
	private boolean processManifestForPackage(IProject project, Manifest manifest) {
		List<String> dependencies = new ArrayList<String>();
		dependencies.addAll(Arrays.asList("org.emoflon.ibex.common", "org.emoflon.ibex.gt"));
		collectEngineExtensions().forEach(engine -> dependencies.addAll(engine.getDependencies()));

		boolean changedBasics = ManifestFileUpdater.setBasicProperties(manifest, project.getName());
		if (changedBasics) {
			logger.info("Initialized MANIFEST.MF.");
		}

		boolean updatedDependencies = ManifestFileUpdater.updateDependencies(manifest, dependencies);
		if (updatedDependencies) {
			logger.info("Updated dependencies");
		}

		return changedBasics || updatedDependencies;
	}
	
	private Collection<GTEngineExtension> collectEngineExtensions() {
		return ExtensionsUtil.collectExtensions(GTEngineExtension.BUILDER_EXTENSON_ID, "class",
				GTEngineExtension.class);
	}
	
	private Collection<GTBuilderExtension> collectEngineBuilderExtensions() {
		return ExtensionsUtil.collectExtensions(GTBuilderExtension.BUILDER_EXTENSON_ID, "class", GTBuilderExtension.class)
				.stream()
				.filter(ext -> ext.getClass().getCanonicalName().contains("HiPE"))
				.collect(Collectors.toList());
	}
	
	private String getClassNamePrefix(final IProject project) {
		return project.getName();
	}
	
	private IFolder ensureFolderExists(final IFolder folder) {
		if (!folder.exists()) {
			try {
				folder.create(true, true, null);
			} catch (CoreException e) {
				logger.error("Could not create folder " + folder.getName() + ".");
			}
		}
		return folder;
	}

	private EClassifiersManager createEClassifierManager(final Registry packageRegistry) {
		EClassifiersManager eClassifiersManager = new EClassifiersManager(new HashMap<>());
		packageRegistry.values().forEach(obj -> {
			EPackage epackage = (EPackage) obj;
			eClassifiersManager.loadMetaModelClasses(epackage.eResource());
		});
		return eClassifiersManager;
	}

	/**
	 * The cleans generated code and problem markers
	 */
	@Override
	protected void clean(final IProgressMonitor monitor) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Cleaning " + getProject(), 2);
		
//		GeneratorUtils.removeGeneratedCode(getProject(), "src-gen/**");
		subMon.worked(0);

		super.clean(monitor);
		subMon.worked(1);
	}

	private static void createFoldersIfNecessary(final IProject project, final IProgressMonitor monitor)
			throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating folders within project " + project, 4);

		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getSourceFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getBinFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getModelFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder("src-gen"), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder("src-gen/"+project.getName().replace(".", "/")+"/api"), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder("src-gen/"+project.getName().replace(".", "/")+"/api/matches"), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder("src-gen/"+project.getName().replace(".", "/")+"/api/rules"), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder("instances"), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder("instances/simulation_definitions"), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder("instances/simulation_results"), subMon.split(1));
	}

	

}
