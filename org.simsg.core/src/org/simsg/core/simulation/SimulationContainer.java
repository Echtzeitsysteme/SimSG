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

import org.simsg.core.simulation.statistic.MultiObservable;
import org.simsg.core.simulation.statistic.Observable;
import org.simsg.core.simulation.statistic.Observables;

import SimulationDefinition.SimDefinition;


public class SimulationContainer implements SimulationProcess{
	private int debugLevel = CONSOLE_LEVEL_NONE;
	private long processID = Thread.currentThread().getId();
	
	final String modelName;
	final protected BackendContainer backend;
	protected SimulationState state;
	protected SimDefinition simulationDefinition;
	
	private Set<Simulation> simulations = Collections.synchronizedSet(new HashSet<>());
	private Set<Simulation> activeSimulations = Collections.synchronizedSet(new HashSet<>());
	private Set<Thread> activeThreads = Collections.synchronizedSet(new HashSet<>());
	private Set<Simulation> pendingSimulations = Collections.synchronizedSet(new HashSet<>());
	private Set<Simulation> completedSimulations = Collections.synchronizedSet(new HashSet<>());
	
	private Map<Simulation, Observables> observables = Collections.synchronizedMap(new HashMap<>());
	private Observables stats;
	
	private Thread currentThread = Thread.currentThread();
	private boolean asleep = false;
	private int thread = 0;
	
	public SimulationContainer(final String modelName, final Collection<Simulation> simulations, final BackendContainer backend) {
		this.modelName = modelName;
		this.backend = backend;
		
		this.simulations.addAll(simulations);
		pendingSimulations.addAll(simulations);
		
	}

	@Override
	public void initialize() {
		backend.persistence.init();
		simulationDefinition = backend.persistence.loadSimulationDefinition(modelName);
		backend.pmc.loadModels(simulationDefinition, null, null);
		state = new SimulationState();
		state.setPmc(backend.pmc);
		
		pendingSimulations.addAll(simulations.parallelStream()
				.map(sim -> {
					if(debugLevel == CONSOLE_LEVEL_INFO) {
						sim.setConsoleInfoLevel(debugLevel+1);
					}
					sim.initialize();
					sim.notifyTermination(this::terminationNotifier);
					return sim;
				})
				.collect(Collectors.toSet()));
	}

	@Override
	public void run() {
		if(debugLevel <= SimulationProcess.CONSOLE_LEVEL_INFO)
			System.out.println("Starting multi-simulation using "+simulations.size()+" concurrent simulation threads ...");
		
		activeSimulations.addAll(pendingSimulations.parallelStream()
				.map(sim -> {
					sim.setProcessID(thread++);
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
		
		if(debugLevel <= SimulationProcess.CONSOLE_LEVEL_INFO)
			System.out.println("... multi-simulation complete.");
		
		createStatistics();
	}
	
	private void createStatistics() {
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
		
		stats = new Observables(state, backend.persistence, pattern2multi.values());
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
		
		if(debugLevel <= SimulationProcess.CONSOLE_LEVEL_INFO)
			System.out.println("Finished Simulation: #"+simulation.getProcessID());
		
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
	
	public void displayAllResults(boolean timeOnXAxis) {
		for(Observables obs : observables.values()) {
			obs.display(timeOnXAxis);
		}
	}
	
	public void displayResult(int index, boolean timeOnXAxis) {
		Observables obj = (Observables)observables.values().toArray()[index];
		obj.display(timeOnXAxis);
	}

	@Override
	public void displayResults(boolean timeOnXAxis) {
		stats.display(timeOnXAxis);
	}

	@Override
	public void displayVisualizations() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isTerminated() {
		return completedSimulations.size() == simulations.size();
	}

	@Override
	public void setConsoleInfoLevel(int level) {
		debugLevel = level;
	}

	@Override
	public long getProcessID() {
		return processID;
	}
	
	@Override
	public void setProcessID(long id) {
		this.processID = id;
	}

	@Override
	public String saveResultsToFile() {
		return stats.saveStatistics();
	}
}
