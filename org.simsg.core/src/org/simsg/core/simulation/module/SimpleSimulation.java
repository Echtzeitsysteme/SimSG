package org.simsg.core.simulation.module;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXDistributionType;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRule;
import org.simsg.core.gt.GraphTransformationEngine;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.simulation.BackendContainer;
import org.simsg.core.simulation.Event;
import org.simsg.core.simulation.Simulation;

public class SimpleSimulation extends Simulation {
	
	protected boolean randomRuleOrder = true;
	protected boolean useRuleRates = true;
	
	private Map<String, Double> staticRuleRates = new HashMap<>();
	
	private Random random = new Random();
	
	public SimpleSimulation(String modelName, final BackendContainer backend) {
		super(modelName, backend);
	}
	
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
		for(IBeXRule rule : ibexModel.getRuleSet().getRules().stream()
				.filter(rule ->rule.getProbability() != null)
				.filter(rule -> rule.getProbability().getDistribution().getType() == IBeXDistributionType.STATIC)
				.collect(Collectors.toList())) {
			staticRuleRates.put(rule.getName(), state.getStaticProbability(rule.getName()).get());
		}
	}
	
	@Override
	public void initializeClocked() {
		super.initializeClocked();
		for(IBeXRule rule : ibexModel.getRuleSet().getRules().stream()
				.filter(rule ->rule.getProbability() != null)
				.filter(rule -> rule.getProbability().getDistribution().getType() == IBeXDistributionType.STATIC)
				.collect(Collectors.toList())) {
			staticRuleRates.put(rule.getName(), state.getStaticProbability(rule.getName()).get());
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
