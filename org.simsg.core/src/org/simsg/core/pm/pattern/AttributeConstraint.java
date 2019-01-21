package org.simsg.core.pm.pattern;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
	
	private List<OperationComponent> operation;

	public AttributeConstraint(Constraint constraint, Map<ValidAgentPattern, AgentNodeContext> agentNodeContexts) {
		List<OperationComponent> left = flattenLRTree(constraint.getOperandL());
		List<OperationComponent> right = flattenLRTree(constraint.getOperandR());
		operation = new LinkedList<OperationComponent>();
		operation.addAll(left);
		operation.add(new OperatorCompare(constraint.getComparator()));
		operation.addAll(right);
		System.out.println(toString());
	}
	
	public List<OperationComponent> flattenLRTree(Operation operation) {
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
	
	public void traverseLRTree(List<OperationComponent> lrTreeList, Operation operation) {
		if(operation instanceof OperationLeft) {
			OperationLeft opL = (OperationLeft) operation;
			if( opL.getLeft() instanceof AttributeOperand ) {
				lrTreeList.add(new OperandVariable((AttributeOperand) opL.getLeft()));
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
				lrTreeList.add(new OperandVariable((AttributeOperand) opR.getRight()));
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
