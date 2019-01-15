package biochemsimulation.reactionrules.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;

import biochemsimulation.reactionrules.reactionRules.ArithmeticValue;
import biochemsimulation.reactionrules.reactionRules.BoundAnyOfTypeLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.MultiLinkSitePattern;
import biochemsimulation.reactionrules.reactionRules.RuleVariables;
import biochemsimulation.reactionrules.reactionRules.SingleSitePattern;
import biochemsimulation.reactionrules.reactionRules.Site;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.SiteState;
import biochemsimulation.reactionrules.reactionRules.TypedFreeLink;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;
import biochemsimulation.reactionrules.reactionRules.VoidAgentPattern;

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
			
			if(semanticElement instanceof SiteState ) {
				if(grammarElement instanceof org.eclipse.xtext.impl.ActionImpl ) {
					acceptor.addPosition(node.getOffset()+1, node.getLength()-2, ReactionRulesHighlightingConfiguration.STATE_ID);
				}
				
			}
			
			if(semanticElement instanceof LinkState) {
				if(grammarElement instanceof org.eclipse.xtext.impl.RuleCallImpl ) {
					acceptor.addPosition(node.getOffset(), node.getLength(), ReactionRulesHighlightingConfiguration.LINK_STATE_ID);
				}
				if(grammarElement instanceof org.eclipse.xtext.impl.ActionImpl && semanticElement instanceof BoundAnyOfTypeLink) {
					acceptor.addPosition(node.getOffset(), node.getLength(), ReactionRulesHighlightingConfiguration.LINK_STATE_ID);
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
			
			if(semanticElement instanceof VoidAgentPattern ) {
				
				if(grammarElement instanceof org.eclipse.xtext.impl.RuleCallImpl ) {
					acceptor.addPosition(node.getOffset(), node.getLength(), ReactionRulesHighlightingConfiguration.AGENT_PATTERN_ID);
				}
			}
			
			if(semanticElement instanceof ValidAgentPattern ) {
				ValidAgentPattern vap = (ValidAgentPattern)semanticElement;
				acceptor.addPosition(node.getOffset(), vap.getAgent().getName().length(), ReactionRulesHighlightingConfiguration.AGENT_PATTERN_ID);
			}
			
			if(semanticElement instanceof SitePattern ) {
				SitePattern sp = (SitePattern)semanticElement;
				Site site = null;
				if(sp instanceof SingleSitePattern) {
					site = ((SingleSitePattern)sp).getSite();
				}else {
					site = ((MultiLinkSitePattern)sp).getSite();
				}
				acceptor.addPosition(node.getOffset(), site.getName().length(), ReactionRulesHighlightingConfiguration.SITE_PATTERN_ID);
			}
			
			if(semanticElement instanceof TypedFreeLink ) {
				if(grammarElement instanceof org.eclipse.xtext.impl.CrossReferenceImpl) {
					TypedFreeLink link = (TypedFreeLink)semanticElement;
					acceptor.addPosition(node.getOffset(), link.getState().getName().length(), ReactionRulesHighlightingConfiguration.AGENT_PATTERN_ID);
				}	
			}
		
		}
	}
}
