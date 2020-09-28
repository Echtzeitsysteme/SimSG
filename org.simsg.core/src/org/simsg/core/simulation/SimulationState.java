package org.simsg.core.simulation;

import java.util.Optional;
import java.util.PriorityQueue;

import org.eclipse.emf.ecore.resource.Resource;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.pmc.PatternMatchingController;

import SimulationDefinition.SimDefinition;

public class SimulationState {
	private int iterations;
	private double time;
	private PriorityQueue<Event> events = new PriorityQueue<>();
	
	private boolean dirty = true;
	
	private PatternMatchingController pmc;
	
	public SimulationState() {
		iterations = 0;
		time = 0;
	}
	
	public void setPmc(PatternMatchingController pmc) {
		this.pmc = pmc;
	}
	
	public boolean isDirty() {
		return dirty;
	}
	
	public void setDirty() {
		dirty = true;
	}
	
	public Event popNextEvent() {
		return events.poll();
	}
	
	public Event peekNextEvent() {
		return events.peek();
	}
	
	public void clearEvents() {
		events.clear();
	}
	
	public boolean noEvents() {
		return events.isEmpty();
	}
	
	public void enqueueEvent(Event event) {
		events.add(event);
	}
	
	public boolean refreshState() {
		try {
			pmc.collectAllMatches();
		} catch (Exception e) {
			e.printStackTrace();
			dirty = true;
		}
		dirty = false;
		return dirty;
	}
	
	public int getMatchCount(String ruleName) {
		return pmc.getMatchCount(ruleName);
	}
	
	public SimSGMatch getRandomMatch(String ruleName) {
		return pmc.getRandomMatch(ruleName);
	}
	
	public Optional<Double> getStaticProbability(String ruleName) {
		return pmc.getStaticProbability(ruleName);
	}
	
	public Optional<Double> getDynamicProbability(SimSGMatch match) {
		return pmc.getDynamicProbability(match);
	}
	
	public void incrementIterations() {
		iterations++;
	}
	
	public int getIterations() {
		return iterations;
	}
	
	public void setTime(double time) {
		this.time = time;
	}
	
	public void elapseTime(double step) {
		time += step;
	}
	
	public double getTime() {
		return time;
	}
	
	public SimDefinition getSimulationDefinition() {
		return pmc.getSimulationDefinion();
	}
	
	public Resource getSimulationModel() {
		return pmc.getSimulationModel();
	}
}
