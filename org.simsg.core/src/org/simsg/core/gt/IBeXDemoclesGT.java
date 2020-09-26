package org.simsg.core.gt;

import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.simsg.core.utils.IBeXApiWrapper;

public class IBeXDemoclesGT extends IBeXGT {

	public IBeXDemoclesGT(final String fqApiPackageName) {
		super(fqApiPackageName);
	}

	@Override
	public void init() {
		apiWrapper = IBeXApiWrapper.getInstance();
		if(!apiWrapper.isInitialized()) {
			apiWrapper.initDemoclesWrapper(ibexModel, fqApiPackageName);
			try {
				apiWrapper.initEngine(simulationModel);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			rules = apiWrapper.getRules();
			ruleApplicationMethod = GraphTransformationRule.class.getDeclaredMethod("apply", GraphTransformationMatch.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
