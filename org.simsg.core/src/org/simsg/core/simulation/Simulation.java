package org.simsg.core.simulation;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXModel;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRule;
import org.simsg.core.gt.GraphTransformationEngine;
import org.simsg.core.gt.PostApplicationAction;
import org.simsg.core.gt.RuleApplicationCondition;
import org.simsg.core.gt.RuleParameterConfiguration;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.simulation.condition.PatternTerminationCondition;
import org.simsg.core.simulation.condition.SimpleTerminationCondition;
import org.simsg.core.simulation.condition.TerminationCondition;
import org.simsg.core.simulation.constraint.ExternalConstraint;
import org.simsg.core.simulation.service.ServiceRoutine;
import org.simsg.core.simulation.statistic.Observables;
import org.simsg.core.simulation.statistic.SimulationStatistics;
import org.simsg.core.simulation.visualization.SimulationVisualization;
import org.simsg.core.utils.Runtimer;

import SimulationDefinition.SimDefinition;


public abstract class Simulation implements SimulationProcess{
	private int debugLevel = CONSOLE_LEVEL_NONE;
	
	protected String modelName;
	protected PersistenceManager persistence;
	private PatternMatchingController pmc;
	protected SimulationState state;
	protected SimDefinition simulationDefinition;
	protected IBeXModel ibexModel;
	protected Resource simulationModel;
	private GraphTransformationEngine gt;
	
	protected List<BiFunction<SimulationState, GraphTransformationEngine, ServiceRoutine>> serviceConstructors = new LinkedList<>();
	protected List<Function<SimulationState, TerminationCondition>> conditionConstructors = new LinkedList<>();
	protected List<Function<SimulationState, ExternalConstraint>> constraintConstructors = new LinkedList<>();
	protected List<Function<SimulationState, SimulationStatistics>> statisticConstructors = new LinkedList<>();
	protected List<Function<SimulationState, SimulationVisualization>> visualizationConstructors = new LinkedList<>();
	
	protected List<ServiceRoutine> services = new LinkedList<>();
	protected List<TerminationCondition> conditions = new LinkedList<>();
	protected List<ExternalConstraint> constraints = new LinkedList<>();
	protected List<SimulationStatistics> statistics = new LinkedList<>();
	protected List<SimulationVisualization> visualizations = new LinkedList<>();
	
	protected Map<String, Function<IBeXRule, RuleApplicationCondition>> ruleConditions = new HashMap<>();
	protected Map<String, Function<IBeXRule, PostApplicationAction>> ruleActions = new HashMap<>();
	protected Map<String, Function<IBeXRule, RuleParameterConfiguration>> ruleConfigs = new HashMap<>();
	
	private boolean paused = false;
	private Consumer<Simulation> notifier;
	
	public Simulation(String modelName, BackendContainer backend) {
		this.modelName = modelName;
		this.persistence = backend.persistence;
		this.pmc = backend.pmc;
		this.gt = backend.gtEngine;
	}
	
	public Simulation(String modelName, PersistenceManager persistence, PatternMatchingController pmc, GraphTransformationEngine gt) {
		this.modelName = modelName;
		this.persistence = persistence;
		this.pmc = pmc;
		this.gt = gt;
	}
	
	public void addServiceRoutines(List<BiFunction<SimulationState, GraphTransformationEngine, ServiceRoutine>> constructors) {
		serviceConstructors.addAll(constructors);
	}
	
	public void addTerminationConditions(List<Function<SimulationState, TerminationCondition>> constructors) {
		conditionConstructors.addAll(constructors);
	}
	
	public void addExternalConstraints(List<Function<SimulationState, ExternalConstraint>> constructors) {
		constraintConstructors.addAll(constructors);
	}
	
	public void addSimulationStatistics(List<Function<SimulationState, SimulationStatistics>> constructors) {
		statisticConstructors.addAll(constructors);
	}
	
	public void addSimulationVisualizations(List<Function<SimulationState, SimulationVisualization>> constructors) {
		visualizationConstructors.addAll(constructors);
	}
	
	public void addRuleParameterConfigurators(Map<String, Function<IBeXRule, RuleParameterConfiguration>> constructors) {
		ruleConfigs.putAll(constructors);
	}
	
	public void addRuleApplicationConditions(Map<String, Function<IBeXRule, RuleApplicationCondition>> constructors) {
		ruleConditions.putAll(constructors);
	}
	
	public void addPostApplicationActions(Map<String, Function<IBeXRule, PostApplicationAction>> constructors) {
		ruleActions.putAll(constructors);
	}
	
