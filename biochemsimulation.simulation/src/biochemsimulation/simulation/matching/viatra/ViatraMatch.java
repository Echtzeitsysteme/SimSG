package biochemsimulation.simulation.matching.viatra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import biochemsimulation.simulation.matching.IMatch;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

public class ViatraMatch implements IMatch {
	
	final private IPatternMatch match;
	private int hashCode;
	
	public ViatraMatch(final IPatternMatch match) {
		this.match = match;
		hashCode = 0;
	}
	
	public IPatternMatch getIPatternMatch() {
		return match;
	}

	@Override
	public String patternName() {
		//return match.patternName();
		return match.patternName().replaceAll("^(.)*\\.", "");
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
	public boolean contains(String parameterName) {
		return match.get(parameterName) != null;
	}
	
	@Override
	public int hashCode() {
		if(hashCode == 0) {
			int fwd = Arrays.hashCode(match.toArray());
			List<Object> reverseList = new LinkedList<Object>(Arrays.asList(match.toArray()));
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
