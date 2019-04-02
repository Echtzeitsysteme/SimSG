package org.simsg.core.simulation.module;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.simulation.Event;
import org.simsg.core.simulation.Simulation;

public class SimpleSimulation extends Simulation {
	
	protected boolean randomRuleOrder = true;
	protected boolean useReactionRates = true;
	
	private Map<String, Double> staticReactionRates = new HashMap<>();
	
	private Random random = new Random();
	
	public SimpleSimulation(String modelName, PersistenceManager persistence, PatternMatchingController pmc) {
		super(modelName, persistence, pmc);
	}
	
	public void randomizeRuleOrder(boolean activate) {
		randomRuleOrder = activate;
	}

	public void useReactionRate(boolean activate) {
		useReactionRates = activate;
	}
	
	@Override
	public void initialize() throws Exception {
		super.initialize();
		// TODO: How to do this generically??
		//staticReactionRates = state.getPatternContainer().getStochasticRules();
	}
	
	@Override
	public void initializeClocked() {
		super.initializeClocked();
		// TODO: How to do this generically??
		//staticReactionRates = state.getPatternContainer().getStochasticRules();
	}
	
	private ConcurrentLinkedQueue<String> generatePatternQueue() {
		return new ConcurrentLinkedQueue<String>(staticReactionRates.keySet());
	}
	
	private ConcurrentLinkedQueue<String> generateRndPatternQueue(){
		List<String> rndPatternList = new LinkedList<String>(staticReactionRates.keySet());
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
		
		if(useReactionRates) {
			if(!staticReactionRates.containsKey(current)) {
				return;
			}
			double reactionRate = staticReactionRates.get(current);
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
		performGT(event.rule, state.getRandomMatch(event.rule));
	}
	
	@Override
	public void setAdditionalParameters(Object... params) {
		// Do nothing..
	}

}
