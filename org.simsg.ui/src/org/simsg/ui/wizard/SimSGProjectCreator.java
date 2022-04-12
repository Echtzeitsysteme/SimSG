package org.simsg.ui.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.ui.util.PluginProjectFactory;
import org.emoflon.ibex.gt.editor.ui.wizard.GTProjectCreator;

/**
 * Creator for SimSG projects (see {@link SimSGNature})
 * 
 */
public class SimSGProjectCreator extends GTProjectCreator {
	@Override
	protected IProject createProject(IProgressMonitor monitor) {
		IProject project = super.createProject(monitor);
		try {
			addNatureIfNotExists(project, SimSGNature.GT_NATURE_ID);
			addNatureIfNotExists(project, SimSGNature.NATURE_ID);
			enhanceProject(project, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}

		return project;
	}

	@Override
	protected void enhanceProject(final IProject project, final IProgressMonitor monitor) throws CoreException {
		EclipseResourceFileSystemAccess2 access = new EclipseResourceFileSystemAccess2();
		access.setMonitor(monitor);
		SimSGNewFileInitialContents initialContents = new SimSGNewFileInitialContents();
		initialContents.generateInitialContents(access, project);
		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	@Override
	protected PluginProjectFactory createProjectFactory() {
		PluginProjectFactory ppf = new PluginProjectFactory();
		ppf.setWorkspace(ResourcesPlugin.getWorkspace());
		return ppf;
	}
}
