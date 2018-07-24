package biochemsimulation.simulation.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.matching.PatternMatchingEngine;
import biochemsimulation.simulation.persistence.PersistenceManager;
import biochemsimulation.simulation.persistence.PersistenceManagerEnum;
import biochemsimulation.simulation.persistence.PersistenceManagerFactory;
import biochemsimulation.simulation.persistence.SimplePersistenceManager;

abstract class PatternMatchingTest {
	public final static String TEST_MODEL_NAME = "PatternMatchingTest"; 
	
	protected PersistenceManager persistence;
	protected ReactionRuleModel ruleModel;
	protected ReactionContainer containerModel;
	protected PatternMatchingEngine engine;
	
	protected PatternMatchingTest() {
		persistence = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		persistence.init();
	}

	@BeforeAll
	abstract void setUpBeforeClass() throws Exception;

	@AfterAll
	abstract void tearDownAfterClass() throws Exception;

	@Test
	abstract void simpleDisjunctTest();
	
	@Test
	abstract void mediumDisjunctTest();
	
	@Test
	abstract void simpleBoundTest();
	
	@Test
	abstract void mediumBoundTest();
	
	@Test
	abstract void simpleDisjunctWithStatesTest();
	
	@Test
	abstract void mediumDisjunctWithStatesTest();
	
	@Test
	abstract void simpleBoundWithStatesTest();
	
	@Test
	abstract void mediumBoundWithStatesTest();
	
	@Test
	abstract void simpleWildcardTest();
	
	@Test
	abstract void mediumWildcardTest();
	
	@Test
	abstract void simpleWildcardWithStatesTest();
	
	@Test
	abstract void mediumWildcardWithStatesTest();
	
	@Test
	abstract void simpleBoundAnyTest();
	
	@Test
	abstract void mediumBoundAnyTest();
	
	@Test
	abstract void simpleBoundAnyWithStatesTest();
	
	@Test
	abstract void mediumBoundAnyWithStatesTest();
	
	@Test
	abstract void simpleBoundAnyTypeTest();
	
	@Test
	abstract void mediumBoundAnyTypeTest();
	
	@Test
	abstract void simpleBoundAnyTypeWithStatesTest();
	
	@Test
	abstract void mediumBoundAnyTypeWithStatesTest();
	
	@Test
	abstract void simpleMixedBoundTest();
	
	@Test
	abstract void mediumMixedBoundTest();
	
	@Test
	abstract void simpleMixedBoundWithStatesTest();
	
	@Test
	abstract void mediumMixedBoundWithStatesTest();

}
