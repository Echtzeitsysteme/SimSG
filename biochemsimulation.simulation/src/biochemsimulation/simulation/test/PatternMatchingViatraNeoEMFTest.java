package biochemsimulation.simulation.test;

import biochemsimulation.simulation.persistence.PersistenceManagerEnum;

public class PatternMatchingViatraNeoEMFTest extends PatternMatchingViatraEMFTest {
	
	@Override
	protected void setPersistenceType() {
		persistenceType = PersistenceManagerEnum.NeoEMFPersistence;
	}
	
}
