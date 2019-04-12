package org.simsg.examples.network;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.simsg.core.gt.GraphTransformationEngine;
import org.simsg.core.simulation.SimulationState;
import org.simsg.core.simulation.service.PeriodicService;

import GTLanguage.GTRule;
import SimulationDefinition.RuleAnnotation;

public class KTCPeriodicService extends PeriodicService {
	
	private Map<String, GTRule> nonStochasticRules = new LinkedHashMap<>();

	public KTCPeriodicService(SimulationState state, GraphTransformationEngine gt, double servicePeriod) {
		super(state, gt, servicePeriod);
		
		Map<String, GTRule> rules = new HashMap<>();
		
		for(GTRule rule : state.getSimulationDefinition().getGtRuleSet().getRules()) {
			if(rule.isExecutable()) {
				rules.put(rule.getName(), rule);
			}
		}
		for(RuleAnnotation annotation : state.getSimulationDefinition().getRuleAnnotations()) {
			if(rules.containsKey(annotation.getGTRule().getName())) {
				rules.remove(annotation.getGTRule().getName());
			}
		}
		
		List<String> ruleNames = new LinkedList<String>(rules.keySet());
		Collections.sort(ruleNames);
		
		for(String ruleName : ruleNames) {
			nonStochasticRules.put(ruleName, rules.get(ruleName));
		}
		
	}

	@Override
	public boolean servicePeriod() {
		boolean somethingChanged = true;
		state.refreshState();
		
		for(String rule : nonStochasticRules.keySet()) {
			state.refreshState();
			while(somethingChanged) {
				somethingChanged = false;
				int count = state.getMatchCount(rule);
				if(count <= 0) continue;
				
				gt.applyRuleToMatch(state.getRandomMatch(rule));
				
				state.refreshState();
				if(count != state.getMatchCount(rule)) {
					somethingChanged = true;
				}
			}
			somethingChanged = true;
			
		}
		
		
		
		return true;
	}

}
