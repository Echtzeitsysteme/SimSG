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
			
			if(useReactionRates) {
				double reactionRate = staticReactionRates.get(current);
				double pRule = 1.0 - Math.pow((1.0-reactionRate), getMatchCount(current));
				double rnd = random.nextDouble();
				if(rnd <= pRule) {
					applyRuleToMatch(getRandomMatch(current));
				}
			}else {
				if(getMatchCount(current) != 0) {
					applyRuleToMatch(getMatchAt(current, 0));
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
