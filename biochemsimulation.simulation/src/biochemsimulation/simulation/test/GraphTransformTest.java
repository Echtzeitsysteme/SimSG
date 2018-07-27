package biochemsimulation.simulation.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
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

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class GraphTransformTest {
	
	protected PersistenceManager persistence;
	protected ReactionRuleModel ruleModel;
	protected ReactionContainer containerModel;
	protected PatternMatchingController pmc;
	
	protected PatternMatchingEngineEnum engineType;
	protected PatternMatchingControllerEnum pmcType;
	
	protected GraphTransformTest() {
		persistence = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		persistence.init();
		setEngineType();
		setPMCType();
	}
	
	abstract protected void setEngineType();
	
	abstract protected void setPMCType();

	@AfterAll
	void tearDownAfterClass() throws Exception {
		containerModel.eResource().unload();
		ruleModel.eResource().unload();
	}

	@BeforeEach
	void setUp() throws Exception {
		PatternMatchingEngine engine = PatternMatchingEngineFactory.create(engineType);
		pmc = PatternMatchingControllerFactory.create(pmcType);
		pmc.setEngine(engine);
		ruleModel = persistence.loadReactionRuleModel("GraphTransformTest");
		containerModel = persistence.loadReactionContainerModel("GraphTransformTest", true);
		pmc.loadModels(ruleModel, containerModel);
		pmc.initController();
		pmc.initEngine();
	}

	@AfterEach
	void tearDown() throws Exception {
		pmc.discardEngine();
	}
	
	private void collectMatches(String lhs, String rhs) {
		try {
			pmc.collectMatches(lhs);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		try {
			pmc.collectMatches(rhs);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	private IMatch getLhsAndCheckMatches(String lhs, String rhs, int lhsCount, int rhsCount) {
		Collection<IMatch> lhsMatches = pmc.getMatches(lhs);
		Collection<IMatch> rhsMatches = pmc.getMatches(rhs);
		assertEquals(lhsCount, lhsMatches.size(), "Number of matches weren't equal!");
		assertEquals(rhsCount, rhsMatches.size(), "Number of matches weren't equal!");
		return lhsMatches.iterator().next();
	}
	
	private IMatch getRhsAndCheckMatches(String lhs, String rhs, int lhsCount, int rhsCount) {
		Collection<IMatch> lhsMatches = pmc.getMatches(lhs);
		Collection<IMatch> rhsMatches = pmc.getMatches(rhs);
		assertEquals(lhsCount, lhsMatches.size(), "Number of matches weren't equal!");
		assertEquals(rhsCount, rhsMatches.size(), "Number of matches weren't equal!");
		return rhsMatches.iterator().next();
	}

	@Test
	void disjuncToBoundTest() {
		final int lhsPre = 660;
		final int lhsPost = 444;
		final int rhsPre = 0;
		final int rhsPost = 1;
		final String lhs = "disjuncToBound_rule_lhs";
		final String rhs = "disjuncToBound_rule_rhs";
		
		collectMatches(lhs, rhs);
		IMatch lhsMatch = getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		pmc.transform(lhsMatch);
		
		collectMatches(lhs, rhs);
		IMatch rhsMatch = getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
		pmc.transform(rhsMatch);
		
		collectMatches(lhs, rhs);
		getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		
	}
	
	@Test
	void changeStatesTest() {
		final int lhsPre = 5;
		final int lhsPost = 4;
		final int rhsPre = 2;
		final int rhsPost = 3;
		final String lhs = "changeStates_rule_lhs";
		final String rhs = "changeStates_rule_rhs";
		
		collectMatches(lhs, rhs);
		IMatch lhsMatch = getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		pmc.transform(lhsMatch);
		
		collectMatches(lhs, rhs);
		getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
	}

	@Test
	void breakUpWithStates() {
		final int lhsPre = 2;
		final int lhsPost = 1;
		final int rhsPre = 0;
		final int rhsPost = 4;
		final String lhs = "breakUpWithStates_rule_lhs";
		final String rhs = "breakUpWithStates_rule_rhs";
		
		collectMatches(lhs, rhs);
		IMatch lhsMatch = getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		pmc.transform(lhsMatch);
		
		collectMatches(lhs, rhs);
		getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
	}
	/*
	@Test
	void changeStatesTest() {
		fail("Not yet implemented");
	}
	
	@Test
	void changeStatesAndBind() {
		fail("Not yet implemented");
	}
	
	@Test
	void allTests() {
		fail("Not yet implemented");
	}
	*/

}
