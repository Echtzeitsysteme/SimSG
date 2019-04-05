package org.simsg.test.pm;

import org.simsg.core.pm.viatra.ViatraEngineWrapper;
import org.simsg.core.pmc.SimplePMC;

public class PMAttributeViatraTest extends PatternMatchingAttributeTest {

	@Override
	protected void initEngine() {
		engine = new ViatraEngineWrapper();
	}

	@Override
	protected void initPMC() {
		pmc = new SimplePMC();
	}
	
}
