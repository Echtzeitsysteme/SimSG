package biochemsimulation.simulation.matching.patterns;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import biochemsimulation.reactioncontainer.util.AgentClassFactory;
import biochemsimulation.reactioncontainer.util.EPackageWrapper;
import biochemsimulation.reactioncontainer.util.StateClassFactory;
import biochemsimulation.reactionrules.reactionRules.BoundAnyOfTypeLink;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;

public class GenericPatternBody {
	
	private String patternName;
	private EPackageWrapper metaModel;
	private GenericPatternSignature signature;
	private List<ValidAgentPattern> agentPatterns;
	
	private Map<ValidAgentPattern, AgentNodeContext> agentNodeContexts;
	private Map<AgentNodeContext, List<SiteNodeContext>> siteNodeContexts;
	private Map<SiteNodeContext, SiteStateContext> siteStateContexts;
	private Map<SiteNodeContext, LinkStateContext> linkStateContexts;
	
	private Map<Integer, LinkStateConstraint> linkStateConstraints;
	private Collection<AgentNodeConstraint> injectivityConstraintsSignature;
	private Collection<AgentNodeConstraint> injectivityConstraintsBody;
	private Collection<AgentNodeConstraint> injectivityConstraints;
	
	private Map<ValidAgentPattern, List<AgentNodeContext>> localAgentNodes;
	private Map<AgentNodeContext, SiteNodeContext> localSiteNodes;
	private Map<SiteNodeContext, LinkStateContext> localLinkStates;
	
	private boolean permutable;
	
	public GenericPatternBody(String patternName, EPackageWrapper metaModel, 
			GenericPatternSignature signature, List<ValidAgentPattern> agentPatterns) {
		this.patternName = patternName;
		this.metaModel = metaModel;
		this.signature = signature;
		this.agentPatterns = agentPatterns;
		injectivityConstraints = new LinkedList<AgentNodeConstraint>();
		injectivityConstraintsBody = new LinkedList<AgentNodeConstraint>();
		injectivityConstraintsSignature = new LinkedList<AgentNodeConstraint>();
		
		buildAgentNodeContexts();
		buildSiteNodeContexts();
		buildConstraintsAndLocalNodes();
		buildInjectivityConstraints();
		permutable = false;
		checkPermutability();
	}
	
	
	
	public GenericPatternSignature getSignature() {
		return signature;
	}



	public List<ValidAgentPattern> getAgentPatterns() {
		return agentPatterns;
	}



	public Map<ValidAgentPattern, AgentNodeContext> getAgentNodeContexts() {
		return agentNodeContexts;
	}



	public Map<AgentNodeContext, List<SiteNodeContext>> getSiteNodeContexts() {
		return siteNodeContexts;
	}



	public Map<SiteNodeContext, SiteStateContext> getSiteStateContexts() {
		return siteStateContexts;
	}



	public Map<SiteNodeContext, LinkStateContext> getLinkStateContexts() {
		return linkStateContexts;
	}


	public Map<Integer, LinkStateConstraint> getLinkStateConstraints() {
		return linkStateConstraints;
	}

	public Collection<AgentNodeConstraint> getInjectivityConstraintsBody() {
		return injectivityConstraintsBody;
	}
	
	public Collection<AgentNodeConstraint> getInjectivityConstraintsSignature() {
		return injectivityConstraintsSignature;
	}
	
	public Collection<AgentNodeConstraint> getInjectivityConstraints() {
		return injectivityConstraints;
	}



	public Map<ValidAgentPattern, List<AgentNodeContext>> getLocalAgentNodes() {
		return localAgentNodes;
	}



	public Map<AgentNodeContext, SiteNodeContext> getLocalSiteNodes() {
		return localSiteNodes;
	}



	public Map<SiteNodeContext, LinkStateContext> getLocalLinkStates() {
		return localLinkStates;
	}
	
	public boolean isPermutable() {
		return permutable;
	}



