package org.simsg.core.pm.ibex;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.emoflon.ibex.gt.api.GraphTransformationAPI;
import org.emoflon.ibex.gt.api.GraphTransformationApp;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pm.match.SimSGMatch;

public class IBeXEngine extends PatternMatchingEngine {
	
	protected GraphTransformationAPI api;
	protected Consumer<GraphTransformationAPI> gtInit;
	protected Map<String, GraphTransformationPattern<?,?>> matcher;
	protected GraphTransformationApp<?> app;
	
	public IBeXEngine(final GraphTransformationApp<?> app, final Consumer<GraphTransformationAPI> gtInit) {
		this.app = app;
		this.gtInit = gtInit;
	}
	
	@Override
	public void initPatterns() {}

	@Override
	public void initEngine() {
		app.registerMetaModels();
		app.getModel().getResources().add(simulationModel);
		api = app.initAPI();
		gtInit.accept(api);
		
		matcher = new HashMap<>();
		api.getAllPatterns().forEach((name, pattern) -> matcher.put(name, pattern.get()));
		updateAllMatches();
	}

	@Override
	public Collection<SimSGMatch> getMatches(String patternName) {
		if(!matcher.containsKey(patternName))
			return new HashSet<>();
		
		GraphTransformationPattern<?,?> m = matcher.get(patternName);
		return m.findMatches().parallelStream().map(iMatch -> new IBeXMatch(iMatch)).collect(Collectors.toSet());
	}

	@Override
	public Map<String, Collection<SimSGMatch>> getAllMatches() {
		Map<String, Collection<SimSGMatch>> matches = Collections.synchronizedMap(new HashMap<>());
		matcher.keySet().parallelStream().forEach(pattern -> matches.put(pattern, getMatches(pattern)));
		return matches;
	}
	
	@Override
	public int getMatchCount(String patternName) {
		if(!matcher.containsKey(patternName))
			return 0;
		
		GraphTransformationPattern<?,?> m = matcher.get(patternName);
		return (int) m.countMatches();
	}
	
	@Override
	public SimSGMatch getRandomMatch(String patternName) {
		if(!matcher.containsKey(patternName))
			return null;
		
		GraphTransformationPattern<?,?> m = matcher.get(patternName);
		return new IBeXMatch(m.findAnyMatch().get());
	}

	@Override
	public void disposeEngine() {
		api.terminate();
	}
	
	@Override
	public void updateMatchesInternal(String patternName) {
		api.updateMatches();
	}

	@Override
	public void updateAllMatchesInternal() {
		api.updateMatches();
	}

	@Override
	protected void removeMatch(SimSGMatch match) {
//		TODO: This needs to be fixed -> important for external conditions!
//		Set<SimSGMatch> mSet = (Set<SimSGMatch>)matches.get(match.getPatternName());
//		mSet.remove(match);
	}

	@Override
	public Optional<Double> getStaticProbability(String ruleName) {
		if(matcher.get(ruleName) instanceof GraphTransformationRule<?,?>) {
			GraphTransformationRule<?,?> rule = (GraphTransformationRule<?,?>) matcher.get(ruleName);
			if(rule.getProbability().isPresent()) {
				return Optional.of(rule.getProbability().get().getProbability());
			}
		}
		return Optional.empty();
	}

	@Override
	public Optional<Double> getDynamicProbability(SimSGMatch match) {
		if(matcher.get(match.getPatternName()) instanceof GraphTransformationRule<?,?>) {
			GraphTransformationRule<?,?> rule = (GraphTransformationRule<?,?>) matcher.get(match.getPatternName());
			if(rule.getProbability().isPresent()) {
				return Optional.of(rule.getProbability().get().getProbabilityGeneric(match.asGtMatch()));
			}
		}
		return Optional.empty();
	}
	
	public GraphTransformationAPI getApi() {
		return api;
	}

}
