package org.simsg.container.generator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.simsg.container.util.AgentClassFactory;
import org.simsg.container.util.StateClassFactory;

import org.simsg.simsgl.simSGL.Agent;
import org.simsg.simsgl.simSGL.Site;
import org.simsg.simsgl.simSGL.State;

public class AgentTemplate {

	Map<String, org.simsg.container.State> stateInstances;
	AgentClassFactory agentFactory;
	StateClassFactory stateFactory;
	
	private String agentClassName;
	private Map<String, String> stateReferences;
	private Map<String, List<AgentTemplate>> agentReferences; 
	
	public AgentTemplate(Agent agent, AgentClassFactory agentFactory, 
			StateClassFactory stateFactory, Map<String, org.simsg.container.State> stateInstances) {

		this.stateInstances = stateInstances;
		this.agentFactory = agentFactory;
		this.stateFactory = stateFactory;
		
		agentClassName = agent.getName();
		agentReferences = new HashMap<String, List<AgentTemplate>>();
		stateReferences = new HashMap<String, String>();
	}
	
	public void defineState(Site site, State state) {
		stateReferences.put(StateClassFactory
				.createCombinedClassName(agentClassName, site.getName(), state.getName())
				, state.getName());
	}
	
	public void addReference(Site site, AgentTemplate other) {
		List<AgentTemplate> templates = agentReferences.get(AgentClassFactory.createCombinedClassName(agentClassName, site.getName()));
		if(templates == null) {
			templates = new LinkedList<AgentTemplate>();
			agentReferences.put(AgentClassFactory
					.createCombinedClassName(agentClassName, site.getName())
					, templates);
		}
		templates.add(other);
	}
	
	public void setStates(org.simsg.container.Agent thisAgent) {
		for(String refName : stateReferences.keySet()) {
			EReference ref = stateFactory.getEClassRegistry().getRegisteredReference(refName);
			EObject state = stateInstances.get(stateReferences.get(refName));
			thisAgent.eSet(ref, state);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void setReferences(org.simsg.container.Agent thisAgent, Map<AgentTemplate, org.simsg.container.Agent> tempInstances) {
		for(String refName : agentReferences.keySet()) {
			List<AgentTemplate> otherTemplates = agentReferences.get(refName);
			EReference ref = agentFactory.getEClassRegistry().getRegisteredReference(refName);
			if(ref.getUpperBound() != EStructuralFeature.UNBOUNDED_MULTIPLICITY) {
				org.simsg.container.Agent otherAgent = tempInstances.get(otherTemplates.get(0));
				thisAgent.eSet(ref, otherAgent);
			}else {
				for(AgentTemplate template : otherTemplates) {
					org.simsg.container.Agent otherAgent = tempInstances.get(template);
					((List<org.simsg.container.Agent>) thisAgent.eGet(ref)).add(otherAgent);
				}
				
			}
			
		}
	}
	
	public String getAgentClassName() {
		return agentClassName;
	}
	
}
