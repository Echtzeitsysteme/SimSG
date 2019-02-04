package org.simsg.core.simulation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.persistence.PersistenceManagerEnum;
import org.simsg.core.persistence.PersistenceManagerFactory;
import org.simsg.core.pm.match.PatternMatchingEngine;
import org.simsg.core.pm.match.PatternMatchingEngineEnum;
import org.simsg.core.pm.match.PatternMatchingEngineFactory;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.pmc.PatternMatchingControllerEnum;
import org.simsg.core.pmc.PatternMatchingControllerFactory;
import org.simsg.core.simulation.condition.ComplexTerminationCondition;
import org.simsg.core.simulation.condition.SimpleTerminationCondition;
import org.simsg.core.simulation.condition.TerminationCondition;
import org.simsg.core.simulation.constraint.ExternalConstraint;
import org.simsg.core.simulation.module.SimpleSimulation;
import org.simsg.core.simulation.module.StochasticSimulation;
import org.simsg.core.simulation.service.PeriodicService;
import org.simsg.core.simulation.service.ServiceRoutine;
import org.simsg.core.simulation.statistic.Observables;
import org.simsg.core.simulation.statistic.SimulationStatistics;

public class SimulationConfigurator {
	
	private String modelName;
	private String modelFolder;
	
	private PersistenceManagerEnum persistenceType;
	private PatternMatchingEngineEnum engineType;
	private PatternMatchingControllerEnum controllerType;
	
	protected Supplier<Simulation> simulationConstructor;
	
	protected List<Function<SimulationState, ServiceRoutine>> serviceConstructors = new LinkedList<>();
	protected List<Function<SimulationState, TerminationCondition>> conditionConstructors = new LinkedList<>();
	protected List<Function<SimulationState, ExternalConstraint>> constraintConstructors = new LinkedList<>();
	protected List<Function<SimulationState, SimulationStatistics>> statisticConstructors = new LinkedList<>();
	
	public SimulationConfigurator() {
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
	
	public void setViatraAsEngine() {
		engineType = PatternMatchingEngineEnum.ViatraEngine;
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
	
	public void addSimpleTerminationCondition(int maxIterations, double maxElapsedTime) {
		conditionConstructors.add((state)-> {
			SimpleTerminationCondition condition = new SimpleTerminationCondition(state);
			condition.setMaxElapsedTime(maxElapsedTime);
			condition.setMaxIterations(maxIterations);
			return condition;
		});
	}
	
	public void addComplexTerminationCondition() {
		conditionConstructors.add((state)-> new ComplexTerminationCondition(state));
	}
	
	public void addPeriodicServiceRoutine(double servicePeriod) {
		serviceConstructors.add((state)-> {
			PeriodicService service = new PeriodicService(state);
			service.setServicePeriod(servicePeriod);
			return service;
		});
	}
	
	public void addObservableStatistic() {
		statisticConstructors.add((state)->new Observables(state));
	}
	
	public void setSimpleSimulation(boolean deterministic) {
		simulationConstructor = ()->{
			SimpleSimulation sim = new SimpleSimulation(modelName, createPersistenceManager(), createPMC());
			sim.useReactionRate(!deterministic);
			sim.randomizeRuleOrder(!deterministic);
			return sim;
		};
	}
	
	public void setStochasticSimulation() {
		simulationConstructor = ()-> {	
			return new StochasticSimulation(modelName, createPersistenceManager(), createPMC());
		};
	}
	
	public void setSimulationType(Class<? extends Simulation> simulationType, Object ... params) throws Exception {
		simulationConstructor = ()->{
			Constructor<? extends Simulation> simConstructor = null;
			try {
				simConstructor = simulationType.getConstructor();
			} catch (NoSuchMethodException | SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(simConstructor == null) return null;
			try {
				Simulation sim = simConstructor.newInstance(modelName, createPersistenceManager(), createPMC());
				sim.setAdditionalParameters(params);
				return sim;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		};
	}
	
	public Simulation createSimulation() {
		Simulation simulation = simulationConstructor.get();
		
		if(conditionConstructors.isEmpty()) System.out.println("Warning: No termination condition was specified. Simulation will run indefinetly.");
		if(!constraintConstructors.isEmpty()) System.out.println("Info: Additional external constraints were specified.");
		if(statisticConstructors.isEmpty()) System.out.println("Info: No simulation statistic modules were specified.");
		
		simulation.addServiceRoutine(serviceConstructors);
		simulation.addTerminationConditions(conditionConstructors);
		simulation.addExternalConstraints(constraintConstructors);
		simulation.addSimulationStatistics(statisticConstructors);
		
		return simulation;
	}
	
	private PersistenceManager createPersistenceManager() {
		PersistenceManager persistence = PersistenceManagerFactory.create(persistenceType);
		if(modelFolder == null) {
			System.out.println("Warning: No model folder has been set. Using default folder..");
		}else {
			persistence.setModelFolderPath(modelFolder);
		}
		return persistence;
	}
	
	private PatternMatchingController createPMC() {
		PatternMatchingEngine engine = PatternMatchingEngineFactory.create(engineType);
		PatternMatchingController pmc = PatternMatchingControllerFactory.create(controllerType);
		pmc.setEngine(engine);
		return pmc;
	}
	
}
