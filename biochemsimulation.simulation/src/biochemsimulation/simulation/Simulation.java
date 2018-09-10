package biochemsimulation.simulation;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.NumericFromLiteral;
import biochemsimulation.reactionrules.reactionRules.NumericFromVariable;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.utils.PatternUtils;
import biochemsimulation.simulation.benchmark.Runtimer;
import biochemsimulation.simulation.matching.IMatch;
import biochemsimulation.simulation.persistence.PersistenceManager;
import biochemsimulation.simulation.pmc.PatternMatchingController;
import biochemsimulation.simulation.pmc.GT.ReactionRuleTransformer;

public abstract class Simulation {
	
	protected String modelName;
	protected PersistenceManager persistence;
	protected PatternMatchingController pmc;
	protected SimulationTerminationCondition terminationCondition;
	protected SimulationState state;
	protected ReactionRuleModel ruleModel;
	protected ReactionContainer reactionContainer;
	protected ReactionRuleTransformer gt;
	protected Map<String, Double> staticReactionRates;

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
	
	protected void initStaticReactionRates() {
		staticReactionRates = new HashMap<String, Double>();
		gt.getRuleMap().forEach((name, r) -> {
			List<Double> reactionRate = new LinkedList<Double>();
			r.getRule().getVariables().getVariables().forEach(y->{
				if(y instanceof NumericFromLiteral) {
					reactionRate.add(Double.valueOf(((NumericFromLiteral) y).getValue().getValue()));
				}else {
					reactionRate.add(Double.valueOf(((NumericFromVariable) y).getValueVar().getValue().getValue()));
				}
			});
			staticReactionRates.put(name+PatternUtils.PATTERN_NAME_SUFFIX_LHS, reactionRate.get(0));
			if(r.getRule().getOperator().equals(PatternUtils.RULE_OPERATOR_BI)) {
				staticReactionRates.put(name+PatternUtils.PATTERN_NAME_SUFFIX_RHS, reactionRate.get(1));
			}
		});
	}
	
	public void initialize() throws Exception {
		persistence.init();
		ruleModel = persistence.loadReactionRuleModel(modelName);
		reactionContainer = persistence.loadReactionContainerModel(modelName);
		pmc.loadModels(ruleModel, reactionContainer);
		pmc.initEngine();
		pmc.initController();
		gt = new ReactionRuleTransformer(ruleModel, reactionContainer);
		gt.init();
		initStaticReactionRates();
		state = new SimulationState();
		state.setPmc(pmc);
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
		ReactionContainer reactionContainer = persistence.loadReactionContainerModel(modelName);
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
		
		gt = new ReactionRuleTransformer(ruleModel, reactionContainer);
		gt.init();
		initStaticReactionRates();
		state = new SimulationState();
		state.setPmc(pmc);
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
