package org.simsg.core.pm.pattern;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.simsg.container.util.EPackageWrapper;
import org.simsg.simsgl.simSGL.Agent;
import org.simsg.simsgl.simSGL.ValidAgentPattern;


public class GenericPatternSignature {
	
	private List<ValidAgentPattern> patterns;
	private EPackageWrapper metaModel;
	private Map<String, EClass> signatureNodes = new LinkedHashMap<>();
	private Map<ValidAgentPattern, String> patternSignatureMapping = new LinkedHashMap<>();
	private Map<String, ValidAgentPattern> signaturePatternMapping = new LinkedHashMap<>();
	private Map<EClass, List<String>> injectivityConflicts = new HashMap<>();
	
	public GenericPatternSignature(List<ValidAgentPattern> patterns, EPackageWrapper metaModel) {
		this.patterns = patterns;
		this.metaModel = metaModel;
		buildSignature();
		cleanUpInjectivityConflicts();
	}
	
	private void buildSignature() {
		
		for(ValidAgentPattern vap : patterns) {
			Agent agent = vap.getAgent();
			EClass agentClass = metaModel.getClass(agent.getName());
			if(!injectivityConflicts.containsKey(agentClass)) {
				injectivityConflicts.put(agentClass, new LinkedList<String>());
			}
			
			String name = null;
			if(vap.getVariable() != null) {
				name = vap.getVariable().getName();
			}else {
				name = agent.getName();
			}
			
			String uniqueName = name;
			int occurence = 0;
			while(signatureNodes.putIfAbsent(uniqueName, agentClass) != null) {
				occurence++;
				uniqueName = name + occurence;
			}
			
			patternSignatureMapping.put(vap, uniqueName);
			signaturePatternMapping.put(uniqueName, vap);
			
			injectivityConflicts.get(agentClass).add(uniqueName);
		}
		
	}
	
	private void cleanUpInjectivityConflicts() {
		Map<EClass, List<String>> injectivityConflicts2 = new HashMap<EClass, List<String>>();
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
	
	public Map<String, EClass> getSignature() {
		return signatureNodes;
	}
	
	public boolean containsSignatureNode(String signatureNode) {
		return signatureNodes.containsKey(signatureNode);
	}
	
	public boolean containsSignaturePattern(ValidAgentPattern pattern) {
		return patternSignatureMapping.containsKey(pattern);
	}
	
	public Map<EClass, List<String>> getInjectivityConflicts() {
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