	@Override
	public void initialize() {
		initModel();
		initPMC();	
		initGT();
		
		initState();
		
		initializeServices();
		initializeConditions();
		initializeConstraints();
		initializeStatistics();
		initializeVisualizations();
		
		initializeRuleConfigurators();
		initializeRuleConditions();
		initializeRuleActions();
	}
	
	private void initModel() {
		persistence.init();
		simulationDefinition = persistence.loadSimulationDefinition(modelName);
		ibexModel = persistence.loadIBeXModel(simulationDefinition);
		simulationModel = persistence.loadSimulationModel(simulationDefinition);
	}
	
	private void initPMC() {
		pmc.loadModels(simulationDefinition, ibexModel, simulationModel);
		pmc.initController();
		pmc.initEngine();
	}
	
	private void initGT() {
		gt.setModels(simulationDefinition, ibexModel, simulationModel);
		gt.init();
	}
	
	private void initState() {
		state = new SimulationState();
		state.setPmc(pmc);
	}
	
	private void initializeServices() {
		for(BiFunction<SimulationState, GraphTransformationEngine, ServiceRoutine> constructor : serviceConstructors) {
			services.add(constructor.apply(state, gt));
		}
	}
	
	private void initializeConditions() {
		for(Function<SimulationState, TerminationCondition> constructor : conditionConstructors) {
			conditions.add(constructor.apply(state));
		}
		for(SimulationDefinition.TerminationCondition term : simulationDefinition.getTerminationConditions()) {
			if(term instanceof SimulationDefinition.SimpleTerminationCondition) {
				TerminationCondition tc = new SimpleTerminationCondition(state, (SimulationDefinition.SimpleTerminationCondition)term);
				tc.setConsoleInfoLevel(debugLevel);
				conditions.add(tc);
			} else if(term instanceof SimulationDefinition.PatternTerminationCondition) {
				TerminationCondition tc = new PatternTerminationCondition(state, (SimulationDefinition.PatternTerminationCondition)term);
				tc.setConsoleInfoLevel(debugLevel);
				conditions.add(tc);
			}
			
		}
		if(conditions.isEmpty()) {
			if(debugLevel <= SimulationProcess.CONSOLE_LEVEL_INFO)
				if(conditionConstructors.isEmpty()) System.out.println("Warning: No termination condition was specified. Simulation will run indefinetly.");
		}
	}
	
	private void initializeConstraints() {
		for(Function<SimulationState, ExternalConstraint> constructor : constraintConstructors) {
			constraints.add(constructor.apply(state));
		}
	}
	
	private void initializeStatistics() {
		for(Function<SimulationState, SimulationStatistics> constructor : statisticConstructors) {
			statistics.add(constructor.apply(state));
		}
		
		if(simulationDefinition.getObservations().isEmpty()) return;
		statistics.add(new Observables(state, simulationDefinition.getObservations()));
	}
	
	private void initializeVisualizations() {
		for(Function<SimulationState, SimulationVisualization> constructor : visualizationConstructors) {
			visualizations.add(constructor.apply(state));
		}
	}
	
	private void initializeRuleConfigurators() {
		for(String ruleName : ruleConfigs.keySet()) {
			IBeXRule rule = gt.getRule(ruleName);
			gt.addRuleParameterConfiguration(ruleConfigs.get(ruleName).apply(rule));
		}
	}
	
	private void initializeRuleConditions() {
		for(String ruleName : ruleConditions.keySet()) {
			IBeXRule rule = gt.getRule(ruleName);
			pmc.getEngine().addRuleApplicationCondition(ruleConditions.get(ruleName).apply(rule));
		}
	}
	
	private void initializeRuleActions() {
		for(String ruleName : ruleActions.keySet()) {
			IBeXRule rule = gt.getRule(ruleName);
			gt.addPostApplicationAction(ruleActions.get(ruleName).apply(rule));
		}
	}
	
