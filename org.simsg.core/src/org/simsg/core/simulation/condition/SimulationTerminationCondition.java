package org.simsg.core.simulation.condition;

import org.simsg.core.simulation.SimulationState;
import org.simsg.simsgl.simSGL.SimSGLModel;
import org.simsg.simsgl.utils.PatternContainer;

public abstract class SimulationTerminationCondition {
	
	final public static double MAX_ELAPSED_TIME = Double.MAX_VALUE;
	final public static int MAX_ITERATIONS = Integer.MAX_VALUE;
	
	protected int maxIterations;
	protected double maxElapsedTime;
	
	protected SimulationTerminationCondition() {
		maxIterations = MAX_ITERATIONS;
		maxElapsedTime = MAX_ELAPSED_TIME;
	}
	
	public void setMaxIterations(int maxIterations) {
		this.maxIterations = maxIterations;
	}
	
	public void setMaxElapsedTime(double maxElapsedTime) {
		this.maxElapsedTime = maxElapsedTime;
	}
	
	public abstract void initCondition(PatternContainer patternContainer, SimSGLModel ruleModel);
	
	public abstract boolean isTerminated(SimulationState state);
	
}
