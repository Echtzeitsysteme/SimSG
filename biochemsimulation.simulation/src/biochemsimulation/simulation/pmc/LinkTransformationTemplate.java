package biochemsimulation.simulation.pmc;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.viatra.query.runtime.api.IPatternMatch;

import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimSite;

class LinkTransformationTemplate {
	private int agentIndex;
	private List<Integer> siteIndexes;
	
	LinkTransformationTemplate(int agentIndex){
		this.agentIndex = agentIndex;
		siteIndexes = new LinkedList<Integer>();
	}
	
	void addLinkRemovalCandidate(int index) {
		siteIndexes.add(index);
	}
	
	void applyRemovalCandidates(IPatternMatch match) {
		SimAgent agent = (SimAgent) match.get(match.parameterNames().get(agentIndex));
		siteIndexes.forEach(link -> {
			SimSite ss = agent.getSimSites().get(link);
			org.eclipse.emf.ecore.util.EcoreUtil.delete(ss.getSimLinkState());
		});
	}
	
	boolean isEmpty() {
		return siteIndexes.size() == 0;
	}
}
