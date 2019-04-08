package org.simsg.core.pm.ibex;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.emoflon.ibex.gt.api.GraphTransformationAPI;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.utils.IBeXApiWrapper;

public class IBeXDemoclesEngine extends PatternMatchingEngine {
	
	private IBeXApiWrapper apiWrapper;
	private GraphTransformationAPI api;
	
	private Map<String, GraphTransformationPattern<?,?>> matcher;
	private Map<String, Collection<SimSGMatch>> matches = new HashMap<>();
	

	@Override
	public void setAdditionalParameters(Object... params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initPatterns() {
		apiWrapper = IBeXApiWrapper.getInstance();
		apiWrapper.initWrapper(simulationDefinition);
	}

	@Override
	public void initEngine() {
		try {
			api = apiWrapper.initEngine(simulationModel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Trying to re-initialize...");
			apiWrapper.initWrapper(simulationDefinition);
			try {
				api = apiWrapper.initEngine(simulationModel);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println(".. failed.");
				return;
			}
		}
		try {
			matcher = apiWrapper.getMatcher();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		updateAllMatches();
	}

	@Override
	public Collection<SimSGMatch> getMatchesAndUpdate(String patternName) {
		updateMatches(patternName);
		return matches.get(patternName);
	}
	
	@Override
	public Map<String, Collection<SimSGMatch>> getAllMatchesAndUpdate(String patternName) {
		updateAllMatches();
		return matches;
	}

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
	public void updateMatches(String patternName) {
		api.updateMatches();
		GraphTransformationPattern<?,?> m = matcher.get(patternName);
		@SuppressWarnings("unchecked")
		Collection<GraphTransformationMatch<?,?>> ibexMatches = (Collection<GraphTransformationMatch<?, ?>>) m.findMatches();
		Collection<SimSGMatch> iMatches = new LinkedList<SimSGMatch>();
		matches.put(patternName, iMatches);
		for(GraphTransformationMatch<?,?> match : ibexMatches) {
			iMatches.add(new IBeXMatch(match));
		}
	}

	@Override
	public void updateAllMatches() {
		api.updateMatches();
		for(String patternName : matcher.keySet()) {
			GraphTransformationPattern<?,?> m = matcher.get(patternName);
			@SuppressWarnings("unchecked")
			Collection<GraphTransformationMatch<?,?>> ibexMatches = (Collection<GraphTransformationMatch<?, ?>>) m.findMatches();
			Collection<SimSGMatch> iMatches = new LinkedList<SimSGMatch>();
			matches.put(patternName, iMatches);
			for(GraphTransformationMatch<?,?> match : ibexMatches) {
				iMatches.add(new IBeXMatch(match));
			}
		}
	}

}
