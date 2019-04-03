package org.simsg.core.pmc;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.ecore.resource.Resource;

import org.simsg.core.pm.match.IMatch;
import org.simsg.core.pm.match.PatternMatchingEngine;

import SimulationDefinition.SimDefinition;


public abstract class PatternMatchingController{

	protected SimDefinition simulationDefinition;
	protected Resource simulationModel;
	
	protected PatternMatchingEngine engine;
	protected Map<String, Collection<IMatch>> matches;
	protected Map<String, Integer> matchCount;
	
	Random random;
	
	protected PatternMatchingController() {
		random = new Random();
	}
	
	public abstract void setAdditionalParameters(Object ... params);
	
	protected abstract void feedEngine() throws Exception;

	public abstract void collectMatches(String patternName) throws Exception;
	
	public abstract void collectAllMatches() throws Exception;
	
	public abstract int getMatchCount(String patternName);
	
	protected abstract int getRandomMatchIdx(String patternName);
	
	public abstract IMatch getRandomMatch(String patternName);
	
	public abstract IMatch getMatchAt(String patternName, int idx);
	
	public abstract Collection<IMatch> getMatches(String patternName);
	
	public abstract Map<String, Collection<IMatch>> getAllMatches();

	public void setEngine(PatternMatchingEngine engine) {
		this.engine = engine;
	}
	
	public abstract void loadModels(SimDefinition simulationDefinition, Resource simulationModel) throws Exception;
	
	public void initEngine() throws Exception {
		engine.initEngine();
	}
	
	public void initController() throws Exception {
		initMatches();
	}
	
	protected void initMatches() {
		// Init matches
		matches = new HashMap<String, Collection<IMatch>>();
		for(String patterName : engine.getAllPatternNames()) {
			matches.put(patterName, new LinkedList<IMatch>());
		}
				
		// Init match counter
		matchCount = new HashMap<String, Integer>();
		for(String patternName : matches.keySet()) {
			matchCount.put(patternName, 0);
		}
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
