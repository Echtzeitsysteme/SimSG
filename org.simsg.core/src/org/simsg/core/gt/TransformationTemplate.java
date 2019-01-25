package org.simsg.core.gt;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
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
import org.simsg.simsgl.simSGL.Pattern;
import org.simsg.simsgl.simSGL.SingleSitePattern;
import org.simsg.simsgl.simSGL.Site;
import org.simsg.simsgl.simSGL.SitePattern;
import org.simsg.simsgl.simSGL.State;
import org.simsg.simsgl.simSGL.TypedFreeLink;

public class TransformationTemplate {
	
	private String lhsName;
	private Pattern precondition;
	private Pattern postcondition;
	private Container reactionContainer;
	private EPackageWrapper metaModel;
	
	private List<Integer> agentRemovals;
	private List<LinkDeletionTemplate> linkRemovals;
	private List<AgentStateChangeTemplate> agentStateChanges;
	private List<SiteStateChangeTemplate> siteStateChanges;
	private Map<ValidAgentPattern, AgentCreationTemplate> agentCreations;
	private Map<Integer, LinkChangeTemplate> linkChanges;
	private List<AttributeChangeTemplate> attributeChanges;
	
	private Map<ValidAgentPattern, Agent> createdAgents;
	
	public TransformationTemplate(String lhsName, Pattern precondition, Pattern postcondition, Container reactionContainer, EPackageWrapper metaModel) {
		this.lhsName = lhsName;
		this.precondition = precondition;
		this.postcondition = postcondition;
		this.metaModel = metaModel;
		this.reactionContainer = reactionContainer;
		initTemplate();
	}
	
	public String getLhsPatternName() {
		return lhsName;
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
	
	// Build template methods
	
	private void findAgentRemovalCandidates() {
		agentRemovals = new LinkedList<Integer>();
		for(int i = 0; i<postcondition.getAgentPatterns().size(); i++) {
			// if the target pattern defines a void instead of an agent pattern -> delete agent
			if(postcondition.getAgentPatterns().get(i) instanceof VoidAgentPattern) {
				agentRemovals.add(i);
			}
		}
	}
	
	private void findLinkRemovalCandidates() {
		linkRemovals = new LinkedList<LinkDeletionTemplate>();
		
		for(int i = 0; i<postcondition.getAgentPatterns().size(); i++) {
			if(postcondition.getAgentPatterns().get(i) instanceof ValidAgentPattern && 
					precondition.getAgentPatterns().get(i) instanceof ValidAgentPattern) {
				ValidAgentPattern ap = (ValidAgentPattern)postcondition.getAgentPatterns().get(i);
				for(int j = 0; j<ap.getSitePatterns().getSitePatterns().size(); j++) {
					SitePattern superSp = ap.getSitePatterns().getSitePatterns().get(j);

					if(superSp instanceof SingleSitePattern) {
						singleLinkRemoval(ap, i, (SingleSitePattern) superSp);
					}else {
						multiLinkRemoval(ap, i, (MultiLinkSitePattern) superSp);
					}
					
				}
			}
		}
	}
	
	private void findAgentStateChangeCandidates() {
		agentStateChanges = new LinkedList<AgentStateChangeTemplate>();
		for(int i = 0; i<postcondition.getAgentPatterns().size(); i++) {
			if(postcondition.getAgentPatterns().get(i) instanceof ValidAgentPattern && 
					precondition.getAgentPatterns().get(i) instanceof ValidAgentPattern) {
				ValidAgentPattern ap_trg = (ValidAgentPattern)postcondition.getAgentPatterns().get(i);
				
				
				State state_trg = null;
				State state_src = null;
				
				if(ap_trg.getState() != null) {
					state_trg = ap_trg.getState().getState();
					ValidAgentPattern vap_src = (ValidAgentPattern)precondition.getAgentPatterns().get(i);
					state_src = vap_src.getState().getState();
					// if both states are equal -> do nothing
					if(state_trg == state_src) continue;
				}else {
					// if there is no state -> do nothing
					continue;
				}
				
				String oldRefName = StateClassFactory.createReferenceName(ap_trg.getAgent(), state_src);
				String newRefName = StateClassFactory.createReferenceName(ap_trg.getAgent(), state_trg);
				AgentStateChangeTemplate stTemplate = new AgentStateChangeTemplate(i, metaModel.getEReference(oldRefName), 
						metaModel.getEReference(newRefName), findStateInstance(state_trg));
				
				agentStateChanges.add(stTemplate);
			}
			
		}
	}
	
	
	
	private void findSiteStateChangeCandidates() {
		siteStateChanges = new LinkedList<SiteStateChangeTemplate>();
		for(int i = 0; i<postcondition.getAgentPatterns().size(); i++) {
			if(postcondition.getAgentPatterns().get(i) instanceof ValidAgentPattern && 
					precondition.getAgentPatterns().get(i) instanceof ValidAgentPattern) {
				ValidAgentPattern ap_trg = (ValidAgentPattern)postcondition.getAgentPatterns().get(i);
				SiteStateChangeTemplate stTemplate = new SiteStateChangeTemplate(i);
				
				for(int j = 0; j<ap_trg.getSitePatterns().getSitePatterns().size(); j++) {
					SitePattern superSp_trg = ap_trg.getSitePatterns().getSitePatterns().get(j);
					
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
						state_src = findLhsState(i, superSp_trg);
						// if both states are equal -> do nothing
						if(state_trg == state_src) continue;
					}else {
						// if there is no state -> do nothing
						continue;
					}
					String oldRefName = StateClassFactory.createReferenceName(ap_trg.getAgent(), trg_site, state_src);
					String newRefName = StateClassFactory.createReferenceName(ap_trg.getAgent(), trg_site, state_trg);
					stTemplate.addStateChangeCandidate(metaModel.getEReference(oldRefName), metaModel.getEReference(newRefName), findStateInstance(state_trg));
				}
				
				if(!stTemplate.isEmpty()) {
					siteStateChanges.add(stTemplate);
				}
			}
			
		}
	}
	
