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
import biochemsimulation.reactionrules.reactionRules.SiteState
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern
import org.eclipse.emf.common.util.EList
import java.util.HashMap
import java.util.Set
import java.util.HashSet

class PatternTemplate {
	
	private LinkedHashMap<EPackage, String> importAliases;
	private HashMap<AgentPattern, String> agentPatternVariables;
	private HashMap<Pattern, Set<String>> patternVariableNames;
	private HashMap<Pattern, HashMap<ValidAgentPattern, String>> agentPatterns;
	//private List<String> keywords = Arrays.asList("package", "pattern");
	
	
	new(LinkedHashMap<EPackage, String> importAliases) {
		this.importAliases = importAliases;
		agentPatternVariables = new HashMap
		patternVariableNames = new HashMap
		agentPatterns = new HashMap
	}

	def generatePatternCode(Collection<Rule> rules) {
		return '''
			package patterngenerator
					
			«FOR p : importAliases.keySet»
				import "«p.nsURI»" as «importAliases.get(p)»
			«ENDFOR»
			
			pattern support_BoundState(ls: SimBound) {
				SimBound(ls);
			}
			
			«FOR r : rules SEPARATOR "\n"»
				«if(!isPatternEmpty(patternFromPatternAssignment(r.rule.lhs)))generatePatternCode(r, patternFromPatternAssignment(r.rule.lhs), "lhs")»«if(r.rule.operator.equals("<->"))"\n"»
				«if(r.rule.operator.equals("<->"))if(!isPatternEmpty(patternFromPatternAssignment(r.rule.rhs)))generatePatternCode(r, patternFromPatternAssignment(r.rule.rhs), "rhs")»
			«ENDFOR»
		'''
	}
	
	def boolean isPatternEmpty(Pattern p) {
		if(p.agentPatterns.size() < 1) {
			return true;
		}else {
			for(ap : p.agentPatterns) {
				if(ap instanceof ValidAgentPattern) {
					return false;
				}
			}
		}
		return true;
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
		if(pattern.agentPatterns.size <= 0) {
			return ''''''
		}	
		return '''
			pattern «rule.name+"_"+suffix»(«FOR ap : getValidAgentPatterns(pattern.agentPatterns) SEPARATOR ", "» «generateSimAgentContext(ap)»«ENDFOR») {
				«FOR ap : getValidAgentPatterns(pattern.agentPatterns) SEPARATOR "\n"»
				// Agent pattern for instances of agent «uniqueSimAgentVariableName(ap)»
				SimAgent.Type(«uniqueSimAgentVariableName(ap)», "«ap.agent.name»");
					«FOR sp : ap.sitePatterns.sitePatterns SEPARATOR "\n"»
					// Site patterns for site «sp.site.name» attached to instances of agent «uniqueSimAgentVariableName(ap)» 
					SimAgent.simSites(«uniqueSimAgentVariableName(ap)», «simSiteVariableName(ap, sp)»);
					SimSite.Type(«simSiteVariableName(ap, sp)», "«sp.site.name»");
					«siteStatePattern(ap, sp)»
					«linkStatePattern(ap, sp)»
					«ENDFOR»
				«ENDFOR»
				«generateInjectivityConstraints(pattern)»
			}
		'''
		
	}
	
	def generateInjectivityConstraints(Pattern pattern) {
		val constraints = new HashMap<String, String>
		val patterns = agentPatterns.get(pattern)
		val keySet = patterns.keySet
		for(current : keySet) {
			val currentType = current.agent.name
			for(candidate : keySet) {
				if(!current.equals(candidate)) {
					val candidateType = candidate.agent.name
					if(currentType.equals(candidateType)) {
						val constrain1 = patterns.get(current) + " != " + patterns.get(candidate) + ";"
						val constrain2 = patterns.get(candidate) + " != " + patterns.get(current) + ";"
						val key = Math.max(constrain1.hashCode, constrain2.hashCode).toString
						if(!constraints.containsKey(key)) {
							constraints.put(key, constrain1)
						}
					}
				}
			}
		}
		return '''
			«FOR cnst : constraints.keySet SEPARATOR "\n"» «constraints.get(cnst)»«ENDFOR»
		'''
	}
	
