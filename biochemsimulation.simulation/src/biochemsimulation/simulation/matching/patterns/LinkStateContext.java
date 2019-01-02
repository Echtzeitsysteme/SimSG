package biochemsimulation.simulation.matching.patterns;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;

public class LinkStateContext {
	private SiteNodeContext siteNodeContext;
	
	private EClassifier agentReferenceType;
	private EReference agentReference;
	
	private final static EClass targetAgentType = ReactionContainerPackage.Literals.AGENT;
	
	private LinkStateType stateType;
	
	private LinkStateContext target;
	
	public LinkStateContext(SiteNodeContext siteNodeContext, LinkStateType stateType, EReference agentReference) {
		this.siteNodeContext = siteNodeContext;
		this.stateType = stateType;
		this.agentReference = agentReference;
		this.agentReferenceType = agentReference.getEType();
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
	
	public void setTargetLinkState(LinkStateContext target) {
		this.target = target;
	}
	
	public LinkStateContext getTargetLinkState() {
		return target;
	}
	
	public String getTargetAgentTypeName() {
		return target.getSiteNodeContext().getAgentNodeContext().getAgentTypeName();
	}
	
	public String getTargetAgentVariableName() {
		return target.getSiteNodeContext().getAgentNodeContext().getAgentVariableName();
	}
	
}
