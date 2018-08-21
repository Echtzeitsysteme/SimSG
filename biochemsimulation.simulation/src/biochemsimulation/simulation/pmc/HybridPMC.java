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
import biochemsimulation.simulation.matching.patterns.AgentNodeConstraint;
import biochemsimulation.simulation.matching.patterns.GenericPattern;
import biochemsimulation.simulation.matching.patterns.GenericPatternSignature;
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
		hybridMatches = new HashMap<String, IMatch>();
		hybridMatchCount = new HashMap<String, Integer>();
		for(String hybridPattern : hybridPatterns.keySet()) {
			hybridMatches.put(hybridPattern, null);
			hybridMatchCount.put(hybridPattern, 0);
		}
		
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
		
		Map<String, IMatch> subMatches = new HashMap<String, IMatch>();
		for(String subPatternName : subPatterNames) {
			if(super.getMatchCount(subPatternName) == 0) {
				subMatches = null;
				hybridMatchCount.replace(patternName, 0);
				break;
			}
			
			int idx = 0;
			IMatch currentMatch = null;
			int currentMatchCount = super.getMatchCount(subPatternName);
			do{
				currentMatch = getMatchAt(subPatternName, idx);
				idx++;
			}while(idx < currentMatchCount && !checkSubMatchInjectivityConstraints(currentMatch, subMatches));
			
			if(idx == currentMatchCount) {
				subMatches = null;
				hybridMatchCount.replace(patternName, 0);
				break;
			}
			
			subMatches.put(subPatternName, currentMatch);
		}
		
		if(subMatches == null) {
			hybridMatchCount.replace(patternName, 0);
			return;
		}
		
		hybridMatches.put(patternName, new HybridMatch(patternName, subMatches.values()));
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
	
	// For now, a very primitive and also wrong method to calculate hybrid match counts
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
				GenericPatternSignature predecessorSignature = hybridPattern.getGenericSubPatterns().get(predecessor).getSignature();
				GenericPatternSignature currentSignature = hybridPattern.getGenericSubPatterns().get(subPatternName).getSignature();
				
				for(AgentNodeConstraint constraint : constraints) {
					String op1 = hybridPattern.globalToLocalSignature(constraint.getOperand1().getAgentVariableName());
					String op2 = hybridPattern.globalToLocalSignature(constraint.getOperand2().getAgentVariableName());
					if((predecessorSignature.containsSignatureNode(op1) || predecessorSignature.containsSignatureNode(op2)) && 
							(currentSignature.containsSignatureNode(op1) || currentSignature.containsSignatureNode(op2))) {
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
