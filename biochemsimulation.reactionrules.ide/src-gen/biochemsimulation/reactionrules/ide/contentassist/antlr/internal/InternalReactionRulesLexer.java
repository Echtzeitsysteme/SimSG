package biochemsimulation.reactionrules.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReactionRulesLexer extends Lexer {
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

    public InternalReactionRulesLexer() {;} 
    public InternalReactionRulesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalReactionRulesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalReactionRules.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:11:7: ( '-' )
            // InternalReactionRules.g:11:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:12:7: ( '+' )
            // InternalReactionRules.g:12:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:13:7: ( 'URI' )
            // InternalReactionRules.g:13:9: 'URI'
            {
            match("URI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:14:7: ( 'PATH' )
            // InternalReactionRules.g:14:9: 'PATH'
            {
            match("PATH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:15:7: ( 'ModelID' )
            // InternalReactionRules.g:15:9: 'ModelID'
            {
            match("ModelID"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:16:7: ( 'AgentInstance' )
            // InternalReactionRules.g:16:9: 'AgentInstance'
            {
            match("AgentInstance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:17:7: ( '.' )
            // InternalReactionRules.g:17:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:18:7: ( '{' )
            // InternalReactionRules.g:18:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:19:7: ( '}' )
            // InternalReactionRules.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:20:7: ( ',' )
            // InternalReactionRules.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:21:7: ( '(' )
            // InternalReactionRules.g:21:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:22:7: ( ')' )
            // InternalReactionRules.g:22:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:23:7: ( 'agent' )
            // InternalReactionRules.g:23:9: 'agent'
            {
            match("agent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:24:7: ( 'var' )
            // InternalReactionRules.g:24:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:25:7: ( '=' )
            // InternalReactionRules.g:25:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:26:7: ( '[' )
            // InternalReactionRules.g:26:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:27:7: ( ']' )
            // InternalReactionRules.g:27:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:28:7: ( 'obs' )
            // InternalReactionRules.g:28:9: 'obs'
            {
            match("obs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:29:7: ( 'init' )
            // InternalReactionRules.g:29:9: 'init'
            {
            match("init"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:30:7: ( 'rule' )
            // InternalReactionRules.g:30:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "RULE_AT"
    public final void mRULE_AT() throws RecognitionException {
        try {
            int _type = RULE_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:6611:9: ( '@' )
            // InternalReactionRules.g:6611:11: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT"

    // $ANTLR start "RULE_BI"
    public final void mRULE_BI() throws RecognitionException {
        try {
            int _type = RULE_BI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:6613:9: ( '<->' )
            // InternalReactionRules.g:6613:11: '<->'
            {
            match("<->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BI"

    // $ANTLR start "RULE_UNI"
    public final void mRULE_UNI() throws RecognitionException {
        try {
            int _type = RULE_UNI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:6615:10: ( '->' )
            // InternalReactionRules.g:6615:12: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNI"

    // $ANTLR start "RULE_VOID_PATTERN"
    public final void mRULE_VOID_PATTERN() throws RecognitionException {
        try {
            int _type = RULE_VOID_PATTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:6617:19: ( 'void' )
            // InternalReactionRules.g:6617:21: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VOID_PATTERN"

    // $ANTLR start "RULE_SEMI_LINK"
    public final void mRULE_SEMI_LINK() throws RecognitionException {
        try {
            int _type = RULE_SEMI_LINK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:6619:16: ( 'semi' )
            // InternalReactionRules.g:6619:18: 'semi'
            {
            match("semi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMI_LINK"

    // $ANTLR start "RULE_FREE_LINK"
    public final void mRULE_FREE_LINK() throws RecognitionException {
        try {
            int _type = RULE_FREE_LINK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:6621:16: ( 'free' )
            // InternalReactionRules.g:6621:18: 'free'
            {
            match("free"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FREE_LINK"

    // $ANTLR start "RULE_WHATEVER_LINK"
    public final void mRULE_WHATEVER_LINK() throws RecognitionException {
        try {
            int _type = RULE_WHATEVER_LINK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:6623:20: ( '?' )
            // InternalReactionRules.g:6623:22: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHATEVER_LINK"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            int _type = RULE_EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:6625:15: ( 'E' )
            // InternalReactionRules.g:6625:17: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:6627:10: ( '0' .. '9' ( '0' .. '9' )* )
            // InternalReactionRules.g:6627:12: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // InternalReactionRules.g:6627:21: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReactionRules.g:6627:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:6629:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalReactionRules.g:6629:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalReactionRules.g:6629:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalReactionRules.g:6629:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalReactionRules.g:6629:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalReactionRules.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:6631:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalReactionRules.g:6631:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalReactionRules.g:6631:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalReactionRules.g:6631:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalReactionRules.g:6631:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalReactionRules.g:6631:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalReactionRules.g:6631:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:6631:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalReactionRules.g:6631:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalReactionRules.g:6631:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalReactionRules.g:6631:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:6633:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalReactionRules.g:6633:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalReactionRules.g:6633:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalReactionRules.g:6633:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:6635:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalReactionRules.g:6635:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalReactionRules.g:6635:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalReactionRules.g:6635:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalReactionRules.g:6635:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalReactionRules.g:6635:41: ( '\\r' )? '\\n'
                    {
                    // InternalReactionRules.g:6635:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalReactionRules.g:6635:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:6637:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalReactionRules.g:6637:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalReactionRules.g:6637:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalReactionRules.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:6639:16: ( . )
            // InternalReactionRules.g:6639:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalReactionRules.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_AT | RULE_BI | RULE_UNI | RULE_VOID_PATTERN | RULE_SEMI_LINK | RULE_FREE_LINK | RULE_WHATEVER_LINK | RULE_EXPONENT | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=35;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalReactionRules.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // InternalReactionRules.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // InternalReactionRules.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // InternalReactionRules.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // InternalReactionRules.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // InternalReactionRules.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // InternalReactionRules.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // InternalReactionRules.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // InternalReactionRules.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // InternalReactionRules.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // InternalReactionRules.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // InternalReactionRules.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // InternalReactionRules.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // InternalReactionRules.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // InternalReactionRules.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // InternalReactionRules.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // InternalReactionRules.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // InternalReactionRules.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // InternalReactionRules.g:1:118: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // InternalReactionRules.g:1:124: T__38
                {
                mT__38(); 

                }
                break;
            case 21 :
                // InternalReactionRules.g:1:130: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 22 :
                // InternalReactionRules.g:1:138: RULE_BI
                {
                mRULE_BI(); 

                }
                break;
            case 23 :
                // InternalReactionRules.g:1:146: RULE_UNI
                {
                mRULE_UNI(); 

                }
                break;
            case 24 :
                // InternalReactionRules.g:1:155: RULE_VOID_PATTERN
                {
                mRULE_VOID_PATTERN(); 

                }
                break;
            case 25 :
                // InternalReactionRules.g:1:173: RULE_SEMI_LINK
                {
                mRULE_SEMI_LINK(); 

                }
                break;
            case 26 :
                // InternalReactionRules.g:1:188: RULE_FREE_LINK
                {
                mRULE_FREE_LINK(); 

                }
                break;
            case 27 :
                // InternalReactionRules.g:1:203: RULE_WHATEVER_LINK
                {
                mRULE_WHATEVER_LINK(); 

                }
                break;
            case 28 :
                // InternalReactionRules.g:1:222: RULE_EXPONENT
                {
                mRULE_EXPONENT(); 

                }
                break;
            case 29 :
                // InternalReactionRules.g:1:236: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 30 :
                // InternalReactionRules.g:1:245: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // InternalReactionRules.g:1:253: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // InternalReactionRules.g:1:265: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 33 :
                // InternalReactionRules.g:1:281: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 34 :
                // InternalReactionRules.g:1:297: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // InternalReactionRules.g:1:305: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\44\1\uffff\4\47\6\uffff\2\47\3\uffff\3\47\1\uffff\1\42\2\47\1\uffff\1\77\1\uffff\1\42\1\uffff\3\42\5\uffff\1\47\1\uffff\3\47\6\uffff\3\47\3\uffff\3\47\2\uffff\2\47\7\uffff\1\121\4\47\1\126\1\47\1\130\4\47\1\uffff\1\135\3\47\1\uffff\1\141\1\uffff\1\142\1\143\1\144\1\145\1\uffff\2\47\1\150\5\uffff\2\47\1\uffff\1\153\1\47\1\uffff\5\47\1\162\1\uffff";
    static final String DFA12_eofS =
        "\163\uffff";
    static final String DFA12_minS =
        "\1\0\1\76\1\uffff\1\122\1\101\1\157\1\147\6\uffff\1\147\1\141\3\uffff\1\142\1\156\1\165\1\uffff\1\55\1\145\1\162\1\uffff\1\60\1\uffff\1\101\1\uffff\2\0\1\52\5\uffff\1\111\1\uffff\1\124\1\144\1\145\6\uffff\1\145\1\162\1\151\3\uffff\1\163\1\151\1\154\2\uffff\1\155\1\145\7\uffff\1\60\1\110\1\145\2\156\1\60\1\144\1\60\1\164\1\145\1\151\1\145\1\uffff\1\60\1\154\2\164\1\uffff\1\60\1\uffff\4\60\1\uffff\2\111\1\60\5\uffff\1\104\1\156\1\uffff\1\60\1\163\1\uffff\1\164\1\141\1\156\1\143\1\145\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\76\1\uffff\1\122\1\101\1\157\1\147\6\uffff\1\147\1\157\3\uffff\1\142\1\156\1\165\1\uffff\1\55\1\145\1\162\1\uffff\1\172\1\uffff\1\172\1\uffff\2\uffff\1\57\5\uffff\1\111\1\uffff\1\124\1\144\1\145\6\uffff\1\145\1\162\1\151\3\uffff\1\163\1\151\1\154\2\uffff\1\155\1\145\7\uffff\1\172\1\110\1\145\2\156\1\172\1\144\1\172\1\164\1\145\1\151\1\145\1\uffff\1\172\1\154\2\164\1\uffff\1\172\1\uffff\4\172\1\uffff\2\111\1\172\5\uffff\1\104\1\156\1\uffff\1\172\1\163\1\uffff\1\164\1\141\1\156\1\143\1\145\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\4\uffff\1\7\1\10\1\11\1\12\1\13\1\14\2\uffff\1\17\1\20\1\21\3\uffff\1\25\3\uffff\1\33\1\uffff\1\35\1\uffff\1\36\3\uffff\1\42\1\43\1\27\1\1\1\2\1\uffff\1\36\3\uffff\1\7\1\10\1\11\1\12\1\13\1\14\3\uffff\1\17\1\20\1\21\3\uffff\1\25\1\26\2\uffff\1\33\1\34\1\35\1\37\1\40\1\41\1\42\14\uffff\1\3\4\uffff\1\16\1\uffff\1\22\4\uffff\1\4\3\uffff\1\30\1\23\1\24\1\31\1\32\2\uffff\1\15\2\uffff\1\5\6\uffff\1\6";
    static final String DFA12_specialS =
        "\1\0\35\uffff\1\2\1\1\123\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\42\1\36\4\42\1\37\1\13\1\14\1\42\1\2\1\12\1\1\1\7\1\40\12\33\2\42\1\26\1\17\1\42\1\31\1\25\1\6\3\35\1\32\7\35\1\5\2\35\1\4\4\35\1\3\5\35\1\20\1\42\1\21\1\34\1\35\1\42\1\15\4\35\1\30\2\35\1\23\5\35\1\22\2\35\1\24\1\27\2\35\1\16\4\35\1\10\1\42\1\11\uff82\42",
            "\1\43",
            "",
            "\1\46",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\61",
            "\1\62\15\uffff\1\63",
            "",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\0\101",
            "\0\101",
            "\1\102\4\uffff\1\103",
            "",
            "",
            "",
            "",
            "",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "",
            "\1\117",
            "\1\120",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\127",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\146",
            "\1\147",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "",
            "\1\151",
            "\1\152",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_AT | RULE_BI | RULE_UNI | RULE_VOID_PATTERN | RULE_SEMI_LINK | RULE_FREE_LINK | RULE_WHATEVER_LINK | RULE_EXPONENT | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='-') ) {s = 1;}

                        else if ( (LA12_0=='+') ) {s = 2;}

                        else if ( (LA12_0=='U') ) {s = 3;}

                        else if ( (LA12_0=='P') ) {s = 4;}

                        else if ( (LA12_0=='M') ) {s = 5;}

                        else if ( (LA12_0=='A') ) {s = 6;}

                        else if ( (LA12_0=='.') ) {s = 7;}

                        else if ( (LA12_0=='{') ) {s = 8;}

                        else if ( (LA12_0=='}') ) {s = 9;}

                        else if ( (LA12_0==',') ) {s = 10;}

                        else if ( (LA12_0=='(') ) {s = 11;}

                        else if ( (LA12_0==')') ) {s = 12;}

                        else if ( (LA12_0=='a') ) {s = 13;}

                        else if ( (LA12_0=='v') ) {s = 14;}

                        else if ( (LA12_0=='=') ) {s = 15;}

                        else if ( (LA12_0=='[') ) {s = 16;}

                        else if ( (LA12_0==']') ) {s = 17;}

                        else if ( (LA12_0=='o') ) {s = 18;}

                        else if ( (LA12_0=='i') ) {s = 19;}

                        else if ( (LA12_0=='r') ) {s = 20;}

                        else if ( (LA12_0=='@') ) {s = 21;}

                        else if ( (LA12_0=='<') ) {s = 22;}

                        else if ( (LA12_0=='s') ) {s = 23;}

                        else if ( (LA12_0=='f') ) {s = 24;}

                        else if ( (LA12_0=='?') ) {s = 25;}

                        else if ( (LA12_0=='E') ) {s = 26;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 27;}

                        else if ( (LA12_0=='^') ) {s = 28;}

                        else if ( ((LA12_0>='B' && LA12_0<='D')||(LA12_0>='F' && LA12_0<='L')||(LA12_0>='N' && LA12_0<='O')||(LA12_0>='Q' && LA12_0<='T')||(LA12_0>='V' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='b' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='n')||(LA12_0>='p' && LA12_0<='q')||(LA12_0>='t' && LA12_0<='u')||(LA12_0>='w' && LA12_0<='z')) ) {s = 29;}

                        else if ( (LA12_0=='\"') ) {s = 30;}

                        else if ( (LA12_0=='\'') ) {s = 31;}

                        else if ( (LA12_0=='/') ) {s = 32;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 33;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0=='*'||(LA12_0>=':' && LA12_0<=';')||LA12_0=='>'||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_31 = input.LA(1);

                        s = -1;
                        if ( ((LA12_31>='\u0000' && LA12_31<='\uFFFF')) ) {s = 65;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_30 = input.LA(1);

                        s = -1;
                        if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFF')) ) {s = 65;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}