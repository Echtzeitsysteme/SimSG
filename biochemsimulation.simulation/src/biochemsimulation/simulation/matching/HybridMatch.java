package biochemsimulation.simulation.matching;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.google.common.base.Objects;

import biochemsimulation.simulation.matching.patterns.HybridPattern;

public class HybridMatch implements IMatch {
	
	private String patternName;
	private Map<String, Object> parameters;
	private List<String> parameterNames;
	
	public HybridMatch(String patternName, final Collection<IMatch> subMatches, HybridPattern pattern) {
		this.patternName = patternName;
		
		parameters = new LinkedHashMap<String, Object>();
		for(IMatch subMatch : subMatches) {
			for(String paramName : subMatch.parameterNames()) {
				//parameters.put(paramName, subMatch.get(paramName));
				parameters.put(pattern.localToGlobalSignature(subMatch.patternName(), paramName), subMatch.get(paramName));
			}
		}
		parameterNames = new LinkedList<String>(parameters.keySet());
		/*
		System.out.println("HybridMatch: "+patternName + ", order:");
		parameters.forEach((s, o) -> System.out.println("Param: "+s));
		System.out.println("HybridPattern: "+patternName + ", order:");
		pattern.getGenericSubPatterns().forEach((name, p) -> {
			System.out.println("Subpattern: "+p.getName()+", order:");
			p.getSignature().getSignature().forEach((name2, sig) -> System.out.println("NodeName: "+name2));
		});
		*/
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
		return Arrays.hashCode(parameters.values().toArray());
	}
	
	@Override
	public boolean equals(Object other) {
		return this.hashCode()==other.hashCode();
	}

}
