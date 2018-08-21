package biochemsimulation.simulation.pmc.GT;

import java.util.HashMap;
import java.util.Map;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.ReactionContainerFactory;
import biochemsimulation.reactioncontainer.impl.ReactionContainerFactoryImpl;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.reactionRules.Rule;
import biochemsimulation.reactionrules.reactionRules.RuleBody;
import biochemsimulation.reactionrules.utils.PatternUtils;
import biochemsimulation.simulation.matching.IMatch;

public class ReactionRuleTransformer {
	
	private ReactionRuleModel ruleModel;
	private ReactionContainer reactionContainer;
	
	private Map<String, Rule> ruleMap;
	private Map<String, Pattern> patternMap;
	private Map<String, Pattern> targetPatternMap;
	private Map<String, TransformationTemplate> templateMap;
	
	private ReactionContainerFactory factory;
	
	public ReactionRuleTransformer(ReactionRuleModel ruleModel, ReactionContainer reactionContainer) {
		this.ruleModel = ruleModel;
		this.reactionContainer = reactionContainer;
		
		factory = ReactionContainerFactoryImpl.init();
	}
	
	private void initRuleMap() {
		ruleMap = new HashMap<String, Rule>();
		ruleModel.getReactionProperties().forEach(x->{
			if(x instanceof Rule) {
				Rule r =  (Rule) x;
				ruleMap.put(r.getName(), r);
			}
		});
	}
	
	private void initPatternMaps() {
		patternMap = new HashMap<String, Pattern>();
		targetPatternMap = new HashMap<String, Pattern>();
		ruleMap.forEach((name, r) -> {
			RuleBody rb = r.getRule();
			patternMap.put(name+PatternUtils.PATTERN_NAME_SUFFIX_LHS, PatternUtils.patternFromPatternAssignment(rb.getLhs()));
			targetPatternMap.put(name+PatternUtils.PATTERN_NAME_SUFFIX_LHS, PatternUtils.patternFromPatternAssignment(rb.getRhs()));
			//matches.put(name+PatternUtils.PATTERN_NAME_SUFFIX_LHS, null);
			if(rb.getOperator().equals(PatternUtils.RULE_OPERATOR_BI)) {
				targetPatternMap.put(name+PatternUtils.PATTERN_NAME_SUFFIX_RHS, PatternUtils.patternFromPatternAssignment(rb.getLhs()));
				patternMap.put(name+PatternUtils.PATTERN_NAME_SUFFIX_RHS, PatternUtils.patternFromPatternAssignment(rb.getRhs()));
				//matches.put(name+PatternUtils.PATTERN_NAME_SUFFIX_RHS, null);
			}
			
		});
	}
	
	private void initTransformationTemplates( ) {
		templateMap = new HashMap<String, TransformationTemplate>();
		patternMap.forEach((patternName, lhsPattern) -> {
			Pattern rhsPattern = targetPatternMap.get(patternName);
			templateMap.put(patternName, new TransformationTemplate(lhsPattern, rhsPattern));
		});
	}
	
	public void init() {
		initRuleMap();
		initPatternMaps();
		initTransformationTemplates();
	}
	
	public void applyRuleToMatch(IMatch match) {
		String patternName = match.patternName().replaceAll("^(.)*\\.", "");
		templateMap.get(patternName).applyTransformation(match, reactionContainer, factory);

	}
	
	public Map<String, Rule> getRuleMap() {
		return ruleMap;
	}
	
	public Map<String, Pattern> getPatternMap() {
		return patternMap;
	}
}	
