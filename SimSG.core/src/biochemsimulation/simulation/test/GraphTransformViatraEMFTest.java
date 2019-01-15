package biochemsimulation.simulation.test;

import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.persistence.PersistenceManagerEnum;
import biochemsimulation.simulation.pmc.PatternMatchingControllerEnum;

public class GraphTransformViatraEMFTest extends GraphTransformTest {

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
