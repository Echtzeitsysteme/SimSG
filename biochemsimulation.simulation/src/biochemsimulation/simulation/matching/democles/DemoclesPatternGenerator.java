package biochemsimulation.simulation.matching.democles;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.gervarro.democles.specification.emf.Constant;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Reference;
import org.gervarro.democles.specification.emf.constraint.emf.emf.StructuralFeature;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintFactory;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.reactionRules.Rule;
import biochemsimulation.reactionrules.utils.PatternUtils;
import biochemsimulation.simulation.matching.patterns.AgentNodeConstraint;
import biochemsimulation.simulation.matching.patterns.AgentNodeContext;
import biochemsimulation.simulation.matching.patterns.ConstraintType;
import biochemsimulation.simulation.matching.patterns.GenericPattern;
import biochemsimulation.simulation.matching.patterns.GenericPatternBody;
import biochemsimulation.simulation.matching.patterns.GenericPatternSignature;
import biochemsimulation.simulation.matching.patterns.LinkStateConstraint;
import biochemsimulation.simulation.matching.patterns.LinkStateContext;
import biochemsimulation.simulation.matching.patterns.SiteNodeContext;
import biochemsimulation.simulation.matching.patterns.SiteStateContext;

public class DemoclesPatternGenerator {

	final public static String RULE_OPERATOR_UNI = "->";
	final public static String RULE_OPERATOR_BI = "<->";
	final public static String PATTERN_NAME_SUFFIX_RHS = "_rhs";
	final public static String PATTERN_NAME_SUFFIX_LHS = "_lhs";

	public static final SpecificationFactory specificationFactory = SpecificationFactory.eINSTANCE;
	public static final EMFTypeFactory emfTypeFactory = EMFTypeFactory.eINSTANCE;
	public static final RelationalConstraintFactory relationalConstraintFactory = RelationalConstraintFactory.eINSTANCE;

	public static final String BOUND_ANY_LINK_PATTERN_KEY = "BoundAnyLink_SupportPattern";

	private List<Rule> rules;
	private Map<String, Pattern> rulePatterns;
	private Map<String, GenericPattern> genericPatterns;

	Map<String, org.gervarro.democles.specification.emf.Pattern> generated;

	private Map<AgentNodeContext, EMFVariable> signatureVariables;
	private Map<SiteNodeContext, EMFVariable> sitesVariables;
	private Map<SiteNodeContext, EMFVariable> linkVariables;

	public DemoclesPatternGenerator(ReactionRuleModel model) {
		rules = model.getReactionProperties().stream().filter(item -> (item instanceof Rule)).map(rule -> (Rule) rule)
				.collect(Collectors.toList());
		extractPatterns();
		generateGenericPatterns();
	}

	private void extractPatterns() {
		rulePatterns = new LinkedHashMap<String, Pattern>();
		for (Rule rule : rules) {
			rulePatterns.put(rule.getName() + PATTERN_NAME_SUFFIX_LHS,
					PatternUtils.patternFromPatternAssignment(rule.getRule().getLhs()));
			if (rule.getRule().getOperator().equals(RULE_OPERATOR_BI)) {
				rulePatterns.put(rule.getName() + PATTERN_NAME_SUFFIX_RHS,
						PatternUtils.patternFromPatternAssignment(rule.getRule().getRhs()));
			}
		}
	}

	private void generateGenericPatterns() {
		genericPatterns = new HashMap<String, GenericPattern>();
		rulePatterns.forEach((name, pattern) -> {
			genericPatterns.put(name, new GenericPattern(name, pattern));
		});
	}

	public Map<String, org.gervarro.democles.specification.emf.Pattern> doGenerate() {
		generated = new HashMap<String, org.gervarro.democles.specification.emf.Pattern>();
		signatureVariables = new HashMap<AgentNodeContext, EMFVariable>();
		sitesVariables = new HashMap<SiteNodeContext, EMFVariable>();
		linkVariables = new HashMap<SiteNodeContext, EMFVariable>();

		generated.put(BOUND_ANY_LINK_PATTERN_KEY, createBoundAnyLinkPattern());

		for (GenericPattern srcPattern : genericPatterns.values()) {
			if (srcPattern.isVoidPattern()) {
				continue;
			}
			org.gervarro.democles.specification.emf.Pattern trgPattern = specificationFactory.createPattern();
			trgPattern.setName(srcPattern.getName());
			generated.put(srcPattern.getName(), trgPattern);

			transformSignature(trgPattern, srcPattern.getSignature());
			transformBody(trgPattern, srcPattern.getBody());

		}
		return generated;
	}

