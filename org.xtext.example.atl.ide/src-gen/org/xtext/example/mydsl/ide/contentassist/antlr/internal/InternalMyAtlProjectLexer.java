package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyAtlProjectLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BIG_INT=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=8;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_DOCUMENTATION=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
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
    public static final int RULE_SIMPLE_ID=5;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SINGLE_QUOTED_STRING=4;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_DOUBLE_QUOTED_STRING=7;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMyAtlProjectLexer() {;} 
    public InternalMyAtlProjectLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyAtlProjectLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyAtlProject.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtlProject.g:11:7: ( '-' )
            // InternalMyAtlProject.g:11:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtlProject.g:12:7: ( 'not' )
            // InternalMyAtlProject.g:12:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtlProject.g:13:7: ( '*' )
            // InternalMyAtlProject.g:13:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtlProject.g:14:7: ( '/' )
            // InternalMyAtlProject.g:14:9: '/'
            {
            match('/'); 

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
            // InternalMyAtlProject.g:15:7: ( '+' )
            // InternalMyAtlProject.g:15:9: '+'
            {
            match('+'); 

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
            // InternalMyAtlProject.g:16:7: ( '>' )
            // InternalMyAtlProject.g:16:9: '>'
            {
            match('>'); 

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
            // InternalMyAtlProject.g:17:7: ( '<' )
            // InternalMyAtlProject.g:17:9: '<'
            {
            match('<'); 

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
            // InternalMyAtlProject.g:18:7: ( '>=' )
            // InternalMyAtlProject.g:18:9: '>='
            {
            match(">="); 


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
            // InternalMyAtlProject.g:19:7: ( '<=' )
            // InternalMyAtlProject.g:19:9: '<='
            {
            match("<="); 


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
            // InternalMyAtlProject.g:20:7: ( '=' )
            // InternalMyAtlProject.g:20:9: '='
            {
            match('='); 

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
            // InternalMyAtlProject.g:21:7: ( '<>' )
            // InternalMyAtlProject.g:21:9: '<>'
            {
            match("<>"); 


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
            // InternalMyAtlProject.g:22:7: ( 'and' )
            // InternalMyAtlProject.g:22:9: 'and'
            {
            match("and"); 


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
            // InternalMyAtlProject.g:23:7: ( 'or' )
            // InternalMyAtlProject.g:23:9: 'or'
            {
            match("or"); 


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
            // InternalMyAtlProject.g:24:7: ( 'xor' )
            // InternalMyAtlProject.g:24:9: 'xor'
            {
            match("xor"); 


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
            // InternalMyAtlProject.g:25:7: ( 'implies' )
            // InternalMyAtlProject.g:25:9: 'implies'
            {
            match("implies"); 


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
            // InternalMyAtlProject.g:26:7: ( '.' )
            // InternalMyAtlProject.g:26:9: '.'
            {
            match('.'); 

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
            // InternalMyAtlProject.g:27:7: ( '->' )
            // InternalMyAtlProject.g:27:9: '->'
            {
            match("->"); 


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
            // InternalMyAtlProject.g:28:7: ( 'Tuple' )
            // InternalMyAtlProject.g:28:9: 'Tuple'
            {
            match("Tuple"); 


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
            // InternalMyAtlProject.g:29:7: ( 'Boolean' )
            // InternalMyAtlProject.g:29:9: 'Boolean'
            {
            match("Boolean"); 


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
            // InternalMyAtlProject.g:30:7: ( 'Integer' )
            // InternalMyAtlProject.g:30:9: 'Integer'
            {
            match("Integer"); 


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
            // InternalMyAtlProject.g:31:7: ( 'Real' )
            // InternalMyAtlProject.g:31:9: 'Real'
            {
            match("Real"); 


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
            // InternalMyAtlProject.g:32:7: ( 'String' )
            // InternalMyAtlProject.g:32:9: 'String'
            {
            match("String"); 


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
            // InternalMyAtlProject.g:33:7: ( 'UnlimitedNatural' )
            // InternalMyAtlProject.g:33:9: 'UnlimitedNatural'
            {
            match("UnlimitedNatural"); 


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
            // InternalMyAtlProject.g:34:7: ( 'OclAny' )
            // InternalMyAtlProject.g:34:9: 'OclAny'
            {
            match("OclAny"); 


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
            // InternalMyAtlProject.g:35:7: ( 'OclInvalid' )
            // InternalMyAtlProject.g:35:9: 'OclInvalid'
            {
            match("OclInvalid"); 


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
            // InternalMyAtlProject.g:36:7: ( 'OclVoid' )
            // InternalMyAtlProject.g:36:9: 'OclVoid'
            {
            match("OclVoid"); 


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
            // InternalMyAtlProject.g:37:7: ( 'Set' )
            // InternalMyAtlProject.g:37:9: 'Set'
            {
            match("Set"); 


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
            // InternalMyAtlProject.g:38:7: ( 'Bag' )
            // InternalMyAtlProject.g:38:9: 'Bag'
            {
            match("Bag"); 


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
            // InternalMyAtlProject.g:39:7: ( 'Sequence' )
            // InternalMyAtlProject.g:39:9: 'Sequence'
            {
            match("Sequence"); 


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
            // InternalMyAtlProject.g:40:7: ( 'Collection' )
            // InternalMyAtlProject.g:40:9: 'Collection'
            {
            match("Collection"); 


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
            // InternalMyAtlProject.g:41:7: ( 'OrderedSet' )
            // InternalMyAtlProject.g:41:9: 'OrderedSet'
            {
            match("OrderedSet"); 


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
            // InternalMyAtlProject.g:42:7: ( 'module' )
            // InternalMyAtlProject.g:42:9: 'module'
            {
            match("module"); 


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
            // InternalMyAtlProject.g:43:7: ( ';' )
            // InternalMyAtlProject.g:43:9: ';'
            {
            match(';'); 

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
            // InternalMyAtlProject.g:44:7: ( 'create' )
            // InternalMyAtlProject.g:44:9: 'create'
            {
            match("create"); 


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
            // InternalMyAtlProject.g:45:7: ( 'OUT' )
            // InternalMyAtlProject.g:45:9: 'OUT'
            {
            match("OUT"); 


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
            // InternalMyAtlProject.g:46:7: ( ':' )
            // InternalMyAtlProject.g:46:9: ':'
            {
            match(':'); 

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
            // InternalMyAtlProject.g:47:7: ( 'from' )
            // InternalMyAtlProject.g:47:9: 'from'
            {
            match("from"); 


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
            // InternalMyAtlProject.g:48:7: ( 'IN' )
            // InternalMyAtlProject.g:48:9: 'IN'
            {
            match("IN"); 


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
            // InternalMyAtlProject.g:49:7: ( 'rule' )
            // InternalMyAtlProject.g:49:9: 'rule'
            {
            match("rule"); 


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
            // InternalMyAtlProject.g:50:7: ( '{' )
            // InternalMyAtlProject.g:50:9: '{'
            {
            match('{'); 

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
            // InternalMyAtlProject.g:51:7: ( 'to' )
            // InternalMyAtlProject.g:51:9: 'to'
            {
            match("to"); 


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
            // InternalMyAtlProject.g:52:7: ( '}' )
            // InternalMyAtlProject.g:52:9: '}'
            {
            match('}'); 

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
            // InternalMyAtlProject.g:53:7: ( 'using' )
            // InternalMyAtlProject.g:53:9: 'using'
            {
            match("using"); 


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
            // InternalMyAtlProject.g:54:7: ( 'do' )
            // InternalMyAtlProject.g:54:9: 'do'
            {
            match("do"); 


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
            // InternalMyAtlProject.g:55:7: ( 'entrypoint' )
            // InternalMyAtlProject.g:55:9: 'entrypoint'
            {
            match("entrypoint"); 


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
            // InternalMyAtlProject.g:56:7: ( '(' )
            // InternalMyAtlProject.g:56:9: '('
            {
            match('('); 

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
            // InternalMyAtlProject.g:57:7: ( ')' )
            // InternalMyAtlProject.g:57:9: ')'
            {
            match(')'); 

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
            // InternalMyAtlProject.g:58:7: ( 'helper' )
            // InternalMyAtlProject.g:58:9: 'helper'
            {
            match("helper"); 


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
            // InternalMyAtlProject.g:59:7: ( 'context' )
            // InternalMyAtlProject.g:59:9: 'context'
            {
            match("context"); 


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
            // InternalMyAtlProject.g:60:7: ( ',' )
            // InternalMyAtlProject.g:60:9: ','
            {
            match(','); 

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
            // InternalMyAtlProject.g:61:7: ( 'xxx' )
            // InternalMyAtlProject.g:61:9: 'xxx'
            {
            match("xxx"); 


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
            // InternalMyAtlProject.g:62:7: ( 'yyy' )
            // InternalMyAtlProject.g:62:9: 'yyy'
            {
            match("yyy"); 


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
            // InternalMyAtlProject.g:63:7: ( '<-' )
            // InternalMyAtlProject.g:63:9: '<-'
            {
            match("<-"); 


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
            // InternalMyAtlProject.g:64:7: ( '..' )
            // InternalMyAtlProject.g:64:9: '..'
            {
            match(".."); 


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
            // InternalMyAtlProject.g:65:7: ( 'invalid' )
            // InternalMyAtlProject.g:65:9: 'invalid'
            {
            match("invalid"); 


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
            // InternalMyAtlProject.g:66:7: ( 'null' )
            // InternalMyAtlProject.g:66:9: 'null'
            {
            match("null"); 


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
            // InternalMyAtlProject.g:67:7: ( 'if' )
            // InternalMyAtlProject.g:67:9: 'if'
            {
            match("if"); 


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
            // InternalMyAtlProject.g:68:7: ( 'then' )
            // InternalMyAtlProject.g:68:9: 'then'
            {
            match("then"); 


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
            // InternalMyAtlProject.g:69:7: ( 'else' )
            // InternalMyAtlProject.g:69:9: 'else'
            {
            match("else"); 


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
            // InternalMyAtlProject.g:70:7: ( 'endif' )
            // InternalMyAtlProject.g:70:9: 'endif'
            {
            match("endif"); 


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
            // InternalMyAtlProject.g:71:7: ( 'let' )
            // InternalMyAtlProject.g:71:9: 'let'
            {
            match("let"); 


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
            // InternalMyAtlProject.g:72:7: ( 'in' )
            // InternalMyAtlProject.g:72:9: 'in'
            {
            match("in"); 


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
            // InternalMyAtlProject.g:73:7: ( 'self' )
            // InternalMyAtlProject.g:73:9: 'self'
            {
            match("self"); 


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
            // InternalMyAtlProject.g:74:7: ( '[' )
            // InternalMyAtlProject.g:74:9: '['
            {
            match('['); 

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
            // InternalMyAtlProject.g:75:7: ( ']' )
            // InternalMyAtlProject.g:75:9: ']'
            {
            match(']'); 

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
            // InternalMyAtlProject.g:76:7: ( 'true' )
            // InternalMyAtlProject.g:76:9: 'true'
            {
            match("true"); 


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
            // InternalMyAtlProject.g:77:7: ( 'false' )
            // InternalMyAtlProject.g:77:9: 'false'
            {
            match("false"); 


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
            // InternalMyAtlProject.g:78:7: ( '|' )
            // InternalMyAtlProject.g:78:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "RULE_DOUBLE_QUOTED_STRING"
    public final void mRULE_DOUBLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyAtlProject.g:9289:27: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalMyAtlProject.g:9289:29: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalMyAtlProject.g:9289:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalMyAtlProject.g:9289:34: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalMyAtlProject.g:9289:79: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalMyAtlProject.g:9291:27: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalMyAtlProject.g:9291:29: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalMyAtlProject.g:9291:34: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
            	    // InternalMyAtlProject.g:9291:35: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalMyAtlProject.g:9291:80: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalMyAtlProject.g:9293:30: ( '/\\'' ( options {greedy=false; } : . )* '\\'/' )
            // InternalMyAtlProject.g:9293:32: '/\\'' ( options {greedy=false; } : . )* '\\'/'
            {
            match("/'"); 

            // InternalMyAtlProject.g:9293:38: ( options {greedy=false; } : . )*
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
            	    // InternalMyAtlProject.g:9293:66: .
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
            // InternalMyAtlProject.g:9295:16: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyAtlProject.g:9295:18: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyAtlProject.g:9295:42: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyAtlProject.g:
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
            // InternalMyAtlProject.g:9297:14: ( ( '0' .. '9' )+ )
            // InternalMyAtlProject.g:9297:16: ( '0' .. '9' )+
            {
            // InternalMyAtlProject.g:9297:16: ( '0' .. '9' )+
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
            	    // InternalMyAtlProject.g:9297:17: '0' .. '9'
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
            // InternalMyAtlProject.g:9299:20: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalMyAtlProject.g:9299:22: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalMyAtlProject.g:9299:28: ( options {greedy=false; } : . )*
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
            	    // InternalMyAtlProject.g:9299:56: .
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
            // InternalMyAtlProject.g:9301:17: ( '/*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyAtlProject.g:9301:19: '/*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("/*"); 

            // InternalMyAtlProject.g:9301:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyAtlProject.g:9301:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalMyAtlProject.g:9301:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyAtlProject.g:9301:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyAtlProject.g:9301:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyAtlProject.g:9301:41: '\\r'
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
            // InternalMyAtlProject.g:9303:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyAtlProject.g:9303:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // InternalMyAtlProject.g:9303:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyAtlProject.g:9303:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalMyAtlProject.g:9303:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyAtlProject.g:9303:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyAtlProject.g:9303:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMyAtlProject.g:9303:41: '\\r'
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
            // InternalMyAtlProject.g:9305:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyAtlProject.g:9305:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyAtlProject.g:9305:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalMyAtlProject.g:
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
            // InternalMyAtlProject.g:9307:16: ( . )
            // InternalMyAtlProject.g:9307:18: .
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
        // InternalMyAtlProject.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_SIMPLE_ID | RULE_BIG_INT | RULE_DOCUMENTATION | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=78;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalMyAtlProject.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalMyAtlProject.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalMyAtlProject.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalMyAtlProject.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalMyAtlProject.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalMyAtlProject.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalMyAtlProject.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalMyAtlProject.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalMyAtlProject.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalMyAtlProject.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalMyAtlProject.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalMyAtlProject.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalMyAtlProject.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalMyAtlProject.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalMyAtlProject.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalMyAtlProject.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalMyAtlProject.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalMyAtlProject.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalMyAtlProject.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalMyAtlProject.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalMyAtlProject.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalMyAtlProject.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalMyAtlProject.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalMyAtlProject.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalMyAtlProject.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalMyAtlProject.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalMyAtlProject.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalMyAtlProject.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalMyAtlProject.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalMyAtlProject.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalMyAtlProject.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalMyAtlProject.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalMyAtlProject.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalMyAtlProject.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalMyAtlProject.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalMyAtlProject.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalMyAtlProject.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalMyAtlProject.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalMyAtlProject.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalMyAtlProject.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalMyAtlProject.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalMyAtlProject.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalMyAtlProject.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalMyAtlProject.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalMyAtlProject.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalMyAtlProject.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalMyAtlProject.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // InternalMyAtlProject.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // InternalMyAtlProject.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // InternalMyAtlProject.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // InternalMyAtlProject.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // InternalMyAtlProject.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // InternalMyAtlProject.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // InternalMyAtlProject.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // InternalMyAtlProject.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // InternalMyAtlProject.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // InternalMyAtlProject.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // InternalMyAtlProject.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // InternalMyAtlProject.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // InternalMyAtlProject.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // InternalMyAtlProject.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // InternalMyAtlProject.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // InternalMyAtlProject.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // InternalMyAtlProject.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // InternalMyAtlProject.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // InternalMyAtlProject.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // InternalMyAtlProject.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // InternalMyAtlProject.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // InternalMyAtlProject.g:1:418: RULE_DOUBLE_QUOTED_STRING
                {
                mRULE_DOUBLE_QUOTED_STRING(); 

                }
                break;
            case 70 :
                // InternalMyAtlProject.g:1:444: RULE_SINGLE_QUOTED_STRING
                {
                mRULE_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 71 :
                // InternalMyAtlProject.g:1:470: RULE_ML_SINGLE_QUOTED_STRING
                {
                mRULE_ML_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 72 :
                // InternalMyAtlProject.g:1:499: RULE_SIMPLE_ID
                {
                mRULE_SIMPLE_ID(); 

                }
                break;
            case 73 :
                // InternalMyAtlProject.g:1:514: RULE_BIG_INT
                {
                mRULE_BIG_INT(); 

                }
                break;
            case 74 :
                // InternalMyAtlProject.g:1:527: RULE_DOCUMENTATION
                {
                mRULE_DOCUMENTATION(); 

                }
                break;
            case 75 :
                // InternalMyAtlProject.g:1:546: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 76 :
                // InternalMyAtlProject.g:1:562: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 77 :
                // InternalMyAtlProject.g:1:578: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 78 :
                // InternalMyAtlProject.g:1:586: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\64\1\67\1\uffff\1\73\1\uffff\1\76\1\102\1\uffff\4\67\1\114\11\67\1\uffff\1\67\1\uffff\2\67\1\uffff\1\67\1\uffff\3\67\2\uffff\1\67\1\uffff\3\67\3\uffff\2\61\7\uffff\2\67\3\uffff\1\174\11\uffff\1\67\1\176\3\67\1\u0083\1\u0084\2\uffff\4\67\1\u0089\11\67\1\uffff\2\67\1\uffff\3\67\1\uffff\1\u0099\2\67\1\uffff\1\67\1\u009d\2\67\2\uffff\1\67\1\uffff\3\67\7\uffff\1\u00a5\1\67\1\174\1\uffff\1\u00ab\1\uffff\1\u00ac\1\u00ad\2\67\2\uffff\2\67\1\u00b2\1\67\1\uffff\2\67\1\u00b6\4\67\1\u00bd\7\67\1\uffff\3\67\1\uffff\4\67\1\u00cc\1\u00cd\1\67\1\uffff\1\u00cf\1\174\1\uffff\2\174\3\uffff\4\67\1\uffff\1\67\1\u00d7\1\67\1\uffff\6\67\1\uffff\4\67\1\u00e3\1\67\1\u00e5\1\u00e6\1\u00e7\3\67\1\u00eb\1\67\2\uffff\1\u00ed\1\uffff\1\u00d1\1\uffff\2\67\1\u00f0\2\67\1\uffff\13\67\1\uffff\1\u00fe\3\uffff\1\u00ff\1\67\1\u0101\1\uffff\1\67\1\uffff\2\67\1\uffff\2\67\1\u0107\2\67\1\u010a\4\67\1\u010f\1\u0110\1\67\2\uffff\1\67\1\uffff\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\uffff\2\67\1\uffff\1\67\1\u011b\2\67\2\uffff\1\u011e\1\67\5\uffff\1\u0120\2\67\1\uffff\2\67\1\uffff\1\67\1\uffff\6\67\1\u012c\1\u012d\1\u012e\1\u012f\1\67\4\uffff\4\67\1\u0135\1\uffff";
    static final String DFA14_eofS =
        "\u0136\uffff";
    static final String DFA14_minS =
        "\1\0\1\55\1\157\1\uffff\1\47\1\uffff\1\75\1\55\1\uffff\1\156\1\162\1\157\1\146\1\56\1\165\1\141\1\116\2\145\1\156\1\125\2\157\1\uffff\1\157\1\uffff\1\141\1\165\1\uffff\1\150\1\uffff\1\163\1\157\1\154\2\uffff\1\145\1\uffff\1\171\2\145\3\uffff\2\0\7\uffff\1\164\1\154\3\uffff\1\52\11\uffff\1\144\1\60\1\162\1\170\1\160\2\60\2\uffff\1\160\1\157\1\147\1\164\1\60\1\141\1\162\1\161\2\154\1\144\1\124\1\154\1\144\1\uffff\1\145\1\156\1\uffff\1\157\2\154\1\uffff\1\60\1\145\1\165\1\uffff\1\151\1\60\1\144\1\163\2\uffff\1\154\1\uffff\1\171\1\164\1\154\7\uffff\1\60\1\154\1\0\1\uffff\1\60\1\uffff\2\60\1\154\1\141\2\uffff\2\154\1\60\1\145\1\uffff\1\154\1\151\1\60\1\165\1\151\1\101\1\145\1\60\1\154\1\165\1\141\1\164\1\155\1\163\1\145\1\uffff\1\156\1\145\1\156\1\uffff\1\162\1\151\1\145\1\160\2\60\1\146\1\uffff\1\60\4\0\3\uffff\1\151\1\154\2\145\1\uffff\1\147\1\60\1\156\1\uffff\1\145\1\155\2\156\1\157\1\162\1\uffff\1\145\1\154\1\164\1\145\1\60\1\145\3\60\1\147\1\171\1\146\1\60\1\145\2\uffff\1\60\1\uffff\1\0\1\uffff\1\145\1\151\1\60\1\141\1\145\1\uffff\1\147\1\156\1\151\1\171\1\166\1\151\1\145\1\143\2\145\1\170\1\uffff\1\60\3\uffff\1\60\1\160\1\60\1\uffff\1\162\1\uffff\1\163\1\144\1\uffff\1\156\1\162\1\60\1\143\1\164\1\60\1\141\2\144\1\164\2\60\1\164\2\uffff\1\157\1\uffff\5\60\1\uffff\2\145\1\uffff\1\154\1\60\1\123\1\151\2\uffff\1\60\1\151\5\uffff\1\60\1\144\1\151\1\uffff\1\145\1\157\1\uffff\1\156\1\uffff\1\116\1\144\1\164\1\156\1\164\1\141\4\60\1\164\4\uffff\1\165\1\162\1\141\1\154\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\76\1\165\1\uffff\1\52\1\uffff\1\75\1\76\1\uffff\1\156\1\162\1\170\1\156\1\56\1\165\1\157\1\156\1\145\1\164\1\156\1\162\2\157\1\uffff\1\162\1\uffff\1\162\1\165\1\uffff\1\162\1\uffff\1\163\1\157\1\156\2\uffff\1\145\1\uffff\1\171\2\145\3\uffff\2\uffff\7\uffff\1\164\1\154\3\uffff\1\52\11\uffff\1\144\1\172\1\162\1\170\1\160\2\172\2\uffff\1\160\1\157\1\147\1\164\1\172\1\141\1\162\1\164\2\154\1\144\1\124\1\154\1\144\1\uffff\1\145\1\156\1\uffff\1\157\2\154\1\uffff\1\172\1\145\1\165\1\uffff\1\151\1\172\1\164\1\163\2\uffff\1\154\1\uffff\1\171\1\164\1\154\7\uffff\1\172\1\154\1\uffff\1\uffff\1\172\1\uffff\2\172\1\154\1\141\2\uffff\2\154\1\172\1\145\1\uffff\1\154\1\151\1\172\1\165\1\151\1\126\1\145\1\172\1\154\1\165\1\141\1\164\1\155\1\163\1\145\1\uffff\1\156\1\145\1\156\1\uffff\1\162\1\151\1\145\1\160\2\172\1\146\1\uffff\1\172\4\uffff\3\uffff\1\151\1\154\2\145\1\uffff\1\147\1\172\1\156\1\uffff\1\145\1\155\2\156\1\157\1\162\1\uffff\1\145\1\154\1\164\1\145\1\172\1\145\3\172\1\147\1\171\1\146\1\172\1\145\2\uffff\1\172\1\uffff\1\uffff\1\uffff\1\145\1\151\1\172\1\141\1\145\1\uffff\1\147\1\156\1\151\1\171\1\166\1\151\1\145\1\143\2\145\1\170\1\uffff\1\172\3\uffff\1\172\1\160\1\172\1\uffff\1\162\1\uffff\1\163\1\144\1\uffff\1\156\1\162\1\172\1\143\1\164\1\172\1\141\2\144\1\164\2\172\1\164\2\uffff\1\157\1\uffff\5\172\1\uffff\2\145\1\uffff\1\154\1\172\1\123\1\151\2\uffff\1\172\1\151\5\uffff\1\172\1\144\1\151\1\uffff\1\145\1\157\1\uffff\1\156\1\uffff\1\116\1\144\1\164\1\156\1\164\1\141\4\172\1\164\4\uffff\1\165\1\162\1\141\1\154\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\2\uffff\1\12\16\uffff\1\41\1\uffff\1\44\2\uffff\1\50\1\uffff\1\52\3\uffff\1\56\1\57\1\uffff\1\62\3\uffff\1\100\1\101\1\104\2\uffff\1\110\1\111\1\115\1\116\1\21\1\114\1\1\2\uffff\1\110\1\3\1\107\1\uffff\1\4\1\5\1\10\1\6\1\11\1\13\1\65\1\7\1\12\7\uffff\1\66\1\20\16\uffff\1\41\2\uffff\1\44\3\uffff\1\50\3\uffff\1\52\4\uffff\1\56\1\57\1\uffff\1\62\3\uffff\1\100\1\101\1\104\1\105\1\106\1\111\1\115\3\uffff\1\113\1\uffff\1\15\4\uffff\1\76\1\71\4\uffff\1\46\17\uffff\1\51\3\uffff\1\54\7\uffff\1\2\5\uffff\1\14\1\16\1\63\4\uffff\1\34\3\uffff\1\33\6\uffff\1\43\16\uffff\1\64\1\75\1\uffff\1\70\1\uffff\1\112\5\uffff\1\25\13\uffff\1\45\1\uffff\1\47\1\72\1\102\3\uffff\1\73\1\uffff\1\77\2\uffff\1\22\15\uffff\1\103\1\53\1\uffff\1\74\5\uffff\1\26\2\uffff\1\30\4\uffff\1\40\1\42\2\uffff\1\60\1\17\1\67\1\23\1\24\3\uffff\1\32\2\uffff\1\61\1\uffff\1\35\13\uffff\1\31\1\37\1\36\1\55\5\uffff\1\27";
    static final String DFA14_specialS =
        "\1\0\53\uffff\1\7\1\1\115\uffff\1\2\53\uffff\1\10\1\3\1\6\1\5\45\uffff\1\4\145\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\61\2\60\2\61\1\60\22\61\1\60\1\61\1\54\4\61\1\55\1\42\1\43\1\3\1\5\1\45\1\1\1\15\1\4\12\57\1\31\1\27\1\7\1\10\1\6\2\61\1\56\1\17\1\25\5\56\1\20\5\56\1\24\2\56\1\21\1\22\1\16\1\23\5\56\1\51\1\61\1\52\1\61\1\56\1\61\1\11\1\56\1\30\1\40\1\41\1\32\1\56\1\44\1\14\2\56\1\47\1\26\1\2\1\12\2\56\1\33\1\50\1\35\1\37\2\56\1\13\1\46\1\56\1\34\1\53\1\36\uff82\61",
            "\1\63\20\uffff\1\62",
            "\1\65\5\uffff\1\66",
            "",
            "\1\71\2\uffff\1\72",
            "",
            "\1\75",
            "\1\101\17\uffff\1\77\1\100",
            "",
            "\1\104",
            "\1\105",
            "\1\106\10\uffff\1\107",
            "\1\112\6\uffff\1\110\1\111",
            "\1\113",
            "\1\115",
            "\1\117\15\uffff\1\116",
            "\1\121\37\uffff\1\120",
            "\1\122",
            "\1\124\16\uffff\1\123",
            "\1\125",
            "\1\130\15\uffff\1\126\16\uffff\1\127",
            "\1\131",
            "\1\132",
            "",
            "\1\135\2\uffff\1\134",
            "",
            "\1\140\20\uffff\1\137",
            "\1\141",
            "",
            "\1\144\6\uffff\1\143\2\uffff\1\145",
            "",
            "\1\147",
            "\1\150",
            "\1\152\1\uffff\1\151",
            "",
            "",
            "\1\155",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "",
            "\0\165",
            "\0\166",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\171",
            "\1\172",
            "",
            "",
            "",
            "\1\173",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\175",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\25\67\1\u0082\4\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u008a",
            "\1\u008b",
            "\1\u008d\2\uffff\1\u008c",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u009a",
            "\1\u009b",
            "",
            "\1\u009c",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u009f\17\uffff\1\u009e",
            "\1\u00a0",
            "",
            "",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00a6",
            "\12\u00aa\1\u00a9\2\u00aa\1\u00a8\34\u00aa\1\u00a7\uffd5\u00aa",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00ae",
            "\1\u00af",
            "",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9\7\uffff\1\u00ba\14\uffff\1\u00bb",
            "\1\u00bc",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00ce",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\u00aa\1\u00a9\2\u00aa\1\u00a8\34\u00aa\1\u00a7\4\u00aa\1\u00d0\uffd0\u00aa",
            "\12\u00d1\1\u00a9\ufff5\u00d1",
            "\0\u00d1",
            "\12\u00aa\1\u00a9\2\u00aa\1\u00a8\34\u00aa\1\u00a7\uffd5\u00aa",
            "",
            "",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00e4",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00ec",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\u00aa\1\u00a9\2\u00aa\1\u00a8\34\u00aa\1\u00a7\uffd5\u00aa",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0100",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0102",
            "",
            "\1\u0103",
            "\1\u0104",
            "",
            "\1\u0105",
            "\1\u0106",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0108",
            "\1\u0109",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0111",
            "",
            "",
            "\1\u0112",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0118",
            "\1\u0119",
            "",
            "\1\u011a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u011c",
            "\1\u011d",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u011f",
            "",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0121",
            "\1\u0122",
            "",
            "\1\u0123",
            "\1\u0124",
            "",
            "\1\u0125",
            "",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0130",
            "",
            "",
            "",
            "",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_SIMPLE_ID | RULE_BIG_INT | RULE_DOCUMENTATION | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='-') ) {s = 1;}

                        else if ( (LA14_0=='n') ) {s = 2;}

                        else if ( (LA14_0=='*') ) {s = 3;}

                        else if ( (LA14_0=='/') ) {s = 4;}

                        else if ( (LA14_0=='+') ) {s = 5;}

                        else if ( (LA14_0=='>') ) {s = 6;}

                        else if ( (LA14_0=='<') ) {s = 7;}

                        else if ( (LA14_0=='=') ) {s = 8;}

                        else if ( (LA14_0=='a') ) {s = 9;}

                        else if ( (LA14_0=='o') ) {s = 10;}

                        else if ( (LA14_0=='x') ) {s = 11;}

                        else if ( (LA14_0=='i') ) {s = 12;}

                        else if ( (LA14_0=='.') ) {s = 13;}

                        else if ( (LA14_0=='T') ) {s = 14;}

                        else if ( (LA14_0=='B') ) {s = 15;}

                        else if ( (LA14_0=='I') ) {s = 16;}

                        else if ( (LA14_0=='R') ) {s = 17;}

                        else if ( (LA14_0=='S') ) {s = 18;}

                        else if ( (LA14_0=='U') ) {s = 19;}

                        else if ( (LA14_0=='O') ) {s = 20;}

                        else if ( (LA14_0=='C') ) {s = 21;}

                        else if ( (LA14_0=='m') ) {s = 22;}

                        else if ( (LA14_0==';') ) {s = 23;}

                        else if ( (LA14_0=='c') ) {s = 24;}

                        else if ( (LA14_0==':') ) {s = 25;}

                        else if ( (LA14_0=='f') ) {s = 26;}

                        else if ( (LA14_0=='r') ) {s = 27;}

                        else if ( (LA14_0=='{') ) {s = 28;}

                        else if ( (LA14_0=='t') ) {s = 29;}

                        else if ( (LA14_0=='}') ) {s = 30;}

                        else if ( (LA14_0=='u') ) {s = 31;}

                        else if ( (LA14_0=='d') ) {s = 32;}

                        else if ( (LA14_0=='e') ) {s = 33;}

                        else if ( (LA14_0=='(') ) {s = 34;}

                        else if ( (LA14_0==')') ) {s = 35;}

                        else if ( (LA14_0=='h') ) {s = 36;}

                        else if ( (LA14_0==',') ) {s = 37;}

                        else if ( (LA14_0=='y') ) {s = 38;}

                        else if ( (LA14_0=='l') ) {s = 39;}

                        else if ( (LA14_0=='s') ) {s = 40;}

                        else if ( (LA14_0=='[') ) {s = 41;}

                        else if ( (LA14_0==']') ) {s = 42;}

                        else if ( (LA14_0=='|') ) {s = 43;}

                        else if ( (LA14_0=='\"') ) {s = 44;}

                        else if ( (LA14_0=='\'') ) {s = 45;}

                        else if ( (LA14_0=='A'||(LA14_0>='D' && LA14_0<='H')||(LA14_0>='J' && LA14_0<='N')||(LA14_0>='P' && LA14_0<='Q')||(LA14_0>='V' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='b'||LA14_0=='g'||(LA14_0>='j' && LA14_0<='k')||(LA14_0>='p' && LA14_0<='q')||(LA14_0>='v' && LA14_0<='w')||LA14_0=='z') ) {s = 46;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 47;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 48;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='?' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='^'||LA14_0=='`'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_45 = input.LA(1);

                        s = -1;
                        if ( ((LA14_45>='\u0000' && LA14_45<='\uFFFF')) ) {s = 118;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_123 = input.LA(1);

                        s = -1;
                        if ( (LA14_123=='*') ) {s = 167;}

                        else if ( (LA14_123=='\r') ) {s = 168;}

                        else if ( (LA14_123=='\n') ) {s = 169;}

                        else if ( ((LA14_123>='\u0000' && LA14_123<='\t')||(LA14_123>='\u000B' && LA14_123<='\f')||(LA14_123>='\u000E' && LA14_123<=')')||(LA14_123>='+' && LA14_123<='\uFFFF')) ) {s = 170;}

                        else s = 124;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_168 = input.LA(1);

                        s = -1;
                        if ( ((LA14_168>='\u0000' && LA14_168<='\t')||(LA14_168>='\u000B' && LA14_168<='\uFFFF')) ) {s = 209;}

                        else if ( (LA14_168=='\n') ) {s = 169;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_208 = input.LA(1);

                        s = -1;
                        if ( (LA14_208=='*') ) {s = 167;}

                        else if ( (LA14_208=='\r') ) {s = 168;}

                        else if ( (LA14_208=='\n') ) {s = 169;}

                        else if ( ((LA14_208>='\u0000' && LA14_208<='\t')||(LA14_208>='\u000B' && LA14_208<='\f')||(LA14_208>='\u000E' && LA14_208<=')')||(LA14_208>='+' && LA14_208<='\uFFFF')) ) {s = 170;}

                        else s = 209;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_170 = input.LA(1);

                        s = -1;
                        if ( (LA14_170=='*') ) {s = 167;}

                        else if ( (LA14_170=='\r') ) {s = 168;}

                        else if ( (LA14_170=='\n') ) {s = 169;}

                        else if ( ((LA14_170>='\u0000' && LA14_170<='\t')||(LA14_170>='\u000B' && LA14_170<='\f')||(LA14_170>='\u000E' && LA14_170<=')')||(LA14_170>='+' && LA14_170<='\uFFFF')) ) {s = 170;}

                        else s = 124;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_169 = input.LA(1);

                        s = -1;
                        if ( ((LA14_169>='\u0000' && LA14_169<='\uFFFF')) ) {s = 209;}

                        else s = 124;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_44 = input.LA(1);

                        s = -1;
                        if ( ((LA14_44>='\u0000' && LA14_44<='\uFFFF')) ) {s = 117;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_167 = input.LA(1);

                        s = -1;
                        if ( (LA14_167=='/') ) {s = 208;}

                        else if ( (LA14_167=='*') ) {s = 167;}

                        else if ( (LA14_167=='\r') ) {s = 168;}

                        else if ( (LA14_167=='\n') ) {s = 169;}

                        else if ( ((LA14_167>='\u0000' && LA14_167<='\t')||(LA14_167>='\u000B' && LA14_167<='\f')||(LA14_167>='\u000E' && LA14_167<=')')||(LA14_167>='+' && LA14_167<='.')||(LA14_167>='0' && LA14_167<='\uFFFF')) ) {s = 170;}

                        else s = 124;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}