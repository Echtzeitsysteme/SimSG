package org.simsg.core.simulation.statistic;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleEntry;
import java.util.Set;
import java.util.stream.Collectors;

import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;

public class MultiObservable extends Observable{
	
	private Set<Observable> observables = Collections.synchronizedSet(new LinkedHashSet<>());
	
	public MultiObservable(final String name, Collection<Observable> observables) {
		super(name);
		this.observables.addAll(observables.stream()
				.filter(observable -> observable.getName().equals(name))
				.collect(Collectors.toSet()));
	}
	
	public void updateMeasurements() {
		//TODO: Check if equal amount of measurements, else what to do? Interpolate time?
		Map<String, List<Entry<Double, Integer>>> runningMeasurements = new LinkedHashMap<>();
		for(Observable observable : observables) {
			Map<Double, Integer> currentMeasurements = observable.getMeasurements();
			Iterator<Entry<Double, Integer>> itr = currentMeasurements.entrySet().iterator();
			double time = 0;
			
			for(int i = 0; i<currentMeasurements.size(); i++) {
				List<Entry<Double, Integer>> currentEntry = runningMeasurements.get(String.valueOf(i));
				if(currentEntry == null) {
					currentEntry = new LinkedList<>();
					runningMeasurements.put(String.valueOf(i), currentEntry);
				}
				
				// calculate time delta
				Entry<Double, Integer> currentMeasurement = itr.next();
				double currentTime = currentMeasurement.getKey().doubleValue();
				double delta = currentTime - time;
				time = currentTime;
				
				// add delta instead of time
				currentEntry.add(new SimpleEntry<Double,Integer>(delta, currentMeasurement.getValue()));
			}
		}
		
		// calculate averages over time-deltas and match counts
		Map<Double, Integer> deltaMeasurements = new LinkedHashMap<>();
		runningMeasurements.values().forEach(list -> {
			double time = 0;
			int amount = 0;
			for(Entry<Double, Integer> entry : list) {
				time += entry.getKey();
				amount += entry.getValue();
			}
			time /= list.size();
			amount /= list.size();
			deltaMeasurements.put(time, amount);
		});
		
		// add time-deltas to get average simulation time
		double time = 0;
		for(Entry<Double, Integer> entry : deltaMeasurements.entrySet()) {
			measurements.put(time, entry.getValue());
			time += entry.getKey().doubleValue();			
		}
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String value) {
		this.name = value;
	}

	@Override
	public IBeXContextPattern getPattern() {
		return pattern;
	}

	@Override
	public void setPattern(IBeXContextPattern value) {
		this.pattern = value;	
	}

}
