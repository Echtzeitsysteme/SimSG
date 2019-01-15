package SimSG.Development;

import SimSG.Core.Simulation.Simulation;
import SimSG.Core.Simulation.SimulationConfigurator;
import SimSG.Core.Utils.Runtimer;


public class Sandbox {

	public static void main(String[] args) {
		
		/*
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		try {
			ReactionRuleModel ruleModel = pm.loadReactionRuleModel("MultiEdgeTest1");
			Container reactionContainer = pm.loadReactionContainerModel("MultiEdgeTest1");
			
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
		simConfigurator.setModelFolder(System.getProperty("user.dir")+"//models");
		simConfigurator.setModel("Goldbeter_Koshland");
		simConfigurator.setEMFPersistence();
		simConfigurator.setViatraAsEngine(false);
		simConfigurator.setHybridPMC();
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
