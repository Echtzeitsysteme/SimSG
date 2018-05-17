package patterngenerator;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage;
import biochemsimulation.reactionrules.reactionRules.Rule;
import biochemsimulation.reactionrules.reactionRules.impl.ReactionRuleModelImpl;

public class PatternGeneratorTest {
	
	public static ReactionRuleModelImpl loadModel() throws Exception {
		// Initialize the model
        ReactionRulesPackage.eINSTANCE.eClass();
        URI uri = URI.createURI("/eclipse/modeling-oxygen/eclipse/../../../Eclipse Workspaces/BioChemSimulation/biochemsimulation.reactionrules/model/instances/test2.xmi");
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ReactionRules", new XMIResourceFactoryImpl());
        ResourceSet rs = new ResourceSetImpl();
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		XMIResource resource = (XMIResource) rs.getResource(uri, true);
		ReactionRuleModelImpl model = (ReactionRuleModelImpl) resource.getContents().get(0);
		return model;
	}

	public static void main(String[] args) {
		System.out.println("Loading model..");
		ReactionRuleModelImpl model = null;
		try {
			model = loadModel();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		if(model == null) {
			System.out.println("Failed to load model.");
		}else {
			System.out.println("Model loaded successfully.");
		}
		
		List<Rule> rules = new LinkedList<Rule>();
		for(EObject e : model.getReactionProperties()) {
			if(e instanceof Rule) {
				rules.add((Rule) e);
			}
		}
		LinkedHashMap<EPackage, String> imports = new LinkedHashMap<EPackage, String>();
		imports.put(ReactionRulesPackage.eINSTANCE, "reactionRules");
		PatternTemplate pt = new PatternTemplate(imports);
		String output = pt.generatePatternCode(rules);
		System.out.println(output);
		
		Path file = Paths.get("src/patterngenerator/GeneratedQueryTest.vql");
		List<String> lines = Arrays.asList(output);
		try {
			Files.write(file, lines, Charset.forName("UTF-8"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
