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
import org.simsg.container.generator.ContainerEMF;
import org.simsg.container.generator.ContainerGenerator;
import org.simsg.core.utils.PersistenceUtils;

public class SimplePersistenceManager extends PersistenceManager {
	
	//TODO: mh how to detect valid generic models?
	final public static String SIMULATION_MODEL_HEADER = "<container:Container xmi:version=\"2.0\"";
	
	public SimplePersistenceManager() {
		super();
	}
	
	@Override
	public void setAdditionalParameters(Object... params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void setSimulationModelSuffix() {
		simulationModelSuffix = ".xmi";
	}

	@Override
	protected void fetchExistingSimulationModelPaths() {
		simulationModelPaths = new HashMap<String, String>();
		
		List<String> allFiles = PersistenceUtils.getAllFilesInFolder(simulationModelFolder);
		Pattern pattern = Pattern.compile("Name=\"(.*?)\"");
		
		for(String filePath : allFiles) {
			if(!filePath.matches(".+(\\"+simulationModelSuffix+")$")) {
			}else {
				File candidate = new File(filePath);
				Path p = candidate.toPath();
				try {
					Optional<String> line = Files.lines(p).filter(x->x.contains(SIMULATION_MODEL_HEADER)).findFirst();
					if(line.isPresent()) {
						String key = line.orElse("");
						Matcher matcher = pattern.matcher(key);
						if(matcher.find()) {
							key = matcher.group(1);
							simulationModelPaths.put(key, filePath);
						}
					}
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	@Override
	public Resource loadSimulationModel(String name) throws Exception {
		if((!checkExistenceAndIndexSimulationModel(name, true)) || (!checkExistenceAndIndexMetamodel(name, true))) {
			Resource model = loadSimulationDefinition(name);
			ContainerGenerator gen = new ContainerEMF(model);
			String path = simulationModelFolder+"/"+name+simulationModelSuffix;
			String path2 = simulationMetamodelFolder+"/"+name+".ecore";
			gen.doGenerate(path, path2);
			simulationModelPaths.put(name, path);
			simulationMetamodelPaths.put(name, path2);
		}
		loadAndRegisterMetamodel(name);
		
		Resource model = PersistenceUtils.loadResource(simulationModelPaths.get(name));
		
		if(simulationModelCache.containsKey(name)) {
			unloadSimulationModel(name);
		}
		
		simulationModelCache.put(name, model);
		return model;
	}

}
