package org.simsg.core.simulation.module;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EcorePackage;
import org.emoflon.ibex.gt.arithmetic.IBeXArithmeticCalculatorHelper;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXArithmeticValue;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXDistributionType;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternModelFactory;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRule;
import org.simsg.core.gt.GraphTransformationEngine;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.simulation.Event;
import org.simsg.core.simulation.Simulation;

public class StochasticSimulation extends Simulation {
	
	private Random random = new Random();
	private Map<String, Double> staticRuleRates = new LinkedHashMap<String, Double>();
	private Map<String, Double> ruleProbabilities = new LinkedHashMap<String, Double>();
	private double systemActivity = 0;
	private double timeStep = 0;
	
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
			//This step will fail spectacularly if someone tries to use dynamically calculated values! -> only static values or static arithm. expressions allowed!
			IBeXArithmeticValue val = IBeXPatternModelFactory.eINSTANCE.createIBeXArithmeticValue();
			val.setExpression(rule.getProbability().getDistribution().getMean());
			staticRuleRates.put(rule.getName(), (Double)IBeXArithmeticCalculatorHelper.getValue(null, val, null, EcorePackage.Literals.EDOUBLE));
			ruleProbabilities.put(rule.getName(), 0.0);
		}
	}
	
	@Override
	public void initializeClocked() {
		super.initializeClocked();
		for(IBeXRule rule : ibexModel.getRuleSet().getRules().stream()
				.filter(rule ->rule.getProbability() != null)
				.filter(rule -> rule.getProbability().getDistribution().getType() == IBeXDistributionType.STATIC)
				.collect(Collectors.toList())) {
			//This step will fail spectacularly if someone tries to use dynamically calculated values! -> only static values or static arithm. expressions allowed!
			IBeXArithmeticValue val = IBeXPatternModelFactory.eINSTANCE.createIBeXArithmeticValue();
			val.setExpression(rule.getProbability().getDistribution().getMean());
			staticRuleRates.put(rule.getName(), (Double)IBeXArithmeticCalculatorHelper.getValue(null, val, null, EcorePackage.Literals.EDOUBLE));
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

}
