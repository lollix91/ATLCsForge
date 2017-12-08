package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyOclLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BIG_INT=7;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=9;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=15;
    public static final int RULE_DOCUMENTATION=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=16;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
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
    public static final int RULE_STRING=17;
    public static final int RULE_UNQUOTED_STRING=6;
    public static final int RULE_SL_COMMENT=12;
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
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_SINGLE_QUOTED_STRING=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_DOUBLE_QUOTED_STRING=8;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
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

    public InternalMyOclLexer() {;} 
    public InternalMyOclLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyOclLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyOcl.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyOcl.g:11:7: ( '^' )
            // InternalMyOcl.g:11:9: '^'
            {
            match('^'); 

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
            // InternalMyOcl.g:12:7: ( '^^' )
            // InternalMyOcl.g:12:9: '^^'
            {
            match("^^"); 


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
            // InternalMyOcl.g:13:7: ( 'import' )
            // InternalMyOcl.g:13:9: 'import'
            {
            match("import"); 


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
            // InternalMyOcl.g:14:7: ( 'include' )
            // InternalMyOcl.g:14:9: 'include'
            {
            match("include"); 


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
            // InternalMyOcl.g:15:7: ( 'library' )
            // InternalMyOcl.g:15:9: 'library'
            {
            match("library"); 


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
            // InternalMyOcl.g:16:7: ( '-' )
            // InternalMyOcl.g:16:9: '-'
            {
            match('-'); 

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
            // InternalMyOcl.g:17:7: ( 'not' )
            // InternalMyOcl.g:17:9: 'not'
            {
            match("not"); 


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
            // InternalMyOcl.g:18:7: ( '*' )
            // InternalMyOcl.g:18:9: '*'
            {
            match('*'); 

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
            // InternalMyOcl.g:19:7: ( '/' )
            // InternalMyOcl.g:19:9: '/'
            {
            match('/'); 

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
            // InternalMyOcl.g:20:7: ( '+' )
            // InternalMyOcl.g:20:9: '+'
            {
            match('+'); 

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
            // InternalMyOcl.g:21:7: ( '>' )
            // InternalMyOcl.g:21:9: '>'
            {
            match('>'); 

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
            // InternalMyOcl.g:22:7: ( '<' )
            // InternalMyOcl.g:22:9: '<'
            {
            match('<'); 

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
            // InternalMyOcl.g:23:7: ( '>=' )
            // InternalMyOcl.g:23:9: '>='
            {
            match(">="); 


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
            // InternalMyOcl.g:24:7: ( '<=' )
            // InternalMyOcl.g:24:9: '<='
            {
            match("<="); 


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
            // InternalMyOcl.g:25:7: ( '=' )
            // InternalMyOcl.g:25:9: '='
            {
            match('='); 

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
            // InternalMyOcl.g:26:7: ( '<>' )
            // InternalMyOcl.g:26:9: '<>'
            {
            match("<>"); 


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
            // InternalMyOcl.g:27:7: ( 'and' )
            // InternalMyOcl.g:27:9: 'and'
            {
            match("and"); 


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
            // InternalMyOcl.g:28:7: ( 'or' )
            // InternalMyOcl.g:28:9: 'or'
            {
            match("or"); 


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
            // InternalMyOcl.g:29:7: ( 'xor' )
            // InternalMyOcl.g:29:9: 'xor'
            {
            match("xor"); 


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
            // InternalMyOcl.g:30:7: ( 'implies' )
            // InternalMyOcl.g:30:9: 'implies'
            {
            match("implies"); 


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
            // InternalMyOcl.g:31:7: ( '.' )
            // InternalMyOcl.g:31:9: '.'
            {
            match('.'); 

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
            // InternalMyOcl.g:32:7: ( '->' )
            // InternalMyOcl.g:32:9: '->'
            {
            match("->"); 


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
            // InternalMyOcl.g:33:7: ( 'Tuple' )
            // InternalMyOcl.g:33:9: 'Tuple'
            {
            match("Tuple"); 


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
            // InternalMyOcl.g:34:7: ( 'Boolean' )
            // InternalMyOcl.g:34:9: 'Boolean'
            {
            match("Boolean"); 


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
            // InternalMyOcl.g:35:7: ( 'Integer' )
            // InternalMyOcl.g:35:9: 'Integer'
            {
            match("Integer"); 


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
            // InternalMyOcl.g:36:7: ( 'Real' )
            // InternalMyOcl.g:36:9: 'Real'
            {
            match("Real"); 


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
            // InternalMyOcl.g:37:7: ( 'String' )
            // InternalMyOcl.g:37:9: 'String'
            {
            match("String"); 


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
            // InternalMyOcl.g:38:7: ( 'UnlimitedNatural' )
            // InternalMyOcl.g:38:9: 'UnlimitedNatural'
            {
            match("UnlimitedNatural"); 


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
            // InternalMyOcl.g:39:7: ( 'OclAny' )
            // InternalMyOcl.g:39:9: 'OclAny'
            {
            match("OclAny"); 


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
            // InternalMyOcl.g:40:7: ( 'OclInvalid' )
            // InternalMyOcl.g:40:9: 'OclInvalid'
            {
            match("OclInvalid"); 


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
            // InternalMyOcl.g:41:7: ( 'OclVoid' )
            // InternalMyOcl.g:41:9: 'OclVoid'
            {
            match("OclVoid"); 


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
            // InternalMyOcl.g:42:7: ( 'Set' )
            // InternalMyOcl.g:42:9: 'Set'
            {
            match("Set"); 


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
            // InternalMyOcl.g:43:7: ( 'Bag' )
            // InternalMyOcl.g:43:9: 'Bag'
            {
            match("Bag"); 


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
            // InternalMyOcl.g:44:7: ( 'Sequence' )
            // InternalMyOcl.g:44:9: 'Sequence'
            {
            match("Sequence"); 


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
            // InternalMyOcl.g:45:7: ( 'Collection' )
            // InternalMyOcl.g:45:9: 'Collection'
            {
            match("Collection"); 


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
            // InternalMyOcl.g:46:7: ( 'OrderedSet' )
            // InternalMyOcl.g:46:9: 'OrderedSet'
            {
            match("OrderedSet"); 


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
            // InternalMyOcl.g:47:7: ( 'context' )
            // InternalMyOcl.g:47:9: 'context'
            {
            match("context"); 


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
            // InternalMyOcl.g:48:7: ( 'inv' )
            // InternalMyOcl.g:48:9: 'inv'
            {
            match("inv"); 


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
            // InternalMyOcl.g:49:7: ( ':' )
            // InternalMyOcl.g:49:9: ':'
            {
            match(':'); 

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
            // InternalMyOcl.g:50:7: ( '(' )
            // InternalMyOcl.g:50:9: '('
            {
            match('('); 

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
            // InternalMyOcl.g:51:7: ( ')' )
            // InternalMyOcl.g:51:9: ')'
            {
            match(')'); 

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
            // InternalMyOcl.g:52:7: ( 'def' )
            // InternalMyOcl.g:52:9: 'def'
            {
            match("def"); 


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
            // InternalMyOcl.g:53:7: ( ',' )
            // InternalMyOcl.g:53:9: ','
            {
            match(','); 

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
            // InternalMyOcl.g:54:7: ( 'pre' )
            // InternalMyOcl.g:54:9: 'pre'
            {
            match("pre"); 


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
            // InternalMyOcl.g:55:7: ( 'post' )
            // InternalMyOcl.g:55:9: 'post'
            {
            match("post"); 


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
            // InternalMyOcl.g:56:7: ( 'body' )
            // InternalMyOcl.g:56:9: 'body'
            {
            match("body"); 


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
            // InternalMyOcl.g:57:7: ( 'package' )
            // InternalMyOcl.g:57:9: 'package'
            {
            match("package"); 


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
            // InternalMyOcl.g:58:7: ( 'endpackage' )
            // InternalMyOcl.g:58:9: 'endpackage'
            {
            match("endpackage"); 


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
            // InternalMyOcl.g:59:7: ( 'derive' )
            // InternalMyOcl.g:59:9: 'derive'
            {
            match("derive"); 


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
            // InternalMyOcl.g:60:7: ( 'init' )
            // InternalMyOcl.g:60:9: 'init'
            {
            match("init"); 


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
            // InternalMyOcl.g:61:7: ( '::' )
            // InternalMyOcl.g:61:9: '::'
            {
            match("::"); 


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
            // InternalMyOcl.g:62:7: ( '?' )
            // InternalMyOcl.g:62:9: '?'
            {
            match('?'); 

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
            // InternalMyOcl.g:63:7: ( '{' )
            // InternalMyOcl.g:63:9: '{'
            {
            match('{'); 

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
            // InternalMyOcl.g:64:7: ( '}' )
            // InternalMyOcl.g:64:9: '}'
            {
            match('}'); 

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
            // InternalMyOcl.g:65:7: ( '..' )
            // InternalMyOcl.g:65:9: '..'
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
            // InternalMyOcl.g:66:7: ( 'invalid' )
            // InternalMyOcl.g:66:9: 'invalid'
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
            // InternalMyOcl.g:67:7: ( 'null' )
            // InternalMyOcl.g:67:9: 'null'
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
            // InternalMyOcl.g:68:7: ( 'if' )
            // InternalMyOcl.g:68:9: 'if'
            {
            match("if"); 


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
            // InternalMyOcl.g:69:7: ( 'then' )
            // InternalMyOcl.g:69:9: 'then'
            {
            match("then"); 


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
            // InternalMyOcl.g:70:7: ( 'else' )
            // InternalMyOcl.g:70:9: 'else'
            {
            match("else"); 


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
            // InternalMyOcl.g:71:7: ( 'endif' )
            // InternalMyOcl.g:71:9: 'endif'
            {
            match("endif"); 


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
            // InternalMyOcl.g:72:7: ( 'let' )
            // InternalMyOcl.g:72:9: 'let'
            {
            match("let"); 


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
            // InternalMyOcl.g:73:7: ( 'in' )
            // InternalMyOcl.g:73:9: 'in'
            {
            match("in"); 


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
            // InternalMyOcl.g:74:7: ( 'self' )
            // InternalMyOcl.g:74:9: 'self'
            {
            match("self"); 


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
            // InternalMyOcl.g:75:7: ( '[' )
            // InternalMyOcl.g:75:9: '['
            {
            match('['); 

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
            // InternalMyOcl.g:76:7: ( ']' )
            // InternalMyOcl.g:76:9: ']'
            {
            match(']'); 

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
            // InternalMyOcl.g:77:7: ( 'static' )
            // InternalMyOcl.g:77:9: 'static'
            {
            match("static"); 


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
            // InternalMyOcl.g:78:7: ( '::*' )
            // InternalMyOcl.g:78:9: '::*'
            {
            match("::*"); 


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
            // InternalMyOcl.g:79:7: ( 'true' )
            // InternalMyOcl.g:79:9: 'true'
            {
            match("true"); 


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
            // InternalMyOcl.g:80:7: ( 'false' )
            // InternalMyOcl.g:80:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyOcl.g:81:7: ( '|' )
            // InternalMyOcl.g:81:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyOcl.g:82:7: ( ';' )
            // InternalMyOcl.g:82:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "RULE_UNQUOTED_STRING"
    public final void mRULE_UNQUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_UNQUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyOcl.g:12294:22: ( '\\u00C2\\u00A3$%^\\u00C2\\u00A3$%^' )
            // InternalMyOcl.g:12294:24: '\\u00C2\\u00A3$%^\\u00C2\\u00A3$%^'
            {
            match("\u00C2\u00A3$%^\u00C2\u00A3$%^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNQUOTED_STRING"

    // $ANTLR start "RULE_DOUBLE_QUOTED_STRING"
    public final void mRULE_DOUBLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyOcl.g:12296:27: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalMyOcl.g:12296:29: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalMyOcl.g:12296:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalMyOcl.g:12296:34: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalMyOcl.g:12296:79: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalMyOcl.g:12298:27: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalMyOcl.g:12298:29: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalMyOcl.g:12298:34: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
            	    // InternalMyOcl.g:12298:35: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalMyOcl.g:12298:80: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalMyOcl.g:12300:30: ( '/\\'' ( options {greedy=false; } : . )* '\\'/' )
            // InternalMyOcl.g:12300:32: '/\\'' ( options {greedy=false; } : . )* '\\'/'
            {
            match("/'"); 

            // InternalMyOcl.g:12300:38: ( options {greedy=false; } : . )*
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
            	    // InternalMyOcl.g:12300:66: .
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
            // InternalMyOcl.g:12302:16: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyOcl.g:12302:18: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyOcl.g:12302:42: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyOcl.g:
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
            // InternalMyOcl.g:12304:14: ( ( '0' .. '9' )+ )
            // InternalMyOcl.g:12304:16: ( '0' .. '9' )+
            {
            // InternalMyOcl.g:12304:16: ( '0' .. '9' )+
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
            	    // InternalMyOcl.g:12304:17: '0' .. '9'
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
            // InternalMyOcl.g:12306:20: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalMyOcl.g:12306:22: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalMyOcl.g:12306:28: ( options {greedy=false; } : . )*
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
            	    // InternalMyOcl.g:12306:56: .
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
            // InternalMyOcl.g:12308:17: ( '/*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyOcl.g:12308:19: '/*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("/*"); 

            // InternalMyOcl.g:12308:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyOcl.g:12308:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalMyOcl.g:12308:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyOcl.g:12308:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyOcl.g:12308:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyOcl.g:12308:41: '\\r'
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
            // InternalMyOcl.g:12310:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyOcl.g:12310:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // InternalMyOcl.g:12310:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyOcl.g:12310:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalMyOcl.g:12310:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyOcl.g:12310:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyOcl.g:12310:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMyOcl.g:12310:41: '\\r'
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
            // InternalMyOcl.g:12312:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyOcl.g:12312:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyOcl.g:12312:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalMyOcl.g:
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
            // InternalMyOcl.g:12314:16: ( . )
            // InternalMyOcl.g:12314:18: .
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
            // InternalMyOcl.g:12316:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyOcl.g:12316:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyOcl.g:12316:11: ( '^' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='^') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyOcl.g:12316:11: '^'
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

            // InternalMyOcl.g:12316:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyOcl.g:
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
            // InternalMyOcl.g:12318:10: ( ( '0' .. '9' )+ )
            // InternalMyOcl.g:12318:12: ( '0' .. '9' )+
            {
            // InternalMyOcl.g:12318:12: ( '0' .. '9' )+
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
            	    // InternalMyOcl.g:12318:13: '0' .. '9'
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
            // InternalMyOcl.g:12320:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyOcl.g:12320:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyOcl.g:12320:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalMyOcl.g:12320:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyOcl.g:12320:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalMyOcl.g:12320:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyOcl.g:12320:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalMyOcl.g:12320:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyOcl.g:12320:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalMyOcl.g:12320:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyOcl.g:12320:61: ~ ( ( '\\\\' | '\\'' ) )
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
        // InternalMyOcl.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | RULE_UNQUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_SIMPLE_ID | RULE_BIG_INT | RULE_DOCUMENTATION | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER | RULE_ID | RULE_INT | RULE_STRING )
        int alt20=86;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalMyOcl.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalMyOcl.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalMyOcl.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalMyOcl.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalMyOcl.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalMyOcl.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalMyOcl.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalMyOcl.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalMyOcl.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // InternalMyOcl.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // InternalMyOcl.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // InternalMyOcl.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // InternalMyOcl.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // InternalMyOcl.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // InternalMyOcl.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // InternalMyOcl.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // InternalMyOcl.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // InternalMyOcl.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // InternalMyOcl.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // InternalMyOcl.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // InternalMyOcl.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // InternalMyOcl.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // InternalMyOcl.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // InternalMyOcl.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // InternalMyOcl.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // InternalMyOcl.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // InternalMyOcl.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // InternalMyOcl.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // InternalMyOcl.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // InternalMyOcl.g:1:184: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // InternalMyOcl.g:1:190: T__48
                {
                mT__48(); 

                }
                break;
            case 32 :
                // InternalMyOcl.g:1:196: T__49
                {
                mT__49(); 

                }
                break;
            case 33 :
                // InternalMyOcl.g:1:202: T__50
                {
                mT__50(); 

                }
                break;
            case 34 :
                // InternalMyOcl.g:1:208: T__51
                {
                mT__51(); 

                }
                break;
            case 35 :
                // InternalMyOcl.g:1:214: T__52
                {
                mT__52(); 

                }
                break;
            case 36 :
                // InternalMyOcl.g:1:220: T__53
                {
                mT__53(); 

                }
                break;
            case 37 :
                // InternalMyOcl.g:1:226: T__54
                {
                mT__54(); 

                }
                break;
            case 38 :
                // InternalMyOcl.g:1:232: T__55
                {
                mT__55(); 

                }
                break;
            case 39 :
                // InternalMyOcl.g:1:238: T__56
                {
                mT__56(); 

                }
                break;
            case 40 :
                // InternalMyOcl.g:1:244: T__57
                {
                mT__57(); 

                }
                break;
            case 41 :
                // InternalMyOcl.g:1:250: T__58
                {
                mT__58(); 

                }
                break;
            case 42 :
                // InternalMyOcl.g:1:256: T__59
                {
                mT__59(); 

                }
                break;
            case 43 :
                // InternalMyOcl.g:1:262: T__60
                {
                mT__60(); 

                }
                break;
            case 44 :
                // InternalMyOcl.g:1:268: T__61
                {
                mT__61(); 

                }
                break;
            case 45 :
                // InternalMyOcl.g:1:274: T__62
                {
                mT__62(); 

                }
                break;
            case 46 :
                // InternalMyOcl.g:1:280: T__63
                {
                mT__63(); 

                }
                break;
            case 47 :
                // InternalMyOcl.g:1:286: T__64
                {
                mT__64(); 

                }
                break;
            case 48 :
                // InternalMyOcl.g:1:292: T__65
                {
                mT__65(); 

                }
                break;
            case 49 :
                // InternalMyOcl.g:1:298: T__66
                {
                mT__66(); 

                }
                break;
            case 50 :
                // InternalMyOcl.g:1:304: T__67
                {
                mT__67(); 

                }
                break;
            case 51 :
                // InternalMyOcl.g:1:310: T__68
                {
                mT__68(); 

                }
                break;
            case 52 :
                // InternalMyOcl.g:1:316: T__69
                {
                mT__69(); 

                }
                break;
            case 53 :
                // InternalMyOcl.g:1:322: T__70
                {
                mT__70(); 

                }
                break;
            case 54 :
                // InternalMyOcl.g:1:328: T__71
                {
                mT__71(); 

                }
                break;
            case 55 :
                // InternalMyOcl.g:1:334: T__72
                {
                mT__72(); 

                }
                break;
            case 56 :
                // InternalMyOcl.g:1:340: T__73
                {
                mT__73(); 

                }
                break;
            case 57 :
                // InternalMyOcl.g:1:346: T__74
                {
                mT__74(); 

                }
                break;
            case 58 :
                // InternalMyOcl.g:1:352: T__75
                {
                mT__75(); 

                }
                break;
            case 59 :
                // InternalMyOcl.g:1:358: T__76
                {
                mT__76(); 

                }
                break;
            case 60 :
                // InternalMyOcl.g:1:364: T__77
                {
                mT__77(); 

                }
                break;
            case 61 :
                // InternalMyOcl.g:1:370: T__78
                {
                mT__78(); 

                }
                break;
            case 62 :
                // InternalMyOcl.g:1:376: T__79
                {
                mT__79(); 

                }
                break;
            case 63 :
                // InternalMyOcl.g:1:382: T__80
                {
                mT__80(); 

                }
                break;
            case 64 :
                // InternalMyOcl.g:1:388: T__81
                {
                mT__81(); 

                }
                break;
            case 65 :
                // InternalMyOcl.g:1:394: T__82
                {
                mT__82(); 

                }
                break;
            case 66 :
                // InternalMyOcl.g:1:400: T__83
                {
                mT__83(); 

                }
                break;
            case 67 :
                // InternalMyOcl.g:1:406: T__84
                {
                mT__84(); 

                }
                break;
            case 68 :
                // InternalMyOcl.g:1:412: T__85
                {
                mT__85(); 

                }
                break;
            case 69 :
                // InternalMyOcl.g:1:418: T__86
                {
                mT__86(); 

                }
                break;
            case 70 :
                // InternalMyOcl.g:1:424: T__87
                {
                mT__87(); 

                }
                break;
            case 71 :
                // InternalMyOcl.g:1:430: T__88
                {
                mT__88(); 

                }
                break;
            case 72 :
                // InternalMyOcl.g:1:436: T__89
                {
                mT__89(); 

                }
                break;
            case 73 :
                // InternalMyOcl.g:1:442: RULE_UNQUOTED_STRING
                {
                mRULE_UNQUOTED_STRING(); 

                }
                break;
            case 74 :
                // InternalMyOcl.g:1:463: RULE_DOUBLE_QUOTED_STRING
                {
                mRULE_DOUBLE_QUOTED_STRING(); 

                }
                break;
            case 75 :
                // InternalMyOcl.g:1:489: RULE_SINGLE_QUOTED_STRING
                {
                mRULE_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 76 :
                // InternalMyOcl.g:1:515: RULE_ML_SINGLE_QUOTED_STRING
                {
                mRULE_ML_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 77 :
                // InternalMyOcl.g:1:544: RULE_SIMPLE_ID
                {
                mRULE_SIMPLE_ID(); 

                }
                break;
            case 78 :
                // InternalMyOcl.g:1:559: RULE_BIG_INT
                {
                mRULE_BIG_INT(); 

                }
                break;
            case 79 :
                // InternalMyOcl.g:1:572: RULE_DOCUMENTATION
                {
                mRULE_DOCUMENTATION(); 

                }
                break;
            case 80 :
                // InternalMyOcl.g:1:591: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 81 :
                // InternalMyOcl.g:1:607: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 82 :
                // InternalMyOcl.g:1:623: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 83 :
                // InternalMyOcl.g:1:631: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;
            case 84 :
                // InternalMyOcl.g:1:646: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 85 :
                // InternalMyOcl.g:1:654: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 86 :
                // InternalMyOcl.g:1:663: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\1\uffff\1\64\2\71\1\76\1\71\1\uffff\1\104\1\uffff\1\107\1\112\1\uffff\3\71\1\120\11\71\1\136\2\uffff\1\71\1\uffff\3\71\3\uffff\2\71\2\uffff\1\71\2\uffff\3\61\1\71\1\174\5\uffff\1\71\1\u0083\1\u0084\1\71\1\uffff\2\71\3\uffff\2\71\2\uffff\1\u008a\10\uffff\1\71\1\u008c\1\71\2\uffff\14\71\1\u009c\3\uffff\1\71\1\uffff\6\71\3\uffff\4\71\2\uffff\1\71\12\uffff\1\174\1\uffff\2\71\1\u00b3\1\71\2\uffff\1\71\1\u00b6\1\u00b7\1\71\1\u008a\1\uffff\1\u00bd\1\uffff\1\u00be\2\71\1\u00c1\3\71\1\u00c5\6\71\2\uffff\1\u00ce\1\71\1\u00d0\12\71\5\uffff\4\71\1\uffff\1\u00e0\1\71\2\uffff\1\u00e2\1\u008a\1\uffff\2\u008a\2\uffff\2\71\1\uffff\1\71\1\u00e8\1\71\1\uffff\10\71\1\uffff\1\71\1\uffff\1\u00f3\1\71\1\u00f5\2\71\1\u00f8\1\u00f9\1\u00fa\1\u00fb\6\71\1\uffff\1\71\1\uffff\1\u00e4\1\uffff\1\u0103\2\71\1\uffff\12\71\1\uffff\1\71\1\uffff\1\71\1\u0112\4\uffff\1\71\1\u0114\1\u0115\4\71\1\uffff\2\71\1\u011c\2\71\1\u011f\5\71\1\u0125\2\71\1\uffff\1\u0128\2\uffff\1\u0129\1\u012a\1\u012b\1\u012c\1\u012d\1\u012e\1\uffff\2\71\1\uffff\1\71\1\u0132\2\71\1\u0135\1\uffff\1\u0136\1\71\7\uffff\1\u0138\2\71\1\uffff\2\71\2\uffff\1\71\1\uffff\6\71\1\u0144\1\u0145\1\u0146\1\u0147\1\71\4\uffff\4\71\1\u014d\1\uffff";
    static final String DFA20_eofS =
        "\u014e\uffff";
    static final String DFA20_minS =
        "\1\0\1\101\2\60\1\55\1\60\1\uffff\1\47\1\uffff\2\75\1\uffff\3\60\1\56\11\60\1\72\2\uffff\1\60\1\uffff\3\60\3\uffff\2\60\2\uffff\1\60\2\uffff\1\u00a3\2\0\2\60\5\uffff\4\60\1\uffff\2\60\3\uffff\2\60\2\uffff\1\52\10\uffff\3\60\2\uffff\14\60\1\52\3\uffff\1\60\1\uffff\6\60\3\uffff\4\60\2\uffff\1\60\3\uffff\2\0\1\uffff\2\0\2\uffff\1\60\1\uffff\4\60\2\uffff\4\60\1\0\1\uffff\1\60\1\uffff\16\60\2\uffff\15\60\1\0\2\uffff\1\0\1\uffff\4\60\1\uffff\2\60\2\uffff\1\60\4\0\2\uffff\2\60\1\uffff\3\60\1\uffff\10\60\1\uffff\1\60\1\uffff\17\60\1\uffff\1\60\1\uffff\1\0\1\uffff\3\60\1\uffff\12\60\1\uffff\1\60\1\uffff\2\60\4\uffff\7\60\1\uffff\16\60\1\uffff\1\60\2\uffff\6\60\1\uffff\2\60\1\uffff\5\60\1\uffff\2\60\7\uffff\3\60\1\uffff\2\60\2\uffff\1\60\1\uffff\13\60\4\uffff\5\60\1\uffff";
    static final String DFA20_maxS =
        "\1\uffff\3\172\1\76\1\172\1\uffff\1\52\1\uffff\1\75\1\76\1\uffff\3\172\1\56\11\172\1\72\2\uffff\1\172\1\uffff\3\172\3\uffff\2\172\2\uffff\1\172\2\uffff\1\u00a3\2\uffff\1\172\1\71\5\uffff\4\172\1\uffff\2\172\3\uffff\2\172\2\uffff\1\52\10\uffff\3\172\2\uffff\14\172\1\52\3\uffff\1\172\1\uffff\6\172\3\uffff\4\172\2\uffff\1\172\3\uffff\2\uffff\1\uffff\2\uffff\2\uffff\1\71\1\uffff\4\172\2\uffff\4\172\1\uffff\1\uffff\1\172\1\uffff\16\172\2\uffff\15\172\1\uffff\2\uffff\1\uffff\1\uffff\4\172\1\uffff\2\172\2\uffff\1\172\4\uffff\2\uffff\2\172\1\uffff\3\172\1\uffff\10\172\1\uffff\1\172\1\uffff\17\172\1\uffff\1\172\1\uffff\1\uffff\1\uffff\3\172\1\uffff\12\172\1\uffff\1\172\1\uffff\2\172\4\uffff\7\172\1\uffff\16\172\1\uffff\1\172\2\uffff\6\172\1\uffff\2\172\1\uffff\5\172\1\uffff\2\172\7\uffff\3\172\1\uffff\2\172\2\uffff\1\172\1\uffff\13\172\4\uffff\5\172\1\uffff";
    static final String DFA20_acceptS =
        "\6\uffff\1\10\1\uffff\1\12\2\uffff\1\17\16\uffff\1\50\1\51\1\uffff\1\53\3\uffff\1\64\1\65\1\66\2\uffff\1\101\1\102\1\uffff\1\107\1\110\5\uffff\1\122\1\123\1\2\1\124\1\1\4\uffff\1\115\2\uffff\1\26\1\121\1\6\2\uffff\1\10\1\114\1\uffff\1\11\1\12\1\15\1\13\1\16\1\20\1\14\1\17\3\uffff\1\67\1\25\15\uffff\1\47\1\50\1\51\1\uffff\1\53\6\uffff\1\64\1\65\1\66\4\uffff\1\101\1\102\1\uffff\1\107\1\110\1\111\2\uffff\1\112\2\uffff\1\113\1\116\1\uffff\1\122\4\uffff\1\77\1\72\5\uffff\1\120\1\uffff\1\22\16\uffff\1\104\1\63\16\uffff\1\126\1\112\1\uffff\1\113\4\uffff\1\46\2\uffff\1\76\1\7\5\uffff\1\21\1\23\2\uffff\1\41\3\uffff\1\40\10\uffff\1\52\1\uffff\1\54\17\uffff\1\62\1\uffff\1\71\1\uffff\1\117\3\uffff\1\32\12\uffff\1\55\1\uffff\1\56\2\uffff\1\74\1\73\1\105\1\100\7\uffff\1\27\16\uffff\1\75\1\uffff\1\106\1\3\6\uffff\1\33\2\uffff\1\35\5\uffff\1\61\2\uffff\1\103\1\24\1\4\1\70\1\5\1\30\1\31\3\uffff\1\37\2\uffff\1\45\1\57\1\uffff\1\42\13\uffff\1\36\1\44\1\43\1\60\5\uffff\1\34";
    static final String DFA20_specialS =
        "\1\10\53\uffff\1\3\1\12\110\uffff\1\0\1\6\1\uffff\1\2\1\14\16\uffff\1\15\40\uffff\1\5\2\uffff\1\13\13\uffff\1\7\1\1\1\4\1\16\46\uffff\1\11\152\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\61\2\60\2\61\1\60\22\61\1\60\1\61\1\54\4\61\1\55\1\32\1\33\1\6\1\10\1\35\1\4\1\17\1\7\12\57\1\31\1\52\1\12\1\13\1\11\1\41\1\61\1\56\1\21\1\27\5\56\1\22\5\56\1\26\2\56\1\23\1\24\1\20\1\25\5\56\1\46\1\61\1\47\1\1\1\56\1\61\1\14\1\37\1\30\1\34\1\40\1\50\2\56\1\2\2\56\1\3\1\56\1\5\1\15\1\36\2\56\1\45\1\44\3\56\1\16\2\56\1\42\1\51\1\43\104\61\1\53\uff3d\61",
            "\32\63\3\uffff\1\62\1\63\1\uffff\32\63",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\5\70\1\67\6\70\1\65\1\66\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\73\3\70\1\72\21\70",
            "\1\75\20\uffff\1\74",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\77\5\70\1\100\5\70",
            "",
            "\1\102\2\uffff\1\103",
            "",
            "\1\106",
            "\1\110\1\111",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\114\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\115\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\116\13\70",
            "\1\117",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\121\5\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\123\15\70\1\122\13\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\124\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\125\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\127\16\70\1\126\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\130\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\131\16\70\1\132\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\133\13\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\134\13\70",
            "\1\135",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\141\25\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\145\15\70\1\144\2\70\1\143\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\146\13\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\150\1\70\1\147\14\70",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\7\70\1\154\11\70\1\155\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\156\16\70\1\157\6\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\162\31\70",
            "",
            "",
            "\1\165",
            "\42\167\1\170\71\167\1\166\uffa3\167",
            "\47\172\1\173\64\172\1\171\uffa3\172",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\175",
            "",
            "",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\17\70\1\177\12\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u0080\5\70\1\u0082\14\70\1\u0081\4\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\70\1\u0085\30\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u0086\6\70",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u0087\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u0088\16\70",
            "",
            "",
            "\1\u0089",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\3\70\1\u008b\26\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u008d\10\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\17\70\1\u008e\12\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\u008f\13\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\6\70\1\u0090\23\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u0091\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u0092\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u0093\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\20\70\1\u0095\2\70\1\u0094\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u0096\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u0097\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\3\70\1\u0098\26\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u0099\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u009a\14\70",
            "\1\u009b",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\5\70\1\u009d\13\70\1\u009e\10\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u009f\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\u00a0\7\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u00a1\27\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\3\70\1\u00a2\26\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\3\70\1\u00a3\26\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\u00a4\7\70",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00a5\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u00a6\5\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u00a7\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u00a8\31\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u00a9\16\70",
            "",
            "",
            "",
            "\42\u00ab\1\u00aa\4\u00ab\1\u00aa\64\u00ab\1\u00aa\5\u00ab\1\u00aa\3\u00ab\1\u00aa\7\u00ab\1\u00aa\3\u00ab\1\u00aa\1\u00ab\2\u00aa\uff8a\u00ab",
            "\42\167\1\170\71\167\1\166\uffa3\167",
            "",
            "\42\u00ab\1\u00ad\4\u00ab\1\u00ad\64\u00ab\1\u00ad\5\u00ab\1\u00ad\3\u00ab\1\u00ad\7\u00ab\1\u00ad\3\u00ab\1\u00ad\1\u00ab\2\u00ad\uff8a\u00ab",
            "\47\172\1\173\64\172\1\171\uffa3\172",
            "",
            "",
            "\12\175",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u00b0\2\70\1\u00af\13\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u00b1\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u00b2\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00b4\6\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u00b5\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u00b8\16\70",
            "\12\u00bc\1\u00bb\2\u00bc\1\u00ba\34\u00bc\1\u00b9\uffd5\u00bc",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u00bf\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u00c0\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00c2\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u00c3\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u00c4\21\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u00c6\5\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u00c7\21\70",
            "\12\70\7\uffff\1\u00c8\7\70\1\u00c9\14\70\1\u00ca\4\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00cb\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u00cc\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00cd\6\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u00cf\21\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00d1\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\12\70\1\u00d2\17\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\30\70\1\u00d3\1\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u00d5\6\70\1\u00d4\12\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00d6\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u00d7\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00d8\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\5\70\1\u00d9\24\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00da\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\u00db\7\70",
            "\42\167\1\170\71\167\1\166\uffa3\167",
            "",
            "",
            "\47\172\1\173\64\172\1\171\uffa3\172",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u00dc\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u00dd\21\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u00de\5\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u00df\16\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u00e1\31\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\u00bc\1\u00bb\2\u00bc\1\u00ba\34\u00bc\1\u00b9\4\u00bc\1\u00e3\uffd0\u00bc",
            "\12\u00e4\1\u00bb\ufff5\u00e4",
            "\0\u00e4",
            "\12\u00bc\1\u00bb\2\u00bc\1\u00ba\34\u00bc\1\u00b9\uffd5\u00bc",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00e5\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00e6\25\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\6\70\1\u00e7\23\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u00e9\14\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00ea\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\14\70\1\u00eb\15\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u00ec\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u00ed\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\u00ee\13\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u00ef\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00f0\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00f1\25\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\25\70\1\u00f2\4\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u00f4\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u00f6\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\5\70\1\u00f7\24\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u00fc\21\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00fd\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00fe\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00ff\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\3\70\1\u0100\26\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u0101\21\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u0102\10\70",
            "",
            "\12\u00bc\1\u00bb\2\u00bc\1\u00ba\34\u00bc\1\u00b9\uffd5\u00bc",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u0104\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u0105\25\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\6\70\1\u0106\23\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u0107\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u0108\21\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\30\70\1\u0109\1\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\25\70\1\u010a\4\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u010b\21\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u010c\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u010d\27\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\27\70\1\u010e\2\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u010f\25\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\6\70\1\u0110\23\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u0111\27\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u0113\27\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\u0116\7\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u0117\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\3\70\1\u0118\26\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\30\70\1\u0119\1\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u011a\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u011b\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u011d\27\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u011e\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u0120\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\3\70\1\u0121\26\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\3\70\1\u0122\26\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u0123\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u0124\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u0126\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\12\70\1\u0127\17\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u012f\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u0130\25\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u0131\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\22\70\1\u0133\7\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u0134\21\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u0137\31\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\3\70\1\u0139\26\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u013a\21\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u013b\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\u013c\13\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\6\70\1\u013d\23\70",
            "",
            "\12\70\7\uffff\15\70\1\u013e\14\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\3\70\1\u013f\26\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u0140\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u0141\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u0142\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u0143\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u0148\6\70",
            "",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u0149\5\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u014a\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u014b\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u014c\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
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
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | RULE_UNQUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_SIMPLE_ID | RULE_BIG_INT | RULE_DOCUMENTATION | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER | RULE_ID | RULE_INT | RULE_STRING );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_118 = input.LA(1);

                        s = -1;
                        if ( (LA20_118=='\"'||LA20_118=='\''||LA20_118=='\\'||LA20_118=='b'||LA20_118=='f'||LA20_118=='n'||LA20_118=='r'||(LA20_118>='t' && LA20_118<='u')) ) {s = 170;}

                        else if ( ((LA20_118>='\u0000' && LA20_118<='!')||(LA20_118>='#' && LA20_118<='&')||(LA20_118>='(' && LA20_118<='[')||(LA20_118>=']' && LA20_118<='a')||(LA20_118>='c' && LA20_118<='e')||(LA20_118>='g' && LA20_118<='m')||(LA20_118>='o' && LA20_118<='q')||LA20_118=='s'||(LA20_118>='v' && LA20_118<='\uFFFF')) ) {s = 171;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_186 = input.LA(1);

                        s = -1;
                        if ( ((LA20_186>='\u0000' && LA20_186<='\t')||(LA20_186>='\u000B' && LA20_186<='\uFFFF')) ) {s = 228;}

                        else if ( (LA20_186=='\n') ) {s = 187;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_121 = input.LA(1);

                        s = -1;
                        if ( (LA20_121=='\"'||LA20_121=='\''||LA20_121=='\\'||LA20_121=='b'||LA20_121=='f'||LA20_121=='n'||LA20_121=='r'||(LA20_121>='t' && LA20_121<='u')) ) {s = 173;}

                        else if ( ((LA20_121>='\u0000' && LA20_121<='!')||(LA20_121>='#' && LA20_121<='&')||(LA20_121>='(' && LA20_121<='[')||(LA20_121>=']' && LA20_121<='a')||(LA20_121>='c' && LA20_121<='e')||(LA20_121>='g' && LA20_121<='m')||(LA20_121>='o' && LA20_121<='q')||LA20_121=='s'||(LA20_121>='v' && LA20_121<='\uFFFF')) ) {s = 171;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_44 = input.LA(1);

                        s = -1;
                        if ( (LA20_44=='\\') ) {s = 118;}

                        else if ( ((LA20_44>='\u0000' && LA20_44<='!')||(LA20_44>='#' && LA20_44<='[')||(LA20_44>=']' && LA20_44<='\uFFFF')) ) {s = 119;}

                        else if ( (LA20_44=='\"') ) {s = 120;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_187 = input.LA(1);

                        s = -1;
                        if ( ((LA20_187>='\u0000' && LA20_187<='\uFFFF')) ) {s = 228;}

                        else s = 138;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_170 = input.LA(1);

                        s = -1;
                        if ( (LA20_170=='\"') ) {s = 120;}

                        else if ( (LA20_170=='\\') ) {s = 118;}

                        else if ( ((LA20_170>='\u0000' && LA20_170<='!')||(LA20_170>='#' && LA20_170<='[')||(LA20_170>=']' && LA20_170<='\uFFFF')) ) {s = 119;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_119 = input.LA(1);

                        s = -1;
                        if ( (LA20_119=='\"') ) {s = 120;}

                        else if ( (LA20_119=='\\') ) {s = 118;}

                        else if ( ((LA20_119>='\u0000' && LA20_119<='!')||(LA20_119>='#' && LA20_119<='[')||(LA20_119>=']' && LA20_119<='\uFFFF')) ) {s = 119;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA20_185 = input.LA(1);

                        s = -1;
                        if ( (LA20_185=='/') ) {s = 227;}

                        else if ( (LA20_185=='*') ) {s = 185;}

                        else if ( (LA20_185=='\r') ) {s = 186;}

                        else if ( (LA20_185=='\n') ) {s = 187;}

                        else if ( ((LA20_185>='\u0000' && LA20_185<='\t')||(LA20_185>='\u000B' && LA20_185<='\f')||(LA20_185>='\u000E' && LA20_185<=')')||(LA20_185>='+' && LA20_185<='.')||(LA20_185>='0' && LA20_185<='\uFFFF')) ) {s = 188;}

                        else s = 138;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='^') ) {s = 1;}

                        else if ( (LA20_0=='i') ) {s = 2;}

                        else if ( (LA20_0=='l') ) {s = 3;}

                        else if ( (LA20_0=='-') ) {s = 4;}

                        else if ( (LA20_0=='n') ) {s = 5;}

                        else if ( (LA20_0=='*') ) {s = 6;}

                        else if ( (LA20_0=='/') ) {s = 7;}

                        else if ( (LA20_0=='+') ) {s = 8;}

                        else if ( (LA20_0=='>') ) {s = 9;}

                        else if ( (LA20_0=='<') ) {s = 10;}

                        else if ( (LA20_0=='=') ) {s = 11;}

                        else if ( (LA20_0=='a') ) {s = 12;}

                        else if ( (LA20_0=='o') ) {s = 13;}

                        else if ( (LA20_0=='x') ) {s = 14;}

                        else if ( (LA20_0=='.') ) {s = 15;}

                        else if ( (LA20_0=='T') ) {s = 16;}

                        else if ( (LA20_0=='B') ) {s = 17;}

                        else if ( (LA20_0=='I') ) {s = 18;}

                        else if ( (LA20_0=='R') ) {s = 19;}

                        else if ( (LA20_0=='S') ) {s = 20;}

                        else if ( (LA20_0=='U') ) {s = 21;}

                        else if ( (LA20_0=='O') ) {s = 22;}

                        else if ( (LA20_0=='C') ) {s = 23;}

                        else if ( (LA20_0=='c') ) {s = 24;}

                        else if ( (LA20_0==':') ) {s = 25;}

                        else if ( (LA20_0=='(') ) {s = 26;}

                        else if ( (LA20_0==')') ) {s = 27;}

                        else if ( (LA20_0=='d') ) {s = 28;}

                        else if ( (LA20_0==',') ) {s = 29;}

                        else if ( (LA20_0=='p') ) {s = 30;}

                        else if ( (LA20_0=='b') ) {s = 31;}

                        else if ( (LA20_0=='e') ) {s = 32;}

                        else if ( (LA20_0=='?') ) {s = 33;}

                        else if ( (LA20_0=='{') ) {s = 34;}

                        else if ( (LA20_0=='}') ) {s = 35;}

                        else if ( (LA20_0=='t') ) {s = 36;}

                        else if ( (LA20_0=='s') ) {s = 37;}

                        else if ( (LA20_0=='[') ) {s = 38;}

                        else if ( (LA20_0==']') ) {s = 39;}

                        else if ( (LA20_0=='f') ) {s = 40;}

                        else if ( (LA20_0=='|') ) {s = 41;}

                        else if ( (LA20_0==';') ) {s = 42;}

                        else if ( (LA20_0=='\u00C2') ) {s = 43;}

                        else if ( (LA20_0=='\"') ) {s = 44;}

                        else if ( (LA20_0=='\'') ) {s = 45;}

                        else if ( (LA20_0=='A'||(LA20_0>='D' && LA20_0<='H')||(LA20_0>='J' && LA20_0<='N')||(LA20_0>='P' && LA20_0<='Q')||(LA20_0>='V' && LA20_0<='Z')||LA20_0=='_'||(LA20_0>='g' && LA20_0<='h')||(LA20_0>='j' && LA20_0<='k')||LA20_0=='m'||(LA20_0>='q' && LA20_0<='r')||(LA20_0>='u' && LA20_0<='w')||(LA20_0>='y' && LA20_0<='z')) ) {s = 46;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 47;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 48;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='!'||(LA20_0>='#' && LA20_0<='&')||LA20_0=='@'||LA20_0=='\\'||LA20_0=='`'||(LA20_0>='~' && LA20_0<='\u00C1')||(LA20_0>='\u00C3' && LA20_0<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA20_227 = input.LA(1);

                        s = -1;
                        if ( (LA20_227=='*') ) {s = 185;}

                        else if ( (LA20_227=='\r') ) {s = 186;}

                        else if ( (LA20_227=='\n') ) {s = 187;}

                        else if ( ((LA20_227>='\u0000' && LA20_227<='\t')||(LA20_227>='\u000B' && LA20_227<='\f')||(LA20_227>='\u000E' && LA20_227<=')')||(LA20_227>='+' && LA20_227<='\uFFFF')) ) {s = 188;}

                        else s = 228;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA20_45 = input.LA(1);

                        s = -1;
                        if ( (LA20_45=='\\') ) {s = 121;}

                        else if ( ((LA20_45>='\u0000' && LA20_45<='&')||(LA20_45>='(' && LA20_45<='[')||(LA20_45>=']' && LA20_45<='\uFFFF')) ) {s = 122;}

                        else if ( (LA20_45=='\'') ) {s = 123;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA20_173 = input.LA(1);

                        s = -1;
                        if ( (LA20_173=='\'') ) {s = 123;}

                        else if ( (LA20_173=='\\') ) {s = 121;}

                        else if ( ((LA20_173>='\u0000' && LA20_173<='&')||(LA20_173>='(' && LA20_173<='[')||(LA20_173>=']' && LA20_173<='\uFFFF')) ) {s = 122;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA20_122 = input.LA(1);

                        s = -1;
                        if ( (LA20_122=='\'') ) {s = 123;}

                        else if ( (LA20_122=='\\') ) {s = 121;}

                        else if ( ((LA20_122>='\u0000' && LA20_122<='&')||(LA20_122>='(' && LA20_122<='[')||(LA20_122>=']' && LA20_122<='\uFFFF')) ) {s = 122;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA20_137 = input.LA(1);

                        s = -1;
                        if ( (LA20_137=='*') ) {s = 185;}

                        else if ( (LA20_137=='\r') ) {s = 186;}

                        else if ( (LA20_137=='\n') ) {s = 187;}

                        else if ( ((LA20_137>='\u0000' && LA20_137<='\t')||(LA20_137>='\u000B' && LA20_137<='\f')||(LA20_137>='\u000E' && LA20_137<=')')||(LA20_137>='+' && LA20_137<='\uFFFF')) ) {s = 188;}

                        else s = 138;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA20_188 = input.LA(1);

                        s = -1;
                        if ( (LA20_188=='*') ) {s = 185;}

                        else if ( (LA20_188=='\r') ) {s = 186;}

                        else if ( (LA20_188=='\n') ) {s = 187;}

                        else if ( ((LA20_188>='\u0000' && LA20_188<='\t')||(LA20_188>='\u000B' && LA20_188<='\f')||(LA20_188>='\u000E' && LA20_188<=')')||(LA20_188>='+' && LA20_188<='\uFFFF')) ) {s = 188;}

                        else s = 138;

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