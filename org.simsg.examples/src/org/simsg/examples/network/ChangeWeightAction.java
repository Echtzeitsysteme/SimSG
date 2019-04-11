package org.simsg.examples.network;

import java.util.Random;

import org.simsg.core.gt.PostApplicationAction;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.examples.network.ComputerNetwork.Link;

import GTLanguage.GTRule;

public class ChangeWeightAction extends PostApplicationAction {
	
	private double m;
	private Random rnd = new Random();
	
	public ChangeWeightAction(GTRule rule, double m) {
		super(rule);
		this.m = m;
	}

	@Override
	public void applyAction(SimSGMatch match) {
		if(!match.getPatternName().equals(gtRule.getName())) {
			return;
		}
		
		Link l = (Link)match.get("l");
		l.setWeight(l.getWeight() + rnd.nextGaussian()*m);
	}
}
