package biochemsimulation.viatrapatterns.generator;

import java.util.Arrays;
import java.util.Map;

import biochemsimulation.reactionrules.reactionRules.BoundAnyLink;
import biochemsimulation.reactionrules.reactionRules.BoundAnyOfTypeLink;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.SiteState;

public class SitePatternViatraTemplate {
	
	final public static String SEPARATOR_VARIABLE_NAMES = "_";
	final public static String SUFFIX_LINK_STATE_VARIABLE = "LS";
	final public static String ATTR_SIMSITES = "simSites";
	final public static String ATTR_SIMSITESTATE = "simSiteState";
	final public static String ATTR_SIMLINKSTATE = "simLinkState";
	final public static String TYPE_SIMSITE = "SimSite";
	final public static String OP_NEGATION = "neg";
	final public static String OP_FIND = "find";
	final public static String OP_WILDCARD = "_";
	final public static String OP_EQUALITY = "==";

	private String simAgentVariableName;
	private Map<String, String> siteReferences;
	
	private String siteName;
	private SiteState siteState;
	private LinkState linkState;
	
	private String simSiteVariableName;
	private String simLinkVariableName;
	private boolean hasSiteState;
	private boolean hasLinkState;
	
	private String simSiteContext;
	private String siteTypeContext;
	private String simSiteStateConstraint;
	private String linkStateConstraint;
	
	public SitePatternViatraTemplate(SitePattern sitePattern, String simAgentVariableName, Map<String, String> siteReferences) {
		siteName = sitePattern.getSite().getName();
		siteState = sitePattern.getState();
		linkState = sitePattern.getLinkState().getLinkState();
		this.simAgentVariableName = simAgentVariableName;
		this.siteReferences = siteReferences;
		initVariabelNames();
		buildSimSiteContext();
		buildSiteTypeContext();
		buildSiteStateConstraint();
		buildLinkStateConstraint();
	}
	
	private void initVariabelNames() {
		simSiteVariableName = simAgentVariableName + SEPARATOR_VARIABLE_NAMES + siteName;
		simLinkVariableName = simSiteVariableName + SEPARATOR_VARIABLE_NAMES + SUFFIX_LINK_STATE_VARIABLE;
	}
	
	private void buildSimSiteContext() {
		simSiteContext = PatternViatraTemplate.TYPE_SIMAGENT + AgentPatternViatraTemplate.OP_REFERENCE + ATTR_SIMSITES +
				"(" + simAgentVariableName + ", " + simSiteVariableName + ")" + 
				PatternViatraTemplate.DELIMITER;
	}
	
	private void buildSiteTypeContext() {
		siteTypeContext = TYPE_SIMSITE + AgentPatternViatraTemplate.OP_REFERENCE + AgentPatternViatraTemplate.ATTR_TYPE +
				"(" + simSiteVariableName + ", " + AgentPatternViatraTemplate.OP_STRING + siteName + AgentPatternViatraTemplate.OP_STRING + ")" + 
				PatternViatraTemplate.DELIMITER;
	}
	
	private void buildSiteStateConstraint() {
		if(siteState == null) {
			hasSiteState = false;
			return;
		}
		hasSiteState = true;
		simSiteStateConstraint = TYPE_SIMSITE + AgentPatternViatraTemplate.OP_REFERENCE + ATTR_SIMSITESTATE + AgentPatternViatraTemplate.OP_REFERENCE + AgentPatternViatraTemplate.ATTR_TYPE +
				"(" + simSiteVariableName + ", " + AgentPatternViatraTemplate.OP_STRING + siteState.getState().getName() + AgentPatternViatraTemplate.OP_STRING + ")" + 
				PatternViatraTemplate.DELIMITER;
	}
	
