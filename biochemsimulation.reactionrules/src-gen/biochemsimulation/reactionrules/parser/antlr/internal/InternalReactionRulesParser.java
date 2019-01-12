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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_EXPONENT", "RULE_BOUND_LINK", "RULE_FREE_LINK", "RULE_WHATEVER_LINK", "RULE_VOID_PATTERN", "RULE_UNI", "RULE_AT", "RULE_BI", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ModelID'", "'-'", "'.'", "'+'", "'{'", "','", "'}'", "'*'", "'('", "')'", "'agent'", "'var'", "'='", "'['", "']'", "'*['", "'obs'", "'init'", "'rule'", "'iterations'", "'time'", "'|'", "'==>'", "'terminate'"
    };
    public static final int RULE_FREE_LINK=8;
    public static final int RULE_STRING=14;
    public static final int RULE_AT=12;
    public static final int RULE_WHATEVER_LINK=9;
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
    public static final int RULE_VOID_PATTERN=10;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=17;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_BOUND_LINK=7;
    public static final int RULE_BI=13;
    public static final int RULE_EXPONENT=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int RULE_UNI=11;
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
    // InternalReactionRules.g:71:1: ruleReactionRuleModel returns [EObject current=null] : ( ( (lv_model_0_0= ruleModel ) ) ( (lv_reactionProperties_1_0= ruleReactionProperty ) )* ) ;
    public final EObject ruleReactionRuleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_model_0_0 = null;

        EObject lv_reactionProperties_1_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:77:2: ( ( ( (lv_model_0_0= ruleModel ) ) ( (lv_reactionProperties_1_0= ruleReactionProperty ) )* ) )
            // InternalReactionRules.g:78:2: ( ( (lv_model_0_0= ruleModel ) ) ( (lv_reactionProperties_1_0= ruleReactionProperty ) )* )
            {
            // InternalReactionRules.g:78:2: ( ( (lv_model_0_0= ruleModel ) ) ( (lv_reactionProperties_1_0= ruleReactionProperty ) )* )
            // InternalReactionRules.g:79:3: ( (lv_model_0_0= ruleModel ) ) ( (lv_reactionProperties_1_0= ruleReactionProperty ) )*
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

            // InternalReactionRules.g:98:3: ( (lv_reactionProperties_1_0= ruleReactionProperty ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=29 && LA1_0<=30)||(LA1_0>=35 && LA1_0<=37)||LA1_0==42) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReactionRules.g:99:4: (lv_reactionProperties_1_0= ruleReactionProperty )
            	    {
            	    // InternalReactionRules.g:99:4: (lv_reactionProperties_1_0= ruleReactionProperty )
            	    // InternalReactionRules.g:100:5: lv_reactionProperties_1_0= ruleReactionProperty
            	    {

            	    					newCompositeNode(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesReactionPropertyParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_reactionProperties_1_0=ruleReactionProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactionRuleModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reactionProperties",
            	    						lv_reactionProperties_1_0,
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


    // $ANTLR start "entryRuleModel"
    // InternalReactionRules.g:121:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalReactionRules.g:121:46: (iv_ruleModel= ruleModel EOF )
            // InternalReactionRules.g:122:2: iv_ruleModel= ruleModel EOF
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
    // InternalReactionRules.g:128:1: ruleModel returns [EObject current=null] : (otherlv_0= 'ModelID' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:134:2: ( (otherlv_0= 'ModelID' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalReactionRules.g:135:2: (otherlv_0= 'ModelID' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalReactionRules.g:135:2: (otherlv_0= 'ModelID' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalReactionRules.g:136:3: otherlv_0= 'ModelID' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelIDKeyword_0());
            		
            // InternalReactionRules.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleReactionProperty"
    // InternalReactionRules.g:162:1: entryRuleReactionProperty returns [EObject current=null] : iv_ruleReactionProperty= ruleReactionProperty EOF ;
    public final EObject entryRuleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperty = null;


        try {
            // InternalReactionRules.g:162:57: (iv_ruleReactionProperty= ruleReactionProperty EOF )
            // InternalReactionRules.g:163:2: iv_ruleReactionProperty= ruleReactionProperty EOF
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
    // InternalReactionRules.g:169:1: ruleReactionProperty returns [EObject current=null] : (this_Agent_0= ruleAgent | this_Variable_1= ruleVariable | this_Observation_2= ruleObservation | this_Initial_3= ruleInitial | this_Rule_4= ruleRule | this_Terminate_5= ruleTerminate ) ;
    public final EObject ruleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Agent_0 = null;

        EObject this_Variable_1 = null;

        EObject this_Observation_2 = null;

        EObject this_Initial_3 = null;

        EObject this_Rule_4 = null;

        EObject this_Terminate_5 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:175:2: ( (this_Agent_0= ruleAgent | this_Variable_1= ruleVariable | this_Observation_2= ruleObservation | this_Initial_3= ruleInitial | this_Rule_4= ruleRule | this_Terminate_5= ruleTerminate ) )
            // InternalReactionRules.g:176:2: (this_Agent_0= ruleAgent | this_Variable_1= ruleVariable | this_Observation_2= ruleObservation | this_Initial_3= ruleInitial | this_Rule_4= ruleRule | this_Terminate_5= ruleTerminate )
            {
            // InternalReactionRules.g:176:2: (this_Agent_0= ruleAgent | this_Variable_1= ruleVariable | this_Observation_2= ruleObservation | this_Initial_3= ruleInitial | this_Rule_4= ruleRule | this_Terminate_5= ruleTerminate )
            int alt2=6;
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
            case 42:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalReactionRules.g:177:3: this_Agent_0= ruleAgent
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
                    // InternalReactionRules.g:186:3: this_Variable_1= ruleVariable
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
                    // InternalReactionRules.g:195:3: this_Observation_2= ruleObservation
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
                    // InternalReactionRules.g:204:3: this_Initial_3= ruleInitial
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
                    // InternalReactionRules.g:213:3: this_Rule_4= ruleRule
                    {

                    			newCompositeNode(grammarAccess.getReactionPropertyAccess().getRuleParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rule_4=ruleRule();

                    state._fsp--;


                    			current = this_Rule_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalReactionRules.g:222:3: this_Terminate_5= ruleTerminate
                    {

                    			newCompositeNode(grammarAccess.getReactionPropertyAccess().getTerminateParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Terminate_5=ruleTerminate();

                    state._fsp--;


                    			current = this_Terminate_5;
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
    // InternalReactionRules.g:234:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:236:2: (iv_ruleFloat= ruleFloat EOF )
            // InternalReactionRules.g:237:2: iv_ruleFloat= ruleFloat EOF
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
    // InternalReactionRules.g:246:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:253:2: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            // InternalReactionRules.g:254:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            {
            // InternalReactionRules.g:254:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // InternalReactionRules.g:255:3: (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            // InternalReactionRules.g:255:3: (kw= '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalReactionRules.g:256:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,21,FOLLOW_5); 

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
    // InternalReactionRules.g:288:1: entryRuleScientificFloat returns [String current=null] : iv_ruleScientificFloat= ruleScientificFloat EOF ;
    public final String entryRuleScientificFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScientificFloat = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:290:2: (iv_ruleScientificFloat= ruleScientificFloat EOF )
            // InternalReactionRules.g:291:2: iv_ruleScientificFloat= ruleScientificFloat EOF
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
    // InternalReactionRules.g:300:1: ruleScientificFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT this_EXPONENT_4= RULE_EXPONENT (kw= '-' | kw= '+' ) this_INT_7= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleScientificFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_EXPONENT_4=null;
        Token this_INT_7=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:307:2: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT this_EXPONENT_4= RULE_EXPONENT (kw= '-' | kw= '+' ) this_INT_7= RULE_INT ) )
            // InternalReactionRules.g:308:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT this_EXPONENT_4= RULE_EXPONENT (kw= '-' | kw= '+' ) this_INT_7= RULE_INT )
            {
            // InternalReactionRules.g:308:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT this_EXPONENT_4= RULE_EXPONENT (kw= '-' | kw= '+' ) this_INT_7= RULE_INT )
            // InternalReactionRules.g:309:3: (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT this_EXPONENT_4= RULE_EXPONENT (kw= '-' | kw= '+' ) this_INT_7= RULE_INT
            {
            // InternalReactionRules.g:309:3: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalReactionRules.g:310:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getScientificFloatAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,21,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getScientificFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_7); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getScientificFloatAccess().getINTTerminalRuleCall_3());
            		
            this_EXPONENT_4=(Token)match(input,RULE_EXPONENT,FOLLOW_8); 

            			current.merge(this_EXPONENT_4);
            		

            			newLeafNode(this_EXPONENT_4, grammarAccess.getScientificFloatAccess().getEXPONENTTerminalRuleCall_4());
            		
            // InternalReactionRules.g:342:3: (kw= '-' | kw= '+' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalReactionRules.g:343:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScientificFloatAccess().getHyphenMinusKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:349:4: kw= '+'
                    {
                    kw=(Token)match(input,22,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScientificFloatAccess().getPlusSignKeyword_5_1());
                    			

                    }
                    break;

            }

            this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_7);
            		

            			newLeafNode(this_INT_7, grammarAccess.getScientificFloatAccess().getINTTerminalRuleCall_6());
            		

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
    // InternalReactionRules.g:369:1: entryRuleUnsignedInteger returns [String current=null] : iv_ruleUnsignedInteger= ruleUnsignedInteger EOF ;
    public final String entryRuleUnsignedInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnsignedInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:371:2: (iv_ruleUnsignedInteger= ruleUnsignedInteger EOF )
            // InternalReactionRules.g:372:2: iv_ruleUnsignedInteger= ruleUnsignedInteger EOF
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
    // InternalReactionRules.g:381:1: ruleUnsignedInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleUnsignedInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:388:2: (this_INT_0= RULE_INT )
            // InternalReactionRules.g:389:2: this_INT_0= RULE_INT
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
    // InternalReactionRules.g:402:1: entryRuleSignedInteger returns [String current=null] : iv_ruleSignedInteger= ruleSignedInteger EOF ;
    public final String entryRuleSignedInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:404:2: (iv_ruleSignedInteger= ruleSignedInteger EOF )
            // InternalReactionRules.g:405:2: iv_ruleSignedInteger= ruleSignedInteger EOF
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
    // InternalReactionRules.g:414:1: ruleSignedInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalReactionRules.g:421:2: ( (kw= '-' this_INT_1= RULE_INT ) )
            // InternalReactionRules.g:422:2: (kw= '-' this_INT_1= RULE_INT )
            {
            // InternalReactionRules.g:422:2: (kw= '-' this_INT_1= RULE_INT )
            // InternalReactionRules.g:423:3: kw= '-' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,20,FOLLOW_5); 

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
    // InternalReactionRules.g:442:1: entryRuleArithmeticType returns [String current=null] : iv_ruleArithmeticType= ruleArithmeticType EOF ;
    public final String entryRuleArithmeticType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArithmeticType = null;


        try {
            // InternalReactionRules.g:442:54: (iv_ruleArithmeticType= ruleArithmeticType EOF )
            // InternalReactionRules.g:443:2: iv_ruleArithmeticType= ruleArithmeticType EOF
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
    // InternalReactionRules.g:449:1: ruleArithmeticType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Float_0= ruleFloat | this_UnsignedInteger_1= ruleUnsignedInteger | this_SignedInteger_2= ruleSignedInteger | this_ScientificFloat_3= ruleScientificFloat ) ;
    public final AntlrDatatypeRuleToken ruleArithmeticType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Float_0 = null;

        AntlrDatatypeRuleToken this_UnsignedInteger_1 = null;

        AntlrDatatypeRuleToken this_SignedInteger_2 = null;

        AntlrDatatypeRuleToken this_ScientificFloat_3 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:455:2: ( (this_Float_0= ruleFloat | this_UnsignedInteger_1= ruleUnsignedInteger | this_SignedInteger_2= ruleSignedInteger | this_ScientificFloat_3= ruleScientificFloat ) )
            // InternalReactionRules.g:456:2: (this_Float_0= ruleFloat | this_UnsignedInteger_1= ruleUnsignedInteger | this_SignedInteger_2= ruleSignedInteger | this_ScientificFloat_3= ruleScientificFloat )
            {
            // InternalReactionRules.g:456:2: (this_Float_0= ruleFloat | this_UnsignedInteger_1= ruleUnsignedInteger | this_SignedInteger_2= ruleSignedInteger | this_ScientificFloat_3= ruleScientificFloat )
            int alt6=4;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalReactionRules.g:457:3: this_Float_0= ruleFloat
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
                    // InternalReactionRules.g:468:3: this_UnsignedInteger_1= ruleUnsignedInteger
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
                    // InternalReactionRules.g:479:3: this_SignedInteger_2= ruleSignedInteger
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
                    // InternalReactionRules.g:490:3: this_ScientificFloat_3= ruleScientificFloat
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
    // InternalReactionRules.g:504:1: entryRuleArithmeticValue returns [EObject current=null] : iv_ruleArithmeticValue= ruleArithmeticValue EOF ;
    public final EObject entryRuleArithmeticValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticValue = null;


        try {
            // InternalReactionRules.g:504:56: (iv_ruleArithmeticValue= ruleArithmeticValue EOF )
            // InternalReactionRules.g:505:2: iv_ruleArithmeticValue= ruleArithmeticValue EOF
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
    // InternalReactionRules.g:511:1: ruleArithmeticValue returns [EObject current=null] : ( (lv_value_0_0= ruleArithmeticType ) ) ;
    public final EObject ruleArithmeticValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:517:2: ( ( (lv_value_0_0= ruleArithmeticType ) ) )
            // InternalReactionRules.g:518:2: ( (lv_value_0_0= ruleArithmeticType ) )
            {
            // InternalReactionRules.g:518:2: ( (lv_value_0_0= ruleArithmeticType ) )
            // InternalReactionRules.g:519:3: (lv_value_0_0= ruleArithmeticType )
            {
            // InternalReactionRules.g:519:3: (lv_value_0_0= ruleArithmeticType )
            // InternalReactionRules.g:520:4: lv_value_0_0= ruleArithmeticType
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
    // InternalReactionRules.g:540:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalReactionRules.g:540:46: (iv_ruleState= ruleState EOF )
            // InternalReactionRules.g:541:2: iv_ruleState= ruleState EOF
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
    // InternalReactionRules.g:547:1: ruleState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:553:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalReactionRules.g:554:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalReactionRules.g:554:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalReactionRules.g:555:3: (lv_name_0_0= RULE_ID )
            {
            // InternalReactionRules.g:555:3: (lv_name_0_0= RULE_ID )
            // InternalReactionRules.g:556:4: lv_name_0_0= RULE_ID
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
    // InternalReactionRules.g:575:1: entryRuleStates returns [EObject current=null] : iv_ruleStates= ruleStates EOF ;
    public final EObject entryRuleStates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStates = null;


        try {
            // InternalReactionRules.g:575:47: (iv_ruleStates= ruleStates EOF )
            // InternalReactionRules.g:576:2: iv_ruleStates= ruleStates EOF
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
    // InternalReactionRules.g:582:1: ruleStates returns [EObject current=null] : ( () (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleStates() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_state_2_0 = null;

        EObject lv_state_4_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:588:2: ( ( () (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )? ) )
            // InternalReactionRules.g:589:2: ( () (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )? )
            {
            // InternalReactionRules.g:589:2: ( () (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )? )
            // InternalReactionRules.g:590:3: () (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )?
            {
            // InternalReactionRules.g:590:3: ()
            // InternalReactionRules.g:591:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatesAccess().getStatesAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:597:3: (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalReactionRules.g:598:4: otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatesAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalReactionRules.g:602:4: ( (lv_state_2_0= ruleState ) )
                    // InternalReactionRules.g:603:5: (lv_state_2_0= ruleState )
                    {
                    // InternalReactionRules.g:603:5: (lv_state_2_0= ruleState )
                    // InternalReactionRules.g:604:6: lv_state_2_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getStatesAccess().getStateStateParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalReactionRules.g:621:4: (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==24) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalReactionRules.g:622:5: otherlv_3= ',' ( (lv_state_4_0= ruleState ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getStatesAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalReactionRules.g:626:5: ( (lv_state_4_0= ruleState ) )
                    	    // InternalReactionRules.g:627:6: (lv_state_4_0= ruleState )
                    	    {
                    	    // InternalReactionRules.g:627:6: (lv_state_4_0= ruleState )
                    	    // InternalReactionRules.g:628:7: lv_state_4_0= ruleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getStatesAccess().getStateStateParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,25,FOLLOW_2); 

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


    // $ANTLR start "entryRuleSingleSite"
    // InternalReactionRules.g:655:1: entryRuleSingleSite returns [EObject current=null] : iv_ruleSingleSite= ruleSingleSite EOF ;
    public final EObject entryRuleSingleSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSite = null;


        try {
            // InternalReactionRules.g:655:51: (iv_ruleSingleSite= ruleSingleSite EOF )
            // InternalReactionRules.g:656:2: iv_ruleSingleSite= ruleSingleSite EOF
            {
             newCompositeNode(grammarAccess.getSingleSiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleSite=ruleSingleSite();

            state._fsp--;

             current =iv_ruleSingleSite; 
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
    // $ANTLR end "entryRuleSingleSite"


    // $ANTLR start "ruleSingleSite"
    // InternalReactionRules.g:662:1: ruleSingleSite returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_states_2_0= ruleStates ) ) ) ;
    public final EObject ruleSingleSite() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_states_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:668:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_states_2_0= ruleStates ) ) ) )
            // InternalReactionRules.g:669:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_states_2_0= ruleStates ) ) )
            {
            // InternalReactionRules.g:669:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_states_2_0= ruleStates ) ) )
            // InternalReactionRules.g:670:3: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_states_2_0= ruleStates ) )
            {
            // InternalReactionRules.g:670:3: ()
            // InternalReactionRules.g:671:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSingleSiteAccess().getSingleSiteAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:677:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:678:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:678:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:679:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSingleSiteAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleSiteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReactionRules.g:695:3: ( (lv_states_2_0= ruleStates ) )
            // InternalReactionRules.g:696:4: (lv_states_2_0= ruleStates )
            {
            // InternalReactionRules.g:696:4: (lv_states_2_0= ruleStates )
            // InternalReactionRules.g:697:5: lv_states_2_0= ruleStates
            {

            					newCompositeNode(grammarAccess.getSingleSiteAccess().getStatesStatesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_states_2_0=ruleStates();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleSiteRule());
            					}
            					set(
            						current,
            						"states",
            						lv_states_2_0,
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
    // $ANTLR end "ruleSingleSite"


    // $ANTLR start "entryRuleMultiSite"
    // InternalReactionRules.g:718:1: entryRuleMultiSite returns [EObject current=null] : iv_ruleMultiSite= ruleMultiSite EOF ;
    public final EObject entryRuleMultiSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiSite = null;


        try {
            // InternalReactionRules.g:718:50: (iv_ruleMultiSite= ruleMultiSite EOF )
            // InternalReactionRules.g:719:2: iv_ruleMultiSite= ruleMultiSite EOF
            {
             newCompositeNode(grammarAccess.getMultiSiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiSite=ruleMultiSite();

            state._fsp--;

             current =iv_ruleMultiSite; 
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
    // $ANTLR end "entryRuleMultiSite"


    // $ANTLR start "ruleMultiSite"
    // InternalReactionRules.g:725:1: ruleMultiSite returns [EObject current=null] : ( () otherlv_1= '*' ( (lv_name_2_0= RULE_ID ) ) ( (lv_states_3_0= ruleStates ) ) ) ;
    public final EObject ruleMultiSite() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_states_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:731:2: ( ( () otherlv_1= '*' ( (lv_name_2_0= RULE_ID ) ) ( (lv_states_3_0= ruleStates ) ) ) )
            // InternalReactionRules.g:732:2: ( () otherlv_1= '*' ( (lv_name_2_0= RULE_ID ) ) ( (lv_states_3_0= ruleStates ) ) )
            {
            // InternalReactionRules.g:732:2: ( () otherlv_1= '*' ( (lv_name_2_0= RULE_ID ) ) ( (lv_states_3_0= ruleStates ) ) )
            // InternalReactionRules.g:733:3: () otherlv_1= '*' ( (lv_name_2_0= RULE_ID ) ) ( (lv_states_3_0= ruleStates ) )
            {
            // InternalReactionRules.g:733:3: ()
            // InternalReactionRules.g:734:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMultiSiteAccess().getMultiSiteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiSiteAccess().getAsteriskKeyword_1());
            		
            // InternalReactionRules.g:744:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalReactionRules.g:745:4: (lv_name_2_0= RULE_ID )
            {
            // InternalReactionRules.g:745:4: (lv_name_2_0= RULE_ID )
            // InternalReactionRules.g:746:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMultiSiteAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiSiteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReactionRules.g:762:3: ( (lv_states_3_0= ruleStates ) )
            // InternalReactionRules.g:763:4: (lv_states_3_0= ruleStates )
            {
            // InternalReactionRules.g:763:4: (lv_states_3_0= ruleStates )
            // InternalReactionRules.g:764:5: lv_states_3_0= ruleStates
            {

            					newCompositeNode(grammarAccess.getMultiSiteAccess().getStatesStatesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_states_3_0=ruleStates();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiSiteRule());
            					}
            					set(
            						current,
            						"states",
            						lv_states_3_0,
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
    // $ANTLR end "ruleMultiSite"


    // $ANTLR start "entryRuleSite"
    // InternalReactionRules.g:785:1: entryRuleSite returns [EObject current=null] : iv_ruleSite= ruleSite EOF ;
    public final EObject entryRuleSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSite = null;


        try {
            // InternalReactionRules.g:785:45: (iv_ruleSite= ruleSite EOF )
            // InternalReactionRules.g:786:2: iv_ruleSite= ruleSite EOF
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
    // InternalReactionRules.g:792:1: ruleSite returns [EObject current=null] : (this_SingleSite_0= ruleSingleSite | this_MultiSite_1= ruleMultiSite ) ;
    public final EObject ruleSite() throws RecognitionException {
        EObject current = null;

        EObject this_SingleSite_0 = null;

        EObject this_MultiSite_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:798:2: ( (this_SingleSite_0= ruleSingleSite | this_MultiSite_1= ruleMultiSite ) )
            // InternalReactionRules.g:799:2: (this_SingleSite_0= ruleSingleSite | this_MultiSite_1= ruleMultiSite )
            {
            // InternalReactionRules.g:799:2: (this_SingleSite_0= ruleSingleSite | this_MultiSite_1= ruleMultiSite )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalReactionRules.g:800:3: this_SingleSite_0= ruleSingleSite
                    {

                    			newCompositeNode(grammarAccess.getSiteAccess().getSingleSiteParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleSite_0=ruleSingleSite();

                    state._fsp--;


                    			current = this_SingleSite_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:809:3: this_MultiSite_1= ruleMultiSite
                    {

                    			newCompositeNode(grammarAccess.getSiteAccess().getMultiSiteParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiSite_1=ruleMultiSite();

                    state._fsp--;


                    			current = this_MultiSite_1;
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
    // $ANTLR end "ruleSite"


    // $ANTLR start "entryRuleSites"
    // InternalReactionRules.g:821:1: entryRuleSites returns [EObject current=null] : iv_ruleSites= ruleSites EOF ;
    public final EObject entryRuleSites() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSites = null;


        try {
            // InternalReactionRules.g:821:46: (iv_ruleSites= ruleSites EOF )
            // InternalReactionRules.g:822:2: iv_ruleSites= ruleSites EOF
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
    // InternalReactionRules.g:828:1: ruleSites returns [EObject current=null] : ( () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleSites() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_sites_2_0 = null;

        EObject lv_sites_4_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:834:2: ( ( () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )? ) )
            // InternalReactionRules.g:835:2: ( () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )? )
            {
            // InternalReactionRules.g:835:2: ( () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )? )
            // InternalReactionRules.g:836:3: () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )?
            {
            // InternalReactionRules.g:836:3: ()
            // InternalReactionRules.g:837:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSitesAccess().getSitesAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:843:3: (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalReactionRules.g:844:4: otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getSitesAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalReactionRules.g:848:4: ( (lv_sites_2_0= ruleSite ) )
                    // InternalReactionRules.g:849:5: (lv_sites_2_0= ruleSite )
                    {
                    // InternalReactionRules.g:849:5: (lv_sites_2_0= ruleSite )
                    // InternalReactionRules.g:850:6: lv_sites_2_0= ruleSite
                    {

                    						newCompositeNode(grammarAccess.getSitesAccess().getSitesSiteParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    // InternalReactionRules.g:867:4: (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==24) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalReactionRules.g:868:5: otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_11); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSitesAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalReactionRules.g:872:5: ( (lv_sites_4_0= ruleSite ) )
                    	    // InternalReactionRules.g:873:6: (lv_sites_4_0= ruleSite )
                    	    {
                    	    // InternalReactionRules.g:873:6: (lv_sites_4_0= ruleSite )
                    	    // InternalReactionRules.g:874:7: lv_sites_4_0= ruleSite
                    	    {

                    	    							newCompositeNode(grammarAccess.getSitesAccess().getSitesSiteParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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
                    	    break loop10;
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
    // InternalReactionRules.g:901:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // InternalReactionRules.g:901:46: (iv_ruleAgent= ruleAgent EOF )
            // InternalReactionRules.g:902:2: iv_ruleAgent= ruleAgent EOF
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
    // InternalReactionRules.g:908:1: ruleAgent returns [EObject current=null] : (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) ) ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_sites_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:914:2: ( (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) ) ) )
            // InternalReactionRules.g:915:2: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) ) )
            {
            // InternalReactionRules.g:915:2: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) ) )
            // InternalReactionRules.g:916:3: otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
            		
            // InternalReactionRules.g:920:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:921:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:921:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:922:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalReactionRules.g:938:3: ( (lv_sites_2_0= ruleSites ) )
            // InternalReactionRules.g:939:4: (lv_sites_2_0= ruleSites )
            {
            // InternalReactionRules.g:939:4: (lv_sites_2_0= ruleSites )
            // InternalReactionRules.g:940:5: lv_sites_2_0= ruleSites
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
    // InternalReactionRules.g:961:1: entryRulePatternVariable returns [EObject current=null] : iv_rulePatternVariable= rulePatternVariable EOF ;
    public final EObject entryRulePatternVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternVariable = null;


        try {
            // InternalReactionRules.g:961:56: (iv_rulePatternVariable= rulePatternVariable EOF )
            // InternalReactionRules.g:962:2: iv_rulePatternVariable= rulePatternVariable EOF
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
    // InternalReactionRules.g:968:1: rulePatternVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_pattern_3_0= rulePattern ) ) ) ;
    public final EObject rulePatternVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_pattern_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:974:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_pattern_3_0= rulePattern ) ) ) )
            // InternalReactionRules.g:975:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_pattern_3_0= rulePattern ) ) )
            {
            // InternalReactionRules.g:975:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_pattern_3_0= rulePattern ) ) )
            // InternalReactionRules.g:976:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_pattern_3_0= rulePattern ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternVariableAccess().getVarKeyword_0());
            		
            // InternalReactionRules.g:980:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:981:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:981:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:982:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_2=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getPatternVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalReactionRules.g:1002:3: ( (lv_pattern_3_0= rulePattern ) )
            // InternalReactionRules.g:1003:4: (lv_pattern_3_0= rulePattern )
            {
            // InternalReactionRules.g:1003:4: (lv_pattern_3_0= rulePattern )
            // InternalReactionRules.g:1004:5: lv_pattern_3_0= rulePattern
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
    // InternalReactionRules.g:1025:1: entryRuleArithmeticVariable returns [EObject current=null] : iv_ruleArithmeticVariable= ruleArithmeticVariable EOF ;
    public final EObject entryRuleArithmeticVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticVariable = null;


        try {
            // InternalReactionRules.g:1025:59: (iv_ruleArithmeticVariable= ruleArithmeticVariable EOF )
            // InternalReactionRules.g:1026:2: iv_ruleArithmeticVariable= ruleArithmeticVariable EOF
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
    // InternalReactionRules.g:1032:1: ruleArithmeticVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticValue ) ) ) ;
    public final EObject ruleArithmeticVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1038:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticValue ) ) ) )
            // InternalReactionRules.g:1039:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticValue ) ) )
            {
            // InternalReactionRules.g:1039:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticValue ) ) )
            // InternalReactionRules.g:1040:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticValue ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getArithmeticVariableAccess().getVarKeyword_0());
            		
            // InternalReactionRules.g:1044:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:1045:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:1045:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:1046:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_2=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getArithmeticVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalReactionRules.g:1066:3: ( (lv_value_3_0= ruleArithmeticValue ) )
            // InternalReactionRules.g:1067:4: (lv_value_3_0= ruleArithmeticValue )
            {
            // InternalReactionRules.g:1067:4: (lv_value_3_0= ruleArithmeticValue )
            // InternalReactionRules.g:1068:5: lv_value_3_0= ruleArithmeticValue
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
    // InternalReactionRules.g:1089:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalReactionRules.g:1089:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalReactionRules.g:1090:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalReactionRules.g:1096:1: ruleVariable returns [EObject current=null] : (this_PatternVariable_0= rulePatternVariable | this_ArithmeticVariable_1= ruleArithmeticVariable ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_PatternVariable_0 = null;

        EObject this_ArithmeticVariable_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1102:2: ( (this_PatternVariable_0= rulePatternVariable | this_ArithmeticVariable_1= ruleArithmeticVariable ) )
            // InternalReactionRules.g:1103:2: (this_PatternVariable_0= rulePatternVariable | this_ArithmeticVariable_1= ruleArithmeticVariable )
            {
            // InternalReactionRules.g:1103:2: (this_PatternVariable_0= rulePatternVariable | this_ArithmeticVariable_1= ruleArithmeticVariable )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==31) ) {
                        int LA12_3 = input.LA(4);

                        if ( (LA12_3==RULE_INT||LA12_3==20) ) {
                            alt12=2;
                        }
                        else if ( (LA12_3==23) ) {
                            alt12=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalReactionRules.g:1104:3: this_PatternVariable_0= rulePatternVariable
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
                    // InternalReactionRules.g:1113:3: this_ArithmeticVariable_1= ruleArithmeticVariable
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


    // $ANTLR start "entryRuleBoundAnyLink"
    // InternalReactionRules.g:1125:1: entryRuleBoundAnyLink returns [EObject current=null] : iv_ruleBoundAnyLink= ruleBoundAnyLink EOF ;
    public final EObject entryRuleBoundAnyLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundAnyLink = null;


        try {
            // InternalReactionRules.g:1125:53: (iv_ruleBoundAnyLink= ruleBoundAnyLink EOF )
            // InternalReactionRules.g:1126:2: iv_ruleBoundAnyLink= ruleBoundAnyLink EOF
            {
             newCompositeNode(grammarAccess.getBoundAnyLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundAnyLink=ruleBoundAnyLink();

            state._fsp--;

             current =iv_ruleBoundAnyLink; 
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
    // $ANTLR end "entryRuleBoundAnyLink"


    // $ANTLR start "ruleBoundAnyLink"
    // InternalReactionRules.g:1132:1: ruleBoundAnyLink returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_BOUND_LINK ) ) ) ;
    public final EObject ruleBoundAnyLink() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1138:2: ( ( () ( (lv_name_1_0= RULE_BOUND_LINK ) ) ) )
            // InternalReactionRules.g:1139:2: ( () ( (lv_name_1_0= RULE_BOUND_LINK ) ) )
            {
            // InternalReactionRules.g:1139:2: ( () ( (lv_name_1_0= RULE_BOUND_LINK ) ) )
            // InternalReactionRules.g:1140:3: () ( (lv_name_1_0= RULE_BOUND_LINK ) )
            {
            // InternalReactionRules.g:1140:3: ()
            // InternalReactionRules.g:1141:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoundAnyLinkAccess().getBoundAnyLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1147:3: ( (lv_name_1_0= RULE_BOUND_LINK ) )
            // InternalReactionRules.g:1148:4: (lv_name_1_0= RULE_BOUND_LINK )
            {
            // InternalReactionRules.g:1148:4: (lv_name_1_0= RULE_BOUND_LINK )
            // InternalReactionRules.g:1149:5: lv_name_1_0= RULE_BOUND_LINK
            {
            lv_name_1_0=(Token)match(input,RULE_BOUND_LINK,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBoundAnyLinkAccess().getNameBOUND_LINKTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoundAnyLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"biochemsimulation.reactionrules.ReactionRules.BOUND_LINK");
            				

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
    // $ANTLR end "ruleBoundAnyLink"


    // $ANTLR start "entryRuleFreeLink"
    // InternalReactionRules.g:1169:1: entryRuleFreeLink returns [EObject current=null] : iv_ruleFreeLink= ruleFreeLink EOF ;
    public final EObject entryRuleFreeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeLink = null;


        try {
            // InternalReactionRules.g:1169:49: (iv_ruleFreeLink= ruleFreeLink EOF )
            // InternalReactionRules.g:1170:2: iv_ruleFreeLink= ruleFreeLink EOF
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
    // InternalReactionRules.g:1176:1: ruleFreeLink returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) ) ;
    public final EObject ruleFreeLink() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1182:2: ( ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) ) )
            // InternalReactionRules.g:1183:2: ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) )
            {
            // InternalReactionRules.g:1183:2: ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) )
            // InternalReactionRules.g:1184:3: () ( (lv_name_1_0= RULE_FREE_LINK ) )
            {
            // InternalReactionRules.g:1184:3: ()
            // InternalReactionRules.g:1185:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFreeLinkAccess().getFreeLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1191:3: ( (lv_name_1_0= RULE_FREE_LINK ) )
            // InternalReactionRules.g:1192:4: (lv_name_1_0= RULE_FREE_LINK )
            {
            // InternalReactionRules.g:1192:4: (lv_name_1_0= RULE_FREE_LINK )
            // InternalReactionRules.g:1193:5: lv_name_1_0= RULE_FREE_LINK
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


    // $ANTLR start "entryRuleIndexedFreeLink"
    // InternalReactionRules.g:1213:1: entryRuleIndexedFreeLink returns [EObject current=null] : iv_ruleIndexedFreeLink= ruleIndexedFreeLink EOF ;
    public final EObject entryRuleIndexedFreeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedFreeLink = null;


        try {
            // InternalReactionRules.g:1213:56: (iv_ruleIndexedFreeLink= ruleIndexedFreeLink EOF )
            // InternalReactionRules.g:1214:2: iv_ruleIndexedFreeLink= ruleIndexedFreeLink EOF
            {
             newCompositeNode(grammarAccess.getIndexedFreeLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexedFreeLink=ruleIndexedFreeLink();

            state._fsp--;

             current =iv_ruleIndexedFreeLink; 
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
    // $ANTLR end "entryRuleIndexedFreeLink"


    // $ANTLR start "ruleIndexedFreeLink"
    // InternalReactionRules.g:1220:1: ruleIndexedFreeLink returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) otherlv_2= '(' ( (lv_state_3_0= ruleUnsignedInteger ) ) otherlv_4= ')' ) ;
    public final EObject ruleIndexedFreeLink() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_state_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1226:2: ( ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) otherlv_2= '(' ( (lv_state_3_0= ruleUnsignedInteger ) ) otherlv_4= ')' ) )
            // InternalReactionRules.g:1227:2: ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) otherlv_2= '(' ( (lv_state_3_0= ruleUnsignedInteger ) ) otherlv_4= ')' )
            {
            // InternalReactionRules.g:1227:2: ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) otherlv_2= '(' ( (lv_state_3_0= ruleUnsignedInteger ) ) otherlv_4= ')' )
            // InternalReactionRules.g:1228:3: () ( (lv_name_1_0= RULE_FREE_LINK ) ) otherlv_2= '(' ( (lv_state_3_0= ruleUnsignedInteger ) ) otherlv_4= ')'
            {
            // InternalReactionRules.g:1228:3: ()
            // InternalReactionRules.g:1229:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIndexedFreeLinkAccess().getIndexedFreeLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1235:3: ( (lv_name_1_0= RULE_FREE_LINK ) )
            // InternalReactionRules.g:1236:4: (lv_name_1_0= RULE_FREE_LINK )
            {
            // InternalReactionRules.g:1236:4: (lv_name_1_0= RULE_FREE_LINK )
            // InternalReactionRules.g:1237:5: lv_name_1_0= RULE_FREE_LINK
            {
            lv_name_1_0=(Token)match(input,RULE_FREE_LINK,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIndexedFreeLinkAccess().getNameFREE_LINKTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexedFreeLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"biochemsimulation.reactionrules.ReactionRules.FREE_LINK");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexedFreeLinkAccess().getLeftParenthesisKeyword_2());
            		
            // InternalReactionRules.g:1257:3: ( (lv_state_3_0= ruleUnsignedInteger ) )
            // InternalReactionRules.g:1258:4: (lv_state_3_0= ruleUnsignedInteger )
            {
            // InternalReactionRules.g:1258:4: (lv_state_3_0= ruleUnsignedInteger )
            // InternalReactionRules.g:1259:5: lv_state_3_0= ruleUnsignedInteger
            {

            					newCompositeNode(grammarAccess.getIndexedFreeLinkAccess().getStateUnsignedIntegerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_state_3_0=ruleUnsignedInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexedFreeLinkRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_3_0,
            						"biochemsimulation.reactionrules.ReactionRules.UnsignedInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexedFreeLinkAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleIndexedFreeLink"


    // $ANTLR start "entryRuleTypedFreeLink"
    // InternalReactionRules.g:1284:1: entryRuleTypedFreeLink returns [EObject current=null] : iv_ruleTypedFreeLink= ruleTypedFreeLink EOF ;
    public final EObject entryRuleTypedFreeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedFreeLink = null;


        try {
            // InternalReactionRules.g:1284:54: (iv_ruleTypedFreeLink= ruleTypedFreeLink EOF )
            // InternalReactionRules.g:1285:2: iv_ruleTypedFreeLink= ruleTypedFreeLink EOF
            {
             newCompositeNode(grammarAccess.getTypedFreeLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypedFreeLink=ruleTypedFreeLink();

            state._fsp--;

             current =iv_ruleTypedFreeLink; 
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
    // $ANTLR end "entryRuleTypedFreeLink"


    // $ANTLR start "ruleTypedFreeLink"
    // InternalReactionRules.g:1291:1: ruleTypedFreeLink returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleTypedFreeLink() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1297:2: ( ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            // InternalReactionRules.g:1298:2: ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            {
            // InternalReactionRules.g:1298:2: ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            // InternalReactionRules.g:1299:3: () ( (lv_name_1_0= RULE_FREE_LINK ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
            {
            // InternalReactionRules.g:1299:3: ()
            // InternalReactionRules.g:1300:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypedFreeLinkAccess().getTypedFreeLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1306:3: ( (lv_name_1_0= RULE_FREE_LINK ) )
            // InternalReactionRules.g:1307:4: (lv_name_1_0= RULE_FREE_LINK )
            {
            // InternalReactionRules.g:1307:4: (lv_name_1_0= RULE_FREE_LINK )
            // InternalReactionRules.g:1308:5: lv_name_1_0= RULE_FREE_LINK
            {
            lv_name_1_0=(Token)match(input,RULE_FREE_LINK,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypedFreeLinkAccess().getNameFREE_LINKTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypedFreeLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"biochemsimulation.reactionrules.ReactionRules.FREE_LINK");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTypedFreeLinkAccess().getLeftParenthesisKeyword_2());
            		
            // InternalReactionRules.g:1328:3: ( (otherlv_3= RULE_ID ) )
            // InternalReactionRules.g:1329:4: (otherlv_3= RULE_ID )
            {
            // InternalReactionRules.g:1329:4: (otherlv_3= RULE_ID )
            // InternalReactionRules.g:1330:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypedFreeLinkRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_3, grammarAccess.getTypedFreeLinkAccess().getStateAgentCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTypedFreeLinkAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleTypedFreeLink"


    // $ANTLR start "entryRuleWhatEver"
    // InternalReactionRules.g:1349:1: entryRuleWhatEver returns [EObject current=null] : iv_ruleWhatEver= ruleWhatEver EOF ;
    public final EObject entryRuleWhatEver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhatEver = null;


        try {
            // InternalReactionRules.g:1349:49: (iv_ruleWhatEver= ruleWhatEver EOF )
            // InternalReactionRules.g:1350:2: iv_ruleWhatEver= ruleWhatEver EOF
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
    // InternalReactionRules.g:1356:1: ruleWhatEver returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_WHATEVER_LINK ) ) ) ;
    public final EObject ruleWhatEver() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1362:2: ( ( () ( (lv_name_1_0= RULE_WHATEVER_LINK ) ) ) )
            // InternalReactionRules.g:1363:2: ( () ( (lv_name_1_0= RULE_WHATEVER_LINK ) ) )
            {
            // InternalReactionRules.g:1363:2: ( () ( (lv_name_1_0= RULE_WHATEVER_LINK ) ) )
            // InternalReactionRules.g:1364:3: () ( (lv_name_1_0= RULE_WHATEVER_LINK ) )
            {
            // InternalReactionRules.g:1364:3: ()
            // InternalReactionRules.g:1365:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhatEverAccess().getWhatEverAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1371:3: ( (lv_name_1_0= RULE_WHATEVER_LINK ) )
            // InternalReactionRules.g:1372:4: (lv_name_1_0= RULE_WHATEVER_LINK )
            {
            // InternalReactionRules.g:1372:4: (lv_name_1_0= RULE_WHATEVER_LINK )
            // InternalReactionRules.g:1373:5: lv_name_1_0= RULE_WHATEVER_LINK
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


    // $ANTLR start "entryRuleBoundLink"
    // InternalReactionRules.g:1393:1: entryRuleBoundLink returns [EObject current=null] : iv_ruleBoundLink= ruleBoundLink EOF ;
    public final EObject entryRuleBoundLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundLink = null;


        try {
            // InternalReactionRules.g:1393:50: (iv_ruleBoundLink= ruleBoundLink EOF )
            // InternalReactionRules.g:1394:2: iv_ruleBoundLink= ruleBoundLink EOF
            {
             newCompositeNode(grammarAccess.getBoundLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundLink=ruleBoundLink();

            state._fsp--;

             current =iv_ruleBoundLink; 
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
    // $ANTLR end "entryRuleBoundLink"


    // $ANTLR start "ruleBoundLink"
    // InternalReactionRules.g:1400:1: ruleBoundLink returns [EObject current=null] : ( () ( (lv_state_1_0= ruleUnsignedInteger ) ) ) ;
    public final EObject ruleBoundLink() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_state_1_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1406:2: ( ( () ( (lv_state_1_0= ruleUnsignedInteger ) ) ) )
            // InternalReactionRules.g:1407:2: ( () ( (lv_state_1_0= ruleUnsignedInteger ) ) )
            {
            // InternalReactionRules.g:1407:2: ( () ( (lv_state_1_0= ruleUnsignedInteger ) ) )
            // InternalReactionRules.g:1408:3: () ( (lv_state_1_0= ruleUnsignedInteger ) )
            {
            // InternalReactionRules.g:1408:3: ()
            // InternalReactionRules.g:1409:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoundLinkAccess().getBoundLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1415:3: ( (lv_state_1_0= ruleUnsignedInteger ) )
            // InternalReactionRules.g:1416:4: (lv_state_1_0= ruleUnsignedInteger )
            {
            // InternalReactionRules.g:1416:4: (lv_state_1_0= ruleUnsignedInteger )
            // InternalReactionRules.g:1417:5: lv_state_1_0= ruleUnsignedInteger
            {

            					newCompositeNode(grammarAccess.getBoundLinkAccess().getStateUnsignedIntegerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_state_1_0=ruleUnsignedInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoundLinkRule());
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
    // $ANTLR end "ruleBoundLink"


    // $ANTLR start "entryRuleMultiLink"
    // InternalReactionRules.g:1438:1: entryRuleMultiLink returns [EObject current=null] : iv_ruleMultiLink= ruleMultiLink EOF ;
    public final EObject entryRuleMultiLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLink = null;


        try {
            // InternalReactionRules.g:1438:50: (iv_ruleMultiLink= ruleMultiLink EOF )
            // InternalReactionRules.g:1439:2: iv_ruleMultiLink= ruleMultiLink EOF
            {
             newCompositeNode(grammarAccess.getMultiLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLink=ruleMultiLink();

            state._fsp--;

             current =iv_ruleMultiLink; 
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
    // $ANTLR end "entryRuleMultiLink"


    // $ANTLR start "ruleMultiLink"
    // InternalReactionRules.g:1445:1: ruleMultiLink returns [EObject current=null] : ( () ( ( ( (lv_states_1_1= ruleBoundLink | lv_states_1_2= ruleIndexedFreeLink | lv_states_1_3= ruleTypedFreeLink ) ) ) (otherlv_2= ',' ( ( (lv_states_3_1= ruleBoundLink | lv_states_3_2= ruleIndexedFreeLink | lv_states_3_3= ruleTypedFreeLink ) ) ) )+ )? ) ;
    public final EObject ruleMultiLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_states_1_1 = null;

        EObject lv_states_1_2 = null;

        EObject lv_states_1_3 = null;

        EObject lv_states_3_1 = null;

        EObject lv_states_3_2 = null;

        EObject lv_states_3_3 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1451:2: ( ( () ( ( ( (lv_states_1_1= ruleBoundLink | lv_states_1_2= ruleIndexedFreeLink | lv_states_1_3= ruleTypedFreeLink ) ) ) (otherlv_2= ',' ( ( (lv_states_3_1= ruleBoundLink | lv_states_3_2= ruleIndexedFreeLink | lv_states_3_3= ruleTypedFreeLink ) ) ) )+ )? ) )
            // InternalReactionRules.g:1452:2: ( () ( ( ( (lv_states_1_1= ruleBoundLink | lv_states_1_2= ruleIndexedFreeLink | lv_states_1_3= ruleTypedFreeLink ) ) ) (otherlv_2= ',' ( ( (lv_states_3_1= ruleBoundLink | lv_states_3_2= ruleIndexedFreeLink | lv_states_3_3= ruleTypedFreeLink ) ) ) )+ )? )
            {
            // InternalReactionRules.g:1452:2: ( () ( ( ( (lv_states_1_1= ruleBoundLink | lv_states_1_2= ruleIndexedFreeLink | lv_states_1_3= ruleTypedFreeLink ) ) ) (otherlv_2= ',' ( ( (lv_states_3_1= ruleBoundLink | lv_states_3_2= ruleIndexedFreeLink | lv_states_3_3= ruleTypedFreeLink ) ) ) )+ )? )
            // InternalReactionRules.g:1453:3: () ( ( ( (lv_states_1_1= ruleBoundLink | lv_states_1_2= ruleIndexedFreeLink | lv_states_1_3= ruleTypedFreeLink ) ) ) (otherlv_2= ',' ( ( (lv_states_3_1= ruleBoundLink | lv_states_3_2= ruleIndexedFreeLink | lv_states_3_3= ruleTypedFreeLink ) ) ) )+ )?
            {
            // InternalReactionRules.g:1453:3: ()
            // InternalReactionRules.g:1454:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMultiLinkAccess().getMultiLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1460:3: ( ( ( (lv_states_1_1= ruleBoundLink | lv_states_1_2= ruleIndexedFreeLink | lv_states_1_3= ruleTypedFreeLink ) ) ) (otherlv_2= ',' ( ( (lv_states_3_1= ruleBoundLink | lv_states_3_2= ruleIndexedFreeLink | lv_states_3_3= ruleTypedFreeLink ) ) ) )+ )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT||LA16_0==RULE_FREE_LINK) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalReactionRules.g:1461:4: ( ( (lv_states_1_1= ruleBoundLink | lv_states_1_2= ruleIndexedFreeLink | lv_states_1_3= ruleTypedFreeLink ) ) ) (otherlv_2= ',' ( ( (lv_states_3_1= ruleBoundLink | lv_states_3_2= ruleIndexedFreeLink | lv_states_3_3= ruleTypedFreeLink ) ) ) )+
                    {
                    // InternalReactionRules.g:1461:4: ( ( (lv_states_1_1= ruleBoundLink | lv_states_1_2= ruleIndexedFreeLink | lv_states_1_3= ruleTypedFreeLink ) ) )
                    // InternalReactionRules.g:1462:5: ( (lv_states_1_1= ruleBoundLink | lv_states_1_2= ruleIndexedFreeLink | lv_states_1_3= ruleTypedFreeLink ) )
                    {
                    // InternalReactionRules.g:1462:5: ( (lv_states_1_1= ruleBoundLink | lv_states_1_2= ruleIndexedFreeLink | lv_states_1_3= ruleTypedFreeLink ) )
                    // InternalReactionRules.g:1463:6: (lv_states_1_1= ruleBoundLink | lv_states_1_2= ruleIndexedFreeLink | lv_states_1_3= ruleTypedFreeLink )
                    {
                    // InternalReactionRules.g:1463:6: (lv_states_1_1= ruleBoundLink | lv_states_1_2= ruleIndexedFreeLink | lv_states_1_3= ruleTypedFreeLink )
                    int alt13=3;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_INT) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==RULE_FREE_LINK) ) {
                        int LA13_2 = input.LA(2);

                        if ( (LA13_2==27) ) {
                            int LA13_3 = input.LA(3);

                            if ( (LA13_3==RULE_ID) ) {
                                alt13=3;
                            }
                            else if ( (LA13_3==RULE_INT) ) {
                                alt13=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 3, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalReactionRules.g:1464:7: lv_states_1_1= ruleBoundLink
                            {

                            							newCompositeNode(grammarAccess.getMultiLinkAccess().getStatesBoundLinkParserRuleCall_1_0_0_0());
                            						
                            pushFollow(FOLLOW_17);
                            lv_states_1_1=ruleBoundLink();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMultiLinkRule());
                            							}
                            							add(
                            								current,
                            								"states",
                            								lv_states_1_1,
                            								"biochemsimulation.reactionrules.ReactionRules.BoundLink");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalReactionRules.g:1480:7: lv_states_1_2= ruleIndexedFreeLink
                            {

                            							newCompositeNode(grammarAccess.getMultiLinkAccess().getStatesIndexedFreeLinkParserRuleCall_1_0_0_1());
                            						
                            pushFollow(FOLLOW_17);
                            lv_states_1_2=ruleIndexedFreeLink();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMultiLinkRule());
                            							}
                            							add(
                            								current,
                            								"states",
                            								lv_states_1_2,
                            								"biochemsimulation.reactionrules.ReactionRules.IndexedFreeLink");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 3 :
                            // InternalReactionRules.g:1496:7: lv_states_1_3= ruleTypedFreeLink
                            {

                            							newCompositeNode(grammarAccess.getMultiLinkAccess().getStatesTypedFreeLinkParserRuleCall_1_0_0_2());
                            						
                            pushFollow(FOLLOW_17);
                            lv_states_1_3=ruleTypedFreeLink();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMultiLinkRule());
                            							}
                            							add(
                            								current,
                            								"states",
                            								lv_states_1_3,
                            								"biochemsimulation.reactionrules.ReactionRules.TypedFreeLink");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalReactionRules.g:1514:4: (otherlv_2= ',' ( ( (lv_states_3_1= ruleBoundLink | lv_states_3_2= ruleIndexedFreeLink | lv_states_3_3= ruleTypedFreeLink ) ) ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==24) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalReactionRules.g:1515:5: otherlv_2= ',' ( ( (lv_states_3_1= ruleBoundLink | lv_states_3_2= ruleIndexedFreeLink | lv_states_3_3= ruleTypedFreeLink ) ) )
                    	    {
                    	    otherlv_2=(Token)match(input,24,FOLLOW_18); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getMultiLinkAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalReactionRules.g:1519:5: ( ( (lv_states_3_1= ruleBoundLink | lv_states_3_2= ruleIndexedFreeLink | lv_states_3_3= ruleTypedFreeLink ) ) )
                    	    // InternalReactionRules.g:1520:6: ( (lv_states_3_1= ruleBoundLink | lv_states_3_2= ruleIndexedFreeLink | lv_states_3_3= ruleTypedFreeLink ) )
                    	    {
                    	    // InternalReactionRules.g:1520:6: ( (lv_states_3_1= ruleBoundLink | lv_states_3_2= ruleIndexedFreeLink | lv_states_3_3= ruleTypedFreeLink ) )
                    	    // InternalReactionRules.g:1521:7: (lv_states_3_1= ruleBoundLink | lv_states_3_2= ruleIndexedFreeLink | lv_states_3_3= ruleTypedFreeLink )
                    	    {
                    	    // InternalReactionRules.g:1521:7: (lv_states_3_1= ruleBoundLink | lv_states_3_2= ruleIndexedFreeLink | lv_states_3_3= ruleTypedFreeLink )
                    	    int alt14=3;
                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0==RULE_INT) ) {
                    	        alt14=1;
                    	    }
                    	    else if ( (LA14_0==RULE_FREE_LINK) ) {
                    	        int LA14_2 = input.LA(2);

                    	        if ( (LA14_2==27) ) {
                    	            int LA14_3 = input.LA(3);

                    	            if ( (LA14_3==RULE_ID) ) {
                    	                alt14=3;
                    	            }
                    	            else if ( (LA14_3==RULE_INT) ) {
                    	                alt14=2;
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
                    	            new NoViableAltException("", 14, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt14) {
                    	        case 1 :
                    	            // InternalReactionRules.g:1522:8: lv_states_3_1= ruleBoundLink
                    	            {

                    	            								newCompositeNode(grammarAccess.getMultiLinkAccess().getStatesBoundLinkParserRuleCall_1_1_1_0_0());
                    	            							
                    	            pushFollow(FOLLOW_19);
                    	            lv_states_3_1=ruleBoundLink();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getMultiLinkRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"states",
                    	            									lv_states_3_1,
                    	            									"biochemsimulation.reactionrules.ReactionRules.BoundLink");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalReactionRules.g:1538:8: lv_states_3_2= ruleIndexedFreeLink
                    	            {

                    	            								newCompositeNode(grammarAccess.getMultiLinkAccess().getStatesIndexedFreeLinkParserRuleCall_1_1_1_0_1());
                    	            							
                    	            pushFollow(FOLLOW_19);
                    	            lv_states_3_2=ruleIndexedFreeLink();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getMultiLinkRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"states",
                    	            									lv_states_3_2,
                    	            									"biochemsimulation.reactionrules.ReactionRules.IndexedFreeLink");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalReactionRules.g:1554:8: lv_states_3_3= ruleTypedFreeLink
                    	            {

                    	            								newCompositeNode(grammarAccess.getMultiLinkAccess().getStatesTypedFreeLinkParserRuleCall_1_1_1_0_2());
                    	            							
                    	            pushFollow(FOLLOW_19);
                    	            lv_states_3_3=ruleTypedFreeLink();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getMultiLinkRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"states",
                    	            									lv_states_3_3,
                    	            									"biochemsimulation.reactionrules.ReactionRules.TypedFreeLink");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
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
    // $ANTLR end "ruleMultiLink"


    // $ANTLR start "entryRuleBoundAnyOfTypeLinkAgent"
    // InternalReactionRules.g:1578:1: entryRuleBoundAnyOfTypeLinkAgent returns [EObject current=null] : iv_ruleBoundAnyOfTypeLinkAgent= ruleBoundAnyOfTypeLinkAgent EOF ;
    public final EObject entryRuleBoundAnyOfTypeLinkAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundAnyOfTypeLinkAgent = null;


        try {
            // InternalReactionRules.g:1578:64: (iv_ruleBoundAnyOfTypeLinkAgent= ruleBoundAnyOfTypeLinkAgent EOF )
            // InternalReactionRules.g:1579:2: iv_ruleBoundAnyOfTypeLinkAgent= ruleBoundAnyOfTypeLinkAgent EOF
            {
             newCompositeNode(grammarAccess.getBoundAnyOfTypeLinkAgentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundAnyOfTypeLinkAgent=ruleBoundAnyOfTypeLinkAgent();

            state._fsp--;

             current =iv_ruleBoundAnyOfTypeLinkAgent; 
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
    // $ANTLR end "entryRuleBoundAnyOfTypeLinkAgent"


    // $ANTLR start "ruleBoundAnyOfTypeLinkAgent"
    // InternalReactionRules.g:1585:1: ruleBoundAnyOfTypeLinkAgent returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleBoundAnyOfTypeLinkAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1591:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalReactionRules.g:1592:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalReactionRules.g:1592:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalReactionRules.g:1593:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalReactionRules.g:1593:3: ()
            // InternalReactionRules.g:1594:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getBoundAnyOfTypeLinkAgentAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1600:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:1601:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:1601:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:1602:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoundAnyOfTypeLinkAgentRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getAgentAgentCrossReference_1_0());
            				

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
    // $ANTLR end "ruleBoundAnyOfTypeLinkAgent"


    // $ANTLR start "entryRuleBoundAnyOfTypeLinkSite"
    // InternalReactionRules.g:1617:1: entryRuleBoundAnyOfTypeLinkSite returns [EObject current=null] : iv_ruleBoundAnyOfTypeLinkSite= ruleBoundAnyOfTypeLinkSite EOF ;
    public final EObject entryRuleBoundAnyOfTypeLinkSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundAnyOfTypeLinkSite = null;


        try {
            // InternalReactionRules.g:1617:63: (iv_ruleBoundAnyOfTypeLinkSite= ruleBoundAnyOfTypeLinkSite EOF )
            // InternalReactionRules.g:1618:2: iv_ruleBoundAnyOfTypeLinkSite= ruleBoundAnyOfTypeLinkSite EOF
            {
             newCompositeNode(grammarAccess.getBoundAnyOfTypeLinkSiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundAnyOfTypeLinkSite=ruleBoundAnyOfTypeLinkSite();

            state._fsp--;

             current =iv_ruleBoundAnyOfTypeLinkSite; 
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
    // $ANTLR end "entryRuleBoundAnyOfTypeLinkSite"


    // $ANTLR start "ruleBoundAnyOfTypeLinkSite"
    // InternalReactionRules.g:1624:1: ruleBoundAnyOfTypeLinkSite returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleBoundAnyOfTypeLinkSite() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1630:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalReactionRules.g:1631:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalReactionRules.g:1631:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalReactionRules.g:1632:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalReactionRules.g:1632:3: ()
            // InternalReactionRules.g:1633:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getBoundAnyOfTypeLinkSiteAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1639:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:1640:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:1640:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:1641:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoundAnyOfTypeLinkSiteRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getSiteSiteCrossReference_1_0());
            				

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
    // $ANTLR end "ruleBoundAnyOfTypeLinkSite"


    // $ANTLR start "entryRuleBoundAnyOfTypeLink"
    // InternalReactionRules.g:1656:1: entryRuleBoundAnyOfTypeLink returns [EObject current=null] : iv_ruleBoundAnyOfTypeLink= ruleBoundAnyOfTypeLink EOF ;
    public final EObject entryRuleBoundAnyOfTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundAnyOfTypeLink = null;


        try {
            // InternalReactionRules.g:1656:59: (iv_ruleBoundAnyOfTypeLink= ruleBoundAnyOfTypeLink EOF )
            // InternalReactionRules.g:1657:2: iv_ruleBoundAnyOfTypeLink= ruleBoundAnyOfTypeLink EOF
            {
             newCompositeNode(grammarAccess.getBoundAnyOfTypeLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundAnyOfTypeLink=ruleBoundAnyOfTypeLink();

            state._fsp--;

             current =iv_ruleBoundAnyOfTypeLink; 
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
    // $ANTLR end "entryRuleBoundAnyOfTypeLink"


    // $ANTLR start "ruleBoundAnyOfTypeLink"
    // InternalReactionRules.g:1663:1: ruleBoundAnyOfTypeLink returns [EObject current=null] : ( () ( (lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite ) ) ) ;
    public final EObject ruleBoundAnyOfTypeLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_linkAgent_1_0 = null;

        EObject lv_linkSite_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1669:2: ( ( () ( (lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite ) ) ) )
            // InternalReactionRules.g:1670:2: ( () ( (lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite ) ) )
            {
            // InternalReactionRules.g:1670:2: ( () ( (lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite ) ) )
            // InternalReactionRules.g:1671:3: () ( (lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite ) )
            {
            // InternalReactionRules.g:1671:3: ()
            // InternalReactionRules.g:1672:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoundAnyOfTypeLinkAccess().getBoundAnyOfTypeLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1678:3: ( (lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent ) )
            // InternalReactionRules.g:1679:4: (lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent )
            {
            // InternalReactionRules.g:1679:4: (lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent )
            // InternalReactionRules.g:1680:5: lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent
            {

            					newCompositeNode(grammarAccess.getBoundAnyOfTypeLinkAccess().getLinkAgentBoundAnyOfTypeLinkAgentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_linkAgent_1_0=ruleBoundAnyOfTypeLinkAgent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoundAnyOfTypeLinkRule());
            					}
            					set(
            						current,
            						"linkAgent",
            						lv_linkAgent_1_0,
            						"biochemsimulation.reactionrules.ReactionRules.BoundAnyOfTypeLinkAgent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBoundAnyOfTypeLinkAccess().getFullStopKeyword_2());
            		
            // InternalReactionRules.g:1701:3: ( (lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite ) )
            // InternalReactionRules.g:1702:4: (lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite )
            {
            // InternalReactionRules.g:1702:4: (lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite )
            // InternalReactionRules.g:1703:5: lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite
            {

            					newCompositeNode(grammarAccess.getBoundAnyOfTypeLinkAccess().getLinkSiteBoundAnyOfTypeLinkSiteParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_linkSite_3_0=ruleBoundAnyOfTypeLinkSite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoundAnyOfTypeLinkRule());
            					}
            					set(
            						current,
            						"linkSite",
            						lv_linkSite_3_0,
            						"biochemsimulation.reactionrules.ReactionRules.BoundAnyOfTypeLinkSite");
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
    // $ANTLR end "ruleBoundAnyOfTypeLink"


    // $ANTLR start "entryRuleSiteState"
    // InternalReactionRules.g:1724:1: entryRuleSiteState returns [EObject current=null] : iv_ruleSiteState= ruleSiteState EOF ;
    public final EObject entryRuleSiteState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiteState = null;


        try {
            // InternalReactionRules.g:1724:50: (iv_ruleSiteState= ruleSiteState EOF )
            // InternalReactionRules.g:1725:2: iv_ruleSiteState= ruleSiteState EOF
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
    // InternalReactionRules.g:1731:1: ruleSiteState returns [EObject current=null] : ( () otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) otherlv_3= '}' ) ;
    public final EObject ruleSiteState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1737:2: ( ( () otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) otherlv_3= '}' ) )
            // InternalReactionRules.g:1738:2: ( () otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) otherlv_3= '}' )
            {
            // InternalReactionRules.g:1738:2: ( () otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) otherlv_3= '}' )
            // InternalReactionRules.g:1739:3: () otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) otherlv_3= '}'
            {
            // InternalReactionRules.g:1739:3: ()
            // InternalReactionRules.g:1740:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSiteStateAccess().getSiteStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSiteStateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalReactionRules.g:1750:3: ( (otherlv_2= RULE_ID ) )
            // InternalReactionRules.g:1751:4: (otherlv_2= RULE_ID )
            {
            // InternalReactionRules.g:1751:4: (otherlv_2= RULE_ID )
            // InternalReactionRules.g:1752:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSiteStateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getSiteStateAccess().getStateStateCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSiteStateAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalReactionRules.g:1771:1: entryRuleLinkState returns [EObject current=null] : iv_ruleLinkState= ruleLinkState EOF ;
    public final EObject entryRuleLinkState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkState = null;


        try {
            // InternalReactionRules.g:1771:50: (iv_ruleLinkState= ruleLinkState EOF )
            // InternalReactionRules.g:1772:2: iv_ruleLinkState= ruleLinkState EOF
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
    // InternalReactionRules.g:1778:1: ruleLinkState returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyOfTypeLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleWhatEver ) ) ) otherlv_3= ']' ) ;
    public final EObject ruleLinkState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_linkState_2_1 = null;

        EObject lv_linkState_2_2 = null;

        EObject lv_linkState_2_3 = null;

        EObject lv_linkState_2_4 = null;

        EObject lv_linkState_2_5 = null;

        EObject lv_linkState_2_6 = null;

        EObject lv_linkState_2_7 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1784:2: ( ( () otherlv_1= '[' ( ( (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyOfTypeLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleWhatEver ) ) ) otherlv_3= ']' ) )
            // InternalReactionRules.g:1785:2: ( () otherlv_1= '[' ( ( (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyOfTypeLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleWhatEver ) ) ) otherlv_3= ']' )
            {
            // InternalReactionRules.g:1785:2: ( () otherlv_1= '[' ( ( (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyOfTypeLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleWhatEver ) ) ) otherlv_3= ']' )
            // InternalReactionRules.g:1786:3: () otherlv_1= '[' ( ( (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyOfTypeLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleWhatEver ) ) ) otherlv_3= ']'
            {
            // InternalReactionRules.g:1786:3: ()
            // InternalReactionRules.g:1787:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkStateAccess().getLinkStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkStateAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalReactionRules.g:1797:3: ( ( (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyOfTypeLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleWhatEver ) ) )
            // InternalReactionRules.g:1798:4: ( (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyOfTypeLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleWhatEver ) )
            {
            // InternalReactionRules.g:1798:4: ( (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyOfTypeLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleWhatEver ) )
            // InternalReactionRules.g:1799:5: (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyOfTypeLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleWhatEver )
            {
            // InternalReactionRules.g:1799:5: (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyOfTypeLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleWhatEver )
            int alt17=7;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalReactionRules.g:1800:6: lv_linkState_2_1= ruleBoundAnyLink
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateBoundAnyLinkParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_linkState_2_1=ruleBoundAnyLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_2_1,
                    							"biochemsimulation.reactionrules.ReactionRules.BoundAnyLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1816:6: lv_linkState_2_2= ruleFreeLink
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateFreeLinkParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_22);
                    lv_linkState_2_2=ruleFreeLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_2_2,
                    							"biochemsimulation.reactionrules.ReactionRules.FreeLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalReactionRules.g:1832:6: lv_linkState_2_3= ruleIndexedFreeLink
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateIndexedFreeLinkParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_22);
                    lv_linkState_2_3=ruleIndexedFreeLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_2_3,
                    							"biochemsimulation.reactionrules.ReactionRules.IndexedFreeLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 4 :
                    // InternalReactionRules.g:1848:6: lv_linkState_2_4= ruleTypedFreeLink
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateTypedFreeLinkParserRuleCall_2_0_3());
                    					
                    pushFollow(FOLLOW_22);
                    lv_linkState_2_4=ruleTypedFreeLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_2_4,
                    							"biochemsimulation.reactionrules.ReactionRules.TypedFreeLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 5 :
                    // InternalReactionRules.g:1864:6: lv_linkState_2_5= ruleBoundAnyOfTypeLink
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateBoundAnyOfTypeLinkParserRuleCall_2_0_4());
                    					
                    pushFollow(FOLLOW_22);
                    lv_linkState_2_5=ruleBoundAnyOfTypeLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_2_5,
                    							"biochemsimulation.reactionrules.ReactionRules.BoundAnyOfTypeLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 6 :
                    // InternalReactionRules.g:1880:6: lv_linkState_2_6= ruleBoundLink
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateBoundLinkParserRuleCall_2_0_5());
                    					
                    pushFollow(FOLLOW_22);
                    lv_linkState_2_6=ruleBoundLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_2_6,
                    							"biochemsimulation.reactionrules.ReactionRules.BoundLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 7 :
                    // InternalReactionRules.g:1896:6: lv_linkState_2_7= ruleWhatEver
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateWhatEverParserRuleCall_2_0_6());
                    					
                    pushFollow(FOLLOW_22);
                    lv_linkState_2_7=ruleWhatEver();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_2_7,
                    							"biochemsimulation.reactionrules.ReactionRules.WhatEver");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkStateAccess().getRightSquareBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleMultiLinkState"
    // InternalReactionRules.g:1922:1: entryRuleMultiLinkState returns [EObject current=null] : iv_ruleMultiLinkState= ruleMultiLinkState EOF ;
    public final EObject entryRuleMultiLinkState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLinkState = null;


        try {
            // InternalReactionRules.g:1922:55: (iv_ruleMultiLinkState= ruleMultiLinkState EOF )
            // InternalReactionRules.g:1923:2: iv_ruleMultiLinkState= ruleMultiLinkState EOF
            {
             newCompositeNode(grammarAccess.getMultiLinkStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLinkState=ruleMultiLinkState();

            state._fsp--;

             current =iv_ruleMultiLinkState; 
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
    // $ANTLR end "entryRuleMultiLinkState"


    // $ANTLR start "ruleMultiLinkState"
    // InternalReactionRules.g:1929:1: ruleMultiLinkState returns [EObject current=null] : ( () otherlv_1= '*[' ( ( (lv_linkState_2_1= ruleWhatEver | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleMultiLink ) ) ) otherlv_3= ']' ) ;
    public final EObject ruleMultiLinkState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_linkState_2_1 = null;

        EObject lv_linkState_2_2 = null;

        EObject lv_linkState_2_3 = null;

        EObject lv_linkState_2_4 = null;

        EObject lv_linkState_2_5 = null;

        EObject lv_linkState_2_6 = null;

        EObject lv_linkState_2_7 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1935:2: ( ( () otherlv_1= '*[' ( ( (lv_linkState_2_1= ruleWhatEver | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleMultiLink ) ) ) otherlv_3= ']' ) )
            // InternalReactionRules.g:1936:2: ( () otherlv_1= '*[' ( ( (lv_linkState_2_1= ruleWhatEver | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleMultiLink ) ) ) otherlv_3= ']' )
            {
            // InternalReactionRules.g:1936:2: ( () otherlv_1= '*[' ( ( (lv_linkState_2_1= ruleWhatEver | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleMultiLink ) ) ) otherlv_3= ']' )
            // InternalReactionRules.g:1937:3: () otherlv_1= '*[' ( ( (lv_linkState_2_1= ruleWhatEver | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleMultiLink ) ) ) otherlv_3= ']'
            {
            // InternalReactionRules.g:1937:3: ()
            // InternalReactionRules.g:1938:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMultiLinkStateAccess().getMultiLinkStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiLinkStateAccess().getAsteriskLeftSquareBracketKeyword_1());
            		
            // InternalReactionRules.g:1948:3: ( ( (lv_linkState_2_1= ruleWhatEver | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleMultiLink ) ) )
            // InternalReactionRules.g:1949:4: ( (lv_linkState_2_1= ruleWhatEver | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleMultiLink ) )
            {
            // InternalReactionRules.g:1949:4: ( (lv_linkState_2_1= ruleWhatEver | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleMultiLink ) )
            // InternalReactionRules.g:1950:5: (lv_linkState_2_1= ruleWhatEver | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleMultiLink )
            {
            // InternalReactionRules.g:1950:5: (lv_linkState_2_1= ruleWhatEver | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleMultiLink )
            int alt18=7;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalReactionRules.g:1951:6: lv_linkState_2_1= ruleWhatEver
                    {

                    						newCompositeNode(grammarAccess.getMultiLinkStateAccess().getLinkStateWhatEverParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_linkState_2_1=ruleWhatEver();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_2_1,
                    							"biochemsimulation.reactionrules.ReactionRules.WhatEver");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1967:6: lv_linkState_2_2= ruleFreeLink
                    {

                    						newCompositeNode(grammarAccess.getMultiLinkStateAccess().getLinkStateFreeLinkParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_22);
                    lv_linkState_2_2=ruleFreeLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_2_2,
                    							"biochemsimulation.reactionrules.ReactionRules.FreeLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalReactionRules.g:1983:6: lv_linkState_2_3= ruleIndexedFreeLink
                    {

                    						newCompositeNode(grammarAccess.getMultiLinkStateAccess().getLinkStateIndexedFreeLinkParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_22);
                    lv_linkState_2_3=ruleIndexedFreeLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_2_3,
                    							"biochemsimulation.reactionrules.ReactionRules.IndexedFreeLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 4 :
                    // InternalReactionRules.g:1999:6: lv_linkState_2_4= ruleTypedFreeLink
                    {

                    						newCompositeNode(grammarAccess.getMultiLinkStateAccess().getLinkStateTypedFreeLinkParserRuleCall_2_0_3());
                    					
                    pushFollow(FOLLOW_22);
                    lv_linkState_2_4=ruleTypedFreeLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_2_4,
                    							"biochemsimulation.reactionrules.ReactionRules.TypedFreeLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 5 :
                    // InternalReactionRules.g:2015:6: lv_linkState_2_5= ruleBoundAnyLink
                    {

                    						newCompositeNode(grammarAccess.getMultiLinkStateAccess().getLinkStateBoundAnyLinkParserRuleCall_2_0_4());
                    					
                    pushFollow(FOLLOW_22);
                    lv_linkState_2_5=ruleBoundAnyLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_2_5,
                    							"biochemsimulation.reactionrules.ReactionRules.BoundAnyLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 6 :
                    // InternalReactionRules.g:2031:6: lv_linkState_2_6= ruleBoundLink
                    {

                    						newCompositeNode(grammarAccess.getMultiLinkStateAccess().getLinkStateBoundLinkParserRuleCall_2_0_5());
                    					
                    pushFollow(FOLLOW_22);
                    lv_linkState_2_6=ruleBoundLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_2_6,
                    							"biochemsimulation.reactionrules.ReactionRules.BoundLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 7 :
                    // InternalReactionRules.g:2047:6: lv_linkState_2_7= ruleMultiLink
                    {

                    						newCompositeNode(grammarAccess.getMultiLinkStateAccess().getLinkStateMultiLinkParserRuleCall_2_0_6());
                    					
                    pushFollow(FOLLOW_22);
                    lv_linkState_2_7=ruleMultiLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_2_7,
                    							"biochemsimulation.reactionrules.ReactionRules.MultiLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiLinkStateAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleMultiLinkState"


    // $ANTLR start "entryRuleSingleSitePattern"
    // InternalReactionRules.g:2073:1: entryRuleSingleSitePattern returns [EObject current=null] : iv_ruleSingleSitePattern= ruleSingleSitePattern EOF ;
    public final EObject entryRuleSingleSitePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSitePattern = null;


        try {
            // InternalReactionRules.g:2073:58: (iv_ruleSingleSitePattern= ruleSingleSitePattern EOF )
            // InternalReactionRules.g:2074:2: iv_ruleSingleSitePattern= ruleSingleSitePattern EOF
            {
             newCompositeNode(grammarAccess.getSingleSitePatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleSitePattern=ruleSingleSitePattern();

            state._fsp--;

             current =iv_ruleSingleSitePattern; 
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
    // $ANTLR end "entryRuleSingleSitePattern"


    // $ANTLR start "ruleSingleSitePattern"
    // InternalReactionRules.g:2080:1: ruleSingleSitePattern returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_state_2_0= ruleSiteState ) )? ( (lv_linkState_3_0= ruleLinkState ) ) ) ;
    public final EObject ruleSingleSitePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_state_2_0 = null;

        EObject lv_linkState_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2086:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_state_2_0= ruleSiteState ) )? ( (lv_linkState_3_0= ruleLinkState ) ) ) )
            // InternalReactionRules.g:2087:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_state_2_0= ruleSiteState ) )? ( (lv_linkState_3_0= ruleLinkState ) ) )
            {
            // InternalReactionRules.g:2087:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_state_2_0= ruleSiteState ) )? ( (lv_linkState_3_0= ruleLinkState ) ) )
            // InternalReactionRules.g:2088:3: () ( (otherlv_1= RULE_ID ) ) ( (lv_state_2_0= ruleSiteState ) )? ( (lv_linkState_3_0= ruleLinkState ) )
            {
            // InternalReactionRules.g:2088:3: ()
            // InternalReactionRules.g:2089:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSingleSitePatternAccess().getSingleSitePatternAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:2095:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:2096:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:2096:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:2097:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleSitePatternRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_1, grammarAccess.getSingleSitePatternAccess().getSiteSingleSiteCrossReference_1_0());
            				

            }


            }

            // InternalReactionRules.g:2108:3: ( (lv_state_2_0= ruleSiteState ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalReactionRules.g:2109:4: (lv_state_2_0= ruleSiteState )
                    {
                    // InternalReactionRules.g:2109:4: (lv_state_2_0= ruleSiteState )
                    // InternalReactionRules.g:2110:5: lv_state_2_0= ruleSiteState
                    {

                    					newCompositeNode(grammarAccess.getSingleSitePatternAccess().getStateSiteStateParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_state_2_0=ruleSiteState();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSingleSitePatternRule());
                    					}
                    					set(
                    						current,
                    						"state",
                    						lv_state_2_0,
                    						"biochemsimulation.reactionrules.ReactionRules.SiteState");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalReactionRules.g:2127:3: ( (lv_linkState_3_0= ruleLinkState ) )
            // InternalReactionRules.g:2128:4: (lv_linkState_3_0= ruleLinkState )
            {
            // InternalReactionRules.g:2128:4: (lv_linkState_3_0= ruleLinkState )
            // InternalReactionRules.g:2129:5: lv_linkState_3_0= ruleLinkState
            {

            					newCompositeNode(grammarAccess.getSingleSitePatternAccess().getLinkStateLinkStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_linkState_3_0=ruleLinkState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleSitePatternRule());
            					}
            					set(
            						current,
            						"linkState",
            						lv_linkState_3_0,
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
    // $ANTLR end "ruleSingleSitePattern"


    // $ANTLR start "entryRuleMultiLinkSitePattern"
    // InternalReactionRules.g:2150:1: entryRuleMultiLinkSitePattern returns [EObject current=null] : iv_ruleMultiLinkSitePattern= ruleMultiLinkSitePattern EOF ;
    public final EObject entryRuleMultiLinkSitePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLinkSitePattern = null;


        try {
            // InternalReactionRules.g:2150:61: (iv_ruleMultiLinkSitePattern= ruleMultiLinkSitePattern EOF )
            // InternalReactionRules.g:2151:2: iv_ruleMultiLinkSitePattern= ruleMultiLinkSitePattern EOF
            {
             newCompositeNode(grammarAccess.getMultiLinkSitePatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiLinkSitePattern=ruleMultiLinkSitePattern();

            state._fsp--;

             current =iv_ruleMultiLinkSitePattern; 
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
    // $ANTLR end "entryRuleMultiLinkSitePattern"


    // $ANTLR start "ruleMultiLinkSitePattern"
    // InternalReactionRules.g:2157:1: ruleMultiLinkSitePattern returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_state_2_0= ruleSiteState ) )? ( (lv_linkState_3_0= ruleMultiLinkState ) ) ) ;
    public final EObject ruleMultiLinkSitePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_state_2_0 = null;

        EObject lv_linkState_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2163:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_state_2_0= ruleSiteState ) )? ( (lv_linkState_3_0= ruleMultiLinkState ) ) ) )
            // InternalReactionRules.g:2164:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_state_2_0= ruleSiteState ) )? ( (lv_linkState_3_0= ruleMultiLinkState ) ) )
            {
            // InternalReactionRules.g:2164:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_state_2_0= ruleSiteState ) )? ( (lv_linkState_3_0= ruleMultiLinkState ) ) )
            // InternalReactionRules.g:2165:3: () ( (otherlv_1= RULE_ID ) ) ( (lv_state_2_0= ruleSiteState ) )? ( (lv_linkState_3_0= ruleMultiLinkState ) )
            {
            // InternalReactionRules.g:2165:3: ()
            // InternalReactionRules.g:2166:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMultiLinkSitePatternAccess().getMultiLinkSitePatternAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:2172:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:2173:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:2173:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:2174:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiLinkSitePatternRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_1, grammarAccess.getMultiLinkSitePatternAccess().getSiteMultiSiteCrossReference_1_0());
            				

            }


            }

            // InternalReactionRules.g:2185:3: ( (lv_state_2_0= ruleSiteState ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalReactionRules.g:2186:4: (lv_state_2_0= ruleSiteState )
                    {
                    // InternalReactionRules.g:2186:4: (lv_state_2_0= ruleSiteState )
                    // InternalReactionRules.g:2187:5: lv_state_2_0= ruleSiteState
                    {

                    					newCompositeNode(grammarAccess.getMultiLinkSitePatternAccess().getStateSiteStateParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_state_2_0=ruleSiteState();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMultiLinkSitePatternRule());
                    					}
                    					set(
                    						current,
                    						"state",
                    						lv_state_2_0,
                    						"biochemsimulation.reactionrules.ReactionRules.SiteState");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalReactionRules.g:2204:3: ( (lv_linkState_3_0= ruleMultiLinkState ) )
            // InternalReactionRules.g:2205:4: (lv_linkState_3_0= ruleMultiLinkState )
            {
            // InternalReactionRules.g:2205:4: (lv_linkState_3_0= ruleMultiLinkState )
            // InternalReactionRules.g:2206:5: lv_linkState_3_0= ruleMultiLinkState
            {

            					newCompositeNode(grammarAccess.getMultiLinkSitePatternAccess().getLinkStateMultiLinkStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_linkState_3_0=ruleMultiLinkState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiLinkSitePatternRule());
            					}
            					set(
            						current,
            						"linkState",
            						lv_linkState_3_0,
            						"biochemsimulation.reactionrules.ReactionRules.MultiLinkState");
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
    // $ANTLR end "ruleMultiLinkSitePattern"


    // $ANTLR start "entryRuleSitePattern"
    // InternalReactionRules.g:2227:1: entryRuleSitePattern returns [EObject current=null] : iv_ruleSitePattern= ruleSitePattern EOF ;
    public final EObject entryRuleSitePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSitePattern = null;


        try {
            // InternalReactionRules.g:2227:52: (iv_ruleSitePattern= ruleSitePattern EOF )
            // InternalReactionRules.g:2228:2: iv_ruleSitePattern= ruleSitePattern EOF
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
    // InternalReactionRules.g:2234:1: ruleSitePattern returns [EObject current=null] : (this_SingleSitePattern_0= ruleSingleSitePattern | this_MultiLinkSitePattern_1= ruleMultiLinkSitePattern ) ;
    public final EObject ruleSitePattern() throws RecognitionException {
        EObject current = null;

        EObject this_SingleSitePattern_0 = null;

        EObject this_MultiLinkSitePattern_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2240:2: ( (this_SingleSitePattern_0= ruleSingleSitePattern | this_MultiLinkSitePattern_1= ruleMultiLinkSitePattern ) )
            // InternalReactionRules.g:2241:2: (this_SingleSitePattern_0= ruleSingleSitePattern | this_MultiLinkSitePattern_1= ruleMultiLinkSitePattern )
            {
            // InternalReactionRules.g:2241:2: (this_SingleSitePattern_0= ruleSingleSitePattern | this_MultiLinkSitePattern_1= ruleMultiLinkSitePattern )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    int LA21_2 = input.LA(3);

                    if ( (LA21_2==RULE_ID) ) {
                        int LA21_5 = input.LA(4);

                        if ( (LA21_5==25) ) {
                            int LA21_6 = input.LA(5);

                            if ( (LA21_6==32) ) {
                                alt21=1;
                            }
                            else if ( (LA21_6==34) ) {
                                alt21=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 21, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 32:
                    {
                    alt21=1;
                    }
                    break;
                case 34:
                    {
                    alt21=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalReactionRules.g:2242:3: this_SingleSitePattern_0= ruleSingleSitePattern
                    {

                    			newCompositeNode(grammarAccess.getSitePatternAccess().getSingleSitePatternParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleSitePattern_0=ruleSingleSitePattern();

                    state._fsp--;


                    			current = this_SingleSitePattern_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:2251:3: this_MultiLinkSitePattern_1= ruleMultiLinkSitePattern
                    {

                    			newCompositeNode(grammarAccess.getSitePatternAccess().getMultiLinkSitePatternParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiLinkSitePattern_1=ruleMultiLinkSitePattern();

                    state._fsp--;


                    			current = this_MultiLinkSitePattern_1;
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
    // $ANTLR end "ruleSitePattern"


    // $ANTLR start "entryRuleSitePatterns"
    // InternalReactionRules.g:2263:1: entryRuleSitePatterns returns [EObject current=null] : iv_ruleSitePatterns= ruleSitePatterns EOF ;
    public final EObject entryRuleSitePatterns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSitePatterns = null;


        try {
            // InternalReactionRules.g:2263:53: (iv_ruleSitePatterns= ruleSitePatterns EOF )
            // InternalReactionRules.g:2264:2: iv_ruleSitePatterns= ruleSitePatterns EOF
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
    // InternalReactionRules.g:2270:1: ruleSitePatterns returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_sitePatterns_2_0= ruleSitePattern ) ) (otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleSitePatterns() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_sitePatterns_2_0 = null;

        EObject lv_sitePatterns_4_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2276:2: ( ( () otherlv_1= '(' ( ( (lv_sitePatterns_2_0= ruleSitePattern ) ) (otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) ) )* )? otherlv_5= ')' ) )
            // InternalReactionRules.g:2277:2: ( () otherlv_1= '(' ( ( (lv_sitePatterns_2_0= ruleSitePattern ) ) (otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) ) )* )? otherlv_5= ')' )
            {
            // InternalReactionRules.g:2277:2: ( () otherlv_1= '(' ( ( (lv_sitePatterns_2_0= ruleSitePattern ) ) (otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) ) )* )? otherlv_5= ')' )
            // InternalReactionRules.g:2278:3: () otherlv_1= '(' ( ( (lv_sitePatterns_2_0= ruleSitePattern ) ) (otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) ) )* )? otherlv_5= ')'
            {
            // InternalReactionRules.g:2278:3: ()
            // InternalReactionRules.g:2279:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSitePatternsAccess().getSitePatternsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getSitePatternsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalReactionRules.g:2289:3: ( ( (lv_sitePatterns_2_0= ruleSitePattern ) ) (otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalReactionRules.g:2290:4: ( (lv_sitePatterns_2_0= ruleSitePattern ) ) (otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) ) )*
                    {
                    // InternalReactionRules.g:2290:4: ( (lv_sitePatterns_2_0= ruleSitePattern ) )
                    // InternalReactionRules.g:2291:5: (lv_sitePatterns_2_0= ruleSitePattern )
                    {
                    // InternalReactionRules.g:2291:5: (lv_sitePatterns_2_0= ruleSitePattern )
                    // InternalReactionRules.g:2292:6: lv_sitePatterns_2_0= ruleSitePattern
                    {

                    						newCompositeNode(grammarAccess.getSitePatternsAccess().getSitePatternsSitePatternParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_sitePatterns_2_0=ruleSitePattern();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSitePatternsRule());
                    						}
                    						add(
                    							current,
                    							"sitePatterns",
                    							lv_sitePatterns_2_0,
                    							"biochemsimulation.reactionrules.ReactionRules.SitePattern");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReactionRules.g:2309:4: (otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==24) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalReactionRules.g:2310:5: otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSitePatternsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalReactionRules.g:2314:5: ( (lv_sitePatterns_4_0= ruleSitePattern ) )
                    	    // InternalReactionRules.g:2315:6: (lv_sitePatterns_4_0= ruleSitePattern )
                    	    {
                    	    // InternalReactionRules.g:2315:6: (lv_sitePatterns_4_0= ruleSitePattern )
                    	    // InternalReactionRules.g:2316:7: lv_sitePatterns_4_0= ruleSitePattern
                    	    {

                    	    							newCompositeNode(grammarAccess.getSitePatternsAccess().getSitePatternsSitePatternParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_sitePatterns_4_0=ruleSitePattern();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSitePatternsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sitePatterns",
                    	    								lv_sitePatterns_4_0,
                    	    								"biochemsimulation.reactionrules.ReactionRules.SitePattern");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSitePatternsAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleValidAgentPattern"
    // InternalReactionRules.g:2343:1: entryRuleValidAgentPattern returns [EObject current=null] : iv_ruleValidAgentPattern= ruleValidAgentPattern EOF ;
    public final EObject entryRuleValidAgentPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidAgentPattern = null;


        try {
            // InternalReactionRules.g:2343:58: (iv_ruleValidAgentPattern= ruleValidAgentPattern EOF )
            // InternalReactionRules.g:2344:2: iv_ruleValidAgentPattern= ruleValidAgentPattern EOF
            {
             newCompositeNode(grammarAccess.getValidAgentPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidAgentPattern=ruleValidAgentPattern();

            state._fsp--;

             current =iv_ruleValidAgentPattern; 
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
    // $ANTLR end "entryRuleValidAgentPattern"


    // $ANTLR start "ruleValidAgentPattern"
    // InternalReactionRules.g:2350:1: ruleValidAgentPattern returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_sitePatterns_2_0= ruleSitePatterns ) ) ) ;
    public final EObject ruleValidAgentPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sitePatterns_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2356:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_sitePatterns_2_0= ruleSitePatterns ) ) ) )
            // InternalReactionRules.g:2357:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_sitePatterns_2_0= ruleSitePatterns ) ) )
            {
            // InternalReactionRules.g:2357:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_sitePatterns_2_0= ruleSitePatterns ) ) )
            // InternalReactionRules.g:2358:3: () ( (otherlv_1= RULE_ID ) ) ( (lv_sitePatterns_2_0= ruleSitePatterns ) )
            {
            // InternalReactionRules.g:2358:3: ()
            // InternalReactionRules.g:2359:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValidAgentPatternAccess().getValidAgentPatternAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:2365:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:2366:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:2366:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:2367:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidAgentPatternRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getValidAgentPatternAccess().getAgentAgentCrossReference_1_0());
            				

            }


            }

            // InternalReactionRules.g:2378:3: ( (lv_sitePatterns_2_0= ruleSitePatterns ) )
            // InternalReactionRules.g:2379:4: (lv_sitePatterns_2_0= ruleSitePatterns )
            {
            // InternalReactionRules.g:2379:4: (lv_sitePatterns_2_0= ruleSitePatterns )
            // InternalReactionRules.g:2380:5: lv_sitePatterns_2_0= ruleSitePatterns
            {

            					newCompositeNode(grammarAccess.getValidAgentPatternAccess().getSitePatternsSitePatternsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_sitePatterns_2_0=ruleSitePatterns();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValidAgentPatternRule());
            					}
            					set(
            						current,
            						"sitePatterns",
            						lv_sitePatterns_2_0,
            						"biochemsimulation.reactionrules.ReactionRules.SitePatterns");
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
    // $ANTLR end "ruleValidAgentPattern"


    // $ANTLR start "entryRuleVoidAgentPattern"
    // InternalReactionRules.g:2401:1: entryRuleVoidAgentPattern returns [EObject current=null] : iv_ruleVoidAgentPattern= ruleVoidAgentPattern EOF ;
    public final EObject entryRuleVoidAgentPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidAgentPattern = null;


        try {
            // InternalReactionRules.g:2401:57: (iv_ruleVoidAgentPattern= ruleVoidAgentPattern EOF )
            // InternalReactionRules.g:2402:2: iv_ruleVoidAgentPattern= ruleVoidAgentPattern EOF
            {
             newCompositeNode(grammarAccess.getVoidAgentPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVoidAgentPattern=ruleVoidAgentPattern();

            state._fsp--;

             current =iv_ruleVoidAgentPattern; 
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
    // $ANTLR end "entryRuleVoidAgentPattern"


    // $ANTLR start "ruleVoidAgentPattern"
    // InternalReactionRules.g:2408:1: ruleVoidAgentPattern returns [EObject current=null] : ( (lv_pattern_0_0= RULE_VOID_PATTERN ) ) ;
    public final EObject ruleVoidAgentPattern() throws RecognitionException {
        EObject current = null;

        Token lv_pattern_0_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:2414:2: ( ( (lv_pattern_0_0= RULE_VOID_PATTERN ) ) )
            // InternalReactionRules.g:2415:2: ( (lv_pattern_0_0= RULE_VOID_PATTERN ) )
            {
            // InternalReactionRules.g:2415:2: ( (lv_pattern_0_0= RULE_VOID_PATTERN ) )
            // InternalReactionRules.g:2416:3: (lv_pattern_0_0= RULE_VOID_PATTERN )
            {
            // InternalReactionRules.g:2416:3: (lv_pattern_0_0= RULE_VOID_PATTERN )
            // InternalReactionRules.g:2417:4: lv_pattern_0_0= RULE_VOID_PATTERN
            {
            lv_pattern_0_0=(Token)match(input,RULE_VOID_PATTERN,FOLLOW_2); 

            				newLeafNode(lv_pattern_0_0, grammarAccess.getVoidAgentPatternAccess().getPatternVOID_PATTERNTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVoidAgentPatternRule());
            				}
            				setWithLastConsumed(
            					current,
            					"pattern",
            					lv_pattern_0_0,
            					"biochemsimulation.reactionrules.ReactionRules.VOID_PATTERN");
            			

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
    // $ANTLR end "ruleVoidAgentPattern"


    // $ANTLR start "entryRuleAgentPattern"
    // InternalReactionRules.g:2436:1: entryRuleAgentPattern returns [EObject current=null] : iv_ruleAgentPattern= ruleAgentPattern EOF ;
    public final EObject entryRuleAgentPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgentPattern = null;


        try {
            // InternalReactionRules.g:2436:53: (iv_ruleAgentPattern= ruleAgentPattern EOF )
            // InternalReactionRules.g:2437:2: iv_ruleAgentPattern= ruleAgentPattern EOF
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
    // InternalReactionRules.g:2443:1: ruleAgentPattern returns [EObject current=null] : (this_ValidAgentPattern_0= ruleValidAgentPattern | this_VoidAgentPattern_1= ruleVoidAgentPattern ) ;
    public final EObject ruleAgentPattern() throws RecognitionException {
        EObject current = null;

        EObject this_ValidAgentPattern_0 = null;

        EObject this_VoidAgentPattern_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2449:2: ( (this_ValidAgentPattern_0= ruleValidAgentPattern | this_VoidAgentPattern_1= ruleVoidAgentPattern ) )
            // InternalReactionRules.g:2450:2: (this_ValidAgentPattern_0= ruleValidAgentPattern | this_VoidAgentPattern_1= ruleVoidAgentPattern )
            {
            // InternalReactionRules.g:2450:2: (this_ValidAgentPattern_0= ruleValidAgentPattern | this_VoidAgentPattern_1= ruleVoidAgentPattern )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_VOID_PATTERN) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalReactionRules.g:2451:3: this_ValidAgentPattern_0= ruleValidAgentPattern
                    {

                    			newCompositeNode(grammarAccess.getAgentPatternAccess().getValidAgentPatternParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValidAgentPattern_0=ruleValidAgentPattern();

                    state._fsp--;


                    			current = this_ValidAgentPattern_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:2460:3: this_VoidAgentPattern_1= ruleVoidAgentPattern
                    {

                    			newCompositeNode(grammarAccess.getAgentPatternAccess().getVoidAgentPatternParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VoidAgentPattern_1=ruleVoidAgentPattern();

                    state._fsp--;


                    			current = this_VoidAgentPattern_1;
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
    // $ANTLR end "ruleAgentPattern"


    // $ANTLR start "entryRulePattern"
    // InternalReactionRules.g:2472:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalReactionRules.g:2472:48: (iv_rulePattern= rulePattern EOF )
            // InternalReactionRules.g:2473:2: iv_rulePattern= rulePattern EOF
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
    // InternalReactionRules.g:2479:1: rulePattern returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}' ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_agentPatterns_2_0 = null;

        EObject lv_agentPatterns_4_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2485:2: ( ( () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}' ) )
            // InternalReactionRules.g:2486:2: ( () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}' )
            {
            // InternalReactionRules.g:2486:2: ( () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}' )
            // InternalReactionRules.g:2487:3: () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}'
            {
            // InternalReactionRules.g:2487:3: ()
            // InternalReactionRules.g:2488:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternAccess().getPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalReactionRules.g:2498:3: ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||LA26_0==RULE_VOID_PATTERN) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalReactionRules.g:2499:4: ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )*
                    {
                    // InternalReactionRules.g:2499:4: ( (lv_agentPatterns_2_0= ruleAgentPattern ) )
                    // InternalReactionRules.g:2500:5: (lv_agentPatterns_2_0= ruleAgentPattern )
                    {
                    // InternalReactionRules.g:2500:5: (lv_agentPatterns_2_0= ruleAgentPattern )
                    // InternalReactionRules.g:2501:6: lv_agentPatterns_2_0= ruleAgentPattern
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getAgentPatternsAgentPatternParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalReactionRules.g:2518:4: (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==24) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalReactionRules.g:2519:5: otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_28); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalReactionRules.g:2523:5: ( (lv_agentPatterns_4_0= ruleAgentPattern ) )
                    	    // InternalReactionRules.g:2524:6: (lv_agentPatterns_4_0= ruleAgentPattern )
                    	    {
                    	    // InternalReactionRules.g:2524:6: (lv_agentPatterns_4_0= ruleAgentPattern )
                    	    // InternalReactionRules.g:2525:7: lv_agentPatterns_4_0= ruleAgentPattern
                    	    {

                    	    							newCompositeNode(grammarAccess.getPatternAccess().getAgentPatternsAgentPatternParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

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
    // InternalReactionRules.g:2552:1: entryRuleObservation returns [EObject current=null] : iv_ruleObservation= ruleObservation EOF ;
    public final EObject entryRuleObservation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObservation = null;


        try {
            // InternalReactionRules.g:2552:52: (iv_ruleObservation= ruleObservation EOF )
            // InternalReactionRules.g:2553:2: iv_ruleObservation= ruleObservation EOF
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
    // InternalReactionRules.g:2559:1: ruleObservation returns [EObject current=null] : (otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) ) ) ;
    public final EObject ruleObservation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_observationPattern_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2565:2: ( (otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) ) ) )
            // InternalReactionRules.g:2566:2: (otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) ) )
            {
            // InternalReactionRules.g:2566:2: (otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) ) )
            // InternalReactionRules.g:2567:3: otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObservationAccess().getObsKeyword_0());
            		
            // InternalReactionRules.g:2571:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:2572:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:2572:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:2573:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            // InternalReactionRules.g:2589:3: ( (lv_observationPattern_2_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2590:4: (lv_observationPattern_2_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2590:4: (lv_observationPattern_2_0= rulePatternAssignment )
            // InternalReactionRules.g:2591:5: lv_observationPattern_2_0= rulePatternAssignment
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


    // $ANTLR start "entryRuleNumericFromLiteral"
    // InternalReactionRules.g:2612:1: entryRuleNumericFromLiteral returns [EObject current=null] : iv_ruleNumericFromLiteral= ruleNumericFromLiteral EOF ;
    public final EObject entryRuleNumericFromLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericFromLiteral = null;


        try {
            // InternalReactionRules.g:2612:59: (iv_ruleNumericFromLiteral= ruleNumericFromLiteral EOF )
            // InternalReactionRules.g:2613:2: iv_ruleNumericFromLiteral= ruleNumericFromLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumericFromLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericFromLiteral=ruleNumericFromLiteral();

            state._fsp--;

             current =iv_ruleNumericFromLiteral; 
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
    // $ANTLR end "entryRuleNumericFromLiteral"


    // $ANTLR start "ruleNumericFromLiteral"
    // InternalReactionRules.g:2619:1: ruleNumericFromLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleArithmeticValue ) ) ;
    public final EObject ruleNumericFromLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2625:2: ( ( (lv_value_0_0= ruleArithmeticValue ) ) )
            // InternalReactionRules.g:2626:2: ( (lv_value_0_0= ruleArithmeticValue ) )
            {
            // InternalReactionRules.g:2626:2: ( (lv_value_0_0= ruleArithmeticValue ) )
            // InternalReactionRules.g:2627:3: (lv_value_0_0= ruleArithmeticValue )
            {
            // InternalReactionRules.g:2627:3: (lv_value_0_0= ruleArithmeticValue )
            // InternalReactionRules.g:2628:4: lv_value_0_0= ruleArithmeticValue
            {

            				newCompositeNode(grammarAccess.getNumericFromLiteralAccess().getValueArithmeticValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleArithmeticValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumericFromLiteralRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"biochemsimulation.reactionrules.ReactionRules.ArithmeticValue");
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
    // $ANTLR end "ruleNumericFromLiteral"


    // $ANTLR start "entryRuleNumericFromVariable"
    // InternalReactionRules.g:2648:1: entryRuleNumericFromVariable returns [EObject current=null] : iv_ruleNumericFromVariable= ruleNumericFromVariable EOF ;
    public final EObject entryRuleNumericFromVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericFromVariable = null;


        try {
            // InternalReactionRules.g:2648:60: (iv_ruleNumericFromVariable= ruleNumericFromVariable EOF )
            // InternalReactionRules.g:2649:2: iv_ruleNumericFromVariable= ruleNumericFromVariable EOF
            {
             newCompositeNode(grammarAccess.getNumericFromVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericFromVariable=ruleNumericFromVariable();

            state._fsp--;

             current =iv_ruleNumericFromVariable; 
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
    // $ANTLR end "entryRuleNumericFromVariable"


    // $ANTLR start "ruleNumericFromVariable"
    // InternalReactionRules.g:2655:1: ruleNumericFromVariable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNumericFromVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:2661:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalReactionRules.g:2662:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalReactionRules.g:2662:2: ( (otherlv_0= RULE_ID ) )
            // InternalReactionRules.g:2663:3: (otherlv_0= RULE_ID )
            {
            // InternalReactionRules.g:2663:3: (otherlv_0= RULE_ID )
            // InternalReactionRules.g:2664:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumericFromVariableRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getNumericFromVariableAccess().getValueVarArithmeticVariableCrossReference_0());
            			

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
    // $ANTLR end "ruleNumericFromVariable"


    // $ANTLR start "entryRuleNumericAssignment"
    // InternalReactionRules.g:2678:1: entryRuleNumericAssignment returns [EObject current=null] : iv_ruleNumericAssignment= ruleNumericAssignment EOF ;
    public final EObject entryRuleNumericAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericAssignment = null;


        try {
            // InternalReactionRules.g:2678:58: (iv_ruleNumericAssignment= ruleNumericAssignment EOF )
            // InternalReactionRules.g:2679:2: iv_ruleNumericAssignment= ruleNumericAssignment EOF
            {
             newCompositeNode(grammarAccess.getNumericAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericAssignment=ruleNumericAssignment();

            state._fsp--;

             current =iv_ruleNumericAssignment; 
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
    // $ANTLR end "entryRuleNumericAssignment"


    // $ANTLR start "ruleNumericAssignment"
    // InternalReactionRules.g:2685:1: ruleNumericAssignment returns [EObject current=null] : (this_NumericFromLiteral_0= ruleNumericFromLiteral | this_NumericFromVariable_1= ruleNumericFromVariable ) ;
    public final EObject ruleNumericAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_NumericFromLiteral_0 = null;

        EObject this_NumericFromVariable_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2691:2: ( (this_NumericFromLiteral_0= ruleNumericFromLiteral | this_NumericFromVariable_1= ruleNumericFromVariable ) )
            // InternalReactionRules.g:2692:2: (this_NumericFromLiteral_0= ruleNumericFromLiteral | this_NumericFromVariable_1= ruleNumericFromVariable )
            {
            // InternalReactionRules.g:2692:2: (this_NumericFromLiteral_0= ruleNumericFromLiteral | this_NumericFromVariable_1= ruleNumericFromVariable )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT||LA27_0==20) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalReactionRules.g:2693:3: this_NumericFromLiteral_0= ruleNumericFromLiteral
                    {

                    			newCompositeNode(grammarAccess.getNumericAssignmentAccess().getNumericFromLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericFromLiteral_0=ruleNumericFromLiteral();

                    state._fsp--;


                    			current = this_NumericFromLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:2702:3: this_NumericFromVariable_1= ruleNumericFromVariable
                    {

                    			newCompositeNode(grammarAccess.getNumericAssignmentAccess().getNumericFromVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericFromVariable_1=ruleNumericFromVariable();

                    state._fsp--;


                    			current = this_NumericFromVariable_1;
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
    // $ANTLR end "ruleNumericAssignment"


    // $ANTLR start "entryRuleInitial"
    // InternalReactionRules.g:2714:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalReactionRules.g:2714:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalReactionRules.g:2715:2: iv_ruleInitial= ruleInitial EOF
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
    // InternalReactionRules.g:2721:1: ruleInitial returns [EObject current=null] : (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleNumericAssignment ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) ) ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_count_2_0 = null;

        EObject lv_initialPattern_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2727:2: ( (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleNumericAssignment ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) ) ) )
            // InternalReactionRules.g:2728:2: (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleNumericAssignment ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) ) )
            {
            // InternalReactionRules.g:2728:2: (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleNumericAssignment ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) ) )
            // InternalReactionRules.g:2729:3: otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleNumericAssignment ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialAccess().getInitKeyword_0());
            		
            // InternalReactionRules.g:2733:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:2734:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:2734:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:2735:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            // InternalReactionRules.g:2751:3: ( (lv_count_2_0= ruleNumericAssignment ) )
            // InternalReactionRules.g:2752:4: (lv_count_2_0= ruleNumericAssignment )
            {
            // InternalReactionRules.g:2752:4: (lv_count_2_0= ruleNumericAssignment )
            // InternalReactionRules.g:2753:5: lv_count_2_0= ruleNumericAssignment
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getCountNumericAssignmentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
            lv_count_2_0=ruleNumericAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					set(
            						current,
            						"count",
            						lv_count_2_0,
            						"biochemsimulation.reactionrules.ReactionRules.NumericAssignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionRules.g:2770:3: ( (lv_initialPattern_3_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2771:4: (lv_initialPattern_3_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2771:4: (lv_initialPattern_3_0= rulePatternAssignment )
            // InternalReactionRules.g:2772:5: lv_initialPattern_3_0= rulePatternAssignment
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
    // InternalReactionRules.g:2793:1: entryRuleAssignFromPattern returns [EObject current=null] : iv_ruleAssignFromPattern= ruleAssignFromPattern EOF ;
    public final EObject entryRuleAssignFromPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignFromPattern = null;


        try {
            // InternalReactionRules.g:2793:58: (iv_ruleAssignFromPattern= ruleAssignFromPattern EOF )
            // InternalReactionRules.g:2794:2: iv_ruleAssignFromPattern= ruleAssignFromPattern EOF
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
    // InternalReactionRules.g:2800:1: ruleAssignFromPattern returns [EObject current=null] : ( (lv_pattern_0_0= rulePattern ) ) ;
    public final EObject ruleAssignFromPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_pattern_0_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2806:2: ( ( (lv_pattern_0_0= rulePattern ) ) )
            // InternalReactionRules.g:2807:2: ( (lv_pattern_0_0= rulePattern ) )
            {
            // InternalReactionRules.g:2807:2: ( (lv_pattern_0_0= rulePattern ) )
            // InternalReactionRules.g:2808:3: (lv_pattern_0_0= rulePattern )
            {
            // InternalReactionRules.g:2808:3: (lv_pattern_0_0= rulePattern )
            // InternalReactionRules.g:2809:4: lv_pattern_0_0= rulePattern
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
    // InternalReactionRules.g:2829:1: entryRuleAssignFromVariable returns [EObject current=null] : iv_ruleAssignFromVariable= ruleAssignFromVariable EOF ;
    public final EObject entryRuleAssignFromVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignFromVariable = null;


        try {
            // InternalReactionRules.g:2829:59: (iv_ruleAssignFromVariable= ruleAssignFromVariable EOF )
            // InternalReactionRules.g:2830:2: iv_ruleAssignFromVariable= ruleAssignFromVariable EOF
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
    // InternalReactionRules.g:2836:1: ruleAssignFromVariable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleAssignFromVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:2842:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalReactionRules.g:2843:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalReactionRules.g:2843:2: ( (otherlv_0= RULE_ID ) )
            // InternalReactionRules.g:2844:3: (otherlv_0= RULE_ID )
            {
            // InternalReactionRules.g:2844:3: (otherlv_0= RULE_ID )
            // InternalReactionRules.g:2845:4: otherlv_0= RULE_ID
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
    // InternalReactionRules.g:2859:1: entryRulePatternAssignment returns [EObject current=null] : iv_rulePatternAssignment= rulePatternAssignment EOF ;
    public final EObject entryRulePatternAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternAssignment = null;


        try {
            // InternalReactionRules.g:2859:58: (iv_rulePatternAssignment= rulePatternAssignment EOF )
            // InternalReactionRules.g:2860:2: iv_rulePatternAssignment= rulePatternAssignment EOF
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
    // InternalReactionRules.g:2866:1: rulePatternAssignment returns [EObject current=null] : (this_AssignFromPattern_0= ruleAssignFromPattern | this_AssignFromVariable_1= ruleAssignFromVariable ) ;
    public final EObject rulePatternAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_AssignFromPattern_0 = null;

        EObject this_AssignFromVariable_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2872:2: ( (this_AssignFromPattern_0= ruleAssignFromPattern | this_AssignFromVariable_1= ruleAssignFromVariable ) )
            // InternalReactionRules.g:2873:2: (this_AssignFromPattern_0= ruleAssignFromPattern | this_AssignFromVariable_1= ruleAssignFromVariable )
            {
            // InternalReactionRules.g:2873:2: (this_AssignFromPattern_0= ruleAssignFromPattern | this_AssignFromVariable_1= ruleAssignFromVariable )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalReactionRules.g:2874:3: this_AssignFromPattern_0= ruleAssignFromPattern
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
                    // InternalReactionRules.g:2883:3: this_AssignFromVariable_1= ruleAssignFromVariable
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
    // InternalReactionRules.g:2895:1: entryRuleRuleVariables returns [EObject current=null] : iv_ruleRuleVariables= ruleRuleVariables EOF ;
    public final EObject entryRuleRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleVariables = null;


        try {
            // InternalReactionRules.g:2895:54: (iv_ruleRuleVariables= ruleRuleVariables EOF )
            // InternalReactionRules.g:2896:2: iv_ruleRuleVariables= ruleRuleVariables EOF
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
    // InternalReactionRules.g:2902:1: ruleRuleVariables returns [EObject current=null] : ( ( (lv_variables_0_0= ruleNumericAssignment ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleNumericAssignment ) ) )* ) ;
    public final EObject ruleRuleVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variables_0_0 = null;

        EObject lv_variables_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2908:2: ( ( ( (lv_variables_0_0= ruleNumericAssignment ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleNumericAssignment ) ) )* ) )
            // InternalReactionRules.g:2909:2: ( ( (lv_variables_0_0= ruleNumericAssignment ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleNumericAssignment ) ) )* )
            {
            // InternalReactionRules.g:2909:2: ( ( (lv_variables_0_0= ruleNumericAssignment ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleNumericAssignment ) ) )* )
            // InternalReactionRules.g:2910:3: ( (lv_variables_0_0= ruleNumericAssignment ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleNumericAssignment ) ) )*
            {
            // InternalReactionRules.g:2910:3: ( (lv_variables_0_0= ruleNumericAssignment ) )
            // InternalReactionRules.g:2911:4: (lv_variables_0_0= ruleNumericAssignment )
            {
            // InternalReactionRules.g:2911:4: (lv_variables_0_0= ruleNumericAssignment )
            // InternalReactionRules.g:2912:5: lv_variables_0_0= ruleNumericAssignment
            {

            					newCompositeNode(grammarAccess.getRuleVariablesAccess().getVariablesNumericAssignmentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_variables_0_0=ruleNumericAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleVariablesRule());
            					}
            					add(
            						current,
            						"variables",
            						lv_variables_0_0,
            						"biochemsimulation.reactionrules.ReactionRules.NumericAssignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionRules.g:2929:3: (otherlv_1= ',' ( (lv_variables_2_0= ruleNumericAssignment ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==24) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalReactionRules.g:2930:4: otherlv_1= ',' ( (lv_variables_2_0= ruleNumericAssignment ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_30); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRuleVariablesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalReactionRules.g:2934:4: ( (lv_variables_2_0= ruleNumericAssignment ) )
            	    // InternalReactionRules.g:2935:5: (lv_variables_2_0= ruleNumericAssignment )
            	    {
            	    // InternalReactionRules.g:2935:5: (lv_variables_2_0= ruleNumericAssignment )
            	    // InternalReactionRules.g:2936:6: lv_variables_2_0= ruleNumericAssignment
            	    {

            	    						newCompositeNode(grammarAccess.getRuleVariablesAccess().getVariablesNumericAssignmentParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_variables_2_0=ruleNumericAssignment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleVariablesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_2_0,
            	    							"biochemsimulation.reactionrules.ReactionRules.NumericAssignment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalReactionRules.g:2958:1: entryRuleUnidirectionalRule returns [EObject current=null] : iv_ruleUnidirectionalRule= ruleUnidirectionalRule EOF ;
    public final EObject entryRuleUnidirectionalRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnidirectionalRule = null;


        try {
            // InternalReactionRules.g:2958:59: (iv_ruleUnidirectionalRule= ruleUnidirectionalRule EOF )
            // InternalReactionRules.g:2959:2: iv_ruleUnidirectionalRule= ruleUnidirectionalRule EOF
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
    // InternalReactionRules.g:2965:1: ruleUnidirectionalRule returns [EObject current=null] : ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' ) ;
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
            // InternalReactionRules.g:2971:2: ( ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' ) )
            // InternalReactionRules.g:2972:2: ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' )
            {
            // InternalReactionRules.g:2972:2: ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' )
            // InternalReactionRules.g:2973:3: ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']'
            {
            // InternalReactionRules.g:2973:3: ( (lv_lhs_0_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2974:4: (lv_lhs_0_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2974:4: (lv_lhs_0_0= rulePatternAssignment )
            // InternalReactionRules.g:2975:5: lv_lhs_0_0= rulePatternAssignment
            {

            					newCompositeNode(grammarAccess.getUnidirectionalRuleAccess().getLhsPatternAssignmentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalReactionRules.g:2992:3: ( (lv_operator_1_0= RULE_UNI ) )
            // InternalReactionRules.g:2993:4: (lv_operator_1_0= RULE_UNI )
            {
            // InternalReactionRules.g:2993:4: (lv_operator_1_0= RULE_UNI )
            // InternalReactionRules.g:2994:5: lv_operator_1_0= RULE_UNI
            {
            lv_operator_1_0=(Token)match(input,RULE_UNI,FOLLOW_29); 

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

            // InternalReactionRules.g:3010:3: ( (lv_rhs_2_0= rulePatternAssignment ) )
            // InternalReactionRules.g:3011:4: (lv_rhs_2_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:3011:4: (lv_rhs_2_0= rulePatternAssignment )
            // InternalReactionRules.g:3012:5: lv_rhs_2_0= rulePatternAssignment
            {

            					newCompositeNode(grammarAccess.getUnidirectionalRuleAccess().getRhsPatternAssignmentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
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

            this_AT_3=(Token)match(input,RULE_AT,FOLLOW_33); 

            			newLeafNode(this_AT_3, grammarAccess.getUnidirectionalRuleAccess().getATTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_4, grammarAccess.getUnidirectionalRuleAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalReactionRules.g:3037:3: ( (lv_variables_5_0= ruleRuleVariables ) )
            // InternalReactionRules.g:3038:4: (lv_variables_5_0= ruleRuleVariables )
            {
            // InternalReactionRules.g:3038:4: (lv_variables_5_0= ruleRuleVariables )
            // InternalReactionRules.g:3039:5: lv_variables_5_0= ruleRuleVariables
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
    // InternalReactionRules.g:3064:1: entryRuleBidirectionalRule returns [EObject current=null] : iv_ruleBidirectionalRule= ruleBidirectionalRule EOF ;
    public final EObject entryRuleBidirectionalRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBidirectionalRule = null;


        try {
            // InternalReactionRules.g:3064:58: (iv_ruleBidirectionalRule= ruleBidirectionalRule EOF )
            // InternalReactionRules.g:3065:2: iv_ruleBidirectionalRule= ruleBidirectionalRule EOF
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
    // InternalReactionRules.g:3071:1: ruleBidirectionalRule returns [EObject current=null] : ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' ) ;
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
            // InternalReactionRules.g:3077:2: ( ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' ) )
            // InternalReactionRules.g:3078:2: ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' )
            {
            // InternalReactionRules.g:3078:2: ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' )
            // InternalReactionRules.g:3079:3: ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']'
            {
            // InternalReactionRules.g:3079:3: ( (lv_lhs_0_0= rulePatternAssignment ) )
            // InternalReactionRules.g:3080:4: (lv_lhs_0_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:3080:4: (lv_lhs_0_0= rulePatternAssignment )
            // InternalReactionRules.g:3081:5: lv_lhs_0_0= rulePatternAssignment
            {

            					newCompositeNode(grammarAccess.getBidirectionalRuleAccess().getLhsPatternAssignmentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalReactionRules.g:3098:3: ( (lv_operator_1_0= RULE_BI ) )
            // InternalReactionRules.g:3099:4: (lv_operator_1_0= RULE_BI )
            {
            // InternalReactionRules.g:3099:4: (lv_operator_1_0= RULE_BI )
            // InternalReactionRules.g:3100:5: lv_operator_1_0= RULE_BI
            {
            lv_operator_1_0=(Token)match(input,RULE_BI,FOLLOW_29); 

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

            // InternalReactionRules.g:3116:3: ( (lv_rhs_2_0= rulePatternAssignment ) )
            // InternalReactionRules.g:3117:4: (lv_rhs_2_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:3117:4: (lv_rhs_2_0= rulePatternAssignment )
            // InternalReactionRules.g:3118:5: lv_rhs_2_0= rulePatternAssignment
            {

            					newCompositeNode(grammarAccess.getBidirectionalRuleAccess().getRhsPatternAssignmentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
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

            this_AT_3=(Token)match(input,RULE_AT,FOLLOW_33); 

            			newLeafNode(this_AT_3, grammarAccess.getBidirectionalRuleAccess().getATTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_4, grammarAccess.getBidirectionalRuleAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalReactionRules.g:3143:3: ( (lv_variables_5_0= ruleRuleVariables ) )
            // InternalReactionRules.g:3144:4: (lv_variables_5_0= ruleRuleVariables )
            {
            // InternalReactionRules.g:3144:4: (lv_variables_5_0= ruleRuleVariables )
            // InternalReactionRules.g:3145:5: lv_variables_5_0= ruleRuleVariables
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
    // InternalReactionRules.g:3170:1: entryRuleRuleBody returns [EObject current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final EObject entryRuleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBody = null;


        try {
            // InternalReactionRules.g:3170:49: (iv_ruleRuleBody= ruleRuleBody EOF )
            // InternalReactionRules.g:3171:2: iv_ruleRuleBody= ruleRuleBody EOF
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
    // InternalReactionRules.g:3177:1: ruleRuleBody returns [EObject current=null] : (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule ) ;
    public final EObject ruleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject this_UnidirectionalRule_0 = null;

        EObject this_BidirectionalRule_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:3183:2: ( (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule ) )
            // InternalReactionRules.g:3184:2: (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule )
            {
            // InternalReactionRules.g:3184:2: (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule )
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalReactionRules.g:3185:3: this_UnidirectionalRule_0= ruleUnidirectionalRule
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
                    // InternalReactionRules.g:3194:3: this_BidirectionalRule_1= ruleBidirectionalRule
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
    // InternalReactionRules.g:3206:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalReactionRules.g:3206:45: (iv_ruleRule= ruleRule EOF )
            // InternalReactionRules.g:3207:2: iv_ruleRule= ruleRule EOF
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
    // InternalReactionRules.g:3213:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:3219:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) ) ) )
            // InternalReactionRules.g:3220:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) ) )
            {
            // InternalReactionRules.g:3220:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) ) )
            // InternalReactionRules.g:3221:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalReactionRules.g:3225:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:3226:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:3226:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:3227:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            // InternalReactionRules.g:3243:3: ( (lv_rule_2_0= ruleRuleBody ) )
            // InternalReactionRules.g:3244:4: (lv_rule_2_0= ruleRuleBody )
            {
            // InternalReactionRules.g:3244:4: (lv_rule_2_0= ruleRuleBody )
            // InternalReactionRules.g:3245:5: lv_rule_2_0= ruleRuleBody
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


    // $ANTLR start "entryRuleIterations"
    // InternalReactionRules.g:3266:1: entryRuleIterations returns [EObject current=null] : iv_ruleIterations= ruleIterations EOF ;
    public final EObject entryRuleIterations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterations = null;


        try {
            // InternalReactionRules.g:3266:51: (iv_ruleIterations= ruleIterations EOF )
            // InternalReactionRules.g:3267:2: iv_ruleIterations= ruleIterations EOF
            {
             newCompositeNode(grammarAccess.getIterationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIterations=ruleIterations();

            state._fsp--;

             current =iv_ruleIterations; 
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
    // $ANTLR end "entryRuleIterations"


    // $ANTLR start "ruleIterations"
    // InternalReactionRules.g:3273:1: ruleIterations returns [EObject current=null] : (otherlv_0= 'iterations' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) ) ) ;
    public final EObject ruleIterations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:3279:2: ( (otherlv_0= 'iterations' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) ) ) )
            // InternalReactionRules.g:3280:2: (otherlv_0= 'iterations' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) ) )
            {
            // InternalReactionRules.g:3280:2: (otherlv_0= 'iterations' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) ) )
            // InternalReactionRules.g:3281:3: otherlv_0= 'iterations' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getIterationsAccess().getIterationsKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getIterationsAccess().getEqualsSignKeyword_1());
            		
            // InternalReactionRules.g:3289:3: ( (lv_value_2_0= ruleUnsignedInteger ) )
            // InternalReactionRules.g:3290:4: (lv_value_2_0= ruleUnsignedInteger )
            {
            // InternalReactionRules.g:3290:4: (lv_value_2_0= ruleUnsignedInteger )
            // InternalReactionRules.g:3291:5: lv_value_2_0= ruleUnsignedInteger
            {

            					newCompositeNode(grammarAccess.getIterationsAccess().getValueUnsignedIntegerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleUnsignedInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIterationsRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
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
    // $ANTLR end "ruleIterations"


    // $ANTLR start "entryRuleTime"
    // InternalReactionRules.g:3312:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalReactionRules.g:3312:45: (iv_ruleTime= ruleTime EOF )
            // InternalReactionRules.g:3313:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalReactionRules.g:3319:1: ruleTime returns [EObject current=null] : (otherlv_0= 'time' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:3325:2: ( (otherlv_0= 'time' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) ) ) )
            // InternalReactionRules.g:3326:2: (otherlv_0= 'time' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) ) )
            {
            // InternalReactionRules.g:3326:2: (otherlv_0= 'time' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) ) )
            // InternalReactionRules.g:3327:3: otherlv_0= 'time' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeAccess().getTimeKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getEqualsSignKeyword_1());
            		
            // InternalReactionRules.g:3335:3: ( (lv_value_2_0= ruleUnsignedInteger ) )
            // InternalReactionRules.g:3336:4: (lv_value_2_0= ruleUnsignedInteger )
            {
            // InternalReactionRules.g:3336:4: (lv_value_2_0= ruleUnsignedInteger )
            // InternalReactionRules.g:3337:5: lv_value_2_0= ruleUnsignedInteger
            {

            					newCompositeNode(grammarAccess.getTimeAccess().getValueUnsignedIntegerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleUnsignedInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
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
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRulePopulation"
    // InternalReactionRules.g:3358:1: entryRulePopulation returns [EObject current=null] : iv_rulePopulation= rulePopulation EOF ;
    public final EObject entryRulePopulation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePopulation = null;


        try {
            // InternalReactionRules.g:3358:51: (iv_rulePopulation= rulePopulation EOF )
            // InternalReactionRules.g:3359:2: iv_rulePopulation= rulePopulation EOF
            {
             newCompositeNode(grammarAccess.getPopulationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePopulation=rulePopulation();

            state._fsp--;

             current =iv_rulePopulation; 
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
    // $ANTLR end "entryRulePopulation"


    // $ANTLR start "rulePopulation"
    // InternalReactionRules.g:3365:1: rulePopulation returns [EObject current=null] : (otherlv_0= '|' ( (lv_pa_1_0= rulePatternAssignment ) ) otherlv_2= '|' otherlv_3= '==>' ( (lv_value_4_0= ruleUnsignedInteger ) ) ) ;
    public final EObject rulePopulation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_pa_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:3371:2: ( (otherlv_0= '|' ( (lv_pa_1_0= rulePatternAssignment ) ) otherlv_2= '|' otherlv_3= '==>' ( (lv_value_4_0= ruleUnsignedInteger ) ) ) )
            // InternalReactionRules.g:3372:2: (otherlv_0= '|' ( (lv_pa_1_0= rulePatternAssignment ) ) otherlv_2= '|' otherlv_3= '==>' ( (lv_value_4_0= ruleUnsignedInteger ) ) )
            {
            // InternalReactionRules.g:3372:2: (otherlv_0= '|' ( (lv_pa_1_0= rulePatternAssignment ) ) otherlv_2= '|' otherlv_3= '==>' ( (lv_value_4_0= ruleUnsignedInteger ) ) )
            // InternalReactionRules.g:3373:3: otherlv_0= '|' ( (lv_pa_1_0= rulePatternAssignment ) ) otherlv_2= '|' otherlv_3= '==>' ( (lv_value_4_0= ruleUnsignedInteger ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getPopulationAccess().getVerticalLineKeyword_0());
            		
            // InternalReactionRules.g:3377:3: ( (lv_pa_1_0= rulePatternAssignment ) )
            // InternalReactionRules.g:3378:4: (lv_pa_1_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:3378:4: (lv_pa_1_0= rulePatternAssignment )
            // InternalReactionRules.g:3379:5: lv_pa_1_0= rulePatternAssignment
            {

            					newCompositeNode(grammarAccess.getPopulationAccess().getPaPatternAssignmentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_pa_1_0=rulePatternAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPopulationRule());
            					}
            					set(
            						current,
            						"pa",
            						lv_pa_1_0,
            						"biochemsimulation.reactionrules.ReactionRules.PatternAssignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getPopulationAccess().getVerticalLineKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPopulationAccess().getEqualsSignEqualsSignGreaterThanSignKeyword_3());
            		
            // InternalReactionRules.g:3404:3: ( (lv_value_4_0= ruleUnsignedInteger ) )
            // InternalReactionRules.g:3405:4: (lv_value_4_0= ruleUnsignedInteger )
            {
            // InternalReactionRules.g:3405:4: (lv_value_4_0= ruleUnsignedInteger )
            // InternalReactionRules.g:3406:5: lv_value_4_0= ruleUnsignedInteger
            {

            					newCompositeNode(grammarAccess.getPopulationAccess().getValueUnsignedIntegerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleUnsignedInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPopulationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
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
    // $ANTLR end "rulePopulation"


    // $ANTLR start "entryRuleTerminationCondition"
    // InternalReactionRules.g:3427:1: entryRuleTerminationCondition returns [EObject current=null] : iv_ruleTerminationCondition= ruleTerminationCondition EOF ;
    public final EObject entryRuleTerminationCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminationCondition = null;


        try {
            // InternalReactionRules.g:3427:61: (iv_ruleTerminationCondition= ruleTerminationCondition EOF )
            // InternalReactionRules.g:3428:2: iv_ruleTerminationCondition= ruleTerminationCondition EOF
            {
             newCompositeNode(grammarAccess.getTerminationConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminationCondition=ruleTerminationCondition();

            state._fsp--;

             current =iv_ruleTerminationCondition; 
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
    // $ANTLR end "entryRuleTerminationCondition"


    // $ANTLR start "ruleTerminationCondition"
    // InternalReactionRules.g:3434:1: ruleTerminationCondition returns [EObject current=null] : (this_Iterations_0= ruleIterations | this_Time_1= ruleTime | this_Population_2= rulePopulation ) ;
    public final EObject ruleTerminationCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Iterations_0 = null;

        EObject this_Time_1 = null;

        EObject this_Population_2 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:3440:2: ( (this_Iterations_0= ruleIterations | this_Time_1= ruleTime | this_Population_2= rulePopulation ) )
            // InternalReactionRules.g:3441:2: (this_Iterations_0= ruleIterations | this_Time_1= ruleTime | this_Population_2= rulePopulation )
            {
            // InternalReactionRules.g:3441:2: (this_Iterations_0= ruleIterations | this_Time_1= ruleTime | this_Population_2= rulePopulation )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt31=1;
                }
                break;
            case 39:
                {
                alt31=2;
                }
                break;
            case 40:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalReactionRules.g:3442:3: this_Iterations_0= ruleIterations
                    {

                    			newCompositeNode(grammarAccess.getTerminationConditionAccess().getIterationsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Iterations_0=ruleIterations();

                    state._fsp--;


                    			current = this_Iterations_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:3451:3: this_Time_1= ruleTime
                    {

                    			newCompositeNode(grammarAccess.getTerminationConditionAccess().getTimeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Time_1=ruleTime();

                    state._fsp--;


                    			current = this_Time_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalReactionRules.g:3460:3: this_Population_2= rulePopulation
                    {

                    			newCompositeNode(grammarAccess.getTerminationConditionAccess().getPopulationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Population_2=rulePopulation();

                    state._fsp--;


                    			current = this_Population_2;
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
    // $ANTLR end "ruleTerminationCondition"


    // $ANTLR start "entryRuleTerminate"
    // InternalReactionRules.g:3472:1: entryRuleTerminate returns [EObject current=null] : iv_ruleTerminate= ruleTerminate EOF ;
    public final EObject entryRuleTerminate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminate = null;


        try {
            // InternalReactionRules.g:3472:50: (iv_ruleTerminate= ruleTerminate EOF )
            // InternalReactionRules.g:3473:2: iv_ruleTerminate= ruleTerminate EOF
            {
             newCompositeNode(grammarAccess.getTerminateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminate=ruleTerminate();

            state._fsp--;

             current =iv_ruleTerminate; 
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
    // $ANTLR end "entryRuleTerminate"


    // $ANTLR start "ruleTerminate"
    // InternalReactionRules.g:3479:1: ruleTerminate returns [EObject current=null] : (otherlv_0= 'terminate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= ruleTerminationCondition ) ) ) ;
    public final EObject ruleTerminate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:3485:2: ( (otherlv_0= 'terminate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= ruleTerminationCondition ) ) ) )
            // InternalReactionRules.g:3486:2: (otherlv_0= 'terminate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= ruleTerminationCondition ) ) )
            {
            // InternalReactionRules.g:3486:2: (otherlv_0= 'terminate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= ruleTerminationCondition ) ) )
            // InternalReactionRules.g:3487:3: otherlv_0= 'terminate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= ruleTerminationCondition ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTerminateAccess().getTerminateKeyword_0());
            		
            // InternalReactionRules.g:3491:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:3492:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:3492:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:3493:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTerminateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerminateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReactionRules.g:3509:3: ( (lv_condition_2_0= ruleTerminationCondition ) )
            // InternalReactionRules.g:3510:4: (lv_condition_2_0= ruleTerminationCondition )
            {
            // InternalReactionRules.g:3510:4: (lv_condition_2_0= ruleTerminationCondition )
            // InternalReactionRules.g:3511:5: lv_condition_2_0= ruleTerminationCondition
            {

            					newCompositeNode(grammarAccess.getTerminateAccess().getConditionTerminationConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_2_0=ruleTerminationCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerminateRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"biochemsimulation.reactionrules.ReactionRules.TerminationCondition");
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
    // $ANTLR end "ruleTerminate"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\4\1\6\3\uffff\1\10\2\uffff";
    static final String dfa_3s = "\2\5\2\4\1\uffff\1\5\1\uffff\1\4\2\uffff";
    static final String dfa_4s = "\1\24\1\5\2\52\1\uffff\1\5\1\uffff\1\52\2\uffff";
    static final String dfa_5s = "\4\uffff\1\2\1\uffff\1\3\1\uffff\1\1\1\4";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\16\uffff\1\1",
            "\1\3",
            "\1\4\20\uffff\1\5\1\uffff\2\4\4\uffff\2\4\2\uffff\1\4\1\uffff\3\4\4\uffff\1\4",
            "\1\6\20\uffff\1\5\1\uffff\2\6\4\uffff\2\6\2\uffff\1\6\1\uffff\3\6\4\uffff\1\6",
            "",
            "\1\7",
            "",
            "\1\10\1\uffff\1\11\20\uffff\2\10\4\uffff\2\10\2\uffff\1\10\1\uffff\3\10\4\uffff\1\10",
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

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "456:2: (this_Float_0= ruleFloat | this_UnsignedInteger_1= ruleUnsignedInteger | this_SignedInteger_2= ruleSignedInteger | this_ScientificFloat_3= ruleScientificFloat )";
        }
    }
    static final String dfa_8s = "\1\4\1\uffff\1\33\3\uffff\1\4\3\uffff";
    static final String dfa_9s = "\1\11\1\uffff\1\41\3\uffff\1\5\3\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\uffff\1\5\1\6\1\7\1\uffff\1\2\1\4\1\3";
    static final String[] dfa_11s = {
            "\1\3\1\4\1\uffff\1\1\1\2\1\5",
            "",
            "\1\6\5\uffff\1\7",
            "",
            "",
            "",
            "\1\10\1\11",
            "",
            "",
            ""
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_6;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "1799:5: (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyOfTypeLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleWhatEver )";
        }
    }
    static final String dfa_12s = "\17\uffff";
    static final String dfa_13s = "\1\5\1\uffff\1\33\1\uffff\1\30\1\uffff\1\4\2\uffff\2\34\2\30\2\uffff";
    static final String dfa_14s = "\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\1\5\2\uffff\2\34\2\41\2\uffff";
    static final String dfa_15s = "\1\uffff\1\1\1\uffff\1\5\1\uffff\1\7\1\uffff\1\2\1\6\4\uffff\1\4\1\3";
    static final String dfa_16s = "\17\uffff}>";
    static final String[] dfa_17s = {
            "\1\4\1\uffff\1\3\1\2\1\1\27\uffff\1\5",
            "",
            "\1\6\5\uffff\1\7",
            "",
            "\1\5\10\uffff\1\10",
            "",
            "\1\11\1\12",
            "",
            "",
            "\1\13",
            "\1\14",
            "\1\5\10\uffff\1\15",
            "\1\5\10\uffff\1\16",
            "",
            ""
    };

    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_12;
            this.eof = dfa_12;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_16;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "1950:5: (lv_linkState_2_1= ruleWhatEver | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleIndexedFreeLink | lv_linkState_2_4= ruleTypedFreeLink | lv_linkState_2_5= ruleBoundAnyLink | lv_linkState_2_6= ruleBoundLink | lv_linkState_2_7= ruleMultiLink )";
        }
    }
    static final String dfa_18s = "\u00a5\uffff";
    static final String dfa_19s = "\2\4\1\13\1\33\1\30\1\13\2\uffff\2\4\1\27\1\30\1\33\1\30\2\4\1\5\1\4\1\31\1\41\1\33\1\25\3\41\1\33\1\41\2\30\1\27\1\30\1\40\1\30\3\4\1\5\3\4\1\5\2\34\1\41\2\34\1\30\1\33\1\27\1\31\1\41\1\33\1\25\3\41\1\33\1\41\2\30\2\41\2\30\3\4\1\5\1\40\1\30\3\4\1\5\1\4\2\34\1\31\1\41\1\33\1\25\3\41\1\33\1\41\2\30\2\34\1\41\2\34\1\30\1\33\1\27\2\30\1\40\1\30\3\4\1\5\2\41\2\30\3\4\1\5\2\34\1\41\2\34\1\30\1\33\2\34\1\31\1\41\1\33\1\25\3\41\1\33\1\41\2\30\2\41\2\30\1\4\2\30\1\40\1\30\3\4\1\5\4\34\1\41\2\34\1\30\1\33\2\30\2\41\2\30\1\4\2\34\2\30";
    static final String dfa_20s = "\1\27\1\31\1\15\1\33\1\31\1\15\2\uffff\1\34\1\12\1\42\1\31\1\33\1\31\1\4\1\11\1\41\1\34\1\31\2\41\1\25\6\41\1\34\1\42\1\31\1\42\1\34\1\5\1\4\1\5\1\10\2\4\1\11\1\41\2\34\1\41\2\34\1\41\1\33\1\42\1\31\2\41\1\25\6\41\1\34\4\41\1\5\1\4\1\11\1\41\1\42\1\34\1\5\1\4\1\5\1\10\1\4\2\34\1\31\2\41\1\25\6\41\3\34\1\41\2\34\1\41\1\33\1\42\2\41\1\42\1\34\1\5\1\4\1\5\1\10\4\41\1\5\1\4\1\11\1\41\2\34\1\41\2\34\1\41\1\33\2\34\1\31\2\41\1\25\6\41\1\34\4\41\1\5\2\41\1\42\1\34\1\5\1\4\1\5\1\10\4\34\1\41\2\34\1\41\1\33\6\41\1\5\2\34\2\41";
    static final String dfa_21s = "\6\uffff\1\1\1\2\u009d\uffff";
    static final String dfa_22s = "\u00a5\uffff}>";
    static final String[] dfa_23s = {
            "\1\2\22\uffff\1\1",
            "\1\3\5\uffff\1\4\16\uffff\1\5",
            "\1\6\1\uffff\1\7",
            "\1\10",
            "\1\11\1\5",
            "\1\6\1\uffff\1\7",
            "",
            "",
            "\1\12\27\uffff\1\13",
            "\1\14\5\uffff\1\15",
            "\1\16\10\uffff\1\17\1\uffff\1\20",
            "\1\11\1\5",
            "\1\21",
            "\1\11\1\5",
            "\1\22",
            "\1\25\1\26\1\uffff\1\23\1\24\1\27",
            "\1\33\1\uffff\1\32\1\31\1\30\27\uffff\1\34",
            "\1\35\27\uffff\1\36",
            "\1\37",
            "\1\40",
            "\1\41\5\uffff\1\40",
            "\1\42",
            "\1\40",
            "\1\40",
            "\1\34",
            "\1\43\5\uffff\1\34",
            "\1\34",
            "\1\44\10\uffff\1\34",
            "\1\45\3\uffff\1\13",
            "\1\46\10\uffff\1\47\1\uffff\1\50",
            "\1\11\1\5",
            "\1\17\1\uffff\1\20",
            "\1\45\3\uffff\1\13",
            "\1\52\1\51",
            "\1\53",
            "\1\55\1\54",
            "\1\56\2\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\64\1\65\1\uffff\1\62\1\63\1\66",
            "\1\72\1\uffff\1\71\1\70\1\67\27\uffff\1\73",
            "\1\74",
            "\1\75",
            "\1\40",
            "\1\76",
            "\1\77",
            "\1\44\10\uffff\1\34",
            "\1\100",
            "\1\101\10\uffff\1\102\1\uffff\1\103",
            "\1\104",
            "\1\105",
            "\1\106\5\uffff\1\105",
            "\1\107",
            "\1\105",
            "\1\105",
            "\1\73",
            "\1\110\5\uffff\1\73",
            "\1\73",
            "\1\111\10\uffff\1\73",
            "\1\112\3\uffff\1\36",
            "\1\40",
            "\1\40",
            "\1\44\10\uffff\1\34",
            "\1\44\10\uffff\1\34",
            "\1\113\1\114",
            "\1\115",
            "\1\120\1\121\1\uffff\1\116\1\117\1\122",
            "\1\126\1\uffff\1\125\1\124\1\123\27\uffff\1\127",
            "\1\47\1\uffff\1\50",
            "\1\112\3\uffff\1\36",
            "\1\130\1\131",
            "\1\132",
            "\1\134\1\133",
            "\1\135\2\uffff\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144\5\uffff\1\143",
            "\1\145",
            "\1\143",
            "\1\143",
            "\1\127",
            "\1\146\5\uffff\1\127",
            "\1\127",
            "\1\147\10\uffff\1\127",
            "\1\45\3\uffff\1\13",
            "\1\150",
            "\1\151",
            "\1\105",
            "\1\152",
            "\1\153",
            "\1\111\10\uffff\1\73",
            "\1\154",
            "\1\155\10\uffff\1\156\1\uffff\1\157",
            "\1\44\10\uffff\1\34",
            "\1\44\10\uffff\1\34",
            "\1\102\1\uffff\1\103",
            "\1\45\3\uffff\1\13",
            "\1\160\1\161",
            "\1\162",
            "\1\164\1\163",
            "\1\165\2\uffff\1\166",
            "\1\105",
            "\1\105",
            "\1\111\10\uffff\1\73",
            "\1\111\10\uffff\1\73",
            "\1\167\1\170",
            "\1\171",
            "\1\174\1\175\1\uffff\1\172\1\173\1\176",
            "\1\u0082\1\uffff\1\u0081\1\u0080\1\177\27\uffff\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\143",
            "\1\u0086",
            "\1\u0087",
            "\1\147\10\uffff\1\127",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d\5\uffff\1\u008c",
            "\1\u008e",
            "\1\u008c",
            "\1\u008c",
            "\1\u0083",
            "\1\u008f\5\uffff\1\u0083",
            "\1\u0083",
            "\1\u0090\10\uffff\1\u0083",
            "\1\112\3\uffff\1\36",
            "\1\143",
            "\1\143",
            "\1\147\10\uffff\1\127",
            "\1\147\10\uffff\1\127",
            "\1\u0091\1\u0092",
            "\1\111\10\uffff\1\73",
            "\1\111\10\uffff\1\73",
            "\1\156\1\uffff\1\157",
            "\1\112\3\uffff\1\36",
            "\1\u0093\1\u0094",
            "\1\u0095",
            "\1\u0096\1\u0097",
            "\1\u0098\2\uffff\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u008c",
            "\1\u009e",
            "\1\u009f",
            "\1\u0090\10\uffff\1\u0083",
            "\1\u00a0",
            "\1\147\10\uffff\1\127",
            "\1\147\10\uffff\1\127",
            "\1\u008c",
            "\1\u008c",
            "\1\u0090\10\uffff\1\u0083",
            "\1\u0090\10\uffff\1\u0083",
            "\1\u00a1\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u0090\10\uffff\1\u0083",
            "\1\u0090\10\uffff\1\u0083"
    };

    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_18;
            this.eof = dfa_18;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "3184:2: (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000043860000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000000003B0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000002000003B0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000410L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000001C000000000L});

}