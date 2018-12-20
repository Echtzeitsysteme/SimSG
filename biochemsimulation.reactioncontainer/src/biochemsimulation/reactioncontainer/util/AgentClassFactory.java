package biochemsimulation.reactioncontainer.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactionrules.reactionRules.Agent;
import biochemsimulation.reactionrules.reactionRules.Site;
import biochemsimulation.reactionrules.reactionRules.State;

public class AgentClassFactory {
 
	protected EcoreFactory ecoreFactory;
	protected EPackage ecorePackage;
	protected AgentClassRegistry agentClassRegistry;
	protected AgentClassReferenceFactory agentClassReferenceFactory;
	protected StateClassFactory stateClassFactory;
	protected StateClassReferenceFactory stateClassReferenceFactory;
	
	public AgentClassFactory(EPackage ecorePackage, AgentClassRegistry agentClassRegistry, StateClassRegistry stateClassRegistry) {
		ecoreFactory = EcoreFactory.eINSTANCE;
		this.agentClassReferenceFactory = new AgentClassReferenceFactory();
		
		this.ecorePackage = ecorePackage;
		this.agentClassRegistry = agentClassRegistry;
		this.stateClassFactory = new StateClassFactory(ecorePackage, stateClassRegistry);
		this.stateClassReferenceFactory = new StateClassReferenceFactory();
	}

	
	public EClass createAgentClass(Agent agent) {
		if(agentClassRegistry.containsClass(agent.getName())) {
			return agentClassRegistry.getRegisteredClass(agent.getName());
		}
		
		EClass agentClass = ecoreFactory.createEClass();
		agentClass.getESuperTypes().add(ReactionContainerPackage.Literals.AGENT);
		agentClass.setName(agent.getName());
		ecorePackage.getEClassifiers().add(agentClass);
		agentClassRegistry.registerClass(agentClass);
		// Create custom typed EReferences
		for(Site site : agent.getSites().getSites()) {
			agentClass.getEStructuralFeatures().add(agentClassReferenceFactory.createReference(agent, site));
			if(site.getStates().getState() != null) {
				if(site.getStates().getState().size() > 0) {
					for(State state : site.getStates().getState()) {
						EClass stateClass = stateClassFactory.createStateClass(state);
						agentClass.getEStructuralFeatures().add(stateClassReferenceFactory.createReference(agent, site, state, stateClass));
					}
				}
			}
		}
		
		return agentClass;
	}

}
