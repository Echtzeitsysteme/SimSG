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
		Agent agent = (Agent)ecoreFactory.create(classRegistry.getRegisteredClass(typeClass));
		agent.setID(System.nanoTime());
		System.out.println(agent.getID());
		return agent;
	}

	@Override
	public Agent createObject(EClass typeClass) {
		Agent agent = (Agent)ecoreFactory.create(typeClass);
		agent.setID(System.nanoTime());
		System.out.println(agent.getID());
		return agent;
	}
}
