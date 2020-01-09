package org.simsg.build;

import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.gervarro.eclipse.workspace.util.AntPatternCondition;
import org.moflon.core.build.AbstractVisitorBuilder;
import org.moflon.core.build.CleanVisitor;
import org.moflon.core.utilities.ErrorReporter;
import org.moflon.core.utilities.WorkspaceHelper;

/**
 * This builder triggers a basic code generation workflow for all Ecore models
 * in /model
 *
 */
public class SimSGBuilder extends AbstractVisitorBuilder {
	public static final Logger logger = Logger.getLogger(SimSGBuilder.class);
	
	public static final String DEFAULT_SRC_FOLDER = "src";
	public static final String DEFAULT_RULE_MODEL_LOCATION = "**/api/gt-rules.xmi";
	public static final String DEFAULT_PATTERN_MODEL_LOCATION = "**/api/ibex-patterns.xmi";

	private static final String SIMSG_BUILDER_ID = "org.simsg.build.SimSGBuilder";
	
	protected String ruleModelLocation;
	protected String patternModelLocation;

	/**
	 * Initializes the visitor condition
	 *
	 * This builder gets triggered whenever any ecore file in /models changes
	 */
	public SimSGBuilder() {
		//TODO: Change patterns to adequate build triggers, e.g., *.gt changes, etc..
		super(new AntPatternCondition(new String[] { "model/*.ecore", "src/**/*.gt", "**/api/gt-rules.xmi", "**/api/ibex-patterns.xmi" }));
		ruleModelLocation = DEFAULT_RULE_MODEL_LOCATION;
		patternModelLocation = DEFAULT_PATTERN_MODEL_LOCATION;
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

		deleteProblemMarkers();
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

	@Override
	protected void processResource(IResource resource, final int kind, Map<String, String> args,
			final IProgressMonitor monitor) {
		//TODO: Build simsg code
		logger.info("Building SimSGProject: "+resource.getName());
		
		// Build meta-model code
		if(WorkspaceHelper.isFile(resource) && resource.getName().endsWith(".ecore")) {
			
		}
		
		// Build eMoflon-api code and generate gt-rule & ibex-pattern models
		if(WorkspaceHelper.isFile(resource) && resource.getName().endsWith(".gt")) {
			
		}
		
		// Build eMoflon-api code
		if(WorkspaceHelper.isFile(resource) && resource.getName().endsWith("gt-rules.xmi")) {
			
		}
		
//		if (WorkspaceHelper.isXcoreFile(resource))
//			resource = convertXcoreToEcore(resource);
//
//		if (WorkspaceHelper.isEcoreFile(resource))
//			buildEcoreFile(resource, monitor);
	}

	@Override
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
				new AntPatternCondition(new String[] { "src-gen/**" }), //
				new AntPatternCondition(new String[] { ruleModelLocation, patternModelLocation }));
		project.accept(cleanVisitor, IResource.DEPTH_INFINITE, IResource.NONE);
	}


	private static void createFoldersIfNecessary(final IProject project, final IProgressMonitor monitor)
			throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating folders within project " + project, 4);

		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getSourceFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getBinFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getGenFolder(project), subMon.split(1));
	}

}
