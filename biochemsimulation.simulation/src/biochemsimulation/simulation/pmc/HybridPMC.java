package biochemsimulation.simulation.pmc;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.utils.PatternUtils;
import biochemsimulation.simulation.matching.HybridMatch;
import biochemsimulation.simulation.matching.IMatch;
import biochemsimulation.simulation.matching.patterns.GenericPattern;
import biochemsimulation.simulation.matching.patterns.HybridPattern;

public class HybridPMC extends PatternMatchingController {
	
	private Map<String, HybridPattern> hybridPatterns;
	private Map<String, GenericPattern> genericPatterns;
	
	private Map<String, IMatch> hybridMatches;
	private Map<String, Integer> hybridMatchCount;

	@Override
	protected void setPMCType() {
		pmcType = PatternMatchingControllerEnum.HybridPMC;

	}

	@Override
	protected void feedEngine() throws Exception {
		Map<String, Pattern> patterns = PatternUtils.getPatterns(ruleModel);
		hybridPatterns = new HashMap<String, HybridPattern>();
		patterns.forEach((name, pattern) -> {
			hybridPatterns.put(name, new HybridPattern(name, pattern));
		});
		genericPatterns = new HashMap<String, GenericPattern>();
		hybridPatterns.forEach((name, pattern) -> {
			genericPatterns.putAll(pattern.getGenericSubPatterns());
		});
		
		engine.setReactionRules(genericPatterns);
		engine.setReactionContainer(reactionContainer);
		engine.loadModels();
	}
	
	@Override
	public void initController() throws Exception {
		super.initController();
	}

	@Override
	public void performTransformations() {
		// TODO Auto-generated method stub

	}

	@Override
	public void collectMatches(String patternName) throws Exception {
		Collection<String> subPatterNames = hybridPatterns.get(patternName).getGenericSubPatterns().keySet();
		
		for(String subPatternName : subPatterNames) {
			super.collectMatches(subPatternName);
		}
		
		List<IMatch> subMatches = new LinkedList<IMatch>();
		for(String subPatternName : subPatterNames) {
			if(super.getMatchCount(subPatternName) == 0) {
				subMatches = null;
				hybridMatchCount.replace(patternName, 0);
				break;
			}
			subMatches.add(getRandomMatch(subPatternName));
		}
		
		if(subMatches == null) {
			return;
		}
		
		hybridMatches.put(patternName, new HybridMatch(patternName, subMatches));
		
	}
	
	// For now, a very primitive and also wrong method to calculate hybrid match counts
	private void calculateHybridMatchCount(String patternName) {
		Collection<String> subPatterNames = hybridPatterns.get(patternName).getGenericSubPatterns().keySet();
		int count = 1;
		for(String subPatternName : subPatterNames) {
			count *= super.getMatchCount(subPatternName);
		}
		hybridMatchCount.replace(patternName, count);
	}

	@Override
	public void collectAllMatches() throws Exception {
		// TODO Auto-generated method stub

	}
	
	@Override
	public int getMatchCount(String patternName) {
		return hybridMatchCount.get(patternName);
	}

	@Override
	public Collection<IMatch> getMatches(String patternName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Collection<IMatch>> getAllMatches() {
		// TODO Auto-generated method stub
		return null;
	}

}
