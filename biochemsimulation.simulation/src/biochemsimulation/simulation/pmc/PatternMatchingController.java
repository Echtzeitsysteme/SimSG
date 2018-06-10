package biochemsimulation.simulation.pmc;

import java.util.Collection;
import java.util.Map;

import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;

public interface PatternMatchingController {
	public void init(ReactionRuleModel ruleModel, ReactionContainer reactionContainer, PatternModel patterns) throws Exception;
	
	void collectMatches() throws Exception;
	
	void performTransformations();
	
	public Collection<? extends IPatternMatch> getMatches(String patternName);
	
	public Map<String, Collection<? extends IPatternMatch>> getAllMatches();
}
