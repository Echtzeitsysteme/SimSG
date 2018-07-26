package biochemsimulation.simulation.pmc;

public class PatternMatchingControllerFactory {
	
	public static PatternMatchingController create(PatternMatchingControllerEnum type) {
		PatternMatchingController pmc = null;
		
		switch(type) {
		case SimplePMC : {
			pmc = new SimplePMC();
			break;
		}
		}
		
		return pmc;
	}
}
