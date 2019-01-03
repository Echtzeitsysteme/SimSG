package biochemsimulation.simulation.pmc.GT;

import org.eclipse.emf.ecore.EReference;

import biochemsimulation.reactioncontainer.Agent;
import biochemsimulation.simulation.matching.IMatch;

public class LinkChangeTemplate {
	
	private int srcAgentIdx;
	private int trgAgentIdx;
	private EReference srcReference;
	private EReference trgReference;
	
	public LinkChangeTemplate() {
	}
	
	public void setSrc(int srcAgentIdx, EReference srcReference) {
		this.srcAgentIdx = srcAgentIdx;
		this.srcReference = srcReference;
	}
	
	public void setTrg(int trgAgentIdx, EReference trgReference) {
		this.trgAgentIdx = trgAgentIdx;
		this.trgReference = trgReference;
	}
	
	public void applyLinkChange(IMatch match) {
		Agent srcAgent = (Agent) match.get(match.parameterNames().get(srcAgentIdx));
		Agent trgAgent = (Agent) match.get(match.parameterNames().get(trgAgentIdx));
		srcAgent.eSet(srcReference, trgAgent);
		trgAgent.eSet(trgReference, srcAgent);
	}
	
	
	
	
}
