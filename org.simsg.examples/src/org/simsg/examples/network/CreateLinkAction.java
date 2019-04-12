package org.simsg.examples.network;

import org.simsg.core.gt.PostApplicationAction;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.examples.network.ComputerNetwork.GeometricNode;
import org.simsg.examples.network.ComputerNetwork.Link;

import GTLanguage.GTRule;

public class CreateLinkAction extends PostApplicationAction {

	public CreateLinkAction(GTRule rule) {
		super(rule);
	}

	@Override
	public void applyAction(SimSGMatch match) {
		if(!match.getPatternName().equals(gtRule.getName())) {
			return;
		}
		Link l = (Link)match.get("l");
		GeometricNode n1 = (GeometricNode)l.getEndpoints().get(0);
		GeometricNode n2 = (GeometricNode)l.getEndpoints().get(1);
		double dx = Math.pow(n1.getX()-n2.getX(),2);
		double dy = Math.pow(n1.getY()-n2.getY(),2);
		l.setWeight(Math.sqrt(dx+dy));
	}

}
