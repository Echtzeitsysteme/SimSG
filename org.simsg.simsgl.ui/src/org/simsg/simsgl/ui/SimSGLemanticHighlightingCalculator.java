package org.simsg.simsgl.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;

import org.simsg.simsgl.simSGL.*;


public class SimSGLemanticHighlightingCalculator implements ISemanticHighlightingCalculator{
	
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
					acceptor.addPosition(node.getOffset()+1, node.getLength()-2, SimSGLHighlightingConfiguration.STATE_ID);
				}
				
			}
			
			if(semanticElement instanceof LinkState) {
				if(grammarElement instanceof org.eclipse.xtext.impl.RuleCallImpl ) {
					acceptor.addPosition(node.getOffset(), node.getLength(), SimSGLHighlightingConfiguration.LINK_STATE_ID);
				}
				if(grammarElement instanceof org.eclipse.xtext.impl.ActionImpl && semanticElement instanceof BoundAnyOfTypeLink) {
					acceptor.addPosition(node.getOffset(), node.getLength(), SimSGLHighlightingConfiguration.LINK_STATE_ID);
				}
				
			}
			
			if(semanticElement instanceof ArithmeticValue ) {
				
				if(grammarElement instanceof org.eclipse.xtext.impl.RuleCallImpl ) {
					acceptor.addPosition(node.getOffset(), node.getLength(), SimSGLHighlightingConfiguration.NUMBER_ID);
				}
				
			}
			
			if(semanticElement instanceof RuleVariables ) {
				
				if(grammarElement instanceof org.eclipse.xtext.impl.RuleCallImpl ) {
					acceptor.addPosition(node.getOffset(), node.getLength(), SimSGLHighlightingConfiguration.RULE_VARIABLES_ID);
				}
			}
			
			if(semanticElement instanceof VoidAgentPattern ) {
				
				if(grammarElement instanceof org.eclipse.xtext.impl.RuleCallImpl ) {
					acceptor.addPosition(node.getOffset(), node.getLength(), SimSGLHighlightingConfiguration.AGENT_PATTERN_ID);
				}
			}
			
			if(semanticElement instanceof ValidAgentPattern ) {
				ValidAgentPattern vap = (ValidAgentPattern)semanticElement;
				acceptor.addPosition(node.getOffset(), vap.getAgent().getName().length(), SimSGLHighlightingConfiguration.AGENT_PATTERN_ID);
			}
			
			if(semanticElement instanceof SitePattern ) {
				SitePattern sp = (SitePattern)semanticElement;
				Site site = null;
				if(sp instanceof SingleSitePattern) {
					site = ((SingleSitePattern)sp).getSite();
				}else {
					site = ((MultiLinkSitePattern)sp).getSite();
				}
				acceptor.addPosition(node.getOffset(), site.getName().length(), SimSGLHighlightingConfiguration.SITE_PATTERN_ID);
			}
			
			if(semanticElement instanceof TypedFreeLink ) {
				if(grammarElement instanceof org.eclipse.xtext.impl.CrossReferenceImpl) {
					TypedFreeLink link = (TypedFreeLink)semanticElement;
					acceptor.addPosition(node.getOffset(), link.getState().getName().length(), SimSGLHighlightingConfiguration.AGENT_PATTERN_ID);
				}	
			}
		
		}
	}
}
