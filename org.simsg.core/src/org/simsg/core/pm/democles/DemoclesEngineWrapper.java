package org.simsg.core.pm.democles;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.gervarro.democles.specification.emf.Pattern;
import org.simsg.core.pm.engine.LegacyPatternMatchingEngine;
import org.simsg.core.pm.match.IMatch;

public class DemoclesEngineWrapper extends LegacyPatternMatchingEngine {
	
	private DemoclesEngine engine;
	List<Pattern> patterns;
	
	public DemoclesEngineWrapper() {}
	
	@Override
	public void initPatterns() throws Exception {
		DemoclesPatternGenerator generator = new DemoclesPatternGenerator(genericPatterns);
		patterns = new LinkedList<Pattern>(generator.doGenerate().values());
		
	}

	@Override
	public void initEngineInternal() throws Exception {
		engine = new DemoclesEngine(simulationModel);
		engine.initPatterns(patterns);
		//engine.savePatternsToFile();
	}
	
	@Override
	protected Collection<IMatch> getMatchesAndUpdate(String patternName) throws Exception {
		return engine.getMatches(patternName, true);
	}


	@Override
	public void disposeEngine() {
		engine.disposeEngine();
	}

	@Override
	protected void initNonVoidPatternNames() {
		nonVoidPatterns = new LinkedList<String>();
		for(Pattern pattern : patterns) {
			nonVoidPatterns.add(pattern.getName());
		}
	}

	@Override
	public void setAdditionalParameters(Object... params) {
		// TODO Auto-generated method stub
		
	}

}
