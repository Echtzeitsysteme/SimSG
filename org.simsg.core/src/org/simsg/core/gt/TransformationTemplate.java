package org.simsg.core.gt;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.simsg.container.Agent;
import org.simsg.container.Container;
import org.simsg.container.util.AgentClassFactory;
import org.simsg.container.util.EPackageWrapper;
import org.simsg.container.util.StateClassFactory;
import org.simsg.core.pm.match.IMatch;
import org.simsg.core.pm.pattern.GenericPattern;
import org.simsg.simsgl.simSGL.ValidAgentPattern;
import org.simsg.simsgl.simSGL.VoidAgentPattern;
import org.simsg.simsgl.simSGL.AgentPattern;
import org.simsg.simsgl.simSGL.Attribute;
import org.simsg.simsgl.simSGL.AttributeOperandGeneric;
import org.simsg.simsgl.simSGL.BoundLink;
import org.simsg.simsgl.simSGL.Comparator;
import org.simsg.simsgl.simSGL.Constraint;
import org.simsg.simsgl.simSGL.EqualComparator;
import org.simsg.simsgl.simSGL.FreeLink;
import org.simsg.simsgl.simSGL.IndexedFreeLink;
import org.simsg.simsgl.simSGL.LinkState;
import org.simsg.simsgl.simSGL.MultiLink;
import org.simsg.simsgl.simSGL.MultiLinkSitePattern;
import org.simsg.simsgl.simSGL.OperationLeft;
import org.simsg.simsgl.simSGL.SingleSitePattern;
import org.simsg.simsgl.simSGL.Site;
import org.simsg.simsgl.simSGL.SitePattern;
import org.simsg.simsgl.simSGL.State;
import org.simsg.simsgl.simSGL.TypedFreeLink;

public class TransformationTemplate {
	
	private String ruleName;
	private GenericPattern lhs;
	private GenericPattern rhs;
	private Container container;
	private EPackageWrapper metaModel;
	
	private Map<ValidAgentPattern, ValidAgentPattern> lhsToRhsMap = new LinkedHashMap<>();
	
	private List<String> agentRemovals = new LinkedList<>();
	private List<LinkDeletionTemplate> linkRemovals = new LinkedList<>();
	private List<AgentStateChangeTemplate> agentStateChanges = new LinkedList<>();
	private List<SiteStateChangeTemplate> siteStateChanges = new LinkedList<>();
	private Map<ValidAgentPattern, AgentCreationTemplate> agentCreations = new LinkedHashMap<>();
	private Map<Integer, LinkChangeTemplate> linkChanges = new LinkedHashMap<>();
	private List<AttributeChangeTemplate> attributeChanges = new LinkedList<>();
	
	private Map<ValidAgentPattern, Agent> createdAgents = new LinkedHashMap<>();
	
	public TransformationTemplate(String ruleName, GenericPattern lhs, GenericPattern rhs, Container reactionContainer, EPackageWrapper metaModel) {
		this.ruleName = ruleName;
		this.lhs = lhs;
		this.rhs = rhs;
		this.metaModel = metaModel;
		this.container = reactionContainer;
		mapLhsToRhs();
		initTemplate();
	}
	
	public String getLhsPatternName() {
		return ruleName;
	}
	
	public void applyTransformation(IMatch match) {
		applyAgentRemovalCandidates(match);
		applyLinkRemovalTemplates(match);
		applyAgentStateChangeTemplates(match);
		applySiteStateChangeTemplates(match);
		applyAgentCreationCandidates();
		applyLinkChangeCandidates(match);
		applyAttributeChangeTemplate(match);
	}
	
	private void initTemplate() {
		findAgentRemovalCandidates();
		findLinkRemovalCandidates();
		findAgentStateChangeCandidates();
		findSiteStateChangeCandidates();
		findAgentCreationCandidates();
		findLinkChangeCandidates();
		findAttributeChangeCandidates();
	}
	
	// Map Lhs to Rhs
	
