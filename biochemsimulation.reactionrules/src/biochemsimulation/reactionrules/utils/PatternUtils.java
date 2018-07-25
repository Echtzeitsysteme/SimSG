package biochemsimulation.reactionrules.utils;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

import biochemsimulation.reactionrules.reactionRules.AgentPattern;
import biochemsimulation.reactionrules.reactionRules.AssignFromPattern;
import biochemsimulation.reactionrules.reactionRules.AssignFromVariable;
import biochemsimulation.reactionrules.reactionRules.NumericAssignment;
import biochemsimulation.reactionrules.reactionRules.NumericFromLiteral;
import biochemsimulation.reactionrules.reactionRules.NumericFromVariable;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.PatternAssignment;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.reactionRules.Rule;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;

public class PatternUtils {
	
	final public static String RULE_OPERATOR_UNI = "->";
	final public static String RULE_OPERATOR_BI = "<->";
	final public static String PATTERN_NAME_SUFFIX_RHS = "_rhs";
	final public static String PATTERN_NAME_SUFFIX_LHS = "_lhs";
	
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
	
	public static Map<String, Pattern> getPatterns(ReactionRuleModel model) {
		return extractPatternsFromRules(getRules(model));
	}
	
	public static List<Rule> getRules(ReactionRuleModel model){
		return model.getReactionProperties().stream().filter(item -> (item instanceof Rule)).map(rule -> (Rule) rule)
				.collect(Collectors.toList());
	}
	
	public static Map<String, Pattern> extractPatternsFromRules(List<Rule> rules) {
		Map<String, Pattern> rulePatterns = new LinkedHashMap<String, Pattern>();
		for (Rule rule : rules) {
			rulePatterns.put(rule.getName() + PATTERN_NAME_SUFFIX_LHS,
					PatternUtils.patternFromPatternAssignment(rule.getRule().getLhs()));
			if (rule.getRule().getOperator().equals(RULE_OPERATOR_BI)) {
				rulePatterns.put(rule.getName() + PATTERN_NAME_SUFFIX_RHS,
						PatternUtils.patternFromPatternAssignment(rule.getRule().getRhs()));
			}
		}
		return rulePatterns;
	}
}
