package org.simsg.core.simulation;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;
import org.simsg.core.simulation.statistic.MultiObservable;
import org.simsg.core.simulation.statistic.Observable;
import org.simsg.core.simulation.statistic.Observables;


public class SimulationContainer implements SimulationProcess{
	private Set<Simulation> simulations = Collections.synchronizedSet(new HashSet<>());
	private Set<Simulation> activeSimulations = Collections.synchronizedSet(new HashSet<>());
	private Set<Thread> activeThreads = Collections.synchronizedSet(new HashSet<>());
	private Set<Simulation> pendingSimulations = Collections.synchronizedSet(new HashSet<>());
	private Set<Simulation> completedSimulations = Collections.synchronizedSet(new HashSet<>());
	
	private Map<Simulation, Observables> observables = Collections.synchronizedMap(new HashMap<>());
	
	private Thread currentThread = Thread.currentThread();
	private boolean asleep = false;
	private int thread = 0;
	
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
					Thread thread = new Thread(sim);
					activeThreads.add(thread);
					thread.start();
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
		
	}
	
	private synchronized void terminationNotifier(final Simulation simulation) {
		Observables obs = simulation.getSimulationStatistics().stream()
				.filter(stat -> (stat instanceof Observables))
				.map(stat -> (Observables) stat)
				.findFirst()
				.orElseGet(null);
			if(obs != null) {
				observables.put(simulation, obs);
			}
			simulation.finish();	
		
		activeSimulations.remove(simulation);
		completedSimulations.add(simulation);
		
		thread++;
		System.out.println("Finished Simulation: #"+thread);
		if(asleep)
			currentThread.interrupt();
	}

	@Override
	public void pause() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void unpause() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void finish() {
		throw new UnsupportedOperationException();
	}
	
	public void displayAllResults() {
		for(Observables obs : observables.values()) {
			obs.display();
		}
	}
	
	public void displayResult(int index) {
		Observables obj = (Observables)observables.values().toArray()[index];
		obj.display();
	}

	@Override
	public void displayResults() {
		Map<String, Collection<Observable>> pattern2observable = new LinkedHashMap<>();
		observables.values().forEach(obs -> {
			obs.getObservables().values().forEach( o -> {
				Collection<Observable> oList = pattern2observable.get(o.getName());
				if(oList == null) {
					oList = new LinkedList<>();
					pattern2observable.put(o.getName(), oList);
				}
				oList.add(o);
			});
		});
		
		Map<String, Observable> pattern2multi = Collections.synchronizedMap(new LinkedHashMap<>());
		pattern2observable.keySet().parallelStream().forEach(pattern -> {
			MultiObservable mObs = new MultiObservable(pattern, pattern2observable.get(pattern));
			pattern2multi.put(pattern, mObs);
			mObs.updateMeasurements();
			
		});
		
		Observables observables = new Observables(pattern2multi.values());
		observables.display();
	}

	@Override
	public void displayVisualizations() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isTerminated() {
		return completedSimulations.size() == simulations.size();
	}

}
