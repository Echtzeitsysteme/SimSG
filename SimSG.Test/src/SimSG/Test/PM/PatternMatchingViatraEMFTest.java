package SimSG.Test.PM;

import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.persistence.PersistenceManagerEnum;
import biochemsimulation.simulation.pmc.PatternMatchingControllerEnum;

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