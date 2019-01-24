package org.simsg.core.gt;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

import org.eclipse.emf.ecore.EAttribute;
import org.simsg.container.Agent;
import org.simsg.container.ContainerPackage;
import org.simsg.container.util.AgentClassFactory;
import org.simsg.container.util.EPackageWrapper;
import org.simsg.core.pm.match.IMatch;
import org.simsg.core.pm.pattern.AttributeContext;
import org.simsg.core.pm.pattern.arithmetic.OperandValue;
import org.simsg.core.pm.pattern.arithmetic.OperandVariable;
import org.simsg.core.pm.pattern.arithmetic.OperationComponent;
import org.simsg.core.pm.pattern.arithmetic.OperatorBinary;
import org.simsg.core.pm.pattern.arithmetic.OperatorUnary;
import org.simsg.simsgl.simSGL.AbsoluteOperation;
import org.simsg.simsgl.simSGL.Attribute;
import org.simsg.simsgl.simSGL.AttributeOperand;
import org.simsg.simsgl.simSGL.AttributeOperandGeneric;
import org.simsg.simsgl.simSGL.AttributeOperandId;
import org.simsg.simsgl.simSGL.NumericAssignment;
import org.simsg.simsgl.simSGL.Operation;
import org.simsg.simsgl.simSGL.OperationLeft;
import org.simsg.simsgl.simSGL.OperationRight;
import org.simsg.simsgl.simSGL.SquareRootOperation;
import org.simsg.simsgl.simSGL.UnaryOperation;
import org.simsg.simsgl.simSGL.ValidAgentPattern;

public class AttributeChangeTemplate {
	
	private int targetIndex;
	private EAttribute targetAttribute;
	EPackageWrapper metaModel;
	private Map<ValidAgentPattern, Integer> vapToIndex;
	private Map<Integer, Map<String, Object>> indexToAttributeValues;
	private Map<Integer, Map<String, EAttribute>> indexToAttributes;
	private int [] sourceValues;
	
	private DoubleSupplier calculate;
	
	
	public AttributeChangeTemplate(int agentIndex, EAttribute targetAttribute, EPackageWrapper metaModel) {
		this.targetIndex = agentIndex;
		this.targetAttribute = targetAttribute;
		this.metaModel = metaModel;
	}
	
	public void setOperation(Operation operation) {
		
		if(operation instanceof UnaryOperation) {
			UnaryOperation uOp = (UnaryOperation) operation;
			Operation child = null;
			if(uOp.getOperation() instanceof AbsoluteOperation) {
				child = ((AbsoluteOperation)uOp.getOperation()).getOperation();
			}else {
				child = ((SquareRootOperation)uOp.getOperation()).getOperation();
			}
			calculate = () -> createUnaryOperator(uOp).getAsDouble();
		}
		calculate = () ->  createOperator(operation).getAsDouble();
	}
	
	public void applyAttributeChange(IMatch match) {
		Agent agent = (Agent) match.get(match.parameterNames().get(targetIndex));
		double value = calculate.getAsDouble();
		agent.eSet(targetAttribute, value);
	}
	
	private DoubleSupplier createUnaryOperator(UnaryOperation uOp) {
		if(uOp.getOperation() instanceof AbsoluteOperation) {
			Operation child = ((AbsoluteOperation)uOp.getOperation()).getOperation();
			return () -> Math.abs(createOperator(child).getAsDouble());
		}else {
			Operation child = ((SquareRootOperation)uOp.getOperation()).getOperation();
			return () -> Math.sqrt(createOperator(child).getAsDouble());
		}
	}
	
	private DoubleSupplier createOperator(Operation operation) {
		if(operation instanceof OperationLeft) {
			OperationLeft opL = (OperationLeft) operation;
			if( opL.getLeft() instanceof AttributeOperandGeneric ) {
				AttributeOperandGeneric attribute = (AttributeOperandGeneric) opL.getLeft();
				ValidAgentPattern vap = (ValidAgentPattern)attribute.getAgent().eContainer();
				int index = vapToIndex.get(vap);
				String attributeName = AgentClassFactory.createAttributeName(vap.getAgent(), attribute.getAttribute().getAttribute());
				EAttribute eAttribute = metaModel.getEAttribute(attributeName);
				addToIndexToAttributes(index, attributeName, eAttribute);
				if(opL.getRight() == null) {
					return () -> {
						Map<String, Object> attributeValues = indexToAttributeValues.get(index);
						return (double)attributeValues.get(attributeName);
					};
				}else {
					// traverse deeper -> opL.getRight()
				}
			}
			else if( opL.getLeft() instanceof AttributeOperandId ) {
				AttributeOperand attribute = (AttributeOperand) opL.getLeft();
				ValidAgentPattern vap = (ValidAgentPattern)attribute.getAgent().eContainer();
				int index = vapToIndex.get(vap);
				String attributeName = vap.getAgent()+"_ID";
				EAttribute eAttribute = ContainerPackage.Literals.AGENT__ID;
				addToIndexToAttributes(index, attributeName, eAttribute);
				if(opL.getRight() == null) {
					return () -> {
						Map<String, Object> attributeValues = indexToAttributeValues.get(index);
						return (double)attributeValues.get(attributeName);
					};
				}else {
					// traverse deeper -> opL.getRight()
				}
			}
			/*
			else if( opL.getLeft() instanceof NumericAssignment) {
				lrTreeList.add(new OperandValue((NumericAssignment) opL.getLeft()));
				if(opL.getRight() == null) {
					return;
				}else {
					traverseLRTree(lrTreeList, opL.getRight());
				}
			}else {
				UnaryOperation uOp = (UnaryOperation) opL.getLeft();
				Operation child = null;
				if(uOp.getOperation() instanceof AbsoluteOperation) {
					child = ((AbsoluteOperation)uOp.getOperation()).getOperation();
				}else {
					child = ((SquareRootOperation)uOp.getOperation()).getOperation();
				}
				lrTreeList.add(new OperatorUnary(uOp, flattenLRTree(child)));
				if(opL.getRight() == null) {
					return;
				}else {
					traverseLRTree(lrTreeList, opL.getRight());
				}
			}			
			
		}else {
			OperationRight opR = (OperationRight) operation;
			lrTreeList.add(new OperatorBinary((org.simsg.simsgl.simSGL.Operator)opR.getOperator()));
			if( opR.getRight() instanceof AttributeOperand ) {
				AttributeContext attributeContext = buildAttributeContext((AttributeOperand) opR.getRight());
				lrTreeList.add(new OperandVariable(attributeContext));
				return;
			}
			else if( opR.getRight() instanceof NumericAssignment) {
				lrTreeList.add(new OperandValue((NumericAssignment) opR.getRight()));
				return;
			}else {
				traverseLRTree(lrTreeList, (Operation) opR.getRight());
			}*/
		}
		return null;
	}
	
	private void addToIndexToAttributes(int index, String attributeName, EAttribute attribute) {
		Map<String, EAttribute> agentAttributes = indexToAttributes.get(index);
		Map<String, Object> attributeValues = indexToAttributeValues.get(index);
		if(agentAttributes == null) {
			agentAttributes = new HashMap<String, EAttribute>();
			indexToAttributes.put(index, agentAttributes);
			
			attributeValues = new HashMap<String, Object>();
			indexToAttributeValues.put(index, attributeValues);
		}
		agentAttributes.put(attributeName, attribute);
		attributeValues.put(attributeName, null);
	}

	
}
