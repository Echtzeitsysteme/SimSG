package org.simsg.core.simulation.statistic;

import org.simsg.core.simulation.SimulationState;


public abstract class SimulationStatistics {
	
	protected final SimulationState state;
	
	public SimulationStatistics(SimulationState state) {
		this.state = state;
	}
	
	public abstract void logCurrentState();
	
	public void display() {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				displayStatistics();
			}
		});
		
		t.run();
	}
	
	protected abstract void displayStatistics();
	
	protected abstract void saveStatistics();
}
