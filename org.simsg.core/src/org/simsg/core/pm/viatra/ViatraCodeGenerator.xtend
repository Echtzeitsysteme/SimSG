package org.simsg.core.pm.viatra

import java.util.LinkedHashMap
import org.eclipse.emf.ecore.EPackage
import java.util.Map
import java.util.HashMap

import java.util.List
import java.util.Map.Entry
import java.util.LinkedList
import org.simsg.core.pm.pattern.GenericPattern
import org.simsg.core.pm.pattern.LinkStateContext
import org.simsg.core.pm.pattern.AgentNodeContext
import org.simsg.core.pm.pattern.AgentNodeConstraint
import org.simsg.core.pm.pattern.SiteStateContext
import org.simsg.core.pm.pattern.AttributeContext
import org.simsg.core.pm.pattern.AttributeConstraint
import org.simsg.core.pm.pattern.arithmetic.OperationComponent
import org.simsg.core.pm.pattern.arithmetic.OperatorUnary
import org.simsg.core.pm.pattern.AgentStateContext
import org.simsg.core.pm.pattern.arithmetic.OperandVariable
import org.simsg.core.pm.pattern.arithmetic.OperandValue
import org.simsg.core.pm.pattern.arithmetic.OperatorBinary

class ViatraCodeGenerator {
	
	LinkedHashMap<EPackage, String> importAliases;
	Map<String, GenericPattern> genericPatterns;
	Map<LinkStateContext, String> supportPatterns;
	
	new(LinkedHashMap<EPackage, String> importAliases, Map<String, GenericPattern> genericPatterns) {
		this.importAliases = importAliases
		supportPatterns = new HashMap
		
		this.genericPatterns = new HashMap
		genericPatterns.forEach([name, pattern | 
			if(!pattern.voidPattern) {
				this.genericPatterns.put(name, pattern)
			}
		])
	}
	
	def String generatePatternCode() {
		return '''
			package org.simsg.core.pm.viatra 
					
			«FOR p : importAliases.keySet»
				import "«p.nsURI»" as «importAliases.get(p)»
			«ENDFOR»
			
			«FOR genericPattern : genericPatterns.values SEPARATOR "\n"»
				pattern «genericPattern.name»(«FOR node : genericPattern.signature.signature.entrySet SEPARATOR ", "» «node.key» : «node.value.name»«ENDFOR») {
					«FOR agent : genericPattern.body.agentNodeContexts.values» «FOR site : genericPattern.body.siteNodeContexts.get(agent)»
					«generateLink(genericPattern, genericPattern.body.linkStateContexts.get(site))»
					«generateState(genericPattern.body.siteStateContexts.get(site))»
					«ENDFOR»
					«generateState(genericPattern.body.agentStateContexts.get(agent))»
					«ENDFOR»
					«FOR freePair : genericPattern.body.indexedFreeLinkStateContexts.values»
					«generateIndexedUnboundLink(genericPattern.name, freePair)»
					«ENDFOR»
					«FOR agents : genericPattern.body.localAgentNodes.values»«FOR agent : agents»
					«generateLink(genericPattern, genericPattern.body.localLinkStates.get(genericPattern.body.localSiteNodes.get(agent)))»
					«ENDFOR»«ENDFOR»
					«FOR constraint : genericPattern.body.injectivityConstraints»
					«generateConstraint(constraint)»
					«ENDFOR»
					«FOR context : genericPattern.body.attributeContexts»
					«generateAttributeContext(context)»
					«ENDFOR»
					«FOR constraint : genericPattern.body.attributeConstraints»
					«generateAttributeConstraint(constraint)»
					«ENDFOR»
				}	
			«ENDFOR»
			
			«FOR supportPattern : supportPatterns.values SEPARATOR "\n"»
				«supportPattern»
			«ENDFOR»
		'''
	}
	
	def String generateLink(GenericPattern gp, List<LinkStateContext> links){
		return'''«FOR link : links»
		«generateLink(gp, link)»
		«ENDFOR»
		'''
	}
	
	def String generateLink(GenericPattern gp, LinkStateContext link){
		if(link === null) return ""
		switch(link.stateType) {
			case Bound : return generateBoundLink(link)
			case BoundAny : return generateBoundAny(link)
			case BoundAnyOfType : return generateBoundAnyOfType(link)
			case Unbound: return generateUnbound(link)
			case WhatEver: return ""
			case IndexedUnbound: return ""
			case TypedUnbound: return generateTypedUnboundLink(gp, link)
		}
	}

	def String generateTypedUnboundLink(GenericPattern gp, LinkStateContext link){
		val patternName = link.siteNodeContext.agentNodeContext.patternName
		val supPatternName1 = '''supportPattern_«patternName»_«link.agentReferenceName»_«link.hashCode»'''
		val otherContextNodes = new LinkedList<AgentNodeContext>
		for(AgentNodeContext anc : gp.body.getSubPattern(link.siteNodeContext.agentNodeContext)) {
			if(anc.agentType.equals(link.siteNodeContext.agentNodeContext.agentType) && anc!=link.siteNodeContext.agentNodeContext) {
			otherContextNodes.add(anc)
			}
		}
		val supPattern1 = '''pattern «supPatternName1»(«link.sourceAgentVariableName» : «link.sourceAgentTypeName»«if(otherContextNodes.size>0)", "»«
		FOR otherNode : otherContextNodes SEPARATOR ","»«otherNode.agentVariableName» : «otherNode.agentTypeName»«ENDFOR»){
	«link.sourceAgentTypeName».«link.agentReferenceName»(«link.sourceAgentVariableName», agent);
	«link.targetAgentTypeName»(agent); 
	«FOR otherNode : otherContextNodes»
	«otherNode.agentVariableName» != agent;
	«ENDFOR»
}'''
		supportPatterns.put(link, supPattern1);
		
		
		return '''neg find «supPatternName1»(«link.sourceAgentVariableName»«if(otherContextNodes.size>0)", "»«
				FOR otherNode : otherContextNodes SEPARATOR ","»«otherNode.agentVariableName»«ENDFOR»);
'''
	}	
	
