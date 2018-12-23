package biochemsimulation.simulation.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.resource.Resource;

import biochemsimulation.reactioncontainer.Container;
import biochemsimulation.reactioncontainer.generator.ReactionContainerGenerator;
import biochemsimulation.reactioncontainer.generator.ReactionContainerNeoEMF;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;

public class NeoEMFPersistenceManager extends PersistenceManager {

	@Override
	public Container loadReactionContainerModel(String name) throws Exception {
		if(!checkExistenceAndIndex(name, true)) {
			ReactionRuleModel ruleModel = loadReactionRuleModel(name);
			ReactionContainerGenerator gen = new ReactionContainerNeoEMF(ruleModel);
			String path = reactionModelFolder+"/"+name+containerModelSuffix;
			String path2 = reactionMetamodelFolder+"/"+name+".ecore";
			gen.doGenerate(path,path2);
			reactionModelPaths.put(name, path);
		}
		
		Resource modelResource = PersistenceUtils.loadDBResource(reactionModelPaths.get(name));
		Container containerModel = (Container) modelResource.getContents().get(0);
		
		if(reactionContainerModelCache.containsKey(name)) {
			unloadReactionContainerModel(name);
		}
		
		reactionContainerModelCache.put(name, containerModel);
		loadAndRegisterMetamodel(name);
		return containerModel;
	}

	@Override
	protected void fetchExistingReactionModelPaths() {
		reactionModelPaths = new HashMap<String, String>();
		
		List<String> allFiles = PersistenceUtils.getAllFilesInFolder(reactionModelFolder);
		Pattern pattern = Pattern.compile(".+\\\\(.+)\\"+containerModelSuffix);
		
		for(String filePath : allFiles) {
			if(filePath.matches(".+(\\"+containerModelSuffix+")$")) {
				Matcher matcher = pattern.matcher(filePath);
				if(matcher.find()) {
					String modelName = matcher.group(1);
					reactionModelPaths.put(modelName, filePath);
				}
			}
		}
	}

	@Override
	protected void setContainerModelSuffix() {
		containerModelSuffix = ".graphdb";
	}

}
