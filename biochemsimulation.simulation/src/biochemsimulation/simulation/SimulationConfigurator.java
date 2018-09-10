package biochemsimulation.simulation;

import biochemsimulation.simulation.matching.PatternMatchingEngine;
import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.matching.PatternMatchingEngineFactory;
import biochemsimulation.simulation.persistence.PersistenceManagerEnum;
import biochemsimulation.simulation.persistence.PersistenceManagerFactory;
import biochemsimulation.simulation.pmc.PatternMatchingController;
import biochemsimulation.simulation.pmc.PatternMatchingControllerEnum;
import biochemsimulation.simulation.pmc.PatternMatchingControllerFactory;

public class SimulationConfigurator {
	
	private String modelName;
	private PersistenceManagerEnum persistenceType;
	private PatternMatchingEngineEnum engineType;
	private PatternMatchingControllerEnum controllerType;
	private SimulationType simulationType;
	private SimulationTerminationConditionEnum conditionType;
	private int maxIterations;
	private boolean deterministic;
	
	public SimulationConfigurator() {
		deterministic = false;
	}
	
	public void setModel(String modelName) {
		this.modelName = modelName;
	}
	
	public void setSimplePersistence() {
		persistenceType = PersistenceManagerEnum.SimplePersistence;
	}
	
	public void setNeoEMFPersistence() {
		persistenceType = PersistenceManagerEnum.NeoEMFPersistence;
	}
	
	public void setViatraAsEngine() {
		engineType = PatternMatchingEngineEnum.ViatraEngine;
	}
	
	public void setDemoclesAsEngine() {
		engineType = PatternMatchingEngineEnum.DemoclesEngine;
	}
	
	public void setSimplePMC() {
		controllerType = PatternMatchingControllerEnum.SimplePMC;
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
	
	public void setSimpleTerminationCondition(int maxIterations) {
		conditionType = SimulationTerminationConditionEnum.SimpleCondition;
		this.maxIterations = maxIterations;
	}
	
	public Simulation createSimulation() {
		Simulation simulation = SimulationFactory.create(simulationType);
		simulation.setModel(modelName);
		simulation.setPersistence(PersistenceManagerFactory.create(persistenceType));
		// create and set pattern matching engine and controller
		PatternMatchingEngine engine = PatternMatchingEngineFactory.create(engineType);
		PatternMatchingController pmc = PatternMatchingControllerFactory.create(controllerType);
		pmc.setEngine(engine);
		if(deterministic && (simulationType == SimulationType.SimpleSimulation)) {
			((SimpleSimulation)simulation).useReactionRate(false);
			((SimpleSimulation)simulation).randomizeRuleOrder(false);
		}
		simulation.setPmc(pmc);
		// create and set termination condition
		SimulationTerminationCondition condition = SimulationTerminationConditionFactory.create(conditionType);
		condition.setMaxIterations(maxIterations);
		simulation.setTerminationCondition(condition);
		return simulation;
	}
	
}
