package org.simsg.core.simulation.condition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.simsg.core.simulation.SimulationState;
import org.simsg.simsgl.simSGL.Iterations;
import org.simsg.simsgl.simSGL.Population;
import org.simsg.simsgl.simSGL.SimSGLModel;
import org.simsg.simsgl.simSGL.Terminate;
import org.simsg.simsgl.simSGL.Time;
import org.simsg.simsgl.utils.PatternContainer;
import org.simsg.simsgl.utils.PatternUtils;

public class ComplexTerminationCondition extends TerminationCondition {

	final public static double MILLISEC = 0.001;
	
	final public static double MAX_ELAPSED_TIME = Double.MAX_VALUE;
	final public static int MAX_ITERATIONS = Integer.MAX_VALUE;
	
	protected int maxIterations = MAX_ITERATIONS;
	protected double maxElapsedTime = MAX_ELAPSED_TIME;
	
	private Map<String, Integer> terminationPatterns;
	@SuppressWarnings("unused")
	private int itStatusStep;
	private double tStatusStep;
	private double currentTStep;
	
	public ComplexTerminationCondition(SimulationState state) {
		super(state);
		initCondition();
	}

	@Override
	public boolean isTerminated() {
		/*
		if(state.getIterations()%itStatusStep==0) {
			System.out.println(100.0*(double)state.getIterations() / (double)maxIterations + "% of iterations("+state.getIterations()+") completed!");
		}
		*/
		if(state.getTime()>= currentTStep) {
			System.out.println((int)((int)(1000.0*state.getTime())/(10.0*maxElapsedTime)) + "% of simulation time completed!");
			currentTStep += tStatusStep;
		}
		if((state.getIterations()>=maxIterations) || (state.getTime() >= maxElapsedTime)) {
			return true;
		}
		
		for(String patternName : terminationPatterns.keySet()) {
			if(state.getMatchCount(patternName) >= terminationPatterns.get(patternName)) {
				return true;
			}
		}
		
		return false;
	}
	
	public void setMaxIterations(int maxIterations) {
		this.maxIterations = maxIterations;
	}
	
	public void setMaxElapsedTime(double maxElapsedTime) {
		this.maxElapsedTime = maxElapsedTime;
	}

	private void initCondition() {
		SimSGLModel ruleModel = state.getSimSGLModel();
		PatternContainer patternContainer = state.getPatternContainer();
		
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
