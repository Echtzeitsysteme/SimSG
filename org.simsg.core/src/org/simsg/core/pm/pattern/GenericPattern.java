package org.simsg.core.pm.pattern;

import java.util.List;
import java.util.stream.Collectors;

import org.simsg.container.util.EPackageWrapper;

import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;

public class GenericPattern {
	private EPackageWrapper metaModel;
	private String patternName;
	private Pattern lhs;
	private List<ValidAgentPattern> agentPatterns;
	private boolean voidPattern;
	
	private GenericPatternSignature signature;
	private GenericPatternBody body;
	
	public GenericPattern(String patternName, EPackageWrapper metaModel) {
		this.patternName = patternName;
		this.metaModel = metaModel;
		this.lhs = null;
		voidPattern = true;
	}
	
	public GenericPattern(String patternName, EPackageWrapper metaModel, Pattern lhs) {
		this.patternName = patternName;
		this.metaModel = metaModel;
		this.lhs = lhs;
		voidPattern = false;
		
		extractValidAgentPatterns();
		if(voidPattern) {
			return;
		}
		
		signature = new GenericPatternSignature(agentPatterns, this.metaModel);
		body = new GenericPatternBody(this.getName(), this.metaModel, signature, agentPatterns);
		
	}
	
	public GenericPattern(String patternName, EPackageWrapper metaModel, List<ValidAgentPattern>  agentPatterns) {
		this.patternName = patternName;
		this.metaModel = metaModel;
		voidPattern = agentPatterns.size() == 0;
		if(voidPattern) {
			return;
		}
		this.agentPatterns = agentPatterns;
		this.lhs = null;
		
		signature = new GenericPatternSignature(agentPatterns, this.metaModel);
		body = new GenericPatternBody(this.getName(), this.metaModel, signature, agentPatterns);
		
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
