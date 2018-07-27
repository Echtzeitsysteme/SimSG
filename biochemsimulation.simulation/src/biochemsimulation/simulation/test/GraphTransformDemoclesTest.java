package biochemsimulation.simulation.test;

import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.pmc.PatternMatchingControllerEnum;

public class GraphTransformDemoclesTest extends GraphTransformTest {

	@Override
	protected void setEngineType() {
		engineType = PatternMatchingEngineEnum.DemoclesEngine;

	}

	@Override
	protected void setPMCType() {
		pmcType = PatternMatchingControllerEnum.SimplePMC;

	}

}