	private void mapLhsToRhs() {
		List<AgentPattern> lhsAps = lhs.getRawPattern().getAgentPatterns();
		List<AgentPattern> rhsAps = rhs.getRawPattern().getAgentPatterns();
		for(int i = 0; i<lhsAps.size(); i++) {
			AgentPattern lhsAp = lhsAps.get(i);
			AgentPattern rhsAp = rhsAps.get(i);
			if(lhsAp instanceof VoidAgentPattern && !(rhsAp instanceof VoidAgentPattern)) {
				lhsToRhsMap.put((ValidAgentPattern)rhsAp, null);
			} else if(!(lhsAp instanceof VoidAgentPattern) && rhsAp instanceof VoidAgentPattern) {
				lhsToRhsMap.put((ValidAgentPattern)lhsAp, null);
			} else {
				lhsToRhsMap.put((ValidAgentPattern)lhsAp, (ValidAgentPattern)rhsAp);
				lhsToRhsMap.put((ValidAgentPattern)rhsAp, (ValidAgentPattern)lhsAp);
			}
		}
	}
	
	// Build template methods
	
	private void findAgentRemovalCandidates() {
		if(lhs.isVoidPattern()) return;
		
		if(rhs.isVoidPattern()) {
			agentRemovals.addAll(lhs.getSignature().getSignature().keySet());
		}else {
			for(String lhsLabel : lhs.getSignature().getSignature().keySet()) {
				ValidAgentPattern lhsVap = lhs.getSignature().getSignaturePattern(lhsLabel);
				if(lhsToRhsMap.get(lhsVap) == null) {
					agentRemovals.add(lhsLabel);
				}
			}
		}
	}
	
	private void findLinkRemovalCandidates() {
		if(lhs.isVoidPattern()) return;
		
		if(rhs.isVoidPattern()) return;
		
		for(String rhsLabel : rhs.getSignature().getSignature().keySet()) {
			ValidAgentPattern rhsVap = rhs.getSignature().getSignaturePattern(rhsLabel);
			if(lhsToRhsMap.get(rhsVap) == null) continue;
			for(int j = 0; j<rhsVap.getSitePatterns().getSitePatterns().size(); j++) {
				SitePattern sp = rhsVap.getSitePatterns().getSitePatterns().get(j);
				if(sp instanceof SingleSitePattern) {
					singleLinkRemoval(rhsVap, rhsLabel, (SingleSitePattern) sp);
				}else {
					multiLinkRemoval(rhsVap, rhsLabel, (MultiLinkSitePattern) sp);
				}
				
			}
			
		}
		
	}
	
	private void findAgentStateChangeCandidates() {
		if(lhs.isVoidPattern()) return;
		
		if(rhs.isVoidPattern()) return;
		
		for(String rhsLabel : rhs.getSignature().getSignature().keySet()) {
			ValidAgentPattern rhsVap = rhs.getSignature().getSignaturePattern(rhsLabel);
			if(lhsToRhsMap.get(rhsVap) == null) continue;
			
			State state_trg = null;
			State state_src = null;
			
			if(rhsVap.getState() != null) {
				state_trg = rhsVap.getState().getState();
				ValidAgentPattern vap_src = lhsToRhsMap.get(rhsVap);
				state_src = vap_src.getState().getState();
				// if both states are equal -> do nothing
				if(state_trg == state_src) continue;
			}else {
				// if there is no state -> do nothing
				continue;
			}
			
			String oldRefName = StateClassFactory.createReferenceName(rhsVap.getAgent(), state_src);
			String newRefName = StateClassFactory.createReferenceName(rhsVap.getAgent(), state_trg);
			AgentStateChangeTemplate stTemplate = new AgentStateChangeTemplate(rhsLabel, metaModel.getEReference(oldRefName), 
					metaModel.getEReference(newRefName), findStateInstance(state_trg));
			
			agentStateChanges.add(stTemplate);
		}
		
	}
	
	private void findSiteStateChangeCandidates() {
		if(lhs.isVoidPattern()) return;
		
		if(rhs.isVoidPattern()) return;
		
		for(String rhsLabel : rhs.getSignature().getSignature().keySet()) {
			ValidAgentPattern rhsVap = rhs.getSignature().getSignaturePattern(rhsLabel);
			if(lhsToRhsMap.get(rhsVap) == null) continue;
			
			SiteStateChangeTemplate stTemplate = new SiteStateChangeTemplate(rhsLabel);
			
			for(int j = 0; j<rhsVap.getSitePatterns().getSitePatterns().size(); j++) {
				SitePattern superSp_trg = rhsVap.getSitePatterns().getSitePatterns().get(j);
				
				Site trg_site = null;
				if(superSp_trg instanceof SingleSitePattern) {
					trg_site = ((SingleSitePattern)superSp_trg).getSite();
				}else {
					trg_site = ((MultiLinkSitePattern)superSp_trg).getSite();
				}
				// if the site has a site state -> state
				State state_trg = null;
				State state_src = null;
				if(superSp_trg.getState() != null) {
					state_trg = superSp_trg.getState().getState();
					state_src = findLhsState(rhsVap, superSp_trg);
					// if both states are equal -> do nothing
					if(state_trg == state_src) continue;
				}else {
					// if there is no state -> do nothing
					continue;
				}
				String oldRefName = StateClassFactory.createReferenceName(rhsVap.getAgent(), trg_site, state_src);
				String newRefName = StateClassFactory.createReferenceName(rhsVap.getAgent(), trg_site, state_trg);
				stTemplate.addStateChangeCandidate(metaModel.getEReference(oldRefName), metaModel.getEReference(newRefName), findStateInstance(state_trg));
			}
			
			if(!stTemplate.isEmpty()) {
				siteStateChanges.add(stTemplate);
			}
		}
		
	}
	
