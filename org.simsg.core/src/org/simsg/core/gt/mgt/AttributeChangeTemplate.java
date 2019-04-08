package org.simsg.core.gt.mgt;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.DoubleSupplier;

import org.eclipse.emf.ecore.EAttribute;
import org.simsg.container.Agent;
import org.simsg.container.ContainerPackage;
import org.simsg.container.util.AgentClassFactory;
import org.simsg.container.util.EPackageWrapper;
import org.simsg.core.pm.match.IMatch;
import org.simsg.core.pm.pattern.arithmetic.OperatorType;
import org.simsg.simsgl.simSGL.AbsoluteOperation;
import org.simsg.simsgl.simSGL.AttributeOperandGeneric;
import org.simsg.simsgl.simSGL.AttributeOperandId;
import org.simsg.simsgl.simSGL.NumericAssignment;
import org.simsg.simsgl.simSGL.Operation;
import org.simsg.simsgl.simSGL.OperationLeft;
import org.simsg.simsgl.simSGL.OperationRight;
import org.simsg.simsgl.simSGL.SquareRootOperation;
import org.simsg.simsgl.simSGL.BraceOperation;
import org.simsg.simsgl.simSGL.UnaryOperation;
import org.simsg.simsgl.simSGL.ValidAgentPattern;
import org.simsg.simsgl.utils.PatternUtils;

public class AttributeChangeTemplate {
	
	private String nodeLabel;
	private boolean nodeInMatch = true;
	private ValidAgentPattern nodePattern;
	private EAttribute targetAttribute;
	EPackageWrapper metaModel;
	private Map<ValidAgentPattern, String> vapToLabel;
	private Map<String, Map<String, Object>> labelToAttributeValues = new HashMap<>();
	private Map<String, Map<String, EAttribute>> labelToAttributes = new HashMap<>();
	
	private DoubleSupplier calculate;
	
	public AttributeChangeTemplate(String nodeLabel, EAttribute targetAttribute, Map<ValidAgentPattern, String> vapToLabel, EPackageWrapper metaModel) {
		this.nodeLabel = nodeLabel;
		this.targetAttribute = targetAttribute;
		this.vapToLabel = vapToLabel;
		this.metaModel = metaModel;
	}
	
	public void setAgentNotInMatch(ValidAgentPattern agent) {
		nodePattern = agent;
		nodeInMatch = false;
	}
	
	public void applyAttributeChange(IMatch match, Map<ValidAgentPattern, Agent> createdAgents) {
		Agent agent = null;
		if(nodeInMatch) {
			agent = (Agent) match.get(nodeLabel);
		} else {
			agent = createdAgents.get(nodePattern);
		}
		for(String label : labelToAttributes.keySet()) {
			for(Entry<String, EAttribute> pair : labelToAttributes.get(label).entrySet()) {
				Agent currentAgent = (Agent) match.get(label);
				labelToAttributeValues.get(label).replace(pair.getKey(), currentAgent.eGet(pair.getValue()));
			}
		}
		
		double value = calculate.getAsDouble();
		agent.eSet(targetAttribute, value);
	}
	
	public void setOperation(Operation operation) {
		if(operation instanceof UnaryOperation) {
			calculate = createUnaryOperator((UnaryOperation) operation);
		}
		calculate = createOperator((OperationLeft) operation);
	}
	
	private DoubleSupplier createUnaryOperator(UnaryOperation uOp) {
		if(uOp.getOperation() instanceof AbsoluteOperation) {
			Operation child = ((AbsoluteOperation)uOp.getOperation()).getOperation();
			return () -> Math.abs(createOperator((OperationLeft)child).getAsDouble());
		}else if (uOp.getOperation() instanceof SquareRootOperation) {
			Operation child = ((SquareRootOperation)uOp.getOperation()).getOperation();
			return () -> Math.sqrt(createOperator((OperationLeft)child).getAsDouble());
		}else {
			Operation child = ((BraceOperation)uOp.getOperation()).getOperation();
			return createOperator((OperationLeft)child);
		}
	}
		
	private DoubleSupplier createBinaryOperator(UnaryOperation uOp, OperationRight operation2) {
		OperatorType type = OperatorType.opTypeFromOperator(operation2.getOperator());
		return createArithmeticFunction(type, createUnaryOperator(uOp), createOperator(operation2));
	}
	
	private DoubleSupplier createBinaryOperator(AttributeOperandGeneric attribute, OperationRight operation2) {	
		OperatorType type = OperatorType.opTypeFromOperator(operation2.getOperator());
		return createArithmeticFunction(type, createAttributeOperand(attribute), createOperator(operation2));
	}
	
	private DoubleSupplier createBinaryOperator(AttributeOperandId attribute, OperationRight operation2) {
		OperatorType type = OperatorType.opTypeFromOperator(operation2.getOperator());
		return createArithmeticFunction(type, createAttributeOperand(attribute), createOperator(operation2));
	}
	
