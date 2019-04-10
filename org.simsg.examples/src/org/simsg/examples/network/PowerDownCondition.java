package org.simsg.examples.network;

import org.emoflon.ibex.common.operational.IMatch;
import org.simsg.examples.network.ComputerNetwork.Link;

import SimulationDefinition.impl.ApplicationConditionImpl;

public class PowerDownCondition extends ApplicationConditionImpl {
	private double k;
	
	public PowerDownCondition(double k) {
		this.k = k;
	}
	
	@Override
	public boolean checkPrecondition(Object match) {
		if(!(match instanceof IMatch)) {
			return false;
		}
		IMatch imatch = (IMatch)match;
		if(!imatch.getPatternName().equals(gtRule.getName())) {
			return false;
		}
		Link l13 = (Link)imatch.get("l13");
		Link l23 = (Link)imatch.get("l23");
		Link l12 = (Link)imatch.get("l12");
		
		double min = Math.min(l23.getWeight(), l12.getWeight());
		return !(k*l13.getWeight() <= min);
	}
}
