package org.simsg.core.simulation.module;

import java.util.ArrayList;
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
	
	private Random random = new Random();
	
	public SimpleSimulation(String modelName, final BackendContainer backend) {
		super(modelName, backend);
	}
	
	public SimpleSimulation(String modelName, PersistenceManager persistence, PatternMatchingController pmc, GraphTransformationEngine gt) {
		super(modelName, persistence, pmc, gt);
	}
	
	public void randomizeRuleOrder(boolean activate) {
		
	}

	public void useRuleRates(boolean activate) {
		
	}
	
	@Override
	public void initialize() {
		super.initialize();
	}
	
	@Override
	public void initializeClocked() {
		super.initializeClocked();
	}

	@Override
	protected void updateEvents() {
		if(state.isDirty()) {
			state.refreshState();
		}
		
		if(!state.noEvents()) {
			state.clearEvents();
		}
		
		List<String> candidates = new ArrayList<String>(ibexModel.getRuleSet().getRules().stream()
				.map(rule -> rule.getName())
				.filter(rule -> state.getMatchCount(rule)>0)
				.collect(Collectors.toList()));
		
		if(candidates.size()<=0) {
			state.setTime(state.getTime()+1);
			return;
		}
		state.enqueueEvent(new Event(state.getTime()+1, candidates.get(random.nextInt(candidates.size()))));
	}

	@Override
	protected void processEvent(Event event) {
		performGT(state.getRandomMatch(event.rule));
	}

}
