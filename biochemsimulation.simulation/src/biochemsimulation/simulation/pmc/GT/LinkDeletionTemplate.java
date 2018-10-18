package biochemsimulation.simulation.pmc.GT;

import java.util.LinkedList;
import java.util.List;

import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimSite;
import biochemsimulation.simulation.matching.IMatch;

public class LinkDeletionTemplate {
	private int agentIndex;
	private List<Integer> siteIndexes;
	
	public LinkDeletionTemplate(int agentIndex){
		this.agentIndex = agentIndex;
		siteIndexes = new LinkedList<Integer>();
	}
	
	public void addLinkRemovalCandidate(int index) {
		siteIndexes.add(index);
	}
	
	public void applyRemovalCandidates(IMatch match) {
		// This try catch is a very very very dirty fix to prevent crashes. This needs to be fixed properly!
		try {
			SimAgent agent = (SimAgent) match.get(match.parameterNames().get(agentIndex));
			for(Integer siteIdx : siteIndexes) {
				SimSite ss = agent.getSimSites().get(siteIdx);
				if(ss.getSimLinkState() != null) {
					org.eclipse.emf.ecore.util.EcoreUtil.delete(ss.getSimLinkState());
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public boolean isEmpty() {
		return siteIndexes.size() == 0;
	}
}
