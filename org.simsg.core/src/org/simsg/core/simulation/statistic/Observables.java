package org.simsg.core.simulation.statistic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.simulation.SimulationState;


public class Observables extends SimulationStatistics {
	
	private Map<String, Observable> observables = new HashMap<>();
	
	public Observables(final SimulationState state, final PersistenceManager persistence) {
		super(state, persistence);
	}
	
	public Observables(final SimulationState state, final PersistenceManager persistence, Collection<? extends SimulationDefinition.Observation> observations) {
		super(state, persistence);
		for(SimulationDefinition.Observation obs : observations) {
			if(obs instanceof SimulationDefinition.PatternObservation && !(obs instanceof Observable)) {
				SimulationDefinition.PatternObservation pObs = (SimulationDefinition.PatternObservation)obs;
				observables.put(pObs.getName(), new Observable(pObs));
			} else if(obs instanceof Observable){
				observables.put(((Observable)obs).getName(), (Observable)obs);
			}
		}
	}
	
//	public Observables(final SimulationState state, final PersistenceManager persistence, Collection<? extends > observations) {
//		super(state, persistence);
//		for(Observable obs : observations) {
//			observables.put(obs.getName(), obs);
//		}
//	}
	
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
	protected void displayStatistics(boolean timeOnXAxis) {
		ObservablesUi ui = new ObservablesUi("Simulation Results");
		ui.setDisplayTimeOnXAxis(timeOnXAxis);
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
	public String saveStatistics() {
		StringBuilder sb = new StringBuilder();
		
		// add spread sheet header
		sb.append("Step, Time[ms]");
		for(String observable : observables.keySet()) {
			sb.append(", ");
			sb.append(observable);
		}
		sb.append("\n");
		
		Map<String, Iterator<Entry<Double, Integer>>> iterators = new HashMap<>();
		int maxIndex = Integer.MIN_VALUE;
		for(String patternName : observables.keySet()) {
			Observable obs = observables.get(patternName);
			if(obs.getMeasurements().size()>maxIndex) {
				maxIndex = obs.getMeasurements().size();
			}
			iterators.put(patternName, obs.getMeasurements().entrySet().iterator());
		}
		
		// print values
		for(int i = 0; i<maxIndex; i++) {
			sb.append(i);
			boolean timeSet = false;
			for(Iterator<Entry<Double, Integer>> itr : iterators.values()) {
				if(itr.hasNext()) {
					Entry<Double, Integer> entry = itr.next();
					if(!timeSet) {
						sb.append(", ");
						sb.append(entry.getKey());
						timeSet = true;
					}
					sb.append(", ");
					sb.append(entry.getValue());
				}
			}
			sb.append("\n");
		}
		String content = sb.toString();
		// save to file
		persistence.saveStatistics(state.getSimulationDefinition(), content);
		return content;
	}

}
