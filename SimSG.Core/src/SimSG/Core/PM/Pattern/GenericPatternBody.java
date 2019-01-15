package SimSG.Core.PM.Pattern;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentLinkedQueue;

import SimSG.Container.util.AgentClassFactory;
import SimSG.Container.util.EPackageWrapper;
import SimSG.Container.util.StateClassFactory;
import biochemsimulation.reactionrules.reactionRules.Agent;
import biochemsimulation.reactionrules.reactionRules.BoundAnyOfTypeLink;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.IndexedFreeLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.MultiLink;
import biochemsimulation.reactionrules.reactionRules.MultiLinkSitePattern;
import biochemsimulation.reactionrules.reactionRules.SingleSitePattern;
import biochemsimulation.reactionrules.reactionRules.Site;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.TypedFreeLink;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;

public class GenericPatternBody {
	
	private String patternName;
	private EPackageWrapper metaModel;
	private GenericPatternSignature signature;
	private List<ValidAgentPattern> agentPatterns;
	
	private Map<ValidAgentPattern, AgentNodeContext> agentNodeContexts;
	private Map<AgentNodeContext, List<SiteNodeContext>> siteNodeContexts;
	private Map<SiteNodeContext, SiteStateContext> siteStateContexts;
	private Map<SiteNodeContext, List<LinkStateContext>> linkStateContexts;
	private Map<Integer, Entry<LinkStateContext, LinkStateContext>> boundLinkStateContexts;
	private Map<Integer, Entry<LinkStateContext, LinkStateContext>> indexedFreeLinkStateContexts;
	
	private Map<AgentNodeContext, List<Entry<LinkStateContext, LinkStateContext>>> agentNodeToLinkMap;
	private List<Set<AgentNodeContext>> subPatterns;
	private Map<AgentNodeContext, Set<AgentNodeContext>> agentNodeToSubPatternMap;
	
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
		buildLocalLinksAndLocalNodes();
		buildInjectivityConstraints();
		mapAgentNodesToLinks();
		findSubPatterns();
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



	public Map<SiteNodeContext, List<LinkStateContext>> getLinkStateContexts() {
		return linkStateContexts;
	}
	
	public Map<Integer, Entry<LinkStateContext, LinkStateContext>> getBoundLinkStateContexts() {
		return boundLinkStateContexts;
	}
	