	private void findAgentCreationCandidates() {
		
		if(rhs.isVoidPattern()) return;
		
		for(String rhsLabel : rhs.getSignature().getSignature().keySet()) {
			ValidAgentPattern rhsVap = rhs.getSignature().getSignaturePattern(rhsLabel);
			// if the source pattern defines a void instead of an agent pattern -> create new agent according to target pattern
			if(lhsToRhsMap.get(rhsVap) != null) continue;
			
			// generate agent template
			AgentCreationTemplate agntTemplate = new AgentCreationTemplate(rhsVap);
			
			// set agent state
			if(rhsVap.getState() != null) {
				State state_trg = rhsVap.getState().getState();
				String newRefName = StateClassFactory.createReferenceName(rhsVap.getAgent(), state_trg);
				agntTemplate.setAgentState(metaModel.getEReference(newRefName), findStateInstance(state_trg));
			}
			
			// set all default site states
			for(Site site : rhsVap.getAgent().getSites().getSites()) {
				// if a site has no state continue
				if(site.getStates().getState().size() <= 0) continue;
				State state = site.getStates().getState().get(0);
				String stateRefName = StateClassFactory.createReferenceName(rhsVap.getAgent(), site, state);
				agntTemplate.addSiteState(site, metaModel.getEReference(stateRefName), findStateInstance(state));
			}
			for(SitePattern sp : rhsVap.getSitePatterns().getSitePatterns()) {
				Site site = null;
				if(sp instanceof SingleSitePattern) {
					site = ((SingleSitePattern)sp).getSite();
				}else {
					site = ((MultiLinkSitePattern)sp).getSite();
				}
				// define a state if the pattern has a state
				if(sp.getState() != null) {
					String stateRefName = StateClassFactory.createReferenceName(rhsVap.getAgent(), site, sp.getState().getState());
					agntTemplate.addSiteState(site, metaModel.getEReference(stateRefName), findStateInstance(sp.getState().getState()));
				}else {
					if(site.getStates().getState().size() > 0) {
						State state = site.getStates().getState().get(0);
						String stateRefName = StateClassFactory.createReferenceName(rhsVap.getAgent(), site, state);
						agntTemplate.addSiteState(site, metaModel.getEReference(stateRefName), findStateInstance(state));
					}
				}
				// create a link change template if the pattern defines an indexed link
				if(sp instanceof SingleSitePattern) {
					SingleSitePattern ssp = (SingleSitePattern) sp;
					if(ssp.getLinkState().getLinkState() instanceof BoundLink) {
						buildLinkChangeTemplate(rhsVap, rhsLabel, sp, (BoundLink)ssp.getLinkState().getLinkState(), true);
					}
				}else {
					MultiLinkSitePattern msp = (MultiLinkSitePattern) sp;
					if(msp.getLinkState().getLinkState() instanceof BoundLink) {
						buildLinkChangeTemplate(rhsVap, rhsLabel, sp, (BoundLink)msp.getLinkState().getLinkState(), true);
					}else if(msp.getLinkState().getLinkState() instanceof MultiLink) {
						MultiLink ml = (MultiLink) msp.getLinkState().getLinkState();
						for(LinkState mls : ml.getStates()) {
							if(mls instanceof BoundLink) {
								buildLinkChangeTemplate(rhsVap, rhsLabel, sp, (BoundLink)mls, true);
							}
						}
					}
				}
				
			}
			agentCreations.put(rhsVap, agntTemplate);
			createdAgents.put(rhsVap, null);
		}
			
		
	}
	
