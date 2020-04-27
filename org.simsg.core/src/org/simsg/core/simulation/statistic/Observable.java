package org.simsg.core.simulation.statistic;

import java.util.LinkedHashMap;
import java.util.Map;

import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;


public class Observable extends SimulationDefinition.impl.ObservationImpl implements SimulationDefinition.PatternObservation{
	private String name;
	private Map<Double, Integer> measurements = new LinkedHashMap<>();
	private IBeXContextPattern pattern;
	
	public Observable(String name) {
		this.name = name;
	}
	
	public Observable(SimulationDefinition.PatternObservation other) {
		this.name = other.getName();
		pattern = other.getPattern();
	}
	
	public void addMeasurement(double time, int amount) {
		measurements.put(time, amount);
	}
	
	public Map<Double, Integer> getMeasurements() {
		return measurements;
	}

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
