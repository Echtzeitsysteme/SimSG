package org.simsg.core.pmc;

import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXModel;
import org.simsg.core.pm.match.SimSGMatch;

import SimulationDefinition.SimDefinition;

public class IBeXPMC extends PatternMatchingController {
	
	protected Random rnd = new Random();

	@Override
	public void loadModels(final SimDefinition simulationDefinition, final IBeXModel ibexModel, final Resource simulationModel) {
		this.simulationDefinition = simulationDefinition;
		this.ibexModel = ibexModel;
		this.simulationModel = simulationModel;
	}

	@Override
	public void initController() {
		
		patternNames.addAll(ibexModel.getPatternSet().getContextPatterns().stream()
				.map(pattern -> pattern.getName())
				.filter(pattern -> !pattern.contains("CONDITION"))
				.collect(Collectors.toSet()));
		patternNames.addAll(ibexModel.getRuleSet().getRules().stream().map(pattern -> pattern.getName()).collect(Collectors.toSet()));
		patternNames.forEach(pattern -> matchCount.put(pattern, 0));
	}

	@Override
	public void initEngine() {
		engine.setSimulationDefinition(simulationDefinition);
		engine.setIBeXModel(ibexModel);
		engine.setSimulationModel(simulationModel);
		engine.initPatterns();
		engine.initEngine();
	}

	@Override
	public void collectMatches(String patternName) {
		engine.updateMatches(patternName);
		matchCount.replace(patternName, engine.getMatchCount(patternName));
	}

	@Override
	public void collectAllMatches() {
		engine.updateAllMatches();
		patternNames.parallelStream().forEach(pattern -> matchCount.replace(pattern, engine.getMatchCount(pattern)));
	}

	@Override
	public Collection<SimSGMatch> getMatches(String patternName) {
		return engine.getMatches(patternName);
	}

	@Override
	public Map<String, Collection<SimSGMatch>> getAllMatches() {
//		return matches;
		return engine.getAllMatches();
	}

	@Override
	public int getMatchCount(String patternName) {
		return matchCount.get(patternName);
	}

	@Override
	public int getRandomMatchIdx(String patternName) {
		int count = getMatchCount(patternName);
		if(count>1) {
			return rnd.nextInt(count-1);
		}else {
			return 0;
		}
		
	}

	@Override
	public SimSGMatch getRandomMatch(String patternName) {
		return engine.getRandomMatch(patternName);
	}

	@Override
	public SimSGMatch getMatchAt(String patternName, int idx) {
		return (SimSGMatch)getMatches(patternName).toArray()[idx];
	}

}