	private void findLinkChangeCandidates() {
		if(lhs.isVoidPattern()) return;
		
		if(rhs.isVoidPattern()) return;
		
		for(String rhsLabel : rhs.getSignature().getSignature().keySet()) {
			ValidAgentPattern rhsVap = rhs.getSignature().getSignaturePattern(rhsLabel);
			
			for(int j = 0; j<rhsVap.getSitePatterns().getSitePatterns().size(); j++) {
				SitePattern sp = rhsVap.getSitePatterns().getSitePatterns().get(j);

				Site site = null;
				LinkState ls = null;
				if(sp instanceof SingleSitePattern) {
					SingleSitePattern ssp = (SingleSitePattern)sp;
					site = ssp.getSite();
					ls = ssp.getLinkState().getLinkState();
				}else {
					MultiLinkSitePattern msp = (MultiLinkSitePattern)sp;
					site = msp.getSite();
					ls = msp.getLinkState().getLinkState();
				}
				
				if(ls == null) continue;
				
				List<BoundLink> bLinks = new LinkedList<BoundLink>();
				if(ls instanceof BoundLink) {
					bLinks.add((BoundLink) ls);
				}else if(ls instanceof MultiLink) {
					MultiLink ml = (MultiLink) ls;
					for(LinkState mls : ml.getStates()) {
						if(mls instanceof BoundLink) {
							bLinks.add((BoundLink)mls);
						}
					}
				}else {
					continue;
				}
				
				for(BoundLink bl : bLinks) {
					// find other side and link!
					Entry<String, Site> indexAndSite = findCorrespondingSiteOnRHS(sp, bl);
					Site otherSite = indexAndSite.getValue();
					String otherLabel = indexAndSite.getKey();
					ValidAgentPattern otherNode = rhs.getSignature().getSignaturePattern(otherLabel);
					
					// continue if this node is void -> this was handled in the agent creation method
					if(lhsToRhsMap.get(rhsVap) == null) continue;
						
					ValidAgentPattern apLhs = lhsToRhsMap.get(rhsVap);
					// continue if other node is void -> this was handled in the agent creation method
					if(lhsToRhsMap.get(otherNode) == null) continue;
					
					// find corresponding nodes on lhs and check if something changed
					ValidAgentPattern otherApLhs = lhsToRhsMap.get(otherNode);
					SitePattern spLhs = findSitePatternInAgentPattern(apLhs, site);
					SitePattern otherSpLhs = findSitePatternInAgentPattern(otherApLhs, otherSite);
					// if nothing changed -> continue
					if(sitePatternsLinked(spLhs, otherSpLhs)) continue;
					buildLinkChangeTemplate(rhsVap, rhsLabel, sp, bl, false);
					
				}
				
			}
		}
	}
	
	private void findAttributeChangeCandidates() {
		
		if(rhs.isVoidPattern()) return;
		
		if(rhs.getRawPattern().getConstraints() == null) return;
		
		for(Constraint constraint : rhs.getRawPattern().getConstraints()) {
			OperationLeft lOp = (OperationLeft) constraint.getOperandL();
			Comparator compare = constraint.getComparator();
			
			if(!(lOp.getLeft() instanceof AttributeOperandGeneric)) continue;
			if(!(compare instanceof EqualComparator)) continue;
			
			AttributeOperandGeneric operandL = (AttributeOperandGeneric)lOp.getLeft();
			ValidAgentPattern rhsVap = (ValidAgentPattern) operandL.getAgent().eContainer();
			Attribute atr = operandL.getAttribute().getAttribute();
			String attributeName = AgentClassFactory.createAttributeName(rhsVap.getAgent(),  atr);
			EAttribute attribute = metaModel.getEAttribute(attributeName);
			ValidAgentPattern lhsVap = lhsToRhsMap.get(rhsVap);
			String lhsLabel = lhs.getSignature().getSignatureNode(lhsVap);
			AttributeChangeTemplate template = 
					new AttributeChangeTemplate(lhsLabel, attribute, 
							rhs.getSignature().getPatternSignatureMapping(), metaModel);
			template.setOperation(constraint.getOperandR());
			attributeChanges.add(template);
			
		}
	}
	
	// apply template methods

	private void applyAgentRemovalCandidates(IMatch match) {
		Collection<Agent> agents = new LinkedList<Agent>();
		
		for(String label : agentRemovals) {
			// add agent to deletion list
			agents.add((Agent)match.get(label));
		}
		// delete all agents in list
		org.eclipse.emf.ecore.util.EcoreUtil.deleteAll(agents, false);
	}
	
