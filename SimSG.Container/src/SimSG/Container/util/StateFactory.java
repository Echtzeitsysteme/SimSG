package SimSG.Container.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import SimSG.Container.State;

public class StateFactory extends EObjectFactory<State, biochemsimulation.reactionrules.reactionRules.State> {
	
	public StateFactory(EPackage ecorePackage, EClassRegistry<biochemsimulation.reactionrules.reactionRules.State> stateClassRegistry) {
		super(ecorePackage, stateClassRegistry);
	}
	
	@Override
	public State createObject(String typeClass) {
		return (State)ecoreFactory.create(classRegistry.getRegisteredClass(typeClass));
	}

	@Override
	public State createObject(EClass typeClass) {
		return (State)ecoreFactory.create(typeClass);
	}

}
