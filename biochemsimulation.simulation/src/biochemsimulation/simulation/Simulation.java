package biochemsimulation.simulation;

import java.util.Collection;
import java.util.Map;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.benchmark.Runtimer;
import biochemsimulation.simulation.matching.IMatch;
import biochemsimulation.simulation.persistence.PersistenceManager;
import biochemsimulation.simulation.pmc.PatternMatchingController;

public class Simulation {
	
	private String modelName;
	private PersistenceManager persistence;
	private PatternMatchingController pmc;
	private SimulationTerminationCondition terminationCondition;

	Simulation() {
		
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
	
	public void initialize() throws Exception {
		persistence.init();
		ReactionRuleModel ruleModel = persistence.loadReactionRuleModel(modelName);
		ReactionContainer reactionContainer = persistence.loadReactionContainerModel(modelName, true);
		pmc.loadModels(ruleModel, reactionContainer);
		pmc.initEngine();
		pmc.initController();
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
		ReactionRuleModel ruleModel = persistence.loadReactionRuleModel(modelName);
		ReactionContainer reactionContainer = persistence.loadReactionContainerModel(modelName, true);
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
	
	public void run() throws Exception {
		while(!terminationCondition.isTerminated(pmc)) {
			pmc.performTransformations();
		}
		pmc.collectAllMatches();
	}
	
	public Map<String, Collection<IMatch>> getResults() {
		return pmc.getAllMatches();
	}
	
	public String results() {
		StringBuilder sb = new StringBuilder();
		sb.append("Current "+toString()+"\n *******     RESULTS:     *****\n");
		for (String key : getResults().keySet()) {
			if (getResults().get(key) != null) {
				sb.append("Pattern: " + key + ", size: " + getResults().get(key).size()+"\n");
			}
		}
		sb.append("*******   END   *****\n");
		return sb.toString();
	}
	
	public void finish() {
		pmc.discardEngine();
	}
	
	@Override
	public String toString() {
		return "Simulation-object: "+this.hashCode()+"/ Model: "+modelName+" / MatchingEngine: " + pmc.getEngineType() + " / PMC: " + pmc.getPMCType();
	}
}
