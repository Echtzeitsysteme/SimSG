package org.simsg.core.pm.pattern;

public class SiteNodeContext {
	private AgentNodeContext agentNodeContext;
	
	private String siteTypeName;
	
	public SiteNodeContext(AgentNodeContext agentNodeContext, String siteTypeName) {
		this.agentNodeContext = agentNodeContext;
		this.siteTypeName = siteTypeName;
	}
	
	public String getSiteTypeName() {
		return siteTypeName;
	}

	public AgentNodeContext getAgentNodeContext() {
		return agentNodeContext;
	}	
	
}
