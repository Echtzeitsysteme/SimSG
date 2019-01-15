package org.simsg.simsgl.ui;

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;

public class SimSGLAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
	protected boolean isRuleOperator(String tokenName) {
		switch(tokenName) {
		case "RULE_AT" : return true;
		case "RULE_BI" : return true;
		case "RULE_UNI" : return true;
		default: return false;
		}
		
	}
	
	protected boolean isLinkStateEnum(String tokenName) {
		switch(tokenName) {
		case "RULE_SEMI_LINK" : return true;
		case "RULE_FREE_LINK" : return true;
		case "RULE_WHATEVER_LINK" : return true;
		default: return false;
		}
		
	}
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		//System.out.println(tokenName);
		if("RULE_EXPONENT".equals(tokenName)) {
			return HighlightingStyles.NUMBER_ID;
		}
		if (isRuleOperator(tokenName)) {
			return SimSGLHighlightingConfiguration.RULE_OPERATOR_ID;
		}
		if (isLinkStateEnum(tokenName)) {
			return SimSGLHighlightingConfiguration.LINK_STATE_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}
}
