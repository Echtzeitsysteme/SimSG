package biochemsimulation.simulation.test;

import java.util.List;
import java.util.stream.Collectors;

import biochemsimulation.reactioncontainer.ReactionContainer;
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
import biochemsimulation.simulation.pmc.GT.ReactionRuleTransformer;

public class Sandbox {

	public static void main(String[] args) {
		/*
		test1();
		test4();
		test6();
		*/
		test7();
		//test8_kill();
		//benchmark();
		//test4();
		//hybridTest();
		//hybridObsTest();
	}
	
	public static void test7() {
		SimulationConfigurator simConfig = new SimulationConfigurator();
		simConfig.setModel("Goldbeter_Koshland");
		simConfig.setSimplePersistence();
		simConfig.setViatraAsEngine();
		simConfig.setHybridPMC();
		//simConfig.setSimpleSimulation();
		simConfig.setStochasticSimulation();
		//simConfig.setPMCDeterministic(true);
		simConfig.setSimpleTerminationCondition(7000);
		
		Simulation viatraSim = simConfig.createSimulation();
		
		simConfig.setDemoclesAsEngine();
		
		Simulation democlesSim = simConfig.createSimulation();
		
		viatraSim.initializeClocked();
		viatraSim.runClocked();
		System.out.println(viatraSim.results());
		viatraSim.displayResults();
		viatraSim.finish();
		
		democlesSim.initializeClocked();
		democlesSim.runClocked();
		System.out.println(democlesSim.results());
		democlesSim.finish();
		
		System.out.println(Runtimer.getInstance());
		Runtimer.getInstance().toFile();
		
	}
	
