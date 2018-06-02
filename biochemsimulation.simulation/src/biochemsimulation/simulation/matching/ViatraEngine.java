package biochemsimulation.simulation.matching;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;

import biochemsimulation.reactioncontainer.ReactionContainer;

public class ViatraEngine implements PatternMatchingEngine {

	private AdvancedViatraQueryEngine queryEngine;
	private SpecificationBuilder builder;
	private HashMap<String, ViatraQueryMatcher<? extends IPatternMatch>> matcher;
	
	ViatraEngine() {
		builder = new SpecificationBuilder();
		matcher = new HashMap<String, ViatraQueryMatcher<? extends IPatternMatch>>();
	}

	@Override
	public void initEngine(ReactionContainer model) throws Exception {
		EMFScope scope = new EMFScope(model);
		queryEngine = AdvancedViatraQueryEngine.createUnmanagedEngine(scope);
		
	}

	@Override
	public void initMatcher(PatternModel patternModel) throws Exception {
		for(Pattern p : patternModel.getPatterns()) {
			matcher.put(p.getName(), queryEngine.getMatcher(builder.getOrCreateSpecification(p, true)));
		}
		
	}

	@Override
	public Collection<? extends IPatternMatch> getMatches(String patternName) throws Exception {
		if(!matcher.containsKey(patternName))
			throw new IndexOutOfBoundsException("Cannot return matches for requested Pattern, because pattern does not exist.");
		return matcher.get(patternName).getAllMatches();
	}

	@Override
	public Map<String, Collection<? extends IPatternMatch>> getAllMatches() throws Exception {
		Map<String, Collection<? extends IPatternMatch>> matches = new HashMap<String, Collection<? extends IPatternMatch>>();
		for(String patternName : matcher.keySet()) {
			matches.put(patternName, getMatches(patternName));
		}
		return matches;
	}

	@Override
	public void wipeEngine() {
		queryEngine.wipe();
		
	}

	@Override
	public void disposeEngine() {
		queryEngine.dispose();
		
	}
	
	

}
