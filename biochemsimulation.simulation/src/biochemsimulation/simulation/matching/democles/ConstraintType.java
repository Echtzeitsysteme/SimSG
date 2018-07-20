package biochemsimulation.simulation.matching.democles;

enum ConstraintType {
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
