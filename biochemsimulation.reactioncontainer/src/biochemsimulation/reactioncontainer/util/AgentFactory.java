package biochemsimulation.reactioncontainer.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import biochemsimulation.reactioncontainer.Agent;

public class AgentFactory extends EObjectFactory<Agent, biochemsimulation.reactionrules.reactionRules.Agent>{
	
	public AgentFactory(EPackage ecorePackage, EClassRegistry<biochemsimulation.reactionrules.reactionRules.Agent> agentClassRegistry) {
		super(ecorePackage, agentClassRegistry);
	}
	
	@Override
	public Agent createObject(String typeClass) {
		return (Agent)ecoreFactory.create(classRegistry.getRegisteredClass(typeClass));
	}

	@Override
	public Agent createObject(EClass typeClass) {
		return (Agent)ecoreFactory.create(typeClass);
	}
}
