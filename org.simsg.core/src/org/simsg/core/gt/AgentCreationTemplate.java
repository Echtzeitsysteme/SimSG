package org.simsg.core.gt;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EReference;

import org.simsg.container.Agent;
import org.simsg.container.Container;
import org.simsg.container.State;
import org.simsg.container.util.AgentFactory;

import org.simsg.simsgl.simSGL.ValidAgentPattern;
import org.simsg.simsgl.simSGL.Site;

public class AgentCreationTemplate {
	private ValidAgentPattern vap;
	private String type;
	private EReference stateRef;
	private State state;
	boolean hasState = false;
	private Map<Site, Entry<EReference, State>> states = new HashMap<>();
	
	public AgentCreationTemplate(ValidAgentPattern vap){
		this.vap = vap;
		this.type = vap.getAgent().getName();
	}
	
	public void setAgentState(EReference stateRef, State state) {
		hasState = true;
		this.stateRef = stateRef;
		this.state = state;
	}
	
	public void addSiteState(Site site, EReference stateRef, State state) {
		states.put(site, new AbstractMap.SimpleEntry<EReference, State>(stateRef, state));
	}
	
	public Agent createAgentFromTemplate(AgentFactory factory, Container reactionContainer) {
		Agent agent = factory.createObject(type);
		reactionContainer.getAgents().add(agent);
		agent.eSet(stateRef, state);
		for(Entry<EReference, State> entry : states.values()) {
			agent.eSet(entry.getKey(), entry.getValue());
		}
		return agent;
	}
	
	public ValidAgentPattern getValidAgentPattern() {
		return vap;
	}
	
	
}