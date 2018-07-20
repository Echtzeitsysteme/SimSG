package biochemsimulation.simulation.matching.democles;

class LinkStateConstraint {
	private LinkStateContext operand1;
	private LinkStateContext operand2;
	private ConstraintType type;
	
	LinkStateConstraint(LinkStateContext operand1, LinkStateContext operand2, ConstraintType type) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.type = type;
	}

	LinkStateContext getOperand1() {
		return operand1;
	}

	LinkStateContext getOperand2() {
		return operand2;
	}

	ConstraintType getType() {
		return type;
	}
	
	
}
