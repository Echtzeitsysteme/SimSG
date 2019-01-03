package biochemsimulation.simulation.pmc.GT;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EReference;

import biochemsimulation.reactioncontainer.Agent;
import biochemsimulation.reactioncontainer.Container;
import biochemsimulation.reactioncontainer.State;
import biochemsimulation.reactioncontainer.util.AgentFactory;

public class AgentCreationTemplate {
	private String type;
	private Map<EReference, State> states;
	
	public AgentCreationTemplate(String type){
		this.type = type;
		states = new HashMap<EReference, State>();
	}
	
	public void addSiteState(EReference stateRef, State state) {
		states.put(stateRef, state);
	}
	
	public Agent createAgentFromTemplate(AgentFactory factory, Container reactionContainer) {
		Agent agent = factory.createObject(type);
		reactionContainer.getAgents().add(agent);
		for(Entry<EReference, State> entry : states.entrySet()) {
			agent.eSet(entry.getKey(), entry.getValue());
		}
		return agent;
	}
	
	
}