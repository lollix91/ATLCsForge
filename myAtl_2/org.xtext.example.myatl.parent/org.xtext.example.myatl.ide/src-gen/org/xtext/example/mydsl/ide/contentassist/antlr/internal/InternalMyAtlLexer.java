package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyAtlLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BIG_INT=6;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=8;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=14;
    public static final int RULE_DOCUMENTATION=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=15;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=16;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int RULE_SIMPLE_ID=4;
    public static final int T__83=83;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SINGLE_QUOTED_STRING=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_DOUBLE_QUOTED_STRING=7;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalMyAtlLexer() {;} 
    public InternalMyAtlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyAtlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyAtl.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:11:7: ( 'Tuple' )
            // InternalMyAtl.g:11:9: 'Tuple'
            {
            match("Tuple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:12:7: ( 'Boolean' )
            // InternalMyAtl.g:12:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:13:7: ( 'Integer' )
            // InternalMyAtl.g:13:9: 'Integer'
            {
            match("Integer"); 


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
            // InternalMyAtl.g:14:7: ( 'Real' )
            // InternalMyAtl.g:14:9: 'Real'
            {
            match("Real"); 


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
            // InternalMyAtl.g:15:7: ( 'String' )
            // InternalMyAtl.g:15:9: 'String'
            {
            match("String"); 


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
            // InternalMyAtl.g:16:7: ( 'UnlimitedNatural' )
            // InternalMyAtl.g:16:9: 'UnlimitedNatural'
            {
            match("UnlimitedNatural"); 


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
            // InternalMyAtl.g:17:7: ( 'OclAny' )
            // InternalMyAtl.g:17:9: 'OclAny'
            {
            match("OclAny"); 


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
            // InternalMyAtl.g:18:7: ( 'OclInvalid' )
            // InternalMyAtl.g:18:9: 'OclInvalid'
            {
            match("OclInvalid"); 


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
            // InternalMyAtl.g:19:7: ( 'OclVoid' )
            // InternalMyAtl.g:19:9: 'OclVoid'
            {
            match("OclVoid"); 


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
            // InternalMyAtl.g:20:7: ( 'Set' )
            // InternalMyAtl.g:20:9: 'Set'
            {
            match("Set"); 


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
            // InternalMyAtl.g:21:7: ( 'Bag' )
            // InternalMyAtl.g:21:9: 'Bag'
            {
            match("Bag"); 


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
            // InternalMyAtl.g:22:7: ( 'Sequence' )
            // InternalMyAtl.g:22:9: 'Sequence'
            {
            match("Sequence"); 


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
            // InternalMyAtl.g:23:7: ( 'Collection' )
            // InternalMyAtl.g:23:9: 'Collection'
            {
            match("Collection"); 


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
            // InternalMyAtl.g:24:7: ( 'OrderedSet' )
            // InternalMyAtl.g:24:9: 'OrderedSet'
            {
            match("OrderedSet"); 


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
            // InternalMyAtl.g:25:7: ( '-' )
            // InternalMyAtl.g:25:9: '-'
            {
            match('-'); 

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
            // InternalMyAtl.g:26:7: ( 'not' )
            // InternalMyAtl.g:26:9: 'not'
            {
            match("not"); 


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
            // InternalMyAtl.g:27:7: ( '*' )
            // InternalMyAtl.g:27:9: '*'
            {
            match('*'); 

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
            // InternalMyAtl.g:28:7: ( '/' )
            // InternalMyAtl.g:28:9: '/'
            {
            match('/'); 

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
            // InternalMyAtl.g:29:7: ( '+' )
            // InternalMyAtl.g:29:9: '+'
            {
            match('+'); 

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
            // InternalMyAtl.g:30:7: ( '>' )
            // InternalMyAtl.g:30:9: '>'
            {
            match('>'); 

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
            // InternalMyAtl.g:31:7: ( '<' )
            // InternalMyAtl.g:31:9: '<'
            {
            match('<'); 

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
            // InternalMyAtl.g:32:7: ( '>=' )
            // InternalMyAtl.g:32:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:33:7: ( '<=' )
            // InternalMyAtl.g:33:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:34:7: ( '=' )
            // InternalMyAtl.g:34:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:35:7: ( '<>' )
            // InternalMyAtl.g:35:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:36:7: ( 'and' )
            // InternalMyAtl.g:36:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:37:7: ( 'or' )
            // InternalMyAtl.g:37:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:38:7: ( 'xor' )
            // InternalMyAtl.g:38:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:39:7: ( 'implies' )
            // InternalMyAtl.g:39:9: 'implies'
            {
            match("implies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:40:7: ( '.' )
            // InternalMyAtl.g:40:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:41:7: ( '->' )
            // InternalMyAtl.g:41:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:42:7: ( 'module' )
            // InternalMyAtl.g:42:9: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:43:7: ( ';' )
            // InternalMyAtl.g:43:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:44:7: ( 'create' )
            // InternalMyAtl.g:44:9: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:45:7: ( 'OUT' )
            // InternalMyAtl.g:45:9: 'OUT'
            {
            match("OUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:46:7: ( ':' )
            // InternalMyAtl.g:46:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:47:7: ( 'from' )
            // InternalMyAtl.g:47:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:48:7: ( 'IN' )
            // InternalMyAtl.g:48:9: 'IN'
            {
            match("IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:49:7: ( ',' )
            // InternalMyAtl.g:49:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:50:7: ( 'rule' )
            // InternalMyAtl.g:50:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:51:7: ( '{' )
            // InternalMyAtl.g:51:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:52:7: ( 'to' )
            // InternalMyAtl.g:52:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:53:7: ( '}' )
            // InternalMyAtl.g:53:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:54:7: ( 'using' )
            // InternalMyAtl.g:54:9: 'using'
            {
            match("using"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:55:7: ( 'do' )
            // InternalMyAtl.g:55:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:56:7: ( 'entrypoint' )
            // InternalMyAtl.g:56:9: 'entrypoint'
            {
            match("entrypoint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:57:7: ( '(' )
            // InternalMyAtl.g:57:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:58:7: ( ')' )
            // InternalMyAtl.g:58:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:59:7: ( 'helper' )
            // InternalMyAtl.g:59:9: 'helper'
            {
            match("helper"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:60:7: ( 'context' )
            // InternalMyAtl.g:60:9: 'context'
            {
            match("context"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:61:7: ( 'def' )
            // InternalMyAtl.g:61:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:62:7: ( 'xxx' )
            // InternalMyAtl.g:62:9: 'xxx'
            {
            match("xxx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:63:7: ( 'yyy' )
            // InternalMyAtl.g:63:9: 'yyy'
            {
            match("yyy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:64:7: ( '<-' )
            // InternalMyAtl.g:64:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:65:7: ( '!' )
            // InternalMyAtl.g:65:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:66:7: ( '..' )
            // InternalMyAtl.g:66:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:67:7: ( 'invalid' )
            // InternalMyAtl.g:67:9: 'invalid'
            {
            match("invalid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:68:7: ( 'null' )
            // InternalMyAtl.g:68:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:69:7: ( '::' )
            // InternalMyAtl.g:69:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:70:7: ( 'if' )
            // InternalMyAtl.g:70:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:71:7: ( 'then' )
            // InternalMyAtl.g:71:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:72:7: ( 'else' )
            // InternalMyAtl.g:72:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:73:7: ( 'endif' )
            // InternalMyAtl.g:73:9: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:74:7: ( 'let' )
            // InternalMyAtl.g:74:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:75:7: ( 'in' )
            // InternalMyAtl.g:75:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:76:7: ( 'self' )
            // InternalMyAtl.g:76:9: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:77:7: ( '[' )
            // InternalMyAtl.g:77:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:78:7: ( ']' )
            // InternalMyAtl.g:78:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:79:7: ( 'true' )
            // InternalMyAtl.g:79:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:80:7: ( 'false' )
            // InternalMyAtl.g:80:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:81:7: ( '|' )
            // InternalMyAtl.g:81:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "RULE_DOUBLE_QUOTED_STRING"
    public final void mRULE_DOUBLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:11984:27: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalMyAtl.g:11984:29: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalMyAtl.g:11984:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyAtl.g:11984:34: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalMyAtl.g:11984:79: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_QUOTED_STRING"

    // $ANTLR start "RULE_SINGLE_QUOTED_STRING"
    public final void mRULE_SINGLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:11986:27: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalMyAtl.g:11986:29: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalMyAtl.g:11986:34: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyAtl.g:11986:35: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalMyAtl.g:11986:80: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop2;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SINGLE_QUOTED_STRING"

    // $ANTLR start "RULE_ML_SINGLE_QUOTED_STRING"
    public final void mRULE_ML_SINGLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_ML_SINGLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:11988:30: ( '/\\'' ( options {greedy=false; } : . )* '\\'/' )
            // InternalMyAtl.g:11988:32: '/\\'' ( options {greedy=false; } : . )* '\\'/'
            {
            match("/'"); 

            // InternalMyAtl.g:11988:38: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\'') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyAtl.g:11988:66: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("'/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_SINGLE_QUOTED_STRING"

    // $ANTLR start "RULE_SIMPLE_ID"
    public final void mRULE_SIMPLE_ID() throws RecognitionException {
        try {
            int _type = RULE_SIMPLE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:11990:16: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '#' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '!' )* )
            // InternalMyAtl.g:11990:18: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '#' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '!' )*
            {
            if ( input.LA(1)=='#'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyAtl.g:11990:46: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '!' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='!'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyAtl.g:
            	    {
            	    if ( input.LA(1)=='!'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIMPLE_ID"

    // $ANTLR start "RULE_BIG_INT"
    public final void mRULE_BIG_INT() throws RecognitionException {
        try {
            int _type = RULE_BIG_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:11992:14: ( ( '0' .. '9' )+ )
            // InternalMyAtl.g:11992:16: ( '0' .. '9' )+
            {
            // InternalMyAtl.g:11992:16: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyAtl.g:11992:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIG_INT"

    // $ANTLR start "RULE_DOCUMENTATION"
    public final void mRULE_DOCUMENTATION() throws RecognitionException {
        try {
            int _type = RULE_DOCUMENTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:11994:20: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalMyAtl.g:11994:22: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalMyAtl.g:11994:28: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyAtl.g:11994:56: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "RULE_DOCUMENTATION"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:11996:17: ( '/*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyAtl.g:11996:19: '/*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("/*"); 

            // InternalMyAtl.g:11996:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyAtl.g:11996:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop7;
                }
            } while (true);

            // InternalMyAtl.g:11996:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyAtl.g:11996:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyAtl.g:11996:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyAtl.g:11996:41: '\\r'
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
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:11998:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyAtl.g:11998:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // InternalMyAtl.g:11998:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyAtl.g:11998:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalMyAtl.g:11998:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyAtl.g:11998:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyAtl.g:11998:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMyAtl.g:11998:41: '\\r'
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
            // InternalMyAtl.g:12000:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyAtl.g:12000:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyAtl.g:12000:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyAtl.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalMyAtl.g:12002:16: ( . )
            // InternalMyAtl.g:12002:18: .
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:12004:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyAtl.g:12004:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyAtl.g:12004:11: ( '^' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='^') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyAtl.g:12004:11: '^'
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

            // InternalMyAtl.g:12004:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyAtl.g:
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
            	    break loop15;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:12006:10: ( ( '0' .. '9' )+ )
            // InternalMyAtl.g:12006:12: ( '0' .. '9' )+
            {
            // InternalMyAtl.g:12006:12: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyAtl.g:12006:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtl.g:12008:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyAtl.g:12008:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyAtl.g:12008:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\"') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyAtl.g:12008:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyAtl.g:12008:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalMyAtl.g:12008:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyAtl.g:12008:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop17;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:12008:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyAtl.g:12008:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyAtl.g:12008:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyAtl.g:12008:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop18;
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

    public void mTokens() throws RecognitionException {
        // InternalMyAtl.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_SIMPLE_ID | RULE_BIG_INT | RULE_DOCUMENTATION | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER | RULE_ID | RULE_INT | RULE_STRING )
        int alt20=84;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalMyAtl.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalMyAtl.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalMyAtl.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalMyAtl.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalMyAtl.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalMyAtl.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalMyAtl.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalMyAtl.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalMyAtl.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalMyAtl.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalMyAtl.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalMyAtl.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalMyAtl.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalMyAtl.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalMyAtl.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalMyAtl.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalMyAtl.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalMyAtl.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalMyAtl.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalMyAtl.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalMyAtl.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalMyAtl.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalMyAtl.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalMyAtl.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalMyAtl.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalMyAtl.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalMyAtl.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalMyAtl.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalMyAtl.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalMyAtl.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalMyAtl.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalMyAtl.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalMyAtl.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalMyAtl.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalMyAtl.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalMyAtl.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalMyAtl.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalMyAtl.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalMyAtl.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalMyAtl.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalMyAtl.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalMyAtl.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalMyAtl.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalMyAtl.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalMyAtl.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalMyAtl.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalMyAtl.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalMyAtl.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalMyAtl.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalMyAtl.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalMyAtl.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalMyAtl.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalMyAtl.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalMyAtl.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalMyAtl.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // InternalMyAtl.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // InternalMyAtl.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // InternalMyAtl.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // InternalMyAtl.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // InternalMyAtl.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // InternalMyAtl.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // InternalMyAtl.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // InternalMyAtl.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // InternalMyAtl.g:1:388: T__80
                {
                mT__80(); 

                }
                break;
            case 65 :
                // InternalMyAtl.g:1:394: T__81
                {
                mT__81(); 

                }
                break;
            case 66 :
                // InternalMyAtl.g:1:400: T__82
                {
                mT__82(); 

                }
                break;
            case 67 :
                // InternalMyAtl.g:1:406: T__83
                {
                mT__83(); 

                }
                break;
            case 68 :
                // InternalMyAtl.g:1:412: T__84
                {
                mT__84(); 

                }
                break;
            case 69 :
                // InternalMyAtl.g:1:418: T__85
                {
                mT__85(); 

                }
                break;
            case 70 :
                // InternalMyAtl.g:1:424: T__86
                {
                mT__86(); 

                }
                break;
            case 71 :
                // InternalMyAtl.g:1:430: T__87
                {
                mT__87(); 

                }
                break;
            case 72 :
                // InternalMyAtl.g:1:436: RULE_DOUBLE_QUOTED_STRING
                {
                mRULE_DOUBLE_QUOTED_STRING(); 

                }
                break;
            case 73 :
                // InternalMyAtl.g:1:462: RULE_SINGLE_QUOTED_STRING
                {
                mRULE_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 74 :
                // InternalMyAtl.g:1:488: RULE_ML_SINGLE_QUOTED_STRING
                {
                mRULE_ML_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 75 :
                // InternalMyAtl.g:1:517: RULE_SIMPLE_ID
                {
                mRULE_SIMPLE_ID(); 

                }
                break;
            case 76 :
                // InternalMyAtl.g:1:532: RULE_BIG_INT
                {
                mRULE_BIG_INT(); 

                }
                break;
            case 77 :
                // InternalMyAtl.g:1:545: RULE_DOCUMENTATION
                {
                mRULE_DOCUMENTATION(); 

                }
                break;
            case 78 :
                // InternalMyAtl.g:1:564: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 79 :
                // InternalMyAtl.g:1:580: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 80 :
                // InternalMyAtl.g:1:596: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 81 :
                // InternalMyAtl.g:1:604: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;
            case 82 :
                // InternalMyAtl.g:1:619: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 83 :
                // InternalMyAtl.g:1:627: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 84 :
                // InternalMyAtl.g:1:636: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\1\uffff\10\67\1\106\1\67\1\uffff\1\114\1\uffff\1\117\1\123\1\uffff\4\67\1\135\1\67\1\uffff\1\67\1\143\1\67\1\uffff\1\67\1\uffff\1\67\1\uffff\3\67\2\uffff\2\67\1\uffff\2\67\3\uffff\2\63\1\67\1\u0082\1\uffff\1\63\2\uffff\2\67\1\uffff\3\67\1\u008a\10\67\3\uffff\2\67\2\uffff\1\u0097\11\uffff\1\67\1\u0099\3\67\1\u009e\1\u009f\2\uffff\1\67\1\uffff\2\67\2\uffff\2\67\1\uffff\1\67\1\uffff\1\u00a6\2\67\1\uffff\1\67\1\u00aa\3\67\2\uffff\2\67\1\uffff\2\67\12\uffff\1\u0082\2\uffff\2\67\1\u00ba\1\67\1\uffff\2\67\1\u00be\4\67\1\u00c5\1\67\1\u00c7\1\67\1\u0097\1\uffff\1\u00cd\1\uffff\1\u00ce\1\u00cf\2\67\2\uffff\6\67\1\uffff\3\67\1\uffff\1\u00db\4\67\1\u00e0\1\u00e1\1\67\5\uffff\2\67\1\uffff\1\67\1\u00e6\1\67\1\uffff\6\67\1\uffff\1\67\1\uffff\1\u00ef\1\u0097\1\uffff\2\u0097\3\uffff\5\67\1\u00f7\1\67\1\u00f9\1\u00fa\1\u00fb\1\67\1\uffff\2\67\1\u00ff\1\67\2\uffff\1\u0101\1\u0102\2\67\1\uffff\10\67\1\uffff\1\u00f1\1\uffff\5\67\1\uffff\1\u0112\3\uffff\1\u0113\1\67\1\u0115\1\uffff\1\67\2\uffff\2\67\1\u0119\2\67\1\u011c\6\67\1\u0123\1\u0124\1\67\2\uffff\1\67\1\uffff\1\u0127\1\u0128\1\u0129\1\uffff\2\67\1\uffff\1\67\1\u012d\2\67\1\u0130\1\u0131\2\uffff\1\u0132\1\67\3\uffff\1\u0134\2\67\1\uffff\2\67\3\uffff\1\67\1\uffff\6\67\1\u0140\1\u0141\1\u0142\1\u0143\1\67\4\uffff\4\67\1\u0149\1\uffff";
    static final String DFA20_eofS =
        "\u014a\uffff";
    static final String DFA20_minS =
        "\1\0\10\60\1\55\1\60\1\uffff\1\47\1\uffff\1\75\1\55\1\uffff\4\60\1\56\1\60\1\uffff\1\60\1\72\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\3\60\2\uffff\2\60\1\uffff\2\60\3\uffff\2\0\2\60\1\uffff\1\101\2\uffff\2\60\1\uffff\3\60\1\41\10\60\3\uffff\2\60\2\uffff\1\52\11\uffff\1\60\1\41\3\60\2\41\2\uffff\1\60\1\uffff\2\60\2\uffff\2\60\1\uffff\1\60\1\uffff\1\41\2\60\1\uffff\1\60\1\41\3\60\2\uffff\2\60\1\uffff\2\60\3\uffff\2\0\1\uffff\2\0\2\uffff\1\60\2\uffff\2\60\1\41\1\60\1\uffff\2\60\1\41\4\60\1\41\1\60\1\41\1\60\1\0\1\uffff\1\41\1\uffff\2\41\2\60\2\uffff\6\60\1\uffff\3\60\1\uffff\1\41\4\60\2\41\1\60\1\0\2\uffff\1\0\1\uffff\2\60\1\uffff\1\60\1\41\1\60\1\uffff\6\60\1\uffff\1\60\1\uffff\1\41\4\0\3\uffff\5\60\1\41\1\60\3\41\1\60\1\uffff\2\60\1\41\1\60\2\uffff\2\41\2\60\1\uffff\10\60\1\uffff\1\0\1\uffff\5\60\1\uffff\1\41\3\uffff\1\41\1\60\1\41\1\uffff\1\60\2\uffff\2\60\1\41\2\60\1\41\6\60\2\41\1\60\2\uffff\1\60\1\uffff\3\41\1\uffff\2\60\1\uffff\1\60\1\41\2\60\2\41\2\uffff\1\41\1\60\3\uffff\1\41\2\60\1\uffff\2\60\3\uffff\1\60\1\uffff\6\60\4\41\1\60\4\uffff\4\60\1\41\1\uffff";
    static final String DFA20_maxS =
        "\1\uffff\10\172\1\76\1\172\1\uffff\1\52\1\uffff\1\75\1\76\1\uffff\4\172\1\56\1\172\1\uffff\1\172\1\72\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\3\172\2\uffff\2\172\1\uffff\2\172\3\uffff\2\uffff\1\172\1\71\1\uffff\1\172\2\uffff\2\172\1\uffff\14\172\3\uffff\2\172\2\uffff\1\52\11\uffff\7\172\2\uffff\1\172\1\uffff\2\172\2\uffff\2\172\1\uffff\1\172\1\uffff\3\172\1\uffff\5\172\2\uffff\2\172\1\uffff\2\172\3\uffff\2\uffff\1\uffff\2\uffff\2\uffff\1\71\2\uffff\4\172\1\uffff\13\172\1\uffff\1\uffff\1\172\1\uffff\4\172\2\uffff\6\172\1\uffff\3\172\1\uffff\10\172\1\uffff\2\uffff\1\uffff\1\uffff\2\172\1\uffff\3\172\1\uffff\6\172\1\uffff\1\172\1\uffff\1\172\4\uffff\3\uffff\13\172\1\uffff\4\172\2\uffff\4\172\1\uffff\10\172\1\uffff\1\uffff\1\uffff\5\172\1\uffff\1\172\3\uffff\3\172\1\uffff\1\172\2\uffff\17\172\2\uffff\1\172\1\uffff\3\172\1\uffff\2\172\1\uffff\6\172\2\uffff\2\172\3\uffff\3\172\1\uffff\2\172\3\uffff\1\172\1\uffff\13\172\4\uffff\5\172\1\uffff";
    static final String DFA20_acceptS =
        "\13\uffff\1\21\1\uffff\1\23\2\uffff\1\30\6\uffff\1\41\3\uffff\1\47\1\uffff\1\51\1\uffff\1\53\3\uffff\1\57\1\60\2\uffff\1\67\2\uffff\1\103\1\104\1\107\4\uffff\1\120\1\uffff\1\121\1\113\2\uffff\1\113\14\uffff\1\37\1\117\1\17\2\uffff\1\21\1\112\1\uffff\1\22\1\23\1\26\1\24\1\27\1\31\1\66\1\25\1\30\7\uffff\1\70\1\36\1\uffff\1\41\2\uffff\1\73\1\44\2\uffff\1\47\1\uffff\1\51\3\uffff\1\53\5\uffff\1\57\1\60\2\uffff\1\67\2\uffff\1\103\1\104\1\107\2\uffff\1\110\2\uffff\1\111\1\114\1\uffff\1\120\1\122\4\uffff\1\46\14\uffff\1\116\1\uffff\1\33\4\uffff\1\101\1\74\6\uffff\1\52\3\uffff\1\55\11\uffff\1\124\1\110\1\uffff\1\111\2\uffff\1\13\3\uffff\1\12\6\uffff\1\43\1\uffff\1\20\5\uffff\1\32\1\34\1\64\13\uffff\1\63\4\uffff\1\65\1\100\4\uffff\1\4\10\uffff\1\72\1\uffff\1\115\5\uffff\1\45\1\uffff\1\50\1\75\1\105\3\uffff\1\76\1\uffff\1\102\1\1\17\uffff\1\106\1\54\1\uffff\1\77\3\uffff\1\5\2\uffff\1\7\6\uffff\1\40\1\42\2\uffff\1\61\1\2\1\3\3\uffff\1\11\2\uffff\1\35\1\71\1\62\1\uffff\1\14\13\uffff\1\10\1\16\1\15\1\56\5\uffff\1\6";
    static final String DFA20_specialS =
        "\1\4\54\uffff\1\12\1\5\115\uffff\1\13\1\3\1\uffff\1\16\1\15\25\uffff\1\7\34\uffff\1\2\2\uffff\1\14\22\uffff\1\1\1\10\1\6\1\11\43\uffff\1\0\131\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\63\2\61\2\63\1\61\22\63\1\61\1\47\1\55\1\64\3\63\1\56\1\43\1\44\1\13\1\15\1\33\1\11\1\25\1\14\12\60\1\31\1\27\1\17\1\20\1\16\2\63\1\57\1\2\1\10\5\57\1\3\5\57\1\7\2\57\1\4\1\5\1\1\1\6\5\57\1\52\1\63\1\53\1\62\1\57\1\63\1\21\1\57\1\30\1\41\1\42\1\32\1\57\1\45\1\24\2\57\1\50\1\26\1\12\1\22\2\57\1\34\1\51\1\36\1\40\2\57\1\23\1\46\1\57\1\35\1\54\1\37\uff82\63",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\24\66\1\65\5\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\1\71\15\66\1\70\13\66",
            "\12\66\7\uffff\15\66\1\73\14\66\4\uffff\1\66\1\uffff\15\66\1\72\14\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\74\25\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\76\16\66\1\75\6\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\77\14\66",
            "\12\66\7\uffff\24\66\1\102\5\66\4\uffff\1\66\1\uffff\2\66\1\100\16\66\1\101\10\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\103\13\66",
            "\1\105\20\uffff\1\104",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\107\5\66\1\110\5\66",
            "",
            "\1\112\2\uffff\1\113",
            "",
            "\1\116",
            "\1\122\17\uffff\1\120\1\121",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\125\14\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\126\10\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\127\10\66\1\130\2\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\5\66\1\133\6\66\1\131\1\132\14\66",
            "\1\134",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\136\13\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\141\2\66\1\140\10\66",
            "\1\142",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\1\145\20\66\1\144\10\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\24\66\1\147\5\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\7\66\1\152\6\66\1\151\2\66\1\153\10\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\22\66\1\155\7\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\157\11\66\1\156\13\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\161\1\66\1\160\14\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\164\25\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\30\66\1\165\1\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\167\25\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\170\25\66",
            "",
            "",
            "",
            "\42\175\1\176\71\175\1\174\uffa3\175",
            "\47\u0080\1\u0081\64\u0080\1\177\uffa3\u0080",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\u0083",
            "",
            "\32\u0085\4\uffff\1\u0085\1\uffff\32\u0085",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\17\66\1\u0086\12\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u0087\13\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\6\66\1\u0088\23\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u0089\6\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u008b\31\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u008c\10\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\20\66\1\u008e\2\66\1\u008d\6\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u008f\16\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u0090\16\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\3\66\1\u0091\26\66",
            "\12\66\7\uffff\23\66\1\u0092\6\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u0093\16\66",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u0094\6\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u0095\16\66",
            "",
            "",
            "\1\u0096",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\3\66\1\u0098\26\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u009a\10\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\27\66\1\u009b\2\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\17\66\1\u009c\12\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\25\66\1\u009d\4\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\3\66\1\u00a0\26\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00a1\25\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u00a2\14\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u00a3\13\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u00a4\16\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u00a5\16\66",
            "",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00a7\25\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\24\66\1\u00a8\5\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u00a9\21\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\5\66\1\u00ab\24\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\3\66\1\u00ad\17\66\1\u00ac\6\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\22\66\1\u00ae\7\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u00af\16\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\30\66\1\u00b0\1\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u00b1\6\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u00b2\16\66",
            "",
            "",
            "",
            "\42\u00b4\1\u00b3\4\u00b4\1\u00b3\64\u00b4\1\u00b3\5\u00b4\1\u00b3\3\u00b4\1\u00b3\7\u00b4\1\u00b3\3\u00b4\1\u00b3\1\u00b4\2\u00b3\uff8a\u00b4",
            "\42\175\1\176\71\175\1\174\uffa3\175",
            "",
            "\42\u00b4\1\u00b6\4\u00b4\1\u00b6\64\u00b4\1\u00b6\5\u00b4\1\u00b6\3\u00b4\1\u00b6\7\u00b4\1\u00b6\3\u00b4\1\u00b6\1\u00b4\2\u00b6\uff8a\u00b4",
            "\47\u0080\1\u0081\64\u0080\1\177\uffa3\u0080",
            "",
            "",
            "\12\u0083",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u00b8\16\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u00b9\16\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00bb\25\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u00bc\16\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u00bd\21\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\24\66\1\u00bf\5\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u00c0\21\66",
            "\12\66\7\uffff\1\u00c1\7\66\1\u00c2\14\66\1\u00c3\4\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00c4\25\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u00c6\16\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u00c8\16\66",
            "\12\u00cc\1\u00cb\2\u00cc\1\u00ca\34\u00cc\1\u00c9\uffd5\u00cc",
            "",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u00d0\16\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u00d1\31\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\24\66\1\u00d2\5\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u00d3\31\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u00d4\6\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\14\66\1\u00d5\15\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\22\66\1\u00d6\7\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00d7\25\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u00d8\14\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00d9\25\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u00da\14\66",
            "",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u00dc\10\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u00dd\21\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00de\25\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\17\66\1\u00df\12\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\5\66\1\u00e2\24\66",
            "\42\175\1\176\71\175\1\174\uffa3\175",
            "",
            "",
            "\47\u0080\1\u0081\64\u0080\1\177\uffa3\u0080",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00e3\25\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00e4\25\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\6\66\1\u00e5\23\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u00e7\14\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00e8\25\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\14\66\1\u00e9\15\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u00ea\14\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u00eb\14\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u00ec\13\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u00ed\10\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00ee\25\66",
            "",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\u00cc\1\u00cb\2\u00cc\1\u00ca\34\u00cc\1\u00c9\4\u00cc\1\u00f0\uffd0\u00cc",
            "\12\u00f1\1\u00cb\ufff5\u00f1",
            "\0\u00f1",
            "\12\u00cc\1\u00cb\2\u00cc\1\u00ca\34\u00cc\1\u00c9\uffd5\u00cc",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u00f2\21\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u00f3\16\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u00f4\16\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u00f5\6\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00f6\25\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00f8\25\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\6\66\1\u00fc\23\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\30\66\1\u00fd\1\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\5\66\1\u00fe\24\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u0100\25\66",
            "",
            "",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u0103\31\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u0104\25\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\6\66\1\u0105\23\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u0106\14\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u0107\21\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\30\66\1\u0108\1\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\25\66\1\u0109\4\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u010a\21\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u010b\25\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\2\66\1\u010c\27\66",
            "",
            "\12\u00cc\1\u00cb\2\u00cc\1\u00ca\34\u00cc\1\u00c9\uffd5\u00cc",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u010d\25\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u010e\21\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u010f\25\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u0110\25\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\27\66\1\u0111\2\66",
            "",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\17\66\1\u0114\12\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u0116\10\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u0117\14\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u0118\10\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\2\66\1\u011a\27\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u011b\6\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u011d\31\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\3\66\1\u011e\26\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\3\66\1\u011f\26\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u0120\6\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\22\66\1\u0121\7\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\3\66\1\u0122\26\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u0125\6\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u0126\13\66",
            "",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u012a\25\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u012b\25\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u012c\16\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\22\66\1\u012e\7\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u012f\21\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u0133\21\66",
            "",
            "",
            "",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\3\66\1\u0135\26\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u0136\21\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u0137\25\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u0138\13\66",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u0139\14\66",
            "",
            "\12\66\7\uffff\15\66\1\u013a\14\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\3\66\1\u013b\26\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u013c\6\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u013d\14\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u013e\6\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u013f\31\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u0144\6\66",
            "",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\24\66\1\u0145\5\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u0146\10\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u0147\31\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u0148\16\66",
            "\1\67\16\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_SIMPLE_ID | RULE_BIG_INT | RULE_DOCUMENTATION | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER | RULE_ID | RULE_INT | RULE_STRING );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_240 = input.LA(1);

                        s = -1;
                        if ( (LA20_240=='*') ) {s = 201;}

                        else if ( (LA20_240=='\r') ) {s = 202;}

                        else if ( (LA20_240=='\n') ) {s = 203;}

                        else if ( ((LA20_240>='\u0000' && LA20_240<='\t')||(LA20_240>='\u000B' && LA20_240<='\f')||(LA20_240>='\u000E' && LA20_240<=')')||(LA20_240>='+' && LA20_240<='\uFFFF')) ) {s = 204;}

                        else s = 241;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_201 = input.LA(1);

                        s = -1;
                        if ( (LA20_201=='/') ) {s = 240;}

                        else if ( (LA20_201=='*') ) {s = 201;}

                        else if ( (LA20_201=='\r') ) {s = 202;}

                        else if ( (LA20_201=='\n') ) {s = 203;}

                        else if ( ((LA20_201>='\u0000' && LA20_201<='\t')||(LA20_201>='\u000B' && LA20_201<='\f')||(LA20_201>='\u000E' && LA20_201<=')')||(LA20_201>='+' && LA20_201<='.')||(LA20_201>='0' && LA20_201<='\uFFFF')) ) {s = 204;}

                        else s = 151;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_179 = input.LA(1);

                        s = -1;
                        if ( (LA20_179=='\"') ) {s = 126;}

                        else if ( (LA20_179=='\\') ) {s = 124;}

                        else if ( ((LA20_179>='\u0000' && LA20_179<='!')||(LA20_179>='#' && LA20_179<='[')||(LA20_179>=']' && LA20_179<='\uFFFF')) ) {s = 125;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_125 = input.LA(1);

                        s = -1;
                        if ( (LA20_125=='\"') ) {s = 126;}

                        else if ( (LA20_125=='\\') ) {s = 124;}

                        else if ( ((LA20_125>='\u0000' && LA20_125<='!')||(LA20_125>='#' && LA20_125<='[')||(LA20_125>=']' && LA20_125<='\uFFFF')) ) {s = 125;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='T') ) {s = 1;}

                        else if ( (LA20_0=='B') ) {s = 2;}

                        else if ( (LA20_0=='I') ) {s = 3;}

                        else if ( (LA20_0=='R') ) {s = 4;}

                        else if ( (LA20_0=='S') ) {s = 5;}

                        else if ( (LA20_0=='U') ) {s = 6;}

                        else if ( (LA20_0=='O') ) {s = 7;}

                        else if ( (LA20_0=='C') ) {s = 8;}

                        else if ( (LA20_0=='-') ) {s = 9;}

                        else if ( (LA20_0=='n') ) {s = 10;}

                        else if ( (LA20_0=='*') ) {s = 11;}

                        else if ( (LA20_0=='/') ) {s = 12;}

                        else if ( (LA20_0=='+') ) {s = 13;}

                        else if ( (LA20_0=='>') ) {s = 14;}

                        else if ( (LA20_0=='<') ) {s = 15;}

                        else if ( (LA20_0=='=') ) {s = 16;}

                        else if ( (LA20_0=='a') ) {s = 17;}

                        else if ( (LA20_0=='o') ) {s = 18;}

                        else if ( (LA20_0=='x') ) {s = 19;}

                        else if ( (LA20_0=='i') ) {s = 20;}

                        else if ( (LA20_0=='.') ) {s = 21;}

                        else if ( (LA20_0=='m') ) {s = 22;}

                        else if ( (LA20_0==';') ) {s = 23;}

                        else if ( (LA20_0=='c') ) {s = 24;}

                        else if ( (LA20_0==':') ) {s = 25;}

                        else if ( (LA20_0=='f') ) {s = 26;}

                        else if ( (LA20_0==',') ) {s = 27;}

                        else if ( (LA20_0=='r') ) {s = 28;}

                        else if ( (LA20_0=='{') ) {s = 29;}

                        else if ( (LA20_0=='t') ) {s = 30;}

                        else if ( (LA20_0=='}') ) {s = 31;}

                        else if ( (LA20_0=='u') ) {s = 32;}

                        else if ( (LA20_0=='d') ) {s = 33;}

                        else if ( (LA20_0=='e') ) {s = 34;}

                        else if ( (LA20_0=='(') ) {s = 35;}

                        else if ( (LA20_0==')') ) {s = 36;}

                        else if ( (LA20_0=='h') ) {s = 37;}

                        else if ( (LA20_0=='y') ) {s = 38;}

                        else if ( (LA20_0=='!') ) {s = 39;}

                        else if ( (LA20_0=='l') ) {s = 40;}

                        else if ( (LA20_0=='s') ) {s = 41;}

                        else if ( (LA20_0=='[') ) {s = 42;}

                        else if ( (LA20_0==']') ) {s = 43;}

                        else if ( (LA20_0=='|') ) {s = 44;}

                        else if ( (LA20_0=='\"') ) {s = 45;}

                        else if ( (LA20_0=='\'') ) {s = 46;}

                        else if ( (LA20_0=='A'||(LA20_0>='D' && LA20_0<='H')||(LA20_0>='J' && LA20_0<='N')||(LA20_0>='P' && LA20_0<='Q')||(LA20_0>='V' && LA20_0<='Z')||LA20_0=='_'||LA20_0=='b'||LA20_0=='g'||(LA20_0>='j' && LA20_0<='k')||(LA20_0>='p' && LA20_0<='q')||(LA20_0>='v' && LA20_0<='w')||LA20_0=='z') ) {s = 47;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 48;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 49;}

                        else if ( (LA20_0=='^') ) {s = 50;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||(LA20_0>='$' && LA20_0<='&')||(LA20_0>='?' && LA20_0<='@')||LA20_0=='\\'||LA20_0=='`'||(LA20_0>='~' && LA20_0<='\uFFFF')) ) {s = 51;}

                        else if ( (LA20_0=='#') ) {s = 52;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_46 = input.LA(1);

                        s = -1;
                        if ( (LA20_46=='\\') ) {s = 127;}

                        else if ( ((LA20_46>='\u0000' && LA20_46<='&')||(LA20_46>='(' && LA20_46<='[')||(LA20_46>=']' && LA20_46<='\uFFFF')) ) {s = 128;}

                        else if ( (LA20_46=='\'') ) {s = 129;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_203 = input.LA(1);

                        s = -1;
                        if ( ((LA20_203>='\u0000' && LA20_203<='\uFFFF')) ) {s = 241;}

                        else s = 151;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA20_150 = input.LA(1);

                        s = -1;
                        if ( (LA20_150=='*') ) {s = 201;}

                        else if ( (LA20_150=='\r') ) {s = 202;}

                        else if ( (LA20_150=='\n') ) {s = 203;}

                        else if ( ((LA20_150>='\u0000' && LA20_150<='\t')||(LA20_150>='\u000B' && LA20_150<='\f')||(LA20_150>='\u000E' && LA20_150<=')')||(LA20_150>='+' && LA20_150<='\uFFFF')) ) {s = 204;}

                        else s = 151;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA20_202 = input.LA(1);

                        s = -1;
                        if ( (LA20_202=='\n') ) {s = 203;}

                        else if ( ((LA20_202>='\u0000' && LA20_202<='\t')||(LA20_202>='\u000B' && LA20_202<='\uFFFF')) ) {s = 241;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA20_204 = input.LA(1);

                        s = -1;
                        if ( (LA20_204=='*') ) {s = 201;}

                        else if ( (LA20_204=='\r') ) {s = 202;}

                        else if ( (LA20_204=='\n') ) {s = 203;}

                        else if ( ((LA20_204>='\u0000' && LA20_204<='\t')||(LA20_204>='\u000B' && LA20_204<='\f')||(LA20_204>='\u000E' && LA20_204<=')')||(LA20_204>='+' && LA20_204<='\uFFFF')) ) {s = 204;}

                        else s = 151;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA20_45 = input.LA(1);

                        s = -1;
                        if ( (LA20_45=='\\') ) {s = 124;}

                        else if ( ((LA20_45>='\u0000' && LA20_45<='!')||(LA20_45>='#' && LA20_45<='[')||(LA20_45>=']' && LA20_45<='\uFFFF')) ) {s = 125;}

                        else if ( (LA20_45=='\"') ) {s = 126;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA20_124 = input.LA(1);

                        s = -1;
                        if ( (LA20_124=='\"'||LA20_124=='\''||LA20_124=='\\'||LA20_124=='b'||LA20_124=='f'||LA20_124=='n'||LA20_124=='r'||(LA20_124>='t' && LA20_124<='u')) ) {s = 179;}

                        else if ( ((LA20_124>='\u0000' && LA20_124<='!')||(LA20_124>='#' && LA20_124<='&')||(LA20_124>='(' && LA20_124<='[')||(LA20_124>=']' && LA20_124<='a')||(LA20_124>='c' && LA20_124<='e')||(LA20_124>='g' && LA20_124<='m')||(LA20_124>='o' && LA20_124<='q')||LA20_124=='s'||(LA20_124>='v' && LA20_124<='\uFFFF')) ) {s = 180;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA20_182 = input.LA(1);

                        s = -1;
                        if ( (LA20_182=='\'') ) {s = 129;}

                        else if ( (LA20_182=='\\') ) {s = 127;}

                        else if ( ((LA20_182>='\u0000' && LA20_182<='&')||(LA20_182>='(' && LA20_182<='[')||(LA20_182>=']' && LA20_182<='\uFFFF')) ) {s = 128;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA20_128 = input.LA(1);

                        s = -1;
                        if ( (LA20_128=='\'') ) {s = 129;}

                        else if ( (LA20_128=='\\') ) {s = 127;}

                        else if ( ((LA20_128>='\u0000' && LA20_128<='&')||(LA20_128>='(' && LA20_128<='[')||(LA20_128>=']' && LA20_128<='\uFFFF')) ) {s = 128;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA20_127 = input.LA(1);

                        s = -1;
                        if ( (LA20_127=='\"'||LA20_127=='\''||LA20_127=='\\'||LA20_127=='b'||LA20_127=='f'||LA20_127=='n'||LA20_127=='r'||(LA20_127>='t' && LA20_127<='u')) ) {s = 182;}

                        else if ( ((LA20_127>='\u0000' && LA20_127<='!')||(LA20_127>='#' && LA20_127<='&')||(LA20_127>='(' && LA20_127<='[')||(LA20_127>=']' && LA20_127<='a')||(LA20_127>='c' && LA20_127<='e')||(LA20_127>='g' && LA20_127<='m')||(LA20_127>='o' && LA20_127<='q')||LA20_127=='s'||(LA20_127>='v' && LA20_127<='\uFFFF')) ) {s = 180;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}