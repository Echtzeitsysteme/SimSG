package biochemsimulation.simulation.matching;

import biochemsimulation.reactioncontainer.ReactionContainer;

import java.util.Collection;
import java.util.Map;

import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

public interface PatternMatchingEngine {
	
	public void initEngine(ReactionContainer model) throws Exception;
	
	public void initMatcher(PatternModel patternModel) throws Exception;
	
	public Collection<? extends IPatternMatch> getMatches(String patternName) throws Exception;
	
	public Map<String, Collection<? extends IPatternMatch>> getAllMatches() throws Exception;
	
	public void wipeEngine();
	
	public void disposeEngine();
	
}
