package org.simsg.core.simulation.service;

import java.util.LinkedList;
import java.util.List;

import org.simsg.core.gt.ModelGraphTransformer;
import org.simsg.core.simulation.SimulationState;

public class PeriodicService extends ServiceRoutine {
	
	private double servicePeriod = 0;
	private double lastService = 0;
	
	private List<String> nonStochasticRules = new LinkedList<>();

	public PeriodicService(SimulationState state) {
		super(state);
		// TODO: How to do this generically? Maybe define a SimulationDefinition Metamodel...
		//nonStochasticRules.addAll(state.getPatternContainer().getNonStochasticRules());
		java.util.Collections.sort(nonStochasticRules);
	}
	
	public void setServicePeriod(double servicePeriod) {
		this.servicePeriod = servicePeriod;
	}

	@Override
	public boolean performService(ModelGraphTransformer gt) {
		if(state.peekNextEvent() == null) return false;
		
		double nextEventTime = state.peekNextEvent().time;
		if((nextEventTime-lastService) < servicePeriod) {
			return false;
		}
		
		lastService = lastService+servicePeriod;
		state.setTime(lastService);
		
		boolean somethingChanged = true;
		state.refreshState();
		
		for(String rule : nonStochasticRules) {
			state.refreshState();
			while(somethingChanged) {
				somethingChanged = false;
				int count = state.getMatchCount(rule);
				if(count <= 0) continue;
				
				gt.applyRuleToMatch(state.getRandomMatch(rule), rule);
				
				state.refreshState();
				if(count != state.getMatchCount(rule)) {
					somethingChanged = true;
				}
			}
			somethingChanged = true;
			
		}
		
		
		
		return true;
	}

	@Override
	public void setAdditionalParameters(Object... params) {
		// TODO Auto-generated method stub
		
	}

}
