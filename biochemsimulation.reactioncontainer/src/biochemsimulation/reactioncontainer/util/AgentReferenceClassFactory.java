package biochemsimulation.reactioncontainer.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EPackage;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactionrules.reactionRules.Site;

public class AgentReferenceClassFactory {
	
	public static final AgentReferenceClassFactory eInstance = init(); 
	
	protected static AgentReferenceClassFactory instance;
	protected EcoreFactory ecoreFactory;
	protected EPackage ecorePackage;
	protected AgentReferenceClassRegistry classRegistry;
	
	protected AgentReferenceClassFactory() {
		ecorePackage = ReactionContainerPackage.eINSTANCE;
		ecoreFactory = EcoreFactory.eINSTANCE;
		classRegistry = AgentReferenceClassRegistry.eInstance;
	}
	
	public static synchronized AgentReferenceClassFactory init() {
		if(instance == null){
            instance = new AgentReferenceClassFactory();
		}
		return instance;
	}
	
	public EClass createReferenceClass(Site site) {
		if(classRegistry.getRegisteredClass(site.getName())!= null) {
			return classRegistry.getRegisteredClass(site.getName());
		}
		EClass referenceClass = ecoreFactory.createEClass();
		referenceClass.setInstanceClassName(site.getName());
		referenceClass.setName(site.getName());
		ecorePackage.getEClassifiers().add(referenceClass);
		classRegistry.registerClass(referenceClass);
		return referenceClass;
	}

}
