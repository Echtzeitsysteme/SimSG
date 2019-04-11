package org.simsg.core.gt;

import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.simulation.SimulationState;

import SimulationDefinition.impl.RuleAnnotationImpl;

public abstract class PostApplicationAction extends RuleAnnotationImpl {
	
	protected SimulationState state;
	
	protected PostApplicationAction(SimulationState state) {
		this.state = state;
	}
	
	public abstract void applyAction(SimSGMatch match);
}
