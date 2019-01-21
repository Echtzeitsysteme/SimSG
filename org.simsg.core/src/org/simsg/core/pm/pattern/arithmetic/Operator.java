package org.simsg.core.pm.pattern.arithmetic;

public class Operator extends OperationComponent {
	protected OperatorType opType;
	
	protected Operator(OperatorType opType) {
		this.opType = opType;
	}
	
	@Override
	public String toString() {
		return opType.toString();
	}
}
