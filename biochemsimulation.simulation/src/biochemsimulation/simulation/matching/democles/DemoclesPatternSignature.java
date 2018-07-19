package biochemsimulation.simulation.matching.democles;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClassifier;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactionrules.reactionRules.Agent;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;

class DemoclesPatternSignature {
	final static EClassifier SIM_AGENT_CLASSIFIER = ReactionContainerPackage.Literals.SIM_AGENT;
	
	List<ValidAgentPattern> patterns;
	Map<String, EClassifier> signatureNodes;
	Map<String, List<String>> injectivityConflicts;
	
	DemoclesPatternSignature(List<ValidAgentPattern> patterns) {
		this.patterns = patterns;
		signatureNodes = new LinkedHashMap<String, EClassifier>();
		injectivityConflicts = new HashMap<String, List<String>>();
		buildSignature();
		cleanUpInjectivityConflicts();
	}
	
	private void buildSignature() {
		for(ValidAgentPattern vap : patterns) {
			Agent agent = vap.getAgent();
			String name = agent.getName();
			if(!injectivityConflicts.containsKey(name)) {
				injectivityConflicts.put(name, new LinkedList<String>());
			}
			
			int occurence = 0;
			while(signatureNodes.putIfAbsent(name, SIM_AGENT_CLASSIFIER) != null) {
				occurence++;
				name = agent.getName() + occurence;
			}
			
			if(occurence > 0) {
				injectivityConflicts.get(agent.getName()).add(name);
			}
		}
		
	}
	
	private void cleanUpInjectivityConflicts() {
		Map<String, List<String>> injectivityConflicts2 = new HashMap<String, List<String>>();
		injectivityConflicts.forEach((name, list) -> {
			if(list.size()>0) {
				injectivityConflicts2.put(name, list);
			}
		});
		injectivityConflicts = injectivityConflicts2;
	}
	
	Map<String, EClassifier> getSignature() {
		return signatureNodes;
	}
}
