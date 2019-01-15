package org.simsg.core.simulation;

public enum SimulationType {
	SimpleSimulation("SimpleSimulation"), StochasticSimulation("StochasticSimulation");
	
	private String name;
	
	private SimulationType(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
