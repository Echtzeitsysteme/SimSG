package biochemsimulation.simulation.matching.democles;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;

class SiteNodeContext {
	private AgentNodeContext agentNodeContext;
	
	public final static EDataType SIM_SITE_CONTAINER_ATTRIBUTE_TYPE = ReactionContainerPackage.Literals.SIM_AGENT.getEAttributes().get(2).getEAttributeType();
	public final static EAttribute SIM_SITE_CONTAINER_ATTRIBUTE = ReactionContainerPackage.Literals.SIM_AGENT.getEAttributes().get(2);
	private String uniqueSimSiteContainerAttributeName;
	
	private String localSimSiteVariableName;
	
	public final static EClassifier SIM_SITE_TYPE = ReactionContainerPackage.Literals.SIM_SITE;
	
	public final static EDataType TYPE_ATTRIBUTE_TYPE = ReactionContainerPackage.Literals.SIM_SITE.getEAttributes().get(0).getEAttributeType();
	public final static EAttribute TYPE_ATTRIBUTE = ReactionContainerPackage.Literals.SIM_SITE.getEAttributes().get(0);
	private String uniqueTypeAttributeName;
	
	private String siteType;
	
	SiteNodeContext(AgentNodeContext agentNodeContext, String siteType) {
		this.agentNodeContext = agentNodeContext;
		uniqueSimSiteContainerAttributeName = agentNodeContext.getAgentVariableName()+"_"+getSimSiteContainerAttributeName();
		localSimSiteVariableName = agentNodeContext.getAgentVariableName()+"_"+siteType;
		uniqueTypeAttributeName = agentNodeContext.getAgentVariableName()+"_"+siteType+"_"+getTypeAttributeName();
		this.siteType = siteType;
	}
	
	static String getSimSiteTypeName() {
		return SIM_SITE_TYPE.getName();
	}
	
	static String getSimSiteContainerAttributeName() {
		return SIM_SITE_CONTAINER_ATTRIBUTE.getName();
	}
	
	static String getSimSiteContainerAttributeTypeName() {
		return SIM_SITE_CONTAINER_ATTRIBUTE_TYPE.getName();
	}
	
	static String getTypeAttributeName() {
		return TYPE_ATTRIBUTE.getName();
	}
	
	static String getTypeAttributeTypeName() {
		return TYPE_ATTRIBUTE_TYPE.getName();
	}

	AgentNodeContext getAgentNodeContext() {
		return agentNodeContext;
	}

	String getUniqueSimSiteContainerAttributeName() {
		return uniqueSimSiteContainerAttributeName;
	}

	String getLocalSimSiteVariableName() {
		return localSimSiteVariableName;
	}

	String getUniqueTypeAttributeName() {
		return uniqueTypeAttributeName;
	}

	String getSiteType() {
		return siteType;
	}
	
	
}