	private void applyLinkRemovalTemplates(IMatch match) {
		for(LinkDeletionTemplate template : linkRemovals) {
			// link removal sets the reference's target to null
			template.applyRemovalCandidates(match);
		}
	}
	
	private void applyAgentStateChangeTemplates(IMatch match) {
		for(AgentStateChangeTemplate template : agentStateChanges) {
			// changes the state reference's target accordingly
			template.applyStateChangeCandidate(match);
		}
	}
	
	private void applySiteStateChangeTemplates(IMatch match) {
		for(SiteStateChangeTemplate template : siteStateChanges) {
			// changes the state reference's target accordingly
			template.applyStateChangeCandidates(match);
		}
	}
	
	private void applyAgentCreationCandidates() {
		if(agentCreations.size() == 0)
			return;
		
		for(Entry<ValidAgentPattern, AgentCreationTemplate> template : agentCreations.entrySet()) {
			// create new agent and store for linkage
			Agent agent = template.getValue().createAgentFromTemplate(metaModel.getAgentFactory(), container);
			createdAgents.replace(template.getKey(), agent);
		}
	}
	
	private void applyLinkChangeCandidates(IMatch match) {
		if(linkChanges.size() == 0)
			return;
		
		for(LinkChangeTemplate template : linkChanges.values()) {
			template.applyLinkChange(match, createdAgents);
		}
	}
	
	private void applyAttributeChangeTemplate(IMatch match) {
		for(AttributeChangeTemplate template : attributeChanges) {
			template.applyAttributeChange(match);
		}
	}
	
	// Helper methods begin here:
	
	private void singleLinkRemoval(ValidAgentPattern rhsVap, String rhsLabel, SingleSitePattern ssp) {
		LinkState ls = ssp.getLinkState().getLinkState();
		if(ls instanceof FreeLink) {
			buildSingleRemoveTemplate(rhsVap.getAgent(), rhsLabel, ssp.getSite());
		}else if(ls instanceof IndexedFreeLink) {
			int linkIndex = Integer.valueOf(((IndexedFreeLink)ls).getState());
			buildMultiRemoveTemplate(rhsVap.getAgent(), rhsLabel, ssp.getSite(), findOtherRemoveLabel(rhsVap, linkIndex));
		}else if (ls instanceof TypedFreeLink) {
			TypedFreeLink tfl = (TypedFreeLink)ls;
			buildTypeRemoveTemplate(rhsVap.getAgent(), rhsLabel, ssp.getSite(), metaModel.getClass(tfl.getState().getName()));
		}
	}
	
	private void multiLinkRemoval(ValidAgentPattern vap, String nodeLabel, MultiLinkSitePattern msp) {
		LinkState ls = msp.getLinkState().getLinkState();
		if(ls instanceof FreeLink) {
			buildMultiRemoveTemplate(vap.getAgent(), nodeLabel, msp.getSite(), LinkDeletionTemplate.REMOVE_ALL);
		}else if(ls instanceof IndexedFreeLink) {
			int linkIndex = Integer.valueOf(((IndexedFreeLink)ls).getState());
			buildMultiRemoveTemplate(vap.getAgent(), nodeLabel, msp.getSite(), findOtherRemoveLabel(vap, linkIndex));
		}else if(ls instanceof TypedFreeLink) {
			TypedFreeLink tfl = (TypedFreeLink)ls;
			buildTypeRemoveTemplate(vap.getAgent(), nodeLabel, msp.getSite(), metaModel.getClass(tfl.getState().getName()));
		}else if(ls instanceof MultiLink) {
			MultiLink ml = (MultiLink)ls;
			for(LinkState mls : ml.getStates()) {
				if(mls instanceof IndexedFreeLink) {
					int linkIndex = Integer.valueOf(((IndexedFreeLink)mls).getState());
					buildMultiRemoveTemplate(vap.getAgent(), nodeLabel, msp.getSite(), findOtherRemoveLabel(vap, linkIndex));
				}else if(mls instanceof TypedFreeLink) {
					TypedFreeLink tfl = (TypedFreeLink)mls;
					buildTypeRemoveTemplate(vap.getAgent(), nodeLabel, msp.getSite(), metaModel.getClass(tfl.getState().getName()));
				}
			}
		}
	}
	
