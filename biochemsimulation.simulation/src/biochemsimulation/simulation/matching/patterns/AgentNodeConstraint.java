package biochemsimulation.simulation.matching.patterns;

public class AgentNodeConstraint {
	private AgentNodeContext operand1;
	private AgentNodeContext operand2;
	private ConstraintType type;
	
	public AgentNodeConstraint(AgentNodeContext operand1, AgentNodeContext operand2, ConstraintType type) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.type = type;
	}

	public AgentNodeContext getOperand1() {
		return operand1;
	}

	public AgentNodeContext getOperand2() {
		return operand2;
	}

	public ConstraintType getType() {
		return type;
	}
	
	
}
