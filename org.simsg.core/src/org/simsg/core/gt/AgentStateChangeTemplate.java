package org.simsg.core.gt;

import org.eclipse.emf.ecore.EReference;
import org.simsg.container.Agent;
import org.simsg.container.State;
import org.simsg.core.pm.match.IMatch;

public class AgentStateChangeTemplate {
	private int agentIndex;
	EReference oldRef;
	EReference newRef;
	State targetState;
	
	public AgentStateChangeTemplate(int agentIndex, EReference oldRef, EReference newRef, State targetState) {
		this.agentIndex = agentIndex;
		this.oldRef = oldRef;
		this.newRef = newRef;
		this.targetState = targetState;
	}
	
	public void applyStateChangeCandidate(IMatch match) {
		Agent agent = (Agent) match.get(match.parameterNames().get(agentIndex));
		agent.eSet(oldRef, null);
		agent.eSet(newRef, targetState);
	}
	
}
