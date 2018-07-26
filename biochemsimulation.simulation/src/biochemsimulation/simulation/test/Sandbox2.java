package biochemsimulation.simulation.test;

import java.util.LinkedList;
import java.util.List;

public class Sandbox2 {
	
	int i;
	
	public static void main(String[] args) {
		Sandbox2 sb = new Sandbox2();
		List<Runnable> cs = new LinkedList<>();
		cs.add(sb::someFunction);
		cs.add(sb::someOtherFunction);
		cs.forEach(x -> sb.measure(sb, "someFunction",x));
	}
	
	Sandbox2() {
		i = 0;
	}
	
	public <T> void measure(T object, String functionName, Runnable method) {
		System.out.println(object.getClass().getSimpleName());
		method.run();
	}
	
	public void someFunction() {
		i++;
		System.out.println("Some function."+i);
	}
	
	public void someOtherFunction() {
		System.out.println("Some other function."+i);
	}
	
}
