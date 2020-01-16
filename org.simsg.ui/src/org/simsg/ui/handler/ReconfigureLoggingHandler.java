package org.simsg.ui.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.moflon.core.ui.AbstractCommandHandler;
import org.simsg.ui.SimSGUiActivator;

/**
 * Triggers a reload of the logging configuration.
 */
public class ReconfigureLoggingHandler extends AbstractCommandHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		SimSGUiActivator.getDefault().reconfigureLogging();
		return null;
	}

}
