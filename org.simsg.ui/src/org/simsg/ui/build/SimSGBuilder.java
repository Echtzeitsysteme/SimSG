package org.simsg.ui.build;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.jar.Manifest;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.emoflon.ibex.gt.codegen.EClassifiersManager;
import org.emoflon.ibex.gt.codegen.GTDependingBuilderExtension;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXModel;
import org.moflon.core.plugins.manifest.ManifestFileUpdater;

/**
 * This builder triggers a basic code generation workflow for all Ecore models
 * in /model
 *
 */
public class SimSGBuilder implements GTDependingBuilderExtension {
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
	public final static String PACKAGE_IBEX_PATTERNMODEL = "org.emoflon.ibex.patternmodel";
	public final static String PACKAGE_SIMULATION_DEFINITION = "SimulationDefinition";

	public static final String SIMSG_BUILDER_ID = "org.simsg.build.SimSGBuilder";

	public static final int BUILDSTEP_MODELBUILDER = 0;
	public static final int BUILDSTEP_API_FROM_GT = 1;
	public static final int BUILDSTEP_API_FROM_MODEL = 2;

	private IProject project;
	private IBeXModel ibexModel;
	private IPath packagePath;
	private String packageName;
	private String projectName;
	private String apiResourcesLocation;

	@Override
	public void run(IProject project, IPath packagePath, IBeXModel ibexModel) {

		this.project = project;
		this.ibexModel = ibexModel;
		this.packagePath = packagePath;
		setConstants();
		try {
			fullBuild();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private void setConstants() {
		projectName = project.getName();
		packageName = packagePath.toString().replace("/", ".");
		apiResourcesLocation = "src-gen/" + projectName.replace(".", "/") + "/api";
	}

	public static String getId() {
		return SIMSG_BUILDER_ID;
	}

	protected void fullBuild() throws CoreException {
		// create models
		runModelBuilders(project);
		buildFromGT();

		updateManifest(project, this::processManifestForPackage);
	}

	protected void buildFromGT() throws CoreException {
		// build SimSG API code for each rule package
		String genPkgLocation = apiResourcesLocation;
		IFolder apiPackage = project.getFolder(genPkgLocation);
		String apiPackageName = packageName + ".api";
		String classPrefix = getClassNamePrefix();
		final Registry packageRegistry = new EPackageRegistryImpl();
		IBeXUtils.findAllEPackages(ibexModel, packageRegistry);
		EClassifiersManager ecManager = IBeXUtils.createEClassifierManager(packageRegistry);
		SimSGAPIBuilder.buildAPI(apiPackage.getFile(classPrefix + "SimSGApi.java"), apiPackageName, classPrefix,
				ecManager);

	}

	private void runModelBuilders(final IProject project) {
		IBeXUtils.collectModelBuilderExtensions().forEach(ext -> ext.run(project, new NullProgressMonitor()));
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

		dependencies.addAll(Arrays.asList(PACKAGE_SIMSG_CORE, PACKAGE_SIMULATION_DEFINITION));

		boolean updatedDependencies = ManifestFileUpdater.updateDependencies(manifest, dependencies);
		if (updatedDependencies) {
			logger.info("Updated dependencies");
		}

		return updatedDependencies;
	}

	private String getClassNamePrefix() {
		String lastSegment = packagePath.lastSegment();
		if (packagePath.segmentCount() == 0 || lastSegment.length() == 0) {
			return project.getName();
		}
		return Character.toUpperCase(lastSegment.charAt(0)) + lastSegment.substring(1);
	}

}
