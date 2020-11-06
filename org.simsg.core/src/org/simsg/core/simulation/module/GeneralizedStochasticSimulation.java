package org.simsg.core.simulation.module;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXDistributionType;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRule;
import org.simsg.core.gt.GraphTransformationEngine;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.simulation.BackendContainer;
import org.simsg.core.simulation.Event;
import org.simsg.core.simulation.Simulation;

//TODO: Test this implementation
public class GeneralizedStochasticSimulation extends Simulation {
	
	private Random random = new Random();
	private Map<String, IBeXRule> stochasticRules = new LinkedHashMap<>();
	private Map<SimSGMatch, Event> match2event = new HashMap<>();
	
	public GeneralizedStochasticSimulation(String modelName, final BackendContainer backend) {
		super(modelName, backend);
	}
	
	public GeneralizedStochasticSimulation(String modelName, PersistenceManager persistence, PatternMatchingController pmc, GraphTransformationEngine gt) {
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

	@Override
	protected void updateEvents() {
		if(state.isDirty()) {
			state.refreshState();
		}
		
		removeInvalidEvents();
		addNewEvents();
		
	}
	
	protected void removeInvalidEvents() {
		for(String ruleName : stochasticRules.keySet()) {
			Collection<SimSGMatch> removals = state.pollRemovedMatches(ruleName);
			for(SimSGMatch match : removals) {
				Event event = match2event.remove(match);
				if(event != null) {
					state.removeEvent(event);
					match2event.remove(match);
				}
			}
		}
		
	}
	
	protected void addNewEvents() {
		for(String ruleName : stochasticRules.keySet()) {
			Collection<SimSGMatch> additons = state.pollAddedMatches(ruleName);
			for(SimSGMatch match : additons) {
				Event event = match2event.put(match, new Event(state.getTime()+state.getDynamicProbability(match).get(), ruleName, match));
				state.enqueueEvent(event);
			}
		}
	}

	@Override
	protected void processEvent(Event event) {
		SimSGMatch rndMatch = state.getRandomMatch(event.rule);
		performGT(rndMatch);
	}

}
