package biochemsimulation.simulation.pmc;

public enum PatternMatchingControllerEnum {
	SimpleController("SimpleController");
	
	private String name;
	
	private PatternMatchingControllerEnum(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
