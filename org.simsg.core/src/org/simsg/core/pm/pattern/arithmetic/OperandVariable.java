package org.simsg.core.pm.pattern.arithmetic;

import org.simsg.simsgl.simSGL.AttributeOperand;
import org.simsg.simsgl.simSGL.AttributeOperandGeneric;

public class OperandVariable extends Operand {
	
	protected String variableName;
	protected String attributeName;

	public OperandVariable(AttributeOperand operand) {
		super(null);
		variableName = operand.getAgent().getName();
		if(operand instanceof AttributeOperandGeneric) {
			attributeName = ((AttributeOperandGeneric)operand).getAttribute().getAttribute().getName();
		}else {
			attributeName = "ID";
		}
		value = variableName+"."+attributeName;
	}
}
