package biochemsimulation.simulation.pmc.GT;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.ReactionContainerFactory;
import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;
import biochemsimulation.reactioncontainer.SimSiteState;
import biochemsimulation.reactionrules.reactionRules.AgentPattern;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.Site;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;
import biochemsimulation.reactionrules.reactionRules.VoidAgentPattern;
import biochemsimulation.simulation.matching.IMatch;

public class TransformationTemplate {
	
	private Pattern precondition;
	private Pattern postcondition;
	
	private List<Integer> agentRemovals;
	private List<LinkDeletionTemplate> linkRemovals;
	private List<StateChangeTemplate> stateChanges;
	private List<AgentCreationTemplate> agentCreations;
	private Map<Integer, LinkChangeTemplate> linkChanges;
	
	private Map<AgentPattern, AgentCreationTemplate> createdAgents;
	private Map<AgentCreationTemplate, SimAgent> createdSimAgents;
	
	public TransformationTemplate(Pattern precondition, Pattern postcondition) {
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
						//linkRemoveTemplate.addLinkRemovalCandidate(j);
						linkRemoveTemplate.addLinkRemovalCandidate(convertSitePatternIdxToMatchIdx(ap, j));
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
					//stTemplate.addStateChangeCandidate(j, state_trg);
					stTemplate.addStateChangeCandidate(convertSitePatternIdxToMatchIdx(ap_trg, j), state_trg);
				}
				
