package org.simsg.core.constraints;

public class ExternalConstraintsFactory {
	
	public static ExternalConstraints create(ExternalConstraintsEnum type) {
		ExternalConstraints ec = null;
		
		switch(type) {
		case GeometricConstraints: {
			ec = new GeometricConstraints();
			break;
		}
		}
		
		return ec;
	}
}
