package biochemsimulation.simulation.pmc;

import java.util.LinkedHashMap;
import java.util.Map;

import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimSite;
import biochemsimulation.simulation.matching.IMatch;

class StateChangeTemplate {
	private int agentIndex;
	private Map<Integer, String> siteStateMap;
	
	StateChangeTemplate (int agentIndex){
		this.agentIndex = agentIndex;
		siteStateMap = new LinkedHashMap<Integer, String>();
	}
	
	void addStateChangeCandidate(int index, String state) {
		siteStateMap.put(index, state);
	}
	
	void applyStateChangeCandidates(IMatch match) {
		SimAgent agent = (SimAgent) match.get(match.parameterNames().get(agentIndex));
		siteStateMap.forEach( (idx, state) -> {
			SimSite ss = agent.getSimSites().get(idx);
			if(!ss.getSimSiteState().getType().equals(state)) {
				ss.getSimSiteState().setType(state);
			}
		});
	}
	
	boolean isEmpty() {
		return siteStateMap.size() == 0;
	}
}
