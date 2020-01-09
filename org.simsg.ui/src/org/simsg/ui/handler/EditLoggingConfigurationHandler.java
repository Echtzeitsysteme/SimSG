package org.simsg.ui.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.moflon.core.ui.AbstractCommandHandler;
import org.moflon.core.ui.UiUtilities;
import org.simsg.ui.SimSGUiActivator;

/**
 * Opens the SimSG logging configuration file for editing.
 */
public class EditLoggingConfigurationHandler extends AbstractCommandHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		openConfigFileInEditor(window);
		return null;
	}

	public void openConfigFileInEditor(final IWorkbenchWindow window) {
		UiUtilities.openFileInEditor(window, SimSGUiActivator.getDefault().getConfigFile());
	}
}
