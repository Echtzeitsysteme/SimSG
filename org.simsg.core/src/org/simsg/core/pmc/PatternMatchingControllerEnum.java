package org.simsg.core.pmc;

public enum PatternMatchingControllerEnum {
	SimplePMC("SimplePMC"), HybridPMC("HybridPMC");
	
	private String name;
	
	private PatternMatchingControllerEnum(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
