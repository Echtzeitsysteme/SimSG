package org.simsg.development;

import java.util.Collection;

import org.simsg.container.Agent;
import org.simsg.container.Container;
import org.simsg.core.gt.ModelGraphTransformer;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.persistence.PersistenceManagerEnum;
import org.simsg.core.persistence.PersistenceManagerFactory;
import org.simsg.core.pm.match.IMatch;
import org.simsg.core.pm.match.PatternMatchingEngine;
import org.simsg.core.pm.match.PatternMatchingEngineEnum;
import org.simsg.core.pm.match.PatternMatchingEngineFactory;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.pmc.PatternMatchingControllerEnum;
import org.simsg.core.pmc.PatternMatchingControllerFactory;
import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.utils.Runtimer;
import org.simsg.simsgl.simSGL.SimSGLModel;


public class Sandbox {

	public static void main(String[] args) {
		
		/*
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.setModelFolderPath(System.getProperty("user.dir")+"//models");
		pm.init();
		try {
			SimSGLModel ruleModel = pm.loadReactionRuleModel("AttributeConstraintTest");
			Container reactionContainer = pm.loadReactionContainerModel("AttributeConstraintTest");
			
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
			ReactionRuleTransformer gt = new ReactionRuleTransformer(pmc.getPatternContainer(), reactionContainer, pmc.getEPackageWrapper());
			gt.init();
			Collection<IMatch> lhsMatches = pmc.getMatches("r16_lhs");
			IMatch match = lhsMatches.iterator().next();
			Agent agent = (Agent)match.get("b");
			gt.applyRuleToMatch(match, "r16_lhs");
			agent = (Agent)match.get("b");
			System.out.println(agent);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		SimulationConfigurator simConfigurator = new SimulationConfigurator();
		simConfigurator.setModelFolder(System.getProperty("user.dir")+"//models");
		simConfigurator.setModel("NetworkExample");
		simConfigurator.setEMFPersistence();
		simConfigurator.setViatraAsEngine();
		simConfigurator.setSimplePMC();
		//simConfigurator.setSimpleSimulation(false);
		simConfigurator.setStochasticSimulation();
		simConfigurator.addComplexTerminationCondition();
		simConfigurator.addObservableStatistic();
		simConfigurator.addModelGraphPropertiesStatistic();
		simConfigurator.addPeriodicServiceRoutine(4);
		Simulation viatraSim = simConfigurator.createSimulation();
		viatraSim.initializeClocked();
		viatraSim.runClocked();
		System.out.println(viatraSim.results());
		viatraSim.displayResults();
		viatraSim.saveModelGraph(System.getProperty("user.dir")+"//models//result.xmi");
		viatraSim.finish();
		
		System.out.println(Runtimer.getInstance());
		
		
	}
	
}
