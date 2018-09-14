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

class ViatraCodeGenerator2 {
	public static final String BOUND_ANY_LINK_PATTERN_KEY = "BoundAnyLink_SupportPattern";
	public static final String SITE_TYPE_PATTERN_KEY = "SiteType_SupportPattern";
	public static final String SITE_STATE_PATTERN_KEY = "SiteState_SupportPattern";
	public static final String BOUND_LINK_PATTERN_KEY = "BoundLink_SupportPattern";
	public static final String BOUND_LINK_TYPE_PATTERN_KEY = "BoundLinkType_SupportPattern";
	
	private LinkedHashMap<EPackage, String> importAliases;
	private Map<String, Pattern> rulePatterns;
	private Map<String, GenericPattern> genericPatterns;
	private Map<String, String> supportPatterns;
	
	new(LinkedHashMap<EPackage, String> importAliases, ReactionRuleModel model) {
		this.importAliases = importAliases
		supportPatterns = new HashMap
		
		rulePatterns = PatternUtils.getRulePatterns(model)
		createAnyLinkSupportPattern()
		createSimSiteSupportPattern()
		createSimSiteStateSupportPattern()
		createBoundLinkSupportPattern()
		createBoundLinkTypeSupportPattern()
		generateGenericPatterns()
	}
	
	def createAnyLinkSupportPattern() {
		val pattern = '''pattern «BOUND_ANY_LINK_PATTERN_KEY»(agent : «AgentNodeContext.SIM_AGENT_TYPE.name», type : java String) {
			«AgentNodeContext.SIM_AGENT_TYPE.name».«SiteNodeContext.SIM_SITE_CONTAINER_ATTRIBUTE.name»(agent, site);
			«SiteNodeContext.SIM_SITE_TYPE.name».«SiteNodeContext.TYPE_ATTRIBUTE.name»(site, type);
			«SiteNodeContext.SIM_SITE_TYPE.name».«LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE.name»(site, _);
		}
		'''
		supportPatterns.put(BOUND_ANY_LINK_PATTERN_KEY, pattern)
	}
	
	def createSimSiteSupportPattern() {
		val pattern = '''pattern «SITE_TYPE_PATTERN_KEY»(agent : «AgentNodeContext.SIM_AGENT_TYPE.name», type : java String) {
			«AgentNodeContext.SIM_AGENT_TYPE.name».«SiteNodeContext.SIM_SITE_CONTAINER_ATTRIBUTE.name»(agent, site);
			«SiteNodeContext.SIM_SITE_TYPE.name».«SiteNodeContext.TYPE_ATTRIBUTE.name»(site, type);
		}
		'''
		supportPatterns.put(SITE_TYPE_PATTERN_KEY, pattern)
	}
	
	def createSimSiteStateSupportPattern() {
		val pattern = '''pattern «SITE_STATE_PATTERN_KEY»(agent : «AgentNodeContext.SIM_AGENT_TYPE.name», type : java String, state : java String) {
			«AgentNodeContext.SIM_AGENT_TYPE.name».«SiteNodeContext.SIM_SITE_CONTAINER_ATTRIBUTE.name»(agent, site);
			«SiteNodeContext.SIM_SITE_TYPE.name».«SiteNodeContext.TYPE_ATTRIBUTE.name»(site, type);
			«SiteNodeContext.SIM_SITE_TYPE.name».«SiteStateContext.SIM_SITE_STATE_CONTAINER_ATTRIBUTE.name».«SiteStateContext.TYPE_ATTRIBUTE.name»(site, state);
		}
		'''
		supportPatterns.put(SITE_STATE_PATTERN_KEY, pattern)
	}
	
	def createBoundLinkSupportPattern() {
		val pattern = '''pattern «BOUND_LINK_PATTERN_KEY»(agent : «AgentNodeContext.SIM_AGENT_TYPE.name», type : java String, agent2 : «AgentNodeContext.SIM_AGENT_TYPE.name», type2 : java String) {
			«AgentNodeContext.SIM_AGENT_TYPE.name».«SiteNodeContext.SIM_SITE_CONTAINER_ATTRIBUTE.name»(agent, site);
			«SiteNodeContext.SIM_SITE_TYPE.name».«SiteNodeContext.TYPE_ATTRIBUTE.name»(site, type);
			«AgentNodeContext.SIM_AGENT_TYPE.name».«SiteNodeContext.SIM_SITE_CONTAINER_ATTRIBUTE.name»(agent2, site2);
			«SiteNodeContext.SIM_SITE_TYPE.name».«SiteNodeContext.TYPE_ATTRIBUTE.name»(site2, type2);
			«SiteNodeContext.SIM_SITE_TYPE.name».«LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE.name»(site, link1);
			«SiteNodeContext.SIM_SITE_TYPE.name».«LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE.name»(site2, link2);
			link1==link2;
			agent != agent2;
		}
		'''
		supportPatterns.put(BOUND_LINK_PATTERN_KEY, pattern)
	}
	
