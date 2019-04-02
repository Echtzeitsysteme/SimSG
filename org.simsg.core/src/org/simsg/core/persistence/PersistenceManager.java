package org.simsg.core.persistence;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.json.simple.JSONObject;
import org.simsg.core.utils.PersistenceUtils;

public abstract class PersistenceManager {
	
	final public static String SIMULATION_MODEL_FOLDER = "SimulationModels";
	final public static String SIMULATION_METAMODEL_FOLDER = "SimulationMetaModels";
	final public static String SIMULATION_DEFINITION_FOLDER = "SimulationDefinitions";
	//TODO: mh how to detect valid generic models?
	final public static String SIMULATION_DEFINITION_HEADER = "<simSGL:SimSGLModel xmi:version=\"2.0\"";
	//TODO: same here..
	final public static String SIMULATION_DEFINITION_NAME_LOCATION = "<model xmi:type=\"simSGL:Model\" name=";
	final public static String PERSISTENCE_INDEX_FILE = "index.json";
	final public static String DATA_FOLDER = "data";
	final public static String SEPARATOR_WIN = "\\";
	final public static String SEPARATOR_OSX = "/";
	final public static String SYSTEM_OS_PROPERTY = "os.name";
	final public static String SYSTEM_OS_WIN = "Windows";
	final public static String SYSTEM_OS_OSX = "Mac OS X";
	
	protected String os;
	protected String pathSeparator;
	protected String dataFolder;
	protected String indexPath;
	protected String simulationModelFolder;
	protected String simulationMetamodelFolder;
	protected String simulationDefinitionFolder;
	protected String simulationModelSuffix;
	
	protected JSONObject modelIndex;
	protected HashMap<String, String> simulationModelPaths;
	protected HashMap<String, String> simulationMetamodelPaths;
	protected HashMap<String, String> simulationDefinitionPaths;
	protected HashMap<String, Resource> simulationDefinitionCache = new HashMap<>();
	protected HashMap<String, Resource> simulationModelCache = new HashMap<>();
	
	public PersistenceManager() {}
	
	public abstract void setAdditionalParameters(Object ... params);
	
	public void setModelFolderPath(String path) {
		dataFolder = path;
	}
	
	protected abstract void setSimulationModelSuffix();
	
	protected abstract void fetchExistingSimulationModelPaths();
	
	protected void fetchExistingSimulationMetamodelPaths() {
		simulationMetamodelPaths = new HashMap<String, String>();
		
		List<String> allFiles = PersistenceUtils.getAllFilesInFolder(simulationMetamodelFolder);
		Pattern pattern = Pattern.compile(".+\\\\(.+)\\"+".ecore");
		
		for(String filePath : allFiles) {
			if(filePath.matches(".+(\\"+".ecore"+")$")) {
				Matcher matcher = pattern.matcher(filePath);
				if(matcher.find()) {
					String modelName = matcher.group(1);
					simulationMetamodelPaths.put(modelName, filePath);
				}
			}
		}
	}
	
	public abstract Resource loadSimulationModel(String name) throws Exception;
	
	public void init() {
		setSimulationModelSuffix();
		setOSspecificSeparators();
		classLoader();
		setFolderPaths();
		fetchExistingSimulationDefinitionPaths();
		fetchExistingSimulationModelPaths();
		fetchExistingSimulationMetamodelPaths();
		fetchIndex();
	}
	
