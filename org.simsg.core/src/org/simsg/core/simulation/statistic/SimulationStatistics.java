package org.simsg.core.simulation.statistic;

import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.simulation.SimulationState;


public abstract class SimulationStatistics {
	
	protected final SimulationState state;
	protected final PersistenceManager persistence;
	
	public SimulationStatistics(final SimulationState state, final PersistenceManager persistence) {
		this.state = state;
		this.persistence = persistence;
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
	
	public abstract String saveStatistics();
}