	public Map<Integer, Entry<LinkStateContext, LinkStateContext>> getIndexedFreeLinkStateContexts() {
		return indexedFreeLinkStateContexts;
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
	
	public Set<AgentNodeContext> getSubPattern(AgentNodeContext anc) {
		return agentNodeToSubPatternMap.get(anc);
	}
	
	public List<Set<AgentNodeContext>> getAllSubPatterns() {
		return subPatterns;
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
		linkStateContexts = new HashMap<SiteNodeContext, List<LinkStateContext>>();
		boundLinkStateContexts = new HashMap<Integer, Map.Entry<LinkStateContext,LinkStateContext>>();
		indexedFreeLinkStateContexts = new HashMap<Integer, Map.Entry<LinkStateContext,LinkStateContext>>();
		
		for(ValidAgentPattern pattern : agentPatterns) {
			AgentNodeContext currentAgentNodeContext = agentNodeContexts.get(pattern);
			List<SiteNodeContext> currentSiteNodeContexts = new LinkedList<SiteNodeContext>();
			for(SitePattern sitePattern : pattern.getSitePatterns().getSitePatterns()) {
				
				SiteNodeContext currentSiteNodeContext = createSiteNodeContext(currentAgentNodeContext, sitePattern);
				buildStateContext(pattern, sitePattern, currentSiteNodeContext);
				buildLinkStateContext(pattern, sitePattern, currentSiteNodeContext);
				
				currentSiteNodeContexts.add(currentSiteNodeContext);
			}
			if(currentSiteNodeContexts.size() > 0) {
				siteNodeContexts.put(currentAgentNodeContext, currentSiteNodeContexts);
			}
		}
	}
	
	private SiteNodeContext createSiteNodeContext(AgentNodeContext ap, SitePattern sp) {
		Site site = null;
		if(sp instanceof SingleSitePattern) site = ((SingleSitePattern)sp).getSite();
		if(sp instanceof MultiLinkSitePattern) site = ((MultiLinkSitePattern)sp).getSite();
		return new SiteNodeContext(ap, site.getName());
	}
	
	private void buildStateContext(ValidAgentPattern vap, SitePattern sp, SiteNodeContext snc) {
		if(sp.getState() == null) return;
			
		Site site = null;
		if(sp instanceof SingleSitePattern) site = ((SingleSitePattern)sp).getSite();
		if(sp instanceof MultiLinkSitePattern) site = ((MultiLinkSitePattern)sp).getSite();
		
		String refName = StateClassFactory.createReferenceName(vap.getAgent(), site, sp.getState().getState());
		String stateName = sp.getState().getState().getName();
		siteStateContexts.put(snc, new SiteStateContext(snc, metaModel.getEReference(refName), metaModel.getClass(stateName)));
	}
	
	private void buildLinkStateContext(ValidAgentPattern vap, SitePattern sp, SiteNodeContext snc) {
		List<LinkStateContext> lsc = new LinkedList<LinkStateContext>();
		if(sp instanceof SingleSitePattern) {
			SingleSitePattern ssp = (SingleSitePattern)sp;
			if(ssp.getLinkState().getLinkState() == null) return;
			
			LinkState ls = ssp.getLinkState().getLinkState();
			LinkStateContext link = createLinkStateContext(vap.getAgent(), ssp.getSite(), ls, snc);
			lsc.add(link);
			if(ls instanceof BoundLink) {
				addBoundLinkStateContexts((BoundLink) ls, link);
			}else if(ls instanceof IndexedFreeLink) {
				addIndexedUnboundLinkStateContexts((IndexedFreeLink) ls, link);
			}else if(ls instanceof TypedFreeLink) {
				addTypedUnboundLinkStateContexts((TypedFreeLink) ls, link);
			}
			
		}else {
			MultiLinkSitePattern msp = (MultiLinkSitePattern)sp;
			if(msp.getLinkState().getLinkState() == null) return;
			
			LinkState ls = msp.getLinkState().getLinkState();
			if(ls instanceof MultiLink) {
				MultiLink mls = (MultiLink)ls;
				for(LinkState ls1 : mls.getStates()) {
					// indexed free links 
					LinkStateContext link = createLinkStateContext(vap.getAgent(), msp.getSite(), ls1, snc);
					if(ls1 instanceof IndexedFreeLink) {
						lsc.add(link);
						addIndexedUnboundLinkStateContexts((IndexedFreeLink) ls1, link);
					}
					// bound links
					else if(ls1 instanceof BoundLink) {
						lsc.add(link);
						addBoundLinkStateContexts((BoundLink) ls1, link);
					}else {
						lsc.add(link);
						addTypedUnboundLinkStateContexts((TypedFreeLink) ls1, link);
					}
					
				}
			}else {
				LinkStateContext link = createLinkStateContext(vap.getAgent(), msp.getSite(), ls, snc);
				lsc.add(link);
				if(ls instanceof BoundLink) {
					addBoundLinkStateContexts((BoundLink) ls, link);
				}else if(ls instanceof IndexedFreeLink) {
					addIndexedUnboundLinkStateContexts((IndexedFreeLink) ls, link);
				}else if(ls instanceof TypedFreeLink) {
					addTypedUnboundLinkStateContexts((TypedFreeLink) ls, link);
				}
			}
		}
		
		linkStateContexts.put(snc, lsc);
		
	}
	
	private void addTypedUnboundLinkStateContexts(TypedFreeLink tfl, LinkStateContext link) {
		Agent agent = tfl.getState();
		AgentNodeContext anc = new AgentNodeContext(patternName, null, metaModel.getClass(agent.getName()));
		SiteNodeContext snc = new SiteNodeContext(anc, null);
		LinkStateContext dummyLnc =  new LinkStateContext(snc, link.getStateType(), null);
		link.setTargetLinkState(dummyLnc, -1);
	}
	
	private void addIndexedUnboundLinkStateContexts(IndexedFreeLink ifl, LinkStateContext link) {
		int idx = Integer.valueOf(ifl.getState());
		Entry<LinkStateContext, LinkStateContext> pair = indexedFreeLinkStateContexts.get(idx);
		if(pair == null) {
			pair = new AbstractMap.SimpleEntry<LinkStateContext, LinkStateContext>(link, null);
			indexedFreeLinkStateContexts.put(idx, pair);
		}else {
			link.setTargetLinkState(pair.getKey(), idx);
			pair.setValue(link);
			pair.getKey().setTargetLinkState(link, idx);
		}
	}
	
	private void addBoundLinkStateContexts(BoundLink bl, LinkStateContext link) {
		int idx = Integer.valueOf(bl.getState());
		Entry<LinkStateContext, LinkStateContext> pair = boundLinkStateContexts.get(idx);
		if(pair == null) {
			pair = new AbstractMap.SimpleEntry<LinkStateContext, LinkStateContext>(link, null);
			boundLinkStateContexts.put(idx, pair);
		}else {
			link.setTargetLinkState(pair.getKey(), idx);
			pair.setValue(link);
			pair.getKey().setTargetLinkState(link, idx);
		}
	}
	
	private LinkStateContext createLinkStateContext(Agent agent, Site site, LinkState ls, SiteNodeContext snc) {
		String refName = AgentClassFactory.createReferenceName(agent, site);
		return new LinkStateContext(snc, LinkStateType.enumFromLinkState(ls), metaModel.getEReference(refName));
	}
	
	private void buildLocalLinksAndLocalNodes() {
		localAgentNodes = new HashMap<ValidAgentPattern, List<AgentNodeContext>>();
		localSiteNodes = new HashMap<AgentNodeContext, SiteNodeContext>();
		localLinkStates = new HashMap<SiteNodeContext, LinkStateContext>();
		
		for(ValidAgentPattern pattern : agentPatterns) {
			AgentNodeContext currentAgentNodeContext = agentNodeContexts.get(pattern);
			List<SiteNodeContext> currentSiteNodeContexts = siteNodeContexts.get(currentAgentNodeContext);
			if(currentSiteNodeContexts == null) {
				continue;
			}
			
			int idx = -1;
			for(SiteNodeContext currentSiteNodeContext : currentSiteNodeContexts) {
				idx++;
				
				if(!linkStateContexts.containsKey(currentSiteNodeContext)) continue;
				SitePattern sitePattern = pattern.getSitePatterns().getSitePatterns().get(idx);
				
				for(LinkStateContext lsc : linkStateContexts.get(currentSiteNodeContext)) {
					
					if(sitePattern instanceof SingleSitePattern) {
						connectSingleLinks(pattern, currentAgentNodeContext, idx, (SingleSitePattern)sitePattern, lsc);
					}
				}
				
				
			}
		}
	}
	
	private void connectSingleLinks(ValidAgentPattern vap, AgentNodeContext anc, int nodeIndex, SingleSitePattern ssp, LinkStateContext lsc) {
		LinkState link = ssp.getLinkState().getLinkState();
		
		if(lsc.getStateType() == LinkStateType.BoundAnyOfType) {
			BoundAnyOfTypeLink boundLink = (BoundAnyOfTypeLink)link;
			String otherAgentType = boundLink.getLinkAgent().getAgent().getName();
			String otherSiteType = boundLink.getLinkSite().getSite().getName();
			String localAgentVariableName = anc.getAgentVariableName() + "_" + otherAgentType + nodeIndex;
			
			AgentNodeContext localAgentNodeContext = new AgentNodeContext(patternName, localAgentVariableName, metaModel.getClass(otherAgentType));
			localAgentNodeContext.setLocal();
			SiteNodeContext localSiteNodeContext = new SiteNodeContext(localAgentNodeContext, otherSiteType);
			String refName = AgentClassFactory.createReferenceName(boundLink.getLinkAgent().getAgent(), boundLink.getLinkSite().getSite());
			LinkStateContext localLinkStateContext = new LinkStateContext(localSiteNodeContext, LinkStateType.BoundAnyOfType, metaModel.getEReference(refName));
			
			localSiteNodes.put(localAgentNodeContext, localSiteNodeContext);
			localLinkStates.put(localSiteNodeContext, localLinkStateContext);
			
			lsc.setTargetLinkState(localLinkStateContext, localLinkStateContext.hashCode());
			localLinkStateContext.setTargetLinkState(lsc, localLinkStateContext.hashCode());
			boundLinkStateContexts.put(localLinkStateContext.hashCode(), new AbstractMap.SimpleEntry<LinkStateContext, LinkStateContext>(lsc, localLinkStateContext));

			// remove self occurences
			if(anc.getAgentType() == localAgentNodeContext.getAgentType()) {
				AgentNodeConstraint localInjConstraint = new AgentNodeConstraint(anc, localAgentNodeContext, ConstraintType.injectivity);
				localInjConstraint.setLocal();
				injectivityConstraints.add(localInjConstraint);
				
				//AgentNodeConstraint localOrderConstraint = new AgentNodeConstraint(currentAgentNodeContext, localAgentNodeContext, ConstraintType.order);
				//localOrderConstraint.setLocal();
				//injectivityConstraints.add(localOrderConstraint);
			}
			
			List<AgentNodeContext> localAgentNodeList = localAgentNodes.get(vap);
			if(localAgentNodeList == null) {
				localAgentNodeList = new LinkedList<AgentNodeContext>();
				localAgentNodes.put(vap, localAgentNodeList);
			}
			localAgentNodeList.add(localAgentNodeContext);
			
			
		}
	}
	
	private void buildInjectivityConstraints() {
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
					if(null == constraints.putIfAbsent(key, new AgentNodeConstraint(agentNode, agentNode2, ConstraintType.injectivity))) {
						/*
						AgentNodeConstraint orderConstraint = new AgentNodeConstraint(agentNode, agentNode2, ConstraintType.order);
						injectivityConstraints.add(orderConstraint);
						*/
					}
					
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
	
	private void mapAgentNodesToLinks() {
		agentNodeToLinkMap = new HashMap<AgentNodeContext, List<Entry<LinkStateContext, LinkStateContext>>>();
		for(Entry<LinkStateContext, LinkStateContext> pair : boundLinkStateContexts.values()) {
			List<Entry<LinkStateContext, LinkStateContext>> links = agentNodeToLinkMap.get(pair.getKey().getSiteNodeContext().getAgentNodeContext());
			if(links == null) {
				links = new LinkedList<Map.Entry<LinkStateContext,LinkStateContext>>();
				agentNodeToLinkMap.put(pair.getKey().getSiteNodeContext().getAgentNodeContext(), links);
			}
			links.add(pair);
			
			List<Entry<LinkStateContext, LinkStateContext>> links2 = agentNodeToLinkMap.get(pair.getValue().getSiteNodeContext().getAgentNodeContext());
			if(links2 == null) {
				links2 = new LinkedList<Map.Entry<LinkStateContext,LinkStateContext>>();
				agentNodeToLinkMap.put(pair.getValue().getSiteNodeContext().getAgentNodeContext(), links);
			}
			links2.add(pair);
		}
	}
	
	private void findSubPatterns() {
		subPatterns = new LinkedList<Set<AgentNodeContext>>();
		agentNodeToSubPatternMap = new HashMap<AgentNodeContext, Set<AgentNodeContext>>();
		
		Set<AgentNodeContext> pattern = new HashSet<AgentNodeContext>();
		pattern.addAll(getAgentNodeContexts().values());

		// find minimal spanning tree for each connected sub-graph
		while(!pattern.isEmpty()) {
			AgentNodeContext currentSubPattern = pattern.iterator().next();
			pattern.remove(currentSubPattern);
			
			Set<AgentNodeContext> currentSubSet = new HashSet<AgentNodeContext>();
			currentSubSet.add(currentSubPattern);
			
			ConcurrentLinkedQueue<Entry<LinkStateContext, LinkStateContext>> outgoingLinks =  new ConcurrentLinkedQueue<Map.Entry<LinkStateContext,LinkStateContext>>();
			if(!agentNodeToLinkMap.containsKey(currentSubPattern)) {
				addSubPattern(currentSubSet);
				continue;
			}
			outgoingLinks.addAll(agentNodeToLinkMap.get(currentSubPattern));
			
			while(!outgoingLinks.isEmpty()) {
				Entry<LinkStateContext, LinkStateContext> currentLink = outgoingLinks.poll();
				if(currentLink.getKey().getStateType() != LinkStateType.Bound) {
					continue;
				}
				AgentNodeContext operand1 = currentLink.getKey().getSiteNodeContext().getAgentNodeContext();
				AgentNodeContext operand2 = currentLink.getValue().getSiteNodeContext().getAgentNodeContext();
				if(operand1 != currentSubPattern) {
					if(pattern.contains(operand1)) {
						pattern.remove(operand1);
						outgoingLinks.addAll(agentNodeToLinkMap.get(operand1));
						currentSubSet.add(operand1);
					}
				}
				if(operand2 != currentSubPattern) {
					if(pattern.contains(operand2)) {
						pattern.remove(operand2);
						outgoingLinks.addAll(agentNodeToLinkMap.get(operand2));
						currentSubSet.add(operand2);
					}
				}
			}
			addSubPattern(currentSubSet);
		}
	}
	
	private void addSubPattern(Set<AgentNodeContext> subPattern) {
		subPatterns.add(subPattern);
		for(AgentNodeContext anc : subPattern) {
			agentNodeToSubPatternMap.put(anc, subPattern);
		}
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
			SitePattern superSp1 = vap1.getSitePatterns().getSitePatterns().get(i);
			SitePattern superSp2 = vap2.getSitePatterns().getSitePatterns().get(i);
			// ignore multi-link site patterns for now
			if(!(superSp1 instanceof SingleSitePattern) || !(superSp2 instanceof SingleSitePattern)) continue;
			SingleSitePattern sp1 = (SingleSitePattern) superSp1;
			SingleSitePattern sp2 = (SingleSitePattern) superSp2;
			
			
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
		permutable = true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("##<Body>:");
		sb.append("\n\t<Links>:");
		
		sb.append("\n\t\t Unbound-Links:\n");
		for(List<LinkStateContext>  lsc : linkStateContexts.values()) {
			for(LinkStateContext ls : lsc) {
				if(ls.getStateType() != LinkStateType.Unbound) {
					continue;
				}
				sb.append("\t\t\tFrom: Agent("+ls.getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+")");
				sb.append(".Site("+ls.getSiteNodeContext().getSiteTypeName()+") <==!!==> (Unbound);\n");
			}
		}
		sb.append("\n\t\t IndexedUnbound-Links:\n");
		for(Entry<LinkStateContext, LinkStateContext> pair : indexedFreeLinkStateContexts.values()) {
			if(pair.getKey().getStateType() != LinkStateType.Bound) continue;
			sb.append("\t\t\tFrom: Agent("+pair.getKey().getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+")");
			sb.append(".Site("+pair.getKey().getSiteNodeContext().getSiteTypeName()+") x==["+pair.getKey().getLinkIndex()+"]==x ");
			sb.append("To: Agent("+pair.getValue().getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+")");
			sb.append(".Site("+pair.getValue().getSiteNodeContext().getSiteTypeName()+");\n");
		}
		sb.append("\n\t\t WhatEver-Links:\n");
		for(List<LinkStateContext>  lsc : linkStateContexts.values()) {
			for(LinkStateContext ls : lsc) {
				if(ls.getStateType() != LinkStateType.WhatEver) {
					continue;
				}
				sb.append("\t\t\tFrom: Agent("+ls.getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+")");
				sb.append(".Site("+ls.getSiteNodeContext().getSiteTypeName()+") <==??==> (??);\n");
			}
		}
		sb.append("\n\t\t BoundToAny-Links:\n");
		for(List<LinkStateContext>  lsc : linkStateContexts.values()) {
			for(LinkStateContext ls : lsc) {
				if(ls.getStateType() != LinkStateType.BoundAny) {
					continue;
				}
				sb.append("\t\t\tFrom: Agent("+ls.getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+")");
				sb.append(".Site("+ls.getSiteNodeContext().getSiteTypeName()+") <====> Agent(*).Site(*);\n");
			}
		}
		
		sb.append("\n\t\t Bound-Links:\n");
		for(Entry<LinkStateContext, LinkStateContext> pair : boundLinkStateContexts.values()) {
			if(pair.getKey().getStateType() != LinkStateType.Bound) continue;
			sb.append("\t\t\tFrom: Agent("+pair.getKey().getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+")");
			sb.append(".Site("+pair.getKey().getSiteNodeContext().getSiteTypeName()+") <==["+pair.getKey().getLinkIndex()+"]==> ");
			sb.append("To: Agent("+pair.getValue().getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+")");
			sb.append(".Site("+pair.getValue().getSiteNodeContext().getSiteTypeName()+");\n");
		}
		sb.append("\n\t\t BoundToAnyOfType-Links:\n");
		for(Entry<LinkStateContext, LinkStateContext> pair : boundLinkStateContexts.values()) {
			if(pair.getKey().getStateType() != LinkStateType.BoundAnyOfType) continue;
			sb.append("\t\t\tFrom: Agent("+pair.getKey().getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+")");
			sb.append(".Site("+pair.getKey().getSiteNodeContext().getSiteTypeName()+") <====> ");
			sb.append("To: Agent("+pair.getValue().getSiteNodeContext().getAgentNodeContext().getAgentVariableName()+")");
			sb.append(".Site("+pair.getValue().getSiteNodeContext().getSiteTypeName()+");\n");
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
