package biochemsimulation.simulation.pmc;

public enum PatternMatchingControllerEnum {
	SimpleViatraPMC("SimpleViatraPMC"), SimpleDemoclesPMC("SimpleDemoclesPMC");
	
	private String name;
	
	private PatternMatchingControllerEnum(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
