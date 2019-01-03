package biochemsimulation.simulation.pmc.GT;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import biochemsimulation.reactioncontainer.Agent;
import biochemsimulation.reactioncontainer.Container;
import biochemsimulation.reactioncontainer.ReactionContainerFactory;
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
	private List<AgentCreationTemplate> agentCreations;
	private List<LinkChangeTemplate> linkChanges;
	
	private Map<AgentCreationTemplate, Agent> createdAgents;
	
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
			if(rhsSite == lhsSitePattern.getSite()) {
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
		linkChanges = new LinkedList<LinkChangeTemplate>();
		agentCreations = new LinkedList<AgentCreationTemplate>();
		createdAgents = new HashMap<AgentCreationTemplate, Agent>();
		
		for(int i = 0; i<precondition.getAgentPatterns().size(); i++) {
			// if the source pattern defines a void instead of an agent pattern -> create new agent according to target pattern
			if(precondition.getAgentPatterns().get(i) instanceof VoidAgentPattern) {
				// generate agent template
				ValidAgentPattern ap = (ValidAgentPattern)postcondition.getAgentPatterns().get(i);
				AgentCreationTemplate agntTemplate = new AgentCreationTemplate(ap.getAgent().getName());
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
						Site otherSite = null;
						int otherAgentIdx = findCorrespondingSiteOnRHS(otherSite, sp, (BoundLink)sp.getLinkState().getLinkState());
						biochemsimulation.reactionrules.reactionRules.Agent otherAgent = ((ValidAgentPattern)postcondition.getAgentPatterns().get(otherAgentIdx)).getAgent();
						String srcRefName = AgentClassFactory.createReferenceName(ap.getAgent(), site);
						String trgRefName = AgentClassFactory.createReferenceName(otherAgent, otherSite);
						LinkChangeTemplate lct = new LinkChangeTemplate();
						lct.setSrc(i, metaModel.getEReference(srcRefName));
						lct.setTrg(otherAgentIdx, metaModel.getEReference(trgRefName));
						linkChanges.add(lct);
					}
				}
				agentCreations.add(agntTemplate);
			}
		}
	}
	
	private int findCorrespondingSiteOnRHS(Site otherSite, SitePattern sitePattern, BoundLink link) {
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
					otherSite = sp.getSite();
					return i;
				}
				
			}
		}
		return -1;
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
				BoundLink link = (BoundLink) ls;
				int linkIdx = Integer.valueOf(link.getState());
				
				// find other side and link!
			}
		}
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
		
		for(AgentCreationTemplate template : agentCreations) {
			// create new agent and store for linkage
			Agent agent = template.createAgentFromTemplate(metaModel.getAgentFactory(), reactionContainer);
			createdAgents.put(template, agent);
		}
	}
	
	private void applyLinkChangeCandidates(IMatch match) {
		if(linkChanges.size() == 0)
			return;
		
		for(LinkChangeTemplate template : linkChanges) {
			//template.applyLinkChange(match, reactionContainer);
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