package org.simsg.core.pm.ibex;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.emoflon.ibex.gt.api.GraphTransformationAPI;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.utils.IBeXApiWrapper;

public abstract class IBeXEngine extends PatternMatchingEngine {
	
	protected IBeXApiWrapper apiWrapper;
	protected GraphTransformationAPI api;
	
	protected Map<String, GraphTransformationPattern<?,?>> matcher;
//	protected Map<String, Collection<SimSGMatch>> matches = new HashMap<>();
	
	protected final String fqApiPackageName;
	
	protected IBeXEngine(final String fqApiPackageName) {
		this.fqApiPackageName = fqApiPackageName;
	}

	@Override
	public Collection<SimSGMatch> getMatches(String patternName) {
//		return matches.get(patternName);
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
//		return matches;
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
//		GraphTransformationPattern<?,?> m = matcher.get(patternName);
//		@SuppressWarnings("unchecked")
//		Collection<GraphTransformationMatch<?,?>> ibexMatches = (Collection<GraphTransformationMatch<?, ?>>) m.findMatches();
//		Collection<SimSGMatch> iMatches = new HashSet<SimSGMatch>();
//		matches.put(patternName, iMatches);
//		for(GraphTransformationMatch<?,?> match : ibexMatches) {
//			iMatches.add(new IBeXMatch(match));
//		}
	}

	@Override
	public void updateAllMatchesInternal() {
		api.updateMatches();
//		for(String patternName : matcher.keySet()) {
//			GraphTransformationPattern<?,?> m = matcher.get(patternName);
//			@SuppressWarnings("unchecked")
//			Collection<GraphTransformationMatch<?,?>> ibexMatches = (Collection<GraphTransformationMatch<?, ?>>) m.findMatches();
//			Collection<SimSGMatch> iMatches = new HashSet<SimSGMatch>();
//			matches.put(patternName, iMatches);
//			for(GraphTransformationMatch<?,?> match : ibexMatches) {
//				iMatches.add(new IBeXMatch(match));
//			}
//		}
	}

	@Override
	protected void removeMatch(SimSGMatch match) {
//		TODO: This needs to be fixed -> important for external conditions!
//		Set<SimSGMatch> mSet = (Set<SimSGMatch>)matches.get(match.getPatternName());
//		mSet.remove(match);
	}

}
