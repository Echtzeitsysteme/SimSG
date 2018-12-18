package biochemsimulation.reactioncontainer.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;

public class AgentClassRegistry {
	public static final AgentClassRegistry eInstance = init(); 
	
	protected static AgentClassRegistry instance;
	protected Map<String, EClass> classes;
	
	protected AgentClassRegistry() {
		classes = new HashMap<String, EClass>();
	}
	
	public static synchronized AgentClassRegistry init() {
		if(instance == null){
            instance = new AgentClassRegistry();
		}
		return instance;
	}
	
	public void registerClass(EClass newClass) {
		classes.putIfAbsent(newClass.getName(), newClass);
	}
	
	public EClass getRegisteredClass(String className) {
		return classes.get(className);
	}
}
