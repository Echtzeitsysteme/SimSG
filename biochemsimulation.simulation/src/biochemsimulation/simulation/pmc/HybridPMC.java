package biochemsimulation.simulation.pmc;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		
		Set<IMatch> subMatches = new HashSet<IMatch>();
		for(String subPatternName : subPatterNames) {
			if(super.getMatchCount(subPatternName) == 0) {
				subMatches = null;
				hybridMatchCount.replace(patternName, 0);
				break;
			}
			
			int idx = 0;
			IMatch currentMatch = null;
			do{
				currentMatch = getMatchAt(subPatternName, idx);
				idx++;
			}while(idx < super.getMatchCount(subPatternName) && subMatches.contains(currentMatch));
			
			if(idx==super.getMatchCount(subPatternName)) {
				subMatches = null;
				hybridMatchCount.replace(patternName, 0);
				break;
			}
			
			subMatches.add(currentMatch);
		}
		
		if(subMatches == null) {
			hybridMatchCount.replace(patternName, 0);
			return;
		}
		
		hybridMatches.put(patternName, new HybridMatch(patternName, subMatches));
		calculateHybridMatchCount(patternName);
		
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
		for(String hybridPatternName : hybridPatterns.keySet()) {
			collectMatches(hybridPatternName);
		}
	}
	
	@Override
	public int getMatchCount(String patternName) {
		return hybridMatchCount.get(patternName);
	}

	@Override
	public Collection<IMatch> getMatches(String patternName) {
		Collection<IMatch> out = new LinkedList<IMatch>();
		out.add(hybridMatches.get(patternName));
		return out;
	}

	@Override
	public Map<String, Collection<IMatch>> getAllMatches() {
		Map<String, Collection<IMatch>> out = new HashMap<String, Collection<IMatch>>();
		for(String hybridPatternName : hybridPatterns.keySet()) {
			out.put(hybridPatternName, getMatches(hybridPatternName));
		}
		return out;
	}

}
