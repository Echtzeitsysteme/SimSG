package biochemsimulation.viatrapatterns.generator;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.EMFPatternLanguagePackage;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.reactionRules.Rule;
import patterngenerator.PatternTemplate;

public class ViatraPatternGenerator {
	
	final public static String PATTERN_MODEL_FOLDER_NAME = "PatternModels";
	
	private boolean isInitialized;
	private ReactionRuleModel model;
	private PatternModel patternModel;
	private String patternModelFolder;
	
	private void init() {
		patternModelFolder = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		patternModelFolder = patternModelFolder.replaceFirst("/bin", "");
		patternModelFolder = patternModelFolder.replaceFirst("^/", "");
		patternModelFolder = patternModelFolder.replaceFirst("%20", " ");
		patternModelFolder += PATTERN_MODEL_FOLDER_NAME+"/";
		isInitialized = false;
		EMFPatternLanguageStandaloneSetup.doSetup();
		EMFPatternLanguagePackage.eINSTANCE.eClass();
	}
	
	public ViatraPatternGenerator(ReactionRuleModel model) {
		init();

		isInitialized = model != null;
		this.model = model;
	}
	
	public PatternModel doGenerate(String path, boolean saveToFile) throws Exception{
		if(!isInitialized) {
			throw new RuntimeException("ViatraPatternGenerator is uninitialized because the given resource containing the ReactionRules model could not be loaded.");
		}
		
		LinkedHashMap<EPackage, String> imports = new LinkedHashMap<EPackage, String>();
		imports.put(ReactionContainerPackage.eINSTANCE, "reactionContainer");
		
		PatternTemplate pt = new PatternTemplate(imports);
		List<Rule> rules = new LinkedList<Rule>();
		for (EObject e : model.getReactionProperties()) {
			if (e instanceof Rule) {
				rules.add((Rule) e);
			}
		}
		String output = pt.generatePatternCode(rules);
		saveModelToVqlFile(patternModelFolder+"temp.vql", output);
		
		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI(patternModelFolder+"temp.vql");
		Resource patternResource = resourceSet.getResource(fileURI, true);

		// navigate to the pattern definition that we want
		if (patternResource != null) {
			if (patternResource.getErrors().size() == 0 && patternResource.getContents().size() >= 1) {
				patternModel = (PatternModel) patternResource.getContents().get(0);
			}
		}
		if(saveToFile) {
			saveModelToVqlFile(path, output);
		}
		return patternModel;
	}
	
	private void saveModelToVqlFile(String path, String output) throws Exception {
		Path file = Paths.get(path);
		List<String> lines = Arrays.asList(output);

		Files.write(file, lines, Charset.forName("UTF-8"));

	}

}
