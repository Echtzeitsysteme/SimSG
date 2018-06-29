package biochemsimulation.reactioncontainer.generator;

import java.util.HashMap;
import java.util.List;

import biochemsimulation.reactioncontainer.ReactionContainerFactory;
import biochemsimulation.reactioncontainer.SimBound;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;
import biochemsimulation.reactionrules.utils.PatternUtils;

public class BoundStateTemplate implements LinkStateTemplate {
	
	private static HashMap<String, SimLinkState> halfBoundLinks = new HashMap<String, SimLinkState>();
	
	private AgentTemplate at;
	private BoundLink link;
	private String otherType;
	
	BoundStateTemplate(AgentTemplate at, BoundLink link) {
		this.at = at;
		this.link = link;
		searchOtherType();
	}
	
	private void searchOtherType() {
		otherType = "";
		String index = link.getState();
		for(ValidAgentPattern ap : PatternUtils.getValidAgentPatterns(at.getPattern().getAgentPatterns())) {
			if(ap.getAgent().getName().equals(at.getType())) {
				continue;
			}
			for(SitePattern sp : ap.getSitePatterns().getSitePatterns()) {
				if(!(sp.getLinkState().getLinkState() instanceof BoundLink)) {
					continue;
				}
				BoundLink currentLink = (BoundLink) sp.getLinkState().getLinkState();
				String currentIndex = currentLink.getState();
				if(currentIndex.equals(index)) {
					otherType = ap.getAgent().getName();
					return;
				}
			}
		}
	}
	
	@Override
	public SimLinkState createInstance(ReactionContainerFactory factory, List<SimLinkState> simLinkStates, SimSite site) {
		String thisAgentsName = AgentTemplate.generateAgentInstanceName(at.getCurrentCount(), at.getType(), at.getVariableName());
		String otherAgentsName = AgentTemplate.generateAgentInstanceName(at.getCurrentCount(), otherType, at.getVariableName());
		if(halfBoundLinks.containsKey(otherAgentsName)) {
			SimBound oldLinkState = (SimBound)halfBoundLinks.get(otherAgentsName);
			oldLinkState.setSimSite2(site);
			return oldLinkState;
		}else {
			SimBound newLinkState = factory.createSimBound();
			newLinkState.setSimSite1(site);
			halfBoundLinks.put(thisAgentsName, newLinkState);
			simLinkStates.add(newLinkState);
			return newLinkState;
		}
		
	}

}
