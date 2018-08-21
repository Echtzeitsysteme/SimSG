package biochemsimulation.simulation.pmc;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.NumericFromLiteral;
import biochemsimulation.reactionrules.reactionRules.NumericFromVariable;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.utils.PatternUtils;
import biochemsimulation.simulation.matching.IMatch;
import biochemsimulation.simulation.matching.PatternMatchingEngine;
import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.pmc.GT.ReactionRuleTransformer;

public abstract class PatternMatchingController{
	
	protected ReactionRuleModel ruleModel;
	protected ReactionContainer reactionContainer;
	
	protected PatternMatchingControllerEnum pmcType;
	
	protected PatternMatchingEngine engine;
	protected Map<String, Collection<IMatch>> matches;
	protected Map<String, Integer> matchCount;
	
	protected Map<String, Double> staticReactionRates;
	
	protected ReactionRuleTransformer gt;
	
	protected boolean randomRuleOrder;
	protected boolean useReactionRates;
	protected int iterations;
	
	Random random = new Random();
	
	protected PatternMatchingController() {
		setPMCType();
		randomRuleOrder = true;
		useReactionRates = true;
		iterations = 0;
	}
	
	protected abstract void setPMCType();
	
	protected abstract void feedEngine() throws Exception;
	
	public abstract void performTransformations();

	public void collectMatches(String patternName) throws Exception {
		Collection<IMatch> matches = engine.getMatches(patternName);
		this.matches.replace(patternName, matches);
		this.matchCount.replace(patternName, matches.size());
	}
	
	public void collectAllMatches() throws Exception {
		engine.getAllMatches().forEach((name, matches) -> {
			this.matches.replace(name, matches);
			this.matchCount.replace(name, matches.size());
		});
	}
	
	public int getMatchCount(String patternName) {
		return matchCount.get(patternName);
	}
	
	protected int getRandomMatchIdx(String patternName) {
		return (int)(getMatchCount(patternName)*random.nextDouble());
	}
	
	protected IMatch getRandomMatch(String patternName) {
		return (IMatch) matches.get(patternName).toArray()[getRandomMatchIdx(patternName)];
	}
	
	protected IMatch getMatchAt(String patternName, int idx) {
		return (IMatch) matches.get(patternName).toArray()[idx];
	}
	
	public abstract Collection<IMatch> getMatches(String patternName);
	
	public abstract Map<String, Collection<IMatch>> getAllMatches();

	public void setEngine(PatternMatchingEngine engine) {
		this.engine = engine;
	}
	
	public void loadModels(ReactionRuleModel ruleModel, ReactionContainer reactionContainer) throws Exception {
		this.ruleModel = ruleModel;
		this.reactionContainer = reactionContainer;
		feedEngine();
	}
	
	public void initEngine() throws Exception {
		engine.initEngine();
	}
	
	public void initController() throws Exception {
		gt = new ReactionRuleTransformer(ruleModel, reactionContainer);
		gt.init();
		initMatches();
		initStaticReactionRates();
	}
	
	protected void initMatches() {
		// Init matches
		matches = new HashMap<String, Collection<IMatch>>();
		for(String patterName : engine.getAllPatternNames()) {
			matches.put(patterName, new LinkedList<IMatch>());
		}
				
		// Init match counter
		matchCount = new HashMap<String, Integer>();
		for(String patternName : matches.keySet()) {
			matchCount.put(patternName, 0);
		}
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
	
	public void transform(IMatch match) {
		gt.applyRuleToMatch(match);
	}
	
	public int getIterations() {
		return iterations;
	}
	
	public void randomizeRuleOrder(boolean activate) {
		randomRuleOrder = activate;
	}

	public void useReactionRate(boolean activate) {
		useReactionRates = activate;
	}

	public void discardEngine() {
		engine.disposeEngine();
	}

	public PatternMatchingControllerEnum getPMCType() {
		return pmcType;
	}

	public PatternMatchingEngineEnum getEngineType() {
		return engine.getEngineType();
	}
	
	protected ConcurrentLinkedQueue<String> generatePatternQueue() {
		return new ConcurrentLinkedQueue<String>(gt.getPatternMap().keySet());
	}
	
	protected ConcurrentLinkedQueue<String> generateRndPatternQueue(){
		List<String> rndPatternList = new LinkedList<String>(gt.getPatternMap().keySet());
		Collections.shuffle(rndPatternList);
		return new ConcurrentLinkedQueue<String>(rndPatternList);
	}
}