	private void buildSingleRemoveTemplate(org.simsg.simsgl.simSGL.Agent agent, String nodeLabel, Site site) {
		String refName = AgentClassFactory.createReferenceName(agent, site);
		LinkDeletionTemplate linkRemoveTemplate = new LinkDeletionTemplate(nodeLabel);
		linkRemoveTemplate.addLinkRemovalCandidate(metaModel.getEReference(refName));
		linkRemovals.add(linkRemoveTemplate);
	}
	
	private void buildMultiRemoveTemplate(org.simsg.simsgl.simSGL.Agent agent, String nodeLabel, Site site, String otherNodeLabel) {
		String refName = AgentClassFactory.createReferenceName(agent, site);
		LinkDeletionTemplate linkRemoveTemplate = new LinkDeletionTemplate(nodeLabel);
		linkRemoveTemplate.addLinkRemovalCandidate(metaModel.getEReference(refName), otherNodeLabel);
		linkRemovals.add(linkRemoveTemplate);
	}
	
	private void buildTypeRemoveTemplate(org.simsg.simsgl.simSGL.Agent agent, String nodeLabel, Site site, EClass type) {
		String refName = AgentClassFactory.createReferenceName(agent, site);
		LinkDeletionTemplate linkRemoveTemplate = new LinkDeletionTemplate(nodeLabel);
		linkRemoveTemplate.addLinkRemovalType(metaModel.getEReference(refName), type);
		linkRemovals.add(linkRemoveTemplate);
	}
	
	private String findOtherRemoveLabel(ValidAgentPattern rhsVap, int linkIndex) {
		for(ValidAgentPattern otherVap : rhs.getBody().getAgentPatterns()) {
			if(otherVap == rhsVap) continue;
			
			for(SitePattern sp : otherVap.getSitePatterns().getSitePatterns()) {
				if(sp == null) continue;
				
				if(sp instanceof SingleSitePattern) {
					SingleSitePattern ssp = (SingleSitePattern) sp;
					LinkState ls = ssp.getLinkState().getLinkState();
					if(ls == null) continue;
					if(!(ls instanceof IndexedFreeLink)) continue;
					
					IndexedFreeLink ifl = (IndexedFreeLink) ls;
					int idx2 = Integer.valueOf(ifl.getState());
					if(linkIndex == idx2) {
						return rhs.getSignature().getSignatureNode(otherVap);
					}
				}else {
					MultiLinkSitePattern ssp = (MultiLinkSitePattern) sp;
					LinkState ls = ssp.getLinkState().getLinkState();
					if(ls == null) continue;
					if(ls instanceof IndexedFreeLink) {
						IndexedFreeLink ifl = (IndexedFreeLink) ls;
						int idx2 = Integer.valueOf(ifl.getState());
						if(linkIndex == idx2) {
							return rhs.getSignature().getSignatureNode(otherVap);
						}
					}else if(ls instanceof MultiLink) {
						MultiLink ml = (MultiLink)ls;
						for(LinkState mls : ml.getStates()) {
							if(!(mls instanceof IndexedFreeLink)) continue;
							IndexedFreeLink ifl = (IndexedFreeLink) mls;
							int idx2 = Integer.valueOf(ifl.getState());
							if(linkIndex == idx2) {
								return rhs.getSignature().getSignatureNode(otherVap);
							}
						}
					}
				}
				
			}
		}
		
		return null;
	}
	
	// Helper method -> Find the corresponding state of an rhs-pattern on the lhs 
	private State findLhsState(ValidAgentPattern rhsVap, SitePattern rhsSitePattern) {
		State lhsState = null;
		ValidAgentPattern lhsAP = lhsToRhsMap.get(rhsVap);
		Site rhsSite = null;
		if(rhsSitePattern instanceof SingleSitePattern) {
			rhsSite = ((SingleSitePattern)rhsSitePattern).getSite();
		} else {
			rhsSite = ((MultiLinkSitePattern)rhsSitePattern).getSite();
		}
		for(SitePattern lhsSitePattern : lhsAP.getSitePatterns().getSitePatterns()) {
			Site lhsSite = null;
			if(lhsSitePattern instanceof SingleSitePattern) {
				lhsSite = ((SingleSitePattern)lhsSitePattern).getSite();
			}else {
				lhsSite = ((MultiLinkSitePattern)lhsSitePattern).getSite();
			}
			
			if(rhsSite.getName().equals(lhsSite.getName())) {
				lhsState = lhsSitePattern.getState().getState();
				break;
			}
		}
		return lhsState;
	}
		
