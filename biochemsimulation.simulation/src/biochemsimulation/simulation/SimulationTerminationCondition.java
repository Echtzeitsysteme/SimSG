package biochemsimulation.simulation;

import biochemsimulation.simulation.pmc.PatternMatchingController;

public interface SimulationTerminationCondition {
	
	public void setMaxIterations(int maxIterations);
	
	public boolean isTerminated(PatternMatchingController pmc);
	
}
