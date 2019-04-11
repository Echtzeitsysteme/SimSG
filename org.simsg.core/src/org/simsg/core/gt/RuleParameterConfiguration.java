package org.simsg.core.gt;

import org.simsg.core.simulation.SimulationState;

import SimulationDefinition.impl.RuleAnnotationImpl;

public abstract class RuleParameterConfiguration extends RuleAnnotationImpl {

	protected SimulationState state;
	
	protected RuleParameterConfiguration(SimulationState state) {
		this.state = state;
	}
	
	public abstract void configureParameter();
}
