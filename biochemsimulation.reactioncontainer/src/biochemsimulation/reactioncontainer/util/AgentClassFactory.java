package biochemsimulation.reactioncontainer.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactionrules.reactionRules.Agent;
import biochemsimulation.reactionrules.reactionRules.Site;

public class AgentClassFactory {
 
	protected EcoreFactory ecoreFactory;
	protected EPackage ecorePackage;
	protected AgentClassRegistry classRegistry;
	protected AgentClassReferenceFactory referenceFactory;
	
	public AgentClassFactory(EPackage ecorePackage, AgentClassRegistry classRegistry) {
		ecoreFactory = EcoreFactory.eINSTANCE;
		this.referenceFactory = new AgentClassReferenceFactory();
		
		this.ecorePackage = ecorePackage;
		this.classRegistry = classRegistry;
	}

	
	public EClass createAgentClass(Agent agent) {
		if(classRegistry.containsClass(agent.getName())) {
			return classRegistry.getRegisteredClass(agent.getName());
		}
		
		EClass agentClass = ecoreFactory.createEClass();
		agentClass.getESuperTypes().add(ReactionContainerPackage.Literals.AGENT);
		agentClass.setName(agent.getName());
		ecorePackage.getEClassifiers().add(agentClass);
		classRegistry.registerClass(agentClass);
		// Create custom typed EReferences
		for(Site site : agent.getSites().getSites()) {
			agentClass.getEStructuralFeatures().add(referenceFactory.createReference(agent, site));
		}
		
		return agentClass;
	}

}
