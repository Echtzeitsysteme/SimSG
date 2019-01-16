package org.simsg.container.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.simsg.container.State;

public class StateFactory extends EObjectFactory<State, org.simsg.simsgl.simSGL.State> {
	
	public StateFactory(EPackage ecorePackage, EClassRegistry<org.simsg.simsgl.simSGL.State> stateClassRegistry) {
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
