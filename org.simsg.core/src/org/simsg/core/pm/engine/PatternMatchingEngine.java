package org.simsg.core.pm.engine;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.simsg.core.pm.match.IMatch;

import SimulationDefinition.SimDefinition;

public abstract class PatternMatchingEngine {
	
	protected EPackage metaModel;
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
	
	public abstract Collection<IMatch> getMatchesAndUpdate(String patternName);
	
	public abstract Map<String, Collection<IMatch>> getAllMatchesAndUpdate(String patternName);
	
	public abstract Collection<IMatch> getMatches(String patternName);
	
	public abstract Map<String, Collection<IMatch>> getAllMatches();
	
	public String getEngineType() {
		return this.getClass().getSimpleName();
	}
	
	abstract public void disposeEngine();
	
}
