package org.simsg.core.gt;

import org.simsg.core.simulation.SimulationState;

import GTLanguage.GTRule;
import SimulationDefinition.impl.RuleAnnotationImpl;

public abstract class RuleParameterConfiguration extends RuleAnnotationImpl {
	
	protected SimulationState state;
	protected GraphTransformationEngine gt;
	
	protected RuleParameterConfiguration(GTRule rule) {
		this.gtRule = rule;
	}
	
	//TODO: This doesn't work -> an object of this class must know the GraphTransformationRule object to its corresponding gt rule
	// Problem: This is kind of very specific to IBeXGT..
	// Question: Should all GTEngines provide some kind of parameterized rule? Is this a standard? Furthermore, how to generalize that?
	public abstract void configureParameter();
	
	public void setState(SimulationState state) {
		this.state = state;
	}
	
	public void setGT(GraphTransformationEngine gt) {
		this.gt = gt;
	}
}
