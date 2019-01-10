package biochemsimulation.simulation.GT;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EReference;

import biochemsimulation.reactioncontainer.Agent;
import biochemsimulation.simulation.matching.IMatch;

public class LinkDeletionTemplate {
	private int agentIndex;
	private List<EReference> references;
	
	public LinkDeletionTemplate(int agentIndex){
		this.agentIndex = agentIndex;
		references = new LinkedList<EReference>();
	}
	
	public void addLinkRemovalCandidate(EReference ref) {
		references.add(ref);
	}
	
	public void applyRemovalCandidates(IMatch match) {
		// This try catch is a very very very dirty fix to prevent crashes. This needs to be fixed properly!
		try {
			Agent agent = (Agent) match.get(match.parameterNames().get(agentIndex));
			for(EReference ref : references) {
				agent.eSet(ref, null);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public boolean isEmpty() {
		return references.size() == 0;
	}
}
