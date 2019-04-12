package org.simsg.core.pm.engine;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.simsg.core.gt.RuleApplicationCondition;
import org.simsg.core.pm.match.SimSGMatch;

import SimulationDefinition.SimDefinition;

public abstract class PatternMatchingEngine {

	protected Resource simulationModel;
	protected SimDefinition simulationDefinition;
	protected Map<String, RuleApplicationCondition> ruleConditions = new HashMap<>();
	
	public void setSimulationDefinition(SimDefinition simulationdefinition) {
		this.simulationDefinition = simulationdefinition;
	}
	
	public void setSimulationModel(Resource simulationModel) {
		this.simulationModel = simulationModel;
	}
	
	public void addRuleApplicationCondition(RuleApplicationCondition condition) {
		ruleConditions.put(condition.getGTRule().getName(), condition);
		condition.setEngine(this);
	}
	
	public abstract void initPatterns();
	
	public abstract void initEngine();
	
	public void updateMatches(String patternName) {
		updateMatchesInternal(patternName);
		List<SimSGMatch> flaggedForRemoval = new LinkedList<>();
		
		if(ruleConditions.containsKey(patternName)) {
			for(SimSGMatch match : getMatches(patternName)) {
				if(!ruleConditions.get(patternName).checkCondition(match)) {
					flaggedForRemoval.add(match);
				}
			}
		}
		
		for(SimSGMatch match : flaggedForRemoval) {
			removeMatch(match);
		}
	}
	
	public void updateAllMatches() {
		updateAllMatchesInternal();
		List<SimSGMatch> flaggedForRemoval = new LinkedList<>();
		
		for(String patternName : getAllMatches().keySet()) {
			if(ruleConditions.containsKey(patternName)) {
				for(SimSGMatch match : getMatches(patternName)) {
					if(!ruleConditions.get(patternName).checkCondition(match)) {
						flaggedForRemoval.add(match);
					}
				}
			}
		}
		
		for(SimSGMatch match : flaggedForRemoval) {
			removeMatch(match);
		}
	}
	
	protected abstract void removeMatch(SimSGMatch match);
	
	protected abstract void updateMatchesInternal(String patternName);
	
	protected abstract void updateAllMatchesInternal();
	
	public Collection<SimSGMatch> getMatchesAndUpdate(String patternName) {
		updateMatches(patternName);
		return getMatches(patternName);
	}
	
	public Map<String, Collection<SimSGMatch>> getAllMatchesAndUpdate(String patternName) {
		updateAllMatches();
		return getAllMatches();
	}
	
	public abstract Collection<SimSGMatch> getMatches(String patternName);
	
	public abstract Map<String, Collection<SimSGMatch>> getAllMatches();
	
	public String getEngineType() {
		return this.getClass().getSimpleName();
	}
	
	abstract public void disposeEngine();
	
}
