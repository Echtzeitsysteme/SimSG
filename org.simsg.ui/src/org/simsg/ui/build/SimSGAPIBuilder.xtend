package org.simsg.ui.build

import org.eclipse.core.resources.IFile
import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets
import org.emoflon.ibex.gt.codegen.EClassifiersManager

class SimSGAPIBuilder {
	static def buildAPI(IFile path, String apiPackage, String classPrefix, EClassifiersManager ecManager) {
		writeFile(path, generateAPICode(apiPackage, classPrefix, ecManager));
	}
	
	static def String generateAPICode(String apiPackage, String classPrefix, EClassifiersManager ecManager) {
		return '''package «apiPackage»;
import org.simsg.core.simulation.SimSGAPI;
«FOR importClass : ecManager.getImportsForPackages.sortBy[it.toLowerCase]»
import «importClass»;
«ENDFOR»
		
public class «classPrefix»SimSGApi extends SimSGAPI{
			
	public «classPrefix»SimSGApi() {
		super();
		configurator.setProjectFolder(System.getProperty("user.dir"));
		configurator.setRootDataFolder(System.getProperty("user.dir")+"/instances"); 
		configurator.setSimulationDefinitionFolder(System.getProperty("user.dir")+"/instances/simulation_definitions"); 
		configurator.setSimulationInstancesFolder(System.getProperty("user.dir")+"/instances/simulation_instances"); 
		configurator.setSimulationResultsFolder(System.getProperty("user.dir")+"/instances/simulation_results"); 
	}
			
	public void configureForHiPE() {
		configurator.setIBeXPMC();
		configurator.setIBeXHiPEGT("«apiPackage»");
		configurator.setIBeXHiPEAsEngine("«apiPackage»");
	}
			
	public void configureForDemocles() {
		configurator.setIBeXPMC();
		configurator.setIBeXDemoclesGT("«apiPackage»");
		configurator.setIBeXDemoclesAsEngine("«apiPackage»");
	}
			
	public void configureForHiPE(final String externalApiPackage) {
		configurator.setIBeXPMC();
		configurator.setIBeXHiPEGT(externalApiPackage);
		configurator.setIBeXHiPEAsEngine(externalApiPackage);
	}
			
	public void configureForDemocles(final String externalApiPackage) {
		configurator.setIBeXPMC();
		configurator.setIBeXDemoclesGT(externalApiPackage);
		configurator.setIBeXDemoclesAsEngine(externalApiPackage);
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
}