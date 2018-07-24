package biochemsimulation.simulation.matching.patterns;

public enum ConstraintType {
	equal("=="), unequal("!=");
	
	private String operator;
	private ConstraintType(String operator) {
		this.operator = operator;
	}
	
	@Override
	public String toString() {
		return operator;
	}
}
