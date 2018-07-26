package biochemsimulation.simulation;

import java.util.Collection;
import java.util.Map;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
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
	
	public void initilize() throws Exception {
		persistence.init();
		ReactionRuleModel ruleModel = persistence.loadReactionRuleModel(modelName);
		ReactionContainer reactionContainer = persistence.loadReactionContainerModel(modelName, true);
		pmc.loadModels(ruleModel, reactionContainer);
		pmc.initEngine();
		pmc.initController();
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
	
	public void finish() {
		pmc.discardEngine();
	}
}
