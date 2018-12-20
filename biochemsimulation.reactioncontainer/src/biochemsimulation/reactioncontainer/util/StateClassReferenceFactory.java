package biochemsimulation.reactioncontainer.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;

import biochemsimulation.reactionrules.reactionRules.Agent;
import biochemsimulation.reactionrules.reactionRules.Site;
import biochemsimulation.reactionrules.reactionRules.State;

public class StateClassReferenceFactory {
	protected EcoreFactory ecoreFactory;
	protected StateClassReferenceRegistry referenceRegistry;
	
	protected StateClassReferenceFactory() {
		ecoreFactory = EcoreFactory.eINSTANCE;
		referenceRegistry = new StateClassReferenceRegistry();
	}
	
	public EReference createReference(Agent agent, Site site, State state, EClass stateClass) {
		String refName = createReferenceName(agent, site, state);
		if(referenceRegistry.containsReference(refName)) {
			return referenceRegistry.getRegisteredReference(refName);
		}
		EReference reference = ecoreFactory.createEReference();
		reference.setUpperBound(1);
		reference.setLowerBound(0);
		reference.setName(refName);
		reference.setEType(stateClass);
		referenceRegistry.registerReference(reference);
		return reference;
	}
	
	public static String createReferenceName(Agent agent, Site site, State state) {
		return AgentClassReferenceFactory.createReferenceName(agent, site)+"_"+state.getName();
	}
}
