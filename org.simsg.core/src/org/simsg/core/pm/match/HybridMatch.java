package org.simsg.core.pm.match;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.simsg.core.pm.pattern.HybridPattern;

public class HybridMatch implements IMatch {
	
	private String patternName;
	private Map<String, Object> parameters;
	private List<String> parameterNames;
	private int hashCode;
	
	public HybridMatch(String patternName, final Collection<IMatch> subMatches, HybridPattern pattern) {
		this.patternName = patternName;
		
		parameters = new LinkedHashMap<String, Object>();
		for(IMatch subMatch : subMatches) {
			for(String paramName : subMatch.parameterNames()) {
				parameters.put(pattern.localToGlobalSignature(subMatch.patternName(), paramName), subMatch.get(paramName));
			}
		}
		parameterNames = new LinkedList<String>(parameters.keySet());
		hashCode = 0;
	}

	@Override
	public String patternName() {
		return patternName;
	}

	@Override
	public List<String> parameterNames() {
		return parameterNames;
	}

	@Override
	public Object get(String parameterName) {
		return parameters.get(parameterName);
	}

	@Override
	public boolean contains(String parameterName) {
		return parameters.containsKey(parameterName);
	}
	
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

}
