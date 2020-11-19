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

import SimulationDefinition.Observation;

public class SimulationContainer implements SimulationProcess{
	private Set<Simulation> simulations = Collections.synchronizedSet(new HashSet<>());
	private Set<Simulation> activeSimulations = Collections.synchronizedSet(new HashSet<>());
	private Set<Thread> activeThreads = Collections.synchronizedSet(new HashSet<>());
	private Set<Simulation> pendingSimulations = Collections.synchronizedSet(new HashSet<>());
	private Set<Simulation> completedSimulations = Collections.synchronizedSet(new HashSet<>());
	
	private Map<Simulation, Observables> observables = Collections.synchronizedMap(new HashMap());
	
	private Thread currentThread = Thread.currentThread();
	private boolean asleep = false;
	
	public SimulationContainer(Collection<Simulation> simulations) {
		this.simulations.addAll(simulations);
		pendingSimulations.addAll(simulations);
	}

	@Override
	public void initialize() {
//		TODO: Currently parallelization is disabled since HiPE can not be run in multiple instances
//		pendingSimulations.addAll(simulations.parallelStream()
//				.map(sim -> {
//					sim.initialize();
//					sim.notifyTermination(this::terminationNotifier);
//					return sim;
//				})
//				.collect(Collectors.toSet()));
	}

	@Override
	public void run() {
//		TODO: Currently parallelization is disabled since HiPE can not be run in multiple instances
//		activeSimulations.addAll(pendingSimulations.parallelStream()
//				.map(sim -> {
//					Thread thread = new Thread(sim);
//					activeThreads.add(thread);
//					thread.start();
//					sim.run();
//					return sim;
//				})
//				.collect(Collectors.toSet()));
//		pendingSimulations.clear();
//		
//		while(!isTerminated()) {
//			try {
//				asleep = true;
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				asleep = false;
//			}
//		}
//		asleep = false;
//		
//		activeThreads.parallelStream().forEach(thread -> {
//			try {
//				thread.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		});
		
		simulations.forEach(sim -> {
			sim.initialize();
			sim.run();
			
			Observables obs = sim.getSimulationStatistics().stream()
				.filter(stat -> (stat instanceof Observables))
				.map(stat -> (Observables) stat)
				.findFirst()
				.orElseGet(null);
			if(obs != null) {
				observables.put(sim, obs);
			}
			sim.finish();
			completedSimulations.add(sim);
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
//		simulations.parallelStream().forEach(sim -> sim.finish());
	}

	@Override
	public void displayResults() {
		Map<IBeXContextPattern, Collection<Observable>> pattern2observable = new LinkedHashMap<>();
		observables.values().forEach(obs -> {
			obs.getObservables().values().forEach( o -> {
				Collection<Observable> oList = pattern2observable.get(o.getPattern());
				if(oList == null) {
					oList = new LinkedList<>();
					pattern2observable.put(o.getPattern(), oList);
				}
				oList.add(o);
			});
		});
		
		Map<IBeXContextPattern, Observable> pattern2multi = Collections.synchronizedMap(new LinkedHashMap<>());
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isTerminated() {
		return completedSimulations.size() == simulations.size();
	}

}
