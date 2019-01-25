package org.simsg.test.pm;

import org.simsg.core.persistence.PersistenceManagerEnum;
import org.simsg.core.pm.match.PatternMatchingEngineEnum;
import org.simsg.core.pmc.PatternMatchingControllerEnum;

public class PMAttributeDemoclesTest extends PatternMatchingAttributeTest {

	protected void setEngineType() {
		engineType = PatternMatchingEngineEnum.DemoclesEngine;
	}
	
	@Override
	protected void setPersistenceType() {
		persistenceType = PersistenceManagerEnum.SimplePersistence;
	}
	
	@Override
	protected void setPMCType() {
		pmcType = PatternMatchingControllerEnum.SimplePMC;
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
