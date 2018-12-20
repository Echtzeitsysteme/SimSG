package biochemsimulation.reactioncontainer.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EReference;

public class StateClassReferenceRegistry {
	protected Map<String, EReference> references;
	
	public StateClassReferenceRegistry() {
		references = new HashMap<String, EReference>();
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
}
