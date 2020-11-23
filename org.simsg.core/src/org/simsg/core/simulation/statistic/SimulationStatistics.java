package org.simsg.core.simulation.statistic;

import org.simsg.core.simulation.SimulationState;


public abstract class SimulationStatistics {
	
	protected final SimulationState state;
	
	public SimulationStatistics(SimulationState state) {
		this.state = state;
	}
	
	public abstract void logCurrentState();
	
	public void display(boolean timeOnXAxis) {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				displayStatistics(timeOnXAxis);
			}
		});
		
		t.run();
	}
	
	protected abstract void displayStatistics(boolean timeOnXAxis);
	
	protected abstract void saveStatistics();
}
