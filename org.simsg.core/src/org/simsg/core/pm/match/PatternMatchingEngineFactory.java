package org.simsg.core.pm.match;

public class PatternMatchingEngineFactory {

	public static PatternMatchingEngine create(PatternMatchingEngineEnum type) {
		PatternMatchingEngine pme = null;
		
		switch(type) {
			case ViatraEngine : {
				pme = new ViatraEngineWrapper();
				break;
			}
			case DemoclesEngine : {
				pme = new DemoclesEngineWrapper();
				break;
			}
			case ParallelViatraEngine: {
				pme = new ParallelViatraEngine();
				break;
			}
		}
		return pme;
	}
}
