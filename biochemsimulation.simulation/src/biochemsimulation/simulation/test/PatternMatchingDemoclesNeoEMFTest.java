package biochemsimulation.simulation.test;

import biochemsimulation.simulation.persistence.PersistenceManagerEnum;

public class PatternMatchingDemoclesNeoEMFTest extends PatternMatchingDemoclesEMFTest {
	
	@Override
	protected void setPersistenceType() {
		persistenceType = PersistenceManagerEnum.NeoEMFPersistence;
	}
	
}
