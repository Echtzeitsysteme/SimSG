package biochemsimulation.simulation.matching.viatra;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;

public class PatternViatraTemplate {
	public final static String DELIMITER = ";";
	public final static String OP_NOTEQUAL = "!=";
	public final static String OP_TYPEASSIGN = ":";
	public final static String TYPE_SIMAGENT ="SimAgent";
	
	private String patternName;
	private Pattern pattern;
	
	private List<ValidAgentPattern> vap;
	private Map<ValidAgentPattern, String> invUniqueVariableNames;
	private Map<String, ValidAgentPattern> uniqueVariableNames;
	private Map<String, List<String>> injectivityConstraintCandidates;
	boolean isVoidPattern;
	
	private List<String> injectivityConstraints;
	private List<String> patternArgumentList;
	private List<String> patternBody;
	
	private Map<String, String> siteReferences;
	private Map<String, AgentPatternViatraTemplate> agentPatternTemplateMap;
	
	public PatternViatraTemplate(String patternName, Pattern pattern) {
		this.patternName = patternName;
		this.pattern = pattern;
		isVoidPattern = false;
		extractValidAgentPatterns();
		initUniqueVariableNames();
		extractSiteReferences();
		initAgentPatternTemplates();
		buildInjectivityConstraints();
		buildPatternArgumentList();
		buildPatternBody();
	}
	
	public boolean isVoidPattern() {
		return isVoidPattern;
	}

	public String getPatternName() {
		return patternName;
	}

	public List<String> getInjectivityConstraints() {
		return injectivityConstraints;
	}

	public List<String> getPatternArgumentList() {
		return patternArgumentList;
	}

	public List<String> getPatternBody() {
		return patternBody;
	}

	private void extractValidAgentPatterns() {
		vap = new LinkedList<ValidAgentPattern>();	
		pattern.getAgentPatterns().forEach(x-> { 
			if(x instanceof ValidAgentPattern) 
				vap.add((ValidAgentPattern)x); 
			});
		if(vap.size() == 0) {
			isVoidPattern = true;
		}
	}
	
	private void initUniqueVariableNames() {
		uniqueVariableNames = new HashMap<String, ValidAgentPattern>();
		invUniqueVariableNames = new HashMap<ValidAgentPattern, String>();
		injectivityConstraintCandidates = new HashMap<String, List<String>>();
		for(ValidAgentPattern p : vap) {
			createUniqueVariableName(p);
		}
	}
	
	private void createUniqueVariableName(ValidAgentPattern p) {
		String agentType = p.getAgent().getName();
		StringBuilder sb = new StringBuilder();
		sb.append(agentType);
		
		int c = 1;
		boolean needsInjectivityConstraint = false;
		while(uniqueVariableNames.putIfAbsent(sb.toString(), p) != null) {
			addInjectivityConstraintCandidate(agentType, sb.toString());
			sb.delete(0, sb.length());
			sb.append(agentType);
			sb.append(c);
			needsInjectivityConstraint = true;
			c++;
		}
		
		invUniqueVariableNames.put(p, sb.toString());
		
		if(needsInjectivityConstraint) {
			addInjectivityConstraintCandidate(agentType, sb.toString());
		}
		
	}
	
	private void extractSiteReferences() {
		Map<SitePattern, ValidAgentPattern> sitePatterns = new HashMap<SitePattern, ValidAgentPattern>();
		for(ValidAgentPattern p : vap) {
			p.getSitePatterns().getSitePatterns().forEach(x-> {
				LinkState ls = x.getLinkState().getLinkState();
				if(ls instanceof BoundLink) {
					sitePatterns.put(x, p);
				}
			});
		}
		siteReferences = new HashMap<String, String>();
		for(SitePattern sp1 : sitePatterns.keySet()) {
			BoundLink bl1 = (BoundLink) sp1.getLinkState().getLinkState();
			String index1 = bl1.getState();
			for(SitePattern sp2 : sitePatterns.keySet()) {
				BoundLink bl2 = (BoundLink) sp2.getLinkState().getLinkState();
				String index2 = bl2.getState();
				if(!bl1.equals(bl2) && index1.equals(index2)) {
					if(!siteReferences.containsKey(index1)) {
						String ref = invUniqueVariableNames.get(sitePatterns.get(sp1)) + SitePatternViatraTemplate.SEPARATOR_VARIABLE_NAMES +
								sp1.getSite().getName() + SitePatternViatraTemplate.SEPARATOR_VARIABLE_NAMES + SitePatternViatraTemplate.SUFFIX_LINK_STATE_VARIABLE;
						siteReferences.put(index1, ref);
					}
				}
			}
		}
	}
	
	private void initAgentPatternTemplates() {
		agentPatternTemplateMap = new HashMap<String, AgentPatternViatraTemplate>();
		for(String apVarName : uniqueVariableNames.keySet()) {
			agentPatternTemplateMap.put(apVarName, 
					new AgentPatternViatraTemplate(uniqueVariableNames.get(apVarName), apVarName, siteReferences));
		}
		
	}
	
	private void buildInjectivityConstraints() {
		injectivityConstraints = new LinkedList<String>();
		Map<Integer, String> constrainMap = new HashMap<Integer, String>();
		
		for(String key : injectivityConstraintCandidates.keySet()) {
			List<String> candidates = injectivityConstraintCandidates.get(key);
			for(String current : candidates) {
				for(String current2 : candidates) {
					if(!current.equals(current2)) {
						String constrain1 = current + OP_NOTEQUAL + current2 + DELIMITER;
						String constrain2 = current2 + OP_NOTEQUAL + current + DELIMITER;
						int constrainKey = Math.max(constrain1.hashCode(), constrain2.hashCode());
						constrainMap.putIfAbsent(constrainKey, constrain1);
					}
				}
			}
		}
		
		injectivityConstraints.addAll(constrainMap.values());
	}
	
		
	private void addInjectivityConstraintCandidate(String agentType, String uniqueVaribaleName) {
		if(injectivityConstraintCandidates.containsKey(agentType)) {
			injectivityConstraintCandidates.get(agentType).add(uniqueVaribaleName);
		}else {
			List<String> candidates = new LinkedList<String>();
			candidates.add(uniqueVaribaleName);
			injectivityConstraintCandidates.put(agentType, candidates);
		}
	}
	
	private void buildPatternArgumentList() {
		patternArgumentList = new LinkedList<String>();
		for(String var : uniqueVariableNames.keySet()) {
			String argument = var + " " + OP_TYPEASSIGN + " " + TYPE_SIMAGENT;
			patternArgumentList.add(argument);
		}
	}
	
	private void buildPatternBody() {
		patternBody = new LinkedList<String>();
		for(AgentPatternViatraTemplate apTemplate : agentPatternTemplateMap.values()) {
			StringBuilder sb = new StringBuilder();
			sb.append("// Context for agent pattern:\n");
			sb.append(apTemplate.getSimAgentTypeCheck() + "\n");
			sb.append("// Context and checks for site patterns:\n");
			for(String ssCheck : apTemplate.getSimSiteChecks()) {
				sb.append(ssCheck + "\n");
			}
			patternBody.add(sb.toString());
		}
	}
}
