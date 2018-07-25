package biochemsimulation.simulation.matching.viatra;

import java.util.List;

import biochemsimulation.simulation.matching.IMatch;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

public class ViatraMatch implements IMatch {
	
	private IPatternMatch match;
	
	public ViatraMatch(IPatternMatch match) {
		this.match = match;
	}

	@Override
	public String patternName() {
		return match.patternName();
	}

	@Override
	public List<String> parameterNames() {
		return match.parameterNames();
	}

	@Override
	public Object get(String parameterName) {
		return match.get(parameterName);
	}

}
