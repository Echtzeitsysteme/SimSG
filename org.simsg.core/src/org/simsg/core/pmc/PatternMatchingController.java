package org.simsg.core.pmc;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.common.util.URI;

import org.simsg.container.Container;
import org.simsg.container.generator.ContainerGenerator;
import org.simsg.container.util.EPackageWrapper;
import org.simsg.core.pm.match.IMatch;
import org.simsg.core.pm.match.PatternMatchingEngine;
import org.simsg.simsgl.simSGL.SimSGLModel;
import org.simsg.simsgl.utils.PatternContainer;
import org.simsg.simsgl.utils.PatternUtils;


public abstract class PatternMatchingController{

	protected SimSGLModel ruleModel;
	protected Container reactionContainer;
	protected EPackageWrapper metaModel;
	
	protected PatternContainer patternContainer;
	
	protected PatternMatchingEngine engine;
	protected Map<String, Collection<IMatch>> matches;
	protected Map<String, Integer> matchCount;
	
	Random random;
	
	protected PatternMatchingController() {
		random = new Random();
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
	
	public void loadModels(SimSGLModel ruleModel, Container reactionContainer) throws Exception {
		this.ruleModel = ruleModel;
		this.reactionContainer = reactionContainer;
		this.patternContainer = PatternUtils.createPatternContainer(ruleModel);
		URI metaModelURI = ContainerGenerator.createMetaModelURI(ruleModel.getModel().getName());
		EPackage ePack = EPackage.Registry.INSTANCE.getEPackage(metaModelURI.toString());
		metaModel = new EPackageWrapper(ePack);
		feedEngine();
	}
	
	public void initEngine() throws Exception {
		engine.initEngine();
	}
	
	public void initController() throws Exception {
		initMatches();
	}
	
	protected void initMatches() {
		// Init matches
		matches = new HashMap<String, Collection<IMatch>>();
		for(String patterName : engine.getAllPatternNames()) {
			matches.put(patterName, new LinkedList<IMatch>());
		}
				
		// Init match counter
		matchCount = new HashMap<String, Integer>();
		for(String patternName : matches.keySet()) {
			matchCount.put(patternName, 0);
		}
	}

	public void discardEngine() {
		engine.disposeEngine();
	}

	public String getPMCType() {
		return this.getClass().getSimpleName();
	}
	
	public String getEngineType() {
		return engine.getEngineType();
	}
	
	public PatternContainer getPatternContainer() {
		return patternContainer;
	}
	
	public SimSGLModel getRuleModel() {
		return ruleModel;
	}
	
	public EPackageWrapper getEPackageWrapper() {
		return metaModel;
	}
	
	public Container getContainerModel() {
		return reactionContainer;
	}
	
}
