package biochemsimulation.simulation.pmc;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.matching.IMatch;
import biochemsimulation.simulation.matching.PatternMatchingEngine;
import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.pmc.GT.ReactionRuleTransformer;

public abstract class PatternMatchingController extends ReactionRuleTransformer{
	
	protected PatternMatchingControllerEnum pmcType;
	
	protected PatternMatchingEngine engine;
	protected boolean randomRuleOrder;
	protected boolean useReactionRates;
	protected int iterations;
	
	protected PatternMatchingController() {
		setPMCType();
		randomRuleOrder = true;
		useReactionRates = true;
		iterations = 0;
	}
	
	protected abstract void setPMCType();
	
	protected abstract void feedEngine() throws Exception;
	
	public abstract void performTransformations();
	
	public abstract void collectMatches(String patternName) throws Exception;
	
	public abstract void collectAllMatches() throws Exception;
	
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
		initRuleMap();
		initPatternMaps();
		initTransformationTemplates();
		retrieveStaticReactionRates();
	}

	public void transform(IMatch match) {
		applyRuleToMatch(match);
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
		return new ConcurrentLinkedQueue<String>(patternMap.keySet());
	}
	
	protected ConcurrentLinkedQueue<String> generateRndPatternQueue(){
		List<String> rndPatternList = new LinkedList<String>(patternMap.keySet());
		Collections.shuffle(rndPatternList);
		return new ConcurrentLinkedQueue<String>(rndPatternList);
	}
}
