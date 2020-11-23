package org.simsg.core.simulation;

public interface SimulationProcess extends Runnable {
	
	final public static int CONSOLE_LEVEL_DEBUG = 0;
	final public static int CONSOLE_LEVEL_INFO = 1;
	final public static int CONSOLE_LEVEL_NONE = 2;
	
	public void setConsoleInfoLevel(int level);
	
	public void setProcessID(long id);
	
	public long getProcessID();

	public void initialize();
	
	public void pause();
	
	public void unpause();
	
	public void displayResults(boolean timeOnXAxis);
	
	public void displayVisualizations();
	
	public String saveResultsToFile();
	
	public boolean isTerminated();
	
	public void finish();

}
