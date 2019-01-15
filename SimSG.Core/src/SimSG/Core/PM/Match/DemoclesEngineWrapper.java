package SimSG.Core.PM.Match;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.gervarro.democles.specification.emf.Pattern;

import SimSG.Core.PM.Democles.DemoclesEngine;
import SimSG.Core.PM.Democles.DemoclesPatternGenerator;

public class DemoclesEngineWrapper extends PatternMatchingEngine {
	
	private DemoclesEngine engine;
	List<Pattern> patterns;
	
	DemoclesEngineWrapper() {
		type = PatternMatchingEngineEnum.DemoclesEngine;
	}
	
	@Override
	public void loadModels() throws Exception {
		//DemoclesPatternGenerator generator = new DemoclesPatternGenerator(genericPatterns);
		//patterns = new LinkedList<Pattern>(generator.doGenerate().values());
		
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
