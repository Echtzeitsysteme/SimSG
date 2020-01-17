package org.simsg.core.simulation;

public abstract class SimSGAPI {
	
	final protected SimulationConfigurator configurator;
	
	protected SimSGAPI() {
		configurator = new SimulationConfigurator();
	}

	public SimulationConfigurator getSimulationConfigurator() {
		return configurator;
	}
	
	
}
