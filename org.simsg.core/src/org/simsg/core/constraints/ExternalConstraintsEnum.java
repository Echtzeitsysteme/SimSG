package org.simsg.core.constraints;

public enum ExternalConstraintsEnum {
	GeometricConstraints("GeometricConstraints");
	
	private String name;
	
	private ExternalConstraintsEnum(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
