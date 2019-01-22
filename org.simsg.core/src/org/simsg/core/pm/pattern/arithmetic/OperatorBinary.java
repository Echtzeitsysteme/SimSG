package org.simsg.core.pm.pattern.arithmetic;

public class OperatorBinary extends Operator {
	
	public OperatorBinary(org.simsg.simsgl.simSGL.Operator operator) {
		super(OperatorType.opTypeFromOperator(operator));
	}
	
}
