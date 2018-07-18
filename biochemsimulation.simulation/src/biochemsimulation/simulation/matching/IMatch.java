package biochemsimulation.simulation.matching;

import java.util.List;

public interface IMatch {
	
	public String patternName();
	
	public List<String> parameterNames();
	
	public Object get(String parameterName);
}
