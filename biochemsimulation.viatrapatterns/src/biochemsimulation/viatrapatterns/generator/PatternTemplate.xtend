package biochemsimulation.viatrapatterns.generator

import java.util.LinkedHashMap
import org.eclipse.emf.ecore.EPackage
import biochemsimulation.reactionrules.reactionRules.Pattern
import biochemsimulation.reactionrules.reactionRules.Rule
import biochemsimulation.reactionrules.reactionRules.PatternAssignment
import biochemsimulation.reactionrules.reactionRules.AssignFromPattern
import biochemsimulation.reactionrules.reactionRules.AssignFromVariable
import java.util.LinkedList
import java.util.List
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel

class PatternTemplate {
	
	private LinkedHashMap<EPackage, String> importAliases;
	private List<Rule> rules;
	private List<PatternViatraTemplate> patternTemplates;
	
	new(LinkedHashMap<EPackage, String> importAliases, ReactionRuleModel model) {
		this.importAliases = importAliases;
		this.rules = new LinkedList<Rule>();
		model.reactionProperties.filter[x | x instanceof Rule].forEach[x | rules.add(x as Rule)]
		initSupportPatterns()
		initPatternTemplates()
	}
	
	def initSupportPatterns() {
		val sPatterns = SupportPatterns.instance
		val sPattern = new SupportPatternTemplate(SupportPatterns.PATTERN_SIMLINKSTATE)
		sPattern.addArgument("ss", SitePatternViatraTemplate.TYPE_SIMSITE)
		val ref = SitePatternViatraTemplate.TYPE_SIMSITE + AgentPatternViatraTemplate.OP_REFERENCE + SitePatternViatraTemplate.ATTR_SIMLINKSTATE
		sPattern.addConstraint(ref, "ss", SitePatternViatraTemplate.OP_WILDCARD)
		sPattern.updateSupportPattern
		sPatterns.insertSupportPatternTemplate(sPattern)
	}
	
	def initPatternTemplates() {
		patternTemplates = new LinkedList<PatternViatraTemplate>()
		rules.forEach[x | 
			patternTemplates.add(new PatternViatraTemplate(x.name+"_rhs", patternFromPatternAssignment(x.rule.rhs))) 
			patternTemplates.add(new PatternViatraTemplate(x.name+"_lhs", patternFromPatternAssignment(x.rule.lhs)))
		]
		patternTemplates = patternTemplates.filter[x | !x.isVoidPattern].toList
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
	
	def generatePatternCode() {
		return '''
			package biochemsimulation.viatrapatterns.generator
					
			«FOR p : importAliases.keySet»
				import "«p.nsURI»" as «importAliases.get(p)»
			«ENDFOR»
			
			«FOR supPattern : SupportPatterns.instance.allSupportPatterns SEPARATOR "\n"»
				«supPattern.getSupportPattern(false)»
			«ENDFOR»
			
			«FOR pT : patternTemplates SEPARATOR "\n"»
				pattern «pT.patternName»(«FOR arg : pT.patternArgumentList SEPARATOR ", "» «arg»«ENDFOR») {
					«FOR body : pT.patternBody SEPARATOR "\n"» «body»«ENDFOR»
					«FOR injConst : pT.injectivityConstraints SEPARATOR "\n"» «injConst»«ENDFOR»
				}
			«ENDFOR»
		'''
	}
	
}
