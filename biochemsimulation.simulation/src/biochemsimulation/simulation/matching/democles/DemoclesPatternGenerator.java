package biochemsimulation.simulation.matching.democles;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintFactory;

import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.reactionRules.Rule;
import biochemsimulation.reactionrules.utils.PatternUtils;

public class DemoclesPatternGenerator {

	final public static String RULE_OPERATOR_UNI = "->";
	final public static String RULE_OPERATOR_BI = "<->";
	final public static String PATTERN_NAME_SUFFIX_RHS = "_rhs";
	final public static String PATTERN_NAME_SUFFIX_LHS = "_lhs";

	public static final SpecificationFactory specificationFactory = SpecificationFactory.eINSTANCE;
	public static final EMFTypeFactory emfTypeFactory = EMFTypeFactory.eINSTANCE;
	public static final RelationalConstraintFactory relationalConstraintFactory = RelationalConstraintFactory.eINSTANCE;

	private List<Rule> rules;
	private Map<String, Pattern> rulePatterns;
	private List<DemoclesPattern> genericPatterns;

	public DemoclesPatternGenerator(ReactionRuleModel model) {
		rules = model.getReactionProperties().stream().filter(item -> (item instanceof Rule)).map(rule -> (Rule) rule)
				.collect(Collectors.toList());
		extractPatterns();
		generateGenericPatterns();
	}

	private void extractPatterns() {
		rulePatterns = new LinkedHashMap<String, Pattern>();
		for (Rule rule : rules) {
			rulePatterns.put(rule.getName() + PATTERN_NAME_SUFFIX_LHS,
					PatternUtils.patternFromPatternAssignment(rule.getRule().getLhs()));
			if (rule.getRule().getOperator().equals(RULE_OPERATOR_BI)) {
				rulePatterns.put(rule.getName() + PATTERN_NAME_SUFFIX_RHS,
						PatternUtils.patternFromPatternAssignment(rule.getRule().getRhs()));
			}
		}
	}

	private void generateGenericPatterns() {
		genericPatterns = new LinkedList<DemoclesPattern>();
		rulePatterns.forEach((name, pattern) -> {
			genericPatterns.add(new DemoclesPattern(name, pattern));
		});
	}

	public List<org.gervarro.democles.specification.emf.Pattern> doGenerate() {
		List<org.gervarro.democles.specification.emf.Pattern> generated = new LinkedList<>();
		for (DemoclesPattern srcPattern : genericPatterns) {
			org.gervarro.democles.specification.emf.Pattern trgPattern = specificationFactory.createPattern();
			transformSignature(trgPattern, srcPattern.getSignature());
			transformBody(trgPattern, srcPattern.getBody());
			// 1. Create new democles pattern
			// 2. transform generic pattern signature to democles pattern signature
			// 3. transform generic body to democles body
			// 4. ...
			// 5. Add pattern to list
		}
		return generated;
	}

	private static void transformSignature(org.gervarro.democles.specification.emf.Pattern trgPattern,
			DemoclesPatternSignature signature) {
		
		signature.getSignature().forEach((variableName, type) -> {
			trgPattern.getSymbolicParameters().add(createEMFVariable(variableName, type));
		});
	}
	
	private static void transformBody(org.gervarro.democles.specification.emf.Pattern trgPattern,
			DemoclesPatternBody body) {
		PatternBody trgPatternBody = specificationFactory.createPatternBody();
		trgPattern.getBodies().add(trgPatternBody);
		// ToDo...
		for(AgentNodeContext agentNode : body.getAgentNodeContexts().values()) {
			// ToDo...
		}
		
	}

	private static EMFVariable createEMFVariable(String name, EClassifier nodeType) {
		EMFVariable variable = emfTypeFactory.createEMFVariable();
		variable.setName(name);
		variable.setEClassifier(nodeType);
		return variable;
	}
	
	private static Attribute createAttributeConstraint(EAttribute nodeAttribute) {
		Attribute attribute = emfTypeFactory.createAttribute();
		return attribute;
	}
}
