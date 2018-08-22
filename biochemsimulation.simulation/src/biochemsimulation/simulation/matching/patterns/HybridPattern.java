package biochemsimulation.simulation.matching.patterns;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;

public class HybridPattern {
	
	private String patternName;
	
	private GenericPattern genericLhs;
	
	private Map<AgentNodeContext, List<LinkStateConstraint>> agentNodeToLinkConstraintMap;
	
	private List<Set<AgentNodeContext>> subPatterns;
	private Map<String, GenericPattern> genericSubPatterns;
	
	private Map<String, Map<String, String>> subPatternGlobalSignatureMap;
	private Map<String, String> globaltoLocalSignatureMap;
	
	public HybridPattern(String patternName, Pattern lhs) {
		this.patternName = patternName;
		
		genericLhs = new GenericPattern(patternName, lhs);
		if(genericLhs.isVoidPattern()) {
			genericSubPatterns = new HashMap<String, GenericPattern>();
			genericSubPatterns.put(patternName, genericLhs);
			return;
		}
		
		mapAgentNodesToLinkConstraints();
		splitPattern();
		generateGenericSubPatterns();
		mapSubSignaturesToSignatures();
	}
	
	private void mapAgentNodesToLinkConstraints() {
		agentNodeToLinkConstraintMap = new HashMap<AgentNodeContext, List<LinkStateConstraint>>();
		for(LinkStateConstraint lsc : genericLhs.getBody().getLinkStateConstraints().values()) {
			List<LinkStateConstraint> links = agentNodeToLinkConstraintMap.get(lsc.getOperand1().getSiteNodeContext().getAgentNodeContext());
			if(links == null) {
				links = new LinkedList<LinkStateConstraint>();
				agentNodeToLinkConstraintMap.put(lsc.getOperand1().getSiteNodeContext().getAgentNodeContext(), links);
			}
			links.add(lsc);
			
			List<LinkStateConstraint> links2 = agentNodeToLinkConstraintMap.get(lsc.getOperand2().getSiteNodeContext().getAgentNodeContext());
			if(links2 == null) {
				links2 = new LinkedList<LinkStateConstraint>();
				agentNodeToLinkConstraintMap.put(lsc.getOperand2().getSiteNodeContext().getAgentNodeContext(), links);
			}
			links2.add(lsc);
		}
	}
	
	private void splitPattern() {
		subPatterns = new LinkedList<Set<AgentNodeContext>>();
		Set<AgentNodeContext> pattern = new HashSet<AgentNodeContext>();
		pattern.addAll(genericLhs.getBody().getAgentNodeContexts().values());

		// find minimal spanning tree for each connected sub-graph
		while(!pattern.isEmpty()) {
			AgentNodeContext currentSubPattern = pattern.iterator().next();
			pattern.remove(currentSubPattern);
			
			Set<AgentNodeContext> currentSubSet = new HashSet<AgentNodeContext>();
			currentSubSet.add(currentSubPattern);
			
			ConcurrentLinkedQueue<LinkStateConstraint> outgoingLinks =  new ConcurrentLinkedQueue<LinkStateConstraint>();
			if(!agentNodeToLinkConstraintMap.containsKey(currentSubPattern)) {
				subPatterns.add(currentSubSet);
				continue;
			}
			outgoingLinks.addAll(agentNodeToLinkConstraintMap.get(currentSubPattern));
			
			while(!outgoingLinks.isEmpty()) {
				LinkStateConstraint currentLink = outgoingLinks.poll();
				if(currentLink.getOperand1().getStateType() != LinkStateType.Bound) {
					continue;
				}
				AgentNodeContext operand1 = currentLink.getOperand1().getSiteNodeContext().getAgentNodeContext();
				AgentNodeContext operand2 = currentLink.getOperand1().getSiteNodeContext().getAgentNodeContext();
				if(operand1 != currentSubPattern) {
					if(pattern.contains(operand1)) {
						pattern.remove(operand1);
						outgoingLinks.addAll(agentNodeToLinkConstraintMap.get(operand1));
						currentSubSet.add(operand1);
					}
				}
				if(operand2 != currentSubPattern) {
					if(pattern.contains(operand2)) {
						pattern.remove(operand2);
						outgoingLinks.addAll(agentNodeToLinkConstraintMap.get(operand2));
						currentSubSet.add(operand2);
					}
				}
			}
			subPatterns.add(currentSubSet);
		}
	}
	