	def getValidAgentPatterns(EList<AgentPattern> aps) {
		val list = new LinkedList<ValidAgentPattern>()
		for(ap : aps) {
			if(ap instanceof ValidAgentPattern) {
				val vap = ap as ValidAgentPattern
				list.add(vap)
			}
		}
		return list
	}
	
	def linkStatePattern(ValidAgentPattern ap, SitePattern sp) {
		val linkState = sp.linkState.linkState as LinkState
		if(linkState instanceof FreeLink) {
			return '''
				SimSite.simLinkState(«simSiteVariableName(ap, sp)», «simLinkStateVariableName(ap ,sp)»);
				neg find support_BoundState(«simLinkStateVariableName(ap ,sp)»);
			'''
		}else if(linkState instanceof SemiLink) {
			return '''
				SimSite.simLinkState(«simSiteVariableName(ap, sp)», «simLinkStateVariableName(ap ,sp)»);
				find support_BoundState(«simLinkStateVariableName(ap ,sp)»);
			'''
			/* SemiLinks are used to find occurences of agent instances of a 
			 * certain type bound to any other agent instance at its specified site.
			 */
		}else if(linkState instanceof WhatEver) {
			return '''
			'''
			/* WhatEver is used to specify a site whose state is to be changed without 
			 * having to mention what link state this site should have. Basically a wild card for the current link-state
			 * of the affected site.
			 */
		}else if(linkState instanceof ExactLink) {
			val eLink = linkState as ExactLink
			return '''
				SimSite.simLinkState(«simSiteVariableName(ap, sp)», «simLinkStateVariableName(ap ,sp)»);
				// Create context for other SimAgent:
				SimAgent.Type(«uniqueSimAgentVariableName(ap)»_«eLink.linkAgent.agent.name», "«eLink.linkAgent.agent.name»");
				SimAgent.simSites(«uniqueSimAgentVariableName(ap)»_«eLink.linkAgent.agent.name», «uniqueSimAgentVariableName(ap)»_«eLink.linkAgent.agent.name»_«eLink.linkSite.site.name»);
				SimSite.Type(«uniqueSimAgentVariableName(ap)»_«eLink.linkAgent.agent.name»_«eLink.linkSite.site.name», "«eLink.linkSite.site.name»");
				SimSite.simLinkState(«uniqueSimAgentVariableName(ap)»_«eLink.linkAgent.agent.name»_«eLink.linkSite.site.name», «uniqueSimAgentVariableName(ap)»_«eLink.linkAgent.agent.name»_«eLink.linkSite.site.name»_LS);
				// check for equality
				«simLinkStateVariableName(ap ,sp)» == «uniqueSimAgentVariableName(ap)»_«eLink.linkAgent.agent.name»_«eLink.linkSite.site.name»_LS;
			'''
			/* ExactLinks behave the same as SemiLinks and are used to count the occurences of agent instances with a 
			 * certain type bound to any agent instance of the specified type and site at its specified site.
			 */
		}else {
			return '''
				SimSite.simLinkState(«simSiteVariableName(ap, sp)», «simLinkStateVariableName(ap ,sp)»);
				«simLinkStateVariableName(ap ,sp)» == «getOtherLinkStateVariableName(ap, sp)»;
			'''
		}
	}
	
	def siteStatePattern(ValidAgentPattern ap, SitePattern sp) {
		val siteState = sp.state as SiteState
		if(siteState === null) {
			return ''''''
		}
		return '''
			SimSite.simSiteState.Type(«simSiteVariableName(ap, sp)», "«siteState.state.name»");
		'''
	}
	
