package SimSG.Core.Simulation;

import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.utils.PatternContainer;

public class SimpleTerminationCondition extends SimulationTerminationCondition {

	public SimpleTerminationCondition() {
	}

	@Override
	public boolean isTerminated(SimulationState state) {
		return (state.getIterations()>=maxIterations) || (state.getTime() >= maxElapsedTime);
	}

	@Override
	public void initCondition(PatternContainer patternContainer, ReactionRuleModel ruleModel) {
		// TODO Auto-generated method stub
		
	}

}
