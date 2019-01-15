package SimSG.Test.PM;

import SimSG.Core.PM.Match.PatternMatchingEngineEnum;
import SimSG.Core.PMC.PatternMatchingControllerEnum;
import SimSG.Core.Persistence.PersistenceManagerEnum;

class PatternMatchingViatraEMFTest extends PatternMatchingTest {
	
	protected void setEngineType() {
		engineType = PatternMatchingEngineEnum.ViatraEngine;
	}
	
	@Override
	protected void setPersistenceType() {
		persistenceType = PersistenceManagerEnum.SimplePersistence;
	}
	
	@Override
	protected void setPMCType() {
		pmcType = PatternMatchingControllerEnum.SimplePMC;
	}

}