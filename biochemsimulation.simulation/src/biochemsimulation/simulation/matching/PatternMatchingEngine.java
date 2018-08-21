package biochemsimulation.simulation.matching;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.utils.PatternUtils;
import biochemsimulation.simulation.matching.patterns.GenericPattern;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public abstract class PatternMatchingEngine {
	
	protected PatternMatchingEngineEnum type;
	
	protected ReactionContainer model;
	protected ReactionRuleModel rules;
	protected Map<String, GenericPattern> genericPatterns;
	
	protected Set<String> voidPatterns;
	protected Collection<String> nonVoidPatterns;
	protected Collection<String> allPatterns;
	
	protected PatternMatchingEngine() {
		this.voidPatterns = new HashSet<String>();
	}
	
	public void setReactionRules(ReactionRuleModel rules) {
		this.rules = rules;
		PatternUtils.getPatterns(rules).forEach((name, pattern)->{
			if(PatternUtils.isPatternVoid(pattern)) {
				voidPatterns.add(name);
			}
		});
		this.genericPatterns = null;
	}
	
	public void setReactionRules(Map<String, GenericPattern> genericPatterns) {
		this.rules = null;
		genericPatterns.forEach((name, pattern) -> {
			if(pattern.isVoidPattern()) {
				voidPatterns.add(name);
			}
		});
		this.genericPatterns = genericPatterns;
	}
	
	public void setReactionContainer(ReactionContainer container) {
		this.model = container;
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
	
	abstract public void disposeEngine();
	
	public PatternMatchingEngineEnum getEngineType() {
		return type;
	}
	
}
