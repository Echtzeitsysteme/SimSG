package org.simsg.core.simulation.condition;

import org.simsg.core.simulation.SimulationState;

public class SimpleTerminationCondition extends TerminationCondition implements SimulationDefinition.SimpleTerminationCondition {
	
	final public static double NO_TIME_LIMIT = -1;
	final public static int NO_ITERATION_LIMIT = -1;
	
	protected int maxIterations = NO_ITERATION_LIMIT;
	protected double maxElapsedTime = NO_TIME_LIMIT;
	
	protected double iStep = maxIterations/100.0;
	protected double tStep = maxElapsedTime/100.0;
	
	protected int iterations = 0;
	protected double time = 0.0; 

	public SimpleTerminationCondition(SimulationState state) {
		super(state);
	}
	
	public SimpleTerminationCondition(SimulationState state, SimulationDefinition.SimpleTerminationCondition other) {
		super(state);
		maxIterations = other.getMaxIterations();
		maxElapsedTime = other.getMaxSimulationTime();
		iStep = maxIterations/100.0;
		tStep = maxElapsedTime/100.0;
	}
	
	public void setMaxIterations(int maxIterations) {
		this.maxIterations = maxIterations;
		iStep = maxIterations/100.0;
	}
	
	public void setMaxElapsedTime(double maxElapsedTime) {
		this.maxElapsedTime = maxElapsedTime;
		tStep = maxElapsedTime/100.0;
	}

	@Override
	public boolean isTerminated() {
		if(maxIterations != NO_ITERATION_LIMIT) {
			int delta = state.getIterations()-iterations;
			if(delta >= iStep) {
				iterations += delta;
				System.out.println("Completed: "+ ((double)iterations/maxIterations)*100.0 + "%, "
				+ state.getIterations() +" iterations, " + state.getTime() + " ms sim time.");
			}
		}
		if(maxElapsedTime != NO_TIME_LIMIT) {
			double delta = state.getTime()-time;
			if(delta >= tStep) {
				time += delta;
				System.out.println("Completed: "+ (time/maxElapsedTime)*100.0 + "%, "
				+ state.getIterations() +" iterations, " + state.getTime() + " ms sim time.");
			}
		}
		
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
