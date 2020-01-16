package org.simsg.core.simulation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import org.apache.commons.lang3.ArrayUtils;
import org.simsg.core.gt.GraphTransformationEngine;
import org.simsg.core.gt.IBeXDemoclesGT;
import org.simsg.core.gt.IBeXHiPEGT;
import org.simsg.core.gt.PostApplicationAction;
import org.simsg.core.gt.RuleApplicationCondition;
import org.simsg.core.gt.RuleParameterConfiguration;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.persistence.SimplePersistenceManager;
import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pm.ibex.IBeXDemoclesEngine;
import org.simsg.core.pm.ibex.IBeXHiPEEngine;
import org.simsg.core.pmc.IBeXPMC;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.simulation.condition.PatternTerminationCondition;
import org.simsg.core.simulation.condition.SimpleTerminationCondition;
import org.simsg.core.simulation.condition.TerminationCondition;
import org.simsg.core.simulation.constraint.ExternalConstraint;
import org.simsg.core.simulation.module.SimpleSimulation;
import org.simsg.core.simulation.module.StochasticSimulation;
import org.simsg.core.simulation.service.ServiceRoutine;
import org.simsg.core.simulation.statistic.Observables;
import org.simsg.core.simulation.statistic.SimulationStatistics;
import org.simsg.core.simulation.visualization.SimulationVisualization;

import GTLanguage.GTRule;

public class SimulationConfigurator {
	
	private String modelName;
	private String rootDataFolder;
	private String simulationDefinitonFolder;
	private String simulationResultsFolder;
	
	protected Supplier<PersistenceManager> persistenceConstructor;
	protected Supplier<PatternMatchingEngine> engineConstructor;
	protected Supplier<PatternMatchingController> pmcConstructor;
	protected Supplier<GraphTransformationEngine> gtConstructor;
	protected Supplier<Simulation> simulationConstructor;
	
	protected List<BiFunction<SimulationState, GraphTransformationEngine, ServiceRoutine>> serviceConstructors = new LinkedList<>();
	protected List<Function<SimulationState, TerminationCondition>> conditionConstructors = new LinkedList<>();
	protected List<Function<SimulationState, ExternalConstraint>> constraintConstructors = new LinkedList<>();
	protected List<Function<SimulationState, SimulationStatistics>> statisticConstructors = new LinkedList<>();
	protected List<Function<SimulationState, SimulationVisualization>> visualizationConstructors = new LinkedList<>();
	
	protected Map<String, Function<GTRule, RuleApplicationCondition>> ruleConditions = new HashMap<>();
	protected Map<String, Function<GTRule, PostApplicationAction>> ruleActions = new HashMap<>();
	protected Map<String, Function<GTRule, RuleParameterConfiguration>> ruleConfigs = new HashMap<>();
	
	public SimulationConfigurator() {
		setEMFPersistence();
		//setIBeXDemoclesAsEngine();
		setIBeXPMC();
		//setIBeXDemoclesGT();
	}
	
	public void setModel(String modelName) {
		this.modelName = modelName;
	}
	
	public void setRootDataFolder(String path) {
		this.rootDataFolder = path;
	}
	
	public void setSimulationDefinitionFolder(String path) {
		this.simulationDefinitonFolder = path;
	}
	
	public void setSimulationResultsFolder(String path) {
		this.simulationResultsFolder = path;
	}
	
