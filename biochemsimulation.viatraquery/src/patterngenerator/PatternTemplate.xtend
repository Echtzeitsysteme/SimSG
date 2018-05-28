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
	//private List<String> keywords = Arrays.asList("package", "pattern");
	
	
	new(LinkedHashMap<EPackage, String> importAliases) {
		this.importAliases = importAliases;
		agentPatternVariables = new HashMap
		patternVariableNames = new HashMap
	}

	def generatePatternCode(Collection<Rule> rules) {
		return '''
			package patterngenerator
					
			«FOR p : importAliases.keySet»
				import "«p.nsURI»" as «importAliases.get(p)»
			«ENDFOR»
			
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
			pattern «rule.name+"_"+suffix»(«FOR ap : getValidAgentPatterns(pattern.agentPatterns) SEPARATOR ", "» «generateAgentPatternContext(ap)»«ENDFOR») {
				«FOR ap : getValidAgentPatterns(pattern.agentPatterns) SEPARATOR "\n"»
				// Agent pattern for instances of agent «getUniqueAgentPatternVarId(ap)»
				AgentInstance.agent.name(«getUniqueAgentPatternVarId(ap)», "«ap.agent.name»");
					«FOR sp : ap.sitePatterns.sitePatterns SEPARATOR "\n"»
					// Site patterns for site «sp.site.name» attached to instances of agent «getUniqueAgentPatternVarId(ap)» 
					AgentInstance.linkStates(«getUniqueAgentPatternVarId(ap)», «aILSVariableName(ap, sp)»);
					AgentInstanceLinkState.site.name(«aILSVariableName(ap, sp)», "«sp.site.name»");
					«linkStatePattern(ap, sp)»
					«siteStatePattern(ap, sp)»
					«ENDFOR»
				«ENDFOR»
			}
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
				AgentInstanceLinkState.linkState.linkState(«aILSVariableName(ap, sp)», «getUniqueAgentPatternVarId(ap)»_«sp.site.name»_FL);
				FreeLink(«getUniqueAgentPatternVarId(ap)»_«sp.site.name»_FL);
			'''
		}else if(linkState instanceof SemiLink) {
			return '''
				AgentInstanceLinkState.linkState.linkState(«aILSVariableName(ap, sp)», «getUniqueAgentPatternVarId(ap)»_«sp.site.name»_SL);
				IndexedLink(«getUniqueAgentPatternVarId(ap)»_«sp.site.name»_SL);
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
				AgentInstanceLinkState.linkState.linkState(«aILSVariableName(ap, sp)», «getUniqueAgentPatternVarId(ap)»_«sp.site.name»_EL);
				IndexedLink(«getUniqueAgentPatternVarId(ap)»_«sp.site.name»_EL);
				AgentInstanceLinkState.attachedSite.name(«aILSVariableName(ap, sp)», "«eLink.linkSite.site.name»");
				AgentInstanceLinkState.attachedAgentInstance.agent.name(«aILSVariableName(ap, sp)», "«eLink.linkAgent.agent.name»");
			'''
			/* ExactLinks behave the same as SemiLinks and are used to count the occurences of agent instances with a 
			 * certain type bound to any agent instance of the specified type and site at its specified site.
			 */
		}else {
			return '''
				AgentInstanceLinkState.linkState.linkState(«aILSVariableName(ap, sp)», «getUniqueAgentPatternVarId(ap)»_«sp.site.name»_IL);	
				IndexedLink(«ap.agent.name»_«sp.site.name»_IL);
				AgentInstanceLinkState.site(«aILSVariableName(ap, sp)», «ap.agent.name»_«sp.site.name»_Site);
				AgentInstanceLinkState.attachedSite(«aILSVariableName(ap, sp)», «getOtherIndexedLinkSite(ap, sp)»);
				AgentInstanceLinkState.attachedAgentInstance(«aILSVariableName(ap, sp)», «getOtherIndexedLinkAgent(ap, sp)»);
			'''
		}
	}
	
	def siteStatePattern(ValidAgentPattern ap, SitePattern sp) {
		val siteState = sp.state as SiteState
		if(siteState === null) {
			return ''''''
		}
		return '''
			AgentInstance.siteStates(«getUniqueAgentPatternVarId(ap)», «aISSVariableName(ap, sp)»);
			AgentInstanceSiteState.site.name(«aISSVariableName(ap, sp)», "«sp.site.name»");
			AgentInstanceSiteState.siteState.state.name(«aISSVariableName(ap, sp)», "«sp.state.state.name»");
		'''
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
					return '''«getUniqueAgentPatternVarId(agentPattern)»'''
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
					return '''«getUniqueAgentPatternVarId(agentPattern)»_«sitePattern.site.name»_Site'''
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
	
	def generateAgentPatternContext(ValidAgentPattern ap) {
		return '''«getUniqueAgentPatternVarId(ap)»: AgentInstance'''
	}
	
	def aILSVariableName(ValidAgentPattern ap, SitePattern sp) {
		return '''«getUniqueAgentPatternVarId(ap)+"_"+sp.site.name»_ILS'''
	}
	def aISSVariableName(ValidAgentPattern ap, SitePattern sp) {
		return '''«getUniqueAgentPatternVarId(ap)+"_"+sp.site.name»_ISS'''
	}
	
	def String getUniqueAgentPatternVarId(ValidAgentPattern ap) {
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
				for(e : patternVariableNames.get(pattern)) {
					println("ID "+ap.hashCode+" set contains: "+e )
				}
				agentPatternVariables.put(ap, name)
				
			}else {
				name = ap.agent.name
				varNameSet = new HashSet<String>
				varNameSet.add(name)
				patternVariableNames.put(pattern, varNameSet)
				agentPatternVariables.put(ap, name)
			}
		}
		println("ID: "+ap.hashCode+", uName: "+name)
		return name
	}
	
}