package org.simsg.core.pmc;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

import org.simsg.container.util.EPackageWrapper;
import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pm.match.IMatch;
import org.simsg.simsgl.utils.PatternContainer;

import SimulationDefinition.SimDefinition;


public abstract class LegacyPMC extends PatternMatchingController{

	protected EPackageWrapper metaModel;
	
	protected PatternContainer patternContainer;

	
	protected LegacyPMC() {
		super();
	}
	
	public abstract void setAdditionalParameters(Object ... params);
	
	protected abstract void feedEngine() throws Exception;

	public void collectMatches(String patternName) throws Exception {
		String patternHash = patternContainer.getPatternHash(patternName);
		Collection<IMatch> matches = engine.getMatches(patternHash);
		this.matches.replace(patternHash, matches);
		this.matchCount.replace(patternHash, matches.size());
	}
	
	protected void collectMatchesWithHash(String patternHash) throws Exception {
		Collection<IMatch> matches = engine.getMatches(patternHash);
		this.matches.replace(patternHash, matches);
		this.matchCount.replace(patternHash, matches.size());
	}
	
	public void collectAllMatches() throws Exception {
		engine.getAllMatches().forEach((name, matches) -> {
			this.matches.replace(name, matches);
			this.matchCount.replace(name, matches.size());
		});
	}
	
	public int getMatchCount(String patternName) {
		String patternHash = patternContainer.getPatternHash(patternName);
		return matchCount.get(patternHash);
	}
	
	public int getMatchCountWithHash(String patternHash) {
		return matchCount.get(patternHash);
	}
	
	protected int getRandomMatchIdx(String patternName) {
		String patternHash = patternContainer.getPatternHash(patternName);
		return (int)(getMatchCountWithHash(patternHash)*random.nextDouble());
	}
	
	protected int getRandomMatchIdxWithHash(String patternHash) {
		return (int)(getMatchCountWithHash(patternHash)*random.nextDouble());
	}
	
	public IMatch getRandomMatch(String patternName) {
		String patternHash = patternContainer.getPatternHash(patternName);
		return (IMatch) matches.get(patternHash).toArray()[getRandomMatchIdxWithHash(patternHash)];
	}
	
	public IMatch getRandomMatchWithHash(String patternHash) {
		return (IMatch) matches.get(patternHash).toArray()[getRandomMatchIdxWithHash(patternHash)];
	}
	
	public IMatch getMatchAt(String patternName, int idx) {
		String patternHash = patternContainer.getPatternHash(patternName);
		return (IMatch) matches.get(patternHash).toArray()[idx];
	}
	
	public IMatch getMatchAtWitHash(String patternHash, int idx) {
		return (IMatch) matches.get(patternHash).toArray()[idx];
	}
	
	public abstract Collection<IMatch> getMatches(String patternName);
	
	public abstract Map<String, Collection<IMatch>> getAllMatches();

	public void setEngine(PatternMatchingEngine engine) {
		this.engine = engine;
	}
	
	public void loadModels(SimDefinition simulationDefinition, Resource simulationModel) throws Exception {
		this.simulationDefinition = simulationDefinition;
		this.simulationModel = simulationModel;
		// TODO: This is a problem...
		/*
		this.patternContainer = PatternUtils.createPatternContainer(ruleModel);
		URI metaModelURI = ContainerGenerator.createMetaModelURI(ruleModel.getModel().getName());
		EPackage ePack = EPackage.Registry.INSTANCE.getEPackage(metaModelURI.toString());
		metaModel = new EPackageWrapper(ePack);
		*/
		feedEngine();
	}
	
	
	public PatternContainer getPatternContainer() {
		return patternContainer;
	}

	public EPackageWrapper getEPackageWrapper() {
		return metaModel;
	}

	
}
