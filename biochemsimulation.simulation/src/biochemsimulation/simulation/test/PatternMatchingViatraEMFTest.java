package biochemsimulation.simulation.test;

import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.persistence.PersistenceManagerEnum;

class PatternMatchingViatraEMFTest extends PatternMatchingTest {
	
	protected void setEngineType() {
		engineType = PatternMatchingEngineEnum.ViatraEngine;
	}
	
	@Override
	protected void setPersistenceType() {
		persistenceType = PersistenceManagerEnum.SimplePersistence;
	}

}