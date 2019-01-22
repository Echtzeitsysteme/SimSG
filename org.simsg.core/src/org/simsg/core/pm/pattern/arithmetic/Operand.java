package org.simsg.core.pm.pattern.arithmetic;

public class Operand extends OperationComponent {
	protected String value;
	
	protected Operand(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
