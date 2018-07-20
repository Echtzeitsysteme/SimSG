package biochemsimulation.simulation.test;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.gervarro.democles.specification.emf.Constant;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintFactory;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.impl.SimAgentImpl;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.matching.IMatch;
import biochemsimulation.simulation.matching.PatternMatchingEngine;
import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.matching.PatternMatchingEngineFactory;
import biochemsimulation.simulation.matching.democles.DemoclesEngine;
import biochemsimulation.simulation.persistence.PersistenceManager;
import biochemsimulation.simulation.persistence.PersistenceManagerEnum;
import biochemsimulation.simulation.persistence.PersistenceManagerFactory;
import biochemsimulation.simulation.pmc.PatternMatchingController;
import biochemsimulation.simulation.pmc.PatternMatchingControllerEnum;
import biochemsimulation.simulation.pmc.PatternMatchingControllerFactory;

public class Test1 {
	
	public static final SpecificationFactory democlesFac = SpecificationFactory.eINSTANCE;
	public static final EMFTypeFactory emfTypeFac = EMFTypeFactory.eINSTANCE;
	public static final RelationalConstraintFactory constraintFac = RelationalConstraintFactory.eINSTANCE; 

	public static void main(String[] args) {
		test3();
	}

	public static void test1() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();

		pm.availableReactionContainerModels().forEach(x -> System.out.println(x));
		pm.availableReactionRuleModels().forEach(x -> System.out.println(x));

		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("test2");
			System.out.println("Loaded reaction rule model: " + model1.getModel().getName());
			ReactionContainer model2 = pm.loadReactionContainerModel("test2", true);
			System.out.println("Loaded reaction container model: " + model2.getName());

			PatternMatchingEngine engine = PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.ViatraEngine);
			engine.loadModels(model2, model1);
			engine.initEngine();
			Map<String, Collection<IMatch>> results = engine.getAllMatches();
			System.out.println("Found matches on given Models:");
			for (String key : results.keySet()) {
				System.out.println("Pattern: " + key + ", size: " + results.get(key).size());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void test2() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();

		try {
			double ns = 1E9;
			ReactionRuleModel model1 = pm.loadReactionRuleModel("test3");
			System.out.println("Loading reaction container model ...");
			long start = System.nanoTime();
			ReactionContainer model2 = pm.loadReactionContainerModel("test3", true);
			long end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");

			PatternMatchingController pmc = PatternMatchingControllerFactory
					.create(PatternMatchingControllerEnum.SimplePMC);
			System.out.println("Initializing pmc: loading models...");
			start = System.nanoTime();
			pmc.loadModels(model1, model2);
			end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");
			System.out.println("Initializing pmc: init engine...");
			start = System.nanoTime();
			pmc.initEngine();
			end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");
			System.out.println("Initializing pmc: init controller...");
			start = System.nanoTime();
			pmc.initController();
			end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");
			start = System.nanoTime();
			int iterations = 100;
			System.out.println("Running sim with " + iterations + " iterations ...");

			for (int i = 0; i < iterations; i++) {
				// <-- debugging stuff starts here
				Map<String, Collection<IMatch>> results = pmc.getAllMatches();
				for (String key : results.keySet()) {
					if (results.get(key) != null) {
						System.out.println("Iter: " + i + " // Pattern: " + key + ", size: " + results.get(key).size());
					}
				}
				// debugging stuff ends here -->
				pmc.performTransformations();
			}

			end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void test3() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("test3");
			ReactionContainer model2 = pm.loadReactionContainerModel("test3", true);
			DemoclesEngine engine = new DemoclesEngine(model2);
			List<Pattern> patterns = new LinkedList<Pattern>();
			patterns.add(generateDemoclesTestPattern());
			engine.initPatterns(patterns);
			Collection<IMatch> match = engine.getMatches("A_Type_Pattern", true);
			System.out.println((match!=null)?match.size():"Fu");
			org.eclipse.emf.ecore.util.EcoreUtil.delete(model2.getSimAgent().get(0));
			match = engine.getMatches("A_Type_Pattern", true);
			System.out.println((match!=null)?match.size():"Fu");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Pattern generateDemoclesTestPattern() {
		Pattern p = democlesFac.createPattern();
		p.setName("A_Type_Pattern");
		
		PatternBody pb = democlesFac.createPatternBody();
		
		// create Signature
		EMFVariable signatureNodeVariable = emfTypeFac.createEMFVariable();
		signatureNodeVariable.setName("A");
		signatureNodeVariable.setEClassifier(ReactionContainerPackage.Literals.SIM_AGENT);
		p.getSymbolicParameters().add(signatureNodeVariable);
		
		// Attribute Constraint
		EMFVariable attributeVariable = emfTypeFac.createEMFVariable();
		attributeVariable.setEClassifier(ReactionContainerPackage.Literals.SIM_AGENT.getEAttributes().get(1).getEAttributeType());
		attributeVariable.setName("A_Type");
		pb.getLocalVariables().add(attributeVariable);
		
		Attribute attributeConstraint = emfTypeFac.createAttribute();
		attributeConstraint.setEModelElement(ReactionContainerPackage.Literals.SIM_AGENT.getEAttributes().get(1));
		
		ConstraintParameter parameterForNode = democlesFac.createConstraintParameter();
		attributeConstraint.getParameters().add(parameterForNode);
		parameterForNode.setReference(signatureNodeVariable);
		
		ConstraintParameter parameterForAttribute = democlesFac.createConstraintParameter();
		attributeConstraint.getParameters().add(parameterForAttribute);
		parameterForAttribute.setReference(attributeVariable);
		
		pb.getConstraints().add(attributeConstraint);
		
		// constant constraint	
		Constant constant = democlesFac.createConstant();
		constant.setValue("A");
		pb.getConstants().add(constant);

		RelationalConstraint constraint = constraintFac.createEqual();
		
		ConstraintParameter parameterForAttribute2 = democlesFac.createConstraintParameter();
		constraint.getParameters().add(parameterForAttribute2);
		parameterForAttribute2.setReference(attributeVariable);
		
		ConstraintParameter parameterForConstant = democlesFac.createConstraintParameter();
		constraint.getParameters().add(parameterForConstant);
		parameterForConstant.setReference(constant);
		pb.getConstraints().add(constraint);
		
		p.getBodies().add(pb);
		return p;
	}
	
	

}
