package org.simsg.core.gt.mgt;

import java.util.HashMap;
import java.util.Map;

import org.simsg.core.gt.GraphTransformationEngine;
//import org.simsg.container.util.EPackageWrapper;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.pm.pattern.GenericPattern;

public class ModelGraphTransformer extends GraphTransformationEngine {
	
	//TODO: make EPackageWrapper a Singleton and fetch instance and remove dependency on container!
	//private EPackageWrapper metaModel;
	
	private Map<String, GenericPattern> patternMap = new HashMap<>();
	private Map<String, GenericPattern> targetPatternMap = new HashMap<>();
	private Map<String, TransformationTemplate> templateMap = new HashMap<>();
	
	public ModelGraphTransformer() {
		
	}
	
	private void initPatternMaps() {
		//TODO: how to, without pattern container?
		/*
		Map<String, GenericPattern> rulePatterns = new HashMap<>(); 
		patternContainer.getAllRulePatterns().forEach((name, pattern) -> rulePatterns.put(name,  new GenericPattern(name, metaModel, pattern)));
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
		*/
	}
	
	private void initTransformationTemplates( ) {
		//TODO: how to, without pattern container and without dependency on SimSGL?
		/*
		patternMap.forEach((patternName, lhsPattern) -> {
			GenericPattern rhsPattern = targetPatternMap.get(patternName);
			templateMap.put(patternName, new TransformationTemplate(patternName, lhsPattern, rhsPattern, reactionContainer, metaModel));
		});
		*/
	}
	
	public void init() {
		initPatternMaps();
		initTransformationTemplates();
	}
	
	public Map<String, GenericPattern> getPatternMap() {
		return patternMap;
	}
	
	//TODO: repair..
	/*
	@Override
	public void applyRuleToMatch(IMatch match) {
		templateMap.get(match.patternName()).applyTransformation(match);
		
	}
	*/

	@Override
	public void setAdditionalParameters(Object... params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applyRuleToMatch(SimSGMatch match) {
		// TODO Auto-generated method stub
		
	}
}	