	public static void benchmark() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.NeoEMFPersistence);
		pm.init();
		List<String> models = pm.availableReactionRuleModels().stream().filter(x->x.contains("Bench_konj_Var1000")).collect(Collectors.toList());
		SimulationConfigurator simConfig = new SimulationConfigurator();
		simConfig.setSimplePersistence();
		simConfig.setSimplePMC();
		simConfig.setSimpleSimulation();
		simConfig.setPMCDeterministic(true);
		simConfig.setSimpleTerminationCondition(10);
		/*
		simConfig.setDemoclesAsEngine();
		models.forEach(x-> {
			simConfig.setModel(x);
			Simulation democlesSim = simConfig.createSimulation();
			democlesSim.initializeClocked();
			democlesSim.runClocked();
			System.out.println(democlesSim.results());
			democlesSim.finish();
		});
		*/
		
		simConfig.setViatraAsEngine();
		models.forEach(x-> {
			simConfig.setModel(x);
			Simulation viatraSim = simConfig.createSimulation();
			viatraSim.initializeClocked();
			viatraSim.runClocked();
			System.out.println(viatraSim.results());
			viatraSim.finish();
		});
		
		
		
		Runtimer.getInstance().toFile();
		
	}
	
	public static void hybridTest() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		
		PatternMatchingController pmc = PatternMatchingControllerFactory
				.create(PatternMatchingControllerEnum.HybridPMC);
		PatternMatchingEngine engine = PatternMatchingEngineFactory
				.create(PatternMatchingEngineEnum.DemoclesEngine);
		pmc.setEngine(engine);
		
		PatternMatchingController pmc2 = createSimplePMC_Democles();
		
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("Bench_C8Entities_Var5PatternSize");
			ReactionContainer model2 = pm.loadReactionContainerModel("Bench_C8Entities_Var5PatternSize");
			/*
			Map<String, biochemsimulation.reactionrules.reactionRules.Pattern> rulePatterns = PatternUtils.getPatterns(model1);
			Map<String, HybridPattern> hybridPatterns = new HashMap<String, HybridPattern>();
			rulePatterns.forEach((name, pattern) -> {
				hybridPatterns.put(name, new HybridPattern(name, pattern));
			});
			hybridPatterns.forEach((name, pattern) -> {
				System.out.println(pattern);
			});
			*/
			
			pmc.loadModels(model1, model2);
			Runtimer.getInstance().measure(pmc, "hybridInitEngine", () -> {
				try {
					pmc.initEngine();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			//pmc.initEngine();
			Runtimer.getInstance().measure(pmc, "hybridInitController", () -> {
				try {
					pmc.initController();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			//pmc.initController();
			Runtimer.getInstance().measure(pmc, "hybridInitCollect", () -> {
				try {
					pmc.collectAllMatches();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			//pmc.collectAllMatches();
			System.out.println(pmc.getMatchCount("destroy_lhs"));
			pmc.discardEngine();
			pm.unloadReactionContainerModel("Bench_C8Entities_Var5PatternSize");
			
			model2 = pm.loadReactionContainerModel("Bench_C8Entities_Var5PatternSize");
			pmc2.loadModels(model1, model2);
			Runtimer.getInstance().measure(pmc2, "simpleInitEngine", () -> {
				try {
					pmc2.initEngine();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			//pmc.initEngine();
			Runtimer.getInstance().measure(pmc2, "simpleInitController", () -> {
				try {
					pmc2.initController();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			//pmc.initController();
			Runtimer.getInstance().measure(pmc2, "simpleInitCollect", () -> {
				try {
					pmc2.collectAllMatches();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			//pmc.collectAllMatches();
			System.out.println(pmc2.getMatchCount("destroy_lhs"));
			pmc2.discardEngine();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Runtimer.getInstance());
	}
	
	public static void hybridGTTest() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		
		PatternMatchingController pmc = PatternMatchingControllerFactory
				.create(PatternMatchingControllerEnum.HybridPMC);
		PatternMatchingEngine engine = PatternMatchingEngineFactory
				.create(PatternMatchingEngineEnum.ViatraEngine);
		pmc.setEngine(engine);
		
		
		PatternMatchingController pmc2 = createSimplePMC_Democles();
		
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("GraphTransformTest");
			ReactionContainer model2 = pm.loadReactionContainerModel("GraphTransformTest");
			
			
			pmc.loadModels(model1, model2);
			pmc.initEngine();
			pmc.initController();
			
			ReactionRuleTransformer gt = new ReactionRuleTransformer(pmc.getPatternContainer(), model2);
			gt.init();
			
			pmc.collectAllMatches();
			System.out.println(pmc.getMatchCount("bindAndChangeStates_rule_lhs"));
			gt.applyRuleToMatch(pmc.getRandomMatch("bindAndChangeStates_rule_lhs"));
			pmc.collectAllMatches();
			System.out.println(pmc.getMatchCount("bindAndChangeStates_rule_lhs"));
			pmc.discardEngine();
			pm.unloadReactionContainerModel("GraphTransformTest");
			
			/*
			model2 = pm.loadReactionContainerModel("GraphTransformTest");
			gt = new ReactionRuleTransformer(model1, model2);
			gt.init();
			
			pmc2.loadModels(model1, model2);
			pmc2.initEngine();
			pmc2.initController();
			pmc2.collectAllMatches();
			System.out.println(pmc2.getMatchCount("bindAndChangeStates_rule_lhs"));
			gt.applyRuleToMatch(pmc2.getRandomMatch("bindAndChangeStates_rule_lhs"));
			pmc2.collectAllMatches();
			System.out.println(pmc2.getMatchCount("bindAndChangeStates_rule_lhs"));
			
			pmc2.discardEngine();
			*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Runtimer.getInstance());
	}
	
	public static void hybridObsTest() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		
		PatternMatchingController pmc = PatternMatchingControllerFactory
				.create(PatternMatchingControllerEnum.SimplePMC);
		PatternMatchingEngine engine = PatternMatchingEngineFactory
				.create(PatternMatchingEngineEnum.ViatraEngine);
		pmc.setEngine(engine);
		
		
		PatternMatchingController pmc2 = createSimplePMC_Democles();
		
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("HybridPatternSandbox");
			ReactionContainer model2 = pm.loadReactionContainerModel("HybridPatternSandbox");
			
			
			pmc.loadModels(model1, model2);
			pmc.initEngine();
			pmc.initController();
			
			ReactionRuleTransformer gt = new ReactionRuleTransformer(pmc.getPatternContainer(), model2);
			gt.init();
			
			pmc.collectAllMatches();
			System.out.println(pmc.getMatchCount("r2_lhs"));
			gt.applyRuleToMatch(pmc.getRandomMatch("r2_lhs"));
			pmc.collectAllMatches();
			System.out.println(pmc.getMatchCount("r2_lhs"));
			pmc.discardEngine();
			pm.unloadReactionContainerModel("HybridPatternSandbox");
			
			/*
			model2 = pm.loadReactionContainerModel("GraphTransformTest");
			gt = new ReactionRuleTransformer(model1, model2);
			gt.init();
			
			pmc2.loadModels(model1, model2);
			pmc2.initEngine();
			pmc2.initController();
			pmc2.collectAllMatches();
			System.out.println(pmc2.getMatchCount("bindAndChangeStates_rule_lhs"));
			gt.applyRuleToMatch(pmc2.getRandomMatch("bindAndChangeStates_rule_lhs"));
			pmc2.collectAllMatches();
			System.out.println(pmc2.getMatchCount("bindAndChangeStates_rule_lhs"));
			
			pmc2.discardEngine();
			*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Runtimer.getInstance());
	}
	
	public static PatternMatchingController createSimplePMC_Viatra() {
		PatternMatchingController pmc = PatternMatchingControllerFactory
				.create(PatternMatchingControllerEnum.SimplePMC);
		PatternMatchingEngine engine = PatternMatchingEngineFactory
				.create(PatternMatchingEngineEnum.ViatraEngine);
		pmc.setEngine(engine);
		return pmc;
	}
	
	public static PatternMatchingController createSimplePMC_Democles() {
		PatternMatchingController pmc = PatternMatchingControllerFactory
				.create(PatternMatchingControllerEnum.SimplePMC);
		PatternMatchingEngine engine = PatternMatchingEngineFactory
				.create(PatternMatchingEngineEnum.DemoclesEngine);
		pmc.setEngine(engine);
		return pmc;
	}


}
