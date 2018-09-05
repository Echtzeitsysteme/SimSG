package biochemsimulation.simulation.matching.patterns;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;

public class LinkStateContext {
	private SiteNodeContext siteNodeContext;
	
	public final static EClassifier SIM_LINK_STATE_CONTAINER_ATTRIBUTE_TYPE = ReactionContainerPackage.Literals.SIM_SITE.getEAllReferences().get(1).getEType();
	public final static EReference SIM_LINK_STATE_CONTAINER_ATTRIBUTE = ReactionContainerPackage.Literals.SIM_SITE.getEAllReferences().get(1);
	private String uniqueSimLinkStateContainerAttributeName;
	
	public final static EClassifier SIM_LINK_STATE_TYPE = ReactionContainerPackage.Literals.SIM_LINK_STATE;
	private String localSimLinkStateVariableName;
	
	private LinkStateType stateType;
	
	public LinkStateContext(SiteNodeContext siteNodeContext, LinkStateType stateType) {
		this.siteNodeContext = siteNodeContext;
		this.stateType = stateType;
		
		uniqueSimLinkStateContainerAttributeName =  siteNodeContext.getAgentNodeContext().getAgentVariableName()
				+"_"+siteNodeContext.getLocalSimSiteVariableName()
				+"_"+getSimLinkStateContainerAttributeName();
		localSimLinkStateVariableName = siteNodeContext.getAgentNodeContext().getAgentVariableName()
				+"_"+siteNodeContext.getLocalSimSiteVariableName()
				+"_"+stateType.toString();
	}
	
	public static String getSimLinkStateContainerAttributeName() {
		return SIM_LINK_STATE_CONTAINER_ATTRIBUTE.getName();
	}
	
	public static String getSimLinkStateContainerAttributeTypeName() {
		return SIM_LINK_STATE_CONTAINER_ATTRIBUTE_TYPE.getName();
	}
	
	public static String getSimLinkStateTypeName() {
		return SIM_LINK_STATE_TYPE.getName();
	}

	public SiteNodeContext getSiteNodeContext() {
		return siteNodeContext;
	}

	public String getUniqueSimLinkStateContainerAttributeName() {
		return uniqueSimLinkStateContainerAttributeName;
	}

	public String getLocalSimLinkStateVariableName() {
		return localSimLinkStateVariableName;
	}

	public LinkStateType getStateType() {
		return stateType;
	}
	
}
