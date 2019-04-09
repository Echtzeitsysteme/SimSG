package org.simsg.core.simulation;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.ecore.resource.Resource;
import org.simsg.core.gt.GraphTransformationEngine;
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


public abstract class Simulation {
	
	protected String modelName;
	protected PersistenceManager persistence;
	private PatternMatchingController pmc;
	protected SimulationState state;
	protected SimDefinition simulationDefinition;
	protected Resource simulationModel;
	private GraphTransformationEngine gt;
	
	protected List<Function<SimulationState, ServiceRoutine>> serviceConstructors = new LinkedList<>();
	protected List<Function<SimulationState, TerminationCondition>> conditionConstructors = new LinkedList<>();
	protected List<Function<SimulationState, ExternalConstraint>> constraintConstructors = new LinkedList<>();
	protected List<Function<SimulationState, SimulationStatistics>> statisticConstructors = new LinkedList<>();
	protected List<Function<SimulationState, SimulationVisualization>> visualizationConstructors = new LinkedList<>();
	
	protected List<ServiceRoutine> services = new LinkedList<>();
	protected List<TerminationCondition> conditions = new LinkedList<>();
	protected List<ExternalConstraint> constraints = new LinkedList<>();
	protected List<SimulationStatistics> statistics = new LinkedList<>();
	protected List<SimulationVisualization> visualizations = new LinkedList<>();
	
	public Simulation(String modelName, PersistenceManager persistence, PatternMatchingController pmc, GraphTransformationEngine gt) {
		this.modelName = modelName;
		this.persistence = persistence;
		this.pmc = pmc;
		this.gt = gt;
	}
	
	public abstract void setAdditionalParameters(Object ... params);
	
	
	public void addServiceRoutine(Function<SimulationState, ServiceRoutine> constructor) {
		serviceConstructors.add(constructor);
	}
	
	public void addTerminationCondition(Function<SimulationState, TerminationCondition> constructor) {
		conditionConstructors.add(constructor);
	}
	
	public void addExternalConstraint(Function<SimulationState, ExternalConstraint> constructor) {
		constraintConstructors.add(constructor);
	}
	
	public void addSimulationStatistic(Function<SimulationState, SimulationStatistics> constructor) {
		statisticConstructors.add(constructor);
	}
	
	public void addSimulationVisualization(Function<SimulationState, SimulationVisualization> constructor) {
		visualizationConstructors.add(constructor);
	}
	
	public void addServiceRoutine(List<Function<SimulationState, ServiceRoutine>> constructors) {
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
	
	public void addSimulationVisualization(List<Function<SimulationState, SimulationVisualization>> constructors) {
		visualizationConstructors.addAll(constructors);
	}
	
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
	}
	
	private void initModel() {
		persistence.init();
		simulationDefinition = persistence.loadSimulationDefinition(modelName);
		simulationModel = persistence.loadSimulationModel(simulationDefinition);
	}
	
	private void initPMC() {
		pmc.loadModels(simulationDefinition, simulationModel);
		pmc.initController();
		pmc.initEngine();
	}
	
	private void initGT() {
		gt.setModels(simulationDefinition, simulationModel);
		gt.init();
	}
	
	private void initState() {
		state = new SimulationState();
		state.setPmc(pmc);
	}
	
	private void initializeServices() {
		for(Function<SimulationState, ServiceRoutine> constructor : serviceConstructors) {
			services.add(constructor.apply(state));
		}
	}
	
	private void initializeConditions() {
		for(Function<SimulationState, TerminationCondition> constructor : conditionConstructors) {
			conditions.add(constructor.apply(state));
		}
		for(SimulationDefinition.TerminationCondition term : simulationDefinition.getTerminationConditions()) {
			if(term instanceof SimulationDefinition.SimpleTerminationCondition) {
				conditions.add(new SimpleTerminationCondition(state, (SimulationDefinition.SimpleTerminationCondition)term));
			} else if(term instanceof SimulationDefinition.PatternTerminationCondition) {
				conditions.add(new PatternTerminationCondition(state, (SimulationDefinition.PatternTerminationCondition)term));
			}
			
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
	
	public void run() {
		while(!checkTerminationConditions()) {
			if(state.isDirty()) {
				if(state.refreshState()) {
					System.out.println("Something went wrong.. Exit.");
					break;
				}
			}
			updateEvents();
			if(performServiceInterval()) {
				updateEvents();
			}
			processNextEvent();
			updateStatistics();
			state.incrementIterations();
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
			
			if(service.performService(gt)) {
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
	
	public String printCurrentMatches() {
		StringBuilder sb = new StringBuilder();
		sb.append("Current "+toString()+"\n *******     RESULTS:     *****\n");
		for (String key : getCurrentMatches().keySet()) {
			System.out.println(key);
			if (getCurrentMatches().get(key) != null) {
				sb.append("Pattern: " + key + ", size: " + pmc.getMatchCount(key) +"\n");
			}
		}
		sb.append("*******   END   *****\n");
		return sb.toString();
	}
	
	public void finish() {
		pmc.discardEngine();
	}
	
	public void displayResults() {
		for(SimulationStatistics statistic : statistics) {
			statistic.display();
		}
	}
	
	public void displayVisualizations() {
		for(SimulationVisualization visualization : visualizations) {
			visualization.display();
		}
	}
	
	@Override
	public String toString() {
		return "Simulation-object: "+this.hashCode()+"/ Model: "+modelName+" / MatchingEngine: " + pmc.getEngineType() + " / PMC: " + pmc.getPMCType();
	}
}
