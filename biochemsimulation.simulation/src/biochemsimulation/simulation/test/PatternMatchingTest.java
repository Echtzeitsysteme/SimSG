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
		assertEquals(matches.size(), numOfMatches, "Number of matches weren't equal. Got: "+matches.size()+", Expected: "+numOfMatches);
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
		fail("Not implemented!");
	}
	
	@Test
	void mediumDisjunctWithStatesTest() {
		fail("Not implemented!");
	}
	
	@Test
	void simpleBoundWithStatesTest() {
		fail("Not implemented!");
	}
	
	@Test
	void mediumBoundWithStatesTest() {
		fail("Not implemented!");
	}
	
	@Test
	void simpleWildcardTest() {
		fail("Not implemented!");
	}
	
	@Test
	void mediumWildcardTest() {
		fail("Not implemented!");
	}
	
	@Test
	void simpleWildcardWithStatesTest() {
		fail("Not implemented!");
	}
	
	@Test
	void mediumWildcardWithStatesTest() {
		fail("Not implemented!");
	}
	
	@Test
	void simpleBoundAnyTest() {
		fail("Not implemented!");
	}
	
	@Test
	void mediumBoundAnyTest() {
		fail("Not implemented!");
	}
	
	@Test
	void simpleBoundAnyWithStatesTest() {
		fail("Not implemented!");
	}
	
	@Test
	void mediumBoundAnyWithStatesTest() {
		fail("Not implemented!");
	}
	
	@Test
	void simpleBoundAnyTypeTest() {
		fail("Not implemented!");
	}
	
	@Test
	void mediumBoundAnyTypeTest() {
		fail("Not implemented!");
	}
	
	@Test
	void simpleBoundAnyTypeWithStatesTest() {
		fail("Not implemented!");
	}
	
	@Test
	void mediumBoundAnyTypeWithStatesTest() {
		fail("Not implemented!");
	}
	
	@Test
	void simpleMixedBoundTest() {
		fail("Not implemented!");
	}
	
	@Test
	void mediumMixedBoundTest() {
		fail("Not implemented!");
	}
	
	@Test
	void simpleMixedBoundWithStatesTest() {
		fail("Not implemented!");
	}
	
	@Test
	void mediumMixedBoundWithStatesTest() {
		fail("Not implemented!");
	}

}
