package org.simsg.core.pmc;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pm.match.SimSGMatch;

import SimulationDefinition.SimDefinition;


public abstract class PatternMatchingController{

	protected SimDefinition simulationDefinition;
	protected Resource simulationModel;
	
	protected PatternMatchingEngine engine;
	protected Map<String, Collection<SimSGMatch>> matches = new HashMap<>();
	protected Map<String, Integer> matchCount = new HashMap<>();
	
	public abstract void setAdditionalParameters(Object ... params);
	
	public abstract void loadModels(SimDefinition simulationDefinition, Resource simulationModel);
	
	public abstract void initController();
	
	public abstract void initEngine();

	public abstract void collectMatches(String patternName);
	
	public abstract void collectAllMatches();
	
	public abstract Collection<SimSGMatch> getMatches(String patternName);
	
	public abstract Map<String, Collection<SimSGMatch>> getAllMatches();
	
	public abstract int getMatchCount(String patternName);
	
	public abstract int getRandomMatchIdx(String patternName);
	
	public abstract SimSGMatch getRandomMatch(String patternName);
	
	public abstract SimSGMatch getMatchAt(String patternName, int idx);
	

	public void setEngine(PatternMatchingEngine engine) {
		this.engine = engine;
	}
	
	public void discardEngine() {
		engine.disposeEngine();
	}

	public String getPMCType() {
		return this.getClass().getSimpleName();
	}
	
	public String getEngineType() {
		return engine.getEngineType();
	}
	
	public SimDefinition getSimulationDefinion() {
		return simulationDefinition;
	}
	
	public Resource getSimulationModel() {
		return simulationModel;
	}
	
}
