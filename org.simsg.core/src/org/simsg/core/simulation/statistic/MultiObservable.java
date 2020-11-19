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
import java.util.Set;
import java.util.stream.Collectors;

import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;

public class MultiObservable extends Observable{
	
	private Set<Observable> observables = Collections.synchronizedSet(new LinkedHashSet<>());
	
	public MultiObservable(final IBeXContextPattern pattern, Collection<Observable> observables) {
		super(pattern.getName());
		this.pattern = pattern;
		this.observables.addAll(observables.stream()
				.filter(observable -> observable.getPattern().equals(pattern))
				.collect(Collectors.toSet()));
	}
	
	public void updateMeasurements() {
		//TODO: Check if equal amount of measurements, else what to do? Interpolate time?
		Map<Integer, List<Entry<Double, Integer>>> runningMeasurements = new LinkedHashMap<>();
		for(Observable observable : observables) {
			Map<Double, Integer> currentMeasurements = observable.getMeasurements();
			Iterator<Entry<Double, Integer>> itr = currentMeasurements.entrySet().iterator();
			
			for(int i = 0; i<currentMeasurements.size(); i++) {
				List<Entry<Double, Integer>> currentEntry = runningMeasurements.get(i);
				if(currentEntry == null) {
					currentEntry = new LinkedList<>();
					runningMeasurements.put(i, currentEntry);
				}
				currentEntry.add(itr.next());
			}
		}
		runningMeasurements.values().forEach(list -> {
			double time = 0;
			int amount = 0;
			for(Entry<Double, Integer> entry : list) {
				time += entry.getKey();
				amount += entry.getValue();
			}
			time /= list.size();
			amount /= list.size();
			measurements.put(time, amount);
		});
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
