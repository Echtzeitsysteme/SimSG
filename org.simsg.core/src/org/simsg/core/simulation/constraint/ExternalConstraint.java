package org.simsg.core.simulation.constraint;

import org.simsg.core.simulation.Event;
import org.simsg.core.simulation.SimulationState;

public abstract class ExternalConstraint {
	protected final SimulationState state;
	
	public ExternalConstraint(SimulationState state) {
		this.state = state;
	}
	
	public abstract void setAdditionalParameters(Object ... params);
	
	public abstract boolean checkConstraint(Event event);
}
