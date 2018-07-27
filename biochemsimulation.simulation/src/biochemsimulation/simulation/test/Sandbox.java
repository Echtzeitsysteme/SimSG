package biochemsimulation.simulation.test;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.gervarro.democles.specification.emf.Constant;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Reference;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintFactory;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.Simulation;
import biochemsimulation.simulation.SimulationConfigurator;
import biochemsimulation.simulation.benchmark.Runtimer;
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

public class Sandbox {

	public static final SpecificationFactory democlesFac = SpecificationFactory.eINSTANCE;
	public static final EMFTypeFactory emfTypeFac = EMFTypeFactory.eINSTANCE;
	public static final RelationalConstraintFactory constraintFac = RelationalConstraintFactory.eINSTANCE;

	public static final Pattern negPattern = generateInvokedTestPattern();

	public static void main(String[] args) {
		/*
		test1();
		test2();
		test5();
		test4();
		test6();
		*/
		test7();
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

			PatternMatchingController pmc = createSimplePMC_Viatra();
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
			pmc.randomizeRuleOrder(false);
			pmc.useReactionRate(false);
			end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");
			start = System.nanoTime();
			int iterations = 100;
			System.out.println("Running sim with " + iterations + " iterations ...");

			for (int i = 0; i < iterations; i++) {
				/*
				// <-- debugging stuff starts here
				pmc.collectAllMatches();
				Map<String, Collection<IMatch>> results = pmc.getAllMatches();
				for (String key : results.keySet()) {
					if (results.get(key) != null) {
						System.out.println("IterPre: " + i + " // Pattern: " + key + ", size: " + results.get(key).size());
					}
				}
				// debugging stuff ends here -->
				*/
				pmc.performTransformations();
				/*
				// <-- debugging stuff starts here
				pmc.collectAllMatches();
				results = pmc.getAllMatches();
				for (String key : results.keySet()) {
					if (results.get(key) != null) {
						System.out.println("IterPost: " + i + " // Pattern: " + key + ", size: " + results.get(key).size());
					}
				}
				// debugging stuff ends here -->
				*/
			}
			
			// <-- debugging stuff starts here
			pmc.collectAllMatches();
			Map<String, Collection<IMatch>> results = pmc.getAllMatches();
			for (String key : results.keySet()) {
				if (results.get(key) != null) {
					System.out.println("Pattern: " + key + ", size: " + results.get(key).size());
				}
			}
			// debugging stuff ends here -->

			end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");
			pmc.discardEngine();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void test3() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		try {
			//ReactionRuleModel model1 = pm.loadReactionRuleModel("test2");
			ReactionContainer model2 = pm.loadReactionContainerModel("test2", true);
			DemoclesEngine engine = new DemoclesEngine(model2);
			List<Pattern> patterns = new LinkedList<Pattern>();
			patterns.add(generateDemoclesTestPattern());
			patterns.add(negPattern);
			engine.initPatterns(patterns);
			Collection<IMatch> match = engine.getMatches("A_Type_Pattern", true);
			System.out.println((match != null) ? match.size() : "Fu");
			org.eclipse.emf.ecore.util.EcoreUtil.delete(model2.getSimAgent().get(0));
			match = engine.getMatches("A_Type_Pattern", true);
			System.out.println((match != null) ? match.size() : "Fu");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test4() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("test2");
			ReactionContainer model2 = pm.loadReactionContainerModel("test2", true);
			PatternMatchingEngine engine = PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.DemoclesEngine);
			engine.loadModels(model2, model1);
			engine.initEngine();
			Map<String, Collection<IMatch>> matches = engine.getAllMatches();
			matches.forEach((name, m) -> {
				System.out.println("Pattern: "+name+", size: "+m.size());
			});
			engine.disposeEngine();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test5() {
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

			PatternMatchingController pmc = createSimplePMC_Democles();
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
			pmc.randomizeRuleOrder(false);
			pmc.useReactionRate(false);
			end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");
			start = System.nanoTime();
			int iterations = 100;
			System.out.println("Running sim with " + iterations + " iterations ...");

			for (int i = 0; i < iterations; i++) {
				/*
				// <-- debugging stuff starts here
				pmc.collectAllMatches();
				Map<String, Collection<IMatch>> results = pmc.getAllMatches();
				for (String key : results.keySet()) {
					if (results.get(key) != null) {
						System.out.println("IterPre: " + i + " // Pattern: " + key + ", size: " + results.get(key).size());
					}
				}
				// debugging stuff ends here -->
				*/
				pmc.performTransformations();
				/*
				// <-- debugging stuff starts here
				pmc.collectAllMatches();
				results = pmc.getAllMatches();
				for (String key : results.keySet()) {
					if (results.get(key) != null) {
						System.out.println("IterPost: " + i + " // Pattern: " + key + ", size: " + results.get(key).size());
					}
				}
				// debugging stuff ends here -->
				*/
			}
			
			// <-- debugging stuff starts here
			pmc.collectAllMatches();
			Map<String, Collection<IMatch>> results = pmc.getAllMatches();
			for (String key : results.keySet()) {
				if (results.get(key) != null) {
					System.out.println("Pattern: " + key + ", size: " + results.get(key).size());
				}
			}
			// debugging stuff ends here -->

			end = System.nanoTime();
			System.out.println("time diff = " + (end - start) + " ns");
			System.out.println("time diff = " + (end - start) / ns + " s");
			
			pmc.discardEngine();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test6() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("PatternMatchingTest");
			ReactionContainer model2 = pm.loadReactionContainerModel("PatternMatchingTest", true);
			PatternMatchingEngine engine = PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.DemoclesEngine);
			engine.loadModels(model2, model1);
			engine.initEngine();
			Map<String, Collection<IMatch>> matches = engine.getAllMatches();
			matches.forEach((name, m) -> {
				System.out.println("Pattern: "+name+", size: "+m.size());
			});
			engine.disposeEngine();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test7() {
		SimulationConfigurator simConfig = new SimulationConfigurator();
		simConfig.setModel("test3");
		simConfig.setSimplePersistence();
		simConfig.setViatraAsEngine();
		simConfig.setSimplePMC();
		simConfig.setSimpleTerminationCondition(100);
		
		Simulation viatraSim = simConfig.createSimulation();
		
		simConfig.setDemoclesAsEngine();
		
		Simulation democlesSim = simConfig.createSimulation();
		
		viatraSim.initializeClocked();
		viatraSim.runClocked();
		System.out.println(viatraSim.results());
		viatraSim.finish();
		
		democlesSim.initializeClocked();
		democlesSim.runClocked();
		System.out.println(democlesSim.results());
		democlesSim.finish();
		
		System.out.println(Runtimer.getInstance());
		
	}
	
	public static PatternMatchingController createSimplePMC_Viatra() {
		PatternMatchingController pmc = PatternMatchingControllerFactory
				.create(PatternMatchingControllerEnum.SimplePMC);
		PatternMatchingEngine engine = PatternMatchingEngineFactory
				.create(PatternMatchingEngineEnum.ViatraEngine);
		pmc.setEngine(engine);
		return pmc;
	}
	
	public static PatternMatchingController createSimplePMC_Democles() {
		PatternMatchingController pmc = PatternMatchingControllerFactory
				.create(PatternMatchingControllerEnum.SimplePMC);
		PatternMatchingEngine engine = PatternMatchingEngineFactory
				.create(PatternMatchingEngineEnum.DemoclesEngine);
		pmc.setEngine(engine);
		return pmc;
	}

	public static Pattern generateDemoclesTestPattern() {
		Pattern p = democlesFac.createPattern();
		p.setName("A_Type_Pattern");

		PatternBody pb = democlesFac.createPatternBody();
		p.getBodies().add(pb);
		
		// ##### create Signature
		EMFVariable signatureNodeA = createSignatureNode("A", p);
		//EMFVariable signatureNodeC = createSignatureNode("C", p);
		//EMFVariable signatureNodeB = createSignatureNode("B", p);

		// ##### Agent Node Context
		createTypeConstraint(signatureNodeA, "A", pb);
		//createTypeConstraint(signatureNodeB, "B", pb);
		//createTypeConstraint(signatureNodeC, "C", p, pb);
		// ##### Site Node Context
		EMFVariable sitesVariableA = createSiteConstraint(signatureNodeA, "x", pb);
		//EMFVariable sitesVariableB = createSiteConstraint(signatureNodeB, "x", pb);
		//EMFVariable sitesVariable = createSiteConstraint(signatureNodeC, "x", p, pb);
		// ##### Site State Context
		//createSiteStateConstraint(sitesVariable, "u", p, pb);
		
		// ##### Link Context - Any Link
		//createAnyLinkConstraint(sitesVariable, p, pb);
		
		// ##### Link Context - No Link
		//createNoLinkConstraint(sitesVariable, p, pb);
		//createNoLinkConstraint(sitesVariableA, p, pb);
		//createNoLinkConstraint(sitesVariableB, p, pb);
		
		// ##### Link Context - Bound
		//createBoundConstraint(sitesVariableA, sitesVariableB, pb);
		
		// ##### Link Context - Bound to Type
		createBoundToTypeConstraint(sitesVariableA, "B", "x", pb);
		
		return p;
	}

	public static EMFVariable createSignatureNode(String name, Pattern p) {
		EMFVariable signatureNodeVariable = emfTypeFac.createEMFVariable();
		signatureNodeVariable.setName(name);
		signatureNodeVariable.setEClassifier(ReactionContainerPackage.Literals.SIM_AGENT);
		p.getSymbolicParameters().add(signatureNodeVariable);

		return signatureNodeVariable;
	}

	public static void createTypeConstraint(EMFVariable signatureNodeVariable, String typeName,
			PatternBody pb) {
		// Attribute Constraint
		EMFVariable attributeVariable = emfTypeFac.createEMFVariable();
		attributeVariable.setEClassifier(
				ReactionContainerPackage.Literals.SIM_AGENT.getEAttributes().get(1).getEAttributeType());
		attributeVariable.setName(signatureNodeVariable.toString() + "_Type");
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
		constant.setValue(typeName);
		pb.getConstants().add(constant);

		RelationalConstraint constraint = constraintFac.createEqual();

		ConstraintParameter parameterForAttribute2 = democlesFac.createConstraintParameter();
		constraint.getParameters().add(parameterForAttribute2);
		parameterForAttribute2.setReference(attributeVariable);

		ConstraintParameter parameterForConstant = democlesFac.createConstraintParameter();
		constraint.getParameters().add(parameterForConstant);
		parameterForConstant.setReference(constant);
		pb.getConstraints().add(constraint);
	}
	
	public static EMFVariable createSiteConstraint(EMFVariable signatureNodeVariable, String typeName,
			PatternBody pb) {
		EMFVariable sitesVariable = emfTypeFac.createEMFVariable();
		sitesVariable
				.setEClassifier(ReactionContainerPackage.Literals.SIM_AGENT.getEAllContainments().get(0).getEType());
		sitesVariable.setName(signatureNodeVariable.toString()+"_simSites");
		pb.getLocalVariables().add(sitesVariable);

		Reference sitesConstraint = emfTypeFac.createReference();
		sitesConstraint.setEModelElement(ReactionContainerPackage.Literals.SIM_AGENT.getEAllContainments().get(0));

		ConstraintParameter signatureContext = democlesFac.createConstraintParameter();
		sitesConstraint.getParameters().add(signatureContext);
		signatureContext.setReference(signatureNodeVariable);

		ConstraintParameter localContext = democlesFac.createConstraintParameter();
		sitesConstraint.getParameters().add(localContext);
		localContext.setReference(sitesVariable);

		pb.getConstraints().add(sitesConstraint);

		// Create the node itself:
		EMFVariable siteVariable = emfTypeFac.createEMFVariable();
		siteVariable
				.setEClassifier(ReactionContainerPackage.Literals.SIM_SITE.getEAttributes().get(0).getEAttributeType());
		siteVariable.setName(signatureNodeVariable.toString()+"_simSites_"+typeName);
		pb.getLocalVariables().add(siteVariable);

		Attribute siteTypeAttribute = emfTypeFac.createAttribute();
		siteTypeAttribute.setEModelElement(ReactionContainerPackage.Literals.SIM_SITE.getEAttributes().get(0));

		ConstraintParameter parameterSiteContext = democlesFac.createConstraintParameter();
		siteTypeAttribute.getParameters().add(parameterSiteContext);
		parameterSiteContext.setReference(sitesVariable);

		ConstraintParameter parameterSiteVariable = democlesFac.createConstraintParameter();
		siteTypeAttribute.getParameters().add(parameterSiteVariable);
		parameterSiteVariable.setReference(siteVariable);

		pb.getConstraints().add(siteTypeAttribute);

		// constant constraint
		Constant siteConstant = democlesFac.createConstant();
		siteConstant.setValue(typeName);
		pb.getConstants().add(siteConstant);

		RelationalConstraint constraint2 = constraintFac.createEqual();

		ConstraintParameter parameterForSiteAttribute2 = democlesFac.createConstraintParameter();
		constraint2.getParameters().add(parameterForSiteAttribute2);
		parameterForSiteAttribute2.setReference(siteVariable);

		ConstraintParameter parameterForSiteConstant = democlesFac.createConstraintParameter();
		constraint2.getParameters().add(parameterForSiteConstant);
		parameterForSiteConstant.setReference(siteConstant);
		pb.getConstraints().add(constraint2);
		
		return sitesVariable;
	}
	
	public static void createSiteStateConstraint(EMFVariable sitesVariable, String typeName,
			PatternBody pb) {
		EMFVariable siteStateVariable = emfTypeFac.createEMFVariable();
		siteStateVariable
				.setEClassifier(ReactionContainerPackage.Literals.SIM_SITE.getEAllContainments().get(0).getEType());
		siteStateVariable.setName(sitesVariable.toString()+"_SiteState");
		pb.getLocalVariables().add(siteStateVariable);

		Reference siteStateReference = emfTypeFac.createReference();
		siteStateReference.setEModelElement(ReactionContainerPackage.Literals.SIM_SITE.getEAllContainments().get(0));

		ConstraintParameter parameterSiteContext2 = democlesFac.createConstraintParameter();
		siteStateReference.getParameters().add(parameterSiteContext2);
		parameterSiteContext2.setReference(sitesVariable);

		ConstraintParameter parameterStateVariable = democlesFac.createConstraintParameter();
		siteStateReference.getParameters().add(parameterStateVariable);
		parameterStateVariable.setReference(siteStateVariable);

		pb.getConstraints().add(siteStateReference);

		// site state type
		EMFVariable stateTypeVariable = emfTypeFac.createEMFVariable();
		stateTypeVariable.setEClassifier(
				ReactionContainerPackage.Literals.SIM_SITE_STATE.getEAttributes().get(0).getEAttributeType());
		stateTypeVariable.setName(sitesVariable.toString()+"SiteState_"+typeName);
		pb.getLocalVariables().add(stateTypeVariable);

		Attribute stateTypeAttribute = emfTypeFac.createAttribute();
		stateTypeAttribute.setEModelElement(ReactionContainerPackage.Literals.SIM_SITE_STATE.getEAttributes().get(0));

		ConstraintParameter parameterSiteContext3 = democlesFac.createConstraintParameter();
		stateTypeAttribute.getParameters().add(parameterSiteContext3);
		parameterSiteContext3.setReference(siteStateVariable);

		ConstraintParameter parameterStateTypeVariable = democlesFac.createConstraintParameter();
		stateTypeAttribute.getParameters().add(parameterStateTypeVariable);
		parameterStateTypeVariable.setReference(stateTypeVariable);

		pb.getConstraints().add(stateTypeAttribute);

		// constant constraint
		Constant stateTypeConstant = democlesFac.createConstant();
		stateTypeConstant.setValue(typeName);
		pb.getConstants().add(stateTypeConstant);

		RelationalConstraint constraint3 = constraintFac.createEqual();

		ConstraintParameter parameterForStateAttribute = democlesFac.createConstraintParameter();
		constraint3.getParameters().add(parameterForStateAttribute);
		parameterForStateAttribute.setReference(stateTypeVariable);

		ConstraintParameter parameterForStateConstant = democlesFac.createConstraintParameter();
		constraint3.getParameters().add(parameterForStateConstant);
		parameterForStateConstant.setReference(stateTypeConstant);

		pb.getConstraints().add(constraint3);
	}
	
	public static void createAnyLinkConstraint(EMFVariable sitesVariable,
			PatternBody pb) {
		PatternInvocationConstraint pic = democlesFac.createPatternInvocationConstraint();
		pic.setPositive(true);
		pic.setInvokedPattern(negPattern);

		ConstraintParameter sitesContextParam = democlesFac.createConstraintParameter();
		sitesContextParam.setReference(sitesVariable);
		pic.getParameters().add(sitesContextParam);
		pb.getConstraints().add(pic);
	}
	
	public static void createNoLinkConstraint(EMFVariable sitesVariable,
			PatternBody pb) {
		PatternInvocationConstraint pic = democlesFac.createPatternInvocationConstraint();
		pic.setPositive(false);
		pic.setInvokedPattern(negPattern);

		ConstraintParameter sitesContextParam = democlesFac.createConstraintParameter();
		sitesContextParam.setReference(sitesVariable);
		pic.getParameters().add(sitesContextParam);
		pb.getConstraints().add(pic);
	}
	
	public static void createBoundConstraint(EMFVariable sitesVariable1, EMFVariable sitesVariable2,
			PatternBody pb) {
		EMFVariable linkVariableA = createBoundContext(sitesVariable1, pb);
		EMFVariable linkVariableB = createBoundContext(sitesVariable2, pb);
		
		RelationalConstraint  linkConstraint = constraintFac.createEqual();
		ConstraintParameter linkA = democlesFac.createConstraintParameter();
		linkConstraint.getParameters().add(linkA);
		linkA.setReference(linkVariableA);

		ConstraintParameter linkB = democlesFac.createConstraintParameter();
		linkConstraint.getParameters().add(linkB);
		linkB.setReference(linkVariableB);
		
		pb.getConstraints().add(linkConstraint);
		
	}
	
	public static void createBoundToTypeConstraint(EMFVariable sitesVariable1, String agentType2, String siteType2,
			PatternBody pb) {
		EMFVariable linkVariableA = createBoundContext(sitesVariable1, pb);
		EMFVariable linkVariableB = createBoundToTypeContext(agentType2, siteType2, pb);
		
		// create relational constraint -> check for link equality
		RelationalConstraint  linkConstraint = constraintFac.createEqual();
		ConstraintParameter linkA = democlesFac.createConstraintParameter();
		linkConstraint.getParameters().add(linkA);
		linkA.setReference(linkVariableA);

		ConstraintParameter linkB = democlesFac.createConstraintParameter();
		linkConstraint.getParameters().add(linkB);
		linkB.setReference(linkVariableB);
		
		pb.getConstraints().add(linkConstraint);
		
	}
	
	public static EMFVariable createBoundContext(EMFVariable sitesVariable,
			PatternBody pb) {
		EMFVariable linkStateVariable = emfTypeFac.createEMFVariable();
		linkStateVariable
				.setEClassifier(ReactionContainerPackage.Literals.SIM_SITE.getEAllReferences().get(2).getEType());
		linkStateVariable.setName("NEG_LinkState");
		pb.getLocalVariables().add(linkStateVariable);

		Reference linkConstraint = emfTypeFac.createReference();
		linkConstraint.setEModelElement(ReactionContainerPackage.Literals.SIM_SITE.getEAllReferences().get(2));

		ConstraintParameter sitesContextParam = democlesFac.createConstraintParameter();
		linkConstraint.getParameters().add(sitesContextParam);
		sitesContextParam.setReference(sitesVariable);

		ConstraintParameter linkVariableParam = democlesFac.createConstraintParameter();
		linkConstraint.getParameters().add(linkVariableParam);
		linkVariableParam.setReference(linkStateVariable);

		pb.getConstraints().add(linkConstraint);
		
		return linkStateVariable;
	}
	
	public static EMFVariable createBoundToTypeContext(String agentType2, String siteType2,
			PatternBody pb) {
		EMFVariable signatureNodeVariable = emfTypeFac.createEMFVariable();
		signatureNodeVariable.setName(agentType2);
		signatureNodeVariable.setEClassifier(ReactionContainerPackage.Literals.SIM_AGENT);
		pb.getLocalVariables().add(signatureNodeVariable);
		
		createTypeConstraint(signatureNodeVariable, agentType2, pb);
		EMFVariable sitesVariable = createSiteConstraint(signatureNodeVariable, siteType2, pb);
		
		return createBoundContext(sitesVariable, pb);
	}

	public static Pattern generateInvokedTestPattern() {
		Pattern p = democlesFac.createPattern();
		p.setName("Neg_Pattern");

		PatternBody pb = democlesFac.createPatternBody();
		p.getBodies().add(pb);

		// ##### create Signature
		EMFVariable signatureNodeVariable = emfTypeFac.createEMFVariable();
		signatureNodeVariable.setName("ss");
		signatureNodeVariable.setEClassifier(ReactionContainerPackage.Literals.SIM_SITE);
		p.getSymbolicParameters().add(signatureNodeVariable);

		// ##### create Body
		EMFVariable linkStateVariable = emfTypeFac.createEMFVariable();
		linkStateVariable
				.setEClassifier(ReactionContainerPackage.Literals.SIM_SITE.getEAllReferences().get(2).getEType());
		linkStateVariable.setName("NEG_LinkState");
		pb.getLocalVariables().add(linkStateVariable);

		Reference linkConstraint = emfTypeFac.createReference();
		linkConstraint.setEModelElement(ReactionContainerPackage.Literals.SIM_SITE.getEAllReferences().get(2));

		ConstraintParameter sitesContextParam = democlesFac.createConstraintParameter();
		linkConstraint.getParameters().add(sitesContextParam);
		sitesContextParam.setReference(signatureNodeVariable);

		ConstraintParameter linkVariableParam = democlesFac.createConstraintParameter();
		linkConstraint.getParameters().add(linkVariableParam);
		linkVariableParam.setReference(linkStateVariable);

		pb.getConstraints().add(linkConstraint);

		return p;
	}

}
