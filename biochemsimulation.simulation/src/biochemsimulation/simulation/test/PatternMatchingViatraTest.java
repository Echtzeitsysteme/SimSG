package biochemsimulation.simulation.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.matching.PatternMatchingEngineFactory;

class PatternMatchingViatraTest extends PatternMatchingTest {
	
	protected void setEngineType() {
		engineType = PatternMatchingEngineEnum.ViatraEngine;
	}

}