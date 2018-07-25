package biochemsimulation.simulation.matching.viatra;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SupportPatternTemplate {
	private String patternName;
	private String pattern;
	
	private Map<String, String> argumentList;
	private List<String> constraints;
	
	public SupportPatternTemplate(String patternName) {
		this.patternName = patternName;
		argumentList = new HashMap<String, String>();
		constraints = new LinkedList<String>();
	}
	
	public boolean addArgument(String variableName, String type) {
		return argumentList.putIfAbsent(variableName, type) != null;
	}
	
	public boolean addConstraint(String reference, String referencedVariable, String checkedVariable) {
		if(!argumentList.containsKey(referencedVariable)) {
			return false;
		}
		String constraint = reference + "(" + referencedVariable + ", " + checkedVariable +");";
		constraints.add(constraint);
		return true;
	}
	
	public String getPatternName() {
		return patternName;
	}

	public String getSupportPattern(boolean doUpdate) {
		if(pattern != null && !doUpdate)
			return pattern;
		buildSupportPattern();
		return pattern;
	}
	
	public String getPatternCall(List<String> args, boolean doUpdate) {
		if(doUpdate) {
			updateSupportPattern();
		}
		if(argumentList.size() == 0 || argumentList.size() != args.size()) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		sb.append(patternName+"(");
		for(String arg : args) {
			sb.append(arg+", ");
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append(")");
		return sb.toString();
	}
	
	public void updateSupportPattern() {
		buildSupportPattern();
	}
	
	private void buildSupportPattern() {
		if(argumentList.size() == 0)
			return;
		if(constraints.size() == 0)
			return;
		
		StringBuilder sb =  new StringBuilder();
		sb.append("pattern "+patternName+"(");
		for(String arg : argumentList.keySet()) {
			sb.append(arg+" : "+argumentList.get(arg)+", ");
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append(") {\n");
		for(String c : constraints) {
			sb.append("\t"+c+"\n");
		}
		sb.append("}");
		pattern = sb.toString();
	}
	
}
