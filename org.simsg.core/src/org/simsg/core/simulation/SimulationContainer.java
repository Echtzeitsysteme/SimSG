package org.simsg.core.simulation;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SimulationContainer implements SimulationProcess{
	private Set<Simulation> simulations = Collections.synchronizedSet(new HashSet<>());
	private Set<Simulation> activeSimulations = Collections.synchronizedSet(new HashSet<>());
	private Set<Thread> activeThreads = Collections.synchronizedSet(new HashSet<>());
	private Set<Simulation> pendingSimulations = Collections.synchronizedSet(new HashSet<>());
	private Set<Simulation> completedSimulations = Collections.synchronizedSet(new HashSet<>());
	
	private Thread currentThread = Thread.currentThread();
	private boolean asleep = false;
	
	public SimulationContainer(Collection<Simulation> simulations) {
		this.simulations.addAll(simulations);
		pendingSimulations.addAll(simulations);
	}

	@Override
	public void initialize() {
		pendingSimulations.addAll(simulations.parallelStream()
				.map(sim -> {
					sim.initialize();
					sim.notifyTermination(this::terminationNotifier);
					return sim;
				})
				.collect(Collectors.toSet()));
	}

	@Override
	public void run() {
		activeSimulations.addAll(pendingSimulations.parallelStream()
				.map(sim -> {
//					Thread thread = new Thread(sim);
//					activeThreads.add(thread);
//					thread.start();
					sim.run();
					return sim;
				})
				.collect(Collectors.toSet()));
		pendingSimulations.clear();
		
		while(!isTerminated()) {
			try {
				asleep = true;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				asleep = false;
			}
		}
		asleep = false;
		
		activeThreads.parallelStream().forEach(thread -> {
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
	
	private synchronized void terminationNotifier(final Simulation simulation) {
		activeSimulations.remove(simulation);
		completedSimulations.add(simulation);
		
		if(asleep)
			currentThread.interrupt();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unpause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finish() {
		simulations.parallelStream().forEach(sim -> sim.finish());
	}

	@Override
	public void displayResults() {
		completedSimulations.forEach(sim -> sim.displayResults());
	}

	@Override
	public void displayVisualizations() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isTerminated() {
		return completedSimulations.size() == simulations.size();
	}

}
