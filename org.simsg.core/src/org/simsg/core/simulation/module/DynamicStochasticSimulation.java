package org.simsg.core.simulation.module;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRule;
import org.simsg.core.gt.GraphTransformationEngine;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.simulation.BackendContainer;
import org.simsg.core.simulation.Event;
import org.simsg.core.simulation.Simulation;

public class DynamicStochasticSimulation extends Simulation {
	
	private Random random = new Random();
	private double systemActivity = 0;
	private double timeStep = 0;
	
	private Set<DynamicEvent> activeEvents = new LinkedHashSet<>();
	private Map<String, IBeXRule> stochasticRules = new LinkedHashMap<>();
	private Map<SimSGMatch, DynamicEvent> match2event = new HashMap<>();
	
	public DynamicStochasticSimulation(String modelName, final BackendContainer backend) {
		super(modelName, backend);
	}
	
	public DynamicStochasticSimulation(String modelName, PersistenceManager persistence, PatternMatchingController pmc, GraphTransformationEngine gt) {
		super(modelName, persistence, pmc, gt);
	}
	
	@Override
	public void initialize() {
		super.initialize();
		for(IBeXRule rule : ibexModel.getRuleSet().getRules().stream()
				.filter(rule ->rule.getProbability() != null)
				.collect(Collectors.toList())) {
			stochasticRules.put(rule.getName(), rule);
			state.trackRuleDeltas(rule.getName());
		}
	}
	
	@Override
	public void initializeClocked() {
		super.initializeClocked();
		for(IBeXRule rule : ibexModel.getRuleSet().getRules().stream()
				.filter(rule ->rule.getProbability() != null)
				.collect(Collectors.toList())) {
			stochasticRules.put(rule.getName(), rule);
			state.trackRuleDeltas(rule.getName());
		}
	}
	
	private void updateTimeStep() {
		timeStep = (1.0/systemActivity)*Math.log(1.0/random.nextDouble());
	}
	
	private DynamicEvent pickEvent() {
		double probingProbability = random.nextDouble()*systemActivity;
		double lowerBound = 0.0;
		for(DynamicEvent event : activeEvents) {
			double upperBound = event.probability + lowerBound;
			if(probingProbability < upperBound && probingProbability >= lowerBound) {
				return event;
			} else {
				lowerBound = upperBound;
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
		
		removeInvalidEvents();
		addNewEvents();
		updateTimeStep();
		
		
		DynamicEvent event = pickEvent();
		
		if(event != null) {
			event.time = state.getTime()+timeStep;
			state.enqueueEvent(event);
		}
	}
	
	protected void removeInvalidEvents() {
		for(String ruleName : stochasticRules.keySet()) {
			Collection<SimSGMatch> removals = state.pollRemovedMatches(ruleName);
			for(SimSGMatch match : removals) {
				DynamicEvent event = match2event.remove(match);
				if(event != null) {
					activeEvents.remove(event);
					match2event.remove(match);
					systemActivity -= event.probability;
				}
			}
		}
		
	}
	
	protected void addNewEvents() {
		for(String ruleName : stochasticRules.keySet()) {
			Collection<SimSGMatch> additons = state.pollAddedMatches(ruleName);
			for(SimSGMatch match : additons) {
				DynamicEvent event = match2event.put(match, new DynamicEvent(state.getDynamicProbability(match).get(), 0.0, ruleName, match));
				activeEvents.add(event);
				systemActivity += event.probability;
			}
		}
	}

	@Override
	protected void processEvent(Event event) {
		performGT(event.match);
	}

}

class DynamicEvent extends Event {
	
	final public double probability;

	public DynamicEvent(double probability, double time, String rule) {
		super(time, rule);
		this.probability = probability;
	}
	
	public DynamicEvent(double probability, double time, final String rule, final SimSGMatch match) {
		super(time, rule, match);
		this.probability = probability;
	}

}
