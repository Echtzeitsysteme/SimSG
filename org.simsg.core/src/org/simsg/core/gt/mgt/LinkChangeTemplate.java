package org.simsg.core.gt.mgt;

import java.util.Map;
import java.util.List;

import org.eclipse.emf.ecore.EReference;

import org.simsg.container.Agent;
import org.simsg.core.pm.match.IMatch;
import org.simsg.simsgl.simSGL.ValidAgentPattern;

public class LinkChangeTemplate {
	
	private ValidAgentPattern src;
	private ValidAgentPattern trg;
	private String srcLabel;
	private String trgLabel;
	private EReference srcReference;
	private EReference trgReference;
	private boolean srcInMatch;
	private boolean trgInMatch;
	
	public LinkChangeTemplate() {
		srcInMatch = true;
		trgInMatch = true;
	}
	
	public void setSrc(ValidAgentPattern src, String srcLabel, EReference srcReference) {
		this.src = src;
		this.srcLabel = srcLabel;
		this.srcReference = srcReference;
	}
	
	public void setTrg(ValidAgentPattern trg, String trgLabel, EReference trgReference) {
		this.trg = trg;
		this.trgLabel = trgLabel;
		this.trgReference = trgReference;
	}
	
	public void setAgentNotInMatch(ValidAgentPattern agent) {
		if(agent.equals(src)) {
			srcInMatch = false;
		}else if(agent.equals(trg)) {
			trgInMatch = false;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void applyLinkChange(IMatch match, Map<ValidAgentPattern, Agent> createdAgents) {
		Agent srcAgent = null;
		Agent trgAgent = null;
		if(srcInMatch) {
			srcAgent = (Agent) match.get(srcLabel);
		}else {
			srcAgent = createdAgents.get(src);
		}
		if(trgInMatch) {
			trgAgent = (Agent) match.get(trgLabel);
		}else {
			trgAgent = createdAgents.get(trg);
		}
		
		if(srcReference.getUpperBound() != EReference.UNBOUNDED_MULTIPLICITY) {
			srcAgent.eSet(srcReference, trgAgent);
		}else {
			((List<Agent>) srcAgent.eGet(srcReference)).add(trgAgent);
		}
		
		if(trgReference.getUpperBound() != EReference.UNBOUNDED_MULTIPLICITY) {
			trgAgent.eSet(trgReference, srcAgent);
		}else {
			((List<Agent>) trgAgent.eGet(trgReference)).add(srcAgent);
		}
		
		
	}
	
	
	
	
}
