package org.simsg.core.simulation;

import java.util.Collection;
import java.util.Map;

import org.simsg.container.Container;
import org.simsg.core.gt.ReactionRuleTransformer;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.pm.match.IMatch;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.simulation.condition.SimulationTerminationCondition;
import org.simsg.core.simulation.statistic.SimulationStatistics;
import org.simsg.core.utils.Runtimer;
import org.simsg.simsgl.simSGL.SimSGLModel;
import org.simsg.simsgl.utils.PatternUtils;


public abstract class Simulation {
	
	protected String modelName;
	protected PersistenceManager persistence;
	protected PatternMatchingController pmc;
	protected SimulationTerminationCondition terminationCondition;
	protected SimulationState state;
	protected SimulationStatistics simStats;
	protected SimSGLModel ruleModel;
	protected Container reactionContainer;
	protected ReactionRuleTransformer gt;
	protected Map<String, Double> staticReactionRates;

	public Simulation() {
		
	}
	
	void setModel(String modelName) {
		this.modelName = modelName;
	}
	
	void setPersistence(PersistenceManager persistence) {
		this.persistence = persistence;
	}

	void setPmc(PatternMatchingController pmc) {
		this.pmc = pmc;
	}
	
	void setTerminationCondition(SimulationTerminationCondition terminationCondition) {
		this.terminationCondition = terminationCondition;
	}
	
	protected void initStaticReactionRates() {
		staticReactionRates = PatternUtils.getRates(ruleModel);
	}
	
	public void initialize() throws Exception {
		persistence.init();
		ruleModel = persistence.loadReactionRuleModel(modelName);
		reactionContainer = persistence.loadReactionContainerModel(modelName);
		pmc.loadModels(ruleModel, reactionContainer);
		pmc.initEngine();
		pmc.initController();	
		gt = new ReactionRuleTransformer(pmc.getPatternContainer(), reactionContainer, pmc.getEPackageWrapper());
		gt.init();
		initStaticReactionRates();
		state = new SimulationState();
		state.setPmc(pmc);
		terminationCondition.initCondition(pmc.getPatternContainer(), ruleModel);
		simStats = new SimulationStatistics();
		simStats.initObservables(pmc.getPatternContainer());
	}
	
	public void initializeClocked() {
		Runtimer timer = Runtimer.getInstance();
		timer.measure(this, "initialize", () -> {
			try {
				initializeClockedInternal();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
	
	private void initializeClockedInternal() throws Exception {
		Runtimer timer = Runtimer.getInstance();
		persistence.init();
		ruleModel = persistence.loadReactionRuleModel(modelName);
		reactionContainer = persistence.loadReactionContainerModel(modelName);
		timer.measure(this, "loadModels", () -> {
			try {
				pmc.loadModels(ruleModel, reactionContainer);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		timer.measure(this, "initEngine", () -> {
			try {
				pmc.initEngine();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		timer.measure(this, "initController", () -> {
			try {
				pmc.initController();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		gt = new ReactionRuleTransformer(pmc.getPatternContainer(), reactionContainer, pmc.getEPackageWrapper());
		gt.init();
		initStaticReactionRates();
		state = new SimulationState();
		state.setPmc(pmc);
		terminationCondition.initCondition(pmc.getPatternContainer(), ruleModel);
		simStats = new SimulationStatistics();
		simStats.initObservables(pmc.getPatternContainer());
	}
	
	public void runClocked() {
		Runtimer timer = Runtimer.getInstance();
		timer.measure(this, "run", () -> {
			try {
				run();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
	
	public abstract void run() throws Exception;
	
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
		simStats.displayStatistics();
	}
	
	@Override
	public String toString() {
		return "Simulation-object: "+this.hashCode()+"/ Model: "+modelName+" / MatchingEngine: " + pmc.getEngineType() + " / PMC: " + pmc.getPMCType();
	}
}