				if(!stTemplate.isEmpty()) {
					stateChanges.add(stTemplate);
				}
			}
			
		}
	}
	
	private void findAgentCreationCandidates() {
		agentCreations = new LinkedList<AgentCreationTemplate>();
		createdAgents = new HashMap<AgentPattern, AgentCreationTemplate>();
		createdSimAgents = new HashMap<AgentCreationTemplate, SimAgent>();
		for(int i = 0; i<precondition.getAgentPatterns().size(); i++) {
			// if the source pattern defines a void instead of an agent pattern -> create new agent according to target pattern
			if(precondition.getAgentPatterns().get(i) instanceof VoidAgentPattern) {
				// generate agent template
				ValidAgentPattern ap = (ValidAgentPattern)postcondition.getAgentPatterns().get(i);
				AgentCreationTemplate agntTemplate = new AgentCreationTemplate(ap.getAgent().getName());
				// define required sites
				for(Site site : ap.getAgent().getSites().getSites()) {
					agntTemplate.addSite(site.getName());
					// define the default site state, if there is any
					if(site.getStates().getState() != null) {
						if(site.getStates().getState().size() > 0) {
							agntTemplate.addSiteState(site.getName(), site.getStates().getState().get(0).getName());
						}
					}
				}
				for(SitePattern sp : ap.getSitePatterns().getSitePatterns()) {
					String site = sp.getSite().getName();
					// define a state if the pattern has a state
					if(sp.getState() != null) {
						agntTemplate.addSiteState(site, sp.getState().getState().getName());
					}
					// create a link if the pattern defines an indexed link
					// -> the correct linking is performed in the link transform step
					if(sp.getLinkState().getLinkState() instanceof BoundLink) {
						agntTemplate.addLink(site);
						createdAgents.put(precondition.getAgentPatterns().get(i), agntTemplate);
					}
				}
				agentCreations.add(agntTemplate);
			}
		}
	}
	
	private void findLinkChangeCandidates() {
		linkChanges = new HashMap<Integer, LinkChangeTemplate>();
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
				
				AgentPattern prePattern = precondition.getAgentPatterns().get(i);
				if(!createdAgents.containsKey(prePattern)) {
					findAndSetLinkCorrespondence(i, j, convertSitePatternIdxToMatchIdx(ap, j), linkIdx);
				}else {
					findAndSetLinkCorrespondence(createdAgents.get(prePattern), i, j, convertSitePatternIdxToMatchIdx(ap, j), linkIdx);
				}
				
			}
		}
	}
	
	private int convertSitePatternIdxToMatchIdx(ValidAgentPattern ap, int patternIdx) {
		int matchIdx = 0;
		String siteName = ap.getSitePatterns().getSitePatterns().get(patternIdx).getSite().getName();
		List<Site> sites = ap.getAgent().getSites().getSites();
		for(int i = 0; i<sites.size(); i++) {
			Site currentSite = sites.get(i);
			if(currentSite.getName().equals(siteName)) {
				matchIdx = i;
				break;
			}
		}
		return matchIdx;
	}
	
	private void findAndSetLinkCorrespondence(int agentIdx, int siteIdx, int matchSiteIdx, int linkIdx) {
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
					AgentPattern prePattern = precondition.getAgentPatterns().get(i);
					LinkChangeTemplate linkChange = new LinkChangeTemplate(agentIdx, matchSiteIdx);
					//create template
					if(!createdAgents.containsKey(prePattern)) {
						linkChange.connectTo(i, convertSitePatternIdxToMatchIdx(ap, j));
					}else {
						linkChange.connectTo(createdAgents.get(prePattern), convertSitePatternIdxToMatchIdx(ap, j), createdSimAgents);
					}
					//linkChanges.add(linkChange);
					linkChanges.putIfAbsent(linkChange.calculateKey(), linkChange);
				}
			}
		}
	}
	
	private void findAndSetLinkCorrespondence(AgentCreationTemplate agentTemplate, int agentIdx, int siteIdx, int matchSiteIdx, int linkIdx) {
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
					AgentPattern prePattern = precondition.getAgentPatterns().get(i);
					LinkChangeTemplate linkChange = new LinkChangeTemplate(agentTemplate, matchSiteIdx, createdSimAgents);
					//create template
					if(!createdAgents.containsKey(prePattern)) {
						linkChange.connectTo(i, convertSitePatternIdxToMatchIdx(ap, j));
					}else {
						linkChange.connectTo(createdAgents.get(prePattern), convertSitePatternIdxToMatchIdx(ap, j), createdSimAgents);
					}
					//linkChanges.add(linkChange);
					linkChanges.putIfAbsent(linkChange.calculateKey(), linkChange);
				}
			}
		}
	}
	
	private void applyAgentRemovalCandidates(IMatch match) {
		Collection<SimLinkState> links = new LinkedList<SimLinkState>();
		Collection<SimSiteState> states = new LinkedList<SimSiteState>();
		Collection<SimSite> sites = new LinkedList<SimSite>();
		Collection<SimAgent> agents = new LinkedList<SimAgent>();
		
		for(Integer agentIdx : agentRemovals) {
			SimAgent agent = (SimAgent) match.get(match.parameterNames().get(agentIdx));
			// delete all links to agent
			for(SimSite site : agent.getSimSites()) {
				SimLinkState sLinkState = site.getSimLinkState();
				SimSiteState sState = site.getSimSiteState();
				if(sLinkState != null) {
					links.add(sLinkState);
				}
				if(sState != null) {
					states.add(sState);
				}
				sites.add(site);
			}
			// delete agent
			agents.add(agent);
			
			
			
		}
		org.eclipse.emf.ecore.util.EcoreUtil.deleteAll(links, false);
		org.eclipse.emf.ecore.util.EcoreUtil.deleteAll(states, false);
		org.eclipse.emf.ecore.util.EcoreUtil.deleteAll(sites, false);
		org.eclipse.emf.ecore.util.EcoreUtil.deleteAll(agents, false);
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
		
		for(AgentCreationTemplate template : agentCreations) {
			SimAgent agent = template.createAgentFromTemplate(factory, reactionContainer);
			createdSimAgents.put(template, agent);
		}
	}
	
	private void applyLinkChangeCandidates(IMatch match, ReactionContainer reactionContainer, ReactionContainerFactory factory) {
		if(linkChanges.size() == 0)
			return;
		
		for(LinkChangeTemplate template : linkChanges.values()) {
			template.applyLinkChange(match, factory, reactionContainer);
		}
	}
	
	public void applyTransformation(IMatch match, ReactionContainer reactionContainer, ReactionContainerFactory factory) {
		//System.out.println(match.patternName());
		applyAgentRemovalCandidates(match);
		applyLinkRemovalTemplates(match);
		applyStateChangeTemplates(match);
		applyAgentCreationCandidates(reactionContainer, factory);
		applyLinkChangeCandidates(match, reactionContainer, factory);
	}
}