package biochemsimulation.reactionrules.utils;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import biochemsimulation.reactionrules.reactionRules.AgentPattern;
import biochemsimulation.reactionrules.reactionRules.AssignFromPattern;
import biochemsimulation.reactionrules.reactionRules.AssignFromVariable;
import biochemsimulation.reactionrules.reactionRules.NumericAssignment;
import biochemsimulation.reactionrules.reactionRules.NumericFromLiteral;
import biochemsimulation.reactionrules.reactionRules.NumericFromVariable;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.PatternAssignment;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;

public class PatternUtils {
	
	public static Pattern patternFromPatternAssignment(PatternAssignment pa) {
		if(pa instanceof AssignFromPattern) {
			AssignFromPattern afp = (AssignFromPattern) pa;
			return afp.getPattern();
		}else {
			AssignFromVariable afv = (AssignFromVariable) pa;
			return afv.getPatternVar().getPattern();
		}
	}
	
	public static boolean isPatternEmpty(Pattern p) {
		if(p.getAgentPatterns().size() < 1) {
			return true;
		}else {
			for(AgentPattern ap : p.getAgentPatterns()) {
				if(ap instanceof ValidAgentPattern) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static List<ValidAgentPattern> getValidAgentPatterns(EList<AgentPattern> aps) {
		List<ValidAgentPattern> list = new LinkedList<ValidAgentPattern>();
		for(AgentPattern ap : aps) {
			if(ap instanceof ValidAgentPattern) {
				ValidAgentPattern vap = (ValidAgentPattern) ap;
				list.add(vap);
			}
		}
		return list;
	}
	
	public static double valueOfNumericAssignment(NumericAssignment na){
		return Double.valueOf(contentOfNumericAssignment(na));
	}
	
	public static String contentOfNumericAssignment(NumericAssignment na) {
		if(na instanceof NumericFromLiteral) {
			NumericFromLiteral nl = (NumericFromLiteral) na;
			return nl.getValue().getValue();
		}else {
			NumericFromVariable nv = (NumericFromVariable) na;
			return nv.getValueVar().getValue().getValue();
		}
	}
}
