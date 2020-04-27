package org.simsg.core.simulation.condition;

import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;
import org.simsg.core.simulation.SimulationState;

public class PatternTerminationCondition extends TerminationCondition implements SimulationDefinition.PatternTerminationCondition{

	private int countThreshold;
	private IBeXContextPattern conditionPattern;
	
	public PatternTerminationCondition(SimulationState state) {
		super(state);
	}
	
	public PatternTerminationCondition(SimulationState state, SimulationDefinition.PatternTerminationCondition other) {
		super(state);
		countThreshold = other.getThreshold();
		conditionPattern = other.getPattern();
	}

	@Override
	public boolean isTerminated() {
		return state.getMatchCount(conditionPattern.getName()) >= countThreshold;
	}

	@Override
	public int getThreshold() {
		return countThreshold;
	}

	@Override
	public void setThreshold(int value) {
		countThreshold = value;
	}

	@Override
	public IBeXContextPattern getPattern() {
		return conditionPattern;
	}

	@Override
	public void setPattern(IBeXContextPattern value) {
		conditionPattern = value;
	}

}
