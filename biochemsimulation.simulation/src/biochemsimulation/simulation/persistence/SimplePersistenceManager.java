package biochemsimulation.simulation.persistence;

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

import org.eclipse.emf.ecore.resource.Resource;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactioncontainer.generator.ReactionContainerGenerator;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage;

public class SimplePersistenceManager implements PersistenceManager {
	
	final public static String REACTION_CONTAINER_MODELS_FOLDER = "ReactionContainerModels";
	final public static String REACTION_CONTAINER_MODELS_HEADER = "<reactioncontainer:ReactionContainer xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:reactioncontainer=\"http://www.reactioncontainer.biochemsimulation.org/reactioncontainer\" xsi:schemaLocation=\"http://www.reactioncontainer.biochemsimulation.org/reactioncontainer java://biochemsimulation.reactioncontainer.ReactionContainerPackage\"";
	final public static String REACTION_RULE_MODELS_FOLDER = "ReactionRuleModels";
	final public static String REACTION_RULE_MODELS_HEADER = "<reactionRules:ReactionRuleModel xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:reactionRules=\"http://www.reactionrules.biochemsimulation/ReactionRules\" xsi:schemaLocation=\"http://www.reactionrules.biochemsimulation/ReactionRules java://biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage\">";
	final public static String REACTION_RULE_MODELS_NAME_LOCATION = "<model xmi:type=\"reactionRules:Model\" name=";
	
	private HashMap<String, String> reactionModelPaths;
	private HashMap<String, String> ruleModelPaths;
	
	private HashMap<String, ReactionContainer> reactionModelCache;
	private HashMap<String, ReactionRuleModel> ruleModelCache;
	
	private String dataFolder;
	private String reactionModelFolder;
	private String ruleModelFolder;
	
	@Override
	public void init() {
		ReactionRulesPackage.eINSTANCE.eClass();
		ReactionContainerPackage.eINSTANCE.eClass();
		setFolderPaths();
		fetchExistingRuleModelPaths();
		fetchExistingReactionModelPaths();
		reactionModelCache = new HashMap<String, ReactionContainer>();
		ruleModelCache = new HashMap<String, ReactionRuleModel>();
	}
	
	@Override
	public Set<String> availableReactionRuleModels() {
		return ruleModelPaths.keySet();
	}

	@Override
	public Set<String> availableReactionContainerModels() {
		return reactionModelPaths.keySet();
	}

	@Override
	public ReactionRuleModel loadReactionRuleModel (String name) throws Exception {
		if(ruleModelCache.containsKey(name)) {
			return ruleModelCache.get(name);
		}
		if(!ruleModelPaths.containsKey(name))
			throw new IndexOutOfBoundsException("");
		
		ReactionRuleModel model = null;
		Resource modelResource = PersistenceUtils.loadResource(ruleModelPaths.get(name));
		
		model = (ReactionRuleModel) modelResource.getContents().get(0);
		ruleModelCache.put(name, model);
		return model;
	}

	@Override
	public ReactionContainer loadReactionContainerModel(String name, boolean generateIfNotExist) throws Exception {
		if(reactionModelCache.containsKey(name)) {
			return reactionModelCache.get(name);
		}
		boolean doesNotExist = false;
		if(!reactionModelPaths.containsKey(name)) {
			doesNotExist = true;
		}
		if(doesNotExist && !generateIfNotExist) {
			throw new IndexOutOfBoundsException("");
		}
		ReactionContainer containerModel = null;
		if(doesNotExist) {
			ReactionRuleModel ruleModel = loadReactionRuleModel(name);
			ReactionContainerGenerator gen = new ReactionContainerGenerator(ruleModel);
			String path = reactionModelFolder+"/"+name+".xmi";
			containerModel = gen.doGenerate(path, true);
			reactionModelPaths.put(name, path);
		}else {
			Resource modelResource = PersistenceUtils.loadResource(reactionModelPaths.get(name));
			containerModel = (ReactionContainer) modelResource.getContents().get(0);
		}
		reactionModelCache.put(name, containerModel);
		return containerModel;
	}
	
	private void setFolderPaths() {
		dataFolder = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		dataFolder = dataFolder.replaceFirst("/bin", "");
		dataFolder = dataFolder.replaceFirst("^/", "");
		dataFolder = dataFolder.replaceFirst("%20", " ");
		dataFolder += "data/";
		PersistenceUtils.createFolderIfNotExist(dataFolder);
		
		reactionModelFolder = dataFolder + REACTION_CONTAINER_MODELS_FOLDER;
		PersistenceUtils.createFolderIfNotExist(reactionModelFolder);
		
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
	
	private void fetchExistingReactionModelPaths() {
		reactionModelPaths = new HashMap<String, String>();
		
		List<String> allFiles = PersistenceUtils.getAllFilesInFolder(reactionModelFolder);
		Pattern pattern = Pattern.compile("Name=\"(.*?)\"");
		
		for(String filePath : allFiles) {
			if(!filePath.matches(".+(\\.xmi)$")) {
			}else {
				File candidate = new File(filePath);
				Path p = candidate.toPath();
				try {
					Optional<String> line = Files.lines(p).filter(x->x.contains(REACTION_CONTAINER_MODELS_HEADER)).findFirst();
					if(line.isPresent()) {
						String key = line.orElse("");
						Matcher matcher = pattern.matcher(key);
						if(matcher.find()) {
							key = matcher.group(1);
							reactionModelPaths.put(key, filePath);
						}
					}
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

}
