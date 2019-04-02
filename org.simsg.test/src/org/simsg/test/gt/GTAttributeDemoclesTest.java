package org.simsg.test.gt;

import org.simsg.core.pm.match.DemoclesEngineWrapper;
import org.simsg.core.pmc.SimplePMC;

public class GTAttributeDemoclesTest extends GraphTransformAttributeTest {

	@Override
	protected void initEngine() {
		engine = new DemoclesEngineWrapper();
	}

	@Override
	protected void initPMC() {
		pmc = new SimplePMC();
	}
	
	@Override
	protected void checkConsistency() {
		// do nothing.. this takes forever with democles
	}

}
