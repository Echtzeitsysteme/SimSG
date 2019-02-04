package org.simsg.core.simulation.condition;

import org.simsg.core.simulation.SimulationState;

public class SimpleTerminationCondition extends TerminationCondition {
	
	final public static double MAX_ELAPSED_TIME = Double.MAX_VALUE;
	final public static int MAX_ITERATIONS = Integer.MAX_VALUE;
	
	protected int maxIterations = MAX_ITERATIONS;
	protected double maxElapsedTime = MAX_ELAPSED_TIME;

	public SimpleTerminationCondition(SimulationState state) {
		super(state);
	}
	
	public void setMaxIterations(int maxIterations) {
		this.maxIterations = maxIterations;
	}
	
	public void setMaxElapsedTime(double maxElapsedTime) {
		this.maxElapsedTime = maxElapsedTime;
	}

	@Override
	public boolean isTerminated() {
		return (state.getIterations()>=maxIterations) || (state.getTime() >= maxElapsedTime);
	}

}
