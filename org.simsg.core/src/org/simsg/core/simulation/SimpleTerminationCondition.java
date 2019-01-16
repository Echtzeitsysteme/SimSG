package org.simsg.core.simulation;

import org.simsg.simsgl.simSGL.SimSGLModel;
import org.simsg.simsgl.utils.PatternContainer;

public class SimpleTerminationCondition extends SimulationTerminationCondition {

	public SimpleTerminationCondition() {
	}

	@Override
	public boolean isTerminated(SimulationState state) {
		return (state.getIterations()>=maxIterations) || (state.getTime() >= maxElapsedTime);
	}

	@Override
	public void initCondition(PatternContainer patternContainer, SimSGLModel ruleModel) {
		// TODO Auto-generated method stub
		
	}

}
