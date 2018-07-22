package biochemsimulation.simulation.matching.democles;

import biochemsimulation.reactionrules.reactionRules.BoundAnyLink;
import biochemsimulation.reactionrules.reactionRules.BoundAnyOfTypeLink;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.WhatEver;

enum LinkStateType {
	Unbound("Unbound"), BoundAny("BoundAny"), BoundAnyOfType("BoundAny"), Bound("BoundExact"), WhatEver("WhatEver");
	
	private String name;
	
	private LinkStateType(String name) {
		this.name = name;
	}
	
	public static LinkStateType enumFromLinkState(LinkState linkState) {
		if(linkState instanceof BoundAnyLink) {
			return BoundAny;
		}
		if(linkState instanceof BoundAnyOfTypeLink) {
			return BoundAnyOfType;
		}
		if(linkState instanceof BoundLink) {
			return Bound;
		}
		if(linkState instanceof WhatEver) {
			return WhatEver;
		}
		return Unbound;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
