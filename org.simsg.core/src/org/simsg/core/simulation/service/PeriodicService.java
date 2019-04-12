package org.simsg.core.simulation.service;

import org.simsg.core.gt.GraphTransformationEngine;
import org.simsg.core.simulation.SimulationState;

public abstract class PeriodicService extends ServiceRoutine {
	
	private double servicePeriod = 0;
	private double lastService = 0;

	public PeriodicService(SimulationState state, GraphTransformationEngine gt, double servicePeriod) {
		super(state, gt);
		this.servicePeriod = servicePeriod;
	}
	
	public void setServicePeriod(double servicePeriod) {
		this.servicePeriod = servicePeriod;
	}

	@Override
	public boolean performService() {
		if(state.peekNextEvent() == null) return false;
		
		double nextEventTime = state.peekNextEvent().time;
		if((nextEventTime-lastService) < servicePeriod && state.getTime() > 0) {
			return false;
		}
		
		if(state.getTime() > 0) {
			lastService = lastService+servicePeriod;
			state.setTime(lastService);
		}
		
		return servicePeriod();
	}
	
	public abstract boolean servicePeriod();

}
