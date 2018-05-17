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
import biochemsimulation.reactionrules.reactionRules.LimitLink
import biochemsimulation.reactionrules.reactionRules.ExactLink

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
	
	def generatePatternCode(Rule rule, Pattern pattern, String suffix) {	
		return '''
			pattern «rule.name+"_"+suffix»(«FOR ap : pattern.agentPatterns SEPARATOR ", "» «generateAgentPatternContext(ap)»«ENDFOR») {
				«FOR ap : pattern.agentPatterns»
				AgentInstance.agent.name(«ap.agent.name», «"Agent_"+ap.agent.name+"_Name"»);
					check (
						«"Agent_"+ap.agent.name+"_Name"».matches("«ap.agent.name»")
					);
					«FOR sp : ap.sitePatterns.sitePatterns»
					AgentInstance.linkStates(«ap.agent.name», «ap.agent.name+"_"+sp.site.name»ILS);
					AgentInstanceLinkState.site.name(«ap.agent.name+"_"+sp.site.name»ILS, «ap.agent.name+"_"+sp.site.name»_ILS_name);
						check (
							«ap.agent.name+"_"+sp.site.name»_ILS_name.matches("«sp.site.name»")
						);
					AgentInstanceLinkState.linkState.linkState(«ap.agent.name+"_"+sp.site.name»ILS, «ap.agent.name+"_"+sp.site.name»_ILS_state);
					«ENDFOR»
				«ENDFOR»
				
			}
		'''
		
	}
	
	def generateAgentPatternContext(AgentPattern ap) {
		return '''«ap.agent.name»: AgentInstance, «"Agent_"+ap.agent.name+"_Name"»: java String, «generateSitePatternContext(ap)»'''
	}
	
	def generateSitePatternContext(AgentPattern ap) {
		return 	'''«FOR sp : ap.sitePatterns.sitePatterns SEPARATOR ", "» «ap.agent.name+"_"+sp.site.name»ILS: AgentInstanceLinkState, «ap.agent.name+"_"+sp.site.name»_ILS_name: java String, «ap.agent.name+"_"+sp.site.name»_ILS_state: «sp.linkState.linkState.eClass.name»«ENDFOR»'''
	}
	
	/*
	def generateLinkStateParameter(AgentPattern ap, SitePattern sp) {
		var param = ap.agent.name+"."+sp.site.name+ ".ILS.state: "
		val s = sp.linkState.linkState
		if(s instanceof LimitLink) {
			val ll = s as LimitLink
			param  += "java Integer"
		}else if(s instanceof ExactLink) {
			
		}
	}
	 */
	def Pattern patternFromPatternAssignment(PatternAssignment pa) {
		if(pa instanceof AssignFromPattern) {
			val afp = pa as AssignFromPattern
			return afp.pattern
		}else {
			val afv = pa as AssignFromVariable
			return afv.patternVar.pattern
		}
	}
}