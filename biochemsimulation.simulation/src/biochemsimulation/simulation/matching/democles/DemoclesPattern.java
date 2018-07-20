package biochemsimulation.simulation.matching.democles;

import java.util.List;
import java.util.stream.Collectors;

import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;

class DemoclesPattern {
	private String patternName;
	private Pattern lhs;
	private List<ValidAgentPattern> agentPatterns;
	boolean voidPattern;
	
	private DemoclesPatternSignature signature;
	private DemoclesPatternBody body;
	
	DemoclesPattern(String patternName, Pattern lhs) {
		this.patternName = patternName;
		this.lhs = lhs;
		voidPattern = false;
		
		extractValidAgentPatterns();
		if(voidPattern) {
			return;
		}
		
		signature = new DemoclesPatternSignature(agentPatterns);
		body = new DemoclesPatternBody(signature, agentPatterns);
		
	}
	
	boolean isVoidPattern() {
		return voidPattern;
	}
	
	String getName() {
		return patternName;
	}
	
	DemoclesPatternSignature getSignature() {
		return signature;
	}
	
	DemoclesPatternBody getBody() {
		return body;
	}
	
	private void extractValidAgentPatterns() {
		agentPatterns = lhs.getAgentPatterns().stream()
			.filter(pattern -> (pattern instanceof ValidAgentPattern))
			.map(pattern -> (ValidAgentPattern)pattern)
			.collect(Collectors.toList());
		
		if(agentPatterns.size() == 0) {
			voidPattern = true;
		}
	}
}
