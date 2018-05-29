package biochemsimulation.simulation;

import biochemsimulation.simulation.pattern_matching.PatternMatchingController;

public class Simulation {
	private PatternMatchingController pmc;

	protected Simulation() {
		
	}
	
	PatternMatchingController getPmc() {
		return pmc;
	}

	void setPmc(PatternMatchingController pmc) {
		this.pmc = pmc;
	}
}
