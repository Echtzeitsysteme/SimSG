package org.simsg.core.pm.pattern.arithmetic;

import org.simsg.simsgl.simSGL.EqualComparator;
import org.simsg.simsgl.simSGL.GreaterComparator;
import org.simsg.simsgl.simSGL.GreaterEqualComparator;
import org.simsg.simsgl.simSGL.LessComparator;
import org.simsg.simsgl.simSGL.LessEqualComparator;
import org.simsg.simsgl.simSGL.MinusOperator;
import org.simsg.simsgl.simSGL.MultOperator;
import org.simsg.simsgl.simSGL.PlusOperator;
import org.simsg.simsgl.simSGL.PowOperator;
import org.simsg.simsgl.simSGL.SquareRootOperation;
import org.simsg.simsgl.simSGL.UnaryOperation;
import org.simsg.simsgl.simSGL.AbsoluteOperation;
import org.simsg.simsgl.simSGL.Comparator;
import org.simsg.simsgl.simSGL.Operator;

public enum OperatorType {
	
	plus("+"), minus("-"), mult("*"), pow("^"), sqrt("sqrt"), abs("abs"), equals("=="), geq(">="), leq("<="), ge(">"), le("<");

	private String operator;
	
	private OperatorType(String operator) {
		this.operator = operator;
	}
	
	@Override
	public String toString() {
		return operator;
	}
	
	public static OperatorType opTypeFromOperator(Operator op) {
		if(op instanceof PlusOperator) {
			return plus;
		}else if(op instanceof MinusOperator) {
			return minus;
		}else if(op instanceof MultOperator) {
			return mult;
		}else if(op instanceof PowOperator) {
			return pow;
		}
		
		return null;
	}
	
	public static OperatorType opTypeFromOperator(Comparator comp) {
		if(comp instanceof EqualComparator) {
			return equals;
		}else if(comp instanceof GreaterEqualComparator) {
			return geq;
		}else if(comp instanceof GreaterComparator) {
			return ge;
		}else if(comp instanceof LessEqualComparator) {
			return leq;
		}else if(comp instanceof LessComparator) {
			return le;
		}
		
		return null;
	}
	
	public static OperatorType opTypeFromOperator(UnaryOperation op) {
		if(op.getOperation() instanceof AbsoluteOperation) {
			return abs;
		}else if(op.getOperation() instanceof SquareRootOperation) {
			return sqrt;
		}
		return null;
	}
}
