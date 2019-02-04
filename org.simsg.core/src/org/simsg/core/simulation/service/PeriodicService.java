package org.simsg.core.simulation.service;

import org.simsg.core.simulation.SimulationState;

public class PeriodicService extends ServiceRoutine {
	
	private double servicePeriod = 0;

	public PeriodicService(SimulationState state) {
		super(state);
	}
	
	public void setServicePeriod(double servicePeriod) {
		this.servicePeriod = servicePeriod;
	}

	@Override
	public void performService() {
		// TODO Auto-generated method stub

	}

}
