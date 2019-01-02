package biochemsimulation.simulation.pmc;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.utils.PatternContainer;
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
		//Map<String, Pattern> patterns = PatternUtils.getRulePatterns(ruleModel);
		Collection<Pattern> patterns = patternContainer.getAllPatterns();
		Map<String, GenericPattern> genericPatterns = new HashMap<String, GenericPattern>();
		for(Pattern pattern : patterns) {
			genericPatterns.put(PatternContainer.calcPatternHash(pattern), new GenericPattern(PatternContainer.calcPatternHash(pattern), metaModel, pattern));
		}
		engine.setReactionRules(genericPatterns);
		engine.setReactionContainer(reactionContainer, metaModel.getPackage());
		engine.loadModels();
	}

	@Override
	public Collection<IMatch> getMatches(String patternName) {
		String patternHash = patternContainer.getPatternHash(patternName);
		if(matches.get(patternHash) != null) {
			return matches.get(patternHash);
		}
		return new LinkedList<IMatch>();
	}

	@Override
	public Map<String, Collection<IMatch>> getAllMatches() {
		return matches;
	}

	
}
