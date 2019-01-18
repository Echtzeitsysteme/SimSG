package org.simsg.container.generator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.simsg.container.util.AgentClassFactory;
import org.simsg.container.util.StateClassFactory;

import org.simsg.simsgl.simSGL.Agent;
import org.simsg.simsgl.simSGL.Attribute;
import org.simsg.simsgl.simSGL.Site;
import org.simsg.simsgl.simSGL.State;

public class AgentTemplate {

	Map<String, org.simsg.container.State> stateInstances;
	AgentClassFactory agentFactory;
	StateClassFactory stateFactory;
	
	private String agentClassName;
	private Map<String, Object> attributeValues;
	private Map<String, String> stateReferences;
	private Map<String, String> siteStateReferences;
	private Map<String, List<AgentTemplate>> agentReferences; 
	
	public AgentTemplate(Agent agent, AgentClassFactory agentFactory, 
			StateClassFactory stateFactory, Map<String, org.simsg.container.State> stateInstances) {

		this.stateInstances = stateInstances;
		this.agentFactory = agentFactory;
		this.stateFactory = stateFactory;
		
		agentClassName = agent.getName();
		attributeValues = new HashMap<String, Object>();
		agentReferences = new HashMap<String, List<AgentTemplate>>();
		stateReferences = new HashMap<String, String>();
		siteStateReferences = new HashMap<String, String>();
	}
	
	public void defineAttribute(Attribute attribute, Object value) {
		attributeValues.put(AgentClassFactory
				.createCombinedClassName(agentClassName, attribute.getName())
				, value);
	}
	
	public void defineState(State state) {
		stateReferences.put(StateClassFactory
				.createCombinedClassName(agentClassName, state.getName())
				, state.getName());
	}
	
	public void defineSiteState(Site site, State state) {
		siteStateReferences.put(StateClassFactory
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
	
	public void setAttributes(org.simsg.container.Agent thisAgent) {
		for(String attributeName : attributeValues.keySet()) {
			EAttribute attribute = agentFactory.getEClassRegistry().getRegisteredAttribute(attributeName);
			thisAgent.eSet(attribute, attributeValues.get(attributeName));
		}
	}
	
	public void setStates(org.simsg.container.Agent thisAgent) {
		for(String refName : siteStateReferences.keySet()) {
			EReference ref = stateFactory.getEClassRegistry().getRegisteredReference(refName);
			EObject state = stateInstances.get(siteStateReferences.get(refName));
			thisAgent.eSet(ref, state);
		}
		
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
