package biochemsimulation.simulation.pmc;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.matching.IMatch;
import biochemsimulation.simulation.matching.PatternMatchingEngine;
import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;

public abstract class PatternMatchingController{
	
	protected ReactionRuleModel ruleModel;
	protected ReactionContainer reactionContainer;
	
	protected PatternMatchingControllerEnum pmcType;
	
	protected PatternMatchingEngine engine;
	protected Map<String, Collection<IMatch>> matches;
	protected Map<String, Integer> matchCount;
	
	Random random;
	
	protected PatternMatchingController() {
		setPMCType();
		random = new Random();
	}
	
	protected abstract void setPMCType();
	
	protected abstract void feedEngine() throws Exception;

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
	
	public IMatch getRandomMatch(String patternName) {
		return (IMatch) matches.get(patternName).toArray()[getRandomMatchIdx(patternName)];
	}
	
	public IMatch getMatchAt(String patternName, int idx) {
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
		initMatches();
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

	public void discardEngine() {
		engine.disposeEngine();
	}

	public PatternMatchingControllerEnum getPMCType() {
		return pmcType;
	}

	public PatternMatchingEngineEnum getEngineType() {
		return engine.getEngineType();
	}
	
}
