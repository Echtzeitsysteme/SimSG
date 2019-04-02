package org.simsg.examples.network.statistics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.MultiGraph;
import org.simsg.container.Agent;
import org.simsg.container.Container;
import org.simsg.core.simulation.SimulationState;
import org.simsg.core.simulation.visualization.SimulationVisualization;

// Note: CSS style reference at: http://graphstream-project.org/doc/Advanced-Concepts/GraphStream-CSS-Reference/
// Note: API Doku at: https://data.graphstream-project.org/api/
// Note: ABC-Examples at: http://graphstream-project.org/doc/Tutorials/

public class ModelGraphUi extends SimulationVisualization{
	
	private final Container modelGraph;
	private Map<Agent, Node> agents  = new HashMap<>();
	private Graph graph = new MultiGraph("New Graph");
	
	public ModelGraphUi(SimulationState state) {
		super(state);
		modelGraph = state.getContainerModel();
	}
	
	@Override
	protected void displayVisualization() {
		buildGraph();
		graph.display(true);
	}
	
	private void buildGraph() {
		
		for(Agent agent : modelGraph.getAgents()) {
			Node node = graph.addNode(""+agent.getID());
			agents.put(agent, node);
			if(agent.eClass().getName().equals("Edge")) {
				node.addAttribute("ui.style", "fill-color: rgb(0,100,255); text-size: 12; text-style: bold;");
				//node.addAttribute("ui.size", "20px");
				node.addAttribute("ui.label", "Edge(state, weight)");
			} else {
				node.addAttribute("ui.style", "fill-color: rgb(255,100,000); text-size: 12; size: 20px; text-style: bold;");
				//node.addAttribute("ui.size", "60px");
				node.addAttribute("ui.label", "NetworkNode");
			}
			
		}
		
		Set<Agent> allAgents = new HashSet<>();
		allAgents.addAll(agents.keySet());
		
		List<Set<Agent>> subGraphs = new LinkedList<>();
		
		while(!allAgents.isEmpty()) {
			Agent current = allAgents.iterator().next();
			allAgents.remove(current);
			
			Set<Agent> currentSubgraph = new HashSet<>();
			subGraphs.add(currentSubgraph);
			currentSubgraph.add(current);
			
			Set<Agent> currentAgents = new HashSet<Agent>();
			for(Agent agent : outgoingEdges(current)) {
				if(!currentSubgraph.contains(agent)) {
					currentAgents.add(agent);
				}
			}
			allAgents.removeAll(currentAgents);
			currentSubgraph.add(current);
			
			while(!currentAgents.isEmpty()) {
				Agent current2 = currentAgents.iterator().next();
				currentAgents.remove(current2);
				
				for(Agent agent : outgoingEdges(current2)) {
					if(!currentSubgraph.contains(agent)) {
						currentAgents.add(agent);
					}
				}
				
				allAgents.removeAll(currentAgents);
				currentSubgraph.add(current2);
			}
			
		}
	}
	
	private List<Agent> outgoingEdges(Agent current) {
		List<Agent> outgoing = new LinkedList<>();
		EClass agentClass = current.eClass();
		List<EReference>outgoingEdgeTypes = new LinkedList<>();
		
		for(EStructuralFeature feat : agentClass.getEStructuralFeatures()) {
			if(!(feat instanceof EReference)) continue;
			EReference ref  = (EReference)feat;
			if(!ref.getEType().getName().equals("Agent")) continue;
			outgoingEdgeTypes.add(ref);
		}
		
		for(EReference ref : outgoingEdgeTypes) {
			if(ref.getUpperBound()==EReference.UNBOUNDED_MULTIPLICITY) {
				@SuppressWarnings("unchecked")
				List<Agent> others = (List<Agent>)current.eGet(ref);
				if(others.size() > 0) {
					for(Agent other : others) {
						graph.addEdge(current.getID()+"to"+other.getID(), agents.get(current), agents.get(other), true);
					}
				}
			}else {
				Agent other = (Agent)current.eGet(ref);
				if(other != null) {
					graph.addEdge(current.getID()+"to"+other.getID(), agents.get(current), agents.get(other), true);
				}
			}
		}
		return outgoing;
	}

	@Override
	public void setAdditionalParameters(Object... params) {
		// TODO Auto-generated method stub
		
	}

}
