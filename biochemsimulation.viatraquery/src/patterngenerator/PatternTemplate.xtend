package patterngenerator

import java.util.LinkedHashMap
//import java.util.List
//import java.util.Arrays
import org.eclipse.emf.ecore.EPackage
import java.util.Collection
import biochemsimulation.reactionrules.reactionRules.Pattern
import biochemsimulation.reactionrules.reactionRules.Rule
import biochemsimulation.reactionrules.reactionRules.PatternAssignment
import biochemsimulation.reactionrules.reactionRules.AssignFromPattern
import biochemsimulation.reactionrules.reactionRules.AssignFromVariable
import biochemsimulation.reactionrules.reactionRules.AgentPattern
import biochemsimulation.reactionrules.reactionRules.SitePattern
import biochemsimulation.reactionrules.reactionRules.ExactLink
import biochemsimulation.reactionrules.reactionRules.LinkState
import biochemsimulation.reactionrules.reactionRules.FreeLink
import biochemsimulation.reactionrules.reactionRules.SemiLink
import biochemsimulation.reactionrules.reactionRules.WhatEver
import biochemsimulation.reactionrules.reactionRules.IndexedLink
import java.util.LinkedList
import biochemsimulation.reactionrules.reactionRules.RuleBody

class PatternTemplate {
	
	private LinkedHashMap<EPackage, String> importAliases;
	
	//private List<String> keywords = Arrays.asList("package", "pattern");
	
	
	new(LinkedHashMap<EPackage, String> importAliases) {
		this.importAliases = importAliases;
	}

	def generatePatternCode(Collection<Rule> rules) {
		return '''
			package patterngenerator
					
			«FOR p : importAliases.keySet»
				import "«p.nsURI»" as «importAliases.get(p)»
			«ENDFOR»
			
			«FOR r : rules»
				«generatePatternCode(r, patternFromPatternAssignment(r.rule.lhs), "lhs")»
				«generatePatternCode(r, patternFromPatternAssignment(r.rule.rhs), "rhs")»
			«ENDFOR»
		'''
	}
	
	def Pattern patternFromPatternAssignment(PatternAssignment pa) {
		if(pa instanceof AssignFromPattern) {
			val afp = pa as AssignFromPattern
			return afp.pattern
		}else {
			val afv = pa as AssignFromVariable
			return afv.patternVar.pattern
		}
	}
	
	def generatePatternCode(Rule rule, Pattern pattern, String suffix) {	
		return '''
			pattern «rule.name+"_"+suffix»(«FOR ap : pattern.agentPatterns SEPARATOR ", "» «generateAgentPatternContext(ap)»«ENDFOR») {
				«FOR ap : pattern.agentPatterns»
				AgentInstance.agent.name(«ap.agent.name», «agentNameVariableName(ap)»);
				check (
					«agentNameVariableName(ap)».matches("«ap.agent.name»")
				);
				«FOR sp : ap.sitePatterns.sitePatterns»
				«linkStatePattern(ap, sp)»
				«ENDFOR»
				«ENDFOR»
				
			}
		'''
		
	}
	
