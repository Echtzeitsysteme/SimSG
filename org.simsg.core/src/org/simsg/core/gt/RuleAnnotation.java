package org.simsg.core.gt;

import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRule;

public abstract class RuleAnnotation {
	protected IBeXRule ibexRule;
	
	protected RuleAnnotation(final IBeXRule ibexRule) {
		this.ibexRule = ibexRule;
	}

	public IBeXRule getIbexRule() {
		return ibexRule;
	}

}
