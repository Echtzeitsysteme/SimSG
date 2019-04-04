package org.simsg.examples.devel;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.ibex.gt.api.GraphTransformationAPI;
import org.emoflon.ibex.gt.api.GraphTransformationApp;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.simsg.core.utils.PersistenceUtils;
import org.simsg.examples.devel.api.DevelAPI;
import org.simsg.examples.devel.api.DevelApp;
import org.simsg.examples.devel.api.DevelDemoclesApp;
import org.simsg.examples.devel.api.rules.AgentPattern;
import org.simsg.examples.devel.api.rules.KTxPattern;

import GTLanguage.GTLanguagePackage;
import GTLanguage.GTRuleSet;
import IBeXLanguage.IBeXLanguagePackage;
import IBeXLanguage.IBeXPatternSet;
import SimulationDefinition.SimDefinition;
import SimulationDefinition.SimulationDefinitionFactory;
import org.simsg.core.persistence.*;

public class Sandbox {

	public static void main(String[] args) {
		//loadAModel("Goldbeter_Koshland");
		//generateSimDef();
		try {
			// Load generated DemoclesApp-class by class name
			Class<GraphTransformationApp<?>> democlesAppClass = (Class<GraphTransformationApp<?>>)java.lang.Class.forName("org.simsg.examples.devel.api.DevelDemoclesApp");
			// Create dynamic instance of Democles-App class
			GraphTransformationApp<?> democlesApp = democlesAppClass.newInstance();
			// Load generated App-class by class name
			Class<GraphTransformationApp<?>> appClass = (Class<GraphTransformationApp<?>>)java.lang.Class.forName("org.simsg.examples.devel.api.DevelApp");
			// Create dynamic registerMetaModels()-Method of the App-class which is the DemoclesApp super class
			Method method1 = appClass.getDeclaredMethod("registerMetaModels");
			// Invoke dynamically create method
			method1.invoke(democlesApp);
			democlesApp.getModel().getResources().add(loadAModel("Goldbeter_Koshland"));
			GraphTransformationAPI api = democlesApp.initAPI();
			api.updateMatches();
			
			// Load generated API-class by class name
			Class<GraphTransformationAPI> apiClass = (Class<GraphTransformationAPI>)java.lang.Class.forName("org.simsg.examples.devel.api.DevelAPI");
			// Create dynamic agent()-Method of the API-class
			Method method2 = apiClass.getDeclaredMethod("agent");
			// Invoke dynamically create method
			GraphTransformationPattern<?,?> p = (GraphTransformationPattern<?,?>)method2.invoke(api);
			// Get matches -> ..  profit!
			int count = p.findMatches().size();
			System.out.println("Count: "+count);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		DevelDemoclesApp dda = new DevelDemoclesApp();
		dda.registerMetaModels();
		dda.getModel().getResources().add(loadAModel("Goldbeter_Koshland"));
		DevelAPI api2 = dda.initAPI();
		api2.updateMatches();
		System.out.println("Count: "+api2.KTx().findMatches().size());
		System.out.println("Count: "+api2.agent().findMatches().size());
		*/
	}
	
	public static void generateSimDef() {
		URI gtRulesURI = URI.createFileURI("src-gen\\org\\simsg\\examples\\devel\\api\\gt-rules.xmi");
		URI ibexPatternsURI = URI.createFileURI("src-gen\\org\\simsg\\examples\\devel\\api\\ibex-patterns.xmi");
		URI simModelURI = URI.createFileURI("models\\SimulationModels\\Goldbeter_Koshland.xmi");
		URI simMetamodelURI = URI.createFileURI("models\\SimulationMetaModels\\Goldbeter_Koshland.ecore");
		
		SimDefinition def = createSimulationDefinition("Goldbeter_Koshland", gtRulesURI, ibexPatternsURI, simModelURI, simMetamodelURI);
		
		URI simDefinitionURI = URI.createFileURI("models\\SimDefTest.xmi");
		saveDefinition(def, simDefinitionURI);
	}
	
	public static Resource loadAModel(String model) {
		PersistenceManager pm = new SimplePersistenceManager();
		pm.setModelFolderPath(System.getProperty("user.dir")+"//models");
		pm.init();
		try {
			pm.loadSimulationDefinition("Goldbeter_Koshland");
			return pm.loadSimulationModel("Goldbeter_Koshland");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static SimDefinition createSimulationDefinition(String modelName, URI gtRulesURI, URI ibexPatternsURI, URI simModelURI, URI simMetamodelURI) {
		SimDefinition sd = SimulationDefinitionFactory.eINSTANCE.createSimDefinition();
		sd.setGtRulesURI(gtRulesURI.toString());
		sd.setIbexPatternsURI(ibexPatternsURI.toString());
		sd.setName(modelName);
		sd.setSimulationModelURI(simModelURI.toString());
		sd.setMetamodelURI(simMetamodelURI.toString());
		
		sd.setGtRuleSet(loadGTRuleSet(gtRulesURI));
		sd.setIbexPatternSet(loadIBeXPatternSet(ibexPatternsURI));
		sd.setMetamodel(loadMetamodel(simMetamodelURI));
		
		return sd;
	}
	
	public static void saveDefinition(SimDefinition definition, URI simDefinitionURI) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("SimDefinition", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		Resource modelResource = rs.createResource(simDefinitionURI);
		modelResource.getContents().add(definition);
		
		Map<Object, Object> saveOptions = ((XMIResource)modelResource).getDefaultSaveOptions();
		saveOptions.put(XMIResource.OPTION_ENCODING,"UTF-8");
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION,Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
		
		try {
			((XMIResource)modelResource).save(saveOptions);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Model saved to: "+simDefinitionURI.path());
	}
	
	public static GTRuleSet loadGTRuleSet(URI gtRulesURI) {
		GTLanguagePackage.eINSTANCE.eClass();
		GTRuleSet rules = null;
		try {
			Resource rs = PersistenceUtils.loadResource(gtRulesURI);
			rules = (GTRuleSet) rs.getContents().get(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rules;
	}
	
	public static IBeXPatternSet loadIBeXPatternSet(URI ibexPatternsURI) {
		IBeXLanguagePackage.eINSTANCE.eClass();
		IBeXPatternSet patterns = null;
		try {
			Resource rs = PersistenceUtils.loadResource(ibexPatternsURI);
			patterns = (IBeXPatternSet) rs.getContents().get(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return patterns;
	}
	
	public static EPackage loadMetamodel(URI simMetamodelURI) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		EPackage metamodel = null;
		try {
			Resource rs = PersistenceUtils.loadResource(simMetamodelURI);
			metamodel = (EPackage) rs.getContents().get(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return metamodel;
	}
	
}