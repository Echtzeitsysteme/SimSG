package biochemsimulation.simulation.pmc;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.viatra.query.runtime.api.IPatternMatch;

import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimSite;

class StateTransformationTemplate {
	private int agentIndex;
	private Map<Integer, String> siteStateMap;
	
	StateTransformationTemplate (int agentIndex){
		this.agentIndex = agentIndex;
		siteStateMap = new LinkedHashMap<Integer, String>();
	}
	
	void addStateChangeCandidate(int index, String state) {
		siteStateMap.put(index, state);
	}
	
	void applyStateChangeCandidates(IPatternMatch match) {
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
