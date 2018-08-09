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
	List<String> patternNames;
	
	DemoclesEngineWrapper() {
		type = PatternMatchingEngineEnum.DemoclesEngine;
		patternNames = new LinkedList<String>();
	}
	
	@Override
	public void loadModels() throws Exception {
		DemoclesPatternGenerator generator = new DemoclesPatternGenerator(rules);
		patterns = new LinkedList<Pattern>(generator.doGenerate().values());
		for(Pattern pattern : patterns) {
			patternNames.add(pattern.getName());
		}
	}

	@Override
	public void initEngine() throws Exception {
		engine = new DemoclesEngine(model);
		engine.initPatterns(patterns);
		//engine.savePatternsToFile();
	}
	
	@Override
	protected Collection<String> getAllPatternNames() {
		return patternNames;
	}
	
	@Override
	protected Collection<IMatch> getMatchesAndUpdate(String patternName) throws Exception {
		return engine.getMatches(patternName, true);
	}


	@Override
	public void disposeEngine() {
		engine.disposeEngine();
	}

}
