package biochemsimulation.simulation.test;

import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.persistence.PersistenceManagerEnum;
import biochemsimulation.simulation.pmc.PatternMatchingControllerEnum;

class PatternMatchingDemoclesEMFTest extends PatternMatchingTest {
	
	@Override
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
	
}
