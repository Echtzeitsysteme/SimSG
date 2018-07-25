package biochemsimulation.simulation.pmc;

import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.matching.PatternMatchingEngineFactory;

public class PatternMatchingControllerFactory {
	
	public static PatternMatchingController create(PatternMatchingControllerEnum type) {
		PatternMatchingController pmc = null;
		
		switch(type) {
		case SimpleViatraPMC : {
			pmc = new SimplePMC(PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.ViatraEngine));
			break;
		}
		case SimpleDemoclesPMC : {
			pmc = new SimplePMC(PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.DemoclesEngine));
			break;
		}
		}
		
		return pmc;
	}
}
