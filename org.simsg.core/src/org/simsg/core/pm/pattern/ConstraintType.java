package org.simsg.core.pm.pattern;

public enum ConstraintType {
	injectivity("!="), order(">");
	
	private String operator;
	private ConstraintType(String operator) {
		this.operator = operator;
	}
	
	@Override
	public String toString() {
		return operator;
	}
}
