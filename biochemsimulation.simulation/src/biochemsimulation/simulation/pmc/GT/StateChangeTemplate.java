package biochemsimulation.simulation.pmc.GT;

import java.util.LinkedHashMap;
import java.util.Map;

import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimSite;
import biochemsimulation.simulation.matching.IMatch;

public class StateChangeTemplate {
	private int agentIndex;
	private Map<Integer, String> siteStateMap;
	
	public StateChangeTemplate (int agentIndex){
		this.agentIndex = agentIndex;
		siteStateMap = new LinkedHashMap<Integer, String>();
	}
	
	public void addStateChangeCandidate(int index, String state) {
		siteStateMap.put(index, state);
	}
	
	public void applyStateChangeCandidates(IMatch match) {
		// This try catch is a very very very dirty fix to prevent crashes. This needs to be fixed properly!
		try {
			SimAgent agent = (SimAgent) match.get(match.parameterNames().get(agentIndex));
			siteStateMap.forEach( (idx, state) -> {
				SimSite ss = agent.getSimSites().get(idx);
				//System.out.println("Agent type: "+agent.getType());
				//System.out.println("Site type: "+ss.getType());
				if(!ss.getSimSiteState().getType().equals(state)) {
					ss.getSimSiteState().setType(state);
				}
				
			});
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public boolean isEmpty() {
		return siteStateMap.size() == 0;
	}
}