	private void transformSignature(org.gervarro.democles.specification.emf.Pattern trgPattern,
			GenericPatternSignature signature) {
		signature.getSignature().forEach((variableName, type) -> {
			createSignatureAgent(variableName, trgPattern);
		});
	}

	private void transformBody(org.gervarro.democles.specification.emf.Pattern trgPattern, GenericPatternBody body) {
		PatternBody trgPatternBody = specificationFactory.createPatternBody();
		trgPattern.getBodies().add(trgPatternBody);

		for (AgentNodeContext agentNode : body.getAgentNodeContexts().values()) {
			transformAgentNodeContext(trgPatternBody, agentNode);

			for (SiteNodeContext siteNode : body.getSiteNodeContexts().get(agentNode)) {
				transformSiteNodeContext(trgPatternBody, siteNode);

				if (body.getSiteStateContexts().containsKey(siteNode)) {
					transformSiteStateContext(trgPatternBody, body.getSiteStateContexts().get(siteNode));
				}

				if (body.getLinkStateContexts().containsKey(siteNode)) {
					transformTrivialLinkStateContext(trgPatternBody, body.getLinkStateContexts().get(siteNode));
				}

			}
		}
		
		for(LinkStateConstraint constraint : body.getLinkStateConstraints().values()) {
			transformComplexLinkStateContext(trgPatternBody, constraint.getOperand1(), constraint);
		}

		for (AgentNodeConstraint constraint : body.getInjectivityConstraints()) {
			EMFVariable agentNode1 = signatureVariables.get(constraint.getOperand1());
			EMFVariable agentNode2 = signatureVariables.get(constraint.getOperand2());
			RelationalConstraint injectivityConstraint = createRelationalConstraint(trgPatternBody,
					ConstraintType.unequal);
			createConstraintParameter(injectivityConstraint, agentNode1);
			createConstraintParameter(injectivityConstraint, agentNode2);
		}

	}

	private void transformAgentNodeContext(PatternBody trgPatternBody, AgentNodeContext agentNode) {
		createAgentTypeConstraint(trgPatternBody, agentNode, signatureVariables.get(agentNode));
	}

	private void transformSiteNodeContext(PatternBody trgPatternBody, SiteNodeContext siteNode) {
		EMFVariable site = createLocalSite(trgPatternBody, siteNode, signatureVariables.get(siteNode.getAgentNodeContext()));
		sitesVariables.put(siteNode, site);
	}

	private void transformSiteStateContext(PatternBody trgPatternBody, SiteStateContext siteState) {
		// ##### Site State Context
		Reference siteStateReference = createReferenceConstraint(trgPatternBody,
				SiteStateContext.SIM_SITE_STATE_CONTAINER_ATTRIBUTE);
		EMFVariable siteStateVariable = createEMFVariable(trgPatternBody,
				siteState.getUniqueSimSiteStateContainerAttributeName(),
				SiteStateContext.SIM_SITE_STATE_CONTAINER_ATTRIBUTE_TYPE);
		createConstraintParameter(siteStateReference, sitesVariables.get(siteState.getSiteNodeContext()));
		createConstraintParameter(siteStateReference, siteStateVariable);
		// site state type
		Attribute stateTypeAttribute = createAttributeConstraint(trgPatternBody, SiteStateContext.TYPE_ATTRIBUTE);
		EMFVariable stateTypeVariable = createEMFVariable(trgPatternBody, siteState.getUniqueTypeAttributeName(),
				SiteStateContext.TYPE_ATTRIBUTE_TYPE);
		createConstraintParameter(stateTypeAttribute, siteStateVariable);
		createConstraintParameter(stateTypeAttribute, stateTypeVariable);
		// constant constraint
		RelationalConstraint constraint = createRelationalConstraint(trgPatternBody, ConstraintType.equal);
		Constant stateTypeConstant = createConstant(trgPatternBody, siteState.getStateType());
		createConstraintParameter(constraint, stateTypeVariable);
		createConstraintParameter(constraint, stateTypeConstant);
	}