	private void buildAgentNodeContexts() {
		agentNodeContexts = new HashMap<ValidAgentPattern, AgentNodeContext>();
		for(ValidAgentPattern pattern : agentPatterns) {
			agentNodeContexts.put(pattern, new AgentNodeContext(patternName, signature.getSignatureNode(pattern), metaModel.getClass(pattern.getAgent().getName())));
		}
	}
	
	private void buildSiteNodeContexts() {
		siteNodeContexts = new HashMap<AgentNodeContext, List<SiteNodeContext>>();
		siteStateContexts = new HashMap<SiteNodeContext, SiteStateContext>();
		linkStateContexts = new HashMap<SiteNodeContext, LinkStateContext>();
		
		for(ValidAgentPattern pattern : agentPatterns) {
			AgentNodeContext currentAgentNodeContext = agentNodeContexts.get(pattern);
			List<SiteNodeContext> currentSiteNodeContexts = new LinkedList<SiteNodeContext>();
			for(SitePattern sitePattern : pattern.getSitePatterns().getSitePatterns()) {
				SiteNodeContext currentSiteNodeContext = new SiteNodeContext(currentAgentNodeContext, sitePattern.getSite().getName());
				if(sitePattern.getState() != null) {
					String refName = StateClassFactory.createReferenceName(pattern.getAgent(), sitePattern.getSite(), sitePattern.getState().getState());
					String stateName = sitePattern.getState().getState().getName();
					siteStateContexts.put(currentSiteNodeContext, new SiteStateContext(currentSiteNodeContext, metaModel.getEReference(refName), metaModel.getClass(stateName)));
				}
				if(sitePattern.getLinkState().getLinkState() != null) {
					String refName = AgentClassFactory.createReferenceName(pattern.getAgent(), sitePattern.getSite());
					LinkState ls = sitePattern.getLinkState().getLinkState();
					linkStateContexts.put(currentSiteNodeContext, new LinkStateContext(currentSiteNodeContext, LinkStateType.enumFromLinkState(ls), metaModel.getEReference(refName)));
				}
				currentSiteNodeContexts.add(currentSiteNodeContext);
			}
			if(currentSiteNodeContexts.size() > 0) {
				siteNodeContexts.put(currentAgentNodeContext, currentSiteNodeContexts);
			}
		}
	}
	
