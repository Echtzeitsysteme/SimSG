package biochemsimulation.simulation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import biochemsimulation.reactionrules.reactionRules.Iterations;
import biochemsimulation.reactionrules.reactionRules.Population;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.reactionRules.Terminate;
import biochemsimulation.reactionrules.reactionRules.Time;
import biochemsimulation.reactionrules.utils.PatternContainer;
import biochemsimulation.reactionrules.utils.PatternUtils;

public class ComplexTerminationCondition extends SimulationTerminationCondition {
	
	final public static double MILLISEC = 0.001;
	private Map<String, Integer> terminationPatterns;
	private int itStatusStep;
	private double tStatusStep;
	private double currentTStep;

	@Override
	public boolean isTerminated(SimulationState state) {
		if(state.getIterations()%itStatusStep==0) {
			System.out.println(100.0*(double)state.getIterations() / (double)maxIterations + "% of iterations("+state.getIterations()+") completed!");
		}
		if(state.getTime()>= currentTStep) {
			System.out.println(Math.ceil(100.0*state.getTime()/maxElapsedTime) + "% of simulation time completed!");
			currentTStep += tStatusStep;
		}
		if((state.getIterations()>=maxIterations) || (state.getTime() >= maxElapsedTime)) {
			return true;
		}
		
		for(String patternName : terminationPatterns.keySet()) {
			if(state.getPmc().getMatchCount(patternName) >= terminationPatterns.get(patternName)) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public void initCondition(PatternContainer patternContainer, ReactionRuleModel ruleModel) {
		terminationPatterns = new HashMap<String, Integer>();
		for(String patternName : patternContainer.getTermCondPatterns().keySet()) {
			terminationPatterns.put(patternName, 0);
		}
		
		List<Population> populations = PatternUtils.getTermCondPopulation(ruleModel);
		for(Population population : populations) {
			Terminate terminate = (Terminate) population.eContainer();
			terminationPatterns.replace(terminate.getName(), Integer.valueOf(population.getValue()));
		}
		
		List<Time> times = PatternUtils.getTermCondTime(ruleModel);
		if(times.size()>0) {
			for(Time time : times) {
				double currentTime = Double.valueOf(time.getValue())*MILLISEC;
				if(maxElapsedTime > currentTime) {
					setMaxElapsedTime(currentTime);
				}
				
			}
		}
		
		List<Iterations> iterations = PatternUtils.getTermCondIteration(ruleModel);
		if(iterations.size()>0) {
			for(Iterations iteration : iterations) {
				int currentIterations = Integer.valueOf(iteration.getValue());
				if(maxIterations > currentIterations) {
					setMaxIterations(currentIterations);
				}
			}
		}
		
		itStatusStep = maxIterations/20;
		tStatusStep = maxElapsedTime/20;
		currentTStep = 0;
		
	}

}
