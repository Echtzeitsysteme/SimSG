package org.simsg.test.pm;

import org.simsg.core.pm.democles.DemoclesEngineWrapper;
import org.simsg.core.pmc.hybrid.HybridPMC;

public class PatternMatchingHybridDemoclesEMFTest extends PatternMatchingTest {

	@Override
	protected void initEngine() {
		engine = new DemoclesEngineWrapper();
	}

	@Override
	protected void initPMC() {
		pmc = new HybridPMC();
	}

}