	def linkStatePattern(AgentPattern ap, SitePattern sp) {
		val linkState = sp.linkState.linkState as LinkState
		if(linkState instanceof FreeLink) {
			return '''
				AgentInstance.linkStates(«ap.agent.name», «aILSVariableName(ap, sp)»);
			   	AgentInstanceLinkState.site.name(«aILSVariableName(ap, sp)», «aILSNameVariableName(ap, sp)»);
				check (
					«aILSNameVariableName(ap, sp)».matches("«sp.site.name»")
				);
				AgentInstanceLinkState.linkState.linkState(«aILSVariableName(ap, sp)», «aILSContextVariableName(ap, sp)»);
			'''
		}else if(linkState instanceof SemiLink) {
			return '''
				AgentInstance.linkStates(«ap.agent.name», «aILSVariableName(ap, sp)»);
				AgentInstanceLinkState.site.name(«aILSVariableName(ap, sp)», «aILSNameVariableName(ap, sp)»);
				check (
					«aILSNameVariableName(ap, sp)».matches("«sp.site.name»")
				);
				AgentInstanceLinkState.linkState.linkState(«aILSVariableName(ap, sp)», «aILSContextVariableName(ap, sp)»);
			'''
		}else if(linkState instanceof WhatEver) {
			return ''''''
		}else if(linkState instanceof ExactLink) {
			return '''«aILSContextVariableName(ap, sp)»: «sp.linkState.linkState.eClass.name», «aILSContextExactLinkAgentVariableName(ap, sp)»: java String, «aILSContextExactLinkSiteVariableName(ap, sp)»: java String'''
		}else {
			return '''
				AgentInstance.linkStates(«ap.agent.name», «aILSVariableName(ap, sp)»);
				AgentInstanceLinkState.site.name(«aILSVariableName(ap, sp)», «aILSNameVariableName(ap, sp)»);
				check (
					«aILSNameVariableName(ap, sp)».matches("«sp.site.name»")
				);
				AgentInstanceLinkState.linkState.linkState(«aILSVariableName(ap, sp)», «aILSContextVariableName(ap, sp)»);
				IndexedLink.state(«aILSVariableName(ap, sp)», «aILSContextIndexedLinkVariableName(ap, sp)»);
				check (
					«aILSContextIndexedLinkVariableName(ap, sp)».matches("«getOtherIndexedLinkVariableName(ap, sp)»")
				);
			'''
		}
	}
	
	def getOtherIndexedLinkVariableName(AgentPattern ap, SitePattern sp) {
		val iLink = sp.linkState.linkState as IndexedLink
		var rule = null as Rule
		var eObj = iLink.eContainer
		while(!(eObj instanceof Rule) && eObj !== null) {
			eObj = eObj.eContainer
		}
		if(eObj instanceof Rule) {
			rule = eObj
		}
		var candidates = getAllIndexedLinksOfRule(rule)
		for(cand : candidates) {
			val candidate = cand as IndexedLink
			if(!candidate.equals(iLink) && iLink.state.equals(candidate.state)) {
				var agentPattern = null as AgentPattern
				var sitePattern = null as SitePattern
				var eObj2 = iLink.eContainer
				while(!(eObj2 instanceof SitePattern) && eObj2 !== null) {
					eObj2 = eObj2.eContainer
				}
				if(eObj2 instanceof SitePattern) {
					sitePattern = eObj2 as SitePattern
				}
				while(!(eObj2 instanceof AgentPattern) && eObj2 !== null) {
					eObj2 = eObj2.eContainer
				}
				if(eObj2 instanceof AgentPattern) {
					agentPattern = eObj2 as AgentPattern
				}
				if(agentPattern !== null && sitePattern !== null) {
					return aILSContextIndexedLinkVariableName(agentPattern, sitePattern)
				}
				return ''''''
			}
		}
		return ''''''
	}
	
	def getAllIndexedLinksOfRule(Rule rule) {
		var out = new LinkedList<IndexedLink>()
		var ruleBody = null as RuleBody
		if(rule.rule !== null) {
			ruleBody = rule.rule as RuleBody
		}
		if(ruleBody === null) {
			return out;
		}
		var lhs = ruleBody.lhs
		var rhs = ruleBody.rhs
		var patterns = new LinkedList<Pattern>()
		if(lhs !== null) {
			patterns.add(patternFromPatternAssignment(lhs))
		}
		if(rhs !== null) {
			patterns.add(patternFromPatternAssignment(rhs))
		}
		var agentPatterns = new LinkedList<AgentPattern>()
		for(pattern : patterns) {
			if(pattern.agentPatterns !== null) {
				agentPatterns.addAll(pattern.agentPatterns)
			}
		}
		var sitePatterns = new LinkedList<SitePattern>()
		for(aPattern : agentPatterns) {
			if(aPattern.sitePatterns !== null) {
				sitePatterns.addAll(aPattern.sitePatterns.sitePatterns)
			}
		}
		for(sPattern : sitePatterns) {
			if(sPattern.linkState !== null) {
				if(sPattern.linkState.linkState instanceof IndexedLink) {
					val iLink = sPattern.linkState.linkState as IndexedLink
					out.add(iLink)
				}
			}
		}
		return out
		
	} 
	
