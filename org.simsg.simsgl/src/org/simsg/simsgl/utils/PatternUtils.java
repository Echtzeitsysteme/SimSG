package org.simsg.simsgl.utils;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.simsg.simsgl.simSGL.AgentPattern;
import org.simsg.simsgl.simSGL.AssignFromPattern;
import org.simsg.simsgl.simSGL.AssignFromVariable;
import org.simsg.simsgl.simSGL.Initial;
import org.simsg.simsgl.simSGL.Iterations;
import org.simsg.simsgl.simSGL.NumericAssignment;
import org.simsg.simsgl.simSGL.NumericFromLiteral;
import org.simsg.simsgl.simSGL.NumericFromVariable;
import org.simsg.simsgl.simSGL.Observation;
import org.simsg.simsgl.simSGL.Pattern;
import org.simsg.simsgl.simSGL.PatternAssignment;
import org.simsg.simsgl.simSGL.PatternVariable;
import org.simsg.simsgl.simSGL.Population;
import org.simsg.simsgl.simSGL.Rule;
import org.simsg.simsgl.simSGL.SimSGLModel;
import org.simsg.simsgl.simSGL.Terminate;
import org.simsg.simsgl.simSGL.Time;
import org.simsg.simsgl.simSGL.ValidAgentPattern;

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
	
	public static boolean isPatternVoid(Pattern p) {
		if(p.getAgentPatterns().size() < 1) {
			return false;
		}
		for(AgentPattern ap : p.getAgentPatterns()) {
			if(ap instanceof ValidAgentPattern) {
				return false;
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
	
	public static List<Initial> getInitials(SimSGLModel model) {
		return model.getProperties().stream().filter(item -> (item instanceof Initial)).map(init -> (Initial) init)
				.collect(Collectors.toList());
	}
	
	public static PatternContainer createPatternContainer(SimSGLModel model) {
		PatternContainer container = new PatternContainer();
		container.addPatternVariables(getVariablePatterns(model));
		container.addRulePatterns(getRulePatterns(model));
		container.addObservablePatterns(getObservablesPatterns(model));
		container.addtermCondPopulationPatterns(getTerminationConditionPatterns(model));
		container.removeUnusedPatterns(getRules(model));
		return container;
	}
	
	public static Map<String, Pattern> getRulePatterns(SimSGLModel model) {
		return extractPatternsFromRules(getRules(model));
	}
	
	public static Map<String, Pattern> getObservablesPatterns(SimSGLModel model) {
		return extractPatternsFromObservables(getObservables(model));
	}
	
	public static Map<String, Pattern> getVariablePatterns(SimSGLModel model) {
		return extractPatternsFromVariables(getPatternVariables(model));
	}
	
	public static Map<String, Pattern> getTerminationConditionPatterns(SimSGLModel model) {
		return extractPatternsFromPopulations(getTermCondPopulation(model));
	}
	
	public static List<Rule> getRules(SimSGLModel model){
		return model.getProperties().stream().filter(item -> (item instanceof Rule)).map(rule -> (Rule) rule)
				.collect(Collectors.toList());
	}
	
	public static List<Observation> getObservables(SimSGLModel model){
		return model.getProperties().stream().filter(item -> (item instanceof Observation)).map(obs -> (Observation) obs)
				.collect(Collectors.toList());
	}
	
	public static List<PatternVariable> getPatternVariables(SimSGLModel model){
		return model.getProperties().stream().filter(item -> (item instanceof PatternVariable)).map(var -> (PatternVariable) var)
				.collect(Collectors.toList());
	}
	
	public static List<Population> getTermCondPopulation(SimSGLModel model){
		return model.getProperties().stream()
				.filter(item -> (item instanceof Terminate))
				.filter(terminate -> (((Terminate)terminate).getCondition() instanceof Population))
				.map(terminate -> (Population)(((Terminate)terminate).getCondition()))
				.collect(Collectors.toList());
	}
	
	public static List<Time> getTermCondTime(SimSGLModel model){
		return model.getProperties().stream()
				.filter(item -> (item instanceof Terminate))
				.filter(terminate -> (((Terminate)terminate).getCondition() instanceof Time))
				.map(terminate -> (Time)(((Terminate)terminate).getCondition()))
				.collect(Collectors.toList());
	}
	
	public static List<Iterations> getTermCondIteration(SimSGLModel model){
		return model.getProperties().stream()
				.filter(item -> (item instanceof Terminate))
				.filter(terminate -> (((Terminate)terminate).getCondition() instanceof Iterations))
				.map(terminate -> (Iterations)(((Terminate)terminate).getCondition()))
				.collect(Collectors.toList());
	}
	
	public static Map<String, Pattern> extractPatternsFromRules(List<Rule> rules) {
		Map<String, Pattern> rulePatterns = new LinkedHashMap<String, Pattern>();
		for (Rule rule : rules) {
			rulePatterns.put(rule.getName() + PATTERN_NAME_SUFFIX_LHS,
					PatternUtils.patternFromPatternAssignment(rule.getRule().getLhs()));
			rulePatterns.put(rule.getName() + PATTERN_NAME_SUFFIX_RHS,
					PatternUtils.patternFromPatternAssignment(rule.getRule().getRhs()));
			/*
			if (rule.getRule().getOperator().equals(RULE_OPERATOR_BI)) {
				rulePatterns.put(rule.getName() + PATTERN_NAME_SUFFIX_RHS,
						PatternUtils.patternFromPatternAssignment(rule.getRule().getRhs()));
			}
			*/
		}
		return rulePatterns;
	}
	
	public static Map<String, Pattern> extractPatternsFromObservables(List<Observation> obs) {
		Map<String, Pattern> obsPatterns = new LinkedHashMap<String, Pattern>();
		for (Observation ob : obs) {
			obsPatterns.put(ob.getName(),
					PatternUtils.patternFromPatternAssignment(ob.getObservationPattern()));
		}
		return obsPatterns;
	}
	
	public static Map<String, Pattern> extractPatternsFromVariables(List<PatternVariable> vars) {
		Map<String, Pattern> varPatterns = new LinkedHashMap<String, Pattern>();
		for (PatternVariable var : vars) {
			varPatterns.put(var.getName(), var.getPattern());
		}
		return varPatterns;
	}
	
	public static Map<String, Pattern> extractPatternsFromPopulations(List<Population> pops) {
		Map<String, Pattern> popPatterns = new LinkedHashMap<String, Pattern>();
		for (Population pop : pops) {
			popPatterns.put(((Terminate)pop.eContainer()).getName(), PatternUtils.patternFromPatternAssignment(pop.getPa()));
		}
		return popPatterns;
	}
	
	public static Map<String, Double> getRates(SimSGLModel model) {
		return extractRatesFromRules(getRules(model));
	}
	
	public static Map<String, Double> extractRatesFromRules(List<Rule> rules) {
		Map<String, Double> staticReactionRates = new LinkedHashMap<String, Double>();
		for (Rule rule : rules) {
			List<Double> reactionRates = new LinkedList<Double>();
			rule.getRule().getVariables().getVariables().forEach(var -> {
				reactionRates.add(valueOfNumericAssignment(var));
			});
			staticReactionRates.put(rule.getName() + PATTERN_NAME_SUFFIX_LHS, reactionRates.get(0));
			if (rule.getRule().getOperator().equals(RULE_OPERATOR_BI)) {
				staticReactionRates.put(rule.getName() + PATTERN_NAME_SUFFIX_RHS, reactionRates.get(1));
			}
		}
		return staticReactionRates;
	}
	
}
