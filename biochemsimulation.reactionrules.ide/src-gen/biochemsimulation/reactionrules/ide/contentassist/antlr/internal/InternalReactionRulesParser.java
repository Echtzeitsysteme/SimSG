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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_EXPONENT", "RULE_AT", "RULE_ID", "RULE_BOUND_LINK", "RULE_FREE_LINK", "RULE_WHATEVER_LINK", "RULE_VOID_PATTERN", "RULE_UNI", "RULE_BI", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'+'", "'ModelID'", "'.'", "'{'", "'}'", "','", "'*'", "'('", "')'", "'agent'", "'var'", "'='", "'['", "']'", "'*['", "'obs'", "'init'", "'rule'", "'iterations'", "'time'", "'|'", "'==>'", "'terminate'"
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
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
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


    // $ANTLR start "entryRuleSingleSite"
    // InternalReactionRules.g:360:1: entryRuleSingleSite : ruleSingleSite EOF ;
    public final void entryRuleSingleSite() throws RecognitionException {
        try {
            // InternalReactionRules.g:361:1: ( ruleSingleSite EOF )
            // InternalReactionRules.g:362:1: ruleSingleSite EOF
            {
             before(grammarAccess.getSingleSiteRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleSite();

            state._fsp--;

             after(grammarAccess.getSingleSiteRule()); 
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
    // $ANTLR end "entryRuleSingleSite"


    // $ANTLR start "ruleSingleSite"
    // InternalReactionRules.g:369:1: ruleSingleSite : ( ( rule__SingleSite__Group__0 ) ) ;
    public final void ruleSingleSite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:373:2: ( ( ( rule__SingleSite__Group__0 ) ) )
            // InternalReactionRules.g:374:2: ( ( rule__SingleSite__Group__0 ) )
            {
            // InternalReactionRules.g:374:2: ( ( rule__SingleSite__Group__0 ) )
            // InternalReactionRules.g:375:3: ( rule__SingleSite__Group__0 )
            {
             before(grammarAccess.getSingleSiteAccess().getGroup()); 
            // InternalReactionRules.g:376:3: ( rule__SingleSite__Group__0 )
            // InternalReactionRules.g:376:4: rule__SingleSite__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleSite__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleSiteAccess().getGroup()); 

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
    // $ANTLR end "ruleSingleSite"


    // $ANTLR start "entryRuleMultiSite"
    // InternalReactionRules.g:385:1: entryRuleMultiSite : ruleMultiSite EOF ;
    public final void entryRuleMultiSite() throws RecognitionException {
        try {
            // InternalReactionRules.g:386:1: ( ruleMultiSite EOF )
            // InternalReactionRules.g:387:1: ruleMultiSite EOF
            {
             before(grammarAccess.getMultiSiteRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiSite();

            state._fsp--;

             after(grammarAccess.getMultiSiteRule()); 
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
    // $ANTLR end "entryRuleMultiSite"


    // $ANTLR start "ruleMultiSite"
    // InternalReactionRules.g:394:1: ruleMultiSite : ( ( rule__MultiSite__Group__0 ) ) ;
    public final void ruleMultiSite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:398:2: ( ( ( rule__MultiSite__Group__0 ) ) )
            // InternalReactionRules.g:399:2: ( ( rule__MultiSite__Group__0 ) )
            {
            // InternalReactionRules.g:399:2: ( ( rule__MultiSite__Group__0 ) )
            // InternalReactionRules.g:400:3: ( rule__MultiSite__Group__0 )
            {
             before(grammarAccess.getMultiSiteAccess().getGroup()); 
            // InternalReactionRules.g:401:3: ( rule__MultiSite__Group__0 )
            // InternalReactionRules.g:401:4: rule__MultiSite__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiSite__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiSiteAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiSite"


    // $ANTLR start "entryRuleSite"
    // InternalReactionRules.g:410:1: entryRuleSite : ruleSite EOF ;
    public final void entryRuleSite() throws RecognitionException {
        try {
            // InternalReactionRules.g:411:1: ( ruleSite EOF )
            // InternalReactionRules.g:412:1: ruleSite EOF
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
    // InternalReactionRules.g:419:1: ruleSite : ( ( rule__Site__Alternatives ) ) ;
    public final void ruleSite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:423:2: ( ( ( rule__Site__Alternatives ) ) )
            // InternalReactionRules.g:424:2: ( ( rule__Site__Alternatives ) )
            {
            // InternalReactionRules.g:424:2: ( ( rule__Site__Alternatives ) )
            // InternalReactionRules.g:425:3: ( rule__Site__Alternatives )
            {
             before(grammarAccess.getSiteAccess().getAlternatives()); 
            // InternalReactionRules.g:426:3: ( rule__Site__Alternatives )
            // InternalReactionRules.g:426:4: rule__Site__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Site__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSiteAccess().getAlternatives()); 

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
    // InternalReactionRules.g:435:1: entryRuleSites : ruleSites EOF ;
    public final void entryRuleSites() throws RecognitionException {
        try {
            // InternalReactionRules.g:436:1: ( ruleSites EOF )
            // InternalReactionRules.g:437:1: ruleSites EOF
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
    // InternalReactionRules.g:444:1: ruleSites : ( ( rule__Sites__Group__0 ) ) ;
    public final void ruleSites() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:448:2: ( ( ( rule__Sites__Group__0 ) ) )
            // InternalReactionRules.g:449:2: ( ( rule__Sites__Group__0 ) )
            {
            // InternalReactionRules.g:449:2: ( ( rule__Sites__Group__0 ) )
            // InternalReactionRules.g:450:3: ( rule__Sites__Group__0 )
            {
             before(grammarAccess.getSitesAccess().getGroup()); 
            // InternalReactionRules.g:451:3: ( rule__Sites__Group__0 )
            // InternalReactionRules.g:451:4: rule__Sites__Group__0
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
    // InternalReactionRules.g:460:1: entryRuleAgent : ruleAgent EOF ;
    public final void entryRuleAgent() throws RecognitionException {
        try {
            // InternalReactionRules.g:461:1: ( ruleAgent EOF )
            // InternalReactionRules.g:462:1: ruleAgent EOF
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
    // InternalReactionRules.g:469:1: ruleAgent : ( ( rule__Agent__Group__0 ) ) ;
    public final void ruleAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:473:2: ( ( ( rule__Agent__Group__0 ) ) )
            // InternalReactionRules.g:474:2: ( ( rule__Agent__Group__0 ) )
            {
            // InternalReactionRules.g:474:2: ( ( rule__Agent__Group__0 ) )
            // InternalReactionRules.g:475:3: ( rule__Agent__Group__0 )
            {
             before(grammarAccess.getAgentAccess().getGroup()); 
            // InternalReactionRules.g:476:3: ( rule__Agent__Group__0 )
            // InternalReactionRules.g:476:4: rule__Agent__Group__0
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
    // InternalReactionRules.g:485:1: entryRulePatternVariable : rulePatternVariable EOF ;
    public final void entryRulePatternVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:486:1: ( rulePatternVariable EOF )
            // InternalReactionRules.g:487:1: rulePatternVariable EOF
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
    // InternalReactionRules.g:494:1: rulePatternVariable : ( ( rule__PatternVariable__Group__0 ) ) ;
    public final void rulePatternVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:498:2: ( ( ( rule__PatternVariable__Group__0 ) ) )
            // InternalReactionRules.g:499:2: ( ( rule__PatternVariable__Group__0 ) )
            {
            // InternalReactionRules.g:499:2: ( ( rule__PatternVariable__Group__0 ) )
            // InternalReactionRules.g:500:3: ( rule__PatternVariable__Group__0 )
            {
             before(grammarAccess.getPatternVariableAccess().getGroup()); 
            // InternalReactionRules.g:501:3: ( rule__PatternVariable__Group__0 )
            // InternalReactionRules.g:501:4: rule__PatternVariable__Group__0
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
    // InternalReactionRules.g:510:1: entryRuleArithmeticVariable : ruleArithmeticVariable EOF ;
    public final void entryRuleArithmeticVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:511:1: ( ruleArithmeticVariable EOF )
            // InternalReactionRules.g:512:1: ruleArithmeticVariable EOF
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
    // InternalReactionRules.g:519:1: ruleArithmeticVariable : ( ( rule__ArithmeticVariable__Group__0 ) ) ;
    public final void ruleArithmeticVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:523:2: ( ( ( rule__ArithmeticVariable__Group__0 ) ) )
            // InternalReactionRules.g:524:2: ( ( rule__ArithmeticVariable__Group__0 ) )
            {
            // InternalReactionRules.g:524:2: ( ( rule__ArithmeticVariable__Group__0 ) )
            // InternalReactionRules.g:525:3: ( rule__ArithmeticVariable__Group__0 )
            {
             before(grammarAccess.getArithmeticVariableAccess().getGroup()); 
            // InternalReactionRules.g:526:3: ( rule__ArithmeticVariable__Group__0 )
            // InternalReactionRules.g:526:4: rule__ArithmeticVariable__Group__0
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
    // InternalReactionRules.g:535:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:536:1: ( ruleVariable EOF )
            // InternalReactionRules.g:537:1: ruleVariable EOF
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
    // InternalReactionRules.g:544:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:548:2: ( ( ( rule__Variable__Alternatives ) ) )
            // InternalReactionRules.g:549:2: ( ( rule__Variable__Alternatives ) )
            {
            // InternalReactionRules.g:549:2: ( ( rule__Variable__Alternatives ) )
            // InternalReactionRules.g:550:3: ( rule__Variable__Alternatives )
            {
             before(grammarAccess.getVariableAccess().getAlternatives()); 
            // InternalReactionRules.g:551:3: ( rule__Variable__Alternatives )
            // InternalReactionRules.g:551:4: rule__Variable__Alternatives
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
    // InternalReactionRules.g:560:1: entryRuleBoundAnyLink : ruleBoundAnyLink EOF ;
    public final void entryRuleBoundAnyLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:561:1: ( ruleBoundAnyLink EOF )
            // InternalReactionRules.g:562:1: ruleBoundAnyLink EOF
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
    // InternalReactionRules.g:569:1: ruleBoundAnyLink : ( ( rule__BoundAnyLink__Group__0 ) ) ;
    public final void ruleBoundAnyLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:573:2: ( ( ( rule__BoundAnyLink__Group__0 ) ) )
            // InternalReactionRules.g:574:2: ( ( rule__BoundAnyLink__Group__0 ) )
            {
            // InternalReactionRules.g:574:2: ( ( rule__BoundAnyLink__Group__0 ) )
            // InternalReactionRules.g:575:3: ( rule__BoundAnyLink__Group__0 )
            {
             before(grammarAccess.getBoundAnyLinkAccess().getGroup()); 
            // InternalReactionRules.g:576:3: ( rule__BoundAnyLink__Group__0 )
            // InternalReactionRules.g:576:4: rule__BoundAnyLink__Group__0
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
    // InternalReactionRules.g:585:1: entryRuleFreeLink : ruleFreeLink EOF ;
    public final void entryRuleFreeLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:586:1: ( ruleFreeLink EOF )
            // InternalReactionRules.g:587:1: ruleFreeLink EOF
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
    // InternalReactionRules.g:594:1: ruleFreeLink : ( ( rule__FreeLink__Group__0 ) ) ;
    public final void ruleFreeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:598:2: ( ( ( rule__FreeLink__Group__0 ) ) )
            // InternalReactionRules.g:599:2: ( ( rule__FreeLink__Group__0 ) )
            {
            // InternalReactionRules.g:599:2: ( ( rule__FreeLink__Group__0 ) )
            // InternalReactionRules.g:600:3: ( rule__FreeLink__Group__0 )
            {
             before(grammarAccess.getFreeLinkAccess().getGroup()); 
            // InternalReactionRules.g:601:3: ( rule__FreeLink__Group__0 )
            // InternalReactionRules.g:601:4: rule__FreeLink__Group__0
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


    // $ANTLR start "entryRuleIndexedFreeLink"
    // InternalReactionRules.g:610:1: entryRuleIndexedFreeLink : ruleIndexedFreeLink EOF ;
    public final void entryRuleIndexedFreeLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:611:1: ( ruleIndexedFreeLink EOF )
            // InternalReactionRules.g:612:1: ruleIndexedFreeLink EOF
            {
             before(grammarAccess.getIndexedFreeLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleIndexedFreeLink();

            state._fsp--;

             after(grammarAccess.getIndexedFreeLinkRule()); 
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
    // $ANTLR end "entryRuleIndexedFreeLink"


    // $ANTLR start "ruleIndexedFreeLink"
    // InternalReactionRules.g:619:1: ruleIndexedFreeLink : ( ( rule__IndexedFreeLink__Group__0 ) ) ;
    public final void ruleIndexedFreeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:623:2: ( ( ( rule__IndexedFreeLink__Group__0 ) ) )
            // InternalReactionRules.g:624:2: ( ( rule__IndexedFreeLink__Group__0 ) )
            {
            // InternalReactionRules.g:624:2: ( ( rule__IndexedFreeLink__Group__0 ) )
            // InternalReactionRules.g:625:3: ( rule__IndexedFreeLink__Group__0 )
            {
             before(grammarAccess.getIndexedFreeLinkAccess().getGroup()); 
            // InternalReactionRules.g:626:3: ( rule__IndexedFreeLink__Group__0 )
            // InternalReactionRules.g:626:4: rule__IndexedFreeLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IndexedFreeLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndexedFreeLinkAccess().getGroup()); 

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
    // $ANTLR end "ruleIndexedFreeLink"


    // $ANTLR start "entryRuleWhatEver"
    // InternalReactionRules.g:635:1: entryRuleWhatEver : ruleWhatEver EOF ;
    public final void entryRuleWhatEver() throws RecognitionException {
        try {
            // InternalReactionRules.g:636:1: ( ruleWhatEver EOF )
            // InternalReactionRules.g:637:1: ruleWhatEver EOF
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
    // InternalReactionRules.g:644:1: ruleWhatEver : ( ( rule__WhatEver__Group__0 ) ) ;
    public final void ruleWhatEver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:648:2: ( ( ( rule__WhatEver__Group__0 ) ) )
            // InternalReactionRules.g:649:2: ( ( rule__WhatEver__Group__0 ) )
            {
            // InternalReactionRules.g:649:2: ( ( rule__WhatEver__Group__0 ) )
            // InternalReactionRules.g:650:3: ( rule__WhatEver__Group__0 )
            {
             before(grammarAccess.getWhatEverAccess().getGroup()); 
            // InternalReactionRules.g:651:3: ( rule__WhatEver__Group__0 )
            // InternalReactionRules.g:651:4: rule__WhatEver__Group__0
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
    // InternalReactionRules.g:660:1: entryRuleBoundLink : ruleBoundLink EOF ;
    public final void entryRuleBoundLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:661:1: ( ruleBoundLink EOF )
            // InternalReactionRules.g:662:1: ruleBoundLink EOF
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
    // InternalReactionRules.g:669:1: ruleBoundLink : ( ( rule__BoundLink__Group__0 ) ) ;
    public final void ruleBoundLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:673:2: ( ( ( rule__BoundLink__Group__0 ) ) )
            // InternalReactionRules.g:674:2: ( ( rule__BoundLink__Group__0 ) )
            {
            // InternalReactionRules.g:674:2: ( ( rule__BoundLink__Group__0 ) )
            // InternalReactionRules.g:675:3: ( rule__BoundLink__Group__0 )
            {
             before(grammarAccess.getBoundLinkAccess().getGroup()); 
            // InternalReactionRules.g:676:3: ( rule__BoundLink__Group__0 )
            // InternalReactionRules.g:676:4: rule__BoundLink__Group__0
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


    // $ANTLR start "entryRuleMultiLink"
    // InternalReactionRules.g:685:1: entryRuleMultiLink : ruleMultiLink EOF ;
    public final void entryRuleMultiLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:686:1: ( ruleMultiLink EOF )
            // InternalReactionRules.g:687:1: ruleMultiLink EOF
            {
             before(grammarAccess.getMultiLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiLink();

            state._fsp--;

             after(grammarAccess.getMultiLinkRule()); 
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
    // $ANTLR end "entryRuleMultiLink"


    // $ANTLR start "ruleMultiLink"
    // InternalReactionRules.g:694:1: ruleMultiLink : ( ( rule__MultiLink__Group__0 ) ) ;
    public final void ruleMultiLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:698:2: ( ( ( rule__MultiLink__Group__0 ) ) )
            // InternalReactionRules.g:699:2: ( ( rule__MultiLink__Group__0 ) )
            {
            // InternalReactionRules.g:699:2: ( ( rule__MultiLink__Group__0 ) )
            // InternalReactionRules.g:700:3: ( rule__MultiLink__Group__0 )
            {
             before(grammarAccess.getMultiLinkAccess().getGroup()); 
            // InternalReactionRules.g:701:3: ( rule__MultiLink__Group__0 )
            // InternalReactionRules.g:701:4: rule__MultiLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiLinkAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiLink"


    // $ANTLR start "entryRuleBoundAnyOfTypeLinkAgent"
    // InternalReactionRules.g:710:1: entryRuleBoundAnyOfTypeLinkAgent : ruleBoundAnyOfTypeLinkAgent EOF ;
    public final void entryRuleBoundAnyOfTypeLinkAgent() throws RecognitionException {
        try {
            // InternalReactionRules.g:711:1: ( ruleBoundAnyOfTypeLinkAgent EOF )
            // InternalReactionRules.g:712:1: ruleBoundAnyOfTypeLinkAgent EOF
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
    // InternalReactionRules.g:719:1: ruleBoundAnyOfTypeLinkAgent : ( ( rule__BoundAnyOfTypeLinkAgent__Group__0 ) ) ;
    public final void ruleBoundAnyOfTypeLinkAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:723:2: ( ( ( rule__BoundAnyOfTypeLinkAgent__Group__0 ) ) )
            // InternalReactionRules.g:724:2: ( ( rule__BoundAnyOfTypeLinkAgent__Group__0 ) )
            {
            // InternalReactionRules.g:724:2: ( ( rule__BoundAnyOfTypeLinkAgent__Group__0 ) )
            // InternalReactionRules.g:725:3: ( rule__BoundAnyOfTypeLinkAgent__Group__0 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getGroup()); 
            // InternalReactionRules.g:726:3: ( rule__BoundAnyOfTypeLinkAgent__Group__0 )
            // InternalReactionRules.g:726:4: rule__BoundAnyOfTypeLinkAgent__Group__0
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
    // InternalReactionRules.g:735:1: entryRuleBoundAnyOfTypeLinkSite : ruleBoundAnyOfTypeLinkSite EOF ;
    public final void entryRuleBoundAnyOfTypeLinkSite() throws RecognitionException {
        try {
            // InternalReactionRules.g:736:1: ( ruleBoundAnyOfTypeLinkSite EOF )
            // InternalReactionRules.g:737:1: ruleBoundAnyOfTypeLinkSite EOF
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
    // InternalReactionRules.g:744:1: ruleBoundAnyOfTypeLinkSite : ( ( rule__BoundAnyOfTypeLinkSite__Group__0 ) ) ;
    public final void ruleBoundAnyOfTypeLinkSite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:748:2: ( ( ( rule__BoundAnyOfTypeLinkSite__Group__0 ) ) )
            // InternalReactionRules.g:749:2: ( ( rule__BoundAnyOfTypeLinkSite__Group__0 ) )
            {
            // InternalReactionRules.g:749:2: ( ( rule__BoundAnyOfTypeLinkSite__Group__0 ) )
            // InternalReactionRules.g:750:3: ( rule__BoundAnyOfTypeLinkSite__Group__0 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getGroup()); 
            // InternalReactionRules.g:751:3: ( rule__BoundAnyOfTypeLinkSite__Group__0 )
            // InternalReactionRules.g:751:4: rule__BoundAnyOfTypeLinkSite__Group__0
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
    // InternalReactionRules.g:760:1: entryRuleBoundAnyOfTypeLink : ruleBoundAnyOfTypeLink EOF ;
    public final void entryRuleBoundAnyOfTypeLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:761:1: ( ruleBoundAnyOfTypeLink EOF )
            // InternalReactionRules.g:762:1: ruleBoundAnyOfTypeLink EOF
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
    // InternalReactionRules.g:769:1: ruleBoundAnyOfTypeLink : ( ( rule__BoundAnyOfTypeLink__Group__0 ) ) ;
    public final void ruleBoundAnyOfTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:773:2: ( ( ( rule__BoundAnyOfTypeLink__Group__0 ) ) )
            // InternalReactionRules.g:774:2: ( ( rule__BoundAnyOfTypeLink__Group__0 ) )
            {
            // InternalReactionRules.g:774:2: ( ( rule__BoundAnyOfTypeLink__Group__0 ) )
            // InternalReactionRules.g:775:3: ( rule__BoundAnyOfTypeLink__Group__0 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAccess().getGroup()); 
            // InternalReactionRules.g:776:3: ( rule__BoundAnyOfTypeLink__Group__0 )
            // InternalReactionRules.g:776:4: rule__BoundAnyOfTypeLink__Group__0
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
    // InternalReactionRules.g:785:1: entryRuleSiteState : ruleSiteState EOF ;
    public final void entryRuleSiteState() throws RecognitionException {
        try {
            // InternalReactionRules.g:786:1: ( ruleSiteState EOF )
            // InternalReactionRules.g:787:1: ruleSiteState EOF
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
    // InternalReactionRules.g:794:1: ruleSiteState : ( ( rule__SiteState__Group__0 ) ) ;
    public final void ruleSiteState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:798:2: ( ( ( rule__SiteState__Group__0 ) ) )
            // InternalReactionRules.g:799:2: ( ( rule__SiteState__Group__0 ) )
            {
            // InternalReactionRules.g:799:2: ( ( rule__SiteState__Group__0 ) )
            // InternalReactionRules.g:800:3: ( rule__SiteState__Group__0 )
            {
             before(grammarAccess.getSiteStateAccess().getGroup()); 
            // InternalReactionRules.g:801:3: ( rule__SiteState__Group__0 )
            // InternalReactionRules.g:801:4: rule__SiteState__Group__0
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
    // InternalReactionRules.g:810:1: entryRuleLinkState : ruleLinkState EOF ;
    public final void entryRuleLinkState() throws RecognitionException {
        try {
            // InternalReactionRules.g:811:1: ( ruleLinkState EOF )
            // InternalReactionRules.g:812:1: ruleLinkState EOF
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
    // InternalReactionRules.g:819:1: ruleLinkState : ( ( rule__LinkState__Group__0 ) ) ;
    public final void ruleLinkState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:823:2: ( ( ( rule__LinkState__Group__0 ) ) )
            // InternalReactionRules.g:824:2: ( ( rule__LinkState__Group__0 ) )
            {
            // InternalReactionRules.g:824:2: ( ( rule__LinkState__Group__0 ) )
            // InternalReactionRules.g:825:3: ( rule__LinkState__Group__0 )
            {
             before(grammarAccess.getLinkStateAccess().getGroup()); 
            // InternalReactionRules.g:826:3: ( rule__LinkState__Group__0 )
            // InternalReactionRules.g:826:4: rule__LinkState__Group__0
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


    // $ANTLR start "entryRuleMultiLinkState"
    // InternalReactionRules.g:835:1: entryRuleMultiLinkState : ruleMultiLinkState EOF ;
    public final void entryRuleMultiLinkState() throws RecognitionException {
        try {
            // InternalReactionRules.g:836:1: ( ruleMultiLinkState EOF )
            // InternalReactionRules.g:837:1: ruleMultiLinkState EOF
            {
             before(grammarAccess.getMultiLinkStateRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiLinkState();

            state._fsp--;

             after(grammarAccess.getMultiLinkStateRule()); 
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
    // $ANTLR end "entryRuleMultiLinkState"


    // $ANTLR start "ruleMultiLinkState"
    // InternalReactionRules.g:844:1: ruleMultiLinkState : ( ( rule__MultiLinkState__Group__0 ) ) ;
    public final void ruleMultiLinkState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:848:2: ( ( ( rule__MultiLinkState__Group__0 ) ) )
            // InternalReactionRules.g:849:2: ( ( rule__MultiLinkState__Group__0 ) )
            {
            // InternalReactionRules.g:849:2: ( ( rule__MultiLinkState__Group__0 ) )
            // InternalReactionRules.g:850:3: ( rule__MultiLinkState__Group__0 )
            {
             before(grammarAccess.getMultiLinkStateAccess().getGroup()); 
            // InternalReactionRules.g:851:3: ( rule__MultiLinkState__Group__0 )
            // InternalReactionRules.g:851:4: rule__MultiLinkState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiLinkState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiLinkStateAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiLinkState"


    // $ANTLR start "entryRuleSingleSitePattern"
    // InternalReactionRules.g:860:1: entryRuleSingleSitePattern : ruleSingleSitePattern EOF ;
    public final void entryRuleSingleSitePattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:861:1: ( ruleSingleSitePattern EOF )
            // InternalReactionRules.g:862:1: ruleSingleSitePattern EOF
            {
             before(grammarAccess.getSingleSitePatternRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleSitePattern();

            state._fsp--;

             after(grammarAccess.getSingleSitePatternRule()); 
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
    // $ANTLR end "entryRuleSingleSitePattern"


    // $ANTLR start "ruleSingleSitePattern"
    // InternalReactionRules.g:869:1: ruleSingleSitePattern : ( ( rule__SingleSitePattern__Group__0 ) ) ;
    public final void ruleSingleSitePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:873:2: ( ( ( rule__SingleSitePattern__Group__0 ) ) )
            // InternalReactionRules.g:874:2: ( ( rule__SingleSitePattern__Group__0 ) )
            {
            // InternalReactionRules.g:874:2: ( ( rule__SingleSitePattern__Group__0 ) )
            // InternalReactionRules.g:875:3: ( rule__SingleSitePattern__Group__0 )
            {
             before(grammarAccess.getSingleSitePatternAccess().getGroup()); 
            // InternalReactionRules.g:876:3: ( rule__SingleSitePattern__Group__0 )
            // InternalReactionRules.g:876:4: rule__SingleSitePattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleSitePattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleSitePatternAccess().getGroup()); 

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
    // $ANTLR end "ruleSingleSitePattern"


    // $ANTLR start "entryRuleMultiLinkSitePattern"
    // InternalReactionRules.g:885:1: entryRuleMultiLinkSitePattern : ruleMultiLinkSitePattern EOF ;
    public final void entryRuleMultiLinkSitePattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:886:1: ( ruleMultiLinkSitePattern EOF )
            // InternalReactionRules.g:887:1: ruleMultiLinkSitePattern EOF
            {
             before(grammarAccess.getMultiLinkSitePatternRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiLinkSitePattern();

            state._fsp--;

             after(grammarAccess.getMultiLinkSitePatternRule()); 
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
    // $ANTLR end "entryRuleMultiLinkSitePattern"


    // $ANTLR start "ruleMultiLinkSitePattern"
    // InternalReactionRules.g:894:1: ruleMultiLinkSitePattern : ( ( rule__MultiLinkSitePattern__Group__0 ) ) ;
    public final void ruleMultiLinkSitePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:898:2: ( ( ( rule__MultiLinkSitePattern__Group__0 ) ) )
            // InternalReactionRules.g:899:2: ( ( rule__MultiLinkSitePattern__Group__0 ) )
            {
            // InternalReactionRules.g:899:2: ( ( rule__MultiLinkSitePattern__Group__0 ) )
            // InternalReactionRules.g:900:3: ( rule__MultiLinkSitePattern__Group__0 )
            {
             before(grammarAccess.getMultiLinkSitePatternAccess().getGroup()); 
            // InternalReactionRules.g:901:3: ( rule__MultiLinkSitePattern__Group__0 )
            // InternalReactionRules.g:901:4: rule__MultiLinkSitePattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiLinkSitePattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiLinkSitePatternAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiLinkSitePattern"


    // $ANTLR start "entryRuleSitePattern"
    // InternalReactionRules.g:910:1: entryRuleSitePattern : ruleSitePattern EOF ;
    public final void entryRuleSitePattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:911:1: ( ruleSitePattern EOF )
            // InternalReactionRules.g:912:1: ruleSitePattern EOF
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
    // InternalReactionRules.g:919:1: ruleSitePattern : ( ( rule__SitePattern__Alternatives ) ) ;
    public final void ruleSitePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:923:2: ( ( ( rule__SitePattern__Alternatives ) ) )
            // InternalReactionRules.g:924:2: ( ( rule__SitePattern__Alternatives ) )
            {
            // InternalReactionRules.g:924:2: ( ( rule__SitePattern__Alternatives ) )
            // InternalReactionRules.g:925:3: ( rule__SitePattern__Alternatives )
            {
             before(grammarAccess.getSitePatternAccess().getAlternatives()); 
            // InternalReactionRules.g:926:3: ( rule__SitePattern__Alternatives )
            // InternalReactionRules.g:926:4: rule__SitePattern__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SitePattern__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSitePatternAccess().getAlternatives()); 

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
    // InternalReactionRules.g:935:1: entryRuleSitePatterns : ruleSitePatterns EOF ;
    public final void entryRuleSitePatterns() throws RecognitionException {
        try {
            // InternalReactionRules.g:936:1: ( ruleSitePatterns EOF )
            // InternalReactionRules.g:937:1: ruleSitePatterns EOF
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
    // InternalReactionRules.g:944:1: ruleSitePatterns : ( ( rule__SitePatterns__Group__0 ) ) ;
    public final void ruleSitePatterns() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:948:2: ( ( ( rule__SitePatterns__Group__0 ) ) )
            // InternalReactionRules.g:949:2: ( ( rule__SitePatterns__Group__0 ) )
            {
            // InternalReactionRules.g:949:2: ( ( rule__SitePatterns__Group__0 ) )
            // InternalReactionRules.g:950:3: ( rule__SitePatterns__Group__0 )
            {
             before(grammarAccess.getSitePatternsAccess().getGroup()); 
            // InternalReactionRules.g:951:3: ( rule__SitePatterns__Group__0 )
            // InternalReactionRules.g:951:4: rule__SitePatterns__Group__0
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
    // InternalReactionRules.g:960:1: entryRuleValidAgentPattern : ruleValidAgentPattern EOF ;
    public final void entryRuleValidAgentPattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:961:1: ( ruleValidAgentPattern EOF )
            // InternalReactionRules.g:962:1: ruleValidAgentPattern EOF
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
    // InternalReactionRules.g:969:1: ruleValidAgentPattern : ( ( rule__ValidAgentPattern__Group__0 ) ) ;
    public final void ruleValidAgentPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:973:2: ( ( ( rule__ValidAgentPattern__Group__0 ) ) )
            // InternalReactionRules.g:974:2: ( ( rule__ValidAgentPattern__Group__0 ) )
            {
            // InternalReactionRules.g:974:2: ( ( rule__ValidAgentPattern__Group__0 ) )
            // InternalReactionRules.g:975:3: ( rule__ValidAgentPattern__Group__0 )
            {
             before(grammarAccess.getValidAgentPatternAccess().getGroup()); 
            // InternalReactionRules.g:976:3: ( rule__ValidAgentPattern__Group__0 )
            // InternalReactionRules.g:976:4: rule__ValidAgentPattern__Group__0
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
    // InternalReactionRules.g:985:1: entryRuleVoidAgentPattern : ruleVoidAgentPattern EOF ;
    public final void entryRuleVoidAgentPattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:986:1: ( ruleVoidAgentPattern EOF )
            // InternalReactionRules.g:987:1: ruleVoidAgentPattern EOF
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
    // InternalReactionRules.g:994:1: ruleVoidAgentPattern : ( ( rule__VoidAgentPattern__PatternAssignment ) ) ;
    public final void ruleVoidAgentPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:998:2: ( ( ( rule__VoidAgentPattern__PatternAssignment ) ) )
            // InternalReactionRules.g:999:2: ( ( rule__VoidAgentPattern__PatternAssignment ) )
            {
            // InternalReactionRules.g:999:2: ( ( rule__VoidAgentPattern__PatternAssignment ) )
            // InternalReactionRules.g:1000:3: ( rule__VoidAgentPattern__PatternAssignment )
            {
             before(grammarAccess.getVoidAgentPatternAccess().getPatternAssignment()); 
            // InternalReactionRules.g:1001:3: ( rule__VoidAgentPattern__PatternAssignment )
            // InternalReactionRules.g:1001:4: rule__VoidAgentPattern__PatternAssignment
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
    // InternalReactionRules.g:1010:1: entryRuleAgentPattern : ruleAgentPattern EOF ;
    public final void entryRuleAgentPattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:1011:1: ( ruleAgentPattern EOF )
            // InternalReactionRules.g:1012:1: ruleAgentPattern EOF
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
    // InternalReactionRules.g:1019:1: ruleAgentPattern : ( ( rule__AgentPattern__Alternatives ) ) ;
    public final void ruleAgentPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1023:2: ( ( ( rule__AgentPattern__Alternatives ) ) )
            // InternalReactionRules.g:1024:2: ( ( rule__AgentPattern__Alternatives ) )
            {
            // InternalReactionRules.g:1024:2: ( ( rule__AgentPattern__Alternatives ) )
            // InternalReactionRules.g:1025:3: ( rule__AgentPattern__Alternatives )
            {
             before(grammarAccess.getAgentPatternAccess().getAlternatives()); 
            // InternalReactionRules.g:1026:3: ( rule__AgentPattern__Alternatives )
            // InternalReactionRules.g:1026:4: rule__AgentPattern__Alternatives
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
    // InternalReactionRules.g:1035:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:1036:1: ( rulePattern EOF )
            // InternalReactionRules.g:1037:1: rulePattern EOF
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
    // InternalReactionRules.g:1044:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1048:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalReactionRules.g:1049:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalReactionRules.g:1049:2: ( ( rule__Pattern__Group__0 ) )
            // InternalReactionRules.g:1050:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalReactionRules.g:1051:3: ( rule__Pattern__Group__0 )
            // InternalReactionRules.g:1051:4: rule__Pattern__Group__0
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
    // InternalReactionRules.g:1060:1: entryRuleObservation : ruleObservation EOF ;
    public final void entryRuleObservation() throws RecognitionException {
        try {
            // InternalReactionRules.g:1061:1: ( ruleObservation EOF )
            // InternalReactionRules.g:1062:1: ruleObservation EOF
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
    // InternalReactionRules.g:1069:1: ruleObservation : ( ( rule__Observation__Group__0 ) ) ;
    public final void ruleObservation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1073:2: ( ( ( rule__Observation__Group__0 ) ) )
            // InternalReactionRules.g:1074:2: ( ( rule__Observation__Group__0 ) )
            {
            // InternalReactionRules.g:1074:2: ( ( rule__Observation__Group__0 ) )
            // InternalReactionRules.g:1075:3: ( rule__Observation__Group__0 )
            {
             before(grammarAccess.getObservationAccess().getGroup()); 
            // InternalReactionRules.g:1076:3: ( rule__Observation__Group__0 )
            // InternalReactionRules.g:1076:4: rule__Observation__Group__0
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
    // InternalReactionRules.g:1085:1: entryRuleNumericFromLiteral : ruleNumericFromLiteral EOF ;
    public final void entryRuleNumericFromLiteral() throws RecognitionException {
        try {
            // InternalReactionRules.g:1086:1: ( ruleNumericFromLiteral EOF )
            // InternalReactionRules.g:1087:1: ruleNumericFromLiteral EOF
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
    // InternalReactionRules.g:1094:1: ruleNumericFromLiteral : ( ( rule__NumericFromLiteral__ValueAssignment ) ) ;
    public final void ruleNumericFromLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1098:2: ( ( ( rule__NumericFromLiteral__ValueAssignment ) ) )
            // InternalReactionRules.g:1099:2: ( ( rule__NumericFromLiteral__ValueAssignment ) )
            {
            // InternalReactionRules.g:1099:2: ( ( rule__NumericFromLiteral__ValueAssignment ) )
            // InternalReactionRules.g:1100:3: ( rule__NumericFromLiteral__ValueAssignment )
            {
             before(grammarAccess.getNumericFromLiteralAccess().getValueAssignment()); 
            // InternalReactionRules.g:1101:3: ( rule__NumericFromLiteral__ValueAssignment )
            // InternalReactionRules.g:1101:4: rule__NumericFromLiteral__ValueAssignment
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
    // InternalReactionRules.g:1110:1: entryRuleNumericFromVariable : ruleNumericFromVariable EOF ;
    public final void entryRuleNumericFromVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:1111:1: ( ruleNumericFromVariable EOF )
            // InternalReactionRules.g:1112:1: ruleNumericFromVariable EOF
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
    // InternalReactionRules.g:1119:1: ruleNumericFromVariable : ( ( rule__NumericFromVariable__ValueVarAssignment ) ) ;
    public final void ruleNumericFromVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1123:2: ( ( ( rule__NumericFromVariable__ValueVarAssignment ) ) )
            // InternalReactionRules.g:1124:2: ( ( rule__NumericFromVariable__ValueVarAssignment ) )
            {
            // InternalReactionRules.g:1124:2: ( ( rule__NumericFromVariable__ValueVarAssignment ) )
            // InternalReactionRules.g:1125:3: ( rule__NumericFromVariable__ValueVarAssignment )
            {
             before(grammarAccess.getNumericFromVariableAccess().getValueVarAssignment()); 
            // InternalReactionRules.g:1126:3: ( rule__NumericFromVariable__ValueVarAssignment )
            // InternalReactionRules.g:1126:4: rule__NumericFromVariable__ValueVarAssignment
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
    // InternalReactionRules.g:1135:1: entryRuleNumericAssignment : ruleNumericAssignment EOF ;
    public final void entryRuleNumericAssignment() throws RecognitionException {
        try {
            // InternalReactionRules.g:1136:1: ( ruleNumericAssignment EOF )
            // InternalReactionRules.g:1137:1: ruleNumericAssignment EOF
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
    // InternalReactionRules.g:1144:1: ruleNumericAssignment : ( ( rule__NumericAssignment__Alternatives ) ) ;
    public final void ruleNumericAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1148:2: ( ( ( rule__NumericAssignment__Alternatives ) ) )
            // InternalReactionRules.g:1149:2: ( ( rule__NumericAssignment__Alternatives ) )
            {
            // InternalReactionRules.g:1149:2: ( ( rule__NumericAssignment__Alternatives ) )
            // InternalReactionRules.g:1150:3: ( rule__NumericAssignment__Alternatives )
            {
             before(grammarAccess.getNumericAssignmentAccess().getAlternatives()); 
            // InternalReactionRules.g:1151:3: ( rule__NumericAssignment__Alternatives )
            // InternalReactionRules.g:1151:4: rule__NumericAssignment__Alternatives
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
    // InternalReactionRules.g:1160:1: entryRuleInitial : ruleInitial EOF ;
    public final void entryRuleInitial() throws RecognitionException {
        try {
            // InternalReactionRules.g:1161:1: ( ruleInitial EOF )
            // InternalReactionRules.g:1162:1: ruleInitial EOF
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
    // InternalReactionRules.g:1169:1: ruleInitial : ( ( rule__Initial__Group__0 ) ) ;
    public final void ruleInitial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1173:2: ( ( ( rule__Initial__Group__0 ) ) )
            // InternalReactionRules.g:1174:2: ( ( rule__Initial__Group__0 ) )
            {
            // InternalReactionRules.g:1174:2: ( ( rule__Initial__Group__0 ) )
            // InternalReactionRules.g:1175:3: ( rule__Initial__Group__0 )
            {
             before(grammarAccess.getInitialAccess().getGroup()); 
            // InternalReactionRules.g:1176:3: ( rule__Initial__Group__0 )
            // InternalReactionRules.g:1176:4: rule__Initial__Group__0
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
    // InternalReactionRules.g:1185:1: entryRuleAssignFromPattern : ruleAssignFromPattern EOF ;
    public final void entryRuleAssignFromPattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:1186:1: ( ruleAssignFromPattern EOF )
            // InternalReactionRules.g:1187:1: ruleAssignFromPattern EOF
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
    // InternalReactionRules.g:1194:1: ruleAssignFromPattern : ( ( rule__AssignFromPattern__PatternAssignment ) ) ;
    public final void ruleAssignFromPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1198:2: ( ( ( rule__AssignFromPattern__PatternAssignment ) ) )
            // InternalReactionRules.g:1199:2: ( ( rule__AssignFromPattern__PatternAssignment ) )
            {
            // InternalReactionRules.g:1199:2: ( ( rule__AssignFromPattern__PatternAssignment ) )
            // InternalReactionRules.g:1200:3: ( rule__AssignFromPattern__PatternAssignment )
            {
             before(grammarAccess.getAssignFromPatternAccess().getPatternAssignment()); 
            // InternalReactionRules.g:1201:3: ( rule__AssignFromPattern__PatternAssignment )
            // InternalReactionRules.g:1201:4: rule__AssignFromPattern__PatternAssignment
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
    // InternalReactionRules.g:1210:1: entryRuleAssignFromVariable : ruleAssignFromVariable EOF ;
    public final void entryRuleAssignFromVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:1211:1: ( ruleAssignFromVariable EOF )
            // InternalReactionRules.g:1212:1: ruleAssignFromVariable EOF
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
    // InternalReactionRules.g:1219:1: ruleAssignFromVariable : ( ( rule__AssignFromVariable__PatternVarAssignment ) ) ;
    public final void ruleAssignFromVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1223:2: ( ( ( rule__AssignFromVariable__PatternVarAssignment ) ) )
            // InternalReactionRules.g:1224:2: ( ( rule__AssignFromVariable__PatternVarAssignment ) )
            {
            // InternalReactionRules.g:1224:2: ( ( rule__AssignFromVariable__PatternVarAssignment ) )
            // InternalReactionRules.g:1225:3: ( rule__AssignFromVariable__PatternVarAssignment )
            {
             before(grammarAccess.getAssignFromVariableAccess().getPatternVarAssignment()); 
            // InternalReactionRules.g:1226:3: ( rule__AssignFromVariable__PatternVarAssignment )
            // InternalReactionRules.g:1226:4: rule__AssignFromVariable__PatternVarAssignment
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
    // InternalReactionRules.g:1235:1: entryRulePatternAssignment : rulePatternAssignment EOF ;
    public final void entryRulePatternAssignment() throws RecognitionException {
        try {
            // InternalReactionRules.g:1236:1: ( rulePatternAssignment EOF )
            // InternalReactionRules.g:1237:1: rulePatternAssignment EOF
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
    // InternalReactionRules.g:1244:1: rulePatternAssignment : ( ( rule__PatternAssignment__Alternatives ) ) ;
    public final void rulePatternAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1248:2: ( ( ( rule__PatternAssignment__Alternatives ) ) )
            // InternalReactionRules.g:1249:2: ( ( rule__PatternAssignment__Alternatives ) )
            {
            // InternalReactionRules.g:1249:2: ( ( rule__PatternAssignment__Alternatives ) )
            // InternalReactionRules.g:1250:3: ( rule__PatternAssignment__Alternatives )
            {
             before(grammarAccess.getPatternAssignmentAccess().getAlternatives()); 
            // InternalReactionRules.g:1251:3: ( rule__PatternAssignment__Alternatives )
            // InternalReactionRules.g:1251:4: rule__PatternAssignment__Alternatives
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
    // InternalReactionRules.g:1260:1: entryRuleRuleVariables : ruleRuleVariables EOF ;
    public final void entryRuleRuleVariables() throws RecognitionException {
        try {
            // InternalReactionRules.g:1261:1: ( ruleRuleVariables EOF )
            // InternalReactionRules.g:1262:1: ruleRuleVariables EOF
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
    // InternalReactionRules.g:1269:1: ruleRuleVariables : ( ( rule__RuleVariables__Group__0 ) ) ;
    public final void ruleRuleVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1273:2: ( ( ( rule__RuleVariables__Group__0 ) ) )
            // InternalReactionRules.g:1274:2: ( ( rule__RuleVariables__Group__0 ) )
            {
            // InternalReactionRules.g:1274:2: ( ( rule__RuleVariables__Group__0 ) )
            // InternalReactionRules.g:1275:3: ( rule__RuleVariables__Group__0 )
            {
             before(grammarAccess.getRuleVariablesAccess().getGroup()); 
            // InternalReactionRules.g:1276:3: ( rule__RuleVariables__Group__0 )
            // InternalReactionRules.g:1276:4: rule__RuleVariables__Group__0
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
    // InternalReactionRules.g:1285:1: entryRuleUnidirectionalRule : ruleUnidirectionalRule EOF ;
    public final void entryRuleUnidirectionalRule() throws RecognitionException {
        try {
            // InternalReactionRules.g:1286:1: ( ruleUnidirectionalRule EOF )
            // InternalReactionRules.g:1287:1: ruleUnidirectionalRule EOF
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
    // InternalReactionRules.g:1294:1: ruleUnidirectionalRule : ( ( rule__UnidirectionalRule__Group__0 ) ) ;
    public final void ruleUnidirectionalRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1298:2: ( ( ( rule__UnidirectionalRule__Group__0 ) ) )
            // InternalReactionRules.g:1299:2: ( ( rule__UnidirectionalRule__Group__0 ) )
            {
            // InternalReactionRules.g:1299:2: ( ( rule__UnidirectionalRule__Group__0 ) )
            // InternalReactionRules.g:1300:3: ( rule__UnidirectionalRule__Group__0 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getGroup()); 
            // InternalReactionRules.g:1301:3: ( rule__UnidirectionalRule__Group__0 )
            // InternalReactionRules.g:1301:4: rule__UnidirectionalRule__Group__0
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
    // InternalReactionRules.g:1310:1: entryRuleBidirectionalRule : ruleBidirectionalRule EOF ;
    public final void entryRuleBidirectionalRule() throws RecognitionException {
        try {
            // InternalReactionRules.g:1311:1: ( ruleBidirectionalRule EOF )
            // InternalReactionRules.g:1312:1: ruleBidirectionalRule EOF
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
    // InternalReactionRules.g:1319:1: ruleBidirectionalRule : ( ( rule__BidirectionalRule__Group__0 ) ) ;
    public final void ruleBidirectionalRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1323:2: ( ( ( rule__BidirectionalRule__Group__0 ) ) )
            // InternalReactionRules.g:1324:2: ( ( rule__BidirectionalRule__Group__0 ) )
            {
            // InternalReactionRules.g:1324:2: ( ( rule__BidirectionalRule__Group__0 ) )
            // InternalReactionRules.g:1325:3: ( rule__BidirectionalRule__Group__0 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getGroup()); 
            // InternalReactionRules.g:1326:3: ( rule__BidirectionalRule__Group__0 )
            // InternalReactionRules.g:1326:4: rule__BidirectionalRule__Group__0
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
    // InternalReactionRules.g:1335:1: entryRuleRuleBody : ruleRuleBody EOF ;
    public final void entryRuleRuleBody() throws RecognitionException {
        try {
            // InternalReactionRules.g:1336:1: ( ruleRuleBody EOF )
            // InternalReactionRules.g:1337:1: ruleRuleBody EOF
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
    // InternalReactionRules.g:1344:1: ruleRuleBody : ( ( rule__RuleBody__Alternatives ) ) ;
    public final void ruleRuleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1348:2: ( ( ( rule__RuleBody__Alternatives ) ) )
            // InternalReactionRules.g:1349:2: ( ( rule__RuleBody__Alternatives ) )
            {
            // InternalReactionRules.g:1349:2: ( ( rule__RuleBody__Alternatives ) )
            // InternalReactionRules.g:1350:3: ( rule__RuleBody__Alternatives )
            {
             before(grammarAccess.getRuleBodyAccess().getAlternatives()); 
            // InternalReactionRules.g:1351:3: ( rule__RuleBody__Alternatives )
            // InternalReactionRules.g:1351:4: rule__RuleBody__Alternatives
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
    // InternalReactionRules.g:1360:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalReactionRules.g:1361:1: ( ruleRule EOF )
            // InternalReactionRules.g:1362:1: ruleRule EOF
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
    // InternalReactionRules.g:1369:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1373:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalReactionRules.g:1374:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalReactionRules.g:1374:2: ( ( rule__Rule__Group__0 ) )
            // InternalReactionRules.g:1375:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalReactionRules.g:1376:3: ( rule__Rule__Group__0 )
            // InternalReactionRules.g:1376:4: rule__Rule__Group__0
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
    // InternalReactionRules.g:1385:1: entryRuleIterations : ruleIterations EOF ;
    public final void entryRuleIterations() throws RecognitionException {
        try {
            // InternalReactionRules.g:1386:1: ( ruleIterations EOF )
            // InternalReactionRules.g:1387:1: ruleIterations EOF
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
    // InternalReactionRules.g:1394:1: ruleIterations : ( ( rule__Iterations__Group__0 ) ) ;
    public final void ruleIterations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1398:2: ( ( ( rule__Iterations__Group__0 ) ) )
            // InternalReactionRules.g:1399:2: ( ( rule__Iterations__Group__0 ) )
            {
            // InternalReactionRules.g:1399:2: ( ( rule__Iterations__Group__0 ) )
            // InternalReactionRules.g:1400:3: ( rule__Iterations__Group__0 )
            {
             before(grammarAccess.getIterationsAccess().getGroup()); 
            // InternalReactionRules.g:1401:3: ( rule__Iterations__Group__0 )
            // InternalReactionRules.g:1401:4: rule__Iterations__Group__0
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
    // InternalReactionRules.g:1410:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // InternalReactionRules.g:1411:1: ( ruleTime EOF )
            // InternalReactionRules.g:1412:1: ruleTime EOF
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
    // InternalReactionRules.g:1419:1: ruleTime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1423:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalReactionRules.g:1424:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalReactionRules.g:1424:2: ( ( rule__Time__Group__0 ) )
            // InternalReactionRules.g:1425:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup()); 
            // InternalReactionRules.g:1426:3: ( rule__Time__Group__0 )
            // InternalReactionRules.g:1426:4: rule__Time__Group__0
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
    // InternalReactionRules.g:1435:1: entryRulePopulation : rulePopulation EOF ;
    public final void entryRulePopulation() throws RecognitionException {
        try {
            // InternalReactionRules.g:1436:1: ( rulePopulation EOF )
            // InternalReactionRules.g:1437:1: rulePopulation EOF
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
    // InternalReactionRules.g:1444:1: rulePopulation : ( ( rule__Population__Group__0 ) ) ;
    public final void rulePopulation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1448:2: ( ( ( rule__Population__Group__0 ) ) )
            // InternalReactionRules.g:1449:2: ( ( rule__Population__Group__0 ) )
            {
            // InternalReactionRules.g:1449:2: ( ( rule__Population__Group__0 ) )
            // InternalReactionRules.g:1450:3: ( rule__Population__Group__0 )
            {
             before(grammarAccess.getPopulationAccess().getGroup()); 
            // InternalReactionRules.g:1451:3: ( rule__Population__Group__0 )
            // InternalReactionRules.g:1451:4: rule__Population__Group__0
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
    // InternalReactionRules.g:1460:1: entryRuleTerminationCondition : ruleTerminationCondition EOF ;
    public final void entryRuleTerminationCondition() throws RecognitionException {
        try {
            // InternalReactionRules.g:1461:1: ( ruleTerminationCondition EOF )
            // InternalReactionRules.g:1462:1: ruleTerminationCondition EOF
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
    // InternalReactionRules.g:1469:1: ruleTerminationCondition : ( ( rule__TerminationCondition__Alternatives ) ) ;
    public final void ruleTerminationCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1473:2: ( ( ( rule__TerminationCondition__Alternatives ) ) )
            // InternalReactionRules.g:1474:2: ( ( rule__TerminationCondition__Alternatives ) )
            {
            // InternalReactionRules.g:1474:2: ( ( rule__TerminationCondition__Alternatives ) )
            // InternalReactionRules.g:1475:3: ( rule__TerminationCondition__Alternatives )
            {
             before(grammarAccess.getTerminationConditionAccess().getAlternatives()); 
            // InternalReactionRules.g:1476:3: ( rule__TerminationCondition__Alternatives )
            // InternalReactionRules.g:1476:4: rule__TerminationCondition__Alternatives
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
    // InternalReactionRules.g:1485:1: entryRuleTerminate : ruleTerminate EOF ;
    public final void entryRuleTerminate() throws RecognitionException {
        try {
            // InternalReactionRules.g:1486:1: ( ruleTerminate EOF )
            // InternalReactionRules.g:1487:1: ruleTerminate EOF
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
    // InternalReactionRules.g:1494:1: ruleTerminate : ( ( rule__Terminate__Group__0 ) ) ;
    public final void ruleTerminate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1498:2: ( ( ( rule__Terminate__Group__0 ) ) )
            // InternalReactionRules.g:1499:2: ( ( rule__Terminate__Group__0 ) )
            {
            // InternalReactionRules.g:1499:2: ( ( rule__Terminate__Group__0 ) )
            // InternalReactionRules.g:1500:3: ( rule__Terminate__Group__0 )
            {
             before(grammarAccess.getTerminateAccess().getGroup()); 
            // InternalReactionRules.g:1501:3: ( rule__Terminate__Group__0 )
            // InternalReactionRules.g:1501:4: rule__Terminate__Group__0
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
    // InternalReactionRules.g:1509:1: rule__ReactionProperty__Alternatives : ( ( ruleAgent ) | ( ruleVariable ) | ( ruleObservation ) | ( ruleInitial ) | ( ruleRule ) | ( ruleTerminate ) );
    public final void rule__ReactionProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1513:1: ( ( ruleAgent ) | ( ruleVariable ) | ( ruleObservation ) | ( ruleInitial ) | ( ruleRule ) | ( ruleTerminate ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 35:
                {
                alt1=3;
                }
                break;
            case 36:
                {
                alt1=4;
                }
                break;
            case 37:
                {
                alt1=5;
                }
                break;
            case 42:
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
                    // InternalReactionRules.g:1514:2: ( ruleAgent )
                    {
                    // InternalReactionRules.g:1514:2: ( ruleAgent )
                    // InternalReactionRules.g:1515:3: ruleAgent
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
                    // InternalReactionRules.g:1520:2: ( ruleVariable )
                    {
                    // InternalReactionRules.g:1520:2: ( ruleVariable )
                    // InternalReactionRules.g:1521:3: ruleVariable
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
                    // InternalReactionRules.g:1526:2: ( ruleObservation )
                    {
                    // InternalReactionRules.g:1526:2: ( ruleObservation )
                    // InternalReactionRules.g:1527:3: ruleObservation
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
                    // InternalReactionRules.g:1532:2: ( ruleInitial )
                    {
                    // InternalReactionRules.g:1532:2: ( ruleInitial )
                    // InternalReactionRules.g:1533:3: ruleInitial
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
                    // InternalReactionRules.g:1538:2: ( ruleRule )
                    {
                    // InternalReactionRules.g:1538:2: ( ruleRule )
                    // InternalReactionRules.g:1539:3: ruleRule
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
                    // InternalReactionRules.g:1544:2: ( ruleTerminate )
                    {
                    // InternalReactionRules.g:1544:2: ( ruleTerminate )
                    // InternalReactionRules.g:1545:3: ruleTerminate
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
    // InternalReactionRules.g:1554:1: rule__ScientificFloat__Alternatives_5 : ( ( '-' ) | ( '+' ) );
    public final void rule__ScientificFloat__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1558:1: ( ( '-' ) | ( '+' ) )
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
                    // InternalReactionRules.g:1559:2: ( '-' )
                    {
                    // InternalReactionRules.g:1559:2: ( '-' )
                    // InternalReactionRules.g:1560:3: '-'
                    {
                     before(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_5_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1565:2: ( '+' )
                    {
                    // InternalReactionRules.g:1565:2: ( '+' )
                    // InternalReactionRules.g:1566:3: '+'
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
    // InternalReactionRules.g:1575:1: rule__ArithmeticType__Alternatives : ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) );
    public final void rule__ArithmeticType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1579:1: ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalReactionRules.g:1580:2: ( ruleFloat )
                    {
                    // InternalReactionRules.g:1580:2: ( ruleFloat )
                    // InternalReactionRules.g:1581:3: ruleFloat
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
                    // InternalReactionRules.g:1586:2: ( ruleUnsignedInteger )
                    {
                    // InternalReactionRules.g:1586:2: ( ruleUnsignedInteger )
                    // InternalReactionRules.g:1587:3: ruleUnsignedInteger
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
                    // InternalReactionRules.g:1592:2: ( ruleSignedInteger )
                    {
                    // InternalReactionRules.g:1592:2: ( ruleSignedInteger )
                    // InternalReactionRules.g:1593:3: ruleSignedInteger
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
                    // InternalReactionRules.g:1598:2: ( ruleScientificFloat )
                    {
                    // InternalReactionRules.g:1598:2: ( ruleScientificFloat )
                    // InternalReactionRules.g:1599:3: ruleScientificFloat
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


    // $ANTLR start "rule__Site__Alternatives"
    // InternalReactionRules.g:1608:1: rule__Site__Alternatives : ( ( ruleSingleSite ) | ( ruleMultiSite ) );
    public final void rule__Site__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1612:1: ( ( ruleSingleSite ) | ( ruleMultiSite ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalReactionRules.g:1613:2: ( ruleSingleSite )
                    {
                    // InternalReactionRules.g:1613:2: ( ruleSingleSite )
                    // InternalReactionRules.g:1614:3: ruleSingleSite
                    {
                     before(grammarAccess.getSiteAccess().getSingleSiteParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleSite();

                    state._fsp--;

                     after(grammarAccess.getSiteAccess().getSingleSiteParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1619:2: ( ruleMultiSite )
                    {
                    // InternalReactionRules.g:1619:2: ( ruleMultiSite )
                    // InternalReactionRules.g:1620:3: ruleMultiSite
                    {
                     before(grammarAccess.getSiteAccess().getMultiSiteParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiSite();

                    state._fsp--;

                     after(grammarAccess.getSiteAccess().getMultiSiteParserRuleCall_1()); 

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
    // $ANTLR end "rule__Site__Alternatives"


    // $ANTLR start "rule__Variable__Alternatives"
    // InternalReactionRules.g:1629:1: rule__Variable__Alternatives : ( ( rulePatternVariable ) | ( ruleArithmeticVariable ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1633:1: ( ( rulePatternVariable ) | ( ruleArithmeticVariable ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==31) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==23) ) {
                            alt5=1;
                        }
                        else if ( (LA5_3==RULE_INT||LA5_3==19) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalReactionRules.g:1634:2: ( rulePatternVariable )
                    {
                    // InternalReactionRules.g:1634:2: ( rulePatternVariable )
                    // InternalReactionRules.g:1635:3: rulePatternVariable
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
                    // InternalReactionRules.g:1640:2: ( ruleArithmeticVariable )
                    {
                    // InternalReactionRules.g:1640:2: ( ruleArithmeticVariable )
                    // InternalReactionRules.g:1641:3: ruleArithmeticVariable
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


    // $ANTLR start "rule__MultiLink__StatesAlternatives_1_0_0"
    // InternalReactionRules.g:1650:1: rule__MultiLink__StatesAlternatives_1_0_0 : ( ( ruleBoundLink ) | ( ruleIndexedFreeLink ) );
    public final void rule__MultiLink__StatesAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1654:1: ( ( ruleBoundLink ) | ( ruleIndexedFreeLink ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_FREE_LINK) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalReactionRules.g:1655:2: ( ruleBoundLink )
                    {
                    // InternalReactionRules.g:1655:2: ( ruleBoundLink )
                    // InternalReactionRules.g:1656:3: ruleBoundLink
                    {
                     before(grammarAccess.getMultiLinkAccess().getStatesBoundLinkParserRuleCall_1_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBoundLink();

                    state._fsp--;

                     after(grammarAccess.getMultiLinkAccess().getStatesBoundLinkParserRuleCall_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1661:2: ( ruleIndexedFreeLink )
                    {
                    // InternalReactionRules.g:1661:2: ( ruleIndexedFreeLink )
                    // InternalReactionRules.g:1662:3: ruleIndexedFreeLink
                    {
                     before(grammarAccess.getMultiLinkAccess().getStatesIndexedFreeLinkParserRuleCall_1_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIndexedFreeLink();

                    state._fsp--;

                     after(grammarAccess.getMultiLinkAccess().getStatesIndexedFreeLinkParserRuleCall_1_0_0_1()); 

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
    // $ANTLR end "rule__MultiLink__StatesAlternatives_1_0_0"


    // $ANTLR start "rule__MultiLink__StatesAlternatives_1_1_1_0"
    // InternalReactionRules.g:1671:1: rule__MultiLink__StatesAlternatives_1_1_1_0 : ( ( ruleBoundLink ) | ( ruleIndexedFreeLink ) );
    public final void rule__MultiLink__StatesAlternatives_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1675:1: ( ( ruleBoundLink ) | ( ruleIndexedFreeLink ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_FREE_LINK) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalReactionRules.g:1676:2: ( ruleBoundLink )
                    {
                    // InternalReactionRules.g:1676:2: ( ruleBoundLink )
                    // InternalReactionRules.g:1677:3: ruleBoundLink
                    {
                     before(grammarAccess.getMultiLinkAccess().getStatesBoundLinkParserRuleCall_1_1_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBoundLink();

                    state._fsp--;

                     after(grammarAccess.getMultiLinkAccess().getStatesBoundLinkParserRuleCall_1_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1682:2: ( ruleIndexedFreeLink )
                    {
                    // InternalReactionRules.g:1682:2: ( ruleIndexedFreeLink )
                    // InternalReactionRules.g:1683:3: ruleIndexedFreeLink
                    {
                     before(grammarAccess.getMultiLinkAccess().getStatesIndexedFreeLinkParserRuleCall_1_1_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIndexedFreeLink();

                    state._fsp--;

                     after(grammarAccess.getMultiLinkAccess().getStatesIndexedFreeLinkParserRuleCall_1_1_1_0_1()); 

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
    // $ANTLR end "rule__MultiLink__StatesAlternatives_1_1_1_0"


    // $ANTLR start "rule__LinkState__LinkStateAlternatives_2_0"
    // InternalReactionRules.g:1692:1: rule__LinkState__LinkStateAlternatives_2_0 : ( ( ruleBoundAnyLink ) | ( ruleFreeLink ) | ( ruleIndexedFreeLink ) | ( ruleBoundAnyOfTypeLink ) | ( ruleBoundLink ) | ( ruleWhatEver ) );
    public final void rule__LinkState__LinkStateAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1696:1: ( ( ruleBoundAnyLink ) | ( ruleFreeLink ) | ( ruleIndexedFreeLink ) | ( ruleBoundAnyOfTypeLink ) | ( ruleBoundLink ) | ( ruleWhatEver ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_BOUND_LINK:
                {
                alt8=1;
                }
                break;
            case RULE_FREE_LINK:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==27) ) {
                    alt8=3;
                }
                else if ( (LA8_2==33) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt8=4;
                }
                break;
            case RULE_INT:
                {
                alt8=5;
                }
                break;
            case RULE_WHATEVER_LINK:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalReactionRules.g:1697:2: ( ruleBoundAnyLink )
                    {
                    // InternalReactionRules.g:1697:2: ( ruleBoundAnyLink )
                    // InternalReactionRules.g:1698:3: ruleBoundAnyLink
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
                    // InternalReactionRules.g:1703:2: ( ruleFreeLink )
                    {
                    // InternalReactionRules.g:1703:2: ( ruleFreeLink )
                    // InternalReactionRules.g:1704:3: ruleFreeLink
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
                    // InternalReactionRules.g:1709:2: ( ruleIndexedFreeLink )
                    {
                    // InternalReactionRules.g:1709:2: ( ruleIndexedFreeLink )
                    // InternalReactionRules.g:1710:3: ruleIndexedFreeLink
                    {
                     before(grammarAccess.getLinkStateAccess().getLinkStateIndexedFreeLinkParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIndexedFreeLink();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getLinkStateIndexedFreeLinkParserRuleCall_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalReactionRules.g:1715:2: ( ruleBoundAnyOfTypeLink )
                    {
                    // InternalReactionRules.g:1715:2: ( ruleBoundAnyOfTypeLink )
                    // InternalReactionRules.g:1716:3: ruleBoundAnyOfTypeLink
                    {
                     before(grammarAccess.getLinkStateAccess().getLinkStateBoundAnyOfTypeLinkParserRuleCall_2_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBoundAnyOfTypeLink();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getLinkStateBoundAnyOfTypeLinkParserRuleCall_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalReactionRules.g:1721:2: ( ruleBoundLink )
                    {
                    // InternalReactionRules.g:1721:2: ( ruleBoundLink )
                    // InternalReactionRules.g:1722:3: ruleBoundLink
                    {
                     before(grammarAccess.getLinkStateAccess().getLinkStateBoundLinkParserRuleCall_2_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleBoundLink();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getLinkStateBoundLinkParserRuleCall_2_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalReactionRules.g:1727:2: ( ruleWhatEver )
                    {
                    // InternalReactionRules.g:1727:2: ( ruleWhatEver )
                    // InternalReactionRules.g:1728:3: ruleWhatEver
                    {
                     before(grammarAccess.getLinkStateAccess().getLinkStateWhatEverParserRuleCall_2_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleWhatEver();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getLinkStateWhatEverParserRuleCall_2_0_5()); 

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


    // $ANTLR start "rule__MultiLinkState__LinkStateAlternatives_2_0"
    // InternalReactionRules.g:1737:1: rule__MultiLinkState__LinkStateAlternatives_2_0 : ( ( ruleWhatEver ) | ( ruleFreeLink ) | ( ruleIndexedFreeLink ) | ( ruleBoundAnyLink ) | ( ruleBoundLink ) | ( ruleMultiLink ) );
    public final void rule__MultiLinkState__LinkStateAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1741:1: ( ( ruleWhatEver ) | ( ruleFreeLink ) | ( ruleIndexedFreeLink ) | ( ruleBoundAnyLink ) | ( ruleBoundLink ) | ( ruleMultiLink ) )
            int alt9=6;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalReactionRules.g:1742:2: ( ruleWhatEver )
                    {
                    // InternalReactionRules.g:1742:2: ( ruleWhatEver )
                    // InternalReactionRules.g:1743:3: ruleWhatEver
                    {
                     before(grammarAccess.getMultiLinkStateAccess().getLinkStateWhatEverParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWhatEver();

                    state._fsp--;

                     after(grammarAccess.getMultiLinkStateAccess().getLinkStateWhatEverParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1748:2: ( ruleFreeLink )
                    {
                    // InternalReactionRules.g:1748:2: ( ruleFreeLink )
                    // InternalReactionRules.g:1749:3: ruleFreeLink
                    {
                     before(grammarAccess.getMultiLinkStateAccess().getLinkStateFreeLinkParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFreeLink();

                    state._fsp--;

                     after(grammarAccess.getMultiLinkStateAccess().getLinkStateFreeLinkParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReactionRules.g:1754:2: ( ruleIndexedFreeLink )
                    {
                    // InternalReactionRules.g:1754:2: ( ruleIndexedFreeLink )
                    // InternalReactionRules.g:1755:3: ruleIndexedFreeLink
                    {
                     before(grammarAccess.getMultiLinkStateAccess().getLinkStateIndexedFreeLinkParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIndexedFreeLink();

                    state._fsp--;

                     after(grammarAccess.getMultiLinkStateAccess().getLinkStateIndexedFreeLinkParserRuleCall_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalReactionRules.g:1760:2: ( ruleBoundAnyLink )
                    {
                    // InternalReactionRules.g:1760:2: ( ruleBoundAnyLink )
                    // InternalReactionRules.g:1761:3: ruleBoundAnyLink
                    {
                     before(grammarAccess.getMultiLinkStateAccess().getLinkStateBoundAnyLinkParserRuleCall_2_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBoundAnyLink();

                    state._fsp--;

                     after(grammarAccess.getMultiLinkStateAccess().getLinkStateBoundAnyLinkParserRuleCall_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalReactionRules.g:1766:2: ( ruleBoundLink )
                    {
                    // InternalReactionRules.g:1766:2: ( ruleBoundLink )
                    // InternalReactionRules.g:1767:3: ruleBoundLink
                    {
                     before(grammarAccess.getMultiLinkStateAccess().getLinkStateBoundLinkParserRuleCall_2_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleBoundLink();

                    state._fsp--;

                     after(grammarAccess.getMultiLinkStateAccess().getLinkStateBoundLinkParserRuleCall_2_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalReactionRules.g:1772:2: ( ruleMultiLink )
                    {
                    // InternalReactionRules.g:1772:2: ( ruleMultiLink )
                    // InternalReactionRules.g:1773:3: ruleMultiLink
                    {
                     before(grammarAccess.getMultiLinkStateAccess().getLinkStateMultiLinkParserRuleCall_2_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiLink();

                    state._fsp--;

                     after(grammarAccess.getMultiLinkStateAccess().getLinkStateMultiLinkParserRuleCall_2_0_5()); 

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
    // $ANTLR end "rule__MultiLinkState__LinkStateAlternatives_2_0"


    // $ANTLR start "rule__SitePattern__Alternatives"
    // InternalReactionRules.g:1782:1: rule__SitePattern__Alternatives : ( ( ruleSingleSitePattern ) | ( ruleMultiLinkSitePattern ) );
    public final void rule__SitePattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1786:1: ( ( ruleSingleSitePattern ) | ( ruleMultiLinkSitePattern ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==RULE_ID) ) {
                        int LA10_5 = input.LA(4);

                        if ( (LA10_5==24) ) {
                            int LA10_6 = input.LA(5);

                            if ( (LA10_6==34) ) {
                                alt10=2;
                            }
                            else if ( (LA10_6==32) ) {
                                alt10=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 32:
                    {
                    alt10=1;
                    }
                    break;
                case 34:
                    {
                    alt10=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalReactionRules.g:1787:2: ( ruleSingleSitePattern )
                    {
                    // InternalReactionRules.g:1787:2: ( ruleSingleSitePattern )
                    // InternalReactionRules.g:1788:3: ruleSingleSitePattern
                    {
                     before(grammarAccess.getSitePatternAccess().getSingleSitePatternParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleSitePattern();

                    state._fsp--;

                     after(grammarAccess.getSitePatternAccess().getSingleSitePatternParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1793:2: ( ruleMultiLinkSitePattern )
                    {
                    // InternalReactionRules.g:1793:2: ( ruleMultiLinkSitePattern )
                    // InternalReactionRules.g:1794:3: ruleMultiLinkSitePattern
                    {
                     before(grammarAccess.getSitePatternAccess().getMultiLinkSitePatternParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiLinkSitePattern();

                    state._fsp--;

                     after(grammarAccess.getSitePatternAccess().getMultiLinkSitePatternParserRuleCall_1()); 

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
    // $ANTLR end "rule__SitePattern__Alternatives"


    // $ANTLR start "rule__AgentPattern__Alternatives"
    // InternalReactionRules.g:1803:1: rule__AgentPattern__Alternatives : ( ( ruleValidAgentPattern ) | ( ruleVoidAgentPattern ) );
    public final void rule__AgentPattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1807:1: ( ( ruleValidAgentPattern ) | ( ruleVoidAgentPattern ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_VOID_PATTERN) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalReactionRules.g:1808:2: ( ruleValidAgentPattern )
                    {
                    // InternalReactionRules.g:1808:2: ( ruleValidAgentPattern )
                    // InternalReactionRules.g:1809:3: ruleValidAgentPattern
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
                    // InternalReactionRules.g:1814:2: ( ruleVoidAgentPattern )
                    {
                    // InternalReactionRules.g:1814:2: ( ruleVoidAgentPattern )
                    // InternalReactionRules.g:1815:3: ruleVoidAgentPattern
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
    // InternalReactionRules.g:1824:1: rule__NumericAssignment__Alternatives : ( ( ruleNumericFromLiteral ) | ( ruleNumericFromVariable ) );
    public final void rule__NumericAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1828:1: ( ( ruleNumericFromLiteral ) | ( ruleNumericFromVariable ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT||LA12_0==19) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalReactionRules.g:1829:2: ( ruleNumericFromLiteral )
                    {
                    // InternalReactionRules.g:1829:2: ( ruleNumericFromLiteral )
                    // InternalReactionRules.g:1830:3: ruleNumericFromLiteral
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
                    // InternalReactionRules.g:1835:2: ( ruleNumericFromVariable )
                    {
                    // InternalReactionRules.g:1835:2: ( ruleNumericFromVariable )
                    // InternalReactionRules.g:1836:3: ruleNumericFromVariable
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
    // InternalReactionRules.g:1845:1: rule__PatternAssignment__Alternatives : ( ( ruleAssignFromPattern ) | ( ruleAssignFromVariable ) );
    public final void rule__PatternAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1849:1: ( ( ruleAssignFromPattern ) | ( ruleAssignFromVariable ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalReactionRules.g:1850:2: ( ruleAssignFromPattern )
                    {
                    // InternalReactionRules.g:1850:2: ( ruleAssignFromPattern )
                    // InternalReactionRules.g:1851:3: ruleAssignFromPattern
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
                    // InternalReactionRules.g:1856:2: ( ruleAssignFromVariable )
                    {
                    // InternalReactionRules.g:1856:2: ( ruleAssignFromVariable )
                    // InternalReactionRules.g:1857:3: ruleAssignFromVariable
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
    // InternalReactionRules.g:1866:1: rule__RuleBody__Alternatives : ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) );
    public final void rule__RuleBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1870:1: ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalReactionRules.g:1871:2: ( ruleUnidirectionalRule )
                    {
                    // InternalReactionRules.g:1871:2: ( ruleUnidirectionalRule )
                    // InternalReactionRules.g:1872:3: ruleUnidirectionalRule
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
                    // InternalReactionRules.g:1877:2: ( ruleBidirectionalRule )
                    {
                    // InternalReactionRules.g:1877:2: ( ruleBidirectionalRule )
                    // InternalReactionRules.g:1878:3: ruleBidirectionalRule
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
    // InternalReactionRules.g:1887:1: rule__TerminationCondition__Alternatives : ( ( ruleIterations ) | ( ruleTime ) | ( rulePopulation ) );
    public final void rule__TerminationCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1891:1: ( ( ruleIterations ) | ( ruleTime ) | ( rulePopulation ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt15=1;
                }
                break;
            case 39:
                {
                alt15=2;
                }
                break;
            case 40:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalReactionRules.g:1892:2: ( ruleIterations )
                    {
                    // InternalReactionRules.g:1892:2: ( ruleIterations )
                    // InternalReactionRules.g:1893:3: ruleIterations
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
                    // InternalReactionRules.g:1898:2: ( ruleTime )
                    {
                    // InternalReactionRules.g:1898:2: ( ruleTime )
                    // InternalReactionRules.g:1899:3: ruleTime
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
                    // InternalReactionRules.g:1904:2: ( rulePopulation )
                    {
                    // InternalReactionRules.g:1904:2: ( rulePopulation )
                    // InternalReactionRules.g:1905:3: rulePopulation
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
    // InternalReactionRules.g:1914:1: rule__ReactionRuleModel__Group__0 : rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1 ;
    public final void rule__ReactionRuleModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1918:1: ( rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1 )
            // InternalReactionRules.g:1919:2: rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1
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
    // InternalReactionRules.g:1926:1: rule__ReactionRuleModel__Group__0__Impl : ( ( rule__ReactionRuleModel__ModelAssignment_0 ) ) ;
    public final void rule__ReactionRuleModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1930:1: ( ( ( rule__ReactionRuleModel__ModelAssignment_0 ) ) )
            // InternalReactionRules.g:1931:1: ( ( rule__ReactionRuleModel__ModelAssignment_0 ) )
            {
            // InternalReactionRules.g:1931:1: ( ( rule__ReactionRuleModel__ModelAssignment_0 ) )
            // InternalReactionRules.g:1932:2: ( rule__ReactionRuleModel__ModelAssignment_0 )
            {
             before(grammarAccess.getReactionRuleModelAccess().getModelAssignment_0()); 
            // InternalReactionRules.g:1933:2: ( rule__ReactionRuleModel__ModelAssignment_0 )
            // InternalReactionRules.g:1933:3: rule__ReactionRuleModel__ModelAssignment_0
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
    // InternalReactionRules.g:1941:1: rule__ReactionRuleModel__Group__1 : rule__ReactionRuleModel__Group__1__Impl ;
    public final void rule__ReactionRuleModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1945:1: ( rule__ReactionRuleModel__Group__1__Impl )
            // InternalReactionRules.g:1946:2: rule__ReactionRuleModel__Group__1__Impl
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
    // InternalReactionRules.g:1952:1: rule__ReactionRuleModel__Group__1__Impl : ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )* ) ;
    public final void rule__ReactionRuleModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1956:1: ( ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )* ) )
            // InternalReactionRules.g:1957:1: ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )* )
            {
            // InternalReactionRules.g:1957:1: ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )* )
            // InternalReactionRules.g:1958:2: ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )*
            {
             before(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesAssignment_1()); 
            // InternalReactionRules.g:1959:2: ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=29 && LA16_0<=30)||(LA16_0>=35 && LA16_0<=37)||LA16_0==42) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalReactionRules.g:1959:3: rule__ReactionRuleModel__ReactionPropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ReactionRuleModel__ReactionPropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalReactionRules.g:1968:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1972:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalReactionRules.g:1973:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalReactionRules.g:1980:1: rule__Model__Group__0__Impl : ( 'ModelID' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1984:1: ( ( 'ModelID' ) )
            // InternalReactionRules.g:1985:1: ( 'ModelID' )
            {
            // InternalReactionRules.g:1985:1: ( 'ModelID' )
            // InternalReactionRules.g:1986:2: 'ModelID'
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
    // InternalReactionRules.g:1995:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1999:1: ( rule__Model__Group__1__Impl )
            // InternalReactionRules.g:2000:2: rule__Model__Group__1__Impl
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
    // InternalReactionRules.g:2006:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2010:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalReactionRules.g:2011:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:2011:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalReactionRules.g:2012:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:2013:2: ( rule__Model__NameAssignment_1 )
            // InternalReactionRules.g:2013:3: rule__Model__NameAssignment_1
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
    // InternalReactionRules.g:2022:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2026:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalReactionRules.g:2027:2: rule__Float__Group__0__Impl rule__Float__Group__1
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
    // InternalReactionRules.g:2034:1: rule__Float__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2038:1: ( ( ( '-' )? ) )
            // InternalReactionRules.g:2039:1: ( ( '-' )? )
            {
            // InternalReactionRules.g:2039:1: ( ( '-' )? )
            // InternalReactionRules.g:2040:2: ( '-' )?
            {
             before(grammarAccess.getFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalReactionRules.g:2041:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalReactionRules.g:2041:3: '-'
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
    // InternalReactionRules.g:2049:1: rule__Float__Group__1 : rule__Float__Group__1__Impl rule__Float__Group__2 ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2053:1: ( rule__Float__Group__1__Impl rule__Float__Group__2 )
            // InternalReactionRules.g:2054:2: rule__Float__Group__1__Impl rule__Float__Group__2
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
    // InternalReactionRules.g:2061:1: rule__Float__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2065:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2066:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2066:1: ( RULE_INT )
            // InternalReactionRules.g:2067:2: RULE_INT
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
    // InternalReactionRules.g:2076:1: rule__Float__Group__2 : rule__Float__Group__2__Impl rule__Float__Group__3 ;
    public final void rule__Float__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2080:1: ( rule__Float__Group__2__Impl rule__Float__Group__3 )
            // InternalReactionRules.g:2081:2: rule__Float__Group__2__Impl rule__Float__Group__3
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
    // InternalReactionRules.g:2088:1: rule__Float__Group__2__Impl : ( '.' ) ;
    public final void rule__Float__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2092:1: ( ( '.' ) )
            // InternalReactionRules.g:2093:1: ( '.' )
            {
            // InternalReactionRules.g:2093:1: ( '.' )
            // InternalReactionRules.g:2094:2: '.'
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
    // InternalReactionRules.g:2103:1: rule__Float__Group__3 : rule__Float__Group__3__Impl ;
    public final void rule__Float__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2107:1: ( rule__Float__Group__3__Impl )
            // InternalReactionRules.g:2108:2: rule__Float__Group__3__Impl
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
    // InternalReactionRules.g:2114:1: rule__Float__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2118:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2119:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2119:1: ( RULE_INT )
            // InternalReactionRules.g:2120:2: RULE_INT
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
    // InternalReactionRules.g:2130:1: rule__ScientificFloat__Group__0 : rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1 ;
    public final void rule__ScientificFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2134:1: ( rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1 )
            // InternalReactionRules.g:2135:2: rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1
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
    // InternalReactionRules.g:2142:1: rule__ScientificFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ScientificFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2146:1: ( ( ( '-' )? ) )
            // InternalReactionRules.g:2147:1: ( ( '-' )? )
            {
            // InternalReactionRules.g:2147:1: ( ( '-' )? )
            // InternalReactionRules.g:2148:2: ( '-' )?
            {
             before(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalReactionRules.g:2149:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalReactionRules.g:2149:3: '-'
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
    // InternalReactionRules.g:2157:1: rule__ScientificFloat__Group__1 : rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2 ;
    public final void rule__ScientificFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2161:1: ( rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2 )
            // InternalReactionRules.g:2162:2: rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2
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
    // InternalReactionRules.g:2169:1: rule__ScientificFloat__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2173:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2174:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2174:1: ( RULE_INT )
            // InternalReactionRules.g:2175:2: RULE_INT
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
    // InternalReactionRules.g:2184:1: rule__ScientificFloat__Group__2 : rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3 ;
    public final void rule__ScientificFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2188:1: ( rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3 )
            // InternalReactionRules.g:2189:2: rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3
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
    // InternalReactionRules.g:2196:1: rule__ScientificFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__ScientificFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2200:1: ( ( '.' ) )
            // InternalReactionRules.g:2201:1: ( '.' )
            {
            // InternalReactionRules.g:2201:1: ( '.' )
            // InternalReactionRules.g:2202:2: '.'
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
    // InternalReactionRules.g:2211:1: rule__ScientificFloat__Group__3 : rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4 ;
    public final void rule__ScientificFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2215:1: ( rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4 )
            // InternalReactionRules.g:2216:2: rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4
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
    // InternalReactionRules.g:2223:1: rule__ScientificFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2227:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2228:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2228:1: ( RULE_INT )
            // InternalReactionRules.g:2229:2: RULE_INT
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
    // InternalReactionRules.g:2238:1: rule__ScientificFloat__Group__4 : rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5 ;
    public final void rule__ScientificFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2242:1: ( rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5 )
            // InternalReactionRules.g:2243:2: rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5
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
    // InternalReactionRules.g:2250:1: rule__ScientificFloat__Group__4__Impl : ( RULE_EXPONENT ) ;
    public final void rule__ScientificFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2254:1: ( ( RULE_EXPONENT ) )
            // InternalReactionRules.g:2255:1: ( RULE_EXPONENT )
            {
            // InternalReactionRules.g:2255:1: ( RULE_EXPONENT )
            // InternalReactionRules.g:2256:2: RULE_EXPONENT
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
    // InternalReactionRules.g:2265:1: rule__ScientificFloat__Group__5 : rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6 ;
    public final void rule__ScientificFloat__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2269:1: ( rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6 )
            // InternalReactionRules.g:2270:2: rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6
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
    // InternalReactionRules.g:2277:1: rule__ScientificFloat__Group__5__Impl : ( ( rule__ScientificFloat__Alternatives_5 ) ) ;
    public final void rule__ScientificFloat__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2281:1: ( ( ( rule__ScientificFloat__Alternatives_5 ) ) )
            // InternalReactionRules.g:2282:1: ( ( rule__ScientificFloat__Alternatives_5 ) )
            {
            // InternalReactionRules.g:2282:1: ( ( rule__ScientificFloat__Alternatives_5 ) )
            // InternalReactionRules.g:2283:2: ( rule__ScientificFloat__Alternatives_5 )
            {
             before(grammarAccess.getScientificFloatAccess().getAlternatives_5()); 
            // InternalReactionRules.g:2284:2: ( rule__ScientificFloat__Alternatives_5 )
            // InternalReactionRules.g:2284:3: rule__ScientificFloat__Alternatives_5
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
    // InternalReactionRules.g:2292:1: rule__ScientificFloat__Group__6 : rule__ScientificFloat__Group__6__Impl ;
    public final void rule__ScientificFloat__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2296:1: ( rule__ScientificFloat__Group__6__Impl )
            // InternalReactionRules.g:2297:2: rule__ScientificFloat__Group__6__Impl
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
    // InternalReactionRules.g:2303:1: rule__ScientificFloat__Group__6__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2307:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2308:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2308:1: ( RULE_INT )
            // InternalReactionRules.g:2309:2: RULE_INT
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
    // InternalReactionRules.g:2319:1: rule__SignedInteger__Group__0 : rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 ;
    public final void rule__SignedInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2323:1: ( rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 )
            // InternalReactionRules.g:2324:2: rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1
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
    // InternalReactionRules.g:2331:1: rule__SignedInteger__Group__0__Impl : ( '-' ) ;
    public final void rule__SignedInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2335:1: ( ( '-' ) )
            // InternalReactionRules.g:2336:1: ( '-' )
            {
            // InternalReactionRules.g:2336:1: ( '-' )
            // InternalReactionRules.g:2337:2: '-'
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
    // InternalReactionRules.g:2346:1: rule__SignedInteger__Group__1 : rule__SignedInteger__Group__1__Impl ;
    public final void rule__SignedInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2350:1: ( rule__SignedInteger__Group__1__Impl )
            // InternalReactionRules.g:2351:2: rule__SignedInteger__Group__1__Impl
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
    // InternalReactionRules.g:2357:1: rule__SignedInteger__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__SignedInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2361:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2362:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2362:1: ( RULE_INT )
            // InternalReactionRules.g:2363:2: RULE_INT
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
    // InternalReactionRules.g:2373:1: rule__States__Group__0 : rule__States__Group__0__Impl rule__States__Group__1 ;
    public final void rule__States__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2377:1: ( rule__States__Group__0__Impl rule__States__Group__1 )
            // InternalReactionRules.g:2378:2: rule__States__Group__0__Impl rule__States__Group__1
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
    // InternalReactionRules.g:2385:1: rule__States__Group__0__Impl : ( () ) ;
    public final void rule__States__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2389:1: ( ( () ) )
            // InternalReactionRules.g:2390:1: ( () )
            {
            // InternalReactionRules.g:2390:1: ( () )
            // InternalReactionRules.g:2391:2: ()
            {
             before(grammarAccess.getStatesAccess().getStatesAction_0()); 
            // InternalReactionRules.g:2392:2: ()
            // InternalReactionRules.g:2392:3: 
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
    // InternalReactionRules.g:2400:1: rule__States__Group__1 : rule__States__Group__1__Impl ;
    public final void rule__States__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2404:1: ( rule__States__Group__1__Impl )
            // InternalReactionRules.g:2405:2: rule__States__Group__1__Impl
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
    // InternalReactionRules.g:2411:1: rule__States__Group__1__Impl : ( ( rule__States__Group_1__0 )? ) ;
    public final void rule__States__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2415:1: ( ( ( rule__States__Group_1__0 )? ) )
            // InternalReactionRules.g:2416:1: ( ( rule__States__Group_1__0 )? )
            {
            // InternalReactionRules.g:2416:1: ( ( rule__States__Group_1__0 )? )
            // InternalReactionRules.g:2417:2: ( rule__States__Group_1__0 )?
            {
             before(grammarAccess.getStatesAccess().getGroup_1()); 
            // InternalReactionRules.g:2418:2: ( rule__States__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalReactionRules.g:2418:3: rule__States__Group_1__0
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
    // InternalReactionRules.g:2427:1: rule__States__Group_1__0 : rule__States__Group_1__0__Impl rule__States__Group_1__1 ;
    public final void rule__States__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2431:1: ( rule__States__Group_1__0__Impl rule__States__Group_1__1 )
            // InternalReactionRules.g:2432:2: rule__States__Group_1__0__Impl rule__States__Group_1__1
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
    // InternalReactionRules.g:2439:1: rule__States__Group_1__0__Impl : ( '{' ) ;
    public final void rule__States__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2443:1: ( ( '{' ) )
            // InternalReactionRules.g:2444:1: ( '{' )
            {
            // InternalReactionRules.g:2444:1: ( '{' )
            // InternalReactionRules.g:2445:2: '{'
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
    // InternalReactionRules.g:2454:1: rule__States__Group_1__1 : rule__States__Group_1__1__Impl rule__States__Group_1__2 ;
    public final void rule__States__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2458:1: ( rule__States__Group_1__1__Impl rule__States__Group_1__2 )
            // InternalReactionRules.g:2459:2: rule__States__Group_1__1__Impl rule__States__Group_1__2
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
    // InternalReactionRules.g:2466:1: rule__States__Group_1__1__Impl : ( ( rule__States__StateAssignment_1_1 ) ) ;
    public final void rule__States__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2470:1: ( ( ( rule__States__StateAssignment_1_1 ) ) )
            // InternalReactionRules.g:2471:1: ( ( rule__States__StateAssignment_1_1 ) )
            {
            // InternalReactionRules.g:2471:1: ( ( rule__States__StateAssignment_1_1 ) )
            // InternalReactionRules.g:2472:2: ( rule__States__StateAssignment_1_1 )
            {
             before(grammarAccess.getStatesAccess().getStateAssignment_1_1()); 
            // InternalReactionRules.g:2473:2: ( rule__States__StateAssignment_1_1 )
            // InternalReactionRules.g:2473:3: rule__States__StateAssignment_1_1
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
    // InternalReactionRules.g:2481:1: rule__States__Group_1__2 : rule__States__Group_1__2__Impl rule__States__Group_1__3 ;
    public final void rule__States__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2485:1: ( rule__States__Group_1__2__Impl rule__States__Group_1__3 )
            // InternalReactionRules.g:2486:2: rule__States__Group_1__2__Impl rule__States__Group_1__3
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
    // InternalReactionRules.g:2493:1: rule__States__Group_1__2__Impl : ( ( rule__States__Group_1_2__0 )* ) ;
    public final void rule__States__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2497:1: ( ( ( rule__States__Group_1_2__0 )* ) )
            // InternalReactionRules.g:2498:1: ( ( rule__States__Group_1_2__0 )* )
            {
            // InternalReactionRules.g:2498:1: ( ( rule__States__Group_1_2__0 )* )
            // InternalReactionRules.g:2499:2: ( rule__States__Group_1_2__0 )*
            {
             before(grammarAccess.getStatesAccess().getGroup_1_2()); 
            // InternalReactionRules.g:2500:2: ( rule__States__Group_1_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==25) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalReactionRules.g:2500:3: rule__States__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__States__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalReactionRules.g:2508:1: rule__States__Group_1__3 : rule__States__Group_1__3__Impl ;
    public final void rule__States__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2512:1: ( rule__States__Group_1__3__Impl )
            // InternalReactionRules.g:2513:2: rule__States__Group_1__3__Impl
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
    // InternalReactionRules.g:2519:1: rule__States__Group_1__3__Impl : ( '}' ) ;
    public final void rule__States__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2523:1: ( ( '}' ) )
            // InternalReactionRules.g:2524:1: ( '}' )
            {
            // InternalReactionRules.g:2524:1: ( '}' )
            // InternalReactionRules.g:2525:2: '}'
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
    // InternalReactionRules.g:2535:1: rule__States__Group_1_2__0 : rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1 ;
    public final void rule__States__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2539:1: ( rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1 )
            // InternalReactionRules.g:2540:2: rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1
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
    // InternalReactionRules.g:2547:1: rule__States__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__States__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2551:1: ( ( ',' ) )
            // InternalReactionRules.g:2552:1: ( ',' )
            {
            // InternalReactionRules.g:2552:1: ( ',' )
            // InternalReactionRules.g:2553:2: ','
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
    // InternalReactionRules.g:2562:1: rule__States__Group_1_2__1 : rule__States__Group_1_2__1__Impl ;
    public final void rule__States__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2566:1: ( rule__States__Group_1_2__1__Impl )
            // InternalReactionRules.g:2567:2: rule__States__Group_1_2__1__Impl
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
    // InternalReactionRules.g:2573:1: rule__States__Group_1_2__1__Impl : ( ( rule__States__StateAssignment_1_2_1 ) ) ;
    public final void rule__States__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2577:1: ( ( ( rule__States__StateAssignment_1_2_1 ) ) )
            // InternalReactionRules.g:2578:1: ( ( rule__States__StateAssignment_1_2_1 ) )
            {
            // InternalReactionRules.g:2578:1: ( ( rule__States__StateAssignment_1_2_1 ) )
            // InternalReactionRules.g:2579:2: ( rule__States__StateAssignment_1_2_1 )
            {
             before(grammarAccess.getStatesAccess().getStateAssignment_1_2_1()); 
            // InternalReactionRules.g:2580:2: ( rule__States__StateAssignment_1_2_1 )
            // InternalReactionRules.g:2580:3: rule__States__StateAssignment_1_2_1
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


    // $ANTLR start "rule__SingleSite__Group__0"
    // InternalReactionRules.g:2589:1: rule__SingleSite__Group__0 : rule__SingleSite__Group__0__Impl rule__SingleSite__Group__1 ;
    public final void rule__SingleSite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2593:1: ( rule__SingleSite__Group__0__Impl rule__SingleSite__Group__1 )
            // InternalReactionRules.g:2594:2: rule__SingleSite__Group__0__Impl rule__SingleSite__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SingleSite__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleSite__Group__1();

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
    // $ANTLR end "rule__SingleSite__Group__0"


    // $ANTLR start "rule__SingleSite__Group__0__Impl"
    // InternalReactionRules.g:2601:1: rule__SingleSite__Group__0__Impl : ( () ) ;
    public final void rule__SingleSite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2605:1: ( ( () ) )
            // InternalReactionRules.g:2606:1: ( () )
            {
            // InternalReactionRules.g:2606:1: ( () )
            // InternalReactionRules.g:2607:2: ()
            {
             before(grammarAccess.getSingleSiteAccess().getSingleSiteAction_0()); 
            // InternalReactionRules.g:2608:2: ()
            // InternalReactionRules.g:2608:3: 
            {
            }

             after(grammarAccess.getSingleSiteAccess().getSingleSiteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSite__Group__0__Impl"


    // $ANTLR start "rule__SingleSite__Group__1"
    // InternalReactionRules.g:2616:1: rule__SingleSite__Group__1 : rule__SingleSite__Group__1__Impl rule__SingleSite__Group__2 ;
    public final void rule__SingleSite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2620:1: ( rule__SingleSite__Group__1__Impl rule__SingleSite__Group__2 )
            // InternalReactionRules.g:2621:2: rule__SingleSite__Group__1__Impl rule__SingleSite__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SingleSite__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleSite__Group__2();

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
    // $ANTLR end "rule__SingleSite__Group__1"


    // $ANTLR start "rule__SingleSite__Group__1__Impl"
    // InternalReactionRules.g:2628:1: rule__SingleSite__Group__1__Impl : ( ( rule__SingleSite__NameAssignment_1 ) ) ;
    public final void rule__SingleSite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2632:1: ( ( ( rule__SingleSite__NameAssignment_1 ) ) )
            // InternalReactionRules.g:2633:1: ( ( rule__SingleSite__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:2633:1: ( ( rule__SingleSite__NameAssignment_1 ) )
            // InternalReactionRules.g:2634:2: ( rule__SingleSite__NameAssignment_1 )
            {
             before(grammarAccess.getSingleSiteAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:2635:2: ( rule__SingleSite__NameAssignment_1 )
            // InternalReactionRules.g:2635:3: rule__SingleSite__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleSite__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleSiteAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SingleSite__Group__1__Impl"


    // $ANTLR start "rule__SingleSite__Group__2"
    // InternalReactionRules.g:2643:1: rule__SingleSite__Group__2 : rule__SingleSite__Group__2__Impl ;
    public final void rule__SingleSite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2647:1: ( rule__SingleSite__Group__2__Impl )
            // InternalReactionRules.g:2648:2: rule__SingleSite__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleSite__Group__2__Impl();

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
    // $ANTLR end "rule__SingleSite__Group__2"


    // $ANTLR start "rule__SingleSite__Group__2__Impl"
    // InternalReactionRules.g:2654:1: rule__SingleSite__Group__2__Impl : ( ( rule__SingleSite__StatesAssignment_2 ) ) ;
    public final void rule__SingleSite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2658:1: ( ( ( rule__SingleSite__StatesAssignment_2 ) ) )
            // InternalReactionRules.g:2659:1: ( ( rule__SingleSite__StatesAssignment_2 ) )
            {
            // InternalReactionRules.g:2659:1: ( ( rule__SingleSite__StatesAssignment_2 ) )
            // InternalReactionRules.g:2660:2: ( rule__SingleSite__StatesAssignment_2 )
            {
             before(grammarAccess.getSingleSiteAccess().getStatesAssignment_2()); 
            // InternalReactionRules.g:2661:2: ( rule__SingleSite__StatesAssignment_2 )
            // InternalReactionRules.g:2661:3: rule__SingleSite__StatesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SingleSite__StatesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSingleSiteAccess().getStatesAssignment_2()); 

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
    // $ANTLR end "rule__SingleSite__Group__2__Impl"


    // $ANTLR start "rule__MultiSite__Group__0"
    // InternalReactionRules.g:2670:1: rule__MultiSite__Group__0 : rule__MultiSite__Group__0__Impl rule__MultiSite__Group__1 ;
    public final void rule__MultiSite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2674:1: ( rule__MultiSite__Group__0__Impl rule__MultiSite__Group__1 )
            // InternalReactionRules.g:2675:2: rule__MultiSite__Group__0__Impl rule__MultiSite__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__MultiSite__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiSite__Group__1();

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
    // $ANTLR end "rule__MultiSite__Group__0"


    // $ANTLR start "rule__MultiSite__Group__0__Impl"
    // InternalReactionRules.g:2682:1: rule__MultiSite__Group__0__Impl : ( () ) ;
    public final void rule__MultiSite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2686:1: ( ( () ) )
            // InternalReactionRules.g:2687:1: ( () )
            {
            // InternalReactionRules.g:2687:1: ( () )
            // InternalReactionRules.g:2688:2: ()
            {
             before(grammarAccess.getMultiSiteAccess().getMultiSiteAction_0()); 
            // InternalReactionRules.g:2689:2: ()
            // InternalReactionRules.g:2689:3: 
            {
            }

             after(grammarAccess.getMultiSiteAccess().getMultiSiteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiSite__Group__0__Impl"


    // $ANTLR start "rule__MultiSite__Group__1"
    // InternalReactionRules.g:2697:1: rule__MultiSite__Group__1 : rule__MultiSite__Group__1__Impl rule__MultiSite__Group__2 ;
    public final void rule__MultiSite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2701:1: ( rule__MultiSite__Group__1__Impl rule__MultiSite__Group__2 )
            // InternalReactionRules.g:2702:2: rule__MultiSite__Group__1__Impl rule__MultiSite__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MultiSite__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiSite__Group__2();

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
    // $ANTLR end "rule__MultiSite__Group__1"


    // $ANTLR start "rule__MultiSite__Group__1__Impl"
    // InternalReactionRules.g:2709:1: rule__MultiSite__Group__1__Impl : ( '*' ) ;
    public final void rule__MultiSite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2713:1: ( ( '*' ) )
            // InternalReactionRules.g:2714:1: ( '*' )
            {
            // InternalReactionRules.g:2714:1: ( '*' )
            // InternalReactionRules.g:2715:2: '*'
            {
             before(grammarAccess.getMultiSiteAccess().getAsteriskKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMultiSiteAccess().getAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__MultiSite__Group__1__Impl"


    // $ANTLR start "rule__MultiSite__Group__2"
    // InternalReactionRules.g:2724:1: rule__MultiSite__Group__2 : rule__MultiSite__Group__2__Impl rule__MultiSite__Group__3 ;
    public final void rule__MultiSite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2728:1: ( rule__MultiSite__Group__2__Impl rule__MultiSite__Group__3 )
            // InternalReactionRules.g:2729:2: rule__MultiSite__Group__2__Impl rule__MultiSite__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MultiSite__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiSite__Group__3();

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
    // $ANTLR end "rule__MultiSite__Group__2"


    // $ANTLR start "rule__MultiSite__Group__2__Impl"
    // InternalReactionRules.g:2736:1: rule__MultiSite__Group__2__Impl : ( ( rule__MultiSite__NameAssignment_2 ) ) ;
    public final void rule__MultiSite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2740:1: ( ( ( rule__MultiSite__NameAssignment_2 ) ) )
            // InternalReactionRules.g:2741:1: ( ( rule__MultiSite__NameAssignment_2 ) )
            {
            // InternalReactionRules.g:2741:1: ( ( rule__MultiSite__NameAssignment_2 ) )
            // InternalReactionRules.g:2742:2: ( rule__MultiSite__NameAssignment_2 )
            {
             before(grammarAccess.getMultiSiteAccess().getNameAssignment_2()); 
            // InternalReactionRules.g:2743:2: ( rule__MultiSite__NameAssignment_2 )
            // InternalReactionRules.g:2743:3: rule__MultiSite__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiSite__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiSiteAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__MultiSite__Group__2__Impl"


    // $ANTLR start "rule__MultiSite__Group__3"
    // InternalReactionRules.g:2751:1: rule__MultiSite__Group__3 : rule__MultiSite__Group__3__Impl ;
    public final void rule__MultiSite__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2755:1: ( rule__MultiSite__Group__3__Impl )
            // InternalReactionRules.g:2756:2: rule__MultiSite__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiSite__Group__3__Impl();

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
    // $ANTLR end "rule__MultiSite__Group__3"


    // $ANTLR start "rule__MultiSite__Group__3__Impl"
    // InternalReactionRules.g:2762:1: rule__MultiSite__Group__3__Impl : ( ( rule__MultiSite__StatesAssignment_3 ) ) ;
    public final void rule__MultiSite__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2766:1: ( ( ( rule__MultiSite__StatesAssignment_3 ) ) )
            // InternalReactionRules.g:2767:1: ( ( rule__MultiSite__StatesAssignment_3 ) )
            {
            // InternalReactionRules.g:2767:1: ( ( rule__MultiSite__StatesAssignment_3 ) )
            // InternalReactionRules.g:2768:2: ( rule__MultiSite__StatesAssignment_3 )
            {
             before(grammarAccess.getMultiSiteAccess().getStatesAssignment_3()); 
            // InternalReactionRules.g:2769:2: ( rule__MultiSite__StatesAssignment_3 )
            // InternalReactionRules.g:2769:3: rule__MultiSite__StatesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MultiSite__StatesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMultiSiteAccess().getStatesAssignment_3()); 

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
    // $ANTLR end "rule__MultiSite__Group__3__Impl"


    // $ANTLR start "rule__Sites__Group__0"
    // InternalReactionRules.g:2778:1: rule__Sites__Group__0 : rule__Sites__Group__0__Impl rule__Sites__Group__1 ;
    public final void rule__Sites__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2782:1: ( rule__Sites__Group__0__Impl rule__Sites__Group__1 )
            // InternalReactionRules.g:2783:2: rule__Sites__Group__0__Impl rule__Sites__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalReactionRules.g:2790:1: rule__Sites__Group__0__Impl : ( () ) ;
    public final void rule__Sites__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2794:1: ( ( () ) )
            // InternalReactionRules.g:2795:1: ( () )
            {
            // InternalReactionRules.g:2795:1: ( () )
            // InternalReactionRules.g:2796:2: ()
            {
             before(grammarAccess.getSitesAccess().getSitesAction_0()); 
            // InternalReactionRules.g:2797:2: ()
            // InternalReactionRules.g:2797:3: 
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
    // InternalReactionRules.g:2805:1: rule__Sites__Group__1 : rule__Sites__Group__1__Impl ;
    public final void rule__Sites__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2809:1: ( rule__Sites__Group__1__Impl )
            // InternalReactionRules.g:2810:2: rule__Sites__Group__1__Impl
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
    // InternalReactionRules.g:2816:1: rule__Sites__Group__1__Impl : ( ( rule__Sites__Group_1__0 )? ) ;
    public final void rule__Sites__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2820:1: ( ( ( rule__Sites__Group_1__0 )? ) )
            // InternalReactionRules.g:2821:1: ( ( rule__Sites__Group_1__0 )? )
            {
            // InternalReactionRules.g:2821:1: ( ( rule__Sites__Group_1__0 )? )
            // InternalReactionRules.g:2822:2: ( rule__Sites__Group_1__0 )?
            {
             before(grammarAccess.getSitesAccess().getGroup_1()); 
            // InternalReactionRules.g:2823:2: ( rule__Sites__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalReactionRules.g:2823:3: rule__Sites__Group_1__0
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
    // InternalReactionRules.g:2832:1: rule__Sites__Group_1__0 : rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1 ;
    public final void rule__Sites__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2836:1: ( rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1 )
            // InternalReactionRules.g:2837:2: rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalReactionRules.g:2844:1: rule__Sites__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Sites__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2848:1: ( ( '(' ) )
            // InternalReactionRules.g:2849:1: ( '(' )
            {
            // InternalReactionRules.g:2849:1: ( '(' )
            // InternalReactionRules.g:2850:2: '('
            {
             before(grammarAccess.getSitesAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalReactionRules.g:2859:1: rule__Sites__Group_1__1 : rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2 ;
    public final void rule__Sites__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2863:1: ( rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2 )
            // InternalReactionRules.g:2864:2: rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalReactionRules.g:2871:1: rule__Sites__Group_1__1__Impl : ( ( rule__Sites__SitesAssignment_1_1 ) ) ;
    public final void rule__Sites__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2875:1: ( ( ( rule__Sites__SitesAssignment_1_1 ) ) )
            // InternalReactionRules.g:2876:1: ( ( rule__Sites__SitesAssignment_1_1 ) )
            {
            // InternalReactionRules.g:2876:1: ( ( rule__Sites__SitesAssignment_1_1 ) )
            // InternalReactionRules.g:2877:2: ( rule__Sites__SitesAssignment_1_1 )
            {
             before(grammarAccess.getSitesAccess().getSitesAssignment_1_1()); 
            // InternalReactionRules.g:2878:2: ( rule__Sites__SitesAssignment_1_1 )
            // InternalReactionRules.g:2878:3: rule__Sites__SitesAssignment_1_1
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
    // InternalReactionRules.g:2886:1: rule__Sites__Group_1__2 : rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3 ;
    public final void rule__Sites__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2890:1: ( rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3 )
            // InternalReactionRules.g:2891:2: rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalReactionRules.g:2898:1: rule__Sites__Group_1__2__Impl : ( ( rule__Sites__Group_1_2__0 )* ) ;
    public final void rule__Sites__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2902:1: ( ( ( rule__Sites__Group_1_2__0 )* ) )
            // InternalReactionRules.g:2903:1: ( ( rule__Sites__Group_1_2__0 )* )
            {
            // InternalReactionRules.g:2903:1: ( ( rule__Sites__Group_1_2__0 )* )
            // InternalReactionRules.g:2904:2: ( rule__Sites__Group_1_2__0 )*
            {
             before(grammarAccess.getSitesAccess().getGroup_1_2()); 
            // InternalReactionRules.g:2905:2: ( rule__Sites__Group_1_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalReactionRules.g:2905:3: rule__Sites__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Sites__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalReactionRules.g:2913:1: rule__Sites__Group_1__3 : rule__Sites__Group_1__3__Impl ;
    public final void rule__Sites__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2917:1: ( rule__Sites__Group_1__3__Impl )
            // InternalReactionRules.g:2918:2: rule__Sites__Group_1__3__Impl
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
    // InternalReactionRules.g:2924:1: rule__Sites__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Sites__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2928:1: ( ( ')' ) )
            // InternalReactionRules.g:2929:1: ( ')' )
            {
            // InternalReactionRules.g:2929:1: ( ')' )
            // InternalReactionRules.g:2930:2: ')'
            {
             before(grammarAccess.getSitesAccess().getRightParenthesisKeyword_1_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalReactionRules.g:2940:1: rule__Sites__Group_1_2__0 : rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1 ;
    public final void rule__Sites__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2944:1: ( rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1 )
            // InternalReactionRules.g:2945:2: rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalReactionRules.g:2952:1: rule__Sites__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Sites__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2956:1: ( ( ',' ) )
            // InternalReactionRules.g:2957:1: ( ',' )
            {
            // InternalReactionRules.g:2957:1: ( ',' )
            // InternalReactionRules.g:2958:2: ','
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
    // InternalReactionRules.g:2967:1: rule__Sites__Group_1_2__1 : rule__Sites__Group_1_2__1__Impl ;
    public final void rule__Sites__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2971:1: ( rule__Sites__Group_1_2__1__Impl )
            // InternalReactionRules.g:2972:2: rule__Sites__Group_1_2__1__Impl
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
    // InternalReactionRules.g:2978:1: rule__Sites__Group_1_2__1__Impl : ( ( rule__Sites__SitesAssignment_1_2_1 ) ) ;
    public final void rule__Sites__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2982:1: ( ( ( rule__Sites__SitesAssignment_1_2_1 ) ) )
            // InternalReactionRules.g:2983:1: ( ( rule__Sites__SitesAssignment_1_2_1 ) )
            {
            // InternalReactionRules.g:2983:1: ( ( rule__Sites__SitesAssignment_1_2_1 ) )
            // InternalReactionRules.g:2984:2: ( rule__Sites__SitesAssignment_1_2_1 )
            {
             before(grammarAccess.getSitesAccess().getSitesAssignment_1_2_1()); 
            // InternalReactionRules.g:2985:2: ( rule__Sites__SitesAssignment_1_2_1 )
            // InternalReactionRules.g:2985:3: rule__Sites__SitesAssignment_1_2_1
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
    // InternalReactionRules.g:2994:1: rule__Agent__Group__0 : rule__Agent__Group__0__Impl rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2998:1: ( rule__Agent__Group__0__Impl rule__Agent__Group__1 )
            // InternalReactionRules.g:2999:2: rule__Agent__Group__0__Impl rule__Agent__Group__1
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
    // InternalReactionRules.g:3006:1: rule__Agent__Group__0__Impl : ( 'agent' ) ;
    public final void rule__Agent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3010:1: ( ( 'agent' ) )
            // InternalReactionRules.g:3011:1: ( 'agent' )
            {
            // InternalReactionRules.g:3011:1: ( 'agent' )
            // InternalReactionRules.g:3012:2: 'agent'
            {
             before(grammarAccess.getAgentAccess().getAgentKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalReactionRules.g:3021:1: rule__Agent__Group__1 : rule__Agent__Group__1__Impl rule__Agent__Group__2 ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3025:1: ( rule__Agent__Group__1__Impl rule__Agent__Group__2 )
            // InternalReactionRules.g:3026:2: rule__Agent__Group__1__Impl rule__Agent__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalReactionRules.g:3033:1: rule__Agent__Group__1__Impl : ( ( rule__Agent__NameAssignment_1 ) ) ;
    public final void rule__Agent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3037:1: ( ( ( rule__Agent__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3038:1: ( ( rule__Agent__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3038:1: ( ( rule__Agent__NameAssignment_1 ) )
            // InternalReactionRules.g:3039:2: ( rule__Agent__NameAssignment_1 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3040:2: ( rule__Agent__NameAssignment_1 )
            // InternalReactionRules.g:3040:3: rule__Agent__NameAssignment_1
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
    // InternalReactionRules.g:3048:1: rule__Agent__Group__2 : rule__Agent__Group__2__Impl ;
    public final void rule__Agent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3052:1: ( rule__Agent__Group__2__Impl )
            // InternalReactionRules.g:3053:2: rule__Agent__Group__2__Impl
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
    // InternalReactionRules.g:3059:1: rule__Agent__Group__2__Impl : ( ( rule__Agent__SitesAssignment_2 ) ) ;
    public final void rule__Agent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3063:1: ( ( ( rule__Agent__SitesAssignment_2 ) ) )
            // InternalReactionRules.g:3064:1: ( ( rule__Agent__SitesAssignment_2 ) )
            {
            // InternalReactionRules.g:3064:1: ( ( rule__Agent__SitesAssignment_2 ) )
            // InternalReactionRules.g:3065:2: ( rule__Agent__SitesAssignment_2 )
            {
             before(grammarAccess.getAgentAccess().getSitesAssignment_2()); 
            // InternalReactionRules.g:3066:2: ( rule__Agent__SitesAssignment_2 )
            // InternalReactionRules.g:3066:3: rule__Agent__SitesAssignment_2
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
    // InternalReactionRules.g:3075:1: rule__PatternVariable__Group__0 : rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 ;
    public final void rule__PatternVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3079:1: ( rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 )
            // InternalReactionRules.g:3080:2: rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1
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
    // InternalReactionRules.g:3087:1: rule__PatternVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__PatternVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3091:1: ( ( 'var' ) )
            // InternalReactionRules.g:3092:1: ( 'var' )
            {
            // InternalReactionRules.g:3092:1: ( 'var' )
            // InternalReactionRules.g:3093:2: 'var'
            {
             before(grammarAccess.getPatternVariableAccess().getVarKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalReactionRules.g:3102:1: rule__PatternVariable__Group__1 : rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 ;
    public final void rule__PatternVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3106:1: ( rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 )
            // InternalReactionRules.g:3107:2: rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalReactionRules.g:3114:1: rule__PatternVariable__Group__1__Impl : ( ( rule__PatternVariable__NameAssignment_1 ) ) ;
    public final void rule__PatternVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3118:1: ( ( ( rule__PatternVariable__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3119:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3119:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            // InternalReactionRules.g:3120:2: ( rule__PatternVariable__NameAssignment_1 )
            {
             before(grammarAccess.getPatternVariableAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3121:2: ( rule__PatternVariable__NameAssignment_1 )
            // InternalReactionRules.g:3121:3: rule__PatternVariable__NameAssignment_1
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
    // InternalReactionRules.g:3129:1: rule__PatternVariable__Group__2 : rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 ;
    public final void rule__PatternVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3133:1: ( rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 )
            // InternalReactionRules.g:3134:2: rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3
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
    // InternalReactionRules.g:3141:1: rule__PatternVariable__Group__2__Impl : ( '=' ) ;
    public final void rule__PatternVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3145:1: ( ( '=' ) )
            // InternalReactionRules.g:3146:1: ( '=' )
            {
            // InternalReactionRules.g:3146:1: ( '=' )
            // InternalReactionRules.g:3147:2: '='
            {
             before(grammarAccess.getPatternVariableAccess().getEqualsSignKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalReactionRules.g:3156:1: rule__PatternVariable__Group__3 : rule__PatternVariable__Group__3__Impl ;
    public final void rule__PatternVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3160:1: ( rule__PatternVariable__Group__3__Impl )
            // InternalReactionRules.g:3161:2: rule__PatternVariable__Group__3__Impl
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
    // InternalReactionRules.g:3167:1: rule__PatternVariable__Group__3__Impl : ( ( rule__PatternVariable__PatternAssignment_3 ) ) ;
    public final void rule__PatternVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3171:1: ( ( ( rule__PatternVariable__PatternAssignment_3 ) ) )
            // InternalReactionRules.g:3172:1: ( ( rule__PatternVariable__PatternAssignment_3 ) )
            {
            // InternalReactionRules.g:3172:1: ( ( rule__PatternVariable__PatternAssignment_3 ) )
            // InternalReactionRules.g:3173:2: ( rule__PatternVariable__PatternAssignment_3 )
            {
             before(grammarAccess.getPatternVariableAccess().getPatternAssignment_3()); 
            // InternalReactionRules.g:3174:2: ( rule__PatternVariable__PatternAssignment_3 )
            // InternalReactionRules.g:3174:3: rule__PatternVariable__PatternAssignment_3
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
    // InternalReactionRules.g:3183:1: rule__ArithmeticVariable__Group__0 : rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1 ;
    public final void rule__ArithmeticVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3187:1: ( rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1 )
            // InternalReactionRules.g:3188:2: rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1
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
    // InternalReactionRules.g:3195:1: rule__ArithmeticVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__ArithmeticVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3199:1: ( ( 'var' ) )
            // InternalReactionRules.g:3200:1: ( 'var' )
            {
            // InternalReactionRules.g:3200:1: ( 'var' )
            // InternalReactionRules.g:3201:2: 'var'
            {
             before(grammarAccess.getArithmeticVariableAccess().getVarKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalReactionRules.g:3210:1: rule__ArithmeticVariable__Group__1 : rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2 ;
    public final void rule__ArithmeticVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3214:1: ( rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2 )
            // InternalReactionRules.g:3215:2: rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalReactionRules.g:3222:1: rule__ArithmeticVariable__Group__1__Impl : ( ( rule__ArithmeticVariable__NameAssignment_1 ) ) ;
    public final void rule__ArithmeticVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3226:1: ( ( ( rule__ArithmeticVariable__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3227:1: ( ( rule__ArithmeticVariable__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3227:1: ( ( rule__ArithmeticVariable__NameAssignment_1 ) )
            // InternalReactionRules.g:3228:2: ( rule__ArithmeticVariable__NameAssignment_1 )
            {
             before(grammarAccess.getArithmeticVariableAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3229:2: ( rule__ArithmeticVariable__NameAssignment_1 )
            // InternalReactionRules.g:3229:3: rule__ArithmeticVariable__NameAssignment_1
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
    // InternalReactionRules.g:3237:1: rule__ArithmeticVariable__Group__2 : rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3 ;
    public final void rule__ArithmeticVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3241:1: ( rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3 )
            // InternalReactionRules.g:3242:2: rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalReactionRules.g:3249:1: rule__ArithmeticVariable__Group__2__Impl : ( '=' ) ;
    public final void rule__ArithmeticVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3253:1: ( ( '=' ) )
            // InternalReactionRules.g:3254:1: ( '=' )
            {
            // InternalReactionRules.g:3254:1: ( '=' )
            // InternalReactionRules.g:3255:2: '='
            {
             before(grammarAccess.getArithmeticVariableAccess().getEqualsSignKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalReactionRules.g:3264:1: rule__ArithmeticVariable__Group__3 : rule__ArithmeticVariable__Group__3__Impl ;
    public final void rule__ArithmeticVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3268:1: ( rule__ArithmeticVariable__Group__3__Impl )
            // InternalReactionRules.g:3269:2: rule__ArithmeticVariable__Group__3__Impl
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
    // InternalReactionRules.g:3275:1: rule__ArithmeticVariable__Group__3__Impl : ( ( rule__ArithmeticVariable__ValueAssignment_3 ) ) ;
    public final void rule__ArithmeticVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3279:1: ( ( ( rule__ArithmeticVariable__ValueAssignment_3 ) ) )
            // InternalReactionRules.g:3280:1: ( ( rule__ArithmeticVariable__ValueAssignment_3 ) )
            {
            // InternalReactionRules.g:3280:1: ( ( rule__ArithmeticVariable__ValueAssignment_3 ) )
            // InternalReactionRules.g:3281:2: ( rule__ArithmeticVariable__ValueAssignment_3 )
            {
             before(grammarAccess.getArithmeticVariableAccess().getValueAssignment_3()); 
            // InternalReactionRules.g:3282:2: ( rule__ArithmeticVariable__ValueAssignment_3 )
            // InternalReactionRules.g:3282:3: rule__ArithmeticVariable__ValueAssignment_3
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
    // InternalReactionRules.g:3291:1: rule__BoundAnyLink__Group__0 : rule__BoundAnyLink__Group__0__Impl rule__BoundAnyLink__Group__1 ;
    public final void rule__BoundAnyLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3295:1: ( rule__BoundAnyLink__Group__0__Impl rule__BoundAnyLink__Group__1 )
            // InternalReactionRules.g:3296:2: rule__BoundAnyLink__Group__0__Impl rule__BoundAnyLink__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalReactionRules.g:3303:1: rule__BoundAnyLink__Group__0__Impl : ( () ) ;
    public final void rule__BoundAnyLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3307:1: ( ( () ) )
            // InternalReactionRules.g:3308:1: ( () )
            {
            // InternalReactionRules.g:3308:1: ( () )
            // InternalReactionRules.g:3309:2: ()
            {
             before(grammarAccess.getBoundAnyLinkAccess().getBoundAnyLinkAction_0()); 
            // InternalReactionRules.g:3310:2: ()
            // InternalReactionRules.g:3310:3: 
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
    // InternalReactionRules.g:3318:1: rule__BoundAnyLink__Group__1 : rule__BoundAnyLink__Group__1__Impl ;
    public final void rule__BoundAnyLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3322:1: ( rule__BoundAnyLink__Group__1__Impl )
            // InternalReactionRules.g:3323:2: rule__BoundAnyLink__Group__1__Impl
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
    // InternalReactionRules.g:3329:1: rule__BoundAnyLink__Group__1__Impl : ( ( rule__BoundAnyLink__NameAssignment_1 ) ) ;
    public final void rule__BoundAnyLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3333:1: ( ( ( rule__BoundAnyLink__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3334:1: ( ( rule__BoundAnyLink__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3334:1: ( ( rule__BoundAnyLink__NameAssignment_1 ) )
            // InternalReactionRules.g:3335:2: ( rule__BoundAnyLink__NameAssignment_1 )
            {
             before(grammarAccess.getBoundAnyLinkAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3336:2: ( rule__BoundAnyLink__NameAssignment_1 )
            // InternalReactionRules.g:3336:3: rule__BoundAnyLink__NameAssignment_1
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
    // InternalReactionRules.g:3345:1: rule__FreeLink__Group__0 : rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1 ;
    public final void rule__FreeLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3349:1: ( rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1 )
            // InternalReactionRules.g:3350:2: rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalReactionRules.g:3357:1: rule__FreeLink__Group__0__Impl : ( () ) ;
    public final void rule__FreeLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3361:1: ( ( () ) )
            // InternalReactionRules.g:3362:1: ( () )
            {
            // InternalReactionRules.g:3362:1: ( () )
            // InternalReactionRules.g:3363:2: ()
            {
             before(grammarAccess.getFreeLinkAccess().getFreeLinkAction_0()); 
            // InternalReactionRules.g:3364:2: ()
            // InternalReactionRules.g:3364:3: 
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
    // InternalReactionRules.g:3372:1: rule__FreeLink__Group__1 : rule__FreeLink__Group__1__Impl ;
    public final void rule__FreeLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3376:1: ( rule__FreeLink__Group__1__Impl )
            // InternalReactionRules.g:3377:2: rule__FreeLink__Group__1__Impl
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
    // InternalReactionRules.g:3383:1: rule__FreeLink__Group__1__Impl : ( ( rule__FreeLink__NameAssignment_1 ) ) ;
    public final void rule__FreeLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3387:1: ( ( ( rule__FreeLink__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3388:1: ( ( rule__FreeLink__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3388:1: ( ( rule__FreeLink__NameAssignment_1 ) )
            // InternalReactionRules.g:3389:2: ( rule__FreeLink__NameAssignment_1 )
            {
             before(grammarAccess.getFreeLinkAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3390:2: ( rule__FreeLink__NameAssignment_1 )
            // InternalReactionRules.g:3390:3: rule__FreeLink__NameAssignment_1
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


    // $ANTLR start "rule__IndexedFreeLink__Group__0"
    // InternalReactionRules.g:3399:1: rule__IndexedFreeLink__Group__0 : rule__IndexedFreeLink__Group__0__Impl rule__IndexedFreeLink__Group__1 ;
    public final void rule__IndexedFreeLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3403:1: ( rule__IndexedFreeLink__Group__0__Impl rule__IndexedFreeLink__Group__1 )
            // InternalReactionRules.g:3404:2: rule__IndexedFreeLink__Group__0__Impl rule__IndexedFreeLink__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__IndexedFreeLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexedFreeLink__Group__1();

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
    // $ANTLR end "rule__IndexedFreeLink__Group__0"


    // $ANTLR start "rule__IndexedFreeLink__Group__0__Impl"
    // InternalReactionRules.g:3411:1: rule__IndexedFreeLink__Group__0__Impl : ( () ) ;
    public final void rule__IndexedFreeLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3415:1: ( ( () ) )
            // InternalReactionRules.g:3416:1: ( () )
            {
            // InternalReactionRules.g:3416:1: ( () )
            // InternalReactionRules.g:3417:2: ()
            {
             before(grammarAccess.getIndexedFreeLinkAccess().getIndexedFreeLinkAction_0()); 
            // InternalReactionRules.g:3418:2: ()
            // InternalReactionRules.g:3418:3: 
            {
            }

             after(grammarAccess.getIndexedFreeLinkAccess().getIndexedFreeLinkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexedFreeLink__Group__0__Impl"


    // $ANTLR start "rule__IndexedFreeLink__Group__1"
    // InternalReactionRules.g:3426:1: rule__IndexedFreeLink__Group__1 : rule__IndexedFreeLink__Group__1__Impl rule__IndexedFreeLink__Group__2 ;
    public final void rule__IndexedFreeLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3430:1: ( rule__IndexedFreeLink__Group__1__Impl rule__IndexedFreeLink__Group__2 )
            // InternalReactionRules.g:3431:2: rule__IndexedFreeLink__Group__1__Impl rule__IndexedFreeLink__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__IndexedFreeLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexedFreeLink__Group__2();

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
    // $ANTLR end "rule__IndexedFreeLink__Group__1"


    // $ANTLR start "rule__IndexedFreeLink__Group__1__Impl"
    // InternalReactionRules.g:3438:1: rule__IndexedFreeLink__Group__1__Impl : ( ( rule__IndexedFreeLink__NameAssignment_1 ) ) ;
    public final void rule__IndexedFreeLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3442:1: ( ( ( rule__IndexedFreeLink__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3443:1: ( ( rule__IndexedFreeLink__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3443:1: ( ( rule__IndexedFreeLink__NameAssignment_1 ) )
            // InternalReactionRules.g:3444:2: ( rule__IndexedFreeLink__NameAssignment_1 )
            {
             before(grammarAccess.getIndexedFreeLinkAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3445:2: ( rule__IndexedFreeLink__NameAssignment_1 )
            // InternalReactionRules.g:3445:3: rule__IndexedFreeLink__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IndexedFreeLink__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIndexedFreeLinkAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__IndexedFreeLink__Group__1__Impl"


    // $ANTLR start "rule__IndexedFreeLink__Group__2"
    // InternalReactionRules.g:3453:1: rule__IndexedFreeLink__Group__2 : rule__IndexedFreeLink__Group__2__Impl rule__IndexedFreeLink__Group__3 ;
    public final void rule__IndexedFreeLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3457:1: ( rule__IndexedFreeLink__Group__2__Impl rule__IndexedFreeLink__Group__3 )
            // InternalReactionRules.g:3458:2: rule__IndexedFreeLink__Group__2__Impl rule__IndexedFreeLink__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__IndexedFreeLink__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexedFreeLink__Group__3();

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
    // $ANTLR end "rule__IndexedFreeLink__Group__2"


    // $ANTLR start "rule__IndexedFreeLink__Group__2__Impl"
    // InternalReactionRules.g:3465:1: rule__IndexedFreeLink__Group__2__Impl : ( '(' ) ;
    public final void rule__IndexedFreeLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3469:1: ( ( '(' ) )
            // InternalReactionRules.g:3470:1: ( '(' )
            {
            // InternalReactionRules.g:3470:1: ( '(' )
            // InternalReactionRules.g:3471:2: '('
            {
             before(grammarAccess.getIndexedFreeLinkAccess().getLeftParenthesisKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getIndexedFreeLinkAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__IndexedFreeLink__Group__2__Impl"


    // $ANTLR start "rule__IndexedFreeLink__Group__3"
    // InternalReactionRules.g:3480:1: rule__IndexedFreeLink__Group__3 : rule__IndexedFreeLink__Group__3__Impl rule__IndexedFreeLink__Group__4 ;
    public final void rule__IndexedFreeLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3484:1: ( rule__IndexedFreeLink__Group__3__Impl rule__IndexedFreeLink__Group__4 )
            // InternalReactionRules.g:3485:2: rule__IndexedFreeLink__Group__3__Impl rule__IndexedFreeLink__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__IndexedFreeLink__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexedFreeLink__Group__4();

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
    // $ANTLR end "rule__IndexedFreeLink__Group__3"


    // $ANTLR start "rule__IndexedFreeLink__Group__3__Impl"
    // InternalReactionRules.g:3492:1: rule__IndexedFreeLink__Group__3__Impl : ( ( rule__IndexedFreeLink__StateAssignment_3 ) ) ;
    public final void rule__IndexedFreeLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3496:1: ( ( ( rule__IndexedFreeLink__StateAssignment_3 ) ) )
            // InternalReactionRules.g:3497:1: ( ( rule__IndexedFreeLink__StateAssignment_3 ) )
            {
            // InternalReactionRules.g:3497:1: ( ( rule__IndexedFreeLink__StateAssignment_3 ) )
            // InternalReactionRules.g:3498:2: ( rule__IndexedFreeLink__StateAssignment_3 )
            {
             before(grammarAccess.getIndexedFreeLinkAccess().getStateAssignment_3()); 
            // InternalReactionRules.g:3499:2: ( rule__IndexedFreeLink__StateAssignment_3 )
            // InternalReactionRules.g:3499:3: rule__IndexedFreeLink__StateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IndexedFreeLink__StateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIndexedFreeLinkAccess().getStateAssignment_3()); 

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
    // $ANTLR end "rule__IndexedFreeLink__Group__3__Impl"


    // $ANTLR start "rule__IndexedFreeLink__Group__4"
    // InternalReactionRules.g:3507:1: rule__IndexedFreeLink__Group__4 : rule__IndexedFreeLink__Group__4__Impl ;
    public final void rule__IndexedFreeLink__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3511:1: ( rule__IndexedFreeLink__Group__4__Impl )
            // InternalReactionRules.g:3512:2: rule__IndexedFreeLink__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndexedFreeLink__Group__4__Impl();

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
    // $ANTLR end "rule__IndexedFreeLink__Group__4"


    // $ANTLR start "rule__IndexedFreeLink__Group__4__Impl"
    // InternalReactionRules.g:3518:1: rule__IndexedFreeLink__Group__4__Impl : ( ')' ) ;
    public final void rule__IndexedFreeLink__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3522:1: ( ( ')' ) )
            // InternalReactionRules.g:3523:1: ( ')' )
            {
            // InternalReactionRules.g:3523:1: ( ')' )
            // InternalReactionRules.g:3524:2: ')'
            {
             before(grammarAccess.getIndexedFreeLinkAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getIndexedFreeLinkAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__IndexedFreeLink__Group__4__Impl"


    // $ANTLR start "rule__WhatEver__Group__0"
    // InternalReactionRules.g:3534:1: rule__WhatEver__Group__0 : rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1 ;
    public final void rule__WhatEver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3538:1: ( rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1 )
            // InternalReactionRules.g:3539:2: rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalReactionRules.g:3546:1: rule__WhatEver__Group__0__Impl : ( () ) ;
    public final void rule__WhatEver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3550:1: ( ( () ) )
            // InternalReactionRules.g:3551:1: ( () )
            {
            // InternalReactionRules.g:3551:1: ( () )
            // InternalReactionRules.g:3552:2: ()
            {
             before(grammarAccess.getWhatEverAccess().getWhatEverAction_0()); 
            // InternalReactionRules.g:3553:2: ()
            // InternalReactionRules.g:3553:3: 
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
    // InternalReactionRules.g:3561:1: rule__WhatEver__Group__1 : rule__WhatEver__Group__1__Impl ;
    public final void rule__WhatEver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3565:1: ( rule__WhatEver__Group__1__Impl )
            // InternalReactionRules.g:3566:2: rule__WhatEver__Group__1__Impl
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
    // InternalReactionRules.g:3572:1: rule__WhatEver__Group__1__Impl : ( ( rule__WhatEver__NameAssignment_1 ) ) ;
    public final void rule__WhatEver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3576:1: ( ( ( rule__WhatEver__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3577:1: ( ( rule__WhatEver__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3577:1: ( ( rule__WhatEver__NameAssignment_1 ) )
            // InternalReactionRules.g:3578:2: ( rule__WhatEver__NameAssignment_1 )
            {
             before(grammarAccess.getWhatEverAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3579:2: ( rule__WhatEver__NameAssignment_1 )
            // InternalReactionRules.g:3579:3: rule__WhatEver__NameAssignment_1
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
    // InternalReactionRules.g:3588:1: rule__BoundLink__Group__0 : rule__BoundLink__Group__0__Impl rule__BoundLink__Group__1 ;
    public final void rule__BoundLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3592:1: ( rule__BoundLink__Group__0__Impl rule__BoundLink__Group__1 )
            // InternalReactionRules.g:3593:2: rule__BoundLink__Group__0__Impl rule__BoundLink__Group__1
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
    // InternalReactionRules.g:3600:1: rule__BoundLink__Group__0__Impl : ( () ) ;
    public final void rule__BoundLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3604:1: ( ( () ) )
            // InternalReactionRules.g:3605:1: ( () )
            {
            // InternalReactionRules.g:3605:1: ( () )
            // InternalReactionRules.g:3606:2: ()
            {
             before(grammarAccess.getBoundLinkAccess().getBoundLinkAction_0()); 
            // InternalReactionRules.g:3607:2: ()
            // InternalReactionRules.g:3607:3: 
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
    // InternalReactionRules.g:3615:1: rule__BoundLink__Group__1 : rule__BoundLink__Group__1__Impl ;
    public final void rule__BoundLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3619:1: ( rule__BoundLink__Group__1__Impl )
            // InternalReactionRules.g:3620:2: rule__BoundLink__Group__1__Impl
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
    // InternalReactionRules.g:3626:1: rule__BoundLink__Group__1__Impl : ( ( rule__BoundLink__StateAssignment_1 ) ) ;
    public final void rule__BoundLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3630:1: ( ( ( rule__BoundLink__StateAssignment_1 ) ) )
            // InternalReactionRules.g:3631:1: ( ( rule__BoundLink__StateAssignment_1 ) )
            {
            // InternalReactionRules.g:3631:1: ( ( rule__BoundLink__StateAssignment_1 ) )
            // InternalReactionRules.g:3632:2: ( rule__BoundLink__StateAssignment_1 )
            {
             before(grammarAccess.getBoundLinkAccess().getStateAssignment_1()); 
            // InternalReactionRules.g:3633:2: ( rule__BoundLink__StateAssignment_1 )
            // InternalReactionRules.g:3633:3: rule__BoundLink__StateAssignment_1
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


    // $ANTLR start "rule__MultiLink__Group__0"
    // InternalReactionRules.g:3642:1: rule__MultiLink__Group__0 : rule__MultiLink__Group__0__Impl rule__MultiLink__Group__1 ;
    public final void rule__MultiLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3646:1: ( rule__MultiLink__Group__0__Impl rule__MultiLink__Group__1 )
            // InternalReactionRules.g:3647:2: rule__MultiLink__Group__0__Impl rule__MultiLink__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__MultiLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLink__Group__1();

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
    // $ANTLR end "rule__MultiLink__Group__0"


    // $ANTLR start "rule__MultiLink__Group__0__Impl"
    // InternalReactionRules.g:3654:1: rule__MultiLink__Group__0__Impl : ( () ) ;
    public final void rule__MultiLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3658:1: ( ( () ) )
            // InternalReactionRules.g:3659:1: ( () )
            {
            // InternalReactionRules.g:3659:1: ( () )
            // InternalReactionRules.g:3660:2: ()
            {
             before(grammarAccess.getMultiLinkAccess().getMultiLinkAction_0()); 
            // InternalReactionRules.g:3661:2: ()
            // InternalReactionRules.g:3661:3: 
            {
            }

             after(grammarAccess.getMultiLinkAccess().getMultiLinkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLink__Group__0__Impl"


    // $ANTLR start "rule__MultiLink__Group__1"
    // InternalReactionRules.g:3669:1: rule__MultiLink__Group__1 : rule__MultiLink__Group__1__Impl ;
    public final void rule__MultiLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3673:1: ( rule__MultiLink__Group__1__Impl )
            // InternalReactionRules.g:3674:2: rule__MultiLink__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiLink__Group__1__Impl();

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
    // $ANTLR end "rule__MultiLink__Group__1"


    // $ANTLR start "rule__MultiLink__Group__1__Impl"
    // InternalReactionRules.g:3680:1: rule__MultiLink__Group__1__Impl : ( ( rule__MultiLink__Group_1__0 )? ) ;
    public final void rule__MultiLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3684:1: ( ( ( rule__MultiLink__Group_1__0 )? ) )
            // InternalReactionRules.g:3685:1: ( ( rule__MultiLink__Group_1__0 )? )
            {
            // InternalReactionRules.g:3685:1: ( ( rule__MultiLink__Group_1__0 )? )
            // InternalReactionRules.g:3686:2: ( rule__MultiLink__Group_1__0 )?
            {
             before(grammarAccess.getMultiLinkAccess().getGroup_1()); 
            // InternalReactionRules.g:3687:2: ( rule__MultiLink__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT||LA23_0==RULE_FREE_LINK) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalReactionRules.g:3687:3: rule__MultiLink__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiLink__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiLinkAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MultiLink__Group__1__Impl"


    // $ANTLR start "rule__MultiLink__Group_1__0"
    // InternalReactionRules.g:3696:1: rule__MultiLink__Group_1__0 : rule__MultiLink__Group_1__0__Impl rule__MultiLink__Group_1__1 ;
    public final void rule__MultiLink__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3700:1: ( rule__MultiLink__Group_1__0__Impl rule__MultiLink__Group_1__1 )
            // InternalReactionRules.g:3701:2: rule__MultiLink__Group_1__0__Impl rule__MultiLink__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__MultiLink__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLink__Group_1__1();

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
    // $ANTLR end "rule__MultiLink__Group_1__0"


    // $ANTLR start "rule__MultiLink__Group_1__0__Impl"
    // InternalReactionRules.g:3708:1: rule__MultiLink__Group_1__0__Impl : ( ( rule__MultiLink__StatesAssignment_1_0 ) ) ;
    public final void rule__MultiLink__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3712:1: ( ( ( rule__MultiLink__StatesAssignment_1_0 ) ) )
            // InternalReactionRules.g:3713:1: ( ( rule__MultiLink__StatesAssignment_1_0 ) )
            {
            // InternalReactionRules.g:3713:1: ( ( rule__MultiLink__StatesAssignment_1_0 ) )
            // InternalReactionRules.g:3714:2: ( rule__MultiLink__StatesAssignment_1_0 )
            {
             before(grammarAccess.getMultiLinkAccess().getStatesAssignment_1_0()); 
            // InternalReactionRules.g:3715:2: ( rule__MultiLink__StatesAssignment_1_0 )
            // InternalReactionRules.g:3715:3: rule__MultiLink__StatesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiLink__StatesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiLinkAccess().getStatesAssignment_1_0()); 

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
    // $ANTLR end "rule__MultiLink__Group_1__0__Impl"


    // $ANTLR start "rule__MultiLink__Group_1__1"
    // InternalReactionRules.g:3723:1: rule__MultiLink__Group_1__1 : rule__MultiLink__Group_1__1__Impl ;
    public final void rule__MultiLink__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3727:1: ( rule__MultiLink__Group_1__1__Impl )
            // InternalReactionRules.g:3728:2: rule__MultiLink__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiLink__Group_1__1__Impl();

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
    // $ANTLR end "rule__MultiLink__Group_1__1"


    // $ANTLR start "rule__MultiLink__Group_1__1__Impl"
    // InternalReactionRules.g:3734:1: rule__MultiLink__Group_1__1__Impl : ( ( ( rule__MultiLink__Group_1_1__0 ) ) ( ( rule__MultiLink__Group_1_1__0 )* ) ) ;
    public final void rule__MultiLink__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3738:1: ( ( ( ( rule__MultiLink__Group_1_1__0 ) ) ( ( rule__MultiLink__Group_1_1__0 )* ) ) )
            // InternalReactionRules.g:3739:1: ( ( ( rule__MultiLink__Group_1_1__0 ) ) ( ( rule__MultiLink__Group_1_1__0 )* ) )
            {
            // InternalReactionRules.g:3739:1: ( ( ( rule__MultiLink__Group_1_1__0 ) ) ( ( rule__MultiLink__Group_1_1__0 )* ) )
            // InternalReactionRules.g:3740:2: ( ( rule__MultiLink__Group_1_1__0 ) ) ( ( rule__MultiLink__Group_1_1__0 )* )
            {
            // InternalReactionRules.g:3740:2: ( ( rule__MultiLink__Group_1_1__0 ) )
            // InternalReactionRules.g:3741:3: ( rule__MultiLink__Group_1_1__0 )
            {
             before(grammarAccess.getMultiLinkAccess().getGroup_1_1()); 
            // InternalReactionRules.g:3742:3: ( rule__MultiLink__Group_1_1__0 )
            // InternalReactionRules.g:3742:4: rule__MultiLink__Group_1_1__0
            {
            pushFollow(FOLLOW_12);
            rule__MultiLink__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiLinkAccess().getGroup_1_1()); 

            }

            // InternalReactionRules.g:3745:2: ( ( rule__MultiLink__Group_1_1__0 )* )
            // InternalReactionRules.g:3746:3: ( rule__MultiLink__Group_1_1__0 )*
            {
             before(grammarAccess.getMultiLinkAccess().getGroup_1_1()); 
            // InternalReactionRules.g:3747:3: ( rule__MultiLink__Group_1_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==25) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalReactionRules.g:3747:4: rule__MultiLink__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MultiLink__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getMultiLinkAccess().getGroup_1_1()); 

            }


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
    // $ANTLR end "rule__MultiLink__Group_1__1__Impl"


    // $ANTLR start "rule__MultiLink__Group_1_1__0"
    // InternalReactionRules.g:3757:1: rule__MultiLink__Group_1_1__0 : rule__MultiLink__Group_1_1__0__Impl rule__MultiLink__Group_1_1__1 ;
    public final void rule__MultiLink__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3761:1: ( rule__MultiLink__Group_1_1__0__Impl rule__MultiLink__Group_1_1__1 )
            // InternalReactionRules.g:3762:2: rule__MultiLink__Group_1_1__0__Impl rule__MultiLink__Group_1_1__1
            {
            pushFollow(FOLLOW_23);
            rule__MultiLink__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLink__Group_1_1__1();

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
    // $ANTLR end "rule__MultiLink__Group_1_1__0"


    // $ANTLR start "rule__MultiLink__Group_1_1__0__Impl"
    // InternalReactionRules.g:3769:1: rule__MultiLink__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__MultiLink__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3773:1: ( ( ',' ) )
            // InternalReactionRules.g:3774:1: ( ',' )
            {
            // InternalReactionRules.g:3774:1: ( ',' )
            // InternalReactionRules.g:3775:2: ','
            {
             before(grammarAccess.getMultiLinkAccess().getCommaKeyword_1_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMultiLinkAccess().getCommaKeyword_1_1_0()); 

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
    // $ANTLR end "rule__MultiLink__Group_1_1__0__Impl"


    // $ANTLR start "rule__MultiLink__Group_1_1__1"
    // InternalReactionRules.g:3784:1: rule__MultiLink__Group_1_1__1 : rule__MultiLink__Group_1_1__1__Impl ;
    public final void rule__MultiLink__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3788:1: ( rule__MultiLink__Group_1_1__1__Impl )
            // InternalReactionRules.g:3789:2: rule__MultiLink__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiLink__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__MultiLink__Group_1_1__1"


    // $ANTLR start "rule__MultiLink__Group_1_1__1__Impl"
    // InternalReactionRules.g:3795:1: rule__MultiLink__Group_1_1__1__Impl : ( ( rule__MultiLink__StatesAssignment_1_1_1 ) ) ;
    public final void rule__MultiLink__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3799:1: ( ( ( rule__MultiLink__StatesAssignment_1_1_1 ) ) )
            // InternalReactionRules.g:3800:1: ( ( rule__MultiLink__StatesAssignment_1_1_1 ) )
            {
            // InternalReactionRules.g:3800:1: ( ( rule__MultiLink__StatesAssignment_1_1_1 ) )
            // InternalReactionRules.g:3801:2: ( rule__MultiLink__StatesAssignment_1_1_1 )
            {
             before(grammarAccess.getMultiLinkAccess().getStatesAssignment_1_1_1()); 
            // InternalReactionRules.g:3802:2: ( rule__MultiLink__StatesAssignment_1_1_1 )
            // InternalReactionRules.g:3802:3: rule__MultiLink__StatesAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiLink__StatesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiLinkAccess().getStatesAssignment_1_1_1()); 

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
    // $ANTLR end "rule__MultiLink__Group_1_1__1__Impl"


    // $ANTLR start "rule__BoundAnyOfTypeLinkAgent__Group__0"
    // InternalReactionRules.g:3811:1: rule__BoundAnyOfTypeLinkAgent__Group__0 : rule__BoundAnyOfTypeLinkAgent__Group__0__Impl rule__BoundAnyOfTypeLinkAgent__Group__1 ;
    public final void rule__BoundAnyOfTypeLinkAgent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3815:1: ( rule__BoundAnyOfTypeLinkAgent__Group__0__Impl rule__BoundAnyOfTypeLinkAgent__Group__1 )
            // InternalReactionRules.g:3816:2: rule__BoundAnyOfTypeLinkAgent__Group__0__Impl rule__BoundAnyOfTypeLinkAgent__Group__1
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
    // InternalReactionRules.g:3823:1: rule__BoundAnyOfTypeLinkAgent__Group__0__Impl : ( () ) ;
    public final void rule__BoundAnyOfTypeLinkAgent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3827:1: ( ( () ) )
            // InternalReactionRules.g:3828:1: ( () )
            {
            // InternalReactionRules.g:3828:1: ( () )
            // InternalReactionRules.g:3829:2: ()
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getBoundAnyOfTypeLinkAgentAction_0()); 
            // InternalReactionRules.g:3830:2: ()
            // InternalReactionRules.g:3830:3: 
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
    // InternalReactionRules.g:3838:1: rule__BoundAnyOfTypeLinkAgent__Group__1 : rule__BoundAnyOfTypeLinkAgent__Group__1__Impl ;
    public final void rule__BoundAnyOfTypeLinkAgent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3842:1: ( rule__BoundAnyOfTypeLinkAgent__Group__1__Impl )
            // InternalReactionRules.g:3843:2: rule__BoundAnyOfTypeLinkAgent__Group__1__Impl
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
    // InternalReactionRules.g:3849:1: rule__BoundAnyOfTypeLinkAgent__Group__1__Impl : ( ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 ) ) ;
    public final void rule__BoundAnyOfTypeLinkAgent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3853:1: ( ( ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 ) ) )
            // InternalReactionRules.g:3854:1: ( ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 ) )
            {
            // InternalReactionRules.g:3854:1: ( ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 ) )
            // InternalReactionRules.g:3855:2: ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getAgentAssignment_1()); 
            // InternalReactionRules.g:3856:2: ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 )
            // InternalReactionRules.g:3856:3: rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1
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
    // InternalReactionRules.g:3865:1: rule__BoundAnyOfTypeLinkSite__Group__0 : rule__BoundAnyOfTypeLinkSite__Group__0__Impl rule__BoundAnyOfTypeLinkSite__Group__1 ;
    public final void rule__BoundAnyOfTypeLinkSite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3869:1: ( rule__BoundAnyOfTypeLinkSite__Group__0__Impl rule__BoundAnyOfTypeLinkSite__Group__1 )
            // InternalReactionRules.g:3870:2: rule__BoundAnyOfTypeLinkSite__Group__0__Impl rule__BoundAnyOfTypeLinkSite__Group__1
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
    // InternalReactionRules.g:3877:1: rule__BoundAnyOfTypeLinkSite__Group__0__Impl : ( () ) ;
    public final void rule__BoundAnyOfTypeLinkSite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3881:1: ( ( () ) )
            // InternalReactionRules.g:3882:1: ( () )
            {
            // InternalReactionRules.g:3882:1: ( () )
            // InternalReactionRules.g:3883:2: ()
            {
             before(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getBoundAnyOfTypeLinkSiteAction_0()); 
            // InternalReactionRules.g:3884:2: ()
            // InternalReactionRules.g:3884:3: 
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
    // InternalReactionRules.g:3892:1: rule__BoundAnyOfTypeLinkSite__Group__1 : rule__BoundAnyOfTypeLinkSite__Group__1__Impl ;
    public final void rule__BoundAnyOfTypeLinkSite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3896:1: ( rule__BoundAnyOfTypeLinkSite__Group__1__Impl )
            // InternalReactionRules.g:3897:2: rule__BoundAnyOfTypeLinkSite__Group__1__Impl
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
    // InternalReactionRules.g:3903:1: rule__BoundAnyOfTypeLinkSite__Group__1__Impl : ( ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 ) ) ;
    public final void rule__BoundAnyOfTypeLinkSite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3907:1: ( ( ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 ) ) )
            // InternalReactionRules.g:3908:1: ( ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 ) )
            {
            // InternalReactionRules.g:3908:1: ( ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 ) )
            // InternalReactionRules.g:3909:2: ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getSiteAssignment_1()); 
            // InternalReactionRules.g:3910:2: ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 )
            // InternalReactionRules.g:3910:3: rule__BoundAnyOfTypeLinkSite__SiteAssignment_1
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
    // InternalReactionRules.g:3919:1: rule__BoundAnyOfTypeLink__Group__0 : rule__BoundAnyOfTypeLink__Group__0__Impl rule__BoundAnyOfTypeLink__Group__1 ;
    public final void rule__BoundAnyOfTypeLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3923:1: ( rule__BoundAnyOfTypeLink__Group__0__Impl rule__BoundAnyOfTypeLink__Group__1 )
            // InternalReactionRules.g:3924:2: rule__BoundAnyOfTypeLink__Group__0__Impl rule__BoundAnyOfTypeLink__Group__1
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
    // InternalReactionRules.g:3931:1: rule__BoundAnyOfTypeLink__Group__0__Impl : ( () ) ;
    public final void rule__BoundAnyOfTypeLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3935:1: ( ( () ) )
            // InternalReactionRules.g:3936:1: ( () )
            {
            // InternalReactionRules.g:3936:1: ( () )
            // InternalReactionRules.g:3937:2: ()
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAccess().getBoundAnyOfTypeLinkAction_0()); 
            // InternalReactionRules.g:3938:2: ()
            // InternalReactionRules.g:3938:3: 
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
    // InternalReactionRules.g:3946:1: rule__BoundAnyOfTypeLink__Group__1 : rule__BoundAnyOfTypeLink__Group__1__Impl rule__BoundAnyOfTypeLink__Group__2 ;
    public final void rule__BoundAnyOfTypeLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3950:1: ( rule__BoundAnyOfTypeLink__Group__1__Impl rule__BoundAnyOfTypeLink__Group__2 )
            // InternalReactionRules.g:3951:2: rule__BoundAnyOfTypeLink__Group__1__Impl rule__BoundAnyOfTypeLink__Group__2
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
    // InternalReactionRules.g:3958:1: rule__BoundAnyOfTypeLink__Group__1__Impl : ( ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 ) ) ;
    public final void rule__BoundAnyOfTypeLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3962:1: ( ( ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 ) ) )
            // InternalReactionRules.g:3963:1: ( ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 ) )
            {
            // InternalReactionRules.g:3963:1: ( ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 ) )
            // InternalReactionRules.g:3964:2: ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAccess().getLinkAgentAssignment_1()); 
            // InternalReactionRules.g:3965:2: ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 )
            // InternalReactionRules.g:3965:3: rule__BoundAnyOfTypeLink__LinkAgentAssignment_1
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
    // InternalReactionRules.g:3973:1: rule__BoundAnyOfTypeLink__Group__2 : rule__BoundAnyOfTypeLink__Group__2__Impl rule__BoundAnyOfTypeLink__Group__3 ;
    public final void rule__BoundAnyOfTypeLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3977:1: ( rule__BoundAnyOfTypeLink__Group__2__Impl rule__BoundAnyOfTypeLink__Group__3 )
            // InternalReactionRules.g:3978:2: rule__BoundAnyOfTypeLink__Group__2__Impl rule__BoundAnyOfTypeLink__Group__3
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
    // InternalReactionRules.g:3985:1: rule__BoundAnyOfTypeLink__Group__2__Impl : ( '.' ) ;
    public final void rule__BoundAnyOfTypeLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3989:1: ( ( '.' ) )
            // InternalReactionRules.g:3990:1: ( '.' )
            {
            // InternalReactionRules.g:3990:1: ( '.' )
            // InternalReactionRules.g:3991:2: '.'
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
    // InternalReactionRules.g:4000:1: rule__BoundAnyOfTypeLink__Group__3 : rule__BoundAnyOfTypeLink__Group__3__Impl ;
    public final void rule__BoundAnyOfTypeLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4004:1: ( rule__BoundAnyOfTypeLink__Group__3__Impl )
            // InternalReactionRules.g:4005:2: rule__BoundAnyOfTypeLink__Group__3__Impl
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
    // InternalReactionRules.g:4011:1: rule__BoundAnyOfTypeLink__Group__3__Impl : ( ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 ) ) ;
    public final void rule__BoundAnyOfTypeLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4015:1: ( ( ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 ) ) )
            // InternalReactionRules.g:4016:1: ( ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 ) )
            {
            // InternalReactionRules.g:4016:1: ( ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 ) )
            // InternalReactionRules.g:4017:2: ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAccess().getLinkSiteAssignment_3()); 
            // InternalReactionRules.g:4018:2: ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 )
            // InternalReactionRules.g:4018:3: rule__BoundAnyOfTypeLink__LinkSiteAssignment_3
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
    // InternalReactionRules.g:4027:1: rule__SiteState__Group__0 : rule__SiteState__Group__0__Impl rule__SiteState__Group__1 ;
    public final void rule__SiteState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4031:1: ( rule__SiteState__Group__0__Impl rule__SiteState__Group__1 )
            // InternalReactionRules.g:4032:2: rule__SiteState__Group__0__Impl rule__SiteState__Group__1
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
    // InternalReactionRules.g:4039:1: rule__SiteState__Group__0__Impl : ( () ) ;
    public final void rule__SiteState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4043:1: ( ( () ) )
            // InternalReactionRules.g:4044:1: ( () )
            {
            // InternalReactionRules.g:4044:1: ( () )
            // InternalReactionRules.g:4045:2: ()
            {
             before(grammarAccess.getSiteStateAccess().getSiteStateAction_0()); 
            // InternalReactionRules.g:4046:2: ()
            // InternalReactionRules.g:4046:3: 
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
    // InternalReactionRules.g:4054:1: rule__SiteState__Group__1 : rule__SiteState__Group__1__Impl rule__SiteState__Group__2 ;
    public final void rule__SiteState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4058:1: ( rule__SiteState__Group__1__Impl rule__SiteState__Group__2 )
            // InternalReactionRules.g:4059:2: rule__SiteState__Group__1__Impl rule__SiteState__Group__2
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
    // InternalReactionRules.g:4066:1: rule__SiteState__Group__1__Impl : ( '{' ) ;
    public final void rule__SiteState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4070:1: ( ( '{' ) )
            // InternalReactionRules.g:4071:1: ( '{' )
            {
            // InternalReactionRules.g:4071:1: ( '{' )
            // InternalReactionRules.g:4072:2: '{'
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
    // InternalReactionRules.g:4081:1: rule__SiteState__Group__2 : rule__SiteState__Group__2__Impl rule__SiteState__Group__3 ;
    public final void rule__SiteState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4085:1: ( rule__SiteState__Group__2__Impl rule__SiteState__Group__3 )
            // InternalReactionRules.g:4086:2: rule__SiteState__Group__2__Impl rule__SiteState__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalReactionRules.g:4093:1: rule__SiteState__Group__2__Impl : ( ( rule__SiteState__StateAssignment_2 ) ) ;
    public final void rule__SiteState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4097:1: ( ( ( rule__SiteState__StateAssignment_2 ) ) )
            // InternalReactionRules.g:4098:1: ( ( rule__SiteState__StateAssignment_2 ) )
            {
            // InternalReactionRules.g:4098:1: ( ( rule__SiteState__StateAssignment_2 ) )
            // InternalReactionRules.g:4099:2: ( rule__SiteState__StateAssignment_2 )
            {
             before(grammarAccess.getSiteStateAccess().getStateAssignment_2()); 
            // InternalReactionRules.g:4100:2: ( rule__SiteState__StateAssignment_2 )
            // InternalReactionRules.g:4100:3: rule__SiteState__StateAssignment_2
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
    // InternalReactionRules.g:4108:1: rule__SiteState__Group__3 : rule__SiteState__Group__3__Impl ;
    public final void rule__SiteState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4112:1: ( rule__SiteState__Group__3__Impl )
            // InternalReactionRules.g:4113:2: rule__SiteState__Group__3__Impl
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
    // InternalReactionRules.g:4119:1: rule__SiteState__Group__3__Impl : ( '}' ) ;
    public final void rule__SiteState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4123:1: ( ( '}' ) )
            // InternalReactionRules.g:4124:1: ( '}' )
            {
            // InternalReactionRules.g:4124:1: ( '}' )
            // InternalReactionRules.g:4125:2: '}'
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
    // InternalReactionRules.g:4135:1: rule__LinkState__Group__0 : rule__LinkState__Group__0__Impl rule__LinkState__Group__1 ;
    public final void rule__LinkState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4139:1: ( rule__LinkState__Group__0__Impl rule__LinkState__Group__1 )
            // InternalReactionRules.g:4140:2: rule__LinkState__Group__0__Impl rule__LinkState__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalReactionRules.g:4147:1: rule__LinkState__Group__0__Impl : ( () ) ;
    public final void rule__LinkState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4151:1: ( ( () ) )
            // InternalReactionRules.g:4152:1: ( () )
            {
            // InternalReactionRules.g:4152:1: ( () )
            // InternalReactionRules.g:4153:2: ()
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAction_0()); 
            // InternalReactionRules.g:4154:2: ()
            // InternalReactionRules.g:4154:3: 
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
    // InternalReactionRules.g:4162:1: rule__LinkState__Group__1 : rule__LinkState__Group__1__Impl rule__LinkState__Group__2 ;
    public final void rule__LinkState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4166:1: ( rule__LinkState__Group__1__Impl rule__LinkState__Group__2 )
            // InternalReactionRules.g:4167:2: rule__LinkState__Group__1__Impl rule__LinkState__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalReactionRules.g:4174:1: rule__LinkState__Group__1__Impl : ( '[' ) ;
    public final void rule__LinkState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4178:1: ( ( '[' ) )
            // InternalReactionRules.g:4179:1: ( '[' )
            {
            // InternalReactionRules.g:4179:1: ( '[' )
            // InternalReactionRules.g:4180:2: '['
            {
             before(grammarAccess.getLinkStateAccess().getLeftSquareBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalReactionRules.g:4189:1: rule__LinkState__Group__2 : rule__LinkState__Group__2__Impl rule__LinkState__Group__3 ;
    public final void rule__LinkState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4193:1: ( rule__LinkState__Group__2__Impl rule__LinkState__Group__3 )
            // InternalReactionRules.g:4194:2: rule__LinkState__Group__2__Impl rule__LinkState__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalReactionRules.g:4201:1: rule__LinkState__Group__2__Impl : ( ( rule__LinkState__LinkStateAssignment_2 ) ) ;
    public final void rule__LinkState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4205:1: ( ( ( rule__LinkState__LinkStateAssignment_2 ) ) )
            // InternalReactionRules.g:4206:1: ( ( rule__LinkState__LinkStateAssignment_2 ) )
            {
            // InternalReactionRules.g:4206:1: ( ( rule__LinkState__LinkStateAssignment_2 ) )
            // InternalReactionRules.g:4207:2: ( rule__LinkState__LinkStateAssignment_2 )
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAssignment_2()); 
            // InternalReactionRules.g:4208:2: ( rule__LinkState__LinkStateAssignment_2 )
            // InternalReactionRules.g:4208:3: rule__LinkState__LinkStateAssignment_2
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
    // InternalReactionRules.g:4216:1: rule__LinkState__Group__3 : rule__LinkState__Group__3__Impl ;
    public final void rule__LinkState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4220:1: ( rule__LinkState__Group__3__Impl )
            // InternalReactionRules.g:4221:2: rule__LinkState__Group__3__Impl
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
    // InternalReactionRules.g:4227:1: rule__LinkState__Group__3__Impl : ( ']' ) ;
    public final void rule__LinkState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4231:1: ( ( ']' ) )
            // InternalReactionRules.g:4232:1: ( ']' )
            {
            // InternalReactionRules.g:4232:1: ( ']' )
            // InternalReactionRules.g:4233:2: ']'
            {
             before(grammarAccess.getLinkStateAccess().getRightSquareBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
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


    // $ANTLR start "rule__MultiLinkState__Group__0"
    // InternalReactionRules.g:4243:1: rule__MultiLinkState__Group__0 : rule__MultiLinkState__Group__0__Impl rule__MultiLinkState__Group__1 ;
    public final void rule__MultiLinkState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4247:1: ( rule__MultiLinkState__Group__0__Impl rule__MultiLinkState__Group__1 )
            // InternalReactionRules.g:4248:2: rule__MultiLinkState__Group__0__Impl rule__MultiLinkState__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__MultiLinkState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLinkState__Group__1();

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
    // $ANTLR end "rule__MultiLinkState__Group__0"


    // $ANTLR start "rule__MultiLinkState__Group__0__Impl"
    // InternalReactionRules.g:4255:1: rule__MultiLinkState__Group__0__Impl : ( () ) ;
    public final void rule__MultiLinkState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4259:1: ( ( () ) )
            // InternalReactionRules.g:4260:1: ( () )
            {
            // InternalReactionRules.g:4260:1: ( () )
            // InternalReactionRules.g:4261:2: ()
            {
             before(grammarAccess.getMultiLinkStateAccess().getMultiLinkStateAction_0()); 
            // InternalReactionRules.g:4262:2: ()
            // InternalReactionRules.g:4262:3: 
            {
            }

             after(grammarAccess.getMultiLinkStateAccess().getMultiLinkStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLinkState__Group__0__Impl"


    // $ANTLR start "rule__MultiLinkState__Group__1"
    // InternalReactionRules.g:4270:1: rule__MultiLinkState__Group__1 : rule__MultiLinkState__Group__1__Impl rule__MultiLinkState__Group__2 ;
    public final void rule__MultiLinkState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4274:1: ( rule__MultiLinkState__Group__1__Impl rule__MultiLinkState__Group__2 )
            // InternalReactionRules.g:4275:2: rule__MultiLinkState__Group__1__Impl rule__MultiLinkState__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__MultiLinkState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLinkState__Group__2();

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
    // $ANTLR end "rule__MultiLinkState__Group__1"


    // $ANTLR start "rule__MultiLinkState__Group__1__Impl"
    // InternalReactionRules.g:4282:1: rule__MultiLinkState__Group__1__Impl : ( '*[' ) ;
    public final void rule__MultiLinkState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4286:1: ( ( '*[' ) )
            // InternalReactionRules.g:4287:1: ( '*[' )
            {
            // InternalReactionRules.g:4287:1: ( '*[' )
            // InternalReactionRules.g:4288:2: '*['
            {
             before(grammarAccess.getMultiLinkStateAccess().getAsteriskLeftSquareBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMultiLinkStateAccess().getAsteriskLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__MultiLinkState__Group__1__Impl"


    // $ANTLR start "rule__MultiLinkState__Group__2"
    // InternalReactionRules.g:4297:1: rule__MultiLinkState__Group__2 : rule__MultiLinkState__Group__2__Impl rule__MultiLinkState__Group__3 ;
    public final void rule__MultiLinkState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4301:1: ( rule__MultiLinkState__Group__2__Impl rule__MultiLinkState__Group__3 )
            // InternalReactionRules.g:4302:2: rule__MultiLinkState__Group__2__Impl rule__MultiLinkState__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__MultiLinkState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLinkState__Group__3();

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
    // $ANTLR end "rule__MultiLinkState__Group__2"


    // $ANTLR start "rule__MultiLinkState__Group__2__Impl"
    // InternalReactionRules.g:4309:1: rule__MultiLinkState__Group__2__Impl : ( ( rule__MultiLinkState__LinkStateAssignment_2 ) ) ;
    public final void rule__MultiLinkState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4313:1: ( ( ( rule__MultiLinkState__LinkStateAssignment_2 ) ) )
            // InternalReactionRules.g:4314:1: ( ( rule__MultiLinkState__LinkStateAssignment_2 ) )
            {
            // InternalReactionRules.g:4314:1: ( ( rule__MultiLinkState__LinkStateAssignment_2 ) )
            // InternalReactionRules.g:4315:2: ( rule__MultiLinkState__LinkStateAssignment_2 )
            {
             before(grammarAccess.getMultiLinkStateAccess().getLinkStateAssignment_2()); 
            // InternalReactionRules.g:4316:2: ( rule__MultiLinkState__LinkStateAssignment_2 )
            // InternalReactionRules.g:4316:3: rule__MultiLinkState__LinkStateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiLinkState__LinkStateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiLinkStateAccess().getLinkStateAssignment_2()); 

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
    // $ANTLR end "rule__MultiLinkState__Group__2__Impl"


    // $ANTLR start "rule__MultiLinkState__Group__3"
    // InternalReactionRules.g:4324:1: rule__MultiLinkState__Group__3 : rule__MultiLinkState__Group__3__Impl ;
    public final void rule__MultiLinkState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4328:1: ( rule__MultiLinkState__Group__3__Impl )
            // InternalReactionRules.g:4329:2: rule__MultiLinkState__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiLinkState__Group__3__Impl();

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
    // $ANTLR end "rule__MultiLinkState__Group__3"


    // $ANTLR start "rule__MultiLinkState__Group__3__Impl"
    // InternalReactionRules.g:4335:1: rule__MultiLinkState__Group__3__Impl : ( ']' ) ;
    public final void rule__MultiLinkState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4339:1: ( ( ']' ) )
            // InternalReactionRules.g:4340:1: ( ']' )
            {
            // InternalReactionRules.g:4340:1: ( ']' )
            // InternalReactionRules.g:4341:2: ']'
            {
             before(grammarAccess.getMultiLinkStateAccess().getRightSquareBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMultiLinkStateAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__MultiLinkState__Group__3__Impl"


    // $ANTLR start "rule__SingleSitePattern__Group__0"
    // InternalReactionRules.g:4351:1: rule__SingleSitePattern__Group__0 : rule__SingleSitePattern__Group__0__Impl rule__SingleSitePattern__Group__1 ;
    public final void rule__SingleSitePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4355:1: ( rule__SingleSitePattern__Group__0__Impl rule__SingleSitePattern__Group__1 )
            // InternalReactionRules.g:4356:2: rule__SingleSitePattern__Group__0__Impl rule__SingleSitePattern__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SingleSitePattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleSitePattern__Group__1();

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
    // $ANTLR end "rule__SingleSitePattern__Group__0"


    // $ANTLR start "rule__SingleSitePattern__Group__0__Impl"
    // InternalReactionRules.g:4363:1: rule__SingleSitePattern__Group__0__Impl : ( () ) ;
    public final void rule__SingleSitePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4367:1: ( ( () ) )
            // InternalReactionRules.g:4368:1: ( () )
            {
            // InternalReactionRules.g:4368:1: ( () )
            // InternalReactionRules.g:4369:2: ()
            {
             before(grammarAccess.getSingleSitePatternAccess().getSingleSitePatternAction_0()); 
            // InternalReactionRules.g:4370:2: ()
            // InternalReactionRules.g:4370:3: 
            {
            }

             after(grammarAccess.getSingleSitePatternAccess().getSingleSitePatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSitePattern__Group__0__Impl"


    // $ANTLR start "rule__SingleSitePattern__Group__1"
    // InternalReactionRules.g:4378:1: rule__SingleSitePattern__Group__1 : rule__SingleSitePattern__Group__1__Impl rule__SingleSitePattern__Group__2 ;
    public final void rule__SingleSitePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4382:1: ( rule__SingleSitePattern__Group__1__Impl rule__SingleSitePattern__Group__2 )
            // InternalReactionRules.g:4383:2: rule__SingleSitePattern__Group__1__Impl rule__SingleSitePattern__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__SingleSitePattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleSitePattern__Group__2();

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
    // $ANTLR end "rule__SingleSitePattern__Group__1"


    // $ANTLR start "rule__SingleSitePattern__Group__1__Impl"
    // InternalReactionRules.g:4390:1: rule__SingleSitePattern__Group__1__Impl : ( ( rule__SingleSitePattern__SiteAssignment_1 ) ) ;
    public final void rule__SingleSitePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4394:1: ( ( ( rule__SingleSitePattern__SiteAssignment_1 ) ) )
            // InternalReactionRules.g:4395:1: ( ( rule__SingleSitePattern__SiteAssignment_1 ) )
            {
            // InternalReactionRules.g:4395:1: ( ( rule__SingleSitePattern__SiteAssignment_1 ) )
            // InternalReactionRules.g:4396:2: ( rule__SingleSitePattern__SiteAssignment_1 )
            {
             before(grammarAccess.getSingleSitePatternAccess().getSiteAssignment_1()); 
            // InternalReactionRules.g:4397:2: ( rule__SingleSitePattern__SiteAssignment_1 )
            // InternalReactionRules.g:4397:3: rule__SingleSitePattern__SiteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleSitePattern__SiteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleSitePatternAccess().getSiteAssignment_1()); 

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
    // $ANTLR end "rule__SingleSitePattern__Group__1__Impl"


    // $ANTLR start "rule__SingleSitePattern__Group__2"
    // InternalReactionRules.g:4405:1: rule__SingleSitePattern__Group__2 : rule__SingleSitePattern__Group__2__Impl rule__SingleSitePattern__Group__3 ;
    public final void rule__SingleSitePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4409:1: ( rule__SingleSitePattern__Group__2__Impl rule__SingleSitePattern__Group__3 )
            // InternalReactionRules.g:4410:2: rule__SingleSitePattern__Group__2__Impl rule__SingleSitePattern__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__SingleSitePattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleSitePattern__Group__3();

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
    // $ANTLR end "rule__SingleSitePattern__Group__2"


    // $ANTLR start "rule__SingleSitePattern__Group__2__Impl"
    // InternalReactionRules.g:4417:1: rule__SingleSitePattern__Group__2__Impl : ( ( rule__SingleSitePattern__StateAssignment_2 )? ) ;
    public final void rule__SingleSitePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4421:1: ( ( ( rule__SingleSitePattern__StateAssignment_2 )? ) )
            // InternalReactionRules.g:4422:1: ( ( rule__SingleSitePattern__StateAssignment_2 )? )
            {
            // InternalReactionRules.g:4422:1: ( ( rule__SingleSitePattern__StateAssignment_2 )? )
            // InternalReactionRules.g:4423:2: ( rule__SingleSitePattern__StateAssignment_2 )?
            {
             before(grammarAccess.getSingleSitePatternAccess().getStateAssignment_2()); 
            // InternalReactionRules.g:4424:2: ( rule__SingleSitePattern__StateAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalReactionRules.g:4424:3: rule__SingleSitePattern__StateAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleSitePattern__StateAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleSitePatternAccess().getStateAssignment_2()); 

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
    // $ANTLR end "rule__SingleSitePattern__Group__2__Impl"


    // $ANTLR start "rule__SingleSitePattern__Group__3"
    // InternalReactionRules.g:4432:1: rule__SingleSitePattern__Group__3 : rule__SingleSitePattern__Group__3__Impl ;
    public final void rule__SingleSitePattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4436:1: ( rule__SingleSitePattern__Group__3__Impl )
            // InternalReactionRules.g:4437:2: rule__SingleSitePattern__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleSitePattern__Group__3__Impl();

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
    // $ANTLR end "rule__SingleSitePattern__Group__3"


    // $ANTLR start "rule__SingleSitePattern__Group__3__Impl"
    // InternalReactionRules.g:4443:1: rule__SingleSitePattern__Group__3__Impl : ( ( rule__SingleSitePattern__LinkStateAssignment_3 ) ) ;
    public final void rule__SingleSitePattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4447:1: ( ( ( rule__SingleSitePattern__LinkStateAssignment_3 ) ) )
            // InternalReactionRules.g:4448:1: ( ( rule__SingleSitePattern__LinkStateAssignment_3 ) )
            {
            // InternalReactionRules.g:4448:1: ( ( rule__SingleSitePattern__LinkStateAssignment_3 ) )
            // InternalReactionRules.g:4449:2: ( rule__SingleSitePattern__LinkStateAssignment_3 )
            {
             before(grammarAccess.getSingleSitePatternAccess().getLinkStateAssignment_3()); 
            // InternalReactionRules.g:4450:2: ( rule__SingleSitePattern__LinkStateAssignment_3 )
            // InternalReactionRules.g:4450:3: rule__SingleSitePattern__LinkStateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SingleSitePattern__LinkStateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSingleSitePatternAccess().getLinkStateAssignment_3()); 

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
    // $ANTLR end "rule__SingleSitePattern__Group__3__Impl"


    // $ANTLR start "rule__MultiLinkSitePattern__Group__0"
    // InternalReactionRules.g:4459:1: rule__MultiLinkSitePattern__Group__0 : rule__MultiLinkSitePattern__Group__0__Impl rule__MultiLinkSitePattern__Group__1 ;
    public final void rule__MultiLinkSitePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4463:1: ( rule__MultiLinkSitePattern__Group__0__Impl rule__MultiLinkSitePattern__Group__1 )
            // InternalReactionRules.g:4464:2: rule__MultiLinkSitePattern__Group__0__Impl rule__MultiLinkSitePattern__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MultiLinkSitePattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLinkSitePattern__Group__1();

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
    // $ANTLR end "rule__MultiLinkSitePattern__Group__0"


    // $ANTLR start "rule__MultiLinkSitePattern__Group__0__Impl"
    // InternalReactionRules.g:4471:1: rule__MultiLinkSitePattern__Group__0__Impl : ( () ) ;
    public final void rule__MultiLinkSitePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4475:1: ( ( () ) )
            // InternalReactionRules.g:4476:1: ( () )
            {
            // InternalReactionRules.g:4476:1: ( () )
            // InternalReactionRules.g:4477:2: ()
            {
             before(grammarAccess.getMultiLinkSitePatternAccess().getMultiLinkSitePatternAction_0()); 
            // InternalReactionRules.g:4478:2: ()
            // InternalReactionRules.g:4478:3: 
            {
            }

             after(grammarAccess.getMultiLinkSitePatternAccess().getMultiLinkSitePatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiLinkSitePattern__Group__0__Impl"


    // $ANTLR start "rule__MultiLinkSitePattern__Group__1"
    // InternalReactionRules.g:4486:1: rule__MultiLinkSitePattern__Group__1 : rule__MultiLinkSitePattern__Group__1__Impl rule__MultiLinkSitePattern__Group__2 ;
    public final void rule__MultiLinkSitePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4490:1: ( rule__MultiLinkSitePattern__Group__1__Impl rule__MultiLinkSitePattern__Group__2 )
            // InternalReactionRules.g:4491:2: rule__MultiLinkSitePattern__Group__1__Impl rule__MultiLinkSitePattern__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__MultiLinkSitePattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLinkSitePattern__Group__2();

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
    // $ANTLR end "rule__MultiLinkSitePattern__Group__1"


    // $ANTLR start "rule__MultiLinkSitePattern__Group__1__Impl"
    // InternalReactionRules.g:4498:1: rule__MultiLinkSitePattern__Group__1__Impl : ( ( rule__MultiLinkSitePattern__SiteAssignment_1 ) ) ;
    public final void rule__MultiLinkSitePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4502:1: ( ( ( rule__MultiLinkSitePattern__SiteAssignment_1 ) ) )
            // InternalReactionRules.g:4503:1: ( ( rule__MultiLinkSitePattern__SiteAssignment_1 ) )
            {
            // InternalReactionRules.g:4503:1: ( ( rule__MultiLinkSitePattern__SiteAssignment_1 ) )
            // InternalReactionRules.g:4504:2: ( rule__MultiLinkSitePattern__SiteAssignment_1 )
            {
             before(grammarAccess.getMultiLinkSitePatternAccess().getSiteAssignment_1()); 
            // InternalReactionRules.g:4505:2: ( rule__MultiLinkSitePattern__SiteAssignment_1 )
            // InternalReactionRules.g:4505:3: rule__MultiLinkSitePattern__SiteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiLinkSitePattern__SiteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiLinkSitePatternAccess().getSiteAssignment_1()); 

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
    // $ANTLR end "rule__MultiLinkSitePattern__Group__1__Impl"


    // $ANTLR start "rule__MultiLinkSitePattern__Group__2"
    // InternalReactionRules.g:4513:1: rule__MultiLinkSitePattern__Group__2 : rule__MultiLinkSitePattern__Group__2__Impl rule__MultiLinkSitePattern__Group__3 ;
    public final void rule__MultiLinkSitePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4517:1: ( rule__MultiLinkSitePattern__Group__2__Impl rule__MultiLinkSitePattern__Group__3 )
            // InternalReactionRules.g:4518:2: rule__MultiLinkSitePattern__Group__2__Impl rule__MultiLinkSitePattern__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__MultiLinkSitePattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiLinkSitePattern__Group__3();

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
    // $ANTLR end "rule__MultiLinkSitePattern__Group__2"


    // $ANTLR start "rule__MultiLinkSitePattern__Group__2__Impl"
    // InternalReactionRules.g:4525:1: rule__MultiLinkSitePattern__Group__2__Impl : ( ( rule__MultiLinkSitePattern__StateAssignment_2 )? ) ;
    public final void rule__MultiLinkSitePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4529:1: ( ( ( rule__MultiLinkSitePattern__StateAssignment_2 )? ) )
            // InternalReactionRules.g:4530:1: ( ( rule__MultiLinkSitePattern__StateAssignment_2 )? )
            {
            // InternalReactionRules.g:4530:1: ( ( rule__MultiLinkSitePattern__StateAssignment_2 )? )
            // InternalReactionRules.g:4531:2: ( rule__MultiLinkSitePattern__StateAssignment_2 )?
            {
             before(grammarAccess.getMultiLinkSitePatternAccess().getStateAssignment_2()); 
            // InternalReactionRules.g:4532:2: ( rule__MultiLinkSitePattern__StateAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalReactionRules.g:4532:3: rule__MultiLinkSitePattern__StateAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiLinkSitePattern__StateAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiLinkSitePatternAccess().getStateAssignment_2()); 

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
    // $ANTLR end "rule__MultiLinkSitePattern__Group__2__Impl"


    // $ANTLR start "rule__MultiLinkSitePattern__Group__3"
    // InternalReactionRules.g:4540:1: rule__MultiLinkSitePattern__Group__3 : rule__MultiLinkSitePattern__Group__3__Impl ;
    public final void rule__MultiLinkSitePattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4544:1: ( rule__MultiLinkSitePattern__Group__3__Impl )
            // InternalReactionRules.g:4545:2: rule__MultiLinkSitePattern__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiLinkSitePattern__Group__3__Impl();

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
    // $ANTLR end "rule__MultiLinkSitePattern__Group__3"


    // $ANTLR start "rule__MultiLinkSitePattern__Group__3__Impl"
    // InternalReactionRules.g:4551:1: rule__MultiLinkSitePattern__Group__3__Impl : ( ( rule__MultiLinkSitePattern__LinkStateAssignment_3 ) ) ;
    public final void rule__MultiLinkSitePattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4555:1: ( ( ( rule__MultiLinkSitePattern__LinkStateAssignment_3 ) ) )
            // InternalReactionRules.g:4556:1: ( ( rule__MultiLinkSitePattern__LinkStateAssignment_3 ) )
            {
            // InternalReactionRules.g:4556:1: ( ( rule__MultiLinkSitePattern__LinkStateAssignment_3 ) )
            // InternalReactionRules.g:4557:2: ( rule__MultiLinkSitePattern__LinkStateAssignment_3 )
            {
             before(grammarAccess.getMultiLinkSitePatternAccess().getLinkStateAssignment_3()); 
            // InternalReactionRules.g:4558:2: ( rule__MultiLinkSitePattern__LinkStateAssignment_3 )
            // InternalReactionRules.g:4558:3: rule__MultiLinkSitePattern__LinkStateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MultiLinkSitePattern__LinkStateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMultiLinkSitePatternAccess().getLinkStateAssignment_3()); 

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
    // $ANTLR end "rule__MultiLinkSitePattern__Group__3__Impl"


    // $ANTLR start "rule__SitePatterns__Group__0"
    // InternalReactionRules.g:4567:1: rule__SitePatterns__Group__0 : rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1 ;
    public final void rule__SitePatterns__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4571:1: ( rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1 )
            // InternalReactionRules.g:4572:2: rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalReactionRules.g:4579:1: rule__SitePatterns__Group__0__Impl : ( () ) ;
    public final void rule__SitePatterns__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4583:1: ( ( () ) )
            // InternalReactionRules.g:4584:1: ( () )
            {
            // InternalReactionRules.g:4584:1: ( () )
            // InternalReactionRules.g:4585:2: ()
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAction_0()); 
            // InternalReactionRules.g:4586:2: ()
            // InternalReactionRules.g:4586:3: 
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
    // InternalReactionRules.g:4594:1: rule__SitePatterns__Group__1 : rule__SitePatterns__Group__1__Impl rule__SitePatterns__Group__2 ;
    public final void rule__SitePatterns__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4598:1: ( rule__SitePatterns__Group__1__Impl rule__SitePatterns__Group__2 )
            // InternalReactionRules.g:4599:2: rule__SitePatterns__Group__1__Impl rule__SitePatterns__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalReactionRules.g:4606:1: rule__SitePatterns__Group__1__Impl : ( '(' ) ;
    public final void rule__SitePatterns__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4610:1: ( ( '(' ) )
            // InternalReactionRules.g:4611:1: ( '(' )
            {
            // InternalReactionRules.g:4611:1: ( '(' )
            // InternalReactionRules.g:4612:2: '('
            {
             before(grammarAccess.getSitePatternsAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalReactionRules.g:4621:1: rule__SitePatterns__Group__2 : rule__SitePatterns__Group__2__Impl rule__SitePatterns__Group__3 ;
    public final void rule__SitePatterns__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4625:1: ( rule__SitePatterns__Group__2__Impl rule__SitePatterns__Group__3 )
            // InternalReactionRules.g:4626:2: rule__SitePatterns__Group__2__Impl rule__SitePatterns__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalReactionRules.g:4633:1: rule__SitePatterns__Group__2__Impl : ( ( rule__SitePatterns__Group_2__0 )? ) ;
    public final void rule__SitePatterns__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4637:1: ( ( ( rule__SitePatterns__Group_2__0 )? ) )
            // InternalReactionRules.g:4638:1: ( ( rule__SitePatterns__Group_2__0 )? )
            {
            // InternalReactionRules.g:4638:1: ( ( rule__SitePatterns__Group_2__0 )? )
            // InternalReactionRules.g:4639:2: ( rule__SitePatterns__Group_2__0 )?
            {
             before(grammarAccess.getSitePatternsAccess().getGroup_2()); 
            // InternalReactionRules.g:4640:2: ( rule__SitePatterns__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalReactionRules.g:4640:3: rule__SitePatterns__Group_2__0
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
    // InternalReactionRules.g:4648:1: rule__SitePatterns__Group__3 : rule__SitePatterns__Group__3__Impl ;
    public final void rule__SitePatterns__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4652:1: ( rule__SitePatterns__Group__3__Impl )
            // InternalReactionRules.g:4653:2: rule__SitePatterns__Group__3__Impl
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
    // InternalReactionRules.g:4659:1: rule__SitePatterns__Group__3__Impl : ( ')' ) ;
    public final void rule__SitePatterns__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4663:1: ( ( ')' ) )
            // InternalReactionRules.g:4664:1: ( ')' )
            {
            // InternalReactionRules.g:4664:1: ( ')' )
            // InternalReactionRules.g:4665:2: ')'
            {
             before(grammarAccess.getSitePatternsAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalReactionRules.g:4675:1: rule__SitePatterns__Group_2__0 : rule__SitePatterns__Group_2__0__Impl rule__SitePatterns__Group_2__1 ;
    public final void rule__SitePatterns__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4679:1: ( rule__SitePatterns__Group_2__0__Impl rule__SitePatterns__Group_2__1 )
            // InternalReactionRules.g:4680:2: rule__SitePatterns__Group_2__0__Impl rule__SitePatterns__Group_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalReactionRules.g:4687:1: rule__SitePatterns__Group_2__0__Impl : ( ( rule__SitePatterns__SitePatternsAssignment_2_0 ) ) ;
    public final void rule__SitePatterns__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4691:1: ( ( ( rule__SitePatterns__SitePatternsAssignment_2_0 ) ) )
            // InternalReactionRules.g:4692:1: ( ( rule__SitePatterns__SitePatternsAssignment_2_0 ) )
            {
            // InternalReactionRules.g:4692:1: ( ( rule__SitePatterns__SitePatternsAssignment_2_0 ) )
            // InternalReactionRules.g:4693:2: ( rule__SitePatterns__SitePatternsAssignment_2_0 )
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAssignment_2_0()); 
            // InternalReactionRules.g:4694:2: ( rule__SitePatterns__SitePatternsAssignment_2_0 )
            // InternalReactionRules.g:4694:3: rule__SitePatterns__SitePatternsAssignment_2_0
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
    // InternalReactionRules.g:4702:1: rule__SitePatterns__Group_2__1 : rule__SitePatterns__Group_2__1__Impl ;
    public final void rule__SitePatterns__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4706:1: ( rule__SitePatterns__Group_2__1__Impl )
            // InternalReactionRules.g:4707:2: rule__SitePatterns__Group_2__1__Impl
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
    // InternalReactionRules.g:4713:1: rule__SitePatterns__Group_2__1__Impl : ( ( rule__SitePatterns__Group_2_1__0 )* ) ;
    public final void rule__SitePatterns__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4717:1: ( ( ( rule__SitePatterns__Group_2_1__0 )* ) )
            // InternalReactionRules.g:4718:1: ( ( rule__SitePatterns__Group_2_1__0 )* )
            {
            // InternalReactionRules.g:4718:1: ( ( rule__SitePatterns__Group_2_1__0 )* )
            // InternalReactionRules.g:4719:2: ( rule__SitePatterns__Group_2_1__0 )*
            {
             before(grammarAccess.getSitePatternsAccess().getGroup_2_1()); 
            // InternalReactionRules.g:4720:2: ( rule__SitePatterns__Group_2_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==25) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalReactionRules.g:4720:3: rule__SitePatterns__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__SitePatterns__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalReactionRules.g:4729:1: rule__SitePatterns__Group_2_1__0 : rule__SitePatterns__Group_2_1__0__Impl rule__SitePatterns__Group_2_1__1 ;
    public final void rule__SitePatterns__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4733:1: ( rule__SitePatterns__Group_2_1__0__Impl rule__SitePatterns__Group_2_1__1 )
            // InternalReactionRules.g:4734:2: rule__SitePatterns__Group_2_1__0__Impl rule__SitePatterns__Group_2_1__1
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
    // InternalReactionRules.g:4741:1: rule__SitePatterns__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SitePatterns__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4745:1: ( ( ',' ) )
            // InternalReactionRules.g:4746:1: ( ',' )
            {
            // InternalReactionRules.g:4746:1: ( ',' )
            // InternalReactionRules.g:4747:2: ','
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
    // InternalReactionRules.g:4756:1: rule__SitePatterns__Group_2_1__1 : rule__SitePatterns__Group_2_1__1__Impl ;
    public final void rule__SitePatterns__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4760:1: ( rule__SitePatterns__Group_2_1__1__Impl )
            // InternalReactionRules.g:4761:2: rule__SitePatterns__Group_2_1__1__Impl
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
    // InternalReactionRules.g:4767:1: rule__SitePatterns__Group_2_1__1__Impl : ( ( rule__SitePatterns__SitePatternsAssignment_2_1_1 ) ) ;
    public final void rule__SitePatterns__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4771:1: ( ( ( rule__SitePatterns__SitePatternsAssignment_2_1_1 ) ) )
            // InternalReactionRules.g:4772:1: ( ( rule__SitePatterns__SitePatternsAssignment_2_1_1 ) )
            {
            // InternalReactionRules.g:4772:1: ( ( rule__SitePatterns__SitePatternsAssignment_2_1_1 ) )
            // InternalReactionRules.g:4773:2: ( rule__SitePatterns__SitePatternsAssignment_2_1_1 )
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAssignment_2_1_1()); 
            // InternalReactionRules.g:4774:2: ( rule__SitePatterns__SitePatternsAssignment_2_1_1 )
            // InternalReactionRules.g:4774:3: rule__SitePatterns__SitePatternsAssignment_2_1_1
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
    // InternalReactionRules.g:4783:1: rule__ValidAgentPattern__Group__0 : rule__ValidAgentPattern__Group__0__Impl rule__ValidAgentPattern__Group__1 ;
    public final void rule__ValidAgentPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4787:1: ( rule__ValidAgentPattern__Group__0__Impl rule__ValidAgentPattern__Group__1 )
            // InternalReactionRules.g:4788:2: rule__ValidAgentPattern__Group__0__Impl rule__ValidAgentPattern__Group__1
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
    // InternalReactionRules.g:4795:1: rule__ValidAgentPattern__Group__0__Impl : ( () ) ;
    public final void rule__ValidAgentPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4799:1: ( ( () ) )
            // InternalReactionRules.g:4800:1: ( () )
            {
            // InternalReactionRules.g:4800:1: ( () )
            // InternalReactionRules.g:4801:2: ()
            {
             before(grammarAccess.getValidAgentPatternAccess().getValidAgentPatternAction_0()); 
            // InternalReactionRules.g:4802:2: ()
            // InternalReactionRules.g:4802:3: 
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
    // InternalReactionRules.g:4810:1: rule__ValidAgentPattern__Group__1 : rule__ValidAgentPattern__Group__1__Impl rule__ValidAgentPattern__Group__2 ;
    public final void rule__ValidAgentPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4814:1: ( rule__ValidAgentPattern__Group__1__Impl rule__ValidAgentPattern__Group__2 )
            // InternalReactionRules.g:4815:2: rule__ValidAgentPattern__Group__1__Impl rule__ValidAgentPattern__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalReactionRules.g:4822:1: rule__ValidAgentPattern__Group__1__Impl : ( ( rule__ValidAgentPattern__AgentAssignment_1 ) ) ;
    public final void rule__ValidAgentPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4826:1: ( ( ( rule__ValidAgentPattern__AgentAssignment_1 ) ) )
            // InternalReactionRules.g:4827:1: ( ( rule__ValidAgentPattern__AgentAssignment_1 ) )
            {
            // InternalReactionRules.g:4827:1: ( ( rule__ValidAgentPattern__AgentAssignment_1 ) )
            // InternalReactionRules.g:4828:2: ( rule__ValidAgentPattern__AgentAssignment_1 )
            {
             before(grammarAccess.getValidAgentPatternAccess().getAgentAssignment_1()); 
            // InternalReactionRules.g:4829:2: ( rule__ValidAgentPattern__AgentAssignment_1 )
            // InternalReactionRules.g:4829:3: rule__ValidAgentPattern__AgentAssignment_1
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
    // InternalReactionRules.g:4837:1: rule__ValidAgentPattern__Group__2 : rule__ValidAgentPattern__Group__2__Impl ;
    public final void rule__ValidAgentPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4841:1: ( rule__ValidAgentPattern__Group__2__Impl )
            // InternalReactionRules.g:4842:2: rule__ValidAgentPattern__Group__2__Impl
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
    // InternalReactionRules.g:4848:1: rule__ValidAgentPattern__Group__2__Impl : ( ( rule__ValidAgentPattern__SitePatternsAssignment_2 ) ) ;
    public final void rule__ValidAgentPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4852:1: ( ( ( rule__ValidAgentPattern__SitePatternsAssignment_2 ) ) )
            // InternalReactionRules.g:4853:1: ( ( rule__ValidAgentPattern__SitePatternsAssignment_2 ) )
            {
            // InternalReactionRules.g:4853:1: ( ( rule__ValidAgentPattern__SitePatternsAssignment_2 ) )
            // InternalReactionRules.g:4854:2: ( rule__ValidAgentPattern__SitePatternsAssignment_2 )
            {
             before(grammarAccess.getValidAgentPatternAccess().getSitePatternsAssignment_2()); 
            // InternalReactionRules.g:4855:2: ( rule__ValidAgentPattern__SitePatternsAssignment_2 )
            // InternalReactionRules.g:4855:3: rule__ValidAgentPattern__SitePatternsAssignment_2
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
    // InternalReactionRules.g:4864:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4868:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalReactionRules.g:4869:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // InternalReactionRules.g:4876:1: rule__Pattern__Group__0__Impl : ( () ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4880:1: ( ( () ) )
            // InternalReactionRules.g:4881:1: ( () )
            {
            // InternalReactionRules.g:4881:1: ( () )
            // InternalReactionRules.g:4882:2: ()
            {
             before(grammarAccess.getPatternAccess().getPatternAction_0()); 
            // InternalReactionRules.g:4883:2: ()
            // InternalReactionRules.g:4883:3: 
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
    // InternalReactionRules.g:4891:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4895:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalReactionRules.g:4896:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalReactionRules.g:4903:1: rule__Pattern__Group__1__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4907:1: ( ( '{' ) )
            // InternalReactionRules.g:4908:1: ( '{' )
            {
            // InternalReactionRules.g:4908:1: ( '{' )
            // InternalReactionRules.g:4909:2: '{'
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
    // InternalReactionRules.g:4918:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4922:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalReactionRules.g:4923:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalReactionRules.g:4930:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__Group_2__0 )? ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4934:1: ( ( ( rule__Pattern__Group_2__0 )? ) )
            // InternalReactionRules.g:4935:1: ( ( rule__Pattern__Group_2__0 )? )
            {
            // InternalReactionRules.g:4935:1: ( ( rule__Pattern__Group_2__0 )? )
            // InternalReactionRules.g:4936:2: ( rule__Pattern__Group_2__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_2()); 
            // InternalReactionRules.g:4937:2: ( rule__Pattern__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==RULE_VOID_PATTERN) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalReactionRules.g:4937:3: rule__Pattern__Group_2__0
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
    // InternalReactionRules.g:4945:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4949:1: ( rule__Pattern__Group__3__Impl )
            // InternalReactionRules.g:4950:2: rule__Pattern__Group__3__Impl
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
    // InternalReactionRules.g:4956:1: rule__Pattern__Group__3__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4960:1: ( ( '}' ) )
            // InternalReactionRules.g:4961:1: ( '}' )
            {
            // InternalReactionRules.g:4961:1: ( '}' )
            // InternalReactionRules.g:4962:2: '}'
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
    // InternalReactionRules.g:4972:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4976:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalReactionRules.g:4977:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalReactionRules.g:4984:1: rule__Pattern__Group_2__0__Impl : ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4988:1: ( ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) ) )
            // InternalReactionRules.g:4989:1: ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) )
            {
            // InternalReactionRules.g:4989:1: ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) )
            // InternalReactionRules.g:4990:2: ( rule__Pattern__AgentPatternsAssignment_2_0 )
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAssignment_2_0()); 
            // InternalReactionRules.g:4991:2: ( rule__Pattern__AgentPatternsAssignment_2_0 )
            // InternalReactionRules.g:4991:3: rule__Pattern__AgentPatternsAssignment_2_0
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
    // InternalReactionRules.g:4999:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5003:1: ( rule__Pattern__Group_2__1__Impl )
            // InternalReactionRules.g:5004:2: rule__Pattern__Group_2__1__Impl
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
    // InternalReactionRules.g:5010:1: rule__Pattern__Group_2__1__Impl : ( ( rule__Pattern__Group_2_1__0 )* ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5014:1: ( ( ( rule__Pattern__Group_2_1__0 )* ) )
            // InternalReactionRules.g:5015:1: ( ( rule__Pattern__Group_2_1__0 )* )
            {
            // InternalReactionRules.g:5015:1: ( ( rule__Pattern__Group_2_1__0 )* )
            // InternalReactionRules.g:5016:2: ( rule__Pattern__Group_2_1__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1()); 
            // InternalReactionRules.g:5017:2: ( rule__Pattern__Group_2_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==25) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalReactionRules.g:5017:3: rule__Pattern__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Pattern__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalReactionRules.g:5026:1: rule__Pattern__Group_2_1__0 : rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 ;
    public final void rule__Pattern__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5030:1: ( rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 )
            // InternalReactionRules.g:5031:2: rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalReactionRules.g:5038:1: rule__Pattern__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5042:1: ( ( ',' ) )
            // InternalReactionRules.g:5043:1: ( ',' )
            {
            // InternalReactionRules.g:5043:1: ( ',' )
            // InternalReactionRules.g:5044:2: ','
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
    // InternalReactionRules.g:5053:1: rule__Pattern__Group_2_1__1 : rule__Pattern__Group_2_1__1__Impl ;
    public final void rule__Pattern__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5057:1: ( rule__Pattern__Group_2_1__1__Impl )
            // InternalReactionRules.g:5058:2: rule__Pattern__Group_2_1__1__Impl
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
    // InternalReactionRules.g:5064:1: rule__Pattern__Group_2_1__1__Impl : ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) ) ;
    public final void rule__Pattern__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5068:1: ( ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) ) )
            // InternalReactionRules.g:5069:1: ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) )
            {
            // InternalReactionRules.g:5069:1: ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) )
            // InternalReactionRules.g:5070:2: ( rule__Pattern__AgentPatternsAssignment_2_1_1 )
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAssignment_2_1_1()); 
            // InternalReactionRules.g:5071:2: ( rule__Pattern__AgentPatternsAssignment_2_1_1 )
            // InternalReactionRules.g:5071:3: rule__Pattern__AgentPatternsAssignment_2_1_1
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
    // InternalReactionRules.g:5080:1: rule__Observation__Group__0 : rule__Observation__Group__0__Impl rule__Observation__Group__1 ;
    public final void rule__Observation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5084:1: ( rule__Observation__Group__0__Impl rule__Observation__Group__1 )
            // InternalReactionRules.g:5085:2: rule__Observation__Group__0__Impl rule__Observation__Group__1
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
    // InternalReactionRules.g:5092:1: rule__Observation__Group__0__Impl : ( 'obs' ) ;
    public final void rule__Observation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5096:1: ( ( 'obs' ) )
            // InternalReactionRules.g:5097:1: ( 'obs' )
            {
            // InternalReactionRules.g:5097:1: ( 'obs' )
            // InternalReactionRules.g:5098:2: 'obs'
            {
             before(grammarAccess.getObservationAccess().getObsKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalReactionRules.g:5107:1: rule__Observation__Group__1 : rule__Observation__Group__1__Impl rule__Observation__Group__2 ;
    public final void rule__Observation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5111:1: ( rule__Observation__Group__1__Impl rule__Observation__Group__2 )
            // InternalReactionRules.g:5112:2: rule__Observation__Group__1__Impl rule__Observation__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalReactionRules.g:5119:1: rule__Observation__Group__1__Impl : ( ( rule__Observation__NameAssignment_1 ) ) ;
    public final void rule__Observation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5123:1: ( ( ( rule__Observation__NameAssignment_1 ) ) )
            // InternalReactionRules.g:5124:1: ( ( rule__Observation__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:5124:1: ( ( rule__Observation__NameAssignment_1 ) )
            // InternalReactionRules.g:5125:2: ( rule__Observation__NameAssignment_1 )
            {
             before(grammarAccess.getObservationAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:5126:2: ( rule__Observation__NameAssignment_1 )
            // InternalReactionRules.g:5126:3: rule__Observation__NameAssignment_1
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
    // InternalReactionRules.g:5134:1: rule__Observation__Group__2 : rule__Observation__Group__2__Impl ;
    public final void rule__Observation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5138:1: ( rule__Observation__Group__2__Impl )
            // InternalReactionRules.g:5139:2: rule__Observation__Group__2__Impl
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
    // InternalReactionRules.g:5145:1: rule__Observation__Group__2__Impl : ( ( rule__Observation__ObservationPatternAssignment_2 ) ) ;
    public final void rule__Observation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5149:1: ( ( ( rule__Observation__ObservationPatternAssignment_2 ) ) )
            // InternalReactionRules.g:5150:1: ( ( rule__Observation__ObservationPatternAssignment_2 ) )
            {
            // InternalReactionRules.g:5150:1: ( ( rule__Observation__ObservationPatternAssignment_2 ) )
            // InternalReactionRules.g:5151:2: ( rule__Observation__ObservationPatternAssignment_2 )
            {
             before(grammarAccess.getObservationAccess().getObservationPatternAssignment_2()); 
            // InternalReactionRules.g:5152:2: ( rule__Observation__ObservationPatternAssignment_2 )
            // InternalReactionRules.g:5152:3: rule__Observation__ObservationPatternAssignment_2
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
    // InternalReactionRules.g:5161:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5165:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // InternalReactionRules.g:5166:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
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
    // InternalReactionRules.g:5173:1: rule__Initial__Group__0__Impl : ( 'init' ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5177:1: ( ( 'init' ) )
            // InternalReactionRules.g:5178:1: ( 'init' )
            {
            // InternalReactionRules.g:5178:1: ( 'init' )
            // InternalReactionRules.g:5179:2: 'init'
            {
             before(grammarAccess.getInitialAccess().getInitKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalReactionRules.g:5188:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5192:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // InternalReactionRules.g:5193:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalReactionRules.g:5200:1: rule__Initial__Group__1__Impl : ( ( rule__Initial__NameAssignment_1 ) ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5204:1: ( ( ( rule__Initial__NameAssignment_1 ) ) )
            // InternalReactionRules.g:5205:1: ( ( rule__Initial__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:5205:1: ( ( rule__Initial__NameAssignment_1 ) )
            // InternalReactionRules.g:5206:2: ( rule__Initial__NameAssignment_1 )
            {
             before(grammarAccess.getInitialAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:5207:2: ( rule__Initial__NameAssignment_1 )
            // InternalReactionRules.g:5207:3: rule__Initial__NameAssignment_1
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
    // InternalReactionRules.g:5215:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl rule__Initial__Group__3 ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5219:1: ( rule__Initial__Group__2__Impl rule__Initial__Group__3 )
            // InternalReactionRules.g:5220:2: rule__Initial__Group__2__Impl rule__Initial__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalReactionRules.g:5227:1: rule__Initial__Group__2__Impl : ( ( rule__Initial__CountAssignment_2 ) ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5231:1: ( ( ( rule__Initial__CountAssignment_2 ) ) )
            // InternalReactionRules.g:5232:1: ( ( rule__Initial__CountAssignment_2 ) )
            {
            // InternalReactionRules.g:5232:1: ( ( rule__Initial__CountAssignment_2 ) )
            // InternalReactionRules.g:5233:2: ( rule__Initial__CountAssignment_2 )
            {
             before(grammarAccess.getInitialAccess().getCountAssignment_2()); 
            // InternalReactionRules.g:5234:2: ( rule__Initial__CountAssignment_2 )
            // InternalReactionRules.g:5234:3: rule__Initial__CountAssignment_2
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
    // InternalReactionRules.g:5242:1: rule__Initial__Group__3 : rule__Initial__Group__3__Impl ;
    public final void rule__Initial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5246:1: ( rule__Initial__Group__3__Impl )
            // InternalReactionRules.g:5247:2: rule__Initial__Group__3__Impl
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
    // InternalReactionRules.g:5253:1: rule__Initial__Group__3__Impl : ( ( rule__Initial__InitialPatternAssignment_3 ) ) ;
    public final void rule__Initial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5257:1: ( ( ( rule__Initial__InitialPatternAssignment_3 ) ) )
            // InternalReactionRules.g:5258:1: ( ( rule__Initial__InitialPatternAssignment_3 ) )
            {
            // InternalReactionRules.g:5258:1: ( ( rule__Initial__InitialPatternAssignment_3 ) )
            // InternalReactionRules.g:5259:2: ( rule__Initial__InitialPatternAssignment_3 )
            {
             before(grammarAccess.getInitialAccess().getInitialPatternAssignment_3()); 
            // InternalReactionRules.g:5260:2: ( rule__Initial__InitialPatternAssignment_3 )
            // InternalReactionRules.g:5260:3: rule__Initial__InitialPatternAssignment_3
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
    // InternalReactionRules.g:5269:1: rule__RuleVariables__Group__0 : rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1 ;
    public final void rule__RuleVariables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5273:1: ( rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1 )
            // InternalReactionRules.g:5274:2: rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalReactionRules.g:5281:1: rule__RuleVariables__Group__0__Impl : ( ( rule__RuleVariables__VariablesAssignment_0 ) ) ;
    public final void rule__RuleVariables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5285:1: ( ( ( rule__RuleVariables__VariablesAssignment_0 ) ) )
            // InternalReactionRules.g:5286:1: ( ( rule__RuleVariables__VariablesAssignment_0 ) )
            {
            // InternalReactionRules.g:5286:1: ( ( rule__RuleVariables__VariablesAssignment_0 ) )
            // InternalReactionRules.g:5287:2: ( rule__RuleVariables__VariablesAssignment_0 )
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesAssignment_0()); 
            // InternalReactionRules.g:5288:2: ( rule__RuleVariables__VariablesAssignment_0 )
            // InternalReactionRules.g:5288:3: rule__RuleVariables__VariablesAssignment_0
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
    // InternalReactionRules.g:5296:1: rule__RuleVariables__Group__1 : rule__RuleVariables__Group__1__Impl ;
    public final void rule__RuleVariables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5300:1: ( rule__RuleVariables__Group__1__Impl )
            // InternalReactionRules.g:5301:2: rule__RuleVariables__Group__1__Impl
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
    // InternalReactionRules.g:5307:1: rule__RuleVariables__Group__1__Impl : ( ( rule__RuleVariables__Group_1__0 )* ) ;
    public final void rule__RuleVariables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5311:1: ( ( ( rule__RuleVariables__Group_1__0 )* ) )
            // InternalReactionRules.g:5312:1: ( ( rule__RuleVariables__Group_1__0 )* )
            {
            // InternalReactionRules.g:5312:1: ( ( rule__RuleVariables__Group_1__0 )* )
            // InternalReactionRules.g:5313:2: ( rule__RuleVariables__Group_1__0 )*
            {
             before(grammarAccess.getRuleVariablesAccess().getGroup_1()); 
            // InternalReactionRules.g:5314:2: ( rule__RuleVariables__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==25) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalReactionRules.g:5314:3: rule__RuleVariables__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__RuleVariables__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalReactionRules.g:5323:1: rule__RuleVariables__Group_1__0 : rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1 ;
    public final void rule__RuleVariables__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5327:1: ( rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1 )
            // InternalReactionRules.g:5328:2: rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalReactionRules.g:5335:1: rule__RuleVariables__Group_1__0__Impl : ( ',' ) ;
    public final void rule__RuleVariables__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5339:1: ( ( ',' ) )
            // InternalReactionRules.g:5340:1: ( ',' )
            {
            // InternalReactionRules.g:5340:1: ( ',' )
            // InternalReactionRules.g:5341:2: ','
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
    // InternalReactionRules.g:5350:1: rule__RuleVariables__Group_1__1 : rule__RuleVariables__Group_1__1__Impl ;
    public final void rule__RuleVariables__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5354:1: ( rule__RuleVariables__Group_1__1__Impl )
            // InternalReactionRules.g:5355:2: rule__RuleVariables__Group_1__1__Impl
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
    // InternalReactionRules.g:5361:1: rule__RuleVariables__Group_1__1__Impl : ( ( rule__RuleVariables__VariablesAssignment_1_1 ) ) ;
    public final void rule__RuleVariables__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5365:1: ( ( ( rule__RuleVariables__VariablesAssignment_1_1 ) ) )
            // InternalReactionRules.g:5366:1: ( ( rule__RuleVariables__VariablesAssignment_1_1 ) )
            {
            // InternalReactionRules.g:5366:1: ( ( rule__RuleVariables__VariablesAssignment_1_1 ) )
            // InternalReactionRules.g:5367:2: ( rule__RuleVariables__VariablesAssignment_1_1 )
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesAssignment_1_1()); 
            // InternalReactionRules.g:5368:2: ( rule__RuleVariables__VariablesAssignment_1_1 )
            // InternalReactionRules.g:5368:3: rule__RuleVariables__VariablesAssignment_1_1
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
    // InternalReactionRules.g:5377:1: rule__UnidirectionalRule__Group__0 : rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1 ;
    public final void rule__UnidirectionalRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5381:1: ( rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1 )
            // InternalReactionRules.g:5382:2: rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalReactionRules.g:5389:1: rule__UnidirectionalRule__Group__0__Impl : ( ( rule__UnidirectionalRule__LhsAssignment_0 ) ) ;
    public final void rule__UnidirectionalRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5393:1: ( ( ( rule__UnidirectionalRule__LhsAssignment_0 ) ) )
            // InternalReactionRules.g:5394:1: ( ( rule__UnidirectionalRule__LhsAssignment_0 ) )
            {
            // InternalReactionRules.g:5394:1: ( ( rule__UnidirectionalRule__LhsAssignment_0 ) )
            // InternalReactionRules.g:5395:2: ( rule__UnidirectionalRule__LhsAssignment_0 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getLhsAssignment_0()); 
            // InternalReactionRules.g:5396:2: ( rule__UnidirectionalRule__LhsAssignment_0 )
            // InternalReactionRules.g:5396:3: rule__UnidirectionalRule__LhsAssignment_0
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
    // InternalReactionRules.g:5404:1: rule__UnidirectionalRule__Group__1 : rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2 ;
    public final void rule__UnidirectionalRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5408:1: ( rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2 )
            // InternalReactionRules.g:5409:2: rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalReactionRules.g:5416:1: rule__UnidirectionalRule__Group__1__Impl : ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) ) ;
    public final void rule__UnidirectionalRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5420:1: ( ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) ) )
            // InternalReactionRules.g:5421:1: ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) )
            {
            // InternalReactionRules.g:5421:1: ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) )
            // InternalReactionRules.g:5422:2: ( rule__UnidirectionalRule__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getOperatorAssignment_1()); 
            // InternalReactionRules.g:5423:2: ( rule__UnidirectionalRule__OperatorAssignment_1 )
            // InternalReactionRules.g:5423:3: rule__UnidirectionalRule__OperatorAssignment_1
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
    // InternalReactionRules.g:5431:1: rule__UnidirectionalRule__Group__2 : rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3 ;
    public final void rule__UnidirectionalRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5435:1: ( rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3 )
            // InternalReactionRules.g:5436:2: rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalReactionRules.g:5443:1: rule__UnidirectionalRule__Group__2__Impl : ( ( rule__UnidirectionalRule__RhsAssignment_2 ) ) ;
    public final void rule__UnidirectionalRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5447:1: ( ( ( rule__UnidirectionalRule__RhsAssignment_2 ) ) )
            // InternalReactionRules.g:5448:1: ( ( rule__UnidirectionalRule__RhsAssignment_2 ) )
            {
            // InternalReactionRules.g:5448:1: ( ( rule__UnidirectionalRule__RhsAssignment_2 ) )
            // InternalReactionRules.g:5449:2: ( rule__UnidirectionalRule__RhsAssignment_2 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getRhsAssignment_2()); 
            // InternalReactionRules.g:5450:2: ( rule__UnidirectionalRule__RhsAssignment_2 )
            // InternalReactionRules.g:5450:3: rule__UnidirectionalRule__RhsAssignment_2
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
    // InternalReactionRules.g:5458:1: rule__UnidirectionalRule__Group__3 : rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4 ;
    public final void rule__UnidirectionalRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5462:1: ( rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4 )
            // InternalReactionRules.g:5463:2: rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalReactionRules.g:5470:1: rule__UnidirectionalRule__Group__3__Impl : ( RULE_AT ) ;
    public final void rule__UnidirectionalRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5474:1: ( ( RULE_AT ) )
            // InternalReactionRules.g:5475:1: ( RULE_AT )
            {
            // InternalReactionRules.g:5475:1: ( RULE_AT )
            // InternalReactionRules.g:5476:2: RULE_AT
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
    // InternalReactionRules.g:5485:1: rule__UnidirectionalRule__Group__4 : rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5 ;
    public final void rule__UnidirectionalRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5489:1: ( rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5 )
            // InternalReactionRules.g:5490:2: rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalReactionRules.g:5497:1: rule__UnidirectionalRule__Group__4__Impl : ( '[' ) ;
    public final void rule__UnidirectionalRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5501:1: ( ( '[' ) )
            // InternalReactionRules.g:5502:1: ( '[' )
            {
            // InternalReactionRules.g:5502:1: ( '[' )
            // InternalReactionRules.g:5503:2: '['
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getLeftSquareBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalReactionRules.g:5512:1: rule__UnidirectionalRule__Group__5 : rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6 ;
    public final void rule__UnidirectionalRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5516:1: ( rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6 )
            // InternalReactionRules.g:5517:2: rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalReactionRules.g:5524:1: rule__UnidirectionalRule__Group__5__Impl : ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) ) ;
    public final void rule__UnidirectionalRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5528:1: ( ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) ) )
            // InternalReactionRules.g:5529:1: ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) )
            {
            // InternalReactionRules.g:5529:1: ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) )
            // InternalReactionRules.g:5530:2: ( rule__UnidirectionalRule__VariablesAssignment_5 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getVariablesAssignment_5()); 
            // InternalReactionRules.g:5531:2: ( rule__UnidirectionalRule__VariablesAssignment_5 )
            // InternalReactionRules.g:5531:3: rule__UnidirectionalRule__VariablesAssignment_5
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
    // InternalReactionRules.g:5539:1: rule__UnidirectionalRule__Group__6 : rule__UnidirectionalRule__Group__6__Impl ;
    public final void rule__UnidirectionalRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5543:1: ( rule__UnidirectionalRule__Group__6__Impl )
            // InternalReactionRules.g:5544:2: rule__UnidirectionalRule__Group__6__Impl
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
    // InternalReactionRules.g:5550:1: rule__UnidirectionalRule__Group__6__Impl : ( ']' ) ;
    public final void rule__UnidirectionalRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5554:1: ( ( ']' ) )
            // InternalReactionRules.g:5555:1: ( ']' )
            {
            // InternalReactionRules.g:5555:1: ( ']' )
            // InternalReactionRules.g:5556:2: ']'
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getRightSquareBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalReactionRules.g:5566:1: rule__BidirectionalRule__Group__0 : rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1 ;
    public final void rule__BidirectionalRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5570:1: ( rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1 )
            // InternalReactionRules.g:5571:2: rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalReactionRules.g:5578:1: rule__BidirectionalRule__Group__0__Impl : ( ( rule__BidirectionalRule__LhsAssignment_0 ) ) ;
    public final void rule__BidirectionalRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5582:1: ( ( ( rule__BidirectionalRule__LhsAssignment_0 ) ) )
            // InternalReactionRules.g:5583:1: ( ( rule__BidirectionalRule__LhsAssignment_0 ) )
            {
            // InternalReactionRules.g:5583:1: ( ( rule__BidirectionalRule__LhsAssignment_0 ) )
            // InternalReactionRules.g:5584:2: ( rule__BidirectionalRule__LhsAssignment_0 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getLhsAssignment_0()); 
            // InternalReactionRules.g:5585:2: ( rule__BidirectionalRule__LhsAssignment_0 )
            // InternalReactionRules.g:5585:3: rule__BidirectionalRule__LhsAssignment_0
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
    // InternalReactionRules.g:5593:1: rule__BidirectionalRule__Group__1 : rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2 ;
    public final void rule__BidirectionalRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5597:1: ( rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2 )
            // InternalReactionRules.g:5598:2: rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalReactionRules.g:5605:1: rule__BidirectionalRule__Group__1__Impl : ( ( rule__BidirectionalRule__OperatorAssignment_1 ) ) ;
    public final void rule__BidirectionalRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5609:1: ( ( ( rule__BidirectionalRule__OperatorAssignment_1 ) ) )
            // InternalReactionRules.g:5610:1: ( ( rule__BidirectionalRule__OperatorAssignment_1 ) )
            {
            // InternalReactionRules.g:5610:1: ( ( rule__BidirectionalRule__OperatorAssignment_1 ) )
            // InternalReactionRules.g:5611:2: ( rule__BidirectionalRule__OperatorAssignment_1 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getOperatorAssignment_1()); 
            // InternalReactionRules.g:5612:2: ( rule__BidirectionalRule__OperatorAssignment_1 )
            // InternalReactionRules.g:5612:3: rule__BidirectionalRule__OperatorAssignment_1
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
    // InternalReactionRules.g:5620:1: rule__BidirectionalRule__Group__2 : rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3 ;
    public final void rule__BidirectionalRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5624:1: ( rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3 )
            // InternalReactionRules.g:5625:2: rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalReactionRules.g:5632:1: rule__BidirectionalRule__Group__2__Impl : ( ( rule__BidirectionalRule__RhsAssignment_2 ) ) ;
    public final void rule__BidirectionalRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5636:1: ( ( ( rule__BidirectionalRule__RhsAssignment_2 ) ) )
            // InternalReactionRules.g:5637:1: ( ( rule__BidirectionalRule__RhsAssignment_2 ) )
            {
            // InternalReactionRules.g:5637:1: ( ( rule__BidirectionalRule__RhsAssignment_2 ) )
            // InternalReactionRules.g:5638:2: ( rule__BidirectionalRule__RhsAssignment_2 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getRhsAssignment_2()); 
            // InternalReactionRules.g:5639:2: ( rule__BidirectionalRule__RhsAssignment_2 )
            // InternalReactionRules.g:5639:3: rule__BidirectionalRule__RhsAssignment_2
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
    // InternalReactionRules.g:5647:1: rule__BidirectionalRule__Group__3 : rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4 ;
    public final void rule__BidirectionalRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5651:1: ( rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4 )
            // InternalReactionRules.g:5652:2: rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalReactionRules.g:5659:1: rule__BidirectionalRule__Group__3__Impl : ( RULE_AT ) ;
    public final void rule__BidirectionalRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5663:1: ( ( RULE_AT ) )
            // InternalReactionRules.g:5664:1: ( RULE_AT )
            {
            // InternalReactionRules.g:5664:1: ( RULE_AT )
            // InternalReactionRules.g:5665:2: RULE_AT
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
    // InternalReactionRules.g:5674:1: rule__BidirectionalRule__Group__4 : rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5 ;
    public final void rule__BidirectionalRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5678:1: ( rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5 )
            // InternalReactionRules.g:5679:2: rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalReactionRules.g:5686:1: rule__BidirectionalRule__Group__4__Impl : ( '[' ) ;
    public final void rule__BidirectionalRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5690:1: ( ( '[' ) )
            // InternalReactionRules.g:5691:1: ( '[' )
            {
            // InternalReactionRules.g:5691:1: ( '[' )
            // InternalReactionRules.g:5692:2: '['
            {
             before(grammarAccess.getBidirectionalRuleAccess().getLeftSquareBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalReactionRules.g:5701:1: rule__BidirectionalRule__Group__5 : rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6 ;
    public final void rule__BidirectionalRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5705:1: ( rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6 )
            // InternalReactionRules.g:5706:2: rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalReactionRules.g:5713:1: rule__BidirectionalRule__Group__5__Impl : ( ( rule__BidirectionalRule__VariablesAssignment_5 ) ) ;
    public final void rule__BidirectionalRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5717:1: ( ( ( rule__BidirectionalRule__VariablesAssignment_5 ) ) )
            // InternalReactionRules.g:5718:1: ( ( rule__BidirectionalRule__VariablesAssignment_5 ) )
            {
            // InternalReactionRules.g:5718:1: ( ( rule__BidirectionalRule__VariablesAssignment_5 ) )
            // InternalReactionRules.g:5719:2: ( rule__BidirectionalRule__VariablesAssignment_5 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getVariablesAssignment_5()); 
            // InternalReactionRules.g:5720:2: ( rule__BidirectionalRule__VariablesAssignment_5 )
            // InternalReactionRules.g:5720:3: rule__BidirectionalRule__VariablesAssignment_5
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
    // InternalReactionRules.g:5728:1: rule__BidirectionalRule__Group__6 : rule__BidirectionalRule__Group__6__Impl ;
    public final void rule__BidirectionalRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5732:1: ( rule__BidirectionalRule__Group__6__Impl )
            // InternalReactionRules.g:5733:2: rule__BidirectionalRule__Group__6__Impl
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
    // InternalReactionRules.g:5739:1: rule__BidirectionalRule__Group__6__Impl : ( ']' ) ;
    public final void rule__BidirectionalRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5743:1: ( ( ']' ) )
            // InternalReactionRules.g:5744:1: ( ']' )
            {
            // InternalReactionRules.g:5744:1: ( ']' )
            // InternalReactionRules.g:5745:2: ']'
            {
             before(grammarAccess.getBidirectionalRuleAccess().getRightSquareBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalReactionRules.g:5755:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5759:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalReactionRules.g:5760:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalReactionRules.g:5767:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5771:1: ( ( 'rule' ) )
            // InternalReactionRules.g:5772:1: ( 'rule' )
            {
            // InternalReactionRules.g:5772:1: ( 'rule' )
            // InternalReactionRules.g:5773:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalReactionRules.g:5782:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5786:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalReactionRules.g:5787:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalReactionRules.g:5794:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5798:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalReactionRules.g:5799:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:5799:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalReactionRules.g:5800:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:5801:2: ( rule__Rule__NameAssignment_1 )
            // InternalReactionRules.g:5801:3: rule__Rule__NameAssignment_1
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
    // InternalReactionRules.g:5809:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5813:1: ( rule__Rule__Group__2__Impl )
            // InternalReactionRules.g:5814:2: rule__Rule__Group__2__Impl
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
    // InternalReactionRules.g:5820:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__RuleAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5824:1: ( ( ( rule__Rule__RuleAssignment_2 ) ) )
            // InternalReactionRules.g:5825:1: ( ( rule__Rule__RuleAssignment_2 ) )
            {
            // InternalReactionRules.g:5825:1: ( ( rule__Rule__RuleAssignment_2 ) )
            // InternalReactionRules.g:5826:2: ( rule__Rule__RuleAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getRuleAssignment_2()); 
            // InternalReactionRules.g:5827:2: ( rule__Rule__RuleAssignment_2 )
            // InternalReactionRules.g:5827:3: rule__Rule__RuleAssignment_2
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
    // InternalReactionRules.g:5836:1: rule__Iterations__Group__0 : rule__Iterations__Group__0__Impl rule__Iterations__Group__1 ;
    public final void rule__Iterations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5840:1: ( rule__Iterations__Group__0__Impl rule__Iterations__Group__1 )
            // InternalReactionRules.g:5841:2: rule__Iterations__Group__0__Impl rule__Iterations__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalReactionRules.g:5848:1: rule__Iterations__Group__0__Impl : ( 'iterations' ) ;
    public final void rule__Iterations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5852:1: ( ( 'iterations' ) )
            // InternalReactionRules.g:5853:1: ( 'iterations' )
            {
            // InternalReactionRules.g:5853:1: ( 'iterations' )
            // InternalReactionRules.g:5854:2: 'iterations'
            {
             before(grammarAccess.getIterationsAccess().getIterationsKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalReactionRules.g:5863:1: rule__Iterations__Group__1 : rule__Iterations__Group__1__Impl rule__Iterations__Group__2 ;
    public final void rule__Iterations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5867:1: ( rule__Iterations__Group__1__Impl rule__Iterations__Group__2 )
            // InternalReactionRules.g:5868:2: rule__Iterations__Group__1__Impl rule__Iterations__Group__2
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
    // InternalReactionRules.g:5875:1: rule__Iterations__Group__1__Impl : ( '=' ) ;
    public final void rule__Iterations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5879:1: ( ( '=' ) )
            // InternalReactionRules.g:5880:1: ( '=' )
            {
            // InternalReactionRules.g:5880:1: ( '=' )
            // InternalReactionRules.g:5881:2: '='
            {
             before(grammarAccess.getIterationsAccess().getEqualsSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalReactionRules.g:5890:1: rule__Iterations__Group__2 : rule__Iterations__Group__2__Impl ;
    public final void rule__Iterations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5894:1: ( rule__Iterations__Group__2__Impl )
            // InternalReactionRules.g:5895:2: rule__Iterations__Group__2__Impl
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
    // InternalReactionRules.g:5901:1: rule__Iterations__Group__2__Impl : ( ( rule__Iterations__ValueAssignment_2 ) ) ;
    public final void rule__Iterations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5905:1: ( ( ( rule__Iterations__ValueAssignment_2 ) ) )
            // InternalReactionRules.g:5906:1: ( ( rule__Iterations__ValueAssignment_2 ) )
            {
            // InternalReactionRules.g:5906:1: ( ( rule__Iterations__ValueAssignment_2 ) )
            // InternalReactionRules.g:5907:2: ( rule__Iterations__ValueAssignment_2 )
            {
             before(grammarAccess.getIterationsAccess().getValueAssignment_2()); 
            // InternalReactionRules.g:5908:2: ( rule__Iterations__ValueAssignment_2 )
            // InternalReactionRules.g:5908:3: rule__Iterations__ValueAssignment_2
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
    // InternalReactionRules.g:5917:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5921:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalReactionRules.g:5922:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalReactionRules.g:5929:1: rule__Time__Group__0__Impl : ( 'time' ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5933:1: ( ( 'time' ) )
            // InternalReactionRules.g:5934:1: ( 'time' )
            {
            // InternalReactionRules.g:5934:1: ( 'time' )
            // InternalReactionRules.g:5935:2: 'time'
            {
             before(grammarAccess.getTimeAccess().getTimeKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalReactionRules.g:5944:1: rule__Time__Group__1 : rule__Time__Group__1__Impl rule__Time__Group__2 ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5948:1: ( rule__Time__Group__1__Impl rule__Time__Group__2 )
            // InternalReactionRules.g:5949:2: rule__Time__Group__1__Impl rule__Time__Group__2
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
    // InternalReactionRules.g:5956:1: rule__Time__Group__1__Impl : ( '=' ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5960:1: ( ( '=' ) )
            // InternalReactionRules.g:5961:1: ( '=' )
            {
            // InternalReactionRules.g:5961:1: ( '=' )
            // InternalReactionRules.g:5962:2: '='
            {
             before(grammarAccess.getTimeAccess().getEqualsSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalReactionRules.g:5971:1: rule__Time__Group__2 : rule__Time__Group__2__Impl ;
    public final void rule__Time__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5975:1: ( rule__Time__Group__2__Impl )
            // InternalReactionRules.g:5976:2: rule__Time__Group__2__Impl
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
    // InternalReactionRules.g:5982:1: rule__Time__Group__2__Impl : ( ( rule__Time__ValueAssignment_2 ) ) ;
    public final void rule__Time__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5986:1: ( ( ( rule__Time__ValueAssignment_2 ) ) )
            // InternalReactionRules.g:5987:1: ( ( rule__Time__ValueAssignment_2 ) )
            {
            // InternalReactionRules.g:5987:1: ( ( rule__Time__ValueAssignment_2 ) )
            // InternalReactionRules.g:5988:2: ( rule__Time__ValueAssignment_2 )
            {
             before(grammarAccess.getTimeAccess().getValueAssignment_2()); 
            // InternalReactionRules.g:5989:2: ( rule__Time__ValueAssignment_2 )
            // InternalReactionRules.g:5989:3: rule__Time__ValueAssignment_2
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
    // InternalReactionRules.g:5998:1: rule__Population__Group__0 : rule__Population__Group__0__Impl rule__Population__Group__1 ;
    public final void rule__Population__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6002:1: ( rule__Population__Group__0__Impl rule__Population__Group__1 )
            // InternalReactionRules.g:6003:2: rule__Population__Group__0__Impl rule__Population__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalReactionRules.g:6010:1: rule__Population__Group__0__Impl : ( '|' ) ;
    public final void rule__Population__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6014:1: ( ( '|' ) )
            // InternalReactionRules.g:6015:1: ( '|' )
            {
            // InternalReactionRules.g:6015:1: ( '|' )
            // InternalReactionRules.g:6016:2: '|'
            {
             before(grammarAccess.getPopulationAccess().getVerticalLineKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalReactionRules.g:6025:1: rule__Population__Group__1 : rule__Population__Group__1__Impl rule__Population__Group__2 ;
    public final void rule__Population__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6029:1: ( rule__Population__Group__1__Impl rule__Population__Group__2 )
            // InternalReactionRules.g:6030:2: rule__Population__Group__1__Impl rule__Population__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalReactionRules.g:6037:1: rule__Population__Group__1__Impl : ( ( rule__Population__PaAssignment_1 ) ) ;
    public final void rule__Population__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6041:1: ( ( ( rule__Population__PaAssignment_1 ) ) )
            // InternalReactionRules.g:6042:1: ( ( rule__Population__PaAssignment_1 ) )
            {
            // InternalReactionRules.g:6042:1: ( ( rule__Population__PaAssignment_1 ) )
            // InternalReactionRules.g:6043:2: ( rule__Population__PaAssignment_1 )
            {
             before(grammarAccess.getPopulationAccess().getPaAssignment_1()); 
            // InternalReactionRules.g:6044:2: ( rule__Population__PaAssignment_1 )
            // InternalReactionRules.g:6044:3: rule__Population__PaAssignment_1
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
    // InternalReactionRules.g:6052:1: rule__Population__Group__2 : rule__Population__Group__2__Impl rule__Population__Group__3 ;
    public final void rule__Population__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6056:1: ( rule__Population__Group__2__Impl rule__Population__Group__3 )
            // InternalReactionRules.g:6057:2: rule__Population__Group__2__Impl rule__Population__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalReactionRules.g:6064:1: rule__Population__Group__2__Impl : ( '|' ) ;
    public final void rule__Population__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6068:1: ( ( '|' ) )
            // InternalReactionRules.g:6069:1: ( '|' )
            {
            // InternalReactionRules.g:6069:1: ( '|' )
            // InternalReactionRules.g:6070:2: '|'
            {
             before(grammarAccess.getPopulationAccess().getVerticalLineKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalReactionRules.g:6079:1: rule__Population__Group__3 : rule__Population__Group__3__Impl rule__Population__Group__4 ;
    public final void rule__Population__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6083:1: ( rule__Population__Group__3__Impl rule__Population__Group__4 )
            // InternalReactionRules.g:6084:2: rule__Population__Group__3__Impl rule__Population__Group__4
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
    // InternalReactionRules.g:6091:1: rule__Population__Group__3__Impl : ( '==>' ) ;
    public final void rule__Population__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6095:1: ( ( '==>' ) )
            // InternalReactionRules.g:6096:1: ( '==>' )
            {
            // InternalReactionRules.g:6096:1: ( '==>' )
            // InternalReactionRules.g:6097:2: '==>'
            {
             before(grammarAccess.getPopulationAccess().getEqualsSignEqualsSignGreaterThanSignKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalReactionRules.g:6106:1: rule__Population__Group__4 : rule__Population__Group__4__Impl ;
    public final void rule__Population__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6110:1: ( rule__Population__Group__4__Impl )
            // InternalReactionRules.g:6111:2: rule__Population__Group__4__Impl
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
    // InternalReactionRules.g:6117:1: rule__Population__Group__4__Impl : ( ( rule__Population__ValueAssignment_4 ) ) ;
    public final void rule__Population__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6121:1: ( ( ( rule__Population__ValueAssignment_4 ) ) )
            // InternalReactionRules.g:6122:1: ( ( rule__Population__ValueAssignment_4 ) )
            {
            // InternalReactionRules.g:6122:1: ( ( rule__Population__ValueAssignment_4 ) )
            // InternalReactionRules.g:6123:2: ( rule__Population__ValueAssignment_4 )
            {
             before(grammarAccess.getPopulationAccess().getValueAssignment_4()); 
            // InternalReactionRules.g:6124:2: ( rule__Population__ValueAssignment_4 )
            // InternalReactionRules.g:6124:3: rule__Population__ValueAssignment_4
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
    // InternalReactionRules.g:6133:1: rule__Terminate__Group__0 : rule__Terminate__Group__0__Impl rule__Terminate__Group__1 ;
    public final void rule__Terminate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6137:1: ( rule__Terminate__Group__0__Impl rule__Terminate__Group__1 )
            // InternalReactionRules.g:6138:2: rule__Terminate__Group__0__Impl rule__Terminate__Group__1
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
    // InternalReactionRules.g:6145:1: rule__Terminate__Group__0__Impl : ( 'terminate' ) ;
    public final void rule__Terminate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6149:1: ( ( 'terminate' ) )
            // InternalReactionRules.g:6150:1: ( 'terminate' )
            {
            // InternalReactionRules.g:6150:1: ( 'terminate' )
            // InternalReactionRules.g:6151:2: 'terminate'
            {
             before(grammarAccess.getTerminateAccess().getTerminateKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalReactionRules.g:6160:1: rule__Terminate__Group__1 : rule__Terminate__Group__1__Impl rule__Terminate__Group__2 ;
    public final void rule__Terminate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6164:1: ( rule__Terminate__Group__1__Impl rule__Terminate__Group__2 )
            // InternalReactionRules.g:6165:2: rule__Terminate__Group__1__Impl rule__Terminate__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalReactionRules.g:6172:1: rule__Terminate__Group__1__Impl : ( ( rule__Terminate__NameAssignment_1 ) ) ;
    public final void rule__Terminate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6176:1: ( ( ( rule__Terminate__NameAssignment_1 ) ) )
            // InternalReactionRules.g:6177:1: ( ( rule__Terminate__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:6177:1: ( ( rule__Terminate__NameAssignment_1 ) )
            // InternalReactionRules.g:6178:2: ( rule__Terminate__NameAssignment_1 )
            {
             before(grammarAccess.getTerminateAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:6179:2: ( rule__Terminate__NameAssignment_1 )
            // InternalReactionRules.g:6179:3: rule__Terminate__NameAssignment_1
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
    // InternalReactionRules.g:6187:1: rule__Terminate__Group__2 : rule__Terminate__Group__2__Impl ;
    public final void rule__Terminate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6191:1: ( rule__Terminate__Group__2__Impl )
            // InternalReactionRules.g:6192:2: rule__Terminate__Group__2__Impl
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
    // InternalReactionRules.g:6198:1: rule__Terminate__Group__2__Impl : ( ( rule__Terminate__ConditionAssignment_2 ) ) ;
    public final void rule__Terminate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6202:1: ( ( ( rule__Terminate__ConditionAssignment_2 ) ) )
            // InternalReactionRules.g:6203:1: ( ( rule__Terminate__ConditionAssignment_2 ) )
            {
            // InternalReactionRules.g:6203:1: ( ( rule__Terminate__ConditionAssignment_2 ) )
            // InternalReactionRules.g:6204:2: ( rule__Terminate__ConditionAssignment_2 )
            {
             before(grammarAccess.getTerminateAccess().getConditionAssignment_2()); 
            // InternalReactionRules.g:6205:2: ( rule__Terminate__ConditionAssignment_2 )
            // InternalReactionRules.g:6205:3: rule__Terminate__ConditionAssignment_2
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
    // InternalReactionRules.g:6214:1: rule__ReactionRuleModel__ModelAssignment_0 : ( ruleModel ) ;
    public final void rule__ReactionRuleModel__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6218:1: ( ( ruleModel ) )
            // InternalReactionRules.g:6219:2: ( ruleModel )
            {
            // InternalReactionRules.g:6219:2: ( ruleModel )
            // InternalReactionRules.g:6220:3: ruleModel
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
    // InternalReactionRules.g:6229:1: rule__ReactionRuleModel__ReactionPropertiesAssignment_1 : ( ruleReactionProperty ) ;
    public final void rule__ReactionRuleModel__ReactionPropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6233:1: ( ( ruleReactionProperty ) )
            // InternalReactionRules.g:6234:2: ( ruleReactionProperty )
            {
            // InternalReactionRules.g:6234:2: ( ruleReactionProperty )
            // InternalReactionRules.g:6235:3: ruleReactionProperty
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
    // InternalReactionRules.g:6244:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6248:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6249:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6249:2: ( RULE_ID )
            // InternalReactionRules.g:6250:3: RULE_ID
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
    // InternalReactionRules.g:6259:1: rule__ArithmeticValue__ValueAssignment : ( ruleArithmeticType ) ;
    public final void rule__ArithmeticValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6263:1: ( ( ruleArithmeticType ) )
            // InternalReactionRules.g:6264:2: ( ruleArithmeticType )
            {
            // InternalReactionRules.g:6264:2: ( ruleArithmeticType )
            // InternalReactionRules.g:6265:3: ruleArithmeticType
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
    // InternalReactionRules.g:6274:1: rule__State__NameAssignment : ( RULE_ID ) ;
    public final void rule__State__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6278:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6279:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6279:2: ( RULE_ID )
            // InternalReactionRules.g:6280:3: RULE_ID
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
    // InternalReactionRules.g:6289:1: rule__States__StateAssignment_1_1 : ( ruleState ) ;
    public final void rule__States__StateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6293:1: ( ( ruleState ) )
            // InternalReactionRules.g:6294:2: ( ruleState )
            {
            // InternalReactionRules.g:6294:2: ( ruleState )
            // InternalReactionRules.g:6295:3: ruleState
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
    // InternalReactionRules.g:6304:1: rule__States__StateAssignment_1_2_1 : ( ruleState ) ;
    public final void rule__States__StateAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6308:1: ( ( ruleState ) )
            // InternalReactionRules.g:6309:2: ( ruleState )
            {
            // InternalReactionRules.g:6309:2: ( ruleState )
            // InternalReactionRules.g:6310:3: ruleState
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


    // $ANTLR start "rule__SingleSite__NameAssignment_1"
    // InternalReactionRules.g:6319:1: rule__SingleSite__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SingleSite__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6323:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6324:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6324:2: ( RULE_ID )
            // InternalReactionRules.g:6325:3: RULE_ID
            {
             before(grammarAccess.getSingleSiteAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleSiteAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SingleSite__NameAssignment_1"


    // $ANTLR start "rule__SingleSite__StatesAssignment_2"
    // InternalReactionRules.g:6334:1: rule__SingleSite__StatesAssignment_2 : ( ruleStates ) ;
    public final void rule__SingleSite__StatesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6338:1: ( ( ruleStates ) )
            // InternalReactionRules.g:6339:2: ( ruleStates )
            {
            // InternalReactionRules.g:6339:2: ( ruleStates )
            // InternalReactionRules.g:6340:3: ruleStates
            {
             before(grammarAccess.getSingleSiteAccess().getStatesStatesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStates();

            state._fsp--;

             after(grammarAccess.getSingleSiteAccess().getStatesStatesParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SingleSite__StatesAssignment_2"


    // $ANTLR start "rule__MultiSite__NameAssignment_2"
    // InternalReactionRules.g:6349:1: rule__MultiSite__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MultiSite__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6353:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6354:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6354:2: ( RULE_ID )
            // InternalReactionRules.g:6355:3: RULE_ID
            {
             before(grammarAccess.getMultiSiteAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMultiSiteAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__MultiSite__NameAssignment_2"


    // $ANTLR start "rule__MultiSite__StatesAssignment_3"
    // InternalReactionRules.g:6364:1: rule__MultiSite__StatesAssignment_3 : ( ruleStates ) ;
    public final void rule__MultiSite__StatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6368:1: ( ( ruleStates ) )
            // InternalReactionRules.g:6369:2: ( ruleStates )
            {
            // InternalReactionRules.g:6369:2: ( ruleStates )
            // InternalReactionRules.g:6370:3: ruleStates
            {
             before(grammarAccess.getMultiSiteAccess().getStatesStatesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStates();

            state._fsp--;

             after(grammarAccess.getMultiSiteAccess().getStatesStatesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MultiSite__StatesAssignment_3"


    // $ANTLR start "rule__Sites__SitesAssignment_1_1"
    // InternalReactionRules.g:6379:1: rule__Sites__SitesAssignment_1_1 : ( ruleSite ) ;
    public final void rule__Sites__SitesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6383:1: ( ( ruleSite ) )
            // InternalReactionRules.g:6384:2: ( ruleSite )
            {
            // InternalReactionRules.g:6384:2: ( ruleSite )
            // InternalReactionRules.g:6385:3: ruleSite
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
    // InternalReactionRules.g:6394:1: rule__Sites__SitesAssignment_1_2_1 : ( ruleSite ) ;
    public final void rule__Sites__SitesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6398:1: ( ( ruleSite ) )
            // InternalReactionRules.g:6399:2: ( ruleSite )
            {
            // InternalReactionRules.g:6399:2: ( ruleSite )
            // InternalReactionRules.g:6400:3: ruleSite
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
    // InternalReactionRules.g:6409:1: rule__Agent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6413:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6414:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6414:2: ( RULE_ID )
            // InternalReactionRules.g:6415:3: RULE_ID
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
    // InternalReactionRules.g:6424:1: rule__Agent__SitesAssignment_2 : ( ruleSites ) ;
    public final void rule__Agent__SitesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6428:1: ( ( ruleSites ) )
            // InternalReactionRules.g:6429:2: ( ruleSites )
            {
            // InternalReactionRules.g:6429:2: ( ruleSites )
            // InternalReactionRules.g:6430:3: ruleSites
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
    // InternalReactionRules.g:6439:1: rule__PatternVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PatternVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6443:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6444:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6444:2: ( RULE_ID )
            // InternalReactionRules.g:6445:3: RULE_ID
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
    // InternalReactionRules.g:6454:1: rule__PatternVariable__PatternAssignment_3 : ( rulePattern ) ;
    public final void rule__PatternVariable__PatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6458:1: ( ( rulePattern ) )
            // InternalReactionRules.g:6459:2: ( rulePattern )
            {
            // InternalReactionRules.g:6459:2: ( rulePattern )
            // InternalReactionRules.g:6460:3: rulePattern
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
    // InternalReactionRules.g:6469:1: rule__ArithmeticVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ArithmeticVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6473:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6474:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6474:2: ( RULE_ID )
            // InternalReactionRules.g:6475:3: RULE_ID
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
    // InternalReactionRules.g:6484:1: rule__ArithmeticVariable__ValueAssignment_3 : ( ruleArithmeticValue ) ;
    public final void rule__ArithmeticVariable__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6488:1: ( ( ruleArithmeticValue ) )
            // InternalReactionRules.g:6489:2: ( ruleArithmeticValue )
            {
            // InternalReactionRules.g:6489:2: ( ruleArithmeticValue )
            // InternalReactionRules.g:6490:3: ruleArithmeticValue
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
    // InternalReactionRules.g:6499:1: rule__BoundAnyLink__NameAssignment_1 : ( RULE_BOUND_LINK ) ;
    public final void rule__BoundAnyLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6503:1: ( ( RULE_BOUND_LINK ) )
            // InternalReactionRules.g:6504:2: ( RULE_BOUND_LINK )
            {
            // InternalReactionRules.g:6504:2: ( RULE_BOUND_LINK )
            // InternalReactionRules.g:6505:3: RULE_BOUND_LINK
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
    // InternalReactionRules.g:6514:1: rule__FreeLink__NameAssignment_1 : ( RULE_FREE_LINK ) ;
    public final void rule__FreeLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6518:1: ( ( RULE_FREE_LINK ) )
            // InternalReactionRules.g:6519:2: ( RULE_FREE_LINK )
            {
            // InternalReactionRules.g:6519:2: ( RULE_FREE_LINK )
            // InternalReactionRules.g:6520:3: RULE_FREE_LINK
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


    // $ANTLR start "rule__IndexedFreeLink__NameAssignment_1"
    // InternalReactionRules.g:6529:1: rule__IndexedFreeLink__NameAssignment_1 : ( RULE_FREE_LINK ) ;
    public final void rule__IndexedFreeLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6533:1: ( ( RULE_FREE_LINK ) )
            // InternalReactionRules.g:6534:2: ( RULE_FREE_LINK )
            {
            // InternalReactionRules.g:6534:2: ( RULE_FREE_LINK )
            // InternalReactionRules.g:6535:3: RULE_FREE_LINK
            {
             before(grammarAccess.getIndexedFreeLinkAccess().getNameFREE_LINKTerminalRuleCall_1_0()); 
            match(input,RULE_FREE_LINK,FOLLOW_2); 
             after(grammarAccess.getIndexedFreeLinkAccess().getNameFREE_LINKTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__IndexedFreeLink__NameAssignment_1"


    // $ANTLR start "rule__IndexedFreeLink__StateAssignment_3"
    // InternalReactionRules.g:6544:1: rule__IndexedFreeLink__StateAssignment_3 : ( ruleUnsignedInteger ) ;
    public final void rule__IndexedFreeLink__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6548:1: ( ( ruleUnsignedInteger ) )
            // InternalReactionRules.g:6549:2: ( ruleUnsignedInteger )
            {
            // InternalReactionRules.g:6549:2: ( ruleUnsignedInteger )
            // InternalReactionRules.g:6550:3: ruleUnsignedInteger
            {
             before(grammarAccess.getIndexedFreeLinkAccess().getStateUnsignedIntegerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsignedInteger();

            state._fsp--;

             after(grammarAccess.getIndexedFreeLinkAccess().getStateUnsignedIntegerParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__IndexedFreeLink__StateAssignment_3"


    // $ANTLR start "rule__WhatEver__NameAssignment_1"
    // InternalReactionRules.g:6559:1: rule__WhatEver__NameAssignment_1 : ( RULE_WHATEVER_LINK ) ;
    public final void rule__WhatEver__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6563:1: ( ( RULE_WHATEVER_LINK ) )
            // InternalReactionRules.g:6564:2: ( RULE_WHATEVER_LINK )
            {
            // InternalReactionRules.g:6564:2: ( RULE_WHATEVER_LINK )
            // InternalReactionRules.g:6565:3: RULE_WHATEVER_LINK
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
    // InternalReactionRules.g:6574:1: rule__BoundLink__StateAssignment_1 : ( ruleUnsignedInteger ) ;
    public final void rule__BoundLink__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6578:1: ( ( ruleUnsignedInteger ) )
            // InternalReactionRules.g:6579:2: ( ruleUnsignedInteger )
            {
            // InternalReactionRules.g:6579:2: ( ruleUnsignedInteger )
            // InternalReactionRules.g:6580:3: ruleUnsignedInteger
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


    // $ANTLR start "rule__MultiLink__StatesAssignment_1_0"
    // InternalReactionRules.g:6589:1: rule__MultiLink__StatesAssignment_1_0 : ( ( rule__MultiLink__StatesAlternatives_1_0_0 ) ) ;
    public final void rule__MultiLink__StatesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6593:1: ( ( ( rule__MultiLink__StatesAlternatives_1_0_0 ) ) )
            // InternalReactionRules.g:6594:2: ( ( rule__MultiLink__StatesAlternatives_1_0_0 ) )
            {
            // InternalReactionRules.g:6594:2: ( ( rule__MultiLink__StatesAlternatives_1_0_0 ) )
            // InternalReactionRules.g:6595:3: ( rule__MultiLink__StatesAlternatives_1_0_0 )
            {
             before(grammarAccess.getMultiLinkAccess().getStatesAlternatives_1_0_0()); 
            // InternalReactionRules.g:6596:3: ( rule__MultiLink__StatesAlternatives_1_0_0 )
            // InternalReactionRules.g:6596:4: rule__MultiLink__StatesAlternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiLink__StatesAlternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiLinkAccess().getStatesAlternatives_1_0_0()); 

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
    // $ANTLR end "rule__MultiLink__StatesAssignment_1_0"


    // $ANTLR start "rule__MultiLink__StatesAssignment_1_1_1"
    // InternalReactionRules.g:6604:1: rule__MultiLink__StatesAssignment_1_1_1 : ( ( rule__MultiLink__StatesAlternatives_1_1_1_0 ) ) ;
    public final void rule__MultiLink__StatesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6608:1: ( ( ( rule__MultiLink__StatesAlternatives_1_1_1_0 ) ) )
            // InternalReactionRules.g:6609:2: ( ( rule__MultiLink__StatesAlternatives_1_1_1_0 ) )
            {
            // InternalReactionRules.g:6609:2: ( ( rule__MultiLink__StatesAlternatives_1_1_1_0 ) )
            // InternalReactionRules.g:6610:3: ( rule__MultiLink__StatesAlternatives_1_1_1_0 )
            {
             before(grammarAccess.getMultiLinkAccess().getStatesAlternatives_1_1_1_0()); 
            // InternalReactionRules.g:6611:3: ( rule__MultiLink__StatesAlternatives_1_1_1_0 )
            // InternalReactionRules.g:6611:4: rule__MultiLink__StatesAlternatives_1_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiLink__StatesAlternatives_1_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiLinkAccess().getStatesAlternatives_1_1_1_0()); 

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
    // $ANTLR end "rule__MultiLink__StatesAssignment_1_1_1"


    // $ANTLR start "rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1"
    // InternalReactionRules.g:6619:1: rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6623:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6624:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6624:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6625:3: ( RULE_ID )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getAgentAgentCrossReference_1_0()); 
            // InternalReactionRules.g:6626:3: ( RULE_ID )
            // InternalReactionRules.g:6627:4: RULE_ID
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
    // InternalReactionRules.g:6638:1: rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__BoundAnyOfTypeLinkSite__SiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6642:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6643:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6643:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6644:3: ( RULE_ID )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getSiteSiteCrossReference_1_0()); 
            // InternalReactionRules.g:6645:3: ( RULE_ID )
            // InternalReactionRules.g:6646:4: RULE_ID
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
    // InternalReactionRules.g:6657:1: rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 : ( ruleBoundAnyOfTypeLinkAgent ) ;
    public final void rule__BoundAnyOfTypeLink__LinkAgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6661:1: ( ( ruleBoundAnyOfTypeLinkAgent ) )
            // InternalReactionRules.g:6662:2: ( ruleBoundAnyOfTypeLinkAgent )
            {
            // InternalReactionRules.g:6662:2: ( ruleBoundAnyOfTypeLinkAgent )
            // InternalReactionRules.g:6663:3: ruleBoundAnyOfTypeLinkAgent
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
    // InternalReactionRules.g:6672:1: rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 : ( ruleBoundAnyOfTypeLinkSite ) ;
    public final void rule__BoundAnyOfTypeLink__LinkSiteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6676:1: ( ( ruleBoundAnyOfTypeLinkSite ) )
            // InternalReactionRules.g:6677:2: ( ruleBoundAnyOfTypeLinkSite )
            {
            // InternalReactionRules.g:6677:2: ( ruleBoundAnyOfTypeLinkSite )
            // InternalReactionRules.g:6678:3: ruleBoundAnyOfTypeLinkSite
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
    // InternalReactionRules.g:6687:1: rule__SiteState__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SiteState__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6691:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6692:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6692:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6693:3: ( RULE_ID )
            {
             before(grammarAccess.getSiteStateAccess().getStateStateCrossReference_2_0()); 
            // InternalReactionRules.g:6694:3: ( RULE_ID )
            // InternalReactionRules.g:6695:4: RULE_ID
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
    // InternalReactionRules.g:6706:1: rule__LinkState__LinkStateAssignment_2 : ( ( rule__LinkState__LinkStateAlternatives_2_0 ) ) ;
    public final void rule__LinkState__LinkStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6710:1: ( ( ( rule__LinkState__LinkStateAlternatives_2_0 ) ) )
            // InternalReactionRules.g:6711:2: ( ( rule__LinkState__LinkStateAlternatives_2_0 ) )
            {
            // InternalReactionRules.g:6711:2: ( ( rule__LinkState__LinkStateAlternatives_2_0 ) )
            // InternalReactionRules.g:6712:3: ( rule__LinkState__LinkStateAlternatives_2_0 )
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAlternatives_2_0()); 
            // InternalReactionRules.g:6713:3: ( rule__LinkState__LinkStateAlternatives_2_0 )
            // InternalReactionRules.g:6713:4: rule__LinkState__LinkStateAlternatives_2_0
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


    // $ANTLR start "rule__MultiLinkState__LinkStateAssignment_2"
    // InternalReactionRules.g:6721:1: rule__MultiLinkState__LinkStateAssignment_2 : ( ( rule__MultiLinkState__LinkStateAlternatives_2_0 ) ) ;
    public final void rule__MultiLinkState__LinkStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6725:1: ( ( ( rule__MultiLinkState__LinkStateAlternatives_2_0 ) ) )
            // InternalReactionRules.g:6726:2: ( ( rule__MultiLinkState__LinkStateAlternatives_2_0 ) )
            {
            // InternalReactionRules.g:6726:2: ( ( rule__MultiLinkState__LinkStateAlternatives_2_0 ) )
            // InternalReactionRules.g:6727:3: ( rule__MultiLinkState__LinkStateAlternatives_2_0 )
            {
             before(grammarAccess.getMultiLinkStateAccess().getLinkStateAlternatives_2_0()); 
            // InternalReactionRules.g:6728:3: ( rule__MultiLinkState__LinkStateAlternatives_2_0 )
            // InternalReactionRules.g:6728:4: rule__MultiLinkState__LinkStateAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiLinkState__LinkStateAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiLinkStateAccess().getLinkStateAlternatives_2_0()); 

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
    // $ANTLR end "rule__MultiLinkState__LinkStateAssignment_2"


    // $ANTLR start "rule__SingleSitePattern__SiteAssignment_1"
    // InternalReactionRules.g:6736:1: rule__SingleSitePattern__SiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SingleSitePattern__SiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6740:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6741:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6741:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6742:3: ( RULE_ID )
            {
             before(grammarAccess.getSingleSitePatternAccess().getSiteSingleSiteCrossReference_1_0()); 
            // InternalReactionRules.g:6743:3: ( RULE_ID )
            // InternalReactionRules.g:6744:4: RULE_ID
            {
             before(grammarAccess.getSingleSitePatternAccess().getSiteSingleSiteIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleSitePatternAccess().getSiteSingleSiteIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSingleSitePatternAccess().getSiteSingleSiteCrossReference_1_0()); 

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
    // $ANTLR end "rule__SingleSitePattern__SiteAssignment_1"


    // $ANTLR start "rule__SingleSitePattern__StateAssignment_2"
    // InternalReactionRules.g:6755:1: rule__SingleSitePattern__StateAssignment_2 : ( ruleSiteState ) ;
    public final void rule__SingleSitePattern__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6759:1: ( ( ruleSiteState ) )
            // InternalReactionRules.g:6760:2: ( ruleSiteState )
            {
            // InternalReactionRules.g:6760:2: ( ruleSiteState )
            // InternalReactionRules.g:6761:3: ruleSiteState
            {
             before(grammarAccess.getSingleSitePatternAccess().getStateSiteStateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSiteState();

            state._fsp--;

             after(grammarAccess.getSingleSitePatternAccess().getStateSiteStateParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SingleSitePattern__StateAssignment_2"


    // $ANTLR start "rule__SingleSitePattern__LinkStateAssignment_3"
    // InternalReactionRules.g:6770:1: rule__SingleSitePattern__LinkStateAssignment_3 : ( ruleLinkState ) ;
    public final void rule__SingleSitePattern__LinkStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6774:1: ( ( ruleLinkState ) )
            // InternalReactionRules.g:6775:2: ( ruleLinkState )
            {
            // InternalReactionRules.g:6775:2: ( ruleLinkState )
            // InternalReactionRules.g:6776:3: ruleLinkState
            {
             before(grammarAccess.getSingleSitePatternAccess().getLinkStateLinkStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLinkState();

            state._fsp--;

             after(grammarAccess.getSingleSitePatternAccess().getLinkStateLinkStateParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SingleSitePattern__LinkStateAssignment_3"


    // $ANTLR start "rule__MultiLinkSitePattern__SiteAssignment_1"
    // InternalReactionRules.g:6785:1: rule__MultiLinkSitePattern__SiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MultiLinkSitePattern__SiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6789:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6790:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6790:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6791:3: ( RULE_ID )
            {
             before(grammarAccess.getMultiLinkSitePatternAccess().getSiteMultiSiteCrossReference_1_0()); 
            // InternalReactionRules.g:6792:3: ( RULE_ID )
            // InternalReactionRules.g:6793:4: RULE_ID
            {
             before(grammarAccess.getMultiLinkSitePatternAccess().getSiteMultiSiteIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMultiLinkSitePatternAccess().getSiteMultiSiteIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMultiLinkSitePatternAccess().getSiteMultiSiteCrossReference_1_0()); 

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
    // $ANTLR end "rule__MultiLinkSitePattern__SiteAssignment_1"


    // $ANTLR start "rule__MultiLinkSitePattern__StateAssignment_2"
    // InternalReactionRules.g:6804:1: rule__MultiLinkSitePattern__StateAssignment_2 : ( ruleSiteState ) ;
    public final void rule__MultiLinkSitePattern__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6808:1: ( ( ruleSiteState ) )
            // InternalReactionRules.g:6809:2: ( ruleSiteState )
            {
            // InternalReactionRules.g:6809:2: ( ruleSiteState )
            // InternalReactionRules.g:6810:3: ruleSiteState
            {
             before(grammarAccess.getMultiLinkSitePatternAccess().getStateSiteStateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSiteState();

            state._fsp--;

             after(grammarAccess.getMultiLinkSitePatternAccess().getStateSiteStateParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MultiLinkSitePattern__StateAssignment_2"


    // $ANTLR start "rule__MultiLinkSitePattern__LinkStateAssignment_3"
    // InternalReactionRules.g:6819:1: rule__MultiLinkSitePattern__LinkStateAssignment_3 : ( ruleMultiLinkState ) ;
    public final void rule__MultiLinkSitePattern__LinkStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6823:1: ( ( ruleMultiLinkState ) )
            // InternalReactionRules.g:6824:2: ( ruleMultiLinkState )
            {
            // InternalReactionRules.g:6824:2: ( ruleMultiLinkState )
            // InternalReactionRules.g:6825:3: ruleMultiLinkState
            {
             before(grammarAccess.getMultiLinkSitePatternAccess().getLinkStateMultiLinkStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiLinkState();

            state._fsp--;

             after(grammarAccess.getMultiLinkSitePatternAccess().getLinkStateMultiLinkStateParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MultiLinkSitePattern__LinkStateAssignment_3"


    // $ANTLR start "rule__SitePatterns__SitePatternsAssignment_2_0"
    // InternalReactionRules.g:6834:1: rule__SitePatterns__SitePatternsAssignment_2_0 : ( ruleSitePattern ) ;
    public final void rule__SitePatterns__SitePatternsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6838:1: ( ( ruleSitePattern ) )
            // InternalReactionRules.g:6839:2: ( ruleSitePattern )
            {
            // InternalReactionRules.g:6839:2: ( ruleSitePattern )
            // InternalReactionRules.g:6840:3: ruleSitePattern
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
    // InternalReactionRules.g:6849:1: rule__SitePatterns__SitePatternsAssignment_2_1_1 : ( ruleSitePattern ) ;
    public final void rule__SitePatterns__SitePatternsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6853:1: ( ( ruleSitePattern ) )
            // InternalReactionRules.g:6854:2: ( ruleSitePattern )
            {
            // InternalReactionRules.g:6854:2: ( ruleSitePattern )
            // InternalReactionRules.g:6855:3: ruleSitePattern
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
    // InternalReactionRules.g:6864:1: rule__ValidAgentPattern__AgentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ValidAgentPattern__AgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6868:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6869:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6869:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6870:3: ( RULE_ID )
            {
             before(grammarAccess.getValidAgentPatternAccess().getAgentAgentCrossReference_1_0()); 
            // InternalReactionRules.g:6871:3: ( RULE_ID )
            // InternalReactionRules.g:6872:4: RULE_ID
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
    // InternalReactionRules.g:6883:1: rule__ValidAgentPattern__SitePatternsAssignment_2 : ( ruleSitePatterns ) ;
    public final void rule__ValidAgentPattern__SitePatternsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6887:1: ( ( ruleSitePatterns ) )
            // InternalReactionRules.g:6888:2: ( ruleSitePatterns )
            {
            // InternalReactionRules.g:6888:2: ( ruleSitePatterns )
            // InternalReactionRules.g:6889:3: ruleSitePatterns
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
    // InternalReactionRules.g:6898:1: rule__VoidAgentPattern__PatternAssignment : ( RULE_VOID_PATTERN ) ;
    public final void rule__VoidAgentPattern__PatternAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6902:1: ( ( RULE_VOID_PATTERN ) )
            // InternalReactionRules.g:6903:2: ( RULE_VOID_PATTERN )
            {
            // InternalReactionRules.g:6903:2: ( RULE_VOID_PATTERN )
            // InternalReactionRules.g:6904:3: RULE_VOID_PATTERN
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
    // InternalReactionRules.g:6913:1: rule__Pattern__AgentPatternsAssignment_2_0 : ( ruleAgentPattern ) ;
    public final void rule__Pattern__AgentPatternsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6917:1: ( ( ruleAgentPattern ) )
            // InternalReactionRules.g:6918:2: ( ruleAgentPattern )
            {
            // InternalReactionRules.g:6918:2: ( ruleAgentPattern )
            // InternalReactionRules.g:6919:3: ruleAgentPattern
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
    // InternalReactionRules.g:6928:1: rule__Pattern__AgentPatternsAssignment_2_1_1 : ( ruleAgentPattern ) ;
    public final void rule__Pattern__AgentPatternsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6932:1: ( ( ruleAgentPattern ) )
            // InternalReactionRules.g:6933:2: ( ruleAgentPattern )
            {
            // InternalReactionRules.g:6933:2: ( ruleAgentPattern )
            // InternalReactionRules.g:6934:3: ruleAgentPattern
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
    // InternalReactionRules.g:6943:1: rule__Observation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Observation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6947:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6948:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6948:2: ( RULE_ID )
            // InternalReactionRules.g:6949:3: RULE_ID
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
    // InternalReactionRules.g:6958:1: rule__Observation__ObservationPatternAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__Observation__ObservationPatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6962:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6963:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6963:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6964:3: rulePatternAssignment
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
    // InternalReactionRules.g:6973:1: rule__NumericFromLiteral__ValueAssignment : ( ruleArithmeticValue ) ;
    public final void rule__NumericFromLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6977:1: ( ( ruleArithmeticValue ) )
            // InternalReactionRules.g:6978:2: ( ruleArithmeticValue )
            {
            // InternalReactionRules.g:6978:2: ( ruleArithmeticValue )
            // InternalReactionRules.g:6979:3: ruleArithmeticValue
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
    // InternalReactionRules.g:6988:1: rule__NumericFromVariable__ValueVarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NumericFromVariable__ValueVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6992:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6993:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6993:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6994:3: ( RULE_ID )
            {
             before(grammarAccess.getNumericFromVariableAccess().getValueVarArithmeticVariableCrossReference_0()); 
            // InternalReactionRules.g:6995:3: ( RULE_ID )
            // InternalReactionRules.g:6996:4: RULE_ID
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
    // InternalReactionRules.g:7007:1: rule__Initial__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Initial__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7011:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:7012:2: ( RULE_ID )
            {
            // InternalReactionRules.g:7012:2: ( RULE_ID )
            // InternalReactionRules.g:7013:3: RULE_ID
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
    // InternalReactionRules.g:7022:1: rule__Initial__CountAssignment_2 : ( ruleNumericAssignment ) ;
    public final void rule__Initial__CountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7026:1: ( ( ruleNumericAssignment ) )
            // InternalReactionRules.g:7027:2: ( ruleNumericAssignment )
            {
            // InternalReactionRules.g:7027:2: ( ruleNumericAssignment )
            // InternalReactionRules.g:7028:3: ruleNumericAssignment
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
    // InternalReactionRules.g:7037:1: rule__Initial__InitialPatternAssignment_3 : ( rulePatternAssignment ) ;
    public final void rule__Initial__InitialPatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7041:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:7042:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:7042:2: ( rulePatternAssignment )
            // InternalReactionRules.g:7043:3: rulePatternAssignment
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
    // InternalReactionRules.g:7052:1: rule__AssignFromPattern__PatternAssignment : ( rulePattern ) ;
    public final void rule__AssignFromPattern__PatternAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7056:1: ( ( rulePattern ) )
            // InternalReactionRules.g:7057:2: ( rulePattern )
            {
            // InternalReactionRules.g:7057:2: ( rulePattern )
            // InternalReactionRules.g:7058:3: rulePattern
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
    // InternalReactionRules.g:7067:1: rule__AssignFromVariable__PatternVarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__AssignFromVariable__PatternVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7071:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:7072:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:7072:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:7073:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignFromVariableAccess().getPatternVarPatternVariableCrossReference_0()); 
            // InternalReactionRules.g:7074:3: ( RULE_ID )
            // InternalReactionRules.g:7075:4: RULE_ID
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
    // InternalReactionRules.g:7086:1: rule__RuleVariables__VariablesAssignment_0 : ( ruleNumericAssignment ) ;
    public final void rule__RuleVariables__VariablesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7090:1: ( ( ruleNumericAssignment ) )
            // InternalReactionRules.g:7091:2: ( ruleNumericAssignment )
            {
            // InternalReactionRules.g:7091:2: ( ruleNumericAssignment )
            // InternalReactionRules.g:7092:3: ruleNumericAssignment
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
    // InternalReactionRules.g:7101:1: rule__RuleVariables__VariablesAssignment_1_1 : ( ruleNumericAssignment ) ;
    public final void rule__RuleVariables__VariablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7105:1: ( ( ruleNumericAssignment ) )
            // InternalReactionRules.g:7106:2: ( ruleNumericAssignment )
            {
            // InternalReactionRules.g:7106:2: ( ruleNumericAssignment )
            // InternalReactionRules.g:7107:3: ruleNumericAssignment
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
    // InternalReactionRules.g:7116:1: rule__UnidirectionalRule__LhsAssignment_0 : ( rulePatternAssignment ) ;
    public final void rule__UnidirectionalRule__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7120:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:7121:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:7121:2: ( rulePatternAssignment )
            // InternalReactionRules.g:7122:3: rulePatternAssignment
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
    // InternalReactionRules.g:7131:1: rule__UnidirectionalRule__OperatorAssignment_1 : ( RULE_UNI ) ;
    public final void rule__UnidirectionalRule__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7135:1: ( ( RULE_UNI ) )
            // InternalReactionRules.g:7136:2: ( RULE_UNI )
            {
            // InternalReactionRules.g:7136:2: ( RULE_UNI )
            // InternalReactionRules.g:7137:3: RULE_UNI
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
    // InternalReactionRules.g:7146:1: rule__UnidirectionalRule__RhsAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__UnidirectionalRule__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7150:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:7151:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:7151:2: ( rulePatternAssignment )
            // InternalReactionRules.g:7152:3: rulePatternAssignment
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
    // InternalReactionRules.g:7161:1: rule__UnidirectionalRule__VariablesAssignment_5 : ( ruleRuleVariables ) ;
    public final void rule__UnidirectionalRule__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7165:1: ( ( ruleRuleVariables ) )
            // InternalReactionRules.g:7166:2: ( ruleRuleVariables )
            {
            // InternalReactionRules.g:7166:2: ( ruleRuleVariables )
            // InternalReactionRules.g:7167:3: ruleRuleVariables
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
    // InternalReactionRules.g:7176:1: rule__BidirectionalRule__LhsAssignment_0 : ( rulePatternAssignment ) ;
    public final void rule__BidirectionalRule__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7180:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:7181:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:7181:2: ( rulePatternAssignment )
            // InternalReactionRules.g:7182:3: rulePatternAssignment
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
    // InternalReactionRules.g:7191:1: rule__BidirectionalRule__OperatorAssignment_1 : ( RULE_BI ) ;
    public final void rule__BidirectionalRule__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7195:1: ( ( RULE_BI ) )
            // InternalReactionRules.g:7196:2: ( RULE_BI )
            {
            // InternalReactionRules.g:7196:2: ( RULE_BI )
            // InternalReactionRules.g:7197:3: RULE_BI
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
    // InternalReactionRules.g:7206:1: rule__BidirectionalRule__RhsAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__BidirectionalRule__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7210:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:7211:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:7211:2: ( rulePatternAssignment )
            // InternalReactionRules.g:7212:3: rulePatternAssignment
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
    // InternalReactionRules.g:7221:1: rule__BidirectionalRule__VariablesAssignment_5 : ( ruleRuleVariables ) ;
    public final void rule__BidirectionalRule__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7225:1: ( ( ruleRuleVariables ) )
            // InternalReactionRules.g:7226:2: ( ruleRuleVariables )
            {
            // InternalReactionRules.g:7226:2: ( ruleRuleVariables )
            // InternalReactionRules.g:7227:3: ruleRuleVariables
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
    // InternalReactionRules.g:7236:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7240:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:7241:2: ( RULE_ID )
            {
            // InternalReactionRules.g:7241:2: ( RULE_ID )
            // InternalReactionRules.g:7242:3: RULE_ID
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
    // InternalReactionRules.g:7251:1: rule__Rule__RuleAssignment_2 : ( ruleRuleBody ) ;
    public final void rule__Rule__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7255:1: ( ( ruleRuleBody ) )
            // InternalReactionRules.g:7256:2: ( ruleRuleBody )
            {
            // InternalReactionRules.g:7256:2: ( ruleRuleBody )
            // InternalReactionRules.g:7257:3: ruleRuleBody
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
    // InternalReactionRules.g:7266:1: rule__Iterations__ValueAssignment_2 : ( ruleUnsignedInteger ) ;
    public final void rule__Iterations__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7270:1: ( ( ruleUnsignedInteger ) )
            // InternalReactionRules.g:7271:2: ( ruleUnsignedInteger )
            {
            // InternalReactionRules.g:7271:2: ( ruleUnsignedInteger )
            // InternalReactionRules.g:7272:3: ruleUnsignedInteger
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
    // InternalReactionRules.g:7281:1: rule__Time__ValueAssignment_2 : ( ruleUnsignedInteger ) ;
    public final void rule__Time__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7285:1: ( ( ruleUnsignedInteger ) )
            // InternalReactionRules.g:7286:2: ( ruleUnsignedInteger )
            {
            // InternalReactionRules.g:7286:2: ( ruleUnsignedInteger )
            // InternalReactionRules.g:7287:3: ruleUnsignedInteger
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
    // InternalReactionRules.g:7296:1: rule__Population__PaAssignment_1 : ( rulePatternAssignment ) ;
    public final void rule__Population__PaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7300:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:7301:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:7301:2: ( rulePatternAssignment )
            // InternalReactionRules.g:7302:3: rulePatternAssignment
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
    // InternalReactionRules.g:7311:1: rule__Population__ValueAssignment_4 : ( ruleUnsignedInteger ) ;
    public final void rule__Population__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7315:1: ( ( ruleUnsignedInteger ) )
            // InternalReactionRules.g:7316:2: ( ruleUnsignedInteger )
            {
            // InternalReactionRules.g:7316:2: ( ruleUnsignedInteger )
            // InternalReactionRules.g:7317:3: ruleUnsignedInteger
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
    // InternalReactionRules.g:7326:1: rule__Terminate__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Terminate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7330:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:7331:2: ( RULE_ID )
            {
            // InternalReactionRules.g:7331:2: ( RULE_ID )
            // InternalReactionRules.g:7332:3: RULE_ID
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
    // InternalReactionRules.g:7341:1: rule__Terminate__ConditionAssignment_2 : ( ruleTerminationCondition ) ;
    public final void rule__Terminate__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7345:1: ( ( ruleTerminationCondition ) )
            // InternalReactionRules.g:7346:2: ( ruleTerminationCondition )
            {
            // InternalReactionRules.g:7346:2: ( ruleTerminationCondition )
            // InternalReactionRules.g:7347:3: ruleTerminationCondition
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
    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\5\1\6\3\uffff\1\10\2\uffff";
    static final String dfa_3s = "\2\4\2\7\1\4\2\uffff\1\5\2\uffff";
    static final String dfa_4s = "\1\23\1\4\2\52\1\4\2\uffff\1\52\2\uffff";
    static final String dfa_5s = "\5\uffff\1\2\1\3\1\uffff\1\1\1\4";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\16\uffff\1\1",
            "\1\3",
            "\1\5\16\uffff\1\4\1\5\1\uffff\1\5\3\uffff\2\5\2\uffff\1\5\1\uffff\3\5\4\uffff\1\5",
            "\1\6\16\uffff\1\4\1\6\1\uffff\1\6\3\uffff\2\6\2\uffff\1\6\1\uffff\3\6\4\uffff\1\6",
            "\1\7",
            "",
            "",
            "\1\11\1\uffff\1\10\17\uffff\1\10\1\uffff\1\10\3\uffff\2\10\2\uffff\1\10\1\uffff\3\10\4\uffff\1\10",
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
            return "1575:1: rule__ArithmeticType__Alternatives : ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) );";
        }
    }
    static final String dfa_8s = "\14\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\33\1\uffff\1\31\2\uffff\1\4\1\uffff\1\34\1\31\1\uffff";
    static final String dfa_10s = "\1\41\1\uffff\1\41\1\uffff\1\41\2\uffff\1\4\1\uffff\1\34\1\41\1\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\uffff\1\4\1\uffff\1\6\1\2\1\uffff\1\5\2\uffff\1\3";
    static final String dfa_12s = "\14\uffff}>";
    static final String[] dfa_13s = {
            "\1\4\3\uffff\1\3\1\2\1\1\26\uffff\1\5",
            "",
            "\1\7\5\uffff\1\6",
            "",
            "\1\5\7\uffff\1\10",
            "",
            "",
            "\1\11",
            "",
            "\1\12",
            "\1\5\7\uffff\1\13",
            ""
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
            return "1737:1: rule__MultiLinkState__LinkStateAlternatives_2_0 : ( ( ruleWhatEver ) | ( ruleFreeLink ) | ( ruleIndexedFreeLink ) | ( ruleBoundAnyLink ) | ( ruleBoundLink ) | ( ruleMultiLink ) );";
        }
    }
    static final String dfa_14s = "\u00a5\uffff";
    static final String dfa_15s = "\2\7\1\14\1\33\1\30\1\14\2\uffff\2\7\1\27\1\30\1\33\1\30\1\7\2\4\1\7\1\30\1\41\1\33\1\26\3\41\1\33\1\41\2\31\1\27\1\30\1\40\1\31\1\4\1\7\2\4\2\7\2\4\1\34\1\41\1\34\1\31\1\33\1\27\1\30\1\41\1\33\1\26\3\41\1\33\1\41\2\31\1\41\1\31\2\4\1\7\2\4\1\40\1\31\1\4\1\7\2\4\1\7\1\31\1\33\1\34\1\30\1\41\1\33\1\26\3\41\1\33\1\41\2\31\1\34\1\41\1\34\1\31\1\33\1\27\1\4\1\31\1\40\1\31\1\4\1\7\2\4\1\41\1\31\2\4\1\7\2\4\2\34\1\41\1\34\1\31\1\33\1\31\1\33\1\34\1\30\1\41\1\33\1\26\3\41\1\33\1\41\3\31\1\41\1\31\3\4\1\31\1\40\1\31\1\4\1\7\2\4\1\31\1\33\3\34\1\41\1\34\1\31\1\33\1\4\2\31\1\41\1\31\2\4\1\34\1\31\1\33\1\34\1\31\1\4\1\31\1\34\1\31";
    static final String dfa_16s = "\1\27\1\30\1\15\1\33\1\31\1\15\2\uffff\1\34\1\13\1\42\1\31\1\33\1\31\1\7\1\12\1\41\1\34\1\30\2\41\1\26\6\41\1\34\1\42\1\31\1\42\1\34\1\4\1\7\1\4\1\11\2\7\1\12\1\41\1\34\1\41\1\34\1\41\1\33\1\42\1\30\2\41\1\26\6\41\1\34\2\41\1\11\1\4\1\7\1\12\1\41\1\42\1\34\1\4\1\7\1\4\1\11\1\7\1\41\1\33\1\34\1\30\2\41\1\26\6\41\2\34\1\41\1\34\1\41\1\33\1\42\1\4\1\41\1\42\1\34\1\4\1\7\1\4\1\11\2\41\1\11\1\4\1\7\1\12\1\41\2\34\1\41\1\34\1\41\1\33\1\41\1\33\1\34\1\30\2\41\1\26\6\41\1\34\3\41\1\11\2\4\1\41\1\42\1\34\1\4\1\7\1\4\1\11\1\41\1\33\3\34\1\41\1\34\1\41\1\33\1\4\4\41\1\11\1\4\1\34\1\41\1\33\1\34\1\41\1\4\1\41\1\34\1\41";
    static final String dfa_17s = "\6\uffff\1\1\1\2\u009d\uffff";
    static final String dfa_18s = "\u00a5\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\17\uffff\1\1",
            "\1\3\3\uffff\1\4\14\uffff\1\5",
            "\1\6\1\7",
            "\1\10",
            "\1\5\1\11",
            "\1\6\1\7",
            "",
            "",
            "\1\12\24\uffff\1\13",
            "\1\14\3\uffff\1\15",
            "\1\16\10\uffff\1\17\1\uffff\1\20",
            "\1\5\1\11",
            "\1\21",
            "\1\5\1\11",
            "\1\22",
            "\1\26\2\uffff\1\25\1\23\1\24\1\27",
            "\1\33\3\uffff\1\32\1\31\1\30\26\uffff\1\34",
            "\1\35\24\uffff\1\36",
            "\1\37",
            "\1\40",
            "\1\41\5\uffff\1\40",
            "\1\42",
            "\1\40",
            "\1\40",
            "\1\34",
            "\1\43\5\uffff\1\34",
            "\1\34",
            "\1\44\7\uffff\1\34",
            "\1\45\2\uffff\1\13",
            "\1\46\10\uffff\1\47\1\uffff\1\50",
            "\1\5\1\11",
            "\1\17\1\uffff\1\20",
            "\1\45\2\uffff\1\13",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54\4\uffff\1\55",
            "\1\56",
            "\1\57",
            "\1\63\2\uffff\1\62\1\60\1\61\1\64",
            "\1\70\3\uffff\1\67\1\66\1\65\26\uffff\1\71",
            "\1\72",
            "\1\40",
            "\1\73",
            "\1\74\7\uffff\1\34",
            "\1\75",
            "\1\76\10\uffff\1\77\1\uffff\1\100",
            "\1\101",
            "\1\102",
            "\1\103\5\uffff\1\102",
            "\1\104",
            "\1\102",
            "\1\102",
            "\1\71",
            "\1\105\5\uffff\1\71",
            "\1\71",
            "\1\106\7\uffff\1\71",
            "\1\107\2\uffff\1\36",
            "\1\40",
            "\1\44\7\uffff\1\34",
            "\1\110\4\uffff\1\111",
            "\1\112",
            "\1\113",
            "\1\117\2\uffff\1\116\1\114\1\115\1\120",
            "\1\124\3\uffff\1\123\1\122\1\121\26\uffff\1\125",
            "\1\47\1\uffff\1\50",
            "\1\107\2\uffff\1\36",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131\4\uffff\1\132",
            "\1\133",
            "\1\74\7\uffff\1\34",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140\5\uffff\1\137",
            "\1\141",
            "\1\137",
            "\1\137",
            "\1\125",
            "\1\142\5\uffff\1\125",
            "\1\125",
            "\1\143\7\uffff\1\125",
            "\1\45\2\uffff\1\13",
            "\1\144",
            "\1\102",
            "\1\145",
            "\1\146\7\uffff\1\71",
            "\1\147",
            "\1\150\10\uffff\1\151\1\uffff\1\152",
            "\1\153",
            "\1\74\7\uffff\1\34",
            "\1\77\1\uffff\1\100",
            "\1\45\2\uffff\1\13",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157\4\uffff\1\160",
            "\1\102",
            "\1\106\7\uffff\1\71",
            "\1\161\4\uffff\1\162",
            "\1\163",
            "\1\164",
            "\1\170\2\uffff\1\167\1\165\1\166\1\171",
            "\1\175\3\uffff\1\174\1\173\1\172\26\uffff\1\176",
            "\1\177",
            "\1\u0080",
            "\1\137",
            "\1\u0081",
            "\1\u0082\7\uffff\1\125",
            "\1\u0083",
            "\1\146\7\uffff\1\71",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088\5\uffff\1\u0087",
            "\1\u0089",
            "\1\u0087",
            "\1\u0087",
            "\1\176",
            "\1\u008a\5\uffff\1\176",
            "\1\176",
            "\1\u008b\7\uffff\1\176",
            "\1\107\2\uffff\1\36",
            "\1\74\7\uffff\1\34",
            "\1\137",
            "\1\143\7\uffff\1\125",
            "\1\u008c\4\uffff\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\146\7\uffff\1\71",
            "\1\151\1\uffff\1\152",
            "\1\107\2\uffff\1\36",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093\4\uffff\1\u0094",
            "\1\u0082\7\uffff\1\125",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0087",
            "\1\u0099",
            "\1\u009a\7\uffff\1\176",
            "\1\u009b",
            "\1\u009c",
            "\1\u0082\7\uffff\1\125",
            "\1\146\7\uffff\1\71",
            "\1\u0087",
            "\1\u008b\7\uffff\1\176",
            "\1\u009d\4\uffff\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u009a\7\uffff\1\176",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u0082\7\uffff\1\125",
            "\1\u00a3",
            "\1\u009a\7\uffff\1\176",
            "\1\u00a4",
            "\1\u009a\7\uffff\1\176"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1866:1: rule__RuleBody__Alternatives : ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000043860000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000043860000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000790L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000001000880L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000800080L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000080090L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000001C000000000L});

}