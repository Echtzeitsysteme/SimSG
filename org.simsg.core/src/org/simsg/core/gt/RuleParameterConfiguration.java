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
	
	public abstract void configureParameter();
	
	public void setState(SimulationState state) {
		this.state = state;
	}
	
	public void setGT(GraphTransformationEngine gt) {
		this.gt = gt;
	}
}
