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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_EXPONENT", "RULE_AT", "RULE_STRING", "RULE_ID", "RULE_SEMI_LINK", "RULE_FREE_LINK", "RULE_WHATEVER_LINK", "RULE_UNI", "RULE_BI", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'+'", "'URI'", "'PATH'", "'ModelID'", "'AgentInstance'", "'.'", "'{'", "'}'", "','", "'('", "')'", "'agent'", "'var'", "'='", "'['", "']'", "'obs'", "'init'", "'rule'"
    };
    public static final int RULE_FREE_LINK=10;
    public static final int RULE_STRING=7;
    public static final int RULE_AT=6;
    public static final int RULE_WHATEVER_LINK=11;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__37=37;
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


    // $ANTLR start "entryRuleNumericFromLiteral"
    // InternalReactionRules.g:1035:1: entryRuleNumericFromLiteral : ruleNumericFromLiteral EOF ;
    public final void entryRuleNumericFromLiteral() throws RecognitionException {
        try {
            // InternalReactionRules.g:1036:1: ( ruleNumericFromLiteral EOF )
            // InternalReactionRules.g:1037:1: ruleNumericFromLiteral EOF
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
    // InternalReactionRules.g:1044:1: ruleNumericFromLiteral : ( ( rule__NumericFromLiteral__ValueAssignment ) ) ;
    public final void ruleNumericFromLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1048:2: ( ( ( rule__NumericFromLiteral__ValueAssignment ) ) )
            // InternalReactionRules.g:1049:2: ( ( rule__NumericFromLiteral__ValueAssignment ) )
            {
            // InternalReactionRules.g:1049:2: ( ( rule__NumericFromLiteral__ValueAssignment ) )
            // InternalReactionRules.g:1050:3: ( rule__NumericFromLiteral__ValueAssignment )
            {
             before(grammarAccess.getNumericFromLiteralAccess().getValueAssignment()); 
            // InternalReactionRules.g:1051:3: ( rule__NumericFromLiteral__ValueAssignment )
            // InternalReactionRules.g:1051:4: rule__NumericFromLiteral__ValueAssignment
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
    // InternalReactionRules.g:1060:1: entryRuleNumericFromVariable : ruleNumericFromVariable EOF ;
    public final void entryRuleNumericFromVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:1061:1: ( ruleNumericFromVariable EOF )
            // InternalReactionRules.g:1062:1: ruleNumericFromVariable EOF
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
    // InternalReactionRules.g:1069:1: ruleNumericFromVariable : ( ( rule__NumericFromVariable__ValueVarAssignment ) ) ;
    public final void ruleNumericFromVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1073:2: ( ( ( rule__NumericFromVariable__ValueVarAssignment ) ) )
            // InternalReactionRules.g:1074:2: ( ( rule__NumericFromVariable__ValueVarAssignment ) )
            {
            // InternalReactionRules.g:1074:2: ( ( rule__NumericFromVariable__ValueVarAssignment ) )
            // InternalReactionRules.g:1075:3: ( rule__NumericFromVariable__ValueVarAssignment )
            {
             before(grammarAccess.getNumericFromVariableAccess().getValueVarAssignment()); 
            // InternalReactionRules.g:1076:3: ( rule__NumericFromVariable__ValueVarAssignment )
            // InternalReactionRules.g:1076:4: rule__NumericFromVariable__ValueVarAssignment
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
    // InternalReactionRules.g:1085:1: entryRuleNumericAssignment : ruleNumericAssignment EOF ;
    public final void entryRuleNumericAssignment() throws RecognitionException {
        try {
            // InternalReactionRules.g:1086:1: ( ruleNumericAssignment EOF )
            // InternalReactionRules.g:1087:1: ruleNumericAssignment EOF
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
    // InternalReactionRules.g:1094:1: ruleNumericAssignment : ( ( rule__NumericAssignment__Alternatives ) ) ;
    public final void ruleNumericAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1098:2: ( ( ( rule__NumericAssignment__Alternatives ) ) )
            // InternalReactionRules.g:1099:2: ( ( rule__NumericAssignment__Alternatives ) )
            {
            // InternalReactionRules.g:1099:2: ( ( rule__NumericAssignment__Alternatives ) )
            // InternalReactionRules.g:1100:3: ( rule__NumericAssignment__Alternatives )
            {
             before(grammarAccess.getNumericAssignmentAccess().getAlternatives()); 
            // InternalReactionRules.g:1101:3: ( rule__NumericAssignment__Alternatives )
            // InternalReactionRules.g:1101:4: rule__NumericAssignment__Alternatives
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
    // InternalReactionRules.g:1110:1: entryRuleInitial : ruleInitial EOF ;
    public final void entryRuleInitial() throws RecognitionException {
        try {
            // InternalReactionRules.g:1111:1: ( ruleInitial EOF )
            // InternalReactionRules.g:1112:1: ruleInitial EOF
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
    // InternalReactionRules.g:1119:1: ruleInitial : ( ( rule__Initial__Group__0 ) ) ;
    public final void ruleInitial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1123:2: ( ( ( rule__Initial__Group__0 ) ) )
            // InternalReactionRules.g:1124:2: ( ( rule__Initial__Group__0 ) )
            {
            // InternalReactionRules.g:1124:2: ( ( rule__Initial__Group__0 ) )
            // InternalReactionRules.g:1125:3: ( rule__Initial__Group__0 )
            {
             before(grammarAccess.getInitialAccess().getGroup()); 
            // InternalReactionRules.g:1126:3: ( rule__Initial__Group__0 )
            // InternalReactionRules.g:1126:4: rule__Initial__Group__0
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
    // InternalReactionRules.g:1135:1: entryRuleAssignFromPattern : ruleAssignFromPattern EOF ;
    public final void entryRuleAssignFromPattern() throws RecognitionException {
        try {
            // InternalReactionRules.g:1136:1: ( ruleAssignFromPattern EOF )
            // InternalReactionRules.g:1137:1: ruleAssignFromPattern EOF
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
    // InternalReactionRules.g:1144:1: ruleAssignFromPattern : ( ( rule__AssignFromPattern__PatternAssignment ) ) ;
    public final void ruleAssignFromPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1148:2: ( ( ( rule__AssignFromPattern__PatternAssignment ) ) )
            // InternalReactionRules.g:1149:2: ( ( rule__AssignFromPattern__PatternAssignment ) )
            {
            // InternalReactionRules.g:1149:2: ( ( rule__AssignFromPattern__PatternAssignment ) )
            // InternalReactionRules.g:1150:3: ( rule__AssignFromPattern__PatternAssignment )
            {
             before(grammarAccess.getAssignFromPatternAccess().getPatternAssignment()); 
            // InternalReactionRules.g:1151:3: ( rule__AssignFromPattern__PatternAssignment )
            // InternalReactionRules.g:1151:4: rule__AssignFromPattern__PatternAssignment
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
    // InternalReactionRules.g:1160:1: entryRuleAssignFromVariable : ruleAssignFromVariable EOF ;
    public final void entryRuleAssignFromVariable() throws RecognitionException {
        try {
            // InternalReactionRules.g:1161:1: ( ruleAssignFromVariable EOF )
            // InternalReactionRules.g:1162:1: ruleAssignFromVariable EOF
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
    // InternalReactionRules.g:1169:1: ruleAssignFromVariable : ( ( rule__AssignFromVariable__PatternVarAssignment ) ) ;
    public final void ruleAssignFromVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1173:2: ( ( ( rule__AssignFromVariable__PatternVarAssignment ) ) )
            // InternalReactionRules.g:1174:2: ( ( rule__AssignFromVariable__PatternVarAssignment ) )
            {
            // InternalReactionRules.g:1174:2: ( ( rule__AssignFromVariable__PatternVarAssignment ) )
            // InternalReactionRules.g:1175:3: ( rule__AssignFromVariable__PatternVarAssignment )
            {
             before(grammarAccess.getAssignFromVariableAccess().getPatternVarAssignment()); 
            // InternalReactionRules.g:1176:3: ( rule__AssignFromVariable__PatternVarAssignment )
            // InternalReactionRules.g:1176:4: rule__AssignFromVariable__PatternVarAssignment
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
    // InternalReactionRules.g:1185:1: entryRulePatternAssignment : rulePatternAssignment EOF ;
    public final void entryRulePatternAssignment() throws RecognitionException {
        try {
            // InternalReactionRules.g:1186:1: ( rulePatternAssignment EOF )
            // InternalReactionRules.g:1187:1: rulePatternAssignment EOF
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
    // InternalReactionRules.g:1194:1: rulePatternAssignment : ( ( rule__PatternAssignment__Alternatives ) ) ;
    public final void rulePatternAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1198:2: ( ( ( rule__PatternAssignment__Alternatives ) ) )
            // InternalReactionRules.g:1199:2: ( ( rule__PatternAssignment__Alternatives ) )
            {
            // InternalReactionRules.g:1199:2: ( ( rule__PatternAssignment__Alternatives ) )
            // InternalReactionRules.g:1200:3: ( rule__PatternAssignment__Alternatives )
            {
             before(grammarAccess.getPatternAssignmentAccess().getAlternatives()); 
            // InternalReactionRules.g:1201:3: ( rule__PatternAssignment__Alternatives )
            // InternalReactionRules.g:1201:4: rule__PatternAssignment__Alternatives
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
    // InternalReactionRules.g:1210:1: entryRuleRuleVariables : ruleRuleVariables EOF ;
    public final void entryRuleRuleVariables() throws RecognitionException {
        try {
            // InternalReactionRules.g:1211:1: ( ruleRuleVariables EOF )
            // InternalReactionRules.g:1212:1: ruleRuleVariables EOF
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
    // InternalReactionRules.g:1219:1: ruleRuleVariables : ( ( rule__RuleVariables__Group__0 ) ) ;
    public final void ruleRuleVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1223:2: ( ( ( rule__RuleVariables__Group__0 ) ) )
            // InternalReactionRules.g:1224:2: ( ( rule__RuleVariables__Group__0 ) )
            {
            // InternalReactionRules.g:1224:2: ( ( rule__RuleVariables__Group__0 ) )
            // InternalReactionRules.g:1225:3: ( rule__RuleVariables__Group__0 )
            {
             before(grammarAccess.getRuleVariablesAccess().getGroup()); 
            // InternalReactionRules.g:1226:3: ( rule__RuleVariables__Group__0 )
            // InternalReactionRules.g:1226:4: rule__RuleVariables__Group__0
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
    // InternalReactionRules.g:1235:1: entryRuleUnidirectionalRule : ruleUnidirectionalRule EOF ;
    public final void entryRuleUnidirectionalRule() throws RecognitionException {
        try {
            // InternalReactionRules.g:1236:1: ( ruleUnidirectionalRule EOF )
            // InternalReactionRules.g:1237:1: ruleUnidirectionalRule EOF
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
    // InternalReactionRules.g:1244:1: ruleUnidirectionalRule : ( ( rule__UnidirectionalRule__Group__0 ) ) ;
    public final void ruleUnidirectionalRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1248:2: ( ( ( rule__UnidirectionalRule__Group__0 ) ) )
            // InternalReactionRules.g:1249:2: ( ( rule__UnidirectionalRule__Group__0 ) )
            {
            // InternalReactionRules.g:1249:2: ( ( rule__UnidirectionalRule__Group__0 ) )
            // InternalReactionRules.g:1250:3: ( rule__UnidirectionalRule__Group__0 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getGroup()); 
            // InternalReactionRules.g:1251:3: ( rule__UnidirectionalRule__Group__0 )
            // InternalReactionRules.g:1251:4: rule__UnidirectionalRule__Group__0
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
    // InternalReactionRules.g:1260:1: entryRuleBidirectionalRule : ruleBidirectionalRule EOF ;
    public final void entryRuleBidirectionalRule() throws RecognitionException {
        try {
            // InternalReactionRules.g:1261:1: ( ruleBidirectionalRule EOF )
            // InternalReactionRules.g:1262:1: ruleBidirectionalRule EOF
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
    // InternalReactionRules.g:1269:1: ruleBidirectionalRule : ( ( rule__BidirectionalRule__Group__0 ) ) ;
    public final void ruleBidirectionalRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1273:2: ( ( ( rule__BidirectionalRule__Group__0 ) ) )
            // InternalReactionRules.g:1274:2: ( ( rule__BidirectionalRule__Group__0 ) )
            {
            // InternalReactionRules.g:1274:2: ( ( rule__BidirectionalRule__Group__0 ) )
            // InternalReactionRules.g:1275:3: ( rule__BidirectionalRule__Group__0 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getGroup()); 
            // InternalReactionRules.g:1276:3: ( rule__BidirectionalRule__Group__0 )
            // InternalReactionRules.g:1276:4: rule__BidirectionalRule__Group__0
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
    // InternalReactionRules.g:1285:1: entryRuleRuleBody : ruleRuleBody EOF ;
    public final void entryRuleRuleBody() throws RecognitionException {
        try {
            // InternalReactionRules.g:1286:1: ( ruleRuleBody EOF )
            // InternalReactionRules.g:1287:1: ruleRuleBody EOF
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
    // InternalReactionRules.g:1294:1: ruleRuleBody : ( ( rule__RuleBody__Alternatives ) ) ;
    public final void ruleRuleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1298:2: ( ( ( rule__RuleBody__Alternatives ) ) )
            // InternalReactionRules.g:1299:2: ( ( rule__RuleBody__Alternatives ) )
            {
            // InternalReactionRules.g:1299:2: ( ( rule__RuleBody__Alternatives ) )
            // InternalReactionRules.g:1300:3: ( rule__RuleBody__Alternatives )
            {
             before(grammarAccess.getRuleBodyAccess().getAlternatives()); 
            // InternalReactionRules.g:1301:3: ( rule__RuleBody__Alternatives )
            // InternalReactionRules.g:1301:4: rule__RuleBody__Alternatives
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
    // InternalReactionRules.g:1310:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalReactionRules.g:1311:1: ( ruleRule EOF )
            // InternalReactionRules.g:1312:1: ruleRule EOF
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
    // InternalReactionRules.g:1319:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1323:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalReactionRules.g:1324:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalReactionRules.g:1324:2: ( ( rule__Rule__Group__0 ) )
            // InternalReactionRules.g:1325:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalReactionRules.g:1326:3: ( rule__Rule__Group__0 )
            // InternalReactionRules.g:1326:4: rule__Rule__Group__0
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
    // InternalReactionRules.g:1334:1: rule__ModelLocation__Alternatives : ( ( ruleModelUri ) | ( ruleModelPath ) );
    public final void rule__ModelLocation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1338:1: ( ( ruleModelUri ) | ( ruleModelPath ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalReactionRules.g:1339:2: ( ruleModelUri )
                    {
                    // InternalReactionRules.g:1339:2: ( ruleModelUri )
                    // InternalReactionRules.g:1340:3: ruleModelUri
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
                    // InternalReactionRules.g:1345:2: ( ruleModelPath )
                    {
                    // InternalReactionRules.g:1345:2: ( ruleModelPath )
                    // InternalReactionRules.g:1346:3: ruleModelPath
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
    // InternalReactionRules.g:1355:1: rule__ReactionProperty__Alternatives : ( ( ruleAgent ) | ( ruleVariable ) | ( ruleObservation ) | ( ruleInitial ) | ( ruleRule ) );
    public final void rule__ReactionProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1359:1: ( ( ruleAgent ) | ( ruleVariable ) | ( ruleObservation ) | ( ruleInitial ) | ( ruleRule ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 35:
                {
                alt2=3;
                }
                break;
            case 36:
                {
                alt2=4;
                }
                break;
            case 37:
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
                    // InternalReactionRules.g:1360:2: ( ruleAgent )
                    {
                    // InternalReactionRules.g:1360:2: ( ruleAgent )
                    // InternalReactionRules.g:1361:3: ruleAgent
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
                    // InternalReactionRules.g:1366:2: ( ruleVariable )
                    {
                    // InternalReactionRules.g:1366:2: ( ruleVariable )
                    // InternalReactionRules.g:1367:3: ruleVariable
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
                    // InternalReactionRules.g:1372:2: ( ruleObservation )
                    {
                    // InternalReactionRules.g:1372:2: ( ruleObservation )
                    // InternalReactionRules.g:1373:3: ruleObservation
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
                    // InternalReactionRules.g:1378:2: ( ruleInitial )
                    {
                    // InternalReactionRules.g:1378:2: ( ruleInitial )
                    // InternalReactionRules.g:1379:3: ruleInitial
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
                    // InternalReactionRules.g:1384:2: ( ruleRule )
                    {
                    // InternalReactionRules.g:1384:2: ( ruleRule )
                    // InternalReactionRules.g:1385:3: ruleRule
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
    // InternalReactionRules.g:1394:1: rule__ScientificFloat__Alternatives_5 : ( ( '-' ) | ( '+' ) );
    public final void rule__ScientificFloat__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1398:1: ( ( '-' ) | ( '+' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalReactionRules.g:1399:2: ( '-' )
                    {
                    // InternalReactionRules.g:1399:2: ( '-' )
                    // InternalReactionRules.g:1400:3: '-'
                    {
                     before(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_5_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1405:2: ( '+' )
                    {
                    // InternalReactionRules.g:1405:2: ( '+' )
                    // InternalReactionRules.g:1406:3: '+'
                    {
                     before(grammarAccess.getScientificFloatAccess().getPlusSignKeyword_5_1()); 
                    match(input,19,FOLLOW_2); 
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
    // InternalReactionRules.g:1415:1: rule__ArithmeticType__Alternatives : ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) );
    public final void rule__ArithmeticType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1419:1: ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalReactionRules.g:1420:2: ( ruleFloat )
                    {
                    // InternalReactionRules.g:1420:2: ( ruleFloat )
                    // InternalReactionRules.g:1421:3: ruleFloat
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
                    // InternalReactionRules.g:1426:2: ( ruleUnsignedInteger )
                    {
                    // InternalReactionRules.g:1426:2: ( ruleUnsignedInteger )
                    // InternalReactionRules.g:1427:3: ruleUnsignedInteger
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
                    // InternalReactionRules.g:1432:2: ( ruleSignedInteger )
                    {
                    // InternalReactionRules.g:1432:2: ( ruleSignedInteger )
                    // InternalReactionRules.g:1433:3: ruleSignedInteger
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
                    // InternalReactionRules.g:1438:2: ( ruleScientificFloat )
                    {
                    // InternalReactionRules.g:1438:2: ( ruleScientificFloat )
                    // InternalReactionRules.g:1439:3: ruleScientificFloat
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
    // InternalReactionRules.g:1448:1: rule__Variable__Alternatives : ( ( rulePatternVariable ) | ( ruleArithmeticVariable ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1452:1: ( ( rulePatternVariable ) | ( ruleArithmeticVariable ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==32) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==25) ) {
                            alt5=1;
                        }
                        else if ( (LA5_3==RULE_INT||LA5_3==18) ) {
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
                    // InternalReactionRules.g:1453:2: ( rulePatternVariable )
                    {
                    // InternalReactionRules.g:1453:2: ( rulePatternVariable )
                    // InternalReactionRules.g:1454:3: rulePatternVariable
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
                    // InternalReactionRules.g:1459:2: ( ruleArithmeticVariable )
                    {
                    // InternalReactionRules.g:1459:2: ( ruleArithmeticVariable )
                    // InternalReactionRules.g:1460:3: ruleArithmeticVariable
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
    // InternalReactionRules.g:1469:1: rule__LinkState__LinkStateAlternatives_1_0 : ( ( ruleSemiLink ) | ( ruleFreeLink ) | ( ruleExactLink ) | ( ruleIndexedLink ) | ( ruleWhatEver ) );
    public final void rule__LinkState__LinkStateAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1473:1: ( ( ruleSemiLink ) | ( ruleFreeLink ) | ( ruleExactLink ) | ( ruleIndexedLink ) | ( ruleWhatEver ) )
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
                    // InternalReactionRules.g:1474:2: ( ruleSemiLink )
                    {
                    // InternalReactionRules.g:1474:2: ( ruleSemiLink )
                    // InternalReactionRules.g:1475:3: ruleSemiLink
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
                    // InternalReactionRules.g:1480:2: ( ruleFreeLink )
                    {
                    // InternalReactionRules.g:1480:2: ( ruleFreeLink )
                    // InternalReactionRules.g:1481:3: ruleFreeLink
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
                    // InternalReactionRules.g:1486:2: ( ruleExactLink )
                    {
                    // InternalReactionRules.g:1486:2: ( ruleExactLink )
                    // InternalReactionRules.g:1487:3: ruleExactLink
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
                    // InternalReactionRules.g:1492:2: ( ruleIndexedLink )
                    {
                    // InternalReactionRules.g:1492:2: ( ruleIndexedLink )
                    // InternalReactionRules.g:1493:3: ruleIndexedLink
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
                    // InternalReactionRules.g:1498:2: ( ruleWhatEver )
                    {
                    // InternalReactionRules.g:1498:2: ( ruleWhatEver )
                    // InternalReactionRules.g:1499:3: ruleWhatEver
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


    // $ANTLR start "rule__NumericAssignment__Alternatives"
    // InternalReactionRules.g:1508:1: rule__NumericAssignment__Alternatives : ( ( ruleNumericFromLiteral ) | ( ruleNumericFromVariable ) );
    public final void rule__NumericAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1512:1: ( ( ruleNumericFromLiteral ) | ( ruleNumericFromVariable ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||LA7_0==18) ) {
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
                    // InternalReactionRules.g:1513:2: ( ruleNumericFromLiteral )
                    {
                    // InternalReactionRules.g:1513:2: ( ruleNumericFromLiteral )
                    // InternalReactionRules.g:1514:3: ruleNumericFromLiteral
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
                    // InternalReactionRules.g:1519:2: ( ruleNumericFromVariable )
                    {
                    // InternalReactionRules.g:1519:2: ( ruleNumericFromVariable )
                    // InternalReactionRules.g:1520:3: ruleNumericFromVariable
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
    // InternalReactionRules.g:1529:1: rule__PatternAssignment__Alternatives : ( ( ruleAssignFromPattern ) | ( ruleAssignFromVariable ) );
    public final void rule__PatternAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1533:1: ( ( ruleAssignFromPattern ) | ( ruleAssignFromVariable ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
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
                    // InternalReactionRules.g:1534:2: ( ruleAssignFromPattern )
                    {
                    // InternalReactionRules.g:1534:2: ( ruleAssignFromPattern )
                    // InternalReactionRules.g:1535:3: ruleAssignFromPattern
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
                    // InternalReactionRules.g:1540:2: ( ruleAssignFromVariable )
                    {
                    // InternalReactionRules.g:1540:2: ( ruleAssignFromVariable )
                    // InternalReactionRules.g:1541:3: ruleAssignFromVariable
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
    // InternalReactionRules.g:1550:1: rule__RuleBody__Alternatives : ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) );
    public final void rule__RuleBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1554:1: ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalReactionRules.g:1555:2: ( ruleUnidirectionalRule )
                    {
                    // InternalReactionRules.g:1555:2: ( ruleUnidirectionalRule )
                    // InternalReactionRules.g:1556:3: ruleUnidirectionalRule
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
                    // InternalReactionRules.g:1561:2: ( ruleBidirectionalRule )
                    {
                    // InternalReactionRules.g:1561:2: ( ruleBidirectionalRule )
                    // InternalReactionRules.g:1562:3: ruleBidirectionalRule
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
    // InternalReactionRules.g:1571:1: rule__ReactionRuleModel__Group__0 : rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1 ;
    public final void rule__ReactionRuleModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1575:1: ( rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1 )
            // InternalReactionRules.g:1576:2: rule__ReactionRuleModel__Group__0__Impl rule__ReactionRuleModel__Group__1
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
    // InternalReactionRules.g:1583:1: rule__ReactionRuleModel__Group__0__Impl : ( ( rule__ReactionRuleModel__ModelAssignment_0 ) ) ;
    public final void rule__ReactionRuleModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1587:1: ( ( ( rule__ReactionRuleModel__ModelAssignment_0 ) ) )
            // InternalReactionRules.g:1588:1: ( ( rule__ReactionRuleModel__ModelAssignment_0 ) )
            {
            // InternalReactionRules.g:1588:1: ( ( rule__ReactionRuleModel__ModelAssignment_0 ) )
            // InternalReactionRules.g:1589:2: ( rule__ReactionRuleModel__ModelAssignment_0 )
            {
             before(grammarAccess.getReactionRuleModelAccess().getModelAssignment_0()); 
            // InternalReactionRules.g:1590:2: ( rule__ReactionRuleModel__ModelAssignment_0 )
            // InternalReactionRules.g:1590:3: rule__ReactionRuleModel__ModelAssignment_0
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
    // InternalReactionRules.g:1598:1: rule__ReactionRuleModel__Group__1 : rule__ReactionRuleModel__Group__1__Impl rule__ReactionRuleModel__Group__2 ;
    public final void rule__ReactionRuleModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1602:1: ( rule__ReactionRuleModel__Group__1__Impl rule__ReactionRuleModel__Group__2 )
            // InternalReactionRules.g:1603:2: rule__ReactionRuleModel__Group__1__Impl rule__ReactionRuleModel__Group__2
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
    // InternalReactionRules.g:1610:1: rule__ReactionRuleModel__Group__1__Impl : ( ( rule__ReactionRuleModel__ReactionContainerAssignment_1 ) ) ;
    public final void rule__ReactionRuleModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1614:1: ( ( ( rule__ReactionRuleModel__ReactionContainerAssignment_1 ) ) )
            // InternalReactionRules.g:1615:1: ( ( rule__ReactionRuleModel__ReactionContainerAssignment_1 ) )
            {
            // InternalReactionRules.g:1615:1: ( ( rule__ReactionRuleModel__ReactionContainerAssignment_1 ) )
            // InternalReactionRules.g:1616:2: ( rule__ReactionRuleModel__ReactionContainerAssignment_1 )
            {
             before(grammarAccess.getReactionRuleModelAccess().getReactionContainerAssignment_1()); 
            // InternalReactionRules.g:1617:2: ( rule__ReactionRuleModel__ReactionContainerAssignment_1 )
            // InternalReactionRules.g:1617:3: rule__ReactionRuleModel__ReactionContainerAssignment_1
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
    // InternalReactionRules.g:1625:1: rule__ReactionRuleModel__Group__2 : rule__ReactionRuleModel__Group__2__Impl ;
    public final void rule__ReactionRuleModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1629:1: ( rule__ReactionRuleModel__Group__2__Impl )
            // InternalReactionRules.g:1630:2: rule__ReactionRuleModel__Group__2__Impl
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
    // InternalReactionRules.g:1636:1: rule__ReactionRuleModel__Group__2__Impl : ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )* ) ;
    public final void rule__ReactionRuleModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1640:1: ( ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )* ) )
            // InternalReactionRules.g:1641:1: ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )* )
            {
            // InternalReactionRules.g:1641:1: ( ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )* )
            // InternalReactionRules.g:1642:2: ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )*
            {
             before(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesAssignment_2()); 
            // InternalReactionRules.g:1643:2: ( rule__ReactionRuleModel__ReactionPropertiesAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=30 && LA10_0<=31)||(LA10_0>=35 && LA10_0<=37)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalReactionRules.g:1643:3: rule__ReactionRuleModel__ReactionPropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ReactionRuleModel__ReactionPropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalReactionRules.g:1652:1: rule__ModelUri__Group__0 : rule__ModelUri__Group__0__Impl rule__ModelUri__Group__1 ;
    public final void rule__ModelUri__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1656:1: ( rule__ModelUri__Group__0__Impl rule__ModelUri__Group__1 )
            // InternalReactionRules.g:1657:2: rule__ModelUri__Group__0__Impl rule__ModelUri__Group__1
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
    // InternalReactionRules.g:1664:1: rule__ModelUri__Group__0__Impl : ( 'URI' ) ;
    public final void rule__ModelUri__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1668:1: ( ( 'URI' ) )
            // InternalReactionRules.g:1669:1: ( 'URI' )
            {
            // InternalReactionRules.g:1669:1: ( 'URI' )
            // InternalReactionRules.g:1670:2: 'URI'
            {
             before(grammarAccess.getModelUriAccess().getURIKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalReactionRules.g:1679:1: rule__ModelUri__Group__1 : rule__ModelUri__Group__1__Impl ;
    public final void rule__ModelUri__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1683:1: ( rule__ModelUri__Group__1__Impl )
            // InternalReactionRules.g:1684:2: rule__ModelUri__Group__1__Impl
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
    // InternalReactionRules.g:1690:1: rule__ModelUri__Group__1__Impl : ( ( rule__ModelUri__UriAssignment_1 ) ) ;
    public final void rule__ModelUri__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1694:1: ( ( ( rule__ModelUri__UriAssignment_1 ) ) )
            // InternalReactionRules.g:1695:1: ( ( rule__ModelUri__UriAssignment_1 ) )
            {
            // InternalReactionRules.g:1695:1: ( ( rule__ModelUri__UriAssignment_1 ) )
            // InternalReactionRules.g:1696:2: ( rule__ModelUri__UriAssignment_1 )
            {
             before(grammarAccess.getModelUriAccess().getUriAssignment_1()); 
            // InternalReactionRules.g:1697:2: ( rule__ModelUri__UriAssignment_1 )
            // InternalReactionRules.g:1697:3: rule__ModelUri__UriAssignment_1
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
    // InternalReactionRules.g:1706:1: rule__ModelPath__Group__0 : rule__ModelPath__Group__0__Impl rule__ModelPath__Group__1 ;
    public final void rule__ModelPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1710:1: ( rule__ModelPath__Group__0__Impl rule__ModelPath__Group__1 )
            // InternalReactionRules.g:1711:2: rule__ModelPath__Group__0__Impl rule__ModelPath__Group__1
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
    // InternalReactionRules.g:1718:1: rule__ModelPath__Group__0__Impl : ( 'PATH' ) ;
    public final void rule__ModelPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1722:1: ( ( 'PATH' ) )
            // InternalReactionRules.g:1723:1: ( 'PATH' )
            {
            // InternalReactionRules.g:1723:1: ( 'PATH' )
            // InternalReactionRules.g:1724:2: 'PATH'
            {
             before(grammarAccess.getModelPathAccess().getPATHKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalReactionRules.g:1733:1: rule__ModelPath__Group__1 : rule__ModelPath__Group__1__Impl ;
    public final void rule__ModelPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1737:1: ( rule__ModelPath__Group__1__Impl )
            // InternalReactionRules.g:1738:2: rule__ModelPath__Group__1__Impl
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
    // InternalReactionRules.g:1744:1: rule__ModelPath__Group__1__Impl : ( ( rule__ModelPath__PathAssignment_1 ) ) ;
    public final void rule__ModelPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1748:1: ( ( ( rule__ModelPath__PathAssignment_1 ) ) )
            // InternalReactionRules.g:1749:1: ( ( rule__ModelPath__PathAssignment_1 ) )
            {
            // InternalReactionRules.g:1749:1: ( ( rule__ModelPath__PathAssignment_1 ) )
            // InternalReactionRules.g:1750:2: ( rule__ModelPath__PathAssignment_1 )
            {
             before(grammarAccess.getModelPathAccess().getPathAssignment_1()); 
            // InternalReactionRules.g:1751:2: ( rule__ModelPath__PathAssignment_1 )
            // InternalReactionRules.g:1751:3: rule__ModelPath__PathAssignment_1
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
    // InternalReactionRules.g:1760:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1764:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalReactionRules.g:1765:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalReactionRules.g:1772:1: rule__Model__Group__0__Impl : ( 'ModelID' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1776:1: ( ( 'ModelID' ) )
            // InternalReactionRules.g:1777:1: ( 'ModelID' )
            {
            // InternalReactionRules.g:1777:1: ( 'ModelID' )
            // InternalReactionRules.g:1778:2: 'ModelID'
            {
             before(grammarAccess.getModelAccess().getModelIDKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalReactionRules.g:1787:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1791:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalReactionRules.g:1792:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalReactionRules.g:1799:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1803:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalReactionRules.g:1804:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:1804:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalReactionRules.g:1805:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:1806:2: ( rule__Model__NameAssignment_1 )
            // InternalReactionRules.g:1806:3: rule__Model__NameAssignment_1
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
    // InternalReactionRules.g:1814:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1818:1: ( rule__Model__Group__2__Impl )
            // InternalReactionRules.g:1819:2: rule__Model__Group__2__Impl
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
    // InternalReactionRules.g:1825:1: rule__Model__Group__2__Impl : ( ( rule__Model__LocationAssignment_2 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1829:1: ( ( ( rule__Model__LocationAssignment_2 )? ) )
            // InternalReactionRules.g:1830:1: ( ( rule__Model__LocationAssignment_2 )? )
            {
            // InternalReactionRules.g:1830:1: ( ( rule__Model__LocationAssignment_2 )? )
            // InternalReactionRules.g:1831:2: ( rule__Model__LocationAssignment_2 )?
            {
             before(grammarAccess.getModelAccess().getLocationAssignment_2()); 
            // InternalReactionRules.g:1832:2: ( rule__Model__LocationAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=20 && LA11_0<=21)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalReactionRules.g:1832:3: rule__Model__LocationAssignment_2
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
    // InternalReactionRules.g:1841:1: rule__ReactionContainer__Group__0 : rule__ReactionContainer__Group__0__Impl rule__ReactionContainer__Group__1 ;
    public final void rule__ReactionContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1845:1: ( rule__ReactionContainer__Group__0__Impl rule__ReactionContainer__Group__1 )
            // InternalReactionRules.g:1846:2: rule__ReactionContainer__Group__0__Impl rule__ReactionContainer__Group__1
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
    // InternalReactionRules.g:1853:1: rule__ReactionContainer__Group__0__Impl : ( () ) ;
    public final void rule__ReactionContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1857:1: ( ( () ) )
            // InternalReactionRules.g:1858:1: ( () )
            {
            // InternalReactionRules.g:1858:1: ( () )
            // InternalReactionRules.g:1859:2: ()
            {
             before(grammarAccess.getReactionContainerAccess().getReactionContainerAction_0()); 
            // InternalReactionRules.g:1860:2: ()
            // InternalReactionRules.g:1860:3: 
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
    // InternalReactionRules.g:1868:1: rule__ReactionContainer__Group__1 : rule__ReactionContainer__Group__1__Impl ;
    public final void rule__ReactionContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1872:1: ( rule__ReactionContainer__Group__1__Impl )
            // InternalReactionRules.g:1873:2: rule__ReactionContainer__Group__1__Impl
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
    // InternalReactionRules.g:1879:1: rule__ReactionContainer__Group__1__Impl : ( ( rule__ReactionContainer__AgentInstancesAssignment_1 )* ) ;
    public final void rule__ReactionContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1883:1: ( ( ( rule__ReactionContainer__AgentInstancesAssignment_1 )* ) )
            // InternalReactionRules.g:1884:1: ( ( rule__ReactionContainer__AgentInstancesAssignment_1 )* )
            {
            // InternalReactionRules.g:1884:1: ( ( rule__ReactionContainer__AgentInstancesAssignment_1 )* )
            // InternalReactionRules.g:1885:2: ( rule__ReactionContainer__AgentInstancesAssignment_1 )*
            {
             before(grammarAccess.getReactionContainerAccess().getAgentInstancesAssignment_1()); 
            // InternalReactionRules.g:1886:2: ( rule__ReactionContainer__AgentInstancesAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalReactionRules.g:1886:3: rule__ReactionContainer__AgentInstancesAssignment_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ReactionContainer__AgentInstancesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalReactionRules.g:1895:1: rule__AgentInstanceSiteState__Group__0 : rule__AgentInstanceSiteState__Group__0__Impl rule__AgentInstanceSiteState__Group__1 ;
    public final void rule__AgentInstanceSiteState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1899:1: ( rule__AgentInstanceSiteState__Group__0__Impl rule__AgentInstanceSiteState__Group__1 )
            // InternalReactionRules.g:1900:2: rule__AgentInstanceSiteState__Group__0__Impl rule__AgentInstanceSiteState__Group__1
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
    // InternalReactionRules.g:1907:1: rule__AgentInstanceSiteState__Group__0__Impl : ( ( rule__AgentInstanceSiteState__SiteAssignment_0 ) ) ;
    public final void rule__AgentInstanceSiteState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1911:1: ( ( ( rule__AgentInstanceSiteState__SiteAssignment_0 ) ) )
            // InternalReactionRules.g:1912:1: ( ( rule__AgentInstanceSiteState__SiteAssignment_0 ) )
            {
            // InternalReactionRules.g:1912:1: ( ( rule__AgentInstanceSiteState__SiteAssignment_0 ) )
            // InternalReactionRules.g:1913:2: ( rule__AgentInstanceSiteState__SiteAssignment_0 )
            {
             before(grammarAccess.getAgentInstanceSiteStateAccess().getSiteAssignment_0()); 
            // InternalReactionRules.g:1914:2: ( rule__AgentInstanceSiteState__SiteAssignment_0 )
            // InternalReactionRules.g:1914:3: rule__AgentInstanceSiteState__SiteAssignment_0
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
    // InternalReactionRules.g:1922:1: rule__AgentInstanceSiteState__Group__1 : rule__AgentInstanceSiteState__Group__1__Impl ;
    public final void rule__AgentInstanceSiteState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1926:1: ( rule__AgentInstanceSiteState__Group__1__Impl )
            // InternalReactionRules.g:1927:2: rule__AgentInstanceSiteState__Group__1__Impl
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
    // InternalReactionRules.g:1933:1: rule__AgentInstanceSiteState__Group__1__Impl : ( ( rule__AgentInstanceSiteState__SiteStateAssignment_1 ) ) ;
    public final void rule__AgentInstanceSiteState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1937:1: ( ( ( rule__AgentInstanceSiteState__SiteStateAssignment_1 ) ) )
            // InternalReactionRules.g:1938:1: ( ( rule__AgentInstanceSiteState__SiteStateAssignment_1 ) )
            {
            // InternalReactionRules.g:1938:1: ( ( rule__AgentInstanceSiteState__SiteStateAssignment_1 ) )
            // InternalReactionRules.g:1939:2: ( rule__AgentInstanceSiteState__SiteStateAssignment_1 )
            {
             before(grammarAccess.getAgentInstanceSiteStateAccess().getSiteStateAssignment_1()); 
            // InternalReactionRules.g:1940:2: ( rule__AgentInstanceSiteState__SiteStateAssignment_1 )
            // InternalReactionRules.g:1940:3: rule__AgentInstanceSiteState__SiteStateAssignment_1
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
    // InternalReactionRules.g:1949:1: rule__AgentInstanceLinkState__Group__0 : rule__AgentInstanceLinkState__Group__0__Impl rule__AgentInstanceLinkState__Group__1 ;
    public final void rule__AgentInstanceLinkState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1953:1: ( rule__AgentInstanceLinkState__Group__0__Impl rule__AgentInstanceLinkState__Group__1 )
            // InternalReactionRules.g:1954:2: rule__AgentInstanceLinkState__Group__0__Impl rule__AgentInstanceLinkState__Group__1
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
    // InternalReactionRules.g:1961:1: rule__AgentInstanceLinkState__Group__0__Impl : ( ( rule__AgentInstanceLinkState__SiteAssignment_0 ) ) ;
    public final void rule__AgentInstanceLinkState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1965:1: ( ( ( rule__AgentInstanceLinkState__SiteAssignment_0 ) ) )
            // InternalReactionRules.g:1966:1: ( ( rule__AgentInstanceLinkState__SiteAssignment_0 ) )
            {
            // InternalReactionRules.g:1966:1: ( ( rule__AgentInstanceLinkState__SiteAssignment_0 ) )
            // InternalReactionRules.g:1967:2: ( rule__AgentInstanceLinkState__SiteAssignment_0 )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getSiteAssignment_0()); 
            // InternalReactionRules.g:1968:2: ( rule__AgentInstanceLinkState__SiteAssignment_0 )
            // InternalReactionRules.g:1968:3: rule__AgentInstanceLinkState__SiteAssignment_0
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
    // InternalReactionRules.g:1976:1: rule__AgentInstanceLinkState__Group__1 : rule__AgentInstanceLinkState__Group__1__Impl rule__AgentInstanceLinkState__Group__2 ;
    public final void rule__AgentInstanceLinkState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1980:1: ( rule__AgentInstanceLinkState__Group__1__Impl rule__AgentInstanceLinkState__Group__2 )
            // InternalReactionRules.g:1981:2: rule__AgentInstanceLinkState__Group__1__Impl rule__AgentInstanceLinkState__Group__2
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
    // InternalReactionRules.g:1988:1: rule__AgentInstanceLinkState__Group__1__Impl : ( ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 ) ) ;
    public final void rule__AgentInstanceLinkState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:1992:1: ( ( ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 ) ) )
            // InternalReactionRules.g:1993:1: ( ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 ) )
            {
            // InternalReactionRules.g:1993:1: ( ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 ) )
            // InternalReactionRules.g:1994:2: ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedSiteAssignment_1()); 
            // InternalReactionRules.g:1995:2: ( rule__AgentInstanceLinkState__AttachedSiteAssignment_1 )
            // InternalReactionRules.g:1995:3: rule__AgentInstanceLinkState__AttachedSiteAssignment_1
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
    // InternalReactionRules.g:2003:1: rule__AgentInstanceLinkState__Group__2 : rule__AgentInstanceLinkState__Group__2__Impl rule__AgentInstanceLinkState__Group__3 ;
    public final void rule__AgentInstanceLinkState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2007:1: ( rule__AgentInstanceLinkState__Group__2__Impl rule__AgentInstanceLinkState__Group__3 )
            // InternalReactionRules.g:2008:2: rule__AgentInstanceLinkState__Group__2__Impl rule__AgentInstanceLinkState__Group__3
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
    // InternalReactionRules.g:2015:1: rule__AgentInstanceLinkState__Group__2__Impl : ( ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 ) ) ;
    public final void rule__AgentInstanceLinkState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2019:1: ( ( ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 ) ) )
            // InternalReactionRules.g:2020:1: ( ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 ) )
            {
            // InternalReactionRules.g:2020:1: ( ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 ) )
            // InternalReactionRules.g:2021:2: ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentAssignment_2()); 
            // InternalReactionRules.g:2022:2: ( rule__AgentInstanceLinkState__AttachedAgentAssignment_2 )
            // InternalReactionRules.g:2022:3: rule__AgentInstanceLinkState__AttachedAgentAssignment_2
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
    // InternalReactionRules.g:2030:1: rule__AgentInstanceLinkState__Group__3 : rule__AgentInstanceLinkState__Group__3__Impl rule__AgentInstanceLinkState__Group__4 ;
    public final void rule__AgentInstanceLinkState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2034:1: ( rule__AgentInstanceLinkState__Group__3__Impl rule__AgentInstanceLinkState__Group__4 )
            // InternalReactionRules.g:2035:2: rule__AgentInstanceLinkState__Group__3__Impl rule__AgentInstanceLinkState__Group__4
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
    // InternalReactionRules.g:2042:1: rule__AgentInstanceLinkState__Group__3__Impl : ( ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 ) ) ;
    public final void rule__AgentInstanceLinkState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2046:1: ( ( ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 ) ) )
            // InternalReactionRules.g:2047:1: ( ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 ) )
            {
            // InternalReactionRules.g:2047:1: ( ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 ) )
            // InternalReactionRules.g:2048:2: ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentInstanceAssignment_3()); 
            // InternalReactionRules.g:2049:2: ( rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 )
            // InternalReactionRules.g:2049:3: rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3
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
    // InternalReactionRules.g:2057:1: rule__AgentInstanceLinkState__Group__4 : rule__AgentInstanceLinkState__Group__4__Impl ;
    public final void rule__AgentInstanceLinkState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2061:1: ( rule__AgentInstanceLinkState__Group__4__Impl )
            // InternalReactionRules.g:2062:2: rule__AgentInstanceLinkState__Group__4__Impl
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
    // InternalReactionRules.g:2068:1: rule__AgentInstanceLinkState__Group__4__Impl : ( ( rule__AgentInstanceLinkState__LinkStateAssignment_4 ) ) ;
    public final void rule__AgentInstanceLinkState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2072:1: ( ( ( rule__AgentInstanceLinkState__LinkStateAssignment_4 ) ) )
            // InternalReactionRules.g:2073:1: ( ( rule__AgentInstanceLinkState__LinkStateAssignment_4 ) )
            {
            // InternalReactionRules.g:2073:1: ( ( rule__AgentInstanceLinkState__LinkStateAssignment_4 ) )
            // InternalReactionRules.g:2074:2: ( rule__AgentInstanceLinkState__LinkStateAssignment_4 )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getLinkStateAssignment_4()); 
            // InternalReactionRules.g:2075:2: ( rule__AgentInstanceLinkState__LinkStateAssignment_4 )
            // InternalReactionRules.g:2075:3: rule__AgentInstanceLinkState__LinkStateAssignment_4
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
    // InternalReactionRules.g:2084:1: rule__AgentInstance__Group__0 : rule__AgentInstance__Group__0__Impl rule__AgentInstance__Group__1 ;
    public final void rule__AgentInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2088:1: ( rule__AgentInstance__Group__0__Impl rule__AgentInstance__Group__1 )
            // InternalReactionRules.g:2089:2: rule__AgentInstance__Group__0__Impl rule__AgentInstance__Group__1
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
    // InternalReactionRules.g:2096:1: rule__AgentInstance__Group__0__Impl : ( 'AgentInstance' ) ;
    public final void rule__AgentInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2100:1: ( ( 'AgentInstance' ) )
            // InternalReactionRules.g:2101:1: ( 'AgentInstance' )
            {
            // InternalReactionRules.g:2101:1: ( 'AgentInstance' )
            // InternalReactionRules.g:2102:2: 'AgentInstance'
            {
             before(grammarAccess.getAgentInstanceAccess().getAgentInstanceKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalReactionRules.g:2111:1: rule__AgentInstance__Group__1 : rule__AgentInstance__Group__1__Impl rule__AgentInstance__Group__2 ;
    public final void rule__AgentInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2115:1: ( rule__AgentInstance__Group__1__Impl rule__AgentInstance__Group__2 )
            // InternalReactionRules.g:2116:2: rule__AgentInstance__Group__1__Impl rule__AgentInstance__Group__2
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
    // InternalReactionRules.g:2123:1: rule__AgentInstance__Group__1__Impl : ( ( rule__AgentInstance__NameAssignment_1 ) ) ;
    public final void rule__AgentInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2127:1: ( ( ( rule__AgentInstance__NameAssignment_1 ) ) )
            // InternalReactionRules.g:2128:1: ( ( rule__AgentInstance__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:2128:1: ( ( rule__AgentInstance__NameAssignment_1 ) )
            // InternalReactionRules.g:2129:2: ( rule__AgentInstance__NameAssignment_1 )
            {
             before(grammarAccess.getAgentInstanceAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:2130:2: ( rule__AgentInstance__NameAssignment_1 )
            // InternalReactionRules.g:2130:3: rule__AgentInstance__NameAssignment_1
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
    // InternalReactionRules.g:2138:1: rule__AgentInstance__Group__2 : rule__AgentInstance__Group__2__Impl rule__AgentInstance__Group__3 ;
    public final void rule__AgentInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2142:1: ( rule__AgentInstance__Group__2__Impl rule__AgentInstance__Group__3 )
            // InternalReactionRules.g:2143:2: rule__AgentInstance__Group__2__Impl rule__AgentInstance__Group__3
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
    // InternalReactionRules.g:2150:1: rule__AgentInstance__Group__2__Impl : ( ( rule__AgentInstance__AgentAssignment_2 ) ) ;
    public final void rule__AgentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2154:1: ( ( ( rule__AgentInstance__AgentAssignment_2 ) ) )
            // InternalReactionRules.g:2155:1: ( ( rule__AgentInstance__AgentAssignment_2 ) )
            {
            // InternalReactionRules.g:2155:1: ( ( rule__AgentInstance__AgentAssignment_2 ) )
            // InternalReactionRules.g:2156:2: ( rule__AgentInstance__AgentAssignment_2 )
            {
             before(grammarAccess.getAgentInstanceAccess().getAgentAssignment_2()); 
            // InternalReactionRules.g:2157:2: ( rule__AgentInstance__AgentAssignment_2 )
            // InternalReactionRules.g:2157:3: rule__AgentInstance__AgentAssignment_2
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
    // InternalReactionRules.g:2165:1: rule__AgentInstance__Group__3 : rule__AgentInstance__Group__3__Impl rule__AgentInstance__Group__4 ;
    public final void rule__AgentInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2169:1: ( rule__AgentInstance__Group__3__Impl rule__AgentInstance__Group__4 )
            // InternalReactionRules.g:2170:2: rule__AgentInstance__Group__3__Impl rule__AgentInstance__Group__4
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
    // InternalReactionRules.g:2177:1: rule__AgentInstance__Group__3__Impl : ( ( rule__AgentInstance__SiteStatesAssignment_3 ) ) ;
    public final void rule__AgentInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2181:1: ( ( ( rule__AgentInstance__SiteStatesAssignment_3 ) ) )
            // InternalReactionRules.g:2182:1: ( ( rule__AgentInstance__SiteStatesAssignment_3 ) )
            {
            // InternalReactionRules.g:2182:1: ( ( rule__AgentInstance__SiteStatesAssignment_3 ) )
            // InternalReactionRules.g:2183:2: ( rule__AgentInstance__SiteStatesAssignment_3 )
            {
             before(grammarAccess.getAgentInstanceAccess().getSiteStatesAssignment_3()); 
            // InternalReactionRules.g:2184:2: ( rule__AgentInstance__SiteStatesAssignment_3 )
            // InternalReactionRules.g:2184:3: rule__AgentInstance__SiteStatesAssignment_3
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
    // InternalReactionRules.g:2192:1: rule__AgentInstance__Group__4 : rule__AgentInstance__Group__4__Impl ;
    public final void rule__AgentInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2196:1: ( rule__AgentInstance__Group__4__Impl )
            // InternalReactionRules.g:2197:2: rule__AgentInstance__Group__4__Impl
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
    // InternalReactionRules.g:2203:1: rule__AgentInstance__Group__4__Impl : ( ( rule__AgentInstance__LinkStatesAssignment_4 ) ) ;
    public final void rule__AgentInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2207:1: ( ( ( rule__AgentInstance__LinkStatesAssignment_4 ) ) )
            // InternalReactionRules.g:2208:1: ( ( rule__AgentInstance__LinkStatesAssignment_4 ) )
            {
            // InternalReactionRules.g:2208:1: ( ( rule__AgentInstance__LinkStatesAssignment_4 ) )
            // InternalReactionRules.g:2209:2: ( rule__AgentInstance__LinkStatesAssignment_4 )
            {
             before(grammarAccess.getAgentInstanceAccess().getLinkStatesAssignment_4()); 
            // InternalReactionRules.g:2210:2: ( rule__AgentInstance__LinkStatesAssignment_4 )
            // InternalReactionRules.g:2210:3: rule__AgentInstance__LinkStatesAssignment_4
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
    // InternalReactionRules.g:2219:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2223:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalReactionRules.g:2224:2: rule__Float__Group__0__Impl rule__Float__Group__1
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
    // InternalReactionRules.g:2231:1: rule__Float__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2235:1: ( ( ( '-' )? ) )
            // InternalReactionRules.g:2236:1: ( ( '-' )? )
            {
            // InternalReactionRules.g:2236:1: ( ( '-' )? )
            // InternalReactionRules.g:2237:2: ( '-' )?
            {
             before(grammarAccess.getFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalReactionRules.g:2238:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalReactionRules.g:2238:3: '-'
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalReactionRules.g:2246:1: rule__Float__Group__1 : rule__Float__Group__1__Impl rule__Float__Group__2 ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2250:1: ( rule__Float__Group__1__Impl rule__Float__Group__2 )
            // InternalReactionRules.g:2251:2: rule__Float__Group__1__Impl rule__Float__Group__2
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
    // InternalReactionRules.g:2258:1: rule__Float__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2262:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2263:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2263:1: ( RULE_INT )
            // InternalReactionRules.g:2264:2: RULE_INT
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
    // InternalReactionRules.g:2273:1: rule__Float__Group__2 : rule__Float__Group__2__Impl rule__Float__Group__3 ;
    public final void rule__Float__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2277:1: ( rule__Float__Group__2__Impl rule__Float__Group__3 )
            // InternalReactionRules.g:2278:2: rule__Float__Group__2__Impl rule__Float__Group__3
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
    // InternalReactionRules.g:2285:1: rule__Float__Group__2__Impl : ( '.' ) ;
    public final void rule__Float__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2289:1: ( ( '.' ) )
            // InternalReactionRules.g:2290:1: ( '.' )
            {
            // InternalReactionRules.g:2290:1: ( '.' )
            // InternalReactionRules.g:2291:2: '.'
            {
             before(grammarAccess.getFloatAccess().getFullStopKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalReactionRules.g:2300:1: rule__Float__Group__3 : rule__Float__Group__3__Impl ;
    public final void rule__Float__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2304:1: ( rule__Float__Group__3__Impl )
            // InternalReactionRules.g:2305:2: rule__Float__Group__3__Impl
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
    // InternalReactionRules.g:2311:1: rule__Float__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2315:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2316:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2316:1: ( RULE_INT )
            // InternalReactionRules.g:2317:2: RULE_INT
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
    // InternalReactionRules.g:2327:1: rule__ScientificFloat__Group__0 : rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1 ;
    public final void rule__ScientificFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2331:1: ( rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1 )
            // InternalReactionRules.g:2332:2: rule__ScientificFloat__Group__0__Impl rule__ScientificFloat__Group__1
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
    // InternalReactionRules.g:2339:1: rule__ScientificFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ScientificFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2343:1: ( ( ( '-' )? ) )
            // InternalReactionRules.g:2344:1: ( ( '-' )? )
            {
            // InternalReactionRules.g:2344:1: ( ( '-' )? )
            // InternalReactionRules.g:2345:2: ( '-' )?
            {
             before(grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalReactionRules.g:2346:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalReactionRules.g:2346:3: '-'
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalReactionRules.g:2354:1: rule__ScientificFloat__Group__1 : rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2 ;
    public final void rule__ScientificFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2358:1: ( rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2 )
            // InternalReactionRules.g:2359:2: rule__ScientificFloat__Group__1__Impl rule__ScientificFloat__Group__2
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
    // InternalReactionRules.g:2366:1: rule__ScientificFloat__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2370:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2371:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2371:1: ( RULE_INT )
            // InternalReactionRules.g:2372:2: RULE_INT
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
    // InternalReactionRules.g:2381:1: rule__ScientificFloat__Group__2 : rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3 ;
    public final void rule__ScientificFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2385:1: ( rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3 )
            // InternalReactionRules.g:2386:2: rule__ScientificFloat__Group__2__Impl rule__ScientificFloat__Group__3
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
    // InternalReactionRules.g:2393:1: rule__ScientificFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__ScientificFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2397:1: ( ( '.' ) )
            // InternalReactionRules.g:2398:1: ( '.' )
            {
            // InternalReactionRules.g:2398:1: ( '.' )
            // InternalReactionRules.g:2399:2: '.'
            {
             before(grammarAccess.getScientificFloatAccess().getFullStopKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalReactionRules.g:2408:1: rule__ScientificFloat__Group__3 : rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4 ;
    public final void rule__ScientificFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2412:1: ( rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4 )
            // InternalReactionRules.g:2413:2: rule__ScientificFloat__Group__3__Impl rule__ScientificFloat__Group__4
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
    // InternalReactionRules.g:2420:1: rule__ScientificFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2424:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2425:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2425:1: ( RULE_INT )
            // InternalReactionRules.g:2426:2: RULE_INT
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
    // InternalReactionRules.g:2435:1: rule__ScientificFloat__Group__4 : rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5 ;
    public final void rule__ScientificFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2439:1: ( rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5 )
            // InternalReactionRules.g:2440:2: rule__ScientificFloat__Group__4__Impl rule__ScientificFloat__Group__5
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
    // InternalReactionRules.g:2447:1: rule__ScientificFloat__Group__4__Impl : ( RULE_EXPONENT ) ;
    public final void rule__ScientificFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2451:1: ( ( RULE_EXPONENT ) )
            // InternalReactionRules.g:2452:1: ( RULE_EXPONENT )
            {
            // InternalReactionRules.g:2452:1: ( RULE_EXPONENT )
            // InternalReactionRules.g:2453:2: RULE_EXPONENT
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
    // InternalReactionRules.g:2462:1: rule__ScientificFloat__Group__5 : rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6 ;
    public final void rule__ScientificFloat__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2466:1: ( rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6 )
            // InternalReactionRules.g:2467:2: rule__ScientificFloat__Group__5__Impl rule__ScientificFloat__Group__6
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
    // InternalReactionRules.g:2474:1: rule__ScientificFloat__Group__5__Impl : ( ( rule__ScientificFloat__Alternatives_5 ) ) ;
    public final void rule__ScientificFloat__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2478:1: ( ( ( rule__ScientificFloat__Alternatives_5 ) ) )
            // InternalReactionRules.g:2479:1: ( ( rule__ScientificFloat__Alternatives_5 ) )
            {
            // InternalReactionRules.g:2479:1: ( ( rule__ScientificFloat__Alternatives_5 ) )
            // InternalReactionRules.g:2480:2: ( rule__ScientificFloat__Alternatives_5 )
            {
             before(grammarAccess.getScientificFloatAccess().getAlternatives_5()); 
            // InternalReactionRules.g:2481:2: ( rule__ScientificFloat__Alternatives_5 )
            // InternalReactionRules.g:2481:3: rule__ScientificFloat__Alternatives_5
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
    // InternalReactionRules.g:2489:1: rule__ScientificFloat__Group__6 : rule__ScientificFloat__Group__6__Impl ;
    public final void rule__ScientificFloat__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2493:1: ( rule__ScientificFloat__Group__6__Impl )
            // InternalReactionRules.g:2494:2: rule__ScientificFloat__Group__6__Impl
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
    // InternalReactionRules.g:2500:1: rule__ScientificFloat__Group__6__Impl : ( RULE_INT ) ;
    public final void rule__ScientificFloat__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2504:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2505:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2505:1: ( RULE_INT )
            // InternalReactionRules.g:2506:2: RULE_INT
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
    // InternalReactionRules.g:2516:1: rule__SignedInteger__Group__0 : rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 ;
    public final void rule__SignedInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2520:1: ( rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 )
            // InternalReactionRules.g:2521:2: rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1
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
    // InternalReactionRules.g:2528:1: rule__SignedInteger__Group__0__Impl : ( '-' ) ;
    public final void rule__SignedInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2532:1: ( ( '-' ) )
            // InternalReactionRules.g:2533:1: ( '-' )
            {
            // InternalReactionRules.g:2533:1: ( '-' )
            // InternalReactionRules.g:2534:2: '-'
            {
             before(grammarAccess.getSignedIntegerAccess().getHyphenMinusKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalReactionRules.g:2543:1: rule__SignedInteger__Group__1 : rule__SignedInteger__Group__1__Impl ;
    public final void rule__SignedInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2547:1: ( rule__SignedInteger__Group__1__Impl )
            // InternalReactionRules.g:2548:2: rule__SignedInteger__Group__1__Impl
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
    // InternalReactionRules.g:2554:1: rule__SignedInteger__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__SignedInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2558:1: ( ( RULE_INT ) )
            // InternalReactionRules.g:2559:1: ( RULE_INT )
            {
            // InternalReactionRules.g:2559:1: ( RULE_INT )
            // InternalReactionRules.g:2560:2: RULE_INT
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
    // InternalReactionRules.g:2570:1: rule__States__Group__0 : rule__States__Group__0__Impl rule__States__Group__1 ;
    public final void rule__States__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2574:1: ( rule__States__Group__0__Impl rule__States__Group__1 )
            // InternalReactionRules.g:2575:2: rule__States__Group__0__Impl rule__States__Group__1
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
    // InternalReactionRules.g:2582:1: rule__States__Group__0__Impl : ( () ) ;
    public final void rule__States__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2586:1: ( ( () ) )
            // InternalReactionRules.g:2587:1: ( () )
            {
            // InternalReactionRules.g:2587:1: ( () )
            // InternalReactionRules.g:2588:2: ()
            {
             before(grammarAccess.getStatesAccess().getStatesAction_0()); 
            // InternalReactionRules.g:2589:2: ()
            // InternalReactionRules.g:2589:3: 
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
    // InternalReactionRules.g:2597:1: rule__States__Group__1 : rule__States__Group__1__Impl ;
    public final void rule__States__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2601:1: ( rule__States__Group__1__Impl )
            // InternalReactionRules.g:2602:2: rule__States__Group__1__Impl
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
    // InternalReactionRules.g:2608:1: rule__States__Group__1__Impl : ( ( rule__States__Group_1__0 )? ) ;
    public final void rule__States__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2612:1: ( ( ( rule__States__Group_1__0 )? ) )
            // InternalReactionRules.g:2613:1: ( ( rule__States__Group_1__0 )? )
            {
            // InternalReactionRules.g:2613:1: ( ( rule__States__Group_1__0 )? )
            // InternalReactionRules.g:2614:2: ( rule__States__Group_1__0 )?
            {
             before(grammarAccess.getStatesAccess().getGroup_1()); 
            // InternalReactionRules.g:2615:2: ( rule__States__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalReactionRules.g:2615:3: rule__States__Group_1__0
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
    // InternalReactionRules.g:2624:1: rule__States__Group_1__0 : rule__States__Group_1__0__Impl rule__States__Group_1__1 ;
    public final void rule__States__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2628:1: ( rule__States__Group_1__0__Impl rule__States__Group_1__1 )
            // InternalReactionRules.g:2629:2: rule__States__Group_1__0__Impl rule__States__Group_1__1
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
    // InternalReactionRules.g:2636:1: rule__States__Group_1__0__Impl : ( '{' ) ;
    public final void rule__States__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2640:1: ( ( '{' ) )
            // InternalReactionRules.g:2641:1: ( '{' )
            {
            // InternalReactionRules.g:2641:1: ( '{' )
            // InternalReactionRules.g:2642:2: '{'
            {
             before(grammarAccess.getStatesAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalReactionRules.g:2651:1: rule__States__Group_1__1 : rule__States__Group_1__1__Impl rule__States__Group_1__2 ;
    public final void rule__States__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2655:1: ( rule__States__Group_1__1__Impl rule__States__Group_1__2 )
            // InternalReactionRules.g:2656:2: rule__States__Group_1__1__Impl rule__States__Group_1__2
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
    // InternalReactionRules.g:2663:1: rule__States__Group_1__1__Impl : ( ( rule__States__StateAssignment_1_1 ) ) ;
    public final void rule__States__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2667:1: ( ( ( rule__States__StateAssignment_1_1 ) ) )
            // InternalReactionRules.g:2668:1: ( ( rule__States__StateAssignment_1_1 ) )
            {
            // InternalReactionRules.g:2668:1: ( ( rule__States__StateAssignment_1_1 ) )
            // InternalReactionRules.g:2669:2: ( rule__States__StateAssignment_1_1 )
            {
             before(grammarAccess.getStatesAccess().getStateAssignment_1_1()); 
            // InternalReactionRules.g:2670:2: ( rule__States__StateAssignment_1_1 )
            // InternalReactionRules.g:2670:3: rule__States__StateAssignment_1_1
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
    // InternalReactionRules.g:2678:1: rule__States__Group_1__2 : rule__States__Group_1__2__Impl rule__States__Group_1__3 ;
    public final void rule__States__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2682:1: ( rule__States__Group_1__2__Impl rule__States__Group_1__3 )
            // InternalReactionRules.g:2683:2: rule__States__Group_1__2__Impl rule__States__Group_1__3
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
    // InternalReactionRules.g:2690:1: rule__States__Group_1__2__Impl : ( ( rule__States__Group_1_2__0 )* ) ;
    public final void rule__States__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2694:1: ( ( ( rule__States__Group_1_2__0 )* ) )
            // InternalReactionRules.g:2695:1: ( ( rule__States__Group_1_2__0 )* )
            {
            // InternalReactionRules.g:2695:1: ( ( rule__States__Group_1_2__0 )* )
            // InternalReactionRules.g:2696:2: ( rule__States__Group_1_2__0 )*
            {
             before(grammarAccess.getStatesAccess().getGroup_1_2()); 
            // InternalReactionRules.g:2697:2: ( rule__States__Group_1_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalReactionRules.g:2697:3: rule__States__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__States__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalReactionRules.g:2705:1: rule__States__Group_1__3 : rule__States__Group_1__3__Impl ;
    public final void rule__States__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2709:1: ( rule__States__Group_1__3__Impl )
            // InternalReactionRules.g:2710:2: rule__States__Group_1__3__Impl
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
    // InternalReactionRules.g:2716:1: rule__States__Group_1__3__Impl : ( '}' ) ;
    public final void rule__States__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2720:1: ( ( '}' ) )
            // InternalReactionRules.g:2721:1: ( '}' )
            {
            // InternalReactionRules.g:2721:1: ( '}' )
            // InternalReactionRules.g:2722:2: '}'
            {
             before(grammarAccess.getStatesAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalReactionRules.g:2732:1: rule__States__Group_1_2__0 : rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1 ;
    public final void rule__States__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2736:1: ( rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1 )
            // InternalReactionRules.g:2737:2: rule__States__Group_1_2__0__Impl rule__States__Group_1_2__1
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
    // InternalReactionRules.g:2744:1: rule__States__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__States__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2748:1: ( ( ',' ) )
            // InternalReactionRules.g:2749:1: ( ',' )
            {
            // InternalReactionRules.g:2749:1: ( ',' )
            // InternalReactionRules.g:2750:2: ','
            {
             before(grammarAccess.getStatesAccess().getCommaKeyword_1_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalReactionRules.g:2759:1: rule__States__Group_1_2__1 : rule__States__Group_1_2__1__Impl ;
    public final void rule__States__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2763:1: ( rule__States__Group_1_2__1__Impl )
            // InternalReactionRules.g:2764:2: rule__States__Group_1_2__1__Impl
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
    // InternalReactionRules.g:2770:1: rule__States__Group_1_2__1__Impl : ( ( rule__States__StateAssignment_1_2_1 ) ) ;
    public final void rule__States__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2774:1: ( ( ( rule__States__StateAssignment_1_2_1 ) ) )
            // InternalReactionRules.g:2775:1: ( ( rule__States__StateAssignment_1_2_1 ) )
            {
            // InternalReactionRules.g:2775:1: ( ( rule__States__StateAssignment_1_2_1 ) )
            // InternalReactionRules.g:2776:2: ( rule__States__StateAssignment_1_2_1 )
            {
             before(grammarAccess.getStatesAccess().getStateAssignment_1_2_1()); 
            // InternalReactionRules.g:2777:2: ( rule__States__StateAssignment_1_2_1 )
            // InternalReactionRules.g:2777:3: rule__States__StateAssignment_1_2_1
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
    // InternalReactionRules.g:2786:1: rule__Site__Group__0 : rule__Site__Group__0__Impl rule__Site__Group__1 ;
    public final void rule__Site__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2790:1: ( rule__Site__Group__0__Impl rule__Site__Group__1 )
            // InternalReactionRules.g:2791:2: rule__Site__Group__0__Impl rule__Site__Group__1
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
    // InternalReactionRules.g:2798:1: rule__Site__Group__0__Impl : ( ( rule__Site__NameAssignment_0 ) ) ;
    public final void rule__Site__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2802:1: ( ( ( rule__Site__NameAssignment_0 ) ) )
            // InternalReactionRules.g:2803:1: ( ( rule__Site__NameAssignment_0 ) )
            {
            // InternalReactionRules.g:2803:1: ( ( rule__Site__NameAssignment_0 ) )
            // InternalReactionRules.g:2804:2: ( rule__Site__NameAssignment_0 )
            {
             before(grammarAccess.getSiteAccess().getNameAssignment_0()); 
            // InternalReactionRules.g:2805:2: ( rule__Site__NameAssignment_0 )
            // InternalReactionRules.g:2805:3: rule__Site__NameAssignment_0
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
    // InternalReactionRules.g:2813:1: rule__Site__Group__1 : rule__Site__Group__1__Impl ;
    public final void rule__Site__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2817:1: ( rule__Site__Group__1__Impl )
            // InternalReactionRules.g:2818:2: rule__Site__Group__1__Impl
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
    // InternalReactionRules.g:2824:1: rule__Site__Group__1__Impl : ( ( rule__Site__StatesAssignment_1 ) ) ;
    public final void rule__Site__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2828:1: ( ( ( rule__Site__StatesAssignment_1 ) ) )
            // InternalReactionRules.g:2829:1: ( ( rule__Site__StatesAssignment_1 ) )
            {
            // InternalReactionRules.g:2829:1: ( ( rule__Site__StatesAssignment_1 ) )
            // InternalReactionRules.g:2830:2: ( rule__Site__StatesAssignment_1 )
            {
             before(grammarAccess.getSiteAccess().getStatesAssignment_1()); 
            // InternalReactionRules.g:2831:2: ( rule__Site__StatesAssignment_1 )
            // InternalReactionRules.g:2831:3: rule__Site__StatesAssignment_1
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
    // InternalReactionRules.g:2840:1: rule__Sites__Group__0 : rule__Sites__Group__0__Impl rule__Sites__Group__1 ;
    public final void rule__Sites__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2844:1: ( rule__Sites__Group__0__Impl rule__Sites__Group__1 )
            // InternalReactionRules.g:2845:2: rule__Sites__Group__0__Impl rule__Sites__Group__1
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
    // InternalReactionRules.g:2852:1: rule__Sites__Group__0__Impl : ( () ) ;
    public final void rule__Sites__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2856:1: ( ( () ) )
            // InternalReactionRules.g:2857:1: ( () )
            {
            // InternalReactionRules.g:2857:1: ( () )
            // InternalReactionRules.g:2858:2: ()
            {
             before(grammarAccess.getSitesAccess().getSitesAction_0()); 
            // InternalReactionRules.g:2859:2: ()
            // InternalReactionRules.g:2859:3: 
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
    // InternalReactionRules.g:2867:1: rule__Sites__Group__1 : rule__Sites__Group__1__Impl ;
    public final void rule__Sites__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2871:1: ( rule__Sites__Group__1__Impl )
            // InternalReactionRules.g:2872:2: rule__Sites__Group__1__Impl
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
    // InternalReactionRules.g:2878:1: rule__Sites__Group__1__Impl : ( ( rule__Sites__Group_1__0 )? ) ;
    public final void rule__Sites__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2882:1: ( ( ( rule__Sites__Group_1__0 )? ) )
            // InternalReactionRules.g:2883:1: ( ( rule__Sites__Group_1__0 )? )
            {
            // InternalReactionRules.g:2883:1: ( ( rule__Sites__Group_1__0 )? )
            // InternalReactionRules.g:2884:2: ( rule__Sites__Group_1__0 )?
            {
             before(grammarAccess.getSitesAccess().getGroup_1()); 
            // InternalReactionRules.g:2885:2: ( rule__Sites__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalReactionRules.g:2885:3: rule__Sites__Group_1__0
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
    // InternalReactionRules.g:2894:1: rule__Sites__Group_1__0 : rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1 ;
    public final void rule__Sites__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2898:1: ( rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1 )
            // InternalReactionRules.g:2899:2: rule__Sites__Group_1__0__Impl rule__Sites__Group_1__1
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
    // InternalReactionRules.g:2906:1: rule__Sites__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Sites__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2910:1: ( ( '(' ) )
            // InternalReactionRules.g:2911:1: ( '(' )
            {
            // InternalReactionRules.g:2911:1: ( '(' )
            // InternalReactionRules.g:2912:2: '('
            {
             before(grammarAccess.getSitesAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalReactionRules.g:2921:1: rule__Sites__Group_1__1 : rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2 ;
    public final void rule__Sites__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2925:1: ( rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2 )
            // InternalReactionRules.g:2926:2: rule__Sites__Group_1__1__Impl rule__Sites__Group_1__2
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
    // InternalReactionRules.g:2933:1: rule__Sites__Group_1__1__Impl : ( ( rule__Sites__SitesAssignment_1_1 ) ) ;
    public final void rule__Sites__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2937:1: ( ( ( rule__Sites__SitesAssignment_1_1 ) ) )
            // InternalReactionRules.g:2938:1: ( ( rule__Sites__SitesAssignment_1_1 ) )
            {
            // InternalReactionRules.g:2938:1: ( ( rule__Sites__SitesAssignment_1_1 ) )
            // InternalReactionRules.g:2939:2: ( rule__Sites__SitesAssignment_1_1 )
            {
             before(grammarAccess.getSitesAccess().getSitesAssignment_1_1()); 
            // InternalReactionRules.g:2940:2: ( rule__Sites__SitesAssignment_1_1 )
            // InternalReactionRules.g:2940:3: rule__Sites__SitesAssignment_1_1
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
    // InternalReactionRules.g:2948:1: rule__Sites__Group_1__2 : rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3 ;
    public final void rule__Sites__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2952:1: ( rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3 )
            // InternalReactionRules.g:2953:2: rule__Sites__Group_1__2__Impl rule__Sites__Group_1__3
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
    // InternalReactionRules.g:2960:1: rule__Sites__Group_1__2__Impl : ( ( rule__Sites__Group_1_2__0 )* ) ;
    public final void rule__Sites__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2964:1: ( ( ( rule__Sites__Group_1_2__0 )* ) )
            // InternalReactionRules.g:2965:1: ( ( rule__Sites__Group_1_2__0 )* )
            {
            // InternalReactionRules.g:2965:1: ( ( rule__Sites__Group_1_2__0 )* )
            // InternalReactionRules.g:2966:2: ( rule__Sites__Group_1_2__0 )*
            {
             before(grammarAccess.getSitesAccess().getGroup_1_2()); 
            // InternalReactionRules.g:2967:2: ( rule__Sites__Group_1_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalReactionRules.g:2967:3: rule__Sites__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Sites__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalReactionRules.g:2975:1: rule__Sites__Group_1__3 : rule__Sites__Group_1__3__Impl ;
    public final void rule__Sites__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2979:1: ( rule__Sites__Group_1__3__Impl )
            // InternalReactionRules.g:2980:2: rule__Sites__Group_1__3__Impl
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
    // InternalReactionRules.g:2986:1: rule__Sites__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Sites__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:2990:1: ( ( ')' ) )
            // InternalReactionRules.g:2991:1: ( ')' )
            {
            // InternalReactionRules.g:2991:1: ( ')' )
            // InternalReactionRules.g:2992:2: ')'
            {
             before(grammarAccess.getSitesAccess().getRightParenthesisKeyword_1_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalReactionRules.g:3002:1: rule__Sites__Group_1_2__0 : rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1 ;
    public final void rule__Sites__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3006:1: ( rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1 )
            // InternalReactionRules.g:3007:2: rule__Sites__Group_1_2__0__Impl rule__Sites__Group_1_2__1
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
    // InternalReactionRules.g:3014:1: rule__Sites__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Sites__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3018:1: ( ( ',' ) )
            // InternalReactionRules.g:3019:1: ( ',' )
            {
            // InternalReactionRules.g:3019:1: ( ',' )
            // InternalReactionRules.g:3020:2: ','
            {
             before(grammarAccess.getSitesAccess().getCommaKeyword_1_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalReactionRules.g:3029:1: rule__Sites__Group_1_2__1 : rule__Sites__Group_1_2__1__Impl ;
    public final void rule__Sites__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3033:1: ( rule__Sites__Group_1_2__1__Impl )
            // InternalReactionRules.g:3034:2: rule__Sites__Group_1_2__1__Impl
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
    // InternalReactionRules.g:3040:1: rule__Sites__Group_1_2__1__Impl : ( ( rule__Sites__SitesAssignment_1_2_1 ) ) ;
    public final void rule__Sites__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3044:1: ( ( ( rule__Sites__SitesAssignment_1_2_1 ) ) )
            // InternalReactionRules.g:3045:1: ( ( rule__Sites__SitesAssignment_1_2_1 ) )
            {
            // InternalReactionRules.g:3045:1: ( ( rule__Sites__SitesAssignment_1_2_1 ) )
            // InternalReactionRules.g:3046:2: ( rule__Sites__SitesAssignment_1_2_1 )
            {
             before(grammarAccess.getSitesAccess().getSitesAssignment_1_2_1()); 
            // InternalReactionRules.g:3047:2: ( rule__Sites__SitesAssignment_1_2_1 )
            // InternalReactionRules.g:3047:3: rule__Sites__SitesAssignment_1_2_1
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
    // InternalReactionRules.g:3056:1: rule__Agent__Group__0 : rule__Agent__Group__0__Impl rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3060:1: ( rule__Agent__Group__0__Impl rule__Agent__Group__1 )
            // InternalReactionRules.g:3061:2: rule__Agent__Group__0__Impl rule__Agent__Group__1
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
    // InternalReactionRules.g:3068:1: rule__Agent__Group__0__Impl : ( 'agent' ) ;
    public final void rule__Agent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3072:1: ( ( 'agent' ) )
            // InternalReactionRules.g:3073:1: ( 'agent' )
            {
            // InternalReactionRules.g:3073:1: ( 'agent' )
            // InternalReactionRules.g:3074:2: 'agent'
            {
             before(grammarAccess.getAgentAccess().getAgentKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalReactionRules.g:3083:1: rule__Agent__Group__1 : rule__Agent__Group__1__Impl rule__Agent__Group__2 ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3087:1: ( rule__Agent__Group__1__Impl rule__Agent__Group__2 )
            // InternalReactionRules.g:3088:2: rule__Agent__Group__1__Impl rule__Agent__Group__2
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
    // InternalReactionRules.g:3095:1: rule__Agent__Group__1__Impl : ( ( rule__Agent__NameAssignment_1 ) ) ;
    public final void rule__Agent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3099:1: ( ( ( rule__Agent__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3100:1: ( ( rule__Agent__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3100:1: ( ( rule__Agent__NameAssignment_1 ) )
            // InternalReactionRules.g:3101:2: ( rule__Agent__NameAssignment_1 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3102:2: ( rule__Agent__NameAssignment_1 )
            // InternalReactionRules.g:3102:3: rule__Agent__NameAssignment_1
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
    // InternalReactionRules.g:3110:1: rule__Agent__Group__2 : rule__Agent__Group__2__Impl ;
    public final void rule__Agent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3114:1: ( rule__Agent__Group__2__Impl )
            // InternalReactionRules.g:3115:2: rule__Agent__Group__2__Impl
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
    // InternalReactionRules.g:3121:1: rule__Agent__Group__2__Impl : ( ( rule__Agent__SitesAssignment_2 ) ) ;
    public final void rule__Agent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3125:1: ( ( ( rule__Agent__SitesAssignment_2 ) ) )
            // InternalReactionRules.g:3126:1: ( ( rule__Agent__SitesAssignment_2 ) )
            {
            // InternalReactionRules.g:3126:1: ( ( rule__Agent__SitesAssignment_2 ) )
            // InternalReactionRules.g:3127:2: ( rule__Agent__SitesAssignment_2 )
            {
             before(grammarAccess.getAgentAccess().getSitesAssignment_2()); 
            // InternalReactionRules.g:3128:2: ( rule__Agent__SitesAssignment_2 )
            // InternalReactionRules.g:3128:3: rule__Agent__SitesAssignment_2
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
    // InternalReactionRules.g:3137:1: rule__PatternVariable__Group__0 : rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 ;
    public final void rule__PatternVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3141:1: ( rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 )
            // InternalReactionRules.g:3142:2: rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1
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
    // InternalReactionRules.g:3149:1: rule__PatternVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__PatternVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3153:1: ( ( 'var' ) )
            // InternalReactionRules.g:3154:1: ( 'var' )
            {
            // InternalReactionRules.g:3154:1: ( 'var' )
            // InternalReactionRules.g:3155:2: 'var'
            {
             before(grammarAccess.getPatternVariableAccess().getVarKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalReactionRules.g:3164:1: rule__PatternVariable__Group__1 : rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 ;
    public final void rule__PatternVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3168:1: ( rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 )
            // InternalReactionRules.g:3169:2: rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2
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
    // InternalReactionRules.g:3176:1: rule__PatternVariable__Group__1__Impl : ( ( rule__PatternVariable__NameAssignment_1 ) ) ;
    public final void rule__PatternVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3180:1: ( ( ( rule__PatternVariable__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3181:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3181:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            // InternalReactionRules.g:3182:2: ( rule__PatternVariable__NameAssignment_1 )
            {
             before(grammarAccess.getPatternVariableAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3183:2: ( rule__PatternVariable__NameAssignment_1 )
            // InternalReactionRules.g:3183:3: rule__PatternVariable__NameAssignment_1
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
    // InternalReactionRules.g:3191:1: rule__PatternVariable__Group__2 : rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 ;
    public final void rule__PatternVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3195:1: ( rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 )
            // InternalReactionRules.g:3196:2: rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3
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
    // InternalReactionRules.g:3203:1: rule__PatternVariable__Group__2__Impl : ( '=' ) ;
    public final void rule__PatternVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3207:1: ( ( '=' ) )
            // InternalReactionRules.g:3208:1: ( '=' )
            {
            // InternalReactionRules.g:3208:1: ( '=' )
            // InternalReactionRules.g:3209:2: '='
            {
             before(grammarAccess.getPatternVariableAccess().getEqualsSignKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalReactionRules.g:3218:1: rule__PatternVariable__Group__3 : rule__PatternVariable__Group__3__Impl ;
    public final void rule__PatternVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3222:1: ( rule__PatternVariable__Group__3__Impl )
            // InternalReactionRules.g:3223:2: rule__PatternVariable__Group__3__Impl
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
    // InternalReactionRules.g:3229:1: rule__PatternVariable__Group__3__Impl : ( ( rule__PatternVariable__PatternAssignment_3 ) ) ;
    public final void rule__PatternVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3233:1: ( ( ( rule__PatternVariable__PatternAssignment_3 ) ) )
            // InternalReactionRules.g:3234:1: ( ( rule__PatternVariable__PatternAssignment_3 ) )
            {
            // InternalReactionRules.g:3234:1: ( ( rule__PatternVariable__PatternAssignment_3 ) )
            // InternalReactionRules.g:3235:2: ( rule__PatternVariable__PatternAssignment_3 )
            {
             before(grammarAccess.getPatternVariableAccess().getPatternAssignment_3()); 
            // InternalReactionRules.g:3236:2: ( rule__PatternVariable__PatternAssignment_3 )
            // InternalReactionRules.g:3236:3: rule__PatternVariable__PatternAssignment_3
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
    // InternalReactionRules.g:3245:1: rule__ArithmeticVariable__Group__0 : rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1 ;
    public final void rule__ArithmeticVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3249:1: ( rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1 )
            // InternalReactionRules.g:3250:2: rule__ArithmeticVariable__Group__0__Impl rule__ArithmeticVariable__Group__1
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
    // InternalReactionRules.g:3257:1: rule__ArithmeticVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__ArithmeticVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3261:1: ( ( 'var' ) )
            // InternalReactionRules.g:3262:1: ( 'var' )
            {
            // InternalReactionRules.g:3262:1: ( 'var' )
            // InternalReactionRules.g:3263:2: 'var'
            {
             before(grammarAccess.getArithmeticVariableAccess().getVarKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalReactionRules.g:3272:1: rule__ArithmeticVariable__Group__1 : rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2 ;
    public final void rule__ArithmeticVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3276:1: ( rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2 )
            // InternalReactionRules.g:3277:2: rule__ArithmeticVariable__Group__1__Impl rule__ArithmeticVariable__Group__2
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
    // InternalReactionRules.g:3284:1: rule__ArithmeticVariable__Group__1__Impl : ( ( rule__ArithmeticVariable__NameAssignment_1 ) ) ;
    public final void rule__ArithmeticVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3288:1: ( ( ( rule__ArithmeticVariable__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3289:1: ( ( rule__ArithmeticVariable__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3289:1: ( ( rule__ArithmeticVariable__NameAssignment_1 ) )
            // InternalReactionRules.g:3290:2: ( rule__ArithmeticVariable__NameAssignment_1 )
            {
             before(grammarAccess.getArithmeticVariableAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3291:2: ( rule__ArithmeticVariable__NameAssignment_1 )
            // InternalReactionRules.g:3291:3: rule__ArithmeticVariable__NameAssignment_1
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
    // InternalReactionRules.g:3299:1: rule__ArithmeticVariable__Group__2 : rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3 ;
    public final void rule__ArithmeticVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3303:1: ( rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3 )
            // InternalReactionRules.g:3304:2: rule__ArithmeticVariable__Group__2__Impl rule__ArithmeticVariable__Group__3
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
    // InternalReactionRules.g:3311:1: rule__ArithmeticVariable__Group__2__Impl : ( '=' ) ;
    public final void rule__ArithmeticVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3315:1: ( ( '=' ) )
            // InternalReactionRules.g:3316:1: ( '=' )
            {
            // InternalReactionRules.g:3316:1: ( '=' )
            // InternalReactionRules.g:3317:2: '='
            {
             before(grammarAccess.getArithmeticVariableAccess().getEqualsSignKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalReactionRules.g:3326:1: rule__ArithmeticVariable__Group__3 : rule__ArithmeticVariable__Group__3__Impl ;
    public final void rule__ArithmeticVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3330:1: ( rule__ArithmeticVariable__Group__3__Impl )
            // InternalReactionRules.g:3331:2: rule__ArithmeticVariable__Group__3__Impl
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
    // InternalReactionRules.g:3337:1: rule__ArithmeticVariable__Group__3__Impl : ( ( rule__ArithmeticVariable__ValueAssignment_3 ) ) ;
    public final void rule__ArithmeticVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3341:1: ( ( ( rule__ArithmeticVariable__ValueAssignment_3 ) ) )
            // InternalReactionRules.g:3342:1: ( ( rule__ArithmeticVariable__ValueAssignment_3 ) )
            {
            // InternalReactionRules.g:3342:1: ( ( rule__ArithmeticVariable__ValueAssignment_3 ) )
            // InternalReactionRules.g:3343:2: ( rule__ArithmeticVariable__ValueAssignment_3 )
            {
             before(grammarAccess.getArithmeticVariableAccess().getValueAssignment_3()); 
            // InternalReactionRules.g:3344:2: ( rule__ArithmeticVariable__ValueAssignment_3 )
            // InternalReactionRules.g:3344:3: rule__ArithmeticVariable__ValueAssignment_3
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
    // InternalReactionRules.g:3353:1: rule__SemiLink__Group__0 : rule__SemiLink__Group__0__Impl rule__SemiLink__Group__1 ;
    public final void rule__SemiLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3357:1: ( rule__SemiLink__Group__0__Impl rule__SemiLink__Group__1 )
            // InternalReactionRules.g:3358:2: rule__SemiLink__Group__0__Impl rule__SemiLink__Group__1
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
    // InternalReactionRules.g:3365:1: rule__SemiLink__Group__0__Impl : ( () ) ;
    public final void rule__SemiLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3369:1: ( ( () ) )
            // InternalReactionRules.g:3370:1: ( () )
            {
            // InternalReactionRules.g:3370:1: ( () )
            // InternalReactionRules.g:3371:2: ()
            {
             before(grammarAccess.getSemiLinkAccess().getSemiLinkAction_0()); 
            // InternalReactionRules.g:3372:2: ()
            // InternalReactionRules.g:3372:3: 
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
    // InternalReactionRules.g:3380:1: rule__SemiLink__Group__1 : rule__SemiLink__Group__1__Impl ;
    public final void rule__SemiLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3384:1: ( rule__SemiLink__Group__1__Impl )
            // InternalReactionRules.g:3385:2: rule__SemiLink__Group__1__Impl
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
    // InternalReactionRules.g:3391:1: rule__SemiLink__Group__1__Impl : ( ( rule__SemiLink__NameAssignment_1 ) ) ;
    public final void rule__SemiLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3395:1: ( ( ( rule__SemiLink__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3396:1: ( ( rule__SemiLink__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3396:1: ( ( rule__SemiLink__NameAssignment_1 ) )
            // InternalReactionRules.g:3397:2: ( rule__SemiLink__NameAssignment_1 )
            {
             before(grammarAccess.getSemiLinkAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3398:2: ( rule__SemiLink__NameAssignment_1 )
            // InternalReactionRules.g:3398:3: rule__SemiLink__NameAssignment_1
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
    // InternalReactionRules.g:3407:1: rule__FreeLink__Group__0 : rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1 ;
    public final void rule__FreeLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3411:1: ( rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1 )
            // InternalReactionRules.g:3412:2: rule__FreeLink__Group__0__Impl rule__FreeLink__Group__1
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
    // InternalReactionRules.g:3419:1: rule__FreeLink__Group__0__Impl : ( () ) ;
    public final void rule__FreeLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3423:1: ( ( () ) )
            // InternalReactionRules.g:3424:1: ( () )
            {
            // InternalReactionRules.g:3424:1: ( () )
            // InternalReactionRules.g:3425:2: ()
            {
             before(grammarAccess.getFreeLinkAccess().getFreeLinkAction_0()); 
            // InternalReactionRules.g:3426:2: ()
            // InternalReactionRules.g:3426:3: 
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
    // InternalReactionRules.g:3434:1: rule__FreeLink__Group__1 : rule__FreeLink__Group__1__Impl ;
    public final void rule__FreeLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3438:1: ( rule__FreeLink__Group__1__Impl )
            // InternalReactionRules.g:3439:2: rule__FreeLink__Group__1__Impl
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
    // InternalReactionRules.g:3445:1: rule__FreeLink__Group__1__Impl : ( ( rule__FreeLink__NameAssignment_1 ) ) ;
    public final void rule__FreeLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3449:1: ( ( ( rule__FreeLink__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3450:1: ( ( rule__FreeLink__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3450:1: ( ( rule__FreeLink__NameAssignment_1 ) )
            // InternalReactionRules.g:3451:2: ( rule__FreeLink__NameAssignment_1 )
            {
             before(grammarAccess.getFreeLinkAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3452:2: ( rule__FreeLink__NameAssignment_1 )
            // InternalReactionRules.g:3452:3: rule__FreeLink__NameAssignment_1
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
    // InternalReactionRules.g:3461:1: rule__WhatEver__Group__0 : rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1 ;
    public final void rule__WhatEver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3465:1: ( rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1 )
            // InternalReactionRules.g:3466:2: rule__WhatEver__Group__0__Impl rule__WhatEver__Group__1
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
    // InternalReactionRules.g:3473:1: rule__WhatEver__Group__0__Impl : ( () ) ;
    public final void rule__WhatEver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3477:1: ( ( () ) )
            // InternalReactionRules.g:3478:1: ( () )
            {
            // InternalReactionRules.g:3478:1: ( () )
            // InternalReactionRules.g:3479:2: ()
            {
             before(grammarAccess.getWhatEverAccess().getWhatEverAction_0()); 
            // InternalReactionRules.g:3480:2: ()
            // InternalReactionRules.g:3480:3: 
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
    // InternalReactionRules.g:3488:1: rule__WhatEver__Group__1 : rule__WhatEver__Group__1__Impl ;
    public final void rule__WhatEver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3492:1: ( rule__WhatEver__Group__1__Impl )
            // InternalReactionRules.g:3493:2: rule__WhatEver__Group__1__Impl
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
    // InternalReactionRules.g:3499:1: rule__WhatEver__Group__1__Impl : ( ( rule__WhatEver__NameAssignment_1 ) ) ;
    public final void rule__WhatEver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3503:1: ( ( ( rule__WhatEver__NameAssignment_1 ) ) )
            // InternalReactionRules.g:3504:1: ( ( rule__WhatEver__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:3504:1: ( ( rule__WhatEver__NameAssignment_1 ) )
            // InternalReactionRules.g:3505:2: ( rule__WhatEver__NameAssignment_1 )
            {
             before(grammarAccess.getWhatEverAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:3506:2: ( rule__WhatEver__NameAssignment_1 )
            // InternalReactionRules.g:3506:3: rule__WhatEver__NameAssignment_1
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
    // InternalReactionRules.g:3515:1: rule__IndexedLink__Group__0 : rule__IndexedLink__Group__0__Impl rule__IndexedLink__Group__1 ;
    public final void rule__IndexedLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3519:1: ( rule__IndexedLink__Group__0__Impl rule__IndexedLink__Group__1 )
            // InternalReactionRules.g:3520:2: rule__IndexedLink__Group__0__Impl rule__IndexedLink__Group__1
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
    // InternalReactionRules.g:3527:1: rule__IndexedLink__Group__0__Impl : ( () ) ;
    public final void rule__IndexedLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3531:1: ( ( () ) )
            // InternalReactionRules.g:3532:1: ( () )
            {
            // InternalReactionRules.g:3532:1: ( () )
            // InternalReactionRules.g:3533:2: ()
            {
             before(grammarAccess.getIndexedLinkAccess().getIndexedLinkAction_0()); 
            // InternalReactionRules.g:3534:2: ()
            // InternalReactionRules.g:3534:3: 
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
    // InternalReactionRules.g:3542:1: rule__IndexedLink__Group__1 : rule__IndexedLink__Group__1__Impl ;
    public final void rule__IndexedLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3546:1: ( rule__IndexedLink__Group__1__Impl )
            // InternalReactionRules.g:3547:2: rule__IndexedLink__Group__1__Impl
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
    // InternalReactionRules.g:3553:1: rule__IndexedLink__Group__1__Impl : ( ( rule__IndexedLink__StateAssignment_1 ) ) ;
    public final void rule__IndexedLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3557:1: ( ( ( rule__IndexedLink__StateAssignment_1 ) ) )
            // InternalReactionRules.g:3558:1: ( ( rule__IndexedLink__StateAssignment_1 ) )
            {
            // InternalReactionRules.g:3558:1: ( ( rule__IndexedLink__StateAssignment_1 ) )
            // InternalReactionRules.g:3559:2: ( rule__IndexedLink__StateAssignment_1 )
            {
             before(grammarAccess.getIndexedLinkAccess().getStateAssignment_1()); 
            // InternalReactionRules.g:3560:2: ( rule__IndexedLink__StateAssignment_1 )
            // InternalReactionRules.g:3560:3: rule__IndexedLink__StateAssignment_1
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
    // InternalReactionRules.g:3569:1: rule__ExactLinkAgent__Group__0 : rule__ExactLinkAgent__Group__0__Impl rule__ExactLinkAgent__Group__1 ;
    public final void rule__ExactLinkAgent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3573:1: ( rule__ExactLinkAgent__Group__0__Impl rule__ExactLinkAgent__Group__1 )
            // InternalReactionRules.g:3574:2: rule__ExactLinkAgent__Group__0__Impl rule__ExactLinkAgent__Group__1
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
    // InternalReactionRules.g:3581:1: rule__ExactLinkAgent__Group__0__Impl : ( () ) ;
    public final void rule__ExactLinkAgent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3585:1: ( ( () ) )
            // InternalReactionRules.g:3586:1: ( () )
            {
            // InternalReactionRules.g:3586:1: ( () )
            // InternalReactionRules.g:3587:2: ()
            {
             before(grammarAccess.getExactLinkAgentAccess().getExactLinkAgentAction_0()); 
            // InternalReactionRules.g:3588:2: ()
            // InternalReactionRules.g:3588:3: 
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
    // InternalReactionRules.g:3596:1: rule__ExactLinkAgent__Group__1 : rule__ExactLinkAgent__Group__1__Impl ;
    public final void rule__ExactLinkAgent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3600:1: ( rule__ExactLinkAgent__Group__1__Impl )
            // InternalReactionRules.g:3601:2: rule__ExactLinkAgent__Group__1__Impl
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
    // InternalReactionRules.g:3607:1: rule__ExactLinkAgent__Group__1__Impl : ( ( rule__ExactLinkAgent__AgentAssignment_1 ) ) ;
    public final void rule__ExactLinkAgent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3611:1: ( ( ( rule__ExactLinkAgent__AgentAssignment_1 ) ) )
            // InternalReactionRules.g:3612:1: ( ( rule__ExactLinkAgent__AgentAssignment_1 ) )
            {
            // InternalReactionRules.g:3612:1: ( ( rule__ExactLinkAgent__AgentAssignment_1 ) )
            // InternalReactionRules.g:3613:2: ( rule__ExactLinkAgent__AgentAssignment_1 )
            {
             before(grammarAccess.getExactLinkAgentAccess().getAgentAssignment_1()); 
            // InternalReactionRules.g:3614:2: ( rule__ExactLinkAgent__AgentAssignment_1 )
            // InternalReactionRules.g:3614:3: rule__ExactLinkAgent__AgentAssignment_1
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
    // InternalReactionRules.g:3623:1: rule__ExactLinkSite__Group__0 : rule__ExactLinkSite__Group__0__Impl rule__ExactLinkSite__Group__1 ;
    public final void rule__ExactLinkSite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3627:1: ( rule__ExactLinkSite__Group__0__Impl rule__ExactLinkSite__Group__1 )
            // InternalReactionRules.g:3628:2: rule__ExactLinkSite__Group__0__Impl rule__ExactLinkSite__Group__1
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
    // InternalReactionRules.g:3635:1: rule__ExactLinkSite__Group__0__Impl : ( () ) ;
    public final void rule__ExactLinkSite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3639:1: ( ( () ) )
            // InternalReactionRules.g:3640:1: ( () )
            {
            // InternalReactionRules.g:3640:1: ( () )
            // InternalReactionRules.g:3641:2: ()
            {
             before(grammarAccess.getExactLinkSiteAccess().getExactLinkSiteAction_0()); 
            // InternalReactionRules.g:3642:2: ()
            // InternalReactionRules.g:3642:3: 
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
    // InternalReactionRules.g:3650:1: rule__ExactLinkSite__Group__1 : rule__ExactLinkSite__Group__1__Impl ;
    public final void rule__ExactLinkSite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3654:1: ( rule__ExactLinkSite__Group__1__Impl )
            // InternalReactionRules.g:3655:2: rule__ExactLinkSite__Group__1__Impl
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
    // InternalReactionRules.g:3661:1: rule__ExactLinkSite__Group__1__Impl : ( ( rule__ExactLinkSite__SiteAssignment_1 ) ) ;
    public final void rule__ExactLinkSite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3665:1: ( ( ( rule__ExactLinkSite__SiteAssignment_1 ) ) )
            // InternalReactionRules.g:3666:1: ( ( rule__ExactLinkSite__SiteAssignment_1 ) )
            {
            // InternalReactionRules.g:3666:1: ( ( rule__ExactLinkSite__SiteAssignment_1 ) )
            // InternalReactionRules.g:3667:2: ( rule__ExactLinkSite__SiteAssignment_1 )
            {
             before(grammarAccess.getExactLinkSiteAccess().getSiteAssignment_1()); 
            // InternalReactionRules.g:3668:2: ( rule__ExactLinkSite__SiteAssignment_1 )
            // InternalReactionRules.g:3668:3: rule__ExactLinkSite__SiteAssignment_1
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
    // InternalReactionRules.g:3677:1: rule__ExactLink__Group__0 : rule__ExactLink__Group__0__Impl rule__ExactLink__Group__1 ;
    public final void rule__ExactLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3681:1: ( rule__ExactLink__Group__0__Impl rule__ExactLink__Group__1 )
            // InternalReactionRules.g:3682:2: rule__ExactLink__Group__0__Impl rule__ExactLink__Group__1
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
    // InternalReactionRules.g:3689:1: rule__ExactLink__Group__0__Impl : ( () ) ;
    public final void rule__ExactLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3693:1: ( ( () ) )
            // InternalReactionRules.g:3694:1: ( () )
            {
            // InternalReactionRules.g:3694:1: ( () )
            // InternalReactionRules.g:3695:2: ()
            {
             before(grammarAccess.getExactLinkAccess().getExactLinkAction_0()); 
            // InternalReactionRules.g:3696:2: ()
            // InternalReactionRules.g:3696:3: 
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
    // InternalReactionRules.g:3704:1: rule__ExactLink__Group__1 : rule__ExactLink__Group__1__Impl rule__ExactLink__Group__2 ;
    public final void rule__ExactLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3708:1: ( rule__ExactLink__Group__1__Impl rule__ExactLink__Group__2 )
            // InternalReactionRules.g:3709:2: rule__ExactLink__Group__1__Impl rule__ExactLink__Group__2
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
    // InternalReactionRules.g:3716:1: rule__ExactLink__Group__1__Impl : ( ( rule__ExactLink__LinkAgentAssignment_1 ) ) ;
    public final void rule__ExactLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3720:1: ( ( ( rule__ExactLink__LinkAgentAssignment_1 ) ) )
            // InternalReactionRules.g:3721:1: ( ( rule__ExactLink__LinkAgentAssignment_1 ) )
            {
            // InternalReactionRules.g:3721:1: ( ( rule__ExactLink__LinkAgentAssignment_1 ) )
            // InternalReactionRules.g:3722:2: ( rule__ExactLink__LinkAgentAssignment_1 )
            {
             before(grammarAccess.getExactLinkAccess().getLinkAgentAssignment_1()); 
            // InternalReactionRules.g:3723:2: ( rule__ExactLink__LinkAgentAssignment_1 )
            // InternalReactionRules.g:3723:3: rule__ExactLink__LinkAgentAssignment_1
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
    // InternalReactionRules.g:3731:1: rule__ExactLink__Group__2 : rule__ExactLink__Group__2__Impl rule__ExactLink__Group__3 ;
    public final void rule__ExactLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3735:1: ( rule__ExactLink__Group__2__Impl rule__ExactLink__Group__3 )
            // InternalReactionRules.g:3736:2: rule__ExactLink__Group__2__Impl rule__ExactLink__Group__3
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
    // InternalReactionRules.g:3743:1: rule__ExactLink__Group__2__Impl : ( '.' ) ;
    public final void rule__ExactLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3747:1: ( ( '.' ) )
            // InternalReactionRules.g:3748:1: ( '.' )
            {
            // InternalReactionRules.g:3748:1: ( '.' )
            // InternalReactionRules.g:3749:2: '.'
            {
             before(grammarAccess.getExactLinkAccess().getFullStopKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalReactionRules.g:3758:1: rule__ExactLink__Group__3 : rule__ExactLink__Group__3__Impl ;
    public final void rule__ExactLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3762:1: ( rule__ExactLink__Group__3__Impl )
            // InternalReactionRules.g:3763:2: rule__ExactLink__Group__3__Impl
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
    // InternalReactionRules.g:3769:1: rule__ExactLink__Group__3__Impl : ( ( rule__ExactLink__LinkSiteAssignment_3 ) ) ;
    public final void rule__ExactLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3773:1: ( ( ( rule__ExactLink__LinkSiteAssignment_3 ) ) )
            // InternalReactionRules.g:3774:1: ( ( rule__ExactLink__LinkSiteAssignment_3 ) )
            {
            // InternalReactionRules.g:3774:1: ( ( rule__ExactLink__LinkSiteAssignment_3 ) )
            // InternalReactionRules.g:3775:2: ( rule__ExactLink__LinkSiteAssignment_3 )
            {
             before(grammarAccess.getExactLinkAccess().getLinkSiteAssignment_3()); 
            // InternalReactionRules.g:3776:2: ( rule__ExactLink__LinkSiteAssignment_3 )
            // InternalReactionRules.g:3776:3: rule__ExactLink__LinkSiteAssignment_3
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
    // InternalReactionRules.g:3785:1: rule__SiteState__Group__0 : rule__SiteState__Group__0__Impl rule__SiteState__Group__1 ;
    public final void rule__SiteState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3789:1: ( rule__SiteState__Group__0__Impl rule__SiteState__Group__1 )
            // InternalReactionRules.g:3790:2: rule__SiteState__Group__0__Impl rule__SiteState__Group__1
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
    // InternalReactionRules.g:3797:1: rule__SiteState__Group__0__Impl : ( () ) ;
    public final void rule__SiteState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3801:1: ( ( () ) )
            // InternalReactionRules.g:3802:1: ( () )
            {
            // InternalReactionRules.g:3802:1: ( () )
            // InternalReactionRules.g:3803:2: ()
            {
             before(grammarAccess.getSiteStateAccess().getSiteStateAction_0()); 
            // InternalReactionRules.g:3804:2: ()
            // InternalReactionRules.g:3804:3: 
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
    // InternalReactionRules.g:3812:1: rule__SiteState__Group__1 : rule__SiteState__Group__1__Impl ;
    public final void rule__SiteState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3816:1: ( rule__SiteState__Group__1__Impl )
            // InternalReactionRules.g:3817:2: rule__SiteState__Group__1__Impl
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
    // InternalReactionRules.g:3823:1: rule__SiteState__Group__1__Impl : ( ( rule__SiteState__StateAssignment_1 ) ) ;
    public final void rule__SiteState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3827:1: ( ( ( rule__SiteState__StateAssignment_1 ) ) )
            // InternalReactionRules.g:3828:1: ( ( rule__SiteState__StateAssignment_1 ) )
            {
            // InternalReactionRules.g:3828:1: ( ( rule__SiteState__StateAssignment_1 ) )
            // InternalReactionRules.g:3829:2: ( rule__SiteState__StateAssignment_1 )
            {
             before(grammarAccess.getSiteStateAccess().getStateAssignment_1()); 
            // InternalReactionRules.g:3830:2: ( rule__SiteState__StateAssignment_1 )
            // InternalReactionRules.g:3830:3: rule__SiteState__StateAssignment_1
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
    // InternalReactionRules.g:3839:1: rule__LinkState__Group__0 : rule__LinkState__Group__0__Impl rule__LinkState__Group__1 ;
    public final void rule__LinkState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3843:1: ( rule__LinkState__Group__0__Impl rule__LinkState__Group__1 )
            // InternalReactionRules.g:3844:2: rule__LinkState__Group__0__Impl rule__LinkState__Group__1
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
    // InternalReactionRules.g:3851:1: rule__LinkState__Group__0__Impl : ( () ) ;
    public final void rule__LinkState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3855:1: ( ( () ) )
            // InternalReactionRules.g:3856:1: ( () )
            {
            // InternalReactionRules.g:3856:1: ( () )
            // InternalReactionRules.g:3857:2: ()
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAction_0()); 
            // InternalReactionRules.g:3858:2: ()
            // InternalReactionRules.g:3858:3: 
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
    // InternalReactionRules.g:3866:1: rule__LinkState__Group__1 : rule__LinkState__Group__1__Impl ;
    public final void rule__LinkState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3870:1: ( rule__LinkState__Group__1__Impl )
            // InternalReactionRules.g:3871:2: rule__LinkState__Group__1__Impl
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
    // InternalReactionRules.g:3877:1: rule__LinkState__Group__1__Impl : ( ( rule__LinkState__LinkStateAssignment_1 ) ) ;
    public final void rule__LinkState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3881:1: ( ( ( rule__LinkState__LinkStateAssignment_1 ) ) )
            // InternalReactionRules.g:3882:1: ( ( rule__LinkState__LinkStateAssignment_1 ) )
            {
            // InternalReactionRules.g:3882:1: ( ( rule__LinkState__LinkStateAssignment_1 ) )
            // InternalReactionRules.g:3883:2: ( rule__LinkState__LinkStateAssignment_1 )
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAssignment_1()); 
            // InternalReactionRules.g:3884:2: ( rule__LinkState__LinkStateAssignment_1 )
            // InternalReactionRules.g:3884:3: rule__LinkState__LinkStateAssignment_1
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
    // InternalReactionRules.g:3893:1: rule__SitePattern__Group__0 : rule__SitePattern__Group__0__Impl rule__SitePattern__Group__1 ;
    public final void rule__SitePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3897:1: ( rule__SitePattern__Group__0__Impl rule__SitePattern__Group__1 )
            // InternalReactionRules.g:3898:2: rule__SitePattern__Group__0__Impl rule__SitePattern__Group__1
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
    // InternalReactionRules.g:3905:1: rule__SitePattern__Group__0__Impl : ( () ) ;
    public final void rule__SitePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3909:1: ( ( () ) )
            // InternalReactionRules.g:3910:1: ( () )
            {
            // InternalReactionRules.g:3910:1: ( () )
            // InternalReactionRules.g:3911:2: ()
            {
             before(grammarAccess.getSitePatternAccess().getSitePatternAction_0()); 
            // InternalReactionRules.g:3912:2: ()
            // InternalReactionRules.g:3912:3: 
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
    // InternalReactionRules.g:3920:1: rule__SitePattern__Group__1 : rule__SitePattern__Group__1__Impl rule__SitePattern__Group__2 ;
    public final void rule__SitePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3924:1: ( rule__SitePattern__Group__1__Impl rule__SitePattern__Group__2 )
            // InternalReactionRules.g:3925:2: rule__SitePattern__Group__1__Impl rule__SitePattern__Group__2
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
    // InternalReactionRules.g:3932:1: rule__SitePattern__Group__1__Impl : ( ( rule__SitePattern__SiteAssignment_1 ) ) ;
    public final void rule__SitePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3936:1: ( ( ( rule__SitePattern__SiteAssignment_1 ) ) )
            // InternalReactionRules.g:3937:1: ( ( rule__SitePattern__SiteAssignment_1 ) )
            {
            // InternalReactionRules.g:3937:1: ( ( rule__SitePattern__SiteAssignment_1 ) )
            // InternalReactionRules.g:3938:2: ( rule__SitePattern__SiteAssignment_1 )
            {
             before(grammarAccess.getSitePatternAccess().getSiteAssignment_1()); 
            // InternalReactionRules.g:3939:2: ( rule__SitePattern__SiteAssignment_1 )
            // InternalReactionRules.g:3939:3: rule__SitePattern__SiteAssignment_1
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
    // InternalReactionRules.g:3947:1: rule__SitePattern__Group__2 : rule__SitePattern__Group__2__Impl rule__SitePattern__Group__3 ;
    public final void rule__SitePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3951:1: ( rule__SitePattern__Group__2__Impl rule__SitePattern__Group__3 )
            // InternalReactionRules.g:3952:2: rule__SitePattern__Group__2__Impl rule__SitePattern__Group__3
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
    // InternalReactionRules.g:3959:1: rule__SitePattern__Group__2__Impl : ( ( rule__SitePattern__Group_2__0 )? ) ;
    public final void rule__SitePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3963:1: ( ( ( rule__SitePattern__Group_2__0 )? ) )
            // InternalReactionRules.g:3964:1: ( ( rule__SitePattern__Group_2__0 )? )
            {
            // InternalReactionRules.g:3964:1: ( ( rule__SitePattern__Group_2__0 )? )
            // InternalReactionRules.g:3965:2: ( rule__SitePattern__Group_2__0 )?
            {
             before(grammarAccess.getSitePatternAccess().getGroup_2()); 
            // InternalReactionRules.g:3966:2: ( rule__SitePattern__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalReactionRules.g:3966:3: rule__SitePattern__Group_2__0
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
    // InternalReactionRules.g:3974:1: rule__SitePattern__Group__3 : rule__SitePattern__Group__3__Impl rule__SitePattern__Group__4 ;
    public final void rule__SitePattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3978:1: ( rule__SitePattern__Group__3__Impl rule__SitePattern__Group__4 )
            // InternalReactionRules.g:3979:2: rule__SitePattern__Group__3__Impl rule__SitePattern__Group__4
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
    // InternalReactionRules.g:3986:1: rule__SitePattern__Group__3__Impl : ( '[' ) ;
    public final void rule__SitePattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:3990:1: ( ( '[' ) )
            // InternalReactionRules.g:3991:1: ( '[' )
            {
            // InternalReactionRules.g:3991:1: ( '[' )
            // InternalReactionRules.g:3992:2: '['
            {
             before(grammarAccess.getSitePatternAccess().getLeftSquareBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalReactionRules.g:4001:1: rule__SitePattern__Group__4 : rule__SitePattern__Group__4__Impl rule__SitePattern__Group__5 ;
    public final void rule__SitePattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4005:1: ( rule__SitePattern__Group__4__Impl rule__SitePattern__Group__5 )
            // InternalReactionRules.g:4006:2: rule__SitePattern__Group__4__Impl rule__SitePattern__Group__5
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
    // InternalReactionRules.g:4013:1: rule__SitePattern__Group__4__Impl : ( ( rule__SitePattern__LinkStateAssignment_4 ) ) ;
    public final void rule__SitePattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4017:1: ( ( ( rule__SitePattern__LinkStateAssignment_4 ) ) )
            // InternalReactionRules.g:4018:1: ( ( rule__SitePattern__LinkStateAssignment_4 ) )
            {
            // InternalReactionRules.g:4018:1: ( ( rule__SitePattern__LinkStateAssignment_4 ) )
            // InternalReactionRules.g:4019:2: ( rule__SitePattern__LinkStateAssignment_4 )
            {
             before(grammarAccess.getSitePatternAccess().getLinkStateAssignment_4()); 
            // InternalReactionRules.g:4020:2: ( rule__SitePattern__LinkStateAssignment_4 )
            // InternalReactionRules.g:4020:3: rule__SitePattern__LinkStateAssignment_4
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
    // InternalReactionRules.g:4028:1: rule__SitePattern__Group__5 : rule__SitePattern__Group__5__Impl ;
    public final void rule__SitePattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4032:1: ( rule__SitePattern__Group__5__Impl )
            // InternalReactionRules.g:4033:2: rule__SitePattern__Group__5__Impl
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
    // InternalReactionRules.g:4039:1: rule__SitePattern__Group__5__Impl : ( ']' ) ;
    public final void rule__SitePattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4043:1: ( ( ']' ) )
            // InternalReactionRules.g:4044:1: ( ']' )
            {
            // InternalReactionRules.g:4044:1: ( ']' )
            // InternalReactionRules.g:4045:2: ']'
            {
             before(grammarAccess.getSitePatternAccess().getRightSquareBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
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
    // InternalReactionRules.g:4055:1: rule__SitePattern__Group_2__0 : rule__SitePattern__Group_2__0__Impl rule__SitePattern__Group_2__1 ;
    public final void rule__SitePattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4059:1: ( rule__SitePattern__Group_2__0__Impl rule__SitePattern__Group_2__1 )
            // InternalReactionRules.g:4060:2: rule__SitePattern__Group_2__0__Impl rule__SitePattern__Group_2__1
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
    // InternalReactionRules.g:4067:1: rule__SitePattern__Group_2__0__Impl : ( '{' ) ;
    public final void rule__SitePattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4071:1: ( ( '{' ) )
            // InternalReactionRules.g:4072:1: ( '{' )
            {
            // InternalReactionRules.g:4072:1: ( '{' )
            // InternalReactionRules.g:4073:2: '{'
            {
             before(grammarAccess.getSitePatternAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalReactionRules.g:4082:1: rule__SitePattern__Group_2__1 : rule__SitePattern__Group_2__1__Impl rule__SitePattern__Group_2__2 ;
    public final void rule__SitePattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4086:1: ( rule__SitePattern__Group_2__1__Impl rule__SitePattern__Group_2__2 )
            // InternalReactionRules.g:4087:2: rule__SitePattern__Group_2__1__Impl rule__SitePattern__Group_2__2
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
    // InternalReactionRules.g:4094:1: rule__SitePattern__Group_2__1__Impl : ( ( rule__SitePattern__StateAssignment_2_1 ) ) ;
    public final void rule__SitePattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4098:1: ( ( ( rule__SitePattern__StateAssignment_2_1 ) ) )
            // InternalReactionRules.g:4099:1: ( ( rule__SitePattern__StateAssignment_2_1 ) )
            {
            // InternalReactionRules.g:4099:1: ( ( rule__SitePattern__StateAssignment_2_1 ) )
            // InternalReactionRules.g:4100:2: ( rule__SitePattern__StateAssignment_2_1 )
            {
             before(grammarAccess.getSitePatternAccess().getStateAssignment_2_1()); 
            // InternalReactionRules.g:4101:2: ( rule__SitePattern__StateAssignment_2_1 )
            // InternalReactionRules.g:4101:3: rule__SitePattern__StateAssignment_2_1
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
    // InternalReactionRules.g:4109:1: rule__SitePattern__Group_2__2 : rule__SitePattern__Group_2__2__Impl ;
    public final void rule__SitePattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4113:1: ( rule__SitePattern__Group_2__2__Impl )
            // InternalReactionRules.g:4114:2: rule__SitePattern__Group_2__2__Impl
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
    // InternalReactionRules.g:4120:1: rule__SitePattern__Group_2__2__Impl : ( '}' ) ;
    public final void rule__SitePattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4124:1: ( ( '}' ) )
            // InternalReactionRules.g:4125:1: ( '}' )
            {
            // InternalReactionRules.g:4125:1: ( '}' )
            // InternalReactionRules.g:4126:2: '}'
            {
             before(grammarAccess.getSitePatternAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalReactionRules.g:4136:1: rule__SitePatterns__Group__0 : rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1 ;
    public final void rule__SitePatterns__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4140:1: ( rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1 )
            // InternalReactionRules.g:4141:2: rule__SitePatterns__Group__0__Impl rule__SitePatterns__Group__1
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
    // InternalReactionRules.g:4148:1: rule__SitePatterns__Group__0__Impl : ( () ) ;
    public final void rule__SitePatterns__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4152:1: ( ( () ) )
            // InternalReactionRules.g:4153:1: ( () )
            {
            // InternalReactionRules.g:4153:1: ( () )
            // InternalReactionRules.g:4154:2: ()
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAction_0()); 
            // InternalReactionRules.g:4155:2: ()
            // InternalReactionRules.g:4155:3: 
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
    // InternalReactionRules.g:4163:1: rule__SitePatterns__Group__1 : rule__SitePatterns__Group__1__Impl ;
    public final void rule__SitePatterns__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4167:1: ( rule__SitePatterns__Group__1__Impl )
            // InternalReactionRules.g:4168:2: rule__SitePatterns__Group__1__Impl
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
    // InternalReactionRules.g:4174:1: rule__SitePatterns__Group__1__Impl : ( ( rule__SitePatterns__Group_1__0 )? ) ;
    public final void rule__SitePatterns__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4178:1: ( ( ( rule__SitePatterns__Group_1__0 )? ) )
            // InternalReactionRules.g:4179:1: ( ( rule__SitePatterns__Group_1__0 )? )
            {
            // InternalReactionRules.g:4179:1: ( ( rule__SitePatterns__Group_1__0 )? )
            // InternalReactionRules.g:4180:2: ( rule__SitePatterns__Group_1__0 )?
            {
             before(grammarAccess.getSitePatternsAccess().getGroup_1()); 
            // InternalReactionRules.g:4181:2: ( rule__SitePatterns__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalReactionRules.g:4181:3: rule__SitePatterns__Group_1__0
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
    // InternalReactionRules.g:4190:1: rule__SitePatterns__Group_1__0 : rule__SitePatterns__Group_1__0__Impl rule__SitePatterns__Group_1__1 ;
    public final void rule__SitePatterns__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4194:1: ( rule__SitePatterns__Group_1__0__Impl rule__SitePatterns__Group_1__1 )
            // InternalReactionRules.g:4195:2: rule__SitePatterns__Group_1__0__Impl rule__SitePatterns__Group_1__1
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
    // InternalReactionRules.g:4202:1: rule__SitePatterns__Group_1__0__Impl : ( ( rule__SitePatterns__SitePatternsAssignment_1_0 ) ) ;
    public final void rule__SitePatterns__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4206:1: ( ( ( rule__SitePatterns__SitePatternsAssignment_1_0 ) ) )
            // InternalReactionRules.g:4207:1: ( ( rule__SitePatterns__SitePatternsAssignment_1_0 ) )
            {
            // InternalReactionRules.g:4207:1: ( ( rule__SitePatterns__SitePatternsAssignment_1_0 ) )
            // InternalReactionRules.g:4208:2: ( rule__SitePatterns__SitePatternsAssignment_1_0 )
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAssignment_1_0()); 
            // InternalReactionRules.g:4209:2: ( rule__SitePatterns__SitePatternsAssignment_1_0 )
            // InternalReactionRules.g:4209:3: rule__SitePatterns__SitePatternsAssignment_1_0
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
    // InternalReactionRules.g:4217:1: rule__SitePatterns__Group_1__1 : rule__SitePatterns__Group_1__1__Impl ;
    public final void rule__SitePatterns__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4221:1: ( rule__SitePatterns__Group_1__1__Impl )
            // InternalReactionRules.g:4222:2: rule__SitePatterns__Group_1__1__Impl
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
    // InternalReactionRules.g:4228:1: rule__SitePatterns__Group_1__1__Impl : ( ( rule__SitePatterns__Group_1_1__0 )* ) ;
    public final void rule__SitePatterns__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4232:1: ( ( ( rule__SitePatterns__Group_1_1__0 )* ) )
            // InternalReactionRules.g:4233:1: ( ( rule__SitePatterns__Group_1_1__0 )* )
            {
            // InternalReactionRules.g:4233:1: ( ( rule__SitePatterns__Group_1_1__0 )* )
            // InternalReactionRules.g:4234:2: ( rule__SitePatterns__Group_1_1__0 )*
            {
             before(grammarAccess.getSitePatternsAccess().getGroup_1_1()); 
            // InternalReactionRules.g:4235:2: ( rule__SitePatterns__Group_1_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalReactionRules.g:4235:3: rule__SitePatterns__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SitePatterns__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalReactionRules.g:4244:1: rule__SitePatterns__Group_1_1__0 : rule__SitePatterns__Group_1_1__0__Impl rule__SitePatterns__Group_1_1__1 ;
    public final void rule__SitePatterns__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4248:1: ( rule__SitePatterns__Group_1_1__0__Impl rule__SitePatterns__Group_1_1__1 )
            // InternalReactionRules.g:4249:2: rule__SitePatterns__Group_1_1__0__Impl rule__SitePatterns__Group_1_1__1
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
    // InternalReactionRules.g:4256:1: rule__SitePatterns__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__SitePatterns__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4260:1: ( ( ',' ) )
            // InternalReactionRules.g:4261:1: ( ',' )
            {
            // InternalReactionRules.g:4261:1: ( ',' )
            // InternalReactionRules.g:4262:2: ','
            {
             before(grammarAccess.getSitePatternsAccess().getCommaKeyword_1_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalReactionRules.g:4271:1: rule__SitePatterns__Group_1_1__1 : rule__SitePatterns__Group_1_1__1__Impl ;
    public final void rule__SitePatterns__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4275:1: ( rule__SitePatterns__Group_1_1__1__Impl )
            // InternalReactionRules.g:4276:2: rule__SitePatterns__Group_1_1__1__Impl
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
    // InternalReactionRules.g:4282:1: rule__SitePatterns__Group_1_1__1__Impl : ( ( rule__SitePatterns__SitePatternsAssignment_1_1_1 ) ) ;
    public final void rule__SitePatterns__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4286:1: ( ( ( rule__SitePatterns__SitePatternsAssignment_1_1_1 ) ) )
            // InternalReactionRules.g:4287:1: ( ( rule__SitePatterns__SitePatternsAssignment_1_1_1 ) )
            {
            // InternalReactionRules.g:4287:1: ( ( rule__SitePatterns__SitePatternsAssignment_1_1_1 ) )
            // InternalReactionRules.g:4288:2: ( rule__SitePatterns__SitePatternsAssignment_1_1_1 )
            {
             before(grammarAccess.getSitePatternsAccess().getSitePatternsAssignment_1_1_1()); 
            // InternalReactionRules.g:4289:2: ( rule__SitePatterns__SitePatternsAssignment_1_1_1 )
            // InternalReactionRules.g:4289:3: rule__SitePatterns__SitePatternsAssignment_1_1_1
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
    // InternalReactionRules.g:4298:1: rule__AgentPattern__Group__0 : rule__AgentPattern__Group__0__Impl rule__AgentPattern__Group__1 ;
    public final void rule__AgentPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4302:1: ( rule__AgentPattern__Group__0__Impl rule__AgentPattern__Group__1 )
            // InternalReactionRules.g:4303:2: rule__AgentPattern__Group__0__Impl rule__AgentPattern__Group__1
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
    // InternalReactionRules.g:4310:1: rule__AgentPattern__Group__0__Impl : ( () ) ;
    public final void rule__AgentPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4314:1: ( ( () ) )
            // InternalReactionRules.g:4315:1: ( () )
            {
            // InternalReactionRules.g:4315:1: ( () )
            // InternalReactionRules.g:4316:2: ()
            {
             before(grammarAccess.getAgentPatternAccess().getAgentPatternAction_0()); 
            // InternalReactionRules.g:4317:2: ()
            // InternalReactionRules.g:4317:3: 
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
    // InternalReactionRules.g:4325:1: rule__AgentPattern__Group__1 : rule__AgentPattern__Group__1__Impl rule__AgentPattern__Group__2 ;
    public final void rule__AgentPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4329:1: ( rule__AgentPattern__Group__1__Impl rule__AgentPattern__Group__2 )
            // InternalReactionRules.g:4330:2: rule__AgentPattern__Group__1__Impl rule__AgentPattern__Group__2
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
    // InternalReactionRules.g:4337:1: rule__AgentPattern__Group__1__Impl : ( ( rule__AgentPattern__AgentAssignment_1 ) ) ;
    public final void rule__AgentPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4341:1: ( ( ( rule__AgentPattern__AgentAssignment_1 ) ) )
            // InternalReactionRules.g:4342:1: ( ( rule__AgentPattern__AgentAssignment_1 ) )
            {
            // InternalReactionRules.g:4342:1: ( ( rule__AgentPattern__AgentAssignment_1 ) )
            // InternalReactionRules.g:4343:2: ( rule__AgentPattern__AgentAssignment_1 )
            {
             before(grammarAccess.getAgentPatternAccess().getAgentAssignment_1()); 
            // InternalReactionRules.g:4344:2: ( rule__AgentPattern__AgentAssignment_1 )
            // InternalReactionRules.g:4344:3: rule__AgentPattern__AgentAssignment_1
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
    // InternalReactionRules.g:4352:1: rule__AgentPattern__Group__2 : rule__AgentPattern__Group__2__Impl rule__AgentPattern__Group__3 ;
    public final void rule__AgentPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4356:1: ( rule__AgentPattern__Group__2__Impl rule__AgentPattern__Group__3 )
            // InternalReactionRules.g:4357:2: rule__AgentPattern__Group__2__Impl rule__AgentPattern__Group__3
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
    // InternalReactionRules.g:4364:1: rule__AgentPattern__Group__2__Impl : ( '(' ) ;
    public final void rule__AgentPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4368:1: ( ( '(' ) )
            // InternalReactionRules.g:4369:1: ( '(' )
            {
            // InternalReactionRules.g:4369:1: ( '(' )
            // InternalReactionRules.g:4370:2: '('
            {
             before(grammarAccess.getAgentPatternAccess().getLeftParenthesisKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalReactionRules.g:4379:1: rule__AgentPattern__Group__3 : rule__AgentPattern__Group__3__Impl rule__AgentPattern__Group__4 ;
    public final void rule__AgentPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4383:1: ( rule__AgentPattern__Group__3__Impl rule__AgentPattern__Group__4 )
            // InternalReactionRules.g:4384:2: rule__AgentPattern__Group__3__Impl rule__AgentPattern__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalReactionRules.g:4391:1: rule__AgentPattern__Group__3__Impl : ( ( rule__AgentPattern__SitePatternsAssignment_3 ) ) ;
    public final void rule__AgentPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4395:1: ( ( ( rule__AgentPattern__SitePatternsAssignment_3 ) ) )
            // InternalReactionRules.g:4396:1: ( ( rule__AgentPattern__SitePatternsAssignment_3 ) )
            {
            // InternalReactionRules.g:4396:1: ( ( rule__AgentPattern__SitePatternsAssignment_3 ) )
            // InternalReactionRules.g:4397:2: ( rule__AgentPattern__SitePatternsAssignment_3 )
            {
             before(grammarAccess.getAgentPatternAccess().getSitePatternsAssignment_3()); 
            // InternalReactionRules.g:4398:2: ( rule__AgentPattern__SitePatternsAssignment_3 )
            // InternalReactionRules.g:4398:3: rule__AgentPattern__SitePatternsAssignment_3
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
    // InternalReactionRules.g:4406:1: rule__AgentPattern__Group__4 : rule__AgentPattern__Group__4__Impl ;
    public final void rule__AgentPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4410:1: ( rule__AgentPattern__Group__4__Impl )
            // InternalReactionRules.g:4411:2: rule__AgentPattern__Group__4__Impl
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
    // InternalReactionRules.g:4417:1: rule__AgentPattern__Group__4__Impl : ( ')' ) ;
    public final void rule__AgentPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4421:1: ( ( ')' ) )
            // InternalReactionRules.g:4422:1: ( ')' )
            {
            // InternalReactionRules.g:4422:1: ( ')' )
            // InternalReactionRules.g:4423:2: ')'
            {
             before(grammarAccess.getAgentPatternAccess().getRightParenthesisKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalReactionRules.g:4433:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4437:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalReactionRules.g:4438:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // InternalReactionRules.g:4445:1: rule__Pattern__Group__0__Impl : ( () ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4449:1: ( ( () ) )
            // InternalReactionRules.g:4450:1: ( () )
            {
            // InternalReactionRules.g:4450:1: ( () )
            // InternalReactionRules.g:4451:2: ()
            {
             before(grammarAccess.getPatternAccess().getPatternAction_0()); 
            // InternalReactionRules.g:4452:2: ()
            // InternalReactionRules.g:4452:3: 
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
    // InternalReactionRules.g:4460:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4464:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalReactionRules.g:4465:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
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
    // InternalReactionRules.g:4472:1: rule__Pattern__Group__1__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4476:1: ( ( '{' ) )
            // InternalReactionRules.g:4477:1: ( '{' )
            {
            // InternalReactionRules.g:4477:1: ( '{' )
            // InternalReactionRules.g:4478:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalReactionRules.g:4487:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4491:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalReactionRules.g:4492:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
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
    // InternalReactionRules.g:4499:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__Group_2__0 )? ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4503:1: ( ( ( rule__Pattern__Group_2__0 )? ) )
            // InternalReactionRules.g:4504:1: ( ( rule__Pattern__Group_2__0 )? )
            {
            // InternalReactionRules.g:4504:1: ( ( rule__Pattern__Group_2__0 )? )
            // InternalReactionRules.g:4505:2: ( rule__Pattern__Group_2__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_2()); 
            // InternalReactionRules.g:4506:2: ( rule__Pattern__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalReactionRules.g:4506:3: rule__Pattern__Group_2__0
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
    // InternalReactionRules.g:4514:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4518:1: ( rule__Pattern__Group__3__Impl )
            // InternalReactionRules.g:4519:2: rule__Pattern__Group__3__Impl
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
    // InternalReactionRules.g:4525:1: rule__Pattern__Group__3__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4529:1: ( ( '}' ) )
            // InternalReactionRules.g:4530:1: ( '}' )
            {
            // InternalReactionRules.g:4530:1: ( '}' )
            // InternalReactionRules.g:4531:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalReactionRules.g:4541:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4545:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalReactionRules.g:4546:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
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
    // InternalReactionRules.g:4553:1: rule__Pattern__Group_2__0__Impl : ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4557:1: ( ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) ) )
            // InternalReactionRules.g:4558:1: ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) )
            {
            // InternalReactionRules.g:4558:1: ( ( rule__Pattern__AgentPatternsAssignment_2_0 ) )
            // InternalReactionRules.g:4559:2: ( rule__Pattern__AgentPatternsAssignment_2_0 )
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAssignment_2_0()); 
            // InternalReactionRules.g:4560:2: ( rule__Pattern__AgentPatternsAssignment_2_0 )
            // InternalReactionRules.g:4560:3: rule__Pattern__AgentPatternsAssignment_2_0
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
    // InternalReactionRules.g:4568:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4572:1: ( rule__Pattern__Group_2__1__Impl )
            // InternalReactionRules.g:4573:2: rule__Pattern__Group_2__1__Impl
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
    // InternalReactionRules.g:4579:1: rule__Pattern__Group_2__1__Impl : ( ( rule__Pattern__Group_2_1__0 )* ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4583:1: ( ( ( rule__Pattern__Group_2_1__0 )* ) )
            // InternalReactionRules.g:4584:1: ( ( rule__Pattern__Group_2_1__0 )* )
            {
            // InternalReactionRules.g:4584:1: ( ( rule__Pattern__Group_2_1__0 )* )
            // InternalReactionRules.g:4585:2: ( rule__Pattern__Group_2_1__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1()); 
            // InternalReactionRules.g:4586:2: ( rule__Pattern__Group_2_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==27) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalReactionRules.g:4586:3: rule__Pattern__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Pattern__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalReactionRules.g:4595:1: rule__Pattern__Group_2_1__0 : rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 ;
    public final void rule__Pattern__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4599:1: ( rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 )
            // InternalReactionRules.g:4600:2: rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1
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
    // InternalReactionRules.g:4607:1: rule__Pattern__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4611:1: ( ( ',' ) )
            // InternalReactionRules.g:4612:1: ( ',' )
            {
            // InternalReactionRules.g:4612:1: ( ',' )
            // InternalReactionRules.g:4613:2: ','
            {
             before(grammarAccess.getPatternAccess().getCommaKeyword_2_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalReactionRules.g:4622:1: rule__Pattern__Group_2_1__1 : rule__Pattern__Group_2_1__1__Impl ;
    public final void rule__Pattern__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4626:1: ( rule__Pattern__Group_2_1__1__Impl )
            // InternalReactionRules.g:4627:2: rule__Pattern__Group_2_1__1__Impl
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
    // InternalReactionRules.g:4633:1: rule__Pattern__Group_2_1__1__Impl : ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) ) ;
    public final void rule__Pattern__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4637:1: ( ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) ) )
            // InternalReactionRules.g:4638:1: ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) )
            {
            // InternalReactionRules.g:4638:1: ( ( rule__Pattern__AgentPatternsAssignment_2_1_1 ) )
            // InternalReactionRules.g:4639:2: ( rule__Pattern__AgentPatternsAssignment_2_1_1 )
            {
             before(grammarAccess.getPatternAccess().getAgentPatternsAssignment_2_1_1()); 
            // InternalReactionRules.g:4640:2: ( rule__Pattern__AgentPatternsAssignment_2_1_1 )
            // InternalReactionRules.g:4640:3: rule__Pattern__AgentPatternsAssignment_2_1_1
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
    // InternalReactionRules.g:4649:1: rule__Observation__Group__0 : rule__Observation__Group__0__Impl rule__Observation__Group__1 ;
    public final void rule__Observation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4653:1: ( rule__Observation__Group__0__Impl rule__Observation__Group__1 )
            // InternalReactionRules.g:4654:2: rule__Observation__Group__0__Impl rule__Observation__Group__1
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
    // InternalReactionRules.g:4661:1: rule__Observation__Group__0__Impl : ( 'obs' ) ;
    public final void rule__Observation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4665:1: ( ( 'obs' ) )
            // InternalReactionRules.g:4666:1: ( 'obs' )
            {
            // InternalReactionRules.g:4666:1: ( 'obs' )
            // InternalReactionRules.g:4667:2: 'obs'
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
    // InternalReactionRules.g:4676:1: rule__Observation__Group__1 : rule__Observation__Group__1__Impl rule__Observation__Group__2 ;
    public final void rule__Observation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4680:1: ( rule__Observation__Group__1__Impl rule__Observation__Group__2 )
            // InternalReactionRules.g:4681:2: rule__Observation__Group__1__Impl rule__Observation__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalReactionRules.g:4688:1: rule__Observation__Group__1__Impl : ( ( rule__Observation__NameAssignment_1 ) ) ;
    public final void rule__Observation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4692:1: ( ( ( rule__Observation__NameAssignment_1 ) ) )
            // InternalReactionRules.g:4693:1: ( ( rule__Observation__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:4693:1: ( ( rule__Observation__NameAssignment_1 ) )
            // InternalReactionRules.g:4694:2: ( rule__Observation__NameAssignment_1 )
            {
             before(grammarAccess.getObservationAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:4695:2: ( rule__Observation__NameAssignment_1 )
            // InternalReactionRules.g:4695:3: rule__Observation__NameAssignment_1
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
    // InternalReactionRules.g:4703:1: rule__Observation__Group__2 : rule__Observation__Group__2__Impl ;
    public final void rule__Observation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4707:1: ( rule__Observation__Group__2__Impl )
            // InternalReactionRules.g:4708:2: rule__Observation__Group__2__Impl
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
    // InternalReactionRules.g:4714:1: rule__Observation__Group__2__Impl : ( ( rule__Observation__ObservationPatternAssignment_2 ) ) ;
    public final void rule__Observation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4718:1: ( ( ( rule__Observation__ObservationPatternAssignment_2 ) ) )
            // InternalReactionRules.g:4719:1: ( ( rule__Observation__ObservationPatternAssignment_2 ) )
            {
            // InternalReactionRules.g:4719:1: ( ( rule__Observation__ObservationPatternAssignment_2 ) )
            // InternalReactionRules.g:4720:2: ( rule__Observation__ObservationPatternAssignment_2 )
            {
             before(grammarAccess.getObservationAccess().getObservationPatternAssignment_2()); 
            // InternalReactionRules.g:4721:2: ( rule__Observation__ObservationPatternAssignment_2 )
            // InternalReactionRules.g:4721:3: rule__Observation__ObservationPatternAssignment_2
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
    // InternalReactionRules.g:4730:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4734:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // InternalReactionRules.g:4735:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
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
    // InternalReactionRules.g:4742:1: rule__Initial__Group__0__Impl : ( 'init' ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4746:1: ( ( 'init' ) )
            // InternalReactionRules.g:4747:1: ( 'init' )
            {
            // InternalReactionRules.g:4747:1: ( 'init' )
            // InternalReactionRules.g:4748:2: 'init'
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
    // InternalReactionRules.g:4757:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4761:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // InternalReactionRules.g:4762:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalReactionRules.g:4769:1: rule__Initial__Group__1__Impl : ( ( rule__Initial__NameAssignment_1 ) ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4773:1: ( ( ( rule__Initial__NameAssignment_1 ) ) )
            // InternalReactionRules.g:4774:1: ( ( rule__Initial__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:4774:1: ( ( rule__Initial__NameAssignment_1 ) )
            // InternalReactionRules.g:4775:2: ( rule__Initial__NameAssignment_1 )
            {
             before(grammarAccess.getInitialAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:4776:2: ( rule__Initial__NameAssignment_1 )
            // InternalReactionRules.g:4776:3: rule__Initial__NameAssignment_1
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
    // InternalReactionRules.g:4784:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl rule__Initial__Group__3 ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4788:1: ( rule__Initial__Group__2__Impl rule__Initial__Group__3 )
            // InternalReactionRules.g:4789:2: rule__Initial__Group__2__Impl rule__Initial__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalReactionRules.g:4796:1: rule__Initial__Group__2__Impl : ( ( rule__Initial__CountAssignment_2 ) ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4800:1: ( ( ( rule__Initial__CountAssignment_2 ) ) )
            // InternalReactionRules.g:4801:1: ( ( rule__Initial__CountAssignment_2 ) )
            {
            // InternalReactionRules.g:4801:1: ( ( rule__Initial__CountAssignment_2 ) )
            // InternalReactionRules.g:4802:2: ( rule__Initial__CountAssignment_2 )
            {
             before(grammarAccess.getInitialAccess().getCountAssignment_2()); 
            // InternalReactionRules.g:4803:2: ( rule__Initial__CountAssignment_2 )
            // InternalReactionRules.g:4803:3: rule__Initial__CountAssignment_2
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
    // InternalReactionRules.g:4811:1: rule__Initial__Group__3 : rule__Initial__Group__3__Impl ;
    public final void rule__Initial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4815:1: ( rule__Initial__Group__3__Impl )
            // InternalReactionRules.g:4816:2: rule__Initial__Group__3__Impl
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
    // InternalReactionRules.g:4822:1: rule__Initial__Group__3__Impl : ( ( rule__Initial__InitialPatternAssignment_3 ) ) ;
    public final void rule__Initial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4826:1: ( ( ( rule__Initial__InitialPatternAssignment_3 ) ) )
            // InternalReactionRules.g:4827:1: ( ( rule__Initial__InitialPatternAssignment_3 ) )
            {
            // InternalReactionRules.g:4827:1: ( ( rule__Initial__InitialPatternAssignment_3 ) )
            // InternalReactionRules.g:4828:2: ( rule__Initial__InitialPatternAssignment_3 )
            {
             before(grammarAccess.getInitialAccess().getInitialPatternAssignment_3()); 
            // InternalReactionRules.g:4829:2: ( rule__Initial__InitialPatternAssignment_3 )
            // InternalReactionRules.g:4829:3: rule__Initial__InitialPatternAssignment_3
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
    // InternalReactionRules.g:4838:1: rule__RuleVariables__Group__0 : rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1 ;
    public final void rule__RuleVariables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4842:1: ( rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1 )
            // InternalReactionRules.g:4843:2: rule__RuleVariables__Group__0__Impl rule__RuleVariables__Group__1
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
    // InternalReactionRules.g:4850:1: rule__RuleVariables__Group__0__Impl : ( ( rule__RuleVariables__VariablesAssignment_0 ) ) ;
    public final void rule__RuleVariables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4854:1: ( ( ( rule__RuleVariables__VariablesAssignment_0 ) ) )
            // InternalReactionRules.g:4855:1: ( ( rule__RuleVariables__VariablesAssignment_0 ) )
            {
            // InternalReactionRules.g:4855:1: ( ( rule__RuleVariables__VariablesAssignment_0 ) )
            // InternalReactionRules.g:4856:2: ( rule__RuleVariables__VariablesAssignment_0 )
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesAssignment_0()); 
            // InternalReactionRules.g:4857:2: ( rule__RuleVariables__VariablesAssignment_0 )
            // InternalReactionRules.g:4857:3: rule__RuleVariables__VariablesAssignment_0
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
    // InternalReactionRules.g:4865:1: rule__RuleVariables__Group__1 : rule__RuleVariables__Group__1__Impl ;
    public final void rule__RuleVariables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4869:1: ( rule__RuleVariables__Group__1__Impl )
            // InternalReactionRules.g:4870:2: rule__RuleVariables__Group__1__Impl
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
    // InternalReactionRules.g:4876:1: rule__RuleVariables__Group__1__Impl : ( ( rule__RuleVariables__Group_1__0 )* ) ;
    public final void rule__RuleVariables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4880:1: ( ( ( rule__RuleVariables__Group_1__0 )* ) )
            // InternalReactionRules.g:4881:1: ( ( rule__RuleVariables__Group_1__0 )* )
            {
            // InternalReactionRules.g:4881:1: ( ( rule__RuleVariables__Group_1__0 )* )
            // InternalReactionRules.g:4882:2: ( rule__RuleVariables__Group_1__0 )*
            {
             before(grammarAccess.getRuleVariablesAccess().getGroup_1()); 
            // InternalReactionRules.g:4883:2: ( rule__RuleVariables__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalReactionRules.g:4883:3: rule__RuleVariables__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__RuleVariables__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalReactionRules.g:4892:1: rule__RuleVariables__Group_1__0 : rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1 ;
    public final void rule__RuleVariables__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4896:1: ( rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1 )
            // InternalReactionRules.g:4897:2: rule__RuleVariables__Group_1__0__Impl rule__RuleVariables__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalReactionRules.g:4904:1: rule__RuleVariables__Group_1__0__Impl : ( ',' ) ;
    public final void rule__RuleVariables__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4908:1: ( ( ',' ) )
            // InternalReactionRules.g:4909:1: ( ',' )
            {
            // InternalReactionRules.g:4909:1: ( ',' )
            // InternalReactionRules.g:4910:2: ','
            {
             before(grammarAccess.getRuleVariablesAccess().getCommaKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalReactionRules.g:4919:1: rule__RuleVariables__Group_1__1 : rule__RuleVariables__Group_1__1__Impl ;
    public final void rule__RuleVariables__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4923:1: ( rule__RuleVariables__Group_1__1__Impl )
            // InternalReactionRules.g:4924:2: rule__RuleVariables__Group_1__1__Impl
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
    // InternalReactionRules.g:4930:1: rule__RuleVariables__Group_1__1__Impl : ( ( rule__RuleVariables__VariablesAssignment_1_1 ) ) ;
    public final void rule__RuleVariables__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4934:1: ( ( ( rule__RuleVariables__VariablesAssignment_1_1 ) ) )
            // InternalReactionRules.g:4935:1: ( ( rule__RuleVariables__VariablesAssignment_1_1 ) )
            {
            // InternalReactionRules.g:4935:1: ( ( rule__RuleVariables__VariablesAssignment_1_1 ) )
            // InternalReactionRules.g:4936:2: ( rule__RuleVariables__VariablesAssignment_1_1 )
            {
             before(grammarAccess.getRuleVariablesAccess().getVariablesAssignment_1_1()); 
            // InternalReactionRules.g:4937:2: ( rule__RuleVariables__VariablesAssignment_1_1 )
            // InternalReactionRules.g:4937:3: rule__RuleVariables__VariablesAssignment_1_1
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
    // InternalReactionRules.g:4946:1: rule__UnidirectionalRule__Group__0 : rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1 ;
    public final void rule__UnidirectionalRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4950:1: ( rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1 )
            // InternalReactionRules.g:4951:2: rule__UnidirectionalRule__Group__0__Impl rule__UnidirectionalRule__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalReactionRules.g:4958:1: rule__UnidirectionalRule__Group__0__Impl : ( ( rule__UnidirectionalRule__LhsAssignment_0 ) ) ;
    public final void rule__UnidirectionalRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4962:1: ( ( ( rule__UnidirectionalRule__LhsAssignment_0 ) ) )
            // InternalReactionRules.g:4963:1: ( ( rule__UnidirectionalRule__LhsAssignment_0 ) )
            {
            // InternalReactionRules.g:4963:1: ( ( rule__UnidirectionalRule__LhsAssignment_0 ) )
            // InternalReactionRules.g:4964:2: ( rule__UnidirectionalRule__LhsAssignment_0 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getLhsAssignment_0()); 
            // InternalReactionRules.g:4965:2: ( rule__UnidirectionalRule__LhsAssignment_0 )
            // InternalReactionRules.g:4965:3: rule__UnidirectionalRule__LhsAssignment_0
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
    // InternalReactionRules.g:4973:1: rule__UnidirectionalRule__Group__1 : rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2 ;
    public final void rule__UnidirectionalRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4977:1: ( rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2 )
            // InternalReactionRules.g:4978:2: rule__UnidirectionalRule__Group__1__Impl rule__UnidirectionalRule__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalReactionRules.g:4985:1: rule__UnidirectionalRule__Group__1__Impl : ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) ) ;
    public final void rule__UnidirectionalRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:4989:1: ( ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) ) )
            // InternalReactionRules.g:4990:1: ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) )
            {
            // InternalReactionRules.g:4990:1: ( ( rule__UnidirectionalRule__OperatorAssignment_1 ) )
            // InternalReactionRules.g:4991:2: ( rule__UnidirectionalRule__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getOperatorAssignment_1()); 
            // InternalReactionRules.g:4992:2: ( rule__UnidirectionalRule__OperatorAssignment_1 )
            // InternalReactionRules.g:4992:3: rule__UnidirectionalRule__OperatorAssignment_1
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
    // InternalReactionRules.g:5000:1: rule__UnidirectionalRule__Group__2 : rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3 ;
    public final void rule__UnidirectionalRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5004:1: ( rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3 )
            // InternalReactionRules.g:5005:2: rule__UnidirectionalRule__Group__2__Impl rule__UnidirectionalRule__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalReactionRules.g:5012:1: rule__UnidirectionalRule__Group__2__Impl : ( ( rule__UnidirectionalRule__RhsAssignment_2 ) ) ;
    public final void rule__UnidirectionalRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5016:1: ( ( ( rule__UnidirectionalRule__RhsAssignment_2 ) ) )
            // InternalReactionRules.g:5017:1: ( ( rule__UnidirectionalRule__RhsAssignment_2 ) )
            {
            // InternalReactionRules.g:5017:1: ( ( rule__UnidirectionalRule__RhsAssignment_2 ) )
            // InternalReactionRules.g:5018:2: ( rule__UnidirectionalRule__RhsAssignment_2 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getRhsAssignment_2()); 
            // InternalReactionRules.g:5019:2: ( rule__UnidirectionalRule__RhsAssignment_2 )
            // InternalReactionRules.g:5019:3: rule__UnidirectionalRule__RhsAssignment_2
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
    // InternalReactionRules.g:5027:1: rule__UnidirectionalRule__Group__3 : rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4 ;
    public final void rule__UnidirectionalRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5031:1: ( rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4 )
            // InternalReactionRules.g:5032:2: rule__UnidirectionalRule__Group__3__Impl rule__UnidirectionalRule__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalReactionRules.g:5039:1: rule__UnidirectionalRule__Group__3__Impl : ( RULE_AT ) ;
    public final void rule__UnidirectionalRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5043:1: ( ( RULE_AT ) )
            // InternalReactionRules.g:5044:1: ( RULE_AT )
            {
            // InternalReactionRules.g:5044:1: ( RULE_AT )
            // InternalReactionRules.g:5045:2: RULE_AT
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
    // InternalReactionRules.g:5054:1: rule__UnidirectionalRule__Group__4 : rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5 ;
    public final void rule__UnidirectionalRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5058:1: ( rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5 )
            // InternalReactionRules.g:5059:2: rule__UnidirectionalRule__Group__4__Impl rule__UnidirectionalRule__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalReactionRules.g:5066:1: rule__UnidirectionalRule__Group__4__Impl : ( '[' ) ;
    public final void rule__UnidirectionalRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5070:1: ( ( '[' ) )
            // InternalReactionRules.g:5071:1: ( '[' )
            {
            // InternalReactionRules.g:5071:1: ( '[' )
            // InternalReactionRules.g:5072:2: '['
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getLeftSquareBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalReactionRules.g:5081:1: rule__UnidirectionalRule__Group__5 : rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6 ;
    public final void rule__UnidirectionalRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5085:1: ( rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6 )
            // InternalReactionRules.g:5086:2: rule__UnidirectionalRule__Group__5__Impl rule__UnidirectionalRule__Group__6
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
    // InternalReactionRules.g:5093:1: rule__UnidirectionalRule__Group__5__Impl : ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) ) ;
    public final void rule__UnidirectionalRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5097:1: ( ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) ) )
            // InternalReactionRules.g:5098:1: ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) )
            {
            // InternalReactionRules.g:5098:1: ( ( rule__UnidirectionalRule__VariablesAssignment_5 ) )
            // InternalReactionRules.g:5099:2: ( rule__UnidirectionalRule__VariablesAssignment_5 )
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getVariablesAssignment_5()); 
            // InternalReactionRules.g:5100:2: ( rule__UnidirectionalRule__VariablesAssignment_5 )
            // InternalReactionRules.g:5100:3: rule__UnidirectionalRule__VariablesAssignment_5
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
    // InternalReactionRules.g:5108:1: rule__UnidirectionalRule__Group__6 : rule__UnidirectionalRule__Group__6__Impl ;
    public final void rule__UnidirectionalRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5112:1: ( rule__UnidirectionalRule__Group__6__Impl )
            // InternalReactionRules.g:5113:2: rule__UnidirectionalRule__Group__6__Impl
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
    // InternalReactionRules.g:5119:1: rule__UnidirectionalRule__Group__6__Impl : ( ']' ) ;
    public final void rule__UnidirectionalRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5123:1: ( ( ']' ) )
            // InternalReactionRules.g:5124:1: ( ']' )
            {
            // InternalReactionRules.g:5124:1: ( ']' )
            // InternalReactionRules.g:5125:2: ']'
            {
             before(grammarAccess.getUnidirectionalRuleAccess().getRightSquareBracketKeyword_6()); 
            match(input,34,FOLLOW_2); 
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
    // InternalReactionRules.g:5135:1: rule__BidirectionalRule__Group__0 : rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1 ;
    public final void rule__BidirectionalRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5139:1: ( rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1 )
            // InternalReactionRules.g:5140:2: rule__BidirectionalRule__Group__0__Impl rule__BidirectionalRule__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalReactionRules.g:5147:1: rule__BidirectionalRule__Group__0__Impl : ( ( rule__BidirectionalRule__LhsAssignment_0 ) ) ;
    public final void rule__BidirectionalRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5151:1: ( ( ( rule__BidirectionalRule__LhsAssignment_0 ) ) )
            // InternalReactionRules.g:5152:1: ( ( rule__BidirectionalRule__LhsAssignment_0 ) )
            {
            // InternalReactionRules.g:5152:1: ( ( rule__BidirectionalRule__LhsAssignment_0 ) )
            // InternalReactionRules.g:5153:2: ( rule__BidirectionalRule__LhsAssignment_0 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getLhsAssignment_0()); 
            // InternalReactionRules.g:5154:2: ( rule__BidirectionalRule__LhsAssignment_0 )
            // InternalReactionRules.g:5154:3: rule__BidirectionalRule__LhsAssignment_0
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
    // InternalReactionRules.g:5162:1: rule__BidirectionalRule__Group__1 : rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2 ;
    public final void rule__BidirectionalRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5166:1: ( rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2 )
            // InternalReactionRules.g:5167:2: rule__BidirectionalRule__Group__1__Impl rule__BidirectionalRule__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalReactionRules.g:5174:1: rule__BidirectionalRule__Group__1__Impl : ( ( rule__BidirectionalRule__OperatorAssignment_1 ) ) ;
    public final void rule__BidirectionalRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5178:1: ( ( ( rule__BidirectionalRule__OperatorAssignment_1 ) ) )
            // InternalReactionRules.g:5179:1: ( ( rule__BidirectionalRule__OperatorAssignment_1 ) )
            {
            // InternalReactionRules.g:5179:1: ( ( rule__BidirectionalRule__OperatorAssignment_1 ) )
            // InternalReactionRules.g:5180:2: ( rule__BidirectionalRule__OperatorAssignment_1 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getOperatorAssignment_1()); 
            // InternalReactionRules.g:5181:2: ( rule__BidirectionalRule__OperatorAssignment_1 )
            // InternalReactionRules.g:5181:3: rule__BidirectionalRule__OperatorAssignment_1
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
    // InternalReactionRules.g:5189:1: rule__BidirectionalRule__Group__2 : rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3 ;
    public final void rule__BidirectionalRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5193:1: ( rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3 )
            // InternalReactionRules.g:5194:2: rule__BidirectionalRule__Group__2__Impl rule__BidirectionalRule__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalReactionRules.g:5201:1: rule__BidirectionalRule__Group__2__Impl : ( ( rule__BidirectionalRule__RhsAssignment_2 ) ) ;
    public final void rule__BidirectionalRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5205:1: ( ( ( rule__BidirectionalRule__RhsAssignment_2 ) ) )
            // InternalReactionRules.g:5206:1: ( ( rule__BidirectionalRule__RhsAssignment_2 ) )
            {
            // InternalReactionRules.g:5206:1: ( ( rule__BidirectionalRule__RhsAssignment_2 ) )
            // InternalReactionRules.g:5207:2: ( rule__BidirectionalRule__RhsAssignment_2 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getRhsAssignment_2()); 
            // InternalReactionRules.g:5208:2: ( rule__BidirectionalRule__RhsAssignment_2 )
            // InternalReactionRules.g:5208:3: rule__BidirectionalRule__RhsAssignment_2
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
    // InternalReactionRules.g:5216:1: rule__BidirectionalRule__Group__3 : rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4 ;
    public final void rule__BidirectionalRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5220:1: ( rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4 )
            // InternalReactionRules.g:5221:2: rule__BidirectionalRule__Group__3__Impl rule__BidirectionalRule__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalReactionRules.g:5228:1: rule__BidirectionalRule__Group__3__Impl : ( RULE_AT ) ;
    public final void rule__BidirectionalRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5232:1: ( ( RULE_AT ) )
            // InternalReactionRules.g:5233:1: ( RULE_AT )
            {
            // InternalReactionRules.g:5233:1: ( RULE_AT )
            // InternalReactionRules.g:5234:2: RULE_AT
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
    // InternalReactionRules.g:5243:1: rule__BidirectionalRule__Group__4 : rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5 ;
    public final void rule__BidirectionalRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5247:1: ( rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5 )
            // InternalReactionRules.g:5248:2: rule__BidirectionalRule__Group__4__Impl rule__BidirectionalRule__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalReactionRules.g:5255:1: rule__BidirectionalRule__Group__4__Impl : ( '[' ) ;
    public final void rule__BidirectionalRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5259:1: ( ( '[' ) )
            // InternalReactionRules.g:5260:1: ( '[' )
            {
            // InternalReactionRules.g:5260:1: ( '[' )
            // InternalReactionRules.g:5261:2: '['
            {
             before(grammarAccess.getBidirectionalRuleAccess().getLeftSquareBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalReactionRules.g:5270:1: rule__BidirectionalRule__Group__5 : rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6 ;
    public final void rule__BidirectionalRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5274:1: ( rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6 )
            // InternalReactionRules.g:5275:2: rule__BidirectionalRule__Group__5__Impl rule__BidirectionalRule__Group__6
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
    // InternalReactionRules.g:5282:1: rule__BidirectionalRule__Group__5__Impl : ( ( rule__BidirectionalRule__VariablesAssignment_5 ) ) ;
    public final void rule__BidirectionalRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5286:1: ( ( ( rule__BidirectionalRule__VariablesAssignment_5 ) ) )
            // InternalReactionRules.g:5287:1: ( ( rule__BidirectionalRule__VariablesAssignment_5 ) )
            {
            // InternalReactionRules.g:5287:1: ( ( rule__BidirectionalRule__VariablesAssignment_5 ) )
            // InternalReactionRules.g:5288:2: ( rule__BidirectionalRule__VariablesAssignment_5 )
            {
             before(grammarAccess.getBidirectionalRuleAccess().getVariablesAssignment_5()); 
            // InternalReactionRules.g:5289:2: ( rule__BidirectionalRule__VariablesAssignment_5 )
            // InternalReactionRules.g:5289:3: rule__BidirectionalRule__VariablesAssignment_5
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
    // InternalReactionRules.g:5297:1: rule__BidirectionalRule__Group__6 : rule__BidirectionalRule__Group__6__Impl ;
    public final void rule__BidirectionalRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5301:1: ( rule__BidirectionalRule__Group__6__Impl )
            // InternalReactionRules.g:5302:2: rule__BidirectionalRule__Group__6__Impl
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
    // InternalReactionRules.g:5308:1: rule__BidirectionalRule__Group__6__Impl : ( ']' ) ;
    public final void rule__BidirectionalRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5312:1: ( ( ']' ) )
            // InternalReactionRules.g:5313:1: ( ']' )
            {
            // InternalReactionRules.g:5313:1: ( ']' )
            // InternalReactionRules.g:5314:2: ']'
            {
             before(grammarAccess.getBidirectionalRuleAccess().getRightSquareBracketKeyword_6()); 
            match(input,34,FOLLOW_2); 
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
    // InternalReactionRules.g:5324:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5328:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalReactionRules.g:5329:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalReactionRules.g:5336:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5340:1: ( ( 'rule' ) )
            // InternalReactionRules.g:5341:1: ( 'rule' )
            {
            // InternalReactionRules.g:5341:1: ( 'rule' )
            // InternalReactionRules.g:5342:2: 'rule'
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
    // InternalReactionRules.g:5351:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5355:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalReactionRules.g:5356:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalReactionRules.g:5363:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5367:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalReactionRules.g:5368:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalReactionRules.g:5368:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalReactionRules.g:5369:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalReactionRules.g:5370:2: ( rule__Rule__NameAssignment_1 )
            // InternalReactionRules.g:5370:3: rule__Rule__NameAssignment_1
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
    // InternalReactionRules.g:5378:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5382:1: ( rule__Rule__Group__2__Impl )
            // InternalReactionRules.g:5383:2: rule__Rule__Group__2__Impl
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
    // InternalReactionRules.g:5389:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__RuleAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5393:1: ( ( ( rule__Rule__RuleAssignment_2 ) ) )
            // InternalReactionRules.g:5394:1: ( ( rule__Rule__RuleAssignment_2 ) )
            {
            // InternalReactionRules.g:5394:1: ( ( rule__Rule__RuleAssignment_2 ) )
            // InternalReactionRules.g:5395:2: ( rule__Rule__RuleAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getRuleAssignment_2()); 
            // InternalReactionRules.g:5396:2: ( rule__Rule__RuleAssignment_2 )
            // InternalReactionRules.g:5396:3: rule__Rule__RuleAssignment_2
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
    // InternalReactionRules.g:5405:1: rule__ReactionRuleModel__ModelAssignment_0 : ( ruleModel ) ;
    public final void rule__ReactionRuleModel__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5409:1: ( ( ruleModel ) )
            // InternalReactionRules.g:5410:2: ( ruleModel )
            {
            // InternalReactionRules.g:5410:2: ( ruleModel )
            // InternalReactionRules.g:5411:3: ruleModel
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
    // InternalReactionRules.g:5420:1: rule__ReactionRuleModel__ReactionContainerAssignment_1 : ( ruleReactionContainer ) ;
    public final void rule__ReactionRuleModel__ReactionContainerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5424:1: ( ( ruleReactionContainer ) )
            // InternalReactionRules.g:5425:2: ( ruleReactionContainer )
            {
            // InternalReactionRules.g:5425:2: ( ruleReactionContainer )
            // InternalReactionRules.g:5426:3: ruleReactionContainer
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
    // InternalReactionRules.g:5435:1: rule__ReactionRuleModel__ReactionPropertiesAssignment_2 : ( ruleReactionProperty ) ;
    public final void rule__ReactionRuleModel__ReactionPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5439:1: ( ( ruleReactionProperty ) )
            // InternalReactionRules.g:5440:2: ( ruleReactionProperty )
            {
            // InternalReactionRules.g:5440:2: ( ruleReactionProperty )
            // InternalReactionRules.g:5441:3: ruleReactionProperty
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
    // InternalReactionRules.g:5450:1: rule__ModelUri__UriAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ModelUri__UriAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5454:1: ( ( RULE_STRING ) )
            // InternalReactionRules.g:5455:2: ( RULE_STRING )
            {
            // InternalReactionRules.g:5455:2: ( RULE_STRING )
            // InternalReactionRules.g:5456:3: RULE_STRING
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
    // InternalReactionRules.g:5465:1: rule__ModelPath__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ModelPath__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5469:1: ( ( RULE_STRING ) )
            // InternalReactionRules.g:5470:2: ( RULE_STRING )
            {
            // InternalReactionRules.g:5470:2: ( RULE_STRING )
            // InternalReactionRules.g:5471:3: RULE_STRING
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
    // InternalReactionRules.g:5480:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5484:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5485:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5485:2: ( RULE_ID )
            // InternalReactionRules.g:5486:3: RULE_ID
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
    // InternalReactionRules.g:5495:1: rule__Model__LocationAssignment_2 : ( ruleModelLocation ) ;
    public final void rule__Model__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5499:1: ( ( ruleModelLocation ) )
            // InternalReactionRules.g:5500:2: ( ruleModelLocation )
            {
            // InternalReactionRules.g:5500:2: ( ruleModelLocation )
            // InternalReactionRules.g:5501:3: ruleModelLocation
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
    // InternalReactionRules.g:5510:1: rule__ReactionContainer__AgentInstancesAssignment_1 : ( ruleAgentInstance ) ;
    public final void rule__ReactionContainer__AgentInstancesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5514:1: ( ( ruleAgentInstance ) )
            // InternalReactionRules.g:5515:2: ( ruleAgentInstance )
            {
            // InternalReactionRules.g:5515:2: ( ruleAgentInstance )
            // InternalReactionRules.g:5516:3: ruleAgentInstance
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
    // InternalReactionRules.g:5525:1: rule__AgentInstanceSiteState__SiteAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstanceSiteState__SiteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5529:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5530:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5530:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5531:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceSiteStateAccess().getSiteSiteCrossReference_0_0()); 
            // InternalReactionRules.g:5532:3: ( RULE_ID )
            // InternalReactionRules.g:5533:4: RULE_ID
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
    // InternalReactionRules.g:5544:1: rule__AgentInstanceSiteState__SiteStateAssignment_1 : ( ruleSiteState ) ;
    public final void rule__AgentInstanceSiteState__SiteStateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5548:1: ( ( ruleSiteState ) )
            // InternalReactionRules.g:5549:2: ( ruleSiteState )
            {
            // InternalReactionRules.g:5549:2: ( ruleSiteState )
            // InternalReactionRules.g:5550:3: ruleSiteState
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
    // InternalReactionRules.g:5559:1: rule__AgentInstanceLinkState__SiteAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstanceLinkState__SiteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5563:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5564:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5564:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5565:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getSiteSiteCrossReference_0_0()); 
            // InternalReactionRules.g:5566:3: ( RULE_ID )
            // InternalReactionRules.g:5567:4: RULE_ID
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
    // InternalReactionRules.g:5578:1: rule__AgentInstanceLinkState__AttachedSiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstanceLinkState__AttachedSiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5582:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5583:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5583:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5584:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedSiteSiteCrossReference_1_0()); 
            // InternalReactionRules.g:5585:3: ( RULE_ID )
            // InternalReactionRules.g:5586:4: RULE_ID
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
    // InternalReactionRules.g:5597:1: rule__AgentInstanceLinkState__AttachedAgentAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstanceLinkState__AttachedAgentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5601:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5602:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5602:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5603:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentAgentCrossReference_2_0()); 
            // InternalReactionRules.g:5604:3: ( RULE_ID )
            // InternalReactionRules.g:5605:4: RULE_ID
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
    // InternalReactionRules.g:5616:1: rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstanceLinkState__AttachedAgentInstanceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5620:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5621:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5621:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5622:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceLinkStateAccess().getAttachedAgentInstanceAgentInstanceCrossReference_3_0()); 
            // InternalReactionRules.g:5623:3: ( RULE_ID )
            // InternalReactionRules.g:5624:4: RULE_ID
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
    // InternalReactionRules.g:5635:1: rule__AgentInstanceLinkState__LinkStateAssignment_4 : ( ruleLinkState ) ;
    public final void rule__AgentInstanceLinkState__LinkStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5639:1: ( ( ruleLinkState ) )
            // InternalReactionRules.g:5640:2: ( ruleLinkState )
            {
            // InternalReactionRules.g:5640:2: ( ruleLinkState )
            // InternalReactionRules.g:5641:3: ruleLinkState
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
    // InternalReactionRules.g:5650:1: rule__AgentInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AgentInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5654:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5655:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5655:2: ( RULE_ID )
            // InternalReactionRules.g:5656:3: RULE_ID
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
    // InternalReactionRules.g:5665:1: rule__AgentInstance__AgentAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstance__AgentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5669:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5670:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5670:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5671:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceAccess().getAgentAgentCrossReference_2_0()); 
            // InternalReactionRules.g:5672:3: ( RULE_ID )
            // InternalReactionRules.g:5673:4: RULE_ID
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
    // InternalReactionRules.g:5684:1: rule__AgentInstance__SiteStatesAssignment_3 : ( ruleAgentInstanceSiteState ) ;
    public final void rule__AgentInstance__SiteStatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5688:1: ( ( ruleAgentInstanceSiteState ) )
            // InternalReactionRules.g:5689:2: ( ruleAgentInstanceSiteState )
            {
            // InternalReactionRules.g:5689:2: ( ruleAgentInstanceSiteState )
            // InternalReactionRules.g:5690:3: ruleAgentInstanceSiteState
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
    // InternalReactionRules.g:5699:1: rule__AgentInstance__LinkStatesAssignment_4 : ( ruleAgentInstanceLinkState ) ;
    public final void rule__AgentInstance__LinkStatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5703:1: ( ( ruleAgentInstanceLinkState ) )
            // InternalReactionRules.g:5704:2: ( ruleAgentInstanceLinkState )
            {
            // InternalReactionRules.g:5704:2: ( ruleAgentInstanceLinkState )
            // InternalReactionRules.g:5705:3: ruleAgentInstanceLinkState
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
    // InternalReactionRules.g:5714:1: rule__ArithmeticValue__ValueAssignment : ( ruleArithmeticType ) ;
    public final void rule__ArithmeticValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5718:1: ( ( ruleArithmeticType ) )
            // InternalReactionRules.g:5719:2: ( ruleArithmeticType )
            {
            // InternalReactionRules.g:5719:2: ( ruleArithmeticType )
            // InternalReactionRules.g:5720:3: ruleArithmeticType
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
    // InternalReactionRules.g:5729:1: rule__State__NameAssignment : ( RULE_ID ) ;
    public final void rule__State__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5733:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5734:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5734:2: ( RULE_ID )
            // InternalReactionRules.g:5735:3: RULE_ID
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
    // InternalReactionRules.g:5744:1: rule__States__StateAssignment_1_1 : ( ruleState ) ;
    public final void rule__States__StateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5748:1: ( ( ruleState ) )
            // InternalReactionRules.g:5749:2: ( ruleState )
            {
            // InternalReactionRules.g:5749:2: ( ruleState )
            // InternalReactionRules.g:5750:3: ruleState
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
    // InternalReactionRules.g:5759:1: rule__States__StateAssignment_1_2_1 : ( ruleState ) ;
    public final void rule__States__StateAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5763:1: ( ( ruleState ) )
            // InternalReactionRules.g:5764:2: ( ruleState )
            {
            // InternalReactionRules.g:5764:2: ( ruleState )
            // InternalReactionRules.g:5765:3: ruleState
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
    // InternalReactionRules.g:5774:1: rule__Site__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Site__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5778:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5779:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5779:2: ( RULE_ID )
            // InternalReactionRules.g:5780:3: RULE_ID
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
    // InternalReactionRules.g:5789:1: rule__Site__StatesAssignment_1 : ( ruleStates ) ;
    public final void rule__Site__StatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5793:1: ( ( ruleStates ) )
            // InternalReactionRules.g:5794:2: ( ruleStates )
            {
            // InternalReactionRules.g:5794:2: ( ruleStates )
            // InternalReactionRules.g:5795:3: ruleStates
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
    // InternalReactionRules.g:5804:1: rule__Sites__SitesAssignment_1_1 : ( ruleSite ) ;
    public final void rule__Sites__SitesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5808:1: ( ( ruleSite ) )
            // InternalReactionRules.g:5809:2: ( ruleSite )
            {
            // InternalReactionRules.g:5809:2: ( ruleSite )
            // InternalReactionRules.g:5810:3: ruleSite
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
    // InternalReactionRules.g:5819:1: rule__Sites__SitesAssignment_1_2_1 : ( ruleSite ) ;
    public final void rule__Sites__SitesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5823:1: ( ( ruleSite ) )
            // InternalReactionRules.g:5824:2: ( ruleSite )
            {
            // InternalReactionRules.g:5824:2: ( ruleSite )
            // InternalReactionRules.g:5825:3: ruleSite
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
    // InternalReactionRules.g:5834:1: rule__Agent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5838:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5839:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5839:2: ( RULE_ID )
            // InternalReactionRules.g:5840:3: RULE_ID
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
    // InternalReactionRules.g:5849:1: rule__Agent__SitesAssignment_2 : ( ruleSites ) ;
    public final void rule__Agent__SitesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5853:1: ( ( ruleSites ) )
            // InternalReactionRules.g:5854:2: ( ruleSites )
            {
            // InternalReactionRules.g:5854:2: ( ruleSites )
            // InternalReactionRules.g:5855:3: ruleSites
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
    // InternalReactionRules.g:5864:1: rule__PatternVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PatternVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5868:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5869:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5869:2: ( RULE_ID )
            // InternalReactionRules.g:5870:3: RULE_ID
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
    // InternalReactionRules.g:5879:1: rule__PatternVariable__PatternAssignment_3 : ( rulePattern ) ;
    public final void rule__PatternVariable__PatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5883:1: ( ( rulePattern ) )
            // InternalReactionRules.g:5884:2: ( rulePattern )
            {
            // InternalReactionRules.g:5884:2: ( rulePattern )
            // InternalReactionRules.g:5885:3: rulePattern
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
    // InternalReactionRules.g:5894:1: rule__ArithmeticVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ArithmeticVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5898:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:5899:2: ( RULE_ID )
            {
            // InternalReactionRules.g:5899:2: ( RULE_ID )
            // InternalReactionRules.g:5900:3: RULE_ID
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
    // InternalReactionRules.g:5909:1: rule__ArithmeticVariable__ValueAssignment_3 : ( ruleArithmeticValue ) ;
    public final void rule__ArithmeticVariable__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5913:1: ( ( ruleArithmeticValue ) )
            // InternalReactionRules.g:5914:2: ( ruleArithmeticValue )
            {
            // InternalReactionRules.g:5914:2: ( ruleArithmeticValue )
            // InternalReactionRules.g:5915:3: ruleArithmeticValue
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
    // InternalReactionRules.g:5924:1: rule__SemiLink__NameAssignment_1 : ( RULE_SEMI_LINK ) ;
    public final void rule__SemiLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5928:1: ( ( RULE_SEMI_LINK ) )
            // InternalReactionRules.g:5929:2: ( RULE_SEMI_LINK )
            {
            // InternalReactionRules.g:5929:2: ( RULE_SEMI_LINK )
            // InternalReactionRules.g:5930:3: RULE_SEMI_LINK
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
    // InternalReactionRules.g:5939:1: rule__FreeLink__NameAssignment_1 : ( RULE_FREE_LINK ) ;
    public final void rule__FreeLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5943:1: ( ( RULE_FREE_LINK ) )
            // InternalReactionRules.g:5944:2: ( RULE_FREE_LINK )
            {
            // InternalReactionRules.g:5944:2: ( RULE_FREE_LINK )
            // InternalReactionRules.g:5945:3: RULE_FREE_LINK
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
    // InternalReactionRules.g:5954:1: rule__WhatEver__NameAssignment_1 : ( RULE_WHATEVER_LINK ) ;
    public final void rule__WhatEver__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5958:1: ( ( RULE_WHATEVER_LINK ) )
            // InternalReactionRules.g:5959:2: ( RULE_WHATEVER_LINK )
            {
            // InternalReactionRules.g:5959:2: ( RULE_WHATEVER_LINK )
            // InternalReactionRules.g:5960:3: RULE_WHATEVER_LINK
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
    // InternalReactionRules.g:5969:1: rule__IndexedLink__StateAssignment_1 : ( ruleUnsignedInteger ) ;
    public final void rule__IndexedLink__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5973:1: ( ( ruleUnsignedInteger ) )
            // InternalReactionRules.g:5974:2: ( ruleUnsignedInteger )
            {
            // InternalReactionRules.g:5974:2: ( ruleUnsignedInteger )
            // InternalReactionRules.g:5975:3: ruleUnsignedInteger
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
    // InternalReactionRules.g:5984:1: rule__ExactLinkAgent__AgentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExactLinkAgent__AgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:5988:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:5989:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:5989:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:5990:3: ( RULE_ID )
            {
             before(grammarAccess.getExactLinkAgentAccess().getAgentAgentCrossReference_1_0()); 
            // InternalReactionRules.g:5991:3: ( RULE_ID )
            // InternalReactionRules.g:5992:4: RULE_ID
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
    // InternalReactionRules.g:6003:1: rule__ExactLinkSite__SiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExactLinkSite__SiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6007:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6008:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6008:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6009:3: ( RULE_ID )
            {
             before(grammarAccess.getExactLinkSiteAccess().getSiteSiteCrossReference_1_0()); 
            // InternalReactionRules.g:6010:3: ( RULE_ID )
            // InternalReactionRules.g:6011:4: RULE_ID
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
    // InternalReactionRules.g:6022:1: rule__ExactLink__LinkAgentAssignment_1 : ( ruleExactLinkAgent ) ;
    public final void rule__ExactLink__LinkAgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6026:1: ( ( ruleExactLinkAgent ) )
            // InternalReactionRules.g:6027:2: ( ruleExactLinkAgent )
            {
            // InternalReactionRules.g:6027:2: ( ruleExactLinkAgent )
            // InternalReactionRules.g:6028:3: ruleExactLinkAgent
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
    // InternalReactionRules.g:6037:1: rule__ExactLink__LinkSiteAssignment_3 : ( ruleExactLinkSite ) ;
    public final void rule__ExactLink__LinkSiteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6041:1: ( ( ruleExactLinkSite ) )
            // InternalReactionRules.g:6042:2: ( ruleExactLinkSite )
            {
            // InternalReactionRules.g:6042:2: ( ruleExactLinkSite )
            // InternalReactionRules.g:6043:3: ruleExactLinkSite
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
    // InternalReactionRules.g:6052:1: rule__SiteState__StateAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SiteState__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6056:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6057:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6057:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6058:3: ( RULE_ID )
            {
             before(grammarAccess.getSiteStateAccess().getStateStateCrossReference_1_0()); 
            // InternalReactionRules.g:6059:3: ( RULE_ID )
            // InternalReactionRules.g:6060:4: RULE_ID
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
    // InternalReactionRules.g:6071:1: rule__LinkState__LinkStateAssignment_1 : ( ( rule__LinkState__LinkStateAlternatives_1_0 ) ) ;
    public final void rule__LinkState__LinkStateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6075:1: ( ( ( rule__LinkState__LinkStateAlternatives_1_0 ) ) )
            // InternalReactionRules.g:6076:2: ( ( rule__LinkState__LinkStateAlternatives_1_0 ) )
            {
            // InternalReactionRules.g:6076:2: ( ( rule__LinkState__LinkStateAlternatives_1_0 ) )
            // InternalReactionRules.g:6077:3: ( rule__LinkState__LinkStateAlternatives_1_0 )
            {
             before(grammarAccess.getLinkStateAccess().getLinkStateAlternatives_1_0()); 
            // InternalReactionRules.g:6078:3: ( rule__LinkState__LinkStateAlternatives_1_0 )
            // InternalReactionRules.g:6078:4: rule__LinkState__LinkStateAlternatives_1_0
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
    // InternalReactionRules.g:6086:1: rule__SitePattern__SiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SitePattern__SiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6090:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6091:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6091:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6092:3: ( RULE_ID )
            {
             before(grammarAccess.getSitePatternAccess().getSiteSiteCrossReference_1_0()); 
            // InternalReactionRules.g:6093:3: ( RULE_ID )
            // InternalReactionRules.g:6094:4: RULE_ID
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
    // InternalReactionRules.g:6105:1: rule__SitePattern__StateAssignment_2_1 : ( ruleSiteState ) ;
    public final void rule__SitePattern__StateAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6109:1: ( ( ruleSiteState ) )
            // InternalReactionRules.g:6110:2: ( ruleSiteState )
            {
            // InternalReactionRules.g:6110:2: ( ruleSiteState )
            // InternalReactionRules.g:6111:3: ruleSiteState
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
    // InternalReactionRules.g:6120:1: rule__SitePattern__LinkStateAssignment_4 : ( ruleLinkState ) ;
    public final void rule__SitePattern__LinkStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6124:1: ( ( ruleLinkState ) )
            // InternalReactionRules.g:6125:2: ( ruleLinkState )
            {
            // InternalReactionRules.g:6125:2: ( ruleLinkState )
            // InternalReactionRules.g:6126:3: ruleLinkState
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
    // InternalReactionRules.g:6135:1: rule__SitePatterns__SitePatternsAssignment_1_0 : ( ruleSitePattern ) ;
    public final void rule__SitePatterns__SitePatternsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6139:1: ( ( ruleSitePattern ) )
            // InternalReactionRules.g:6140:2: ( ruleSitePattern )
            {
            // InternalReactionRules.g:6140:2: ( ruleSitePattern )
            // InternalReactionRules.g:6141:3: ruleSitePattern
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
    // InternalReactionRules.g:6150:1: rule__SitePatterns__SitePatternsAssignment_1_1_1 : ( ruleSitePattern ) ;
    public final void rule__SitePatterns__SitePatternsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6154:1: ( ( ruleSitePattern ) )
            // InternalReactionRules.g:6155:2: ( ruleSitePattern )
            {
            // InternalReactionRules.g:6155:2: ( ruleSitePattern )
            // InternalReactionRules.g:6156:3: ruleSitePattern
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
    // InternalReactionRules.g:6165:1: rule__AgentPattern__AgentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AgentPattern__AgentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6169:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6170:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6170:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6171:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentPatternAccess().getAgentAgentCrossReference_1_0()); 
            // InternalReactionRules.g:6172:3: ( RULE_ID )
            // InternalReactionRules.g:6173:4: RULE_ID
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
    // InternalReactionRules.g:6184:1: rule__AgentPattern__SitePatternsAssignment_3 : ( ruleSitePatterns ) ;
    public final void rule__AgentPattern__SitePatternsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6188:1: ( ( ruleSitePatterns ) )
            // InternalReactionRules.g:6189:2: ( ruleSitePatterns )
            {
            // InternalReactionRules.g:6189:2: ( ruleSitePatterns )
            // InternalReactionRules.g:6190:3: ruleSitePatterns
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
    // InternalReactionRules.g:6199:1: rule__Pattern__AgentPatternsAssignment_2_0 : ( ruleAgentPattern ) ;
    public final void rule__Pattern__AgentPatternsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6203:1: ( ( ruleAgentPattern ) )
            // InternalReactionRules.g:6204:2: ( ruleAgentPattern )
            {
            // InternalReactionRules.g:6204:2: ( ruleAgentPattern )
            // InternalReactionRules.g:6205:3: ruleAgentPattern
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
    // InternalReactionRules.g:6214:1: rule__Pattern__AgentPatternsAssignment_2_1_1 : ( ruleAgentPattern ) ;
    public final void rule__Pattern__AgentPatternsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6218:1: ( ( ruleAgentPattern ) )
            // InternalReactionRules.g:6219:2: ( ruleAgentPattern )
            {
            // InternalReactionRules.g:6219:2: ( ruleAgentPattern )
            // InternalReactionRules.g:6220:3: ruleAgentPattern
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
    // InternalReactionRules.g:6229:1: rule__Observation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Observation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6233:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6234:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6234:2: ( RULE_ID )
            // InternalReactionRules.g:6235:3: RULE_ID
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
    // InternalReactionRules.g:6244:1: rule__Observation__ObservationPatternAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__Observation__ObservationPatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6248:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6249:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6249:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6250:3: rulePatternAssignment
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
    // InternalReactionRules.g:6259:1: rule__NumericFromLiteral__ValueAssignment : ( ruleArithmeticValue ) ;
    public final void rule__NumericFromLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6263:1: ( ( ruleArithmeticValue ) )
            // InternalReactionRules.g:6264:2: ( ruleArithmeticValue )
            {
            // InternalReactionRules.g:6264:2: ( ruleArithmeticValue )
            // InternalReactionRules.g:6265:3: ruleArithmeticValue
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
    // InternalReactionRules.g:6274:1: rule__NumericFromVariable__ValueVarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NumericFromVariable__ValueVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6278:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6279:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6279:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6280:3: ( RULE_ID )
            {
             before(grammarAccess.getNumericFromVariableAccess().getValueVarArithmeticVariableCrossReference_0()); 
            // InternalReactionRules.g:6281:3: ( RULE_ID )
            // InternalReactionRules.g:6282:4: RULE_ID
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
    // InternalReactionRules.g:6293:1: rule__Initial__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Initial__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6297:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6298:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6298:2: ( RULE_ID )
            // InternalReactionRules.g:6299:3: RULE_ID
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
    // InternalReactionRules.g:6308:1: rule__Initial__CountAssignment_2 : ( ruleNumericAssignment ) ;
    public final void rule__Initial__CountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6312:1: ( ( ruleNumericAssignment ) )
            // InternalReactionRules.g:6313:2: ( ruleNumericAssignment )
            {
            // InternalReactionRules.g:6313:2: ( ruleNumericAssignment )
            // InternalReactionRules.g:6314:3: ruleNumericAssignment
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
    // InternalReactionRules.g:6323:1: rule__Initial__InitialPatternAssignment_3 : ( rulePatternAssignment ) ;
    public final void rule__Initial__InitialPatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6327:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6328:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6328:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6329:3: rulePatternAssignment
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
    // InternalReactionRules.g:6338:1: rule__AssignFromPattern__PatternAssignment : ( rulePattern ) ;
    public final void rule__AssignFromPattern__PatternAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6342:1: ( ( rulePattern ) )
            // InternalReactionRules.g:6343:2: ( rulePattern )
            {
            // InternalReactionRules.g:6343:2: ( rulePattern )
            // InternalReactionRules.g:6344:3: rulePattern
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
    // InternalReactionRules.g:6353:1: rule__AssignFromVariable__PatternVarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__AssignFromVariable__PatternVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6357:1: ( ( ( RULE_ID ) ) )
            // InternalReactionRules.g:6358:2: ( ( RULE_ID ) )
            {
            // InternalReactionRules.g:6358:2: ( ( RULE_ID ) )
            // InternalReactionRules.g:6359:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignFromVariableAccess().getPatternVarPatternVariableCrossReference_0()); 
            // InternalReactionRules.g:6360:3: ( RULE_ID )
            // InternalReactionRules.g:6361:4: RULE_ID
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
    // InternalReactionRules.g:6372:1: rule__RuleVariables__VariablesAssignment_0 : ( ruleNumericAssignment ) ;
    public final void rule__RuleVariables__VariablesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6376:1: ( ( ruleNumericAssignment ) )
            // InternalReactionRules.g:6377:2: ( ruleNumericAssignment )
            {
            // InternalReactionRules.g:6377:2: ( ruleNumericAssignment )
            // InternalReactionRules.g:6378:3: ruleNumericAssignment
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
    // InternalReactionRules.g:6387:1: rule__RuleVariables__VariablesAssignment_1_1 : ( ruleNumericAssignment ) ;
    public final void rule__RuleVariables__VariablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6391:1: ( ( ruleNumericAssignment ) )
            // InternalReactionRules.g:6392:2: ( ruleNumericAssignment )
            {
            // InternalReactionRules.g:6392:2: ( ruleNumericAssignment )
            // InternalReactionRules.g:6393:3: ruleNumericAssignment
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
    // InternalReactionRules.g:6402:1: rule__UnidirectionalRule__LhsAssignment_0 : ( rulePatternAssignment ) ;
    public final void rule__UnidirectionalRule__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6406:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6407:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6407:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6408:3: rulePatternAssignment
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
    // InternalReactionRules.g:6417:1: rule__UnidirectionalRule__OperatorAssignment_1 : ( RULE_UNI ) ;
    public final void rule__UnidirectionalRule__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6421:1: ( ( RULE_UNI ) )
            // InternalReactionRules.g:6422:2: ( RULE_UNI )
            {
            // InternalReactionRules.g:6422:2: ( RULE_UNI )
            // InternalReactionRules.g:6423:3: RULE_UNI
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
    // InternalReactionRules.g:6432:1: rule__UnidirectionalRule__RhsAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__UnidirectionalRule__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6436:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6437:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6437:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6438:3: rulePatternAssignment
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
    // InternalReactionRules.g:6447:1: rule__UnidirectionalRule__VariablesAssignment_5 : ( ruleRuleVariables ) ;
    public final void rule__UnidirectionalRule__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6451:1: ( ( ruleRuleVariables ) )
            // InternalReactionRules.g:6452:2: ( ruleRuleVariables )
            {
            // InternalReactionRules.g:6452:2: ( ruleRuleVariables )
            // InternalReactionRules.g:6453:3: ruleRuleVariables
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
    // InternalReactionRules.g:6462:1: rule__BidirectionalRule__LhsAssignment_0 : ( rulePatternAssignment ) ;
    public final void rule__BidirectionalRule__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6466:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6467:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6467:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6468:3: rulePatternAssignment
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
    // InternalReactionRules.g:6477:1: rule__BidirectionalRule__OperatorAssignment_1 : ( RULE_BI ) ;
    public final void rule__BidirectionalRule__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6481:1: ( ( RULE_BI ) )
            // InternalReactionRules.g:6482:2: ( RULE_BI )
            {
            // InternalReactionRules.g:6482:2: ( RULE_BI )
            // InternalReactionRules.g:6483:3: RULE_BI
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
    // InternalReactionRules.g:6492:1: rule__BidirectionalRule__RhsAssignment_2 : ( rulePatternAssignment ) ;
    public final void rule__BidirectionalRule__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6496:1: ( ( rulePatternAssignment ) )
            // InternalReactionRules.g:6497:2: ( rulePatternAssignment )
            {
            // InternalReactionRules.g:6497:2: ( rulePatternAssignment )
            // InternalReactionRules.g:6498:3: rulePatternAssignment
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
    // InternalReactionRules.g:6507:1: rule__BidirectionalRule__VariablesAssignment_5 : ( ruleRuleVariables ) ;
    public final void rule__BidirectionalRule__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6511:1: ( ( ruleRuleVariables ) )
            // InternalReactionRules.g:6512:2: ( ruleRuleVariables )
            {
            // InternalReactionRules.g:6512:2: ( ruleRuleVariables )
            // InternalReactionRules.g:6513:3: ruleRuleVariables
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
    // InternalReactionRules.g:6522:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6526:1: ( ( RULE_ID ) )
            // InternalReactionRules.g:6527:2: ( RULE_ID )
            {
            // InternalReactionRules.g:6527:2: ( RULE_ID )
            // InternalReactionRules.g:6528:3: RULE_ID
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
    // InternalReactionRules.g:6537:1: rule__Rule__RuleAssignment_2 : ( ruleRuleBody ) ;
    public final void rule__Rule__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionRules.g:6541:1: ( ( ruleRuleBody ) )
            // InternalReactionRules.g:6542:2: ( ruleRuleBody )
            {
            // InternalReactionRules.g:6542:2: ( ruleRuleBody )
            // InternalReactionRules.g:6543:3: ruleRuleBody
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
    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\5\1\6\3\uffff\1\10\2\uffff";
    static final String dfa_3s = "\2\4\2\10\1\4\2\uffff\1\5\2\uffff";
    static final String dfa_4s = "\1\22\1\4\2\45\1\4\2\uffff\1\45\2\uffff";
    static final String dfa_5s = "\5\uffff\1\2\1\3\1\uffff\1\1\1\4";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\15\uffff\1\1",
            "\1\3",
            "\1\5\17\uffff\1\4\1\5\1\uffff\1\5\2\uffff\2\5\2\uffff\4\5",
            "\1\6\17\uffff\1\4\1\6\1\uffff\1\6\2\uffff\2\6\2\uffff\4\6",
            "\1\7",
            "",
            "",
            "\1\11\2\uffff\1\10\20\uffff\1\10\1\uffff\1\10\2\uffff\2\10\2\uffff\4\10",
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
            return "1415:1: rule__ArithmeticType__Alternatives : ( ( ruleFloat ) | ( ruleUnsignedInteger ) | ( ruleSignedInteger ) | ( ruleScientificFloat ) );";
        }
    }
    static final String dfa_8s = "\103\uffff";
    static final String dfa_9s = "\2\10\1\14\1\34\1\14\2\uffff\1\10\1\31\1\32\1\10\1\4\1\10\1\32\2\42\1\30\2\42\1\34\1\41\1\33\3\10\1\42\1\31\1\32\1\31\1\10\1\4\1\10\1\4\1\32\2\42\1\30\2\42\1\32\2\42\1\30\2\42\1\41\1\33\1\10\1\41\1\33\2\10\2\42\1\31\1\10\1\4\1\32\2\42\1\30\2\42\1\41\1\33\1\10\1\42";
    static final String dfa_10s = "\1\31\1\32\1\15\1\34\1\15\2\uffff\1\35\1\41\1\33\1\10\1\13\1\10\1\32\2\42\1\30\2\42\1\34\1\41\1\35\1\10\1\35\1\10\1\42\1\41\1\33\1\41\1\10\1\13\1\10\1\13\1\32\2\42\1\30\2\42\1\32\2\42\1\30\2\42\1\41\1\35\1\10\1\41\1\35\2\10\2\42\1\41\1\10\1\13\1\32\2\42\1\30\2\42\1\41\1\35\1\10\1\42";
    static final String dfa_11s = "\5\uffff\1\1\1\2\74\uffff";
    static final String dfa_12s = "\103\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\20\uffff\1\1",
            "\1\3\21\uffff\1\4",
            "\1\5\1\6",
            "\1\7",
            "\1\5\1\6",
            "",
            "",
            "\1\10\24\uffff\1\11",
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
            "\1\32\24\uffff\1\33",
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
            return "1550:1: rule__RuleBody__Alternatives : ( ( ruleUnidirectionalRule ) | ( ruleBidirectionalRule ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000038C0000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000038C0000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000F10L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000002000100L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000040110L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000002000L});

}