	private void findAgentCreationCandidates() {
		linkChanges = new HashMap<Integer, LinkChangeTemplate>();
		agentCreations = new HashMap<ValidAgentPattern, AgentCreationTemplate>();
		createdAgents = new HashMap<ValidAgentPattern, Agent>();
		
		for(int i = 0; i<precondition.getAgentPatterns().size(); i++) {
			// if the source pattern defines a void instead of an agent pattern -> create new agent according to target pattern
			if(precondition.getAgentPatterns().get(i) instanceof VoidAgentPattern) {
				// generate agent template
				ValidAgentPattern ap = (ValidAgentPattern)postcondition.getAgentPatterns().get(i);
				AgentCreationTemplate agntTemplate = new AgentCreationTemplate(ap);
				// set all default site states
				for(Site site : ap.getAgent().getSites().getSites()) {
					// if a site has no state continue
					if(site.getStates().getState().size() <= 0) continue;
					State state = site.getStates().getState().get(0);
					String stateRefName = StateClassFactory.createReferenceName(ap.getAgent(), site, state);
					agntTemplate.addSiteState(site, metaModel.getEReference(stateRefName), findStateInstance(state));
				}
				for(SitePattern sp : ap.getSitePatterns().getSitePatterns()) {
					Site site = null;
					if(sp instanceof SingleSitePattern) {
						site = ((SingleSitePattern)sp).getSite();
					}else {
						site = ((MultiLinkSitePattern)sp).getSite();
					}
					// define a state if the pattern has a state
					if(sp.getState() != null) {
						String stateRefName = StateClassFactory.createReferenceName(ap.getAgent(), site, sp.getState().getState());
						agntTemplate.addSiteState(site, metaModel.getEReference(stateRefName), findStateInstance(sp.getState().getState()));
					}else {
						if(site.getStates().getState().size() > 0) {
							State state = site.getStates().getState().get(0);
							String stateRefName = StateClassFactory.createReferenceName(ap.getAgent(), site, state);
							agntTemplate.addSiteState(site, metaModel.getEReference(stateRefName), findStateInstance(state));
						}
					}
					// create a link change template if the pattern defines an indexed link
					if(sp instanceof SingleSitePattern) {
						SingleSitePattern ssp = (SingleSitePattern) sp;
						if(ssp.getLinkState().getLinkState() instanceof BoundLink) {
							buildLinkChangeTemplate(ap, i, sp, (BoundLink)ssp.getLinkState().getLinkState(), true);
						}
					}else {
						MultiLinkSitePattern msp = (MultiLinkSitePattern) sp;
						if(msp.getLinkState().getLinkState() instanceof BoundLink) {
							buildLinkChangeTemplate(ap, i, sp, (BoundLink)msp.getLinkState().getLinkState(), true);
						}else if(msp.getLinkState().getLinkState() instanceof MultiLink) {
							MultiLink ml = (MultiLink) msp.getLinkState().getLinkState();
							for(LinkState mls : ml.getStates()) {
								if(mls instanceof BoundLink) {
									buildLinkChangeTemplate(ap, i, sp, (BoundLink)mls, true);
								}
							}
						}
					}
					
				}
				agentCreations.put(ap, agntTemplate);
				createdAgents.put(ap, null);
			}
		}
	}
	
