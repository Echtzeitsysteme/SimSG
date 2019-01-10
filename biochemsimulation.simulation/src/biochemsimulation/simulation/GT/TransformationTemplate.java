package biochemsimulation.simulation.GT;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import biochemsimulation.reactioncontainer.Agent;
import biochemsimulation.reactioncontainer.Container;
import biochemsimulation.reactioncontainer.util.AgentClassFactory;
import biochemsimulation.reactioncontainer.util.EPackageWrapper;
import biochemsimulation.reactioncontainer.util.StateClassFactory;
import biochemsimulation.reactionrules.reactionRules.AgentPattern;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.MultiLinkSitePattern;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.SingleSitePattern;
import biochemsimulation.reactionrules.reactionRules.Site;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.State;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;
import biochemsimulation.reactionrules.reactionRules.VoidAgentPattern;
import biochemsimulation.simulation.matching.IMatch;

public class TransformationTemplate {
	
	private Pattern precondition;
	private Pattern postcondition;
	private Container reactionContainer;
	private EPackageWrapper metaModel;
	
	private List<Integer> agentRemovals;
	private List<LinkDeletionTemplate> linkRemovals;
	private List<StateChangeTemplate> stateChanges;
	private Map<ValidAgentPattern, AgentCreationTemplate> agentCreations;
	private Map<Integer, LinkChangeTemplate> linkChanges;
	
	private Map<ValidAgentPattern, Agent> createdAgents;
	
	public TransformationTemplate(Pattern precondition, Pattern postcondition, Container reactionContainer, EPackageWrapper metaModel) {
		this.precondition = precondition;
		this.postcondition = postcondition;
		this.metaModel = metaModel;
		this.reactionContainer = reactionContainer;
		initTemplate();
	}
	
