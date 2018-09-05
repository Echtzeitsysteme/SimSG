package biochemsimulation.simulation.pmc.GT;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.ReactionContainerFactory;
import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimBound;
import biochemsimulation.reactioncontainer.SimSite;
import biochemsimulation.reactioncontainer.SimSiteState;

public class AgentCreationTemplate {
	private String type;
	private List<String> sites;
	private Map<String, String> siteStates;
	private Map<String, Integer> siteLinks;
	
	public AgentCreationTemplate(String type){
		this.type = type;
		sites = new LinkedList<String>();
		siteStates = new HashMap<String, String>();
		siteLinks = new HashMap<String, Integer>();
	}
	
	public void addSite(String site) {
		sites.add(site);
	}
	
	public void addSiteState(String site, String state) {
		siteStates.put(site, state);
	}
	
	public void addLink(String site) {
		if(siteLinks.containsKey(site)) {
			siteLinks.replace(site, siteLinks.get(site)+1);
		}else {
			siteLinks.put(site, 1);
		}
	}
	
	public SimAgent createAgentFromTemplate(ReactionContainerFactory factory, ReactionContainer reactionContainer) {
		SimAgent simAgent = factory.createSimAgent();
		reactionContainer.getSimAgent().add(simAgent);
		simAgent.setType(type);
		for(String site : sites) {
			SimSite simSite = factory.createSimSite();
			simAgent.getSimSites().add(simSite);
			//simSite.setSimAgent(simAgent);
			simSite.setType(site);
			if(siteStates.containsKey(site)) {
				SimSiteState simSiteState = factory.createSimSiteState();
				simSiteState.setType(siteStates.get(site));
				simSite.setSimSiteState(simSiteState);
			}
			if(siteLinks.containsKey(site)) {
				for(int i = siteLinks.get(site); i>0; i--) {
					SimBound simBound = factory.createSimBound();
					reactionContainer.getSimLinkStates().add(simBound);
					simBound.setSimSite1(simSite);
					simSite.setSimLinkState(simBound);
				}
			}
			
		}
		return simAgent;
	}
	
	
}