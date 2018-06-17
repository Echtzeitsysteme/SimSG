package biochemsimulation.simulation.pmc;

import java.util.Collection;
import java.util.Map;

import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.matching.PatternMatchingEngine;
import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.matching.PatternMatchingEngineFactory;

public class SimplePMC extends ReactionRuleTransformer implements PatternMatchingController {
	
	PatternMatchingEngine engine;
	
	SimplePMC() {
		engine = PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.ViatraEngine);
	}
	
	@Override
	public void init(ReactionRuleModel ruleModel, ReactionContainer reactionContainer, PatternModel patterns) throws Exception {
		this.ruleModel = ruleModel;
		this.reactionContainer = reactionContainer;
		this.patterns = patterns;
		
		engine.initEngine(reactionContainer);
		engine.initMatcher(patterns);
		
		initRuleMap();
		initPatternMaps();
		retrieveStaticReactionRates();
		
	}

	@Override
	public void collectMatches() throws Exception {
		matches = engine.getAllMatches();		
	}

	@Override
	public void performTransformations() {
		updateDynamicReactionRates();
		collectReactionCandidates();
		candidates.forEach((x, y) -> {
			y.forEach(z -> applyRuleToMatch(z));
			// hier muesst noch ein update matches rein!
		});
		
	}

	@Override
	public Collection<? extends IPatternMatch> getMatches(String patternName) {
		return super.getMatches(patternName);
	}

	@Override
	public Map<String, Collection<? extends IPatternMatch>> getAllMatches() {
		return matches;
	}
}