	public void setPersistence(Class<? extends PersistenceManager> persistenceType, Object ... params) {
		persistenceConstructor = ()-> {
			Constructor<? extends PersistenceManager> persistenceConstructor = null;
			try {
				persistenceConstructor = persistenceType.getConstructor(parameterTypes(params));
			} catch (NoSuchMethodException | SecurityException e1) {
				e1.printStackTrace();
			}
			if(persistenceConstructor == null) return null;
			try {
				PersistenceManager persistence = persistenceConstructor.newInstance(params);
				return persistence;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
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
				engineConstructor = engineType.getConstructor(parameterTypes(params));
			} catch (NoSuchMethodException | SecurityException e1) {
				e1.printStackTrace();
			}
			if(engineConstructor == null) return null;
			try {
				PatternMatchingEngine engine = engineConstructor.newInstance(params);
				return engine;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
			return null;
		};
	}
	
	public void setIBeXDemoclesAsEngine() {
		engineConstructor = () -> {
			return new IBeXDemoclesEngine();
		};
	}
	
	public void setIBeXHiPEAsEngine() {
		engineConstructor = () -> {
			return new IBeXHiPEEngine();
		};
	}
	
	public void setPMC(Class<? extends PatternMatchingController> pmcType, Object ... params) {
		pmcConstructor = ()-> {
			Constructor<? extends PatternMatchingController> pmcConstructor = null;
			try {
				pmcConstructor = pmcType.getConstructor(parameterTypes(params));
			} catch (NoSuchMethodException | SecurityException e1) {
				e1.printStackTrace();
			}
			if(pmcConstructor == null) return null;
			try {
				PatternMatchingController pmc = pmcConstructor.newInstance(params);
				return pmc;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
			return null;
		};
	}
	
	public void setIBeXPMC() {
		pmcConstructor = () -> {
			return new IBeXPMC();
		};
	}
	
	public void setGT(Class<? extends GraphTransformationEngine> gtType, Object ... params) {
		gtConstructor = ()-> {
			Constructor<? extends GraphTransformationEngine> gtConstructor = null;
			try {
				gtConstructor = gtType.getConstructor(parameterTypes(params));
			} catch (NoSuchMethodException | SecurityException e1) {
				e1.printStackTrace();
			}
			if(gtConstructor == null) return null;
			try {
				GraphTransformationEngine gt = gtConstructor.newInstance(params);
				return gt;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
			return null;
		};
	}
	
	public void setIBeXDemoclesGT() {
		gtConstructor = () -> {
			return new IBeXDemoclesGT();
		};
	}
	
	public void setIBeXHiPEGT() {
		gtConstructor = () -> {
			return new IBeXHiPEGT();
		};
	}
	
	public void addRuleParameterConfigurator(String ruleName, Class<? extends RuleParameterConfiguration> paramType, Object ... params) {
		ruleConfigs.put(ruleName, (rule) -> {
			Constructor<? extends RuleParameterConfiguration> ruleParamConstructor = null;
			try {
				ruleParamConstructor = paramType.getConstructor(concatParamTypes(parameterTypes(params), GTRule.class));
			} catch (NoSuchMethodException | SecurityException e1) {
				e1.printStackTrace();
			}
			if(ruleParamConstructor == null) return null;
			try {
				RuleParameterConfiguration param = ruleParamConstructor.newInstance(concatParams(params, rule));
				return param;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
			return null;
		});
	}
	
	public void addRuleApplicationCondition(String ruleName, Class<? extends RuleApplicationCondition> conditionType, Object ... params) {
		ruleConditions.put(ruleName, (rule) -> {
			Constructor<? extends RuleApplicationCondition> conditionConstructor = null;
			try {
				conditionConstructor = conditionType.getConstructor(concatParamTypes(parameterTypes(params), GTRule.class));
			} catch (NoSuchMethodException | SecurityException e1) {
				e1.printStackTrace();
			}
			if(conditionConstructor == null) return null;
			try {
				RuleApplicationCondition condition = conditionConstructor.newInstance(concatParams(params, rule));
				return condition;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
			return null;
		});
	}
	
	public void addPostApplicationAction(String ruleName, Class<? extends PostApplicationAction> actionType, Object ... params) {
		ruleActions.put(ruleName, (rule) -> {
			Constructor<? extends PostApplicationAction> actionConstructor = null;
			try {
				actionConstructor = actionType.getConstructor(concatParamTypes(parameterTypes(params), GTRule.class));
			} catch (NoSuchMethodException | SecurityException e1) {
				e1.printStackTrace();
			}
			if(actionConstructor == null) return null;
			try {
				PostApplicationAction action = actionConstructor.newInstance(concatParams(params, rule));
				return action;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
			return null;
		});
	}
	
	public void addTerminationCondition(Class<? extends TerminationCondition> conditionType, Object ... params) {
		Function<SimulationState, TerminationCondition> terminationCondition = (state) -> {
			Constructor<? extends TerminationCondition> condConstructor = null;
			try {
				condConstructor = conditionType.getConstructor(concatParamTypes(parameterTypes(params), SimulationState.class));
			} catch (NoSuchMethodException | SecurityException e1) {
				e1.printStackTrace();
			}
			if(condConstructor == null) return null;
			try {
				TerminationCondition condition = condConstructor.newInstance(concatParams(params, state));
				return condition;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
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
		BiFunction<SimulationState, GraphTransformationEngine, ServiceRoutine> serviceRoutine = (state, gt) -> {
			Constructor<? extends ServiceRoutine> routineConstructor = null;
			try {
				routineConstructor = routineType.getConstructor(concatParamTypes(parameterTypes(params), SimulationState.class, GraphTransformationEngine.class));
			} catch (NoSuchMethodException | SecurityException e1) {
				e1.printStackTrace();
			}
			if(routineConstructor == null) return null;
			try {
				ServiceRoutine routine = routineConstructor.newInstance(concatParams(params, state, gt));
				return routine;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
			return null;
		};
		serviceConstructors.add(serviceRoutine);
	}
	
	public void addSimulationStatistics(Class<? extends SimulationStatistics> statisticsType, Object ... params) {
		Function<SimulationState, SimulationStatistics> simulationStatistics = (state) -> {
			Constructor<? extends SimulationStatistics> statisticsConstructor = null;
			try {
				statisticsConstructor = statisticsType.getConstructor(concatParamTypes(parameterTypes(params), SimulationState.class));
			} catch (NoSuchMethodException | SecurityException e1) {
				e1.printStackTrace();
			}
			if(statisticsConstructor == null) return null;
			try {
				SimulationStatistics statistics = statisticsConstructor.newInstance(concatParams(params, state));
				return statistics;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
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
				visualizationConstructor = visualizationType.getConstructor(concatParamTypes(parameterTypes(params), SimulationState.class));
			} catch (NoSuchMethodException | SecurityException e1) {
				e1.printStackTrace();
			}
			if(visualizationConstructor == null) return null;
			try {
				SimulationVisualization visualization = visualizationConstructor.newInstance(concatParams(params, state));
				return visualization;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
			return null;
		};
		visualizationConstructors.add(simulationVisualization);
	}
	
	public void setSimpleSimulation(boolean deterministic) {
		simulationConstructor = ()->{
			SimpleSimulation sim = new SimpleSimulation(modelName, createPersistenceManager(), createPMC(), gtConstructor.get());
			sim.useRuleRates(!deterministic);
			sim.randomizeRuleOrder(!deterministic);
			return sim;
		};
	}
	
	public void setStochasticSimulation() {
		simulationConstructor = ()-> {	
			return new StochasticSimulation(modelName, createPersistenceManager(), createPMC(), gtConstructor.get());
		};
	}
	
	public void setSimulationType(Class<? extends Simulation> simulationType, Object ... params) throws Exception {
		simulationConstructor = ()->{
			Constructor<? extends Simulation> simConstructor = null;
			try {
				simConstructor = simulationType.getConstructor(concatParamTypes(parameterTypes(params), String.class, PersistenceManager.class, PatternMatchingController.class));
			} catch (NoSuchMethodException | SecurityException e1) {
				e1.printStackTrace();
			}
			if(simConstructor == null) return null;
			try {
				Simulation sim = simConstructor.newInstance(concatParams(params, modelName, createPersistenceManager(), createPMC()));
				return sim;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
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
		
		simulation.addServiceRoutines(serviceConstructors);
		simulation.addTerminationConditions(conditionConstructors);
		simulation.addExternalConstraints(constraintConstructors);
		simulation.addSimulationStatistics(statisticConstructors);
		simulation.addSimulationVisualizations(visualizationConstructors);
		
		simulation.addRuleParameterConfigurators(ruleConfigs);
		simulation.addRuleApplicationConditions(ruleConditions);
		simulation.addPostApplicationActions(ruleActions);
		
		return simulation;
	}
	
	private PersistenceManager createPersistenceManager() {
		PersistenceManager persistence = persistenceConstructor.get();
		if(rootDataFolder == null) {
			System.out.println("Warning: No data folder has been set. Using default folder..");
		}else {
			persistence.setRootDataFolderPath(rootDataFolder);
		}
		if(simulationDefinitonFolder == null) {
			System.out.println("Warning: No simulation definition folder has been set. Using default folder..");
		}else {
			persistence.setSimulationDefinitionFolderPath(simulationDefinitonFolder);
		}
		if(simulationResultsFolder == null) {
			System.out.println("Warning: No simulation results folder has been set. Using default folder..");
		}else {
			persistence.setSimulationResultsFolderPath(simulationResultsFolder);
		}
		return persistence;
	}
	
	private PatternMatchingController createPMC() {
		PatternMatchingEngine engine = engineConstructor.get();
		PatternMatchingController pmc = pmcConstructor.get();
		pmc.setEngine(engine);
		return pmc;
	}
	
	public static Class<?>[] parameterTypes(Object ... params) {
		Class<?>[] types = new Class<?>[params.length];
		for(int i = 0; i<params.length; i++) {
			Class<?> type = params[i].getClass();
			if(com.google.common.primitives.Primitives.isWrapperType(type)) {
				types[i] = com.google.common.primitives.Primitives.unwrap(type);
			} else {
				types[i] = params[i].getClass();
			}
		}
		return types;
	}
	
	public static Class<?>[] concatParamTypes(Class<?>[] params2, Class<?> ... params1) {
		Class<?>[] types = ArrayUtils.addAll(params1, params2);
		return types;
	}
	
	public static Object[] concatParams(Object[] params2, Object ... params1) {
		Object[] params = ArrayUtils.addAll(params1, params2);
		return params;
	}
	
}
