package org.simsg.ui.build

import org.eclipse.core.resources.IFile
import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets
import org.emoflon.ibex.gt.codegen.EClassifiersManager
import org.eclipse.emf.common.util.URI

class SimSGAPIBuilder {
	static def buildAPI(IFile path, String apiPackage, String classPrefix, EClassifiersManager ecManager) {
		writeFile(path, generateAPICode(apiPackage, classPrefix, ecManager));
	}
	
	static def String generateAPICode(String apiPackage, String classPrefix, EClassifiersManager ecManager) {
		return '''package «apiPackage»;
import org.simsg.core.simulation.SimSGAPI;
import java.util.HashMap;
«FOR importClass : ecManager.getImportsForPackages.sortBy[it.toLowerCase]»
import «importClass»;
«ENDFOR»
import «createEMoflonFQNAppName(apiPackage, "HiPE")»;
import «createEMoflonFQNAppName(apiPackage, "Democles")»;
		
public class «classPrefix»SimSGApi extends SimSGAPI{
			
	public «classPrefix»SimSGApi() {
		super();
		configurator.setProjectFolder(System.getProperty("user.dir"));
		configurator.setRootDataFolder(System.getProperty("user.dir")+"/instances"); 
		configurator.setSimulationDefinitionFolder(System.getProperty("user.dir")+"/instances/simulation_definitions"); 
		configurator.setSimulationInstancesFolder(System.getProperty("user.dir")+"/instances/simulation_instances"); 
		configurator.setSimulationResultsFolder(System.getProperty("user.dir")+"/instances/simulation_results"); 
	}
	
	public «classPrefix»SimSGApi(final String projectFolder) {
		super();
		configurator.setProjectFolder(projectFolder);
		configurator.setRootDataFolder(projectFolder+"/instances"); 
		configurator.setSimulationDefinitionFolder(projectFolder+"/instances/simulation_definitions"); 
		configurator.setSimulationInstancesFolder(projectFolder+"/instances/simulation_instances"); 
		configurator.setSimulationResultsFolder(projectFolder+"/instances/simulation_results"); 
	}
	
			
	public void configureForHiPE() {
		configurator.configureForIBeX(apps.get("«createEMoflonAppName(apiPackage, "HiPE")»"));
	}
			
	public void configureForDemocles() {
		configurator.configureForIBeX(apps.get("«createEMoflonAppName(apiPackage, "Democles")»"));
	}	
				
	public void configureStochasticSimulation() {
		try {
			configurator.setStochasticSimulation();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
			
	public void configureSimpleSimulation(final boolean deterministic) {
		try {
			configurator.setSimpleSimulation(deterministic);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void initAppsMap() {
		apps = new HashMap<>();
		apps.put("«createEMoflonAppName(apiPackage, "HiPE")»", () -> new «createEMoflonAppName(apiPackage, "HiPE")»());
		apps.put("«createEMoflonAppName(apiPackage, "Democles")»", () -> new «createEMoflonAppName(apiPackage, "Democles")»());
	}
			
	@Override
	public void registerMetamodels() {
		«FOR p : ecManager.packages»
			addMetaModel(«p».eINSTANCE.getNsURI(), «p».eINSTANCE);
		«ENDFOR»
	}
	
}'''
	}
	
	/**
	 * Creates the file containing the content.
	 */
	private static def writeFile(IFile file, String content) {
		val contentStream = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8))
		if (file.exists) {
			file.setContents(contentStream, true, true, null)
		} else {
			file.create(contentStream, true, null)
		}
	}
	
	private static def createEMoflonAppName(String apiPackage, String engineName) {
		val uri = URI.createFileURI(apiPackage.replace(".", "/")).trimSegments(1)
		val packageName = uri.lastSegment().substring(0,1).toUpperCase() + uri.lastSegment().substring(1, uri.lastSegment().length())
		return '''«packageName»«engineName»App'''
	}
	
	private static def createEMoflonFQNAppName(String apiPackage, String engineName) {
		val uri = URI.createFileURI(apiPackage.replace(".", "/")).trimSegments(1)
		val packageName = uri.lastSegment().substring(0,1).toUpperCase() + uri.lastSegment().substring(1, uri.lastSegment().length())
		return '''«apiPackage».«packageName»«engineName»App'''
	}
}