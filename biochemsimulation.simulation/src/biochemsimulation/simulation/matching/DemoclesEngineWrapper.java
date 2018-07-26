package biochemsimulation.simulation.matching;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.gervarro.democles.specification.emf.Pattern;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.matching.democles.DemoclesEngine;
import biochemsimulation.simulation.matching.democles.DemoclesPatternGenerator;

public class DemoclesEngineWrapper implements PatternMatchingEngine {
	
	public static final PatternMatchingEngineEnum type = PatternMatchingEngineEnum.DemoclesEngine;
	private DemoclesEngine engine;
	private ReactionContainer model;
	List<Pattern> patterns;
	
	DemoclesEngineWrapper() {
		
	}
	
	@Override
	public void loadModels(ReactionContainer model, ReactionRuleModel rules) throws Exception {
		this.model = model;
		DemoclesPatternGenerator generator = new DemoclesPatternGenerator(rules);
		patterns = new LinkedList<Pattern>(generator.doGenerate().values());
		// patterns = generator.doGenerate();
	}

	@Override
	public void initEngine() throws Exception {
		engine = new DemoclesEngine(model);
		engine.initPatterns(patterns);
	}

	@Override
	public Collection<IMatch> getMatches(String patternName) throws Exception {
		return engine.getMatches(patternName, true);
	}

	@Override
	public Map<String, Collection<IMatch>> getAllMatches() throws Exception {
		Map<String, Collection<IMatch>> matches = new HashMap<String, Collection<IMatch>>();
		for(Pattern pattern : patterns) {
			matches.put(pattern.getName(), getMatches(pattern.getName()));
		}
		return matches;
	}

	@Override
	public void disposeEngine() {
		engine.disposeEngine();
	}

	@Override
	public PatternMatchingEngineEnum getEngineType() {
		return type;
	}

}
