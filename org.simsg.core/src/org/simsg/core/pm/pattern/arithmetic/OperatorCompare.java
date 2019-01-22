package org.simsg.core.pm.pattern.arithmetic;

import org.simsg.simsgl.simSGL.Comparator;

public class OperatorCompare extends Operator {

	public OperatorCompare(Comparator compare) {
		super(OperatorType.opTypeFromOperator(compare));
	}
}
