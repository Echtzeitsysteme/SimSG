package org.simsg.core.simulation;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.simsg.container.Container;
import org.simsg.core.gt.ModelGraphTransformer;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.pm.match.IMatch;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.simulation.condition.TerminationCondition;
import org.simsg.core.simulation.constraint.ExternalConstraint;
import org.simsg.core.simulation.service.ServiceRoutine;
import org.simsg.core.simulation.statistic.SimulationStatistics;
import org.simsg.core.utils.PersistenceUtils;
import org.simsg.core.utils.Runtimer;
import org.simsg.simsgl.simSGL.SimSGLModel;


public abstract class Simulation {
	
	protected String modelName;
	protected PersistenceManager persistence;
	private PatternMatchingController pmc;
	protected SimulationState state;
	protected SimSGLModel ruleModel;
	protected Container reactionContainer;
	private ModelGraphTransformer gt;
	
	protected List<Function<SimulationState, ServiceRoutine>> serviceConstructors = new LinkedList<>();
	protected List<Function<SimulationState, TerminationCondition>> conditionConstructors = new LinkedList<>();
	protected List<Function<SimulationState, ExternalConstraint>> constraintConstructors = new LinkedList<>();
	protected List<Function<SimulationState, SimulationStatistics>> statisticConstructors = new LinkedList<>();
	
	protected List<ServiceRoutine> services = new LinkedList<>();
	protected List<TerminationCondition> conditions = new LinkedList<>();
	protected List<ExternalConstraint> constraints = new LinkedList<>();
	protected List<SimulationStatistics> statistics = new LinkedList<>();
	
	public Simulation(String modelName, PersistenceManager persistence, PatternMatchingController pmc) {
		this.modelName = modelName;
		this.persistence = persistence;
		this.pmc = pmc;
	}
	
	public abstract void setAdditionalParameters(Object ... params);
	
	void addServiceRoutine(Function<SimulationState, ServiceRoutine> constructor) {
		serviceConstructors.add(constructor);
	}
	
	void addTerminationCondition(Function<SimulationState, TerminationCondition> constructor) {
		conditionConstructors.add(constructor);
	}
	
	void addExternalConstraint(Function<SimulationState, ExternalConstraint> constructor) {
		constraintConstructors.add(constructor);
	}
	
	void addSimulationStatistic(Function<SimulationState, SimulationStatistics> constructor) {
		statisticConstructors.add(constructor);
	}
	
	void addServiceRoutine(List<Function<SimulationState, ServiceRoutine>> constructors) {
		serviceConstructors.addAll(constructors);
	}
	
	void addTerminationConditions(List<Function<SimulationState, TerminationCondition>> constructors) {
		conditionConstructors.addAll(constructors);
	}
	
	void addExternalConstraints(List<Function<SimulationState, ExternalConstraint>> constructors) {
		constraintConstructors.addAll(constructors);
	}
	
	void addSimulationStatistics(List<Function<SimulationState, SimulationStatistics>> constructors) {
		statisticConstructors.addAll(constructors);
	}
	
	public void initialize() throws Exception {
		initModel();
		initPMC();	
		initGT();
		initState();
		initializeServices();
		initializeConditions();
		initializeConstraints();
		initializeStatistics();
	}
	
	private void initModel() throws Exception {
		persistence.init();
		ruleModel = persistence.loadReactionRuleModel(modelName);
		reactionContainer = persistence.loadReactionContainerModel(modelName);
	}
	
	private void initPMC() throws Exception {
		pmc.loadModels(ruleModel, reactionContainer);
		pmc.initEngine();
		pmc.initController();
	}
	
	private void initGT() {
		gt = new ModelGraphTransformer(pmc.getPatternContainer(), reactionContainer, pmc.getEPackageWrapper());
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
	}
	
	public void initializeClocked() {
		Runtimer timer = Runtimer.getInstance();
		timer.measure(this, "Initialize(1): Simulation setup", () -> {
				timer.measure(this, "Initialize(1.1): Models", () -> {
					try {
						initModel();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
				timer.measure(this, "Initialize(1.2): PMC", () -> {
					try {
						initPMC();
					} catch (Exception e) {
						// TODO Auto-generated catch block
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
	
	public void run() throws Exception {
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
	
	public boolean saveModelGraph(String path) {
		try {
			PersistenceUtils.saveModelContainer(reactionContainer, path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
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
	
	protected void performGT(String ruleName, IMatch match) {
		gt.applyRuleToMatch(match, ruleName);
		state.setDirty();
	}
	
	
	public Map<String, Collection<IMatch>> getResults() {
		return pmc.getAllMatches();
	}
	
	public String results() {
		StringBuilder sb = new StringBuilder();
		sb.append("Current "+toString()+"\n *******     RESULTS:     *****\n");
		for (String key : getResults().keySet()) {
			System.out.println(key);
			if (getResults().get(key) != null) {
				sb.append("Pattern: " + key + ", size: " + pmc.getMatchCountWithHash(key) +"\n");
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
	
	@Override
	public String toString() {
		return "Simulation-object: "+this.hashCode()+"/ Model: "+modelName+" / MatchingEngine: " + pmc.getEngineType() + " / PMC: " + pmc.getPMCType();
	}
}
