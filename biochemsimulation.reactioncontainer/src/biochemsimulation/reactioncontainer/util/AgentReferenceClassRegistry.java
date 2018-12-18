package biochemsimulation.reactioncontainer.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;

public class AgentReferenceClassRegistry {
	public static final AgentReferenceClassRegistry eInstance = init(); 
	
	protected static AgentReferenceClassRegistry instance;
	protected Map<String, EClass> classes;
	
	protected AgentReferenceClassRegistry() {
		classes = new HashMap<String, EClass>();
	}
	
	public static synchronized AgentReferenceClassRegistry init() {
		if(instance == null){
            instance = new AgentReferenceClassRegistry();
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