	private void buildConstraintsAndLocalNodes() {
		localAgentNodes = new HashMap<ValidAgentPattern, List<AgentNodeContext>>();
		localSiteNodes = new HashMap<AgentNodeContext, SiteNodeContext>();
		localLinkStates = new HashMap<SiteNodeContext, LinkStateContext>();
		linkStateConstraints = new HashMap<Integer, LinkStateConstraint>();
		
		for(ValidAgentPattern pattern : agentPatterns) {
			AgentNodeContext currentAgentNodeContext = agentNodeContexts.get(pattern);
			List<SiteNodeContext> currentSiteNodeContexts = siteNodeContexts.get(currentAgentNodeContext);
			if(currentSiteNodeContexts == null) {
				continue;
			}
			List<AgentNodeContext> localAgentNodeList = new LinkedList<AgentNodeContext>();
			int idx = -1;
			for(SiteNodeContext currentSiteNodeContext : currentSiteNodeContexts) {
				idx++;
				
				if(!linkStateContexts.containsKey(currentSiteNodeContext)) {
					continue;
				}
				
				LinkStateContext currentLinkStateContext = linkStateContexts.get(currentSiteNodeContext);
				LinkState link = pattern.getSitePatterns().getSitePatterns().get(idx).getLinkState().getLinkState();
				
				if(currentLinkStateContext.getStateType() == LinkStateType.BoundAnyOfType) {
					BoundAnyOfTypeLink boundLink = (BoundAnyOfTypeLink)link;
					String otherAgentType = boundLink.getLinkAgent().getAgent().getName();
					String otherSiteType = boundLink.getLinkSite().getSite().getName();
					String localAgentVariableName = currentAgentNodeContext.getAgentVariableName() + "_" + otherAgentType + idx;
					
					AgentNodeContext localAgentNodeContext = new AgentNodeContext(patternName, localAgentVariableName, metaModel.getClass(otherAgentType));
					localAgentNodeContext.setLocal();
					SiteNodeContext localSiteNodeContext = new SiteNodeContext(localAgentNodeContext, otherSiteType);
					String refName = AgentClassFactory.createReferenceName(boundLink.getLinkAgent().getAgent(), boundLink.getLinkSite().getSite());
					LinkStateContext localLinkStateContext = new LinkStateContext(localSiteNodeContext, LinkStateType.BoundAnyOfType, metaModel.getEReference(refName));
					
					localAgentNodeList.add(localAgentNodeContext);
					localSiteNodes.put(localAgentNodeContext, localSiteNodeContext);
					localLinkStates.put(localSiteNodeContext, localLinkStateContext);
					
					currentLinkStateContext.setTargetLinkState(localLinkStateContext);
					localLinkStateContext.setTargetLinkState(currentLinkStateContext);
					
					LinkStateConstraint constraint = new LinkStateConstraint(currentLinkStateContext, localLinkStateContext, ConstraintType.equal);
					linkStateConstraints.put(currentLinkStateContext.hashCode(), constraint);
					// remove self occurences
					AgentNodeConstraint localInjConstraint = new AgentNodeConstraint(currentAgentNodeContext, localAgentNodeContext, ConstraintType.unequal);
					localInjConstraint.setLocal();
					injectivityConstraints.add(localInjConstraint);
					
				}else if(currentLinkStateContext.getStateType() == LinkStateType.Bound) {
					BoundLink boundLink = (BoundLink)link;
					int linkIdx = Integer.valueOf(boundLink.getState());
					LinkStateContext otherSite = findLinkedSite(pattern, linkIdx);
					
					LinkStateConstraint constraint = new LinkStateConstraint(currentLinkStateContext, otherSite, ConstraintType.equal);
					int key2 = otherSite.hashCode();
					int key1 = currentLinkStateContext.hashCode();
					int key = (key1>key2)?key1:key2;
					linkStateConstraints.putIfAbsent(key, constraint);
					
					currentLinkStateContext.setTargetLinkState(otherSite);
					otherSite.setTargetLinkState(currentLinkStateContext);
				}
				
			}
			
			if(localAgentNodeList.size() > 0) {
				localAgentNodes.put(pattern, localAgentNodeList);
			}
		}
	}
	
	private void buildInjectivityConstraints() {
		//injectivityConstraints = new LinkedList<AgentNodeConstraint>();
		Map<String, List<String>> injectivityConflicts = signature.getInjectivityConflicts();
		Map<Integer, AgentNodeConstraint> constraints = new HashMap<Integer, AgentNodeConstraint>();
		
		for(List<String> nodes : injectivityConflicts.values()) {
			for(String node : nodes) {
				for(String node2 : nodes) {
					if(node.equals(node2)) {
						continue;
					}
					int key1 = (node+node2).hashCode();
					int key2 = (node2+node).hashCode();
					int key = (key1 > key2)?key1:key2;
					AgentNodeContext agentNode = agentNodeContexts.get(signature.getSignaturePattern(node));
					AgentNodeContext agentNode2 = agentNodeContexts.get(signature.getSignaturePattern(node2));
					constraints.putIfAbsent(key, new AgentNodeConstraint(agentNode, agentNode2, ConstraintType.unequal));
				}
			}
		}
		for(AgentNodeConstraint injConstraint : constraints.values()) {
			if(injConstraint.isLocal()) {
				injectivityConstraintsBody.add(injConstraint);
			}else {
				injectivityConstraintsSignature.add(injConstraint);
			}
		}
		injectivityConstraints.addAll(constraints.values());
	}
	
