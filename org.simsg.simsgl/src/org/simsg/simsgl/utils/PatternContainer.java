package org.simsg.simsgl.utils;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.simsg.simsgl.simSGL.Pattern;
import org.simsg.simsgl.simSGL.Rule;
import org.simsg.simsgl.simSGL.RuleBody;

public class PatternContainer {
	Map<Pattern, Set<String>> patterns = new HashMap<>();
	Set<String> patternNames = new HashSet<>();
	Map<String, Pattern> rhsRulePatterns = new HashMap<>();
	Map<String, Pattern> lhsRulePatterns = new HashMap<>();
	Map<String, Pattern> observablesPatterns = new HashMap<>();
	Map<String, Pattern> termCondPopulationPatterns = new HashMap<>();
	Set<Pattern> patternVariables = new HashSet<>();
	
	Map<String, Double> stochasticRules = new HashMap<>();
	Set<String> nonStochasticRules = new HashSet<>();

	public Collection<Pattern> getAllPatterns() {
		return patterns.keySet();
	}
	
	public Collection<String> getAllPatternNames() {
		return patternNames;
	}
	
	public Map<String, Double> getStochasticRules() {
		return stochasticRules;
	}
	
	public Collection<String> getNonStochasticRules() {
		return nonStochasticRules;
	}
	
	public Collection<String> getAllPatternHashes() {
		Collection<String> hashes = new LinkedList<String>();
		for(Set<String> names : patterns.values()) {
			hashes.add(names.iterator().next());
		}
		return hashes;
	}
	
	public Map<String, Pattern> getAllRulePatterns() {
		Map<String, Pattern> allRulePatterns = new HashMap<String, Pattern>();
		allRulePatterns.putAll(lhsRulePatterns);
		allRulePatterns.putAll(rhsRulePatterns);
		return allRulePatterns;
	}
	
	public Map<String, Pattern> getLhsRulePatterns() {
		return lhsRulePatterns;
	}
	
	public Map<String, Pattern> getRhsRulePatterns() {
		return rhsRulePatterns;
	}
	
	public Map<String, Pattern> getObservablesPatterns() {
		return observablesPatterns;
	}
	
	public Map<String, Pattern> getTermCondPatterns() {
		return termCondPopulationPatterns;
	}
	
	public static String calcPatternHash(Pattern pattern, String patternName) {
		return "pattern"+String.valueOf(pattern.hashCode())+"_"+patternName;
	}
	
	public String getPatternHash(Pattern p) {
		return patterns.get(p).iterator().next();
	}
	
	public String getPatternHash(String patternName) {
		if(lhsRulePatterns.containsKey(patternName)) {
			return patterns.get(lhsRulePatterns.get(patternName)).iterator().next();
		}else if(rhsRulePatterns.containsKey(patternName)) {
			return patterns.get(rhsRulePatterns.get(patternName)).iterator().next();
		}else if(observablesPatterns.containsKey(patternName)) {
			return patterns.get(observablesPatterns.get(patternName)).iterator().next();
		}else if(termCondPopulationPatterns.containsKey(patternName)) {
			return patterns.get(termCondPopulationPatterns.get(patternName)).iterator().next();
		}else {
			return null;
		}
	}
	
	private void addPattern(Pattern pattern, String patternName) {
		Set<String> hashes = patterns.get(pattern);
		if(hashes == null) {
			hashes = new LinkedHashSet<String>();
			patterns.put(pattern, hashes);
		}
		hashes.add(calcPatternHash(pattern, patternName));
	}
	
