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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_EXPONENT", "RULE_BOUND_LINK", "RULE_FREE_LINK", "RULE_WHATEVER_LINK", "RULE_VOID_PATTERN", "RULE_UNI", "RULE_AT", "RULE_BI", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ModelID'", "'-'", "'.'", "'+'", "'{'", "','", "'}'", "'('", "')'", "'agent'", "'var'", "'='", "'['", "']'", "'obs'", "'init'", "'rule'", "'iterations'", "'time'", "'|'", "'==>'", "'terminate'"
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

                if ( ((LA1_0>=28 && LA1_0<=29)||(LA1_0>=33 && LA1_0<=35)||LA1_0==40) ) {
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
            case 28:
                {
                alt2=1;
                }
                break;
            case 29:
                {
                alt2=2;
                }
                break;
            case 33:
                {
                alt2=3;
                }
                break;
            case 34:
                {
                alt2=4;
                }
                break;
            case 35:
                {
                alt2=5;
                }
                break;
            case 40:
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


    // $ANTLR start "entryRuleSite"
    // InternalReactionRules.g:655:1: entryRuleSite returns [EObject current=null] : iv_ruleSite= ruleSite EOF ;
    public final EObject entryRuleSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSite = null;


        try {
            // InternalReactionRules.g:655:45: (iv_ruleSite= ruleSite EOF )
            // InternalReactionRules.g:656:2: iv_ruleSite= ruleSite EOF
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
    // InternalReactionRules.g:662:1: ruleSite returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_states_1_0= ruleStates ) ) ) ;
    public final EObject ruleSite() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_states_1_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:668:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_states_1_0= ruleStates ) ) ) )
            // InternalReactionRules.g:669:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_states_1_0= ruleStates ) ) )
            {
            // InternalReactionRules.g:669:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_states_1_0= ruleStates ) ) )
            // InternalReactionRules.g:670:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_states_1_0= ruleStates ) )
            {
            // InternalReactionRules.g:670:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalReactionRules.g:671:4: (lv_name_0_0= RULE_ID )
            {
            // InternalReactionRules.g:671:4: (lv_name_0_0= RULE_ID )
            // InternalReactionRules.g:672:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalReactionRules.g:688:3: ( (lv_states_1_0= ruleStates ) )
            // InternalReactionRules.g:689:4: (lv_states_1_0= ruleStates )
            {
            // InternalReactionRules.g:689:4: (lv_states_1_0= ruleStates )
            // InternalReactionRules.g:690:5: lv_states_1_0= ruleStates
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
    // InternalReactionRules.g:711:1: entryRuleSites returns [EObject current=null] : iv_ruleSites= ruleSites EOF ;
    public final EObject entryRuleSites() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSites = null;


        try {
            // InternalReactionRules.g:711:46: (iv_ruleSites= ruleSites EOF )
            // InternalReactionRules.g:712:2: iv_ruleSites= ruleSites EOF
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
    // InternalReactionRules.g:718:1: ruleSites returns [EObject current=null] : ( () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleSites() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_sites_2_0 = null;

        EObject lv_sites_4_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:724:2: ( ( () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )? ) )
            // InternalReactionRules.g:725:2: ( () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )? )
            {
            // InternalReactionRules.g:725:2: ( () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )? )
            // InternalReactionRules.g:726:3: () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )?
            {
            // InternalReactionRules.g:726:3: ()
            // InternalReactionRules.g:727:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSitesAccess().getSitesAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:733:3: (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalReactionRules.g:734:4: otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getSitesAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalReactionRules.g:738:4: ( (lv_sites_2_0= ruleSite ) )
                    // InternalReactionRules.g:739:5: (lv_sites_2_0= ruleSite )
                    {
                    // InternalReactionRules.g:739:5: (lv_sites_2_0= ruleSite )
                    // InternalReactionRules.g:740:6: lv_sites_2_0= ruleSite
                    {

                    						newCompositeNode(grammarAccess.getSitesAccess().getSitesSiteParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    // InternalReactionRules.g:757:4: (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==24) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalReactionRules.g:758:5: otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSitesAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalReactionRules.g:762:5: ( (lv_sites_4_0= ruleSite ) )
                    	    // InternalReactionRules.g:763:6: (lv_sites_4_0= ruleSite )
                    	    {
                    	    // InternalReactionRules.g:763:6: (lv_sites_4_0= ruleSite )
                    	    // InternalReactionRules.g:764:7: lv_sites_4_0= ruleSite
                    	    {

                    	    							newCompositeNode(grammarAccess.getSitesAccess().getSitesSiteParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
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
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_2); 

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
    // InternalReactionRules.g:791:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // InternalReactionRules.g:791:46: (iv_ruleAgent= ruleAgent EOF )
            // InternalReactionRules.g:792:2: iv_ruleAgent= ruleAgent EOF
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
    // InternalReactionRules.g:798:1: ruleAgent returns [EObject current=null] : (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) ) ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_sites_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:804:2: ( (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) ) ) )
            // InternalReactionRules.g:805:2: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) ) )
            {
            // InternalReactionRules.g:805:2: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) ) )
            // InternalReactionRules.g:806:3: otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
            		
            // InternalReactionRules.g:810:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:811:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:811:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:812:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            // InternalReactionRules.g:828:3: ( (lv_sites_2_0= ruleSites ) )
            // InternalReactionRules.g:829:4: (lv_sites_2_0= ruleSites )
            {
            // InternalReactionRules.g:829:4: (lv_sites_2_0= ruleSites )
            // InternalReactionRules.g:830:5: lv_sites_2_0= ruleSites
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
    // InternalReactionRules.g:851:1: entryRulePatternVariable returns [EObject current=null] : iv_rulePatternVariable= rulePatternVariable EOF ;
    public final EObject entryRulePatternVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternVariable = null;


        try {
            // InternalReactionRules.g:851:56: (iv_rulePatternVariable= rulePatternVariable EOF )
            // InternalReactionRules.g:852:2: iv_rulePatternVariable= rulePatternVariable EOF
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
    // InternalReactionRules.g:858:1: rulePatternVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_pattern_3_0= rulePattern ) ) ) ;
    public final EObject rulePatternVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_pattern_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:864:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_pattern_3_0= rulePattern ) ) ) )
            // InternalReactionRules.g:865:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_pattern_3_0= rulePattern ) ) )
            {
            // InternalReactionRules.g:865:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_pattern_3_0= rulePattern ) ) )
            // InternalReactionRules.g:866:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_pattern_3_0= rulePattern ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternVariableAccess().getVarKeyword_0());
            		
            // InternalReactionRules.g:870:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:871:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:871:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:872:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getPatternVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalReactionRules.g:892:3: ( (lv_pattern_3_0= rulePattern ) )
            // InternalReactionRules.g:893:4: (lv_pattern_3_0= rulePattern )
            {
            // InternalReactionRules.g:893:4: (lv_pattern_3_0= rulePattern )
            // InternalReactionRules.g:894:5: lv_pattern_3_0= rulePattern
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
    // InternalReactionRules.g:915:1: entryRuleArithmeticVariable returns [EObject current=null] : iv_ruleArithmeticVariable= ruleArithmeticVariable EOF ;
    public final EObject entryRuleArithmeticVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticVariable = null;


        try {
            // InternalReactionRules.g:915:59: (iv_ruleArithmeticVariable= ruleArithmeticVariable EOF )
            // InternalReactionRules.g:916:2: iv_ruleArithmeticVariable= ruleArithmeticVariable EOF
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
    // InternalReactionRules.g:922:1: ruleArithmeticVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticValue ) ) ) ;
    public final EObject ruleArithmeticVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:928:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticValue ) ) ) )
            // InternalReactionRules.g:929:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticValue ) ) )
            {
            // InternalReactionRules.g:929:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticValue ) ) )
            // InternalReactionRules.g:930:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticValue ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getArithmeticVariableAccess().getVarKeyword_0());
            		
            // InternalReactionRules.g:934:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:935:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:935:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:936:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,30,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getArithmeticVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalReactionRules.g:956:3: ( (lv_value_3_0= ruleArithmeticValue ) )
            // InternalReactionRules.g:957:4: (lv_value_3_0= ruleArithmeticValue )
            {
            // InternalReactionRules.g:957:4: (lv_value_3_0= ruleArithmeticValue )
            // InternalReactionRules.g:958:5: lv_value_3_0= ruleArithmeticValue
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
    // InternalReactionRules.g:979:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalReactionRules.g:979:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalReactionRules.g:980:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalReactionRules.g:986:1: ruleVariable returns [EObject current=null] : (this_PatternVariable_0= rulePatternVariable | this_ArithmeticVariable_1= ruleArithmeticVariable ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_PatternVariable_0 = null;

        EObject this_ArithmeticVariable_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:992:2: ( (this_PatternVariable_0= rulePatternVariable | this_ArithmeticVariable_1= ruleArithmeticVariable ) )
            // InternalReactionRules.g:993:2: (this_PatternVariable_0= rulePatternVariable | this_ArithmeticVariable_1= ruleArithmeticVariable )
            {
            // InternalReactionRules.g:993:2: (this_PatternVariable_0= rulePatternVariable | this_ArithmeticVariable_1= ruleArithmeticVariable )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_ID) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==30) ) {
                        int LA11_3 = input.LA(4);

                        if ( (LA11_3==RULE_INT||LA11_3==20) ) {
                            alt11=2;
                        }
                        else if ( (LA11_3==23) ) {
                            alt11=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalReactionRules.g:994:3: this_PatternVariable_0= rulePatternVariable
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
                    // InternalReactionRules.g:1003:3: this_ArithmeticVariable_1= ruleArithmeticVariable
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
    // InternalReactionRules.g:1015:1: entryRuleBoundAnyLink returns [EObject current=null] : iv_ruleBoundAnyLink= ruleBoundAnyLink EOF ;
    public final EObject entryRuleBoundAnyLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundAnyLink = null;


        try {
            // InternalReactionRules.g:1015:53: (iv_ruleBoundAnyLink= ruleBoundAnyLink EOF )
            // InternalReactionRules.g:1016:2: iv_ruleBoundAnyLink= ruleBoundAnyLink EOF
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
    // InternalReactionRules.g:1022:1: ruleBoundAnyLink returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_BOUND_LINK ) ) ) ;
    public final EObject ruleBoundAnyLink() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1028:2: ( ( () ( (lv_name_1_0= RULE_BOUND_LINK ) ) ) )
            // InternalReactionRules.g:1029:2: ( () ( (lv_name_1_0= RULE_BOUND_LINK ) ) )
            {
            // InternalReactionRules.g:1029:2: ( () ( (lv_name_1_0= RULE_BOUND_LINK ) ) )
            // InternalReactionRules.g:1030:3: () ( (lv_name_1_0= RULE_BOUND_LINK ) )
            {
            // InternalReactionRules.g:1030:3: ()
            // InternalReactionRules.g:1031:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoundAnyLinkAccess().getBoundAnyLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1037:3: ( (lv_name_1_0= RULE_BOUND_LINK ) )
            // InternalReactionRules.g:1038:4: (lv_name_1_0= RULE_BOUND_LINK )
            {
            // InternalReactionRules.g:1038:4: (lv_name_1_0= RULE_BOUND_LINK )
            // InternalReactionRules.g:1039:5: lv_name_1_0= RULE_BOUND_LINK
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
    // InternalReactionRules.g:1059:1: entryRuleFreeLink returns [EObject current=null] : iv_ruleFreeLink= ruleFreeLink EOF ;
    public final EObject entryRuleFreeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeLink = null;


        try {
            // InternalReactionRules.g:1059:49: (iv_ruleFreeLink= ruleFreeLink EOF )
            // InternalReactionRules.g:1060:2: iv_ruleFreeLink= ruleFreeLink EOF
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
    // InternalReactionRules.g:1066:1: ruleFreeLink returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) ) ;
    public final EObject ruleFreeLink() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1072:2: ( ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) ) )
            // InternalReactionRules.g:1073:2: ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) )
            {
            // InternalReactionRules.g:1073:2: ( () ( (lv_name_1_0= RULE_FREE_LINK ) ) )
            // InternalReactionRules.g:1074:3: () ( (lv_name_1_0= RULE_FREE_LINK ) )
            {
            // InternalReactionRules.g:1074:3: ()
            // InternalReactionRules.g:1075:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFreeLinkAccess().getFreeLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1081:3: ( (lv_name_1_0= RULE_FREE_LINK ) )
            // InternalReactionRules.g:1082:4: (lv_name_1_0= RULE_FREE_LINK )
            {
            // InternalReactionRules.g:1082:4: (lv_name_1_0= RULE_FREE_LINK )
            // InternalReactionRules.g:1083:5: lv_name_1_0= RULE_FREE_LINK
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
    // InternalReactionRules.g:1103:1: entryRuleWhatEver returns [EObject current=null] : iv_ruleWhatEver= ruleWhatEver EOF ;
    public final EObject entryRuleWhatEver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhatEver = null;


        try {
            // InternalReactionRules.g:1103:49: (iv_ruleWhatEver= ruleWhatEver EOF )
            // InternalReactionRules.g:1104:2: iv_ruleWhatEver= ruleWhatEver EOF
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
    // InternalReactionRules.g:1110:1: ruleWhatEver returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_WHATEVER_LINK ) ) ) ;
    public final EObject ruleWhatEver() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1116:2: ( ( () ( (lv_name_1_0= RULE_WHATEVER_LINK ) ) ) )
            // InternalReactionRules.g:1117:2: ( () ( (lv_name_1_0= RULE_WHATEVER_LINK ) ) )
            {
            // InternalReactionRules.g:1117:2: ( () ( (lv_name_1_0= RULE_WHATEVER_LINK ) ) )
            // InternalReactionRules.g:1118:3: () ( (lv_name_1_0= RULE_WHATEVER_LINK ) )
            {
            // InternalReactionRules.g:1118:3: ()
            // InternalReactionRules.g:1119:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhatEverAccess().getWhatEverAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1125:3: ( (lv_name_1_0= RULE_WHATEVER_LINK ) )
            // InternalReactionRules.g:1126:4: (lv_name_1_0= RULE_WHATEVER_LINK )
            {
            // InternalReactionRules.g:1126:4: (lv_name_1_0= RULE_WHATEVER_LINK )
            // InternalReactionRules.g:1127:5: lv_name_1_0= RULE_WHATEVER_LINK
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
    // InternalReactionRules.g:1147:1: entryRuleBoundLink returns [EObject current=null] : iv_ruleBoundLink= ruleBoundLink EOF ;
    public final EObject entryRuleBoundLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundLink = null;


        try {
            // InternalReactionRules.g:1147:50: (iv_ruleBoundLink= ruleBoundLink EOF )
            // InternalReactionRules.g:1148:2: iv_ruleBoundLink= ruleBoundLink EOF
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
    // InternalReactionRules.g:1154:1: ruleBoundLink returns [EObject current=null] : ( () ( (lv_state_1_0= ruleUnsignedInteger ) ) ) ;
    public final EObject ruleBoundLink() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_state_1_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1160:2: ( ( () ( (lv_state_1_0= ruleUnsignedInteger ) ) ) )
            // InternalReactionRules.g:1161:2: ( () ( (lv_state_1_0= ruleUnsignedInteger ) ) )
            {
            // InternalReactionRules.g:1161:2: ( () ( (lv_state_1_0= ruleUnsignedInteger ) ) )
            // InternalReactionRules.g:1162:3: () ( (lv_state_1_0= ruleUnsignedInteger ) )
            {
            // InternalReactionRules.g:1162:3: ()
            // InternalReactionRules.g:1163:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoundLinkAccess().getBoundLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1169:3: ( (lv_state_1_0= ruleUnsignedInteger ) )
            // InternalReactionRules.g:1170:4: (lv_state_1_0= ruleUnsignedInteger )
            {
            // InternalReactionRules.g:1170:4: (lv_state_1_0= ruleUnsignedInteger )
            // InternalReactionRules.g:1171:5: lv_state_1_0= ruleUnsignedInteger
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


    // $ANTLR start "entryRuleBoundAnyOfTypeLinkAgent"
    // InternalReactionRules.g:1192:1: entryRuleBoundAnyOfTypeLinkAgent returns [EObject current=null] : iv_ruleBoundAnyOfTypeLinkAgent= ruleBoundAnyOfTypeLinkAgent EOF ;
    public final EObject entryRuleBoundAnyOfTypeLinkAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundAnyOfTypeLinkAgent = null;


        try {
            // InternalReactionRules.g:1192:64: (iv_ruleBoundAnyOfTypeLinkAgent= ruleBoundAnyOfTypeLinkAgent EOF )
            // InternalReactionRules.g:1193:2: iv_ruleBoundAnyOfTypeLinkAgent= ruleBoundAnyOfTypeLinkAgent EOF
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
    // InternalReactionRules.g:1199:1: ruleBoundAnyOfTypeLinkAgent returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleBoundAnyOfTypeLinkAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1205:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalReactionRules.g:1206:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalReactionRules.g:1206:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalReactionRules.g:1207:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalReactionRules.g:1207:3: ()
            // InternalReactionRules.g:1208:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoundAnyOfTypeLinkAgentAccess().getBoundAnyOfTypeLinkAgentAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1214:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:1215:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:1215:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:1216:5: otherlv_1= RULE_ID
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
    // InternalReactionRules.g:1231:1: entryRuleBoundAnyOfTypeLinkSite returns [EObject current=null] : iv_ruleBoundAnyOfTypeLinkSite= ruleBoundAnyOfTypeLinkSite EOF ;
    public final EObject entryRuleBoundAnyOfTypeLinkSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundAnyOfTypeLinkSite = null;


        try {
            // InternalReactionRules.g:1231:63: (iv_ruleBoundAnyOfTypeLinkSite= ruleBoundAnyOfTypeLinkSite EOF )
            // InternalReactionRules.g:1232:2: iv_ruleBoundAnyOfTypeLinkSite= ruleBoundAnyOfTypeLinkSite EOF
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
    // InternalReactionRules.g:1238:1: ruleBoundAnyOfTypeLinkSite returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleBoundAnyOfTypeLinkSite() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1244:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalReactionRules.g:1245:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalReactionRules.g:1245:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalReactionRules.g:1246:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalReactionRules.g:1246:3: ()
            // InternalReactionRules.g:1247:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoundAnyOfTypeLinkSiteAccess().getBoundAnyOfTypeLinkSiteAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1253:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:1254:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:1254:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:1255:5: otherlv_1= RULE_ID
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
    // InternalReactionRules.g:1270:1: entryRuleBoundAnyOfTypeLink returns [EObject current=null] : iv_ruleBoundAnyOfTypeLink= ruleBoundAnyOfTypeLink EOF ;
    public final EObject entryRuleBoundAnyOfTypeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundAnyOfTypeLink = null;


        try {
            // InternalReactionRules.g:1270:59: (iv_ruleBoundAnyOfTypeLink= ruleBoundAnyOfTypeLink EOF )
            // InternalReactionRules.g:1271:2: iv_ruleBoundAnyOfTypeLink= ruleBoundAnyOfTypeLink EOF
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
    // InternalReactionRules.g:1277:1: ruleBoundAnyOfTypeLink returns [EObject current=null] : ( () ( (lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite ) ) ) ;
    public final EObject ruleBoundAnyOfTypeLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_linkAgent_1_0 = null;

        EObject lv_linkSite_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1283:2: ( ( () ( (lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite ) ) ) )
            // InternalReactionRules.g:1284:2: ( () ( (lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite ) ) )
            {
            // InternalReactionRules.g:1284:2: ( () ( (lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite ) ) )
            // InternalReactionRules.g:1285:3: () ( (lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent ) ) otherlv_2= '.' ( (lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite ) )
            {
            // InternalReactionRules.g:1285:3: ()
            // InternalReactionRules.g:1286:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoundAnyOfTypeLinkAccess().getBoundAnyOfTypeLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1292:3: ( (lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent ) )
            // InternalReactionRules.g:1293:4: (lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent )
            {
            // InternalReactionRules.g:1293:4: (lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent )
            // InternalReactionRules.g:1294:5: lv_linkAgent_1_0= ruleBoundAnyOfTypeLinkAgent
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
            		
            // InternalReactionRules.g:1315:3: ( (lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite ) )
            // InternalReactionRules.g:1316:4: (lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite )
            {
            // InternalReactionRules.g:1316:4: (lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite )
            // InternalReactionRules.g:1317:5: lv_linkSite_3_0= ruleBoundAnyOfTypeLinkSite
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
    // InternalReactionRules.g:1338:1: entryRuleSiteState returns [EObject current=null] : iv_ruleSiteState= ruleSiteState EOF ;
    public final EObject entryRuleSiteState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiteState = null;


        try {
            // InternalReactionRules.g:1338:50: (iv_ruleSiteState= ruleSiteState EOF )
            // InternalReactionRules.g:1339:2: iv_ruleSiteState= ruleSiteState EOF
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
    // InternalReactionRules.g:1345:1: ruleSiteState returns [EObject current=null] : ( () otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) otherlv_3= '}' ) ;
    public final EObject ruleSiteState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1351:2: ( ( () otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) otherlv_3= '}' ) )
            // InternalReactionRules.g:1352:2: ( () otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) otherlv_3= '}' )
            {
            // InternalReactionRules.g:1352:2: ( () otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) otherlv_3= '}' )
            // InternalReactionRules.g:1353:3: () otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) otherlv_3= '}'
            {
            // InternalReactionRules.g:1353:3: ()
            // InternalReactionRules.g:1354:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSiteStateAccess().getSiteStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSiteStateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalReactionRules.g:1364:3: ( (otherlv_2= RULE_ID ) )
            // InternalReactionRules.g:1365:4: (otherlv_2= RULE_ID )
            {
            // InternalReactionRules.g:1365:4: (otherlv_2= RULE_ID )
            // InternalReactionRules.g:1366:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSiteStateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

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
    // InternalReactionRules.g:1385:1: entryRuleLinkState returns [EObject current=null] : iv_ruleLinkState= ruleLinkState EOF ;
    public final EObject entryRuleLinkState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkState = null;


        try {
            // InternalReactionRules.g:1385:50: (iv_ruleLinkState= ruleLinkState EOF )
            // InternalReactionRules.g:1386:2: iv_ruleLinkState= ruleLinkState EOF
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
    // InternalReactionRules.g:1392:1: ruleLinkState returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleBoundAnyOfTypeLink | lv_linkState_2_4= ruleBoundLink | lv_linkState_2_5= ruleWhatEver ) ) ) otherlv_3= ']' ) ;
    public final EObject ruleLinkState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_linkState_2_1 = null;

        EObject lv_linkState_2_2 = null;

        EObject lv_linkState_2_3 = null;

        EObject lv_linkState_2_4 = null;

        EObject lv_linkState_2_5 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1398:2: ( ( () otherlv_1= '[' ( ( (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleBoundAnyOfTypeLink | lv_linkState_2_4= ruleBoundLink | lv_linkState_2_5= ruleWhatEver ) ) ) otherlv_3= ']' ) )
            // InternalReactionRules.g:1399:2: ( () otherlv_1= '[' ( ( (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleBoundAnyOfTypeLink | lv_linkState_2_4= ruleBoundLink | lv_linkState_2_5= ruleWhatEver ) ) ) otherlv_3= ']' )
            {
            // InternalReactionRules.g:1399:2: ( () otherlv_1= '[' ( ( (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleBoundAnyOfTypeLink | lv_linkState_2_4= ruleBoundLink | lv_linkState_2_5= ruleWhatEver ) ) ) otherlv_3= ']' )
            // InternalReactionRules.g:1400:3: () otherlv_1= '[' ( ( (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleBoundAnyOfTypeLink | lv_linkState_2_4= ruleBoundLink | lv_linkState_2_5= ruleWhatEver ) ) ) otherlv_3= ']'
            {
            // InternalReactionRules.g:1400:3: ()
            // InternalReactionRules.g:1401:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkStateAccess().getLinkStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkStateAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalReactionRules.g:1411:3: ( ( (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleBoundAnyOfTypeLink | lv_linkState_2_4= ruleBoundLink | lv_linkState_2_5= ruleWhatEver ) ) )
            // InternalReactionRules.g:1412:4: ( (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleBoundAnyOfTypeLink | lv_linkState_2_4= ruleBoundLink | lv_linkState_2_5= ruleWhatEver ) )
            {
            // InternalReactionRules.g:1412:4: ( (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleBoundAnyOfTypeLink | lv_linkState_2_4= ruleBoundLink | lv_linkState_2_5= ruleWhatEver ) )
            // InternalReactionRules.g:1413:5: (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleBoundAnyOfTypeLink | lv_linkState_2_4= ruleBoundLink | lv_linkState_2_5= ruleWhatEver )
            {
            // InternalReactionRules.g:1413:5: (lv_linkState_2_1= ruleBoundAnyLink | lv_linkState_2_2= ruleFreeLink | lv_linkState_2_3= ruleBoundAnyOfTypeLink | lv_linkState_2_4= ruleBoundLink | lv_linkState_2_5= ruleWhatEver )
            int alt12=5;
            switch ( input.LA(1) ) {
            case RULE_BOUND_LINK:
                {
                alt12=1;
                }
                break;
            case RULE_FREE_LINK:
                {
                alt12=2;
                }
                break;
            case RULE_ID:
                {
                alt12=3;
                }
                break;
            case RULE_INT:
                {
                alt12=4;
                }
                break;
            case RULE_WHATEVER_LINK:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalReactionRules.g:1414:6: lv_linkState_2_1= ruleBoundAnyLink
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateBoundAnyLinkParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_17);
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
                    // InternalReactionRules.g:1430:6: lv_linkState_2_2= ruleFreeLink
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateFreeLinkParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_17);
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
                    // InternalReactionRules.g:1446:6: lv_linkState_2_3= ruleBoundAnyOfTypeLink
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateBoundAnyOfTypeLinkParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_17);
                    lv_linkState_2_3=ruleBoundAnyOfTypeLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_2_3,
                    							"biochemsimulation.reactionrules.ReactionRules.BoundAnyOfTypeLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 4 :
                    // InternalReactionRules.g:1462:6: lv_linkState_2_4= ruleBoundLink
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateBoundLinkParserRuleCall_2_0_3());
                    					
                    pushFollow(FOLLOW_17);
                    lv_linkState_2_4=ruleBoundLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_2_4,
                    							"biochemsimulation.reactionrules.ReactionRules.BoundLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 5 :
                    // InternalReactionRules.g:1478:6: lv_linkState_2_5= ruleWhatEver
                    {

                    						newCompositeNode(grammarAccess.getLinkStateAccess().getLinkStateWhatEverParserRuleCall_2_0_4());
                    					
                    pushFollow(FOLLOW_17);
                    lv_linkState_2_5=ruleWhatEver();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkStateRule());
                    						}
                    						set(
                    							current,
                    							"linkState",
                    							lv_linkState_2_5,
                    							"biochemsimulation.reactionrules.ReactionRules.WhatEver");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

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


    // $ANTLR start "entryRuleSitePattern"
    // InternalReactionRules.g:1504:1: entryRuleSitePattern returns [EObject current=null] : iv_ruleSitePattern= ruleSitePattern EOF ;
    public final EObject entryRuleSitePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSitePattern = null;


        try {
            // InternalReactionRules.g:1504:52: (iv_ruleSitePattern= ruleSitePattern EOF )
            // InternalReactionRules.g:1505:2: iv_ruleSitePattern= ruleSitePattern EOF
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
    // InternalReactionRules.g:1511:1: ruleSitePattern returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_state_2_0= ruleSiteState ) )? ( (lv_linkState_3_0= ruleLinkState ) ) ) ;
    public final EObject ruleSitePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_state_2_0 = null;

        EObject lv_linkState_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1517:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_state_2_0= ruleSiteState ) )? ( (lv_linkState_3_0= ruleLinkState ) ) ) )
            // InternalReactionRules.g:1518:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_state_2_0= ruleSiteState ) )? ( (lv_linkState_3_0= ruleLinkState ) ) )
            {
            // InternalReactionRules.g:1518:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_state_2_0= ruleSiteState ) )? ( (lv_linkState_3_0= ruleLinkState ) ) )
            // InternalReactionRules.g:1519:3: () ( (otherlv_1= RULE_ID ) ) ( (lv_state_2_0= ruleSiteState ) )? ( (lv_linkState_3_0= ruleLinkState ) )
            {
            // InternalReactionRules.g:1519:3: ()
            // InternalReactionRules.g:1520:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSitePatternAccess().getSitePatternAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1526:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:1527:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:1527:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:1528:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSitePatternRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_1, grammarAccess.getSitePatternAccess().getSiteSiteCrossReference_1_0());
            				

            }


            }

            // InternalReactionRules.g:1539:3: ( (lv_state_2_0= ruleSiteState ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalReactionRules.g:1540:4: (lv_state_2_0= ruleSiteState )
                    {
                    // InternalReactionRules.g:1540:4: (lv_state_2_0= ruleSiteState )
                    // InternalReactionRules.g:1541:5: lv_state_2_0= ruleSiteState
                    {

                    					newCompositeNode(grammarAccess.getSitePatternAccess().getStateSiteStateParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_state_2_0=ruleSiteState();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSitePatternRule());
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

            // InternalReactionRules.g:1558:3: ( (lv_linkState_3_0= ruleLinkState ) )
            // InternalReactionRules.g:1559:4: (lv_linkState_3_0= ruleLinkState )
            {
            // InternalReactionRules.g:1559:4: (lv_linkState_3_0= ruleLinkState )
            // InternalReactionRules.g:1560:5: lv_linkState_3_0= ruleLinkState
            {

            					newCompositeNode(grammarAccess.getSitePatternAccess().getLinkStateLinkStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_linkState_3_0=ruleLinkState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSitePatternRule());
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
    // $ANTLR end "ruleSitePattern"


    // $ANTLR start "entryRuleSitePatterns"
    // InternalReactionRules.g:1581:1: entryRuleSitePatterns returns [EObject current=null] : iv_ruleSitePatterns= ruleSitePatterns EOF ;
    public final EObject entryRuleSitePatterns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSitePatterns = null;


        try {
            // InternalReactionRules.g:1581:53: (iv_ruleSitePatterns= ruleSitePatterns EOF )
            // InternalReactionRules.g:1582:2: iv_ruleSitePatterns= ruleSitePatterns EOF
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
    // InternalReactionRules.g:1588:1: ruleSitePatterns returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_sitePatterns_2_0= ruleSitePattern ) ) (otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleSitePatterns() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_sitePatterns_2_0 = null;

        EObject lv_sitePatterns_4_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1594:2: ( ( () otherlv_1= '(' ( ( (lv_sitePatterns_2_0= ruleSitePattern ) ) (otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) ) )* )? otherlv_5= ')' ) )
            // InternalReactionRules.g:1595:2: ( () otherlv_1= '(' ( ( (lv_sitePatterns_2_0= ruleSitePattern ) ) (otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) ) )* )? otherlv_5= ')' )
            {
            // InternalReactionRules.g:1595:2: ( () otherlv_1= '(' ( ( (lv_sitePatterns_2_0= ruleSitePattern ) ) (otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) ) )* )? otherlv_5= ')' )
            // InternalReactionRules.g:1596:3: () otherlv_1= '(' ( ( (lv_sitePatterns_2_0= ruleSitePattern ) ) (otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) ) )* )? otherlv_5= ')'
            {
            // InternalReactionRules.g:1596:3: ()
            // InternalReactionRules.g:1597:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSitePatternsAccess().getSitePatternsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSitePatternsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalReactionRules.g:1607:3: ( ( (lv_sitePatterns_2_0= ruleSitePattern ) ) (otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalReactionRules.g:1608:4: ( (lv_sitePatterns_2_0= ruleSitePattern ) ) (otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) ) )*
                    {
                    // InternalReactionRules.g:1608:4: ( (lv_sitePatterns_2_0= ruleSitePattern ) )
                    // InternalReactionRules.g:1609:5: (lv_sitePatterns_2_0= ruleSitePattern )
                    {
                    // InternalReactionRules.g:1609:5: (lv_sitePatterns_2_0= ruleSitePattern )
                    // InternalReactionRules.g:1610:6: lv_sitePatterns_2_0= ruleSitePattern
                    {

                    						newCompositeNode(grammarAccess.getSitePatternsAccess().getSitePatternsSitePatternParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    // InternalReactionRules.g:1627:4: (otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==24) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalReactionRules.g:1628:5: otherlv_3= ',' ( (lv_sitePatterns_4_0= ruleSitePattern ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSitePatternsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalReactionRules.g:1632:5: ( (lv_sitePatterns_4_0= ruleSitePattern ) )
                    	    // InternalReactionRules.g:1633:6: (lv_sitePatterns_4_0= ruleSitePattern )
                    	    {
                    	    // InternalReactionRules.g:1633:6: (lv_sitePatterns_4_0= ruleSitePattern )
                    	    // InternalReactionRules.g:1634:7: lv_sitePatterns_4_0= ruleSitePattern
                    	    {

                    	    							newCompositeNode(grammarAccess.getSitePatternsAccess().getSitePatternsSitePatternParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
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
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_2); 

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
    // InternalReactionRules.g:1661:1: entryRuleValidAgentPattern returns [EObject current=null] : iv_ruleValidAgentPattern= ruleValidAgentPattern EOF ;
    public final EObject entryRuleValidAgentPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidAgentPattern = null;


        try {
            // InternalReactionRules.g:1661:58: (iv_ruleValidAgentPattern= ruleValidAgentPattern EOF )
            // InternalReactionRules.g:1662:2: iv_ruleValidAgentPattern= ruleValidAgentPattern EOF
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
    // InternalReactionRules.g:1668:1: ruleValidAgentPattern returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_sitePatterns_2_0= ruleSitePatterns ) ) ) ;
    public final EObject ruleValidAgentPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sitePatterns_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1674:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_sitePatterns_2_0= ruleSitePatterns ) ) ) )
            // InternalReactionRules.g:1675:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_sitePatterns_2_0= ruleSitePatterns ) ) )
            {
            // InternalReactionRules.g:1675:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_sitePatterns_2_0= ruleSitePatterns ) ) )
            // InternalReactionRules.g:1676:3: () ( (otherlv_1= RULE_ID ) ) ( (lv_sitePatterns_2_0= ruleSitePatterns ) )
            {
            // InternalReactionRules.g:1676:3: ()
            // InternalReactionRules.g:1677:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValidAgentPatternAccess().getValidAgentPatternAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1683:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:1684:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:1684:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:1685:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidAgentPatternRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_1, grammarAccess.getValidAgentPatternAccess().getAgentAgentCrossReference_1_0());
            				

            }


            }

            // InternalReactionRules.g:1696:3: ( (lv_sitePatterns_2_0= ruleSitePatterns ) )
            // InternalReactionRules.g:1697:4: (lv_sitePatterns_2_0= ruleSitePatterns )
            {
            // InternalReactionRules.g:1697:4: (lv_sitePatterns_2_0= ruleSitePatterns )
            // InternalReactionRules.g:1698:5: lv_sitePatterns_2_0= ruleSitePatterns
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
    // InternalReactionRules.g:1719:1: entryRuleVoidAgentPattern returns [EObject current=null] : iv_ruleVoidAgentPattern= ruleVoidAgentPattern EOF ;
    public final EObject entryRuleVoidAgentPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidAgentPattern = null;


        try {
            // InternalReactionRules.g:1719:57: (iv_ruleVoidAgentPattern= ruleVoidAgentPattern EOF )
            // InternalReactionRules.g:1720:2: iv_ruleVoidAgentPattern= ruleVoidAgentPattern EOF
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
    // InternalReactionRules.g:1726:1: ruleVoidAgentPattern returns [EObject current=null] : ( (lv_pattern_0_0= RULE_VOID_PATTERN ) ) ;
    public final EObject ruleVoidAgentPattern() throws RecognitionException {
        EObject current = null;

        Token lv_pattern_0_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1732:2: ( ( (lv_pattern_0_0= RULE_VOID_PATTERN ) ) )
            // InternalReactionRules.g:1733:2: ( (lv_pattern_0_0= RULE_VOID_PATTERN ) )
            {
            // InternalReactionRules.g:1733:2: ( (lv_pattern_0_0= RULE_VOID_PATTERN ) )
            // InternalReactionRules.g:1734:3: (lv_pattern_0_0= RULE_VOID_PATTERN )
            {
            // InternalReactionRules.g:1734:3: (lv_pattern_0_0= RULE_VOID_PATTERN )
            // InternalReactionRules.g:1735:4: lv_pattern_0_0= RULE_VOID_PATTERN
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
    // InternalReactionRules.g:1754:1: entryRuleAgentPattern returns [EObject current=null] : iv_ruleAgentPattern= ruleAgentPattern EOF ;
    public final EObject entryRuleAgentPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgentPattern = null;


        try {
            // InternalReactionRules.g:1754:53: (iv_ruleAgentPattern= ruleAgentPattern EOF )
            // InternalReactionRules.g:1755:2: iv_ruleAgentPattern= ruleAgentPattern EOF
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
    // InternalReactionRules.g:1761:1: ruleAgentPattern returns [EObject current=null] : (this_ValidAgentPattern_0= ruleValidAgentPattern | this_VoidAgentPattern_1= ruleVoidAgentPattern ) ;
    public final EObject ruleAgentPattern() throws RecognitionException {
        EObject current = null;

        EObject this_ValidAgentPattern_0 = null;

        EObject this_VoidAgentPattern_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1767:2: ( (this_ValidAgentPattern_0= ruleValidAgentPattern | this_VoidAgentPattern_1= ruleVoidAgentPattern ) )
            // InternalReactionRules.g:1768:2: (this_ValidAgentPattern_0= ruleValidAgentPattern | this_VoidAgentPattern_1= ruleVoidAgentPattern )
            {
            // InternalReactionRules.g:1768:2: (this_ValidAgentPattern_0= ruleValidAgentPattern | this_VoidAgentPattern_1= ruleVoidAgentPattern )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_VOID_PATTERN) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalReactionRules.g:1769:3: this_ValidAgentPattern_0= ruleValidAgentPattern
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
                    // InternalReactionRules.g:1778:3: this_VoidAgentPattern_1= ruleVoidAgentPattern
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
    // InternalReactionRules.g:1790:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalReactionRules.g:1790:48: (iv_rulePattern= rulePattern EOF )
            // InternalReactionRules.g:1791:2: iv_rulePattern= rulePattern EOF
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
    // InternalReactionRules.g:1797:1: rulePattern returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}' ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_agentPatterns_2_0 = null;

        EObject lv_agentPatterns_4_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1803:2: ( ( () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}' ) )
            // InternalReactionRules.g:1804:2: ( () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}' )
            {
            // InternalReactionRules.g:1804:2: ( () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}' )
            // InternalReactionRules.g:1805:3: () otherlv_1= '{' ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )? otherlv_5= '}'
            {
            // InternalReactionRules.g:1805:3: ()
            // InternalReactionRules.g:1806:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternAccess().getPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalReactionRules.g:1816:3: ( ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==RULE_VOID_PATTERN) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalReactionRules.g:1817:4: ( (lv_agentPatterns_2_0= ruleAgentPattern ) ) (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )*
                    {
                    // InternalReactionRules.g:1817:4: ( (lv_agentPatterns_2_0= ruleAgentPattern ) )
                    // InternalReactionRules.g:1818:5: (lv_agentPatterns_2_0= ruleAgentPattern )
                    {
                    // InternalReactionRules.g:1818:5: (lv_agentPatterns_2_0= ruleAgentPattern )
                    // InternalReactionRules.g:1819:6: lv_agentPatterns_2_0= ruleAgentPattern
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

                    // InternalReactionRules.g:1836:4: (otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==24) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalReactionRules.g:1837:5: otherlv_3= ',' ( (lv_agentPatterns_4_0= ruleAgentPattern ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_21); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalReactionRules.g:1841:5: ( (lv_agentPatterns_4_0= ruleAgentPattern ) )
                    	    // InternalReactionRules.g:1842:6: (lv_agentPatterns_4_0= ruleAgentPattern )
                    	    {
                    	    // InternalReactionRules.g:1842:6: (lv_agentPatterns_4_0= ruleAgentPattern )
                    	    // InternalReactionRules.g:1843:7: lv_agentPatterns_4_0= ruleAgentPattern
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
                    	    break loop17;
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
    // InternalReactionRules.g:1870:1: entryRuleObservation returns [EObject current=null] : iv_ruleObservation= ruleObservation EOF ;
    public final EObject entryRuleObservation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObservation = null;


        try {
            // InternalReactionRules.g:1870:52: (iv_ruleObservation= ruleObservation EOF )
            // InternalReactionRules.g:1871:2: iv_ruleObservation= ruleObservation EOF
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
    // InternalReactionRules.g:1877:1: ruleObservation returns [EObject current=null] : (otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) ) ) ;
    public final EObject ruleObservation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_observationPattern_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1883:2: ( (otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) ) ) )
            // InternalReactionRules.g:1884:2: (otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) ) )
            {
            // InternalReactionRules.g:1884:2: (otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) ) )
            // InternalReactionRules.g:1885:3: otherlv_0= 'obs' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePatternAssignment ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObservationAccess().getObsKeyword_0());
            		
            // InternalReactionRules.g:1889:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:1890:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:1890:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:1891:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalReactionRules.g:1907:3: ( (lv_observationPattern_2_0= rulePatternAssignment ) )
            // InternalReactionRules.g:1908:4: (lv_observationPattern_2_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:1908:4: (lv_observationPattern_2_0= rulePatternAssignment )
            // InternalReactionRules.g:1909:5: lv_observationPattern_2_0= rulePatternAssignment
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
    // InternalReactionRules.g:1930:1: entryRuleNumericFromLiteral returns [EObject current=null] : iv_ruleNumericFromLiteral= ruleNumericFromLiteral EOF ;
    public final EObject entryRuleNumericFromLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericFromLiteral = null;


        try {
            // InternalReactionRules.g:1930:59: (iv_ruleNumericFromLiteral= ruleNumericFromLiteral EOF )
            // InternalReactionRules.g:1931:2: iv_ruleNumericFromLiteral= ruleNumericFromLiteral EOF
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
    // InternalReactionRules.g:1937:1: ruleNumericFromLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleArithmeticValue ) ) ;
    public final EObject ruleNumericFromLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1943:2: ( ( (lv_value_0_0= ruleArithmeticValue ) ) )
            // InternalReactionRules.g:1944:2: ( (lv_value_0_0= ruleArithmeticValue ) )
            {
            // InternalReactionRules.g:1944:2: ( (lv_value_0_0= ruleArithmeticValue ) )
            // InternalReactionRules.g:1945:3: (lv_value_0_0= ruleArithmeticValue )
            {
            // InternalReactionRules.g:1945:3: (lv_value_0_0= ruleArithmeticValue )
            // InternalReactionRules.g:1946:4: lv_value_0_0= ruleArithmeticValue
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
    // InternalReactionRules.g:1966:1: entryRuleNumericFromVariable returns [EObject current=null] : iv_ruleNumericFromVariable= ruleNumericFromVariable EOF ;
    public final EObject entryRuleNumericFromVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericFromVariable = null;


        try {
            // InternalReactionRules.g:1966:60: (iv_ruleNumericFromVariable= ruleNumericFromVariable EOF )
            // InternalReactionRules.g:1967:2: iv_ruleNumericFromVariable= ruleNumericFromVariable EOF
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
    // InternalReactionRules.g:1973:1: ruleNumericFromVariable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNumericFromVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:1979:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalReactionRules.g:1980:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalReactionRules.g:1980:2: ( (otherlv_0= RULE_ID ) )
            // InternalReactionRules.g:1981:3: (otherlv_0= RULE_ID )
            {
            // InternalReactionRules.g:1981:3: (otherlv_0= RULE_ID )
            // InternalReactionRules.g:1982:4: otherlv_0= RULE_ID
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
    // InternalReactionRules.g:1996:1: entryRuleNumericAssignment returns [EObject current=null] : iv_ruleNumericAssignment= ruleNumericAssignment EOF ;
    public final EObject entryRuleNumericAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericAssignment = null;


        try {
            // InternalReactionRules.g:1996:58: (iv_ruleNumericAssignment= ruleNumericAssignment EOF )
            // InternalReactionRules.g:1997:2: iv_ruleNumericAssignment= ruleNumericAssignment EOF
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
    // InternalReactionRules.g:2003:1: ruleNumericAssignment returns [EObject current=null] : (this_NumericFromLiteral_0= ruleNumericFromLiteral | this_NumericFromVariable_1= ruleNumericFromVariable ) ;
    public final EObject ruleNumericAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_NumericFromLiteral_0 = null;

        EObject this_NumericFromVariable_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2009:2: ( (this_NumericFromLiteral_0= ruleNumericFromLiteral | this_NumericFromVariable_1= ruleNumericFromVariable ) )
            // InternalReactionRules.g:2010:2: (this_NumericFromLiteral_0= ruleNumericFromLiteral | this_NumericFromVariable_1= ruleNumericFromVariable )
            {
            // InternalReactionRules.g:2010:2: (this_NumericFromLiteral_0= ruleNumericFromLiteral | this_NumericFromVariable_1= ruleNumericFromVariable )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT||LA19_0==20) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalReactionRules.g:2011:3: this_NumericFromLiteral_0= ruleNumericFromLiteral
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
                    // InternalReactionRules.g:2020:3: this_NumericFromVariable_1= ruleNumericFromVariable
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
    // InternalReactionRules.g:2032:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalReactionRules.g:2032:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalReactionRules.g:2033:2: iv_ruleInitial= ruleInitial EOF
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
    // InternalReactionRules.g:2039:1: ruleInitial returns [EObject current=null] : (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleNumericAssignment ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) ) ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_count_2_0 = null;

        EObject lv_initialPattern_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2045:2: ( (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleNumericAssignment ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) ) ) )
            // InternalReactionRules.g:2046:2: (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleNumericAssignment ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) ) )
            {
            // InternalReactionRules.g:2046:2: (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleNumericAssignment ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) ) )
            // InternalReactionRules.g:2047:3: otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleNumericAssignment ) ) ( (lv_initialPattern_3_0= rulePatternAssignment ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialAccess().getInitKeyword_0());
            		
            // InternalReactionRules.g:2051:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:2052:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:2052:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:2053:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

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

            // InternalReactionRules.g:2069:3: ( (lv_count_2_0= ruleNumericAssignment ) )
            // InternalReactionRules.g:2070:4: (lv_count_2_0= ruleNumericAssignment )
            {
            // InternalReactionRules.g:2070:4: (lv_count_2_0= ruleNumericAssignment )
            // InternalReactionRules.g:2071:5: lv_count_2_0= ruleNumericAssignment
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getCountNumericAssignmentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalReactionRules.g:2088:3: ( (lv_initialPattern_3_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2089:4: (lv_initialPattern_3_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2089:4: (lv_initialPattern_3_0= rulePatternAssignment )
            // InternalReactionRules.g:2090:5: lv_initialPattern_3_0= rulePatternAssignment
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
    // InternalReactionRules.g:2111:1: entryRuleAssignFromPattern returns [EObject current=null] : iv_ruleAssignFromPattern= ruleAssignFromPattern EOF ;
    public final EObject entryRuleAssignFromPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignFromPattern = null;


        try {
            // InternalReactionRules.g:2111:58: (iv_ruleAssignFromPattern= ruleAssignFromPattern EOF )
            // InternalReactionRules.g:2112:2: iv_ruleAssignFromPattern= ruleAssignFromPattern EOF
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
    // InternalReactionRules.g:2118:1: ruleAssignFromPattern returns [EObject current=null] : ( (lv_pattern_0_0= rulePattern ) ) ;
    public final EObject ruleAssignFromPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_pattern_0_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2124:2: ( ( (lv_pattern_0_0= rulePattern ) ) )
            // InternalReactionRules.g:2125:2: ( (lv_pattern_0_0= rulePattern ) )
            {
            // InternalReactionRules.g:2125:2: ( (lv_pattern_0_0= rulePattern ) )
            // InternalReactionRules.g:2126:3: (lv_pattern_0_0= rulePattern )
            {
            // InternalReactionRules.g:2126:3: (lv_pattern_0_0= rulePattern )
            // InternalReactionRules.g:2127:4: lv_pattern_0_0= rulePattern
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
    // InternalReactionRules.g:2147:1: entryRuleAssignFromVariable returns [EObject current=null] : iv_ruleAssignFromVariable= ruleAssignFromVariable EOF ;
    public final EObject entryRuleAssignFromVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignFromVariable = null;


        try {
            // InternalReactionRules.g:2147:59: (iv_ruleAssignFromVariable= ruleAssignFromVariable EOF )
            // InternalReactionRules.g:2148:2: iv_ruleAssignFromVariable= ruleAssignFromVariable EOF
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
    // InternalReactionRules.g:2154:1: ruleAssignFromVariable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleAssignFromVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:2160:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalReactionRules.g:2161:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalReactionRules.g:2161:2: ( (otherlv_0= RULE_ID ) )
            // InternalReactionRules.g:2162:3: (otherlv_0= RULE_ID )
            {
            // InternalReactionRules.g:2162:3: (otherlv_0= RULE_ID )
            // InternalReactionRules.g:2163:4: otherlv_0= RULE_ID
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
    // InternalReactionRules.g:2177:1: entryRulePatternAssignment returns [EObject current=null] : iv_rulePatternAssignment= rulePatternAssignment EOF ;
    public final EObject entryRulePatternAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternAssignment = null;


        try {
            // InternalReactionRules.g:2177:58: (iv_rulePatternAssignment= rulePatternAssignment EOF )
            // InternalReactionRules.g:2178:2: iv_rulePatternAssignment= rulePatternAssignment EOF
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
    // InternalReactionRules.g:2184:1: rulePatternAssignment returns [EObject current=null] : (this_AssignFromPattern_0= ruleAssignFromPattern | this_AssignFromVariable_1= ruleAssignFromVariable ) ;
    public final EObject rulePatternAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_AssignFromPattern_0 = null;

        EObject this_AssignFromVariable_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2190:2: ( (this_AssignFromPattern_0= ruleAssignFromPattern | this_AssignFromVariable_1= ruleAssignFromVariable ) )
            // InternalReactionRules.g:2191:2: (this_AssignFromPattern_0= ruleAssignFromPattern | this_AssignFromVariable_1= ruleAssignFromVariable )
            {
            // InternalReactionRules.g:2191:2: (this_AssignFromPattern_0= ruleAssignFromPattern | this_AssignFromVariable_1= ruleAssignFromVariable )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalReactionRules.g:2192:3: this_AssignFromPattern_0= ruleAssignFromPattern
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
                    // InternalReactionRules.g:2201:3: this_AssignFromVariable_1= ruleAssignFromVariable
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
    // InternalReactionRules.g:2213:1: entryRuleRuleVariables returns [EObject current=null] : iv_ruleRuleVariables= ruleRuleVariables EOF ;
    public final EObject entryRuleRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleVariables = null;


        try {
            // InternalReactionRules.g:2213:54: (iv_ruleRuleVariables= ruleRuleVariables EOF )
            // InternalReactionRules.g:2214:2: iv_ruleRuleVariables= ruleRuleVariables EOF
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
    // InternalReactionRules.g:2220:1: ruleRuleVariables returns [EObject current=null] : ( ( (lv_variables_0_0= ruleNumericAssignment ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleNumericAssignment ) ) )* ) ;
    public final EObject ruleRuleVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variables_0_0 = null;

        EObject lv_variables_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2226:2: ( ( ( (lv_variables_0_0= ruleNumericAssignment ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleNumericAssignment ) ) )* ) )
            // InternalReactionRules.g:2227:2: ( ( (lv_variables_0_0= ruleNumericAssignment ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleNumericAssignment ) ) )* )
            {
            // InternalReactionRules.g:2227:2: ( ( (lv_variables_0_0= ruleNumericAssignment ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleNumericAssignment ) ) )* )
            // InternalReactionRules.g:2228:3: ( (lv_variables_0_0= ruleNumericAssignment ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleNumericAssignment ) ) )*
            {
            // InternalReactionRules.g:2228:3: ( (lv_variables_0_0= ruleNumericAssignment ) )
            // InternalReactionRules.g:2229:4: (lv_variables_0_0= ruleNumericAssignment )
            {
            // InternalReactionRules.g:2229:4: (lv_variables_0_0= ruleNumericAssignment )
            // InternalReactionRules.g:2230:5: lv_variables_0_0= ruleNumericAssignment
            {

            					newCompositeNode(grammarAccess.getRuleVariablesAccess().getVariablesNumericAssignmentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalReactionRules.g:2247:3: (otherlv_1= ',' ( (lv_variables_2_0= ruleNumericAssignment ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalReactionRules.g:2248:4: otherlv_1= ',' ( (lv_variables_2_0= ruleNumericAssignment ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_23); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRuleVariablesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalReactionRules.g:2252:4: ( (lv_variables_2_0= ruleNumericAssignment ) )
            	    // InternalReactionRules.g:2253:5: (lv_variables_2_0= ruleNumericAssignment )
            	    {
            	    // InternalReactionRules.g:2253:5: (lv_variables_2_0= ruleNumericAssignment )
            	    // InternalReactionRules.g:2254:6: lv_variables_2_0= ruleNumericAssignment
            	    {

            	    						newCompositeNode(grammarAccess.getRuleVariablesAccess().getVariablesNumericAssignmentParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
            	    break loop21;
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
    // InternalReactionRules.g:2276:1: entryRuleUnidirectionalRule returns [EObject current=null] : iv_ruleUnidirectionalRule= ruleUnidirectionalRule EOF ;
    public final EObject entryRuleUnidirectionalRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnidirectionalRule = null;


        try {
            // InternalReactionRules.g:2276:59: (iv_ruleUnidirectionalRule= ruleUnidirectionalRule EOF )
            // InternalReactionRules.g:2277:2: iv_ruleUnidirectionalRule= ruleUnidirectionalRule EOF
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
    // InternalReactionRules.g:2283:1: ruleUnidirectionalRule returns [EObject current=null] : ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' ) ;
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
            // InternalReactionRules.g:2289:2: ( ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' ) )
            // InternalReactionRules.g:2290:2: ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' )
            {
            // InternalReactionRules.g:2290:2: ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' )
            // InternalReactionRules.g:2291:3: ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_UNI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']'
            {
            // InternalReactionRules.g:2291:3: ( (lv_lhs_0_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2292:4: (lv_lhs_0_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2292:4: (lv_lhs_0_0= rulePatternAssignment )
            // InternalReactionRules.g:2293:5: lv_lhs_0_0= rulePatternAssignment
            {

            					newCompositeNode(grammarAccess.getUnidirectionalRuleAccess().getLhsPatternAssignmentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalReactionRules.g:2310:3: ( (lv_operator_1_0= RULE_UNI ) )
            // InternalReactionRules.g:2311:4: (lv_operator_1_0= RULE_UNI )
            {
            // InternalReactionRules.g:2311:4: (lv_operator_1_0= RULE_UNI )
            // InternalReactionRules.g:2312:5: lv_operator_1_0= RULE_UNI
            {
            lv_operator_1_0=(Token)match(input,RULE_UNI,FOLLOW_22); 

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

            // InternalReactionRules.g:2328:3: ( (lv_rhs_2_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2329:4: (lv_rhs_2_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2329:4: (lv_rhs_2_0= rulePatternAssignment )
            // InternalReactionRules.g:2330:5: lv_rhs_2_0= rulePatternAssignment
            {

            					newCompositeNode(grammarAccess.getUnidirectionalRuleAccess().getRhsPatternAssignmentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
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

            this_AT_3=(Token)match(input,RULE_AT,FOLLOW_27); 

            			newLeafNode(this_AT_3, grammarAccess.getUnidirectionalRuleAccess().getATTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getUnidirectionalRuleAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalReactionRules.g:2355:3: ( (lv_variables_5_0= ruleRuleVariables ) )
            // InternalReactionRules.g:2356:4: (lv_variables_5_0= ruleRuleVariables )
            {
            // InternalReactionRules.g:2356:4: (lv_variables_5_0= ruleRuleVariables )
            // InternalReactionRules.g:2357:5: lv_variables_5_0= ruleRuleVariables
            {

            					newCompositeNode(grammarAccess.getUnidirectionalRuleAccess().getVariablesRuleVariablesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_6=(Token)match(input,32,FOLLOW_2); 

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
    // InternalReactionRules.g:2382:1: entryRuleBidirectionalRule returns [EObject current=null] : iv_ruleBidirectionalRule= ruleBidirectionalRule EOF ;
    public final EObject entryRuleBidirectionalRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBidirectionalRule = null;


        try {
            // InternalReactionRules.g:2382:58: (iv_ruleBidirectionalRule= ruleBidirectionalRule EOF )
            // InternalReactionRules.g:2383:2: iv_ruleBidirectionalRule= ruleBidirectionalRule EOF
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
    // InternalReactionRules.g:2389:1: ruleBidirectionalRule returns [EObject current=null] : ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' ) ;
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
            // InternalReactionRules.g:2395:2: ( ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' ) )
            // InternalReactionRules.g:2396:2: ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' )
            {
            // InternalReactionRules.g:2396:2: ( ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']' )
            // InternalReactionRules.g:2397:3: ( (lv_lhs_0_0= rulePatternAssignment ) ) ( (lv_operator_1_0= RULE_BI ) ) ( (lv_rhs_2_0= rulePatternAssignment ) ) this_AT_3= RULE_AT otherlv_4= '[' ( (lv_variables_5_0= ruleRuleVariables ) ) otherlv_6= ']'
            {
            // InternalReactionRules.g:2397:3: ( (lv_lhs_0_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2398:4: (lv_lhs_0_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2398:4: (lv_lhs_0_0= rulePatternAssignment )
            // InternalReactionRules.g:2399:5: lv_lhs_0_0= rulePatternAssignment
            {

            					newCompositeNode(grammarAccess.getBidirectionalRuleAccess().getLhsPatternAssignmentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalReactionRules.g:2416:3: ( (lv_operator_1_0= RULE_BI ) )
            // InternalReactionRules.g:2417:4: (lv_operator_1_0= RULE_BI )
            {
            // InternalReactionRules.g:2417:4: (lv_operator_1_0= RULE_BI )
            // InternalReactionRules.g:2418:5: lv_operator_1_0= RULE_BI
            {
            lv_operator_1_0=(Token)match(input,RULE_BI,FOLLOW_22); 

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

            // InternalReactionRules.g:2434:3: ( (lv_rhs_2_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2435:4: (lv_rhs_2_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2435:4: (lv_rhs_2_0= rulePatternAssignment )
            // InternalReactionRules.g:2436:5: lv_rhs_2_0= rulePatternAssignment
            {

            					newCompositeNode(grammarAccess.getBidirectionalRuleAccess().getRhsPatternAssignmentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
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

            this_AT_3=(Token)match(input,RULE_AT,FOLLOW_27); 

            			newLeafNode(this_AT_3, grammarAccess.getBidirectionalRuleAccess().getATTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getBidirectionalRuleAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalReactionRules.g:2461:3: ( (lv_variables_5_0= ruleRuleVariables ) )
            // InternalReactionRules.g:2462:4: (lv_variables_5_0= ruleRuleVariables )
            {
            // InternalReactionRules.g:2462:4: (lv_variables_5_0= ruleRuleVariables )
            // InternalReactionRules.g:2463:5: lv_variables_5_0= ruleRuleVariables
            {

            					newCompositeNode(grammarAccess.getBidirectionalRuleAccess().getVariablesRuleVariablesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_6=(Token)match(input,32,FOLLOW_2); 

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
    // InternalReactionRules.g:2488:1: entryRuleRuleBody returns [EObject current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final EObject entryRuleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBody = null;


        try {
            // InternalReactionRules.g:2488:49: (iv_ruleRuleBody= ruleRuleBody EOF )
            // InternalReactionRules.g:2489:2: iv_ruleRuleBody= ruleRuleBody EOF
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
    // InternalReactionRules.g:2495:1: ruleRuleBody returns [EObject current=null] : (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule ) ;
    public final EObject ruleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject this_UnidirectionalRule_0 = null;

        EObject this_BidirectionalRule_1 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2501:2: ( (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule ) )
            // InternalReactionRules.g:2502:2: (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule )
            {
            // InternalReactionRules.g:2502:2: (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalReactionRules.g:2503:3: this_UnidirectionalRule_0= ruleUnidirectionalRule
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
                    // InternalReactionRules.g:2512:3: this_BidirectionalRule_1= ruleBidirectionalRule
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
    // InternalReactionRules.g:2524:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalReactionRules.g:2524:45: (iv_ruleRule= ruleRule EOF )
            // InternalReactionRules.g:2525:2: iv_ruleRule= ruleRule EOF
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
    // InternalReactionRules.g:2531:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2537:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) ) ) )
            // InternalReactionRules.g:2538:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) ) )
            {
            // InternalReactionRules.g:2538:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) ) )
            // InternalReactionRules.g:2539:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRuleBody ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalReactionRules.g:2543:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:2544:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:2544:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:2545:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalReactionRules.g:2561:3: ( (lv_rule_2_0= ruleRuleBody ) )
            // InternalReactionRules.g:2562:4: (lv_rule_2_0= ruleRuleBody )
            {
            // InternalReactionRules.g:2562:4: (lv_rule_2_0= ruleRuleBody )
            // InternalReactionRules.g:2563:5: lv_rule_2_0= ruleRuleBody
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
    // InternalReactionRules.g:2584:1: entryRuleIterations returns [EObject current=null] : iv_ruleIterations= ruleIterations EOF ;
    public final EObject entryRuleIterations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterations = null;


        try {
            // InternalReactionRules.g:2584:51: (iv_ruleIterations= ruleIterations EOF )
            // InternalReactionRules.g:2585:2: iv_ruleIterations= ruleIterations EOF
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
    // InternalReactionRules.g:2591:1: ruleIterations returns [EObject current=null] : (otherlv_0= 'iterations' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) ) ) ;
    public final EObject ruleIterations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2597:2: ( (otherlv_0= 'iterations' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) ) ) )
            // InternalReactionRules.g:2598:2: (otherlv_0= 'iterations' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) ) )
            {
            // InternalReactionRules.g:2598:2: (otherlv_0= 'iterations' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) ) )
            // InternalReactionRules.g:2599:3: otherlv_0= 'iterations' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIterationsAccess().getIterationsKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getIterationsAccess().getEqualsSignKeyword_1());
            		
            // InternalReactionRules.g:2607:3: ( (lv_value_2_0= ruleUnsignedInteger ) )
            // InternalReactionRules.g:2608:4: (lv_value_2_0= ruleUnsignedInteger )
            {
            // InternalReactionRules.g:2608:4: (lv_value_2_0= ruleUnsignedInteger )
            // InternalReactionRules.g:2609:5: lv_value_2_0= ruleUnsignedInteger
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
    // InternalReactionRules.g:2630:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalReactionRules.g:2630:45: (iv_ruleTime= ruleTime EOF )
            // InternalReactionRules.g:2631:2: iv_ruleTime= ruleTime EOF
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
    // InternalReactionRules.g:2637:1: ruleTime returns [EObject current=null] : (otherlv_0= 'time' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2643:2: ( (otherlv_0= 'time' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) ) ) )
            // InternalReactionRules.g:2644:2: (otherlv_0= 'time' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) ) )
            {
            // InternalReactionRules.g:2644:2: (otherlv_0= 'time' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) ) )
            // InternalReactionRules.g:2645:3: otherlv_0= 'time' otherlv_1= '=' ( (lv_value_2_0= ruleUnsignedInteger ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeAccess().getTimeKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getEqualsSignKeyword_1());
            		
            // InternalReactionRules.g:2653:3: ( (lv_value_2_0= ruleUnsignedInteger ) )
            // InternalReactionRules.g:2654:4: (lv_value_2_0= ruleUnsignedInteger )
            {
            // InternalReactionRules.g:2654:4: (lv_value_2_0= ruleUnsignedInteger )
            // InternalReactionRules.g:2655:5: lv_value_2_0= ruleUnsignedInteger
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
    // InternalReactionRules.g:2676:1: entryRulePopulation returns [EObject current=null] : iv_rulePopulation= rulePopulation EOF ;
    public final EObject entryRulePopulation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePopulation = null;


        try {
            // InternalReactionRules.g:2676:51: (iv_rulePopulation= rulePopulation EOF )
            // InternalReactionRules.g:2677:2: iv_rulePopulation= rulePopulation EOF
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
    // InternalReactionRules.g:2683:1: rulePopulation returns [EObject current=null] : (otherlv_0= '|' ( (lv_pa_1_0= rulePatternAssignment ) ) otherlv_2= '|' otherlv_3= '==>' ( (lv_value_4_0= ruleUnsignedInteger ) ) ) ;
    public final EObject rulePopulation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_pa_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2689:2: ( (otherlv_0= '|' ( (lv_pa_1_0= rulePatternAssignment ) ) otherlv_2= '|' otherlv_3= '==>' ( (lv_value_4_0= ruleUnsignedInteger ) ) ) )
            // InternalReactionRules.g:2690:2: (otherlv_0= '|' ( (lv_pa_1_0= rulePatternAssignment ) ) otherlv_2= '|' otherlv_3= '==>' ( (lv_value_4_0= ruleUnsignedInteger ) ) )
            {
            // InternalReactionRules.g:2690:2: (otherlv_0= '|' ( (lv_pa_1_0= rulePatternAssignment ) ) otherlv_2= '|' otherlv_3= '==>' ( (lv_value_4_0= ruleUnsignedInteger ) ) )
            // InternalReactionRules.g:2691:3: otherlv_0= '|' ( (lv_pa_1_0= rulePatternAssignment ) ) otherlv_2= '|' otherlv_3= '==>' ( (lv_value_4_0= ruleUnsignedInteger ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getPopulationAccess().getVerticalLineKeyword_0());
            		
            // InternalReactionRules.g:2695:3: ( (lv_pa_1_0= rulePatternAssignment ) )
            // InternalReactionRules.g:2696:4: (lv_pa_1_0= rulePatternAssignment )
            {
            // InternalReactionRules.g:2696:4: (lv_pa_1_0= rulePatternAssignment )
            // InternalReactionRules.g:2697:5: lv_pa_1_0= rulePatternAssignment
            {

            					newCompositeNode(grammarAccess.getPopulationAccess().getPaPatternAssignmentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
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

            otherlv_2=(Token)match(input,38,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getPopulationAccess().getVerticalLineKeyword_2());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPopulationAccess().getEqualsSignEqualsSignGreaterThanSignKeyword_3());
            		
            // InternalReactionRules.g:2722:3: ( (lv_value_4_0= ruleUnsignedInteger ) )
            // InternalReactionRules.g:2723:4: (lv_value_4_0= ruleUnsignedInteger )
            {
            // InternalReactionRules.g:2723:4: (lv_value_4_0= ruleUnsignedInteger )
            // InternalReactionRules.g:2724:5: lv_value_4_0= ruleUnsignedInteger
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
    // InternalReactionRules.g:2745:1: entryRuleTerminationCondition returns [EObject current=null] : iv_ruleTerminationCondition= ruleTerminationCondition EOF ;
    public final EObject entryRuleTerminationCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminationCondition = null;


        try {
            // InternalReactionRules.g:2745:61: (iv_ruleTerminationCondition= ruleTerminationCondition EOF )
            // InternalReactionRules.g:2746:2: iv_ruleTerminationCondition= ruleTerminationCondition EOF
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
    // InternalReactionRules.g:2752:1: ruleTerminationCondition returns [EObject current=null] : (this_Iterations_0= ruleIterations | this_Time_1= ruleTime | this_Population_2= rulePopulation ) ;
    public final EObject ruleTerminationCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Iterations_0 = null;

        EObject this_Time_1 = null;

        EObject this_Population_2 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2758:2: ( (this_Iterations_0= ruleIterations | this_Time_1= ruleTime | this_Population_2= rulePopulation ) )
            // InternalReactionRules.g:2759:2: (this_Iterations_0= ruleIterations | this_Time_1= ruleTime | this_Population_2= rulePopulation )
            {
            // InternalReactionRules.g:2759:2: (this_Iterations_0= ruleIterations | this_Time_1= ruleTime | this_Population_2= rulePopulation )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt23=1;
                }
                break;
            case 37:
                {
                alt23=2;
                }
                break;
            case 38:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalReactionRules.g:2760:3: this_Iterations_0= ruleIterations
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
                    // InternalReactionRules.g:2769:3: this_Time_1= ruleTime
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
                    // InternalReactionRules.g:2778:3: this_Population_2= rulePopulation
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
    // InternalReactionRules.g:2790:1: entryRuleTerminate returns [EObject current=null] : iv_ruleTerminate= ruleTerminate EOF ;
    public final EObject entryRuleTerminate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminate = null;


        try {
            // InternalReactionRules.g:2790:50: (iv_ruleTerminate= ruleTerminate EOF )
            // InternalReactionRules.g:2791:2: iv_ruleTerminate= ruleTerminate EOF
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
    // InternalReactionRules.g:2797:1: ruleTerminate returns [EObject current=null] : (otherlv_0= 'terminate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= ruleTerminationCondition ) ) ) ;
    public final EObject ruleTerminate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:2803:2: ( (otherlv_0= 'terminate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= ruleTerminationCondition ) ) ) )
            // InternalReactionRules.g:2804:2: (otherlv_0= 'terminate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= ruleTerminationCondition ) ) )
            {
            // InternalReactionRules.g:2804:2: (otherlv_0= 'terminate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= ruleTerminationCondition ) ) )
            // InternalReactionRules.g:2805:3: otherlv_0= 'terminate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_condition_2_0= ruleTerminationCondition ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTerminateAccess().getTerminateKeyword_0());
            		
            // InternalReactionRules.g:2809:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:2810:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:2810:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:2811:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            // InternalReactionRules.g:2827:3: ( (lv_condition_2_0= ruleTerminationCondition ) )
            // InternalReactionRules.g:2828:4: (lv_condition_2_0= ruleTerminationCondition )
            {
            // InternalReactionRules.g:2828:4: (lv_condition_2_0= ruleTerminationCondition )
            // InternalReactionRules.g:2829:5: lv_condition_2_0= ruleTerminationCondition
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
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\4\1\6\3\uffff\1\10\2\uffff";
    static final String dfa_3s = "\2\5\2\4\1\uffff\1\5\1\uffff\1\4\2\uffff";
    static final String dfa_4s = "\1\24\1\5\2\50\1\uffff\1\5\1\uffff\1\50\2\uffff";
    static final String dfa_5s = "\4\uffff\1\2\1\uffff\1\3\1\uffff\1\1\1\4";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\16\uffff\1\1",
            "\1\3",
            "\1\4\20\uffff\1\5\1\uffff\2\4\3\uffff\2\4\2\uffff\4\4\4\uffff\1\4",
            "\1\6\20\uffff\1\5\1\uffff\2\6\3\uffff\2\6\2\uffff\4\6\4\uffff\1\6",
            "",
            "\1\7",
            "",
            "\1\10\1\uffff\1\11\20\uffff\2\10\3\uffff\2\10\2\uffff\4\10\4\uffff\1\10",
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
    static final String dfa_8s = "\105\uffff";
    static final String dfa_9s = "\2\4\1\13\1\32\1\30\1\13\2\uffff\2\4\1\27\1\30\1\32\1\30\3\4\1\31\2\40\1\25\2\40\1\27\1\30\1\37\1\30\4\4\1\40\1\31\2\40\1\25\2\40\1\27\1\37\1\30\4\4\1\40\1\31\2\40\1\25\2\40\1\27\1\37\1\30\3\4\1\40\1\31\2\40\1\25\2\40\1\37\1\30\1\4\1\40";
    static final String dfa_10s = "\1\27\1\31\1\15\1\32\1\31\1\15\2\uffff\1\33\1\12\1\37\1\31\1\32\1\31\1\4\1\11\1\33\1\31\2\40\1\25\2\40\1\37\1\31\1\37\1\33\2\4\1\11\1\4\1\40\1\31\2\40\1\25\2\40\2\37\1\33\2\4\1\11\1\4\1\40\1\31\2\40\1\25\2\40\2\37\1\33\2\4\1\11\1\40\1\31\2\40\1\25\2\40\1\37\1\33\1\4\1\40";
    static final String dfa_11s = "\6\uffff\1\2\1\1\75\uffff";
    static final String dfa_12s = "\105\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\22\uffff\1\1",
            "\1\3\5\uffff\1\4\16\uffff\1\5",
            "\1\7\1\uffff\1\6",
            "\1\10",
            "\1\11\1\5",
            "\1\7\1\uffff\1\6",
            "",
            "",
            "\1\12\26\uffff\1\13",
            "\1\14\5\uffff\1\15",
            "\1\16\7\uffff\1\17",
            "\1\11\1\5",
            "\1\20",
            "\1\11\1\5",
            "\1\21",
            "\1\24\1\25\1\uffff\1\22\1\23\1\26",
            "\1\27\26\uffff\1\30",
            "\1\31",
            "\1\32",
            "\1\32",
            "\1\33",
            "\1\32",
            "\1\32",
            "\1\34\7\uffff\1\35",
            "\1\11\1\5",
            "\1\17",
            "\1\36\2\uffff\1\13",
            "\1\37",
            "\1\40",
            "\1\43\1\44\1\uffff\1\41\1\42\1\45",
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
            "\1\54\2\uffff\1\30",
            "\1\55",
            "\1\56",
            "\1\61\1\62\1\uffff\1\57\1\60\1\63",
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
            "\1\36\2\uffff\1\13",
            "\1\72",
            "\1\73",
            "\1\76\1\77\1\uffff\1\74\1\75\1\100",
            "\1\66",
            "\1\101",
            "\1\102",
            "\1\102",
            "\1\103",
            "\1\102",
            "\1\102",
            "\1\71",
            "\1\54\2\uffff\1\30",
            "\1\104",
            "\1\102"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2502:2: (this_UnidirectionalRule_0= ruleUnidirectionalRule | this_BidirectionalRule_1= ruleBidirectionalRule )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000010E30000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000003B0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000410L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000007000000000L});

}