	private void transformTrivialLinkStateContext(PatternBody trgPatternBody, LinkStateContext linkState) {
		switch (linkState.getStateType()) {
		case Unbound: {
			transformUnboundLink(trgPatternBody, linkState);
			return;
		}
		case BoundAny: {
			transformAnyLink(trgPatternBody, linkState);
			return;
		}
		case WhatEver: {
			return;
		}
		default: {
			return;
		}
		}
	}

	private void transformComplexLinkStateContext(PatternBody trgPatternBody, LinkStateContext linkState,
			LinkStateConstraint constraint) {
		switch (linkState.getStateType()) {
		case Bound: {
			transformBoundLink(trgPatternBody, linkState, constraint);
			return;
		}
		case BoundAnyOfType: {
			transformBoundToTypeLink(trgPatternBody, linkState, constraint);
			return;
		}
		default: {
			return;
		}
		}
	}

	private void transformUnboundLink(PatternBody trgPatternBody, LinkStateContext linkState) {
		PatternInvocationConstraint invConstraint = specificationFactory.createPatternInvocationConstraint();
		invConstraint.setPositive(false);
		invConstraint.setInvokedPattern(generated.get(BOUND_ANY_LINK_PATTERN_KEY));
		createConstraintParameter(invConstraint, sitesVariables.get(linkState.getSiteNodeContext()));
		trgPatternBody.getConstraints().add(invConstraint);
	}

	private void transformAnyLink(PatternBody trgPatternBody, LinkStateContext linkState) {
		PatternInvocationConstraint invConstraint = specificationFactory.createPatternInvocationConstraint();
		invConstraint.setPositive(true);
		invConstraint.setInvokedPattern(generated.get(BOUND_ANY_LINK_PATTERN_KEY));
		createConstraintParameter(invConstraint, sitesVariables.get(linkState.getSiteNodeContext()));
		trgPatternBody.getConstraints().add(invConstraint);
	}

	private void transformBoundLink(PatternBody trgPatternBody, LinkStateContext linkState,
			LinkStateConstraint constraint) {
		// Create operand 1
		EMFVariable linkVariableA = null;
		if (linkVariables.containsKey(linkState.getSiteNodeContext())) {
			linkVariableA = linkVariables.get(linkState.getSiteNodeContext());
		} else {
			linkVariableA = createLocalLink(trgPatternBody, linkState, sitesVariables.get(linkState.getSiteNodeContext()));
			linkVariables.put(linkState.getSiteNodeContext(), linkVariableA);
		}
		// create operand 2
		LinkStateContext otherLinkStateContext = null;
		if (constraint.getOperand1() != linkState) {
			otherLinkStateContext = constraint.getOperand1();
		} else {
			otherLinkStateContext = constraint.getOperand2();
		}

		EMFVariable linkVariableB = null;
		if (linkVariables.containsKey(otherLinkStateContext.getSiteNodeContext())) {
			linkVariableB = linkVariables.get(otherLinkStateContext.getSiteNodeContext());
		} else {
			linkVariableB = createLocalLink(trgPatternBody, otherLinkStateContext, sitesVariables.get(otherLinkStateContext.getSiteNodeContext()));
			linkVariables.put(otherLinkStateContext.getSiteNodeContext(), linkVariableB);
		}

		RelationalConstraint linkConstraint = createRelationalConstraint(trgPatternBody, ConstraintType.equal);
		createConstraintParameter(linkConstraint, linkVariableA);
		createConstraintParameter(linkConstraint, linkVariableB);
	}