	public void addRulePatterns(List<Rule> rules) {
		Map<String, Pattern> lhsRulePatterns = new HashMap<String, Pattern>();
		Map<String, Pattern> rhsRulePatterns = new HashMap<String, Pattern>();
		for(Rule rule : rules) {
			RuleBody ruleBody = rule.getRule();
			String lhsPatternName = rule.getName()+PatternUtils.PATTERN_NAME_SUFFIX_LHS;
			Pattern lhsPattern = PatternUtils.patternFromPatternAssignment(ruleBody.getLhs());
			String rhsPatternName = rule.getName()+PatternUtils.PATTERN_NAME_SUFFIX_RHS;
			Pattern rhsPattern = PatternUtils.patternFromPatternAssignment(ruleBody.getRhs());
			if(ruleBody.getOperator().equals(PatternUtils.RULE_OPERATOR_UNI)) {
				lhsRulePatterns.put(lhsPatternName, lhsPattern);
				rhsRulePatterns.put(rhsPatternName, rhsPattern);
				if(ruleBody.getRuleRates() != null) {
					stochasticRules.put(lhsPatternName, PatternUtils.valueOfNumericAssignment(ruleBody.getRuleRates().getRates().get(0)));
				}else {
					nonStochasticRules.add(lhsPatternName);
				}
			}else {
				lhsRulePatterns.put(lhsPatternName, lhsPattern);
				rhsRulePatterns.put(rhsPatternName, rhsPattern);
				lhsRulePatterns.put(rhsPatternName, rhsPattern);
				rhsRulePatterns.put(lhsPatternName, lhsPattern);
				if(ruleBody.getRuleRates() != null) {
					stochasticRules.put(lhsPatternName, PatternUtils.valueOfNumericAssignment(ruleBody.getRuleRates().getRates().get(0)));
					stochasticRules.put(rhsPatternName, PatternUtils.valueOfNumericAssignment(ruleBody.getRuleRates().getRates().get(1)));
				}else {
					nonStochasticRules.add(lhsPatternName);
					nonStochasticRules.add(rhsPatternName);
				}
			}
		}
		
		lhsRulePatterns.forEach((name, pattern) -> {
			Pattern p = findEqualPattern(pattern);
			if(p != null) {
				this.lhsRulePatterns.put(name, p);
				patternNames.add(name);
			}else {
				addPattern(pattern, name);
				this.lhsRulePatterns.put(name, pattern);
				patternNames.add(name);
			}
		});
		
		rhsRulePatterns.forEach((name, pattern) -> {
			Pattern p = findEqualPattern(pattern);
			if(p != null) {
				this.rhsRulePatterns.put(name, p);
				patternNames.add(name);
			}else {
				addPattern(pattern, name);
				this.rhsRulePatterns.put(name, pattern);
				patternNames.add(name);
			}
		});
	}
	
	public void addPatternVariables(Map<String, Pattern> patternVariables) {
		patternVariables.forEach((name, pattern) -> {
			Pattern p = findEqualPattern(pattern);
			if(p == null) {
				addPattern(pattern, name);
				this.patternVariables.add(pattern);
			}
		});
	}
	
	public void addObservablePatterns(Map<String, Pattern> obsPatterns) {
		obsPatterns.forEach((name, pattern) -> {
			Pattern p = findEqualPattern(pattern);
			if(p != null) {
				observablesPatterns.put(name, p);
				patternNames.add(name);
			}else {
				addPattern(pattern, name);
				observablesPatterns.put(name, pattern);
				patternNames.add(name);
			}
		});
	}
	
	public void addtermCondPopulationPatterns(Map<String, Pattern> termCondPopPatterns) {
		termCondPopPatterns.forEach((name, pattern) -> {
			Pattern p = findEqualPattern(pattern);
			if(p != null) {
				termCondPopulationPatterns.put(name, p);
				patternNames.add(name);
			}else {
				addPattern(pattern, name);
				termCondPopulationPatterns.put(name, pattern);
				patternNames.add(name);
			}
		});
	}
	
	public void removeUnusedPatterns(List<Rule> rules) {
		Collection<Pattern> markedForRemoval = new LinkedList<Pattern>();
		for(Pattern p : patterns.keySet()) {
			if(lhsRulePatterns.containsValue(p)) {
				continue;
			}
			if(observablesPatterns.containsValue(p)) {
				continue;
			}
			if(termCondPopulationPatterns.containsValue(p)) {
				continue;
			}
			markedForRemoval.add(p);
		}
		markedForRemoval.forEach(p -> {
			patterns.remove(p);
		});		
	}
	
	private Pattern findEqualPattern(Pattern other) {
		if(patterns.containsKey(other)) {
			return other;
		}
		return null;
	}

}
