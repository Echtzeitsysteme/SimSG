package biochemsimulation.simulation.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.matching.PatternMatchingEngineFactory;

class PatternMatchingDemoclesTest extends PatternMatchingTest {

	@Override
	void setUpBeforeClass() throws Exception {
		ruleModel = persistence.loadReactionRuleModel(TEST_MODEL_NAME);
		containerModel = persistence.loadReactionContainerModel(TEST_MODEL_NAME, true);
		engine = PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.DemoclesEngine);
		
	}

	@Override
	void tearDownAfterClass() throws Exception {
		engine.disposeEngine();
	}
	
	@Test
	void testGetMatches() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllMatches() {
		fail("Not yet implemented");
	}

	@Override
	void simpleDisjunctTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mediumDisjunctTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void simpleBoundTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mediumBoundTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void simpleDisjunctWithStatesTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mediumDisjunctWithStatesTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void simpleBoundWithStatesTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mediumBoundWithStatesTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void simpleWildcardTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mediumWildcardTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void simpleWildcardWithStatesTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mediumWildcardWithStatesTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void simpleBoundAnyTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mediumBoundAnyTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void simpleBoundAnyWithStatesTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mediumBoundAnyWithStatesTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void simpleBoundAnyTypeTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mediumBoundAnyTypeTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void simpleBoundAnyTypeWithStatesTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mediumBoundAnyTypeWithStatesTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void simpleMixedBoundTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mediumMixedBoundTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void simpleMixedBoundWithStatesTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mediumMixedBoundWithStatesTest() {
		// TODO Auto-generated method stub
		
	}

}
