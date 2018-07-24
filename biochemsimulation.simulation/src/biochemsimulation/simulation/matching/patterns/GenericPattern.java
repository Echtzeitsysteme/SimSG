package biochemsimulation.simulation.matching.patterns;

import java.util.List;
import java.util.stream.Collectors;

import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;

public class GenericPattern {
	private String patternName;
	private Pattern lhs;
	private List<ValidAgentPattern> agentPatterns;
	boolean voidPattern;
	
	private GenericPatternSignature signature;
	private GenericPatternBody body;
	
	public GenericPattern(String patternName, Pattern lhs) {
		this.patternName = patternName;
		this.lhs = lhs;
		voidPattern = false;
		
		extractValidAgentPatterns();
		if(voidPattern) {
			return;
		}
		
		signature = new GenericPatternSignature(agentPatterns);
		body = new GenericPatternBody(signature, agentPatterns);
		
	}
	
	public boolean isVoidPattern() {
		return voidPattern;
	}
	
	public String getName() {
		return patternName;
	}
	
	public GenericPatternSignature getSignature() {
		return signature;
	}
	
	public GenericPatternBody getBody() {
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
