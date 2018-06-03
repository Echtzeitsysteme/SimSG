package biochemsimulation.viatrapatterns.generator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import biochemsimulation.reactionrules.reactionRules.AgentPattern;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;

public class SimAgentTemplate {
	
	public static final String TYPE_NAME = "SimAgent";
	
	private static HashMap<Pattern, Set<String>> patternVariableNames = 
			new HashMap<Pattern, Set<String>>();
	
	private static HashMap<ValidAgentPattern, String> uniqueVariableNames = 
			new HashMap<ValidAgentPattern, String>();
	
	private static HashMap<Pattern, HashMap<ValidAgentPattern, String>> agentPatterns = 
			new HashMap<Pattern, HashMap<ValidAgentPattern,String>>();
	
	private ValidAgentPattern agentPattern;
	private String variableName;
	
	public SimAgentTemplate(ValidAgentPattern agentPattern) {
		this.agentPattern = agentPattern;
		setUniqueVariableName();
	}
	
	private void setUniqueVariableName() {
		if(uniqueVariableNames.containsKey(agentPattern)) {
			variableName = uniqueVariableNames.get(agentPattern);
		}else {
			Pattern pattern = (Pattern)agentPattern.eContainer();
			Set<String> varNameSet = null;
			if(patternVariableNames.containsKey(pattern)) {
				varNameSet = patternVariableNames.get(pattern);
				variableName = agentPattern.getAgent().getName();
				int c = 1;
				while(varNameSet.contains(variableName)) {
					variableName = agentPattern.getAgent().getName()+c;
					c++;
				}
				varNameSet.add(variableName);
				uniqueVariableNames.put(agentPattern, variableName);
				
			}else {
				variableName = agentPattern.getAgent().getName();
				varNameSet = new HashSet<String>();
				varNameSet.add(variableName);
				patternVariableNames.put(pattern, varNameSet);
				uniqueVariableNames.put(agentPattern, variableName);
			}
			
			HashMap<ValidAgentPattern, String> patterns = null;
			if(agentPatterns.containsKey(pattern)) {
				patterns = agentPatterns.get(pattern);
				if(!patterns.containsKey(agentPattern)) {
					patterns.put(agentPattern, variableName);
				}
			}else {
				patterns = new HashMap<ValidAgentPattern, String>();
				patterns.put(agentPattern, variableName);
				agentPatterns.put(pattern, patterns);
			}
		}
	}
	
}
