package biochemsimulation.simulation.matching.viatra

import java.util.LinkedHashMap
import org.eclipse.emf.ecore.EPackage
import biochemsimulation.reactionrules.reactionRules.Pattern
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel
import java.util.Map
import java.util.HashMap

import biochemsimulation.simulation.matching.patterns.AgentNodeContext;
import biochemsimulation.simulation.matching.patterns.SiteNodeContext;
import biochemsimulation.simulation.matching.patterns.LinkStateContext;
import biochemsimulation.reactionrules.utils.PatternUtils
import biochemsimulation.simulation.matching.patterns.GenericPattern
import biochemsimulation.simulation.matching.patterns.LinkStateType
import biochemsimulation.simulation.matching.patterns.SiteStateContext
import biochemsimulation.simulation.matching.patterns.LinkStateConstraint

class ViatraCodeGenerator {
	public static final String BOUND_ANY_LINK_PATTERN_KEY = "BoundAnyLink_SupportPattern";
	
	LinkedHashMap<EPackage, String> importAliases;
	Map<String, Pattern> rulePatterns;
	Map<String, GenericPattern> genericPatterns;
	Map<String, String> supportPatterns;
	
	new(LinkedHashMap<EPackage, String> importAliases, ReactionRuleModel model) {
		this.importAliases = importAliases
		supportPatterns = new HashMap
		
		rulePatterns = PatternUtils.getRulePatterns(model)
		createAnyLinkSupportPattern()
		generateGenericPatterns()
	}
	
	new(LinkedHashMap<EPackage, String> importAliases, Map<String, GenericPattern> genericPatterns) {
		this.importAliases = importAliases
		supportPatterns = new HashMap
		
		createAnyLinkSupportPattern()
		this.genericPatterns = new HashMap
		genericPatterns.forEach([name, pattern | 
			if(!pattern.voidPattern) {
				this.genericPatterns.put(name, pattern)
			}
		])
	}
	
	def createAnyLinkSupportPattern() {
		val pattern = '''pattern «BOUND_ANY_LINK_PATTERN_KEY»(simSite : «SiteNodeContext.SIM_SITE_TYPE.name») {
			«SiteNodeContext.SIM_SITE_TYPE.name».«LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE.name»(simSite, _);
		}
		'''
		supportPatterns.put(BOUND_ANY_LINK_PATTERN_KEY, pattern)
	}
	
	def generateGenericPatterns() {
		genericPatterns = new HashMap
		rulePatterns.forEach([name, pattern | 
			val gPattern = new GenericPattern(name, pattern)
			if(!gPattern.voidPattern) {
				genericPatterns.put(name, new GenericPattern(name, pattern))
			}
		])
	}
	
	def generatePatternCode() {
		return '''
			package biochemsimulation.viatrapatterns.generator
					
			«FOR p : importAliases.keySet»
				import "«p.nsURI»" as «importAliases.get(p)»
			«ENDFOR»
			
			«FOR supportPattern : supportPatterns.values SEPARATOR "\n"»
				«supportPattern»
			«ENDFOR»
			
			«FOR genericPattern : genericPatterns.values SEPARATOR "\n"»
				pattern «genericPattern.name»(«FOR node : genericPattern.signature.signature.keySet SEPARATOR ", "» «node» : «AgentNodeContext.SIM_AGENT_TYPE.name»«ENDFOR») {
					«FOR agentNode : genericPattern.body.agentNodeContexts.values SEPARATOR "\n"»«
					AgentNodeContext.SIM_AGENT_TYPE.name».«AgentNodeContext.TYPE_ATTRIBUTE.name»(«agentNode.agentVariableName», "«agentNode.agentType»");«
					IF(genericPattern.body.siteNodeContexts.get(agentNode) !== null)»
					«FOR siteNode : genericPattern.body.siteNodeContexts.get(agentNode) SEPARATOR "\n"»«
					AgentNodeContext.SIM_AGENT_TYPE.name».«SiteNodeContext.SIM_SITE_CONTAINER_ATTRIBUTE.name»(«agentNode.agentVariableName», «siteNode.localSimSiteVariableName»);
					«SiteNodeContext.SIM_SITE_TYPE.name».«SiteNodeContext.TYPE_ATTRIBUTE.name»(«siteNode.localSimSiteVariableName», "«siteNode.siteType»");
					«siteStateConstraint(genericPattern, siteNode)»
					«trivialLinkStateConstraints(genericPattern, siteNode)»
					«ENDFOR»
					«ENDIF»
					«ENDFOR»
					«FOR constraint : genericPattern.body.linkStateConstraints.values SEPARATOR "\n"»
					«complexLinkStateConstraint(constraint)»
					«ENDFOR»
					«FOR constraint : genericPattern.body.injectivityConstraints SEPARATOR "\n"»«
					constraint.operand1.agentVariableName»!=«constraint.operand2.agentVariableName»;
					«ENDFOR»
				}
			«ENDFOR»
		'''
	}
	
