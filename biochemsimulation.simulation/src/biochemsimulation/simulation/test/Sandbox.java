package biochemsimulation.simulation.test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.Simulation;
import biochemsimulation.simulation.SimulationConfigurator;
import biochemsimulation.simulation.benchmark.Runtimer;
import biochemsimulation.simulation.matching.IMatch;
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
		test1();
		test2();
		test5();
		test4();
		test6();
		*/
		//test7();
		//test8_kill();
		benchmark();
		//test4();
	}

	public static void test1() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();

		pm.availableReactionContainerModels().forEach(x -> System.out.println(x));
		pm.availableReactionRuleModels().forEach(x -> System.out.println(x));

		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("test2");
			System.out.println("Loaded reaction rule model: " + model1.getModel().getName());
			ReactionContainer model2 = pm.loadReactionContainerModel("test2");
			System.out.println("Loaded reaction container model: " + model2.getName());

			PatternMatchingEngine engine = PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.ViatraEngine);
			engine.setReactionRules(model1);
			engine.setReactionContainer(model2);
			engine.loadModels();
			engine.initEngine();
			Map<String, Collection<IMatch>> results = engine.getAllMatches();
			System.out.println("Found matches on given Models:");
			for (String key : results.keySet()) {
				System.out.println("Pattern: " + key + ", size: " + results.get(key).size());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void test2() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();

		try {
			double ns = 1E9;
			ReactionRuleModel model1 = pm.loadReactionRuleModel("test3");
			System.out.println("Loading reaction container model ...");
			long start = System.nanoTime();
			ReactionContainer model2 = pm.loadReactionContainerModel("test3");
			long end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");

			PatternMatchingController pmc = createSimplePMC_Viatra();
			System.out.println("Initializing pmc: loading models...");
			start = System.nanoTime();
			pmc.loadModels(model1, model2);
			end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");
			System.out.println("Initializing pmc: init engine...");
			start = System.nanoTime();
			pmc.initEngine();
			end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");
			System.out.println("Initializing pmc: init controller...");
			start = System.nanoTime();
			pmc.initController();
			pmc.randomizeRuleOrder(false);
			pmc.useReactionRate(false);
			end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");
			start = System.nanoTime();
			int iterations = 100;
			System.out.println("Running sim with " + iterations + " iterations ...");

			for (int i = 0; i < iterations; i++) {
				/*
				// <-- debugging stuff starts here
				pmc.collectAllMatches();
				Map<String, Collection<IMatch>> results = pmc.getAllMatches();
				for (String key : results.keySet()) {
					if (results.get(key) != null) {
						System.out.println("IterPre: " + i + " // Pattern: " + key + ", size: " + results.get(key).size());
					}
				}
				// debugging stuff ends here -->
				*/
				pmc.performTransformations();
				/*
				// <-- debugging stuff starts here
				pmc.collectAllMatches();
				results = pmc.getAllMatches();
				for (String key : results.keySet()) {
					if (results.get(key) != null) {
						System.out.println("IterPost: " + i + " // Pattern: " + key + ", size: " + results.get(key).size());
					}
				}
				// debugging stuff ends here -->
				*/
			}
			
			// <-- debugging stuff starts here
			pmc.collectAllMatches();
			Map<String, Collection<IMatch>> results = pmc.getAllMatches();
			for (String key : results.keySet()) {
				if (results.get(key) != null) {
					System.out.println("Pattern: " + key + ", size: " + results.get(key).size());
				}
			}
			// debugging stuff ends here -->

			end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");
			pmc.discardEngine();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test4() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("test3");
			ReactionContainer model2 = pm.loadReactionContainerModel("test3");
			PatternMatchingEngine engine = PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.ViatraEngine);
			engine.setReactionRules(model1);
			engine.setReactionContainer(model2);
			engine.loadModels();
			engine.initEngine();
			Map<String, Collection<IMatch>> matches = engine.getAllMatches();
			matches.forEach((name, m) -> {
				System.out.println("Pattern: "+name+", size: "+m.size());
			});
			engine.disposeEngine();
			org.eclipse.emf.ecore.util.EcoreUtil.delete(model2.getSimAgent().get(1));
			// calling unload leads to saving changes to persistence
			pm.unloadReactionContainerModel("test3");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void test5() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();

		try {
			double ns = 1E9;
			ReactionRuleModel model1 = pm.loadReactionRuleModel("test3");
			System.out.println("Loading reaction container model ...");
			long start = System.nanoTime();
			ReactionContainer model2 = pm.loadReactionContainerModel("test3");
			long end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");

			PatternMatchingController pmc = createSimplePMC_Democles();
			System.out.println("Initializing pmc: loading models...");
			start = System.nanoTime();
			pmc.loadModels(model1, model2);
			end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");
			System.out.println("Initializing pmc: init engine...");
			start = System.nanoTime();
			pmc.initEngine();
			end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");
			System.out.println("Initializing pmc: init controller...");
			start = System.nanoTime();
			pmc.initController();
			pmc.randomizeRuleOrder(false);
			pmc.useReactionRate(false);
			end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");
			start = System.nanoTime();
			int iterations = 100;
			System.out.println("Running sim with " + iterations + " iterations ...");

			for (int i = 0; i < iterations; i++) {
				/*
				// <-- debugging stuff starts here
				pmc.collectAllMatches();
				Map<String, Collection<IMatch>> results = pmc.getAllMatches();
				for (String key : results.keySet()) {
					if (results.get(key) != null) {
						System.out.println("IterPre: " + i + " // Pattern: " + key + ", size: " + results.get(key).size());
					}
				}
				// debugging stuff ends here -->
				*/
				pmc.performTransformations();
				/*
				// <-- debugging stuff starts here
				pmc.collectAllMatches();
				results = pmc.getAllMatches();
				for (String key : results.keySet()) {
					if (results.get(key) != null) {
						System.out.println("IterPost: " + i + " // Pattern: " + key + ", size: " + results.get(key).size());
					}
				}
				// debugging stuff ends here -->
				*/
			}
			
			// <-- debugging stuff starts here
			pmc.collectAllMatches();
			Map<String, Collection<IMatch>> results = pmc.getAllMatches();
			for (String key : results.keySet()) {
				if (results.get(key) != null) {
					System.out.println("Pattern: " + key + ", size: " + results.get(key).size());
				}
			}
			// debugging stuff ends here -->

			end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");
			
			pmc.discardEngine();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test6() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("PatternMatchingTest");
			ReactionContainer model2 = pm.loadReactionContainerModel("PatternMatchingTest");
			PatternMatchingEngine engine = PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.DemoclesEngine);
			engine.setReactionRules(model1);
			engine.setReactionContainer(model2);
			engine.loadModels();
			engine.initEngine();
			Map<String, Collection<IMatch>> matches = engine.getAllMatches();
			matches.forEach((name, m) -> {
				System.out.println("Pattern: "+name+", size: "+m.size());
			});
			engine.disposeEngine();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test7() {
		SimulationConfigurator simConfig = new SimulationConfigurator();
		simConfig.setModel("Bench_C8Entities_Var2PatternSize");
		simConfig.setSimplePersistence();
		simConfig.setViatraAsEngine();
		simConfig.setSimplePMC();
		simConfig.setPMCDeterministic(true);
		simConfig.setSimpleTerminationCondition(10);
		
		Simulation viatraSim = simConfig.createSimulation();
		
		simConfig.setDemoclesAsEngine();
		
		Simulation democlesSim = simConfig.createSimulation();
		
		viatraSim.initializeClocked();
		viatraSim.runClocked();
		System.out.println(viatraSim.results());
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
	
	public static void test8_kill() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("DemoclesKill1");
			ReactionContainer model2 = pm.loadReactionContainerModel("DemoclesKill1");
			PatternMatchingEngine engine = PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.DemoclesEngine);
			engine.setReactionRules(model1);
			engine.setReactionContainer(model2);
			engine.loadModels();
			Runtimer.getInstance().measure(engine, "init", () -> {
				try {
					engine.initEngine();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			//engine.initEngine();
			System.out.println(Runtimer.getInstance());
			Map<String, Collection<IMatch>> matches = engine.getAllMatches();
			matches.forEach((name, m) -> {
				if(m != null) {
					System.out.println("Pattern: "+name+", size: "+m.size());
				}
				
			});
			
			engine.disposeEngine();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
