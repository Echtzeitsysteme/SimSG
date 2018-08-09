package biochemsimulation.reactioncontainer.generator;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import fr.inria.atlanmod.neoemf.data.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.data.blueprints.BlueprintsPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.blueprints.neo4j.option.BlueprintsNeo4jOptionsBuilder;
import fr.inria.atlanmod.neoemf.data.blueprints.util.BlueprintsURI;
import fr.inria.atlanmod.neoemf.resource.PersistentResourceFactory;

public class ReactionContainerNeoEMF extends ReactionContainerGenerator {
	
	public ReactionContainerNeoEMF(URI modelLocation) {
		super(modelLocation);
	}
	
	public ReactionContainerNeoEMF(Resource model) {
		super(model);
	}

	public ReactionContainerNeoEMF(ReactionRuleModel model) {
		super(model);
	}

	@Override
	protected void setContainerURI(String path) {
		PersistenceBackendFactoryRegistry.register(BlueprintsURI.SCHEME,
                BlueprintsPersistenceBackendFactory.getInstance());
		
		containerResSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
        .put(BlueprintsURI.SCHEME, PersistentResourceFactory.getInstance());
		
		containerURI = BlueprintsURI.createFileURI(new File(path));
	}

	@Override
	protected void saveModel() throws Exception {
		containerRes.save(BlueprintsNeo4jOptionsBuilder.newBuilder().asMap());
		System.out.println("Model saved to: "+containerURI.path());
	}

	@Override
	protected void createAndSetResourceSet() {
		containerResSet = new ResourceSetImpl();
	}

	@Override
	protected void createAndSetResource() {
		containerRes = containerResSet.createResource(containerURI);
		
	}

}
