package org.simsg.container.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;

public abstract class EClassFactory<Template extends EObject, Instance extends EObject> {
	
	protected EcoreFactory ecoreFactory;
	protected EPackage ecorePackage;
	protected EClassRegistry<Template> classRegistry;
	protected EObjectFactory<Instance, Template> objectFactory;
	
	protected EClassFactory(EPackage ecorePackage) {
		ecoreFactory = EcoreFactory.eINSTANCE;
		this.ecorePackage = ecorePackage;
		this.classRegistry = new EClassRegistry<Template>();
		setEObjectFactory();
	}
	
	protected abstract void setEObjectFactory();
	
	public abstract EClass createClass(Template object);
	
	public abstract EObjectFactory<Instance, Template> getEObjectFactory();
	
	public abstract EClassRegistry<Template> getEClassRegistry();
	
	public static String createCombinedClassName(String ...name) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<name.length; i++) {
			sb.append(name[i]);
			if(i<name.length-1) {
				sb.append("_");
			}
		}
		
		return sb.toString();
	}

}
