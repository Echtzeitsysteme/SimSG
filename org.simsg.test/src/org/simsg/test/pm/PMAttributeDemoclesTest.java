package org.simsg.test.pm;

import org.simsg.core.pm.democles.DemoclesEngineWrapper;
import org.simsg.core.pmc.SimplePMC;

public class PMAttributeDemoclesTest extends PatternMatchingAttributeTest {

	@Override
	protected void initEngine() {
		engine = new DemoclesEngineWrapper();
	}

	@Override
	protected void initPMC() {
		pmc = new SimplePMC();
	}
	
	@Override
	void mediumAttributeCheckTest() {
		// do nothing..
	}
	
	@Override
	void mediumAttributeCheckTest2() {
		// do nothing..
	}
	
	@Override
	void hardAttributeCheckTest() {
		// do nothing..
	}
	
}
