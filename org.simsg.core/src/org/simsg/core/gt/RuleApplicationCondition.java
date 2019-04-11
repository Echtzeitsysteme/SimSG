package org.simsg.core.gt;

import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.simulation.SimulationState;

import GTLanguage.GTRule;
import SimulationDefinition.impl.RuleAnnotationImpl;

public abstract class RuleApplicationCondition extends RuleAnnotationImpl {

	protected SimulationState state;
	protected GraphTransformationEngine gt;
	
	protected RuleApplicationCondition(GTRule rule) {
		this.gtRule = rule;
	}
	
	public abstract boolean checkCondition(SimSGMatch match);
	
	public void setState(SimulationState state) {
		this.state = state;
	}
	
	public void setGT(GraphTransformationEngine gt) {
		this.gt = gt;
	}
}
