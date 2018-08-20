package biochemsimulation.simulation.matching;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HybridMatch implements IMatch {
	
	final private Set<IMatch> subMatches;
	private String patternName;
	private Map<String, Object> parameters;
	private List<String> parameterNames;
	
	public HybridMatch(String patternName, final Set<IMatch> subMatches) {
		this.subMatches = subMatches;
		this.patternName = patternName;
		
		parameters = new HashMap<String, Object>();
		for(IMatch subMatch : subMatches) {
			for(String paramName : subMatch.parameterNames()) {
				parameters.put(paramName, subMatch.get(paramName));
			}
		}
		
		parameterNames = new LinkedList<String>(parameters.keySet());
	}
	
	public Set<IMatch> getSubMatches(){
		return subMatches;
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
	public boolean equals(IMatch other) {
		if(!(other instanceof HybridMatch)) {
			return false;
		}
		return subMatches.equals(((HybridMatch)other).getSubMatches());
	}

}
