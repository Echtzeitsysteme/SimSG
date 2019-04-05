package org.simsg.core.pm.ibex;

import java.util.LinkedList;
import java.util.List;

import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import org.simsg.core.pm.match.IMatch;

public class IBeXMatch implements IMatch {
	
	private org.emoflon.ibex.common.operational.IMatch ibexMatch;
	private List<String> parameterNames;
	
	public IBeXMatch(GraphTransformationMatch<?,?> match) {
		ibexMatch = match.toIMatch();
		parameterNames = new LinkedList<String>(ibexMatch.getParameterNames());
	}

	@Override
	public String patternName() {
		return ibexMatch.getPatternName();
	}

	@Override
	public List<String> parameterNames() {
		return parameterNames;
	}

	@Override
	public Object get(String parameterName) {
		return ibexMatch.get(parameterName);
	}

	@Override
	public boolean contains(String parameterName) {
		return ibexMatch.isInMatch(parameterName);
	}

}
