package biochemsimulation.simulation.matching.patterns;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

import biochemsimulation.reactioncontainer.util.EPackageWrapper;
import biochemsimulation.reactionrules.reactionRules.BoundAnyOfTypeLink;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;

public class HybridPattern {
	
	private String patternName;
	private EPackageWrapper metaModel;
	
	private GenericPattern genericLhs;
	
	private Map<AgentNodeContext, List<LinkStateConstraint>> agentNodeToLinkConstraintMap;
	
	private List<Set<AgentNodeContext>> subPatterns;
	private Map<String, GenericPattern> genericSubPatterns;
	
	private Map<String, Map<String, String>> subPatternGlobalSignatureMap;
	private Map<String, String> globaltoLocalSignatureMap;
	
	private Collection<AgentNodeConstraint> gloablInjectivityConstraints;
	
	public HybridPattern(String patternName, Pattern lhs, EPackageWrapper metaModel) {
		this.patternName = patternName;
		this.metaModel = metaModel;
		
		genericLhs = new GenericPattern(patternName, this.metaModel, lhs);
		if(genericLhs.isVoidPattern()) {
			genericSubPatterns = new HashMap<String, GenericPattern>();
			genericSubPatterns.put(patternName, genericLhs);
			return;
		}
		
		mapAgentNodesToLinkConstraints();
		splitPattern();
		generateGenericSubPatterns();
		mapSubSignaturesToSignatures();
		generateGlobalInjectivityConstraints();
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
			/*
			System.out.println("**** Current Node: "+currentSubPattern.getAgentVariableName());
			outgoingLinks.forEach(x-> {
				System.out.println("Link: From "+x.getOperand1().getSiteNodeContext().getAgentNodeContext().getAgentVariableName());
				System.out.print(" -> To "+x.getOperand2().getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+ "\n");
			});
			*/
			
			while(!outgoingLinks.isEmpty()) {
				LinkStateConstraint currentLink = outgoingLinks.poll();
				if(currentLink.getOperand1().getStateType() != LinkStateType.Bound) {
					continue;
				}
				AgentNodeContext operand1 = currentLink.getOperand1().getSiteNodeContext().getAgentNodeContext();
				AgentNodeContext operand2 = currentLink.getOperand2().getSiteNodeContext().getAgentNodeContext();
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
		//System.out.println(subPatterns.size());
	}
	
	private void generateGenericSubPatterns() {
		Map<String, GenericPattern>genericSubPatternsTemp = new HashMap<String, GenericPattern>();
		globaltoLocalSignatureMap = new HashMap<String, String>();
		int c = 0;
		for(Set<AgentNodeContext> subPattern : subPatterns) {
			Set<ValidAgentPattern> vapsTemp = subPattern.stream()
					.map(agentNode -> genericLhs.getSignature().getSignaturePattern(agentNode.getAgentVariableName()))
					.collect(Collectors.toSet());
			List<ValidAgentPattern> vaps = new LinkedList<ValidAgentPattern>();
			for(ValidAgentPattern vap: genericLhs.getBody().getAgentPatterns()) {
				if(vapsTemp.contains(vap)) {
					vaps.add(vap);
					vapsTemp.remove(vap);
				}
			}
			
			String subPatternName = patternName+c;
			
			GenericPattern genericSubPattern = new GenericPattern(subPatternName, metaModel, vaps);
			genericSubPatternsTemp.put(subPatternName, genericSubPattern);
			
			/*
			System.out.println("Local order of: "+subPatternName+", ");
			genericSubPattern.getBody().getAgentNodeContexts().values().forEach(x->System.out.println("NodeName: "+x.getAgentVariableName()));
			*/
			for(ValidAgentPattern vap : vaps) {
				String signatureNodeGlobal = genericLhs.getSignature().getSignatureNode(vap);
				String signatureNodeLocal = genericSubPattern.getSignature().getSignatureNode(vap);
				globaltoLocalSignatureMap.put(signatureNodeGlobal, signatureNodeLocal);
			}
			
			c++;
		}
		
		genericSubPatterns = new LinkedHashMap<String, GenericPattern>();
		for(ValidAgentPattern vap: genericLhs.getBody().getAgentPatterns()) {
			GenericPattern subPattern = null;
			for(GenericPattern pattern : genericSubPatternsTemp.values()) {
				if(pattern.getBody().getAgentNodeContexts().containsKey(vap)) {
					subPattern = pattern;
					break;
				}
			}
			if(subPattern == null) {
				continue;
			}
			
			genericSubPatterns.put(subPattern.getName(), subPattern);
			genericSubPatternsTemp.remove(subPattern.getName());
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
	
	private void generateGlobalInjectivityConstraints() {
		gloablInjectivityConstraints = new LinkedList<AgentNodeConstraint>();
		Collection<AgentNodeConstraint> injectivityConstraintsSignature = genericLhs.getBody().getInjectivityConstraintsSignature();
		for(AgentNodeConstraint anc : injectivityConstraintsSignature) {
			//System.out.println("PatternName1 : "+anc.getOperand1().getPatternName()+", VarName: "+anc.getOperand1().getAgentVariableName());
			//System.out.println("PatternName2 : "+anc.getOperand2().getPatternName()+", VarName: "+anc.getOperand2().getAgentVariableName());
			//String signatureNode1 = localToGlobalSignature(anc.getOperand1().getPatternName(), anc.getOperand1().getAgentVariableName());
			//String signatureNode2 = localToGlobalSignature(anc.getOperand2().getPatternName(), anc.getOperand2().getAgentVariableName());
			//ValidAgentPattern vap1 = genericLhs.getSignature().getSignaturePattern(signatureNode1);
			//ValidAgentPattern vap2 = genericLhs.getSignature().getSignaturePattern(signatureNode2);
			if(patternsIntersect(genericLhs.getSignature().getSignaturePattern(anc.getOperand1().getAgentVariableName()), 
					genericLhs.getSignature().getSignaturePattern(anc.getOperand2().getAgentVariableName()))) {
				gloablInjectivityConstraints.add(anc);
			}
		}
	}
	
	boolean patternsIntersect(ValidAgentPattern vap1, ValidAgentPattern vap2) {
		return patternsIntersectFwd(vap1, vap2) && patternsIntersectFwd(vap2, vap1);
	}
	
	boolean patternsIntersectFwd(ValidAgentPattern vap1, ValidAgentPattern vap2) {
		for(SitePattern sp1 : vap1.getSitePatterns().getSitePatterns()) {
			String sp1Name = sp1.getSite().getName();
			
			String sp1State = null;
			if(sp1.getState() != null) {
				sp1State = sp1.getState().getState().getName();
			}else if(sp1.getSite().getStates().getState() != null) {
				if(sp1.getSite().getStates().getState().size()>0) {
					sp1State = sp1.getSite().getStates().getState().get(0).getName();
				}
			}
			
			LinkStateType lst1 = null;
			if(sp1.getLinkState().getLinkState() != null) {
				lst1 = LinkStateType.enumFromLinkState(sp1.getLinkState().getLinkState());
			}
			
			for(SitePattern sp2 : vap2.getSitePatterns().getSitePatterns()) {
				String sp2Name = sp2.getSite().getName();
				if(!sp1Name.equals(sp2Name)) {
					continue;
				}
				
				if(sp1State != null) {
					String sp2State = null;
					if(sp2.getState() != null) {
						sp2State = sp2.getState().getState().getName();
					}else if(sp2.getSite().getStates().getState() != null) {
						sp2State = sp2.getSite().getStates().getState().get(0).getName();
					}
					if(!sp1State.equals(sp2State)) {
						return false;
					}
				}
				
				LinkStateType lst2 = null;
				if(sp2.getLinkState().getLinkState() != null) {
					lst2 = LinkStateType.enumFromLinkState(sp2.getLinkState().getLinkState());
				}
				
				if(lst2 == LinkStateType.WhatEver || lst1 == LinkStateType.WhatEver) {
					continue;
				}
				
				if(lst1 == LinkStateType.Unbound && !(lst2 == LinkStateType.Unbound || lst2 == LinkStateType.WhatEver)) {
					return false;
				}
				
				if(lst2 == LinkStateType.Unbound && !(lst1 == LinkStateType.Unbound || lst1 == LinkStateType.WhatEver)) {
					return false;
				}
				
				if(lst1 == LinkStateType.BoundAnyOfType && lst2 == LinkStateType.BoundAnyOfType) {
					BoundAnyOfTypeLink baotl1 = (BoundAnyOfTypeLink)sp1.getLinkState().getLinkState();
					BoundAnyOfTypeLink baotl2 = (BoundAnyOfTypeLink)sp2.getLinkState().getLinkState();
					if(!baotl1.getLinkAgent().getAgent().getName().equals(baotl2.getLinkAgent().getAgent().getName())) {
						return false;
					}
					if(!baotl1.getLinkSite().getSite().getName().equals(baotl2.getLinkSite().getSite().getName())) {
						return false;
					}
				}
				
				
				
			}
			
		}
		return true;
	}
	
	public GenericPattern getOriginalPattern() {
		return genericLhs;
	}
	
	public Map<String, GenericPattern> getGenericSubPatterns() {
		return genericSubPatterns;
	}
	
	public Collection<AgentNodeConstraint> getInjectivityConstraintsSignature() {
		//return genericLhs.getBody().getInjectivityConstraintsSignature();
		return gloablInjectivityConstraints;
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
