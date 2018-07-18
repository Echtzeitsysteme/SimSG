package biochemsimulation.simulation.pmc;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.ReactionContainerFactory;
import biochemsimulation.reactioncontainer.impl.ReactionContainerFactoryImpl;
import biochemsimulation.reactionrules.reactionRules.NumericFromLiteral;
import biochemsimulation.reactionrules.reactionRules.NumericFromVariable;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.reactionRules.Rule;
import biochemsimulation.reactionrules.reactionRules.RuleBody;
import biochemsimulation.reactionrules.utils.PatternUtils;
import biochemsimulation.viatrapatterns.generator.PatternTemplate;

abstract class ReactionRuleTransformer {
	
	protected ReactionRuleModel ruleModel;
	protected ReactionContainer reactionContainer;
	protected PatternModel patterns;
	
	protected Map<String, Rule> ruleMap;
	protected Map<String, Pattern> patternMap;
	protected Map<String, Pattern> targetPatternMap;
	protected Map<String, TransformationTemplate> templateMap;
	
	protected Map<String, Collection<? extends IPatternMatch>> matches;
	
	protected Map<String, Double> staticReactionRates;
	
	private ReactionContainerFactory factory;
	
	protected ReactionRuleTransformer() {
		ruleMap = new HashMap<String, Rule>();
		patternMap = new HashMap<String, Pattern>();
		targetPatternMap = new HashMap<String, Pattern>();
		templateMap = new HashMap<String, TransformationTemplate>();
		
		matches = new HashMap<String, Collection<? extends IPatternMatch>>();
		
		staticReactionRates = new HashMap<String, Double>();
		
		factory = ReactionContainerFactoryImpl.init();
	}
	
	protected void initRuleMap() {
		ruleModel.getReactionProperties().forEach(x->{
			if(x instanceof Rule) {
				Rule r =  (Rule) x;
				ruleMap.put(r.getName(), r);
			}
		});
	}
	
	protected void initPatternMaps() {
		ruleMap.forEach((name, r) -> {
			RuleBody rb = r.getRule();
			patternMap.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_LHS, PatternUtils.patternFromPatternAssignment(rb.getLhs()));
			targetPatternMap.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_LHS, PatternUtils.patternFromPatternAssignment(rb.getRhs()));
			matches.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_LHS, null);
			if(rb.getOperator().equals(PatternTemplate.RULE_OPERATOR_BI)) {
				targetPatternMap.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_RHS, PatternUtils.patternFromPatternAssignment(rb.getLhs()));
				patternMap.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_RHS, PatternUtils.patternFromPatternAssignment(rb.getRhs()));
				matches.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_RHS, null);
			}
			
		});
	}
	
	protected void initTransformationTemplates( ) {
		patternMap.forEach((patternName, lhsPattern) -> {
			Pattern rhsPattern = targetPatternMap.get(patternName);
			templateMap.put(patternName, new TransformationTemplate(lhsPattern, rhsPattern));
		});
	}
	
	protected void retrieveStaticReactionRates() {
		ruleMap.forEach((name, r) -> {
			List<Double> reactionRate = new LinkedList<Double>();
			r.getRule().getVariables().getVariables().forEach(y->{
				if(y instanceof NumericFromLiteral) {
					reactionRate.add(Double.valueOf(((NumericFromLiteral) y).getValue().getValue()));
				}else {
					reactionRate.add(Double.valueOf(((NumericFromVariable) y).getValueVar().getValue().getValue()));
				}
			});
			staticReactionRates.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_LHS, reactionRate.get(0));
			if(r.getRule().getOperator().equals(PatternTemplate.RULE_OPERATOR_BI)) {
				staticReactionRates.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_RHS, reactionRate.get(1));
			}
		});
	}
	
	protected void applyRuleToMatch(IPatternMatch match) {
		String patternName = match.patternName().replaceAll("^(.)*\\.", "");
		templateMap.get(patternName).applyTransformation(match, reactionContainer, factory);

	}
	
}	