	def getOtherLinkStateVariableName(ValidAgentPattern ap, SitePattern sp) {
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
				var agentPattern = null as ValidAgentPattern
				var sitePattern = null as SitePattern
				var eObj2 = candidate.eContainer
				while(!(eObj2 instanceof SitePattern) && eObj2 !== null) {
					eObj2 = eObj2.eContainer
				}
				if(eObj2 instanceof SitePattern) {
					sitePattern = eObj2 as SitePattern
				}
				while(!(eObj2 instanceof ValidAgentPattern) && eObj2 !== null) {
					eObj2 = eObj2.eContainer
				}
				if(eObj2 instanceof ValidAgentPattern) {
					agentPattern = eObj2 as ValidAgentPattern
				}
				if(agentPattern !== null && sitePattern !== null) {
					return '''«simLinkStateVariableName(agentPattern, sitePattern)»'''
				}
				return ''''''
			}
		}
		return ''''''
	}
	
	def getOtherIndexedLinkAgent(ValidAgentPattern ap, SitePattern sp) {
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
				var agentPattern = null as ValidAgentPattern
				var sitePattern = null as SitePattern
				var eObj2 = candidate.eContainer
				while(!(eObj2 instanceof SitePattern) && eObj2 !== null) {
					eObj2 = eObj2.eContainer
				}
				if(eObj2 instanceof SitePattern) {
					sitePattern = eObj2 as SitePattern
				}
				while(!(eObj2 instanceof ValidAgentPattern) && eObj2 !== null) {
					eObj2 = eObj2.eContainer
				}
				if(eObj2 instanceof ValidAgentPattern) {
					agentPattern = eObj2 as ValidAgentPattern
				}
				if(agentPattern !== null && sitePattern !== null) {
					return '''«uniqueSimAgentVariableName(agentPattern)»'''
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
			val candidate = cand as IndexedLink
			if(!candidate.equals(iLink) && iLink.state.equals(candidate.state)) {
				var agentPattern = null as ValidAgentPattern
				var sitePattern = null as SitePattern
				var eObj2 = candidate.eContainer
				while(!(eObj2 instanceof SitePattern) && eObj2 !== null) {
					eObj2 = eObj2.eContainer
				}
				if(eObj2 instanceof SitePattern) {
					sitePattern = eObj2 as SitePattern
				}
				while(!(eObj2 instanceof ValidAgentPattern) && eObj2 !== null) {
					eObj2 = eObj2.eContainer
				}
				if(eObj2 instanceof ValidAgentPattern) {
					agentPattern = eObj2 as ValidAgentPattern
				}
				if(agentPattern !== null && sitePattern !== null) {
					return '''«uniqueSimAgentVariableName(agentPattern)»_«sitePattern.site.name»_Site'''
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
			if(aPattern instanceof ValidAgentPattern) {
				val vaPattern = aPattern as ValidAgentPattern
				if(vaPattern.sitePatterns !== null) {
					sitePatterns.addAll(vaPattern.sitePatterns.sitePatterns)
				}
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
	
	def generateSimAgentContext(ValidAgentPattern ap) {
		return '''«uniqueSimAgentVariableName(ap)»: SimAgent'''
	}
	
	def simSiteVariableName(ValidAgentPattern ap, SitePattern sp) {
		return '''«uniqueSimAgentVariableName(ap)+"_"+sp.site.name»'''
	}
	def simLinkStateVariableName(ValidAgentPattern ap, SitePattern sp) {
		return '''«uniqueSimAgentVariableName(ap)+"_"+sp.site.name»_LS'''
	}
	
	def String uniqueSimAgentVariableName(ValidAgentPattern ap) {
		var name = ""
		if(agentPatternVariables.containsKey(ap)) {
			name = agentPatternVariables.get(ap)
		}else {
			val pattern = ap.eContainer as Pattern
			var varNameSet = null as Set<String>
			if(patternVariableNames.containsKey(pattern)) {
				varNameSet = patternVariableNames.get(pattern)
				name = ap.agent.name
				var c = 1
				while(varNameSet.contains(name)) {
					name = ap.agent.name+c
					c++
				}
				varNameSet.add(name)
				agentPatternVariables.put(ap, name)
				
			}else {
				name = ap.agent.name
				varNameSet = new HashSet<String>
				varNameSet.add(name)
				patternVariableNames.put(pattern, varNameSet)
				agentPatternVariables.put(ap, name)
			}
			
			var patterns = null as HashMap<ValidAgentPattern, String>
			if(agentPatterns.containsKey(pattern)) {
				patterns = agentPatterns.get(pattern)
				if(!patterns.containsKey(ap)) {
					patterns.put(ap, name)
				}
			}else {
				patterns = new HashMap
				patterns.put(ap, name)
				agentPatterns.put(pattern, patterns)
			}
		}
		return name
	}
	
}