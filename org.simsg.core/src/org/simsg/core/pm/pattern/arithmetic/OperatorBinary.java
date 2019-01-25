package org.simsg.core.pm.pattern.arithmetic;

public class OperatorBinary extends Operator {
	
	private OperationComponent leftOperand;
	private OperationComponent rightOperand;
	
	public OperatorBinary(org.simsg.simsgl.simSGL.Operator operator, OperationComponent leftOperand, OperationComponent rightOperand) {
		super(OperatorType.opTypeFromOperator(operator));
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}
	
	public OperationComponent getLeftOperand() {
		return leftOperand;
	}
	
	public OperationComponent getRightOperand() {
		return rightOperand;
	}
	
	@Override
	public String toString() {
		return leftOperand.toString() + opType.toString() + rightOperand.toString();
	}
	
}
