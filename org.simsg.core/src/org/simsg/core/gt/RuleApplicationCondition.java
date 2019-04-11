package org.simsg.core.gt;

import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.simulation.SimulationState;

import SimulationDefinition.impl.RuleAnnotationImpl;

public abstract class RuleApplicationCondition extends RuleAnnotationImpl {
	
	protected SimulationState state;
	
	protected RuleApplicationCondition(SimulationState state) {
		this.state = state;
	}
	
	public abstract boolean checkCondition(SimSGMatch match);
}
