package org.simsg.core.pm.ibex;

import org.simsg.core.utils.IBeXApiWrapper;

public class IBeXDemoclesEngine extends IBeXEngine {

	public IBeXDemoclesEngine(final String fqApiPackageName) {
		super(fqApiPackageName);
	}

	@Override
	public void initPatterns() {
		apiWrapper = IBeXApiWrapper.getInstance();
		apiWrapper.initDemoclesWrapper(ibexModel, fqApiPackageName);
	}

	@Override
	public void initEngine() {
		try {
			api = apiWrapper.initEngine(simulationModel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Trying to re-initialize...");
			apiWrapper.initDemoclesWrapper(ibexModel, fqApiPackageName);
			try {
				api = apiWrapper.initEngine(simulationModel);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println(".. failed.");
				return;
			}
		}
		try {
			matcher = apiWrapper.getMatcher();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		updateAllMatches();
	}
	
}