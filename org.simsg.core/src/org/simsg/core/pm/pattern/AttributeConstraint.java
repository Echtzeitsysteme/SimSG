package org.simsg.core.pm.pattern;

import java.util.HashSet;
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
import org.simsg.simsgl.simSGL.AttributeOperandGeneric;
import org.simsg.simsgl.simSGL.BraceOperation;
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
	private OperationComponent leftOperation;
	private OperationComponent rightOperation;
	private OperationComponent comparator;

	public AttributeConstraint(Constraint constraint, Map<ValidAgentPattern, AgentNodeContext> agentNodeContexts, EPackageWrapper metaModel) {
		this.agentNodeContexts = agentNodeContexts;
		this.metaModel = metaModel;
		attributeContexts = new HashSet<AttributeContext>();
		
		leftOperation = transformOperation(constraint.getOperandL());
		rightOperation = transformOperation(constraint.getOperandR());
		comparator = new OperatorCompare(constraint.getComparator());
	}
	
	public OperationComponent getLeftOperation() {
		return leftOperation;
	}
	
	public OperationComponent getRightOperation() {
		return rightOperation;
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
	
	public OperationComponent transformOperation(Operation operation) {
		if(operation instanceof UnaryOperation) {
			return createUnaryOperator((UnaryOperation) operation);
		}
		return createOperator((OperationLeft) operation);
	}
	
	private OperationComponent createUnaryOperator(UnaryOperation uOp) {
		if(uOp.getOperation() instanceof AbsoluteOperation) {
			Operation child = ((AbsoluteOperation)uOp.getOperation()).getOperation();
			return new OperatorUnary(uOp, createOperator((OperationLeft)child));
		}else if (uOp.getOperation() instanceof SquareRootOperation) {
			Operation child = ((SquareRootOperation)uOp.getOperation()).getOperation();
			return new OperatorUnary(uOp, createOperator((OperationLeft)child));
		}else {
			Operation child = ((BraceOperation)uOp.getOperation()).getOperation();
			return new OperatorUnary(uOp, createOperator((OperationLeft)child));
		}
	}
	
	private OperationComponent createBinaryOperator(UnaryOperation uOp, OperationRight operation2) {
		return new OperatorBinary(operation2.getOperator(), createUnaryOperator(uOp), createOperator(operation2));
	}
	
	private OperationComponent createBinaryOperator(AttributeOperandGeneric attribute, OperationRight operation2) {	
		AttributeContext attributeContext = buildAttributeContext(attribute);
		return new OperatorBinary(operation2.getOperator(), new OperandVariable(attributeContext), createOperator(operation2));
	}
	
	private OperationComponent createBinaryOperator(NumericAssignment numeric, OperationRight operation2) {
		return new OperatorBinary(operation2.getOperator(), new OperandValue(numeric), createOperator(operation2));
	}
	
	private OperationComponent createOperator(OperationRight opR) {
		if(opR.getRight() instanceof AttributeOperandGeneric) {
			AttributeContext attributeContext = buildAttributeContext((AttributeOperandGeneric)opR.getRight());
			return new OperandVariable(attributeContext);
		}else if(opR.getRight() instanceof NumericAssignment) {
			return new OperandValue((NumericAssignment) opR.getRight());
		} else {
			return createOperator((OperationLeft)opR.getRight());
		}
	}
	
	private OperationComponent createOperator(OperationLeft opL) {
		if( opL.getLeft() instanceof AttributeOperand ) {
			if(opL.getRight() == null) {
				// return attribute value
				AttributeContext attributeContext = buildAttributeContext((AttributeOperand) opL.getLeft());
				return new OperandVariable(attributeContext);
			}else {
				// traverse deeper -> opL.getRight()
				return createBinaryOperator((AttributeOperandGeneric)opL.getLeft(), (OperationRight)opL.getRight());
			}
		}else if( opL.getLeft() instanceof NumericAssignment) {
			if(opL.getRight() == null) {
				return new OperandValue((NumericAssignment) opL.getLeft());
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
	
	/*
	private List<OperationComponent> flattenLRTree(Operation operation) {
		List<OperationComponent> lrTreeList = new LinkedList<OperationComponent>();
		if(operation instanceof UnaryOperation) {
			UnaryOperation uOp = (UnaryOperation) operation;
			Operation child = null;
			if(uOp.getOperation() instanceof AbsoluteOperation) {
				child = ((AbsoluteOperation)uOp.getOperation()).getOperation();
			}else if(uOp.getOperation() instanceof SquareRootOperation){
				child = ((SquareRootOperation)uOp.getOperation()).getOperation();
			}else {
				child = ((BraceOperation)uOp.getOperation()).getOperation();
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
				}else if(uOp.getOperation() instanceof SquareRootOperation) {
					child = ((SquareRootOperation)uOp.getOperation()).getOperation();
				}else {
					child = ((BraceOperation)uOp.getOperation()).getOperation();
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
	*/
	
	
	@Override
	public String toString() {
		return leftOperation.toString() + comparator.toString() + rightOperation.toString();
	}
	
}