	// Helper method -> Find the corresponding stateInstance to a state described in a pattern 
	private org.simsg.container.State findStateInstance(State state) {
		org.simsg.container.State stateInstance = null;
		for(org.simsg.container.State currentStateInstance : container.getStates()) {
			if(currentStateInstance.eClass().getName().equals(state.getName())) {
				stateInstance = currentStateInstance;
				break;
			}
		}
		return stateInstance;
	}
	
	private LinkChangeTemplate buildLinkChangeTemplate(ValidAgentPattern vap, String nodeLabel, SitePattern sp, BoundLink bl, boolean agentNotInMatch) {
		Site site = null;
		if(sp instanceof SingleSitePattern) {
			site = ((SingleSitePattern)sp).getSite();
		}else {
			site = ((MultiLinkSitePattern)sp).getSite();
		}
		
		int linkIdx = Integer.valueOf(bl.getState());
		if(linkChanges.containsKey(linkIdx) && agentNotInMatch){
			linkChanges.get(linkIdx).setAgentNotInMatch(vap);
			return linkChanges.get(linkIdx);
		}
		
		Entry<String, Site> indexAndSite = findCorrespondingSiteOnRHS(sp, bl);
		Site otherSite = indexAndSite.getValue();
		String otherLabel = indexAndSite.getKey();
		org.simsg.simsgl.simSGL.Agent otherAgent = rhs.getSignature().getSignaturePattern(otherLabel).getAgent();
		String srcRefName = AgentClassFactory.createReferenceName(vap.getAgent(), site);
		String trgRefName = AgentClassFactory.createReferenceName(otherAgent, otherSite);
		LinkChangeTemplate lct = new LinkChangeTemplate();
		lct.setSrc(vap, nodeLabel, metaModel.getEReference(srcRefName));
		lct.setTrg(rhs.getSignature().getSignaturePattern(otherLabel), otherLabel, metaModel.getEReference(trgRefName));
		if(agentNotInMatch) {
			lct.setAgentNotInMatch(vap);
		}
		linkChanges.putIfAbsent(linkIdx, lct);
		return lct;
	}
	
	private Entry<String, Site> findCorrespondingSiteOnRHS(SitePattern sitePattern, BoundLink link) {
		int idx = Integer.valueOf(link.getState());
		
		for(String rhsLabel : rhs.getSignature().getSignature().keySet()) {
			ValidAgentPattern vap = rhs.getSignature().getSignaturePattern(rhsLabel);
			for(SitePattern sp : vap.getSitePatterns().getSitePatterns()) {
				if(sp == null) continue;
				if(sp == sitePattern) continue;
				
				if(sp instanceof SingleSitePattern) {
					SingleSitePattern ssp = (SingleSitePattern) sp;
					
					LinkState ls = ssp.getLinkState().getLinkState();
					if(ls == null) continue;
					if(!(ls instanceof BoundLink)) continue;
					
					BoundLink bl = (BoundLink) ls;
					int idx2 = Integer.valueOf(bl.getState());
					if(idx == idx2) {
						return new AbstractMap.SimpleEntry<String, Site>(rhsLabel, ssp.getSite());
					}
				}else {
					MultiLinkSitePattern msp = (MultiLinkSitePattern) sp;
					
					LinkState mls = msp.getLinkState().getLinkState();
					if(mls == null) continue;
					
					if(mls instanceof BoundLink) {
						BoundLink bl = (BoundLink) mls;
						int idx2 = Integer.valueOf(bl.getState());
						if(idx == idx2) {
							return new AbstractMap.SimpleEntry<String, Site>(rhsLabel, msp.getSite());
						}
					}else if(mls instanceof MultiLink) {
						MultiLink ml = (MultiLink)mls;
						for(LinkState ls2 : ml.getStates()) {
							if(!(ls2 instanceof BoundLink)) continue;
							
							BoundLink bl = (BoundLink) ls2;
							int idx2 = Integer.valueOf(bl.getState());
							if(idx == idx2) {
								return new AbstractMap.SimpleEntry<String, Site>(rhsLabel, msp.getSite());
							}
						}
					}
				}
				
				
			}
		}
		return new AbstractMap.SimpleEntry<String, Site>(null, null);
	}
	
