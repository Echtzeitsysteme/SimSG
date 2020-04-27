package org.simsg.ui.build;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;

public interface ModelBuilderExtension {
	
	static final String BUILDER_EXTENSON_ID = "org.simsg.ui.build.ModelBuilderExtension";
	
	public void run(final IProject project, final IProgressMonitor monitor);
	
}
