package org.simsg.core.pm.engine;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.simsg.core.pm.match.SimSGMatch;

import SimulationDefinition.SimDefinition;

public abstract class PatternMatchingEngine {

	protected Resource simulationModel;
	protected SimDefinition simulationDefinition;
	
	protected PatternMatchingEngine() {
	}
	
	public abstract void setAdditionalParameters(Object ... params);
	
	public void setSimulationDefinition(SimDefinition simulationdefinition) {
		this.simulationDefinition = simulationdefinition;
	}
	
	public void setSimulationModel(Resource simulationModel) {
		this.simulationModel = simulationModel;
	}
	
	public abstract void initPatterns();
	
	public abstract void initEngine();
	
	public abstract void updateMatches(String patternName);
	
	public abstract void updateAllMatches();
	
	public abstract Collection<SimSGMatch> getMatchesAndUpdate(String patternName);
	
	public abstract Map<String, Collection<SimSGMatch>> getAllMatchesAndUpdate(String patternName);
	
	public abstract Collection<SimSGMatch> getMatches(String patternName);
	
	public abstract Map<String, Collection<SimSGMatch>> getAllMatches();
	
	public String getEngineType() {
		return this.getClass().getSimpleName();
	}
	
	abstract public void disposeEngine();
	
}
