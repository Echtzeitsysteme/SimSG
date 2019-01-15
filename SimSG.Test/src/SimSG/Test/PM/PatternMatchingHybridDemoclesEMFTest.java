package SimSG.Test.PM;

import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.persistence.PersistenceManagerEnum;
import biochemsimulation.simulation.pmc.PatternMatchingControllerEnum;

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
