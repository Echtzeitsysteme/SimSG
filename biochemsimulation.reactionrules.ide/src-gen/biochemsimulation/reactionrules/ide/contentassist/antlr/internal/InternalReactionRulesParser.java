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


    // $ANTLR start "entryRuleWhatEver"
    // InternalReactionRules.g:610:1: entryRuleWhatEver : ruleWhatEver EOF ;
    public final void entryRuleWhatEver() throws RecognitionException {
        try {
            // InternalReactionRules.g:611:1: ( ruleWhatEver EOF )
            // InternalReactionRules.g:612:1: ruleWhatEver EOF
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
    // InternalReactionRules.g:619:1: ruleWhatEver : ( ( rule__WhatEver__Group__0 ) ) ;
    public final void ruleWhatEver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:623:2: ( ( ( rule__WhatEver__Group__0 ) ) )
            // InternalReactionRules.g:624:2: ( ( rule__WhatEver__Group__0 ) )
            {
            // InternalReactionRules.g:624:2: ( ( rule__WhatEver__Group__0 ) )
            // InternalReactionRules.g:625:3: ( rule__WhatEver__Group__0 )
            {
             before(grammarAccess.getWhatEverAccess().getGroup()); 
            // InternalReactionRules.g:626:3: ( rule__WhatEver__Group__0 )
            // InternalReactionRules.g:626:4: rule__WhatEver__Group__0
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
    // InternalReactionRules.g:635:1: entryRuleBoundLink : ruleBoundLink EOF ;
    public final void entryRuleBoundLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:636:1: ( ruleBoundLink EOF )
            // InternalReactionRules.g:637:1: ruleBoundLink EOF
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
    // InternalReactionRules.g:644:1: ruleBoundLink : ( ( rule__BoundLink__Group__0 ) ) ;
    public final void ruleBoundLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:648:2: ( ( ( rule__BoundLink__Group__0 ) ) )
            // InternalReactionRules.g:649:2: ( ( rule__BoundLink__Group__0 ) )
            {
            // InternalReactionRules.g:649:2: ( ( rule__BoundLink__Group__0 ) )
            // InternalReactionRules.g:650:3: ( rule__BoundLink__Group__0 )
            {
             before(grammarAccess.getBoundLinkAccess().getGroup()); 
            // InternalReactionRules.g:651:3: ( rule__BoundLink__Group__0 )
            // InternalReactionRules.g:651:4: rule__BoundLink__Group__0
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
    // InternalReactionRules.g:660:1: entryRuleMultiLink : ruleMultiLink EOF ;
    public final void entryRuleMultiLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:661:1: ( ruleMultiLink EOF )
            // InternalReactionRules.g:662:1: ruleMultiLink EOF
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
    // InternalReactionRules.g:669:1: ruleMultiLink : ( ( rule__MultiLink__Group__0 ) ) ;
    public final void ruleMultiLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:673:2: ( ( ( rule__MultiLink__Group__0 ) ) )
            // InternalReactionRules.g:674:2: ( ( rule__MultiLink__Group__0 ) )
            {
            // InternalReactionRules.g:674:2: ( ( rule__MultiLink__Group__0 ) )
            // InternalReactionRules.g:675:3: ( rule__MultiLink__Group__0 )
            {
             before(grammarAccess.getMultiLinkAccess().getGroup()); 
            // InternalReactionRules.g:676:3: ( rule__MultiLink__Group__0 )
            // InternalReactionRules.g:676:4: rule__MultiLink__Group__0
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
    // InternalReactionRules.g:685:1: entryRuleBoundAnyOfTypeLinkAgent : ruleBoundAnyOfTypeLinkAgent EOF ;
    public final void entryRuleBoundAnyOfTypeLinkAgent() throws RecognitionException {
        try {
            // InternalReactionRules.g:686:1: ( ruleBoundAnyOfTypeLinkAgent EOF )
            // InternalReactionRules.g:687:1: ruleBoundAnyOfTypeLinkAgent EOF
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
    // InternalReactionRules.g:694:1: ruleBoundAnyOfTypeLinkAgent : ( ( rule__BoundAnyOfTypeLinkAgent__Group__0 ) ) ;
    public final void ruleBoundAnyOfTypeLinkAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:698:2: ( ( ( rule__BoundAnyOfTypeLinkAgent__Group__0 ) ) )
            // InternalReactionRules.g:699:2: ( ( rule__BoundAnyOfTypeLinkAgent__Group__0 ) )
            {
            // InternalReactionRules.g:699:2: ( ( rule__BoundAnyOfTypeLinkAgent__Group__0 ) )
            // InternalReactionRules.g:700:3: ( rule__BoundAnyOfTypeLinkAgent__Group__0 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getGroup()); 
            // InternalReactionRules.g:701:3: ( rule__BoundAnyOfTypeLinkAgent__Group__0 )
            // InternalReactionRules.g:701:4: rule__BoundAnyOfTypeLinkAgent__Group__0
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
    // InternalReactionRules.g:710:1: entryRuleBoundAnyOfTypeLinkSite : ruleBoundAnyOfTypeLinkSite EOF ;
    public final void entryRuleBoundAnyOfTypeLinkSite() throws RecognitionException {
        try {
            // InternalReactionRules.g:711:1: ( ruleBoundAnyOfTypeLinkSite EOF )
            // InternalReactionRules.g:712:1: ruleBoundAnyOfTypeLinkSite EOF
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
    // InternalReactionRules.g:719:1: ruleBoundAnyOfTypeLinkSite : ( ( rule__BoundAnyOfTypeLinkSite__Group__0 ) ) ;
    public final void ruleBoundAnyOfTypeLinkSite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:723:2: ( ( ( rule__BoundAnyOfTypeLinkSite__Group__0 ) ) )
            // InternalReactionRules.g:724:2: ( ( rule__BoundAnyOfTypeLinkSite__Group__0 ) )
            {
            // InternalReactionRules.g:724:2: ( ( rule__BoundAnyOfTypeLinkSite__Group__0 ) )
            // InternalReactionRules.g:725:3: ( rule__BoundAnyOfTypeLinkSite__Group__0 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getGroup()); 
            // InternalReactionRules.g:726:3: ( rule__BoundAnyOfTypeLinkSite__Group__0 )
            // InternalReactionRules.g:726:4: rule__BoundAnyOfTypeLinkSite__Group__0
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
    // InternalReactionRules.g:735:1: entryRuleBoundAnyOfTypeLink : ruleBoundAnyOfTypeLink EOF ;
    public final void entryRuleBoundAnyOfTypeLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:736:1: ( ruleBoundAnyOfTypeLink EOF )
            // InternalReactionRules.g:737:1: ruleBoundAnyOfTypeLink EOF
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
    // InternalReactionRules.g:744:1: ruleBoundAnyOfTypeLink : ( ( rule__BoundAnyOfTypeLink__Group__0 ) ) ;
    public final void ruleBoundAnyOfTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:748:2: ( ( ( rule__BoundAnyOfTypeLink__Group__0 ) ) )
            // InternalReactionRules.g:749:2: ( ( rule__BoundAnyOfTypeLink__Group__0 ) )
            {
            // InternalReactionRules.g:749:2: ( ( rule__BoundAnyOfTypeLink__Group__0 ) )
            // InternalReactionRules.g:750:3: ( rule__BoundAnyOfTypeLink__Group__0 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAccess().getGroup()); 
            // InternalReactionRules.g:751:3: ( rule__BoundAnyOfTypeLink__Group__0 )
            // InternalReactionRules.g:751:4: rule__BoundAnyOfTypeLink__Group__0
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
    // InternalReactionRules.g:760:1: entryRuleSiteState : ruleSiteState EOF ;
    public final void entryRuleSiteState() throws RecognitionException {
        try {
            // InternalReactionRules.g:761:1: ( ruleSiteState EOF )
            // InternalReactionRules.g:762:1: ruleSiteState EOF
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
    // InternalReactionRules.g:769:1: ruleSiteState : ( ( rule__SiteState__Group__0 ) ) ;
    public final void ruleSiteState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:773:2: ( ( ( rule__SiteState__Group__0 ) ) )
            // InternalReactionRules.g:774:2: ( ( rule__SiteState__Group__0 ) )
            {
            // InternalReactionRules.g:774:2: ( ( rule__SiteState__Group__0 ) )
            // InternalReactionRules.g:775:3: ( rule__SiteState__Group__0 )
            {
             before(grammarAccess.getSiteStateAccess().getGroup()); 
            // InternalReactionRules.g:776:3: ( rule__SiteState__Group__0 )
            // InternalReactionRules.g:776:4: rule__SiteState__Group__0
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
    // InternalReactionRules.g:785:1: entryRuleLinkState : ruleLinkState EOF ;
    public final void entryRuleLinkState() throws RecognitionException {
        try {
            // InternalReactionRules.g:786:1: ( ruleLinkState EOF )
            // InternalReactionRules.g:787:1: ruleLinkState EOF
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
    // InternalReactionRules.g:794:1: ruleLinkState : ( ( rule__LinkState__Group__0 ) ) ;
    public final void ruleLinkState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:798:2: ( ( ( rule__LinkState__Group__0 ) ) )
            // InternalReactionRules.g:799:2: ( ( rule__LinkState__Group__0 ) )
            {
            // InternalReactionRules.g:799:2: ( ( rule__LinkState__Group__0 ) )
            // InternalReactionRules.g:800:3: ( rule__LinkState__Group__0 )
            {
             before(grammarAccess.getLinkStateAccess().getGroup()); 
            // InternalReactionRules.g:801:3: ( rule__LinkState__Group__0 )
            // InternalReactionRules.g:801:4: rule__LinkState__Group__0
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
    // InternalReactionRules.g:810:1: entryRuleMultiLinkState : ruleMultiLinkState EOF ;
    public final void entryRuleMultiLinkState() throws RecognitionException {
        try {
            // InternalReactionRules.g:811:1: ( ruleMultiLinkState EOF )
            // InternalReactionRules.g:812:1: ruleMultiLinkState EOF
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
    // InternalReactionRules.g:819:1: ruleMultiLinkState : ( ( rule__MultiLinkState__Group__0 ) ) ;
    public final void ruleMultiLinkState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:823:2: ( ( ( rule__MultiLinkState__Group__0 ) ) )
            // InternalReactionRules.g:824:2: ( ( rule__MultiLinkState__Group__0 ) )
            {
            // InternalReactionRules.g:824:2: ( ( rule__MultiLinkState__Group__0 ) )
            // InternalReactionRules.g:825:3: ( rule__MultiLinkState__Group__0 )
            {
             before(grammarAccess.getMultiLinkStateAccess().getGroup()); 
            // InternalReactionRules.g:826:3: ( rule__MultiLinkState__Group__0 )
            // InternalReactionRules.g:826:4: rule__MultiLinkState__Group__0
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
    // InternalReactionRules.g:835:1: entryRuleSingleSitePattern : ruleSingleSitePattern EOF ;
    public final void entryRuleSingleSitePattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:836:1: ( ruleSingleSitePattern EOF )
            // InternalReactionRules.g:837:1: ruleSingleSitePattern EOF
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
    // InternalReactionRules.g:844:1: ruleSingleSitePattern : ( ( rule__SingleSitePattern__Group__0 ) ) ;
    public final void ruleSingleSitePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:848:2: ( ( ( rule__SingleSitePattern__Group__0 ) ) )
            // InternalReactionRules.g:849:2: ( ( rule__SingleSitePattern__Group__0 ) )
            {
            // InternalReactionRules.g:849:2: ( ( rule__SingleSitePattern__Group__0 ) )
            // InternalReactionRules.g:850:3: ( rule__SingleSitePattern__Group__0 )
            {
             before(grammarAccess.getSingleSitePatternAccess().getGroup()); 
            // InternalReactionRules.g:851:3: ( rule__SingleSitePattern__Group__0 )
            // InternalReactionRules.g:851:4: rule__SingleSitePattern__Group__0
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
    // InternalReactionRules.g:860:1: entryRuleMultiLinkSitePattern : ruleMultiLinkSitePattern EOF ;
    public final void entryRuleMultiLinkSitePattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:861:1: ( ruleMultiLinkSitePattern EOF )
            // InternalReactionRules.g:862:1: ruleMultiLinkSitePattern EOF
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
    // InternalReactionRules.g:869:1: ruleMultiLinkSitePattern : ( ( rule__MultiLinkSitePattern__Group__0 ) ) ;
    public final void ruleMultiLinkSitePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:873:2: ( ( ( rule__MultiLinkSitePattern__Group__0 ) ) )
            // InternalReactionRules.g:874:2: ( ( rule__MultiLinkSitePattern__Group__0 ) )
            {
            // InternalReactionRules.g:874:2: ( ( rule__MultiLinkSitePattern__Group__0 ) )
            // InternalReactionRules.g:875:3: ( rule__MultiLinkSitePattern__Group__0 )
            {
             before(grammarAccess.getMultiLinkSitePatternAccess().getGroup()); 
            // InternalReactionRules.g:876:3: ( rule__MultiLinkSitePattern__Group__0 )
            // InternalReactionRules.g:876:4: rule__MultiLinkSitePattern__Group__0
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
    // InternalReactionRules.g:885:1: entryRuleSitePattern : ruleSitePattern EOF ;
    public final void entryRuleSitePattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:886:1: ( ruleSitePattern EOF )
            // InternalReactionRules.g:887:1: ruleSitePattern EOF
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
    // InternalReactionRules.g:894:1: ruleSitePattern : ( ( rule__SitePattern__Alternatives ) ) ;
    public final void ruleSitePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:898:2: ( ( ( rule__SitePattern__Alternatives ) ) )
            // InternalReactionRules.g:899:2: ( ( rule__SitePattern__Alternatives ) )
            {
            // InternalReactionRules.g:899:2: ( ( rule__SitePattern__Alternatives ) )
            // InternalReactionRules.g:900:3: ( rule__SitePattern__Alternatives )
            {
             before(grammarAccess.getSitePatternAccess().getAlternatives()); 
            // InternalReactionRules.g:901:3: ( rule__SitePattern__Alternatives )
            // InternalReactionRules.g:901:4: rule__SitePattern__Alternatives
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
    // InternalReactionRules.g:910:1: entryRuleSitePatterns : ruleSitePatterns EOF ;
    public final void entryRuleSitePatterns() throws RecognitionException {
        try {
            // InternalReactionRules.g:911:1: ( ruleSitePatterns EOF )
            // InternalReactionRules.g:912:1: ruleSitePatterns EOF
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
    // InternalReactionRules.g:919:1: ruleSitePatterns : ( ( rule__SitePatterns__Group__0 ) ) ;
    public final void ruleSitePatterns() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:923:2: ( ( ( rule__SitePatterns__Group__0 ) ) )
            // InternalReactionRules.g:924:2: ( ( rule__SitePatterns__Group__0 ) )
            {
            // InternalReactionRules.g:924:2: ( ( rule__SitePatterns__Group__0 ) )
            // InternalReactionRules.g:925:3: ( rule__SitePatterns__Group__0 )
            {
             before(grammarAccess.getSitePatternsAccess().getGroup()); 
            // InternalReactionRules.g:926:3: ( rule__SitePatterns__Group__0 )
            // InternalReactionRules.g:926:4: rule__SitePatterns__Group__0
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
    // InternalReactionRules.g:935:1: entryRuleValidAgentPattern : ruleValidAgentPattern EOF ;
    public final void entryRuleValidAgentPattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:936:1: ( ruleValidAgentPattern EOF )
            // InternalReactionRules.g:937:1: ruleValidAgentPattern EOF
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
    // InternalReactionRules.g:944:1: ruleValidAgentPattern : ( ( rule__ValidAgentPattern__Group__0 ) ) ;
    public final void ruleValidAgentPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:948:2: ( ( ( rule__ValidAgentPattern__Group__0 ) ) )
            // InternalReactionRules.g:949:2: ( ( rule__ValidAgentPattern__Group__0 ) )
            {
            // InternalReactionRules.g:949:2: ( ( rule__ValidAgentPattern__Group__0 ) )
            // InternalReactionRules.g:950:3: ( rule__ValidAgentPattern__Group__0 )
            {
             before(grammarAccess.getValidAgentPatternAccess().getGroup()); 
            // InternalReactionRules.g:951:3: ( rule__ValidAgentPattern__Group__0 )
            // InternalReactionRules.g:951:4: rule__ValidAgentPattern__Group__0
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
    // InternalReactionRules.g:960:1: entryRuleVoidAgentPattern : ruleVoidAgentPattern EOF ;
    public final void entryRuleVoidAgentPattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:961:1: ( ruleVoidAgentPattern EOF )
            // InternalReactionRules.g:962:1: ruleVoidAgentPattern EOF
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
    // InternalReactionRules.g:969:1: ruleVoidAgentPattern : ( ( rule__VoidAgentPattern__PatternAssignment ) ) ;
    public final void ruleVoidAgentPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:973:2: ( ( ( rule__VoidAgentPattern__PatternAssignment ) ) )
            // InternalReactionRules.g:974:2: ( ( rule__VoidAgentPattern__PatternAssignment ) )
            {
            // InternalReactionRules.g:974:2: ( ( rule__VoidAgentPattern__PatternAssignment ) )
            // InternalReactionRules.g:975:3: ( rule__VoidAgentPattern__PatternAssignment )
            {
             before(grammarAccess.getVoidAgentPatternAccess().getPatternAssignment()); 
            // InternalReactionRules.g:976:3: ( rule__VoidAgentPattern__PatternAssignment )
            // InternalReactionRules.g:976:4: rule__VoidAgentPattern__PatternAssignment
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
    // InternalReactionRules.g:985:1: entryRuleAgentPattern : ruleAgentPattern EOF ;
    public final void entryRuleAgentPattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:986:1: ( ruleAgentPattern EOF )
            // InternalReactionRules.g:987:1: ruleAgentPattern EOF
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
    // InternalReactionRules.g:994:1: ruleAgentPattern : ( ( rule__AgentPattern__Alternatives ) ) ;
    public final void ruleAgentPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:998:2: ( ( ( rule__AgentPattern__Alternatives ) ) )
            // InternalReactionRules.g:999:2: ( ( rule__AgentPattern__Alternatives ) )
            {
            // InternalReactionRules.g:999:2: ( ( rule__AgentPattern__Alternatives ) )
            // InternalReactionRules.g:1000:3: ( rule__AgentPattern__Alternatives )
            {
             before(grammarAccess.getAgentPatternAccess().getAlternatives()); 
            // InternalReactionRules.g:1001:3: ( rule__AgentPattern__Alternatives )
            // InternalReactionRules.g:1001:4: rule__AgentPattern__Alternatives
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
    // InternalReactionRules.g:1010:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:1011:1: ( rulePattern EOF )
            // InternalReactionRules.g:1012:1: rulePattern EOF
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
    // InternalReactionRules.g:1019:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1023:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalReactionRules.g:1024:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalReactionRules.g:1024:2: ( ( rule__Pattern__Group__0 ) )
            // InternalReactionRules.g:1025:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalReactionRules.g:1026:3: ( rule__Pattern__Group__0 )
            // InternalReactionRules.g:1026:4: rule__Pattern__Group__0
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
    // InternalReactionRules.g:1035:1: entryRuleObservation : ruleObservation EOF ;
    public final void entryRuleObservation() throws RecognitionException {
        try {
            // InternalReactionRules.g:1036:1: ( ruleObservation EOF )
            // InternalReactionRules.g:1037:1: ruleObservation EOF
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
    // InternalReactionRules.g:1044:1: ruleObservation : ( ( rule__Observation__Group__0 ) ) ;
    public final void ruleObservation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1048:2: ( ( ( rule__Observation__Group__0 ) ) )
            // InternalReactionRules.g:1049:2: ( ( rule__Observation__Group__0 ) )
            {
            // InternalReactionRules.g:1049:2: ( ( rule__Observation__Group__0 ) )
            // InternalReactionRules.g:1050:3: ( rule__Observation__Group__0 )
            {
             before(grammarAccess.getObservationAccess().getGroup()); 
            // InternalReactionRules.g:1051:3: ( rule__Observation__Group__0 )
            // InternalReactionRules.g:1051:4: rule__Observation__Group__0
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
    // InternalReactionRules.g:1060:1: entryRuleNumericFromLiteral : ruleNumericFromLiteral EOF ;
    public final void entryRuleNumericFromLiteral() throws RecognitionException {
        try {
            // InternalReactionRules.g:1061:1: ( ruleNumericFromLiteral EOF )
            // InternalReactionRules.g:1062:1: ruleNumericFromLiteral EOF
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
    // InternalReactionRules.g:1069:1: ruleNumericFromLiteral : ( ( rule__NumericFromLiteral__ValueAssignment ) ) ;
    public final void ruleNumericFromLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1073:2: ( ( ( rule__NumericFromLiteral__ValueAssignment ) ) )
            // InternalReactionRules.g:1074:2: ( ( rule__NumericFromLiteral__ValueAssignment ) )
            {
            // InternalReactionRules.g:1074:2: ( ( rule__NumericFromLiteral__ValueAssignment ) )
            // InternalReactionRules.g:1075:3: ( rule__NumericFromLiteral__ValueAssignment )
            {
             before(grammarAccess.getNumericFromLiteralAccess().getValueAssignment()); 
            // InternalReactionRules.g:1076:3: ( rule__NumericFromLiteral__ValueAssignment )
            // InternalReactionRules.g:1076:4: rule__NumericFromLiteral__ValueAssignment
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
    // InternalReactionRules.g:1085:1: entryRuleNumericFromVariable : ruleNumericFromVariable EOF ;
    public final void entryRuleNumericFromVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:1086:1: ( ruleNumericFromVariable EOF )
            // InternalReactionRules.g:1087:1: ruleNumericFromVariable EOF
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
    // InternalReactionRules.g:1094:1: ruleNumericFromVariable : ( ( rule__NumericFromVariable__ValueVarAssignment ) ) ;
    public final void ruleNumericFromVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1098:2: ( ( ( rule__NumericFromVariable__ValueVarAssignment ) ) )
            // InternalReactionRules.g:1099:2: ( ( rule__NumericFromVariable__ValueVarAssignment ) )
            {
            // InternalReactionRules.g:1099:2: ( ( rule__NumericFromVariable__ValueVarAssignment ) )
            // InternalReactionRules.g:1100:3: ( rule__NumericFromVariable__ValueVarAssignment )
            {
             before(grammarAccess.getNumericFromVariableAccess().getValueVarAssignment()); 
            // InternalReactionRules.g:1101:3: ( rule__NumericFromVariable__ValueVarAssignment )
            // InternalReactionRules.g:1101:4: rule__NumericFromVariable__ValueVarAssignment
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
    // InternalReactionRules.g:1110:1: entryRuleNumericAssignment : ruleNumericAssignment EOF ;
    public final void entryRuleNumericAssignment() throws RecognitionException {
        try {
            // InternalReactionRules.g:1111:1: ( ruleNumericAssignment EOF )
            // InternalReactionRules.g:1112:1: ruleNumericAssignment EOF
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
    // InternalReactionRules.g:1119:1: ruleNumericAssignment : ( ( rule__NumericAssignment__Alternatives ) ) ;
    public final void ruleNumericAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1123:2: ( ( ( rule__NumericAssignment__Alternatives ) ) )
            // InternalReactionRules.g:1124:2: ( ( rule__NumericAssignment__Alternatives ) )
            {
            // InternalReactionRules.g:1124:2: ( ( rule__NumericAssignment__Alternatives ) )
            // InternalReactionRules.g:1125:3: ( rule__NumericAssignment__Alternatives )
            {
             before(grammarAccess.getNumericAssignmentAccess().getAlternatives()); 
            // InternalReactionRules.g:1126:3: ( rule__NumericAssignment__Alternatives )
            // InternalReactionRules.g:1126:4: rule__NumericAssignment__Alternatives
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
    // InternalReactionRules.g:1135:1: entryRuleInitial : ruleInitial EOF ;
    public final void entryRuleInitial() throws RecognitionException {
        try {
            // InternalReactionRules.g:1136:1: ( ruleInitial EOF )
            // InternalReactionRules.g:1137:1: ruleInitial EOF
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
    // InternalReactionRules.g:1144:1: ruleInitial : ( ( rule__Initial__Group__0 ) ) ;
    public final void ruleInitial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1148:2: ( ( ( rule__Initial__Group__0 ) ) )
            // InternalReactionRules.g:1149:2: ( ( rule__Initial__Group__0 ) )
            {
            // InternalReactionRules.g:1149:2: ( ( rule__Initial__Group__0 ) )
            // InternalReactionRules.g:1150:3: ( rule__Initial__Group__0 )
            {
             before(grammarAccess.getInitialAccess().getGroup()); 
            // InternalReactionRules.g:1151:3: ( rule__Initial__Group__0 )
            // InternalReactionRules.g:1151:4: rule__Initial__Group__0
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
    // InternalReactionRules.g:1160:1: entryRuleAssignFromPattern : ruleAssignFromPattern EOF ;
    public final void entryRuleAssignFromPattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:1161:1: ( ruleAssignFromPattern EOF )
            // InternalReactionRules.g:1162:1: ruleAssignFromPattern EOF
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
    // InternalReactionRules.g:1169:1: ruleAssignFromPattern : ( ( rule__AssignFromPattern__PatternAssignment ) ) ;
    public final void ruleAssignFromPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1173:2: ( ( ( rule__AssignFromPattern__PatternAssignment ) ) )
            // InternalReactionRules.g:1174:2: ( ( rule__AssignFromPattern__PatternAssignment ) )
            {
            // InternalReactionRules.g:1174:2: ( ( rule__AssignFromPattern__PatternAssignment ) )
            // InternalReactionRules.g:1175:3: ( rule__AssignFromPattern__PatternAssignment )
            {
             before(grammarAccess.getAssignFromPatternAccess().getPatternAssignment()); 
            // InternalReactionRules.g:1176:3: ( rule__AssignFromPattern__PatternAssignment )
            // InternalReactionRules.g:1176:4: rule__AssignFromPattern__PatternAssignment
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
    // InternalReactionRules.g:1185:1: entryRuleAssignFromVariable : ruleAssignFromVariable EOF ;
    public final void entryRuleAssignFromVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:1186:1: ( ruleAssignFromVariable EOF )
            // InternalReactionRules.g:1187:1: ruleAssignFromVariable EOF
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
    // InternalReactionRules.g:1194:1: ruleAssignFromVariable : ( ( rule__AssignFromVariable__PatternVarAssignment ) ) ;
    public final void ruleAssignFromVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1198:2: ( ( ( rule__AssignFromVariable__PatternVarAssignment ) ) )
            // InternalReactionRules.g:1199:2: ( ( rule__AssignFromVariable__PatternVarAssignment ) )
            {
            // InternalReactionRules.g:1199:2: ( ( rule__AssignFromVariable__PatternVarAssignment ) )
            // InternalReactionRules.g:1200:3: ( rule__AssignFromVariable__PatternVarAssignment )
            {
             before(grammarAccess.getAssignFromVariableAccess().getPatternVarAssignment()); 
            // InternalReactionRules.g:1201:3: ( rule__AssignFromVariable__PatternVarAssignment )
            // InternalReactionRules.g:1201:4: rule__AssignFromVariable__PatternVarAssignment
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
    // InternalReactionRules.g:1210:1: entryRulePatternAssignment : rulePatternAssignment EOF ;
    public final void entryRulePatternAssignment() throws RecognitionException {
        try {
            // InternalReactionRules.g:1211:1: ( rulePatternAssignment EOF )
            // InternalReactionRules.g:1212:1: rulePatternAssignment EOF
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
    // InternalReactionRules.g:1219:1: rulePatternAssignment : ( ( rule__PatternAssignment__Alternatives ) ) ;
    public final void rulePatternAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1223:2: ( ( ( rule__PatternAssignment__Alternatives ) ) )
            // InternalReactionRules.g:1224:2: ( ( rule__PatternAssignment__Alternatives ) )
            {
            // InternalReactionRules.g:1224:2: ( ( rule__PatternAssignment__Alternatives ) )
            // InternalReactionRules.g:1225:3: ( rule__PatternAssignment__Alternatives )
            {
             before(grammarAccess.getPatternAssignmentAccess().getAlternatives()); 
            // InternalReactionRules.g:1226:3: ( rule__PatternAssignment__Alternatives )
            // InternalReactionRules.g:1226:4: rule__PatternAssignment__Alternatives
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
    // InternalReactionRules.g:1235:1: entryRuleRuleVariables : ruleRuleVariables EOF ;
    public final void entryRuleRuleVariables() throws RecognitionException {
        try {
            // InternalReactionRules.g:1236:1: ( ruleRuleVariables EOF )
            // InternalReactionRules.g:1237:1: ruleRuleVariables EOF
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
    // InternalReactionRules.g:1244:1: ruleRuleVariables : ( ( rule__RuleVariables__Group__0 ) ) ;
    public final void ruleRuleVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1248:2: ( ( ( rule__RuleVariables__Group__0 ) ) )
            // InternalReactionRules.g:1249:2: ( ( rule__RuleVariables__Group__0 ) )
            {
            // InternalReactionRules.g:1249:2: ( ( rule__RuleVariables__Group__0 ) )
            // InternalReactionRules.g:1250:3: ( rule__RuleVariables__Group__0 )
            {
             before(grammarAccess.getRuleVariablesAccess().getGroup()); 
            // InternalReactionRules.g:1251:3: ( rule__RuleVariables__Group__0 )
            // InternalReactionRules.g:1251:4: rule__RuleVariables__Group__0
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
    // InternalReactionRules.g:1260:1: entryRuleUnidirectionalRule : ruleUnidirectionalRule EOF ;
    public final void entryRuleUnidirectionalRule() throws RecognitionException {
        try {
            // InternalReactionRules.g:1261:1: ( ruleUnidirectionalRule EOF )
            // InternalReactionRules.g:1262:1: ruleUnidirectionalRule EOF
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
    // InternalReactionRules.g:1269:1: ruleUnidirectionalRule : ( ( rule__UnidirectionalRule__Group__0 ) ) ;
    public final void ruleUnidirectionalRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1273:2: ( ( ( rule__UnidirectionalRule__Group__0 ) ) )
            // InternalReactionRules.g:1274:2: ( ( rule__UnidirectionalRule__Group__0 ) )
            {
            // InternalReactionRules.g:1274:2: ( ( rule__UnidirectionalRule__Group__0 ) )
            // InternalReactionRules.g:1275:3: ( rule__UnidirectionalRule__Group__0 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getGroup()); 
            // InternalReactionRules.g:1276:3: ( rule__UnidirectionalRule__Group__0 )
            // InternalReactionRules.g:1276:4: rule__UnidirectionalRule__Group__0
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
    // InternalReactionRules.g:1285:1: entryRuleBidirectionalRule : ruleBidirectionalRule EOF ;
    public final void entryRuleBidirectionalRule() throws RecognitionException {
        try {
            // InternalReactionRules.g:1286:1: ( ruleBidirectionalRule EOF )
            // InternalReactionRules.g:1287:1: ruleBidirectionalRule EOF
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
    // InternalReactionRules.g:1294:1: ruleBidirectionalRule : ( ( rule__BidirectionalRule__Group__0 ) ) ;
    public final void ruleBidirectionalRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1298:2: ( ( ( rule__BidirectionalRule__Group__0 ) ) )
            // InternalReactionRules.g:1299:2: ( ( rule__BidirectionalRule__Group__0 ) )
            {
            // InternalReactionRules.g:1299:2: ( ( rule__BidirectionalRule__Group__0 ) )
            // InternalReactionRules.g:1300:3: ( rule__BidirectionalRule__Group__0 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getGroup()); 
            // InternalReactionRules.g:1301:3: ( rule__BidirectionalRule__Group__0 )
            // InternalReactionRules.g:1301:4: rule__BidirectionalRule__Group__0
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
    // InternalReactionRules.g:1310:1: entryRuleRuleBody : ruleRuleBody EOF ;
    public final void entryRuleRuleBody() throws RecognitionException {
        try {
            // InternalReactionRules.g:1311:1: ( ruleRuleBody EOF )
            // InternalReactionRules.g:1312:1: ruleRuleBody EOF
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
    // InternalReactionRules.g:1319:1: ruleRuleBody : ( ( rule__RuleBody__Alternatives ) ) ;
    public final void ruleRuleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1323:2: ( ( ( rule__RuleBody__Alternatives ) ) )
            // InternalReactionRules.g:1324:2: ( ( rule__RuleBody__Alternatives ) )
            {
            // InternalReactionRules.g:1324:2: ( ( rule__RuleBody__Alternatives ) )
            // InternalReactionRules.g:1325:3: ( rule__RuleBody__Alternatives )
            {
             before(grammarAccess.getRuleBodyAccess().getAlternatives()); 
            // InternalReactionRules.g:1326:3: ( rule__RuleBody__Alternatives )
            // InternalReactionRules.g:1326:4: rule__RuleBody__Alternatives
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
    // InternalReactionRules.g:1335:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalReactionRules.g:1336:1: ( ruleRule EOF )
            // InternalReactionRules.g:1337:1: ruleRule EOF
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
    // InternalReactionRules.g:1344:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1348:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalReactionRules.g:1349:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalReactionRules.g:1349:2: ( ( rule__Rule__Group__0 ) )
            // InternalReactionRules.g:1350:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalReactionRules.g:1351:3: ( rule__Rule__Group__0 )
            // InternalReactionRules.g:1351:4: rule__Rule__Group__0
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
    // InternalReactionRules.g:1360:1: entryRuleIterations : ruleIterations EOF ;
    public final void entryRuleIterations() throws RecognitionException {
        try {
            // InternalReactionRules.g:1361:1: ( ruleIterations EOF )
            // InternalReactionRules.g:1362:1: ruleIterations EOF
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
    // InternalReactionRules.g:1369:1: ruleIterations : ( ( rule__Iterations__Group__0 ) ) ;
    public final void ruleIterations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1373:2: ( ( ( rule__Iterations__Group__0 ) ) )
            // InternalReactionRules.g:1374:2: ( ( rule__Iterations__Group__0 ) )
            {
            // InternalReactionRules.g:1374:2: ( ( rule__Iterations__Group__0 ) )
            // InternalReactionRules.g:1375:3: ( rule__Iterations__Group__0 )
            {
             before(grammarAccess.getIterationsAccess().getGroup()); 
            // InternalReactionRules.g:1376:3: ( rule__Iterations__Group__0 )
            // InternalReactionRules.g:1376:4: rule__Iterations__Group__0
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
    // InternalReactionRules.g:1385:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // InternalReactionRules.g:1386:1: ( ruleTime EOF )
            // InternalReactionRules.g:1387:1: ruleTime EOF
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
    // InternalReactionRules.g:1394:1: ruleTime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1398:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalReactionRules.g:1399:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalReactionRules.g:1399:2: ( ( rule__Time__Group__0 ) )
            // InternalReactionRules.g:1400:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup()); 
            // InternalReactionRules.g:1401:3: ( rule__Time__Group__0 )
            // InternalReactionRules.g:1401:4: rule__Time__Group__0
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
    // InternalReactionRules.g:1410:1: entryRulePopulation : rulePopulation EOF ;
    public final void entryRulePopulation() throws RecognitionException {
        try {
            // InternalReactionRules.g:1411:1: ( rulePopulation EOF )
            // InternalReactionRules.g:1412:1: rulePopulation EOF
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
    // InternalReactionRules.g:1419:1: rulePopulation : ( ( rule__Population__Group__0 ) ) ;
    public final void rulePopulation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1423:2: ( ( ( rule__Population__Group__0 ) ) )
            // InternalReactionRules.g:1424:2: ( ( rule__Population__Group__0 ) )
            {
            // InternalReactionRules.g:1424:2: ( ( rule__Population__Group__0 ) )
            // InternalReactionRules.g:1425:3: ( rule__Population__Group__0 )
            {
             before(grammarAccess.getPopulationAccess().getGroup()); 
            // InternalReactionRules.g:1426:3: ( rule__Population__Group__0 )
            // InternalReactionRules.g:1426:4: rule__Population__Group__0
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
    // InternalReactionRules.g:1435:1: entryRuleTerminationCondition : ruleTerminationCondition EOF ;
    public final void entryRuleTerminationCondition() throws RecognitionException {
        try {
            // InternalReactionRules.g:1436:1: ( ruleTerminationCondition EOF )
            // InternalReactionRules.g:1437:1: ruleTerminationCondition EOF
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
    // InternalReactionRules.g:1444:1: ruleTerminationCondition : ( ( rule__TerminationCondition__Alternatives ) ) ;
    public final void ruleTerminationCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1448:2: ( ( ( rule__TerminationCondition__Alternatives ) ) )
            // InternalReactionRules.g:1449:2: ( ( rule__TerminationCondition__Alternatives ) )
            {
            // InternalReactionRules.g:1449:2: ( ( rule__TerminationCondition__Alternatives ) )
            // InternalReactionRules.g:1450:3: ( rule__TerminationCondition__Alternatives )
            {
             before(grammarAccess.getTerminationConditionAccess().getAlternatives()); 
            // InternalReactionRules.g:1451:3: ( rule__TerminationCondition__Alternatives )
            // InternalReactionRules.g:1451:4: rule__TerminationCondition__Alternatives
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
    // InternalReactionRules.g:1460:1: entryRuleTerminate : ruleTerminate EOF ;
    public final void entryRuleTerminate() throws RecognitionException {
        try {
            // InternalReactionRules.g:1461:1: ( ruleTerminate EOF )
            // InternalReactionRules.g:1462:1: ruleTerminate EOF
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
    // InternalReactionRules.g:1469:1: ruleTerminate : ( ( rule__Terminate__Group__0 ) ) ;
    public final void ruleTerminate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1473:2: ( ( ( rule__Terminate__Group__0 ) ) )
            // InternalReactionRules.g:1474:2: ( ( rule__Terminate__Group__0 ) )
            {
            // InternalReactionRules.g:1474:2: ( ( rule__Terminate__Group__0 ) )
            // InternalReactionRules.g:1475:3: ( rule__Terminate__Group__0 )
            {
             before(grammarAccess.getTerminateAccess().getGroup()); 
            // InternalReactionRules.g:1476:3: ( rule__Terminate__Group__0 )
            // InternalReactionRules.g:1476:4: rule__Terminate__Group__0
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
    // InternalReactionRules.g:1484:1: rule__ReactionProperty__Alternatives : ( ( ruleAgent ) | ( ruleVariable ) | ( ruleObservation ) | ( ruleInitial ) | ( ruleRule ) | ( ruleTerminate ) );
    public final void rule__ReactionProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1488:1: ( ( ruleAgent ) | ( ruleVariable ) | ( ruleObservation ) | ( ruleInitial ) | ( ruleRule ) | ( ruleTerminate ) )
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
                    // InternalReactionRules.g:1489:2: ( ruleAgent )
                    {
                    // InternalReactionRules.g:1489:2: ( ruleAgent )
                    // InternalReactionRules.g:1490:3: ruleAgent
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
                    // InternalReactionRules.g:1495:2: ( ruleVariable )
                    {
                    // InternalReactionRules.g:1495:2: ( ruleVariable )
                    // InternalReactionRules.g:1496:3: ruleVariable
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
                    // InternalReactionRules.g:1501:2: ( ruleObservation )
                    {
                    // InternalReactionRules.g:1501:2: ( ruleObservation )
                    // InternalReactionRules.g:1502:3: ruleObservation
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
                    // InternalReactionRules.g:1507:2: ( ruleInitial )
                    {
                    // InternalReactionRules.g:1507:2: ( ruleInitial )
                    // InternalReactionRules.g:1508:3: ruleInitial
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
                    // InternalReactionRules.g:1513:2: ( ruleRule )
                    {
                    // InternalReactionRules.g:1513:2: ( ruleRule )
                    // InternalReactionRules.g:1514:3: ruleRule
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
                    // InternalReactionRules.g:1519:2: ( ruleTerminate )
                    {
                    // InternalReactionRules.g:1519:2: ( ruleTerminate )
                    // InternalReactionRules.g:1520:3: ruleTerminate
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
    // InternalReactionRules.g:1529:1: rule__ScientificFloat__Alternatives_5 : ( ( '-' ) | ( '+' ) );
    public final void rule__ScientificFloat__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1533:1: ( ( '-' ) | ( '+' ) )
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
                    // InternalReactionRules.g:1534:2: ( '-' )
                    {
                    // InternalReactionRules.g:1534:2: ( '-' )
                    // InternalReactionRules.g:1535:3: '-'
                    {
                     before(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_5_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1540:2: ( '+' )
                    {
                    // InternalReactionRules.g:1540:2: ( '+' )
                    // InternalReactionRules.g:1541:3: '+'
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
    // InternalReactionRules.g:1550:1: rule__ArithmeticType__Alternatives : ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) );
    public final void rule__ArithmeticType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1554:1: ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalReactionRules.g:1555:2: ( ruleFloat )
                    {
                    // InternalReactionRules.g:1555:2: ( ruleFloat )
                    // InternalReactionRules.g:1556:3: ruleFloat
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
                    // InternalReactionRules.g:1561:2: ( ruleUnsignedInteger )
                    {
                    // InternalReactionRules.g:1561:2: ( ruleUnsignedInteger )
                    // InternalReactionRules.g:1562:3: ruleUnsignedInteger
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
                    // InternalReactionRules.g:1567:2: ( ruleSignedInteger )
                    {
                    // InternalReactionRules.g:1567:2: ( ruleSignedInteger )
                    // InternalReactionRules.g:1568:3: ruleSignedInteger
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
                    // InternalReactionRules.g:1573:2: ( ruleScientificFloat )
                    {
                    // InternalReactionRules.g:1573:2: ( ruleScientificFloat )
                    // InternalReactionRules.g:1574:3: ruleScientificFloat
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
    // InternalReactionRules.g:1583:1: rule__Site__Alternatives : ( ( ruleSingleSite ) | ( ruleMultiSite ) );
    public final void rule__Site__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1587:1: ( ( ruleSingleSite ) | ( ruleMultiSite ) )
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
                    // InternalReactionRules.g:1588:2: ( ruleSingleSite )
                    {
                    // InternalReactionRules.g:1588:2: ( ruleSingleSite )
                    // InternalReactionRules.g:1589:3: ruleSingleSite
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
                    // InternalReactionRules.g:1594:2: ( ruleMultiSite )
                    {
                    // InternalReactionRules.g:1594:2: ( ruleMultiSite )
                    // InternalReactionRules.g:1595:3: ruleMultiSite
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
    // InternalReactionRules.g:1604:1: rule__Variable__Alternatives : ( ( rulePatternVariable ) | ( ruleArithmeticVariable ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1608:1: ( ( rulePatternVariable ) | ( ruleArithmeticVariable ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==31) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==RULE_INT||LA5_3==19) ) {
                            alt5=2;
                        }
                        else if ( (LA5_3==23) ) {
                            alt5=1;
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
                    // InternalReactionRules.g:1609:2: ( rulePatternVariable )
                    {
                    // InternalReactionRules.g:1609:2: ( rulePatternVariable )
                    // InternalReactionRules.g:1610:3: rulePatternVariable
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
                    // InternalReactionRules.g:1615:2: ( ruleArithmeticVariable )
                    {
                    // InternalReactionRules.g:1615:2: ( ruleArithmeticVariable )
                    // InternalReactionRules.g:1616:3: ruleArithmeticVariable
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
    // InternalReactionRules.g:1625:1: rule__MultiLink__StatesAlternatives_1_0_0 : ( ( ruleBoundLink ) | ( ruleFreeLink ) );
    public final void rule__MultiLink__StatesAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1629:1: ( ( ruleBoundLink ) | ( ruleFreeLink ) )
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
                    // InternalReactionRules.g:1630:2: ( ruleBoundLink )
                    {
                    // InternalReactionRules.g:1630:2: ( ruleBoundLink )
                    // InternalReactionRules.g:1631:3: ruleBoundLink
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
                    // InternalReactionRules.g:1636:2: ( ruleFreeLink )
                    {
                    // InternalReactionRules.g:1636:2: ( ruleFreeLink )
                    // InternalReactionRules.g:1637:3: ruleFreeLink
                    {
                     before(grammarAccess.getMultiLinkAccess().getStatesFreeLinkParserRuleCall_1_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFreeLink();

                    state._fsp--;

                     after(grammarAccess.getMultiLinkAccess().getStatesFreeLinkParserRuleCall_1_0_0_1()); 

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
    // InternalReactionRules.g:1646:1: rule__MultiLink__StatesAlternatives_1_1_1_0 : ( ( ruleBoundLink ) | ( ruleFreeLink ) );
    public final void rule__MultiLink__StatesAlternatives_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1650:1: ( ( ruleBoundLink ) | ( ruleFreeLink ) )
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
                    // InternalReactionRules.g:1651:2: ( ruleBoundLink )
                    {
                    // InternalReactionRules.g:1651:2: ( ruleBoundLink )
                    // InternalReactionRules.g:1652:3: ruleBoundLink
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
                    // InternalReactionRules.g:1657:2: ( ruleFreeLink )
                    {
                    // InternalReactionRules.g:1657:2: ( ruleFreeLink )
                    // InternalReactionRules.g:1658:3: ruleFreeLink
                    {
                     before(grammarAccess.getMultiLinkAccess().getStatesFreeLinkParserRuleCall_1_1_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFreeLink();

                    state._fsp--;

                     after(grammarAccess.getMultiLinkAccess().getStatesFreeLinkParserRuleCall_1_1_1_0_1()); 

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
    // InternalReactionRules.g:1667:1: rule__LinkState__LinkStateAlternatives_2_0 : ( ( ruleBoundAnyLink ) | ( ruleFreeLink ) | ( ruleBoundAnyOfTypeLink ) | ( ruleBoundLink ) | ( ruleWhatEver ) );
    public final void rule__LinkState__LinkStateAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1671:1: ( ( ruleBoundAnyLink ) | ( ruleFreeLink ) | ( ruleBoundAnyOfTypeLink ) | ( ruleBoundLink ) | ( ruleWhatEver ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case RULE_BOUND_LINK:
                {
                alt8=1;
                }
                break;
            case RULE_FREE_LINK:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            case RULE_INT:
                {
                alt8=4;
                }
                break;
            case RULE_WHATEVER_LINK:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalReactionRules.g:1672:2: ( ruleBoundAnyLink )
                    {
                    // InternalReactionRules.g:1672:2: ( ruleBoundAnyLink )
                    // InternalReactionRules.g:1673:3: ruleBoundAnyLink
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
                    // InternalReactionRules.g:1678:2: ( ruleFreeLink )
                    {
                    // InternalReactionRules.g:1678:2: ( ruleFreeLink )
                    // InternalReactionRules.g:1679:3: ruleFreeLink
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
                    // InternalReactionRules.g:1684:2: ( ruleBoundAnyOfTypeLink )
                    {
                    // InternalReactionRules.g:1684:2: ( ruleBoundAnyOfTypeLink )
                    // InternalReactionRules.g:1685:3: ruleBoundAnyOfTypeLink
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
                    // InternalReactionRules.g:1690:2: ( ruleBoundLink )
                    {
                    // InternalReactionRules.g:1690:2: ( ruleBoundLink )
                    // InternalReactionRules.g:1691:3: ruleBoundLink
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
                    // InternalReactionRules.g:1696:2: ( ruleWhatEver )
                    {
                    // InternalReactionRules.g:1696:2: ( ruleWhatEver )
                    // InternalReactionRules.g:1697:3: ruleWhatEver
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


    // $ANTLR start "rule__MultiLinkState__LinkStateAlternatives_2_0"
    // InternalReactionRules.g:1706:1: rule__MultiLinkState__LinkStateAlternatives_2_0 : ( ( ruleWhatEver ) | ( ruleFreeLink ) | ( ruleBoundAnyLink ) | ( ruleBoundLink ) | ( ruleMultiLink ) );
    public final void rule__MultiLinkState__LinkStateAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1710:1: ( ( ruleWhatEver ) | ( ruleFreeLink ) | ( ruleBoundAnyLink ) | ( ruleBoundLink ) | ( ruleMultiLink ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_WHATEVER_LINK:
                {
                alt9=1;
                }
                break;
            case RULE_FREE_LINK:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==33) ) {
                    alt9=2;
                }
                else if ( (LA9_2==25) ) {
                    alt9=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOUND_LINK:
                {
                alt9=3;
                }
                break;
            case RULE_INT:
                {
                int LA9_4 = input.LA(2);

                if ( (LA9_4==33) ) {
                    alt9=4;
                }
                else if ( (LA9_4==25) ) {
                    alt9=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalReactionRules.g:1711:2: ( ruleWhatEver )
                    {
                    // InternalReactionRules.g:1711:2: ( ruleWhatEver )
                    // InternalReactionRules.g:1712:3: ruleWhatEver
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
                    // InternalReactionRules.g:1717:2: ( ruleFreeLink )
                    {
                    // InternalReactionRules.g:1717:2: ( ruleFreeLink )
                    // InternalReactionRules.g:1718:3: ruleFreeLink
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
                    // InternalReactionRules.g:1723:2: ( ruleBoundAnyLink )
                    {
                    // InternalReactionRules.g:1723:2: ( ruleBoundAnyLink )
                    // InternalReactionRules.g:1724:3: ruleBoundAnyLink
                    {
                     before(grammarAccess.getMultiLinkStateAccess().getLinkStateBoundAnyLinkParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBoundAnyLink();

                    state._fsp--;

                     after(grammarAccess.getMultiLinkStateAccess().getLinkStateBoundAnyLinkParserRuleCall_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalReactionRules.g:1729:2: ( ruleBoundLink )
                    {
                    // InternalReactionRules.g:1729:2: ( ruleBoundLink )
                    // InternalReactionRules.g:1730:3: ruleBoundLink
                    {
                     before(grammarAccess.getMultiLinkStateAccess().getLinkStateBoundLinkParserRuleCall_2_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBoundLink();

                    state._fsp--;

                     after(grammarAccess.getMultiLinkStateAccess().getLinkStateBoundLinkParserRuleCall_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalReactionRules.g:1735:2: ( ruleMultiLink )
                    {
                    // InternalReactionRules.g:1735:2: ( ruleMultiLink )
                    // InternalReactionRules.g:1736:3: ruleMultiLink
                    {
                     before(grammarAccess.getMultiLinkStateAccess().getLinkStateMultiLinkParserRuleCall_2_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiLink();

                    state._fsp--;

                     after(grammarAccess.getMultiLinkStateAccess().getLinkStateMultiLinkParserRuleCall_2_0_4()); 

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
    // InternalReactionRules.g:1745:1: rule__SitePattern__Alternatives : ( ( ruleSingleSitePattern ) | ( ruleMultiLinkSitePattern ) );
    public final void rule__SitePattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1749:1: ( ( ruleSingleSitePattern ) | ( ruleMultiLinkSitePattern ) )
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
                    // InternalReactionRules.g:1750:2: ( ruleSingleSitePattern )
                    {
                    // InternalReactionRules.g:1750:2: ( ruleSingleSitePattern )
                    // InternalReactionRules.g:1751:3: ruleSingleSitePattern
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
                    // InternalReactionRules.g:1756:2: ( ruleMultiLinkSitePattern )
                    {
                    // InternalReactionRules.g:1756:2: ( ruleMultiLinkSitePattern )
                    // InternalReactionRules.g:1757:3: ruleMultiLinkSitePattern
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
    // InternalReactionRules.g:1766:1: rule__AgentPattern__Alternatives : ( ( ruleValidAgentPattern ) | ( ruleVoidAgentPattern ) );
    public final void rule__AgentPattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1770:1: ( ( ruleValidAgentPattern ) | ( ruleVoidAgentPattern ) )
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
                    // InternalReactionRules.g:1771:2: ( ruleValidAgentPattern )
                    {
                    // InternalReactionRules.g:1771:2: ( ruleValidAgentPattern )
                    // InternalReactionRules.g:1772:3: ruleValidAgentPattern
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
                    // InternalReactionRules.g:1777:2: ( ruleVoidAgentPattern )
                    {
                    // InternalReactionRules.g:1777:2: ( ruleVoidAgentPattern )
                    // InternalReactionRules.g:1778:3: ruleVoidAgentPattern
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
    // InternalReactionRules.g:1787:1: rule__NumericAssignment__Alternatives : ( ( ruleNumericFromLiteral ) | ( ruleNumericFromVariable ) );
    public final void rule__NumericAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1791:1: ( ( ruleNumericFromLiteral ) | ( ruleNumericFromVariable ) )
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
                    // InternalReactionRules.g:1792:2: ( ruleNumericFromLiteral )
                    {
                    // InternalReactionRules.g:1792:2: ( ruleNumericFromLiteral )
                    // InternalReactionRules.g:1793:3: ruleNumericFromLiteral
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
                    // InternalReactionRules.g:1798:2: ( ruleNumericFromVariable )
                    {
                    // InternalReactionRules.g:1798:2: ( ruleNumericFromVariable )
                    // InternalReactionRules.g:1799:3: ruleNumericFromVariable
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
    // InternalReactionRules.g:1808:1: rule__PatternAssignment__Alternatives : ( ( ruleAssignFromPattern ) | ( ruleAssignFromVariable ) );
    public final void rule__PatternAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1812:1: ( ( ruleAssignFromPattern ) | ( ruleAssignFromVariable ) )
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
                    // InternalReactionRules.g:1813:2: ( ruleAssignFromPattern )
                    {
                    // InternalReactionRules.g:1813:2: ( ruleAssignFromPattern )
                    // InternalReactionRules.g:1814:3: ruleAssignFromPattern
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
                    // InternalReactionRules.g:1819:2: ( ruleAssignFromVariable )
                    {
                    // InternalReactionRules.g:1819:2: ( ruleAssignFromVariable )
                    // InternalReactionRules.g:1820:3: ruleAssignFromVariable
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
    // InternalReactionRules.g:1829:1: rule__RuleBody__Alternatives : ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) );
    public final void rule__RuleBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1833:1: ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalReactionRules.g:1834:2: ( ruleUnidirectionalRule )
                    {
                    // InternalReactionRules.g:1834:2: ( ruleUnidirectionalRule )
                    // InternalReactionRules.g:1835:3: ruleUnidirectionalRule
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
                    // InternalReactionRules.g:1840:2: ( ruleBidirectionalRule )
                    {
                    // InternalReactionRules.g:1840:2: ( ruleBidirectionalRule )
                    // InternalReactionRules.g:1841:3: ruleBidirectionalRule
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
    // InternalReactionRules.g:1850:1: rule__TerminationCondition__Alternatives : ( ( ruleIterations ) | ( ruleTime ) | ( rulePopulation ) );
    public final void rule__TerminationCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1854:1: ( ( ruleIterations ) | ( ruleTime ) | ( rulePopulation ) )
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
                    // InternalReactionRules.g:1855:2: ( ruleIterations )
                    {
                    // InternalReactionRules.g:1855:2: ( ruleIterations )
                    // InternalReactionRules.g:1856:3: ruleIterations
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
                    // InternalReactionRules.g:1861:2: ( ruleTime )
                    {
                    // InternalReactionRules.g:1861:2: ( ruleTime )
                    // InternalReactionRules.g:1862:3: ruleTime
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
                    // InternalReactionRules.g:1867:2: ( rulePopulation )
                    {
                    // InternalReactionRules.g:1867:2: ( rulePopulation )
                    // InternalReactionRules.g:1868:3: rulePopulation
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
    // InternalReactionRules.g:1877:1: rule__ReactionRuleModel__Group__0 : rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1 ;
    public final void rule__ReactionRuleModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1881:1: ( rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1 )
            // InternalReactionRules.g:1882:2: rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1
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
    // InternalReactionRules.g:1889:1: rule__ReactionRuleModel__Group__0__Impl : ( ( rule__ReactionRuleModel__ModelAssignment_0 ) ) ;
    public final void rule__ReactionRuleModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1893:1: ( ( ( rule__ReactionRuleModel__ModelAssignment_0 ) ) )
            // InternalReactionRules.g:1894:1: ( ( rule__ReactionRuleModel__ModelAssignment_0 ) )
            {
            // InternalReactionRules.g:1894:1: ( ( rule__ReactionRuleModel__ModelAssignment_0 ) )
            // InternalReactionRules.g:1895:2: ( rule__ReactionRuleModel__ModelAssignment_0 )
            {
             before(grammarAccess.getReactionRuleModelAccess().getModelAssignment_0()); 
            // InternalReactionRules.g:1896:2: ( rule__ReactionRuleModel__ModelAssignment_0 )
            // InternalReactionRules.g:1896:3: rule__ReactionRuleModel__ModelAssignment_0
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
    // InternalReactionRules.g:1904:1: rule__ReactionRuleModel__Group__1 : rule__ReactionRuleModel__Group__1__Impl ;
    public final void rule__ReactionRuleModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1908:1: ( rule__ReactionRuleModel__Group__1__Impl )
            // InternalReactionRules.g:1909:2: rule__ReactionRuleModel__Group__1__Impl
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
    // InternalReactionRules.g:1915:1: rule__ReactionRuleModel__Group__1__Impl : ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )* ) ;
    public final void rule__ReactionRuleModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1919:1: ( ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )* ) )
            // InternalReactionRules.g:1920:1: ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )* )
            {
            // InternalReactionRules.g:1920:1: ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )* )
            // InternalReactionRules.g:1921:2: ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )*
            {
             before(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesAssignment_1()); 
            // InternalReactionRules.g:1922:2: ( rule__ReactionRuleModel__ReactionPropertiesAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=29 && LA16_0<=30)||(LA16_0>=35 && LA16_0<=37)||LA16_0==42) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalReactionRules.g:1922:3: rule__ReactionRuleModel__ReactionPropertiesAssignment_1
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
    // InternalReactionRules.g:1931:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1935:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalReactionRules.g:1936:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalReactionRules.g:1943:1: rule__Model__Group__0__Impl : ( 'ModelID' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1947:1: ( ( 'ModelID' ) )
            // InternalReactionRules.g:1948:1: ( 'ModelID' )
            {
            // InternalReactionRules.g:1948:1: ( 'ModelID' )
            // InternalReactionRules.g:1949:2: 'ModelID'
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
    // InternalReactionRules.g:1958:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1962:1: ( rule__Model__Group__1__Impl )
            // InternalReactionRules.g:1963:2: rule__Model__Group__1__Impl
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
    // InternalReactionRules.g:1969:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1973:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalReactionRules.g:1974:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:1974:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalReactionRules.g:1975:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:1976:2: ( rule__Model__NameAssignment_1 )
            // InternalReactionRules.g:1976:3: rule__Model__NameAssignment_1
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
    // InternalReactionRules.g:1985:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1989:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalReactionRules.g:1990:2: rule__Float__Group__0__Impl rule__Float__Group__1
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
    // InternalReactionRules.g:1997:1: rule__Float__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2001:1: ( ( ( '-' )? ) )
            // InternalReactionRules.g:2002:1: ( ( '-' )? )
            {
            // InternalReactionRules.g:2002:1: ( ( '-' )? )
            // InternalReactionRules.g:2003:2: ( '-' )?
            {
             before(grammarAccess.getFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalReactionRules.g:2004:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalReactionRules.g:2004:3: '-'
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
    // InternalReactionRules.g:2012:1: rule__Float__Group__1 : rule__Float__Group__1__Impl rule__Float__Group__2 ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2016:1: ( rule__Float__Group__1__Impl rule__Float__Group__2 )
            // InternalReactionRules.g:2017:2: rule__Float__Group__1__Impl rule__Float__Group__2
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
    // InternalReactionRules.g:2024:1: rule__Float__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2028:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2029:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2029:1: ( RULE_INT )
            // InternalReactionRules.g:2030:2: RULE_INT
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
    // InternalReactionRules.g:2039:1: rule__Float__Group__2 : rule__Float__Group__2__Impl rule__Float__Group__3 ;
    public final void rule__Float__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2043:1: ( rule__Float__Group__2__Impl rule__Float__Group__3 )
            // InternalReactionRules.g:2044:2: rule__Float__Group__2__Impl rule__Float__Group__3
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
    // InternalReactionRules.g:2051:1: rule__Float__Group__2__Impl : ( '.' ) ;
    public final void rule__Float__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2055:1: ( ( '.' ) )
            // InternalReactionRules.g:2056:1: ( '.' )
            {
            // InternalReactionRules.g:2056:1: ( '.' )
            // InternalReactionRules.g:2057:2: '.'
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
    // InternalReactionRules.g:2066:1: rule__Float__Group__3 : rule__Float__Group__3__Impl ;
    public final void rule__Float__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2070:1: ( rule__Float__Group__3__Impl )
            // InternalReactionRules.g:2071:2: rule__Float__Group__3__Impl
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
    // InternalReactionRules.g:2077:1: rule__Float__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2081:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2082:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2082:1: ( RULE_INT )
            // InternalReactionRules.g:2083:2: RULE_INT
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
    // InternalReactionRules.g:2093:1: rule__ScientificFloat__Group__0 : rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1 ;
    public final void rule__ScientificFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2097:1: ( rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1 )
            // InternalReactionRules.g:2098:2: rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1
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
    // InternalReactionRules.g:2105:1: rule__ScientificFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ScientificFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2109:1: ( ( ( '-' )? ) )
            // InternalReactionRules.g:2110:1: ( ( '-' )? )
            {
            // InternalReactionRules.g:2110:1: ( ( '-' )? )
            // InternalReactionRules.g:2111:2: ( '-' )?
            {
             before(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalReactionRules.g:2112:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalReactionRules.g:2112:3: '-'
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
    // InternalReactionRules.g:2120:1: rule__ScientificFloat__Group__1 : rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2 ;
    public final void rule__ScientificFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2124:1: ( rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2 )
            // InternalReactionRules.g:2125:2: rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2
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
    // InternalReactionRules.g:2132:1: rule__ScientificFloat__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2136:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2137:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2137:1: ( RULE_INT )
            // InternalReactionRules.g:2138:2: RULE_INT
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
    // InternalReactionRules.g:2147:1: rule__ScientificFloat__Group__2 : rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3 ;
    public final void rule__ScientificFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2151:1: ( rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3 )
            // InternalReactionRules.g:2152:2: rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3
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
    // InternalReactionRules.g:2159:1: rule__ScientificFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__ScientificFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2163:1: ( ( '.' ) )
            // InternalReactionRules.g:2164:1: ( '.' )
            {
            // InternalReactionRules.g:2164:1: ( '.' )
            // InternalReactionRules.g:2165:2: '.'
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
    // InternalReactionRules.g:2174:1: rule__ScientificFloat__Group__3 : rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4 ;
    public final void rule__ScientificFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2178:1: ( rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4 )
            // InternalReactionRules.g:2179:2: rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4
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
    // InternalReactionRules.g:2186:1: rule__ScientificFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2190:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2191:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2191:1: ( RULE_INT )
            // InternalReactionRules.g:2192:2: RULE_INT
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
    // InternalReactionRules.g:2201:1: rule__ScientificFloat__Group__4 : rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5 ;
    public final void rule__ScientificFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2205:1: ( rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5 )
            // InternalReactionRules.g:2206:2: rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5
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
    // InternalReactionRules.g:2213:1: rule__ScientificFloat__Group__4__Impl : ( RULE_EXPONENT ) ;
    public final void rule__ScientificFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2217:1: ( ( RULE_EXPONENT ) )
            // InternalReactionRules.g:2218:1: ( RULE_EXPONENT )
            {
            // InternalReactionRules.g:2218:1: ( RULE_EXPONENT )
            // InternalReactionRules.g:2219:2: RULE_EXPONENT
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
    // InternalReactionRules.g:2228:1: rule__ScientificFloat__Group__5 : rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6 ;
    public final void rule__ScientificFloat__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2232:1: ( rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6 )
            // InternalReactionRules.g:2233:2: rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6
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
    // InternalReactionRules.g:2240:1: rule__ScientificFloat__Group__5__Impl : ( ( rule__ScientificFloat__Alternatives_5 ) ) ;
    public final void rule__ScientificFloat__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2244:1: ( ( ( rule__ScientificFloat__Alternatives_5 ) ) )
            // InternalReactionRules.g:2245:1: ( ( rule__ScientificFloat__Alternatives_5 ) )
            {
            // InternalReactionRules.g:2245:1: ( ( rule__ScientificFloat__Alternatives_5 ) )
            // InternalReactionRules.g:2246:2: ( rule__ScientificFloat__Alternatives_5 )
            {
             before(grammarAccess.getScientificFloatAccess().getAlternatives_5()); 
            // InternalReactionRules.g:2247:2: ( rule__ScientificFloat__Alternatives_5 )
            // InternalReactionRules.g:2247:3: rule__ScientificFloat__Alternatives_5
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
    // InternalReactionRules.g:2255:1: rule__ScientificFloat__Group__6 : rule__ScientificFloat__Group__6__Impl ;
    public final void rule__ScientificFloat__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2259:1: ( rule__ScientificFloat__Group__6__Impl )
            // InternalReactionRules.g:2260:2: rule__ScientificFloat__Group__6__Impl
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
    // InternalReactionRules.g:2266:1: rule__ScientificFloat__Group__6__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2270:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2271:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2271:1: ( RULE_INT )
            // InternalReactionRules.g:2272:2: RULE_INT
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
    // InternalReactionRules.g:2282:1: rule__SignedInteger__Group__0 : rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 ;
    public final void rule__SignedInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2286:1: ( rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 )
            // InternalReactionRules.g:2287:2: rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1
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
    // InternalReactionRules.g:2294:1: rule__SignedInteger__Group__0__Impl : ( '-' ) ;
    public final void rule__SignedInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2298:1: ( ( '-' ) )
            // InternalReactionRules.g:2299:1: ( '-' )
            {
            // InternalReactionRules.g:2299:1: ( '-' )
            // InternalReactionRules.g:2300:2: '-'
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
    // InternalReactionRules.g:2309:1: rule__SignedInteger__Group__1 : rule__SignedInteger__Group__1__Impl ;
    public final void rule__SignedInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2313:1: ( rule__SignedInteger__Group__1__Impl )
            // InternalReactionRules.g:2314:2: rule__SignedInteger__Group__1__Impl
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
    // InternalReactionRules.g:2320:1: rule__SignedInteger__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__SignedInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2324:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2325:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2325:1: ( RULE_INT )
            // InternalReactionRules.g:2326:2: RULE_INT
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
    // InternalReactionRules.g:2336:1: rule__States__Group__0 : rule__States__Group__0__Impl rule__States__Group__1 ;
    public final void rule__States__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2340:1: ( rule__States__Group__0__Impl rule__States__Group__1 )
            // InternalReactionRules.g:2341:2: rule__States__Group__0__Impl rule__States__Group__1
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
    // InternalReactionRules.g:2348:1: rule__States__Group__0__Impl : ( () ) ;
    public final void rule__States__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2352:1: ( ( () ) )
            // InternalReactionRules.g:2353:1: ( () )
            {
            // InternalReactionRules.g:2353:1: ( () )
            // InternalReactionRules.g:2354:2: ()
            {
             before(grammarAccess.getStatesAccess().getStatesAction_0()); 
            // InternalReactionRules.g:2355:2: ()
            // InternalReactionRules.g:2355:3: 
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
    // InternalReactionRules.g:2363:1: rule__States__Group__1 : rule__States__Group__1__Impl ;
    public final void rule__States__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2367:1: ( rule__States__Group__1__Impl )
            // InternalReactionRules.g:2368:2: rule__States__Group__1__Impl
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
    // InternalReactionRules.g:2374:1: rule__States__Group__1__Impl : ( ( rule__States__Group_1__0 )? ) ;
    public final void rule__States__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2378:1: ( ( ( rule__States__Group_1__0 )? ) )
            // InternalReactionRules.g:2379:1: ( ( rule__States__Group_1__0 )? )
            {
            // InternalReactionRules.g:2379:1: ( ( rule__States__Group_1__0 )? )
            // InternalReactionRules.g:2380:2: ( rule__States__Group_1__0 )?
            {
             before(grammarAccess.getStatesAccess().getGroup_1()); 
            // InternalReactionRules.g:2381:2: ( rule__States__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalReactionRules.g:2381:3: rule__States__Group_1__0
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
    // InternalReactionRules.g:2390:1: rule__States__Group_1__0 : rule__States__Group_1__0__Impl rule__States__Group_1__1 ;
    public final void rule__States__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2394:1: ( rule__States__Group_1__0__Impl rule__States__Group_1__1 )
            // InternalReactionRules.g:2395:2: rule__States__Group_1__0__Impl rule__States__Group_1__1
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
    // InternalReactionRules.g:2402:1: rule__States__Group_1__0__Impl : ( '{' ) ;
    public final void rule__States__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2406:1: ( ( '{' ) )
            // InternalReactionRules.g:2407:1: ( '{' )
            {
            // InternalReactionRules.g:2407:1: ( '{' )
            // InternalReactionRules.g:2408:2: '{'
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
    // InternalReactionRules.g:2417:1: rule__States__Group_1__1 : rule__States__Group_1__1__Impl rule__States__Group_1__2 ;
    public final void rule__States__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2421:1: ( rule__States__Group_1__1__Impl rule__States__Group_1__2 )
            // InternalReactionRules.g:2422:2: rule__States__Group_1__1__Impl rule__States__Group_1__2
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
    // InternalReactionRules.g:2429:1: rule__States__Group_1__1__Impl : ( ( rule__States__StateAssignment_1_1 ) ) ;
    public final void rule__States__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2433:1: ( ( ( rule__States__StateAssignment_1_1 ) ) )
            // InternalReactionRules.g:2434:1: ( ( rule__States__StateAssignment_1_1 ) )
            {
            // InternalReactionRules.g:2434:1: ( ( rule__States__StateAssignment_1_1 ) )
            // InternalReactionRules.g:2435:2: ( rule__States__StateAssignment_1_1 )
            {
             before(grammarAccess.getStatesAccess().getStateAssignment_1_1()); 
            // InternalReactionRules.g:2436:2: ( rule__States__StateAssignment_1_1 )
            // InternalReactionRules.g:2436:3: rule__States__StateAssignment_1_1
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
    // InternalReactionRules.g:2444:1: rule__States__Group_1__2 : rule__States__Group_1__2__Impl rule__States__Group_1__3 ;
    public final void rule__States__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2448:1: ( rule__States__Group_1__2__Impl rule__States__Group_1__3 )
            // InternalReactionRules.g:2449:2: rule__States__Group_1__2__Impl rule__States__Group_1__3
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
    // InternalReactionRules.g:2456:1: rule__States__Group_1__2__Impl : ( ( rule__States__Group_1_2__0 )* ) ;
    public final void rule__States__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2460:1: ( ( ( rule__States__Group_1_2__0 )* ) )
            // InternalReactionRules.g:2461:1: ( ( rule__States__Group_1_2__0 )* )
            {
            // InternalReactionRules.g:2461:1: ( ( rule__States__Group_1_2__0 )* )
            // InternalReactionRules.g:2462:2: ( rule__States__Group_1_2__0 )*
            {
             before(grammarAccess.getStatesAccess().getGroup_1_2()); 
            // InternalReactionRules.g:2463:2: ( rule__States__Group_1_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==25) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalReactionRules.g:2463:3: rule__States__Group_1_2__0
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
    // InternalReactionRules.g:2471:1: rule__States__Group_1__3 : rule__States__Group_1__3__Impl ;
    public final void rule__States__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2475:1: ( rule__States__Group_1__3__Impl )
            // InternalReactionRules.g:2476:2: rule__States__Group_1__3__Impl
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
    // InternalReactionRules.g:2482:1: rule__States__Group_1__3__Impl : ( '}' ) ;
    public final void rule__States__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2486:1: ( ( '}' ) )
            // InternalReactionRules.g:2487:1: ( '}' )
            {
            // InternalReactionRules.g:2487:1: ( '}' )
            // InternalReactionRules.g:2488:2: '}'
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
    // InternalReactionRules.g:2498:1: rule__States__Group_1_2__0 : rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1 ;
    public final void rule__States__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2502:1: ( rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1 )
            // InternalReactionRules.g:2503:2: rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1
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
    // InternalReactionRules.g:2510:1: rule__States__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__States__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2514:1: ( ( ',' ) )
            // InternalReactionRules.g:2515:1: ( ',' )
            {
            // InternalReactionRules.g:2515:1: ( ',' )
            // InternalReactionRules.g:2516:2: ','
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
    // InternalReactionRules.g:2525:1: rule__States__Group_1_2__1 : rule__States__Group_1_2__1__Impl ;
    public final void rule__States__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2529:1: ( rule__States__Group_1_2__1__Impl )
            // InternalReactionRules.g:2530:2: rule__States__Group_1_2__1__Impl
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
    // InternalReactionRules.g:2536:1: rule__States__Group_1_2__1__Impl : ( ( rule__States__StateAssignment_1_2_1 ) ) ;
    public final void rule__States__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2540:1: ( ( ( rule__States__StateAssignment_1_2_1 ) ) )
            // InternalReactionRules.g:2541:1: ( ( rule__States__StateAssignment_1_2_1 ) )
            {
            // InternalReactionRules.g:2541:1: ( ( rule__States__StateAssignment_1_2_1 ) )
            // InternalReactionRules.g:2542:2: ( rule__States__StateAssignment_1_2_1 )
            {
             before(grammarAccess.getStatesAccess().getStateAssignment_1_2_1()); 
            // InternalReactionRules.g:2543:2: ( rule__States__StateAssignment_1_2_1 )
            // InternalReactionRules.g:2543:3: rule__States__StateAssignment_1_2_1
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
    // InternalReactionRules.g:2552:1: rule__SingleSite__Group__0 : rule__SingleSite__Group__0__Impl rule__SingleSite__Group__1 ;
    public final void rule__SingleSite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2556:1: ( rule__SingleSite__Group__0__Impl rule__SingleSite__Group__1 )
            // InternalReactionRules.g:2557:2: rule__SingleSite__Group__0__Impl rule__SingleSite__Group__1
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
    // InternalReactionRules.g:2564:1: rule__SingleSite__Group__0__Impl : ( () ) ;
    public final void rule__SingleSite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2568:1: ( ( () ) )
            // InternalReactionRules.g:2569:1: ( () )
            {
            // InternalReactionRules.g:2569:1: ( () )
            // InternalReactionRules.g:2570:2: ()
            {
             before(grammarAccess.getSingleSiteAccess().getSingleSiteAction_0()); 
            // InternalReactionRules.g:2571:2: ()
            // InternalReactionRules.g:2571:3: 
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
    // InternalReactionRules.g:2579:1: rule__SingleSite__Group__1 : rule__SingleSite__Group__1__Impl rule__SingleSite__Group__2 ;
    public final void rule__SingleSite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2583:1: ( rule__SingleSite__Group__1__Impl rule__SingleSite__Group__2 )
            // InternalReactionRules.g:2584:2: rule__SingleSite__Group__1__Impl rule__SingleSite__Group__2
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
    // InternalReactionRules.g:2591:1: rule__SingleSite__Group__1__Impl : ( ( rule__SingleSite__NameAssignment_1 ) ) ;
    public final void rule__SingleSite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2595:1: ( ( ( rule__SingleSite__NameAssignment_1 ) ) )
            // InternalReactionRules.g:2596:1: ( ( rule__SingleSite__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:2596:1: ( ( rule__SingleSite__NameAssignment_1 ) )
            // InternalReactionRules.g:2597:2: ( rule__SingleSite__NameAssignment_1 )
            {
             before(grammarAccess.getSingleSiteAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:2598:2: ( rule__SingleSite__NameAssignment_1 )
            // InternalReactionRules.g:2598:3: rule__SingleSite__NameAssignment_1
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
    // InternalReactionRules.g:2606:1: rule__SingleSite__Group__2 : rule__SingleSite__Group__2__Impl ;
    public final void rule__SingleSite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2610:1: ( rule__SingleSite__Group__2__Impl )
            // InternalReactionRules.g:2611:2: rule__SingleSite__Group__2__Impl
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
    // InternalReactionRules.g:2617:1: rule__SingleSite__Group__2__Impl : ( ( rule__SingleSite__StatesAssignment_2 ) ) ;
    public final void rule__SingleSite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2621:1: ( ( ( rule__SingleSite__StatesAssignment_2 ) ) )
            // InternalReactionRules.g:2622:1: ( ( rule__SingleSite__StatesAssignment_2 ) )
            {
            // InternalReactionRules.g:2622:1: ( ( rule__SingleSite__StatesAssignment_2 ) )
            // InternalReactionRules.g:2623:2: ( rule__SingleSite__StatesAssignment_2 )
            {
             before(grammarAccess.getSingleSiteAccess().getStatesAssignment_2()); 
            // InternalReactionRules.g:2624:2: ( rule__SingleSite__StatesAssignment_2 )
            // InternalReactionRules.g:2624:3: rule__SingleSite__StatesAssignment_2
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
    // InternalReactionRules.g:2633:1: rule__MultiSite__Group__0 : rule__MultiSite__Group__0__Impl rule__MultiSite__Group__1 ;
    public final void rule__MultiSite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2637:1: ( rule__MultiSite__Group__0__Impl rule__MultiSite__Group__1 )
            // InternalReactionRules.g:2638:2: rule__MultiSite__Group__0__Impl rule__MultiSite__Group__1
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
    // InternalReactionRules.g:2645:1: rule__MultiSite__Group__0__Impl : ( () ) ;
    public final void rule__MultiSite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2649:1: ( ( () ) )
            // InternalReactionRules.g:2650:1: ( () )
            {
            // InternalReactionRules.g:2650:1: ( () )
            // InternalReactionRules.g:2651:2: ()
            {
             before(grammarAccess.getMultiSiteAccess().getMultiSiteAction_0()); 
            // InternalReactionRules.g:2652:2: ()
            // InternalReactionRules.g:2652:3: 
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
    // InternalReactionRules.g:2660:1: rule__MultiSite__Group__1 : rule__MultiSite__Group__1__Impl rule__MultiSite__Group__2 ;
    public final void rule__MultiSite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2664:1: ( rule__MultiSite__Group__1__Impl rule__MultiSite__Group__2 )
            // InternalReactionRules.g:2665:2: rule__MultiSite__Group__1__Impl rule__MultiSite__Group__2
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
    // InternalReactionRules.g:2672:1: rule__MultiSite__Group__1__Impl : ( '*' ) ;
    public final void rule__MultiSite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2676:1: ( ( '*' ) )
            // InternalReactionRules.g:2677:1: ( '*' )
            {
            // InternalReactionRules.g:2677:1: ( '*' )
            // InternalReactionRules.g:2678:2: '*'
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
    // InternalReactionRules.g:2687:1: rule__MultiSite__Group__2 : rule__MultiSite__Group__2__Impl rule__MultiSite__Group__3 ;
    public final void rule__MultiSite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2691:1: ( rule__MultiSite__Group__2__Impl rule__MultiSite__Group__3 )
            // InternalReactionRules.g:2692:2: rule__MultiSite__Group__2__Impl rule__MultiSite__Group__3
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
    // InternalReactionRules.g:2699:1: rule__MultiSite__Group__2__Impl : ( ( rule__MultiSite__NameAssignment_2 ) ) ;
    public final void rule__MultiSite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2703:1: ( ( ( rule__MultiSite__NameAssignment_2 ) ) )
            // InternalReactionRules.g:2704:1: ( ( rule__MultiSite__NameAssignment_2 ) )
            {
            // InternalReactionRules.g:2704:1: ( ( rule__MultiSite__NameAssignment_2 ) )
            // InternalReactionRules.g:2705:2: ( rule__MultiSite__NameAssignment_2 )
            {
             before(grammarAccess.getMultiSiteAccess().getNameAssignment_2()); 
            // InternalReactionRules.g:2706:2: ( rule__MultiSite__NameAssignment_2 )
            // InternalReactionRules.g:2706:3: rule__MultiSite__NameAssignment_2
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
    // InternalReactionRules.g:2714:1: rule__MultiSite__Group__3 : rule__MultiSite__Group__3__Impl ;
    public final void rule__MultiSite__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2718:1: ( rule__MultiSite__Group__3__Impl )
            // InternalReactionRules.g:2719:2: rule__MultiSite__Group__3__Impl
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
    // InternalReactionRules.g:2725:1: rule__MultiSite__Group__3__Impl : ( ( rule__MultiSite__StatesAssignment_3 ) ) ;
    public final void rule__MultiSite__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2729:1: ( ( ( rule__MultiSite__StatesAssignment_3 ) ) )
            // InternalReactionRules.g:2730:1: ( ( rule__MultiSite__StatesAssignment_3 ) )
            {
            // InternalReactionRules.g:2730:1: ( ( rule__MultiSite__StatesAssignment_3 ) )
            // InternalReactionRules.g:2731:2: ( rule__MultiSite__StatesAssignment_3 )
            {
             before(grammarAccess.getMultiSiteAccess().getStatesAssignment_3()); 
            // InternalReactionRules.g:2732:2: ( rule__MultiSite__StatesAssignment_3 )
            // InternalReactionRules.g:2732:3: rule__MultiSite__StatesAssignment_3
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
    // InternalReactionRules.g:2741:1: rule__Sites__Group__0 : rule__Sites__Group__0__Impl rule__Sites__Group__1 ;
    public final void rule__Sites__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2745:1: ( rule__Sites__Group__0__Impl rule__Sites__Group__1 )
            // InternalReactionRules.g:2746:2: rule__Sites__Group__0__Impl rule__Sites__Group__1
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
    // InternalReactionRules.g:2753:1: rule__Sites__Group__0__Impl : ( () ) ;
    public final void rule__Sites__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2757:1: ( ( () ) )
            // InternalReactionRules.g:2758:1: ( () )
            {
            // InternalReactionRules.g:2758:1: ( () )
            // InternalReactionRules.g:2759:2: ()
            {
             before(grammarAccess.getSitesAccess().getSitesAction_0()); 
            // InternalReactionRules.g:2760:2: ()
            // InternalReactionRules.g:2760:3: 
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
    // InternalReactionRules.g:2768:1: rule__Sites__Group__1 : rule__Sites__Group__1__Impl ;
    public final void rule__Sites__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2772:1: ( rule__Sites__Group__1__Impl )
            // InternalReactionRules.g:2773:2: rule__Sites__Group__1__Impl
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
    // InternalReactionRules.g:2779:1: rule__Sites__Group__1__Impl : ( ( rule__Sites__Group_1__0 )? ) ;
    public final void rule__Sites__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2783:1: ( ( ( rule__Sites__Group_1__0 )? ) )
            // InternalReactionRules.g:2784:1: ( ( rule__Sites__Group_1__0 )? )
            {
            // InternalReactionRules.g:2784:1: ( ( rule__Sites__Group_1__0 )? )
            // InternalReactionRules.g:2785:2: ( rule__Sites__Group_1__0 )?
            {
             before(grammarAccess.getSitesAccess().getGroup_1()); 
            // InternalReactionRules.g:2786:2: ( rule__Sites__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalReactionRules.g:2786:3: rule__Sites__Group_1__0
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
    // InternalReactionRules.g:2795:1: rule__Sites__Group_1__0 : rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1 ;
    public final void rule__Sites__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2799:1: ( rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1 )
            // InternalReactionRules.g:2800:2: rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1
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
    // InternalReactionRules.g:2807:1: rule__Sites__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Sites__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2811:1: ( ( '(' ) )
            // InternalReactionRules.g:2812:1: ( '(' )
            {
            // InternalReactionRules.g:2812:1: ( '(' )
            // InternalReactionRules.g:2813:2: '('
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
    // InternalReactionRules.g:2822:1: rule__Sites__Group_1__1 : rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2 ;
    public final void rule__Sites__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2826:1: ( rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2 )
            // InternalReactionRules.g:2827:2: rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2
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
    // InternalReactionRules.g:2834:1: rule__Sites__Group_1__1__Impl : ( ( rule__Sites__SitesAssignment_1_1 ) ) ;
    public final void rule__Sites__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2838:1: ( ( ( rule__Sites__SitesAssignment_1_1 ) ) )
            // InternalReactionRules.g:2839:1: ( ( rule__Sites__SitesAssignment_1_1 ) )
            {
            // InternalReactionRules.g:2839:1: ( ( rule__Sites__SitesAssignment_1_1 ) )
            // InternalReactionRules.g:2840:2: ( rule__Sites__SitesAssignment_1_1 )
            {
             before(grammarAccess.getSitesAccess().getSitesAssignment_1_1()); 
            // InternalReactionRules.g:2841:2: ( rule__Sites__SitesAssignment_1_1 )
            // InternalReactionRules.g:2841:3: rule__Sites__SitesAssignment_1_1
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
    // InternalReactionRules.g:2849:1: rule__Sites__Group_1__2 : rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3 ;
    public final void rule__Sites__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2853:1: ( rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3 )
            // InternalReactionRules.g:2854:2: rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3
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
    // InternalReactionRules.g:2861:1: rule__Sites__Group_1__2__Impl : ( ( rule__Sites__Group_1_2__0 )* ) ;
    public final void rule__Sites__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2865:1: ( ( ( rule__Sites__Group_1_2__0 )* ) )
            // InternalReactionRules.g:2866:1: ( ( rule__Sites__Group_1_2__0 )* )
            {
            // InternalReactionRules.g:2866:1: ( ( rule__Sites__Group_1_2__0 )* )
            // InternalReactionRules.g:2867:2: ( rule__Sites__Group_1_2__0 )*
            {
             before(grammarAccess.getSitesAccess().getGroup_1_2()); 
            // InternalReactionRules.g:2868:2: ( rule__Sites__Group_1_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalReactionRules.g:2868:3: rule__Sites__Group_1_2__0
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
    // InternalReactionRules.g:2876:1: rule__Sites__Group_1__3 : rule__Sites__Group_1__3__Impl ;
    public final void rule__Sites__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2880:1: ( rule__Sites__Group_1__3__Impl )
            // InternalReactionRules.g:2881:2: rule__Sites__Group_1__3__Impl
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
    // InternalReactionRules.g:2887:1: rule__Sites__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Sites__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2891:1: ( ( ')' ) )
            // InternalReactionRules.g:2892:1: ( ')' )
            {
            // InternalReactionRules.g:2892:1: ( ')' )
            // InternalReactionRules.g:2893:2: ')'
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
    // InternalReactionRules.g:2903:1: rule__Sites__Group_1_2__0 : rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1 ;
    public final void rule__Sites__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2907:1: ( rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1 )
            // InternalReactionRules.g:2908:2: rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1
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
    // InternalReactionRules.g:2915:1: rule__Sites__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Sites__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2919:1: ( ( ',' ) )
            // InternalReactionRules.g:2920:1: ( ',' )
            {
            // InternalReactionRules.g:2920:1: ( ',' )
            // InternalReactionRules.g:2921:2: ','
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
    // InternalReactionRules.g:2930:1: rule__Sites__Group_1_2__1 : rule__Sites__Group_1_2__1__Impl ;
    public final void rule__Sites__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2934:1: ( rule__Sites__Group_1_2__1__Impl )
            // InternalReactionRules.g:2935:2: rule__Sites__Group_1_2__1__Impl
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
    // InternalReactionRules.g:2941:1: rule__Sites__Group_1_2__1__Impl : ( ( rule__Sites__SitesAssignment_1_2_1 ) ) ;
    public final void rule__Sites__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2945:1: ( ( ( rule__Sites__SitesAssignment_1_2_1 ) ) )
            // InternalReactionRules.g:2946:1: ( ( rule__Sites__SitesAssignment_1_2_1 ) )
            {
            // InternalReactionRules.g:2946:1: ( ( rule__Sites__SitesAssignment_1_2_1 ) )
            // InternalReactionRules.g:2947:2: ( rule__Sites__SitesAssignment_1_2_1 )
            {
             before(grammarAccess.getSitesAccess().getSitesAssignment_1_2_1()); 
            // InternalReactionRules.g:2948:2: ( rule__Sites__SitesAssignment_1_2_1 )
            // InternalReactionRules.g:2948:3: rule__Sites__SitesAssignment_1_2_1
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
    // InternalReactionRules.g:2957:1: rule__Agent__Group__0 : rule__Agent__Group__0__Impl rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2961:1: ( rule__Agent__Group__0__Impl rule__Agent__Group__1 )
            // InternalReactionRules.g:2962:2: rule__Agent__Group__0__Impl rule__Agent__Group__1
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
    // InternalReactionRules.g:2969:1: rule__Agent__Group__0__Impl : ( 'agent' ) ;
    public final void rule__Agent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2973:1: ( ( 'agent' ) )
            // InternalReactionRules.g:2974:1: ( 'agent' )
            {
            // InternalReactionRules.g:2974:1: ( 'agent' )
            // InternalReactionRules.g:2975:2: 'agent'
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
    // InternalReactionRules.g:2984:1: rule__Agent__Group__1 : rule__Agent__Group__1__Impl rule__Agent__Group__2 ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2988:1: ( rule__Agent__Group__1__Impl rule__Agent__Group__2 )
            // InternalReactionRules.g:2989:2: rule__Agent__Group__1__Impl rule__Agent__Group__2
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
    // InternalReactionRules.g:2996:1: rule__Agent__Group__1__Impl : ( ( rule__Agent__NameAssignment_1 ) ) ;
    public final void rule__Agent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3000:1: ( ( ( rule__Agent__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3001:1: ( ( rule__Agent__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3001:1: ( ( rule__Agent__NameAssignment_1 ) )
            // InternalReactionRules.g:3002:2: ( rule__Agent__NameAssignment_1 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3003:2: ( rule__Agent__NameAssignment_1 )
            // InternalReactionRules.g:3003:3: rule__Agent__NameAssignment_1
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
    // InternalReactionRules.g:3011:1: rule__Agent__Group__2 : rule__Agent__Group__2__Impl ;
    public final void rule__Agent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3015:1: ( rule__Agent__Group__2__Impl )
            // InternalReactionRules.g:3016:2: rule__Agent__Group__2__Impl
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
    // InternalReactionRules.g:3022:1: rule__Agent__Group__2__Impl : ( ( rule__Agent__SitesAssignment_2 ) ) ;
    public final void rule__Agent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3026:1: ( ( ( rule__Agent__SitesAssignment_2 ) ) )
            // InternalReactionRules.g:3027:1: ( ( rule__Agent__SitesAssignment_2 ) )
            {
            // InternalReactionRules.g:3027:1: ( ( rule__Agent__SitesAssignment_2 ) )
            // InternalReactionRules.g:3028:2: ( rule__Agent__SitesAssignment_2 )
            {
             before(grammarAccess.getAgentAccess().getSitesAssignment_2()); 
            // InternalReactionRules.g:3029:2: ( rule__Agent__SitesAssignment_2 )
            // InternalReactionRules.g:3029:3: rule__Agent__SitesAssignment_2
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
    // InternalReactionRules.g:3038:1: rule__PatternVariable__Group__0 : rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 ;
    public final void rule__PatternVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3042:1: ( rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 )
            // InternalReactionRules.g:3043:2: rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1
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
    // InternalReactionRules.g:3050:1: rule__PatternVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__PatternVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3054:1: ( ( 'var' ) )
            // InternalReactionRules.g:3055:1: ( 'var' )
            {
            // InternalReactionRules.g:3055:1: ( 'var' )
            // InternalReactionRules.g:3056:2: 'var'
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
    // InternalReactionRules.g:3065:1: rule__PatternVariable__Group__1 : rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 ;
    public final void rule__PatternVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3069:1: ( rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 )
            // InternalReactionRules.g:3070:2: rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2
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
    // InternalReactionRules.g:3077:1: rule__PatternVariable__Group__1__Impl : ( ( rule__PatternVariable__NameAssignment_1 ) ) ;
    public final void rule__PatternVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3081:1: ( ( ( rule__PatternVariable__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3082:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3082:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            // InternalReactionRules.g:3083:2: ( rule__PatternVariable__NameAssignment_1 )
            {
             before(grammarAccess.getPatternVariableAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3084:2: ( rule__PatternVariable__NameAssignment_1 )
            // InternalReactionRules.g:3084:3: rule__PatternVariable__NameAssignment_1
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
    // InternalReactionRules.g:3092:1: rule__PatternVariable__Group__2 : rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 ;
    public final void rule__PatternVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3096:1: ( rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 )
            // InternalReactionRules.g:3097:2: rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3
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
    // InternalReactionRules.g:3104:1: rule__PatternVariable__Group__2__Impl : ( '=' ) ;
    public final void rule__PatternVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3108:1: ( ( '=' ) )
            // InternalReactionRules.g:3109:1: ( '=' )
            {
            // InternalReactionRules.g:3109:1: ( '=' )
            // InternalReactionRules.g:3110:2: '='
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
    // InternalReactionRules.g:3119:1: rule__PatternVariable__Group__3 : rule__PatternVariable__Group__3__Impl ;
    public final void rule__PatternVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3123:1: ( rule__PatternVariable__Group__3__Impl )
            // InternalReactionRules.g:3124:2: rule__PatternVariable__Group__3__Impl
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
    // InternalReactionRules.g:3130:1: rule__PatternVariable__Group__3__Impl : ( ( rule__PatternVariable__PatternAssignment_3 ) ) ;
    public final void rule__PatternVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3134:1: ( ( ( rule__PatternVariable__PatternAssignment_3 ) ) )
            // InternalReactionRules.g:3135:1: ( ( rule__PatternVariable__PatternAssignment_3 ) )
            {
            // InternalReactionRules.g:3135:1: ( ( rule__PatternVariable__PatternAssignment_3 ) )
            // InternalReactionRules.g:3136:2: ( rule__PatternVariable__PatternAssignment_3 )
            {
             before(grammarAccess.getPatternVariableAccess().getPatternAssignment_3()); 
            // InternalReactionRules.g:3137:2: ( rule__PatternVariable__PatternAssignment_3 )
            // InternalReactionRules.g:3137:3: rule__PatternVariable__PatternAssignment_3
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
    // InternalReactionRules.g:3146:1: rule__ArithmeticVariable__Group__0 : rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1 ;
    public final void rule__ArithmeticVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3150:1: ( rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1 )
            // InternalReactionRules.g:3151:2: rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1
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
    // InternalReactionRules.g:3158:1: rule__ArithmeticVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__ArithmeticVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3162:1: ( ( 'var' ) )
            // InternalReactionRules.g:3163:1: ( 'var' )
            {
            // InternalReactionRules.g:3163:1: ( 'var' )
            // InternalReactionRules.g:3164:2: 'var'
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
    // InternalReactionRules.g:3173:1: rule__ArithmeticVariable__Group__1 : rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2 ;
    public final void rule__ArithmeticVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3177:1: ( rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2 )
            // InternalReactionRules.g:3178:2: rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2
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
    // InternalReactionRules.g:3185:1: rule__ArithmeticVariable__Group__1__Impl : ( ( rule__ArithmeticVariable__NameAssignment_1 ) ) ;
    public final void rule__ArithmeticVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3189:1: ( ( ( rule__ArithmeticVariable__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3190:1: ( ( rule__ArithmeticVariable__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3190:1: ( ( rule__ArithmeticVariable__NameAssignment_1 ) )
            // InternalReactionRules.g:3191:2: ( rule__ArithmeticVariable__NameAssignment_1 )
            {
             before(grammarAccess.getArithmeticVariableAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3192:2: ( rule__ArithmeticVariable__NameAssignment_1 )
            // InternalReactionRules.g:3192:3: rule__ArithmeticVariable__NameAssignment_1
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
    // InternalReactionRules.g:3200:1: rule__ArithmeticVariable__Group__2 : rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3 ;
    public final void rule__ArithmeticVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3204:1: ( rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3 )
            // InternalReactionRules.g:3205:2: rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3
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
    // InternalReactionRules.g:3212:1: rule__ArithmeticVariable__Group__2__Impl : ( '=' ) ;
    public final void rule__ArithmeticVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3216:1: ( ( '=' ) )
            // InternalReactionRules.g:3217:1: ( '=' )
            {
            // InternalReactionRules.g:3217:1: ( '=' )
            // InternalReactionRules.g:3218:2: '='
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
    // InternalReactionRules.g:3227:1: rule__ArithmeticVariable__Group__3 : rule__ArithmeticVariable__Group__3__Impl ;
    public final void rule__ArithmeticVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3231:1: ( rule__ArithmeticVariable__Group__3__Impl )
            // InternalReactionRules.g:3232:2: rule__ArithmeticVariable__Group__3__Impl
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
    // InternalReactionRules.g:3238:1: rule__ArithmeticVariable__Group__3__Impl : ( ( rule__ArithmeticVariable__ValueAssignment_3 ) ) ;
    public final void rule__ArithmeticVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3242:1: ( ( ( rule__ArithmeticVariable__ValueAssignment_3 ) ) )
            // InternalReactionRules.g:3243:1: ( ( rule__ArithmeticVariable__ValueAssignment_3 ) )
            {
            // InternalReactionRules.g:3243:1: ( ( rule__ArithmeticVariable__ValueAssignment_3 ) )
            // InternalReactionRules.g:3244:2: ( rule__ArithmeticVariable__ValueAssignment_3 )
            {
             before(grammarAccess.getArithmeticVariableAccess().getValueAssignment_3()); 
            // InternalReactionRules.g:3245:2: ( rule__ArithmeticVariable__ValueAssignment_3 )
            // InternalReactionRules.g:3245:3: rule__ArithmeticVariable__ValueAssignment_3
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
    // InternalReactionRules.g:3254:1: rule__BoundAnyLink__Group__0 : rule__BoundAnyLink__Group__0__Impl rule__BoundAnyLink__Group__1 ;
    public final void rule__BoundAnyLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3258:1: ( rule__BoundAnyLink__Group__0__Impl rule__BoundAnyLink__Group__1 )
            // InternalReactionRules.g:3259:2: rule__BoundAnyLink__Group__0__Impl rule__BoundAnyLink__Group__1
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
    // InternalReactionRules.g:3266:1: rule__BoundAnyLink__Group__0__Impl : ( () ) ;
    public final void rule__BoundAnyLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3270:1: ( ( () ) )
            // InternalReactionRules.g:3271:1: ( () )
            {
            // InternalReactionRules.g:3271:1: ( () )
            // InternalReactionRules.g:3272:2: ()
            {
             before(grammarAccess.getBoundAnyLinkAccess().getBoundAnyLinkAction_0()); 
            // InternalReactionRules.g:3273:2: ()
            // InternalReactionRules.g:3273:3: 
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
    // InternalReactionRules.g:3281:1: rule__BoundAnyLink__Group__1 : rule__BoundAnyLink__Group__1__Impl ;
    public final void rule__BoundAnyLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3285:1: ( rule__BoundAnyLink__Group__1__Impl )
            // InternalReactionRules.g:3286:2: rule__BoundAnyLink__Group__1__Impl
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
    // InternalReactionRules.g:3292:1: rule__BoundAnyLink__Group__1__Impl : ( ( rule__BoundAnyLink__NameAssignment_1 ) ) ;
    public final void rule__BoundAnyLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3296:1: ( ( ( rule__BoundAnyLink__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3297:1: ( ( rule__BoundAnyLink__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3297:1: ( ( rule__BoundAnyLink__NameAssignment_1 ) )
            // InternalReactionRules.g:3298:2: ( rule__BoundAnyLink__NameAssignment_1 )
            {
             before(grammarAccess.getBoundAnyLinkAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3299:2: ( rule__BoundAnyLink__NameAssignment_1 )
            // InternalReactionRules.g:3299:3: rule__BoundAnyLink__NameAssignment_1
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
    // InternalReactionRules.g:3308:1: rule__FreeLink__Group__0 : rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1 ;
    public final void rule__FreeLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3312:1: ( rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1 )
            // InternalReactionRules.g:3313:2: rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1
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
    // InternalReactionRules.g:3320:1: rule__FreeLink__Group__0__Impl : ( () ) ;
    public final void rule__FreeLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3324:1: ( ( () ) )
            // InternalReactionRules.g:3325:1: ( () )
            {
            // InternalReactionRules.g:3325:1: ( () )
            // InternalReactionRules.g:3326:2: ()
            {
             before(grammarAccess.getFreeLinkAccess().getFreeLinkAction_0()); 
            // InternalReactionRules.g:3327:2: ()
            // InternalReactionRules.g:3327:3: 
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
    // InternalReactionRules.g:3335:1: rule__FreeLink__Group__1 : rule__FreeLink__Group__1__Impl ;
    public final void rule__FreeLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3339:1: ( rule__FreeLink__Group__1__Impl )
            // InternalReactionRules.g:3340:2: rule__FreeLink__Group__1__Impl
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
    // InternalReactionRules.g:3346:1: rule__FreeLink__Group__1__Impl : ( ( rule__FreeLink__NameAssignment_1 ) ) ;
    public final void rule__FreeLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3350:1: ( ( ( rule__FreeLink__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3351:1: ( ( rule__FreeLink__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3351:1: ( ( rule__FreeLink__NameAssignment_1 ) )
            // InternalReactionRules.g:3352:2: ( rule__FreeLink__NameAssignment_1 )
            {
             before(grammarAccess.getFreeLinkAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3353:2: ( rule__FreeLink__NameAssignment_1 )
            // InternalReactionRules.g:3353:3: rule__FreeLink__NameAssignment_1
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
    // InternalReactionRules.g:3362:1: rule__WhatEver__Group__0 : rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1 ;
    public final void rule__WhatEver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3366:1: ( rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1 )
            // InternalReactionRules.g:3367:2: rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalReactionRules.g:3374:1: rule__WhatEver__Group__0__Impl : ( () ) ;
    public final void rule__WhatEver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3378:1: ( ( () ) )
            // InternalReactionRules.g:3379:1: ( () )
            {
            // InternalReactionRules.g:3379:1: ( () )
            // InternalReactionRules.g:3380:2: ()
            {
             before(grammarAccess.getWhatEverAccess().getWhatEverAction_0()); 
            // InternalReactionRules.g:3381:2: ()
            // InternalReactionRules.g:3381:3: 
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
    // InternalReactionRules.g:3389:1: rule__WhatEver__Group__1 : rule__WhatEver__Group__1__Impl ;
    public final void rule__WhatEver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3393:1: ( rule__WhatEver__Group__1__Impl )
            // InternalReactionRules.g:3394:2: rule__WhatEver__Group__1__Impl
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
    // InternalReactionRules.g:3400:1: rule__WhatEver__Group__1__Impl : ( ( rule__WhatEver__NameAssignment_1 ) ) ;
    public final void rule__WhatEver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3404:1: ( ( ( rule__WhatEver__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3405:1: ( ( rule__WhatEver__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3405:1: ( ( rule__WhatEver__NameAssignment_1 ) )
            // InternalReactionRules.g:3406:2: ( rule__WhatEver__NameAssignment_1 )
            {
             before(grammarAccess.getWhatEverAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3407:2: ( rule__WhatEver__NameAssignment_1 )
            // InternalReactionRules.g:3407:3: rule__WhatEver__NameAssignment_1
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
    // InternalReactionRules.g:3416:1: rule__BoundLink__Group__0 : rule__BoundLink__Group__0__Impl rule__BoundLink__Group__1 ;
    public final void rule__BoundLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3420:1: ( rule__BoundLink__Group__0__Impl rule__BoundLink__Group__1 )
            // InternalReactionRules.g:3421:2: rule__BoundLink__Group__0__Impl rule__BoundLink__Group__1
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
    // InternalReactionRules.g:3428:1: rule__BoundLink__Group__0__Impl : ( () ) ;
    public final void rule__BoundLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3432:1: ( ( () ) )
            // InternalReactionRules.g:3433:1: ( () )
            {
            // InternalReactionRules.g:3433:1: ( () )
            // InternalReactionRules.g:3434:2: ()
            {
             before(grammarAccess.getBoundLinkAccess().getBoundLinkAction_0()); 
            // InternalReactionRules.g:3435:2: ()
            // InternalReactionRules.g:3435:3: 
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
    // InternalReactionRules.g:3443:1: rule__BoundLink__Group__1 : rule__BoundLink__Group__1__Impl ;
    public final void rule__BoundLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3447:1: ( rule__BoundLink__Group__1__Impl )
            // InternalReactionRules.g:3448:2: rule__BoundLink__Group__1__Impl
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
    // InternalReactionRules.g:3454:1: rule__BoundLink__Group__1__Impl : ( ( rule__BoundLink__StateAssignment_1 ) ) ;
    public final void rule__BoundLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3458:1: ( ( ( rule__BoundLink__StateAssignment_1 ) ) )
            // InternalReactionRules.g:3459:1: ( ( rule__BoundLink__StateAssignment_1 ) )
            {
            // InternalReactionRules.g:3459:1: ( ( rule__BoundLink__StateAssignment_1 ) )
            // InternalReactionRules.g:3460:2: ( rule__BoundLink__StateAssignment_1 )
            {
             before(grammarAccess.getBoundLinkAccess().getStateAssignment_1()); 
            // InternalReactionRules.g:3461:2: ( rule__BoundLink__StateAssignment_1 )
            // InternalReactionRules.g:3461:3: rule__BoundLink__StateAssignment_1
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
    // InternalReactionRules.g:3470:1: rule__MultiLink__Group__0 : rule__MultiLink__Group__0__Impl rule__MultiLink__Group__1 ;
    public final void rule__MultiLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3474:1: ( rule__MultiLink__Group__0__Impl rule__MultiLink__Group__1 )
            // InternalReactionRules.g:3475:2: rule__MultiLink__Group__0__Impl rule__MultiLink__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalReactionRules.g:3482:1: rule__MultiLink__Group__0__Impl : ( () ) ;
    public final void rule__MultiLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3486:1: ( ( () ) )
            // InternalReactionRules.g:3487:1: ( () )
            {
            // InternalReactionRules.g:3487:1: ( () )
            // InternalReactionRules.g:3488:2: ()
            {
             before(grammarAccess.getMultiLinkAccess().getMultiLinkAction_0()); 
            // InternalReactionRules.g:3489:2: ()
            // InternalReactionRules.g:3489:3: 
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
    // InternalReactionRules.g:3497:1: rule__MultiLink__Group__1 : rule__MultiLink__Group__1__Impl ;
    public final void rule__MultiLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3501:1: ( rule__MultiLink__Group__1__Impl )
            // InternalReactionRules.g:3502:2: rule__MultiLink__Group__1__Impl
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
    // InternalReactionRules.g:3508:1: rule__MultiLink__Group__1__Impl : ( ( rule__MultiLink__Group_1__0 )? ) ;
    public final void rule__MultiLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3512:1: ( ( ( rule__MultiLink__Group_1__0 )? ) )
            // InternalReactionRules.g:3513:1: ( ( rule__MultiLink__Group_1__0 )? )
            {
            // InternalReactionRules.g:3513:1: ( ( rule__MultiLink__Group_1__0 )? )
            // InternalReactionRules.g:3514:2: ( rule__MultiLink__Group_1__0 )?
            {
             before(grammarAccess.getMultiLinkAccess().getGroup_1()); 
            // InternalReactionRules.g:3515:2: ( rule__MultiLink__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT||LA23_0==RULE_FREE_LINK) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalReactionRules.g:3515:3: rule__MultiLink__Group_1__0
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
    // InternalReactionRules.g:3524:1: rule__MultiLink__Group_1__0 : rule__MultiLink__Group_1__0__Impl rule__MultiLink__Group_1__1 ;
    public final void rule__MultiLink__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3528:1: ( rule__MultiLink__Group_1__0__Impl rule__MultiLink__Group_1__1 )
            // InternalReactionRules.g:3529:2: rule__MultiLink__Group_1__0__Impl rule__MultiLink__Group_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalReactionRules.g:3536:1: rule__MultiLink__Group_1__0__Impl : ( ( rule__MultiLink__StatesAssignment_1_0 ) ) ;
    public final void rule__MultiLink__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3540:1: ( ( ( rule__MultiLink__StatesAssignment_1_0 ) ) )
            // InternalReactionRules.g:3541:1: ( ( rule__MultiLink__StatesAssignment_1_0 ) )
            {
            // InternalReactionRules.g:3541:1: ( ( rule__MultiLink__StatesAssignment_1_0 ) )
            // InternalReactionRules.g:3542:2: ( rule__MultiLink__StatesAssignment_1_0 )
            {
             before(grammarAccess.getMultiLinkAccess().getStatesAssignment_1_0()); 
            // InternalReactionRules.g:3543:2: ( rule__MultiLink__StatesAssignment_1_0 )
            // InternalReactionRules.g:3543:3: rule__MultiLink__StatesAssignment_1_0
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
    // InternalReactionRules.g:3551:1: rule__MultiLink__Group_1__1 : rule__MultiLink__Group_1__1__Impl ;
    public final void rule__MultiLink__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3555:1: ( rule__MultiLink__Group_1__1__Impl )
            // InternalReactionRules.g:3556:2: rule__MultiLink__Group_1__1__Impl
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
    // InternalReactionRules.g:3562:1: rule__MultiLink__Group_1__1__Impl : ( ( ( rule__MultiLink__Group_1_1__0 ) ) ( ( rule__MultiLink__Group_1_1__0 )* ) ) ;
    public final void rule__MultiLink__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3566:1: ( ( ( ( rule__MultiLink__Group_1_1__0 ) ) ( ( rule__MultiLink__Group_1_1__0 )* ) ) )
            // InternalReactionRules.g:3567:1: ( ( ( rule__MultiLink__Group_1_1__0 ) ) ( ( rule__MultiLink__Group_1_1__0 )* ) )
            {
            // InternalReactionRules.g:3567:1: ( ( ( rule__MultiLink__Group_1_1__0 ) ) ( ( rule__MultiLink__Group_1_1__0 )* ) )
            // InternalReactionRules.g:3568:2: ( ( rule__MultiLink__Group_1_1__0 ) ) ( ( rule__MultiLink__Group_1_1__0 )* )
            {
            // InternalReactionRules.g:3568:2: ( ( rule__MultiLink__Group_1_1__0 ) )
            // InternalReactionRules.g:3569:3: ( rule__MultiLink__Group_1_1__0 )
            {
             before(grammarAccess.getMultiLinkAccess().getGroup_1_1()); 
            // InternalReactionRules.g:3570:3: ( rule__MultiLink__Group_1_1__0 )
            // InternalReactionRules.g:3570:4: rule__MultiLink__Group_1_1__0
            {
            pushFollow(FOLLOW_12);
            rule__MultiLink__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiLinkAccess().getGroup_1_1()); 

            }

            // InternalReactionRules.g:3573:2: ( ( rule__MultiLink__Group_1_1__0 )* )
            // InternalReactionRules.g:3574:3: ( rule__MultiLink__Group_1_1__0 )*
            {
             before(grammarAccess.getMultiLinkAccess().getGroup_1_1()); 
            // InternalReactionRules.g:3575:3: ( rule__MultiLink__Group_1_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==25) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalReactionRules.g:3575:4: rule__MultiLink__Group_1_1__0
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
    // InternalReactionRules.g:3585:1: rule__MultiLink__Group_1_1__0 : rule__MultiLink__Group_1_1__0__Impl rule__MultiLink__Group_1_1__1 ;
    public final void rule__MultiLink__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3589:1: ( rule__MultiLink__Group_1_1__0__Impl rule__MultiLink__Group_1_1__1 )
            // InternalReactionRules.g:3590:2: rule__MultiLink__Group_1_1__0__Impl rule__MultiLink__Group_1_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalReactionRules.g:3597:1: rule__MultiLink__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__MultiLink__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3601:1: ( ( ',' ) )
            // InternalReactionRules.g:3602:1: ( ',' )
            {
            // InternalReactionRules.g:3602:1: ( ',' )
            // InternalReactionRules.g:3603:2: ','
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
    // InternalReactionRules.g:3612:1: rule__MultiLink__Group_1_1__1 : rule__MultiLink__Group_1_1__1__Impl ;
    public final void rule__MultiLink__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3616:1: ( rule__MultiLink__Group_1_1__1__Impl )
            // InternalReactionRules.g:3617:2: rule__MultiLink__Group_1_1__1__Impl
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
    // InternalReactionRules.g:3623:1: rule__MultiLink__Group_1_1__1__Impl : ( ( rule__MultiLink__StatesAssignment_1_1_1 ) ) ;
    public final void rule__MultiLink__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3627:1: ( ( ( rule__MultiLink__StatesAssignment_1_1_1 ) ) )
            // InternalReactionRules.g:3628:1: ( ( rule__MultiLink__StatesAssignment_1_1_1 ) )
            {
            // InternalReactionRules.g:3628:1: ( ( rule__MultiLink__StatesAssignment_1_1_1 ) )
            // InternalReactionRules.g:3629:2: ( rule__MultiLink__StatesAssignment_1_1_1 )
            {
             before(grammarAccess.getMultiLinkAccess().getStatesAssignment_1_1_1()); 
            // InternalReactionRules.g:3630:2: ( rule__MultiLink__StatesAssignment_1_1_1 )
            // InternalReactionRules.g:3630:3: rule__MultiLink__StatesAssignment_1_1_1
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
    // InternalReactionRules.g:3639:1: rule__BoundAnyOfTypeLinkAgent__Group__0 : rule__BoundAnyOfTypeLinkAgent__Group__0__Impl rule__BoundAnyOfTypeLinkAgent__Group__1 ;
    public final void rule__BoundAnyOfTypeLinkAgent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3643:1: ( rule__BoundAnyOfTypeLinkAgent__Group__0__Impl rule__BoundAnyOfTypeLinkAgent__Group__1 )
            // InternalReactionRules.g:3644:2: rule__BoundAnyOfTypeLinkAgent__Group__0__Impl rule__BoundAnyOfTypeLinkAgent__Group__1
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
    // InternalReactionRules.g:3651:1: rule__BoundAnyOfTypeLinkAgent__Group__0__Impl : ( () ) ;
    public final void rule__BoundAnyOfTypeLinkAgent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3655:1: ( ( () ) )
            // InternalReactionRules.g:3656:1: ( () )
            {
            // InternalReactionRules.g:3656:1: ( () )
            // InternalReactionRules.g:3657:2: ()
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getBoundAnyOfTypeLinkAgentAction_0()); 
            // InternalReactionRules.g:3658:2: ()
            // InternalReactionRules.g:3658:3: 
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
    // InternalReactionRules.g:3666:1: rule__BoundAnyOfTypeLinkAgent__Group__1 : rule__BoundAnyOfTypeLinkAgent__Group__1__Impl ;
    public final void rule__BoundAnyOfTypeLinkAgent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3670:1: ( rule__BoundAnyOfTypeLinkAgent__Group__1__Impl )
            // InternalReactionRules.g:3671:2: rule__BoundAnyOfTypeLinkAgent__Group__1__Impl
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
    // InternalReactionRules.g:3677:1: rule__BoundAnyOfTypeLinkAgent__Group__1__Impl : ( ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 ) ) ;
    public final void rule__BoundAnyOfTypeLinkAgent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3681:1: ( ( ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 ) ) )
            // InternalReactionRules.g:3682:1: ( ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 ) )
            {
            // InternalReactionRules.g:3682:1: ( ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 ) )
            // InternalReactionRules.g:3683:2: ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getAgentAssignment_1()); 
            // InternalReactionRules.g:3684:2: ( rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 )
            // InternalReactionRules.g:3684:3: rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1
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
    // InternalReactionRules.g:3693:1: rule__BoundAnyOfTypeLinkSite__Group__0 : rule__BoundAnyOfTypeLinkSite__Group__0__Impl rule__BoundAnyOfTypeLinkSite__Group__1 ;
    public final void rule__BoundAnyOfTypeLinkSite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3697:1: ( rule__BoundAnyOfTypeLinkSite__Group__0__Impl rule__BoundAnyOfTypeLinkSite__Group__1 )
            // InternalReactionRules.g:3698:2: rule__BoundAnyOfTypeLinkSite__Group__0__Impl rule__BoundAnyOfTypeLinkSite__Group__1
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
    // InternalReactionRules.g:3705:1: rule__BoundAnyOfTypeLinkSite__Group__0__Impl : ( () ) ;
    public final void rule__BoundAnyOfTypeLinkSite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3709:1: ( ( () ) )
            // InternalReactionRules.g:3710:1: ( () )
            {
            // InternalReactionRules.g:3710:1: ( () )
            // InternalReactionRules.g:3711:2: ()
            {
             before(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getBoundAnyOfTypeLinkSiteAction_0()); 
            // InternalReactionRules.g:3712:2: ()
            // InternalReactionRules.g:3712:3: 
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
    // InternalReactionRules.g:3720:1: rule__BoundAnyOfTypeLinkSite__Group__1 : rule__BoundAnyOfTypeLinkSite__Group__1__Impl ;
    public final void rule__BoundAnyOfTypeLinkSite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3724:1: ( rule__BoundAnyOfTypeLinkSite__Group__1__Impl )
            // InternalReactionRules.g:3725:2: rule__BoundAnyOfTypeLinkSite__Group__1__Impl
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
    // InternalReactionRules.g:3731:1: rule__BoundAnyOfTypeLinkSite__Group__1__Impl : ( ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 ) ) ;
    public final void rule__BoundAnyOfTypeLinkSite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3735:1: ( ( ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 ) ) )
            // InternalReactionRules.g:3736:1: ( ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 ) )
            {
            // InternalReactionRules.g:3736:1: ( ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 ) )
            // InternalReactionRules.g:3737:2: ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getSiteAssignment_1()); 
            // InternalReactionRules.g:3738:2: ( rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 )
            // InternalReactionRules.g:3738:3: rule__BoundAnyOfTypeLinkSite__SiteAssignment_1
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
    // InternalReactionRules.g:3747:1: rule__BoundAnyOfTypeLink__Group__0 : rule__BoundAnyOfTypeLink__Group__0__Impl rule__BoundAnyOfTypeLink__Group__1 ;
    public final void rule__BoundAnyOfTypeLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3751:1: ( rule__BoundAnyOfTypeLink__Group__0__Impl rule__BoundAnyOfTypeLink__Group__1 )
            // InternalReactionRules.g:3752:2: rule__BoundAnyOfTypeLink__Group__0__Impl rule__BoundAnyOfTypeLink__Group__1
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
    // InternalReactionRules.g:3759:1: rule__BoundAnyOfTypeLink__Group__0__Impl : ( () ) ;
    public final void rule__BoundAnyOfTypeLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3763:1: ( ( () ) )
            // InternalReactionRules.g:3764:1: ( () )
            {
            // InternalReactionRules.g:3764:1: ( () )
            // InternalReactionRules.g:3765:2: ()
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAccess().getBoundAnyOfTypeLinkAction_0()); 
            // InternalReactionRules.g:3766:2: ()
            // InternalReactionRules.g:3766:3: 
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
    // InternalReactionRules.g:3774:1: rule__BoundAnyOfTypeLink__Group__1 : rule__BoundAnyOfTypeLink__Group__1__Impl rule__BoundAnyOfTypeLink__Group__2 ;
    public final void rule__BoundAnyOfTypeLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3778:1: ( rule__BoundAnyOfTypeLink__Group__1__Impl rule__BoundAnyOfTypeLink__Group__2 )
            // InternalReactionRules.g:3779:2: rule__BoundAnyOfTypeLink__Group__1__Impl rule__BoundAnyOfTypeLink__Group__2
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
    // InternalReactionRules.g:3786:1: rule__BoundAnyOfTypeLink__Group__1__Impl : ( ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 ) ) ;
    public final void rule__BoundAnyOfTypeLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3790:1: ( ( ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 ) ) )
            // InternalReactionRules.g:3791:1: ( ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 ) )
            {
            // InternalReactionRules.g:3791:1: ( ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 ) )
            // InternalReactionRules.g:3792:2: ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAccess().getLinkAgentAssignment_1()); 
            // InternalReactionRules.g:3793:2: ( rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 )
            // InternalReactionRules.g:3793:3: rule__BoundAnyOfTypeLink__LinkAgentAssignment_1
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
    // InternalReactionRules.g:3801:1: rule__BoundAnyOfTypeLink__Group__2 : rule__BoundAnyOfTypeLink__Group__2__Impl rule__BoundAnyOfTypeLink__Group__3 ;
    public final void rule__BoundAnyOfTypeLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3805:1: ( rule__BoundAnyOfTypeLink__Group__2__Impl rule__BoundAnyOfTypeLink__Group__3 )
            // InternalReactionRules.g:3806:2: rule__BoundAnyOfTypeLink__Group__2__Impl rule__BoundAnyOfTypeLink__Group__3
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
    // InternalReactionRules.g:3813:1: rule__BoundAnyOfTypeLink__Group__2__Impl : ( '.' ) ;
    public final void rule__BoundAnyOfTypeLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3817:1: ( ( '.' ) )
            // InternalReactionRules.g:3818:1: ( '.' )
            {
            // InternalReactionRules.g:3818:1: ( '.' )
            // InternalReactionRules.g:3819:2: '.'
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
    // InternalReactionRules.g:3828:1: rule__BoundAnyOfTypeLink__Group__3 : rule__BoundAnyOfTypeLink__Group__3__Impl ;
    public final void rule__BoundAnyOfTypeLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3832:1: ( rule__BoundAnyOfTypeLink__Group__3__Impl )
            // InternalReactionRules.g:3833:2: rule__BoundAnyOfTypeLink__Group__3__Impl
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
    // InternalReactionRules.g:3839:1: rule__BoundAnyOfTypeLink__Group__3__Impl : ( ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 ) ) ;
    public final void rule__BoundAnyOfTypeLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3843:1: ( ( ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 ) ) )
            // InternalReactionRules.g:3844:1: ( ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 ) )
            {
            // InternalReactionRules.g:3844:1: ( ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 ) )
            // InternalReactionRules.g:3845:2: ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAccess().getLinkSiteAssignment_3()); 
            // InternalReactionRules.g:3846:2: ( rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 )
            // InternalReactionRules.g:3846:3: rule__BoundAnyOfTypeLink__LinkSiteAssignment_3
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
    // InternalReactionRules.g:3855:1: rule__SiteState__Group__0 : rule__SiteState__Group__0__Impl rule__SiteState__Group__1 ;
    public final void rule__SiteState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3859:1: ( rule__SiteState__Group__0__Impl rule__SiteState__Group__1 )
            // InternalReactionRules.g:3860:2: rule__SiteState__Group__0__Impl rule__SiteState__Group__1
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
    // InternalReactionRules.g:3867:1: rule__SiteState__Group__0__Impl : ( () ) ;
    public final void rule__SiteState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3871:1: ( ( () ) )
            // InternalReactionRules.g:3872:1: ( () )
            {
            // InternalReactionRules.g:3872:1: ( () )
            // InternalReactionRules.g:3873:2: ()
            {
             before(grammarAccess.getSiteStateAccess().getSiteStateAction_0()); 
            // InternalReactionRules.g:3874:2: ()
            // InternalReactionRules.g:3874:3: 
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
    // InternalReactionRules.g:3882:1: rule__SiteState__Group__1 : rule__SiteState__Group__1__Impl rule__SiteState__Group__2 ;
    public final void rule__SiteState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3886:1: ( rule__SiteState__Group__1__Impl rule__SiteState__Group__2 )
            // InternalReactionRules.g:3887:2: rule__SiteState__Group__1__Impl rule__SiteState__Group__2
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
    // InternalReactionRules.g:3894:1: rule__SiteState__Group__1__Impl : ( '{' ) ;
    public final void rule__SiteState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3898:1: ( ( '{' ) )
            // InternalReactionRules.g:3899:1: ( '{' )
            {
            // InternalReactionRules.g:3899:1: ( '{' )
            // InternalReactionRules.g:3900:2: '{'
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
    // InternalReactionRules.g:3909:1: rule__SiteState__Group__2 : rule__SiteState__Group__2__Impl rule__SiteState__Group__3 ;
    public final void rule__SiteState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3913:1: ( rule__SiteState__Group__2__Impl rule__SiteState__Group__3 )
            // InternalReactionRules.g:3914:2: rule__SiteState__Group__2__Impl rule__SiteState__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalReactionRules.g:3921:1: rule__SiteState__Group__2__Impl : ( ( rule__SiteState__StateAssignment_2 ) ) ;
    public final void rule__SiteState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3925:1: ( ( ( rule__SiteState__StateAssignment_2 ) ) )
            // InternalReactionRules.g:3926:1: ( ( rule__SiteState__StateAssignment_2 ) )
            {
            // InternalReactionRules.g:3926:1: ( ( rule__SiteState__StateAssignment_2 ) )
            // InternalReactionRules.g:3927:2: ( rule__SiteState__StateAssignment_2 )
            {
             before(grammarAccess.getSiteStateAccess().getStateAssignment_2()); 
            // InternalReactionRules.g:3928:2: ( rule__SiteState__StateAssignment_2 )
            // InternalReactionRules.g:3928:3: rule__SiteState__StateAssignment_2
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
    // InternalReactionRules.g:3936:1: rule__SiteState__Group__3 : rule__SiteState__Group__3__Impl ;
    public final void rule__SiteState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3940:1: ( rule__SiteState__Group__3__Impl )
            // InternalReactionRules.g:3941:2: rule__SiteState__Group__3__Impl
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
    // InternalReactionRules.g:3947:1: rule__SiteState__Group__3__Impl : ( '}' ) ;
    public final void rule__SiteState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3951:1: ( ( '}' ) )
            // InternalReactionRules.g:3952:1: ( '}' )
            {
            // InternalReactionRules.g:3952:1: ( '}' )
            // InternalReactionRules.g:3953:2: '}'
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
    // InternalReactionRules.g:3963:1: rule__LinkState__Group__0 : rule__LinkState__Group__0__Impl rule__LinkState__Group__1 ;
    public final void rule__LinkState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3967:1: ( rule__LinkState__Group__0__Impl rule__LinkState__Group__1 )
            // InternalReactionRules.g:3968:2: rule__LinkState__Group__0__Impl rule__LinkState__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalReactionRules.g:3975:1: rule__LinkState__Group__0__Impl : ( () ) ;
    public final void rule__LinkState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3979:1: ( ( () ) )
            // InternalReactionRules.g:3980:1: ( () )
            {
            // InternalReactionRules.g:3980:1: ( () )
            // InternalReactionRules.g:3981:2: ()
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAction_0()); 
            // InternalReactionRules.g:3982:2: ()
            // InternalReactionRules.g:3982:3: 
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
    // InternalReactionRules.g:3990:1: rule__LinkState__Group__1 : rule__LinkState__Group__1__Impl rule__LinkState__Group__2 ;
    public final void rule__LinkState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3994:1: ( rule__LinkState__Group__1__Impl rule__LinkState__Group__2 )
            // InternalReactionRules.g:3995:2: rule__LinkState__Group__1__Impl rule__LinkState__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalReactionRules.g:4002:1: rule__LinkState__Group__1__Impl : ( '[' ) ;
    public final void rule__LinkState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4006:1: ( ( '[' ) )
            // InternalReactionRules.g:4007:1: ( '[' )
            {
            // InternalReactionRules.g:4007:1: ( '[' )
            // InternalReactionRules.g:4008:2: '['
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
    // InternalReactionRules.g:4017:1: rule__LinkState__Group__2 : rule__LinkState__Group__2__Impl rule__LinkState__Group__3 ;
    public final void rule__LinkState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4021:1: ( rule__LinkState__Group__2__Impl rule__LinkState__Group__3 )
            // InternalReactionRules.g:4022:2: rule__LinkState__Group__2__Impl rule__LinkState__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalReactionRules.g:4029:1: rule__LinkState__Group__2__Impl : ( ( rule__LinkState__LinkStateAssignment_2 ) ) ;
    public final void rule__LinkState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4033:1: ( ( ( rule__LinkState__LinkStateAssignment_2 ) ) )
            // InternalReactionRules.g:4034:1: ( ( rule__LinkState__LinkStateAssignment_2 ) )
            {
            // InternalReactionRules.g:4034:1: ( ( rule__LinkState__LinkStateAssignment_2 ) )
            // InternalReactionRules.g:4035:2: ( rule__LinkState__LinkStateAssignment_2 )
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAssignment_2()); 
            // InternalReactionRules.g:4036:2: ( rule__LinkState__LinkStateAssignment_2 )
            // InternalReactionRules.g:4036:3: rule__LinkState__LinkStateAssignment_2
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
    // InternalReactionRules.g:4044:1: rule__LinkState__Group__3 : rule__LinkState__Group__3__Impl ;
    public final void rule__LinkState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4048:1: ( rule__LinkState__Group__3__Impl )
            // InternalReactionRules.g:4049:2: rule__LinkState__Group__3__Impl
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
    // InternalReactionRules.g:4055:1: rule__LinkState__Group__3__Impl : ( ']' ) ;
    public final void rule__LinkState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4059:1: ( ( ']' ) )
            // InternalReactionRules.g:4060:1: ( ']' )
            {
            // InternalReactionRules.g:4060:1: ( ']' )
            // InternalReactionRules.g:4061:2: ']'
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
    // InternalReactionRules.g:4071:1: rule__MultiLinkState__Group__0 : rule__MultiLinkState__Group__0__Impl rule__MultiLinkState__Group__1 ;
    public final void rule__MultiLinkState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4075:1: ( rule__MultiLinkState__Group__0__Impl rule__MultiLinkState__Group__1 )
            // InternalReactionRules.g:4076:2: rule__MultiLinkState__Group__0__Impl rule__MultiLinkState__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalReactionRules.g:4083:1: rule__MultiLinkState__Group__0__Impl : ( () ) ;
    public final void rule__MultiLinkState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4087:1: ( ( () ) )
            // InternalReactionRules.g:4088:1: ( () )
            {
            // InternalReactionRules.g:4088:1: ( () )
            // InternalReactionRules.g:4089:2: ()
            {
             before(grammarAccess.getMultiLinkStateAccess().getMultiLinkStateAction_0()); 
            // InternalReactionRules.g:4090:2: ()
            // InternalReactionRules.g:4090:3: 
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
    // InternalReactionRules.g:4098:1: rule__MultiLinkState__Group__1 : rule__MultiLinkState__Group__1__Impl rule__MultiLinkState__Group__2 ;
    public final void rule__MultiLinkState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4102:1: ( rule__MultiLinkState__Group__1__Impl rule__MultiLinkState__Group__2 )
            // InternalReactionRules.g:4103:2: rule__MultiLinkState__Group__1__Impl rule__MultiLinkState__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalReactionRules.g:4110:1: rule__MultiLinkState__Group__1__Impl : ( '*[' ) ;
    public final void rule__MultiLinkState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4114:1: ( ( '*[' ) )
            // InternalReactionRules.g:4115:1: ( '*[' )
            {
            // InternalReactionRules.g:4115:1: ( '*[' )
            // InternalReactionRules.g:4116:2: '*['
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
    // InternalReactionRules.g:4125:1: rule__MultiLinkState__Group__2 : rule__MultiLinkState__Group__2__Impl rule__MultiLinkState__Group__3 ;
    public final void rule__MultiLinkState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4129:1: ( rule__MultiLinkState__Group__2__Impl rule__MultiLinkState__Group__3 )
            // InternalReactionRules.g:4130:2: rule__MultiLinkState__Group__2__Impl rule__MultiLinkState__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalReactionRules.g:4137:1: rule__MultiLinkState__Group__2__Impl : ( ( rule__MultiLinkState__LinkStateAssignment_2 ) ) ;
    public final void rule__MultiLinkState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4141:1: ( ( ( rule__MultiLinkState__LinkStateAssignment_2 ) ) )
            // InternalReactionRules.g:4142:1: ( ( rule__MultiLinkState__LinkStateAssignment_2 ) )
            {
            // InternalReactionRules.g:4142:1: ( ( rule__MultiLinkState__LinkStateAssignment_2 ) )
            // InternalReactionRules.g:4143:2: ( rule__MultiLinkState__LinkStateAssignment_2 )
            {
             before(grammarAccess.getMultiLinkStateAccess().getLinkStateAssignment_2()); 
            // InternalReactionRules.g:4144:2: ( rule__MultiLinkState__LinkStateAssignment_2 )
            // InternalReactionRules.g:4144:3: rule__MultiLinkState__LinkStateAssignment_2
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
    // InternalReactionRules.g:4152:1: rule__MultiLinkState__Group__3 : rule__MultiLinkState__Group__3__Impl ;
    public final void rule__MultiLinkState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4156:1: ( rule__MultiLinkState__Group__3__Impl )
            // InternalReactionRules.g:4157:2: rule__MultiLinkState__Group__3__Impl
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
    // InternalReactionRules.g:4163:1: rule__MultiLinkState__Group__3__Impl : ( ']' ) ;
    public final void rule__MultiLinkState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4167:1: ( ( ']' ) )
            // InternalReactionRules.g:4168:1: ( ']' )
            {
            // InternalReactionRules.g:4168:1: ( ']' )
            // InternalReactionRules.g:4169:2: ']'
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
    // InternalReactionRules.g:4179:1: rule__SingleSitePattern__Group__0 : rule__SingleSitePattern__Group__0__Impl rule__SingleSitePattern__Group__1 ;
    public final void rule__SingleSitePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4183:1: ( rule__SingleSitePattern__Group__0__Impl rule__SingleSitePattern__Group__1 )
            // InternalReactionRules.g:4184:2: rule__SingleSitePattern__Group__0__Impl rule__SingleSitePattern__Group__1
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
    // InternalReactionRules.g:4191:1: rule__SingleSitePattern__Group__0__Impl : ( () ) ;
    public final void rule__SingleSitePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4195:1: ( ( () ) )
            // InternalReactionRules.g:4196:1: ( () )
            {
            // InternalReactionRules.g:4196:1: ( () )
            // InternalReactionRules.g:4197:2: ()
            {
             before(grammarAccess.getSingleSitePatternAccess().getSingleSitePatternAction_0()); 
            // InternalReactionRules.g:4198:2: ()
            // InternalReactionRules.g:4198:3: 
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
    // InternalReactionRules.g:4206:1: rule__SingleSitePattern__Group__1 : rule__SingleSitePattern__Group__1__Impl rule__SingleSitePattern__Group__2 ;
    public final void rule__SingleSitePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4210:1: ( rule__SingleSitePattern__Group__1__Impl rule__SingleSitePattern__Group__2 )
            // InternalReactionRules.g:4211:2: rule__SingleSitePattern__Group__1__Impl rule__SingleSitePattern__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalReactionRules.g:4218:1: rule__SingleSitePattern__Group__1__Impl : ( ( rule__SingleSitePattern__SiteAssignment_1 ) ) ;
    public final void rule__SingleSitePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4222:1: ( ( ( rule__SingleSitePattern__SiteAssignment_1 ) ) )
            // InternalReactionRules.g:4223:1: ( ( rule__SingleSitePattern__SiteAssignment_1 ) )
            {
            // InternalReactionRules.g:4223:1: ( ( rule__SingleSitePattern__SiteAssignment_1 ) )
            // InternalReactionRules.g:4224:2: ( rule__SingleSitePattern__SiteAssignment_1 )
            {
             before(grammarAccess.getSingleSitePatternAccess().getSiteAssignment_1()); 
            // InternalReactionRules.g:4225:2: ( rule__SingleSitePattern__SiteAssignment_1 )
            // InternalReactionRules.g:4225:3: rule__SingleSitePattern__SiteAssignment_1
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
    // InternalReactionRules.g:4233:1: rule__SingleSitePattern__Group__2 : rule__SingleSitePattern__Group__2__Impl rule__SingleSitePattern__Group__3 ;
    public final void rule__SingleSitePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4237:1: ( rule__SingleSitePattern__Group__2__Impl rule__SingleSitePattern__Group__3 )
            // InternalReactionRules.g:4238:2: rule__SingleSitePattern__Group__2__Impl rule__SingleSitePattern__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalReactionRules.g:4245:1: rule__SingleSitePattern__Group__2__Impl : ( ( rule__SingleSitePattern__StateAssignment_2 )? ) ;
    public final void rule__SingleSitePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4249:1: ( ( ( rule__SingleSitePattern__StateAssignment_2 )? ) )
            // InternalReactionRules.g:4250:1: ( ( rule__SingleSitePattern__StateAssignment_2 )? )
            {
            // InternalReactionRules.g:4250:1: ( ( rule__SingleSitePattern__StateAssignment_2 )? )
            // InternalReactionRules.g:4251:2: ( rule__SingleSitePattern__StateAssignment_2 )?
            {
             before(grammarAccess.getSingleSitePatternAccess().getStateAssignment_2()); 
            // InternalReactionRules.g:4252:2: ( rule__SingleSitePattern__StateAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalReactionRules.g:4252:3: rule__SingleSitePattern__StateAssignment_2
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
    // InternalReactionRules.g:4260:1: rule__SingleSitePattern__Group__3 : rule__SingleSitePattern__Group__3__Impl ;
    public final void rule__SingleSitePattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4264:1: ( rule__SingleSitePattern__Group__3__Impl )
            // InternalReactionRules.g:4265:2: rule__SingleSitePattern__Group__3__Impl
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
    // InternalReactionRules.g:4271:1: rule__SingleSitePattern__Group__3__Impl : ( ( rule__SingleSitePattern__LinkStateAssignment_3 ) ) ;
    public final void rule__SingleSitePattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4275:1: ( ( ( rule__SingleSitePattern__LinkStateAssignment_3 ) ) )
            // InternalReactionRules.g:4276:1: ( ( rule__SingleSitePattern__LinkStateAssignment_3 ) )
            {
            // InternalReactionRules.g:4276:1: ( ( rule__SingleSitePattern__LinkStateAssignment_3 ) )
            // InternalReactionRules.g:4277:2: ( rule__SingleSitePattern__LinkStateAssignment_3 )
            {
             before(grammarAccess.getSingleSitePatternAccess().getLinkStateAssignment_3()); 
            // InternalReactionRules.g:4278:2: ( rule__SingleSitePattern__LinkStateAssignment_3 )
            // InternalReactionRules.g:4278:3: rule__SingleSitePattern__LinkStateAssignment_3
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
    // InternalReactionRules.g:4287:1: rule__MultiLinkSitePattern__Group__0 : rule__MultiLinkSitePattern__Group__0__Impl rule__MultiLinkSitePattern__Group__1 ;
    public final void rule__MultiLinkSitePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4291:1: ( rule__MultiLinkSitePattern__Group__0__Impl rule__MultiLinkSitePattern__Group__1 )
            // InternalReactionRules.g:4292:2: rule__MultiLinkSitePattern__Group__0__Impl rule__MultiLinkSitePattern__Group__1
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
    // InternalReactionRules.g:4299:1: rule__MultiLinkSitePattern__Group__0__Impl : ( () ) ;
    public final void rule__MultiLinkSitePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4303:1: ( ( () ) )
            // InternalReactionRules.g:4304:1: ( () )
            {
            // InternalReactionRules.g:4304:1: ( () )
            // InternalReactionRules.g:4305:2: ()
            {
             before(grammarAccess.getMultiLinkSitePatternAccess().getMultiLinkSitePatternAction_0()); 
            // InternalReactionRules.g:4306:2: ()
            // InternalReactionRules.g:4306:3: 
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
    // InternalReactionRules.g:4314:1: rule__MultiLinkSitePattern__Group__1 : rule__MultiLinkSitePattern__Group__1__Impl rule__MultiLinkSitePattern__Group__2 ;
    public final void rule__MultiLinkSitePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4318:1: ( rule__MultiLinkSitePattern__Group__1__Impl rule__MultiLinkSitePattern__Group__2 )
            // InternalReactionRules.g:4319:2: rule__MultiLinkSitePattern__Group__1__Impl rule__MultiLinkSitePattern__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalReactionRules.g:4326:1: rule__MultiLinkSitePattern__Group__1__Impl : ( ( rule__MultiLinkSitePattern__SiteAssignment_1 ) ) ;
    public final void rule__MultiLinkSitePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4330:1: ( ( ( rule__MultiLinkSitePattern__SiteAssignment_1 ) ) )
            // InternalReactionRules.g:4331:1: ( ( rule__MultiLinkSitePattern__SiteAssignment_1 ) )
            {
            // InternalReactionRules.g:4331:1: ( ( rule__MultiLinkSitePattern__SiteAssignment_1 ) )
            // InternalReactionRules.g:4332:2: ( rule__MultiLinkSitePattern__SiteAssignment_1 )
            {
             before(grammarAccess.getMultiLinkSitePatternAccess().getSiteAssignment_1()); 
            // InternalReactionRules.g:4333:2: ( rule__MultiLinkSitePattern__SiteAssignment_1 )
            // InternalReactionRules.g:4333:3: rule__MultiLinkSitePattern__SiteAssignment_1
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
    // InternalReactionRules.g:4341:1: rule__MultiLinkSitePattern__Group__2 : rule__MultiLinkSitePattern__Group__2__Impl rule__MultiLinkSitePattern__Group__3 ;
    public final void rule__MultiLinkSitePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4345:1: ( rule__MultiLinkSitePattern__Group__2__Impl rule__MultiLinkSitePattern__Group__3 )
            // InternalReactionRules.g:4346:2: rule__MultiLinkSitePattern__Group__2__Impl rule__MultiLinkSitePattern__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalReactionRules.g:4353:1: rule__MultiLinkSitePattern__Group__2__Impl : ( ( rule__MultiLinkSitePattern__StateAssignment_2 )? ) ;
    public final void rule__MultiLinkSitePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4357:1: ( ( ( rule__MultiLinkSitePattern__StateAssignment_2 )? ) )
            // InternalReactionRules.g:4358:1: ( ( rule__MultiLinkSitePattern__StateAssignment_2 )? )
            {
            // InternalReactionRules.g:4358:1: ( ( rule__MultiLinkSitePattern__StateAssignment_2 )? )
            // InternalReactionRules.g:4359:2: ( rule__MultiLinkSitePattern__StateAssignment_2 )?
            {
             before(grammarAccess.getMultiLinkSitePatternAccess().getStateAssignment_2()); 
            // InternalReactionRules.g:4360:2: ( rule__MultiLinkSitePattern__StateAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalReactionRules.g:4360:3: rule__MultiLinkSitePattern__StateAssignment_2
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
    // InternalReactionRules.g:4368:1: rule__MultiLinkSitePattern__Group__3 : rule__MultiLinkSitePattern__Group__3__Impl ;
    public final void rule__MultiLinkSitePattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4372:1: ( rule__MultiLinkSitePattern__Group__3__Impl )
            // InternalReactionRules.g:4373:2: rule__MultiLinkSitePattern__Group__3__Impl
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
    // InternalReactionRules.g:4379:1: rule__MultiLinkSitePattern__Group__3__Impl : ( ( rule__MultiLinkSitePattern__LinkStateAssignment_3 ) ) ;
    public final void rule__MultiLinkSitePattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4383:1: ( ( ( rule__MultiLinkSitePattern__LinkStateAssignment_3 ) ) )
            // InternalReactionRules.g:4384:1: ( ( rule__MultiLinkSitePattern__LinkStateAssignment_3 ) )
            {
            // InternalReactionRules.g:4384:1: ( ( rule__MultiLinkSitePattern__LinkStateAssignment_3 ) )
            // InternalReactionRules.g:4385:2: ( rule__MultiLinkSitePattern__LinkStateAssignment_3 )
            {
             before(grammarAccess.getMultiLinkSitePatternAccess().getLinkStateAssignment_3()); 
            // InternalReactionRules.g:4386:2: ( rule__MultiLinkSitePattern__LinkStateAssignment_3 )
            // InternalReactionRules.g:4386:3: rule__MultiLinkSitePattern__LinkStateAssignment_3
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
    // InternalReactionRules.g:4395:1: rule__SitePatterns__Group__0 : rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1 ;
    public final void rule__SitePatterns__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4399:1: ( rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1 )
            // InternalReactionRules.g:4400:2: rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1
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
    // InternalReactionRules.g:4407:1: rule__SitePatterns__Group__0__Impl : ( () ) ;
    public final void rule__SitePatterns__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4411:1: ( ( () ) )
            // InternalReactionRules.g:4412:1: ( () )
            {
            // InternalReactionRules.g:4412:1: ( () )
            // InternalReactionRules.g:4413:2: ()
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAction_0()); 
            // InternalReactionRules.g:4414:2: ()
            // InternalReactionRules.g:4414:3: 
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
    // InternalReactionRules.g:4422:1: rule__SitePatterns__Group__1 : rule__SitePatterns__Group__1__Impl rule__SitePatterns__Group__2 ;
    public final void rule__SitePatterns__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4426:1: ( rule__SitePatterns__Group__1__Impl rule__SitePatterns__Group__2 )
            // InternalReactionRules.g:4427:2: rule__SitePatterns__Group__1__Impl rule__SitePatterns__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalReactionRules.g:4434:1: rule__SitePatterns__Group__1__Impl : ( '(' ) ;
    public final void rule__SitePatterns__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4438:1: ( ( '(' ) )
            // InternalReactionRules.g:4439:1: ( '(' )
            {
            // InternalReactionRules.g:4439:1: ( '(' )
            // InternalReactionRules.g:4440:2: '('
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
    // InternalReactionRules.g:4449:1: rule__SitePatterns__Group__2 : rule__SitePatterns__Group__2__Impl rule__SitePatterns__Group__3 ;
    public final void rule__SitePatterns__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4453:1: ( rule__SitePatterns__Group__2__Impl rule__SitePatterns__Group__3 )
            // InternalReactionRules.g:4454:2: rule__SitePatterns__Group__2__Impl rule__SitePatterns__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalReactionRules.g:4461:1: rule__SitePatterns__Group__2__Impl : ( ( rule__SitePatterns__Group_2__0 )? ) ;
    public final void rule__SitePatterns__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4465:1: ( ( ( rule__SitePatterns__Group_2__0 )? ) )
            // InternalReactionRules.g:4466:1: ( ( rule__SitePatterns__Group_2__0 )? )
            {
            // InternalReactionRules.g:4466:1: ( ( rule__SitePatterns__Group_2__0 )? )
            // InternalReactionRules.g:4467:2: ( rule__SitePatterns__Group_2__0 )?
            {
             before(grammarAccess.getSitePatternsAccess().getGroup_2()); 
            // InternalReactionRules.g:4468:2: ( rule__SitePatterns__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalReactionRules.g:4468:3: rule__SitePatterns__Group_2__0
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
    // InternalReactionRules.g:4476:1: rule__SitePatterns__Group__3 : rule__SitePatterns__Group__3__Impl ;
    public final void rule__SitePatterns__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4480:1: ( rule__SitePatterns__Group__3__Impl )
            // InternalReactionRules.g:4481:2: rule__SitePatterns__Group__3__Impl
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
    // InternalReactionRules.g:4487:1: rule__SitePatterns__Group__3__Impl : ( ')' ) ;
    public final void rule__SitePatterns__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4491:1: ( ( ')' ) )
            // InternalReactionRules.g:4492:1: ( ')' )
            {
            // InternalReactionRules.g:4492:1: ( ')' )
            // InternalReactionRules.g:4493:2: ')'
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
    // InternalReactionRules.g:4503:1: rule__SitePatterns__Group_2__0 : rule__SitePatterns__Group_2__0__Impl rule__SitePatterns__Group_2__1 ;
    public final void rule__SitePatterns__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4507:1: ( rule__SitePatterns__Group_2__0__Impl rule__SitePatterns__Group_2__1 )
            // InternalReactionRules.g:4508:2: rule__SitePatterns__Group_2__0__Impl rule__SitePatterns__Group_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalReactionRules.g:4515:1: rule__SitePatterns__Group_2__0__Impl : ( ( rule__SitePatterns__SitePatternsAssignment_2_0 ) ) ;
    public final void rule__SitePatterns__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4519:1: ( ( ( rule__SitePatterns__SitePatternsAssignment_2_0 ) ) )
            // InternalReactionRules.g:4520:1: ( ( rule__SitePatterns__SitePatternsAssignment_2_0 ) )
            {
            // InternalReactionRules.g:4520:1: ( ( rule__SitePatterns__SitePatternsAssignment_2_0 ) )
            // InternalReactionRules.g:4521:2: ( rule__SitePatterns__SitePatternsAssignment_2_0 )
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAssignment_2_0()); 
            // InternalReactionRules.g:4522:2: ( rule__SitePatterns__SitePatternsAssignment_2_0 )
            // InternalReactionRules.g:4522:3: rule__SitePatterns__SitePatternsAssignment_2_0
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
    // InternalReactionRules.g:4530:1: rule__SitePatterns__Group_2__1 : rule__SitePatterns__Group_2__1__Impl ;
    public final void rule__SitePatterns__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4534:1: ( rule__SitePatterns__Group_2__1__Impl )
            // InternalReactionRules.g:4535:2: rule__SitePatterns__Group_2__1__Impl
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
    // InternalReactionRules.g:4541:1: rule__SitePatterns__Group_2__1__Impl : ( ( rule__SitePatterns__Group_2_1__0 )* ) ;
    public final void rule__SitePatterns__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4545:1: ( ( ( rule__SitePatterns__Group_2_1__0 )* ) )
            // InternalReactionRules.g:4546:1: ( ( rule__SitePatterns__Group_2_1__0 )* )
            {
            // InternalReactionRules.g:4546:1: ( ( rule__SitePatterns__Group_2_1__0 )* )
            // InternalReactionRules.g:4547:2: ( rule__SitePatterns__Group_2_1__0 )*
            {
             before(grammarAccess.getSitePatternsAccess().getGroup_2_1()); 
            // InternalReactionRules.g:4548:2: ( rule__SitePatterns__Group_2_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==25) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalReactionRules.g:4548:3: rule__SitePatterns__Group_2_1__0
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
    // InternalReactionRules.g:4557:1: rule__SitePatterns__Group_2_1__0 : rule__SitePatterns__Group_2_1__0__Impl rule__SitePatterns__Group_2_1__1 ;
    public final void rule__SitePatterns__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4561:1: ( rule__SitePatterns__Group_2_1__0__Impl rule__SitePatterns__Group_2_1__1 )
            // InternalReactionRules.g:4562:2: rule__SitePatterns__Group_2_1__0__Impl rule__SitePatterns__Group_2_1__1
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
    // InternalReactionRules.g:4569:1: rule__SitePatterns__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SitePatterns__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4573:1: ( ( ',' ) )
            // InternalReactionRules.g:4574:1: ( ',' )
            {
            // InternalReactionRules.g:4574:1: ( ',' )
            // InternalReactionRules.g:4575:2: ','
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
    // InternalReactionRules.g:4584:1: rule__SitePatterns__Group_2_1__1 : rule__SitePatterns__Group_2_1__1__Impl ;
    public final void rule__SitePatterns__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4588:1: ( rule__SitePatterns__Group_2_1__1__Impl )
            // InternalReactionRules.g:4589:2: rule__SitePatterns__Group_2_1__1__Impl
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
    // InternalReactionRules.g:4595:1: rule__SitePatterns__Group_2_1__1__Impl : ( ( rule__SitePatterns__SitePatternsAssignment_2_1_1 ) ) ;
    public final void rule__SitePatterns__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4599:1: ( ( ( rule__SitePatterns__SitePatternsAssignment_2_1_1 ) ) )
            // InternalReactionRules.g:4600:1: ( ( rule__SitePatterns__SitePatternsAssignment_2_1_1 ) )
            {
            // InternalReactionRules.g:4600:1: ( ( rule__SitePatterns__SitePatternsAssignment_2_1_1 ) )
            // InternalReactionRules.g:4601:2: ( rule__SitePatterns__SitePatternsAssignment_2_1_1 )
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAssignment_2_1_1()); 
            // InternalReactionRules.g:4602:2: ( rule__SitePatterns__SitePatternsAssignment_2_1_1 )
            // InternalReactionRules.g:4602:3: rule__SitePatterns__SitePatternsAssignment_2_1_1
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
    // InternalReactionRules.g:4611:1: rule__ValidAgentPattern__Group__0 : rule__ValidAgentPattern__Group__0__Impl rule__ValidAgentPattern__Group__1 ;
    public final void rule__ValidAgentPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4615:1: ( rule__ValidAgentPattern__Group__0__Impl rule__ValidAgentPattern__Group__1 )
            // InternalReactionRules.g:4616:2: rule__ValidAgentPattern__Group__0__Impl rule__ValidAgentPattern__Group__1
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
    // InternalReactionRules.g:4623:1: rule__ValidAgentPattern__Group__0__Impl : ( () ) ;
    public final void rule__ValidAgentPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4627:1: ( ( () ) )
            // InternalReactionRules.g:4628:1: ( () )
            {
            // InternalReactionRules.g:4628:1: ( () )
            // InternalReactionRules.g:4629:2: ()
            {
             before(grammarAccess.getValidAgentPatternAccess().getValidAgentPatternAction_0()); 
            // InternalReactionRules.g:4630:2: ()
            // InternalReactionRules.g:4630:3: 
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
    // InternalReactionRules.g:4638:1: rule__ValidAgentPattern__Group__1 : rule__ValidAgentPattern__Group__1__Impl rule__ValidAgentPattern__Group__2 ;
    public final void rule__ValidAgentPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4642:1: ( rule__ValidAgentPattern__Group__1__Impl rule__ValidAgentPattern__Group__2 )
            // InternalReactionRules.g:4643:2: rule__ValidAgentPattern__Group__1__Impl rule__ValidAgentPattern__Group__2
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
    // InternalReactionRules.g:4650:1: rule__ValidAgentPattern__Group__1__Impl : ( ( rule__ValidAgentPattern__AgentAssignment_1 ) ) ;
    public final void rule__ValidAgentPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4654:1: ( ( ( rule__ValidAgentPattern__AgentAssignment_1 ) ) )
            // InternalReactionRules.g:4655:1: ( ( rule__ValidAgentPattern__AgentAssignment_1 ) )
            {
            // InternalReactionRules.g:4655:1: ( ( rule__ValidAgentPattern__AgentAssignment_1 ) )
            // InternalReactionRules.g:4656:2: ( rule__ValidAgentPattern__AgentAssignment_1 )
            {
             before(grammarAccess.getValidAgentPatternAccess().getAgentAssignment_1()); 
            // InternalReactionRules.g:4657:2: ( rule__ValidAgentPattern__AgentAssignment_1 )
            // InternalReactionRules.g:4657:3: rule__ValidAgentPattern__AgentAssignment_1
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
    // InternalReactionRules.g:4665:1: rule__ValidAgentPattern__Group__2 : rule__ValidAgentPattern__Group__2__Impl ;
    public final void rule__ValidAgentPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4669:1: ( rule__ValidAgentPattern__Group__2__Impl )
            // InternalReactionRules.g:4670:2: rule__ValidAgentPattern__Group__2__Impl
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
    // InternalReactionRules.g:4676:1: rule__ValidAgentPattern__Group__2__Impl : ( ( rule__ValidAgentPattern__SitePatternsAssignment_2 ) ) ;
    public final void rule__ValidAgentPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4680:1: ( ( ( rule__ValidAgentPattern__SitePatternsAssignment_2 ) ) )
            // InternalReactionRules.g:4681:1: ( ( rule__ValidAgentPattern__SitePatternsAssignment_2 ) )
            {
            // InternalReactionRules.g:4681:1: ( ( rule__ValidAgentPattern__SitePatternsAssignment_2 ) )
            // InternalReactionRules.g:4682:2: ( rule__ValidAgentPattern__SitePatternsAssignment_2 )
            {
             before(grammarAccess.getValidAgentPatternAccess().getSitePatternsAssignment_2()); 
            // InternalReactionRules.g:4683:2: ( rule__ValidAgentPattern__SitePatternsAssignment_2 )
            // InternalReactionRules.g:4683:3: rule__ValidAgentPattern__SitePatternsAssignment_2
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
    // InternalReactionRules.g:4692:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4696:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalReactionRules.g:4697:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // InternalReactionRules.g:4704:1: rule__Pattern__Group__0__Impl : ( () ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4708:1: ( ( () ) )
            // InternalReactionRules.g:4709:1: ( () )
            {
            // InternalReactionRules.g:4709:1: ( () )
            // InternalReactionRules.g:4710:2: ()
            {
             before(grammarAccess.getPatternAccess().getPatternAction_0()); 
            // InternalReactionRules.g:4711:2: ()
            // InternalReactionRules.g:4711:3: 
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
    // InternalReactionRules.g:4719:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4723:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalReactionRules.g:4724:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalReactionRules.g:4731:1: rule__Pattern__Group__1__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4735:1: ( ( '{' ) )
            // InternalReactionRules.g:4736:1: ( '{' )
            {
            // InternalReactionRules.g:4736:1: ( '{' )
            // InternalReactionRules.g:4737:2: '{'
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
    // InternalReactionRules.g:4746:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4750:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalReactionRules.g:4751:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalReactionRules.g:4758:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__Group_2__0 )? ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4762:1: ( ( ( rule__Pattern__Group_2__0 )? ) )
            // InternalReactionRules.g:4763:1: ( ( rule__Pattern__Group_2__0 )? )
            {
            // InternalReactionRules.g:4763:1: ( ( rule__Pattern__Group_2__0 )? )
            // InternalReactionRules.g:4764:2: ( rule__Pattern__Group_2__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_2()); 
            // InternalReactionRules.g:4765:2: ( rule__Pattern__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==RULE_VOID_PATTERN) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalReactionRules.g:4765:3: rule__Pattern__Group_2__0
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
    // InternalReactionRules.g:4773:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4777:1: ( rule__Pattern__Group__3__Impl )
            // InternalReactionRules.g:4778:2: rule__Pattern__Group__3__Impl
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
    // InternalReactionRules.g:4784:1: rule__Pattern__Group__3__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4788:1: ( ( '}' ) )
            // InternalReactionRules.g:4789:1: ( '}' )
            {
            // InternalReactionRules.g:4789:1: ( '}' )
            // InternalReactionRules.g:4790:2: '}'
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
    // InternalReactionRules.g:4800:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4804:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalReactionRules.g:4805:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalReactionRules.g:4812:1: rule__Pattern__Group_2__0__Impl : ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4816:1: ( ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) ) )
            // InternalReactionRules.g:4817:1: ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) )
            {
            // InternalReactionRules.g:4817:1: ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) )
            // InternalReactionRules.g:4818:2: ( rule__Pattern__AgentPatternsAssignment_2_0 )
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAssignment_2_0()); 
            // InternalReactionRules.g:4819:2: ( rule__Pattern__AgentPatternsAssignment_2_0 )
            // InternalReactionRules.g:4819:3: rule__Pattern__AgentPatternsAssignment_2_0
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
    // InternalReactionRules.g:4827:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4831:1: ( rule__Pattern__Group_2__1__Impl )
            // InternalReactionRules.g:4832:2: rule__Pattern__Group_2__1__Impl
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
    // InternalReactionRules.g:4838:1: rule__Pattern__Group_2__1__Impl : ( ( rule__Pattern__Group_2_1__0 )* ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4842:1: ( ( ( rule__Pattern__Group_2_1__0 )* ) )
            // InternalReactionRules.g:4843:1: ( ( rule__Pattern__Group_2_1__0 )* )
            {
            // InternalReactionRules.g:4843:1: ( ( rule__Pattern__Group_2_1__0 )* )
            // InternalReactionRules.g:4844:2: ( rule__Pattern__Group_2_1__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1()); 
            // InternalReactionRules.g:4845:2: ( rule__Pattern__Group_2_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==25) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalReactionRules.g:4845:3: rule__Pattern__Group_2_1__0
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
    // InternalReactionRules.g:4854:1: rule__Pattern__Group_2_1__0 : rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 ;
    public final void rule__Pattern__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4858:1: ( rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 )
            // InternalReactionRules.g:4859:2: rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalReactionRules.g:4866:1: rule__Pattern__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4870:1: ( ( ',' ) )
            // InternalReactionRules.g:4871:1: ( ',' )
            {
            // InternalReactionRules.g:4871:1: ( ',' )
            // InternalReactionRules.g:4872:2: ','
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
    // InternalReactionRules.g:4881:1: rule__Pattern__Group_2_1__1 : rule__Pattern__Group_2_1__1__Impl ;
    public final void rule__Pattern__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4885:1: ( rule__Pattern__Group_2_1__1__Impl )
            // InternalReactionRules.g:4886:2: rule__Pattern__Group_2_1__1__Impl
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
    // InternalReactionRules.g:4892:1: rule__Pattern__Group_2_1__1__Impl : ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) ) ;
    public final void rule__Pattern__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4896:1: ( ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) ) )
            // InternalReactionRules.g:4897:1: ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) )
            {
            // InternalReactionRules.g:4897:1: ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) )
            // InternalReactionRules.g:4898:2: ( rule__Pattern__AgentPatternsAssignment_2_1_1 )
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAssignment_2_1_1()); 
            // InternalReactionRules.g:4899:2: ( rule__Pattern__AgentPatternsAssignment_2_1_1 )
            // InternalReactionRules.g:4899:3: rule__Pattern__AgentPatternsAssignment_2_1_1
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
    // InternalReactionRules.g:4908:1: rule__Observation__Group__0 : rule__Observation__Group__0__Impl rule__Observation__Group__1 ;
    public final void rule__Observation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4912:1: ( rule__Observation__Group__0__Impl rule__Observation__Group__1 )
            // InternalReactionRules.g:4913:2: rule__Observation__Group__0__Impl rule__Observation__Group__1
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
    // InternalReactionRules.g:4920:1: rule__Observation__Group__0__Impl : ( 'obs' ) ;
    public final void rule__Observation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4924:1: ( ( 'obs' ) )
            // InternalReactionRules.g:4925:1: ( 'obs' )
            {
            // InternalReactionRules.g:4925:1: ( 'obs' )
            // InternalReactionRules.g:4926:2: 'obs'
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
    // InternalReactionRules.g:4935:1: rule__Observation__Group__1 : rule__Observation__Group__1__Impl rule__Observation__Group__2 ;
    public final void rule__Observation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4939:1: ( rule__Observation__Group__1__Impl rule__Observation__Group__2 )
            // InternalReactionRules.g:4940:2: rule__Observation__Group__1__Impl rule__Observation__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalReactionRules.g:4947:1: rule__Observation__Group__1__Impl : ( ( rule__Observation__NameAssignment_1 ) ) ;
    public final void rule__Observation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4951:1: ( ( ( rule__Observation__NameAssignment_1 ) ) )
            // InternalReactionRules.g:4952:1: ( ( rule__Observation__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:4952:1: ( ( rule__Observation__NameAssignment_1 ) )
            // InternalReactionRules.g:4953:2: ( rule__Observation__NameAssignment_1 )
            {
             before(grammarAccess.getObservationAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:4954:2: ( rule__Observation__NameAssignment_1 )
            // InternalReactionRules.g:4954:3: rule__Observation__NameAssignment_1
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
    // InternalReactionRules.g:4962:1: rule__Observation__Group__2 : rule__Observation__Group__2__Impl ;
    public final void rule__Observation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4966:1: ( rule__Observation__Group__2__Impl )
            // InternalReactionRules.g:4967:2: rule__Observation__Group__2__Impl
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
    // InternalReactionRules.g:4973:1: rule__Observation__Group__2__Impl : ( ( rule__Observation__ObservationPatternAssignment_2 ) ) ;
    public final void rule__Observation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4977:1: ( ( ( rule__Observation__ObservationPatternAssignment_2 ) ) )
            // InternalReactionRules.g:4978:1: ( ( rule__Observation__ObservationPatternAssignment_2 ) )
            {
            // InternalReactionRules.g:4978:1: ( ( rule__Observation__ObservationPatternAssignment_2 ) )
            // InternalReactionRules.g:4979:2: ( rule__Observation__ObservationPatternAssignment_2 )
            {
             before(grammarAccess.getObservationAccess().getObservationPatternAssignment_2()); 
            // InternalReactionRules.g:4980:2: ( rule__Observation__ObservationPatternAssignment_2 )
            // InternalReactionRules.g:4980:3: rule__Observation__ObservationPatternAssignment_2
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
    // InternalReactionRules.g:4989:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4993:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // InternalReactionRules.g:4994:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
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
    // InternalReactionRules.g:5001:1: rule__Initial__Group__0__Impl : ( 'init' ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5005:1: ( ( 'init' ) )
            // InternalReactionRules.g:5006:1: ( 'init' )
            {
            // InternalReactionRules.g:5006:1: ( 'init' )
            // InternalReactionRules.g:5007:2: 'init'
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
    // InternalReactionRules.g:5016:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5020:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // InternalReactionRules.g:5021:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalReactionRules.g:5028:1: rule__Initial__Group__1__Impl : ( ( rule__Initial__NameAssignment_1 ) ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5032:1: ( ( ( rule__Initial__NameAssignment_1 ) ) )
            // InternalReactionRules.g:5033:1: ( ( rule__Initial__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:5033:1: ( ( rule__Initial__NameAssignment_1 ) )
            // InternalReactionRules.g:5034:2: ( rule__Initial__NameAssignment_1 )
            {
             before(grammarAccess.getInitialAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:5035:2: ( rule__Initial__NameAssignment_1 )
            // InternalReactionRules.g:5035:3: rule__Initial__NameAssignment_1
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
    // InternalReactionRules.g:5043:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl rule__Initial__Group__3 ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5047:1: ( rule__Initial__Group__2__Impl rule__Initial__Group__3 )
            // InternalReactionRules.g:5048:2: rule__Initial__Group__2__Impl rule__Initial__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalReactionRules.g:5055:1: rule__Initial__Group__2__Impl : ( ( rule__Initial__CountAssignment_2 ) ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5059:1: ( ( ( rule__Initial__CountAssignment_2 ) ) )
            // InternalReactionRules.g:5060:1: ( ( rule__Initial__CountAssignment_2 ) )
            {
            // InternalReactionRules.g:5060:1: ( ( rule__Initial__CountAssignment_2 ) )
            // InternalReactionRules.g:5061:2: ( rule__Initial__CountAssignment_2 )
            {
             before(grammarAccess.getInitialAccess().getCountAssignment_2()); 
            // InternalReactionRules.g:5062:2: ( rule__Initial__CountAssignment_2 )
            // InternalReactionRules.g:5062:3: rule__Initial__CountAssignment_2
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
    // InternalReactionRules.g:5070:1: rule__Initial__Group__3 : rule__Initial__Group__3__Impl ;
    public final void rule__Initial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5074:1: ( rule__Initial__Group__3__Impl )
            // InternalReactionRules.g:5075:2: rule__Initial__Group__3__Impl
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
    // InternalReactionRules.g:5081:1: rule__Initial__Group__3__Impl : ( ( rule__Initial__InitialPatternAssignment_3 ) ) ;
    public final void rule__Initial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5085:1: ( ( ( rule__Initial__InitialPatternAssignment_3 ) ) )
            // InternalReactionRules.g:5086:1: ( ( rule__Initial__InitialPatternAssignment_3 ) )
            {
            // InternalReactionRules.g:5086:1: ( ( rule__Initial__InitialPatternAssignment_3 ) )
            // InternalReactionRules.g:5087:2: ( rule__Initial__InitialPatternAssignment_3 )
            {
             before(grammarAccess.getInitialAccess().getInitialPatternAssignment_3()); 
            // InternalReactionRules.g:5088:2: ( rule__Initial__InitialPatternAssignment_3 )
            // InternalReactionRules.g:5088:3: rule__Initial__InitialPatternAssignment_3
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
    // InternalReactionRules.g:5097:1: rule__RuleVariables__Group__0 : rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1 ;
    public final void rule__RuleVariables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5101:1: ( rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1 )
            // InternalReactionRules.g:5102:2: rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalReactionRules.g:5109:1: rule__RuleVariables__Group__0__Impl : ( ( rule__RuleVariables__VariablesAssignment_0 ) ) ;
    public final void rule__RuleVariables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5113:1: ( ( ( rule__RuleVariables__VariablesAssignment_0 ) ) )
            // InternalReactionRules.g:5114:1: ( ( rule__RuleVariables__VariablesAssignment_0 ) )
            {
            // InternalReactionRules.g:5114:1: ( ( rule__RuleVariables__VariablesAssignment_0 ) )
            // InternalReactionRules.g:5115:2: ( rule__RuleVariables__VariablesAssignment_0 )
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesAssignment_0()); 
            // InternalReactionRules.g:5116:2: ( rule__RuleVariables__VariablesAssignment_0 )
            // InternalReactionRules.g:5116:3: rule__RuleVariables__VariablesAssignment_0
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
    // InternalReactionRules.g:5124:1: rule__RuleVariables__Group__1 : rule__RuleVariables__Group__1__Impl ;
    public final void rule__RuleVariables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5128:1: ( rule__RuleVariables__Group__1__Impl )
            // InternalReactionRules.g:5129:2: rule__RuleVariables__Group__1__Impl
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
    // InternalReactionRules.g:5135:1: rule__RuleVariables__Group__1__Impl : ( ( rule__RuleVariables__Group_1__0 )* ) ;
    public final void rule__RuleVariables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5139:1: ( ( ( rule__RuleVariables__Group_1__0 )* ) )
            // InternalReactionRules.g:5140:1: ( ( rule__RuleVariables__Group_1__0 )* )
            {
            // InternalReactionRules.g:5140:1: ( ( rule__RuleVariables__Group_1__0 )* )
            // InternalReactionRules.g:5141:2: ( rule__RuleVariables__Group_1__0 )*
            {
             before(grammarAccess.getRuleVariablesAccess().getGroup_1()); 
            // InternalReactionRules.g:5142:2: ( rule__RuleVariables__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==25) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalReactionRules.g:5142:3: rule__RuleVariables__Group_1__0
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
    // InternalReactionRules.g:5151:1: rule__RuleVariables__Group_1__0 : rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1 ;
    public final void rule__RuleVariables__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5155:1: ( rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1 )
            // InternalReactionRules.g:5156:2: rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalReactionRules.g:5163:1: rule__RuleVariables__Group_1__0__Impl : ( ',' ) ;
    public final void rule__RuleVariables__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5167:1: ( ( ',' ) )
            // InternalReactionRules.g:5168:1: ( ',' )
            {
            // InternalReactionRules.g:5168:1: ( ',' )
            // InternalReactionRules.g:5169:2: ','
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
    // InternalReactionRules.g:5178:1: rule__RuleVariables__Group_1__1 : rule__RuleVariables__Group_1__1__Impl ;
    public final void rule__RuleVariables__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5182:1: ( rule__RuleVariables__Group_1__1__Impl )
            // InternalReactionRules.g:5183:2: rule__RuleVariables__Group_1__1__Impl
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
    // InternalReactionRules.g:5189:1: rule__RuleVariables__Group_1__1__Impl : ( ( rule__RuleVariables__VariablesAssignment_1_1 ) ) ;
    public final void rule__RuleVariables__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5193:1: ( ( ( rule__RuleVariables__VariablesAssignment_1_1 ) ) )
            // InternalReactionRules.g:5194:1: ( ( rule__RuleVariables__VariablesAssignment_1_1 ) )
            {
            // InternalReactionRules.g:5194:1: ( ( rule__RuleVariables__VariablesAssignment_1_1 ) )
            // InternalReactionRules.g:5195:2: ( rule__RuleVariables__VariablesAssignment_1_1 )
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesAssignment_1_1()); 
            // InternalReactionRules.g:5196:2: ( rule__RuleVariables__VariablesAssignment_1_1 )
            // InternalReactionRules.g:5196:3: rule__RuleVariables__VariablesAssignment_1_1
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
    // InternalReactionRules.g:5205:1: rule__UnidirectionalRule__Group__0 : rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1 ;
    public final void rule__UnidirectionalRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5209:1: ( rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1 )
            // InternalReactionRules.g:5210:2: rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalReactionRules.g:5217:1: rule__UnidirectionalRule__Group__0__Impl : ( ( rule__UnidirectionalRule__LhsAssignment_0 ) ) ;
    public final void rule__UnidirectionalRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5221:1: ( ( ( rule__UnidirectionalRule__LhsAssignment_0 ) ) )
            // InternalReactionRules.g:5222:1: ( ( rule__UnidirectionalRule__LhsAssignment_0 ) )
            {
            // InternalReactionRules.g:5222:1: ( ( rule__UnidirectionalRule__LhsAssignment_0 ) )
            // InternalReactionRules.g:5223:2: ( rule__UnidirectionalRule__LhsAssignment_0 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getLhsAssignment_0()); 
            // InternalReactionRules.g:5224:2: ( rule__UnidirectionalRule__LhsAssignment_0 )
            // InternalReactionRules.g:5224:3: rule__UnidirectionalRule__LhsAssignment_0
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
    // InternalReactionRules.g:5232:1: rule__UnidirectionalRule__Group__1 : rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2 ;
    public final void rule__UnidirectionalRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5236:1: ( rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2 )
            // InternalReactionRules.g:5237:2: rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalReactionRules.g:5244:1: rule__UnidirectionalRule__Group__1__Impl : ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) ) ;
    public final void rule__UnidirectionalRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5248:1: ( ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) ) )
            // InternalReactionRules.g:5249:1: ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) )
            {
            // InternalReactionRules.g:5249:1: ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) )
            // InternalReactionRules.g:5250:2: ( rule__UnidirectionalRule__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getOperatorAssignment_1()); 
            // InternalReactionRules.g:5251:2: ( rule__UnidirectionalRule__OperatorAssignment_1 )
            // InternalReactionRules.g:5251:3: rule__UnidirectionalRule__OperatorAssignment_1
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
    // InternalReactionRules.g:5259:1: rule__UnidirectionalRule__Group__2 : rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3 ;
    public final void rule__UnidirectionalRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5263:1: ( rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3 )
            // InternalReactionRules.g:5264:2: rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalReactionRules.g:5271:1: rule__UnidirectionalRule__Group__2__Impl : ( ( rule__UnidirectionalRule__RhsAssignment_2 ) ) ;
    public final void rule__UnidirectionalRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5275:1: ( ( ( rule__UnidirectionalRule__RhsAssignment_2 ) ) )
            // InternalReactionRules.g:5276:1: ( ( rule__UnidirectionalRule__RhsAssignment_2 ) )
            {
            // InternalReactionRules.g:5276:1: ( ( rule__UnidirectionalRule__RhsAssignment_2 ) )
            // InternalReactionRules.g:5277:2: ( rule__UnidirectionalRule__RhsAssignment_2 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getRhsAssignment_2()); 
            // InternalReactionRules.g:5278:2: ( rule__UnidirectionalRule__RhsAssignment_2 )
            // InternalReactionRules.g:5278:3: rule__UnidirectionalRule__RhsAssignment_2
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
    // InternalReactionRules.g:5286:1: rule__UnidirectionalRule__Group__3 : rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4 ;
    public final void rule__UnidirectionalRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5290:1: ( rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4 )
            // InternalReactionRules.g:5291:2: rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalReactionRules.g:5298:1: rule__UnidirectionalRule__Group__3__Impl : ( RULE_AT ) ;
    public final void rule__UnidirectionalRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5302:1: ( ( RULE_AT ) )
            // InternalReactionRules.g:5303:1: ( RULE_AT )
            {
            // InternalReactionRules.g:5303:1: ( RULE_AT )
            // InternalReactionRules.g:5304:2: RULE_AT
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
    // InternalReactionRules.g:5313:1: rule__UnidirectionalRule__Group__4 : rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5 ;
    public final void rule__UnidirectionalRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5317:1: ( rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5 )
            // InternalReactionRules.g:5318:2: rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalReactionRules.g:5325:1: rule__UnidirectionalRule__Group__4__Impl : ( '[' ) ;
    public final void rule__UnidirectionalRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5329:1: ( ( '[' ) )
            // InternalReactionRules.g:5330:1: ( '[' )
            {
            // InternalReactionRules.g:5330:1: ( '[' )
            // InternalReactionRules.g:5331:2: '['
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
    // InternalReactionRules.g:5340:1: rule__UnidirectionalRule__Group__5 : rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6 ;
    public final void rule__UnidirectionalRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5344:1: ( rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6 )
            // InternalReactionRules.g:5345:2: rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalReactionRules.g:5352:1: rule__UnidirectionalRule__Group__5__Impl : ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) ) ;
    public final void rule__UnidirectionalRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5356:1: ( ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) ) )
            // InternalReactionRules.g:5357:1: ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) )
            {
            // InternalReactionRules.g:5357:1: ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) )
            // InternalReactionRules.g:5358:2: ( rule__UnidirectionalRule__VariablesAssignment_5 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getVariablesAssignment_5()); 
            // InternalReactionRules.g:5359:2: ( rule__UnidirectionalRule__VariablesAssignment_5 )
            // InternalReactionRules.g:5359:3: rule__UnidirectionalRule__VariablesAssignment_5
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
    // InternalReactionRules.g:5367:1: rule__UnidirectionalRule__Group__6 : rule__UnidirectionalRule__Group__6__Impl ;
    public final void rule__UnidirectionalRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5371:1: ( rule__UnidirectionalRule__Group__6__Impl )
            // InternalReactionRules.g:5372:2: rule__UnidirectionalRule__Group__6__Impl
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
    // InternalReactionRules.g:5378:1: rule__UnidirectionalRule__Group__6__Impl : ( ']' ) ;
    public final void rule__UnidirectionalRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5382:1: ( ( ']' ) )
            // InternalReactionRules.g:5383:1: ( ']' )
            {
            // InternalReactionRules.g:5383:1: ( ']' )
            // InternalReactionRules.g:5384:2: ']'
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
    // InternalReactionRules.g:5394:1: rule__BidirectionalRule__Group__0 : rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1 ;
    public final void rule__BidirectionalRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5398:1: ( rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1 )
            // InternalReactionRules.g:5399:2: rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalReactionRules.g:5406:1: rule__BidirectionalRule__Group__0__Impl : ( ( rule__BidirectionalRule__LhsAssignment_0 ) ) ;
    public final void rule__BidirectionalRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5410:1: ( ( ( rule__BidirectionalRule__LhsAssignment_0 ) ) )
            // InternalReactionRules.g:5411:1: ( ( rule__BidirectionalRule__LhsAssignment_0 ) )
            {
            // InternalReactionRules.g:5411:1: ( ( rule__BidirectionalRule__LhsAssignment_0 ) )
            // InternalReactionRules.g:5412:2: ( rule__BidirectionalRule__LhsAssignment_0 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getLhsAssignment_0()); 
            // InternalReactionRules.g:5413:2: ( rule__BidirectionalRule__LhsAssignment_0 )
            // InternalReactionRules.g:5413:3: rule__BidirectionalRule__LhsAssignment_0
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
    // InternalReactionRules.g:5421:1: rule__BidirectionalRule__Group__1 : rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2 ;
    public final void rule__BidirectionalRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5425:1: ( rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2 )
            // InternalReactionRules.g:5426:2: rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalReactionRules.g:5433:1: rule__BidirectionalRule__Group__1__Impl : ( ( rule__BidirectionalRule__OperatorAssignment_1 ) ) ;
    public final void rule__BidirectionalRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5437:1: ( ( ( rule__BidirectionalRule__OperatorAssignment_1 ) ) )
            // InternalReactionRules.g:5438:1: ( ( rule__BidirectionalRule__OperatorAssignment_1 ) )
            {
            // InternalReactionRules.g:5438:1: ( ( rule__BidirectionalRule__OperatorAssignment_1 ) )
            // InternalReactionRules.g:5439:2: ( rule__BidirectionalRule__OperatorAssignment_1 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getOperatorAssignment_1()); 
            // InternalReactionRules.g:5440:2: ( rule__BidirectionalRule__OperatorAssignment_1 )
            // InternalReactionRules.g:5440:3: rule__BidirectionalRule__OperatorAssignment_1
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
    // InternalReactionRules.g:5448:1: rule__BidirectionalRule__Group__2 : rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3 ;
    public final void rule__BidirectionalRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5452:1: ( rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3 )
            // InternalReactionRules.g:5453:2: rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalReactionRules.g:5460:1: rule__BidirectionalRule__Group__2__Impl : ( ( rule__BidirectionalRule__RhsAssignment_2 ) ) ;
    public final void rule__BidirectionalRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5464:1: ( ( ( rule__BidirectionalRule__RhsAssignment_2 ) ) )
            // InternalReactionRules.g:5465:1: ( ( rule__BidirectionalRule__RhsAssignment_2 ) )
            {
            // InternalReactionRules.g:5465:1: ( ( rule__BidirectionalRule__RhsAssignment_2 ) )
            // InternalReactionRules.g:5466:2: ( rule__BidirectionalRule__RhsAssignment_2 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getRhsAssignment_2()); 
            // InternalReactionRules.g:5467:2: ( rule__BidirectionalRule__RhsAssignment_2 )
            // InternalReactionRules.g:5467:3: rule__BidirectionalRule__RhsAssignment_2
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
    // InternalReactionRules.g:5475:1: rule__BidirectionalRule__Group__3 : rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4 ;
    public final void rule__BidirectionalRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5479:1: ( rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4 )
            // InternalReactionRules.g:5480:2: rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalReactionRules.g:5487:1: rule__BidirectionalRule__Group__3__Impl : ( RULE_AT ) ;
    public final void rule__BidirectionalRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5491:1: ( ( RULE_AT ) )
            // InternalReactionRules.g:5492:1: ( RULE_AT )
            {
            // InternalReactionRules.g:5492:1: ( RULE_AT )
            // InternalReactionRules.g:5493:2: RULE_AT
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
    // InternalReactionRules.g:5502:1: rule__BidirectionalRule__Group__4 : rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5 ;
    public final void rule__BidirectionalRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5506:1: ( rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5 )
            // InternalReactionRules.g:5507:2: rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalReactionRules.g:5514:1: rule__BidirectionalRule__Group__4__Impl : ( '[' ) ;
    public final void rule__BidirectionalRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5518:1: ( ( '[' ) )
            // InternalReactionRules.g:5519:1: ( '[' )
            {
            // InternalReactionRules.g:5519:1: ( '[' )
            // InternalReactionRules.g:5520:2: '['
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
    // InternalReactionRules.g:5529:1: rule__BidirectionalRule__Group__5 : rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6 ;
    public final void rule__BidirectionalRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5533:1: ( rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6 )
            // InternalReactionRules.g:5534:2: rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalReactionRules.g:5541:1: rule__BidirectionalRule__Group__5__Impl : ( ( rule__BidirectionalRule__VariablesAssignment_5 ) ) ;
    public final void rule__BidirectionalRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5545:1: ( ( ( rule__BidirectionalRule__VariablesAssignment_5 ) ) )
            // InternalReactionRules.g:5546:1: ( ( rule__BidirectionalRule__VariablesAssignment_5 ) )
            {
            // InternalReactionRules.g:5546:1: ( ( rule__BidirectionalRule__VariablesAssignment_5 ) )
            // InternalReactionRules.g:5547:2: ( rule__BidirectionalRule__VariablesAssignment_5 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getVariablesAssignment_5()); 
            // InternalReactionRules.g:5548:2: ( rule__BidirectionalRule__VariablesAssignment_5 )
            // InternalReactionRules.g:5548:3: rule__BidirectionalRule__VariablesAssignment_5
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
    // InternalReactionRules.g:5556:1: rule__BidirectionalRule__Group__6 : rule__BidirectionalRule__Group__6__Impl ;
    public final void rule__BidirectionalRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5560:1: ( rule__BidirectionalRule__Group__6__Impl )
            // InternalReactionRules.g:5561:2: rule__BidirectionalRule__Group__6__Impl
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
    // InternalReactionRules.g:5567:1: rule__BidirectionalRule__Group__6__Impl : ( ']' ) ;
    public final void rule__BidirectionalRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5571:1: ( ( ']' ) )
            // InternalReactionRules.g:5572:1: ( ']' )
            {
            // InternalReactionRules.g:5572:1: ( ']' )
            // InternalReactionRules.g:5573:2: ']'
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
    // InternalReactionRules.g:5583:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5587:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalReactionRules.g:5588:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalReactionRules.g:5595:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5599:1: ( ( 'rule' ) )
            // InternalReactionRules.g:5600:1: ( 'rule' )
            {
            // InternalReactionRules.g:5600:1: ( 'rule' )
            // InternalReactionRules.g:5601:2: 'rule'
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
    // InternalReactionRules.g:5610:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5614:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalReactionRules.g:5615:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalReactionRules.g:5622:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5626:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalReactionRules.g:5627:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:5627:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalReactionRules.g:5628:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:5629:2: ( rule__Rule__NameAssignment_1 )
            // InternalReactionRules.g:5629:3: rule__Rule__NameAssignment_1
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
    // InternalReactionRules.g:5637:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5641:1: ( rule__Rule__Group__2__Impl )
            // InternalReactionRules.g:5642:2: rule__Rule__Group__2__Impl
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
    // InternalReactionRules.g:5648:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__RuleAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5652:1: ( ( ( rule__Rule__RuleAssignment_2 ) ) )
            // InternalReactionRules.g:5653:1: ( ( rule__Rule__RuleAssignment_2 ) )
            {
            // InternalReactionRules.g:5653:1: ( ( rule__Rule__RuleAssignment_2 ) )
            // InternalReactionRules.g:5654:2: ( rule__Rule__RuleAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getRuleAssignment_2()); 
            // InternalReactionRules.g:5655:2: ( rule__Rule__RuleAssignment_2 )
            // InternalReactionRules.g:5655:3: rule__Rule__RuleAssignment_2
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
    // InternalReactionRules.g:5664:1: rule__Iterations__Group__0 : rule__Iterations__Group__0__Impl rule__Iterations__Group__1 ;
    public final void rule__Iterations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5668:1: ( rule__Iterations__Group__0__Impl rule__Iterations__Group__1 )
            // InternalReactionRules.g:5669:2: rule__Iterations__Group__0__Impl rule__Iterations__Group__1
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
    // InternalReactionRules.g:5676:1: rule__Iterations__Group__0__Impl : ( 'iterations' ) ;
    public final void rule__Iterations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5680:1: ( ( 'iterations' ) )
            // InternalReactionRules.g:5681:1: ( 'iterations' )
            {
            // InternalReactionRules.g:5681:1: ( 'iterations' )
            // InternalReactionRules.g:5682:2: 'iterations'
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
    // InternalReactionRules.g:5691:1: rule__Iterations__Group__1 : rule__Iterations__Group__1__Impl rule__Iterations__Group__2 ;
    public final void rule__Iterations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5695:1: ( rule__Iterations__Group__1__Impl rule__Iterations__Group__2 )
            // InternalReactionRules.g:5696:2: rule__Iterations__Group__1__Impl rule__Iterations__Group__2
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
    // InternalReactionRules.g:5703:1: rule__Iterations__Group__1__Impl : ( '=' ) ;
    public final void rule__Iterations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5707:1: ( ( '=' ) )
            // InternalReactionRules.g:5708:1: ( '=' )
            {
            // InternalReactionRules.g:5708:1: ( '=' )
            // InternalReactionRules.g:5709:2: '='
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
    // InternalReactionRules.g:5718:1: rule__Iterations__Group__2 : rule__Iterations__Group__2__Impl ;
    public final void rule__Iterations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5722:1: ( rule__Iterations__Group__2__Impl )
            // InternalReactionRules.g:5723:2: rule__Iterations__Group__2__Impl
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
    // InternalReactionRules.g:5729:1: rule__Iterations__Group__2__Impl : ( ( rule__Iterations__ValueAssignment_2 ) ) ;
    public final void rule__Iterations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5733:1: ( ( ( rule__Iterations__ValueAssignment_2 ) ) )
            // InternalReactionRules.g:5734:1: ( ( rule__Iterations__ValueAssignment_2 ) )
            {
            // InternalReactionRules.g:5734:1: ( ( rule__Iterations__ValueAssignment_2 ) )
            // InternalReactionRules.g:5735:2: ( rule__Iterations__ValueAssignment_2 )
            {
             before(grammarAccess.getIterationsAccess().getValueAssignment_2()); 
            // InternalReactionRules.g:5736:2: ( rule__Iterations__ValueAssignment_2 )
            // InternalReactionRules.g:5736:3: rule__Iterations__ValueAssignment_2
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
    // InternalReactionRules.g:5745:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5749:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalReactionRules.g:5750:2: rule__Time__Group__0__Impl rule__Time__Group__1
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
    // InternalReactionRules.g:5757:1: rule__Time__Group__0__Impl : ( 'time' ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5761:1: ( ( 'time' ) )
            // InternalReactionRules.g:5762:1: ( 'time' )
            {
            // InternalReactionRules.g:5762:1: ( 'time' )
            // InternalReactionRules.g:5763:2: 'time'
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
    // InternalReactionRules.g:5772:1: rule__Time__Group__1 : rule__Time__Group__1__Impl rule__Time__Group__2 ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5776:1: ( rule__Time__Group__1__Impl rule__Time__Group__2 )
            // InternalReactionRules.g:5777:2: rule__Time__Group__1__Impl rule__Time__Group__2
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
    // InternalReactionRules.g:5784:1: rule__Time__Group__1__Impl : ( '=' ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5788:1: ( ( '=' ) )
            // InternalReactionRules.g:5789:1: ( '=' )
            {
            // InternalReactionRules.g:5789:1: ( '=' )
            // InternalReactionRules.g:5790:2: '='
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
    // InternalReactionRules.g:5799:1: rule__Time__Group__2 : rule__Time__Group__2__Impl ;
    public final void rule__Time__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5803:1: ( rule__Time__Group__2__Impl )
            // InternalReactionRules.g:5804:2: rule__Time__Group__2__Impl
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
    // InternalReactionRules.g:5810:1: rule__Time__Group__2__Impl : ( ( rule__Time__ValueAssignment_2 ) ) ;
    public final void rule__Time__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5814:1: ( ( ( rule__Time__ValueAssignment_2 ) ) )
            // InternalReactionRules.g:5815:1: ( ( rule__Time__ValueAssignment_2 ) )
            {
            // InternalReactionRules.g:5815:1: ( ( rule__Time__ValueAssignment_2 ) )
            // InternalReactionRules.g:5816:2: ( rule__Time__ValueAssignment_2 )
            {
             before(grammarAccess.getTimeAccess().getValueAssignment_2()); 
            // InternalReactionRules.g:5817:2: ( rule__Time__ValueAssignment_2 )
            // InternalReactionRules.g:5817:3: rule__Time__ValueAssignment_2
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
    // InternalReactionRules.g:5826:1: rule__Population__Group__0 : rule__Population__Group__0__Impl rule__Population__Group__1 ;
    public final void rule__Population__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5830:1: ( rule__Population__Group__0__Impl rule__Population__Group__1 )
            // InternalReactionRules.g:5831:2: rule__Population__Group__0__Impl rule__Population__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalReactionRules.g:5838:1: rule__Population__Group__0__Impl : ( '|' ) ;
    public final void rule__Population__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5842:1: ( ( '|' ) )
            // InternalReactionRules.g:5843:1: ( '|' )
            {
            // InternalReactionRules.g:5843:1: ( '|' )
            // InternalReactionRules.g:5844:2: '|'
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
    // InternalReactionRules.g:5853:1: rule__Population__Group__1 : rule__Population__Group__1__Impl rule__Population__Group__2 ;
    public final void rule__Population__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5857:1: ( rule__Population__Group__1__Impl rule__Population__Group__2 )
            // InternalReactionRules.g:5858:2: rule__Population__Group__1__Impl rule__Population__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalReactionRules.g:5865:1: rule__Population__Group__1__Impl : ( ( rule__Population__PaAssignment_1 ) ) ;
    public final void rule__Population__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5869:1: ( ( ( rule__Population__PaAssignment_1 ) ) )
            // InternalReactionRules.g:5870:1: ( ( rule__Population__PaAssignment_1 ) )
            {
            // InternalReactionRules.g:5870:1: ( ( rule__Population__PaAssignment_1 ) )
            // InternalReactionRules.g:5871:2: ( rule__Population__PaAssignment_1 )
            {
             before(grammarAccess.getPopulationAccess().getPaAssignment_1()); 
            // InternalReactionRules.g:5872:2: ( rule__Population__PaAssignment_1 )
            // InternalReactionRules.g:5872:3: rule__Population__PaAssignment_1
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
    // InternalReactionRules.g:5880:1: rule__Population__Group__2 : rule__Population__Group__2__Impl rule__Population__Group__3 ;
    public final void rule__Population__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5884:1: ( rule__Population__Group__2__Impl rule__Population__Group__3 )
            // InternalReactionRules.g:5885:2: rule__Population__Group__2__Impl rule__Population__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalReactionRules.g:5892:1: rule__Population__Group__2__Impl : ( '|' ) ;
    public final void rule__Population__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5896:1: ( ( '|' ) )
            // InternalReactionRules.g:5897:1: ( '|' )
            {
            // InternalReactionRules.g:5897:1: ( '|' )
            // InternalReactionRules.g:5898:2: '|'
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
    // InternalReactionRules.g:5907:1: rule__Population__Group__3 : rule__Population__Group__3__Impl rule__Population__Group__4 ;
    public final void rule__Population__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5911:1: ( rule__Population__Group__3__Impl rule__Population__Group__4 )
            // InternalReactionRules.g:5912:2: rule__Population__Group__3__Impl rule__Population__Group__4
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
    // InternalReactionRules.g:5919:1: rule__Population__Group__3__Impl : ( '==>' ) ;
    public final void rule__Population__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5923:1: ( ( '==>' ) )
            // InternalReactionRules.g:5924:1: ( '==>' )
            {
            // InternalReactionRules.g:5924:1: ( '==>' )
            // InternalReactionRules.g:5925:2: '==>'
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
    // InternalReactionRules.g:5934:1: rule__Population__Group__4 : rule__Population__Group__4__Impl ;
    public final void rule__Population__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5938:1: ( rule__Population__Group__4__Impl )
            // InternalReactionRules.g:5939:2: rule__Population__Group__4__Impl
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
    // InternalReactionRules.g:5945:1: rule__Population__Group__4__Impl : ( ( rule__Population__ValueAssignment_4 ) ) ;
    public final void rule__Population__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5949:1: ( ( ( rule__Population__ValueAssignment_4 ) ) )
            // InternalReactionRules.g:5950:1: ( ( rule__Population__ValueAssignment_4 ) )
            {
            // InternalReactionRules.g:5950:1: ( ( rule__Population__ValueAssignment_4 ) )
            // InternalReactionRules.g:5951:2: ( rule__Population__ValueAssignment_4 )
            {
             before(grammarAccess.getPopulationAccess().getValueAssignment_4()); 
            // InternalReactionRules.g:5952:2: ( rule__Population__ValueAssignment_4 )
            // InternalReactionRules.g:5952:3: rule__Population__ValueAssignment_4
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
    // InternalReactionRules.g:5961:1: rule__Terminate__Group__0 : rule__Terminate__Group__0__Impl rule__Terminate__Group__1 ;
    public final void rule__Terminate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5965:1: ( rule__Terminate__Group__0__Impl rule__Terminate__Group__1 )
            // InternalReactionRules.g:5966:2: rule__Terminate__Group__0__Impl rule__Terminate__Group__1
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
    // InternalReactionRules.g:5973:1: rule__Terminate__Group__0__Impl : ( 'terminate' ) ;
    public final void rule__Terminate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5977:1: ( ( 'terminate' ) )
            // InternalReactionRules.g:5978:1: ( 'terminate' )
            {
            // InternalReactionRules.g:5978:1: ( 'terminate' )
            // InternalReactionRules.g:5979:2: 'terminate'
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
    // InternalReactionRules.g:5988:1: rule__Terminate__Group__1 : rule__Terminate__Group__1__Impl rule__Terminate__Group__2 ;
    public final void rule__Terminate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5992:1: ( rule__Terminate__Group__1__Impl rule__Terminate__Group__2 )
            // InternalReactionRules.g:5993:2: rule__Terminate__Group__1__Impl rule__Terminate__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalReactionRules.g:6000:1: rule__Terminate__Group__1__Impl : ( ( rule__Terminate__NameAssignment_1 ) ) ;
    public final void rule__Terminate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6004:1: ( ( ( rule__Terminate__NameAssignment_1 ) ) )
            // InternalReactionRules.g:6005:1: ( ( rule__Terminate__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:6005:1: ( ( rule__Terminate__NameAssignment_1 ) )
            // InternalReactionRules.g:6006:2: ( rule__Terminate__NameAssignment_1 )
            {
             before(grammarAccess.getTerminateAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:6007:2: ( rule__Terminate__NameAssignment_1 )
            // InternalReactionRules.g:6007:3: rule__Terminate__NameAssignment_1
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
    // InternalReactionRules.g:6015:1: rule__Terminate__Group__2 : rule__Terminate__Group__2__Impl ;
    public final void rule__Terminate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6019:1: ( rule__Terminate__Group__2__Impl )
            // InternalReactionRules.g:6020:2: rule__Terminate__Group__2__Impl
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
    // InternalReactionRules.g:6026:1: rule__Terminate__Group__2__Impl : ( ( rule__Terminate__ConditionAssignment_2 ) ) ;
    public final void rule__Terminate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6030:1: ( ( ( rule__Terminate__ConditionAssignment_2 ) ) )
            // InternalReactionRules.g:6031:1: ( ( rule__Terminate__ConditionAssignment_2 ) )
            {
            // InternalReactionRules.g:6031:1: ( ( rule__Terminate__ConditionAssignment_2 ) )
            // InternalReactionRules.g:6032:2: ( rule__Terminate__ConditionAssignment_2 )
            {
             before(grammarAccess.getTerminateAccess().getConditionAssignment_2()); 
            // InternalReactionRules.g:6033:2: ( rule__Terminate__ConditionAssignment_2 )
            // InternalReactionRules.g:6033:3: rule__Terminate__ConditionAssignment_2
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
    // InternalReactionRules.g:6042:1: rule__ReactionRuleModel__ModelAssignment_0 : ( ruleModel ) ;
    public final void rule__ReactionRuleModel__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6046:1: ( ( ruleModel ) )
            // InternalReactionRules.g:6047:2: ( ruleModel )
            {
            // InternalReactionRules.g:6047:2: ( ruleModel )
            // InternalReactionRules.g:6048:3: ruleModel
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
    // InternalReactionRules.g:6057:1: rule__ReactionRuleModel__ReactionPropertiesAssignment_1 : ( ruleReactionProperty ) ;
    public final void rule__ReactionRuleModel__ReactionPropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6061:1: ( ( ruleReactionProperty ) )
            // InternalReactionRules.g:6062:2: ( ruleReactionProperty )
            {
            // InternalReactionRules.g:6062:2: ( ruleReactionProperty )
            // InternalReactionRules.g:6063:3: ruleReactionProperty
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
    // InternalReactionRules.g:6072:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6076:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6077:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6077:2: ( RULE_ID )
            // InternalReactionRules.g:6078:3: RULE_ID
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
    // InternalReactionRules.g:6087:1: rule__ArithmeticValue__ValueAssignment : ( ruleArithmeticType ) ;
    public final void rule__ArithmeticValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6091:1: ( ( ruleArithmeticType ) )
            // InternalReactionRules.g:6092:2: ( ruleArithmeticType )
            {
            // InternalReactionRules.g:6092:2: ( ruleArithmeticType )
            // InternalReactionRules.g:6093:3: ruleArithmeticType
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
    // InternalReactionRules.g:6102:1: rule__State__NameAssignment : ( RULE_ID ) ;
    public final void rule__State__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6106:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6107:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6107:2: ( RULE_ID )
            // InternalReactionRules.g:6108:3: RULE_ID
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
    // InternalReactionRules.g:6117:1: rule__States__StateAssignment_1_1 : ( ruleState ) ;
    public final void rule__States__StateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6121:1: ( ( ruleState ) )
            // InternalReactionRules.g:6122:2: ( ruleState )
            {
            // InternalReactionRules.g:6122:2: ( ruleState )
            // InternalReactionRules.g:6123:3: ruleState
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
    // InternalReactionRules.g:6132:1: rule__States__StateAssignment_1_2_1 : ( ruleState ) ;
    public final void rule__States__StateAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6136:1: ( ( ruleState ) )
            // InternalReactionRules.g:6137:2: ( ruleState )
            {
            // InternalReactionRules.g:6137:2: ( ruleState )
            // InternalReactionRules.g:6138:3: ruleState
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
    // InternalReactionRules.g:6147:1: rule__SingleSite__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SingleSite__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6151:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6152:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6152:2: ( RULE_ID )
            // InternalReactionRules.g:6153:3: RULE_ID
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
    // InternalReactionRules.g:6162:1: rule__SingleSite__StatesAssignment_2 : ( ruleStates ) ;
    public final void rule__SingleSite__StatesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6166:1: ( ( ruleStates ) )
            // InternalReactionRules.g:6167:2: ( ruleStates )
            {
            // InternalReactionRules.g:6167:2: ( ruleStates )
            // InternalReactionRules.g:6168:3: ruleStates
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
    // InternalReactionRules.g:6177:1: rule__MultiSite__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MultiSite__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6181:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6182:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6182:2: ( RULE_ID )
            // InternalReactionRules.g:6183:3: RULE_ID
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
    // InternalReactionRules.g:6192:1: rule__MultiSite__StatesAssignment_3 : ( ruleStates ) ;
    public final void rule__MultiSite__StatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6196:1: ( ( ruleStates ) )
            // InternalReactionRules.g:6197:2: ( ruleStates )
            {
            // InternalReactionRules.g:6197:2: ( ruleStates )
            // InternalReactionRules.g:6198:3: ruleStates
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
    // InternalReactionRules.g:6207:1: rule__Sites__SitesAssignment_1_1 : ( ruleSite ) ;
    public final void rule__Sites__SitesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6211:1: ( ( ruleSite ) )
            // InternalReactionRules.g:6212:2: ( ruleSite )
            {
            // InternalReactionRules.g:6212:2: ( ruleSite )
            // InternalReactionRules.g:6213:3: ruleSite
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
    // InternalReactionRules.g:6222:1: rule__Sites__SitesAssignment_1_2_1 : ( ruleSite ) ;
    public final void rule__Sites__SitesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6226:1: ( ( ruleSite ) )
            // InternalReactionRules.g:6227:2: ( ruleSite )
            {
            // InternalReactionRules.g:6227:2: ( ruleSite )
            // InternalReactionRules.g:6228:3: ruleSite
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
    // InternalReactionRules.g:6237:1: rule__Agent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6241:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6242:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6242:2: ( RULE_ID )
            // InternalReactionRules.g:6243:3: RULE_ID
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
    // InternalReactionRules.g:6252:1: rule__Agent__SitesAssignment_2 : ( ruleSites ) ;
    public final void rule__Agent__SitesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6256:1: ( ( ruleSites ) )
            // InternalReactionRules.g:6257:2: ( ruleSites )
            {
            // InternalReactionRules.g:6257:2: ( ruleSites )
            // InternalReactionRules.g:6258:3: ruleSites
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
    // InternalReactionRules.g:6267:1: rule__PatternVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PatternVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6271:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6272:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6272:2: ( RULE_ID )
            // InternalReactionRules.g:6273:3: RULE_ID
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
    // InternalReactionRules.g:6282:1: rule__PatternVariable__PatternAssignment_3 : ( rulePattern ) ;
    public final void rule__PatternVariable__PatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6286:1: ( ( rulePattern ) )
            // InternalReactionRules.g:6287:2: ( rulePattern )
            {
            // InternalReactionRules.g:6287:2: ( rulePattern )
            // InternalReactionRules.g:6288:3: rulePattern
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
    // InternalReactionRules.g:6297:1: rule__ArithmeticVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ArithmeticVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6301:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6302:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6302:2: ( RULE_ID )
            // InternalReactionRules.g:6303:3: RULE_ID
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
    // InternalReactionRules.g:6312:1: rule__ArithmeticVariable__ValueAssignment_3 : ( ruleArithmeticValue ) ;
    public final void rule__ArithmeticVariable__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6316:1: ( ( ruleArithmeticValue ) )
            // InternalReactionRules.g:6317:2: ( ruleArithmeticValue )
            {
            // InternalReactionRules.g:6317:2: ( ruleArithmeticValue )
            // InternalReactionRules.g:6318:3: ruleArithmeticValue
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
    // InternalReactionRules.g:6327:1: rule__BoundAnyLink__NameAssignment_1 : ( RULE_BOUND_LINK ) ;
    public final void rule__BoundAnyLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6331:1: ( ( RULE_BOUND_LINK ) )
            // InternalReactionRules.g:6332:2: ( RULE_BOUND_LINK )
            {
            // InternalReactionRules.g:6332:2: ( RULE_BOUND_LINK )
            // InternalReactionRules.g:6333:3: RULE_BOUND_LINK
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
    // InternalReactionRules.g:6342:1: rule__FreeLink__NameAssignment_1 : ( RULE_FREE_LINK ) ;
    public final void rule__FreeLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6346:1: ( ( RULE_FREE_LINK ) )
            // InternalReactionRules.g:6347:2: ( RULE_FREE_LINK )
            {
            // InternalReactionRules.g:6347:2: ( RULE_FREE_LINK )
            // InternalReactionRules.g:6348:3: RULE_FREE_LINK
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
    // InternalReactionRules.g:6357:1: rule__WhatEver__NameAssignment_1 : ( RULE_WHATEVER_LINK ) ;
    public final void rule__WhatEver__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6361:1: ( ( RULE_WHATEVER_LINK ) )
            // InternalReactionRules.g:6362:2: ( RULE_WHATEVER_LINK )
            {
            // InternalReactionRules.g:6362:2: ( RULE_WHATEVER_LINK )
            // InternalReactionRules.g:6363:3: RULE_WHATEVER_LINK
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
    // InternalReactionRules.g:6372:1: rule__BoundLink__StateAssignment_1 : ( ruleUnsignedInteger ) ;
    public final void rule__BoundLink__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6376:1: ( ( ruleUnsignedInteger ) )
            // InternalReactionRules.g:6377:2: ( ruleUnsignedInteger )
            {
            // InternalReactionRules.g:6377:2: ( ruleUnsignedInteger )
            // InternalReactionRules.g:6378:3: ruleUnsignedInteger
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
    // InternalReactionRules.g:6387:1: rule__MultiLink__StatesAssignment_1_0 : ( ( rule__MultiLink__StatesAlternatives_1_0_0 ) ) ;
    public final void rule__MultiLink__StatesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6391:1: ( ( ( rule__MultiLink__StatesAlternatives_1_0_0 ) ) )
            // InternalReactionRules.g:6392:2: ( ( rule__MultiLink__StatesAlternatives_1_0_0 ) )
            {
            // InternalReactionRules.g:6392:2: ( ( rule__MultiLink__StatesAlternatives_1_0_0 ) )
            // InternalReactionRules.g:6393:3: ( rule__MultiLink__StatesAlternatives_1_0_0 )
            {
             before(grammarAccess.getMultiLinkAccess().getStatesAlternatives_1_0_0()); 
            // InternalReactionRules.g:6394:3: ( rule__MultiLink__StatesAlternatives_1_0_0 )
            // InternalReactionRules.g:6394:4: rule__MultiLink__StatesAlternatives_1_0_0
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
    // InternalReactionRules.g:6402:1: rule__MultiLink__StatesAssignment_1_1_1 : ( ( rule__MultiLink__StatesAlternatives_1_1_1_0 ) ) ;
    public final void rule__MultiLink__StatesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6406:1: ( ( ( rule__MultiLink__StatesAlternatives_1_1_1_0 ) ) )
            // InternalReactionRules.g:6407:2: ( ( rule__MultiLink__StatesAlternatives_1_1_1_0 ) )
            {
            // InternalReactionRules.g:6407:2: ( ( rule__MultiLink__StatesAlternatives_1_1_1_0 ) )
            // InternalReactionRules.g:6408:3: ( rule__MultiLink__StatesAlternatives_1_1_1_0 )
            {
             before(grammarAccess.getMultiLinkAccess().getStatesAlternatives_1_1_1_0()); 
            // InternalReactionRules.g:6409:3: ( rule__MultiLink__StatesAlternatives_1_1_1_0 )
            // InternalReactionRules.g:6409:4: rule__MultiLink__StatesAlternatives_1_1_1_0
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
    // InternalReactionRules.g:6417:1: rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__BoundAnyOfTypeLinkAgent__AgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6421:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6422:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6422:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6423:3: ( RULE_ID )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getAgentAgentCrossReference_1_0()); 
            // InternalReactionRules.g:6424:3: ( RULE_ID )
            // InternalReactionRules.g:6425:4: RULE_ID
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
    // InternalReactionRules.g:6436:1: rule__BoundAnyOfTypeLinkSite__SiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__BoundAnyOfTypeLinkSite__SiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6440:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6441:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6441:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6442:3: ( RULE_ID )
            {
             before(grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getSiteSiteCrossReference_1_0()); 
            // InternalReactionRules.g:6443:3: ( RULE_ID )
            // InternalReactionRules.g:6444:4: RULE_ID
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
    // InternalReactionRules.g:6455:1: rule__BoundAnyOfTypeLink__LinkAgentAssignment_1 : ( ruleBoundAnyOfTypeLinkAgent ) ;
    public final void rule__BoundAnyOfTypeLink__LinkAgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6459:1: ( ( ruleBoundAnyOfTypeLinkAgent ) )
            // InternalReactionRules.g:6460:2: ( ruleBoundAnyOfTypeLinkAgent )
            {
            // InternalReactionRules.g:6460:2: ( ruleBoundAnyOfTypeLinkAgent )
            // InternalReactionRules.g:6461:3: ruleBoundAnyOfTypeLinkAgent
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
    // InternalReactionRules.g:6470:1: rule__BoundAnyOfTypeLink__LinkSiteAssignment_3 : ( ruleBoundAnyOfTypeLinkSite ) ;
    public final void rule__BoundAnyOfTypeLink__LinkSiteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6474:1: ( ( ruleBoundAnyOfTypeLinkSite ) )
            // InternalReactionRules.g:6475:2: ( ruleBoundAnyOfTypeLinkSite )
            {
            // InternalReactionRules.g:6475:2: ( ruleBoundAnyOfTypeLinkSite )
            // InternalReactionRules.g:6476:3: ruleBoundAnyOfTypeLinkSite
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
    // InternalReactionRules.g:6485:1: rule__SiteState__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SiteState__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6489:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6490:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6490:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6491:3: ( RULE_ID )
            {
             before(grammarAccess.getSiteStateAccess().getStateStateCrossReference_2_0()); 
            // InternalReactionRules.g:6492:3: ( RULE_ID )
            // InternalReactionRules.g:6493:4: RULE_ID
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
    // InternalReactionRules.g:6504:1: rule__LinkState__LinkStateAssignment_2 : ( ( rule__LinkState__LinkStateAlternatives_2_0 ) ) ;
    public final void rule__LinkState__LinkStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6508:1: ( ( ( rule__LinkState__LinkStateAlternatives_2_0 ) ) )
            // InternalReactionRules.g:6509:2: ( ( rule__LinkState__LinkStateAlternatives_2_0 ) )
            {
            // InternalReactionRules.g:6509:2: ( ( rule__LinkState__LinkStateAlternatives_2_0 ) )
            // InternalReactionRules.g:6510:3: ( rule__LinkState__LinkStateAlternatives_2_0 )
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAlternatives_2_0()); 
            // InternalReactionRules.g:6511:3: ( rule__LinkState__LinkStateAlternatives_2_0 )
            // InternalReactionRules.g:6511:4: rule__LinkState__LinkStateAlternatives_2_0
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
    // InternalReactionRules.g:6519:1: rule__MultiLinkState__LinkStateAssignment_2 : ( ( rule__MultiLinkState__LinkStateAlternatives_2_0 ) ) ;
    public final void rule__MultiLinkState__LinkStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6523:1: ( ( ( rule__MultiLinkState__LinkStateAlternatives_2_0 ) ) )
            // InternalReactionRules.g:6524:2: ( ( rule__MultiLinkState__LinkStateAlternatives_2_0 ) )
            {
            // InternalReactionRules.g:6524:2: ( ( rule__MultiLinkState__LinkStateAlternatives_2_0 ) )
            // InternalReactionRules.g:6525:3: ( rule__MultiLinkState__LinkStateAlternatives_2_0 )
            {
             before(grammarAccess.getMultiLinkStateAccess().getLinkStateAlternatives_2_0()); 
            // InternalReactionRules.g:6526:3: ( rule__MultiLinkState__LinkStateAlternatives_2_0 )
            // InternalReactionRules.g:6526:4: rule__MultiLinkState__LinkStateAlternatives_2_0
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
    // InternalReactionRules.g:6534:1: rule__SingleSitePattern__SiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SingleSitePattern__SiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6538:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6539:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6539:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6540:3: ( RULE_ID )
            {
             before(grammarAccess.getSingleSitePatternAccess().getSiteSingleSiteCrossReference_1_0()); 
            // InternalReactionRules.g:6541:3: ( RULE_ID )
            // InternalReactionRules.g:6542:4: RULE_ID
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
    // InternalReactionRules.g:6553:1: rule__SingleSitePattern__StateAssignment_2 : ( ruleSiteState ) ;
    public final void rule__SingleSitePattern__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6557:1: ( ( ruleSiteState ) )
            // InternalReactionRules.g:6558:2: ( ruleSiteState )
            {
            // InternalReactionRules.g:6558:2: ( ruleSiteState )
            // InternalReactionRules.g:6559:3: ruleSiteState
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
    // InternalReactionRules.g:6568:1: rule__SingleSitePattern__LinkStateAssignment_3 : ( ruleLinkState ) ;
    public final void rule__SingleSitePattern__LinkStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6572:1: ( ( ruleLinkState ) )
            // InternalReactionRules.g:6573:2: ( ruleLinkState )
            {
            // InternalReactionRules.g:6573:2: ( ruleLinkState )
            // InternalReactionRules.g:6574:3: ruleLinkState
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
    // InternalReactionRules.g:6583:1: rule__MultiLinkSitePattern__SiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MultiLinkSitePattern__SiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6587:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6588:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6588:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6589:3: ( RULE_ID )
            {
             before(grammarAccess.getMultiLinkSitePatternAccess().getSiteMultiSiteCrossReference_1_0()); 
            // InternalReactionRules.g:6590:3: ( RULE_ID )
            // InternalReactionRules.g:6591:4: RULE_ID
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
    // InternalReactionRules.g:6602:1: rule__MultiLinkSitePattern__StateAssignment_2 : ( ruleSiteState ) ;
    public final void rule__MultiLinkSitePattern__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6606:1: ( ( ruleSiteState ) )
            // InternalReactionRules.g:6607:2: ( ruleSiteState )
            {
            // InternalReactionRules.g:6607:2: ( ruleSiteState )
            // InternalReactionRules.g:6608:3: ruleSiteState
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
    // InternalReactionRules.g:6617:1: rule__MultiLinkSitePattern__LinkStateAssignment_3 : ( ruleMultiLinkState ) ;
    public final void rule__MultiLinkSitePattern__LinkStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6621:1: ( ( ruleMultiLinkState ) )
            // InternalReactionRules.g:6622:2: ( ruleMultiLinkState )
            {
            // InternalReactionRules.g:6622:2: ( ruleMultiLinkState )
            // InternalReactionRules.g:6623:3: ruleMultiLinkState
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
    // InternalReactionRules.g:6632:1: rule__SitePatterns__SitePatternsAssignment_2_0 : ( ruleSitePattern ) ;
    public final void rule__SitePatterns__SitePatternsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6636:1: ( ( ruleSitePattern ) )
            // InternalReactionRules.g:6637:2: ( ruleSitePattern )
            {
            // InternalReactionRules.g:6637:2: ( ruleSitePattern )
            // InternalReactionRules.g:6638:3: ruleSitePattern
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
    // InternalReactionRules.g:6647:1: rule__SitePatterns__SitePatternsAssignment_2_1_1 : ( ruleSitePattern ) ;
    public final void rule__SitePatterns__SitePatternsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6651:1: ( ( ruleSitePattern ) )
            // InternalReactionRules.g:6652:2: ( ruleSitePattern )
            {
            // InternalReactionRules.g:6652:2: ( ruleSitePattern )
            // InternalReactionRules.g:6653:3: ruleSitePattern
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
    // InternalReactionRules.g:6662:1: rule__ValidAgentPattern__AgentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ValidAgentPattern__AgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6666:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6667:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6667:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6668:3: ( RULE_ID )
            {
             before(grammarAccess.getValidAgentPatternAccess().getAgentAgentCrossReference_1_0()); 
            // InternalReactionRules.g:6669:3: ( RULE_ID )
            // InternalReactionRules.g:6670:4: RULE_ID
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
    // InternalReactionRules.g:6681:1: rule__ValidAgentPattern__SitePatternsAssignment_2 : ( ruleSitePatterns ) ;
    public final void rule__ValidAgentPattern__SitePatternsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6685:1: ( ( ruleSitePatterns ) )
            // InternalReactionRules.g:6686:2: ( ruleSitePatterns )
            {
            // InternalReactionRules.g:6686:2: ( ruleSitePatterns )
            // InternalReactionRules.g:6687:3: ruleSitePatterns
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
    // InternalReactionRules.g:6696:1: rule__VoidAgentPattern__PatternAssignment : ( RULE_VOID_PATTERN ) ;
    public final void rule__VoidAgentPattern__PatternAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6700:1: ( ( RULE_VOID_PATTERN ) )
            // InternalReactionRules.g:6701:2: ( RULE_VOID_PATTERN )
            {
            // InternalReactionRules.g:6701:2: ( RULE_VOID_PATTERN )
            // InternalReactionRules.g:6702:3: RULE_VOID_PATTERN
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
    // InternalReactionRules.g:6711:1: rule__Pattern__AgentPatternsAssignment_2_0 : ( ruleAgentPattern ) ;
    public final void rule__Pattern__AgentPatternsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6715:1: ( ( ruleAgentPattern ) )
            // InternalReactionRules.g:6716:2: ( ruleAgentPattern )
            {
            // InternalReactionRules.g:6716:2: ( ruleAgentPattern )
            // InternalReactionRules.g:6717:3: ruleAgentPattern
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
    // InternalReactionRules.g:6726:1: rule__Pattern__AgentPatternsAssignment_2_1_1 : ( ruleAgentPattern ) ;
    public final void rule__Pattern__AgentPatternsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6730:1: ( ( ruleAgentPattern ) )
            // InternalReactionRules.g:6731:2: ( ruleAgentPattern )
            {
            // InternalReactionRules.g:6731:2: ( ruleAgentPattern )
            // InternalReactionRules.g:6732:3: ruleAgentPattern
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
    // InternalReactionRules.g:6741:1: rule__Observation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Observation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6745:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6746:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6746:2: ( RULE_ID )
            // InternalReactionRules.g:6747:3: RULE_ID
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
    // InternalReactionRules.g:6756:1: rule__Observation__ObservationPatternAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__Observation__ObservationPatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6760:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6761:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6761:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6762:3: rulePatternAssignment
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
    // InternalReactionRules.g:6771:1: rule__NumericFromLiteral__ValueAssignment : ( ruleArithmeticValue ) ;
    public final void rule__NumericFromLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6775:1: ( ( ruleArithmeticValue ) )
            // InternalReactionRules.g:6776:2: ( ruleArithmeticValue )
            {
            // InternalReactionRules.g:6776:2: ( ruleArithmeticValue )
            // InternalReactionRules.g:6777:3: ruleArithmeticValue
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
    // InternalReactionRules.g:6786:1: rule__NumericFromVariable__ValueVarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NumericFromVariable__ValueVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6790:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6791:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6791:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6792:3: ( RULE_ID )
            {
             before(grammarAccess.getNumericFromVariableAccess().getValueVarArithmeticVariableCrossReference_0()); 
            // InternalReactionRules.g:6793:3: ( RULE_ID )
            // InternalReactionRules.g:6794:4: RULE_ID
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
    // InternalReactionRules.g:6805:1: rule__Initial__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Initial__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6809:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6810:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6810:2: ( RULE_ID )
            // InternalReactionRules.g:6811:3: RULE_ID
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
    // InternalReactionRules.g:6820:1: rule__Initial__CountAssignment_2 : ( ruleNumericAssignment ) ;
    public final void rule__Initial__CountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6824:1: ( ( ruleNumericAssignment ) )
            // InternalReactionRules.g:6825:2: ( ruleNumericAssignment )
            {
            // InternalReactionRules.g:6825:2: ( ruleNumericAssignment )
            // InternalReactionRules.g:6826:3: ruleNumericAssignment
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
    // InternalReactionRules.g:6835:1: rule__Initial__InitialPatternAssignment_3 : ( rulePatternAssignment ) ;
    public final void rule__Initial__InitialPatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6839:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6840:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6840:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6841:3: rulePatternAssignment
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
    // InternalReactionRules.g:6850:1: rule__AssignFromPattern__PatternAssignment : ( rulePattern ) ;
    public final void rule__AssignFromPattern__PatternAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6854:1: ( ( rulePattern ) )
            // InternalReactionRules.g:6855:2: ( rulePattern )
            {
            // InternalReactionRules.g:6855:2: ( rulePattern )
            // InternalReactionRules.g:6856:3: rulePattern
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
    // InternalReactionRules.g:6865:1: rule__AssignFromVariable__PatternVarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__AssignFromVariable__PatternVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6869:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6870:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6870:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6871:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignFromVariableAccess().getPatternVarPatternVariableCrossReference_0()); 
            // InternalReactionRules.g:6872:3: ( RULE_ID )
            // InternalReactionRules.g:6873:4: RULE_ID
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
    // InternalReactionRules.g:6884:1: rule__RuleVariables__VariablesAssignment_0 : ( ruleNumericAssignment ) ;
    public final void rule__RuleVariables__VariablesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6888:1: ( ( ruleNumericAssignment ) )
            // InternalReactionRules.g:6889:2: ( ruleNumericAssignment )
            {
            // InternalReactionRules.g:6889:2: ( ruleNumericAssignment )
            // InternalReactionRules.g:6890:3: ruleNumericAssignment
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
    // InternalReactionRules.g:6899:1: rule__RuleVariables__VariablesAssignment_1_1 : ( ruleNumericAssignment ) ;
    public final void rule__RuleVariables__VariablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6903:1: ( ( ruleNumericAssignment ) )
            // InternalReactionRules.g:6904:2: ( ruleNumericAssignment )
            {
            // InternalReactionRules.g:6904:2: ( ruleNumericAssignment )
            // InternalReactionRules.g:6905:3: ruleNumericAssignment
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
    // InternalReactionRules.g:6914:1: rule__UnidirectionalRule__LhsAssignment_0 : ( rulePatternAssignment ) ;
    public final void rule__UnidirectionalRule__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6918:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6919:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6919:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6920:3: rulePatternAssignment
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
    // InternalReactionRules.g:6929:1: rule__UnidirectionalRule__OperatorAssignment_1 : ( RULE_UNI ) ;
    public final void rule__UnidirectionalRule__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6933:1: ( ( RULE_UNI ) )
            // InternalReactionRules.g:6934:2: ( RULE_UNI )
            {
            // InternalReactionRules.g:6934:2: ( RULE_UNI )
            // InternalReactionRules.g:6935:3: RULE_UNI
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
    // InternalReactionRules.g:6944:1: rule__UnidirectionalRule__RhsAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__UnidirectionalRule__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6948:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6949:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6949:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6950:3: rulePatternAssignment
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
    // InternalReactionRules.g:6959:1: rule__UnidirectionalRule__VariablesAssignment_5 : ( ruleRuleVariables ) ;
    public final void rule__UnidirectionalRule__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6963:1: ( ( ruleRuleVariables ) )
            // InternalReactionRules.g:6964:2: ( ruleRuleVariables )
            {
            // InternalReactionRules.g:6964:2: ( ruleRuleVariables )
            // InternalReactionRules.g:6965:3: ruleRuleVariables
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
    // InternalReactionRules.g:6974:1: rule__BidirectionalRule__LhsAssignment_0 : ( rulePatternAssignment ) ;
    public final void rule__BidirectionalRule__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6978:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6979:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6979:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6980:3: rulePatternAssignment
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
    // InternalReactionRules.g:6989:1: rule__BidirectionalRule__OperatorAssignment_1 : ( RULE_BI ) ;
    public final void rule__BidirectionalRule__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6993:1: ( ( RULE_BI ) )
            // InternalReactionRules.g:6994:2: ( RULE_BI )
            {
            // InternalReactionRules.g:6994:2: ( RULE_BI )
            // InternalReactionRules.g:6995:3: RULE_BI
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
    // InternalReactionRules.g:7004:1: rule__BidirectionalRule__RhsAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__BidirectionalRule__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7008:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:7009:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:7009:2: ( rulePatternAssignment )
            // InternalReactionRules.g:7010:3: rulePatternAssignment
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
    // InternalReactionRules.g:7019:1: rule__BidirectionalRule__VariablesAssignment_5 : ( ruleRuleVariables ) ;
    public final void rule__BidirectionalRule__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7023:1: ( ( ruleRuleVariables ) )
            // InternalReactionRules.g:7024:2: ( ruleRuleVariables )
            {
            // InternalReactionRules.g:7024:2: ( ruleRuleVariables )
            // InternalReactionRules.g:7025:3: ruleRuleVariables
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
    // InternalReactionRules.g:7034:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7038:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:7039:2: ( RULE_ID )
            {
            // InternalReactionRules.g:7039:2: ( RULE_ID )
            // InternalReactionRules.g:7040:3: RULE_ID
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
    // InternalReactionRules.g:7049:1: rule__Rule__RuleAssignment_2 : ( ruleRuleBody ) ;
    public final void rule__Rule__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7053:1: ( ( ruleRuleBody ) )
            // InternalReactionRules.g:7054:2: ( ruleRuleBody )
            {
            // InternalReactionRules.g:7054:2: ( ruleRuleBody )
            // InternalReactionRules.g:7055:3: ruleRuleBody
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
    // InternalReactionRules.g:7064:1: rule__Iterations__ValueAssignment_2 : ( ruleUnsignedInteger ) ;
    public final void rule__Iterations__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7068:1: ( ( ruleUnsignedInteger ) )
            // InternalReactionRules.g:7069:2: ( ruleUnsignedInteger )
            {
            // InternalReactionRules.g:7069:2: ( ruleUnsignedInteger )
            // InternalReactionRules.g:7070:3: ruleUnsignedInteger
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
    // InternalReactionRules.g:7079:1: rule__Time__ValueAssignment_2 : ( ruleUnsignedInteger ) ;
    public final void rule__Time__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7083:1: ( ( ruleUnsignedInteger ) )
            // InternalReactionRules.g:7084:2: ( ruleUnsignedInteger )
            {
            // InternalReactionRules.g:7084:2: ( ruleUnsignedInteger )
            // InternalReactionRules.g:7085:3: ruleUnsignedInteger
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
    // InternalReactionRules.g:7094:1: rule__Population__PaAssignment_1 : ( rulePatternAssignment ) ;
    public final void rule__Population__PaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7098:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:7099:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:7099:2: ( rulePatternAssignment )
            // InternalReactionRules.g:7100:3: rulePatternAssignment
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
    // InternalReactionRules.g:7109:1: rule__Population__ValueAssignment_4 : ( ruleUnsignedInteger ) ;
    public final void rule__Population__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7113:1: ( ( ruleUnsignedInteger ) )
            // InternalReactionRules.g:7114:2: ( ruleUnsignedInteger )
            {
            // InternalReactionRules.g:7114:2: ( ruleUnsignedInteger )
            // InternalReactionRules.g:7115:3: ruleUnsignedInteger
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
    // InternalReactionRules.g:7124:1: rule__Terminate__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Terminate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7128:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:7129:2: ( RULE_ID )
            {
            // InternalReactionRules.g:7129:2: ( RULE_ID )
            // InternalReactionRules.g:7130:3: RULE_ID
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
    // InternalReactionRules.g:7139:1: rule__Terminate__ConditionAssignment_2 : ( ruleTerminationCondition ) ;
    public final void rule__Terminate__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:7143:1: ( ( ruleTerminationCondition ) )
            // InternalReactionRules.g:7144:2: ( ruleTerminationCondition )
            {
            // InternalReactionRules.g:7144:2: ( ruleTerminationCondition )
            // InternalReactionRules.g:7145:3: ruleTerminationCondition
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
    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\4\1\6\3\uffff\1\10\2\uffff";
    static final String dfa_3s = "\2\4\2\7\1\uffff\1\4\1\uffff\1\5\2\uffff";
    static final String dfa_4s = "\1\23\1\4\2\52\1\uffff\1\4\1\uffff\1\52\2\uffff";
    static final String dfa_5s = "\4\uffff\1\2\1\uffff\1\3\1\uffff\1\1\1\4";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\16\uffff\1\1",
            "\1\3",
            "\1\4\16\uffff\1\5\1\4\1\uffff\1\4\3\uffff\2\4\2\uffff\1\4\1\uffff\3\4\4\uffff\1\4",
            "\1\6\16\uffff\1\5\1\6\1\uffff\1\6\3\uffff\2\6\2\uffff\1\6\1\uffff\3\6\4\uffff\1\6",
            "",
            "\1\7",
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
            return "1550:1: rule__ArithmeticType__Alternatives : ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) );";
        }
    }
    static final String dfa_8s = "\165\uffff";
    static final String dfa_9s = "\2\7\1\14\1\33\1\30\1\14\2\uffff\2\7\1\27\1\30\1\33\1\30\1\7\2\4\1\7\1\30\2\41\1\26\3\41\1\31\1\41\2\31\1\27\1\30\1\40\1\31\1\7\1\4\2\7\2\4\1\41\2\31\1\27\1\30\1\41\1\31\1\41\2\31\2\41\1\26\2\41\1\4\1\7\2\4\1\40\1\4\1\7\1\31\1\7\2\31\1\30\1\41\1\31\1\41\2\31\2\41\1\26\2\41\2\31\1\27\1\41\1\40\1\4\1\31\1\7\1\4\1\7\2\4\2\31\1\41\2\31\1\30\2\41\1\26\3\41\1\31\1\41\2\31\1\4\1\40\1\31\1\7\1\4\2\31\1\41\2\31\1\4\2\31";
    static final String dfa_10s = "\1\27\1\30\1\15\1\33\1\31\1\15\2\uffff\1\34\1\13\1\42\1\31\1\33\1\31\1\7\1\12\1\41\1\34\1\30\2\41\1\26\6\41\1\34\1\42\1\31\1\42\1\34\1\7\1\11\2\7\1\41\1\12\3\41\1\42\1\30\4\41\1\34\2\41\1\26\2\41\1\11\1\7\1\41\1\12\1\42\1\11\1\7\1\34\1\7\2\41\1\30\4\41\1\34\2\41\1\26\4\41\1\42\1\41\1\42\1\11\1\34\1\7\1\11\1\7\1\12\6\41\1\30\2\41\1\26\6\41\1\34\1\11\1\42\1\34\1\7\1\11\5\41\1\11\2\41";
    static final String dfa_11s = "\6\uffff\1\2\1\1\155\uffff";
    static final String dfa_12s = "\165\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\17\uffff\1\1",
            "\1\3\3\uffff\1\4\14\uffff\1\5",
            "\1\7\1\6",
            "\1\10",
            "\1\5\1\11",
            "\1\7\1\6",
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
            "\1\40",
            "\1\41",
            "\1\40",
            "\1\40",
            "\1\34",
            "\1\42\7\uffff\1\34",
            "\1\34",
            "\1\42\7\uffff\1\34",
            "\1\43\2\uffff\1\13",
            "\1\44\10\uffff\1\46\1\uffff\1\45",
            "\1\5\1\11",
            "\1\17\1\uffff\1\20",
            "\1\43\2\uffff\1\13",
            "\1\47",
            "\1\50\4\uffff\1\51",
            "\1\52",
            "\1\53",
            "\1\57\3\uffff\1\56\1\55\1\54\26\uffff\1\60",
            "\1\64\2\uffff\1\63\1\61\1\62\1\65",
            "\1\40",
            "\1\66\7\uffff\1\34",
            "\1\66\7\uffff\1\34",
            "\1\67\10\uffff\1\71\1\uffff\1\70",
            "\1\72",
            "\1\60",
            "\1\73\7\uffff\1\60",
            "\1\60",
            "\1\73\7\uffff\1\60",
            "\1\74\2\uffff\1\36",
            "\1\75",
            "\1\75",
            "\1\76",
            "\1\75",
            "\1\75",
            "\1\77\4\uffff\1\100",
            "\1\101",
            "\1\105\3\uffff\1\104\1\103\1\102\26\uffff\1\106",
            "\1\112\2\uffff\1\111\1\107\1\110\1\113",
            "\1\46\1\uffff\1\45",
            "\1\114\4\uffff\1\115",
            "\1\116",
            "\1\74\2\uffff\1\36",
            "\1\117",
            "\1\66\7\uffff\1\34",
            "\1\66\7\uffff\1\34",
            "\1\120",
            "\1\106",
            "\1\121\7\uffff\1\106",
            "\1\106",
            "\1\121\7\uffff\1\106",
            "\1\43\2\uffff\1\13",
            "\1\122",
            "\1\122",
            "\1\123",
            "\1\122",
            "\1\122",
            "\1\124\7\uffff\1\60",
            "\1\124\7\uffff\1\60",
            "\1\125\10\uffff\1\126\1\uffff\1\127",
            "\1\75",
            "\1\71\1\uffff\1\70",
            "\1\130\4\uffff\1\131",
            "\1\43\2\uffff\1\13",
            "\1\132",
            "\1\133\4\uffff\1\134",
            "\1\135",
            "\1\141\2\uffff\1\140\1\136\1\137\1\142",
            "\1\146\3\uffff\1\145\1\144\1\143\26\uffff\1\147",
            "\1\150\7\uffff\1\106",
            "\1\150\7\uffff\1\106",
            "\1\122",
            "\1\124\7\uffff\1\60",
            "\1\124\7\uffff\1\60",
            "\1\151",
            "\1\152",
            "\1\152",
            "\1\153",
            "\1\152",
            "\1\152",
            "\1\147",
            "\1\154\7\uffff\1\147",
            "\1\147",
            "\1\154\7\uffff\1\147",
            "\1\74\2\uffff\1\36",
            "\1\155\4\uffff\1\156",
            "\1\126\1\uffff\1\127",
            "\1\74\2\uffff\1\36",
            "\1\157",
            "\1\160\4\uffff\1\161",
            "\1\150\7\uffff\1\106",
            "\1\150\7\uffff\1\106",
            "\1\152",
            "\1\162\7\uffff\1\147",
            "\1\162\7\uffff\1\147",
            "\1\163\4\uffff\1\164",
            "\1\162\7\uffff\1\147",
            "\1\162\7\uffff\1\147"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1829:1: rule__RuleBody__Alternatives : ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) );";
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
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000790L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000001000880L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000800080L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000080090L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000001C000000000L});

}