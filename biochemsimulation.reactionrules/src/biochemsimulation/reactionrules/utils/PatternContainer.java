package biochemsimulation.reactionrules.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import biochemsimulation.reactionrules.reactionRules.AgentPattern;
import biochemsimulation.reactionrules.reactionRules.BoundAnyLink;
import biochemsimulation.reactionrules.reactionRules.BoundAnyOfTypeLink;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;
import biochemsimulation.reactionrules.reactionRules.VoidAgentPattern;
import biochemsimulation.reactionrules.reactionRules.WhatEver;

public class PatternContainer {
	Set<Pattern> patterns;
	Map<String, Pattern> allPatterns;
	Map<String, Pattern> rulePatterns;
	Map<String, Pattern> observablesPatterns;
	Map<String, Pattern> termCondPopulationPatterns;
	
	public PatternContainer() {
		patterns = new HashSet<Pattern>();
		rulePatterns = new HashMap<String, Pattern>();
		observablesPatterns = new HashMap<String, Pattern>();
		termCondPopulationPatterns = new HashMap<String, Pattern>();
	}
	
	public void addRulePatterns(Map<String, Pattern> rulePatterns) {
		rulePatterns.forEach((name, pattern) -> {
			Pattern p = findEqualPattern(pattern);
			if(p != null) {
				rulePatterns.put(name, p);
			}else {
				patterns.add(pattern);
				rulePatterns.put(name, pattern);
			}
		});
	}
	
	public void addPatternVariables(Map<String, Pattern> patternsVariables) {
		patternsVariables.forEach((name, pattern) -> {
			Pattern p = findEqualPattern(pattern);
			if(p == null) {
				patterns.add(pattern);
			}
		});
	}
	
	public void addObservablePatterns(Map<String, Pattern> obsPatterns) {
		obsPatterns.forEach((name, pattern) -> {
			Pattern p = findEqualPattern(pattern);
			if(p != null) {
				observablesPatterns.put(name, p);
			}else {
				patterns.add(pattern);
				observablesPatterns.put(name, pattern);
			}
		});
	}
	
	public void addtermCondPopulationPatterns(Map<String, Pattern> termCondPopPatterns) {
		termCondPopPatterns.forEach((name, pattern) -> {
			Pattern p = findEqualPattern(pattern);
			if(p != null) {
				termCondPopulationPatterns.put(name, p);
			}else {
				patterns.add(pattern);
				termCondPopulationPatterns.put(name, pattern);
			}
		});
	}
	
	private Pattern findEqualPattern(Pattern other) {
		if(patterns.contains(other)) {
			return other;
		}
		for(Pattern pattern : patterns) {
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
				SitePattern sp1 = vap1.getSitePatterns().getSitePatterns().get(i);
				SitePattern sp2 = vap2.getSitePatterns().getSitePatterns().get(i);
				
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
				LinkState ls2 = sp1.getLinkState().getLinkState();
				
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
