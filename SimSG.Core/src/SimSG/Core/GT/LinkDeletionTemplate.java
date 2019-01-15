package SimSG.Core.GT;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import SimSG.Container.Agent;
import SimSG.Core.PM.Match.IMatch;

public class LinkDeletionTemplate {
	
	public static final int REMOVE_ALL = Integer.MIN_VALUE;
	public static final int REMOVE_ALL_TYPES = -1;
	
	private int agentIndex;
	private Map<EReference, Integer> references;
	private Map<EReference, EClass> removeTypes;
	
	public LinkDeletionTemplate(int agentIndex){
		this.agentIndex = agentIndex;
		references = new HashMap<EReference, Integer>();
		removeTypes = new HashMap<EReference, EClass>();
	}
	
	public void addLinkRemovalCandidate(EReference ref) {
		references.put(ref, null);
	}
	
	public void addLinkRemovalCandidate(EReference ref, int otherAgentIdx) {
		references.put(ref, otherAgentIdx);
	}
	
	public void addLinkRemovalType(EReference ref, EClass removeType) {
		references.put(ref, REMOVE_ALL_TYPES);
		removeTypes.put(ref, removeType);
	}
	
	@SuppressWarnings("unchecked")
	public void applyRemovalCandidates(IMatch match) {
		Agent agent = (Agent) match.get(match.parameterNames().get(agentIndex));
		
		for(Entry<EReference, Integer> ref : references.entrySet()) {
			if(ref.getValue() != null) {
				if(ref.getValue() >= 0) {
					Agent otherAgent = (Agent) match.get(match.parameterNames().get(ref.getValue().intValue()));
					((List<Agent>) agent.eGet(ref.getKey())).remove(otherAgent);
				}else if (ref.getValue() == REMOVE_ALL_TYPES) {
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
