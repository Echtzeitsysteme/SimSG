package biochemsimulation.simulation.pmc.GT;

import java.util.Map;

import org.eclipse.emf.ecore.EReference;

import biochemsimulation.reactioncontainer.Agent;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;
import biochemsimulation.simulation.matching.IMatch;

public class LinkChangeTemplate {
	
	private ValidAgentPattern src;
	private ValidAgentPattern trg;
	private int srcAgentIdx;
	private int trgAgentIdx;
	private EReference srcReference;
	private EReference trgReference;
	private boolean srcInMatch;
	private boolean trgInMatch;
	
	public LinkChangeTemplate() {
		srcInMatch = true;
		trgInMatch = true;
	}
	
	public void setSrc(ValidAgentPattern src, int srcAgentIdx, EReference srcReference) {
		this.src = src;
		this.srcAgentIdx = srcAgentIdx;
		this.srcReference = srcReference;
	}
	
	public void setTrg(ValidAgentPattern trg, int trgAgentIdx, EReference trgReference) {
		this.trg = trg;
		this.trgAgentIdx = trgAgentIdx;
		this.trgReference = trgReference;
	}
	
	public void setAgentNotInMatch(ValidAgentPattern agent) {
		if(agent.equals(src)) {
			srcInMatch = false;
		}else if(agent.equals(trg)) {
			trgInMatch = false;
		}
	}
	
	public void applyLinkChange(IMatch match, Map<ValidAgentPattern, Agent> createdAgents) {
		Agent srcAgent = null;
		Agent trgAgent = null;
		if(srcInMatch) {
			srcAgent = (Agent) match.get(match.parameterNames().get(srcAgentIdx));
		}else {
			srcAgent = createdAgents.get(src);
		}
		if(trgInMatch) {
			trgAgent = (Agent) match.get(match.parameterNames().get(trgAgentIdx));
		}else {
			trgAgent = createdAgents.get(trg);
		}
		
		srcAgent.eSet(srcReference, trgAgent);
		trgAgent.eSet(trgReference, srcAgent);
	}
	
	
	
	
}
