package biochemsimulation.simulation.pmc.GT;

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
import biochemsimulation.reactionrules.reactionRules.Pattern;
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
			LinkDeletionTemplate linkRemoveTemplate = new LinkDeletionTemplate(i);
			if(postcondition.getAgentPatterns().get(i) instanceof ValidAgentPattern && 
					precondition.getAgentPatterns().get(i) instanceof ValidAgentPattern) {
				ValidAgentPattern ap = (ValidAgentPattern)postcondition.getAgentPatterns().get(i);
				for(int j = 0; j<ap.getSitePatterns().getSitePatterns().size(); j++) {
					SitePattern sp = ap.getSitePatterns().getSitePatterns().get(j);
					// if the site has a link -> check if it needs deletion
					if(sp.getLinkState().getLinkState() instanceof FreeLink) {
						String refName = AgentClassFactory.createReferenceName(ap.getAgent(), sp.getSite());
						linkRemoveTemplate.addLinkRemovalCandidate(metaModel.getEReference(refName));
					}
				}
			}
			if(!linkRemoveTemplate.isEmpty()) {
				linkRemovals.add(linkRemoveTemplate);
			}
		}
	}
	
	private void findSiteStateChangeCandidates() {
		stateChanges = new LinkedList<StateChangeTemplate>();
		for(int i = 0; i<postcondition.getAgentPatterns().size(); i++) {
			if(postcondition.getAgentPatterns().get(i) instanceof ValidAgentPattern && 
					precondition.getAgentPatterns().get(i) instanceof ValidAgentPattern) {
				ValidAgentPattern ap_trg = (ValidAgentPattern)postcondition.getAgentPatterns().get(i);
				StateChangeTemplate stTemplate = new StateChangeTemplate(i);
				
				for(int j = 0; j<ap_trg.getSitePatterns().getSitePatterns().size(); j++) {
					SitePattern sp_trg = ap_trg.getSitePatterns().getSitePatterns().get(j);
					// if the site has a site state -> state
					State state_trg = null;
					State state_src = null;
					if(sp_trg.getState() != null) {
						state_trg = sp_trg.getState().getState();
						state_src = findLhsState(i, sp_trg);
					}else {
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
	private State findLhsState(int lhsAgentPatternIndex, SitePattern rhsSitePattern) {
		State lhsState = null;
		ValidAgentPattern lhsAP = (ValidAgentPattern)precondition.getAgentPatterns().get(lhsAgentPatternIndex);
		Site rhsSite = rhsSitePattern.getSite();
		for(SitePattern lhsSitePattern : lhsAP.getSitePatterns().getSitePatterns()) {
			if(rhsSite.getName().equals(lhsSitePattern.getSite().getName())) {
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
				for(SitePattern sp : ap.getSitePatterns().getSitePatterns()) {
					Site site = sp.getSite();
					// define a state if the pattern has a state
					if(sp.getState() != null) {
						String stateRefName = StateClassFactory.createReferenceName(ap.getAgent(), site, sp.getState().getState());
						agntTemplate.addSiteState(metaModel.getEReference(stateRefName), findStateInstance(sp.getState().getState()));
					}else {
						if(site.getStates().getState().size() > 0) {
							State state = site.getStates().getState().get(0);
							String stateRefName = StateClassFactory.createReferenceName(ap.getAgent(), sp.getSite(), state);
							agntTemplate.addSiteState(metaModel.getEReference(stateRefName), findStateInstance(state));
						}
					}
					// create a link change template if the pattern defines an indexed link
					if(sp.getLinkState().getLinkState() instanceof BoundLink) {
						int linkIdx = Integer.valueOf(((BoundLink)sp.getLinkState().getLinkState()).getState());
						if(linkChanges.containsKey(linkIdx)){
							linkChanges.get(linkIdx).setAgentNotInMatch(ap);
							continue;
						}
						
						Entry<Integer, Site> indexAndSite = findCorrespondingSiteOnRHS(sp, (BoundLink)sp.getLinkState().getLinkState());
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
				
				LinkState ls = sp.getLinkState().getLinkState();
				if(ls == null) continue;
				if(!(ls instanceof BoundLink)) continue;
				
				BoundLink bl = (BoundLink) ls;
				int idx2 = Integer.valueOf(bl.getState());
				if(idx == idx2) {
					return new AbstractMap.SimpleEntry<Integer, Site>(i, sp.getSite());
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
				if(sp.getLinkState() == null) {
					continue;
				}
				LinkState ls = sp.getLinkState().getLinkState();
				if(!(ls instanceof BoundLink)) {
					continue;
				}
				// current agent node
				biochemsimulation.reactionrules.reactionRules.Agent agent = ap.getAgent();
				Site site = sp.getSite();
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
				SitePattern otherSpLhs = findSitePatternInAgentPattern(otherApLhs, otherSite);
				LinkState lsLhs = spLhs.getLinkState().getLinkState();
				LinkState otherLsLhs = otherSpLhs.getLinkState().getLinkState();
				
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
			if(sp.getSite() == site) {
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