	public void initializeClocked() {
		Runtimer timer = Runtimer.getInstance();
		timer.measure(this, "Initialize(1): Simulation setup", () -> {
				timer.measure(this, "Initialize(1.1): Models", () -> {
					try {
						initModel();
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
				timer.measure(this, "Initialize(1.2): PMC", () -> {
					try {
						initPMC();
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
				timer.measure(this, "Initialize(1.3): GT", this::initGT);
				timer.measure(this, "Initialize(1.4): State", this::initState);
				timer.measure(this, "Initialize(1.5): Service Routines", this::initializeServices);
				timer.measure(this, "Initialize(1.6): Termination Conditions", this::initializeConditions);
				timer.measure(this, "Initialize(1.7): External Constraints", this::initializeConstraints);
				timer.measure(this, "Initialize(1.8): Simulation Statistics", this::initializeStatistics);
		});
	}
	
	public void runClocked() {
		Runtimer timer = Runtimer.getInstance();
		timer.measure(this, "Run(2): Simulation", () -> {
			try {
				run();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
	
	@Override
	public synchronized void run() {
		if(debugLevel <= CONSOLE_LEVEL_INFO)
			System.out.println("Start..");
		
		while(!paused && !checkTerminationConditions()) {
			if(state.isDirty()) {
				if(state.refreshState()) {
					throw new RuntimeException("Something went wrong.. Exit.");
				}
			}
			updateStatistics();
			
			updateEvents();
			if(performServiceInterval()) {
				updateEvents();
			}
			processNextEvent();
			state.incrementIterations();
		}
		
		if(debugLevel <= CONSOLE_LEVEL_INFO)
			System.out.println("Stop.");
		
		if(notifier != null) {
			if(debugLevel == CONSOLE_LEVEL_DEBUG)
				System.out.println("Notify..");
			
			notifier.accept(this);
		}
	}
	
	public boolean saveModelGraph() {
		return persistence.saveSimulationModel(simulationDefinition, simulationModel);
	}
	
	protected boolean checkTerminationConditions() {
		for(TerminationCondition condition : conditions) {
			if(condition.isTerminated()) return true;
		}
		return false;
	}
	
	protected abstract void updateEvents();
	
	protected boolean performServiceInterval() {
		boolean performedService = false;
		for(ServiceRoutine service : services) {
			if(state.isDirty()) {
				state.refreshState();
			}
			
			if(service.performService()) {
				state.setDirty();
				performedService = true;
			}
		}
		if(state.isDirty()) {
			state.refreshState();
		}
		return performedService;
	}
	
	protected void processNextEvent() {
		if(state.noEvents()) {
			return;
		}
		Event event = state.popNextEvent();
		state.setTime(event.time);
		
		for(ExternalConstraint constraint: constraints) {
			if(!constraint.checkConstraint(event)) return;
		}
		
		processEvent(event);
	}
	
	protected abstract void processEvent(Event event);
	
	protected void updateStatistics() {
		if(state.isDirty()) {
			state.refreshState();
		}
		for(SimulationStatistics statistic : statistics) {
			statistic.logCurrentState();
		}
	}
	
	protected void performGT(SimSGMatch match) {
		gt.applyRuleToMatch(match);
		state.setDirty();
	}
	
	public Map<String, Collection<SimSGMatch>> getCurrentMatches() {
		return pmc.getAllMatches();
	}
	
	public void printCurrentMatches() {
		StringBuilder sb = new StringBuilder();
		sb.append("Current "+toString()+"\n *******     RESULTS:     *****\n");
//		for (String key : getCurrentMatches().keySet()) {
//			if (getCurrentMatches().get(key) != null) {
//				sb.append("Pattern: " + key + ", size: " + pmc.getMatchCount(key) +"\n");
//			}
//		}
		for (String key : pmc.getPatternNames()) {
			sb.append("Pattern: " + key + ", size: " + pmc.getMatchCount(key) +"\n");
		}
		sb.append("*******   END   *****\n");
		System.out.println(sb);
	}
	
	public synchronized Collection<SimulationStatistics> getSimulationStatistics() {
		return statistics;
	}
	
	@Override
	public synchronized void finish() {
		pmc.discardEngine();
	}
	
	@Override
	public void displayResults(boolean timeOnXAxis) {
		for(SimulationStatistics statistic : statistics) {
			statistic.display(timeOnXAxis);
		}
	}
	
	@Override
	public void displayVisualizations() {
		for(SimulationVisualization visualization : visualizations) {
			visualization.display();
		}
	}
	
	@Override
	public String toString() {
		return "Simulation-object: "+this.hashCode()+"/ Model: "+modelName+" / MatchingEngine: " + pmc.getEngineType() + " / PMC: " + pmc.getPMCType();
	}

	@Override
	public synchronized void pause() {
		paused = true;
	}

	@Override
	public synchronized void unpause() {
		paused = false;
		run();
	}
	
	public void notifyTermination(Consumer<Simulation> notifier) {
		this.notifier = notifier;
	}

	@Override
	public synchronized boolean isTerminated() {
		return checkTerminationConditions();
	}
	
	@Override
	public void setConsoleInfoLevel(int level) {
		debugLevel = level;
	}
}
