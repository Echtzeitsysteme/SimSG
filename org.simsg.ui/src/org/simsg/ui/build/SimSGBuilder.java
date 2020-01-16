package org.simsg.ui.build;

import GTLanguage.GTRuleSet;
import IBeXLanguage.IBeXPatternSet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.jar.Manifest;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.moflon.core.plugins.manifest.ManifestFileUpdater;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.emf.codegen.resource.GenModelResource;

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
						resource.copy(project.getFile("src-gen/"+project.getName().replace(".", "/")+"/api/gt-rules.xmi").getFullPath(), false, monitor);
					}
					if(content instanceof IBeXPatternSet) {
						resource.copy(project.getFile("src-gen/"+project.getName().replace(".", "/")+"/api/ibex-patterns.xmi").getFullPath(), false, monitor);
					}
				} catch (IOException e) {
					logger.error("Could not load resource. Error: \n" + e.getMessage());
				}
				
				if(gtRules == null)
					continue;
				
				IFolder apiPackage = project.getFolder("src-gen/"+project.getName().replace(".", "/")+"/api");
				final Registry packageRegistry = gtRules.eResource().getResourceSet().getPackageRegistry();
				IBeXUtils.findAllEPackages(gtRules, packageRegistry);
				
				IBeXUtils.generateAPI(project, apiPackage, gtRules, packageRegistry);
				updateManifest(project, this::processManifestForPackage);
			}
		}
		subMon.worked(6);
		
		IFolder packagePath = project.getFolder(project.getName().replace(".", "/"));
		// build HiPE engine code
		IBeXUtils.collectEngineBuilderExtensions().forEach(ext->ext.run(project, packagePath.getProjectRelativePath()));
		subMon.worked(7);
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
		dependencies.addAll(Arrays.asList("org.emoflon.ibex.common", "org.emoflon.ibex.gt", "org.simsg.core", "SimulationDefinition"));
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
