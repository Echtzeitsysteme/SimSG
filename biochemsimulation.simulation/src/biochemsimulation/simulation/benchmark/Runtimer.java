package biochemsimulation.simulation.benchmark;

import java.util.HashMap;
import java.util.Map;

public class Runtimer {
	
	private static Runtimer instance;
	
	private Map<Object, Map<String, Measurement>> measurements;

	public static synchronized Runtimer getInstance() {
		if(instance == null){
            instance = new Runtimer();
		}
		return instance;
    }
	
	private Runtimer() {
		measurements = new HashMap<Object, Map<String,Measurement>>();
	}
	
	public void measure(Object o, String functionName, Runnable method) {
		Measurement measurement = new Measurement();
		measurement.start();
		method.run();
		measurement.end();
		addToMeasurements(o, functionName, measurement);
	}
	
	public String functionReadout(Object o, String functionName) {
		Measurement m = measurements.get(o).get(functionName);
		return "Function: "+functionName+" -> "+m.toString();
	}
	
	public String objectReadout(Object o) {
		StringBuilder sb = new StringBuilder();
		sb.append("#### Measurements for Object: "+o+" ####\n");
		measurements.get(o).keySet().forEach(func -> {
			sb.append(functionReadout(o, func)+"\n");
		});
		sb.append("##################################################################\n");
		return sb.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("*************** Runtime measurements at sys-time: "+System.nanoTime()+"***************\n");
		measurements.keySet().forEach(o -> {
			sb.append(objectReadout(o));
		});
		sb.append("******************************************************************\n");
		return sb.toString();
	}
	
	public Measurement getMeasurement(Object o, String functionName) {
		return measurements.get(o).get(functionName);
	}
	
	public Map<String, Measurement> getMeasurements(Object o) {
		return measurements.get(o);
	}
	
	public Map<Object, Map<String, Measurement>> getAllMeasurements() {
		return measurements;
	}
	
	private void addToMeasurements(Object o, String functionName, Measurement measurement) {
		Map<String, Measurement> objectMeasures = measurements.get(o);
		if(objectMeasures == null) {
			objectMeasures = new HashMap<String, Measurement>();
			measurements.put(o, objectMeasures);
		}
		objectMeasures.put(functionName, measurement);
	}
	
}
