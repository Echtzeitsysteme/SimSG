package org.simsg.core.pm.pattern.arithmetic;

import org.simsg.core.pm.pattern.AttributeContext;

public class OperandVariable extends Operand {
	
	protected String variableName;
	protected String attributeName;
	
	protected AttributeContext context;

	public OperandVariable(AttributeContext context) {
		super(context.getAttributeVariableName());
		this.context = context;
	}
	
	public AttributeContext getAttributeContext() {
		return context;
	}
	
}
