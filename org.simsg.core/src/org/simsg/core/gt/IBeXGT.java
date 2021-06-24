package org.simsg.core.gt;

import java.util.HashMap;
import java.util.Map;

import org.emoflon.ibex.gt.api.GraphTransformationAPI;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.simsg.core.pm.match.SimSGMatch;

public class IBeXGT extends GraphTransformationEngine {
	
	protected boolean initialized = false;
	protected GraphTransformationAPI api;
	protected Map<String, GraphTransformationRule<?,?>> rules;

	public void setApiAndInit(final GraphTransformationAPI api) {
		this.api = api;
		init();
	}
	
	@Override
	public void init() {
		if(initialized)
			return;
		
		rules = new HashMap<>();
		api.getAllPatterns().forEach((name, pattern) -> {
			GraphTransformationPattern<?,?> gtPattern = pattern.get();
			if(gtPattern instanceof GraphTransformationRule<?,?>) {
				rules.put(name, (GraphTransformationRule<?,?>)gtPattern);
			}
		});
		
		initialized = true;
	}

	@Override
	protected void applyRule(SimSGMatch match) {
		rules.get(match.getPatternName()).applyGeneric(match.asGtMatch(), false);
	}
	
	// TODO Changed
	@Override
	public void trackModelStates(boolean active, boolean forceNewStates) {
		if(active)
			api.trackModelStates(forceNewStates);
		else 
			api.deactivateModelStatesTracking();
	}
	// TODO Changed
	@Override
	public SimSGVisualizer displayModelStates(String modelName) {
		return new SimSGVisualizer(api.getModel().getResources().get(0), api.getStateManager(), api.getInterpreter(), ibexModel.getRuleSet(), ibexModel.getPatternSet(), modelName);
//		api.displayModelStates();
	}
	
	
}