	private void transformBoundToTypeLink(PatternBody trgPatternBody, LinkStateContext linkState,
			LinkStateConstraint constraint) {
		// Create operand 1
		EMFVariable linkVariableA = createLocalLink(trgPatternBody, linkState, sitesVariables.get(linkState.getSiteNodeContext()));
		// create operand 2
		LinkStateContext otherLinkStateContext = null;
		if (constraint.getOperand1() != linkState) {
			otherLinkStateContext = constraint.getOperand1();
		} else {
			otherLinkStateContext = constraint.getOperand2();
		}
		SiteNodeContext otherSiteNodeContext = otherLinkStateContext.getSiteNodeContext();
		AgentNodeContext otherAgentNodeContext = otherSiteNodeContext.getAgentNodeContext();
		// ###### create local agent node
		EMFVariable tempAgent = createLocalAgent(trgPatternBody, otherAgentNodeContext);
		// ###### create local simSite node
		EMFVariable tempSite = createLocalSite(trgPatternBody, otherSiteNodeContext, tempAgent);
		// ###### create local link node
		EMFVariable linkVariableB = createLocalLink(trgPatternBody, otherLinkStateContext, tempSite);
		// create relational constraint
		RelationalConstraint linkConstraint = createRelationalConstraint(trgPatternBody, ConstraintType.equal);
		createConstraintParameter(linkConstraint, linkVariableA);
		createConstraintParameter(linkConstraint, linkVariableB);
	}

	private static org.gervarro.democles.specification.emf.Pattern createBoundAnyLinkPattern() {
		org.gervarro.democles.specification.emf.Pattern pattern = specificationFactory.createPattern();
		pattern.setName(BOUND_ANY_LINK_PATTERN_KEY);

		PatternBody patternBody = specificationFactory.createPatternBody();
		pattern.getBodies().add(patternBody);
		// ##### create Signature
		EMFVariable signatureNodeVariable = createEMFVariable(pattern, "simSite", SiteNodeContext.SIM_SITE_TYPE);
		// ##### create Body
		EMFVariable linkStateVariable = createEMFVariable(patternBody, "LinkState",
				LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE_TYPE);

		Reference linkConstraint = createReferenceConstraint(patternBody,
				LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE);
		createConstraintParameter(linkConstraint, signatureNodeVariable);
		createConstraintParameter(linkConstraint, linkStateVariable);

		return pattern;
	}

	private EMFVariable createSignatureAgent(String name, org.gervarro.democles.specification.emf.Pattern p) {
		EMFVariable signatureNodeVariable = createEMFVariable(p, name, ReactionContainerPackage.Literals.SIM_AGENT);
		p.getSymbolicParameters().add(signatureNodeVariable);
		GenericPatternBody body = genericPatterns.get(p.getName()).getBody();
		GenericPatternSignature signature = genericPatterns.get(p.getName()).getSignature();
		signatureVariables.put(body.getAgentNodeContexts().get(signature.getSignaturePattern(name)),
				signatureNodeVariable);
		return signatureNodeVariable;
	}

	private static EMFVariable createLocalAgent(PatternBody body, AgentNodeContext agentNode) {
		EMFVariable agent = createEMFVariable(body, agentNode.getAgentType(), AgentNodeContext.SIM_AGENT_TYPE);
		createAgentTypeConstraint(body, agentNode, agent);
		return agent;
	}

	private static EMFVariable createLocalSite(PatternBody body, SiteNodeContext siteNode, EMFVariable agent) {
		EMFVariable site = createEMFVariable(body, siteNode.getSiteType(),
				SiteNodeContext.SIM_SITE_CONTAINER_ATTRIBUTE_TYPE);
		createSiteTypeConstraint(body, siteNode, site, agent);
		return site;
	}
	
	private static EMFVariable createLocalLink(PatternBody body, LinkStateContext linkNode, EMFVariable site) {
		EMFVariable link = createEMFVariable(body, linkNode.getUniqueSimLinkStateContainerAttributeName(), LinkStateContext.SIM_LINK_STATE_TYPE);
		Reference linkConstraint = createReferenceConstraint(body,
				LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE);
		createConstraintParameter(linkConstraint, site);
		createConstraintParameter(linkConstraint, link);
		
		return link;
	}

	private static void createAgentTypeConstraint(PatternBody body, AgentNodeContext agentNode, EMFVariable agent) {
		Attribute typeAttributeConstraint = createAttributeConstraint(body, AgentNodeContext.TYPE_ATTRIBUTE);
		EMFVariable typeAttribute = createEMFVariable(body, agentNode.getUniqueTypeAttributeName(),
				AgentNodeContext.TYPE_ATTRIBUTE_TYPE);
		createConstraintParameter(typeAttributeConstraint, agent);
		createConstraintParameter(typeAttributeConstraint, typeAttribute);

		RelationalConstraint typeConstraint = createRelationalConstraint(body, ConstraintType.equal);
		Constant typeName = createConstant(body, agentNode.getAgentType());
		createConstraintParameter(typeConstraint, typeAttribute);
		createConstraintParameter(typeConstraint, typeName);
	}

