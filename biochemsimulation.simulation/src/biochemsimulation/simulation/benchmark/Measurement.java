package biochemsimulation.simulation.benchmark;

public class Measurement {
	
	final public static double NANOSECONDS = 1E9;
	
	private double start;
	private double end;
	
	public void start() {
		start = System.nanoTime();
	}
	
	public void end() {
		end = System.nanoTime();
	}
	
	public double durationSeconds() {
		return (end-start)/NANOSECONDS;
	}
	
	public double durationNanoSeconds() {
		return end-start;
	}
	
	@Override
	public String toString() {
		return "Execution took: "+durationSeconds()+"s ("+durationNanoSeconds()+"ns)";
	}
}
