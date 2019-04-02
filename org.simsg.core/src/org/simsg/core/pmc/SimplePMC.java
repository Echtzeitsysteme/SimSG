package org.simsg.core.pmc;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.simsg.core.pm.match.IMatch;
import org.simsg.core.pm.pattern.GenericPattern;
import org.simsg.simsgl.simSGL.Pattern;


public class SimplePMC extends PatternMatchingController {

	public SimplePMC() {
		super();
	}
	
	@Override
	protected void feedEngine() throws Exception{
		//Map<String, Pattern> patterns = PatternUtils.getRulePatterns(ruleModel);
		Collection<Pattern> patterns = patternContainer.getAllPatterns();
		Map<String, GenericPattern> genericPatterns = new HashMap<String, GenericPattern>();
		for(Pattern pattern : patterns) {
			genericPatterns.put(patternContainer.getPatternHash(pattern), new GenericPattern(patternContainer.getPatternHash(pattern), metaModel, pattern));
		}
		engine.setReactionRules(genericPatterns);
		engine.setReactionContainer(reactionContainer, metaModel.getPackage());
		engine.loadModels();
	}

	@Override
	public Collection<IMatch> getMatches(String patternName) {
		String patternHash = patternContainer.getPatternHash(patternName);
		if(matches.get(patternHash) != null) {
			return matches.get(patternHash);
		}
		return new LinkedList<IMatch>();
	}

	@Override
	public Map<String, Collection<IMatch>> getAllMatches() {
		return matches;
	}

	@Override
	public void setAdditionalParameters(Object... params) {
		// TODO Auto-generated method stub
		
	}

	
}
