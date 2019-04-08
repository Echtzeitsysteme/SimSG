package org.simsg.core.simulation.service;

import org.simsg.core.gt.GraphTransformationEngine;
import org.simsg.core.gt.mgt.ModelGraphTransformer;
import org.simsg.core.simulation.SimulationState;

public abstract class ServiceRoutine {
	protected final SimulationState state;
	
	public ServiceRoutine(SimulationState state) {
		this.state = state;
	}
	
	public abstract void setAdditionalParameters(Object ... params);
	
	public abstract boolean performService(GraphTransformationEngine gt);
}
