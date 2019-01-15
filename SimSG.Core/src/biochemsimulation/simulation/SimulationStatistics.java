package biochemsimulation.simulation;

import java.util.HashMap;
import java.util.Map;

import biochemsimulation.reactionrules.utils.PatternContainer;
import biochemsimulation.simulation.pmc.PatternMatchingController;

public class SimulationStatistics {
	
	private Map<String, Observable> observables;
	
	public SimulationStatistics() {
		observables = new HashMap<String, Observable>();
	}
	
	public void initObservables(PatternContainer patternContainer) {
		for(String patternName : patternContainer.getObservablesPatterns().keySet()) {
			observables.put(patternName, new Observable(patternName));
		}
	}
	
	public void logCurrentState(SimulationState state) {
		PatternMatchingController pmc = state.getPmc();
		double currentTime = state.getTime();
		
		for(String patternName : observables.keySet()) {
			observables.get(patternName).addMeasurement(currentTime, pmc.getMatchCount(patternName));
		}
	}
	
	public void displayStatistics() {
		SimulationStatisticsUi ui = new SimulationStatisticsUi("Simulation Results");
		ui.initDataSet(observables);
		ui.displayDataSet();
	}
}
