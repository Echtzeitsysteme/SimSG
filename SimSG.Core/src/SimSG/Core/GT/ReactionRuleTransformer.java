package SimSG.Core.GT;

import java.util.HashMap;
import java.util.Map;

import SimSG.Container.util.EPackageWrapper;
import SimSG.Core.PM.Match.IMatch;
import SimSG.Container.Container;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.utils.PatternContainer;
import biochemsimulation.reactionrules.utils.PatternUtils;

public class ReactionRuleTransformer {
	
	private PatternContainer patternContainer;
	private Container reactionContainer;
	private EPackageWrapper metaModel;
	
	private Map<String, Pattern> patternMap;
	private Map<String, Pattern> targetPatternMap;
	private Map<String, TransformationTemplate> templateMap;
	
	public ReactionRuleTransformer(PatternContainer patternContainer, Container reactionContainer, EPackageWrapper metaModel) {
		this.patternContainer = patternContainer;
		this.reactionContainer = reactionContainer;
		this.metaModel = metaModel;
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
			templateMap.put(patternName, new TransformationTemplate(patternName, lhsPattern, rhsPattern, reactionContainer, metaModel));
		});
	}
	
	public void init() {
		initPatternMaps();
		initTransformationTemplates();
	}
	
	public void applyRuleToMatch(IMatch match, String patternName) {
		templateMap.get(patternName).applyTransformation(match);
	}
	
	public Map<String, Pattern> getPatternMap() {
		return patternMap;
	}
}	
