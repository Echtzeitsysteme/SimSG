package biochemsimulation.reactioncontainer.generator;

import java.util.HashMap;
import java.util.Map;

import biochemsimulation.reactioncontainer.util.AgentClassReferenceFactory;
import biochemsimulation.reactioncontainer.util.StateClassReferenceFactory;
import biochemsimulation.reactionrules.reactionRules.Agent;
import biochemsimulation.reactionrules.reactionRules.Site;
import biochemsimulation.reactionrules.reactionRules.State;

public class AgentTemplate {
	
	private Agent agent;
	Map<String, biochemsimulation.reactioncontainer.State> stateInstances;
	private String agentClassName;
	private Map<String, String> stateReferences;
	private Map<String, AgentTemplate> agentReferences; 
	
	public AgentTemplate(Agent agent, Map<String, biochemsimulation.reactioncontainer.State> stateInstances) {
		this.agent = agent;
		this.stateInstances = stateInstances;
		agentClassName = agent.getName();
		
		createStateReferences();
		agentReferences = new HashMap<String, AgentTemplate>();
	}
	
	private void createStateReferences() {
		stateReferences = new HashMap<String, String>();
		
		for(Site site : agent.getSites().getSites()) {
			if(site.getStates().getState().size() > 0) {
				for(State state : site.getStates().getState()) {
					stateReferences.put(StateClassReferenceFactory.createReferenceName(agent, site, state), state.getName());
				}
			}
		}
	}
	
	public void defineReference(Site site, AgentTemplate other) {
		agentReferences.put(AgentClassReferenceFactory.createReferenceName(agent, site), other);
	}
	
	public void setStates(biochemsimulation.reactioncontainer.Agent thisAgent) {
		for(String refName : stateReferences.keySet()) {
			
		}
	}
	
	public void setReferences(biochemsimulation.reactioncontainer.Agent thisAgent, Map<AgentTemplate, biochemsimulation.reactioncontainer.Agent> tempInstances) {
		for(String refName : agentReferences.keySet()) {
			biochemsimulation.reactioncontainer.Agent otherAgent = tempInstances.get(agentReferences.get(refName));
			// set Reference to other agent
		}
	}
	
	public String getAgentClassName() {
		return agentClassName;
	}
	
}