	def generateAgentPatternContext(AgentPattern ap) {
		return '''«ap.agent.name»: AgentInstance, «agentNameVariableName(ap)»: java String, «generateSitePatternContext(ap)»'''
	}
	
	def generateSitePatternContext(AgentPattern ap) {
		return 	'''«FOR sp : ap.sitePatterns.sitePatterns SEPARATOR ", "» «agentInstanceLinkState(ap, sp)», «agentInstanceLinkStateName(ap, sp)», «agentInstanceLinkStateContext(ap, sp)»«ENDFOR»'''
	}
	
	def agentInstanceLinkState(AgentPattern ap, SitePattern sp) {
		return '''«aILSVariableName(ap, sp)»: AgentInstanceLinkState'''
	}
	
	def agentInstanceLinkStateName(AgentPattern ap, SitePattern sp) {
		return '''«aILSNameVariableName(ap, sp)»: java String'''
	}
	
	def agentInstanceLinkStateContext(AgentPattern ap, SitePattern sp) {
		return linkStateConext(ap, sp)
	}
	
	def linkStateConext(AgentPattern ap, SitePattern sp) {
		val linkState = sp.linkState.linkState as LinkState
		if(linkState instanceof FreeLink) {
			return '''«aILSContextVariableName(ap, sp)»: «sp.linkState.linkState.eClass.name»'''
		}else if(linkState instanceof SemiLink) {
			return '''«aILSContextVariableName(ap, sp)»: «sp.linkState.linkState.eClass.name»'''
		}else if(linkState instanceof WhatEver) {
			return ''''''
		}else if(linkState instanceof ExactLink) {
			return '''«aILSContextVariableName(ap, sp)»: «sp.linkState.linkState.eClass.name», «aILSContextExactLinkAgentVariableName(ap, sp)»: java String, «aILSContextExactLinkSiteVariableName(ap, sp)»: java String'''
		}else {
			return '''«aILSContextVariableName(ap, sp)»: «sp.linkState.linkState.eClass.name», «aILSContextIndexedLinkVariableName(ap, sp)»: java String'''
		}
	}
	
	def agentNameVariableName(AgentPattern ap) {
		return '''«"Agent_"+ap.agent.name+"_Name"»'''
	}
	
	def aILSVariableName(AgentPattern ap, SitePattern sp) {
		return '''«ap.agent.name+"_"+sp.site.name»_ILS'''
	}
	
	def aILSNameVariableName(AgentPattern ap, SitePattern sp) {
		return '''«aILSVariableName(ap, sp)»_name'''
	}
	
	def aILSContextVariableName(AgentPattern ap, SitePattern sp) {
		return '''«aILSVariableName(ap, sp)»_state'''
	}
	
	def aILSContextExactLinkAgentVariableName(AgentPattern ap, SitePattern sp) {
		return '''«aILSVariableName(ap, sp)»_«sp.linkState.linkState.eClass.name»_agentName'''
	}
	
	def aILSContextIndexedLinkVariableName(AgentPattern ap, SitePattern sp) {
		return '''«aILSVariableName(ap, sp)»_«sp.linkState.linkState.eClass.name»_index'''
	}
	
	def aILSContextExactLinkSiteVariableName(AgentPattern ap, SitePattern sp) {
		return '''«aILSVariableName(ap, sp)»_«sp.linkState.linkState.eClass.name»_siteName'''
	}
	
}