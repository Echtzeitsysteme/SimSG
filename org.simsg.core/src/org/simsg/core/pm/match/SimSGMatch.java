package org.simsg.core.pm.match;

import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

public abstract class SimSGMatch implements IMatch{
	
	public abstract GraphTransformationMatch<?, ?> asGtMatch();
	
	protected abstract int calcHashCode();
	
	protected abstract boolean isEqual(Object obj);
	
	public abstract boolean contains(String parameterName);
	
	@Override
	public int hashCode() {
		return calcHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return isEqual(obj);
	}
	
	@Override
	public long getHashCode() {
		return calcHashCode();
	}
}
