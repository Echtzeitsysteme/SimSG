package biochemsimulation.simulation.matching.democles;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;

class SiteStateContext {
	private SiteNodeContext siteNodeContext;
	
	public final static EDataType SIM_SITE_STATE_CONTAINER_ATTRIBUTE_TYPE = ReactionContainerPackage.Literals.SIM_SITE.getEAttributes().get(1).getEAttributeType();
	public final static EAttribute SIM_SITE_STATE_CONTAINER_ATTRIBUTE = ReactionContainerPackage.Literals.SIM_SITE.getEAttributes().get(1);
	private String uniqueSimSiteStateContainerAttributeName;
	
	public final static EClassifier SIM_SITE_STATE_TYPE = ReactionContainerPackage.Literals.SIM_SITE_STATE;
	
	public final static EDataType TYPE_ATTRIBUTE_TYPE = ReactionContainerPackage.Literals.SIM_SITE_STATE.getEAllAttributes().get(0).getEAttributeType();
	public final static EAttribute TYPE_ATTRIBUTE = ReactionContainerPackage.Literals.SIM_SITE_STATE.getEAllAttributes().get(0);
	private String uniqueTypeAttributeName;
	
	private String stateType;
	
	SiteStateContext(SiteNodeContext siteNodeContext, String stateType) {
		this.siteNodeContext = siteNodeContext;
		uniqueSimSiteStateContainerAttributeName = siteNodeContext.getAgentNodeContext().getAgentVariableName()
				+"_"+siteNodeContext.getLocalSimSiteVariableName()
				+"_"+getSimSiteStateContainerAttributeName();
		uniqueTypeAttributeName = siteNodeContext.getAgentNodeContext().getAgentVariableName()
				+"_"+siteNodeContext.getLocalSimSiteVariableName()
				+"_"+getSimSiteStateTypeAttributeName();
		this.stateType = stateType;
	}
	
	static String getSimSiteStateContainerAttributeName() {
		return SIM_SITE_STATE_CONTAINER_ATTRIBUTE.getName();
	}
	
	static String getSimSiteStateContainerAttributeTypeName() {
		return SIM_SITE_STATE_CONTAINER_ATTRIBUTE_TYPE.getName();
	}
	
	static String getSimSiteStateTypeName() {
		return SIM_SITE_STATE_TYPE.getName();
	}
	
	static String getSimSiteStateTypeAttributeName() {
		return TYPE_ATTRIBUTE.getName();
	}
	
	static String getSimSiteStateTypeAttributeTypeName() {
		return TYPE_ATTRIBUTE_TYPE.getName();
	}

	SiteNodeContext getSiteNodeContext() {
		return siteNodeContext;
	}

	String getUniqueSimSiteStateContainerAttributeName() {
		return uniqueSimSiteStateContainerAttributeName;
	}

	String getUniqueTypeAttributeName() {
		return uniqueTypeAttributeName;
	}

	String getStateType() {
		return stateType;
	}
	
}
