package biochemsimulation.reactionrules.utils;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import biochemsimulation.reactionrules.reactionRules.AgentPattern;
import biochemsimulation.reactionrules.reactionRules.BoundAnyLink;
import biochemsimulation.reactionrules.reactionRules.BoundAnyOfTypeLink;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.Rule;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;
import biochemsimulation.reactionrules.reactionRules.VoidAgentPattern;
import biochemsimulation.reactionrules.reactionRules.WhatEver;

public class PatternContainer {
	Map<Pattern, Set<String>> patterns;
	Set<String> patternNames;
	Map<String, Pattern> rulePatterns;
	Map<String, Pattern> observablesPatterns;
	Map<String, Pattern> termCondPopulationPatterns;
	
	PatternContainer() {
		patterns = new HashMap<Pattern, Set<String>>();
		patternNames = new HashSet<String>();
		rulePatterns = new HashMap<String, Pattern>();
		observablesPatterns = new HashMap<String, Pattern>();
		termCondPopulationPatterns = new HashMap<String, Pattern>();
	}
	
	public Collection<Pattern> getAllPatterns() {
		return patterns.keySet();
	}
	
	public Collection<String> getAllPatternNames() {
		return patternNames;
	}
	
	public Collection<String> getAllPatternHashes() {
		Collection<String> hashes = new LinkedList<String>();
		for(Set<String> names : patterns.values()) {
			hashes.add(names.iterator().next());
		}
		return hashes;
	}
	
