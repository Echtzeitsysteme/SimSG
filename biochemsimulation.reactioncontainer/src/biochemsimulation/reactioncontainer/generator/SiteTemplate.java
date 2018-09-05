package biochemsimulation.reactioncontainer.generator;

import java.util.HashSet;
import java.util.List;

import biochemsimulation.reactioncontainer.ReactionContainerFactory;
import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;
import biochemsimulation.reactioncontainer.SimSiteState;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.Site;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.SiteState;

public class SiteTemplate {
	final public static String FREE_LINK_STATE = "free";
	final public static String BOUND_LINK_STATE = "bound";
	
	private AgentTemplate at;
	private SitePattern sp;
	private SiteState ss;
	private Site site;
	
	private String type;
	private String siteState;
	private boolean hasSiteState;
	private HashSet<LinkStateTemplate> linkStates;
	
	SiteTemplate(AgentTemplate at, SitePattern sp) {
		this.at = at;
		this.sp = sp;
		this.ss = sp.getState();
		this.site = sp.getSite();
		type = "";
		siteState = "";
		hasSiteState = true;
		linkStates = new HashSet<LinkStateTemplate>();
		createTemplate();
	}
	
	SiteTemplate(AgentTemplate at, Site site) {
		this.at = at;
		this.sp = null;
		this.ss = null;
		this.site = site;
		type = "";
		siteState = "";
		hasSiteState = true;
		linkStates = new HashSet<LinkStateTemplate>();
		createTemplate();
	}
	
	private void createTemplate() {
		type = site.getName();
		initSiteState();
		initLinkStates();
	}
	
	private void initSiteState() {
		if(ss != null) {
			siteState = ss.getState().getName();
		}else {
			if(site.getStates().getState() != null) {
				if(site.getStates().getState().size() > 0) {
					siteState = site.getStates().getState().get(0).getName();
				}else {
					hasSiteState = false;
				}
			}else {
				hasSiteState = false;
			}
		}
	}
	
	private void initLinkStates() {
		if(sp != null) {
			if(sp.getLinkState().getLinkState() instanceof BoundLink) {
				linkStates.add(new BoundStateTemplate(at, (BoundLink) sp.getLinkState().getLinkState()));
			}
		}
	}
	
	public SimSite createInstance(ReactionContainerFactory factory, List<SimLinkState> simLinkStates, SimAgent agent) {
		SimSite newSite = factory.createSimSite();
		// missing name
		newSite.setType(type);
		//newSite.setSimAgent(agent);
		
		if(hasSiteState) {
			SimSiteState newSiteState = factory.createSimSiteState();
			newSiteState.setType(siteState);
			newSite.setSimSiteState(newSiteState);
		}
		
		for(LinkStateTemplate lst : linkStates) {
			newSite.setSimLinkState(lst.createInstance(factory, simLinkStates, newSite));
		}
		return newSite;
	}
}
