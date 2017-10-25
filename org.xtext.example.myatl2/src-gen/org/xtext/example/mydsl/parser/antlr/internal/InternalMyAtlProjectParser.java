package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyAtlProjectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyAtlProjectParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SINGLE_QUOTED_STRING", "RULE_SIMPLE_ID", "RULE_BIG_INT", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_DOCUMENTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "';'", "'create'", "'OUT'", "':'", "'from'", "'IN'", "'rule'", "'{'", "'using'", "'}'", "'to'", "'do'", "'entrypoint'", "'('", "')'", "'helper'", "'context'", "'='", "','", "'xxx'", "'yyy'", "'<-'", "'-'", "'not'", "'*'", "'/'", "'+'", "'>'", "'<'", "'>='", "'<='", "'<>'", "'and'", "'or'", "'xor'", "'implies'", "'.'", "'->'", "'Tuple'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'..'", "'true'", "'false'", "'invalid'", "'null'", "'|'", "'if'", "'then'", "'else'", "'endif'", "'let'", "'in'", "'self'", "'['", "']'"
    };
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


        public InternalMyAtlProjectParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyAtlProjectParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyAtlProjectParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyAtlProject.g"; }



     	private MyAtlProjectGrammarAccess grammarAccess;

        public InternalMyAtlProjectParser(TokenStream input, MyAtlProjectGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Module";
       	}

       	@Override
       	protected MyAtlProjectGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModule"
    // InternalMyAtlProject.g:64:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalMyAtlProject.g:64:47: (iv_ruleModule= ruleModule EOF )
            // InternalMyAtlProject.g:65:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalMyAtlProject.g:71:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' otherlv_6= 'from' otherlv_7= 'IN' otherlv_8= ':' ( (lv_elements_9_0= ruleModuleElement ) )* ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_9_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:77:2: ( (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' otherlv_6= 'from' otherlv_7= 'IN' otherlv_8= ':' ( (lv_elements_9_0= ruleModuleElement ) )* ) )
            // InternalMyAtlProject.g:78:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' otherlv_6= 'from' otherlv_7= 'IN' otherlv_8= ':' ( (lv_elements_9_0= ruleModuleElement ) )* )
            {
            // InternalMyAtlProject.g:78:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' otherlv_6= 'from' otherlv_7= 'IN' otherlv_8= ':' ( (lv_elements_9_0= ruleModuleElement ) )* )
            // InternalMyAtlProject.g:79:3: otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' otherlv_6= 'from' otherlv_7= 'IN' otherlv_8= ':' ( (lv_elements_9_0= ruleModuleElement ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
            		
            // InternalMyAtlProject.g:83:3: ( (lv_name_1_0= ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:84:4: (lv_name_1_0= ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:84:4: (lv_name_1_0= ruleUnrestrictedName )
            // InternalMyAtlProject.g:85:5: lv_name_1_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getModuleAccess().getNameUnrestrictedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyAtlProject.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getSemicolonKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getCreateKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getOUTKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getModuleAccess().getColonKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getModuleAccess().getFromKeyword_6());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getModuleAccess().getINKeyword_7());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getModuleAccess().getColonKeyword_8());
            		
            // InternalMyAtlProject.g:130:3: ( (lv_elements_9_0= ruleModuleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21||LA1_0==27||LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyAtlProject.g:131:4: (lv_elements_9_0= ruleModuleElement )
            	    {
            	    // InternalMyAtlProject.g:131:4: (lv_elements_9_0= ruleModuleElement )
            	    // InternalMyAtlProject.g:132:5: lv_elements_9_0= ruleModuleElement
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getElementsModuleElementParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_elements_9_0=ruleModuleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_9_0,
            	    						"org.xtext.example.mydsl.MyAtlProject.ModuleElement");
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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleModuleElement"
    // InternalMyAtlProject.g:153:1: entryRuleModuleElement returns [EObject current=null] : iv_ruleModuleElement= ruleModuleElement EOF ;
    public final EObject entryRuleModuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleElement = null;


        try {
            // InternalMyAtlProject.g:153:54: (iv_ruleModuleElement= ruleModuleElement EOF )
            // InternalMyAtlProject.g:154:2: iv_ruleModuleElement= ruleModuleElement EOF
            {
             newCompositeNode(grammarAccess.getModuleElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModuleElement=ruleModuleElement();

            state._fsp--;

             current =iv_ruleModuleElement; 
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
    // $ANTLR end "entryRuleModuleElement"


    // $ANTLR start "ruleModuleElement"
    // InternalMyAtlProject.g:160:1: ruleModuleElement returns [EObject current=null] : (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule ) ;
    public final EObject ruleModuleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Helper_0 = null;

        EObject this_MatchedRule_1 = null;

        EObject this_CalledRule_2 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:166:2: ( (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule ) )
            // InternalMyAtlProject.g:167:2: (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule )
            {
            // InternalMyAtlProject.g:167:2: (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_SIMPLE_ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==22) ) {
                        int LA2_5 = input.LA(4);

                        if ( (LA2_5==19) ) {
                            alt2=2;
                        }
                        else if ( (LA2_5==23||LA2_5==25) ) {
                            alt2=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA2_4==28) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyAtlProject.g:168:3: this_Helper_0= ruleHelper
                    {

                    			newCompositeNode(grammarAccess.getModuleElementAccess().getHelperParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Helper_0=ruleHelper();

                    state._fsp--;


                    			current = this_Helper_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:177:3: this_MatchedRule_1= ruleMatchedRule
                    {

                    			newCompositeNode(grammarAccess.getModuleElementAccess().getMatchedRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MatchedRule_1=ruleMatchedRule();

                    state._fsp--;


                    			current = this_MatchedRule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyAtlProject.g:186:3: this_CalledRule_2= ruleCalledRule
                    {

                    			newCompositeNode(grammarAccess.getModuleElementAccess().getCalledRuleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CalledRule_2=ruleCalledRule();

                    state._fsp--;


                    			current = this_CalledRule_2;
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
    // $ANTLR end "ruleModuleElement"


    // $ANTLR start "entryRuleMatchedRule"
    // InternalMyAtlProject.g:198:1: entryRuleMatchedRule returns [EObject current=null] : iv_ruleMatchedRule= ruleMatchedRule EOF ;
    public final EObject entryRuleMatchedRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchedRule = null;


        try {
            // InternalMyAtlProject.g:198:52: (iv_ruleMatchedRule= ruleMatchedRule EOF )
            // InternalMyAtlProject.g:199:2: iv_ruleMatchedRule= ruleMatchedRule EOF
            {
             newCompositeNode(grammarAccess.getMatchedRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatchedRule=ruleMatchedRule();

            state._fsp--;

             current =iv_ruleMatchedRule; 
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
    // $ANTLR end "entryRuleMatchedRule"


    // $ANTLR start "ruleMatchedRule"
    // InternalMyAtlProject.g:205:1: ruleMatchedRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleMatchedRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_inPattern_4_0 = null;

        EObject lv_variables_7_0 = null;

        EObject lv_outPattern_10_0 = null;

        EObject lv_actionBlock_13_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:211:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalMyAtlProject.g:212:2: (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalMyAtlProject.g:212:2: (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )? otherlv_15= '}' )
            // InternalMyAtlProject.g:213:3: otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchedRuleAccess().getRuleKeyword_0());
            		
            // InternalMyAtlProject.g:217:3: ( (lv_name_1_0= ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:218:4: (lv_name_1_0= ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:218:4: (lv_name_1_0= ruleUnrestrictedName )
            // InternalMyAtlProject.g:219:5: lv_name_1_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getMatchedRuleAccess().getNameUnrestrictedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatchedRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyAtlProject.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMatchedRuleAccess().getFromKeyword_3());
            		
            // InternalMyAtlProject.g:244:3: ( (lv_inPattern_4_0= ruleInPattern ) )
            // InternalMyAtlProject.g:245:4: (lv_inPattern_4_0= ruleInPattern )
            {
            // InternalMyAtlProject.g:245:4: (lv_inPattern_4_0= ruleInPattern )
            // InternalMyAtlProject.g:246:5: lv_inPattern_4_0= ruleInPattern
            {

            					newCompositeNode(grammarAccess.getMatchedRuleAccess().getInPatternInPatternParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_inPattern_4_0=ruleInPattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatchedRuleRule());
            					}
            					set(
            						current,
            						"inPattern",
            						lv_inPattern_4_0,
            						"org.xtext.example.mydsl.MyAtlProject.InPattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtlProject.g:263:3: (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyAtlProject.g:264:4: otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getMatchedRuleAccess().getUsingKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyAtlProject.g:272:4: ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_SIMPLE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyAtlProject.g:273:5: (lv_variables_7_0= ruleRuleVariableDeclaration )
                    	    {
                    	    // InternalMyAtlProject.g:273:5: (lv_variables_7_0= ruleRuleVariableDeclaration )
                    	    // InternalMyAtlProject.g:274:6: lv_variables_7_0= ruleRuleVariableDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getMatchedRuleAccess().getVariablesRuleVariableDeclarationParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_variables_7_0=ruleRuleVariableDeclaration();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMatchedRuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_7_0,
                    	    							"org.xtext.example.mydsl.MyAtlProject.RuleVariableDeclaration");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getMatchedRuleAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getMatchedRuleAccess().getToKeyword_6());
            		
            // InternalMyAtlProject.g:300:3: ( (lv_outPattern_10_0= ruleOutPattern ) )
            // InternalMyAtlProject.g:301:4: (lv_outPattern_10_0= ruleOutPattern )
            {
            // InternalMyAtlProject.g:301:4: (lv_outPattern_10_0= ruleOutPattern )
            // InternalMyAtlProject.g:302:5: lv_outPattern_10_0= ruleOutPattern
            {

            					newCompositeNode(grammarAccess.getMatchedRuleAccess().getOutPatternOutPatternParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_16);
            lv_outPattern_10_0=ruleOutPattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatchedRuleRule());
            					}
            					set(
            						current,
            						"outPattern",
            						lv_outPattern_10_0,
            						"org.xtext.example.mydsl.MyAtlProject.OutPattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtlProject.g:319:3: (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyAtlProject.g:320:4: otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getMatchedRuleAccess().getDoKeyword_8_0());
                    			
                    otherlv_12=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMyAtlProject.g:328:4: ( (lv_actionBlock_13_0= ruleActionBlock ) )
                    // InternalMyAtlProject.g:329:5: (lv_actionBlock_13_0= ruleActionBlock )
                    {
                    // InternalMyAtlProject.g:329:5: (lv_actionBlock_13_0= ruleActionBlock )
                    // InternalMyAtlProject.g:330:6: lv_actionBlock_13_0= ruleActionBlock
                    {

                    						newCompositeNode(grammarAccess.getMatchedRuleAccess().getActionBlockActionBlockParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_actionBlock_13_0=ruleActionBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMatchedRuleRule());
                    						}
                    						set(
                    							current,
                    							"actionBlock",
                    							lv_actionBlock_13_0,
                    							"org.xtext.example.mydsl.MyAtlProject.ActionBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_14, grammarAccess.getMatchedRuleAccess().getRightCurlyBracketKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getMatchedRuleAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleMatchedRule"


    // $ANTLR start "entryRuleCalledRule"
    // InternalMyAtlProject.g:360:1: entryRuleCalledRule returns [EObject current=null] : iv_ruleCalledRule= ruleCalledRule EOF ;
    public final EObject entryRuleCalledRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalledRule = null;


        try {
            // InternalMyAtlProject.g:360:51: (iv_ruleCalledRule= ruleCalledRule EOF )
            // InternalMyAtlProject.g:361:2: iv_ruleCalledRule= ruleCalledRule EOF
            {
             newCompositeNode(grammarAccess.getCalledRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalledRule=ruleCalledRule();

            state._fsp--;

             current =iv_ruleCalledRule; 
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
    // $ANTLR end "entryRuleCalledRule"


    // $ANTLR start "ruleCalledRule"
    // InternalMyAtlProject.g:367:1: ruleCalledRule returns [EObject current=null] : ( (otherlv_0= 'entrypoint' )? otherlv_1= 'rule' ( (lv_name_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' otherlv_4= ')' )? otherlv_5= '{' (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )? otherlv_10= 'to' ( (lv_outPattern_11_0= ruleOutPattern ) ) (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleCalledRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_variables_8_0 = null;

        EObject lv_outPattern_11_0 = null;

        EObject lv_actionBlock_14_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:373:2: ( ( (otherlv_0= 'entrypoint' )? otherlv_1= 'rule' ( (lv_name_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' otherlv_4= ')' )? otherlv_5= '{' (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )? otherlv_10= 'to' ( (lv_outPattern_11_0= ruleOutPattern ) ) (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalMyAtlProject.g:374:2: ( (otherlv_0= 'entrypoint' )? otherlv_1= 'rule' ( (lv_name_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' otherlv_4= ')' )? otherlv_5= '{' (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )? otherlv_10= 'to' ( (lv_outPattern_11_0= ruleOutPattern ) ) (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalMyAtlProject.g:374:2: ( (otherlv_0= 'entrypoint' )? otherlv_1= 'rule' ( (lv_name_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' otherlv_4= ')' )? otherlv_5= '{' (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )? otherlv_10= 'to' ( (lv_outPattern_11_0= ruleOutPattern ) ) (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )? otherlv_16= '}' )
            // InternalMyAtlProject.g:375:3: (otherlv_0= 'entrypoint' )? otherlv_1= 'rule' ( (lv_name_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' otherlv_4= ')' )? otherlv_5= '{' (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )? otherlv_10= 'to' ( (lv_outPattern_11_0= ruleOutPattern ) ) (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalMyAtlProject.g:375:3: (otherlv_0= 'entrypoint' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyAtlProject.g:376:4: otherlv_0= 'entrypoint'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getCalledRuleAccess().getEntrypointKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCalledRuleAccess().getRuleKeyword_1());
            		
            // InternalMyAtlProject.g:385:3: ( (lv_name_2_0= ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:386:4: (lv_name_2_0= ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:386:4: (lv_name_2_0= ruleUnrestrictedName )
            // InternalMyAtlProject.g:387:5: lv_name_2_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getCalledRuleAccess().getNameUnrestrictedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_2_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalledRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyAtlProject.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtlProject.g:404:3: (otherlv_3= '(' otherlv_4= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyAtlProject.g:405:4: otherlv_3= '(' otherlv_4= ')'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getCalledRuleAccess().getLeftParenthesisKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getCalledRuleAccess().getRightParenthesisKeyword_3_1());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyAtlProject.g:418:3: (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyAtlProject.g:419:4: otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getCalledRuleAccess().getUsingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyAtlProject.g:427:4: ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_SIMPLE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyAtlProject.g:428:5: (lv_variables_8_0= ruleRuleVariableDeclaration )
                    	    {
                    	    // InternalMyAtlProject.g:428:5: (lv_variables_8_0= ruleRuleVariableDeclaration )
                    	    // InternalMyAtlProject.g:429:6: lv_variables_8_0= ruleRuleVariableDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getCalledRuleAccess().getVariablesRuleVariableDeclarationParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_variables_8_0=ruleRuleVariableDeclaration();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCalledRuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_8_0,
                    	    							"org.xtext.example.mydsl.MyAtlProject.RuleVariableDeclaration");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getCalledRuleAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getCalledRuleAccess().getToKeyword_6());
            		
            // InternalMyAtlProject.g:455:3: ( (lv_outPattern_11_0= ruleOutPattern ) )
            // InternalMyAtlProject.g:456:4: (lv_outPattern_11_0= ruleOutPattern )
            {
            // InternalMyAtlProject.g:456:4: (lv_outPattern_11_0= ruleOutPattern )
            // InternalMyAtlProject.g:457:5: lv_outPattern_11_0= ruleOutPattern
            {

            					newCompositeNode(grammarAccess.getCalledRuleAccess().getOutPatternOutPatternParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_16);
            lv_outPattern_11_0=ruleOutPattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalledRuleRule());
            					}
            					set(
            						current,
            						"outPattern",
            						lv_outPattern_11_0,
            						"org.xtext.example.mydsl.MyAtlProject.OutPattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtlProject.g:474:3: (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyAtlProject.g:475:4: otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getCalledRuleAccess().getDoKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMyAtlProject.g:483:4: ( (lv_actionBlock_14_0= ruleActionBlock ) )
                    // InternalMyAtlProject.g:484:5: (lv_actionBlock_14_0= ruleActionBlock )
                    {
                    // InternalMyAtlProject.g:484:5: (lv_actionBlock_14_0= ruleActionBlock )
                    // InternalMyAtlProject.g:485:6: lv_actionBlock_14_0= ruleActionBlock
                    {

                    						newCompositeNode(grammarAccess.getCalledRuleAccess().getActionBlockActionBlockParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_actionBlock_14_0=ruleActionBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalledRuleRule());
                    						}
                    						set(
                    							current,
                    							"actionBlock",
                    							lv_actionBlock_14_0,
                    							"org.xtext.example.mydsl.MyAtlProject.ActionBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_15, grammarAccess.getCalledRuleAccess().getRightCurlyBracketKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getCalledRuleAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleCalledRule"


    // $ANTLR start "entryRuleHelper"
    // InternalMyAtlProject.g:515:1: entryRuleHelper returns [EObject current=null] : iv_ruleHelper= ruleHelper EOF ;
    public final EObject entryRuleHelper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelper = null;


        try {
            // InternalMyAtlProject.g:515:47: (iv_ruleHelper= ruleHelper EOF )
            // InternalMyAtlProject.g:516:2: iv_ruleHelper= ruleHelper EOF
            {
             newCompositeNode(grammarAccess.getHelperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHelper=ruleHelper();

            state._fsp--;

             current =iv_ruleHelper; 
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
    // $ANTLR end "entryRuleHelper"


    // $ANTLR start "ruleHelper"
    // InternalMyAtlProject.g:522:1: ruleHelper returns [EObject current=null] : (otherlv_0= 'helper' (otherlv_1= 'context' )? ) ;
    public final EObject ruleHelper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtlProject.g:528:2: ( (otherlv_0= 'helper' (otherlv_1= 'context' )? ) )
            // InternalMyAtlProject.g:529:2: (otherlv_0= 'helper' (otherlv_1= 'context' )? )
            {
            // InternalMyAtlProject.g:529:2: (otherlv_0= 'helper' (otherlv_1= 'context' )? )
            // InternalMyAtlProject.g:530:3: otherlv_0= 'helper' (otherlv_1= 'context' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getHelperAccess().getHelperKeyword_0());
            		
            // InternalMyAtlProject.g:534:3: (otherlv_1= 'context' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyAtlProject.g:535:4: otherlv_1= 'context'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getHelperAccess().getContextKeyword_1());
                    			

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
    // $ANTLR end "ruleHelper"


    // $ANTLR start "entryRuleRuleVariableDeclaration"
    // InternalMyAtlProject.g:544:1: entryRuleRuleVariableDeclaration returns [EObject current=null] : iv_ruleRuleVariableDeclaration= ruleRuleVariableDeclaration EOF ;
    public final EObject entryRuleRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleVariableDeclaration = null;


        try {
            // InternalMyAtlProject.g:544:64: (iv_ruleRuleVariableDeclaration= ruleRuleVariableDeclaration EOF )
            // InternalMyAtlProject.g:545:2: iv_ruleRuleVariableDeclaration= ruleRuleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getRuleVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleVariableDeclaration=ruleRuleVariableDeclaration();

            state._fsp--;

             current =iv_ruleRuleVariableDeclaration; 
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
    // $ANTLR end "entryRuleRuleVariableDeclaration"


    // $ANTLR start "ruleRuleVariableDeclaration"
    // InternalMyAtlProject.g:551:1: ruleRuleVariableDeclaration returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' otherlv_2= '=' ) ;
    public final EObject ruleRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_varName_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:557:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' otherlv_2= '=' ) )
            // InternalMyAtlProject.g:558:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' otherlv_2= '=' )
            {
            // InternalMyAtlProject.g:558:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' otherlv_2= '=' )
            // InternalMyAtlProject.g:559:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' otherlv_2= '='
            {
            // InternalMyAtlProject.g:559:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:560:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:560:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyAtlProject.g:561:5: lv_varName_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getRuleVariableDeclarationAccess().getVarNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_varName_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleVariableDeclarationRule());
            					}
            					set(
            						current,
            						"varName",
            						lv_varName_0_0,
            						"org.xtext.example.mydsl.MyAtlProject.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleVariableDeclarationAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleVariableDeclarationAccess().getEqualsSignKeyword_2());
            		

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
    // $ANTLR end "ruleRuleVariableDeclaration"


    // $ANTLR start "entryRuleInPattern"
    // InternalMyAtlProject.g:590:1: entryRuleInPattern returns [EObject current=null] : iv_ruleInPattern= ruleInPattern EOF ;
    public final EObject entryRuleInPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPattern = null;


        try {
            // InternalMyAtlProject.g:590:50: (iv_ruleInPattern= ruleInPattern EOF )
            // InternalMyAtlProject.g:591:2: iv_ruleInPattern= ruleInPattern EOF
            {
             newCompositeNode(grammarAccess.getInPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInPattern=ruleInPattern();

            state._fsp--;

             current =iv_ruleInPattern; 
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
    // $ANTLR end "entryRuleInPattern"


    // $ANTLR start "ruleInPattern"
    // InternalMyAtlProject.g:597:1: ruleInPattern returns [EObject current=null] : ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' otherlv_2= ')' )? ) ;
    public final EObject ruleInPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:603:2: ( ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' otherlv_2= ')' )? ) )
            // InternalMyAtlProject.g:604:2: ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' otherlv_2= ')' )? )
            {
            // InternalMyAtlProject.g:604:2: ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' otherlv_2= ')' )? )
            // InternalMyAtlProject.g:605:3: ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' otherlv_2= ')' )?
            {
            // InternalMyAtlProject.g:605:3: ( (lv_elements_0_0= ruleInPatternElement ) )
            // InternalMyAtlProject.g:606:4: (lv_elements_0_0= ruleInPatternElement )
            {
            // InternalMyAtlProject.g:606:4: (lv_elements_0_0= ruleInPatternElement )
            // InternalMyAtlProject.g:607:5: lv_elements_0_0= ruleInPatternElement
            {

            					newCompositeNode(grammarAccess.getInPatternAccess().getElementsInPatternElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_elements_0_0=ruleInPatternElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInPatternRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"org.xtext.example.mydsl.MyAtlProject.InPatternElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtlProject.g:624:3: (otherlv_1= '(' otherlv_2= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyAtlProject.g:625:4: otherlv_1= '(' otherlv_2= ')'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getInPatternAccess().getLeftParenthesisKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getInPatternAccess().getRightParenthesisKeyword_1_1());
                    			

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
    // $ANTLR end "ruleInPattern"


    // $ANTLR start "entryRuleInPatternElement"
    // InternalMyAtlProject.g:638:1: entryRuleInPatternElement returns [EObject current=null] : iv_ruleInPatternElement= ruleInPatternElement EOF ;
    public final EObject entryRuleInPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPatternElement = null;


        try {
            // InternalMyAtlProject.g:638:57: (iv_ruleInPatternElement= ruleInPatternElement EOF )
            // InternalMyAtlProject.g:639:2: iv_ruleInPatternElement= ruleInPatternElement EOF
            {
             newCompositeNode(grammarAccess.getInPatternElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInPatternElement=ruleInPatternElement();

            state._fsp--;

             current =iv_ruleInPatternElement; 
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
    // $ANTLR end "entryRuleInPatternElement"


    // $ANTLR start "ruleInPatternElement"
    // InternalMyAtlProject.g:645:1: ruleInPatternElement returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ) ;
    public final EObject ruleInPatternElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_varName_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:651:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ) )
            // InternalMyAtlProject.g:652:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' )
            {
            // InternalMyAtlProject.g:652:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' )
            // InternalMyAtlProject.g:653:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':'
            {
            // InternalMyAtlProject.g:653:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:654:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:654:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyAtlProject.g:655:5: lv_varName_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getInPatternElementAccess().getVarNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_varName_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInPatternElementRule());
            					}
            					set(
            						current,
            						"varName",
            						lv_varName_0_0,
            						"org.xtext.example.mydsl.MyAtlProject.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInPatternElementAccess().getColonKeyword_1());
            		

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
    // $ANTLR end "ruleInPatternElement"


    // $ANTLR start "entryRuleOutPattern"
    // InternalMyAtlProject.g:680:1: entryRuleOutPattern returns [EObject current=null] : iv_ruleOutPattern= ruleOutPattern EOF ;
    public final EObject entryRuleOutPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPattern = null;


        try {
            // InternalMyAtlProject.g:680:51: (iv_ruleOutPattern= ruleOutPattern EOF )
            // InternalMyAtlProject.g:681:2: iv_ruleOutPattern= ruleOutPattern EOF
            {
             newCompositeNode(grammarAccess.getOutPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutPattern=ruleOutPattern();

            state._fsp--;

             current =iv_ruleOutPattern; 
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
    // $ANTLR end "entryRuleOutPattern"


    // $ANTLR start "ruleOutPattern"
    // InternalMyAtlProject.g:687:1: ruleOutPattern returns [EObject current=null] : ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* ) ;
    public final EObject ruleOutPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:693:2: ( ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* ) )
            // InternalMyAtlProject.g:694:2: ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* )
            {
            // InternalMyAtlProject.g:694:2: ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* )
            // InternalMyAtlProject.g:695:3: ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )*
            {
            // InternalMyAtlProject.g:695:3: ( (lv_elements_0_0= ruleOutPatternElement ) )
            // InternalMyAtlProject.g:696:4: (lv_elements_0_0= ruleOutPatternElement )
            {
            // InternalMyAtlProject.g:696:4: (lv_elements_0_0= ruleOutPatternElement )
            // InternalMyAtlProject.g:697:5: lv_elements_0_0= ruleOutPatternElement
            {

            					newCompositeNode(grammarAccess.getOutPatternAccess().getElementsOutPatternElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_elements_0_0=ruleOutPatternElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutPatternRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"org.xtext.example.mydsl.MyAtlProject.OutPatternElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtlProject.g:714:3: (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyAtlProject.g:715:4: otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOutPatternAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyAtlProject.g:719:4: ( (lv_elements_2_0= ruleOutPatternElement ) )
            	    // InternalMyAtlProject.g:720:5: (lv_elements_2_0= ruleOutPatternElement )
            	    {
            	    // InternalMyAtlProject.g:720:5: (lv_elements_2_0= ruleOutPatternElement )
            	    // InternalMyAtlProject.g:721:6: lv_elements_2_0= ruleOutPatternElement
            	    {

            	    						newCompositeNode(grammarAccess.getOutPatternAccess().getElementsOutPatternElementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_elements_2_0=ruleOutPatternElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOutPatternRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_2_0,
            	    							"org.xtext.example.mydsl.MyAtlProject.OutPatternElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleOutPattern"


    // $ANTLR start "entryRuleOutPatternElement"
    // InternalMyAtlProject.g:743:1: entryRuleOutPatternElement returns [EObject current=null] : iv_ruleOutPatternElement= ruleOutPatternElement EOF ;
    public final EObject entryRuleOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPatternElement = null;


        try {
            // InternalMyAtlProject.g:743:58: (iv_ruleOutPatternElement= ruleOutPatternElement EOF )
            // InternalMyAtlProject.g:744:2: iv_ruleOutPatternElement= ruleOutPatternElement EOF
            {
             newCompositeNode(grammarAccess.getOutPatternElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutPatternElement=ruleOutPatternElement();

            state._fsp--;

             current =iv_ruleOutPatternElement; 
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
    // $ANTLR end "entryRuleOutPatternElement"


    // $ANTLR start "ruleOutPatternElement"
    // InternalMyAtlProject.g:750:1: ruleOutPatternElement returns [EObject current=null] : (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement ) ;
    public final EObject ruleOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleOutPatternElement_0 = null;

        EObject this_ForEachOutPatternElement_1 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:756:2: ( (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement ) )
            // InternalMyAtlProject.g:757:2: (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement )
            {
            // InternalMyAtlProject.g:757:2: (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_SIMPLE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==34) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyAtlProject.g:758:3: this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement
                    {

                    			newCompositeNode(grammarAccess.getOutPatternElementAccess().getSimpleOutPatternElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleOutPatternElement_0=ruleSimpleOutPatternElement();

                    state._fsp--;


                    			current = this_SimpleOutPatternElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:767:3: this_ForEachOutPatternElement_1= ruleForEachOutPatternElement
                    {

                    			newCompositeNode(grammarAccess.getOutPatternElementAccess().getForEachOutPatternElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForEachOutPatternElement_1=ruleForEachOutPatternElement();

                    state._fsp--;


                    			current = this_ForEachOutPatternElement_1;
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
    // $ANTLR end "ruleOutPatternElement"


    // $ANTLR start "entryRuleSimpleOutPatternElement"
    // InternalMyAtlProject.g:779:1: entryRuleSimpleOutPatternElement returns [EObject current=null] : iv_ruleSimpleOutPatternElement= ruleSimpleOutPatternElement EOF ;
    public final EObject entryRuleSimpleOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOutPatternElement = null;


        try {
            // InternalMyAtlProject.g:779:64: (iv_ruleSimpleOutPatternElement= ruleSimpleOutPatternElement EOF )
            // InternalMyAtlProject.g:780:2: iv_ruleSimpleOutPatternElement= ruleSimpleOutPatternElement EOF
            {
             newCompositeNode(grammarAccess.getSimpleOutPatternElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleOutPatternElement=ruleSimpleOutPatternElement();

            state._fsp--;

             current =iv_ruleSimpleOutPatternElement; 
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
    // $ANTLR end "entryRuleSimpleOutPatternElement"


    // $ANTLR start "ruleSimpleOutPatternElement"
    // InternalMyAtlProject.g:786:1: ruleSimpleOutPatternElement returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' (otherlv_2= '(' ( ( (lv_bindings_3_0= ruleBinding ) ) (otherlv_4= ',' ( (lv_bindings_5_0= ruleBinding ) ) )* )? otherlv_6= ')' )? ) ;
    public final EObject ruleSimpleOutPatternElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_varName_0_0 = null;

        EObject lv_bindings_3_0 = null;

        EObject lv_bindings_5_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:792:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' (otherlv_2= '(' ( ( (lv_bindings_3_0= ruleBinding ) ) (otherlv_4= ',' ( (lv_bindings_5_0= ruleBinding ) ) )* )? otherlv_6= ')' )? ) )
            // InternalMyAtlProject.g:793:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' (otherlv_2= '(' ( ( (lv_bindings_3_0= ruleBinding ) ) (otherlv_4= ',' ( (lv_bindings_5_0= ruleBinding ) ) )* )? otherlv_6= ')' )? )
            {
            // InternalMyAtlProject.g:793:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' (otherlv_2= '(' ( ( (lv_bindings_3_0= ruleBinding ) ) (otherlv_4= ',' ( (lv_bindings_5_0= ruleBinding ) ) )* )? otherlv_6= ')' )? )
            // InternalMyAtlProject.g:794:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' (otherlv_2= '(' ( ( (lv_bindings_3_0= ruleBinding ) ) (otherlv_4= ',' ( (lv_bindings_5_0= ruleBinding ) ) )* )? otherlv_6= ')' )?
            {
            // InternalMyAtlProject.g:794:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:795:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:795:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyAtlProject.g:796:5: lv_varName_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getSimpleOutPatternElementAccess().getVarNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_varName_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleOutPatternElementRule());
            					}
            					set(
            						current,
            						"varName",
            						lv_varName_0_0,
            						"org.xtext.example.mydsl.MyAtlProject.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleOutPatternElementAccess().getColonKeyword_1());
            		
            // InternalMyAtlProject.g:817:3: (otherlv_2= '(' ( ( (lv_bindings_3_0= ruleBinding ) ) (otherlv_4= ',' ( (lv_bindings_5_0= ruleBinding ) ) )* )? otherlv_6= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyAtlProject.g:818:4: otherlv_2= '(' ( ( (lv_bindings_3_0= ruleBinding ) ) (otherlv_4= ',' ( (lv_bindings_5_0= ruleBinding ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getSimpleOutPatternElementAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMyAtlProject.g:822:4: ( ( (lv_bindings_3_0= ruleBinding ) ) (otherlv_4= ',' ( (lv_bindings_5_0= ruleBinding ) ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_SIMPLE_ID) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalMyAtlProject.g:823:5: ( (lv_bindings_3_0= ruleBinding ) ) (otherlv_4= ',' ( (lv_bindings_5_0= ruleBinding ) ) )*
                            {
                            // InternalMyAtlProject.g:823:5: ( (lv_bindings_3_0= ruleBinding ) )
                            // InternalMyAtlProject.g:824:6: (lv_bindings_3_0= ruleBinding )
                            {
                            // InternalMyAtlProject.g:824:6: (lv_bindings_3_0= ruleBinding )
                            // InternalMyAtlProject.g:825:7: lv_bindings_3_0= ruleBinding
                            {

                            							newCompositeNode(grammarAccess.getSimpleOutPatternElementAccess().getBindingsBindingParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_26);
                            lv_bindings_3_0=ruleBinding();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSimpleOutPatternElementRule());
                            							}
                            							add(
                            								current,
                            								"bindings",
                            								lv_bindings_3_0,
                            								"org.xtext.example.mydsl.MyAtlProject.Binding");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyAtlProject.g:842:5: (otherlv_4= ',' ( (lv_bindings_5_0= ruleBinding ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==33) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // InternalMyAtlProject.g:843:6: otherlv_4= ',' ( (lv_bindings_5_0= ruleBinding ) )
                            	    {
                            	    otherlv_4=(Token)match(input,33,FOLLOW_3); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getSimpleOutPatternElementAccess().getCommaKeyword_2_1_1_0());
                            	    					
                            	    // InternalMyAtlProject.g:847:6: ( (lv_bindings_5_0= ruleBinding ) )
                            	    // InternalMyAtlProject.g:848:7: (lv_bindings_5_0= ruleBinding )
                            	    {
                            	    // InternalMyAtlProject.g:848:7: (lv_bindings_5_0= ruleBinding )
                            	    // InternalMyAtlProject.g:849:8: lv_bindings_5_0= ruleBinding
                            	    {

                            	    								newCompositeNode(grammarAccess.getSimpleOutPatternElementAccess().getBindingsBindingParserRuleCall_2_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_26);
                            	    lv_bindings_5_0=ruleBinding();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getSimpleOutPatternElementRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"bindings",
                            	    									lv_bindings_5_0,
                            	    									"org.xtext.example.mydsl.MyAtlProject.Binding");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getSimpleOutPatternElementAccess().getRightParenthesisKeyword_2_2());
                    			

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
    // $ANTLR end "ruleSimpleOutPatternElement"


    // $ANTLR start "entryRuleForEachOutPatternElement"
    // InternalMyAtlProject.g:877:1: entryRuleForEachOutPatternElement returns [EObject current=null] : iv_ruleForEachOutPatternElement= ruleForEachOutPatternElement EOF ;
    public final EObject entryRuleForEachOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachOutPatternElement = null;


        try {
            // InternalMyAtlProject.g:877:65: (iv_ruleForEachOutPatternElement= ruleForEachOutPatternElement EOF )
            // InternalMyAtlProject.g:878:2: iv_ruleForEachOutPatternElement= ruleForEachOutPatternElement EOF
            {
             newCompositeNode(grammarAccess.getForEachOutPatternElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForEachOutPatternElement=ruleForEachOutPatternElement();

            state._fsp--;

             current =iv_ruleForEachOutPatternElement; 
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
    // $ANTLR end "entryRuleForEachOutPatternElement"


    // $ANTLR start "ruleForEachOutPatternElement"
    // InternalMyAtlProject.g:884:1: ruleForEachOutPatternElement returns [EObject current=null] : (otherlv_0= 'xxx' otherlv_1= 'yyy' ) ;
    public final EObject ruleForEachOutPatternElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtlProject.g:890:2: ( (otherlv_0= 'xxx' otherlv_1= 'yyy' ) )
            // InternalMyAtlProject.g:891:2: (otherlv_0= 'xxx' otherlv_1= 'yyy' )
            {
            // InternalMyAtlProject.g:891:2: (otherlv_0= 'xxx' otherlv_1= 'yyy' )
            // InternalMyAtlProject.g:892:3: otherlv_0= 'xxx' otherlv_1= 'yyy'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachOutPatternElementAccess().getXxxKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getForEachOutPatternElementAccess().getYyyKeyword_1());
            		

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
    // $ANTLR end "ruleForEachOutPatternElement"


    // $ANTLR start "entryRuleBinding"
    // InternalMyAtlProject.g:904:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalMyAtlProject.g:904:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalMyAtlProject.g:905:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalMyAtlProject.g:911:1: ruleBinding returns [EObject current=null] : ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_propertyName_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:917:2: ( ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ) )
            // InternalMyAtlProject.g:918:2: ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' )
            {
            // InternalMyAtlProject.g:918:2: ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' )
            // InternalMyAtlProject.g:919:3: ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-'
            {
            // InternalMyAtlProject.g:919:3: ( (lv_propertyName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:920:4: (lv_propertyName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:920:4: (lv_propertyName_0_0= ruleUnrestrictedName )
            // InternalMyAtlProject.g:921:5: lv_propertyName_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getPropertyNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_propertyName_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"propertyName",
            						lv_propertyName_0_0,
            						"org.xtext.example.mydsl.MyAtlProject.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_1());
            		

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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleActionBlock"
    // InternalMyAtlProject.g:946:1: entryRuleActionBlock returns [EObject current=null] : iv_ruleActionBlock= ruleActionBlock EOF ;
    public final EObject entryRuleActionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionBlock = null;


        try {
            // InternalMyAtlProject.g:946:52: (iv_ruleActionBlock= ruleActionBlock EOF )
            // InternalMyAtlProject.g:947:2: iv_ruleActionBlock= ruleActionBlock EOF
            {
             newCompositeNode(grammarAccess.getActionBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionBlock=ruleActionBlock();

            state._fsp--;

             current =iv_ruleActionBlock; 
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
    // $ANTLR end "entryRuleActionBlock"


    // $ANTLR start "ruleActionBlock"
    // InternalMyAtlProject.g:953:1: ruleActionBlock returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )+ ;
    public final EObject ruleActionBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:959:2: ( ( (lv_statements_0_0= ruleStatement ) )+ )
            // InternalMyAtlProject.g:960:2: ( (lv_statements_0_0= ruleStatement ) )+
            {
            // InternalMyAtlProject.g:960:2: ( (lv_statements_0_0= ruleStatement ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_SIMPLE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyAtlProject.g:961:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalMyAtlProject.g:961:3: (lv_statements_0_0= ruleStatement )
            	    // InternalMyAtlProject.g:962:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getActionBlockAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_29);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getActionBlockRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"org.xtext.example.mydsl.MyAtlProject.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    // $ANTLR end "ruleActionBlock"


    // $ANTLR start "entryRuleStatement"
    // InternalMyAtlProject.g:982:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyAtlProject.g:982:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyAtlProject.g:983:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyAtlProject.g:989:1: ruleStatement returns [EObject current=null] : this_BindingStat_0= ruleBindingStat ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_BindingStat_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:995:2: (this_BindingStat_0= ruleBindingStat )
            // InternalMyAtlProject.g:996:2: this_BindingStat_0= ruleBindingStat
            {

            		newCompositeNode(grammarAccess.getStatementAccess().getBindingStatParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BindingStat_0=ruleBindingStat();

            state._fsp--;


            		current = this_BindingStat_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleBindingStat"
    // InternalMyAtlProject.g:1007:1: entryRuleBindingStat returns [EObject current=null] : iv_ruleBindingStat= ruleBindingStat EOF ;
    public final EObject entryRuleBindingStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingStat = null;


        try {
            // InternalMyAtlProject.g:1007:52: (iv_ruleBindingStat= ruleBindingStat EOF )
            // InternalMyAtlProject.g:1008:2: iv_ruleBindingStat= ruleBindingStat EOF
            {
             newCompositeNode(grammarAccess.getBindingStatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBindingStat=ruleBindingStat();

            state._fsp--;

             current =iv_ruleBindingStat; 
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
    // $ANTLR end "entryRuleBindingStat"


    // $ANTLR start "ruleBindingStat"
    // InternalMyAtlProject.g:1014:1: ruleBindingStat returns [EObject current=null] : ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ) ;
    public final EObject ruleBindingStat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_propertyName_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:1020:2: ( ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ) )
            // InternalMyAtlProject.g:1021:2: ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' )
            {
            // InternalMyAtlProject.g:1021:2: ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' )
            // InternalMyAtlProject.g:1022:3: ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-'
            {
            // InternalMyAtlProject.g:1022:3: ( (lv_propertyName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:1023:4: (lv_propertyName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:1023:4: (lv_propertyName_0_0= ruleUnrestrictedName )
            // InternalMyAtlProject.g:1024:5: lv_propertyName_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getBindingStatAccess().getPropertyNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_propertyName_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingStatRule());
            					}
            					set(
            						current,
            						"propertyName",
            						lv_propertyName_0_0,
            						"org.xtext.example.mydsl.MyAtlProject.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingStatAccess().getLessThanSignHyphenMinusKeyword_1());
            		

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
    // $ANTLR end "ruleBindingStat"


    // $ANTLR start "entryRuleEssentialOCLPrefixOperator"
    // InternalMyAtlProject.g:1049:1: entryRuleEssentialOCLPrefixOperator returns [String current=null] : iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF ;
    public final String entryRuleEssentialOCLPrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLPrefixOperator = null;


        try {
            // InternalMyAtlProject.g:1049:66: (iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF )
            // InternalMyAtlProject.g:1050:2: iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF
            {
             newCompositeNode(grammarAccess.getEssentialOCLPrefixOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEssentialOCLPrefixOperator=ruleEssentialOCLPrefixOperator();

            state._fsp--;

             current =iv_ruleEssentialOCLPrefixOperator.getText(); 
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
    // $ANTLR end "entryRuleEssentialOCLPrefixOperator"


    // $ANTLR start "ruleEssentialOCLPrefixOperator"
    // InternalMyAtlProject.g:1056:1: ruleEssentialOCLPrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLPrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtlProject.g:1062:2: ( (kw= '-' | kw= 'not' ) )
            // InternalMyAtlProject.g:1063:2: (kw= '-' | kw= 'not' )
            {
            // InternalMyAtlProject.g:1063:2: (kw= '-' | kw= 'not' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            else if ( (LA19_0==38) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyAtlProject.g:1064:3: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLPrefixOperatorAccess().getHyphenMinusKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:1070:3: kw= 'not'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLPrefixOperatorAccess().getNotKeyword_1());
                    		

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
    // $ANTLR end "ruleEssentialOCLPrefixOperator"


    // $ANTLR start "entryRuleEssentialOCLInfixOperator"
    // InternalMyAtlProject.g:1079:1: entryRuleEssentialOCLInfixOperator returns [String current=null] : iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF ;
    public final String entryRuleEssentialOCLInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperator = null;


        try {
            // InternalMyAtlProject.g:1079:65: (iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF )
            // InternalMyAtlProject.g:1080:2: iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF
            {
             newCompositeNode(grammarAccess.getEssentialOCLInfixOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEssentialOCLInfixOperator=ruleEssentialOCLInfixOperator();

            state._fsp--;

             current =iv_ruleEssentialOCLInfixOperator.getText(); 
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
    // $ANTLR end "entryRuleEssentialOCLInfixOperator"


    // $ANTLR start "ruleEssentialOCLInfixOperator"
    // InternalMyAtlProject.g:1086:1: ruleEssentialOCLInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtlProject.g:1092:2: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) )
            // InternalMyAtlProject.g:1093:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            {
            // InternalMyAtlProject.g:1093:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            int alt20=14;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt20=1;
                }
                break;
            case 40:
                {
                alt20=2;
                }
                break;
            case 41:
                {
                alt20=3;
                }
                break;
            case 37:
                {
                alt20=4;
                }
                break;
            case 42:
                {
                alt20=5;
                }
                break;
            case 43:
                {
                alt20=6;
                }
                break;
            case 44:
                {
                alt20=7;
                }
                break;
            case 45:
                {
                alt20=8;
                }
                break;
            case 32:
                {
                alt20=9;
                }
                break;
            case 46:
                {
                alt20=10;
                }
                break;
            case 47:
                {
                alt20=11;
                }
                break;
            case 48:
                {
                alt20=12;
                }
                break;
            case 49:
                {
                alt20=13;
                }
                break;
            case 50:
                {
                alt20=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMyAtlProject.g:1094:3: kw= '*'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:1100:3: kw= '/'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyAtlProject.g:1106:3: kw= '+'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getPlusSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyAtlProject.g:1112:3: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getHyphenMinusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyAtlProject.g:1118:3: kw= '>'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyAtlProject.g:1124:3: kw= '<'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyAtlProject.g:1130:3: kw= '>='
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignEqualsSignKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyAtlProject.g:1136:3: kw= '<='
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignEqualsSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalMyAtlProject.g:1142:3: kw= '='
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getEqualsSignKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalMyAtlProject.g:1148:3: kw= '<>'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignGreaterThanSignKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalMyAtlProject.g:1154:3: kw= 'and'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getAndKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalMyAtlProject.g:1160:3: kw= 'or'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getOrKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalMyAtlProject.g:1166:3: kw= 'xor'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getXorKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalMyAtlProject.g:1172:3: kw= 'implies'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getImpliesKeyword_13());
                    		

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
    // $ANTLR end "ruleEssentialOCLInfixOperator"


    // $ANTLR start "entryRuleEssentialOCLNavigationOperator"
    // InternalMyAtlProject.g:1181:1: entryRuleEssentialOCLNavigationOperator returns [String current=null] : iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF ;
    public final String entryRuleEssentialOCLNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperator = null;


        try {
            // InternalMyAtlProject.g:1181:70: (iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF )
            // InternalMyAtlProject.g:1182:2: iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF
            {
             newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEssentialOCLNavigationOperator=ruleEssentialOCLNavigationOperator();

            state._fsp--;

             current =iv_ruleEssentialOCLNavigationOperator.getText(); 
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
    // $ANTLR end "entryRuleEssentialOCLNavigationOperator"


    // $ANTLR start "ruleEssentialOCLNavigationOperator"
    // InternalMyAtlProject.g:1188:1: ruleEssentialOCLNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtlProject.g:1194:2: ( (kw= '.' | kw= '->' ) )
            // InternalMyAtlProject.g:1195:2: (kw= '.' | kw= '->' )
            {
            // InternalMyAtlProject.g:1195:2: (kw= '.' | kw= '->' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==51) ) {
                alt21=1;
            }
            else if ( (LA21_0==52) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyAtlProject.g:1196:3: kw= '.'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorAccess().getFullStopKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:1202:3: kw= '->'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1());
                    		

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
    // $ANTLR end "ruleEssentialOCLNavigationOperator"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMyAtlProject.g:1211:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalMyAtlProject.g:1211:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMyAtlProject.g:1212:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral.getText(); 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMyAtlProject.g:1218:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;


        	enterRule();

        try {
            // InternalMyAtlProject.g:1224:2: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // InternalMyAtlProject.g:1225:2: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FOLLOW_2); 

            		current.merge(this_SINGLE_QUOTED_STRING_0);
            	

            		newLeafNode(this_SINGLE_QUOTED_STRING_0, grammarAccess.getStringLiteralAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRulePrefixOperator"
    // InternalMyAtlProject.g:1235:1: entryRulePrefixOperator returns [String current=null] : iv_rulePrefixOperator= rulePrefixOperator EOF ;
    public final String entryRulePrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixOperator = null;


        try {
            // InternalMyAtlProject.g:1235:54: (iv_rulePrefixOperator= rulePrefixOperator EOF )
            // InternalMyAtlProject.g:1236:2: iv_rulePrefixOperator= rulePrefixOperator EOF
            {
             newCompositeNode(grammarAccess.getPrefixOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrefixOperator=rulePrefixOperator();

            state._fsp--;

             current =iv_rulePrefixOperator.getText(); 
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
    // $ANTLR end "entryRulePrefixOperator"


    // $ANTLR start "rulePrefixOperator"
    // InternalMyAtlProject.g:1242:1: rulePrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator ;
    public final AntlrDatatypeRuleToken rulePrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLPrefixOperator_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:1248:2: (this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator )
            // InternalMyAtlProject.g:1249:2: this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator
            {

            		newCompositeNode(grammarAccess.getPrefixOperatorAccess().getEssentialOCLPrefixOperatorParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_EssentialOCLPrefixOperator_0=ruleEssentialOCLPrefixOperator();

            state._fsp--;


            		current.merge(this_EssentialOCLPrefixOperator_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "rulePrefixOperator"


    // $ANTLR start "entryRuleInfixOperator"
    // InternalMyAtlProject.g:1262:1: entryRuleInfixOperator returns [String current=null] : iv_ruleInfixOperator= ruleInfixOperator EOF ;
    public final String entryRuleInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperator = null;


        try {
            // InternalMyAtlProject.g:1262:53: (iv_ruleInfixOperator= ruleInfixOperator EOF )
            // InternalMyAtlProject.g:1263:2: iv_ruleInfixOperator= ruleInfixOperator EOF
            {
             newCompositeNode(grammarAccess.getInfixOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfixOperator=ruleInfixOperator();

            state._fsp--;

             current =iv_ruleInfixOperator.getText(); 
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
    // $ANTLR end "entryRuleInfixOperator"


    // $ANTLR start "ruleInfixOperator"
    // InternalMyAtlProject.g:1269:1: ruleInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator ;
    public final AntlrDatatypeRuleToken ruleInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperator_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:1275:2: (this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator )
            // InternalMyAtlProject.g:1276:2: this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator
            {

            		newCompositeNode(grammarAccess.getInfixOperatorAccess().getEssentialOCLInfixOperatorParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_EssentialOCLInfixOperator_0=ruleEssentialOCLInfixOperator();

            state._fsp--;


            		current.merge(this_EssentialOCLInfixOperator_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleInfixOperator"


    // $ANTLR start "entryRuleNavigationOperator"
    // InternalMyAtlProject.g:1289:1: entryRuleNavigationOperator returns [String current=null] : iv_ruleNavigationOperator= ruleNavigationOperator EOF ;
    public final String entryRuleNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperator = null;


        try {
            // InternalMyAtlProject.g:1289:58: (iv_ruleNavigationOperator= ruleNavigationOperator EOF )
            // InternalMyAtlProject.g:1290:2: iv_ruleNavigationOperator= ruleNavigationOperator EOF
            {
             newCompositeNode(grammarAccess.getNavigationOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigationOperator=ruleNavigationOperator();

            state._fsp--;

             current =iv_ruleNavigationOperator.getText(); 
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
    // $ANTLR end "entryRuleNavigationOperator"


    // $ANTLR start "ruleNavigationOperator"
    // InternalMyAtlProject.g:1296:1: ruleNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator ;
    public final AntlrDatatypeRuleToken ruleNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperator_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:1302:2: (this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator )
            // InternalMyAtlProject.g:1303:2: this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator
            {

            		newCompositeNode(grammarAccess.getNavigationOperatorAccess().getEssentialOCLNavigationOperatorParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_EssentialOCLNavigationOperator_0=ruleEssentialOCLNavigationOperator();

            state._fsp--;


            		current.merge(this_EssentialOCLNavigationOperator_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleNavigationOperator"


    // $ANTLR start "entryRuleEssentialOCLUnrestrictedName"
    // InternalMyAtlProject.g:1316:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // InternalMyAtlProject.g:1316:68: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // InternalMyAtlProject.g:1317:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
             newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();

            state._fsp--;

             current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
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
    // $ANTLR end "entryRuleEssentialOCLUnrestrictedName"


    // $ANTLR start "ruleEssentialOCLUnrestrictedName"
    // InternalMyAtlProject.g:1323:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SIMPLE_ID_0= RULE_SIMPLE_ID ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;


        	enterRule();

        try {
            // InternalMyAtlProject.g:1329:2: (this_SIMPLE_ID_0= RULE_SIMPLE_ID )
            // InternalMyAtlProject.g:1330:2: this_SIMPLE_ID_0= RULE_SIMPLE_ID
            {
            this_SIMPLE_ID_0=(Token)match(input,RULE_SIMPLE_ID,FOLLOW_2); 

            		current.merge(this_SIMPLE_ID_0);
            	

            		newLeafNode(this_SIMPLE_ID_0, grammarAccess.getEssentialOCLUnrestrictedNameAccess().getSIMPLE_IDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEssentialOCLUnrestrictedName"


    // $ANTLR start "entryRuleUnrestrictedName"
    // InternalMyAtlProject.g:1340:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // InternalMyAtlProject.g:1340:56: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // InternalMyAtlProject.g:1341:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
             newCompositeNode(grammarAccess.getUnrestrictedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();

            state._fsp--;

             current =iv_ruleUnrestrictedName.getText(); 
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
    // $ANTLR end "entryRuleUnrestrictedName"


    // $ANTLR start "ruleUnrestrictedName"
    // InternalMyAtlProject.g:1347:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:1353:2: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // InternalMyAtlProject.g:1354:2: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
            {

            		newCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_EssentialOCLUnrestrictedName_0=ruleEssentialOCLUnrestrictedName();

            state._fsp--;


            		current.merge(this_EssentialOCLUnrestrictedName_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleUnrestrictedName"


    // $ANTLR start "entryRuleEssentialOCLUnreservedName"
    // InternalMyAtlProject.g:1367:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // InternalMyAtlProject.g:1367:66: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // InternalMyAtlProject.g:1368:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
            {
             newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEssentialOCLUnreservedName=ruleEssentialOCLUnreservedName();

            state._fsp--;

             current =iv_ruleEssentialOCLUnreservedName.getText(); 
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
    // $ANTLR end "entryRuleEssentialOCLUnreservedName"


    // $ANTLR start "ruleEssentialOCLUnreservedName"
    // InternalMyAtlProject.g:1374:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:1380:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) )
            // InternalMyAtlProject.g:1381:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            {
            // InternalMyAtlProject.g:1381:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            int alt22=4;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
                {
                alt22=1;
                }
                break;
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt22=2;
                }
                break;
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt22=3;
                }
                break;
            case 53:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMyAtlProject.g:1382:3: this_UnrestrictedName_0= ruleUnrestrictedName
                    {

                    			newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnrestrictedName_0=ruleUnrestrictedName();

                    state._fsp--;


                    			current.merge(this_UnrestrictedName_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:1393:3: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
                    {

                    			newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getCollectionTypeIdentifierParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollectionTypeIdentifier_1=ruleCollectionTypeIdentifier();

                    state._fsp--;


                    			current.merge(this_CollectionTypeIdentifier_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyAtlProject.g:1404:3: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
                    {

                    			newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getPrimitiveTypeIdentifierParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveTypeIdentifier_2=rulePrimitiveTypeIdentifier();

                    state._fsp--;


                    			current.merge(this_PrimitiveTypeIdentifier_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyAtlProject.g:1415:3: kw= 'Tuple'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLUnreservedNameAccess().getTupleKeyword_3());
                    		

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
    // $ANTLR end "ruleEssentialOCLUnreservedName"


    // $ANTLR start "entryRulePrimitiveTypeIdentifier"
    // InternalMyAtlProject.g:1424:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // InternalMyAtlProject.g:1424:63: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // InternalMyAtlProject.g:1425:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();

            state._fsp--;

             current =iv_rulePrimitiveTypeIdentifier.getText(); 
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
    // $ANTLR end "entryRulePrimitiveTypeIdentifier"


    // $ANTLR start "rulePrimitiveTypeIdentifier"
    // InternalMyAtlProject.g:1431:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtlProject.g:1437:2: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // InternalMyAtlProject.g:1438:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // InternalMyAtlProject.g:1438:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt23=8;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt23=1;
                }
                break;
            case 55:
                {
                alt23=2;
                }
                break;
            case 56:
                {
                alt23=3;
                }
                break;
            case 57:
                {
                alt23=4;
                }
                break;
            case 58:
                {
                alt23=5;
                }
                break;
            case 59:
                {
                alt23=6;
                }
                break;
            case 60:
                {
                alt23=7;
                }
                break;
            case 61:
                {
                alt23=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMyAtlProject.g:1439:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:1445:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyAtlProject.g:1451:3: kw= 'Real'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyAtlProject.g:1457:3: kw= 'String'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyAtlProject.g:1463:3: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyAtlProject.g:1469:3: kw= 'OclAny'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyAtlProject.g:1475:3: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyAtlProject.g:1481:3: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclVoidKeyword_7());
                    		

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
    // $ANTLR end "rulePrimitiveTypeIdentifier"


    // $ANTLR start "entryRulePrimitiveTypeCS"
    // InternalMyAtlProject.g:1490:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // InternalMyAtlProject.g:1490:56: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // InternalMyAtlProject.g:1491:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeCSRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();

            state._fsp--;

             current =iv_rulePrimitiveTypeCS; 
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
    // $ANTLR end "entryRulePrimitiveTypeCS"


    // $ANTLR start "rulePrimitiveTypeCS"
    // InternalMyAtlProject.g:1497:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:1503:2: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // InternalMyAtlProject.g:1504:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // InternalMyAtlProject.g:1504:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // InternalMyAtlProject.g:1505:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // InternalMyAtlProject.g:1505:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // InternalMyAtlProject.g:1506:4: lv_name_0_0= rulePrimitiveTypeIdentifier
            {

            				newCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=rulePrimitiveTypeIdentifier();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPrimitiveTypeCSRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.mydsl.MyAtlProject.PrimitiveTypeIdentifier");
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
    // $ANTLR end "rulePrimitiveTypeCS"


    // $ANTLR start "entryRuleCollectionTypeIdentifier"
    // InternalMyAtlProject.g:1526:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // InternalMyAtlProject.g:1526:64: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // InternalMyAtlProject.g:1527:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
             newCompositeNode(grammarAccess.getCollectionTypeIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();

            state._fsp--;

             current =iv_ruleCollectionTypeIdentifier.getText(); 
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
    // $ANTLR end "entryRuleCollectionTypeIdentifier"


    // $ANTLR start "ruleCollectionTypeIdentifier"
    // InternalMyAtlProject.g:1533:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtlProject.g:1539:2: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // InternalMyAtlProject.g:1540:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // InternalMyAtlProject.g:1540:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt24=1;
                }
                break;
            case 63:
                {
                alt24=2;
                }
                break;
            case 64:
                {
                alt24=3;
                }
                break;
            case 65:
                {
                alt24=4;
                }
                break;
            case 66:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalMyAtlProject.g:1541:3: kw= 'Set'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:1547:3: kw= 'Bag'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyAtlProject.g:1553:3: kw= 'Sequence'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyAtlProject.g:1559:3: kw= 'Collection'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyAtlProject.g:1565:3: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getOrderedSetKeyword_4());
                    		

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
    // $ANTLR end "ruleCollectionTypeIdentifier"


    // $ANTLR start "entryRuleCollectionTypeCS"
    // InternalMyAtlProject.g:1574:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // InternalMyAtlProject.g:1574:57: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // InternalMyAtlProject.g:1575:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
             newCompositeNode(grammarAccess.getCollectionTypeCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();

            state._fsp--;

             current =iv_ruleCollectionTypeCS; 
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
    // $ANTLR end "entryRuleCollectionTypeCS"


    // $ANTLR start "ruleCollectionTypeCS"
    // InternalMyAtlProject.g:1581:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedType_5_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:1587:2: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? ) )
            // InternalMyAtlProject.g:1588:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? )
            {
            // InternalMyAtlProject.g:1588:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? )
            // InternalMyAtlProject.g:1589:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )?
            {
            // InternalMyAtlProject.g:1589:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // InternalMyAtlProject.g:1590:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // InternalMyAtlProject.g:1590:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // InternalMyAtlProject.g:1591:5: lv_name_0_0= ruleCollectionTypeIdentifier
            {

            					newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_0_0=ruleCollectionTypeIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyAtlProject.CollectionTypeIdentifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtlProject.g:1608:3: ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            else if ( (LA25_0==43) ) {
                alt25=2;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyAtlProject.g:1609:4: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
                    {
                    // InternalMyAtlProject.g:1609:4: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
                    // InternalMyAtlProject.g:1610:5: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_31); 

                    					newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalMyAtlProject.g:1614:5: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyAtlProject.g:1615:6: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyAtlProject.g:1615:6: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyAtlProject.g:1616:7: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    							newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                    							}
                    							set(
                    								current,
                    								"ownedType",
                    								lv_ownedType_2_0,
                    								"org.xtext.example.mydsl.MyAtlProject.TypeExpCS");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:1639:4: (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' )
                    {
                    // InternalMyAtlProject.g:1639:4: (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' )
                    // InternalMyAtlProject.g:1640:5: otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_31); 

                    					newLeafNode(otherlv_4, grammarAccess.getCollectionTypeCSAccess().getLessThanSignKeyword_1_1_0());
                    				
                    // InternalMyAtlProject.g:1644:5: ( (lv_ownedType_5_0= ruleTypeExpCS ) )
                    // InternalMyAtlProject.g:1645:6: (lv_ownedType_5_0= ruleTypeExpCS )
                    {
                    // InternalMyAtlProject.g:1645:6: (lv_ownedType_5_0= ruleTypeExpCS )
                    // InternalMyAtlProject.g:1646:7: lv_ownedType_5_0= ruleTypeExpCS
                    {

                    							newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_32);
                    lv_ownedType_5_0=ruleTypeExpCS();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                    							}
                    							set(
                    								current,
                    								"ownedType",
                    								lv_ownedType_5_0,
                    								"org.xtext.example.mydsl.MyAtlProject.TypeExpCS");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getCollectionTypeCSAccess().getGreaterThanSignKeyword_1_1_2());
                    				

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
    // $ANTLR end "ruleCollectionTypeCS"


    // $ANTLR start "entryRuleCollectionLiteralExpCS"
    // InternalMyAtlProject.g:1673:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // InternalMyAtlProject.g:1673:63: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // InternalMyAtlProject.g:1674:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
             newCompositeNode(grammarAccess.getCollectionLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();

            state._fsp--;

             current =iv_ruleCollectionLiteralExpCS; 
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
    // $ANTLR end "entryRuleCollectionLiteralExpCS"


    // $ANTLR start "ruleCollectionLiteralExpCS"
    // InternalMyAtlProject.g:1680:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:1686:2: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalMyAtlProject.g:1687:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalMyAtlProject.g:1687:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalMyAtlProject.g:1688:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalMyAtlProject.g:1688:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalMyAtlProject.g:1689:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalMyAtlProject.g:1689:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalMyAtlProject.g:1690:5: lv_ownedType_0_0= ruleCollectionTypeCS
            {

            					newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
            					}
            					set(
            						current,
            						"ownedType",
            						lv_ownedType_0_0,
            						"org.xtext.example.mydsl.MyAtlProject.CollectionTypeCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyAtlProject.g:1711:3: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_SINGLE_QUOTED_STRING && LA27_0<=RULE_BIG_INT)||LA27_0==28||(LA27_0>=37 && LA27_0<=39)||(LA27_0>=53 && LA27_0<=66)||(LA27_0>=68 && LA27_0<=71)||LA27_0==73||LA27_0==77||LA27_0==79) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyAtlProject.g:1712:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // InternalMyAtlProject.g:1712:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // InternalMyAtlProject.g:1713:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // InternalMyAtlProject.g:1713:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // InternalMyAtlProject.g:1714:6: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {

                    						newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_ownedParts_2_0=ruleCollectionLiteralPartCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                    						}
                    						add(
                    							current,
                    							"ownedParts",
                    							lv_ownedParts_2_0,
                    							"org.xtext.example.mydsl.MyAtlProject.CollectionLiteralPartCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyAtlProject.g:1731:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==33) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalMyAtlProject.g:1732:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,33,FOLLOW_35); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMyAtlProject.g:1736:5: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // InternalMyAtlProject.g:1737:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // InternalMyAtlProject.g:1737:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // InternalMyAtlProject.g:1738:7: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    lv_ownedParts_4_0=ruleCollectionLiteralPartCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedParts",
                    	    								lv_ownedParts_4_0,
                    	    								"org.xtext.example.mydsl.MyAtlProject.CollectionLiteralPartCS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCollectionLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleCollectionLiteralExpCS"


    // $ANTLR start "entryRuleCollectionLiteralPartCS"
    // InternalMyAtlProject.g:1765:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // InternalMyAtlProject.g:1765:64: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // InternalMyAtlProject.g:1766:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
             newCompositeNode(grammarAccess.getCollectionLiteralPartCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();

            state._fsp--;

             current =iv_ruleCollectionLiteralPartCS; 
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
    // $ANTLR end "entryRuleCollectionLiteralPartCS"


    // $ANTLR start "ruleCollectionLiteralPartCS"
    // InternalMyAtlProject.g:1772:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressionCS_0_0 = null;

        EObject lv_lastExpressionCS_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:1778:2: ( ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) )
            // InternalMyAtlProject.g:1779:2: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtlProject.g:1779:2: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            // InternalMyAtlProject.g:1780:3: ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            {
            // InternalMyAtlProject.g:1780:3: ( (lv_expressionCS_0_0= ruleExpCS ) )
            // InternalMyAtlProject.g:1781:4: (lv_expressionCS_0_0= ruleExpCS )
            {
            // InternalMyAtlProject.g:1781:4: (lv_expressionCS_0_0= ruleExpCS )
            // InternalMyAtlProject.g:1782:5: lv_expressionCS_0_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSExpCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_expressionCS_0_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
            					}
            					set(
            						current,
            						"expressionCS",
            						lv_expressionCS_0_0,
            						"org.xtext.example.mydsl.MyAtlProject.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtlProject.g:1799:3: (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==67) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyAtlProject.g:1800:4: otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    {
                    otherlv_1=(Token)match(input,67,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_1_0());
                    			
                    // InternalMyAtlProject.g:1804:4: ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    // InternalMyAtlProject.g:1805:5: (lv_lastExpressionCS_2_0= ruleExpCS )
                    {
                    // InternalMyAtlProject.g:1805:5: (lv_lastExpressionCS_2_0= ruleExpCS )
                    // InternalMyAtlProject.g:1806:6: lv_lastExpressionCS_2_0= ruleExpCS
                    {

                    						newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_lastExpressionCS_2_0=ruleExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                    						}
                    						set(
                    							current,
                    							"lastExpressionCS",
                    							lv_lastExpressionCS_2_0,
                    							"org.xtext.example.mydsl.MyAtlProject.ExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleCollectionLiteralPartCS"


    // $ANTLR start "entryRulePrimitiveLiteralExpCS"
    // InternalMyAtlProject.g:1828:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // InternalMyAtlProject.g:1828:62: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // InternalMyAtlProject.g:1829:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();

            state._fsp--;

             current =iv_rulePrimitiveLiteralExpCS; 
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
    // $ANTLR end "entryRulePrimitiveLiteralExpCS"


    // $ANTLR start "rulePrimitiveLiteralExpCS"
    // InternalMyAtlProject.g:1835:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
    public final EObject rulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteralExpCS_0 = null;

        EObject this_StringLiteralExpCS_1 = null;

        EObject this_BooleanLiteralExpCS_2 = null;

        EObject this_UnlimitedNaturalLiteralExpCS_3 = null;

        EObject this_InvalidLiteralExpCS_4 = null;

        EObject this_NullLiteralExpCS_5 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:1841:2: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // InternalMyAtlProject.g:1842:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // InternalMyAtlProject.g:1842:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt29=6;
            switch ( input.LA(1) ) {
            case RULE_BIG_INT:
                {
                alt29=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt29=2;
                }
                break;
            case 68:
            case 69:
                {
                alt29=3;
                }
                break;
            case 39:
                {
                alt29=4;
                }
                break;
            case 70:
                {
                alt29=5;
                }
                break;
            case 71:
                {
                alt29=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalMyAtlProject.g:1843:3: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteralExpCS_0=ruleNumberLiteralExpCS();

                    state._fsp--;


                    			current = this_NumberLiteralExpCS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:1852:3: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteralExpCS_1=ruleStringLiteralExpCS();

                    state._fsp--;


                    			current = this_StringLiteralExpCS_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyAtlProject.g:1861:3: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteralExpCS_2=ruleBooleanLiteralExpCS();

                    state._fsp--;


                    			current = this_BooleanLiteralExpCS_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyAtlProject.g:1870:3: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnlimitedNaturalLiteralExpCS_3=ruleUnlimitedNaturalLiteralExpCS();

                    state._fsp--;


                    			current = this_UnlimitedNaturalLiteralExpCS_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyAtlProject.g:1879:3: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_InvalidLiteralExpCS_4=ruleInvalidLiteralExpCS();

                    state._fsp--;


                    			current = this_InvalidLiteralExpCS_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyAtlProject.g:1888:3: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullLiteralExpCS_5=ruleNullLiteralExpCS();

                    state._fsp--;


                    			current = this_NullLiteralExpCS_5;
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
    // $ANTLR end "rulePrimitiveLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralExpCS"
    // InternalMyAtlProject.g:1900:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // InternalMyAtlProject.g:1900:58: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // InternalMyAtlProject.g:1901:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
             newCompositeNode(grammarAccess.getTupleLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();

            state._fsp--;

             current =iv_ruleTupleLiteralExpCS; 
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
    // $ANTLR end "entryRuleTupleLiteralExpCS"


    // $ANTLR start "ruleTupleLiteralExpCS"
    // InternalMyAtlProject.g:1907:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:1913:2: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // InternalMyAtlProject.g:1914:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // InternalMyAtlProject.g:1914:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // InternalMyAtlProject.g:1915:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyAtlProject.g:1923:3: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // InternalMyAtlProject.g:1924:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // InternalMyAtlProject.g:1924:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // InternalMyAtlProject.g:1925:5: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {

            					newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
            lv_ownedParts_2_0=ruleTupleLiteralPartCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            					}
            					add(
            						current,
            						"ownedParts",
            						lv_ownedParts_2_0,
            						"org.xtext.example.mydsl.MyAtlProject.TupleLiteralPartCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtlProject.g:1942:3: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==33) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyAtlProject.g:1943:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyAtlProject.g:1947:4: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // InternalMyAtlProject.g:1948:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // InternalMyAtlProject.g:1948:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // InternalMyAtlProject.g:1949:6: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {

            	    						newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_ownedParts_4_0=ruleTupleLiteralPartCS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedParts",
            	    							lv_ownedParts_4_0,
            	    							"org.xtext.example.mydsl.MyAtlProject.TupleLiteralPartCS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTupleLiteralExpCSAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTupleLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralPartCS"
    // InternalMyAtlProject.g:1975:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // InternalMyAtlProject.g:1975:59: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // InternalMyAtlProject.g:1976:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
             newCompositeNode(grammarAccess.getTupleLiteralPartCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();

            state._fsp--;

             current =iv_ruleTupleLiteralPartCS; 
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
    // $ANTLR end "entryRuleTupleLiteralPartCS"


    // $ANTLR start "ruleTupleLiteralPartCS"
    // InternalMyAtlProject.g:1982:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:1988:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // InternalMyAtlProject.g:1989:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // InternalMyAtlProject.g:1989:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // InternalMyAtlProject.g:1990:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // InternalMyAtlProject.g:1990:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:1991:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:1991:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyAtlProject.g:1992:5: lv_name_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyAtlProject.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtlProject.g:2009:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyAtlProject.g:2010:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyAtlProject.g:2014:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyAtlProject.g:2015:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyAtlProject.g:2015:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyAtlProject.g:2016:6: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_2_0,
                    							"org.xtext.example.mydsl.MyAtlProject.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,32,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
            		
            // InternalMyAtlProject.g:2038:3: ( (lv_initExpression_4_0= ruleExpCS ) )
            // InternalMyAtlProject.g:2039:4: (lv_initExpression_4_0= ruleExpCS )
            {
            // InternalMyAtlProject.g:2039:4: (lv_initExpression_4_0= ruleExpCS )
            // InternalMyAtlProject.g:2040:5: lv_initExpression_4_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionExpCSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_initExpression_4_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
            					}
            					set(
            						current,
            						"initExpression",
            						lv_initExpression_4_0,
            						"org.xtext.example.mydsl.MyAtlProject.ExpCS");
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
    // $ANTLR end "ruleTupleLiteralPartCS"


    // $ANTLR start "entryRuleNumberLiteralExpCS"
    // InternalMyAtlProject.g:2061:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // InternalMyAtlProject.g:2061:59: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // InternalMyAtlProject.g:2062:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();

            state._fsp--;

             current =iv_ruleNumberLiteralExpCS; 
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
    // $ANTLR end "entryRuleNumberLiteralExpCS"


    // $ANTLR start "ruleNumberLiteralExpCS"
    // InternalMyAtlProject.g:2068:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= RULE_BIG_INT ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyAtlProject.g:2074:2: ( ( (lv_name_0_0= RULE_BIG_INT ) ) )
            // InternalMyAtlProject.g:2075:2: ( (lv_name_0_0= RULE_BIG_INT ) )
            {
            // InternalMyAtlProject.g:2075:2: ( (lv_name_0_0= RULE_BIG_INT ) )
            // InternalMyAtlProject.g:2076:3: (lv_name_0_0= RULE_BIG_INT )
            {
            // InternalMyAtlProject.g:2076:3: (lv_name_0_0= RULE_BIG_INT )
            // InternalMyAtlProject.g:2077:4: lv_name_0_0= RULE_BIG_INT
            {
            lv_name_0_0=(Token)match(input,RULE_BIG_INT,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getNumberLiteralExpCSAccess().getNameBIG_INTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberLiteralExpCSRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.mydsl.MyAtlProject.BIG_INT");
            			

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
    // $ANTLR end "ruleNumberLiteralExpCS"


    // $ANTLR start "entryRuleStringLiteralExpCS"
    // InternalMyAtlProject.g:2096:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // InternalMyAtlProject.g:2096:59: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // InternalMyAtlProject.g:2097:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;

             current =iv_ruleStringLiteralExpCS; 
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
    // $ANTLR end "entryRuleStringLiteralExpCS"


    // $ANTLR start "ruleStringLiteralExpCS"
    // InternalMyAtlProject.g:2103:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleStringLiteral ) ) ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:2109:2: ( ( (lv_name_0_0= ruleStringLiteral ) ) )
            // InternalMyAtlProject.g:2110:2: ( (lv_name_0_0= ruleStringLiteral ) )
            {
            // InternalMyAtlProject.g:2110:2: ( (lv_name_0_0= ruleStringLiteral ) )
            // InternalMyAtlProject.g:2111:3: (lv_name_0_0= ruleStringLiteral )
            {
            // InternalMyAtlProject.g:2111:3: (lv_name_0_0= ruleStringLiteral )
            // InternalMyAtlProject.g:2112:4: lv_name_0_0= ruleStringLiteral
            {

            				newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getNameStringLiteralParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleStringLiteral();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStringLiteralExpCSRule());
            				}
            				add(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.mydsl.MyAtlProject.StringLiteral");
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
    // $ANTLR end "ruleStringLiteralExpCS"


    // $ANTLR start "entryRuleBooleanLiteralExpCS"
    // InternalMyAtlProject.g:2132:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // InternalMyAtlProject.g:2132:60: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // InternalMyAtlProject.g:2133:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;

             current =iv_ruleBooleanLiteralExpCS; 
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
    // $ANTLR end "entryRuleBooleanLiteralExpCS"


    // $ANTLR start "ruleBooleanLiteralExpCS"
    // InternalMyAtlProject.g:2139:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyAtlProject.g:2145:2: ( ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) )
            // InternalMyAtlProject.g:2146:2: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            {
            // InternalMyAtlProject.g:2146:2: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==68) ) {
                alt32=1;
            }
            else if ( (LA32_0==69) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyAtlProject.g:2147:3: ( (lv_name_0_0= 'true' ) )
                    {
                    // InternalMyAtlProject.g:2147:3: ( (lv_name_0_0= 'true' ) )
                    // InternalMyAtlProject.g:2148:4: (lv_name_0_0= 'true' )
                    {
                    // InternalMyAtlProject.g:2148:4: (lv_name_0_0= 'true' )
                    // InternalMyAtlProject.g:2149:5: lv_name_0_0= 'true'
                    {
                    lv_name_0_0=(Token)match(input,68,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getBooleanLiteralExpCSAccess().getNameTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:2162:3: ( (lv_name_1_0= 'false' ) )
                    {
                    // InternalMyAtlProject.g:2162:3: ( (lv_name_1_0= 'false' ) )
                    // InternalMyAtlProject.g:2163:4: (lv_name_1_0= 'false' )
                    {
                    // InternalMyAtlProject.g:2163:4: (lv_name_1_0= 'false' )
                    // InternalMyAtlProject.g:2164:5: lv_name_1_0= 'false'
                    {
                    lv_name_1_0=(Token)match(input,69,FOLLOW_2); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getBooleanLiteralExpCSAccess().getNameFalseKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_1_0, "false");
                    				

                    }


                    }


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
    // $ANTLR end "ruleBooleanLiteralExpCS"


    // $ANTLR start "entryRuleUnlimitedNaturalLiteralExpCS"
    // InternalMyAtlProject.g:2180:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // InternalMyAtlProject.g:2180:69: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // InternalMyAtlProject.g:2181:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
             newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;

             current =iv_ruleUnlimitedNaturalLiteralExpCS; 
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
    // $ANTLR end "entryRuleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "ruleUnlimitedNaturalLiteralExpCS"
    // InternalMyAtlProject.g:2187:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtlProject.g:2193:2: ( ( () otherlv_1= '*' ) )
            // InternalMyAtlProject.g:2194:2: ( () otherlv_1= '*' )
            {
            // InternalMyAtlProject.g:2194:2: ( () otherlv_1= '*' )
            // InternalMyAtlProject.g:2195:3: () otherlv_1= '*'
            {
            // InternalMyAtlProject.g:2195:3: ()
            // InternalMyAtlProject.g:2196:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getAsteriskKeyword_1());
            		

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
    // $ANTLR end "ruleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "entryRuleInvalidLiteralExpCS"
    // InternalMyAtlProject.g:2210:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // InternalMyAtlProject.g:2210:60: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // InternalMyAtlProject.g:2211:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
             newCompositeNode(grammarAccess.getInvalidLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();

            state._fsp--;

             current =iv_ruleInvalidLiteralExpCS; 
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
    // $ANTLR end "entryRuleInvalidLiteralExpCS"


    // $ANTLR start "ruleInvalidLiteralExpCS"
    // InternalMyAtlProject.g:2217:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtlProject.g:2223:2: ( ( () otherlv_1= 'invalid' ) )
            // InternalMyAtlProject.g:2224:2: ( () otherlv_1= 'invalid' )
            {
            // InternalMyAtlProject.g:2224:2: ( () otherlv_1= 'invalid' )
            // InternalMyAtlProject.g:2225:3: () otherlv_1= 'invalid'
            {
            // InternalMyAtlProject.g:2225:3: ()
            // InternalMyAtlProject.g:2226:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInvalidLiteralExpCSAccess().getInvalidKeyword_1());
            		

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
    // $ANTLR end "ruleInvalidLiteralExpCS"


    // $ANTLR start "entryRuleNullLiteralExpCS"
    // InternalMyAtlProject.g:2240:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // InternalMyAtlProject.g:2240:57: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // InternalMyAtlProject.g:2241:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
             newCompositeNode(grammarAccess.getNullLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();

            state._fsp--;

             current =iv_ruleNullLiteralExpCS; 
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
    // $ANTLR end "entryRuleNullLiteralExpCS"


    // $ANTLR start "ruleNullLiteralExpCS"
    // InternalMyAtlProject.g:2247:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtlProject.g:2253:2: ( ( () otherlv_1= 'null' ) )
            // InternalMyAtlProject.g:2254:2: ( () otherlv_1= 'null' )
            {
            // InternalMyAtlProject.g:2254:2: ( () otherlv_1= 'null' )
            // InternalMyAtlProject.g:2255:3: () otherlv_1= 'null'
            {
            // InternalMyAtlProject.g:2255:3: ()
            // InternalMyAtlProject.g:2256:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNullLiteralExpCSAccess().getNullKeyword_1());
            		

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
    // $ANTLR end "ruleNullLiteralExpCS"


    // $ANTLR start "entryRuleTypeLiteralCS"
    // InternalMyAtlProject.g:2270:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // InternalMyAtlProject.g:2270:54: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // InternalMyAtlProject.g:2271:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
            {
             newCompositeNode(grammarAccess.getTypeLiteralCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeLiteralCS=ruleTypeLiteralCS();

            state._fsp--;

             current =iv_ruleTypeLiteralCS; 
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
    // $ANTLR end "entryRuleTypeLiteralCS"


    // $ANTLR start "ruleTypeLiteralCS"
    // InternalMyAtlProject.g:2277:1: ruleTypeLiteralCS returns [EObject current=null] : this_PrimitiveTypeCS_0= rulePrimitiveTypeCS ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:2283:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS )
            // InternalMyAtlProject.g:2284:2: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
            {

            		newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PrimitiveTypeCS_0=rulePrimitiveTypeCS();

            state._fsp--;


            		current = this_PrimitiveTypeCS_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleTypeLiteralCS"


    // $ANTLR start "entryRuleTypeLiteralExpCS"
    // InternalMyAtlProject.g:2295:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // InternalMyAtlProject.g:2295:57: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // InternalMyAtlProject.g:2296:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
             newCompositeNode(grammarAccess.getTypeLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();

            state._fsp--;

             current =iv_ruleTypeLiteralExpCS; 
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
    // $ANTLR end "entryRuleTypeLiteralExpCS"


    // $ANTLR start "ruleTypeLiteralExpCS"
    // InternalMyAtlProject.g:2302:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:2308:2: ( ( (lv_ownedType_0_0= ruleTypeLiteralCS ) ) )
            // InternalMyAtlProject.g:2309:2: ( (lv_ownedType_0_0= ruleTypeLiteralCS ) )
            {
            // InternalMyAtlProject.g:2309:2: ( (lv_ownedType_0_0= ruleTypeLiteralCS ) )
            // InternalMyAtlProject.g:2310:3: (lv_ownedType_0_0= ruleTypeLiteralCS )
            {
            // InternalMyAtlProject.g:2310:3: (lv_ownedType_0_0= ruleTypeLiteralCS )
            // InternalMyAtlProject.g:2311:4: lv_ownedType_0_0= ruleTypeLiteralCS
            {

            				newCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralCSParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedType_0_0=ruleTypeLiteralCS();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTypeLiteralExpCSRule());
            				}
            				set(
            					current,
            					"ownedType",
            					lv_ownedType_0_0,
            					"org.xtext.example.mydsl.MyAtlProject.TypeLiteralCS");
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
    // $ANTLR end "ruleTypeLiteralExpCS"


    // $ANTLR start "entryRuleTypeNameExpCS"
    // InternalMyAtlProject.g:2331:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // InternalMyAtlProject.g:2331:54: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // InternalMyAtlProject.g:2332:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
             newCompositeNode(grammarAccess.getTypeNameExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();

            state._fsp--;

             current =iv_ruleTypeNameExpCS; 
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
    // $ANTLR end "entryRuleTypeNameExpCS"


    // $ANTLR start "ruleTypeNameExpCS"
    // InternalMyAtlProject.g:2338:1: ruleTypeNameExpCS returns [EObject current=null] : ruleEssentialOCLUnrestrictedName ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalMyAtlProject.g:2344:2: ( ruleEssentialOCLUnrestrictedName )
            // InternalMyAtlProject.g:2345:2: ruleEssentialOCLUnrestrictedName
            {

            		newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getEssentialOCLUnrestrictedNameParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            ruleEssentialOCLUnrestrictedName();

            state._fsp--;


            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleTypeNameExpCS"


    // $ANTLR start "entryRuleTypeExpCS"
    // InternalMyAtlProject.g:2355:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // InternalMyAtlProject.g:2355:50: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // InternalMyAtlProject.g:2356:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
             newCompositeNode(grammarAccess.getTypeExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeExpCS=ruleTypeExpCS();

            state._fsp--;

             current =iv_ruleTypeExpCS; 
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
    // $ANTLR end "entryRuleTypeExpCS"


    // $ANTLR start "ruleTypeExpCS"
    // InternalMyAtlProject.g:2362:1: ruleTypeExpCS returns [EObject current=null] : (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:2368:2: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) )
            // InternalMyAtlProject.g:2369:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            {
            // InternalMyAtlProject.g:2369:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_SIMPLE_ID) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=54 && LA33_0<=61)) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyAtlProject.g:2370:3: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {

                    			newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeNameExpCSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeNameExpCS_0=ruleTypeNameExpCS();

                    state._fsp--;


                    			current = this_TypeNameExpCS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:2379:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {

                    			newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeLiteralCSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeLiteralCS_1=ruleTypeLiteralCS();

                    state._fsp--;


                    			current = this_TypeLiteralCS_1;
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
    // $ANTLR end "ruleTypeExpCS"


    // $ANTLR start "entryRuleNavigatingArgCS"
    // InternalMyAtlProject.g:2391:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // InternalMyAtlProject.g:2391:56: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // InternalMyAtlProject.g:2392:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
            {
             newCompositeNode(grammarAccess.getNavigatingArgCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigatingArgCS=ruleNavigatingArgCS();

            state._fsp--;

             current =iv_ruleNavigatingArgCS; 
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
    // $ANTLR end "entryRuleNavigatingArgCS"


    // $ANTLR start "ruleNavigatingArgCS"
    // InternalMyAtlProject.g:2398:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_init_4_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:2404:2: ( ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? ) )
            // InternalMyAtlProject.g:2405:2: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtlProject.g:2405:2: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )
            // InternalMyAtlProject.g:2406:3: ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
            {
            // InternalMyAtlProject.g:2406:3: ( (lv_name_0_0= ruleNavigatingArgExpCS ) )
            // InternalMyAtlProject.g:2407:4: (lv_name_0_0= ruleNavigatingArgExpCS )
            {
            // InternalMyAtlProject.g:2407:4: (lv_name_0_0= ruleNavigatingArgExpCS )
            // InternalMyAtlProject.g:2408:5: lv_name_0_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
            lv_name_0_0=ruleNavigatingArgExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyAtlProject.NavigatingArgExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtlProject.g:2425:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==18) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyAtlProject.g:2426:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyAtlProject.g:2430:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyAtlProject.g:2431:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyAtlProject.g:2431:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyAtlProject.g:2432:6: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_2_0,
                    							"org.xtext.example.mydsl.MyAtlProject.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyAtlProject.g:2450:3: (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyAtlProject.g:2451:4: otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalMyAtlProject.g:2455:4: ( (lv_init_4_0= ruleExpCS ) )
                    // InternalMyAtlProject.g:2456:5: (lv_init_4_0= ruleExpCS )
                    {
                    // InternalMyAtlProject.g:2456:5: (lv_init_4_0= ruleExpCS )
                    // InternalMyAtlProject.g:2457:6: lv_init_4_0= ruleExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getInitExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_init_4_0=ruleExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_4_0,
                    							"org.xtext.example.mydsl.MyAtlProject.ExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleNavigatingArgCS"


    // $ANTLR start "entryRuleNavigatingBarArgCS"
    // InternalMyAtlProject.g:2479:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // InternalMyAtlProject.g:2479:59: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // InternalMyAtlProject.g:2480:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
            {
             newCompositeNode(grammarAccess.getNavigatingBarArgCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigatingBarArgCS=ruleNavigatingBarArgCS();

            state._fsp--;

             current =iv_ruleNavigatingBarArgCS; 
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
    // $ANTLR end "entryRuleNavigatingBarArgCS"


    // $ANTLR start "ruleNavigatingBarArgCS"
    // InternalMyAtlProject.g:2486:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_init_5_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:2492:2: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyAtlProject.g:2493:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtlProject.g:2493:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyAtlProject.g:2494:3: ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyAtlProject.g:2494:3: ( (lv_prefix_0_0= '|' ) )
            // InternalMyAtlProject.g:2495:4: (lv_prefix_0_0= '|' )
            {
            // InternalMyAtlProject.g:2495:4: (lv_prefix_0_0= '|' )
            // InternalMyAtlProject.g:2496:5: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,72,FOLLOW_35); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, "|");
            				

            }


            }

            // InternalMyAtlProject.g:2508:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyAtlProject.g:2509:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyAtlProject.g:2509:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyAtlProject.g:2510:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyAtlProject.NavigatingArgExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtlProject.g:2527:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==18) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyAtlProject.g:2528:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyAtlProject.g:2532:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyAtlProject.g:2533:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyAtlProject.g:2533:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyAtlProject.g:2534:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_3_0,
                    							"org.xtext.example.mydsl.MyAtlProject.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyAtlProject.g:2552:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyAtlProject.g:2553:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyAtlProject.g:2557:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyAtlProject.g:2558:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyAtlProject.g:2558:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyAtlProject.g:2559:6: lv_init_5_0= ruleExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getInitExpCSParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_init_5_0=ruleExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_5_0,
                    							"org.xtext.example.mydsl.MyAtlProject.ExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleNavigatingBarArgCS"


    // $ANTLR start "entryRuleNavigatingCommaArgCS"
    // InternalMyAtlProject.g:2581:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // InternalMyAtlProject.g:2581:61: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // InternalMyAtlProject.g:2582:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
            {
             newCompositeNode(grammarAccess.getNavigatingCommaArgCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigatingCommaArgCS=ruleNavigatingCommaArgCS();

            state._fsp--;

             current =iv_ruleNavigatingCommaArgCS; 
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
    // $ANTLR end "entryRuleNavigatingCommaArgCS"


    // $ANTLR start "ruleNavigatingCommaArgCS"
    // InternalMyAtlProject.g:2588:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_init_5_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:2594:2: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyAtlProject.g:2595:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtlProject.g:2595:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyAtlProject.g:2596:3: ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyAtlProject.g:2596:3: ( (lv_prefix_0_0= ',' ) )
            // InternalMyAtlProject.g:2597:4: (lv_prefix_0_0= ',' )
            {
            // InternalMyAtlProject.g:2597:4: (lv_prefix_0_0= ',' )
            // InternalMyAtlProject.g:2598:5: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,33,FOLLOW_35); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ",");
            				

            }


            }

            // InternalMyAtlProject.g:2610:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyAtlProject.g:2611:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyAtlProject.g:2611:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyAtlProject.g:2612:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyAtlProject.NavigatingArgExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtlProject.g:2629:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==18) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyAtlProject.g:2630:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyAtlProject.g:2634:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyAtlProject.g:2635:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyAtlProject.g:2635:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyAtlProject.g:2636:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_3_0,
                    							"org.xtext.example.mydsl.MyAtlProject.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyAtlProject.g:2654:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyAtlProject.g:2655:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyAtlProject.g:2659:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyAtlProject.g:2660:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyAtlProject.g:2660:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyAtlProject.g:2661:6: lv_init_5_0= ruleExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getInitExpCSParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_init_5_0=ruleExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_5_0,
                    							"org.xtext.example.mydsl.MyAtlProject.ExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleNavigatingCommaArgCS"


    // $ANTLR start "entryRuleNavigatingSemiArgCS"
    // InternalMyAtlProject.g:2683:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // InternalMyAtlProject.g:2683:60: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // InternalMyAtlProject.g:2684:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
            {
             newCompositeNode(grammarAccess.getNavigatingSemiArgCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigatingSemiArgCS=ruleNavigatingSemiArgCS();

            state._fsp--;

             current =iv_ruleNavigatingSemiArgCS; 
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
    // $ANTLR end "entryRuleNavigatingSemiArgCS"


    // $ANTLR start "ruleNavigatingSemiArgCS"
    // InternalMyAtlProject.g:2690:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_init_5_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:2696:2: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyAtlProject.g:2697:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtlProject.g:2697:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyAtlProject.g:2698:3: ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyAtlProject.g:2698:3: ( (lv_prefix_0_0= ';' ) )
            // InternalMyAtlProject.g:2699:4: (lv_prefix_0_0= ';' )
            {
            // InternalMyAtlProject.g:2699:4: (lv_prefix_0_0= ';' )
            // InternalMyAtlProject.g:2700:5: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,15,FOLLOW_35); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ";");
            				

            }


            }

            // InternalMyAtlProject.g:2712:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyAtlProject.g:2713:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyAtlProject.g:2713:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyAtlProject.g:2714:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyAtlProject.NavigatingArgExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtlProject.g:2731:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==18) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyAtlProject.g:2732:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyAtlProject.g:2736:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyAtlProject.g:2737:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyAtlProject.g:2737:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyAtlProject.g:2738:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_3_0,
                    							"org.xtext.example.mydsl.MyAtlProject.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyAtlProject.g:2756:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==32) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyAtlProject.g:2757:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyAtlProject.g:2761:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyAtlProject.g:2762:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyAtlProject.g:2762:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyAtlProject.g:2763:6: lv_init_5_0= ruleExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getInitExpCSParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_init_5_0=ruleExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_5_0,
                    							"org.xtext.example.mydsl.MyAtlProject.ExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleNavigatingSemiArgCS"


    // $ANTLR start "entryRuleNavigatingArgExpCS"
    // InternalMyAtlProject.g:2785:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // InternalMyAtlProject.g:2785:59: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // InternalMyAtlProject.g:2786:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
             newCompositeNode(grammarAccess.getNavigatingArgExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();

            state._fsp--;

             current =iv_ruleNavigatingArgExpCS; 
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
    // $ANTLR end "entryRuleNavigatingArgExpCS"


    // $ANTLR start "ruleNavigatingArgExpCS"
    // InternalMyAtlProject.g:2792:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:2798:2: (this_ExpCS_0= ruleExpCS )
            // InternalMyAtlProject.g:2799:2: this_ExpCS_0= ruleExpCS
            {

            		newCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ExpCS_0=ruleExpCS();

            state._fsp--;


            		current = this_ExpCS_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleNavigatingArgExpCS"


    // $ANTLR start "entryRuleIfExpCS"
    // InternalMyAtlProject.g:2810:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // InternalMyAtlProject.g:2810:48: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // InternalMyAtlProject.g:2811:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
             newCompositeNode(grammarAccess.getIfExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfExpCS=ruleIfExpCS();

            state._fsp--;

             current =iv_ruleIfExpCS; 
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
    // $ANTLR end "entryRuleIfExpCS"


    // $ANTLR start "ruleIfExpCS"
    // InternalMyAtlProject.g:2817:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) ;
    public final EObject ruleIfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_1_0 = null;

        EObject lv_thenExpression_3_0 = null;

        EObject lv_elseExpression_5_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:2823:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) )
            // InternalMyAtlProject.g:2824:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            {
            // InternalMyAtlProject.g:2824:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            // InternalMyAtlProject.g:2825:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
            		
            // InternalMyAtlProject.g:2829:3: ( (lv_condition_1_0= ruleExpCS ) )
            // InternalMyAtlProject.g:2830:4: (lv_condition_1_0= ruleExpCS )
            {
            // InternalMyAtlProject.g:2830:4: (lv_condition_1_0= ruleExpCS )
            // InternalMyAtlProject.g:2831:5: lv_condition_1_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getConditionExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_condition_1_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.xtext.example.mydsl.MyAtlProject.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,74,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
            		
            // InternalMyAtlProject.g:2852:3: ( (lv_thenExpression_3_0= ruleExpCS ) )
            // InternalMyAtlProject.g:2853:4: (lv_thenExpression_3_0= ruleExpCS )
            {
            // InternalMyAtlProject.g:2853:4: (lv_thenExpression_3_0= ruleExpCS )
            // InternalMyAtlProject.g:2854:5: lv_thenExpression_3_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getThenExpressionExpCSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_41);
            lv_thenExpression_3_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            					}
            					set(
            						current,
            						"thenExpression",
            						lv_thenExpression_3_0,
            						"org.xtext.example.mydsl.MyAtlProject.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,75,FOLLOW_35); 

            			newLeafNode(otherlv_4, grammarAccess.getIfExpCSAccess().getElseKeyword_4());
            		
            // InternalMyAtlProject.g:2875:3: ( (lv_elseExpression_5_0= ruleExpCS ) )
            // InternalMyAtlProject.g:2876:4: (lv_elseExpression_5_0= ruleExpCS )
            {
            // InternalMyAtlProject.g:2876:4: (lv_elseExpression_5_0= ruleExpCS )
            // InternalMyAtlProject.g:2877:5: lv_elseExpression_5_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getElseExpressionExpCSParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_42);
            lv_elseExpression_5_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            					}
            					set(
            						current,
            						"elseExpression",
            						lv_elseExpression_5_0,
            						"org.xtext.example.mydsl.MyAtlProject.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,76,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIfExpCSAccess().getEndifKeyword_6());
            		

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
    // $ANTLR end "ruleIfExpCS"


    // $ANTLR start "entryRuleLetExpCS"
    // InternalMyAtlProject.g:2902:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // InternalMyAtlProject.g:2902:49: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // InternalMyAtlProject.g:2903:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
             newCompositeNode(grammarAccess.getLetExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetExpCS=ruleLetExpCS();

            state._fsp--;

             current =iv_ruleLetExpCS; 
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
    // $ANTLR end "entryRuleLetExpCS"


    // $ANTLR start "ruleLetExpCS"
    // InternalMyAtlProject.g:2909:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_in_5_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:2915:2: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) )
            // InternalMyAtlProject.g:2916:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            {
            // InternalMyAtlProject.g:2916:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            // InternalMyAtlProject.g:2917:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
            		
            // InternalMyAtlProject.g:2921:3: ( (lv_variable_1_0= ruleLetVariableCS ) )
            // InternalMyAtlProject.g:2922:4: (lv_variable_1_0= ruleLetVariableCS )
            {
            // InternalMyAtlProject.g:2922:4: (lv_variable_1_0= ruleLetVariableCS )
            // InternalMyAtlProject.g:2923:5: lv_variable_1_0= ruleLetVariableCS
            {

            					newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_43);
            lv_variable_1_0=ruleLetVariableCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            					}
            					add(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"org.xtext.example.mydsl.MyAtlProject.LetVariableCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtlProject.g:2940:3: (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==33) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMyAtlProject.g:2941:4: otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyAtlProject.g:2945:4: ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    // InternalMyAtlProject.g:2946:5: (lv_variable_3_0= ruleLetVariableCS )
            	    {
            	    // InternalMyAtlProject.g:2946:5: (lv_variable_3_0= ruleLetVariableCS )
            	    // InternalMyAtlProject.g:2947:6: lv_variable_3_0= ruleLetVariableCS
            	    {

            	    						newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_variable_3_0=ruleLetVariableCS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variable",
            	    							lv_variable_3_0,
            	    							"org.xtext.example.mydsl.MyAtlProject.LetVariableCS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_4=(Token)match(input,78,FOLLOW_35); 

            			newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
            		
            // InternalMyAtlProject.g:2969:3: ( (lv_in_5_0= ruleExpCS ) )
            // InternalMyAtlProject.g:2970:4: (lv_in_5_0= ruleExpCS )
            {
            // InternalMyAtlProject.g:2970:4: (lv_in_5_0= ruleExpCS )
            // InternalMyAtlProject.g:2971:5: lv_in_5_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getLetExpCSAccess().getInExpCSParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_in_5_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            					}
            					set(
            						current,
            						"in",
            						lv_in_5_0,
            						"org.xtext.example.mydsl.MyAtlProject.ExpCS");
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
    // $ANTLR end "ruleLetExpCS"


    // $ANTLR start "entryRuleLetVariableCS"
    // InternalMyAtlProject.g:2992:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // InternalMyAtlProject.g:2992:54: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // InternalMyAtlProject.g:2993:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
             newCompositeNode(grammarAccess.getLetVariableCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetVariableCS=ruleLetVariableCS();

            state._fsp--;

             current =iv_ruleLetVariableCS; 
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
    // $ANTLR end "entryRuleLetVariableCS"


    // $ANTLR start "ruleLetVariableCS"
    // InternalMyAtlProject.g:2999:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:3005:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // InternalMyAtlProject.g:3006:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // InternalMyAtlProject.g:3006:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // InternalMyAtlProject.g:3007:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // InternalMyAtlProject.g:3007:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:3008:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:3008:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyAtlProject.g:3009:5: lv_name_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyAtlProject.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtlProject.g:3026:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==18) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyAtlProject.g:3027:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getLetVariableCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyAtlProject.g:3031:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyAtlProject.g:3032:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyAtlProject.g:3032:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyAtlProject.g:3033:6: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_2_0,
                    							"org.xtext.example.mydsl.MyAtlProject.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,32,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_2());
            		
            // InternalMyAtlProject.g:3055:3: ( (lv_initExpression_4_0= ruleExpCS ) )
            // InternalMyAtlProject.g:3056:4: (lv_initExpression_4_0= ruleExpCS )
            {
            // InternalMyAtlProject.g:3056:4: (lv_initExpression_4_0= ruleExpCS )
            // InternalMyAtlProject.g:3057:5: lv_initExpression_4_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getLetVariableCSAccess().getInitExpressionExpCSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_initExpression_4_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
            					}
            					set(
            						current,
            						"initExpression",
            						lv_initExpression_4_0,
            						"org.xtext.example.mydsl.MyAtlProject.ExpCS");
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
    // $ANTLR end "ruleLetVariableCS"


    // $ANTLR start "entryRuleNestedExpCS"
    // InternalMyAtlProject.g:3078:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // InternalMyAtlProject.g:3078:52: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // InternalMyAtlProject.g:3079:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
             newCompositeNode(grammarAccess.getNestedExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNestedExpCS=ruleNestedExpCS();

            state._fsp--;

             current =iv_ruleNestedExpCS; 
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
    // $ANTLR end "entryRuleNestedExpCS"


    // $ANTLR start "ruleNestedExpCS"
    // InternalMyAtlProject.g:3085:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_source_1_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:3091:2: ( (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // InternalMyAtlProject.g:3092:2: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // InternalMyAtlProject.g:3092:2: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // InternalMyAtlProject.g:3093:3: otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyAtlProject.g:3097:3: ( (lv_source_1_0= ruleExpCS ) )
            // InternalMyAtlProject.g:3098:4: (lv_source_1_0= ruleExpCS )
            {
            // InternalMyAtlProject.g:3098:4: (lv_source_1_0= ruleExpCS )
            // InternalMyAtlProject.g:3099:5: lv_source_1_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getNestedExpCSAccess().getSourceExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_source_1_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNestedExpCSRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_1_0,
            						"org.xtext.example.mydsl.MyAtlProject.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getNestedExpCSAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleNestedExpCS"


    // $ANTLR start "entryRuleSelfExpCS"
    // InternalMyAtlProject.g:3124:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // InternalMyAtlProject.g:3124:50: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // InternalMyAtlProject.g:3125:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
            {
             newCompositeNode(grammarAccess.getSelfExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelfExpCS=ruleSelfExpCS();

            state._fsp--;

             current =iv_ruleSelfExpCS; 
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
    // $ANTLR end "entryRuleSelfExpCS"


    // $ANTLR start "ruleSelfExpCS"
    // InternalMyAtlProject.g:3131:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtlProject.g:3137:2: ( ( () otherlv_1= 'self' ) )
            // InternalMyAtlProject.g:3138:2: ( () otherlv_1= 'self' )
            {
            // InternalMyAtlProject.g:3138:2: ( () otherlv_1= 'self' )
            // InternalMyAtlProject.g:3139:3: () otherlv_1= 'self'
            {
            // InternalMyAtlProject.g:3139:3: ()
            // InternalMyAtlProject.g:3140:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelfExpCSAccess().getSelfExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSelfExpCSAccess().getSelfKeyword_1());
            		

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
    // $ANTLR end "ruleSelfExpCS"


    // $ANTLR start "entryRulePrimaryExpCS"
    // InternalMyAtlProject.g:3154:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // InternalMyAtlProject.g:3154:53: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // InternalMyAtlProject.g:3155:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();

            state._fsp--;

             current =iv_rulePrimaryExpCS; 
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
    // $ANTLR end "entryRulePrimaryExpCS"


    // $ANTLR start "rulePrimaryExpCS"
    // InternalMyAtlProject.g:3161:1: rulePrimaryExpCS returns [EObject current=null] : (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS ) ;
    public final EObject rulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NavigatingExpCS_0 = null;

        EObject this_SelfExpCS_1 = null;

        EObject this_PrimitiveLiteralExpCS_2 = null;

        EObject this_TupleLiteralExpCS_3 = null;

        EObject this_CollectionLiteralExpCS_4 = null;

        EObject this_TypeLiteralExpCS_5 = null;

        EObject this_LetExpCS_6 = null;

        EObject this_IfExpCS_7 = null;

        EObject this_NestedExpCS_8 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:3167:2: ( (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS ) )
            // InternalMyAtlProject.g:3168:2: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )
            {
            // InternalMyAtlProject.g:3168:2: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS | this_LetExpCS_6= ruleLetExpCS | this_IfExpCS_7= ruleIfExpCS | this_NestedExpCS_8= ruleNestedExpCS )
            int alt44=9;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
                {
                alt44=1;
                }
                break;
            case 79:
                {
                alt44=2;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
            case RULE_BIG_INT:
            case 39:
            case 68:
            case 69:
            case 70:
            case 71:
                {
                alt44=3;
                }
                break;
            case 53:
                {
                alt44=4;
                }
                break;
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt44=5;
                }
                break;
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt44=6;
                }
                break;
            case 77:
                {
                alt44=7;
                }
                break;
            case 73:
                {
                alt44=8;
                }
                break;
            case 28:
                {
                alt44=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalMyAtlProject.g:3169:3: this_NavigatingExpCS_0= ruleNavigatingExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNavigatingExpCSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NavigatingExpCS_0=ruleNavigatingExpCS();

                    state._fsp--;


                    			current = this_NavigatingExpCS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:3178:3: this_SelfExpCS_1= ruleSelfExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSelfExpCSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelfExpCS_1=ruleSelfExpCS();

                    state._fsp--;


                    			current = this_SelfExpCS_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyAtlProject.g:3187:3: this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveLiteralExpCS_2=rulePrimitiveLiteralExpCS();

                    state._fsp--;


                    			current = this_PrimitiveLiteralExpCS_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyAtlProject.g:3196:3: this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TupleLiteralExpCS_3=ruleTupleLiteralExpCS();

                    state._fsp--;


                    			current = this_TupleLiteralExpCS_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyAtlProject.g:3205:3: this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollectionLiteralExpCS_4=ruleCollectionLiteralExpCS();

                    state._fsp--;


                    			current = this_CollectionLiteralExpCS_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyAtlProject.g:3214:3: this_TypeLiteralExpCS_5= ruleTypeLiteralExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeLiteralExpCS_5=ruleTypeLiteralExpCS();

                    state._fsp--;


                    			current = this_TypeLiteralExpCS_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyAtlProject.g:3223:3: this_LetExpCS_6= ruleLetExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLetExpCSParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetExpCS_6=ruleLetExpCS();

                    state._fsp--;


                    			current = this_LetExpCS_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyAtlProject.g:3232:3: this_IfExpCS_7= ruleIfExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfExpCS_7=ruleIfExpCS();

                    state._fsp--;


                    			current = this_IfExpCS_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyAtlProject.g:3241:3: this_NestedExpCS_8= ruleNestedExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_NestedExpCS_8=ruleNestedExpCS();

                    state._fsp--;


                    			current = this_NestedExpCS_8;
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
    // $ANTLR end "rulePrimaryExpCS"


    // $ANTLR start "entryRuleNameExpCS"
    // InternalMyAtlProject.g:3253:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // InternalMyAtlProject.g:3253:50: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // InternalMyAtlProject.g:3254:2: iv_ruleNameExpCS= ruleNameExpCS EOF
            {
             newCompositeNode(grammarAccess.getNameExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameExpCS=ruleNameExpCS();

            state._fsp--;

             current =iv_ruleNameExpCS; 
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
    // $ANTLR end "entryRuleNameExpCS"


    // $ANTLR start "ruleNameExpCS"
    // InternalMyAtlProject.g:3260:1: ruleNameExpCS returns [EObject current=null] : ruleEssentialOCLUnrestrictedName ;
    public final EObject ruleNameExpCS() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalMyAtlProject.g:3266:2: ( ruleEssentialOCLUnrestrictedName )
            // InternalMyAtlProject.g:3267:2: ruleEssentialOCLUnrestrictedName
            {

            		newCompositeNode(grammarAccess.getNameExpCSAccess().getEssentialOCLUnrestrictedNameParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            ruleEssentialOCLUnrestrictedName();

            state._fsp--;


            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleNameExpCS"


    // $ANTLR start "entryRuleExpCS"
    // InternalMyAtlProject.g:3277:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // InternalMyAtlProject.g:3277:46: (iv_ruleExpCS= ruleExpCS EOF )
            // InternalMyAtlProject.g:3278:2: iv_ruleExpCS= ruleExpCS EOF
            {
             newCompositeNode(grammarAccess.getExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpCS=ruleExpCS();

            state._fsp--;

             current =iv_ruleExpCS; 
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
    // $ANTLR end "entryRuleExpCS"


    // $ANTLR start "ruleExpCS"
    // InternalMyAtlProject.g:3284:1: ruleExpCS returns [EObject current=null] : this_InfixedExpCS_0= ruleInfixedExpCS ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixedExpCS_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:3290:2: (this_InfixedExpCS_0= ruleInfixedExpCS )
            // InternalMyAtlProject.g:3291:2: this_InfixedExpCS_0= ruleInfixedExpCS
            {

            		newCompositeNode(grammarAccess.getExpCSAccess().getInfixedExpCSParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_InfixedExpCS_0=ruleInfixedExpCS();

            state._fsp--;


            		current = this_InfixedExpCS_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpCS"


    // $ANTLR start "entryRuleInfixedExpCS"
    // InternalMyAtlProject.g:3302:1: entryRuleInfixedExpCS returns [EObject current=null] : iv_ruleInfixedExpCS= ruleInfixedExpCS EOF ;
    public final EObject entryRuleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixedExpCS = null;


        try {
            // InternalMyAtlProject.g:3302:53: (iv_ruleInfixedExpCS= ruleInfixedExpCS EOF )
            // InternalMyAtlProject.g:3303:2: iv_ruleInfixedExpCS= ruleInfixedExpCS EOF
            {
             newCompositeNode(grammarAccess.getInfixedExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfixedExpCS=ruleInfixedExpCS();

            state._fsp--;

             current =iv_ruleInfixedExpCS; 
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
    // $ANTLR end "entryRuleInfixedExpCS"


    // $ANTLR start "ruleInfixedExpCS"
    // InternalMyAtlProject.g:3309:1: ruleInfixedExpCS returns [EObject current=null] : (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) ;
    public final EObject ruleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:3315:2: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) )
            // InternalMyAtlProject.g:3316:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            {
            // InternalMyAtlProject.g:3316:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            // InternalMyAtlProject.g:3317:3: this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getInfixedExpCSAccess().getPrefixedExpCSParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_PrefixedExpCS_0=rulePrefixedExpCS();

            state._fsp--;


            			current = this_PrefixedExpCS_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyAtlProject.g:3325:3: ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalMyAtlProject.g:3326:4: () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    {
                    // InternalMyAtlProject.g:3326:4: ()
                    // InternalMyAtlProject.g:3327:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMyAtlProject.g:3333:4: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        alt45 = dfa45.predict(input);
                        switch (alt45) {
                    	case 1 :
                    	    // InternalMyAtlProject.g:3334:5: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    {
                    	    // InternalMyAtlProject.g:3334:5: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) )
                    	    // InternalMyAtlProject.g:3335:6: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    {
                    	    // InternalMyAtlProject.g:3335:6: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    // InternalMyAtlProject.g:3336:7: lv_ownedOperator_2_0= ruleBinaryOperatorCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_ownedOperator_2_0=ruleBinaryOperatorCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInfixedExpCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedOperator",
                    	    								lv_ownedOperator_2_0,
                    	    								"org.xtext.example.mydsl.MyAtlProject.BinaryOperatorCS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalMyAtlProject.g:3353:5: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    // InternalMyAtlProject.g:3354:6: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    {
                    	    // InternalMyAtlProject.g:3354:6: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    // InternalMyAtlProject.g:3355:7: lv_ownedExpression_3_0= rulePrefixedExpCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    lv_ownedExpression_3_0=rulePrefixedExpCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInfixedExpCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedExpression",
                    	    								lv_ownedExpression_3_0,
                    	    								"org.xtext.example.mydsl.MyAtlProject.PrefixedExpCS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt45 >= 1 ) break loop45;
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
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
    // $ANTLR end "ruleInfixedExpCS"


    // $ANTLR start "entryRuleBinaryOperatorCS"
    // InternalMyAtlProject.g:3378:1: entryRuleBinaryOperatorCS returns [EObject current=null] : iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF ;
    public final EObject entryRuleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperatorCS = null;


        try {
            // InternalMyAtlProject.g:3378:57: (iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF )
            // InternalMyAtlProject.g:3379:2: iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperatorCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryOperatorCS=ruleBinaryOperatorCS();

            state._fsp--;

             current =iv_ruleBinaryOperatorCS; 
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
    // $ANTLR end "entryRuleBinaryOperatorCS"


    // $ANTLR start "ruleBinaryOperatorCS"
    // InternalMyAtlProject.g:3385:1: ruleBinaryOperatorCS returns [EObject current=null] : (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) ;
    public final EObject ruleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixOperatorCS_0 = null;

        EObject this_NavigationOperatorCS_1 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:3391:2: ( (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) )
            // InternalMyAtlProject.g:3392:2: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            {
            // InternalMyAtlProject.g:3392:2: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==32||LA47_0==37||(LA47_0>=39 && LA47_0<=50)) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=51 && LA47_0<=52)) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyAtlProject.g:3393:3: this_InfixOperatorCS_0= ruleInfixOperatorCS
                    {

                    			newCompositeNode(grammarAccess.getBinaryOperatorCSAccess().getInfixOperatorCSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InfixOperatorCS_0=ruleInfixOperatorCS();

                    state._fsp--;


                    			current = this_InfixOperatorCS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:3402:3: this_NavigationOperatorCS_1= ruleNavigationOperatorCS
                    {

                    			newCompositeNode(grammarAccess.getBinaryOperatorCSAccess().getNavigationOperatorCSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NavigationOperatorCS_1=ruleNavigationOperatorCS();

                    state._fsp--;


                    			current = this_NavigationOperatorCS_1;
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
    // $ANTLR end "ruleBinaryOperatorCS"


    // $ANTLR start "entryRuleInfixOperatorCS"
    // InternalMyAtlProject.g:3414:1: entryRuleInfixOperatorCS returns [EObject current=null] : iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF ;
    public final EObject entryRuleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOperatorCS = null;


        try {
            // InternalMyAtlProject.g:3414:56: (iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF )
            // InternalMyAtlProject.g:3415:2: iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF
            {
             newCompositeNode(grammarAccess.getInfixOperatorCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfixOperatorCS=ruleInfixOperatorCS();

            state._fsp--;

             current =iv_ruleInfixOperatorCS; 
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
    // $ANTLR end "entryRuleInfixOperatorCS"


    // $ANTLR start "ruleInfixOperatorCS"
    // InternalMyAtlProject.g:3421:1: ruleInfixOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleInfixOperator ) ) ;
    public final EObject ruleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:3427:2: ( ( (lv_name_0_0= ruleInfixOperator ) ) )
            // InternalMyAtlProject.g:3428:2: ( (lv_name_0_0= ruleInfixOperator ) )
            {
            // InternalMyAtlProject.g:3428:2: ( (lv_name_0_0= ruleInfixOperator ) )
            // InternalMyAtlProject.g:3429:3: (lv_name_0_0= ruleInfixOperator )
            {
            // InternalMyAtlProject.g:3429:3: (lv_name_0_0= ruleInfixOperator )
            // InternalMyAtlProject.g:3430:4: lv_name_0_0= ruleInfixOperator
            {

            				newCompositeNode(grammarAccess.getInfixOperatorCSAccess().getNameInfixOperatorParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleInfixOperator();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getInfixOperatorCSRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.mydsl.MyAtlProject.InfixOperator");
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
    // $ANTLR end "ruleInfixOperatorCS"


    // $ANTLR start "entryRuleNavigationOperatorCS"
    // InternalMyAtlProject.g:3450:1: entryRuleNavigationOperatorCS returns [EObject current=null] : iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF ;
    public final EObject entryRuleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationOperatorCS = null;


        try {
            // InternalMyAtlProject.g:3450:61: (iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF )
            // InternalMyAtlProject.g:3451:2: iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF
            {
             newCompositeNode(grammarAccess.getNavigationOperatorCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigationOperatorCS=ruleNavigationOperatorCS();

            state._fsp--;

             current =iv_ruleNavigationOperatorCS; 
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
    // $ANTLR end "entryRuleNavigationOperatorCS"


    // $ANTLR start "ruleNavigationOperatorCS"
    // InternalMyAtlProject.g:3457:1: ruleNavigationOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleNavigationOperator ) ) ;
    public final EObject ruleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:3463:2: ( ( (lv_name_0_0= ruleNavigationOperator ) ) )
            // InternalMyAtlProject.g:3464:2: ( (lv_name_0_0= ruleNavigationOperator ) )
            {
            // InternalMyAtlProject.g:3464:2: ( (lv_name_0_0= ruleNavigationOperator ) )
            // InternalMyAtlProject.g:3465:3: (lv_name_0_0= ruleNavigationOperator )
            {
            // InternalMyAtlProject.g:3465:3: (lv_name_0_0= ruleNavigationOperator )
            // InternalMyAtlProject.g:3466:4: lv_name_0_0= ruleNavigationOperator
            {

            				newCompositeNode(grammarAccess.getNavigationOperatorCSAccess().getNameNavigationOperatorParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleNavigationOperator();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNavigationOperatorCSRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.mydsl.MyAtlProject.NavigationOperator");
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
    // $ANTLR end "ruleNavigationOperatorCS"


    // $ANTLR start "entryRulePrefixedExpCS"
    // InternalMyAtlProject.g:3486:1: entryRulePrefixedExpCS returns [EObject current=null] : iv_rulePrefixedExpCS= rulePrefixedExpCS EOF ;
    public final EObject entryRulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedExpCS = null;


        try {
            // InternalMyAtlProject.g:3486:54: (iv_rulePrefixedExpCS= rulePrefixedExpCS EOF )
            // InternalMyAtlProject.g:3487:2: iv_rulePrefixedExpCS= rulePrefixedExpCS EOF
            {
             newCompositeNode(grammarAccess.getPrefixedExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrefixedExpCS=rulePrefixedExpCS();

            state._fsp--;

             current =iv_rulePrefixedExpCS; 
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
    // $ANTLR end "entryRulePrefixedExpCS"


    // $ANTLR start "rulePrefixedExpCS"
    // InternalMyAtlProject.g:3493:1: rulePrefixedExpCS returns [EObject current=null] : (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) ;
    public final EObject rulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:3499:2: ( (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) )
            // InternalMyAtlProject.g:3500:2: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            {
            // InternalMyAtlProject.g:3500:2: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_SINGLE_QUOTED_STRING && LA49_0<=RULE_BIG_INT)||LA49_0==28||LA49_0==39||(LA49_0>=53 && LA49_0<=66)||(LA49_0>=68 && LA49_0<=71)||LA49_0==73||LA49_0==77||LA49_0==79) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=37 && LA49_0<=38)) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyAtlProject.g:3501:3: this_PrimaryExpCS_0= rulePrimaryExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getPrimaryExpCSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpCS_0=rulePrimaryExpCS();

                    state._fsp--;


                    			current = this_PrimaryExpCS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:3510:3: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    {
                    // InternalMyAtlProject.g:3510:3: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    // InternalMyAtlProject.g:3511:4: () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    {
                    // InternalMyAtlProject.g:3511:4: ()
                    // InternalMyAtlProject.g:3512:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrefixedExpCSAccess().getPrefixExpCSAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMyAtlProject.g:3518:4: ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( ((LA48_0>=37 && LA48_0<=38)) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalMyAtlProject.g:3519:5: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    {
                    	    // InternalMyAtlProject.g:3519:5: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    // InternalMyAtlProject.g:3520:6: lv_ownedOperator_2_0= ruleUnaryOperatorCS
                    	    {

                    	    						newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_35);
                    	    lv_ownedOperator_2_0=ruleUnaryOperatorCS();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPrefixedExpCSRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ownedOperator",
                    	    							lv_ownedOperator_2_0,
                    	    							"org.xtext.example.mydsl.MyAtlProject.UnaryOperatorCS");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);

                    // InternalMyAtlProject.g:3537:4: ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    // InternalMyAtlProject.g:3538:5: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    {
                    // InternalMyAtlProject.g:3538:5: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    // InternalMyAtlProject.g:3539:6: lv_ownedExpression_3_0= rulePrimaryExpCS
                    {

                    						newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedExpressionPrimaryExpCSParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedExpression_3_0=rulePrimaryExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrefixedExpCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedExpression",
                    							lv_ownedExpression_3_0,
                    							"org.xtext.example.mydsl.MyAtlProject.PrimaryExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "rulePrefixedExpCS"


    // $ANTLR start "entryRuleUnaryOperatorCS"
    // InternalMyAtlProject.g:3561:1: entryRuleUnaryOperatorCS returns [EObject current=null] : iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF ;
    public final EObject entryRuleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperatorCS = null;


        try {
            // InternalMyAtlProject.g:3561:56: (iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF )
            // InternalMyAtlProject.g:3562:2: iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF
            {
             newCompositeNode(grammarAccess.getUnaryOperatorCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOperatorCS=ruleUnaryOperatorCS();

            state._fsp--;

             current =iv_ruleUnaryOperatorCS; 
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
    // $ANTLR end "entryRuleUnaryOperatorCS"


    // $ANTLR start "ruleUnaryOperatorCS"
    // InternalMyAtlProject.g:3568:1: ruleUnaryOperatorCS returns [EObject current=null] : ( (lv_name_0_0= rulePrefixOperator ) ) ;
    public final EObject ruleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:3574:2: ( ( (lv_name_0_0= rulePrefixOperator ) ) )
            // InternalMyAtlProject.g:3575:2: ( (lv_name_0_0= rulePrefixOperator ) )
            {
            // InternalMyAtlProject.g:3575:2: ( (lv_name_0_0= rulePrefixOperator ) )
            // InternalMyAtlProject.g:3576:3: (lv_name_0_0= rulePrefixOperator )
            {
            // InternalMyAtlProject.g:3576:3: (lv_name_0_0= rulePrefixOperator )
            // InternalMyAtlProject.g:3577:4: lv_name_0_0= rulePrefixOperator
            {

            				newCompositeNode(grammarAccess.getUnaryOperatorCSAccess().getNamePrefixOperatorParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=rulePrefixOperator();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getUnaryOperatorCSRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.mydsl.MyAtlProject.PrefixOperator");
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
    // $ANTLR end "ruleUnaryOperatorCS"


    // $ANTLR start "entryRuleIndexExpCS"
    // InternalMyAtlProject.g:3597:1: entryRuleIndexExpCS returns [EObject current=null] : iv_ruleIndexExpCS= ruleIndexExpCS EOF ;
    public final EObject entryRuleIndexExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexExpCS = null;


        try {
            // InternalMyAtlProject.g:3597:51: (iv_ruleIndexExpCS= ruleIndexExpCS EOF )
            // InternalMyAtlProject.g:3598:2: iv_ruleIndexExpCS= ruleIndexExpCS EOF
            {
             newCompositeNode(grammarAccess.getIndexExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexExpCS=ruleIndexExpCS();

            state._fsp--;

             current =iv_ruleIndexExpCS; 
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
    // $ANTLR end "entryRuleIndexExpCS"


    // $ANTLR start "ruleIndexExpCS"
    // InternalMyAtlProject.g:3604:1: ruleIndexExpCS returns [EObject current=null] : (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? ) ;
    public final EObject ruleIndexExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_NameExpCS_0 = null;

        EObject lv_firstIndexes_3_0 = null;

        EObject lv_firstIndexes_5_0 = null;

        EObject lv_secondIndexes_8_0 = null;

        EObject lv_secondIndexes_10_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:3610:2: ( (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? ) )
            // InternalMyAtlProject.g:3611:2: (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? )
            {
            // InternalMyAtlProject.g:3611:2: (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? )
            // InternalMyAtlProject.g:3612:3: this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )?
            {

            			newCompositeNode(grammarAccess.getIndexExpCSAccess().getNameExpCSParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_NameExpCS_0=ruleNameExpCS();

            state._fsp--;


            			current = this_NameExpCS_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyAtlProject.g:3620:3: ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==80) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyAtlProject.g:3621:4: () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )?
                    {
                    // InternalMyAtlProject.g:3621:4: ()
                    // InternalMyAtlProject.g:3622:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getIndexExpCSAccess().getIndexExpCSNamedExpAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,80,FOLLOW_35); 

                    				newLeafNode(otherlv_2, grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    // InternalMyAtlProject.g:3632:4: ( (lv_firstIndexes_3_0= ruleExpCS ) )
                    // InternalMyAtlProject.g:3633:5: (lv_firstIndexes_3_0= ruleExpCS )
                    {
                    // InternalMyAtlProject.g:3633:5: (lv_firstIndexes_3_0= ruleExpCS )
                    // InternalMyAtlProject.g:3634:6: lv_firstIndexes_3_0= ruleExpCS
                    {

                    						newCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_firstIndexes_3_0=ruleExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
                    						}
                    						add(
                    							current,
                    							"firstIndexes",
                    							lv_firstIndexes_3_0,
                    							"org.xtext.example.mydsl.MyAtlProject.ExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyAtlProject.g:3651:4: (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==33) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalMyAtlProject.g:3652:5: otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    {
                    	    otherlv_4=(Token)match(input,33,FOLLOW_35); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalMyAtlProject.g:3656:5: ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    // InternalMyAtlProject.g:3657:6: (lv_firstIndexes_5_0= ruleExpCS )
                    	    {
                    	    // InternalMyAtlProject.g:3657:6: (lv_firstIndexes_5_0= ruleExpCS )
                    	    // InternalMyAtlProject.g:3658:7: lv_firstIndexes_5_0= ruleExpCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    lv_firstIndexes_5_0=ruleExpCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"firstIndexes",
                    	    								lv_firstIndexes_5_0,
                    	    								"org.xtext.example.mydsl.MyAtlProject.ExpCS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,81,FOLLOW_45); 

                    				newLeafNode(otherlv_6, grammarAccess.getIndexExpCSAccess().getRightSquareBracketKeyword_1_4());
                    			
                    // InternalMyAtlProject.g:3680:4: (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==80) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalMyAtlProject.g:3681:5: otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']'
                            {
                            otherlv_7=(Token)match(input,80,FOLLOW_35); 

                            					newLeafNode(otherlv_7, grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_5_0());
                            				
                            // InternalMyAtlProject.g:3685:5: ( (lv_secondIndexes_8_0= ruleExpCS ) )
                            // InternalMyAtlProject.g:3686:6: (lv_secondIndexes_8_0= ruleExpCS )
                            {
                            // InternalMyAtlProject.g:3686:6: (lv_secondIndexes_8_0= ruleExpCS )
                            // InternalMyAtlProject.g:3687:7: lv_secondIndexes_8_0= ruleExpCS
                            {

                            							newCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_1_0());
                            						
                            pushFollow(FOLLOW_46);
                            lv_secondIndexes_8_0=ruleExpCS();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
                            							}
                            							add(
                            								current,
                            								"secondIndexes",
                            								lv_secondIndexes_8_0,
                            								"org.xtext.example.mydsl.MyAtlProject.ExpCS");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyAtlProject.g:3704:5: (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==33) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // InternalMyAtlProject.g:3705:6: otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    {
                            	    otherlv_9=(Token)match(input,33,FOLLOW_35); 

                            	    						newLeafNode(otherlv_9, grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_5_2_0());
                            	    					
                            	    // InternalMyAtlProject.g:3709:6: ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    // InternalMyAtlProject.g:3710:7: (lv_secondIndexes_10_0= ruleExpCS )
                            	    {
                            	    // InternalMyAtlProject.g:3710:7: (lv_secondIndexes_10_0= ruleExpCS )
                            	    // InternalMyAtlProject.g:3711:8: lv_secondIndexes_10_0= ruleExpCS
                            	    {

                            	    								newCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_46);
                            	    lv_secondIndexes_10_0=ruleExpCS();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"secondIndexes",
                            	    									lv_secondIndexes_10_0,
                            	    									"org.xtext.example.mydsl.MyAtlProject.ExpCS");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop51;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,81,FOLLOW_2); 

                            					newLeafNode(otherlv_11, grammarAccess.getIndexExpCSAccess().getRightSquareBracketKeyword_1_5_3());
                            				

                            }
                            break;

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
    // $ANTLR end "ruleIndexExpCS"


    // $ANTLR start "entryRuleNavigatingExpCS_Base"
    // InternalMyAtlProject.g:3739:1: entryRuleNavigatingExpCS_Base returns [EObject current=null] : iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF ;
    public final EObject entryRuleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS_Base = null;


        try {
            // InternalMyAtlProject.g:3739:61: (iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF )
            // InternalMyAtlProject.g:3740:2: iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF
            {
             newCompositeNode(grammarAccess.getNavigatingExpCS_BaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigatingExpCS_Base=ruleNavigatingExpCS_Base();

            state._fsp--;

             current =iv_ruleNavigatingExpCS_Base; 
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
    // $ANTLR end "entryRuleNavigatingExpCS_Base"


    // $ANTLR start "ruleNavigatingExpCS_Base"
    // InternalMyAtlProject.g:3746:1: ruleNavigatingExpCS_Base returns [EObject current=null] : this_IndexExpCS_0= ruleIndexExpCS ;
    public final EObject ruleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject this_IndexExpCS_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:3752:2: (this_IndexExpCS_0= ruleIndexExpCS )
            // InternalMyAtlProject.g:3753:2: this_IndexExpCS_0= ruleIndexExpCS
            {

            		newCompositeNode(grammarAccess.getNavigatingExpCS_BaseAccess().getIndexExpCSParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_IndexExpCS_0=ruleIndexExpCS();

            state._fsp--;


            		current = this_IndexExpCS_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleNavigatingExpCS_Base"


    // $ANTLR start "entryRuleNavigatingExpCS"
    // InternalMyAtlProject.g:3764:1: entryRuleNavigatingExpCS returns [EObject current=null] : iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF ;
    public final EObject entryRuleNavigatingExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS = null;


        try {
            // InternalMyAtlProject.g:3764:56: (iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF )
            // InternalMyAtlProject.g:3765:2: iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF
            {
             newCompositeNode(grammarAccess.getNavigatingExpCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigatingExpCS=ruleNavigatingExpCS();

            state._fsp--;

             current =iv_ruleNavigatingExpCS; 
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
    // $ANTLR end "entryRuleNavigatingExpCS"


    // $ANTLR start "ruleNavigatingExpCS"
    // InternalMyAtlProject.g:3771:1: ruleNavigatingExpCS returns [EObject current=null] : (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? ) ;
    public final EObject ruleNavigatingExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_9=null;
        EObject this_NavigatingExpCS_Base_0 = null;

        EObject lv_argument_3_0 = null;

        EObject lv_argument_4_0 = null;

        EObject lv_argument_5_0 = null;

        EObject lv_argument_6_0 = null;

        EObject lv_argument_7_0 = null;

        EObject lv_argument_8_0 = null;



        	enterRule();

        try {
            // InternalMyAtlProject.g:3777:2: ( (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? ) )
            // InternalMyAtlProject.g:3778:2: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? )
            {
            // InternalMyAtlProject.g:3778:2: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? )
            // InternalMyAtlProject.g:3779:3: this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )?
            {

            			newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCS_BaseParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_NavigatingExpCS_Base_0=ruleNavigatingExpCS_Base();

            state._fsp--;


            			current = this_NavigatingExpCS_Base_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyAtlProject.g:3787:3: ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==28) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyAtlProject.g:3788:4: () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')'
                    {
                    // InternalMyAtlProject.g:3788:4: ()
                    // InternalMyAtlProject.g:3789:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCSNamedExpAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,28,FOLLOW_47); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingExpCSAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalMyAtlProject.g:3799:4: ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( ((LA59_0>=RULE_SINGLE_QUOTED_STRING && LA59_0<=RULE_BIG_INT)||LA59_0==28||(LA59_0>=37 && LA59_0<=39)||(LA59_0>=53 && LA59_0<=66)||(LA59_0>=68 && LA59_0<=71)||LA59_0==73||LA59_0==77||LA59_0==79) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalMyAtlProject.g:3800:5: ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )?
                            {
                            // InternalMyAtlProject.g:3800:5: ( (lv_argument_3_0= ruleNavigatingArgCS ) )
                            // InternalMyAtlProject.g:3801:6: (lv_argument_3_0= ruleNavigatingArgCS )
                            {
                            // InternalMyAtlProject.g:3801:6: (lv_argument_3_0= ruleNavigatingArgCS )
                            // InternalMyAtlProject.g:3802:7: lv_argument_3_0= ruleNavigatingArgCS
                            {

                            							newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingArgCSParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_48);
                            lv_argument_3_0=ruleNavigatingArgCS();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                            							}
                            							add(
                            								current,
                            								"argument",
                            								lv_argument_3_0,
                            								"org.xtext.example.mydsl.MyAtlProject.NavigatingArgCS");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyAtlProject.g:3819:5: ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==33) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // InternalMyAtlProject.g:3820:6: (lv_argument_4_0= ruleNavigatingCommaArgCS )
                            	    {
                            	    // InternalMyAtlProject.g:3820:6: (lv_argument_4_0= ruleNavigatingCommaArgCS )
                            	    // InternalMyAtlProject.g:3821:7: lv_argument_4_0= ruleNavigatingCommaArgCS
                            	    {

                            	    							newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_48);
                            	    lv_argument_4_0=ruleNavigatingCommaArgCS();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"argument",
                            	    								lv_argument_4_0,
                            	    								"org.xtext.example.mydsl.MyAtlProject.NavigatingCommaArgCS");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop54;
                                }
                            } while (true);

                            // InternalMyAtlProject.g:3838:5: ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==15) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // InternalMyAtlProject.g:3839:6: ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )*
                                    {
                                    // InternalMyAtlProject.g:3839:6: ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) )
                                    // InternalMyAtlProject.g:3840:7: (lv_argument_5_0= ruleNavigatingSemiArgCS )
                                    {
                                    // InternalMyAtlProject.g:3840:7: (lv_argument_5_0= ruleNavigatingSemiArgCS )
                                    // InternalMyAtlProject.g:3841:8: lv_argument_5_0= ruleNavigatingSemiArgCS
                                    {

                                    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingSemiArgCSParserRuleCall_1_2_2_0_0());
                                    							
                                    pushFollow(FOLLOW_49);
                                    lv_argument_5_0=ruleNavigatingSemiArgCS();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    								}
                                    								add(
                                    									current,
                                    									"argument",
                                    									lv_argument_5_0,
                                    									"org.xtext.example.mydsl.MyAtlProject.NavigatingSemiArgCS");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    // InternalMyAtlProject.g:3858:6: ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )*
                                    loop55:
                                    do {
                                        int alt55=2;
                                        int LA55_0 = input.LA(1);

                                        if ( (LA55_0==33) ) {
                                            alt55=1;
                                        }


                                        switch (alt55) {
                                    	case 1 :
                                    	    // InternalMyAtlProject.g:3859:7: (lv_argument_6_0= ruleNavigatingCommaArgCS )
                                    	    {
                                    	    // InternalMyAtlProject.g:3859:7: (lv_argument_6_0= ruleNavigatingCommaArgCS )
                                    	    // InternalMyAtlProject.g:3860:8: lv_argument_6_0= ruleNavigatingCommaArgCS
                                    	    {

                                    	    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_2_1_0());
                                    	    							
                                    	    pushFollow(FOLLOW_49);
                                    	    lv_argument_6_0=ruleNavigatingCommaArgCS();

                                    	    state._fsp--;


                                    	    								if (current==null) {
                                    	    									current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    	    								}
                                    	    								add(
                                    	    									current,
                                    	    									"argument",
                                    	    									lv_argument_6_0,
                                    	    									"org.xtext.example.mydsl.MyAtlProject.NavigatingCommaArgCS");
                                    	    								afterParserOrEnumRuleCall();
                                    	    							

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop55;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            // InternalMyAtlProject.g:3878:5: ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )?
                            int alt58=2;
                            int LA58_0 = input.LA(1);

                            if ( (LA58_0==72) ) {
                                alt58=1;
                            }
                            switch (alt58) {
                                case 1 :
                                    // InternalMyAtlProject.g:3879:6: ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )*
                                    {
                                    // InternalMyAtlProject.g:3879:6: ( (lv_argument_7_0= ruleNavigatingBarArgCS ) )
                                    // InternalMyAtlProject.g:3880:7: (lv_argument_7_0= ruleNavigatingBarArgCS )
                                    {
                                    // InternalMyAtlProject.g:3880:7: (lv_argument_7_0= ruleNavigatingBarArgCS )
                                    // InternalMyAtlProject.g:3881:8: lv_argument_7_0= ruleNavigatingBarArgCS
                                    {

                                    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingBarArgCSParserRuleCall_1_2_3_0_0());
                                    							
                                    pushFollow(FOLLOW_26);
                                    lv_argument_7_0=ruleNavigatingBarArgCS();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    								}
                                    								add(
                                    									current,
                                    									"argument",
                                    									lv_argument_7_0,
                                    									"org.xtext.example.mydsl.MyAtlProject.NavigatingBarArgCS");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    // InternalMyAtlProject.g:3898:6: ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )*
                                    loop57:
                                    do {
                                        int alt57=2;
                                        int LA57_0 = input.LA(1);

                                        if ( (LA57_0==33) ) {
                                            alt57=1;
                                        }


                                        switch (alt57) {
                                    	case 1 :
                                    	    // InternalMyAtlProject.g:3899:7: (lv_argument_8_0= ruleNavigatingCommaArgCS )
                                    	    {
                                    	    // InternalMyAtlProject.g:3899:7: (lv_argument_8_0= ruleNavigatingCommaArgCS )
                                    	    // InternalMyAtlProject.g:3900:8: lv_argument_8_0= ruleNavigatingCommaArgCS
                                    	    {

                                    	    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_3_1_0());
                                    	    							
                                    	    pushFollow(FOLLOW_26);
                                    	    lv_argument_8_0=ruleNavigatingCommaArgCS();

                                    	    state._fsp--;


                                    	    								if (current==null) {
                                    	    									current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    	    								}
                                    	    								add(
                                    	    									current,
                                    	    									"argument",
                                    	    									lv_argument_8_0,
                                    	    									"org.xtext.example.mydsl.MyAtlProject.NavigatingCommaArgCS");
                                    	    								afterParserOrEnumRuleCall();
                                    	    							

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop57;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getNavigatingExpCSAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleNavigatingExpCS"

    // Delegated rules


    protected DFA46 dfa46 = new DFA46(this);
    protected DFA45 dfa45 = new DFA45(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\21\21\uffff";
    static final String dfa_3s = "\1\17\21\uffff";
    static final String dfa_4s = "\1\121\21\uffff";
    static final String dfa_5s = "\1\uffff\20\1\1\2";
    static final String dfa_6s = "\22\uffff}>";
    static final String[] dfa_7s = {
            "\1\21\2\uffff\1\21\5\uffff\1\21\4\uffff\1\21\2\uffff\1\11\1\21\3\uffff\1\4\1\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\12\1\13\1\14\1\15\1\16\1\17\1\20\16\uffff\1\21\4\uffff\1\21\1\uffff\3\21\1\uffff\1\21\2\uffff\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3325:3: ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?";
        }
    }
    static final String dfa_8s = "\1\1\21\uffff";
    static final String dfa_9s = "\1\uffff\1\2\20\1";
    static final String[] dfa_10s = {
            "\1\1\2\uffff\1\1\5\uffff\1\1\4\uffff\1\1\2\uffff\1\2\1\1\3\uffff\1\6\1\uffff\1\3\1\4\1\5\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\16\uffff\1\1\4\uffff\1\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_9;
            this.special = dfa_6;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "()+ loopback of 3333:4: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000048200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080010000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x3FC0000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0xFFE000E011000070L,0x000000000000A2F7L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0xFFE000E010000070L,0x000000000000A2F7L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000100040002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000200000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x001FFFA100000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000200000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0xFFE000E030000070L,0x000000000000A2F7L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000220008000L,0x0000000000000100L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000220000000L,0x0000000000000100L});

}