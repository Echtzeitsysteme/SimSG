package biochemsimulation.simulation.persistence;

import java.util.Set;

import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;

public interface PersistenceManager {
	public void init();
	
	public Set<String> availableReactionRuleModels();
	
	public Set<String> availableReactionContainerModels();
	
	public Set<String> availableViatraPatternModels();
	
	public ReactionRuleModel loadReactionRuleModel(String name) throws Exception;
	
	public ReactionContainer loadReactionContainerModel(String name, boolean generateIfNotExist) throws Exception;
	
	public PatternModel loadViatraPatternModel(String name, boolean generateIfNotExist) throws Exception;
}
