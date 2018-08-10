package biochemsimulation.simulation.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.runners.MethodSorters;

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

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class GraphTransformTest {
	
	protected PersistenceManagerEnum persistenceType;
	protected PersistenceManager persistence;
	
	protected ReactionRuleModel ruleModel;
	protected ReactionContainer containerModel;
	protected PatternMatchingController pmc;
	
	protected PatternMatchingEngineEnum engineType;
	protected PatternMatchingControllerEnum pmcType;
	
	protected GraphTransformTest() {
		setPersistenceType();
		persistence = PersistenceManagerFactory.create(persistenceType);
		persistence.init();
		setEngineType();
		setPMCType();
	}
	
	abstract protected void setPersistenceType();
	
	abstract protected void setEngineType();
	
	abstract protected void setPMCType();
	
	@BeforeAll
	void beforeAllTest() throws Exception {
		ruleModel = persistence.loadReactionRuleModel("GraphTransformTest");
		containerModel = persistence.loadReactionContainerModel("GraphTransformTest");
		persistence.unloadReactionContainerModel("GraphTransformTest");
	}
	
	@BeforeEach
	void setUp() throws Exception {
		PatternMatchingEngine engine = PatternMatchingEngineFactory.create(engineType);
		pmc = PatternMatchingControllerFactory.create(pmcType);
		pmc.setEngine(engine);
		ruleModel = persistence.loadReactionRuleModel("GraphTransformTest");
		containerModel = persistence.loadReactionContainerModel("GraphTransformTest");
		pmc.loadModels(ruleModel, containerModel);
		pmc.initController();
		pmc.initEngine();
	}

	@AfterEach
	void tearDown() throws Exception {
		pmc.discardEngine();
		persistence.unloadReactionContainerModel("GraphTransformTest");
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
		IMatch rhsMatch = getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
		pmc.transform(rhsMatch);
		
		collectMatches(lhs, rhs);
		getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
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
		IMatch rhsMatch = getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
		pmc.transform(rhsMatch);
		
		collectMatches(lhs, rhs);
		getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
	}
	
	@Test
	void bindAndChangeStates() {
		final int lhsPre = 45;
		final int lhsPost = 16;
		final int rhsPre = 0;
		final int rhsPost = 1;
		final String lhs = "bindAndChangeStates_rule_lhs";
		final String rhs = "bindAndChangeStates_rule_rhs";
		
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
	void createAndDestroy() {
		final int lhsPre = 12;
		final int lhsPost = 11;
		final int rhsPre = 0;
		final int rhsPost = 1;
		final String lhs = "createAndDestroy_rule_lhs";
		final String rhs = "createAndDestroy_rule_rhs";
		
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
	void createAndDestroyFullVoid() {
		final int lhsPre = 72;
		final int lhsPost = 55;
		final int rhsPre = 1;
		final int rhsPost = 1;
		final String lhs = "createAndDestroyFullVoid_rule_lhs";
		final String rhs = "createAndDestroyFullVoid_rule_rhs";
		
		collectMatches(lhs, rhs);
		IMatch lhsMatch = getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		pmc.transform(lhsMatch);
		
		collectMatches(lhs, rhs);
		IMatch rhsMatch = getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
		pmc.transform(rhsMatch);
		
		collectMatches(lhs, rhs);
		getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		
	}

}