	public Map<String, Pattern> getRulePatterns() {
		return rulePatterns;
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
		if(rulePatterns.containsKey(patternName)) {
			//return calcPatternHash(rulePatterns.get(patternName));
			return patterns.get(rulePatterns.get(patternName)).iterator().next();
		}else if(observablesPatterns.containsKey(patternName)) {
			//return calcPatternHash(observablesPatterns.get(patternName));
			return patterns.get(observablesPatterns.get(patternName)).iterator().next();
		}else if(termCondPopulationPatterns.containsKey(patternName)) {
			//return calcPatternHash(termCondPopulationPatterns.get(patternName));
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
	
	public void addRulePatterns(Map<String, Pattern> rulePatterns) {
		rulePatterns.forEach((name, pattern) -> {
			Pattern p = findEqualPattern(pattern);
			if(p != null) {
				this.rulePatterns.put(name, p);
				patternNames.add(name);
			}else {
				addPattern(pattern, name);
				//patterns.add(pattern);
				this.rulePatterns.put(name, pattern);
				patternNames.add(name);
			}
		});
	}
	
	public void addPatternVariables(Map<String, Pattern> patternsVariables) {
		patternsVariables.forEach((name, pattern) -> {
			Pattern p = findEqualPattern(pattern);
			if(p == null) {
				addPattern(pattern, name);
				//patterns.add(pattern);
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
				//patterns.add(pattern);
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
				//patterns.add(pattern);
				addPattern(pattern, name);
				termCondPopulationPatterns.put(name, pattern);
				patternNames.add(name);
			}
		});
	}
	
	public void removeUnusedPatterns(List<Rule> rules) {
		Collection<Pattern> markedForRemoval = new LinkedList<Pattern>();
		for(Pattern p : patterns.keySet()) {
			if(rulePatterns.containsValue(p)) {
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
		/*
		for(Rule rule : rules) {
			if(rule.getRule().getOperator().equals(PatternUtils.RULE_OPERATOR_BI)) {
				continue;
			}
			Pattern p = PatternUtils.patternFromPatternAssignment(rule.getRule().getRhs());
			if(observablesPatterns.containsValue(p)) {
				continue;
			}
			if(termCondPopulationPatterns.containsValue(p)) {
				continue;
			}
			boolean isUsed = false;
			for(String pName : rulePatterns.keySet()) {
				if(pName.contains(PatternUtils.PATTERN_NAME_SUFFIX_LHS)) {
					Pattern pattern =rulePatterns.get(pName);
					if(equals(p, pattern)) {
						isUsed = true;
						break;
					}
				}
			}
			if(!isUsed) {
				markedForRemoval.add(p);
			}
		}
		*/
		//patterns.removeAll(markedForRemoval);
		markedForRemoval.forEach(p -> {
			patterns.remove(p);
		});
		
		
		//debug..
		rulePatterns.forEach((name, pattern) -> {
			System.out.println("Pattern name: "+name+", hash: "+getPatternHash(pattern));
		});
		observablesPatterns.forEach((name, pattern) -> {
			System.out.println("Pattern name: "+name+", hash: "+getPatternHash(pattern));
		});
		termCondPopulationPatterns.forEach((name, pattern) -> {
			System.out.println("Pattern name: "+name+", hash: "+getPatternHash(pattern));
		});
		
		
	}
	
	private Pattern findEqualPattern(Pattern other) {
		if(patterns.containsKey(other)) {
			return other;
		}
		for(Pattern pattern : patterns.keySet()) {
			if(equals(pattern, other)) {
				return pattern;
			}
		}
		return null;
	}
	
	private boolean equals(Pattern p1, Pattern p2) {
		
		if(p1.getAgentPatterns().size() != p2.getAgentPatterns().size()) {
			return false;
		}
		
		for(int i = 0; i<p1.getAgentPatterns().size(); i++) {
			AgentPattern ap1 = p1.getAgentPatterns().get(i);
			AgentPattern ap2 = p2.getAgentPatterns().get(i);
			
			if((ap1 instanceof ValidAgentPattern) && (ap2 instanceof VoidAgentPattern)) {
				return false;
			}
			if((ap1 instanceof VoidAgentPattern) && (ap2 instanceof ValidAgentPattern)) {
				return false;
			}
			if((ap1 instanceof VoidAgentPattern) && (ap2 instanceof VoidAgentPattern)) {
				continue;
			}
			
			ValidAgentPattern vap1 = (ValidAgentPattern) ap1;
			ValidAgentPattern vap2 = (ValidAgentPattern) ap2;
			
			if(!vap1.getAgent().getName().equals(vap2.getAgent().getName())) {
				return false;
			}
			
			if(vap1.getSitePatterns().getSitePatterns().size() != vap2.getSitePatterns().getSitePatterns().size()) {
				return false;
			}
			
			for(int j = 0; j<vap1.getSitePatterns().getSitePatterns().size(); j++) {
				SitePattern sp1 = vap1.getSitePatterns().getSitePatterns().get(j);
				SitePattern sp2 = vap2.getSitePatterns().getSitePatterns().get(j);
				
				if(!sp1.getSite().getName().equals(sp2.getSite().getName())) {
					return false;
				}
				
				String sp1State = null;
				String sp2State = null;
				
				if(sp1.getState() != null) {
					sp1State = sp1.getState().getState().getName();
				}
				
				if(sp2.getState() != null) {
					sp2State = sp2.getState().getState().getName();
				}
				
				if(sp1State != null && sp2State != null) {
					if(!sp1State.equals(sp2State)) {
						return false;
					}
				}else if(sp1State == null && sp2State == null) {
					//do nothing
				}else {
					return false;
				}
				
				LinkState ls1 = sp1.getLinkState().getLinkState();
				LinkState ls2 = sp2.getLinkState().getLinkState();
				
				if(!ls1.getClass().equals(ls2.getClass())) {
					return false;
				}
				
				if(ls1 instanceof FreeLink || ls1 instanceof BoundAnyLink || ls1 instanceof WhatEver) {
					continue;
				}
				
				if(ls1 instanceof BoundLink) {
					BoundLink bls1 = (BoundLink) ls1;
					BoundLink bls2 = (BoundLink) ls2;
					if(!bls1.getState().equals(bls2.getState())) {
						return false;
					}
				}else {
					BoundAnyOfTypeLink bls1 = (BoundAnyOfTypeLink) ls1;
					BoundAnyOfTypeLink bls2 = (BoundAnyOfTypeLink) ls2;
					if(!bls1.getLinkAgent().getAgent().getName().equals(bls2.getLinkAgent().getAgent().getName())) {
						return false;
					}
					if(!bls1.getLinkSite().getSite().getName().equals(bls2.getLinkSite().getSite().getName())) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
}
