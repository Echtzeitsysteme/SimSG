package org.simsg.core.simulation;

public interface SimulationProcess extends Runnable {

	public abstract void initialize();
	
	public abstract void pause();
	
	public abstract void unpause();
	
	public abstract boolean isTerminated();
	
	public abstract void finish();
	
	public abstract void displayResults();
	
	public abstract void displayVisualizations();

}
