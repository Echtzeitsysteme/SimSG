package SimSG.Core.Simulation;

import SimSG.Core.PM.Match.PatternMatchingEngine;
import SimSG.Core.PM.Match.PatternMatchingEngineEnum;
import SimSG.Core.PM.Match.PatternMatchingEngineFactory;
import SimSG.Core.PMC.PatternMatchingController;
import SimSG.Core.PMC.PatternMatchingControllerEnum;
import SimSG.Core.PMC.PatternMatchingControllerFactory;
import SimSG.Core.Persistence.PersistenceManager;
import SimSG.Core.Persistence.PersistenceManagerEnum;
import SimSG.Core.Persistence.PersistenceManagerFactory;

public class SimulationConfigurator {
	
	private String modelName;
	private String modelFolder;
	private PersistenceManagerEnum persistenceType;
	private PatternMatchingEngineEnum engineType;
	private PatternMatchingControllerEnum controllerType;
	private SimulationType simulationType;
	private SimulationTerminationConditionEnum conditionType;
	private int maxIterations;
	private double maxElapsedTime;
	private boolean deterministic;
	
	public SimulationConfigurator() {
		deterministic = false;
		conditionType = SimulationTerminationConditionEnum.ComplexCondition;
		persistenceType = PersistenceManagerEnum.SimplePersistence;
	}
	
	public void setModel(String modelName) {
		this.modelName = modelName;
	}
	
	public void setEMFPersistence() {
		persistenceType = PersistenceManagerEnum.SimplePersistence;
	}
	
	public void setModelFolder(String path) {
		this.modelFolder = path;
	}
	
	public void setViatraAsEngine(boolean parallel) {
		if(parallel) {
			engineType = PatternMatchingEngineEnum.ParallelViatraEngine;
		}else {
			engineType = PatternMatchingEngineEnum.ViatraEngine;
		}
	}
	
	public void setDemoclesAsEngine() {
		engineType = PatternMatchingEngineEnum.DemoclesEngine;
	}
	
	public void setSimplePMC() {
		controllerType = PatternMatchingControllerEnum.SimplePMC;
	}
	
	public void setHybridPMC() {
		controllerType = PatternMatchingControllerEnum.HybridPMC;
	}
	
	public void setPMCDeterministic(boolean deterministic) {
		this.deterministic = deterministic;
	}
	
	public void setSimpleSimulation() {
		simulationType = SimulationType.SimpleSimulation;
	}
	
	public void setStochasticSimulation() {
		simulationType = SimulationType.StochasticSimulation;
	}
	
	public void setSimpleTerminationCondition(int maxIterations, double maxElapsedTime) {
		conditionType = SimulationTerminationConditionEnum.SimpleCondition;
		this.maxIterations = maxIterations;
		this.maxElapsedTime = maxElapsedTime;
	}
	
	public void setComplexTerminationCondition() {
		conditionType = SimulationTerminationConditionEnum.ComplexCondition;
		this.maxIterations = SimulationTerminationCondition.MAX_ITERATIONS;
		this.maxElapsedTime = SimulationTerminationCondition.MAX_ELAPSED_TIME;
	}
	
	public Simulation createSimulation() {
		Simulation simulation = SimulationFactory.create(simulationType);
		simulation.setModel(modelName);
		PersistenceManager persistence = PersistenceManagerFactory.create(persistenceType);
		if(modelFolder == null) {
			System.out.println("Warning: No model folder has been set. Using default folder..");
		}else {
			persistence.setModelFolderPath(modelFolder);
		}
		simulation.setPersistence(persistence);
		// create and set pattern matching engine and controller
		PatternMatchingEngine engine = PatternMatchingEngineFactory.create(engineType);
		PatternMatchingController pmc = PatternMatchingControllerFactory.create(controllerType);
		pmc.setEngine(engine);
		
		// debug
		PatternMatchingEngine engine2 = PatternMatchingEngineFactory.create(engineType);
		PatternMatchingController pmc2 = PatternMatchingControllerFactory.create(PatternMatchingControllerEnum.SimplePMC);
		pmc2.setEngine(engine2);
		
		if(deterministic && (simulationType == SimulationType.SimpleSimulation)) {
			((SimpleSimulation)simulation).useReactionRate(false);
			((SimpleSimulation)simulation).randomizeRuleOrder(false);
		}
		simulation.setPmc(pmc);
		// debug
		simulation.setPmc2(pmc2);
		
		// create and set termination condition
		SimulationTerminationCondition condition = SimulationTerminationConditionFactory.create(conditionType);
		condition.setMaxIterations(maxIterations);
		condition.setMaxElapsedTime(maxElapsedTime);
		simulation.setTerminationCondition(condition);
		return simulation;
	}
	
}
