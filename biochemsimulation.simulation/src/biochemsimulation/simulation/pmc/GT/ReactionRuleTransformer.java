package biochemsimulation.simulation.pmc.GT;

import java.util.HashMap;
import java.util.Map;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.ReactionContainerFactory;
import biochemsimulation.reactioncontainer.impl.ReactionContainerFactoryImpl;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.utils.PatternContainer;
import biochemsimulation.reactionrules.utils.PatternUtils;
import biochemsimulation.simulation.matching.IMatch;

public class ReactionRuleTransformer {
	
	private PatternContainer patternContainer;
	private ReactionContainer reactionContainer;
	
	private Map<String, Pattern> patternMap;
	private Map<String, Pattern> targetPatternMap;
	private Map<String, TransformationTemplate> templateMap;
	
	private ReactionContainerFactory factory;
	
	public ReactionRuleTransformer(PatternContainer patternContainer, ReactionContainer reactionContainer) {
		//this.ruleModel = ruleModel;
		this.patternContainer = patternContainer;
		this.reactionContainer = reactionContainer;
		
		factory = ReactionContainerFactoryImpl.init();
	}
	
	private void initPatternMaps() {
		patternMap = new HashMap<String, Pattern>();
		targetPatternMap = new HashMap<String, Pattern>();
		Map<String, Pattern> rulePatterns = patternContainer.getRulePatterns();
		rulePatterns.forEach((name, pattern) -> {
			patternMap.put(name, pattern);
			if(name.contains(PatternUtils.PATTERN_NAME_SUFFIX_LHS)) {
				String rhsPatternName = name.replace(PatternUtils.PATTERN_NAME_SUFFIX_LHS, PatternUtils.PATTERN_NAME_SUFFIX_RHS);
				if(rulePatterns.containsKey(rhsPatternName)) {
					targetPatternMap.put(name, rulePatterns.get(rhsPatternName));
				}
			}else {
				String lhsPatternName = name.replace(PatternUtils.PATTERN_NAME_SUFFIX_RHS, PatternUtils.PATTERN_NAME_SUFFIX_LHS);
				if(rulePatterns.containsKey(lhsPatternName)) {
					targetPatternMap.put(name, rulePatterns.get(lhsPatternName));
				}
			}
		});
		
	}
	
	private void initTransformationTemplates( ) {
		templateMap = new HashMap<String, TransformationTemplate>();
		patternMap.forEach((patternName, lhsPattern) -> {
			Pattern rhsPattern = targetPatternMap.get(patternName);
			//templateMap.put(PatternContainer.calcPatternHash(lhsPattern), new TransformationTemplate(lhsPattern, rhsPattern));
			templateMap.put(patternName, new TransformationTemplate(lhsPattern, rhsPattern));
		});
	}
	
	public void init() {
		initPatternMaps();
		initTransformationTemplates();
	}
	
	public void applyRuleToMatch(IMatch match, String patternName) {
		//String patternName = match.patternName().replaceAll("^(.)*\\.", "");
		templateMap.get(patternName).applyTransformation(match, reactionContainer, factory);
	}
	
	public Map<String, Pattern> getPatternMap() {
		return patternMap;
	}
}	
