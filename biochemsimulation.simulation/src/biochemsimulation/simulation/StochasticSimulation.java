package biochemsimulation.simulation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import biochemsimulation.simulation.matching.IMatch;

public class StochasticSimulation extends Simulation {
	
	Random random;
	private Map<String, Double> ruleProbabilities;
	private double systemActivity;
	private double timeStep;
	private String currentRule;
	
	public StochasticSimulation() {
		systemActivity = 0;
		timeStep = 0;
		currentRule = null;
		random = new Random();
	}
	
	@Override
	public void initialize() throws Exception {
		super.initialize();
		ruleProbabilities = new LinkedHashMap<String, Double>();
		for(String rule : staticReactionRates.keySet()) {
			ruleProbabilities.put(rule, 0.0);
		}
	}
	
	@Override
	public void initializeClocked() {
		super.initializeClocked();
		ruleProbabilities = new LinkedHashMap<String, Double>();
		for(String rule : staticReactionRates.keySet()) {
			ruleProbabilities.put(rule, 0.0);
		}
	}

	@Override
	public void run() throws Exception {
		while(!terminationCondition.isTerminated(state)) {
			pmc.collectAllMatches();
			// debug
			//pmc2.collectAllMatches();
			updateProbabilities();
			updateTimeStep();
			pickRule();
			if(currentRule != null) {
				if(currentRule.contains("EGFR_EGFR")) {
					System.out.println(currentRule);
				}
				IMatch rndMatch = pmc.getRandomMatch(currentRule);
				gt.applyRuleToMatch(rndMatch, currentRule);
				if(currentRule.contains("EGFR_EGFR")) {
					System.out.println(currentRule);
				}
			}
			simStats.logCurrentState(state);
			
			state.elapseTime(timeStep);
			state.incrementIterations();
		}
		pmc.collectAllMatches();

	}
	
	private void updateProbabilities() {
		systemActivity = 0;
		for(String rule : staticReactionRates.keySet()) {
			double p = pmc.getMatchCount(rule)*staticReactionRates.get(rule);
			ruleProbabilities.replace(rule, p);
			systemActivity+=p;
			// debug
			/*
			if(pmc.getMatchCount(rule) != pmc2.getMatchCount(rule)) {
				System.out.println("Count mismatch for rule: "+rule);
			}
			*/
		}
		
	}
	
	private void updateTimeStep() {
		timeStep = (1.0/systemActivity)*Math.log(1.0/random.nextDouble());
	}
	
	private void pickRule() {
		currentRule = null;
		double interval = random.nextDouble()*systemActivity;
		double p = 0;
		for(String rule : ruleProbabilities.keySet()) {
			boolean greaterThanPrevious = p < interval;
			
			p += ruleProbabilities.get(rule);
			
			if(p >=interval && greaterThanPrevious) {
				currentRule = rule;
				return;
			}
			
		}
	}

}
