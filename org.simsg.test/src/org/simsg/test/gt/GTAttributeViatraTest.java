package org.simsg.test.gt;

import org.simsg.core.persistence.PersistenceManagerEnum;
import org.simsg.core.pm.match.PatternMatchingEngineEnum;
import org.simsg.core.pmc.PatternMatchingControllerEnum;

public class GTAttributeViatraTest extends GraphTransformAttributeTest {

	@Override
	protected void setEngineType() {
		engineType = PatternMatchingEngineEnum.ViatraEngine;

	}

	@Override
	protected void setPMCType() {
		pmcType = PatternMatchingControllerEnum.SimplePMC;

	}

	@Override
	protected void setPersistenceType() {
		persistenceType = PersistenceManagerEnum.SimplePersistence;
	}

}
