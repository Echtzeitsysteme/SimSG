package org.simsg.core.simulation.module;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.widgets.List;
import org.emoflon.ibex.gt.StateModel.AllMatches;
import org.emoflon.ibex.gt.StateModel.RuleState;
import org.emoflon.ibex.gt.StateModel.State;
import org.emoflon.ibex.gt.state.ModelStateManager;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRule;
import org.simsg.core.gt.GraphTransformationEngine;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.simulation.BackendContainer;
import org.simsg.core.simulation.Event;
import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationState;

public class ReconstructionSimulation extends Simulation {
	
	private Random random = new Random();
//	private Map<String, Double> staticRuleRates = new LinkedHashMap<String, Double>();
//	private Map<String, Double> ruleProbabilities = new LinkedHashMap<String, Double>(); 
	// Map with state mapped to dynamic rule rates
//	private Map<Integer, Map<String, Double>> dynamicRuleRatesState = new LinkedHashMap<Integer, Map<String, Double>>();
	
	private double systemActivity = 0;
	private double timeStep = 0;
	
	
	
	private HashMap<State, Map<String, Double>> dRR;
	private ModelStateManager localStateManager;
	private State currentState;
	private EList<IBeXRule> ruleSet;
	private Map<String, Double> sRR;
	
	public ReconstructionSimulation(String modelName, final BackendContainer backend) {
		super(modelName, backend);
	}
	
	public ReconstructionSimulation(String modelName, PersistenceManager persistence, PatternMatchingController pmc, GraphTransformationEngine gt) {
		super(modelName, persistence, pmc, gt);
	}

	@Override
	protected void updateEvents() {
		if(state.isDirty()) {
			state.refreshState();
		}
		
		if(!state.noEvents()) {
			state.clearEvents();
		}
		
//		updateProbabilities();
		updateTimeStep();
		String currentRule = ((RuleState) currentState).getRule().getName();
		
		if(currentRule != null) {
			state.enqueueEvent(new Event(state.getTime()+timeStep, currentRule));
		} else {
			state.setTime(state.getTime()+timeStep);
		}
	}

	@Override
	protected void processEvent(Event event) {
//		SimSGMatch rndMatch = (SimSGMatch) localStateManager.IBeXMatchToIMatch((((RuleState) currentState).getMatch())); //sus
////				state.getRandomMatch(event.rule);
//		performGT(rndMatch);
		
	}
	
	private void updateTimeStep() {
		if(systemActivity != 0) {
			System.out.println(systemActivity);
			timeStep = (1.0/systemActivity)*Math.log(1.0/random.nextDouble());
		} else {
			timeStep = state.getTime() / state.getIterations();
		}
	}
	
	private void updateProbabilities() {
		HashMap<String, Double> rates = new HashMap<String, Double>();
//		for(State state : localStateManager.getModelStates().getStates()) {
//			rates = new HashMap<String, Double>();
			systemActivity = 0;
			HashMap<String, Double> ruleActivity = new HashMap<String, Double>();
			
			RuleState rState = (RuleState) currentState;
			for(IBeXRule rule : this.ruleSet) {
				for(AllMatches allMatches : rState.getAllMatches()) {
					if(allMatches.getPatternName().equals(rule.getName())) {
						ruleActivity.put(rule.getName(), allMatches.getAllMatchesForPattern().size() * sRR.get(rule.getName()));
						break;
					}
				}
			}
			
			for(String rule : ruleActivity.keySet()) {
				systemActivity += ruleActivity.get(rule);
				rates.put(rule, ruleActivity.get(rule));	
			}
			
			dRR.put(currentState, rates);
			
//		}
	}

	public HashMap<State, Map<String, Double>> getDynamicRates() {
		return dRR;
	}
	
	public void reconstruct() {
		initInitialState();
		for(State state : localStateManager.getModelStates().getStates()) {
			currentState = state;
			
			updateStatistics();			// TODO
			
			updateProbabilities();
			
			updateEvents();			// TODO
			if(performServiceInterval()) {
				updateEvents();
			}
			processNextEvent();			// TODO
			this.state.incrementIterations();
		}
		System.out.println("reconstructed");
	}
	
	private void initInitialState() {
		HashMap<String, Double> rates = new HashMap<String, Double>();
		for(IBeXRule rule : this.ruleSet) {
			rates.put(rule.getName(), 0.0);
		}
		dRR.put(localStateManager.getModelStates().getInitialState(), rates);
	}
	
	public void init(ModelStateManager stateManager, EList<IBeXRule> ruleList, Map<String, Double> sRR) {
		
		super.initialize();
		
		this.ruleSet = ruleList;
		this.localStateManager = stateManager;
		this.sRR = sRR;
		
		currentState = localStateManager.getModelStates().getInitialState();
		dRR = new HashMap<State, Map<String, Double>>();
		
		
	}
	
	
}
