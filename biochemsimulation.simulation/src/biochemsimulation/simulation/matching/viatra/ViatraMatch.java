package biochemsimulation.simulation.matching.viatra;

import java.util.List;
import biochemsimulation.simulation.matching.IMatch;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

public class ViatraMatch implements IMatch {
	
	final private IPatternMatch match;
	
	public ViatraMatch(final IPatternMatch match) {
		this.match = match;
	}
	
	public IPatternMatch getIPatternMatch() {
		return match;
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
	
	@Override
	public boolean equals(IMatch other) {
		if(!(other instanceof ViatraMatch)) {
			return false;
		}
		return match.equals(((ViatraMatch)other).getIPatternMatch());
	}
	
	@Override
	public int hashCode() {
		return match.hashCode();
	}

}
