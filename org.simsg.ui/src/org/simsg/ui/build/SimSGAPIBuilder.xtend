package org.simsg.ui.build

import org.eclipse.core.resources.IFile
import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets

class SimSGAPIBuilder {
	static def buildAPI(IFile path, String apiPackage, String classPrefix) {
		writeFile(path, generateAPICode(apiPackage, classPrefix));
	}
	
	static def String generateAPICode(String apiPackage, String classPrefix) {
		return '''package «apiPackage»;
		import org.simsg.core.simulation.SimSGAPI;
		
		public class «classPrefix»SimSGApi extends SimSGAPI{
			
			public «classPrefix»SimSGApi() {
				super();
				configurator.setRootDataFolder(System.getProperty("user.dir")+"/instances"); 
				configurator.setSimulationDefinitionFolder(System.getProperty("user.dir")+"/instances/simulation_definitions"); 
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
		}
		'''
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