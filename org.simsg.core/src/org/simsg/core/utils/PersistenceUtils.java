package org.simsg.core.utils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.simsg.container.Container;

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
	
	public static long getLastModified(String path) {
		File file = new File(path);
		return file.lastModified();
	}
	
	public static void deleteFile(String path) {
		File file = new File(path);
		if(file.isDirectory()) {
			try {
				FileUtils.deleteDirectory(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			/*
			try {
				FileUtils.forceDelete(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
		}
	}
	
	public static JSONObject loadJSONFile(String path) {
		JSONParser parser = new JSONParser();
		try {
			return (JSONObject) parser.parse(new FileReader(path));
		} catch (IOException | ParseException e) {
			if(e instanceof java.io.FileNotFoundException) return null;
			else e.printStackTrace();
		}
		return null;
	}
	
	public static void saveJSONFile(String path, JSONObject obj) {
		try (FileWriter file = new FileWriter(path)) {
            file.write(obj.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
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
	
	public static void saveModelContainer(Container model, String path) throws Exception {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("Container", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		URI uri = URI.createFileURI(path);
		Resource modelResource = rs.createResource(uri);
		modelResource.getContents().add(model);
		
		Map<Object, Object> saveOptions = ((XMIResource)modelResource).getDefaultSaveOptions();
		saveOptions.put(XMIResource.OPTION_ENCODING,"UTF-8");
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION,Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
		
		((XMIResource)modelResource).save(saveOptions);
		System.out.println("Model saved to: "+uri.path());
	}

	
}