	private void findLinkChangeCandidates() {
		for(int i = 0; i<postcondition.getAgentPatterns().size(); i++) {
			if(!(postcondition.getAgentPatterns().get(i) instanceof ValidAgentPattern)) {
				continue;
			}
			ValidAgentPattern ap = (ValidAgentPattern)postcondition.getAgentPatterns().get(i);
			for(int j = 0; j<ap.getSitePatterns().getSitePatterns().size(); j++) {
				SitePattern sp = ap.getSitePatterns().getSitePatterns().get(j);

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
					Entry<Integer, Site> indexAndSite = findCorrespondingSiteOnRHS(sp, bl);
					Site otherSite = indexAndSite.getValue();
					int otherAgentIdx = indexAndSite.getKey();
					
					// continue if this node is void -> this was handled in the agent creation method
					if(!(precondition.getAgentPatterns().get(i) instanceof ValidAgentPattern)) {
						continue;
					}
					ValidAgentPattern apLhs = (ValidAgentPattern)precondition.getAgentPatterns().get(i);
					// continue if other node is void -> this was handled in the agent creation method
					if(!(precondition.getAgentPatterns().get(otherAgentIdx) instanceof ValidAgentPattern)) {
						continue;
					}
					
					// find corresponding nodes on lhs and check if something changed
					ValidAgentPattern otherApLhs = (ValidAgentPattern)precondition.getAgentPatterns().get(otherAgentIdx);
					SitePattern spLhs = findSitePatternInAgentPattern(apLhs, site);
					SitePattern otherSpLhs = findSitePatternInAgentPattern(otherApLhs, otherSite);
					// if nothing changed -> continue
					if(sitePatternsLinked(spLhs, otherSpLhs)) continue;
					buildLinkChangeTemplate(ap, i, sp, bl, false);
					
				}
				
			}
		}
	}
	
	private void findAttributeChangeCandidates() {
		attributeChanges = new LinkedList<AttributeChangeTemplate>();
		if(postcondition.getConstraints() == null) return;
		Map<ValidAgentPattern, Integer> vapToIndex = new HashMap<ValidAgentPattern, Integer>();
		for(int i = 0; i < postcondition.getAgentPatterns().size(); i++) {
			AgentPattern ap = postcondition.getAgentPatterns().get(i);
			if(ap instanceof ValidAgentPattern) {
				vapToIndex.put((ValidAgentPattern)ap, i);
			}
		}
		
		for(Constraint constraint : postcondition.getConstraints()) {
			OperationLeft lOp = (OperationLeft) constraint.getOperandL();
			Comparator compare = constraint.getComparator();
			
			if(!(lOp.getLeft() instanceof AttributeOperandGeneric)) continue;
			if(!(compare instanceof EqualComparator)) continue;
			
			AttributeOperandGeneric operandL = (AttributeOperandGeneric)lOp.getLeft();
			ValidAgentPattern vap = (ValidAgentPattern) operandL.getAgent().eContainer();
			Attribute atr = operandL.getAttribute().getAttribute();
			String attributeName = AgentClassFactory.createAttributeName(vap.getAgent(),  atr);
			EAttribute attribute = metaModel.getEAttribute(attributeName);
			AttributeChangeTemplate template = new AttributeChangeTemplate(vapToIndex.get(vap), attribute, vapToIndex, metaModel);
			template.setOperation(constraint.getOperandR());
			attributeChanges.add(template);
			
		}
	}
	
	// apply template methods

	private void applyAgentRemovalCandidates(IMatch match) {
		Collection<Agent> agents = new LinkedList<Agent>();
		
		for(Integer agentIdx : agentRemovals) {
			// add agent to deletion list
			agents.add((Agent)match.get(match.parameterNames().get(agentIdx)));
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
			Agent agent = template.getValue().createAgentFromTemplate(metaModel.getAgentFactory(), reactionContainer);
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
	
	private void singleLinkRemoval(ValidAgentPattern vap, int nodeIndex, SingleSitePattern ssp) {
		LinkState ls = ssp.getLinkState().getLinkState();
		if(ls instanceof FreeLink) {
			buildSingleRemoveTemplate(vap.getAgent(), nodeIndex, ssp.getSite());
		}else if(ls instanceof IndexedFreeLink) {
			int linkIndex = Integer.valueOf(((IndexedFreeLink)ls).getState());
			buildMultiRemoveTemplate(vap.getAgent(), nodeIndex, ssp.getSite(), findOtherRemoveIndex(vap, nodeIndex, linkIndex));
		}else if (ls instanceof TypedFreeLink) {
			TypedFreeLink tfl = (TypedFreeLink)ls;
			buildTypeRemoveTemplate(vap.getAgent(), nodeIndex, ssp.getSite(), metaModel.getClass(tfl.getState().getName()));
		}
	}
	
	private void multiLinkRemoval(ValidAgentPattern vap, int nodeIndex, MultiLinkSitePattern msp) {
		LinkState ls = msp.getLinkState().getLinkState();
		if(ls instanceof FreeLink) {
			buildMultiRemoveTemplate(vap.getAgent(), nodeIndex, msp.getSite(), LinkDeletionTemplate.REMOVE_ALL);
		}else if(ls instanceof IndexedFreeLink) {
			int linkIndex = Integer.valueOf(((IndexedFreeLink)ls).getState());
			buildMultiRemoveTemplate(vap.getAgent(), nodeIndex, msp.getSite(), findOtherRemoveIndex(vap, nodeIndex, linkIndex));
		}else if(ls instanceof TypedFreeLink) {
			TypedFreeLink tfl = (TypedFreeLink)ls;
			buildTypeRemoveTemplate(vap.getAgent(), nodeIndex, msp.getSite(), metaModel.getClass(tfl.getState().getName()));
		}else if(ls instanceof MultiLink) {
			MultiLink ml = (MultiLink)ls;
			for(LinkState mls : ml.getStates()) {
				if(mls instanceof IndexedFreeLink) {
					int linkIndex = Integer.valueOf(((IndexedFreeLink)mls).getState());
					buildMultiRemoveTemplate(vap.getAgent(), nodeIndex, msp.getSite(), findOtherRemoveIndex(vap, nodeIndex, linkIndex));
				}else if(mls instanceof TypedFreeLink) {
					TypedFreeLink tfl = (TypedFreeLink)mls;
					buildTypeRemoveTemplate(vap.getAgent(), nodeIndex, msp.getSite(), metaModel.getClass(tfl.getState().getName()));
				}
			}
		}
	}
	
	private void buildSingleRemoveTemplate(org.simsg.simsgl.simSGL.Agent agent, int nodeIndex, Site site) {
		String refName = AgentClassFactory.createReferenceName(agent, site);
		LinkDeletionTemplate linkRemoveTemplate = new LinkDeletionTemplate(nodeIndex);
		linkRemoveTemplate.addLinkRemovalCandidate(metaModel.getEReference(refName));
		linkRemovals.add(linkRemoveTemplate);
	}
	
	private void buildMultiRemoveTemplate(org.simsg.simsgl.simSGL.Agent agent, int nodeIndex, Site site, int otherIndex) {
		String refName = AgentClassFactory.createReferenceName(agent, site);
		LinkDeletionTemplate linkRemoveTemplate = new LinkDeletionTemplate(nodeIndex);
		linkRemoveTemplate.addLinkRemovalCandidate(metaModel.getEReference(refName), otherIndex);
		linkRemovals.add(linkRemoveTemplate);
	}
	
	private void buildTypeRemoveTemplate(org.simsg.simsgl.simSGL.Agent agent, int nodeIndex, Site site, EClass type) {
		String refName = AgentClassFactory.createReferenceName(agent, site);
		LinkDeletionTemplate linkRemoveTemplate = new LinkDeletionTemplate(nodeIndex);
		linkRemoveTemplate.addLinkRemovalType(metaModel.getEReference(refName), type);
		linkRemovals.add(linkRemoveTemplate);
	}
	
	private int findOtherRemoveIndex(ValidAgentPattern vap, int nodeIndex, int linkIndex) {
		for(int i = 0; i<postcondition.getAgentPatterns().size(); i++) {
			if(i == nodeIndex) continue;
			
			AgentPattern ap2 = postcondition.getAgentPatterns().get(i);
			if(!(ap2 instanceof ValidAgentPattern)) continue;
			
			ValidAgentPattern vap2 = (ValidAgentPattern) ap2;
			for(SitePattern sp : vap2.getSitePatterns().getSitePatterns()) {
				if(sp == null) continue;
				
				if(sp instanceof SingleSitePattern) {
					SingleSitePattern ssp = (SingleSitePattern) sp;
					LinkState ls = ssp.getLinkState().getLinkState();
					if(ls == null) continue;
					if(!(ls instanceof IndexedFreeLink)) continue;
					
					IndexedFreeLink ifl = (IndexedFreeLink) ls;
					int idx2 = Integer.valueOf(ifl.getState());
					if(linkIndex == idx2) {
						return i;
					}
				}else {
					MultiLinkSitePattern ssp = (MultiLinkSitePattern) sp;
					LinkState ls = ssp.getLinkState().getLinkState();
					if(ls == null) continue;
					if(ls instanceof IndexedFreeLink) {
						IndexedFreeLink ifl = (IndexedFreeLink) ls;
						int idx2 = Integer.valueOf(ifl.getState());
						if(linkIndex == idx2) {
							return i;
						}
					}else if(ls instanceof MultiLink) {
						MultiLink ml = (MultiLink)ls;
						for(LinkState mls : ml.getStates()) {
							if(!(mls instanceof IndexedFreeLink)) continue;
							IndexedFreeLink ifl = (IndexedFreeLink) mls;
							int idx2 = Integer.valueOf(ifl.getState());
							if(linkIndex == idx2) {
								return i;
							}
						}
					}
				}
				
			}
		}
		
		return -1;
	}
	
	// Helper method -> Find the corresponding state of an rhs-pattern on the lhs 
	private State findLhsState(int lhsAgentPatternIndex, SitePattern rhsSitePattern) {
		State lhsState = null;
		ValidAgentPattern lhsAP = (ValidAgentPattern)precondition.getAgentPatterns().get(lhsAgentPatternIndex);
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
		for(org.simsg.container.State currentStateInstance : reactionContainer.getStates()) {
			if(currentStateInstance.eClass().getName().equals(state.getName())) {
				stateInstance = currentStateInstance;
				break;
			}
		}
		return stateInstance;
	}
	
	private LinkChangeTemplate buildLinkChangeTemplate(ValidAgentPattern vap, int nodeIndex, SitePattern sp, BoundLink bl, boolean agentNotInMatch) {
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
		
		Entry<Integer, Site> indexAndSite = findCorrespondingSiteOnRHS(sp, bl);
		Site otherSite = indexAndSite.getValue();
		int otherAgentIdx = indexAndSite.getKey();
		org.simsg.simsgl.simSGL.Agent otherAgent = ((ValidAgentPattern)postcondition.getAgentPatterns().get(otherAgentIdx)).getAgent();
		String srcRefName = AgentClassFactory.createReferenceName(vap.getAgent(), site);
		String trgRefName = AgentClassFactory.createReferenceName(otherAgent, otherSite);
		LinkChangeTemplate lct = new LinkChangeTemplate();
		lct.setSrc(vap, nodeIndex, metaModel.getEReference(srcRefName));
		lct.setTrg((ValidAgentPattern)postcondition.getAgentPatterns().get(otherAgentIdx), otherAgentIdx, metaModel.getEReference(trgRefName));
		if(agentNotInMatch) {
			lct.setAgentNotInMatch(vap);
		}
		linkChanges.putIfAbsent(linkIdx, lct);
		return lct;
	}
	
	private Entry<Integer, Site> findCorrespondingSiteOnRHS(SitePattern sitePattern, BoundLink link) {
		int idx = Integer.valueOf(link.getState());
		
		for(int i = 0; i<postcondition.getAgentPatterns().size(); i++) {
			AgentPattern ap = postcondition.getAgentPatterns().get(i);
			if(!(ap instanceof ValidAgentPattern)) continue;
			ValidAgentPattern vap = (ValidAgentPattern) ap;
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
						return new AbstractMap.SimpleEntry<Integer, Site>(i, ssp.getSite());
					}
				}else {
					MultiLinkSitePattern msp = (MultiLinkSitePattern) sp;
					
					LinkState mls = msp.getLinkState().getLinkState();
					if(mls == null) continue;
					
					if(mls instanceof BoundLink) {
						BoundLink bl = (BoundLink) mls;
						int idx2 = Integer.valueOf(bl.getState());
						if(idx == idx2) {
							return new AbstractMap.SimpleEntry<Integer, Site>(i, msp.getSite());
						}
					}else if(mls instanceof MultiLink) {
						MultiLink ml = (MultiLink)mls;
						for(LinkState ls2 : ml.getStates()) {
							if(!(ls2 instanceof BoundLink)) continue;
							
							BoundLink bl = (BoundLink) ls2;
							int idx2 = Integer.valueOf(bl.getState());
							if(idx == idx2) {
								return new AbstractMap.SimpleEntry<Integer, Site>(i, msp.getSite());
							}
						}
					}
				}
				
				
			}
		}
		return new AbstractMap.SimpleEntry<Integer, Site>(-1, null);
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