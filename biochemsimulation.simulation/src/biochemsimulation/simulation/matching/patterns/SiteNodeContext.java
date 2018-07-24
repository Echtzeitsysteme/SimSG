package biochemsimulation.simulation.matching.patterns;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;

public class SiteNodeContext {
	private AgentNodeContext agentNodeContext;
	
	public final static EClassifier SIM_SITE_CONTAINER_ATTRIBUTE_TYPE = ReactionContainerPackage.Literals.SIM_AGENT.getEAllContainments().get(0).getEType();
	public final static EReference SIM_SITE_CONTAINER_ATTRIBUTE = ReactionContainerPackage.Literals.SIM_AGENT.getEAllContainments().get(0);
	private String uniqueSimSiteContainerAttributeName;
	
	private String localSimSiteVariableName;
	
	public final static EClassifier SIM_SITE_TYPE = ReactionContainerPackage.Literals.SIM_SITE;
	
	public final static EDataType TYPE_ATTRIBUTE_TYPE = ReactionContainerPackage.Literals.SIM_SITE.getEAttributes().get(0).getEAttributeType();
	public final static EAttribute TYPE_ATTRIBUTE = ReactionContainerPackage.Literals.SIM_SITE.getEAttributes().get(0);
	private String uniqueTypeAttributeName;
	
	private String siteType;
	
	public SiteNodeContext(AgentNodeContext agentNodeContext, String siteType) {
		this.agentNodeContext = agentNodeContext;
		uniqueSimSiteContainerAttributeName = agentNodeContext.getAgentVariableName()+"_"+getSimSiteContainerAttributeName();
		localSimSiteVariableName = agentNodeContext.getAgentVariableName()+"_"+siteType;
		uniqueTypeAttributeName = agentNodeContext.getAgentVariableName()+"_"+siteType+"_"+getTypeAttributeName();
		this.siteType = siteType;
	}
	
	public static String getSimSiteTypeName() {
		return SIM_SITE_TYPE.getName();
	}
	
	public static String getSimSiteContainerAttributeName() {
		return SIM_SITE_CONTAINER_ATTRIBUTE.getName();
	}
	
	public static String getSimSiteContainerAttributeTypeName() {
		return SIM_SITE_CONTAINER_ATTRIBUTE_TYPE.getName();
	}
	
	public static String getTypeAttributeName() {
		return TYPE_ATTRIBUTE.getName();
	}
	
	public static String getTypeAttributeTypeName() {
		return TYPE_ATTRIBUTE_TYPE.getName();
	}

	public AgentNodeContext getAgentNodeContext() {
		return agentNodeContext;
	}

	public String getUniqueSimSiteContainerAttributeName() {
		return uniqueSimSiteContainerAttributeName;
	}

	public String getLocalSimSiteVariableName() {
		return localSimSiteVariableName;
	}

	public String getUniqueTypeAttributeName() {
		return uniqueTypeAttributeName;
	}

	public String getSiteType() {
		return siteType;
	}
	
	
}
