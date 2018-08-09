package biochemsimulation.simulation.persistence;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.resource.Resource;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.generator.ReactionContainerEMF;
import biochemsimulation.reactioncontainer.generator.ReactionContainerGenerator;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;

public class SimplePersistenceManager extends PersistenceManager {
	
	final public static String REACTION_CONTAINER_MODELS_HEADER = "<reactioncontainer:ReactionContainer xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:reactioncontainer=\"http://www.reactioncontainer.biochemsimulation.org/reactioncontainer\" xsi:schemaLocation=\"http://www.reactioncontainer.biochemsimulation.org/reactioncontainer java://biochemsimulation.reactioncontainer.ReactionContainerPackage\"";
	
	SimplePersistenceManager() {
		super();
	}
	
	@Override
	public ReactionContainer loadReactionContainerModel(String name) throws Exception {
		ReactionContainer containerModel = null;
		if(!checkExistenceAndIndex(name, true)) {
			ReactionRuleModel ruleModel = loadReactionRuleModel(name);
			ReactionContainerGenerator gen = new ReactionContainerEMF(ruleModel);
			String path = reactionModelFolder+"/"+name+containerModelSuffix;
			containerModel = gen.doGenerate(path, true);
			reactionModelPaths.put(name, path);
		}else {
			Resource modelResource = PersistenceUtils.loadResource(reactionModelPaths.get(name));
			containerModel = (ReactionContainer) modelResource.getContents().get(0);
		}
		if(reactionContainerModelCache.containsKey(name)) {
			unloadReactionContainerModel(name);
		}
		
		reactionContainerModelCache.put(name, containerModel);
		return containerModel;
	}
	
	@Override
	protected void fetchExistingReactionModelPaths() {
		reactionModelPaths = new HashMap<String, String>();
		
		List<String> allFiles = PersistenceUtils.getAllFilesInFolder(reactionModelFolder);
		Pattern pattern = Pattern.compile("Name=\"(.*?)\"");
		
		for(String filePath : allFiles) {
			if(!filePath.matches(".+(\\"+containerModelSuffix+")$")) {
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

	@Override
	protected void setContainerModelSuffix() {
		containerModelSuffix = ".xmi";
	}

}
