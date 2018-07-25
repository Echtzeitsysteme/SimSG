package biochemsimulation.simulation.matching.viatra;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;

public class AgentPatternViatraTemplate {
	
	final public static String ATTR_TYPE = "Type";
	final public static String OP_REFERENCE = ".";
	final public static String OP_STRING = "\"";
	
	private ValidAgentPattern agentPattern;
	private String variableName;
	private Map<String, String> siteReferences;
	
	private List<SitePatternViatraTemplate> sitePatternTemplate;
	
	private String simAgentTypeCheck;
	private List<String> simSiteChecks;
	
	public AgentPatternViatraTemplate(ValidAgentPattern agentPattern, String variableName, Map<String, String> siteReferences) {
		this.agentPattern = agentPattern;
		this.variableName = variableName;
		this.siteReferences = siteReferences;
		initSitePatternTemplates();
		buildSimAgentTypeCheck();
		buildSimSiteChecks();
	}
	
	private void initSitePatternTemplates() {
		sitePatternTemplate = new LinkedList<SitePatternViatraTemplate>();
		for(SitePattern sp : agentPattern.getSitePatterns().getSitePatterns()) {
			sitePatternTemplate.add(new SitePatternViatraTemplate(sp, variableName, siteReferences));
		}
	}
	
	public String getSimAgentTypeCheck() {
		return simAgentTypeCheck;
	}
	
	public List<String> getSimSiteChecks() {
		return simSiteChecks;
	}
	
	private void buildSimAgentTypeCheck() {
		simAgentTypeCheck = PatternViatraTemplate.TYPE_SIMAGENT + OP_REFERENCE + ATTR_TYPE + "(" + variableName + ", " 
				+ OP_STRING +agentPattern.getAgent().getName() + OP_STRING + ")" + 
				PatternViatraTemplate.DELIMITER;
	}
	
	private void buildSimSiteChecks() {
		simSiteChecks = new LinkedList<String>();
		StringBuilder sb = new StringBuilder();
		for(SitePatternViatraTemplate spTemplate : sitePatternTemplate) {
			sb.append(spTemplate.getSiteContext()+"\n");
			sb.append(spTemplate.getSiteTypeContext() + "\n");
			if(spTemplate.hasSiteState()) {
				sb.append(spTemplate.getSiteStateConstraint() + "\n");
			}
			if(spTemplate.hasLinkState()) {
				sb.append(spTemplate.getLinkStateConstraint());
			}
			simSiteChecks.add(sb.toString());
		}
	}
}
