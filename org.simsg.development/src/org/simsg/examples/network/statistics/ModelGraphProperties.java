package org.simsg.examples.network.statistics;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.simsg.container.Agent;
import org.simsg.container.State;
import org.simsg.core.simulation.SimulationState;
import org.simsg.core.simulation.statistic.SimulationStatistics;

public class ModelGraphProperties extends SimulationStatistics {
	
	private Resource modelGraph;
	private List<Entry<Double, Integer>> subgraphStatistics = new LinkedList<>();
	private double initialLog;
	private double currentLog;
	private double lastConnected;
	private double lastDisconnected;
	private boolean isConnected = true;
	private List<Double> disconnected = new LinkedList<>();
	private List<Double> connected = new LinkedList<>();

	public ModelGraphProperties(SimulationState state) {
		super(state);
		modelGraph = state.getSimulationModel();
		initialLog = state.getTime();
		currentLog = state.getTime();
		lastConnected = state.getTime();
		
		subgraphStatistics.add(new AbstractMap.SimpleEntry<Double, Integer>(state.getTime(), numOfDisjunctSubgraphs()));
	}

	@Override
	public void logCurrentState() {
		currentLog = state.getTime();
		logGraphStatistic();
	}

	@Override
	protected void displayStatistics() {
		ModelGraphPropertiesUi ui = new  ModelGraphPropertiesUi("Simulation Model Graph Properties");
		ui.initDataSet(subgraphStatistics);
		evaluate();
		ui.displayDataSet();
	}
	
	private void logGraphStatistic() {
		int n = numOfDisjunctSubgraphs();
		subgraphStatistics.add(new AbstractMap.SimpleEntry<Double, Integer>(currentLog, n));
		
		if(n==1) {
			if(!isConnected) {
				lastConnected = currentLog;
				isConnected = true;
				
				double dDisconnect = currentLog-lastDisconnected;
				disconnected.add(dDisconnect);
			}
		}else {
			if(isConnected) {
				lastDisconnected = currentLog;
				isConnected = false;
				
				double dConnect = currentLog-lastConnected;
				connected.add(dConnect);
			}
		}
	}
	
	private void evaluate() {
		logCurrentState();
		double simulatedTime = currentLog - initialLog;
		
		double connectedTime = 0;
		double disconnectedTime = 0;
		
		double avgConnected = 0;
		double avgDisconnected = 0;
		
		for(Double t : connected) {
			connectedTime += t.doubleValue();
		}
		
		for(Double t : disconnected) {
			disconnectedTime += t.doubleValue();
		}
		
		avgConnected = connectedTime/(double)connected.size();
		avgDisconnected = disconnectedTime/(double)disconnected.size();
		
		double percConnected = connectedTime*100.0/simulatedTime;
		double percDisconnected = disconnectedTime*100.0/simulatedTime;
		
		System.out.println("***\nEvaluation: \nSimulation time: "+simulatedTime+"s, time connected: "+connectedTime+"s, time disconnected: "+disconnectedTime);
		System.out.println("avg time connected: "+avgConnected+"s, avg time disconnected: "+avgDisconnected+"s");
		System.out.println("percentage of time connected: "+percConnected+"%, percentage of time disconnected: "+percDisconnected+"%");
		System.out.println("***");
	}
	
	private int numOfDisjunctSubgraphs() {
		Set<Agent> allAgents = new HashSet<>();
		//TODO: mhh.. this is pretty domain specific..
		/*
		for(Agent agent : modelGraph.getAgents()) {
			if(!agent.eClass().getName().equals("Edge")) {
				allAgents.add(agent);
			}
		}
		*/
		List<Set<Agent>> subGraphs = new LinkedList<>();
		//TODO: mhh.. this is pretty domain specific..
		/*
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
		*/
		return subGraphs.size();
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
						outgoing.addAll(checkActiveEdgeNode(other));
					}
				}
			}else {
				Agent other = (Agent)current.eGet(ref);
				if(other != null) {
					outgoing.addAll(checkActiveEdgeNode(other));
				}
			}
		}
		return outgoing;
	}
	
	private List<Agent> checkActiveEdgeNode(Agent other) {
		if(!other.eClass().getName().equals("Edge")) {
			List<Agent> list = new LinkedList<>();
			list.add(other);
		}
		
		EClass edgeClass = other.eClass();
		List<EReference>stateRefTypes = new LinkedList<>();
		List<EReference>agentRefTypes = new LinkedList<>();
		
		for(EStructuralFeature feat : edgeClass.getEStructuralFeatures()) {
			if(!(feat instanceof EReference)) continue;
			EReference ref  = (EReference)feat;
			if(ref.getEType().getName().equals("active")) {
				stateRefTypes.add(ref);
			}else if(ref.getEType().getName().equals("Agent")) {
				agentRefTypes.add(ref);
			}
			
		}
		
		for(EReference ref : stateRefTypes) {
			State otherState = (State)other.eGet(ref);
			if(otherState == null) continue;
			if(otherState.eClass().getName().equals("active")) {
				List<Agent> list = new LinkedList<>();
				for(EReference refAgent : agentRefTypes) {
					@SuppressWarnings("unchecked")
					List<Agent> otherAgent = (List<Agent>)other.eGet(refAgent);
					list.addAll(otherAgent);
				}
				return list;
			}
		}
		
		return new LinkedList<>();
	}

	@Override
	protected void saveStatistics() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAdditionalParameters(Object... params) {
		// TODO Auto-generated method stub
		
	}

}
