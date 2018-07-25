package biochemsimulation.simulation.test;

import static org.junit.jupiter.api.Assertions.*;

import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.matching.PatternMatchingEngineFactory;

class PatternMatchingDemoclesTest extends PatternMatchingTest {
	
	@Override
	protected void setEngineType() {
		engineType = PatternMatchingEngineEnum.DemoclesEngine;
	}
	
}
