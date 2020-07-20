package org.simsg.ui.build;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.jar.Manifest;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IBuildConfiguration;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.importer.ecore.EcoreImporter;
import org.emoflon.ibex.gt.codegen.EClassifiersManager;
import org.emoflon.ibex.gt.editor.ui.builder.GTBuilder;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternSet;
import org.moflon.core.plugins.manifest.ManifestFileUpdater;
import org.moflon.core.utilities.ClasspathUtil;
import org.moflon.core.utilities.WorkspaceHelper;

import GTLanguage.GTRuleSet;

/**
 * This builder triggers a basic code generation workflow for all Ecore models
 * in /model
 *
 */
public class SimSGBuilder extends IncrementalProjectBuilder {
	public static final Logger logger = Logger.getLogger(SimSGBuilder.class);

	public static final String DEFAULT_SRC_LOCATION = "src";
	public static final String DEFAULT_METAMODEL_LOCATION = "model";

	public static final String DEFAULT_INSTANCES_LOCATION = "instances";
	public static final String DEFAULT_DEFINITION_LOCATION = "instances/simulation_definitions";
	public static final String DEFAULT_MODEL_LOCATION = "instances/simulation_instances";
	public static final String DEFAULT_RESULTS_LOCATION = "instances/simulation_results";

	public final static String PACKAGE_IBEX_COMMON = "org.emoflon.ibex.common";
	public final static String PACKAGE_IBEX_GT = "org.emoflon.ibex.gt";
	public final static String PACKAGE_SIMSG_CORE = "org.simsg.core";
	public final static String PACKAGE_SIMULATION_DEFINITION = "SimulationDefinition";

	public static final String SIMSG_BUILDER_ID = "org.simsg.build.SimSGBuilder";

	private IFolder srcFolder;
	private IFolder metaModelFolder;
//	private IFolder modelFolder;

	private IProject project;
	private String projectName;
	private String projectGenFolder;
	private String apiResourcesLocation;
	private String gtRulesLocation;
	private String ibexPatternsLocation;

	/**
	 * Initializes the visitor condition
	 *
	 * This builder gets triggered whenever any ecore file in /models changes
	 */
	public SimSGBuilder() {
	}
	
	private void setConstants(IProject project) {
		projectName = project.getName();
		projectGenFolder = projectName + "/gen/";
		apiResourcesLocation = "src-gen/" + projectName.replace(".", "/") + "/api";
		gtRulesLocation = apiResourcesLocation + "/gt-rules.xmi";
		ibexPatternsLocation = apiResourcesLocation + "/ibex-patterns.xmi";
	}

	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {
		IProject project = getProject();
		setConstants(project);
		final SubMonitor subMon = SubMonitor.convert(monitor, "Building SimSGProject: " + project, 1);

		if (kind == FULL_BUILD || kind == CLEAN_BUILD) {
			fullBuild(project, monitor);
			project.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_ONE, new NullProgressMonitor());
		}
		subMon.worked(1);

		return null;
	}

	public static String getId() {
		return SIMSG_BUILDER_ID;
	}

	protected void fullBuild(final IProject project, final IProgressMonitor monitor) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Generating code: " + getProject(), 8);

		// clean old code
		GeneratorUtils.removeGeneratedCode(project, "src-gen/**");
		subMon.worked(0);

		// create necessary folders
		try {
			createFoldersIfNecessary(project, subMon.split(1));
		} catch (OperationCanceledException | CoreException e) {
			logger.error("Could not create necessary folders. Error: \n" + e.getMessage());
			return;
		}

		srcFolder = getProject().getFolder(DEFAULT_SRC_LOCATION);
		metaModelFolder = getProject().getFolder(DEFAULT_METAMODEL_LOCATION);
