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
import biochemsimulation.simulation.matching.IMatchImpl;
import biochemsimulation.simulation.matching.patterns.AgentNodeConstraint;
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
			if(name.equals("bindAndChangeStates_rule_lhs")) {
				System.out.println(hybridPatterns.get(name));
			}
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
		for(String hybridPattern : hybridPatterns.keySet()) {
			hybridMatches.put(hybridPattern, null);
			hybridMatchCount.put(hybridPattern, 0);
		}
		
	}

	@Override
	public void collectMatches(String patternName) throws Exception {
		if(engine.isVoidPattern(patternName)) {
			hybridMatches.put(patternName, new IMatchImpl(patternName));
			hybridMatchCount.replace(patternName, 1);
			return;
		}
		Collection<String> subPatterNames = hybridPatterns.get(patternName).getGenericSubPatterns().keySet();
		
		for(String subPatternName : subPatterNames) {
			super.collectMatches(subPatternName);
		}
		
		Map<String, IMatch> subMatches = new HashMap<String, IMatch>();
		for(String subPatternName : subPatterNames) {
			if(super.getMatchCount(subPatternName) == 0) {
				subMatches = null;
				hybridMatchCount.replace(patternName, 0);
				break;
			}
			
			int idx = 0;
			IMatch currentMatch = null;
			boolean passedInjectivityCheck = false;
			int currentMatchCount = super.getMatchCount(subPatternName);
			do{
				currentMatch = super.getMatchAt(subPatternName, idx);
				idx++;
				passedInjectivityCheck = checkSubMatchInjectivityConstraints(currentMatch, subMatches);
			}while(idx < currentMatchCount && !passedInjectivityCheck);
			
			if(!passedInjectivityCheck) {
				subMatches = null;
				hybridMatchCount.replace(patternName, 0);
				break;
			}
			System.out.println("Sub pattern name: "+subPatternName+" count: "+currentMatchCount);
			subMatches.put(subPatternName, currentMatch);
		}
		
		if(subMatches == null) {
			hybridMatchCount.replace(patternName, 0);
			return;
		}
		
		hybridMatches.put(patternName, new HybridMatch(patternName, subMatches.values(), hybridPatterns.get(patternName)));
		calculateHybridMatchCount(patternName);
		
	}
	
	private boolean checkSubMatchInjectivityConstraints(IMatch subMatch, Map<String, IMatch> subMatches) {
		GenericPattern genericPattern = genericPatterns.get(subMatch.patternName());
		Collection<AgentNodeConstraint> injectivityConstraints = genericPattern.getBody().getInjectivityConstraintsBody();
		if(injectivityConstraints.size()==0) {
			return true;
		}
		
		for(String currentPatternName : subMatches.keySet()) {
			if(currentPatternName.equals(subMatch.patternName())) {
				continue;
			}
			IMatch currentMatch = subMatches.get(currentPatternName);
			for(AgentNodeConstraint constraint : injectivityConstraints) {
				String paramName = constraint.getOperand2().getAgentType();
				if(!currentMatch.contains(paramName)) {
					continue;
				}
				if(subMatch.get(paramName).equals(currentMatch.get(paramName))) {
					return false;
				}
			}
			
		}
		
		return true;
	}
	
	private void calculateHybridMatchCount(String patternName) {
		HybridPattern hybridPattern = hybridPatterns.get(patternName);
		Collection<String> subPatterNames = hybridPattern.getGenericSubPatterns().keySet();
		Collection<AgentNodeConstraint> constraints = hybridPattern.getInjectivityConstraintsSignature();
		
		int count = 1;
		List<String> predecessors = new LinkedList<String>();
		for(String subPatternName : subPatterNames) {
			int currentCount = super.getMatchCount(subPatternName);
			if(currentCount <= 0) {
				hybridMatchCount.replace(patternName, 0);
				return;
			}
			if(predecessors.size()==0) {
				count = currentCount;
				predecessors.add(subPatternName);
				continue;
			}
			
			for(String predecessor : predecessors) {
				GenericPattern predecessorPattern = hybridPattern.getGenericSubPatterns().get(predecessor);
				GenericPattern currentPattern = hybridPattern.getGenericSubPatterns().get(subPatternName);
				
				for(AgentNodeConstraint constraint : constraints) {
					if(!(hybridPattern.isGlobalSignatureInLocalSignature(currentPattern.getName(), constraint.getOperand1().getAgentVariableName()) ||
							hybridPattern.isGlobalSignatureInLocalSignature(currentPattern.getName(), constraint.getOperand2().getAgentVariableName())	)) {
						continue;
					}
					
					if((hybridPattern.isGlobalSignatureInLocalSignature(predecessorPattern.getName(), constraint.getOperand1().getAgentVariableName()) ||
							hybridPattern.isGlobalSignatureInLocalSignature(predecessorPattern.getName(), constraint.getOperand2().getAgentVariableName())	)) {
						currentCount--;
					}
					
				}
			}
			
			if(currentCount <= 0) {
				hybridMatchCount.replace(patternName, 0);
				return;
			}
			
			count *= currentCount;
			predecessors.add(subPatternName);
		}
		hybridMatchCount.replace(patternName, count);
	}
	
	@Override
	public IMatch getRandomMatch(String patternName) {
		return hybridMatches.get(patternName);
	}
	
	@Override
	public IMatch getMatchAt(String patternName, int idx) {
		return hybridMatches.get(patternName);
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
