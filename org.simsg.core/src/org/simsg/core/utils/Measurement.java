package org.simsg.core.utils;

public class Measurement {
	
	final public static double NANOSECONDS = 1E9;
	final public static int MB = 1024*1024;
	
	private Runtime runtime;
	
	private double start;
	private double end;
	private long usedMemory;
	
	public Measurement() {
		runtime = Runtime.getRuntime();
	}
	
	public void start() {
		start = System.nanoTime();
	}
	
	public void end() {
		end = System.nanoTime();
		usedMemory = (runtime.totalMemory() - runtime.freeMemory()) / MB;
	}
	
	public double durationSeconds() {
		return (end-start)/NANOSECONDS;
	}
	
	public double durationNanoSeconds() {
		return end-start;
	}
	
	public long usedMemoryMB() {
		return usedMemory;
	}
	
	@Override
	public String toString() {
		return "Execution took: "+durationSeconds()+"s ("+durationNanoSeconds()+"ns) and required "+usedMemory+"MB of memory.";
	}
}
