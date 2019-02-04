package org.simsg.core.simulation.statistic;

import java.util.HashMap;
import java.util.Map;

import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.simulation.Observable;
import org.simsg.core.simulation.SimulationState;
import org.simsg.simsgl.utils.PatternContainer;


public class Observables extends SimulationStatistics {
	
	private Map<String, Observable> observables;
	
	public Observables(SimulationState state) {
		super(state);
		observables = new HashMap<String, Observable>();
		initObservables();
	}
	
	public void initObservables() {
		PatternContainer patternContainer = state.getPmc().getPatternContainer();
		for(String patternName : patternContainer.getObservablesPatterns().keySet()) {
			observables.put(patternName, new Observable(patternName));
		}
	}
	
	@Override
	protected void displayStatistics() {
		ObservablesUi ui = new ObservablesUi("Simulation Results");
		ui.initDataSet(observables);
		ui.displayDataSet();
	}

	@Override
	public void logCurrentState() {
		PatternMatchingController pmc = state.getPmc();
		double currentTime = state.getTime();
		
		for(String patternName : observables.keySet()) {
			observables.get(patternName).addMeasurement(currentTime, pmc.getMatchCount(patternName));
		}
	}
}
