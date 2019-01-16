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
import org.simsg.container.Container;
import org.simsg.container.ContainerPackage;
import org.simsg.core.utils.PersistenceUtils;
import org.simsg.simsgl.simSGL.SimSGLModel;
import org.simsg.simsgl.simSGL.SimSGLPackage;

public abstract class PersistenceManager {
	
	final public static String REACTION_CONTAINER_MODELS_FOLDER = "ReactionContainerModels";
	final public static String REACTION_CONTAINER_METAMODELS_FOLDER = "ReactionContainerMetaModels";
	final public static String REACTION_RULE_MODELS_FOLDER = "ReactionRuleModels";
	final public static String REACTION_RULE_MODELS_HEADER = "<simSGL:SimSGLModel xmi:version=\"2.0\"";
	final public static String REACTION_RULE_MODELS_NAME_LOCATION = "<model xmi:type=\"simSGL:Model\" name=";
	final public static String PERSISTENCE_INDEX_FILE = "simple_persistence_index.json";
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
	protected String reactionModelFolder;
	protected String reactionMetamodelFolder;
	protected String ruleModelFolder;
	protected String containerModelSuffix;
	
	protected JSONObject modelIndex;
	protected HashMap<String, String> reactionModelPaths;
	protected HashMap<String, String> reactionMetamodelPaths;
	protected HashMap<String, String> ruleModelPaths;
	protected HashMap<String, SimSGLModel> ruleModelCache;
	protected HashMap<String, Container> reactionContainerModelCache;
	
	public PersistenceManager() {
		ruleModelCache = new HashMap<String, SimSGLModel>();
		reactionContainerModelCache = new HashMap<String, Container>();
	}
	
	public void setModelFolderPath(String path) {
		dataFolder = path;
	}
	
	protected abstract void setContainerModelSuffix();
	
	protected abstract void fetchExistingReactionModelPaths();
	
	protected void fetchExistingReactionMetamodelPaths() {
		reactionMetamodelPaths = new HashMap<String, String>();
		
		List<String> allFiles = PersistenceUtils.getAllFilesInFolder(reactionMetamodelFolder);
		Pattern pattern = Pattern.compile(".+\\\\(.+)\\"+".ecore");
		
		for(String filePath : allFiles) {
			if(filePath.matches(".+(\\"+".ecore"+")$")) {
				Matcher matcher = pattern.matcher(filePath);
				if(matcher.find()) {
					String modelName = matcher.group(1);
					reactionMetamodelPaths.put(modelName, filePath);
				}
			}
		}
	}
	
	public abstract Container loadReactionContainerModel(String name) throws Exception;
	
	public void init() {
		setContainerModelSuffix();
		setOSspecificSeparators();
		classLoader();
		setFolderPaths();
		fetchExistingRuleModelPaths();
		fetchExistingReactionModelPaths();
		fetchExistingReactionMetamodelPaths();
		fetchIndex();
	}
	
	private void classLoader() {
		SimSGLPackage.eINSTANCE.eClass();
		ContainerPackage.eINSTANCE.eClass();
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
		ruleModelPaths.forEach((modelName, path) -> {
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
		
		reactionModelFolder = dataFolder + REACTION_CONTAINER_MODELS_FOLDER;
		PersistenceUtils.createFolderIfNotExist(reactionModelFolder);
		
		reactionMetamodelFolder = dataFolder + REACTION_CONTAINER_METAMODELS_FOLDER;
		PersistenceUtils.createFolderIfNotExist(reactionMetamodelFolder);
		
		ruleModelFolder = dataFolder + REACTION_RULE_MODELS_FOLDER;
		PersistenceUtils.createFolderIfNotExist(ruleModelFolder);
	}
	
	private void fetchExistingRuleModelPaths() {
		ruleModelPaths = new HashMap<String, String>();
		
		List<String> allFiles = PersistenceUtils.getAllFilesInFolder(ruleModelFolder);
		Pattern pattern = Pattern.compile("name=\"(.*?)\"");
		
		for(String filePath : allFiles) {
			if(!filePath.matches(".+(\\.xmi)$")) {
			}else {
				File candidate = new File(filePath);
				Path p = candidate.toPath();
				try {
					if(Files.lines(p).filter(x->x.contains(REACTION_RULE_MODELS_HEADER)).findFirst().isPresent()) {
						Optional<String> line = Files.lines(p).filter(x->x.contains(REACTION_RULE_MODELS_NAME_LOCATION)).findFirst();
						String key = line.orElse("");
						Matcher matcher = pattern.matcher(key);
						if(matcher.find()) {
							key = matcher.group(1);
							ruleModelPaths.put(key, filePath);
						}
					}
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	
	protected boolean checkExistenceAndIndexContainer(String modelName, boolean deleteOutdated) {
		if(!ruleModelPaths.containsKey(modelName)) {
			return false;
		}
		if(!reactionModelPaths.containsKey(modelName)) {
			return false;
		}
		long index = (long) modelIndex.get(modelName);
		long file = PersistenceUtils.getLastModified(reactionModelPaths.get(modelName));
		if(index >= file) {
			if(deleteOutdated) {
				PersistenceUtils.deleteFile(reactionModelPaths.get(modelName));
			}
			return false;
		}
		
		return true;
	}
	
	protected boolean checkExistenceAndIndexMetamodel(String modelName, boolean deleteOutdated) {
		if(!ruleModelPaths.containsKey(modelName)) {
			return false;
		}
		if(!reactionMetamodelPaths.containsKey(modelName)) {
			return false;
		}
		long index = (long) modelIndex.get(modelName);
		long file = PersistenceUtils.getLastModified(reactionMetamodelPaths.get(modelName));
		if(index >= file) {
			if(deleteOutdated) {
				PersistenceUtils.deleteFile(reactionMetamodelPaths.get(modelName));
			}
			return false;
		}
		
		return true;
	}
	
	public Set<String> availableReactionRuleModels() {
		return ruleModelPaths.keySet();
	}

	public Set<String> availableReactionContainerModels() {
		return reactionModelPaths.keySet();
	}
	
	synchronized public SimSGLModel loadReactionRuleModel (String name) throws java.lang.Exception {
		if(ruleModelCache.containsKey(name)) {
			return ruleModelCache.get(name);
		}
		if(!ruleModelPaths.containsKey(name))
			throw new IndexOutOfBoundsException("Requested reaction rule model with given name does not exist.");
		
		SimSGLModel model = null;
		Resource modelResource = PersistenceUtils.loadResource(ruleModelPaths.get(name));
		
		model = (SimSGLModel) modelResource.getContents().get(0);
		ruleModelCache.put(name, model);
		return model;
	}
	
	synchronized public void loadAndRegisterMetamodel(String name) throws java.lang.Exception {
		if(!reactionMetamodelPaths.containsKey(name))
			throw new IndexOutOfBoundsException("Requested container metamodel with given name does not exist.");
		
		Resource metaModelResource = null;
		metaModelResource = PersistenceUtils.loadResource(reactionMetamodelPaths.get(name));
		
		EPackage metaModel = (EPackage) metaModelResource.getContents().get(0);
		EPackage.Registry.INSTANCE.put(metaModel.getNsURI(), metaModel);
	}
	
	synchronized public void unloadReactionContainerModel(String name) {
		reactionContainerModelCache.get(name).eResource().unload();
		reactionContainerModelCache.remove(name);
	}

}
