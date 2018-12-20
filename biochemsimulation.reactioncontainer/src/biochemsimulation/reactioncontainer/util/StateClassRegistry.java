package biochemsimulation.reactioncontainer.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;

public class StateClassRegistry {
	
	protected Map<String, EClass> classes;
	
	public StateClassRegistry() {
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
	
	public Collection<EClass> getAllClasses() {
		return classes.values();
	}
}
