package org.simsg.core.persistence;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class SimplePersistenceManager extends PersistenceManager {

	public SimplePersistenceManager(boolean useEMF) {
		super(useEMF);
	}

	@Override
	public Resource loadSimulationModel(URI uri) {
		Resource model = null;
		try {
			if (useEMF) {
				model = PersistenceUtils.loadResource(uri, workspacePath);
			} else {
				model = PersistenceUtils.loadXMIResource(uri);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		if (simulationModelCache.containsKey(uri)) {
			unloadSimulationModel(uri);
		}

		simulationModelCache.put(uri, model);
		return model;
	}

	@Override
	public boolean saveSimulationModel(String filename, Resource simModel) {
		String path = filename + ".xmi";
		try {
			if (useEMF) {
				PersistenceUtils.saveXMIModel(simModel, path);
			} else {
				PersistenceUtils.saveModel(simModel, path, workspacePath);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
