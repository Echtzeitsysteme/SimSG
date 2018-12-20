package biochemsimulation.reactioncontainer.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import biochemsimulation.reactioncontainer.State;

public class StateFactory {
	protected EPackage ecorePackage;
	protected EFactory ecoreFactory;
	protected StateClassRegistry classRegistry;
	
	public StateFactory(EPackage ecorePackage, StateClassRegistry classRegistry) {
		this.ecorePackage = ecorePackage;
		this.classRegistry = classRegistry;
		
		ecoreFactory = ecorePackage.getEFactoryInstance();
	}
	
	public State createState(String stateClass) {
		return (State)ecoreFactory.create(classRegistry.getRegisteredClass(stateClass));
	}
	
	public State createState(EClass stateClass) {
		return (State)ecoreFactory.create(stateClass);
	}
}
