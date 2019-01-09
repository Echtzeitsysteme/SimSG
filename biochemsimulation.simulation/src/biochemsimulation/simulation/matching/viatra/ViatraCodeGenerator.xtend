package biochemsimulation.simulation.matching.viatra

import java.util.LinkedHashMap
import org.eclipse.emf.ecore.EPackage
import java.util.Map
import java.util.HashMap

import biochemsimulation.simulation.matching.patterns.GenericPattern
import biochemsimulation.simulation.matching.patterns.LinkStateContext
import biochemsimulation.simulation.matching.patterns.SiteStateContext
import biochemsimulation.simulation.matching.patterns.AgentNodeConstraint

class ViatraCodeGenerator {
	
	LinkedHashMap<EPackage, String> importAliases;
	Map<String, GenericPattern> genericPatterns;
	
	new(LinkedHashMap<EPackage, String> importAliases, Map<String, GenericPattern> genericPatterns) {
		this.importAliases = importAliases
		
		this.genericPatterns = new HashMap
		genericPatterns.forEach([name, pattern | 
			if(!pattern.voidPattern) {
				this.genericPatterns.put(name, pattern)
			}
		])
	}
	
	def String generatePatternCode() {
		return '''
			package biochemsimulation.viatrapatterns.generator
					
			«FOR p : importAliases.keySet»
				import "«p.nsURI»" as «importAliases.get(p)»
			«ENDFOR»
			
			«FOR genericPattern : genericPatterns.values SEPARATOR "\n"»
				pattern «genericPattern.name»(«FOR node : genericPattern.signature.signature.entrySet SEPARATOR ", "» «node.key» : «node.value.name»«ENDFOR») {
					«FOR agent : genericPattern.body.agentNodeContexts.values» «FOR site : genericPattern.body.siteNodeContexts.get(agent)»
					«generateLink(genericPattern.body.linkStateContexts.get(site))»
					«generateState(genericPattern.body.siteStateContexts.get(site))»
					«ENDFOR»
					«ENDFOR»
					«FOR agents : genericPattern.body.localAgentNodes.values»«FOR agent : agents»
					«generateLink(genericPattern.body.localLinkStates.get(genericPattern.body.localSiteNodes.get(agent)))»
					«ENDFOR»«ENDFOR»
					«FOR constraint : genericPattern.body.injectivityConstraints»
					«generateConstraint(constraint)»
					«ENDFOR»
				}	
			«ENDFOR»
		'''
	}
	
	def String generateLink(LinkStateContext link){
		if(link === null) return ""
		switch(link.stateType) {
			case Bound : return generateBoundLink(link)
			case BoundAny : return generateBoundAny(link)
			case BoundAnyOfType : return generateBoundAnyOfType(link)
			case Unbound: return generateUnbound(link)
			case WhatEver: return ""
		}
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
	
}