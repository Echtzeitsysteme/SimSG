package org.simsg.core.pm.pattern.arithmetic;

import org.simsg.simsgl.simSGL.NumericAssignment;
import org.simsg.simsgl.utils.PatternUtils;

public class OperandValue extends Operand {

	public OperandValue(NumericAssignment numeric) {
		super(PatternUtils.contentOfNumericAssignment(numeric));
	}
}
