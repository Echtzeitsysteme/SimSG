package org.simsg.core.pm.match;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Objects;

import org.emoflon.ibex.gt.api.GraphTransformationMatch;

public class SimSGMatchImpl extends SimSGMatch {
	
	private String patternName;
	
	public SimSGMatchImpl(String patternName) {
		this.patternName = patternName;
	}

	@Override
	public Object get(String parameterName) {
		return null;
	}

	@Override
	public String getPatternName() {
		return patternName;
	}

	@Override
	public Collection<String> getParameterNames() {
		return new LinkedList<String>();
	}

	@Override
	public GraphTransformationMatch<?, ?> asGtMatch() {
		return null;
	}

	@Override
	protected int calcHashCode() {
		return Objects.hash(this);
	}

	@Override
	protected boolean isEqual(Object obj) {
		return this==obj;
	}

	@Override
	public boolean contains(String parameterName) {
		return false;
	}

	@Override
	public Collection<Object> getObjects() {
		return null;
	}

}
