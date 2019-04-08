package org.simsg.core.gt;

import org.eclipse.emf.ecore.resource.Resource;
import org.simsg.core.pm.match.SimSGMatch;

import SimulationDefinition.SimDefinition;

abstract public class GraphTransformationEngine {
	
	protected SimDefinition simulationDefinition;
	protected Resource simulationModel;
	
	public abstract void setAdditionalParameters(Object ... params);
	
	public void setModels(SimDefinition simulationDefinition, Resource simulationModel) {
		this.simulationDefinition = simulationDefinition;
		this.simulationModel = simulationModel;
	}
	
	public SimDefinition getSimulationDefinion() {
		return simulationDefinition;
	}
	
	public Resource getSimulationModel() {
		return simulationModel;
	}
	
	public abstract void init();
	
	public abstract void applyRuleToMatch(SimSGMatch match);
}
