package org.simsg.examples.biochemistry;

import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.utils.Runtimer;

public class BiochemistrySimulation {
	
	public static void runModel(String modelName, boolean useViatra, boolean useHybridPM, boolean measureRuntime, boolean saveResult) {
		SimulationConfigurator simConfigurator = new SimulationConfigurator();
		// Set the root folder where simulation models are stored.
		simConfigurator.setModelFolder(System.getProperty("user.dir")+"//models");
		// Set the model by using the ModelID defined in the *.ssgl file
		simConfigurator.setModel(modelName);
		simConfigurator.setEMFPersistence();
		// Here you can chose which pattern matching tool should be used. This could also be Democles instead of Viatra.
		// Democles is deactivated at the moment, but will be back soon.
		if(useViatra) {
			simConfigurator.setViatraAsEngine();
		} else {
			simConfigurator.setDemoclesAsEngine();
		}
		// "Hybrid Pattern Matching" is a trick to speed up pattern matching, when disjunct patterns are involved. 
		// This is work in progress but works pretty good in this case.
		if(useHybridPM) {
			simConfigurator.setHybridPMC();
		} else {
			simConfigurator.setSimplePMC();
		}
		// Sets the type of simulation. Stochastic Simulation -> Gillespie's Algorithm
		simConfigurator.setStochasticSimulation();
		// When this is set, termination conditions defined in the model are used.
		simConfigurator.addComplexTerminationCondition();
		// Adds the standard statistics module -> plots match counts to patterns of interest over time
		simConfigurator.addObservableStatistic();
		// This creates a runnable  simulation instance
		Simulation sim = simConfigurator.createSimulation();
		// Methods with the "clocked" suffix have their runtime measured.
		if(measureRuntime) {
			sim.initializeClocked();
			sim.runClocked();
		} else {
			try {
				sim.initialize();
				sim.run();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(sim.results());
		// This calls a visualization of the tracked patterns.
		sim.displayResults();
		if(saveResult) {
			sim.saveModelGraph();
		}
		sim.finish();
		
		// Here we can get the measured runtimes
		if(measureRuntime) {
			System.out.println(Runtimer.getInstance());
		}
		
	}
	
	public static void main(String[] args) {
		runModel("Goldbeter_Koshland", true, true, true, false);
	}
}
