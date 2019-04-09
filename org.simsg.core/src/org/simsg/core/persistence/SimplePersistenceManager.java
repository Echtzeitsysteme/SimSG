package org.simsg.core.persistence;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class SimplePersistenceManager extends PersistenceManager {
	
	public SimplePersistenceManager() {
		super();
	}
	
	@Override
	public void setAdditionalParameters(Object... params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Resource loadSimulationModel(URI uri) {
		Resource model = null;
		try {
			model = PersistenceUtils.loadResource(uri);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		if(simulationModelCache.containsKey(uri)) {
			unloadSimulationModel(uri);
		}
		
		simulationModelCache.put(uri, model);
		return model;
	}

	@Override
	public boolean saveSimulationModel(String filename, Resource simModel) {
		String path = filename+".xmi";
		try {
			PersistenceUtils.saveModel(simModel, path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
