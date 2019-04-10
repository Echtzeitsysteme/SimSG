package org.simsg.examples.network;

import java.util.Random;

import org.emoflon.ibex.common.operational.IMatch;
import org.simsg.examples.network.ComputerNetwork.Link;

import SimulationDefinition.impl.PostApplicationActionImpl;

public class ChangeWeightAction extends PostApplicationActionImpl {
	
	private double m;
	private Random rnd = new Random();
	
	public ChangeWeightAction(double m) {
		this.m = m;
	}
	
	@Override
	public void apply(Object match) {
		if(!(match instanceof IMatch)) {
			return;
		}
		IMatch imatch = (IMatch)match;
		if(!imatch.getPatternName().equals(gtRule.getName())) {
			return;
		}
		
		Link l = (Link)imatch.get("l");
		l.setWeight(l.getWeight() + rnd.nextGaussian()*m);
	}
}