	def String generateIndexedUnboundLink(String patternName, Entry<LinkStateContext, LinkStateContext> link){
		return '''neg «link.key.sourceAgentTypeName».«link.key.agentReferenceName»(«link.key.sourceAgentVariableName», «link.key.targetAgentVariableName»);
neg «link.value.sourceAgentTypeName».«link.value.agentReferenceName»(«link.value.sourceAgentVariableName», «link.value.targetAgentVariableName»);
'''
	}
	 
	def String generateBoundLink(LinkStateContext link){
		return '''«link.sourceAgentTypeName».«link.agentReferenceName»(«link.sourceAgentVariableName», «link.targetAgentVariableName»);'''
	}
	
	def String generateBoundAny(LinkStateContext link){
		return '''«link.sourceAgentTypeName».«link.agentReferenceName»(«link.sourceAgentVariableName», _);'''
	}
	
	def String generateBoundAnyOfType(LinkStateContext link){
		var prefix = "";
		if(!link.sourceAgentLocal){
			prefix = '''«link.targetAgentTypeName»(«link.targetAgentVariableName»);
			'''
		}
		return '''«prefix»«link.sourceAgentTypeName».«link.agentReferenceName»(«link.sourceAgentVariableName», «link.targetAgentVariableName»);'''
	}
	
	def String generateUnbound(LinkStateContext link){
		return '''neg «link.sourceAgentTypeName».«link.agentReferenceName»(«link.sourceAgentVariableName», _);'''
	}
	
	def String generateState(AgentStateContext state){
		if(state === null) return "";
		return '''«state.sourceAgentTypeName».«state.stateReferenceName»(«state.sourceAgentVariableName», _);'''
	}
	 
	def String generateState(SiteStateContext state){
		if(state === null) return "";
		return '''«state.sourceAgentTypeName».«state.stateReferenceName»(«state.sourceAgentVariableName», _);'''
	}
	
	def String generateConstraint(AgentNodeConstraint constraint) {
		if(constraint === null) return "";
		switch(constraint.type) {
			
			case injectivity: {
				return '''«constraint.operand1.agentVariableName» != «constraint.operand2.agentVariableName»;'''
			}
			case order: {
				return '''Agent.ID(«constraint.operand1.agentVariableName»,«constraint.operand1.agentVariableName»_id);
Agent.ID(«constraint.operand2.agentVariableName»,«constraint.operand2.agentVariableName»_id);
check(«constraint.operand1.agentVariableName»_id > «constraint.operand2.agentVariableName»_id);'''
			}
		}
	}
	
	def String generateAttributeContext(AttributeContext context) {
		return '''«context.owningAgentNode.agentTypeName».«context.attributeName»(«context.owningAgentNode.agentVariableName», «context.attributeVariableName»);'''
	}
	
	def String generateAttributeConstraint(AttributeConstraint constraint) {
		return '''check((«generateOperation(constraint.leftOperation)») «constraint.comparator.toString» («generateOperation(constraint.rightOperation)»));'''
	}
	
	def String generateOperation(OperationComponent op) {
		if(op instanceof OperatorUnary) {
			return createUnaryOperator(op as OperatorUnary)
		}
		return createOperator(op)
	}
	
	def String createUnaryOperator(OperatorUnary uOp) {
		switch(uOp.type) {
			case abs: {
				return '''Math.abs(«generateOperation(uOp.childOperation)»)'''
			}
			case brace: {
				return '''(«generateOperation(uOp.childOperation)»)'''
			}
			case sqrt: {
				return '''Math.sqrt(«generateOperation(uOp.childOperation)»)'''
			}
			default : return ""
			
		}
	}
	
	def String createOperator(OperationComponent op) {
		if( op instanceof OperandVariable ) {
			return (op as OperandVariable).attributeContext.attributeVariableName
		}else if( op instanceof OperandValue) {
			return (op as OperandValue).toString
		}else {
			val biOp = op as OperatorBinary
			switch(biOp.type) {
				case minus: {
					return '''«generateOperation(biOp.leftOperand)» - «generateOperation(biOp.rightOperand)»'''
				}
				case mult: {
					return '''«generateOperation(biOp.leftOperand)» * «generateOperation(biOp.rightOperand)»'''
				}
				case plus: {
					return '''«generateOperation(biOp.leftOperand)» + «generateOperation(biOp.rightOperand)»'''
				}
				case pow: {
					return '''Math.pow(«generateOperation(biOp.leftOperand)», «generateOperation(biOp.rightOperand)»)'''
				}
				default: return ""
			}
		}
	}
	
}