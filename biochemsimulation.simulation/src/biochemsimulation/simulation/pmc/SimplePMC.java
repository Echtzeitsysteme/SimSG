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
import biochemsimulation.simulation.matching.PatternMatchingEngineFactory;
import biochemsimulation.simulation.pmc.GT.ReactionRuleTransformer;

public class SimplePMC extends ReactionRuleTransformer implements PatternMatchingController {
	
	PatternMatchingEngine engine;
	
	SimplePMC(PatternMatchingEngine engine) {
		this.engine = engine;
		//engine = PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.ViatraEngine);
		//engine = PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.DemoclesEngine);
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
		//matches = engine.getAllMatches();
		engine.getAllMatches().forEach((x, y) -> {
			matches.replace(x, y);
		});
		
	}
	
	public ConcurrentLinkedQueue<String> generateRndPatternQueue(){
		List<String> rndPatternList = new LinkedList<String>(patternMap.keySet());
		Collections.shuffle(rndPatternList);
		return new ConcurrentLinkedQueue<String>(rndPatternList);
	}

	@Override
	public void performTransformations() {
		Random random = new Random();

		ConcurrentLinkedQueue<String> patternQueue = generateRndPatternQueue();
		
		while(!patternQueue.isEmpty()) {
			String current = patternQueue.poll();
			try {
				collectMatches(current);
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
			
			double reactionRate = staticReactionRates.get(current);
			List<IMatch> currentMatches = new LinkedList<IMatch>(matches.get(current));
			// New version: Approximation of N "true" Laplace-experiments
			double pRule = 1.0 - Math.pow((1.0-reactionRate), currentMatches.size());
			double rnd = random.nextDouble();
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
			
		}
		
	}

	@Override
	public Collection<IMatch> getMatches(String patternName) {
		//collectMatches(patternName);
		return matches.get(patternName);
	}

	@Override
	public Map<String, Collection<IMatch>> getAllMatches() {
		//collectAllMatches();
		return matches;
	}

}
