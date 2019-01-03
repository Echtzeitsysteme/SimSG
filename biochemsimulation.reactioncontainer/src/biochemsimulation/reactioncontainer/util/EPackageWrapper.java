package biochemsimulation.reactioncontainer.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import biochemsimulation.reactionrules.reactionRules.Agent;

public class EPackageWrapper {
	EPackage ePack;
	
	private Map<String, EClass> classMap;
	private Map<String, EReference> referenceMap;
	private AgentFactory agentFactory;
	private EClassRegistry<Agent> classRegistry;
	
	public EPackageWrapper(EPackage ePack) {
		this.ePack = ePack;
		mapElements();
		initClassRegistry();
		agentFactory = new AgentFactory(ePack, classRegistry);
	}
	
	private void mapElements() {
		classMap = new HashMap<String, EClass>();
		referenceMap = new HashMap<String, EReference>();
		
		ePack.getEClassifiers().forEach(classifier-> {
			if(classifier instanceof EClass) {
				EClass eClass = (EClass)classifier;
				classMap.put(eClass.getName(), eClass);
				eClass.getEStructuralFeatures().forEach(reference->{
					if(reference instanceof EReference) {
						EReference eRef = (EReference)reference;
						referenceMap.putIfAbsent(reference.getName(), eRef);
					}
				});
			}
			
		});
	}
	
	private void initClassRegistry() {
		classRegistry = new EClassRegistry<Agent>();
		classRegistry.addAllClasses(classMap);
	}
	
	public EPackage getPackage( ) {
		return ePack;
	}
	
	public AgentFactory getAgentFactory() {
		return agentFactory;
	}
	
	public EClass getClass(String typeName) {
		return classMap.get(typeName);
	}
	
	public EReference getEReference(String refName) {
		return referenceMap.get(refName);
	}
}
