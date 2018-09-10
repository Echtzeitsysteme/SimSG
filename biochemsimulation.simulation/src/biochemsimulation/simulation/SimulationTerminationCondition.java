package biochemsimulation.simulation;

public interface SimulationTerminationCondition {
	
	public void setMaxIterations(int maxIterations);
	
	public boolean isTerminated(SimulationState state);
	
}
