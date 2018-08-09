package biochemsimulation.simulation.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.resource.Resource;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.generator.ReactionContainerGenerator;
import biochemsimulation.reactioncontainer.generator.ReactionContainerNeoEMF;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;

public class NeoEMFPersistenceManager extends PersistenceManager {

	@Override
	public ReactionContainer loadReactionContainerModel(String name) throws Exception {
		ReactionContainer containerModel = null;
		if(!checkExistenceAndIndex(name, true)) {
			ReactionRuleModel ruleModel = loadReactionRuleModel(name);
			ReactionContainerGenerator gen = new ReactionContainerNeoEMF(ruleModel);
			String path = reactionModelFolder+"/"+name+containerModelSuffix;
			containerModel = gen.doGenerate(path, true);
			reactionModelPaths.put(name, path);
		}else {
			Resource modelResource = PersistenceUtils.loadDBResource(reactionModelPaths.get(name));
			containerModel = (ReactionContainer) modelResource.getContents().get(0);
		}
		reactionContainerModelCache.put(name, containerModel);
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
