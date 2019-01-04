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
				// ignore multi-link site patterns for now
				if(!(sp instanceof SingleSitePattern)) continue;
				SingleSitePattern ssp = (SingleSitePattern) sp;
				states.replace(ssp.getSite(), sp.getState().getState());
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
				// ignore multi-link site patterns for now
				if(!(sp instanceof SingleSitePattern)) continue;
				SingleSitePattern ssp = (SingleSitePattern) sp;
				
				LinkState ls1 = ssp.getLinkState().getLinkState();
				if(ls1 == null) continue;
				if(!(ls1 instanceof BoundLink)) continue;
				
				BoundLink bl1 = (BoundLink)ls1;
				int idx1 = Integer.valueOf(bl1.getState());
				
				for(ValidAgentPattern vap2 : agentPatterns) {
					if(vap == vap2) continue;
					
					for(SitePattern sp2 : vap2.getSitePatterns().getSitePatterns()) {
						if(sp2 == null) continue;
						// ignore multi-link site patterns for now
						if(!(sp2 instanceof SingleSitePattern)) continue;
						SingleSitePattern ssp2 = (SingleSitePattern) sp2;
						
						LinkState ls2 = ssp2.getLinkState().getLinkState();
						if(ls2 == null) continue;
						if(!(ls2 instanceof BoundLink)) continue;
						
						BoundLink bl2 = (BoundLink)ls2;
						int idx2 = Integer.valueOf(bl2.getState());
						if(idx1 != idx2) continue;
						agentTemplates.get(vap).defineReference(ssp.getSite(), agentTemplates.get(vap2));
						
					}
				}
				
			}
		}
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