	private void classLoader() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
	}
	
	private void setOSspecificSeparators() {
		os = System.getProperty(SYSTEM_OS_PROPERTY);
		if(os.contains(SYSTEM_OS_WIN)) {
			pathSeparator = SEPARATOR_WIN;
			os = SYSTEM_OS_WIN;
		}else {
			pathSeparator = SEPARATOR_OSX;
		}
	}
	
	private void fetchIndex() {
		modelIndex = PersistenceUtils.loadJSONFile(indexPath);
		if(modelIndex == null) {
			createNewIndex();
			PersistenceUtils.saveJSONFile(indexPath, modelIndex);
		}else {
			updateIndex();
			PersistenceUtils.saveJSONFile(indexPath, modelIndex);
		}
	}
	
	private void createNewIndex() {
		modelIndex = new JSONObject();
		updateIndex();
	}
	
	@SuppressWarnings("unchecked")
	private void updateIndex() {
		simulationDefinitionPaths.forEach((modelName, path) -> {
			modelIndex.put(modelName, PersistenceUtils.getLastModified(path));
		});
	}
	
	private void setFolderPaths() {
		if(dataFolder == null) {
			dataFolder = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
			dataFolder = dataFolder.replaceFirst("/bin", "");
			if(os.equalsIgnoreCase(SYSTEM_OS_WIN)) {
				dataFolder = dataFolder.replaceFirst("^/", "");
			}
			dataFolder = dataFolder.replaceFirst("%20", " ");
			dataFolder += DATA_FOLDER+"/";
			System.out.println("Using default model folder: "+dataFolder);
		}else {
			dataFolder = dataFolder.replaceAll("\\\\", "//");
			dataFolder += "//";
			System.out.println("Using user model folder: "+dataFolder);
		}
		PersistenceUtils.createFolderIfNotExist(dataFolder);
		
		indexPath = dataFolder+PERSISTENCE_INDEX_FILE;
		
		simulationModelFolder = dataFolder + SIMULATION_MODEL_FOLDER;
		PersistenceUtils.createFolderIfNotExist(simulationModelFolder);
		
		simulationMetamodelFolder = dataFolder + SIMULATION_METAMODEL_FOLDER;
		PersistenceUtils.createFolderIfNotExist(simulationMetamodelFolder);
		
		simulationDefinitionFolder = dataFolder + SIMULATION_DEFINITION_FOLDER;
		PersistenceUtils.createFolderIfNotExist(simulationDefinitionFolder);
	}
	
	private void fetchExistingSimulationDefinitionPaths() {
		simulationDefinitionPaths = new HashMap<String, String>();
		
		List<String> allFiles = PersistenceUtils.getAllFilesInFolder(simulationDefinitionFolder);
		Pattern pattern = Pattern.compile("name=\"(.*?)\"");
		
		for(String filePath : allFiles) {
			if(!filePath.matches(".+(\\.xmi)$")) {
			}else {
				File candidate = new File(filePath);
				Path p = candidate.toPath();
				try {
					if(Files.lines(p).filter(x->x.contains(SIMULATION_DEFINITION_HEADER)).findFirst().isPresent()) {
						Optional<String> line = Files.lines(p).filter(x->x.contains(SIMULATION_DEFINITION_NAME_LOCATION)).findFirst();
						String key = line.orElse("");
						Matcher matcher = pattern.matcher(key);
						if(matcher.find()) {
							key = matcher.group(1);
							simulationDefinitionPaths.put(key, filePath);
						}
					}
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	
	protected boolean checkExistenceAndIndexSimulationModel(String modelName, boolean deleteOutdated) {
		if(!simulationDefinitionPaths.containsKey(modelName)) {
			return false;
		}
		if(!simulationModelPaths.containsKey(modelName)) {
			return false;
		}
		long index = (long) modelIndex.get(modelName);
		long file = PersistenceUtils.getLastModified(simulationModelPaths.get(modelName));
		if(index >= file) {
			if(deleteOutdated) {
				PersistenceUtils.deleteFile(simulationModelPaths.get(modelName));
			}
			return false;
		}
		
		return true;
	}
	
	protected boolean checkExistenceAndIndexMetamodel(String modelName, boolean deleteOutdated) {
		if(!simulationDefinitionPaths.containsKey(modelName)) {
			return false;
		}
		if(!simulationMetamodelPaths.containsKey(modelName)) {
			return false;
		}
		long index = (long) modelIndex.get(modelName);
		long file = PersistenceUtils.getLastModified(simulationMetamodelPaths.get(modelName));
		if(index >= file) {
			if(deleteOutdated) {
				PersistenceUtils.deleteFile(simulationMetamodelPaths.get(modelName));
			}
			return false;
		}
		
		return true;
	}
	
	public Set<String> availableSimulationDefinitions() {
		return simulationDefinitionPaths.keySet();
	}

	public Set<String> availableSimulationModels() {
		return simulationModelPaths.keySet();
	}
	
	synchronized public Resource loadSimulationDefinition (String name) throws java.lang.Exception {
		if(simulationDefinitionCache.containsKey(name)) {
			return simulationDefinitionCache.get(name);
		}
		if(!simulationDefinitionPaths.containsKey(name))
			throw new IndexOutOfBoundsException("Requested reaction rule model with given name does not exist.");
		
		Resource resource = PersistenceUtils.loadResource(simulationDefinitionPaths.get(name));

		simulationDefinitionCache.put(name, resource);
		return resource;
	}
	
	synchronized public void loadAndRegisterMetamodel(String name) throws java.lang.Exception {
		if(!simulationMetamodelPaths.containsKey(name))
			throw new IndexOutOfBoundsException("Requested container metamodel with given name does not exist.");
		
		Resource metaModelResource = null;
		metaModelResource = PersistenceUtils.loadResource(simulationMetamodelPaths.get(name));
		
		EPackage metaModel = (EPackage) metaModelResource.getContents().get(0);
		EPackage.Registry.INSTANCE.put(metaModel.getNsURI(), metaModel);
	}
	
	synchronized public void unloadSimulationModel(String name) {
		simulationModelCache.get(name).unload();
		simulationModelCache.remove(name);
	}

}
