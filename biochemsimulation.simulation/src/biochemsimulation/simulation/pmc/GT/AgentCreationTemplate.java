package biochemsimulation.simulation.pmc.GT;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import biochemsimulation.reactioncontainer.ReactionContainerFactory;
import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimBound;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;
import biochemsimulation.reactioncontainer.SimSiteState;

class AgentCreationTemplate {
	private String type;
	private List<String> sites;
	private Map<String, String> siteStates;
	private Map<String, Integer> siteLinks;
	
	AgentCreationTemplate(String type){
		this.type = type;
		sites = new LinkedList<String>();
		siteStates = new HashMap<String, String>();
		siteLinks = new HashMap<String, Integer>();
	}
	
	void addSite(String site) {
		sites.add(site);
	}
	
	void addSiteState(String site, String state) {
		siteStates.put(site, state);
	}
	
	void addLink(String site) {
		if(siteLinks.containsKey(site)) {
			siteLinks.replace(site, siteLinks.get(site)+1);
		}else {
			siteLinks.put(site, 1);
		}
	}
	
	SimAgent createAgentFromTemplate(ReactionContainerFactory factory, List<SimLinkState> createdLinks) {
		SimAgent simAgent = factory.createSimAgent();
		simAgent.setType(type);
		List<SimSite> createdSites = new LinkedList<SimSite>();
		for(String site : sites) {
			SimSite simSite = factory.createSimSite();
			simSite.setType(site);
			if(siteStates.containsKey(site)) {
				SimSiteState simSiteState = factory.createSimSiteState();
				simSiteState.setType(siteStates.get(site));
				simSite.setSimSiteState(simSiteState);
			}
			if(siteLinks.containsKey(site)) {
				for(int i = siteLinks.get(site); i>0; i--) {
					SimBound simBound = factory.createSimBound();
					simBound.setSimSite1(simSite);
					simSite.setSimLinkState(simBound);
					createdLinks.add(simBound);
				}
			}
			createdSites.add(simSite);
			simSite.setSimAgent(simAgent);
		}
		simAgent.getSimSites().addAll(createdSites);
		return simAgent;
	}
	
	
}