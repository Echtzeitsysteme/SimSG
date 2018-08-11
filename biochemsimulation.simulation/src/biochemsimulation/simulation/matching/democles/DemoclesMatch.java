package biochemsimulation.simulation.matching.democles;

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
	
	public DemoclesMatch(final DataFrame frame, final Pattern pattern) {
		patternName = pattern.getName();
		parameters = new LinkedHashMap<String, Object>();
		
		for(int i = 0; i<pattern.getSymbolicParameters().size(); i++) {
			String parameterName = pattern.getSymbolicParameters().get(i).getName();
			Object parameterValue = frame.getValue(i);
			parameters.put(parameterName, parameterValue);
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
