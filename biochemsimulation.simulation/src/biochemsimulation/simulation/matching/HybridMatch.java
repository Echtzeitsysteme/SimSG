package biochemsimulation.simulation.matching;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HybridMatch implements IMatch {
	
	private String patternName;
	private Map<String, Object> parameters;
	private List<String> parameterNames;
	
	public HybridMatch(String patternName, List<IMatch> subMatches) {
		this.patternName = patternName;
		
		parameters = new HashMap<String, Object>();
		for(IMatch subMatch : subMatches) {
			for(String paramName : subMatch.parameterNames()) {
				parameters.put(patternName, subMatch.get(paramName));
			}
		}
		
		parameterNames = new LinkedList<String>(parameters.keySet());
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

}