	private void buildLinkStateConstraint() {
		hasLinkState = true;
		if(linkState instanceof FreeLink) {
			linkStateConstraint = OP_NEGATION + " " + OP_FIND + " " +
					SupportPatterns.getInstance().getSupportPatternCall(SupportPatterns.PATTERN_SIMLINKSTATE, Arrays.asList(simSiteVariableName), false) +
					PatternViatraTemplate.DELIMITER;
		}else if(linkState instanceof BoundAnyLink) {
			linkStateConstraint = TYPE_SIMSITE + AgentPatternViatraTemplate.OP_REFERENCE + ATTR_SIMLINKSTATE +
					"(" + simSiteVariableName + ", " + OP_WILDCARD +")"+ 
					PatternViatraTemplate.DELIMITER;
		}else if(linkState instanceof BoundAnyOfTypeLink) {
			BoundAnyOfTypeLink anyLink = (BoundAnyOfTypeLink)linkState;
			String anyLinkAgentName = anyLink.getLinkAgent().getAgent().getName();
			String anyLinkSiteName = anyLink.getLinkSite().getSite().getName();
			StringBuilder sb = new StringBuilder();
			sb.append(TYPE_SIMSITE + AgentPatternViatraTemplate.OP_REFERENCE + ATTR_SIMLINKSTATE +
					"(" + simSiteVariableName + ", " + simLinkVariableName +")" + 
					PatternViatraTemplate.DELIMITER+"\n");
			// comment for debugging purposes
			sb.append("// Create context for other SimAgent:\n");
			sb.append(PatternViatraTemplate.TYPE_SIMAGENT + AgentPatternViatraTemplate.OP_REFERENCE + AgentPatternViatraTemplate.ATTR_TYPE + 
					"(" + simAgentVariableName + SEPARATOR_VARIABLE_NAMES + anyLinkAgentName + ", " +
					AgentPatternViatraTemplate.OP_STRING + anyLinkAgentName + AgentPatternViatraTemplate.OP_STRING + ")" + 
					PatternViatraTemplate.DELIMITER+"\n");
			sb.append(PatternViatraTemplate.TYPE_SIMAGENT + AgentPatternViatraTemplate.OP_REFERENCE + ATTR_SIMSITES + 
					"(" + simAgentVariableName + SEPARATOR_VARIABLE_NAMES + anyLinkAgentName + ", " +
					simAgentVariableName + SEPARATOR_VARIABLE_NAMES + anyLinkAgentName + SEPARATOR_VARIABLE_NAMES + anyLinkSiteName + ")" + 
					PatternViatraTemplate.DELIMITER+"\n");
			sb.append(TYPE_SIMSITE + AgentPatternViatraTemplate.OP_REFERENCE + AgentPatternViatraTemplate.ATTR_TYPE + 
					"(" + simAgentVariableName + SEPARATOR_VARIABLE_NAMES + anyLinkAgentName + SEPARATOR_VARIABLE_NAMES + anyLinkSiteName + ", " +
					AgentPatternViatraTemplate.OP_STRING + anyLinkSiteName + AgentPatternViatraTemplate.OP_STRING + ")" +
					PatternViatraTemplate.DELIMITER+"\n");
			sb.append(TYPE_SIMSITE + AgentPatternViatraTemplate.OP_REFERENCE + ATTR_SIMLINKSTATE + 
					"(" + simAgentVariableName + SEPARATOR_VARIABLE_NAMES + anyLinkAgentName + SEPARATOR_VARIABLE_NAMES + anyLinkSiteName + ", " +
					simAgentVariableName + SEPARATOR_VARIABLE_NAMES + anyLinkAgentName + SEPARATOR_VARIABLE_NAMES + anyLinkAgentName + SUFFIX_LINK_STATE_VARIABLE + ")" +
					PatternViatraTemplate.DELIMITER+"\n");
			sb.append(simLinkVariableName + OP_EQUALITY + 
					simAgentVariableName + SEPARATOR_VARIABLE_NAMES + anyLinkAgentName + SEPARATOR_VARIABLE_NAMES + anyLinkAgentName + SUFFIX_LINK_STATE_VARIABLE + 
					PatternViatraTemplate.DELIMITER);
			linkStateConstraint = sb.toString();
		}else if(linkState instanceof BoundLink) {
			BoundLink bLink = (BoundLink) linkState;
			StringBuilder sb = new StringBuilder();
			sb.append(TYPE_SIMSITE + AgentPatternViatraTemplate.OP_REFERENCE + ATTR_SIMLINKSTATE +
					"(" + simSiteVariableName + ", " + simLinkVariableName +")" + 
					PatternViatraTemplate.DELIMITER+"\n");
			String otherSimLinkVariableName = siteReferences.get(bLink.getState());
			if(!otherSimLinkVariableName.equals(simLinkVariableName)) {
				sb.append(simLinkVariableName + OP_EQUALITY + otherSimLinkVariableName +
						PatternViatraTemplate.DELIMITER);
			}
			linkStateConstraint = sb.toString();
		}else {
			hasLinkState = false;
		}
	}

	public String getSiteContext() {
		return simSiteContext;
	}

	public String getSiteTypeContext() {
		return siteTypeContext;
	}

	public boolean hasSiteState() {
		return hasSiteState;
	}

	public String getSiteStateConstraint() {
		return simSiteStateConstraint;
	}

	public boolean hasLinkState() {
		return hasLinkState;
	}

	public String getLinkStateConstraint() {
		return linkStateConstraint;
	}
}
