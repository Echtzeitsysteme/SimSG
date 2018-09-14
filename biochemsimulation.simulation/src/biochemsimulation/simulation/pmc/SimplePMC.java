package biochemsimulation.simulation.pmc;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.utils.PatternUtils;
import biochemsimulation.simulation.matching.IMatch;
import biochemsimulation.simulation.matching.patterns.GenericPattern;

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
		Map<String, Pattern> patterns = PatternUtils.getRulePatterns(ruleModel);
		Map<String, GenericPattern> genericPatterns = new HashMap<String, GenericPattern>();
		patterns.forEach((name, pattern) -> {
			genericPatterns.put(name, new GenericPattern(name, pattern));
		});
		engine.setReactionRules(genericPatterns);
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
