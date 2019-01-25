package org.simsg.core.pm.pattern.arithmetic;

import org.simsg.simsgl.simSGL.UnaryOperation;

public class OperatorUnary extends Operator {
	
	private OperationComponent childOperation;

	public OperatorUnary(UnaryOperation operation, OperationComponent childOperation) {
		super(OperatorType.opTypeFromOperator(operation));
		this.childOperation = childOperation;
	}
	
	public OperationComponent getChildOperation() {
		return childOperation;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(opType.toString());
		sb.append("(");
		sb.append(childOperation.toString());
		sb.append(")");
		return sb.toString();
	}

}
