package org.simsg.core.simulation.module;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
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
import org.simsg.core.simulation.statistic.Observable;
import org.simsg.core.simulation.statistic.Observables;

public class StochasticSimulation extends Simulation {
	
	private Random random = new Random();
	private Map<String, Double> staticRuleRates = new LinkedHashMap<String, Double>();
	private Map<String, Double> ruleProbabilities = new LinkedHashMap<String, Double>(); //dynamic rule rates
	
	private Map<Integer, Map<String, Double>> dynamicRuleRatesState = new LinkedHashMap<Integer, Map<String, Double>>();
	private Map<Integer, Map<String, Observable>> observablesState = new LinkedHashMap<Integer, Map<String, Observable>>();
	
	private double systemActivity = 0;
	private double timeStep = 0;
	private Integer currentState = 0;
	
	public StochasticSimulation(String modelName, final BackendContainer backend) {
		super(modelName, backend);
	}
	
	public StochasticSimulation(String modelName, PersistenceManager persistence, PatternMatchingController pmc, GraphTransformationEngine gt) {
		super(modelName, persistence, pmc, gt);
	}
	
	@Override
	public void initialize() {
		super.initialize();
		for(IBeXRule rule : ibexModel.getRuleSet().getRules().stream()
				.filter(rule ->rule.getProbability() != null)
				.filter(rule -> rule.getProbability().getDistribution().getType() == IBeXDistributionType.STATIC)
				.collect(Collectors.toList())) {
			staticRuleRates.put(rule.getName(), state.getStaticProbability(rule.getName()).get());
			ruleProbabilities.put(rule.getName(), 0.0);
		}
		dynamicRuleRatesState.put(currentState, new LinkedHashMap<String, Double>(ruleProbabilities));
		currentState++;
	}
	
	@Override
	public void initializeClocked() {
		super.initializeClocked();
		for(IBeXRule rule : ibexModel.getRuleSet().getRules().stream()
				.filter(rule ->rule.getProbability() != null)
				.filter(rule -> rule.getProbability().getDistribution().getType() == IBeXDistributionType.STATIC)
				.collect(Collectors.toList())) {
			staticRuleRates.put(rule.getName(), state.getStaticProbability(rule.getName()).get());
			ruleProbabilities.put(rule.getName(), 0.0);
		}
		
	}
	
	private void updateProbabilities() {
		systemActivity = 0;
		for(String rule : staticRuleRates.keySet()) {
			double p = state.getMatchCount(rule)*staticRuleRates.get(rule);
			ruleProbabilities.replace(rule, p);
			systemActivity+=p;
		}
		
	}
	
	private void updateTimeStep() {
		if(systemActivity != 0) {
			timeStep = (1.0/systemActivity)*Math.log(1.0/random.nextDouble());
		} else {
			timeStep = state.getTime() / state.getIterations();
		}
		
	}
	
	private String pickRule() {
		if(systemActivity == 0)
			return null;
		
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
		} else {
			state.setTime(state.getTime()+timeStep);
		}
	
	}

	@Override
	protected void processEvent(Event event) {
		dynamicRuleRatesState.put(currentState, new LinkedHashMap<String, Double>(ruleProbabilities));
		observablesState.put(currentState, new LinkedHashMap<String, Observable>(((Observables) statistics.get(0)).getObservables()));
		currentState++;
		SimSGMatch rndMatch = state.getRandomMatch(event.rule);
		performGT(rndMatch);
		
		// process statistics
	}
	
	@Override
	protected void setRuleRatesAndObservables() {
		simVis.addRuleRatesToState(staticRuleRates, dynamicRuleRatesState);
		simVis.addObservablesToState(observablesState);
	}

}
