package org.simsg.core.persistence;

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
import org.simsg.container.Container;
import org.simsg.container.generator.ContainerEMF;
import org.simsg.container.generator.ContainerGenerator;
import org.simsg.core.utils.PersistenceUtils;

import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;

public class SimplePersistenceManager extends PersistenceManager {
	
	final public static String REACTION_CONTAINER_MODELS_HEADER = "<container:Container xmi:version=\"2.0\"";
	
	SimplePersistenceManager() {
		super();
	}
	
	@Override
	public Container loadReactionContainerModel(String name) throws Exception {
		if((!checkExistenceAndIndexContainer(name, true)) || (!checkExistenceAndIndexMetamodel(name, true))) {
			ReactionRuleModel ruleModel = loadReactionRuleModel(name);
			ContainerGenerator gen = new ContainerEMF(ruleModel);
			String path = reactionModelFolder+"/"+name+containerModelSuffix;
			String path2 = reactionMetamodelFolder+"/"+name+".ecore";
			gen.doGenerate(path, path2);
			reactionModelPaths.put(name, path);
			reactionMetamodelPaths.put(name, path2);
		}
		loadAndRegisterMetamodel(name);
		
		Resource modelResource = PersistenceUtils.loadResource(reactionModelPaths.get(name));
		Container containerModel = (Container) modelResource.getContents().get(0);
		
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
