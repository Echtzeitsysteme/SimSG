package SimSG.Core.PM.Pattern;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;


public class SiteStateContext {
	
	private SiteNodeContext siteNodeContext;
	
	private EReference stateReference;
	private EClassifier stateReferenceType;
	
	private EClass stateType;

	
	public SiteStateContext(SiteNodeContext siteNodeContext, EReference stateReference, EClass stateType) {
		this.siteNodeContext = siteNodeContext;
		this.stateReference = stateReference;
		this.stateReferenceType = stateReference.getEType();
		this.stateType = stateType;
	}
	
	public String getStateReferenceName() {
		return stateReference.getName();
	}
	
	public EReference getStateReference() {
		return stateReference;
	}
	
	public EClassifier getStateReferenceType() {
		return stateReferenceType;
	}
	
	public String getStateTypeName() {
		return stateType.getName();
	}
	
	public EClass getStateType() {
		return stateType;
	}
	
	public SiteNodeContext getSiteNodeContext() {
		return siteNodeContext;
	}
	
	public String getSourceAgentTypeName() {
		return siteNodeContext.getAgentNodeContext().getAgentTypeName();
	}
	
	public String getSourceAgentVariableName() {
		return siteNodeContext.getAgentNodeContext().getAgentVariableName();
	}
	
}
