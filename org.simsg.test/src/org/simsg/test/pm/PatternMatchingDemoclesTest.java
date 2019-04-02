package org.simsg.test.pm;

import org.simsg.core.pm.match.DemoclesEngineWrapper;
import org.simsg.core.pmc.SimplePMC;

class PatternMatchingDemoclesTest extends PatternMatchingTest {
	
	@Override
	protected void initEngine() {
		engine = new DemoclesEngineWrapper();
	}

	@Override
	protected void initPMC() {
		pmc = new SimplePMC();
	}
	
}