	private void generateGenericSubPatterns() {
		genericSubPatterns = new HashMap<String, GenericPattern>();
		globaltoLocalSignatureMap = new HashMap<String, String>();
		int c = 0;
		for(Set<AgentNodeContext> subPattern : subPatterns) {
			List<ValidAgentPattern> vaps = subPattern.stream()
					.map(agentNode -> genericLhs.getSignature().getSignaturePattern(agentNode.getAgentVariableName()))
					.collect(Collectors.toList());
			
			String subPatternName = patternName+c;
			GenericPattern genericSubPattern = new GenericPattern(subPatternName, vaps);
			genericSubPatterns.put(subPatternName, genericSubPattern);
			
			for(ValidAgentPattern vap : vaps) {
				String signatureNodeGlobal = genericLhs.getSignature().getSignatureNode(vap);
				String signatureNodeLocal = genericSubPattern.getSignature().getSignatureNode(vap);
				globaltoLocalSignatureMap.put(signatureNodeGlobal, signatureNodeLocal);
			}
			
			c++;
		}
	}
	
	private void mapSubSignaturesToSignatures() {
		subPatternGlobalSignatureMap = new HashMap<String, Map<String,String>>();
		for(GenericPattern subPattern : genericSubPatterns.values()) {
			Map<String, String> mapping = subPatternGlobalSignatureMap.get(subPattern.getName());
			if(mapping == null) {
				mapping = new HashMap<String, String>();
				subPatternGlobalSignatureMap.put(subPattern.getName(), mapping);
			}
			Map<ValidAgentPattern, AgentNodeContext> contextNodes = subPattern.getBody().getAgentNodeContexts();
			for(ValidAgentPattern vap : contextNodes.keySet()) {
				mapping.put(contextNodes.get(vap).getAgentVariableName(), genericLhs.getSignature().getSignatureNode(vap));
			}
		}
	}
	
	public Map<String, GenericPattern> getGenericSubPatterns() {
		return genericSubPatterns;
	}
	
	public Collection<AgentNodeConstraint> getInjectivityConstraintsSignature() {
		return genericLhs.getBody().getInjectivityConstraintsSignature();
	}
	
	public String localToGlobalSignature(String subPatternName, String signatureNode) {
		return subPatternGlobalSignatureMap.get(subPatternName).get(signatureNode);
	}
	
	public String globalToLocalSignature(String signatureNode) {
		return globaltoLocalSignatureMap.get(signatureNode);
	}
	
	public boolean isLocalSignatureInGlobalSignature(String subPatternName, String localSignatureNode) {
		GenericPattern localPattern = genericSubPatterns.get(subPatternName);
		ValidAgentPattern vap = localPattern.getSignature().getSignaturePattern(localSignatureNode);
		return genericLhs.getSignature().containsSignaturePattern(vap);
	}
	
	public boolean isGlobalSignatureInLocalSignature(String subPatternName, String globalSignatureNode) {
		GenericPattern localPattern = genericSubPatterns.get(subPatternName);
		ValidAgentPattern vap = genericLhs.getSignature().getSignaturePattern(globalSignatureNode);
		return localPattern.getSignature().containsSignaturePattern(vap);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("*#*#*#*#*#*");
		sb.append("\n<HybridPattern>: " + patternName);
		sb.append("\n<Original Pattern>: \n");
		sb.append(genericLhs.toString());
		sb.append("\n</Original Pattern>");
		sb.append("\n<Split Hybrid-Patterns>: \n");
		for(GenericPattern pattern : genericSubPatterns.values()) {
			sb.append(pattern.toString());
		}
		sb.append("\n</Split Hybrid-Patterns>");
		sb.append("</HybridPattern>\n");
		sb.append("*#*#*#*#*#*");
		return sb.toString();
	}
}
