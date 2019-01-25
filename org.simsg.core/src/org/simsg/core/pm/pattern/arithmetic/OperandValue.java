package org.simsg.core.pm.pattern.arithmetic;

import org.simsg.simsgl.simSGL.NumericAssignment;
import org.simsg.simsgl.utils.PatternUtils;

public class OperandValue extends Operand {
	
	private Object parsedValue;
	
	public OperandValue(NumericAssignment numeric) {
		super(PatternUtils.contentOfNumericAssignment(numeric));
		convertValue();
	}
	
	public Object getParsedValue() {
		return parsedValue;
	}
	
	private void convertValue() {
		parsedValue = Double.parseDouble(value);
	}
}