	def String siteStateConstraint(GenericPattern genericPattern, SiteNodeContext siteNode) {
		if(genericPattern.body.siteStateContexts.containsKey(siteNode)) {
			return '''«SiteNodeContext.SIM_SITE_TYPE.name».«SiteStateContext.SIM_SITE_STATE_CONTAINER_ATTRIBUTE.name».«
						SiteStateContext.TYPE_ATTRIBUTE.name»(«siteNode.localSimSiteVariableName», "«
							 genericPattern.body.siteStateContexts.get(siteNode).stateType»");
			'''			
		}
		return "";
		
	}
	
	def String trivialLinkStateConstraints(GenericPattern genericPattern, SiteNodeContext siteNode) {
		if(genericPattern.body.getLinkStateContexts.containsKey(siteNode)) {
			val link = genericPattern.body.getLinkStateContexts.get(siteNode)
			if(link.stateType == LinkStateType.Unbound) {
				return unboundConstraint(siteNode)
			} else if (link.stateType == LinkStateType.BoundAny) {
				return boundAnyConstraint(siteNode)
			} else {
				return ""
			}
		}
		return ""
	}
	
	def String complexLinkStateConstraint(LinkStateConstraint constraint) {
		if(constraint.operand1.stateType == LinkStateType.Bound) {
			return boundConstraint(constraint)
		} else if (constraint.operand1.stateType == LinkStateType.BoundAnyOfType) {
			return boundToTypeConstraint(constraint)
		} else {
			return ""
		}
					
	}
	
	def String boundConstraint(LinkStateConstraint constraint) {
		return '''«SiteNodeContext.SIM_SITE_TYPE.name».«LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE.name»(«
		constraint.operand1.siteNodeContext.localSimSiteVariableName», «
		constraint.operand1.localSimLinkStateVariableName»);
		«SiteNodeContext.SIM_SITE_TYPE.name».«LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE.name»(«
		constraint.operand2.siteNodeContext.localSimSiteVariableName», «
		constraint.operand2.localSimLinkStateVariableName»);
		«constraint.operand1.localSimLinkStateVariableName»==«constraint.operand2.localSimLinkStateVariableName»;
		'''
	}
	
	def String boundToTypeConstraint(LinkStateConstraint constraint) {
		return '''«SiteNodeContext.SIM_SITE_TYPE.name».«LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE.name»(«
		constraint.operand1.siteNodeContext.localSimSiteVariableName», «
		constraint.operand1.localSimLinkStateVariableName»);
		«AgentNodeContext.SIM_AGENT_TYPE.name».«AgentNodeContext.TYPE_ATTRIBUTE.name»(«
		constraint.operand2.siteNodeContext.agentNodeContext.agentVariableName», "«
		constraint.operand2.siteNodeContext.agentNodeContext.agentType»");
		«AgentNodeContext.SIM_AGENT_TYPE.name».«SiteNodeContext.SIM_SITE_CONTAINER_ATTRIBUTE.name»(«
		constraint.operand2.siteNodeContext.agentNodeContext.agentVariableName», «
		constraint.operand2.siteNodeContext.localSimSiteVariableName»);
		«SiteNodeContext.SIM_SITE_TYPE.name».«SiteNodeContext.TYPE_ATTRIBUTE.name»(«
		constraint.operand2.siteNodeContext.localSimSiteVariableName», "«
		constraint.operand2.siteNodeContext.siteType»");
		«SiteNodeContext.SIM_SITE_TYPE.name».«LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE.name»(«
		constraint.operand2.siteNodeContext.localSimSiteVariableName», «
		constraint.operand2.localSimLinkStateVariableName»);
		«constraint.operand1.localSimLinkStateVariableName»==«constraint.operand2.localSimLinkStateVariableName»;
		'''
	}
	
	def String unboundConstraint(SiteNodeContext siteNode) {
		return '''neg find «BOUND_ANY_LINK_PATTERN_KEY»(«siteNode.localSimSiteVariableName»);
		'''
	}
	
	def String boundAnyConstraint(SiteNodeContext siteNode) {
		return '''find «BOUND_ANY_LINK_PATTERN_KEY»(«siteNode.localSimSiteVariableName»);
		'''
	}
	
}