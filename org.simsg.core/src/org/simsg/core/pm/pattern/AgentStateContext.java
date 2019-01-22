package org.simsg.core.pm.pattern;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;

public class AgentStateContext {
	
	private AgentNodeContext agentNodeContext;
	
	private EReference stateReference;
	private EClassifier stateReferenceType;
	
	private EClass stateType;
	
	public AgentStateContext(AgentNodeContext agentNodeContext, EReference stateReference, EClass stateType) {
		this.agentNodeContext = agentNodeContext;
		this.stateReference = stateReference;
		this.stateReferenceType = stateReference.getEType();
		this.stateType = stateType;
	}
	
	public String getStateReferenceName() {
		return stateReference.getName();
	}
	
	public EReference getStateReference() {
		return stateReference;
	}
	
	public EClassifier getStateReferenceType() {
		return stateReferenceType;
	}
	
	public String getStateTypeName() {
		return stateType.getName();
	}
	
	public EClass getStateType() {
		return stateType;
	}
	
	public AgentNodeContext getAgentNodeContext() {
		return agentNodeContext;
	}
	
	public String getSourceAgentTypeName() {
		return agentNodeContext.getAgentTypeName();
	}
	
	public String getSourceAgentVariableName() {
		return agentNodeContext.getAgentVariableName();
	}
}
