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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'{'", "','", "'}'", "'('", "')'", "'Agent'", "'Variable'", "'='", "'Semi-Link'", "'Free'", "'['", "']'", "'Observation'", "'Initial'", "'Rule'", "'uni'", "'bi'", "'at'"
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
    // InternalReactionRules.g:71:1: ruleReactionRuleModel returns [EObject current=null] : ( (lv_reactionProperties_0_0= ruleReactionProperty ) )* ;
    public final EObject ruleReactionRuleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_reactionProperties_0_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:77:2: ( ( (lv_reactionProperties_0_0= ruleReactionProperty ) )* )
            // InternalReactionRules.g:78:2: ( (lv_reactionProperties_0_0= ruleReactionProperty ) )*
            {
            // InternalReactionRules.g:78:2: ( (lv_reactionProperties_0_0= ruleReactionProperty ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=18)||(LA1_0>=24 && LA1_0<=26)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReactionRules.g:79:3: (lv_reactionProperties_0_0= ruleReactionProperty )
            	    {
            	    // InternalReactionRules.g:79:3: (lv_reactionProperties_0_0= ruleReactionProperty )
            	    // InternalReactionRules.g:80:4: lv_reactionProperties_0_0= ruleReactionProperty
            	    {

            	    				newCompositeNode(grammarAccess.getReactionRuleModelAccess().getReactionPropertiesReactionPropertyParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_reactionProperties_0_0=ruleReactionProperty();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getReactionRuleModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"reactionProperties",
            	    					lv_reactionProperties_0_0,
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


    // $ANTLR start "entryRuleReactionProperty"
    // InternalReactionRules.g:100:1: entryRuleReactionProperty returns [EObject current=null] : iv_ruleReactionProperty= ruleReactionProperty EOF ;
    public final EObject entryRuleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperty = null;


        try {
            // InternalReactionRules.g:100:57: (iv_ruleReactionProperty= ruleReactionProperty EOF )
            // InternalReactionRules.g:101:2: iv_ruleReactionProperty= ruleReactionProperty EOF
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
    // InternalReactionRules.g:107:1: ruleReactionProperty returns [EObject current=null] : (this_Agent_0= ruleAgent | this_Variable_1= ruleVariable | this_Observation_2= ruleObservation | this_Initial_3= ruleInitial | this_Rule_4= ruleRule ) ;
    public final EObject ruleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Agent_0 = null;

        EObject this_Variable_1 = null;

        EObject this_Observation_2 = null;

        EObject this_Initial_3 = null;

        EObject this_Rule_4 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:113:2: ( (this_Agent_0= ruleAgent | this_Variable_1= ruleVariable | this_Observation_2= ruleObservation | this_Initial_3= ruleInitial | this_Rule_4= ruleRule ) )
            // InternalReactionRules.g:114:2: (this_Agent_0= ruleAgent | this_Variable_1= ruleVariable | this_Observation_2= ruleObservation | this_Initial_3= ruleInitial | this_Rule_4= ruleRule )
            {
            // InternalReactionRules.g:114:2: (this_Agent_0= ruleAgent | this_Variable_1= ruleVariable | this_Observation_2= ruleObservation | this_Initial_3= ruleInitial | this_Rule_4= ruleRule )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            case 26:
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
                    // InternalReactionRules.g:115:3: this_Agent_0= ruleAgent
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
                    // InternalReactionRules.g:124:3: this_Variable_1= ruleVariable
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
                    // InternalReactionRules.g:133:3: this_Observation_2= ruleObservation
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
                    // InternalReactionRules.g:142:3: this_Initial_3= ruleInitial
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
                    // InternalReactionRules.g:151:3: this_Rule_4= ruleRule
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
    // InternalReactionRules.g:163:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalReactionRules.g:163:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalReactionRules.g:164:2: iv_ruleFloat= ruleFloat EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalReactionRules.g:170:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalReactionRules.g:176:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalReactionRules.g:177:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalReactionRules.g:177:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalReactionRules.g:178:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,11,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleBigInteger"
    // InternalReactionRules.g:201:1: entryRuleBigInteger returns [String current=null] : iv_ruleBigInteger= ruleBigInteger EOF ;
    public final String entryRuleBigInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBigInteger = null;


        try {
            // InternalReactionRules.g:201:50: (iv_ruleBigInteger= ruleBigInteger EOF )
            // InternalReactionRules.g:202:2: iv_ruleBigInteger= ruleBigInteger EOF
            {
             newCompositeNode(grammarAccess.getBigIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBigInteger=ruleBigInteger();

            state._fsp--;

             current =iv_ruleBigInteger.getText(); 
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
    // $ANTLR end "entryRuleBigInteger"


    // $ANTLR start "ruleBigInteger"
    // InternalReactionRules.g:208:1: ruleBigInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleBigInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:214:2: (this_INT_0= RULE_INT )
            // InternalReactionRules.g:215:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getBigIntegerAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleBigInteger"


    // $ANTLR start "entryRuleState"
    // InternalReactionRules.g:225:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalReactionRules.g:225:46: (iv_ruleState= ruleState EOF )
            // InternalReactionRules.g:226:2: iv_ruleState= ruleState EOF
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
    // InternalReactionRules.g:232:1: ruleState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalReactionRules.g:238:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalReactionRules.g:239:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalReactionRules.g:239:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalReactionRules.g:240:3: (lv_name_0_0= RULE_ID )
            {
            // InternalReactionRules.g:240:3: (lv_name_0_0= RULE_ID )
            // InternalReactionRules.g:241:4: lv_name_0_0= RULE_ID
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
    // InternalReactionRules.g:260:1: entryRuleStates returns [EObject current=null] : iv_ruleStates= ruleStates EOF ;
    public final EObject entryRuleStates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStates = null;


        try {
            // InternalReactionRules.g:260:47: (iv_ruleStates= ruleStates EOF )
            // InternalReactionRules.g:261:2: iv_ruleStates= ruleStates EOF
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
    // InternalReactionRules.g:267:1: ruleStates returns [EObject current=null] : ( () (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleStates() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_state_2_0 = null;

        EObject lv_state_4_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:273:2: ( ( () (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )? ) )
            // InternalReactionRules.g:274:2: ( () (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )? )
            {
            // InternalReactionRules.g:274:2: ( () (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )? )
            // InternalReactionRules.g:275:3: () (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )?
            {
            // InternalReactionRules.g:275:3: ()
            // InternalReactionRules.g:276:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatesAccess().getStatesAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:282:3: (otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalReactionRules.g:283:4: otherlv_1= '{' ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatesAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalReactionRules.g:287:4: ( (lv_state_2_0= ruleState ) )
                    // InternalReactionRules.g:288:5: (lv_state_2_0= ruleState )
                    {
                    // InternalReactionRules.g:288:5: (lv_state_2_0= ruleState )
                    // InternalReactionRules.g:289:6: lv_state_2_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getStatesAccess().getStateStateParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalReactionRules.g:306:4: (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalReactionRules.g:307:5: otherlv_3= ',' ( (lv_state_4_0= ruleState ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getStatesAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalReactionRules.g:311:5: ( (lv_state_4_0= ruleState ) )
                    	    // InternalReactionRules.g:312:6: (lv_state_4_0= ruleState )
                    	    {
                    	    // InternalReactionRules.g:312:6: (lv_state_4_0= ruleState )
                    	    // InternalReactionRules.g:313:7: lv_state_4_0= ruleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getStatesAccess().getStateStateParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalReactionRules.g:340:1: entryRuleSite returns [EObject current=null] : iv_ruleSite= ruleSite EOF ;
    public final EObject entryRuleSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSite = null;


        try {
            // InternalReactionRules.g:340:45: (iv_ruleSite= ruleSite EOF )
            // InternalReactionRules.g:341:2: iv_ruleSite= ruleSite EOF
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
    // InternalReactionRules.g:347:1: ruleSite returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_states_1_0= ruleStates ) ) ) ;
    public final EObject ruleSite() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_states_1_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:353:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_states_1_0= ruleStates ) ) ) )
            // InternalReactionRules.g:354:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_states_1_0= ruleStates ) ) )
            {
            // InternalReactionRules.g:354:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_states_1_0= ruleStates ) ) )
            // InternalReactionRules.g:355:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_states_1_0= ruleStates ) )
            {
            // InternalReactionRules.g:355:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalReactionRules.g:356:4: (lv_name_0_0= RULE_ID )
            {
            // InternalReactionRules.g:356:4: (lv_name_0_0= RULE_ID )
            // InternalReactionRules.g:357:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalReactionRules.g:373:3: ( (lv_states_1_0= ruleStates ) )
            // InternalReactionRules.g:374:4: (lv_states_1_0= ruleStates )
            {
            // InternalReactionRules.g:374:4: (lv_states_1_0= ruleStates )
            // InternalReactionRules.g:375:5: lv_states_1_0= ruleStates
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
    // InternalReactionRules.g:396:1: entryRuleSites returns [EObject current=null] : iv_ruleSites= ruleSites EOF ;
    public final EObject entryRuleSites() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSites = null;


        try {
            // InternalReactionRules.g:396:46: (iv_ruleSites= ruleSites EOF )
            // InternalReactionRules.g:397:2: iv_ruleSites= ruleSites EOF
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
    // InternalReactionRules.g:403:1: ruleSites returns [EObject current=null] : ( () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleSites() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_sites_2_0 = null;

        EObject lv_sites_4_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:409:2: ( ( () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )? ) )
            // InternalReactionRules.g:410:2: ( () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )? )
            {
            // InternalReactionRules.g:410:2: ( () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )? )
            // InternalReactionRules.g:411:3: () (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )?
            {
            // InternalReactionRules.g:411:3: ()
            // InternalReactionRules.g:412:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSitesAccess().getSitesAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:418:3: (otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalReactionRules.g:419:4: otherlv_1= '(' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getSitesAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalReactionRules.g:423:4: ( (lv_sites_2_0= ruleSite ) )
                    // InternalReactionRules.g:424:5: (lv_sites_2_0= ruleSite )
                    {
                    // InternalReactionRules.g:424:5: (lv_sites_2_0= ruleSite )
                    // InternalReactionRules.g:425:6: lv_sites_2_0= ruleSite
                    {

                    						newCompositeNode(grammarAccess.getSitesAccess().getSitesSiteParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalReactionRules.g:442:4: (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalReactionRules.g:443:5: otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSitesAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalReactionRules.g:447:5: ( (lv_sites_4_0= ruleSite ) )
                    	    // InternalReactionRules.g:448:6: (lv_sites_4_0= ruleSite )
                    	    {
                    	    // InternalReactionRules.g:448:6: (lv_sites_4_0= ruleSite )
                    	    // InternalReactionRules.g:449:7: lv_sites_4_0= ruleSite
                    	    {

                    	    							newCompositeNode(grammarAccess.getSitesAccess().getSitesSiteParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_2); 

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
    // InternalReactionRules.g:476:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // InternalReactionRules.g:476:46: (iv_ruleAgent= ruleAgent EOF )
            // InternalReactionRules.g:477:2: iv_ruleAgent= ruleAgent EOF
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
    // InternalReactionRules.g:483:1: ruleAgent returns [EObject current=null] : (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) ) ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_sites_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:489:2: ( (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) ) ) )
            // InternalReactionRules.g:490:2: (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) ) )
            {
            // InternalReactionRules.g:490:2: (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) ) )
            // InternalReactionRules.g:491:3: otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sites_2_0= ruleSites ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
            		
            // InternalReactionRules.g:495:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:496:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:496:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:497:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalReactionRules.g:513:3: ( (lv_sites_2_0= ruleSites ) )
            // InternalReactionRules.g:514:4: (lv_sites_2_0= ruleSites )
            {
            // InternalReactionRules.g:514:4: (lv_sites_2_0= ruleSites )
            // InternalReactionRules.g:515:5: lv_sites_2_0= ruleSites
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


    // $ANTLR start "entryRuleVariable"
    // InternalReactionRules.g:536:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalReactionRules.g:536:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalReactionRules.g:537:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalReactionRules.g:543:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'Variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleFloat ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:549:2: ( (otherlv_0= 'Variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleFloat ) ) ) )
            // InternalReactionRules.g:550:2: (otherlv_0= 'Variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleFloat ) ) )
            {
            // InternalReactionRules.g:550:2: (otherlv_0= 'Variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleFloat ) ) )
            // InternalReactionRules.g:551:3: otherlv_0= 'Variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleFloat ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            // InternalReactionRules.g:555:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:556:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:556:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:557:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalReactionRules.g:577:3: ( (lv_value_3_0= ruleFloat ) )
            // InternalReactionRules.g:578:4: (lv_value_3_0= ruleFloat )
            {
            // InternalReactionRules.g:578:4: (lv_value_3_0= ruleFloat )
            // InternalReactionRules.g:579:5: lv_value_3_0= ruleFloat
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getValueFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"biochemsimulation.reactionrules.ReactionRules.Float");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleLinkState"
    // InternalReactionRules.g:600:1: entryRuleLinkState returns [EObject current=null] : iv_ruleLinkState= ruleLinkState EOF ;
    public final EObject entryRuleLinkState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkState = null;


        try {
            // InternalReactionRules.g:600:50: (iv_ruleLinkState= ruleLinkState EOF )
            // InternalReactionRules.g:601:2: iv_ruleLinkState= ruleLinkState EOF
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
    // InternalReactionRules.g:607:1: ruleLinkState returns [EObject current=null] : (this_SemiLink_0= ruleSemiLink | this_FreeLink_1= ruleFreeLink | this_ExactLink_2= ruleExactLink | this_LimitLink_3= ruleLimitLink ) ;
    public final EObject ruleLinkState() throws RecognitionException {
        EObject current = null;

        EObject this_SemiLink_0 = null;

        EObject this_FreeLink_1 = null;

        EObject this_ExactLink_2 = null;

        EObject this_LimitLink_3 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:613:2: ( (this_SemiLink_0= ruleSemiLink | this_FreeLink_1= ruleFreeLink | this_ExactLink_2= ruleExactLink | this_LimitLink_3= ruleLimitLink ) )
            // InternalReactionRules.g:614:2: (this_SemiLink_0= ruleSemiLink | this_FreeLink_1= ruleFreeLink | this_ExactLink_2= ruleExactLink | this_LimitLink_3= ruleLimitLink )
            {
            // InternalReactionRules.g:614:2: (this_SemiLink_0= ruleSemiLink | this_FreeLink_1= ruleFreeLink | this_ExactLink_2= ruleExactLink | this_LimitLink_3= ruleLimitLink )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            case RULE_INT:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalReactionRules.g:615:3: this_SemiLink_0= ruleSemiLink
                    {

                    			newCompositeNode(grammarAccess.getLinkStateAccess().getSemiLinkParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SemiLink_0=ruleSemiLink();

                    state._fsp--;


                    			current = this_SemiLink_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:624:3: this_FreeLink_1= ruleFreeLink
                    {

                    			newCompositeNode(grammarAccess.getLinkStateAccess().getFreeLinkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FreeLink_1=ruleFreeLink();

                    state._fsp--;


                    			current = this_FreeLink_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalReactionRules.g:633:3: this_ExactLink_2= ruleExactLink
                    {

                    			newCompositeNode(grammarAccess.getLinkStateAccess().getExactLinkParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExactLink_2=ruleExactLink();

                    state._fsp--;


                    			current = this_ExactLink_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalReactionRules.g:642:3: this_LimitLink_3= ruleLimitLink
                    {

                    			newCompositeNode(grammarAccess.getLinkStateAccess().getLimitLinkParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LimitLink_3=ruleLimitLink();

                    state._fsp--;


                    			current = this_LimitLink_3;
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
    // $ANTLR end "ruleLinkState"


    // $ANTLR start "entryRuleSemiLink"
    // InternalReactionRules.g:654:1: entryRuleSemiLink returns [EObject current=null] : iv_ruleSemiLink= ruleSemiLink EOF ;
    public final EObject entryRuleSemiLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemiLink = null;


        try {
            // InternalReactionRules.g:654:49: (iv_ruleSemiLink= ruleSemiLink EOF )
            // InternalReactionRules.g:655:2: iv_ruleSemiLink= ruleSemiLink EOF
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
    // InternalReactionRules.g:661:1: ruleSemiLink returns [EObject current=null] : ( () otherlv_1= 'Semi-Link' ) ;
    public final EObject ruleSemiLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalReactionRules.g:667:2: ( ( () otherlv_1= 'Semi-Link' ) )
            // InternalReactionRules.g:668:2: ( () otherlv_1= 'Semi-Link' )
            {
            // InternalReactionRules.g:668:2: ( () otherlv_1= 'Semi-Link' )
            // InternalReactionRules.g:669:3: () otherlv_1= 'Semi-Link'
            {
            // InternalReactionRules.g:669:3: ()
            // InternalReactionRules.g:670:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSemiLinkAccess().getSemiLinkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSemiLinkAccess().getSemiLinkKeyword_1());
            		

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
    // InternalReactionRules.g:684:1: entryRuleFreeLink returns [EObject current=null] : iv_ruleFreeLink= ruleFreeLink EOF ;
    public final EObject entryRuleFreeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeLink = null;


        try {
            // InternalReactionRules.g:684:49: (iv_ruleFreeLink= ruleFreeLink EOF )
            // InternalReactionRules.g:685:2: iv_ruleFreeLink= ruleFreeLink EOF
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
    // InternalReactionRules.g:691:1: ruleFreeLink returns [EObject current=null] : ( () otherlv_1= 'Free' ) ;
    public final EObject ruleFreeLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalReactionRules.g:697:2: ( ( () otherlv_1= 'Free' ) )
            // InternalReactionRules.g:698:2: ( () otherlv_1= 'Free' )
            {
            // InternalReactionRules.g:698:2: ( () otherlv_1= 'Free' )
            // InternalReactionRules.g:699:3: () otherlv_1= 'Free'
            {
            // InternalReactionRules.g:699:3: ()
            // InternalReactionRules.g:700:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFreeLinkAccess().getFreeLinkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFreeLinkAccess().getFreeKeyword_1());
            		

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


    // $ANTLR start "entryRuleLimitLink"
    // InternalReactionRules.g:714:1: entryRuleLimitLink returns [EObject current=null] : iv_ruleLimitLink= ruleLimitLink EOF ;
    public final EObject entryRuleLimitLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimitLink = null;


        try {
            // InternalReactionRules.g:714:50: (iv_ruleLimitLink= ruleLimitLink EOF )
            // InternalReactionRules.g:715:2: iv_ruleLimitLink= ruleLimitLink EOF
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
    // InternalReactionRules.g:721:1: ruleLimitLink returns [EObject current=null] : ( () ( (lv_state_1_0= ruleBigInteger ) ) ) ;
    public final EObject ruleLimitLink() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_state_1_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:727:2: ( ( () ( (lv_state_1_0= ruleBigInteger ) ) ) )
            // InternalReactionRules.g:728:2: ( () ( (lv_state_1_0= ruleBigInteger ) ) )
            {
            // InternalReactionRules.g:728:2: ( () ( (lv_state_1_0= ruleBigInteger ) ) )
            // InternalReactionRules.g:729:3: () ( (lv_state_1_0= ruleBigInteger ) )
            {
            // InternalReactionRules.g:729:3: ()
            // InternalReactionRules.g:730:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLimitLinkAccess().getLimitLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:736:3: ( (lv_state_1_0= ruleBigInteger ) )
            // InternalReactionRules.g:737:4: (lv_state_1_0= ruleBigInteger )
            {
            // InternalReactionRules.g:737:4: (lv_state_1_0= ruleBigInteger )
            // InternalReactionRules.g:738:5: lv_state_1_0= ruleBigInteger
            {

            					newCompositeNode(grammarAccess.getLimitLinkAccess().getStateBigIntegerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_state_1_0=ruleBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitLinkRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_1_0,
            						"biochemsimulation.reactionrules.ReactionRules.BigInteger");
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


    // $ANTLR start "entryRuleExactLink"
    // InternalReactionRules.g:759:1: entryRuleExactLink returns [EObject current=null] : iv_ruleExactLink= ruleExactLink EOF ;
    public final EObject entryRuleExactLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactLink = null;


        try {
            // InternalReactionRules.g:759:50: (iv_ruleExactLink= ruleExactLink EOF )
            // InternalReactionRules.g:760:2: iv_ruleExactLink= ruleExactLink EOF
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
    // InternalReactionRules.g:766:1: ruleExactLink returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleExactLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalReactionRules.g:772:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalReactionRules.g:773:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalReactionRules.g:773:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            // InternalReactionRules.g:774:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            {
            // InternalReactionRules.g:774:3: ()
            // InternalReactionRules.g:775:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExactLinkAccess().getExactLinkAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:781:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:782:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:782:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:783:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExactLinkRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getExactLinkAccess().getSiteSiteCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getExactLinkAccess().getFullStopKeyword_2());
            		
            // InternalReactionRules.g:798:3: ( (otherlv_3= RULE_ID ) )
            // InternalReactionRules.g:799:4: (otherlv_3= RULE_ID )
            {
            // InternalReactionRules.g:799:4: (otherlv_3= RULE_ID )
            // InternalReactionRules.g:800:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExactLinkRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getExactLinkAccess().getAgentAgentCrossReference_3_0());
            				

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


    // $ANTLR start "entryRuleSitePattern"
    // InternalReactionRules.g:815:1: entryRuleSitePattern returns [EObject current=null] : iv_ruleSitePattern= ruleSitePattern EOF ;
    public final EObject entryRuleSitePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSitePattern = null;


        try {
            // InternalReactionRules.g:815:52: (iv_ruleSitePattern= ruleSitePattern EOF )
            // InternalReactionRules.g:816:2: iv_ruleSitePattern= ruleSitePattern EOF
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
    // InternalReactionRules.g:822:1: ruleSitePattern returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )? (otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']' )? ) ;
    public final EObject ruleSitePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_linkState_6_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:828:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )? (otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']' )? ) )
            // InternalReactionRules.g:829:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )? (otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']' )? )
            {
            // InternalReactionRules.g:829:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )? (otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']' )? )
            // InternalReactionRules.g:830:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )? (otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']' )?
            {
            // InternalReactionRules.g:830:3: ()
            // InternalReactionRules.g:831:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSitePatternAccess().getSitePatternAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:837:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:838:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:838:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:839:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSitePatternRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_1, grammarAccess.getSitePatternAccess().getSiteSiteCrossReference_1_0());
            				

            }


            }

            // InternalReactionRules.g:850:3: (otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalReactionRules.g:851:4: otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getSitePatternAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalReactionRules.g:855:4: ( (otherlv_3= RULE_ID ) )
                    // InternalReactionRules.g:856:5: (otherlv_3= RULE_ID )
                    {
                    // InternalReactionRules.g:856:5: (otherlv_3= RULE_ID )
                    // InternalReactionRules.g:857:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSitePatternRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_3, grammarAccess.getSitePatternAccess().getStateStateCrossReference_2_1_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getSitePatternAccess().getRightCurlyBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalReactionRules.g:873:3: (otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalReactionRules.g:874:4: otherlv_5= '[' ( (lv_linkState_6_0= ruleLinkState ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getSitePatternAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalReactionRules.g:878:4: ( (lv_linkState_6_0= ruleLinkState ) )
                    // InternalReactionRules.g:879:5: (lv_linkState_6_0= ruleLinkState )
                    {
                    // InternalReactionRules.g:879:5: (lv_linkState_6_0= ruleLinkState )
                    // InternalReactionRules.g:880:6: lv_linkState_6_0= ruleLinkState
                    {

                    						newCompositeNode(grammarAccess.getSitePatternAccess().getLinkStateLinkStateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    otherlv_7=(Token)match(input,23,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAgentPattern"
    // InternalReactionRules.g:906:1: entryRuleAgentPattern returns [EObject current=null] : iv_ruleAgentPattern= ruleAgentPattern EOF ;
    public final EObject entryRuleAgentPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgentPattern = null;


        try {
            // InternalReactionRules.g:906:53: (iv_ruleAgentPattern= ruleAgentPattern EOF )
            // InternalReactionRules.g:907:2: iv_ruleAgentPattern= ruleAgentPattern EOF
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
    // InternalReactionRules.g:913:1: ruleAgentPattern returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_sitePatterns_3_0= ruleSitePattern ) ) (otherlv_4= ',' ( (lv_sitePatterns_5_0= ruleSitePattern ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleAgentPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_sitePatterns_3_0 = null;

        EObject lv_sitePatterns_5_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:919:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_sitePatterns_3_0= ruleSitePattern ) ) (otherlv_4= ',' ( (lv_sitePatterns_5_0= ruleSitePattern ) ) )* )? otherlv_6= ')' ) )
            // InternalReactionRules.g:920:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_sitePatterns_3_0= ruleSitePattern ) ) (otherlv_4= ',' ( (lv_sitePatterns_5_0= ruleSitePattern ) ) )* )? otherlv_6= ')' )
            {
            // InternalReactionRules.g:920:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_sitePatterns_3_0= ruleSitePattern ) ) (otherlv_4= ',' ( (lv_sitePatterns_5_0= ruleSitePattern ) ) )* )? otherlv_6= ')' )
            // InternalReactionRules.g:921:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_sitePatterns_3_0= ruleSitePattern ) ) (otherlv_4= ',' ( (lv_sitePatterns_5_0= ruleSitePattern ) ) )* )? otherlv_6= ')'
            {
            // InternalReactionRules.g:921:3: ()
            // InternalReactionRules.g:922:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAgentPatternAccess().getAgentPatternAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:928:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionRules.g:929:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionRules.g:929:4: (otherlv_1= RULE_ID )
            // InternalReactionRules.g:930:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgentPatternRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_1, grammarAccess.getAgentPatternAccess().getAgentAgentCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getAgentPatternAccess().getLeftParenthesisKeyword_2());
            		
            // InternalReactionRules.g:945:3: ( ( (lv_sitePatterns_3_0= ruleSitePattern ) ) (otherlv_4= ',' ( (lv_sitePatterns_5_0= ruleSitePattern ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalReactionRules.g:946:4: ( (lv_sitePatterns_3_0= ruleSitePattern ) ) (otherlv_4= ',' ( (lv_sitePatterns_5_0= ruleSitePattern ) ) )*
                    {
                    // InternalReactionRules.g:946:4: ( (lv_sitePatterns_3_0= ruleSitePattern ) )
                    // InternalReactionRules.g:947:5: (lv_sitePatterns_3_0= ruleSitePattern )
                    {
                    // InternalReactionRules.g:947:5: (lv_sitePatterns_3_0= ruleSitePattern )
                    // InternalReactionRules.g:948:6: lv_sitePatterns_3_0= ruleSitePattern
                    {

                    						newCompositeNode(grammarAccess.getAgentPatternAccess().getSitePatternsSitePatternParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_sitePatterns_3_0=ruleSitePattern();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAgentPatternRule());
                    						}
                    						add(
                    							current,
                    							"sitePatterns",
                    							lv_sitePatterns_3_0,
                    							"biochemsimulation.reactionrules.ReactionRules.SitePattern");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReactionRules.g:965:4: (otherlv_4= ',' ( (lv_sitePatterns_5_0= ruleSitePattern ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==13) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalReactionRules.g:966:5: otherlv_4= ',' ( (lv_sitePatterns_5_0= ruleSitePattern ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAgentPatternAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalReactionRules.g:970:5: ( (lv_sitePatterns_5_0= ruleSitePattern ) )
                    	    // InternalReactionRules.g:971:6: (lv_sitePatterns_5_0= ruleSitePattern )
                    	    {
                    	    // InternalReactionRules.g:971:6: (lv_sitePatterns_5_0= ruleSitePattern )
                    	    // InternalReactionRules.g:972:7: lv_sitePatterns_5_0= ruleSitePattern
                    	    {

                    	    							newCompositeNode(grammarAccess.getAgentPatternAccess().getSitePatternsSitePatternParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_sitePatterns_5_0=ruleSitePattern();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAgentPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sitePatterns",
                    	    								lv_sitePatterns_5_0,
                    	    								"biochemsimulation.reactionrules.ReactionRules.SitePattern");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAgentPatternAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalReactionRules.g:999:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalReactionRules.g:999:48: (iv_rulePattern= rulePattern EOF )
            // InternalReactionRules.g:1000:2: iv_rulePattern= rulePattern EOF
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
    // InternalReactionRules.g:1006:1: rulePattern returns [EObject current=null] : ( () ( ( (lv_agentPatterns_1_0= ruleAgentPattern ) ) (otherlv_2= ',' ( (lv_agentPatterns_3_0= ruleAgentPattern ) ) )* )? ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_agentPatterns_1_0 = null;

        EObject lv_agentPatterns_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1012:2: ( ( () ( ( (lv_agentPatterns_1_0= ruleAgentPattern ) ) (otherlv_2= ',' ( (lv_agentPatterns_3_0= ruleAgentPattern ) ) )* )? ) )
            // InternalReactionRules.g:1013:2: ( () ( ( (lv_agentPatterns_1_0= ruleAgentPattern ) ) (otherlv_2= ',' ( (lv_agentPatterns_3_0= ruleAgentPattern ) ) )* )? )
            {
            // InternalReactionRules.g:1013:2: ( () ( ( (lv_agentPatterns_1_0= ruleAgentPattern ) ) (otherlv_2= ',' ( (lv_agentPatterns_3_0= ruleAgentPattern ) ) )* )? )
            // InternalReactionRules.g:1014:3: () ( ( (lv_agentPatterns_1_0= ruleAgentPattern ) ) (otherlv_2= ',' ( (lv_agentPatterns_3_0= ruleAgentPattern ) ) )* )?
            {
            // InternalReactionRules.g:1014:3: ()
            // InternalReactionRules.g:1015:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternAccess().getPatternAction_0(),
            					current);
            			

            }

            // InternalReactionRules.g:1021:3: ( ( (lv_agentPatterns_1_0= ruleAgentPattern ) ) (otherlv_2= ',' ( (lv_agentPatterns_3_0= ruleAgentPattern ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalReactionRules.g:1022:4: ( (lv_agentPatterns_1_0= ruleAgentPattern ) ) (otherlv_2= ',' ( (lv_agentPatterns_3_0= ruleAgentPattern ) ) )*
                    {
                    // InternalReactionRules.g:1022:4: ( (lv_agentPatterns_1_0= ruleAgentPattern ) )
                    // InternalReactionRules.g:1023:5: (lv_agentPatterns_1_0= ruleAgentPattern )
                    {
                    // InternalReactionRules.g:1023:5: (lv_agentPatterns_1_0= ruleAgentPattern )
                    // InternalReactionRules.g:1024:6: lv_agentPatterns_1_0= ruleAgentPattern
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getAgentPatternsAgentPatternParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_agentPatterns_1_0=ruleAgentPattern();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						add(
                    							current,
                    							"agentPatterns",
                    							lv_agentPatterns_1_0,
                    							"biochemsimulation.reactionrules.ReactionRules.AgentPattern");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReactionRules.g:1041:4: (otherlv_2= ',' ( (lv_agentPatterns_3_0= ruleAgentPattern ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==13) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalReactionRules.g:1042:5: otherlv_2= ',' ( (lv_agentPatterns_3_0= ruleAgentPattern ) )
                    	    {
                    	    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalReactionRules.g:1046:5: ( (lv_agentPatterns_3_0= ruleAgentPattern ) )
                    	    // InternalReactionRules.g:1047:6: (lv_agentPatterns_3_0= ruleAgentPattern )
                    	    {
                    	    // InternalReactionRules.g:1047:6: (lv_agentPatterns_3_0= ruleAgentPattern )
                    	    // InternalReactionRules.g:1048:7: lv_agentPatterns_3_0= ruleAgentPattern
                    	    {

                    	    							newCompositeNode(grammarAccess.getPatternAccess().getAgentPatternsAgentPatternParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_agentPatterns_3_0=ruleAgentPattern();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"agentPatterns",
                    	    								lv_agentPatterns_3_0,
                    	    								"biochemsimulation.reactionrules.ReactionRules.AgentPattern");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleObservation"
    // InternalReactionRules.g:1071:1: entryRuleObservation returns [EObject current=null] : iv_ruleObservation= ruleObservation EOF ;
    public final EObject entryRuleObservation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObservation = null;


        try {
            // InternalReactionRules.g:1071:52: (iv_ruleObservation= ruleObservation EOF )
            // InternalReactionRules.g:1072:2: iv_ruleObservation= ruleObservation EOF
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
    // InternalReactionRules.g:1078:1: ruleObservation returns [EObject current=null] : (otherlv_0= 'Observation' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePattern ) ) ) ;
    public final EObject ruleObservation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_observationPattern_2_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1084:2: ( (otherlv_0= 'Observation' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePattern ) ) ) )
            // InternalReactionRules.g:1085:2: (otherlv_0= 'Observation' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePattern ) ) )
            {
            // InternalReactionRules.g:1085:2: (otherlv_0= 'Observation' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePattern ) ) )
            // InternalReactionRules.g:1086:3: otherlv_0= 'Observation' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observationPattern_2_0= rulePattern ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getObservationAccess().getObservationKeyword_0());
            		
            // InternalReactionRules.g:1090:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:1091:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:1091:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:1092:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            // InternalReactionRules.g:1108:3: ( (lv_observationPattern_2_0= rulePattern ) )
            // InternalReactionRules.g:1109:4: (lv_observationPattern_2_0= rulePattern )
            {
            // InternalReactionRules.g:1109:4: (lv_observationPattern_2_0= rulePattern )
            // InternalReactionRules.g:1110:5: lv_observationPattern_2_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getObservationAccess().getObservationPatternPatternParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_observationPattern_2_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObservationRule());
            					}
            					set(
            						current,
            						"observationPattern",
            						lv_observationPattern_2_0,
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
    // $ANTLR end "ruleObservation"


    // $ANTLR start "entryRuleInitial"
    // InternalReactionRules.g:1131:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalReactionRules.g:1131:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalReactionRules.g:1132:2: iv_ruleInitial= ruleInitial EOF
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
    // InternalReactionRules.g:1138:1: ruleInitial returns [EObject current=null] : (otherlv_0= 'Initial' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleBigInteger ) ) ( (lv_initialPattern_3_0= rulePattern ) ) ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_count_2_0 = null;

        EObject lv_initialPattern_3_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1144:2: ( (otherlv_0= 'Initial' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleBigInteger ) ) ( (lv_initialPattern_3_0= rulePattern ) ) ) )
            // InternalReactionRules.g:1145:2: (otherlv_0= 'Initial' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleBigInteger ) ) ( (lv_initialPattern_3_0= rulePattern ) ) )
            {
            // InternalReactionRules.g:1145:2: (otherlv_0= 'Initial' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleBigInteger ) ) ( (lv_initialPattern_3_0= rulePattern ) ) )
            // InternalReactionRules.g:1146:3: otherlv_0= 'Initial' ( (lv_name_1_0= RULE_ID ) ) ( (lv_count_2_0= ruleBigInteger ) ) ( (lv_initialPattern_3_0= rulePattern ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialAccess().getInitialKeyword_0());
            		
            // InternalReactionRules.g:1150:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:1151:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:1151:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:1152:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            // InternalReactionRules.g:1168:3: ( (lv_count_2_0= ruleBigInteger ) )
            // InternalReactionRules.g:1169:4: (lv_count_2_0= ruleBigInteger )
            {
            // InternalReactionRules.g:1169:4: (lv_count_2_0= ruleBigInteger )
            // InternalReactionRules.g:1170:5: lv_count_2_0= ruleBigInteger
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getCountBigIntegerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_count_2_0=ruleBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					set(
            						current,
            						"count",
            						lv_count_2_0,
            						"biochemsimulation.reactionrules.ReactionRules.BigInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionRules.g:1187:3: ( (lv_initialPattern_3_0= rulePattern ) )
            // InternalReactionRules.g:1188:4: (lv_initialPattern_3_0= rulePattern )
            {
            // InternalReactionRules.g:1188:4: (lv_initialPattern_3_0= rulePattern )
            // InternalReactionRules.g:1189:5: lv_initialPattern_3_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getInitialPatternPatternParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_initialPattern_3_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					set(
            						current,
            						"initialPattern",
            						lv_initialPattern_3_0,
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
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleRule"
    // InternalReactionRules.g:1210:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalReactionRules.g:1210:45: (iv_ruleRule= ruleRule EOF )
            // InternalReactionRules.g:1211:2: iv_ruleRule= ruleRule EOF
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
    // InternalReactionRules.g:1217:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_lhs_2_0= rulePattern ) ) (otherlv_3= 'uni' | otherlv_4= 'bi' ) ( (lv_rhs_5_0= rulePattern ) ) otherlv_6= 'at' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_lhs_2_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalReactionRules.g:1223:2: ( (otherlv_0= 'Rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_lhs_2_0= rulePattern ) ) (otherlv_3= 'uni' | otherlv_4= 'bi' ) ( (lv_rhs_5_0= rulePattern ) ) otherlv_6= 'at' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) )
            // InternalReactionRules.g:1224:2: (otherlv_0= 'Rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_lhs_2_0= rulePattern ) ) (otherlv_3= 'uni' | otherlv_4= 'bi' ) ( (lv_rhs_5_0= rulePattern ) ) otherlv_6= 'at' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )
            {
            // InternalReactionRules.g:1224:2: (otherlv_0= 'Rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_lhs_2_0= rulePattern ) ) (otherlv_3= 'uni' | otherlv_4= 'bi' ) ( (lv_rhs_5_0= rulePattern ) ) otherlv_6= 'at' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )
            // InternalReactionRules.g:1225:3: otherlv_0= 'Rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_lhs_2_0= rulePattern ) ) (otherlv_3= 'uni' | otherlv_4= 'bi' ) ( (lv_rhs_5_0= rulePattern ) ) otherlv_6= 'at' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalReactionRules.g:1229:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionRules.g:1230:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionRules.g:1230:4: (lv_name_1_0= RULE_ID )
            // InternalReactionRules.g:1231:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalReactionRules.g:1247:3: ( (lv_lhs_2_0= rulePattern ) )
            // InternalReactionRules.g:1248:4: (lv_lhs_2_0= rulePattern )
            {
            // InternalReactionRules.g:1248:4: (lv_lhs_2_0= rulePattern )
            // InternalReactionRules.g:1249:5: lv_lhs_2_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getLhsPatternParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_lhs_2_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_2_0,
            						"biochemsimulation.reactionrules.ReactionRules.Pattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionRules.g:1266:3: (otherlv_3= 'uni' | otherlv_4= 'bi' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            else if ( (LA14_0==28) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalReactionRules.g:1267:4: otherlv_3= 'uni'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getUniKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:1272:4: otherlv_4= 'bi'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getBiKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalReactionRules.g:1277:3: ( (lv_rhs_5_0= rulePattern ) )
            // InternalReactionRules.g:1278:4: (lv_rhs_5_0= rulePattern )
            {
            // InternalReactionRules.g:1278:4: (lv_rhs_5_0= rulePattern )
            // InternalReactionRules.g:1279:5: lv_rhs_5_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getRhsPatternParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_rhs_5_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"rhs",
            						lv_rhs_5_0,
            						"biochemsimulation.reactionrules.ReactionRules.Pattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getAtKeyword_5());
            		
            // InternalReactionRules.g:1300:3: ( (otherlv_7= RULE_ID ) )
            // InternalReactionRules.g:1301:4: (otherlv_7= RULE_ID )
            {
            // InternalReactionRules.g:1301:4: (otherlv_7= RULE_ID )
            // InternalReactionRules.g:1302:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getVariablesVariableCrossReference_6_0());
            				

            }


            }

            // InternalReactionRules.g:1313:3: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalReactionRules.g:1314:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalReactionRules.g:1318:4: ( (otherlv_9= RULE_ID ) )
            	    // InternalReactionRules.g:1319:5: (otherlv_9= RULE_ID )
            	    {
            	    // InternalReactionRules.g:1319:5: (otherlv_9= RULE_ID )
            	    // InternalReactionRules.g:1320:6: otherlv_9= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRuleRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    						newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getVariablesVariableCrossReference_7_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleRule"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000007060002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000401002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000018000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});

}