package biochemsimulation.simulation.matching.patterns;

public class LinkStateConstraint {
	private LinkStateContext operand1;
	private LinkStateContext operand2;
	private ConstraintType type;
	
	public LinkStateConstraint(LinkStateContext operand1, LinkStateContext operand2, ConstraintType type) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.type = type;
	}

	public LinkStateContext getOperand1() {
		return operand1;
	}

	public LinkStateContext getOperand2() {
		return operand2;
	}

	public ConstraintType getType() {
		return type;
	}
	
	
}
