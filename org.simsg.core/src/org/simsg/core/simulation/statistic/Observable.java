package org.simsg.core.simulation.statistic;

import java.util.TreeMap;

import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContext;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextAlternatives;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXDisjointContextPattern;


public class Observable extends SimulationDefinition.impl.ObservationImpl implements SimulationDefinition.PatternObservation{
	protected String name;
	protected TreeMap<Double, Integer> measurements = new TreeMap<>();
	protected IBeXContextPattern pattern;
	
	public Observable(String name) {
		this.name = name;
	}
	
	public Observable(SimulationDefinition.PatternObservation other) {
		this.name = other.getName();
		setPattern(other.getPattern());
	}
	
	public void addMeasurement(double time, int amount) {
		measurements.put(time, amount);
	}
	
	public TreeMap<Double, Integer> getMeasurements() {
		return measurements;
	}
	
	public int drawSample(double queryTime) {
		Double result = measurements.floorKey(queryTime);
		if(result != null) {
			return measurements.get(result);
		} else {
			return measurements.firstEntry().getValue();
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
	public void setPattern(IBeXContext value) {
		if(value instanceof IBeXContextPattern) {
			pattern = (IBeXContextPattern) value; 
		} else if(value instanceof IBeXContextAlternatives) {
			pattern = ((IBeXContextAlternatives) value).getContext();
		} else {
			pattern = ((IBeXDisjointContextPattern) value).getNonOptimizedPattern();
		}
	}
}
