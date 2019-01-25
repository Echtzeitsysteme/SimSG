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
import org.simsg.core.persistence.PersistenceManagerEnum;
import org.simsg.core.persistence.PersistenceManagerFactory;
import org.simsg.core.pm.match.IMatch;
import org.simsg.core.pm.match.PatternMatchingEngine;
import org.simsg.core.pm.match.PatternMatchingEngineEnum;
import org.simsg.core.pm.match.PatternMatchingEngineFactory;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.pmc.PatternMatchingControllerEnum;
import org.simsg.core.pmc.PatternMatchingControllerFactory;
import org.simsg.simsgl.simSGL.SimSGLModel;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class PatternMatchingAttributeTest {
	public final static String TEST_MODEL_NAME = "PatternMatchingAttributeTest";
	
	protected PersistenceManagerEnum persistenceType;
	protected PersistenceManager persistence;
	
	protected SimSGLModel ruleModel;
	protected Container containerModel;
	
	protected PatternMatchingEngine engine;
	protected PatternMatchingEngineEnum engineType;
	
	protected PatternMatchingController pmc;
	protected PatternMatchingControllerEnum pmcType;
	
	
	protected PatternMatchingAttributeTest() {
		setPersistenceType();
		setEngineType();
		setPMCType();
	}
	
	abstract protected void setPersistenceType();
	
	abstract protected void setEngineType();
	
	abstract protected void setPMCType();
	
	@BeforeAll
	void beforeAllTest() throws Exception {
		persistence = PersistenceManagerFactory.create(persistenceType);
		persistence.setModelFolderPath(System.getProperty("user.dir")+"//models");
		persistence.init();
		ruleModel = persistence.loadReactionRuleModel(TEST_MODEL_NAME);
		containerModel = persistence.loadReactionContainerModel(TEST_MODEL_NAME);
		engine = PatternMatchingEngineFactory.create(engineType);
		pmc = PatternMatchingControllerFactory.create(pmcType);
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
	void simpleAttributeCheckTest() {
		final int numOfMatches = 3;
		final String patternName = "simpleAttributeCheck_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleAttributeCheckTest2() {
		final int numOfMatches = 4;
		final String patternName = "simpleAttributeCheck2_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleAttributeCheckTest3() {
		final int numOfMatches = 7;
		final String patternName = "simpleAttributeCheck3_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleAttributeCheckTest4() {
		final int numOfMatches = 3;
		final String patternName = "simpleAttributeCheck4_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleAttributeCheckTest5() {
		final int numOfMatches = 4;
		final String patternName = "simpleAttributeCheck5_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void simpleAttributeCheckTest6() {
		final int numOfMatches = 4;
		final String patternName = "simpleAttributeCheck6_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumAttributeCheckTest() {
		final int numOfMatches = 4;
		final String patternName = "mediumAttributeCheck_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void mediumAttributeCheckTest2() {
		final int numOfMatches = 7;
		final String patternName = "mediumAttributeCheck2_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
	
	@Test
	void hardAttributeCheckTest() {
		final int numOfMatches = 8;
		final String patternName = "hardAttributeCheck_lhs";
		getAndCheckMatches(patternName, numOfMatches);
	}
}
