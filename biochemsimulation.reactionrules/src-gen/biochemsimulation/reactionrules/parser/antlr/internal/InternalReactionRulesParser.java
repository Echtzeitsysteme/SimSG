package biochemsimulation.reactionrules.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import biochemsimulation.reactionrules.services.ReactionRulesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReactionRulesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_EXPONENT", "RULE_SEMI_LINK", "RULE_FREE_LINK", "RULE_WHATEVER_LINK", "RULE_UNI", "RULE_AT", "RULE_BI", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'URI'", "'PATH'", "'ModelID'", "'AgentInstance'", "'-'", "'.'", "'{'", "','", "'}'", "'('", "')'", "'agent'", "'var'", "'='", "'['", "']'", "'obs'", "'init'", "'rule'"
    };
    public static final int RULE_FREE_LINK=9;
    public static final int RULE_STRING=4;
    public static final int RULE_AT=12;
    public static final int RULE_WHATEVER_LINK=10;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int RULE_SEMI_LINK=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_BI=13;
    public static final int RULE_EXPONENT=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int RULE_UNI=11;
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

        public InternalReactionRulesParser(TokenStream input, ReactionRulesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ReactionRuleModel";
       	}

       	@Override
       	protected ReactionRulesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleReactionRuleModel"
    // InternalReactionRules.g:64:1: entryRuleReactionRuleModel returns [EObject current=null] : iv_ruleReactionRuleModel= ruleReactionRuleModel EOF ;
    public final EObject entryRuleReactionRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionRuleModel = null;


        try {
            // InternalReactionRules.g:64:58: (iv_ruleReactionRuleModel= ruleReactionRuleModel EOF )
            // InternalReactionRules.g:65:2: iv_ruleReactionRuleModel= ruleReactionRuleModel EOF
            {
             newCompositeNode(grammarAccess.getReactionRuleModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactionRuleModel=ruleReactionRuleModel();

            state._fsp--;

             current =iv_ruleReactionRuleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactionRuleModel"


    // $ANTLR start "ruleReactionRuleModel"
    // InternalReactionRules.g:71:1: ruleReactionRuleModel returns [EObject current=null] : ( ( (lv_model_0_0= ruleModel ) ) ( (lv_reationContainer_1_0= ruleReactionContainer ) ) ( (lv_reactionProperties_2_0= ruleReactionProperty ) )* ) ;
    public final EObject ruleReactionRuleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_model_0_0 = null;

        EObject lv_reationContainer_1_0 = null;

        EObject lv_reactionProperties_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:77:2: ( ( ( (lv_model_0_0= ruleModel ) ) ( (lv_reationContainer_1_0= ruleReactionContainer ) ) ( (lv_reactionProperties_2_0= ruleReactionProperty ) )* ) )
            // InternalReactionRules.g:78:2: ( ( (lv_model_0_0= ruleModel ) ) ( (lv_reationContainer_1_0= ruleReactionContainer ) ) ( (lv_reactionProperties_2_0= ruleReactionProperty ) )* )
            {
            // InternalReactionRules.g:78:2: ( ( (lv_model_0_0= ruleModel ) ) ( (lv_reationContainer_1_0= ruleReactionContainer ) ) ( (lv_reactionProperties_2_0= ruleReactionProperty ) )* )
            // InternalReactionRules.g:79:3: ( (lv_model_0_0= ruleModel ) ) ( (lv_reationContainer_1_0= ruleReactionContainer ) ) ( (lv_reactionProperties_2_0= ruleReactionProperty ) )*
            {
            // InternalReactionRules.g:79:3: ( (lv_model_0_0= ruleModel ) )
            // InternalReactionRules.g:80:4: (lv_model_0_0= ruleModel )
            {
            // InternalReactionRules.g:80:4: (lv_model_0_0= ruleModel )
            // InternalReactionRules.g:81:5: lv_model_0_0= ruleModel
            {

            					newCompositeNode(grammarAccess.getReactionRuleModelAccess().getModelModelParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_model_0_0=ruleModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactionRuleModelRule());
            					}
            					set(
            						current,
            						"model",
            						lv_model_0_0,
            						"biochemsimulation.reactionrules.ReactionRules.Model");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionRules.g:98:3: ( (lv_reationContainer_1_0= ruleReactionContainer ) )
            // InternalReactionRules.g:99:4: (lv_reationContainer_1_0= ruleReactionContainer )
            {
            // InternalReactionRules.g:99:4: (lv_reationContainer_1_0= ruleReactionContainer )
            // InternalReactionRules.g:100:5: lv_reationContainer_1_0= ruleReactionContainer
            {

            					newCompositeNode(grammarAccess.getReactionRuleModelAccess().getReationContainerReactionContainerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_reationContainer_1_0=ruleReactionContainer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactionRuleModelRule());
            					}
            					set(
            						current,
            						"reationContainer",
            						lv_reationContainer_1_0,
            						"biochemsimulation.reactionrules.ReactionRules.ReactionContainer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionRules.g:117:3: ( (lv_reactionProperties_2_0= ruleReactionProperty ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=29 && LA1_0<=30)||(LA1_0>=34 && LA1_0<=36)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReactionRules.g:118:4: (lv_reactionProperties_2_0= ruleReactionProperty )
            	    {
            	    // InternalReactionRules.g:118:4: (lv_reactionProperties_2_0= ruleReactionProperty )
            	    // InternalReactionRules.g:119:5: lv_reactionProperties_2_0= ruleReactionProperty
            	    {

            	    					newCompositeNode(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesReactionPropertyParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_reactionProperties_2_0=ruleReactionProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactionRuleModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reactionProperties",
            	    						lv_reactionProperties_2_0,
            	    						"biochemsimulation.reactionrules.ReactionRules.ReactionProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactionRuleModel"


    // $ANTLR start "entryRuleModelUri"
    // InternalReactionRules.g:140:1: entryRuleModelUri returns [EObject current=null] : iv_ruleModelUri= ruleModelUri EOF ;
    public final EObject entryRuleModelUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelUri = null;


        try {
            // InternalReactionRules.g:140:49: (iv_ruleModelUri= ruleModelUri EOF )
            // InternalReactionRules.g:141:2: iv_ruleModelUri= ruleModelUri EOF
            {
             newCompositeNode(grammarAccess.getModelUriRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelUri=ruleModelUri();

            state._fsp--;

             current =iv_ruleModelUri; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelUri"


    // $ANTLR start "ruleModelUri"
    // InternalReactionRules.g:147:1: ruleModelUri returns [EObject current=null] : (otherlv_0= 'URI' ( (lv_uri_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleModelUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_uri_1_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:153:2: ( (otherlv_0= 'URI' ( (lv_uri_1_0= RULE_STRING ) ) ) )
            // InternalReactionRules.g:154:2: (otherlv_0= 'URI' ( (lv_uri_1_0= RULE_STRING ) ) )
            {
            // InternalReactionRules.g:154:2: (otherlv_0= 'URI' ( (lv_uri_1_0= RULE_STRING ) ) )
            // InternalReactionRules.g:155:3: otherlv_0= 'URI' ( (lv_uri_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getModelUriAccess().getURIKeyword_0());
            		
            // InternalReactionRules.g:159:3: ( (lv_uri_1_0= RULE_STRING ) )
            // InternalReactionRules.g:160:4: (lv_uri_1_0= RULE_STRING )
            {
            // InternalReactionRules.g:160:4: (lv_uri_1_0= RULE_STRING )
            // InternalReactionRules.g:161:5: lv_uri_1_0= RULE_STRING
            {
            lv_uri_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_uri_1_0, grammarAccess.getModelUriAccess().getUriSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelUriRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uri",
            						lv_uri_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelUri"


    // $ANTLR start "entryRuleModelPath"
    // InternalReactionRules.g:181:1: entryRuleModelPath returns [EObject current=null] : iv_ruleModelPath= ruleModelPath EOF ;
    public final EObject entryRuleModelPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelPath = null;


        try {
            // InternalReactionRules.g:181:50: (iv_ruleModelPath= ruleModelPath EOF )
            // InternalReactionRules.g:182:2: iv_ruleModelPath= ruleModelPath EOF
            {
             newCompositeNode(grammarAccess.getModelPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelPath=ruleModelPath();

            state._fsp--;

             current =iv_ruleModelPath; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelPath"


    // $ANTLR start "ruleModelPath"
    // InternalReactionRules.g:188:1: ruleModelPath returns [EObject current=null] : (otherlv_0= 'PATH' ( (lv_path_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleModelPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:194:2: ( (otherlv_0= 'PATH' ( (lv_path_1_0= RULE_STRING ) ) ) )
            // InternalReactionRules.g:195:2: (otherlv_0= 'PATH' ( (lv_path_1_0= RULE_STRING ) ) )
            {
            // InternalReactionRules.g:195:2: (otherlv_0= 'PATH' ( (lv_path_1_0= RULE_STRING ) ) )
            // InternalReactionRules.g:196:3: otherlv_0= 'PATH' ( (lv_path_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getModelPathAccess().getPATHKeyword_0());
            		
            // InternalReactionRules.g:200:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalReactionRules.g:201:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalReactionRules.g:201:4: (lv_path_1_0= RULE_STRING )
            // InternalReactionRules.g:202:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_1_0, grammarAccess.getModelPathAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelPathRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelPath"


    // $ANTLR start "entryRuleModelLocation"
    // InternalReactionRules.g:222:1: entryRuleModelLocation returns [EObject current=null] : iv_ruleModelLocation= ruleModelLocation EOF ;
    public final EObject entryRuleModelLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelLocation = null;


        try {
            // InternalReactionRules.g:222:54: (iv_ruleModelLocation= ruleModelLocation EOF )
            // InternalReactionRules.g:223:2: iv_ruleModelLocation= ruleModelLocation EOF
            {
             newCompositeNode(grammarAccess.getModelLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelLocation=ruleModelLocation();

            state._fsp--;

             current =iv_ruleModelLocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelLocation"


    // $ANTLR start "ruleModelLocation"
    // InternalReactionRules.g:229:1: ruleModelLocation returns [EObject current=null] : (this_ModelUri_0= ruleModelUri | this_ModelPath_1= ruleModelPath ) ;
    public final EObject ruleModelLocation() throws RecognitionException {
        EObject current = null;

        EObject this_ModelUri_0 = null;

        EObject this_ModelPath_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:235:2: ( (this_ModelUri_0= ruleModelUri | this_ModelPath_1= ruleModelPath ) )
            // InternalReactionRules.g:236:2: (this_ModelUri_0= ruleModelUri | this_ModelPath_1= ruleModelPath )
            {
            // InternalReactionRules.g:236:2: (this_ModelUri_0= ruleModelUri | this_ModelPath_1= ruleModelPath )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalReactionRules.g:237:3: this_ModelUri_0= ruleModelUri
                    {

                    			newCompositeNode(grammarAccess.getModelLocationAccess().getModelUriParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModelUri_0=ruleModelUri();

                    state._fsp--;


                    			current = this_ModelUri_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:246:3: this_ModelPath_1= ruleModelPath
                    {

                    			newCompositeNode(grammarAccess.getModelLocationAccess().getModelPathParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModelPath_1=ruleModelPath();

                    state._fsp--;


                    			current = this_ModelPath_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelLocation"


    // $ANTLR start "entryRuleModel"
    // InternalReactionRules.g:258:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalReactionRules.g:258:46: (iv_ruleModel= ruleModel EOF )
            // InternalReactionRules.g:259:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalReactionRules.g:265:1: ruleModel returns [EObject current=null] : (otherlv_0= 'ModelID' ( (lv_name_1_0= RULE_ID ) ) ( (lv_location_2_0= ruleModelLocation ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_location_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:271:2: ( (otherlv_0= 'ModelID' ( (lv_name_1_0= RULE_ID ) ) ( (lv_location_2_0= ruleModelLocation ) )? ) )
            // InternalReactionRules.g:272:2: (otherlv_0= 'ModelID' ( (lv_name_1_0= RULE_ID ) ) ( (lv_location_2_0= ruleModelLocation ) )? )
            {
            // InternalReactionRules.g:272:2: (otherlv_0= 'ModelID' ( (lv_name_1_0= RULE_ID ) ) ( (lv_location_2_0= ruleModelLocation ) )? )
            // InternalReactionRules.g:273:3: otherlv_0= 'ModelID' ( (lv_name_1_0= RULE_ID ) ) ( (lv_location_2_0= ruleModelLocation ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelIDKeyword_0());
            		
            // InternalReactionRules.g:277:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:278:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:278:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:279:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReactionRules.g:295:3: ( (lv_location_2_0= ruleModelLocation ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=18 && LA3_0<=19)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalReactionRules.g:296:4: (lv_location_2_0= ruleModelLocation )
                    {
                    // InternalReactionRules.g:296:4: (lv_location_2_0= ruleModelLocation )
                    // InternalReactionRules.g:297:5: lv_location_2_0= ruleModelLocation
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getLocationModelLocationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_location_2_0=ruleModelLocation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"location",
                    						lv_location_2_0,
                    						"biochemsimulation.reactionrules.ReactionRules.ModelLocation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleReactionContainer"
    // InternalReactionRules.g:318:1: entryRuleReactionContainer returns [EObject current=null] : iv_ruleReactionContainer= ruleReactionContainer EOF ;
    public final EObject entryRuleReactionContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionContainer = null;


        try {
            // InternalReactionRules.g:318:58: (iv_ruleReactionContainer= ruleReactionContainer EOF )
            // InternalReactionRules.g:319:2: iv_ruleReactionContainer= ruleReactionContainer EOF
            {
             newCompositeNode(grammarAccess.getReactionContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactionContainer=ruleReactionContainer();

            state._fsp--;

             current =iv_ruleReactionContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactionContainer"


    // $ANTLR start "ruleReactionContainer"
    // InternalReactionRules.g:325:1: ruleReactionContainer returns [EObject current=null] : ( () ( (lv_agentInstances_1_0= ruleAgentInstance ) )* ) ;
    public final EObject ruleReactionContainer() throws RecognitionException {
        EObject current = null;

        EObject lv_agentInstances_1_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:331:2: ( ( () ( (lv_agentInstances_1_0= ruleAgentInstance ) )* ) )
            // InternalReactionRules.g:332:2: ( () ( (lv_agentInstances_1_0= ruleAgentInstance ) )* )
            {
            // InternalReactionRules.g:332:2: ( () ( (lv_agentInstances_1_0= ruleAgentInstance ) )* )
            // InternalReactionRules.g:333:3: () ( (lv_agentInstances_1_0= ruleAgentInstance ) )*
            {
            // InternalReactionRules.g:333:3: ()
            // InternalReactionRules.g:334:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReactionContainerAccess().getReactionContainerAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:340:3: ( (lv_agentInstances_1_0= ruleAgentInstance ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalReactionRules.g:341:4: (lv_agentInstances_1_0= ruleAgentInstance )
            	    {
            	    // InternalReactionRules.g:341:4: (lv_agentInstances_1_0= ruleAgentInstance )
            	    // InternalReactionRules.g:342:5: lv_agentInstances_1_0= ruleAgentInstance
            	    {

            	    					newCompositeNode(grammarAccess.getReactionContainerAccess().getAgentInstancesAgentInstanceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_agentInstances_1_0=ruleAgentInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactionContainerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"agentInstances",
            	    						lv_agentInstances_1_0,
            	    						"biochemsimulation.reactionrules.ReactionRules.AgentInstance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactionContainer"


    // $ANTLR start "entryRuleAgentInstanceSiteState"
    // InternalReactionRules.g:363:1: entryRuleAgentInstanceSiteState returns [EObject current=null] : iv_ruleAgentInstanceSiteState= ruleAgentInstanceSiteState EOF ;
    public final EObject entryRuleAgentInstanceSiteState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgentInstanceSiteState = null;


        try {
            // InternalReactionRules.g:363:63: (iv_ruleAgentInstanceSiteState= ruleAgentInstanceSiteState EOF )
            // InternalReactionRules.g:364:2: iv_ruleAgentInstanceSiteState= ruleAgentInstanceSiteState EOF
            {
             newCompositeNode(grammarAccess.getAgentInstanceSiteStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgentInstanceSiteState=ruleAgentInstanceSiteState();

            state._fsp--;

             current =iv_ruleAgentInstanceSiteState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgentInstanceSiteState"


    // $ANTLR start "ruleAgentInstanceSiteState"
    // InternalReactionRules.g:370:1: ruleAgentInstanceSiteState returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_siteState_1_0= ruleSiteState ) ) ) ;
    public final EObject ruleAgentInstanceSiteState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_siteState_1_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:376:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_siteState_1_0= ruleSiteState ) ) ) )
            // InternalReactionRules.g:377:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_siteState_1_0= ruleSiteState ) ) )
            {
            // InternalReactionRules.g:377:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_siteState_1_0= ruleSiteState ) ) )
            // InternalReactionRules.g:378:3: ( (otherlv_0= RULE_ID ) ) ( (lv_siteState_1_0= ruleSiteState ) )
            {
            // InternalReactionRules.g:378:3: ( (otherlv_0= RULE_ID ) )
            // InternalReactionRules.g:379:4: (otherlv_0= RULE_ID )
            {
            // InternalReactionRules.g:379:4: (otherlv_0= RULE_ID )
            // InternalReactionRules.g:380:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgentInstanceSiteStateRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_0, grammarAccess.getAgentInstanceSiteStateAccess().getSiteSiteCrossReference_0_0());
            				

            }


            }

            // InternalReactionRules.g:391:3: ( (lv_siteState_1_0= ruleSiteState ) )
            // InternalReactionRules.g:392:4: (lv_siteState_1_0= ruleSiteState )
            {
            // InternalReactionRules.g:392:4: (lv_siteState_1_0= ruleSiteState )
            // InternalReactionRules.g:393:5: lv_siteState_1_0= ruleSiteState
            {

            					newCompositeNode(grammarAccess.getAgentInstanceSiteStateAccess().getSiteStateSiteStateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_siteState_1_0=ruleSiteState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAgentInstanceSiteStateRule());
            					}
            					set(
            						current,
            						"siteState",
            						lv_siteState_1_0,
            						"biochemsimulation.reactionrules.ReactionRules.SiteState");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgentInstanceSiteState"


    // $ANTLR start "entryRuleAgentInstanceLinkState"
    // InternalReactionRules.g:414:1: entryRuleAgentInstanceLinkState returns [EObject current=null] : iv_ruleAgentInstanceLinkState= ruleAgentInstanceLinkState EOF ;
    public final EObject entryRuleAgentInstanceLinkState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgentInstanceLinkState = null;


        try {
            // InternalReactionRules.g:414:63: (iv_ruleAgentInstanceLinkState= ruleAgentInstanceLinkState EOF )
            // InternalReactionRules.g:415:2: iv_ruleAgentInstanceLinkState= ruleAgentInstanceLinkState EOF
            {
             newCompositeNode(grammarAccess.getAgentInstanceLinkStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgentInstanceLinkState=ruleAgentInstanceLinkState();

            state._fsp--;

             current =iv_ruleAgentInstanceLinkState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgentInstanceLinkState"


    // $ANTLR start "ruleAgentInstanceLinkState"
    // InternalReactionRules.g:421:1: ruleAgentInstanceLinkState returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkState_1_0= ruleLinkState ) ) ) ;
    public final EObject ruleAgentInstanceLinkState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_linkState_1_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:427:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkState_1_0= ruleLinkState ) ) ) )
            // InternalReactionRules.g:428:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkState_1_0= ruleLinkState ) ) )
            {
            // InternalReactionRules.g:428:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkState_1_0= ruleLinkState ) ) )
            // InternalReactionRules.g:429:3: ( (otherlv_0= RULE_ID ) ) ( (lv_linkState_1_0= ruleLinkState ) )
            {
            // InternalReactionRules.g:429:3: ( (otherlv_0= RULE_ID ) )
            // InternalReactionRules.g:430:4: (otherlv_0= RULE_ID )
            {
            // InternalReactionRules.g:430:4: (otherlv_0= RULE_ID )
            // InternalReactionRules.g:431:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgentInstanceLinkStateRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getAgentInstanceLinkStateAccess().getSiteSiteCrossReference_0_0());
            				

            }


            }

            // InternalReactionRules.g:442:3: ( (lv_linkState_1_0= ruleLinkState ) )
            // InternalReactionRules.g:443:4: (lv_linkState_1_0= ruleLinkState )
            {
            // InternalReactionRules.g:443:4: (lv_linkState_1_0= ruleLinkState )
            // InternalReactionRules.g:444:5: lv_linkState_1_0= ruleLinkState
            {

            					newCompositeNode(grammarAccess.getAgentInstanceLinkStateAccess().getLinkStateLinkStateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_linkState_1_0=ruleLinkState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAgentInstanceLinkStateRule());
            					}
            					set(
            						current,
            						"linkState",
            						lv_linkState_1_0,
            						"biochemsimulation.reactionrules.ReactionRules.LinkState");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgentInstanceLinkState"


    // $ANTLR start "entryRuleAgentInstance"
    // InternalReactionRules.g:465:1: entryRuleAgentInstance returns [EObject current=null] : iv_ruleAgentInstance= ruleAgentInstance EOF ;
    public final EObject entryRuleAgentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgentInstance = null;


        try {
            // InternalReactionRules.g:465:54: (iv_ruleAgentInstance= ruleAgentInstance EOF )
            // InternalReactionRules.g:466:2: iv_ruleAgentInstance= ruleAgentInstance EOF
            {
             newCompositeNode(grammarAccess.getAgentInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgentInstance=ruleAgentInstance();

            state._fsp--;

             current =iv_ruleAgentInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgentInstance"


    // $ANTLR start "ruleAgentInstance"
    // InternalReactionRules.g:472:1: ruleAgentInstance returns [EObject current=null] : (otherlv_0= 'AgentInstance' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_siteStates_3_0= ruleAgentInstanceSiteState ) ) ( (lv_linkStates_4_0= ruleAgentInstanceLinkState ) ) ) ;
    public final EObject ruleAgentInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_siteStates_3_0 = null;

        EObject lv_linkStates_4_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:478:2: ( (otherlv_0= 'AgentInstance' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_siteStates_3_0= ruleAgentInstanceSiteState ) ) ( (lv_linkStates_4_0= ruleAgentInstanceLinkState ) ) ) )
            // InternalReactionRules.g:479:2: (otherlv_0= 'AgentInstance' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_siteStates_3_0= ruleAgentInstanceSiteState ) ) ( (lv_linkStates_4_0= ruleAgentInstanceLinkState ) ) )
            {
            // InternalReactionRules.g:479:2: (otherlv_0= 'AgentInstance' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_siteStates_3_0= ruleAgentInstanceSiteState ) ) ( (lv_linkStates_4_0= ruleAgentInstanceLinkState ) ) )
            // InternalReactionRules.g:480:3: otherlv_0= 'AgentInstance' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_siteStates_3_0= ruleAgentInstanceSiteState ) ) ( (lv_linkStates_4_0= ruleAgentInstanceLinkState ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAgentInstanceAccess().getAgentInstanceKeyword_0());
            		
            // InternalReactionRules.g:484:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:485:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:485:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:486:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAgentInstanceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgentInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReactionRules.g:502:3: ( (otherlv_2= RULE_ID ) )
            // InternalReactionRules.g:503:4: (otherlv_2= RULE_ID )
            {
            // InternalReactionRules.g:503:4: (otherlv_2= RULE_ID )
            // InternalReactionRules.g:504:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgentInstanceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_2, grammarAccess.getAgentInstanceAccess().getAgentAgentCrossReference_2_0());
            				

            }


            }

            // InternalReactionRules.g:515:3: ( (lv_siteStates_3_0= ruleAgentInstanceSiteState ) )
            // InternalReactionRules.g:516:4: (lv_siteStates_3_0= ruleAgentInstanceSiteState )
            {
            // InternalReactionRules.g:516:4: (lv_siteStates_3_0= ruleAgentInstanceSiteState )
            // InternalReactionRules.g:517:5: lv_siteStates_3_0= ruleAgentInstanceSiteState
            {

            					newCompositeNode(grammarAccess.getAgentInstanceAccess().getSiteStatesAgentInstanceSiteStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_siteStates_3_0=ruleAgentInstanceSiteState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAgentInstanceRule());
            					}
            					add(
            						current,
            						"siteStates",
            						lv_siteStates_3_0,
            						"biochemsimulation.reactionrules.ReactionRules.AgentInstanceSiteState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionRules.g:534:3: ( (lv_linkStates_4_0= ruleAgentInstanceLinkState ) )
            // InternalReactionRules.g:535:4: (lv_linkStates_4_0= ruleAgentInstanceLinkState )
            {
            // InternalReactionRules.g:535:4: (lv_linkStates_4_0= ruleAgentInstanceLinkState )
            // InternalReactionRules.g:536:5: lv_linkStates_4_0= ruleAgentInstanceLinkState
            {

            					newCompositeNode(grammarAccess.getAgentInstanceAccess().getLinkStatesAgentInstanceLinkStateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_linkStates_4_0=ruleAgentInstanceLinkState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAgentInstanceRule());
            					}
            					add(
            						current,
            						"linkStates",
            						lv_linkStates_4_0,
            						"biochemsimulation.reactionrules.ReactionRules.AgentInstanceLinkState");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgentInstance"


    // $ANTLR start "entryRuleReactionProperty"
    // InternalReactionRules.g:557:1: entryRuleReactionProperty returns [EObject current=null] : iv_ruleReactionProperty= ruleReactionProperty EOF ;
    public final EObject entryRuleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperty = null;


        try {
            // InternalReactionRules.g:557:57: (iv_ruleReactionProperty= ruleReactionProperty EOF )
            // InternalReactionRules.g:558:2: iv_ruleReactionProperty= ruleReactionProperty EOF
            {
             newCompositeNode(grammarAccess.getReactionPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactionProperty=ruleReactionProperty();

            state._fsp--;

             current =iv_ruleReactionProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactionProperty"


    // $ANTLR start "ruleReactionProperty"
    // InternalReactionRules.g:564:1: ruleReactionProperty returns [EObject current=null] : (this_Agent_0= ruleAgent | this_Variable_1= ruleVariable | this_Observation_2= ruleObservation | this_Initial_3= ruleInitial | this_Rule_4= ruleRule ) ;
    public final EObject ruleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Agent_0 = null;

        EObject this_Variable_1 = null;

        EObject this_Observation_2 = null;

        EObject this_Initial_3 = null;

        EObject this_Rule_4 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:570:2: ( (this_Agent_0= ruleAgent | this_Variable_1= ruleVariable | this_Observation_2= ruleObservation | this_Initial_3= ruleInitial | this_Rule_4= ruleRule ) )
            // InternalReactionRules.g:571:2: (this_Agent_0= ruleAgent | this_Variable_1= ruleVariable | this_Observation_2= ruleObservation | this_Initial_3= ruleInitial | this_Rule_4= ruleRule )
            {
            // InternalReactionRules.g:571:2: (this_Agent_0= ruleAgent | this_Variable_1= ruleVariable | this_Observation_2= ruleObservation | this_Initial_3= ruleInitial | this_Rule_4= ruleRule )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 34:
                {
                alt5=3;
                }
                break;
            case 35:
                {
                alt5=4;
                }
                break;
            case 36:
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
                    // InternalReactionRules.g:572:3: this_Agent_0= ruleAgent
                    {

                    			newCompositeNode(grammarAccess.getReactionPropertyAccess().getAgentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Agent_0=ruleAgent();

                    state._fsp--;


                    			current = this_Agent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:581:3: this_Variable_1= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getReactionPropertyAccess().getVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_1=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalReactionRules.g:590:3: this_Observation_2= ruleObservation
                    {

                    			newCompositeNode(grammarAccess.getReactionPropertyAccess().getObservationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Observation_2=ruleObservation();

                    state._fsp--;


                    			current = this_Observation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalReactionRules.g:599:3: this_Initial_3= ruleInitial
                    {

                    			newCompositeNode(grammarAccess.getReactionPropertyAccess().getInitialParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Initial_3=ruleInitial();

                    state._fsp--;


                    			current = this_Initial_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalReactionRules.g:608:3: this_Rule_4= ruleRule
                    {

                    			newCompositeNode(grammarAccess.getReactionPropertyAccess().getRuleParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rule_4=ruleRule();

                    state._fsp--;


                    			current = this_Rule_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactionProperty"


    // $ANTLR start "entryRuleFloat"
    // InternalReactionRules.g:620:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:622:2: (iv_ruleFloat= ruleFloat EOF )
            // InternalReactionRules.g:623:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalReactionRules.g:632:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:639:2: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            // InternalReactionRules.g:640:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            {
            // InternalReactionRules.g:640:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // InternalReactionRules.g:641:3: (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            // InternalReactionRules.g:641:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalReactionRules.g:642:4: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_11); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,23,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getFloatAccess().getINTTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleScientificFloat"
    // InternalReactionRules.g:674:1: entryRuleScientificFloat returns [String current=null] : iv_ruleScientificFloat= ruleScientificFloat EOF ;
    public final String entryRuleScientificFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScientificFloat = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:676:2: (iv_ruleScientificFloat= ruleScientificFloat EOF )
            // InternalReactionRules.g:677:2: iv_ruleScientificFloat= ruleScientificFloat EOF
            {
             newCompositeNode(grammarAccess.getScientificFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScientificFloat=ruleScientificFloat();

            state._fsp--;

             current =iv_ruleScientificFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleScientificFloat"


    // $ANTLR start "ruleScientificFloat"
    // InternalReactionRules.g:686:1: ruleScientificFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT this_EXPONENT_4= RULE_EXPONENT (kw= '-' )? this_INT_6= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleScientificFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_EXPONENT_4=null;
        Token this_INT_6=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:693:2: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT this_EXPONENT_4= RULE_EXPONENT (kw= '-' )? this_INT_6= RULE_INT ) )
            // InternalReactionRules.g:694:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT this_EXPONENT_4= RULE_EXPONENT (kw= '-' )? this_INT_6= RULE_INT )
            {
            // InternalReactionRules.g:694:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT this_EXPONENT_4= RULE_EXPONENT (kw= '-' )? this_INT_6= RULE_INT )
            // InternalReactionRules.g:695:3: (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT this_EXPONENT_4= RULE_EXPONENT (kw= '-' )? this_INT_6= RULE_INT
            {
            // InternalReactionRules.g:695:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalReactionRules.g:696:4: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_11); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getScientificFloatAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,23,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getScientificFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_12); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getScientificFloatAccess().getINTTerminalRuleCall_3());
            		
            this_EXPONENT_4=(Token)match(input,RULE_EXPONENT,FOLLOW_13); 

            			current.merge(this_EXPONENT_4);
            		

            			newLeafNode(this_EXPONENT_4, grammarAccess.getScientificFloatAccess().getEXPONENTTerminalRuleCall_4());
            		
            // InternalReactionRules.g:728:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalReactionRules.g:729:4: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_5());
                    			

                    }
                    break;

            }

            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_6);
            		

            			newLeafNode(this_INT_6, grammarAccess.getScientificFloatAccess().getINTTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleScientificFloat"


    // $ANTLR start "entryRuleUnsignedInteger"
    // InternalReactionRules.g:749:1: entryRuleUnsignedInteger returns [String current=null] : iv_ruleUnsignedInteger= ruleUnsignedInteger EOF ;
    public final String entryRuleUnsignedInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnsignedInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:751:2: (iv_ruleUnsignedInteger= ruleUnsignedInteger EOF )
            // InternalReactionRules.g:752:2: iv_ruleUnsignedInteger= ruleUnsignedInteger EOF
            {
             newCompositeNode(grammarAccess.getUnsignedIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnsignedInteger=ruleUnsignedInteger();

            state._fsp--;

             current =iv_ruleUnsignedInteger.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleUnsignedInteger"


    // $ANTLR start "ruleUnsignedInteger"
    // InternalReactionRules.g:761:1: ruleUnsignedInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleUnsignedInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:768:2: (this_INT_0= RULE_INT )
            // InternalReactionRules.g:769:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getUnsignedIntegerAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleUnsignedInteger"


    // $ANTLR start "entryRuleSignedInteger"
    // InternalReactionRules.g:782:1: entryRuleSignedInteger returns [String current=null] : iv_ruleSignedInteger= ruleSignedInteger EOF ;
    public final String entryRuleSignedInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:784:2: (iv_ruleSignedInteger= ruleSignedInteger EOF )
            // InternalReactionRules.g:785:2: iv_ruleSignedInteger= ruleSignedInteger EOF
            {
             newCompositeNode(grammarAccess.getSignedIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignedInteger=ruleSignedInteger();

            state._fsp--;

             current =iv_ruleSignedInteger.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSignedInteger"


    // $ANTLR start "ruleSignedInteger"
    // InternalReactionRules.g:794:1: ruleSignedInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:801:2: ( (kw= '-' this_INT_1= RULE_INT ) )
            // InternalReactionRules.g:802:2: (kw= '-' this_INT_1= RULE_INT )
            {
            // InternalReactionRules.g:802:2: (kw= '-' this_INT_1= RULE_INT )
            // InternalReactionRules.g:803:3: kw= '-' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,22,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSignedIntegerAccess().getHyphenMinusKeyword_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getSignedIntegerAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSignedInteger"


    // $ANTLR start "entryRuleArithmeticType"
    // InternalReactionRules.g:822:1: entryRuleArithmeticType returns [String current=null] : iv_ruleArithmeticType= ruleArithmeticType EOF ;
    public final String entryRuleArithmeticType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArithmeticType = null;


        try {
            // InternalReactionRules.g:822:54: (iv_ruleArithmeticType= ruleArithmeticType EOF )
            // InternalReactionRules.g:823:2: iv_ruleArithmeticType= ruleArithmeticType EOF
            {
             newCompositeNode(grammarAccess.getArithmeticTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticType=ruleArithmeticType();

            state._fsp--;

             current =iv_ruleArithmeticType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticType"


    // $ANTLR start "ruleArithmeticType"
    // InternalReactionRules.g:829:1: ruleArithmeticType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Float_0= ruleFloat | this_UnsignedInteger_1= ruleUnsignedInteger | this_SignedInteger_2= ruleSignedInteger | this_ScientificFloat_3= ruleScientificFloat ) ;
    public final AntlrDatatypeRuleToken ruleArithmeticType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Float_0 = null;

        AntlrDatatypeRuleToken this_UnsignedInteger_1 = null;

        AntlrDatatypeRuleToken this_SignedInteger_2 = null;

        AntlrDatatypeRuleToken this_ScientificFloat_3 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:835:2: ( (this_Float_0= ruleFloat | this_UnsignedInteger_1= ruleUnsignedInteger | this_SignedInteger_2= ruleSignedInteger | this_ScientificFloat_3= ruleScientificFloat ) )
            // InternalReactionRules.g:836:2: (this_Float_0= ruleFloat | this_UnsignedInteger_1= ruleUnsignedInteger | this_SignedInteger_2= ruleSignedInteger | this_ScientificFloat_3= ruleScientificFloat )
            {
            // InternalReactionRules.g:836:2: (this_Float_0= ruleFloat | this_UnsignedInteger_1= ruleUnsignedInteger | this_SignedInteger_2= ruleSignedInteger | this_ScientificFloat_3= ruleScientificFloat )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalReactionRules.g:837:3: this_Float_0= ruleFloat
                    {

                    			newCompositeNode(grammarAccess.getArithmeticTypeAccess().getFloatParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Float_0=ruleFloat();

                    state._fsp--;


                    			current.merge(this_Float_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:848:3: this_UnsignedInteger_1= ruleUnsignedInteger
                    {

                    			newCompositeNode(grammarAccess.getArithmeticTypeAccess().getUnsignedIntegerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnsignedInteger_1=ruleUnsignedInteger();

                    state._fsp--;


                    			current.merge(this_UnsignedInteger_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalReactionRules.g:859:3: this_SignedInteger_2= ruleSignedInteger
                    {

                    			newCompositeNode(grammarAccess.getArithmeticTypeAccess().getSignedIntegerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SignedInteger_2=ruleSignedInteger();

                    state._fsp--;


                    			current.merge(this_SignedInteger_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalReactionRules.g:870:3: this_ScientificFloat_3= ruleScientificFloat
                    {

                    			newCompositeNode(grammarAccess.getArithmeticTypeAccess().getScientificFloatParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScientificFloat_3=ruleScientificFloat();

                    state._fsp--;


                    			current.merge(this_ScientificFloat_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticType"


    // $ANTLR start "entryRuleArithmeticValue"
    // InternalReactionRules.g:884:1: entryRuleArithmeticValue returns [EObject current=null] : iv_ruleArithmeticValue= ruleArithmeticValue EOF ;
    public final EObject entryRuleArithmeticValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticValue = null;


        try {
            // InternalReactionRules.g:884:56: (iv_ruleArithmeticValue= ruleArithmeticValue EOF )
            // InternalReactionRules.g:885:2: iv_ruleArithmeticValue= ruleArithmeticValue EOF
            {
             newCompositeNode(grammarAccess.getArithmeticValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticValue=ruleArithmeticValue();

            state._fsp--;

             current =iv_ruleArithmeticValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticValue"


    // $ANTLR start "ruleArithmeticValue"
    // InternalReactionRules.g:891:1: ruleArithmeticValue returns [EObject current=null] : ( (lv_value_0_0= ruleArithmeticType ) ) ;
    public final EObject ruleArithmeticValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:897:2: ( ( (lv_value_0_0= ruleArithmeticType ) ) )
            // InternalReactionRules.g:898:2: ( (lv_value_0_0= ruleArithmeticType ) )
            {
            // InternalReactionRules.g:898:2: ( (lv_value_0_0= ruleArithmeticType ) )
            // InternalReactionRules.g:899:3: (lv_value_0_0= ruleArithmeticType )
            {
            // InternalReactionRules.g:899:3: (lv_value_0_0= ruleArithmeticType )
            // InternalReactionRules.g:900:4: lv_value_0_0= ruleArithmeticType
            {

            				newCompositeNode(grammarAccess.getArithmeticValueAccess().getValueArithmeticTypeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleArithmeticType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getArithmeticValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"biochemsimulation.reactionrules.ReactionRules.ArithmeticType");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticValue"


    // $ANTLR start "entryRuleState"
    // InternalReactionRules.g:920:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalReactionRules.g:920:46: (iv_ruleState= ruleState EOF )
            // InternalReactionRules.g:921:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalReactionRules.g:927:1: ruleState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:933:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalReactionRules.g:934:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalReactionRules.g:934:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalReactionRules.g:935:3: (lv_name_0_0= RULE_ID )
            {
            // InternalReactionRules.g:935:3: (lv_name_0_0= RULE_ID )
            // InternalReactionRules.g:936:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStateRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleStates"
    // InternalReactionRules.g:955:1: entryRuleStates returns [EObject current=null] : iv_ruleStates= ruleStates EOF ;
    public final EObject entryRuleStates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStates = null;


        try {
            // InternalReactionRules.g:955:47: (iv_ruleStates= ruleStates EOF )
            // InternalReactionRules.g:956:2: iv_ruleStates= ruleStates EOF
            {
             newCompositeNode(grammarAccess.getStatesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStates=ruleStates();

            state._fsp--;

             current =iv_ruleStates; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStates"


    // $ANTLR start "ruleStates"
    // InternalReactionRules.g:962:1: ruleStates returns [EObject current=null] : ( () (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleStates() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_state_2_0 = null;

        EObject lv_state_4_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:968:2: ( ( () (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )? ) )
            // InternalReactionRules.g:969:2: ( () (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )? )
            {
            // InternalReactionRules.g:969:2: ( () (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )? )
            // InternalReactionRules.g:970:3: () (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )?
            {
            // InternalReactionRules.g:970:3: ()
            // InternalReactionRules.g:971:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatesAccess().getStatesAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:977:3: (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalReactionRules.g:978:4: otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatesAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalReactionRules.g:982:4: ( (lv_state_2_0= ruleState ) )
                    // InternalReactionRules.g:983:5: (lv_state_2_0= ruleState )
                    {
                    // InternalReactionRules.g:983:5: (lv_state_2_0= ruleState )
                    // InternalReactionRules.g:984:6: lv_state_2_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getStatesAccess().getStateStateParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_state_2_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatesRule());
                    						}
                    						add(
                    							current,
                    							"state",
                    							lv_state_2_0,
                    							"biochemsimulation.reactionrules.ReactionRules.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReactionRules.g:1001:4: (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==25) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalReactionRules.g:1002:5: otherlv_3= ',' ( (lv_state_4_0= ruleState ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getStatesAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalReactionRules.g:1006:5: ( (lv_state_4_0= ruleState ) )
                    	    // InternalReactionRules.g:1007:6: (lv_state_4_0= ruleState )
                    	    {
                    	    // InternalReactionRules.g:1007:6: (lv_state_4_0= ruleState )
                    	    // InternalReactionRules.g:1008:7: lv_state_4_0= ruleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getStatesAccess().getStateStateParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_state_4_0=ruleState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStatesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"state",
                    	    								lv_state_4_0,
                    	    								"biochemsimulation.reactionrules.ReactionRules.State");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getStatesAccess().getRightCurlyBracketKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStates"


    // $ANTLR start "entryRuleSite"
    // InternalReactionRules.g:1035:1: entryRuleSite returns [EObject current=null] : iv_ruleSite= ruleSite EOF ;
    public final EObject entryRuleSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSite = null;


        try {
            // InternalReactionRules.g:1035:45: (iv_ruleSite= ruleSite EOF )
            // InternalReactionRules.g:1036:2: iv_ruleSite= ruleSite EOF
            {
             newCompositeNode(grammarAccess.getSiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSite=ruleSite();

            state._fsp--;

             current =iv_ruleSite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSite"


    // $ANTLR start "ruleSite"
    // InternalReactionRules.g:1042:1: ruleSite returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_states_1_0= ruleStates ) ) ) ;
    public final EObject ruleSite() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_states_1_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1048:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_states_1_0= ruleStates ) ) ) )
            // InternalReactionRules.g:1049:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_states_1_0= ruleStates ) ) )
            {
            // InternalReactionRules.g:1049:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_states_1_0= ruleStates ) ) )
            // InternalReactionRules.g:1050:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_states_1_0= ruleStates ) )
            {
            // InternalReactionRules.g:1050:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalReactionRules.g:1051:4: (lv_name_0_0= RULE_ID )
            {
            // InternalReactionRules.g:1051:4: (lv_name_0_0= RULE_ID )
            // InternalReactionRules.g:1052:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSiteAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSiteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReactionRules.g:1068:3: ( (lv_states_1_0= ruleStates ) )
            // InternalReactionRules.g:1069:4: (lv_states_1_0= ruleStates )
            {
            // InternalReactionRules.g:1069:4: (lv_states_1_0= ruleStates )
            // InternalReactionRules.g:1070:5: lv_states_1_0= ruleStates
            {

            					newCompositeNode(grammarAccess.getSiteAccess().getStatesStatesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_states_1_0=ruleStates();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSiteRule());
            					}
            					set(
            						current,
            						"states",
            						lv_states_1_0,
            						"biochemsimulation.reactionrules.ReactionRules.States");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSite"


    // $ANTLR start "entryRuleSites"
    // InternalReactionRules.g:1091:1: entryRuleSites returns [EObject current=null] : iv_ruleSites= ruleSites EOF ;
    public final EObject entryRuleSites() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSites = null;


        try {
            // InternalReactionRules.g:1091:46: (iv_ruleSites= ruleSites EOF )
            // InternalReactionRules.g:1092:2: iv_ruleSites= ruleSites EOF
            {
             newCompositeNode(grammarAccess.getSitesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSites=ruleSites();

            state._fsp--;

             current =iv_ruleSites; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSites"


    // $ANTLR start "ruleSites"
    // InternalReactionRules.g:1098:1: ruleSites returns [EObject current=null] : ( () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleSites() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_sites_2_0 = null;

        EObject lv_sites_4_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1104:2: ( ( () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )? ) )
            // InternalReactionRules.g:1105:2: ( () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )? )
            {
            // InternalReactionRules.g:1105:2: ( () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )? )
            // InternalReactionRules.g:1106:3: () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )?
            {
            // InternalReactionRules.g:1106:3: ()
            // InternalReactionRules.g:1107:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSitesAccess().getSitesAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1113:3: (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalReactionRules.g:1114:4: otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getSitesAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalReactionRules.g:1118:4: ( (lv_sites_2_0= ruleSite ) )
                    // InternalReactionRules.g:1119:5: (lv_sites_2_0= ruleSite )
                    {
                    // InternalReactionRules.g:1119:5: (lv_sites_2_0= ruleSite )
                    // InternalReactionRules.g:1120:6: lv_sites_2_0= ruleSite
                    {

                    						newCompositeNode(grammarAccess.getSitesAccess().getSitesSiteParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_sites_2_0=ruleSite();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSitesRule());
                    						}
                    						add(
                    							current,
                    							"sites",
                    							lv_sites_2_0,
                    							"biochemsimulation.reactionrules.ReactionRules.Site");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReactionRules.g:1137:4: (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==25) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalReactionRules.g:1138:5: otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSitesAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalReactionRules.g:1142:5: ( (lv_sites_4_0= ruleSite ) )
                    	    // InternalReactionRules.g:1143:6: (lv_sites_4_0= ruleSite )
                    	    {
                    	    // InternalReactionRules.g:1143:6: (lv_sites_4_0= ruleSite )
                    	    // InternalReactionRules.g:1144:7: lv_sites_4_0= ruleSite
                    	    {

                    	    							newCompositeNode(grammarAccess.getSitesAccess().getSitesSiteParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_sites_4_0=ruleSite();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSitesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sites",
                    	    								lv_sites_4_0,
                    	    								"biochemsimulation.reactionrules.ReactionRules.Site");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSitesAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSites"


    // $ANTLR start "entryRuleAgent"
    // InternalReactionRules.g:1171:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // InternalReactionRules.g:1171:46: (iv_ruleAgent= ruleAgent EOF )
            // InternalReactionRules.g:1172:2: iv_ruleAgent= ruleAgent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgent=ruleAgent();

            state._fsp--;

             current =iv_ruleAgent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalReactionRules.g:1178:1: ruleAgent returns [EObject current=null] : (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) ) ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_sites_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1184:2: ( (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) ) ) )
            // InternalReactionRules.g:1185:2: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) ) )
            {
            // InternalReactionRules.g:1185:2: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) ) )
            // InternalReactionRules.g:1186:3: otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
            		
            // InternalReactionRules.g:1190:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:1191:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:1191:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:1192:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReactionRules.g:1208:3: ( (lv_sites_2_0= ruleSites ) )
            // InternalReactionRules.g:1209:4: (lv_sites_2_0= ruleSites )
            {
            // InternalReactionRules.g:1209:4: (lv_sites_2_0= ruleSites )
            // InternalReactionRules.g:1210:5: lv_sites_2_0= ruleSites
            {

            					newCompositeNode(grammarAccess.getAgentAccess().getSitesSitesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_sites_2_0=ruleSites();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAgentRule());
            					}
            					set(
            						current,
            						"sites",
            						lv_sites_2_0,
            						"biochemsimulation.reactionrules.ReactionRules.Sites");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRulePatternVariable"
    // InternalReactionRules.g:1231:1: entryRulePatternVariable returns [EObject current=null] : iv_rulePatternVariable= rulePatternVariable EOF ;
    public final EObject entryRulePatternVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternVariable = null;


        try {
            // InternalReactionRules.g:1231:56: (iv_rulePatternVariable= rulePatternVariable EOF )
            // InternalReactionRules.g:1232:2: iv_rulePatternVariable= rulePatternVariable EOF
            {
             newCompositeNode(grammarAccess.getPatternVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternVariable=rulePatternVariable();

            state._fsp--;

             current =iv_rulePatternVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternVariable"


    // $ANTLR start "rulePatternVariable"
    // InternalReactionRules.g:1238:1: rulePatternVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_pattern_3_0= rulePattern ) ) ) ;
    public final EObject rulePatternVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_pattern_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1244:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_pattern_3_0= rulePattern ) ) ) )
            // InternalReactionRules.g:1245:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_pattern_3_0= rulePattern ) ) )
            {
            // InternalReactionRules.g:1245:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_pattern_3_0= rulePattern ) ) )
            // InternalReactionRules.g:1246:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_pattern_3_0= rulePattern ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternVariableAccess().getVarKeyword_0());
            		
            // InternalReactionRules.g:1250:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:1251:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:1251:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:1252:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPatternVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getPatternVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalReactionRules.g:1272:3: ( (lv_pattern_3_0= rulePattern ) )
            // InternalReactionRules.g:1273:4: (lv_pattern_3_0= rulePattern )
            {
            // InternalReactionRules.g:1273:4: (lv_pattern_3_0= rulePattern )
            // InternalReactionRules.g:1274:5: lv_pattern_3_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getPatternVariableAccess().getPatternPatternParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_pattern_3_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternVariableRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_3_0,
            						"biochemsimulation.reactionrules.ReactionRules.Pattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternVariable"


    // $ANTLR start "entryRuleArithmeticVariable"
    // InternalReactionRules.g:1295:1: entryRuleArithmeticVariable returns [EObject current=null] : iv_ruleArithmeticVariable= ruleArithmeticVariable EOF ;
    public final EObject entryRuleArithmeticVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticVariable = null;


        try {
            // InternalReactionRules.g:1295:59: (iv_ruleArithmeticVariable= ruleArithmeticVariable EOF )
            // InternalReactionRules.g:1296:2: iv_ruleArithmeticVariable= ruleArithmeticVariable EOF
            {
             newCompositeNode(grammarAccess.getArithmeticVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticVariable=ruleArithmeticVariable();

            state._fsp--;

             current =iv_ruleArithmeticVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticVariable"


    // $ANTLR start "ruleArithmeticVariable"
    // InternalReactionRules.g:1302:1: ruleArithmeticVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticValue ) ) ) ;
    public final EObject ruleArithmeticVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1308:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticValue ) ) ) )
            // InternalReactionRules.g:1309:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticValue ) ) )
            {
            // InternalReactionRules.g:1309:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticValue ) ) )
            // InternalReactionRules.g:1310:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticValue ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getArithmeticVariableAccess().getVarKeyword_0());
            		
            // InternalReactionRules.g:1314:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:1315:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:1315:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:1316:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getArithmeticVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArithmeticVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getArithmeticVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalReactionRules.g:1336:3: ( (lv_value_3_0= ruleArithmeticValue ) )
            // InternalReactionRules.g:1337:4: (lv_value_3_0= ruleArithmeticValue )
            {
            // InternalReactionRules.g:1337:4: (lv_value_3_0= ruleArithmeticValue )
            // InternalReactionRules.g:1338:5: lv_value_3_0= ruleArithmeticValue
            {

            					newCompositeNode(grammarAccess.getArithmeticVariableAccess().getValueArithmeticValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleArithmeticValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArithmeticVariableRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"biochemsimulation.reactionrules.ReactionRules.ArithmeticValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticVariable"


    // $ANTLR start "entryRuleVariable"
    // InternalReactionRules.g:1359:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalReactionRules.g:1359:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalReactionRules.g:1360:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalReactionRules.g:1366:1: ruleVariable returns [EObject current=null] : (this_PatternVariable_0= rulePatternVariable | this_ArithmeticVariable_1= ruleArithmeticVariable ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_PatternVariable_0 = null;

        EObject this_ArithmeticVariable_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1372:2: ( (this_PatternVariable_0= rulePatternVariable | this_ArithmeticVariable_1= ruleArithmeticVariable ) )
            // InternalReactionRules.g:1373:2: (this_PatternVariable_0= rulePatternVariable | this_ArithmeticVariable_1= ruleArithmeticVariable )
            {
            // InternalReactionRules.g:1373:2: (this_PatternVariable_0= rulePatternVariable | this_ArithmeticVariable_1= ruleArithmeticVariable )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==31) ) {
                        int LA14_3 = input.LA(4);

                        if ( (LA14_3==RULE_INT||LA14_3==22) ) {
                            alt14=2;
                        }
                        else if ( (LA14_3==24) ) {
                            alt14=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalReactionRules.g:1374:3: this_PatternVariable_0= rulePatternVariable
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getPatternVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PatternVariable_0=rulePatternVariable();

                    state._fsp--;


                    			current = this_PatternVariable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1383:3: this_ArithmeticVariable_1= ruleArithmeticVariable
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getArithmeticVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArithmeticVariable_1=ruleArithmeticVariable();

                    state._fsp--;


                    			current = this_ArithmeticVariable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleSemiLink"
    // InternalReactionRules.g:1395:1: entryRuleSemiLink returns [EObject current=null] : iv_ruleSemiLink= ruleSemiLink EOF ;
    public final EObject entryRuleSemiLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemiLink = null;


        try {
            // InternalReactionRules.g:1395:49: (iv_ruleSemiLink= ruleSemiLink EOF )
            // InternalReactionRules.g:1396:2: iv_ruleSemiLink= ruleSemiLink EOF
            {
             newCompositeNode(grammarAccess.getSemiLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSemiLink=ruleSemiLink();

            state._fsp--;

             current =iv_ruleSemiLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSemiLink"


    // $ANTLR start "ruleSemiLink"
    // InternalReactionRules.g:1402:1: ruleSemiLink returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_SEMI_LINK ) ) ) ;
    public final EObject ruleSemiLink() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1408:2: ( ( () ( (lv_name_1_0= RULE_SEMI_LINK ) ) ) )
            // InternalReactionRules.g:1409:2: ( () ( (lv_name_1_0= RULE_SEMI_LINK ) ) )
            {
            // InternalReactionRules.g:1409:2: ( () ( (lv_name_1_0= RULE_SEMI_LINK ) ) )
            // InternalReactionRules.g:1410:3: () ( (lv_name_1_0= RULE_SEMI_LINK ) )
            {
            // InternalReactionRules.g:1410:3: ()
            // InternalReactionRules.g:1411:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSemiLinkAccess().getSemiLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1417:3: ( (lv_name_1_0= RULE_SEMI_LINK ) )
            // InternalReactionRules.g:1418:4: (lv_name_1_0= RULE_SEMI_LINK )
            {
            // InternalReactionRules.g:1418:4: (lv_name_1_0= RULE_SEMI_LINK )
            // InternalReactionRules.g:1419:5: lv_name_1_0= RULE_SEMI_LINK
            {
            lv_name_1_0=(Token)match(input,RULE_SEMI_LINK,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSemiLinkAccess().getNameSEMI_LINKTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSemiLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"biochemsimulation.reactionrules.ReactionRules.SEMI_LINK");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSemiLink"


    // $ANTLR start "entryRuleFreeLink"
    // InternalReactionRules.g:1439:1: entryRuleFreeLink returns [EObject current=null] : iv_ruleFreeLink= ruleFreeLink EOF ;
    public final EObject entryRuleFreeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeLink = null;


        try {
            // InternalReactionRules.g:1439:49: (iv_ruleFreeLink= ruleFreeLink EOF )
            // InternalReactionRules.g:1440:2: iv_ruleFreeLink= ruleFreeLink EOF
            {
             newCompositeNode(grammarAccess.getFreeLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFreeLink=ruleFreeLink();

            state._fsp--;

             current =iv_ruleFreeLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFreeLink"


    // $ANTLR start "ruleFreeLink"
    // InternalReactionRules.g:1446:1: ruleFreeLink returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) ) ;
    public final EObject ruleFreeLink() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1452:2: ( ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) ) )
            // InternalReactionRules.g:1453:2: ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) )
            {
            // InternalReactionRules.g:1453:2: ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) )
            // InternalReactionRules.g:1454:3: () ( (lv_name_1_0= RULE_FREE_LINK ) )
            {
            // InternalReactionRules.g:1454:3: ()
            // InternalReactionRules.g:1455:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFreeLinkAccess().getFreeLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1461:3: ( (lv_name_1_0= RULE_FREE_LINK ) )
            // InternalReactionRules.g:1462:4: (lv_name_1_0= RULE_FREE_LINK )
            {
            // InternalReactionRules.g:1462:4: (lv_name_1_0= RULE_FREE_LINK )
            // InternalReactionRules.g:1463:5: lv_name_1_0= RULE_FREE_LINK
            {
            lv_name_1_0=(Token)match(input,RULE_FREE_LINK,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFreeLinkAccess().getNameFREE_LINKTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFreeLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"biochemsimulation.reactionrules.ReactionRules.FREE_LINK");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFreeLink"


    // $ANTLR start "entryRuleWhatEver"
    // InternalReactionRules.g:1483:1: entryRuleWhatEver returns [EObject current=null] : iv_ruleWhatEver= ruleWhatEver EOF ;
    public final EObject entryRuleWhatEver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhatEver = null;


        try {
            // InternalReactionRules.g:1483:49: (iv_ruleWhatEver= ruleWhatEver EOF )
            // InternalReactionRules.g:1484:2: iv_ruleWhatEver= ruleWhatEver EOF
            {
             newCompositeNode(grammarAccess.getWhatEverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhatEver=ruleWhatEver();

            state._fsp--;

             current =iv_ruleWhatEver; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhatEver"


    // $ANTLR start "ruleWhatEver"
    // InternalReactionRules.g:1490:1: ruleWhatEver returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_WHATEVER_LINK ) ) ) ;
    public final EObject ruleWhatEver() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1496:2: ( ( () ( (lv_name_1_0= RULE_WHATEVER_LINK ) ) ) )
            // InternalReactionRules.g:1497:2: ( () ( (lv_name_1_0= RULE_WHATEVER_LINK ) ) )
            {
            // InternalReactionRules.g:1497:2: ( () ( (lv_name_1_0= RULE_WHATEVER_LINK ) ) )
            // InternalReactionRules.g:1498:3: () ( (lv_name_1_0= RULE_WHATEVER_LINK ) )
            {
            // InternalReactionRules.g:1498:3: ()
            // InternalReactionRules.g:1499:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhatEverAccess().getWhatEverAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1505:3: ( (lv_name_1_0= RULE_WHATEVER_LINK ) )
            // InternalReactionRules.g:1506:4: (lv_name_1_0= RULE_WHATEVER_LINK )
            {
            // InternalReactionRules.g:1506:4: (lv_name_1_0= RULE_WHATEVER_LINK )
            // InternalReactionRules.g:1507:5: lv_name_1_0= RULE_WHATEVER_LINK
            {
            lv_name_1_0=(Token)match(input,RULE_WHATEVER_LINK,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWhatEverAccess().getNameWHATEVER_LINKTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhatEverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"biochemsimulation.reactionrules.ReactionRules.WHATEVER_LINK");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhatEver"


    // $ANTLR start "entryRuleIndexedLink"
    // InternalReactionRules.g:1527:1: entryRuleIndexedLink returns [EObject current=null] : iv_ruleIndexedLink= ruleIndexedLink EOF ;
    public final EObject entryRuleIndexedLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedLink = null;


        try {
            // InternalReactionRules.g:1527:52: (iv_ruleIndexedLink= ruleIndexedLink EOF )
            // InternalReactionRules.g:1528:2: iv_ruleIndexedLink= ruleIndexedLink EOF
            {
             newCompositeNode(grammarAccess.getIndexedLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexedLink=ruleIndexedLink();

            state._fsp--;

             current =iv_ruleIndexedLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndexedLink"


    // $ANTLR start "ruleIndexedLink"
    // InternalReactionRules.g:1534:1: ruleIndexedLink returns [EObject current=null] : ( () ( (lv_state_1_0= ruleUnsignedInteger ) ) ) ;
    public final EObject ruleIndexedLink() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_state_1_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1540:2: ( ( () ( (lv_state_1_0= ruleUnsignedInteger ) ) ) )
            // InternalReactionRules.g:1541:2: ( () ( (lv_state_1_0= ruleUnsignedInteger ) ) )
            {
            // InternalReactionRules.g:1541:2: ( () ( (lv_state_1_0= ruleUnsignedInteger ) ) )
            // InternalReactionRules.g:1542:3: () ( (lv_state_1_0= ruleUnsignedInteger ) )
            {
            // InternalReactionRules.g:1542:3: ()
            // InternalReactionRules.g:1543:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIndexedLinkAccess().getIndexedLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1549:3: ( (lv_state_1_0= ruleUnsignedInteger ) )
            // InternalReactionRules.g:1550:4: (lv_state_1_0= ruleUnsignedInteger )
            {
            // InternalReactionRules.g:1550:4: (lv_state_1_0= ruleUnsignedInteger )
            // InternalReactionRules.g:1551:5: lv_state_1_0= ruleUnsignedInteger
            {

            					newCompositeNode(grammarAccess.getIndexedLinkAccess().getStateUnsignedIntegerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_state_1_0=ruleUnsignedInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexedLinkRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_1_0,
            						"biochemsimulation.reactionrules.ReactionRules.UnsignedInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndexedLink"


    // $ANTLR start "entryRuleExactLinkAgent"
    // InternalReactionRules.g:1572:1: entryRuleExactLinkAgent returns [EObject current=null] : iv_ruleExactLinkAgent= ruleExactLinkAgent EOF ;
    public final EObject entryRuleExactLinkAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactLinkAgent = null;


        try {
            // InternalReactionRules.g:1572:55: (iv_ruleExactLinkAgent= ruleExactLinkAgent EOF )
            // InternalReactionRules.g:1573:2: iv_ruleExactLinkAgent= ruleExactLinkAgent EOF
            {
             newCompositeNode(grammarAccess.getExactLinkAgentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExactLinkAgent=ruleExactLinkAgent();

            state._fsp--;

             current =iv_ruleExactLinkAgent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExactLinkAgent"


    // $ANTLR start "ruleExactLinkAgent"
    // InternalReactionRules.g:1579:1: ruleExactLinkAgent returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleExactLinkAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1585:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalReactionRules.g:1586:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalReactionRules.g:1586:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalReactionRules.g:1587:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalReactionRules.g:1587:3: ()
            // InternalReactionRules.g:1588:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExactLinkAgentAccess().getExactLinkAgentAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1594:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:1595:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:1595:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:1596:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExactLinkAgentRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getExactLinkAgentAccess().getAgentAgentCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExactLinkAgent"


    // $ANTLR start "entryRuleExactLinkSite"
    // InternalReactionRules.g:1611:1: entryRuleExactLinkSite returns [EObject current=null] : iv_ruleExactLinkSite= ruleExactLinkSite EOF ;
    public final EObject entryRuleExactLinkSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactLinkSite = null;


        try {
            // InternalReactionRules.g:1611:54: (iv_ruleExactLinkSite= ruleExactLinkSite EOF )
            // InternalReactionRules.g:1612:2: iv_ruleExactLinkSite= ruleExactLinkSite EOF
            {
             newCompositeNode(grammarAccess.getExactLinkSiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExactLinkSite=ruleExactLinkSite();

            state._fsp--;

             current =iv_ruleExactLinkSite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExactLinkSite"


    // $ANTLR start "ruleExactLinkSite"
    // InternalReactionRules.g:1618:1: ruleExactLinkSite returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleExactLinkSite() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1624:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalReactionRules.g:1625:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalReactionRules.g:1625:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalReactionRules.g:1626:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalReactionRules.g:1626:3: ()
            // InternalReactionRules.g:1627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExactLinkSiteAccess().getExactLinkSiteAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1633:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:1634:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:1634:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:1635:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExactLinkSiteRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getExactLinkSiteAccess().getSiteSiteCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExactLinkSite"


    // $ANTLR start "entryRuleExactLink"
    // InternalReactionRules.g:1650:1: entryRuleExactLink returns [EObject current=null] : iv_ruleExactLink= ruleExactLink EOF ;
    public final EObject entryRuleExactLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactLink = null;


        try {
            // InternalReactionRules.g:1650:50: (iv_ruleExactLink= ruleExactLink EOF )
            // InternalReactionRules.g:1651:2: iv_ruleExactLink= ruleExactLink EOF
            {
             newCompositeNode(grammarAccess.getExactLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExactLink=ruleExactLink();

            state._fsp--;

             current =iv_ruleExactLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExactLink"


    // $ANTLR start "ruleExactLink"
    // InternalReactionRules.g:1657:1: ruleExactLink returns [EObject current=null] : ( () ( (lv_linkAgent_1_0= ruleExactLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleExactLinkSite ) ) ) ;
    public final EObject ruleExactLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_linkAgent_1_0 = null;

        EObject lv_linkSite_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1663:2: ( ( () ( (lv_linkAgent_1_0= ruleExactLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleExactLinkSite ) ) ) )
            // InternalReactionRules.g:1664:2: ( () ( (lv_linkAgent_1_0= ruleExactLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleExactLinkSite ) ) )
            {
            // InternalReactionRules.g:1664:2: ( () ( (lv_linkAgent_1_0= ruleExactLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleExactLinkSite ) ) )
            // InternalReactionRules.g:1665:3: () ( (lv_linkAgent_1_0= ruleExactLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleExactLinkSite ) )
            {
            // InternalReactionRules.g:1665:3: ()
            // InternalReactionRules.g:1666:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExactLinkAccess().getExactLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1672:3: ( (lv_linkAgent_1_0= ruleExactLinkAgent ) )
            // InternalReactionRules.g:1673:4: (lv_linkAgent_1_0= ruleExactLinkAgent )
            {
            // InternalReactionRules.g:1673:4: (lv_linkAgent_1_0= ruleExactLinkAgent )
            // InternalReactionRules.g:1674:5: lv_linkAgent_1_0= ruleExactLinkAgent
            {

            					newCompositeNode(grammarAccess.getExactLinkAccess().getLinkAgentExactLinkAgentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_linkAgent_1_0=ruleExactLinkAgent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExactLinkRule());
            					}
            					set(
            						current,
            						"linkAgent",
            						lv_linkAgent_1_0,
            						"biochemsimulation.reactionrules.ReactionRules.ExactLinkAgent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getExactLinkAccess().getFullStopKeyword_2());
            		
            // InternalReactionRules.g:1695:3: ( (lv_linkSite_3_0= ruleExactLinkSite ) )
            // InternalReactionRules.g:1696:4: (lv_linkSite_3_0= ruleExactLinkSite )
            {
            // InternalReactionRules.g:1696:4: (lv_linkSite_3_0= ruleExactLinkSite )
            // InternalReactionRules.g:1697:5: lv_linkSite_3_0= ruleExactLinkSite
            {

            					newCompositeNode(grammarAccess.getExactLinkAccess().getLinkSiteExactLinkSiteParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_linkSite_3_0=ruleExactLinkSite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExactLinkRule());
            					}
            					set(
            						current,
            						"linkSite",
            						lv_linkSite_3_0,
            						"biochemsimulation.reactionrules.ReactionRules.ExactLinkSite");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExactLink"


    // $ANTLR start "entryRuleSiteState"
    // InternalReactionRules.g:1718:1: entryRuleSiteState returns [EObject current=null] : iv_ruleSiteState= ruleSiteState EOF ;
    public final EObject entryRuleSiteState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiteState = null;


        try {
            // InternalReactionRules.g:1718:50: (iv_ruleSiteState= ruleSiteState EOF )
            // InternalReactionRules.g:1719:2: iv_ruleSiteState= ruleSiteState EOF
            {
             newCompositeNode(grammarAccess.getSiteStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiteState=ruleSiteState();

            state._fsp--;

             current =iv_ruleSiteState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSiteState"


    // $ANTLR start "ruleSiteState"
    // InternalReactionRules.g:1725:1: ruleSiteState returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSiteState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1731:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalReactionRules.g:1732:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalReactionRules.g:1732:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalReactionRules.g:1733:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalReactionRules.g:1733:3: ()
            // InternalReactionRules.g:1734:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSiteStateAccess().getSiteStateAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1740:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:1741:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:1741:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:1742:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSiteStateRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getSiteStateAccess().getStateStateCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSiteState"


    // $ANTLR start "entryRuleLinkState"
    // InternalReactionRules.g:1757:1: entryRuleLinkState returns [EObject current=null] : iv_ruleLinkState= ruleLinkState EOF ;
    public final EObject entryRuleLinkState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkState = null;


        try {
            // InternalReactionRules.g:1757:50: (iv_ruleLinkState= ruleLinkState EOF )
            // InternalReactionRules.g:1758:2: iv_ruleLinkState= ruleLinkState EOF
            {
             newCompositeNode(grammarAccess.getLinkStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkState=ruleLinkState();

            state._fsp--;

             current =iv_ruleLinkState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkState"


    // $ANTLR start "ruleLinkState"
    // InternalReactionRules.g:1764:1: ruleLinkState returns [EObject current=null] : ( () ( ( (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleIndexedLink | lv_linkState_1_5= ruleWhatEver ) ) ) ) ;
    public final EObject ruleLinkState() throws RecognitionException {
        EObject current = null;

        EObject lv_linkState_1_1 = null;

        EObject lv_linkState_1_2 = null;

        EObject lv_linkState_1_3 = null;

        EObject lv_linkState_1_4 = null;

        EObject lv_linkState_1_5 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1770:2: ( ( () ( ( (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleIndexedLink | lv_linkState_1_5= ruleWhatEver ) ) ) ) )
            // InternalReactionRules.g:1771:2: ( () ( ( (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleIndexedLink | lv_linkState_1_5= ruleWhatEver ) ) ) )
            {
            // InternalReactionRules.g:1771:2: ( () ( ( (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleIndexedLink | lv_linkState_1_5= ruleWhatEver ) ) ) )
            // InternalReactionRules.g:1772:3: () ( ( (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleIndexedLink | lv_linkState_1_5= ruleWhatEver ) ) )
            {
            // InternalReactionRules.g:1772:3: ()
            // InternalReactionRules.g:1773:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkStateAccess().getLinkStateAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1779:3: ( ( (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleIndexedLink | lv_linkState_1_5= ruleWhatEver ) ) )
            // InternalReactionRules.g:1780:4: ( (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleIndexedLink | lv_linkState_1_5= ruleWhatEver ) )
            {
            // InternalReactionRules.g:1780:4: ( (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleIndexedLink | lv_linkState_1_5= ruleWhatEver ) )
            // InternalReactionRules.g:1781:5: (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleIndexedLink | lv_linkState_1_5= ruleWhatEver )
            {
            // InternalReactionRules.g:1781:5: (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleIndexedLink | lv_linkState_1_5= ruleWhatEver )
            int alt15=5;
            switch ( input.LA(1) ) {
            case RULE_SEMI_LINK:
                {
                alt15=1;
                }
                break;
            case RULE_FREE_LINK:
                {
                alt15=2;
                }
                break;
            case RULE_ID:
                {
                alt15=3;
                }
                break;
            case RULE_INT:
                {
                alt15=4;
                }
                break;
            case RULE_WHATEVER_LINK:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalReactionRules.g:1782:6: lv_linkState_1_1= ruleSemiLink
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateSemiLinkParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_linkState_1_1=ruleSemiLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_1_1,
                    							"biochemsimulation.reactionrules.ReactionRules.SemiLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1798:6: lv_linkState_1_2= ruleFreeLink
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateFreeLinkParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_linkState_1_2=ruleFreeLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_1_2,
                    							"biochemsimulation.reactionrules.ReactionRules.FreeLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalReactionRules.g:1814:6: lv_linkState_1_3= ruleExactLink
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateExactLinkParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_linkState_1_3=ruleExactLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_1_3,
                    							"biochemsimulation.reactionrules.ReactionRules.ExactLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 4 :
                    // InternalReactionRules.g:1830:6: lv_linkState_1_4= ruleIndexedLink
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateIndexedLinkParserRuleCall_1_0_3());
                    					
                    pushFollow(FOLLOW_2);
                    lv_linkState_1_4=ruleIndexedLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_1_4,
                    							"biochemsimulation.reactionrules.ReactionRules.IndexedLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 5 :
                    // InternalReactionRules.g:1846:6: lv_linkState_1_5= ruleWhatEver
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateWhatEverParserRuleCall_1_0_4());
                    					
                    pushFollow(FOLLOW_2);
                    lv_linkState_1_5=ruleWhatEver();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_1_5,
                    							"biochemsimulation.reactionrules.ReactionRules.WhatEver");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkState"


    // $ANTLR start "entryRuleSitePattern"
    // InternalReactionRules.g:1868:1: entryRuleSitePattern returns [EObject current=null] : iv_ruleSitePattern= ruleSitePattern EOF ;
    public final EObject entryRuleSitePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSitePattern = null;


        try {
            // InternalReactionRules.g:1868:52: (iv_ruleSitePattern= ruleSitePattern EOF )
            // InternalReactionRules.g:1869:2: iv_ruleSitePattern= ruleSitePattern EOF
            {
             newCompositeNode(grammarAccess.getSitePatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSitePattern=ruleSitePattern();

            state._fsp--;

             current =iv_ruleSitePattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSitePattern"


    // $ANTLR start "ruleSitePattern"
    // InternalReactionRules.g:1875:1: ruleSitePattern returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_state_3_0= ruleSiteState ) ) otherlv_4= '}' )? otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']' ) ;
    public final EObject ruleSitePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_state_3_0 = null;

        EObject lv_linkState_6_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1881:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_state_3_0= ruleSiteState ) ) otherlv_4= '}' )? otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']' ) )
            // InternalReactionRules.g:1882:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_state_3_0= ruleSiteState ) ) otherlv_4= '}' )? otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']' )
            {
            // InternalReactionRules.g:1882:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_state_3_0= ruleSiteState ) ) otherlv_4= '}' )? otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']' )
            // InternalReactionRules.g:1883:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_state_3_0= ruleSiteState ) ) otherlv_4= '}' )? otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']'
            {
            // InternalReactionRules.g:1883:3: ()
            // InternalReactionRules.g:1884:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSitePatternAccess().getSitePatternAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1890:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:1891:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:1891:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:1892:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSitePatternRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_1, grammarAccess.getSitePatternAccess().getSiteSiteCrossReference_1_0());
            				

            }


            }

            // InternalReactionRules.g:1903:3: (otherlv_2= '{' ( (lv_state_3_0= ruleSiteState ) ) otherlv_4= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalReactionRules.g:1904:4: otherlv_2= '{' ( (lv_state_3_0= ruleSiteState ) ) otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getSitePatternAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalReactionRules.g:1908:4: ( (lv_state_3_0= ruleSiteState ) )
                    // InternalReactionRules.g:1909:5: (lv_state_3_0= ruleSiteState )
                    {
                    // InternalReactionRules.g:1909:5: (lv_state_3_0= ruleSiteState )
                    // InternalReactionRules.g:1910:6: lv_state_3_0= ruleSiteState
                    {

                    						newCompositeNode(grammarAccess.getSitePatternAccess().getStateSiteStateParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_state_3_0=ruleSiteState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSitePatternRule());
                    						}
                    						set(
                    							current,
                    							"state",
                    							lv_state_3_0,
                    							"biochemsimulation.reactionrules.ReactionRules.SiteState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getSitePatternAccess().getRightCurlyBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getSitePatternAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalReactionRules.g:1936:3: ( (lv_linkState_6_0= ruleLinkState ) )
            // InternalReactionRules.g:1937:4: (lv_linkState_6_0= ruleLinkState )
            {
            // InternalReactionRules.g:1937:4: (lv_linkState_6_0= ruleLinkState )
            // InternalReactionRules.g:1938:5: lv_linkState_6_0= ruleLinkState
            {

            					newCompositeNode(grammarAccess.getSitePatternAccess().getLinkStateLinkStateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_linkState_6_0=ruleLinkState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSitePatternRule());
            					}
            					set(
            						current,
            						"linkState",
            						lv_linkState_6_0,
            						"biochemsimulation.reactionrules.ReactionRules.LinkState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSitePatternAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSitePattern"


    // $ANTLR start "entryRuleSitePatterns"
    // InternalReactionRules.g:1963:1: entryRuleSitePatterns returns [EObject current=null] : iv_ruleSitePatterns= ruleSitePatterns EOF ;
    public final EObject entryRuleSitePatterns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSitePatterns = null;


        try {
            // InternalReactionRules.g:1963:53: (iv_ruleSitePatterns= ruleSitePatterns EOF )
            // InternalReactionRules.g:1964:2: iv_ruleSitePatterns= ruleSitePatterns EOF
            {
             newCompositeNode(grammarAccess.getSitePatternsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSitePatterns=ruleSitePatterns();

            state._fsp--;

             current =iv_ruleSitePatterns; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSitePatterns"


    // $ANTLR start "ruleSitePatterns"
    // InternalReactionRules.g:1970:1: ruleSitePatterns returns [EObject current=null] : ( () ( ( (lv_sitePatterns_1_0= ruleSitePattern ) ) (otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) ) )* )? ) ;
    public final EObject ruleSitePatterns() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_sitePatterns_1_0 = null;

        EObject lv_sitePatterns_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1976:2: ( ( () ( ( (lv_sitePatterns_1_0= ruleSitePattern ) ) (otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) ) )* )? ) )
            // InternalReactionRules.g:1977:2: ( () ( ( (lv_sitePatterns_1_0= ruleSitePattern ) ) (otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) ) )* )? )
            {
            // InternalReactionRules.g:1977:2: ( () ( ( (lv_sitePatterns_1_0= ruleSitePattern ) ) (otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) ) )* )? )
            // InternalReactionRules.g:1978:3: () ( ( (lv_sitePatterns_1_0= ruleSitePattern ) ) (otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) ) )* )?
            {
            // InternalReactionRules.g:1978:3: ()
            // InternalReactionRules.g:1979:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSitePatternsAccess().getSitePatternsAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1985:3: ( ( (lv_sitePatterns_1_0= ruleSitePattern ) ) (otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalReactionRules.g:1986:4: ( (lv_sitePatterns_1_0= ruleSitePattern ) ) (otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) ) )*
                    {
                    // InternalReactionRules.g:1986:4: ( (lv_sitePatterns_1_0= ruleSitePattern ) )
                    // InternalReactionRules.g:1987:5: (lv_sitePatterns_1_0= ruleSitePattern )
                    {
                    // InternalReactionRules.g:1987:5: (lv_sitePatterns_1_0= ruleSitePattern )
                    // InternalReactionRules.g:1988:6: lv_sitePatterns_1_0= ruleSitePattern
                    {

                    						newCompositeNode(grammarAccess.getSitePatternsAccess().getSitePatternsSitePatternParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_sitePatterns_1_0=ruleSitePattern();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSitePatternsRule());
                    						}
                    						add(
                    							current,
                    							"sitePatterns",
                    							lv_sitePatterns_1_0,
                    							"biochemsimulation.reactionrules.ReactionRules.SitePattern");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReactionRules.g:2005:4: (otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==25) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalReactionRules.g:2006:5: otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) )
                    	    {
                    	    otherlv_2=(Token)match(input,25,FOLLOW_6); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getSitePatternsAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalReactionRules.g:2010:5: ( (lv_sitePatterns_3_0= ruleSitePattern ) )
                    	    // InternalReactionRules.g:2011:6: (lv_sitePatterns_3_0= ruleSitePattern )
                    	    {
                    	    // InternalReactionRules.g:2011:6: (lv_sitePatterns_3_0= ruleSitePattern )
                    	    // InternalReactionRules.g:2012:7: lv_sitePatterns_3_0= ruleSitePattern
                    	    {

                    	    							newCompositeNode(grammarAccess.getSitePatternsAccess().getSitePatternsSitePatternParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_sitePatterns_3_0=ruleSitePattern();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSitePatternsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sitePatterns",
                    	    								lv_sitePatterns_3_0,
                    	    								"biochemsimulation.reactionrules.ReactionRules.SitePattern");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSitePatterns"


    // $ANTLR start "entryRuleAgentPattern"
    // InternalReactionRules.g:2035:1: entryRuleAgentPattern returns [EObject current=null] : iv_ruleAgentPattern= ruleAgentPattern EOF ;
    public final EObject entryRuleAgentPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgentPattern = null;


        try {
            // InternalReactionRules.g:2035:53: (iv_ruleAgentPattern= ruleAgentPattern EOF )
            // InternalReactionRules.g:2036:2: iv_ruleAgentPattern= ruleAgentPattern EOF
            {
             newCompositeNode(grammarAccess.getAgentPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgentPattern=ruleAgentPattern();

            state._fsp--;

             current =iv_ruleAgentPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgentPattern"


    // $ANTLR start "ruleAgentPattern"
    // InternalReactionRules.g:2042:1: ruleAgentPattern returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_sitePatterns_3_0= ruleSitePatterns ) ) otherlv_4= ')' ) ;
    public final EObject ruleAgentPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sitePatterns_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2048:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_sitePatterns_3_0= ruleSitePatterns ) ) otherlv_4= ')' ) )
            // InternalReactionRules.g:2049:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_sitePatterns_3_0= ruleSitePatterns ) ) otherlv_4= ')' )
            {
            // InternalReactionRules.g:2049:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_sitePatterns_3_0= ruleSitePatterns ) ) otherlv_4= ')' )
            // InternalReactionRules.g:2050:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_sitePatterns_3_0= ruleSitePatterns ) ) otherlv_4= ')'
            {
            // InternalReactionRules.g:2050:3: ()
            // InternalReactionRules.g:2051:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAgentPatternAccess().getAgentPatternAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:2057:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:2058:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:2058:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:2059:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgentPatternRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_1, grammarAccess.getAgentPatternAccess().getAgentAgentCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getAgentPatternAccess().getLeftParenthesisKeyword_2());
            		
            // InternalReactionRules.g:2074:3: ( (lv_sitePatterns_3_0= ruleSitePatterns ) )
            // InternalReactionRules.g:2075:4: (lv_sitePatterns_3_0= ruleSitePatterns )
            {
            // InternalReactionRules.g:2075:4: (lv_sitePatterns_3_0= ruleSitePatterns )
            // InternalReactionRules.g:2076:5: lv_sitePatterns_3_0= ruleSitePatterns
            {

            					newCompositeNode(grammarAccess.getAgentPatternAccess().getSitePatternsSitePatternsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_sitePatterns_3_0=ruleSitePatterns();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAgentPatternRule());
            					}
            					set(
            						current,
            						"sitePatterns",
            						lv_sitePatterns_3_0,
            						"biochemsimulation.reactionrules.ReactionRules.SitePatterns");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAgentPatternAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgentPattern"


    // $ANTLR start "entryRulePattern"
    // InternalReactionRules.g:2101:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalReactionRules.g:2101:48: (iv_rulePattern= rulePattern EOF )
            // InternalReactionRules.g:2102:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalReactionRules.g:2108:1: rulePattern returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}' ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_agentPatterns_2_0 = null;

        EObject lv_agentPatterns_4_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2114:2: ( ( () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}' ) )
            // InternalReactionRules.g:2115:2: ( () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}' )
            {
            // InternalReactionRules.g:2115:2: ( () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}' )
            // InternalReactionRules.g:2116:3: () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}'
            {
            // InternalReactionRules.g:2116:3: ()
            // InternalReactionRules.g:2117:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternAccess().getPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalReactionRules.g:2127:3: ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalReactionRules.g:2128:4: ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )*
                    {
                    // InternalReactionRules.g:2128:4: ( (lv_agentPatterns_2_0= ruleAgentPattern ) )
                    // InternalReactionRules.g:2129:5: (lv_agentPatterns_2_0= ruleAgentPattern )
                    {
                    // InternalReactionRules.g:2129:5: (lv_agentPatterns_2_0= ruleAgentPattern )
                    // InternalReactionRules.g:2130:6: lv_agentPatterns_2_0= ruleAgentPattern
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getAgentPatternsAgentPatternParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_agentPatterns_2_0=ruleAgentPattern();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						add(
                    							current,
                    							"agentPatterns",
                    							lv_agentPatterns_2_0,
                    							"biochemsimulation.reactionrules.ReactionRules.AgentPattern");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReactionRules.g:2147:4: (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==25) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalReactionRules.g:2148:5: otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalReactionRules.g:2152:5: ( (lv_agentPatterns_4_0= ruleAgentPattern ) )
                    	    // InternalReactionRules.g:2153:6: (lv_agentPatterns_4_0= ruleAgentPattern )
                    	    {
                    	    // InternalReactionRules.g:2153:6: (lv_agentPatterns_4_0= ruleAgentPattern )
                    	    // InternalReactionRules.g:2154:7: lv_agentPatterns_4_0= ruleAgentPattern
                    	    {

                    	    							newCompositeNode(grammarAccess.getPatternAccess().getAgentPatternsAgentPatternParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_agentPatterns_4_0=ruleAgentPattern();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"agentPatterns",
                    	    								lv_agentPatterns_4_0,
                    	    								"biochemsimulation.reactionrules.ReactionRules.AgentPattern");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleObservation"
    // InternalReactionRules.g:2181:1: entryRuleObservation returns [EObject current=null] : iv_ruleObservation= ruleObservation EOF ;
    public final EObject entryRuleObservation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObservation = null;


        try {
            // InternalReactionRules.g:2181:52: (iv_ruleObservation= ruleObservation EOF )
            // InternalReactionRules.g:2182:2: iv_ruleObservation= ruleObservation EOF
            {
             newCompositeNode(grammarAccess.getObservationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObservation=ruleObservation();

            state._fsp--;

             current =iv_ruleObservation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObservation"


    // $ANTLR start "ruleObservation"
    // InternalReactionRules.g:2188:1: ruleObservation returns [EObject current=null] : (otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) ) ) ;
    public final EObject ruleObservation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_observationPattern_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2194:2: ( (otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) ) ) )
            // InternalReactionRules.g:2195:2: (otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) ) )
            {
            // InternalReactionRules.g:2195:2: (otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) ) )
            // InternalReactionRules.g:2196:3: otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getObservationAccess().getObsKeyword_0());
            		
            // InternalReactionRules.g:2200:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:2201:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:2201:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:2202:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObservationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObservationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReactionRules.g:2218:3: ( (lv_observationPattern_2_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2219:4: (lv_observationPattern_2_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2219:4: (lv_observationPattern_2_0= rulePatternAssignment )
            // InternalReactionRules.g:2220:5: lv_observationPattern_2_0= rulePatternAssignment
            {

            					newCompositeNode(grammarAccess.getObservationAccess().getObservationPatternPatternAssignmentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_observationPattern_2_0=rulePatternAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObservationRule());
            					}
            					set(
            						current,
            						"observationPattern",
            						lv_observationPattern_2_0,
            						"biochemsimulation.reactionrules.ReactionRules.PatternAssignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObservation"


    // $ANTLR start "entryRuleInitial"
    // InternalReactionRules.g:2241:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalReactionRules.g:2241:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalReactionRules.g:2242:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalReactionRules.g:2248:1: ruleInitial returns [EObject current=null] : (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleUnsignedInteger ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) ) ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_count_2_0 = null;

        EObject lv_initialPattern_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2254:2: ( (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleUnsignedInteger ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) ) ) )
            // InternalReactionRules.g:2255:2: (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleUnsignedInteger ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) ) )
            {
            // InternalReactionRules.g:2255:2: (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleUnsignedInteger ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) ) )
            // InternalReactionRules.g:2256:3: otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleUnsignedInteger ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialAccess().getInitKeyword_0());
            		
            // InternalReactionRules.g:2260:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:2261:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:2261:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:2262:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInitialAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReactionRules.g:2278:3: ( (lv_count_2_0= ruleUnsignedInteger ) )
            // InternalReactionRules.g:2279:4: (lv_count_2_0= ruleUnsignedInteger )
            {
            // InternalReactionRules.g:2279:4: (lv_count_2_0= ruleUnsignedInteger )
            // InternalReactionRules.g:2280:5: lv_count_2_0= ruleUnsignedInteger
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getCountUnsignedIntegerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_count_2_0=ruleUnsignedInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					set(
            						current,
            						"count",
            						lv_count_2_0,
            						"biochemsimulation.reactionrules.ReactionRules.UnsignedInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionRules.g:2297:3: ( (lv_initialPattern_3_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2298:4: (lv_initialPattern_3_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2298:4: (lv_initialPattern_3_0= rulePatternAssignment )
            // InternalReactionRules.g:2299:5: lv_initialPattern_3_0= rulePatternAssignment
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getInitialPatternPatternAssignmentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_initialPattern_3_0=rulePatternAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					set(
            						current,
            						"initialPattern",
            						lv_initialPattern_3_0,
            						"biochemsimulation.reactionrules.ReactionRules.PatternAssignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleAssignFromPattern"
    // InternalReactionRules.g:2320:1: entryRuleAssignFromPattern returns [EObject current=null] : iv_ruleAssignFromPattern= ruleAssignFromPattern EOF ;
    public final EObject entryRuleAssignFromPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignFromPattern = null;


        try {
            // InternalReactionRules.g:2320:58: (iv_ruleAssignFromPattern= ruleAssignFromPattern EOF )
            // InternalReactionRules.g:2321:2: iv_ruleAssignFromPattern= ruleAssignFromPattern EOF
            {
             newCompositeNode(grammarAccess.getAssignFromPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignFromPattern=ruleAssignFromPattern();

            state._fsp--;

             current =iv_ruleAssignFromPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignFromPattern"


    // $ANTLR start "ruleAssignFromPattern"
    // InternalReactionRules.g:2327:1: ruleAssignFromPattern returns [EObject current=null] : ( (lv_pattern_0_0= rulePattern ) ) ;
    public final EObject ruleAssignFromPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_pattern_0_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2333:2: ( ( (lv_pattern_0_0= rulePattern ) ) )
            // InternalReactionRules.g:2334:2: ( (lv_pattern_0_0= rulePattern ) )
            {
            // InternalReactionRules.g:2334:2: ( (lv_pattern_0_0= rulePattern ) )
            // InternalReactionRules.g:2335:3: (lv_pattern_0_0= rulePattern )
            {
            // InternalReactionRules.g:2335:3: (lv_pattern_0_0= rulePattern )
            // InternalReactionRules.g:2336:4: lv_pattern_0_0= rulePattern
            {

            				newCompositeNode(grammarAccess.getAssignFromPatternAccess().getPatternPatternParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_pattern_0_0=rulePattern();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAssignFromPatternRule());
            				}
            				set(
            					current,
            					"pattern",
            					lv_pattern_0_0,
            					"biochemsimulation.reactionrules.ReactionRules.Pattern");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignFromPattern"


    // $ANTLR start "entryRuleAssignFromVariable"
    // InternalReactionRules.g:2356:1: entryRuleAssignFromVariable returns [EObject current=null] : iv_ruleAssignFromVariable= ruleAssignFromVariable EOF ;
    public final EObject entryRuleAssignFromVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignFromVariable = null;


        try {
            // InternalReactionRules.g:2356:59: (iv_ruleAssignFromVariable= ruleAssignFromVariable EOF )
            // InternalReactionRules.g:2357:2: iv_ruleAssignFromVariable= ruleAssignFromVariable EOF
            {
             newCompositeNode(grammarAccess.getAssignFromVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignFromVariable=ruleAssignFromVariable();

            state._fsp--;

             current =iv_ruleAssignFromVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignFromVariable"


    // $ANTLR start "ruleAssignFromVariable"
    // InternalReactionRules.g:2363:1: ruleAssignFromVariable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleAssignFromVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:2369:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalReactionRules.g:2370:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalReactionRules.g:2370:2: ( (otherlv_0= RULE_ID ) )
            // InternalReactionRules.g:2371:3: (otherlv_0= RULE_ID )
            {
            // InternalReactionRules.g:2371:3: (otherlv_0= RULE_ID )
            // InternalReactionRules.g:2372:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAssignFromVariableRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getAssignFromVariableAccess().getPatternVarPatternVariableCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignFromVariable"


    // $ANTLR start "entryRulePatternAssignment"
    // InternalReactionRules.g:2386:1: entryRulePatternAssignment returns [EObject current=null] : iv_rulePatternAssignment= rulePatternAssignment EOF ;
    public final EObject entryRulePatternAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternAssignment = null;


        try {
            // InternalReactionRules.g:2386:58: (iv_rulePatternAssignment= rulePatternAssignment EOF )
            // InternalReactionRules.g:2387:2: iv_rulePatternAssignment= rulePatternAssignment EOF
            {
             newCompositeNode(grammarAccess.getPatternAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternAssignment=rulePatternAssignment();

            state._fsp--;

             current =iv_rulePatternAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternAssignment"


    // $ANTLR start "rulePatternAssignment"
    // InternalReactionRules.g:2393:1: rulePatternAssignment returns [EObject current=null] : (this_AssignFromPattern_0= ruleAssignFromPattern | this_AssignFromVariable_1= ruleAssignFromVariable ) ;
    public final EObject rulePatternAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_AssignFromPattern_0 = null;

        EObject this_AssignFromVariable_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2399:2: ( (this_AssignFromPattern_0= ruleAssignFromPattern | this_AssignFromVariable_1= ruleAssignFromVariable ) )
            // InternalReactionRules.g:2400:2: (this_AssignFromPattern_0= ruleAssignFromPattern | this_AssignFromVariable_1= ruleAssignFromVariable )
            {
            // InternalReactionRules.g:2400:2: (this_AssignFromPattern_0= ruleAssignFromPattern | this_AssignFromVariable_1= ruleAssignFromVariable )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalReactionRules.g:2401:3: this_AssignFromPattern_0= ruleAssignFromPattern
                    {

                    			newCompositeNode(grammarAccess.getPatternAssignmentAccess().getAssignFromPatternParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssignFromPattern_0=ruleAssignFromPattern();

                    state._fsp--;


                    			current = this_AssignFromPattern_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:2410:3: this_AssignFromVariable_1= ruleAssignFromVariable
                    {

                    			newCompositeNode(grammarAccess.getPatternAssignmentAccess().getAssignFromVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssignFromVariable_1=ruleAssignFromVariable();

                    state._fsp--;


                    			current = this_AssignFromVariable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternAssignment"


    // $ANTLR start "entryRuleRuleVariables"
    // InternalReactionRules.g:2422:1: entryRuleRuleVariables returns [EObject current=null] : iv_ruleRuleVariables= ruleRuleVariables EOF ;
    public final EObject entryRuleRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleVariables = null;


        try {
            // InternalReactionRules.g:2422:54: (iv_ruleRuleVariables= ruleRuleVariables EOF )
            // InternalReactionRules.g:2423:2: iv_ruleRuleVariables= ruleRuleVariables EOF
            {
             newCompositeNode(grammarAccess.getRuleVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleVariables=ruleRuleVariables();

            state._fsp--;

             current =iv_ruleRuleVariables; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleVariables"


    // $ANTLR start "ruleRuleVariables"
    // InternalReactionRules.g:2429:1: ruleRuleVariables returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRuleVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalReactionRules.g:2435:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalReactionRules.g:2436:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalReactionRules.g:2436:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalReactionRules.g:2437:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalReactionRules.g:2437:3: ( (otherlv_0= RULE_ID ) )
            // InternalReactionRules.g:2438:4: (otherlv_0= RULE_ID )
            {
            // InternalReactionRules.g:2438:4: (otherlv_0= RULE_ID )
            // InternalReactionRules.g:2439:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleVariablesRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getRuleVariablesAccess().getVariablesArithmeticVariableCrossReference_0_0());
            				

            }


            }

            // InternalReactionRules.g:2450:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalReactionRules.g:2451:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRuleVariablesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalReactionRules.g:2455:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalReactionRules.g:2456:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalReactionRules.g:2456:5: (otherlv_2= RULE_ID )
            	    // InternalReactionRules.g:2457:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRuleVariablesRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    						newLeafNode(otherlv_2, grammarAccess.getRuleVariablesAccess().getVariablesArithmeticVariableCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleVariables"


    // $ANTLR start "entryRuleUnidirectionalRule"
    // InternalReactionRules.g:2473:1: entryRuleUnidirectionalRule returns [EObject current=null] : iv_ruleUnidirectionalRule= ruleUnidirectionalRule EOF ;
    public final EObject entryRuleUnidirectionalRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnidirectionalRule = null;


        try {
            // InternalReactionRules.g:2473:59: (iv_ruleUnidirectionalRule= ruleUnidirectionalRule EOF )
            // InternalReactionRules.g:2474:2: iv_ruleUnidirectionalRule= ruleUnidirectionalRule EOF
            {
             newCompositeNode(grammarAccess.getUnidirectionalRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnidirectionalRule=ruleUnidirectionalRule();

            state._fsp--;

             current =iv_ruleUnidirectionalRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnidirectionalRule"


    // $ANTLR start "ruleUnidirectionalRule"
    // InternalReactionRules.g:2480:1: ruleUnidirectionalRule returns [EObject current=null] : ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' ) ;
    public final EObject ruleUnidirectionalRule() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_0=null;
        Token this_AT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;

        EObject lv_variables_5_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2486:2: ( ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' ) )
            // InternalReactionRules.g:2487:2: ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' )
            {
            // InternalReactionRules.g:2487:2: ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' )
            // InternalReactionRules.g:2488:3: ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']'
            {
            // InternalReactionRules.g:2488:3: ( (lv_lhs_0_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2489:4: (lv_lhs_0_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2489:4: (lv_lhs_0_0= rulePatternAssignment )
            // InternalReactionRules.g:2490:5: lv_lhs_0_0= rulePatternAssignment
            {

            					newCompositeNode(grammarAccess.getUnidirectionalRuleAccess().getLhsPatternAssignmentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_lhs_0_0=rulePatternAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnidirectionalRuleRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_0_0,
            						"biochemsimulation.reactionrules.ReactionRules.PatternAssignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionRules.g:2507:3: ( (lv_operator_1_0= RULE_UNI ) )
            // InternalReactionRules.g:2508:4: (lv_operator_1_0= RULE_UNI )
            {
            // InternalReactionRules.g:2508:4: (lv_operator_1_0= RULE_UNI )
            // InternalReactionRules.g:2509:5: lv_operator_1_0= RULE_UNI
            {
            lv_operator_1_0=(Token)match(input,RULE_UNI,FOLLOW_27); 

            					newLeafNode(lv_operator_1_0, grammarAccess.getUnidirectionalRuleAccess().getOperatorUNITerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnidirectionalRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"biochemsimulation.reactionrules.ReactionRules.UNI");
            				

            }


            }

            // InternalReactionRules.g:2525:3: ( (lv_rhs_2_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2526:4: (lv_rhs_2_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2526:4: (lv_rhs_2_0= rulePatternAssignment )
            // InternalReactionRules.g:2527:5: lv_rhs_2_0= rulePatternAssignment
            {

            					newCompositeNode(grammarAccess.getUnidirectionalRuleAccess().getRhsPatternAssignmentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
            lv_rhs_2_0=rulePatternAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnidirectionalRuleRule());
            					}
            					set(
            						current,
            						"rhs",
            						lv_rhs_2_0,
            						"biochemsimulation.reactionrules.ReactionRules.PatternAssignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_AT_3=(Token)match(input,RULE_AT,FOLLOW_21); 

            			newLeafNode(this_AT_3, grammarAccess.getUnidirectionalRuleAccess().getATTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getUnidirectionalRuleAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalReactionRules.g:2552:3: ( (lv_variables_5_0= ruleRuleVariables ) )
            // InternalReactionRules.g:2553:4: (lv_variables_5_0= ruleRuleVariables )
            {
            // InternalReactionRules.g:2553:4: (lv_variables_5_0= ruleRuleVariables )
            // InternalReactionRules.g:2554:5: lv_variables_5_0= ruleRuleVariables
            {

            					newCompositeNode(grammarAccess.getUnidirectionalRuleAccess().getVariablesRuleVariablesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
            lv_variables_5_0=ruleRuleVariables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnidirectionalRuleRule());
            					}
            					set(
            						current,
            						"variables",
            						lv_variables_5_0,
            						"biochemsimulation.reactionrules.ReactionRules.RuleVariables");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getUnidirectionalRuleAccess().getRightSquareBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnidirectionalRule"


    // $ANTLR start "entryRuleBidirectionalRule"
    // InternalReactionRules.g:2579:1: entryRuleBidirectionalRule returns [EObject current=null] : iv_ruleBidirectionalRule= ruleBidirectionalRule EOF ;
    public final EObject entryRuleBidirectionalRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBidirectionalRule = null;


        try {
            // InternalReactionRules.g:2579:58: (iv_ruleBidirectionalRule= ruleBidirectionalRule EOF )
            // InternalReactionRules.g:2580:2: iv_ruleBidirectionalRule= ruleBidirectionalRule EOF
            {
             newCompositeNode(grammarAccess.getBidirectionalRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBidirectionalRule=ruleBidirectionalRule();

            state._fsp--;

             current =iv_ruleBidirectionalRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBidirectionalRule"


    // $ANTLR start "ruleBidirectionalRule"
    // InternalReactionRules.g:2586:1: ruleBidirectionalRule returns [EObject current=null] : ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' ) ;
    public final EObject ruleBidirectionalRule() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_0=null;
        Token this_AT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;

        EObject lv_variables_5_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2592:2: ( ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' ) )
            // InternalReactionRules.g:2593:2: ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' )
            {
            // InternalReactionRules.g:2593:2: ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' )
            // InternalReactionRules.g:2594:3: ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']'
            {
            // InternalReactionRules.g:2594:3: ( (lv_lhs_0_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2595:4: (lv_lhs_0_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2595:4: (lv_lhs_0_0= rulePatternAssignment )
            // InternalReactionRules.g:2596:5: lv_lhs_0_0= rulePatternAssignment
            {

            					newCompositeNode(grammarAccess.getBidirectionalRuleAccess().getLhsPatternAssignmentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_lhs_0_0=rulePatternAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBidirectionalRuleRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_0_0,
            						"biochemsimulation.reactionrules.ReactionRules.PatternAssignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionRules.g:2613:3: ( (lv_operator_1_0= RULE_BI ) )
            // InternalReactionRules.g:2614:4: (lv_operator_1_0= RULE_BI )
            {
            // InternalReactionRules.g:2614:4: (lv_operator_1_0= RULE_BI )
            // InternalReactionRules.g:2615:5: lv_operator_1_0= RULE_BI
            {
            lv_operator_1_0=(Token)match(input,RULE_BI,FOLLOW_27); 

            					newLeafNode(lv_operator_1_0, grammarAccess.getBidirectionalRuleAccess().getOperatorBITerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBidirectionalRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"biochemsimulation.reactionrules.ReactionRules.BI");
            				

            }


            }

            // InternalReactionRules.g:2631:3: ( (lv_rhs_2_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2632:4: (lv_rhs_2_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2632:4: (lv_rhs_2_0= rulePatternAssignment )
            // InternalReactionRules.g:2633:5: lv_rhs_2_0= rulePatternAssignment
            {

            					newCompositeNode(grammarAccess.getBidirectionalRuleAccess().getRhsPatternAssignmentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
            lv_rhs_2_0=rulePatternAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBidirectionalRuleRule());
            					}
            					set(
            						current,
            						"rhs",
            						lv_rhs_2_0,
            						"biochemsimulation.reactionrules.ReactionRules.PatternAssignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_AT_3=(Token)match(input,RULE_AT,FOLLOW_21); 

            			newLeafNode(this_AT_3, grammarAccess.getBidirectionalRuleAccess().getATTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getBidirectionalRuleAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalReactionRules.g:2658:3: ( (lv_variables_5_0= ruleRuleVariables ) )
            // InternalReactionRules.g:2659:4: (lv_variables_5_0= ruleRuleVariables )
            {
            // InternalReactionRules.g:2659:4: (lv_variables_5_0= ruleRuleVariables )
            // InternalReactionRules.g:2660:5: lv_variables_5_0= ruleRuleVariables
            {

            					newCompositeNode(grammarAccess.getBidirectionalRuleAccess().getVariablesRuleVariablesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
            lv_variables_5_0=ruleRuleVariables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBidirectionalRuleRule());
            					}
            					set(
            						current,
            						"variables",
            						lv_variables_5_0,
            						"biochemsimulation.reactionrules.ReactionRules.RuleVariables");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBidirectionalRuleAccess().getRightSquareBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBidirectionalRule"


    // $ANTLR start "entryRuleRuleBody"
    // InternalReactionRules.g:2685:1: entryRuleRuleBody returns [EObject current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final EObject entryRuleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBody = null;


        try {
            // InternalReactionRules.g:2685:49: (iv_ruleRuleBody= ruleRuleBody EOF )
            // InternalReactionRules.g:2686:2: iv_ruleRuleBody= ruleRuleBody EOF
            {
             newCompositeNode(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleBody=ruleRuleBody();

            state._fsp--;

             current =iv_ruleRuleBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleBody"


    // $ANTLR start "ruleRuleBody"
    // InternalReactionRules.g:2692:1: ruleRuleBody returns [EObject current=null] : (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule ) ;
    public final EObject ruleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject this_UnidirectionalRule_0 = null;

        EObject this_BidirectionalRule_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2698:2: ( (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule ) )
            // InternalReactionRules.g:2699:2: (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule )
            {
            // InternalReactionRules.g:2699:2: (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalReactionRules.g:2700:3: this_UnidirectionalRule_0= ruleUnidirectionalRule
                    {

                    			newCompositeNode(grammarAccess.getRuleBodyAccess().getUnidirectionalRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnidirectionalRule_0=ruleUnidirectionalRule();

                    state._fsp--;


                    			current = this_UnidirectionalRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:2709:3: this_BidirectionalRule_1= ruleBidirectionalRule
                    {

                    			newCompositeNode(grammarAccess.getRuleBodyAccess().getBidirectionalRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BidirectionalRule_1=ruleBidirectionalRule();

                    state._fsp--;


                    			current = this_BidirectionalRule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRuleRule"
    // InternalReactionRules.g:2721:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalReactionRules.g:2721:45: (iv_ruleRule= ruleRule EOF )
            // InternalReactionRules.g:2722:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalReactionRules.g:2728:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2734:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) ) ) )
            // InternalReactionRules.g:2735:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) ) )
            {
            // InternalReactionRules.g:2735:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) ) )
            // InternalReactionRules.g:2736:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalReactionRules.g:2740:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:2741:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:2741:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:2742:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReactionRules.g:2758:3: ( (lv_rule_2_0= ruleRuleBody ) )
            // InternalReactionRules.g:2759:4: (lv_rule_2_0= ruleRuleBody )
            {
            // InternalReactionRules.g:2759:4: (lv_rule_2_0= ruleRuleBody )
            // InternalReactionRules.g:2760:5: lv_rule_2_0= ruleRuleBody
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getRuleRuleBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rule_2_0=ruleRuleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_2_0,
            						"biochemsimulation.reactionrules.ReactionRules.RuleBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\4\1\6\3\uffff\1\10\2\uffff";
    static final String dfa_3s = "\2\6\2\27\1\uffff\1\6\1\uffff\1\7\2\uffff";
    static final String dfa_4s = "\1\26\1\6\2\44\1\uffff\1\6\1\uffff\1\44\2\uffff";
    static final String dfa_5s = "\4\uffff\1\2\1\uffff\1\3\1\uffff\1\1\1\4";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\17\uffff\1\1",
            "\1\3",
            "\1\5\5\uffff\2\4\3\uffff\3\4",
            "\1\5\5\uffff\2\6\3\uffff\3\6",
            "",
            "\1\7",
            "",
            "\1\11\25\uffff\2\10\3\uffff\3\10",
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

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "836:2: (this_Float_0= ruleFloat | this_UnsignedInteger_1= ruleUnsignedInteger | this_SignedInteger_2= ruleSignedInteger | this_ScientificFloat_3= ruleScientificFloat )";
        }
    }
    static final String dfa_8s = "\103\uffff";
    static final String dfa_9s = "\2\5\1\13\1\33\1\13\2\uffff\1\5\1\30\1\31\3\5\1\32\2\41\1\27\2\41\1\33\1\40\1\31\3\5\1\41\1\30\1\31\1\30\4\5\1\32\2\41\1\27\2\41\1\32\2\41\1\27\2\41\1\40\1\31\1\5\1\40\1\31\2\5\2\41\1\30\2\5\1\32\2\41\1\27\2\41\1\40\1\31\1\5\1\41";
    static final String dfa_10s = "\1\30\1\32\1\15\1\33\1\15\2\uffff\1\34\1\40\1\32\1\5\1\12\1\5\1\32\2\41\1\27\2\41\1\33\1\40\1\34\1\5\1\34\1\5\1\41\1\40\1\32\1\40\1\5\1\12\1\5\1\12\1\32\2\41\1\27\2\41\1\32\2\41\1\27\2\41\1\40\1\34\1\5\1\40\1\34\2\5\2\41\1\40\1\5\1\12\1\32\2\41\1\27\2\41\1\40\1\34\1\5\1\41";
    static final String dfa_11s = "\5\uffff\1\2\1\1\74\uffff";
    static final String dfa_12s = "\103\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\22\uffff\1\1",
            "\1\3\24\uffff\1\4",
            "\1\6\1\uffff\1\5",
            "\1\7",
            "\1\6\1\uffff\1\5",
            "",
            "",
            "\1\10\26\uffff\1\11",
            "\1\12\7\uffff\1\13",
            "\1\14\1\4",
            "\1\15",
            "\1\20\1\21\1\uffff\1\16\1\17\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\25",
            "\1\26",
            "\1\25",
            "\1\25",
            "\1\27",
            "\1\13",
            "\1\30\2\uffff\1\11",
            "\1\31",
            "\1\32\26\uffff\1\33",
            "\1\34",
            "\1\25",
            "\1\35\7\uffff\1\36",
            "\1\14\1\4",
            "\1\37\7\uffff\1\40",
            "\1\41",
            "\1\44\1\45\1\uffff\1\42\1\43\1\46",
            "\1\47",
            "\1\52\1\53\1\uffff\1\50\1\51\1\54",
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
            "\1\63\2\uffff\1\33",
            "\1\64",
            "\1\40",
            "\1\30\2\uffff\1\11",
            "\1\65",
            "\1\66",
            "\1\56",
            "\1\61",
            "\1\67\7\uffff\1\70",
            "\1\71",
            "\1\74\1\75\1\uffff\1\72\1\73\1\76",
            "\1\77",
            "\1\100",
            "\1\100",
            "\1\101",
            "\1\100",
            "\1\100",
            "\1\70",
            "\1\63\2\uffff\1\33",
            "\1\102",
            "\1\100"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2699:2: (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001C60200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001C60000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000760L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002000L});

}