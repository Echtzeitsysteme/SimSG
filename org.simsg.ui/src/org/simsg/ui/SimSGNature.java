package org.simsg.ui;

import org.moflon.core.build.nature.MoflonProjectConfigurator;
import org.simsg.ui.build.SimSGBuilder;

/**
 * Nature for SimSG projects
 *
 */
public class SimSGNature extends MoflonProjectConfigurator {
	private static final String SIMSG_NATURE_ID = "org.simsg.build.SimSGNature";

	@Override
	protected String getBuilderId() {
		return SimSGBuilder.getId();
	}

	@Override
	protected String getNatureId() {
		return SIMSG_NATURE_ID;
	}

	public static String getId() {
		return SIMSG_NATURE_ID;
	}

}
