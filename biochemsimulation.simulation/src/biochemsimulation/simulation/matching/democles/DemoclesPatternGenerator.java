package biochemsimulation.simulation.matching.democles;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.viatra.query.patternlanguage.emf.jvmmodel.BodyCodeGenerator;
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
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintFactory;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.reactionRules.Rule;
import biochemsimulation.reactionrules.utils.PatternUtils;

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
	private List<DemoclesPattern> genericPatterns;
	
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
		genericPatterns = new LinkedList<DemoclesPattern>();
		rulePatterns.forEach((name, pattern) -> {
			genericPatterns.add(new DemoclesPattern(name, pattern));
		});
	}

	public Map<String, org.gervarro.democles.specification.emf.Pattern> doGenerate() {
		generated = new HashMap<String, org.gervarro.democles.specification.emf.Pattern>();
		signatureVariables = new HashMap<AgentNodeContext, EMFVariable>();
		sitesVariables = new HashMap<SiteNodeContext, EMFVariable>();
		linkVariables = new HashMap<SiteNodeContext, EMFVariable>();
		
		generated.put(BOUND_ANY_LINK_PATTERN_KEY, createBoundAnyLinkPattern());
		
		for (DemoclesPattern srcPattern : genericPatterns) {
			if(srcPattern.voidPattern) {
				continue;
			}
			org.gervarro.democles.specification.emf.Pattern trgPattern = specificationFactory.createPattern();
			generated.put(srcPattern.getName(), trgPattern);
			
			transformSignature(trgPattern, srcPattern.getSignature());
			transformBody(trgPattern, srcPattern.getBody());
			
		}
		return generated;
	}

	private void transformSignature(org.gervarro.democles.specification.emf.Pattern trgPattern,
			DemoclesPatternSignature signature) {
		signature.getSignature().forEach((variableName, type) -> {
			trgPattern.getSymbolicParameters().add(createEMFVariable(variableName, type));
		});
	}
	
	private void transformBody(org.gervarro.democles.specification.emf.Pattern trgPattern,
			DemoclesPatternBody body) {
		PatternBody trgPatternBody = specificationFactory.createPatternBody();
		trgPattern.getBodies().add(trgPatternBody);
		
		for(AgentNodeContext agentNode : body.getAgentNodeContexts().values()) {
			transformAgentNodeContext(trgPatternBody, agentNode);
			
			for(SiteNodeContext siteNode : body.getSiteNodeContexts().get(agentNode)) {
				//transformSiteNodeContext(trgPatternBody, siteNode);
				
				if(body.getSiteStateContexts().containsKey(siteNode)) {
					//transformSiteStateContext(trgPatternBody, body.getSiteStateContexts().get(siteNode));
				}
				
				if(body.getLinkStateContexts().containsKey(siteNode)) {
					//transformLinkStateContext(trgPatternBody, body.getLinkStateContexts().get(siteNode), body.getLinkStateConstraints().getOrDefault(body.getLinkStateContexts().get(siteNode), null));
				}
				
				// ToDo injectivity constraints
				
			}
		}
		
	}
	
	private void transformAgentNodeContext(PatternBody trgPatternBody, AgentNodeContext agentNode) {	
		Attribute typeAttributeConstraint = createAttributeConstraint(AgentNodeContext.TYPE_ATTRIBUTE);
		
		ConstraintParameter signatureParam = createConstraintParameter(signatureVariables.get(agentNode));
		EMFVariable typeAttribute = createEMFVariable(agentNode.getUniqueTypeAttributeName(), AgentNodeContext.TYPE_ATTRIBUTE_TYPE);
		ConstraintParameter localParam = createConstraintParameter(typeAttribute);
		
		typeAttributeConstraint.getParameters().add(signatureParam);
		typeAttributeConstraint.getParameters().add(localParam);
		
		trgPatternBody.getConstraints().add(typeAttributeConstraint);
		
		RelationalConstraint typeConstraint = createRelationalConstraint(ConstraintType.equal);
		
		ConstraintParameter localParamValue = createConstraintParameter(typeAttribute);
		Constant typeName = createConstant(agentNode.getAgentType());
		ConstraintParameter constParamValue = createConstraintParameter(typeName);
		
		typeConstraint.getParameters().add(localParamValue);
		typeConstraint.getParameters().add(constParamValue);
		
		trgPatternBody.getConstraints().add(typeConstraint);
	}
	
	private void transformSiteNodeContext(PatternBody trgPatternBody, SiteNodeContext siteNode) {
		// ##### Site Node Context
		EMFVariable sitesAttribute = createEMFVariable(siteNode.getUniqueSimSiteContainerAttributeName(), SiteNodeContext.SIM_SITE_CONTAINER_ATTRIBUTE_TYPE);
		trgPatternBody.getLocalVariables().add(sitesAttribute);
		sitesVariables.put(siteNode, sitesAttribute);
				
		Reference sitesConstraint = createReferenceConstraint(SiteNodeContext.SIM_SITE_CONTAINER_ATTRIBUTE);
		ConstraintParameter signatureContext = createConstraintParameter(signatureVariables.get(siteNode.getAgentNodeContext()));
		ConstraintParameter localContext = createConstraintParameter(sitesAttribute);
		
		sitesConstraint.getParameters().add(signatureContext);
		sitesConstraint.getParameters().add(localContext);
		
		trgPatternBody.getConstraints().add(sitesConstraint);
		
		// Create the local node itself:
		EMFVariable siteTypeVariable = createEMFVariable(siteNode.getUniqueTypeAttributeName(), SiteNodeContext.TYPE_ATTRIBUTE_TYPE);
		trgPatternBody.getLocalVariables().add(siteTypeVariable);
				
		Attribute siteTypeAttribute = createAttributeConstraint(SiteNodeContext.TYPE_ATTRIBUTE);
		ConstraintParameter sitesContextParam = createConstraintParameter(sitesAttribute);
		ConstraintParameter siteContextParam = createConstraintParameter(siteTypeVariable);
		
		siteTypeAttribute.getParameters().add(sitesContextParam);
		siteTypeAttribute.getParameters().add(siteContextParam);
				
		trgPatternBody.getConstraints().add(siteTypeAttribute);
		
		// constant site type constraint
		Constant siteConstant = createConstant(siteNode.getSiteType());
		trgPatternBody.getConstants().add(siteConstant);

		RelationalConstraint typeConstraint = createRelationalConstraint(ConstraintType.equal);
		ConstraintParameter siteContextParam2 = createConstraintParameter(siteTypeVariable);
		ConstraintParameter siteConstantParam = createConstraintParameter(siteConstant);
		
		typeConstraint.getParameters().add(siteContextParam2);
		typeConstraint.getParameters().add(siteConstantParam);
		
		trgPatternBody.getConstraints().add(typeConstraint);
	}
	
	private void transformSiteStateContext(PatternBody trgPatternBody, SiteStateContext siteState) {
		// ##### Site State Context
		EMFVariable siteStateVariable = createEMFVariable(siteState.getUniqueSimSiteStateContainerAttributeName(), SiteStateContext.SIM_SITE_STATE_CONTAINER_ATTRIBUTE_TYPE);
		trgPatternBody.getLocalVariables().add(siteStateVariable);
		
		Reference siteStateReference = createReferenceConstraint(SiteStateContext.SIM_SITE_STATE_CONTAINER_ATTRIBUTE);
		ConstraintParameter sitesContextParam = createConstraintParameter(sitesVariables.get(siteState.getSiteNodeContext()));
		ConstraintParameter stateVariableParam = createConstraintParameter(siteStateVariable);
		
		siteStateReference.getParameters().add(sitesContextParam);
		siteStateReference.getParameters().add(stateVariableParam);
		
		trgPatternBody.getConstraints().add(siteStateReference);
		
		// site state type
		EMFVariable stateTypeVariable = createEMFVariable(siteState.getUniqueTypeAttributeName(), SiteStateContext.TYPE_ATTRIBUTE_TYPE);
		trgPatternBody.getLocalVariables().add(stateTypeVariable);
				
		Attribute stateTypeAttribute = createAttributeConstraint(SiteStateContext.TYPE_ATTRIBUTE);
				
		ConstraintParameter stateContextParam = createConstraintParameter(siteStateVariable);
		ConstraintParameter typeVariableParam = createConstraintParameter(stateTypeVariable);
		
		stateTypeAttribute.getParameters().add(stateContextParam);
		stateTypeAttribute.getParameters().add(typeVariableParam);
		
		trgPatternBody.getConstraints().add(stateTypeAttribute);
		
		//constant constraint
		Constant stateTypeConstant = createConstant(siteState.getStateType());
		trgPatternBody.getConstants().add(stateTypeConstant);

		RelationalConstraint constraint = createRelationalConstraint(ConstraintType.equal);
		ConstraintParameter typeVariableParam2 = createConstraintParameter(stateTypeVariable);
		ConstraintParameter constParam = createConstraintParameter(stateTypeConstant);
		
		constraint.getParameters().add(typeVariableParam2);
		constraint.getParameters().add(constParam);
				
		trgPatternBody.getConstraints().add(constraint);
	}
	
	private void transformLinkStateContext(PatternBody trgPatternBody, LinkStateContext linkState, LinkStateConstraint constraint) {
		switch(linkState.getStateType()) {
		case Unbound : {
			transformUnboundLink(trgPatternBody, linkState);
			return;
		}
		case Bound : {
			transformBoundLink(trgPatternBody, linkState, constraint);
			return;
		}
		case BoundAny : {
			transformAnyLink(trgPatternBody, linkState);
			return;
		}
		case BoundAnyOfType : {
			transformBoundToTypeLink(trgPatternBody, linkState, constraint);
			return;
		}
		}
	}
	
	private void transformUnboundLink(PatternBody trgPatternBody, LinkStateContext linkState) {
		PatternInvocationConstraint invConstraint = specificationFactory.createPatternInvocationConstraint();
		invConstraint.setPositive(false);
		invConstraint.setInvokedPattern(generated.get(BOUND_ANY_LINK_PATTERN_KEY));
		
		ConstraintParameter sitesContextParam = createConstraintParameter(sitesVariables.get(linkState.getSiteNodeContext()));
		invConstraint.getParameters().add(sitesContextParam);
		trgPatternBody.getConstraints().add(invConstraint);
	}
	
	private void transformAnyLink(PatternBody trgPatternBody, LinkStateContext linkState) {
		/*
		EMFVariable linkStateVariable = createEMFVariable(linkState.getUniqueSimLinkStateContainerAttributeName(), LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE_TYPE);
		trgPatternBody.getLocalVariables().add(linkStateVariable);
		
		Reference linkConstraint = createReferenceConstraint(LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE);
		ConstraintParameter sitesContextParam = createConstraintParameter(sitesVariables.get(linkState.getSiteNodeContext()));
		ConstraintParameter linkVariableParam = createConstraintParameter(linkStateVariable);
		
		linkConstraint.getParameters().add(sitesContextParam);
		linkConstraint.getParameters().add(linkVariableParam);
		
		trgPatternBody.getConstraints().add(linkConstraint);
		*/
		PatternInvocationConstraint invConstraint = specificationFactory.createPatternInvocationConstraint();
		invConstraint.setPositive(true);
		invConstraint.setInvokedPattern(generated.get(BOUND_ANY_LINK_PATTERN_KEY));
		
		ConstraintParameter sitesContextParam = createConstraintParameter(sitesVariables.get(linkState.getSiteNodeContext()));
		invConstraint.getParameters().add(sitesContextParam);
		trgPatternBody.getConstraints().add(invConstraint);
	}
	
	private void transformBoundLink(PatternBody trgPatternBody, LinkStateContext linkState, LinkStateConstraint constraint) {
		// Create operand 1
		EMFVariable linkVariableA = null;
		if(linkVariables.containsKey(linkState.getSiteNodeContext())) {
			linkVariableA = linkVariables.get(linkState.getSiteNodeContext());
		}else {
			linkVariableA = createEMFVariable(linkState.getUniqueSimLinkStateContainerAttributeName(), LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE_TYPE);
			trgPatternBody.getLocalVariables().add(linkVariableA);
			linkVariables.put(linkState.getSiteNodeContext(), linkVariableA);
			
			Reference linkConstraint = createReferenceConstraint(LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE);
			ConstraintParameter sitesContextParam = createConstraintParameter(sitesVariables.get(linkState.getSiteNodeContext()));
			ConstraintParameter linkVariableParam = createConstraintParameter(linkVariableA);
			
			linkConstraint.getParameters().add(sitesContextParam);
			linkConstraint.getParameters().add(linkVariableParam);
			
			trgPatternBody.getConstraints().add(linkConstraint);
		}
		// create operand 2
		LinkStateContext otherLinkStateContext = null;
		if(constraint.getOperand1() != linkState) {
			otherLinkStateContext = constraint.getOperand1();
		}else {
			otherLinkStateContext = constraint.getOperand2();
		}
		
		EMFVariable linkVariableB = null;
		if(linkVariables.containsKey(otherLinkStateContext.getSiteNodeContext())) {
			linkVariableB = linkVariables.get(otherLinkStateContext.getSiteNodeContext());
		}else {
			linkVariableB = createEMFVariable(linkState.getUniqueSimLinkStateContainerAttributeName(), LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE_TYPE);
			trgPatternBody.getLocalVariables().add(linkVariableB);
			
			Reference linkConstraintB = createReferenceConstraint(LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE);
			ConstraintParameter sitesContextParamB = createConstraintParameter(sitesVariables.get(otherLinkStateContext.getSiteNodeContext()));
			ConstraintParameter linkVariableParamB = createConstraintParameter(linkVariableB);
			
			linkConstraintB.getParameters().add(sitesContextParamB);
			linkConstraintB.getParameters().add(linkVariableParamB);
			
			trgPatternBody.getConstraints().add(linkConstraintB);
		}
		
		RelationalConstraint  linkConstraint = createRelationalConstraint(ConstraintType.equal);
		ConstraintParameter linkA = createConstraintParameter(linkVariableA);
		ConstraintParameter linkB = createConstraintParameter(linkVariableB);
		
		linkConstraint.getParameters().add(linkA);
		linkConstraint.getParameters().add(linkB);
		
		trgPatternBody.getConstraints().add(linkConstraint);
	}
	
	private void transformBoundToTypeLink(PatternBody trgPatternBody, LinkStateContext linkState, LinkStateConstraint constraint) {
		// Create operand 1
		EMFVariable linkVariableA = null;
		if(linkVariables.containsKey(linkState.getSiteNodeContext())) {
			linkVariableA = linkVariables.get(linkState.getSiteNodeContext());
		}else {
			linkVariableA = createEMFVariable(linkState.getUniqueSimLinkStateContainerAttributeName(), LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE_TYPE);
			trgPatternBody.getLocalVariables().add(linkVariableA);
			linkVariables.put(linkState.getSiteNodeContext(), linkVariableA);
			
			Reference linkConstraint = createReferenceConstraint(LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE);
			ConstraintParameter sitesContextParam = createConstraintParameter(sitesVariables.get(linkState.getSiteNodeContext()));
			ConstraintParameter linkVariableParam = createConstraintParameter(linkVariableA);
			
			linkConstraint.getParameters().add(sitesContextParam);
			linkConstraint.getParameters().add(linkVariableParam);
			
			trgPatternBody.getConstraints().add(linkConstraint);
		}
		// create operand 2
		LinkStateContext otherLinkStateContext = null;
		if(constraint.getOperand1() != linkState) {
			otherLinkStateContext = constraint.getOperand1();
		}else {
			otherLinkStateContext = constraint.getOperand2();
		}
		SiteNodeContext otherSiteNodeContext = otherLinkStateContext.getSiteNodeContext();
		AgentNodeContext otherAgentNodeContext = otherSiteNodeContext.getAgentNodeContext();
		// ######  create local agent node
		EMFVariable tempSignatureNode = createEMFVariable(otherAgentNodeContext.getAgentType(), AgentNodeContext.SIM_AGENT_TYPE);
		Attribute typeAttributeConstraint = createAttributeConstraint(AgentNodeContext.TYPE_ATTRIBUTE);
		
		ConstraintParameter signatureParam = createConstraintParameter(tempSignatureNode);
		EMFVariable typeAttribute = createEMFVariable(otherAgentNodeContext.getUniqueTypeAttributeName(), AgentNodeContext.TYPE_ATTRIBUTE_TYPE);
		ConstraintParameter localParam = createConstraintParameter(typeAttribute);
		
		typeAttributeConstraint.getParameters().add(signatureParam);
		typeAttributeConstraint.getParameters().add(localParam);
		
		trgPatternBody.getConstraints().add(typeAttributeConstraint);
		
		RelationalConstraint typeConstraint = createRelationalConstraint(ConstraintType.equal);
		
		ConstraintParameter localParamValue = createConstraintParameter(typeAttribute);
		Constant typeName = createConstant(otherAgentNodeContext.getAgentType());
		ConstraintParameter constParamValue = createConstraintParameter(typeName);
		
		typeConstraint.getParameters().add(localParamValue);
		typeConstraint.getParameters().add(constParamValue);
		
		trgPatternBody.getConstraints().add(typeConstraint);
		
		// ###### create local simSite node
		EMFVariable sitesAttribute = createEMFVariable(otherSiteNodeContext.getUniqueSimSiteContainerAttributeName(), SiteNodeContext.SIM_SITE_CONTAINER_ATTRIBUTE_TYPE);
		trgPatternBody.getLocalVariables().add(sitesAttribute);
				
		Reference sitesConstraint = createReferenceConstraint(SiteNodeContext.SIM_SITE_CONTAINER_ATTRIBUTE);
		ConstraintParameter signatureContext = createConstraintParameter(signatureVariables.get(otherSiteNodeContext.getAgentNodeContext()));
		ConstraintParameter localContext = createConstraintParameter(sitesAttribute);
		
		sitesConstraint.getParameters().add(signatureContext);
		sitesConstraint.getParameters().add(localContext);
		
		trgPatternBody.getConstraints().add(sitesConstraint);
		
		// Create the local node itself:
		EMFVariable siteTypeVariable = createEMFVariable(otherSiteNodeContext.getUniqueTypeAttributeName(), SiteNodeContext.TYPE_ATTRIBUTE_TYPE);
		trgPatternBody.getLocalVariables().add(siteTypeVariable);
				
		Attribute siteTypeAttribute = createAttributeConstraint(SiteNodeContext.TYPE_ATTRIBUTE);
		ConstraintParameter sitesContextParam = createConstraintParameter(sitesAttribute);
		ConstraintParameter siteContextParam = createConstraintParameter(siteTypeVariable);
		
		siteTypeAttribute.getParameters().add(sitesContextParam);
		siteTypeAttribute.getParameters().add(siteContextParam);
				
		trgPatternBody.getConstraints().add(siteTypeAttribute);
		
		// constant site type constraint
		Constant siteConstant = createConstant(otherSiteNodeContext.getSiteType());
		trgPatternBody.getConstants().add(siteConstant);

		RelationalConstraint typeConstraint2 = createRelationalConstraint(ConstraintType.equal);
		ConstraintParameter siteContextParam2 = createConstraintParameter(siteTypeVariable);
		ConstraintParameter siteConstantParam = createConstraintParameter(siteConstant);
		
		typeConstraint2.getParameters().add(siteContextParam2);
		typeConstraint2.getParameters().add(siteConstantParam);
		
		trgPatternBody.getConstraints().add(typeConstraint2);
		
		//  ######  create local link node
		EMFVariable linkVariableB = createEMFVariable(linkState.getUniqueSimLinkStateContainerAttributeName(), LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE_TYPE);
		trgPatternBody.getLocalVariables().add(linkVariableB);
		
		Reference linkConstraintB = createReferenceConstraint(LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE);
		ConstraintParameter sitesContextParamB = createConstraintParameter(sitesAttribute);
		ConstraintParameter linkVariableParamB = createConstraintParameter(linkVariableB);
		
		linkConstraintB.getParameters().add(sitesContextParamB);
		linkConstraintB.getParameters().add(linkVariableParamB);
		
		trgPatternBody.getConstraints().add(linkConstraintB);
		
		// create relational constraint
		RelationalConstraint  linkConstraint = createRelationalConstraint(ConstraintType.equal);
		ConstraintParameter linkA = createConstraintParameter(linkVariableA);
		ConstraintParameter linkB = createConstraintParameter(linkVariableB);
		
		linkConstraint.getParameters().add(linkA);
		linkConstraint.getParameters().add(linkB);
		
		trgPatternBody.getConstraints().add(linkConstraint);
	}
	
	private static org.gervarro.democles.specification.emf.Pattern createBoundAnyLinkPattern() {
		org.gervarro.democles.specification.emf.Pattern pattern = specificationFactory.createPattern();
		pattern.setName(BOUND_ANY_LINK_PATTERN_KEY);
		
		PatternBody patternBody = specificationFactory.createPatternBody();
		pattern.getBodies().add(patternBody);
		
		// ##### create Signature
		EMFVariable signatureNodeVariable = createEMFVariable("simSite", SiteNodeContext.SIM_SITE_TYPE);
		pattern.getSymbolicParameters().add(signatureNodeVariable);
		
		// ##### create Body
		EMFVariable linkStateVariable = createEMFVariable("LinkState", LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE_TYPE);
		patternBody.getLocalVariables().add(linkStateVariable);
		
		Reference linkConstraint = createReferenceConstraint(LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE);
		ConstraintParameter siteContextParam = createConstraintParameter(signatureNodeVariable);
		ConstraintParameter linkVariableParam = createConstraintParameter(linkStateVariable);
		
		linkConstraint.getParameters().add(siteContextParam);
		linkConstraint.getParameters().add(linkVariableParam);
		
		patternBody.getConstraints().add(linkConstraint);
		
		return pattern;
	}

	private static EMFVariable createEMFVariable(String name, EClassifier nodeType) {
		EMFVariable variable = emfTypeFactory.createEMFVariable();
		variable.setName(name);
		variable.setEClassifier(nodeType);
		return variable;
	}
	
	private static Attribute createAttributeConstraint(EAttribute nodeAttribute) {
		Attribute attribute = emfTypeFactory.createAttribute();
		attribute.setEModelElement(nodeAttribute);
		return attribute;
	}
	
	private static Reference createReferenceConstraint(EReference referenceContainer) {
		Reference reference = emfTypeFactory.createReference();
		reference.setEModelElement(referenceContainer);
		return reference;
	}
	
	private static RelationalConstraint createRelationalConstraint(ConstraintType type) {
		RelationalConstraint constraint = null;
		switch(type) {
		case equal : {
			constraint = relationalConstraintFactory.createEqual();
			break;
		}
		case unequal : {
			constraint = relationalConstraintFactory.createUnequal();
		}
		}
		return constraint;
	}
	
	private static ConstraintParameter createConstraintParameter(ConstraintVariable variable) {
		ConstraintParameter parameter = specificationFactory.createConstraintParameter();
		parameter.setReference(variable);
		return parameter;
	}
	
	private static Constant createConstant(Object value) {
		Constant constant = specificationFactory.createConstant();
		constant.setValue(value);
		return constant;
	}
}
