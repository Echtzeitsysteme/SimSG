package org.simsg.core.simulation;

import org.simsg.core.simulation.module.SimpleSimulation;
import org.simsg.core.simulation.module.StochasticSimulation;

public class SimulationFactory {
	public static Simulation create(SimulationType type) {
		Simulation sim = null;
		
		switch(type) {
		case SimpleSimulation : {
			sim = new SimpleSimulation();
			break;
		}
		
		case StochasticSimulation : {
			sim = new StochasticSimulation();
			break;
		}
		}
		
		return sim;
	}
}