	private LinkStateContext findLinkedSite(ValidAgentPattern pattern, int linkIdx) {
		LinkStateContext other = null;
		for(ValidAgentPattern otherPattern : agentPatterns) {
			if(pattern == otherPattern) {
				continue;
			}
			int idx = -1;
			for(SitePattern sitePattern : otherPattern.getSitePatterns().getSitePatterns()) {
				idx++;
				LinkState link = sitePattern.getLinkState().getLinkState();
				if(link == null) {
					continue;
				}
				if(!(link instanceof BoundLink)) {
					continue;
				}
				BoundLink boundLink = (BoundLink) link;
				int otherLinkIdx = Integer.valueOf(boundLink.getState());
				if(linkIdx == otherLinkIdx) {
					AgentNodeContext otherAgentNode = agentNodeContexts.get(otherPattern);
					SiteNodeContext otherSiteNode = siteNodeContexts.get(otherAgentNode).get(idx);
					other = linkStateContexts.get(otherSiteNode);
					return other;
				}
			}
		}
			
		return other;
	}
	
	private void checkPermutability() {
		if(agentPatterns.size() != 2) {
			permutable = false;
			return;
		}
		ValidAgentPattern vap1 = agentPatterns.get(0);
		ValidAgentPattern vap2 = agentPatterns.get(1);
		if(!vap1.getAgent().getName().equals(vap2.getAgent().getName())) {
			permutable = false;
			return;
		}
		if(vap1.getSitePatterns().getSitePatterns().size() != vap2.getSitePatterns().getSitePatterns().size()) {
			permutable = false;
			return;
		}
		for(int i = 0; i< vap1.getSitePatterns().getSitePatterns().size(); i++) {
			SitePattern sp1 = vap1.getSitePatterns().getSitePatterns().get(i);
			SitePattern sp2 = vap2.getSitePatterns().getSitePatterns().get(i);
			if(!sp1.getSite().getName().equals(sp2.getSite().getName())) {
				permutable = false;
				return;
			}
			
			String sp1State = null;
			if(sp1.getState() != null) {
				sp1State = sp1.getState().getState().getName();
			}else if(sp1.getSite().getStates().getState() != null) {
				if(sp1.getSite().getStates().getState().size()>0) {
					sp1State = sp1.getSite().getStates().getState().get(0).getName();
				}
			}
			
			String sp2State = null;
			if(sp2.getState() != null) {
				sp2State = sp2.getState().getState().getName();
			}else if(sp2.getSite().getStates().getState() != null) {
				if(sp2.getSite().getStates().getState().size()>0) {
					sp2State = sp2.getSite().getStates().getState().get(0).getName();
				}
			}
			
			
			if(sp1State == null ^ sp2State == null) {
				permutable = false;
				return;
			}
			
			if(sp1State != null && sp2State != null) {
				if(!sp1State.equals(sp2State)) {
					permutable = false;
					return;
				}
			}
			
			LinkStateType lst1 = null;
			if(sp1.getLinkState().getLinkState() != null) {
				lst1 = LinkStateType.enumFromLinkState(sp1.getLinkState().getLinkState());
			}
			
			LinkStateType lst2 = null;
			if(sp2.getLinkState().getLinkState() != null) {
				lst2 = LinkStateType.enumFromLinkState(sp2.getLinkState().getLinkState());
			}
			
			if(lst1 != lst2) {
				permutable = false;
				return;
			}
			
			if(lst1 == LinkStateType.BoundAnyOfType && lst2 == LinkStateType.BoundAnyOfType) {
				BoundAnyOfTypeLink baotl1 = (BoundAnyOfTypeLink)sp1.getLinkState().getLinkState();
				BoundAnyOfTypeLink baotl2 = (BoundAnyOfTypeLink)sp2.getLinkState().getLinkState();
				if(!baotl1.getLinkAgent().getAgent().getName().equals(baotl2.getLinkAgent().getAgent().getName())) {
					permutable = false;
					return;
				}
				if(!baotl1.getLinkSite().getSite().getName().equals(baotl2.getLinkSite().getSite().getName())) {
					permutable = false;
					return;
				}
			}
			
		}
		//System.out.println("Perm. Pattern: "+pattern.getName());
		permutable = true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("##<Body>:");
		sb.append("\n\t<Links>:");
		sb.append("\n\t\t Bound-Links:\n");
		
		for(LinkStateConstraint lsc : linkStateConstraints.values()) {
			if(lsc.getOperand1().getStateType() != LinkStateType.Bound) {
				continue;
			}
			sb.append("\t\t\tFrom: Agent("+lsc.getOperand1().getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+")");
			sb.append(".Site("+lsc.getOperand1().getSiteNodeContext().getSiteTypeName()+") <====> ");
			sb.append("To: Agent("+lsc.getOperand2().getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+")");
			sb.append(".Site("+lsc.getOperand2().getSiteNodeContext().getSiteTypeName()+");\n");
		}
		sb.append("\n\t\t BoundToAnyOfType-Links:\n");
		for(LinkStateConstraint lsc : linkStateConstraints.values()) {
			if(lsc.getOperand1().getStateType() != LinkStateType.BoundAnyOfType) {
				continue;
			}
			sb.append("\t\t\tFrom: Agent("+lsc.getOperand1().getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+")");
			sb.append(".Site("+lsc.getOperand1().getSiteNodeContext().getSiteTypeName()+") <====> ");
			sb.append("To: Agent("+lsc.getOperand2().getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+")");
			sb.append(".Site("+lsc.getOperand2().getSiteNodeContext().getSiteTypeName()+");\n");
		}
		sb.append("\n\t\t BoundToAny-Links:\n");
		for(LinkStateConstraint lsc : linkStateConstraints.values()) {
			if(lsc.getOperand1().getStateType() != LinkStateType.BoundAny) {
				continue;
			}
			sb.append("\t\t\tFrom: Agent("+lsc.getOperand1().getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+")");
			sb.append(".Site("+lsc.getOperand1().getSiteNodeContext().getSiteTypeName()+") <====> Agent(*).Site(*);\n");
		}
		sb.append("\n\t\t WhatEver-Links:\n");
		for(LinkStateConstraint lsc : linkStateConstraints.values()) {
			if(lsc.getOperand1().getStateType() != LinkStateType.WhatEver) {
				continue;
			}
			sb.append("\t\t\tFrom: Agent("+lsc.getOperand1().getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+")");
			sb.append(".Site("+lsc.getOperand1().getSiteNodeContext().getSiteTypeName()+") <==??==> (??);\n");
		}
		sb.append("\n\t\t Unbound-Links:\n");
		for(LinkStateConstraint lsc : linkStateConstraints.values()) {
			if(lsc.getOperand1().getStateType() != LinkStateType.Unbound) {
				continue;
			}
			sb.append("\t\t\tFrom: Agent("+lsc.getOperand1().getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+")");
			sb.append(".Site("+lsc.getOperand1().getSiteNodeContext().getSiteTypeName()+") <==!!==> (Unbound);\n");
		}
		
		sb.append("\n\t</Links>");
		sb.append("\n\t<States>:\n");
		for(SiteStateContext state: siteStateContexts.values()) {
			sb.append("\t\tAgent("+state.getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+")");
			sb.append(".Site("+state.getSiteNodeContext().getSiteTypeName()+") ==> State("+state.getStateType()+");\n");
		}
		sb.append("\n\t</States>");
		sb.append("\n\t<Injectivity Constraints>:\n");
		for(AgentNodeConstraint injConstr : injectivityConstraints) {
			sb.append("\t\tAgent("+injConstr.getOperand1().getAgentVariableName()+") != Agent("+injConstr.getOperand2().getAgentVariableName()+");\n");
		}
		sb.append("\n\t<Injectivity Constraints>");
		sb.append("\n##</Body>:");
		return sb.toString();
	}
}
