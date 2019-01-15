package SimSG.Test.GT;

import SimSG.Core.PM.Match.PatternMatchingEngineEnum;
import SimSG.Core.PMC.PatternMatchingControllerEnum;
import SimSG.Core.Persistence.PersistenceManagerEnum;

public class GraphTransformDemoclesEMFTest extends GraphTransformTest {

	@Override
	protected void setEngineType() {
		engineType = PatternMatchingEngineEnum.DemoclesEngine;

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
