package org.simsg.core.simulation.statistic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;
import org.simsg.core.simulation.SimulationState;


public class Observables extends SimulationStatistics {
	
	private Map<String, Observable> observables = new HashMap<>();
	
	public Observables(SimulationState state) {
		super(state);
	}
	
	public Observables(SimulationState state, Collection<SimulationDefinition.Observation> observations) {
		super(state);
		for(SimulationDefinition.Observation obs : observations) {
			if(obs instanceof SimulationDefinition.PatternObservation) {
				SimulationDefinition.PatternObservation pObs = (SimulationDefinition.PatternObservation)obs;
				observables.put(pObs.getName(), new Observable(pObs));
			}
		}
	}
	
	public Observables(Collection<Observable> observations) {
		super(null);
		for(Observable obs : observations) {
			observables.put(obs.getName(), obs);
		}
	}
	
	public void addObservation(SimulationDefinition.Observation observation) {
		if(observation instanceof SimulationDefinition.PatternObservation) {
			SimulationDefinition.PatternObservation pObs = (SimulationDefinition.PatternObservation)observation;
			observables.put(pObs.getName(), new Observable(pObs));
		}
	}
	
	public void addObservation(IBeXContextPattern pattern) {
		Observable obs = new Observable(pattern.getName());
		obs.setPattern(pattern);
		observables.put(obs.getName(), obs);
	}
	
	public Map<String, Observable> getObservables() {
		return observables;
	}
	
	@Override
	protected void displayStatistics() {
		ObservablesUi ui = new ObservablesUi("Simulation Results");
		ui.initDataSet(observables);
		ui.displayDataSet();
	}

	@Override
	public void logCurrentState() {
		double currentTime = state.getTime();
		
		for(String patternName : observables.keySet()) {
			observables.get(patternName).addMeasurement(currentTime, state.getMatchCount(patternName));
		}
	}

	@Override
	protected void saveStatistics() {
		// TODO Auto-generated method stub
	}

}
