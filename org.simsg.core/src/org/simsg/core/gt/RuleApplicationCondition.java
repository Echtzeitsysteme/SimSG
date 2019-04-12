package org.simsg.core.gt;

import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.simulation.SimulationState;

import GTLanguage.GTRule;
import SimulationDefinition.impl.RuleAnnotationImpl;

public abstract class RuleApplicationCondition extends RuleAnnotationImpl {

	protected SimulationState state;
	protected PatternMatchingEngine engine;
	
	protected RuleApplicationCondition(GTRule rule) {
		this.gtRule = rule;
	}
	
	public abstract boolean checkCondition(SimSGMatch match);
	
	public void setState(SimulationState state) {
		this.state = state;
	}
	
	public void setEngine(PatternMatchingEngine engine) {
		this.engine = engine;
	}
}
