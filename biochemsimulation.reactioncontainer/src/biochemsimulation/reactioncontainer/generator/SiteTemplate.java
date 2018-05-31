package biochemsimulation.reactioncontainer.generator;

import java.util.HashSet;

import biochemsimulation.reactioncontainer.ReactioncontainerFactory;
import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimSite;
import biochemsimulation.reactioncontainer.SimSiteState;
import biochemsimulation.reactionrules.reactionRules.IndexedLink;
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
		if(sp == null) {
			linkStates.add(new FreeStateTemplate());
		}else {
			if(sp.getLinkState().getLinkState() instanceof IndexedLink) {
				linkStates.add(new BoundStateTemplate(at, (IndexedLink) sp.getLinkState().getLinkState()));
			}else {
				linkStates.add(new FreeStateTemplate());
			}
		}
	}
	
	public SimSite createInstance(ReactioncontainerFactory factory, SimAgent agent) {
		SimSite newSite = factory.createSimSite();
		// missing name
		newSite.setType(type);
		newSite.setSimAgent(agent);
		
		if(hasSiteState && !siteState.equals("u")) {
			SimSiteState newSiteState = factory.createSimSiteState();
			newSiteState.setType(siteState);
			newSite.setSimSiteState(newSiteState);
		}
		
		for(LinkStateTemplate lst : linkStates) {
			newSite.setSimLinkstate(lst.createInstance(factory, newSite));
		}
		return newSite;
	}
}
