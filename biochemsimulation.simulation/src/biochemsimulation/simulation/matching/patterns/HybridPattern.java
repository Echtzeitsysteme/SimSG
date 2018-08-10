package biochemsimulation.simulation.matching.patterns;

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
	private Pattern lhs;
	
	private GenericPattern genericLhs;
	
	private Map<AgentNodeContext, List<LinkStateConstraint>> agentNodeToLinkConstraintMap;
	
	private List<Set<AgentNodeContext>> subPatterns;
	private List<GenericPattern> genericSubPatterns;
	
	public HybridPattern(String patternName, Pattern lhs) {
		this.patternName = patternName;
		this.lhs = lhs;
		
		genericLhs = new GenericPattern(patternName, lhs);
		if(genericLhs.isVoidPattern()) {
			return;
		}
		mapAgentNodesToLinkConstraints();
		splitPattern();
		generateGenericSubPatterns();
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
		genericSubPatterns = new LinkedList<GenericPattern>();
		int c = 0;
		for(Set<AgentNodeContext> subPattern : subPatterns) {
			List<ValidAgentPattern> vaps = subPattern.stream()
					.map(agentNode -> genericLhs.getSignature().getSignaturePattern(agentNode.getAgentVariableName()))
					.collect(Collectors.toList());
			genericSubPatterns.add(new GenericPattern(patternName+c, vaps));
			c++;
		}
	}
}
