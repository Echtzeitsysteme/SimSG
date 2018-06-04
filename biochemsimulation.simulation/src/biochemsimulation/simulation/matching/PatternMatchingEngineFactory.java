package biochemsimulation.simulation.matching;

public class PatternMatchingEngineFactory {

	public static PatternMatchingEngine create(PatternMatchingEngineEnum type) {
		PatternMatchingEngine pme = null;
		
		switch(type) {
		case ViatraEngine : {
			pme = new ViatraEngine();
			break;
		}
		}
		
		return pme;
	}
}