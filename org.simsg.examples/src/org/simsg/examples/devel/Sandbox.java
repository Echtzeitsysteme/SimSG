package org.simsg.examples.devel;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.simsg.core.utils.PersistenceUtils;

import GTLanguage.GTLanguagePackage;
import GTLanguage.GTRuleSet;
import IBeXLanguage.IBeXLanguagePackage;
import IBeXLanguage.IBeXPatternSet;
import SimulationDefinition.SimDefinition;
import SimulationDefinition.SimulationDefinitionFactory;

public class Sandbox {

	public static void main(String[] args) {
		
		URI gtRulesURI = URI.createFileURI("F:\\Eclipse Workspaces\\SimSG\\org.simsg.examples\\src-gen\\org\\simsg\\examples\\devel\\api\\gt-rules.xmi");
		URI ibexPatternsURI = URI.createFileURI("F:\\Eclipse Workspaces\\SimSG\\org.simsg.examples\\src-gen\\org\\simsg\\examples\\devel\\api\\ibex-patterns.xmi");
		URI simModelURI = URI.createFileURI("F:\\Eclipse Workspaces\\SimSG\\org.simsg.examples\\models\\ContainerModels\\Goldbeter_Koshland.xmi");
		URI simMetamodelURI = URI.createFileURI("F:\\Eclipse Workspaces\\SimSG\\org.simsg.examples\\models\\ContainerMetaModels\\Goldbeter_Koshland.ecore");
		
		SimDefinition def = createSimulationDefinition("Goldbeter_Koshland", gtRulesURI, ibexPatternsURI, simModelURI, simMetamodelURI);
		
		URI simDefinitionURI = URI.createFileURI("F:\\Eclipse Workspaces\\SimSG\\org.simsg.examples\\models\\SimDefTest.xmi");
		saveDefinition(def, simDefinitionURI);
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