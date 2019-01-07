package biochemsimulation.simulation.matching.viatra;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import biochemsimulation.simulation.matching.IMatch;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

public class ViatraMatch implements IMatch {
	
	final private IPatternMatch match;
	private int hashCode;
	private String patternName;
	
	public ViatraMatch(final IPatternMatch match, String patternName) {
		this.match = match;
		//patternName = match.patternName().replaceAll("^(.)*\\.", "");
		this.patternName = patternName;
		hashCode = 0;
	}
	
	public IPatternMatch getIPatternMatch() {
		return match;
	}

	@Override
	public String patternName() {
		return patternName;
		//return match.patternName().replaceAll("^(.)*\\.", "");
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
