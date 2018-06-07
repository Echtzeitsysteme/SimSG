package biochemsimulation.simulation.persistence;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class PersistenceUtils {
	
	public static List<String> getAllFilesInFolder(String folder) {
		List<String> fileNames = new LinkedList<String>();
		File dir = new File(folder);
		if(dir.exists()) {
			File[] contents = dir.listFiles();
			for(File f : contents) {
				fileNames.add(f.getAbsolutePath());
			}
		}
		
		return fileNames;
	}
	
	public static void createFolderIfNotExist(String path) {
		File dir = new File(path);
		if(dir.isDirectory() && dir.exists())
			return;
		dir.mkdir();
	}
	
	public static Resource loadResource(String path) throws Exception {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ReactionRules", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		URI uri = URI.createFileURI(path);
		Resource modelResource = rs.getResource(uri, true);
		if(modelResource == null)
			throw new IOException("File did not contain a vaild model.");
		
		return modelResource;
	}
}
