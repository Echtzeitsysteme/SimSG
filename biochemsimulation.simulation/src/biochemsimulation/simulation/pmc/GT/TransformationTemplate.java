package biochemsimulation.simulation.pmc.GT;

import java.util.LinkedList;
import java.util.List;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.ReactionContainerFactory;
import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;
import biochemsimulation.reactionrules.reactionRules.VoidAgentPattern;
import biochemsimulation.simulation.matching.IMatch;

class TransformationTemplate {
	
	private Pattern precondition;
	private Pattern postcondition;
	
	private List<Integer> agentRemovals;
	private List<LinkDeletionTemplate> linkRemovals;
	private List<StateChangeTemplate> stateChanges;
	private List<AgentCreationTemplate> agentCreations;
	private List<LinkChangeTemplate> linkChanges;
	
	TransformationTemplate(Pattern precondition, Pattern postcondition) {
		this.precondition = precondition;
		this.postcondition = postcondition;
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
						linkRemoveTemplate.addLinkRemovalCandidate(j);
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
					// if the site has a site state -> fetch name
					String state_trg = null;
					if(sp_trg.getState() != null) {
						state_trg = sp_trg.getState().getState().getName();
					}else {
						continue;
					}
					stTemplate.addStateChangeCandidate(j, state_trg);
				}
				
				if(!stTemplate.isEmpty()) {
					stateChanges.add(stTemplate);
				}
			}
			
		}
	}
	
	private void findAgentCreationCandidates() {
		agentCreations = new LinkedList<AgentCreationTemplate>();
		for(int i = 0; i<precondition.getAgentPatterns().size(); i++) {
			// if the source pattern defines a void instead of an agent pattern -> create new agent according to target pattern
			if(precondition.getAgentPatterns().get(i) instanceof VoidAgentPattern) {
				// generate agent template
				ValidAgentPattern ap = (ValidAgentPattern)postcondition.getAgentPatterns().get(i);
				AgentCreationTemplate agntTemplate = new AgentCreationTemplate(ap.getAgent().getName());
				// define required sites
				ap.getSitePatterns().getSitePatterns().forEach(sp-> {
					String site = sp.getSite().getName();
					agntTemplate.addSite(site);
					// define a state if the pattern has a state
					if(sp.getState() != null) {
						agntTemplate.addSiteState(site, sp.getState().getState().getName());
					} 
					// otherwise define the default site state, if there is any
					else if(sp.getSite().getStates().getState() != null && sp.getState() == null) {
						agntTemplate.addSiteState(site, sp.getSite().getStates().getState().get(0).getName());
					}
					// create a link if the pattern defines an indexed link
					// -> the correct linking is performed in the link transform step
					if(sp.getLinkState().getLinkState() instanceof BoundLink) {
						agntTemplate.addLink(site);
					}
				});
				agentCreations.add(agntTemplate);
			}
		}
	}
	
	private void findLinkChangeCandidates() {
		linkChanges = new LinkedList<LinkChangeTemplate>();
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
				findAndSetLinkCorrespondence(i, j, linkIdx);
			}
		}
	}
	
	private void findAndSetLinkCorrespondence(int agentIdx, int siteIdx, int linkIdx) {
		for(int i = 0; i<postcondition.getAgentPatterns().size(); i++) {
			if(i == agentIdx) {
				continue;
			}
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
				int linkIdx2 = Integer.valueOf(link.getState());
				if(linkIdx == linkIdx2) {
					//create template
					LinkChangeTemplate linkChange = new LinkChangeTemplate(agentIdx, siteIdx);
					linkChange.connectTo(i, j);
					linkChanges.add(linkChange);
				}
			}
		}
	}
	
	private void applyAgentRemovalCandidates(IMatch match) {
		for(Integer agentIdx : agentRemovals) {
			SimAgent agent = (SimAgent) match.get(match.parameterNames().get(agentIdx));
			// delete all links to agent
			for(SimSite site : agent.getSimSites()) {
				SimLinkState sLinkState = site.getSimLinkState();
				if(sLinkState != null) {
					org.eclipse.emf.ecore.util.EcoreUtil.delete(sLinkState);
				}
			}
			// delete agent
			org.eclipse.emf.ecore.util.EcoreUtil.delete(agent);
		}
	}
	
	private void applyLinkRemovalTemplates(IMatch match) {
		for(LinkDeletionTemplate template : linkRemovals) {
			template.applyRemovalCandidates(match);
		}
	}
	
	private void applyStateChangeTemplates(IMatch match) {
		for(StateChangeTemplate template : stateChanges) {
			template.applyStateChangeCandidates(match);
		}
	}
	
	private void applyAgentCreationCandidates(ReactionContainer reactionContainer, ReactionContainerFactory factory) {
		if(agentCreations.size() == 0)
			return;
		
		List<SimAgent> createdAgents = new LinkedList<SimAgent>();
		List<SimLinkState> createdLinks = new LinkedList<SimLinkState>();
		for(AgentCreationTemplate template : agentCreations) {
			createdAgents.add(template.createAgentFromTemplate(factory, createdLinks));
		}
		reactionContainer.getSimAgent().addAll(createdAgents);
		reactionContainer.getSimLinkStates().addAll(createdLinks);
	}
	
	private void applyLinkChangeCandidates(IMatch match, ReactionContainer reactionContainer, ReactionContainerFactory factory) {
		if(linkChanges.size() == 0)
			return;
		
		List<SimLinkState> createdLinks = new LinkedList<SimLinkState>();
		for(LinkChangeTemplate template : linkChanges) {
			createdLinks.add(template.applyLinkChange(match, factory));
		}
		reactionContainer.getSimLinkStates().addAll(createdLinks);
	}
	
	void applyTransformation(IMatch match, ReactionContainer reactionContainer, ReactionContainerFactory factory) {
		applyAgentRemovalCandidates(match);
		applyLinkRemovalTemplates(match);
		applyStateChangeTemplates(match);
		applyAgentCreationCandidates(reactionContainer, factory);
		applyLinkChangeCandidates(match, reactionContainer, factory);
	}
}