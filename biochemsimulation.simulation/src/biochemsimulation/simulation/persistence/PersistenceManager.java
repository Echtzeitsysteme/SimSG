package biochemsimulation.simulation.persistence;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;

public interface PersistenceManager {
	public void init();
	
	public ReactionRuleModel loadReactionRuleModel(String name);
	
	public ReactionContainer loadReactionContainerModel(String name);
}
