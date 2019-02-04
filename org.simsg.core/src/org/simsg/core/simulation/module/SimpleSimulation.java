package org.simsg.core.simulation.module;

import java.util.Collections;
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
	
	protected boolean randomRuleOrder;
	protected boolean useReactionRates;
	
	private Map<String, Double> staticReactionRates;
	
	private Random random = new Random();
	
	public SimpleSimulation(String modelName, PersistenceManager persistence, PatternMatchingController pmc) {
		super(modelName, persistence, pmc);
		randomRuleOrder = true;
		useReactionRates = true;
		random = new Random();
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
		staticReactionRates = pmc.getPatternContainer().getStochasticRules();
	}
	
	@Override
	public void initializeClocked() {
		super.initializeClocked();
		staticReactionRates = pmc.getPatternContainer().getStochasticRules();
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
		ConcurrentLinkedQueue<String> patternQueue = null;
		if(randomRuleOrder) {
			patternQueue = generateRndPatternQueue();
		}else {
			patternQueue = generatePatternQueue();
		}
		String current = patternQueue.poll();
		
		try {
			pmc.collectMatches(current);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		if(useReactionRates) {
			double reactionRate = staticReactionRates.get(current);
			double pRule = 1.0 - Math.pow((1.0-reactionRate), pmc.getMatchCount(current));
			double rnd = random.nextDouble();
			if(rnd <= pRule) {
				events.add(new Event(state.getTime()+1, current));
			}
		}else {
			if(pmc.getMatchCount(current) != 0) {
				events.add(new Event(state.getTime()+1, current));
			}
		}
	}

	@Override
	protected void processEvent(Event event) {
		gt.applyRuleToMatch(pmc.getRandomMatch(event.rule), event.rule);
	}
	
	@Override
	public void setAdditionalParameters(Object... params) {
		// Do nothing..
	}

}
