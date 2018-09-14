package biochemsimulation.simulation.matching;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.gervarro.democles.specification.emf.Pattern;

import biochemsimulation.simulation.matching.democles.DemoclesEngine;
import biochemsimulation.simulation.matching.democles.DemoclesPatternGenerator;

public class DemoclesEngineWrapper extends PatternMatchingEngine {
	
	private DemoclesEngine engine;
	List<Pattern> patterns;
	
	DemoclesEngineWrapper() {
		type = PatternMatchingEngineEnum.DemoclesEngine;
	}
	
	@Override
	public void loadModels() throws Exception {
		DemoclesPatternGenerator generator = new DemoclesPatternGenerator(genericPatterns);
		patterns = new LinkedList<Pattern>(generator.doGenerate().values());
		
		// observables, termination conditions etc.
		if(!additionalGenericPatterns.isEmpty()) {
			generator = new DemoclesPatternGenerator(additionalGenericPatterns);
			patterns.addAll(new LinkedList<Pattern>(generator.doGenerate().values()));
		}
		
		
	}

	@Override
	public void initEngineInternal() throws Exception {
		engine = new DemoclesEngine(model);
		engine.initPatterns(patterns);
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

}
