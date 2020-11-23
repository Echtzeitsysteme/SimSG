package org.simsg.core.simulation;

public interface SimulationProcess extends Runnable {
	
	final public static int CONSOLE_LEVEL_DEBUG = 0;
	final public static int CONSOLE_LEVEL_INFO = 1;
	final public static int CONSOLE_LEVEL_NONE = 2;
	
	public abstract void setConsoleInfoLevel(int level);

	public abstract void initialize();
	
	public abstract void pause();
	
	public abstract void unpause();
	
	public abstract boolean isTerminated();
	
	public abstract void finish();
	
	public abstract void displayResults(boolean timeOnXAxis);
	
	public abstract void displayVisualizations();

}
