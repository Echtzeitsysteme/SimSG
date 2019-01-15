package biochemsimulation.simulation.matching.democles;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.gervarro.democles.common.DataFrame;
import org.gervarro.democles.specification.emf.Pattern;

import biochemsimulation.simulation.matching.IMatch;

class DemoclesMatch implements IMatch {
	
	private String patternName;
	private Map<String, Object> parameters;
	private List<String> parameterNames;
	private int hashCode;
	
	public DemoclesMatch(final DataFrame frame, final Pattern pattern) {
		patternName = pattern.getName();
		parameters = new LinkedHashMap<String, Object>();
		
		for(int i = 0; i<pattern.getSymbolicParameters().size(); i++) {
			String parameterName = pattern.getSymbolicParameters().get(i).getName();
			Object parameterValue = frame.getValue(i);
			parameters.put(parameterName, parameterValue);
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
