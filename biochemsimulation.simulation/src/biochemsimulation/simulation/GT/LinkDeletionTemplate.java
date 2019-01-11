package biochemsimulation.simulation.GT;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EReference;

import biochemsimulation.reactioncontainer.Agent;
import biochemsimulation.simulation.matching.IMatch;

public class LinkDeletionTemplate {
	private int agentIndex;
	private Map<EReference, Integer> references;
	
	public LinkDeletionTemplate(int agentIndex){
		this.agentIndex = agentIndex;
		references = new HashMap<EReference, Integer>();
	}
	
	public void addLinkRemovalCandidate(EReference ref) {
		references.put(ref, null);
	}
	
	public void addLinkRemovalCandidate(EReference ref, int otherAgentIdx) {
		references.put(ref, otherAgentIdx);
	}
	
	@SuppressWarnings("unchecked")
	public void applyRemovalCandidates(IMatch match) {
		Agent agent = (Agent) match.get(match.parameterNames().get(agentIndex));
		
		for(Entry<EReference, Integer> ref : references.entrySet()) {
			if(ref.getValue() != null) {
				Agent otherAgent = (Agent) match.get(match.parameterNames().get(ref.getValue().intValue()));
				((List<Agent>) agent.eGet(ref.getKey())).remove(otherAgent);
			}else {
				agent.eSet(ref.getKey(), null);
			}
		}
	}
	
	public boolean isEmpty() {
		return references.size() == 0;
	}
}
