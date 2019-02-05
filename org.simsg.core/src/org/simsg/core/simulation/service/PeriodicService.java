package org.simsg.core.simulation.service;

import java.util.Collection;

import org.simsg.core.gt.ModelGraphTransformer;
import org.simsg.core.simulation.SimulationState;

public class PeriodicService extends ServiceRoutine {
	
	private double servicePeriod = 0;
	private double lastService = 0;
	
	private Collection<String> nonStochasticRules;

	public PeriodicService(SimulationState state) {
		super(state);
		nonStochasticRules = state.getPatternContainer().getNonStochasticRules();
	}
	
	public void setServicePeriod(double servicePeriod) {
		this.servicePeriod = servicePeriod;
	}

	@Override
	public boolean performService(ModelGraphTransformer gt) {
		double nextEventTime = state.peekNextEvent().time;
		if((nextEventTime-lastService) < servicePeriod) {
			return false;
		}
		
		lastService = state.getTime() + servicePeriod;
		state.elapseTime(servicePeriod);
		
		boolean somethingChanged = true;
		while(somethingChanged) {
			somethingChanged = false;
			
			for(String rule : nonStochasticRules) {
				int count = state.getMatchCount(rule);
				if(count <= 0) continue;
				
				gt.applyRuleToMatch(state.getRandomMatch(rule), rule);
				state.refreshState();
				if(count != state.getMatchCount(rule)) {
					somethingChanged = true;
				}
			}
		}
		
		return true;
	}

}
