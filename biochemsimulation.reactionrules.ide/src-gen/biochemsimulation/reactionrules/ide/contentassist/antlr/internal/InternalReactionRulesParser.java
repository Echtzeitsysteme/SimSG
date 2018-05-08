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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'uni'", "'bi'", "'.'", "'{'", "'}'", "','", "'('", "')'", "'Agent'", "'Variable'", "'='", "'Semi-Link'", "'Free'", "'['", "']'", "'Observation'", "'Initial'", "'Rule'", "'at'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalReactionRules.g:62:1: ruleReactionRuleModel : ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment )* ) ;
    public final void ruleReactionRuleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:66:2: ( ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment )* ) )
            // InternalReactionRules.g:67:2: ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment )* )
            {
            // InternalReactionRules.g:67:2: ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment )* )
            // InternalReactionRules.g:68:3: ( rule__ReactionRuleModel__ReactionPropertiesAssignment )*
            {
             before(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesAssignment()); 
            // InternalReactionRules.g:69:3: ( rule__ReactionRuleModel__ReactionPropertiesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=19 && LA1_0<=20)||(LA1_0>=26 && LA1_0<=28)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReactionRules.g:69:4: rule__ReactionRuleModel__ReactionPropertiesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ReactionRuleModel__ReactionPropertiesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleReactionProperty"
    // InternalReactionRules.g:78:1: entryRuleReactionProperty : ruleReactionProperty EOF ;
    public final void entryRuleReactionProperty() throws RecognitionException {
        try {
            // InternalReactionRules.g:79:1: ( ruleReactionProperty EOF )
            // InternalReactionRules.g:80:1: ruleReactionProperty EOF
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
    // InternalReactionRules.g:87:1: ruleReactionProperty : ( ( rule__ReactionProperty__Alternatives ) ) ;
    public final void ruleReactionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:91:2: ( ( ( rule__ReactionProperty__Alternatives ) ) )
            // InternalReactionRules.g:92:2: ( ( rule__ReactionProperty__Alternatives ) )
            {
            // InternalReactionRules.g:92:2: ( ( rule__ReactionProperty__Alternatives ) )
            // InternalReactionRules.g:93:3: ( rule__ReactionProperty__Alternatives )
            {
             before(grammarAccess.getReactionPropertyAccess().getAlternatives()); 
            // InternalReactionRules.g:94:3: ( rule__ReactionProperty__Alternatives )
            // InternalReactionRules.g:94:4: rule__ReactionProperty__Alternatives
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
    // InternalReactionRules.g:103:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // InternalReactionRules.g:104:1: ( ruleFloat EOF )
            // InternalReactionRules.g:105:1: ruleFloat EOF
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
        }
        return ;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalReactionRules.g:112:1: ruleFloat : ( ( rule__Float__Group__0 ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:116:2: ( ( ( rule__Float__Group__0 ) ) )
            // InternalReactionRules.g:117:2: ( ( rule__Float__Group__0 ) )
            {
            // InternalReactionRules.g:117:2: ( ( rule__Float__Group__0 ) )
            // InternalReactionRules.g:118:3: ( rule__Float__Group__0 )
            {
             before(grammarAccess.getFloatAccess().getGroup()); 
            // InternalReactionRules.g:119:3: ( rule__Float__Group__0 )
            // InternalReactionRules.g:119:4: rule__Float__Group__0
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

        }
        return ;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleBigInteger"
    // InternalReactionRules.g:128:1: entryRuleBigInteger : ruleBigInteger EOF ;
    public final void entryRuleBigInteger() throws RecognitionException {
        try {
            // InternalReactionRules.g:129:1: ( ruleBigInteger EOF )
            // InternalReactionRules.g:130:1: ruleBigInteger EOF
            {
             before(grammarAccess.getBigIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleBigInteger();

            state._fsp--;

             after(grammarAccess.getBigIntegerRule()); 
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
    // $ANTLR end "entryRuleBigInteger"


    // $ANTLR start "ruleBigInteger"
    // InternalReactionRules.g:137:1: ruleBigInteger : ( RULE_INT ) ;
    public final void ruleBigInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:141:2: ( ( RULE_INT ) )
            // InternalReactionRules.g:142:2: ( RULE_INT )
            {
            // InternalReactionRules.g:142:2: ( RULE_INT )
            // InternalReactionRules.g:143:3: RULE_INT
            {
             before(grammarAccess.getBigIntegerAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBigIntegerAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBigInteger"


    // $ANTLR start "entryRuleState"
    // InternalReactionRules.g:153:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalReactionRules.g:154:1: ( ruleState EOF )
            // InternalReactionRules.g:155:1: ruleState EOF
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
    // InternalReactionRules.g:162:1: ruleState : ( ( rule__State__NameAssignment ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:166:2: ( ( ( rule__State__NameAssignment ) ) )
            // InternalReactionRules.g:167:2: ( ( rule__State__NameAssignment ) )
            {
            // InternalReactionRules.g:167:2: ( ( rule__State__NameAssignment ) )
            // InternalReactionRules.g:168:3: ( rule__State__NameAssignment )
            {
             before(grammarAccess.getStateAccess().getNameAssignment()); 
            // InternalReactionRules.g:169:3: ( rule__State__NameAssignment )
            // InternalReactionRules.g:169:4: rule__State__NameAssignment
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
    // InternalReactionRules.g:178:1: entryRuleStates : ruleStates EOF ;
    public final void entryRuleStates() throws RecognitionException {
        try {
            // InternalReactionRules.g:179:1: ( ruleStates EOF )
            // InternalReactionRules.g:180:1: ruleStates EOF
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
    // InternalReactionRules.g:187:1: ruleStates : ( ( rule__States__Group__0 ) ) ;
    public final void ruleStates() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:191:2: ( ( ( rule__States__Group__0 ) ) )
            // InternalReactionRules.g:192:2: ( ( rule__States__Group__0 ) )
            {
            // InternalReactionRules.g:192:2: ( ( rule__States__Group__0 ) )
            // InternalReactionRules.g:193:3: ( rule__States__Group__0 )
            {
             before(grammarAccess.getStatesAccess().getGroup()); 
            // InternalReactionRules.g:194:3: ( rule__States__Group__0 )
            // InternalReactionRules.g:194:4: rule__States__Group__0
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
    // InternalReactionRules.g:203:1: entryRuleSite : ruleSite EOF ;
    public final void entryRuleSite() throws RecognitionException {
        try {
            // InternalReactionRules.g:204:1: ( ruleSite EOF )
            // InternalReactionRules.g:205:1: ruleSite EOF
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
    // InternalReactionRules.g:212:1: ruleSite : ( ( rule__Site__Group__0 ) ) ;
    public final void ruleSite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:216:2: ( ( ( rule__Site__Group__0 ) ) )
            // InternalReactionRules.g:217:2: ( ( rule__Site__Group__0 ) )
            {
            // InternalReactionRules.g:217:2: ( ( rule__Site__Group__0 ) )
            // InternalReactionRules.g:218:3: ( rule__Site__Group__0 )
            {
             before(grammarAccess.getSiteAccess().getGroup()); 
            // InternalReactionRules.g:219:3: ( rule__Site__Group__0 )
            // InternalReactionRules.g:219:4: rule__Site__Group__0
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
    // InternalReactionRules.g:228:1: entryRuleSites : ruleSites EOF ;
    public final void entryRuleSites() throws RecognitionException {
        try {
            // InternalReactionRules.g:229:1: ( ruleSites EOF )
            // InternalReactionRules.g:230:1: ruleSites EOF
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
    // InternalReactionRules.g:237:1: ruleSites : ( ( rule__Sites__Group__0 ) ) ;
    public final void ruleSites() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:241:2: ( ( ( rule__Sites__Group__0 ) ) )
            // InternalReactionRules.g:242:2: ( ( rule__Sites__Group__0 ) )
            {
            // InternalReactionRules.g:242:2: ( ( rule__Sites__Group__0 ) )
            // InternalReactionRules.g:243:3: ( rule__Sites__Group__0 )
            {
             before(grammarAccess.getSitesAccess().getGroup()); 
            // InternalReactionRules.g:244:3: ( rule__Sites__Group__0 )
            // InternalReactionRules.g:244:4: rule__Sites__Group__0
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
    // InternalReactionRules.g:253:1: entryRuleAgent : ruleAgent EOF ;
    public final void entryRuleAgent() throws RecognitionException {
        try {
            // InternalReactionRules.g:254:1: ( ruleAgent EOF )
            // InternalReactionRules.g:255:1: ruleAgent EOF
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
    // InternalReactionRules.g:262:1: ruleAgent : ( ( rule__Agent__Group__0 ) ) ;
    public final void ruleAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:266:2: ( ( ( rule__Agent__Group__0 ) ) )
            // InternalReactionRules.g:267:2: ( ( rule__Agent__Group__0 ) )
            {
            // InternalReactionRules.g:267:2: ( ( rule__Agent__Group__0 ) )
            // InternalReactionRules.g:268:3: ( rule__Agent__Group__0 )
            {
             before(grammarAccess.getAgentAccess().getGroup()); 
            // InternalReactionRules.g:269:3: ( rule__Agent__Group__0 )
            // InternalReactionRules.g:269:4: rule__Agent__Group__0
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


    // $ANTLR start "entryRuleVariable"
    // InternalReactionRules.g:278:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:279:1: ( ruleVariable EOF )
            // InternalReactionRules.g:280:1: ruleVariable EOF
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
    // InternalReactionRules.g:287:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:291:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalReactionRules.g:292:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalReactionRules.g:292:2: ( ( rule__Variable__Group__0 ) )
            // InternalReactionRules.g:293:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalReactionRules.g:294:3: ( rule__Variable__Group__0 )
            // InternalReactionRules.g:294:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleLinkState"
    // InternalReactionRules.g:303:1: entryRuleLinkState : ruleLinkState EOF ;
    public final void entryRuleLinkState() throws RecognitionException {
        try {
            // InternalReactionRules.g:304:1: ( ruleLinkState EOF )
            // InternalReactionRules.g:305:1: ruleLinkState EOF
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
    // InternalReactionRules.g:312:1: ruleLinkState : ( ( rule__LinkState__Alternatives ) ) ;
    public final void ruleLinkState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:316:2: ( ( ( rule__LinkState__Alternatives ) ) )
            // InternalReactionRules.g:317:2: ( ( rule__LinkState__Alternatives ) )
            {
            // InternalReactionRules.g:317:2: ( ( rule__LinkState__Alternatives ) )
            // InternalReactionRules.g:318:3: ( rule__LinkState__Alternatives )
            {
             before(grammarAccess.getLinkStateAccess().getAlternatives()); 
            // InternalReactionRules.g:319:3: ( rule__LinkState__Alternatives )
            // InternalReactionRules.g:319:4: rule__LinkState__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LinkState__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLinkStateAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSemiLink"
    // InternalReactionRules.g:328:1: entryRuleSemiLink : ruleSemiLink EOF ;
    public final void entryRuleSemiLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:329:1: ( ruleSemiLink EOF )
            // InternalReactionRules.g:330:1: ruleSemiLink EOF
            {
             before(grammarAccess.getSemiLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleSemiLink();

            state._fsp--;

             after(grammarAccess.getSemiLinkRule()); 
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
    // $ANTLR end "entryRuleSemiLink"


    // $ANTLR start "ruleSemiLink"
    // InternalReactionRules.g:337:1: ruleSemiLink : ( ( rule__SemiLink__Group__0 ) ) ;
    public final void ruleSemiLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:341:2: ( ( ( rule__SemiLink__Group__0 ) ) )
            // InternalReactionRules.g:342:2: ( ( rule__SemiLink__Group__0 ) )
            {
            // InternalReactionRules.g:342:2: ( ( rule__SemiLink__Group__0 ) )
            // InternalReactionRules.g:343:3: ( rule__SemiLink__Group__0 )
            {
             before(grammarAccess.getSemiLinkAccess().getGroup()); 
            // InternalReactionRules.g:344:3: ( rule__SemiLink__Group__0 )
            // InternalReactionRules.g:344:4: rule__SemiLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SemiLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSemiLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSemiLink"


    // $ANTLR start "entryRuleFreeLink"
    // InternalReactionRules.g:353:1: entryRuleFreeLink : ruleFreeLink EOF ;
    public final void entryRuleFreeLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:354:1: ( ruleFreeLink EOF )
            // InternalReactionRules.g:355:1: ruleFreeLink EOF
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
    // InternalReactionRules.g:362:1: ruleFreeLink : ( ( rule__FreeLink__Group__0 ) ) ;
    public final void ruleFreeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:366:2: ( ( ( rule__FreeLink__Group__0 ) ) )
            // InternalReactionRules.g:367:2: ( ( rule__FreeLink__Group__0 ) )
            {
            // InternalReactionRules.g:367:2: ( ( rule__FreeLink__Group__0 ) )
            // InternalReactionRules.g:368:3: ( rule__FreeLink__Group__0 )
            {
             before(grammarAccess.getFreeLinkAccess().getGroup()); 
            // InternalReactionRules.g:369:3: ( rule__FreeLink__Group__0 )
            // InternalReactionRules.g:369:4: rule__FreeLink__Group__0
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


    // $ANTLR start "entryRuleLimitLink"
    // InternalReactionRules.g:378:1: entryRuleLimitLink : ruleLimitLink EOF ;
    public final void entryRuleLimitLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:379:1: ( ruleLimitLink EOF )
            // InternalReactionRules.g:380:1: ruleLimitLink EOF
            {
             before(grammarAccess.getLimitLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLimitLink();

            state._fsp--;

             after(grammarAccess.getLimitLinkRule()); 
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
    // $ANTLR end "entryRuleLimitLink"


    // $ANTLR start "ruleLimitLink"
    // InternalReactionRules.g:387:1: ruleLimitLink : ( ( rule__LimitLink__Group__0 ) ) ;
    public final void ruleLimitLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:391:2: ( ( ( rule__LimitLink__Group__0 ) ) )
            // InternalReactionRules.g:392:2: ( ( rule__LimitLink__Group__0 ) )
            {
            // InternalReactionRules.g:392:2: ( ( rule__LimitLink__Group__0 ) )
            // InternalReactionRules.g:393:3: ( rule__LimitLink__Group__0 )
            {
             before(grammarAccess.getLimitLinkAccess().getGroup()); 
            // InternalReactionRules.g:394:3: ( rule__LimitLink__Group__0 )
            // InternalReactionRules.g:394:4: rule__LimitLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LimitLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLimitLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLimitLink"


    // $ANTLR start "entryRuleExactLink"
    // InternalReactionRules.g:403:1: entryRuleExactLink : ruleExactLink EOF ;
    public final void entryRuleExactLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:404:1: ( ruleExactLink EOF )
            // InternalReactionRules.g:405:1: ruleExactLink EOF
            {
             before(grammarAccess.getExactLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleExactLink();

            state._fsp--;

             after(grammarAccess.getExactLinkRule()); 
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
    // $ANTLR end "entryRuleExactLink"


    // $ANTLR start "ruleExactLink"
    // InternalReactionRules.g:412:1: ruleExactLink : ( ( rule__ExactLink__Group__0 ) ) ;
    public final void ruleExactLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:416:2: ( ( ( rule__ExactLink__Group__0 ) ) )
            // InternalReactionRules.g:417:2: ( ( rule__ExactLink__Group__0 ) )
            {
            // InternalReactionRules.g:417:2: ( ( rule__ExactLink__Group__0 ) )
            // InternalReactionRules.g:418:3: ( rule__ExactLink__Group__0 )
            {
             before(grammarAccess.getExactLinkAccess().getGroup()); 
            // InternalReactionRules.g:419:3: ( rule__ExactLink__Group__0 )
            // InternalReactionRules.g:419:4: rule__ExactLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExactLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExactLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExactLink"


    // $ANTLR start "entryRuleSitePattern"
    // InternalReactionRules.g:428:1: entryRuleSitePattern : ruleSitePattern EOF ;
    public final void entryRuleSitePattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:429:1: ( ruleSitePattern EOF )
            // InternalReactionRules.g:430:1: ruleSitePattern EOF
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
    // InternalReactionRules.g:437:1: ruleSitePattern : ( ( rule__SitePattern__Group__0 ) ) ;
    public final void ruleSitePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:441:2: ( ( ( rule__SitePattern__Group__0 ) ) )
            // InternalReactionRules.g:442:2: ( ( rule__SitePattern__Group__0 ) )
            {
            // InternalReactionRules.g:442:2: ( ( rule__SitePattern__Group__0 ) )
            // InternalReactionRules.g:443:3: ( rule__SitePattern__Group__0 )
            {
             before(grammarAccess.getSitePatternAccess().getGroup()); 
            // InternalReactionRules.g:444:3: ( rule__SitePattern__Group__0 )
            // InternalReactionRules.g:444:4: rule__SitePattern__Group__0
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


    // $ANTLR start "entryRuleAgentPattern"
    // InternalReactionRules.g:453:1: entryRuleAgentPattern : ruleAgentPattern EOF ;
    public final void entryRuleAgentPattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:454:1: ( ruleAgentPattern EOF )
            // InternalReactionRules.g:455:1: ruleAgentPattern EOF
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
    // InternalReactionRules.g:462:1: ruleAgentPattern : ( ( rule__AgentPattern__Group__0 ) ) ;
    public final void ruleAgentPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:466:2: ( ( ( rule__AgentPattern__Group__0 ) ) )
            // InternalReactionRules.g:467:2: ( ( rule__AgentPattern__Group__0 ) )
            {
            // InternalReactionRules.g:467:2: ( ( rule__AgentPattern__Group__0 ) )
            // InternalReactionRules.g:468:3: ( rule__AgentPattern__Group__0 )
            {
             before(grammarAccess.getAgentPatternAccess().getGroup()); 
            // InternalReactionRules.g:469:3: ( rule__AgentPattern__Group__0 )
            // InternalReactionRules.g:469:4: rule__AgentPattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AgentPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAgentPatternAccess().getGroup()); 

            }


            }

        }
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
    // InternalReactionRules.g:478:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:479:1: ( rulePattern EOF )
            // InternalReactionRules.g:480:1: rulePattern EOF
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
    // InternalReactionRules.g:487:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:491:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalReactionRules.g:492:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalReactionRules.g:492:2: ( ( rule__Pattern__Group__0 ) )
            // InternalReactionRules.g:493:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalReactionRules.g:494:3: ( rule__Pattern__Group__0 )
            // InternalReactionRules.g:494:4: rule__Pattern__Group__0
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
    // InternalReactionRules.g:503:1: entryRuleObservation : ruleObservation EOF ;
    public final void entryRuleObservation() throws RecognitionException {
        try {
            // InternalReactionRules.g:504:1: ( ruleObservation EOF )
            // InternalReactionRules.g:505:1: ruleObservation EOF
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
    // InternalReactionRules.g:512:1: ruleObservation : ( ( rule__Observation__Group__0 ) ) ;
    public final void ruleObservation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:516:2: ( ( ( rule__Observation__Group__0 ) ) )
            // InternalReactionRules.g:517:2: ( ( rule__Observation__Group__0 ) )
            {
            // InternalReactionRules.g:517:2: ( ( rule__Observation__Group__0 ) )
            // InternalReactionRules.g:518:3: ( rule__Observation__Group__0 )
            {
             before(grammarAccess.getObservationAccess().getGroup()); 
            // InternalReactionRules.g:519:3: ( rule__Observation__Group__0 )
            // InternalReactionRules.g:519:4: rule__Observation__Group__0
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


    // $ANTLR start "entryRuleInitial"
    // InternalReactionRules.g:528:1: entryRuleInitial : ruleInitial EOF ;
    public final void entryRuleInitial() throws RecognitionException {
        try {
            // InternalReactionRules.g:529:1: ( ruleInitial EOF )
            // InternalReactionRules.g:530:1: ruleInitial EOF
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
    // InternalReactionRules.g:537:1: ruleInitial : ( ( rule__Initial__Group__0 ) ) ;
    public final void ruleInitial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:541:2: ( ( ( rule__Initial__Group__0 ) ) )
            // InternalReactionRules.g:542:2: ( ( rule__Initial__Group__0 ) )
            {
            // InternalReactionRules.g:542:2: ( ( rule__Initial__Group__0 ) )
            // InternalReactionRules.g:543:3: ( rule__Initial__Group__0 )
            {
             before(grammarAccess.getInitialAccess().getGroup()); 
            // InternalReactionRules.g:544:3: ( rule__Initial__Group__0 )
            // InternalReactionRules.g:544:4: rule__Initial__Group__0
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


    // $ANTLR start "entryRuleRule"
    // InternalReactionRules.g:553:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalReactionRules.g:554:1: ( ruleRule EOF )
            // InternalReactionRules.g:555:1: ruleRule EOF
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
    // InternalReactionRules.g:562:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:566:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalReactionRules.g:567:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalReactionRules.g:567:2: ( ( rule__Rule__Group__0 ) )
            // InternalReactionRules.g:568:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalReactionRules.g:569:3: ( rule__Rule__Group__0 )
            // InternalReactionRules.g:569:4: rule__Rule__Group__0
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


    // $ANTLR start "rule__ReactionProperty__Alternatives"
    // InternalReactionRules.g:577:1: rule__ReactionProperty__Alternatives : ( ( ruleAgent ) | ( ruleVariable ) | ( ruleObservation ) | ( ruleInitial ) | ( ruleRule ) );
    public final void rule__ReactionProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:581:1: ( ( ruleAgent ) | ( ruleVariable ) | ( ruleObservation ) | ( ruleInitial ) | ( ruleRule ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case 28:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalReactionRules.g:582:2: ( ruleAgent )
                    {
                    // InternalReactionRules.g:582:2: ( ruleAgent )
                    // InternalReactionRules.g:583:3: ruleAgent
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
                    // InternalReactionRules.g:588:2: ( ruleVariable )
                    {
                    // InternalReactionRules.g:588:2: ( ruleVariable )
                    // InternalReactionRules.g:589:3: ruleVariable
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
                    // InternalReactionRules.g:594:2: ( ruleObservation )
                    {
                    // InternalReactionRules.g:594:2: ( ruleObservation )
                    // InternalReactionRules.g:595:3: ruleObservation
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
                    // InternalReactionRules.g:600:2: ( ruleInitial )
                    {
                    // InternalReactionRules.g:600:2: ( ruleInitial )
                    // InternalReactionRules.g:601:3: ruleInitial
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
                    // InternalReactionRules.g:606:2: ( ruleRule )
                    {
                    // InternalReactionRules.g:606:2: ( ruleRule )
                    // InternalReactionRules.g:607:3: ruleRule
                    {
                     before(grammarAccess.getReactionPropertyAccess().getRuleParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getReactionPropertyAccess().getRuleParserRuleCall_4()); 

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


    // $ANTLR start "rule__LinkState__Alternatives"
    // InternalReactionRules.g:616:1: rule__LinkState__Alternatives : ( ( ruleSemiLink ) | ( ruleFreeLink ) | ( ruleExactLink ) | ( ruleLimitLink ) );
    public final void rule__LinkState__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:620:1: ( ( ruleSemiLink ) | ( ruleFreeLink ) | ( ruleExactLink ) | ( ruleLimitLink ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            case RULE_INT:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalReactionRules.g:621:2: ( ruleSemiLink )
                    {
                    // InternalReactionRules.g:621:2: ( ruleSemiLink )
                    // InternalReactionRules.g:622:3: ruleSemiLink
                    {
                     before(grammarAccess.getLinkStateAccess().getSemiLinkParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSemiLink();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getSemiLinkParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:627:2: ( ruleFreeLink )
                    {
                    // InternalReactionRules.g:627:2: ( ruleFreeLink )
                    // InternalReactionRules.g:628:3: ruleFreeLink
                    {
                     before(grammarAccess.getLinkStateAccess().getFreeLinkParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFreeLink();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getFreeLinkParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReactionRules.g:633:2: ( ruleExactLink )
                    {
                    // InternalReactionRules.g:633:2: ( ruleExactLink )
                    // InternalReactionRules.g:634:3: ruleExactLink
                    {
                     before(grammarAccess.getLinkStateAccess().getExactLinkParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExactLink();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getExactLinkParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalReactionRules.g:639:2: ( ruleLimitLink )
                    {
                    // InternalReactionRules.g:639:2: ( ruleLimitLink )
                    // InternalReactionRules.g:640:3: ruleLimitLink
                    {
                     before(grammarAccess.getLinkStateAccess().getLimitLinkParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLimitLink();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getLimitLinkParserRuleCall_3()); 

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
    // $ANTLR end "rule__LinkState__Alternatives"


    // $ANTLR start "rule__Rule__Alternatives_3"
    // InternalReactionRules.g:649:1: rule__Rule__Alternatives_3 : ( ( 'uni' ) | ( 'bi' ) );
    public final void rule__Rule__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:653:1: ( ( 'uni' ) | ( 'bi' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalReactionRules.g:654:2: ( 'uni' )
                    {
                    // InternalReactionRules.g:654:2: ( 'uni' )
                    // InternalReactionRules.g:655:3: 'uni'
                    {
                     before(grammarAccess.getRuleAccess().getUniKeyword_3_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getUniKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:660:2: ( 'bi' )
                    {
                    // InternalReactionRules.g:660:2: ( 'bi' )
                    // InternalReactionRules.g:661:3: 'bi'
                    {
                     before(grammarAccess.getRuleAccess().getBiKeyword_3_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getBiKeyword_3_1()); 

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
    // $ANTLR end "rule__Rule__Alternatives_3"


    // $ANTLR start "rule__Float__Group__0"
    // InternalReactionRules.g:670:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:674:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalReactionRules.g:675:2: rule__Float__Group__0__Impl rule__Float__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalReactionRules.g:682:1: rule__Float__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:686:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:687:1: ( RULE_INT )
            {
            // InternalReactionRules.g:687:1: ( RULE_INT )
            // InternalReactionRules.g:688:2: RULE_INT
            {
             before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalReactionRules.g:697:1: rule__Float__Group__1 : rule__Float__Group__1__Impl rule__Float__Group__2 ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:701:1: ( rule__Float__Group__1__Impl rule__Float__Group__2 )
            // InternalReactionRules.g:702:2: rule__Float__Group__1__Impl rule__Float__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalReactionRules.g:709:1: rule__Float__Group__1__Impl : ( '.' ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:713:1: ( ( '.' ) )
            // InternalReactionRules.g:714:1: ( '.' )
            {
            // InternalReactionRules.g:714:1: ( '.' )
            // InternalReactionRules.g:715:2: '.'
            {
             before(grammarAccess.getFloatAccess().getFullStopKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getFullStopKeyword_1()); 

            }


            }

        }
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
    // InternalReactionRules.g:724:1: rule__Float__Group__2 : rule__Float__Group__2__Impl ;
    public final void rule__Float__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:728:1: ( rule__Float__Group__2__Impl )
            // InternalReactionRules.g:729:2: rule__Float__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalReactionRules.g:735:1: rule__Float__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:739:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:740:1: ( RULE_INT )
            {
            // InternalReactionRules.g:740:1: ( RULE_INT )
            // InternalReactionRules.g:741:2: RULE_INT
            {
             before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__States__Group__0"
    // InternalReactionRules.g:751:1: rule__States__Group__0 : rule__States__Group__0__Impl rule__States__Group__1 ;
    public final void rule__States__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:755:1: ( rule__States__Group__0__Impl rule__States__Group__1 )
            // InternalReactionRules.g:756:2: rule__States__Group__0__Impl rule__States__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalReactionRules.g:763:1: rule__States__Group__0__Impl : ( () ) ;
    public final void rule__States__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:767:1: ( ( () ) )
            // InternalReactionRules.g:768:1: ( () )
            {
            // InternalReactionRules.g:768:1: ( () )
            // InternalReactionRules.g:769:2: ()
            {
             before(grammarAccess.getStatesAccess().getStatesAction_0()); 
            // InternalReactionRules.g:770:2: ()
            // InternalReactionRules.g:770:3: 
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
    // InternalReactionRules.g:778:1: rule__States__Group__1 : rule__States__Group__1__Impl ;
    public final void rule__States__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:782:1: ( rule__States__Group__1__Impl )
            // InternalReactionRules.g:783:2: rule__States__Group__1__Impl
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
    // InternalReactionRules.g:789:1: rule__States__Group__1__Impl : ( ( rule__States__Group_1__0 )? ) ;
    public final void rule__States__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:793:1: ( ( ( rule__States__Group_1__0 )? ) )
            // InternalReactionRules.g:794:1: ( ( rule__States__Group_1__0 )? )
            {
            // InternalReactionRules.g:794:1: ( ( rule__States__Group_1__0 )? )
            // InternalReactionRules.g:795:2: ( rule__States__Group_1__0 )?
            {
             before(grammarAccess.getStatesAccess().getGroup_1()); 
            // InternalReactionRules.g:796:2: ( rule__States__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalReactionRules.g:796:3: rule__States__Group_1__0
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
    // InternalReactionRules.g:805:1: rule__States__Group_1__0 : rule__States__Group_1__0__Impl rule__States__Group_1__1 ;
    public final void rule__States__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:809:1: ( rule__States__Group_1__0__Impl rule__States__Group_1__1 )
            // InternalReactionRules.g:810:2: rule__States__Group_1__0__Impl rule__States__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:817:1: rule__States__Group_1__0__Impl : ( '{' ) ;
    public final void rule__States__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:821:1: ( ( '{' ) )
            // InternalReactionRules.g:822:1: ( '{' )
            {
            // InternalReactionRules.g:822:1: ( '{' )
            // InternalReactionRules.g:823:2: '{'
            {
             before(grammarAccess.getStatesAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalReactionRules.g:832:1: rule__States__Group_1__1 : rule__States__Group_1__1__Impl rule__States__Group_1__2 ;
    public final void rule__States__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:836:1: ( rule__States__Group_1__1__Impl rule__States__Group_1__2 )
            // InternalReactionRules.g:837:2: rule__States__Group_1__1__Impl rule__States__Group_1__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalReactionRules.g:844:1: rule__States__Group_1__1__Impl : ( ( rule__States__StateAssignment_1_1 ) ) ;
    public final void rule__States__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:848:1: ( ( ( rule__States__StateAssignment_1_1 ) ) )
            // InternalReactionRules.g:849:1: ( ( rule__States__StateAssignment_1_1 ) )
            {
            // InternalReactionRules.g:849:1: ( ( rule__States__StateAssignment_1_1 ) )
            // InternalReactionRules.g:850:2: ( rule__States__StateAssignment_1_1 )
            {
             before(grammarAccess.getStatesAccess().getStateAssignment_1_1()); 
            // InternalReactionRules.g:851:2: ( rule__States__StateAssignment_1_1 )
            // InternalReactionRules.g:851:3: rule__States__StateAssignment_1_1
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
    // InternalReactionRules.g:859:1: rule__States__Group_1__2 : rule__States__Group_1__2__Impl rule__States__Group_1__3 ;
    public final void rule__States__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:863:1: ( rule__States__Group_1__2__Impl rule__States__Group_1__3 )
            // InternalReactionRules.g:864:2: rule__States__Group_1__2__Impl rule__States__Group_1__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalReactionRules.g:871:1: rule__States__Group_1__2__Impl : ( ( rule__States__Group_1_2__0 )* ) ;
    public final void rule__States__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:875:1: ( ( ( rule__States__Group_1_2__0 )* ) )
            // InternalReactionRules.g:876:1: ( ( rule__States__Group_1_2__0 )* )
            {
            // InternalReactionRules.g:876:1: ( ( rule__States__Group_1_2__0 )* )
            // InternalReactionRules.g:877:2: ( rule__States__Group_1_2__0 )*
            {
             before(grammarAccess.getStatesAccess().getGroup_1_2()); 
            // InternalReactionRules.g:878:2: ( rule__States__Group_1_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalReactionRules.g:878:3: rule__States__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__States__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalReactionRules.g:886:1: rule__States__Group_1__3 : rule__States__Group_1__3__Impl ;
    public final void rule__States__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:890:1: ( rule__States__Group_1__3__Impl )
            // InternalReactionRules.g:891:2: rule__States__Group_1__3__Impl
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
    // InternalReactionRules.g:897:1: rule__States__Group_1__3__Impl : ( '}' ) ;
    public final void rule__States__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:901:1: ( ( '}' ) )
            // InternalReactionRules.g:902:1: ( '}' )
            {
            // InternalReactionRules.g:902:1: ( '}' )
            // InternalReactionRules.g:903:2: '}'
            {
             before(grammarAccess.getStatesAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,15,FOLLOW_2); 
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
    // InternalReactionRules.g:913:1: rule__States__Group_1_2__0 : rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1 ;
    public final void rule__States__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:917:1: ( rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1 )
            // InternalReactionRules.g:918:2: rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:925:1: rule__States__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__States__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:929:1: ( ( ',' ) )
            // InternalReactionRules.g:930:1: ( ',' )
            {
            // InternalReactionRules.g:930:1: ( ',' )
            // InternalReactionRules.g:931:2: ','
            {
             before(grammarAccess.getStatesAccess().getCommaKeyword_1_2_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalReactionRules.g:940:1: rule__States__Group_1_2__1 : rule__States__Group_1_2__1__Impl ;
    public final void rule__States__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:944:1: ( rule__States__Group_1_2__1__Impl )
            // InternalReactionRules.g:945:2: rule__States__Group_1_2__1__Impl
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
    // InternalReactionRules.g:951:1: rule__States__Group_1_2__1__Impl : ( ( rule__States__StateAssignment_1_2_1 ) ) ;
    public final void rule__States__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:955:1: ( ( ( rule__States__StateAssignment_1_2_1 ) ) )
            // InternalReactionRules.g:956:1: ( ( rule__States__StateAssignment_1_2_1 ) )
            {
            // InternalReactionRules.g:956:1: ( ( rule__States__StateAssignment_1_2_1 ) )
            // InternalReactionRules.g:957:2: ( rule__States__StateAssignment_1_2_1 )
            {
             before(grammarAccess.getStatesAccess().getStateAssignment_1_2_1()); 
            // InternalReactionRules.g:958:2: ( rule__States__StateAssignment_1_2_1 )
            // InternalReactionRules.g:958:3: rule__States__StateAssignment_1_2_1
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
    // InternalReactionRules.g:967:1: rule__Site__Group__0 : rule__Site__Group__0__Impl rule__Site__Group__1 ;
    public final void rule__Site__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:971:1: ( rule__Site__Group__0__Impl rule__Site__Group__1 )
            // InternalReactionRules.g:972:2: rule__Site__Group__0__Impl rule__Site__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalReactionRules.g:979:1: rule__Site__Group__0__Impl : ( ( rule__Site__NameAssignment_0 ) ) ;
    public final void rule__Site__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:983:1: ( ( ( rule__Site__NameAssignment_0 ) ) )
            // InternalReactionRules.g:984:1: ( ( rule__Site__NameAssignment_0 ) )
            {
            // InternalReactionRules.g:984:1: ( ( rule__Site__NameAssignment_0 ) )
            // InternalReactionRules.g:985:2: ( rule__Site__NameAssignment_0 )
            {
             before(grammarAccess.getSiteAccess().getNameAssignment_0()); 
            // InternalReactionRules.g:986:2: ( rule__Site__NameAssignment_0 )
            // InternalReactionRules.g:986:3: rule__Site__NameAssignment_0
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
    // InternalReactionRules.g:994:1: rule__Site__Group__1 : rule__Site__Group__1__Impl ;
    public final void rule__Site__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:998:1: ( rule__Site__Group__1__Impl )
            // InternalReactionRules.g:999:2: rule__Site__Group__1__Impl
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
    // InternalReactionRules.g:1005:1: rule__Site__Group__1__Impl : ( ( rule__Site__StatesAssignment_1 ) ) ;
    public final void rule__Site__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1009:1: ( ( ( rule__Site__StatesAssignment_1 ) ) )
            // InternalReactionRules.g:1010:1: ( ( rule__Site__StatesAssignment_1 ) )
            {
            // InternalReactionRules.g:1010:1: ( ( rule__Site__StatesAssignment_1 ) )
            // InternalReactionRules.g:1011:2: ( rule__Site__StatesAssignment_1 )
            {
             before(grammarAccess.getSiteAccess().getStatesAssignment_1()); 
            // InternalReactionRules.g:1012:2: ( rule__Site__StatesAssignment_1 )
            // InternalReactionRules.g:1012:3: rule__Site__StatesAssignment_1
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
    // InternalReactionRules.g:1021:1: rule__Sites__Group__0 : rule__Sites__Group__0__Impl rule__Sites__Group__1 ;
    public final void rule__Sites__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1025:1: ( rule__Sites__Group__0__Impl rule__Sites__Group__1 )
            // InternalReactionRules.g:1026:2: rule__Sites__Group__0__Impl rule__Sites__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalReactionRules.g:1033:1: rule__Sites__Group__0__Impl : ( () ) ;
    public final void rule__Sites__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1037:1: ( ( () ) )
            // InternalReactionRules.g:1038:1: ( () )
            {
            // InternalReactionRules.g:1038:1: ( () )
            // InternalReactionRules.g:1039:2: ()
            {
             before(grammarAccess.getSitesAccess().getSitesAction_0()); 
            // InternalReactionRules.g:1040:2: ()
            // InternalReactionRules.g:1040:3: 
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
    // InternalReactionRules.g:1048:1: rule__Sites__Group__1 : rule__Sites__Group__1__Impl ;
    public final void rule__Sites__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1052:1: ( rule__Sites__Group__1__Impl )
            // InternalReactionRules.g:1053:2: rule__Sites__Group__1__Impl
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
    // InternalReactionRules.g:1059:1: rule__Sites__Group__1__Impl : ( ( rule__Sites__Group_1__0 )? ) ;
    public final void rule__Sites__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1063:1: ( ( ( rule__Sites__Group_1__0 )? ) )
            // InternalReactionRules.g:1064:1: ( ( rule__Sites__Group_1__0 )? )
            {
            // InternalReactionRules.g:1064:1: ( ( rule__Sites__Group_1__0 )? )
            // InternalReactionRules.g:1065:2: ( rule__Sites__Group_1__0 )?
            {
             before(grammarAccess.getSitesAccess().getGroup_1()); 
            // InternalReactionRules.g:1066:2: ( rule__Sites__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalReactionRules.g:1066:3: rule__Sites__Group_1__0
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
    // InternalReactionRules.g:1075:1: rule__Sites__Group_1__0 : rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1 ;
    public final void rule__Sites__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1079:1: ( rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1 )
            // InternalReactionRules.g:1080:2: rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:1087:1: rule__Sites__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Sites__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1091:1: ( ( '(' ) )
            // InternalReactionRules.g:1092:1: ( '(' )
            {
            // InternalReactionRules.g:1092:1: ( '(' )
            // InternalReactionRules.g:1093:2: '('
            {
             before(grammarAccess.getSitesAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalReactionRules.g:1102:1: rule__Sites__Group_1__1 : rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2 ;
    public final void rule__Sites__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1106:1: ( rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2 )
            // InternalReactionRules.g:1107:2: rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalReactionRules.g:1114:1: rule__Sites__Group_1__1__Impl : ( ( rule__Sites__SitesAssignment_1_1 ) ) ;
    public final void rule__Sites__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1118:1: ( ( ( rule__Sites__SitesAssignment_1_1 ) ) )
            // InternalReactionRules.g:1119:1: ( ( rule__Sites__SitesAssignment_1_1 ) )
            {
            // InternalReactionRules.g:1119:1: ( ( rule__Sites__SitesAssignment_1_1 ) )
            // InternalReactionRules.g:1120:2: ( rule__Sites__SitesAssignment_1_1 )
            {
             before(grammarAccess.getSitesAccess().getSitesAssignment_1_1()); 
            // InternalReactionRules.g:1121:2: ( rule__Sites__SitesAssignment_1_1 )
            // InternalReactionRules.g:1121:3: rule__Sites__SitesAssignment_1_1
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
    // InternalReactionRules.g:1129:1: rule__Sites__Group_1__2 : rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3 ;
    public final void rule__Sites__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1133:1: ( rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3 )
            // InternalReactionRules.g:1134:2: rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalReactionRules.g:1141:1: rule__Sites__Group_1__2__Impl : ( ( rule__Sites__Group_1_2__0 )* ) ;
    public final void rule__Sites__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1145:1: ( ( ( rule__Sites__Group_1_2__0 )* ) )
            // InternalReactionRules.g:1146:1: ( ( rule__Sites__Group_1_2__0 )* )
            {
            // InternalReactionRules.g:1146:1: ( ( rule__Sites__Group_1_2__0 )* )
            // InternalReactionRules.g:1147:2: ( rule__Sites__Group_1_2__0 )*
            {
             before(grammarAccess.getSitesAccess().getGroup_1_2()); 
            // InternalReactionRules.g:1148:2: ( rule__Sites__Group_1_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalReactionRules.g:1148:3: rule__Sites__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Sites__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalReactionRules.g:1156:1: rule__Sites__Group_1__3 : rule__Sites__Group_1__3__Impl ;
    public final void rule__Sites__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1160:1: ( rule__Sites__Group_1__3__Impl )
            // InternalReactionRules.g:1161:2: rule__Sites__Group_1__3__Impl
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
    // InternalReactionRules.g:1167:1: rule__Sites__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Sites__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1171:1: ( ( ')' ) )
            // InternalReactionRules.g:1172:1: ( ')' )
            {
            // InternalReactionRules.g:1172:1: ( ')' )
            // InternalReactionRules.g:1173:2: ')'
            {
             before(grammarAccess.getSitesAccess().getRightParenthesisKeyword_1_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalReactionRules.g:1183:1: rule__Sites__Group_1_2__0 : rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1 ;
    public final void rule__Sites__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1187:1: ( rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1 )
            // InternalReactionRules.g:1188:2: rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:1195:1: rule__Sites__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Sites__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1199:1: ( ( ',' ) )
            // InternalReactionRules.g:1200:1: ( ',' )
            {
            // InternalReactionRules.g:1200:1: ( ',' )
            // InternalReactionRules.g:1201:2: ','
            {
             before(grammarAccess.getSitesAccess().getCommaKeyword_1_2_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalReactionRules.g:1210:1: rule__Sites__Group_1_2__1 : rule__Sites__Group_1_2__1__Impl ;
    public final void rule__Sites__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1214:1: ( rule__Sites__Group_1_2__1__Impl )
            // InternalReactionRules.g:1215:2: rule__Sites__Group_1_2__1__Impl
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
    // InternalReactionRules.g:1221:1: rule__Sites__Group_1_2__1__Impl : ( ( rule__Sites__SitesAssignment_1_2_1 ) ) ;
    public final void rule__Sites__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1225:1: ( ( ( rule__Sites__SitesAssignment_1_2_1 ) ) )
            // InternalReactionRules.g:1226:1: ( ( rule__Sites__SitesAssignment_1_2_1 ) )
            {
            // InternalReactionRules.g:1226:1: ( ( rule__Sites__SitesAssignment_1_2_1 ) )
            // InternalReactionRules.g:1227:2: ( rule__Sites__SitesAssignment_1_2_1 )
            {
             before(grammarAccess.getSitesAccess().getSitesAssignment_1_2_1()); 
            // InternalReactionRules.g:1228:2: ( rule__Sites__SitesAssignment_1_2_1 )
            // InternalReactionRules.g:1228:3: rule__Sites__SitesAssignment_1_2_1
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
    // InternalReactionRules.g:1237:1: rule__Agent__Group__0 : rule__Agent__Group__0__Impl rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1241:1: ( rule__Agent__Group__0__Impl rule__Agent__Group__1 )
            // InternalReactionRules.g:1242:2: rule__Agent__Group__0__Impl rule__Agent__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:1249:1: rule__Agent__Group__0__Impl : ( 'Agent' ) ;
    public final void rule__Agent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1253:1: ( ( 'Agent' ) )
            // InternalReactionRules.g:1254:1: ( 'Agent' )
            {
            // InternalReactionRules.g:1254:1: ( 'Agent' )
            // InternalReactionRules.g:1255:2: 'Agent'
            {
             before(grammarAccess.getAgentAccess().getAgentKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalReactionRules.g:1264:1: rule__Agent__Group__1 : rule__Agent__Group__1__Impl rule__Agent__Group__2 ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1268:1: ( rule__Agent__Group__1__Impl rule__Agent__Group__2 )
            // InternalReactionRules.g:1269:2: rule__Agent__Group__1__Impl rule__Agent__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalReactionRules.g:1276:1: rule__Agent__Group__1__Impl : ( ( rule__Agent__NameAssignment_1 ) ) ;
    public final void rule__Agent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1280:1: ( ( ( rule__Agent__NameAssignment_1 ) ) )
            // InternalReactionRules.g:1281:1: ( ( rule__Agent__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:1281:1: ( ( rule__Agent__NameAssignment_1 ) )
            // InternalReactionRules.g:1282:2: ( rule__Agent__NameAssignment_1 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:1283:2: ( rule__Agent__NameAssignment_1 )
            // InternalReactionRules.g:1283:3: rule__Agent__NameAssignment_1
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
    // InternalReactionRules.g:1291:1: rule__Agent__Group__2 : rule__Agent__Group__2__Impl ;
    public final void rule__Agent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1295:1: ( rule__Agent__Group__2__Impl )
            // InternalReactionRules.g:1296:2: rule__Agent__Group__2__Impl
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
    // InternalReactionRules.g:1302:1: rule__Agent__Group__2__Impl : ( ( rule__Agent__SitesAssignment_2 ) ) ;
    public final void rule__Agent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1306:1: ( ( ( rule__Agent__SitesAssignment_2 ) ) )
            // InternalReactionRules.g:1307:1: ( ( rule__Agent__SitesAssignment_2 ) )
            {
            // InternalReactionRules.g:1307:1: ( ( rule__Agent__SitesAssignment_2 ) )
            // InternalReactionRules.g:1308:2: ( rule__Agent__SitesAssignment_2 )
            {
             before(grammarAccess.getAgentAccess().getSitesAssignment_2()); 
            // InternalReactionRules.g:1309:2: ( rule__Agent__SitesAssignment_2 )
            // InternalReactionRules.g:1309:3: rule__Agent__SitesAssignment_2
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


    // $ANTLR start "rule__Variable__Group__0"
    // InternalReactionRules.g:1318:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1322:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalReactionRules.g:1323:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalReactionRules.g:1330:1: rule__Variable__Group__0__Impl : ( 'Variable' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1334:1: ( ( 'Variable' ) )
            // InternalReactionRules.g:1335:1: ( 'Variable' )
            {
            // InternalReactionRules.g:1335:1: ( 'Variable' )
            // InternalReactionRules.g:1336:2: 'Variable'
            {
             before(grammarAccess.getVariableAccess().getVariableKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVariableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalReactionRules.g:1345:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1349:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalReactionRules.g:1350:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalReactionRules.g:1357:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1361:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalReactionRules.g:1362:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:1362:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalReactionRules.g:1363:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:1364:2: ( rule__Variable__NameAssignment_1 )
            // InternalReactionRules.g:1364:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalReactionRules.g:1372:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1376:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalReactionRules.g:1377:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalReactionRules.g:1384:1: rule__Variable__Group__2__Impl : ( '=' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1388:1: ( ( '=' ) )
            // InternalReactionRules.g:1389:1: ( '=' )
            {
            // InternalReactionRules.g:1389:1: ( '=' )
            // InternalReactionRules.g:1390:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalReactionRules.g:1399:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1403:1: ( rule__Variable__Group__3__Impl )
            // InternalReactionRules.g:1404:2: rule__Variable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalReactionRules.g:1410:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__ValueAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1414:1: ( ( ( rule__Variable__ValueAssignment_3 ) ) )
            // InternalReactionRules.g:1415:1: ( ( rule__Variable__ValueAssignment_3 ) )
            {
            // InternalReactionRules.g:1415:1: ( ( rule__Variable__ValueAssignment_3 ) )
            // InternalReactionRules.g:1416:2: ( rule__Variable__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getValueAssignment_3()); 
            // InternalReactionRules.g:1417:2: ( rule__Variable__ValueAssignment_3 )
            // InternalReactionRules.g:1417:3: rule__Variable__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__SemiLink__Group__0"
    // InternalReactionRules.g:1426:1: rule__SemiLink__Group__0 : rule__SemiLink__Group__0__Impl rule__SemiLink__Group__1 ;
    public final void rule__SemiLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1430:1: ( rule__SemiLink__Group__0__Impl rule__SemiLink__Group__1 )
            // InternalReactionRules.g:1431:2: rule__SemiLink__Group__0__Impl rule__SemiLink__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__SemiLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemiLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemiLink__Group__0"


    // $ANTLR start "rule__SemiLink__Group__0__Impl"
    // InternalReactionRules.g:1438:1: rule__SemiLink__Group__0__Impl : ( () ) ;
    public final void rule__SemiLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1442:1: ( ( () ) )
            // InternalReactionRules.g:1443:1: ( () )
            {
            // InternalReactionRules.g:1443:1: ( () )
            // InternalReactionRules.g:1444:2: ()
            {
             before(grammarAccess.getSemiLinkAccess().getSemiLinkAction_0()); 
            // InternalReactionRules.g:1445:2: ()
            // InternalReactionRules.g:1445:3: 
            {
            }

             after(grammarAccess.getSemiLinkAccess().getSemiLinkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemiLink__Group__0__Impl"


    // $ANTLR start "rule__SemiLink__Group__1"
    // InternalReactionRules.g:1453:1: rule__SemiLink__Group__1 : rule__SemiLink__Group__1__Impl ;
    public final void rule__SemiLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1457:1: ( rule__SemiLink__Group__1__Impl )
            // InternalReactionRules.g:1458:2: rule__SemiLink__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SemiLink__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemiLink__Group__1"


    // $ANTLR start "rule__SemiLink__Group__1__Impl"
    // InternalReactionRules.g:1464:1: rule__SemiLink__Group__1__Impl : ( 'Semi-Link' ) ;
    public final void rule__SemiLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1468:1: ( ( 'Semi-Link' ) )
            // InternalReactionRules.g:1469:1: ( 'Semi-Link' )
            {
            // InternalReactionRules.g:1469:1: ( 'Semi-Link' )
            // InternalReactionRules.g:1470:2: 'Semi-Link'
            {
             before(grammarAccess.getSemiLinkAccess().getSemiLinkKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSemiLinkAccess().getSemiLinkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemiLink__Group__1__Impl"


    // $ANTLR start "rule__FreeLink__Group__0"
    // InternalReactionRules.g:1480:1: rule__FreeLink__Group__0 : rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1 ;
    public final void rule__FreeLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1484:1: ( rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1 )
            // InternalReactionRules.g:1485:2: rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalReactionRules.g:1492:1: rule__FreeLink__Group__0__Impl : ( () ) ;
    public final void rule__FreeLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1496:1: ( ( () ) )
            // InternalReactionRules.g:1497:1: ( () )
            {
            // InternalReactionRules.g:1497:1: ( () )
            // InternalReactionRules.g:1498:2: ()
            {
             before(grammarAccess.getFreeLinkAccess().getFreeLinkAction_0()); 
            // InternalReactionRules.g:1499:2: ()
            // InternalReactionRules.g:1499:3: 
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
    // InternalReactionRules.g:1507:1: rule__FreeLink__Group__1 : rule__FreeLink__Group__1__Impl ;
    public final void rule__FreeLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1511:1: ( rule__FreeLink__Group__1__Impl )
            // InternalReactionRules.g:1512:2: rule__FreeLink__Group__1__Impl
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
    // InternalReactionRules.g:1518:1: rule__FreeLink__Group__1__Impl : ( 'Free' ) ;
    public final void rule__FreeLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1522:1: ( ( 'Free' ) )
            // InternalReactionRules.g:1523:1: ( 'Free' )
            {
            // InternalReactionRules.g:1523:1: ( 'Free' )
            // InternalReactionRules.g:1524:2: 'Free'
            {
             before(grammarAccess.getFreeLinkAccess().getFreeKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFreeLinkAccess().getFreeKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__LimitLink__Group__0"
    // InternalReactionRules.g:1534:1: rule__LimitLink__Group__0 : rule__LimitLink__Group__0__Impl rule__LimitLink__Group__1 ;
    public final void rule__LimitLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1538:1: ( rule__LimitLink__Group__0__Impl rule__LimitLink__Group__1 )
            // InternalReactionRules.g:1539:2: rule__LimitLink__Group__0__Impl rule__LimitLink__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__LimitLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitLink__Group__0"


    // $ANTLR start "rule__LimitLink__Group__0__Impl"
    // InternalReactionRules.g:1546:1: rule__LimitLink__Group__0__Impl : ( () ) ;
    public final void rule__LimitLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1550:1: ( ( () ) )
            // InternalReactionRules.g:1551:1: ( () )
            {
            // InternalReactionRules.g:1551:1: ( () )
            // InternalReactionRules.g:1552:2: ()
            {
             before(grammarAccess.getLimitLinkAccess().getLimitLinkAction_0()); 
            // InternalReactionRules.g:1553:2: ()
            // InternalReactionRules.g:1553:3: 
            {
            }

             after(grammarAccess.getLimitLinkAccess().getLimitLinkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitLink__Group__0__Impl"


    // $ANTLR start "rule__LimitLink__Group__1"
    // InternalReactionRules.g:1561:1: rule__LimitLink__Group__1 : rule__LimitLink__Group__1__Impl ;
    public final void rule__LimitLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1565:1: ( rule__LimitLink__Group__1__Impl )
            // InternalReactionRules.g:1566:2: rule__LimitLink__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LimitLink__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitLink__Group__1"


    // $ANTLR start "rule__LimitLink__Group__1__Impl"
    // InternalReactionRules.g:1572:1: rule__LimitLink__Group__1__Impl : ( ( rule__LimitLink__StateAssignment_1 ) ) ;
    public final void rule__LimitLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1576:1: ( ( ( rule__LimitLink__StateAssignment_1 ) ) )
            // InternalReactionRules.g:1577:1: ( ( rule__LimitLink__StateAssignment_1 ) )
            {
            // InternalReactionRules.g:1577:1: ( ( rule__LimitLink__StateAssignment_1 ) )
            // InternalReactionRules.g:1578:2: ( rule__LimitLink__StateAssignment_1 )
            {
             before(grammarAccess.getLimitLinkAccess().getStateAssignment_1()); 
            // InternalReactionRules.g:1579:2: ( rule__LimitLink__StateAssignment_1 )
            // InternalReactionRules.g:1579:3: rule__LimitLink__StateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LimitLink__StateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitLinkAccess().getStateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitLink__Group__1__Impl"


    // $ANTLR start "rule__ExactLink__Group__0"
    // InternalReactionRules.g:1588:1: rule__ExactLink__Group__0 : rule__ExactLink__Group__0__Impl rule__ExactLink__Group__1 ;
    public final void rule__ExactLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1592:1: ( rule__ExactLink__Group__0__Impl rule__ExactLink__Group__1 )
            // InternalReactionRules.g:1593:2: rule__ExactLink__Group__0__Impl rule__ExactLink__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ExactLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExactLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLink__Group__0"


    // $ANTLR start "rule__ExactLink__Group__0__Impl"
    // InternalReactionRules.g:1600:1: rule__ExactLink__Group__0__Impl : ( () ) ;
    public final void rule__ExactLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1604:1: ( ( () ) )
            // InternalReactionRules.g:1605:1: ( () )
            {
            // InternalReactionRules.g:1605:1: ( () )
            // InternalReactionRules.g:1606:2: ()
            {
             before(grammarAccess.getExactLinkAccess().getExactLinkAction_0()); 
            // InternalReactionRules.g:1607:2: ()
            // InternalReactionRules.g:1607:3: 
            {
            }

             after(grammarAccess.getExactLinkAccess().getExactLinkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLink__Group__0__Impl"


    // $ANTLR start "rule__ExactLink__Group__1"
    // InternalReactionRules.g:1615:1: rule__ExactLink__Group__1 : rule__ExactLink__Group__1__Impl rule__ExactLink__Group__2 ;
    public final void rule__ExactLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1619:1: ( rule__ExactLink__Group__1__Impl rule__ExactLink__Group__2 )
            // InternalReactionRules.g:1620:2: rule__ExactLink__Group__1__Impl rule__ExactLink__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ExactLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExactLink__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLink__Group__1"


    // $ANTLR start "rule__ExactLink__Group__1__Impl"
    // InternalReactionRules.g:1627:1: rule__ExactLink__Group__1__Impl : ( ( rule__ExactLink__SiteAssignment_1 ) ) ;
    public final void rule__ExactLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1631:1: ( ( ( rule__ExactLink__SiteAssignment_1 ) ) )
            // InternalReactionRules.g:1632:1: ( ( rule__ExactLink__SiteAssignment_1 ) )
            {
            // InternalReactionRules.g:1632:1: ( ( rule__ExactLink__SiteAssignment_1 ) )
            // InternalReactionRules.g:1633:2: ( rule__ExactLink__SiteAssignment_1 )
            {
             before(grammarAccess.getExactLinkAccess().getSiteAssignment_1()); 
            // InternalReactionRules.g:1634:2: ( rule__ExactLink__SiteAssignment_1 )
            // InternalReactionRules.g:1634:3: rule__ExactLink__SiteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExactLink__SiteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExactLinkAccess().getSiteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLink__Group__1__Impl"


    // $ANTLR start "rule__ExactLink__Group__2"
    // InternalReactionRules.g:1642:1: rule__ExactLink__Group__2 : rule__ExactLink__Group__2__Impl rule__ExactLink__Group__3 ;
    public final void rule__ExactLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1646:1: ( rule__ExactLink__Group__2__Impl rule__ExactLink__Group__3 )
            // InternalReactionRules.g:1647:2: rule__ExactLink__Group__2__Impl rule__ExactLink__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ExactLink__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExactLink__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLink__Group__2"


    // $ANTLR start "rule__ExactLink__Group__2__Impl"
    // InternalReactionRules.g:1654:1: rule__ExactLink__Group__2__Impl : ( '.' ) ;
    public final void rule__ExactLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1658:1: ( ( '.' ) )
            // InternalReactionRules.g:1659:1: ( '.' )
            {
            // InternalReactionRules.g:1659:1: ( '.' )
            // InternalReactionRules.g:1660:2: '.'
            {
             before(grammarAccess.getExactLinkAccess().getFullStopKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExactLinkAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLink__Group__2__Impl"


    // $ANTLR start "rule__ExactLink__Group__3"
    // InternalReactionRules.g:1669:1: rule__ExactLink__Group__3 : rule__ExactLink__Group__3__Impl ;
    public final void rule__ExactLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1673:1: ( rule__ExactLink__Group__3__Impl )
            // InternalReactionRules.g:1674:2: rule__ExactLink__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExactLink__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLink__Group__3"


    // $ANTLR start "rule__ExactLink__Group__3__Impl"
    // InternalReactionRules.g:1680:1: rule__ExactLink__Group__3__Impl : ( ( rule__ExactLink__AgentAssignment_3 ) ) ;
    public final void rule__ExactLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1684:1: ( ( ( rule__ExactLink__AgentAssignment_3 ) ) )
            // InternalReactionRules.g:1685:1: ( ( rule__ExactLink__AgentAssignment_3 ) )
            {
            // InternalReactionRules.g:1685:1: ( ( rule__ExactLink__AgentAssignment_3 ) )
            // InternalReactionRules.g:1686:2: ( rule__ExactLink__AgentAssignment_3 )
            {
             before(grammarAccess.getExactLinkAccess().getAgentAssignment_3()); 
            // InternalReactionRules.g:1687:2: ( rule__ExactLink__AgentAssignment_3 )
            // InternalReactionRules.g:1687:3: rule__ExactLink__AgentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExactLink__AgentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExactLinkAccess().getAgentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLink__Group__3__Impl"


    // $ANTLR start "rule__SitePattern__Group__0"
    // InternalReactionRules.g:1696:1: rule__SitePattern__Group__0 : rule__SitePattern__Group__0__Impl rule__SitePattern__Group__1 ;
    public final void rule__SitePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1700:1: ( rule__SitePattern__Group__0__Impl rule__SitePattern__Group__1 )
            // InternalReactionRules.g:1701:2: rule__SitePattern__Group__0__Impl rule__SitePattern__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:1708:1: rule__SitePattern__Group__0__Impl : ( () ) ;
    public final void rule__SitePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1712:1: ( ( () ) )
            // InternalReactionRules.g:1713:1: ( () )
            {
            // InternalReactionRules.g:1713:1: ( () )
            // InternalReactionRules.g:1714:2: ()
            {
             before(grammarAccess.getSitePatternAccess().getSitePatternAction_0()); 
            // InternalReactionRules.g:1715:2: ()
            // InternalReactionRules.g:1715:3: 
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
    // InternalReactionRules.g:1723:1: rule__SitePattern__Group__1 : rule__SitePattern__Group__1__Impl rule__SitePattern__Group__2 ;
    public final void rule__SitePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1727:1: ( rule__SitePattern__Group__1__Impl rule__SitePattern__Group__2 )
            // InternalReactionRules.g:1728:2: rule__SitePattern__Group__1__Impl rule__SitePattern__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalReactionRules.g:1735:1: rule__SitePattern__Group__1__Impl : ( ( rule__SitePattern__SiteAssignment_1 ) ) ;
    public final void rule__SitePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1739:1: ( ( ( rule__SitePattern__SiteAssignment_1 ) ) )
            // InternalReactionRules.g:1740:1: ( ( rule__SitePattern__SiteAssignment_1 ) )
            {
            // InternalReactionRules.g:1740:1: ( ( rule__SitePattern__SiteAssignment_1 ) )
            // InternalReactionRules.g:1741:2: ( rule__SitePattern__SiteAssignment_1 )
            {
             before(grammarAccess.getSitePatternAccess().getSiteAssignment_1()); 
            // InternalReactionRules.g:1742:2: ( rule__SitePattern__SiteAssignment_1 )
            // InternalReactionRules.g:1742:3: rule__SitePattern__SiteAssignment_1
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
    // InternalReactionRules.g:1750:1: rule__SitePattern__Group__2 : rule__SitePattern__Group__2__Impl rule__SitePattern__Group__3 ;
    public final void rule__SitePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1754:1: ( rule__SitePattern__Group__2__Impl rule__SitePattern__Group__3 )
            // InternalReactionRules.g:1755:2: rule__SitePattern__Group__2__Impl rule__SitePattern__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalReactionRules.g:1762:1: rule__SitePattern__Group__2__Impl : ( ( rule__SitePattern__Group_2__0 )? ) ;
    public final void rule__SitePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1766:1: ( ( ( rule__SitePattern__Group_2__0 )? ) )
            // InternalReactionRules.g:1767:1: ( ( rule__SitePattern__Group_2__0 )? )
            {
            // InternalReactionRules.g:1767:1: ( ( rule__SitePattern__Group_2__0 )? )
            // InternalReactionRules.g:1768:2: ( rule__SitePattern__Group_2__0 )?
            {
             before(grammarAccess.getSitePatternAccess().getGroup_2()); 
            // InternalReactionRules.g:1769:2: ( rule__SitePattern__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalReactionRules.g:1769:3: rule__SitePattern__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SitePattern__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSitePatternAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalReactionRules.g:1777:1: rule__SitePattern__Group__3 : rule__SitePattern__Group__3__Impl ;
    public final void rule__SitePattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1781:1: ( rule__SitePattern__Group__3__Impl )
            // InternalReactionRules.g:1782:2: rule__SitePattern__Group__3__Impl
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
    // InternalReactionRules.g:1788:1: rule__SitePattern__Group__3__Impl : ( ( rule__SitePattern__Group_3__0 )? ) ;
    public final void rule__SitePattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1792:1: ( ( ( rule__SitePattern__Group_3__0 )? ) )
            // InternalReactionRules.g:1793:1: ( ( rule__SitePattern__Group_3__0 )? )
            {
            // InternalReactionRules.g:1793:1: ( ( rule__SitePattern__Group_3__0 )? )
            // InternalReactionRules.g:1794:2: ( rule__SitePattern__Group_3__0 )?
            {
             before(grammarAccess.getSitePatternAccess().getGroup_3()); 
            // InternalReactionRules.g:1795:2: ( rule__SitePattern__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalReactionRules.g:1795:3: rule__SitePattern__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SitePattern__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSitePatternAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SitePattern__Group_2__0"
    // InternalReactionRules.g:1804:1: rule__SitePattern__Group_2__0 : rule__SitePattern__Group_2__0__Impl rule__SitePattern__Group_2__1 ;
    public final void rule__SitePattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1808:1: ( rule__SitePattern__Group_2__0__Impl rule__SitePattern__Group_2__1 )
            // InternalReactionRules.g:1809:2: rule__SitePattern__Group_2__0__Impl rule__SitePattern__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__SitePattern__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SitePattern__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group_2__0"


    // $ANTLR start "rule__SitePattern__Group_2__0__Impl"
    // InternalReactionRules.g:1816:1: rule__SitePattern__Group_2__0__Impl : ( '{' ) ;
    public final void rule__SitePattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1820:1: ( ( '{' ) )
            // InternalReactionRules.g:1821:1: ( '{' )
            {
            // InternalReactionRules.g:1821:1: ( '{' )
            // InternalReactionRules.g:1822:2: '{'
            {
             before(grammarAccess.getSitePatternAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSitePatternAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group_2__0__Impl"


    // $ANTLR start "rule__SitePattern__Group_2__1"
    // InternalReactionRules.g:1831:1: rule__SitePattern__Group_2__1 : rule__SitePattern__Group_2__1__Impl rule__SitePattern__Group_2__2 ;
    public final void rule__SitePattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1835:1: ( rule__SitePattern__Group_2__1__Impl rule__SitePattern__Group_2__2 )
            // InternalReactionRules.g:1836:2: rule__SitePattern__Group_2__1__Impl rule__SitePattern__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__SitePattern__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SitePattern__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group_2__1"


    // $ANTLR start "rule__SitePattern__Group_2__1__Impl"
    // InternalReactionRules.g:1843:1: rule__SitePattern__Group_2__1__Impl : ( ( rule__SitePattern__StateAssignment_2_1 ) ) ;
    public final void rule__SitePattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1847:1: ( ( ( rule__SitePattern__StateAssignment_2_1 ) ) )
            // InternalReactionRules.g:1848:1: ( ( rule__SitePattern__StateAssignment_2_1 ) )
            {
            // InternalReactionRules.g:1848:1: ( ( rule__SitePattern__StateAssignment_2_1 ) )
            // InternalReactionRules.g:1849:2: ( rule__SitePattern__StateAssignment_2_1 )
            {
             before(grammarAccess.getSitePatternAccess().getStateAssignment_2_1()); 
            // InternalReactionRules.g:1850:2: ( rule__SitePattern__StateAssignment_2_1 )
            // InternalReactionRules.g:1850:3: rule__SitePattern__StateAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SitePattern__StateAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSitePatternAccess().getStateAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group_2__1__Impl"


    // $ANTLR start "rule__SitePattern__Group_2__2"
    // InternalReactionRules.g:1858:1: rule__SitePattern__Group_2__2 : rule__SitePattern__Group_2__2__Impl ;
    public final void rule__SitePattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1862:1: ( rule__SitePattern__Group_2__2__Impl )
            // InternalReactionRules.g:1863:2: rule__SitePattern__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SitePattern__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group_2__2"


    // $ANTLR start "rule__SitePattern__Group_2__2__Impl"
    // InternalReactionRules.g:1869:1: rule__SitePattern__Group_2__2__Impl : ( '}' ) ;
    public final void rule__SitePattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1873:1: ( ( '}' ) )
            // InternalReactionRules.g:1874:1: ( '}' )
            {
            // InternalReactionRules.g:1874:1: ( '}' )
            // InternalReactionRules.g:1875:2: '}'
            {
             before(grammarAccess.getSitePatternAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSitePatternAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group_2__2__Impl"


    // $ANTLR start "rule__SitePattern__Group_3__0"
    // InternalReactionRules.g:1885:1: rule__SitePattern__Group_3__0 : rule__SitePattern__Group_3__0__Impl rule__SitePattern__Group_3__1 ;
    public final void rule__SitePattern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1889:1: ( rule__SitePattern__Group_3__0__Impl rule__SitePattern__Group_3__1 )
            // InternalReactionRules.g:1890:2: rule__SitePattern__Group_3__0__Impl rule__SitePattern__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__SitePattern__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SitePattern__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group_3__0"


    // $ANTLR start "rule__SitePattern__Group_3__0__Impl"
    // InternalReactionRules.g:1897:1: rule__SitePattern__Group_3__0__Impl : ( '[' ) ;
    public final void rule__SitePattern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1901:1: ( ( '[' ) )
            // InternalReactionRules.g:1902:1: ( '[' )
            {
            // InternalReactionRules.g:1902:1: ( '[' )
            // InternalReactionRules.g:1903:2: '['
            {
             before(grammarAccess.getSitePatternAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSitePatternAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group_3__0__Impl"


    // $ANTLR start "rule__SitePattern__Group_3__1"
    // InternalReactionRules.g:1912:1: rule__SitePattern__Group_3__1 : rule__SitePattern__Group_3__1__Impl rule__SitePattern__Group_3__2 ;
    public final void rule__SitePattern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1916:1: ( rule__SitePattern__Group_3__1__Impl rule__SitePattern__Group_3__2 )
            // InternalReactionRules.g:1917:2: rule__SitePattern__Group_3__1__Impl rule__SitePattern__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__SitePattern__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SitePattern__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group_3__1"


    // $ANTLR start "rule__SitePattern__Group_3__1__Impl"
    // InternalReactionRules.g:1924:1: rule__SitePattern__Group_3__1__Impl : ( ( rule__SitePattern__LinkStateAssignment_3_1 ) ) ;
    public final void rule__SitePattern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1928:1: ( ( ( rule__SitePattern__LinkStateAssignment_3_1 ) ) )
            // InternalReactionRules.g:1929:1: ( ( rule__SitePattern__LinkStateAssignment_3_1 ) )
            {
            // InternalReactionRules.g:1929:1: ( ( rule__SitePattern__LinkStateAssignment_3_1 ) )
            // InternalReactionRules.g:1930:2: ( rule__SitePattern__LinkStateAssignment_3_1 )
            {
             before(grammarAccess.getSitePatternAccess().getLinkStateAssignment_3_1()); 
            // InternalReactionRules.g:1931:2: ( rule__SitePattern__LinkStateAssignment_3_1 )
            // InternalReactionRules.g:1931:3: rule__SitePattern__LinkStateAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SitePattern__LinkStateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSitePatternAccess().getLinkStateAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group_3__1__Impl"


    // $ANTLR start "rule__SitePattern__Group_3__2"
    // InternalReactionRules.g:1939:1: rule__SitePattern__Group_3__2 : rule__SitePattern__Group_3__2__Impl ;
    public final void rule__SitePattern__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1943:1: ( rule__SitePattern__Group_3__2__Impl )
            // InternalReactionRules.g:1944:2: rule__SitePattern__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SitePattern__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group_3__2"


    // $ANTLR start "rule__SitePattern__Group_3__2__Impl"
    // InternalReactionRules.g:1950:1: rule__SitePattern__Group_3__2__Impl : ( ']' ) ;
    public final void rule__SitePattern__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1954:1: ( ( ']' ) )
            // InternalReactionRules.g:1955:1: ( ']' )
            {
            // InternalReactionRules.g:1955:1: ( ']' )
            // InternalReactionRules.g:1956:2: ']'
            {
             before(grammarAccess.getSitePatternAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSitePatternAccess().getRightSquareBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group_3__2__Impl"


    // $ANTLR start "rule__AgentPattern__Group__0"
    // InternalReactionRules.g:1966:1: rule__AgentPattern__Group__0 : rule__AgentPattern__Group__0__Impl rule__AgentPattern__Group__1 ;
    public final void rule__AgentPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1970:1: ( rule__AgentPattern__Group__0__Impl rule__AgentPattern__Group__1 )
            // InternalReactionRules.g:1971:2: rule__AgentPattern__Group__0__Impl rule__AgentPattern__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__AgentPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group__0"


    // $ANTLR start "rule__AgentPattern__Group__0__Impl"
    // InternalReactionRules.g:1978:1: rule__AgentPattern__Group__0__Impl : ( () ) ;
    public final void rule__AgentPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1982:1: ( ( () ) )
            // InternalReactionRules.g:1983:1: ( () )
            {
            // InternalReactionRules.g:1983:1: ( () )
            // InternalReactionRules.g:1984:2: ()
            {
             before(grammarAccess.getAgentPatternAccess().getAgentPatternAction_0()); 
            // InternalReactionRules.g:1985:2: ()
            // InternalReactionRules.g:1985:3: 
            {
            }

             after(grammarAccess.getAgentPatternAccess().getAgentPatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group__0__Impl"


    // $ANTLR start "rule__AgentPattern__Group__1"
    // InternalReactionRules.g:1993:1: rule__AgentPattern__Group__1 : rule__AgentPattern__Group__1__Impl rule__AgentPattern__Group__2 ;
    public final void rule__AgentPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1997:1: ( rule__AgentPattern__Group__1__Impl rule__AgentPattern__Group__2 )
            // InternalReactionRules.g:1998:2: rule__AgentPattern__Group__1__Impl rule__AgentPattern__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AgentPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentPattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group__1"


    // $ANTLR start "rule__AgentPattern__Group__1__Impl"
    // InternalReactionRules.g:2005:1: rule__AgentPattern__Group__1__Impl : ( ( rule__AgentPattern__AgentAssignment_1 ) ) ;
    public final void rule__AgentPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2009:1: ( ( ( rule__AgentPattern__AgentAssignment_1 ) ) )
            // InternalReactionRules.g:2010:1: ( ( rule__AgentPattern__AgentAssignment_1 ) )
            {
            // InternalReactionRules.g:2010:1: ( ( rule__AgentPattern__AgentAssignment_1 ) )
            // InternalReactionRules.g:2011:2: ( rule__AgentPattern__AgentAssignment_1 )
            {
             before(grammarAccess.getAgentPatternAccess().getAgentAssignment_1()); 
            // InternalReactionRules.g:2012:2: ( rule__AgentPattern__AgentAssignment_1 )
            // InternalReactionRules.g:2012:3: rule__AgentPattern__AgentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AgentPattern__AgentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAgentPatternAccess().getAgentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group__1__Impl"


    // $ANTLR start "rule__AgentPattern__Group__2"
    // InternalReactionRules.g:2020:1: rule__AgentPattern__Group__2 : rule__AgentPattern__Group__2__Impl rule__AgentPattern__Group__3 ;
    public final void rule__AgentPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2024:1: ( rule__AgentPattern__Group__2__Impl rule__AgentPattern__Group__3 )
            // InternalReactionRules.g:2025:2: rule__AgentPattern__Group__2__Impl rule__AgentPattern__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__AgentPattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentPattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group__2"


    // $ANTLR start "rule__AgentPattern__Group__2__Impl"
    // InternalReactionRules.g:2032:1: rule__AgentPattern__Group__2__Impl : ( '(' ) ;
    public final void rule__AgentPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2036:1: ( ( '(' ) )
            // InternalReactionRules.g:2037:1: ( '(' )
            {
            // InternalReactionRules.g:2037:1: ( '(' )
            // InternalReactionRules.g:2038:2: '('
            {
             before(grammarAccess.getAgentPatternAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAgentPatternAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group__2__Impl"


    // $ANTLR start "rule__AgentPattern__Group__3"
    // InternalReactionRules.g:2047:1: rule__AgentPattern__Group__3 : rule__AgentPattern__Group__3__Impl rule__AgentPattern__Group__4 ;
    public final void rule__AgentPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2051:1: ( rule__AgentPattern__Group__3__Impl rule__AgentPattern__Group__4 )
            // InternalReactionRules.g:2052:2: rule__AgentPattern__Group__3__Impl rule__AgentPattern__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__AgentPattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentPattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group__3"


    // $ANTLR start "rule__AgentPattern__Group__3__Impl"
    // InternalReactionRules.g:2059:1: rule__AgentPattern__Group__3__Impl : ( ( rule__AgentPattern__Group_3__0 )? ) ;
    public final void rule__AgentPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2063:1: ( ( ( rule__AgentPattern__Group_3__0 )? ) )
            // InternalReactionRules.g:2064:1: ( ( rule__AgentPattern__Group_3__0 )? )
            {
            // InternalReactionRules.g:2064:1: ( ( rule__AgentPattern__Group_3__0 )? )
            // InternalReactionRules.g:2065:2: ( rule__AgentPattern__Group_3__0 )?
            {
             before(grammarAccess.getAgentPatternAccess().getGroup_3()); 
            // InternalReactionRules.g:2066:2: ( rule__AgentPattern__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalReactionRules.g:2066:3: rule__AgentPattern__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AgentPattern__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAgentPatternAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group__3__Impl"


    // $ANTLR start "rule__AgentPattern__Group__4"
    // InternalReactionRules.g:2074:1: rule__AgentPattern__Group__4 : rule__AgentPattern__Group__4__Impl ;
    public final void rule__AgentPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2078:1: ( rule__AgentPattern__Group__4__Impl )
            // InternalReactionRules.g:2079:2: rule__AgentPattern__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AgentPattern__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group__4"


    // $ANTLR start "rule__AgentPattern__Group__4__Impl"
    // InternalReactionRules.g:2085:1: rule__AgentPattern__Group__4__Impl : ( ')' ) ;
    public final void rule__AgentPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2089:1: ( ( ')' ) )
            // InternalReactionRules.g:2090:1: ( ')' )
            {
            // InternalReactionRules.g:2090:1: ( ')' )
            // InternalReactionRules.g:2091:2: ')'
            {
             before(grammarAccess.getAgentPatternAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAgentPatternAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group__4__Impl"


    // $ANTLR start "rule__AgentPattern__Group_3__0"
    // InternalReactionRules.g:2101:1: rule__AgentPattern__Group_3__0 : rule__AgentPattern__Group_3__0__Impl rule__AgentPattern__Group_3__1 ;
    public final void rule__AgentPattern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2105:1: ( rule__AgentPattern__Group_3__0__Impl rule__AgentPattern__Group_3__1 )
            // InternalReactionRules.g:2106:2: rule__AgentPattern__Group_3__0__Impl rule__AgentPattern__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__AgentPattern__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentPattern__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group_3__0"


    // $ANTLR start "rule__AgentPattern__Group_3__0__Impl"
    // InternalReactionRules.g:2113:1: rule__AgentPattern__Group_3__0__Impl : ( ( rule__AgentPattern__SitePatternsAssignment_3_0 ) ) ;
    public final void rule__AgentPattern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2117:1: ( ( ( rule__AgentPattern__SitePatternsAssignment_3_0 ) ) )
            // InternalReactionRules.g:2118:1: ( ( rule__AgentPattern__SitePatternsAssignment_3_0 ) )
            {
            // InternalReactionRules.g:2118:1: ( ( rule__AgentPattern__SitePatternsAssignment_3_0 ) )
            // InternalReactionRules.g:2119:2: ( rule__AgentPattern__SitePatternsAssignment_3_0 )
            {
             before(grammarAccess.getAgentPatternAccess().getSitePatternsAssignment_3_0()); 
            // InternalReactionRules.g:2120:2: ( rule__AgentPattern__SitePatternsAssignment_3_0 )
            // InternalReactionRules.g:2120:3: rule__AgentPattern__SitePatternsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__AgentPattern__SitePatternsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAgentPatternAccess().getSitePatternsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group_3__0__Impl"


    // $ANTLR start "rule__AgentPattern__Group_3__1"
    // InternalReactionRules.g:2128:1: rule__AgentPattern__Group_3__1 : rule__AgentPattern__Group_3__1__Impl ;
    public final void rule__AgentPattern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2132:1: ( rule__AgentPattern__Group_3__1__Impl )
            // InternalReactionRules.g:2133:2: rule__AgentPattern__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AgentPattern__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group_3__1"


    // $ANTLR start "rule__AgentPattern__Group_3__1__Impl"
    // InternalReactionRules.g:2139:1: rule__AgentPattern__Group_3__1__Impl : ( ( rule__AgentPattern__Group_3_1__0 )* ) ;
    public final void rule__AgentPattern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2143:1: ( ( ( rule__AgentPattern__Group_3_1__0 )* ) )
            // InternalReactionRules.g:2144:1: ( ( rule__AgentPattern__Group_3_1__0 )* )
            {
            // InternalReactionRules.g:2144:1: ( ( rule__AgentPattern__Group_3_1__0 )* )
            // InternalReactionRules.g:2145:2: ( rule__AgentPattern__Group_3_1__0 )*
            {
             before(grammarAccess.getAgentPatternAccess().getGroup_3_1()); 
            // InternalReactionRules.g:2146:2: ( rule__AgentPattern__Group_3_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalReactionRules.g:2146:3: rule__AgentPattern__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AgentPattern__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAgentPatternAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group_3__1__Impl"


    // $ANTLR start "rule__AgentPattern__Group_3_1__0"
    // InternalReactionRules.g:2155:1: rule__AgentPattern__Group_3_1__0 : rule__AgentPattern__Group_3_1__0__Impl rule__AgentPattern__Group_3_1__1 ;
    public final void rule__AgentPattern__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2159:1: ( rule__AgentPattern__Group_3_1__0__Impl rule__AgentPattern__Group_3_1__1 )
            // InternalReactionRules.g:2160:2: rule__AgentPattern__Group_3_1__0__Impl rule__AgentPattern__Group_3_1__1
            {
            pushFollow(FOLLOW_7);
            rule__AgentPattern__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentPattern__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group_3_1__0"


    // $ANTLR start "rule__AgentPattern__Group_3_1__0__Impl"
    // InternalReactionRules.g:2167:1: rule__AgentPattern__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__AgentPattern__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2171:1: ( ( ',' ) )
            // InternalReactionRules.g:2172:1: ( ',' )
            {
            // InternalReactionRules.g:2172:1: ( ',' )
            // InternalReactionRules.g:2173:2: ','
            {
             before(grammarAccess.getAgentPatternAccess().getCommaKeyword_3_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAgentPatternAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group_3_1__0__Impl"


    // $ANTLR start "rule__AgentPattern__Group_3_1__1"
    // InternalReactionRules.g:2182:1: rule__AgentPattern__Group_3_1__1 : rule__AgentPattern__Group_3_1__1__Impl ;
    public final void rule__AgentPattern__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2186:1: ( rule__AgentPattern__Group_3_1__1__Impl )
            // InternalReactionRules.g:2187:2: rule__AgentPattern__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AgentPattern__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group_3_1__1"


    // $ANTLR start "rule__AgentPattern__Group_3_1__1__Impl"
    // InternalReactionRules.g:2193:1: rule__AgentPattern__Group_3_1__1__Impl : ( ( rule__AgentPattern__SitePatternsAssignment_3_1_1 ) ) ;
    public final void rule__AgentPattern__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2197:1: ( ( ( rule__AgentPattern__SitePatternsAssignment_3_1_1 ) ) )
            // InternalReactionRules.g:2198:1: ( ( rule__AgentPattern__SitePatternsAssignment_3_1_1 ) )
            {
            // InternalReactionRules.g:2198:1: ( ( rule__AgentPattern__SitePatternsAssignment_3_1_1 ) )
            // InternalReactionRules.g:2199:2: ( rule__AgentPattern__SitePatternsAssignment_3_1_1 )
            {
             before(grammarAccess.getAgentPatternAccess().getSitePatternsAssignment_3_1_1()); 
            // InternalReactionRules.g:2200:2: ( rule__AgentPattern__SitePatternsAssignment_3_1_1 )
            // InternalReactionRules.g:2200:3: rule__AgentPattern__SitePatternsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AgentPattern__SitePatternsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAgentPatternAccess().getSitePatternsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__Group_3_1__1__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalReactionRules.g:2209:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2213:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalReactionRules.g:2214:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:2221:1: rule__Pattern__Group__0__Impl : ( () ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2225:1: ( ( () ) )
            // InternalReactionRules.g:2226:1: ( () )
            {
            // InternalReactionRules.g:2226:1: ( () )
            // InternalReactionRules.g:2227:2: ()
            {
             before(grammarAccess.getPatternAccess().getPatternAction_0()); 
            // InternalReactionRules.g:2228:2: ()
            // InternalReactionRules.g:2228:3: 
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
    // InternalReactionRules.g:2236:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2240:1: ( rule__Pattern__Group__1__Impl )
            // InternalReactionRules.g:2241:2: rule__Pattern__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalReactionRules.g:2247:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__Group_1__0 )? ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2251:1: ( ( ( rule__Pattern__Group_1__0 )? ) )
            // InternalReactionRules.g:2252:1: ( ( rule__Pattern__Group_1__0 )? )
            {
            // InternalReactionRules.g:2252:1: ( ( rule__Pattern__Group_1__0 )? )
            // InternalReactionRules.g:2253:2: ( rule__Pattern__Group_1__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_1()); 
            // InternalReactionRules.g:2254:2: ( rule__Pattern__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalReactionRules.g:2254:3: rule__Pattern__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Pattern__Group_1__0"
    // InternalReactionRules.g:2263:1: rule__Pattern__Group_1__0 : rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1 ;
    public final void rule__Pattern__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2267:1: ( rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1 )
            // InternalReactionRules.g:2268:2: rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Pattern__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_1__0"


    // $ANTLR start "rule__Pattern__Group_1__0__Impl"
    // InternalReactionRules.g:2275:1: rule__Pattern__Group_1__0__Impl : ( ( rule__Pattern__AgentPatternsAssignment_1_0 ) ) ;
    public final void rule__Pattern__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2279:1: ( ( ( rule__Pattern__AgentPatternsAssignment_1_0 ) ) )
            // InternalReactionRules.g:2280:1: ( ( rule__Pattern__AgentPatternsAssignment_1_0 ) )
            {
            // InternalReactionRules.g:2280:1: ( ( rule__Pattern__AgentPatternsAssignment_1_0 ) )
            // InternalReactionRules.g:2281:2: ( rule__Pattern__AgentPatternsAssignment_1_0 )
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAssignment_1_0()); 
            // InternalReactionRules.g:2282:2: ( rule__Pattern__AgentPatternsAssignment_1_0 )
            // InternalReactionRules.g:2282:3: rule__Pattern__AgentPatternsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__AgentPatternsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getAgentPatternsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_1__0__Impl"


    // $ANTLR start "rule__Pattern__Group_1__1"
    // InternalReactionRules.g:2290:1: rule__Pattern__Group_1__1 : rule__Pattern__Group_1__1__Impl ;
    public final void rule__Pattern__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2294:1: ( rule__Pattern__Group_1__1__Impl )
            // InternalReactionRules.g:2295:2: rule__Pattern__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_1__1"


    // $ANTLR start "rule__Pattern__Group_1__1__Impl"
    // InternalReactionRules.g:2301:1: rule__Pattern__Group_1__1__Impl : ( ( rule__Pattern__Group_1_1__0 )* ) ;
    public final void rule__Pattern__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2305:1: ( ( ( rule__Pattern__Group_1_1__0 )* ) )
            // InternalReactionRules.g:2306:1: ( ( rule__Pattern__Group_1_1__0 )* )
            {
            // InternalReactionRules.g:2306:1: ( ( rule__Pattern__Group_1_1__0 )* )
            // InternalReactionRules.g:2307:2: ( rule__Pattern__Group_1_1__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_1_1()); 
            // InternalReactionRules.g:2308:2: ( rule__Pattern__Group_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalReactionRules.g:2308:3: rule__Pattern__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Pattern__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_1__1__Impl"


    // $ANTLR start "rule__Pattern__Group_1_1__0"
    // InternalReactionRules.g:2317:1: rule__Pattern__Group_1_1__0 : rule__Pattern__Group_1_1__0__Impl rule__Pattern__Group_1_1__1 ;
    public final void rule__Pattern__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2321:1: ( rule__Pattern__Group_1_1__0__Impl rule__Pattern__Group_1_1__1 )
            // InternalReactionRules.g:2322:2: rule__Pattern__Group_1_1__0__Impl rule__Pattern__Group_1_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Pattern__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_1_1__0"


    // $ANTLR start "rule__Pattern__Group_1_1__0__Impl"
    // InternalReactionRules.g:2329:1: rule__Pattern__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2333:1: ( ( ',' ) )
            // InternalReactionRules.g:2334:1: ( ',' )
            {
            // InternalReactionRules.g:2334:1: ( ',' )
            // InternalReactionRules.g:2335:2: ','
            {
             before(grammarAccess.getPatternAccess().getCommaKeyword_1_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_1_1__0__Impl"


    // $ANTLR start "rule__Pattern__Group_1_1__1"
    // InternalReactionRules.g:2344:1: rule__Pattern__Group_1_1__1 : rule__Pattern__Group_1_1__1__Impl ;
    public final void rule__Pattern__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2348:1: ( rule__Pattern__Group_1_1__1__Impl )
            // InternalReactionRules.g:2349:2: rule__Pattern__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_1_1__1"


    // $ANTLR start "rule__Pattern__Group_1_1__1__Impl"
    // InternalReactionRules.g:2355:1: rule__Pattern__Group_1_1__1__Impl : ( ( rule__Pattern__AgentPatternsAssignment_1_1_1 ) ) ;
    public final void rule__Pattern__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2359:1: ( ( ( rule__Pattern__AgentPatternsAssignment_1_1_1 ) ) )
            // InternalReactionRules.g:2360:1: ( ( rule__Pattern__AgentPatternsAssignment_1_1_1 ) )
            {
            // InternalReactionRules.g:2360:1: ( ( rule__Pattern__AgentPatternsAssignment_1_1_1 ) )
            // InternalReactionRules.g:2361:2: ( rule__Pattern__AgentPatternsAssignment_1_1_1 )
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAssignment_1_1_1()); 
            // InternalReactionRules.g:2362:2: ( rule__Pattern__AgentPatternsAssignment_1_1_1 )
            // InternalReactionRules.g:2362:3: rule__Pattern__AgentPatternsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__AgentPatternsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getAgentPatternsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_1_1__1__Impl"


    // $ANTLR start "rule__Observation__Group__0"
    // InternalReactionRules.g:2371:1: rule__Observation__Group__0 : rule__Observation__Group__0__Impl rule__Observation__Group__1 ;
    public final void rule__Observation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2375:1: ( rule__Observation__Group__0__Impl rule__Observation__Group__1 )
            // InternalReactionRules.g:2376:2: rule__Observation__Group__0__Impl rule__Observation__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:2383:1: rule__Observation__Group__0__Impl : ( 'Observation' ) ;
    public final void rule__Observation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2387:1: ( ( 'Observation' ) )
            // InternalReactionRules.g:2388:1: ( 'Observation' )
            {
            // InternalReactionRules.g:2388:1: ( 'Observation' )
            // InternalReactionRules.g:2389:2: 'Observation'
            {
             before(grammarAccess.getObservationAccess().getObservationKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getObservationAccess().getObservationKeyword_0()); 

            }


            }

        }
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
    // InternalReactionRules.g:2398:1: rule__Observation__Group__1 : rule__Observation__Group__1__Impl rule__Observation__Group__2 ;
    public final void rule__Observation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2402:1: ( rule__Observation__Group__1__Impl rule__Observation__Group__2 )
            // InternalReactionRules.g:2403:2: rule__Observation__Group__1__Impl rule__Observation__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:2410:1: rule__Observation__Group__1__Impl : ( ( rule__Observation__NameAssignment_1 ) ) ;
    public final void rule__Observation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2414:1: ( ( ( rule__Observation__NameAssignment_1 ) ) )
            // InternalReactionRules.g:2415:1: ( ( rule__Observation__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:2415:1: ( ( rule__Observation__NameAssignment_1 ) )
            // InternalReactionRules.g:2416:2: ( rule__Observation__NameAssignment_1 )
            {
             before(grammarAccess.getObservationAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:2417:2: ( rule__Observation__NameAssignment_1 )
            // InternalReactionRules.g:2417:3: rule__Observation__NameAssignment_1
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
    // InternalReactionRules.g:2425:1: rule__Observation__Group__2 : rule__Observation__Group__2__Impl ;
    public final void rule__Observation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2429:1: ( rule__Observation__Group__2__Impl )
            // InternalReactionRules.g:2430:2: rule__Observation__Group__2__Impl
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
    // InternalReactionRules.g:2436:1: rule__Observation__Group__2__Impl : ( ( rule__Observation__ObservationPatternAssignment_2 ) ) ;
    public final void rule__Observation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2440:1: ( ( ( rule__Observation__ObservationPatternAssignment_2 ) ) )
            // InternalReactionRules.g:2441:1: ( ( rule__Observation__ObservationPatternAssignment_2 ) )
            {
            // InternalReactionRules.g:2441:1: ( ( rule__Observation__ObservationPatternAssignment_2 ) )
            // InternalReactionRules.g:2442:2: ( rule__Observation__ObservationPatternAssignment_2 )
            {
             before(grammarAccess.getObservationAccess().getObservationPatternAssignment_2()); 
            // InternalReactionRules.g:2443:2: ( rule__Observation__ObservationPatternAssignment_2 )
            // InternalReactionRules.g:2443:3: rule__Observation__ObservationPatternAssignment_2
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
    // InternalReactionRules.g:2452:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2456:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // InternalReactionRules.g:2457:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:2464:1: rule__Initial__Group__0__Impl : ( 'Initial' ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2468:1: ( ( 'Initial' ) )
            // InternalReactionRules.g:2469:1: ( 'Initial' )
            {
            // InternalReactionRules.g:2469:1: ( 'Initial' )
            // InternalReactionRules.g:2470:2: 'Initial'
            {
             before(grammarAccess.getInitialAccess().getInitialKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getInitialKeyword_0()); 

            }


            }

        }
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
    // InternalReactionRules.g:2479:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2483:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // InternalReactionRules.g:2484:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalReactionRules.g:2491:1: rule__Initial__Group__1__Impl : ( ( rule__Initial__NameAssignment_1 ) ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2495:1: ( ( ( rule__Initial__NameAssignment_1 ) ) )
            // InternalReactionRules.g:2496:1: ( ( rule__Initial__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:2496:1: ( ( rule__Initial__NameAssignment_1 ) )
            // InternalReactionRules.g:2497:2: ( rule__Initial__NameAssignment_1 )
            {
             before(grammarAccess.getInitialAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:2498:2: ( rule__Initial__NameAssignment_1 )
            // InternalReactionRules.g:2498:3: rule__Initial__NameAssignment_1
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
    // InternalReactionRules.g:2506:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl rule__Initial__Group__3 ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2510:1: ( rule__Initial__Group__2__Impl rule__Initial__Group__3 )
            // InternalReactionRules.g:2511:2: rule__Initial__Group__2__Impl rule__Initial__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:2518:1: rule__Initial__Group__2__Impl : ( ( rule__Initial__CountAssignment_2 ) ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2522:1: ( ( ( rule__Initial__CountAssignment_2 ) ) )
            // InternalReactionRules.g:2523:1: ( ( rule__Initial__CountAssignment_2 ) )
            {
            // InternalReactionRules.g:2523:1: ( ( rule__Initial__CountAssignment_2 ) )
            // InternalReactionRules.g:2524:2: ( rule__Initial__CountAssignment_2 )
            {
             before(grammarAccess.getInitialAccess().getCountAssignment_2()); 
            // InternalReactionRules.g:2525:2: ( rule__Initial__CountAssignment_2 )
            // InternalReactionRules.g:2525:3: rule__Initial__CountAssignment_2
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
    // InternalReactionRules.g:2533:1: rule__Initial__Group__3 : rule__Initial__Group__3__Impl ;
    public final void rule__Initial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2537:1: ( rule__Initial__Group__3__Impl )
            // InternalReactionRules.g:2538:2: rule__Initial__Group__3__Impl
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
    // InternalReactionRules.g:2544:1: rule__Initial__Group__3__Impl : ( ( rule__Initial__InitialPatternAssignment_3 ) ) ;
    public final void rule__Initial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2548:1: ( ( ( rule__Initial__InitialPatternAssignment_3 ) ) )
            // InternalReactionRules.g:2549:1: ( ( rule__Initial__InitialPatternAssignment_3 ) )
            {
            // InternalReactionRules.g:2549:1: ( ( rule__Initial__InitialPatternAssignment_3 ) )
            // InternalReactionRules.g:2550:2: ( rule__Initial__InitialPatternAssignment_3 )
            {
             before(grammarAccess.getInitialAccess().getInitialPatternAssignment_3()); 
            // InternalReactionRules.g:2551:2: ( rule__Initial__InitialPatternAssignment_3 )
            // InternalReactionRules.g:2551:3: rule__Initial__InitialPatternAssignment_3
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


    // $ANTLR start "rule__Rule__Group__0"
    // InternalReactionRules.g:2560:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2564:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalReactionRules.g:2565:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:2572:1: rule__Rule__Group__0__Impl : ( 'Rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2576:1: ( ( 'Rule' ) )
            // InternalReactionRules.g:2577:1: ( 'Rule' )
            {
            // InternalReactionRules.g:2577:1: ( 'Rule' )
            // InternalReactionRules.g:2578:2: 'Rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalReactionRules.g:2587:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2591:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalReactionRules.g:2592:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:2599:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2603:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalReactionRules.g:2604:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:2604:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalReactionRules.g:2605:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:2606:2: ( rule__Rule__NameAssignment_1 )
            // InternalReactionRules.g:2606:3: rule__Rule__NameAssignment_1
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
    // InternalReactionRules.g:2614:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2618:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalReactionRules.g:2619:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
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
    // InternalReactionRules.g:2626:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__LhsAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2630:1: ( ( ( rule__Rule__LhsAssignment_2 ) ) )
            // InternalReactionRules.g:2631:1: ( ( rule__Rule__LhsAssignment_2 ) )
            {
            // InternalReactionRules.g:2631:1: ( ( rule__Rule__LhsAssignment_2 ) )
            // InternalReactionRules.g:2632:2: ( rule__Rule__LhsAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getLhsAssignment_2()); 
            // InternalReactionRules.g:2633:2: ( rule__Rule__LhsAssignment_2 )
            // InternalReactionRules.g:2633:3: rule__Rule__LhsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__LhsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getLhsAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Rule__Group__3"
    // InternalReactionRules.g:2641:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2645:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalReactionRules.g:2646:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalReactionRules.g:2653:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__Alternatives_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2657:1: ( ( ( rule__Rule__Alternatives_3 ) ) )
            // InternalReactionRules.g:2658:1: ( ( rule__Rule__Alternatives_3 ) )
            {
            // InternalReactionRules.g:2658:1: ( ( rule__Rule__Alternatives_3 ) )
            // InternalReactionRules.g:2659:2: ( rule__Rule__Alternatives_3 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_3()); 
            // InternalReactionRules.g:2660:2: ( rule__Rule__Alternatives_3 )
            // InternalReactionRules.g:2660:3: rule__Rule__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalReactionRules.g:2668:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2672:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalReactionRules.g:2673:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalReactionRules.g:2680:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__RhsAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2684:1: ( ( ( rule__Rule__RhsAssignment_4 ) ) )
            // InternalReactionRules.g:2685:1: ( ( rule__Rule__RhsAssignment_4 ) )
            {
            // InternalReactionRules.g:2685:1: ( ( rule__Rule__RhsAssignment_4 ) )
            // InternalReactionRules.g:2686:2: ( rule__Rule__RhsAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getRhsAssignment_4()); 
            // InternalReactionRules.g:2687:2: ( rule__Rule__RhsAssignment_4 )
            // InternalReactionRules.g:2687:3: rule__Rule__RhsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rule__RhsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getRhsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalReactionRules.g:2695:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2699:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalReactionRules.g:2700:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalReactionRules.g:2707:1: rule__Rule__Group__5__Impl : ( 'at' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2711:1: ( ( 'at' ) )
            // InternalReactionRules.g:2712:1: ( 'at' )
            {
            // InternalReactionRules.g:2712:1: ( 'at' )
            // InternalReactionRules.g:2713:2: 'at'
            {
             before(grammarAccess.getRuleAccess().getAtKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getAtKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalReactionRules.g:2722:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2726:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalReactionRules.g:2727:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalReactionRules.g:2734:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__VariablesAssignment_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2738:1: ( ( ( rule__Rule__VariablesAssignment_6 ) ) )
            // InternalReactionRules.g:2739:1: ( ( rule__Rule__VariablesAssignment_6 ) )
            {
            // InternalReactionRules.g:2739:1: ( ( rule__Rule__VariablesAssignment_6 ) )
            // InternalReactionRules.g:2740:2: ( rule__Rule__VariablesAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getVariablesAssignment_6()); 
            // InternalReactionRules.g:2741:2: ( rule__Rule__VariablesAssignment_6 )
            // InternalReactionRules.g:2741:3: rule__Rule__VariablesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Rule__VariablesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getVariablesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // InternalReactionRules.g:2749:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2753:1: ( rule__Rule__Group__7__Impl )
            // InternalReactionRules.g:2754:2: rule__Rule__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // InternalReactionRules.g:2760:1: rule__Rule__Group__7__Impl : ( ( rule__Rule__Group_7__0 )* ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2764:1: ( ( ( rule__Rule__Group_7__0 )* ) )
            // InternalReactionRules.g:2765:1: ( ( rule__Rule__Group_7__0 )* )
            {
            // InternalReactionRules.g:2765:1: ( ( rule__Rule__Group_7__0 )* )
            // InternalReactionRules.g:2766:2: ( rule__Rule__Group_7__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_7()); 
            // InternalReactionRules.g:2767:2: ( rule__Rule__Group_7__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalReactionRules.g:2767:3: rule__Rule__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Rule__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group_7__0"
    // InternalReactionRules.g:2776:1: rule__Rule__Group_7__0 : rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 ;
    public final void rule__Rule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2780:1: ( rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 )
            // InternalReactionRules.g:2781:2: rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__Rule__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__0"


    // $ANTLR start "rule__Rule__Group_7__0__Impl"
    // InternalReactionRules.g:2788:1: rule__Rule__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2792:1: ( ( ',' ) )
            // InternalReactionRules.g:2793:1: ( ',' )
            {
            // InternalReactionRules.g:2793:1: ( ',' )
            // InternalReactionRules.g:2794:2: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_7_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__0__Impl"


    // $ANTLR start "rule__Rule__Group_7__1"
    // InternalReactionRules.g:2803:1: rule__Rule__Group_7__1 : rule__Rule__Group_7__1__Impl ;
    public final void rule__Rule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2807:1: ( rule__Rule__Group_7__1__Impl )
            // InternalReactionRules.g:2808:2: rule__Rule__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__1"


    // $ANTLR start "rule__Rule__Group_7__1__Impl"
    // InternalReactionRules.g:2814:1: rule__Rule__Group_7__1__Impl : ( ( rule__Rule__VariablesAssignment_7_1 ) ) ;
    public final void rule__Rule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2818:1: ( ( ( rule__Rule__VariablesAssignment_7_1 ) ) )
            // InternalReactionRules.g:2819:1: ( ( rule__Rule__VariablesAssignment_7_1 ) )
            {
            // InternalReactionRules.g:2819:1: ( ( rule__Rule__VariablesAssignment_7_1 ) )
            // InternalReactionRules.g:2820:2: ( rule__Rule__VariablesAssignment_7_1 )
            {
             before(grammarAccess.getRuleAccess().getVariablesAssignment_7_1()); 
            // InternalReactionRules.g:2821:2: ( rule__Rule__VariablesAssignment_7_1 )
            // InternalReactionRules.g:2821:3: rule__Rule__VariablesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__VariablesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getVariablesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__1__Impl"


    // $ANTLR start "rule__ReactionRuleModel__ReactionPropertiesAssignment"
    // InternalReactionRules.g:2830:1: rule__ReactionRuleModel__ReactionPropertiesAssignment : ( ruleReactionProperty ) ;
    public final void rule__ReactionRuleModel__ReactionPropertiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2834:1: ( ( ruleReactionProperty ) )
            // InternalReactionRules.g:2835:2: ( ruleReactionProperty )
            {
            // InternalReactionRules.g:2835:2: ( ruleReactionProperty )
            // InternalReactionRules.g:2836:3: ruleReactionProperty
            {
             before(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesReactionPropertyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleReactionProperty();

            state._fsp--;

             after(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesReactionPropertyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionRuleModel__ReactionPropertiesAssignment"


    // $ANTLR start "rule__State__NameAssignment"
    // InternalReactionRules.g:2845:1: rule__State__NameAssignment : ( RULE_ID ) ;
    public final void rule__State__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2849:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:2850:2: ( RULE_ID )
            {
            // InternalReactionRules.g:2850:2: ( RULE_ID )
            // InternalReactionRules.g:2851:3: RULE_ID
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
    // InternalReactionRules.g:2860:1: rule__States__StateAssignment_1_1 : ( ruleState ) ;
    public final void rule__States__StateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2864:1: ( ( ruleState ) )
            // InternalReactionRules.g:2865:2: ( ruleState )
            {
            // InternalReactionRules.g:2865:2: ( ruleState )
            // InternalReactionRules.g:2866:3: ruleState
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
    // InternalReactionRules.g:2875:1: rule__States__StateAssignment_1_2_1 : ( ruleState ) ;
    public final void rule__States__StateAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2879:1: ( ( ruleState ) )
            // InternalReactionRules.g:2880:2: ( ruleState )
            {
            // InternalReactionRules.g:2880:2: ( ruleState )
            // InternalReactionRules.g:2881:3: ruleState
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
    // InternalReactionRules.g:2890:1: rule__Site__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Site__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2894:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:2895:2: ( RULE_ID )
            {
            // InternalReactionRules.g:2895:2: ( RULE_ID )
            // InternalReactionRules.g:2896:3: RULE_ID
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
    // InternalReactionRules.g:2905:1: rule__Site__StatesAssignment_1 : ( ruleStates ) ;
    public final void rule__Site__StatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2909:1: ( ( ruleStates ) )
            // InternalReactionRules.g:2910:2: ( ruleStates )
            {
            // InternalReactionRules.g:2910:2: ( ruleStates )
            // InternalReactionRules.g:2911:3: ruleStates
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
    // InternalReactionRules.g:2920:1: rule__Sites__SitesAssignment_1_1 : ( ruleSite ) ;
    public final void rule__Sites__SitesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2924:1: ( ( ruleSite ) )
            // InternalReactionRules.g:2925:2: ( ruleSite )
            {
            // InternalReactionRules.g:2925:2: ( ruleSite )
            // InternalReactionRules.g:2926:3: ruleSite
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
    // InternalReactionRules.g:2935:1: rule__Sites__SitesAssignment_1_2_1 : ( ruleSite ) ;
    public final void rule__Sites__SitesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2939:1: ( ( ruleSite ) )
            // InternalReactionRules.g:2940:2: ( ruleSite )
            {
            // InternalReactionRules.g:2940:2: ( ruleSite )
            // InternalReactionRules.g:2941:3: ruleSite
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
    // InternalReactionRules.g:2950:1: rule__Agent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2954:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:2955:2: ( RULE_ID )
            {
            // InternalReactionRules.g:2955:2: ( RULE_ID )
            // InternalReactionRules.g:2956:3: RULE_ID
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
    // InternalReactionRules.g:2965:1: rule__Agent__SitesAssignment_2 : ( ruleSites ) ;
    public final void rule__Agent__SitesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2969:1: ( ( ruleSites ) )
            // InternalReactionRules.g:2970:2: ( ruleSites )
            {
            // InternalReactionRules.g:2970:2: ( ruleSites )
            // InternalReactionRules.g:2971:3: ruleSites
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


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalReactionRules.g:2980:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2984:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:2985:2: ( RULE_ID )
            {
            // InternalReactionRules.g:2985:2: ( RULE_ID )
            // InternalReactionRules.g:2986:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Variable__ValueAssignment_3"
    // InternalReactionRules.g:2995:1: rule__Variable__ValueAssignment_3 : ( ruleFloat ) ;
    public final void rule__Variable__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2999:1: ( ( ruleFloat ) )
            // InternalReactionRules.g:3000:2: ( ruleFloat )
            {
            // InternalReactionRules.g:3000:2: ( ruleFloat )
            // InternalReactionRules.g:3001:3: ruleFloat
            {
             before(grammarAccess.getVariableAccess().getValueFloatParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getValueFloatParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ValueAssignment_3"


    // $ANTLR start "rule__LimitLink__StateAssignment_1"
    // InternalReactionRules.g:3010:1: rule__LimitLink__StateAssignment_1 : ( ruleBigInteger ) ;
    public final void rule__LimitLink__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3014:1: ( ( ruleBigInteger ) )
            // InternalReactionRules.g:3015:2: ( ruleBigInteger )
            {
            // InternalReactionRules.g:3015:2: ( ruleBigInteger )
            // InternalReactionRules.g:3016:3: ruleBigInteger
            {
             before(grammarAccess.getLimitLinkAccess().getStateBigIntegerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBigInteger();

            state._fsp--;

             after(grammarAccess.getLimitLinkAccess().getStateBigIntegerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitLink__StateAssignment_1"


    // $ANTLR start "rule__ExactLink__SiteAssignment_1"
    // InternalReactionRules.g:3025:1: rule__ExactLink__SiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExactLink__SiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3029:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:3030:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:3030:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:3031:3: ( RULE_ID )
            {
             before(grammarAccess.getExactLinkAccess().getSiteSiteCrossReference_1_0()); 
            // InternalReactionRules.g:3032:3: ( RULE_ID )
            // InternalReactionRules.g:3033:4: RULE_ID
            {
             before(grammarAccess.getExactLinkAccess().getSiteSiteIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExactLinkAccess().getSiteSiteIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getExactLinkAccess().getSiteSiteCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLink__SiteAssignment_1"


    // $ANTLR start "rule__ExactLink__AgentAssignment_3"
    // InternalReactionRules.g:3044:1: rule__ExactLink__AgentAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ExactLink__AgentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3048:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:3049:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:3049:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:3050:3: ( RULE_ID )
            {
             before(grammarAccess.getExactLinkAccess().getAgentAgentCrossReference_3_0()); 
            // InternalReactionRules.g:3051:3: ( RULE_ID )
            // InternalReactionRules.g:3052:4: RULE_ID
            {
             before(grammarAccess.getExactLinkAccess().getAgentAgentIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExactLinkAccess().getAgentAgentIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getExactLinkAccess().getAgentAgentCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLink__AgentAssignment_3"


    // $ANTLR start "rule__SitePattern__SiteAssignment_1"
    // InternalReactionRules.g:3063:1: rule__SitePattern__SiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SitePattern__SiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3067:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:3068:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:3068:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:3069:3: ( RULE_ID )
            {
             before(grammarAccess.getSitePatternAccess().getSiteSiteCrossReference_1_0()); 
            // InternalReactionRules.g:3070:3: ( RULE_ID )
            // InternalReactionRules.g:3071:4: RULE_ID
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


    // $ANTLR start "rule__SitePattern__StateAssignment_2_1"
    // InternalReactionRules.g:3082:1: rule__SitePattern__StateAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SitePattern__StateAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3086:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:3087:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:3087:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:3088:3: ( RULE_ID )
            {
             before(grammarAccess.getSitePatternAccess().getStateStateCrossReference_2_1_0()); 
            // InternalReactionRules.g:3089:3: ( RULE_ID )
            // InternalReactionRules.g:3090:4: RULE_ID
            {
             before(grammarAccess.getSitePatternAccess().getStateStateIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSitePatternAccess().getStateStateIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getSitePatternAccess().getStateStateCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__StateAssignment_2_1"


    // $ANTLR start "rule__SitePattern__LinkStateAssignment_3_1"
    // InternalReactionRules.g:3101:1: rule__SitePattern__LinkStateAssignment_3_1 : ( ruleLinkState ) ;
    public final void rule__SitePattern__LinkStateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3105:1: ( ( ruleLinkState ) )
            // InternalReactionRules.g:3106:2: ( ruleLinkState )
            {
            // InternalReactionRules.g:3106:2: ( ruleLinkState )
            // InternalReactionRules.g:3107:3: ruleLinkState
            {
             before(grammarAccess.getSitePatternAccess().getLinkStateLinkStateParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLinkState();

            state._fsp--;

             after(grammarAccess.getSitePatternAccess().getLinkStateLinkStateParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__LinkStateAssignment_3_1"


    // $ANTLR start "rule__AgentPattern__AgentAssignment_1"
    // InternalReactionRules.g:3116:1: rule__AgentPattern__AgentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AgentPattern__AgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3120:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:3121:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:3121:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:3122:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentPatternAccess().getAgentAgentCrossReference_1_0()); 
            // InternalReactionRules.g:3123:3: ( RULE_ID )
            // InternalReactionRules.g:3124:4: RULE_ID
            {
             before(grammarAccess.getAgentPatternAccess().getAgentAgentIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAgentPatternAccess().getAgentAgentIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAgentPatternAccess().getAgentAgentCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__AgentAssignment_1"


    // $ANTLR start "rule__AgentPattern__SitePatternsAssignment_3_0"
    // InternalReactionRules.g:3135:1: rule__AgentPattern__SitePatternsAssignment_3_0 : ( ruleSitePattern ) ;
    public final void rule__AgentPattern__SitePatternsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3139:1: ( ( ruleSitePattern ) )
            // InternalReactionRules.g:3140:2: ( ruleSitePattern )
            {
            // InternalReactionRules.g:3140:2: ( ruleSitePattern )
            // InternalReactionRules.g:3141:3: ruleSitePattern
            {
             before(grammarAccess.getAgentPatternAccess().getSitePatternsSitePatternParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSitePattern();

            state._fsp--;

             after(grammarAccess.getAgentPatternAccess().getSitePatternsSitePatternParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__SitePatternsAssignment_3_0"


    // $ANTLR start "rule__AgentPattern__SitePatternsAssignment_3_1_1"
    // InternalReactionRules.g:3150:1: rule__AgentPattern__SitePatternsAssignment_3_1_1 : ( ruleSitePattern ) ;
    public final void rule__AgentPattern__SitePatternsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3154:1: ( ( ruleSitePattern ) )
            // InternalReactionRules.g:3155:2: ( ruleSitePattern )
            {
            // InternalReactionRules.g:3155:2: ( ruleSitePattern )
            // InternalReactionRules.g:3156:3: ruleSitePattern
            {
             before(grammarAccess.getAgentPatternAccess().getSitePatternsSitePatternParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSitePattern();

            state._fsp--;

             after(grammarAccess.getAgentPatternAccess().getSitePatternsSitePatternParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__SitePatternsAssignment_3_1_1"


    // $ANTLR start "rule__Pattern__AgentPatternsAssignment_1_0"
    // InternalReactionRules.g:3165:1: rule__Pattern__AgentPatternsAssignment_1_0 : ( ruleAgentPattern ) ;
    public final void rule__Pattern__AgentPatternsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3169:1: ( ( ruleAgentPattern ) )
            // InternalReactionRules.g:3170:2: ( ruleAgentPattern )
            {
            // InternalReactionRules.g:3170:2: ( ruleAgentPattern )
            // InternalReactionRules.g:3171:3: ruleAgentPattern
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAgentPatternParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAgentPattern();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getAgentPatternsAgentPatternParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__AgentPatternsAssignment_1_0"


    // $ANTLR start "rule__Pattern__AgentPatternsAssignment_1_1_1"
    // InternalReactionRules.g:3180:1: rule__Pattern__AgentPatternsAssignment_1_1_1 : ( ruleAgentPattern ) ;
    public final void rule__Pattern__AgentPatternsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3184:1: ( ( ruleAgentPattern ) )
            // InternalReactionRules.g:3185:2: ( ruleAgentPattern )
            {
            // InternalReactionRules.g:3185:2: ( ruleAgentPattern )
            // InternalReactionRules.g:3186:3: ruleAgentPattern
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAgentPatternParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAgentPattern();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getAgentPatternsAgentPatternParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__AgentPatternsAssignment_1_1_1"


    // $ANTLR start "rule__Observation__NameAssignment_1"
    // InternalReactionRules.g:3195:1: rule__Observation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Observation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3199:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:3200:2: ( RULE_ID )
            {
            // InternalReactionRules.g:3200:2: ( RULE_ID )
            // InternalReactionRules.g:3201:3: RULE_ID
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
    // InternalReactionRules.g:3210:1: rule__Observation__ObservationPatternAssignment_2 : ( rulePattern ) ;
    public final void rule__Observation__ObservationPatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3214:1: ( ( rulePattern ) )
            // InternalReactionRules.g:3215:2: ( rulePattern )
            {
            // InternalReactionRules.g:3215:2: ( rulePattern )
            // InternalReactionRules.g:3216:3: rulePattern
            {
             before(grammarAccess.getObservationAccess().getObservationPatternPatternParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getObservationAccess().getObservationPatternPatternParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Initial__NameAssignment_1"
    // InternalReactionRules.g:3225:1: rule__Initial__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Initial__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3229:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:3230:2: ( RULE_ID )
            {
            // InternalReactionRules.g:3230:2: ( RULE_ID )
            // InternalReactionRules.g:3231:3: RULE_ID
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
    // InternalReactionRules.g:3240:1: rule__Initial__CountAssignment_2 : ( ruleBigInteger ) ;
    public final void rule__Initial__CountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3244:1: ( ( ruleBigInteger ) )
            // InternalReactionRules.g:3245:2: ( ruleBigInteger )
            {
            // InternalReactionRules.g:3245:2: ( ruleBigInteger )
            // InternalReactionRules.g:3246:3: ruleBigInteger
            {
             before(grammarAccess.getInitialAccess().getCountBigIntegerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBigInteger();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getCountBigIntegerParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalReactionRules.g:3255:1: rule__Initial__InitialPatternAssignment_3 : ( rulePattern ) ;
    public final void rule__Initial__InitialPatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3259:1: ( ( rulePattern ) )
            // InternalReactionRules.g:3260:2: ( rulePattern )
            {
            // InternalReactionRules.g:3260:2: ( rulePattern )
            // InternalReactionRules.g:3261:3: rulePattern
            {
             before(grammarAccess.getInitialAccess().getInitialPatternPatternParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getInitialPatternPatternParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalReactionRules.g:3270:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3274:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:3275:2: ( RULE_ID )
            {
            // InternalReactionRules.g:3275:2: ( RULE_ID )
            // InternalReactionRules.g:3276:3: RULE_ID
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


    // $ANTLR start "rule__Rule__LhsAssignment_2"
    // InternalReactionRules.g:3285:1: rule__Rule__LhsAssignment_2 : ( rulePattern ) ;
    public final void rule__Rule__LhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3289:1: ( ( rulePattern ) )
            // InternalReactionRules.g:3290:2: ( rulePattern )
            {
            // InternalReactionRules.g:3290:2: ( rulePattern )
            // InternalReactionRules.g:3291:3: rulePattern
            {
             before(grammarAccess.getRuleAccess().getLhsPatternParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getLhsPatternParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__LhsAssignment_2"


    // $ANTLR start "rule__Rule__RhsAssignment_4"
    // InternalReactionRules.g:3300:1: rule__Rule__RhsAssignment_4 : ( rulePattern ) ;
    public final void rule__Rule__RhsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3304:1: ( ( rulePattern ) )
            // InternalReactionRules.g:3305:2: ( rulePattern )
            {
            // InternalReactionRules.g:3305:2: ( rulePattern )
            // InternalReactionRules.g:3306:3: rulePattern
            {
             before(grammarAccess.getRuleAccess().getRhsPatternParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRhsPatternParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__RhsAssignment_4"


    // $ANTLR start "rule__Rule__VariablesAssignment_6"
    // InternalReactionRules.g:3315:1: rule__Rule__VariablesAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__VariablesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3319:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:3320:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:3320:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:3321:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getVariablesVariableCrossReference_6_0()); 
            // InternalReactionRules.g:3322:3: ( RULE_ID )
            // InternalReactionRules.g:3323:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getVariablesVariableIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getVariablesVariableIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getVariablesVariableCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__VariablesAssignment_6"


    // $ANTLR start "rule__Rule__VariablesAssignment_7_1"
    // InternalReactionRules.g:3334:1: rule__Rule__VariablesAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__VariablesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3338:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:3339:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:3339:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:3340:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getVariablesVariableCrossReference_7_1_0()); 
            // InternalReactionRules.g:3341:3: ( RULE_ID )
            // InternalReactionRules.g:3342:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getVariablesVariableIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getVariablesVariableIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getVariablesVariableCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__VariablesAssignment_7_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000001C180002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});

}