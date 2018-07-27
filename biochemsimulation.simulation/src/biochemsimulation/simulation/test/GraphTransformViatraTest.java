package biochemsimulation.simulation.test;

import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.pmc.PatternMatchingControllerEnum;

public class GraphTransformViatraTest extends GraphTransformTest {

	@Override
	protected void setEngineType() {
		engineType = PatternMatchingEngineEnum.ViatraEngine;

	}

	@Override
	protected void setPMCType() {
		pmcType = PatternMatchingControllerEnum.SimplePMC;

	}

}
