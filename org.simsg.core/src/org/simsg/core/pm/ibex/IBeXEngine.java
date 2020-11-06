package org.simsg.core.pm.ibex;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationAPI;
import org.emoflon.ibex.gt.api.GraphTransformationApp;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pm.match.SimSGMatch;

public class IBeXEngine extends PatternMatchingEngine {
	
	protected GraphTransformationAPI api;
	protected Consumer<GraphTransformationAPI> gtInit;
	protected Map<String, GraphTransformationPattern<?,?>> matcher;
	protected GraphTransformationApp<?> app;
	protected Map<String, Set<SimSGMatch>> addedMatches = new HashMap<>();
	protected Map<String, Set<SimSGMatch>> deletedMatches = new HashMap<>();
	protected Map<String, Consumer<IMatch>> appearingSubscribers = new HashMap<>();
	protected Map<String, Consumer<IMatch>> disappearingSubscribers = new HashMap<>();
	
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

	@Override
	public void trackRuleDeltas(String ruleName) {
		if(matcher.get(ruleName) instanceof GraphTransformationRule<?,?>) {
			GraphTransformationRule<?,?> rule = (GraphTransformationRule<?,?>) matcher.get(ruleName);
			Consumer<IMatch> appearing = (match) -> {
				Set<SimSGMatch> matches = addedMatches.get(ruleName);
				if(matches == null) {
					matches = new HashSet<>();
					addedMatches.put(ruleName, matches);
				}
				
				matches.add(new IBeXMatch(rule.convertMatch(match)));
			};
			appearingSubscribers.put(ruleName, appearing);
			api.getInterpreter().subscribeAppearing(ruleName, appearing);
			
			Consumer<IMatch> disappearing = (match) -> {
				Set<SimSGMatch> matches = deletedMatches.get(ruleName);
				if(matches == null) {
					matches = new HashSet<>();
					deletedMatches.put(ruleName, matches);
				}
				
				matches.add(new IBeXMatch(rule.convertMatch(match)));
			};
			disappearingSubscribers.put(ruleName, disappearing);
			api.getInterpreter().subscribeDisappearing(ruleName, disappearing);
		}
	}

	@Override
	public void untrackRuleDeltas(String ruleName) {
		if(matcher.get(ruleName) instanceof GraphTransformationRule<?,?>) {	
			GraphTransformationRule<?,?> rule = (GraphTransformationRule<?,?>) matcher.get(ruleName);
			api.getInterpreter().unsubscibeAppearing(rule.getPatternName(), appearingSubscribers.get(rule.getPatternName()));
			api.getInterpreter().unsubscibeDisappearing(rule.getPatternName(), disappearingSubscribers.get(rule.getPatternName()));
			
			appearingSubscribers.remove(ruleName);
			disappearingSubscribers.remove(ruleName);	
			addedMatches.remove(ruleName);
			deletedMatches.remove(ruleName);
		}
	}

	@Override
	public Collection<SimSGMatch> pollRemovedMatches(String ruleName) {
		Set<SimSGMatch> matches = deletedMatches.get(ruleName);
		if(matches == null)
			return new HashSet<>();
		
		deletedMatches.remove(ruleName);
		return matches;
	}

	@Override
	public Collection<SimSGMatch> pollAddedMatches(String ruleName) {
		Set<SimSGMatch> matches = addedMatches.get(ruleName);
		if(matches == null)
			return new HashSet<>();
		
		addedMatches.remove(ruleName);
		return matches;
	}

}
