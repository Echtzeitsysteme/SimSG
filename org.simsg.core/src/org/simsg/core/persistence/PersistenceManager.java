package org.simsg.core.persistence;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXModel;
import org.json.simple.JSONObject;

import SimulationDefinition.SimDefinition;

public abstract class PersistenceManager {
	
	final public static String SIMULATION_MODEL_FOLDER = "SimulationModels";
	final public static String SIMULATION_RESULTS_FOLDER = "SimulationResults";
	final public static String SIMULATION_METAMODEL_FOLDER = "SimulationMetaModels";
	final public static String SIMULATION_DEFINITION_FOLDER = "SimulationDefinitions";
	final public static String PERSISTENCE_INDEX_FILE = "index.json";
	final public static String DATA_FOLDER = "data";
	final public static String SYSTEM_OS_PROPERTY = "os.name";
	final public static String SYSTEM_OS_WIN = "Windows";
	final public static String SYSTEM_OS_OTHER = "Other";
	
	protected String os;
	protected String pathSeparator;
	protected String dataFolder;
	protected String indexPath;
	protected String simulationInstancesFolder;
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
	protected HashMap<URI, Resource> ibexModelCache = new HashMap<>();
	
	public void init() {
		setOSType();
		classLoader();
		setFolderPaths();
		fetchExistingSimulationDefinitionPaths();
		fetchIndex();
	}
	
	public void setRootDataFolderPath(String path) {
		dataFolder = path;
	}
	
	public void setSimulationDefinitionFolderPath(String path) {
		simulationDefinitionFolder = path;
	}
	
	public void setSimulationInstancesFolderPath(String path) {
		simulationInstancesFolder = path;
	}
	
	public void setSimulationResultsFolderPath(String path) {
		simulationResultsFolder = path;
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
		URI rawModelURI = URI.createURI(simDef.getSimulationModelURI());
		File rawModelPath = new File(rawModelURI.toFileString());
		File canonicalPath = null;
		try {
			canonicalPath = rawModelPath.getCanonicalFile();
		} catch (IOException e) {}
		
		if(canonicalPath != null && canonicalPath.exists()) {
			return loadSimulationModel(rawModelURI);
		}else {
			String absolutePath = simulationInstancesFolder+"/"+rawModelURI.lastSegment();
			return loadSimulationModel(URI.createFileURI(absolutePath));
		}
	}
	
	public IBeXModel loadIBeXModel(SimDefinition simDef) {
		URI rawModelURI = URI.createURI(simDef.getIbexModelURI());
//		File rawModelPath = new File(rawModelURI.toFileString());
//		File canonicalPath = null;
//		try {
//			canonicalPath = rawModelPath.getCanonicalFile();
//		} catch (IOException e) {}
//		
//		if(canonicalPath != null && canonicalPath.exists()) {
//			return loadIBeXModel(rawModelURI);
//		}else {
//			String absolutePath = simulationInstancesFolder+"/"+rawModelURI.lastSegment();
//			return loadIBeXModel(URI.createFileURI(absolutePath));
//		}
		return loadIBeXModel(rawModelURI);
	}
	
	public IBeXModel loadIBeXModel(URI uri) {
		Resource model = null;
		try {
			model = PersistenceUtils.loadResource(uri);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		if(model.getContents().isEmpty())
			return null;
		
		if(!(model.getContents().get(0) instanceof IBeXModel))
			return null;
		
		if(ibexModelCache.containsKey(uri)) {
			unloadIBeXModel(uri);
		}
		
		ibexModelCache.put(uri, model);
		return (IBeXModel)model.getContents().get(0);
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
	
	public void unloadIBeXModel(URI uri) {
		ibexModelCache.get(uri).unload();
		ibexModelCache.remove(uri);
	}
	
	private void classLoader() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
	}
	
	private void setOSType() {
		os = System.getProperty(SYSTEM_OS_PROPERTY);
		if(os.contains(SYSTEM_OS_WIN)) {
			os = SYSTEM_OS_WIN;
		}else {
			os = SYSTEM_OS_OTHER;
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
		
		if(simulationDefinitionFolder == null) {
			simulationDefinitionFolder = dataFolder + SIMULATION_DEFINITION_FOLDER;
		}
		PersistenceUtils.createFolderIfNotExist(simulationDefinitionFolder);
		
		if(simulationInstancesFolder == null) {
			simulationInstancesFolder = dataFolder + SIMULATION_MODEL_FOLDER;
		}
		PersistenceUtils.createFolderIfNotExist(simulationInstancesFolder);
		
		if(simulationResultsFolder == null) {
			simulationResultsFolder = dataFolder + SIMULATION_RESULTS_FOLDER;
		}
		PersistenceUtils.createFolderIfNotExist(simulationResultsFolder);
	}
	
	private void fetchExistingSimulationDefinitionPaths() {
		
		List<String> allFiles = PersistenceUtils.getAllFilesInFolder(simulationDefinitionFolder);
		
		allFiles.parallelStream()
			.filter(path -> path.matches(".+(\\.xmi)$"))
			.map(path -> URI.createFileURI(path))
			.map(uri -> {
				try {
					return Optional.of(PersistenceUtils.loadResource(uri));
				} catch (Exception e) {
					return Optional.empty();
				}
			})
			.filter(opt -> opt.isPresent())
			.map(opt -> (Resource)opt.get())
			.filter(resource -> resource.getContents().size()>0)
			.filter(resource -> (resource.getContents().get(0) instanceof SimDefinition))
			.map(resource -> (SimDefinition)resource.getContents().get(0))
			.forEach(simDef -> {
				simulationDefinitionPaths.put(simDef.getName(), simDef.eResource().getURI());
				simDef.eResource().unload();
			});
	}	

}
