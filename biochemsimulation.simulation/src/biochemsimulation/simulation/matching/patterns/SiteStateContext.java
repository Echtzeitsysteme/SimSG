package biochemsimulation.simulation.matching.patterns;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;

public class SiteStateContext {
	private SiteNodeContext siteNodeContext;
	
	public final static EClassifier SIM_SITE_STATE_CONTAINER_ATTRIBUTE_TYPE = ReactionContainerPackage.Literals.SIM_SITE.getEAllContainments().get(0).getEType();
	public final static EReference SIM_SITE_STATE_CONTAINER_ATTRIBUTE = ReactionContainerPackage.Literals.SIM_SITE.getEAllContainments().get(0);
	private String uniqueSimSiteStateContainerAttributeName;
	
	public final static EClassifier SIM_SITE_STATE_TYPE = ReactionContainerPackage.Literals.SIM_SITE_STATE;
	
	public final static EDataType TYPE_ATTRIBUTE_TYPE = ReactionContainerPackage.Literals.SIM_SITE_STATE.getEAllAttributes().get(0).getEAttributeType();
	public final static EAttribute TYPE_ATTRIBUTE = ReactionContainerPackage.Literals.SIM_SITE_STATE.getEAllAttributes().get(0);
	private String uniqueTypeAttributeName;
	
	private String stateType;
	
	public SiteStateContext(SiteNodeContext siteNodeContext, String stateType) {
		this.siteNodeContext = siteNodeContext;
		uniqueSimSiteStateContainerAttributeName = siteNodeContext.getAgentNodeContext().getAgentVariableName()
				+"_"+siteNodeContext.getLocalSimSiteVariableName()
				+"_"+getSimSiteStateContainerAttributeName();
		uniqueTypeAttributeName = siteNodeContext.getAgentNodeContext().getAgentVariableName()
				+"_"+siteNodeContext.getLocalSimSiteVariableName()
				+"_"+getSimSiteStateTypeAttributeName();
		this.stateType = stateType;
	}
	
	public static String getSimSiteStateContainerAttributeName() {
		return SIM_SITE_STATE_CONTAINER_ATTRIBUTE.getName();
	}
	
	public static String getSimSiteStateContainerAttributeTypeName() {
		return SIM_SITE_STATE_CONTAINER_ATTRIBUTE_TYPE.getName();
	}
	
	public static String getSimSiteStateTypeName() {
		return SIM_SITE_STATE_TYPE.getName();
	}
	
	public static String getSimSiteStateTypeAttributeName() {
		return TYPE_ATTRIBUTE.getName();
	}
	
	public static String getSimSiteStateTypeAttributeTypeName() {
		return TYPE_ATTRIBUTE_TYPE.getName();
	}

	public SiteNodeContext getSiteNodeContext() {
		return siteNodeContext;
	}

	public String getUniqueSimSiteStateContainerAttributeName() {
		return uniqueSimSiteStateContainerAttributeName;
	}

	public String getUniqueTypeAttributeName() {
		return uniqueTypeAttributeName;
	}

	public String getStateType() {
		return stateType;
	}
	
}
