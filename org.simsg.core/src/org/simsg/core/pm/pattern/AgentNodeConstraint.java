package org.simsg.core.pm.pattern;

import java.util.Objects;

public class AgentNodeConstraint {
	private AgentNodeContext operand1;
	private AgentNodeContext operand2;
	private ConstraintType type;
	private boolean local;
	
	public AgentNodeConstraint(AgentNodeContext operand1, AgentNodeContext operand2, ConstraintType type) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.type = type;
		local = false;
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
	
	public void setLocal() {
		local = true;
	}
	
	public boolean isLocal() {
		return local;
	}
	
	@Override
	public int hashCode() {
		int fwd = Objects.hash(operand1, operand2);
		int bwd = Objects.hash(operand2, operand1);
		return (fwd>bwd)?fwd:bwd;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof AgentNodeConstraint)) return false;
		AgentNodeConstraint other = (AgentNodeConstraint)obj;
		return (operand1 == other.operand1 && operand2 == other.operand2) || (operand2 == other.operand1 && operand1 == other.operand2);
	}
	
}
