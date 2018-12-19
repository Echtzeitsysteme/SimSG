package biochemsimulation.reactioncontainer.generator;

import java.util.List;
import java.util.stream.Collectors;

import biochemsimulation.reactionrules.reactionRules.Agent;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;
import biochemsimulation.reactionrules.utils.PatternUtils;

public class InitializationTemplate {

	List<ValidAgentPattern> agentPatterns;
	List<Agent> agents;
	
	public InitializationTemplate(Pattern pattern) {
		PatternUtils.getValidAgentPatterns(pattern.getAgentPatterns());
		findRequiredAgents();
	}
	
	private void findRequiredAgents() {
		agents = agentPatterns.stream().map(ap -> ap.getAgent()).collect(Collectors.toList());
	}
	
	
}
