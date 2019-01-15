package org.simsg.core.gt;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EReference;
import org.simsg.container.Agent;
import org.simsg.container.State;
import org.simsg.core.pm.match.IMatch;

public class StateChangeTemplate {
	private int agentIndex;
	private Map<Entry<EReference, EReference>, State> stateRefMap;
	
	public StateChangeTemplate (int agentIndex){
		this.agentIndex = agentIndex;
		stateRefMap = new LinkedHashMap<Entry<EReference, EReference>, State>();
	}
	
	public void addStateChangeCandidate(EReference oldRef, EReference newRef, State targetState) {
		stateRefMap.put(new AbstractMap.SimpleEntry<EReference, EReference>(oldRef, newRef), targetState);
	}
	
	public void applyStateChangeCandidates(IMatch match) {
		Agent agent = (Agent) match.get(match.parameterNames().get(agentIndex));
		for(Entry<Entry<EReference, EReference>, State> entry : stateRefMap.entrySet()) {
			agent.eSet(entry.getKey().getKey(), null);
			agent.eSet(entry.getKey().getValue(), entry.getValue());
		}
	}
	
	public boolean isEmpty() {
		return stateRefMap.size() == 0;
	}
}
