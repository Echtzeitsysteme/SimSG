package biochemsimulation.reactioncontainer.generator;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import biochemsimulation.reactioncontainer.Agent;
import biochemsimulation.reactioncontainer.State;
import biochemsimulation.reactioncontainer.util.AgentFactory;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;
import biochemsimulation.reactionrules.utils.PatternUtils;

public class InitializationTemplate {

	List<ValidAgentPattern> agentPatterns;
	AgentFactory factory;
	Map<String, State> stateInstances;
	Map<ValidAgentPattern, AgentTemplate> agentTemplates;
	
	public InitializationTemplate(Pattern pattern, AgentFactory factory, Map<String, State> stateInstances) {
		agentPatterns = PatternUtils.getValidAgentPatterns(pattern.getAgentPatterns());
		this.factory = factory;
		this.stateInstances = stateInstances;
		createAgentTemplates();
		findReferences();
	}
	
	private void createAgentTemplates() {
		agentTemplates = new HashMap<ValidAgentPattern, AgentTemplate>();
		for(ValidAgentPattern vap : agentPatterns) {
			agentTemplates.put(vap, new AgentTemplate(vap.getAgent(), stateInstances));
		}
	}
	
	private void findReferences() {
		for(ValidAgentPattern vap : agentPatterns) {
			for(SitePattern sp : vap.getSitePatterns().getSitePatterns()) {
				if(sp == null) continue;
				
				LinkState ls1 = sp.getLinkState();
				if(ls1 == null) continue;
				if(!(ls1 instanceof BoundLink)) continue;
				
				BoundLink bl1 = (BoundLink)ls1;
				int idx1 = Integer.valueOf(bl1.getState());
				
				for(ValidAgentPattern vap2 : agentPatterns) {
					if(vap == vap2) continue;
					
					for(SitePattern sp2 : vap2.getSitePatterns().getSitePatterns()) {
						if(sp2 == null) continue;
						
						LinkState ls2 = sp2.getLinkState();
						if(ls2 == null) continue;
						if(!(ls2 instanceof BoundLink)) continue;
						
						BoundLink bl2 = (BoundLink)ls2;
						int idx2 = Integer.valueOf(bl2.getState());
						if(idx1 != idx2) continue;
						agentTemplates.get(vap).defineReference(sp.getSite(), agentTemplates.get(vap2));
						
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
				Agent agent = factory.createAgent(template.getAgentClassName());
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
