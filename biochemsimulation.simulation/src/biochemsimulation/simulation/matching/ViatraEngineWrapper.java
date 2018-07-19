package biochemsimulation.simulation.matching;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.matching.viatra.ViatraMatch;
import biochemsimulation.simulation.matching.viatra.ViatraPatternGenerator;

public class ViatraEngineWrapper implements PatternMatchingEngine {

	private AdvancedViatraQueryEngine queryEngine;
	private ReactionContainer model;
	private PatternModel patternModel;
	private SpecificationBuilder builder;
	private HashMap<String, ViatraQueryMatcher<? extends IPatternMatch>> matcher;
	
	ViatraEngineWrapper() {
		builder = new SpecificationBuilder();
		matcher = new HashMap<String, ViatraQueryMatcher<? extends IPatternMatch>>();
	}

	@Override
	public void loadModels(ReactionContainer model, ReactionRuleModel rules) throws Exception {
		this.model = model;
		ViatraPatternGenerator gen = new ViatraPatternGenerator(rules);
		patternModel = gen.doGenerate("", false);
	}

	@Override
	public void initEngine() throws Exception {
		EMFScope scope = new EMFScope(model);
		queryEngine = AdvancedViatraQueryEngine.createUnmanagedEngine(scope);
		
		for(Pattern p : patternModel.getPatterns()) {
			matcher.put(p.getName(), queryEngine.getMatcher(builder.getOrCreateSpecification(p, true)));
		}
		
	}

	@Override
	public Collection<IMatch> getMatches(String patternName) throws Exception {
		if(!matcher.containsKey(patternName))
			throw new IndexOutOfBoundsException("Cannot return matches for requested Pattern, because pattern does not exist.");
		Collection<IMatch> iMatches = new LinkedList<IMatch>();
		for(IPatternMatch match : matcher.get(patternName).getAllMatches()) {
			iMatches.add(new ViatraMatch(match));
		}
		return iMatches;
	}

	@Override
	public Map<String, Collection<IMatch>> getAllMatches() throws Exception {
		Map<String, Collection<IMatch>> matches = new HashMap<String, Collection<IMatch>>();
		for(String patternName : matcher.keySet()) {
			matches.put(patternName, getMatches(patternName));
		}
		return matches;
	}

	@Override
	public void disposeEngine() {
		queryEngine.wipe();
		queryEngine.dispose();
		
	}
	
	

}
