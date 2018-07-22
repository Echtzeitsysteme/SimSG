package biochemsimulation.simulation.matching.democles;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import biochemsimulation.reactionrules.reactionRules.BoundAnyOfTypeLink;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;

class DemoclesPatternBody {
	
	private DemoclesPatternSignature signature;
	private List<ValidAgentPattern> agentPatterns;
	
	private Map<ValidAgentPattern, AgentNodeContext> agentNodeContexts;
	private Map<AgentNodeContext, List<SiteNodeContext>> siteNodeContexts;
	private Map<SiteNodeContext, SiteStateContext> siteStateContexts;
	private Map<SiteNodeContext, LinkStateContext> linkStateContexts;
	
	private Map<LinkStateContext, LinkStateConstraint> linkStateConstraints;
	private Collection<AgentNodeConstraint> injectivityConstraints;
	
	private Map<ValidAgentPattern, List<AgentNodeContext>> localAgentNodes;
	private Map<AgentNodeContext, SiteNodeContext> localSiteNodes;
	private Map<SiteNodeContext, LinkStateContext> localLinkStates;
	
	DemoclesPatternBody(DemoclesPatternSignature signature, List<ValidAgentPattern> agentPatterns) {
		this.signature = signature;
		this.agentPatterns = agentPatterns;
		
		buildAgentNodeContexts();
		buildSiteNodeContexts();
		buildConstraintsAndLocalNodes();
		buildInjectivityConstraints();
	}
	
	
	
	DemoclesPatternSignature getSignature() {
		return signature;
	}



	List<ValidAgentPattern> getAgentPatterns() {
		return agentPatterns;
	}



	Map<ValidAgentPattern, AgentNodeContext> getAgentNodeContexts() {
		return agentNodeContexts;
	}



	Map<AgentNodeContext, List<SiteNodeContext>> getSiteNodeContexts() {
		return siteNodeContexts;
	}



	Map<SiteNodeContext, SiteStateContext> getSiteStateContexts() {
		return siteStateContexts;
	}



	Map<SiteNodeContext, LinkStateContext> getLinkStateContexts() {
		return linkStateContexts;
	}



	Map<LinkStateContext, LinkStateConstraint> getLinkStateConstraints() {
		return linkStateConstraints;
	}



	Collection<AgentNodeConstraint> getInjectivityConstraints() {
		return injectivityConstraints;
	}



	Map<ValidAgentPattern, List<AgentNodeContext>> getLocalAgentNodes() {
		return localAgentNodes;
	}



	Map<AgentNodeContext, SiteNodeContext> getLocalSiteNodes() {
		return localSiteNodes;
	}



	Map<SiteNodeContext, LinkStateContext> getLocalLinkStates() {
		return localLinkStates;
	}



	private void buildAgentNodeContexts() {
		agentNodeContexts = new HashMap<ValidAgentPattern, AgentNodeContext>();
		for(ValidAgentPattern pattern : agentPatterns) {
			agentNodeContexts.put(pattern, new AgentNodeContext(signature.getSignatureNode(pattern), pattern.getAgent().getName()));
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
					siteStateContexts.put(currentSiteNodeContext, new SiteStateContext(currentSiteNodeContext, sitePattern.getState().getState().getName()));
				}
				if(sitePattern.getLinkState().getLinkState() != null) {
					linkStateContexts.put(currentSiteNodeContext, new LinkStateContext(currentSiteNodeContext, LinkStateType.enumFromLinkState(sitePattern.getLinkState().getLinkState())));
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
		linkStateConstraints = new HashMap<LinkStateContext, LinkStateConstraint>();
		
		for(ValidAgentPattern pattern : agentPatterns) {
			AgentNodeContext currentAgentNodeContext = agentNodeContexts.get(pattern);
			List<SiteNodeContext> currentSiteNodeContexts = siteNodeContexts.get(currentAgentNodeContext);
			
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
					String localAgentVariableName = currentAgentNodeContext.getAgentVariableName() + "_" + otherAgentType;
					
					AgentNodeContext localAgentNodeContext = new AgentNodeContext(localAgentVariableName, otherAgentType);
					SiteNodeContext localSiteNodeContext = new SiteNodeContext(localAgentNodeContext, otherSiteType);
					LinkStateContext localLinkStateContext = new LinkStateContext(localSiteNodeContext, LinkStateType.BoundAnyOfType);
					
					localAgentNodeList.add(localAgentNodeContext);
					localSiteNodes.put(localAgentNodeContext, localSiteNodeContext);
					localLinkStates.put(localSiteNodeContext, localLinkStateContext);
					
					LinkStateConstraint constraint = new LinkStateConstraint(currentLinkStateContext, localLinkStateContext, ConstraintType.equal);
					linkStateConstraints.put(currentLinkStateContext, constraint);
					
				}else if(currentLinkStateContext.getStateType() == LinkStateType.Bound) {
					BoundLink boundLink = (BoundLink)link;
					int linkIdx = Integer.valueOf(boundLink.getState());
					LinkStateContext otherSite = findLinkedSite(pattern, linkIdx);
					LinkStateConstraint constraint = new LinkStateConstraint(currentLinkStateContext, otherSite, ConstraintType.equal);
					linkStateConstraints.put(otherSite, constraint);
				}
				
			}
			
			if(localAgentNodeList.size() > 0) {
				localAgentNodes.put(pattern, localAgentNodeList);
			}
		}
	}
	
	private void buildInjectivityConstraints() {
		injectivityConstraints = new LinkedList<AgentNodeConstraint>();
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
	
	
}
