package org.simsg.core.gt;

import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRule;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.simulation.SimulationState;

public abstract class PostApplicationAction extends RuleAnnotation{
	
	protected SimulationState state;
	protected GraphTransformationEngine gt;
	
	protected PostApplicationAction(final IBeXRule ibexRule) {
		super(ibexRule);
	}
	
	public abstract void applyAction(SimSGMatch match);
	
	public void setState(final SimulationState state) {
		this.state = state;
	}
	
	public void setGT(final GraphTransformationEngine gt) {
		this.gt = gt;
	}
}