	def createBoundLinkTypeSupportPattern() {
		val pattern = '''pattern «BOUND_LINK_TYPE_PATTERN_KEY»(agent : «AgentNodeContext.SIM_AGENT_TYPE.name», type : java String, agent2type : java String, type2 : java String) {
			«AgentNodeContext.SIM_AGENT_TYPE.name».«SiteNodeContext.SIM_SITE_CONTAINER_ATTRIBUTE.name»(agent, site);
			«SiteNodeContext.SIM_SITE_TYPE.name».«SiteNodeContext.TYPE_ATTRIBUTE.name»(site, type);
			«AgentNodeContext.SIM_AGENT_TYPE.name».«AgentNodeContext.TYPE_ATTRIBUTE.name»(agent2, agent2type);
			«AgentNodeContext.SIM_AGENT_TYPE.name».«SiteNodeContext.SIM_SITE_CONTAINER_ATTRIBUTE.name»(agent2, site2);
			«SiteNodeContext.SIM_SITE_TYPE.name».«SiteNodeContext.TYPE_ATTRIBUTE.name»(site2, type2);
			«SiteNodeContext.SIM_SITE_TYPE.name».«LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE.name»(site, link1);
			«SiteNodeContext.SIM_SITE_TYPE.name».«LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE.name»(site2, link2);
			link1==link2;
			agent != agent2;
		}
		'''
		supportPatterns.put(BOUND_LINK_TYPE_PATTERN_KEY, pattern)
	}
	
	def generateGenericPatterns() {
		genericPatterns = new HashMap
		rulePatterns.forEach([name, pattern | 
			val gPattern = new GenericPattern(name, pattern)
			if(!gPattern.isVoidPattern) {
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
					AgentNodeContext.SIM_AGENT_TYPE.name».«AgentNodeContext.TYPE_ATTRIBUTE.name»(«agentNode.agentVariableName», "«agentNode.agentType»");
					«FOR siteNode : genericPattern.body.siteNodeContexts.get(agentNode) SEPARATOR "\n"»
					find «SITE_TYPE_PATTERN_KEY»(«agentNode.agentVariableName», "«siteNode.siteType»");
					«siteStateConstraint(genericPattern, siteNode)»
					«trivialLinkStateConstraints(genericPattern, siteNode)»
					«ENDFOR»
					«ENDFOR»
					«FOR constraint : genericPattern.body.linkStateConstraints.values SEPARATOR "\n"»
					«complexLinkStateConstraint(constraint)»
					«ENDFOR»
					«FOR constraint : genericPattern.body.injectivityConstraints SEPARATOR "\n"»
					«ENDFOR»
				}
			«ENDFOR»
		'''
	}
	
	def String siteStateConstraint(GenericPattern genericPattern, SiteNodeContext siteNode) {
		if(genericPattern.body.siteStateContexts.containsKey(siteNode)) {
			return '''find «SITE_STATE_PATTERN_KEY»(«siteNode.agentNodeContext.agentVariableName», "«siteNode.siteType»", "«genericPattern.body.siteStateContexts.get(siteNode).stateType»");
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
		return '''find «BOUND_LINK_PATTERN_KEY»(«constraint.operand1.siteNodeContext.agentNodeContext.agentVariableName», "«constraint.operand1.siteNodeContext.siteType»", «
		constraint.operand2.siteNodeContext.agentNodeContext.agentVariableName», "«constraint.operand2.siteNodeContext.siteType»");
		'''
	}
	
	def String boundToTypeConstraint(LinkStateConstraint constraint) {
		return '''find «BOUND_LINK_TYPE_PATTERN_KEY»(«constraint.operand1.siteNodeContext.agentNodeContext.agentVariableName», "«constraint.operand1.siteNodeContext.siteType»", "«
		constraint.operand2.siteNodeContext.agentNodeContext.agentType»", "«constraint.operand2.siteNodeContext.siteType»");
		'''
	}
	
	def String unboundConstraint(SiteNodeContext siteNode) {
		return '''neg find «BOUND_ANY_LINK_PATTERN_KEY»(«siteNode.agentNodeContext.agentVariableName», "«siteNode.siteType»");
		'''
	}
	
	def String boundAnyConstraint(SiteNodeContext siteNode) {
		return '''find «BOUND_ANY_LINK_PATTERN_KEY»(«siteNode.agentNodeContext.agentVariableName», "«siteNode.siteType»");
		'''
	}
	
}