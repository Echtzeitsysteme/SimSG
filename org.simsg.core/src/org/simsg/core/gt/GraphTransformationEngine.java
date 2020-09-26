package org.simsg.core.gt;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXModel;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRule;
import org.simsg.core.pm.match.SimSGMatch;
import SimulationDefinition.SimDefinition;

abstract public class GraphTransformationEngine {
	
	protected SimDefinition simulationDefinition;
	protected Resource simulationModel;
	protected IBeXModel ibexModel;
	protected Map<String, IBeXRule> ibexRules = new HashMap<>();
	protected Map<String, PostApplicationAction> actions = new HashMap<>();
	protected Map<String, RuleParameterConfiguration> configs = new HashMap<>();
	
	public void setModels(SimDefinition simulationDefinition, IBeXModel ibexModel, Resource simulationModel) {
		this.simulationDefinition = simulationDefinition;
		this.simulationModel = simulationModel;
		this.ibexModel = ibexModel;
		for(IBeXRule rule : ibexModel.getRuleSet().getRules()) {
			ibexRules.put(rule.getName(), rule);
		}
	}
	
	public SimDefinition getSimulationDefinion() {
		return simulationDefinition;
	}
	
	public Resource getSimulationModel() {
		return simulationModel;
	}
	
	public abstract void init();
	
	public IBeXRule getRule(String name) {
		return ibexRules.get(name);
	}
	
	public void addPostApplicationAction(PostApplicationAction action) {
		action.setGT(this);
		actions.put(action.getIbexRule().getName(), action);
	}

	public void addRuleParameterConfiguration(RuleParameterConfiguration config) {
		config.setGT(this);
		configs.put(config.getIbexRule().getName(), config);
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
