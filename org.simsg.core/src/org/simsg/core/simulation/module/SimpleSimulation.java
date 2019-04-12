package org.simsg.core.simulation.module;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.simsg.core.gt.GraphTransformationEngine;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.simulation.Event;
import org.simsg.core.simulation.Simulation;

import SimulationDefinition.RuleAnnotation;
import SimulationDefinition.StochasticRate;

public class SimpleSimulation extends Simulation {
	
	protected boolean randomRuleOrder = true;
	protected boolean useRuleRates = true;
	
	private Map<String, Double> staticRuleRates = new HashMap<>();
	
	private Random random = new Random();
	
	public SimpleSimulation(String modelName, PersistenceManager persistence, PatternMatchingController pmc, GraphTransformationEngine gt) {
		super(modelName, persistence, pmc, gt);
	}
	
	public void randomizeRuleOrder(boolean activate) {
		randomRuleOrder = activate;
	}

	public void useRuleRates(boolean activate) {
		useRuleRates = activate;
	}
	
	@Override
	public void initialize() {
		super.initialize();
		for(RuleAnnotation annotation : simulationDefinition.getRuleAnnotations()) {
			if(annotation instanceof StochasticRate) {
				StochasticRate rate = (StochasticRate) annotation;
				staticRuleRates.put(rate.getGTRule().getName(), rate.getRate());
			}
		}
	}
	
	@Override
	public void initializeClocked() {
		super.initializeClocked();
		for(RuleAnnotation annotation : simulationDefinition.getRuleAnnotations()) {
			if(annotation instanceof StochasticRate) {
				StochasticRate rate = (StochasticRate) annotation;
				staticRuleRates.put(rate.getGTRule().getName(), rate.getRate());
			}
		}
	}
	
	private ConcurrentLinkedQueue<String> generatePatternQueue() {
		return new ConcurrentLinkedQueue<String>(staticRuleRates.keySet());
	}
	
	private ConcurrentLinkedQueue<String> generateRndPatternQueue(){
		List<String> rndPatternList = new LinkedList<String>(staticRuleRates.keySet());
		Collections.shuffle(rndPatternList);
		return new ConcurrentLinkedQueue<String>(rndPatternList);
	}

	@Override
	protected void updateEvents() {
		if(state.isDirty()) {
			state.refreshState();
		}
		
		if(!state.noEvents()) {
			state.clearEvents();
		}
		
		ConcurrentLinkedQueue<String> patternQueue = null;
		if(randomRuleOrder) {
			patternQueue = generateRndPatternQueue();
		}else {
			patternQueue = generatePatternQueue();
		}
		String current = patternQueue.poll();
		if(current == null) return;
		
		if(useRuleRates) {
			if(!staticRuleRates.containsKey(current)) {
				return;
			}
			double reactionRate = staticRuleRates.get(current);
			double pRule = 1.0 - Math.pow((1.0-reactionRate), state.getMatchCount(current));
			double rnd = random.nextDouble();
			if(rnd <= pRule) {
				state.enqueueEvent(new Event(state.getTime()+1, current));
			}
		}else {
			if(state.getMatchCount(current) != 0) {
				state.enqueueEvent(new Event(state.getTime()+1, current));
			}
		}
	}

	@Override
	protected void processEvent(Event event) {
		performGT(state.getRandomMatch(event.rule));
	}

}
