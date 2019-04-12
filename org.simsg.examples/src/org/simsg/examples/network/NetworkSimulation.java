package org.simsg.examples.network;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.simsg.core.gt.GraphTransformationEngine;
import org.simsg.core.gt.IBeXGT;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.persistence.SimplePersistenceManager;
import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pm.ibex.IBeXDemoclesEngine;
import org.simsg.core.pmc.IBeXPMC;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.utils.Runtimer;
import org.simsg.examples.network.generator.NetworkGenerator;
import org.simsg.examples.network.generator.NetworkType;
import org.simsg.examples.network.statistics.ModelGraphProperties;
import org.simsg.simulationdefinition.utils.SimulationDefinitionGenerator; 

import SimulationDefinition.SimDefinition;

public class NetworkSimulation {
	
	public static void runSimSGLModel(String modelName, boolean useViatra, boolean useHybridPM, boolean measureRuntime, boolean saveResult) {
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
		// Adds statistics module that tracks network graph properties
		simConfigurator.addSimulationStatistics(ModelGraphProperties.class);
		// Adds a periodic service interval during which the kTC repair rules are applied
		//simConfigurator.addPeriodicServiceRoutine(60);
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
				e.printStackTrace();
			}
		}
		sim.printCurrentMatches();
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
	
	public static void generateSimSGLNetwork(String modelName, NetworkType type, int numOfNodes) {
		NetworkGenerator ng = new NetworkGenerator("modelName", type, numOfNodes);
		ng.buildNetwork(100);
		ng.generateSimSGLModel();
	}
	
	public static void generateComputerNetwork(String modelName, int numOfNodes, double mX, double mY) {
		NetworkGenerator ng = new NetworkGenerator(modelName, NetworkType.FullMesh, numOfNodes);
		ng.buildNetwork(mX, mY, 0);
		ng.displayModel();
		ng.generateNetworkModel("models/SimulationModels/"+modelName+".xmi");
	}
	
	public static void generateNetworkSimulation(String modelName) {
		SimulationDefinitionGenerator gen = new SimulationDefinitionGenerator(modelName);
		gen.setGtRules("src-gen/org/simsg/examples/network/api/gt-rules.xmi");
		gen.setIBeXPatterns("src-gen/org/simsg/examples/network/api/ibex-patterns.xmi");
		gen.setMetaModel("F:\\Eclipse Workspaces\\SimSG\\org.simsg.examples.network\\model\\ComputerNetwork.ecore");
		//gen.setMetaModel(URI.createFileURI("http://www.simsg.org/examples/ComputerNetwork"));
		gen.setModelURI("models/SimulationModels/"+modelName+".xmi");
		gen.addRuleRateAnnotation("deleteLink", 0.2);
		gen.addRuleRateAnnotation("changeWeight", 0.2);
		gen.addRuleRateAnnotation("createLink", 0.1);
		gen.addPatternObservation("link");
		gen.addPatternObservation("unknown");
		gen.addPatternObservation("active");
		gen.addPatternObservation("inactive");
		gen.addPatternObservation("deleted");
		//gen.addTerminationConditionIterations(500);
		gen.addTerminationConditionTime(15);
		System.out.println(gen);
		gen.saveDefinition("models/SimulationDefinitions/"+modelName+".xmi");
	}
	
	public static void main(String[] args) {
		//runSimSGLModel("NetworkExample", true, false, true, false);
		//generateComputerNetwork("testNetwork1", 15, 50, 50);
		generateNetworkSimulation("testNetwork1");
		
		SimulationConfigurator config = new SimulationConfigurator();
		config.setModelFolder(System.getProperty("user.dir")+"//models");
		config.setModel("testNetwork1");
		config.setStochasticSimulation();
		
		config.addRuleApplicationCondition("gKTCpowerUp", PowerUpCondition.class, 1.0);
		config.addRuleApplicationCondition("iKTCpowerDown2", PowerDownCondition.class, 1.0);
		config.addPostApplicationAction("changeWeight", ChangeWeightAction.class, 10.0);
		config.addPostApplicationAction("aCreateLink2", CreateLinkAction.class);
		
		config.addServiceRoutine(KTCPeriodicService.class, 5.0);
		
		Simulation sim = config.createSimulation();
		sim.initialize();
		sim.run();
		sim.printCurrentMatches();
		sim.displayResults();
		//sim.displayVisualizations();
		sim.finish();
		
		
	}
}
