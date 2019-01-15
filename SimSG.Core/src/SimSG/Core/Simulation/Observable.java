package SimSG.Core.Simulation;

import java.util.LinkedHashMap;
import java.util.Map;

public class Observable {
	private String name;
	private Map<Double, Integer> measurements;
	
	public Observable(String name) {
		this.name = name;
		measurements = new LinkedHashMap<Double, Integer>();
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
}
