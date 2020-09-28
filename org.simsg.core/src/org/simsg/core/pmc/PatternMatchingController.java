package org.simsg.core.pmc;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXModel;
import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pm.match.SimSGMatch;

import SimulationDefinition.SimDefinition;


public abstract class PatternMatchingController{

	protected SimDefinition simulationDefinition;
	protected IBeXModel ibexModel;
	protected Resource simulationModel;
	
	protected PatternMatchingEngine engine;
	protected Set<String> patternNames = new HashSet<>();
	
	protected Map<String, Integer> matchCount = Collections.synchronizedMap(new HashMap<>());
	
	public abstract void loadModels(final SimDefinition simulationDefinition, final IBeXModel ibexModel, final Resource simulationModel);
	
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
	
	public Set<String> getPatternNames() {
		return patternNames;
	}
	

	public void setEngine(PatternMatchingEngine engine) {
		this.engine = engine;
	}
	
	public void discardEngine() {
		engine.disposeEngine();
	}

	public String getPMCType() {
		return this.getClass().getSimpleName();
	}
	
	public PatternMatchingEngine getEngine() {
		return engine;
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

	public abstract Optional<Double> getStaticProbability(String ruleName);

	public abstract Optional<Double> getDynamicProbability(SimSGMatch match);
	
}
