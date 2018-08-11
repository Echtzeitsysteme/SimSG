package biochemsimulation.simulation.matching;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;

import biochemsimulation.simulation.matching.viatra.ViatraMatch;
import biochemsimulation.simulation.matching.viatra.ViatraPatternGenerator;

public class ViatraEngineWrapper extends PatternMatchingEngine {
	
	private AdvancedViatraQueryEngine queryEngine;
	private PatternModel patternModel;
	private SpecificationBuilder builder;
	private HashMap<String, ViatraQueryMatcher<? extends IPatternMatch>> matcher;
	
	ViatraEngineWrapper() {
		type = PatternMatchingEngineEnum.ViatraEngine;
		builder = new SpecificationBuilder();
		matcher = new HashMap<String, ViatraQueryMatcher<? extends IPatternMatch>>();
	}
	
	@Override
	public void loadModels() throws Exception {
		ViatraPatternGenerator gen = null;
		if(rules != null) {
			gen = new ViatraPatternGenerator(rules);
		}else {
			gen = new ViatraPatternGenerator(genericPatterns);
		}
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
	public void disposeEngine() {
		queryEngine.wipe();
		queryEngine.dispose();
		
	}

	@Override
	protected Collection<String> getAllPatternNames() {
		return matcher.keySet();
	}

	@Override
	protected Collection<IMatch> getMatchesAndUpdate(String patternName) throws Exception {
		Collection<IMatch> iMatches = new LinkedList<IMatch>();
		for(IPatternMatch match : matcher.get(patternName).getAllMatches()) {
			iMatches.add(new ViatraMatch(match));
		}
		return iMatches;
	}
	
	

}
