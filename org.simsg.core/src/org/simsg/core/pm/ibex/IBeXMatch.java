package org.simsg.core.pm.ibex;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import org.simsg.core.pm.match.SimSGMatch;

public class IBeXMatch extends SimSGMatch {
	
	private GraphTransformationMatch<?,?> gtMatch;
	private IMatch ibexMatch;
	private List<String> parameterNames;
	
	public IBeXMatch(GraphTransformationMatch<?,?> match) {
		gtMatch = match;
		ibexMatch = match.toIMatch();
		parameterNames = new LinkedList<String>(ibexMatch.getParameterNames());
	}

	@Override
	public Object get(String parameterName) {
		return ibexMatch.get(parameterName);
	}

	@Override
	public boolean contains(String parameterName) {
		return ibexMatch.isInMatch(parameterName);
	}

	@Override
	public String getPatternName() {
		return ibexMatch.getPatternName();
	}

	@Override
	public Collection<String> getParameterNames() {
		return parameterNames;
	}

	@Override
	public GraphTransformationMatch<?, ?> asGtMatch() {
		return gtMatch;
	}

	@Override
	protected int calcHashCode() {
		return ibexMatch.hashCode();
	}

	@Override
	protected boolean isEqual(Object obj) {
		if(!(obj instanceof IMatch)) return false;
		IMatch other = (IMatch) obj;
		return ibexMatch.isEqual(other);
	}

	@Override
	public Collection<Object> getObjects() {
		return ibexMatch.getObjects();
	}

}
