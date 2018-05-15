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
    // InternalReactionRules.g:1402:1: ruleSemiLink returns [EObject current=null] : ( () this_SEMI_LINK_1= RULE_SEMI_LINK ) ;
    public final EObject ruleSemiLink() throws RecognitionException {
        EObject current = null;

        Token this_SEMI_LINK_1=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1408:2: ( ( () this_SEMI_LINK_1= RULE_SEMI_LINK ) )
            // InternalReactionRules.g:1409:2: ( () this_SEMI_LINK_1= RULE_SEMI_LINK )
            {
            // InternalReactionRules.g:1409:2: ( () this_SEMI_LINK_1= RULE_SEMI_LINK )
            // InternalReactionRules.g:1410:3: () this_SEMI_LINK_1= RULE_SEMI_LINK
            {
            // InternalReactionRules.g:1410:3: ()
            // InternalReactionRules.g:1411:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSemiLinkAccess().getSemiLinkAction_0(),
            					current);
            			

            }

            this_SEMI_LINK_1=(Token)match(input,RULE_SEMI_LINK,FOLLOW_2); 

            			newLeafNode(this_SEMI_LINK_1, grammarAccess.getSemiLinkAccess().getSEMI_LINKTerminalRuleCall_1());
            		

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
    // InternalReactionRules.g:1425:1: entryRuleFreeLink returns [EObject current=null] : iv_ruleFreeLink= ruleFreeLink EOF ;
    public final EObject entryRuleFreeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeLink = null;


        try {
            // InternalReactionRules.g:1425:49: (iv_ruleFreeLink= ruleFreeLink EOF )
            // InternalReactionRules.g:1426:2: iv_ruleFreeLink= ruleFreeLink EOF
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
    // InternalReactionRules.g:1432:1: ruleFreeLink returns [EObject current=null] : ( () this_FREE_LINK_1= RULE_FREE_LINK ) ;
    public final EObject ruleFreeLink() throws RecognitionException {
        EObject current = null;

        Token this_FREE_LINK_1=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1438:2: ( ( () this_FREE_LINK_1= RULE_FREE_LINK ) )
            // InternalReactionRules.g:1439:2: ( () this_FREE_LINK_1= RULE_FREE_LINK )
            {
            // InternalReactionRules.g:1439:2: ( () this_FREE_LINK_1= RULE_FREE_LINK )
            // InternalReactionRules.g:1440:3: () this_FREE_LINK_1= RULE_FREE_LINK
            {
            // InternalReactionRules.g:1440:3: ()
            // InternalReactionRules.g:1441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFreeLinkAccess().getFreeLinkAction_0(),
            					current);
            			

            }

            this_FREE_LINK_1=(Token)match(input,RULE_FREE_LINK,FOLLOW_2); 

            			newLeafNode(this_FREE_LINK_1, grammarAccess.getFreeLinkAccess().getFREE_LINKTerminalRuleCall_1());
            		

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
    // InternalReactionRules.g:1455:1: entryRuleWhatEver returns [EObject current=null] : iv_ruleWhatEver= ruleWhatEver EOF ;
    public final EObject entryRuleWhatEver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhatEver = null;


        try {
            // InternalReactionRules.g:1455:49: (iv_ruleWhatEver= ruleWhatEver EOF )
            // InternalReactionRules.g:1456:2: iv_ruleWhatEver= ruleWhatEver EOF
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
    // InternalReactionRules.g:1462:1: ruleWhatEver returns [EObject current=null] : ( () this_WHATEVER_LINK_1= RULE_WHATEVER_LINK ) ;
    public final EObject ruleWhatEver() throws RecognitionException {
        EObject current = null;

        Token this_WHATEVER_LINK_1=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1468:2: ( ( () this_WHATEVER_LINK_1= RULE_WHATEVER_LINK ) )
            // InternalReactionRules.g:1469:2: ( () this_WHATEVER_LINK_1= RULE_WHATEVER_LINK )
            {
            // InternalReactionRules.g:1469:2: ( () this_WHATEVER_LINK_1= RULE_WHATEVER_LINK )
            // InternalReactionRules.g:1470:3: () this_WHATEVER_LINK_1= RULE_WHATEVER_LINK
            {
            // InternalReactionRules.g:1470:3: ()
            // InternalReactionRules.g:1471:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhatEverAccess().getWhatEverAction_0(),
            					current);
            			

            }

            this_WHATEVER_LINK_1=(Token)match(input,RULE_WHATEVER_LINK,FOLLOW_2); 

            			newLeafNode(this_WHATEVER_LINK_1, grammarAccess.getWhatEverAccess().getWHATEVER_LINKTerminalRuleCall_1());
            		

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


    // $ANTLR start "entryRuleLimitLink"
    // InternalReactionRules.g:1485:1: entryRuleLimitLink returns [EObject current=null] : iv_ruleLimitLink= ruleLimitLink EOF ;
    public final EObject entryRuleLimitLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimitLink = null;


        try {
            // InternalReactionRules.g:1485:50: (iv_ruleLimitLink= ruleLimitLink EOF )
            // InternalReactionRules.g:1486:2: iv_ruleLimitLink= ruleLimitLink EOF
            {
             newCompositeNode(grammarAccess.getLimitLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLimitLink=ruleLimitLink();

            state._fsp--;

             current =iv_ruleLimitLink; 
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
    // $ANTLR end "entryRuleLimitLink"


    // $ANTLR start "ruleLimitLink"
    // InternalReactionRules.g:1492:1: ruleLimitLink returns [EObject current=null] : ( () ( (lv_state_1_0= ruleUnsignedInteger ) ) ) ;
    public final EObject ruleLimitLink() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_state_1_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1498:2: ( ( () ( (lv_state_1_0= ruleUnsignedInteger ) ) ) )
            // InternalReactionRules.g:1499:2: ( () ( (lv_state_1_0= ruleUnsignedInteger ) ) )
            {
            // InternalReactionRules.g:1499:2: ( () ( (lv_state_1_0= ruleUnsignedInteger ) ) )
            // InternalReactionRules.g:1500:3: () ( (lv_state_1_0= ruleUnsignedInteger ) )
            {
            // InternalReactionRules.g:1500:3: ()
            // InternalReactionRules.g:1501:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLimitLinkAccess().getLimitLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1507:3: ( (lv_state_1_0= ruleUnsignedInteger ) )
            // InternalReactionRules.g:1508:4: (lv_state_1_0= ruleUnsignedInteger )
            {
            // InternalReactionRules.g:1508:4: (lv_state_1_0= ruleUnsignedInteger )
            // InternalReactionRules.g:1509:5: lv_state_1_0= ruleUnsignedInteger
            {

            					newCompositeNode(grammarAccess.getLimitLinkAccess().getStateUnsignedIntegerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_state_1_0=ruleUnsignedInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitLinkRule());
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
    // $ANTLR end "ruleLimitLink"


    // $ANTLR start "entryRuleExactLinkAgent"
    // InternalReactionRules.g:1530:1: entryRuleExactLinkAgent returns [EObject current=null] : iv_ruleExactLinkAgent= ruleExactLinkAgent EOF ;
    public final EObject entryRuleExactLinkAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactLinkAgent = null;


        try {
            // InternalReactionRules.g:1530:55: (iv_ruleExactLinkAgent= ruleExactLinkAgent EOF )
            // InternalReactionRules.g:1531:2: iv_ruleExactLinkAgent= ruleExactLinkAgent EOF
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
    // InternalReactionRules.g:1537:1: ruleExactLinkAgent returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleExactLinkAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1543:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalReactionRules.g:1544:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalReactionRules.g:1544:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalReactionRules.g:1545:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalReactionRules.g:1545:3: ()
            // InternalReactionRules.g:1546:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExactLinkAgentAccess().getExactLinkAgentAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1552:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:1553:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:1553:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:1554:5: otherlv_1= RULE_ID
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
    // InternalReactionRules.g:1569:1: entryRuleExactLinkSite returns [EObject current=null] : iv_ruleExactLinkSite= ruleExactLinkSite EOF ;
    public final EObject entryRuleExactLinkSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactLinkSite = null;


        try {
            // InternalReactionRules.g:1569:54: (iv_ruleExactLinkSite= ruleExactLinkSite EOF )
            // InternalReactionRules.g:1570:2: iv_ruleExactLinkSite= ruleExactLinkSite EOF
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
    // InternalReactionRules.g:1576:1: ruleExactLinkSite returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleExactLinkSite() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1582:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalReactionRules.g:1583:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalReactionRules.g:1583:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalReactionRules.g:1584:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalReactionRules.g:1584:3: ()
            // InternalReactionRules.g:1585:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExactLinkSiteAccess().getExactLinkSiteAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1591:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:1592:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:1592:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:1593:5: otherlv_1= RULE_ID
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
    // InternalReactionRules.g:1608:1: entryRuleExactLink returns [EObject current=null] : iv_ruleExactLink= ruleExactLink EOF ;
    public final EObject entryRuleExactLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactLink = null;


        try {
            // InternalReactionRules.g:1608:50: (iv_ruleExactLink= ruleExactLink EOF )
            // InternalReactionRules.g:1609:2: iv_ruleExactLink= ruleExactLink EOF
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
    // InternalReactionRules.g:1615:1: ruleExactLink returns [EObject current=null] : ( () ( (lv_linkAgent_1_0= ruleExactLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleExactLinkSite ) ) ) ;
    public final EObject ruleExactLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_linkAgent_1_0 = null;

        EObject lv_linkSite_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1621:2: ( ( () ( (lv_linkAgent_1_0= ruleExactLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleExactLinkSite ) ) ) )
            // InternalReactionRules.g:1622:2: ( () ( (lv_linkAgent_1_0= ruleExactLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleExactLinkSite ) ) )
            {
            // InternalReactionRules.g:1622:2: ( () ( (lv_linkAgent_1_0= ruleExactLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleExactLinkSite ) ) )
            // InternalReactionRules.g:1623:3: () ( (lv_linkAgent_1_0= ruleExactLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleExactLinkSite ) )
            {
            // InternalReactionRules.g:1623:3: ()
            // InternalReactionRules.g:1624:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExactLinkAccess().getExactLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1630:3: ( (lv_linkAgent_1_0= ruleExactLinkAgent ) )
            // InternalReactionRules.g:1631:4: (lv_linkAgent_1_0= ruleExactLinkAgent )
            {
            // InternalReactionRules.g:1631:4: (lv_linkAgent_1_0= ruleExactLinkAgent )
            // InternalReactionRules.g:1632:5: lv_linkAgent_1_0= ruleExactLinkAgent
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
            		
            // InternalReactionRules.g:1653:3: ( (lv_linkSite_3_0= ruleExactLinkSite ) )
            // InternalReactionRules.g:1654:4: (lv_linkSite_3_0= ruleExactLinkSite )
            {
            // InternalReactionRules.g:1654:4: (lv_linkSite_3_0= ruleExactLinkSite )
            // InternalReactionRules.g:1655:5: lv_linkSite_3_0= ruleExactLinkSite
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
    // InternalReactionRules.g:1676:1: entryRuleSiteState returns [EObject current=null] : iv_ruleSiteState= ruleSiteState EOF ;
    public final EObject entryRuleSiteState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiteState = null;


        try {
            // InternalReactionRules.g:1676:50: (iv_ruleSiteState= ruleSiteState EOF )
            // InternalReactionRules.g:1677:2: iv_ruleSiteState= ruleSiteState EOF
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
    // InternalReactionRules.g:1683:1: ruleSiteState returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSiteState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1689:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalReactionRules.g:1690:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalReactionRules.g:1690:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalReactionRules.g:1691:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalReactionRules.g:1691:3: ()
            // InternalReactionRules.g:1692:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSiteStateAccess().getSiteStateAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1698:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:1699:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:1699:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:1700:5: otherlv_1= RULE_ID
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
    // InternalReactionRules.g:1715:1: entryRuleLinkState returns [EObject current=null] : iv_ruleLinkState= ruleLinkState EOF ;
    public final EObject entryRuleLinkState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkState = null;


        try {
            // InternalReactionRules.g:1715:50: (iv_ruleLinkState= ruleLinkState EOF )
            // InternalReactionRules.g:1716:2: iv_ruleLinkState= ruleLinkState EOF
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
    // InternalReactionRules.g:1722:1: ruleLinkState returns [EObject current=null] : ( () ( ( (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleLimitLink | lv_linkState_1_5= ruleWhatEver ) ) ) ) ;
    public final EObject ruleLinkState() throws RecognitionException {
        EObject current = null;

        EObject lv_linkState_1_1 = null;

        EObject lv_linkState_1_2 = null;

        EObject lv_linkState_1_3 = null;

        EObject lv_linkState_1_4 = null;

        EObject lv_linkState_1_5 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1728:2: ( ( () ( ( (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleLimitLink | lv_linkState_1_5= ruleWhatEver ) ) ) ) )
            // InternalReactionRules.g:1729:2: ( () ( ( (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleLimitLink | lv_linkState_1_5= ruleWhatEver ) ) ) )
            {
            // InternalReactionRules.g:1729:2: ( () ( ( (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleLimitLink | lv_linkState_1_5= ruleWhatEver ) ) ) )
            // InternalReactionRules.g:1730:3: () ( ( (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleLimitLink | lv_linkState_1_5= ruleWhatEver ) ) )
            {
            // InternalReactionRules.g:1730:3: ()
            // InternalReactionRules.g:1731:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkStateAccess().getLinkStateAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1737:3: ( ( (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleLimitLink | lv_linkState_1_5= ruleWhatEver ) ) )
            // InternalReactionRules.g:1738:4: ( (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleLimitLink | lv_linkState_1_5= ruleWhatEver ) )
            {
            // InternalReactionRules.g:1738:4: ( (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleLimitLink | lv_linkState_1_5= ruleWhatEver ) )
            // InternalReactionRules.g:1739:5: (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleLimitLink | lv_linkState_1_5= ruleWhatEver )
            {
            // InternalReactionRules.g:1739:5: (lv_linkState_1_1= ruleSemiLink | lv_linkState_1_2= ruleFreeLink | lv_linkState_1_3= ruleExactLink | lv_linkState_1_4= ruleLimitLink | lv_linkState_1_5= ruleWhatEver )
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
                    // InternalReactionRules.g:1740:6: lv_linkState_1_1= ruleSemiLink
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
                    // InternalReactionRules.g:1756:6: lv_linkState_1_2= ruleFreeLink
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
                    // InternalReactionRules.g:1772:6: lv_linkState_1_3= ruleExactLink
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
                    // InternalReactionRules.g:1788:6: lv_linkState_1_4= ruleLimitLink
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateLimitLinkParserRuleCall_1_0_3());
                    					
                    pushFollow(FOLLOW_2);
                    lv_linkState_1_4=ruleLimitLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_1_4,
                    							"biochemsimulation.reactionrules.ReactionRules.LimitLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 5 :
                    // InternalReactionRules.g:1804:6: lv_linkState_1_5= ruleWhatEver
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
    // InternalReactionRules.g:1826:1: entryRuleSitePattern returns [EObject current=null] : iv_ruleSitePattern= ruleSitePattern EOF ;
    public final EObject entryRuleSitePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSitePattern = null;


        try {
            // InternalReactionRules.g:1826:52: (iv_ruleSitePattern= ruleSitePattern EOF )
            // InternalReactionRules.g:1827:2: iv_ruleSitePattern= ruleSitePattern EOF
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
    // InternalReactionRules.g:1833:1: ruleSitePattern returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_state_3_0= ruleSiteState ) ) otherlv_4= '}' )? (otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']' )? ) ;
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
            // InternalReactionRules.g:1839:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_state_3_0= ruleSiteState ) ) otherlv_4= '}' )? (otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']' )? ) )
            // InternalReactionRules.g:1840:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_state_3_0= ruleSiteState ) ) otherlv_4= '}' )? (otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']' )? )
            {
            // InternalReactionRules.g:1840:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_state_3_0= ruleSiteState ) ) otherlv_4= '}' )? (otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']' )? )
            // InternalReactionRules.g:1841:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_state_3_0= ruleSiteState ) ) otherlv_4= '}' )? (otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']' )?
            {
            // InternalReactionRules.g:1841:3: ()
            // InternalReactionRules.g:1842:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSitePatternAccess().getSitePatternAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1848:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:1849:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:1849:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:1850:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSitePatternRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_1, grammarAccess.getSitePatternAccess().getSiteSiteCrossReference_1_0());
            				

            }


            }

            // InternalReactionRules.g:1861:3: (otherlv_2= '{' ( (lv_state_3_0= ruleSiteState ) ) otherlv_4= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalReactionRules.g:1862:4: otherlv_2= '{' ( (lv_state_3_0= ruleSiteState ) ) otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getSitePatternAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalReactionRules.g:1866:4: ( (lv_state_3_0= ruleSiteState ) )
                    // InternalReactionRules.g:1867:5: (lv_state_3_0= ruleSiteState )
                    {
                    // InternalReactionRules.g:1867:5: (lv_state_3_0= ruleSiteState )
                    // InternalReactionRules.g:1868:6: lv_state_3_0= ruleSiteState
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

            // InternalReactionRules.g:1890:3: (otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalReactionRules.g:1891:4: otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getSitePatternAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalReactionRules.g:1895:4: ( (lv_linkState_6_0= ruleLinkState ) )
                    // InternalReactionRules.g:1896:5: (lv_linkState_6_0= ruleLinkState )
                    {
                    // InternalReactionRules.g:1896:5: (lv_linkState_6_0= ruleLinkState )
                    // InternalReactionRules.g:1897:6: lv_linkState_6_0= ruleLinkState
                    {

                    						newCompositeNode(grammarAccess.getSitePatternAccess().getLinkStateLinkStateParserRuleCall_3_1_0());
                    					
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

                    				newLeafNode(otherlv_7, grammarAccess.getSitePatternAccess().getRightSquareBracketKeyword_3_2());
                    			

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
    // $ANTLR end "ruleSitePattern"


    // $ANTLR start "entryRuleSitePatterns"
    // InternalReactionRules.g:1923:1: entryRuleSitePatterns returns [EObject current=null] : iv_ruleSitePatterns= ruleSitePatterns EOF ;
    public final EObject entryRuleSitePatterns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSitePatterns = null;


        try {
            // InternalReactionRules.g:1923:53: (iv_ruleSitePatterns= ruleSitePatterns EOF )
            // InternalReactionRules.g:1924:2: iv_ruleSitePatterns= ruleSitePatterns EOF
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
    // InternalReactionRules.g:1930:1: ruleSitePatterns returns [EObject current=null] : ( () ( ( (lv_sitePatterns_1_0= ruleSitePattern ) ) (otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) ) )* )? ) ;
    public final EObject ruleSitePatterns() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_sitePatterns_1_0 = null;

        EObject lv_sitePatterns_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1936:2: ( ( () ( ( (lv_sitePatterns_1_0= ruleSitePattern ) ) (otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) ) )* )? ) )
            // InternalReactionRules.g:1937:2: ( () ( ( (lv_sitePatterns_1_0= ruleSitePattern ) ) (otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) ) )* )? )
            {
            // InternalReactionRules.g:1937:2: ( () ( ( (lv_sitePatterns_1_0= ruleSitePattern ) ) (otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) ) )* )? )
            // InternalReactionRules.g:1938:3: () ( ( (lv_sitePatterns_1_0= ruleSitePattern ) ) (otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) ) )* )?
            {
            // InternalReactionRules.g:1938:3: ()
            // InternalReactionRules.g:1939:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSitePatternsAccess().getSitePatternsAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1945:3: ( ( (lv_sitePatterns_1_0= ruleSitePattern ) ) (otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalReactionRules.g:1946:4: ( (lv_sitePatterns_1_0= ruleSitePattern ) ) (otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) ) )*
                    {
                    // InternalReactionRules.g:1946:4: ( (lv_sitePatterns_1_0= ruleSitePattern ) )
                    // InternalReactionRules.g:1947:5: (lv_sitePatterns_1_0= ruleSitePattern )
                    {
                    // InternalReactionRules.g:1947:5: (lv_sitePatterns_1_0= ruleSitePattern )
                    // InternalReactionRules.g:1948:6: lv_sitePatterns_1_0= ruleSitePattern
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

                    // InternalReactionRules.g:1965:4: (otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==25) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalReactionRules.g:1966:5: otherlv_2= ',' ( (lv_sitePatterns_3_0= ruleSitePattern ) )
                    	    {
                    	    otherlv_2=(Token)match(input,25,FOLLOW_6); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getSitePatternsAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalReactionRules.g:1970:5: ( (lv_sitePatterns_3_0= ruleSitePattern ) )
                    	    // InternalReactionRules.g:1971:6: (lv_sitePatterns_3_0= ruleSitePattern )
                    	    {
                    	    // InternalReactionRules.g:1971:6: (lv_sitePatterns_3_0= ruleSitePattern )
                    	    // InternalReactionRules.g:1972:7: lv_sitePatterns_3_0= ruleSitePattern
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
                    	    break loop18;
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
    // InternalReactionRules.g:1995:1: entryRuleAgentPattern returns [EObject current=null] : iv_ruleAgentPattern= ruleAgentPattern EOF ;
    public final EObject entryRuleAgentPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgentPattern = null;


        try {
            // InternalReactionRules.g:1995:53: (iv_ruleAgentPattern= ruleAgentPattern EOF )
            // InternalReactionRules.g:1996:2: iv_ruleAgentPattern= ruleAgentPattern EOF
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
    // InternalReactionRules.g:2002:1: ruleAgentPattern returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_sitePatterns_3_0= ruleSitePatterns ) ) otherlv_4= ')' ) ;
    public final EObject ruleAgentPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sitePatterns_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2008:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_sitePatterns_3_0= ruleSitePatterns ) ) otherlv_4= ')' ) )
            // InternalReactionRules.g:2009:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_sitePatterns_3_0= ruleSitePatterns ) ) otherlv_4= ')' )
            {
            // InternalReactionRules.g:2009:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_sitePatterns_3_0= ruleSitePatterns ) ) otherlv_4= ')' )
            // InternalReactionRules.g:2010:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_sitePatterns_3_0= ruleSitePatterns ) ) otherlv_4= ')'
            {
            // InternalReactionRules.g:2010:3: ()
            // InternalReactionRules.g:2011:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAgentPatternAccess().getAgentPatternAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:2017:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:2018:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:2018:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:2019:5: otherlv_1= RULE_ID
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
            		
            // InternalReactionRules.g:2034:3: ( (lv_sitePatterns_3_0= ruleSitePatterns ) )
            // InternalReactionRules.g:2035:4: (lv_sitePatterns_3_0= ruleSitePatterns )
            {
            // InternalReactionRules.g:2035:4: (lv_sitePatterns_3_0= ruleSitePatterns )
            // InternalReactionRules.g:2036:5: lv_sitePatterns_3_0= ruleSitePatterns
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
    // InternalReactionRules.g:2061:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalReactionRules.g:2061:48: (iv_rulePattern= rulePattern EOF )
            // InternalReactionRules.g:2062:2: iv_rulePattern= rulePattern EOF
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
    // InternalReactionRules.g:2068:1: rulePattern returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}' ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_agentPatterns_2_0 = null;

        EObject lv_agentPatterns_4_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2074:2: ( ( () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}' ) )
            // InternalReactionRules.g:2075:2: ( () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}' )
            {
            // InternalReactionRules.g:2075:2: ( () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}' )
            // InternalReactionRules.g:2076:3: () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}'
            {
            // InternalReactionRules.g:2076:3: ()
            // InternalReactionRules.g:2077:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternAccess().getPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalReactionRules.g:2087:3: ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalReactionRules.g:2088:4: ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )*
                    {
                    // InternalReactionRules.g:2088:4: ( (lv_agentPatterns_2_0= ruleAgentPattern ) )
                    // InternalReactionRules.g:2089:5: (lv_agentPatterns_2_0= ruleAgentPattern )
                    {
                    // InternalReactionRules.g:2089:5: (lv_agentPatterns_2_0= ruleAgentPattern )
                    // InternalReactionRules.g:2090:6: lv_agentPatterns_2_0= ruleAgentPattern
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

                    // InternalReactionRules.g:2107:4: (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==25) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalReactionRules.g:2108:5: otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalReactionRules.g:2112:5: ( (lv_agentPatterns_4_0= ruleAgentPattern ) )
                    	    // InternalReactionRules.g:2113:6: (lv_agentPatterns_4_0= ruleAgentPattern )
                    	    {
                    	    // InternalReactionRules.g:2113:6: (lv_agentPatterns_4_0= ruleAgentPattern )
                    	    // InternalReactionRules.g:2114:7: lv_agentPatterns_4_0= ruleAgentPattern
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
                    	    break loop20;
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
    // InternalReactionRules.g:2141:1: entryRuleObservation returns [EObject current=null] : iv_ruleObservation= ruleObservation EOF ;
    public final EObject entryRuleObservation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObservation = null;


        try {
            // InternalReactionRules.g:2141:52: (iv_ruleObservation= ruleObservation EOF )
            // InternalReactionRules.g:2142:2: iv_ruleObservation= ruleObservation EOF
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
    // InternalReactionRules.g:2148:1: ruleObservation returns [EObject current=null] : (otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) ) ) ;
    public final EObject ruleObservation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_observationPattern_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2154:2: ( (otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) ) ) )
            // InternalReactionRules.g:2155:2: (otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) ) )
            {
            // InternalReactionRules.g:2155:2: (otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) ) )
            // InternalReactionRules.g:2156:3: otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getObservationAccess().getObsKeyword_0());
            		
            // InternalReactionRules.g:2160:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:2161:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:2161:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:2162:5: lv_name_1_0= RULE_ID
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

            // InternalReactionRules.g:2178:3: ( (lv_observationPattern_2_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2179:4: (lv_observationPattern_2_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2179:4: (lv_observationPattern_2_0= rulePatternAssignment )
            // InternalReactionRules.g:2180:5: lv_observationPattern_2_0= rulePatternAssignment
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
    // InternalReactionRules.g:2201:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalReactionRules.g:2201:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalReactionRules.g:2202:2: iv_ruleInitial= ruleInitial EOF
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
    // InternalReactionRules.g:2208:1: ruleInitial returns [EObject current=null] : (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleUnsignedInteger ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) ) ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_count_2_0 = null;

        EObject lv_initialPattern_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2214:2: ( (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleUnsignedInteger ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) ) ) )
            // InternalReactionRules.g:2215:2: (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleUnsignedInteger ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) ) )
            {
            // InternalReactionRules.g:2215:2: (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleUnsignedInteger ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) ) )
            // InternalReactionRules.g:2216:3: otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleUnsignedInteger ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialAccess().getInitKeyword_0());
            		
            // InternalReactionRules.g:2220:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:2221:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:2221:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:2222:5: lv_name_1_0= RULE_ID
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

            // InternalReactionRules.g:2238:3: ( (lv_count_2_0= ruleUnsignedInteger ) )
            // InternalReactionRules.g:2239:4: (lv_count_2_0= ruleUnsignedInteger )
            {
            // InternalReactionRules.g:2239:4: (lv_count_2_0= ruleUnsignedInteger )
            // InternalReactionRules.g:2240:5: lv_count_2_0= ruleUnsignedInteger
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

            // InternalReactionRules.g:2257:3: ( (lv_initialPattern_3_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2258:4: (lv_initialPattern_3_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2258:4: (lv_initialPattern_3_0= rulePatternAssignment )
            // InternalReactionRules.g:2259:5: lv_initialPattern_3_0= rulePatternAssignment
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
    // InternalReactionRules.g:2280:1: entryRuleAssignFromPattern returns [EObject current=null] : iv_ruleAssignFromPattern= ruleAssignFromPattern EOF ;
    public final EObject entryRuleAssignFromPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignFromPattern = null;


        try {
            // InternalReactionRules.g:2280:58: (iv_ruleAssignFromPattern= ruleAssignFromPattern EOF )
            // InternalReactionRules.g:2281:2: iv_ruleAssignFromPattern= ruleAssignFromPattern EOF
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
    // InternalReactionRules.g:2287:1: ruleAssignFromPattern returns [EObject current=null] : ( (lv_pattern_0_0= rulePattern ) ) ;
    public final EObject ruleAssignFromPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_pattern_0_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2293:2: ( ( (lv_pattern_0_0= rulePattern ) ) )
            // InternalReactionRules.g:2294:2: ( (lv_pattern_0_0= rulePattern ) )
            {
            // InternalReactionRules.g:2294:2: ( (lv_pattern_0_0= rulePattern ) )
            // InternalReactionRules.g:2295:3: (lv_pattern_0_0= rulePattern )
            {
            // InternalReactionRules.g:2295:3: (lv_pattern_0_0= rulePattern )
            // InternalReactionRules.g:2296:4: lv_pattern_0_0= rulePattern
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
    // InternalReactionRules.g:2316:1: entryRuleAssignFromVariable returns [EObject current=null] : iv_ruleAssignFromVariable= ruleAssignFromVariable EOF ;
    public final EObject entryRuleAssignFromVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignFromVariable = null;


        try {
            // InternalReactionRules.g:2316:59: (iv_ruleAssignFromVariable= ruleAssignFromVariable EOF )
            // InternalReactionRules.g:2317:2: iv_ruleAssignFromVariable= ruleAssignFromVariable EOF
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
    // InternalReactionRules.g:2323:1: ruleAssignFromVariable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleAssignFromVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:2329:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalReactionRules.g:2330:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalReactionRules.g:2330:2: ( (otherlv_0= RULE_ID ) )
            // InternalReactionRules.g:2331:3: (otherlv_0= RULE_ID )
            {
            // InternalReactionRules.g:2331:3: (otherlv_0= RULE_ID )
            // InternalReactionRules.g:2332:4: otherlv_0= RULE_ID
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
    // InternalReactionRules.g:2346:1: entryRulePatternAssignment returns [EObject current=null] : iv_rulePatternAssignment= rulePatternAssignment EOF ;
    public final EObject entryRulePatternAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternAssignment = null;


        try {
            // InternalReactionRules.g:2346:58: (iv_rulePatternAssignment= rulePatternAssignment EOF )
            // InternalReactionRules.g:2347:2: iv_rulePatternAssignment= rulePatternAssignment EOF
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
    // InternalReactionRules.g:2353:1: rulePatternAssignment returns [EObject current=null] : (this_AssignFromPattern_0= ruleAssignFromPattern | this_AssignFromVariable_1= ruleAssignFromVariable ) ;
    public final EObject rulePatternAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_AssignFromPattern_0 = null;

        EObject this_AssignFromVariable_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2359:2: ( (this_AssignFromPattern_0= ruleAssignFromPattern | this_AssignFromVariable_1= ruleAssignFromVariable ) )
            // InternalReactionRules.g:2360:2: (this_AssignFromPattern_0= ruleAssignFromPattern | this_AssignFromVariable_1= ruleAssignFromVariable )
            {
            // InternalReactionRules.g:2360:2: (this_AssignFromPattern_0= ruleAssignFromPattern | this_AssignFromVariable_1= ruleAssignFromVariable )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalReactionRules.g:2361:3: this_AssignFromPattern_0= ruleAssignFromPattern
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
                    // InternalReactionRules.g:2370:3: this_AssignFromVariable_1= ruleAssignFromVariable
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
    // InternalReactionRules.g:2382:1: entryRuleRuleVariables returns [EObject current=null] : iv_ruleRuleVariables= ruleRuleVariables EOF ;
    public final EObject entryRuleRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleVariables = null;


        try {
            // InternalReactionRules.g:2382:54: (iv_ruleRuleVariables= ruleRuleVariables EOF )
            // InternalReactionRules.g:2383:2: iv_ruleRuleVariables= ruleRuleVariables EOF
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
    // InternalReactionRules.g:2389:1: ruleRuleVariables returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRuleVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalReactionRules.g:2395:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalReactionRules.g:2396:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalReactionRules.g:2396:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalReactionRules.g:2397:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalReactionRules.g:2397:3: ( (otherlv_0= RULE_ID ) )
            // InternalReactionRules.g:2398:4: (otherlv_0= RULE_ID )
            {
            // InternalReactionRules.g:2398:4: (otherlv_0= RULE_ID )
            // InternalReactionRules.g:2399:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleVariablesRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getRuleVariablesAccess().getVariablesArithmeticVariableCrossReference_0_0());
            				

            }


            }

            // InternalReactionRules.g:2410:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==25) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalReactionRules.g:2411:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRuleVariablesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalReactionRules.g:2415:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalReactionRules.g:2416:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalReactionRules.g:2416:5: (otherlv_2= RULE_ID )
            	    // InternalReactionRules.g:2417:6: otherlv_2= RULE_ID
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
            	    break loop23;
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
    // InternalReactionRules.g:2433:1: entryRuleUnidirectionalRule returns [EObject current=null] : iv_ruleUnidirectionalRule= ruleUnidirectionalRule EOF ;
    public final EObject entryRuleUnidirectionalRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnidirectionalRule = null;


        try {
            // InternalReactionRules.g:2433:59: (iv_ruleUnidirectionalRule= ruleUnidirectionalRule EOF )
            // InternalReactionRules.g:2434:2: iv_ruleUnidirectionalRule= ruleUnidirectionalRule EOF
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
    // InternalReactionRules.g:2440:1: ruleUnidirectionalRule returns [EObject current=null] : ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' ) ;
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
            // InternalReactionRules.g:2446:2: ( ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' ) )
            // InternalReactionRules.g:2447:2: ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' )
            {
            // InternalReactionRules.g:2447:2: ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' )
            // InternalReactionRules.g:2448:3: ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']'
            {
            // InternalReactionRules.g:2448:3: ( (lv_lhs_0_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2449:4: (lv_lhs_0_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2449:4: (lv_lhs_0_0= rulePatternAssignment )
            // InternalReactionRules.g:2450:5: lv_lhs_0_0= rulePatternAssignment
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

            // InternalReactionRules.g:2467:3: ( (lv_operator_1_0= RULE_UNI ) )
            // InternalReactionRules.g:2468:4: (lv_operator_1_0= RULE_UNI )
            {
            // InternalReactionRules.g:2468:4: (lv_operator_1_0= RULE_UNI )
            // InternalReactionRules.g:2469:5: lv_operator_1_0= RULE_UNI
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

            // InternalReactionRules.g:2485:3: ( (lv_rhs_2_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2486:4: (lv_rhs_2_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2486:4: (lv_rhs_2_0= rulePatternAssignment )
            // InternalReactionRules.g:2487:5: lv_rhs_2_0= rulePatternAssignment
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

            this_AT_3=(Token)match(input,RULE_AT,FOLLOW_30); 

            			newLeafNode(this_AT_3, grammarAccess.getUnidirectionalRuleAccess().getATTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getUnidirectionalRuleAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalReactionRules.g:2512:3: ( (lv_variables_5_0= ruleRuleVariables ) )
            // InternalReactionRules.g:2513:4: (lv_variables_5_0= ruleRuleVariables )
            {
            // InternalReactionRules.g:2513:4: (lv_variables_5_0= ruleRuleVariables )
            // InternalReactionRules.g:2514:5: lv_variables_5_0= ruleRuleVariables
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
    // InternalReactionRules.g:2539:1: entryRuleBidirectionalRule returns [EObject current=null] : iv_ruleBidirectionalRule= ruleBidirectionalRule EOF ;
    public final EObject entryRuleBidirectionalRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBidirectionalRule = null;


        try {
            // InternalReactionRules.g:2539:58: (iv_ruleBidirectionalRule= ruleBidirectionalRule EOF )
            // InternalReactionRules.g:2540:2: iv_ruleBidirectionalRule= ruleBidirectionalRule EOF
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
    // InternalReactionRules.g:2546:1: ruleBidirectionalRule returns [EObject current=null] : ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' ) ;
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
            // InternalReactionRules.g:2552:2: ( ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' ) )
            // InternalReactionRules.g:2553:2: ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' )
            {
            // InternalReactionRules.g:2553:2: ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' )
            // InternalReactionRules.g:2554:3: ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']'
            {
            // InternalReactionRules.g:2554:3: ( (lv_lhs_0_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2555:4: (lv_lhs_0_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2555:4: (lv_lhs_0_0= rulePatternAssignment )
            // InternalReactionRules.g:2556:5: lv_lhs_0_0= rulePatternAssignment
            {

            					newCompositeNode(grammarAccess.getBidirectionalRuleAccess().getLhsPatternAssignmentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalReactionRules.g:2573:3: ( (lv_operator_1_0= RULE_BI ) )
            // InternalReactionRules.g:2574:4: (lv_operator_1_0= RULE_BI )
            {
            // InternalReactionRules.g:2574:4: (lv_operator_1_0= RULE_BI )
            // InternalReactionRules.g:2575:5: lv_operator_1_0= RULE_BI
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

            // InternalReactionRules.g:2591:3: ( (lv_rhs_2_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2592:4: (lv_rhs_2_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2592:4: (lv_rhs_2_0= rulePatternAssignment )
            // InternalReactionRules.g:2593:5: lv_rhs_2_0= rulePatternAssignment
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

            this_AT_3=(Token)match(input,RULE_AT,FOLLOW_30); 

            			newLeafNode(this_AT_3, grammarAccess.getBidirectionalRuleAccess().getATTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getBidirectionalRuleAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalReactionRules.g:2618:3: ( (lv_variables_5_0= ruleRuleVariables ) )
            // InternalReactionRules.g:2619:4: (lv_variables_5_0= ruleRuleVariables )
            {
            // InternalReactionRules.g:2619:4: (lv_variables_5_0= ruleRuleVariables )
            // InternalReactionRules.g:2620:5: lv_variables_5_0= ruleRuleVariables
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
    // InternalReactionRules.g:2645:1: entryRuleRuleBody returns [EObject current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final EObject entryRuleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBody = null;


        try {
            // InternalReactionRules.g:2645:49: (iv_ruleRuleBody= ruleRuleBody EOF )
            // InternalReactionRules.g:2646:2: iv_ruleRuleBody= ruleRuleBody EOF
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
    // InternalReactionRules.g:2652:1: ruleRuleBody returns [EObject current=null] : (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule ) ;
    public final EObject ruleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject this_UnidirectionalRule_0 = null;

        EObject this_BidirectionalRule_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2658:2: ( (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule ) )
            // InternalReactionRules.g:2659:2: (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule )
            {
            // InternalReactionRules.g:2659:2: (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalReactionRules.g:2660:3: this_UnidirectionalRule_0= ruleUnidirectionalRule
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
                    // InternalReactionRules.g:2669:3: this_BidirectionalRule_1= ruleBidirectionalRule
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
    // InternalReactionRules.g:2681:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalReactionRules.g:2681:45: (iv_ruleRule= ruleRule EOF )
            // InternalReactionRules.g:2682:2: iv_ruleRule= ruleRule EOF
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
    // InternalReactionRules.g:2688:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2694:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) ) ) )
            // InternalReactionRules.g:2695:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) ) )
            {
            // InternalReactionRules.g:2695:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) ) )
            // InternalReactionRules.g:2696:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalReactionRules.g:2700:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:2701:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:2701:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:2702:5: lv_name_1_0= RULE_ID
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

            // InternalReactionRules.g:2718:3: ( (lv_rule_2_0= ruleRuleBody ) )
            // InternalReactionRules.g:2719:4: (lv_rule_2_0= ruleRuleBody )
            {
            // InternalReactionRules.g:2719:4: (lv_rule_2_0= ruleRuleBody )
            // InternalReactionRules.g:2720:5: lv_rule_2_0= ruleRuleBody
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
    protected DFA24 dfa24 = new DFA24(this);
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
    static final String dfa_9s = "\2\5\1\13\1\33\1\13\2\uffff\1\5\1\30\1\31\4\5\1\32\2\41\1\27\2\41\1\30\1\33\2\31\4\5\1\41\1\32\2\41\1\27\2\41\1\30\3\31\4\5\1\41\1\32\2\41\1\27\2\41\1\30\2\31\3\5\1\41\1\32\2\41\1\27\2\41\2\31\1\5\1\41";
    static final String dfa_10s = "\1\30\1\32\1\15\1\33\1\15\2\uffff\1\34\1\40\1\32\1\5\1\12\2\5\1\32\2\41\1\27\2\41\1\40\1\33\1\40\1\34\2\5\1\12\1\34\1\41\1\32\2\41\1\27\2\41\1\40\1\32\1\40\1\34\2\5\1\12\1\5\1\41\1\32\2\41\1\27\2\41\2\40\1\34\2\5\1\12\1\41\1\32\2\41\1\27\2\41\1\40\1\34\1\5\1\41";
    static final String dfa_11s = "\5\uffff\1\1\1\2\74\uffff";
    static final String dfa_12s = "\103\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\22\uffff\1\1",
            "\1\3\24\uffff\1\4",
            "\1\5\1\uffff\1\6",
            "\1\7",
            "\1\5\1\uffff\1\6",
            "",
            "",
            "\1\10\26\uffff\1\11",
            "\1\12\1\14\2\uffff\1\11\3\uffff\1\13",
            "\1\15\1\4",
            "\1\16",
            "\1\21\1\22\1\uffff\1\17\1\20\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\27",
            "\1\30",
            "\1\27",
            "\1\27",
            "\1\31\1\14\2\uffff\1\11\3\uffff\1\32",
            "\1\33",
            "\1\14\2\uffff\1\11\3\uffff\1\13",
            "\1\14\2\uffff\1\11",
            "\1\34",
            "\1\35",
            "\1\40\1\41\1\uffff\1\36\1\37\1\42",
            "\1\43\26\uffff\1\44",
            "\1\27",
            "\1\45",
            "\1\46",
            "\1\46",
            "\1\47",
            "\1\46",
            "\1\46",
            "\1\50\1\52\2\uffff\1\44\3\uffff\1\51",
            "\1\15\1\4",
            "\1\14\2\uffff\1\11\3\uffff\1\32",
            "\1\14\2\uffff\1\11",
            "\1\53",
            "\1\54",
            "\1\57\1\60\1\uffff\1\55\1\56\1\61",
            "\1\62",
            "\1\46",
            "\1\63",
            "\1\64",
            "\1\64",
            "\1\65",
            "\1\64",
            "\1\64",
            "\1\66\1\52\2\uffff\1\44\3\uffff\1\67",
            "\1\52\2\uffff\1\44\3\uffff\1\51",
            "\1\52\2\uffff\1\44",
            "\1\70",
            "\1\71",
            "\1\74\1\75\1\uffff\1\72\1\73\1\76",
            "\1\64",
            "\1\77",
            "\1\100",
            "\1\100",
            "\1\101",
            "\1\100",
            "\1\100",
            "\1\52\2\uffff\1\44\3\uffff\1\67",
            "\1\52\2\uffff\1\44",
            "\1\102",
            "\1\100"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2659:2: (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule )";
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
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000101000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000002000L});

}