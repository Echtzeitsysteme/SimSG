package org.simsg.core.simulation.condition;

import org.simsg.core.simulation.SimulationState;

public class SimpleTerminationCondition extends TerminationCondition implements SimulationDefinition.SimpleTerminationCondition {
	
	final public static double NO_TIME_LIMIT = -1;
	final public static int NO_ITERATION_LIMIT = -1;
	
	protected int maxIterations = NO_ITERATION_LIMIT;
	protected double maxElapsedTime = NO_TIME_LIMIT;

	public SimpleTerminationCondition(SimulationState state) {
		super(state);
	}
	
	public SimpleTerminationCondition(SimulationState state, SimulationDefinition.SimpleTerminationCondition other) {
		super(state);
		maxIterations = other.getMaxIterations();
		maxElapsedTime = other.getMaxSimulationTime();
	}
	
	public void setMaxIterations(int maxIterations) {
		this.maxIterations = maxIterations;
	}
	
	public void setMaxElapsedTime(double maxElapsedTime) {
		this.maxElapsedTime = maxElapsedTime;
	}

	@Override
	public boolean isTerminated() {
		if(maxIterations != NO_ITERATION_LIMIT && state.getIterations()>=maxIterations) {
			return true;
		}
		if(maxElapsedTime != NO_TIME_LIMIT && state.getTime() >= maxElapsedTime) {
			return true;
		}
		return false;
	}

	@Override
	public int getMaxIterations() {
		return maxIterations;
	}

	@Override
	public double getMaxSimulationTime() {
		return maxElapsedTime;
	}

	@Override
	public void setMaxSimulationTime(double value) {
		maxElapsedTime = value;
	}

}
