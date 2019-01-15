package biochemsimulation.simulation.matching.patterns;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;

import  SimSG.Container.ContainerPackage;

public class LinkStateContext {
	private SiteNodeContext siteNodeContext;
	
	private EClassifier agentReferenceType;
	private EReference agentReference;
	
	private final static EClass targetAgentType = ContainerPackage.Literals.AGENT;
	
	private LinkStateType stateType;
	
	private int linkIndex;
	private LinkStateContext target;
	
	public LinkStateContext(SiteNodeContext siteNodeContext, LinkStateType stateType, EReference agentReference) {
		this.siteNodeContext = siteNodeContext;
		this.stateType = stateType;
		this.agentReference = agentReference;
		if(agentReference != null) {
			this.agentReferenceType = agentReference.getEType();
		}
		
	}
	
	public String getAgentReferenceName() {
		return agentReference.getName();
	}
	
	public EReference getAgentReference() {
		return agentReference;
	}
	
	public EClassifier getAgentReferenceType() {
		return agentReferenceType;
	}
	
	public EClass getTargetAgentType() {
		return targetAgentType;
	}

	public SiteNodeContext getSiteNodeContext() {
		return siteNodeContext;
	}

	public LinkStateType getStateType() {
		return stateType;
	}
	
	public String getSourceAgentTypeName() {
		return siteNodeContext.getAgentNodeContext().getAgentTypeName();
	}
	
	public String getSourceAgentVariableName() {
		return siteNodeContext.getAgentNodeContext().getAgentVariableName();
	}
	
	public boolean isSourceAgentLocal() {
		return siteNodeContext.getAgentNodeContext().isLocal();
	}
	
	public void setTargetLinkState(LinkStateContext target, int linkIndex) {
		this.target = target;
		this.linkIndex = linkIndex;
	}
	
	public LinkStateContext getTargetLinkState() {
		return target;
	}
	
	public int getLinkIndex() {
		return linkIndex;
	}
	
	public String getTargetAgentTypeName() {
		return target.getSiteNodeContext().getAgentNodeContext().getAgentTypeName();
	}
	
	public String getTargetAgentVariableName() {
		return target.getSiteNodeContext().getAgentNodeContext().getAgentVariableName();
	}
	
}
