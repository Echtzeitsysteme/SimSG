package biochemsimulation.reactioncontainer.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;

public class AgentClassRegistry {
	protected Map<String, EClass> classes;
	
	public AgentClassRegistry() {
		classes = new HashMap<String, EClass>();
	}
	
	public void registerClass(EClass newClass) {
		classes.putIfAbsent(newClass.getName(), newClass);
	}
	
	public EClass getRegisteredClass(String className) {
		return classes.get(className);
	}
	
	public boolean containsClass(String className) {
		return classes.containsKey(className);
	}
}
