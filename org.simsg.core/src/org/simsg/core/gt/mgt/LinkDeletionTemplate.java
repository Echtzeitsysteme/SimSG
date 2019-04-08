package org.simsg.core.gt.mgt;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.simsg.container.Agent;
import org.simsg.core.pm.match.IMatch;

public class LinkDeletionTemplate {
	
	public static final String REMOVE_ALL = "REMOVE_ALL";
	public static final String REMOVE_ALL_TYPES = "REMOVE_ALL_TYPES";
	
	private String nodeLabel;
	private Map<EReference, String> references = new HashMap<>();
	private Map<EReference, EClass> removeTypes = new HashMap<>();
	
	public LinkDeletionTemplate(String nodeLabel){
		this.nodeLabel = nodeLabel;
	}
	
	public void addLinkRemovalCandidate(EReference ref) {
		references.put(ref, null);
	}
	
	public void addLinkRemovalCandidate(EReference ref, String otherNodeLabel) {
		references.put(ref, otherNodeLabel);
	}
	
	public void addLinkRemovalType(EReference ref, EClass removeType) {
		references.put(ref, REMOVE_ALL_TYPES);
		removeTypes.put(ref, removeType);
	}
	
	@SuppressWarnings("unchecked")
	public void applyRemovalCandidates(IMatch match) {
		Agent agent = (Agent) match.get(nodeLabel);
		
		for(Entry<EReference, String> ref : references.entrySet()) {
			if(ref.getValue() != null) {
				if(!(ref.getValue().equals(REMOVE_ALL_TYPES) || ref.getValue().equals(REMOVE_ALL))) {
					Agent otherAgent = (Agent) match.get(ref.getValue());
					((List<Agent>) agent.eGet(ref.getKey())).remove(otherAgent);
				}else if (ref.getValue().equals(REMOVE_ALL_TYPES)) {
					EClass removeType = removeTypes.get(ref.getKey());
					
					List<Agent> candidates = new LinkedList<Agent>();
					candidates.addAll((List<Agent>) agent.eGet(ref.getKey()));
					
					for(Agent agent2 : candidates) {
						if(agent2.eClass() == removeType) {
							((List<Agent>) agent.eGet(ref.getKey())).remove(agent2);
						}
					}
				}else {
					((List<Agent>) agent.eGet(ref.getKey())).clear();
				}
				
			}else {
				agent.eSet(ref.getKey(), null);
			}
		}
	}
	
	public boolean isEmpty() {
		return references.size() == 0;
	}
}
