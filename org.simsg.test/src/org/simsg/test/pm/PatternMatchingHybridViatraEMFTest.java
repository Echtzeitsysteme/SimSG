package org.simsg.test.pm;

import org.simsg.core.persistence.PersistenceManagerEnum;
import org.simsg.core.pm.match.PatternMatchingEngineEnum;
import org.simsg.core.pmc.PatternMatchingControllerEnum;

public class PatternMatchingHybridViatraEMFTest extends PatternMatchingTest {

	@Override
	protected void setPersistenceType() {
		persistenceType = PersistenceManagerEnum.SimplePersistence;
	}

	@Override
	protected void setEngineType() {
		engineType = PatternMatchingEngineEnum.ViatraEngine;
	}

	@Override
	protected void setPMCType() {
		pmcType = PatternMatchingControllerEnum.HybridPMC;
	}

}