	private static void createSiteTypeConstraint(PatternBody body, SiteNodeContext siteNode, EMFVariable site,
			EMFVariable agent) {
		// ##### Site Node Context
		Reference sitesConstraint = createReferenceConstraint(body, SiteNodeContext.SIM_SITE_CONTAINER_ATTRIBUTE);
		createConstraintParameter(sitesConstraint, agent);
		createConstraintParameter(sitesConstraint, site);
		// Create the local node itself:
		Attribute siteTypeAttribute = createAttributeConstraint(body, SiteNodeContext.TYPE_ATTRIBUTE);
		EMFVariable siteTypeVariable = createEMFVariable(body, siteNode.getUniqueTypeAttributeName(),
				SiteNodeContext.TYPE_ATTRIBUTE_TYPE);
		createConstraintParameter(siteTypeAttribute, site);
		createConstraintParameter(siteTypeAttribute, siteTypeVariable);
		// constant site type constraint
		RelationalConstraint typeConstraint = createRelationalConstraint(body, ConstraintType.equal);
		Constant siteConstant = createConstant(body, siteNode.getSiteType());
		createConstraintParameter(typeConstraint, siteTypeVariable);
		createConstraintParameter(typeConstraint, siteConstant);
	}

	private static EMFVariable createEMFVariable(org.gervarro.democles.specification.emf.Pattern pattern, String name,
			EClassifier nodeType) {
		EMFVariable variable = emfTypeFactory.createEMFVariable();
		variable.setName(name);
		variable.setEClassifier(nodeType);
		pattern.getSymbolicParameters().add(variable);
		return variable;
	}

	private static EMFVariable createEMFVariable(PatternBody patternBody, String name, EClassifier nodeType) {
		EMFVariable variable = emfTypeFactory.createEMFVariable();
		variable.setName(name);
		variable.setEClassifier(nodeType);
		patternBody.getLocalVariables().add(variable);
		return variable;
	}

	private static Attribute createAttributeConstraint(PatternBody patternBody, EAttribute nodeAttribute) {
		Attribute attribute = emfTypeFactory.createAttribute();
		attribute.setEModelElement(nodeAttribute);
		patternBody.getConstraints().add(attribute);
		return attribute;
	}

	private static Reference createReferenceConstraint(PatternBody patternBody, EReference referenceContainer) {
		Reference reference = emfTypeFactory.createReference();
		reference.setEModelElement(referenceContainer);
		patternBody.getConstraints().add(reference);
		return reference;
	}

	private static RelationalConstraint createRelationalConstraint(PatternBody patternBody, ConstraintType type) {
		RelationalConstraint constraint = null;
		switch (type) {
		case equal: {
			constraint = relationalConstraintFactory.createEqual();
			break;
		}
		case unequal: {
			constraint = relationalConstraintFactory.createUnequal();
		}
		}
		patternBody.getConstraints().add(constraint);
		return constraint;
	}

	@SuppressWarnings("rawtypes")
	private static ConstraintParameter createConstraintParameter(StructuralFeature constraint,
			ConstraintVariable variable) {
		ConstraintParameter parameter = specificationFactory.createConstraintParameter();
		parameter.setReference(variable);
		constraint.getParameters().add(parameter);
		return parameter;
	}

	private static ConstraintParameter createConstraintParameter(RelationalConstraint constraint,
			ConstraintVariable variable) {
		ConstraintParameter parameter = specificationFactory.createConstraintParameter();
		parameter.setReference(variable);
		constraint.getParameters().add(parameter);
		return parameter;
	}

	private static ConstraintParameter createConstraintParameter(PatternInvocationConstraint constraint,
			ConstraintVariable variable) {
		ConstraintParameter parameter = specificationFactory.createConstraintParameter();
		parameter.setReference(variable);
		constraint.getParameters().add(parameter);
		return parameter;
	}

	private static Constant createConstant(PatternBody patternBody, Object value) {
		Constant constant = specificationFactory.createConstant();
		constant.setValue(value);
		patternBody.getConstants().add(constant);
		return constant;
	}
}
