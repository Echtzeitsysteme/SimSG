package org.simsg.core.simulation.constraint;

import org.simsg.core.simulation.Event;
import org.simsg.core.simulation.SimulationState;

class GeometricConstraint extends ExternalConstraint {
	
	public GeometricConstraint(SimulationState state){
		super(state);
	}

	@Override
	public boolean checkConstraint(Event event) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setAdditionalParameters(Object... params) {
		// TODO Auto-generated method stub
		
	}
}
