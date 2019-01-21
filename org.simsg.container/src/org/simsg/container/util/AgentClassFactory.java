package org.simsg.container.util;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.simsg.container.ContainerPackage;
import org.simsg.simsgl.simSGL.Agent;
import org.simsg.simsgl.simSGL.Attribute;
import org.simsg.simsgl.simSGL.AttributeType;
import org.simsg.simsgl.simSGL.FloatAttribute;
import org.simsg.simsgl.simSGL.IntegerAttribute;
import org.simsg.simsgl.simSGL.SingleSite;
import org.simsg.simsgl.simSGL.Site;
import org.simsg.simsgl.simSGL.State;

public class AgentClassFactory extends EClassFactory<Agent, org.simsg.container.Agent> {

	protected StateClassFactory stateClassFactory;
	
	public AgentClassFactory(EPackage ecorePackage, StateClassFactory stateClassFactory) {
		super(ecorePackage);
		this.stateClassFactory = stateClassFactory;
	}
	
	@Override
	protected void setEObjectFactory() {
		objectFactory = new AgentFactory(ecorePackage, classRegistry);
	}
	
	@Override
	public EClass createClass(Agent object) {
		if(classRegistry.containsClass(object.getName())) {
			return classRegistry.getRegisteredClass(object.getName());
		}
		
		EClass agentClass = ecoreFactory.createEClass();
		agentClass.getESuperTypes().add(ContainerPackage.Literals.AGENT);
		agentClass.setName(object.getName());
		ecorePackage.getEClassifiers().add(agentClass);
		classRegistry.registerClass(agentClass);
		// Create custom typed EReferences representing sites
		for(Site site : object.getSites().getSites()) {
			agentClass.getEStructuralFeatures().add(createReference(object, site));
			// generate site states
			if(site.getStates().getState() != null) {
				if(site.getStates().getState().size() > 0) {
					for(State state : site.getStates().getState()) {
						EClass stateClass = stateClassFactory.createClass(state);
						agentClass.getEStructuralFeatures().add(stateClassFactory.createReference(object, site, state, stateClass));
					}
				}
			}
		}
		// Create agent states
		if(object.getStates().getState() != null) {
			if(object.getStates().getState().size() > 0) {
				for(State state : object.getStates().getState()) {
					EClass stateClass = stateClassFactory.createClass(state);
					agentClass.getEStructuralFeatures().add(stateClassFactory.createReference(object, state, stateClass));
				}
			}
		}
		// Create agent attributes
		if(object.getAttributes().getAttributes() != null) {
			if(object.getAttributes().getAttributes().size() > 0) {
				for(Attribute attr : object.getAttributes().getAttributes()) {
					EAttribute attribute = createAttribute(object, attr);
					agentClass.getEStructuralFeatures().add(attribute);
				}
			}
		}
		
		return agentClass;
	}
	
	public EReference createReference(Agent agent, Site site) {
		String refName = createReferenceName(agent, site);
		if(classRegistry.containsReference(refName)) {
			return classRegistry.getRegisteredReference(refName);
		}
		if(site instanceof SingleSite) {
			return createSingleReference(agent, refName);
		}else {
			return createMultiReference(agent, refName);
		}
		
		
	}
	
	public EReference createSingleReference(Agent agent, String refName) {
		EReference reference = ecoreFactory.createEReference();
		reference.setUpperBound(1);
		reference.setLowerBound(0);
		reference.setName(refName);
		reference.setEType(ContainerPackage.Literals.AGENT);
		classRegistry.registerReference(reference);
		return reference;
	}
	
	public EReference createMultiReference(Agent agent, String refName) {
		EReference reference = ecoreFactory.createEReference();
		reference.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
		reference.setLowerBound(0);
		reference.setName(refName);
		reference.setEType(ContainerPackage.Literals.AGENT);
		classRegistry.registerReference(reference);
		return reference;
	}
	
	public EAttribute createAttribute(Agent agent, Attribute attr) {
		EAttribute attribute = ecoreFactory.createEAttribute();
		attribute.setName(createAttributeName(agent, attr));
		attribute.setEType(getEDataType(attr.getType()));
		classRegistry.registerAttribute(attribute);
		return attribute;
	}

	@Override
	public EObjectFactory<org.simsg.container.Agent, Agent> getEObjectFactory() {
		return objectFactory;
	}

	@Override
	public EClassRegistry<Agent> getEClassRegistry() {
		return classRegistry;
	}
	
	public static String createReferenceName(Agent agent, Site site) {
		return createCombinedClassName(agent.getName(), site.getName());
	}
	
	public static String createAttributeName(Agent agent, Attribute attr) {
		return createCombinedClassName(agent.getName(), attr.getName());
	}
	
	public static EDataType getEDataType(AttributeType atrType) {
		EDataType edt = null;
		if(atrType instanceof FloatAttribute) {
			edt = EcorePackage.Literals.EDOUBLE;
		}else if(atrType instanceof IntegerAttribute) {
			edt = EcorePackage.Literals.EINT;
		}
		
		return edt;
	}


}
