package org.simsg.core.simulation;

import java.util.Map;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EPackage;
import org.emoflon.ibex.gt.api.GraphTransformationApp;

public abstract class SimSGAPI {
	
	final protected SimulationConfigurator configurator;
	protected Map<String, Supplier<GraphTransformationApp<?>>> apps;
	
	protected SimSGAPI() {
		initAppsMap();
		registerMetamodels();
		configurator = new SimulationConfigurator();
	}
	
	public abstract void initAppsMap();

	public SimulationConfigurator getSimulationConfigurator() {
		return configurator;
	}
	
	public void addMetaModel(String nsUri, EPackage metamodel) {
		org.eclipse.emf.ecore.EPackage.Registry reg = EPackage.Registry.INSTANCE;
		reg.putIfAbsent(nsUri, metamodel);
	}
	
	public abstract void registerMetamodels();
	
	public Supplier<GraphTransformationApp<?>> getApp(String className) {
		return apps.get(className);
	}
	
}
