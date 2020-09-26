package org.simsg.core.gt;

import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRule;
import org.simsg.core.simulation.SimulationState;

public abstract class RuleParameterConfiguration extends RuleAnnotation{
	
	protected SimulationState state;
	protected GraphTransformationEngine gt;
	
	protected RuleParameterConfiguration(final IBeXRule ibexRule) {
		super(ibexRule);
	}
	
	//TODO: This doesn't work -> an object of this class must know the GraphTransformationRule object to its corresponding gt rule
	// Problem: This is kind of very specific to IBeXGT..
	// Question: Should all GTEngines provide some kind of parameterized rule? Is this a standard? Furthermore, how to generalize that?
	public abstract void configureParameter();
	
	public void setState(final SimulationState state) {
		this.state = state;
	}
	
	public void setGT(final GraphTransformationEngine gt) {
		this.gt = gt;
	}
}
