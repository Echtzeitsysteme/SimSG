package biochemsimulation.simulation.matching.patterns;

import java.util.List;
import java.util.stream.Collectors;

import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;

public class GenericPattern {
	private String patternName;
	private Pattern lhs;
	private List<ValidAgentPattern> agentPatterns;
	private boolean voidPattern;
	
	private GenericPatternSignature signature;
	private GenericPatternBody body;
	
	public GenericPattern(String patternName) {
		this.patternName = patternName;
		this.lhs = null;
		voidPattern = true;
	}
	
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
	
	public GenericPattern(String patternName, List<ValidAgentPattern>  agentPatterns) {
		this.patternName = patternName;
		voidPattern = agentPatterns.size() == 0;
		if(voidPattern) {
			return;
		}
		this.agentPatterns = agentPatterns;
		this.lhs = null;
		
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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("******");
		sb.append("\n<Pattern>: " + patternName + "\n");
		sb.append(signature.toString() + "\n");
		sb.append(body.toString() + "\n");
		sb.append("</Pattern>\n");
		sb.append("******");
		return sb.toString();
	}
}
