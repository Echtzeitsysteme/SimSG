package org.simsg.test.pm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.persistence.SimplePersistenceManager;
import org.simsg.core.pm.match.IMatch;
import org.simsg.core.pm.match.PatternMatchingEngine;
import org.simsg.core.pmc.PatternMatchingController;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class PatternMatchingAttributeTest {
	public final static String TEST_MODEL_NAME = "PatternMatchingAttributeTest";
	
	protected PersistenceManager persistence;
	protected Resource simulationDefinition;
	protected Resource simulationModel;
	protected PatternMatchingEngine engine;
	protected PatternMatchingController pmc;
	
	
	protected PatternMatchingAttributeTest() {
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
		simulationDefinition = persistence.loadSimulationDefinition(TEST_MODEL_NAME);
		simulationModel = persistence.loadSimulationModel(TEST_MODEL_NAME);
		initEngine();
		initPMC();
		pmc.setEngine(engine);
		pmc.loadModels(simulationDefinition, simulationModel);
		pmc.initEngine();
		pmc.initController();
	}
	
	@AfterAll
	void afterAllTests() throws Exception {
		pmc.discardEngine();
		persistence.unloadSimulationModel(TEST_MODEL_NAME);
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
