package org.simsg.core.pm.democles;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.gervarro.democles.specification.emf.Constant;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
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
import org.simsg.container.ContainerPackage;
import org.simsg.core.pm.pattern.AgentNodeConstraint;
import org.simsg.core.pm.pattern.AgentNodeContext;
import org.simsg.core.pm.pattern.AgentStateContext;
import org.simsg.core.pm.pattern.ConstraintType;
import org.simsg.core.pm.pattern.GenericPattern;
import org.simsg.core.pm.pattern.GenericPatternBody;
import org.simsg.core.pm.pattern.GenericPatternSignature;
import org.simsg.core.pm.pattern.LinkStateContext;
import org.simsg.core.pm.pattern.SiteNodeContext;
import org.simsg.core.pm.pattern.SiteStateContext;

public class DemoclesPatternGenerator {
	

	public static final SpecificationFactory specificationFactory = SpecificationFactory.eINSTANCE;
	public static final EMFTypeFactory emfTypeFactory = EMFTypeFactory.eINSTANCE;
	public static final RelationalConstraintFactory relationalConstraintFactory = RelationalConstraintFactory.eINSTANCE;

	private Map<String, GenericPattern> genericPatterns;

	Map<String, Pattern> generated;

	private Map<AgentNodeContext, EMFVariable> signatureVariables;
	//private Map<AgentNodeContext, EMFVariable> localAgentVariables;
	//private Map<SiteNodeContext, EMFVariable> sitesVariables;
	//private Map<SiteNodeContext, EMFVariable> linkVariables;

	public DemoclesPatternGenerator(Map<String, GenericPattern> genericPatterns) {
		this.genericPatterns = genericPatterns;
	}
	
	public Map<String, Pattern> doGenerate() {
		generated = new HashMap<String, Pattern>();
		signatureVariables = new HashMap<AgentNodeContext, EMFVariable>();
		//localAgentVariables = new HashMap<AgentNodeContext, EMFVariable>();
		//sitesVariables = new HashMap<SiteNodeContext, EMFVariable>();
		//linkVariables = new HashMap<SiteNodeContext, EMFVariable>();

		//generated.put(BOUND_ANY_LINK_PATTERN_KEY, createBoundAnyLinkPattern());

		for (GenericPattern srcPattern : genericPatterns.values()) {
			if (srcPattern.isVoidPattern()) {
				continue;
			}
			Pattern trgPattern = specificationFactory.createPattern();
			trgPattern.setName(srcPattern.getName());
			generated.put(srcPattern.getName(), trgPattern);
			PatternBody trgPatternBody = specificationFactory.createPatternBody();
			trgPattern.getBodies().add(trgPatternBody);
			
			buildSignature(trgPattern, srcPattern.getSignature());
			buildAgentStateContext(trgPatternBody, srcPattern.getBody());
			buildSiteStateContexts(trgPatternBody, srcPattern.getBody());
			buildLinkStateContexts(trgPatternBody, srcPattern.getBody());
			//TODO: buildLocalLinkStateContexts
			//TODO: buildIndexedUnboundConstexts
			//TODO: buildInjectivityConstraints
			//TODO: buildAttributeConstraints
		}
		return generated;
	}
	
	private void buildSignature(Pattern trgPattern, GenericPatternSignature signature) { 
				signature.getSignature().forEach((variableName, type) -> {
				EMFVariable variable = createEMFVariable(trgPattern, variableName, type);
				GenericPatternBody body = genericPatterns.get(trgPattern.getName()).getBody();
				signatureVariables.put(body.getAgentNodeContexts().get(signature.getSignaturePattern(variableName)), variable);
				});
	}
	
	private void buildAgentStateContext(PatternBody trgPatternBody, GenericPatternBody body) {
		for(AgentStateContext context : body.getAgentStateContexts().values()) {
			EMFVariable source = signatureVariables.get(context.getAgentNodeContext());
			EMFVariable target = createLocalEMFVariable(trgPatternBody, context.getStateTypeName(), context.getStateType());
			createEdge(trgPatternBody, source, context.getStateReference(), target);
		}
	}
	
	private void buildSiteStateContexts(PatternBody trgPatternBody, GenericPatternBody body) {
		for(AgentNodeContext anc : body.getAgentNodeContexts().values()) {
			for(SiteNodeContext snc : body.getSiteNodeContexts().get(anc)) {
				SiteStateContext ssc = body.getSiteStateContexts().get(snc);
				if(ssc == null) continue;
				
				EMFVariable source = signatureVariables.get(anc);
				EMFVariable target = createLocalEMFVariable(trgPatternBody, ssc.getStateTypeName(), ssc.getStateType());
				createEdge(trgPatternBody, source, ssc.getStateReference(), target);
			}
		}
	}
	
	// Link state methods:
	private void buildLinkStateContexts(PatternBody trgPatternBody, GenericPatternBody body) {
		for(AgentNodeContext anc : body.getAgentNodeContexts().values()) {
			for(SiteNodeContext snc : body.getSiteNodeContexts().get(anc)) {
				List<LinkStateContext> lscList = body.getLinkStateContexts().get(snc);
				if(lscList == null) continue;
				
				for(LinkStateContext lsc : lscList) {
					buildLinkStateContext(trgPatternBody, lsc);
				}
			}
		}
	}
	
