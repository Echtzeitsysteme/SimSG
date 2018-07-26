package biochemsimulation.simulation;

public enum SimulationTerminationConditionEnum {
	
	SimpleCondition("SimpleCondition");
	
	private String name;
	
	private SimulationTerminationConditionEnum(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
