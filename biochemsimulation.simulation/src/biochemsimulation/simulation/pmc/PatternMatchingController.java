package biochemsimulation.simulation.pmc;

import java.util.Collection;
import java.util.Map;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.matching.IMatch;

public interface PatternMatchingController {
	
	public void loadModels(ReactionRuleModel ruleModel, ReactionContainer reactionContainer) throws Exception;
	
	public void initEngine() throws Exception;
	
	public void initController() throws Exception;
	
	void collectMatches(String patternName) throws Exception;
	
	void collectAllMatches() throws Exception;
	
	void performTransformations();
	
	public Collection<IMatch> getMatches(String patternName);
	
	public Map<String, Collection<IMatch>> getAllMatches();
}
