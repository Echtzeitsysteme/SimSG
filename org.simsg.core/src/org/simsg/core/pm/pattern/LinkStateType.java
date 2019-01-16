package org.simsg.core.pm.pattern;

import org.simsg.simsgl.simSGL.BoundAnyLink;
import org.simsg.simsgl.simSGL.BoundAnyOfTypeLink;
import org.simsg.simsgl.simSGL.BoundLink;
import org.simsg.simsgl.simSGL.IndexedFreeLink;
import org.simsg.simsgl.simSGL.LinkState;
import org.simsg.simsgl.simSGL.TypedFreeLink;
import org.simsg.simsgl.simSGL.WhatEver;

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
