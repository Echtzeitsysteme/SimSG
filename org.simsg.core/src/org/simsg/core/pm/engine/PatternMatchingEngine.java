package org.simsg.core.pm.engine;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXModel;
import org.simsg.core.gt.RuleApplicationCondition;
import org.simsg.core.pm.match.SimSGMatch;

import SimulationDefinition.SimDefinition;

public abstract class PatternMatchingEngine {

	protected Resource simulationModel;
	protected IBeXModel ibexModel;
	protected SimDefinition simulationDefinition;
	protected Map<String, RuleApplicationCondition> ruleConditions = new HashMap<>();
	
	public void setSimulationDefinition(SimDefinition simulationdefinition) {
		this.simulationDefinition = simulationdefinition;
	}
	
	public void setIBeXModel(final IBeXModel ibexModel) {
		this.ibexModel = ibexModel;
	}
	
	public void setSimulationModel(Resource simulationModel) {
		this.simulationModel = simulationModel;
	}
	
	public void addRuleApplicationCondition(RuleApplicationCondition condition) {
		ruleConditions.put(condition.getIbexRule().getName(), condition);
		condition.setEngine(this);
	}
	
	public abstract void initPatterns();
	
	public abstract void initEngine();
	
	public void updateMatches(String patternName) {
		updateMatchesInternal(patternName);
//		TODO: This needs to be fixed -> important for external conditions!
//		List<SimSGMatch> flaggedForRemoval = new LinkedList<>();
//		
//		if(ruleConditions.containsKey(patternName)) {
//			for(SimSGMatch match : getMatches(patternName)) {
//				if(!ruleConditions.get(patternName).checkCondition(match)) {
//					flaggedForRemoval.add(match);
//				}
//			}
//		}
//		
//		for(SimSGMatch match : flaggedForRemoval) {
//			removeMatch(match);
//		}
	}
	
	public void updateAllMatches() {
		updateAllMatchesInternal();
//		TODO: This needs to be fixed -> important for external conditions!
//		List<SimSGMatch> flaggedForRemoval = new LinkedList<>();
//		
//		for(String patternName : getAllMatches().keySet()) {
//			if(ruleConditions.containsKey(patternName)) {
//				for(SimSGMatch match : getMatches(patternName)) {
//					if(!ruleConditions.get(patternName).checkCondition(match)) {
//						flaggedForRemoval.add(match);
//					}
//				}
//			}
//		}
//		
//		for(SimSGMatch match : flaggedForRemoval) {
//			removeMatch(match);
//		}
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
	
	public abstract int getMatchCount(String patternName);
	
	public abstract SimSGMatch getRandomMatch(String patternName);
	
	public abstract Map<String, Collection<SimSGMatch>> getAllMatches();
	
	public String getEngineType() {
		return this.getClass().getSimpleName();
	}
	
	abstract public void disposeEngine();

	public abstract Optional<Double> getStaticProbability(String ruleName);

	public abstract Optional<Double> getDynamicProbability(SimSGMatch match);
	
	public abstract void trackRuleDeltas(String ruleName);
	
	public abstract  void untrackRuleDeltas(String ruleName);
	
	public abstract  Collection<SimSGMatch> getRemovedMatches(String ruleName);
	
	public abstract  Collection<SimSGMatch> getAddedMatches(String ruleName);
	
}
