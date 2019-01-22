package org.simsg.core.pm.pattern;

import java.util.Objects;

import org.eclipse.emf.ecore.EAttribute;
import org.simsg.container.util.EPackageWrapper;
import org.simsg.simsgl.simSGL.AttributeOperand;
import org.simsg.simsgl.simSGL.AttributeOperandGeneric;
import org.simsg.simsgl.simSGL.ValidAgentPattern;

public class AttributeContext {
	
	private AgentNodeContext owningAgentNode;
	private EAttribute attribute;
	private String attributeName;
	private String attributeVariableName;
	
	public AttributeContext(AgentNodeContext owningAgent, AttributeOperand operand, EPackageWrapper metaModel) {
		this.owningAgentNode = owningAgent;
		if(operand instanceof AttributeOperandGeneric) {
			AttributeOperandGeneric aog = (AttributeOperandGeneric)operand;
			ValidAgentPattern vap = (ValidAgentPattern)operand.getAgent().eContainer();
			attributeName = org.simsg.container.util.AgentClassFactory.createAttributeName(vap.getAgent(), aog.getAttribute().getAttribute());
			attribute = metaModel.getEAttribute(attributeName);
		}else {
			attribute = org.simsg.container.ContainerPackage.Literals.AGENT__ID;
			attributeName = attribute.getName();
		}
		attributeVariableName = owningAgent.getAgentVariableName()+"_"+attributeName;
	}
	
	public AgentNodeContext getOwningAgentNode() {
		return owningAgentNode;
	}
	
	public EAttribute getAttribute() {
		return attribute;
	}
	
	public String getAttributeName() {
		return attributeName;
	}
	
	public String getAttributeVariableName() {
		return attributeVariableName;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(owningAgentNode, attribute);
	}
	
	@Override
	public boolean equals(Object arg0) {
		if(!(arg0 instanceof AttributeContext)) return false;
		AttributeContext other = (AttributeContext)arg0;
		return (attribute == other.attribute) && (owningAgentNode == other.getOwningAgentNode());
	}
}
