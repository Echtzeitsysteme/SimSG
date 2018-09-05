package biochemsimulation.reactionrules.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import biochemsimulation.reactionrules.services.ReactionRulesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReactionRulesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_EXPONENT", "RULE_AT", "RULE_ID", "RULE_BOUND_LINK", "RULE_FREE_LINK", "RULE_WHATEVER_LINK", "RULE_VOID_PATTERN", "RULE_UNI", "RULE_BI", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'+'", "'ModelID'", "'.'", "'{'", "'}'", "','", "'('", "')'", "'agent'", "'var'", "'='", "'['", "']'", "'obs'", "'init'", "'rule'", "'iterations'", "'time'", "'|'", "'==>'", "'terminate'"
    };
    public static final int RULE_FREE_LINK=9;
    public static final int RULE_STRING=14;
    public static final int RULE_AT=6;
    public static final int RULE_WHATEVER_LINK=10;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_VOID_PATTERN=11;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=17;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_BOUND_LINK=8;
    public static final int RULE_BI=13;
    public static final int RULE_EXPONENT=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int RULE_UNI=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalReactionRulesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReactionRulesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReactionRulesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalReactionRules.g"; }


    	private ReactionRulesGrammarAccess grammarAccess;

    	public void setGrammarAccess(ReactionRulesGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleReactionRuleModel"
    // InternalReactionRules.g:53:1: entryRuleReactionRuleModel : ruleReactionRuleModel EOF ;
    public final void entryRuleReactionRuleModel() throws RecognitionException {
        try {
            // InternalReactionRules.g:54:1: ( ruleReactionRuleModel EOF )
            // InternalReactionRules.g:55:1: ruleReactionRuleModel EOF
            {
             before(grammarAccess.getReactionRuleModelRule()); 
            pushFollow(FOLLOW_1);
            ruleReactionRuleModel();

            state._fsp--;

             after(grammarAccess.getReactionRuleModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReactionRuleModel"


    // $ANTLR start "ruleReactionRuleModel"
    // InternalReactionRules.g:62:1: ruleReactionRuleModel : ( ( rule__ReactionRuleModel__Group__0 ) ) ;
    public final void ruleReactionRuleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:66:2: ( ( ( rule__ReactionRuleModel__Group__0 ) ) )
            // InternalReactionRules.g:67:2: ( ( rule__ReactionRuleModel__Group__0 ) )
            {
            // InternalReactionRules.g:67:2: ( ( rule__ReactionRuleModel__Group__0 ) )
            // InternalReactionRules.g:68:3: ( rule__ReactionRuleModel__Group__0 )
            {
             before(grammarAccess.getReactionRuleModelAccess().getGroup()); 
            // InternalReactionRules.g:69:3: ( rule__ReactionRuleModel__Group__0 )
            // InternalReactionRules.g:69:4: rule__ReactionRuleModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactionRuleModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactionRuleModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReactionRuleModel"


    // $ANTLR start "entryRuleModel"
    // InternalReactionRules.g:78:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalReactionRules.g:79:1: ( ruleModel EOF )
            // InternalReactionRules.g:80:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalReactionRules.g:87:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:91:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalReactionRules.g:92:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalReactionRules.g:92:2: ( ( rule__Model__Group__0 ) )
            // InternalReactionRules.g:93:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalReactionRules.g:94:3: ( rule__Model__Group__0 )
            // InternalReactionRules.g:94:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleReactionProperty"
    // InternalReactionRules.g:103:1: entryRuleReactionProperty : ruleReactionProperty EOF ;
    public final void entryRuleReactionProperty() throws RecognitionException {
        try {
            // InternalReactionRules.g:104:1: ( ruleReactionProperty EOF )
            // InternalReactionRules.g:105:1: ruleReactionProperty EOF
            {
             before(grammarAccess.getReactionPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleReactionProperty();

            state._fsp--;

             after(grammarAccess.getReactionPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReactionProperty"


    // $ANTLR start "ruleReactionProperty"
    // InternalReactionRules.g:112:1: ruleReactionProperty : ( ( rule__ReactionProperty__Alternatives ) ) ;
    public final void ruleReactionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:116:2: ( ( ( rule__ReactionProperty__Alternatives ) ) )
            // InternalReactionRules.g:117:2: ( ( rule__ReactionProperty__Alternatives ) )
            {
            // InternalReactionRules.g:117:2: ( ( rule__ReactionProperty__Alternatives ) )
            // InternalReactionRules.g:118:3: ( rule__ReactionProperty__Alternatives )
            {
             before(grammarAccess.getReactionPropertyAccess().getAlternatives()); 
            // InternalReactionRules.g:119:3: ( rule__ReactionProperty__Alternatives )
            // InternalReactionRules.g:119:4: rule__ReactionProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ReactionProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReactionPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReactionProperty"


    // $ANTLR start "entryRuleFloat"
    // InternalReactionRules.g:128:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:132:1: ( ruleFloat EOF )
            // InternalReactionRules.g:133:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalReactionRules.g:143:1: ruleFloat : ( ( rule__Float__Group__0 ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:148:2: ( ( ( rule__Float__Group__0 ) ) )
            // InternalReactionRules.g:149:2: ( ( rule__Float__Group__0 ) )
            {
            // InternalReactionRules.g:149:2: ( ( rule__Float__Group__0 ) )
            // InternalReactionRules.g:150:3: ( rule__Float__Group__0 )
            {
             before(grammarAccess.getFloatAccess().getGroup()); 
            // InternalReactionRules.g:151:3: ( rule__Float__Group__0 )
            // InternalReactionRules.g:151:4: rule__Float__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleScientificFloat"
    // InternalReactionRules.g:161:1: entryRuleScientificFloat : ruleScientificFloat EOF ;
    public final void entryRuleScientificFloat() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:165:1: ( ruleScientificFloat EOF )
            // InternalReactionRules.g:166:1: ruleScientificFloat EOF
            {
             before(grammarAccess.getScientificFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleScientificFloat();

            state._fsp--;

             after(grammarAccess.getScientificFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleScientificFloat"


    // $ANTLR start "ruleScientificFloat"
    // InternalReactionRules.g:176:1: ruleScientificFloat : ( ( rule__ScientificFloat__Group__0 ) ) ;
    public final void ruleScientificFloat() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:181:2: ( ( ( rule__ScientificFloat__Group__0 ) ) )
            // InternalReactionRules.g:182:2: ( ( rule__ScientificFloat__Group__0 ) )
            {
            // InternalReactionRules.g:182:2: ( ( rule__ScientificFloat__Group__0 ) )
            // InternalReactionRules.g:183:3: ( rule__ScientificFloat__Group__0 )
            {
             before(grammarAccess.getScientificFloatAccess().getGroup()); 
            // InternalReactionRules.g:184:3: ( rule__ScientificFloat__Group__0 )
            // InternalReactionRules.g:184:4: rule__ScientificFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScientificFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScientificFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleScientificFloat"


    // $ANTLR start "entryRuleUnsignedInteger"
    // InternalReactionRules.g:194:1: entryRuleUnsignedInteger : ruleUnsignedInteger EOF ;
    public final void entryRuleUnsignedInteger() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:198:1: ( ruleUnsignedInteger EOF )
            // InternalReactionRules.g:199:1: ruleUnsignedInteger EOF
            {
             before(grammarAccess.getUnsignedIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleUnsignedInteger();

            state._fsp--;

             after(grammarAccess.getUnsignedIntegerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleUnsignedInteger"


    // $ANTLR start "ruleUnsignedInteger"
    // InternalReactionRules.g:209:1: ruleUnsignedInteger : ( RULE_INT ) ;
    public final void ruleUnsignedInteger() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:214:2: ( ( RULE_INT ) )
            // InternalReactionRules.g:215:2: ( RULE_INT )
            {
            // InternalReactionRules.g:215:2: ( RULE_INT )
            // InternalReactionRules.g:216:3: RULE_INT
            {
             before(grammarAccess.getUnsignedIntegerAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUnsignedIntegerAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleUnsignedInteger"


    // $ANTLR start "entryRuleSignedInteger"
    // InternalReactionRules.g:227:1: entryRuleSignedInteger : ruleSignedInteger EOF ;
    public final void entryRuleSignedInteger() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:231:1: ( ruleSignedInteger EOF )
            // InternalReactionRules.g:232:1: ruleSignedInteger EOF
            {
             before(grammarAccess.getSignedIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleSignedInteger();

            state._fsp--;

             after(grammarAccess.getSignedIntegerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleSignedInteger"


    // $ANTLR start "ruleSignedInteger"
    // InternalReactionRules.g:242:1: ruleSignedInteger : ( ( rule__SignedInteger__Group__0 ) ) ;
    public final void ruleSignedInteger() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:247:2: ( ( ( rule__SignedInteger__Group__0 ) ) )
            // InternalReactionRules.g:248:2: ( ( rule__SignedInteger__Group__0 ) )
            {
            // InternalReactionRules.g:248:2: ( ( rule__SignedInteger__Group__0 ) )
            // InternalReactionRules.g:249:3: ( rule__SignedInteger__Group__0 )
            {
             before(grammarAccess.getSignedIntegerAccess().getGroup()); 
            // InternalReactionRules.g:250:3: ( rule__SignedInteger__Group__0 )
            // InternalReactionRules.g:250:4: rule__SignedInteger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SignedInteger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignedIntegerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleSignedInteger"


    // $ANTLR start "entryRuleArithmeticType"
    // InternalReactionRules.g:260:1: entryRuleArithmeticType : ruleArithmeticType EOF ;
    public final void entryRuleArithmeticType() throws RecognitionException {
        try {
            // InternalReactionRules.g:261:1: ( ruleArithmeticType EOF )
            // InternalReactionRules.g:262:1: ruleArithmeticType EOF
            {
             before(grammarAccess.getArithmeticTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleArithmeticType();

            state._fsp--;

             after(grammarAccess.getArithmeticTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArithmeticType"


    // $ANTLR start "ruleArithmeticType"
    // InternalReactionRules.g:269:1: ruleArithmeticType : ( ( rule__ArithmeticType__Alternatives ) ) ;
    public final void ruleArithmeticType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:273:2: ( ( ( rule__ArithmeticType__Alternatives ) ) )
            // InternalReactionRules.g:274:2: ( ( rule__ArithmeticType__Alternatives ) )
            {
            // InternalReactionRules.g:274:2: ( ( rule__ArithmeticType__Alternatives ) )
            // InternalReactionRules.g:275:3: ( rule__ArithmeticType__Alternatives )
            {
             before(grammarAccess.getArithmeticTypeAccess().getAlternatives()); 
            // InternalReactionRules.g:276:3: ( rule__ArithmeticType__Alternatives )
            // InternalReactionRules.g:276:4: rule__ArithmeticType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArithmeticType"


    // $ANTLR start "entryRuleArithmeticValue"
    // InternalReactionRules.g:285:1: entryRuleArithmeticValue : ruleArithmeticValue EOF ;
    public final void entryRuleArithmeticValue() throws RecognitionException {
        try {
            // InternalReactionRules.g:286:1: ( ruleArithmeticValue EOF )
            // InternalReactionRules.g:287:1: ruleArithmeticValue EOF
            {
             before(grammarAccess.getArithmeticValueRule()); 
            pushFollow(FOLLOW_1);
            ruleArithmeticValue();

            state._fsp--;

             after(grammarAccess.getArithmeticValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArithmeticValue"


    // $ANTLR start "ruleArithmeticValue"
    // InternalReactionRules.g:294:1: ruleArithmeticValue : ( ( rule__ArithmeticValue__ValueAssignment ) ) ;
    public final void ruleArithmeticValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:298:2: ( ( ( rule__ArithmeticValue__ValueAssignment ) ) )
            // InternalReactionRules.g:299:2: ( ( rule__ArithmeticValue__ValueAssignment ) )
            {
            // InternalReactionRules.g:299:2: ( ( rule__ArithmeticValue__ValueAssignment ) )
            // InternalReactionRules.g:300:3: ( rule__ArithmeticValue__ValueAssignment )
            {
             before(grammarAccess.getArithmeticValueAccess().getValueAssignment()); 
            // InternalReactionRules.g:301:3: ( rule__ArithmeticValue__ValueAssignment )
            // InternalReactionRules.g:301:4: rule__ArithmeticValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArithmeticValue"


    // $ANTLR start "entryRuleState"
    // InternalReactionRules.g:310:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalReactionRules.g:311:1: ( ruleState EOF )
            // InternalReactionRules.g:312:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalReactionRules.g:319:1: ruleState : ( ( rule__State__NameAssignment ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:323:2: ( ( ( rule__State__NameAssignment ) ) )
            // InternalReactionRules.g:324:2: ( ( rule__State__NameAssignment ) )
            {
            // InternalReactionRules.g:324:2: ( ( rule__State__NameAssignment ) )
            // InternalReactionRules.g:325:3: ( rule__State__NameAssignment )
            {
             before(grammarAccess.getStateAccess().getNameAssignment()); 
            // InternalReactionRules.g:326:3: ( rule__State__NameAssignment )
            // InternalReactionRules.g:326:4: rule__State__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleStates"
    // InternalReactionRules.g:335:1: entryRuleStates : ruleStates EOF ;
    public final void entryRuleStates() throws RecognitionException {
        try {
            // InternalReactionRules.g:336:1: ( ruleStates EOF )
            // InternalReactionRules.g:337:1: ruleStates EOF
            {
             before(grammarAccess.getStatesRule()); 
            pushFollow(FOLLOW_1);
            ruleStates();

            state._fsp--;

             after(grammarAccess.getStatesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStates"


    // $ANTLR start "ruleStates"
    // InternalReactionRules.g:344:1: ruleStates : ( ( rule__States__Group__0 ) ) ;
    public final void ruleStates() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:348:2: ( ( ( rule__States__Group__0 ) ) )
            // InternalReactionRules.g:349:2: ( ( rule__States__Group__0 ) )
            {
            // InternalReactionRules.g:349:2: ( ( rule__States__Group__0 ) )
            // InternalReactionRules.g:350:3: ( rule__States__Group__0 )
            {
             before(grammarAccess.getStatesAccess().getGroup()); 
            // InternalReactionRules.g:351:3: ( rule__States__Group__0 )
            // InternalReactionRules.g:351:4: rule__States__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__States__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStates"


    // $ANTLR start "entryRuleSite"
    // InternalReactionRules.g:360:1: entryRuleSite : ruleSite EOF ;
    public final void entryRuleSite() throws RecognitionException {
        try {
            // InternalReactionRules.g:361:1: ( ruleSite EOF )
            // InternalReactionRules.g:362:1: ruleSite EOF
            {
             before(grammarAccess.getSiteRule()); 
            pushFollow(FOLLOW_1);
            ruleSite();

            state._fsp--;

             after(grammarAccess.getSiteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSite"


    // $ANTLR start "ruleSite"
    // InternalReactionRules.g:369:1: ruleSite : ( ( rule__Site__Group__0 ) ) ;
    public final void ruleSite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:373:2: ( ( ( rule__Site__Group__0 ) ) )
            // InternalReactionRules.g:374:2: ( ( rule__Site__Group__0 ) )
            {
            // InternalReactionRules.g:374:2: ( ( rule__Site__Group__0 ) )
            // InternalReactionRules.g:375:3: ( rule__Site__Group__0 )
            {
             before(grammarAccess.getSiteAccess().getGroup()); 
            // InternalReactionRules.g:376:3: ( rule__Site__Group__0 )
            // InternalReactionRules.g:376:4: rule__Site__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Site__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSiteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSite"


    // $ANTLR start "entryRuleSites"
    // InternalReactionRules.g:385:1: entryRuleSites : ruleSites EOF ;
    public final void entryRuleSites() throws RecognitionException {
        try {
            // InternalReactionRules.g:386:1: ( ruleSites EOF )
            // InternalReactionRules.g:387:1: ruleSites EOF
            {
             before(grammarAccess.getSitesRule()); 
            pushFollow(FOLLOW_1);
            ruleSites();

            state._fsp--;

             after(grammarAccess.getSitesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSites"


    // $ANTLR start "ruleSites"
    // InternalReactionRules.g:394:1: ruleSites : ( ( rule__Sites__Group__0 ) ) ;
    public final void ruleSites() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:398:2: ( ( ( rule__Sites__Group__0 ) ) )
            // InternalReactionRules.g:399:2: ( ( rule__Sites__Group__0 ) )
            {
            // InternalReactionRules.g:399:2: ( ( rule__Sites__Group__0 ) )
            // InternalReactionRules.g:400:3: ( rule__Sites__Group__0 )
            {
             before(grammarAccess.getSitesAccess().getGroup()); 
            // InternalReactionRules.g:401:3: ( rule__Sites__Group__0 )
            // InternalReactionRules.g:401:4: rule__Sites__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sites__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSitesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSites"


    // $ANTLR start "entryRuleAgent"
    // InternalReactionRules.g:410:1: entryRuleAgent : ruleAgent EOF ;
    public final void entryRuleAgent() throws RecognitionException {
        try {
            // InternalReactionRules.g:411:1: ( ruleAgent EOF )
            // InternalReactionRules.g:412:1: ruleAgent EOF
            {
             before(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_1);
            ruleAgent();

            state._fsp--;

             after(grammarAccess.getAgentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalReactionRules.g:419:1: ruleAgent : ( ( rule__Agent__Group__0 ) ) ;
    public final void ruleAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:423:2: ( ( ( rule__Agent__Group__0 ) ) )
            // InternalReactionRules.g:424:2: ( ( rule__Agent__Group__0 ) )
            {
            // InternalReactionRules.g:424:2: ( ( rule__Agent__Group__0 ) )
            // InternalReactionRules.g:425:3: ( rule__Agent__Group__0 )
            {
             before(grammarAccess.getAgentAccess().getGroup()); 
            // InternalReactionRules.g:426:3: ( rule__Agent__Group__0 )
            // InternalReactionRules.g:426:4: rule__Agent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Agent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAgentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRulePatternVariable"
    // InternalReactionRules.g:435:1: entryRulePatternVariable : rulePatternVariable EOF ;
    public final void entryRulePatternVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:436:1: ( rulePatternVariable EOF )
            // InternalReactionRules.g:437:1: rulePatternVariable EOF
            {
             before(grammarAccess.getPatternVariableRule()); 
            pushFollow(FOLLOW_1);
            rulePatternVariable();

            state._fsp--;

             after(grammarAccess.getPatternVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatternVariable"


    // $ANTLR start "rulePatternVariable"
    // InternalReactionRules.g:444:1: rulePatternVariable : ( ( rule__PatternVariable__Group__0 ) ) ;
    public final void rulePatternVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:448:2: ( ( ( rule__PatternVariable__Group__0 ) ) )
            // InternalReactionRules.g:449:2: ( ( rule__PatternVariable__Group__0 ) )
            {
            // InternalReactionRules.g:449:2: ( ( rule__PatternVariable__Group__0 ) )
            // InternalReactionRules.g:450:3: ( rule__PatternVariable__Group__0 )
            {
             before(grammarAccess.getPatternVariableAccess().getGroup()); 
            // InternalReactionRules.g:451:3: ( rule__PatternVariable__Group__0 )
            // InternalReactionRules.g:451:4: rule__PatternVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternVariable"


    // $ANTLR start "entryRuleArithmeticVariable"
    // InternalReactionRules.g:460:1: entryRuleArithmeticVariable : ruleArithmeticVariable EOF ;
    public final void entryRuleArithmeticVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:461:1: ( ruleArithmeticVariable EOF )
            // InternalReactionRules.g:462:1: ruleArithmeticVariable EOF
            {
             before(grammarAccess.getArithmeticVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleArithmeticVariable();

            state._fsp--;

             after(grammarAccess.getArithmeticVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArithmeticVariable"


    // $ANTLR start "ruleArithmeticVariable"
    // InternalReactionRules.g:469:1: ruleArithmeticVariable : ( ( rule__ArithmeticVariable__Group__0 ) ) ;
    public final void ruleArithmeticVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:473:2: ( ( ( rule__ArithmeticVariable__Group__0 ) ) )
            // InternalReactionRules.g:474:2: ( ( rule__ArithmeticVariable__Group__0 ) )
            {
            // InternalReactionRules.g:474:2: ( ( rule__ArithmeticVariable__Group__0 ) )
            // InternalReactionRules.g:475:3: ( rule__ArithmeticVariable__Group__0 )
            {
             before(grammarAccess.getArithmeticVariableAccess().getGroup()); 
            // InternalReactionRules.g:476:3: ( rule__ArithmeticVariable__Group__0 )
            // InternalReactionRules.g:476:4: rule__ArithmeticVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArithmeticVariable"


    // $ANTLR start "entryRuleVariable"
    // InternalReactionRules.g:485:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:486:1: ( ruleVariable EOF )
            // InternalReactionRules.g:487:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalReactionRules.g:494:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:498:2: ( ( ( rule__Variable__Alternatives ) ) )
            // InternalReactionRules.g:499:2: ( ( rule__Variable__Alternatives ) )
            {
            // InternalReactionRules.g:499:2: ( ( rule__Variable__Alternatives ) )
            // InternalReactionRules.g:500:3: ( rule__Variable__Alternatives )
            {
             before(grammarAccess.getVariableAccess().getAlternatives()); 
            // InternalReactionRules.g:501:3: ( rule__Variable__Alternatives )
            // InternalReactionRules.g:501:4: rule__Variable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleBoundAnyLink"
    // InternalReactionRules.g:510:1: entryRuleBoundAnyLink : ruleBoundAnyLink EOF ;
    public final void entryRuleBoundAnyLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:511:1: ( ruleBoundAnyLink EOF )
            // InternalReactionRules.g:512:1: ruleBoundAnyLink EOF
            {
             before(grammarAccess.getBoundAnyLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleBoundAnyLink();

            state._fsp--;

             after(grammarAccess.getBoundAnyLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoundAnyLink"


    // $ANTLR start "ruleBoundAnyLink"
    // InternalReactionRules.g:519:1: ruleBoundAnyLink : ( ( rule__BoundAnyLink__Group__0 ) ) ;
    public final void ruleBoundAnyLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:523:2: ( ( ( rule__BoundAnyLink__Group__0 ) ) )
            // InternalReactionRules.g:524:2: ( ( rule__BoundAnyLink__Group__0 ) )
            {
            // InternalReactionRules.g:524:2: ( ( rule__BoundAnyLink__Group__0 ) )
            // InternalReactionRules.g:525:3: ( rule__BoundAnyLink__Group__0 )
            {
             before(grammarAccess.getBoundAnyLinkAccess().getGroup()); 
            // InternalReactionRules.g:526:3: ( rule__BoundAnyLink__Group__0 )
            // InternalReactionRules.g:526:4: rule__BoundAnyLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoundAnyLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoundAnyLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoundAnyLink"


    // $ANTLR start "entryRuleFreeLink"
    // InternalReactionRules.g:535:1: entryRuleFreeLink : ruleFreeLink EOF ;
    public final void entryRuleFreeLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:536:1: ( ruleFreeLink EOF )
            // InternalReactionRules.g:537:1: ruleFreeLink EOF
            {
             before(grammarAccess.getFreeLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleFreeLink();

            state._fsp--;

             after(grammarAccess.getFreeLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFreeLink"


    // $ANTLR start "ruleFreeLink"
    // InternalReactionRules.g:544:1: ruleFreeLink : ( ( rule__FreeLink__Group__0 ) ) ;
    public final void ruleFreeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:548:2: ( ( ( rule__FreeLink__Group__0 ) ) )
            // InternalReactionRules.g:549:2: ( ( rule__FreeLink__Group__0 ) )
            {
            // InternalReactionRules.g:549:2: ( ( rule__FreeLink__Group__0 ) )
            // InternalReactionRules.g:550:3: ( rule__FreeLink__Group__0 )
            {
             before(grammarAccess.getFreeLinkAccess().getGroup()); 
            // InternalReactionRules.g:551:3: ( rule__FreeLink__Group__0 )
            // InternalReactionRules.g:551:4: rule__FreeLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FreeLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFreeLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFreeLink"


    // $ANTLR start "entryRuleWhatEver"
    // InternalReactionRules.g:560:1: entryRuleWhatEver : ruleWhatEver EOF ;
    public final void entryRuleWhatEver() throws RecognitionException {
        try {
            // InternalReactionRules.g:561:1: ( ruleWhatEver EOF )
            // InternalReactionRules.g:562:1: ruleWhatEver EOF
            {
             before(grammarAccess.getWhatEverRule()); 
            pushFollow(FOLLOW_1);
            ruleWhatEver();

            state._fsp--;

             after(grammarAccess.getWhatEverRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhatEver"


    // $ANTLR start "ruleWhatEver"
    // InternalReactionRules.g:569:1: ruleWhatEver : ( ( rule__WhatEver__Group__0 ) ) ;
    public final void ruleWhatEver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:573:2: ( ( ( rule__WhatEver__Group__0 ) ) )
            // InternalReactionRules.g:574:2: ( ( rule__WhatEver__Group__0 ) )
            {
            // InternalReactionRules.g:574:2: ( ( rule__WhatEver__Group__0 ) )
            // InternalReactionRules.g:575:3: ( rule__WhatEver__Group__0 )
            {
             before(grammarAccess.getWhatEverAccess().getGroup()); 
            // InternalReactionRules.g:576:3: ( rule__WhatEver__Group__0 )
            // InternalReactionRules.g:576:4: rule__WhatEver__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhatEver__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhatEverAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhatEver"


    // $ANTLR start "entryRuleBoundLink"
    // InternalReactionRules.g:585:1: entryRuleBoundLink : ruleBoundLink EOF ;
    public final void entryRuleBoundLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:586:1: ( ruleBoundLink EOF )
            // InternalReactionRules.g:587:1: ruleBoundLink EOF
            {
             before(grammarAccess.getBoundLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleBoundLink();

            state._fsp--;

             after(grammarAccess.getBoundLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoundLink"


    // $ANTLR start "ruleBoundLink"
    // InternalReactionRules.g:594:1: ruleBoundLink : ( ( rule__BoundLink__Group__0 ) ) ;
    public final void ruleBoundLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:598:2: ( ( ( rule__BoundLink__Group__0 ) ) )
            // InternalReactionRules.g:599:2: ( ( rule__BoundLink__Group__0 ) )
            {
            // InternalReactionRules.g:599:2: ( ( rule__BoundLink__Group__0 ) )
            // InternalReactionRules.g:600:3: ( rule__BoundLink__Group__0 )
            {
             before(grammarAccess.getBoundLinkAccess().getGroup()); 
            // InternalReactionRules.g:601:3: ( rule__BoundLink__Group__0 )
            // InternalReactionRules.g:601:4: rule__BoundLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoundLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoundLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoundLink"


    // $ANTLR start "entryRuleBoundAnyOfTypeLinkAgent"
    // InternalReactionRules.g:610:1: entryRuleBoundAnyOfTypeLinkAgent : ruleBoundAnyOfTypeLinkAgent EOF ;
    public final void entryRuleBoundAnyOfTypeLinkAgent() throws RecognitionException {
        try {
            // InternalReactionRules.g:611:1: ( ruleBoundAnyOfTypeLinkAgent EOF )
            // InternalReactionRules.g:612:1: ruleBoundAnyOfTypeLinkAgent EOF
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAgentRule()); 
            pushFollow(FOLLOW_1);
            ruleBoundAnyOfTypeLinkAgent();

            state._fsp--;

             after(grammarAccess.getBoundAnyOfTypeLinkAgentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoundAnyOfTypeLinkAgent"


    // $ANTLR start "ruleBoundAnyOfTypeLinkAgent"
    // InternalReactionRules.g:619:1: ruleBoundAnyOfTypeLinkAgent : ( ( rule__BoundAnyOfTypeLinkAgent__Group__0 ) ) ;
    public final void ruleBoundAnyOfTypeLinkAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:623:2: ( ( ( rule__BoundAnyOfTypeLinkAgent__Group__0 ) ) )
            // InternalReactionRules.g:624:2: ( ( rule__BoundAnyOfTypeLinkAgent__Group__0 ) )
            {
            // InternalReactionRules.g:624:2: ( ( rule__BoundAnyOfTypeLinkAgent__Group__0 ) )
            // InternalReactionRules.g:625:3: ( rule__BoundAnyOfTypeLinkAgent__Group__0 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getGroup()); 
            // InternalReactionRules.g:626:3: ( rule__BoundAnyOfTypeLinkAgent__Group__0 )
            // InternalReactionRules.g:626:4: rule__BoundAnyOfTypeLinkAgent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoundAnyOfTypeLinkAgent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoundAnyOfTypeLinkAgent"


    // $ANTLR start "entryRuleBoundAnyOfTypeLinkSite"
    // InternalReactionRules.g:635:1: entryRuleBoundAnyOfTypeLinkSite : ruleBoundAnyOfTypeLinkSite EOF ;
    public final void entryRuleBoundAnyOfTypeLinkSite() throws RecognitionException {
        try {
            // InternalReactionRules.g:636:1: ( ruleBoundAnyOfTypeLinkSite EOF )
            // InternalReactionRules.g:637:1: ruleBoundAnyOfTypeLinkSite EOF
            {
             before(grammarAccess.getBoundAnyOfTypeLinkSiteRule()); 
            pushFollow(FOLLOW_1);
            ruleBoundAnyOfTypeLinkSite();

            state._fsp--;

             after(grammarAccess.getBoundAnyOfTypeLinkSiteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoundAnyOfTypeLinkSite"


    // $ANTLR start "ruleBoundAnyOfTypeLinkSite"
    // InternalReactionRules.g:644:1: ruleBoundAnyOfTypeLinkSite : ( ( rule__BoundAnyOfTypeLinkSite__Group__0 ) ) ;
    public final void ruleBoundAnyOfTypeLinkSite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:648:2: ( ( ( rule__BoundAnyOfTypeLinkSite__Group__0 ) ) )
            // InternalReactionRules.g:649:2: ( ( rule__BoundAnyOfTypeLinkSite__Group__0 ) )
            {
            // InternalReactionRules.g:649:2: ( ( rule__BoundAnyOfTypeLinkSite__Group__0 ) )
            // InternalReactionRules.g:650:3: ( rule__BoundAnyOfTypeLinkSite__Group__0 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getGroup()); 
            // InternalReactionRules.g:651:3: ( rule__BoundAnyOfTypeLinkSite__Group__0 )
            // InternalReactionRules.g:651:4: rule__BoundAnyOfTypeLinkSite__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoundAnyOfTypeLinkSite__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoundAnyOfTypeLinkSite"


    // $ANTLR start "entryRuleBoundAnyOfTypeLink"
    // InternalReactionRules.g:660:1: entryRuleBoundAnyOfTypeLink : ruleBoundAnyOfTypeLink EOF ;
    public final void entryRuleBoundAnyOfTypeLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:661:1: ( ruleBoundAnyOfTypeLink EOF )
            // InternalReactionRules.g:662:1: ruleBoundAnyOfTypeLink EOF
            {
             before(grammarAccess.getBoundAnyOfTypeLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleBoundAnyOfTypeLink();

            state._fsp--;

             after(grammarAccess.getBoundAnyOfTypeLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoundAnyOfTypeLink"


    // $ANTLR start "ruleBoundAnyOfTypeLink"
    // InternalReactionRules.g:669:1: ruleBoundAnyOfTypeLink : ( ( rule__BoundAnyOfTypeLink__Group__0 ) ) ;
    public final void ruleBoundAnyOfTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:673:2: ( ( ( rule__BoundAnyOfTypeLink__Group__0 ) ) )
            // InternalReactionRules.g:674:2: ( ( rule__BoundAnyOfTypeLink__Group__0 ) )
            {
            // InternalReactionRules.g:674:2: ( ( rule__BoundAnyOfTypeLink__Group__0 ) )
            // InternalReactionRules.g:675:3: ( rule__BoundAnyOfTypeLink__Group__0 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAccess().getGroup()); 
            // InternalReactionRules.g:676:3: ( rule__BoundAnyOfTypeLink__Group__0 )
            // InternalReactionRules.g:676:4: rule__BoundAnyOfTypeLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoundAnyOfTypeLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoundAnyOfTypeLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoundAnyOfTypeLink"


    // $ANTLR start "entryRuleSiteState"
    // InternalReactionRules.g:685:1: entryRuleSiteState : ruleSiteState EOF ;
    public final void entryRuleSiteState() throws RecognitionException {
        try {
            // InternalReactionRules.g:686:1: ( ruleSiteState EOF )
            // InternalReactionRules.g:687:1: ruleSiteState EOF
            {
             before(grammarAccess.getSiteStateRule()); 
            pushFollow(FOLLOW_1);
            ruleSiteState();

            state._fsp--;

             after(grammarAccess.getSiteStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSiteState"


    // $ANTLR start "ruleSiteState"
    // InternalReactionRules.g:694:1: ruleSiteState : ( ( rule__SiteState__Group__0 ) ) ;
    public final void ruleSiteState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:698:2: ( ( ( rule__SiteState__Group__0 ) ) )
            // InternalReactionRules.g:699:2: ( ( rule__SiteState__Group__0 ) )
            {
            // InternalReactionRules.g:699:2: ( ( rule__SiteState__Group__0 ) )
            // InternalReactionRules.g:700:3: ( rule__SiteState__Group__0 )
            {
             before(grammarAccess.getSiteStateAccess().getGroup()); 
            // InternalReactionRules.g:701:3: ( rule__SiteState__Group__0 )
            // InternalReactionRules.g:701:4: rule__SiteState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SiteState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSiteStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSiteState"


    // $ANTLR start "entryRuleLinkState"
    // InternalReactionRules.g:710:1: entryRuleLinkState : ruleLinkState EOF ;
    public final void entryRuleLinkState() throws RecognitionException {
        try {
            // InternalReactionRules.g:711:1: ( ruleLinkState EOF )
            // InternalReactionRules.g:712:1: ruleLinkState EOF
            {
             before(grammarAccess.getLinkStateRule()); 
            pushFollow(FOLLOW_1);
            ruleLinkState();

            state._fsp--;

             after(grammarAccess.getLinkStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinkState"


    // $ANTLR start "ruleLinkState"
    // InternalReactionRules.g:719:1: ruleLinkState : ( ( rule__LinkState__Group__0 ) ) ;
    public final void ruleLinkState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:723:2: ( ( ( rule__LinkState__Group__0 ) ) )
            // InternalReactionRules.g:724:2: ( ( rule__LinkState__Group__0 ) )
            {
            // InternalReactionRules.g:724:2: ( ( rule__LinkState__Group__0 ) )
            // InternalReactionRules.g:725:3: ( rule__LinkState__Group__0 )
            {
             before(grammarAccess.getLinkStateAccess().getGroup()); 
            // InternalReactionRules.g:726:3: ( rule__LinkState__Group__0 )
            // InternalReactionRules.g:726:4: rule__LinkState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinkState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinkState"


    // $ANTLR start "entryRuleSitePattern"
    // InternalReactionRules.g:735:1: entryRuleSitePattern : ruleSitePattern EOF ;
    public final void entryRuleSitePattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:736:1: ( ruleSitePattern EOF )
            // InternalReactionRules.g:737:1: ruleSitePattern EOF
            {
             before(grammarAccess.getSitePatternRule()); 
            pushFollow(FOLLOW_1);
            ruleSitePattern();

            state._fsp--;

             after(grammarAccess.getSitePatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSitePattern"


    // $ANTLR start "ruleSitePattern"
    // InternalReactionRules.g:744:1: ruleSitePattern : ( ( rule__SitePattern__Group__0 ) ) ;
    public final void ruleSitePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:748:2: ( ( ( rule__SitePattern__Group__0 ) ) )
            // InternalReactionRules.g:749:2: ( ( rule__SitePattern__Group__0 ) )
            {
            // InternalReactionRules.g:749:2: ( ( rule__SitePattern__Group__0 ) )
            // InternalReactionRules.g:750:3: ( rule__SitePattern__Group__0 )
            {
             before(grammarAccess.getSitePatternAccess().getGroup()); 
            // InternalReactionRules.g:751:3: ( rule__SitePattern__Group__0 )
            // InternalReactionRules.g:751:4: rule__SitePattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SitePattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSitePatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSitePattern"


    // $ANTLR start "entryRuleSitePatterns"
    // InternalReactionRules.g:760:1: entryRuleSitePatterns : ruleSitePatterns EOF ;
    public final void entryRuleSitePatterns() throws RecognitionException {
        try {
            // InternalReactionRules.g:761:1: ( ruleSitePatterns EOF )
            // InternalReactionRules.g:762:1: ruleSitePatterns EOF
            {
             before(grammarAccess.getSitePatternsRule()); 
            pushFollow(FOLLOW_1);
            ruleSitePatterns();

            state._fsp--;

             after(grammarAccess.getSitePatternsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSitePatterns"


    // $ANTLR start "ruleSitePatterns"
    // InternalReactionRules.g:769:1: ruleSitePatterns : ( ( rule__SitePatterns__Group__0 ) ) ;
    public final void ruleSitePatterns() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:773:2: ( ( ( rule__SitePatterns__Group__0 ) ) )
            // InternalReactionRules.g:774:2: ( ( rule__SitePatterns__Group__0 ) )
            {
            // InternalReactionRules.g:774:2: ( ( rule__SitePatterns__Group__0 ) )
            // InternalReactionRules.g:775:3: ( rule__SitePatterns__Group__0 )
            {
             before(grammarAccess.getSitePatternsAccess().getGroup()); 
            // InternalReactionRules.g:776:3: ( rule__SitePatterns__Group__0 )
            // InternalReactionRules.g:776:4: rule__SitePatterns__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SitePatterns__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSitePatternsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSitePatterns"


    // $ANTLR start "entryRuleValidAgentPattern"
    // InternalReactionRules.g:785:1: entryRuleValidAgentPattern : ruleValidAgentPattern EOF ;
    public final void entryRuleValidAgentPattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:786:1: ( ruleValidAgentPattern EOF )
            // InternalReactionRules.g:787:1: ruleValidAgentPattern EOF
            {
             before(grammarAccess.getValidAgentPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleValidAgentPattern();

            state._fsp--;

             after(grammarAccess.getValidAgentPatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValidAgentPattern"


    // $ANTLR start "ruleValidAgentPattern"
    // InternalReactionRules.g:794:1: ruleValidAgentPattern : ( ( rule__ValidAgentPattern__Group__0 ) ) ;
    public final void ruleValidAgentPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:798:2: ( ( ( rule__ValidAgentPattern__Group__0 ) ) )
            // InternalReactionRules.g:799:2: ( ( rule__ValidAgentPattern__Group__0 ) )
            {
            // InternalReactionRules.g:799:2: ( ( rule__ValidAgentPattern__Group__0 ) )
            // InternalReactionRules.g:800:3: ( rule__ValidAgentPattern__Group__0 )
            {
             before(grammarAccess.getValidAgentPatternAccess().getGroup()); 
            // InternalReactionRules.g:801:3: ( rule__ValidAgentPattern__Group__0 )
            // InternalReactionRules.g:801:4: rule__ValidAgentPattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValidAgentPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValidAgentPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidAgentPattern"


    // $ANTLR start "entryRuleVoidAgentPattern"
    // InternalReactionRules.g:810:1: entryRuleVoidAgentPattern : ruleVoidAgentPattern EOF ;
    public final void entryRuleVoidAgentPattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:811:1: ( ruleVoidAgentPattern EOF )
            // InternalReactionRules.g:812:1: ruleVoidAgentPattern EOF
            {
             before(grammarAccess.getVoidAgentPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleVoidAgentPattern();

            state._fsp--;

             after(grammarAccess.getVoidAgentPatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVoidAgentPattern"


    // $ANTLR start "ruleVoidAgentPattern"
    // InternalReactionRules.g:819:1: ruleVoidAgentPattern : ( ( rule__VoidAgentPattern__PatternAssignment ) ) ;
    public final void ruleVoidAgentPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:823:2: ( ( ( rule__VoidAgentPattern__PatternAssignment ) ) )
            // InternalReactionRules.g:824:2: ( ( rule__VoidAgentPattern__PatternAssignment ) )
            {
            // InternalReactionRules.g:824:2: ( ( rule__VoidAgentPattern__PatternAssignment ) )
            // InternalReactionRules.g:825:3: ( rule__VoidAgentPattern__PatternAssignment )
            {
             before(grammarAccess.getVoidAgentPatternAccess().getPatternAssignment()); 
            // InternalReactionRules.g:826:3: ( rule__VoidAgentPattern__PatternAssignment )
            // InternalReactionRules.g:826:4: rule__VoidAgentPattern__PatternAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VoidAgentPattern__PatternAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVoidAgentPatternAccess().getPatternAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVoidAgentPattern"


    // $ANTLR start "entryRuleAgentPattern"
    // InternalReactionRules.g:835:1: entryRuleAgentPattern : ruleAgentPattern EOF ;
    public final void entryRuleAgentPattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:836:1: ( ruleAgentPattern EOF )
            // InternalReactionRules.g:837:1: ruleAgentPattern EOF
            {
             before(grammarAccess.getAgentPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleAgentPattern();

            state._fsp--;

             after(grammarAccess.getAgentPatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAgentPattern"


    // $ANTLR start "ruleAgentPattern"
    // InternalReactionRules.g:844:1: ruleAgentPattern : ( ( rule__AgentPattern__Alternatives ) ) ;
    public final void ruleAgentPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:848:2: ( ( ( rule__AgentPattern__Alternatives ) ) )
            // InternalReactionRules.g:849:2: ( ( rule__AgentPattern__Alternatives ) )
            {
            // InternalReactionRules.g:849:2: ( ( rule__AgentPattern__Alternatives ) )
            // InternalReactionRules.g:850:3: ( rule__AgentPattern__Alternatives )
            {
             before(grammarAccess.getAgentPatternAccess().getAlternatives()); 
            // InternalReactionRules.g:851:3: ( rule__AgentPattern__Alternatives )
            // InternalReactionRules.g:851:4: rule__AgentPattern__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AgentPattern__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAgentPatternAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAgentPattern"


    // $ANTLR start "entryRulePattern"
    // InternalReactionRules.g:860:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:861:1: ( rulePattern EOF )
            // InternalReactionRules.g:862:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalReactionRules.g:869:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:873:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalReactionRules.g:874:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalReactionRules.g:874:2: ( ( rule__Pattern__Group__0 ) )
            // InternalReactionRules.g:875:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalReactionRules.g:876:3: ( rule__Pattern__Group__0 )
            // InternalReactionRules.g:876:4: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleObservation"
    // InternalReactionRules.g:885:1: entryRuleObservation : ruleObservation EOF ;
    public final void entryRuleObservation() throws RecognitionException {
        try {
            // InternalReactionRules.g:886:1: ( ruleObservation EOF )
            // InternalReactionRules.g:887:1: ruleObservation EOF
            {
             before(grammarAccess.getObservationRule()); 
            pushFollow(FOLLOW_1);
            ruleObservation();

            state._fsp--;

             after(grammarAccess.getObservationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObservation"


    // $ANTLR start "ruleObservation"
    // InternalReactionRules.g:894:1: ruleObservation : ( ( rule__Observation__Group__0 ) ) ;
    public final void ruleObservation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:898:2: ( ( ( rule__Observation__Group__0 ) ) )
            // InternalReactionRules.g:899:2: ( ( rule__Observation__Group__0 ) )
            {
            // InternalReactionRules.g:899:2: ( ( rule__Observation__Group__0 ) )
            // InternalReactionRules.g:900:3: ( rule__Observation__Group__0 )
            {
             before(grammarAccess.getObservationAccess().getGroup()); 
            // InternalReactionRules.g:901:3: ( rule__Observation__Group__0 )
            // InternalReactionRules.g:901:4: rule__Observation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Observation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObservationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObservation"


    // $ANTLR start "entryRuleNumericFromLiteral"
    // InternalReactionRules.g:910:1: entryRuleNumericFromLiteral : ruleNumericFromLiteral EOF ;
    public final void entryRuleNumericFromLiteral() throws RecognitionException {
        try {
            // InternalReactionRules.g:911:1: ( ruleNumericFromLiteral EOF )
            // InternalReactionRules.g:912:1: ruleNumericFromLiteral EOF
            {
             before(grammarAccess.getNumericFromLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumericFromLiteral();

            state._fsp--;

             after(grammarAccess.getNumericFromLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumericFromLiteral"


    // $ANTLR start "ruleNumericFromLiteral"
    // InternalReactionRules.g:919:1: ruleNumericFromLiteral : ( ( rule__NumericFromLiteral__ValueAssignment ) ) ;
    public final void ruleNumericFromLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:923:2: ( ( ( rule__NumericFromLiteral__ValueAssignment ) ) )
            // InternalReactionRules.g:924:2: ( ( rule__NumericFromLiteral__ValueAssignment ) )
            {
            // InternalReactionRules.g:924:2: ( ( rule__NumericFromLiteral__ValueAssignment ) )
            // InternalReactionRules.g:925:3: ( rule__NumericFromLiteral__ValueAssignment )
            {
             before(grammarAccess.getNumericFromLiteralAccess().getValueAssignment()); 
            // InternalReactionRules.g:926:3: ( rule__NumericFromLiteral__ValueAssignment )
            // InternalReactionRules.g:926:4: rule__NumericFromLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumericFromLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumericFromLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumericFromLiteral"


    // $ANTLR start "entryRuleNumericFromVariable"
    // InternalReactionRules.g:935:1: entryRuleNumericFromVariable : ruleNumericFromVariable EOF ;
    public final void entryRuleNumericFromVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:936:1: ( ruleNumericFromVariable EOF )
            // InternalReactionRules.g:937:1: ruleNumericFromVariable EOF
            {
             before(grammarAccess.getNumericFromVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleNumericFromVariable();

            state._fsp--;

             after(grammarAccess.getNumericFromVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumericFromVariable"


    // $ANTLR start "ruleNumericFromVariable"
    // InternalReactionRules.g:944:1: ruleNumericFromVariable : ( ( rule__NumericFromVariable__ValueVarAssignment ) ) ;
    public final void ruleNumericFromVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:948:2: ( ( ( rule__NumericFromVariable__ValueVarAssignment ) ) )
            // InternalReactionRules.g:949:2: ( ( rule__NumericFromVariable__ValueVarAssignment ) )
            {
            // InternalReactionRules.g:949:2: ( ( rule__NumericFromVariable__ValueVarAssignment ) )
            // InternalReactionRules.g:950:3: ( rule__NumericFromVariable__ValueVarAssignment )
            {
             before(grammarAccess.getNumericFromVariableAccess().getValueVarAssignment()); 
            // InternalReactionRules.g:951:3: ( rule__NumericFromVariable__ValueVarAssignment )
            // InternalReactionRules.g:951:4: rule__NumericFromVariable__ValueVarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumericFromVariable__ValueVarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumericFromVariableAccess().getValueVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumericFromVariable"


    // $ANTLR start "entryRuleNumericAssignment"
    // InternalReactionRules.g:960:1: entryRuleNumericAssignment : ruleNumericAssignment EOF ;
    public final void entryRuleNumericAssignment() throws RecognitionException {
        try {
            // InternalReactionRules.g:961:1: ( ruleNumericAssignment EOF )
            // InternalReactionRules.g:962:1: ruleNumericAssignment EOF
            {
             before(grammarAccess.getNumericAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleNumericAssignment();

            state._fsp--;

             after(grammarAccess.getNumericAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumericAssignment"


    // $ANTLR start "ruleNumericAssignment"
    // InternalReactionRules.g:969:1: ruleNumericAssignment : ( ( rule__NumericAssignment__Alternatives ) ) ;
    public final void ruleNumericAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:973:2: ( ( ( rule__NumericAssignment__Alternatives ) ) )
            // InternalReactionRules.g:974:2: ( ( rule__NumericAssignment__Alternatives ) )
            {
            // InternalReactionRules.g:974:2: ( ( rule__NumericAssignment__Alternatives ) )
            // InternalReactionRules.g:975:3: ( rule__NumericAssignment__Alternatives )
            {
             before(grammarAccess.getNumericAssignmentAccess().getAlternatives()); 
            // InternalReactionRules.g:976:3: ( rule__NumericAssignment__Alternatives )
            // InternalReactionRules.g:976:4: rule__NumericAssignment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumericAssignment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumericAssignmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumericAssignment"


    // $ANTLR start "entryRuleInitial"
    // InternalReactionRules.g:985:1: entryRuleInitial : ruleInitial EOF ;
    public final void entryRuleInitial() throws RecognitionException {
        try {
            // InternalReactionRules.g:986:1: ( ruleInitial EOF )
            // InternalReactionRules.g:987:1: ruleInitial EOF
            {
             before(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getInitialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalReactionRules.g:994:1: ruleInitial : ( ( rule__Initial__Group__0 ) ) ;
    public final void ruleInitial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:998:2: ( ( ( rule__Initial__Group__0 ) ) )
            // InternalReactionRules.g:999:2: ( ( rule__Initial__Group__0 ) )
            {
            // InternalReactionRules.g:999:2: ( ( rule__Initial__Group__0 ) )
            // InternalReactionRules.g:1000:3: ( rule__Initial__Group__0 )
            {
             before(grammarAccess.getInitialAccess().getGroup()); 
            // InternalReactionRules.g:1001:3: ( rule__Initial__Group__0 )
            // InternalReactionRules.g:1001:4: rule__Initial__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Initial__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleAssignFromPattern"
    // InternalReactionRules.g:1010:1: entryRuleAssignFromPattern : ruleAssignFromPattern EOF ;
    public final void entryRuleAssignFromPattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:1011:1: ( ruleAssignFromPattern EOF )
            // InternalReactionRules.g:1012:1: ruleAssignFromPattern EOF
            {
             before(grammarAccess.getAssignFromPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignFromPattern();

            state._fsp--;

             after(grammarAccess.getAssignFromPatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignFromPattern"


    // $ANTLR start "ruleAssignFromPattern"
    // InternalReactionRules.g:1019:1: ruleAssignFromPattern : ( ( rule__AssignFromPattern__PatternAssignment ) ) ;
    public final void ruleAssignFromPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1023:2: ( ( ( rule__AssignFromPattern__PatternAssignment ) ) )
            // InternalReactionRules.g:1024:2: ( ( rule__AssignFromPattern__PatternAssignment ) )
            {
            // InternalReactionRules.g:1024:2: ( ( rule__AssignFromPattern__PatternAssignment ) )
            // InternalReactionRules.g:1025:3: ( rule__AssignFromPattern__PatternAssignment )
            {
             before(grammarAccess.getAssignFromPatternAccess().getPatternAssignment()); 
            // InternalReactionRules.g:1026:3: ( rule__AssignFromPattern__PatternAssignment )
            // InternalReactionRules.g:1026:4: rule__AssignFromPattern__PatternAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AssignFromPattern__PatternAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAssignFromPatternAccess().getPatternAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignFromPattern"


    // $ANTLR start "entryRuleAssignFromVariable"
    // InternalReactionRules.g:1035:1: entryRuleAssignFromVariable : ruleAssignFromVariable EOF ;
    public final void entryRuleAssignFromVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:1036:1: ( ruleAssignFromVariable EOF )
            // InternalReactionRules.g:1037:1: ruleAssignFromVariable EOF
            {
             before(grammarAccess.getAssignFromVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignFromVariable();

            state._fsp--;

             after(grammarAccess.getAssignFromVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignFromVariable"


    // $ANTLR start "ruleAssignFromVariable"
    // InternalReactionRules.g:1044:1: ruleAssignFromVariable : ( ( rule__AssignFromVariable__PatternVarAssignment ) ) ;
    public final void ruleAssignFromVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1048:2: ( ( ( rule__AssignFromVariable__PatternVarAssignment ) ) )
            // InternalReactionRules.g:1049:2: ( ( rule__AssignFromVariable__PatternVarAssignment ) )
            {
            // InternalReactionRules.g:1049:2: ( ( rule__AssignFromVariable__PatternVarAssignment ) )
            // InternalReactionRules.g:1050:3: ( rule__AssignFromVariable__PatternVarAssignment )
            {
             before(grammarAccess.getAssignFromVariableAccess().getPatternVarAssignment()); 
            // InternalReactionRules.g:1051:3: ( rule__AssignFromVariable__PatternVarAssignment )
            // InternalReactionRules.g:1051:4: rule__AssignFromVariable__PatternVarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AssignFromVariable__PatternVarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAssignFromVariableAccess().getPatternVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignFromVariable"


    // $ANTLR start "entryRulePatternAssignment"
    // InternalReactionRules.g:1060:1: entryRulePatternAssignment : rulePatternAssignment EOF ;
    public final void entryRulePatternAssignment() throws RecognitionException {
        try {
            // InternalReactionRules.g:1061:1: ( rulePatternAssignment EOF )
            // InternalReactionRules.g:1062:1: rulePatternAssignment EOF
            {
             before(grammarAccess.getPatternAssignmentRule()); 
            pushFollow(FOLLOW_1);
            rulePatternAssignment();

            state._fsp--;

             after(grammarAccess.getPatternAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatternAssignment"


    // $ANTLR start "rulePatternAssignment"
    // InternalReactionRules.g:1069:1: rulePatternAssignment : ( ( rule__PatternAssignment__Alternatives ) ) ;
    public final void rulePatternAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1073:2: ( ( ( rule__PatternAssignment__Alternatives ) ) )
            // InternalReactionRules.g:1074:2: ( ( rule__PatternAssignment__Alternatives ) )
            {
            // InternalReactionRules.g:1074:2: ( ( rule__PatternAssignment__Alternatives ) )
            // InternalReactionRules.g:1075:3: ( rule__PatternAssignment__Alternatives )
            {
             before(grammarAccess.getPatternAssignmentAccess().getAlternatives()); 
            // InternalReactionRules.g:1076:3: ( rule__PatternAssignment__Alternatives )
            // InternalReactionRules.g:1076:4: rule__PatternAssignment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PatternAssignment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPatternAssignmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternAssignment"


    // $ANTLR start "entryRuleRuleVariables"
    // InternalReactionRules.g:1085:1: entryRuleRuleVariables : ruleRuleVariables EOF ;
    public final void entryRuleRuleVariables() throws RecognitionException {
        try {
            // InternalReactionRules.g:1086:1: ( ruleRuleVariables EOF )
            // InternalReactionRules.g:1087:1: ruleRuleVariables EOF
            {
             before(grammarAccess.getRuleVariablesRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleVariables();

            state._fsp--;

             after(grammarAccess.getRuleVariablesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleVariables"


    // $ANTLR start "ruleRuleVariables"
    // InternalReactionRules.g:1094:1: ruleRuleVariables : ( ( rule__RuleVariables__Group__0 ) ) ;
    public final void ruleRuleVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1098:2: ( ( ( rule__RuleVariables__Group__0 ) ) )
            // InternalReactionRules.g:1099:2: ( ( rule__RuleVariables__Group__0 ) )
            {
            // InternalReactionRules.g:1099:2: ( ( rule__RuleVariables__Group__0 ) )
            // InternalReactionRules.g:1100:3: ( rule__RuleVariables__Group__0 )
            {
             before(grammarAccess.getRuleVariablesAccess().getGroup()); 
            // InternalReactionRules.g:1101:3: ( rule__RuleVariables__Group__0 )
            // InternalReactionRules.g:1101:4: rule__RuleVariables__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleVariables__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleVariablesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleVariables"


    // $ANTLR start "entryRuleUnidirectionalRule"
    // InternalReactionRules.g:1110:1: entryRuleUnidirectionalRule : ruleUnidirectionalRule EOF ;
    public final void entryRuleUnidirectionalRule() throws RecognitionException {
        try {
            // InternalReactionRules.g:1111:1: ( ruleUnidirectionalRule EOF )
            // InternalReactionRules.g:1112:1: ruleUnidirectionalRule EOF
            {
             before(grammarAccess.getUnidirectionalRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleUnidirectionalRule();

            state._fsp--;

             after(grammarAccess.getUnidirectionalRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnidirectionalRule"


    // $ANTLR start "ruleUnidirectionalRule"
    // InternalReactionRules.g:1119:1: ruleUnidirectionalRule : ( ( rule__UnidirectionalRule__Group__0 ) ) ;
    public final void ruleUnidirectionalRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1123:2: ( ( ( rule__UnidirectionalRule__Group__0 ) ) )
            // InternalReactionRules.g:1124:2: ( ( rule__UnidirectionalRule__Group__0 ) )
            {
            // InternalReactionRules.g:1124:2: ( ( rule__UnidirectionalRule__Group__0 ) )
            // InternalReactionRules.g:1125:3: ( rule__UnidirectionalRule__Group__0 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getGroup()); 
            // InternalReactionRules.g:1126:3: ( rule__UnidirectionalRule__Group__0 )
            // InternalReactionRules.g:1126:4: rule__UnidirectionalRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnidirectionalRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnidirectionalRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnidirectionalRule"


    // $ANTLR start "entryRuleBidirectionalRule"
    // InternalReactionRules.g:1135:1: entryRuleBidirectionalRule : ruleBidirectionalRule EOF ;
    public final void entryRuleBidirectionalRule() throws RecognitionException {
        try {
            // InternalReactionRules.g:1136:1: ( ruleBidirectionalRule EOF )
            // InternalReactionRules.g:1137:1: ruleBidirectionalRule EOF
            {
             before(grammarAccess.getBidirectionalRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleBidirectionalRule();

            state._fsp--;

             after(grammarAccess.getBidirectionalRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBidirectionalRule"


    // $ANTLR start "ruleBidirectionalRule"
    // InternalReactionRules.g:1144:1: ruleBidirectionalRule : ( ( rule__BidirectionalRule__Group__0 ) ) ;
    public final void ruleBidirectionalRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1148:2: ( ( ( rule__BidirectionalRule__Group__0 ) ) )
            // InternalReactionRules.g:1149:2: ( ( rule__BidirectionalRule__Group__0 ) )
            {
            // InternalReactionRules.g:1149:2: ( ( rule__BidirectionalRule__Group__0 ) )
            // InternalReactionRules.g:1150:3: ( rule__BidirectionalRule__Group__0 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getGroup()); 
            // InternalReactionRules.g:1151:3: ( rule__BidirectionalRule__Group__0 )
            // InternalReactionRules.g:1151:4: rule__BidirectionalRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BidirectionalRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBidirectionalRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBidirectionalRule"


    // $ANTLR start "entryRuleRuleBody"
    // InternalReactionRules.g:1160:1: entryRuleRuleBody : ruleRuleBody EOF ;
    public final void entryRuleRuleBody() throws RecognitionException {
        try {
            // InternalReactionRules.g:1161:1: ( ruleRuleBody EOF )
            // InternalReactionRules.g:1162:1: ruleRuleBody EOF
            {
             before(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleBody();

            state._fsp--;

             after(grammarAccess.getRuleBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleBody"


    // $ANTLR start "ruleRuleBody"
    // InternalReactionRules.g:1169:1: ruleRuleBody : ( ( rule__RuleBody__Alternatives ) ) ;
    public final void ruleRuleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1173:2: ( ( ( rule__RuleBody__Alternatives ) ) )
            // InternalReactionRules.g:1174:2: ( ( rule__RuleBody__Alternatives ) )
            {
            // InternalReactionRules.g:1174:2: ( ( rule__RuleBody__Alternatives ) )
            // InternalReactionRules.g:1175:3: ( rule__RuleBody__Alternatives )
            {
             before(grammarAccess.getRuleBodyAccess().getAlternatives()); 
            // InternalReactionRules.g:1176:3: ( rule__RuleBody__Alternatives )
            // InternalReactionRules.g:1176:4: rule__RuleBody__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RuleBody__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleBodyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRuleRule"
    // InternalReactionRules.g:1185:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalReactionRules.g:1186:1: ( ruleRule EOF )
            // InternalReactionRules.g:1187:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalReactionRules.g:1194:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1198:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalReactionRules.g:1199:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalReactionRules.g:1199:2: ( ( rule__Rule__Group__0 ) )
            // InternalReactionRules.g:1200:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalReactionRules.g:1201:3: ( rule__Rule__Group__0 )
            // InternalReactionRules.g:1201:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleIterations"
    // InternalReactionRules.g:1210:1: entryRuleIterations : ruleIterations EOF ;
    public final void entryRuleIterations() throws RecognitionException {
        try {
            // InternalReactionRules.g:1211:1: ( ruleIterations EOF )
            // InternalReactionRules.g:1212:1: ruleIterations EOF
            {
             before(grammarAccess.getIterationsRule()); 
            pushFollow(FOLLOW_1);
            ruleIterations();

            state._fsp--;

             after(grammarAccess.getIterationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIterations"


    // $ANTLR start "ruleIterations"
    // InternalReactionRules.g:1219:1: ruleIterations : ( ( rule__Iterations__Group__0 ) ) ;
    public final void ruleIterations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1223:2: ( ( ( rule__Iterations__Group__0 ) ) )
            // InternalReactionRules.g:1224:2: ( ( rule__Iterations__Group__0 ) )
            {
            // InternalReactionRules.g:1224:2: ( ( rule__Iterations__Group__0 ) )
            // InternalReactionRules.g:1225:3: ( rule__Iterations__Group__0 )
            {
             before(grammarAccess.getIterationsAccess().getGroup()); 
            // InternalReactionRules.g:1226:3: ( rule__Iterations__Group__0 )
            // InternalReactionRules.g:1226:4: rule__Iterations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Iterations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIterationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIterations"


    // $ANTLR start "entryRuleTime"
    // InternalReactionRules.g:1235:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // InternalReactionRules.g:1236:1: ( ruleTime EOF )
            // InternalReactionRules.g:1237:1: ruleTime EOF
            {
             before(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getTimeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalReactionRules.g:1244:1: ruleTime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1248:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalReactionRules.g:1249:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalReactionRules.g:1249:2: ( ( rule__Time__Group__0 ) )
            // InternalReactionRules.g:1250:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup()); 
            // InternalReactionRules.g:1251:3: ( rule__Time__Group__0 )
            // InternalReactionRules.g:1251:4: rule__Time__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRulePopulation"
    // InternalReactionRules.g:1260:1: entryRulePopulation : rulePopulation EOF ;
    public final void entryRulePopulation() throws RecognitionException {
        try {
            // InternalReactionRules.g:1261:1: ( rulePopulation EOF )
            // InternalReactionRules.g:1262:1: rulePopulation EOF
            {
             before(grammarAccess.getPopulationRule()); 
            pushFollow(FOLLOW_1);
            rulePopulation();

            state._fsp--;

             after(grammarAccess.getPopulationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePopulation"


    // $ANTLR start "rulePopulation"
    // InternalReactionRules.g:1269:1: rulePopulation : ( ( rule__Population__Group__0 ) ) ;
    public final void rulePopulation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1273:2: ( ( ( rule__Population__Group__0 ) ) )
            // InternalReactionRules.g:1274:2: ( ( rule__Population__Group__0 ) )
            {
            // InternalReactionRules.g:1274:2: ( ( rule__Population__Group__0 ) )
            // InternalReactionRules.g:1275:3: ( rule__Population__Group__0 )
            {
             before(grammarAccess.getPopulationAccess().getGroup()); 
            // InternalReactionRules.g:1276:3: ( rule__Population__Group__0 )
            // InternalReactionRules.g:1276:4: rule__Population__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Population__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPopulationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePopulation"


    // $ANTLR start "entryRuleTerminationCondition"
    // InternalReactionRules.g:1285:1: entryRuleTerminationCondition : ruleTerminationCondition EOF ;
    public final void entryRuleTerminationCondition() throws RecognitionException {
        try {
            // InternalReactionRules.g:1286:1: ( ruleTerminationCondition EOF )
            // InternalReactionRules.g:1287:1: ruleTerminationCondition EOF
            {
             before(grammarAccess.getTerminationConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminationCondition();

            state._fsp--;

             after(grammarAccess.getTerminationConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminationCondition"


    // $ANTLR start "ruleTerminationCondition"
    // InternalReactionRules.g:1294:1: ruleTerminationCondition : ( ( rule__TerminationCondition__Alternatives ) ) ;
    public final void ruleTerminationCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1298:2: ( ( ( rule__TerminationCondition__Alternatives ) ) )
            // InternalReactionRules.g:1299:2: ( ( rule__TerminationCondition__Alternatives ) )
            {
            // InternalReactionRules.g:1299:2: ( ( rule__TerminationCondition__Alternatives ) )
            // InternalReactionRules.g:1300:3: ( rule__TerminationCondition__Alternatives )
            {
             before(grammarAccess.getTerminationConditionAccess().getAlternatives()); 
            // InternalReactionRules.g:1301:3: ( rule__TerminationCondition__Alternatives )
            // InternalReactionRules.g:1301:4: rule__TerminationCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminationCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminationConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminationCondition"


    // $ANTLR start "entryRuleTerminate"
    // InternalReactionRules.g:1310:1: entryRuleTerminate : ruleTerminate EOF ;
    public final void entryRuleTerminate() throws RecognitionException {
        try {
            // InternalReactionRules.g:1311:1: ( ruleTerminate EOF )
            // InternalReactionRules.g:1312:1: ruleTerminate EOF
            {
             before(grammarAccess.getTerminateRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminate();

            state._fsp--;

             after(grammarAccess.getTerminateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminate"


    // $ANTLR start "ruleTerminate"
    // InternalReactionRules.g:1319:1: ruleTerminate : ( ( rule__Terminate__Group__0 ) ) ;
    public final void ruleTerminate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1323:2: ( ( ( rule__Terminate__Group__0 ) ) )
            // InternalReactionRules.g:1324:2: ( ( rule__Terminate__Group__0 ) )
            {
            // InternalReactionRules.g:1324:2: ( ( rule__Terminate__Group__0 ) )
            // InternalReactionRules.g:1325:3: ( rule__Terminate__Group__0 )
            {
             before(grammarAccess.getTerminateAccess().getGroup()); 
            // InternalReactionRules.g:1326:3: ( rule__Terminate__Group__0 )
            // InternalReactionRules.g:1326:4: rule__Terminate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Terminate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminate"


    // $ANTLR start "rule__ReactionProperty__Alternatives"
    // InternalReactionRules.g:1334:1: rule__ReactionProperty__Alternatives : ( ( ruleAgent ) | ( ruleVariable ) | ( ruleObservation ) | ( ruleInitial ) | ( ruleRule ) | ( ruleTerminate ) );
    public final void rule__ReactionProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1338:1: ( ( ruleAgent ) | ( ruleVariable ) | ( ruleObservation ) | ( ruleInitial ) | ( ruleRule ) | ( ruleTerminate ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt1=1;
                }
                break;
            case 29:
                {
                alt1=2;
                }
                break;
            case 33:
                {
                alt1=3;
                }
                break;
            case 34:
                {
                alt1=4;
                }
                break;
            case 35:
                {
                alt1=5;
                }
                break;
            case 40:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalReactionRules.g:1339:2: ( ruleAgent )
                    {
                    // InternalReactionRules.g:1339:2: ( ruleAgent )
                    // InternalReactionRules.g:1340:3: ruleAgent
                    {
                     before(grammarAccess.getReactionPropertyAccess().getAgentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAgent();

                    state._fsp--;

                     after(grammarAccess.getReactionPropertyAccess().getAgentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1345:2: ( ruleVariable )
                    {
                    // InternalReactionRules.g:1345:2: ( ruleVariable )
                    // InternalReactionRules.g:1346:3: ruleVariable
                    {
                     before(grammarAccess.getReactionPropertyAccess().getVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getReactionPropertyAccess().getVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReactionRules.g:1351:2: ( ruleObservation )
                    {
                    // InternalReactionRules.g:1351:2: ( ruleObservation )
                    // InternalReactionRules.g:1352:3: ruleObservation
                    {
                     before(grammarAccess.getReactionPropertyAccess().getObservationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleObservation();

                    state._fsp--;

                     after(grammarAccess.getReactionPropertyAccess().getObservationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalReactionRules.g:1357:2: ( ruleInitial )
                    {
                    // InternalReactionRules.g:1357:2: ( ruleInitial )
                    // InternalReactionRules.g:1358:3: ruleInitial
                    {
                     before(grammarAccess.getReactionPropertyAccess().getInitialParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleInitial();

                    state._fsp--;

                     after(grammarAccess.getReactionPropertyAccess().getInitialParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalReactionRules.g:1363:2: ( ruleRule )
                    {
                    // InternalReactionRules.g:1363:2: ( ruleRule )
                    // InternalReactionRules.g:1364:3: ruleRule
                    {
                     before(grammarAccess.getReactionPropertyAccess().getRuleParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getReactionPropertyAccess().getRuleParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalReactionRules.g:1369:2: ( ruleTerminate )
                    {
                    // InternalReactionRules.g:1369:2: ( ruleTerminate )
                    // InternalReactionRules.g:1370:3: ruleTerminate
                    {
                     before(grammarAccess.getReactionPropertyAccess().getTerminateParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleTerminate();

                    state._fsp--;

                     after(grammarAccess.getReactionPropertyAccess().getTerminateParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionProperty__Alternatives"


    // $ANTLR start "rule__ScientificFloat__Alternatives_5"
    // InternalReactionRules.g:1379:1: rule__ScientificFloat__Alternatives_5 : ( ( '-' ) | ( '+' ) );
    public final void rule__ScientificFloat__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1383:1: ( ( '-' ) | ( '+' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalReactionRules.g:1384:2: ( '-' )
                    {
                    // InternalReactionRules.g:1384:2: ( '-' )
                    // InternalReactionRules.g:1385:3: '-'
                    {
                     before(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_5_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1390:2: ( '+' )
                    {
                    // InternalReactionRules.g:1390:2: ( '+' )
                    // InternalReactionRules.g:1391:3: '+'
                    {
                     before(grammarAccess.getScientificFloatAccess().getPlusSignKeyword_5_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getScientificFloatAccess().getPlusSignKeyword_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScientificFloat__Alternatives_5"


    // $ANTLR start "rule__ArithmeticType__Alternatives"
    // InternalReactionRules.g:1400:1: rule__ArithmeticType__Alternatives : ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) );
    public final void rule__ArithmeticType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1404:1: ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalReactionRules.g:1405:2: ( ruleFloat )
                    {
                    // InternalReactionRules.g:1405:2: ( ruleFloat )
                    // InternalReactionRules.g:1406:3: ruleFloat
                    {
                     before(grammarAccess.getArithmeticTypeAccess().getFloatParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFloat();

                    state._fsp--;

                     after(grammarAccess.getArithmeticTypeAccess().getFloatParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1411:2: ( ruleUnsignedInteger )
                    {
                    // InternalReactionRules.g:1411:2: ( ruleUnsignedInteger )
                    // InternalReactionRules.g:1412:3: ruleUnsignedInteger
                    {
                     before(grammarAccess.getArithmeticTypeAccess().getUnsignedIntegerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnsignedInteger();

                    state._fsp--;

                     after(grammarAccess.getArithmeticTypeAccess().getUnsignedIntegerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReactionRules.g:1417:2: ( ruleSignedInteger )
                    {
                    // InternalReactionRules.g:1417:2: ( ruleSignedInteger )
                    // InternalReactionRules.g:1418:3: ruleSignedInteger
                    {
                     before(grammarAccess.getArithmeticTypeAccess().getSignedIntegerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSignedInteger();

                    state._fsp--;

                     after(grammarAccess.getArithmeticTypeAccess().getSignedIntegerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalReactionRules.g:1423:2: ( ruleScientificFloat )
                    {
                    // InternalReactionRules.g:1423:2: ( ruleScientificFloat )
                    // InternalReactionRules.g:1424:3: ruleScientificFloat
                    {
                     before(grammarAccess.getArithmeticTypeAccess().getScientificFloatParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleScientificFloat();

                    state._fsp--;

                     after(grammarAccess.getArithmeticTypeAccess().getScientificFloatParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticType__Alternatives"


    // $ANTLR start "rule__Variable__Alternatives"
    // InternalReactionRules.g:1433:1: rule__Variable__Alternatives : ( ( rulePatternVariable ) | ( ruleArithmeticVariable ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1437:1: ( ( rulePatternVariable ) | ( ruleArithmeticVariable ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==30) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==RULE_INT||LA4_3==19) ) {
                            alt4=2;
                        }
                        else if ( (LA4_3==23) ) {
                            alt4=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalReactionRules.g:1438:2: ( rulePatternVariable )
                    {
                    // InternalReactionRules.g:1438:2: ( rulePatternVariable )
                    // InternalReactionRules.g:1439:3: rulePatternVariable
                    {
                     before(grammarAccess.getVariableAccess().getPatternVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePatternVariable();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getPatternVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1444:2: ( ruleArithmeticVariable )
                    {
                    // InternalReactionRules.g:1444:2: ( ruleArithmeticVariable )
                    // InternalReactionRules.g:1445:3: ruleArithmeticVariable
                    {
                     before(grammarAccess.getVariableAccess().getArithmeticVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArithmeticVariable();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getArithmeticVariableParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Alternatives"


    // $ANTLR start "rule__LinkState__LinkStateAlternatives_2_0"
    // InternalReactionRules.g:1454:1: rule__LinkState__LinkStateAlternatives_2_0 : ( ( ruleBoundAnyLink ) | ( ruleFreeLink ) | ( ruleBoundAnyOfTypeLink ) | ( ruleBoundLink ) | ( ruleWhatEver ) );
    public final void rule__LinkState__LinkStateAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1458:1: ( ( ruleBoundAnyLink ) | ( ruleFreeLink ) | ( ruleBoundAnyOfTypeLink ) | ( ruleBoundLink ) | ( ruleWhatEver ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case RULE_BOUND_LINK:
                {
                alt5=1;
                }
                break;
            case RULE_FREE_LINK:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            case RULE_INT:
                {
                alt5=4;
                }
                break;
            case RULE_WHATEVER_LINK:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalReactionRules.g:1459:2: ( ruleBoundAnyLink )
                    {
                    // InternalReactionRules.g:1459:2: ( ruleBoundAnyLink )
                    // InternalReactionRules.g:1460:3: ruleBoundAnyLink
                    {
                     before(grammarAccess.getLinkStateAccess().getLinkStateBoundAnyLinkParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBoundAnyLink();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getLinkStateBoundAnyLinkParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1465:2: ( ruleFreeLink )
                    {
                    // InternalReactionRules.g:1465:2: ( ruleFreeLink )
                    // InternalReactionRules.g:1466:3: ruleFreeLink
                    {
                     before(grammarAccess.getLinkStateAccess().getLinkStateFreeLinkParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFreeLink();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getLinkStateFreeLinkParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReactionRules.g:1471:2: ( ruleBoundAnyOfTypeLink )
                    {
                    // InternalReactionRules.g:1471:2: ( ruleBoundAnyOfTypeLink )
                    // InternalReactionRules.g:1472:3: ruleBoundAnyOfTypeLink
                    {
                     before(grammarAccess.getLinkStateAccess().getLinkStateBoundAnyOfTypeLinkParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBoundAnyOfTypeLink();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getLinkStateBoundAnyOfTypeLinkParserRuleCall_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalReactionRules.g:1477:2: ( ruleBoundLink )
                    {
                    // InternalReactionRules.g:1477:2: ( ruleBoundLink )
                    // InternalReactionRules.g:1478:3: ruleBoundLink
                    {
                     before(grammarAccess.getLinkStateAccess().getLinkStateBoundLinkParserRuleCall_2_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBoundLink();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getLinkStateBoundLinkParserRuleCall_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalReactionRules.g:1483:2: ( ruleWhatEver )
                    {
                    // InternalReactionRules.g:1483:2: ( ruleWhatEver )
                    // InternalReactionRules.g:1484:3: ruleWhatEver
                    {
                     before(grammarAccess.getLinkStateAccess().getLinkStateWhatEverParserRuleCall_2_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleWhatEver();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getLinkStateWhatEverParserRuleCall_2_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkState__LinkStateAlternatives_2_0"


    // $ANTLR start "rule__AgentPattern__Alternatives"
    // InternalReactionRules.g:1493:1: rule__AgentPattern__Alternatives : ( ( ruleValidAgentPattern ) | ( ruleVoidAgentPattern ) );
    public final void rule__AgentPattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1497:1: ( ( ruleValidAgentPattern ) | ( ruleVoidAgentPattern ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_VOID_PATTERN) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalReactionRules.g:1498:2: ( ruleValidAgentPattern )
                    {
                    // InternalReactionRules.g:1498:2: ( ruleValidAgentPattern )
                    // InternalReactionRules.g:1499:3: ruleValidAgentPattern
                    {
                     before(grammarAccess.getAgentPatternAccess().getValidAgentPatternParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleValidAgentPattern();

                    state._fsp--;

                     after(grammarAccess.getAgentPatternAccess().getValidAgentPatternParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1504:2: ( ruleVoidAgentPattern )
                    {
                    // InternalReactionRules.g:1504:2: ( ruleVoidAgentPattern )
                    // InternalReactionRules.g:1505:3: ruleVoidAgentPattern
                    {
                     before(grammarAccess.getAgentPatternAccess().getVoidAgentPatternParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVoidAgentPattern();

                    state._fsp--;

                     after(grammarAccess.getAgentPatternAccess().getVoidAgentPatternParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Alternatives"


    // $ANTLR start "rule__NumericAssignment__Alternatives"
    // InternalReactionRules.g:1514:1: rule__NumericAssignment__Alternatives : ( ( ruleNumericFromLiteral ) | ( ruleNumericFromVariable ) );
    public final void rule__NumericAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1518:1: ( ( ruleNumericFromLiteral ) | ( ruleNumericFromVariable ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalReactionRules.g:1519:2: ( ruleNumericFromLiteral )
                    {
                    // InternalReactionRules.g:1519:2: ( ruleNumericFromLiteral )
                    // InternalReactionRules.g:1520:3: ruleNumericFromLiteral
                    {
                     before(grammarAccess.getNumericAssignmentAccess().getNumericFromLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumericFromLiteral();

                    state._fsp--;

                     after(grammarAccess.getNumericAssignmentAccess().getNumericFromLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1525:2: ( ruleNumericFromVariable )
                    {
                    // InternalReactionRules.g:1525:2: ( ruleNumericFromVariable )
                    // InternalReactionRules.g:1526:3: ruleNumericFromVariable
                    {
                     before(grammarAccess.getNumericAssignmentAccess().getNumericFromVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumericFromVariable();

                    state._fsp--;

                     after(grammarAccess.getNumericAssignmentAccess().getNumericFromVariableParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericAssignment__Alternatives"


    // $ANTLR start "rule__PatternAssignment__Alternatives"
    // InternalReactionRules.g:1535:1: rule__PatternAssignment__Alternatives : ( ( ruleAssignFromPattern ) | ( ruleAssignFromVariable ) );
    public final void rule__PatternAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1539:1: ( ( ruleAssignFromPattern ) | ( ruleAssignFromVariable ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalReactionRules.g:1540:2: ( ruleAssignFromPattern )
                    {
                    // InternalReactionRules.g:1540:2: ( ruleAssignFromPattern )
                    // InternalReactionRules.g:1541:3: ruleAssignFromPattern
                    {
                     before(grammarAccess.getPatternAssignmentAccess().getAssignFromPatternParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignFromPattern();

                    state._fsp--;

                     after(grammarAccess.getPatternAssignmentAccess().getAssignFromPatternParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1546:2: ( ruleAssignFromVariable )
                    {
                    // InternalReactionRules.g:1546:2: ( ruleAssignFromVariable )
                    // InternalReactionRules.g:1547:3: ruleAssignFromVariable
                    {
                     before(grammarAccess.getPatternAssignmentAccess().getAssignFromVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignFromVariable();

                    state._fsp--;

                     after(grammarAccess.getPatternAssignmentAccess().getAssignFromVariableParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternAssignment__Alternatives"


    // $ANTLR start "rule__RuleBody__Alternatives"
    // InternalReactionRules.g:1556:1: rule__RuleBody__Alternatives : ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) );
    public final void rule__RuleBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1560:1: ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalReactionRules.g:1561:2: ( ruleUnidirectionalRule )
                    {
                    // InternalReactionRules.g:1561:2: ( ruleUnidirectionalRule )
                    // InternalReactionRules.g:1562:3: ruleUnidirectionalRule
                    {
                     before(grammarAccess.getRuleBodyAccess().getUnidirectionalRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUnidirectionalRule();

                    state._fsp--;

                     after(grammarAccess.getRuleBodyAccess().getUnidirectionalRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1567:2: ( ruleBidirectionalRule )
                    {
                    // InternalReactionRules.g:1567:2: ( ruleBidirectionalRule )
                    // InternalReactionRules.g:1568:3: ruleBidirectionalRule
                    {
                     before(grammarAccess.getRuleBodyAccess().getBidirectionalRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBidirectionalRule();

                    state._fsp--;

                     after(grammarAccess.getRuleBodyAccess().getBidirectionalRuleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Alternatives"


    // $ANTLR start "rule__TerminationCondition__Alternatives"
    // InternalReactionRules.g:1577:1: rule__TerminationCondition__Alternatives : ( ( ruleIterations ) | ( ruleTime ) | ( rulePopulation ) );
    public final void rule__TerminationCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1581:1: ( ( ruleIterations ) | ( ruleTime ) | ( rulePopulation ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt10=1;
                }
                break;
            case 37:
                {
                alt10=2;
                }
                break;
            case 38:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalReactionRules.g:1582:2: ( ruleIterations )
                    {
                    // InternalReactionRules.g:1582:2: ( ruleIterations )
                    // InternalReactionRules.g:1583:3: ruleIterations
                    {
                     before(grammarAccess.getTerminationConditionAccess().getIterationsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIterations();

                    state._fsp--;

                     after(grammarAccess.getTerminationConditionAccess().getIterationsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1588:2: ( ruleTime )
                    {
                    // InternalReactionRules.g:1588:2: ( ruleTime )
                    // InternalReactionRules.g:1589:3: ruleTime
                    {
                     before(grammarAccess.getTerminationConditionAccess().getTimeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTime();

                    state._fsp--;

                     after(grammarAccess.getTerminationConditionAccess().getTimeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReactionRules.g:1594:2: ( rulePopulation )
                    {
                    // InternalReactionRules.g:1594:2: ( rulePopulation )
                    // InternalReactionRules.g:1595:3: rulePopulation
                    {
                     before(grammarAccess.getTerminationConditionAccess().getPopulationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePopulation();

                    state._fsp--;

                     after(grammarAccess.getTerminationConditionAccess().getPopulationParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminationCondition__Alternatives"


    // $ANTLR start "rule__ReactionRuleModel__Group__0"
    // InternalReactionRules.g:1604:1: rule__ReactionRuleModel__Group__0 : rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1 ;
    public final void rule__ReactionRuleModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1608:1: ( rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1 )
            // InternalReactionRules.g:1609:2: rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ReactionRuleModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactionRuleModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionRuleModel__Group__0"


    // $ANTLR start "rule__ReactionRuleModel__Group__0__Impl"
    // InternalReactionRules.g:1616:1: rule__ReactionRuleModel__Group__0__Impl : ( ( rule__ReactionRuleModel__ModelAssignment_0 ) ) ;
    public final void rule__ReactionRuleModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1620:1: ( ( ( rule__ReactionRuleModel__ModelAssignment_0 ) ) )
            // InternalReactionRules.g:1621:1: ( ( rule__ReactionRuleModel__ModelAssignment_0 ) )
            {
            // InternalReactionRules.g:1621:1: ( ( rule__ReactionRuleModel__ModelAssignment_0 ) )
            // InternalReactionRules.g:1622:2: ( rule__ReactionRuleModel__ModelAssignment_0 )
            {
             before(grammarAccess.getReactionRuleModelAccess().getModelAssignment_0()); 
            // InternalReactionRules.g:1623:2: ( rule__ReactionRuleModel__ModelAssignment_0 )
            // InternalReactionRules.g:1623:3: rule__ReactionRuleModel__ModelAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ReactionRuleModel__ModelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReactionRuleModelAccess().getModelAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionRuleModel__Group__0__Impl"


    // $ANTLR start "rule__ReactionRuleModel__Group__1"
    // InternalReactionRules.g:1631:1: rule__ReactionRuleModel__Group__1 : rule__ReactionRuleModel__Group__1__Impl ;
    public final void rule__ReactionRuleModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1635:1: ( rule__ReactionRuleModel__Group__1__Impl )
            // InternalReactionRules.g:1636:2: rule__ReactionRuleModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactionRuleModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionRuleModel__Group__1"


    // $ANTLR start "rule__ReactionRuleModel__Group__1__Impl"
    // InternalReactionRules.g:1642:1: rule__ReactionRuleModel__Group__1__Impl : ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )* ) ;
    public final void rule__ReactionRuleModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1646:1: ( ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )* ) )
            // InternalReactionRules.g:1647:1: ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )* )
            {
            // InternalReactionRules.g:1647:1: ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )* )
            // InternalReactionRules.g:1648:2: ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )*
            {
             before(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesAssignment_1()); 
            // InternalReactionRules.g:1649:2: ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=28 && LA11_0<=29)||(LA11_0>=33 && LA11_0<=35)||LA11_0==40) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalReactionRules.g:1649:3: rule__ReactionRuleModel__ReactionPropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ReactionRuleModel__ReactionPropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionRuleModel__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__0"
    // InternalReactionRules.g:1658:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1662:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalReactionRules.g:1663:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalReactionRules.g:1670:1: rule__Model__Group__0__Impl : ( 'ModelID' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1674:1: ( ( 'ModelID' ) )
            // InternalReactionRules.g:1675:1: ( 'ModelID' )
            {
            // InternalReactionRules.g:1675:1: ( 'ModelID' )
            // InternalReactionRules.g:1676:2: 'ModelID'
            {
             before(grammarAccess.getModelAccess().getModelIDKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelIDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalReactionRules.g:1685:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1689:1: ( rule__Model__Group__1__Impl )
            // InternalReactionRules.g:1690:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalReactionRules.g:1696:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1700:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalReactionRules.g:1701:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:1701:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalReactionRules.g:1702:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:1703:2: ( rule__Model__NameAssignment_1 )
            // InternalReactionRules.g:1703:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Float__Group__0"
    // InternalReactionRules.g:1712:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1716:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalReactionRules.g:1717:2: rule__Float__Group__0__Impl rule__Float__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Float__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__0"


    // $ANTLR start "rule__Float__Group__0__Impl"
    // InternalReactionRules.g:1724:1: rule__Float__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1728:1: ( ( ( '-' )? ) )
            // InternalReactionRules.g:1729:1: ( ( '-' )? )
            {
            // InternalReactionRules.g:1729:1: ( ( '-' )? )
            // InternalReactionRules.g:1730:2: ( '-' )?
            {
             before(grammarAccess.getFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalReactionRules.g:1731:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalReactionRules.g:1731:3: '-'
                    {
                    match(input,19,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__0__Impl"


    // $ANTLR start "rule__Float__Group__1"
    // InternalReactionRules.g:1739:1: rule__Float__Group__1 : rule__Float__Group__1__Impl rule__Float__Group__2 ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1743:1: ( rule__Float__Group__1__Impl rule__Float__Group__2 )
            // InternalReactionRules.g:1744:2: rule__Float__Group__1__Impl rule__Float__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Float__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__1"


    // $ANTLR start "rule__Float__Group__1__Impl"
    // InternalReactionRules.g:1751:1: rule__Float__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1755:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:1756:1: ( RULE_INT )
            {
            // InternalReactionRules.g:1756:1: ( RULE_INT )
            // InternalReactionRules.g:1757:2: RULE_INT
            {
             before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__1__Impl"


    // $ANTLR start "rule__Float__Group__2"
    // InternalReactionRules.g:1766:1: rule__Float__Group__2 : rule__Float__Group__2__Impl rule__Float__Group__3 ;
    public final void rule__Float__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1770:1: ( rule__Float__Group__2__Impl rule__Float__Group__3 )
            // InternalReactionRules.g:1771:2: rule__Float__Group__2__Impl rule__Float__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Float__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__2"


    // $ANTLR start "rule__Float__Group__2__Impl"
    // InternalReactionRules.g:1778:1: rule__Float__Group__2__Impl : ( '.' ) ;
    public final void rule__Float__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1782:1: ( ( '.' ) )
            // InternalReactionRules.g:1783:1: ( '.' )
            {
            // InternalReactionRules.g:1783:1: ( '.' )
            // InternalReactionRules.g:1784:2: '.'
            {
             before(grammarAccess.getFloatAccess().getFullStopKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__2__Impl"


    // $ANTLR start "rule__Float__Group__3"
    // InternalReactionRules.g:1793:1: rule__Float__Group__3 : rule__Float__Group__3__Impl ;
    public final void rule__Float__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1797:1: ( rule__Float__Group__3__Impl )
            // InternalReactionRules.g:1798:2: rule__Float__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__3"


    // $ANTLR start "rule__Float__Group__3__Impl"
    // InternalReactionRules.g:1804:1: rule__Float__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1808:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:1809:1: ( RULE_INT )
            {
            // InternalReactionRules.g:1809:1: ( RULE_INT )
            // InternalReactionRules.g:1810:2: RULE_INT
            {
             before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__3__Impl"


    // $ANTLR start "rule__ScientificFloat__Group__0"
    // InternalReactionRules.g:1820:1: rule__ScientificFloat__Group__0 : rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1 ;
    public final void rule__ScientificFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1824:1: ( rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1 )
            // InternalReactionRules.g:1825:2: rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ScientificFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScientificFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScientificFloat__Group__0"


    // $ANTLR start "rule__ScientificFloat__Group__0__Impl"
    // InternalReactionRules.g:1832:1: rule__ScientificFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ScientificFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1836:1: ( ( ( '-' )? ) )
            // InternalReactionRules.g:1837:1: ( ( '-' )? )
            {
            // InternalReactionRules.g:1837:1: ( ( '-' )? )
            // InternalReactionRules.g:1838:2: ( '-' )?
            {
             before(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalReactionRules.g:1839:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalReactionRules.g:1839:3: '-'
                    {
                    match(input,19,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScientificFloat__Group__0__Impl"


    // $ANTLR start "rule__ScientificFloat__Group__1"
    // InternalReactionRules.g:1847:1: rule__ScientificFloat__Group__1 : rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2 ;
    public final void rule__ScientificFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1851:1: ( rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2 )
            // InternalReactionRules.g:1852:2: rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ScientificFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScientificFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScientificFloat__Group__1"


    // $ANTLR start "rule__ScientificFloat__Group__1__Impl"
    // InternalReactionRules.g:1859:1: rule__ScientificFloat__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1863:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:1864:1: ( RULE_INT )
            {
            // InternalReactionRules.g:1864:1: ( RULE_INT )
            // InternalReactionRules.g:1865:2: RULE_INT
            {
             before(grammarAccess.getScientificFloatAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getScientificFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScientificFloat__Group__1__Impl"


    // $ANTLR start "rule__ScientificFloat__Group__2"
    // InternalReactionRules.g:1874:1: rule__ScientificFloat__Group__2 : rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3 ;
    public final void rule__ScientificFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1878:1: ( rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3 )
            // InternalReactionRules.g:1879:2: rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ScientificFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScientificFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScientificFloat__Group__2"


    // $ANTLR start "rule__ScientificFloat__Group__2__Impl"
    // InternalReactionRules.g:1886:1: rule__ScientificFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__ScientificFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1890:1: ( ( '.' ) )
            // InternalReactionRules.g:1891:1: ( '.' )
            {
            // InternalReactionRules.g:1891:1: ( '.' )
            // InternalReactionRules.g:1892:2: '.'
            {
             before(grammarAccess.getScientificFloatAccess().getFullStopKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getScientificFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScientificFloat__Group__2__Impl"


    // $ANTLR start "rule__ScientificFloat__Group__3"
    // InternalReactionRules.g:1901:1: rule__ScientificFloat__Group__3 : rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4 ;
    public final void rule__ScientificFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1905:1: ( rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4 )
            // InternalReactionRules.g:1906:2: rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ScientificFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScientificFloat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScientificFloat__Group__3"


    // $ANTLR start "rule__ScientificFloat__Group__3__Impl"
    // InternalReactionRules.g:1913:1: rule__ScientificFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1917:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:1918:1: ( RULE_INT )
            {
            // InternalReactionRules.g:1918:1: ( RULE_INT )
            // InternalReactionRules.g:1919:2: RULE_INT
            {
             before(grammarAccess.getScientificFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getScientificFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScientificFloat__Group__3__Impl"


    // $ANTLR start "rule__ScientificFloat__Group__4"
    // InternalReactionRules.g:1928:1: rule__ScientificFloat__Group__4 : rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5 ;
    public final void rule__ScientificFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1932:1: ( rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5 )
            // InternalReactionRules.g:1933:2: rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__ScientificFloat__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScientificFloat__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScientificFloat__Group__4"


    // $ANTLR start "rule__ScientificFloat__Group__4__Impl"
    // InternalReactionRules.g:1940:1: rule__ScientificFloat__Group__4__Impl : ( RULE_EXPONENT ) ;
    public final void rule__ScientificFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1944:1: ( ( RULE_EXPONENT ) )
            // InternalReactionRules.g:1945:1: ( RULE_EXPONENT )
            {
            // InternalReactionRules.g:1945:1: ( RULE_EXPONENT )
            // InternalReactionRules.g:1946:2: RULE_EXPONENT
            {
             before(grammarAccess.getScientificFloatAccess().getEXPONENTTerminalRuleCall_4()); 
            match(input,RULE_EXPONENT,FOLLOW_2); 
             after(grammarAccess.getScientificFloatAccess().getEXPONENTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScientificFloat__Group__4__Impl"


    // $ANTLR start "rule__ScientificFloat__Group__5"
    // InternalReactionRules.g:1955:1: rule__ScientificFloat__Group__5 : rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6 ;
    public final void rule__ScientificFloat__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1959:1: ( rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6 )
            // InternalReactionRules.g:1960:2: rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ScientificFloat__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScientificFloat__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScientificFloat__Group__5"


    // $ANTLR start "rule__ScientificFloat__Group__5__Impl"
    // InternalReactionRules.g:1967:1: rule__ScientificFloat__Group__5__Impl : ( ( rule__ScientificFloat__Alternatives_5 ) ) ;
    public final void rule__ScientificFloat__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1971:1: ( ( ( rule__ScientificFloat__Alternatives_5 ) ) )
            // InternalReactionRules.g:1972:1: ( ( rule__ScientificFloat__Alternatives_5 ) )
            {
            // InternalReactionRules.g:1972:1: ( ( rule__ScientificFloat__Alternatives_5 ) )
            // InternalReactionRules.g:1973:2: ( rule__ScientificFloat__Alternatives_5 )
            {
             before(grammarAccess.getScientificFloatAccess().getAlternatives_5()); 
            // InternalReactionRules.g:1974:2: ( rule__ScientificFloat__Alternatives_5 )
            // InternalReactionRules.g:1974:3: rule__ScientificFloat__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__ScientificFloat__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getScientificFloatAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScientificFloat__Group__5__Impl"


    // $ANTLR start "rule__ScientificFloat__Group__6"
    // InternalReactionRules.g:1982:1: rule__ScientificFloat__Group__6 : rule__ScientificFloat__Group__6__Impl ;
    public final void rule__ScientificFloat__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1986:1: ( rule__ScientificFloat__Group__6__Impl )
            // InternalReactionRules.g:1987:2: rule__ScientificFloat__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScientificFloat__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScientificFloat__Group__6"


    // $ANTLR start "rule__ScientificFloat__Group__6__Impl"
    // InternalReactionRules.g:1993:1: rule__ScientificFloat__Group__6__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1997:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:1998:1: ( RULE_INT )
            {
            // InternalReactionRules.g:1998:1: ( RULE_INT )
            // InternalReactionRules.g:1999:2: RULE_INT
            {
             before(grammarAccess.getScientificFloatAccess().getINTTerminalRuleCall_6()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getScientificFloatAccess().getINTTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScientificFloat__Group__6__Impl"


    // $ANTLR start "rule__SignedInteger__Group__0"
    // InternalReactionRules.g:2009:1: rule__SignedInteger__Group__0 : rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 ;
    public final void rule__SignedInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2013:1: ( rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 )
            // InternalReactionRules.g:2014:2: rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SignedInteger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignedInteger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInteger__Group__0"


    // $ANTLR start "rule__SignedInteger__Group__0__Impl"
    // InternalReactionRules.g:2021:1: rule__SignedInteger__Group__0__Impl : ( '-' ) ;
    public final void rule__SignedInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2025:1: ( ( '-' ) )
            // InternalReactionRules.g:2026:1: ( '-' )
            {
            // InternalReactionRules.g:2026:1: ( '-' )
            // InternalReactionRules.g:2027:2: '-'
            {
             before(grammarAccess.getSignedIntegerAccess().getHyphenMinusKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSignedIntegerAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInteger__Group__0__Impl"


    // $ANTLR start "rule__SignedInteger__Group__1"
    // InternalReactionRules.g:2036:1: rule__SignedInteger__Group__1 : rule__SignedInteger__Group__1__Impl ;
    public final void rule__SignedInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2040:1: ( rule__SignedInteger__Group__1__Impl )
            // InternalReactionRules.g:2041:2: rule__SignedInteger__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SignedInteger__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInteger__Group__1"


    // $ANTLR start "rule__SignedInteger__Group__1__Impl"
    // InternalReactionRules.g:2047:1: rule__SignedInteger__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__SignedInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2051:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2052:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2052:1: ( RULE_INT )
            // InternalReactionRules.g:2053:2: RULE_INT
            {
             before(grammarAccess.getSignedIntegerAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSignedIntegerAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInteger__Group__1__Impl"


    // $ANTLR start "rule__States__Group__0"
    // InternalReactionRules.g:2063:1: rule__States__Group__0 : rule__States__Group__0__Impl rule__States__Group__1 ;
    public final void rule__States__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2067:1: ( rule__States__Group__0__Impl rule__States__Group__1 )
            // InternalReactionRules.g:2068:2: rule__States__Group__0__Impl rule__States__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__States__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__States__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group__0"


    // $ANTLR start "rule__States__Group__0__Impl"
    // InternalReactionRules.g:2075:1: rule__States__Group__0__Impl : ( () ) ;
    public final void rule__States__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2079:1: ( ( () ) )
            // InternalReactionRules.g:2080:1: ( () )
            {
            // InternalReactionRules.g:2080:1: ( () )
            // InternalReactionRules.g:2081:2: ()
            {
             before(grammarAccess.getStatesAccess().getStatesAction_0()); 
            // InternalReactionRules.g:2082:2: ()
            // InternalReactionRules.g:2082:3: 
            {
            }

             after(grammarAccess.getStatesAccess().getStatesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group__0__Impl"


    // $ANTLR start "rule__States__Group__1"
    // InternalReactionRules.g:2090:1: rule__States__Group__1 : rule__States__Group__1__Impl ;
    public final void rule__States__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2094:1: ( rule__States__Group__1__Impl )
            // InternalReactionRules.g:2095:2: rule__States__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__States__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group__1"


    // $ANTLR start "rule__States__Group__1__Impl"
    // InternalReactionRules.g:2101:1: rule__States__Group__1__Impl : ( ( rule__States__Group_1__0 )? ) ;
    public final void rule__States__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2105:1: ( ( ( rule__States__Group_1__0 )? ) )
            // InternalReactionRules.g:2106:1: ( ( rule__States__Group_1__0 )? )
            {
            // InternalReactionRules.g:2106:1: ( ( rule__States__Group_1__0 )? )
            // InternalReactionRules.g:2107:2: ( rule__States__Group_1__0 )?
            {
             before(grammarAccess.getStatesAccess().getGroup_1()); 
            // InternalReactionRules.g:2108:2: ( rule__States__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalReactionRules.g:2108:3: rule__States__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__States__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group__1__Impl"


    // $ANTLR start "rule__States__Group_1__0"
    // InternalReactionRules.g:2117:1: rule__States__Group_1__0 : rule__States__Group_1__0__Impl rule__States__Group_1__1 ;
    public final void rule__States__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2121:1: ( rule__States__Group_1__0__Impl rule__States__Group_1__1 )
            // InternalReactionRules.g:2122:2: rule__States__Group_1__0__Impl rule__States__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__States__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__States__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group_1__0"


    // $ANTLR start "rule__States__Group_1__0__Impl"
    // InternalReactionRules.g:2129:1: rule__States__Group_1__0__Impl : ( '{' ) ;
    public final void rule__States__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2133:1: ( ( '{' ) )
            // InternalReactionRules.g:2134:1: ( '{' )
            {
            // InternalReactionRules.g:2134:1: ( '{' )
            // InternalReactionRules.g:2135:2: '{'
            {
             before(grammarAccess.getStatesAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStatesAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group_1__0__Impl"


    // $ANTLR start "rule__States__Group_1__1"
    // InternalReactionRules.g:2144:1: rule__States__Group_1__1 : rule__States__Group_1__1__Impl rule__States__Group_1__2 ;
    public final void rule__States__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2148:1: ( rule__States__Group_1__1__Impl rule__States__Group_1__2 )
            // InternalReactionRules.g:2149:2: rule__States__Group_1__1__Impl rule__States__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__States__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__States__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group_1__1"


    // $ANTLR start "rule__States__Group_1__1__Impl"
    // InternalReactionRules.g:2156:1: rule__States__Group_1__1__Impl : ( ( rule__States__StateAssignment_1_1 ) ) ;
    public final void rule__States__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2160:1: ( ( ( rule__States__StateAssignment_1_1 ) ) )
            // InternalReactionRules.g:2161:1: ( ( rule__States__StateAssignment_1_1 ) )
            {
            // InternalReactionRules.g:2161:1: ( ( rule__States__StateAssignment_1_1 ) )
            // InternalReactionRules.g:2162:2: ( rule__States__StateAssignment_1_1 )
            {
             before(grammarAccess.getStatesAccess().getStateAssignment_1_1()); 
            // InternalReactionRules.g:2163:2: ( rule__States__StateAssignment_1_1 )
            // InternalReactionRules.g:2163:3: rule__States__StateAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__States__StateAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStatesAccess().getStateAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group_1__1__Impl"


    // $ANTLR start "rule__States__Group_1__2"
    // InternalReactionRules.g:2171:1: rule__States__Group_1__2 : rule__States__Group_1__2__Impl rule__States__Group_1__3 ;
    public final void rule__States__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2175:1: ( rule__States__Group_1__2__Impl rule__States__Group_1__3 )
            // InternalReactionRules.g:2176:2: rule__States__Group_1__2__Impl rule__States__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__States__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__States__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group_1__2"


    // $ANTLR start "rule__States__Group_1__2__Impl"
    // InternalReactionRules.g:2183:1: rule__States__Group_1__2__Impl : ( ( rule__States__Group_1_2__0 )* ) ;
    public final void rule__States__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2187:1: ( ( ( rule__States__Group_1_2__0 )* ) )
            // InternalReactionRules.g:2188:1: ( ( rule__States__Group_1_2__0 )* )
            {
            // InternalReactionRules.g:2188:1: ( ( rule__States__Group_1_2__0 )* )
            // InternalReactionRules.g:2189:2: ( rule__States__Group_1_2__0 )*
            {
             before(grammarAccess.getStatesAccess().getGroup_1_2()); 
            // InternalReactionRules.g:2190:2: ( rule__States__Group_1_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalReactionRules.g:2190:3: rule__States__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__States__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getStatesAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group_1__2__Impl"


    // $ANTLR start "rule__States__Group_1__3"
    // InternalReactionRules.g:2198:1: rule__States__Group_1__3 : rule__States__Group_1__3__Impl ;
    public final void rule__States__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2202:1: ( rule__States__Group_1__3__Impl )
            // InternalReactionRules.g:2203:2: rule__States__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__States__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group_1__3"


    // $ANTLR start "rule__States__Group_1__3__Impl"
    // InternalReactionRules.g:2209:1: rule__States__Group_1__3__Impl : ( '}' ) ;
    public final void rule__States__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2213:1: ( ( '}' ) )
            // InternalReactionRules.g:2214:1: ( '}' )
            {
            // InternalReactionRules.g:2214:1: ( '}' )
            // InternalReactionRules.g:2215:2: '}'
            {
             before(grammarAccess.getStatesAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStatesAccess().getRightCurlyBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group_1__3__Impl"


    // $ANTLR start "rule__States__Group_1_2__0"
    // InternalReactionRules.g:2225:1: rule__States__Group_1_2__0 : rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1 ;
    public final void rule__States__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2229:1: ( rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1 )
            // InternalReactionRules.g:2230:2: rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1
            {
            pushFollow(FOLLOW_5);
            rule__States__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__States__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group_1_2__0"


    // $ANTLR start "rule__States__Group_1_2__0__Impl"
    // InternalReactionRules.g:2237:1: rule__States__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__States__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2241:1: ( ( ',' ) )
            // InternalReactionRules.g:2242:1: ( ',' )
            {
            // InternalReactionRules.g:2242:1: ( ',' )
            // InternalReactionRules.g:2243:2: ','
            {
             before(grammarAccess.getStatesAccess().getCommaKeyword_1_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStatesAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group_1_2__0__Impl"


    // $ANTLR start "rule__States__Group_1_2__1"
    // InternalReactionRules.g:2252:1: rule__States__Group_1_2__1 : rule__States__Group_1_2__1__Impl ;
    public final void rule__States__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2256:1: ( rule__States__Group_1_2__1__Impl )
            // InternalReactionRules.g:2257:2: rule__States__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__States__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group_1_2__1"


    // $ANTLR start "rule__States__Group_1_2__1__Impl"
    // InternalReactionRules.g:2263:1: rule__States__Group_1_2__1__Impl : ( ( rule__States__StateAssignment_1_2_1 ) ) ;
    public final void rule__States__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2267:1: ( ( ( rule__States__StateAssignment_1_2_1 ) ) )
            // InternalReactionRules.g:2268:1: ( ( rule__States__StateAssignment_1_2_1 ) )
            {
            // InternalReactionRules.g:2268:1: ( ( rule__States__StateAssignment_1_2_1 ) )
            // InternalReactionRules.g:2269:2: ( rule__States__StateAssignment_1_2_1 )
            {
             before(grammarAccess.getStatesAccess().getStateAssignment_1_2_1()); 
            // InternalReactionRules.g:2270:2: ( rule__States__StateAssignment_1_2_1 )
            // InternalReactionRules.g:2270:3: rule__States__StateAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__States__StateAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStatesAccess().getStateAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group_1_2__1__Impl"


    // $ANTLR start "rule__Site__Group__0"
    // InternalReactionRules.g:2279:1: rule__Site__Group__0 : rule__Site__Group__0__Impl rule__Site__Group__1 ;
    public final void rule__Site__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2283:1: ( rule__Site__Group__0__Impl rule__Site__Group__1 )
            // InternalReactionRules.g:2284:2: rule__Site__Group__0__Impl rule__Site__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Site__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Site__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__0"


    // $ANTLR start "rule__Site__Group__0__Impl"
    // InternalReactionRules.g:2291:1: rule__Site__Group__0__Impl : ( ( rule__Site__NameAssignment_0 ) ) ;
    public final void rule__Site__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2295:1: ( ( ( rule__Site__NameAssignment_0 ) ) )
            // InternalReactionRules.g:2296:1: ( ( rule__Site__NameAssignment_0 ) )
            {
            // InternalReactionRules.g:2296:1: ( ( rule__Site__NameAssignment_0 ) )
            // InternalReactionRules.g:2297:2: ( rule__Site__NameAssignment_0 )
            {
             before(grammarAccess.getSiteAccess().getNameAssignment_0()); 
            // InternalReactionRules.g:2298:2: ( rule__Site__NameAssignment_0 )
            // InternalReactionRules.g:2298:3: rule__Site__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Site__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSiteAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__0__Impl"


    // $ANTLR start "rule__Site__Group__1"
    // InternalReactionRules.g:2306:1: rule__Site__Group__1 : rule__Site__Group__1__Impl ;
    public final void rule__Site__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2310:1: ( rule__Site__Group__1__Impl )
            // InternalReactionRules.g:2311:2: rule__Site__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Site__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__1"


    // $ANTLR start "rule__Site__Group__1__Impl"
    // InternalReactionRules.g:2317:1: rule__Site__Group__1__Impl : ( ( rule__Site__StatesAssignment_1 ) ) ;
    public final void rule__Site__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2321:1: ( ( ( rule__Site__StatesAssignment_1 ) ) )
            // InternalReactionRules.g:2322:1: ( ( rule__Site__StatesAssignment_1 ) )
            {
            // InternalReactionRules.g:2322:1: ( ( rule__Site__StatesAssignment_1 ) )
            // InternalReactionRules.g:2323:2: ( rule__Site__StatesAssignment_1 )
            {
             before(grammarAccess.getSiteAccess().getStatesAssignment_1()); 
            // InternalReactionRules.g:2324:2: ( rule__Site__StatesAssignment_1 )
            // InternalReactionRules.g:2324:3: rule__Site__StatesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Site__StatesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSiteAccess().getStatesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__1__Impl"


    // $ANTLR start "rule__Sites__Group__0"
    // InternalReactionRules.g:2333:1: rule__Sites__Group__0 : rule__Sites__Group__0__Impl rule__Sites__Group__1 ;
    public final void rule__Sites__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2337:1: ( rule__Sites__Group__0__Impl rule__Sites__Group__1 )
            // InternalReactionRules.g:2338:2: rule__Sites__Group__0__Impl rule__Sites__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Sites__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sites__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__Group__0"


    // $ANTLR start "rule__Sites__Group__0__Impl"
    // InternalReactionRules.g:2345:1: rule__Sites__Group__0__Impl : ( () ) ;
    public final void rule__Sites__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2349:1: ( ( () ) )
            // InternalReactionRules.g:2350:1: ( () )
            {
            // InternalReactionRules.g:2350:1: ( () )
            // InternalReactionRules.g:2351:2: ()
            {
             before(grammarAccess.getSitesAccess().getSitesAction_0()); 
            // InternalReactionRules.g:2352:2: ()
            // InternalReactionRules.g:2352:3: 
            {
            }

             after(grammarAccess.getSitesAccess().getSitesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__Group__0__Impl"


    // $ANTLR start "rule__Sites__Group__1"
    // InternalReactionRules.g:2360:1: rule__Sites__Group__1 : rule__Sites__Group__1__Impl ;
    public final void rule__Sites__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2364:1: ( rule__Sites__Group__1__Impl )
            // InternalReactionRules.g:2365:2: rule__Sites__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sites__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__Group__1"


    // $ANTLR start "rule__Sites__Group__1__Impl"
    // InternalReactionRules.g:2371:1: rule__Sites__Group__1__Impl : ( ( rule__Sites__Group_1__0 )? ) ;
    public final void rule__Sites__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2375:1: ( ( ( rule__Sites__Group_1__0 )? ) )
            // InternalReactionRules.g:2376:1: ( ( rule__Sites__Group_1__0 )? )
            {
            // InternalReactionRules.g:2376:1: ( ( rule__Sites__Group_1__0 )? )
            // InternalReactionRules.g:2377:2: ( rule__Sites__Group_1__0 )?
            {
             before(grammarAccess.getSitesAccess().getGroup_1()); 
            // InternalReactionRules.g:2378:2: ( rule__Sites__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalReactionRules.g:2378:3: rule__Sites__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sites__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSitesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__Group__1__Impl"


    // $ANTLR start "rule__Sites__Group_1__0"
    // InternalReactionRules.g:2387:1: rule__Sites__Group_1__0 : rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1 ;
    public final void rule__Sites__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2391:1: ( rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1 )
            // InternalReactionRules.g:2392:2: rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Sites__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sites__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__Group_1__0"


    // $ANTLR start "rule__Sites__Group_1__0__Impl"
    // InternalReactionRules.g:2399:1: rule__Sites__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Sites__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2403:1: ( ( '(' ) )
            // InternalReactionRules.g:2404:1: ( '(' )
            {
            // InternalReactionRules.g:2404:1: ( '(' )
            // InternalReactionRules.g:2405:2: '('
            {
             before(grammarAccess.getSitesAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSitesAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__Group_1__0__Impl"


    // $ANTLR start "rule__Sites__Group_1__1"
    // InternalReactionRules.g:2414:1: rule__Sites__Group_1__1 : rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2 ;
    public final void rule__Sites__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2418:1: ( rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2 )
            // InternalReactionRules.g:2419:2: rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Sites__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sites__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__Group_1__1"


    // $ANTLR start "rule__Sites__Group_1__1__Impl"
    // InternalReactionRules.g:2426:1: rule__Sites__Group_1__1__Impl : ( ( rule__Sites__SitesAssignment_1_1 ) ) ;
    public final void rule__Sites__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2430:1: ( ( ( rule__Sites__SitesAssignment_1_1 ) ) )
            // InternalReactionRules.g:2431:1: ( ( rule__Sites__SitesAssignment_1_1 ) )
            {
            // InternalReactionRules.g:2431:1: ( ( rule__Sites__SitesAssignment_1_1 ) )
            // InternalReactionRules.g:2432:2: ( rule__Sites__SitesAssignment_1_1 )
            {
             before(grammarAccess.getSitesAccess().getSitesAssignment_1_1()); 
            // InternalReactionRules.g:2433:2: ( rule__Sites__SitesAssignment_1_1 )
            // InternalReactionRules.g:2433:3: rule__Sites__SitesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Sites__SitesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSitesAccess().getSitesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__Group_1__1__Impl"


    // $ANTLR start "rule__Sites__Group_1__2"
    // InternalReactionRules.g:2441:1: rule__Sites__Group_1__2 : rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3 ;
    public final void rule__Sites__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2445:1: ( rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3 )
            // InternalReactionRules.g:2446:2: rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3
            {
            pushFollow(FOLLOW_14);
            rule__Sites__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sites__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__Group_1__2"


    // $ANTLR start "rule__Sites__Group_1__2__Impl"
    // InternalReactionRules.g:2453:1: rule__Sites__Group_1__2__Impl : ( ( rule__Sites__Group_1_2__0 )* ) ;
    public final void rule__Sites__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2457:1: ( ( ( rule__Sites__Group_1_2__0 )* ) )
            // InternalReactionRules.g:2458:1: ( ( rule__Sites__Group_1_2__0 )* )
            {
            // InternalReactionRules.g:2458:1: ( ( rule__Sites__Group_1_2__0 )* )
            // InternalReactionRules.g:2459:2: ( rule__Sites__Group_1_2__0 )*
            {
             before(grammarAccess.getSitesAccess().getGroup_1_2()); 
            // InternalReactionRules.g:2460:2: ( rule__Sites__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalReactionRules.g:2460:3: rule__Sites__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Sites__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSitesAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__Group_1__2__Impl"


    // $ANTLR start "rule__Sites__Group_1__3"
    // InternalReactionRules.g:2468:1: rule__Sites__Group_1__3 : rule__Sites__Group_1__3__Impl ;
    public final void rule__Sites__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2472:1: ( rule__Sites__Group_1__3__Impl )
            // InternalReactionRules.g:2473:2: rule__Sites__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sites__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__Group_1__3"


    // $ANTLR start "rule__Sites__Group_1__3__Impl"
    // InternalReactionRules.g:2479:1: rule__Sites__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Sites__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2483:1: ( ( ')' ) )
            // InternalReactionRules.g:2484:1: ( ')' )
            {
            // InternalReactionRules.g:2484:1: ( ')' )
            // InternalReactionRules.g:2485:2: ')'
            {
             before(grammarAccess.getSitesAccess().getRightParenthesisKeyword_1_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSitesAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__Group_1__3__Impl"


    // $ANTLR start "rule__Sites__Group_1_2__0"
    // InternalReactionRules.g:2495:1: rule__Sites__Group_1_2__0 : rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1 ;
    public final void rule__Sites__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2499:1: ( rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1 )
            // InternalReactionRules.g:2500:2: rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Sites__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sites__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__Group_1_2__0"


    // $ANTLR start "rule__Sites__Group_1_2__0__Impl"
    // InternalReactionRules.g:2507:1: rule__Sites__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Sites__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2511:1: ( ( ',' ) )
            // InternalReactionRules.g:2512:1: ( ',' )
            {
            // InternalReactionRules.g:2512:1: ( ',' )
            // InternalReactionRules.g:2513:2: ','
            {
             before(grammarAccess.getSitesAccess().getCommaKeyword_1_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSitesAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__Group_1_2__0__Impl"


    // $ANTLR start "rule__Sites__Group_1_2__1"
    // InternalReactionRules.g:2522:1: rule__Sites__Group_1_2__1 : rule__Sites__Group_1_2__1__Impl ;
    public final void rule__Sites__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2526:1: ( rule__Sites__Group_1_2__1__Impl )
            // InternalReactionRules.g:2527:2: rule__Sites__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sites__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__Group_1_2__1"


    // $ANTLR start "rule__Sites__Group_1_2__1__Impl"
    // InternalReactionRules.g:2533:1: rule__Sites__Group_1_2__1__Impl : ( ( rule__Sites__SitesAssignment_1_2_1 ) ) ;
    public final void rule__Sites__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2537:1: ( ( ( rule__Sites__SitesAssignment_1_2_1 ) ) )
            // InternalReactionRules.g:2538:1: ( ( rule__Sites__SitesAssignment_1_2_1 ) )
            {
            // InternalReactionRules.g:2538:1: ( ( rule__Sites__SitesAssignment_1_2_1 ) )
            // InternalReactionRules.g:2539:2: ( rule__Sites__SitesAssignment_1_2_1 )
            {
             before(grammarAccess.getSitesAccess().getSitesAssignment_1_2_1()); 
            // InternalReactionRules.g:2540:2: ( rule__Sites__SitesAssignment_1_2_1 )
            // InternalReactionRules.g:2540:3: rule__Sites__SitesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Sites__SitesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSitesAccess().getSitesAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__Group_1_2__1__Impl"


    // $ANTLR start "rule__Agent__Group__0"
    // InternalReactionRules.g:2549:1: rule__Agent__Group__0 : rule__Agent__Group__0__Impl rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2553:1: ( rule__Agent__Group__0__Impl rule__Agent__Group__1 )
            // InternalReactionRules.g:2554:2: rule__Agent__Group__0__Impl rule__Agent__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Agent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Agent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__0"


    // $ANTLR start "rule__Agent__Group__0__Impl"
    // InternalReactionRules.g:2561:1: rule__Agent__Group__0__Impl : ( 'agent' ) ;
    public final void rule__Agent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2565:1: ( ( 'agent' ) )
            // InternalReactionRules.g:2566:1: ( 'agent' )
            {
            // InternalReactionRules.g:2566:1: ( 'agent' )
            // InternalReactionRules.g:2567:2: 'agent'
            {
             before(grammarAccess.getAgentAccess().getAgentKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAgentAccess().getAgentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__0__Impl"


    // $ANTLR start "rule__Agent__Group__1"
    // InternalReactionRules.g:2576:1: rule__Agent__Group__1 : rule__Agent__Group__1__Impl rule__Agent__Group__2 ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2580:1: ( rule__Agent__Group__1__Impl rule__Agent__Group__2 )
            // InternalReactionRules.g:2581:2: rule__Agent__Group__1__Impl rule__Agent__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Agent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Agent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__1"


    // $ANTLR start "rule__Agent__Group__1__Impl"
    // InternalReactionRules.g:2588:1: rule__Agent__Group__1__Impl : ( ( rule__Agent__NameAssignment_1 ) ) ;
    public final void rule__Agent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2592:1: ( ( ( rule__Agent__NameAssignment_1 ) ) )
            // InternalReactionRules.g:2593:1: ( ( rule__Agent__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:2593:1: ( ( rule__Agent__NameAssignment_1 ) )
            // InternalReactionRules.g:2594:2: ( rule__Agent__NameAssignment_1 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:2595:2: ( rule__Agent__NameAssignment_1 )
            // InternalReactionRules.g:2595:3: rule__Agent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Agent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAgentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__1__Impl"


    // $ANTLR start "rule__Agent__Group__2"
    // InternalReactionRules.g:2603:1: rule__Agent__Group__2 : rule__Agent__Group__2__Impl ;
    public final void rule__Agent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2607:1: ( rule__Agent__Group__2__Impl )
            // InternalReactionRules.g:2608:2: rule__Agent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Agent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__2"


    // $ANTLR start "rule__Agent__Group__2__Impl"
    // InternalReactionRules.g:2614:1: rule__Agent__Group__2__Impl : ( ( rule__Agent__SitesAssignment_2 ) ) ;
    public final void rule__Agent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2618:1: ( ( ( rule__Agent__SitesAssignment_2 ) ) )
            // InternalReactionRules.g:2619:1: ( ( rule__Agent__SitesAssignment_2 ) )
            {
            // InternalReactionRules.g:2619:1: ( ( rule__Agent__SitesAssignment_2 ) )
            // InternalReactionRules.g:2620:2: ( rule__Agent__SitesAssignment_2 )
            {
             before(grammarAccess.getAgentAccess().getSitesAssignment_2()); 
            // InternalReactionRules.g:2621:2: ( rule__Agent__SitesAssignment_2 )
            // InternalReactionRules.g:2621:3: rule__Agent__SitesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Agent__SitesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAgentAccess().getSitesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__2__Impl"


    // $ANTLR start "rule__PatternVariable__Group__0"
    // InternalReactionRules.g:2630:1: rule__PatternVariable__Group__0 : rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 ;
    public final void rule__PatternVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2634:1: ( rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 )
            // InternalReactionRules.g:2635:2: rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PatternVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__Group__0"


    // $ANTLR start "rule__PatternVariable__Group__0__Impl"
    // InternalReactionRules.g:2642:1: rule__PatternVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__PatternVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2646:1: ( ( 'var' ) )
            // InternalReactionRules.g:2647:1: ( 'var' )
            {
            // InternalReactionRules.g:2647:1: ( 'var' )
            // InternalReactionRules.g:2648:2: 'var'
            {
             before(grammarAccess.getPatternVariableAccess().getVarKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPatternVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__Group__0__Impl"


    // $ANTLR start "rule__PatternVariable__Group__1"
    // InternalReactionRules.g:2657:1: rule__PatternVariable__Group__1 : rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 ;
    public final void rule__PatternVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2661:1: ( rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 )
            // InternalReactionRules.g:2662:2: rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__PatternVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__Group__1"


    // $ANTLR start "rule__PatternVariable__Group__1__Impl"
    // InternalReactionRules.g:2669:1: rule__PatternVariable__Group__1__Impl : ( ( rule__PatternVariable__NameAssignment_1 ) ) ;
    public final void rule__PatternVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2673:1: ( ( ( rule__PatternVariable__NameAssignment_1 ) ) )
            // InternalReactionRules.g:2674:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:2674:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            // InternalReactionRules.g:2675:2: ( rule__PatternVariable__NameAssignment_1 )
            {
             before(grammarAccess.getPatternVariableAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:2676:2: ( rule__PatternVariable__NameAssignment_1 )
            // InternalReactionRules.g:2676:3: rule__PatternVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__Group__1__Impl"


    // $ANTLR start "rule__PatternVariable__Group__2"
    // InternalReactionRules.g:2684:1: rule__PatternVariable__Group__2 : rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 ;
    public final void rule__PatternVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2688:1: ( rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 )
            // InternalReactionRules.g:2689:2: rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__PatternVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__Group__2"


    // $ANTLR start "rule__PatternVariable__Group__2__Impl"
    // InternalReactionRules.g:2696:1: rule__PatternVariable__Group__2__Impl : ( '=' ) ;
    public final void rule__PatternVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2700:1: ( ( '=' ) )
            // InternalReactionRules.g:2701:1: ( '=' )
            {
            // InternalReactionRules.g:2701:1: ( '=' )
            // InternalReactionRules.g:2702:2: '='
            {
             before(grammarAccess.getPatternVariableAccess().getEqualsSignKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPatternVariableAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__Group__2__Impl"


    // $ANTLR start "rule__PatternVariable__Group__3"
    // InternalReactionRules.g:2711:1: rule__PatternVariable__Group__3 : rule__PatternVariable__Group__3__Impl ;
    public final void rule__PatternVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2715:1: ( rule__PatternVariable__Group__3__Impl )
            // InternalReactionRules.g:2716:2: rule__PatternVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternVariable__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__Group__3"


    // $ANTLR start "rule__PatternVariable__Group__3__Impl"
    // InternalReactionRules.g:2722:1: rule__PatternVariable__Group__3__Impl : ( ( rule__PatternVariable__PatternAssignment_3 ) ) ;
    public final void rule__PatternVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2726:1: ( ( ( rule__PatternVariable__PatternAssignment_3 ) ) )
            // InternalReactionRules.g:2727:1: ( ( rule__PatternVariable__PatternAssignment_3 ) )
            {
            // InternalReactionRules.g:2727:1: ( ( rule__PatternVariable__PatternAssignment_3 ) )
            // InternalReactionRules.g:2728:2: ( rule__PatternVariable__PatternAssignment_3 )
            {
             before(grammarAccess.getPatternVariableAccess().getPatternAssignment_3()); 
            // InternalReactionRules.g:2729:2: ( rule__PatternVariable__PatternAssignment_3 )
            // InternalReactionRules.g:2729:3: rule__PatternVariable__PatternAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PatternVariable__PatternAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPatternVariableAccess().getPatternAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__Group__3__Impl"


    // $ANTLR start "rule__ArithmeticVariable__Group__0"
    // InternalReactionRules.g:2738:1: rule__ArithmeticVariable__Group__0 : rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1 ;
    public final void rule__ArithmeticVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2742:1: ( rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1 )
            // InternalReactionRules.g:2743:2: rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ArithmeticVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArithmeticVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticVariable__Group__0"


    // $ANTLR start "rule__ArithmeticVariable__Group__0__Impl"
    // InternalReactionRules.g:2750:1: rule__ArithmeticVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__ArithmeticVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2754:1: ( ( 'var' ) )
            // InternalReactionRules.g:2755:1: ( 'var' )
            {
            // InternalReactionRules.g:2755:1: ( 'var' )
            // InternalReactionRules.g:2756:2: 'var'
            {
             before(grammarAccess.getArithmeticVariableAccess().getVarKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getArithmeticVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticVariable__Group__0__Impl"


    // $ANTLR start "rule__ArithmeticVariable__Group__1"
    // InternalReactionRules.g:2765:1: rule__ArithmeticVariable__Group__1 : rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2 ;
    public final void rule__ArithmeticVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2769:1: ( rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2 )
            // InternalReactionRules.g:2770:2: rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ArithmeticVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArithmeticVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticVariable__Group__1"


    // $ANTLR start "rule__ArithmeticVariable__Group__1__Impl"
    // InternalReactionRules.g:2777:1: rule__ArithmeticVariable__Group__1__Impl : ( ( rule__ArithmeticVariable__NameAssignment_1 ) ) ;
    public final void rule__ArithmeticVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2781:1: ( ( ( rule__ArithmeticVariable__NameAssignment_1 ) ) )
            // InternalReactionRules.g:2782:1: ( ( rule__ArithmeticVariable__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:2782:1: ( ( rule__ArithmeticVariable__NameAssignment_1 ) )
            // InternalReactionRules.g:2783:2: ( rule__ArithmeticVariable__NameAssignment_1 )
            {
             before(grammarAccess.getArithmeticVariableAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:2784:2: ( rule__ArithmeticVariable__NameAssignment_1 )
            // InternalReactionRules.g:2784:3: rule__ArithmeticVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticVariable__Group__1__Impl"


    // $ANTLR start "rule__ArithmeticVariable__Group__2"
    // InternalReactionRules.g:2792:1: rule__ArithmeticVariable__Group__2 : rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3 ;
    public final void rule__ArithmeticVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2796:1: ( rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3 )
            // InternalReactionRules.g:2797:2: rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ArithmeticVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArithmeticVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticVariable__Group__2"


    // $ANTLR start "rule__ArithmeticVariable__Group__2__Impl"
    // InternalReactionRules.g:2804:1: rule__ArithmeticVariable__Group__2__Impl : ( '=' ) ;
    public final void rule__ArithmeticVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2808:1: ( ( '=' ) )
            // InternalReactionRules.g:2809:1: ( '=' )
            {
            // InternalReactionRules.g:2809:1: ( '=' )
            // InternalReactionRules.g:2810:2: '='
            {
             before(grammarAccess.getArithmeticVariableAccess().getEqualsSignKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getArithmeticVariableAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticVariable__Group__2__Impl"


    // $ANTLR start "rule__ArithmeticVariable__Group__3"
    // InternalReactionRules.g:2819:1: rule__ArithmeticVariable__Group__3 : rule__ArithmeticVariable__Group__3__Impl ;
    public final void rule__ArithmeticVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2823:1: ( rule__ArithmeticVariable__Group__3__Impl )
            // InternalReactionRules.g:2824:2: rule__ArithmeticVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticVariable__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticVariable__Group__3"


    // $ANTLR start "rule__ArithmeticVariable__Group__3__Impl"
    // InternalReactionRules.g:2830:1: rule__ArithmeticVariable__Group__3__Impl : ( ( rule__ArithmeticVariable__ValueAssignment_3 ) ) ;
    public final void rule__ArithmeticVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2834:1: ( ( ( rule__ArithmeticVariable__ValueAssignment_3 ) ) )
            // InternalReactionRules.g:2835:1: ( ( rule__ArithmeticVariable__ValueAssignment_3 ) )
            {
            // InternalReactionRules.g:2835:1: ( ( rule__ArithmeticVariable__ValueAssignment_3 ) )
            // InternalReactionRules.g:2836:2: ( rule__ArithmeticVariable__ValueAssignment_3 )
            {
             before(grammarAccess.getArithmeticVariableAccess().getValueAssignment_3()); 
            // InternalReactionRules.g:2837:2: ( rule__ArithmeticVariable__ValueAssignment_3 )
            // InternalReactionRules.g:2837:3: rule__ArithmeticVariable__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticVariable__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticVariableAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticVariable__Group__3__Impl"


    // $ANTLR start "rule__BoundAnyLink__Group__0"
    // InternalReactionRules.g:2846:1: rule__BoundAnyLink__Group__0 : rule__BoundAnyLink__Group__0__Impl rule__BoundAnyLink__Group__1 ;
    public final void rule__BoundAnyLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2850:1: ( rule__BoundAnyLink__Group__0__Impl rule__BoundAnyLink__Group__1 )
            // InternalReactionRules.g:2851:2: rule__BoundAnyLink__Group__0__Impl rule__BoundAnyLink__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__BoundAnyLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundAnyLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyLink__Group__0"


    // $ANTLR start "rule__BoundAnyLink__Group__0__Impl"
    // InternalReactionRules.g:2858:1: rule__BoundAnyLink__Group__0__Impl : ( () ) ;
    public final void rule__BoundAnyLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2862:1: ( ( () ) )
            // InternalReactionRules.g:2863:1: ( () )
            {
            // InternalReactionRules.g:2863:1: ( () )
            // InternalReactionRules.g:2864:2: ()
            {
             before(grammarAccess.getBoundAnyLinkAccess().getBoundAnyLinkAction_0()); 
            // InternalReactionRules.g:2865:2: ()
            // InternalReactionRules.g:2865:3: 
            {
            }

             after(grammarAccess.getBoundAnyLinkAccess().getBoundAnyLinkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyLink__Group__0__Impl"


    // $ANTLR start "rule__BoundAnyLink__Group__1"
    // InternalReactionRules.g:2873:1: rule__BoundAnyLink__Group__1 : rule__BoundAnyLink__Group__1__Impl ;
    public final void rule__BoundAnyLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2877:1: ( rule__BoundAnyLink__Group__1__Impl )
            // InternalReactionRules.g:2878:2: rule__BoundAnyLink__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundAnyLink__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyLink__Group__1"


    // $ANTLR start "rule__BoundAnyLink__Group__1__Impl"
    // InternalReactionRules.g:2884:1: rule__BoundAnyLink__Group__1__Impl : ( ( rule__BoundAnyLink__NameAssignment_1 ) ) ;
    public final void rule__BoundAnyLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2888:1: ( ( ( rule__BoundAnyLink__NameAssignment_1 ) ) )
            // InternalReactionRules.g:2889:1: ( ( rule__BoundAnyLink__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:2889:1: ( ( rule__BoundAnyLink__NameAssignment_1 ) )
            // InternalReactionRules.g:2890:2: ( rule__BoundAnyLink__NameAssignment_1 )
            {
             before(grammarAccess.getBoundAnyLinkAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:2891:2: ( rule__BoundAnyLink__NameAssignment_1 )
            // InternalReactionRules.g:2891:3: rule__BoundAnyLink__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundAnyLink__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundAnyLinkAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyLink__Group__1__Impl"


    // $ANTLR start "rule__FreeLink__Group__0"
    // InternalReactionRules.g:2900:1: rule__FreeLink__Group__0 : rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1 ;
    public final void rule__FreeLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2904:1: ( rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1 )
            // InternalReactionRules.g:2905:2: rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__FreeLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FreeLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeLink__Group__0"


    // $ANTLR start "rule__FreeLink__Group__0__Impl"
    // InternalReactionRules.g:2912:1: rule__FreeLink__Group__0__Impl : ( () ) ;
    public final void rule__FreeLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2916:1: ( ( () ) )
            // InternalReactionRules.g:2917:1: ( () )
            {
            // InternalReactionRules.g:2917:1: ( () )
            // InternalReactionRules.g:2918:2: ()
            {
             before(grammarAccess.getFreeLinkAccess().getFreeLinkAction_0()); 
            // InternalReactionRules.g:2919:2: ()
            // InternalReactionRules.g:2919:3: 
            {
            }

             after(grammarAccess.getFreeLinkAccess().getFreeLinkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeLink__Group__0__Impl"


    // $ANTLR start "rule__FreeLink__Group__1"
    // InternalReactionRules.g:2927:1: rule__FreeLink__Group__1 : rule__FreeLink__Group__1__Impl ;
    public final void rule__FreeLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2931:1: ( rule__FreeLink__Group__1__Impl )
            // InternalReactionRules.g:2932:2: rule__FreeLink__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FreeLink__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeLink__Group__1"


    // $ANTLR start "rule__FreeLink__Group__1__Impl"
    // InternalReactionRules.g:2938:1: rule__FreeLink__Group__1__Impl : ( ( rule__FreeLink__NameAssignment_1 ) ) ;
    public final void rule__FreeLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2942:1: ( ( ( rule__FreeLink__NameAssignment_1 ) ) )
            // InternalReactionRules.g:2943:1: ( ( rule__FreeLink__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:2943:1: ( ( rule__FreeLink__NameAssignment_1 ) )
            // InternalReactionRules.g:2944:2: ( rule__FreeLink__NameAssignment_1 )
            {
             before(grammarAccess.getFreeLinkAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:2945:2: ( rule__FreeLink__NameAssignment_1 )
            // InternalReactionRules.g:2945:3: rule__FreeLink__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FreeLink__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFreeLinkAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeLink__Group__1__Impl"


    // $ANTLR start "rule__WhatEver__Group__0"
    // InternalReactionRules.g:2954:1: rule__WhatEver__Group__0 : rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1 ;
    public final void rule__WhatEver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2958:1: ( rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1 )
            // InternalReactionRules.g:2959:2: rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__WhatEver__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhatEver__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatEver__Group__0"


    // $ANTLR start "rule__WhatEver__Group__0__Impl"
    // InternalReactionRules.g:2966:1: rule__WhatEver__Group__0__Impl : ( () ) ;
    public final void rule__WhatEver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2970:1: ( ( () ) )
            // InternalReactionRules.g:2971:1: ( () )
            {
            // InternalReactionRules.g:2971:1: ( () )
            // InternalReactionRules.g:2972:2: ()
            {
             before(grammarAccess.getWhatEverAccess().getWhatEverAction_0()); 
            // InternalReactionRules.g:2973:2: ()
            // InternalReactionRules.g:2973:3: 
            {
            }

             after(grammarAccess.getWhatEverAccess().getWhatEverAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatEver__Group__0__Impl"


    // $ANTLR start "rule__WhatEver__Group__1"
    // InternalReactionRules.g:2981:1: rule__WhatEver__Group__1 : rule__WhatEver__Group__1__Impl ;
    public final void rule__WhatEver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2985:1: ( rule__WhatEver__Group__1__Impl )
            // InternalReactionRules.g:2986:2: rule__WhatEver__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhatEver__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatEver__Group__1"


    // $ANTLR start "rule__WhatEver__Group__1__Impl"
    // InternalReactionRules.g:2992:1: rule__WhatEver__Group__1__Impl : ( ( rule__WhatEver__NameAssignment_1 ) ) ;
    public final void rule__WhatEver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2996:1: ( ( ( rule__WhatEver__NameAssignment_1 ) ) )
            // InternalReactionRules.g:2997:1: ( ( rule__WhatEver__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:2997:1: ( ( rule__WhatEver__NameAssignment_1 ) )
            // InternalReactionRules.g:2998:2: ( rule__WhatEver__NameAssignment_1 )
            {
             before(grammarAccess.getWhatEverAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:2999:2: ( rule__WhatEver__NameAssignment_1 )
            // InternalReactionRules.g:2999:3: rule__WhatEver__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WhatEver__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhatEverAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatEver__Group__1__Impl"


    // $ANTLR start "rule__BoundLink__Group__0"
    // InternalReactionRules.g:3008:1: rule__BoundLink__Group__0 : rule__BoundLink__Group__0__Impl rule__BoundLink__Group__1 ;
    public final void rule__BoundLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3012:1: ( rule__BoundLink__Group__0__Impl rule__BoundLink__Group__1 )
            // InternalReactionRules.g:3013:2: rule__BoundLink__Group__0__Impl rule__BoundLink__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__BoundLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundLink__Group__0"


    // $ANTLR start "rule__BoundLink__Group__0__Impl"
    // InternalReactionRules.g:3020:1: rule__BoundLink__Group__0__Impl : ( () ) ;
    public final void rule__BoundLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3024:1: ( ( () ) )
            // InternalReactionRules.g:3025:1: ( () )
            {
            // InternalReactionRules.g:3025:1: ( () )
            // InternalReactionRules.g:3026:2: ()
            {
             before(grammarAccess.getBoundLinkAccess().getBoundLinkAction_0()); 
            // InternalReactionRules.g:3027:2: ()
            // InternalReactionRules.g:3027:3: 
            {
            }

             after(grammarAccess.getBoundLinkAccess().getBoundLinkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundLink__Group__0__Impl"


    // $ANTLR start "rule__BoundLink__Group__1"
    // InternalReactionRules.g:3035:1: rule__BoundLink__Group__1 : rule__BoundLink__Group__1__Impl ;
    public final void rule__BoundLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3039:1: ( rule__BoundLink__Group__1__Impl )
            // InternalReactionRules.g:3040:2: rule__BoundLink__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundLink__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundLink__Group__1"


    // $ANTLR start "rule__BoundLink__Group__1__Impl"
    // InternalReactionRules.g:3046:1: rule__BoundLink__Group__1__Impl : ( ( rule__BoundLink__StateAssignment_1 ) ) ;
    public final void rule__BoundLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3050:1: ( ( ( rule__BoundLink__StateAssignment_1 ) ) )
            // InternalReactionRules.g:3051:1: ( ( rule__BoundLink__StateAssignment_1 ) )
            {
            // InternalReactionRules.g:3051:1: ( ( rule__BoundLink__StateAssignment_1 ) )
            // InternalReactionRules.g:3052:2: ( rule__BoundLink__StateAssignment_1 )
            {
             before(grammarAccess.getBoundLinkAccess().getStateAssignment_1()); 
            // InternalReactionRules.g:3053:2: ( rule__BoundLink__StateAssignment_1 )
            // InternalReactionRules.g:3053:3: rule__BoundLink__StateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundLink__StateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundLinkAccess().getStateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundLink__Group__1__Impl"


    // $ANTLR start "rule__BoundAnyOfTypeLinkAgent__Group__0"
    // InternalReactionRules.g:3062:1: rule__BoundAnyOfTypeLinkAgent__Group__0 : rule__BoundAnyOfTypeLinkAgent__Group__0__Impl rule__BoundAnyOfTypeLinkAgent__Group__1 ;
    public final void rule__BoundAnyOfTypeLinkAgent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3066:1: ( rule__BoundAnyOfTypeLinkAgent__Group__0__Impl rule__BoundAnyOfTypeLinkAgent__Group__1 )
            // InternalReactionRules.g:3067:2: rule__BoundAnyOfTypeLinkAgent__Group__0__Impl rule__BoundAnyOfTypeLinkAgent__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__BoundAnyOfTypeLinkAgent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundAnyOfTypeLinkAgent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLinkAgent__Group__0"


    // $ANTLR start "rule__BoundAnyOfTypeLinkAgent__Group__0__Impl"
    // InternalReactionRules.g:3074:1: rule__BoundAnyOfTypeLinkAgent__Group__0__Impl : ( () ) ;
    public final void rule__BoundAnyOfTypeLinkAgent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3078:1: ( ( () ) )
            // InternalReactionRules.g:3079:1: ( () )
            {
            // InternalReactionRules.g:3079:1: ( () )
            // InternalReactionRules.g:3080:2: ()
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getBoundAnyOfTypeLinkAgentAction_0()); 
            // InternalReactionRules.g:3081:2: ()
            // InternalReactionRules.g:3081:3: 
            {
            }

             after(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getBoundAnyOfTypeLinkAgentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLinkAgent__Group__0__Impl"


    // $ANTLR start "rule__BoundAnyOfTypeLinkAgent__Group__1"
    // InternalReactionRules.g:3089:1: rule__BoundAnyOfTypeLinkAgent__Group__1 : rule__BoundAnyOfTypeLinkAgent__Group__1__Impl ;
    public final void rule__BoundAnyOfTypeLinkAgent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3093:1: ( rule__BoundAnyOfTypeLinkAgent__Group__1__Impl )
            // InternalReactionRules.g:3094:2: rule__BoundAnyOfTypeLinkAgent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundAnyOfTypeLinkAgent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLinkAgent__Group__1"


    // $ANTLR start "rule__BoundAnyOfTypeLinkAgent__Group__1__Impl"
    // InternalReactionRules.g:3100:1: rule__BoundAnyOfTypeLinkAgent__Group__1__Impl : ( ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 ) ) ;
    public final void rule__BoundAnyOfTypeLinkAgent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3104:1: ( ( ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 ) ) )
            // InternalReactionRules.g:3105:1: ( ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 ) )
            {
            // InternalReactionRules.g:3105:1: ( ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 ) )
            // InternalReactionRules.g:3106:2: ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getAgentAssignment_1()); 
            // InternalReactionRules.g:3107:2: ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 )
            // InternalReactionRules.g:3107:3: rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getAgentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLinkAgent__Group__1__Impl"


    // $ANTLR start "rule__BoundAnyOfTypeLinkSite__Group__0"
    // InternalReactionRules.g:3116:1: rule__BoundAnyOfTypeLinkSite__Group__0 : rule__BoundAnyOfTypeLinkSite__Group__0__Impl rule__BoundAnyOfTypeLinkSite__Group__1 ;
    public final void rule__BoundAnyOfTypeLinkSite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3120:1: ( rule__BoundAnyOfTypeLinkSite__Group__0__Impl rule__BoundAnyOfTypeLinkSite__Group__1 )
            // InternalReactionRules.g:3121:2: rule__BoundAnyOfTypeLinkSite__Group__0__Impl rule__BoundAnyOfTypeLinkSite__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__BoundAnyOfTypeLinkSite__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundAnyOfTypeLinkSite__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLinkSite__Group__0"


    // $ANTLR start "rule__BoundAnyOfTypeLinkSite__Group__0__Impl"
    // InternalReactionRules.g:3128:1: rule__BoundAnyOfTypeLinkSite__Group__0__Impl : ( () ) ;
    public final void rule__BoundAnyOfTypeLinkSite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3132:1: ( ( () ) )
            // InternalReactionRules.g:3133:1: ( () )
            {
            // InternalReactionRules.g:3133:1: ( () )
            // InternalReactionRules.g:3134:2: ()
            {
             before(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getBoundAnyOfTypeLinkSiteAction_0()); 
            // InternalReactionRules.g:3135:2: ()
            // InternalReactionRules.g:3135:3: 
            {
            }

             after(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getBoundAnyOfTypeLinkSiteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLinkSite__Group__0__Impl"


    // $ANTLR start "rule__BoundAnyOfTypeLinkSite__Group__1"
    // InternalReactionRules.g:3143:1: rule__BoundAnyOfTypeLinkSite__Group__1 : rule__BoundAnyOfTypeLinkSite__Group__1__Impl ;
    public final void rule__BoundAnyOfTypeLinkSite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3147:1: ( rule__BoundAnyOfTypeLinkSite__Group__1__Impl )
            // InternalReactionRules.g:3148:2: rule__BoundAnyOfTypeLinkSite__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundAnyOfTypeLinkSite__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLinkSite__Group__1"


    // $ANTLR start "rule__BoundAnyOfTypeLinkSite__Group__1__Impl"
    // InternalReactionRules.g:3154:1: rule__BoundAnyOfTypeLinkSite__Group__1__Impl : ( ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 ) ) ;
    public final void rule__BoundAnyOfTypeLinkSite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3158:1: ( ( ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 ) ) )
            // InternalReactionRules.g:3159:1: ( ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 ) )
            {
            // InternalReactionRules.g:3159:1: ( ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 ) )
            // InternalReactionRules.g:3160:2: ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getSiteAssignment_1()); 
            // InternalReactionRules.g:3161:2: ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 )
            // InternalReactionRules.g:3161:3: rule__BoundAnyOfTypeLinkSite__SiteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundAnyOfTypeLinkSite__SiteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getSiteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLinkSite__Group__1__Impl"


    // $ANTLR start "rule__BoundAnyOfTypeLink__Group__0"
    // InternalReactionRules.g:3170:1: rule__BoundAnyOfTypeLink__Group__0 : rule__BoundAnyOfTypeLink__Group__0__Impl rule__BoundAnyOfTypeLink__Group__1 ;
    public final void rule__BoundAnyOfTypeLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3174:1: ( rule__BoundAnyOfTypeLink__Group__0__Impl rule__BoundAnyOfTypeLink__Group__1 )
            // InternalReactionRules.g:3175:2: rule__BoundAnyOfTypeLink__Group__0__Impl rule__BoundAnyOfTypeLink__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__BoundAnyOfTypeLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundAnyOfTypeLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLink__Group__0"


    // $ANTLR start "rule__BoundAnyOfTypeLink__Group__0__Impl"
    // InternalReactionRules.g:3182:1: rule__BoundAnyOfTypeLink__Group__0__Impl : ( () ) ;
    public final void rule__BoundAnyOfTypeLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3186:1: ( ( () ) )
            // InternalReactionRules.g:3187:1: ( () )
            {
            // InternalReactionRules.g:3187:1: ( () )
            // InternalReactionRules.g:3188:2: ()
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAccess().getBoundAnyOfTypeLinkAction_0()); 
            // InternalReactionRules.g:3189:2: ()
            // InternalReactionRules.g:3189:3: 
            {
            }

             after(grammarAccess.getBoundAnyOfTypeLinkAccess().getBoundAnyOfTypeLinkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLink__Group__0__Impl"


    // $ANTLR start "rule__BoundAnyOfTypeLink__Group__1"
    // InternalReactionRules.g:3197:1: rule__BoundAnyOfTypeLink__Group__1 : rule__BoundAnyOfTypeLink__Group__1__Impl rule__BoundAnyOfTypeLink__Group__2 ;
    public final void rule__BoundAnyOfTypeLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3201:1: ( rule__BoundAnyOfTypeLink__Group__1__Impl rule__BoundAnyOfTypeLink__Group__2 )
            // InternalReactionRules.g:3202:2: rule__BoundAnyOfTypeLink__Group__1__Impl rule__BoundAnyOfTypeLink__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__BoundAnyOfTypeLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundAnyOfTypeLink__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLink__Group__1"


    // $ANTLR start "rule__BoundAnyOfTypeLink__Group__1__Impl"
    // InternalReactionRules.g:3209:1: rule__BoundAnyOfTypeLink__Group__1__Impl : ( ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 ) ) ;
    public final void rule__BoundAnyOfTypeLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3213:1: ( ( ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 ) ) )
            // InternalReactionRules.g:3214:1: ( ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 ) )
            {
            // InternalReactionRules.g:3214:1: ( ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 ) )
            // InternalReactionRules.g:3215:2: ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAccess().getLinkAgentAssignment_1()); 
            // InternalReactionRules.g:3216:2: ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 )
            // InternalReactionRules.g:3216:3: rule__BoundAnyOfTypeLink__LinkAgentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundAnyOfTypeLink__LinkAgentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundAnyOfTypeLinkAccess().getLinkAgentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLink__Group__1__Impl"


    // $ANTLR start "rule__BoundAnyOfTypeLink__Group__2"
    // InternalReactionRules.g:3224:1: rule__BoundAnyOfTypeLink__Group__2 : rule__BoundAnyOfTypeLink__Group__2__Impl rule__BoundAnyOfTypeLink__Group__3 ;
    public final void rule__BoundAnyOfTypeLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3228:1: ( rule__BoundAnyOfTypeLink__Group__2__Impl rule__BoundAnyOfTypeLink__Group__3 )
            // InternalReactionRules.g:3229:2: rule__BoundAnyOfTypeLink__Group__2__Impl rule__BoundAnyOfTypeLink__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__BoundAnyOfTypeLink__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundAnyOfTypeLink__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLink__Group__2"


    // $ANTLR start "rule__BoundAnyOfTypeLink__Group__2__Impl"
    // InternalReactionRules.g:3236:1: rule__BoundAnyOfTypeLink__Group__2__Impl : ( '.' ) ;
    public final void rule__BoundAnyOfTypeLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3240:1: ( ( '.' ) )
            // InternalReactionRules.g:3241:1: ( '.' )
            {
            // InternalReactionRules.g:3241:1: ( '.' )
            // InternalReactionRules.g:3242:2: '.'
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAccess().getFullStopKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBoundAnyOfTypeLinkAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLink__Group__2__Impl"


    // $ANTLR start "rule__BoundAnyOfTypeLink__Group__3"
    // InternalReactionRules.g:3251:1: rule__BoundAnyOfTypeLink__Group__3 : rule__BoundAnyOfTypeLink__Group__3__Impl ;
    public final void rule__BoundAnyOfTypeLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3255:1: ( rule__BoundAnyOfTypeLink__Group__3__Impl )
            // InternalReactionRules.g:3256:2: rule__BoundAnyOfTypeLink__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundAnyOfTypeLink__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLink__Group__3"


    // $ANTLR start "rule__BoundAnyOfTypeLink__Group__3__Impl"
    // InternalReactionRules.g:3262:1: rule__BoundAnyOfTypeLink__Group__3__Impl : ( ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 ) ) ;
    public final void rule__BoundAnyOfTypeLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3266:1: ( ( ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 ) ) )
            // InternalReactionRules.g:3267:1: ( ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 ) )
            {
            // InternalReactionRules.g:3267:1: ( ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 ) )
            // InternalReactionRules.g:3268:2: ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAccess().getLinkSiteAssignment_3()); 
            // InternalReactionRules.g:3269:2: ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 )
            // InternalReactionRules.g:3269:3: rule__BoundAnyOfTypeLink__LinkSiteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BoundAnyOfTypeLink__LinkSiteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBoundAnyOfTypeLinkAccess().getLinkSiteAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLink__Group__3__Impl"


    // $ANTLR start "rule__SiteState__Group__0"
    // InternalReactionRules.g:3278:1: rule__SiteState__Group__0 : rule__SiteState__Group__0__Impl rule__SiteState__Group__1 ;
    public final void rule__SiteState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3282:1: ( rule__SiteState__Group__0__Impl rule__SiteState__Group__1 )
            // InternalReactionRules.g:3283:2: rule__SiteState__Group__0__Impl rule__SiteState__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__SiteState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiteState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteState__Group__0"


    // $ANTLR start "rule__SiteState__Group__0__Impl"
    // InternalReactionRules.g:3290:1: rule__SiteState__Group__0__Impl : ( () ) ;
    public final void rule__SiteState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3294:1: ( ( () ) )
            // InternalReactionRules.g:3295:1: ( () )
            {
            // InternalReactionRules.g:3295:1: ( () )
            // InternalReactionRules.g:3296:2: ()
            {
             before(grammarAccess.getSiteStateAccess().getSiteStateAction_0()); 
            // InternalReactionRules.g:3297:2: ()
            // InternalReactionRules.g:3297:3: 
            {
            }

             after(grammarAccess.getSiteStateAccess().getSiteStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteState__Group__0__Impl"


    // $ANTLR start "rule__SiteState__Group__1"
    // InternalReactionRules.g:3305:1: rule__SiteState__Group__1 : rule__SiteState__Group__1__Impl rule__SiteState__Group__2 ;
    public final void rule__SiteState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3309:1: ( rule__SiteState__Group__1__Impl rule__SiteState__Group__2 )
            // InternalReactionRules.g:3310:2: rule__SiteState__Group__1__Impl rule__SiteState__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SiteState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiteState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteState__Group__1"


    // $ANTLR start "rule__SiteState__Group__1__Impl"
    // InternalReactionRules.g:3317:1: rule__SiteState__Group__1__Impl : ( '{' ) ;
    public final void rule__SiteState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3321:1: ( ( '{' ) )
            // InternalReactionRules.g:3322:1: ( '{' )
            {
            // InternalReactionRules.g:3322:1: ( '{' )
            // InternalReactionRules.g:3323:2: '{'
            {
             before(grammarAccess.getSiteStateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSiteStateAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteState__Group__1__Impl"


    // $ANTLR start "rule__SiteState__Group__2"
    // InternalReactionRules.g:3332:1: rule__SiteState__Group__2 : rule__SiteState__Group__2__Impl rule__SiteState__Group__3 ;
    public final void rule__SiteState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3336:1: ( rule__SiteState__Group__2__Impl rule__SiteState__Group__3 )
            // InternalReactionRules.g:3337:2: rule__SiteState__Group__2__Impl rule__SiteState__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__SiteState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiteState__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteState__Group__2"


    // $ANTLR start "rule__SiteState__Group__2__Impl"
    // InternalReactionRules.g:3344:1: rule__SiteState__Group__2__Impl : ( ( rule__SiteState__StateAssignment_2 ) ) ;
    public final void rule__SiteState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3348:1: ( ( ( rule__SiteState__StateAssignment_2 ) ) )
            // InternalReactionRules.g:3349:1: ( ( rule__SiteState__StateAssignment_2 ) )
            {
            // InternalReactionRules.g:3349:1: ( ( rule__SiteState__StateAssignment_2 ) )
            // InternalReactionRules.g:3350:2: ( rule__SiteState__StateAssignment_2 )
            {
             before(grammarAccess.getSiteStateAccess().getStateAssignment_2()); 
            // InternalReactionRules.g:3351:2: ( rule__SiteState__StateAssignment_2 )
            // InternalReactionRules.g:3351:3: rule__SiteState__StateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SiteState__StateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSiteStateAccess().getStateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteState__Group__2__Impl"


    // $ANTLR start "rule__SiteState__Group__3"
    // InternalReactionRules.g:3359:1: rule__SiteState__Group__3 : rule__SiteState__Group__3__Impl ;
    public final void rule__SiteState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3363:1: ( rule__SiteState__Group__3__Impl )
            // InternalReactionRules.g:3364:2: rule__SiteState__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SiteState__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteState__Group__3"


    // $ANTLR start "rule__SiteState__Group__3__Impl"
    // InternalReactionRules.g:3370:1: rule__SiteState__Group__3__Impl : ( '}' ) ;
    public final void rule__SiteState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3374:1: ( ( '}' ) )
            // InternalReactionRules.g:3375:1: ( '}' )
            {
            // InternalReactionRules.g:3375:1: ( '}' )
            // InternalReactionRules.g:3376:2: '}'
            {
             before(grammarAccess.getSiteStateAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSiteStateAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteState__Group__3__Impl"


    // $ANTLR start "rule__LinkState__Group__0"
    // InternalReactionRules.g:3386:1: rule__LinkState__Group__0 : rule__LinkState__Group__0__Impl rule__LinkState__Group__1 ;
    public final void rule__LinkState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3390:1: ( rule__LinkState__Group__0__Impl rule__LinkState__Group__1 )
            // InternalReactionRules.g:3391:2: rule__LinkState__Group__0__Impl rule__LinkState__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__LinkState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkState__Group__0"


    // $ANTLR start "rule__LinkState__Group__0__Impl"
    // InternalReactionRules.g:3398:1: rule__LinkState__Group__0__Impl : ( () ) ;
    public final void rule__LinkState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3402:1: ( ( () ) )
            // InternalReactionRules.g:3403:1: ( () )
            {
            // InternalReactionRules.g:3403:1: ( () )
            // InternalReactionRules.g:3404:2: ()
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAction_0()); 
            // InternalReactionRules.g:3405:2: ()
            // InternalReactionRules.g:3405:3: 
            {
            }

             after(grammarAccess.getLinkStateAccess().getLinkStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkState__Group__0__Impl"


    // $ANTLR start "rule__LinkState__Group__1"
    // InternalReactionRules.g:3413:1: rule__LinkState__Group__1 : rule__LinkState__Group__1__Impl rule__LinkState__Group__2 ;
    public final void rule__LinkState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3417:1: ( rule__LinkState__Group__1__Impl rule__LinkState__Group__2 )
            // InternalReactionRules.g:3418:2: rule__LinkState__Group__1__Impl rule__LinkState__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__LinkState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkState__Group__1"


    // $ANTLR start "rule__LinkState__Group__1__Impl"
    // InternalReactionRules.g:3425:1: rule__LinkState__Group__1__Impl : ( '[' ) ;
    public final void rule__LinkState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3429:1: ( ( '[' ) )
            // InternalReactionRules.g:3430:1: ( '[' )
            {
            // InternalReactionRules.g:3430:1: ( '[' )
            // InternalReactionRules.g:3431:2: '['
            {
             before(grammarAccess.getLinkStateAccess().getLeftSquareBracketKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLinkStateAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkState__Group__1__Impl"


    // $ANTLR start "rule__LinkState__Group__2"
    // InternalReactionRules.g:3440:1: rule__LinkState__Group__2 : rule__LinkState__Group__2__Impl rule__LinkState__Group__3 ;
    public final void rule__LinkState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3444:1: ( rule__LinkState__Group__2__Impl rule__LinkState__Group__3 )
            // InternalReactionRules.g:3445:2: rule__LinkState__Group__2__Impl rule__LinkState__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__LinkState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkState__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkState__Group__2"


    // $ANTLR start "rule__LinkState__Group__2__Impl"
    // InternalReactionRules.g:3452:1: rule__LinkState__Group__2__Impl : ( ( rule__LinkState__LinkStateAssignment_2 ) ) ;
    public final void rule__LinkState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3456:1: ( ( ( rule__LinkState__LinkStateAssignment_2 ) ) )
            // InternalReactionRules.g:3457:1: ( ( rule__LinkState__LinkStateAssignment_2 ) )
            {
            // InternalReactionRules.g:3457:1: ( ( rule__LinkState__LinkStateAssignment_2 ) )
            // InternalReactionRules.g:3458:2: ( rule__LinkState__LinkStateAssignment_2 )
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAssignment_2()); 
            // InternalReactionRules.g:3459:2: ( rule__LinkState__LinkStateAssignment_2 )
            // InternalReactionRules.g:3459:3: rule__LinkState__LinkStateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LinkState__LinkStateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkStateAccess().getLinkStateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkState__Group__2__Impl"


    // $ANTLR start "rule__LinkState__Group__3"
    // InternalReactionRules.g:3467:1: rule__LinkState__Group__3 : rule__LinkState__Group__3__Impl ;
    public final void rule__LinkState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3471:1: ( rule__LinkState__Group__3__Impl )
            // InternalReactionRules.g:3472:2: rule__LinkState__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkState__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkState__Group__3"


    // $ANTLR start "rule__LinkState__Group__3__Impl"
    // InternalReactionRules.g:3478:1: rule__LinkState__Group__3__Impl : ( ']' ) ;
    public final void rule__LinkState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3482:1: ( ( ']' ) )
            // InternalReactionRules.g:3483:1: ( ']' )
            {
            // InternalReactionRules.g:3483:1: ( ']' )
            // InternalReactionRules.g:3484:2: ']'
            {
             before(grammarAccess.getLinkStateAccess().getRightSquareBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLinkStateAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkState__Group__3__Impl"


    // $ANTLR start "rule__SitePattern__Group__0"
    // InternalReactionRules.g:3494:1: rule__SitePattern__Group__0 : rule__SitePattern__Group__0__Impl rule__SitePattern__Group__1 ;
    public final void rule__SitePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3498:1: ( rule__SitePattern__Group__0__Impl rule__SitePattern__Group__1 )
            // InternalReactionRules.g:3499:2: rule__SitePattern__Group__0__Impl rule__SitePattern__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SitePattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SitePattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group__0"


    // $ANTLR start "rule__SitePattern__Group__0__Impl"
    // InternalReactionRules.g:3506:1: rule__SitePattern__Group__0__Impl : ( () ) ;
    public final void rule__SitePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3510:1: ( ( () ) )
            // InternalReactionRules.g:3511:1: ( () )
            {
            // InternalReactionRules.g:3511:1: ( () )
            // InternalReactionRules.g:3512:2: ()
            {
             before(grammarAccess.getSitePatternAccess().getSitePatternAction_0()); 
            // InternalReactionRules.g:3513:2: ()
            // InternalReactionRules.g:3513:3: 
            {
            }

             after(grammarAccess.getSitePatternAccess().getSitePatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group__0__Impl"


    // $ANTLR start "rule__SitePattern__Group__1"
    // InternalReactionRules.g:3521:1: rule__SitePattern__Group__1 : rule__SitePattern__Group__1__Impl rule__SitePattern__Group__2 ;
    public final void rule__SitePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3525:1: ( rule__SitePattern__Group__1__Impl rule__SitePattern__Group__2 )
            // InternalReactionRules.g:3526:2: rule__SitePattern__Group__1__Impl rule__SitePattern__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__SitePattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SitePattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group__1"


    // $ANTLR start "rule__SitePattern__Group__1__Impl"
    // InternalReactionRules.g:3533:1: rule__SitePattern__Group__1__Impl : ( ( rule__SitePattern__SiteAssignment_1 ) ) ;
    public final void rule__SitePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3537:1: ( ( ( rule__SitePattern__SiteAssignment_1 ) ) )
            // InternalReactionRules.g:3538:1: ( ( rule__SitePattern__SiteAssignment_1 ) )
            {
            // InternalReactionRules.g:3538:1: ( ( rule__SitePattern__SiteAssignment_1 ) )
            // InternalReactionRules.g:3539:2: ( rule__SitePattern__SiteAssignment_1 )
            {
             before(grammarAccess.getSitePatternAccess().getSiteAssignment_1()); 
            // InternalReactionRules.g:3540:2: ( rule__SitePattern__SiteAssignment_1 )
            // InternalReactionRules.g:3540:3: rule__SitePattern__SiteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SitePattern__SiteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSitePatternAccess().getSiteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group__1__Impl"


    // $ANTLR start "rule__SitePattern__Group__2"
    // InternalReactionRules.g:3548:1: rule__SitePattern__Group__2 : rule__SitePattern__Group__2__Impl rule__SitePattern__Group__3 ;
    public final void rule__SitePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3552:1: ( rule__SitePattern__Group__2__Impl rule__SitePattern__Group__3 )
            // InternalReactionRules.g:3553:2: rule__SitePattern__Group__2__Impl rule__SitePattern__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__SitePattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SitePattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group__2"


    // $ANTLR start "rule__SitePattern__Group__2__Impl"
    // InternalReactionRules.g:3560:1: rule__SitePattern__Group__2__Impl : ( ( rule__SitePattern__StateAssignment_2 )? ) ;
    public final void rule__SitePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3564:1: ( ( ( rule__SitePattern__StateAssignment_2 )? ) )
            // InternalReactionRules.g:3565:1: ( ( rule__SitePattern__StateAssignment_2 )? )
            {
            // InternalReactionRules.g:3565:1: ( ( rule__SitePattern__StateAssignment_2 )? )
            // InternalReactionRules.g:3566:2: ( rule__SitePattern__StateAssignment_2 )?
            {
             before(grammarAccess.getSitePatternAccess().getStateAssignment_2()); 
            // InternalReactionRules.g:3567:2: ( rule__SitePattern__StateAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalReactionRules.g:3567:3: rule__SitePattern__StateAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SitePattern__StateAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSitePatternAccess().getStateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group__2__Impl"


    // $ANTLR start "rule__SitePattern__Group__3"
    // InternalReactionRules.g:3575:1: rule__SitePattern__Group__3 : rule__SitePattern__Group__3__Impl ;
    public final void rule__SitePattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3579:1: ( rule__SitePattern__Group__3__Impl )
            // InternalReactionRules.g:3580:2: rule__SitePattern__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SitePattern__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group__3"


    // $ANTLR start "rule__SitePattern__Group__3__Impl"
    // InternalReactionRules.g:3586:1: rule__SitePattern__Group__3__Impl : ( ( rule__SitePattern__LinkStateAssignment_3 ) ) ;
    public final void rule__SitePattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3590:1: ( ( ( rule__SitePattern__LinkStateAssignment_3 ) ) )
            // InternalReactionRules.g:3591:1: ( ( rule__SitePattern__LinkStateAssignment_3 ) )
            {
            // InternalReactionRules.g:3591:1: ( ( rule__SitePattern__LinkStateAssignment_3 ) )
            // InternalReactionRules.g:3592:2: ( rule__SitePattern__LinkStateAssignment_3 )
            {
             before(grammarAccess.getSitePatternAccess().getLinkStateAssignment_3()); 
            // InternalReactionRules.g:3593:2: ( rule__SitePattern__LinkStateAssignment_3 )
            // InternalReactionRules.g:3593:3: rule__SitePattern__LinkStateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SitePattern__LinkStateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSitePatternAccess().getLinkStateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group__3__Impl"


    // $ANTLR start "rule__SitePatterns__Group__0"
    // InternalReactionRules.g:3602:1: rule__SitePatterns__Group__0 : rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1 ;
    public final void rule__SitePatterns__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3606:1: ( rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1 )
            // InternalReactionRules.g:3607:2: rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__SitePatterns__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SitePatterns__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group__0"


    // $ANTLR start "rule__SitePatterns__Group__0__Impl"
    // InternalReactionRules.g:3614:1: rule__SitePatterns__Group__0__Impl : ( () ) ;
    public final void rule__SitePatterns__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3618:1: ( ( () ) )
            // InternalReactionRules.g:3619:1: ( () )
            {
            // InternalReactionRules.g:3619:1: ( () )
            // InternalReactionRules.g:3620:2: ()
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAction_0()); 
            // InternalReactionRules.g:3621:2: ()
            // InternalReactionRules.g:3621:3: 
            {
            }

             after(grammarAccess.getSitePatternsAccess().getSitePatternsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group__0__Impl"


    // $ANTLR start "rule__SitePatterns__Group__1"
    // InternalReactionRules.g:3629:1: rule__SitePatterns__Group__1 : rule__SitePatterns__Group__1__Impl rule__SitePatterns__Group__2 ;
    public final void rule__SitePatterns__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3633:1: ( rule__SitePatterns__Group__1__Impl rule__SitePatterns__Group__2 )
            // InternalReactionRules.g:3634:2: rule__SitePatterns__Group__1__Impl rule__SitePatterns__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__SitePatterns__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SitePatterns__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group__1"


    // $ANTLR start "rule__SitePatterns__Group__1__Impl"
    // InternalReactionRules.g:3641:1: rule__SitePatterns__Group__1__Impl : ( '(' ) ;
    public final void rule__SitePatterns__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3645:1: ( ( '(' ) )
            // InternalReactionRules.g:3646:1: ( '(' )
            {
            // InternalReactionRules.g:3646:1: ( '(' )
            // InternalReactionRules.g:3647:2: '('
            {
             before(grammarAccess.getSitePatternsAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSitePatternsAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group__1__Impl"


    // $ANTLR start "rule__SitePatterns__Group__2"
    // InternalReactionRules.g:3656:1: rule__SitePatterns__Group__2 : rule__SitePatterns__Group__2__Impl rule__SitePatterns__Group__3 ;
    public final void rule__SitePatterns__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3660:1: ( rule__SitePatterns__Group__2__Impl rule__SitePatterns__Group__3 )
            // InternalReactionRules.g:3661:2: rule__SitePatterns__Group__2__Impl rule__SitePatterns__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__SitePatterns__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SitePatterns__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group__2"


    // $ANTLR start "rule__SitePatterns__Group__2__Impl"
    // InternalReactionRules.g:3668:1: rule__SitePatterns__Group__2__Impl : ( ( rule__SitePatterns__Group_2__0 )? ) ;
    public final void rule__SitePatterns__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3672:1: ( ( ( rule__SitePatterns__Group_2__0 )? ) )
            // InternalReactionRules.g:3673:1: ( ( rule__SitePatterns__Group_2__0 )? )
            {
            // InternalReactionRules.g:3673:1: ( ( rule__SitePatterns__Group_2__0 )? )
            // InternalReactionRules.g:3674:2: ( rule__SitePatterns__Group_2__0 )?
            {
             before(grammarAccess.getSitePatternsAccess().getGroup_2()); 
            // InternalReactionRules.g:3675:2: ( rule__SitePatterns__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalReactionRules.g:3675:3: rule__SitePatterns__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SitePatterns__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSitePatternsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group__2__Impl"


    // $ANTLR start "rule__SitePatterns__Group__3"
    // InternalReactionRules.g:3683:1: rule__SitePatterns__Group__3 : rule__SitePatterns__Group__3__Impl ;
    public final void rule__SitePatterns__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3687:1: ( rule__SitePatterns__Group__3__Impl )
            // InternalReactionRules.g:3688:2: rule__SitePatterns__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SitePatterns__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group__3"


    // $ANTLR start "rule__SitePatterns__Group__3__Impl"
    // InternalReactionRules.g:3694:1: rule__SitePatterns__Group__3__Impl : ( ')' ) ;
    public final void rule__SitePatterns__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3698:1: ( ( ')' ) )
            // InternalReactionRules.g:3699:1: ( ')' )
            {
            // InternalReactionRules.g:3699:1: ( ')' )
            // InternalReactionRules.g:3700:2: ')'
            {
             before(grammarAccess.getSitePatternsAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSitePatternsAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group__3__Impl"


    // $ANTLR start "rule__SitePatterns__Group_2__0"
    // InternalReactionRules.g:3710:1: rule__SitePatterns__Group_2__0 : rule__SitePatterns__Group_2__0__Impl rule__SitePatterns__Group_2__1 ;
    public final void rule__SitePatterns__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3714:1: ( rule__SitePatterns__Group_2__0__Impl rule__SitePatterns__Group_2__1 )
            // InternalReactionRules.g:3715:2: rule__SitePatterns__Group_2__0__Impl rule__SitePatterns__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__SitePatterns__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SitePatterns__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group_2__0"


    // $ANTLR start "rule__SitePatterns__Group_2__0__Impl"
    // InternalReactionRules.g:3722:1: rule__SitePatterns__Group_2__0__Impl : ( ( rule__SitePatterns__SitePatternsAssignment_2_0 ) ) ;
    public final void rule__SitePatterns__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3726:1: ( ( ( rule__SitePatterns__SitePatternsAssignment_2_0 ) ) )
            // InternalReactionRules.g:3727:1: ( ( rule__SitePatterns__SitePatternsAssignment_2_0 ) )
            {
            // InternalReactionRules.g:3727:1: ( ( rule__SitePatterns__SitePatternsAssignment_2_0 ) )
            // InternalReactionRules.g:3728:2: ( rule__SitePatterns__SitePatternsAssignment_2_0 )
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAssignment_2_0()); 
            // InternalReactionRules.g:3729:2: ( rule__SitePatterns__SitePatternsAssignment_2_0 )
            // InternalReactionRules.g:3729:3: rule__SitePatterns__SitePatternsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SitePatterns__SitePatternsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSitePatternsAccess().getSitePatternsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group_2__0__Impl"


    // $ANTLR start "rule__SitePatterns__Group_2__1"
    // InternalReactionRules.g:3737:1: rule__SitePatterns__Group_2__1 : rule__SitePatterns__Group_2__1__Impl ;
    public final void rule__SitePatterns__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3741:1: ( rule__SitePatterns__Group_2__1__Impl )
            // InternalReactionRules.g:3742:2: rule__SitePatterns__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SitePatterns__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group_2__1"


    // $ANTLR start "rule__SitePatterns__Group_2__1__Impl"
    // InternalReactionRules.g:3748:1: rule__SitePatterns__Group_2__1__Impl : ( ( rule__SitePatterns__Group_2_1__0 )* ) ;
    public final void rule__SitePatterns__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3752:1: ( ( ( rule__SitePatterns__Group_2_1__0 )* ) )
            // InternalReactionRules.g:3753:1: ( ( rule__SitePatterns__Group_2_1__0 )* )
            {
            // InternalReactionRules.g:3753:1: ( ( rule__SitePatterns__Group_2_1__0 )* )
            // InternalReactionRules.g:3754:2: ( rule__SitePatterns__Group_2_1__0 )*
            {
             before(grammarAccess.getSitePatternsAccess().getGroup_2_1()); 
            // InternalReactionRules.g:3755:2: ( rule__SitePatterns__Group_2_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==25) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalReactionRules.g:3755:3: rule__SitePatterns__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__SitePatterns__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSitePatternsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group_2__1__Impl"


    // $ANTLR start "rule__SitePatterns__Group_2_1__0"
    // InternalReactionRules.g:3764:1: rule__SitePatterns__Group_2_1__0 : rule__SitePatterns__Group_2_1__0__Impl rule__SitePatterns__Group_2_1__1 ;
    public final void rule__SitePatterns__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3768:1: ( rule__SitePatterns__Group_2_1__0__Impl rule__SitePatterns__Group_2_1__1 )
            // InternalReactionRules.g:3769:2: rule__SitePatterns__Group_2_1__0__Impl rule__SitePatterns__Group_2_1__1
            {
            pushFollow(FOLLOW_5);
            rule__SitePatterns__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SitePatterns__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group_2_1__0"


    // $ANTLR start "rule__SitePatterns__Group_2_1__0__Impl"
    // InternalReactionRules.g:3776:1: rule__SitePatterns__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SitePatterns__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3780:1: ( ( ',' ) )
            // InternalReactionRules.g:3781:1: ( ',' )
            {
            // InternalReactionRules.g:3781:1: ( ',' )
            // InternalReactionRules.g:3782:2: ','
            {
             before(grammarAccess.getSitePatternsAccess().getCommaKeyword_2_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSitePatternsAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group_2_1__0__Impl"


    // $ANTLR start "rule__SitePatterns__Group_2_1__1"
    // InternalReactionRules.g:3791:1: rule__SitePatterns__Group_2_1__1 : rule__SitePatterns__Group_2_1__1__Impl ;
    public final void rule__SitePatterns__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3795:1: ( rule__SitePatterns__Group_2_1__1__Impl )
            // InternalReactionRules.g:3796:2: rule__SitePatterns__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SitePatterns__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group_2_1__1"


    // $ANTLR start "rule__SitePatterns__Group_2_1__1__Impl"
    // InternalReactionRules.g:3802:1: rule__SitePatterns__Group_2_1__1__Impl : ( ( rule__SitePatterns__SitePatternsAssignment_2_1_1 ) ) ;
    public final void rule__SitePatterns__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3806:1: ( ( ( rule__SitePatterns__SitePatternsAssignment_2_1_1 ) ) )
            // InternalReactionRules.g:3807:1: ( ( rule__SitePatterns__SitePatternsAssignment_2_1_1 ) )
            {
            // InternalReactionRules.g:3807:1: ( ( rule__SitePatterns__SitePatternsAssignment_2_1_1 ) )
            // InternalReactionRules.g:3808:2: ( rule__SitePatterns__SitePatternsAssignment_2_1_1 )
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAssignment_2_1_1()); 
            // InternalReactionRules.g:3809:2: ( rule__SitePatterns__SitePatternsAssignment_2_1_1 )
            // InternalReactionRules.g:3809:3: rule__SitePatterns__SitePatternsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SitePatterns__SitePatternsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSitePatternsAccess().getSitePatternsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group_2_1__1__Impl"


    // $ANTLR start "rule__ValidAgentPattern__Group__0"
    // InternalReactionRules.g:3818:1: rule__ValidAgentPattern__Group__0 : rule__ValidAgentPattern__Group__0__Impl rule__ValidAgentPattern__Group__1 ;
    public final void rule__ValidAgentPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3822:1: ( rule__ValidAgentPattern__Group__0__Impl rule__ValidAgentPattern__Group__1 )
            // InternalReactionRules.g:3823:2: rule__ValidAgentPattern__Group__0__Impl rule__ValidAgentPattern__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ValidAgentPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidAgentPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidAgentPattern__Group__0"


    // $ANTLR start "rule__ValidAgentPattern__Group__0__Impl"
    // InternalReactionRules.g:3830:1: rule__ValidAgentPattern__Group__0__Impl : ( () ) ;
    public final void rule__ValidAgentPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3834:1: ( ( () ) )
            // InternalReactionRules.g:3835:1: ( () )
            {
            // InternalReactionRules.g:3835:1: ( () )
            // InternalReactionRules.g:3836:2: ()
            {
             before(grammarAccess.getValidAgentPatternAccess().getValidAgentPatternAction_0()); 
            // InternalReactionRules.g:3837:2: ()
            // InternalReactionRules.g:3837:3: 
            {
            }

             after(grammarAccess.getValidAgentPatternAccess().getValidAgentPatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidAgentPattern__Group__0__Impl"


    // $ANTLR start "rule__ValidAgentPattern__Group__1"
    // InternalReactionRules.g:3845:1: rule__ValidAgentPattern__Group__1 : rule__ValidAgentPattern__Group__1__Impl rule__ValidAgentPattern__Group__2 ;
    public final void rule__ValidAgentPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3849:1: ( rule__ValidAgentPattern__Group__1__Impl rule__ValidAgentPattern__Group__2 )
            // InternalReactionRules.g:3850:2: rule__ValidAgentPattern__Group__1__Impl rule__ValidAgentPattern__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ValidAgentPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidAgentPattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidAgentPattern__Group__1"


    // $ANTLR start "rule__ValidAgentPattern__Group__1__Impl"
    // InternalReactionRules.g:3857:1: rule__ValidAgentPattern__Group__1__Impl : ( ( rule__ValidAgentPattern__AgentAssignment_1 ) ) ;
    public final void rule__ValidAgentPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3861:1: ( ( ( rule__ValidAgentPattern__AgentAssignment_1 ) ) )
            // InternalReactionRules.g:3862:1: ( ( rule__ValidAgentPattern__AgentAssignment_1 ) )
            {
            // InternalReactionRules.g:3862:1: ( ( rule__ValidAgentPattern__AgentAssignment_1 ) )
            // InternalReactionRules.g:3863:2: ( rule__ValidAgentPattern__AgentAssignment_1 )
            {
             before(grammarAccess.getValidAgentPatternAccess().getAgentAssignment_1()); 
            // InternalReactionRules.g:3864:2: ( rule__ValidAgentPattern__AgentAssignment_1 )
            // InternalReactionRules.g:3864:3: rule__ValidAgentPattern__AgentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ValidAgentPattern__AgentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValidAgentPatternAccess().getAgentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidAgentPattern__Group__1__Impl"


    // $ANTLR start "rule__ValidAgentPattern__Group__2"
    // InternalReactionRules.g:3872:1: rule__ValidAgentPattern__Group__2 : rule__ValidAgentPattern__Group__2__Impl ;
    public final void rule__ValidAgentPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3876:1: ( rule__ValidAgentPattern__Group__2__Impl )
            // InternalReactionRules.g:3877:2: rule__ValidAgentPattern__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidAgentPattern__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidAgentPattern__Group__2"


    // $ANTLR start "rule__ValidAgentPattern__Group__2__Impl"
    // InternalReactionRules.g:3883:1: rule__ValidAgentPattern__Group__2__Impl : ( ( rule__ValidAgentPattern__SitePatternsAssignment_2 ) ) ;
    public final void rule__ValidAgentPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3887:1: ( ( ( rule__ValidAgentPattern__SitePatternsAssignment_2 ) ) )
            // InternalReactionRules.g:3888:1: ( ( rule__ValidAgentPattern__SitePatternsAssignment_2 ) )
            {
            // InternalReactionRules.g:3888:1: ( ( rule__ValidAgentPattern__SitePatternsAssignment_2 ) )
            // InternalReactionRules.g:3889:2: ( rule__ValidAgentPattern__SitePatternsAssignment_2 )
            {
             before(grammarAccess.getValidAgentPatternAccess().getSitePatternsAssignment_2()); 
            // InternalReactionRules.g:3890:2: ( rule__ValidAgentPattern__SitePatternsAssignment_2 )
            // InternalReactionRules.g:3890:3: rule__ValidAgentPattern__SitePatternsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ValidAgentPattern__SitePatternsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getValidAgentPatternAccess().getSitePatternsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidAgentPattern__Group__2__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalReactionRules.g:3899:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3903:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalReactionRules.g:3904:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Pattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0"


    // $ANTLR start "rule__Pattern__Group__0__Impl"
    // InternalReactionRules.g:3911:1: rule__Pattern__Group__0__Impl : ( () ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3915:1: ( ( () ) )
            // InternalReactionRules.g:3916:1: ( () )
            {
            // InternalReactionRules.g:3916:1: ( () )
            // InternalReactionRules.g:3917:2: ()
            {
             before(grammarAccess.getPatternAccess().getPatternAction_0()); 
            // InternalReactionRules.g:3918:2: ()
            // InternalReactionRules.g:3918:3: 
            {
            }

             after(grammarAccess.getPatternAccess().getPatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0__Impl"


    // $ANTLR start "rule__Pattern__Group__1"
    // InternalReactionRules.g:3926:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3930:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalReactionRules.g:3931:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Pattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1"


    // $ANTLR start "rule__Pattern__Group__1__Impl"
    // InternalReactionRules.g:3938:1: rule__Pattern__Group__1__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3942:1: ( ( '{' ) )
            // InternalReactionRules.g:3943:1: ( '{' )
            {
            // InternalReactionRules.g:3943:1: ( '{' )
            // InternalReactionRules.g:3944:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group__2"
    // InternalReactionRules.g:3953:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3957:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalReactionRules.g:3958:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Pattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2"


    // $ANTLR start "rule__Pattern__Group__2__Impl"
    // InternalReactionRules.g:3965:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__Group_2__0 )? ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3969:1: ( ( ( rule__Pattern__Group_2__0 )? ) )
            // InternalReactionRules.g:3970:1: ( ( rule__Pattern__Group_2__0 )? )
            {
            // InternalReactionRules.g:3970:1: ( ( rule__Pattern__Group_2__0 )? )
            // InternalReactionRules.g:3971:2: ( rule__Pattern__Group_2__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_2()); 
            // InternalReactionRules.g:3972:2: ( rule__Pattern__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||LA21_0==RULE_VOID_PATTERN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalReactionRules.g:3972:3: rule__Pattern__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2__Impl"


    // $ANTLR start "rule__Pattern__Group__3"
    // InternalReactionRules.g:3980:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3984:1: ( rule__Pattern__Group__3__Impl )
            // InternalReactionRules.g:3985:2: rule__Pattern__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3"


    // $ANTLR start "rule__Pattern__Group__3__Impl"
    // InternalReactionRules.g:3991:1: rule__Pattern__Group__3__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3995:1: ( ( '}' ) )
            // InternalReactionRules.g:3996:1: ( '}' )
            {
            // InternalReactionRules.g:3996:1: ( '}' )
            // InternalReactionRules.g:3997:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3__Impl"


    // $ANTLR start "rule__Pattern__Group_2__0"
    // InternalReactionRules.g:4007:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4011:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalReactionRules.g:4012:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__Pattern__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__0"


    // $ANTLR start "rule__Pattern__Group_2__0__Impl"
    // InternalReactionRules.g:4019:1: rule__Pattern__Group_2__0__Impl : ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4023:1: ( ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) ) )
            // InternalReactionRules.g:4024:1: ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) )
            {
            // InternalReactionRules.g:4024:1: ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) )
            // InternalReactionRules.g:4025:2: ( rule__Pattern__AgentPatternsAssignment_2_0 )
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAssignment_2_0()); 
            // InternalReactionRules.g:4026:2: ( rule__Pattern__AgentPatternsAssignment_2_0 )
            // InternalReactionRules.g:4026:3: rule__Pattern__AgentPatternsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__AgentPatternsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getAgentPatternsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__0__Impl"


    // $ANTLR start "rule__Pattern__Group_2__1"
    // InternalReactionRules.g:4034:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4038:1: ( rule__Pattern__Group_2__1__Impl )
            // InternalReactionRules.g:4039:2: rule__Pattern__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__1"


    // $ANTLR start "rule__Pattern__Group_2__1__Impl"
    // InternalReactionRules.g:4045:1: rule__Pattern__Group_2__1__Impl : ( ( rule__Pattern__Group_2_1__0 )* ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4049:1: ( ( ( rule__Pattern__Group_2_1__0 )* ) )
            // InternalReactionRules.g:4050:1: ( ( rule__Pattern__Group_2_1__0 )* )
            {
            // InternalReactionRules.g:4050:1: ( ( rule__Pattern__Group_2_1__0 )* )
            // InternalReactionRules.g:4051:2: ( rule__Pattern__Group_2_1__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1()); 
            // InternalReactionRules.g:4052:2: ( rule__Pattern__Group_2_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalReactionRules.g:4052:3: rule__Pattern__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Pattern__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__1__Impl"


    // $ANTLR start "rule__Pattern__Group_2_1__0"
    // InternalReactionRules.g:4061:1: rule__Pattern__Group_2_1__0 : rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 ;
    public final void rule__Pattern__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4065:1: ( rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 )
            // InternalReactionRules.g:4066:2: rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Pattern__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1__0"


    // $ANTLR start "rule__Pattern__Group_2_1__0__Impl"
    // InternalReactionRules.g:4073:1: rule__Pattern__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4077:1: ( ( ',' ) )
            // InternalReactionRules.g:4078:1: ( ',' )
            {
            // InternalReactionRules.g:4078:1: ( ',' )
            // InternalReactionRules.g:4079:2: ','
            {
             before(grammarAccess.getPatternAccess().getCommaKeyword_2_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1__0__Impl"


    // $ANTLR start "rule__Pattern__Group_2_1__1"
    // InternalReactionRules.g:4088:1: rule__Pattern__Group_2_1__1 : rule__Pattern__Group_2_1__1__Impl ;
    public final void rule__Pattern__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4092:1: ( rule__Pattern__Group_2_1__1__Impl )
            // InternalReactionRules.g:4093:2: rule__Pattern__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1__1"


    // $ANTLR start "rule__Pattern__Group_2_1__1__Impl"
    // InternalReactionRules.g:4099:1: rule__Pattern__Group_2_1__1__Impl : ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) ) ;
    public final void rule__Pattern__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4103:1: ( ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) ) )
            // InternalReactionRules.g:4104:1: ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) )
            {
            // InternalReactionRules.g:4104:1: ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) )
            // InternalReactionRules.g:4105:2: ( rule__Pattern__AgentPatternsAssignment_2_1_1 )
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAssignment_2_1_1()); 
            // InternalReactionRules.g:4106:2: ( rule__Pattern__AgentPatternsAssignment_2_1_1 )
            // InternalReactionRules.g:4106:3: rule__Pattern__AgentPatternsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__AgentPatternsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getAgentPatternsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1__1__Impl"


    // $ANTLR start "rule__Observation__Group__0"
    // InternalReactionRules.g:4115:1: rule__Observation__Group__0 : rule__Observation__Group__0__Impl rule__Observation__Group__1 ;
    public final void rule__Observation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4119:1: ( rule__Observation__Group__0__Impl rule__Observation__Group__1 )
            // InternalReactionRules.g:4120:2: rule__Observation__Group__0__Impl rule__Observation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Observation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observation__Group__0"


    // $ANTLR start "rule__Observation__Group__0__Impl"
    // InternalReactionRules.g:4127:1: rule__Observation__Group__0__Impl : ( 'obs' ) ;
    public final void rule__Observation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4131:1: ( ( 'obs' ) )
            // InternalReactionRules.g:4132:1: ( 'obs' )
            {
            // InternalReactionRules.g:4132:1: ( 'obs' )
            // InternalReactionRules.g:4133:2: 'obs'
            {
             before(grammarAccess.getObservationAccess().getObsKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getObservationAccess().getObsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observation__Group__0__Impl"


    // $ANTLR start "rule__Observation__Group__1"
    // InternalReactionRules.g:4142:1: rule__Observation__Group__1 : rule__Observation__Group__1__Impl rule__Observation__Group__2 ;
    public final void rule__Observation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4146:1: ( rule__Observation__Group__1__Impl rule__Observation__Group__2 )
            // InternalReactionRules.g:4147:2: rule__Observation__Group__1__Impl rule__Observation__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Observation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observation__Group__1"


    // $ANTLR start "rule__Observation__Group__1__Impl"
    // InternalReactionRules.g:4154:1: rule__Observation__Group__1__Impl : ( ( rule__Observation__NameAssignment_1 ) ) ;
    public final void rule__Observation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4158:1: ( ( ( rule__Observation__NameAssignment_1 ) ) )
            // InternalReactionRules.g:4159:1: ( ( rule__Observation__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:4159:1: ( ( rule__Observation__NameAssignment_1 ) )
            // InternalReactionRules.g:4160:2: ( rule__Observation__NameAssignment_1 )
            {
             before(grammarAccess.getObservationAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:4161:2: ( rule__Observation__NameAssignment_1 )
            // InternalReactionRules.g:4161:3: rule__Observation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Observation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObservationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observation__Group__1__Impl"


    // $ANTLR start "rule__Observation__Group__2"
    // InternalReactionRules.g:4169:1: rule__Observation__Group__2 : rule__Observation__Group__2__Impl ;
    public final void rule__Observation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4173:1: ( rule__Observation__Group__2__Impl )
            // InternalReactionRules.g:4174:2: rule__Observation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Observation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observation__Group__2"


    // $ANTLR start "rule__Observation__Group__2__Impl"
    // InternalReactionRules.g:4180:1: rule__Observation__Group__2__Impl : ( ( rule__Observation__ObservationPatternAssignment_2 ) ) ;
    public final void rule__Observation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4184:1: ( ( ( rule__Observation__ObservationPatternAssignment_2 ) ) )
            // InternalReactionRules.g:4185:1: ( ( rule__Observation__ObservationPatternAssignment_2 ) )
            {
            // InternalReactionRules.g:4185:1: ( ( rule__Observation__ObservationPatternAssignment_2 ) )
            // InternalReactionRules.g:4186:2: ( rule__Observation__ObservationPatternAssignment_2 )
            {
             before(grammarAccess.getObservationAccess().getObservationPatternAssignment_2()); 
            // InternalReactionRules.g:4187:2: ( rule__Observation__ObservationPatternAssignment_2 )
            // InternalReactionRules.g:4187:3: rule__Observation__ObservationPatternAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Observation__ObservationPatternAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObservationAccess().getObservationPatternAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observation__Group__2__Impl"


    // $ANTLR start "rule__Initial__Group__0"
    // InternalReactionRules.g:4196:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4200:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // InternalReactionRules.g:4201:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Initial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__0"


    // $ANTLR start "rule__Initial__Group__0__Impl"
    // InternalReactionRules.g:4208:1: rule__Initial__Group__0__Impl : ( 'init' ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4212:1: ( ( 'init' ) )
            // InternalReactionRules.g:4213:1: ( 'init' )
            {
            // InternalReactionRules.g:4213:1: ( 'init' )
            // InternalReactionRules.g:4214:2: 'init'
            {
             before(grammarAccess.getInitialAccess().getInitKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getInitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__0__Impl"


    // $ANTLR start "rule__Initial__Group__1"
    // InternalReactionRules.g:4223:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4227:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // InternalReactionRules.g:4228:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Initial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__1"


    // $ANTLR start "rule__Initial__Group__1__Impl"
    // InternalReactionRules.g:4235:1: rule__Initial__Group__1__Impl : ( ( rule__Initial__NameAssignment_1 ) ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4239:1: ( ( ( rule__Initial__NameAssignment_1 ) ) )
            // InternalReactionRules.g:4240:1: ( ( rule__Initial__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:4240:1: ( ( rule__Initial__NameAssignment_1 ) )
            // InternalReactionRules.g:4241:2: ( rule__Initial__NameAssignment_1 )
            {
             before(grammarAccess.getInitialAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:4242:2: ( rule__Initial__NameAssignment_1 )
            // InternalReactionRules.g:4242:3: rule__Initial__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Initial__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__1__Impl"


    // $ANTLR start "rule__Initial__Group__2"
    // InternalReactionRules.g:4250:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl rule__Initial__Group__3 ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4254:1: ( rule__Initial__Group__2__Impl rule__Initial__Group__3 )
            // InternalReactionRules.g:4255:2: rule__Initial__Group__2__Impl rule__Initial__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Initial__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__2"


    // $ANTLR start "rule__Initial__Group__2__Impl"
    // InternalReactionRules.g:4262:1: rule__Initial__Group__2__Impl : ( ( rule__Initial__CountAssignment_2 ) ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4266:1: ( ( ( rule__Initial__CountAssignment_2 ) ) )
            // InternalReactionRules.g:4267:1: ( ( rule__Initial__CountAssignment_2 ) )
            {
            // InternalReactionRules.g:4267:1: ( ( rule__Initial__CountAssignment_2 ) )
            // InternalReactionRules.g:4268:2: ( rule__Initial__CountAssignment_2 )
            {
             before(grammarAccess.getInitialAccess().getCountAssignment_2()); 
            // InternalReactionRules.g:4269:2: ( rule__Initial__CountAssignment_2 )
            // InternalReactionRules.g:4269:3: rule__Initial__CountAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Initial__CountAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getCountAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__2__Impl"


    // $ANTLR start "rule__Initial__Group__3"
    // InternalReactionRules.g:4277:1: rule__Initial__Group__3 : rule__Initial__Group__3__Impl ;
    public final void rule__Initial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4281:1: ( rule__Initial__Group__3__Impl )
            // InternalReactionRules.g:4282:2: rule__Initial__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Initial__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__3"


    // $ANTLR start "rule__Initial__Group__3__Impl"
    // InternalReactionRules.g:4288:1: rule__Initial__Group__3__Impl : ( ( rule__Initial__InitialPatternAssignment_3 ) ) ;
    public final void rule__Initial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4292:1: ( ( ( rule__Initial__InitialPatternAssignment_3 ) ) )
            // InternalReactionRules.g:4293:1: ( ( rule__Initial__InitialPatternAssignment_3 ) )
            {
            // InternalReactionRules.g:4293:1: ( ( rule__Initial__InitialPatternAssignment_3 ) )
            // InternalReactionRules.g:4294:2: ( rule__Initial__InitialPatternAssignment_3 )
            {
             before(grammarAccess.getInitialAccess().getInitialPatternAssignment_3()); 
            // InternalReactionRules.g:4295:2: ( rule__Initial__InitialPatternAssignment_3 )
            // InternalReactionRules.g:4295:3: rule__Initial__InitialPatternAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Initial__InitialPatternAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getInitialPatternAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__3__Impl"


    // $ANTLR start "rule__RuleVariables__Group__0"
    // InternalReactionRules.g:4304:1: rule__RuleVariables__Group__0 : rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1 ;
    public final void rule__RuleVariables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4308:1: ( rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1 )
            // InternalReactionRules.g:4309:2: rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__RuleVariables__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleVariables__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVariables__Group__0"


    // $ANTLR start "rule__RuleVariables__Group__0__Impl"
    // InternalReactionRules.g:4316:1: rule__RuleVariables__Group__0__Impl : ( ( rule__RuleVariables__VariablesAssignment_0 ) ) ;
    public final void rule__RuleVariables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4320:1: ( ( ( rule__RuleVariables__VariablesAssignment_0 ) ) )
            // InternalReactionRules.g:4321:1: ( ( rule__RuleVariables__VariablesAssignment_0 ) )
            {
            // InternalReactionRules.g:4321:1: ( ( rule__RuleVariables__VariablesAssignment_0 ) )
            // InternalReactionRules.g:4322:2: ( rule__RuleVariables__VariablesAssignment_0 )
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesAssignment_0()); 
            // InternalReactionRules.g:4323:2: ( rule__RuleVariables__VariablesAssignment_0 )
            // InternalReactionRules.g:4323:3: rule__RuleVariables__VariablesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RuleVariables__VariablesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleVariablesAccess().getVariablesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVariables__Group__0__Impl"


    // $ANTLR start "rule__RuleVariables__Group__1"
    // InternalReactionRules.g:4331:1: rule__RuleVariables__Group__1 : rule__RuleVariables__Group__1__Impl ;
    public final void rule__RuleVariables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4335:1: ( rule__RuleVariables__Group__1__Impl )
            // InternalReactionRules.g:4336:2: rule__RuleVariables__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleVariables__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVariables__Group__1"


    // $ANTLR start "rule__RuleVariables__Group__1__Impl"
    // InternalReactionRules.g:4342:1: rule__RuleVariables__Group__1__Impl : ( ( rule__RuleVariables__Group_1__0 )* ) ;
    public final void rule__RuleVariables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4346:1: ( ( ( rule__RuleVariables__Group_1__0 )* ) )
            // InternalReactionRules.g:4347:1: ( ( rule__RuleVariables__Group_1__0 )* )
            {
            // InternalReactionRules.g:4347:1: ( ( rule__RuleVariables__Group_1__0 )* )
            // InternalReactionRules.g:4348:2: ( rule__RuleVariables__Group_1__0 )*
            {
             before(grammarAccess.getRuleVariablesAccess().getGroup_1()); 
            // InternalReactionRules.g:4349:2: ( rule__RuleVariables__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==25) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalReactionRules.g:4349:3: rule__RuleVariables__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__RuleVariables__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getRuleVariablesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVariables__Group__1__Impl"


    // $ANTLR start "rule__RuleVariables__Group_1__0"
    // InternalReactionRules.g:4358:1: rule__RuleVariables__Group_1__0 : rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1 ;
    public final void rule__RuleVariables__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4362:1: ( rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1 )
            // InternalReactionRules.g:4363:2: rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__RuleVariables__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleVariables__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVariables__Group_1__0"


    // $ANTLR start "rule__RuleVariables__Group_1__0__Impl"
    // InternalReactionRules.g:4370:1: rule__RuleVariables__Group_1__0__Impl : ( ',' ) ;
    public final void rule__RuleVariables__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4374:1: ( ( ',' ) )
            // InternalReactionRules.g:4375:1: ( ',' )
            {
            // InternalReactionRules.g:4375:1: ( ',' )
            // InternalReactionRules.g:4376:2: ','
            {
             before(grammarAccess.getRuleVariablesAccess().getCommaKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRuleVariablesAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVariables__Group_1__0__Impl"


    // $ANTLR start "rule__RuleVariables__Group_1__1"
    // InternalReactionRules.g:4385:1: rule__RuleVariables__Group_1__1 : rule__RuleVariables__Group_1__1__Impl ;
    public final void rule__RuleVariables__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4389:1: ( rule__RuleVariables__Group_1__1__Impl )
            // InternalReactionRules.g:4390:2: rule__RuleVariables__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleVariables__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVariables__Group_1__1"


    // $ANTLR start "rule__RuleVariables__Group_1__1__Impl"
    // InternalReactionRules.g:4396:1: rule__RuleVariables__Group_1__1__Impl : ( ( rule__RuleVariables__VariablesAssignment_1_1 ) ) ;
    public final void rule__RuleVariables__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4400:1: ( ( ( rule__RuleVariables__VariablesAssignment_1_1 ) ) )
            // InternalReactionRules.g:4401:1: ( ( rule__RuleVariables__VariablesAssignment_1_1 ) )
            {
            // InternalReactionRules.g:4401:1: ( ( rule__RuleVariables__VariablesAssignment_1_1 ) )
            // InternalReactionRules.g:4402:2: ( rule__RuleVariables__VariablesAssignment_1_1 )
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesAssignment_1_1()); 
            // InternalReactionRules.g:4403:2: ( rule__RuleVariables__VariablesAssignment_1_1 )
            // InternalReactionRules.g:4403:3: rule__RuleVariables__VariablesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleVariables__VariablesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleVariablesAccess().getVariablesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVariables__Group_1__1__Impl"


    // $ANTLR start "rule__UnidirectionalRule__Group__0"
    // InternalReactionRules.g:4412:1: rule__UnidirectionalRule__Group__0 : rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1 ;
    public final void rule__UnidirectionalRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4416:1: ( rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1 )
            // InternalReactionRules.g:4417:2: rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__UnidirectionalRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnidirectionalRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__Group__0"


    // $ANTLR start "rule__UnidirectionalRule__Group__0__Impl"
    // InternalReactionRules.g:4424:1: rule__UnidirectionalRule__Group__0__Impl : ( ( rule__UnidirectionalRule__LhsAssignment_0 ) ) ;
    public final void rule__UnidirectionalRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4428:1: ( ( ( rule__UnidirectionalRule__LhsAssignment_0 ) ) )
            // InternalReactionRules.g:4429:1: ( ( rule__UnidirectionalRule__LhsAssignment_0 ) )
            {
            // InternalReactionRules.g:4429:1: ( ( rule__UnidirectionalRule__LhsAssignment_0 ) )
            // InternalReactionRules.g:4430:2: ( rule__UnidirectionalRule__LhsAssignment_0 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getLhsAssignment_0()); 
            // InternalReactionRules.g:4431:2: ( rule__UnidirectionalRule__LhsAssignment_0 )
            // InternalReactionRules.g:4431:3: rule__UnidirectionalRule__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UnidirectionalRule__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUnidirectionalRuleAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__Group__0__Impl"


    // $ANTLR start "rule__UnidirectionalRule__Group__1"
    // InternalReactionRules.g:4439:1: rule__UnidirectionalRule__Group__1 : rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2 ;
    public final void rule__UnidirectionalRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4443:1: ( rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2 )
            // InternalReactionRules.g:4444:2: rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__UnidirectionalRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnidirectionalRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__Group__1"


    // $ANTLR start "rule__UnidirectionalRule__Group__1__Impl"
    // InternalReactionRules.g:4451:1: rule__UnidirectionalRule__Group__1__Impl : ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) ) ;
    public final void rule__UnidirectionalRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4455:1: ( ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) ) )
            // InternalReactionRules.g:4456:1: ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) )
            {
            // InternalReactionRules.g:4456:1: ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) )
            // InternalReactionRules.g:4457:2: ( rule__UnidirectionalRule__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getOperatorAssignment_1()); 
            // InternalReactionRules.g:4458:2: ( rule__UnidirectionalRule__OperatorAssignment_1 )
            // InternalReactionRules.g:4458:3: rule__UnidirectionalRule__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnidirectionalRule__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnidirectionalRuleAccess().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__Group__1__Impl"


    // $ANTLR start "rule__UnidirectionalRule__Group__2"
    // InternalReactionRules.g:4466:1: rule__UnidirectionalRule__Group__2 : rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3 ;
    public final void rule__UnidirectionalRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4470:1: ( rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3 )
            // InternalReactionRules.g:4471:2: rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__UnidirectionalRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnidirectionalRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__Group__2"


    // $ANTLR start "rule__UnidirectionalRule__Group__2__Impl"
    // InternalReactionRules.g:4478:1: rule__UnidirectionalRule__Group__2__Impl : ( ( rule__UnidirectionalRule__RhsAssignment_2 ) ) ;
    public final void rule__UnidirectionalRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4482:1: ( ( ( rule__UnidirectionalRule__RhsAssignment_2 ) ) )
            // InternalReactionRules.g:4483:1: ( ( rule__UnidirectionalRule__RhsAssignment_2 ) )
            {
            // InternalReactionRules.g:4483:1: ( ( rule__UnidirectionalRule__RhsAssignment_2 ) )
            // InternalReactionRules.g:4484:2: ( rule__UnidirectionalRule__RhsAssignment_2 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getRhsAssignment_2()); 
            // InternalReactionRules.g:4485:2: ( rule__UnidirectionalRule__RhsAssignment_2 )
            // InternalReactionRules.g:4485:3: rule__UnidirectionalRule__RhsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UnidirectionalRule__RhsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnidirectionalRuleAccess().getRhsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__Group__2__Impl"


    // $ANTLR start "rule__UnidirectionalRule__Group__3"
    // InternalReactionRules.g:4493:1: rule__UnidirectionalRule__Group__3 : rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4 ;
    public final void rule__UnidirectionalRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4497:1: ( rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4 )
            // InternalReactionRules.g:4498:2: rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__UnidirectionalRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnidirectionalRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__Group__3"


    // $ANTLR start "rule__UnidirectionalRule__Group__3__Impl"
    // InternalReactionRules.g:4505:1: rule__UnidirectionalRule__Group__3__Impl : ( RULE_AT ) ;
    public final void rule__UnidirectionalRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4509:1: ( ( RULE_AT ) )
            // InternalReactionRules.g:4510:1: ( RULE_AT )
            {
            // InternalReactionRules.g:4510:1: ( RULE_AT )
            // InternalReactionRules.g:4511:2: RULE_AT
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getATTerminalRuleCall_3()); 
            match(input,RULE_AT,FOLLOW_2); 
             after(grammarAccess.getUnidirectionalRuleAccess().getATTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__Group__3__Impl"


    // $ANTLR start "rule__UnidirectionalRule__Group__4"
    // InternalReactionRules.g:4520:1: rule__UnidirectionalRule__Group__4 : rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5 ;
    public final void rule__UnidirectionalRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4524:1: ( rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5 )
            // InternalReactionRules.g:4525:2: rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__UnidirectionalRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnidirectionalRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__Group__4"


    // $ANTLR start "rule__UnidirectionalRule__Group__4__Impl"
    // InternalReactionRules.g:4532:1: rule__UnidirectionalRule__Group__4__Impl : ( '[' ) ;
    public final void rule__UnidirectionalRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4536:1: ( ( '[' ) )
            // InternalReactionRules.g:4537:1: ( '[' )
            {
            // InternalReactionRules.g:4537:1: ( '[' )
            // InternalReactionRules.g:4538:2: '['
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getLeftSquareBracketKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getUnidirectionalRuleAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__Group__4__Impl"


    // $ANTLR start "rule__UnidirectionalRule__Group__5"
    // InternalReactionRules.g:4547:1: rule__UnidirectionalRule__Group__5 : rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6 ;
    public final void rule__UnidirectionalRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4551:1: ( rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6 )
            // InternalReactionRules.g:4552:2: rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__UnidirectionalRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnidirectionalRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__Group__5"


    // $ANTLR start "rule__UnidirectionalRule__Group__5__Impl"
    // InternalReactionRules.g:4559:1: rule__UnidirectionalRule__Group__5__Impl : ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) ) ;
    public final void rule__UnidirectionalRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4563:1: ( ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) ) )
            // InternalReactionRules.g:4564:1: ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) )
            {
            // InternalReactionRules.g:4564:1: ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) )
            // InternalReactionRules.g:4565:2: ( rule__UnidirectionalRule__VariablesAssignment_5 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getVariablesAssignment_5()); 
            // InternalReactionRules.g:4566:2: ( rule__UnidirectionalRule__VariablesAssignment_5 )
            // InternalReactionRules.g:4566:3: rule__UnidirectionalRule__VariablesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__UnidirectionalRule__VariablesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUnidirectionalRuleAccess().getVariablesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__Group__5__Impl"


    // $ANTLR start "rule__UnidirectionalRule__Group__6"
    // InternalReactionRules.g:4574:1: rule__UnidirectionalRule__Group__6 : rule__UnidirectionalRule__Group__6__Impl ;
    public final void rule__UnidirectionalRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4578:1: ( rule__UnidirectionalRule__Group__6__Impl )
            // InternalReactionRules.g:4579:2: rule__UnidirectionalRule__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnidirectionalRule__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__Group__6"


    // $ANTLR start "rule__UnidirectionalRule__Group__6__Impl"
    // InternalReactionRules.g:4585:1: rule__UnidirectionalRule__Group__6__Impl : ( ']' ) ;
    public final void rule__UnidirectionalRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4589:1: ( ( ']' ) )
            // InternalReactionRules.g:4590:1: ( ']' )
            {
            // InternalReactionRules.g:4590:1: ( ']' )
            // InternalReactionRules.g:4591:2: ']'
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getRightSquareBracketKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getUnidirectionalRuleAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__Group__6__Impl"


    // $ANTLR start "rule__BidirectionalRule__Group__0"
    // InternalReactionRules.g:4601:1: rule__BidirectionalRule__Group__0 : rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1 ;
    public final void rule__BidirectionalRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4605:1: ( rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1 )
            // InternalReactionRules.g:4606:2: rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__BidirectionalRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BidirectionalRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__Group__0"


    // $ANTLR start "rule__BidirectionalRule__Group__0__Impl"
    // InternalReactionRules.g:4613:1: rule__BidirectionalRule__Group__0__Impl : ( ( rule__BidirectionalRule__LhsAssignment_0 ) ) ;
    public final void rule__BidirectionalRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4617:1: ( ( ( rule__BidirectionalRule__LhsAssignment_0 ) ) )
            // InternalReactionRules.g:4618:1: ( ( rule__BidirectionalRule__LhsAssignment_0 ) )
            {
            // InternalReactionRules.g:4618:1: ( ( rule__BidirectionalRule__LhsAssignment_0 ) )
            // InternalReactionRules.g:4619:2: ( rule__BidirectionalRule__LhsAssignment_0 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getLhsAssignment_0()); 
            // InternalReactionRules.g:4620:2: ( rule__BidirectionalRule__LhsAssignment_0 )
            // InternalReactionRules.g:4620:3: rule__BidirectionalRule__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BidirectionalRule__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBidirectionalRuleAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__Group__0__Impl"


    // $ANTLR start "rule__BidirectionalRule__Group__1"
    // InternalReactionRules.g:4628:1: rule__BidirectionalRule__Group__1 : rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2 ;
    public final void rule__BidirectionalRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4632:1: ( rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2 )
            // InternalReactionRules.g:4633:2: rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__BidirectionalRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BidirectionalRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__Group__1"


    // $ANTLR start "rule__BidirectionalRule__Group__1__Impl"
    // InternalReactionRules.g:4640:1: rule__BidirectionalRule__Group__1__Impl : ( ( rule__BidirectionalRule__OperatorAssignment_1 ) ) ;
    public final void rule__BidirectionalRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4644:1: ( ( ( rule__BidirectionalRule__OperatorAssignment_1 ) ) )
            // InternalReactionRules.g:4645:1: ( ( rule__BidirectionalRule__OperatorAssignment_1 ) )
            {
            // InternalReactionRules.g:4645:1: ( ( rule__BidirectionalRule__OperatorAssignment_1 ) )
            // InternalReactionRules.g:4646:2: ( rule__BidirectionalRule__OperatorAssignment_1 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getOperatorAssignment_1()); 
            // InternalReactionRules.g:4647:2: ( rule__BidirectionalRule__OperatorAssignment_1 )
            // InternalReactionRules.g:4647:3: rule__BidirectionalRule__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BidirectionalRule__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBidirectionalRuleAccess().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__Group__1__Impl"


    // $ANTLR start "rule__BidirectionalRule__Group__2"
    // InternalReactionRules.g:4655:1: rule__BidirectionalRule__Group__2 : rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3 ;
    public final void rule__BidirectionalRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4659:1: ( rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3 )
            // InternalReactionRules.g:4660:2: rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__BidirectionalRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BidirectionalRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__Group__2"


    // $ANTLR start "rule__BidirectionalRule__Group__2__Impl"
    // InternalReactionRules.g:4667:1: rule__BidirectionalRule__Group__2__Impl : ( ( rule__BidirectionalRule__RhsAssignment_2 ) ) ;
    public final void rule__BidirectionalRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4671:1: ( ( ( rule__BidirectionalRule__RhsAssignment_2 ) ) )
            // InternalReactionRules.g:4672:1: ( ( rule__BidirectionalRule__RhsAssignment_2 ) )
            {
            // InternalReactionRules.g:4672:1: ( ( rule__BidirectionalRule__RhsAssignment_2 ) )
            // InternalReactionRules.g:4673:2: ( rule__BidirectionalRule__RhsAssignment_2 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getRhsAssignment_2()); 
            // InternalReactionRules.g:4674:2: ( rule__BidirectionalRule__RhsAssignment_2 )
            // InternalReactionRules.g:4674:3: rule__BidirectionalRule__RhsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BidirectionalRule__RhsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBidirectionalRuleAccess().getRhsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__Group__2__Impl"


    // $ANTLR start "rule__BidirectionalRule__Group__3"
    // InternalReactionRules.g:4682:1: rule__BidirectionalRule__Group__3 : rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4 ;
    public final void rule__BidirectionalRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4686:1: ( rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4 )
            // InternalReactionRules.g:4687:2: rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__BidirectionalRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BidirectionalRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__Group__3"


    // $ANTLR start "rule__BidirectionalRule__Group__3__Impl"
    // InternalReactionRules.g:4694:1: rule__BidirectionalRule__Group__3__Impl : ( RULE_AT ) ;
    public final void rule__BidirectionalRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4698:1: ( ( RULE_AT ) )
            // InternalReactionRules.g:4699:1: ( RULE_AT )
            {
            // InternalReactionRules.g:4699:1: ( RULE_AT )
            // InternalReactionRules.g:4700:2: RULE_AT
            {
             before(grammarAccess.getBidirectionalRuleAccess().getATTerminalRuleCall_3()); 
            match(input,RULE_AT,FOLLOW_2); 
             after(grammarAccess.getBidirectionalRuleAccess().getATTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__Group__3__Impl"


    // $ANTLR start "rule__BidirectionalRule__Group__4"
    // InternalReactionRules.g:4709:1: rule__BidirectionalRule__Group__4 : rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5 ;
    public final void rule__BidirectionalRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4713:1: ( rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5 )
            // InternalReactionRules.g:4714:2: rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__BidirectionalRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BidirectionalRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__Group__4"


    // $ANTLR start "rule__BidirectionalRule__Group__4__Impl"
    // InternalReactionRules.g:4721:1: rule__BidirectionalRule__Group__4__Impl : ( '[' ) ;
    public final void rule__BidirectionalRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4725:1: ( ( '[' ) )
            // InternalReactionRules.g:4726:1: ( '[' )
            {
            // InternalReactionRules.g:4726:1: ( '[' )
            // InternalReactionRules.g:4727:2: '['
            {
             before(grammarAccess.getBidirectionalRuleAccess().getLeftSquareBracketKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBidirectionalRuleAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__Group__4__Impl"


    // $ANTLR start "rule__BidirectionalRule__Group__5"
    // InternalReactionRules.g:4736:1: rule__BidirectionalRule__Group__5 : rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6 ;
    public final void rule__BidirectionalRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4740:1: ( rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6 )
            // InternalReactionRules.g:4741:2: rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__BidirectionalRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BidirectionalRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__Group__5"


    // $ANTLR start "rule__BidirectionalRule__Group__5__Impl"
    // InternalReactionRules.g:4748:1: rule__BidirectionalRule__Group__5__Impl : ( ( rule__BidirectionalRule__VariablesAssignment_5 ) ) ;
    public final void rule__BidirectionalRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4752:1: ( ( ( rule__BidirectionalRule__VariablesAssignment_5 ) ) )
            // InternalReactionRules.g:4753:1: ( ( rule__BidirectionalRule__VariablesAssignment_5 ) )
            {
            // InternalReactionRules.g:4753:1: ( ( rule__BidirectionalRule__VariablesAssignment_5 ) )
            // InternalReactionRules.g:4754:2: ( rule__BidirectionalRule__VariablesAssignment_5 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getVariablesAssignment_5()); 
            // InternalReactionRules.g:4755:2: ( rule__BidirectionalRule__VariablesAssignment_5 )
            // InternalReactionRules.g:4755:3: rule__BidirectionalRule__VariablesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BidirectionalRule__VariablesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBidirectionalRuleAccess().getVariablesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__Group__5__Impl"


    // $ANTLR start "rule__BidirectionalRule__Group__6"
    // InternalReactionRules.g:4763:1: rule__BidirectionalRule__Group__6 : rule__BidirectionalRule__Group__6__Impl ;
    public final void rule__BidirectionalRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4767:1: ( rule__BidirectionalRule__Group__6__Impl )
            // InternalReactionRules.g:4768:2: rule__BidirectionalRule__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BidirectionalRule__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__Group__6"


    // $ANTLR start "rule__BidirectionalRule__Group__6__Impl"
    // InternalReactionRules.g:4774:1: rule__BidirectionalRule__Group__6__Impl : ( ']' ) ;
    public final void rule__BidirectionalRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4778:1: ( ( ']' ) )
            // InternalReactionRules.g:4779:1: ( ']' )
            {
            // InternalReactionRules.g:4779:1: ( ']' )
            // InternalReactionRules.g:4780:2: ']'
            {
             before(grammarAccess.getBidirectionalRuleAccess().getRightSquareBracketKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBidirectionalRuleAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalReactionRules.g:4790:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4794:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalReactionRules.g:4795:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalReactionRules.g:4802:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4806:1: ( ( 'rule' ) )
            // InternalReactionRules.g:4807:1: ( 'rule' )
            {
            // InternalReactionRules.g:4807:1: ( 'rule' )
            // InternalReactionRules.g:4808:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalReactionRules.g:4817:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4821:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalReactionRules.g:4822:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalReactionRules.g:4829:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4833:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalReactionRules.g:4834:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:4834:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalReactionRules.g:4835:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:4836:2: ( rule__Rule__NameAssignment_1 )
            // InternalReactionRules.g:4836:3: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalReactionRules.g:4844:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4848:1: ( rule__Rule__Group__2__Impl )
            // InternalReactionRules.g:4849:2: rule__Rule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalReactionRules.g:4855:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__RuleAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4859:1: ( ( ( rule__Rule__RuleAssignment_2 ) ) )
            // InternalReactionRules.g:4860:1: ( ( rule__Rule__RuleAssignment_2 ) )
            {
            // InternalReactionRules.g:4860:1: ( ( rule__Rule__RuleAssignment_2 ) )
            // InternalReactionRules.g:4861:2: ( rule__Rule__RuleAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getRuleAssignment_2()); 
            // InternalReactionRules.g:4862:2: ( rule__Rule__RuleAssignment_2 )
            // InternalReactionRules.g:4862:3: rule__Rule__RuleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__RuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getRuleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Iterations__Group__0"
    // InternalReactionRules.g:4871:1: rule__Iterations__Group__0 : rule__Iterations__Group__0__Impl rule__Iterations__Group__1 ;
    public final void rule__Iterations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4875:1: ( rule__Iterations__Group__0__Impl rule__Iterations__Group__1 )
            // InternalReactionRules.g:4876:2: rule__Iterations__Group__0__Impl rule__Iterations__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Iterations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iterations__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterations__Group__0"


    // $ANTLR start "rule__Iterations__Group__0__Impl"
    // InternalReactionRules.g:4883:1: rule__Iterations__Group__0__Impl : ( 'iterations' ) ;
    public final void rule__Iterations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4887:1: ( ( 'iterations' ) )
            // InternalReactionRules.g:4888:1: ( 'iterations' )
            {
            // InternalReactionRules.g:4888:1: ( 'iterations' )
            // InternalReactionRules.g:4889:2: 'iterations'
            {
             before(grammarAccess.getIterationsAccess().getIterationsKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getIterationsAccess().getIterationsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterations__Group__0__Impl"


    // $ANTLR start "rule__Iterations__Group__1"
    // InternalReactionRules.g:4898:1: rule__Iterations__Group__1 : rule__Iterations__Group__1__Impl rule__Iterations__Group__2 ;
    public final void rule__Iterations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4902:1: ( rule__Iterations__Group__1__Impl rule__Iterations__Group__2 )
            // InternalReactionRules.g:4903:2: rule__Iterations__Group__1__Impl rule__Iterations__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Iterations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iterations__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterations__Group__1"


    // $ANTLR start "rule__Iterations__Group__1__Impl"
    // InternalReactionRules.g:4910:1: rule__Iterations__Group__1__Impl : ( '=' ) ;
    public final void rule__Iterations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4914:1: ( ( '=' ) )
            // InternalReactionRules.g:4915:1: ( '=' )
            {
            // InternalReactionRules.g:4915:1: ( '=' )
            // InternalReactionRules.g:4916:2: '='
            {
             before(grammarAccess.getIterationsAccess().getEqualsSignKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getIterationsAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterations__Group__1__Impl"


    // $ANTLR start "rule__Iterations__Group__2"
    // InternalReactionRules.g:4925:1: rule__Iterations__Group__2 : rule__Iterations__Group__2__Impl ;
    public final void rule__Iterations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4929:1: ( rule__Iterations__Group__2__Impl )
            // InternalReactionRules.g:4930:2: rule__Iterations__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Iterations__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterations__Group__2"


    // $ANTLR start "rule__Iterations__Group__2__Impl"
    // InternalReactionRules.g:4936:1: rule__Iterations__Group__2__Impl : ( ( rule__Iterations__ValueAssignment_2 ) ) ;
    public final void rule__Iterations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4940:1: ( ( ( rule__Iterations__ValueAssignment_2 ) ) )
            // InternalReactionRules.g:4941:1: ( ( rule__Iterations__ValueAssignment_2 ) )
            {
            // InternalReactionRules.g:4941:1: ( ( rule__Iterations__ValueAssignment_2 ) )
            // InternalReactionRules.g:4942:2: ( rule__Iterations__ValueAssignment_2 )
            {
             before(grammarAccess.getIterationsAccess().getValueAssignment_2()); 
            // InternalReactionRules.g:4943:2: ( rule__Iterations__ValueAssignment_2 )
            // InternalReactionRules.g:4943:3: rule__Iterations__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Iterations__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIterationsAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterations__Group__2__Impl"


    // $ANTLR start "rule__Time__Group__0"
    // InternalReactionRules.g:4952:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4956:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalReactionRules.g:4957:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Time__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Time__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__0"


    // $ANTLR start "rule__Time__Group__0__Impl"
    // InternalReactionRules.g:4964:1: rule__Time__Group__0__Impl : ( 'time' ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4968:1: ( ( 'time' ) )
            // InternalReactionRules.g:4969:1: ( 'time' )
            {
            // InternalReactionRules.g:4969:1: ( 'time' )
            // InternalReactionRules.g:4970:2: 'time'
            {
             before(grammarAccess.getTimeAccess().getTimeKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getTimeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__0__Impl"


    // $ANTLR start "rule__Time__Group__1"
    // InternalReactionRules.g:4979:1: rule__Time__Group__1 : rule__Time__Group__1__Impl rule__Time__Group__2 ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4983:1: ( rule__Time__Group__1__Impl rule__Time__Group__2 )
            // InternalReactionRules.g:4984:2: rule__Time__Group__1__Impl rule__Time__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Time__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Time__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__1"


    // $ANTLR start "rule__Time__Group__1__Impl"
    // InternalReactionRules.g:4991:1: rule__Time__Group__1__Impl : ( '=' ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4995:1: ( ( '=' ) )
            // InternalReactionRules.g:4996:1: ( '=' )
            {
            // InternalReactionRules.g:4996:1: ( '=' )
            // InternalReactionRules.g:4997:2: '='
            {
             before(grammarAccess.getTimeAccess().getEqualsSignKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__1__Impl"


    // $ANTLR start "rule__Time__Group__2"
    // InternalReactionRules.g:5006:1: rule__Time__Group__2 : rule__Time__Group__2__Impl ;
    public final void rule__Time__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5010:1: ( rule__Time__Group__2__Impl )
            // InternalReactionRules.g:5011:2: rule__Time__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__2"


    // $ANTLR start "rule__Time__Group__2__Impl"
    // InternalReactionRules.g:5017:1: rule__Time__Group__2__Impl : ( ( rule__Time__ValueAssignment_2 ) ) ;
    public final void rule__Time__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5021:1: ( ( ( rule__Time__ValueAssignment_2 ) ) )
            // InternalReactionRules.g:5022:1: ( ( rule__Time__ValueAssignment_2 ) )
            {
            // InternalReactionRules.g:5022:1: ( ( rule__Time__ValueAssignment_2 ) )
            // InternalReactionRules.g:5023:2: ( rule__Time__ValueAssignment_2 )
            {
             before(grammarAccess.getTimeAccess().getValueAssignment_2()); 
            // InternalReactionRules.g:5024:2: ( rule__Time__ValueAssignment_2 )
            // InternalReactionRules.g:5024:3: rule__Time__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Time__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__2__Impl"


    // $ANTLR start "rule__Population__Group__0"
    // InternalReactionRules.g:5033:1: rule__Population__Group__0 : rule__Population__Group__0__Impl rule__Population__Group__1 ;
    public final void rule__Population__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5037:1: ( rule__Population__Group__0__Impl rule__Population__Group__1 )
            // InternalReactionRules.g:5038:2: rule__Population__Group__0__Impl rule__Population__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Population__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Population__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Population__Group__0"


    // $ANTLR start "rule__Population__Group__0__Impl"
    // InternalReactionRules.g:5045:1: rule__Population__Group__0__Impl : ( '|' ) ;
    public final void rule__Population__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5049:1: ( ( '|' ) )
            // InternalReactionRules.g:5050:1: ( '|' )
            {
            // InternalReactionRules.g:5050:1: ( '|' )
            // InternalReactionRules.g:5051:2: '|'
            {
             before(grammarAccess.getPopulationAccess().getVerticalLineKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPopulationAccess().getVerticalLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Population__Group__0__Impl"


    // $ANTLR start "rule__Population__Group__1"
    // InternalReactionRules.g:5060:1: rule__Population__Group__1 : rule__Population__Group__1__Impl rule__Population__Group__2 ;
    public final void rule__Population__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5064:1: ( rule__Population__Group__1__Impl rule__Population__Group__2 )
            // InternalReactionRules.g:5065:2: rule__Population__Group__1__Impl rule__Population__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Population__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Population__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Population__Group__1"


    // $ANTLR start "rule__Population__Group__1__Impl"
    // InternalReactionRules.g:5072:1: rule__Population__Group__1__Impl : ( ( rule__Population__PaAssignment_1 ) ) ;
    public final void rule__Population__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5076:1: ( ( ( rule__Population__PaAssignment_1 ) ) )
            // InternalReactionRules.g:5077:1: ( ( rule__Population__PaAssignment_1 ) )
            {
            // InternalReactionRules.g:5077:1: ( ( rule__Population__PaAssignment_1 ) )
            // InternalReactionRules.g:5078:2: ( rule__Population__PaAssignment_1 )
            {
             before(grammarAccess.getPopulationAccess().getPaAssignment_1()); 
            // InternalReactionRules.g:5079:2: ( rule__Population__PaAssignment_1 )
            // InternalReactionRules.g:5079:3: rule__Population__PaAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Population__PaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPopulationAccess().getPaAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Population__Group__1__Impl"


    // $ANTLR start "rule__Population__Group__2"
    // InternalReactionRules.g:5087:1: rule__Population__Group__2 : rule__Population__Group__2__Impl rule__Population__Group__3 ;
    public final void rule__Population__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5091:1: ( rule__Population__Group__2__Impl rule__Population__Group__3 )
            // InternalReactionRules.g:5092:2: rule__Population__Group__2__Impl rule__Population__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Population__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Population__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Population__Group__2"


    // $ANTLR start "rule__Population__Group__2__Impl"
    // InternalReactionRules.g:5099:1: rule__Population__Group__2__Impl : ( '|' ) ;
    public final void rule__Population__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5103:1: ( ( '|' ) )
            // InternalReactionRules.g:5104:1: ( '|' )
            {
            // InternalReactionRules.g:5104:1: ( '|' )
            // InternalReactionRules.g:5105:2: '|'
            {
             before(grammarAccess.getPopulationAccess().getVerticalLineKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPopulationAccess().getVerticalLineKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Population__Group__2__Impl"


    // $ANTLR start "rule__Population__Group__3"
    // InternalReactionRules.g:5114:1: rule__Population__Group__3 : rule__Population__Group__3__Impl rule__Population__Group__4 ;
    public final void rule__Population__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5118:1: ( rule__Population__Group__3__Impl rule__Population__Group__4 )
            // InternalReactionRules.g:5119:2: rule__Population__Group__3__Impl rule__Population__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Population__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Population__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Population__Group__3"


    // $ANTLR start "rule__Population__Group__3__Impl"
    // InternalReactionRules.g:5126:1: rule__Population__Group__3__Impl : ( '==>' ) ;
    public final void rule__Population__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5130:1: ( ( '==>' ) )
            // InternalReactionRules.g:5131:1: ( '==>' )
            {
            // InternalReactionRules.g:5131:1: ( '==>' )
            // InternalReactionRules.g:5132:2: '==>'
            {
             before(grammarAccess.getPopulationAccess().getEqualsSignEqualsSignGreaterThanSignKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPopulationAccess().getEqualsSignEqualsSignGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Population__Group__3__Impl"


    // $ANTLR start "rule__Population__Group__4"
    // InternalReactionRules.g:5141:1: rule__Population__Group__4 : rule__Population__Group__4__Impl ;
    public final void rule__Population__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5145:1: ( rule__Population__Group__4__Impl )
            // InternalReactionRules.g:5146:2: rule__Population__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Population__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Population__Group__4"


    // $ANTLR start "rule__Population__Group__4__Impl"
    // InternalReactionRules.g:5152:1: rule__Population__Group__4__Impl : ( ( rule__Population__ValueAssignment_4 ) ) ;
    public final void rule__Population__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5156:1: ( ( ( rule__Population__ValueAssignment_4 ) ) )
            // InternalReactionRules.g:5157:1: ( ( rule__Population__ValueAssignment_4 ) )
            {
            // InternalReactionRules.g:5157:1: ( ( rule__Population__ValueAssignment_4 ) )
            // InternalReactionRules.g:5158:2: ( rule__Population__ValueAssignment_4 )
            {
             before(grammarAccess.getPopulationAccess().getValueAssignment_4()); 
            // InternalReactionRules.g:5159:2: ( rule__Population__ValueAssignment_4 )
            // InternalReactionRules.g:5159:3: rule__Population__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Population__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPopulationAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Population__Group__4__Impl"


    // $ANTLR start "rule__Terminate__Group__0"
    // InternalReactionRules.g:5168:1: rule__Terminate__Group__0 : rule__Terminate__Group__0__Impl rule__Terminate__Group__1 ;
    public final void rule__Terminate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5172:1: ( rule__Terminate__Group__0__Impl rule__Terminate__Group__1 )
            // InternalReactionRules.g:5173:2: rule__Terminate__Group__0__Impl rule__Terminate__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Terminate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminate__Group__0"


    // $ANTLR start "rule__Terminate__Group__0__Impl"
    // InternalReactionRules.g:5180:1: rule__Terminate__Group__0__Impl : ( 'terminate' ) ;
    public final void rule__Terminate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5184:1: ( ( 'terminate' ) )
            // InternalReactionRules.g:5185:1: ( 'terminate' )
            {
            // InternalReactionRules.g:5185:1: ( 'terminate' )
            // InternalReactionRules.g:5186:2: 'terminate'
            {
             before(grammarAccess.getTerminateAccess().getTerminateKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTerminateAccess().getTerminateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminate__Group__0__Impl"


    // $ANTLR start "rule__Terminate__Group__1"
    // InternalReactionRules.g:5195:1: rule__Terminate__Group__1 : rule__Terminate__Group__1__Impl rule__Terminate__Group__2 ;
    public final void rule__Terminate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5199:1: ( rule__Terminate__Group__1__Impl rule__Terminate__Group__2 )
            // InternalReactionRules.g:5200:2: rule__Terminate__Group__1__Impl rule__Terminate__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Terminate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminate__Group__1"


    // $ANTLR start "rule__Terminate__Group__1__Impl"
    // InternalReactionRules.g:5207:1: rule__Terminate__Group__1__Impl : ( ( rule__Terminate__NameAssignment_1 ) ) ;
    public final void rule__Terminate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5211:1: ( ( ( rule__Terminate__NameAssignment_1 ) ) )
            // InternalReactionRules.g:5212:1: ( ( rule__Terminate__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:5212:1: ( ( rule__Terminate__NameAssignment_1 ) )
            // InternalReactionRules.g:5213:2: ( rule__Terminate__NameAssignment_1 )
            {
             before(grammarAccess.getTerminateAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:5214:2: ( rule__Terminate__NameAssignment_1 )
            // InternalReactionRules.g:5214:3: rule__Terminate__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Terminate__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminate__Group__1__Impl"


    // $ANTLR start "rule__Terminate__Group__2"
    // InternalReactionRules.g:5222:1: rule__Terminate__Group__2 : rule__Terminate__Group__2__Impl ;
    public final void rule__Terminate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5226:1: ( rule__Terminate__Group__2__Impl )
            // InternalReactionRules.g:5227:2: rule__Terminate__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terminate__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminate__Group__2"


    // $ANTLR start "rule__Terminate__Group__2__Impl"
    // InternalReactionRules.g:5233:1: rule__Terminate__Group__2__Impl : ( ( rule__Terminate__ConditionAssignment_2 ) ) ;
    public final void rule__Terminate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5237:1: ( ( ( rule__Terminate__ConditionAssignment_2 ) ) )
            // InternalReactionRules.g:5238:1: ( ( rule__Terminate__ConditionAssignment_2 ) )
            {
            // InternalReactionRules.g:5238:1: ( ( rule__Terminate__ConditionAssignment_2 ) )
            // InternalReactionRules.g:5239:2: ( rule__Terminate__ConditionAssignment_2 )
            {
             before(grammarAccess.getTerminateAccess().getConditionAssignment_2()); 
            // InternalReactionRules.g:5240:2: ( rule__Terminate__ConditionAssignment_2 )
            // InternalReactionRules.g:5240:3: rule__Terminate__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Terminate__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminateAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminate__Group__2__Impl"


    // $ANTLR start "rule__ReactionRuleModel__ModelAssignment_0"
    // InternalReactionRules.g:5249:1: rule__ReactionRuleModel__ModelAssignment_0 : ( ruleModel ) ;
    public final void rule__ReactionRuleModel__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5253:1: ( ( ruleModel ) )
            // InternalReactionRules.g:5254:2: ( ruleModel )
            {
            // InternalReactionRules.g:5254:2: ( ruleModel )
            // InternalReactionRules.g:5255:3: ruleModel
            {
             before(grammarAccess.getReactionRuleModelAccess().getModelModelParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getReactionRuleModelAccess().getModelModelParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionRuleModel__ModelAssignment_0"


    // $ANTLR start "rule__ReactionRuleModel__ReactionPropertiesAssignment_1"
    // InternalReactionRules.g:5264:1: rule__ReactionRuleModel__ReactionPropertiesAssignment_1 : ( ruleReactionProperty ) ;
    public final void rule__ReactionRuleModel__ReactionPropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5268:1: ( ( ruleReactionProperty ) )
            // InternalReactionRules.g:5269:2: ( ruleReactionProperty )
            {
            // InternalReactionRules.g:5269:2: ( ruleReactionProperty )
            // InternalReactionRules.g:5270:3: ruleReactionProperty
            {
             before(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesReactionPropertyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReactionProperty();

            state._fsp--;

             after(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesReactionPropertyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionRuleModel__ReactionPropertiesAssignment_1"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalReactionRules.g:5279:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5283:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5284:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5284:2: ( RULE_ID )
            // InternalReactionRules.g:5285:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__ArithmeticValue__ValueAssignment"
    // InternalReactionRules.g:5294:1: rule__ArithmeticValue__ValueAssignment : ( ruleArithmeticType ) ;
    public final void rule__ArithmeticValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5298:1: ( ( ruleArithmeticType ) )
            // InternalReactionRules.g:5299:2: ( ruleArithmeticType )
            {
            // InternalReactionRules.g:5299:2: ( ruleArithmeticType )
            // InternalReactionRules.g:5300:3: ruleArithmeticType
            {
             before(grammarAccess.getArithmeticValueAccess().getValueArithmeticTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticType();

            state._fsp--;

             after(grammarAccess.getArithmeticValueAccess().getValueArithmeticTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticValue__ValueAssignment"


    // $ANTLR start "rule__State__NameAssignment"
    // InternalReactionRules.g:5309:1: rule__State__NameAssignment : ( RULE_ID ) ;
    public final void rule__State__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5313:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5314:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5314:2: ( RULE_ID )
            // InternalReactionRules.g:5315:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment"


    // $ANTLR start "rule__States__StateAssignment_1_1"
    // InternalReactionRules.g:5324:1: rule__States__StateAssignment_1_1 : ( ruleState ) ;
    public final void rule__States__StateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5328:1: ( ( ruleState ) )
            // InternalReactionRules.g:5329:2: ( ruleState )
            {
            // InternalReactionRules.g:5329:2: ( ruleState )
            // InternalReactionRules.g:5330:3: ruleState
            {
             before(grammarAccess.getStatesAccess().getStateStateParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStatesAccess().getStateStateParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__StateAssignment_1_1"


    // $ANTLR start "rule__States__StateAssignment_1_2_1"
    // InternalReactionRules.g:5339:1: rule__States__StateAssignment_1_2_1 : ( ruleState ) ;
    public final void rule__States__StateAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5343:1: ( ( ruleState ) )
            // InternalReactionRules.g:5344:2: ( ruleState )
            {
            // InternalReactionRules.g:5344:2: ( ruleState )
            // InternalReactionRules.g:5345:3: ruleState
            {
             before(grammarAccess.getStatesAccess().getStateStateParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStatesAccess().getStateStateParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__StateAssignment_1_2_1"


    // $ANTLR start "rule__Site__NameAssignment_0"
    // InternalReactionRules.g:5354:1: rule__Site__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Site__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5358:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5359:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5359:2: ( RULE_ID )
            // InternalReactionRules.g:5360:3: RULE_ID
            {
             before(grammarAccess.getSiteAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSiteAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__NameAssignment_0"


    // $ANTLR start "rule__Site__StatesAssignment_1"
    // InternalReactionRules.g:5369:1: rule__Site__StatesAssignment_1 : ( ruleStates ) ;
    public final void rule__Site__StatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5373:1: ( ( ruleStates ) )
            // InternalReactionRules.g:5374:2: ( ruleStates )
            {
            // InternalReactionRules.g:5374:2: ( ruleStates )
            // InternalReactionRules.g:5375:3: ruleStates
            {
             before(grammarAccess.getSiteAccess().getStatesStatesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStates();

            state._fsp--;

             after(grammarAccess.getSiteAccess().getStatesStatesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__StatesAssignment_1"


    // $ANTLR start "rule__Sites__SitesAssignment_1_1"
    // InternalReactionRules.g:5384:1: rule__Sites__SitesAssignment_1_1 : ( ruleSite ) ;
    public final void rule__Sites__SitesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5388:1: ( ( ruleSite ) )
            // InternalReactionRules.g:5389:2: ( ruleSite )
            {
            // InternalReactionRules.g:5389:2: ( ruleSite )
            // InternalReactionRules.g:5390:3: ruleSite
            {
             before(grammarAccess.getSitesAccess().getSitesSiteParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSite();

            state._fsp--;

             after(grammarAccess.getSitesAccess().getSitesSiteParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__SitesAssignment_1_1"


    // $ANTLR start "rule__Sites__SitesAssignment_1_2_1"
    // InternalReactionRules.g:5399:1: rule__Sites__SitesAssignment_1_2_1 : ( ruleSite ) ;
    public final void rule__Sites__SitesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5403:1: ( ( ruleSite ) )
            // InternalReactionRules.g:5404:2: ( ruleSite )
            {
            // InternalReactionRules.g:5404:2: ( ruleSite )
            // InternalReactionRules.g:5405:3: ruleSite
            {
             before(grammarAccess.getSitesAccess().getSitesSiteParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSite();

            state._fsp--;

             after(grammarAccess.getSitesAccess().getSitesSiteParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sites__SitesAssignment_1_2_1"


    // $ANTLR start "rule__Agent__NameAssignment_1"
    // InternalReactionRules.g:5414:1: rule__Agent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5418:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5419:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5419:2: ( RULE_ID )
            // InternalReactionRules.g:5420:3: RULE_ID
            {
             before(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__NameAssignment_1"


    // $ANTLR start "rule__Agent__SitesAssignment_2"
    // InternalReactionRules.g:5429:1: rule__Agent__SitesAssignment_2 : ( ruleSites ) ;
    public final void rule__Agent__SitesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5433:1: ( ( ruleSites ) )
            // InternalReactionRules.g:5434:2: ( ruleSites )
            {
            // InternalReactionRules.g:5434:2: ( ruleSites )
            // InternalReactionRules.g:5435:3: ruleSites
            {
             before(grammarAccess.getAgentAccess().getSitesSitesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSites();

            state._fsp--;

             after(grammarAccess.getAgentAccess().getSitesSitesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__SitesAssignment_2"


    // $ANTLR start "rule__PatternVariable__NameAssignment_1"
    // InternalReactionRules.g:5444:1: rule__PatternVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PatternVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5448:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5449:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5449:2: ( RULE_ID )
            // InternalReactionRules.g:5450:3: RULE_ID
            {
             before(grammarAccess.getPatternVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__NameAssignment_1"


    // $ANTLR start "rule__PatternVariable__PatternAssignment_3"
    // InternalReactionRules.g:5459:1: rule__PatternVariable__PatternAssignment_3 : ( rulePattern ) ;
    public final void rule__PatternVariable__PatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5463:1: ( ( rulePattern ) )
            // InternalReactionRules.g:5464:2: ( rulePattern )
            {
            // InternalReactionRules.g:5464:2: ( rulePattern )
            // InternalReactionRules.g:5465:3: rulePattern
            {
             before(grammarAccess.getPatternVariableAccess().getPatternPatternParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternVariableAccess().getPatternPatternParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__PatternAssignment_3"


    // $ANTLR start "rule__ArithmeticVariable__NameAssignment_1"
    // InternalReactionRules.g:5474:1: rule__ArithmeticVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ArithmeticVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5478:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5479:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5479:2: ( RULE_ID )
            // InternalReactionRules.g:5480:3: RULE_ID
            {
             before(grammarAccess.getArithmeticVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArithmeticVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticVariable__NameAssignment_1"


    // $ANTLR start "rule__ArithmeticVariable__ValueAssignment_3"
    // InternalReactionRules.g:5489:1: rule__ArithmeticVariable__ValueAssignment_3 : ( ruleArithmeticValue ) ;
    public final void rule__ArithmeticVariable__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5493:1: ( ( ruleArithmeticValue ) )
            // InternalReactionRules.g:5494:2: ( ruleArithmeticValue )
            {
            // InternalReactionRules.g:5494:2: ( ruleArithmeticValue )
            // InternalReactionRules.g:5495:3: ruleArithmeticValue
            {
             before(grammarAccess.getArithmeticVariableAccess().getValueArithmeticValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticValue();

            state._fsp--;

             after(grammarAccess.getArithmeticVariableAccess().getValueArithmeticValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticVariable__ValueAssignment_3"


    // $ANTLR start "rule__BoundAnyLink__NameAssignment_1"
    // InternalReactionRules.g:5504:1: rule__BoundAnyLink__NameAssignment_1 : ( RULE_BOUND_LINK ) ;
    public final void rule__BoundAnyLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5508:1: ( ( RULE_BOUND_LINK ) )
            // InternalReactionRules.g:5509:2: ( RULE_BOUND_LINK )
            {
            // InternalReactionRules.g:5509:2: ( RULE_BOUND_LINK )
            // InternalReactionRules.g:5510:3: RULE_BOUND_LINK
            {
             before(grammarAccess.getBoundAnyLinkAccess().getNameBOUND_LINKTerminalRuleCall_1_0()); 
            match(input,RULE_BOUND_LINK,FOLLOW_2); 
             after(grammarAccess.getBoundAnyLinkAccess().getNameBOUND_LINKTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyLink__NameAssignment_1"


    // $ANTLR start "rule__FreeLink__NameAssignment_1"
    // InternalReactionRules.g:5519:1: rule__FreeLink__NameAssignment_1 : ( RULE_FREE_LINK ) ;
    public final void rule__FreeLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5523:1: ( ( RULE_FREE_LINK ) )
            // InternalReactionRules.g:5524:2: ( RULE_FREE_LINK )
            {
            // InternalReactionRules.g:5524:2: ( RULE_FREE_LINK )
            // InternalReactionRules.g:5525:3: RULE_FREE_LINK
            {
             before(grammarAccess.getFreeLinkAccess().getNameFREE_LINKTerminalRuleCall_1_0()); 
            match(input,RULE_FREE_LINK,FOLLOW_2); 
             after(grammarAccess.getFreeLinkAccess().getNameFREE_LINKTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeLink__NameAssignment_1"


    // $ANTLR start "rule__WhatEver__NameAssignment_1"
    // InternalReactionRules.g:5534:1: rule__WhatEver__NameAssignment_1 : ( RULE_WHATEVER_LINK ) ;
    public final void rule__WhatEver__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5538:1: ( ( RULE_WHATEVER_LINK ) )
            // InternalReactionRules.g:5539:2: ( RULE_WHATEVER_LINK )
            {
            // InternalReactionRules.g:5539:2: ( RULE_WHATEVER_LINK )
            // InternalReactionRules.g:5540:3: RULE_WHATEVER_LINK
            {
             before(grammarAccess.getWhatEverAccess().getNameWHATEVER_LINKTerminalRuleCall_1_0()); 
            match(input,RULE_WHATEVER_LINK,FOLLOW_2); 
             after(grammarAccess.getWhatEverAccess().getNameWHATEVER_LINKTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatEver__NameAssignment_1"


    // $ANTLR start "rule__BoundLink__StateAssignment_1"
    // InternalReactionRules.g:5549:1: rule__BoundLink__StateAssignment_1 : ( ruleUnsignedInteger ) ;
    public final void rule__BoundLink__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5553:1: ( ( ruleUnsignedInteger ) )
            // InternalReactionRules.g:5554:2: ( ruleUnsignedInteger )
            {
            // InternalReactionRules.g:5554:2: ( ruleUnsignedInteger )
            // InternalReactionRules.g:5555:3: ruleUnsignedInteger
            {
             before(grammarAccess.getBoundLinkAccess().getStateUnsignedIntegerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsignedInteger();

            state._fsp--;

             after(grammarAccess.getBoundLinkAccess().getStateUnsignedIntegerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundLink__StateAssignment_1"


    // $ANTLR start "rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1"
    // InternalReactionRules.g:5564:1: rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5568:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5569:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5569:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5570:3: ( RULE_ID )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getAgentAgentCrossReference_1_0()); 
            // InternalReactionRules.g:5571:3: ( RULE_ID )
            // InternalReactionRules.g:5572:4: RULE_ID
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getAgentAgentIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getAgentAgentIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getAgentAgentCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1"


    // $ANTLR start "rule__BoundAnyOfTypeLinkSite__SiteAssignment_1"
    // InternalReactionRules.g:5583:1: rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__BoundAnyOfTypeLinkSite__SiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5587:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5588:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5588:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5589:3: ( RULE_ID )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getSiteSiteCrossReference_1_0()); 
            // InternalReactionRules.g:5590:3: ( RULE_ID )
            // InternalReactionRules.g:5591:4: RULE_ID
            {
             before(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getSiteSiteIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getSiteSiteIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getSiteSiteCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLinkSite__SiteAssignment_1"


    // $ANTLR start "rule__BoundAnyOfTypeLink__LinkAgentAssignment_1"
    // InternalReactionRules.g:5602:1: rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 : ( ruleBoundAnyOfTypeLinkAgent ) ;
    public final void rule__BoundAnyOfTypeLink__LinkAgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5606:1: ( ( ruleBoundAnyOfTypeLinkAgent ) )
            // InternalReactionRules.g:5607:2: ( ruleBoundAnyOfTypeLinkAgent )
            {
            // InternalReactionRules.g:5607:2: ( ruleBoundAnyOfTypeLinkAgent )
            // InternalReactionRules.g:5608:3: ruleBoundAnyOfTypeLinkAgent
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAccess().getLinkAgentBoundAnyOfTypeLinkAgentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBoundAnyOfTypeLinkAgent();

            state._fsp--;

             after(grammarAccess.getBoundAnyOfTypeLinkAccess().getLinkAgentBoundAnyOfTypeLinkAgentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLink__LinkAgentAssignment_1"


    // $ANTLR start "rule__BoundAnyOfTypeLink__LinkSiteAssignment_3"
    // InternalReactionRules.g:5617:1: rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 : ( ruleBoundAnyOfTypeLinkSite ) ;
    public final void rule__BoundAnyOfTypeLink__LinkSiteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5621:1: ( ( ruleBoundAnyOfTypeLinkSite ) )
            // InternalReactionRules.g:5622:2: ( ruleBoundAnyOfTypeLinkSite )
            {
            // InternalReactionRules.g:5622:2: ( ruleBoundAnyOfTypeLinkSite )
            // InternalReactionRules.g:5623:3: ruleBoundAnyOfTypeLinkSite
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAccess().getLinkSiteBoundAnyOfTypeLinkSiteParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBoundAnyOfTypeLinkSite();

            state._fsp--;

             after(grammarAccess.getBoundAnyOfTypeLinkAccess().getLinkSiteBoundAnyOfTypeLinkSiteParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAnyOfTypeLink__LinkSiteAssignment_3"


    // $ANTLR start "rule__SiteState__StateAssignment_2"
    // InternalReactionRules.g:5632:1: rule__SiteState__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SiteState__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5636:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5637:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5637:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5638:3: ( RULE_ID )
            {
             before(grammarAccess.getSiteStateAccess().getStateStateCrossReference_2_0()); 
            // InternalReactionRules.g:5639:3: ( RULE_ID )
            // InternalReactionRules.g:5640:4: RULE_ID
            {
             before(grammarAccess.getSiteStateAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSiteStateAccess().getStateStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSiteStateAccess().getStateStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteState__StateAssignment_2"


    // $ANTLR start "rule__LinkState__LinkStateAssignment_2"
    // InternalReactionRules.g:5651:1: rule__LinkState__LinkStateAssignment_2 : ( ( rule__LinkState__LinkStateAlternatives_2_0 ) ) ;
    public final void rule__LinkState__LinkStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5655:1: ( ( ( rule__LinkState__LinkStateAlternatives_2_0 ) ) )
            // InternalReactionRules.g:5656:2: ( ( rule__LinkState__LinkStateAlternatives_2_0 ) )
            {
            // InternalReactionRules.g:5656:2: ( ( rule__LinkState__LinkStateAlternatives_2_0 ) )
            // InternalReactionRules.g:5657:3: ( rule__LinkState__LinkStateAlternatives_2_0 )
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAlternatives_2_0()); 
            // InternalReactionRules.g:5658:3: ( rule__LinkState__LinkStateAlternatives_2_0 )
            // InternalReactionRules.g:5658:4: rule__LinkState__LinkStateAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__LinkState__LinkStateAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLinkStateAccess().getLinkStateAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkState__LinkStateAssignment_2"


    // $ANTLR start "rule__SitePattern__SiteAssignment_1"
    // InternalReactionRules.g:5666:1: rule__SitePattern__SiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SitePattern__SiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5670:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5671:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5671:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5672:3: ( RULE_ID )
            {
             before(grammarAccess.getSitePatternAccess().getSiteSiteCrossReference_1_0()); 
            // InternalReactionRules.g:5673:3: ( RULE_ID )
            // InternalReactionRules.g:5674:4: RULE_ID
            {
             before(grammarAccess.getSitePatternAccess().getSiteSiteIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSitePatternAccess().getSiteSiteIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSitePatternAccess().getSiteSiteCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__SiteAssignment_1"


    // $ANTLR start "rule__SitePattern__StateAssignment_2"
    // InternalReactionRules.g:5685:1: rule__SitePattern__StateAssignment_2 : ( ruleSiteState ) ;
    public final void rule__SitePattern__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5689:1: ( ( ruleSiteState ) )
            // InternalReactionRules.g:5690:2: ( ruleSiteState )
            {
            // InternalReactionRules.g:5690:2: ( ruleSiteState )
            // InternalReactionRules.g:5691:3: ruleSiteState
            {
             before(grammarAccess.getSitePatternAccess().getStateSiteStateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSiteState();

            state._fsp--;

             after(grammarAccess.getSitePatternAccess().getStateSiteStateParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__StateAssignment_2"


    // $ANTLR start "rule__SitePattern__LinkStateAssignment_3"
    // InternalReactionRules.g:5700:1: rule__SitePattern__LinkStateAssignment_3 : ( ruleLinkState ) ;
    public final void rule__SitePattern__LinkStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5704:1: ( ( ruleLinkState ) )
            // InternalReactionRules.g:5705:2: ( ruleLinkState )
            {
            // InternalReactionRules.g:5705:2: ( ruleLinkState )
            // InternalReactionRules.g:5706:3: ruleLinkState
            {
             before(grammarAccess.getSitePatternAccess().getLinkStateLinkStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLinkState();

            state._fsp--;

             after(grammarAccess.getSitePatternAccess().getLinkStateLinkStateParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__LinkStateAssignment_3"


    // $ANTLR start "rule__SitePatterns__SitePatternsAssignment_2_0"
    // InternalReactionRules.g:5715:1: rule__SitePatterns__SitePatternsAssignment_2_0 : ( ruleSitePattern ) ;
    public final void rule__SitePatterns__SitePatternsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5719:1: ( ( ruleSitePattern ) )
            // InternalReactionRules.g:5720:2: ( ruleSitePattern )
            {
            // InternalReactionRules.g:5720:2: ( ruleSitePattern )
            // InternalReactionRules.g:5721:3: ruleSitePattern
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsSitePatternParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSitePattern();

            state._fsp--;

             after(grammarAccess.getSitePatternsAccess().getSitePatternsSitePatternParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__SitePatternsAssignment_2_0"


    // $ANTLR start "rule__SitePatterns__SitePatternsAssignment_2_1_1"
    // InternalReactionRules.g:5730:1: rule__SitePatterns__SitePatternsAssignment_2_1_1 : ( ruleSitePattern ) ;
    public final void rule__SitePatterns__SitePatternsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5734:1: ( ( ruleSitePattern ) )
            // InternalReactionRules.g:5735:2: ( ruleSitePattern )
            {
            // InternalReactionRules.g:5735:2: ( ruleSitePattern )
            // InternalReactionRules.g:5736:3: ruleSitePattern
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsSitePatternParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSitePattern();

            state._fsp--;

             after(grammarAccess.getSitePatternsAccess().getSitePatternsSitePatternParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__SitePatternsAssignment_2_1_1"


    // $ANTLR start "rule__ValidAgentPattern__AgentAssignment_1"
    // InternalReactionRules.g:5745:1: rule__ValidAgentPattern__AgentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ValidAgentPattern__AgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5749:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5750:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5750:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5751:3: ( RULE_ID )
            {
             before(grammarAccess.getValidAgentPatternAccess().getAgentAgentCrossReference_1_0()); 
            // InternalReactionRules.g:5752:3: ( RULE_ID )
            // InternalReactionRules.g:5753:4: RULE_ID
            {
             before(grammarAccess.getValidAgentPatternAccess().getAgentAgentIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValidAgentPatternAccess().getAgentAgentIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getValidAgentPatternAccess().getAgentAgentCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidAgentPattern__AgentAssignment_1"


    // $ANTLR start "rule__ValidAgentPattern__SitePatternsAssignment_2"
    // InternalReactionRules.g:5764:1: rule__ValidAgentPattern__SitePatternsAssignment_2 : ( ruleSitePatterns ) ;
    public final void rule__ValidAgentPattern__SitePatternsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5768:1: ( ( ruleSitePatterns ) )
            // InternalReactionRules.g:5769:2: ( ruleSitePatterns )
            {
            // InternalReactionRules.g:5769:2: ( ruleSitePatterns )
            // InternalReactionRules.g:5770:3: ruleSitePatterns
            {
             before(grammarAccess.getValidAgentPatternAccess().getSitePatternsSitePatternsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSitePatterns();

            state._fsp--;

             after(grammarAccess.getValidAgentPatternAccess().getSitePatternsSitePatternsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidAgentPattern__SitePatternsAssignment_2"


    // $ANTLR start "rule__VoidAgentPattern__PatternAssignment"
    // InternalReactionRules.g:5779:1: rule__VoidAgentPattern__PatternAssignment : ( RULE_VOID_PATTERN ) ;
    public final void rule__VoidAgentPattern__PatternAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5783:1: ( ( RULE_VOID_PATTERN ) )
            // InternalReactionRules.g:5784:2: ( RULE_VOID_PATTERN )
            {
            // InternalReactionRules.g:5784:2: ( RULE_VOID_PATTERN )
            // InternalReactionRules.g:5785:3: RULE_VOID_PATTERN
            {
             before(grammarAccess.getVoidAgentPatternAccess().getPatternVOID_PATTERNTerminalRuleCall_0()); 
            match(input,RULE_VOID_PATTERN,FOLLOW_2); 
             after(grammarAccess.getVoidAgentPatternAccess().getPatternVOID_PATTERNTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidAgentPattern__PatternAssignment"


    // $ANTLR start "rule__Pattern__AgentPatternsAssignment_2_0"
    // InternalReactionRules.g:5794:1: rule__Pattern__AgentPatternsAssignment_2_0 : ( ruleAgentPattern ) ;
    public final void rule__Pattern__AgentPatternsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5798:1: ( ( ruleAgentPattern ) )
            // InternalReactionRules.g:5799:2: ( ruleAgentPattern )
            {
            // InternalReactionRules.g:5799:2: ( ruleAgentPattern )
            // InternalReactionRules.g:5800:3: ruleAgentPattern
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAgentPatternParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAgentPattern();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getAgentPatternsAgentPatternParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__AgentPatternsAssignment_2_0"


    // $ANTLR start "rule__Pattern__AgentPatternsAssignment_2_1_1"
    // InternalReactionRules.g:5809:1: rule__Pattern__AgentPatternsAssignment_2_1_1 : ( ruleAgentPattern ) ;
    public final void rule__Pattern__AgentPatternsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5813:1: ( ( ruleAgentPattern ) )
            // InternalReactionRules.g:5814:2: ( ruleAgentPattern )
            {
            // InternalReactionRules.g:5814:2: ( ruleAgentPattern )
            // InternalReactionRules.g:5815:3: ruleAgentPattern
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAgentPatternParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAgentPattern();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getAgentPatternsAgentPatternParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__AgentPatternsAssignment_2_1_1"


    // $ANTLR start "rule__Observation__NameAssignment_1"
    // InternalReactionRules.g:5824:1: rule__Observation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Observation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5828:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5829:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5829:2: ( RULE_ID )
            // InternalReactionRules.g:5830:3: RULE_ID
            {
             before(grammarAccess.getObservationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObservationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observation__NameAssignment_1"


    // $ANTLR start "rule__Observation__ObservationPatternAssignment_2"
    // InternalReactionRules.g:5839:1: rule__Observation__ObservationPatternAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__Observation__ObservationPatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5843:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:5844:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:5844:2: ( rulePatternAssignment )
            // InternalReactionRules.g:5845:3: rulePatternAssignment
            {
             before(grammarAccess.getObservationAccess().getObservationPatternPatternAssignmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePatternAssignment();

            state._fsp--;

             after(grammarAccess.getObservationAccess().getObservationPatternPatternAssignmentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observation__ObservationPatternAssignment_2"


    // $ANTLR start "rule__NumericFromLiteral__ValueAssignment"
    // InternalReactionRules.g:5854:1: rule__NumericFromLiteral__ValueAssignment : ( ruleArithmeticValue ) ;
    public final void rule__NumericFromLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5858:1: ( ( ruleArithmeticValue ) )
            // InternalReactionRules.g:5859:2: ( ruleArithmeticValue )
            {
            // InternalReactionRules.g:5859:2: ( ruleArithmeticValue )
            // InternalReactionRules.g:5860:3: ruleArithmeticValue
            {
             before(grammarAccess.getNumericFromLiteralAccess().getValueArithmeticValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticValue();

            state._fsp--;

             after(grammarAccess.getNumericFromLiteralAccess().getValueArithmeticValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericFromLiteral__ValueAssignment"


    // $ANTLR start "rule__NumericFromVariable__ValueVarAssignment"
    // InternalReactionRules.g:5869:1: rule__NumericFromVariable__ValueVarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NumericFromVariable__ValueVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5873:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5874:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5874:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5875:3: ( RULE_ID )
            {
             before(grammarAccess.getNumericFromVariableAccess().getValueVarArithmeticVariableCrossReference_0()); 
            // InternalReactionRules.g:5876:3: ( RULE_ID )
            // InternalReactionRules.g:5877:4: RULE_ID
            {
             before(grammarAccess.getNumericFromVariableAccess().getValueVarArithmeticVariableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNumericFromVariableAccess().getValueVarArithmeticVariableIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getNumericFromVariableAccess().getValueVarArithmeticVariableCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericFromVariable__ValueVarAssignment"


    // $ANTLR start "rule__Initial__NameAssignment_1"
    // InternalReactionRules.g:5888:1: rule__Initial__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Initial__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5892:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5893:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5893:2: ( RULE_ID )
            // InternalReactionRules.g:5894:3: RULE_ID
            {
             before(grammarAccess.getInitialAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__NameAssignment_1"


    // $ANTLR start "rule__Initial__CountAssignment_2"
    // InternalReactionRules.g:5903:1: rule__Initial__CountAssignment_2 : ( ruleNumericAssignment ) ;
    public final void rule__Initial__CountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5907:1: ( ( ruleNumericAssignment ) )
            // InternalReactionRules.g:5908:2: ( ruleNumericAssignment )
            {
            // InternalReactionRules.g:5908:2: ( ruleNumericAssignment )
            // InternalReactionRules.g:5909:3: ruleNumericAssignment
            {
             before(grammarAccess.getInitialAccess().getCountNumericAssignmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumericAssignment();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getCountNumericAssignmentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__CountAssignment_2"


    // $ANTLR start "rule__Initial__InitialPatternAssignment_3"
    // InternalReactionRules.g:5918:1: rule__Initial__InitialPatternAssignment_3 : ( rulePatternAssignment ) ;
    public final void rule__Initial__InitialPatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5922:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:5923:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:5923:2: ( rulePatternAssignment )
            // InternalReactionRules.g:5924:3: rulePatternAssignment
            {
             before(grammarAccess.getInitialAccess().getInitialPatternPatternAssignmentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePatternAssignment();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getInitialPatternPatternAssignmentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__InitialPatternAssignment_3"


    // $ANTLR start "rule__AssignFromPattern__PatternAssignment"
    // InternalReactionRules.g:5933:1: rule__AssignFromPattern__PatternAssignment : ( rulePattern ) ;
    public final void rule__AssignFromPattern__PatternAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5937:1: ( ( rulePattern ) )
            // InternalReactionRules.g:5938:2: ( rulePattern )
            {
            // InternalReactionRules.g:5938:2: ( rulePattern )
            // InternalReactionRules.g:5939:3: rulePattern
            {
             before(grammarAccess.getAssignFromPatternAccess().getPatternPatternParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getAssignFromPatternAccess().getPatternPatternParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignFromPattern__PatternAssignment"


    // $ANTLR start "rule__AssignFromVariable__PatternVarAssignment"
    // InternalReactionRules.g:5948:1: rule__AssignFromVariable__PatternVarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__AssignFromVariable__PatternVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5952:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5953:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5953:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5954:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignFromVariableAccess().getPatternVarPatternVariableCrossReference_0()); 
            // InternalReactionRules.g:5955:3: ( RULE_ID )
            // InternalReactionRules.g:5956:4: RULE_ID
            {
             before(grammarAccess.getAssignFromVariableAccess().getPatternVarPatternVariableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignFromVariableAccess().getPatternVarPatternVariableIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getAssignFromVariableAccess().getPatternVarPatternVariableCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignFromVariable__PatternVarAssignment"


    // $ANTLR start "rule__RuleVariables__VariablesAssignment_0"
    // InternalReactionRules.g:5967:1: rule__RuleVariables__VariablesAssignment_0 : ( ruleNumericAssignment ) ;
    public final void rule__RuleVariables__VariablesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5971:1: ( ( ruleNumericAssignment ) )
            // InternalReactionRules.g:5972:2: ( ruleNumericAssignment )
            {
            // InternalReactionRules.g:5972:2: ( ruleNumericAssignment )
            // InternalReactionRules.g:5973:3: ruleNumericAssignment
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesNumericAssignmentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNumericAssignment();

            state._fsp--;

             after(grammarAccess.getRuleVariablesAccess().getVariablesNumericAssignmentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVariables__VariablesAssignment_0"


    // $ANTLR start "rule__RuleVariables__VariablesAssignment_1_1"
    // InternalReactionRules.g:5982:1: rule__RuleVariables__VariablesAssignment_1_1 : ( ruleNumericAssignment ) ;
    public final void rule__RuleVariables__VariablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5986:1: ( ( ruleNumericAssignment ) )
            // InternalReactionRules.g:5987:2: ( ruleNumericAssignment )
            {
            // InternalReactionRules.g:5987:2: ( ruleNumericAssignment )
            // InternalReactionRules.g:5988:3: ruleNumericAssignment
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesNumericAssignmentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumericAssignment();

            state._fsp--;

             after(grammarAccess.getRuleVariablesAccess().getVariablesNumericAssignmentParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVariables__VariablesAssignment_1_1"


    // $ANTLR start "rule__UnidirectionalRule__LhsAssignment_0"
    // InternalReactionRules.g:5997:1: rule__UnidirectionalRule__LhsAssignment_0 : ( rulePatternAssignment ) ;
    public final void rule__UnidirectionalRule__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6001:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6002:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6002:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6003:3: rulePatternAssignment
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getLhsPatternAssignmentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePatternAssignment();

            state._fsp--;

             after(grammarAccess.getUnidirectionalRuleAccess().getLhsPatternAssignmentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__LhsAssignment_0"


    // $ANTLR start "rule__UnidirectionalRule__OperatorAssignment_1"
    // InternalReactionRules.g:6012:1: rule__UnidirectionalRule__OperatorAssignment_1 : ( RULE_UNI ) ;
    public final void rule__UnidirectionalRule__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6016:1: ( ( RULE_UNI ) )
            // InternalReactionRules.g:6017:2: ( RULE_UNI )
            {
            // InternalReactionRules.g:6017:2: ( RULE_UNI )
            // InternalReactionRules.g:6018:3: RULE_UNI
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getOperatorUNITerminalRuleCall_1_0()); 
            match(input,RULE_UNI,FOLLOW_2); 
             after(grammarAccess.getUnidirectionalRuleAccess().getOperatorUNITerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__OperatorAssignment_1"


    // $ANTLR start "rule__UnidirectionalRule__RhsAssignment_2"
    // InternalReactionRules.g:6027:1: rule__UnidirectionalRule__RhsAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__UnidirectionalRule__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6031:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6032:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6032:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6033:3: rulePatternAssignment
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getRhsPatternAssignmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePatternAssignment();

            state._fsp--;

             after(grammarAccess.getUnidirectionalRuleAccess().getRhsPatternAssignmentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__RhsAssignment_2"


    // $ANTLR start "rule__UnidirectionalRule__VariablesAssignment_5"
    // InternalReactionRules.g:6042:1: rule__UnidirectionalRule__VariablesAssignment_5 : ( ruleRuleVariables ) ;
    public final void rule__UnidirectionalRule__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6046:1: ( ( ruleRuleVariables ) )
            // InternalReactionRules.g:6047:2: ( ruleRuleVariables )
            {
            // InternalReactionRules.g:6047:2: ( ruleRuleVariables )
            // InternalReactionRules.g:6048:3: ruleRuleVariables
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getVariablesRuleVariablesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleVariables();

            state._fsp--;

             after(grammarAccess.getUnidirectionalRuleAccess().getVariablesRuleVariablesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnidirectionalRule__VariablesAssignment_5"


    // $ANTLR start "rule__BidirectionalRule__LhsAssignment_0"
    // InternalReactionRules.g:6057:1: rule__BidirectionalRule__LhsAssignment_0 : ( rulePatternAssignment ) ;
    public final void rule__BidirectionalRule__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6061:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6062:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6062:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6063:3: rulePatternAssignment
            {
             before(grammarAccess.getBidirectionalRuleAccess().getLhsPatternAssignmentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePatternAssignment();

            state._fsp--;

             after(grammarAccess.getBidirectionalRuleAccess().getLhsPatternAssignmentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__LhsAssignment_0"


    // $ANTLR start "rule__BidirectionalRule__OperatorAssignment_1"
    // InternalReactionRules.g:6072:1: rule__BidirectionalRule__OperatorAssignment_1 : ( RULE_BI ) ;
    public final void rule__BidirectionalRule__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6076:1: ( ( RULE_BI ) )
            // InternalReactionRules.g:6077:2: ( RULE_BI )
            {
            // InternalReactionRules.g:6077:2: ( RULE_BI )
            // InternalReactionRules.g:6078:3: RULE_BI
            {
             before(grammarAccess.getBidirectionalRuleAccess().getOperatorBITerminalRuleCall_1_0()); 
            match(input,RULE_BI,FOLLOW_2); 
             after(grammarAccess.getBidirectionalRuleAccess().getOperatorBITerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__OperatorAssignment_1"


    // $ANTLR start "rule__BidirectionalRule__RhsAssignment_2"
    // InternalReactionRules.g:6087:1: rule__BidirectionalRule__RhsAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__BidirectionalRule__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6091:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6092:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6092:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6093:3: rulePatternAssignment
            {
             before(grammarAccess.getBidirectionalRuleAccess().getRhsPatternAssignmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePatternAssignment();

            state._fsp--;

             after(grammarAccess.getBidirectionalRuleAccess().getRhsPatternAssignmentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__RhsAssignment_2"


    // $ANTLR start "rule__BidirectionalRule__VariablesAssignment_5"
    // InternalReactionRules.g:6102:1: rule__BidirectionalRule__VariablesAssignment_5 : ( ruleRuleVariables ) ;
    public final void rule__BidirectionalRule__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6106:1: ( ( ruleRuleVariables ) )
            // InternalReactionRules.g:6107:2: ( ruleRuleVariables )
            {
            // InternalReactionRules.g:6107:2: ( ruleRuleVariables )
            // InternalReactionRules.g:6108:3: ruleRuleVariables
            {
             before(grammarAccess.getBidirectionalRuleAccess().getVariablesRuleVariablesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleVariables();

            state._fsp--;

             after(grammarAccess.getBidirectionalRuleAccess().getVariablesRuleVariablesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BidirectionalRule__VariablesAssignment_5"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalReactionRules.g:6117:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6121:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6122:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6122:2: ( RULE_ID )
            // InternalReactionRules.g:6123:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__RuleAssignment_2"
    // InternalReactionRules.g:6132:1: rule__Rule__RuleAssignment_2 : ( ruleRuleBody ) ;
    public final void rule__Rule__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6136:1: ( ( ruleRuleBody ) )
            // InternalReactionRules.g:6137:2: ( ruleRuleBody )
            {
            // InternalReactionRules.g:6137:2: ( ruleRuleBody )
            // InternalReactionRules.g:6138:3: ruleRuleBody
            {
             before(grammarAccess.getRuleAccess().getRuleRuleBodyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleBody();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRuleRuleBodyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__RuleAssignment_2"


    // $ANTLR start "rule__Iterations__ValueAssignment_2"
    // InternalReactionRules.g:6147:1: rule__Iterations__ValueAssignment_2 : ( ruleUnsignedInteger ) ;
    public final void rule__Iterations__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6151:1: ( ( ruleUnsignedInteger ) )
            // InternalReactionRules.g:6152:2: ( ruleUnsignedInteger )
            {
            // InternalReactionRules.g:6152:2: ( ruleUnsignedInteger )
            // InternalReactionRules.g:6153:3: ruleUnsignedInteger
            {
             before(grammarAccess.getIterationsAccess().getValueUnsignedIntegerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsignedInteger();

            state._fsp--;

             after(grammarAccess.getIterationsAccess().getValueUnsignedIntegerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iterations__ValueAssignment_2"


    // $ANTLR start "rule__Time__ValueAssignment_2"
    // InternalReactionRules.g:6162:1: rule__Time__ValueAssignment_2 : ( ruleUnsignedInteger ) ;
    public final void rule__Time__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6166:1: ( ( ruleUnsignedInteger ) )
            // InternalReactionRules.g:6167:2: ( ruleUnsignedInteger )
            {
            // InternalReactionRules.g:6167:2: ( ruleUnsignedInteger )
            // InternalReactionRules.g:6168:3: ruleUnsignedInteger
            {
             before(grammarAccess.getTimeAccess().getValueUnsignedIntegerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsignedInteger();

            state._fsp--;

             after(grammarAccess.getTimeAccess().getValueUnsignedIntegerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__ValueAssignment_2"


    // $ANTLR start "rule__Population__PaAssignment_1"
    // InternalReactionRules.g:6177:1: rule__Population__PaAssignment_1 : ( rulePatternAssignment ) ;
    public final void rule__Population__PaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6181:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6182:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6182:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6183:3: rulePatternAssignment
            {
             before(grammarAccess.getPopulationAccess().getPaPatternAssignmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePatternAssignment();

            state._fsp--;

             after(grammarAccess.getPopulationAccess().getPaPatternAssignmentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Population__PaAssignment_1"


    // $ANTLR start "rule__Population__ValueAssignment_4"
    // InternalReactionRules.g:6192:1: rule__Population__ValueAssignment_4 : ( ruleUnsignedInteger ) ;
    public final void rule__Population__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6196:1: ( ( ruleUnsignedInteger ) )
            // InternalReactionRules.g:6197:2: ( ruleUnsignedInteger )
            {
            // InternalReactionRules.g:6197:2: ( ruleUnsignedInteger )
            // InternalReactionRules.g:6198:3: ruleUnsignedInteger
            {
             before(grammarAccess.getPopulationAccess().getValueUnsignedIntegerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsignedInteger();

            state._fsp--;

             after(grammarAccess.getPopulationAccess().getValueUnsignedIntegerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Population__ValueAssignment_4"


    // $ANTLR start "rule__Terminate__NameAssignment_1"
    // InternalReactionRules.g:6207:1: rule__Terminate__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Terminate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6211:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6212:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6212:2: ( RULE_ID )
            // InternalReactionRules.g:6213:3: RULE_ID
            {
             before(grammarAccess.getTerminateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminate__NameAssignment_1"


    // $ANTLR start "rule__Terminate__ConditionAssignment_2"
    // InternalReactionRules.g:6222:1: rule__Terminate__ConditionAssignment_2 : ( ruleTerminationCondition ) ;
    public final void rule__Terminate__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6226:1: ( ( ruleTerminationCondition ) )
            // InternalReactionRules.g:6227:2: ( ruleTerminationCondition )
            {
            // InternalReactionRules.g:6227:2: ( ruleTerminationCondition )
            // InternalReactionRules.g:6228:3: ruleTerminationCondition
            {
             before(grammarAccess.getTerminateAccess().getConditionTerminationConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminationCondition();

            state._fsp--;

             after(grammarAccess.getTerminateAccess().getConditionTerminationConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminate__ConditionAssignment_2"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\5\1\6\3\uffff\1\11\2\uffff";
    static final String dfa_3s = "\2\4\2\7\1\4\2\uffff\1\5\2\uffff";
    static final String dfa_4s = "\1\23\1\4\2\50\1\4\2\uffff\1\50\2\uffff";
    static final String dfa_5s = "\5\uffff\1\2\1\3\1\uffff\1\4\1\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\16\uffff\1\1",
            "\1\3",
            "\1\5\16\uffff\1\4\1\5\1\uffff\1\5\2\uffff\2\5\2\uffff\4\5\4\uffff\1\5",
            "\1\6\16\uffff\1\4\1\6\1\uffff\1\6\2\uffff\2\6\2\uffff\4\6\4\uffff\1\6",
            "\1\7",
            "",
            "",
            "\1\10\1\uffff\1\11\17\uffff\1\11\1\uffff\1\11\2\uffff\2\11\2\uffff\4\11\4\uffff\1\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1400:1: rule__ArithmeticType__Alternatives : ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) );";
        }
    }
    static final String dfa_8s = "\105\uffff";
    static final String dfa_9s = "\2\7\1\14\1\32\1\30\1\14\2\uffff\2\7\1\27\1\30\1\32\1\30\1\7\1\4\1\7\1\30\2\40\1\26\2\40\1\27\1\30\1\37\1\31\2\7\1\4\1\7\1\40\1\30\2\40\1\26\2\40\1\27\1\37\1\31\2\7\1\4\1\7\1\40\1\30\2\40\1\26\2\40\1\27\1\37\1\31\2\7\1\4\1\40\1\30\2\40\1\26\2\40\1\37\1\31\1\7\1\40";
    static final String dfa_10s = "\1\27\1\30\1\15\1\32\1\31\1\15\2\uffff\1\33\1\13\1\37\1\31\1\32\1\31\1\7\1\12\1\33\1\30\2\40\1\26\2\40\1\37\1\31\1\37\1\33\2\7\1\12\1\7\1\40\1\30\2\40\1\26\2\40\2\37\1\33\2\7\1\12\1\7\1\40\1\30\2\40\1\26\2\40\2\37\1\33\2\7\1\12\1\40\1\30\2\40\1\26\2\40\1\37\1\33\1\7\1\40";
    static final String dfa_11s = "\6\uffff\1\1\1\2\75\uffff";
    static final String dfa_12s = "\105\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\17\uffff\1\1",
            "\1\3\3\uffff\1\4\14\uffff\1\5",
            "\1\6\1\7",
            "\1\10",
            "\1\5\1\11",
            "\1\6\1\7",
            "",
            "",
            "\1\12\23\uffff\1\13",
            "\1\14\3\uffff\1\15",
            "\1\16\7\uffff\1\17",
            "\1\5\1\11",
            "\1\20",
            "\1\5\1\11",
            "\1\21",
            "\1\25\2\uffff\1\24\1\22\1\23\1\26",
            "\1\27\23\uffff\1\30",
            "\1\31",
            "\1\32",
            "\1\32",
            "\1\33",
            "\1\32",
            "\1\32",
            "\1\34\7\uffff\1\35",
            "\1\5\1\11",
            "\1\17",
            "\1\36\1\uffff\1\13",
            "\1\37",
            "\1\40",
            "\1\44\2\uffff\1\43\1\41\1\42\1\45",
            "\1\46",
            "\1\32",
            "\1\47",
            "\1\50",
            "\1\50",
            "\1\51",
            "\1\50",
            "\1\50",
            "\1\52\7\uffff\1\53",
            "\1\35",
            "\1\54\1\uffff\1\30",
            "\1\55",
            "\1\56",
            "\1\62\2\uffff\1\61\1\57\1\60\1\63",
            "\1\64",
            "\1\50",
            "\1\65",
            "\1\66",
            "\1\66",
            "\1\67",
            "\1\66",
            "\1\66",
            "\1\70\7\uffff\1\71",
            "\1\53",
            "\1\36\1\uffff\1\13",
            "\1\72",
            "\1\73",
            "\1\77\2\uffff\1\76\1\74\1\75\1\100",
            "\1\66",
            "\1\101",
            "\1\102",
            "\1\102",
            "\1\103",
            "\1\102",
            "\1\102",
            "\1\71",
            "\1\54\1\uffff\1\30",
            "\1\104",
            "\1\102"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1556:1: rule__RuleBody__Alternatives : ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000010E30000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000010E30000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000790L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000880L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000800080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000080090L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000007000000000L});

}