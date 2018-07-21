package biochemsimulation.simulation.matching.democles;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;

class LinkStateContext {
	private SiteNodeContext siteNodeContext;
	
	public final static EClassifier SIM_LINK_STATE_CONTAINER_ATTRIBUTE_TYPE = ReactionContainerPackage.Literals.SIM_SITE.getEAllReferences().get(2).getEType();
	public final static EReference SIM_LINK_STATE_CONTAINER_ATTRIBUTE = ReactionContainerPackage.Literals.SIM_SITE.getEAllReferences().get(2);
	private String uniqueSimLinkStateContainerAttributeName;
	
	public final static EClassifier SIM_LINK_STATE_TYPE = ReactionContainerPackage.Literals.SIM_LINK_STATE;
	private String localSimLinkStateVariableName;
	
	private LinkStateType stateType;
	
	LinkStateContext(SiteNodeContext siteNodeContext, LinkStateType stateType) {
		this.siteNodeContext = siteNodeContext;
		this.stateType = stateType;
		
		uniqueSimLinkStateContainerAttributeName =  siteNodeContext.getAgentNodeContext().getAgentVariableName()
				+"_"+siteNodeContext.getLocalSimSiteVariableName()
				+"_"+getSimLinkStateContainerAttributeName();
		localSimLinkStateVariableName = siteNodeContext.getAgentNodeContext().getAgentVariableName()
				+"_"+siteNodeContext.getLocalSimSiteVariableName()
				+"_"+stateType.toString();
	}
	
	static String getSimLinkStateContainerAttributeName() {
		return SIM_LINK_STATE_CONTAINER_ATTRIBUTE.getName();
	}
	
	static String getSimLinkStateContainerAttributeTypeName() {
		return SIM_LINK_STATE_CONTAINER_ATTRIBUTE_TYPE.getName();
	}
	
	static String getSimLinkStateTypeName() {
		return SIM_LINK_STATE_TYPE.getName();
	}

	SiteNodeContext getSiteNodeContext() {
		return siteNodeContext;
	}

	String getUniqueSimLinkStateContainerAttributeName() {
		return uniqueSimLinkStateContainerAttributeName;
	}

	String getLocalSimLinkStateVariableName() {
		return localSimLinkStateVariableName;
	}

	LinkStateType getStateType() {
		return stateType;
	}
	
}
