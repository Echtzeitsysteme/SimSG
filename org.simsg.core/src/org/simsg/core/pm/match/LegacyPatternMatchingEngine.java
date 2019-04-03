package org.simsg.core.pm.match;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.simsg.core.pm.pattern.GenericPattern;

public abstract class LegacyPatternMatchingEngine extends PatternMatchingEngine {
	
	protected EPackage metaModel;
	protected Resource simulationModel;
	protected Map<String, GenericPattern> genericPatterns;
	
	protected Set<String> voidPatterns;
	protected Collection<String> nonVoidPatterns;
	protected Collection<String> allPatterns;
	
	protected LegacyPatternMatchingEngine() {
		this.voidPatterns = new HashSet<String>();
	}
	
	public abstract void setAdditionalParameters(Object ... params);
	
	public void setReactionRules(Map<String, GenericPattern> genericPatterns) {
		genericPatterns.forEach((name, pattern) -> {
			if(pattern.isVoidPattern()) {
				voidPatterns.add(name);
			}
		});
		this.genericPatterns = genericPatterns;
	}
	
	public void setReactionContainer(Resource simulationModel, EPackage metaModel) {
		this.simulationModel = simulationModel;
		this.metaModel = metaModel;
	}
	
	abstract public void loadModels() throws Exception;
	
	abstract protected void initEngineInternal() throws Exception;
	
	public void initEngine() throws Exception {
		initEngineInternal();
		initNonVoidPatternNames();
		initAllPatternNames();
	}
	
	protected abstract void initNonVoidPatternNames();
	
	protected void initAllPatternNames() {
		allPatterns = new LinkedList<String>();
		allPatterns.addAll(nonVoidPatterns);
		allPatterns.addAll(voidPatterns);
	}
	
	public boolean isVoidPattern(String patternName) {
		return voidPatterns.contains(patternName);
	}
	
	public Collection<String> getNonVoidPatternNames() {
		return nonVoidPatterns;
	}
	
	public Collection<String> getVoidPatternNames() {
		return voidPatterns;
	}
	
	public Collection<String> getAllPatternNames() {
		return allPatterns;
	}
	
	abstract protected Collection<IMatch> getMatchesAndUpdate(String patternName) throws Exception;
	
	public Collection<IMatch> getMatches(String patternName) throws Exception {
		if(voidPatterns.contains(patternName)) {
			Collection<IMatch> m = new LinkedList<IMatch>();
			m.add(new IMatchImpl(patternName));
			return m;
		}
		Collection<IMatch> m = getMatchesAndUpdate(patternName);
		if(m == null) {
			return new LinkedList<IMatch>();
		}else {
			return m;
		}
	}
	
	public Map<String, Collection<IMatch>> getAllMatches() throws Exception {
		Map<String, Collection<IMatch>> matches = new HashMap<String, Collection<IMatch>>();
		for(String patternName : getAllPatternNames()) {
			matches.put(patternName, getMatches(patternName));
		}
		return matches;
	}
	
	public String getEngineType() {
		return this.getClass().getSimpleName();
	}
	
	abstract public void disposeEngine();
	
}