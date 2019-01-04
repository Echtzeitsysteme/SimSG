package biochemsimulation.simulation.test;

import biochemsimulation.reactioncontainer.Container;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.Simulation;
import biochemsimulation.simulation.SimulationConfigurator;
import biochemsimulation.simulation.benchmark.Runtimer;
import biochemsimulation.simulation.matching.PatternMatchingEngine;
import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.matching.PatternMatchingEngineFactory;
import biochemsimulation.simulation.persistence.PersistenceManager;
import biochemsimulation.simulation.persistence.PersistenceManagerEnum;
import biochemsimulation.simulation.persistence.PersistenceManagerFactory;
import biochemsimulation.simulation.pmc.PatternMatchingController;
import biochemsimulation.simulation.pmc.PatternMatchingControllerEnum;
import biochemsimulation.simulation.pmc.PatternMatchingControllerFactory;


public class Sandbox {

	public static void main(String[] args) {
		
		/*
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		try {
			ReactionRuleModel ruleModel = pm.loadReactionRuleModel("Goldbeter_Koshland");
			Container reactionContainer = pm.loadReactionContainerModel("Goldbeter_Koshland");
			PatternMatchingEngine engine = PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.ViatraEngine);
			PatternMatchingController pmc = PatternMatchingControllerFactory.create(PatternMatchingControllerEnum.SimplePMC);
			pmc.setEngine(engine);
			pmc.loadModels(ruleModel, reactionContainer);
			pmc.initEngine();
			pmc.initController();
			pmc.collectAllMatches();
			pmc.getAllMatches().forEach((pattern, matches) -> {
				System.out.println("Pattern: "+pattern+", "+matches.size()+" matches.");
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 */
		SimulationConfigurator simConfigurator = new SimulationConfigurator();
		simConfigurator.setModel("EGF_Pathway");
		simConfigurator.setSimplePersistence();
		simConfigurator.setViatraAsEngine();
		simConfigurator.setSimplePMC();
		simConfigurator.setStochasticSimulation();
		simConfigurator.setComplexTerminationCondition();
		Simulation viatraSim = simConfigurator.createSimulation();
		viatraSim.initializeClocked();
		viatraSim.runClocked();
		System.out.println(viatraSim.results());
		viatraSim.displayResults();
		viatraSim.finish();
		
		System.out.println(Runtimer.getInstance());
	}
	
}
