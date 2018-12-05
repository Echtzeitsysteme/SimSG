package biochemsimulation.simulation.pmc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import biochemsimulation.simulation.matching.patterns.AgentNodeConstraint;
import biochemsimulation.simulation.matching.patterns.GenericPattern;
import biochemsimulation.simulation.matching.patterns.HybridPattern;

public class HybridMatchCountTemplate {
	private HybridPattern pattern;
	private Map<String, Integer> factorMap;
	
	public HybridMatchCountTemplate(HybridPattern pattern) {
		this.pattern = pattern;
		initFactorMap();
	}
	
	private void initFactorMap() {
		factorMap = new LinkedHashMap<String, Integer>();
		Map<String, List<AgentNodeConstraint>> constraints = mapConstraintsToSubPatterns();
		
		ArrayList<String> patternNames = new ArrayList<String>(pattern.getGenericSubPatterns().keySet());
		for(int i = 0; i<patternNames.size(); i++) {
			String currentPatternName = patternNames.get(i);
			GenericPattern currentPattern =  pattern.getGenericSubPatterns().get(currentPatternName);
			if(currentPattern.isVoidPattern()) {
				factorMap.put(currentPatternName, 0);
				continue;
			}
			List<AgentNodeConstraint> constraintList = constraints.get(currentPatternName);
			if(constraintList == null) {
				factorMap.put(currentPatternName, 0);
				continue;
			}
			/*
			Map<ValidAgentPattern, List<AgentNodeConstraint>> constraintToNodeMap = new LinkedHashMap<ValidAgentPattern, List<AgentNodeConstraint>>();
			for(ValidAgentPattern p : currentPattern.getBody().getAgentPatterns()) {
				constraintToNodeMap.put(p, new LinkedList<AgentNodeConstraint>());
			}
			*/
			int constraintCount = 0;
			
			for(int j = (i-1); j >= 0; j--) {
				String predecessorName = patternNames.get(j);
				for(AgentNodeConstraint constraint : constraintList) {
					String operand1 = constraint.getOperand1().getAgentVariableName();
					String operand2 = constraint.getOperand2().getAgentVariableName();
					if(!(pattern.isGlobalSignatureInLocalSignature(predecessorName, operand1) ||
							pattern.isGlobalSignatureInLocalSignature(predecessorName, operand2))) {
						continue;
					}
					/*
					ValidAgentPattern src = null;
					if(pattern.isGlobalSignatureInLocalSignature(currentPatternName, operand1)) {
						src = currentPattern.getSignature().getSignaturePattern(pattern.globalToLocalSignature(operand1));
					} else {
						src = currentPattern.getSignature().getSignaturePattern(pattern.globalToLocalSignature(operand2));
					}
					constraintToNodeMap.get(src).add(constraint);
					*/
					constraintCount++;
					break;
				}
			}
			/*
			int maxConstraints = 0;
			for(List<AgentNodeConstraint> cList : constraintToNodeMap.values()) {
				if(cList.size()>maxConstraints) {
					maxConstraints = cList.size(); 
				}
			}
			factorMap.put(currentPatternName, maxConstraints);
			*/
			if(currentPattern.getBody().isPermutable()) {
				constraintCount*=2;
			}
			factorMap.put(currentPatternName, constraintCount);
		}
	}
	
	private Map<String, List<AgentNodeConstraint>> mapConstraintsToSubPatterns() {
		Map<String, List<AgentNodeConstraint>> constraints = new LinkedHashMap<String, List<AgentNodeConstraint>>();
		if(pattern.getInjectivityConstraintsSignature() == null) {
			return constraints;
		}
		for(String subPattern : pattern.getGenericSubPatterns().keySet()) {
			for(AgentNodeConstraint constraint : pattern.getInjectivityConstraintsSignature()) {
				String operand1 = constraint.getOperand1().getAgentVariableName();
				String operand2 = constraint.getOperand2().getAgentVariableName();
				if(!(pattern.isGlobalSignatureInLocalSignature(subPattern, operand1) ||
						pattern.isGlobalSignatureInLocalSignature(subPattern, operand2))) {
					continue;
				}
				List<AgentNodeConstraint> constraintList = constraints.get(subPattern);
				if(constraintList == null) {
					constraintList = new LinkedList<AgentNodeConstraint>();
					constraints.put(subPattern, constraintList);
				}
				constraintList.add(constraint);
			}
		}
		
		return constraints;
	}
	
	public int calculateMatchCount(Map<String, Integer> countMap) {
		int count = 1;
		for(String patternName : countMap.keySet()) {
			count *= (countMap.get(patternName) - factorMap.get(patternName));
			if(count <= 0) {
				return 0;
			}
		}
		
		return count;
	}
}
