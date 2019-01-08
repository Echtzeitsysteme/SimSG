package biochemsimulation.reactioncontainer.generator;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import biochemsimulation.reactioncontainer.Agent;
import biochemsimulation.reactioncontainer.State;
import biochemsimulation.reactioncontainer.util.AgentClassFactory;
import biochemsimulation.reactioncontainer.util.StateClassFactory;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.MultiLink;
import biochemsimulation.reactionrules.reactionRules.MultiLinkSitePattern;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.SingleSitePattern;
import biochemsimulation.reactionrules.reactionRules.Site;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;
import biochemsimulation.reactionrules.utils.PatternUtils;

public class InitializationTemplate {

	private List<ValidAgentPattern> agentPatterns;
	private AgentClassFactory agentFactory;
	private StateClassFactory stateFactory;
	private Map<String, State> stateInstances;
	private Map<ValidAgentPattern, AgentTemplate> agentTemplates;
	
	public InitializationTemplate(Pattern pattern, AgentClassFactory agentFactory, 
			StateClassFactory stateFactory, Map<String, State> stateInstances) {
		
		this.agentFactory = agentFactory;
		this.stateFactory = stateFactory;
		this.stateInstances = stateInstances;
		
		agentPatterns = PatternUtils.getValidAgentPatterns(pattern.getAgentPatterns());
		
		createAgentTemplates();
		findStates();
		findReferences();
	}
	
	private void createAgentTemplates() {
		agentTemplates = new HashMap<ValidAgentPattern, AgentTemplate>();
		for(ValidAgentPattern vap : agentPatterns) {
			agentTemplates.put(vap, new AgentTemplate(vap.getAgent(), agentFactory, stateFactory, stateInstances));
		}
	}
	
	private void findStates() {
		for(ValidAgentPattern vap : agentPatterns) {
			Map<Site, biochemsimulation.reactionrules.reactionRules.State> states = new HashMap<>();
			for(Site site : vap.getAgent().getSites().getSites()) {
				if(site.getStates().getState().size() > 0) {
					states.put(site, site.getStates().getState().get(0));
				}
			}
			for(SitePattern sp : vap.getSitePatterns().getSitePatterns()) {
				if(sp == null) continue;
				if(sp.getState() == null) continue;
				Site site = null;
				if(sp instanceof SingleSitePattern) site = ((SingleSitePattern) sp).getSite();
				if(sp instanceof MultiLinkSitePattern) site = ((MultiLinkSitePattern) sp).getSite();
				states.replace(site, sp.getState().getState());
			}
			states.forEach((site, state) -> {
				agentTemplates.get(vap).defineState(site, state);
			});
		}
	}
	
	private void findReferences() {
		for(ValidAgentPattern vap : agentPatterns) {
			
			for(SitePattern sp : vap.getSitePatterns().getSitePatterns()) {
				if(sp == null) continue;
				
				if(sp instanceof SingleSitePattern) {
					SingleSitePattern ssp = (SingleSitePattern) sp;
					findReferenceSingeSite(vap, ssp);
				}else {
					MultiLinkSitePattern msp = (MultiLinkSitePattern) sp;
					findReferenceMultiSite(vap, msp);
				}
	
			}
		}
	}
	
	private void findReferenceSingeSite(ValidAgentPattern vap, SingleSitePattern ssp) {
		LinkState ls1 = ssp.getLinkState().getLinkState();
		if(ls1 == null) return;
		if(!(ls1 instanceof BoundLink)) return;
		
		for(ValidAgentPattern vap2 : agentPatterns) {
			if(vap == vap2) continue;
			
			for(SitePattern sp2 : vap2.getSitePatterns().getSitePatterns()) {
				if(sp2 == null) continue;
				
				if((sp2 instanceof SingleSitePattern)) {
					SingleSitePattern ssp2 = (SingleSitePattern) sp2;
					LinkState ls2 = ssp2.getLinkState().getLinkState();
					if(!boundLinksEqual(ls1, ls2)) continue;
					agentTemplates.get(vap).addReference(ssp.getSite(), agentTemplates.get(vap2));
					return;
				}else {
					MultiLinkSitePattern msp2 = (MultiLinkSitePattern) sp2;
					if(!(msp2.getLinkState().getLinkState() instanceof MultiLink)) continue;
					MultiLink mls = (MultiLink)msp2.getLinkState().getLinkState();
					for(LinkState ls3 : mls.getStates()) {
						if(!boundLinksEqual(ls1, ls3)) continue;
						agentTemplates.get(vap).addReference(ssp.getSite(), agentTemplates.get(vap2));
						return;
					}
				}

			}
		}
	}
	
	
	
	private void findReferenceMultiSite(ValidAgentPattern vap, MultiLinkSitePattern msp) {
		LinkState ls = msp.getLinkState().getLinkState();
		if(ls == null) return;
		if(!(ls instanceof MultiLink)) return;
		
		MultiLink mls1 = (MultiLink) ls;
		for(LinkState ls1 : mls1.getStates()) {
			for(ValidAgentPattern vap2 : agentPatterns) {
				if(vap == vap2) continue;
				
				for(SitePattern sp2 : vap2.getSitePatterns().getSitePatterns()) {
					if(sp2 == null) continue;
					
					if((sp2 instanceof SingleSitePattern)) {
						SingleSitePattern ssp2 = (SingleSitePattern) sp2;
						LinkState ls2 = ssp2.getLinkState().getLinkState();
						if(!boundLinksEqual(ls1, ls2)) continue;
						agentTemplates.get(vap).addReference(msp.getSite(), agentTemplates.get(vap2));
						break;
					}else {
						MultiLinkSitePattern msp2 = (MultiLinkSitePattern) sp2;
						if(!(msp2.getLinkState().getLinkState() instanceof MultiLink)) continue;
						MultiLink mls = (MultiLink)msp2.getLinkState().getLinkState();
						for(LinkState ls3 : mls.getStates()) {
							if(!boundLinksEqual(ls1, ls3)) continue;
							agentTemplates.get(vap).addReference(msp.getSite(), agentTemplates.get(vap2));
							break;
						}
					}

				}
			}
		}
		
		
		
	}
	
	private boolean boundLinksEqual(LinkState ls1, LinkState ls2) {
		if(ls1 == null) return false;
		if(ls2 == null) return false;
		if(!(ls1 instanceof BoundLink)) return false;
		if(!(ls2 instanceof BoundLink)) return false;
		BoundLink bl1 = (BoundLink)ls1;
		BoundLink bl2 = (BoundLink)ls2;
		int idx1 = Integer.valueOf(bl1.getState());
		int idx2 = Integer.valueOf(bl2.getState());
		return idx1 == idx2;
		
	}
	
	public Collection<Agent> createInstances(int amount) {
		Collection<Agent> instances = new LinkedList<Agent>();
		Map<AgentTemplate, Agent> tempInstances = new HashMap<AgentTemplate, Agent>();
		for(AgentTemplate template : agentTemplates.values()) {
			tempInstances.put(template, null);
		}
		for(;amount>0;amount--) {
			
			for(AgentTemplate template : agentTemplates.values()) {
				Agent agent = agentFactory.getEObjectFactory().createObject(template.getAgentClassName());
				template.setStates(agent);
				tempInstances.replace(template, agent);
			}
			
			for(AgentTemplate template : agentTemplates.values()) {
				template.setReferences(tempInstances.get(template), tempInstances);
			}
			
			instances.addAll(tempInstances.values());
			
		}
		
		return instances;
	}
	
	
}
