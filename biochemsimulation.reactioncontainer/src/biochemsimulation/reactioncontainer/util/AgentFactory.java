package biochemsimulation.reactioncontainer.util;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import biochemsimulation.reactioncontainer.Agent;

public class AgentFactory {

	protected EPackage ecorePackage;
	protected EFactory ecoreFactory;
	protected AgentClassRegistry classRegistry;
	
	public AgentFactory(EPackage ecorePackage, AgentClassRegistry classRegistry) {
		this.ecorePackage = ecorePackage;
		this.classRegistry = classRegistry;
		
		ecoreFactory = ecorePackage.getEFactoryInstance();
	}
	
	public Agent createAgent(String agentClass) {
		return (Agent)ecoreFactory.create(classRegistry.getRegisteredClass(agentClass));
	}
}