//		modelFolder  = getProject().getFolder(DEFAULT_MODEL_LOCATION);
		subMon.worked(1);

		// create models
		runModelBuilders(project, monitor);
		subMon.worked(2);
		
		// check if there are *.gt files in the src folder
		List<IFile> gtFiles = null;
		try {
			gtFiles = IBeXUtils.getGTFiles(srcFolder);
		} catch (CoreException e) {
			logger.error("Could find folder. Error: \n" + e.getMessage());
		}
		// IF *.gt files are present: use the standard eMoflon::GT-builder and generate API
		if(gtFiles != null && gtFiles.size()>0) {
			GTBuilder gtBuilder = new GTBuilder();
			gtBuilder.setProject(project);
			gtBuilder.buildManually(FULL_BUILD);
			
			// build SimSG API code for each rule package
			IBeXUtils.findGTFolders(srcFolder, srcFolder).forEach(pkg -> {
				String genPkgLocation = "src-gen/" + pkg.toPortableString() + "/api";
				IFolder apiPackage = project.getFolder(genPkgLocation);
				String apiPackageName = pkg.toPortableString().replace("/", ".") + ".api";
				String classPrefix = URI.createFileURI(pkg.toPortableString()).lastSegment();
				classPrefix = Character.toUpperCase(classPrefix.charAt(0)) + classPrefix.substring(1);
				final Registry packageRegistry = new EPackageRegistryImpl();
				try {
					for (IResource resource : apiPackage.members()) {
						if (WorkspaceHelper.isFile(resource) && resource.getName().endsWith(".xmi")) {
							GTRuleSet gtRules = null;
							try {
								Resource xmiResource = GeneratorUtils.loadXmi(resource);
								Object content = xmiResource.getContents().get(0);
								EcoreUtil.resolveAll(xmiResource);
								if (content instanceof GTRuleSet) {
									gtRules = (GTRuleSet) content;
									resource.copy(project.getFile(gtRulesLocation).getFullPath(), false,
											monitor);

								}
							} catch (IOException e) {
								logger.error("Could not load resource. Error: \n" + e.getMessage());
							}

							if (gtRules == null)
								continue;

							IBeXUtils.findAllEPackages(gtRules, packageRegistry);
						}
					}
				} catch (CoreException e) {
					logger.error("Could not load resource. Error: \n" + e.getMessage());
				}
				
				
				EClassifiersManager ecManager = IBeXUtils.createEClassifierManager(packageRegistry);
				SimSGAPIBuilder.buildAPI(apiPackage.getFile(classPrefix + "SimSGApi.java"), apiPackageName, classPrefix, ecManager);
			});

			
		}
		// ELSE: scan through model and metamodel folders, generate metamodel code and eMoflon API from scratch
		else {
			// build metamodel code
			for (IResource resource : metaModelFolder.members()) {
				if (WorkspaceHelper.isFile(resource) && resource.getName().endsWith(".ecore")) {
					
					final String platformURI = "platform:/resource/" + project.getName() + "/" + resource.getProjectRelativePath();
					
					Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().putIfAbsent("ecore",
							new EcoreResourceFactoryImpl());
					ResourceSet rs = new ResourceSetImpl();
					rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
					Resource modelResource = rs.getResource(URI.createURI(platformURI), true);
					EPackage metaModel = (EPackage) modelResource.getContents().get(0);
					modelResource.unload();
					try {
						generateMetaModelCode(project, (IFile) resource, metaModel);
					} catch (Exception e) {
						logger.error("Could not generate genmodel. Error: \n" + e.getMessage());
						return;
					}

				}
			}
			subMon.worked(3);

			boolean foundPatterns = false;
			boolean foundRules = false;

			final Registry packageRegistry = new EPackageRegistryImpl();
			// build eMoflon api code
			for (IResource resource : metaModelFolder.members()) {
				if (WorkspaceHelper.isFile(resource) && resource.getName().endsWith(".xmi")) {
					GTRuleSet gtRules = null;
					try {
						Resource xmiResource = GeneratorUtils.loadXmi(resource);
						Object content = xmiResource.getContents().get(0);
						EcoreUtil.resolveAll(xmiResource);
						if (content instanceof GTRuleSet) {
							gtRules = (GTRuleSet) content;
							resource.copy(project.getFile(gtRulesLocation).getFullPath(), false,
									monitor);
							foundRules = true;
						}
						if (content instanceof IBeXPatternSet) {
							resource.copy(project.getFile(ibexPatternsLocation).getFullPath(), false,
									monitor);
							foundPatterns = true;
						}
					} catch (IOException e) {
						logger.error("Could not load resource. Error: \n" + e.getMessage());
					}

					if (gtRules == null)
						continue;

					IFolder apiPackage = project.getFolder(apiResourcesLocation);
					// final Registry packageRegistry =
					// gtRules.eResource().getResourceSet().getPackageRegistry();
					IBeXUtils.findAllEPackages(gtRules, packageRegistry);

					IBeXUtils.generateAPI(project, apiPackage, gtRules, packageRegistry);
					updateManifest(project, this::processManifestForPackage);
				}
			}
			subMon.worked(7);

			// build HiPE engine code
			if (foundPatterns) {
				IFolder packagePath = project.getFolder(projectName.replace(".", "/"));
				IBeXUtils.collectEngineBuilderExtensions()
						.forEach(ext -> ext.run(project, packagePath.getProjectRelativePath()));
			}
			subMon.worked(8);

			// build SimSG API code
			if (foundRules) {
				IFolder apiPackage = project.getFolder(apiResourcesLocation);
				String apiPackageName = project.getName() + ".api";
				String classPrefix = URI.createFileURI(projectName.replace(".", "/")).lastSegment();
				classPrefix = Character.toUpperCase(classPrefix.charAt(0)) + classPrefix.substring(1);
				EClassifiersManager ecManager = IBeXUtils.createEClassifierManager(packageRegistry);
				SimSGAPIBuilder.buildAPI(apiPackage.getFile(classPrefix + "SimSGApi.java"), apiPackageName, classPrefix,
						ecManager);
			}
			subMon.worked(9);
		}
		
	}

	protected void generateMetaModelCode(IProject project, IFile modelFile, EPackage metaModel) throws Exception {
		final String pluginID = project.getName();
		final String metamodelName = metaModel.getName();

		Monitor monitor = BasicMonitor.toMonitor(new NullProgressMonitor());
		EcoreImporter importer = new EcoreImporter();
		importer.setModelFile(modelFile);
		importer.computeEPackages(monitor);
		importer.adjustEPackages(monitor);

		for (EPackage ePackage : importer.getEPackages()) {
			if (ePackage.getName().equals(metamodelName)) {
				importer.getEPackageConvertInfo(ePackage).setConvert(true);
			} else {
				importer.getEPackageConvertInfo(ePackage).setConvert(false);
			}
		}

		importer.setGenModelContainerPath(new Path(pluginID).append(DEFAULT_METAMODEL_LOCATION));
		importer.setGenModelFileName(importer.computeDefaultGenModelFileName());
		importer.prepareGenModelAndEPackages(monitor);

		GenModel genModel = importer.getGenModel();
		genModel.setModelDirectory(projectGenFolder);
		
		IBuildConfiguration[] buildConfs = project.getBuildConfigs();

		Set<GenPackage> removals = genModel.getGenPackages().stream()
				.filter(pkg -> !pkg.getEcorePackage().getName().equals(metamodelName)).collect(Collectors.toSet());
		removals.forEach(pkg -> genModel.getGenPackages().remove(pkg));
		genModel.getUsedGenPackages().addAll(removals);

		Map<String, URI> pack2genMapEnv = EcorePlugin.getEPackageNsURIToGenModelLocationMap(false);
		Map<String, URI> pack2genMapTarget = EcorePlugin.getEPackageNsURIToGenModelLocationMap(true);

		// create dummy genmodels or else the genpackages can not be found and thus
		// persisted
		for (GenPackage gp : removals) {
			// search first in environment in case that the genmodel is exported as plugin
			URI genURI = pack2genMapEnv.get(gp.getNSURI());
			if (genURI == null)
				genURI = pack2genMapTarget.get(gp.getNSURI());
			ResourceSet rs = new ResourceSetImpl();
			Resource createResource = rs.createResource(genURI);
			createResource.load(null);
			if (createResource.isLoaded()) {
				GenModel newGen = (GenModel) createResource.getContents().get(0);
				genModel.getUsedGenPackages().remove(gp);
				genModel.getUsedGenPackages().add(newGen.getGenPackages().get(0));
			} else {
				GenModel fakeGen = GenModelFactory.eINSTANCE.createGenModel();
				fakeGen.setModelPluginID(gp.getEcorePackage().getNsPrefix());
				fakeGen.getGenPackages().add(gp);
				genModel.eResource().getContents().add(fakeGen);
			}
		}

		genModel.setGenerateSchema(true);
		genModel.setCanGenerate(true);
		genModel.reconcile();

		EcoreUtil.resolveAll(importer.getGenModelResourceSet());
		genModel.eResource().save(Collections.emptyMap());

		Generator generator = GenModelUtil.createGenerator(genModel);
		generator.setInput(genModel);
		generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, monitor);
		GeneratorUtils.removeGeneratedCode(project, DEFAULT_METAMODEL_LOCATION + "/*.xsd");
		importer.dispose();
	}

	private void runModelBuilders(final IProject project, final IProgressMonitor monitor) {
		IBeXUtils.collectModelBuilderExtensions().forEach(ext -> ext.run(project, monitor));
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

		dependencies.addAll(
				Arrays.asList(PACKAGE_IBEX_COMMON, PACKAGE_IBEX_GT, PACKAGE_SIMSG_CORE, PACKAGE_SIMULATION_DEFINITION));
		IBeXUtils.collectEngineExtensions().forEach(engine -> dependencies.addAll(engine.getDependencies()));

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

	private static void createFoldersIfNecessary(final IProject project, final IProgressMonitor monitor)
			throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating folders within project " + project, 4);
		
		final String srcGenLocation = "src-gen";
		final String apiResourceLocation = "src-gen/" + project.getName().replace(".", "/") + "/api";
		final String apiMatchesLocation = apiResourceLocation + "/matches";
		final String apiRulesLocation = apiResourceLocation + "/rules";
		IFolder genFolder = WorkspaceHelper.getGenFolder(project);
		
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getSourceFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getBinFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getModelFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(genFolder, subMon.split(1));
		ClasspathUtil.makeSourceFolderIfNecessary(genFolder);
		WorkspaceHelper.createFolderIfNotExists(project.getFolder(srcGenLocation), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder(apiResourceLocation), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder(apiMatchesLocation), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder(apiRulesLocation), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder(DEFAULT_INSTANCES_LOCATION), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder(DEFAULT_DEFINITION_LOCATION), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder(DEFAULT_RESULTS_LOCATION), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder(DEFAULT_INSTANCES_LOCATION), subMon.split(1));
	}

}
