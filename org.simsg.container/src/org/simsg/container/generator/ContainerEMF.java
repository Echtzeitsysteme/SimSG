package org.simsg.container.generator;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;

public class ContainerEMF extends ContainerGenerator {
	
	public ContainerEMF(URI modelLocation) {
		super(modelLocation);
	}
	
	public ContainerEMF(Resource model) {
		super(model);
	}

	public ContainerEMF(ReactionRuleModel model) {
		super(model);
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
