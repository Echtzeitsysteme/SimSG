package biochemsimulation.reactionrules.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;

import biochemsimulation.reactionrules.reactionRules.ArithmeticValue;
import biochemsimulation.reactionrules.reactionRules.ExactLink;
import biochemsimulation.reactionrules.reactionRules.LimitLink;
import biochemsimulation.reactionrules.reactionRules.RuleVariables;
import biochemsimulation.reactionrules.reactionRules.SiteState;

public class ReactionRulesSemanticHighlightingCalculator implements ISemanticHighlightingCalculator{
	
	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {
		if (resource == null)
			return;
		IParseResult parseResult = resource.getParseResult();
		if (parseResult == null || parseResult.getRootASTElement() == null)
			return;
		for(INode node : parseResult.getRootNode().getAsTreeIterable()) {
			EObject grammarElement = node.getGrammarElement();
			EObject semanticElement = node.getSemanticElement();
			if(grammarElement instanceof org.eclipse.xtext.impl.ActionImpl) {
				
				if(semanticElement instanceof LimitLink || semanticElement instanceof ExactLink) {
					acceptor.addPosition(node.getOffset(), node.getLength(), ReactionRulesHighlightingConfiguration.LINK_STATE_ID);
				}
				if(semanticElement instanceof SiteState ) {
					acceptor.addPosition(node.getOffset(), node.getLength(), ReactionRulesHighlightingConfiguration.STATE_ID);
				}
				
			}
			if(semanticElement instanceof ArithmeticValue ) {
				
				if(grammarElement instanceof org.eclipse.xtext.impl.RuleCallImpl ) {
					acceptor.addPosition(node.getOffset(), node.getLength(), ReactionRulesHighlightingConfiguration.NUMBER_ID);
				}
				
			}
			
			if(semanticElement instanceof RuleVariables ) {
				
				if(grammarElement instanceof org.eclipse.xtext.impl.RuleCallImpl ) {
					acceptor.addPosition(node.getOffset(), node.getLength(), ReactionRulesHighlightingConfiguration.RULE_VARIABLES_ID);
				}
			}
		
		}
	}
}