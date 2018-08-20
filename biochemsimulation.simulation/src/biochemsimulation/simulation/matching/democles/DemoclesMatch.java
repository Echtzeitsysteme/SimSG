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
	final private DataFrame frame;
	
	public DemoclesMatch(final DataFrame frame, final Pattern pattern) {
		this.frame = frame;
		patternName = pattern.getName();
		parameters = new LinkedHashMap<String, Object>();
		
		for(int i = 0; i<pattern.getSymbolicParameters().size(); i++) {
			String parameterName = pattern.getSymbolicParameters().get(i).getName();
			Object parameterValue = frame.getValue(i);
			parameters.put(parameterName, parameterValue);
		}
		
		parameterNames = new LinkedList<String>(parameters.keySet());
		
	}
	
	public DataFrame getDataFrame() {
		return frame;
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
		if(!(other instanceof DemoclesMatch)) {
			return false;
		}
		return frame.equals(((DemoclesMatch)other).getDataFrame());
	}
	
	@Override
	public int hashCode() {
		return frame.hashCode();
	}

}
