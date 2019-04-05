package org.simsg.examples.devel;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
import org.emoflon.ibex.gt.api.GraphTransformationPattern;

import GTLanguage.GTLanguagePackage;
import GTLanguage.GTRuleSet;
import IBeXLanguage.IBeXLanguagePackage;
import IBeXLanguage.IBeXPatternSet;
import SimulationDefinition.SimDefinition;
import SimulationDefinition.SimulationDefinitionFactory;
import org.simsg.core.persistence.*;
import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pm.ibex.IBeXDemoclesEngine;
import org.simsg.core.pmc.IBeXPMC;
import org.simsg.core.pmc.PatternMatchingController;

public class Sandbox {

	public static void main(String[] args) {
		Resource model = loadAModel("Goldbeter_Koshland");
		SimDefinition def = generateSimDef();
		
		PatternMatchingEngine e = new IBeXDemoclesEngine();
		PatternMatchingController pmc = new IBeXPMC();
		pmc.setEngine(e);
		pmc.loadModels(def, model);
		pmc.initController();
		pmc.initEngine();
		pmc.collectAllMatches();
		pmc.getAllMatches().forEach((name, matches) -> {
			System.out.println("Pattern: "+name+" num: "+matches.size());
		});
	}
	
	public static String eMoflonPackageFromDef(SimDefinition def) {
		String pck = "";
		String uri = def.getGtRulesURI();
		System.out.println(uri);
		Pattern pattern = Pattern.compile("^(.*src-gen/)(.*)(api/gt-rules.xmi)$");
		Matcher matcher = pattern.matcher(uri);
		matcher.matches();
		String ns = matcher.group(2);
		System.out.println(ns);
		Pattern pattern2 = Pattern.compile("^(.*/)(.*)(/)$");
		Matcher matcher2 = pattern2.matcher(ns);
		matcher2.matches();
		String pack = matcher2.group(2);
		System.out.println(pack);
		ns = ns.substring(0, ns.length()-1);
		ns = ns.replace("/", ".");
		System.out.println(ns);
		pack = pack.substring(0, 1).toUpperCase() + pack.substring(1, pack.length());
		System.out.println(pack);
		String nsApi = ns+".api";
		System.out.println(nsApi);
		return pck;
	}
	
	public static void runEMoflonDynamic() {
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
	}
	
	public static SimDefinition generateSimDef() {
		URI gtRulesURI = URI.createFileURI("src-gen\\org\\simsg\\examples\\devel\\api\\gt-rules.xmi");
		URI ibexPatternsURI = URI.createFileURI("src-gen\\org\\simsg\\examples\\devel\\api\\ibex-patterns.xmi");
		URI simModelURI = URI.createFileURI("models\\SimulationModels\\Goldbeter_Koshland.xmi");
		URI simMetamodelURI = URI.createFileURI("models\\SimulationMetaModels\\Goldbeter_Koshland.ecore");
		
		SimDefinition def = createSimulationDefinition("Goldbeter_Koshland", gtRulesURI, ibexPatternsURI, simModelURI, simMetamodelURI);
		
		URI simDefinitionURI = URI.createFileURI("models\\SimDefTest.xmi");
		saveDefinition(def, simDefinitionURI);
		return def;
	}
	
	public static Resource loadAModel(String model) {
		PersistenceManager pm = new SimplePersistenceManager();
		pm.setModelFolderPath(System.getProperty("user.dir")+"//models");
		pm.init();
		try {
			SimDefinition def = pm.loadSimulationDefinition("Goldbeter_Koshland");
			return pm.loadSimulationModel(def);
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