	private void initTemplate() {
		findAgentRemovalCandidates();
		findLinkRemovalCandidates();
		findSiteStateChangeCandidates();
		findAgentCreationCandidates();
		findLinkChangeCandidates();
	}
	
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
						multiLinkRemoval((MultiLinkSitePattern) superSp);
					}
					
				}
			}
		}
	}
	
	private void singleLinkRemoval(ValidAgentPattern vap, int nodeIndex, SingleSitePattern ssp) {
		// if the site has a link -> check if it needs deletion
		if(ssp.getLinkState().getLinkState() instanceof FreeLink) {
			String refName = AgentClassFactory.createReferenceName(vap.getAgent(), ssp.getSite());
			LinkDeletionTemplate linkRemoveTemplate = new LinkDeletionTemplate(nodeIndex);
			linkRemoveTemplate.addLinkRemovalCandidate(metaModel.getEReference(refName));
			linkRemovals.add(linkRemoveTemplate);
		}
	}
	
	private void multiLinkRemoval(MultiLinkSitePattern msp) {
		
	}
	
	private void findSiteStateChangeCandidates() {
		stateChanges = new LinkedList<StateChangeTemplate>();
		for(int i = 0; i<postcondition.getAgentPatterns().size(); i++) {
			if(postcondition.getAgentPatterns().get(i) instanceof ValidAgentPattern && 
					precondition.getAgentPatterns().get(i) instanceof ValidAgentPattern) {
				ValidAgentPattern ap_trg = (ValidAgentPattern)postcondition.getAgentPatterns().get(i);
				StateChangeTemplate stTemplate = new StateChangeTemplate(i);
				
				for(int j = 0; j<ap_trg.getSitePatterns().getSitePatterns().size(); j++) {
					SitePattern superSp_trg = ap_trg.getSitePatterns().getSitePatterns().get(j);
					// ignore multi-link site patterns for now
					if(!(superSp_trg instanceof SingleSitePattern)) continue;
					SingleSitePattern sp_trg = (SingleSitePattern) superSp_trg;
					
					// if the site has a site state -> state
					State state_trg = null;
					State state_src = null;
					if(sp_trg.getState() != null) {
						state_trg = sp_trg.getState().getState();
						state_src = findLhsState(i, sp_trg);
						// if both states are equal -> do nothing
						if(state_trg == state_src) continue;
					}else {
						// if there is no state -> do nothing
						continue;
					}
					String oldRefName = StateClassFactory.createReferenceName(ap_trg.getAgent(), sp_trg.getSite(), state_src);
					String newRefName = StateClassFactory.createReferenceName(ap_trg.getAgent(), sp_trg.getSite(), state_trg);
					stTemplate.addStateChangeCandidate(metaModel.getEReference(oldRefName), metaModel.getEReference(newRefName), findStateInstance(state_trg));
				}
				
				if(!stTemplate.isEmpty()) {
					stateChanges.add(stTemplate);
				}
			}
			
		}
	}
	
	// Helper method -> Find the corresponding state of an rhs-pattern on the lhs 
	private State findLhsState(int lhsAgentPatternIndex, SingleSitePattern rhsSitePattern) {
		State lhsState = null;
		ValidAgentPattern lhsAP = (ValidAgentPattern)precondition.getAgentPatterns().get(lhsAgentPatternIndex);
		Site rhsSite = rhsSitePattern.getSite();
		for(SitePattern lhsSitePattern : lhsAP.getSitePatterns().getSitePatterns()) {
			// ignore multi-link site patterns for now
			if(!(lhsSitePattern instanceof SingleSitePattern)) continue;
			SingleSitePattern lhsSp = (SingleSitePattern) lhsSitePattern;
			
			if(rhsSite.getName().equals(lhsSp.getSite().getName())) {
				lhsState = lhsSitePattern.getState().getState();
				break;
			}
		}
		return lhsState;
	}
	
	// Helper method -> Find the corresponding stateInstance to a state described in a pattern 
	private biochemsimulation.reactioncontainer.State findStateInstance(State state) {
		biochemsimulation.reactioncontainer.State stateInstance = null;
		for(biochemsimulation.reactioncontainer.State currentStateInstance : reactionContainer.getStates()) {
			if(currentStateInstance.eClass().getName().equals(state.getName())) {
				stateInstance = currentStateInstance;
				break;
			}
		}
		return stateInstance;
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
					// ignore multi-link site patterns for now
					if(!(sp instanceof SingleSitePattern)) continue;
					SingleSitePattern ssp = (SingleSitePattern) sp;
					
					Site site = ssp.getSite();
					// define a state if the pattern has a state
					if(ssp.getState() != null) {
						String stateRefName = StateClassFactory.createReferenceName(ap.getAgent(), site, ssp.getState().getState());
						agntTemplate.addSiteState(site, metaModel.getEReference(stateRefName), findStateInstance(ssp.getState().getState()));
					}else {
						if(site.getStates().getState().size() > 0) {
							State state = site.getStates().getState().get(0);
							String stateRefName = StateClassFactory.createReferenceName(ap.getAgent(), ssp.getSite(), state);
							agntTemplate.addSiteState(site, metaModel.getEReference(stateRefName), findStateInstance(state));
						}
					}
					// create a link change template if the pattern defines an indexed link
					if(ssp.getLinkState().getLinkState() instanceof BoundLink) {
						int linkIdx = Integer.valueOf(((BoundLink)ssp.getLinkState().getLinkState()).getState());
						if(linkChanges.containsKey(linkIdx)){
							linkChanges.get(linkIdx).setAgentNotInMatch(ap);
							continue;
						}
						
						Entry<Integer, Site> indexAndSite = findCorrespondingSiteOnRHS(ssp, (BoundLink)ssp.getLinkState().getLinkState());
						Site otherSite = indexAndSite.getValue();
						int otherAgentIdx = indexAndSite.getKey();
						biochemsimulation.reactionrules.reactionRules.Agent otherAgent = ((ValidAgentPattern)postcondition.getAgentPatterns().get(otherAgentIdx)).getAgent();
						String srcRefName = AgentClassFactory.createReferenceName(ap.getAgent(), site);
						String trgRefName = AgentClassFactory.createReferenceName(otherAgent, otherSite);
						LinkChangeTemplate lct = new LinkChangeTemplate();
						lct.setSrc(ap, i, metaModel.getEReference(srcRefName));
						lct.setTrg((ValidAgentPattern)postcondition.getAgentPatterns().get(otherAgentIdx), otherAgentIdx, metaModel.getEReference(trgRefName));
						lct.setAgentNotInMatch(ap);
						linkChanges.put(linkIdx, lct);
					}
				}
				agentCreations.put(ap, agntTemplate);
				createdAgents.put(ap, null);
			}
		}
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
				// ignore multi-link site patterns for now
				if(!(sp instanceof SingleSitePattern)) continue;
				SingleSitePattern ssp = (SingleSitePattern) sp;
				
				LinkState ls = ssp.getLinkState().getLinkState();
				if(ls == null) continue;
				if(!(ls instanceof BoundLink)) continue;
				
				BoundLink bl = (BoundLink) ls;
				int idx2 = Integer.valueOf(bl.getState());
				if(idx == idx2) {
					return new AbstractMap.SimpleEntry<Integer, Site>(i, ssp.getSite());
				}
				
			}
		}
		return new AbstractMap.SimpleEntry<Integer, Site>(-1, null);
	}
	
	private void findLinkChangeCandidates() {
		//linkChanges = new HashMap<Integer, LinkChangeTemplate>();
		for(int i = 0; i<postcondition.getAgentPatterns().size(); i++) {
			if(!(postcondition.getAgentPatterns().get(i) instanceof ValidAgentPattern)) {
				continue;
			}
			ValidAgentPattern ap = (ValidAgentPattern)postcondition.getAgentPatterns().get(i);
			for(int j = 0; j<ap.getSitePatterns().getSitePatterns().size(); j++) {
				SitePattern sp = ap.getSitePatterns().getSitePatterns().get(j);
				// ignore multi-link site patterns for now
				if(!(sp instanceof SingleSitePattern)) continue;
				SingleSitePattern ssp = (SingleSitePattern) sp;
				
				if(ssp.getLinkState() == null) {
					continue;
				}
				LinkState ls = ssp.getLinkState().getLinkState();
				if(!(ls instanceof BoundLink)) {
					continue;
				}
				// current agent node
				biochemsimulation.reactionrules.reactionRules.Agent agent = ap.getAgent();
				Site site = ssp.getSite();
				BoundLink link = (BoundLink) ls;
				int linkIdx = Integer.valueOf(link.getState());
				
				// find other side and link!
				Entry<Integer, Site> indexAndSite = findCorrespondingSiteOnRHS(sp, link);
				Site otherSite = indexAndSite.getValue();
				int otherAgentIdx = indexAndSite.getKey();
				biochemsimulation.reactionrules.reactionRules.Agent otherAgent = ((ValidAgentPattern)postcondition.getAgentPatterns().get(otherAgentIdx)).getAgent();
				
				// find corresponding nodes on lhs and check if something changed
				// continue if this node is void -> this was handled in the agent creation method
				if(!(precondition.getAgentPatterns().get(i) instanceof ValidAgentPattern)) {
					continue;
				}
				ValidAgentPattern apLhs = (ValidAgentPattern)precondition.getAgentPatterns().get(i);
				// continue if other node is void -> this was handled in the agent creation method
				if(!(precondition.getAgentPatterns().get(otherAgentIdx) instanceof ValidAgentPattern)) {
					continue;
				}
				ValidAgentPattern otherApLhs = (ValidAgentPattern)precondition.getAgentPatterns().get(otherAgentIdx);
				
				SitePattern spLhs = findSitePatternInAgentPattern(apLhs, site);
				// ignore multi-link site patterns for now
				if(!(spLhs instanceof SingleSitePattern)) continue;
				SingleSitePattern sSpLhs = (SingleSitePattern) spLhs;
				
				SitePattern otherSpLhs = findSitePatternInAgentPattern(otherApLhs, otherSite);
				// ignore multi-link site patterns for now
				if(!(otherSpLhs instanceof SingleSitePattern)) continue;
				SingleSitePattern otherSspLhs = (SingleSitePattern) otherSpLhs;
				
				LinkState lsLhs = sSpLhs.getLinkState().getLinkState();
				LinkState otherLsLhs = otherSspLhs.getLinkState().getLinkState();
				
				if(lsLhs instanceof BoundLink && otherLsLhs instanceof BoundLink) {
					BoundLink blLhs = (BoundLink)lsLhs;
					BoundLink otherBlLhs = (BoundLink)otherLsLhs;
					int idxLhs = Integer.valueOf(blLhs.getState());
					int otherIdxLhs = Integer.valueOf(otherBlLhs.getState());
					// if both indexes are equal both nodes are already connected -> nothing to do
					if(idxLhs == otherIdxLhs) continue;
				}
				
				// Create Link Template
				LinkChangeTemplate lct = new LinkChangeTemplate();
				String srcRefName = AgentClassFactory.createReferenceName(agent, site);
				String trgRefName = AgentClassFactory.createReferenceName(otherAgent, otherSite);
				lct.setSrc(ap, i, metaModel.getEReference(srcRefName));
				lct.setTrg((ValidAgentPattern)postcondition.getAgentPatterns().get(otherAgentIdx), otherAgentIdx, metaModel.getEReference(trgRefName));
				linkChanges.putIfAbsent(linkIdx, lct);
				
			}
		}
	}
	
	private SitePattern findSitePatternInAgentPattern(ValidAgentPattern ap, Site site) {
		for(SitePattern sp: ap.getSitePatterns().getSitePatterns()) {
			// ignore multi-link site patterns for now
			if(!(sp instanceof SingleSitePattern)) continue;
			SingleSitePattern ssp = (SingleSitePattern) sp;
			if(ssp.getSite() == site) {
				return sp; 
			}
		}
		return null;
	}
	
	
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
	
	private void applyStateChangeTemplates(IMatch match) {
		for(StateChangeTemplate template : stateChanges) {
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
	
	public void applyTransformation(IMatch match) {
		//System.out.println(match.patternName());
		applyAgentRemovalCandidates(match);
		applyLinkRemovalTemplates(match);
		applyStateChangeTemplates(match);
		applyAgentCreationCandidates();
		applyLinkChangeCandidates(match);
	}
}