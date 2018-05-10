package biochemsimulation.reactionrules.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class ReactionRulesHighlightingConfiguration extends DefaultHighlightingConfiguration{

	public static final String LINK_STATE_ID = "link_state";
	public static final String STATE_ID = "state";
	public static final String RULE_OPERATOR_ID = "rule_operator";
	public static final String RULE_VARIABLES_ID = "rule_variables";
	
	@Override
    public void configure(IHighlightingConfigurationAcceptor acceptor) {
        super.configure(acceptor);
        acceptor.acceptDefaultHighlighting(LINK_STATE_ID, "Link_State", linkStateTextStyle());
        acceptor.acceptDefaultHighlighting(RULE_OPERATOR_ID, "Rule_Operator", ruleOperatorTextStyle());
        acceptor.acceptDefaultHighlighting(RULE_VARIABLES_ID, "Rule_Variables", ruleVariablesTextStyle());
        acceptor.acceptDefaultHighlighting(STATE_ID, "State", stateTextStyle());
    }
	
	protected TextStyle stateTextStyle() {
		TextStyle textStyle = new TextStyle();
        textStyle.setColor(new RGB(255, 102, 0));
        textStyle.setStyle(SWT.BOLD);
        return textStyle;
	}
	
	protected TextStyle linkStateTextStyle() {
		TextStyle textStyle = new TextStyle();
        textStyle.setColor(new RGB(255, 153, 0));
        textStyle.setStyle(SWT.BOLD);
        return textStyle;
	}
	
	protected TextStyle ruleOperatorTextStyle() {
		TextStyle textStyle = new TextStyle();
        textStyle.setColor(new RGB(204, 0, 0));
        textStyle.setStyle(SWT.BOLD);
        return textStyle;
	}
	
	protected TextStyle ruleVariablesTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(159, 223, 191));
        return textStyle;
	}

}
