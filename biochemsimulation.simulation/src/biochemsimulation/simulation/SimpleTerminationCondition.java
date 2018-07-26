package biochemsimulation.simulation;

import biochemsimulation.simulation.pmc.PatternMatchingController;

public class SimpleTerminationCondition implements SimulationTerminationCondition {
	
	private int maxIterations;
	
	public SimpleTerminationCondition() {
	}
	
	public SimpleTerminationCondition(int maxIterations) {
		this.maxIterations = maxIterations;
	}
	
	@Override
	public void setMaxIterations(int maxIterations) {
		this.maxIterations = maxIterations;
	}

	@Override
	public boolean isTerminated(PatternMatchingController pmc) {
		return pmc.getIterations()>=maxIterations;
	}

}
