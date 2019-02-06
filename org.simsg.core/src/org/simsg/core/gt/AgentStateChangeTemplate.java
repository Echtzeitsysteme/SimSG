package org.simsg.core.gt;

import org.eclipse.emf.ecore.EReference;
import org.simsg.container.Agent;
import org.simsg.container.State;
import org.simsg.core.pm.match.IMatch;

public class AgentStateChangeTemplate {
	private String nodeLabel;
	private EReference oldRef;
	private EReference newRef;
	private State targetState;
	
	public AgentStateChangeTemplate(String nodeLabel, EReference oldRef, EReference newRef, State targetState) {
		this.nodeLabel = nodeLabel;
		this.oldRef = oldRef;
		this.newRef = newRef;
		this.targetState = targetState;
	}
	
	public void applyStateChangeCandidate(IMatch match) {
		Agent agent = (Agent) match.get(nodeLabel);
		agent.eSet(oldRef, null);
		agent.eSet(newRef, targetState);
	}
	
}
