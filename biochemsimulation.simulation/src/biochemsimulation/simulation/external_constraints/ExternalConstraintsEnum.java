package biochemsimulation.simulation.external_constraints;

public enum ExternalConstraintsEnum {
	GeometricConstraints("GeometricConstraints");
	
	private String name;
	
	private ExternalConstraintsEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
