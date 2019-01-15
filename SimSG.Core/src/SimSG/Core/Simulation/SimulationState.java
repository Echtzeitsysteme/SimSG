package SimSG.Core.Simulation;

import SimSG.Core.PMC.PatternMatchingController;

public class SimulationState {
	private int iterations;
	private double time;
	private PatternMatchingController pmc;
	
	public SimulationState() {
		iterations = 0;
		time = 0;
	}
	
	public int getIterations() {
		return iterations;
	}
	
	public double getTime() {
		return time;
	}
	
	public PatternMatchingController getPmc() {
		return pmc;
	}
	
	public void setPmc(PatternMatchingController pmc) {
		this.pmc = pmc;
	}
	
	public void incrementIterations() {
		iterations++;
	}
	
	public void elapseTime(double step) {
		time += step;
	}
}
