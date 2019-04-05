package org.simsg.core.simulation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.persistence.SimplePersistenceManager;
import org.simsg.core.pm.democles.DemoclesEngineWrapper;
import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pm.viatra.ViatraEngineWrapper;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.pmc.SimplePMC;
import org.simsg.core.pmc.hybrid.HybridPMC;
import org.simsg.core.simulation.condition.PatternTerminationCondition;
import org.simsg.core.simulation.condition.SimpleTerminationCondition;
import org.simsg.core.simulation.condition.TerminationCondition;
import org.simsg.core.simulation.constraint.ExternalConstraint;
import org.simsg.core.simulation.module.SimpleSimulation;
import org.simsg.core.simulation.module.StochasticSimulation;
import org.simsg.core.simulation.service.PeriodicService;
import org.simsg.core.simulation.service.ServiceRoutine;
import org.simsg.core.simulation.statistic.Observables;
import org.simsg.core.simulation.statistic.SimulationStatistics;
import org.simsg.core.simulation.visualization.SimulationVisualization;

public class SimulationConfigurator {
	
	private String modelName;
	private String modelFolder;
	
	protected Supplier<PersistenceManager> persistenceConstructor;
	protected Supplier<PatternMatchingEngine> engineConstructor;
	protected Supplier<PatternMatchingController> pmcConstructor;
	protected Supplier<Simulation> simulationConstructor;
	
	protected List<Function<SimulationState, ServiceRoutine>> serviceConstructors = new LinkedList<>();
	protected List<Function<SimulationState, TerminationCondition>> conditionConstructors = new LinkedList<>();
	protected List<Function<SimulationState, ExternalConstraint>> constraintConstructors = new LinkedList<>();
	protected List<Function<SimulationState, SimulationStatistics>> statisticConstructors = new LinkedList<>();
	protected List<Function<SimulationState, SimulationVisualization>> visualizationConstructors = new LinkedList<>();
	
	public SimulationConfigurator() {
		setEMFPersistence();
		setViatraAsEngine();
		setSimplePMC();
	}
	
	public void setModel(String modelName) {
		this.modelName = modelName;
	}
	
	public void setModelFolder(String path) {
		this.modelFolder = path;
	}
	
