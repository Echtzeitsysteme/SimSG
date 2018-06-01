package patterngenerator;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.EMFPatternLanguagePackage;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactioncontainer.generator.ReactionContainerGenerator;
import biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage;
import biochemsimulation.reactionrules.reactionRules.Rule;
import biochemsimulation.reactionrules.reactionRules.impl.ReactionRuleModelImpl;

public class PatternGeneratorTest {

	public static String executeDemo_GenericAPI_LoadFromEIQ() {
		final StringBuilder results = new StringBuilder();
		Resource resource = null;
		try {
			resource = loadModel1();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (resource != null) {
			try {
				// get all matches of the pattern
				// create an *unmanaged* engine to ensure that noone else is going
				// to use our engine
				EMFScope scope = new EMFScope(resource);
				AdvancedViatraQueryEngine engine = AdvancedViatraQueryEngine.createUnmanagedEngine(scope);
				// instantiate a pattern matcher through the registry, by only knowing its FQN
				// assuming that there is a pattern definition registered matching 'patternFQN'

				List<Pattern> pList = new LinkedList<Pattern>();

				// Initializing Xtext-based resource parser
				// Do not use if VIATRA Query tooling is loaded!
				EMFPatternLanguageStandaloneSetup.doSetup();
				EMFPatternLanguagePackage.eINSTANCE.eClass();
				
				// Loading pattern resource from file
				ResourceSet resourceSet = new ResourceSetImpl();
				URI fileURI = URI.createURI("src/patterngenerator/GeneratedQueryTest.vql", false);
				Resource patternResource = resourceSet.getResource(fileURI, true);

				// navigate to the pattern definition that we want
				if (patternResource != null) {
					if (patternResource.getErrors().size() == 0 && patternResource.getContents().size() >= 1) {
						EObject topElement = patternResource.getContents().get(0);
						if (topElement instanceof PatternModel) {
							for (Pattern _p : ((PatternModel) topElement).getPatterns()) {
									pList.add(_p);
							}
						}
					}
				}
				if (pList.size() < 1) {
					throw new RuntimeException(String.format("Patterns not found"));
				}
				// A specification builder is used to translate patterns to query specifications
				SpecificationBuilder builder = new SpecificationBuilder();
				for(Pattern p : pList) {
					// attempt to retrieve a registered query specification
					ViatraQueryMatcher<? extends IPatternMatch> matcher = null;
					try {
						//matcher = engine.getMatcher(builder.getOrCreateSpecification(p));	
						matcher = engine.getMatcher(builder.getOrCreateSpecification(p, true));	
					}catch(Exception e) {
						System.out.println("A Hind-D? What is a Russian Attack Helicopter doing here? "+
					e.getMessage());
					}
					

					if (matcher != null) {
						Collection<? extends IPatternMatch> matches = matcher.getAllMatches();
						System.out.println("Found matches for pattern "+p.getName()+"="+matches.size());
					} else {
						System.out.println("Zero matches found.");
					}
				}
				// wipe the engine
				engine.wipe();
				// after a wipe, new patterns can be rebuilt with much less overhead than
				// complete traversal (as the base indexes will be kept)

				// completely dispose of the engine once's it is not needed
				engine.dispose();
				resource.unload();
			} catch (ViatraQueryException e) {
				e.printStackTrace();
				results.append(e.getMessage());
			}
		} else {
			results.append("Resource not found");
		}
		return results.toString();
	}

	public static XMIResource loadModel1() throws Exception {
		// Initialize the model
		ReactionRulesPackage.eINSTANCE.eClass();
		URI uri = URI.createURI(
				"/Eclipse%20Workspaces/BioChemSimulation/biochemsimulation.reactioncontainer/model/instances/test2.xmi");
		// URI uri =
		// URI.createURI("/Users/Basti/Documents/BioChemSimulation/biochemsimulation.reactionrules/model/instances/test2.xmi");
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ReactionRules",
				new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		XMIResource resource = (XMIResource) rs.getResource(uri, true);
		return resource;
	}

	public static ReactionRuleModelImpl loadModel() throws Exception {
		// Initialize the model
		ReactionRulesPackage.eINSTANCE.eClass();
		URI uri = URI.createURI(
				"/eclipse/modeling-oxygen/eclipse/../../../Eclipse Workspaces/BioChemSimulation/biochemsimulation.reactionrules/model/instances/test2.xmi");
		// URI uri =
		// URI.createURI("/Users/Basti/Documents/BioChemSimulation/biochemsimulation.reactionrules/model/instances/test2.xmi");
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ReactionRules",
				new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		XMIResource resource = (XMIResource) rs.getResource(uri, true);
		ReactionRuleModelImpl model = (ReactionRuleModelImpl) resource.getContents().get(0);
		return model;
	}
	
	public static void generateReactionContainerModel() throws Exception {
		URI uri = URI.createURI(
				"/eclipse/modeling-oxygen/eclipse/../../../Eclipse Workspaces/BioChemSimulation/biochemsimulation.reactionrules/model/instances/test2.xmi");
		ReactionContainerGenerator gen = new ReactionContainerGenerator(uri);
		String dst = "F:\\Eclipse Workspaces\\BioChemSimulation\\biochemsimulation.reactioncontainer\\model\\instances\\test2.xmi";
		gen.doGenerate(dst, true);
	}

	public static void main(String[] args) {
		System.out.println("Loading model..");
		ReactionRuleModelImpl model = null;
		try {
			model = loadModel();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (model == null) {
			System.out.println("Failed to load model.");
		} else {
			System.out.println("Model loaded successfully.");
		}
		
		try {
			generateReactionContainerModel();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		List<Rule> rules = new LinkedList<Rule>();
		for (EObject e : model.getReactionProperties()) {
			if (e instanceof Rule) {
				rules.add((Rule) e);
			}
		}
		LinkedHashMap<EPackage, String> imports = new LinkedHashMap<EPackage, String>();
		//imports.put(ReactionRulesPackage.eINSTANCE, "reactionRules");
		imports.put(ReactionContainerPackage.eINSTANCE, "reactionContainer");
		
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
		
		System.out.println(executeDemo_GenericAPI_LoadFromEIQ());
		

	}

}
