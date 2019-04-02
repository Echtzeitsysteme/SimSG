package org.simsg.test.pm;

import org.simsg.core.pm.match.ViatraEngineWrapper;
import org.simsg.core.pmc.HybridPMC;

public class PatternMatchingHybridViatraEMFTest extends PatternMatchingTest {

	@Override
	protected void initEngine() {
		engine = new ViatraEngineWrapper();
	}

	@Override
	protected void initPMC() {
		pmc = new HybridPMC();
	}

}
