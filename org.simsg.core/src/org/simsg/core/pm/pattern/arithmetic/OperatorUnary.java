package org.simsg.core.pm.pattern.arithmetic;

import java.util.List;

import org.simsg.simsgl.simSGL.UnaryOperation;

public class OperatorUnary extends Operator {
	
	private List<OperationComponent> childOperations;

	public OperatorUnary(UnaryOperation operation, List<OperationComponent> childOperations) {
		super(OperatorType.opTypeFromOperator(operation));
		this.childOperations = childOperations;
	}
	
	public List<OperationComponent> getChildOperations() {
		return childOperations;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(opType.toString());
		sb.append("(");
		for(OperationComponent component : childOperations) {
			sb.append(component.toString());
		}
		sb.append(")");
		return sb.toString();
	}

}
