package biochemsimulation.simulation;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SimpleSimulation extends Simulation {
	
	protected boolean randomRuleOrder;
	protected boolean useReactionRates;
	
	Random random;
	
	SimpleSimulation() {
		randomRuleOrder = true;
		useReactionRates = true;
		random = new Random();
	}	

	@Override
	public void run() throws Exception {
		while(!terminationCondition.isTerminated(state)) {
			performTransformations();
			simStats.logCurrentState(state);
		}
		pmc.collectAllMatches();

	}
	
	private void performTransformations() {
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
				pmc.collectMatches(current);
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
			
			if(useReactionRates) {
				double reactionRate = staticReactionRates.get(current);
				double pRule = 1.0 - Math.pow((1.0-reactionRate), pmc.getMatchCount(current));
				double rnd = random.nextDouble();
				if(rnd <= pRule) {
					gt.applyRuleToMatch(pmc.getRandomMatch(current), current);
				}
			}else {
				if(pmc.getMatchCount(current) != 0) {
					gt.applyRuleToMatch(pmc.getMatchAt(current, 0), current);
				}
			}
			
		}
		
		state.incrementIterations();
		
	}
	
	public void randomizeRuleOrder(boolean activate) {
		randomRuleOrder = activate;
	}

	public void useReactionRate(boolean activate) {
		useReactionRates = activate;
	}
	
	private ConcurrentLinkedQueue<String> generatePatternQueue() {
		return new ConcurrentLinkedQueue<String>(staticReactionRates.keySet());
	}
	
	private ConcurrentLinkedQueue<String> generateRndPatternQueue(){
		List<String> rndPatternList = new LinkedList<String>(staticReactionRates.keySet());
		Collections.shuffle(rndPatternList);
		return new ConcurrentLinkedQueue<String>(rndPatternList);
	}

}
