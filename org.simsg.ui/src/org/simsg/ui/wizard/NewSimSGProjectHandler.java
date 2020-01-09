package org.simsg.ui.wizard;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.moflon.core.ui.AbstractCommandHandler;
import org.moflon.core.ui.UiUtilities;
import org.moflon.core.utilities.LogUtils;

public class NewSimSGProjectHandler extends AbstractCommandHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);

		try {
			UiUtilities.openWizard(NewSimSGProjectWizard.NEW_REPOSITORY_PROJECT_WIZARD_ID, window);
		} catch (final Exception e) {
			LogUtils.error(logger, e, "Unable to open '%s' wizard.",
					NewSimSGProjectWizard.NEW_REPOSITORY_PROJECT_WIZARD_ID);
		}

		return null;
	}

}
