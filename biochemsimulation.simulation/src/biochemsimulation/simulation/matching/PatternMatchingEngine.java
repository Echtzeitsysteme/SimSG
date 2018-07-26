package biochemsimulation.simulation.matching;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;

import java.util.Collection;
import java.util.Map;

public interface PatternMatchingEngine {
	
	public void loadModels(ReactionContainer model, ReactionRuleModel rules) throws Exception;
	
	public void initEngine() throws Exception;
	
	public Collection<IMatch> getMatches(String patternName) throws Exception;
	
	public Map<String, Collection<IMatch>> getAllMatches() throws Exception;
	
	public void disposeEngine();
	
	public PatternMatchingEngineEnum getEngineType();
	
}
