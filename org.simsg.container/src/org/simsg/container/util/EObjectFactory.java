package org.simsg.container.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

public abstract class EObjectFactory<Instance extends EObject, Template extends EObject> {
	protected EPackage ecorePackage;
	protected EFactory ecoreFactory;
	protected EClassRegistry<Template> classRegistry;
	
	protected EObjectFactory(EPackage ecorePackage, EClassRegistry<Template> classRegistry) {
		this.ecorePackage = ecorePackage;
		this.classRegistry = classRegistry;
		
		ecoreFactory = ecorePackage.getEFactoryInstance();
	}
	
	public abstract Instance createObject(String typeClass);
	
	public abstract Instance createObject(EClass typeClass);
}
