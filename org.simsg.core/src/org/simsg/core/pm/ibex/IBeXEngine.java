package org.simsg.core.pm.ibex;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
	protected Map<String, Collection<SimSGMatch>> matches = new HashMap<>();

	@Override
	public Collection<SimSGMatch> getMatches(String patternName) {
		return matches.get(patternName);
	}

	@Override
	public Map<String, Collection<SimSGMatch>> getAllMatches() {
		return matches;
	}

	@Override
	public void disposeEngine() {
		api.terminate();
	}
	
	@Override
	public void updateMatchesInternal(String patternName) {
		api.updateMatches();
		GraphTransformationPattern<?,?> m = matcher.get(patternName);
		@SuppressWarnings("unchecked")
		Collection<GraphTransformationMatch<?,?>> ibexMatches = (Collection<GraphTransformationMatch<?, ?>>) m.findMatches();
		Collection<SimSGMatch> iMatches = new HashSet<SimSGMatch>();
		matches.put(patternName, iMatches);
		for(GraphTransformationMatch<?,?> match : ibexMatches) {
			iMatches.add(new IBeXMatch(match));
		}
	}

	@Override
	public void updateAllMatchesInternal() {
		api.updateMatches();
		for(String patternName : matcher.keySet()) {
			GraphTransformationPattern<?,?> m = matcher.get(patternName);
			@SuppressWarnings("unchecked")
			Collection<GraphTransformationMatch<?,?>> ibexMatches = (Collection<GraphTransformationMatch<?, ?>>) m.findMatches();
			Collection<SimSGMatch> iMatches = new HashSet<SimSGMatch>();
			matches.put(patternName, iMatches);
			for(GraphTransformationMatch<?,?> match : ibexMatches) {
				iMatches.add(new IBeXMatch(match));
			}
		}
	}

	@Override
	protected void removeMatch(SimSGMatch match) {
		Set<SimSGMatch> mSet = (Set<SimSGMatch>)matches.get(match.getPatternName());
		mSet.remove(match);
	}

}
