package org.simsg.core.simulation.condition;

import org.simsg.core.simulation.SimulationState;

import SimulationDefinition.impl.TerminationConditionImpl;

public abstract class TerminationCondition extends TerminationConditionImpl{
	
	protected final SimulationState state;
	
	protected TerminationCondition(SimulationState state) {
		this.state = state;
	}
	
	public abstract void setAdditionalParameters(Object ... params);
	
	public abstract boolean isTerminated();
	
}
