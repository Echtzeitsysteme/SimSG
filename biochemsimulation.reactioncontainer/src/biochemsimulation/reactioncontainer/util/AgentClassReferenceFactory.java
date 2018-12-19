package biochemsimulation.reactioncontainer.util;

import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EReference;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactionrules.reactionRules.Agent;
import biochemsimulation.reactionrules.reactionRules.Site;

public class AgentClassReferenceFactory {
	
	protected EcoreFactory ecoreFactory;
	protected AgentClassReferenceRegistry referenceRegistry;
	
	protected AgentClassReferenceFactory() {
		ecoreFactory = EcoreFactory.eINSTANCE;
		referenceRegistry = new AgentClassReferenceRegistry();
	}
	
	public EReference createReference(Agent agent, Site site) {
		String refName = createReferenceName(agent, site);
		if(referenceRegistry.containsReference(refName)) {
			return referenceRegistry.getRegisteredReference(refName);
		}
		EReference reference = ecoreFactory.createEReference();
		reference.setUpperBound(1);
		reference.setLowerBound(0);
		reference.setName(refName);
		reference.setEType(ReactionContainerPackage.Literals.AGENT);
		referenceRegistry.registerReference(reference);
		return reference;
	}
	
	public static String createReferenceName(Agent agent, Site site) {
		return agent.getName()+"_"+site.getName();
	}

}
