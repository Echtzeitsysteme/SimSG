package biochemsimulation.simulation.pmc;

import biochemsimulation.reactioncontainer.ReactionContainerFactory;
import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimBound;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;
import biochemsimulation.simulation.matching.IMatch;

public class LinkChangeTemplate {
	private int agentIdxFrom;
	private int agentIdxTo;
	
	private int siteIdxFrom;
	private int siteIdxTo;
	
	public LinkChangeTemplate(int agentIdxFrom, int siteIdxFrom) {
		this.agentIdxFrom = agentIdxFrom;
		this.siteIdxFrom = siteIdxFrom;
	}
	
	void connectTo(int agentIdxTo, int siteIdxTo) {
		this.agentIdxTo = agentIdxTo;
		this.siteIdxTo = siteIdxTo;
	}
	
	SimLinkState applyLinkChange(IMatch match, ReactionContainerFactory factory) {
		SimAgent simAgentFrom = (SimAgent) match.get(match.parameterNames().get(agentIdxFrom));
		SimSite simSiteFrom = simAgentFrom.getSimSites().get(siteIdxFrom);
		if(simSiteFrom.getSimLinkState() != null) {
			org.eclipse.emf.ecore.util.EcoreUtil.delete(simSiteFrom.getSimLinkState());
		}
		
		SimAgent simAgentTo = (SimAgent) match.get(match.parameterNames().get(agentIdxTo));
		SimSite simSiteTo = simAgentTo.getSimSites().get(siteIdxTo);
		if(simSiteTo.getSimLinkState() != null) {
			org.eclipse.emf.ecore.util.EcoreUtil.delete(simSiteTo.getSimLinkState());
		}
		
		SimBound link = factory.createSimBound();
		link.setSimSite1(simSiteFrom);
		link.setSimSite2(simSiteTo);
		simSiteFrom.setSimLinkState(link);
		simSiteTo.setSimLinkState(link);
		
		return link;
	}
	
	
}
