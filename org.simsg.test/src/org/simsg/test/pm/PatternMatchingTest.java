package org.simsg.test.pm;

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

import org.simsg.container.Container;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.persistence.SimplePersistenceManager;
import org.simsg.core.pm.match.IMatch;
import org.simsg.core.pm.match.PatternMatchingEngine;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.simsgl.simSGL.SimSGLModel;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class PatternMatchingTest {
	public final static String TEST_MODEL_NAME = "PatternMatchingTest";
	
	protected PersistenceManager persistence;
	protected SimSGLModel ruleModel;
	protected Container containerModel;
	protected PatternMatchingEngine engine;
	protected PatternMatchingController pmc;
	
	
	protected PatternMatchingTest() {
		initPersistence();
	}
	
	protected void initPersistence() {
		persistence = new SimplePersistenceManager();
		persistence.setModelFolderPath(System.getProperty("user.dir")+"//models");
		persistence.init();
	}
	
	abstract protected void initEngine();
	
	abstract protected void initPMC();
	
	@BeforeAll
	void beforeAllTest() throws Exception {
		ruleModel = persistence.loadReactionRuleModel(TEST_MODEL_NAME);
		containerModel = persistence.loadReactionContainerModel(TEST_MODEL_NAME);
		initEngine();
		initPMC();
		pmc.setEngine(engine);
		pmc.loadModels(ruleModel, containerModel);
		pmc.initEngine();
		pmc.initController();
	}
	
	@AfterAll
	void afterAllTests() throws Exception {
		pmc.discardEngine();
		persistence.unloadReactionContainerModel(TEST_MODEL_NAME);
	}
	
	@Test
	void testGetAllMatches() {
		Collection<String> patternNames = pmc.getPatternContainer().getAllPatternHashes();
		Map<String, Collection<IMatch>> matches = null;
		try {
			pmc.collectAllMatches();
			matches = pmc.getAllMatches();
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
			pmc.collectMatches(patternName);
			matches = pmc.getMatches(patternName);
		} catch (Exception e) {
			fail("Couldn't get matches for pattern: "+patternName+". Error: "+e.getMessage());
			return;
		}
		assertNotNull(matches, "Couldn't get matches for pattern: "+patternName);
		assertEquals(numOfMatches, pmc.getMatchCount(patternName), "Number of matches weren't equal!");
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
	
	@Test
	void simpleInjectivityTest() {
		final int numOfMatches = 10;
		final String patternName = "simpleInjectivity_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}

	@Test
	void mediumInjectivityTest() {
		final int numOfMatches = 9;
		final String patternName = "mediumInjectivity_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void hardInjectivityTest() {
		final int numOfMatches = 224;
		final String patternName = "hardInjectivity_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void hardInjectivityTest2() {
		final int numOfMatches = 12;
		final String patternName = "hardInjectivity2_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void hardInjectivityTest3() {
		final int numOfMatches = 960;
		final String patternName = "hardInjectivity3_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleInjectivityWithStatesTest() {
		final int numOfMatches = 7;
		final String patternName = "simpleInjectivityWithStates_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumInjectivityWithStatesTest() {
		final int numOfMatches = 4;
		final String patternName = "mediumInjectivityWithStates_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	/*	Important: This pattern will cause democles to crash!
	 * 	From a semantic point of view, the correct result should be 2000.
	 *  The wrong result, stems from the fact that the constraint to remove self-occurences
	 *  in "Bound-Any-Type" scenarios removes 1 time the karth. Product of matches from the other context nodes.
	 *  E.g.: (A, A1, C) : A.x[A1.x], A1.x[A.x]&B.y[C.d], C.d[B.y]
	 *  -> Result for each context separateley A-> 10, A1->7, C->5
	 *  -> Combined it should be: A x A1 x C = 10*7*5 = 350
	 *  -> But due to the mentioned effect is: A x A1 x C - (A1 x C) = 10*7*5 - (7*5) = 315
	 *  Note: This only occurs, when "Bound-Any-Type"-Constrained are exactly mirrored in two or more participants
	 *  and these participants have the same type but different variable names.
	 *  E.g. A.x[A1.x] and A1.x[A.x]
	 */
	/*
	@Test
	void evilInjectivityAndBoundAnyTest() {
		final int numOfMatches = 1900;
		final String patternName = "evilInjectivityAndBoundAny_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	*/
	/*	Important: This pattern will cause democles to crash!
	 * 	From a semantic point of view, the correct result should be 1400.
	 *  The wrong result, stems from the fact that the constraint to remove self-occurences
	 *  in "Bound-Any-Type" scenarios removes 1 time the karth. Product of matches from the other context nodes.
	 *  E.g.: (A, A1, C) : A.x[A1.x], A1.x[A.x]&B.y[C.d], C.d[B.y]
	 *  -> Result for each context separateley A-> 10, A1->7, C->5
	 *  -> Combined it should be: A x A1 x C = 10*7*5 = 350
	 *  -> But due to the mentioned effect is: A x A1 x C - (A1 x C) = 10*7*5 - (7*5) = 315
	 *  Note: This only occurs, when "Bound-Any-Type"-Constrained are exactly mirrored in two or more participants
	 *  and these participants have the same type but different variable names.
	 *  E.g. A.x[A1.x] and A1.x[A.x]
	 */
	/*
	@Test
	void evilInjectivityAndBoundAnyWithStatesTest() {
		final int numOfMatches = 1330;
		final String patternName = "evilInjectivityAndBoundAnyWithStates_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	*/
	
	@Test
	void lightInjectivityAndBoundAnyTest() {
		final int numOfMatches = 100;
		final String patternName = "lightInjectivityAndBoundAny_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleMultiEdgeTest() {
		final int numOfMatches = 3;
		final String patternName = "simpleMultiEdge_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	// Pattern is symmetric -> hence 6 instead of 3 matches
	@Test
	void simpleMultiEdgeTest2() {
		final int numOfMatches = 6;
		final String patternName = "simpleMultiEdge2_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	// Pattern is symmetric -> hence 6 instead of 3 matches
	@Test
	void simpleMultiEdgeTest3() {
		final int numOfMatches = 6;
		final String patternName = "simpleMultiEdge3_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleMixedMultiEdgeTest() {
		final int numOfMatches = 4;
		final String patternName = "simpleMixedMultiEdge_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleDisjunctMultiEdgeTest() {
		final int numOfMatches = 4;
		final String patternName = "simpleDisjunctMultiEdge_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleDisjunctMultiEdgeTest2() {
		final int numOfMatches = 9;
		final String patternName = "simpleDisjunctMultiEdge2_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleMixedDisjunctMultiEdgeTest() {
		final int numOfMatches = 9;
		final String patternName = "simpleMixedDisjunctMultiEdge_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleMixedDisjunctMultiEdgeTest2() {
		final int numOfMatches = 24;
		final String patternName = "simpleMixedDisjunctMultiEdge2_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleMixedDisjunctMultiEdgeTest3() {
		final int numOfMatches = 9;
		final String patternName = "simpleMixedDisjunctMultiEdge3_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleMixedDisjunctMultiEdgeTest4() {
		final int numOfMatches = 54;
		final String patternName = "simpleMixedDisjunctMultiEdge4_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumDisjunctMultiEdgeTest() {
		final int numOfMatches = 27;
		final String patternName = "mediumDisjunctMultiEdge_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumDisjunctMultiEdgeTest2() {
		final int numOfMatches = 13;
		final String patternName = "mediumDisjunctMultiEdge2_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}

	@Test
	void mediumDisjunctMultiEdgeTest3() {
		final int numOfMatches = 24;
		final String patternName = "mediumDisjunctMultiEdge3_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumDisjunctMultiEdgeTest4() {
		final int numOfMatches = 30;
		final String patternName = "mediumDisjunctMultiEdge4_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumDisjunctMultiEdgeTest5() {
		final int numOfMatches = 36;
		final String patternName = "mediumDisjunctMultiEdge5_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumDisjunctMultiEdgeTest6() {
		final int numOfMatches = 18;
		final String patternName = "mediumDisjunctMultiEdge6_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumMultiEdgeTest() {
		final int numOfMatches = 18;
		final String patternName = "mediumMultiEdge_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumMultiEdgeTest2() {
		final int numOfMatches = 6;
		final String patternName = "mediumMultiEdge2_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}

	@Test
	void mediumMultiEdgeTest3() {
		final int numOfMatches = 12;
		final String patternName = "mediumMultiEdge3_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleAgentStateTest() {
		final int numOfMatches = 3;
		final String patternName = "simpleAgentState_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleAgentStateTest2() {
		final int numOfMatches = 9;
		final String patternName = "simpleAgentState2_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleAgentStateTest3() {
		final int numOfMatches = 6;
		final String patternName = "simpleAgentState3_rule_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
}
