package org.simsg.core.simulation.condition;

import org.simsg.core.simulation.SimulationProcess;
import org.simsg.core.simulation.SimulationState;

import SimulationDefinition.impl.TerminationConditionImpl;

public abstract class TerminationCondition extends TerminationConditionImpl{
	
	protected int debugLevel = SimulationProcess.CONSOLE_LEVEL_NONE;
	protected final SimulationState state;
	
	protected TerminationCondition(SimulationState state) {
		this.state = state;
	}
	
	public abstract boolean isTerminated();

	public void setConsoleInfoLevel(int level) {
		debugLevel = level;
	}
	
}
