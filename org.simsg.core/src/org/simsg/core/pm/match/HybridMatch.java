package org.simsg.core.pm.match;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import org.simsg.core.pm.pattern.HybridPattern;


public class HybridMatch extends SimSGMatch {
	
	private String patternName;
	private Map<String, Object> parameters;
	private List<String> parameterNames;
	
	public HybridMatch(String patternName, final Collection<SimSGMatch> subMatches, HybridPattern pattern) {
		this.patternName = patternName;
		
		parameters = new LinkedHashMap<String, Object>();
		for(SimSGMatch subMatch : subMatches) {
			for(String paramName : subMatch.getParameterNames()) {
				parameters.put(pattern.localToGlobalSignature(subMatch.getPatternName(), paramName), subMatch.get(paramName));
			}
		}
		parameterNames = new LinkedList<String>(parameters.keySet());
	}

	@Override
	public Object get(String parameterName) {
		return parameters.get(parameterName);
	}

	@Override
	public boolean contains(String parameterName) {
		return parameters.containsKey(parameterName);
	}
	
	
	//TODO: Fix this dirty hack..
	/*
	@Override
	public int hashCode() {
		if(hashCode == 0) {
			int fwd = Arrays.hashCode(parameters.values().toArray());
			List<Object> reverseList = new LinkedList<Object>(parameters.values());
			Collections.reverse(reverseList);
			int bwd = Arrays.hashCode(reverseList.toArray());
			hashCode =  (fwd > bwd)?fwd:bwd;
		}
		return hashCode;
	}
	
	@Override
	public boolean equals(Object other) {
		return this.hashCode()==other.hashCode();
	}
	*/

	@Override
	public String getPatternName() {
		return patternName;
	}

	@Override
	public Collection<String> getParameterNames() {
		return parameterNames;
	}

	@Override
	public GraphTransformationMatch<?, ?> asGtMatch() {
		return null;
	}

	@Override
	protected int calcHashCode() {
		return Arrays.hashCode(parameters.values().toArray());
	}

	@Override
	protected boolean isEqual(Object obj) {
		if(!(obj instanceof SimSGMatch) ) {
			return false;
		}
		
		SimSGMatch other = (SimSGMatch)obj;
		if(!patternName.equals(other.getPatternName())) return false;
		if(parameterNames.size() != other.getParameterNames().size()) return false;
		
		for(String param : parameterNames) {
			if(get(param)!=other.get(param)) return false;
		}
		
		for(String param : other.getParameterNames()) {
			if(get(param)!=other.get(param)) return false;
		}
		
		return true;
		
	}

}
