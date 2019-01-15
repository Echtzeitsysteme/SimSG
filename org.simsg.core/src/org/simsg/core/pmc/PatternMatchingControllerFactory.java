package org.simsg.core.pmc;

public class PatternMatchingControllerFactory {
	
	public static PatternMatchingController create(PatternMatchingControllerEnum type) {
		PatternMatchingController pmc = null;
		
		switch(type) {
		case SimplePMC : {
			pmc = new SimplePMC();
			break;
		}
		case HybridPMC : {
			pmc = new HybridPMC();
			break;
		}
		}
		
		return pmc;
	}
}
