package biochemsimulation.simulation.matching;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.utils.PatternUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public abstract class PatternMatchingEngine {
	
	protected PatternMatchingEngineEnum type;
	
	protected ReactionContainer model;
	protected ReactionRuleModel rules;
	
	protected Map<String, Pattern> voidPatterns;
	
	protected PatternMatchingEngine() {
		this.voidPatterns = new HashMap<String, Pattern>();
	}
	
	public void setReactionRules(ReactionRuleModel rules) {
		this.rules = rules;
		PatternUtils.getPatterns(rules).forEach((name, pattern)->{
			if(PatternUtils.isPatternVoid(pattern)) {
				voidPatterns.put(name, pattern);
			}
		});
	}
	
	public void setReactionContainer(ReactionContainer container) {
		this.model = container;
	}
	
	abstract public void loadModels() throws Exception;
	
	abstract public void initEngine() throws Exception;
	
	abstract protected Collection<String> getAllPatternNames();
	
	abstract protected Collection<IMatch> getMatchesAndUpdate(String patternName) throws Exception;
	
	public Collection<IMatch> getMatches(String patternName) throws Exception {
		if(voidPatterns.containsKey(patternName)) {
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