	private DoubleSupplier createBinaryOperator(NumericAssignment numeric, OperationRight operation2) {
		OperatorType type = OperatorType.opTypeFromOperator(operation2.getOperator());
		return createArithmeticFunction(type, createNumericOperand(numeric), createOperator(operation2));
	}
	
	private DoubleSupplier createOperator(OperationRight opR) {
		if(opR.getRight() instanceof AttributeOperandGeneric) {
			return createAttributeOperand((AttributeOperandGeneric)opR.getRight());
		}else if(opR.getRight() instanceof AttributeOperandGeneric) {
			return createAttributeOperand((AttributeOperandId)opR.getRight());
		}else if(opR.getRight() instanceof NumericAssignment) {
			return createNumericOperand((NumericAssignment) opR.getRight());
		} else {
			return createOperator((OperationLeft)opR.getRight());
		}
	}
	
	private DoubleSupplier createOperator(OperationLeft opL) {
		if( opL.getLeft() instanceof AttributeOperandGeneric ) {
			if(opL.getRight() == null) {
				// return attribute value
				return createAttributeOperand((AttributeOperandGeneric)opL.getLeft());
			}else {
				// traverse deeper -> opL.getRight()
				return createBinaryOperator((AttributeOperandGeneric)opL.getLeft(), (OperationRight)opL.getRight());
			}
		}
		else if( opL.getLeft() instanceof AttributeOperandId ) {
			if(opL.getRight() == null) {
				return createAttributeOperand((AttributeOperandId)opL);
			}else {
				// traverse deeper -> opL.getRight()
				return createBinaryOperator((AttributeOperandId)opL.getLeft(), (OperationRight)opL.getRight());
			}
		}
		
		else if( opL.getLeft() instanceof NumericAssignment) {
			if(opL.getRight() == null) {
				return createNumericOperand((NumericAssignment) opL.getLeft());
			}else {
				// traverse deeper -> opL.getRight()
				return createBinaryOperator((NumericAssignment) opL.getLeft(), (OperationRight)opL.getRight());
			}
		}else {
			UnaryOperation uOp = (UnaryOperation) opL.getLeft();
			if(opL.getRight() == null) {
				return createUnaryOperator(uOp);
			}else {
				// traverse deeper -> opL.getRight()
				return createBinaryOperator(uOp, (OperationRight)opL.getRight());
			}
		}			
			
	}
	
	private DoubleSupplier createArithmeticFunction(OperatorType type, DoubleSupplier operand1, DoubleSupplier operand2) {
		switch(type) {
			case plus: {
				return () -> operand1.getAsDouble() + operand2.getAsDouble();
			}
			case minus: {
				return () -> operand1.getAsDouble() - operand2.getAsDouble();
			}
			case mult: {
				return () -> operand1.getAsDouble() * operand2.getAsDouble();
			}
			case pow: {
				return () -> Math.pow( operand1.getAsDouble(), operand2.getAsDouble());
			}
		default:
			return null;
		}
	}
	
	private DoubleSupplier createNumericOperand(NumericAssignment numeric) {
		double value = PatternUtils.valueOfNumericAssignment(numeric);
		return () -> {
			return value;
		};
	}
	
	private DoubleSupplier createAttributeOperand(AttributeOperandGeneric attribute) {
		ValidAgentPattern vap = (ValidAgentPattern)attribute.getAgent().eContainer();
		String otherLabel = vapToLabel.get(vap);
		String attributeName = AgentClassFactory.createAttributeName(vap.getAgent(), attribute.getAttribute().getAttribute());
		EAttribute eAttribute = metaModel.getEAttribute(attributeName);
		addToLabelToAttributes(otherLabel, attributeName, eAttribute);
		return () -> {
			Map<String, Object> attributeValues = labelToAttributeValues.get(otherLabel);
			return (double)attributeValues.get(attributeName);
		};	
	}
	
	private DoubleSupplier createAttributeOperand(AttributeOperandId attribute) {
		ValidAgentPattern vap = (ValidAgentPattern)attribute.getAgent().eContainer();
		String label = vapToLabel.get(vap);
		String attributeName = ContainerPackage.Literals.AGENT__ID.getName();
		EAttribute eAttribute = ContainerPackage.Literals.AGENT__ID;
		addToLabelToAttributes(label, attributeName, eAttribute);
		return () -> {
			Map<String, Object> attributeValues = labelToAttributeValues.get(label);
			return (double)attributeValues.get(attributeName);
		};
	}
	
	private void addToLabelToAttributes(String label, String attributeName, EAttribute attribute) {
		Map<String, EAttribute> agentAttributes = labelToAttributes.get(label);
		Map<String, Object> attributeValues = labelToAttributeValues.get(label);
		if(agentAttributes == null) {
			agentAttributes = new HashMap<String, EAttribute>();
			labelToAttributes.put(label, agentAttributes);
			
			attributeValues = new HashMap<String, Object>();
			labelToAttributeValues.put(label, attributeValues);
		}
		agentAttributes.put(attributeName, attribute);
		attributeValues.put(attributeName, 0.0);
	}

	
}
