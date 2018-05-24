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
				AgentInstance.agent.name(«ap.agent.name», "«ap.agent.name»");
				«FOR sp : ap.sitePatterns.sitePatterns»
				AgentInstance.linkStates(«ap.agent.name», «aILSVariableName(ap, sp)»);
				AgentInstanceLinkState.site.name(«aILSVariableName(ap, sp)», "«sp.site.name»");
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
				AgentInstanceLinkState.linkState.linkState(«aILSVariableName(ap, sp)», «ap.agent.name»_«sp.site.name»_FL);
				FreeLink(«ap.agent.name»_«sp.site.name»_FL);
			'''
		}else if(linkState instanceof SemiLink) {
			return '''
				AgentInstanceLinkState.linkState.linkState(«aILSVariableName(ap, sp)», «ap.agent.name»_«sp.site.name»_SL);
				SemiLink(«ap.agent.name»_«sp.site.name»_SL);
			'''
			//This is a Stub, since i don't yet know what SemiLink does exactly
		}else if(linkState instanceof WhatEver) {
			return '''
				AgentInstanceLinkState.linkState.linkState(«aILSVariableName(ap, sp)», «ap.agent.name»_«sp.site.name»_WEL);
				WhatEver(«ap.agent.name»_«sp.site.name»_WEL);
			'''
			//This is a prototype, since i don't yet know how don't care links should work exactly
		}else if(linkState instanceof ExactLink) {
			return '''
				AgentInstanceLinkState.linkState.linkState(«aILSVariableName(ap, sp)», «ap.agent.name»_«sp.site.name»_EL);
				WhatEver(«ap.agent.name»_«sp.site.name»_EL);
			'''
			//This is a Stub, since i don't yet know what ExactLink does exactly
		}else {
			return '''
				AgentInstanceLinkState.site(«aILSVariableName(ap, sp)», «ap.agent.name»_«sp.site.name»_IL);
				AgentInstanceLinkState.attachedSite(«aILSVariableName(ap, sp)», «getOtherIndexedLinkSite(ap, sp)»);
				AgentInstanceLinkState.attachedAgentInstance(«aILSVariableName(ap, sp)», «getOtherIndexedLinkAgent(ap, sp)»);
			'''
		}
	}
	
	def getOtherIndexedLinkAgent(AgentPattern ap, SitePattern sp) {
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
				var eObj2 = candidate.eContainer
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
					return '''«agentPattern.agent.name»'''
				}
				return ''''''
			}
		}
		return ''''''
	}
	
	def getOtherIndexedLinkSite(AgentPattern ap, SitePattern sp) {
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
			println(cand.toString)
			val candidate = cand as IndexedLink
			if(!candidate.equals(iLink) && iLink.state.equals(candidate.state)) {
				var agentPattern = null as AgentPattern
				var sitePattern = null as SitePattern
				var eObj2 = candidate.eContainer
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
					return '''«agentPattern.agent.name»_«sitePattern.site.name»_IL'''
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
		return '''«ap.agent.name»: AgentInstance'''
	}
	
	
	def aILSVariableName(AgentPattern ap, SitePattern sp) {
		return '''«ap.agent.name+"_"+sp.site.name»_ILS'''
	}
	
}