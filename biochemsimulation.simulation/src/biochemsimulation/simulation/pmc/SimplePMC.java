package biochemsimulation.simulation.pmc;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

import biochemsimulation.simulation.matching.IMatch;

public class SimplePMC extends PatternMatchingController {

	SimplePMC() {
		super();
	}
	
	@Override
	protected void setPMCType() {
		this.pmcType = PatternMatchingControllerEnum.SimplePMC;
	}
	
	@Override
	protected void feedEngine() throws Exception{
		engine.setReactionRules(ruleModel);
		engine.setReactionContainer(reactionContainer);
		engine.loadModels();
	}

	@Override
	public Collection<IMatch> getMatches(String patternName) {
		if(matches.get(patternName) != null) {
			return matches.get(patternName);
		}
		return new LinkedList<IMatch>();
	}

	@Override
	public Map<String, Collection<IMatch>> getAllMatches() {
		return matches;
	}

	
}
