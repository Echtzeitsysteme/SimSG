package org.simsg.test.gt;

import org.simsg.core.pm.democles.DemoclesEngineWrapper;
import org.simsg.core.pmc.hybrid.HybridPMC;

public class GraphTransformHybridDemoclesEMFTest extends GraphTransformTest {

	@Override
	protected void initEngine() {
		engine = new DemoclesEngineWrapper();
	}

	@Override
	protected void initPMC() {
		pmc = new HybridPMC();
	}

}
