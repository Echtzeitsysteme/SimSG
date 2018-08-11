package biochemsimulation.simulation.pmc;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

import biochemsimulation.simulation.matching.IMatch;

public class SimplePMC extends PatternMatchingController {

	SimplePMC() {
		super();
	}
	
	@Override
	protected void setPMCType() {
		this.pmcType = PatternMatchingControllerEnum.SimplePMC;
	}
	
	@Override
	protected void feedEngine() throws Exception{
		engine.setReactionRules(ruleModel);
		engine.setReactionContainer(reactionContainer);
		engine.loadModels();
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

	@Override
	public void performTransformations() {
		Random random = new Random();
		ConcurrentLinkedQueue<String> patternQueue = null;
		if(randomRuleOrder) {
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
			Collection<IMatch> m = matches.getOrDefault(current, null);
			if(m == null ) {
				continue;
			}
			List<IMatch> currentMatches = new LinkedList<IMatch>(m);
			
			if(useReactionRates) {
				double reactionRate = staticReactionRates.get(current);
				double pRule = 1.0 - Math.pow((1.0-reactionRate), currentMatches.size());
				double rnd = random.nextDouble();
				if(rnd <= pRule) {
					int idx = (int)(currentMatches.size()*random.nextDouble());
					applyRuleToMatch(currentMatches.get(idx));
				}
			}else {
				if(!currentMatches.isEmpty()) {
					applyRuleToMatch(currentMatches.get(0));
				}
			}
			
			
		}
		
		iterations++;
		
	}

	@Override
	public Collection<IMatch> getMatches(String patternName) {
		if(matches.get(patternName) != null) {
			return matches.get(patternName);
		}
		return new LinkedList<IMatch>();
	}

	@Override
	public Map<String, Collection<IMatch>> getAllMatches() {
		return matches;
	}

	
}
