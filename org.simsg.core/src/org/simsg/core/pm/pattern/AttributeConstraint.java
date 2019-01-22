package org.simsg.core.pm.pattern;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.simsg.container.util.EPackageWrapper;
import org.simsg.core.pm.pattern.arithmetic.OperandValue;
import org.simsg.core.pm.pattern.arithmetic.OperandVariable;
import org.simsg.core.pm.pattern.arithmetic.OperationComponent;
import org.simsg.core.pm.pattern.arithmetic.OperatorBinary;
import org.simsg.core.pm.pattern.arithmetic.OperatorCompare;
import org.simsg.core.pm.pattern.arithmetic.OperatorUnary;
import org.simsg.simsgl.simSGL.AbsoluteOperation;
import org.simsg.simsgl.simSGL.SquareRootOperation;
import org.simsg.simsgl.simSGL.AttributeOperand;
import org.simsg.simsgl.simSGL.Constraint;
import org.simsg.simsgl.simSGL.NumericAssignment;
import org.simsg.simsgl.simSGL.Operation;
import org.simsg.simsgl.simSGL.OperationLeft;
import org.simsg.simsgl.simSGL.OperationRight;
import org.simsg.simsgl.simSGL.UnaryOperation;
import org.simsg.simsgl.simSGL.ValidAgentPattern;

public class AttributeConstraint {
	
	private Map<ValidAgentPattern, AgentNodeContext> agentNodeContexts;
	private EPackageWrapper metaModel;
	private Set<AttributeContext> attributeContexts;
	private List<OperationComponent> leftOperations;
	private List<OperationComponent> rightOperations;
	private OperationComponent comparator;
	private List<OperationComponent> operation;

	public AttributeConstraint(Constraint constraint, Map<ValidAgentPattern, AgentNodeContext> agentNodeContexts, EPackageWrapper metaModel) {
		this.agentNodeContexts = agentNodeContexts;
		this.metaModel = metaModel;
		attributeContexts = new HashSet<AttributeContext>();
		
		leftOperations = flattenLRTree(constraint.getOperandL());
		rightOperations = flattenLRTree(constraint.getOperandR());
		comparator = new OperatorCompare(constraint.getComparator());
		
		operation = new LinkedList<OperationComponent>();
		operation.addAll(leftOperations);
		operation.add(comparator);
		operation.addAll(rightOperations);
	}
	
	public List<OperationComponent> getLeftOperations() {
		return leftOperations;
	}
	
	public List<OperationComponent> getRightOperations() {
		return rightOperations;
	}
	
	public OperationComponent getComparator() {
		return comparator;
	}
	
	public Set<AttributeContext> getAttributeContexts() {
		return attributeContexts;
	}
	
	private AttributeContext buildAttributeContext(AttributeOperand operand) {
		ValidAgentPattern vap = (ValidAgentPattern)operand.getAgent().eContainer();
		AttributeContext context = new AttributeContext(agentNodeContexts.get(vap), operand, metaModel);
		attributeContexts.add(context);
		return context;
	}
	
	private List<OperationComponent> flattenLRTree(Operation operation) {
		List<OperationComponent> lrTreeList = new LinkedList<OperationComponent>();
		if(operation instanceof UnaryOperation) {
			UnaryOperation uOp = (UnaryOperation) operation;
			Operation child = null;
			if(uOp.getOperation() instanceof AbsoluteOperation) {
				child = ((AbsoluteOperation)uOp.getOperation()).getOperation();
			}else {
				child = ((SquareRootOperation)uOp.getOperation()).getOperation();
			}
			lrTreeList.add(new OperatorUnary( uOp, flattenLRTree(child)));
		}
		traverseLRTree(lrTreeList, operation);
		
		return lrTreeList;
	}
	
	private void traverseLRTree(List<OperationComponent> lrTreeList, Operation operation) {
		if(operation instanceof OperationLeft) {
			OperationLeft opL = (OperationLeft) operation;
			if( opL.getLeft() instanceof AttributeOperand ) {
				AttributeContext attributeContext = buildAttributeContext((AttributeOperand) opL.getLeft());
				lrTreeList.add(new OperandVariable(attributeContext));
				if(opL.getRight() == null) {
					return;
				}else {
					traverseLRTree(lrTreeList, opL.getRight());
				}
			}
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
			}
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(OperationComponent component : operation) {
			sb.append(component.toString());
		}
		return sb.toString();
	}
}
