package org.simsg.test.gt;

import org.simsg.core.pm.viatra.ViatraEngineWrapper;
import org.simsg.core.pmc.SimplePMC;

public class GTAttributeViatraTest extends GraphTransformAttributeTest {

	@Override
	protected void initEngine() {
		engine = new ViatraEngineWrapper();
	}

	@Override
	protected void initPMC() {
		pmc = new SimplePMC();
	}

}
