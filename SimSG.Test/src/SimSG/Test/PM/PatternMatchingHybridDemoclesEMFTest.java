package SimSG.Test.PM;

import SimSG.Core.PM.Match.PatternMatchingEngineEnum;
import SimSG.Core.PMC.PatternMatchingControllerEnum;
import SimSG.Core.Persistence.PersistenceManagerEnum;

public class PatternMatchingHybridDemoclesEMFTest extends PatternMatchingTest {

	@Override
	protected void setPersistenceType() {
		persistenceType = PersistenceManagerEnum.SimplePersistence;
	}

	@Override
	protected void setEngineType() {
		engineType = PatternMatchingEngineEnum.DemoclesEngine;
	}

	@Override
	protected void setPMCType() {
		pmcType = PatternMatchingControllerEnum.HybridPMC;
	}

}
