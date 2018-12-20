package biochemsimulation.reactioncontainer.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactionrules.reactionRules.State;

public class StateClassFactory {
	
	protected EcoreFactory ecoreFactory;
	protected EPackage ecorePackage;
	protected StateClassRegistry classRegistry;
	
	public StateClassFactory(EPackage ecorePackage, StateClassRegistry classRegistry) {
		ecoreFactory = EcoreFactory.eINSTANCE;
		
		this.ecorePackage = ecorePackage;
		this.classRegistry = classRegistry;
	}

	
	public EClass createStateClass(State state) {
		if(classRegistry.containsClass(state.getName())) {
			return classRegistry.getRegisteredClass(state.getName());
		}
		
		EClass stateClass = ecoreFactory.createEClass();
		stateClass.getESuperTypes().add(ReactionContainerPackage.Literals.STATE);
		stateClass.setName(state.getName());
		ecorePackage.getEClassifiers().add(stateClass);
		classRegistry.registerClass(stateClass);

		
		return stateClass;
	}
}
