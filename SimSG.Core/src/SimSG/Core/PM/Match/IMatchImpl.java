package SimSG.Core.PM.Match;

import java.util.LinkedList;
import java.util.List;

public class IMatchImpl implements IMatch {
	
	private String patternName;
	
	public IMatchImpl(String patternName) {
		this.patternName = patternName;
	}

	@Override
	public String patternName() {
		return patternName;
	}

	@Override
	public List<String> parameterNames() {
		return new LinkedList<String>();
	}

	@Override
	public Object get(String parameterName) {
		return null;
	}

	@Override
	public boolean contains(String parameterName) {
		return false;
	}

}