	private boolean sitePatternsLinked(SitePattern sp1, SitePattern sp2) {
		if(sp1 instanceof SingleSitePattern && sp2 instanceof SingleSitePattern) {
			LinkState ls1 = ((SingleSitePattern)sp1).getLinkState().getLinkState();
			LinkState ls2 = ((SingleSitePattern)sp2).getLinkState().getLinkState();
			return boundLinksEqual(ls1, ls2);
			
		}else if(sp1 instanceof MultiLinkSitePattern && sp2 instanceof SingleSitePattern) {
			LinkState ls1 = ((MultiLinkSitePattern)sp1).getLinkState().getLinkState();
			LinkState ls2 = ((SingleSitePattern)sp2).getLinkState().getLinkState();
			if(ls1 == null) return false;
			
			if(ls1 instanceof BoundLink) {
				return boundLinksEqual(ls1, ls2);
			}else if(ls1 instanceof MultiLink) {
				MultiLink ml = (MultiLink) ls1;
				for(LinkState mls : ml.getStates()) {
					if(boundLinksEqual(ls2, mls)) return true;
				}
				return false;
			}else {
				return false;
			}
		}else if(sp1 instanceof SingleSitePattern && sp2 instanceof MultiLinkSitePattern) {
			LinkState ls1 = ((SingleSitePattern)sp1).getLinkState().getLinkState();
			LinkState ls2 = ((MultiLinkSitePattern)sp2).getLinkState().getLinkState();
			if(ls2 == null) return false;
			
			if(ls2 instanceof BoundLink) {
				return boundLinksEqual(ls1, ls2);
			}else if(ls2 instanceof MultiLink) {
				MultiLink ml = (MultiLink) ls2;
				for(LinkState mls : ml.getStates()) {
					if(boundLinksEqual(ls1, mls)) return true;
				}
				return false;
			}else {
				return false;
			}
		}else if(sp1 instanceof MultiLinkSitePattern && sp2 instanceof MultiLinkSitePattern){
			LinkState ls1 = ((MultiLinkSitePattern)sp1).getLinkState().getLinkState();
			LinkState ls2 = ((MultiLinkSitePattern)sp2).getLinkState().getLinkState();
			if(ls1 == null) return false;
			if(ls2 == null) return false;
			
			if(ls1 instanceof BoundLink && ls2 instanceof BoundLink) {
				return boundLinksEqual(ls1, ls2);
			}else if(ls1 instanceof BoundLink && ls2 instanceof MultiLink) {
				MultiLink ml = (MultiLink) ls2;
				for(LinkState mls : ml.getStates()) {
					if(boundLinksEqual(ls1, mls)) return true;
				}
				return false;
			}else if(ls1 instanceof MultiLink && ls2 instanceof BoundLink) {
				MultiLink ml = (MultiLink) ls1;
				for(LinkState mls : ml.getStates()) {
					if(boundLinksEqual(ls2, mls)) return true;
				}
				return false;
			}else if(ls1 instanceof MultiLink && ls2 instanceof MultiLink) {
				MultiLink ml1 = (MultiLink) ls1;
				MultiLink ml2 = (MultiLink) ls2;
				for(LinkState mls1 : ml1.getStates()) {
					for(LinkState mls2 : ml2.getStates()) {
						if(boundLinksEqual(mls1, mls2)) return true;
					}
				}
				return false;
			}else return false;
		}else return false;
	}
	
	private boolean boundLinksEqual(LinkState link1, LinkState link2) {
		if(link1 == null) return false;
		if(link2 == null) return false;
		if(!(link1 instanceof BoundLink)) return false;
		if(!(link2 instanceof BoundLink)) return false;
		BoundLink blLhs = (BoundLink)link1;
		BoundLink otherBlLhs = (BoundLink)link2;
		int idxLhs = Integer.valueOf(blLhs.getState());
		int otherIdxLhs = Integer.valueOf(otherBlLhs.getState());
		// if both indexes are equal both nodes are already connected -> nothing to do
		if(idxLhs == otherIdxLhs) {
			return true;
		}else {
			return false;
		}
		
	}
	
	private SitePattern findSitePatternInAgentPattern(ValidAgentPattern ap, Site site) {
		for(SitePattern sp: ap.getSitePatterns().getSitePatterns()) {
			// ignore multi-link site patterns for now
			Site otherSite = null;
			if(sp instanceof SingleSitePattern) {
				otherSite = ((SingleSitePattern)sp).getSite();
			}else {
				otherSite = ((MultiLinkSitePattern)sp).getSite();
			}
			if(otherSite == site) {
				return sp; 
			}
		}
		return null;
	}
	
	// Helper methods end here.
}