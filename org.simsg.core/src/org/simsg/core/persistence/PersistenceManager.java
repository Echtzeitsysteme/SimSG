package org.simsg.core.persistence;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.json.simple.JSONObject;

import SimulationDefinition.SimDefinition;

public abstract class PersistenceManager {
	
	final public static String SIMULATION_MODEL_FOLDER = "SimulationModels";
	final public static String SIMULATION_RESULTS_FOLDER = "SimulationResults";
	final public static String SIMULATION_METAMODEL_FOLDER = "SimulationMetaModels";
	final public static String SIMULATION_DEFINITION_FOLDER = "SimulationDefinitions";
	//TODO: mh how to detect valid generic models?
	final public static String SIMULATION_DEFINITION_HEADER = "<org.simsg:SimDefinition";
	//TODO: same here..
	final public static String SIMULATION_DEFINITION_NAME_LOCATION = "java://SimulationDefinition.SimulationDefinitionPackage\" name=";
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
	protected String simulationResultsFolder;
	protected String simulationMetamodelFolder;
	protected String simulationDefinitionFolder;
	protected String simulationModelSuffix;
	
	protected JSONObject modelIndex;
	protected Set<URI> simulationModelPaths = new HashSet<>();
	protected Set<URI> simulationMetamodelPaths = new HashSet<>();
	protected HashMap<String, URI> simulationDefinitionPaths = new HashMap<>();
	protected HashMap<String, SimDefinition> simulationDefinitionCache = new HashMap<>();
	protected HashMap<URI, Resource> simulationModelCache = new HashMap<>();
	
	public PersistenceManager() {}
	
	public abstract void setAdditionalParameters(Object ... params);
	
	public void init() {
		setOSspecificSeparators();
		classLoader();
		setFolderPaths();
		fetchExistingSimulationDefinitionPaths();
		fetchIndex();
	}
	
	public void setModelFolderPath(String path) {
		dataFolder = path;
	}
	
	public Set<String> availableSimulationDefinitions() {
		return simulationDefinitionPaths.keySet();
	}
	
	public Collection<URI> availableSimulationDefinitionURIs() {
		return simulationDefinitionPaths.values();
	}

	public Set<URI> availableSimulationModels() {
		return simulationModelPaths;
	}
	
	public SimDefinition loadSimulationDefinition (String name) {
		if(simulationDefinitionCache.containsKey(name)) {
			return simulationDefinitionCache.get(name);
		}
		if(!simulationDefinitionPaths.containsKey(name))
			throw new IndexOutOfBoundsException("Requested reaction rule model with given name does not exist.");
		
		Resource resource = null;
		try {
			resource = PersistenceUtils.loadResource(simulationDefinitionPaths.get(name));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		SimDefinition simDef = (SimDefinition) resource.getContents().get(0);

		simulationDefinitionCache.put(name, simDef);
		return simDef;
	}
	
	public SimDefinition loadSimulationDefinition (URI uri) {
		Resource resource = null;
		try {
			resource = PersistenceUtils.loadResource(uri);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		SimDefinition simDef = (SimDefinition) resource.getContents().get(0);
		simulationDefinitionPaths.put(simDef.getName(), uri);
		simulationDefinitionCache.put(simDef.getName(), simDef);
		return simDef;
	}
	
	public abstract Resource loadSimulationModel(URI uri);
	
	public Resource loadSimulationModel(SimDefinition simDef) {
		loadAndRegisterMetamodel(URI.createURI(simDef.getMetamodelURI()));
		return loadSimulationModel(URI.createURI(simDef.getSimulationModelURI()));
	}
	
	public void loadAndRegisterMetamodel(URI uri) {
		
		Resource metaModelResource = null;
		try {
			metaModelResource = PersistenceUtils.loadEcoreResource(uri);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		EPackage metaModel = (EPackage) metaModelResource.getContents().get(0);
		EPackage.Registry.INSTANCE.put(metaModel.getNsURI(), metaModel);
		metaModel.getEFactoryInstance().eClass();
	}
	
	public boolean saveSimulationModel(SimDefinition simDef, Resource simModel) {
		String filename = simulationResultsFolder+"/"+simDef.getName();
		return saveSimulationModel(filename, simModel);
	}
	
	public abstract boolean saveSimulationModel(String filename, Resource simModel);
	
	public void unloadSimulationModel(URI uri) {
		simulationModelCache.get(uri).unload();
		simulationModelCache.remove(uri);
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
		simulationDefinitionPaths.forEach((modelName, uri) -> {
			modelIndex.put(modelName, PersistenceUtils.getLastModified(uri.path()));
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
		
		simulationDefinitionFolder = dataFolder + SIMULATION_DEFINITION_FOLDER;
		PersistenceUtils.createFolderIfNotExist(simulationDefinitionFolder);
		
		simulationResultsFolder = dataFolder + SIMULATION_RESULTS_FOLDER;
		PersistenceUtils.createFolderIfNotExist(simulationResultsFolder);
	}
	
	private void fetchExistingSimulationDefinitionPaths() {
		
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
							simulationDefinitionPaths.put(key, URI.createFileURI(filePath));
						}
					}
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}	

}