	public void setPersistence(Class<? extends PersistenceManager> persistenceType, Object ... params) {
		persistenceConstructor = ()-> {
			Constructor<? extends PersistenceManager> persistenceConstructor = null;
			try {
				persistenceConstructor = persistenceType.getConstructor();
			} catch (NoSuchMethodException | SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(persistenceConstructor == null) return null;
			try {
				PersistenceManager persistence = persistenceConstructor.newInstance();
				persistence.setAdditionalParameters(params);
				return persistence;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		};
	}
	
	public void setEMFPersistence() {
		persistenceConstructor = ()-> {
			return new SimplePersistenceManager();
		};
	}
	
	public void setEngine(Class<? extends PatternMatchingEngine> engineType, Object ... params) {
		engineConstructor = ()-> {
			Constructor<? extends PatternMatchingEngine> engineConstructor = null;
			try {
				engineConstructor = engineType.getConstructor();
			} catch (NoSuchMethodException | SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(engineConstructor == null) return null;
			try {
				PatternMatchingEngine engine = engineConstructor.newInstance();
				engine.setAdditionalParameters(params);
				return engine;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		};
	}
	
	public void setViatraAsEngine() {
		engineConstructor = () -> {
			return new ViatraEngineWrapper();
		};
	}
	
	public void setDemoclesAsEngine() {
		engineConstructor = () -> {
			return new DemoclesEngineWrapper();
		};
	}
	
	public void setPMC(Class<? extends PatternMatchingController> pmcType, Object ... params) {
		pmcConstructor = ()-> {
			Constructor<? extends PatternMatchingController> pmcConstructor = null;
			try {
				pmcConstructor = pmcType.getConstructor();
			} catch (NoSuchMethodException | SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(pmcConstructor == null) return null;
			try {
				PatternMatchingController pmc = pmcConstructor.newInstance();
				pmc.setAdditionalParameters(params);
				return pmc;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		};
	}
	
	public void setSimplePMC() {
		pmcConstructor = () -> {
			return new SimplePMC();
		};
	}
	
	public void setHybridPMC() {
		pmcConstructor = () -> {
			return new HybridPMC();
		};
	}
	
	public void addTerminationCondition(Class<? extends TerminationCondition> conditionType, Object ... params) {
		Function<SimulationState, TerminationCondition> terminationCondition = (state) -> {
			Constructor<? extends TerminationCondition> condConstructor = null;
			try {
				condConstructor = conditionType.getConstructor(SimulationState.class);
			} catch (NoSuchMethodException | SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(condConstructor == null) return null;
			try {
				TerminationCondition condition = condConstructor.newInstance(state);
				condition.setAdditionalParameters(params);
				return condition;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		};
		conditionConstructors.add(terminationCondition);
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
		conditionConstructors.add((state)-> new PatternTerminationCondition(state));
	}
	
	public void addServiceRoutine(Class<? extends ServiceRoutine> routineType, Object ... params) {
		Function<SimulationState, ServiceRoutine> serviceRoutine = (state) -> {
			Constructor<? extends ServiceRoutine> routineConstructor = null;
			try {
				routineConstructor = routineType.getConstructor(SimulationState.class);
			} catch (NoSuchMethodException | SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(routineConstructor == null) return null;
			try {
				ServiceRoutine routine = routineConstructor.newInstance(state);
				routine.setAdditionalParameters(params);
				return routine;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		};
		serviceConstructors.add(serviceRoutine);
	}
	
	public void addPeriodicServiceRoutine(double servicePeriod) {
		serviceConstructors.add((state)-> {
			PeriodicService service = new PeriodicService(state);
			service.setServicePeriod(servicePeriod);
			return service;
		});
	}
	
	public void addSimulationStatistics(Class<? extends SimulationStatistics> statisticsType, Object ... params) {
		Function<SimulationState, SimulationStatistics> simulationStatistics = (state) -> {
			Constructor<? extends SimulationStatistics> statisticsConstructor = null;
			try {
				statisticsConstructor = statisticsType.getConstructor(SimulationState.class);
			} catch (NoSuchMethodException | SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(statisticsConstructor == null) return null;
			try {
				SimulationStatistics statistics = statisticsConstructor.newInstance(state);
				statistics.setAdditionalParameters(params);
				return statistics;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		};
		statisticConstructors.add(simulationStatistics);
	}
	
	public void addObservableStatistic() {
		statisticConstructors.add((state)->new Observables(state));
	}
	
	public void addSimulationVisualization(Class<? extends SimulationVisualization> visualizationType, Object ... params) {
		Function<SimulationState, SimulationVisualization> simulationVisualization = (state) -> {
			Constructor<? extends SimulationVisualization> visualizationConstructor = null;
			try {
				visualizationConstructor = visualizationType.getConstructor(SimulationState.class);
			} catch (NoSuchMethodException | SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(visualizationConstructor == null) return null;
			try {
				SimulationVisualization visualization = visualizationConstructor.newInstance(state);
				visualization.setAdditionalParameters(params);
				return visualization;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		};
		visualizationConstructors.add(simulationVisualization);
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
		simulation.addSimulationVisualization(visualizationConstructors);
		
		return simulation;
	}
	
	private PersistenceManager createPersistenceManager() {
		PersistenceManager persistence = persistenceConstructor.get();
		if(modelFolder == null) {
			System.out.println("Warning: No model folder has been set. Using default folder..");
		}else {
			persistence.setModelFolderPath(modelFolder);
		}
		return persistence;
	}
	
	private PatternMatchingController createPMC() {
		PatternMatchingEngine engine = engineConstructor.get();
		PatternMatchingController pmc = pmcConstructor.get();
		pmc.setEngine(engine);
		return pmc;
	}
	
}
