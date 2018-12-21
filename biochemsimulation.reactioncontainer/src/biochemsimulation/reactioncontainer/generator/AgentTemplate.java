package biochemsimulation.reactioncontainer.generator;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import biochemsimulation.reactioncontainer.util.AgentClassFactory;
import biochemsimulation.reactioncontainer.util.StateClassFactory;
import biochemsimulation.reactionrules.reactionRules.Agent;
import biochemsimulation.reactionrules.reactionRules.Site;
import biochemsimulation.reactionrules.reactionRules.State;

public class AgentTemplate {

	Map<String, biochemsimulation.reactioncontainer.State> stateInstances;
	AgentClassFactory agentFactory;
	StateClassFactory stateFactory;
	
	private String agentClassName;
	private Map<String, String> stateReferences;
	private Map<String, AgentTemplate> agentReferences; 
	
	public AgentTemplate(Agent agent, AgentClassFactory agentFactory, 
			StateClassFactory stateFactory, Map<String, biochemsimulation.reactioncontainer.State> stateInstances) {

		this.stateInstances = stateInstances;
		this.agentFactory = agentFactory;
		this.stateFactory = stateFactory;
		
		agentClassName = agent.getName();
		agentReferences = new HashMap<String, AgentTemplate>();
		stateReferences = new HashMap<String, String>();
	}
	
	public void defineState(Site site, State state) {
		stateReferences.put(StateClassFactory
				.createCombinedClassName(agentClassName, site.getName(), state.getName())
				, state.getName());
	}
	
	public void defineReference(Site site, AgentTemplate other) {
		agentReferences.put(AgentClassFactory
				.createCombinedClassName(agentClassName, site.getName())
				, other);
	}
	
	public void setStates(biochemsimulation.reactioncontainer.Agent thisAgent) {
		for(String refName : stateReferences.keySet()) {
			EReference ref = stateFactory.getEClassRegistry().getRegisteredReference(refName);
			EObject state = stateInstances.get(stateReferences.get(refName));
			thisAgent.eSet(ref, state);
		}
	}
	
	public void setReferences(biochemsimulation.reactioncontainer.Agent thisAgent, Map<AgentTemplate, biochemsimulation.reactioncontainer.Agent> tempInstances) {
		for(String refName : agentReferences.keySet()) {
			biochemsimulation.reactioncontainer.Agent otherAgent = tempInstances.get(agentReferences.get(refName));
			EReference ref = agentFactory.getEClassRegistry().getRegisteredReference(refName);
			thisAgent.eSet(ref, otherAgent);
		}
	}
	
	public String getAgentClassName() {
		return agentClassName;
	}
	
}
