package biochemsimulation.simulation.matching.democles;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.reactionRules.Rule;

public class DemoclesPatternGenerator {
	
	private List<Rule> rules;
	
	public DemoclesPatternGenerator(ReactionRuleModel model) {
		rules = model.getReactionProperties().stream()
				.filter( item -> (item instanceof Rule))
				.map(rule->(Rule)rule)
				.collect(Collectors.toList());
	}
}
