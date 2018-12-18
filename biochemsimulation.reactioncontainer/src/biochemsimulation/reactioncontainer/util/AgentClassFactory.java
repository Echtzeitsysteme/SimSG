package biochemsimulation.reactioncontainer.util;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactionrules.reactionRules.Agent;
import biochemsimulation.reactionrules.reactionRules.Site;

public class AgentClassFactory {
	
	public static final AgentClassFactory eInstance = init(); 
	
	protected static AgentClassFactory instance;
	protected EcoreFactory ecoreFactory;
	protected EPackage ecorePackage;
	protected AgentClassRegistry classRegistry;
	protected AgentReferenceClassFactory referenceClassFactory;
	
	protected AgentClassFactory() {
		ecorePackage = ReactionContainerPackage.eINSTANCE;
		ecoreFactory = EcoreFactory.eINSTANCE;
		classRegistry = AgentClassRegistry.eInstance;
		referenceClassFactory = AgentReferenceClassFactory.eInstance;
	}
	
	public static synchronized AgentClassFactory init() {
		if(instance == null){
            instance = new AgentClassFactory();
		}
		return instance;
	}
	
	public EClass createAgentClass(Agent agent) {
		if(classRegistry.getRegisteredClass(agent.getName()) != null) {
			return classRegistry.getRegisteredClass(agent.getName());
		}
		EClass agentClass = ecoreFactory.createEClass();
		agentClass.getESuperTypes().add(ReactionContainerPackage.Literals.AGENT);
		agentClass.setInstanceClassName(agent.getName());
		agentClass.setName(agent.getName());
		ecorePackage.getEClassifiers().add(agentClass);
		classRegistry.registerClass(agentClass);
		// Create Custom EReferences and add Attributes for References
		for(Site site : agent.getSites().getSites()) {
			EClass referenceClass = referenceClassFactory.createReferenceClass(site);
			EReference reference = ecoreFactory.createEReference();
			reference.setUpperBound(1);
			reference.setLowerBound(0);
			reference.setName(site.getName());
			reference.setEType(ReactionContainerPackage.Literals.AGENT);
			
		}
		
		return agentClass;
	}

}
