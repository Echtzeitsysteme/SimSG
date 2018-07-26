package biochemsimulation.simulation.pmc;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.matching.IMatch;
import biochemsimulation.simulation.matching.PatternMatchingEngine;
import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.pmc.GT.ReactionRuleTransformer;

public class SimplePMC extends ReactionRuleTransformer implements PatternMatchingController {
	
	final public static PatternMatchingControllerEnum type = PatternMatchingControllerEnum.SimplePMC;
	private PatternMatchingEngine engine;
	private boolean randomRuleOrder;
	private boolean useReactionRates;
	private int iterations;
	
	SimplePMC() {
		randomRuleOrder = true;
		useReactionRates = true;
		iterations = 0;
	}
	
	@Override
	public void setEngine(PatternMatchingEngine engine) {
		this.engine = engine;
	}
	
	@Override
	public void loadModels(ReactionRuleModel ruleModel, ReactionContainer reactionContainer) throws Exception {
		this.ruleModel = ruleModel;
		this.reactionContainer = reactionContainer;
		engine.loadModels(reactionContainer, ruleModel);
	}
	
	@Override
	public void initEngine() throws Exception {
		engine.initEngine();
	}
	
	@Override
	public void initController() throws Exception {
		initRuleMap();
		initPatternMaps();
		initTransformationTemplates();
		retrieveStaticReactionRates();
	}

	@Override
	public void collectMatches(String patternName) throws Exception {
		matches.replace(patternName, engine.getMatches(patternName));	
	}
	
	@Override
	public void collectAllMatches() throws Exception {
		engine.getAllMatches().forEach((x, y) -> {
			matches.replace(x, y);
		});
		
	}
	
	public ConcurrentLinkedQueue<String> generatePatternQueue() {
		return new ConcurrentLinkedQueue<String>(patternMap.keySet());
	}
	
	public ConcurrentLinkedQueue<String> generateRndPatternQueue(){
		List<String> rndPatternList = new LinkedList<String>(patternMap.keySet());
		Collections.shuffle(rndPatternList);
		return new ConcurrentLinkedQueue<String>(rndPatternList);
	}

	@Override
	public void performTransformations() {
		Random random = new Random();
		ConcurrentLinkedQueue<String> patternQueue = null;
		if(randomRuleOrder) {
			//System.out.println("Random stuff1");
			patternQueue = generateRndPatternQueue();
		}else {
			patternQueue = generatePatternQueue();
		}
		
		while(!patternQueue.isEmpty()) {
			String current = patternQueue.poll();
			try {
				collectMatches(current);
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
			List<IMatch> currentMatches = new LinkedList<IMatch>(matches.get(current));
			
			if(useReactionRates) {
				double reactionRate = staticReactionRates.get(current);
				// New version: Approximation of N "true" Laplace-experiments
				double pRule = 1.0 - Math.pow((1.0-reactionRate), currentMatches.size());
				double rnd = random.nextDouble();
				//System.out.println("Pattern: "+current+", pRule: "+pRule+", rnd: "+rnd+", rate: "+reactionRate+", matchSize: "+currentMatches.size());
				if(rnd <= pRule) {
					int idx = (int)(currentMatches.size()*random.nextDouble());
					applyRuleToMatch(currentMatches.get(idx));
				}
				// Old version: N "true" Laplace-experiments via For-Loop and Rnd-Function
				/*
				for(int i = 0; i<currentMatches.size(); i++) {
					//double rnd = Math.random();
					double rnd = random.nextDouble();
					if(rnd <= reactionRate) {
						//System.out.print("Rolled: "+rnd+" vs. rate: "+reactionRate);
						applyRuleToMatch(currentMatches.get(i));
						//System.out.println(" Applied rule: " + current + " on match nr.: "+i+" from a total of: "+currentMatches.size());
						break;
					}
				}
				*/
			}else {
				if(!currentMatches.isEmpty()) {
					applyRuleToMatch(currentMatches.get(0));
				}
			}
			
			
		}
		
		iterations++;
		
	}
	
	@Override
	public int getIterations() {
		return iterations;
	}

	@Override
	public Collection<IMatch> getMatches(String patternName) {
		return matches.get(patternName);
	}

	@Override
	public Map<String, Collection<IMatch>> getAllMatches() {
		return matches;
	}

	@Override
	public void randomizeRuleOrder(boolean activate) {
		randomRuleOrder = activate;
	}

	@Override
	public void useReactionRate(boolean activate) {
		useReactionRates = activate;
	}

	@Override
	public void discardEngine() {
		engine.disposeEngine();
	}

	@Override
	public PatternMatchingControllerEnum getPMCType() {
		return type;
	}

	@Override
	public PatternMatchingEngineEnum getEngineType() {
		return engine.getEngineType();
	}

	
}
