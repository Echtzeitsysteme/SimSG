package org.simsg.ui.wizard;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.moflon.core.plugins.PluginProperties;
import org.simsg.ui.build.SimSGBuilder;
import org.simsg.ui.AbstractSimSGProjectCreator;
import org.simsg.ui.SimSGNature;

/**
 * Creator for SimSG projects (see {@link SimSGNature})
 * 
 */
public class SimSGProjectCreator extends AbstractSimSGProjectCreator {
	private static final List<String> GITIGNORE_LINES = Arrays.asList(//
			"/bin", //
			"/gen"); //

	/**
	 * Pass-through constructor to {@link SimSGProjectCreator}
	 * 
	 * @param project
	 *                                the project to create
	 * @param projectProperties
	 *                                the metadata to use
	 * @param projectConfigurator
	 *                                the project configurator
	 */
	public SimSGProjectCreator(final IProject project, final PluginProperties projectProperties,
			final SimSGNature projectConfigurator) {
		super(project, projectProperties, projectConfigurator);
	}

	@Override
	protected List<String> getGitignoreLines() {
		return GITIGNORE_LINES;
	}

	@Override
	protected String getNatureId() throws CoreException {
		return SimSGNature.getId();
	}

	@Override
	protected String getBuilderId() throws CoreException {
		return SimSGBuilder.getId();
	}

}
