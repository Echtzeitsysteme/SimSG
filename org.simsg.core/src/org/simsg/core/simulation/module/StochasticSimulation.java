package org.simsg.core.simulation.module;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import org.simsg.core.gt.GraphTransformationEngine;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.simulation.Event;
import org.simsg.core.simulation.Simulation;

public class StochasticSimulation extends Simulation {
	
	private Random random = new Random();
	private Map<String, Double> staticReactionRates;
	private Map<String, Double> ruleProbabilities = new LinkedHashMap<String, Double>();
	private double systemActivity = 0;
	private double timeStep = 0;
	
	public StochasticSimulation(String modelName, PersistenceManager persistence, PatternMatchingController pmc, GraphTransformationEngine gt) {
		super(modelName, persistence, pmc, gt);
	}
	
	@Override
	public void initialize() throws Exception {
		super.initialize();
		//TODO: How to do this generically?
		//staticReactionRates = state.getPatternContainer().getStochasticRules();
		for(String rule : staticReactionRates.keySet()) {
			ruleProbabilities.put(rule, 0.0);
		}
	}
	
	@Override
	public void initializeClocked() {
		super.initializeClocked();
		//TODO: How to do this generically?
		//staticReactionRates = state.getPatternContainer().getStochasticRules();
		for(String rule : staticReactionRates.keySet()) {
			ruleProbabilities.put(rule, 0.0);
		}
	}
	
	private void updateProbabilities() {
		systemActivity = 0;
		for(String rule : staticReactionRates.keySet()) {
			double p = state.getMatchCount(rule)*staticReactionRates.get(rule);
			ruleProbabilities.replace(rule, p);
			systemActivity+=p;
		}
		
	}
	
	private void updateTimeStep() {
		timeStep = (1.0/systemActivity)*Math.log(1.0/random.nextDouble());
	}
	
	private String pickRule() {
		double interval = random.nextDouble()*systemActivity;
		double p = 0;
		for(String rule : ruleProbabilities.keySet()) {
			boolean greaterThanPrevious = p < interval;
			
			p += ruleProbabilities.get(rule);
			
			if(p >=interval && greaterThanPrevious) {
				return rule;
			}
			
		}
		
		return null;
	}

	@Override
	protected void updateEvents() {
		if(state.isDirty()) {
			state.refreshState();
		}
		
		if(!state.noEvents()) {
			state.clearEvents();
		}
		
		updateProbabilities();
		updateTimeStep();
		String currentRule = pickRule();
		
		if(currentRule != null) {
			state.enqueueEvent(new Event(state.getTime()+timeStep, currentRule));
		}
	}

	@Override
	protected void processEvent(Event event) {
		SimSGMatch rndMatch = state.getRandomMatch(event.rule);
		performGT(rndMatch);
	}
	
	@Override
	public void setAdditionalParameters(Object... params) {
		// do nothing..
	}

}
