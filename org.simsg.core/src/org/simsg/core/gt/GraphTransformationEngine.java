package org.simsg.core.gt;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.simsg.core.pm.match.SimSGMatch;

import GTLanguage.GTRule;
import SimulationDefinition.SimDefinition;

abstract public class GraphTransformationEngine {
	
	protected SimDefinition simulationDefinition;
	protected Resource simulationModel;
	protected Map<String, GTRule> gtRules = new HashMap<>();
	protected Map<String, PostApplicationAction> actions = new HashMap<>();
	protected Map<String, RuleParameterConfiguration> configs = new HashMap<>();
	
	public void setModels(SimDefinition simulationDefinition, Resource simulationModel) {
		this.simulationDefinition = simulationDefinition;
		this.simulationModel = simulationModel;
		for(GTRule rule : simulationDefinition.getGtRuleSet().getRules()) {
			gtRules.put(rule.getName(), rule);
		}
	}
	
	public SimDefinition getSimulationDefinion() {
		return simulationDefinition;
	}
	
	public Resource getSimulationModel() {
		return simulationModel;
	}
	
	public abstract void init();
	
	public GTRule getRule(String name) {
		return gtRules.get(name);
	}
	
	public void addPostApplicationAction(PostApplicationAction action) {
		action.setGT(this);
		actions.put(action.getGTRule().getName(), action);
	}

	public void addRuleParameterConfiguration(RuleParameterConfiguration config) {
		config.setGT(this);
		configs.put(config.getGTRule().getName(), config);
	}
	
	public void applyRuleToMatch(SimSGMatch match) {
		if(configs.containsKey(match.getPatternName())) {
			//TODO: This might be supported in the future...
			//configs.get(match.getPatternName()).configureParameter();
		}
		
		applyRule(match);
		
		if(actions.containsKey(match.getPatternName())) {
			actions.get(match.getPatternName()).applyAction(match);
		}
	}
	
	protected abstract void applyRule(SimSGMatch match);
}
