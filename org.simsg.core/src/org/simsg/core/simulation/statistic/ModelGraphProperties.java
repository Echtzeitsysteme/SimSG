package org.simsg.core.simulation.statistic;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.simsg.container.Agent;
import org.simsg.container.Container;
import org.simsg.container.ContainerPackage;
import org.simsg.core.simulation.SimulationState;

public class ModelGraphProperties extends SimulationStatistics {
	
	private Container modelGraph;
	private List<Entry<Double, Integer>> subgraphStatistics = new LinkedList<>();

	public ModelGraphProperties(SimulationState state) {
		super(state);
		modelGraph = state.getContainerModel();
	}

	@Override
	public void logCurrentState() {
		subgraphStatistics.add(new AbstractMap.SimpleEntry<Double, Integer>(state.getTime(), numOfDisjunctSubgraphs()));
	}

	@Override
	protected void displayStatistics() {
		ModelGraphPropertiesUi ui = new  ModelGraphPropertiesUi("Simulation Model Graph Properties");
		ui.initDataSet(subgraphStatistics);
		ui.displayDataSet();
	}
	
	private int numOfDisjunctSubgraphs() {
		Set<Agent> allAgents = new HashSet<>();
		allAgents.addAll(modelGraph.getAgents());
		
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
		return subGraphs.size();
	}
	
	private List<Agent> outgoingEdges(Agent current) {
		List<Agent> outgoing = new LinkedList<>();
		EClass agentClass = current.eClass();
		List<EReference>outgoingEdgeTypes = new LinkedList<>();
		
		for(EStructuralFeature feat : agentClass.getEStructuralFeatures()) {
			if(!(feat instanceof EReference)) continue;
			EReference ref  = (EReference)feat;
			if(ref.getEType().getClassifierID() != ContainerPackage.AGENT) continue;
			outgoingEdgeTypes.add(ref);
		}
		
		for(EReference ref : outgoingEdgeTypes) {
			if(ref.getUpperBound()==EReference.UNBOUNDED_MULTIPLICITY) {
				@SuppressWarnings("unchecked")
				List<Agent> other = (List<Agent>)current.eGet(ref);
				if(other.size() > 0) {
					outgoing.addAll(other);
				}
			}else {
				Agent other = (Agent)current.eGet(ref);
				if(other != null) {
					outgoing.add(other);
				}
			}
		}
		return outgoing;
	}

}
