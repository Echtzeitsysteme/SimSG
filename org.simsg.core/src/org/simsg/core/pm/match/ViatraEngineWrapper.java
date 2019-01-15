package org.simsg.core.pm.match;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.simsg.core.pm.viatra.ViatraMatch;
import org.simsg.core.pm.viatra.ViatraPatternGenerator;
import org.eclipse.viatra.query.patternlanguage.emf.vql.*;
//import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder;
//import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;

public class ViatraEngineWrapper extends PatternMatchingEngine {
	
	private AdvancedViatraQueryEngine queryEngine;
	@SuppressWarnings("restriction")
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
		ViatraPatternGenerator gen = new ViatraPatternGenerator(metaModel, genericPatterns);
		patternModel = gen.doGenerate();
	}

	@SuppressWarnings("restriction")
	@Override
	public void initEngineInternal() throws Exception {
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
	protected Collection<IMatch> getMatchesAndUpdate(String patternName) throws Exception {
		Collection<IMatch> iMatches = new LinkedList<IMatch>();
		for(IPatternMatch match : matcher.get(patternName).getAllMatches()) {
			iMatches.add(new ViatraMatch(match, patternName));
		}
		return iMatches;
	}

	@Override
	protected void initNonVoidPatternNames() {
		nonVoidPatterns = new LinkedList<String>();
		for(String pattern : matcher.keySet()) {
			nonVoidPatterns.add(pattern);
		}
	}
	
	

}
