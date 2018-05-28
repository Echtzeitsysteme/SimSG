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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_EXPONENT", "RULE_AT", "RULE_STRING", "RULE_ID", "RULE_SEMI_LINK", "RULE_FREE_LINK", "RULE_WHATEVER_LINK", "RULE_VOID_PATTERN", "RULE_UNI", "RULE_BI", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'+'", "'URI'", "'PATH'", "'ModelID'", "'AgentInstance'", "'.'", "'{'", "'}'", "','", "'('", "')'", "'agent'", "'var'", "'='", "'['", "']'", "'obs'", "'init'", "'rule'"
    };
    public static final int RULE_FREE_LINK=10;
    public static final int RULE_STRING=7;
    public static final int RULE_AT=6;
    public static final int RULE_WHATEVER_LINK=11;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_SEMI_LINK=9;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_VOID_PATTERN=12;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=8;
    public static final int RULE_WS=17;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_BI=14;
    public static final int RULE_EXPONENT=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int RULE_UNI=13;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
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


    // $ANTLR start "entryRuleModelUri"
    // InternalReactionRules.g:78:1: entryRuleModelUri : ruleModelUri EOF ;
    public final void entryRuleModelUri() throws RecognitionException {
        try {
            // InternalReactionRules.g:79:1: ( ruleModelUri EOF )
            // InternalReactionRules.g:80:1: ruleModelUri EOF
            {
             before(grammarAccess.getModelUriRule()); 
            pushFollow(FOLLOW_1);
            ruleModelUri();

            state._fsp--;

             after(grammarAccess.getModelUriRule()); 
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
    // $ANTLR end "entryRuleModelUri"


    // $ANTLR start "ruleModelUri"
    // InternalReactionRules.g:87:1: ruleModelUri : ( ( rule__ModelUri__Group__0 ) ) ;
    public final void ruleModelUri() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:91:2: ( ( ( rule__ModelUri__Group__0 ) ) )
            // InternalReactionRules.g:92:2: ( ( rule__ModelUri__Group__0 ) )
            {
            // InternalReactionRules.g:92:2: ( ( rule__ModelUri__Group__0 ) )
            // InternalReactionRules.g:93:3: ( rule__ModelUri__Group__0 )
            {
             before(grammarAccess.getModelUriAccess().getGroup()); 
            // InternalReactionRules.g:94:3: ( rule__ModelUri__Group__0 )
            // InternalReactionRules.g:94:4: rule__ModelUri__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelUri__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelUriAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelUri"


    // $ANTLR start "entryRuleModelPath"
    // InternalReactionRules.g:103:1: entryRuleModelPath : ruleModelPath EOF ;
    public final void entryRuleModelPath() throws RecognitionException {
        try {
            // InternalReactionRules.g:104:1: ( ruleModelPath EOF )
            // InternalReactionRules.g:105:1: ruleModelPath EOF
            {
             before(grammarAccess.getModelPathRule()); 
            pushFollow(FOLLOW_1);
            ruleModelPath();

            state._fsp--;

             after(grammarAccess.getModelPathRule()); 
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
    // $ANTLR end "entryRuleModelPath"


    // $ANTLR start "ruleModelPath"
    // InternalReactionRules.g:112:1: ruleModelPath : ( ( rule__ModelPath__Group__0 ) ) ;
    public final void ruleModelPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:116:2: ( ( ( rule__ModelPath__Group__0 ) ) )
            // InternalReactionRules.g:117:2: ( ( rule__ModelPath__Group__0 ) )
            {
            // InternalReactionRules.g:117:2: ( ( rule__ModelPath__Group__0 ) )
            // InternalReactionRules.g:118:3: ( rule__ModelPath__Group__0 )
            {
             before(grammarAccess.getModelPathAccess().getGroup()); 
            // InternalReactionRules.g:119:3: ( rule__ModelPath__Group__0 )
            // InternalReactionRules.g:119:4: rule__ModelPath__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelPath__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelPathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelPath"


    // $ANTLR start "entryRuleModelLocation"
    // InternalReactionRules.g:128:1: entryRuleModelLocation : ruleModelLocation EOF ;
    public final void entryRuleModelLocation() throws RecognitionException {
        try {
            // InternalReactionRules.g:129:1: ( ruleModelLocation EOF )
            // InternalReactionRules.g:130:1: ruleModelLocation EOF
            {
             before(grammarAccess.getModelLocationRule()); 
            pushFollow(FOLLOW_1);
            ruleModelLocation();

            state._fsp--;

             after(grammarAccess.getModelLocationRule()); 
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
    // $ANTLR end "entryRuleModelLocation"


    // $ANTLR start "ruleModelLocation"
    // InternalReactionRules.g:137:1: ruleModelLocation : ( ( rule__ModelLocation__Alternatives ) ) ;
    public final void ruleModelLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:141:2: ( ( ( rule__ModelLocation__Alternatives ) ) )
            // InternalReactionRules.g:142:2: ( ( rule__ModelLocation__Alternatives ) )
            {
            // InternalReactionRules.g:142:2: ( ( rule__ModelLocation__Alternatives ) )
            // InternalReactionRules.g:143:3: ( rule__ModelLocation__Alternatives )
            {
             before(grammarAccess.getModelLocationAccess().getAlternatives()); 
            // InternalReactionRules.g:144:3: ( rule__ModelLocation__Alternatives )
            // InternalReactionRules.g:144:4: rule__ModelLocation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModelLocation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelLocationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelLocation"


    // $ANTLR start "entryRuleModel"
    // InternalReactionRules.g:153:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalReactionRules.g:154:1: ( ruleModel EOF )
            // InternalReactionRules.g:155:1: ruleModel EOF
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
    // InternalReactionRules.g:162:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:166:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalReactionRules.g:167:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalReactionRules.g:167:2: ( ( rule__Model__Group__0 ) )
            // InternalReactionRules.g:168:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalReactionRules.g:169:3: ( rule__Model__Group__0 )
            // InternalReactionRules.g:169:4: rule__Model__Group__0
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


    // $ANTLR start "entryRuleReactionContainer"
    // InternalReactionRules.g:178:1: entryRuleReactionContainer : ruleReactionContainer EOF ;
    public final void entryRuleReactionContainer() throws RecognitionException {
        try {
            // InternalReactionRules.g:179:1: ( ruleReactionContainer EOF )
            // InternalReactionRules.g:180:1: ruleReactionContainer EOF
            {
             before(grammarAccess.getReactionContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleReactionContainer();

            state._fsp--;

             after(grammarAccess.getReactionContainerRule()); 
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
    // $ANTLR end "entryRuleReactionContainer"


    // $ANTLR start "ruleReactionContainer"
    // InternalReactionRules.g:187:1: ruleReactionContainer : ( ( rule__ReactionContainer__Group__0 ) ) ;
    public final void ruleReactionContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:191:2: ( ( ( rule__ReactionContainer__Group__0 ) ) )
            // InternalReactionRules.g:192:2: ( ( rule__ReactionContainer__Group__0 ) )
            {
            // InternalReactionRules.g:192:2: ( ( rule__ReactionContainer__Group__0 ) )
            // InternalReactionRules.g:193:3: ( rule__ReactionContainer__Group__0 )
            {
             before(grammarAccess.getReactionContainerAccess().getGroup()); 
            // InternalReactionRules.g:194:3: ( rule__ReactionContainer__Group__0 )
            // InternalReactionRules.g:194:4: rule__ReactionContainer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactionContainer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactionContainerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReactionContainer"


    // $ANTLR start "entryRuleAgentInstanceSiteState"
    // InternalReactionRules.g:203:1: entryRuleAgentInstanceSiteState : ruleAgentInstanceSiteState EOF ;
    public final void entryRuleAgentInstanceSiteState() throws RecognitionException {
        try {
            // InternalReactionRules.g:204:1: ( ruleAgentInstanceSiteState EOF )
            // InternalReactionRules.g:205:1: ruleAgentInstanceSiteState EOF
            {
             before(grammarAccess.getAgentInstanceSiteStateRule()); 
            pushFollow(FOLLOW_1);
            ruleAgentInstanceSiteState();

            state._fsp--;

             after(grammarAccess.getAgentInstanceSiteStateRule()); 
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
    // $ANTLR end "entryRuleAgentInstanceSiteState"


    // $ANTLR start "ruleAgentInstanceSiteState"
    // InternalReactionRules.g:212:1: ruleAgentInstanceSiteState : ( ( rule__AgentInstanceSiteState__Group__0 ) ) ;
    public final void ruleAgentInstanceSiteState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:216:2: ( ( ( rule__AgentInstanceSiteState__Group__0 ) ) )
            // InternalReactionRules.g:217:2: ( ( rule__AgentInstanceSiteState__Group__0 ) )
            {
            // InternalReactionRules.g:217:2: ( ( rule__AgentInstanceSiteState__Group__0 ) )
            // InternalReactionRules.g:218:3: ( rule__AgentInstanceSiteState__Group__0 )
            {
             before(grammarAccess.getAgentInstanceSiteStateAccess().getGroup()); 
            // InternalReactionRules.g:219:3: ( rule__AgentInstanceSiteState__Group__0 )
            // InternalReactionRules.g:219:4: rule__AgentInstanceSiteState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstanceSiteState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceSiteStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAgentInstanceSiteState"


    // $ANTLR start "entryRuleAgentInstanceLinkState"
    // InternalReactionRules.g:228:1: entryRuleAgentInstanceLinkState : ruleAgentInstanceLinkState EOF ;
    public final void entryRuleAgentInstanceLinkState() throws RecognitionException {
        try {
            // InternalReactionRules.g:229:1: ( ruleAgentInstanceLinkState EOF )
            // InternalReactionRules.g:230:1: ruleAgentInstanceLinkState EOF
            {
             before(grammarAccess.getAgentInstanceLinkStateRule()); 
            pushFollow(FOLLOW_1);
            ruleAgentInstanceLinkState();

            state._fsp--;

             after(grammarAccess.getAgentInstanceLinkStateRule()); 
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
    // $ANTLR end "entryRuleAgentInstanceLinkState"


    // $ANTLR start "ruleAgentInstanceLinkState"
    // InternalReactionRules.g:237:1: ruleAgentInstanceLinkState : ( ( rule__AgentInstanceLinkState__Group__0 ) ) ;
    public final void ruleAgentInstanceLinkState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:241:2: ( ( ( rule__AgentInstanceLinkState__Group__0 ) ) )
            // InternalReactionRules.g:242:2: ( ( rule__AgentInstanceLinkState__Group__0 ) )
            {
            // InternalReactionRules.g:242:2: ( ( rule__AgentInstanceLinkState__Group__0 ) )
            // InternalReactionRules.g:243:3: ( rule__AgentInstanceLinkState__Group__0 )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getGroup()); 
            // InternalReactionRules.g:244:3: ( rule__AgentInstanceLinkState__Group__0 )
            // InternalReactionRules.g:244:4: rule__AgentInstanceLinkState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstanceLinkState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceLinkStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAgentInstanceLinkState"


    // $ANTLR start "entryRuleAgentInstance"
    // InternalReactionRules.g:253:1: entryRuleAgentInstance : ruleAgentInstance EOF ;
    public final void entryRuleAgentInstance() throws RecognitionException {
        try {
            // InternalReactionRules.g:254:1: ( ruleAgentInstance EOF )
            // InternalReactionRules.g:255:1: ruleAgentInstance EOF
            {
             before(grammarAccess.getAgentInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleAgentInstance();

            state._fsp--;

             after(grammarAccess.getAgentInstanceRule()); 
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
    // $ANTLR end "entryRuleAgentInstance"


    // $ANTLR start "ruleAgentInstance"
    // InternalReactionRules.g:262:1: ruleAgentInstance : ( ( rule__AgentInstance__Group__0 ) ) ;
    public final void ruleAgentInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:266:2: ( ( ( rule__AgentInstance__Group__0 ) ) )
            // InternalReactionRules.g:267:2: ( ( rule__AgentInstance__Group__0 ) )
            {
            // InternalReactionRules.g:267:2: ( ( rule__AgentInstance__Group__0 ) )
            // InternalReactionRules.g:268:3: ( rule__AgentInstance__Group__0 )
            {
             before(grammarAccess.getAgentInstanceAccess().getGroup()); 
            // InternalReactionRules.g:269:3: ( rule__AgentInstance__Group__0 )
            // InternalReactionRules.g:269:4: rule__AgentInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAgentInstance"


    // $ANTLR start "entryRuleReactionProperty"
    // InternalReactionRules.g:278:1: entryRuleReactionProperty : ruleReactionProperty EOF ;
    public final void entryRuleReactionProperty() throws RecognitionException {
        try {
            // InternalReactionRules.g:279:1: ( ruleReactionProperty EOF )
            // InternalReactionRules.g:280:1: ruleReactionProperty EOF
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
    // InternalReactionRules.g:287:1: ruleReactionProperty : ( ( rule__ReactionProperty__Alternatives ) ) ;
    public final void ruleReactionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:291:2: ( ( ( rule__ReactionProperty__Alternatives ) ) )
            // InternalReactionRules.g:292:2: ( ( rule__ReactionProperty__Alternatives ) )
            {
            // InternalReactionRules.g:292:2: ( ( rule__ReactionProperty__Alternatives ) )
            // InternalReactionRules.g:293:3: ( rule__ReactionProperty__Alternatives )
            {
             before(grammarAccess.getReactionPropertyAccess().getAlternatives()); 
            // InternalReactionRules.g:294:3: ( rule__ReactionProperty__Alternatives )
            // InternalReactionRules.g:294:4: rule__ReactionProperty__Alternatives
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
    // InternalReactionRules.g:303:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:307:1: ( ruleFloat EOF )
            // InternalReactionRules.g:308:1: ruleFloat EOF
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
    // InternalReactionRules.g:318:1: ruleFloat : ( ( rule__Float__Group__0 ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:323:2: ( ( ( rule__Float__Group__0 ) ) )
            // InternalReactionRules.g:324:2: ( ( rule__Float__Group__0 ) )
            {
            // InternalReactionRules.g:324:2: ( ( rule__Float__Group__0 ) )
            // InternalReactionRules.g:325:3: ( rule__Float__Group__0 )
            {
             before(grammarAccess.getFloatAccess().getGroup()); 
            // InternalReactionRules.g:326:3: ( rule__Float__Group__0 )
            // InternalReactionRules.g:326:4: rule__Float__Group__0
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
    // InternalReactionRules.g:336:1: entryRuleScientificFloat : ruleScientificFloat EOF ;
    public final void entryRuleScientificFloat() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:340:1: ( ruleScientificFloat EOF )
            // InternalReactionRules.g:341:1: ruleScientificFloat EOF
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
    // InternalReactionRules.g:351:1: ruleScientificFloat : ( ( rule__ScientificFloat__Group__0 ) ) ;
    public final void ruleScientificFloat() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:356:2: ( ( ( rule__ScientificFloat__Group__0 ) ) )
            // InternalReactionRules.g:357:2: ( ( rule__ScientificFloat__Group__0 ) )
            {
            // InternalReactionRules.g:357:2: ( ( rule__ScientificFloat__Group__0 ) )
            // InternalReactionRules.g:358:3: ( rule__ScientificFloat__Group__0 )
            {
             before(grammarAccess.getScientificFloatAccess().getGroup()); 
            // InternalReactionRules.g:359:3: ( rule__ScientificFloat__Group__0 )
            // InternalReactionRules.g:359:4: rule__ScientificFloat__Group__0
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
    // InternalReactionRules.g:369:1: entryRuleUnsignedInteger : ruleUnsignedInteger EOF ;
    public final void entryRuleUnsignedInteger() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:373:1: ( ruleUnsignedInteger EOF )
            // InternalReactionRules.g:374:1: ruleUnsignedInteger EOF
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
    // InternalReactionRules.g:384:1: ruleUnsignedInteger : ( RULE_INT ) ;
    public final void ruleUnsignedInteger() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:389:2: ( ( RULE_INT ) )
            // InternalReactionRules.g:390:2: ( RULE_INT )
            {
            // InternalReactionRules.g:390:2: ( RULE_INT )
            // InternalReactionRules.g:391:3: RULE_INT
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
    // InternalReactionRules.g:402:1: entryRuleSignedInteger : ruleSignedInteger EOF ;
    public final void entryRuleSignedInteger() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:406:1: ( ruleSignedInteger EOF )
            // InternalReactionRules.g:407:1: ruleSignedInteger EOF
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
    // InternalReactionRules.g:417:1: ruleSignedInteger : ( ( rule__SignedInteger__Group__0 ) ) ;
    public final void ruleSignedInteger() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:422:2: ( ( ( rule__SignedInteger__Group__0 ) ) )
            // InternalReactionRules.g:423:2: ( ( rule__SignedInteger__Group__0 ) )
            {
            // InternalReactionRules.g:423:2: ( ( rule__SignedInteger__Group__0 ) )
            // InternalReactionRules.g:424:3: ( rule__SignedInteger__Group__0 )
            {
             before(grammarAccess.getSignedIntegerAccess().getGroup()); 
            // InternalReactionRules.g:425:3: ( rule__SignedInteger__Group__0 )
            // InternalReactionRules.g:425:4: rule__SignedInteger__Group__0
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
    // InternalReactionRules.g:435:1: entryRuleArithmeticType : ruleArithmeticType EOF ;
    public final void entryRuleArithmeticType() throws RecognitionException {
        try {
            // InternalReactionRules.g:436:1: ( ruleArithmeticType EOF )
            // InternalReactionRules.g:437:1: ruleArithmeticType EOF
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
    // InternalReactionRules.g:444:1: ruleArithmeticType : ( ( rule__ArithmeticType__Alternatives ) ) ;
    public final void ruleArithmeticType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:448:2: ( ( ( rule__ArithmeticType__Alternatives ) ) )
            // InternalReactionRules.g:449:2: ( ( rule__ArithmeticType__Alternatives ) )
            {
            // InternalReactionRules.g:449:2: ( ( rule__ArithmeticType__Alternatives ) )
            // InternalReactionRules.g:450:3: ( rule__ArithmeticType__Alternatives )
            {
             before(grammarAccess.getArithmeticTypeAccess().getAlternatives()); 
            // InternalReactionRules.g:451:3: ( rule__ArithmeticType__Alternatives )
            // InternalReactionRules.g:451:4: rule__ArithmeticType__Alternatives
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
    // InternalReactionRules.g:460:1: entryRuleArithmeticValue : ruleArithmeticValue EOF ;
    public final void entryRuleArithmeticValue() throws RecognitionException {
        try {
            // InternalReactionRules.g:461:1: ( ruleArithmeticValue EOF )
            // InternalReactionRules.g:462:1: ruleArithmeticValue EOF
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
    // InternalReactionRules.g:469:1: ruleArithmeticValue : ( ( rule__ArithmeticValue__ValueAssignment ) ) ;
    public final void ruleArithmeticValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:473:2: ( ( ( rule__ArithmeticValue__ValueAssignment ) ) )
            // InternalReactionRules.g:474:2: ( ( rule__ArithmeticValue__ValueAssignment ) )
            {
            // InternalReactionRules.g:474:2: ( ( rule__ArithmeticValue__ValueAssignment ) )
            // InternalReactionRules.g:475:3: ( rule__ArithmeticValue__ValueAssignment )
            {
             before(grammarAccess.getArithmeticValueAccess().getValueAssignment()); 
            // InternalReactionRules.g:476:3: ( rule__ArithmeticValue__ValueAssignment )
            // InternalReactionRules.g:476:4: rule__ArithmeticValue__ValueAssignment
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
    // InternalReactionRules.g:485:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalReactionRules.g:486:1: ( ruleState EOF )
            // InternalReactionRules.g:487:1: ruleState EOF
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
    // InternalReactionRules.g:494:1: ruleState : ( ( rule__State__NameAssignment ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:498:2: ( ( ( rule__State__NameAssignment ) ) )
            // InternalReactionRules.g:499:2: ( ( rule__State__NameAssignment ) )
            {
            // InternalReactionRules.g:499:2: ( ( rule__State__NameAssignment ) )
            // InternalReactionRules.g:500:3: ( rule__State__NameAssignment )
            {
             before(grammarAccess.getStateAccess().getNameAssignment()); 
            // InternalReactionRules.g:501:3: ( rule__State__NameAssignment )
            // InternalReactionRules.g:501:4: rule__State__NameAssignment
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
    // InternalReactionRules.g:510:1: entryRuleStates : ruleStates EOF ;
    public final void entryRuleStates() throws RecognitionException {
        try {
            // InternalReactionRules.g:511:1: ( ruleStates EOF )
            // InternalReactionRules.g:512:1: ruleStates EOF
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
    // InternalReactionRules.g:519:1: ruleStates : ( ( rule__States__Group__0 ) ) ;
    public final void ruleStates() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:523:2: ( ( ( rule__States__Group__0 ) ) )
            // InternalReactionRules.g:524:2: ( ( rule__States__Group__0 ) )
            {
            // InternalReactionRules.g:524:2: ( ( rule__States__Group__0 ) )
            // InternalReactionRules.g:525:3: ( rule__States__Group__0 )
            {
             before(grammarAccess.getStatesAccess().getGroup()); 
            // InternalReactionRules.g:526:3: ( rule__States__Group__0 )
            // InternalReactionRules.g:526:4: rule__States__Group__0
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
    // InternalReactionRules.g:535:1: entryRuleSite : ruleSite EOF ;
    public final void entryRuleSite() throws RecognitionException {
        try {
            // InternalReactionRules.g:536:1: ( ruleSite EOF )
            // InternalReactionRules.g:537:1: ruleSite EOF
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
    // InternalReactionRules.g:544:1: ruleSite : ( ( rule__Site__Group__0 ) ) ;
    public final void ruleSite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:548:2: ( ( ( rule__Site__Group__0 ) ) )
            // InternalReactionRules.g:549:2: ( ( rule__Site__Group__0 ) )
            {
            // InternalReactionRules.g:549:2: ( ( rule__Site__Group__0 ) )
            // InternalReactionRules.g:550:3: ( rule__Site__Group__0 )
            {
             before(grammarAccess.getSiteAccess().getGroup()); 
            // InternalReactionRules.g:551:3: ( rule__Site__Group__0 )
            // InternalReactionRules.g:551:4: rule__Site__Group__0
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
    // InternalReactionRules.g:560:1: entryRuleSites : ruleSites EOF ;
    public final void entryRuleSites() throws RecognitionException {
        try {
            // InternalReactionRules.g:561:1: ( ruleSites EOF )
            // InternalReactionRules.g:562:1: ruleSites EOF
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
    // InternalReactionRules.g:569:1: ruleSites : ( ( rule__Sites__Group__0 ) ) ;
    public final void ruleSites() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:573:2: ( ( ( rule__Sites__Group__0 ) ) )
            // InternalReactionRules.g:574:2: ( ( rule__Sites__Group__0 ) )
            {
            // InternalReactionRules.g:574:2: ( ( rule__Sites__Group__0 ) )
            // InternalReactionRules.g:575:3: ( rule__Sites__Group__0 )
            {
             before(grammarAccess.getSitesAccess().getGroup()); 
            // InternalReactionRules.g:576:3: ( rule__Sites__Group__0 )
            // InternalReactionRules.g:576:4: rule__Sites__Group__0
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
    // InternalReactionRules.g:585:1: entryRuleAgent : ruleAgent EOF ;
    public final void entryRuleAgent() throws RecognitionException {
        try {
            // InternalReactionRules.g:586:1: ( ruleAgent EOF )
            // InternalReactionRules.g:587:1: ruleAgent EOF
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
    // InternalReactionRules.g:594:1: ruleAgent : ( ( rule__Agent__Group__0 ) ) ;
    public final void ruleAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:598:2: ( ( ( rule__Agent__Group__0 ) ) )
            // InternalReactionRules.g:599:2: ( ( rule__Agent__Group__0 ) )
            {
            // InternalReactionRules.g:599:2: ( ( rule__Agent__Group__0 ) )
            // InternalReactionRules.g:600:3: ( rule__Agent__Group__0 )
            {
             before(grammarAccess.getAgentAccess().getGroup()); 
            // InternalReactionRules.g:601:3: ( rule__Agent__Group__0 )
            // InternalReactionRules.g:601:4: rule__Agent__Group__0
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
    // InternalReactionRules.g:610:1: entryRulePatternVariable : rulePatternVariable EOF ;
    public final void entryRulePatternVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:611:1: ( rulePatternVariable EOF )
            // InternalReactionRules.g:612:1: rulePatternVariable EOF
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
    // InternalReactionRules.g:619:1: rulePatternVariable : ( ( rule__PatternVariable__Group__0 ) ) ;
    public final void rulePatternVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:623:2: ( ( ( rule__PatternVariable__Group__0 ) ) )
            // InternalReactionRules.g:624:2: ( ( rule__PatternVariable__Group__0 ) )
            {
            // InternalReactionRules.g:624:2: ( ( rule__PatternVariable__Group__0 ) )
            // InternalReactionRules.g:625:3: ( rule__PatternVariable__Group__0 )
            {
             before(grammarAccess.getPatternVariableAccess().getGroup()); 
            // InternalReactionRules.g:626:3: ( rule__PatternVariable__Group__0 )
            // InternalReactionRules.g:626:4: rule__PatternVariable__Group__0
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
    // InternalReactionRules.g:635:1: entryRuleArithmeticVariable : ruleArithmeticVariable EOF ;
    public final void entryRuleArithmeticVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:636:1: ( ruleArithmeticVariable EOF )
            // InternalReactionRules.g:637:1: ruleArithmeticVariable EOF
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
    // InternalReactionRules.g:644:1: ruleArithmeticVariable : ( ( rule__ArithmeticVariable__Group__0 ) ) ;
    public final void ruleArithmeticVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:648:2: ( ( ( rule__ArithmeticVariable__Group__0 ) ) )
            // InternalReactionRules.g:649:2: ( ( rule__ArithmeticVariable__Group__0 ) )
            {
            // InternalReactionRules.g:649:2: ( ( rule__ArithmeticVariable__Group__0 ) )
            // InternalReactionRules.g:650:3: ( rule__ArithmeticVariable__Group__0 )
            {
             before(grammarAccess.getArithmeticVariableAccess().getGroup()); 
            // InternalReactionRules.g:651:3: ( rule__ArithmeticVariable__Group__0 )
            // InternalReactionRules.g:651:4: rule__ArithmeticVariable__Group__0
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
    // InternalReactionRules.g:660:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:661:1: ( ruleVariable EOF )
            // InternalReactionRules.g:662:1: ruleVariable EOF
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
    // InternalReactionRules.g:669:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:673:2: ( ( ( rule__Variable__Alternatives ) ) )
            // InternalReactionRules.g:674:2: ( ( rule__Variable__Alternatives ) )
            {
            // InternalReactionRules.g:674:2: ( ( rule__Variable__Alternatives ) )
            // InternalReactionRules.g:675:3: ( rule__Variable__Alternatives )
            {
             before(grammarAccess.getVariableAccess().getAlternatives()); 
            // InternalReactionRules.g:676:3: ( rule__Variable__Alternatives )
            // InternalReactionRules.g:676:4: rule__Variable__Alternatives
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


    // $ANTLR start "entryRuleSemiLink"
    // InternalReactionRules.g:685:1: entryRuleSemiLink : ruleSemiLink EOF ;
    public final void entryRuleSemiLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:686:1: ( ruleSemiLink EOF )
            // InternalReactionRules.g:687:1: ruleSemiLink EOF
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
    // InternalReactionRules.g:694:1: ruleSemiLink : ( ( rule__SemiLink__Group__0 ) ) ;
    public final void ruleSemiLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:698:2: ( ( ( rule__SemiLink__Group__0 ) ) )
            // InternalReactionRules.g:699:2: ( ( rule__SemiLink__Group__0 ) )
            {
            // InternalReactionRules.g:699:2: ( ( rule__SemiLink__Group__0 ) )
            // InternalReactionRules.g:700:3: ( rule__SemiLink__Group__0 )
            {
             before(grammarAccess.getSemiLinkAccess().getGroup()); 
            // InternalReactionRules.g:701:3: ( rule__SemiLink__Group__0 )
            // InternalReactionRules.g:701:4: rule__SemiLink__Group__0
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
    // InternalReactionRules.g:710:1: entryRuleFreeLink : ruleFreeLink EOF ;
    public final void entryRuleFreeLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:711:1: ( ruleFreeLink EOF )
            // InternalReactionRules.g:712:1: ruleFreeLink EOF
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
    // InternalReactionRules.g:719:1: ruleFreeLink : ( ( rule__FreeLink__Group__0 ) ) ;
    public final void ruleFreeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:723:2: ( ( ( rule__FreeLink__Group__0 ) ) )
            // InternalReactionRules.g:724:2: ( ( rule__FreeLink__Group__0 ) )
            {
            // InternalReactionRules.g:724:2: ( ( rule__FreeLink__Group__0 ) )
            // InternalReactionRules.g:725:3: ( rule__FreeLink__Group__0 )
            {
             before(grammarAccess.getFreeLinkAccess().getGroup()); 
            // InternalReactionRules.g:726:3: ( rule__FreeLink__Group__0 )
            // InternalReactionRules.g:726:4: rule__FreeLink__Group__0
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
    // InternalReactionRules.g:735:1: entryRuleWhatEver : ruleWhatEver EOF ;
    public final void entryRuleWhatEver() throws RecognitionException {
        try {
            // InternalReactionRules.g:736:1: ( ruleWhatEver EOF )
            // InternalReactionRules.g:737:1: ruleWhatEver EOF
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
    // InternalReactionRules.g:744:1: ruleWhatEver : ( ( rule__WhatEver__Group__0 ) ) ;
    public final void ruleWhatEver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:748:2: ( ( ( rule__WhatEver__Group__0 ) ) )
            // InternalReactionRules.g:749:2: ( ( rule__WhatEver__Group__0 ) )
            {
            // InternalReactionRules.g:749:2: ( ( rule__WhatEver__Group__0 ) )
            // InternalReactionRules.g:750:3: ( rule__WhatEver__Group__0 )
            {
             before(grammarAccess.getWhatEverAccess().getGroup()); 
            // InternalReactionRules.g:751:3: ( rule__WhatEver__Group__0 )
            // InternalReactionRules.g:751:4: rule__WhatEver__Group__0
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


    // $ANTLR start "entryRuleIndexedLink"
    // InternalReactionRules.g:760:1: entryRuleIndexedLink : ruleIndexedLink EOF ;
    public final void entryRuleIndexedLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:761:1: ( ruleIndexedLink EOF )
            // InternalReactionRules.g:762:1: ruleIndexedLink EOF
            {
             before(grammarAccess.getIndexedLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleIndexedLink();

            state._fsp--;

             after(grammarAccess.getIndexedLinkRule()); 
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
    // $ANTLR end "entryRuleIndexedLink"


    // $ANTLR start "ruleIndexedLink"
    // InternalReactionRules.g:769:1: ruleIndexedLink : ( ( rule__IndexedLink__Group__0 ) ) ;
    public final void ruleIndexedLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:773:2: ( ( ( rule__IndexedLink__Group__0 ) ) )
            // InternalReactionRules.g:774:2: ( ( rule__IndexedLink__Group__0 ) )
            {
            // InternalReactionRules.g:774:2: ( ( rule__IndexedLink__Group__0 ) )
            // InternalReactionRules.g:775:3: ( rule__IndexedLink__Group__0 )
            {
             before(grammarAccess.getIndexedLinkAccess().getGroup()); 
            // InternalReactionRules.g:776:3: ( rule__IndexedLink__Group__0 )
            // InternalReactionRules.g:776:4: rule__IndexedLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IndexedLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndexedLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIndexedLink"


    // $ANTLR start "entryRuleExactLinkAgent"
    // InternalReactionRules.g:785:1: entryRuleExactLinkAgent : ruleExactLinkAgent EOF ;
    public final void entryRuleExactLinkAgent() throws RecognitionException {
        try {
            // InternalReactionRules.g:786:1: ( ruleExactLinkAgent EOF )
            // InternalReactionRules.g:787:1: ruleExactLinkAgent EOF
            {
             before(grammarAccess.getExactLinkAgentRule()); 
            pushFollow(FOLLOW_1);
            ruleExactLinkAgent();

            state._fsp--;

             after(grammarAccess.getExactLinkAgentRule()); 
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
    // $ANTLR end "entryRuleExactLinkAgent"


    // $ANTLR start "ruleExactLinkAgent"
    // InternalReactionRules.g:794:1: ruleExactLinkAgent : ( ( rule__ExactLinkAgent__Group__0 ) ) ;
    public final void ruleExactLinkAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:798:2: ( ( ( rule__ExactLinkAgent__Group__0 ) ) )
            // InternalReactionRules.g:799:2: ( ( rule__ExactLinkAgent__Group__0 ) )
            {
            // InternalReactionRules.g:799:2: ( ( rule__ExactLinkAgent__Group__0 ) )
            // InternalReactionRules.g:800:3: ( rule__ExactLinkAgent__Group__0 )
            {
             before(grammarAccess.getExactLinkAgentAccess().getGroup()); 
            // InternalReactionRules.g:801:3: ( rule__ExactLinkAgent__Group__0 )
            // InternalReactionRules.g:801:4: rule__ExactLinkAgent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExactLinkAgent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExactLinkAgentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExactLinkAgent"


    // $ANTLR start "entryRuleExactLinkSite"
    // InternalReactionRules.g:810:1: entryRuleExactLinkSite : ruleExactLinkSite EOF ;
    public final void entryRuleExactLinkSite() throws RecognitionException {
        try {
            // InternalReactionRules.g:811:1: ( ruleExactLinkSite EOF )
            // InternalReactionRules.g:812:1: ruleExactLinkSite EOF
            {
             before(grammarAccess.getExactLinkSiteRule()); 
            pushFollow(FOLLOW_1);
            ruleExactLinkSite();

            state._fsp--;

             after(grammarAccess.getExactLinkSiteRule()); 
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
    // $ANTLR end "entryRuleExactLinkSite"


    // $ANTLR start "ruleExactLinkSite"
    // InternalReactionRules.g:819:1: ruleExactLinkSite : ( ( rule__ExactLinkSite__Group__0 ) ) ;
    public final void ruleExactLinkSite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:823:2: ( ( ( rule__ExactLinkSite__Group__0 ) ) )
            // InternalReactionRules.g:824:2: ( ( rule__ExactLinkSite__Group__0 ) )
            {
            // InternalReactionRules.g:824:2: ( ( rule__ExactLinkSite__Group__0 ) )
            // InternalReactionRules.g:825:3: ( rule__ExactLinkSite__Group__0 )
            {
             before(grammarAccess.getExactLinkSiteAccess().getGroup()); 
            // InternalReactionRules.g:826:3: ( rule__ExactLinkSite__Group__0 )
            // InternalReactionRules.g:826:4: rule__ExactLinkSite__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExactLinkSite__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExactLinkSiteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExactLinkSite"


    // $ANTLR start "entryRuleExactLink"
    // InternalReactionRules.g:835:1: entryRuleExactLink : ruleExactLink EOF ;
    public final void entryRuleExactLink() throws RecognitionException {
        try {
            // InternalReactionRules.g:836:1: ( ruleExactLink EOF )
            // InternalReactionRules.g:837:1: ruleExactLink EOF
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
    // InternalReactionRules.g:844:1: ruleExactLink : ( ( rule__ExactLink__Group__0 ) ) ;
    public final void ruleExactLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:848:2: ( ( ( rule__ExactLink__Group__0 ) ) )
            // InternalReactionRules.g:849:2: ( ( rule__ExactLink__Group__0 ) )
            {
            // InternalReactionRules.g:849:2: ( ( rule__ExactLink__Group__0 ) )
            // InternalReactionRules.g:850:3: ( rule__ExactLink__Group__0 )
            {
             before(grammarAccess.getExactLinkAccess().getGroup()); 
            // InternalReactionRules.g:851:3: ( rule__ExactLink__Group__0 )
            // InternalReactionRules.g:851:4: rule__ExactLink__Group__0
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


    // $ANTLR start "entryRuleSiteState"
    // InternalReactionRules.g:860:1: entryRuleSiteState : ruleSiteState EOF ;
    public final void entryRuleSiteState() throws RecognitionException {
        try {
            // InternalReactionRules.g:861:1: ( ruleSiteState EOF )
            // InternalReactionRules.g:862:1: ruleSiteState EOF
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
    // InternalReactionRules.g:869:1: ruleSiteState : ( ( rule__SiteState__Group__0 ) ) ;
    public final void ruleSiteState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:873:2: ( ( ( rule__SiteState__Group__0 ) ) )
            // InternalReactionRules.g:874:2: ( ( rule__SiteState__Group__0 ) )
            {
            // InternalReactionRules.g:874:2: ( ( rule__SiteState__Group__0 ) )
            // InternalReactionRules.g:875:3: ( rule__SiteState__Group__0 )
            {
             before(grammarAccess.getSiteStateAccess().getGroup()); 
            // InternalReactionRules.g:876:3: ( rule__SiteState__Group__0 )
            // InternalReactionRules.g:876:4: rule__SiteState__Group__0
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
    // InternalReactionRules.g:885:1: entryRuleLinkState : ruleLinkState EOF ;
    public final void entryRuleLinkState() throws RecognitionException {
        try {
            // InternalReactionRules.g:886:1: ( ruleLinkState EOF )
            // InternalReactionRules.g:887:1: ruleLinkState EOF
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
    // InternalReactionRules.g:894:1: ruleLinkState : ( ( rule__LinkState__Group__0 ) ) ;
    public final void ruleLinkState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:898:2: ( ( ( rule__LinkState__Group__0 ) ) )
            // InternalReactionRules.g:899:2: ( ( rule__LinkState__Group__0 ) )
            {
            // InternalReactionRules.g:899:2: ( ( rule__LinkState__Group__0 ) )
            // InternalReactionRules.g:900:3: ( rule__LinkState__Group__0 )
            {
             before(grammarAccess.getLinkStateAccess().getGroup()); 
            // InternalReactionRules.g:901:3: ( rule__LinkState__Group__0 )
            // InternalReactionRules.g:901:4: rule__LinkState__Group__0
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
    // InternalReactionRules.g:919:1: ruleSitePattern : ( ( rule__SitePattern__Group__0 ) ) ;
    public final void ruleSitePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:923:2: ( ( ( rule__SitePattern__Group__0 ) ) )
            // InternalReactionRules.g:924:2: ( ( rule__SitePattern__Group__0 ) )
            {
            // InternalReactionRules.g:924:2: ( ( rule__SitePattern__Group__0 ) )
            // InternalReactionRules.g:925:3: ( rule__SitePattern__Group__0 )
            {
             before(grammarAccess.getSitePatternAccess().getGroup()); 
            // InternalReactionRules.g:926:3: ( rule__SitePattern__Group__0 )
            // InternalReactionRules.g:926:4: rule__SitePattern__Group__0
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


    // $ANTLR start "rule__ModelLocation__Alternatives"
    // InternalReactionRules.g:1384:1: rule__ModelLocation__Alternatives : ( ( ruleModelUri ) | ( ruleModelPath ) );
    public final void rule__ModelLocation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1388:1: ( ( ruleModelUri ) | ( ruleModelPath ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalReactionRules.g:1389:2: ( ruleModelUri )
                    {
                    // InternalReactionRules.g:1389:2: ( ruleModelUri )
                    // InternalReactionRules.g:1390:3: ruleModelUri
                    {
                     before(grammarAccess.getModelLocationAccess().getModelUriParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleModelUri();

                    state._fsp--;

                     after(grammarAccess.getModelLocationAccess().getModelUriParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1395:2: ( ruleModelPath )
                    {
                    // InternalReactionRules.g:1395:2: ( ruleModelPath )
                    // InternalReactionRules.g:1396:3: ruleModelPath
                    {
                     before(grammarAccess.getModelLocationAccess().getModelPathParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleModelPath();

                    state._fsp--;

                     after(grammarAccess.getModelLocationAccess().getModelPathParserRuleCall_1()); 

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
    // $ANTLR end "rule__ModelLocation__Alternatives"


    // $ANTLR start "rule__ReactionProperty__Alternatives"
    // InternalReactionRules.g:1405:1: rule__ReactionProperty__Alternatives : ( ( ruleAgent ) | ( ruleVariable ) | ( ruleObservation ) | ( ruleInitial ) | ( ruleRule ) );
    public final void rule__ReactionProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1409:1: ( ( ruleAgent ) | ( ruleVariable ) | ( ruleObservation ) | ( ruleInitial ) | ( ruleRule ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            case 37:
                {
                alt2=4;
                }
                break;
            case 38:
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
                    // InternalReactionRules.g:1410:2: ( ruleAgent )
                    {
                    // InternalReactionRules.g:1410:2: ( ruleAgent )
                    // InternalReactionRules.g:1411:3: ruleAgent
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
                    // InternalReactionRules.g:1416:2: ( ruleVariable )
                    {
                    // InternalReactionRules.g:1416:2: ( ruleVariable )
                    // InternalReactionRules.g:1417:3: ruleVariable
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
                    // InternalReactionRules.g:1422:2: ( ruleObservation )
                    {
                    // InternalReactionRules.g:1422:2: ( ruleObservation )
                    // InternalReactionRules.g:1423:3: ruleObservation
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
                    // InternalReactionRules.g:1428:2: ( ruleInitial )
                    {
                    // InternalReactionRules.g:1428:2: ( ruleInitial )
                    // InternalReactionRules.g:1429:3: ruleInitial
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
                    // InternalReactionRules.g:1434:2: ( ruleRule )
                    {
                    // InternalReactionRules.g:1434:2: ( ruleRule )
                    // InternalReactionRules.g:1435:3: ruleRule
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


    // $ANTLR start "rule__ScientificFloat__Alternatives_5"
    // InternalReactionRules.g:1444:1: rule__ScientificFloat__Alternatives_5 : ( ( '-' ) | ( '+' ) );
    public final void rule__ScientificFloat__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1448:1: ( ( '-' ) | ( '+' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalReactionRules.g:1449:2: ( '-' )
                    {
                    // InternalReactionRules.g:1449:2: ( '-' )
                    // InternalReactionRules.g:1450:3: '-'
                    {
                     before(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_5_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1455:2: ( '+' )
                    {
                    // InternalReactionRules.g:1455:2: ( '+' )
                    // InternalReactionRules.g:1456:3: '+'
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
    // InternalReactionRules.g:1465:1: rule__ArithmeticType__Alternatives : ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) );
    public final void rule__ArithmeticType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1469:1: ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalReactionRules.g:1470:2: ( ruleFloat )
                    {
                    // InternalReactionRules.g:1470:2: ( ruleFloat )
                    // InternalReactionRules.g:1471:3: ruleFloat
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
                    // InternalReactionRules.g:1476:2: ( ruleUnsignedInteger )
                    {
                    // InternalReactionRules.g:1476:2: ( ruleUnsignedInteger )
                    // InternalReactionRules.g:1477:3: ruleUnsignedInteger
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
                    // InternalReactionRules.g:1482:2: ( ruleSignedInteger )
                    {
                    // InternalReactionRules.g:1482:2: ( ruleSignedInteger )
                    // InternalReactionRules.g:1483:3: ruleSignedInteger
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
                    // InternalReactionRules.g:1488:2: ( ruleScientificFloat )
                    {
                    // InternalReactionRules.g:1488:2: ( ruleScientificFloat )
                    // InternalReactionRules.g:1489:3: ruleScientificFloat
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
    // InternalReactionRules.g:1498:1: rule__Variable__Alternatives : ( ( rulePatternVariable ) | ( ruleArithmeticVariable ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1502:1: ( ( rulePatternVariable ) | ( ruleArithmeticVariable ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==33) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==RULE_INT||LA5_3==19) ) {
                            alt5=2;
                        }
                        else if ( (LA5_3==26) ) {
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
                    // InternalReactionRules.g:1503:2: ( rulePatternVariable )
                    {
                    // InternalReactionRules.g:1503:2: ( rulePatternVariable )
                    // InternalReactionRules.g:1504:3: rulePatternVariable
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
                    // InternalReactionRules.g:1509:2: ( ruleArithmeticVariable )
                    {
                    // InternalReactionRules.g:1509:2: ( ruleArithmeticVariable )
                    // InternalReactionRules.g:1510:3: ruleArithmeticVariable
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


    // $ANTLR start "rule__LinkState__LinkStateAlternatives_1_0"
    // InternalReactionRules.g:1519:1: rule__LinkState__LinkStateAlternatives_1_0 : ( ( ruleSemiLink ) | ( ruleFreeLink ) | ( ruleExactLink ) | ( ruleIndexedLink ) | ( ruleWhatEver ) );
    public final void rule__LinkState__LinkStateAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1523:1: ( ( ruleSemiLink ) | ( ruleFreeLink ) | ( ruleExactLink ) | ( ruleIndexedLink ) | ( ruleWhatEver ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_SEMI_LINK:
                {
                alt6=1;
                }
                break;
            case RULE_FREE_LINK:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            case RULE_INT:
                {
                alt6=4;
                }
                break;
            case RULE_WHATEVER_LINK:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalReactionRules.g:1524:2: ( ruleSemiLink )
                    {
                    // InternalReactionRules.g:1524:2: ( ruleSemiLink )
                    // InternalReactionRules.g:1525:3: ruleSemiLink
                    {
                     before(grammarAccess.getLinkStateAccess().getLinkStateSemiLinkParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSemiLink();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getLinkStateSemiLinkParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1530:2: ( ruleFreeLink )
                    {
                    // InternalReactionRules.g:1530:2: ( ruleFreeLink )
                    // InternalReactionRules.g:1531:3: ruleFreeLink
                    {
                     before(grammarAccess.getLinkStateAccess().getLinkStateFreeLinkParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFreeLink();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getLinkStateFreeLinkParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReactionRules.g:1536:2: ( ruleExactLink )
                    {
                    // InternalReactionRules.g:1536:2: ( ruleExactLink )
                    // InternalReactionRules.g:1537:3: ruleExactLink
                    {
                     before(grammarAccess.getLinkStateAccess().getLinkStateExactLinkParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExactLink();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getLinkStateExactLinkParserRuleCall_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalReactionRules.g:1542:2: ( ruleIndexedLink )
                    {
                    // InternalReactionRules.g:1542:2: ( ruleIndexedLink )
                    // InternalReactionRules.g:1543:3: ruleIndexedLink
                    {
                     before(grammarAccess.getLinkStateAccess().getLinkStateIndexedLinkParserRuleCall_1_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleIndexedLink();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getLinkStateIndexedLinkParserRuleCall_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalReactionRules.g:1548:2: ( ruleWhatEver )
                    {
                    // InternalReactionRules.g:1548:2: ( ruleWhatEver )
                    // InternalReactionRules.g:1549:3: ruleWhatEver
                    {
                     before(grammarAccess.getLinkStateAccess().getLinkStateWhatEverParserRuleCall_1_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleWhatEver();

                    state._fsp--;

                     after(grammarAccess.getLinkStateAccess().getLinkStateWhatEverParserRuleCall_1_0_4()); 

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
    // $ANTLR end "rule__LinkState__LinkStateAlternatives_1_0"


    // $ANTLR start "rule__AgentPattern__Alternatives"
    // InternalReactionRules.g:1558:1: rule__AgentPattern__Alternatives : ( ( ruleValidAgentPattern ) | ( ruleVoidAgentPattern ) );
    public final void rule__AgentPattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1562:1: ( ( ruleValidAgentPattern ) | ( ruleVoidAgentPattern ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_VOID_PATTERN) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalReactionRules.g:1563:2: ( ruleValidAgentPattern )
                    {
                    // InternalReactionRules.g:1563:2: ( ruleValidAgentPattern )
                    // InternalReactionRules.g:1564:3: ruleValidAgentPattern
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
                    // InternalReactionRules.g:1569:2: ( ruleVoidAgentPattern )
                    {
                    // InternalReactionRules.g:1569:2: ( ruleVoidAgentPattern )
                    // InternalReactionRules.g:1570:3: ruleVoidAgentPattern
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
    // InternalReactionRules.g:1579:1: rule__NumericAssignment__Alternatives : ( ( ruleNumericFromLiteral ) | ( ruleNumericFromVariable ) );
    public final void rule__NumericAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1583:1: ( ( ruleNumericFromLiteral ) | ( ruleNumericFromVariable ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||LA8_0==19) ) {
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
                    // InternalReactionRules.g:1584:2: ( ruleNumericFromLiteral )
                    {
                    // InternalReactionRules.g:1584:2: ( ruleNumericFromLiteral )
                    // InternalReactionRules.g:1585:3: ruleNumericFromLiteral
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
                    // InternalReactionRules.g:1590:2: ( ruleNumericFromVariable )
                    {
                    // InternalReactionRules.g:1590:2: ( ruleNumericFromVariable )
                    // InternalReactionRules.g:1591:3: ruleNumericFromVariable
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
    // InternalReactionRules.g:1600:1: rule__PatternAssignment__Alternatives : ( ( ruleAssignFromPattern ) | ( ruleAssignFromVariable ) );
    public final void rule__PatternAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1604:1: ( ( ruleAssignFromPattern ) | ( ruleAssignFromVariable ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalReactionRules.g:1605:2: ( ruleAssignFromPattern )
                    {
                    // InternalReactionRules.g:1605:2: ( ruleAssignFromPattern )
                    // InternalReactionRules.g:1606:3: ruleAssignFromPattern
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
                    // InternalReactionRules.g:1611:2: ( ruleAssignFromVariable )
                    {
                    // InternalReactionRules.g:1611:2: ( ruleAssignFromVariable )
                    // InternalReactionRules.g:1612:3: ruleAssignFromVariable
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
    // InternalReactionRules.g:1621:1: rule__RuleBody__Alternatives : ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) );
    public final void rule__RuleBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1625:1: ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalReactionRules.g:1626:2: ( ruleUnidirectionalRule )
                    {
                    // InternalReactionRules.g:1626:2: ( ruleUnidirectionalRule )
                    // InternalReactionRules.g:1627:3: ruleUnidirectionalRule
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
                    // InternalReactionRules.g:1632:2: ( ruleBidirectionalRule )
                    {
                    // InternalReactionRules.g:1632:2: ( ruleBidirectionalRule )
                    // InternalReactionRules.g:1633:3: ruleBidirectionalRule
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


    // $ANTLR start "rule__ReactionRuleModel__Group__0"
    // InternalReactionRules.g:1642:1: rule__ReactionRuleModel__Group__0 : rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1 ;
    public final void rule__ReactionRuleModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1646:1: ( rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1 )
            // InternalReactionRules.g:1647:2: rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1
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
    // InternalReactionRules.g:1654:1: rule__ReactionRuleModel__Group__0__Impl : ( ( rule__ReactionRuleModel__ModelAssignment_0 ) ) ;
    public final void rule__ReactionRuleModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1658:1: ( ( ( rule__ReactionRuleModel__ModelAssignment_0 ) ) )
            // InternalReactionRules.g:1659:1: ( ( rule__ReactionRuleModel__ModelAssignment_0 ) )
            {
            // InternalReactionRules.g:1659:1: ( ( rule__ReactionRuleModel__ModelAssignment_0 ) )
            // InternalReactionRules.g:1660:2: ( rule__ReactionRuleModel__ModelAssignment_0 )
            {
             before(grammarAccess.getReactionRuleModelAccess().getModelAssignment_0()); 
            // InternalReactionRules.g:1661:2: ( rule__ReactionRuleModel__ModelAssignment_0 )
            // InternalReactionRules.g:1661:3: rule__ReactionRuleModel__ModelAssignment_0
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
    // InternalReactionRules.g:1669:1: rule__ReactionRuleModel__Group__1 : rule__ReactionRuleModel__Group__1__Impl rule__ReactionRuleModel__Group__2 ;
    public final void rule__ReactionRuleModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1673:1: ( rule__ReactionRuleModel__Group__1__Impl rule__ReactionRuleModel__Group__2 )
            // InternalReactionRules.g:1674:2: rule__ReactionRuleModel__Group__1__Impl rule__ReactionRuleModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ReactionRuleModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactionRuleModel__Group__2();

            state._fsp--;


            }

        }
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
    // InternalReactionRules.g:1681:1: rule__ReactionRuleModel__Group__1__Impl : ( ( rule__ReactionRuleModel__ReactionContainerAssignment_1 ) ) ;
    public final void rule__ReactionRuleModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1685:1: ( ( ( rule__ReactionRuleModel__ReactionContainerAssignment_1 ) ) )
            // InternalReactionRules.g:1686:1: ( ( rule__ReactionRuleModel__ReactionContainerAssignment_1 ) )
            {
            // InternalReactionRules.g:1686:1: ( ( rule__ReactionRuleModel__ReactionContainerAssignment_1 ) )
            // InternalReactionRules.g:1687:2: ( rule__ReactionRuleModel__ReactionContainerAssignment_1 )
            {
             before(grammarAccess.getReactionRuleModelAccess().getReactionContainerAssignment_1()); 
            // InternalReactionRules.g:1688:2: ( rule__ReactionRuleModel__ReactionContainerAssignment_1 )
            // InternalReactionRules.g:1688:3: rule__ReactionRuleModel__ReactionContainerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactionRuleModel__ReactionContainerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactionRuleModelAccess().getReactionContainerAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ReactionRuleModel__Group__2"
    // InternalReactionRules.g:1696:1: rule__ReactionRuleModel__Group__2 : rule__ReactionRuleModel__Group__2__Impl ;
    public final void rule__ReactionRuleModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1700:1: ( rule__ReactionRuleModel__Group__2__Impl )
            // InternalReactionRules.g:1701:2: rule__ReactionRuleModel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactionRuleModel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionRuleModel__Group__2"


    // $ANTLR start "rule__ReactionRuleModel__Group__2__Impl"
    // InternalReactionRules.g:1707:1: rule__ReactionRuleModel__Group__2__Impl : ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )* ) ;
    public final void rule__ReactionRuleModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1711:1: ( ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )* ) )
            // InternalReactionRules.g:1712:1: ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )* )
            {
            // InternalReactionRules.g:1712:1: ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )* )
            // InternalReactionRules.g:1713:2: ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )*
            {
             before(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesAssignment_2()); 
            // InternalReactionRules.g:1714:2: ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=31 && LA11_0<=32)||(LA11_0>=36 && LA11_0<=38)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalReactionRules.g:1714:3: rule__ReactionRuleModel__ReactionPropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ReactionRuleModel__ReactionPropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionRuleModel__Group__2__Impl"


    // $ANTLR start "rule__ModelUri__Group__0"
    // InternalReactionRules.g:1723:1: rule__ModelUri__Group__0 : rule__ModelUri__Group__0__Impl rule__ModelUri__Group__1 ;
    public final void rule__ModelUri__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1727:1: ( rule__ModelUri__Group__0__Impl rule__ModelUri__Group__1 )
            // InternalReactionRules.g:1728:2: rule__ModelUri__Group__0__Impl rule__ModelUri__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ModelUri__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelUri__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelUri__Group__0"


    // $ANTLR start "rule__ModelUri__Group__0__Impl"
    // InternalReactionRules.g:1735:1: rule__ModelUri__Group__0__Impl : ( 'URI' ) ;
    public final void rule__ModelUri__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1739:1: ( ( 'URI' ) )
            // InternalReactionRules.g:1740:1: ( 'URI' )
            {
            // InternalReactionRules.g:1740:1: ( 'URI' )
            // InternalReactionRules.g:1741:2: 'URI'
            {
             before(grammarAccess.getModelUriAccess().getURIKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModelUriAccess().getURIKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelUri__Group__0__Impl"


    // $ANTLR start "rule__ModelUri__Group__1"
    // InternalReactionRules.g:1750:1: rule__ModelUri__Group__1 : rule__ModelUri__Group__1__Impl ;
    public final void rule__ModelUri__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1754:1: ( rule__ModelUri__Group__1__Impl )
            // InternalReactionRules.g:1755:2: rule__ModelUri__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelUri__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelUri__Group__1"


    // $ANTLR start "rule__ModelUri__Group__1__Impl"
    // InternalReactionRules.g:1761:1: rule__ModelUri__Group__1__Impl : ( ( rule__ModelUri__UriAssignment_1 ) ) ;
    public final void rule__ModelUri__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1765:1: ( ( ( rule__ModelUri__UriAssignment_1 ) ) )
            // InternalReactionRules.g:1766:1: ( ( rule__ModelUri__UriAssignment_1 ) )
            {
            // InternalReactionRules.g:1766:1: ( ( rule__ModelUri__UriAssignment_1 ) )
            // InternalReactionRules.g:1767:2: ( rule__ModelUri__UriAssignment_1 )
            {
             before(grammarAccess.getModelUriAccess().getUriAssignment_1()); 
            // InternalReactionRules.g:1768:2: ( rule__ModelUri__UriAssignment_1 )
            // InternalReactionRules.g:1768:3: rule__ModelUri__UriAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelUri__UriAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelUriAccess().getUriAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelUri__Group__1__Impl"


    // $ANTLR start "rule__ModelPath__Group__0"
    // InternalReactionRules.g:1777:1: rule__ModelPath__Group__0 : rule__ModelPath__Group__0__Impl rule__ModelPath__Group__1 ;
    public final void rule__ModelPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1781:1: ( rule__ModelPath__Group__0__Impl rule__ModelPath__Group__1 )
            // InternalReactionRules.g:1782:2: rule__ModelPath__Group__0__Impl rule__ModelPath__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ModelPath__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelPath__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelPath__Group__0"


    // $ANTLR start "rule__ModelPath__Group__0__Impl"
    // InternalReactionRules.g:1789:1: rule__ModelPath__Group__0__Impl : ( 'PATH' ) ;
    public final void rule__ModelPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1793:1: ( ( 'PATH' ) )
            // InternalReactionRules.g:1794:1: ( 'PATH' )
            {
            // InternalReactionRules.g:1794:1: ( 'PATH' )
            // InternalReactionRules.g:1795:2: 'PATH'
            {
             before(grammarAccess.getModelPathAccess().getPATHKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModelPathAccess().getPATHKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelPath__Group__0__Impl"


    // $ANTLR start "rule__ModelPath__Group__1"
    // InternalReactionRules.g:1804:1: rule__ModelPath__Group__1 : rule__ModelPath__Group__1__Impl ;
    public final void rule__ModelPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1808:1: ( rule__ModelPath__Group__1__Impl )
            // InternalReactionRules.g:1809:2: rule__ModelPath__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelPath__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelPath__Group__1"


    // $ANTLR start "rule__ModelPath__Group__1__Impl"
    // InternalReactionRules.g:1815:1: rule__ModelPath__Group__1__Impl : ( ( rule__ModelPath__PathAssignment_1 ) ) ;
    public final void rule__ModelPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1819:1: ( ( ( rule__ModelPath__PathAssignment_1 ) ) )
            // InternalReactionRules.g:1820:1: ( ( rule__ModelPath__PathAssignment_1 ) )
            {
            // InternalReactionRules.g:1820:1: ( ( rule__ModelPath__PathAssignment_1 ) )
            // InternalReactionRules.g:1821:2: ( rule__ModelPath__PathAssignment_1 )
            {
             before(grammarAccess.getModelPathAccess().getPathAssignment_1()); 
            // InternalReactionRules.g:1822:2: ( rule__ModelPath__PathAssignment_1 )
            // InternalReactionRules.g:1822:3: rule__ModelPath__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelPath__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelPathAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelPath__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__0"
    // InternalReactionRules.g:1831:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1835:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalReactionRules.g:1836:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:1843:1: rule__Model__Group__0__Impl : ( 'ModelID' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1847:1: ( ( 'ModelID' ) )
            // InternalReactionRules.g:1848:1: ( 'ModelID' )
            {
            // InternalReactionRules.g:1848:1: ( 'ModelID' )
            // InternalReactionRules.g:1849:2: 'ModelID'
            {
             before(grammarAccess.getModelAccess().getModelIDKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalReactionRules.g:1858:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1862:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalReactionRules.g:1863:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
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
    // InternalReactionRules.g:1870:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1874:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalReactionRules.g:1875:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:1875:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalReactionRules.g:1876:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:1877:2: ( rule__Model__NameAssignment_1 )
            // InternalReactionRules.g:1877:3: rule__Model__NameAssignment_1
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


    // $ANTLR start "rule__Model__Group__2"
    // InternalReactionRules.g:1885:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1889:1: ( rule__Model__Group__2__Impl )
            // InternalReactionRules.g:1890:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalReactionRules.g:1896:1: rule__Model__Group__2__Impl : ( ( rule__Model__LocationAssignment_2 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1900:1: ( ( ( rule__Model__LocationAssignment_2 )? ) )
            // InternalReactionRules.g:1901:1: ( ( rule__Model__LocationAssignment_2 )? )
            {
            // InternalReactionRules.g:1901:1: ( ( rule__Model__LocationAssignment_2 )? )
            // InternalReactionRules.g:1902:2: ( rule__Model__LocationAssignment_2 )?
            {
             before(grammarAccess.getModelAccess().getLocationAssignment_2()); 
            // InternalReactionRules.g:1903:2: ( rule__Model__LocationAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=21 && LA12_0<=22)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalReactionRules.g:1903:3: rule__Model__LocationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__LocationAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getLocationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__ReactionContainer__Group__0"
    // InternalReactionRules.g:1912:1: rule__ReactionContainer__Group__0 : rule__ReactionContainer__Group__0__Impl rule__ReactionContainer__Group__1 ;
    public final void rule__ReactionContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1916:1: ( rule__ReactionContainer__Group__0__Impl rule__ReactionContainer__Group__1 )
            // InternalReactionRules.g:1917:2: rule__ReactionContainer__Group__0__Impl rule__ReactionContainer__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ReactionContainer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactionContainer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionContainer__Group__0"


    // $ANTLR start "rule__ReactionContainer__Group__0__Impl"
    // InternalReactionRules.g:1924:1: rule__ReactionContainer__Group__0__Impl : ( () ) ;
    public final void rule__ReactionContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1928:1: ( ( () ) )
            // InternalReactionRules.g:1929:1: ( () )
            {
            // InternalReactionRules.g:1929:1: ( () )
            // InternalReactionRules.g:1930:2: ()
            {
             before(grammarAccess.getReactionContainerAccess().getReactionContainerAction_0()); 
            // InternalReactionRules.g:1931:2: ()
            // InternalReactionRules.g:1931:3: 
            {
            }

             after(grammarAccess.getReactionContainerAccess().getReactionContainerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionContainer__Group__0__Impl"


    // $ANTLR start "rule__ReactionContainer__Group__1"
    // InternalReactionRules.g:1939:1: rule__ReactionContainer__Group__1 : rule__ReactionContainer__Group__1__Impl ;
    public final void rule__ReactionContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1943:1: ( rule__ReactionContainer__Group__1__Impl )
            // InternalReactionRules.g:1944:2: rule__ReactionContainer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactionContainer__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionContainer__Group__1"


    // $ANTLR start "rule__ReactionContainer__Group__1__Impl"
    // InternalReactionRules.g:1950:1: rule__ReactionContainer__Group__1__Impl : ( ( rule__ReactionContainer__AgentInstancesAssignment_1 )* ) ;
    public final void rule__ReactionContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1954:1: ( ( ( rule__ReactionContainer__AgentInstancesAssignment_1 )* ) )
            // InternalReactionRules.g:1955:1: ( ( rule__ReactionContainer__AgentInstancesAssignment_1 )* )
            {
            // InternalReactionRules.g:1955:1: ( ( rule__ReactionContainer__AgentInstancesAssignment_1 )* )
            // InternalReactionRules.g:1956:2: ( rule__ReactionContainer__AgentInstancesAssignment_1 )*
            {
             before(grammarAccess.getReactionContainerAccess().getAgentInstancesAssignment_1()); 
            // InternalReactionRules.g:1957:2: ( rule__ReactionContainer__AgentInstancesAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalReactionRules.g:1957:3: rule__ReactionContainer__AgentInstancesAssignment_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ReactionContainer__AgentInstancesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getReactionContainerAccess().getAgentInstancesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionContainer__Group__1__Impl"


    // $ANTLR start "rule__AgentInstanceSiteState__Group__0"
    // InternalReactionRules.g:1966:1: rule__AgentInstanceSiteState__Group__0 : rule__AgentInstanceSiteState__Group__0__Impl rule__AgentInstanceSiteState__Group__1 ;
    public final void rule__AgentInstanceSiteState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1970:1: ( rule__AgentInstanceSiteState__Group__0__Impl rule__AgentInstanceSiteState__Group__1 )
            // InternalReactionRules.g:1971:2: rule__AgentInstanceSiteState__Group__0__Impl rule__AgentInstanceSiteState__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__AgentInstanceSiteState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentInstanceSiteState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceSiteState__Group__0"


    // $ANTLR start "rule__AgentInstanceSiteState__Group__0__Impl"
    // InternalReactionRules.g:1978:1: rule__AgentInstanceSiteState__Group__0__Impl : ( ( rule__AgentInstanceSiteState__SiteAssignment_0 ) ) ;
    public final void rule__AgentInstanceSiteState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1982:1: ( ( ( rule__AgentInstanceSiteState__SiteAssignment_0 ) ) )
            // InternalReactionRules.g:1983:1: ( ( rule__AgentInstanceSiteState__SiteAssignment_0 ) )
            {
            // InternalReactionRules.g:1983:1: ( ( rule__AgentInstanceSiteState__SiteAssignment_0 ) )
            // InternalReactionRules.g:1984:2: ( rule__AgentInstanceSiteState__SiteAssignment_0 )
            {
             before(grammarAccess.getAgentInstanceSiteStateAccess().getSiteAssignment_0()); 
            // InternalReactionRules.g:1985:2: ( rule__AgentInstanceSiteState__SiteAssignment_0 )
            // InternalReactionRules.g:1985:3: rule__AgentInstanceSiteState__SiteAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstanceSiteState__SiteAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceSiteStateAccess().getSiteAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceSiteState__Group__0__Impl"


    // $ANTLR start "rule__AgentInstanceSiteState__Group__1"
    // InternalReactionRules.g:1993:1: rule__AgentInstanceSiteState__Group__1 : rule__AgentInstanceSiteState__Group__1__Impl ;
    public final void rule__AgentInstanceSiteState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1997:1: ( rule__AgentInstanceSiteState__Group__1__Impl )
            // InternalReactionRules.g:1998:2: rule__AgentInstanceSiteState__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstanceSiteState__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceSiteState__Group__1"


    // $ANTLR start "rule__AgentInstanceSiteState__Group__1__Impl"
    // InternalReactionRules.g:2004:1: rule__AgentInstanceSiteState__Group__1__Impl : ( ( rule__AgentInstanceSiteState__SiteStateAssignment_1 ) ) ;
    public final void rule__AgentInstanceSiteState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2008:1: ( ( ( rule__AgentInstanceSiteState__SiteStateAssignment_1 ) ) )
            // InternalReactionRules.g:2009:1: ( ( rule__AgentInstanceSiteState__SiteStateAssignment_1 ) )
            {
            // InternalReactionRules.g:2009:1: ( ( rule__AgentInstanceSiteState__SiteStateAssignment_1 ) )
            // InternalReactionRules.g:2010:2: ( rule__AgentInstanceSiteState__SiteStateAssignment_1 )
            {
             before(grammarAccess.getAgentInstanceSiteStateAccess().getSiteStateAssignment_1()); 
            // InternalReactionRules.g:2011:2: ( rule__AgentInstanceSiteState__SiteStateAssignment_1 )
            // InternalReactionRules.g:2011:3: rule__AgentInstanceSiteState__SiteStateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstanceSiteState__SiteStateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceSiteStateAccess().getSiteStateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceSiteState__Group__1__Impl"


    // $ANTLR start "rule__AgentInstanceLinkState__Group__0"
    // InternalReactionRules.g:2020:1: rule__AgentInstanceLinkState__Group__0 : rule__AgentInstanceLinkState__Group__0__Impl rule__AgentInstanceLinkState__Group__1 ;
    public final void rule__AgentInstanceLinkState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2024:1: ( rule__AgentInstanceLinkState__Group__0__Impl rule__AgentInstanceLinkState__Group__1 )
            // InternalReactionRules.g:2025:2: rule__AgentInstanceLinkState__Group__0__Impl rule__AgentInstanceLinkState__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__AgentInstanceLinkState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentInstanceLinkState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceLinkState__Group__0"


    // $ANTLR start "rule__AgentInstanceLinkState__Group__0__Impl"
    // InternalReactionRules.g:2032:1: rule__AgentInstanceLinkState__Group__0__Impl : ( ( rule__AgentInstanceLinkState__SiteAssignment_0 ) ) ;
    public final void rule__AgentInstanceLinkState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2036:1: ( ( ( rule__AgentInstanceLinkState__SiteAssignment_0 ) ) )
            // InternalReactionRules.g:2037:1: ( ( rule__AgentInstanceLinkState__SiteAssignment_0 ) )
            {
            // InternalReactionRules.g:2037:1: ( ( rule__AgentInstanceLinkState__SiteAssignment_0 ) )
            // InternalReactionRules.g:2038:2: ( rule__AgentInstanceLinkState__SiteAssignment_0 )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getSiteAssignment_0()); 
            // InternalReactionRules.g:2039:2: ( rule__AgentInstanceLinkState__SiteAssignment_0 )
            // InternalReactionRules.g:2039:3: rule__AgentInstanceLinkState__SiteAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstanceLinkState__SiteAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceLinkStateAccess().getSiteAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceLinkState__Group__0__Impl"


    // $ANTLR start "rule__AgentInstanceLinkState__Group__1"
    // InternalReactionRules.g:2047:1: rule__AgentInstanceLinkState__Group__1 : rule__AgentInstanceLinkState__Group__1__Impl rule__AgentInstanceLinkState__Group__2 ;
    public final void rule__AgentInstanceLinkState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2051:1: ( rule__AgentInstanceLinkState__Group__1__Impl rule__AgentInstanceLinkState__Group__2 )
            // InternalReactionRules.g:2052:2: rule__AgentInstanceLinkState__Group__1__Impl rule__AgentInstanceLinkState__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__AgentInstanceLinkState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentInstanceLinkState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceLinkState__Group__1"


    // $ANTLR start "rule__AgentInstanceLinkState__Group__1__Impl"
    // InternalReactionRules.g:2059:1: rule__AgentInstanceLinkState__Group__1__Impl : ( ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 ) ) ;
    public final void rule__AgentInstanceLinkState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2063:1: ( ( ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 ) ) )
            // InternalReactionRules.g:2064:1: ( ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 ) )
            {
            // InternalReactionRules.g:2064:1: ( ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 ) )
            // InternalReactionRules.g:2065:2: ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedSiteAssignment_1()); 
            // InternalReactionRules.g:2066:2: ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 )
            // InternalReactionRules.g:2066:3: rule__AgentInstanceLinkState__AttachedSiteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstanceLinkState__AttachedSiteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedSiteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceLinkState__Group__1__Impl"


    // $ANTLR start "rule__AgentInstanceLinkState__Group__2"
    // InternalReactionRules.g:2074:1: rule__AgentInstanceLinkState__Group__2 : rule__AgentInstanceLinkState__Group__2__Impl rule__AgentInstanceLinkState__Group__3 ;
    public final void rule__AgentInstanceLinkState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2078:1: ( rule__AgentInstanceLinkState__Group__2__Impl rule__AgentInstanceLinkState__Group__3 )
            // InternalReactionRules.g:2079:2: rule__AgentInstanceLinkState__Group__2__Impl rule__AgentInstanceLinkState__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__AgentInstanceLinkState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentInstanceLinkState__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceLinkState__Group__2"


    // $ANTLR start "rule__AgentInstanceLinkState__Group__2__Impl"
    // InternalReactionRules.g:2086:1: rule__AgentInstanceLinkState__Group__2__Impl : ( ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 ) ) ;
    public final void rule__AgentInstanceLinkState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2090:1: ( ( ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 ) ) )
            // InternalReactionRules.g:2091:1: ( ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 ) )
            {
            // InternalReactionRules.g:2091:1: ( ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 ) )
            // InternalReactionRules.g:2092:2: ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentAssignment_2()); 
            // InternalReactionRules.g:2093:2: ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 )
            // InternalReactionRules.g:2093:3: rule__AgentInstanceLinkState__AttachedAgentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstanceLinkState__AttachedAgentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceLinkState__Group__2__Impl"


    // $ANTLR start "rule__AgentInstanceLinkState__Group__3"
    // InternalReactionRules.g:2101:1: rule__AgentInstanceLinkState__Group__3 : rule__AgentInstanceLinkState__Group__3__Impl rule__AgentInstanceLinkState__Group__4 ;
    public final void rule__AgentInstanceLinkState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2105:1: ( rule__AgentInstanceLinkState__Group__3__Impl rule__AgentInstanceLinkState__Group__4 )
            // InternalReactionRules.g:2106:2: rule__AgentInstanceLinkState__Group__3__Impl rule__AgentInstanceLinkState__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__AgentInstanceLinkState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentInstanceLinkState__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceLinkState__Group__3"


    // $ANTLR start "rule__AgentInstanceLinkState__Group__3__Impl"
    // InternalReactionRules.g:2113:1: rule__AgentInstanceLinkState__Group__3__Impl : ( ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 ) ) ;
    public final void rule__AgentInstanceLinkState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2117:1: ( ( ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 ) ) )
            // InternalReactionRules.g:2118:1: ( ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 ) )
            {
            // InternalReactionRules.g:2118:1: ( ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 ) )
            // InternalReactionRules.g:2119:2: ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentInstanceAssignment_3()); 
            // InternalReactionRules.g:2120:2: ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 )
            // InternalReactionRules.g:2120:3: rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentInstanceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceLinkState__Group__3__Impl"


    // $ANTLR start "rule__AgentInstanceLinkState__Group__4"
    // InternalReactionRules.g:2128:1: rule__AgentInstanceLinkState__Group__4 : rule__AgentInstanceLinkState__Group__4__Impl ;
    public final void rule__AgentInstanceLinkState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2132:1: ( rule__AgentInstanceLinkState__Group__4__Impl )
            // InternalReactionRules.g:2133:2: rule__AgentInstanceLinkState__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstanceLinkState__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceLinkState__Group__4"


    // $ANTLR start "rule__AgentInstanceLinkState__Group__4__Impl"
    // InternalReactionRules.g:2139:1: rule__AgentInstanceLinkState__Group__4__Impl : ( ( rule__AgentInstanceLinkState__LinkStateAssignment_4 ) ) ;
    public final void rule__AgentInstanceLinkState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2143:1: ( ( ( rule__AgentInstanceLinkState__LinkStateAssignment_4 ) ) )
            // InternalReactionRules.g:2144:1: ( ( rule__AgentInstanceLinkState__LinkStateAssignment_4 ) )
            {
            // InternalReactionRules.g:2144:1: ( ( rule__AgentInstanceLinkState__LinkStateAssignment_4 ) )
            // InternalReactionRules.g:2145:2: ( rule__AgentInstanceLinkState__LinkStateAssignment_4 )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getLinkStateAssignment_4()); 
            // InternalReactionRules.g:2146:2: ( rule__AgentInstanceLinkState__LinkStateAssignment_4 )
            // InternalReactionRules.g:2146:3: rule__AgentInstanceLinkState__LinkStateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstanceLinkState__LinkStateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceLinkStateAccess().getLinkStateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceLinkState__Group__4__Impl"


    // $ANTLR start "rule__AgentInstance__Group__0"
    // InternalReactionRules.g:2155:1: rule__AgentInstance__Group__0 : rule__AgentInstance__Group__0__Impl rule__AgentInstance__Group__1 ;
    public final void rule__AgentInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2159:1: ( rule__AgentInstance__Group__0__Impl rule__AgentInstance__Group__1 )
            // InternalReactionRules.g:2160:2: rule__AgentInstance__Group__0__Impl rule__AgentInstance__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__AgentInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__0"


    // $ANTLR start "rule__AgentInstance__Group__0__Impl"
    // InternalReactionRules.g:2167:1: rule__AgentInstance__Group__0__Impl : ( 'AgentInstance' ) ;
    public final void rule__AgentInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2171:1: ( ( 'AgentInstance' ) )
            // InternalReactionRules.g:2172:1: ( 'AgentInstance' )
            {
            // InternalReactionRules.g:2172:1: ( 'AgentInstance' )
            // InternalReactionRules.g:2173:2: 'AgentInstance'
            {
             before(grammarAccess.getAgentInstanceAccess().getAgentInstanceKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAgentInstanceAccess().getAgentInstanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__0__Impl"


    // $ANTLR start "rule__AgentInstance__Group__1"
    // InternalReactionRules.g:2182:1: rule__AgentInstance__Group__1 : rule__AgentInstance__Group__1__Impl rule__AgentInstance__Group__2 ;
    public final void rule__AgentInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2186:1: ( rule__AgentInstance__Group__1__Impl rule__AgentInstance__Group__2 )
            // InternalReactionRules.g:2187:2: rule__AgentInstance__Group__1__Impl rule__AgentInstance__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__AgentInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentInstance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__1"


    // $ANTLR start "rule__AgentInstance__Group__1__Impl"
    // InternalReactionRules.g:2194:1: rule__AgentInstance__Group__1__Impl : ( ( rule__AgentInstance__NameAssignment_1 ) ) ;
    public final void rule__AgentInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2198:1: ( ( ( rule__AgentInstance__NameAssignment_1 ) ) )
            // InternalReactionRules.g:2199:1: ( ( rule__AgentInstance__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:2199:1: ( ( rule__AgentInstance__NameAssignment_1 ) )
            // InternalReactionRules.g:2200:2: ( rule__AgentInstance__NameAssignment_1 )
            {
             before(grammarAccess.getAgentInstanceAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:2201:2: ( rule__AgentInstance__NameAssignment_1 )
            // InternalReactionRules.g:2201:3: rule__AgentInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__1__Impl"


    // $ANTLR start "rule__AgentInstance__Group__2"
    // InternalReactionRules.g:2209:1: rule__AgentInstance__Group__2 : rule__AgentInstance__Group__2__Impl rule__AgentInstance__Group__3 ;
    public final void rule__AgentInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2213:1: ( rule__AgentInstance__Group__2__Impl rule__AgentInstance__Group__3 )
            // InternalReactionRules.g:2214:2: rule__AgentInstance__Group__2__Impl rule__AgentInstance__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__AgentInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentInstance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__2"


    // $ANTLR start "rule__AgentInstance__Group__2__Impl"
    // InternalReactionRules.g:2221:1: rule__AgentInstance__Group__2__Impl : ( ( rule__AgentInstance__AgentAssignment_2 ) ) ;
    public final void rule__AgentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2225:1: ( ( ( rule__AgentInstance__AgentAssignment_2 ) ) )
            // InternalReactionRules.g:2226:1: ( ( rule__AgentInstance__AgentAssignment_2 ) )
            {
            // InternalReactionRules.g:2226:1: ( ( rule__AgentInstance__AgentAssignment_2 ) )
            // InternalReactionRules.g:2227:2: ( rule__AgentInstance__AgentAssignment_2 )
            {
             before(grammarAccess.getAgentInstanceAccess().getAgentAssignment_2()); 
            // InternalReactionRules.g:2228:2: ( rule__AgentInstance__AgentAssignment_2 )
            // InternalReactionRules.g:2228:3: rule__AgentInstance__AgentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstance__AgentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceAccess().getAgentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__2__Impl"


    // $ANTLR start "rule__AgentInstance__Group__3"
    // InternalReactionRules.g:2236:1: rule__AgentInstance__Group__3 : rule__AgentInstance__Group__3__Impl rule__AgentInstance__Group__4 ;
    public final void rule__AgentInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2240:1: ( rule__AgentInstance__Group__3__Impl rule__AgentInstance__Group__4 )
            // InternalReactionRules.g:2241:2: rule__AgentInstance__Group__3__Impl rule__AgentInstance__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__AgentInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentInstance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__3"


    // $ANTLR start "rule__AgentInstance__Group__3__Impl"
    // InternalReactionRules.g:2248:1: rule__AgentInstance__Group__3__Impl : ( ( rule__AgentInstance__SiteStatesAssignment_3 ) ) ;
    public final void rule__AgentInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2252:1: ( ( ( rule__AgentInstance__SiteStatesAssignment_3 ) ) )
            // InternalReactionRules.g:2253:1: ( ( rule__AgentInstance__SiteStatesAssignment_3 ) )
            {
            // InternalReactionRules.g:2253:1: ( ( rule__AgentInstance__SiteStatesAssignment_3 ) )
            // InternalReactionRules.g:2254:2: ( rule__AgentInstance__SiteStatesAssignment_3 )
            {
             before(grammarAccess.getAgentInstanceAccess().getSiteStatesAssignment_3()); 
            // InternalReactionRules.g:2255:2: ( rule__AgentInstance__SiteStatesAssignment_3 )
            // InternalReactionRules.g:2255:3: rule__AgentInstance__SiteStatesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstance__SiteStatesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceAccess().getSiteStatesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__3__Impl"


    // $ANTLR start "rule__AgentInstance__Group__4"
    // InternalReactionRules.g:2263:1: rule__AgentInstance__Group__4 : rule__AgentInstance__Group__4__Impl ;
    public final void rule__AgentInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2267:1: ( rule__AgentInstance__Group__4__Impl )
            // InternalReactionRules.g:2268:2: rule__AgentInstance__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstance__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__4"


    // $ANTLR start "rule__AgentInstance__Group__4__Impl"
    // InternalReactionRules.g:2274:1: rule__AgentInstance__Group__4__Impl : ( ( rule__AgentInstance__LinkStatesAssignment_4 ) ) ;
    public final void rule__AgentInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2278:1: ( ( ( rule__AgentInstance__LinkStatesAssignment_4 ) ) )
            // InternalReactionRules.g:2279:1: ( ( rule__AgentInstance__LinkStatesAssignment_4 ) )
            {
            // InternalReactionRules.g:2279:1: ( ( rule__AgentInstance__LinkStatesAssignment_4 ) )
            // InternalReactionRules.g:2280:2: ( rule__AgentInstance__LinkStatesAssignment_4 )
            {
             before(grammarAccess.getAgentInstanceAccess().getLinkStatesAssignment_4()); 
            // InternalReactionRules.g:2281:2: ( rule__AgentInstance__LinkStatesAssignment_4 )
            // InternalReactionRules.g:2281:3: rule__AgentInstance__LinkStatesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstance__LinkStatesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceAccess().getLinkStatesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__4__Impl"


    // $ANTLR start "rule__Float__Group__0"
    // InternalReactionRules.g:2290:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2294:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalReactionRules.g:2295:2: rule__Float__Group__0__Impl rule__Float__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalReactionRules.g:2302:1: rule__Float__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2306:1: ( ( ( '-' )? ) )
            // InternalReactionRules.g:2307:1: ( ( '-' )? )
            {
            // InternalReactionRules.g:2307:1: ( ( '-' )? )
            // InternalReactionRules.g:2308:2: ( '-' )?
            {
             before(grammarAccess.getFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalReactionRules.g:2309:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalReactionRules.g:2309:3: '-'
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
    // InternalReactionRules.g:2317:1: rule__Float__Group__1 : rule__Float__Group__1__Impl rule__Float__Group__2 ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2321:1: ( rule__Float__Group__1__Impl rule__Float__Group__2 )
            // InternalReactionRules.g:2322:2: rule__Float__Group__1__Impl rule__Float__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalReactionRules.g:2329:1: rule__Float__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2333:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2334:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2334:1: ( RULE_INT )
            // InternalReactionRules.g:2335:2: RULE_INT
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
    // InternalReactionRules.g:2344:1: rule__Float__Group__2 : rule__Float__Group__2__Impl rule__Float__Group__3 ;
    public final void rule__Float__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2348:1: ( rule__Float__Group__2__Impl rule__Float__Group__3 )
            // InternalReactionRules.g:2349:2: rule__Float__Group__2__Impl rule__Float__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalReactionRules.g:2356:1: rule__Float__Group__2__Impl : ( '.' ) ;
    public final void rule__Float__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2360:1: ( ( '.' ) )
            // InternalReactionRules.g:2361:1: ( '.' )
            {
            // InternalReactionRules.g:2361:1: ( '.' )
            // InternalReactionRules.g:2362:2: '.'
            {
             before(grammarAccess.getFloatAccess().getFullStopKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalReactionRules.g:2371:1: rule__Float__Group__3 : rule__Float__Group__3__Impl ;
    public final void rule__Float__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2375:1: ( rule__Float__Group__3__Impl )
            // InternalReactionRules.g:2376:2: rule__Float__Group__3__Impl
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
    // InternalReactionRules.g:2382:1: rule__Float__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2386:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2387:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2387:1: ( RULE_INT )
            // InternalReactionRules.g:2388:2: RULE_INT
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
    // InternalReactionRules.g:2398:1: rule__ScientificFloat__Group__0 : rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1 ;
    public final void rule__ScientificFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2402:1: ( rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1 )
            // InternalReactionRules.g:2403:2: rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalReactionRules.g:2410:1: rule__ScientificFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ScientificFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2414:1: ( ( ( '-' )? ) )
            // InternalReactionRules.g:2415:1: ( ( '-' )? )
            {
            // InternalReactionRules.g:2415:1: ( ( '-' )? )
            // InternalReactionRules.g:2416:2: ( '-' )?
            {
             before(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalReactionRules.g:2417:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalReactionRules.g:2417:3: '-'
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
    // InternalReactionRules.g:2425:1: rule__ScientificFloat__Group__1 : rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2 ;
    public final void rule__ScientificFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2429:1: ( rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2 )
            // InternalReactionRules.g:2430:2: rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalReactionRules.g:2437:1: rule__ScientificFloat__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2441:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2442:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2442:1: ( RULE_INT )
            // InternalReactionRules.g:2443:2: RULE_INT
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
    // InternalReactionRules.g:2452:1: rule__ScientificFloat__Group__2 : rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3 ;
    public final void rule__ScientificFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2456:1: ( rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3 )
            // InternalReactionRules.g:2457:2: rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalReactionRules.g:2464:1: rule__ScientificFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__ScientificFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2468:1: ( ( '.' ) )
            // InternalReactionRules.g:2469:1: ( '.' )
            {
            // InternalReactionRules.g:2469:1: ( '.' )
            // InternalReactionRules.g:2470:2: '.'
            {
             before(grammarAccess.getScientificFloatAccess().getFullStopKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalReactionRules.g:2479:1: rule__ScientificFloat__Group__3 : rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4 ;
    public final void rule__ScientificFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2483:1: ( rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4 )
            // InternalReactionRules.g:2484:2: rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalReactionRules.g:2491:1: rule__ScientificFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2495:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2496:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2496:1: ( RULE_INT )
            // InternalReactionRules.g:2497:2: RULE_INT
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
    // InternalReactionRules.g:2506:1: rule__ScientificFloat__Group__4 : rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5 ;
    public final void rule__ScientificFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2510:1: ( rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5 )
            // InternalReactionRules.g:2511:2: rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalReactionRules.g:2518:1: rule__ScientificFloat__Group__4__Impl : ( RULE_EXPONENT ) ;
    public final void rule__ScientificFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2522:1: ( ( RULE_EXPONENT ) )
            // InternalReactionRules.g:2523:1: ( RULE_EXPONENT )
            {
            // InternalReactionRules.g:2523:1: ( RULE_EXPONENT )
            // InternalReactionRules.g:2524:2: RULE_EXPONENT
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
    // InternalReactionRules.g:2533:1: rule__ScientificFloat__Group__5 : rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6 ;
    public final void rule__ScientificFloat__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2537:1: ( rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6 )
            // InternalReactionRules.g:2538:2: rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalReactionRules.g:2545:1: rule__ScientificFloat__Group__5__Impl : ( ( rule__ScientificFloat__Alternatives_5 ) ) ;
    public final void rule__ScientificFloat__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2549:1: ( ( ( rule__ScientificFloat__Alternatives_5 ) ) )
            // InternalReactionRules.g:2550:1: ( ( rule__ScientificFloat__Alternatives_5 ) )
            {
            // InternalReactionRules.g:2550:1: ( ( rule__ScientificFloat__Alternatives_5 ) )
            // InternalReactionRules.g:2551:2: ( rule__ScientificFloat__Alternatives_5 )
            {
             before(grammarAccess.getScientificFloatAccess().getAlternatives_5()); 
            // InternalReactionRules.g:2552:2: ( rule__ScientificFloat__Alternatives_5 )
            // InternalReactionRules.g:2552:3: rule__ScientificFloat__Alternatives_5
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
    // InternalReactionRules.g:2560:1: rule__ScientificFloat__Group__6 : rule__ScientificFloat__Group__6__Impl ;
    public final void rule__ScientificFloat__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2564:1: ( rule__ScientificFloat__Group__6__Impl )
            // InternalReactionRules.g:2565:2: rule__ScientificFloat__Group__6__Impl
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
    // InternalReactionRules.g:2571:1: rule__ScientificFloat__Group__6__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2575:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2576:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2576:1: ( RULE_INT )
            // InternalReactionRules.g:2577:2: RULE_INT
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
    // InternalReactionRules.g:2587:1: rule__SignedInteger__Group__0 : rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 ;
    public final void rule__SignedInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2591:1: ( rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 )
            // InternalReactionRules.g:2592:2: rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalReactionRules.g:2599:1: rule__SignedInteger__Group__0__Impl : ( '-' ) ;
    public final void rule__SignedInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2603:1: ( ( '-' ) )
            // InternalReactionRules.g:2604:1: ( '-' )
            {
            // InternalReactionRules.g:2604:1: ( '-' )
            // InternalReactionRules.g:2605:2: '-'
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
    // InternalReactionRules.g:2614:1: rule__SignedInteger__Group__1 : rule__SignedInteger__Group__1__Impl ;
    public final void rule__SignedInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2618:1: ( rule__SignedInteger__Group__1__Impl )
            // InternalReactionRules.g:2619:2: rule__SignedInteger__Group__1__Impl
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
    // InternalReactionRules.g:2625:1: rule__SignedInteger__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__SignedInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2629:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2630:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2630:1: ( RULE_INT )
            // InternalReactionRules.g:2631:2: RULE_INT
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
    // InternalReactionRules.g:2641:1: rule__States__Group__0 : rule__States__Group__0__Impl rule__States__Group__1 ;
    public final void rule__States__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2645:1: ( rule__States__Group__0__Impl rule__States__Group__1 )
            // InternalReactionRules.g:2646:2: rule__States__Group__0__Impl rule__States__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalReactionRules.g:2653:1: rule__States__Group__0__Impl : ( () ) ;
    public final void rule__States__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2657:1: ( ( () ) )
            // InternalReactionRules.g:2658:1: ( () )
            {
            // InternalReactionRules.g:2658:1: ( () )
            // InternalReactionRules.g:2659:2: ()
            {
             before(grammarAccess.getStatesAccess().getStatesAction_0()); 
            // InternalReactionRules.g:2660:2: ()
            // InternalReactionRules.g:2660:3: 
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
    // InternalReactionRules.g:2668:1: rule__States__Group__1 : rule__States__Group__1__Impl ;
    public final void rule__States__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2672:1: ( rule__States__Group__1__Impl )
            // InternalReactionRules.g:2673:2: rule__States__Group__1__Impl
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
    // InternalReactionRules.g:2679:1: rule__States__Group__1__Impl : ( ( rule__States__Group_1__0 )? ) ;
    public final void rule__States__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2683:1: ( ( ( rule__States__Group_1__0 )? ) )
            // InternalReactionRules.g:2684:1: ( ( rule__States__Group_1__0 )? )
            {
            // InternalReactionRules.g:2684:1: ( ( rule__States__Group_1__0 )? )
            // InternalReactionRules.g:2685:2: ( rule__States__Group_1__0 )?
            {
             before(grammarAccess.getStatesAccess().getGroup_1()); 
            // InternalReactionRules.g:2686:2: ( rule__States__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalReactionRules.g:2686:3: rule__States__Group_1__0
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
    // InternalReactionRules.g:2695:1: rule__States__Group_1__0 : rule__States__Group_1__0__Impl rule__States__Group_1__1 ;
    public final void rule__States__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2699:1: ( rule__States__Group_1__0__Impl rule__States__Group_1__1 )
            // InternalReactionRules.g:2700:2: rule__States__Group_1__0__Impl rule__States__Group_1__1
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
    // InternalReactionRules.g:2707:1: rule__States__Group_1__0__Impl : ( '{' ) ;
    public final void rule__States__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2711:1: ( ( '{' ) )
            // InternalReactionRules.g:2712:1: ( '{' )
            {
            // InternalReactionRules.g:2712:1: ( '{' )
            // InternalReactionRules.g:2713:2: '{'
            {
             before(grammarAccess.getStatesAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalReactionRules.g:2722:1: rule__States__Group_1__1 : rule__States__Group_1__1__Impl rule__States__Group_1__2 ;
    public final void rule__States__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2726:1: ( rule__States__Group_1__1__Impl rule__States__Group_1__2 )
            // InternalReactionRules.g:2727:2: rule__States__Group_1__1__Impl rule__States__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalReactionRules.g:2734:1: rule__States__Group_1__1__Impl : ( ( rule__States__StateAssignment_1_1 ) ) ;
    public final void rule__States__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2738:1: ( ( ( rule__States__StateAssignment_1_1 ) ) )
            // InternalReactionRules.g:2739:1: ( ( rule__States__StateAssignment_1_1 ) )
            {
            // InternalReactionRules.g:2739:1: ( ( rule__States__StateAssignment_1_1 ) )
            // InternalReactionRules.g:2740:2: ( rule__States__StateAssignment_1_1 )
            {
             before(grammarAccess.getStatesAccess().getStateAssignment_1_1()); 
            // InternalReactionRules.g:2741:2: ( rule__States__StateAssignment_1_1 )
            // InternalReactionRules.g:2741:3: rule__States__StateAssignment_1_1
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
    // InternalReactionRules.g:2749:1: rule__States__Group_1__2 : rule__States__Group_1__2__Impl rule__States__Group_1__3 ;
    public final void rule__States__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2753:1: ( rule__States__Group_1__2__Impl rule__States__Group_1__3 )
            // InternalReactionRules.g:2754:2: rule__States__Group_1__2__Impl rule__States__Group_1__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalReactionRules.g:2761:1: rule__States__Group_1__2__Impl : ( ( rule__States__Group_1_2__0 )* ) ;
    public final void rule__States__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2765:1: ( ( ( rule__States__Group_1_2__0 )* ) )
            // InternalReactionRules.g:2766:1: ( ( rule__States__Group_1_2__0 )* )
            {
            // InternalReactionRules.g:2766:1: ( ( rule__States__Group_1_2__0 )* )
            // InternalReactionRules.g:2767:2: ( rule__States__Group_1_2__0 )*
            {
             before(grammarAccess.getStatesAccess().getGroup_1_2()); 
            // InternalReactionRules.g:2768:2: ( rule__States__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalReactionRules.g:2768:3: rule__States__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__States__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalReactionRules.g:2776:1: rule__States__Group_1__3 : rule__States__Group_1__3__Impl ;
    public final void rule__States__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2780:1: ( rule__States__Group_1__3__Impl )
            // InternalReactionRules.g:2781:2: rule__States__Group_1__3__Impl
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
    // InternalReactionRules.g:2787:1: rule__States__Group_1__3__Impl : ( '}' ) ;
    public final void rule__States__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2791:1: ( ( '}' ) )
            // InternalReactionRules.g:2792:1: ( '}' )
            {
            // InternalReactionRules.g:2792:1: ( '}' )
            // InternalReactionRules.g:2793:2: '}'
            {
             before(grammarAccess.getStatesAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalReactionRules.g:2803:1: rule__States__Group_1_2__0 : rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1 ;
    public final void rule__States__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2807:1: ( rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1 )
            // InternalReactionRules.g:2808:2: rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1
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
    // InternalReactionRules.g:2815:1: rule__States__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__States__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2819:1: ( ( ',' ) )
            // InternalReactionRules.g:2820:1: ( ',' )
            {
            // InternalReactionRules.g:2820:1: ( ',' )
            // InternalReactionRules.g:2821:2: ','
            {
             before(grammarAccess.getStatesAccess().getCommaKeyword_1_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalReactionRules.g:2830:1: rule__States__Group_1_2__1 : rule__States__Group_1_2__1__Impl ;
    public final void rule__States__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2834:1: ( rule__States__Group_1_2__1__Impl )
            // InternalReactionRules.g:2835:2: rule__States__Group_1_2__1__Impl
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
    // InternalReactionRules.g:2841:1: rule__States__Group_1_2__1__Impl : ( ( rule__States__StateAssignment_1_2_1 ) ) ;
    public final void rule__States__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2845:1: ( ( ( rule__States__StateAssignment_1_2_1 ) ) )
            // InternalReactionRules.g:2846:1: ( ( rule__States__StateAssignment_1_2_1 ) )
            {
            // InternalReactionRules.g:2846:1: ( ( rule__States__StateAssignment_1_2_1 ) )
            // InternalReactionRules.g:2847:2: ( rule__States__StateAssignment_1_2_1 )
            {
             before(grammarAccess.getStatesAccess().getStateAssignment_1_2_1()); 
            // InternalReactionRules.g:2848:2: ( rule__States__StateAssignment_1_2_1 )
            // InternalReactionRules.g:2848:3: rule__States__StateAssignment_1_2_1
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
    // InternalReactionRules.g:2857:1: rule__Site__Group__0 : rule__Site__Group__0__Impl rule__Site__Group__1 ;
    public final void rule__Site__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2861:1: ( rule__Site__Group__0__Impl rule__Site__Group__1 )
            // InternalReactionRules.g:2862:2: rule__Site__Group__0__Impl rule__Site__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalReactionRules.g:2869:1: rule__Site__Group__0__Impl : ( ( rule__Site__NameAssignment_0 ) ) ;
    public final void rule__Site__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2873:1: ( ( ( rule__Site__NameAssignment_0 ) ) )
            // InternalReactionRules.g:2874:1: ( ( rule__Site__NameAssignment_0 ) )
            {
            // InternalReactionRules.g:2874:1: ( ( rule__Site__NameAssignment_0 ) )
            // InternalReactionRules.g:2875:2: ( rule__Site__NameAssignment_0 )
            {
             before(grammarAccess.getSiteAccess().getNameAssignment_0()); 
            // InternalReactionRules.g:2876:2: ( rule__Site__NameAssignment_0 )
            // InternalReactionRules.g:2876:3: rule__Site__NameAssignment_0
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
    // InternalReactionRules.g:2884:1: rule__Site__Group__1 : rule__Site__Group__1__Impl ;
    public final void rule__Site__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2888:1: ( rule__Site__Group__1__Impl )
            // InternalReactionRules.g:2889:2: rule__Site__Group__1__Impl
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
    // InternalReactionRules.g:2895:1: rule__Site__Group__1__Impl : ( ( rule__Site__StatesAssignment_1 ) ) ;
    public final void rule__Site__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2899:1: ( ( ( rule__Site__StatesAssignment_1 ) ) )
            // InternalReactionRules.g:2900:1: ( ( rule__Site__StatesAssignment_1 ) )
            {
            // InternalReactionRules.g:2900:1: ( ( rule__Site__StatesAssignment_1 ) )
            // InternalReactionRules.g:2901:2: ( rule__Site__StatesAssignment_1 )
            {
             before(grammarAccess.getSiteAccess().getStatesAssignment_1()); 
            // InternalReactionRules.g:2902:2: ( rule__Site__StatesAssignment_1 )
            // InternalReactionRules.g:2902:3: rule__Site__StatesAssignment_1
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
    // InternalReactionRules.g:2911:1: rule__Sites__Group__0 : rule__Sites__Group__0__Impl rule__Sites__Group__1 ;
    public final void rule__Sites__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2915:1: ( rule__Sites__Group__0__Impl rule__Sites__Group__1 )
            // InternalReactionRules.g:2916:2: rule__Sites__Group__0__Impl rule__Sites__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalReactionRules.g:2923:1: rule__Sites__Group__0__Impl : ( () ) ;
    public final void rule__Sites__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2927:1: ( ( () ) )
            // InternalReactionRules.g:2928:1: ( () )
            {
            // InternalReactionRules.g:2928:1: ( () )
            // InternalReactionRules.g:2929:2: ()
            {
             before(grammarAccess.getSitesAccess().getSitesAction_0()); 
            // InternalReactionRules.g:2930:2: ()
            // InternalReactionRules.g:2930:3: 
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
    // InternalReactionRules.g:2938:1: rule__Sites__Group__1 : rule__Sites__Group__1__Impl ;
    public final void rule__Sites__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2942:1: ( rule__Sites__Group__1__Impl )
            // InternalReactionRules.g:2943:2: rule__Sites__Group__1__Impl
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
    // InternalReactionRules.g:2949:1: rule__Sites__Group__1__Impl : ( ( rule__Sites__Group_1__0 )? ) ;
    public final void rule__Sites__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2953:1: ( ( ( rule__Sites__Group_1__0 )? ) )
            // InternalReactionRules.g:2954:1: ( ( rule__Sites__Group_1__0 )? )
            {
            // InternalReactionRules.g:2954:1: ( ( rule__Sites__Group_1__0 )? )
            // InternalReactionRules.g:2955:2: ( rule__Sites__Group_1__0 )?
            {
             before(grammarAccess.getSitesAccess().getGroup_1()); 
            // InternalReactionRules.g:2956:2: ( rule__Sites__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalReactionRules.g:2956:3: rule__Sites__Group_1__0
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
    // InternalReactionRules.g:2965:1: rule__Sites__Group_1__0 : rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1 ;
    public final void rule__Sites__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2969:1: ( rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1 )
            // InternalReactionRules.g:2970:2: rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1
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
    // InternalReactionRules.g:2977:1: rule__Sites__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Sites__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2981:1: ( ( '(' ) )
            // InternalReactionRules.g:2982:1: ( '(' )
            {
            // InternalReactionRules.g:2982:1: ( '(' )
            // InternalReactionRules.g:2983:2: '('
            {
             before(grammarAccess.getSitesAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalReactionRules.g:2992:1: rule__Sites__Group_1__1 : rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2 ;
    public final void rule__Sites__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2996:1: ( rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2 )
            // InternalReactionRules.g:2997:2: rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalReactionRules.g:3004:1: rule__Sites__Group_1__1__Impl : ( ( rule__Sites__SitesAssignment_1_1 ) ) ;
    public final void rule__Sites__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3008:1: ( ( ( rule__Sites__SitesAssignment_1_1 ) ) )
            // InternalReactionRules.g:3009:1: ( ( rule__Sites__SitesAssignment_1_1 ) )
            {
            // InternalReactionRules.g:3009:1: ( ( rule__Sites__SitesAssignment_1_1 ) )
            // InternalReactionRules.g:3010:2: ( rule__Sites__SitesAssignment_1_1 )
            {
             before(grammarAccess.getSitesAccess().getSitesAssignment_1_1()); 
            // InternalReactionRules.g:3011:2: ( rule__Sites__SitesAssignment_1_1 )
            // InternalReactionRules.g:3011:3: rule__Sites__SitesAssignment_1_1
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
    // InternalReactionRules.g:3019:1: rule__Sites__Group_1__2 : rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3 ;
    public final void rule__Sites__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3023:1: ( rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3 )
            // InternalReactionRules.g:3024:2: rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalReactionRules.g:3031:1: rule__Sites__Group_1__2__Impl : ( ( rule__Sites__Group_1_2__0 )* ) ;
    public final void rule__Sites__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3035:1: ( ( ( rule__Sites__Group_1_2__0 )* ) )
            // InternalReactionRules.g:3036:1: ( ( rule__Sites__Group_1_2__0 )* )
            {
            // InternalReactionRules.g:3036:1: ( ( rule__Sites__Group_1_2__0 )* )
            // InternalReactionRules.g:3037:2: ( rule__Sites__Group_1_2__0 )*
            {
             before(grammarAccess.getSitesAccess().getGroup_1_2()); 
            // InternalReactionRules.g:3038:2: ( rule__Sites__Group_1_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalReactionRules.g:3038:3: rule__Sites__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Sites__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalReactionRules.g:3046:1: rule__Sites__Group_1__3 : rule__Sites__Group_1__3__Impl ;
    public final void rule__Sites__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3050:1: ( rule__Sites__Group_1__3__Impl )
            // InternalReactionRules.g:3051:2: rule__Sites__Group_1__3__Impl
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
    // InternalReactionRules.g:3057:1: rule__Sites__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Sites__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3061:1: ( ( ')' ) )
            // InternalReactionRules.g:3062:1: ( ')' )
            {
            // InternalReactionRules.g:3062:1: ( ')' )
            // InternalReactionRules.g:3063:2: ')'
            {
             before(grammarAccess.getSitesAccess().getRightParenthesisKeyword_1_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalReactionRules.g:3073:1: rule__Sites__Group_1_2__0 : rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1 ;
    public final void rule__Sites__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3077:1: ( rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1 )
            // InternalReactionRules.g:3078:2: rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1
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
    // InternalReactionRules.g:3085:1: rule__Sites__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Sites__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3089:1: ( ( ',' ) )
            // InternalReactionRules.g:3090:1: ( ',' )
            {
            // InternalReactionRules.g:3090:1: ( ',' )
            // InternalReactionRules.g:3091:2: ','
            {
             before(grammarAccess.getSitesAccess().getCommaKeyword_1_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalReactionRules.g:3100:1: rule__Sites__Group_1_2__1 : rule__Sites__Group_1_2__1__Impl ;
    public final void rule__Sites__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3104:1: ( rule__Sites__Group_1_2__1__Impl )
            // InternalReactionRules.g:3105:2: rule__Sites__Group_1_2__1__Impl
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
    // InternalReactionRules.g:3111:1: rule__Sites__Group_1_2__1__Impl : ( ( rule__Sites__SitesAssignment_1_2_1 ) ) ;
    public final void rule__Sites__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3115:1: ( ( ( rule__Sites__SitesAssignment_1_2_1 ) ) )
            // InternalReactionRules.g:3116:1: ( ( rule__Sites__SitesAssignment_1_2_1 ) )
            {
            // InternalReactionRules.g:3116:1: ( ( rule__Sites__SitesAssignment_1_2_1 ) )
            // InternalReactionRules.g:3117:2: ( rule__Sites__SitesAssignment_1_2_1 )
            {
             before(grammarAccess.getSitesAccess().getSitesAssignment_1_2_1()); 
            // InternalReactionRules.g:3118:2: ( rule__Sites__SitesAssignment_1_2_1 )
            // InternalReactionRules.g:3118:3: rule__Sites__SitesAssignment_1_2_1
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
    // InternalReactionRules.g:3127:1: rule__Agent__Group__0 : rule__Agent__Group__0__Impl rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3131:1: ( rule__Agent__Group__0__Impl rule__Agent__Group__1 )
            // InternalReactionRules.g:3132:2: rule__Agent__Group__0__Impl rule__Agent__Group__1
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
    // InternalReactionRules.g:3139:1: rule__Agent__Group__0__Impl : ( 'agent' ) ;
    public final void rule__Agent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3143:1: ( ( 'agent' ) )
            // InternalReactionRules.g:3144:1: ( 'agent' )
            {
            // InternalReactionRules.g:3144:1: ( 'agent' )
            // InternalReactionRules.g:3145:2: 'agent'
            {
             before(grammarAccess.getAgentAccess().getAgentKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalReactionRules.g:3154:1: rule__Agent__Group__1 : rule__Agent__Group__1__Impl rule__Agent__Group__2 ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3158:1: ( rule__Agent__Group__1__Impl rule__Agent__Group__2 )
            // InternalReactionRules.g:3159:2: rule__Agent__Group__1__Impl rule__Agent__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalReactionRules.g:3166:1: rule__Agent__Group__1__Impl : ( ( rule__Agent__NameAssignment_1 ) ) ;
    public final void rule__Agent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3170:1: ( ( ( rule__Agent__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3171:1: ( ( rule__Agent__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3171:1: ( ( rule__Agent__NameAssignment_1 ) )
            // InternalReactionRules.g:3172:2: ( rule__Agent__NameAssignment_1 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3173:2: ( rule__Agent__NameAssignment_1 )
            // InternalReactionRules.g:3173:3: rule__Agent__NameAssignment_1
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
    // InternalReactionRules.g:3181:1: rule__Agent__Group__2 : rule__Agent__Group__2__Impl ;
    public final void rule__Agent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3185:1: ( rule__Agent__Group__2__Impl )
            // InternalReactionRules.g:3186:2: rule__Agent__Group__2__Impl
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
    // InternalReactionRules.g:3192:1: rule__Agent__Group__2__Impl : ( ( rule__Agent__SitesAssignment_2 ) ) ;
    public final void rule__Agent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3196:1: ( ( ( rule__Agent__SitesAssignment_2 ) ) )
            // InternalReactionRules.g:3197:1: ( ( rule__Agent__SitesAssignment_2 ) )
            {
            // InternalReactionRules.g:3197:1: ( ( rule__Agent__SitesAssignment_2 ) )
            // InternalReactionRules.g:3198:2: ( rule__Agent__SitesAssignment_2 )
            {
             before(grammarAccess.getAgentAccess().getSitesAssignment_2()); 
            // InternalReactionRules.g:3199:2: ( rule__Agent__SitesAssignment_2 )
            // InternalReactionRules.g:3199:3: rule__Agent__SitesAssignment_2
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
    // InternalReactionRules.g:3208:1: rule__PatternVariable__Group__0 : rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 ;
    public final void rule__PatternVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3212:1: ( rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 )
            // InternalReactionRules.g:3213:2: rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:3220:1: rule__PatternVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__PatternVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3224:1: ( ( 'var' ) )
            // InternalReactionRules.g:3225:1: ( 'var' )
            {
            // InternalReactionRules.g:3225:1: ( 'var' )
            // InternalReactionRules.g:3226:2: 'var'
            {
             before(grammarAccess.getPatternVariableAccess().getVarKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalReactionRules.g:3235:1: rule__PatternVariable__Group__1 : rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 ;
    public final void rule__PatternVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3239:1: ( rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 )
            // InternalReactionRules.g:3240:2: rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalReactionRules.g:3247:1: rule__PatternVariable__Group__1__Impl : ( ( rule__PatternVariable__NameAssignment_1 ) ) ;
    public final void rule__PatternVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3251:1: ( ( ( rule__PatternVariable__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3252:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3252:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            // InternalReactionRules.g:3253:2: ( rule__PatternVariable__NameAssignment_1 )
            {
             before(grammarAccess.getPatternVariableAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3254:2: ( rule__PatternVariable__NameAssignment_1 )
            // InternalReactionRules.g:3254:3: rule__PatternVariable__NameAssignment_1
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
    // InternalReactionRules.g:3262:1: rule__PatternVariable__Group__2 : rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 ;
    public final void rule__PatternVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3266:1: ( rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 )
            // InternalReactionRules.g:3267:2: rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalReactionRules.g:3274:1: rule__PatternVariable__Group__2__Impl : ( '=' ) ;
    public final void rule__PatternVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3278:1: ( ( '=' ) )
            // InternalReactionRules.g:3279:1: ( '=' )
            {
            // InternalReactionRules.g:3279:1: ( '=' )
            // InternalReactionRules.g:3280:2: '='
            {
             before(grammarAccess.getPatternVariableAccess().getEqualsSignKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalReactionRules.g:3289:1: rule__PatternVariable__Group__3 : rule__PatternVariable__Group__3__Impl ;
    public final void rule__PatternVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3293:1: ( rule__PatternVariable__Group__3__Impl )
            // InternalReactionRules.g:3294:2: rule__PatternVariable__Group__3__Impl
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
    // InternalReactionRules.g:3300:1: rule__PatternVariable__Group__3__Impl : ( ( rule__PatternVariable__PatternAssignment_3 ) ) ;
    public final void rule__PatternVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3304:1: ( ( ( rule__PatternVariable__PatternAssignment_3 ) ) )
            // InternalReactionRules.g:3305:1: ( ( rule__PatternVariable__PatternAssignment_3 ) )
            {
            // InternalReactionRules.g:3305:1: ( ( rule__PatternVariable__PatternAssignment_3 ) )
            // InternalReactionRules.g:3306:2: ( rule__PatternVariable__PatternAssignment_3 )
            {
             before(grammarAccess.getPatternVariableAccess().getPatternAssignment_3()); 
            // InternalReactionRules.g:3307:2: ( rule__PatternVariable__PatternAssignment_3 )
            // InternalReactionRules.g:3307:3: rule__PatternVariable__PatternAssignment_3
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
    // InternalReactionRules.g:3316:1: rule__ArithmeticVariable__Group__0 : rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1 ;
    public final void rule__ArithmeticVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3320:1: ( rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1 )
            // InternalReactionRules.g:3321:2: rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:3328:1: rule__ArithmeticVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__ArithmeticVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3332:1: ( ( 'var' ) )
            // InternalReactionRules.g:3333:1: ( 'var' )
            {
            // InternalReactionRules.g:3333:1: ( 'var' )
            // InternalReactionRules.g:3334:2: 'var'
            {
             before(grammarAccess.getArithmeticVariableAccess().getVarKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalReactionRules.g:3343:1: rule__ArithmeticVariable__Group__1 : rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2 ;
    public final void rule__ArithmeticVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3347:1: ( rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2 )
            // InternalReactionRules.g:3348:2: rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalReactionRules.g:3355:1: rule__ArithmeticVariable__Group__1__Impl : ( ( rule__ArithmeticVariable__NameAssignment_1 ) ) ;
    public final void rule__ArithmeticVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3359:1: ( ( ( rule__ArithmeticVariable__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3360:1: ( ( rule__ArithmeticVariable__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3360:1: ( ( rule__ArithmeticVariable__NameAssignment_1 ) )
            // InternalReactionRules.g:3361:2: ( rule__ArithmeticVariable__NameAssignment_1 )
            {
             before(grammarAccess.getArithmeticVariableAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3362:2: ( rule__ArithmeticVariable__NameAssignment_1 )
            // InternalReactionRules.g:3362:3: rule__ArithmeticVariable__NameAssignment_1
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
    // InternalReactionRules.g:3370:1: rule__ArithmeticVariable__Group__2 : rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3 ;
    public final void rule__ArithmeticVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3374:1: ( rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3 )
            // InternalReactionRules.g:3375:2: rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalReactionRules.g:3382:1: rule__ArithmeticVariable__Group__2__Impl : ( '=' ) ;
    public final void rule__ArithmeticVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3386:1: ( ( '=' ) )
            // InternalReactionRules.g:3387:1: ( '=' )
            {
            // InternalReactionRules.g:3387:1: ( '=' )
            // InternalReactionRules.g:3388:2: '='
            {
             before(grammarAccess.getArithmeticVariableAccess().getEqualsSignKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalReactionRules.g:3397:1: rule__ArithmeticVariable__Group__3 : rule__ArithmeticVariable__Group__3__Impl ;
    public final void rule__ArithmeticVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3401:1: ( rule__ArithmeticVariable__Group__3__Impl )
            // InternalReactionRules.g:3402:2: rule__ArithmeticVariable__Group__3__Impl
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
    // InternalReactionRules.g:3408:1: rule__ArithmeticVariable__Group__3__Impl : ( ( rule__ArithmeticVariable__ValueAssignment_3 ) ) ;
    public final void rule__ArithmeticVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3412:1: ( ( ( rule__ArithmeticVariable__ValueAssignment_3 ) ) )
            // InternalReactionRules.g:3413:1: ( ( rule__ArithmeticVariable__ValueAssignment_3 ) )
            {
            // InternalReactionRules.g:3413:1: ( ( rule__ArithmeticVariable__ValueAssignment_3 ) )
            // InternalReactionRules.g:3414:2: ( rule__ArithmeticVariable__ValueAssignment_3 )
            {
             before(grammarAccess.getArithmeticVariableAccess().getValueAssignment_3()); 
            // InternalReactionRules.g:3415:2: ( rule__ArithmeticVariable__ValueAssignment_3 )
            // InternalReactionRules.g:3415:3: rule__ArithmeticVariable__ValueAssignment_3
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


    // $ANTLR start "rule__SemiLink__Group__0"
    // InternalReactionRules.g:3424:1: rule__SemiLink__Group__0 : rule__SemiLink__Group__0__Impl rule__SemiLink__Group__1 ;
    public final void rule__SemiLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3428:1: ( rule__SemiLink__Group__0__Impl rule__SemiLink__Group__1 )
            // InternalReactionRules.g:3429:2: rule__SemiLink__Group__0__Impl rule__SemiLink__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalReactionRules.g:3436:1: rule__SemiLink__Group__0__Impl : ( () ) ;
    public final void rule__SemiLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3440:1: ( ( () ) )
            // InternalReactionRules.g:3441:1: ( () )
            {
            // InternalReactionRules.g:3441:1: ( () )
            // InternalReactionRules.g:3442:2: ()
            {
             before(grammarAccess.getSemiLinkAccess().getSemiLinkAction_0()); 
            // InternalReactionRules.g:3443:2: ()
            // InternalReactionRules.g:3443:3: 
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
    // InternalReactionRules.g:3451:1: rule__SemiLink__Group__1 : rule__SemiLink__Group__1__Impl ;
    public final void rule__SemiLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3455:1: ( rule__SemiLink__Group__1__Impl )
            // InternalReactionRules.g:3456:2: rule__SemiLink__Group__1__Impl
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
    // InternalReactionRules.g:3462:1: rule__SemiLink__Group__1__Impl : ( ( rule__SemiLink__NameAssignment_1 ) ) ;
    public final void rule__SemiLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3466:1: ( ( ( rule__SemiLink__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3467:1: ( ( rule__SemiLink__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3467:1: ( ( rule__SemiLink__NameAssignment_1 ) )
            // InternalReactionRules.g:3468:2: ( rule__SemiLink__NameAssignment_1 )
            {
             before(grammarAccess.getSemiLinkAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3469:2: ( rule__SemiLink__NameAssignment_1 )
            // InternalReactionRules.g:3469:3: rule__SemiLink__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SemiLink__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSemiLinkAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalReactionRules.g:3478:1: rule__FreeLink__Group__0 : rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1 ;
    public final void rule__FreeLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3482:1: ( rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1 )
            // InternalReactionRules.g:3483:2: rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalReactionRules.g:3490:1: rule__FreeLink__Group__0__Impl : ( () ) ;
    public final void rule__FreeLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3494:1: ( ( () ) )
            // InternalReactionRules.g:3495:1: ( () )
            {
            // InternalReactionRules.g:3495:1: ( () )
            // InternalReactionRules.g:3496:2: ()
            {
             before(grammarAccess.getFreeLinkAccess().getFreeLinkAction_0()); 
            // InternalReactionRules.g:3497:2: ()
            // InternalReactionRules.g:3497:3: 
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
    // InternalReactionRules.g:3505:1: rule__FreeLink__Group__1 : rule__FreeLink__Group__1__Impl ;
    public final void rule__FreeLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3509:1: ( rule__FreeLink__Group__1__Impl )
            // InternalReactionRules.g:3510:2: rule__FreeLink__Group__1__Impl
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
    // InternalReactionRules.g:3516:1: rule__FreeLink__Group__1__Impl : ( ( rule__FreeLink__NameAssignment_1 ) ) ;
    public final void rule__FreeLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3520:1: ( ( ( rule__FreeLink__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3521:1: ( ( rule__FreeLink__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3521:1: ( ( rule__FreeLink__NameAssignment_1 ) )
            // InternalReactionRules.g:3522:2: ( rule__FreeLink__NameAssignment_1 )
            {
             before(grammarAccess.getFreeLinkAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3523:2: ( rule__FreeLink__NameAssignment_1 )
            // InternalReactionRules.g:3523:3: rule__FreeLink__NameAssignment_1
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
    // InternalReactionRules.g:3532:1: rule__WhatEver__Group__0 : rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1 ;
    public final void rule__WhatEver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3536:1: ( rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1 )
            // InternalReactionRules.g:3537:2: rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalReactionRules.g:3544:1: rule__WhatEver__Group__0__Impl : ( () ) ;
    public final void rule__WhatEver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3548:1: ( ( () ) )
            // InternalReactionRules.g:3549:1: ( () )
            {
            // InternalReactionRules.g:3549:1: ( () )
            // InternalReactionRules.g:3550:2: ()
            {
             before(grammarAccess.getWhatEverAccess().getWhatEverAction_0()); 
            // InternalReactionRules.g:3551:2: ()
            // InternalReactionRules.g:3551:3: 
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
    // InternalReactionRules.g:3559:1: rule__WhatEver__Group__1 : rule__WhatEver__Group__1__Impl ;
    public final void rule__WhatEver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3563:1: ( rule__WhatEver__Group__1__Impl )
            // InternalReactionRules.g:3564:2: rule__WhatEver__Group__1__Impl
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
    // InternalReactionRules.g:3570:1: rule__WhatEver__Group__1__Impl : ( ( rule__WhatEver__NameAssignment_1 ) ) ;
    public final void rule__WhatEver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3574:1: ( ( ( rule__WhatEver__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3575:1: ( ( rule__WhatEver__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3575:1: ( ( rule__WhatEver__NameAssignment_1 ) )
            // InternalReactionRules.g:3576:2: ( rule__WhatEver__NameAssignment_1 )
            {
             before(grammarAccess.getWhatEverAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3577:2: ( rule__WhatEver__NameAssignment_1 )
            // InternalReactionRules.g:3577:3: rule__WhatEver__NameAssignment_1
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


    // $ANTLR start "rule__IndexedLink__Group__0"
    // InternalReactionRules.g:3586:1: rule__IndexedLink__Group__0 : rule__IndexedLink__Group__0__Impl rule__IndexedLink__Group__1 ;
    public final void rule__IndexedLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3590:1: ( rule__IndexedLink__Group__0__Impl rule__IndexedLink__Group__1 )
            // InternalReactionRules.g:3591:2: rule__IndexedLink__Group__0__Impl rule__IndexedLink__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__IndexedLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexedLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexedLink__Group__0"


    // $ANTLR start "rule__IndexedLink__Group__0__Impl"
    // InternalReactionRules.g:3598:1: rule__IndexedLink__Group__0__Impl : ( () ) ;
    public final void rule__IndexedLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3602:1: ( ( () ) )
            // InternalReactionRules.g:3603:1: ( () )
            {
            // InternalReactionRules.g:3603:1: ( () )
            // InternalReactionRules.g:3604:2: ()
            {
             before(grammarAccess.getIndexedLinkAccess().getIndexedLinkAction_0()); 
            // InternalReactionRules.g:3605:2: ()
            // InternalReactionRules.g:3605:3: 
            {
            }

             after(grammarAccess.getIndexedLinkAccess().getIndexedLinkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexedLink__Group__0__Impl"


    // $ANTLR start "rule__IndexedLink__Group__1"
    // InternalReactionRules.g:3613:1: rule__IndexedLink__Group__1 : rule__IndexedLink__Group__1__Impl ;
    public final void rule__IndexedLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3617:1: ( rule__IndexedLink__Group__1__Impl )
            // InternalReactionRules.g:3618:2: rule__IndexedLink__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndexedLink__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexedLink__Group__1"


    // $ANTLR start "rule__IndexedLink__Group__1__Impl"
    // InternalReactionRules.g:3624:1: rule__IndexedLink__Group__1__Impl : ( ( rule__IndexedLink__StateAssignment_1 ) ) ;
    public final void rule__IndexedLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3628:1: ( ( ( rule__IndexedLink__StateAssignment_1 ) ) )
            // InternalReactionRules.g:3629:1: ( ( rule__IndexedLink__StateAssignment_1 ) )
            {
            // InternalReactionRules.g:3629:1: ( ( rule__IndexedLink__StateAssignment_1 ) )
            // InternalReactionRules.g:3630:2: ( rule__IndexedLink__StateAssignment_1 )
            {
             before(grammarAccess.getIndexedLinkAccess().getStateAssignment_1()); 
            // InternalReactionRules.g:3631:2: ( rule__IndexedLink__StateAssignment_1 )
            // InternalReactionRules.g:3631:3: rule__IndexedLink__StateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IndexedLink__StateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIndexedLinkAccess().getStateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexedLink__Group__1__Impl"


    // $ANTLR start "rule__ExactLinkAgent__Group__0"
    // InternalReactionRules.g:3640:1: rule__ExactLinkAgent__Group__0 : rule__ExactLinkAgent__Group__0__Impl rule__ExactLinkAgent__Group__1 ;
    public final void rule__ExactLinkAgent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3644:1: ( rule__ExactLinkAgent__Group__0__Impl rule__ExactLinkAgent__Group__1 )
            // InternalReactionRules.g:3645:2: rule__ExactLinkAgent__Group__0__Impl rule__ExactLinkAgent__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ExactLinkAgent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExactLinkAgent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLinkAgent__Group__0"


    // $ANTLR start "rule__ExactLinkAgent__Group__0__Impl"
    // InternalReactionRules.g:3652:1: rule__ExactLinkAgent__Group__0__Impl : ( () ) ;
    public final void rule__ExactLinkAgent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3656:1: ( ( () ) )
            // InternalReactionRules.g:3657:1: ( () )
            {
            // InternalReactionRules.g:3657:1: ( () )
            // InternalReactionRules.g:3658:2: ()
            {
             before(grammarAccess.getExactLinkAgentAccess().getExactLinkAgentAction_0()); 
            // InternalReactionRules.g:3659:2: ()
            // InternalReactionRules.g:3659:3: 
            {
            }

             after(grammarAccess.getExactLinkAgentAccess().getExactLinkAgentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLinkAgent__Group__0__Impl"


    // $ANTLR start "rule__ExactLinkAgent__Group__1"
    // InternalReactionRules.g:3667:1: rule__ExactLinkAgent__Group__1 : rule__ExactLinkAgent__Group__1__Impl ;
    public final void rule__ExactLinkAgent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3671:1: ( rule__ExactLinkAgent__Group__1__Impl )
            // InternalReactionRules.g:3672:2: rule__ExactLinkAgent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExactLinkAgent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLinkAgent__Group__1"


    // $ANTLR start "rule__ExactLinkAgent__Group__1__Impl"
    // InternalReactionRules.g:3678:1: rule__ExactLinkAgent__Group__1__Impl : ( ( rule__ExactLinkAgent__AgentAssignment_1 ) ) ;
    public final void rule__ExactLinkAgent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3682:1: ( ( ( rule__ExactLinkAgent__AgentAssignment_1 ) ) )
            // InternalReactionRules.g:3683:1: ( ( rule__ExactLinkAgent__AgentAssignment_1 ) )
            {
            // InternalReactionRules.g:3683:1: ( ( rule__ExactLinkAgent__AgentAssignment_1 ) )
            // InternalReactionRules.g:3684:2: ( rule__ExactLinkAgent__AgentAssignment_1 )
            {
             before(grammarAccess.getExactLinkAgentAccess().getAgentAssignment_1()); 
            // InternalReactionRules.g:3685:2: ( rule__ExactLinkAgent__AgentAssignment_1 )
            // InternalReactionRules.g:3685:3: rule__ExactLinkAgent__AgentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExactLinkAgent__AgentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExactLinkAgentAccess().getAgentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLinkAgent__Group__1__Impl"


    // $ANTLR start "rule__ExactLinkSite__Group__0"
    // InternalReactionRules.g:3694:1: rule__ExactLinkSite__Group__0 : rule__ExactLinkSite__Group__0__Impl rule__ExactLinkSite__Group__1 ;
    public final void rule__ExactLinkSite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3698:1: ( rule__ExactLinkSite__Group__0__Impl rule__ExactLinkSite__Group__1 )
            // InternalReactionRules.g:3699:2: rule__ExactLinkSite__Group__0__Impl rule__ExactLinkSite__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ExactLinkSite__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExactLinkSite__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLinkSite__Group__0"


    // $ANTLR start "rule__ExactLinkSite__Group__0__Impl"
    // InternalReactionRules.g:3706:1: rule__ExactLinkSite__Group__0__Impl : ( () ) ;
    public final void rule__ExactLinkSite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3710:1: ( ( () ) )
            // InternalReactionRules.g:3711:1: ( () )
            {
            // InternalReactionRules.g:3711:1: ( () )
            // InternalReactionRules.g:3712:2: ()
            {
             before(grammarAccess.getExactLinkSiteAccess().getExactLinkSiteAction_0()); 
            // InternalReactionRules.g:3713:2: ()
            // InternalReactionRules.g:3713:3: 
            {
            }

             after(grammarAccess.getExactLinkSiteAccess().getExactLinkSiteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLinkSite__Group__0__Impl"


    // $ANTLR start "rule__ExactLinkSite__Group__1"
    // InternalReactionRules.g:3721:1: rule__ExactLinkSite__Group__1 : rule__ExactLinkSite__Group__1__Impl ;
    public final void rule__ExactLinkSite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3725:1: ( rule__ExactLinkSite__Group__1__Impl )
            // InternalReactionRules.g:3726:2: rule__ExactLinkSite__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExactLinkSite__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLinkSite__Group__1"


    // $ANTLR start "rule__ExactLinkSite__Group__1__Impl"
    // InternalReactionRules.g:3732:1: rule__ExactLinkSite__Group__1__Impl : ( ( rule__ExactLinkSite__SiteAssignment_1 ) ) ;
    public final void rule__ExactLinkSite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3736:1: ( ( ( rule__ExactLinkSite__SiteAssignment_1 ) ) )
            // InternalReactionRules.g:3737:1: ( ( rule__ExactLinkSite__SiteAssignment_1 ) )
            {
            // InternalReactionRules.g:3737:1: ( ( rule__ExactLinkSite__SiteAssignment_1 ) )
            // InternalReactionRules.g:3738:2: ( rule__ExactLinkSite__SiteAssignment_1 )
            {
             before(grammarAccess.getExactLinkSiteAccess().getSiteAssignment_1()); 
            // InternalReactionRules.g:3739:2: ( rule__ExactLinkSite__SiteAssignment_1 )
            // InternalReactionRules.g:3739:3: rule__ExactLinkSite__SiteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExactLinkSite__SiteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExactLinkSiteAccess().getSiteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLinkSite__Group__1__Impl"


    // $ANTLR start "rule__ExactLink__Group__0"
    // InternalReactionRules.g:3748:1: rule__ExactLink__Group__0 : rule__ExactLink__Group__0__Impl rule__ExactLink__Group__1 ;
    public final void rule__ExactLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3752:1: ( rule__ExactLink__Group__0__Impl rule__ExactLink__Group__1 )
            // InternalReactionRules.g:3753:2: rule__ExactLink__Group__0__Impl rule__ExactLink__Group__1
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
    // InternalReactionRules.g:3760:1: rule__ExactLink__Group__0__Impl : ( () ) ;
    public final void rule__ExactLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3764:1: ( ( () ) )
            // InternalReactionRules.g:3765:1: ( () )
            {
            // InternalReactionRules.g:3765:1: ( () )
            // InternalReactionRules.g:3766:2: ()
            {
             before(grammarAccess.getExactLinkAccess().getExactLinkAction_0()); 
            // InternalReactionRules.g:3767:2: ()
            // InternalReactionRules.g:3767:3: 
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
    // InternalReactionRules.g:3775:1: rule__ExactLink__Group__1 : rule__ExactLink__Group__1__Impl rule__ExactLink__Group__2 ;
    public final void rule__ExactLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3779:1: ( rule__ExactLink__Group__1__Impl rule__ExactLink__Group__2 )
            // InternalReactionRules.g:3780:2: rule__ExactLink__Group__1__Impl rule__ExactLink__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalReactionRules.g:3787:1: rule__ExactLink__Group__1__Impl : ( ( rule__ExactLink__LinkAgentAssignment_1 ) ) ;
    public final void rule__ExactLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3791:1: ( ( ( rule__ExactLink__LinkAgentAssignment_1 ) ) )
            // InternalReactionRules.g:3792:1: ( ( rule__ExactLink__LinkAgentAssignment_1 ) )
            {
            // InternalReactionRules.g:3792:1: ( ( rule__ExactLink__LinkAgentAssignment_1 ) )
            // InternalReactionRules.g:3793:2: ( rule__ExactLink__LinkAgentAssignment_1 )
            {
             before(grammarAccess.getExactLinkAccess().getLinkAgentAssignment_1()); 
            // InternalReactionRules.g:3794:2: ( rule__ExactLink__LinkAgentAssignment_1 )
            // InternalReactionRules.g:3794:3: rule__ExactLink__LinkAgentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExactLink__LinkAgentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExactLinkAccess().getLinkAgentAssignment_1()); 

            }


            }

        }
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
    // InternalReactionRules.g:3802:1: rule__ExactLink__Group__2 : rule__ExactLink__Group__2__Impl rule__ExactLink__Group__3 ;
    public final void rule__ExactLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3806:1: ( rule__ExactLink__Group__2__Impl rule__ExactLink__Group__3 )
            // InternalReactionRules.g:3807:2: rule__ExactLink__Group__2__Impl rule__ExactLink__Group__3
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
    // InternalReactionRules.g:3814:1: rule__ExactLink__Group__2__Impl : ( '.' ) ;
    public final void rule__ExactLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3818:1: ( ( '.' ) )
            // InternalReactionRules.g:3819:1: ( '.' )
            {
            // InternalReactionRules.g:3819:1: ( '.' )
            // InternalReactionRules.g:3820:2: '.'
            {
             before(grammarAccess.getExactLinkAccess().getFullStopKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalReactionRules.g:3829:1: rule__ExactLink__Group__3 : rule__ExactLink__Group__3__Impl ;
    public final void rule__ExactLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3833:1: ( rule__ExactLink__Group__3__Impl )
            // InternalReactionRules.g:3834:2: rule__ExactLink__Group__3__Impl
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
    // InternalReactionRules.g:3840:1: rule__ExactLink__Group__3__Impl : ( ( rule__ExactLink__LinkSiteAssignment_3 ) ) ;
    public final void rule__ExactLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3844:1: ( ( ( rule__ExactLink__LinkSiteAssignment_3 ) ) )
            // InternalReactionRules.g:3845:1: ( ( rule__ExactLink__LinkSiteAssignment_3 ) )
            {
            // InternalReactionRules.g:3845:1: ( ( rule__ExactLink__LinkSiteAssignment_3 ) )
            // InternalReactionRules.g:3846:2: ( rule__ExactLink__LinkSiteAssignment_3 )
            {
             before(grammarAccess.getExactLinkAccess().getLinkSiteAssignment_3()); 
            // InternalReactionRules.g:3847:2: ( rule__ExactLink__LinkSiteAssignment_3 )
            // InternalReactionRules.g:3847:3: rule__ExactLink__LinkSiteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExactLink__LinkSiteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExactLinkAccess().getLinkSiteAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SiteState__Group__0"
    // InternalReactionRules.g:3856:1: rule__SiteState__Group__0 : rule__SiteState__Group__0__Impl rule__SiteState__Group__1 ;
    public final void rule__SiteState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3860:1: ( rule__SiteState__Group__0__Impl rule__SiteState__Group__1 )
            // InternalReactionRules.g:3861:2: rule__SiteState__Group__0__Impl rule__SiteState__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:3868:1: rule__SiteState__Group__0__Impl : ( () ) ;
    public final void rule__SiteState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3872:1: ( ( () ) )
            // InternalReactionRules.g:3873:1: ( () )
            {
            // InternalReactionRules.g:3873:1: ( () )
            // InternalReactionRules.g:3874:2: ()
            {
             before(grammarAccess.getSiteStateAccess().getSiteStateAction_0()); 
            // InternalReactionRules.g:3875:2: ()
            // InternalReactionRules.g:3875:3: 
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
    // InternalReactionRules.g:3883:1: rule__SiteState__Group__1 : rule__SiteState__Group__1__Impl ;
    public final void rule__SiteState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3887:1: ( rule__SiteState__Group__1__Impl )
            // InternalReactionRules.g:3888:2: rule__SiteState__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SiteState__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalReactionRules.g:3894:1: rule__SiteState__Group__1__Impl : ( ( rule__SiteState__StateAssignment_1 ) ) ;
    public final void rule__SiteState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3898:1: ( ( ( rule__SiteState__StateAssignment_1 ) ) )
            // InternalReactionRules.g:3899:1: ( ( rule__SiteState__StateAssignment_1 ) )
            {
            // InternalReactionRules.g:3899:1: ( ( rule__SiteState__StateAssignment_1 ) )
            // InternalReactionRules.g:3900:2: ( rule__SiteState__StateAssignment_1 )
            {
             before(grammarAccess.getSiteStateAccess().getStateAssignment_1()); 
            // InternalReactionRules.g:3901:2: ( rule__SiteState__StateAssignment_1 )
            // InternalReactionRules.g:3901:3: rule__SiteState__StateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SiteState__StateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSiteStateAccess().getStateAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__LinkState__Group__0"
    // InternalReactionRules.g:3910:1: rule__LinkState__Group__0 : rule__LinkState__Group__0__Impl rule__LinkState__Group__1 ;
    public final void rule__LinkState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3914:1: ( rule__LinkState__Group__0__Impl rule__LinkState__Group__1 )
            // InternalReactionRules.g:3915:2: rule__LinkState__Group__0__Impl rule__LinkState__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalReactionRules.g:3922:1: rule__LinkState__Group__0__Impl : ( () ) ;
    public final void rule__LinkState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3926:1: ( ( () ) )
            // InternalReactionRules.g:3927:1: ( () )
            {
            // InternalReactionRules.g:3927:1: ( () )
            // InternalReactionRules.g:3928:2: ()
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAction_0()); 
            // InternalReactionRules.g:3929:2: ()
            // InternalReactionRules.g:3929:3: 
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
    // InternalReactionRules.g:3937:1: rule__LinkState__Group__1 : rule__LinkState__Group__1__Impl ;
    public final void rule__LinkState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3941:1: ( rule__LinkState__Group__1__Impl )
            // InternalReactionRules.g:3942:2: rule__LinkState__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkState__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalReactionRules.g:3948:1: rule__LinkState__Group__1__Impl : ( ( rule__LinkState__LinkStateAssignment_1 ) ) ;
    public final void rule__LinkState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3952:1: ( ( ( rule__LinkState__LinkStateAssignment_1 ) ) )
            // InternalReactionRules.g:3953:1: ( ( rule__LinkState__LinkStateAssignment_1 ) )
            {
            // InternalReactionRules.g:3953:1: ( ( rule__LinkState__LinkStateAssignment_1 ) )
            // InternalReactionRules.g:3954:2: ( rule__LinkState__LinkStateAssignment_1 )
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAssignment_1()); 
            // InternalReactionRules.g:3955:2: ( rule__LinkState__LinkStateAssignment_1 )
            // InternalReactionRules.g:3955:3: rule__LinkState__LinkStateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LinkState__LinkStateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkStateAccess().getLinkStateAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SitePattern__Group__0"
    // InternalReactionRules.g:3964:1: rule__SitePattern__Group__0 : rule__SitePattern__Group__0__Impl rule__SitePattern__Group__1 ;
    public final void rule__SitePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3968:1: ( rule__SitePattern__Group__0__Impl rule__SitePattern__Group__1 )
            // InternalReactionRules.g:3969:2: rule__SitePattern__Group__0__Impl rule__SitePattern__Group__1
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
    // InternalReactionRules.g:3976:1: rule__SitePattern__Group__0__Impl : ( () ) ;
    public final void rule__SitePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3980:1: ( ( () ) )
            // InternalReactionRules.g:3981:1: ( () )
            {
            // InternalReactionRules.g:3981:1: ( () )
            // InternalReactionRules.g:3982:2: ()
            {
             before(grammarAccess.getSitePatternAccess().getSitePatternAction_0()); 
            // InternalReactionRules.g:3983:2: ()
            // InternalReactionRules.g:3983:3: 
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
    // InternalReactionRules.g:3991:1: rule__SitePattern__Group__1 : rule__SitePattern__Group__1__Impl rule__SitePattern__Group__2 ;
    public final void rule__SitePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3995:1: ( rule__SitePattern__Group__1__Impl rule__SitePattern__Group__2 )
            // InternalReactionRules.g:3996:2: rule__SitePattern__Group__1__Impl rule__SitePattern__Group__2
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
    // InternalReactionRules.g:4003:1: rule__SitePattern__Group__1__Impl : ( ( rule__SitePattern__SiteAssignment_1 ) ) ;
    public final void rule__SitePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4007:1: ( ( ( rule__SitePattern__SiteAssignment_1 ) ) )
            // InternalReactionRules.g:4008:1: ( ( rule__SitePattern__SiteAssignment_1 ) )
            {
            // InternalReactionRules.g:4008:1: ( ( rule__SitePattern__SiteAssignment_1 ) )
            // InternalReactionRules.g:4009:2: ( rule__SitePattern__SiteAssignment_1 )
            {
             before(grammarAccess.getSitePatternAccess().getSiteAssignment_1()); 
            // InternalReactionRules.g:4010:2: ( rule__SitePattern__SiteAssignment_1 )
            // InternalReactionRules.g:4010:3: rule__SitePattern__SiteAssignment_1
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
    // InternalReactionRules.g:4018:1: rule__SitePattern__Group__2 : rule__SitePattern__Group__2__Impl rule__SitePattern__Group__3 ;
    public final void rule__SitePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4022:1: ( rule__SitePattern__Group__2__Impl rule__SitePattern__Group__3 )
            // InternalReactionRules.g:4023:2: rule__SitePattern__Group__2__Impl rule__SitePattern__Group__3
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
    // InternalReactionRules.g:4030:1: rule__SitePattern__Group__2__Impl : ( ( rule__SitePattern__Group_2__0 )? ) ;
    public final void rule__SitePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4034:1: ( ( ( rule__SitePattern__Group_2__0 )? ) )
            // InternalReactionRules.g:4035:1: ( ( rule__SitePattern__Group_2__0 )? )
            {
            // InternalReactionRules.g:4035:1: ( ( rule__SitePattern__Group_2__0 )? )
            // InternalReactionRules.g:4036:2: ( rule__SitePattern__Group_2__0 )?
            {
             before(grammarAccess.getSitePatternAccess().getGroup_2()); 
            // InternalReactionRules.g:4037:2: ( rule__SitePattern__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalReactionRules.g:4037:3: rule__SitePattern__Group_2__0
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
    // InternalReactionRules.g:4045:1: rule__SitePattern__Group__3 : rule__SitePattern__Group__3__Impl rule__SitePattern__Group__4 ;
    public final void rule__SitePattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4049:1: ( rule__SitePattern__Group__3__Impl rule__SitePattern__Group__4 )
            // InternalReactionRules.g:4050:2: rule__SitePattern__Group__3__Impl rule__SitePattern__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__SitePattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SitePattern__Group__4();

            state._fsp--;


            }

        }
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
    // InternalReactionRules.g:4057:1: rule__SitePattern__Group__3__Impl : ( '[' ) ;
    public final void rule__SitePattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4061:1: ( ( '[' ) )
            // InternalReactionRules.g:4062:1: ( '[' )
            {
            // InternalReactionRules.g:4062:1: ( '[' )
            // InternalReactionRules.g:4063:2: '['
            {
             before(grammarAccess.getSitePatternAccess().getLeftSquareBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSitePatternAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SitePattern__Group__4"
    // InternalReactionRules.g:4072:1: rule__SitePattern__Group__4 : rule__SitePattern__Group__4__Impl rule__SitePattern__Group__5 ;
    public final void rule__SitePattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4076:1: ( rule__SitePattern__Group__4__Impl rule__SitePattern__Group__5 )
            // InternalReactionRules.g:4077:2: rule__SitePattern__Group__4__Impl rule__SitePattern__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__SitePattern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SitePattern__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group__4"


    // $ANTLR start "rule__SitePattern__Group__4__Impl"
    // InternalReactionRules.g:4084:1: rule__SitePattern__Group__4__Impl : ( ( rule__SitePattern__LinkStateAssignment_4 ) ) ;
    public final void rule__SitePattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4088:1: ( ( ( rule__SitePattern__LinkStateAssignment_4 ) ) )
            // InternalReactionRules.g:4089:1: ( ( rule__SitePattern__LinkStateAssignment_4 ) )
            {
            // InternalReactionRules.g:4089:1: ( ( rule__SitePattern__LinkStateAssignment_4 ) )
            // InternalReactionRules.g:4090:2: ( rule__SitePattern__LinkStateAssignment_4 )
            {
             before(grammarAccess.getSitePatternAccess().getLinkStateAssignment_4()); 
            // InternalReactionRules.g:4091:2: ( rule__SitePattern__LinkStateAssignment_4 )
            // InternalReactionRules.g:4091:3: rule__SitePattern__LinkStateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SitePattern__LinkStateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSitePatternAccess().getLinkStateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group__4__Impl"


    // $ANTLR start "rule__SitePattern__Group__5"
    // InternalReactionRules.g:4099:1: rule__SitePattern__Group__5 : rule__SitePattern__Group__5__Impl ;
    public final void rule__SitePattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4103:1: ( rule__SitePattern__Group__5__Impl )
            // InternalReactionRules.g:4104:2: rule__SitePattern__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SitePattern__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group__5"


    // $ANTLR start "rule__SitePattern__Group__5__Impl"
    // InternalReactionRules.g:4110:1: rule__SitePattern__Group__5__Impl : ( ']' ) ;
    public final void rule__SitePattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4114:1: ( ( ']' ) )
            // InternalReactionRules.g:4115:1: ( ']' )
            {
            // InternalReactionRules.g:4115:1: ( ']' )
            // InternalReactionRules.g:4116:2: ']'
            {
             before(grammarAccess.getSitePatternAccess().getRightSquareBracketKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSitePatternAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__Group__5__Impl"


    // $ANTLR start "rule__SitePattern__Group_2__0"
    // InternalReactionRules.g:4126:1: rule__SitePattern__Group_2__0 : rule__SitePattern__Group_2__0__Impl rule__SitePattern__Group_2__1 ;
    public final void rule__SitePattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4130:1: ( rule__SitePattern__Group_2__0__Impl rule__SitePattern__Group_2__1 )
            // InternalReactionRules.g:4131:2: rule__SitePattern__Group_2__0__Impl rule__SitePattern__Group_2__1
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
    // InternalReactionRules.g:4138:1: rule__SitePattern__Group_2__0__Impl : ( '{' ) ;
    public final void rule__SitePattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4142:1: ( ( '{' ) )
            // InternalReactionRules.g:4143:1: ( '{' )
            {
            // InternalReactionRules.g:4143:1: ( '{' )
            // InternalReactionRules.g:4144:2: '{'
            {
             before(grammarAccess.getSitePatternAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalReactionRules.g:4153:1: rule__SitePattern__Group_2__1 : rule__SitePattern__Group_2__1__Impl rule__SitePattern__Group_2__2 ;
    public final void rule__SitePattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4157:1: ( rule__SitePattern__Group_2__1__Impl rule__SitePattern__Group_2__2 )
            // InternalReactionRules.g:4158:2: rule__SitePattern__Group_2__1__Impl rule__SitePattern__Group_2__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalReactionRules.g:4165:1: rule__SitePattern__Group_2__1__Impl : ( ( rule__SitePattern__StateAssignment_2_1 ) ) ;
    public final void rule__SitePattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4169:1: ( ( ( rule__SitePattern__StateAssignment_2_1 ) ) )
            // InternalReactionRules.g:4170:1: ( ( rule__SitePattern__StateAssignment_2_1 ) )
            {
            // InternalReactionRules.g:4170:1: ( ( rule__SitePattern__StateAssignment_2_1 ) )
            // InternalReactionRules.g:4171:2: ( rule__SitePattern__StateAssignment_2_1 )
            {
             before(grammarAccess.getSitePatternAccess().getStateAssignment_2_1()); 
            // InternalReactionRules.g:4172:2: ( rule__SitePattern__StateAssignment_2_1 )
            // InternalReactionRules.g:4172:3: rule__SitePattern__StateAssignment_2_1
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
    // InternalReactionRules.g:4180:1: rule__SitePattern__Group_2__2 : rule__SitePattern__Group_2__2__Impl ;
    public final void rule__SitePattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4184:1: ( rule__SitePattern__Group_2__2__Impl )
            // InternalReactionRules.g:4185:2: rule__SitePattern__Group_2__2__Impl
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
    // InternalReactionRules.g:4191:1: rule__SitePattern__Group_2__2__Impl : ( '}' ) ;
    public final void rule__SitePattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4195:1: ( ( '}' ) )
            // InternalReactionRules.g:4196:1: ( '}' )
            {
            // InternalReactionRules.g:4196:1: ( '}' )
            // InternalReactionRules.g:4197:2: '}'
            {
             before(grammarAccess.getSitePatternAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FOLLOW_2); 
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


    // $ANTLR start "rule__SitePatterns__Group__0"
    // InternalReactionRules.g:4207:1: rule__SitePatterns__Group__0 : rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1 ;
    public final void rule__SitePatterns__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4211:1: ( rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1 )
            // InternalReactionRules.g:4212:2: rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:4219:1: rule__SitePatterns__Group__0__Impl : ( () ) ;
    public final void rule__SitePatterns__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4223:1: ( ( () ) )
            // InternalReactionRules.g:4224:1: ( () )
            {
            // InternalReactionRules.g:4224:1: ( () )
            // InternalReactionRules.g:4225:2: ()
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAction_0()); 
            // InternalReactionRules.g:4226:2: ()
            // InternalReactionRules.g:4226:3: 
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
    // InternalReactionRules.g:4234:1: rule__SitePatterns__Group__1 : rule__SitePatterns__Group__1__Impl ;
    public final void rule__SitePatterns__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4238:1: ( rule__SitePatterns__Group__1__Impl )
            // InternalReactionRules.g:4239:2: rule__SitePatterns__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SitePatterns__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalReactionRules.g:4245:1: rule__SitePatterns__Group__1__Impl : ( ( rule__SitePatterns__Group_1__0 )? ) ;
    public final void rule__SitePatterns__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4249:1: ( ( ( rule__SitePatterns__Group_1__0 )? ) )
            // InternalReactionRules.g:4250:1: ( ( rule__SitePatterns__Group_1__0 )? )
            {
            // InternalReactionRules.g:4250:1: ( ( rule__SitePatterns__Group_1__0 )? )
            // InternalReactionRules.g:4251:2: ( rule__SitePatterns__Group_1__0 )?
            {
             before(grammarAccess.getSitePatternsAccess().getGroup_1()); 
            // InternalReactionRules.g:4252:2: ( rule__SitePatterns__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalReactionRules.g:4252:3: rule__SitePatterns__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SitePatterns__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSitePatternsAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SitePatterns__Group_1__0"
    // InternalReactionRules.g:4261:1: rule__SitePatterns__Group_1__0 : rule__SitePatterns__Group_1__0__Impl rule__SitePatterns__Group_1__1 ;
    public final void rule__SitePatterns__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4265:1: ( rule__SitePatterns__Group_1__0__Impl rule__SitePatterns__Group_1__1 )
            // InternalReactionRules.g:4266:2: rule__SitePatterns__Group_1__0__Impl rule__SitePatterns__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__SitePatterns__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SitePatterns__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group_1__0"


    // $ANTLR start "rule__SitePatterns__Group_1__0__Impl"
    // InternalReactionRules.g:4273:1: rule__SitePatterns__Group_1__0__Impl : ( ( rule__SitePatterns__SitePatternsAssignment_1_0 ) ) ;
    public final void rule__SitePatterns__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4277:1: ( ( ( rule__SitePatterns__SitePatternsAssignment_1_0 ) ) )
            // InternalReactionRules.g:4278:1: ( ( rule__SitePatterns__SitePatternsAssignment_1_0 ) )
            {
            // InternalReactionRules.g:4278:1: ( ( rule__SitePatterns__SitePatternsAssignment_1_0 ) )
            // InternalReactionRules.g:4279:2: ( rule__SitePatterns__SitePatternsAssignment_1_0 )
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAssignment_1_0()); 
            // InternalReactionRules.g:4280:2: ( rule__SitePatterns__SitePatternsAssignment_1_0 )
            // InternalReactionRules.g:4280:3: rule__SitePatterns__SitePatternsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SitePatterns__SitePatternsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSitePatternsAccess().getSitePatternsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group_1__0__Impl"


    // $ANTLR start "rule__SitePatterns__Group_1__1"
    // InternalReactionRules.g:4288:1: rule__SitePatterns__Group_1__1 : rule__SitePatterns__Group_1__1__Impl ;
    public final void rule__SitePatterns__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4292:1: ( rule__SitePatterns__Group_1__1__Impl )
            // InternalReactionRules.g:4293:2: rule__SitePatterns__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SitePatterns__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group_1__1"


    // $ANTLR start "rule__SitePatterns__Group_1__1__Impl"
    // InternalReactionRules.g:4299:1: rule__SitePatterns__Group_1__1__Impl : ( ( rule__SitePatterns__Group_1_1__0 )* ) ;
    public final void rule__SitePatterns__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4303:1: ( ( ( rule__SitePatterns__Group_1_1__0 )* ) )
            // InternalReactionRules.g:4304:1: ( ( rule__SitePatterns__Group_1_1__0 )* )
            {
            // InternalReactionRules.g:4304:1: ( ( rule__SitePatterns__Group_1_1__0 )* )
            // InternalReactionRules.g:4305:2: ( rule__SitePatterns__Group_1_1__0 )*
            {
             before(grammarAccess.getSitePatternsAccess().getGroup_1_1()); 
            // InternalReactionRules.g:4306:2: ( rule__SitePatterns__Group_1_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==28) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalReactionRules.g:4306:3: rule__SitePatterns__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SitePatterns__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSitePatternsAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group_1__1__Impl"


    // $ANTLR start "rule__SitePatterns__Group_1_1__0"
    // InternalReactionRules.g:4315:1: rule__SitePatterns__Group_1_1__0 : rule__SitePatterns__Group_1_1__0__Impl rule__SitePatterns__Group_1_1__1 ;
    public final void rule__SitePatterns__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4319:1: ( rule__SitePatterns__Group_1_1__0__Impl rule__SitePatterns__Group_1_1__1 )
            // InternalReactionRules.g:4320:2: rule__SitePatterns__Group_1_1__0__Impl rule__SitePatterns__Group_1_1__1
            {
            pushFollow(FOLLOW_7);
            rule__SitePatterns__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SitePatterns__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group_1_1__0"


    // $ANTLR start "rule__SitePatterns__Group_1_1__0__Impl"
    // InternalReactionRules.g:4327:1: rule__SitePatterns__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__SitePatterns__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4331:1: ( ( ',' ) )
            // InternalReactionRules.g:4332:1: ( ',' )
            {
            // InternalReactionRules.g:4332:1: ( ',' )
            // InternalReactionRules.g:4333:2: ','
            {
             before(grammarAccess.getSitePatternsAccess().getCommaKeyword_1_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSitePatternsAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group_1_1__0__Impl"


    // $ANTLR start "rule__SitePatterns__Group_1_1__1"
    // InternalReactionRules.g:4342:1: rule__SitePatterns__Group_1_1__1 : rule__SitePatterns__Group_1_1__1__Impl ;
    public final void rule__SitePatterns__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4346:1: ( rule__SitePatterns__Group_1_1__1__Impl )
            // InternalReactionRules.g:4347:2: rule__SitePatterns__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SitePatterns__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group_1_1__1"


    // $ANTLR start "rule__SitePatterns__Group_1_1__1__Impl"
    // InternalReactionRules.g:4353:1: rule__SitePatterns__Group_1_1__1__Impl : ( ( rule__SitePatterns__SitePatternsAssignment_1_1_1 ) ) ;
    public final void rule__SitePatterns__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4357:1: ( ( ( rule__SitePatterns__SitePatternsAssignment_1_1_1 ) ) )
            // InternalReactionRules.g:4358:1: ( ( rule__SitePatterns__SitePatternsAssignment_1_1_1 ) )
            {
            // InternalReactionRules.g:4358:1: ( ( rule__SitePatterns__SitePatternsAssignment_1_1_1 ) )
            // InternalReactionRules.g:4359:2: ( rule__SitePatterns__SitePatternsAssignment_1_1_1 )
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAssignment_1_1_1()); 
            // InternalReactionRules.g:4360:2: ( rule__SitePatterns__SitePatternsAssignment_1_1_1 )
            // InternalReactionRules.g:4360:3: rule__SitePatterns__SitePatternsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SitePatterns__SitePatternsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSitePatternsAccess().getSitePatternsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__Group_1_1__1__Impl"


    // $ANTLR start "rule__ValidAgentPattern__Group__0"
    // InternalReactionRules.g:4369:1: rule__ValidAgentPattern__Group__0 : rule__ValidAgentPattern__Group__0__Impl rule__ValidAgentPattern__Group__1 ;
    public final void rule__ValidAgentPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4373:1: ( rule__ValidAgentPattern__Group__0__Impl rule__ValidAgentPattern__Group__1 )
            // InternalReactionRules.g:4374:2: rule__ValidAgentPattern__Group__0__Impl rule__ValidAgentPattern__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:4381:1: rule__ValidAgentPattern__Group__0__Impl : ( () ) ;
    public final void rule__ValidAgentPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4385:1: ( ( () ) )
            // InternalReactionRules.g:4386:1: ( () )
            {
            // InternalReactionRules.g:4386:1: ( () )
            // InternalReactionRules.g:4387:2: ()
            {
             before(grammarAccess.getValidAgentPatternAccess().getValidAgentPatternAction_0()); 
            // InternalReactionRules.g:4388:2: ()
            // InternalReactionRules.g:4388:3: 
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
    // InternalReactionRules.g:4396:1: rule__ValidAgentPattern__Group__1 : rule__ValidAgentPattern__Group__1__Impl rule__ValidAgentPattern__Group__2 ;
    public final void rule__ValidAgentPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4400:1: ( rule__ValidAgentPattern__Group__1__Impl rule__ValidAgentPattern__Group__2 )
            // InternalReactionRules.g:4401:2: rule__ValidAgentPattern__Group__1__Impl rule__ValidAgentPattern__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalReactionRules.g:4408:1: rule__ValidAgentPattern__Group__1__Impl : ( ( rule__ValidAgentPattern__AgentAssignment_1 ) ) ;
    public final void rule__ValidAgentPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4412:1: ( ( ( rule__ValidAgentPattern__AgentAssignment_1 ) ) )
            // InternalReactionRules.g:4413:1: ( ( rule__ValidAgentPattern__AgentAssignment_1 ) )
            {
            // InternalReactionRules.g:4413:1: ( ( rule__ValidAgentPattern__AgentAssignment_1 ) )
            // InternalReactionRules.g:4414:2: ( rule__ValidAgentPattern__AgentAssignment_1 )
            {
             before(grammarAccess.getValidAgentPatternAccess().getAgentAssignment_1()); 
            // InternalReactionRules.g:4415:2: ( rule__ValidAgentPattern__AgentAssignment_1 )
            // InternalReactionRules.g:4415:3: rule__ValidAgentPattern__AgentAssignment_1
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
    // InternalReactionRules.g:4423:1: rule__ValidAgentPattern__Group__2 : rule__ValidAgentPattern__Group__2__Impl rule__ValidAgentPattern__Group__3 ;
    public final void rule__ValidAgentPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4427:1: ( rule__ValidAgentPattern__Group__2__Impl rule__ValidAgentPattern__Group__3 )
            // InternalReactionRules.g:4428:2: rule__ValidAgentPattern__Group__2__Impl rule__ValidAgentPattern__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ValidAgentPattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidAgentPattern__Group__3();

            state._fsp--;


            }

        }
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
    // InternalReactionRules.g:4435:1: rule__ValidAgentPattern__Group__2__Impl : ( '(' ) ;
    public final void rule__ValidAgentPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4439:1: ( ( '(' ) )
            // InternalReactionRules.g:4440:1: ( '(' )
            {
            // InternalReactionRules.g:4440:1: ( '(' )
            // InternalReactionRules.g:4441:2: '('
            {
             before(grammarAccess.getValidAgentPatternAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getValidAgentPatternAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ValidAgentPattern__Group__3"
    // InternalReactionRules.g:4450:1: rule__ValidAgentPattern__Group__3 : rule__ValidAgentPattern__Group__3__Impl rule__ValidAgentPattern__Group__4 ;
    public final void rule__ValidAgentPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4454:1: ( rule__ValidAgentPattern__Group__3__Impl rule__ValidAgentPattern__Group__4 )
            // InternalReactionRules.g:4455:2: rule__ValidAgentPattern__Group__3__Impl rule__ValidAgentPattern__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__ValidAgentPattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidAgentPattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidAgentPattern__Group__3"


    // $ANTLR start "rule__ValidAgentPattern__Group__3__Impl"
    // InternalReactionRules.g:4462:1: rule__ValidAgentPattern__Group__3__Impl : ( ( rule__ValidAgentPattern__SitePatternsAssignment_3 ) ) ;
    public final void rule__ValidAgentPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4466:1: ( ( ( rule__ValidAgentPattern__SitePatternsAssignment_3 ) ) )
            // InternalReactionRules.g:4467:1: ( ( rule__ValidAgentPattern__SitePatternsAssignment_3 ) )
            {
            // InternalReactionRules.g:4467:1: ( ( rule__ValidAgentPattern__SitePatternsAssignment_3 ) )
            // InternalReactionRules.g:4468:2: ( rule__ValidAgentPattern__SitePatternsAssignment_3 )
            {
             before(grammarAccess.getValidAgentPatternAccess().getSitePatternsAssignment_3()); 
            // InternalReactionRules.g:4469:2: ( rule__ValidAgentPattern__SitePatternsAssignment_3 )
            // InternalReactionRules.g:4469:3: rule__ValidAgentPattern__SitePatternsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ValidAgentPattern__SitePatternsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getValidAgentPatternAccess().getSitePatternsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidAgentPattern__Group__3__Impl"


    // $ANTLR start "rule__ValidAgentPattern__Group__4"
    // InternalReactionRules.g:4477:1: rule__ValidAgentPattern__Group__4 : rule__ValidAgentPattern__Group__4__Impl ;
    public final void rule__ValidAgentPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4481:1: ( rule__ValidAgentPattern__Group__4__Impl )
            // InternalReactionRules.g:4482:2: rule__ValidAgentPattern__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidAgentPattern__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidAgentPattern__Group__4"


    // $ANTLR start "rule__ValidAgentPattern__Group__4__Impl"
    // InternalReactionRules.g:4488:1: rule__ValidAgentPattern__Group__4__Impl : ( ')' ) ;
    public final void rule__ValidAgentPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4492:1: ( ( ')' ) )
            // InternalReactionRules.g:4493:1: ( ')' )
            {
            // InternalReactionRules.g:4493:1: ( ')' )
            // InternalReactionRules.g:4494:2: ')'
            {
             before(grammarAccess.getValidAgentPatternAccess().getRightParenthesisKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getValidAgentPatternAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidAgentPattern__Group__4__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalReactionRules.g:4504:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4508:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalReactionRules.g:4509:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalReactionRules.g:4516:1: rule__Pattern__Group__0__Impl : ( () ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4520:1: ( ( () ) )
            // InternalReactionRules.g:4521:1: ( () )
            {
            // InternalReactionRules.g:4521:1: ( () )
            // InternalReactionRules.g:4522:2: ()
            {
             before(grammarAccess.getPatternAccess().getPatternAction_0()); 
            // InternalReactionRules.g:4523:2: ()
            // InternalReactionRules.g:4523:3: 
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
    // InternalReactionRules.g:4531:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4535:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalReactionRules.g:4536:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalReactionRules.g:4543:1: rule__Pattern__Group__1__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4547:1: ( ( '{' ) )
            // InternalReactionRules.g:4548:1: ( '{' )
            {
            // InternalReactionRules.g:4548:1: ( '{' )
            // InternalReactionRules.g:4549:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalReactionRules.g:4558:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4562:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalReactionRules.g:4563:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalReactionRules.g:4570:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__Group_2__0 )? ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4574:1: ( ( ( rule__Pattern__Group_2__0 )? ) )
            // InternalReactionRules.g:4575:1: ( ( rule__Pattern__Group_2__0 )? )
            {
            // InternalReactionRules.g:4575:1: ( ( rule__Pattern__Group_2__0 )? )
            // InternalReactionRules.g:4576:2: ( rule__Pattern__Group_2__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_2()); 
            // InternalReactionRules.g:4577:2: ( rule__Pattern__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==RULE_VOID_PATTERN) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalReactionRules.g:4577:3: rule__Pattern__Group_2__0
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
    // InternalReactionRules.g:4585:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4589:1: ( rule__Pattern__Group__3__Impl )
            // InternalReactionRules.g:4590:2: rule__Pattern__Group__3__Impl
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
    // InternalReactionRules.g:4596:1: rule__Pattern__Group__3__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4600:1: ( ( '}' ) )
            // InternalReactionRules.g:4601:1: ( '}' )
            {
            // InternalReactionRules.g:4601:1: ( '}' )
            // InternalReactionRules.g:4602:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalReactionRules.g:4612:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4616:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalReactionRules.g:4617:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalReactionRules.g:4624:1: rule__Pattern__Group_2__0__Impl : ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4628:1: ( ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) ) )
            // InternalReactionRules.g:4629:1: ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) )
            {
            // InternalReactionRules.g:4629:1: ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) )
            // InternalReactionRules.g:4630:2: ( rule__Pattern__AgentPatternsAssignment_2_0 )
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAssignment_2_0()); 
            // InternalReactionRules.g:4631:2: ( rule__Pattern__AgentPatternsAssignment_2_0 )
            // InternalReactionRules.g:4631:3: rule__Pattern__AgentPatternsAssignment_2_0
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
    // InternalReactionRules.g:4639:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4643:1: ( rule__Pattern__Group_2__1__Impl )
            // InternalReactionRules.g:4644:2: rule__Pattern__Group_2__1__Impl
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
    // InternalReactionRules.g:4650:1: rule__Pattern__Group_2__1__Impl : ( ( rule__Pattern__Group_2_1__0 )* ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4654:1: ( ( ( rule__Pattern__Group_2_1__0 )* ) )
            // InternalReactionRules.g:4655:1: ( ( rule__Pattern__Group_2_1__0 )* )
            {
            // InternalReactionRules.g:4655:1: ( ( rule__Pattern__Group_2_1__0 )* )
            // InternalReactionRules.g:4656:2: ( rule__Pattern__Group_2_1__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1()); 
            // InternalReactionRules.g:4657:2: ( rule__Pattern__Group_2_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==28) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalReactionRules.g:4657:3: rule__Pattern__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Pattern__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalReactionRules.g:4666:1: rule__Pattern__Group_2_1__0 : rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 ;
    public final void rule__Pattern__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4670:1: ( rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 )
            // InternalReactionRules.g:4671:2: rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalReactionRules.g:4678:1: rule__Pattern__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4682:1: ( ( ',' ) )
            // InternalReactionRules.g:4683:1: ( ',' )
            {
            // InternalReactionRules.g:4683:1: ( ',' )
            // InternalReactionRules.g:4684:2: ','
            {
             before(grammarAccess.getPatternAccess().getCommaKeyword_2_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalReactionRules.g:4693:1: rule__Pattern__Group_2_1__1 : rule__Pattern__Group_2_1__1__Impl ;
    public final void rule__Pattern__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4697:1: ( rule__Pattern__Group_2_1__1__Impl )
            // InternalReactionRules.g:4698:2: rule__Pattern__Group_2_1__1__Impl
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
    // InternalReactionRules.g:4704:1: rule__Pattern__Group_2_1__1__Impl : ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) ) ;
    public final void rule__Pattern__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4708:1: ( ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) ) )
            // InternalReactionRules.g:4709:1: ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) )
            {
            // InternalReactionRules.g:4709:1: ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) )
            // InternalReactionRules.g:4710:2: ( rule__Pattern__AgentPatternsAssignment_2_1_1 )
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAssignment_2_1_1()); 
            // InternalReactionRules.g:4711:2: ( rule__Pattern__AgentPatternsAssignment_2_1_1 )
            // InternalReactionRules.g:4711:3: rule__Pattern__AgentPatternsAssignment_2_1_1
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
    // InternalReactionRules.g:4720:1: rule__Observation__Group__0 : rule__Observation__Group__0__Impl rule__Observation__Group__1 ;
    public final void rule__Observation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4724:1: ( rule__Observation__Group__0__Impl rule__Observation__Group__1 )
            // InternalReactionRules.g:4725:2: rule__Observation__Group__0__Impl rule__Observation__Group__1
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
    // InternalReactionRules.g:4732:1: rule__Observation__Group__0__Impl : ( 'obs' ) ;
    public final void rule__Observation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4736:1: ( ( 'obs' ) )
            // InternalReactionRules.g:4737:1: ( 'obs' )
            {
            // InternalReactionRules.g:4737:1: ( 'obs' )
            // InternalReactionRules.g:4738:2: 'obs'
            {
             before(grammarAccess.getObservationAccess().getObsKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalReactionRules.g:4747:1: rule__Observation__Group__1 : rule__Observation__Group__1__Impl rule__Observation__Group__2 ;
    public final void rule__Observation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4751:1: ( rule__Observation__Group__1__Impl rule__Observation__Group__2 )
            // InternalReactionRules.g:4752:2: rule__Observation__Group__1__Impl rule__Observation__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalReactionRules.g:4759:1: rule__Observation__Group__1__Impl : ( ( rule__Observation__NameAssignment_1 ) ) ;
    public final void rule__Observation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4763:1: ( ( ( rule__Observation__NameAssignment_1 ) ) )
            // InternalReactionRules.g:4764:1: ( ( rule__Observation__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:4764:1: ( ( rule__Observation__NameAssignment_1 ) )
            // InternalReactionRules.g:4765:2: ( rule__Observation__NameAssignment_1 )
            {
             before(grammarAccess.getObservationAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:4766:2: ( rule__Observation__NameAssignment_1 )
            // InternalReactionRules.g:4766:3: rule__Observation__NameAssignment_1
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
    // InternalReactionRules.g:4774:1: rule__Observation__Group__2 : rule__Observation__Group__2__Impl ;
    public final void rule__Observation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4778:1: ( rule__Observation__Group__2__Impl )
            // InternalReactionRules.g:4779:2: rule__Observation__Group__2__Impl
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
    // InternalReactionRules.g:4785:1: rule__Observation__Group__2__Impl : ( ( rule__Observation__ObservationPatternAssignment_2 ) ) ;
    public final void rule__Observation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4789:1: ( ( ( rule__Observation__ObservationPatternAssignment_2 ) ) )
            // InternalReactionRules.g:4790:1: ( ( rule__Observation__ObservationPatternAssignment_2 ) )
            {
            // InternalReactionRules.g:4790:1: ( ( rule__Observation__ObservationPatternAssignment_2 ) )
            // InternalReactionRules.g:4791:2: ( rule__Observation__ObservationPatternAssignment_2 )
            {
             before(grammarAccess.getObservationAccess().getObservationPatternAssignment_2()); 
            // InternalReactionRules.g:4792:2: ( rule__Observation__ObservationPatternAssignment_2 )
            // InternalReactionRules.g:4792:3: rule__Observation__ObservationPatternAssignment_2
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
    // InternalReactionRules.g:4801:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4805:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // InternalReactionRules.g:4806:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
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
    // InternalReactionRules.g:4813:1: rule__Initial__Group__0__Impl : ( 'init' ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4817:1: ( ( 'init' ) )
            // InternalReactionRules.g:4818:1: ( 'init' )
            {
            // InternalReactionRules.g:4818:1: ( 'init' )
            // InternalReactionRules.g:4819:2: 'init'
            {
             before(grammarAccess.getInitialAccess().getInitKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalReactionRules.g:4828:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4832:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // InternalReactionRules.g:4833:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalReactionRules.g:4840:1: rule__Initial__Group__1__Impl : ( ( rule__Initial__NameAssignment_1 ) ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4844:1: ( ( ( rule__Initial__NameAssignment_1 ) ) )
            // InternalReactionRules.g:4845:1: ( ( rule__Initial__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:4845:1: ( ( rule__Initial__NameAssignment_1 ) )
            // InternalReactionRules.g:4846:2: ( rule__Initial__NameAssignment_1 )
            {
             before(grammarAccess.getInitialAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:4847:2: ( rule__Initial__NameAssignment_1 )
            // InternalReactionRules.g:4847:3: rule__Initial__NameAssignment_1
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
    // InternalReactionRules.g:4855:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl rule__Initial__Group__3 ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4859:1: ( rule__Initial__Group__2__Impl rule__Initial__Group__3 )
            // InternalReactionRules.g:4860:2: rule__Initial__Group__2__Impl rule__Initial__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalReactionRules.g:4867:1: rule__Initial__Group__2__Impl : ( ( rule__Initial__CountAssignment_2 ) ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4871:1: ( ( ( rule__Initial__CountAssignment_2 ) ) )
            // InternalReactionRules.g:4872:1: ( ( rule__Initial__CountAssignment_2 ) )
            {
            // InternalReactionRules.g:4872:1: ( ( rule__Initial__CountAssignment_2 ) )
            // InternalReactionRules.g:4873:2: ( rule__Initial__CountAssignment_2 )
            {
             before(grammarAccess.getInitialAccess().getCountAssignment_2()); 
            // InternalReactionRules.g:4874:2: ( rule__Initial__CountAssignment_2 )
            // InternalReactionRules.g:4874:3: rule__Initial__CountAssignment_2
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
    // InternalReactionRules.g:4882:1: rule__Initial__Group__3 : rule__Initial__Group__3__Impl ;
    public final void rule__Initial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4886:1: ( rule__Initial__Group__3__Impl )
            // InternalReactionRules.g:4887:2: rule__Initial__Group__3__Impl
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
    // InternalReactionRules.g:4893:1: rule__Initial__Group__3__Impl : ( ( rule__Initial__InitialPatternAssignment_3 ) ) ;
    public final void rule__Initial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4897:1: ( ( ( rule__Initial__InitialPatternAssignment_3 ) ) )
            // InternalReactionRules.g:4898:1: ( ( rule__Initial__InitialPatternAssignment_3 ) )
            {
            // InternalReactionRules.g:4898:1: ( ( rule__Initial__InitialPatternAssignment_3 ) )
            // InternalReactionRules.g:4899:2: ( rule__Initial__InitialPatternAssignment_3 )
            {
             before(grammarAccess.getInitialAccess().getInitialPatternAssignment_3()); 
            // InternalReactionRules.g:4900:2: ( rule__Initial__InitialPatternAssignment_3 )
            // InternalReactionRules.g:4900:3: rule__Initial__InitialPatternAssignment_3
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
    // InternalReactionRules.g:4909:1: rule__RuleVariables__Group__0 : rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1 ;
    public final void rule__RuleVariables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4913:1: ( rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1 )
            // InternalReactionRules.g:4914:2: rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalReactionRules.g:4921:1: rule__RuleVariables__Group__0__Impl : ( ( rule__RuleVariables__VariablesAssignment_0 ) ) ;
    public final void rule__RuleVariables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4925:1: ( ( ( rule__RuleVariables__VariablesAssignment_0 ) ) )
            // InternalReactionRules.g:4926:1: ( ( rule__RuleVariables__VariablesAssignment_0 ) )
            {
            // InternalReactionRules.g:4926:1: ( ( rule__RuleVariables__VariablesAssignment_0 ) )
            // InternalReactionRules.g:4927:2: ( rule__RuleVariables__VariablesAssignment_0 )
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesAssignment_0()); 
            // InternalReactionRules.g:4928:2: ( rule__RuleVariables__VariablesAssignment_0 )
            // InternalReactionRules.g:4928:3: rule__RuleVariables__VariablesAssignment_0
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
    // InternalReactionRules.g:4936:1: rule__RuleVariables__Group__1 : rule__RuleVariables__Group__1__Impl ;
    public final void rule__RuleVariables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4940:1: ( rule__RuleVariables__Group__1__Impl )
            // InternalReactionRules.g:4941:2: rule__RuleVariables__Group__1__Impl
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
    // InternalReactionRules.g:4947:1: rule__RuleVariables__Group__1__Impl : ( ( rule__RuleVariables__Group_1__0 )* ) ;
    public final void rule__RuleVariables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4951:1: ( ( ( rule__RuleVariables__Group_1__0 )* ) )
            // InternalReactionRules.g:4952:1: ( ( rule__RuleVariables__Group_1__0 )* )
            {
            // InternalReactionRules.g:4952:1: ( ( rule__RuleVariables__Group_1__0 )* )
            // InternalReactionRules.g:4953:2: ( rule__RuleVariables__Group_1__0 )*
            {
             before(grammarAccess.getRuleVariablesAccess().getGroup_1()); 
            // InternalReactionRules.g:4954:2: ( rule__RuleVariables__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==28) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalReactionRules.g:4954:3: rule__RuleVariables__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__RuleVariables__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalReactionRules.g:4963:1: rule__RuleVariables__Group_1__0 : rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1 ;
    public final void rule__RuleVariables__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4967:1: ( rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1 )
            // InternalReactionRules.g:4968:2: rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalReactionRules.g:4975:1: rule__RuleVariables__Group_1__0__Impl : ( ',' ) ;
    public final void rule__RuleVariables__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4979:1: ( ( ',' ) )
            // InternalReactionRules.g:4980:1: ( ',' )
            {
            // InternalReactionRules.g:4980:1: ( ',' )
            // InternalReactionRules.g:4981:2: ','
            {
             before(grammarAccess.getRuleVariablesAccess().getCommaKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalReactionRules.g:4990:1: rule__RuleVariables__Group_1__1 : rule__RuleVariables__Group_1__1__Impl ;
    public final void rule__RuleVariables__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4994:1: ( rule__RuleVariables__Group_1__1__Impl )
            // InternalReactionRules.g:4995:2: rule__RuleVariables__Group_1__1__Impl
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
    // InternalReactionRules.g:5001:1: rule__RuleVariables__Group_1__1__Impl : ( ( rule__RuleVariables__VariablesAssignment_1_1 ) ) ;
    public final void rule__RuleVariables__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5005:1: ( ( ( rule__RuleVariables__VariablesAssignment_1_1 ) ) )
            // InternalReactionRules.g:5006:1: ( ( rule__RuleVariables__VariablesAssignment_1_1 ) )
            {
            // InternalReactionRules.g:5006:1: ( ( rule__RuleVariables__VariablesAssignment_1_1 ) )
            // InternalReactionRules.g:5007:2: ( rule__RuleVariables__VariablesAssignment_1_1 )
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesAssignment_1_1()); 
            // InternalReactionRules.g:5008:2: ( rule__RuleVariables__VariablesAssignment_1_1 )
            // InternalReactionRules.g:5008:3: rule__RuleVariables__VariablesAssignment_1_1
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
    // InternalReactionRules.g:5017:1: rule__UnidirectionalRule__Group__0 : rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1 ;
    public final void rule__UnidirectionalRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5021:1: ( rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1 )
            // InternalReactionRules.g:5022:2: rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalReactionRules.g:5029:1: rule__UnidirectionalRule__Group__0__Impl : ( ( rule__UnidirectionalRule__LhsAssignment_0 ) ) ;
    public final void rule__UnidirectionalRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5033:1: ( ( ( rule__UnidirectionalRule__LhsAssignment_0 ) ) )
            // InternalReactionRules.g:5034:1: ( ( rule__UnidirectionalRule__LhsAssignment_0 ) )
            {
            // InternalReactionRules.g:5034:1: ( ( rule__UnidirectionalRule__LhsAssignment_0 ) )
            // InternalReactionRules.g:5035:2: ( rule__UnidirectionalRule__LhsAssignment_0 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getLhsAssignment_0()); 
            // InternalReactionRules.g:5036:2: ( rule__UnidirectionalRule__LhsAssignment_0 )
            // InternalReactionRules.g:5036:3: rule__UnidirectionalRule__LhsAssignment_0
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
    // InternalReactionRules.g:5044:1: rule__UnidirectionalRule__Group__1 : rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2 ;
    public final void rule__UnidirectionalRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5048:1: ( rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2 )
            // InternalReactionRules.g:5049:2: rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalReactionRules.g:5056:1: rule__UnidirectionalRule__Group__1__Impl : ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) ) ;
    public final void rule__UnidirectionalRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5060:1: ( ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) ) )
            // InternalReactionRules.g:5061:1: ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) )
            {
            // InternalReactionRules.g:5061:1: ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) )
            // InternalReactionRules.g:5062:2: ( rule__UnidirectionalRule__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getOperatorAssignment_1()); 
            // InternalReactionRules.g:5063:2: ( rule__UnidirectionalRule__OperatorAssignment_1 )
            // InternalReactionRules.g:5063:3: rule__UnidirectionalRule__OperatorAssignment_1
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
    // InternalReactionRules.g:5071:1: rule__UnidirectionalRule__Group__2 : rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3 ;
    public final void rule__UnidirectionalRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5075:1: ( rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3 )
            // InternalReactionRules.g:5076:2: rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalReactionRules.g:5083:1: rule__UnidirectionalRule__Group__2__Impl : ( ( rule__UnidirectionalRule__RhsAssignment_2 ) ) ;
    public final void rule__UnidirectionalRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5087:1: ( ( ( rule__UnidirectionalRule__RhsAssignment_2 ) ) )
            // InternalReactionRules.g:5088:1: ( ( rule__UnidirectionalRule__RhsAssignment_2 ) )
            {
            // InternalReactionRules.g:5088:1: ( ( rule__UnidirectionalRule__RhsAssignment_2 ) )
            // InternalReactionRules.g:5089:2: ( rule__UnidirectionalRule__RhsAssignment_2 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getRhsAssignment_2()); 
            // InternalReactionRules.g:5090:2: ( rule__UnidirectionalRule__RhsAssignment_2 )
            // InternalReactionRules.g:5090:3: rule__UnidirectionalRule__RhsAssignment_2
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
    // InternalReactionRules.g:5098:1: rule__UnidirectionalRule__Group__3 : rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4 ;
    public final void rule__UnidirectionalRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5102:1: ( rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4 )
            // InternalReactionRules.g:5103:2: rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalReactionRules.g:5110:1: rule__UnidirectionalRule__Group__3__Impl : ( RULE_AT ) ;
    public final void rule__UnidirectionalRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5114:1: ( ( RULE_AT ) )
            // InternalReactionRules.g:5115:1: ( RULE_AT )
            {
            // InternalReactionRules.g:5115:1: ( RULE_AT )
            // InternalReactionRules.g:5116:2: RULE_AT
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
    // InternalReactionRules.g:5125:1: rule__UnidirectionalRule__Group__4 : rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5 ;
    public final void rule__UnidirectionalRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5129:1: ( rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5 )
            // InternalReactionRules.g:5130:2: rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalReactionRules.g:5137:1: rule__UnidirectionalRule__Group__4__Impl : ( '[' ) ;
    public final void rule__UnidirectionalRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5141:1: ( ( '[' ) )
            // InternalReactionRules.g:5142:1: ( '[' )
            {
            // InternalReactionRules.g:5142:1: ( '[' )
            // InternalReactionRules.g:5143:2: '['
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getLeftSquareBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalReactionRules.g:5152:1: rule__UnidirectionalRule__Group__5 : rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6 ;
    public final void rule__UnidirectionalRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5156:1: ( rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6 )
            // InternalReactionRules.g:5157:2: rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalReactionRules.g:5164:1: rule__UnidirectionalRule__Group__5__Impl : ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) ) ;
    public final void rule__UnidirectionalRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5168:1: ( ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) ) )
            // InternalReactionRules.g:5169:1: ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) )
            {
            // InternalReactionRules.g:5169:1: ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) )
            // InternalReactionRules.g:5170:2: ( rule__UnidirectionalRule__VariablesAssignment_5 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getVariablesAssignment_5()); 
            // InternalReactionRules.g:5171:2: ( rule__UnidirectionalRule__VariablesAssignment_5 )
            // InternalReactionRules.g:5171:3: rule__UnidirectionalRule__VariablesAssignment_5
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
    // InternalReactionRules.g:5179:1: rule__UnidirectionalRule__Group__6 : rule__UnidirectionalRule__Group__6__Impl ;
    public final void rule__UnidirectionalRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5183:1: ( rule__UnidirectionalRule__Group__6__Impl )
            // InternalReactionRules.g:5184:2: rule__UnidirectionalRule__Group__6__Impl
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
    // InternalReactionRules.g:5190:1: rule__UnidirectionalRule__Group__6__Impl : ( ']' ) ;
    public final void rule__UnidirectionalRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5194:1: ( ( ']' ) )
            // InternalReactionRules.g:5195:1: ( ']' )
            {
            // InternalReactionRules.g:5195:1: ( ']' )
            // InternalReactionRules.g:5196:2: ']'
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getRightSquareBracketKeyword_6()); 
            match(input,35,FOLLOW_2); 
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
    // InternalReactionRules.g:5206:1: rule__BidirectionalRule__Group__0 : rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1 ;
    public final void rule__BidirectionalRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5210:1: ( rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1 )
            // InternalReactionRules.g:5211:2: rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalReactionRules.g:5218:1: rule__BidirectionalRule__Group__0__Impl : ( ( rule__BidirectionalRule__LhsAssignment_0 ) ) ;
    public final void rule__BidirectionalRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5222:1: ( ( ( rule__BidirectionalRule__LhsAssignment_0 ) ) )
            // InternalReactionRules.g:5223:1: ( ( rule__BidirectionalRule__LhsAssignment_0 ) )
            {
            // InternalReactionRules.g:5223:1: ( ( rule__BidirectionalRule__LhsAssignment_0 ) )
            // InternalReactionRules.g:5224:2: ( rule__BidirectionalRule__LhsAssignment_0 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getLhsAssignment_0()); 
            // InternalReactionRules.g:5225:2: ( rule__BidirectionalRule__LhsAssignment_0 )
            // InternalReactionRules.g:5225:3: rule__BidirectionalRule__LhsAssignment_0
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
    // InternalReactionRules.g:5233:1: rule__BidirectionalRule__Group__1 : rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2 ;
    public final void rule__BidirectionalRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5237:1: ( rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2 )
            // InternalReactionRules.g:5238:2: rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalReactionRules.g:5245:1: rule__BidirectionalRule__Group__1__Impl : ( ( rule__BidirectionalRule__OperatorAssignment_1 ) ) ;
    public final void rule__BidirectionalRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5249:1: ( ( ( rule__BidirectionalRule__OperatorAssignment_1 ) ) )
            // InternalReactionRules.g:5250:1: ( ( rule__BidirectionalRule__OperatorAssignment_1 ) )
            {
            // InternalReactionRules.g:5250:1: ( ( rule__BidirectionalRule__OperatorAssignment_1 ) )
            // InternalReactionRules.g:5251:2: ( rule__BidirectionalRule__OperatorAssignment_1 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getOperatorAssignment_1()); 
            // InternalReactionRules.g:5252:2: ( rule__BidirectionalRule__OperatorAssignment_1 )
            // InternalReactionRules.g:5252:3: rule__BidirectionalRule__OperatorAssignment_1
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
    // InternalReactionRules.g:5260:1: rule__BidirectionalRule__Group__2 : rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3 ;
    public final void rule__BidirectionalRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5264:1: ( rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3 )
            // InternalReactionRules.g:5265:2: rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalReactionRules.g:5272:1: rule__BidirectionalRule__Group__2__Impl : ( ( rule__BidirectionalRule__RhsAssignment_2 ) ) ;
    public final void rule__BidirectionalRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5276:1: ( ( ( rule__BidirectionalRule__RhsAssignment_2 ) ) )
            // InternalReactionRules.g:5277:1: ( ( rule__BidirectionalRule__RhsAssignment_2 ) )
            {
            // InternalReactionRules.g:5277:1: ( ( rule__BidirectionalRule__RhsAssignment_2 ) )
            // InternalReactionRules.g:5278:2: ( rule__BidirectionalRule__RhsAssignment_2 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getRhsAssignment_2()); 
            // InternalReactionRules.g:5279:2: ( rule__BidirectionalRule__RhsAssignment_2 )
            // InternalReactionRules.g:5279:3: rule__BidirectionalRule__RhsAssignment_2
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
    // InternalReactionRules.g:5287:1: rule__BidirectionalRule__Group__3 : rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4 ;
    public final void rule__BidirectionalRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5291:1: ( rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4 )
            // InternalReactionRules.g:5292:2: rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalReactionRules.g:5299:1: rule__BidirectionalRule__Group__3__Impl : ( RULE_AT ) ;
    public final void rule__BidirectionalRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5303:1: ( ( RULE_AT ) )
            // InternalReactionRules.g:5304:1: ( RULE_AT )
            {
            // InternalReactionRules.g:5304:1: ( RULE_AT )
            // InternalReactionRules.g:5305:2: RULE_AT
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
    // InternalReactionRules.g:5314:1: rule__BidirectionalRule__Group__4 : rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5 ;
    public final void rule__BidirectionalRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5318:1: ( rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5 )
            // InternalReactionRules.g:5319:2: rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalReactionRules.g:5326:1: rule__BidirectionalRule__Group__4__Impl : ( '[' ) ;
    public final void rule__BidirectionalRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5330:1: ( ( '[' ) )
            // InternalReactionRules.g:5331:1: ( '[' )
            {
            // InternalReactionRules.g:5331:1: ( '[' )
            // InternalReactionRules.g:5332:2: '['
            {
             before(grammarAccess.getBidirectionalRuleAccess().getLeftSquareBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalReactionRules.g:5341:1: rule__BidirectionalRule__Group__5 : rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6 ;
    public final void rule__BidirectionalRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5345:1: ( rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6 )
            // InternalReactionRules.g:5346:2: rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalReactionRules.g:5353:1: rule__BidirectionalRule__Group__5__Impl : ( ( rule__BidirectionalRule__VariablesAssignment_5 ) ) ;
    public final void rule__BidirectionalRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5357:1: ( ( ( rule__BidirectionalRule__VariablesAssignment_5 ) ) )
            // InternalReactionRules.g:5358:1: ( ( rule__BidirectionalRule__VariablesAssignment_5 ) )
            {
            // InternalReactionRules.g:5358:1: ( ( rule__BidirectionalRule__VariablesAssignment_5 ) )
            // InternalReactionRules.g:5359:2: ( rule__BidirectionalRule__VariablesAssignment_5 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getVariablesAssignment_5()); 
            // InternalReactionRules.g:5360:2: ( rule__BidirectionalRule__VariablesAssignment_5 )
            // InternalReactionRules.g:5360:3: rule__BidirectionalRule__VariablesAssignment_5
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
    // InternalReactionRules.g:5368:1: rule__BidirectionalRule__Group__6 : rule__BidirectionalRule__Group__6__Impl ;
    public final void rule__BidirectionalRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5372:1: ( rule__BidirectionalRule__Group__6__Impl )
            // InternalReactionRules.g:5373:2: rule__BidirectionalRule__Group__6__Impl
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
    // InternalReactionRules.g:5379:1: rule__BidirectionalRule__Group__6__Impl : ( ']' ) ;
    public final void rule__BidirectionalRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5383:1: ( ( ']' ) )
            // InternalReactionRules.g:5384:1: ( ']' )
            {
            // InternalReactionRules.g:5384:1: ( ']' )
            // InternalReactionRules.g:5385:2: ']'
            {
             before(grammarAccess.getBidirectionalRuleAccess().getRightSquareBracketKeyword_6()); 
            match(input,35,FOLLOW_2); 
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
    // InternalReactionRules.g:5395:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5399:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalReactionRules.g:5400:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalReactionRules.g:5407:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5411:1: ( ( 'rule' ) )
            // InternalReactionRules.g:5412:1: ( 'rule' )
            {
            // InternalReactionRules.g:5412:1: ( 'rule' )
            // InternalReactionRules.g:5413:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalReactionRules.g:5422:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5426:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalReactionRules.g:5427:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalReactionRules.g:5434:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5438:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalReactionRules.g:5439:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:5439:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalReactionRules.g:5440:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:5441:2: ( rule__Rule__NameAssignment_1 )
            // InternalReactionRules.g:5441:3: rule__Rule__NameAssignment_1
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
    // InternalReactionRules.g:5449:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5453:1: ( rule__Rule__Group__2__Impl )
            // InternalReactionRules.g:5454:2: rule__Rule__Group__2__Impl
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
    // InternalReactionRules.g:5460:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__RuleAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5464:1: ( ( ( rule__Rule__RuleAssignment_2 ) ) )
            // InternalReactionRules.g:5465:1: ( ( rule__Rule__RuleAssignment_2 ) )
            {
            // InternalReactionRules.g:5465:1: ( ( rule__Rule__RuleAssignment_2 ) )
            // InternalReactionRules.g:5466:2: ( rule__Rule__RuleAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getRuleAssignment_2()); 
            // InternalReactionRules.g:5467:2: ( rule__Rule__RuleAssignment_2 )
            // InternalReactionRules.g:5467:3: rule__Rule__RuleAssignment_2
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


    // $ANTLR start "rule__ReactionRuleModel__ModelAssignment_0"
    // InternalReactionRules.g:5476:1: rule__ReactionRuleModel__ModelAssignment_0 : ( ruleModel ) ;
    public final void rule__ReactionRuleModel__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5480:1: ( ( ruleModel ) )
            // InternalReactionRules.g:5481:2: ( ruleModel )
            {
            // InternalReactionRules.g:5481:2: ( ruleModel )
            // InternalReactionRules.g:5482:3: ruleModel
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


    // $ANTLR start "rule__ReactionRuleModel__ReactionContainerAssignment_1"
    // InternalReactionRules.g:5491:1: rule__ReactionRuleModel__ReactionContainerAssignment_1 : ( ruleReactionContainer ) ;
    public final void rule__ReactionRuleModel__ReactionContainerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5495:1: ( ( ruleReactionContainer ) )
            // InternalReactionRules.g:5496:2: ( ruleReactionContainer )
            {
            // InternalReactionRules.g:5496:2: ( ruleReactionContainer )
            // InternalReactionRules.g:5497:3: ruleReactionContainer
            {
             before(grammarAccess.getReactionRuleModelAccess().getReactionContainerReactionContainerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReactionContainer();

            state._fsp--;

             after(grammarAccess.getReactionRuleModelAccess().getReactionContainerReactionContainerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionRuleModel__ReactionContainerAssignment_1"


    // $ANTLR start "rule__ReactionRuleModel__ReactionPropertiesAssignment_2"
    // InternalReactionRules.g:5506:1: rule__ReactionRuleModel__ReactionPropertiesAssignment_2 : ( ruleReactionProperty ) ;
    public final void rule__ReactionRuleModel__ReactionPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5510:1: ( ( ruleReactionProperty ) )
            // InternalReactionRules.g:5511:2: ( ruleReactionProperty )
            {
            // InternalReactionRules.g:5511:2: ( ruleReactionProperty )
            // InternalReactionRules.g:5512:3: ruleReactionProperty
            {
             before(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesReactionPropertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReactionProperty();

            state._fsp--;

             after(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesReactionPropertyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionRuleModel__ReactionPropertiesAssignment_2"


    // $ANTLR start "rule__ModelUri__UriAssignment_1"
    // InternalReactionRules.g:5521:1: rule__ModelUri__UriAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ModelUri__UriAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5525:1: ( ( RULE_STRING ) )
            // InternalReactionRules.g:5526:2: ( RULE_STRING )
            {
            // InternalReactionRules.g:5526:2: ( RULE_STRING )
            // InternalReactionRules.g:5527:3: RULE_STRING
            {
             before(grammarAccess.getModelUriAccess().getUriSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelUriAccess().getUriSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelUri__UriAssignment_1"


    // $ANTLR start "rule__ModelPath__PathAssignment_1"
    // InternalReactionRules.g:5536:1: rule__ModelPath__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ModelPath__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5540:1: ( ( RULE_STRING ) )
            // InternalReactionRules.g:5541:2: ( RULE_STRING )
            {
            // InternalReactionRules.g:5541:2: ( RULE_STRING )
            // InternalReactionRules.g:5542:3: RULE_STRING
            {
             before(grammarAccess.getModelPathAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelPathAccess().getPathSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelPath__PathAssignment_1"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalReactionRules.g:5551:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5555:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5556:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5556:2: ( RULE_ID )
            // InternalReactionRules.g:5557:3: RULE_ID
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


    // $ANTLR start "rule__Model__LocationAssignment_2"
    // InternalReactionRules.g:5566:1: rule__Model__LocationAssignment_2 : ( ruleModelLocation ) ;
    public final void rule__Model__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5570:1: ( ( ruleModelLocation ) )
            // InternalReactionRules.g:5571:2: ( ruleModelLocation )
            {
            // InternalReactionRules.g:5571:2: ( ruleModelLocation )
            // InternalReactionRules.g:5572:3: ruleModelLocation
            {
             before(grammarAccess.getModelAccess().getLocationModelLocationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleModelLocation();

            state._fsp--;

             after(grammarAccess.getModelAccess().getLocationModelLocationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__LocationAssignment_2"


    // $ANTLR start "rule__ReactionContainer__AgentInstancesAssignment_1"
    // InternalReactionRules.g:5581:1: rule__ReactionContainer__AgentInstancesAssignment_1 : ( ruleAgentInstance ) ;
    public final void rule__ReactionContainer__AgentInstancesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5585:1: ( ( ruleAgentInstance ) )
            // InternalReactionRules.g:5586:2: ( ruleAgentInstance )
            {
            // InternalReactionRules.g:5586:2: ( ruleAgentInstance )
            // InternalReactionRules.g:5587:3: ruleAgentInstance
            {
             before(grammarAccess.getReactionContainerAccess().getAgentInstancesAgentInstanceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAgentInstance();

            state._fsp--;

             after(grammarAccess.getReactionContainerAccess().getAgentInstancesAgentInstanceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionContainer__AgentInstancesAssignment_1"


    // $ANTLR start "rule__AgentInstanceSiteState__SiteAssignment_0"
    // InternalReactionRules.g:5596:1: rule__AgentInstanceSiteState__SiteAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstanceSiteState__SiteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5600:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5601:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5601:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5602:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceSiteStateAccess().getSiteSiteCrossReference_0_0()); 
            // InternalReactionRules.g:5603:3: ( RULE_ID )
            // InternalReactionRules.g:5604:4: RULE_ID
            {
             before(grammarAccess.getAgentInstanceSiteStateAccess().getSiteSiteIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAgentInstanceSiteStateAccess().getSiteSiteIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAgentInstanceSiteStateAccess().getSiteSiteCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceSiteState__SiteAssignment_0"


    // $ANTLR start "rule__AgentInstanceSiteState__SiteStateAssignment_1"
    // InternalReactionRules.g:5615:1: rule__AgentInstanceSiteState__SiteStateAssignment_1 : ( ruleSiteState ) ;
    public final void rule__AgentInstanceSiteState__SiteStateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5619:1: ( ( ruleSiteState ) )
            // InternalReactionRules.g:5620:2: ( ruleSiteState )
            {
            // InternalReactionRules.g:5620:2: ( ruleSiteState )
            // InternalReactionRules.g:5621:3: ruleSiteState
            {
             before(grammarAccess.getAgentInstanceSiteStateAccess().getSiteStateSiteStateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSiteState();

            state._fsp--;

             after(grammarAccess.getAgentInstanceSiteStateAccess().getSiteStateSiteStateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceSiteState__SiteStateAssignment_1"


    // $ANTLR start "rule__AgentInstanceLinkState__SiteAssignment_0"
    // InternalReactionRules.g:5630:1: rule__AgentInstanceLinkState__SiteAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstanceLinkState__SiteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5634:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5635:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5635:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5636:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getSiteSiteCrossReference_0_0()); 
            // InternalReactionRules.g:5637:3: ( RULE_ID )
            // InternalReactionRules.g:5638:4: RULE_ID
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getSiteSiteIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAgentInstanceLinkStateAccess().getSiteSiteIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAgentInstanceLinkStateAccess().getSiteSiteCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceLinkState__SiteAssignment_0"


    // $ANTLR start "rule__AgentInstanceLinkState__AttachedSiteAssignment_1"
    // InternalReactionRules.g:5649:1: rule__AgentInstanceLinkState__AttachedSiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstanceLinkState__AttachedSiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5653:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5654:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5654:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5655:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedSiteSiteCrossReference_1_0()); 
            // InternalReactionRules.g:5656:3: ( RULE_ID )
            // InternalReactionRules.g:5657:4: RULE_ID
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedSiteSiteIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedSiteSiteIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedSiteSiteCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceLinkState__AttachedSiteAssignment_1"


    // $ANTLR start "rule__AgentInstanceLinkState__AttachedAgentAssignment_2"
    // InternalReactionRules.g:5668:1: rule__AgentInstanceLinkState__AttachedAgentAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstanceLinkState__AttachedAgentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5672:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5673:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5673:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5674:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentAgentCrossReference_2_0()); 
            // InternalReactionRules.g:5675:3: ( RULE_ID )
            // InternalReactionRules.g:5676:4: RULE_ID
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentAgentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentAgentIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentAgentCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceLinkState__AttachedAgentAssignment_2"


    // $ANTLR start "rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3"
    // InternalReactionRules.g:5687:1: rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5691:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5692:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5692:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5693:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentInstanceAgentInstanceCrossReference_3_0()); 
            // InternalReactionRules.g:5694:3: ( RULE_ID )
            // InternalReactionRules.g:5695:4: RULE_ID
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentInstanceAgentInstanceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentInstanceAgentInstanceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentInstanceAgentInstanceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3"


    // $ANTLR start "rule__AgentInstanceLinkState__LinkStateAssignment_4"
    // InternalReactionRules.g:5706:1: rule__AgentInstanceLinkState__LinkStateAssignment_4 : ( ruleLinkState ) ;
    public final void rule__AgentInstanceLinkState__LinkStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5710:1: ( ( ruleLinkState ) )
            // InternalReactionRules.g:5711:2: ( ruleLinkState )
            {
            // InternalReactionRules.g:5711:2: ( ruleLinkState )
            // InternalReactionRules.g:5712:3: ruleLinkState
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getLinkStateLinkStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLinkState();

            state._fsp--;

             after(grammarAccess.getAgentInstanceLinkStateAccess().getLinkStateLinkStateParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstanceLinkState__LinkStateAssignment_4"


    // $ANTLR start "rule__AgentInstance__NameAssignment_1"
    // InternalReactionRules.g:5721:1: rule__AgentInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AgentInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5725:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5726:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5726:2: ( RULE_ID )
            // InternalReactionRules.g:5727:3: RULE_ID
            {
             before(grammarAccess.getAgentInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAgentInstanceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__NameAssignment_1"


    // $ANTLR start "rule__AgentInstance__AgentAssignment_2"
    // InternalReactionRules.g:5736:1: rule__AgentInstance__AgentAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstance__AgentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5740:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5741:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5741:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5742:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceAccess().getAgentAgentCrossReference_2_0()); 
            // InternalReactionRules.g:5743:3: ( RULE_ID )
            // InternalReactionRules.g:5744:4: RULE_ID
            {
             before(grammarAccess.getAgentInstanceAccess().getAgentAgentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAgentInstanceAccess().getAgentAgentIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAgentInstanceAccess().getAgentAgentCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__AgentAssignment_2"


    // $ANTLR start "rule__AgentInstance__SiteStatesAssignment_3"
    // InternalReactionRules.g:5755:1: rule__AgentInstance__SiteStatesAssignment_3 : ( ruleAgentInstanceSiteState ) ;
    public final void rule__AgentInstance__SiteStatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5759:1: ( ( ruleAgentInstanceSiteState ) )
            // InternalReactionRules.g:5760:2: ( ruleAgentInstanceSiteState )
            {
            // InternalReactionRules.g:5760:2: ( ruleAgentInstanceSiteState )
            // InternalReactionRules.g:5761:3: ruleAgentInstanceSiteState
            {
             before(grammarAccess.getAgentInstanceAccess().getSiteStatesAgentInstanceSiteStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAgentInstanceSiteState();

            state._fsp--;

             after(grammarAccess.getAgentInstanceAccess().getSiteStatesAgentInstanceSiteStateParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__SiteStatesAssignment_3"


    // $ANTLR start "rule__AgentInstance__LinkStatesAssignment_4"
    // InternalReactionRules.g:5770:1: rule__AgentInstance__LinkStatesAssignment_4 : ( ruleAgentInstanceLinkState ) ;
    public final void rule__AgentInstance__LinkStatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5774:1: ( ( ruleAgentInstanceLinkState ) )
            // InternalReactionRules.g:5775:2: ( ruleAgentInstanceLinkState )
            {
            // InternalReactionRules.g:5775:2: ( ruleAgentInstanceLinkState )
            // InternalReactionRules.g:5776:3: ruleAgentInstanceLinkState
            {
             before(grammarAccess.getAgentInstanceAccess().getLinkStatesAgentInstanceLinkStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAgentInstanceLinkState();

            state._fsp--;

             after(grammarAccess.getAgentInstanceAccess().getLinkStatesAgentInstanceLinkStateParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__LinkStatesAssignment_4"


    // $ANTLR start "rule__ArithmeticValue__ValueAssignment"
    // InternalReactionRules.g:5785:1: rule__ArithmeticValue__ValueAssignment : ( ruleArithmeticType ) ;
    public final void rule__ArithmeticValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5789:1: ( ( ruleArithmeticType ) )
            // InternalReactionRules.g:5790:2: ( ruleArithmeticType )
            {
            // InternalReactionRules.g:5790:2: ( ruleArithmeticType )
            // InternalReactionRules.g:5791:3: ruleArithmeticType
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
    // InternalReactionRules.g:5800:1: rule__State__NameAssignment : ( RULE_ID ) ;
    public final void rule__State__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5804:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5805:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5805:2: ( RULE_ID )
            // InternalReactionRules.g:5806:3: RULE_ID
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
    // InternalReactionRules.g:5815:1: rule__States__StateAssignment_1_1 : ( ruleState ) ;
    public final void rule__States__StateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5819:1: ( ( ruleState ) )
            // InternalReactionRules.g:5820:2: ( ruleState )
            {
            // InternalReactionRules.g:5820:2: ( ruleState )
            // InternalReactionRules.g:5821:3: ruleState
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
    // InternalReactionRules.g:5830:1: rule__States__StateAssignment_1_2_1 : ( ruleState ) ;
    public final void rule__States__StateAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5834:1: ( ( ruleState ) )
            // InternalReactionRules.g:5835:2: ( ruleState )
            {
            // InternalReactionRules.g:5835:2: ( ruleState )
            // InternalReactionRules.g:5836:3: ruleState
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
    // InternalReactionRules.g:5845:1: rule__Site__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Site__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5849:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5850:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5850:2: ( RULE_ID )
            // InternalReactionRules.g:5851:3: RULE_ID
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
    // InternalReactionRules.g:5860:1: rule__Site__StatesAssignment_1 : ( ruleStates ) ;
    public final void rule__Site__StatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5864:1: ( ( ruleStates ) )
            // InternalReactionRules.g:5865:2: ( ruleStates )
            {
            // InternalReactionRules.g:5865:2: ( ruleStates )
            // InternalReactionRules.g:5866:3: ruleStates
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
    // InternalReactionRules.g:5875:1: rule__Sites__SitesAssignment_1_1 : ( ruleSite ) ;
    public final void rule__Sites__SitesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5879:1: ( ( ruleSite ) )
            // InternalReactionRules.g:5880:2: ( ruleSite )
            {
            // InternalReactionRules.g:5880:2: ( ruleSite )
            // InternalReactionRules.g:5881:3: ruleSite
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
    // InternalReactionRules.g:5890:1: rule__Sites__SitesAssignment_1_2_1 : ( ruleSite ) ;
    public final void rule__Sites__SitesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5894:1: ( ( ruleSite ) )
            // InternalReactionRules.g:5895:2: ( ruleSite )
            {
            // InternalReactionRules.g:5895:2: ( ruleSite )
            // InternalReactionRules.g:5896:3: ruleSite
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
    // InternalReactionRules.g:5905:1: rule__Agent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5909:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5910:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5910:2: ( RULE_ID )
            // InternalReactionRules.g:5911:3: RULE_ID
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
    // InternalReactionRules.g:5920:1: rule__Agent__SitesAssignment_2 : ( ruleSites ) ;
    public final void rule__Agent__SitesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5924:1: ( ( ruleSites ) )
            // InternalReactionRules.g:5925:2: ( ruleSites )
            {
            // InternalReactionRules.g:5925:2: ( ruleSites )
            // InternalReactionRules.g:5926:3: ruleSites
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
    // InternalReactionRules.g:5935:1: rule__PatternVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PatternVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5939:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5940:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5940:2: ( RULE_ID )
            // InternalReactionRules.g:5941:3: RULE_ID
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
    // InternalReactionRules.g:5950:1: rule__PatternVariable__PatternAssignment_3 : ( rulePattern ) ;
    public final void rule__PatternVariable__PatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5954:1: ( ( rulePattern ) )
            // InternalReactionRules.g:5955:2: ( rulePattern )
            {
            // InternalReactionRules.g:5955:2: ( rulePattern )
            // InternalReactionRules.g:5956:3: rulePattern
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
    // InternalReactionRules.g:5965:1: rule__ArithmeticVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ArithmeticVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5969:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5970:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5970:2: ( RULE_ID )
            // InternalReactionRules.g:5971:3: RULE_ID
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
    // InternalReactionRules.g:5980:1: rule__ArithmeticVariable__ValueAssignment_3 : ( ruleArithmeticValue ) ;
    public final void rule__ArithmeticVariable__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5984:1: ( ( ruleArithmeticValue ) )
            // InternalReactionRules.g:5985:2: ( ruleArithmeticValue )
            {
            // InternalReactionRules.g:5985:2: ( ruleArithmeticValue )
            // InternalReactionRules.g:5986:3: ruleArithmeticValue
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


    // $ANTLR start "rule__SemiLink__NameAssignment_1"
    // InternalReactionRules.g:5995:1: rule__SemiLink__NameAssignment_1 : ( RULE_SEMI_LINK ) ;
    public final void rule__SemiLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5999:1: ( ( RULE_SEMI_LINK ) )
            // InternalReactionRules.g:6000:2: ( RULE_SEMI_LINK )
            {
            // InternalReactionRules.g:6000:2: ( RULE_SEMI_LINK )
            // InternalReactionRules.g:6001:3: RULE_SEMI_LINK
            {
             before(grammarAccess.getSemiLinkAccess().getNameSEMI_LINKTerminalRuleCall_1_0()); 
            match(input,RULE_SEMI_LINK,FOLLOW_2); 
             after(grammarAccess.getSemiLinkAccess().getNameSEMI_LINKTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemiLink__NameAssignment_1"


    // $ANTLR start "rule__FreeLink__NameAssignment_1"
    // InternalReactionRules.g:6010:1: rule__FreeLink__NameAssignment_1 : ( RULE_FREE_LINK ) ;
    public final void rule__FreeLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6014:1: ( ( RULE_FREE_LINK ) )
            // InternalReactionRules.g:6015:2: ( RULE_FREE_LINK )
            {
            // InternalReactionRules.g:6015:2: ( RULE_FREE_LINK )
            // InternalReactionRules.g:6016:3: RULE_FREE_LINK
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
    // InternalReactionRules.g:6025:1: rule__WhatEver__NameAssignment_1 : ( RULE_WHATEVER_LINK ) ;
    public final void rule__WhatEver__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6029:1: ( ( RULE_WHATEVER_LINK ) )
            // InternalReactionRules.g:6030:2: ( RULE_WHATEVER_LINK )
            {
            // InternalReactionRules.g:6030:2: ( RULE_WHATEVER_LINK )
            // InternalReactionRules.g:6031:3: RULE_WHATEVER_LINK
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


    // $ANTLR start "rule__IndexedLink__StateAssignment_1"
    // InternalReactionRules.g:6040:1: rule__IndexedLink__StateAssignment_1 : ( ruleUnsignedInteger ) ;
    public final void rule__IndexedLink__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6044:1: ( ( ruleUnsignedInteger ) )
            // InternalReactionRules.g:6045:2: ( ruleUnsignedInteger )
            {
            // InternalReactionRules.g:6045:2: ( ruleUnsignedInteger )
            // InternalReactionRules.g:6046:3: ruleUnsignedInteger
            {
             before(grammarAccess.getIndexedLinkAccess().getStateUnsignedIntegerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsignedInteger();

            state._fsp--;

             after(grammarAccess.getIndexedLinkAccess().getStateUnsignedIntegerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexedLink__StateAssignment_1"


    // $ANTLR start "rule__ExactLinkAgent__AgentAssignment_1"
    // InternalReactionRules.g:6055:1: rule__ExactLinkAgent__AgentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExactLinkAgent__AgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6059:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6060:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6060:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6061:3: ( RULE_ID )
            {
             before(grammarAccess.getExactLinkAgentAccess().getAgentAgentCrossReference_1_0()); 
            // InternalReactionRules.g:6062:3: ( RULE_ID )
            // InternalReactionRules.g:6063:4: RULE_ID
            {
             before(grammarAccess.getExactLinkAgentAccess().getAgentAgentIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExactLinkAgentAccess().getAgentAgentIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getExactLinkAgentAccess().getAgentAgentCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLinkAgent__AgentAssignment_1"


    // $ANTLR start "rule__ExactLinkSite__SiteAssignment_1"
    // InternalReactionRules.g:6074:1: rule__ExactLinkSite__SiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExactLinkSite__SiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6078:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6079:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6079:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6080:3: ( RULE_ID )
            {
             before(grammarAccess.getExactLinkSiteAccess().getSiteSiteCrossReference_1_0()); 
            // InternalReactionRules.g:6081:3: ( RULE_ID )
            // InternalReactionRules.g:6082:4: RULE_ID
            {
             before(grammarAccess.getExactLinkSiteAccess().getSiteSiteIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExactLinkSiteAccess().getSiteSiteIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getExactLinkSiteAccess().getSiteSiteCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLinkSite__SiteAssignment_1"


    // $ANTLR start "rule__ExactLink__LinkAgentAssignment_1"
    // InternalReactionRules.g:6093:1: rule__ExactLink__LinkAgentAssignment_1 : ( ruleExactLinkAgent ) ;
    public final void rule__ExactLink__LinkAgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6097:1: ( ( ruleExactLinkAgent ) )
            // InternalReactionRules.g:6098:2: ( ruleExactLinkAgent )
            {
            // InternalReactionRules.g:6098:2: ( ruleExactLinkAgent )
            // InternalReactionRules.g:6099:3: ruleExactLinkAgent
            {
             before(grammarAccess.getExactLinkAccess().getLinkAgentExactLinkAgentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExactLinkAgent();

            state._fsp--;

             after(grammarAccess.getExactLinkAccess().getLinkAgentExactLinkAgentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLink__LinkAgentAssignment_1"


    // $ANTLR start "rule__ExactLink__LinkSiteAssignment_3"
    // InternalReactionRules.g:6108:1: rule__ExactLink__LinkSiteAssignment_3 : ( ruleExactLinkSite ) ;
    public final void rule__ExactLink__LinkSiteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6112:1: ( ( ruleExactLinkSite ) )
            // InternalReactionRules.g:6113:2: ( ruleExactLinkSite )
            {
            // InternalReactionRules.g:6113:2: ( ruleExactLinkSite )
            // InternalReactionRules.g:6114:3: ruleExactLinkSite
            {
             before(grammarAccess.getExactLinkAccess().getLinkSiteExactLinkSiteParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExactLinkSite();

            state._fsp--;

             after(grammarAccess.getExactLinkAccess().getLinkSiteExactLinkSiteParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactLink__LinkSiteAssignment_3"


    // $ANTLR start "rule__SiteState__StateAssignment_1"
    // InternalReactionRules.g:6123:1: rule__SiteState__StateAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SiteState__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6127:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6128:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6128:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6129:3: ( RULE_ID )
            {
             before(grammarAccess.getSiteStateAccess().getStateStateCrossReference_1_0()); 
            // InternalReactionRules.g:6130:3: ( RULE_ID )
            // InternalReactionRules.g:6131:4: RULE_ID
            {
             before(grammarAccess.getSiteStateAccess().getStateStateIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSiteStateAccess().getStateStateIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSiteStateAccess().getStateStateCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteState__StateAssignment_1"


    // $ANTLR start "rule__LinkState__LinkStateAssignment_1"
    // InternalReactionRules.g:6142:1: rule__LinkState__LinkStateAssignment_1 : ( ( rule__LinkState__LinkStateAlternatives_1_0 ) ) ;
    public final void rule__LinkState__LinkStateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6146:1: ( ( ( rule__LinkState__LinkStateAlternatives_1_0 ) ) )
            // InternalReactionRules.g:6147:2: ( ( rule__LinkState__LinkStateAlternatives_1_0 ) )
            {
            // InternalReactionRules.g:6147:2: ( ( rule__LinkState__LinkStateAlternatives_1_0 ) )
            // InternalReactionRules.g:6148:3: ( rule__LinkState__LinkStateAlternatives_1_0 )
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAlternatives_1_0()); 
            // InternalReactionRules.g:6149:3: ( rule__LinkState__LinkStateAlternatives_1_0 )
            // InternalReactionRules.g:6149:4: rule__LinkState__LinkStateAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__LinkState__LinkStateAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLinkStateAccess().getLinkStateAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkState__LinkStateAssignment_1"


    // $ANTLR start "rule__SitePattern__SiteAssignment_1"
    // InternalReactionRules.g:6157:1: rule__SitePattern__SiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SitePattern__SiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6161:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6162:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6162:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6163:3: ( RULE_ID )
            {
             before(grammarAccess.getSitePatternAccess().getSiteSiteCrossReference_1_0()); 
            // InternalReactionRules.g:6164:3: ( RULE_ID )
            // InternalReactionRules.g:6165:4: RULE_ID
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
    // InternalReactionRules.g:6176:1: rule__SitePattern__StateAssignment_2_1 : ( ruleSiteState ) ;
    public final void rule__SitePattern__StateAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6180:1: ( ( ruleSiteState ) )
            // InternalReactionRules.g:6181:2: ( ruleSiteState )
            {
            // InternalReactionRules.g:6181:2: ( ruleSiteState )
            // InternalReactionRules.g:6182:3: ruleSiteState
            {
             before(grammarAccess.getSitePatternAccess().getStateSiteStateParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSiteState();

            state._fsp--;

             after(grammarAccess.getSitePatternAccess().getStateSiteStateParserRuleCall_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SitePattern__LinkStateAssignment_4"
    // InternalReactionRules.g:6191:1: rule__SitePattern__LinkStateAssignment_4 : ( ruleLinkState ) ;
    public final void rule__SitePattern__LinkStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6195:1: ( ( ruleLinkState ) )
            // InternalReactionRules.g:6196:2: ( ruleLinkState )
            {
            // InternalReactionRules.g:6196:2: ( ruleLinkState )
            // InternalReactionRules.g:6197:3: ruleLinkState
            {
             before(grammarAccess.getSitePatternAccess().getLinkStateLinkStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLinkState();

            state._fsp--;

             after(grammarAccess.getSitePatternAccess().getLinkStateLinkStateParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePattern__LinkStateAssignment_4"


    // $ANTLR start "rule__SitePatterns__SitePatternsAssignment_1_0"
    // InternalReactionRules.g:6206:1: rule__SitePatterns__SitePatternsAssignment_1_0 : ( ruleSitePattern ) ;
    public final void rule__SitePatterns__SitePatternsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6210:1: ( ( ruleSitePattern ) )
            // InternalReactionRules.g:6211:2: ( ruleSitePattern )
            {
            // InternalReactionRules.g:6211:2: ( ruleSitePattern )
            // InternalReactionRules.g:6212:3: ruleSitePattern
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsSitePatternParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSitePattern();

            state._fsp--;

             after(grammarAccess.getSitePatternsAccess().getSitePatternsSitePatternParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__SitePatternsAssignment_1_0"


    // $ANTLR start "rule__SitePatterns__SitePatternsAssignment_1_1_1"
    // InternalReactionRules.g:6221:1: rule__SitePatterns__SitePatternsAssignment_1_1_1 : ( ruleSitePattern ) ;
    public final void rule__SitePatterns__SitePatternsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6225:1: ( ( ruleSitePattern ) )
            // InternalReactionRules.g:6226:2: ( ruleSitePattern )
            {
            // InternalReactionRules.g:6226:2: ( ruleSitePattern )
            // InternalReactionRules.g:6227:3: ruleSitePattern
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsSitePatternParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSitePattern();

            state._fsp--;

             after(grammarAccess.getSitePatternsAccess().getSitePatternsSitePatternParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SitePatterns__SitePatternsAssignment_1_1_1"


    // $ANTLR start "rule__ValidAgentPattern__AgentAssignment_1"
    // InternalReactionRules.g:6236:1: rule__ValidAgentPattern__AgentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ValidAgentPattern__AgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6240:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6241:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6241:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6242:3: ( RULE_ID )
            {
             before(grammarAccess.getValidAgentPatternAccess().getAgentAgentCrossReference_1_0()); 
            // InternalReactionRules.g:6243:3: ( RULE_ID )
            // InternalReactionRules.g:6244:4: RULE_ID
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


    // $ANTLR start "rule__ValidAgentPattern__SitePatternsAssignment_3"
    // InternalReactionRules.g:6255:1: rule__ValidAgentPattern__SitePatternsAssignment_3 : ( ruleSitePatterns ) ;
    public final void rule__ValidAgentPattern__SitePatternsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6259:1: ( ( ruleSitePatterns ) )
            // InternalReactionRules.g:6260:2: ( ruleSitePatterns )
            {
            // InternalReactionRules.g:6260:2: ( ruleSitePatterns )
            // InternalReactionRules.g:6261:3: ruleSitePatterns
            {
             before(grammarAccess.getValidAgentPatternAccess().getSitePatternsSitePatternsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSitePatterns();

            state._fsp--;

             after(grammarAccess.getValidAgentPatternAccess().getSitePatternsSitePatternsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidAgentPattern__SitePatternsAssignment_3"


    // $ANTLR start "rule__VoidAgentPattern__PatternAssignment"
    // InternalReactionRules.g:6270:1: rule__VoidAgentPattern__PatternAssignment : ( RULE_VOID_PATTERN ) ;
    public final void rule__VoidAgentPattern__PatternAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6274:1: ( ( RULE_VOID_PATTERN ) )
            // InternalReactionRules.g:6275:2: ( RULE_VOID_PATTERN )
            {
            // InternalReactionRules.g:6275:2: ( RULE_VOID_PATTERN )
            // InternalReactionRules.g:6276:3: RULE_VOID_PATTERN
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
    // InternalReactionRules.g:6285:1: rule__Pattern__AgentPatternsAssignment_2_0 : ( ruleAgentPattern ) ;
    public final void rule__Pattern__AgentPatternsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6289:1: ( ( ruleAgentPattern ) )
            // InternalReactionRules.g:6290:2: ( ruleAgentPattern )
            {
            // InternalReactionRules.g:6290:2: ( ruleAgentPattern )
            // InternalReactionRules.g:6291:3: ruleAgentPattern
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
    // InternalReactionRules.g:6300:1: rule__Pattern__AgentPatternsAssignment_2_1_1 : ( ruleAgentPattern ) ;
    public final void rule__Pattern__AgentPatternsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6304:1: ( ( ruleAgentPattern ) )
            // InternalReactionRules.g:6305:2: ( ruleAgentPattern )
            {
            // InternalReactionRules.g:6305:2: ( ruleAgentPattern )
            // InternalReactionRules.g:6306:3: ruleAgentPattern
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
    // InternalReactionRules.g:6315:1: rule__Observation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Observation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6319:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6320:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6320:2: ( RULE_ID )
            // InternalReactionRules.g:6321:3: RULE_ID
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
    // InternalReactionRules.g:6330:1: rule__Observation__ObservationPatternAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__Observation__ObservationPatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6334:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6335:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6335:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6336:3: rulePatternAssignment
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
    // InternalReactionRules.g:6345:1: rule__NumericFromLiteral__ValueAssignment : ( ruleArithmeticValue ) ;
    public final void rule__NumericFromLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6349:1: ( ( ruleArithmeticValue ) )
            // InternalReactionRules.g:6350:2: ( ruleArithmeticValue )
            {
            // InternalReactionRules.g:6350:2: ( ruleArithmeticValue )
            // InternalReactionRules.g:6351:3: ruleArithmeticValue
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
    // InternalReactionRules.g:6360:1: rule__NumericFromVariable__ValueVarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NumericFromVariable__ValueVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6364:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6365:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6365:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6366:3: ( RULE_ID )
            {
             before(grammarAccess.getNumericFromVariableAccess().getValueVarArithmeticVariableCrossReference_0()); 
            // InternalReactionRules.g:6367:3: ( RULE_ID )
            // InternalReactionRules.g:6368:4: RULE_ID
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
    // InternalReactionRules.g:6379:1: rule__Initial__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Initial__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6383:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6384:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6384:2: ( RULE_ID )
            // InternalReactionRules.g:6385:3: RULE_ID
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
    // InternalReactionRules.g:6394:1: rule__Initial__CountAssignment_2 : ( ruleNumericAssignment ) ;
    public final void rule__Initial__CountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6398:1: ( ( ruleNumericAssignment ) )
            // InternalReactionRules.g:6399:2: ( ruleNumericAssignment )
            {
            // InternalReactionRules.g:6399:2: ( ruleNumericAssignment )
            // InternalReactionRules.g:6400:3: ruleNumericAssignment
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
    // InternalReactionRules.g:6409:1: rule__Initial__InitialPatternAssignment_3 : ( rulePatternAssignment ) ;
    public final void rule__Initial__InitialPatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6413:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6414:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6414:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6415:3: rulePatternAssignment
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
    // InternalReactionRules.g:6424:1: rule__AssignFromPattern__PatternAssignment : ( rulePattern ) ;
    public final void rule__AssignFromPattern__PatternAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6428:1: ( ( rulePattern ) )
            // InternalReactionRules.g:6429:2: ( rulePattern )
            {
            // InternalReactionRules.g:6429:2: ( rulePattern )
            // InternalReactionRules.g:6430:3: rulePattern
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
    // InternalReactionRules.g:6439:1: rule__AssignFromVariable__PatternVarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__AssignFromVariable__PatternVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6443:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6444:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6444:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6445:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignFromVariableAccess().getPatternVarPatternVariableCrossReference_0()); 
            // InternalReactionRules.g:6446:3: ( RULE_ID )
            // InternalReactionRules.g:6447:4: RULE_ID
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
    // InternalReactionRules.g:6458:1: rule__RuleVariables__VariablesAssignment_0 : ( ruleNumericAssignment ) ;
    public final void rule__RuleVariables__VariablesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6462:1: ( ( ruleNumericAssignment ) )
            // InternalReactionRules.g:6463:2: ( ruleNumericAssignment )
            {
            // InternalReactionRules.g:6463:2: ( ruleNumericAssignment )
            // InternalReactionRules.g:6464:3: ruleNumericAssignment
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
    // InternalReactionRules.g:6473:1: rule__RuleVariables__VariablesAssignment_1_1 : ( ruleNumericAssignment ) ;
    public final void rule__RuleVariables__VariablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6477:1: ( ( ruleNumericAssignment ) )
            // InternalReactionRules.g:6478:2: ( ruleNumericAssignment )
            {
            // InternalReactionRules.g:6478:2: ( ruleNumericAssignment )
            // InternalReactionRules.g:6479:3: ruleNumericAssignment
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
    // InternalReactionRules.g:6488:1: rule__UnidirectionalRule__LhsAssignment_0 : ( rulePatternAssignment ) ;
    public final void rule__UnidirectionalRule__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6492:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6493:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6493:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6494:3: rulePatternAssignment
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
    // InternalReactionRules.g:6503:1: rule__UnidirectionalRule__OperatorAssignment_1 : ( RULE_UNI ) ;
    public final void rule__UnidirectionalRule__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6507:1: ( ( RULE_UNI ) )
            // InternalReactionRules.g:6508:2: ( RULE_UNI )
            {
            // InternalReactionRules.g:6508:2: ( RULE_UNI )
            // InternalReactionRules.g:6509:3: RULE_UNI
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
    // InternalReactionRules.g:6518:1: rule__UnidirectionalRule__RhsAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__UnidirectionalRule__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6522:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6523:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6523:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6524:3: rulePatternAssignment
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
    // InternalReactionRules.g:6533:1: rule__UnidirectionalRule__VariablesAssignment_5 : ( ruleRuleVariables ) ;
    public final void rule__UnidirectionalRule__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6537:1: ( ( ruleRuleVariables ) )
            // InternalReactionRules.g:6538:2: ( ruleRuleVariables )
            {
            // InternalReactionRules.g:6538:2: ( ruleRuleVariables )
            // InternalReactionRules.g:6539:3: ruleRuleVariables
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
    // InternalReactionRules.g:6548:1: rule__BidirectionalRule__LhsAssignment_0 : ( rulePatternAssignment ) ;
    public final void rule__BidirectionalRule__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6552:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6553:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6553:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6554:3: rulePatternAssignment
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
    // InternalReactionRules.g:6563:1: rule__BidirectionalRule__OperatorAssignment_1 : ( RULE_BI ) ;
    public final void rule__BidirectionalRule__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6567:1: ( ( RULE_BI ) )
            // InternalReactionRules.g:6568:2: ( RULE_BI )
            {
            // InternalReactionRules.g:6568:2: ( RULE_BI )
            // InternalReactionRules.g:6569:3: RULE_BI
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
    // InternalReactionRules.g:6578:1: rule__BidirectionalRule__RhsAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__BidirectionalRule__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6582:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6583:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6583:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6584:3: rulePatternAssignment
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
    // InternalReactionRules.g:6593:1: rule__BidirectionalRule__VariablesAssignment_5 : ( ruleRuleVariables ) ;
    public final void rule__BidirectionalRule__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6597:1: ( ( ruleRuleVariables ) )
            // InternalReactionRules.g:6598:2: ( ruleRuleVariables )
            {
            // InternalReactionRules.g:6598:2: ( ruleRuleVariables )
            // InternalReactionRules.g:6599:3: ruleRuleVariables
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
    // InternalReactionRules.g:6608:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6612:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6613:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6613:2: ( RULE_ID )
            // InternalReactionRules.g:6614:3: RULE_ID
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
    // InternalReactionRules.g:6623:1: rule__Rule__RuleAssignment_2 : ( ruleRuleBody ) ;
    public final void rule__Rule__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6627:1: ( ( ruleRuleBody ) )
            // InternalReactionRules.g:6628:2: ( ruleRuleBody )
            {
            // InternalReactionRules.g:6628:2: ( ruleRuleBody )
            // InternalReactionRules.g:6629:3: ruleRuleBody
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

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\4\1\6\3\uffff\1\11\2\uffff";
    static final String dfa_3s = "\2\4\2\10\1\uffff\1\4\1\uffff\1\5\2\uffff";
    static final String dfa_4s = "\1\23\1\4\2\46\1\uffff\1\4\1\uffff\1\46\2\uffff";
    static final String dfa_5s = "\4\uffff\1\2\1\uffff\1\3\1\uffff\1\4\1\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\16\uffff\1\1",
            "\1\3",
            "\1\4\20\uffff\1\5\1\4\1\uffff\1\4\2\uffff\2\4\2\uffff\4\4",
            "\1\6\20\uffff\1\5\1\6\1\uffff\1\6\2\uffff\2\6\2\uffff\4\6",
            "",
            "\1\7",
            "",
            "\1\10\2\uffff\1\11\21\uffff\1\11\1\uffff\1\11\2\uffff\2\11\2\uffff\4\11",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1465:1: rule__ArithmeticType__Alternatives : ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) );";
        }
    }
    static final String dfa_8s = "\105\uffff";
    static final String dfa_9s = "\2\10\1\15\1\35\1\33\1\15\2\uffff\2\10\1\32\1\33\1\35\1\33\1\10\1\4\1\10\1\33\2\43\1\31\2\43\1\32\1\33\1\42\1\34\2\10\1\4\1\10\1\43\1\33\2\43\1\31\2\43\1\32\1\42\1\34\2\10\1\4\1\10\1\43\1\33\2\43\1\31\2\43\1\32\1\42\1\34\2\10\1\4\1\43\1\33\2\43\1\31\2\43\1\42\1\34\1\10\1\43";
    static final String dfa_10s = "\1\32\1\33\1\16\1\35\1\34\1\16\2\uffff\1\36\1\14\1\42\1\34\1\35\1\34\1\10\1\13\1\36\1\33\2\43\1\31\2\43\1\42\1\34\1\42\1\36\2\10\1\13\1\10\1\43\1\33\2\43\1\31\2\43\2\42\1\36\2\10\1\13\1\10\1\43\1\33\2\43\1\31\2\43\2\42\1\36\2\10\1\13\1\43\1\33\2\43\1\31\2\43\1\42\1\36\1\10\1\43";
    static final String dfa_11s = "\6\uffff\1\1\1\2\75\uffff";
    static final String dfa_12s = "\105\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\21\uffff\1\1",
            "\1\3\3\uffff\1\4\16\uffff\1\5",
            "\1\6\1\7",
            "\1\10",
            "\1\5\1\11",
            "\1\6\1\7",
            "",
            "",
            "\1\12\25\uffff\1\13",
            "\1\14\3\uffff\1\15",
            "\1\16\7\uffff\1\17",
            "\1\5\1\11",
            "\1\20",
            "\1\5\1\11",
            "\1\21",
            "\1\25\3\uffff\1\24\1\22\1\23\1\26",
            "\1\27\25\uffff\1\30",
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
            "\1\44\3\uffff\1\43\1\41\1\42\1\45",
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
            "\1\62\3\uffff\1\61\1\57\1\60\1\63",
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
            "\1\77\3\uffff\1\76\1\74\1\75\1\100",
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

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1621:1: rule__RuleBody__Alternatives : ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000007180000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000007180000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000F10L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008001100L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080110L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000004000L});

}