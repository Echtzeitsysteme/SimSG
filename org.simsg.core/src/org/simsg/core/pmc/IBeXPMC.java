package org.simsg.core.pmc;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.ecore.resource.Resource;
import org.simsg.core.pm.match.IMatch;

import GTLanguage.GTRule;
import IBeXLanguage.IBeXPattern;
import SimulationDefinition.SimDefinition;

public class IBeXPMC extends PatternMatchingController {
	
	private Random rnd = new Random();

	@Override
	public void setAdditionalParameters(Object... params) {
		// TODO Auto-generated method stub
	}

	@Override
	public void loadModels(SimDefinition simulationDefinition, Resource simulationModel) {
		this.simulationDefinition = simulationDefinition;
		this.simulationModel = simulationModel;
	}

	@Override
	public void initController() {
		for(IBeXPattern pattern : simulationDefinition.getIbexPatternSet().getContextPatterns()) {
			matches.put(pattern.getName(), new LinkedList<>());
			matchCount.put(pattern.getName(), 0);
		}
		
		for(GTRule rule : simulationDefinition.getGtRuleSet().getRules()) {
			matches.put(rule.getName(), new LinkedList<>());
			matchCount.put(rule.getName(), 0);
		}
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
		matches.replace(patternName, engine.getMatches(patternName));
		matchCount.replace(patternName, matches.get(patternName).size());
	}

	@Override
	public void collectAllMatches() {
		engine.updateAllMatches();
		matches = engine.getAllMatches();
		matches.forEach((name, set) -> {
			matchCount.replace(name, set.size());
		});
	}

	@Override
	public Collection<IMatch> getMatches(String patternName) {
		return matches.get(patternName);
	}

	@Override
	public Map<String, Collection<IMatch>> getAllMatches() {
		return matches;
	}

	@Override
	public int getMatchCount(String patternName) {
		return matchCount.get(patternName);
	}

	@Override
	public int getRandomMatchIdx(String patternName) {
		Collection<IMatch> m = matches.get(patternName);
		return rnd.nextInt(m.size()-1);
	}

	@Override
	public IMatch getRandomMatch(String patternName) {
		return (IMatch)matches.get(patternName).toArray()[getRandomMatchIdx(patternName)];
	}

	@Override
	public IMatch getMatchAt(String patternName, int idx) {
		return (IMatch)matches.get(patternName).toArray()[idx];
	}

}
