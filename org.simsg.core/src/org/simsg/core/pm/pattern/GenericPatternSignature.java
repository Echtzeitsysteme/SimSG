package org.simsg.core.pm.pattern;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.simsg.container.util.EPackageWrapper;

import biochemsimulation.reactionrules.reactionRules.Agent;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;

public class GenericPatternSignature {
	//public final static EClassifier SIM_AGENT_CLASSIFIER = ReactionContainerPackage.Literals.SIM_AGENT;
	
	private List<ValidAgentPattern> patterns;
	private EPackageWrapper metaModel;
	private Map<String, EClassifier> signatureNodes;
	private Map<ValidAgentPattern, String> patternSignatureMapping;
	private Map<String, ValidAgentPattern> signaturePatternMapping;
	private Map<String, List<String>> injectivityConflicts;
	
	public GenericPatternSignature(List<ValidAgentPattern> patterns, EPackageWrapper metaModel) {
		this.patterns = patterns;
		this.metaModel = metaModel;
		buildSignature();
		cleanUpInjectivityConflicts();
	}
	
	private void buildSignature() {
		signatureNodes = new LinkedHashMap<String, EClassifier>();
		patternSignatureMapping = new HashMap<ValidAgentPattern, String>();
		signaturePatternMapping = new HashMap<String, ValidAgentPattern>();
		injectivityConflicts = new HashMap<String, List<String>>();
		
		for(ValidAgentPattern vap : patterns) {
			Agent agent = vap.getAgent();
			String name = agent.getName();
			if(!injectivityConflicts.containsKey(name)) {
				injectivityConflicts.put(name, new LinkedList<String>());
			}
			
			int occurence = 0;
			while(signatureNodes.putIfAbsent(name, metaModel.getClass(agent.getName())) != null) {
				occurence++;
				name = agent.getName() + occurence;
			}
			
			patternSignatureMapping.put(vap, name);
			signaturePatternMapping.put(name, vap);
			
			injectivityConflicts.get(agent.getName()).add(name);
		}
		
	}
	
	private void cleanUpInjectivityConflicts() {
		Map<String, List<String>> injectivityConflicts2 = new HashMap<String, List<String>>();
		injectivityConflicts.forEach((name, list) -> {
			if(list.size()>1) {
				injectivityConflicts2.put(name, list);
			}
		});
		injectivityConflicts = injectivityConflicts2;
	}
	
	public String getSignatureNode(ValidAgentPattern pattern) {
		return patternSignatureMapping.get(pattern);
	}
	
	public ValidAgentPattern getSignaturePattern(String signatureNode) {
		return signaturePatternMapping.get(signatureNode);
	}
	
	public Map<String, EClassifier> getSignature() {
		return signatureNodes;
	}
	
	public boolean containsSignatureNode(String signatureNode) {
		return signatureNodes.containsKey(signatureNode);
	}
	
	public boolean containsSignaturePattern(ValidAgentPattern pattern) {
		return patternSignatureMapping.containsKey(pattern);
	}
	
	public Map<String, List<String>> getInjectivityConflicts() {
		return injectivityConflicts;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("##<Signature>: ");
		for(String sigNode : signatureNodes.keySet()) {
			sb.append(sigNode+", ");
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append("\n##</Signature>");
		
		return sb.toString();
	}
}
