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
import biochemsimulation.simulation.pmc.PatternMatchingController;
import biochemsimulation.simulation.pmc.PatternMatchingControllerEnum;
import biochemsimulation.simulation.pmc.PatternMatchingControllerFactory;

public class Test1 {

	public static void main(String[] args) {
		test2();
	}
	
	public static void test1() {
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
	
	public static void test2() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("test3");
			ReactionContainer model2 = pm.loadReactionContainerModel("test3", true);
			PatternModel model3 = pm.loadViatraPatternModel("test3", true);
			PatternMatchingController pmc = PatternMatchingControllerFactory.create(PatternMatchingControllerEnum.SimplePMC);
			pmc.init(model1, model2, model3);
			for(int i = 0; i<20; i++) {
				pmc.collectMatches();
				Map<String, Collection<? extends IPatternMatch>> results = pmc.getAllMatches();
				for(String key : results.keySet()) {
					System.out.println("Pattern: "+key+ ", size: "+results.get(key).size());
				}
				pmc.performTransformations();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
