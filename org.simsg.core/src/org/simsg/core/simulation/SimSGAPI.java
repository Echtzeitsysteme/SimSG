package org.simsg.core.simulation;

import org.eclipse.emf.ecore.EPackage;

public abstract class SimSGAPI {
	
	final protected SimulationConfigurator configurator;
	
	protected SimSGAPI() {
		registerMetamodels();
		configurator = new SimulationConfigurator();
	}

	public SimulationConfigurator getSimulationConfigurator() {
		return configurator;
	}
	
	public void addMetaModel(String nsUri, EPackage metamodel) {
		org.eclipse.emf.ecore.EPackage.Registry reg = EPackage.Registry.INSTANCE;
		reg.putIfAbsent(nsUri, metamodel);
	}
	
	public abstract void registerMetamodels();
	
	
}
