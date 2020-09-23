package org.simsg.core.gt;

import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRule;
import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.simulation.SimulationState;

public abstract class RuleApplicationCondition extends RuleAnnotation{

	protected SimulationState state;
	protected PatternMatchingEngine engine;
	
	protected RuleApplicationCondition(final IBeXRule ibexRule) {
		super(ibexRule);
	}
	
	public abstract boolean checkCondition(SimSGMatch match);
	
	public void setState(final SimulationState state) {
		this.state = state;
	}
	
	public void setEngine(final PatternMatchingEngine engine) {
		this.engine = engine;
	}
}
