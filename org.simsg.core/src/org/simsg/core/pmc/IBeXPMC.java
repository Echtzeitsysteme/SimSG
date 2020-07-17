package org.simsg.core.pmc;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPattern;
import org.simsg.core.pm.match.SimSGMatch;

import GTLanguage.GTRule;
import SimulationDefinition.SimDefinition;

public class IBeXPMC extends PatternMatchingController {
	
	protected Random rnd = new Random();

	@Override
	public void loadModels(SimDefinition simulationDefinition, Resource simulationModel) {
		this.simulationDefinition = simulationDefinition;
		this.simulationModel = simulationModel;
	}

	@Override
	public void initController() {
		patternNames.addAll(simulationDefinition.getIbexPatternSet().getContextPatterns().stream().map(pattern -> pattern.getName()).collect(Collectors.toSet()));
		patternNames.addAll(simulationDefinition.getGtRuleSet().getRules().stream().map(pattern -> pattern.getName()).collect(Collectors.toSet()));
//		for(IBeXPattern pattern : simulationDefinition.getIbexPatternSet().getContextPatterns()) {
//			matches.put(pattern.getName(), new LinkedList<>());
//			matchCount.put(pattern.getName(), 0);
//		}
//		
//		for(GTRule rule : simulationDefinition.getGtRuleSet().getRules()) {
//			matches.put(rule.getName(), new LinkedList<>());
//			matchCount.put(rule.getName(), 0);
//		}
		patternNames.forEach(pattern -> matchCount.put(pattern, 0));
	}

	@Override
	public void initEngine() {
		engine.setSimulationDefinition(simulationDefinition);
		engine.setSimulationModel(simulationModel);
		engine.initPatterns();
		engine.initEngine();
	}

	@Override
	public void collectMatches(String patternName) {
		engine.updateMatches(patternName);
//		matches.replace(patternName, engine.getMatches(patternName));
//		matchCount.replace(patternName, matches.get(patternName).size());
		matchCount.replace(patternName, engine.getMatchCount(patternName));
	}

	@Override
	public void collectAllMatches() {
		engine.updateAllMatches();
//		matches = engine.getAllMatches();
//		matches.forEach((name, set) -> {
//			matchCount.replace(name, set.size());
//		});
		patternNames.parallelStream().forEach(pattern -> matchCount.replace(pattern, engine.getMatchCount(pattern)));
	}

	@Override
	public Collection<SimSGMatch> getMatches(String patternName) {
//		return matches.get(patternName);
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
//		Collection<SimSGMatch> m = matches.get(patternName);
//		if(m.size()>1) {
//			return rnd.nextInt(m.size()-1);
//		}else {
//			return 0;
//		}
		
		int count = getMatchCount(patternName);
		if(count>1) {
			return rnd.nextInt(count-1);
		}else {
			return 0;
		}
		
	}

	@Override
	public SimSGMatch getRandomMatch(String patternName) {
//		return (SimSGMatch)matches.get(patternName).toArray()[getRandomMatchIdx(patternName)];
		return engine.getRandomMatch(patternName);
	}

	@Override
	public SimSGMatch getMatchAt(String patternName, int idx) {
//		return (SimSGMatch)matches.get(patternName).toArray()[idx];
		return (SimSGMatch)getMatches(patternName).toArray()[idx];
	}

}
