package biochemsimulation.reactioncontainer.generator;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import biochemsimulation.reactioncontainer.Agent;
import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactioncontainer.util.AgentClassFactory;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;

public class ReactionContainerEMF extends ReactionContainerGenerator {
	
	public ReactionContainerEMF(URI modelLocation) {
		super(modelLocation);
	}
	
	public ReactionContainerEMF(Resource model) {
		super(model);
	}

	public ReactionContainerEMF(ReactionRuleModel model) {
		super(model);
	}
	
	@Override
	public void doGenerate(String path) throws Exception {
		biochemsimulation.reactionrules.reactionRules.Agent a = (biochemsimulation.reactionrules.reactionRules.Agent)model.getReactionProperties().get(0);
		System.out.println("Container Agent class...");
		System.out.println(ReactionContainerPackage.Literals.AGENT.getName());
		System.out.println(ReactionContainerPackage.Literals.AGENT.getClass());
		ReactionContainerPackage.Literals.AGENT.getEAllSuperTypes().forEach(x->System.out.println(x));
		System.out.println("Container Agent State class...");
		System.out.println(ReactionContainerPackage.Literals.AGENT_STATE.getName());
		System.out.println(ReactionContainerPackage.Literals.AGENT_STATE.getClass());
		ReactionContainerPackage.Literals.AGENT_STATE.getEAllSuperTypes().forEach(x->System.out.println(x));
		System.out.println("RuleAgent instance...");
		System.out.println(a.getName());
		System.out.println(a.getClass());
		System.out.println(a.eClass());
		System.out.println("Generated Class...");
		EClass generated = AgentClassFactory.eInstance.createAgentClass(a);
		System.out.println(generated.getName());
		System.out.println(generated.getClass());
		generated.getEAllSuperTypes().forEach(x->System.out.println(x));
		System.out.println("Default EReference...");
		EReference ref = EcoreFactory.eINSTANCE.createEReference();
		if(ref.getEReferenceType() != null) {
			System.out.println(ref.getEReferenceType().eClass());
			System.out.println(ref.getEReferenceType().getClass());
			System.out.println(ref.getEReferenceType().getName());
		}
		
	}

	@Override
	protected void setContainerURI(String path) {
		containerURI = URI.createFileURI(path);

	}

	@Override
	protected void saveModel() throws Exception {
		Map<Object, Object> saveOptions = ((XMIResource)containerRes).getDefaultSaveOptions();
		saveOptions.put(XMIResource.OPTION_ENCODING,"UTF-8");
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION,Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
		
		((XMIResource)containerRes).save(saveOptions);
		System.out.println("Model saved to: "+containerURI.path());

	}

	@Override
	protected void createAndSetResourceSet() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put( "xmi",
				new XMIResourceFactoryImpl());
		containerResSet = new ResourceSetImpl();
		
	}

	@Override
	protected void createAndSetResource() {
		containerRes = containerResSet.createResource(containerURI);
	}

}
