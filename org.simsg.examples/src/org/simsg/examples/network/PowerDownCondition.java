package org.simsg.examples.network;

import org.simsg.core.gt.RuleApplicationCondition;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.examples.network.ComputerNetwork.Link;

import GTLanguage.GTRule;

public class PowerDownCondition extends RuleApplicationCondition {
	private double k;
	
	public PowerDownCondition(GTRule rule, double k) {
		super(rule);
		this.k = k;
	}

	@Override
	public boolean checkCondition(SimSGMatch match) {
		if(!match.getPatternName().equals(gtRule.getName())) {
			return false;
		}
		Link l13 = (Link)match.get("l13");
		Link l23 = (Link)match.get("l23");
		Link l12 = (Link)match.get("l12");
		
		double min = Math.min(l23.getWeight(), l12.getWeight());
		return !(k*l13.getWeight() <= min);
	}
}
