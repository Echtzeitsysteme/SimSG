package biochemsimulation.simulation.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Collection;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.utils.PatternUtils;
import biochemsimulation.simulation.matching.IMatch;
import biochemsimulation.simulation.matching.PatternMatchingEngine;
import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.matching.PatternMatchingEngineFactory;
import biochemsimulation.simulation.persistence.PersistenceManager;
import biochemsimulation.simulation.persistence.PersistenceManagerEnum;
import biochemsimulation.simulation.persistence.PersistenceManagerFactory;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class PatternMatchingTest {
	public final static String TEST_MODEL_NAME = "PatternMatchingTest";
	
	protected PersistenceManager persistence;
	protected ReactionRuleModel ruleModel;
	protected ReactionContainer containerModel;
	protected PatternMatchingEngine engine;
	
	protected PatternMatchingEngineEnum engineType;
	
	protected PatternMatchingTest() {
		persistence = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		persistence.init();
		setEngineType();
		engine = PatternMatchingEngineFactory.create(engineType);
	}
	
	abstract protected void setEngineType();
	
	@BeforeAll
	void beforeAllTest() throws Exception {
		ruleModel = persistence.loadReactionRuleModel(TEST_MODEL_NAME);
		containerModel = persistence.loadReactionContainerModel(TEST_MODEL_NAME, true);
		engine.loadModels(containerModel, ruleModel);
		engine.initEngine();
	}
	
	@AfterAll
	void afterAllTests() throws Exception {
		engine.disposeEngine();
		containerModel.eResource().unload();
		ruleModel.eResource().unload();
	}

	@Test
	void testGetAllMatches() {
		Collection<String> patternNames = PatternUtils.getPatterns(ruleModel).keySet();
		Map<String, Collection<IMatch>> matches = null;
		try {
			matches = engine.getAllMatches();
		} catch (Exception e) {
			fail("Couldn't get all matches. Error: "+e.getMessage());
			return;
		}
		for(String patternName : patternNames) {
			assertTrue(matches.containsKey(patternName), "No matches found for pattern: "+patternName);
		}
	}
	
	private void getAndCheckMatches(String patternName, int numOfMatches) {
		Collection<IMatch> matches = null;
		try {
			matches = engine.getMatches(patternName);
		} catch (Exception e) {
			fail("Couldn't get matches for pattern: "+patternName+". Error: "+e.getMessage());
			return;
		}
		assertNotNull(matches, "Couldn't get matches for pattern: "+patternName);
		assertEquals(numOfMatches, matches.size(), "Number of matches weren't equal!");
	}

	@Test
	void simpleDisjunctTest() {
		final int numOfMatches = 100;
		final String patternName = "simpleDisjunct_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumDisjunctTest() {
		final int numOfMatches = 3600;
		final String patternName = "mediumDisjunct_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleBoundTest() {
		final int numOfMatches = 6;
		final String patternName = "simpleBound_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumBoundTest() {
		final int numOfMatches = 7;
		final String patternName = "mediumBound_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleDisjunctWithStatesTest() {
		final int numOfMatches = 50;
		final String patternName = "simpleDisjunctWithStates_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumDisjunctWithStatesTest() {
		final int numOfMatches = 250;
		final String patternName = "mediumDisjunctWithStates_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleBoundWithStatesTest() {
		final int numOfMatches = 9;
		final String patternName = "simpleBoundWithStates_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumBoundWithStatesTest() {
		final int numOfMatches = 11;
		final String patternName = "mediumBoundWithStates_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleWildcardTest() {
		final int numOfMatches = 72;
		final String patternName = "simpleWildcard_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumWildcardTest() {
		final int numOfMatches = 750;
		final String patternName = "mediumWildcard_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleWildcardWithStatesTest() {
		final int numOfMatches = 11;
		final String patternName = "simpleWildcardWithStates_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumWildcardWithStatesTest() {
		final int numOfMatches = 70;
		final String patternName = "mediumWildcardWithStates_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleBoundAnyTest() {
		final int numOfMatches = 7;
		final String patternName = "simpleBoundAny_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumBoundAnyTest() {
		final int numOfMatches = 42;
		final String patternName = "mediumBoundAny_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleBoundAnyWithStatesTest() {
		final int numOfMatches = 9;
		final String patternName = "simpleBoundAnyWithStates_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumBoundAnyWithStatesTest() {
		final int numOfMatches = 54;
		final String patternName = "mediumBoundAnyWithStates_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleBoundAnyTypeTest() {
		final int numOfMatches = 26;
		final String patternName = "simpleBoundAnyType_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumBoundAnyTypeTest() {
		final int numOfMatches = 156;
		final String patternName = "mediumBoundAnyType_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleBoundAnyTypeWithStatesTest() {
		final int numOfMatches = 13;
		final String patternName = "simpleBoundAnyTypeWithStates_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumBoundAnyTypeWithStatesTest() {
		final int numOfMatches = 39;
		final String patternName = "mediumBoundAnyTypeWithStates_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleMixedBoundTest() {
		final int numOfMatches = 11;
		final String patternName = "simpleMixedBound_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumMixedBoundTest() {
		final int numOfMatches = 11;
		final String patternName = "mediumMixedBound_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleMixedBoundWithStatesTest() {
		final int numOfMatches = 3;
		final String patternName = "simpleMixedBoundWithStates_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumMixedBoundWithStatesTest() {
		final int numOfMatches = 8;
		final String patternName = "mediumMixedBoundWithStates_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
}