	private void buildLinkStateContext(PatternBody trgPatternBody, LinkStateContext lsc) {
		switch(lsc.getStateType()) {
			case Bound: {
				buildBoundLink(trgPatternBody, lsc);
				break;
			}
				
			case BoundAny: {
				buildBoundAnyLink(trgPatternBody, lsc);
				break;
			}
				
			case BoundAnyOfType: {
				
				break;
			}
				
			case IndexedUnbound: {
				
				break;
			}
				
			case TypedUnbound: {
				
				break;
			}
				
			case Unbound: {
				buildUnboundLink(trgPatternBody, lsc);
				break;
			}
				
			case WhatEver: {
				// do nothing, since we don't care for any links
				break;
			}	
		
		}
	}
	
	private void buildBoundLink(PatternBody trgPatternBody, LinkStateContext lsc) {
		EMFVariable source = signatureVariables.get(lsc.getSiteNodeContext().getAgentNodeContext());
		EMFVariable target = signatureVariables.get(lsc.getTargetLinkState().getSiteNodeContext().getAgentNodeContext());
		createEdge(trgPatternBody, source, lsc.getAgentReference(), target);
	}
	
	private void buildBoundAnyLink(PatternBody trgPatternBody, LinkStateContext lsc) {
		EMFVariable source = signatureVariables.get(lsc.getSiteNodeContext().getAgentNodeContext());
		EMFVariable target = createLocalEMFVariable(trgPatternBody, "generic_agent", lsc.getGenericTargetAgentType());
		createEdge(trgPatternBody, source, lsc.getAgentReference(), target);
	}
	
	private void buildUnboundLink(PatternBody trgPatternBody, LinkStateContext lsc) {
		// Build the anti-pattern
		Pattern antiPattern = specificationFactory.createPattern();
		antiPattern.setName("supportPattern_"+trgPatternBody.getHeader().getName()+"_"+lsc.getSourceAgentVariableName()+"_"+lsc.getAgentReferenceName()+"_unbound");
		PatternBody antiPatternBody = specificationFactory.createPatternBody();
		antiPattern.getBodies().add(antiPatternBody);
		// Add to global pattern collection
		generated.put(antiPattern.getName(), antiPattern);
		
		EMFVariable signatureNodeVariable = createEMFVariable(antiPattern, lsc.getSourceAgentVariableName(), lsc.getSourceAgentType());
		EMFVariable target = createLocalEMFVariable(antiPatternBody, "generic_agent", lsc.getGenericTargetAgentType());
		createEdge(antiPatternBody, signatureNodeVariable, lsc.getAgentReference(), target);
		
		// Construct anti-pattern invocation
		PatternInvocationConstraint invConstraint = specificationFactory.createPatternInvocationConstraint();
		invConstraint.setPositive(false);
		invConstraint.setInvokedPattern(antiPattern);
		ConstraintParameter parameter = specificationFactory.createConstraintParameter();
		parameter.setReference(signatureVariables.get(lsc.getSiteNodeContext().getAgentNodeContext()));
		invConstraint.getParameters().add(parameter);
		
		// Add anti-pattern invocation to original pattern
		trgPatternBody.getConstraints().add(invConstraint);
	}
	
	// Helper Methods:
	private static EMFVariable createEMFVariable(Pattern pattern, String name, EClass nodeType) {
		EMFVariable variable = emfTypeFactory.createEMFVariable();
		variable.setName(name);
		variable.setEClassifier(nodeType);
		pattern.getSymbolicParameters().add(variable);
		return variable;
	}
	
	// Helper Functions:
	private static EMFVariable createLocalEMFVariable(PatternBody patternBody, String name, EClass nodeType) {
		EMFVariable variable = emfTypeFactory.createEMFVariable();
		variable.setName(name);
		variable.setEClassifier(nodeType);
		patternBody.getLocalVariables().add(variable);
		return variable;
	}
	
	private static Reference createReference(PatternBody patternBody, EReference referenceContainer) {
		Reference reference = emfTypeFactory.createReference();
		reference.setEModelElement(referenceContainer);
		patternBody.getConstraints().add(reference);
		return reference;
	}
	
	private static Reference createEdge(PatternBody body, ConstraintVariable source, EReference sourceContainer, ConstraintVariable target) {
		Reference edge = createReference(body, sourceContainer);
		ConstraintParameter parameter = specificationFactory.createConstraintParameter();
		parameter.setReference(source);
		ConstraintParameter parameter2 = specificationFactory.createConstraintParameter();
		parameter2.setReference(target);
		edge.getParameters().add(parameter);
		edge.getParameters().add(parameter2);
		
		return edge;
	}
	
	/*
	private void transformBody(Pattern trgPattern, GenericPatternBody body) {
		PatternBody trgPatternBody = specificationFactory.createPatternBody();
		trgPattern.getBodies().add(trgPatternBody);

		for (AgentNodeContext agentNode : body.getAgentNodeContexts().values()) {
			transformAgentNodeContext(trgPatternBody, agentNode);
			if(body.getSiteNodeContexts().get(agentNode) == null) {
				continue;
			}
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
			if(agentNode2 == null) {
				agentNode2 = localAgentVariables.get(constraint.getOperand2());
			}
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
		localAgentVariables.put(otherAgentNodeContext, tempAgent);
		// ###### create local simSite node
		EMFVariable tempSite = createLocalSite(trgPatternBody, otherSiteNodeContext, tempAgent);
		// ###### create local link node
		EMFVariable linkVariableB = createLocalLink(trgPatternBody, otherLinkStateContext, tempSite);
		// create relational constraint
		RelationalConstraint linkConstraint = createRelationalConstraint(trgPatternBody, ConstraintType.equal);
		createConstraintParameter(linkConstraint, linkVariableA);
		createConstraintParameter(linkConstraint, linkVariableB);
	}

	private static Pattern createBoundAnyLinkPattern() {
		Pattern pattern = specificationFactory.createPattern();
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
	*/
}
