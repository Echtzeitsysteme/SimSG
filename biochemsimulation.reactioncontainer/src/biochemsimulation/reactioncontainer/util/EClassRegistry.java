package biochemsimulation.reactioncontainer.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class EClassRegistry<Template extends EObject> {
	
	protected Map<String, EClass> classes;
	protected Map<String, EReference> references;
	
	public EClassRegistry() {
		classes = new HashMap<String, EClass>();
		references = new HashMap<String, EReference>();
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
	
	public void addAllClasses(Map<String, EClass> classes) {
		this.classes.putAll(classes);
	}
	
	public Collection<EClass> getAllClasses() {
		return classes.values();
	}
	
	public void registerReference(EReference ref) {
		references.putIfAbsent(ref.getName(), ref);
	}
	
	public EReference getRegisteredReference(String refName) {
		return references.get(refName);
	}
	
	public boolean containsReference(String refName) {
		return references.containsKey(refName);
	}
	
	public Collection<EReference> getAllReferences() {
		return references.values();
	}

}
