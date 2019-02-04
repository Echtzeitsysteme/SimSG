package org.simsg.core.simulation.condition;

import org.simsg.core.simulation.SimulationState;

public abstract class TerminationCondition {
	
	protected final SimulationState state;
	
	protected TerminationCondition(SimulationState state) {
		this.state = state;
	}
	
	public abstract boolean isTerminated();
	
}
