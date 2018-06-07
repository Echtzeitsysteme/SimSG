package biochemsimulation.simulation.test;

import java.util.Collection;
import java.util.Map;

import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.matching.PatternMatchingEngine;
import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.matching.PatternMatchingEngineFactory;
import biochemsimulation.simulation.persistence.PersistenceManager;
import biochemsimulation.simulation.persistence.PersistenceManagerEnum;
import biochemsimulation.simulation.persistence.PersistenceManagerFactory;

public class Test1 {

	public static void main(String[] args) {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		
		pm.availableReactionContainerModels().forEach(x->System.out.println(x));
		pm.availableReactionRuleModels().forEach(x->System.out.println(x));
		
		
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("test2");
			System.out.println("Loaded reaction rule model: "+model1.getModel().getName());
			ReactionContainer model2 = pm.loadReactionContainerModel("test2", true);
			System.out.println("Loaded reaction container model: "+model2.getName());
			PatternModel model3 = pm.loadViatraPatternModel("test2", true);
			System.out.println("Patterns for pattern model: "+"test2");
			model3.getPatterns().forEach(x->System.out.println(x.getName()));

			PatternMatchingEngine engine = PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.ViatraEngine);
			engine.initEngine(model2);
			engine.initMatcher(model3);
			Map<String, Collection<? extends IPatternMatch>> results = engine.getAllMatches();
			System.out.println("Found matches on given Models:");
			for(String key : results.keySet()) {
				System.out.println("Pattern: "+key+ ", size: "+results.get(key).size());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
