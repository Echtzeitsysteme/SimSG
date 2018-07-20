package biochemsimulation.simulation.matching.democles;

class AgentNodeConstraint {
	private AgentNodeContext operand1;
	private AgentNodeContext operand2;
	private ConstraintType type;
	
	AgentNodeConstraint(AgentNodeContext operand1, AgentNodeContext operand2, ConstraintType type) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.type = type;
	}

	AgentNodeContext getOperand1() {
		return operand1;
	}

	AgentNodeContext getOperand2() {
		return operand2;
	}

	ConstraintType getType() {
		return type;
	}
	
	
}
