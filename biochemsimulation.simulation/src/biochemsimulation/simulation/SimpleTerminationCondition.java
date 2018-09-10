package biochemsimulation.simulation;

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
	public boolean isTerminated(SimulationState state) {
		return state.getIterations()>=maxIterations;
	}

}
