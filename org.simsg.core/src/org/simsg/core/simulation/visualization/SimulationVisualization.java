package org.simsg.core.simulation.visualization;

import org.simsg.core.simulation.SimulationState;

public abstract class SimulationVisualization {
	
	protected final SimulationState state;
	
	public SimulationVisualization(SimulationState state) {
		this.state = state;
	}
	
	public abstract void setAdditionalParameters(Object ... params);
	
	public void display() {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				displayVisualization();
			}
		});
		
		t.run();
	}
	
	protected abstract void displayVisualization();
}
