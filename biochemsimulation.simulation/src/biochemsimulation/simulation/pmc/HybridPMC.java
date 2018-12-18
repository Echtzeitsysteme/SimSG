package biochemsimulation.simulation.pmc;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.utils.PatternContainer;
import biochemsimulation.simulation.matching.HybridMatch;
import biochemsimulation.simulation.matching.IMatch;
import biochemsimulation.simulation.matching.IMatchImpl;
import biochemsimulation.simulation.matching.patterns.GenericPattern;
import biochemsimulation.simulation.matching.patterns.HybridPattern;

public class HybridPMC extends PatternMatchingController {
	
	private Map<String, HybridPattern> hybridPatterns;
	private Map<String, GenericPattern> genericPatterns;
	private Map<String, HybridMatchCountTemplate> matchCountTemplates;
	
	private Map<String, IMatch> hybridMatches;
	private Map<String, Integer> hybridMatchCount;

	@Override
	protected void setPMCType() {
		pmcType = PatternMatchingControllerEnum.HybridPMC;

	}

	@Override
	protected void feedEngine() throws Exception {
		Collection<Pattern> patterns = patternContainer.getAllPatterns();
		hybridPatterns = new HashMap<String, HybridPattern>();
		patterns.forEach(pattern -> {
			hybridPatterns.put(PatternContainer.calcPatternHash(pattern), new HybridPattern(PatternContainer.calcPatternHash(pattern), pattern));
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
		hybridMatches = new HashMap<String, IMatch>();
		hybridMatchCount = new HashMap<String, Integer>();
		matchCountTemplates = new HashMap<String, HybridMatchCountTemplate>();
		for(String hybridPattern : hybridPatterns.keySet()) {
			hybridMatches.put(hybridPattern, null);
			hybridMatchCount.put(hybridPattern, 0);
			matchCountTemplates.put(hybridPattern, new HybridMatchCountTemplate(hybridPatterns.get(hybridPattern)));
		}
		
	}
	
	
	@Override
	public void collectMatches(String patternName) throws Exception {
		String patternHash = patternContainer.getPatternHash(patternName);
		collectMatchesWithHash(patternHash);
	}

	public void collectMatchesWithHash(String patternName) throws Exception {
		if(engine.isVoidPattern(patternName)) {
			hybridMatches.put(patternName, new IMatchImpl(patternName));
			hybridMatchCount.replace(patternName, 1);
			return;
		}
		Collection<IMatch> subMatches = new LinkedHashSet<IMatch>();
		
		for(String subPatternName : hybridPatterns.get(patternName).getGenericSubPatterns().keySet()) {
			super.collectMatchesWithHash(subPatternName);
			for(IMatch currentMatch : matches.get(subPatternName)) {
				//System.out.println(currentMatch.hashCode());
				if(!subMatches.contains(currentMatch)) {
					subMatches.add(currentMatch);
					break;
				}
			}
		}
		/*
		Map<String, IMatch> subMatches = new LinkedHashMap<String, IMatch>();
		for(String subPatternName : subPatterNames) {
			if(super.getMatchCountWithHash(subPatternName) == 0) {
				subMatches = null;
				hybridMatchCount.replace(patternName, 0);
				break;
			}
			
			int idx = 0;
			IMatch currentMatch = null;
			boolean passedInjectivityCheck = false;
			int currentMatchCount = super.getMatchCountWithHash(subPatternName);
			do{
				currentMatch = super.getMatchAtWitHash(subPatternName, idx);
				idx++;
				passedInjectivityCheck = checkSubMatchInjectivityConstraints(currentMatch, subMatches);
			}while(idx < currentMatchCount && !passedInjectivityCheck);
			
			if(!passedInjectivityCheck) {
				subMatches = null;
				hybridMatchCount.replace(patternName, 0);
				break;
			}
			//System.out.println("Sub pattern name: "+subPatternName+" count: "+currentMatchCount);
			subMatches.put(subPatternName, currentMatch);
		}
		
		if(subMatches == null) {
			hybridMatchCount.replace(patternName, 0);
			return;
		}
		*/
		
		calculateHybridMatchCount(patternName);
		if(hybridMatchCount.get(patternName) <= 0) {
			hybridMatches.put(patternName, null);
			return;
		}
		
		IMatch hybMatch = new HybridMatch(patternName, subMatches, hybridPatterns.get(patternName));
		if(hybMatch.parameterNames().size()< hybridPatterns.get(patternName).getOriginalPattern().getSignature().getSignature().size()) {
			//System.out.println(hybMatch);
			hybridMatches.put(patternName, null);
			hybridMatchCount.replace(patternName, 0);
			return;
		}
		
		// Debug
		/*
		Object hybParams[] = hybMatch.parameterNames().toArray();
		Object originalParams[] = hybridPatterns.get(patternName).getOriginalPattern().getSignature().getSignature().keySet().toArray();
		for(int i = 0; i<hybParams.length; i++) {
			String hybParam = (String)hybParams[i];
			String originalParam = (String)originalParams[i];
			if(!hybParam.equals(originalParam)) {
				System.out.println("dafuq?");
			}
		}
		*/
		
		hybridMatches.put(patternName, hybMatch);
		
		
	}
	
	private void calculateHybridMatchCount(String patternName) {
		Map<String, Integer> countMap = new LinkedHashMap<String, Integer>();
		for(String subPatternName : hybridPatterns.get(patternName).getGenericSubPatterns().keySet()) {
			int currentCount = super.getMatchCountWithHash(subPatternName);
			if(currentCount <= 0) {
				hybridMatchCount.replace(patternName, 0);
				return;
			}
			countMap.put(subPatternName, currentCount);
		}
		hybridMatchCount.replace(patternName, matchCountTemplates.get(patternName).calculateMatchCount(countMap));
		
	}
	
	@Override
	public IMatch getRandomMatch(String patternName) {
		return hybridMatches.get(patternContainer.getPatternHash(patternName));
	}
	
	@Override
	public IMatch getMatchAt(String patternName, int idx) {
		return hybridMatches.get(patternContainer.getPatternHash(patternName));
	}
	
	@Override
	public void collectAllMatches() throws Exception {
		for(String hybridPatternName : hybridPatterns.keySet()) {
			collectMatchesWithHash(hybridPatternName);
		}
	}
	
	@Override
	public int getMatchCount(String patternName) {
		return hybridMatchCount.get(patternContainer.getPatternHash(patternName));
	}
	
	@Override
	public int getMatchCountWithHash(String patternHash) {
		return hybridMatchCount.get(patternHash);
	}

	@Override
	public Collection<IMatch> getMatches(String patternName) {
		Collection<IMatch> out = new LinkedList<IMatch>();
		out.add(hybridMatches.get(patternContainer.getPatternHash(patternName)));
		return out;
	}
	
	public Collection<IMatch> getMatchesWithHash(String patternHash) {
		Collection<IMatch> out = new LinkedList<IMatch>();
		out.add(hybridMatches.get(patternHash));
		return out;
	}

	@Override
	public Map<String, Collection<IMatch>> getAllMatches() {
		Map<String, Collection<IMatch>> out = new HashMap<String, Collection<IMatch>>();
		for(String hybridPatternName : hybridPatterns.keySet()) {
			out.put(hybridPatternName, getMatchesWithHash(hybridPatternName));
		}
		return out;
	}

}
