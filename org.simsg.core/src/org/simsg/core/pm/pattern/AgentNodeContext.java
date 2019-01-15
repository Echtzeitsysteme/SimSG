package org.simsg.core.pm.pattern;

import org.eclipse.emf.ecore.EClass;

public class AgentNodeContext {
	
	private String patternName;
	private String agentVariableName;
	
	private EClass agentType;
	private boolean local;
	
	public AgentNodeContext(String patternName, String agentVariableName, EClass agentType) {
		this.patternName = patternName;
		this.agentVariableName = agentVariableName;
		this.agentType = agentType;
		local = false;
	}
	
	public String getAgentTypeName() {
		return agentType.getName();
	}
	
	public EClass getAgentType() {
		return agentType;
	}

	public String getAgentVariableName() {
		return agentVariableName;
	}
	
	public void setLocal() {
		local = true;
	}
	
	public boolean isLocal() {
		return local;
	}
	
	public String getPatternName() {
		return patternName;
	}
	
}
