package biochemsimulation.simulation.pmc;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactionrules.reactionRules.AssignFromPattern;
import biochemsimulation.reactionrules.reactionRules.AssignFromVariable;
import biochemsimulation.reactionrules.reactionRules.NumericFromLiteral;
import biochemsimulation.reactionrules.reactionRules.NumericFromVariable;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.PatternAssignment;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.reactionRules.Rule;
import biochemsimulation.reactionrules.reactionRules.RuleBody;
import biochemsimulation.reactionrules.reactionRules.VoidAgentPattern;
import biochemsimulation.reactionrules.utils.PatternUtils;
import biochemsimulation.viatrapatterns.generator.PatternTemplate;
import biochemsimulation.viatrapatterns.generator.SupportPatterns;

public abstract class ReactionRuleTransformer {
	
	protected ReactionRuleModel ruleModel;
	protected ReactionContainer reactionContainer;
	protected PatternModel patterns;
	
	protected Map<String, Rule> ruleMap;
	protected Map<String, Pattern> patternMap;
	protected Map<String, Pattern> targetPatternMap;
	
	protected Map<String, Collection<? extends IPatternMatch>> matches;
	protected Map<String, Collection<? extends IPatternMatch>> candidates;
	
	protected Map<String, Double> staticReactionRates;
	protected Map<String, Double> dynamicReactionRates;
	
	public ReactionRuleTransformer() {
		ruleMap = new HashMap<String, Rule>();
		patternMap = new HashMap<String, Pattern>();
		targetPatternMap = new HashMap<String, Pattern>();
		
		matches = new HashMap<String, Collection<? extends IPatternMatch>>();
		candidates = new HashMap<String, Collection<? extends IPatternMatch>>();
		
		staticReactionRates = new HashMap<String, Double>();
		dynamicReactionRates = new HashMap<String, Double>();
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
			if(rb.getOperator().equals(PatternTemplate.RULE_OPERATOR_BI)) {
				targetPatternMap.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_RHS, PatternUtils.patternFromPatternAssignment(rb.getLhs()));
				patternMap.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_RHS, PatternUtils.patternFromPatternAssignment(rb.getRhs()));
			}
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
		dynamicReactionRates.putAll(staticReactionRates);
	}
	
	protected void updateDynamicReactionRates() {
		dynamicReactionRates.keySet().forEach(x -> {
			int numOfMatches = getMatches(x).size();
			double y = numOfMatches * staticReactionRates.get(x);
			dynamicReactionRates.replace(x, y);
		});
	}
	
	protected void collectReactionCandidates() {
		matches.forEach( (x, y) -> {
			if(!x.contains(SupportPatterns.SUPPORT_PREFIX)) {
				List<IPatternMatch> mc = new LinkedList<>();
				mc.addAll(y);
				Collections.shuffle(mc);
				int index = (int) dynamicReactionRates.get(x).doubleValue();
				index = (index == 0)?1:index;
				index = (index >= mc.size())?mc.size():index;
				mc = mc.subList(0, index);
				candidates.put(x, mc);
			}
		});
	}
	
	protected void applyRuleToMatch(IPatternMatch match) {
		String patternName = match.patternName().replaceAll("^(.)*\\.", "");
		Pattern src = patternMap.get(patternName);
		Pattern trg = targetPatternMap.get(patternName);
		removeMarkedElements(match, src, trg);
	}
	
	protected void removeMarkedElements(IPatternMatch match, Pattern src, Pattern trg) {
		for(int i = 0; i<trg.getAgentPatterns().size(); i++) {
			if(trg.getAgentPatterns().get(i) instanceof VoidAgentPattern) {
				SimAgent agnt = (SimAgent) match.get(match.parameterNames().get(i));
				agnt.getSimSites().forEach(x-> {
					SimLinkState sls = x.getSimLinkState();
					if(sls != null) {
						org.eclipse.emf.ecore.util.EcoreUtil.delete(sls);
					}
				});
				org.eclipse.emf.ecore.util.EcoreUtil.delete(agnt);
			}
		}
	}
	
	protected Collection<? extends IPatternMatch> getMatches(String patternName) {
		return matches.getOrDefault(patternName, new LinkedList<IPatternMatch>());
	}
}
