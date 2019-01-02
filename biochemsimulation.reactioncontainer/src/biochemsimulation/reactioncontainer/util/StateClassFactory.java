package biochemsimulation.reactioncontainer.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactionrules.reactionRules.Agent;
import biochemsimulation.reactionrules.reactionRules.Site;
import biochemsimulation.reactionrules.reactionRules.State;

public class StateClassFactory extends EClassFactory<State, biochemsimulation.reactioncontainer.State> {
	
	public StateClassFactory(EPackage ecorePackage) {
		super(ecorePackage);
	}
	
	@Override
	protected void setEObjectFactory() {
		objectFactory = new StateFactory(ecorePackage, classRegistry);
	}

	
	@Override
	public EClass createClass(State object) {
		if(classRegistry.containsClass(object.getName())) {
			return classRegistry.getRegisteredClass(object.getName());
		}
		
		EClass stateClass = ecoreFactory.createEClass();
		stateClass.getESuperTypes().add(ReactionContainerPackage.Literals.STATE);
		stateClass.setName(object.getName());
		ecorePackage.getEClassifiers().add(stateClass);
		classRegistry.registerClass(stateClass);

		
		return stateClass;
	}
	
	public EReference createReference(Agent agent, Site site, State state, EClass stateClass) {
		String refName = createReferenceName(agent, site, state);
		if(classRegistry.containsReference(refName)) {
			return classRegistry.getRegisteredReference(refName);
		}
		EReference reference = ecoreFactory.createEReference();
		reference.setUpperBound(1);
		reference.setLowerBound(0);
		reference.setName(refName);
		reference.setEType(stateClass);
		classRegistry.registerReference(reference);
		return reference;
	}

	@Override
	public EObjectFactory<biochemsimulation.reactioncontainer.State, State> getEObjectFactory() {
		return objectFactory;
	}

	@Override
	public EClassRegistry<State> getEClassRegistry() {
		return classRegistry;
	}
	
	public static String createReferenceName(Agent agent, Site site, State state) {
		return createCombinedClassName(agent.getName(), site.getName(), state.getName());
	}

	
}
