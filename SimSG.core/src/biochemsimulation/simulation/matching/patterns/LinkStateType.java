package biochemsimulation.simulation.matching.patterns;

import biochemsimulation.reactionrules.reactionRules.BoundAnyLink;
import biochemsimulation.reactionrules.reactionRules.BoundAnyOfTypeLink;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.IndexedFreeLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.TypedFreeLink;
import biochemsimulation.reactionrules.reactionRules.WhatEver;

public enum LinkStateType {
	Unbound("Unbound"), BoundAny("BoundAny"), BoundAnyOfType("BoundAnyOfType"), Bound("BoundExact"), WhatEver("WhatEver"), IndexedUnbound("IndexedUnbound"), TypedUnbound("TypedUnbound");
	
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
		if(linkState instanceof IndexedFreeLink) {
			return IndexedUnbound;
		}
		if(linkState instanceof TypedFreeLink) {
			return TypedUnbound;
		}
		return Unbound;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
