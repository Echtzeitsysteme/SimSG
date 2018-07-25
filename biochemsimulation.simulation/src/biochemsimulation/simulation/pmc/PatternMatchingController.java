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
	
	public void randomizeRuleOrder(boolean activate);
	
	public void useReactionRate(boolean activate);
	
	public void collectMatches(String patternName) throws Exception;
	
	public void collectAllMatches() throws Exception;
	
	public void performTransformations();
	
	public void discardEngine();
	
	public Collection<IMatch> getMatches(String patternName);
	
	public Map<String, Collection<IMatch>> getAllMatches();
}
