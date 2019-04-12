package org.simsg.core.simulation.service;

import org.simsg.core.gt.GraphTransformationEngine;
import org.simsg.core.simulation.SimulationState;

public abstract class ServiceRoutine {
	protected final SimulationState state;
	protected final GraphTransformationEngine gt;
	
	public ServiceRoutine(SimulationState state, GraphTransformationEngine gt) {
		this.state = state;
		this.gt = gt;
	}
	
	public abstract boolean performService();
}
