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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_EXPONENT", "RULE_AT", "RULE_STRING", "RULE_ID", "RULE_SEMI_LINK", "RULE_FREE_LINK", "RULE_WHATEVER_LINK", "RULE_UNI", "RULE_BI", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'URI'", "'PATH'", "'ModelID'", "'AgentInstance'", "'-'", "'.'", "'{'", "'}'", "','", "'('", "')'", "'agent'", "'var'", "'='", "'['", "']'", "'obs'", "'init'", "'rule'"
    };
    public static final int RULE_FREE_LINK=10;
    public static final int RULE_STRING=7;
    public static final int RULE_AT=6;
    public static final int RULE_WHATEVER_LINK=11;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int RULE_SEMI_LINK=9;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=8;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_BI=13;
    public static final int RULE_EXPONENT=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int RULE_UNI=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
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


    // $ANTLR start "entryRuleAgentPattern"
    // InternalReactionRules.g:960:1: entryRuleAgentPattern : ruleAgentPattern EOF ;
    public final void entryRuleAgentPattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:961:1: ( ruleAgentPattern EOF )
            // InternalReactionRules.g:962:1: ruleAgentPattern EOF
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
    // InternalReactionRules.g:969:1: ruleAgentPattern : ( ( rule__AgentPattern__Group__0 ) ) ;
    public final void ruleAgentPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:973:2: ( ( ( rule__AgentPattern__Group__0 ) ) )
            // InternalReactionRules.g:974:2: ( ( rule__AgentPattern__Group__0 ) )
            {
            // InternalReactionRules.g:974:2: ( ( rule__AgentPattern__Group__0 ) )
            // InternalReactionRules.g:975:3: ( rule__AgentPattern__Group__0 )
            {
             before(grammarAccess.getAgentPatternAccess().getGroup()); 
            // InternalReactionRules.g:976:3: ( rule__AgentPattern__Group__0 )
            // InternalReactionRules.g:976:4: rule__AgentPattern__Group__0
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
    // InternalReactionRules.g:985:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:986:1: ( rulePattern EOF )
            // InternalReactionRules.g:987:1: rulePattern EOF
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
    // InternalReactionRules.g:994:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:998:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalReactionRules.g:999:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalReactionRules.g:999:2: ( ( rule__Pattern__Group__0 ) )
            // InternalReactionRules.g:1000:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalReactionRules.g:1001:3: ( rule__Pattern__Group__0 )
            // InternalReactionRules.g:1001:4: rule__Pattern__Group__0
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
    // InternalReactionRules.g:1010:1: entryRuleObservation : ruleObservation EOF ;
    public final void entryRuleObservation() throws RecognitionException {
        try {
            // InternalReactionRules.g:1011:1: ( ruleObservation EOF )
            // InternalReactionRules.g:1012:1: ruleObservation EOF
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
    // InternalReactionRules.g:1019:1: ruleObservation : ( ( rule__Observation__Group__0 ) ) ;
    public final void ruleObservation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1023:2: ( ( ( rule__Observation__Group__0 ) ) )
            // InternalReactionRules.g:1024:2: ( ( rule__Observation__Group__0 ) )
            {
            // InternalReactionRules.g:1024:2: ( ( rule__Observation__Group__0 ) )
            // InternalReactionRules.g:1025:3: ( rule__Observation__Group__0 )
            {
             before(grammarAccess.getObservationAccess().getGroup()); 
            // InternalReactionRules.g:1026:3: ( rule__Observation__Group__0 )
            // InternalReactionRules.g:1026:4: rule__Observation__Group__0
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
    // InternalReactionRules.g:1035:1: entryRuleInitial : ruleInitial EOF ;
    public final void entryRuleInitial() throws RecognitionException {
        try {
            // InternalReactionRules.g:1036:1: ( ruleInitial EOF )
            // InternalReactionRules.g:1037:1: ruleInitial EOF
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
    // InternalReactionRules.g:1044:1: ruleInitial : ( ( rule__Initial__Group__0 ) ) ;
    public final void ruleInitial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1048:2: ( ( ( rule__Initial__Group__0 ) ) )
            // InternalReactionRules.g:1049:2: ( ( rule__Initial__Group__0 ) )
            {
            // InternalReactionRules.g:1049:2: ( ( rule__Initial__Group__0 ) )
            // InternalReactionRules.g:1050:3: ( rule__Initial__Group__0 )
            {
             before(grammarAccess.getInitialAccess().getGroup()); 
            // InternalReactionRules.g:1051:3: ( rule__Initial__Group__0 )
            // InternalReactionRules.g:1051:4: rule__Initial__Group__0
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
    // InternalReactionRules.g:1060:1: entryRuleAssignFromPattern : ruleAssignFromPattern EOF ;
    public final void entryRuleAssignFromPattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:1061:1: ( ruleAssignFromPattern EOF )
            // InternalReactionRules.g:1062:1: ruleAssignFromPattern EOF
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
    // InternalReactionRules.g:1069:1: ruleAssignFromPattern : ( ( rule__AssignFromPattern__PatternAssignment ) ) ;
    public final void ruleAssignFromPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1073:2: ( ( ( rule__AssignFromPattern__PatternAssignment ) ) )
            // InternalReactionRules.g:1074:2: ( ( rule__AssignFromPattern__PatternAssignment ) )
            {
            // InternalReactionRules.g:1074:2: ( ( rule__AssignFromPattern__PatternAssignment ) )
            // InternalReactionRules.g:1075:3: ( rule__AssignFromPattern__PatternAssignment )
            {
             before(grammarAccess.getAssignFromPatternAccess().getPatternAssignment()); 
            // InternalReactionRules.g:1076:3: ( rule__AssignFromPattern__PatternAssignment )
            // InternalReactionRules.g:1076:4: rule__AssignFromPattern__PatternAssignment
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
    // InternalReactionRules.g:1085:1: entryRuleAssignFromVariable : ruleAssignFromVariable EOF ;
    public final void entryRuleAssignFromVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:1086:1: ( ruleAssignFromVariable EOF )
            // InternalReactionRules.g:1087:1: ruleAssignFromVariable EOF
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
    // InternalReactionRules.g:1094:1: ruleAssignFromVariable : ( ( rule__AssignFromVariable__PatternVarAssignment ) ) ;
    public final void ruleAssignFromVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1098:2: ( ( ( rule__AssignFromVariable__PatternVarAssignment ) ) )
            // InternalReactionRules.g:1099:2: ( ( rule__AssignFromVariable__PatternVarAssignment ) )
            {
            // InternalReactionRules.g:1099:2: ( ( rule__AssignFromVariable__PatternVarAssignment ) )
            // InternalReactionRules.g:1100:3: ( rule__AssignFromVariable__PatternVarAssignment )
            {
             before(grammarAccess.getAssignFromVariableAccess().getPatternVarAssignment()); 
            // InternalReactionRules.g:1101:3: ( rule__AssignFromVariable__PatternVarAssignment )
            // InternalReactionRules.g:1101:4: rule__AssignFromVariable__PatternVarAssignment
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
    // InternalReactionRules.g:1110:1: entryRulePatternAssignment : rulePatternAssignment EOF ;
    public final void entryRulePatternAssignment() throws RecognitionException {
        try {
            // InternalReactionRules.g:1111:1: ( rulePatternAssignment EOF )
            // InternalReactionRules.g:1112:1: rulePatternAssignment EOF
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
    // InternalReactionRules.g:1119:1: rulePatternAssignment : ( ( rule__PatternAssignment__Alternatives ) ) ;
    public final void rulePatternAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1123:2: ( ( ( rule__PatternAssignment__Alternatives ) ) )
            // InternalReactionRules.g:1124:2: ( ( rule__PatternAssignment__Alternatives ) )
            {
            // InternalReactionRules.g:1124:2: ( ( rule__PatternAssignment__Alternatives ) )
            // InternalReactionRules.g:1125:3: ( rule__PatternAssignment__Alternatives )
            {
             before(grammarAccess.getPatternAssignmentAccess().getAlternatives()); 
            // InternalReactionRules.g:1126:3: ( rule__PatternAssignment__Alternatives )
            // InternalReactionRules.g:1126:4: rule__PatternAssignment__Alternatives
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
    // InternalReactionRules.g:1135:1: entryRuleRuleVariables : ruleRuleVariables EOF ;
    public final void entryRuleRuleVariables() throws RecognitionException {
        try {
            // InternalReactionRules.g:1136:1: ( ruleRuleVariables EOF )
            // InternalReactionRules.g:1137:1: ruleRuleVariables EOF
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
    // InternalReactionRules.g:1144:1: ruleRuleVariables : ( ( rule__RuleVariables__Group__0 ) ) ;
    public final void ruleRuleVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1148:2: ( ( ( rule__RuleVariables__Group__0 ) ) )
            // InternalReactionRules.g:1149:2: ( ( rule__RuleVariables__Group__0 ) )
            {
            // InternalReactionRules.g:1149:2: ( ( rule__RuleVariables__Group__0 ) )
            // InternalReactionRules.g:1150:3: ( rule__RuleVariables__Group__0 )
            {
             before(grammarAccess.getRuleVariablesAccess().getGroup()); 
            // InternalReactionRules.g:1151:3: ( rule__RuleVariables__Group__0 )
            // InternalReactionRules.g:1151:4: rule__RuleVariables__Group__0
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
    // InternalReactionRules.g:1160:1: entryRuleUnidirectionalRule : ruleUnidirectionalRule EOF ;
    public final void entryRuleUnidirectionalRule() throws RecognitionException {
        try {
            // InternalReactionRules.g:1161:1: ( ruleUnidirectionalRule EOF )
            // InternalReactionRules.g:1162:1: ruleUnidirectionalRule EOF
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
    // InternalReactionRules.g:1169:1: ruleUnidirectionalRule : ( ( rule__UnidirectionalRule__Group__0 ) ) ;
    public final void ruleUnidirectionalRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1173:2: ( ( ( rule__UnidirectionalRule__Group__0 ) ) )
            // InternalReactionRules.g:1174:2: ( ( rule__UnidirectionalRule__Group__0 ) )
            {
            // InternalReactionRules.g:1174:2: ( ( rule__UnidirectionalRule__Group__0 ) )
            // InternalReactionRules.g:1175:3: ( rule__UnidirectionalRule__Group__0 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getGroup()); 
            // InternalReactionRules.g:1176:3: ( rule__UnidirectionalRule__Group__0 )
            // InternalReactionRules.g:1176:4: rule__UnidirectionalRule__Group__0
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
    // InternalReactionRules.g:1185:1: entryRuleBidirectionalRule : ruleBidirectionalRule EOF ;
    public final void entryRuleBidirectionalRule() throws RecognitionException {
        try {
            // InternalReactionRules.g:1186:1: ( ruleBidirectionalRule EOF )
            // InternalReactionRules.g:1187:1: ruleBidirectionalRule EOF
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
    // InternalReactionRules.g:1194:1: ruleBidirectionalRule : ( ( rule__BidirectionalRule__Group__0 ) ) ;
    public final void ruleBidirectionalRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1198:2: ( ( ( rule__BidirectionalRule__Group__0 ) ) )
            // InternalReactionRules.g:1199:2: ( ( rule__BidirectionalRule__Group__0 ) )
            {
            // InternalReactionRules.g:1199:2: ( ( rule__BidirectionalRule__Group__0 ) )
            // InternalReactionRules.g:1200:3: ( rule__BidirectionalRule__Group__0 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getGroup()); 
            // InternalReactionRules.g:1201:3: ( rule__BidirectionalRule__Group__0 )
            // InternalReactionRules.g:1201:4: rule__BidirectionalRule__Group__0
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
    // InternalReactionRules.g:1210:1: entryRuleRuleBody : ruleRuleBody EOF ;
    public final void entryRuleRuleBody() throws RecognitionException {
        try {
            // InternalReactionRules.g:1211:1: ( ruleRuleBody EOF )
            // InternalReactionRules.g:1212:1: ruleRuleBody EOF
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
    // InternalReactionRules.g:1219:1: ruleRuleBody : ( ( rule__RuleBody__Alternatives ) ) ;
    public final void ruleRuleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1223:2: ( ( ( rule__RuleBody__Alternatives ) ) )
            // InternalReactionRules.g:1224:2: ( ( rule__RuleBody__Alternatives ) )
            {
            // InternalReactionRules.g:1224:2: ( ( rule__RuleBody__Alternatives ) )
            // InternalReactionRules.g:1225:3: ( rule__RuleBody__Alternatives )
            {
             before(grammarAccess.getRuleBodyAccess().getAlternatives()); 
            // InternalReactionRules.g:1226:3: ( rule__RuleBody__Alternatives )
            // InternalReactionRules.g:1226:4: rule__RuleBody__Alternatives
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
    // InternalReactionRules.g:1235:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalReactionRules.g:1236:1: ( ruleRule EOF )
            // InternalReactionRules.g:1237:1: ruleRule EOF
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
    // InternalReactionRules.g:1244:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1248:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalReactionRules.g:1249:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalReactionRules.g:1249:2: ( ( rule__Rule__Group__0 ) )
            // InternalReactionRules.g:1250:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalReactionRules.g:1251:3: ( rule__Rule__Group__0 )
            // InternalReactionRules.g:1251:4: rule__Rule__Group__0
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
    // InternalReactionRules.g:1259:1: rule__ModelLocation__Alternatives : ( ( ruleModelUri ) | ( ruleModelPath ) );
    public final void rule__ModelLocation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1263:1: ( ( ruleModelUri ) | ( ruleModelPath ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalReactionRules.g:1264:2: ( ruleModelUri )
                    {
                    // InternalReactionRules.g:1264:2: ( ruleModelUri )
                    // InternalReactionRules.g:1265:3: ruleModelUri
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
                    // InternalReactionRules.g:1270:2: ( ruleModelPath )
                    {
                    // InternalReactionRules.g:1270:2: ( ruleModelPath )
                    // InternalReactionRules.g:1271:3: ruleModelPath
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
    // InternalReactionRules.g:1280:1: rule__ReactionProperty__Alternatives : ( ( ruleAgent ) | ( ruleVariable ) | ( ruleObservation ) | ( ruleInitial ) | ( ruleRule ) );
    public final void rule__ReactionProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1284:1: ( ( ruleAgent ) | ( ruleVariable ) | ( ruleObservation ) | ( ruleInitial ) | ( ruleRule ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            case 35:
                {
                alt2=4;
                }
                break;
            case 36:
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
                    // InternalReactionRules.g:1285:2: ( ruleAgent )
                    {
                    // InternalReactionRules.g:1285:2: ( ruleAgent )
                    // InternalReactionRules.g:1286:3: ruleAgent
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
                    // InternalReactionRules.g:1291:2: ( ruleVariable )
                    {
                    // InternalReactionRules.g:1291:2: ( ruleVariable )
                    // InternalReactionRules.g:1292:3: ruleVariable
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
                    // InternalReactionRules.g:1297:2: ( ruleObservation )
                    {
                    // InternalReactionRules.g:1297:2: ( ruleObservation )
                    // InternalReactionRules.g:1298:3: ruleObservation
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
                    // InternalReactionRules.g:1303:2: ( ruleInitial )
                    {
                    // InternalReactionRules.g:1303:2: ( ruleInitial )
                    // InternalReactionRules.g:1304:3: ruleInitial
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
                    // InternalReactionRules.g:1309:2: ( ruleRule )
                    {
                    // InternalReactionRules.g:1309:2: ( ruleRule )
                    // InternalReactionRules.g:1310:3: ruleRule
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


    // $ANTLR start "rule__ArithmeticType__Alternatives"
    // InternalReactionRules.g:1319:1: rule__ArithmeticType__Alternatives : ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) );
    public final void rule__ArithmeticType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1323:1: ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalReactionRules.g:1324:2: ( ruleFloat )
                    {
                    // InternalReactionRules.g:1324:2: ( ruleFloat )
                    // InternalReactionRules.g:1325:3: ruleFloat
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
                    // InternalReactionRules.g:1330:2: ( ruleUnsignedInteger )
                    {
                    // InternalReactionRules.g:1330:2: ( ruleUnsignedInteger )
                    // InternalReactionRules.g:1331:3: ruleUnsignedInteger
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
                    // InternalReactionRules.g:1336:2: ( ruleSignedInteger )
                    {
                    // InternalReactionRules.g:1336:2: ( ruleSignedInteger )
                    // InternalReactionRules.g:1337:3: ruleSignedInteger
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
                    // InternalReactionRules.g:1342:2: ( ruleScientificFloat )
                    {
                    // InternalReactionRules.g:1342:2: ( ruleScientificFloat )
                    // InternalReactionRules.g:1343:3: ruleScientificFloat
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
    // InternalReactionRules.g:1352:1: rule__Variable__Alternatives : ( ( rulePatternVariable ) | ( ruleArithmeticVariable ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1356:1: ( ( rulePatternVariable ) | ( ruleArithmeticVariable ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==31) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==24) ) {
                            alt4=1;
                        }
                        else if ( (LA4_3==RULE_INT||LA4_3==22) ) {
                            alt4=2;
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
                    // InternalReactionRules.g:1357:2: ( rulePatternVariable )
                    {
                    // InternalReactionRules.g:1357:2: ( rulePatternVariable )
                    // InternalReactionRules.g:1358:3: rulePatternVariable
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
                    // InternalReactionRules.g:1363:2: ( ruleArithmeticVariable )
                    {
                    // InternalReactionRules.g:1363:2: ( ruleArithmeticVariable )
                    // InternalReactionRules.g:1364:3: ruleArithmeticVariable
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
    // InternalReactionRules.g:1373:1: rule__LinkState__LinkStateAlternatives_1_0 : ( ( ruleSemiLink ) | ( ruleFreeLink ) | ( ruleExactLink ) | ( ruleIndexedLink ) | ( ruleWhatEver ) );
    public final void rule__LinkState__LinkStateAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1377:1: ( ( ruleSemiLink ) | ( ruleFreeLink ) | ( ruleExactLink ) | ( ruleIndexedLink ) | ( ruleWhatEver ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case RULE_SEMI_LINK:
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
                    // InternalReactionRules.g:1378:2: ( ruleSemiLink )
                    {
                    // InternalReactionRules.g:1378:2: ( ruleSemiLink )
                    // InternalReactionRules.g:1379:3: ruleSemiLink
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
                    // InternalReactionRules.g:1384:2: ( ruleFreeLink )
                    {
                    // InternalReactionRules.g:1384:2: ( ruleFreeLink )
                    // InternalReactionRules.g:1385:3: ruleFreeLink
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
                    // InternalReactionRules.g:1390:2: ( ruleExactLink )
                    {
                    // InternalReactionRules.g:1390:2: ( ruleExactLink )
                    // InternalReactionRules.g:1391:3: ruleExactLink
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
                    // InternalReactionRules.g:1396:2: ( ruleIndexedLink )
                    {
                    // InternalReactionRules.g:1396:2: ( ruleIndexedLink )
                    // InternalReactionRules.g:1397:3: ruleIndexedLink
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
                    // InternalReactionRules.g:1402:2: ( ruleWhatEver )
                    {
                    // InternalReactionRules.g:1402:2: ( ruleWhatEver )
                    // InternalReactionRules.g:1403:3: ruleWhatEver
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


    // $ANTLR start "rule__PatternAssignment__Alternatives"
    // InternalReactionRules.g:1412:1: rule__PatternAssignment__Alternatives : ( ( ruleAssignFromPattern ) | ( ruleAssignFromVariable ) );
    public final void rule__PatternAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1416:1: ( ( ruleAssignFromPattern ) | ( ruleAssignFromVariable ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalReactionRules.g:1417:2: ( ruleAssignFromPattern )
                    {
                    // InternalReactionRules.g:1417:2: ( ruleAssignFromPattern )
                    // InternalReactionRules.g:1418:3: ruleAssignFromPattern
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
                    // InternalReactionRules.g:1423:2: ( ruleAssignFromVariable )
                    {
                    // InternalReactionRules.g:1423:2: ( ruleAssignFromVariable )
                    // InternalReactionRules.g:1424:3: ruleAssignFromVariable
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
    // InternalReactionRules.g:1433:1: rule__RuleBody__Alternatives : ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) );
    public final void rule__RuleBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1437:1: ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalReactionRules.g:1438:2: ( ruleUnidirectionalRule )
                    {
                    // InternalReactionRules.g:1438:2: ( ruleUnidirectionalRule )
                    // InternalReactionRules.g:1439:3: ruleUnidirectionalRule
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
                    // InternalReactionRules.g:1444:2: ( ruleBidirectionalRule )
                    {
                    // InternalReactionRules.g:1444:2: ( ruleBidirectionalRule )
                    // InternalReactionRules.g:1445:3: ruleBidirectionalRule
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
    // InternalReactionRules.g:1454:1: rule__ReactionRuleModel__Group__0 : rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1 ;
    public final void rule__ReactionRuleModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1458:1: ( rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1 )
            // InternalReactionRules.g:1459:2: rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1
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
    // InternalReactionRules.g:1466:1: rule__ReactionRuleModel__Group__0__Impl : ( ( rule__ReactionRuleModel__ModelAssignment_0 ) ) ;
    public final void rule__ReactionRuleModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1470:1: ( ( ( rule__ReactionRuleModel__ModelAssignment_0 ) ) )
            // InternalReactionRules.g:1471:1: ( ( rule__ReactionRuleModel__ModelAssignment_0 ) )
            {
            // InternalReactionRules.g:1471:1: ( ( rule__ReactionRuleModel__ModelAssignment_0 ) )
            // InternalReactionRules.g:1472:2: ( rule__ReactionRuleModel__ModelAssignment_0 )
            {
             before(grammarAccess.getReactionRuleModelAccess().getModelAssignment_0()); 
            // InternalReactionRules.g:1473:2: ( rule__ReactionRuleModel__ModelAssignment_0 )
            // InternalReactionRules.g:1473:3: rule__ReactionRuleModel__ModelAssignment_0
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
    // InternalReactionRules.g:1481:1: rule__ReactionRuleModel__Group__1 : rule__ReactionRuleModel__Group__1__Impl rule__ReactionRuleModel__Group__2 ;
    public final void rule__ReactionRuleModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1485:1: ( rule__ReactionRuleModel__Group__1__Impl rule__ReactionRuleModel__Group__2 )
            // InternalReactionRules.g:1486:2: rule__ReactionRuleModel__Group__1__Impl rule__ReactionRuleModel__Group__2
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
    // InternalReactionRules.g:1493:1: rule__ReactionRuleModel__Group__1__Impl : ( ( rule__ReactionRuleModel__ReationContainerAssignment_1 ) ) ;
    public final void rule__ReactionRuleModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1497:1: ( ( ( rule__ReactionRuleModel__ReationContainerAssignment_1 ) ) )
            // InternalReactionRules.g:1498:1: ( ( rule__ReactionRuleModel__ReationContainerAssignment_1 ) )
            {
            // InternalReactionRules.g:1498:1: ( ( rule__ReactionRuleModel__ReationContainerAssignment_1 ) )
            // InternalReactionRules.g:1499:2: ( rule__ReactionRuleModel__ReationContainerAssignment_1 )
            {
             before(grammarAccess.getReactionRuleModelAccess().getReationContainerAssignment_1()); 
            // InternalReactionRules.g:1500:2: ( rule__ReactionRuleModel__ReationContainerAssignment_1 )
            // InternalReactionRules.g:1500:3: rule__ReactionRuleModel__ReationContainerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactionRuleModel__ReationContainerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactionRuleModelAccess().getReationContainerAssignment_1()); 

            }


            }

        }
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
    // InternalReactionRules.g:1508:1: rule__ReactionRuleModel__Group__2 : rule__ReactionRuleModel__Group__2__Impl ;
    public final void rule__ReactionRuleModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1512:1: ( rule__ReactionRuleModel__Group__2__Impl )
            // InternalReactionRules.g:1513:2: rule__ReactionRuleModel__Group__2__Impl
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
    // InternalReactionRules.g:1519:1: rule__ReactionRuleModel__Group__2__Impl : ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )* ) ;
    public final void rule__ReactionRuleModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1523:1: ( ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )* ) )
            // InternalReactionRules.g:1524:1: ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )* )
            {
            // InternalReactionRules.g:1524:1: ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )* )
            // InternalReactionRules.g:1525:2: ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )*
            {
             before(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesAssignment_2()); 
            // InternalReactionRules.g:1526:2: ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=29 && LA8_0<=30)||(LA8_0>=34 && LA8_0<=36)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalReactionRules.g:1526:3: rule__ReactionRuleModel__ReactionPropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ReactionRuleModel__ReactionPropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalReactionRules.g:1535:1: rule__ModelUri__Group__0 : rule__ModelUri__Group__0__Impl rule__ModelUri__Group__1 ;
    public final void rule__ModelUri__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1539:1: ( rule__ModelUri__Group__0__Impl rule__ModelUri__Group__1 )
            // InternalReactionRules.g:1540:2: rule__ModelUri__Group__0__Impl rule__ModelUri__Group__1
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
    // InternalReactionRules.g:1547:1: rule__ModelUri__Group__0__Impl : ( 'URI' ) ;
    public final void rule__ModelUri__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1551:1: ( ( 'URI' ) )
            // InternalReactionRules.g:1552:1: ( 'URI' )
            {
            // InternalReactionRules.g:1552:1: ( 'URI' )
            // InternalReactionRules.g:1553:2: 'URI'
            {
             before(grammarAccess.getModelUriAccess().getURIKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalReactionRules.g:1562:1: rule__ModelUri__Group__1 : rule__ModelUri__Group__1__Impl ;
    public final void rule__ModelUri__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1566:1: ( rule__ModelUri__Group__1__Impl )
            // InternalReactionRules.g:1567:2: rule__ModelUri__Group__1__Impl
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
    // InternalReactionRules.g:1573:1: rule__ModelUri__Group__1__Impl : ( ( rule__ModelUri__UriAssignment_1 ) ) ;
    public final void rule__ModelUri__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1577:1: ( ( ( rule__ModelUri__UriAssignment_1 ) ) )
            // InternalReactionRules.g:1578:1: ( ( rule__ModelUri__UriAssignment_1 ) )
            {
            // InternalReactionRules.g:1578:1: ( ( rule__ModelUri__UriAssignment_1 ) )
            // InternalReactionRules.g:1579:2: ( rule__ModelUri__UriAssignment_1 )
            {
             before(grammarAccess.getModelUriAccess().getUriAssignment_1()); 
            // InternalReactionRules.g:1580:2: ( rule__ModelUri__UriAssignment_1 )
            // InternalReactionRules.g:1580:3: rule__ModelUri__UriAssignment_1
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
    // InternalReactionRules.g:1589:1: rule__ModelPath__Group__0 : rule__ModelPath__Group__0__Impl rule__ModelPath__Group__1 ;
    public final void rule__ModelPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1593:1: ( rule__ModelPath__Group__0__Impl rule__ModelPath__Group__1 )
            // InternalReactionRules.g:1594:2: rule__ModelPath__Group__0__Impl rule__ModelPath__Group__1
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
    // InternalReactionRules.g:1601:1: rule__ModelPath__Group__0__Impl : ( 'PATH' ) ;
    public final void rule__ModelPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1605:1: ( ( 'PATH' ) )
            // InternalReactionRules.g:1606:1: ( 'PATH' )
            {
            // InternalReactionRules.g:1606:1: ( 'PATH' )
            // InternalReactionRules.g:1607:2: 'PATH'
            {
             before(grammarAccess.getModelPathAccess().getPATHKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalReactionRules.g:1616:1: rule__ModelPath__Group__1 : rule__ModelPath__Group__1__Impl ;
    public final void rule__ModelPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1620:1: ( rule__ModelPath__Group__1__Impl )
            // InternalReactionRules.g:1621:2: rule__ModelPath__Group__1__Impl
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
    // InternalReactionRules.g:1627:1: rule__ModelPath__Group__1__Impl : ( ( rule__ModelPath__PathAssignment_1 ) ) ;
    public final void rule__ModelPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1631:1: ( ( ( rule__ModelPath__PathAssignment_1 ) ) )
            // InternalReactionRules.g:1632:1: ( ( rule__ModelPath__PathAssignment_1 ) )
            {
            // InternalReactionRules.g:1632:1: ( ( rule__ModelPath__PathAssignment_1 ) )
            // InternalReactionRules.g:1633:2: ( rule__ModelPath__PathAssignment_1 )
            {
             before(grammarAccess.getModelPathAccess().getPathAssignment_1()); 
            // InternalReactionRules.g:1634:2: ( rule__ModelPath__PathAssignment_1 )
            // InternalReactionRules.g:1634:3: rule__ModelPath__PathAssignment_1
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
    // InternalReactionRules.g:1643:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1647:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalReactionRules.g:1648:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalReactionRules.g:1655:1: rule__Model__Group__0__Impl : ( 'ModelID' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1659:1: ( ( 'ModelID' ) )
            // InternalReactionRules.g:1660:1: ( 'ModelID' )
            {
            // InternalReactionRules.g:1660:1: ( 'ModelID' )
            // InternalReactionRules.g:1661:2: 'ModelID'
            {
             before(grammarAccess.getModelAccess().getModelIDKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalReactionRules.g:1670:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1674:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalReactionRules.g:1675:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalReactionRules.g:1682:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1686:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalReactionRules.g:1687:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:1687:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalReactionRules.g:1688:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:1689:2: ( rule__Model__NameAssignment_1 )
            // InternalReactionRules.g:1689:3: rule__Model__NameAssignment_1
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
    // InternalReactionRules.g:1697:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1701:1: ( rule__Model__Group__2__Impl )
            // InternalReactionRules.g:1702:2: rule__Model__Group__2__Impl
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
    // InternalReactionRules.g:1708:1: rule__Model__Group__2__Impl : ( ( rule__Model__LocationAssignment_2 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1712:1: ( ( ( rule__Model__LocationAssignment_2 )? ) )
            // InternalReactionRules.g:1713:1: ( ( rule__Model__LocationAssignment_2 )? )
            {
            // InternalReactionRules.g:1713:1: ( ( rule__Model__LocationAssignment_2 )? )
            // InternalReactionRules.g:1714:2: ( rule__Model__LocationAssignment_2 )?
            {
             before(grammarAccess.getModelAccess().getLocationAssignment_2()); 
            // InternalReactionRules.g:1715:2: ( rule__Model__LocationAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=18 && LA9_0<=19)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalReactionRules.g:1715:3: rule__Model__LocationAssignment_2
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
    // InternalReactionRules.g:1724:1: rule__ReactionContainer__Group__0 : rule__ReactionContainer__Group__0__Impl rule__ReactionContainer__Group__1 ;
    public final void rule__ReactionContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1728:1: ( rule__ReactionContainer__Group__0__Impl rule__ReactionContainer__Group__1 )
            // InternalReactionRules.g:1729:2: rule__ReactionContainer__Group__0__Impl rule__ReactionContainer__Group__1
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
    // InternalReactionRules.g:1736:1: rule__ReactionContainer__Group__0__Impl : ( () ) ;
    public final void rule__ReactionContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1740:1: ( ( () ) )
            // InternalReactionRules.g:1741:1: ( () )
            {
            // InternalReactionRules.g:1741:1: ( () )
            // InternalReactionRules.g:1742:2: ()
            {
             before(grammarAccess.getReactionContainerAccess().getReactionContainerAction_0()); 
            // InternalReactionRules.g:1743:2: ()
            // InternalReactionRules.g:1743:3: 
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
    // InternalReactionRules.g:1751:1: rule__ReactionContainer__Group__1 : rule__ReactionContainer__Group__1__Impl ;
    public final void rule__ReactionContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1755:1: ( rule__ReactionContainer__Group__1__Impl )
            // InternalReactionRules.g:1756:2: rule__ReactionContainer__Group__1__Impl
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
    // InternalReactionRules.g:1762:1: rule__ReactionContainer__Group__1__Impl : ( ( rule__ReactionContainer__AgentInstancesAssignment_1 )* ) ;
    public final void rule__ReactionContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1766:1: ( ( ( rule__ReactionContainer__AgentInstancesAssignment_1 )* ) )
            // InternalReactionRules.g:1767:1: ( ( rule__ReactionContainer__AgentInstancesAssignment_1 )* )
            {
            // InternalReactionRules.g:1767:1: ( ( rule__ReactionContainer__AgentInstancesAssignment_1 )* )
            // InternalReactionRules.g:1768:2: ( rule__ReactionContainer__AgentInstancesAssignment_1 )*
            {
             before(grammarAccess.getReactionContainerAccess().getAgentInstancesAssignment_1()); 
            // InternalReactionRules.g:1769:2: ( rule__ReactionContainer__AgentInstancesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalReactionRules.g:1769:3: rule__ReactionContainer__AgentInstancesAssignment_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ReactionContainer__AgentInstancesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalReactionRules.g:1778:1: rule__AgentInstanceSiteState__Group__0 : rule__AgentInstanceSiteState__Group__0__Impl rule__AgentInstanceSiteState__Group__1 ;
    public final void rule__AgentInstanceSiteState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1782:1: ( rule__AgentInstanceSiteState__Group__0__Impl rule__AgentInstanceSiteState__Group__1 )
            // InternalReactionRules.g:1783:2: rule__AgentInstanceSiteState__Group__0__Impl rule__AgentInstanceSiteState__Group__1
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
    // InternalReactionRules.g:1790:1: rule__AgentInstanceSiteState__Group__0__Impl : ( ( rule__AgentInstanceSiteState__SiteAssignment_0 ) ) ;
    public final void rule__AgentInstanceSiteState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1794:1: ( ( ( rule__AgentInstanceSiteState__SiteAssignment_0 ) ) )
            // InternalReactionRules.g:1795:1: ( ( rule__AgentInstanceSiteState__SiteAssignment_0 ) )
            {
            // InternalReactionRules.g:1795:1: ( ( rule__AgentInstanceSiteState__SiteAssignment_0 ) )
            // InternalReactionRules.g:1796:2: ( rule__AgentInstanceSiteState__SiteAssignment_0 )
            {
             before(grammarAccess.getAgentInstanceSiteStateAccess().getSiteAssignment_0()); 
            // InternalReactionRules.g:1797:2: ( rule__AgentInstanceSiteState__SiteAssignment_0 )
            // InternalReactionRules.g:1797:3: rule__AgentInstanceSiteState__SiteAssignment_0
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
    // InternalReactionRules.g:1805:1: rule__AgentInstanceSiteState__Group__1 : rule__AgentInstanceSiteState__Group__1__Impl ;
    public final void rule__AgentInstanceSiteState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1809:1: ( rule__AgentInstanceSiteState__Group__1__Impl )
            // InternalReactionRules.g:1810:2: rule__AgentInstanceSiteState__Group__1__Impl
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
    // InternalReactionRules.g:1816:1: rule__AgentInstanceSiteState__Group__1__Impl : ( ( rule__AgentInstanceSiteState__SiteStateAssignment_1 ) ) ;
    public final void rule__AgentInstanceSiteState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1820:1: ( ( ( rule__AgentInstanceSiteState__SiteStateAssignment_1 ) ) )
            // InternalReactionRules.g:1821:1: ( ( rule__AgentInstanceSiteState__SiteStateAssignment_1 ) )
            {
            // InternalReactionRules.g:1821:1: ( ( rule__AgentInstanceSiteState__SiteStateAssignment_1 ) )
            // InternalReactionRules.g:1822:2: ( rule__AgentInstanceSiteState__SiteStateAssignment_1 )
            {
             before(grammarAccess.getAgentInstanceSiteStateAccess().getSiteStateAssignment_1()); 
            // InternalReactionRules.g:1823:2: ( rule__AgentInstanceSiteState__SiteStateAssignment_1 )
            // InternalReactionRules.g:1823:3: rule__AgentInstanceSiteState__SiteStateAssignment_1
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
    // InternalReactionRules.g:1832:1: rule__AgentInstanceLinkState__Group__0 : rule__AgentInstanceLinkState__Group__0__Impl rule__AgentInstanceLinkState__Group__1 ;
    public final void rule__AgentInstanceLinkState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1836:1: ( rule__AgentInstanceLinkState__Group__0__Impl rule__AgentInstanceLinkState__Group__1 )
            // InternalReactionRules.g:1837:2: rule__AgentInstanceLinkState__Group__0__Impl rule__AgentInstanceLinkState__Group__1
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
    // InternalReactionRules.g:1844:1: rule__AgentInstanceLinkState__Group__0__Impl : ( ( rule__AgentInstanceLinkState__SiteAssignment_0 ) ) ;
    public final void rule__AgentInstanceLinkState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1848:1: ( ( ( rule__AgentInstanceLinkState__SiteAssignment_0 ) ) )
            // InternalReactionRules.g:1849:1: ( ( rule__AgentInstanceLinkState__SiteAssignment_0 ) )
            {
            // InternalReactionRules.g:1849:1: ( ( rule__AgentInstanceLinkState__SiteAssignment_0 ) )
            // InternalReactionRules.g:1850:2: ( rule__AgentInstanceLinkState__SiteAssignment_0 )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getSiteAssignment_0()); 
            // InternalReactionRules.g:1851:2: ( rule__AgentInstanceLinkState__SiteAssignment_0 )
            // InternalReactionRules.g:1851:3: rule__AgentInstanceLinkState__SiteAssignment_0
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
    // InternalReactionRules.g:1859:1: rule__AgentInstanceLinkState__Group__1 : rule__AgentInstanceLinkState__Group__1__Impl rule__AgentInstanceLinkState__Group__2 ;
    public final void rule__AgentInstanceLinkState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1863:1: ( rule__AgentInstanceLinkState__Group__1__Impl rule__AgentInstanceLinkState__Group__2 )
            // InternalReactionRules.g:1864:2: rule__AgentInstanceLinkState__Group__1__Impl rule__AgentInstanceLinkState__Group__2
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
    // InternalReactionRules.g:1871:1: rule__AgentInstanceLinkState__Group__1__Impl : ( ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 ) ) ;
    public final void rule__AgentInstanceLinkState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1875:1: ( ( ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 ) ) )
            // InternalReactionRules.g:1876:1: ( ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 ) )
            {
            // InternalReactionRules.g:1876:1: ( ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 ) )
            // InternalReactionRules.g:1877:2: ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedSiteAssignment_1()); 
            // InternalReactionRules.g:1878:2: ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 )
            // InternalReactionRules.g:1878:3: rule__AgentInstanceLinkState__AttachedSiteAssignment_1
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
    // InternalReactionRules.g:1886:1: rule__AgentInstanceLinkState__Group__2 : rule__AgentInstanceLinkState__Group__2__Impl rule__AgentInstanceLinkState__Group__3 ;
    public final void rule__AgentInstanceLinkState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1890:1: ( rule__AgentInstanceLinkState__Group__2__Impl rule__AgentInstanceLinkState__Group__3 )
            // InternalReactionRules.g:1891:2: rule__AgentInstanceLinkState__Group__2__Impl rule__AgentInstanceLinkState__Group__3
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
    // InternalReactionRules.g:1898:1: rule__AgentInstanceLinkState__Group__2__Impl : ( ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 ) ) ;
    public final void rule__AgentInstanceLinkState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1902:1: ( ( ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 ) ) )
            // InternalReactionRules.g:1903:1: ( ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 ) )
            {
            // InternalReactionRules.g:1903:1: ( ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 ) )
            // InternalReactionRules.g:1904:2: ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentAssignment_2()); 
            // InternalReactionRules.g:1905:2: ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 )
            // InternalReactionRules.g:1905:3: rule__AgentInstanceLinkState__AttachedAgentAssignment_2
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
    // InternalReactionRules.g:1913:1: rule__AgentInstanceLinkState__Group__3 : rule__AgentInstanceLinkState__Group__3__Impl rule__AgentInstanceLinkState__Group__4 ;
    public final void rule__AgentInstanceLinkState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1917:1: ( rule__AgentInstanceLinkState__Group__3__Impl rule__AgentInstanceLinkState__Group__4 )
            // InternalReactionRules.g:1918:2: rule__AgentInstanceLinkState__Group__3__Impl rule__AgentInstanceLinkState__Group__4
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
    // InternalReactionRules.g:1925:1: rule__AgentInstanceLinkState__Group__3__Impl : ( ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 ) ) ;
    public final void rule__AgentInstanceLinkState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1929:1: ( ( ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 ) ) )
            // InternalReactionRules.g:1930:1: ( ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 ) )
            {
            // InternalReactionRules.g:1930:1: ( ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 ) )
            // InternalReactionRules.g:1931:2: ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentInstanceAssignment_3()); 
            // InternalReactionRules.g:1932:2: ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 )
            // InternalReactionRules.g:1932:3: rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3
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
    // InternalReactionRules.g:1940:1: rule__AgentInstanceLinkState__Group__4 : rule__AgentInstanceLinkState__Group__4__Impl ;
    public final void rule__AgentInstanceLinkState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1944:1: ( rule__AgentInstanceLinkState__Group__4__Impl )
            // InternalReactionRules.g:1945:2: rule__AgentInstanceLinkState__Group__4__Impl
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
    // InternalReactionRules.g:1951:1: rule__AgentInstanceLinkState__Group__4__Impl : ( ( rule__AgentInstanceLinkState__LinkStateAssignment_4 ) ) ;
    public final void rule__AgentInstanceLinkState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1955:1: ( ( ( rule__AgentInstanceLinkState__LinkStateAssignment_4 ) ) )
            // InternalReactionRules.g:1956:1: ( ( rule__AgentInstanceLinkState__LinkStateAssignment_4 ) )
            {
            // InternalReactionRules.g:1956:1: ( ( rule__AgentInstanceLinkState__LinkStateAssignment_4 ) )
            // InternalReactionRules.g:1957:2: ( rule__AgentInstanceLinkState__LinkStateAssignment_4 )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getLinkStateAssignment_4()); 
            // InternalReactionRules.g:1958:2: ( rule__AgentInstanceLinkState__LinkStateAssignment_4 )
            // InternalReactionRules.g:1958:3: rule__AgentInstanceLinkState__LinkStateAssignment_4
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
    // InternalReactionRules.g:1967:1: rule__AgentInstance__Group__0 : rule__AgentInstance__Group__0__Impl rule__AgentInstance__Group__1 ;
    public final void rule__AgentInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1971:1: ( rule__AgentInstance__Group__0__Impl rule__AgentInstance__Group__1 )
            // InternalReactionRules.g:1972:2: rule__AgentInstance__Group__0__Impl rule__AgentInstance__Group__1
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
    // InternalReactionRules.g:1979:1: rule__AgentInstance__Group__0__Impl : ( 'AgentInstance' ) ;
    public final void rule__AgentInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1983:1: ( ( 'AgentInstance' ) )
            // InternalReactionRules.g:1984:1: ( 'AgentInstance' )
            {
            // InternalReactionRules.g:1984:1: ( 'AgentInstance' )
            // InternalReactionRules.g:1985:2: 'AgentInstance'
            {
             before(grammarAccess.getAgentInstanceAccess().getAgentInstanceKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalReactionRules.g:1994:1: rule__AgentInstance__Group__1 : rule__AgentInstance__Group__1__Impl rule__AgentInstance__Group__2 ;
    public final void rule__AgentInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1998:1: ( rule__AgentInstance__Group__1__Impl rule__AgentInstance__Group__2 )
            // InternalReactionRules.g:1999:2: rule__AgentInstance__Group__1__Impl rule__AgentInstance__Group__2
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
    // InternalReactionRules.g:2006:1: rule__AgentInstance__Group__1__Impl : ( ( rule__AgentInstance__NameAssignment_1 ) ) ;
    public final void rule__AgentInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2010:1: ( ( ( rule__AgentInstance__NameAssignment_1 ) ) )
            // InternalReactionRules.g:2011:1: ( ( rule__AgentInstance__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:2011:1: ( ( rule__AgentInstance__NameAssignment_1 ) )
            // InternalReactionRules.g:2012:2: ( rule__AgentInstance__NameAssignment_1 )
            {
             before(grammarAccess.getAgentInstanceAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:2013:2: ( rule__AgentInstance__NameAssignment_1 )
            // InternalReactionRules.g:2013:3: rule__AgentInstance__NameAssignment_1
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
    // InternalReactionRules.g:2021:1: rule__AgentInstance__Group__2 : rule__AgentInstance__Group__2__Impl rule__AgentInstance__Group__3 ;
    public final void rule__AgentInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2025:1: ( rule__AgentInstance__Group__2__Impl rule__AgentInstance__Group__3 )
            // InternalReactionRules.g:2026:2: rule__AgentInstance__Group__2__Impl rule__AgentInstance__Group__3
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
    // InternalReactionRules.g:2033:1: rule__AgentInstance__Group__2__Impl : ( ( rule__AgentInstance__AgentAssignment_2 ) ) ;
    public final void rule__AgentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2037:1: ( ( ( rule__AgentInstance__AgentAssignment_2 ) ) )
            // InternalReactionRules.g:2038:1: ( ( rule__AgentInstance__AgentAssignment_2 ) )
            {
            // InternalReactionRules.g:2038:1: ( ( rule__AgentInstance__AgentAssignment_2 ) )
            // InternalReactionRules.g:2039:2: ( rule__AgentInstance__AgentAssignment_2 )
            {
             before(grammarAccess.getAgentInstanceAccess().getAgentAssignment_2()); 
            // InternalReactionRules.g:2040:2: ( rule__AgentInstance__AgentAssignment_2 )
            // InternalReactionRules.g:2040:3: rule__AgentInstance__AgentAssignment_2
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
    // InternalReactionRules.g:2048:1: rule__AgentInstance__Group__3 : rule__AgentInstance__Group__3__Impl rule__AgentInstance__Group__4 ;
    public final void rule__AgentInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2052:1: ( rule__AgentInstance__Group__3__Impl rule__AgentInstance__Group__4 )
            // InternalReactionRules.g:2053:2: rule__AgentInstance__Group__3__Impl rule__AgentInstance__Group__4
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
    // InternalReactionRules.g:2060:1: rule__AgentInstance__Group__3__Impl : ( ( rule__AgentInstance__SiteStatesAssignment_3 ) ) ;
    public final void rule__AgentInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2064:1: ( ( ( rule__AgentInstance__SiteStatesAssignment_3 ) ) )
            // InternalReactionRules.g:2065:1: ( ( rule__AgentInstance__SiteStatesAssignment_3 ) )
            {
            // InternalReactionRules.g:2065:1: ( ( rule__AgentInstance__SiteStatesAssignment_3 ) )
            // InternalReactionRules.g:2066:2: ( rule__AgentInstance__SiteStatesAssignment_3 )
            {
             before(grammarAccess.getAgentInstanceAccess().getSiteStatesAssignment_3()); 
            // InternalReactionRules.g:2067:2: ( rule__AgentInstance__SiteStatesAssignment_3 )
            // InternalReactionRules.g:2067:3: rule__AgentInstance__SiteStatesAssignment_3
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
    // InternalReactionRules.g:2075:1: rule__AgentInstance__Group__4 : rule__AgentInstance__Group__4__Impl ;
    public final void rule__AgentInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2079:1: ( rule__AgentInstance__Group__4__Impl )
            // InternalReactionRules.g:2080:2: rule__AgentInstance__Group__4__Impl
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
    // InternalReactionRules.g:2086:1: rule__AgentInstance__Group__4__Impl : ( ( rule__AgentInstance__LinkStatesAssignment_4 ) ) ;
    public final void rule__AgentInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2090:1: ( ( ( rule__AgentInstance__LinkStatesAssignment_4 ) ) )
            // InternalReactionRules.g:2091:1: ( ( rule__AgentInstance__LinkStatesAssignment_4 ) )
            {
            // InternalReactionRules.g:2091:1: ( ( rule__AgentInstance__LinkStatesAssignment_4 ) )
            // InternalReactionRules.g:2092:2: ( rule__AgentInstance__LinkStatesAssignment_4 )
            {
             before(grammarAccess.getAgentInstanceAccess().getLinkStatesAssignment_4()); 
            // InternalReactionRules.g:2093:2: ( rule__AgentInstance__LinkStatesAssignment_4 )
            // InternalReactionRules.g:2093:3: rule__AgentInstance__LinkStatesAssignment_4
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
    // InternalReactionRules.g:2102:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2106:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalReactionRules.g:2107:2: rule__Float__Group__0__Impl rule__Float__Group__1
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
    // InternalReactionRules.g:2114:1: rule__Float__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2118:1: ( ( ( '-' )? ) )
            // InternalReactionRules.g:2119:1: ( ( '-' )? )
            {
            // InternalReactionRules.g:2119:1: ( ( '-' )? )
            // InternalReactionRules.g:2120:2: ( '-' )?
            {
             before(grammarAccess.getFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalReactionRules.g:2121:2: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalReactionRules.g:2121:3: '-'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalReactionRules.g:2129:1: rule__Float__Group__1 : rule__Float__Group__1__Impl rule__Float__Group__2 ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2133:1: ( rule__Float__Group__1__Impl rule__Float__Group__2 )
            // InternalReactionRules.g:2134:2: rule__Float__Group__1__Impl rule__Float__Group__2
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
    // InternalReactionRules.g:2141:1: rule__Float__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2145:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2146:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2146:1: ( RULE_INT )
            // InternalReactionRules.g:2147:2: RULE_INT
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
    // InternalReactionRules.g:2156:1: rule__Float__Group__2 : rule__Float__Group__2__Impl rule__Float__Group__3 ;
    public final void rule__Float__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2160:1: ( rule__Float__Group__2__Impl rule__Float__Group__3 )
            // InternalReactionRules.g:2161:2: rule__Float__Group__2__Impl rule__Float__Group__3
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
    // InternalReactionRules.g:2168:1: rule__Float__Group__2__Impl : ( '.' ) ;
    public final void rule__Float__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2172:1: ( ( '.' ) )
            // InternalReactionRules.g:2173:1: ( '.' )
            {
            // InternalReactionRules.g:2173:1: ( '.' )
            // InternalReactionRules.g:2174:2: '.'
            {
             before(grammarAccess.getFloatAccess().getFullStopKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalReactionRules.g:2183:1: rule__Float__Group__3 : rule__Float__Group__3__Impl ;
    public final void rule__Float__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2187:1: ( rule__Float__Group__3__Impl )
            // InternalReactionRules.g:2188:2: rule__Float__Group__3__Impl
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
    // InternalReactionRules.g:2194:1: rule__Float__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2198:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2199:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2199:1: ( RULE_INT )
            // InternalReactionRules.g:2200:2: RULE_INT
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
    // InternalReactionRules.g:2210:1: rule__ScientificFloat__Group__0 : rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1 ;
    public final void rule__ScientificFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2214:1: ( rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1 )
            // InternalReactionRules.g:2215:2: rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1
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
    // InternalReactionRules.g:2222:1: rule__ScientificFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ScientificFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2226:1: ( ( ( '-' )? ) )
            // InternalReactionRules.g:2227:1: ( ( '-' )? )
            {
            // InternalReactionRules.g:2227:1: ( ( '-' )? )
            // InternalReactionRules.g:2228:2: ( '-' )?
            {
             before(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalReactionRules.g:2229:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalReactionRules.g:2229:3: '-'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalReactionRules.g:2237:1: rule__ScientificFloat__Group__1 : rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2 ;
    public final void rule__ScientificFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2241:1: ( rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2 )
            // InternalReactionRules.g:2242:2: rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2
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
    // InternalReactionRules.g:2249:1: rule__ScientificFloat__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2253:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2254:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2254:1: ( RULE_INT )
            // InternalReactionRules.g:2255:2: RULE_INT
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
    // InternalReactionRules.g:2264:1: rule__ScientificFloat__Group__2 : rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3 ;
    public final void rule__ScientificFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2268:1: ( rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3 )
            // InternalReactionRules.g:2269:2: rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3
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
    // InternalReactionRules.g:2276:1: rule__ScientificFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__ScientificFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2280:1: ( ( '.' ) )
            // InternalReactionRules.g:2281:1: ( '.' )
            {
            // InternalReactionRules.g:2281:1: ( '.' )
            // InternalReactionRules.g:2282:2: '.'
            {
             before(grammarAccess.getScientificFloatAccess().getFullStopKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalReactionRules.g:2291:1: rule__ScientificFloat__Group__3 : rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4 ;
    public final void rule__ScientificFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2295:1: ( rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4 )
            // InternalReactionRules.g:2296:2: rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4
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
    // InternalReactionRules.g:2303:1: rule__ScientificFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2307:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2308:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2308:1: ( RULE_INT )
            // InternalReactionRules.g:2309:2: RULE_INT
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
    // InternalReactionRules.g:2318:1: rule__ScientificFloat__Group__4 : rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5 ;
    public final void rule__ScientificFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2322:1: ( rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5 )
            // InternalReactionRules.g:2323:2: rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5
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
    // InternalReactionRules.g:2330:1: rule__ScientificFloat__Group__4__Impl : ( RULE_EXPONENT ) ;
    public final void rule__ScientificFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2334:1: ( ( RULE_EXPONENT ) )
            // InternalReactionRules.g:2335:1: ( RULE_EXPONENT )
            {
            // InternalReactionRules.g:2335:1: ( RULE_EXPONENT )
            // InternalReactionRules.g:2336:2: RULE_EXPONENT
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
    // InternalReactionRules.g:2345:1: rule__ScientificFloat__Group__5 : rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6 ;
    public final void rule__ScientificFloat__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2349:1: ( rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6 )
            // InternalReactionRules.g:2350:2: rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalReactionRules.g:2357:1: rule__ScientificFloat__Group__5__Impl : ( ( '-' )? ) ;
    public final void rule__ScientificFloat__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2361:1: ( ( ( '-' )? ) )
            // InternalReactionRules.g:2362:1: ( ( '-' )? )
            {
            // InternalReactionRules.g:2362:1: ( ( '-' )? )
            // InternalReactionRules.g:2363:2: ( '-' )?
            {
             before(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_5()); 
            // InternalReactionRules.g:2364:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalReactionRules.g:2364:3: '-'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_5()); 

            }


            }

        }
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
    // InternalReactionRules.g:2372:1: rule__ScientificFloat__Group__6 : rule__ScientificFloat__Group__6__Impl ;
    public final void rule__ScientificFloat__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2376:1: ( rule__ScientificFloat__Group__6__Impl )
            // InternalReactionRules.g:2377:2: rule__ScientificFloat__Group__6__Impl
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
    // InternalReactionRules.g:2383:1: rule__ScientificFloat__Group__6__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2387:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2388:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2388:1: ( RULE_INT )
            // InternalReactionRules.g:2389:2: RULE_INT
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
    // InternalReactionRules.g:2399:1: rule__SignedInteger__Group__0 : rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 ;
    public final void rule__SignedInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2403:1: ( rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 )
            // InternalReactionRules.g:2404:2: rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1
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
    // InternalReactionRules.g:2411:1: rule__SignedInteger__Group__0__Impl : ( '-' ) ;
    public final void rule__SignedInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2415:1: ( ( '-' ) )
            // InternalReactionRules.g:2416:1: ( '-' )
            {
            // InternalReactionRules.g:2416:1: ( '-' )
            // InternalReactionRules.g:2417:2: '-'
            {
             before(grammarAccess.getSignedIntegerAccess().getHyphenMinusKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalReactionRules.g:2426:1: rule__SignedInteger__Group__1 : rule__SignedInteger__Group__1__Impl ;
    public final void rule__SignedInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2430:1: ( rule__SignedInteger__Group__1__Impl )
            // InternalReactionRules.g:2431:2: rule__SignedInteger__Group__1__Impl
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
    // InternalReactionRules.g:2437:1: rule__SignedInteger__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__SignedInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2441:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2442:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2442:1: ( RULE_INT )
            // InternalReactionRules.g:2443:2: RULE_INT
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
    // InternalReactionRules.g:2453:1: rule__States__Group__0 : rule__States__Group__0__Impl rule__States__Group__1 ;
    public final void rule__States__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2457:1: ( rule__States__Group__0__Impl rule__States__Group__1 )
            // InternalReactionRules.g:2458:2: rule__States__Group__0__Impl rule__States__Group__1
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
    // InternalReactionRules.g:2465:1: rule__States__Group__0__Impl : ( () ) ;
    public final void rule__States__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2469:1: ( ( () ) )
            // InternalReactionRules.g:2470:1: ( () )
            {
            // InternalReactionRules.g:2470:1: ( () )
            // InternalReactionRules.g:2471:2: ()
            {
             before(grammarAccess.getStatesAccess().getStatesAction_0()); 
            // InternalReactionRules.g:2472:2: ()
            // InternalReactionRules.g:2472:3: 
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
    // InternalReactionRules.g:2480:1: rule__States__Group__1 : rule__States__Group__1__Impl ;
    public final void rule__States__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2484:1: ( rule__States__Group__1__Impl )
            // InternalReactionRules.g:2485:2: rule__States__Group__1__Impl
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
    // InternalReactionRules.g:2491:1: rule__States__Group__1__Impl : ( ( rule__States__Group_1__0 )? ) ;
    public final void rule__States__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2495:1: ( ( ( rule__States__Group_1__0 )? ) )
            // InternalReactionRules.g:2496:1: ( ( rule__States__Group_1__0 )? )
            {
            // InternalReactionRules.g:2496:1: ( ( rule__States__Group_1__0 )? )
            // InternalReactionRules.g:2497:2: ( rule__States__Group_1__0 )?
            {
             before(grammarAccess.getStatesAccess().getGroup_1()); 
            // InternalReactionRules.g:2498:2: ( rule__States__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalReactionRules.g:2498:3: rule__States__Group_1__0
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
    // InternalReactionRules.g:2507:1: rule__States__Group_1__0 : rule__States__Group_1__0__Impl rule__States__Group_1__1 ;
    public final void rule__States__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2511:1: ( rule__States__Group_1__0__Impl rule__States__Group_1__1 )
            // InternalReactionRules.g:2512:2: rule__States__Group_1__0__Impl rule__States__Group_1__1
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
    // InternalReactionRules.g:2519:1: rule__States__Group_1__0__Impl : ( '{' ) ;
    public final void rule__States__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2523:1: ( ( '{' ) )
            // InternalReactionRules.g:2524:1: ( '{' )
            {
            // InternalReactionRules.g:2524:1: ( '{' )
            // InternalReactionRules.g:2525:2: '{'
            {
             before(grammarAccess.getStatesAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalReactionRules.g:2534:1: rule__States__Group_1__1 : rule__States__Group_1__1__Impl rule__States__Group_1__2 ;
    public final void rule__States__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2538:1: ( rule__States__Group_1__1__Impl rule__States__Group_1__2 )
            // InternalReactionRules.g:2539:2: rule__States__Group_1__1__Impl rule__States__Group_1__2
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
    // InternalReactionRules.g:2546:1: rule__States__Group_1__1__Impl : ( ( rule__States__StateAssignment_1_1 ) ) ;
    public final void rule__States__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2550:1: ( ( ( rule__States__StateAssignment_1_1 ) ) )
            // InternalReactionRules.g:2551:1: ( ( rule__States__StateAssignment_1_1 ) )
            {
            // InternalReactionRules.g:2551:1: ( ( rule__States__StateAssignment_1_1 ) )
            // InternalReactionRules.g:2552:2: ( rule__States__StateAssignment_1_1 )
            {
             before(grammarAccess.getStatesAccess().getStateAssignment_1_1()); 
            // InternalReactionRules.g:2553:2: ( rule__States__StateAssignment_1_1 )
            // InternalReactionRules.g:2553:3: rule__States__StateAssignment_1_1
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
    // InternalReactionRules.g:2561:1: rule__States__Group_1__2 : rule__States__Group_1__2__Impl rule__States__Group_1__3 ;
    public final void rule__States__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2565:1: ( rule__States__Group_1__2__Impl rule__States__Group_1__3 )
            // InternalReactionRules.g:2566:2: rule__States__Group_1__2__Impl rule__States__Group_1__3
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
    // InternalReactionRules.g:2573:1: rule__States__Group_1__2__Impl : ( ( rule__States__Group_1_2__0 )* ) ;
    public final void rule__States__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2577:1: ( ( ( rule__States__Group_1_2__0 )* ) )
            // InternalReactionRules.g:2578:1: ( ( rule__States__Group_1_2__0 )* )
            {
            // InternalReactionRules.g:2578:1: ( ( rule__States__Group_1_2__0 )* )
            // InternalReactionRules.g:2579:2: ( rule__States__Group_1_2__0 )*
            {
             before(grammarAccess.getStatesAccess().getGroup_1_2()); 
            // InternalReactionRules.g:2580:2: ( rule__States__Group_1_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalReactionRules.g:2580:3: rule__States__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalReactionRules.g:2588:1: rule__States__Group_1__3 : rule__States__Group_1__3__Impl ;
    public final void rule__States__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2592:1: ( rule__States__Group_1__3__Impl )
            // InternalReactionRules.g:2593:2: rule__States__Group_1__3__Impl
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
    // InternalReactionRules.g:2599:1: rule__States__Group_1__3__Impl : ( '}' ) ;
    public final void rule__States__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2603:1: ( ( '}' ) )
            // InternalReactionRules.g:2604:1: ( '}' )
            {
            // InternalReactionRules.g:2604:1: ( '}' )
            // InternalReactionRules.g:2605:2: '}'
            {
             before(grammarAccess.getStatesAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalReactionRules.g:2615:1: rule__States__Group_1_2__0 : rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1 ;
    public final void rule__States__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2619:1: ( rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1 )
            // InternalReactionRules.g:2620:2: rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1
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
    // InternalReactionRules.g:2627:1: rule__States__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__States__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2631:1: ( ( ',' ) )
            // InternalReactionRules.g:2632:1: ( ',' )
            {
            // InternalReactionRules.g:2632:1: ( ',' )
            // InternalReactionRules.g:2633:2: ','
            {
             before(grammarAccess.getStatesAccess().getCommaKeyword_1_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalReactionRules.g:2642:1: rule__States__Group_1_2__1 : rule__States__Group_1_2__1__Impl ;
    public final void rule__States__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2646:1: ( rule__States__Group_1_2__1__Impl )
            // InternalReactionRules.g:2647:2: rule__States__Group_1_2__1__Impl
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
    // InternalReactionRules.g:2653:1: rule__States__Group_1_2__1__Impl : ( ( rule__States__StateAssignment_1_2_1 ) ) ;
    public final void rule__States__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2657:1: ( ( ( rule__States__StateAssignment_1_2_1 ) ) )
            // InternalReactionRules.g:2658:1: ( ( rule__States__StateAssignment_1_2_1 ) )
            {
            // InternalReactionRules.g:2658:1: ( ( rule__States__StateAssignment_1_2_1 ) )
            // InternalReactionRules.g:2659:2: ( rule__States__StateAssignment_1_2_1 )
            {
             before(grammarAccess.getStatesAccess().getStateAssignment_1_2_1()); 
            // InternalReactionRules.g:2660:2: ( rule__States__StateAssignment_1_2_1 )
            // InternalReactionRules.g:2660:3: rule__States__StateAssignment_1_2_1
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
    // InternalReactionRules.g:2669:1: rule__Site__Group__0 : rule__Site__Group__0__Impl rule__Site__Group__1 ;
    public final void rule__Site__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2673:1: ( rule__Site__Group__0__Impl rule__Site__Group__1 )
            // InternalReactionRules.g:2674:2: rule__Site__Group__0__Impl rule__Site__Group__1
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
    // InternalReactionRules.g:2681:1: rule__Site__Group__0__Impl : ( ( rule__Site__NameAssignment_0 ) ) ;
    public final void rule__Site__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2685:1: ( ( ( rule__Site__NameAssignment_0 ) ) )
            // InternalReactionRules.g:2686:1: ( ( rule__Site__NameAssignment_0 ) )
            {
            // InternalReactionRules.g:2686:1: ( ( rule__Site__NameAssignment_0 ) )
            // InternalReactionRules.g:2687:2: ( rule__Site__NameAssignment_0 )
            {
             before(grammarAccess.getSiteAccess().getNameAssignment_0()); 
            // InternalReactionRules.g:2688:2: ( rule__Site__NameAssignment_0 )
            // InternalReactionRules.g:2688:3: rule__Site__NameAssignment_0
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
    // InternalReactionRules.g:2696:1: rule__Site__Group__1 : rule__Site__Group__1__Impl ;
    public final void rule__Site__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2700:1: ( rule__Site__Group__1__Impl )
            // InternalReactionRules.g:2701:2: rule__Site__Group__1__Impl
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
    // InternalReactionRules.g:2707:1: rule__Site__Group__1__Impl : ( ( rule__Site__StatesAssignment_1 ) ) ;
    public final void rule__Site__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2711:1: ( ( ( rule__Site__StatesAssignment_1 ) ) )
            // InternalReactionRules.g:2712:1: ( ( rule__Site__StatesAssignment_1 ) )
            {
            // InternalReactionRules.g:2712:1: ( ( rule__Site__StatesAssignment_1 ) )
            // InternalReactionRules.g:2713:2: ( rule__Site__StatesAssignment_1 )
            {
             before(grammarAccess.getSiteAccess().getStatesAssignment_1()); 
            // InternalReactionRules.g:2714:2: ( rule__Site__StatesAssignment_1 )
            // InternalReactionRules.g:2714:3: rule__Site__StatesAssignment_1
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
    // InternalReactionRules.g:2723:1: rule__Sites__Group__0 : rule__Sites__Group__0__Impl rule__Sites__Group__1 ;
    public final void rule__Sites__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2727:1: ( rule__Sites__Group__0__Impl rule__Sites__Group__1 )
            // InternalReactionRules.g:2728:2: rule__Sites__Group__0__Impl rule__Sites__Group__1
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
    // InternalReactionRules.g:2735:1: rule__Sites__Group__0__Impl : ( () ) ;
    public final void rule__Sites__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2739:1: ( ( () ) )
            // InternalReactionRules.g:2740:1: ( () )
            {
            // InternalReactionRules.g:2740:1: ( () )
            // InternalReactionRules.g:2741:2: ()
            {
             before(grammarAccess.getSitesAccess().getSitesAction_0()); 
            // InternalReactionRules.g:2742:2: ()
            // InternalReactionRules.g:2742:3: 
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
    // InternalReactionRules.g:2750:1: rule__Sites__Group__1 : rule__Sites__Group__1__Impl ;
    public final void rule__Sites__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2754:1: ( rule__Sites__Group__1__Impl )
            // InternalReactionRules.g:2755:2: rule__Sites__Group__1__Impl
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
    // InternalReactionRules.g:2761:1: rule__Sites__Group__1__Impl : ( ( rule__Sites__Group_1__0 )? ) ;
    public final void rule__Sites__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2765:1: ( ( ( rule__Sites__Group_1__0 )? ) )
            // InternalReactionRules.g:2766:1: ( ( rule__Sites__Group_1__0 )? )
            {
            // InternalReactionRules.g:2766:1: ( ( rule__Sites__Group_1__0 )? )
            // InternalReactionRules.g:2767:2: ( rule__Sites__Group_1__0 )?
            {
             before(grammarAccess.getSitesAccess().getGroup_1()); 
            // InternalReactionRules.g:2768:2: ( rule__Sites__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalReactionRules.g:2768:3: rule__Sites__Group_1__0
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
    // InternalReactionRules.g:2777:1: rule__Sites__Group_1__0 : rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1 ;
    public final void rule__Sites__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2781:1: ( rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1 )
            // InternalReactionRules.g:2782:2: rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1
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
    // InternalReactionRules.g:2789:1: rule__Sites__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Sites__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2793:1: ( ( '(' ) )
            // InternalReactionRules.g:2794:1: ( '(' )
            {
            // InternalReactionRules.g:2794:1: ( '(' )
            // InternalReactionRules.g:2795:2: '('
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
    // InternalReactionRules.g:2804:1: rule__Sites__Group_1__1 : rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2 ;
    public final void rule__Sites__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2808:1: ( rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2 )
            // InternalReactionRules.g:2809:2: rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2
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
    // InternalReactionRules.g:2816:1: rule__Sites__Group_1__1__Impl : ( ( rule__Sites__SitesAssignment_1_1 ) ) ;
    public final void rule__Sites__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2820:1: ( ( ( rule__Sites__SitesAssignment_1_1 ) ) )
            // InternalReactionRules.g:2821:1: ( ( rule__Sites__SitesAssignment_1_1 ) )
            {
            // InternalReactionRules.g:2821:1: ( ( rule__Sites__SitesAssignment_1_1 ) )
            // InternalReactionRules.g:2822:2: ( rule__Sites__SitesAssignment_1_1 )
            {
             before(grammarAccess.getSitesAccess().getSitesAssignment_1_1()); 
            // InternalReactionRules.g:2823:2: ( rule__Sites__SitesAssignment_1_1 )
            // InternalReactionRules.g:2823:3: rule__Sites__SitesAssignment_1_1
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
    // InternalReactionRules.g:2831:1: rule__Sites__Group_1__2 : rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3 ;
    public final void rule__Sites__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2835:1: ( rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3 )
            // InternalReactionRules.g:2836:2: rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3
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
    // InternalReactionRules.g:2843:1: rule__Sites__Group_1__2__Impl : ( ( rule__Sites__Group_1_2__0 )* ) ;
    public final void rule__Sites__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2847:1: ( ( ( rule__Sites__Group_1_2__0 )* ) )
            // InternalReactionRules.g:2848:1: ( ( rule__Sites__Group_1_2__0 )* )
            {
            // InternalReactionRules.g:2848:1: ( ( rule__Sites__Group_1_2__0 )* )
            // InternalReactionRules.g:2849:2: ( rule__Sites__Group_1_2__0 )*
            {
             before(grammarAccess.getSitesAccess().getGroup_1_2()); 
            // InternalReactionRules.g:2850:2: ( rule__Sites__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalReactionRules.g:2850:3: rule__Sites__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalReactionRules.g:2858:1: rule__Sites__Group_1__3 : rule__Sites__Group_1__3__Impl ;
    public final void rule__Sites__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2862:1: ( rule__Sites__Group_1__3__Impl )
            // InternalReactionRules.g:2863:2: rule__Sites__Group_1__3__Impl
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
    // InternalReactionRules.g:2869:1: rule__Sites__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Sites__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2873:1: ( ( ')' ) )
            // InternalReactionRules.g:2874:1: ( ')' )
            {
            // InternalReactionRules.g:2874:1: ( ')' )
            // InternalReactionRules.g:2875:2: ')'
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
    // InternalReactionRules.g:2885:1: rule__Sites__Group_1_2__0 : rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1 ;
    public final void rule__Sites__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2889:1: ( rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1 )
            // InternalReactionRules.g:2890:2: rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1
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
    // InternalReactionRules.g:2897:1: rule__Sites__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Sites__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2901:1: ( ( ',' ) )
            // InternalReactionRules.g:2902:1: ( ',' )
            {
            // InternalReactionRules.g:2902:1: ( ',' )
            // InternalReactionRules.g:2903:2: ','
            {
             before(grammarAccess.getSitesAccess().getCommaKeyword_1_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalReactionRules.g:2912:1: rule__Sites__Group_1_2__1 : rule__Sites__Group_1_2__1__Impl ;
    public final void rule__Sites__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2916:1: ( rule__Sites__Group_1_2__1__Impl )
            // InternalReactionRules.g:2917:2: rule__Sites__Group_1_2__1__Impl
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
    // InternalReactionRules.g:2923:1: rule__Sites__Group_1_2__1__Impl : ( ( rule__Sites__SitesAssignment_1_2_1 ) ) ;
    public final void rule__Sites__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2927:1: ( ( ( rule__Sites__SitesAssignment_1_2_1 ) ) )
            // InternalReactionRules.g:2928:1: ( ( rule__Sites__SitesAssignment_1_2_1 ) )
            {
            // InternalReactionRules.g:2928:1: ( ( rule__Sites__SitesAssignment_1_2_1 ) )
            // InternalReactionRules.g:2929:2: ( rule__Sites__SitesAssignment_1_2_1 )
            {
             before(grammarAccess.getSitesAccess().getSitesAssignment_1_2_1()); 
            // InternalReactionRules.g:2930:2: ( rule__Sites__SitesAssignment_1_2_1 )
            // InternalReactionRules.g:2930:3: rule__Sites__SitesAssignment_1_2_1
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
    // InternalReactionRules.g:2939:1: rule__Agent__Group__0 : rule__Agent__Group__0__Impl rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2943:1: ( rule__Agent__Group__0__Impl rule__Agent__Group__1 )
            // InternalReactionRules.g:2944:2: rule__Agent__Group__0__Impl rule__Agent__Group__1
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
    // InternalReactionRules.g:2951:1: rule__Agent__Group__0__Impl : ( 'agent' ) ;
    public final void rule__Agent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2955:1: ( ( 'agent' ) )
            // InternalReactionRules.g:2956:1: ( 'agent' )
            {
            // InternalReactionRules.g:2956:1: ( 'agent' )
            // InternalReactionRules.g:2957:2: 'agent'
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
    // InternalReactionRules.g:2966:1: rule__Agent__Group__1 : rule__Agent__Group__1__Impl rule__Agent__Group__2 ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2970:1: ( rule__Agent__Group__1__Impl rule__Agent__Group__2 )
            // InternalReactionRules.g:2971:2: rule__Agent__Group__1__Impl rule__Agent__Group__2
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
    // InternalReactionRules.g:2978:1: rule__Agent__Group__1__Impl : ( ( rule__Agent__NameAssignment_1 ) ) ;
    public final void rule__Agent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2982:1: ( ( ( rule__Agent__NameAssignment_1 ) ) )
            // InternalReactionRules.g:2983:1: ( ( rule__Agent__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:2983:1: ( ( rule__Agent__NameAssignment_1 ) )
            // InternalReactionRules.g:2984:2: ( rule__Agent__NameAssignment_1 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:2985:2: ( rule__Agent__NameAssignment_1 )
            // InternalReactionRules.g:2985:3: rule__Agent__NameAssignment_1
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
    // InternalReactionRules.g:2993:1: rule__Agent__Group__2 : rule__Agent__Group__2__Impl ;
    public final void rule__Agent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2997:1: ( rule__Agent__Group__2__Impl )
            // InternalReactionRules.g:2998:2: rule__Agent__Group__2__Impl
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
    // InternalReactionRules.g:3004:1: rule__Agent__Group__2__Impl : ( ( rule__Agent__SitesAssignment_2 ) ) ;
    public final void rule__Agent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3008:1: ( ( ( rule__Agent__SitesAssignment_2 ) ) )
            // InternalReactionRules.g:3009:1: ( ( rule__Agent__SitesAssignment_2 ) )
            {
            // InternalReactionRules.g:3009:1: ( ( rule__Agent__SitesAssignment_2 ) )
            // InternalReactionRules.g:3010:2: ( rule__Agent__SitesAssignment_2 )
            {
             before(grammarAccess.getAgentAccess().getSitesAssignment_2()); 
            // InternalReactionRules.g:3011:2: ( rule__Agent__SitesAssignment_2 )
            // InternalReactionRules.g:3011:3: rule__Agent__SitesAssignment_2
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
    // InternalReactionRules.g:3020:1: rule__PatternVariable__Group__0 : rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 ;
    public final void rule__PatternVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3024:1: ( rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 )
            // InternalReactionRules.g:3025:2: rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1
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
    // InternalReactionRules.g:3032:1: rule__PatternVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__PatternVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3036:1: ( ( 'var' ) )
            // InternalReactionRules.g:3037:1: ( 'var' )
            {
            // InternalReactionRules.g:3037:1: ( 'var' )
            // InternalReactionRules.g:3038:2: 'var'
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
    // InternalReactionRules.g:3047:1: rule__PatternVariable__Group__1 : rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 ;
    public final void rule__PatternVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3051:1: ( rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 )
            // InternalReactionRules.g:3052:2: rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2
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
    // InternalReactionRules.g:3059:1: rule__PatternVariable__Group__1__Impl : ( ( rule__PatternVariable__NameAssignment_1 ) ) ;
    public final void rule__PatternVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3063:1: ( ( ( rule__PatternVariable__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3064:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3064:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            // InternalReactionRules.g:3065:2: ( rule__PatternVariable__NameAssignment_1 )
            {
             before(grammarAccess.getPatternVariableAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3066:2: ( rule__PatternVariable__NameAssignment_1 )
            // InternalReactionRules.g:3066:3: rule__PatternVariable__NameAssignment_1
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
    // InternalReactionRules.g:3074:1: rule__PatternVariable__Group__2 : rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 ;
    public final void rule__PatternVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3078:1: ( rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 )
            // InternalReactionRules.g:3079:2: rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3
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
    // InternalReactionRules.g:3086:1: rule__PatternVariable__Group__2__Impl : ( '=' ) ;
    public final void rule__PatternVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3090:1: ( ( '=' ) )
            // InternalReactionRules.g:3091:1: ( '=' )
            {
            // InternalReactionRules.g:3091:1: ( '=' )
            // InternalReactionRules.g:3092:2: '='
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
    // InternalReactionRules.g:3101:1: rule__PatternVariable__Group__3 : rule__PatternVariable__Group__3__Impl ;
    public final void rule__PatternVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3105:1: ( rule__PatternVariable__Group__3__Impl )
            // InternalReactionRules.g:3106:2: rule__PatternVariable__Group__3__Impl
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
    // InternalReactionRules.g:3112:1: rule__PatternVariable__Group__3__Impl : ( ( rule__PatternVariable__PatternAssignment_3 ) ) ;
    public final void rule__PatternVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3116:1: ( ( ( rule__PatternVariable__PatternAssignment_3 ) ) )
            // InternalReactionRules.g:3117:1: ( ( rule__PatternVariable__PatternAssignment_3 ) )
            {
            // InternalReactionRules.g:3117:1: ( ( rule__PatternVariable__PatternAssignment_3 ) )
            // InternalReactionRules.g:3118:2: ( rule__PatternVariable__PatternAssignment_3 )
            {
             before(grammarAccess.getPatternVariableAccess().getPatternAssignment_3()); 
            // InternalReactionRules.g:3119:2: ( rule__PatternVariable__PatternAssignment_3 )
            // InternalReactionRules.g:3119:3: rule__PatternVariable__PatternAssignment_3
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
    // InternalReactionRules.g:3128:1: rule__ArithmeticVariable__Group__0 : rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1 ;
    public final void rule__ArithmeticVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3132:1: ( rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1 )
            // InternalReactionRules.g:3133:2: rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1
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
    // InternalReactionRules.g:3140:1: rule__ArithmeticVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__ArithmeticVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3144:1: ( ( 'var' ) )
            // InternalReactionRules.g:3145:1: ( 'var' )
            {
            // InternalReactionRules.g:3145:1: ( 'var' )
            // InternalReactionRules.g:3146:2: 'var'
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
    // InternalReactionRules.g:3155:1: rule__ArithmeticVariable__Group__1 : rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2 ;
    public final void rule__ArithmeticVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3159:1: ( rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2 )
            // InternalReactionRules.g:3160:2: rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2
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
    // InternalReactionRules.g:3167:1: rule__ArithmeticVariable__Group__1__Impl : ( ( rule__ArithmeticVariable__NameAssignment_1 ) ) ;
    public final void rule__ArithmeticVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3171:1: ( ( ( rule__ArithmeticVariable__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3172:1: ( ( rule__ArithmeticVariable__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3172:1: ( ( rule__ArithmeticVariable__NameAssignment_1 ) )
            // InternalReactionRules.g:3173:2: ( rule__ArithmeticVariable__NameAssignment_1 )
            {
             before(grammarAccess.getArithmeticVariableAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3174:2: ( rule__ArithmeticVariable__NameAssignment_1 )
            // InternalReactionRules.g:3174:3: rule__ArithmeticVariable__NameAssignment_1
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
    // InternalReactionRules.g:3182:1: rule__ArithmeticVariable__Group__2 : rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3 ;
    public final void rule__ArithmeticVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3186:1: ( rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3 )
            // InternalReactionRules.g:3187:2: rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalReactionRules.g:3194:1: rule__ArithmeticVariable__Group__2__Impl : ( '=' ) ;
    public final void rule__ArithmeticVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3198:1: ( ( '=' ) )
            // InternalReactionRules.g:3199:1: ( '=' )
            {
            // InternalReactionRules.g:3199:1: ( '=' )
            // InternalReactionRules.g:3200:2: '='
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
    // InternalReactionRules.g:3209:1: rule__ArithmeticVariable__Group__3 : rule__ArithmeticVariable__Group__3__Impl ;
    public final void rule__ArithmeticVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3213:1: ( rule__ArithmeticVariable__Group__3__Impl )
            // InternalReactionRules.g:3214:2: rule__ArithmeticVariable__Group__3__Impl
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
    // InternalReactionRules.g:3220:1: rule__ArithmeticVariable__Group__3__Impl : ( ( rule__ArithmeticVariable__ValueAssignment_3 ) ) ;
    public final void rule__ArithmeticVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3224:1: ( ( ( rule__ArithmeticVariable__ValueAssignment_3 ) ) )
            // InternalReactionRules.g:3225:1: ( ( rule__ArithmeticVariable__ValueAssignment_3 ) )
            {
            // InternalReactionRules.g:3225:1: ( ( rule__ArithmeticVariable__ValueAssignment_3 ) )
            // InternalReactionRules.g:3226:2: ( rule__ArithmeticVariable__ValueAssignment_3 )
            {
             before(grammarAccess.getArithmeticVariableAccess().getValueAssignment_3()); 
            // InternalReactionRules.g:3227:2: ( rule__ArithmeticVariable__ValueAssignment_3 )
            // InternalReactionRules.g:3227:3: rule__ArithmeticVariable__ValueAssignment_3
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
    // InternalReactionRules.g:3236:1: rule__SemiLink__Group__0 : rule__SemiLink__Group__0__Impl rule__SemiLink__Group__1 ;
    public final void rule__SemiLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3240:1: ( rule__SemiLink__Group__0__Impl rule__SemiLink__Group__1 )
            // InternalReactionRules.g:3241:2: rule__SemiLink__Group__0__Impl rule__SemiLink__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalReactionRules.g:3248:1: rule__SemiLink__Group__0__Impl : ( () ) ;
    public final void rule__SemiLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3252:1: ( ( () ) )
            // InternalReactionRules.g:3253:1: ( () )
            {
            // InternalReactionRules.g:3253:1: ( () )
            // InternalReactionRules.g:3254:2: ()
            {
             before(grammarAccess.getSemiLinkAccess().getSemiLinkAction_0()); 
            // InternalReactionRules.g:3255:2: ()
            // InternalReactionRules.g:3255:3: 
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
    // InternalReactionRules.g:3263:1: rule__SemiLink__Group__1 : rule__SemiLink__Group__1__Impl ;
    public final void rule__SemiLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3267:1: ( rule__SemiLink__Group__1__Impl )
            // InternalReactionRules.g:3268:2: rule__SemiLink__Group__1__Impl
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
    // InternalReactionRules.g:3274:1: rule__SemiLink__Group__1__Impl : ( ( rule__SemiLink__NameAssignment_1 ) ) ;
    public final void rule__SemiLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3278:1: ( ( ( rule__SemiLink__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3279:1: ( ( rule__SemiLink__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3279:1: ( ( rule__SemiLink__NameAssignment_1 ) )
            // InternalReactionRules.g:3280:2: ( rule__SemiLink__NameAssignment_1 )
            {
             before(grammarAccess.getSemiLinkAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3281:2: ( rule__SemiLink__NameAssignment_1 )
            // InternalReactionRules.g:3281:3: rule__SemiLink__NameAssignment_1
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
    // InternalReactionRules.g:3290:1: rule__FreeLink__Group__0 : rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1 ;
    public final void rule__FreeLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3294:1: ( rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1 )
            // InternalReactionRules.g:3295:2: rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalReactionRules.g:3302:1: rule__FreeLink__Group__0__Impl : ( () ) ;
    public final void rule__FreeLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3306:1: ( ( () ) )
            // InternalReactionRules.g:3307:1: ( () )
            {
            // InternalReactionRules.g:3307:1: ( () )
            // InternalReactionRules.g:3308:2: ()
            {
             before(grammarAccess.getFreeLinkAccess().getFreeLinkAction_0()); 
            // InternalReactionRules.g:3309:2: ()
            // InternalReactionRules.g:3309:3: 
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
    // InternalReactionRules.g:3317:1: rule__FreeLink__Group__1 : rule__FreeLink__Group__1__Impl ;
    public final void rule__FreeLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3321:1: ( rule__FreeLink__Group__1__Impl )
            // InternalReactionRules.g:3322:2: rule__FreeLink__Group__1__Impl
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
    // InternalReactionRules.g:3328:1: rule__FreeLink__Group__1__Impl : ( ( rule__FreeLink__NameAssignment_1 ) ) ;
    public final void rule__FreeLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3332:1: ( ( ( rule__FreeLink__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3333:1: ( ( rule__FreeLink__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3333:1: ( ( rule__FreeLink__NameAssignment_1 ) )
            // InternalReactionRules.g:3334:2: ( rule__FreeLink__NameAssignment_1 )
            {
             before(grammarAccess.getFreeLinkAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3335:2: ( rule__FreeLink__NameAssignment_1 )
            // InternalReactionRules.g:3335:3: rule__FreeLink__NameAssignment_1
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
    // InternalReactionRules.g:3344:1: rule__WhatEver__Group__0 : rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1 ;
    public final void rule__WhatEver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3348:1: ( rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1 )
            // InternalReactionRules.g:3349:2: rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1
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
    // InternalReactionRules.g:3356:1: rule__WhatEver__Group__0__Impl : ( () ) ;
    public final void rule__WhatEver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3360:1: ( ( () ) )
            // InternalReactionRules.g:3361:1: ( () )
            {
            // InternalReactionRules.g:3361:1: ( () )
            // InternalReactionRules.g:3362:2: ()
            {
             before(grammarAccess.getWhatEverAccess().getWhatEverAction_0()); 
            // InternalReactionRules.g:3363:2: ()
            // InternalReactionRules.g:3363:3: 
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
    // InternalReactionRules.g:3371:1: rule__WhatEver__Group__1 : rule__WhatEver__Group__1__Impl ;
    public final void rule__WhatEver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3375:1: ( rule__WhatEver__Group__1__Impl )
            // InternalReactionRules.g:3376:2: rule__WhatEver__Group__1__Impl
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
    // InternalReactionRules.g:3382:1: rule__WhatEver__Group__1__Impl : ( ( rule__WhatEver__NameAssignment_1 ) ) ;
    public final void rule__WhatEver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3386:1: ( ( ( rule__WhatEver__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3387:1: ( ( rule__WhatEver__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3387:1: ( ( rule__WhatEver__NameAssignment_1 ) )
            // InternalReactionRules.g:3388:2: ( rule__WhatEver__NameAssignment_1 )
            {
             before(grammarAccess.getWhatEverAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3389:2: ( rule__WhatEver__NameAssignment_1 )
            // InternalReactionRules.g:3389:3: rule__WhatEver__NameAssignment_1
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
    // InternalReactionRules.g:3398:1: rule__IndexedLink__Group__0 : rule__IndexedLink__Group__0__Impl rule__IndexedLink__Group__1 ;
    public final void rule__IndexedLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3402:1: ( rule__IndexedLink__Group__0__Impl rule__IndexedLink__Group__1 )
            // InternalReactionRules.g:3403:2: rule__IndexedLink__Group__0__Impl rule__IndexedLink__Group__1
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
    // InternalReactionRules.g:3410:1: rule__IndexedLink__Group__0__Impl : ( () ) ;
    public final void rule__IndexedLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3414:1: ( ( () ) )
            // InternalReactionRules.g:3415:1: ( () )
            {
            // InternalReactionRules.g:3415:1: ( () )
            // InternalReactionRules.g:3416:2: ()
            {
             before(grammarAccess.getIndexedLinkAccess().getIndexedLinkAction_0()); 
            // InternalReactionRules.g:3417:2: ()
            // InternalReactionRules.g:3417:3: 
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
    // InternalReactionRules.g:3425:1: rule__IndexedLink__Group__1 : rule__IndexedLink__Group__1__Impl ;
    public final void rule__IndexedLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3429:1: ( rule__IndexedLink__Group__1__Impl )
            // InternalReactionRules.g:3430:2: rule__IndexedLink__Group__1__Impl
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
    // InternalReactionRules.g:3436:1: rule__IndexedLink__Group__1__Impl : ( ( rule__IndexedLink__StateAssignment_1 ) ) ;
    public final void rule__IndexedLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3440:1: ( ( ( rule__IndexedLink__StateAssignment_1 ) ) )
            // InternalReactionRules.g:3441:1: ( ( rule__IndexedLink__StateAssignment_1 ) )
            {
            // InternalReactionRules.g:3441:1: ( ( rule__IndexedLink__StateAssignment_1 ) )
            // InternalReactionRules.g:3442:2: ( rule__IndexedLink__StateAssignment_1 )
            {
             before(grammarAccess.getIndexedLinkAccess().getStateAssignment_1()); 
            // InternalReactionRules.g:3443:2: ( rule__IndexedLink__StateAssignment_1 )
            // InternalReactionRules.g:3443:3: rule__IndexedLink__StateAssignment_1
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
    // InternalReactionRules.g:3452:1: rule__ExactLinkAgent__Group__0 : rule__ExactLinkAgent__Group__0__Impl rule__ExactLinkAgent__Group__1 ;
    public final void rule__ExactLinkAgent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3456:1: ( rule__ExactLinkAgent__Group__0__Impl rule__ExactLinkAgent__Group__1 )
            // InternalReactionRules.g:3457:2: rule__ExactLinkAgent__Group__0__Impl rule__ExactLinkAgent__Group__1
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
    // InternalReactionRules.g:3464:1: rule__ExactLinkAgent__Group__0__Impl : ( () ) ;
    public final void rule__ExactLinkAgent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3468:1: ( ( () ) )
            // InternalReactionRules.g:3469:1: ( () )
            {
            // InternalReactionRules.g:3469:1: ( () )
            // InternalReactionRules.g:3470:2: ()
            {
             before(grammarAccess.getExactLinkAgentAccess().getExactLinkAgentAction_0()); 
            // InternalReactionRules.g:3471:2: ()
            // InternalReactionRules.g:3471:3: 
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
    // InternalReactionRules.g:3479:1: rule__ExactLinkAgent__Group__1 : rule__ExactLinkAgent__Group__1__Impl ;
    public final void rule__ExactLinkAgent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3483:1: ( rule__ExactLinkAgent__Group__1__Impl )
            // InternalReactionRules.g:3484:2: rule__ExactLinkAgent__Group__1__Impl
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
    // InternalReactionRules.g:3490:1: rule__ExactLinkAgent__Group__1__Impl : ( ( rule__ExactLinkAgent__AgentAssignment_1 ) ) ;
    public final void rule__ExactLinkAgent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3494:1: ( ( ( rule__ExactLinkAgent__AgentAssignment_1 ) ) )
            // InternalReactionRules.g:3495:1: ( ( rule__ExactLinkAgent__AgentAssignment_1 ) )
            {
            // InternalReactionRules.g:3495:1: ( ( rule__ExactLinkAgent__AgentAssignment_1 ) )
            // InternalReactionRules.g:3496:2: ( rule__ExactLinkAgent__AgentAssignment_1 )
            {
             before(grammarAccess.getExactLinkAgentAccess().getAgentAssignment_1()); 
            // InternalReactionRules.g:3497:2: ( rule__ExactLinkAgent__AgentAssignment_1 )
            // InternalReactionRules.g:3497:3: rule__ExactLinkAgent__AgentAssignment_1
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
    // InternalReactionRules.g:3506:1: rule__ExactLinkSite__Group__0 : rule__ExactLinkSite__Group__0__Impl rule__ExactLinkSite__Group__1 ;
    public final void rule__ExactLinkSite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3510:1: ( rule__ExactLinkSite__Group__0__Impl rule__ExactLinkSite__Group__1 )
            // InternalReactionRules.g:3511:2: rule__ExactLinkSite__Group__0__Impl rule__ExactLinkSite__Group__1
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
    // InternalReactionRules.g:3518:1: rule__ExactLinkSite__Group__0__Impl : ( () ) ;
    public final void rule__ExactLinkSite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3522:1: ( ( () ) )
            // InternalReactionRules.g:3523:1: ( () )
            {
            // InternalReactionRules.g:3523:1: ( () )
            // InternalReactionRules.g:3524:2: ()
            {
             before(grammarAccess.getExactLinkSiteAccess().getExactLinkSiteAction_0()); 
            // InternalReactionRules.g:3525:2: ()
            // InternalReactionRules.g:3525:3: 
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
    // InternalReactionRules.g:3533:1: rule__ExactLinkSite__Group__1 : rule__ExactLinkSite__Group__1__Impl ;
    public final void rule__ExactLinkSite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3537:1: ( rule__ExactLinkSite__Group__1__Impl )
            // InternalReactionRules.g:3538:2: rule__ExactLinkSite__Group__1__Impl
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
    // InternalReactionRules.g:3544:1: rule__ExactLinkSite__Group__1__Impl : ( ( rule__ExactLinkSite__SiteAssignment_1 ) ) ;
    public final void rule__ExactLinkSite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3548:1: ( ( ( rule__ExactLinkSite__SiteAssignment_1 ) ) )
            // InternalReactionRules.g:3549:1: ( ( rule__ExactLinkSite__SiteAssignment_1 ) )
            {
            // InternalReactionRules.g:3549:1: ( ( rule__ExactLinkSite__SiteAssignment_1 ) )
            // InternalReactionRules.g:3550:2: ( rule__ExactLinkSite__SiteAssignment_1 )
            {
             before(grammarAccess.getExactLinkSiteAccess().getSiteAssignment_1()); 
            // InternalReactionRules.g:3551:2: ( rule__ExactLinkSite__SiteAssignment_1 )
            // InternalReactionRules.g:3551:3: rule__ExactLinkSite__SiteAssignment_1
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
    // InternalReactionRules.g:3560:1: rule__ExactLink__Group__0 : rule__ExactLink__Group__0__Impl rule__ExactLink__Group__1 ;
    public final void rule__ExactLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3564:1: ( rule__ExactLink__Group__0__Impl rule__ExactLink__Group__1 )
            // InternalReactionRules.g:3565:2: rule__ExactLink__Group__0__Impl rule__ExactLink__Group__1
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
    // InternalReactionRules.g:3572:1: rule__ExactLink__Group__0__Impl : ( () ) ;
    public final void rule__ExactLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3576:1: ( ( () ) )
            // InternalReactionRules.g:3577:1: ( () )
            {
            // InternalReactionRules.g:3577:1: ( () )
            // InternalReactionRules.g:3578:2: ()
            {
             before(grammarAccess.getExactLinkAccess().getExactLinkAction_0()); 
            // InternalReactionRules.g:3579:2: ()
            // InternalReactionRules.g:3579:3: 
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
    // InternalReactionRules.g:3587:1: rule__ExactLink__Group__1 : rule__ExactLink__Group__1__Impl rule__ExactLink__Group__2 ;
    public final void rule__ExactLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3591:1: ( rule__ExactLink__Group__1__Impl rule__ExactLink__Group__2 )
            // InternalReactionRules.g:3592:2: rule__ExactLink__Group__1__Impl rule__ExactLink__Group__2
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
    // InternalReactionRules.g:3599:1: rule__ExactLink__Group__1__Impl : ( ( rule__ExactLink__LinkAgentAssignment_1 ) ) ;
    public final void rule__ExactLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3603:1: ( ( ( rule__ExactLink__LinkAgentAssignment_1 ) ) )
            // InternalReactionRules.g:3604:1: ( ( rule__ExactLink__LinkAgentAssignment_1 ) )
            {
            // InternalReactionRules.g:3604:1: ( ( rule__ExactLink__LinkAgentAssignment_1 ) )
            // InternalReactionRules.g:3605:2: ( rule__ExactLink__LinkAgentAssignment_1 )
            {
             before(grammarAccess.getExactLinkAccess().getLinkAgentAssignment_1()); 
            // InternalReactionRules.g:3606:2: ( rule__ExactLink__LinkAgentAssignment_1 )
            // InternalReactionRules.g:3606:3: rule__ExactLink__LinkAgentAssignment_1
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
    // InternalReactionRules.g:3614:1: rule__ExactLink__Group__2 : rule__ExactLink__Group__2__Impl rule__ExactLink__Group__3 ;
    public final void rule__ExactLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3618:1: ( rule__ExactLink__Group__2__Impl rule__ExactLink__Group__3 )
            // InternalReactionRules.g:3619:2: rule__ExactLink__Group__2__Impl rule__ExactLink__Group__3
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
    // InternalReactionRules.g:3626:1: rule__ExactLink__Group__2__Impl : ( '.' ) ;
    public final void rule__ExactLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3630:1: ( ( '.' ) )
            // InternalReactionRules.g:3631:1: ( '.' )
            {
            // InternalReactionRules.g:3631:1: ( '.' )
            // InternalReactionRules.g:3632:2: '.'
            {
             before(grammarAccess.getExactLinkAccess().getFullStopKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalReactionRules.g:3641:1: rule__ExactLink__Group__3 : rule__ExactLink__Group__3__Impl ;
    public final void rule__ExactLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3645:1: ( rule__ExactLink__Group__3__Impl )
            // InternalReactionRules.g:3646:2: rule__ExactLink__Group__3__Impl
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
    // InternalReactionRules.g:3652:1: rule__ExactLink__Group__3__Impl : ( ( rule__ExactLink__LinkSiteAssignment_3 ) ) ;
    public final void rule__ExactLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3656:1: ( ( ( rule__ExactLink__LinkSiteAssignment_3 ) ) )
            // InternalReactionRules.g:3657:1: ( ( rule__ExactLink__LinkSiteAssignment_3 ) )
            {
            // InternalReactionRules.g:3657:1: ( ( rule__ExactLink__LinkSiteAssignment_3 ) )
            // InternalReactionRules.g:3658:2: ( rule__ExactLink__LinkSiteAssignment_3 )
            {
             before(grammarAccess.getExactLinkAccess().getLinkSiteAssignment_3()); 
            // InternalReactionRules.g:3659:2: ( rule__ExactLink__LinkSiteAssignment_3 )
            // InternalReactionRules.g:3659:3: rule__ExactLink__LinkSiteAssignment_3
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
    // InternalReactionRules.g:3668:1: rule__SiteState__Group__0 : rule__SiteState__Group__0__Impl rule__SiteState__Group__1 ;
    public final void rule__SiteState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3672:1: ( rule__SiteState__Group__0__Impl rule__SiteState__Group__1 )
            // InternalReactionRules.g:3673:2: rule__SiteState__Group__0__Impl rule__SiteState__Group__1
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
    // InternalReactionRules.g:3680:1: rule__SiteState__Group__0__Impl : ( () ) ;
    public final void rule__SiteState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3684:1: ( ( () ) )
            // InternalReactionRules.g:3685:1: ( () )
            {
            // InternalReactionRules.g:3685:1: ( () )
            // InternalReactionRules.g:3686:2: ()
            {
             before(grammarAccess.getSiteStateAccess().getSiteStateAction_0()); 
            // InternalReactionRules.g:3687:2: ()
            // InternalReactionRules.g:3687:3: 
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
    // InternalReactionRules.g:3695:1: rule__SiteState__Group__1 : rule__SiteState__Group__1__Impl ;
    public final void rule__SiteState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3699:1: ( rule__SiteState__Group__1__Impl )
            // InternalReactionRules.g:3700:2: rule__SiteState__Group__1__Impl
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
    // InternalReactionRules.g:3706:1: rule__SiteState__Group__1__Impl : ( ( rule__SiteState__StateAssignment_1 ) ) ;
    public final void rule__SiteState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3710:1: ( ( ( rule__SiteState__StateAssignment_1 ) ) )
            // InternalReactionRules.g:3711:1: ( ( rule__SiteState__StateAssignment_1 ) )
            {
            // InternalReactionRules.g:3711:1: ( ( rule__SiteState__StateAssignment_1 ) )
            // InternalReactionRules.g:3712:2: ( rule__SiteState__StateAssignment_1 )
            {
             before(grammarAccess.getSiteStateAccess().getStateAssignment_1()); 
            // InternalReactionRules.g:3713:2: ( rule__SiteState__StateAssignment_1 )
            // InternalReactionRules.g:3713:3: rule__SiteState__StateAssignment_1
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
    // InternalReactionRules.g:3722:1: rule__LinkState__Group__0 : rule__LinkState__Group__0__Impl rule__LinkState__Group__1 ;
    public final void rule__LinkState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3726:1: ( rule__LinkState__Group__0__Impl rule__LinkState__Group__1 )
            // InternalReactionRules.g:3727:2: rule__LinkState__Group__0__Impl rule__LinkState__Group__1
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
    // InternalReactionRules.g:3734:1: rule__LinkState__Group__0__Impl : ( () ) ;
    public final void rule__LinkState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3738:1: ( ( () ) )
            // InternalReactionRules.g:3739:1: ( () )
            {
            // InternalReactionRules.g:3739:1: ( () )
            // InternalReactionRules.g:3740:2: ()
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAction_0()); 
            // InternalReactionRules.g:3741:2: ()
            // InternalReactionRules.g:3741:3: 
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
    // InternalReactionRules.g:3749:1: rule__LinkState__Group__1 : rule__LinkState__Group__1__Impl ;
    public final void rule__LinkState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3753:1: ( rule__LinkState__Group__1__Impl )
            // InternalReactionRules.g:3754:2: rule__LinkState__Group__1__Impl
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
    // InternalReactionRules.g:3760:1: rule__LinkState__Group__1__Impl : ( ( rule__LinkState__LinkStateAssignment_1 ) ) ;
    public final void rule__LinkState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3764:1: ( ( ( rule__LinkState__LinkStateAssignment_1 ) ) )
            // InternalReactionRules.g:3765:1: ( ( rule__LinkState__LinkStateAssignment_1 ) )
            {
            // InternalReactionRules.g:3765:1: ( ( rule__LinkState__LinkStateAssignment_1 ) )
            // InternalReactionRules.g:3766:2: ( rule__LinkState__LinkStateAssignment_1 )
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAssignment_1()); 
            // InternalReactionRules.g:3767:2: ( rule__LinkState__LinkStateAssignment_1 )
            // InternalReactionRules.g:3767:3: rule__LinkState__LinkStateAssignment_1
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
    // InternalReactionRules.g:3776:1: rule__SitePattern__Group__0 : rule__SitePattern__Group__0__Impl rule__SitePattern__Group__1 ;
    public final void rule__SitePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3780:1: ( rule__SitePattern__Group__0__Impl rule__SitePattern__Group__1 )
            // InternalReactionRules.g:3781:2: rule__SitePattern__Group__0__Impl rule__SitePattern__Group__1
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
    // InternalReactionRules.g:3788:1: rule__SitePattern__Group__0__Impl : ( () ) ;
    public final void rule__SitePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3792:1: ( ( () ) )
            // InternalReactionRules.g:3793:1: ( () )
            {
            // InternalReactionRules.g:3793:1: ( () )
            // InternalReactionRules.g:3794:2: ()
            {
             before(grammarAccess.getSitePatternAccess().getSitePatternAction_0()); 
            // InternalReactionRules.g:3795:2: ()
            // InternalReactionRules.g:3795:3: 
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
    // InternalReactionRules.g:3803:1: rule__SitePattern__Group__1 : rule__SitePattern__Group__1__Impl rule__SitePattern__Group__2 ;
    public final void rule__SitePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3807:1: ( rule__SitePattern__Group__1__Impl rule__SitePattern__Group__2 )
            // InternalReactionRules.g:3808:2: rule__SitePattern__Group__1__Impl rule__SitePattern__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalReactionRules.g:3815:1: rule__SitePattern__Group__1__Impl : ( ( rule__SitePattern__SiteAssignment_1 ) ) ;
    public final void rule__SitePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3819:1: ( ( ( rule__SitePattern__SiteAssignment_1 ) ) )
            // InternalReactionRules.g:3820:1: ( ( rule__SitePattern__SiteAssignment_1 ) )
            {
            // InternalReactionRules.g:3820:1: ( ( rule__SitePattern__SiteAssignment_1 ) )
            // InternalReactionRules.g:3821:2: ( rule__SitePattern__SiteAssignment_1 )
            {
             before(grammarAccess.getSitePatternAccess().getSiteAssignment_1()); 
            // InternalReactionRules.g:3822:2: ( rule__SitePattern__SiteAssignment_1 )
            // InternalReactionRules.g:3822:3: rule__SitePattern__SiteAssignment_1
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
    // InternalReactionRules.g:3830:1: rule__SitePattern__Group__2 : rule__SitePattern__Group__2__Impl rule__SitePattern__Group__3 ;
    public final void rule__SitePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3834:1: ( rule__SitePattern__Group__2__Impl rule__SitePattern__Group__3 )
            // InternalReactionRules.g:3835:2: rule__SitePattern__Group__2__Impl rule__SitePattern__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalReactionRules.g:3842:1: rule__SitePattern__Group__2__Impl : ( ( rule__SitePattern__Group_2__0 )? ) ;
    public final void rule__SitePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3846:1: ( ( ( rule__SitePattern__Group_2__0 )? ) )
            // InternalReactionRules.g:3847:1: ( ( rule__SitePattern__Group_2__0 )? )
            {
            // InternalReactionRules.g:3847:1: ( ( rule__SitePattern__Group_2__0 )? )
            // InternalReactionRules.g:3848:2: ( rule__SitePattern__Group_2__0 )?
            {
             before(grammarAccess.getSitePatternAccess().getGroup_2()); 
            // InternalReactionRules.g:3849:2: ( rule__SitePattern__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalReactionRules.g:3849:3: rule__SitePattern__Group_2__0
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
    // InternalReactionRules.g:3857:1: rule__SitePattern__Group__3 : rule__SitePattern__Group__3__Impl rule__SitePattern__Group__4 ;
    public final void rule__SitePattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3861:1: ( rule__SitePattern__Group__3__Impl rule__SitePattern__Group__4 )
            // InternalReactionRules.g:3862:2: rule__SitePattern__Group__3__Impl rule__SitePattern__Group__4
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
    // InternalReactionRules.g:3869:1: rule__SitePattern__Group__3__Impl : ( '[' ) ;
    public final void rule__SitePattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3873:1: ( ( '[' ) )
            // InternalReactionRules.g:3874:1: ( '[' )
            {
            // InternalReactionRules.g:3874:1: ( '[' )
            // InternalReactionRules.g:3875:2: '['
            {
             before(grammarAccess.getSitePatternAccess().getLeftSquareBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalReactionRules.g:3884:1: rule__SitePattern__Group__4 : rule__SitePattern__Group__4__Impl rule__SitePattern__Group__5 ;
    public final void rule__SitePattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3888:1: ( rule__SitePattern__Group__4__Impl rule__SitePattern__Group__5 )
            // InternalReactionRules.g:3889:2: rule__SitePattern__Group__4__Impl rule__SitePattern__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalReactionRules.g:3896:1: rule__SitePattern__Group__4__Impl : ( ( rule__SitePattern__LinkStateAssignment_4 ) ) ;
    public final void rule__SitePattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3900:1: ( ( ( rule__SitePattern__LinkStateAssignment_4 ) ) )
            // InternalReactionRules.g:3901:1: ( ( rule__SitePattern__LinkStateAssignment_4 ) )
            {
            // InternalReactionRules.g:3901:1: ( ( rule__SitePattern__LinkStateAssignment_4 ) )
            // InternalReactionRules.g:3902:2: ( rule__SitePattern__LinkStateAssignment_4 )
            {
             before(grammarAccess.getSitePatternAccess().getLinkStateAssignment_4()); 
            // InternalReactionRules.g:3903:2: ( rule__SitePattern__LinkStateAssignment_4 )
            // InternalReactionRules.g:3903:3: rule__SitePattern__LinkStateAssignment_4
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
    // InternalReactionRules.g:3911:1: rule__SitePattern__Group__5 : rule__SitePattern__Group__5__Impl ;
    public final void rule__SitePattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3915:1: ( rule__SitePattern__Group__5__Impl )
            // InternalReactionRules.g:3916:2: rule__SitePattern__Group__5__Impl
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
    // InternalReactionRules.g:3922:1: rule__SitePattern__Group__5__Impl : ( ']' ) ;
    public final void rule__SitePattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3926:1: ( ( ']' ) )
            // InternalReactionRules.g:3927:1: ( ']' )
            {
            // InternalReactionRules.g:3927:1: ( ']' )
            // InternalReactionRules.g:3928:2: ']'
            {
             before(grammarAccess.getSitePatternAccess().getRightSquareBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
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
    // InternalReactionRules.g:3938:1: rule__SitePattern__Group_2__0 : rule__SitePattern__Group_2__0__Impl rule__SitePattern__Group_2__1 ;
    public final void rule__SitePattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3942:1: ( rule__SitePattern__Group_2__0__Impl rule__SitePattern__Group_2__1 )
            // InternalReactionRules.g:3943:2: rule__SitePattern__Group_2__0__Impl rule__SitePattern__Group_2__1
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
    // InternalReactionRules.g:3950:1: rule__SitePattern__Group_2__0__Impl : ( '{' ) ;
    public final void rule__SitePattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3954:1: ( ( '{' ) )
            // InternalReactionRules.g:3955:1: ( '{' )
            {
            // InternalReactionRules.g:3955:1: ( '{' )
            // InternalReactionRules.g:3956:2: '{'
            {
             before(grammarAccess.getSitePatternAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalReactionRules.g:3965:1: rule__SitePattern__Group_2__1 : rule__SitePattern__Group_2__1__Impl rule__SitePattern__Group_2__2 ;
    public final void rule__SitePattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3969:1: ( rule__SitePattern__Group_2__1__Impl rule__SitePattern__Group_2__2 )
            // InternalReactionRules.g:3970:2: rule__SitePattern__Group_2__1__Impl rule__SitePattern__Group_2__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalReactionRules.g:3977:1: rule__SitePattern__Group_2__1__Impl : ( ( rule__SitePattern__StateAssignment_2_1 ) ) ;
    public final void rule__SitePattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3981:1: ( ( ( rule__SitePattern__StateAssignment_2_1 ) ) )
            // InternalReactionRules.g:3982:1: ( ( rule__SitePattern__StateAssignment_2_1 ) )
            {
            // InternalReactionRules.g:3982:1: ( ( rule__SitePattern__StateAssignment_2_1 ) )
            // InternalReactionRules.g:3983:2: ( rule__SitePattern__StateAssignment_2_1 )
            {
             before(grammarAccess.getSitePatternAccess().getStateAssignment_2_1()); 
            // InternalReactionRules.g:3984:2: ( rule__SitePattern__StateAssignment_2_1 )
            // InternalReactionRules.g:3984:3: rule__SitePattern__StateAssignment_2_1
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
    // InternalReactionRules.g:3992:1: rule__SitePattern__Group_2__2 : rule__SitePattern__Group_2__2__Impl ;
    public final void rule__SitePattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3996:1: ( rule__SitePattern__Group_2__2__Impl )
            // InternalReactionRules.g:3997:2: rule__SitePattern__Group_2__2__Impl
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
    // InternalReactionRules.g:4003:1: rule__SitePattern__Group_2__2__Impl : ( '}' ) ;
    public final void rule__SitePattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4007:1: ( ( '}' ) )
            // InternalReactionRules.g:4008:1: ( '}' )
            {
            // InternalReactionRules.g:4008:1: ( '}' )
            // InternalReactionRules.g:4009:2: '}'
            {
             before(grammarAccess.getSitePatternAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalReactionRules.g:4019:1: rule__SitePatterns__Group__0 : rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1 ;
    public final void rule__SitePatterns__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4023:1: ( rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1 )
            // InternalReactionRules.g:4024:2: rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1
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
    // InternalReactionRules.g:4031:1: rule__SitePatterns__Group__0__Impl : ( () ) ;
    public final void rule__SitePatterns__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4035:1: ( ( () ) )
            // InternalReactionRules.g:4036:1: ( () )
            {
            // InternalReactionRules.g:4036:1: ( () )
            // InternalReactionRules.g:4037:2: ()
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAction_0()); 
            // InternalReactionRules.g:4038:2: ()
            // InternalReactionRules.g:4038:3: 
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
    // InternalReactionRules.g:4046:1: rule__SitePatterns__Group__1 : rule__SitePatterns__Group__1__Impl ;
    public final void rule__SitePatterns__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4050:1: ( rule__SitePatterns__Group__1__Impl )
            // InternalReactionRules.g:4051:2: rule__SitePatterns__Group__1__Impl
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
    // InternalReactionRules.g:4057:1: rule__SitePatterns__Group__1__Impl : ( ( rule__SitePatterns__Group_1__0 )? ) ;
    public final void rule__SitePatterns__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4061:1: ( ( ( rule__SitePatterns__Group_1__0 )? ) )
            // InternalReactionRules.g:4062:1: ( ( rule__SitePatterns__Group_1__0 )? )
            {
            // InternalReactionRules.g:4062:1: ( ( rule__SitePatterns__Group_1__0 )? )
            // InternalReactionRules.g:4063:2: ( rule__SitePatterns__Group_1__0 )?
            {
             before(grammarAccess.getSitePatternsAccess().getGroup_1()); 
            // InternalReactionRules.g:4064:2: ( rule__SitePatterns__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalReactionRules.g:4064:3: rule__SitePatterns__Group_1__0
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
    // InternalReactionRules.g:4073:1: rule__SitePatterns__Group_1__0 : rule__SitePatterns__Group_1__0__Impl rule__SitePatterns__Group_1__1 ;
    public final void rule__SitePatterns__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4077:1: ( rule__SitePatterns__Group_1__0__Impl rule__SitePatterns__Group_1__1 )
            // InternalReactionRules.g:4078:2: rule__SitePatterns__Group_1__0__Impl rule__SitePatterns__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalReactionRules.g:4085:1: rule__SitePatterns__Group_1__0__Impl : ( ( rule__SitePatterns__SitePatternsAssignment_1_0 ) ) ;
    public final void rule__SitePatterns__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4089:1: ( ( ( rule__SitePatterns__SitePatternsAssignment_1_0 ) ) )
            // InternalReactionRules.g:4090:1: ( ( rule__SitePatterns__SitePatternsAssignment_1_0 ) )
            {
            // InternalReactionRules.g:4090:1: ( ( rule__SitePatterns__SitePatternsAssignment_1_0 ) )
            // InternalReactionRules.g:4091:2: ( rule__SitePatterns__SitePatternsAssignment_1_0 )
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAssignment_1_0()); 
            // InternalReactionRules.g:4092:2: ( rule__SitePatterns__SitePatternsAssignment_1_0 )
            // InternalReactionRules.g:4092:3: rule__SitePatterns__SitePatternsAssignment_1_0
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
    // InternalReactionRules.g:4100:1: rule__SitePatterns__Group_1__1 : rule__SitePatterns__Group_1__1__Impl ;
    public final void rule__SitePatterns__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4104:1: ( rule__SitePatterns__Group_1__1__Impl )
            // InternalReactionRules.g:4105:2: rule__SitePatterns__Group_1__1__Impl
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
    // InternalReactionRules.g:4111:1: rule__SitePatterns__Group_1__1__Impl : ( ( rule__SitePatterns__Group_1_1__0 )* ) ;
    public final void rule__SitePatterns__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4115:1: ( ( ( rule__SitePatterns__Group_1_1__0 )* ) )
            // InternalReactionRules.g:4116:1: ( ( rule__SitePatterns__Group_1_1__0 )* )
            {
            // InternalReactionRules.g:4116:1: ( ( rule__SitePatterns__Group_1_1__0 )* )
            // InternalReactionRules.g:4117:2: ( rule__SitePatterns__Group_1_1__0 )*
            {
             before(grammarAccess.getSitePatternsAccess().getGroup_1_1()); 
            // InternalReactionRules.g:4118:2: ( rule__SitePatterns__Group_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalReactionRules.g:4118:3: rule__SitePatterns__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SitePatterns__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalReactionRules.g:4127:1: rule__SitePatterns__Group_1_1__0 : rule__SitePatterns__Group_1_1__0__Impl rule__SitePatterns__Group_1_1__1 ;
    public final void rule__SitePatterns__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4131:1: ( rule__SitePatterns__Group_1_1__0__Impl rule__SitePatterns__Group_1_1__1 )
            // InternalReactionRules.g:4132:2: rule__SitePatterns__Group_1_1__0__Impl rule__SitePatterns__Group_1_1__1
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
    // InternalReactionRules.g:4139:1: rule__SitePatterns__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__SitePatterns__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4143:1: ( ( ',' ) )
            // InternalReactionRules.g:4144:1: ( ',' )
            {
            // InternalReactionRules.g:4144:1: ( ',' )
            // InternalReactionRules.g:4145:2: ','
            {
             before(grammarAccess.getSitePatternsAccess().getCommaKeyword_1_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalReactionRules.g:4154:1: rule__SitePatterns__Group_1_1__1 : rule__SitePatterns__Group_1_1__1__Impl ;
    public final void rule__SitePatterns__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4158:1: ( rule__SitePatterns__Group_1_1__1__Impl )
            // InternalReactionRules.g:4159:2: rule__SitePatterns__Group_1_1__1__Impl
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
    // InternalReactionRules.g:4165:1: rule__SitePatterns__Group_1_1__1__Impl : ( ( rule__SitePatterns__SitePatternsAssignment_1_1_1 ) ) ;
    public final void rule__SitePatterns__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4169:1: ( ( ( rule__SitePatterns__SitePatternsAssignment_1_1_1 ) ) )
            // InternalReactionRules.g:4170:1: ( ( rule__SitePatterns__SitePatternsAssignment_1_1_1 ) )
            {
            // InternalReactionRules.g:4170:1: ( ( rule__SitePatterns__SitePatternsAssignment_1_1_1 ) )
            // InternalReactionRules.g:4171:2: ( rule__SitePatterns__SitePatternsAssignment_1_1_1 )
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAssignment_1_1_1()); 
            // InternalReactionRules.g:4172:2: ( rule__SitePatterns__SitePatternsAssignment_1_1_1 )
            // InternalReactionRules.g:4172:3: rule__SitePatterns__SitePatternsAssignment_1_1_1
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


    // $ANTLR start "rule__AgentPattern__Group__0"
    // InternalReactionRules.g:4181:1: rule__AgentPattern__Group__0 : rule__AgentPattern__Group__0__Impl rule__AgentPattern__Group__1 ;
    public final void rule__AgentPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4185:1: ( rule__AgentPattern__Group__0__Impl rule__AgentPattern__Group__1 )
            // InternalReactionRules.g:4186:2: rule__AgentPattern__Group__0__Impl rule__AgentPattern__Group__1
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
    // InternalReactionRules.g:4193:1: rule__AgentPattern__Group__0__Impl : ( () ) ;
    public final void rule__AgentPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4197:1: ( ( () ) )
            // InternalReactionRules.g:4198:1: ( () )
            {
            // InternalReactionRules.g:4198:1: ( () )
            // InternalReactionRules.g:4199:2: ()
            {
             before(grammarAccess.getAgentPatternAccess().getAgentPatternAction_0()); 
            // InternalReactionRules.g:4200:2: ()
            // InternalReactionRules.g:4200:3: 
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
    // InternalReactionRules.g:4208:1: rule__AgentPattern__Group__1 : rule__AgentPattern__Group__1__Impl rule__AgentPattern__Group__2 ;
    public final void rule__AgentPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4212:1: ( rule__AgentPattern__Group__1__Impl rule__AgentPattern__Group__2 )
            // InternalReactionRules.g:4213:2: rule__AgentPattern__Group__1__Impl rule__AgentPattern__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalReactionRules.g:4220:1: rule__AgentPattern__Group__1__Impl : ( ( rule__AgentPattern__AgentAssignment_1 ) ) ;
    public final void rule__AgentPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4224:1: ( ( ( rule__AgentPattern__AgentAssignment_1 ) ) )
            // InternalReactionRules.g:4225:1: ( ( rule__AgentPattern__AgentAssignment_1 ) )
            {
            // InternalReactionRules.g:4225:1: ( ( rule__AgentPattern__AgentAssignment_1 ) )
            // InternalReactionRules.g:4226:2: ( rule__AgentPattern__AgentAssignment_1 )
            {
             before(grammarAccess.getAgentPatternAccess().getAgentAssignment_1()); 
            // InternalReactionRules.g:4227:2: ( rule__AgentPattern__AgentAssignment_1 )
            // InternalReactionRules.g:4227:3: rule__AgentPattern__AgentAssignment_1
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
    // InternalReactionRules.g:4235:1: rule__AgentPattern__Group__2 : rule__AgentPattern__Group__2__Impl rule__AgentPattern__Group__3 ;
    public final void rule__AgentPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4239:1: ( rule__AgentPattern__Group__2__Impl rule__AgentPattern__Group__3 )
            // InternalReactionRules.g:4240:2: rule__AgentPattern__Group__2__Impl rule__AgentPattern__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:4247:1: rule__AgentPattern__Group__2__Impl : ( '(' ) ;
    public final void rule__AgentPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4251:1: ( ( '(' ) )
            // InternalReactionRules.g:4252:1: ( '(' )
            {
            // InternalReactionRules.g:4252:1: ( '(' )
            // InternalReactionRules.g:4253:2: '('
            {
             before(grammarAccess.getAgentPatternAccess().getLeftParenthesisKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalReactionRules.g:4262:1: rule__AgentPattern__Group__3 : rule__AgentPattern__Group__3__Impl rule__AgentPattern__Group__4 ;
    public final void rule__AgentPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4266:1: ( rule__AgentPattern__Group__3__Impl rule__AgentPattern__Group__4 )
            // InternalReactionRules.g:4267:2: rule__AgentPattern__Group__3__Impl rule__AgentPattern__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalReactionRules.g:4274:1: rule__AgentPattern__Group__3__Impl : ( ( rule__AgentPattern__SitePatternsAssignment_3 ) ) ;
    public final void rule__AgentPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4278:1: ( ( ( rule__AgentPattern__SitePatternsAssignment_3 ) ) )
            // InternalReactionRules.g:4279:1: ( ( rule__AgentPattern__SitePatternsAssignment_3 ) )
            {
            // InternalReactionRules.g:4279:1: ( ( rule__AgentPattern__SitePatternsAssignment_3 ) )
            // InternalReactionRules.g:4280:2: ( rule__AgentPattern__SitePatternsAssignment_3 )
            {
             before(grammarAccess.getAgentPatternAccess().getSitePatternsAssignment_3()); 
            // InternalReactionRules.g:4281:2: ( rule__AgentPattern__SitePatternsAssignment_3 )
            // InternalReactionRules.g:4281:3: rule__AgentPattern__SitePatternsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AgentPattern__SitePatternsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAgentPatternAccess().getSitePatternsAssignment_3()); 

            }


            }

        }
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
    // InternalReactionRules.g:4289:1: rule__AgentPattern__Group__4 : rule__AgentPattern__Group__4__Impl ;
    public final void rule__AgentPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4293:1: ( rule__AgentPattern__Group__4__Impl )
            // InternalReactionRules.g:4294:2: rule__AgentPattern__Group__4__Impl
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
    // InternalReactionRules.g:4300:1: rule__AgentPattern__Group__4__Impl : ( ')' ) ;
    public final void rule__AgentPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4304:1: ( ( ')' ) )
            // InternalReactionRules.g:4305:1: ( ')' )
            {
            // InternalReactionRules.g:4305:1: ( ')' )
            // InternalReactionRules.g:4306:2: ')'
            {
             before(grammarAccess.getAgentPatternAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
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


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalReactionRules.g:4316:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4320:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalReactionRules.g:4321:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // InternalReactionRules.g:4328:1: rule__Pattern__Group__0__Impl : ( () ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4332:1: ( ( () ) )
            // InternalReactionRules.g:4333:1: ( () )
            {
            // InternalReactionRules.g:4333:1: ( () )
            // InternalReactionRules.g:4334:2: ()
            {
             before(grammarAccess.getPatternAccess().getPatternAction_0()); 
            // InternalReactionRules.g:4335:2: ()
            // InternalReactionRules.g:4335:3: 
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
    // InternalReactionRules.g:4343:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4347:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalReactionRules.g:4348:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalReactionRules.g:4355:1: rule__Pattern__Group__1__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4359:1: ( ( '{' ) )
            // InternalReactionRules.g:4360:1: ( '{' )
            {
            // InternalReactionRules.g:4360:1: ( '{' )
            // InternalReactionRules.g:4361:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalReactionRules.g:4370:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4374:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalReactionRules.g:4375:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalReactionRules.g:4382:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__Group_2__0 )? ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4386:1: ( ( ( rule__Pattern__Group_2__0 )? ) )
            // InternalReactionRules.g:4387:1: ( ( rule__Pattern__Group_2__0 )? )
            {
            // InternalReactionRules.g:4387:1: ( ( rule__Pattern__Group_2__0 )? )
            // InternalReactionRules.g:4388:2: ( rule__Pattern__Group_2__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_2()); 
            // InternalReactionRules.g:4389:2: ( rule__Pattern__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalReactionRules.g:4389:3: rule__Pattern__Group_2__0
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
    // InternalReactionRules.g:4397:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4401:1: ( rule__Pattern__Group__3__Impl )
            // InternalReactionRules.g:4402:2: rule__Pattern__Group__3__Impl
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
    // InternalReactionRules.g:4408:1: rule__Pattern__Group__3__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4412:1: ( ( '}' ) )
            // InternalReactionRules.g:4413:1: ( '}' )
            {
            // InternalReactionRules.g:4413:1: ( '}' )
            // InternalReactionRules.g:4414:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalReactionRules.g:4424:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4428:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalReactionRules.g:4429:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
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
    // InternalReactionRules.g:4436:1: rule__Pattern__Group_2__0__Impl : ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4440:1: ( ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) ) )
            // InternalReactionRules.g:4441:1: ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) )
            {
            // InternalReactionRules.g:4441:1: ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) )
            // InternalReactionRules.g:4442:2: ( rule__Pattern__AgentPatternsAssignment_2_0 )
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAssignment_2_0()); 
            // InternalReactionRules.g:4443:2: ( rule__Pattern__AgentPatternsAssignment_2_0 )
            // InternalReactionRules.g:4443:3: rule__Pattern__AgentPatternsAssignment_2_0
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
    // InternalReactionRules.g:4451:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4455:1: ( rule__Pattern__Group_2__1__Impl )
            // InternalReactionRules.g:4456:2: rule__Pattern__Group_2__1__Impl
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
    // InternalReactionRules.g:4462:1: rule__Pattern__Group_2__1__Impl : ( ( rule__Pattern__Group_2_1__0 )* ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4466:1: ( ( ( rule__Pattern__Group_2_1__0 )* ) )
            // InternalReactionRules.g:4467:1: ( ( rule__Pattern__Group_2_1__0 )* )
            {
            // InternalReactionRules.g:4467:1: ( ( rule__Pattern__Group_2_1__0 )* )
            // InternalReactionRules.g:4468:2: ( rule__Pattern__Group_2_1__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1()); 
            // InternalReactionRules.g:4469:2: ( rule__Pattern__Group_2_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalReactionRules.g:4469:3: rule__Pattern__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalReactionRules.g:4478:1: rule__Pattern__Group_2_1__0 : rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 ;
    public final void rule__Pattern__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4482:1: ( rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 )
            // InternalReactionRules.g:4483:2: rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:4490:1: rule__Pattern__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4494:1: ( ( ',' ) )
            // InternalReactionRules.g:4495:1: ( ',' )
            {
            // InternalReactionRules.g:4495:1: ( ',' )
            // InternalReactionRules.g:4496:2: ','
            {
             before(grammarAccess.getPatternAccess().getCommaKeyword_2_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalReactionRules.g:4505:1: rule__Pattern__Group_2_1__1 : rule__Pattern__Group_2_1__1__Impl ;
    public final void rule__Pattern__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4509:1: ( rule__Pattern__Group_2_1__1__Impl )
            // InternalReactionRules.g:4510:2: rule__Pattern__Group_2_1__1__Impl
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
    // InternalReactionRules.g:4516:1: rule__Pattern__Group_2_1__1__Impl : ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) ) ;
    public final void rule__Pattern__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4520:1: ( ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) ) )
            // InternalReactionRules.g:4521:1: ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) )
            {
            // InternalReactionRules.g:4521:1: ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) )
            // InternalReactionRules.g:4522:2: ( rule__Pattern__AgentPatternsAssignment_2_1_1 )
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAssignment_2_1_1()); 
            // InternalReactionRules.g:4523:2: ( rule__Pattern__AgentPatternsAssignment_2_1_1 )
            // InternalReactionRules.g:4523:3: rule__Pattern__AgentPatternsAssignment_2_1_1
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
    // InternalReactionRules.g:4532:1: rule__Observation__Group__0 : rule__Observation__Group__0__Impl rule__Observation__Group__1 ;
    public final void rule__Observation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4536:1: ( rule__Observation__Group__0__Impl rule__Observation__Group__1 )
            // InternalReactionRules.g:4537:2: rule__Observation__Group__0__Impl rule__Observation__Group__1
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
    // InternalReactionRules.g:4544:1: rule__Observation__Group__0__Impl : ( 'obs' ) ;
    public final void rule__Observation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4548:1: ( ( 'obs' ) )
            // InternalReactionRules.g:4549:1: ( 'obs' )
            {
            // InternalReactionRules.g:4549:1: ( 'obs' )
            // InternalReactionRules.g:4550:2: 'obs'
            {
             before(grammarAccess.getObservationAccess().getObsKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalReactionRules.g:4559:1: rule__Observation__Group__1 : rule__Observation__Group__1__Impl rule__Observation__Group__2 ;
    public final void rule__Observation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4563:1: ( rule__Observation__Group__1__Impl rule__Observation__Group__2 )
            // InternalReactionRules.g:4564:2: rule__Observation__Group__1__Impl rule__Observation__Group__2
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
    // InternalReactionRules.g:4571:1: rule__Observation__Group__1__Impl : ( ( rule__Observation__NameAssignment_1 ) ) ;
    public final void rule__Observation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4575:1: ( ( ( rule__Observation__NameAssignment_1 ) ) )
            // InternalReactionRules.g:4576:1: ( ( rule__Observation__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:4576:1: ( ( rule__Observation__NameAssignment_1 ) )
            // InternalReactionRules.g:4577:2: ( rule__Observation__NameAssignment_1 )
            {
             before(grammarAccess.getObservationAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:4578:2: ( rule__Observation__NameAssignment_1 )
            // InternalReactionRules.g:4578:3: rule__Observation__NameAssignment_1
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
    // InternalReactionRules.g:4586:1: rule__Observation__Group__2 : rule__Observation__Group__2__Impl ;
    public final void rule__Observation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4590:1: ( rule__Observation__Group__2__Impl )
            // InternalReactionRules.g:4591:2: rule__Observation__Group__2__Impl
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
    // InternalReactionRules.g:4597:1: rule__Observation__Group__2__Impl : ( ( rule__Observation__ObservationPatternAssignment_2 ) ) ;
    public final void rule__Observation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4601:1: ( ( ( rule__Observation__ObservationPatternAssignment_2 ) ) )
            // InternalReactionRules.g:4602:1: ( ( rule__Observation__ObservationPatternAssignment_2 ) )
            {
            // InternalReactionRules.g:4602:1: ( ( rule__Observation__ObservationPatternAssignment_2 ) )
            // InternalReactionRules.g:4603:2: ( rule__Observation__ObservationPatternAssignment_2 )
            {
             before(grammarAccess.getObservationAccess().getObservationPatternAssignment_2()); 
            // InternalReactionRules.g:4604:2: ( rule__Observation__ObservationPatternAssignment_2 )
            // InternalReactionRules.g:4604:3: rule__Observation__ObservationPatternAssignment_2
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
    // InternalReactionRules.g:4613:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4617:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // InternalReactionRules.g:4618:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
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
    // InternalReactionRules.g:4625:1: rule__Initial__Group__0__Impl : ( 'init' ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4629:1: ( ( 'init' ) )
            // InternalReactionRules.g:4630:1: ( 'init' )
            {
            // InternalReactionRules.g:4630:1: ( 'init' )
            // InternalReactionRules.g:4631:2: 'init'
            {
             before(grammarAccess.getInitialAccess().getInitKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalReactionRules.g:4640:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4644:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // InternalReactionRules.g:4645:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalReactionRules.g:4652:1: rule__Initial__Group__1__Impl : ( ( rule__Initial__NameAssignment_1 ) ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4656:1: ( ( ( rule__Initial__NameAssignment_1 ) ) )
            // InternalReactionRules.g:4657:1: ( ( rule__Initial__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:4657:1: ( ( rule__Initial__NameAssignment_1 ) )
            // InternalReactionRules.g:4658:2: ( rule__Initial__NameAssignment_1 )
            {
             before(grammarAccess.getInitialAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:4659:2: ( rule__Initial__NameAssignment_1 )
            // InternalReactionRules.g:4659:3: rule__Initial__NameAssignment_1
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
    // InternalReactionRules.g:4667:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl rule__Initial__Group__3 ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4671:1: ( rule__Initial__Group__2__Impl rule__Initial__Group__3 )
            // InternalReactionRules.g:4672:2: rule__Initial__Group__2__Impl rule__Initial__Group__3
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
    // InternalReactionRules.g:4679:1: rule__Initial__Group__2__Impl : ( ( rule__Initial__CountAssignment_2 ) ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4683:1: ( ( ( rule__Initial__CountAssignment_2 ) ) )
            // InternalReactionRules.g:4684:1: ( ( rule__Initial__CountAssignment_2 ) )
            {
            // InternalReactionRules.g:4684:1: ( ( rule__Initial__CountAssignment_2 ) )
            // InternalReactionRules.g:4685:2: ( rule__Initial__CountAssignment_2 )
            {
             before(grammarAccess.getInitialAccess().getCountAssignment_2()); 
            // InternalReactionRules.g:4686:2: ( rule__Initial__CountAssignment_2 )
            // InternalReactionRules.g:4686:3: rule__Initial__CountAssignment_2
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
    // InternalReactionRules.g:4694:1: rule__Initial__Group__3 : rule__Initial__Group__3__Impl ;
    public final void rule__Initial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4698:1: ( rule__Initial__Group__3__Impl )
            // InternalReactionRules.g:4699:2: rule__Initial__Group__3__Impl
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
    // InternalReactionRules.g:4705:1: rule__Initial__Group__3__Impl : ( ( rule__Initial__InitialPatternAssignment_3 ) ) ;
    public final void rule__Initial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4709:1: ( ( ( rule__Initial__InitialPatternAssignment_3 ) ) )
            // InternalReactionRules.g:4710:1: ( ( rule__Initial__InitialPatternAssignment_3 ) )
            {
            // InternalReactionRules.g:4710:1: ( ( rule__Initial__InitialPatternAssignment_3 ) )
            // InternalReactionRules.g:4711:2: ( rule__Initial__InitialPatternAssignment_3 )
            {
             before(grammarAccess.getInitialAccess().getInitialPatternAssignment_3()); 
            // InternalReactionRules.g:4712:2: ( rule__Initial__InitialPatternAssignment_3 )
            // InternalReactionRules.g:4712:3: rule__Initial__InitialPatternAssignment_3
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
    // InternalReactionRules.g:4721:1: rule__RuleVariables__Group__0 : rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1 ;
    public final void rule__RuleVariables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4725:1: ( rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1 )
            // InternalReactionRules.g:4726:2: rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1
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
    // InternalReactionRules.g:4733:1: rule__RuleVariables__Group__0__Impl : ( ( rule__RuleVariables__VariablesAssignment_0 ) ) ;
    public final void rule__RuleVariables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4737:1: ( ( ( rule__RuleVariables__VariablesAssignment_0 ) ) )
            // InternalReactionRules.g:4738:1: ( ( rule__RuleVariables__VariablesAssignment_0 ) )
            {
            // InternalReactionRules.g:4738:1: ( ( rule__RuleVariables__VariablesAssignment_0 ) )
            // InternalReactionRules.g:4739:2: ( rule__RuleVariables__VariablesAssignment_0 )
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesAssignment_0()); 
            // InternalReactionRules.g:4740:2: ( rule__RuleVariables__VariablesAssignment_0 )
            // InternalReactionRules.g:4740:3: rule__RuleVariables__VariablesAssignment_0
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
    // InternalReactionRules.g:4748:1: rule__RuleVariables__Group__1 : rule__RuleVariables__Group__1__Impl ;
    public final void rule__RuleVariables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4752:1: ( rule__RuleVariables__Group__1__Impl )
            // InternalReactionRules.g:4753:2: rule__RuleVariables__Group__1__Impl
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
    // InternalReactionRules.g:4759:1: rule__RuleVariables__Group__1__Impl : ( ( rule__RuleVariables__Group_1__0 )* ) ;
    public final void rule__RuleVariables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4763:1: ( ( ( rule__RuleVariables__Group_1__0 )* ) )
            // InternalReactionRules.g:4764:1: ( ( rule__RuleVariables__Group_1__0 )* )
            {
            // InternalReactionRules.g:4764:1: ( ( rule__RuleVariables__Group_1__0 )* )
            // InternalReactionRules.g:4765:2: ( rule__RuleVariables__Group_1__0 )*
            {
             before(grammarAccess.getRuleVariablesAccess().getGroup_1()); 
            // InternalReactionRules.g:4766:2: ( rule__RuleVariables__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalReactionRules.g:4766:3: rule__RuleVariables__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalReactionRules.g:4775:1: rule__RuleVariables__Group_1__0 : rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1 ;
    public final void rule__RuleVariables__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4779:1: ( rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1 )
            // InternalReactionRules.g:4780:2: rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:4787:1: rule__RuleVariables__Group_1__0__Impl : ( ',' ) ;
    public final void rule__RuleVariables__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4791:1: ( ( ',' ) )
            // InternalReactionRules.g:4792:1: ( ',' )
            {
            // InternalReactionRules.g:4792:1: ( ',' )
            // InternalReactionRules.g:4793:2: ','
            {
             before(grammarAccess.getRuleVariablesAccess().getCommaKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalReactionRules.g:4802:1: rule__RuleVariables__Group_1__1 : rule__RuleVariables__Group_1__1__Impl ;
    public final void rule__RuleVariables__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4806:1: ( rule__RuleVariables__Group_1__1__Impl )
            // InternalReactionRules.g:4807:2: rule__RuleVariables__Group_1__1__Impl
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
    // InternalReactionRules.g:4813:1: rule__RuleVariables__Group_1__1__Impl : ( ( rule__RuleVariables__VariablesAssignment_1_1 ) ) ;
    public final void rule__RuleVariables__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4817:1: ( ( ( rule__RuleVariables__VariablesAssignment_1_1 ) ) )
            // InternalReactionRules.g:4818:1: ( ( rule__RuleVariables__VariablesAssignment_1_1 ) )
            {
            // InternalReactionRules.g:4818:1: ( ( rule__RuleVariables__VariablesAssignment_1_1 ) )
            // InternalReactionRules.g:4819:2: ( rule__RuleVariables__VariablesAssignment_1_1 )
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesAssignment_1_1()); 
            // InternalReactionRules.g:4820:2: ( rule__RuleVariables__VariablesAssignment_1_1 )
            // InternalReactionRules.g:4820:3: rule__RuleVariables__VariablesAssignment_1_1
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
    // InternalReactionRules.g:4829:1: rule__UnidirectionalRule__Group__0 : rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1 ;
    public final void rule__UnidirectionalRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4833:1: ( rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1 )
            // InternalReactionRules.g:4834:2: rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalReactionRules.g:4841:1: rule__UnidirectionalRule__Group__0__Impl : ( ( rule__UnidirectionalRule__LhsAssignment_0 ) ) ;
    public final void rule__UnidirectionalRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4845:1: ( ( ( rule__UnidirectionalRule__LhsAssignment_0 ) ) )
            // InternalReactionRules.g:4846:1: ( ( rule__UnidirectionalRule__LhsAssignment_0 ) )
            {
            // InternalReactionRules.g:4846:1: ( ( rule__UnidirectionalRule__LhsAssignment_0 ) )
            // InternalReactionRules.g:4847:2: ( rule__UnidirectionalRule__LhsAssignment_0 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getLhsAssignment_0()); 
            // InternalReactionRules.g:4848:2: ( rule__UnidirectionalRule__LhsAssignment_0 )
            // InternalReactionRules.g:4848:3: rule__UnidirectionalRule__LhsAssignment_0
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
    // InternalReactionRules.g:4856:1: rule__UnidirectionalRule__Group__1 : rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2 ;
    public final void rule__UnidirectionalRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4860:1: ( rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2 )
            // InternalReactionRules.g:4861:2: rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2
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
    // InternalReactionRules.g:4868:1: rule__UnidirectionalRule__Group__1__Impl : ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) ) ;
    public final void rule__UnidirectionalRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4872:1: ( ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) ) )
            // InternalReactionRules.g:4873:1: ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) )
            {
            // InternalReactionRules.g:4873:1: ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) )
            // InternalReactionRules.g:4874:2: ( rule__UnidirectionalRule__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getOperatorAssignment_1()); 
            // InternalReactionRules.g:4875:2: ( rule__UnidirectionalRule__OperatorAssignment_1 )
            // InternalReactionRules.g:4875:3: rule__UnidirectionalRule__OperatorAssignment_1
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
    // InternalReactionRules.g:4883:1: rule__UnidirectionalRule__Group__2 : rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3 ;
    public final void rule__UnidirectionalRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4887:1: ( rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3 )
            // InternalReactionRules.g:4888:2: rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalReactionRules.g:4895:1: rule__UnidirectionalRule__Group__2__Impl : ( ( rule__UnidirectionalRule__RhsAssignment_2 ) ) ;
    public final void rule__UnidirectionalRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4899:1: ( ( ( rule__UnidirectionalRule__RhsAssignment_2 ) ) )
            // InternalReactionRules.g:4900:1: ( ( rule__UnidirectionalRule__RhsAssignment_2 ) )
            {
            // InternalReactionRules.g:4900:1: ( ( rule__UnidirectionalRule__RhsAssignment_2 ) )
            // InternalReactionRules.g:4901:2: ( rule__UnidirectionalRule__RhsAssignment_2 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getRhsAssignment_2()); 
            // InternalReactionRules.g:4902:2: ( rule__UnidirectionalRule__RhsAssignment_2 )
            // InternalReactionRules.g:4902:3: rule__UnidirectionalRule__RhsAssignment_2
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
    // InternalReactionRules.g:4910:1: rule__UnidirectionalRule__Group__3 : rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4 ;
    public final void rule__UnidirectionalRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4914:1: ( rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4 )
            // InternalReactionRules.g:4915:2: rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalReactionRules.g:4922:1: rule__UnidirectionalRule__Group__3__Impl : ( RULE_AT ) ;
    public final void rule__UnidirectionalRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4926:1: ( ( RULE_AT ) )
            // InternalReactionRules.g:4927:1: ( RULE_AT )
            {
            // InternalReactionRules.g:4927:1: ( RULE_AT )
            // InternalReactionRules.g:4928:2: RULE_AT
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
    // InternalReactionRules.g:4937:1: rule__UnidirectionalRule__Group__4 : rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5 ;
    public final void rule__UnidirectionalRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4941:1: ( rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5 )
            // InternalReactionRules.g:4942:2: rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:4949:1: rule__UnidirectionalRule__Group__4__Impl : ( '[' ) ;
    public final void rule__UnidirectionalRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4953:1: ( ( '[' ) )
            // InternalReactionRules.g:4954:1: ( '[' )
            {
            // InternalReactionRules.g:4954:1: ( '[' )
            // InternalReactionRules.g:4955:2: '['
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
    // InternalReactionRules.g:4964:1: rule__UnidirectionalRule__Group__5 : rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6 ;
    public final void rule__UnidirectionalRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4968:1: ( rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6 )
            // InternalReactionRules.g:4969:2: rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalReactionRules.g:4976:1: rule__UnidirectionalRule__Group__5__Impl : ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) ) ;
    public final void rule__UnidirectionalRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4980:1: ( ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) ) )
            // InternalReactionRules.g:4981:1: ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) )
            {
            // InternalReactionRules.g:4981:1: ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) )
            // InternalReactionRules.g:4982:2: ( rule__UnidirectionalRule__VariablesAssignment_5 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getVariablesAssignment_5()); 
            // InternalReactionRules.g:4983:2: ( rule__UnidirectionalRule__VariablesAssignment_5 )
            // InternalReactionRules.g:4983:3: rule__UnidirectionalRule__VariablesAssignment_5
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
    // InternalReactionRules.g:4991:1: rule__UnidirectionalRule__Group__6 : rule__UnidirectionalRule__Group__6__Impl ;
    public final void rule__UnidirectionalRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4995:1: ( rule__UnidirectionalRule__Group__6__Impl )
            // InternalReactionRules.g:4996:2: rule__UnidirectionalRule__Group__6__Impl
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
    // InternalReactionRules.g:5002:1: rule__UnidirectionalRule__Group__6__Impl : ( ']' ) ;
    public final void rule__UnidirectionalRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5006:1: ( ( ']' ) )
            // InternalReactionRules.g:5007:1: ( ']' )
            {
            // InternalReactionRules.g:5007:1: ( ']' )
            // InternalReactionRules.g:5008:2: ']'
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
    // InternalReactionRules.g:5018:1: rule__BidirectionalRule__Group__0 : rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1 ;
    public final void rule__BidirectionalRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5022:1: ( rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1 )
            // InternalReactionRules.g:5023:2: rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1
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
    // InternalReactionRules.g:5030:1: rule__BidirectionalRule__Group__0__Impl : ( ( rule__BidirectionalRule__LhsAssignment_0 ) ) ;
    public final void rule__BidirectionalRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5034:1: ( ( ( rule__BidirectionalRule__LhsAssignment_0 ) ) )
            // InternalReactionRules.g:5035:1: ( ( rule__BidirectionalRule__LhsAssignment_0 ) )
            {
            // InternalReactionRules.g:5035:1: ( ( rule__BidirectionalRule__LhsAssignment_0 ) )
            // InternalReactionRules.g:5036:2: ( rule__BidirectionalRule__LhsAssignment_0 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getLhsAssignment_0()); 
            // InternalReactionRules.g:5037:2: ( rule__BidirectionalRule__LhsAssignment_0 )
            // InternalReactionRules.g:5037:3: rule__BidirectionalRule__LhsAssignment_0
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
    // InternalReactionRules.g:5045:1: rule__BidirectionalRule__Group__1 : rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2 ;
    public final void rule__BidirectionalRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5049:1: ( rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2 )
            // InternalReactionRules.g:5050:2: rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2
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
    // InternalReactionRules.g:5057:1: rule__BidirectionalRule__Group__1__Impl : ( ( rule__BidirectionalRule__OperatorAssignment_1 ) ) ;
    public final void rule__BidirectionalRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5061:1: ( ( ( rule__BidirectionalRule__OperatorAssignment_1 ) ) )
            // InternalReactionRules.g:5062:1: ( ( rule__BidirectionalRule__OperatorAssignment_1 ) )
            {
            // InternalReactionRules.g:5062:1: ( ( rule__BidirectionalRule__OperatorAssignment_1 ) )
            // InternalReactionRules.g:5063:2: ( rule__BidirectionalRule__OperatorAssignment_1 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getOperatorAssignment_1()); 
            // InternalReactionRules.g:5064:2: ( rule__BidirectionalRule__OperatorAssignment_1 )
            // InternalReactionRules.g:5064:3: rule__BidirectionalRule__OperatorAssignment_1
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
    // InternalReactionRules.g:5072:1: rule__BidirectionalRule__Group__2 : rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3 ;
    public final void rule__BidirectionalRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5076:1: ( rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3 )
            // InternalReactionRules.g:5077:2: rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalReactionRules.g:5084:1: rule__BidirectionalRule__Group__2__Impl : ( ( rule__BidirectionalRule__RhsAssignment_2 ) ) ;
    public final void rule__BidirectionalRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5088:1: ( ( ( rule__BidirectionalRule__RhsAssignment_2 ) ) )
            // InternalReactionRules.g:5089:1: ( ( rule__BidirectionalRule__RhsAssignment_2 ) )
            {
            // InternalReactionRules.g:5089:1: ( ( rule__BidirectionalRule__RhsAssignment_2 ) )
            // InternalReactionRules.g:5090:2: ( rule__BidirectionalRule__RhsAssignment_2 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getRhsAssignment_2()); 
            // InternalReactionRules.g:5091:2: ( rule__BidirectionalRule__RhsAssignment_2 )
            // InternalReactionRules.g:5091:3: rule__BidirectionalRule__RhsAssignment_2
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
    // InternalReactionRules.g:5099:1: rule__BidirectionalRule__Group__3 : rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4 ;
    public final void rule__BidirectionalRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5103:1: ( rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4 )
            // InternalReactionRules.g:5104:2: rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalReactionRules.g:5111:1: rule__BidirectionalRule__Group__3__Impl : ( RULE_AT ) ;
    public final void rule__BidirectionalRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5115:1: ( ( RULE_AT ) )
            // InternalReactionRules.g:5116:1: ( RULE_AT )
            {
            // InternalReactionRules.g:5116:1: ( RULE_AT )
            // InternalReactionRules.g:5117:2: RULE_AT
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
    // InternalReactionRules.g:5126:1: rule__BidirectionalRule__Group__4 : rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5 ;
    public final void rule__BidirectionalRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5130:1: ( rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5 )
            // InternalReactionRules.g:5131:2: rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalReactionRules.g:5138:1: rule__BidirectionalRule__Group__4__Impl : ( '[' ) ;
    public final void rule__BidirectionalRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5142:1: ( ( '[' ) )
            // InternalReactionRules.g:5143:1: ( '[' )
            {
            // InternalReactionRules.g:5143:1: ( '[' )
            // InternalReactionRules.g:5144:2: '['
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
    // InternalReactionRules.g:5153:1: rule__BidirectionalRule__Group__5 : rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6 ;
    public final void rule__BidirectionalRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5157:1: ( rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6 )
            // InternalReactionRules.g:5158:2: rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalReactionRules.g:5165:1: rule__BidirectionalRule__Group__5__Impl : ( ( rule__BidirectionalRule__VariablesAssignment_5 ) ) ;
    public final void rule__BidirectionalRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5169:1: ( ( ( rule__BidirectionalRule__VariablesAssignment_5 ) ) )
            // InternalReactionRules.g:5170:1: ( ( rule__BidirectionalRule__VariablesAssignment_5 ) )
            {
            // InternalReactionRules.g:5170:1: ( ( rule__BidirectionalRule__VariablesAssignment_5 ) )
            // InternalReactionRules.g:5171:2: ( rule__BidirectionalRule__VariablesAssignment_5 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getVariablesAssignment_5()); 
            // InternalReactionRules.g:5172:2: ( rule__BidirectionalRule__VariablesAssignment_5 )
            // InternalReactionRules.g:5172:3: rule__BidirectionalRule__VariablesAssignment_5
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
    // InternalReactionRules.g:5180:1: rule__BidirectionalRule__Group__6 : rule__BidirectionalRule__Group__6__Impl ;
    public final void rule__BidirectionalRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5184:1: ( rule__BidirectionalRule__Group__6__Impl )
            // InternalReactionRules.g:5185:2: rule__BidirectionalRule__Group__6__Impl
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
    // InternalReactionRules.g:5191:1: rule__BidirectionalRule__Group__6__Impl : ( ']' ) ;
    public final void rule__BidirectionalRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5195:1: ( ( ']' ) )
            // InternalReactionRules.g:5196:1: ( ']' )
            {
            // InternalReactionRules.g:5196:1: ( ']' )
            // InternalReactionRules.g:5197:2: ']'
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
    // InternalReactionRules.g:5207:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5211:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalReactionRules.g:5212:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalReactionRules.g:5219:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5223:1: ( ( 'rule' ) )
            // InternalReactionRules.g:5224:1: ( 'rule' )
            {
            // InternalReactionRules.g:5224:1: ( 'rule' )
            // InternalReactionRules.g:5225:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalReactionRules.g:5234:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5238:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalReactionRules.g:5239:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalReactionRules.g:5246:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5250:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalReactionRules.g:5251:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:5251:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalReactionRules.g:5252:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:5253:2: ( rule__Rule__NameAssignment_1 )
            // InternalReactionRules.g:5253:3: rule__Rule__NameAssignment_1
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
    // InternalReactionRules.g:5261:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5265:1: ( rule__Rule__Group__2__Impl )
            // InternalReactionRules.g:5266:2: rule__Rule__Group__2__Impl
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
    // InternalReactionRules.g:5272:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__RuleAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5276:1: ( ( ( rule__Rule__RuleAssignment_2 ) ) )
            // InternalReactionRules.g:5277:1: ( ( rule__Rule__RuleAssignment_2 ) )
            {
            // InternalReactionRules.g:5277:1: ( ( rule__Rule__RuleAssignment_2 ) )
            // InternalReactionRules.g:5278:2: ( rule__Rule__RuleAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getRuleAssignment_2()); 
            // InternalReactionRules.g:5279:2: ( rule__Rule__RuleAssignment_2 )
            // InternalReactionRules.g:5279:3: rule__Rule__RuleAssignment_2
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
    // InternalReactionRules.g:5288:1: rule__ReactionRuleModel__ModelAssignment_0 : ( ruleModel ) ;
    public final void rule__ReactionRuleModel__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5292:1: ( ( ruleModel ) )
            // InternalReactionRules.g:5293:2: ( ruleModel )
            {
            // InternalReactionRules.g:5293:2: ( ruleModel )
            // InternalReactionRules.g:5294:3: ruleModel
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


    // $ANTLR start "rule__ReactionRuleModel__ReationContainerAssignment_1"
    // InternalReactionRules.g:5303:1: rule__ReactionRuleModel__ReationContainerAssignment_1 : ( ruleReactionContainer ) ;
    public final void rule__ReactionRuleModel__ReationContainerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5307:1: ( ( ruleReactionContainer ) )
            // InternalReactionRules.g:5308:2: ( ruleReactionContainer )
            {
            // InternalReactionRules.g:5308:2: ( ruleReactionContainer )
            // InternalReactionRules.g:5309:3: ruleReactionContainer
            {
             before(grammarAccess.getReactionRuleModelAccess().getReationContainerReactionContainerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReactionContainer();

            state._fsp--;

             after(grammarAccess.getReactionRuleModelAccess().getReationContainerReactionContainerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionRuleModel__ReationContainerAssignment_1"


    // $ANTLR start "rule__ReactionRuleModel__ReactionPropertiesAssignment_2"
    // InternalReactionRules.g:5318:1: rule__ReactionRuleModel__ReactionPropertiesAssignment_2 : ( ruleReactionProperty ) ;
    public final void rule__ReactionRuleModel__ReactionPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5322:1: ( ( ruleReactionProperty ) )
            // InternalReactionRules.g:5323:2: ( ruleReactionProperty )
            {
            // InternalReactionRules.g:5323:2: ( ruleReactionProperty )
            // InternalReactionRules.g:5324:3: ruleReactionProperty
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
    // InternalReactionRules.g:5333:1: rule__ModelUri__UriAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ModelUri__UriAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5337:1: ( ( RULE_STRING ) )
            // InternalReactionRules.g:5338:2: ( RULE_STRING )
            {
            // InternalReactionRules.g:5338:2: ( RULE_STRING )
            // InternalReactionRules.g:5339:3: RULE_STRING
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
    // InternalReactionRules.g:5348:1: rule__ModelPath__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ModelPath__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5352:1: ( ( RULE_STRING ) )
            // InternalReactionRules.g:5353:2: ( RULE_STRING )
            {
            // InternalReactionRules.g:5353:2: ( RULE_STRING )
            // InternalReactionRules.g:5354:3: RULE_STRING
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
    // InternalReactionRules.g:5363:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5367:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5368:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5368:2: ( RULE_ID )
            // InternalReactionRules.g:5369:3: RULE_ID
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
    // InternalReactionRules.g:5378:1: rule__Model__LocationAssignment_2 : ( ruleModelLocation ) ;
    public final void rule__Model__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5382:1: ( ( ruleModelLocation ) )
            // InternalReactionRules.g:5383:2: ( ruleModelLocation )
            {
            // InternalReactionRules.g:5383:2: ( ruleModelLocation )
            // InternalReactionRules.g:5384:3: ruleModelLocation
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
    // InternalReactionRules.g:5393:1: rule__ReactionContainer__AgentInstancesAssignment_1 : ( ruleAgentInstance ) ;
    public final void rule__ReactionContainer__AgentInstancesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5397:1: ( ( ruleAgentInstance ) )
            // InternalReactionRules.g:5398:2: ( ruleAgentInstance )
            {
            // InternalReactionRules.g:5398:2: ( ruleAgentInstance )
            // InternalReactionRules.g:5399:3: ruleAgentInstance
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
    // InternalReactionRules.g:5408:1: rule__AgentInstanceSiteState__SiteAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstanceSiteState__SiteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5412:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5413:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5413:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5414:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceSiteStateAccess().getSiteSiteCrossReference_0_0()); 
            // InternalReactionRules.g:5415:3: ( RULE_ID )
            // InternalReactionRules.g:5416:4: RULE_ID
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
    // InternalReactionRules.g:5427:1: rule__AgentInstanceSiteState__SiteStateAssignment_1 : ( ruleSiteState ) ;
    public final void rule__AgentInstanceSiteState__SiteStateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5431:1: ( ( ruleSiteState ) )
            // InternalReactionRules.g:5432:2: ( ruleSiteState )
            {
            // InternalReactionRules.g:5432:2: ( ruleSiteState )
            // InternalReactionRules.g:5433:3: ruleSiteState
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
    // InternalReactionRules.g:5442:1: rule__AgentInstanceLinkState__SiteAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstanceLinkState__SiteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5446:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5447:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5447:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5448:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getSiteSiteCrossReference_0_0()); 
            // InternalReactionRules.g:5449:3: ( RULE_ID )
            // InternalReactionRules.g:5450:4: RULE_ID
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
    // InternalReactionRules.g:5461:1: rule__AgentInstanceLinkState__AttachedSiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstanceLinkState__AttachedSiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5465:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5466:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5466:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5467:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedSiteSiteCrossReference_1_0()); 
            // InternalReactionRules.g:5468:3: ( RULE_ID )
            // InternalReactionRules.g:5469:4: RULE_ID
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
    // InternalReactionRules.g:5480:1: rule__AgentInstanceLinkState__AttachedAgentAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstanceLinkState__AttachedAgentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5484:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5485:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5485:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5486:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentAgentCrossReference_2_0()); 
            // InternalReactionRules.g:5487:3: ( RULE_ID )
            // InternalReactionRules.g:5488:4: RULE_ID
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
    // InternalReactionRules.g:5499:1: rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5503:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5504:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5504:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5505:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentInstanceAgentInstanceCrossReference_3_0()); 
            // InternalReactionRules.g:5506:3: ( RULE_ID )
            // InternalReactionRules.g:5507:4: RULE_ID
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
    // InternalReactionRules.g:5518:1: rule__AgentInstanceLinkState__LinkStateAssignment_4 : ( ruleLinkState ) ;
    public final void rule__AgentInstanceLinkState__LinkStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5522:1: ( ( ruleLinkState ) )
            // InternalReactionRules.g:5523:2: ( ruleLinkState )
            {
            // InternalReactionRules.g:5523:2: ( ruleLinkState )
            // InternalReactionRules.g:5524:3: ruleLinkState
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
    // InternalReactionRules.g:5533:1: rule__AgentInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AgentInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5537:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5538:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5538:2: ( RULE_ID )
            // InternalReactionRules.g:5539:3: RULE_ID
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
    // InternalReactionRules.g:5548:1: rule__AgentInstance__AgentAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstance__AgentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5552:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5553:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5553:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5554:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceAccess().getAgentAgentCrossReference_2_0()); 
            // InternalReactionRules.g:5555:3: ( RULE_ID )
            // InternalReactionRules.g:5556:4: RULE_ID
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
    // InternalReactionRules.g:5567:1: rule__AgentInstance__SiteStatesAssignment_3 : ( ruleAgentInstanceSiteState ) ;
    public final void rule__AgentInstance__SiteStatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5571:1: ( ( ruleAgentInstanceSiteState ) )
            // InternalReactionRules.g:5572:2: ( ruleAgentInstanceSiteState )
            {
            // InternalReactionRules.g:5572:2: ( ruleAgentInstanceSiteState )
            // InternalReactionRules.g:5573:3: ruleAgentInstanceSiteState
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
    // InternalReactionRules.g:5582:1: rule__AgentInstance__LinkStatesAssignment_4 : ( ruleAgentInstanceLinkState ) ;
    public final void rule__AgentInstance__LinkStatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5586:1: ( ( ruleAgentInstanceLinkState ) )
            // InternalReactionRules.g:5587:2: ( ruleAgentInstanceLinkState )
            {
            // InternalReactionRules.g:5587:2: ( ruleAgentInstanceLinkState )
            // InternalReactionRules.g:5588:3: ruleAgentInstanceLinkState
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
    // InternalReactionRules.g:5597:1: rule__ArithmeticValue__ValueAssignment : ( ruleArithmeticType ) ;
    public final void rule__ArithmeticValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5601:1: ( ( ruleArithmeticType ) )
            // InternalReactionRules.g:5602:2: ( ruleArithmeticType )
            {
            // InternalReactionRules.g:5602:2: ( ruleArithmeticType )
            // InternalReactionRules.g:5603:3: ruleArithmeticType
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
    // InternalReactionRules.g:5612:1: rule__State__NameAssignment : ( RULE_ID ) ;
    public final void rule__State__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5616:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5617:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5617:2: ( RULE_ID )
            // InternalReactionRules.g:5618:3: RULE_ID
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
    // InternalReactionRules.g:5627:1: rule__States__StateAssignment_1_1 : ( ruleState ) ;
    public final void rule__States__StateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5631:1: ( ( ruleState ) )
            // InternalReactionRules.g:5632:2: ( ruleState )
            {
            // InternalReactionRules.g:5632:2: ( ruleState )
            // InternalReactionRules.g:5633:3: ruleState
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
    // InternalReactionRules.g:5642:1: rule__States__StateAssignment_1_2_1 : ( ruleState ) ;
    public final void rule__States__StateAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5646:1: ( ( ruleState ) )
            // InternalReactionRules.g:5647:2: ( ruleState )
            {
            // InternalReactionRules.g:5647:2: ( ruleState )
            // InternalReactionRules.g:5648:3: ruleState
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
    // InternalReactionRules.g:5657:1: rule__Site__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Site__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5661:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5662:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5662:2: ( RULE_ID )
            // InternalReactionRules.g:5663:3: RULE_ID
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
    // InternalReactionRules.g:5672:1: rule__Site__StatesAssignment_1 : ( ruleStates ) ;
    public final void rule__Site__StatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5676:1: ( ( ruleStates ) )
            // InternalReactionRules.g:5677:2: ( ruleStates )
            {
            // InternalReactionRules.g:5677:2: ( ruleStates )
            // InternalReactionRules.g:5678:3: ruleStates
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
    // InternalReactionRules.g:5687:1: rule__Sites__SitesAssignment_1_1 : ( ruleSite ) ;
    public final void rule__Sites__SitesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5691:1: ( ( ruleSite ) )
            // InternalReactionRules.g:5692:2: ( ruleSite )
            {
            // InternalReactionRules.g:5692:2: ( ruleSite )
            // InternalReactionRules.g:5693:3: ruleSite
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
    // InternalReactionRules.g:5702:1: rule__Sites__SitesAssignment_1_2_1 : ( ruleSite ) ;
    public final void rule__Sites__SitesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5706:1: ( ( ruleSite ) )
            // InternalReactionRules.g:5707:2: ( ruleSite )
            {
            // InternalReactionRules.g:5707:2: ( ruleSite )
            // InternalReactionRules.g:5708:3: ruleSite
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
    // InternalReactionRules.g:5717:1: rule__Agent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5721:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5722:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5722:2: ( RULE_ID )
            // InternalReactionRules.g:5723:3: RULE_ID
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
    // InternalReactionRules.g:5732:1: rule__Agent__SitesAssignment_2 : ( ruleSites ) ;
    public final void rule__Agent__SitesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5736:1: ( ( ruleSites ) )
            // InternalReactionRules.g:5737:2: ( ruleSites )
            {
            // InternalReactionRules.g:5737:2: ( ruleSites )
            // InternalReactionRules.g:5738:3: ruleSites
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
    // InternalReactionRules.g:5747:1: rule__PatternVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PatternVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5751:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5752:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5752:2: ( RULE_ID )
            // InternalReactionRules.g:5753:3: RULE_ID
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
    // InternalReactionRules.g:5762:1: rule__PatternVariable__PatternAssignment_3 : ( rulePattern ) ;
    public final void rule__PatternVariable__PatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5766:1: ( ( rulePattern ) )
            // InternalReactionRules.g:5767:2: ( rulePattern )
            {
            // InternalReactionRules.g:5767:2: ( rulePattern )
            // InternalReactionRules.g:5768:3: rulePattern
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
    // InternalReactionRules.g:5777:1: rule__ArithmeticVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ArithmeticVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5781:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5782:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5782:2: ( RULE_ID )
            // InternalReactionRules.g:5783:3: RULE_ID
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
    // InternalReactionRules.g:5792:1: rule__ArithmeticVariable__ValueAssignment_3 : ( ruleArithmeticValue ) ;
    public final void rule__ArithmeticVariable__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5796:1: ( ( ruleArithmeticValue ) )
            // InternalReactionRules.g:5797:2: ( ruleArithmeticValue )
            {
            // InternalReactionRules.g:5797:2: ( ruleArithmeticValue )
            // InternalReactionRules.g:5798:3: ruleArithmeticValue
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
    // InternalReactionRules.g:5807:1: rule__SemiLink__NameAssignment_1 : ( RULE_SEMI_LINK ) ;
    public final void rule__SemiLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5811:1: ( ( RULE_SEMI_LINK ) )
            // InternalReactionRules.g:5812:2: ( RULE_SEMI_LINK )
            {
            // InternalReactionRules.g:5812:2: ( RULE_SEMI_LINK )
            // InternalReactionRules.g:5813:3: RULE_SEMI_LINK
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
    // InternalReactionRules.g:5822:1: rule__FreeLink__NameAssignment_1 : ( RULE_FREE_LINK ) ;
    public final void rule__FreeLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5826:1: ( ( RULE_FREE_LINK ) )
            // InternalReactionRules.g:5827:2: ( RULE_FREE_LINK )
            {
            // InternalReactionRules.g:5827:2: ( RULE_FREE_LINK )
            // InternalReactionRules.g:5828:3: RULE_FREE_LINK
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
    // InternalReactionRules.g:5837:1: rule__WhatEver__NameAssignment_1 : ( RULE_WHATEVER_LINK ) ;
    public final void rule__WhatEver__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5841:1: ( ( RULE_WHATEVER_LINK ) )
            // InternalReactionRules.g:5842:2: ( RULE_WHATEVER_LINK )
            {
            // InternalReactionRules.g:5842:2: ( RULE_WHATEVER_LINK )
            // InternalReactionRules.g:5843:3: RULE_WHATEVER_LINK
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
    // InternalReactionRules.g:5852:1: rule__IndexedLink__StateAssignment_1 : ( ruleUnsignedInteger ) ;
    public final void rule__IndexedLink__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5856:1: ( ( ruleUnsignedInteger ) )
            // InternalReactionRules.g:5857:2: ( ruleUnsignedInteger )
            {
            // InternalReactionRules.g:5857:2: ( ruleUnsignedInteger )
            // InternalReactionRules.g:5858:3: ruleUnsignedInteger
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
    // InternalReactionRules.g:5867:1: rule__ExactLinkAgent__AgentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExactLinkAgent__AgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5871:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5872:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5872:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5873:3: ( RULE_ID )
            {
             before(grammarAccess.getExactLinkAgentAccess().getAgentAgentCrossReference_1_0()); 
            // InternalReactionRules.g:5874:3: ( RULE_ID )
            // InternalReactionRules.g:5875:4: RULE_ID
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
    // InternalReactionRules.g:5886:1: rule__ExactLinkSite__SiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExactLinkSite__SiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5890:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5891:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5891:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5892:3: ( RULE_ID )
            {
             before(grammarAccess.getExactLinkSiteAccess().getSiteSiteCrossReference_1_0()); 
            // InternalReactionRules.g:5893:3: ( RULE_ID )
            // InternalReactionRules.g:5894:4: RULE_ID
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
    // InternalReactionRules.g:5905:1: rule__ExactLink__LinkAgentAssignment_1 : ( ruleExactLinkAgent ) ;
    public final void rule__ExactLink__LinkAgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5909:1: ( ( ruleExactLinkAgent ) )
            // InternalReactionRules.g:5910:2: ( ruleExactLinkAgent )
            {
            // InternalReactionRules.g:5910:2: ( ruleExactLinkAgent )
            // InternalReactionRules.g:5911:3: ruleExactLinkAgent
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
    // InternalReactionRules.g:5920:1: rule__ExactLink__LinkSiteAssignment_3 : ( ruleExactLinkSite ) ;
    public final void rule__ExactLink__LinkSiteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5924:1: ( ( ruleExactLinkSite ) )
            // InternalReactionRules.g:5925:2: ( ruleExactLinkSite )
            {
            // InternalReactionRules.g:5925:2: ( ruleExactLinkSite )
            // InternalReactionRules.g:5926:3: ruleExactLinkSite
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
    // InternalReactionRules.g:5935:1: rule__SiteState__StateAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SiteState__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5939:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5940:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5940:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5941:3: ( RULE_ID )
            {
             before(grammarAccess.getSiteStateAccess().getStateStateCrossReference_1_0()); 
            // InternalReactionRules.g:5942:3: ( RULE_ID )
            // InternalReactionRules.g:5943:4: RULE_ID
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
    // InternalReactionRules.g:5954:1: rule__LinkState__LinkStateAssignment_1 : ( ( rule__LinkState__LinkStateAlternatives_1_0 ) ) ;
    public final void rule__LinkState__LinkStateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5958:1: ( ( ( rule__LinkState__LinkStateAlternatives_1_0 ) ) )
            // InternalReactionRules.g:5959:2: ( ( rule__LinkState__LinkStateAlternatives_1_0 ) )
            {
            // InternalReactionRules.g:5959:2: ( ( rule__LinkState__LinkStateAlternatives_1_0 ) )
            // InternalReactionRules.g:5960:3: ( rule__LinkState__LinkStateAlternatives_1_0 )
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAlternatives_1_0()); 
            // InternalReactionRules.g:5961:3: ( rule__LinkState__LinkStateAlternatives_1_0 )
            // InternalReactionRules.g:5961:4: rule__LinkState__LinkStateAlternatives_1_0
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
    // InternalReactionRules.g:5969:1: rule__SitePattern__SiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SitePattern__SiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5973:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5974:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5974:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5975:3: ( RULE_ID )
            {
             before(grammarAccess.getSitePatternAccess().getSiteSiteCrossReference_1_0()); 
            // InternalReactionRules.g:5976:3: ( RULE_ID )
            // InternalReactionRules.g:5977:4: RULE_ID
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
    // InternalReactionRules.g:5988:1: rule__SitePattern__StateAssignment_2_1 : ( ruleSiteState ) ;
    public final void rule__SitePattern__StateAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5992:1: ( ( ruleSiteState ) )
            // InternalReactionRules.g:5993:2: ( ruleSiteState )
            {
            // InternalReactionRules.g:5993:2: ( ruleSiteState )
            // InternalReactionRules.g:5994:3: ruleSiteState
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
    // InternalReactionRules.g:6003:1: rule__SitePattern__LinkStateAssignment_4 : ( ruleLinkState ) ;
    public final void rule__SitePattern__LinkStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6007:1: ( ( ruleLinkState ) )
            // InternalReactionRules.g:6008:2: ( ruleLinkState )
            {
            // InternalReactionRules.g:6008:2: ( ruleLinkState )
            // InternalReactionRules.g:6009:3: ruleLinkState
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
    // InternalReactionRules.g:6018:1: rule__SitePatterns__SitePatternsAssignment_1_0 : ( ruleSitePattern ) ;
    public final void rule__SitePatterns__SitePatternsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6022:1: ( ( ruleSitePattern ) )
            // InternalReactionRules.g:6023:2: ( ruleSitePattern )
            {
            // InternalReactionRules.g:6023:2: ( ruleSitePattern )
            // InternalReactionRules.g:6024:3: ruleSitePattern
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
    // InternalReactionRules.g:6033:1: rule__SitePatterns__SitePatternsAssignment_1_1_1 : ( ruleSitePattern ) ;
    public final void rule__SitePatterns__SitePatternsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6037:1: ( ( ruleSitePattern ) )
            // InternalReactionRules.g:6038:2: ( ruleSitePattern )
            {
            // InternalReactionRules.g:6038:2: ( ruleSitePattern )
            // InternalReactionRules.g:6039:3: ruleSitePattern
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


    // $ANTLR start "rule__AgentPattern__AgentAssignment_1"
    // InternalReactionRules.g:6048:1: rule__AgentPattern__AgentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AgentPattern__AgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6052:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6053:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6053:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6054:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentPatternAccess().getAgentAgentCrossReference_1_0()); 
            // InternalReactionRules.g:6055:3: ( RULE_ID )
            // InternalReactionRules.g:6056:4: RULE_ID
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


    // $ANTLR start "rule__AgentPattern__SitePatternsAssignment_3"
    // InternalReactionRules.g:6067:1: rule__AgentPattern__SitePatternsAssignment_3 : ( ruleSitePatterns ) ;
    public final void rule__AgentPattern__SitePatternsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6071:1: ( ( ruleSitePatterns ) )
            // InternalReactionRules.g:6072:2: ( ruleSitePatterns )
            {
            // InternalReactionRules.g:6072:2: ( ruleSitePatterns )
            // InternalReactionRules.g:6073:3: ruleSitePatterns
            {
             before(grammarAccess.getAgentPatternAccess().getSitePatternsSitePatternsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSitePatterns();

            state._fsp--;

             after(grammarAccess.getAgentPatternAccess().getSitePatternsSitePatternsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentPattern__SitePatternsAssignment_3"


    // $ANTLR start "rule__Pattern__AgentPatternsAssignment_2_0"
    // InternalReactionRules.g:6082:1: rule__Pattern__AgentPatternsAssignment_2_0 : ( ruleAgentPattern ) ;
    public final void rule__Pattern__AgentPatternsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6086:1: ( ( ruleAgentPattern ) )
            // InternalReactionRules.g:6087:2: ( ruleAgentPattern )
            {
            // InternalReactionRules.g:6087:2: ( ruleAgentPattern )
            // InternalReactionRules.g:6088:3: ruleAgentPattern
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
    // InternalReactionRules.g:6097:1: rule__Pattern__AgentPatternsAssignment_2_1_1 : ( ruleAgentPattern ) ;
    public final void rule__Pattern__AgentPatternsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6101:1: ( ( ruleAgentPattern ) )
            // InternalReactionRules.g:6102:2: ( ruleAgentPattern )
            {
            // InternalReactionRules.g:6102:2: ( ruleAgentPattern )
            // InternalReactionRules.g:6103:3: ruleAgentPattern
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
    // InternalReactionRules.g:6112:1: rule__Observation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Observation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6116:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6117:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6117:2: ( RULE_ID )
            // InternalReactionRules.g:6118:3: RULE_ID
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
    // InternalReactionRules.g:6127:1: rule__Observation__ObservationPatternAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__Observation__ObservationPatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6131:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6132:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6132:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6133:3: rulePatternAssignment
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


    // $ANTLR start "rule__Initial__NameAssignment_1"
    // InternalReactionRules.g:6142:1: rule__Initial__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Initial__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6146:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6147:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6147:2: ( RULE_ID )
            // InternalReactionRules.g:6148:3: RULE_ID
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
    // InternalReactionRules.g:6157:1: rule__Initial__CountAssignment_2 : ( ruleUnsignedInteger ) ;
    public final void rule__Initial__CountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6161:1: ( ( ruleUnsignedInteger ) )
            // InternalReactionRules.g:6162:2: ( ruleUnsignedInteger )
            {
            // InternalReactionRules.g:6162:2: ( ruleUnsignedInteger )
            // InternalReactionRules.g:6163:3: ruleUnsignedInteger
            {
             before(grammarAccess.getInitialAccess().getCountUnsignedIntegerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsignedInteger();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getCountUnsignedIntegerParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalReactionRules.g:6172:1: rule__Initial__InitialPatternAssignment_3 : ( rulePatternAssignment ) ;
    public final void rule__Initial__InitialPatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6176:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6177:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6177:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6178:3: rulePatternAssignment
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
    // InternalReactionRules.g:6187:1: rule__AssignFromPattern__PatternAssignment : ( rulePattern ) ;
    public final void rule__AssignFromPattern__PatternAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6191:1: ( ( rulePattern ) )
            // InternalReactionRules.g:6192:2: ( rulePattern )
            {
            // InternalReactionRules.g:6192:2: ( rulePattern )
            // InternalReactionRules.g:6193:3: rulePattern
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
    // InternalReactionRules.g:6202:1: rule__AssignFromVariable__PatternVarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__AssignFromVariable__PatternVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6206:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6207:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6207:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6208:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignFromVariableAccess().getPatternVarPatternVariableCrossReference_0()); 
            // InternalReactionRules.g:6209:3: ( RULE_ID )
            // InternalReactionRules.g:6210:4: RULE_ID
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
    // InternalReactionRules.g:6221:1: rule__RuleVariables__VariablesAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RuleVariables__VariablesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6225:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6226:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6226:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6227:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesArithmeticVariableCrossReference_0_0()); 
            // InternalReactionRules.g:6228:3: ( RULE_ID )
            // InternalReactionRules.g:6229:4: RULE_ID
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesArithmeticVariableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleVariablesAccess().getVariablesArithmeticVariableIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRuleVariablesAccess().getVariablesArithmeticVariableCrossReference_0_0()); 

            }


            }

        }
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
    // InternalReactionRules.g:6240:1: rule__RuleVariables__VariablesAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__RuleVariables__VariablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6244:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6245:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6245:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6246:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesArithmeticVariableCrossReference_1_1_0()); 
            // InternalReactionRules.g:6247:3: ( RULE_ID )
            // InternalReactionRules.g:6248:4: RULE_ID
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesArithmeticVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleVariablesAccess().getVariablesArithmeticVariableIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getRuleVariablesAccess().getVariablesArithmeticVariableCrossReference_1_1_0()); 

            }


            }

        }
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
    // InternalReactionRules.g:6259:1: rule__UnidirectionalRule__LhsAssignment_0 : ( rulePatternAssignment ) ;
    public final void rule__UnidirectionalRule__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6263:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6264:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6264:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6265:3: rulePatternAssignment
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
    // InternalReactionRules.g:6274:1: rule__UnidirectionalRule__OperatorAssignment_1 : ( RULE_UNI ) ;
    public final void rule__UnidirectionalRule__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6278:1: ( ( RULE_UNI ) )
            // InternalReactionRules.g:6279:2: ( RULE_UNI )
            {
            // InternalReactionRules.g:6279:2: ( RULE_UNI )
            // InternalReactionRules.g:6280:3: RULE_UNI
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
    // InternalReactionRules.g:6289:1: rule__UnidirectionalRule__RhsAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__UnidirectionalRule__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6293:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6294:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6294:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6295:3: rulePatternAssignment
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
    // InternalReactionRules.g:6304:1: rule__UnidirectionalRule__VariablesAssignment_5 : ( ruleRuleVariables ) ;
    public final void rule__UnidirectionalRule__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6308:1: ( ( ruleRuleVariables ) )
            // InternalReactionRules.g:6309:2: ( ruleRuleVariables )
            {
            // InternalReactionRules.g:6309:2: ( ruleRuleVariables )
            // InternalReactionRules.g:6310:3: ruleRuleVariables
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
    // InternalReactionRules.g:6319:1: rule__BidirectionalRule__LhsAssignment_0 : ( rulePatternAssignment ) ;
    public final void rule__BidirectionalRule__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6323:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6324:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6324:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6325:3: rulePatternAssignment
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
    // InternalReactionRules.g:6334:1: rule__BidirectionalRule__OperatorAssignment_1 : ( RULE_BI ) ;
    public final void rule__BidirectionalRule__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6338:1: ( ( RULE_BI ) )
            // InternalReactionRules.g:6339:2: ( RULE_BI )
            {
            // InternalReactionRules.g:6339:2: ( RULE_BI )
            // InternalReactionRules.g:6340:3: RULE_BI
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
    // InternalReactionRules.g:6349:1: rule__BidirectionalRule__RhsAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__BidirectionalRule__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6353:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6354:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6354:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6355:3: rulePatternAssignment
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
    // InternalReactionRules.g:6364:1: rule__BidirectionalRule__VariablesAssignment_5 : ( ruleRuleVariables ) ;
    public final void rule__BidirectionalRule__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6368:1: ( ( ruleRuleVariables ) )
            // InternalReactionRules.g:6369:2: ( ruleRuleVariables )
            {
            // InternalReactionRules.g:6369:2: ( ruleRuleVariables )
            // InternalReactionRules.g:6370:3: ruleRuleVariables
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
    // InternalReactionRules.g:6379:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6383:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6384:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6384:2: ( RULE_ID )
            // InternalReactionRules.g:6385:3: RULE_ID
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
    // InternalReactionRules.g:6394:1: rule__Rule__RuleAssignment_2 : ( ruleRuleBody ) ;
    public final void rule__Rule__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6398:1: ( ( ruleRuleBody ) )
            // InternalReactionRules.g:6399:2: ( ruleRuleBody )
            {
            // InternalReactionRules.g:6399:2: ( ruleRuleBody )
            // InternalReactionRules.g:6400:3: ruleRuleBody
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\5\1\6\3\uffff\1\11\2\uffff";
    static final String dfa_3s = "\2\4\2\27\1\4\2\uffff\1\5\2\uffff";
    static final String dfa_4s = "\1\26\1\4\2\44\1\4\2\uffff\1\44\2\uffff";
    static final String dfa_5s = "\5\uffff\1\2\1\3\1\uffff\1\4\1\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\21\uffff\1\1",
            "\1\3",
            "\1\4\5\uffff\2\5\3\uffff\3\5",
            "\1\4\5\uffff\2\6\3\uffff\3\6",
            "\1\7",
            "",
            "",
            "\1\10\27\uffff\2\11\3\uffff\3\11",
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
            return "1319:1: rule__ArithmeticType__Alternatives : ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) );";
        }
    }
    static final String dfa_8s = "\103\uffff";
    static final String dfa_9s = "\2\10\1\14\1\33\1\14\2\uffff\1\10\1\30\1\31\1\10\1\4\1\10\1\31\2\41\1\27\2\41\1\33\1\40\1\32\3\10\1\41\1\30\1\31\1\30\1\10\1\4\1\10\1\4\1\31\2\41\1\27\2\41\1\31\2\41\1\27\2\41\1\40\1\32\1\10\1\40\1\32\2\10\2\41\1\30\1\10\1\4\1\31\2\41\1\27\2\41\1\40\1\32\1\10\1\41";
    static final String dfa_10s = "\1\30\1\31\1\15\1\33\1\15\2\uffff\1\34\1\40\1\32\1\10\1\13\1\10\1\31\2\41\1\27\2\41\1\33\1\40\1\34\1\10\1\34\1\10\1\41\1\40\1\32\1\40\1\10\1\13\1\10\1\13\1\31\2\41\1\27\2\41\1\31\2\41\1\27\2\41\1\40\1\34\1\10\1\40\1\34\2\10\2\41\1\40\1\10\1\13\1\31\2\41\1\27\2\41\1\40\1\34\1\10\1\41";
    static final String dfa_11s = "\5\uffff\1\1\1\2\74\uffff";
    static final String dfa_12s = "\103\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\17\uffff\1\1",
            "\1\3\20\uffff\1\4",
            "\1\5\1\6",
            "\1\7",
            "\1\5\1\6",
            "",
            "",
            "\1\10\23\uffff\1\11",
            "\1\12\7\uffff\1\13",
            "\1\4\1\14",
            "\1\15",
            "\1\21\3\uffff\1\20\1\16\1\17\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\25",
            "\1\26",
            "\1\25",
            "\1\25",
            "\1\27",
            "\1\13",
            "\1\30\1\uffff\1\11",
            "\1\31",
            "\1\32\23\uffff\1\33",
            "\1\34",
            "\1\25",
            "\1\35\7\uffff\1\36",
            "\1\4\1\14",
            "\1\37\7\uffff\1\40",
            "\1\41",
            "\1\45\3\uffff\1\44\1\42\1\43\1\46",
            "\1\47",
            "\1\53\3\uffff\1\52\1\50\1\51\1\54",
            "\1\55",
            "\1\56",
            "\1\56",
            "\1\57",
            "\1\56",
            "\1\56",
            "\1\60",
            "\1\61",
            "\1\61",
            "\1\62",
            "\1\61",
            "\1\61",
            "\1\36",
            "\1\63\1\uffff\1\33",
            "\1\64",
            "\1\40",
            "\1\30\1\uffff\1\11",
            "\1\65",
            "\1\66",
            "\1\56",
            "\1\61",
            "\1\67\7\uffff\1\70",
            "\1\71",
            "\1\75\3\uffff\1\74\1\72\1\73\1\76",
            "\1\77",
            "\1\100",
            "\1\100",
            "\1\101",
            "\1\100",
            "\1\100",
            "\1\70",
            "\1\63\1\uffff\1\33",
            "\1\102",
            "\1\100"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1433:1: rule__RuleBody__Alternatives : ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001C60000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001C60000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000F10L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002000100L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000002000L});

}