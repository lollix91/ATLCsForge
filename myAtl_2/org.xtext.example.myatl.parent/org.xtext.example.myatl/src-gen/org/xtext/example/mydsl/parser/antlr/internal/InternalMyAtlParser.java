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
import org.xtext.example.mydsl.services.MyAtlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyAtlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SIMPLE_ID", "RULE_SINGLE_QUOTED_STRING", "RULE_BIG_INT", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_DOCUMENTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "RULE_ID", "RULE_INT", "RULE_STRING", "'module'", "';'", "'create'", "'OUT'", "':'", "','", "'from'", "'in'", "'IN'", "'uses'", "'Tuple'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'rule'", "'{'", "'using'", "'}'", "'to'", "'...'", "'do'", "'entrypoint'", "'endpoint'", "'('", "')'", "'query'", "'='", "'helper'", "'context'", "'def'", "'xxx'", "'yyy'", "'<-'", "'.'", "'!'", "'-'", "'not'", "'*'", "'/'", "'+'", "'>'", "'<'", "'>='", "'<='", "'<>'", "'and'", "'or'", "'xor'", "'implies'", "'->'", "'true'", "'..'", "'false'", "'invalid'", "'null'", "'::'", "'|'", "'if'", "'then'", "'else'", "'endif'", "'let'", "'self'", "'['", "']'"
    };
    public static final int T__50=50;
    public static final int RULE_BIG_INT=6;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=14;
    public static final int RULE_INT=15;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_SINGLE_QUOTED_STRING=5;
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
    public static final int T__91=91;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=8;
    public static final int RULE_DOCUMENTATION=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=16;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int RULE_SIMPLE_ID=4;
    public static final int T__83=83;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalMyAtlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyAtlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyAtlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyAtl.g"; }



     	private MyAtlGrammarAccess grammarAccess;

        public InternalMyAtlParser(TokenStream input, MyAtlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Module";
       	}

       	@Override
       	protected MyAtlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModule"
    // InternalMyAtl.g:64:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalMyAtl.g:64:47: (iv_ruleModule= ruleModule EOF )
            // InternalMyAtl.g:65:2: iv_ruleModule= ruleModule EOF
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
    // InternalMyAtl.g:71:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' ( ( (lv_inModels_10_0= ruleNameExpCS ) ) (otherlv_11= ',' | otherlv_12= ':' ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* )* (otherlv_15= 'in' | otherlv_16= 'IN' )? otherlv_17= ':' ( (lv_inModels_18_0= ruleNameExpCS ) ) (otherlv_19= ',' ( (lv_inModels_20_0= ruleNameExpCS ) ) )* otherlv_21= ';' (otherlv_22= 'uses' ( (lv_varName_23_0= ruleNameExpCS ) ) otherlv_24= ';' )? ( (lv_elements_25_0= ruleModuleElement ) )* ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_outModels_6_0 = null;

        EObject lv_outModels_8_0 = null;

        EObject lv_inModels_10_0 = null;

        EObject lv_inModels_14_0 = null;

        EObject lv_inModels_18_0 = null;

        EObject lv_inModels_20_0 = null;

        EObject lv_varName_23_0 = null;

        EObject lv_elements_25_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:77:2: ( (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' ( ( (lv_inModels_10_0= ruleNameExpCS ) ) (otherlv_11= ',' | otherlv_12= ':' ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* )* (otherlv_15= 'in' | otherlv_16= 'IN' )? otherlv_17= ':' ( (lv_inModels_18_0= ruleNameExpCS ) ) (otherlv_19= ',' ( (lv_inModels_20_0= ruleNameExpCS ) ) )* otherlv_21= ';' (otherlv_22= 'uses' ( (lv_varName_23_0= ruleNameExpCS ) ) otherlv_24= ';' )? ( (lv_elements_25_0= ruleModuleElement ) )* ) )
            // InternalMyAtl.g:78:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' ( ( (lv_inModels_10_0= ruleNameExpCS ) ) (otherlv_11= ',' | otherlv_12= ':' ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* )* (otherlv_15= 'in' | otherlv_16= 'IN' )? otherlv_17= ':' ( (lv_inModels_18_0= ruleNameExpCS ) ) (otherlv_19= ',' ( (lv_inModels_20_0= ruleNameExpCS ) ) )* otherlv_21= ';' (otherlv_22= 'uses' ( (lv_varName_23_0= ruleNameExpCS ) ) otherlv_24= ';' )? ( (lv_elements_25_0= ruleModuleElement ) )* )
            {
            // InternalMyAtl.g:78:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' ( ( (lv_inModels_10_0= ruleNameExpCS ) ) (otherlv_11= ',' | otherlv_12= ':' ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* )* (otherlv_15= 'in' | otherlv_16= 'IN' )? otherlv_17= ':' ( (lv_inModels_18_0= ruleNameExpCS ) ) (otherlv_19= ',' ( (lv_inModels_20_0= ruleNameExpCS ) ) )* otherlv_21= ';' (otherlv_22= 'uses' ( (lv_varName_23_0= ruleNameExpCS ) ) otherlv_24= ';' )? ( (lv_elements_25_0= ruleModuleElement ) )* )
            // InternalMyAtl.g:79:3: otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' ( ( (lv_inModels_10_0= ruleNameExpCS ) ) (otherlv_11= ',' | otherlv_12= ':' ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* )* (otherlv_15= 'in' | otherlv_16= 'IN' )? otherlv_17= ':' ( (lv_inModels_18_0= ruleNameExpCS ) ) (otherlv_19= ',' ( (lv_inModels_20_0= ruleNameExpCS ) ) )* otherlv_21= ';' (otherlv_22= 'uses' ( (lv_varName_23_0= ruleNameExpCS ) ) otherlv_24= ';' )? ( (lv_elements_25_0= ruleModuleElement ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
            		
            // InternalMyAtl.g:83:3: ( (lv_name_1_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:84:4: (lv_name_1_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:84:4: (lv_name_1_0= ruleUnrestrictedName )
            // InternalMyAtl.g:85:5: lv_name_1_0= ruleUnrestrictedName
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
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getSemicolonKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getCreateKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getOUTKeyword_4());
            		
            otherlv_5=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getModuleAccess().getColonKeyword_5());
            		
            // InternalMyAtl.g:118:3: ( (lv_outModels_6_0= ruleNameExpCS ) )
            // InternalMyAtl.g:119:4: (lv_outModels_6_0= ruleNameExpCS )
            {
            // InternalMyAtl.g:119:4: (lv_outModels_6_0= ruleNameExpCS )
            // InternalMyAtl.g:120:5: lv_outModels_6_0= ruleNameExpCS
            {

            					newCompositeNode(grammarAccess.getModuleAccess().getOutModelsNameExpCSParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_outModels_6_0=ruleNameExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuleRule());
            					}
            					add(
            						current,
            						"outModels",
            						lv_outModels_6_0,
            						"org.xtext.example.mydsl.MyAtl.NameExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:137:3: (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyAtl.g:138:4: otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getModuleAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyAtl.g:142:4: ( (lv_outModels_8_0= ruleNameExpCS ) )
            	    // InternalMyAtl.g:143:5: (lv_outModels_8_0= ruleNameExpCS )
            	    {
            	    // InternalMyAtl.g:143:5: (lv_outModels_8_0= ruleNameExpCS )
            	    // InternalMyAtl.g:144:6: lv_outModels_8_0= ruleNameExpCS
            	    {

            	    						newCompositeNode(grammarAccess.getModuleAccess().getOutModelsNameExpCSParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_outModels_8_0=ruleNameExpCS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"outModels",
            	    							lv_outModels_8_0,
            	    							"org.xtext.example.mydsl.MyAtl.NameExpCS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getModuleAccess().getFromKeyword_8());
            		
            // InternalMyAtl.g:166:3: ( ( (lv_inModels_10_0= ruleNameExpCS ) ) (otherlv_11= ',' | otherlv_12= ':' ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_SIMPLE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyAtl.g:167:4: ( (lv_inModels_10_0= ruleNameExpCS ) ) (otherlv_11= ',' | otherlv_12= ':' ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )*
            	    {
            	    // InternalMyAtl.g:167:4: ( (lv_inModels_10_0= ruleNameExpCS ) )
            	    // InternalMyAtl.g:168:5: (lv_inModels_10_0= ruleNameExpCS )
            	    {
            	    // InternalMyAtl.g:168:5: (lv_inModels_10_0= ruleNameExpCS )
            	    // InternalMyAtl.g:169:6: lv_inModels_10_0= ruleNameExpCS
            	    {

            	    						newCompositeNode(grammarAccess.getModuleAccess().getInModelsNameExpCSParserRuleCall_9_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_inModels_10_0=ruleNameExpCS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inModels",
            	    							lv_inModels_10_0,
            	    							"org.xtext.example.mydsl.MyAtl.NameExpCS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyAtl.g:186:4: (otherlv_11= ',' | otherlv_12= ':' )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==22) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==21) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalMyAtl.g:187:5: otherlv_11= ','
            	            {
            	            otherlv_11=(Token)match(input,22,FOLLOW_11); 

            	            					newLeafNode(otherlv_11, grammarAccess.getModuleAccess().getCommaKeyword_9_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyAtl.g:192:5: otherlv_12= ':'
            	            {
            	            otherlv_12=(Token)match(input,21,FOLLOW_11); 

            	            					newLeafNode(otherlv_12, grammarAccess.getModuleAccess().getColonKeyword_9_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalMyAtl.g:197:4: (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==22) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalMyAtl.g:198:5: otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,22,FOLLOW_3); 

            	    	    					newLeafNode(otherlv_13, grammarAccess.getModuleAccess().getCommaKeyword_9_2_0());
            	    	    				
            	    	    // InternalMyAtl.g:202:5: ( (lv_inModels_14_0= ruleNameExpCS ) )
            	    	    // InternalMyAtl.g:203:6: (lv_inModels_14_0= ruleNameExpCS )
            	    	    {
            	    	    // InternalMyAtl.g:203:6: (lv_inModels_14_0= ruleNameExpCS )
            	    	    // InternalMyAtl.g:204:7: lv_inModels_14_0= ruleNameExpCS
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getModuleAccess().getInModelsNameExpCSParserRuleCall_9_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_inModels_14_0=ruleNameExpCS();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"inModels",
            	    	    								lv_inModels_14_0,
            	    	    								"org.xtext.example.mydsl.MyAtl.NameExpCS");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalMyAtl.g:223:3: (otherlv_15= 'in' | otherlv_16= 'IN' )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyAtl.g:224:4: otherlv_15= 'in'
                    {
                    otherlv_15=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getModuleAccess().getInKeyword_10_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:229:4: otherlv_16= 'IN'
                    {
                    otherlv_16=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getModuleAccess().getINKeyword_10_1());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getModuleAccess().getColonKeyword_11());
            		
            // InternalMyAtl.g:238:3: ( (lv_inModels_18_0= ruleNameExpCS ) )
            // InternalMyAtl.g:239:4: (lv_inModels_18_0= ruleNameExpCS )
            {
            // InternalMyAtl.g:239:4: (lv_inModels_18_0= ruleNameExpCS )
            // InternalMyAtl.g:240:5: lv_inModels_18_0= ruleNameExpCS
            {

            					newCompositeNode(grammarAccess.getModuleAccess().getInModelsNameExpCSParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_12);
            lv_inModels_18_0=ruleNameExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuleRule());
            					}
            					add(
            						current,
            						"inModels",
            						lv_inModels_18_0,
            						"org.xtext.example.mydsl.MyAtl.NameExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:257:3: (otherlv_19= ',' ( (lv_inModels_20_0= ruleNameExpCS ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyAtl.g:258:4: otherlv_19= ',' ( (lv_inModels_20_0= ruleNameExpCS ) )
            	    {
            	    otherlv_19=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_19, grammarAccess.getModuleAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalMyAtl.g:262:4: ( (lv_inModels_20_0= ruleNameExpCS ) )
            	    // InternalMyAtl.g:263:5: (lv_inModels_20_0= ruleNameExpCS )
            	    {
            	    // InternalMyAtl.g:263:5: (lv_inModels_20_0= ruleNameExpCS )
            	    // InternalMyAtl.g:264:6: lv_inModels_20_0= ruleNameExpCS
            	    {

            	    						newCompositeNode(grammarAccess.getModuleAccess().getInModelsNameExpCSParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_inModels_20_0=ruleNameExpCS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inModels",
            	    							lv_inModels_20_0,
            	    							"org.xtext.example.mydsl.MyAtl.NameExpCS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_21=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_21, grammarAccess.getModuleAccess().getSemicolonKeyword_14());
            		
            // InternalMyAtl.g:286:3: (otherlv_22= 'uses' ( (lv_varName_23_0= ruleNameExpCS ) ) otherlv_24= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyAtl.g:287:4: otherlv_22= 'uses' ( (lv_varName_23_0= ruleNameExpCS ) ) otherlv_24= ';'
                    {
                    otherlv_22=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getModuleAccess().getUsesKeyword_15_0());
                    			
                    // InternalMyAtl.g:291:4: ( (lv_varName_23_0= ruleNameExpCS ) )
                    // InternalMyAtl.g:292:5: (lv_varName_23_0= ruleNameExpCS )
                    {
                    // InternalMyAtl.g:292:5: (lv_varName_23_0= ruleNameExpCS )
                    // InternalMyAtl.g:293:6: lv_varName_23_0= ruleNameExpCS
                    {

                    						newCompositeNode(grammarAccess.getModuleAccess().getVarNameNameExpCSParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_varName_23_0=ruleNameExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModuleRule());
                    						}
                    						set(
                    							current,
                    							"varName",
                    							lv_varName_23_0,
                    							"org.xtext.example.mydsl.MyAtl.NameExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_24=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_24, grammarAccess.getModuleAccess().getSemicolonKeyword_15_2());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:315:3: ( (lv_elements_25_0= ruleModuleElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==41||(LA8_0>=48 && LA8_0<=49)||LA8_0==52||LA8_0==54) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyAtl.g:316:4: (lv_elements_25_0= ruleModuleElement )
            	    {
            	    // InternalMyAtl.g:316:4: (lv_elements_25_0= ruleModuleElement )
            	    // InternalMyAtl.g:317:5: lv_elements_25_0= ruleModuleElement
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getElementsModuleElementParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_elements_25_0=ruleModuleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_25_0,
            	    						"org.xtext.example.mydsl.MyAtl.ModuleElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "entryRuleEssentialOCLUnreservedName"
    // InternalMyAtl.g:338:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // InternalMyAtl.g:338:66: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // InternalMyAtl.g:339:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
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
    // InternalMyAtl.g:345:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:351:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) )
            // InternalMyAtl.g:352:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            {
            // InternalMyAtl.g:352:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
                {
                alt9=1;
                }
                break;
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt9=2;
                }
                break;
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt9=3;
                }
                break;
            case 27:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyAtl.g:353:3: this_UnrestrictedName_0= ruleUnrestrictedName
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
                    // InternalMyAtl.g:364:3: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
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
                    // InternalMyAtl.g:375:3: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
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
                    // InternalMyAtl.g:386:3: kw= 'Tuple'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

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


    // $ANTLR start "entryRuleUnreservedName"
    // InternalMyAtl.g:395:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // InternalMyAtl.g:395:54: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // InternalMyAtl.g:396:2: iv_ruleUnreservedName= ruleUnreservedName EOF
            {
             newCompositeNode(grammarAccess.getUnreservedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnreservedName=ruleUnreservedName();

            state._fsp--;

             current =iv_ruleUnreservedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnreservedName"


    // $ANTLR start "ruleUnreservedName"
    // InternalMyAtl.g:402:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:408:2: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // InternalMyAtl.g:409:2: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
            {

            		newCompositeNode(grammarAccess.getUnreservedNameAccess().getEssentialOCLUnreservedNameParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_EssentialOCLUnreservedName_0=ruleEssentialOCLUnreservedName();

            state._fsp--;


            		current.merge(this_EssentialOCLUnreservedName_0);
            	

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
    // $ANTLR end "ruleUnreservedName"


    // $ANTLR start "entryRulePrimitiveTypeIdentifier"
    // InternalMyAtl.g:422:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // InternalMyAtl.g:422:63: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // InternalMyAtl.g:423:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
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
    // InternalMyAtl.g:429:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtl.g:435:2: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // InternalMyAtl.g:436:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // InternalMyAtl.g:436:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 29:
                {
                alt10=2;
                }
                break;
            case 30:
                {
                alt10=3;
                }
                break;
            case 31:
                {
                alt10=4;
                }
                break;
            case 32:
                {
                alt10=5;
                }
                break;
            case 33:
                {
                alt10=6;
                }
                break;
            case 34:
                {
                alt10=7;
                }
                break;
            case 35:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyAtl.g:437:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:443:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyAtl.g:449:3: kw= 'Real'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyAtl.g:455:3: kw= 'String'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyAtl.g:461:3: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyAtl.g:467:3: kw= 'OclAny'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyAtl.g:473:3: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyAtl.g:479:3: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCollectionTypeIdentifier"
    // InternalMyAtl.g:488:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // InternalMyAtl.g:488:64: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // InternalMyAtl.g:489:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
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
    // InternalMyAtl.g:495:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtl.g:501:2: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // InternalMyAtl.g:502:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // InternalMyAtl.g:502:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt11=1;
                }
                break;
            case 37:
                {
                alt11=2;
                }
                break;
            case 38:
                {
                alt11=3;
                }
                break;
            case 39:
                {
                alt11=4;
                }
                break;
            case 40:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyAtl.g:503:3: kw= 'Set'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:509:3: kw= 'Bag'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyAtl.g:515:3: kw= 'Sequence'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyAtl.g:521:3: kw= 'Collection'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyAtl.g:527:3: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

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


    // $ANTLR start "entryRuleUnrestrictedName"
    // InternalMyAtl.g:536:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // InternalMyAtl.g:536:56: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // InternalMyAtl.g:537:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
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
    // InternalMyAtl.g:543:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:549:2: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // InternalMyAtl.g:550:2: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
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


    // $ANTLR start "entryRuleEssentialOCLUnrestrictedName"
    // InternalMyAtl.g:563:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // InternalMyAtl.g:563:68: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // InternalMyAtl.g:564:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
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
    // InternalMyAtl.g:570:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SIMPLE_ID_0= RULE_SIMPLE_ID ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;


        	enterRule();

        try {
            // InternalMyAtl.g:576:2: (this_SIMPLE_ID_0= RULE_SIMPLE_ID )
            // InternalMyAtl.g:577:2: this_SIMPLE_ID_0= RULE_SIMPLE_ID
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


    // $ANTLR start "entryRuleModuleElement"
    // InternalMyAtl.g:587:1: entryRuleModuleElement returns [EObject current=null] : iv_ruleModuleElement= ruleModuleElement EOF ;
    public final EObject entryRuleModuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleElement = null;


        try {
            // InternalMyAtl.g:587:54: (iv_ruleModuleElement= ruleModuleElement EOF )
            // InternalMyAtl.g:588:2: iv_ruleModuleElement= ruleModuleElement EOF
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
    // InternalMyAtl.g:594:1: ruleModuleElement returns [EObject current=null] : (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule | this_QueryRule_3= ruleQueryRule ) ;
    public final EObject ruleModuleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Helper_0 = null;

        EObject this_MatchedRule_1 = null;

        EObject this_CalledRule_2 = null;

        EObject this_QueryRule_3 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:600:2: ( (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule | this_QueryRule_3= ruleQueryRule ) )
            // InternalMyAtl.g:601:2: (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule | this_QueryRule_3= ruleQueryRule )
            {
            // InternalMyAtl.g:601:2: (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule | this_QueryRule_3= ruleQueryRule )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt12=1;
                }
                break;
            case 41:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==RULE_SIMPLE_ID) ) {
                    int LA12_5 = input.LA(3);

                    if ( (LA12_5==42) ) {
                        int LA12_6 = input.LA(4);

                        if ( (LA12_6==23) ) {
                            alt12=2;
                        }
                        else if ( (LA12_6==43||LA12_6==45) ) {
                            alt12=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 6, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA12_5==50) ) {
                        alt12=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case 48:
            case 49:
                {
                alt12=3;
                }
                break;
            case 52:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyAtl.g:602:3: this_Helper_0= ruleHelper
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
                    // InternalMyAtl.g:611:3: this_MatchedRule_1= ruleMatchedRule
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
                    // InternalMyAtl.g:620:3: this_CalledRule_2= ruleCalledRule
                    {

                    			newCompositeNode(grammarAccess.getModuleElementAccess().getCalledRuleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CalledRule_2=ruleCalledRule();

                    state._fsp--;


                    			current = this_CalledRule_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyAtl.g:629:3: this_QueryRule_3= ruleQueryRule
                    {

                    			newCompositeNode(grammarAccess.getModuleElementAccess().getQueryRuleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_QueryRule_3=ruleQueryRule();

                    state._fsp--;


                    			current = this_QueryRule_3;
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
    // InternalMyAtl.g:641:1: entryRuleMatchedRule returns [EObject current=null] : iv_ruleMatchedRule= ruleMatchedRule EOF ;
    public final EObject entryRuleMatchedRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchedRule = null;


        try {
            // InternalMyAtl.g:641:52: (iv_ruleMatchedRule= ruleMatchedRule EOF )
            // InternalMyAtl.g:642:2: iv_ruleMatchedRule= ruleMatchedRule EOF
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
    // InternalMyAtl.g:648:1: ruleMatchedRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= '...' )? (otherlv_12= ',' )? (otherlv_13= 'do' otherlv_14= '{' ( (lv_actionBlock_15_0= ruleActionBlock ) ) otherlv_16= '}' )? (otherlv_17= ',' )? otherlv_18= '}' ) ;
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
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_inPattern_4_0 = null;

        EObject lv_variables_7_0 = null;

        EObject lv_outPattern_10_0 = null;

        EObject lv_actionBlock_15_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:654:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= '...' )? (otherlv_12= ',' )? (otherlv_13= 'do' otherlv_14= '{' ( (lv_actionBlock_15_0= ruleActionBlock ) ) otherlv_16= '}' )? (otherlv_17= ',' )? otherlv_18= '}' ) )
            // InternalMyAtl.g:655:2: (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= '...' )? (otherlv_12= ',' )? (otherlv_13= 'do' otherlv_14= '{' ( (lv_actionBlock_15_0= ruleActionBlock ) ) otherlv_16= '}' )? (otherlv_17= ',' )? otherlv_18= '}' )
            {
            // InternalMyAtl.g:655:2: (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= '...' )? (otherlv_12= ',' )? (otherlv_13= 'do' otherlv_14= '{' ( (lv_actionBlock_15_0= ruleActionBlock ) ) otherlv_16= '}' )? (otherlv_17= ',' )? otherlv_18= '}' )
            // InternalMyAtl.g:656:3: otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= '...' )? (otherlv_12= ',' )? (otherlv_13= 'do' otherlv_14= '{' ( (lv_actionBlock_15_0= ruleActionBlock ) ) otherlv_16= '}' )? (otherlv_17= ',' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchedRuleAccess().getRuleKeyword_0());
            		
            // InternalMyAtl.g:660:3: ( (lv_name_1_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:661:4: (lv_name_1_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:661:4: (lv_name_1_0= ruleUnrestrictedName )
            // InternalMyAtl.g:662:5: lv_name_1_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getMatchedRuleAccess().getNameUnrestrictedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatchedRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMatchedRuleAccess().getFromKeyword_3());
            		
            // InternalMyAtl.g:687:3: ( (lv_inPattern_4_0= ruleInPattern ) )
            // InternalMyAtl.g:688:4: (lv_inPattern_4_0= ruleInPattern )
            {
            // InternalMyAtl.g:688:4: (lv_inPattern_4_0= ruleInPattern )
            // InternalMyAtl.g:689:5: lv_inPattern_4_0= ruleInPattern
            {

            					newCompositeNode(grammarAccess.getMatchedRuleAccess().getInPatternInPatternParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_inPattern_4_0=ruleInPattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatchedRuleRule());
            					}
            					set(
            						current,
            						"inPattern",
            						lv_inPattern_4_0,
            						"org.xtext.example.mydsl.MyAtl.InPattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:706:3: (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyAtl.g:707:4: otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getMatchedRuleAccess().getUsingKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,42,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyAtl.g:715:4: ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_SIMPLE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyAtl.g:716:5: (lv_variables_7_0= ruleRuleVariableDeclaration )
                    	    {
                    	    // InternalMyAtl.g:716:5: (lv_variables_7_0= ruleRuleVariableDeclaration )
                    	    // InternalMyAtl.g:717:6: lv_variables_7_0= ruleRuleVariableDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getMatchedRuleAccess().getVariablesRuleVariableDeclarationParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_variables_7_0=ruleRuleVariableDeclaration();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMatchedRuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_7_0,
                    	    							"org.xtext.example.mydsl.MyAtl.RuleVariableDeclaration");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,44,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getMatchedRuleAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,45,FOLLOW_20); 

            			newLeafNode(otherlv_9, grammarAccess.getMatchedRuleAccess().getToKeyword_6());
            		
            // InternalMyAtl.g:743:3: ( (lv_outPattern_10_0= ruleOutPattern ) )
            // InternalMyAtl.g:744:4: (lv_outPattern_10_0= ruleOutPattern )
            {
            // InternalMyAtl.g:744:4: (lv_outPattern_10_0= ruleOutPattern )
            // InternalMyAtl.g:745:5: lv_outPattern_10_0= ruleOutPattern
            {

            					newCompositeNode(grammarAccess.getMatchedRuleAccess().getOutPatternOutPatternParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_21);
            lv_outPattern_10_0=ruleOutPattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatchedRuleRule());
            					}
            					set(
            						current,
            						"outPattern",
            						lv_outPattern_10_0,
            						"org.xtext.example.mydsl.MyAtl.OutPattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:762:3: (otherlv_11= '...' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==46) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyAtl.g:763:4: otherlv_11= '...'
                    {
                    otherlv_11=(Token)match(input,46,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getMatchedRuleAccess().getFullStopFullStopFullStopKeyword_8());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:768:3: (otherlv_12= ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyAtl.g:769:4: otherlv_12= ','
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_22); 

                    				newLeafNode(otherlv_12, grammarAccess.getMatchedRuleAccess().getCommaKeyword_9());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:774:3: (otherlv_13= 'do' otherlv_14= '{' ( (lv_actionBlock_15_0= ruleActionBlock ) ) otherlv_16= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyAtl.g:775:4: otherlv_13= 'do' otherlv_14= '{' ( (lv_actionBlock_15_0= ruleActionBlock ) ) otherlv_16= '}'
                    {
                    otherlv_13=(Token)match(input,47,FOLLOW_15); 

                    				newLeafNode(otherlv_13, grammarAccess.getMatchedRuleAccess().getDoKeyword_10_0());
                    			
                    otherlv_14=(Token)match(input,42,FOLLOW_23); 

                    				newLeafNode(otherlv_14, grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalMyAtl.g:783:4: ( (lv_actionBlock_15_0= ruleActionBlock ) )
                    // InternalMyAtl.g:784:5: (lv_actionBlock_15_0= ruleActionBlock )
                    {
                    // InternalMyAtl.g:784:5: (lv_actionBlock_15_0= ruleActionBlock )
                    // InternalMyAtl.g:785:6: lv_actionBlock_15_0= ruleActionBlock
                    {

                    						newCompositeNode(grammarAccess.getMatchedRuleAccess().getActionBlockActionBlockParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_actionBlock_15_0=ruleActionBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMatchedRuleRule());
                    						}
                    						set(
                    							current,
                    							"actionBlock",
                    							lv_actionBlock_15_0,
                    							"org.xtext.example.mydsl.MyAtl.ActionBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,44,FOLLOW_25); 

                    				newLeafNode(otherlv_16, grammarAccess.getMatchedRuleAccess().getRightCurlyBracketKeyword_10_3());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:807:3: (otherlv_17= ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyAtl.g:808:4: otherlv_17= ','
                    {
                    otherlv_17=(Token)match(input,22,FOLLOW_24); 

                    				newLeafNode(otherlv_17, grammarAccess.getMatchedRuleAccess().getCommaKeyword_11());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,44,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getMatchedRuleAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

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
    // InternalMyAtl.g:821:1: entryRuleCalledRule returns [EObject current=null] : iv_ruleCalledRule= ruleCalledRule EOF ;
    public final EObject entryRuleCalledRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalledRule = null;


        try {
            // InternalMyAtl.g:821:51: (iv_ruleCalledRule= ruleCalledRule EOF )
            // InternalMyAtl.g:822:2: iv_ruleCalledRule= ruleCalledRule EOF
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
    // InternalMyAtl.g:828:1: ruleCalledRule returns [EObject current=null] : ( (otherlv_0= 'entrypoint' | otherlv_1= 'endpoint' )? otherlv_2= 'rule' ( (lv_name_3_0= ruleUnrestrictedName ) ) (otherlv_4= '(' otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'using' otherlv_8= '{' ( (lv_variables_9_0= ruleRuleVariableDeclaration ) )* otherlv_10= '}' )? otherlv_11= 'to' ( (lv_outPattern_12_0= ruleOutPattern ) ) (otherlv_13= '...' )? (otherlv_14= ',' )? (otherlv_15= 'do' otherlv_16= '{' ( (lv_actionBlock_17_0= ruleActionBlock ) ) otherlv_18= '}' )? (otherlv_19= ',' )? otherlv_20= '}' ) ;
    public final EObject ruleCalledRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_variables_9_0 = null;

        EObject lv_outPattern_12_0 = null;

        EObject lv_actionBlock_17_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:834:2: ( ( (otherlv_0= 'entrypoint' | otherlv_1= 'endpoint' )? otherlv_2= 'rule' ( (lv_name_3_0= ruleUnrestrictedName ) ) (otherlv_4= '(' otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'using' otherlv_8= '{' ( (lv_variables_9_0= ruleRuleVariableDeclaration ) )* otherlv_10= '}' )? otherlv_11= 'to' ( (lv_outPattern_12_0= ruleOutPattern ) ) (otherlv_13= '...' )? (otherlv_14= ',' )? (otherlv_15= 'do' otherlv_16= '{' ( (lv_actionBlock_17_0= ruleActionBlock ) ) otherlv_18= '}' )? (otherlv_19= ',' )? otherlv_20= '}' ) )
            // InternalMyAtl.g:835:2: ( (otherlv_0= 'entrypoint' | otherlv_1= 'endpoint' )? otherlv_2= 'rule' ( (lv_name_3_0= ruleUnrestrictedName ) ) (otherlv_4= '(' otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'using' otherlv_8= '{' ( (lv_variables_9_0= ruleRuleVariableDeclaration ) )* otherlv_10= '}' )? otherlv_11= 'to' ( (lv_outPattern_12_0= ruleOutPattern ) ) (otherlv_13= '...' )? (otherlv_14= ',' )? (otherlv_15= 'do' otherlv_16= '{' ( (lv_actionBlock_17_0= ruleActionBlock ) ) otherlv_18= '}' )? (otherlv_19= ',' )? otherlv_20= '}' )
            {
            // InternalMyAtl.g:835:2: ( (otherlv_0= 'entrypoint' | otherlv_1= 'endpoint' )? otherlv_2= 'rule' ( (lv_name_3_0= ruleUnrestrictedName ) ) (otherlv_4= '(' otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'using' otherlv_8= '{' ( (lv_variables_9_0= ruleRuleVariableDeclaration ) )* otherlv_10= '}' )? otherlv_11= 'to' ( (lv_outPattern_12_0= ruleOutPattern ) ) (otherlv_13= '...' )? (otherlv_14= ',' )? (otherlv_15= 'do' otherlv_16= '{' ( (lv_actionBlock_17_0= ruleActionBlock ) ) otherlv_18= '}' )? (otherlv_19= ',' )? otherlv_20= '}' )
            // InternalMyAtl.g:836:3: (otherlv_0= 'entrypoint' | otherlv_1= 'endpoint' )? otherlv_2= 'rule' ( (lv_name_3_0= ruleUnrestrictedName ) ) (otherlv_4= '(' otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'using' otherlv_8= '{' ( (lv_variables_9_0= ruleRuleVariableDeclaration ) )* otherlv_10= '}' )? otherlv_11= 'to' ( (lv_outPattern_12_0= ruleOutPattern ) ) (otherlv_13= '...' )? (otherlv_14= ',' )? (otherlv_15= 'do' otherlv_16= '{' ( (lv_actionBlock_17_0= ruleActionBlock ) ) otherlv_18= '}' )? (otherlv_19= ',' )? otherlv_20= '}'
            {
            // InternalMyAtl.g:836:3: (otherlv_0= 'entrypoint' | otherlv_1= 'endpoint' )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==48) ) {
                alt19=1;
            }
            else if ( (LA19_0==49) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyAtl.g:837:4: otherlv_0= 'entrypoint'
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getCalledRuleAccess().getEntrypointKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:842:4: otherlv_1= 'endpoint'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getCalledRuleAccess().getEndpointKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCalledRuleAccess().getRuleKeyword_1());
            		
            // InternalMyAtl.g:851:3: ( (lv_name_3_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:852:4: (lv_name_3_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:852:4: (lv_name_3_0= ruleUnrestrictedName )
            // InternalMyAtl.g:853:5: lv_name_3_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getCalledRuleAccess().getNameUnrestrictedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_name_3_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalledRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:870:3: (otherlv_4= '(' otherlv_5= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==50) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyAtl.g:871:4: otherlv_4= '(' otherlv_5= ')'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getCalledRuleAccess().getLeftParenthesisKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,51,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getCalledRuleAccess().getRightParenthesisKeyword_3_1());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,42,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyAtl.g:884:3: (otherlv_7= 'using' otherlv_8= '{' ( (lv_variables_9_0= ruleRuleVariableDeclaration ) )* otherlv_10= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyAtl.g:885:4: otherlv_7= 'using' otherlv_8= '{' ( (lv_variables_9_0= ruleRuleVariableDeclaration ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getCalledRuleAccess().getUsingKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,42,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyAtl.g:893:4: ( (lv_variables_9_0= ruleRuleVariableDeclaration ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_SIMPLE_ID) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMyAtl.g:894:5: (lv_variables_9_0= ruleRuleVariableDeclaration )
                    	    {
                    	    // InternalMyAtl.g:894:5: (lv_variables_9_0= ruleRuleVariableDeclaration )
                    	    // InternalMyAtl.g:895:6: lv_variables_9_0= ruleRuleVariableDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getCalledRuleAccess().getVariablesRuleVariableDeclarationParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_variables_9_0=ruleRuleVariableDeclaration();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCalledRuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_9_0,
                    	    							"org.xtext.example.mydsl.MyAtl.RuleVariableDeclaration");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,44,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getCalledRuleAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,45,FOLLOW_20); 

            			newLeafNode(otherlv_11, grammarAccess.getCalledRuleAccess().getToKeyword_6());
            		
            // InternalMyAtl.g:921:3: ( (lv_outPattern_12_0= ruleOutPattern ) )
            // InternalMyAtl.g:922:4: (lv_outPattern_12_0= ruleOutPattern )
            {
            // InternalMyAtl.g:922:4: (lv_outPattern_12_0= ruleOutPattern )
            // InternalMyAtl.g:923:5: lv_outPattern_12_0= ruleOutPattern
            {

            					newCompositeNode(grammarAccess.getCalledRuleAccess().getOutPatternOutPatternParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_21);
            lv_outPattern_12_0=ruleOutPattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalledRuleRule());
            					}
            					set(
            						current,
            						"outPattern",
            						lv_outPattern_12_0,
            						"org.xtext.example.mydsl.MyAtl.OutPattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:940:3: (otherlv_13= '...' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==46) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyAtl.g:941:4: otherlv_13= '...'
                    {
                    otherlv_13=(Token)match(input,46,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getCalledRuleAccess().getFullStopFullStopFullStopKeyword_8());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:946:3: (otherlv_14= ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyAtl.g:947:4: otherlv_14= ','
                    {
                    otherlv_14=(Token)match(input,22,FOLLOW_22); 

                    				newLeafNode(otherlv_14, grammarAccess.getCalledRuleAccess().getCommaKeyword_9());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:952:3: (otherlv_15= 'do' otherlv_16= '{' ( (lv_actionBlock_17_0= ruleActionBlock ) ) otherlv_18= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyAtl.g:953:4: otherlv_15= 'do' otherlv_16= '{' ( (lv_actionBlock_17_0= ruleActionBlock ) ) otherlv_18= '}'
                    {
                    otherlv_15=(Token)match(input,47,FOLLOW_15); 

                    				newLeafNode(otherlv_15, grammarAccess.getCalledRuleAccess().getDoKeyword_10_0());
                    			
                    otherlv_16=(Token)match(input,42,FOLLOW_23); 

                    				newLeafNode(otherlv_16, grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalMyAtl.g:961:4: ( (lv_actionBlock_17_0= ruleActionBlock ) )
                    // InternalMyAtl.g:962:5: (lv_actionBlock_17_0= ruleActionBlock )
                    {
                    // InternalMyAtl.g:962:5: (lv_actionBlock_17_0= ruleActionBlock )
                    // InternalMyAtl.g:963:6: lv_actionBlock_17_0= ruleActionBlock
                    {

                    						newCompositeNode(grammarAccess.getCalledRuleAccess().getActionBlockActionBlockParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_actionBlock_17_0=ruleActionBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalledRuleRule());
                    						}
                    						set(
                    							current,
                    							"actionBlock",
                    							lv_actionBlock_17_0,
                    							"org.xtext.example.mydsl.MyAtl.ActionBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,44,FOLLOW_25); 

                    				newLeafNode(otherlv_18, grammarAccess.getCalledRuleAccess().getRightCurlyBracketKeyword_10_3());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:985:3: (otherlv_19= ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyAtl.g:986:4: otherlv_19= ','
                    {
                    otherlv_19=(Token)match(input,22,FOLLOW_24); 

                    				newLeafNode(otherlv_19, grammarAccess.getCalledRuleAccess().getCommaKeyword_11());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,44,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getCalledRuleAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleQueryRule"
    // InternalMyAtl.g:999:1: entryRuleQueryRule returns [EObject current=null] : iv_ruleQueryRule= ruleQueryRule EOF ;
    public final EObject entryRuleQueryRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryRule = null;


        try {
            // InternalMyAtl.g:999:50: (iv_ruleQueryRule= ruleQueryRule EOF )
            // InternalMyAtl.g:1000:2: iv_ruleQueryRule= ruleQueryRule EOF
            {
             newCompositeNode(grammarAccess.getQueryRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryRule=ruleQueryRule();

            state._fsp--;

             current =iv_ruleQueryRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryRule"


    // $ANTLR start "ruleQueryRule"
    // InternalMyAtl.g:1006:1: ruleQueryRule returns [EObject current=null] : (otherlv_0= 'query' ( (lv_name_1_0= ruleUnrestrictedName ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )* )? otherlv_6= ')' )? otherlv_7= '=' ( (lv_initExpression_8_0= ruleExpCS ) ) otherlv_9= ';' ) ;
    public final EObject ruleQueryRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_initExpression_8_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1012:2: ( (otherlv_0= 'query' ( (lv_name_1_0= ruleUnrestrictedName ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )* )? otherlv_6= ')' )? otherlv_7= '=' ( (lv_initExpression_8_0= ruleExpCS ) ) otherlv_9= ';' ) )
            // InternalMyAtl.g:1013:2: (otherlv_0= 'query' ( (lv_name_1_0= ruleUnrestrictedName ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )* )? otherlv_6= ')' )? otherlv_7= '=' ( (lv_initExpression_8_0= ruleExpCS ) ) otherlv_9= ';' )
            {
            // InternalMyAtl.g:1013:2: (otherlv_0= 'query' ( (lv_name_1_0= ruleUnrestrictedName ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )* )? otherlv_6= ')' )? otherlv_7= '=' ( (lv_initExpression_8_0= ruleExpCS ) ) otherlv_9= ';' )
            // InternalMyAtl.g:1014:3: otherlv_0= 'query' ( (lv_name_1_0= ruleUnrestrictedName ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )* )? otherlv_6= ')' )? otherlv_7= '=' ( (lv_initExpression_8_0= ruleExpCS ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryRuleAccess().getQueryKeyword_0());
            		
            // InternalMyAtl.g:1018:3: ( (lv_name_1_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1019:4: (lv_name_1_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1019:4: (lv_name_1_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1020:5: lv_name_1_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getQueryRuleAccess().getNameUnrestrictedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_name_1_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:1037:3: (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )* )? otherlv_6= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==50) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyAtl.g:1038:4: otherlv_2= '(' ( ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getQueryRuleAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMyAtl.g:1042:4: ( ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_SIMPLE_ID) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalMyAtl.g:1043:5: ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )*
                            {
                            // InternalMyAtl.g:1043:5: ( (lv_parameters_3_0= ruleATLParameterCS ) )
                            // InternalMyAtl.g:1044:6: (lv_parameters_3_0= ruleATLParameterCS )
                            {
                            // InternalMyAtl.g:1044:6: (lv_parameters_3_0= ruleATLParameterCS )
                            // InternalMyAtl.g:1045:7: lv_parameters_3_0= ruleATLParameterCS
                            {

                            							newCompositeNode(grammarAccess.getQueryRuleAccess().getParametersATLParameterCSParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_31);
                            lv_parameters_3_0=ruleATLParameterCS();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getQueryRuleRule());
                            							}
                            							add(
                            								current,
                            								"parameters",
                            								lv_parameters_3_0,
                            								"org.xtext.example.mydsl.MyAtl.ATLParameterCS");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyAtl.g:1062:5: (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==22) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // InternalMyAtl.g:1063:6: otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) )
                            	    {
                            	    otherlv_4=(Token)match(input,22,FOLLOW_3); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getQueryRuleAccess().getCommaKeyword_2_1_1_0());
                            	    					
                            	    // InternalMyAtl.g:1067:6: ( (lv_parameters_5_0= ruleATLParameterCS ) )
                            	    // InternalMyAtl.g:1068:7: (lv_parameters_5_0= ruleATLParameterCS )
                            	    {
                            	    // InternalMyAtl.g:1068:7: (lv_parameters_5_0= ruleATLParameterCS )
                            	    // InternalMyAtl.g:1069:8: lv_parameters_5_0= ruleATLParameterCS
                            	    {

                            	    								newCompositeNode(grammarAccess.getQueryRuleAccess().getParametersATLParameterCSParserRuleCall_2_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_31);
                            	    lv_parameters_5_0=ruleATLParameterCS();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getQueryRuleRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"parameters",
                            	    									lv_parameters_5_0,
                            	    									"org.xtext.example.mydsl.MyAtl.ATLParameterCS");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,51,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getQueryRuleAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,53,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getQueryRuleAccess().getEqualsSignKeyword_3());
            		
            // InternalMyAtl.g:1097:3: ( (lv_initExpression_8_0= ruleExpCS ) )
            // InternalMyAtl.g:1098:4: (lv_initExpression_8_0= ruleExpCS )
            {
            // InternalMyAtl.g:1098:4: (lv_initExpression_8_0= ruleExpCS )
            // InternalMyAtl.g:1099:5: lv_initExpression_8_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getQueryRuleAccess().getInitExpressionExpCSParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_initExpression_8_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRuleRule());
            					}
            					set(
            						current,
            						"initExpression",
            						lv_initExpression_8_0,
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getQueryRuleAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQueryRule"


    // $ANTLR start "entryRuleHelper"
    // InternalMyAtl.g:1124:1: entryRuleHelper returns [EObject current=null] : iv_ruleHelper= ruleHelper EOF ;
    public final EObject entryRuleHelper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelper = null;


        try {
            // InternalMyAtl.g:1124:47: (iv_ruleHelper= ruleHelper EOF )
            // InternalMyAtl.g:1125:2: iv_ruleHelper= ruleHelper EOF
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
    // InternalMyAtl.g:1131:1: ruleHelper returns [EObject current=null] : (otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_name_2_0= ruleUnrestrictedName ) )? ( (lv_definition_3_0= ruleATLDefCS ) ) ) ;
    public final EObject ruleHelper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_definition_3_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1137:2: ( (otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_name_2_0= ruleUnrestrictedName ) )? ( (lv_definition_3_0= ruleATLDefCS ) ) ) )
            // InternalMyAtl.g:1138:2: (otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_name_2_0= ruleUnrestrictedName ) )? ( (lv_definition_3_0= ruleATLDefCS ) ) )
            {
            // InternalMyAtl.g:1138:2: (otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_name_2_0= ruleUnrestrictedName ) )? ( (lv_definition_3_0= ruleATLDefCS ) ) )
            // InternalMyAtl.g:1139:3: otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_name_2_0= ruleUnrestrictedName ) )? ( (lv_definition_3_0= ruleATLDefCS ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getHelperAccess().getHelperKeyword_0());
            		
            // InternalMyAtl.g:1143:3: (otherlv_1= 'context' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==55) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyAtl.g:1144:4: otherlv_1= 'context'
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_33); 

                    				newLeafNode(otherlv_1, grammarAccess.getHelperAccess().getContextKeyword_1());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:1149:3: ( (lv_name_2_0= ruleUnrestrictedName ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_SIMPLE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyAtl.g:1150:4: (lv_name_2_0= ruleUnrestrictedName )
                    {
                    // InternalMyAtl.g:1150:4: (lv_name_2_0= ruleUnrestrictedName )
                    // InternalMyAtl.g:1151:5: lv_name_2_0= ruleUnrestrictedName
                    {

                    					newCompositeNode(grammarAccess.getHelperAccess().getNameUnrestrictedNameParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_33);
                    lv_name_2_0=ruleUnrestrictedName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getHelperRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyAtl.g:1168:3: ( (lv_definition_3_0= ruleATLDefCS ) )
            // InternalMyAtl.g:1169:4: (lv_definition_3_0= ruleATLDefCS )
            {
            // InternalMyAtl.g:1169:4: (lv_definition_3_0= ruleATLDefCS )
            // InternalMyAtl.g:1170:5: lv_definition_3_0= ruleATLDefCS
            {

            					newCompositeNode(grammarAccess.getHelperAccess().getDefinitionATLDefCSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_definition_3_0=ruleATLDefCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHelperRule());
            					}
            					set(
            						current,
            						"definition",
            						lv_definition_3_0,
            						"org.xtext.example.mydsl.MyAtl.ATLDefCS");
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
    // $ANTLR end "ruleHelper"


    // $ANTLR start "entryRuleATLDefCS"
    // InternalMyAtl.g:1191:1: entryRuleATLDefCS returns [EObject current=null] : iv_ruleATLDefCS= ruleATLDefCS EOF ;
    public final EObject entryRuleATLDefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATLDefCS = null;


        try {
            // InternalMyAtl.g:1191:49: (iv_ruleATLDefCS= ruleATLDefCS EOF )
            // InternalMyAtl.g:1192:2: iv_ruleATLDefCS= ruleATLDefCS EOF
            {
             newCompositeNode(grammarAccess.getATLDefCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleATLDefCS=ruleATLDefCS();

            state._fsp--;

             current =iv_ruleATLDefCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleATLDefCS"


    // $ANTLR start "ruleATLDefCS"
    // InternalMyAtl.g:1198:1: ruleATLDefCS returns [EObject current=null] : (otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';' ) ;
    public final EObject ruleATLDefCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_varName_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_type_9_0 = null;

        EObject lv_initExpression_11_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1204:2: ( (otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';' ) )
            // InternalMyAtl.g:1205:2: (otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';' )
            {
            // InternalMyAtl.g:1205:2: (otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';' )
            // InternalMyAtl.g:1206:3: otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getATLDefCSAccess().getDefKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getATLDefCSAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:1214:3: ( (lv_varName_2_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1215:4: (lv_varName_2_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1215:4: (lv_varName_2_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1216:5: lv_varName_2_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getATLDefCSAccess().getVarNameUnrestrictedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
            lv_varName_2_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getATLDefCSRule());
            					}
            					set(
            						current,
            						"varName",
            						lv_varName_2_0,
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:1233:3: (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyAtl.g:1234:4: otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,50,FOLLOW_30); 

                    				newLeafNode(otherlv_3, grammarAccess.getATLDefCSAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMyAtl.g:1238:4: ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_SIMPLE_ID) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalMyAtl.g:1239:5: ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )*
                            {
                            // InternalMyAtl.g:1239:5: ( (lv_parameters_4_0= ruleATLParameterCS ) )
                            // InternalMyAtl.g:1240:6: (lv_parameters_4_0= ruleATLParameterCS )
                            {
                            // InternalMyAtl.g:1240:6: (lv_parameters_4_0= ruleATLParameterCS )
                            // InternalMyAtl.g:1241:7: lv_parameters_4_0= ruleATLParameterCS
                            {

                            							newCompositeNode(grammarAccess.getATLDefCSAccess().getParametersATLParameterCSParserRuleCall_3_1_0_0());
                            						
                            pushFollow(FOLLOW_31);
                            lv_parameters_4_0=ruleATLParameterCS();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getATLDefCSRule());
                            							}
                            							add(
                            								current,
                            								"parameters",
                            								lv_parameters_4_0,
                            								"org.xtext.example.mydsl.MyAtl.ATLParameterCS");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyAtl.g:1258:5: (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==22) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // InternalMyAtl.g:1259:6: otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) )
                            	    {
                            	    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                            	    						newLeafNode(otherlv_5, grammarAccess.getATLDefCSAccess().getCommaKeyword_3_1_1_0());
                            	    					
                            	    // InternalMyAtl.g:1263:6: ( (lv_parameters_6_0= ruleATLParameterCS ) )
                            	    // InternalMyAtl.g:1264:7: (lv_parameters_6_0= ruleATLParameterCS )
                            	    {
                            	    // InternalMyAtl.g:1264:7: (lv_parameters_6_0= ruleATLParameterCS )
                            	    // InternalMyAtl.g:1265:8: lv_parameters_6_0= ruleATLParameterCS
                            	    {

                            	    								newCompositeNode(grammarAccess.getATLDefCSAccess().getParametersATLParameterCSParserRuleCall_3_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_31);
                            	    lv_parameters_6_0=ruleATLParameterCS();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getATLDefCSRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"parameters",
                            	    									lv_parameters_6_0,
                            	    									"org.xtext.example.mydsl.MyAtl.ATLParameterCS");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop32;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,51,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getATLDefCSAccess().getRightParenthesisKeyword_3_2());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FOLLOW_35); 

            			newLeafNode(otherlv_8, grammarAccess.getATLDefCSAccess().getColonKeyword_4());
            		
            // InternalMyAtl.g:1293:3: ( (lv_type_9_0= ruleATLType ) )
            // InternalMyAtl.g:1294:4: (lv_type_9_0= ruleATLType )
            {
            // InternalMyAtl.g:1294:4: (lv_type_9_0= ruleATLType )
            // InternalMyAtl.g:1295:5: lv_type_9_0= ruleATLType
            {

            					newCompositeNode(grammarAccess.getATLDefCSAccess().getTypeATLTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_32);
            lv_type_9_0=ruleATLType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getATLDefCSRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_9_0,
            						"org.xtext.example.mydsl.MyAtl.ATLType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,53,FOLLOW_23); 

            			newLeafNode(otherlv_10, grammarAccess.getATLDefCSAccess().getEqualsSignKeyword_6());
            		
            // InternalMyAtl.g:1316:3: ( (lv_initExpression_11_0= ruleExpCS ) )
            // InternalMyAtl.g:1317:4: (lv_initExpression_11_0= ruleExpCS )
            {
            // InternalMyAtl.g:1317:4: (lv_initExpression_11_0= ruleExpCS )
            // InternalMyAtl.g:1318:5: lv_initExpression_11_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getATLDefCSAccess().getInitExpressionExpCSParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_4);
            lv_initExpression_11_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getATLDefCSRule());
            					}
            					set(
            						current,
            						"initExpression",
            						lv_initExpression_11_0,
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getATLDefCSAccess().getSemicolonKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleATLDefCS"


    // $ANTLR start "entryRuleATLParameterCS"
    // InternalMyAtl.g:1343:1: entryRuleATLParameterCS returns [EObject current=null] : iv_ruleATLParameterCS= ruleATLParameterCS EOF ;
    public final EObject entryRuleATLParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATLParameterCS = null;


        try {
            // InternalMyAtl.g:1343:55: (iv_ruleATLParameterCS= ruleATLParameterCS EOF )
            // InternalMyAtl.g:1344:2: iv_ruleATLParameterCS= ruleATLParameterCS EOF
            {
             newCompositeNode(grammarAccess.getATLParameterCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleATLParameterCS=ruleATLParameterCS();

            state._fsp--;

             current =iv_ruleATLParameterCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleATLParameterCS"


    // $ANTLR start "ruleATLParameterCS"
    // InternalMyAtl.g:1350:1: ruleATLParameterCS returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) ) ;
    public final EObject ruleATLParameterCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_varName_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1356:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) ) )
            // InternalMyAtl.g:1357:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) )
            {
            // InternalMyAtl.g:1357:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) )
            // InternalMyAtl.g:1358:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) )
            {
            // InternalMyAtl.g:1358:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1359:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1359:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1360:5: lv_varName_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getATLParameterCSAccess().getVarNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_varName_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getATLParameterCSRule());
            					}
            					set(
            						current,
            						"varName",
            						lv_varName_0_0,
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getATLParameterCSAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:1381:3: ( (lv_type_2_0= ruleATLType ) )
            // InternalMyAtl.g:1382:4: (lv_type_2_0= ruleATLType )
            {
            // InternalMyAtl.g:1382:4: (lv_type_2_0= ruleATLType )
            // InternalMyAtl.g:1383:5: lv_type_2_0= ruleATLType
            {

            					newCompositeNode(grammarAccess.getATLParameterCSAccess().getTypeATLTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleATLType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getATLParameterCSRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.mydsl.MyAtl.ATLType");
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
    // $ANTLR end "ruleATLParameterCS"


    // $ANTLR start "entryRuleRuleVariableDeclaration"
    // InternalMyAtl.g:1404:1: entryRuleRuleVariableDeclaration returns [EObject current=null] : iv_ruleRuleVariableDeclaration= ruleRuleVariableDeclaration EOF ;
    public final EObject entryRuleRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleVariableDeclaration = null;


        try {
            // InternalMyAtl.g:1404:64: (iv_ruleRuleVariableDeclaration= ruleRuleVariableDeclaration EOF )
            // InternalMyAtl.g:1405:2: iv_ruleRuleVariableDeclaration= ruleRuleVariableDeclaration EOF
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
    // InternalMyAtl.g:1411:1: ruleRuleVariableDeclaration returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';' ) ;
    public final EObject ruleRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_varName_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1417:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';' ) )
            // InternalMyAtl.g:1418:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';' )
            {
            // InternalMyAtl.g:1418:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';' )
            // InternalMyAtl.g:1419:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';'
            {
            // InternalMyAtl.g:1419:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1420:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1420:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1421:5: lv_varName_0_0= ruleUnrestrictedName
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
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleVariableDeclarationAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:1442:3: ( (lv_type_2_0= ruleATLType ) )
            // InternalMyAtl.g:1443:4: (lv_type_2_0= ruleATLType )
            {
            // InternalMyAtl.g:1443:4: (lv_type_2_0= ruleATLType )
            // InternalMyAtl.g:1444:5: lv_type_2_0= ruleATLType
            {

            					newCompositeNode(grammarAccess.getRuleVariableDeclarationAccess().getTypeATLTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_type_2_0=ruleATLType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleVariableDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.mydsl.MyAtl.ATLType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,53,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleVariableDeclarationAccess().getEqualsSignKeyword_3());
            		
            // InternalMyAtl.g:1465:3: ( (lv_initExpression_4_0= ruleExpCS ) )
            // InternalMyAtl.g:1466:4: (lv_initExpression_4_0= ruleExpCS )
            {
            // InternalMyAtl.g:1466:4: (lv_initExpression_4_0= ruleExpCS )
            // InternalMyAtl.g:1467:5: lv_initExpression_4_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getRuleVariableDeclarationAccess().getInitExpressionExpCSParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_initExpression_4_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleVariableDeclarationRule());
            					}
            					set(
            						current,
            						"initExpression",
            						lv_initExpression_4_0,
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleVariableDeclarationAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalMyAtl.g:1492:1: entryRuleInPattern returns [EObject current=null] : iv_ruleInPattern= ruleInPattern EOF ;
    public final EObject entryRuleInPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPattern = null;


        try {
            // InternalMyAtl.g:1492:50: (iv_ruleInPattern= ruleInPattern EOF )
            // InternalMyAtl.g:1493:2: iv_ruleInPattern= ruleInPattern EOF
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
    // InternalMyAtl.g:1499:1: ruleInPattern returns [EObject current=null] : ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )? ) ;
    public final EObject ruleInPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_0_0 = null;

        EObject lv_filter_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1505:2: ( ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )? ) )
            // InternalMyAtl.g:1506:2: ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )? )
            {
            // InternalMyAtl.g:1506:2: ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )? )
            // InternalMyAtl.g:1507:3: ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )?
            {
            // InternalMyAtl.g:1507:3: ( (lv_elements_0_0= ruleInPatternElement ) )
            // InternalMyAtl.g:1508:4: (lv_elements_0_0= ruleInPatternElement )
            {
            // InternalMyAtl.g:1508:4: (lv_elements_0_0= ruleInPatternElement )
            // InternalMyAtl.g:1509:5: lv_elements_0_0= ruleInPatternElement
            {

            					newCompositeNode(grammarAccess.getInPatternAccess().getElementsInPatternElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_elements_0_0=ruleInPatternElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInPatternRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"org.xtext.example.mydsl.MyAtl.InPatternElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:1526:3: (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==50) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyAtl.g:1527:4: otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getInPatternAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMyAtl.g:1531:4: ( (lv_filter_2_0= ruleExpCS ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=RULE_SIMPLE_ID && LA35_0<=RULE_BIG_INT)||LA35_0==27||LA35_0==46||LA35_0==50||(LA35_0>=62 && LA35_0<=64)||LA35_0==77||(LA35_0>=79 && LA35_0<=81)||LA35_0==84||(LA35_0>=88 && LA35_0<=89)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalMyAtl.g:1532:5: (lv_filter_2_0= ruleExpCS )
                            {
                            // InternalMyAtl.g:1532:5: (lv_filter_2_0= ruleExpCS )
                            // InternalMyAtl.g:1533:6: lv_filter_2_0= ruleExpCS
                            {

                            						newCompositeNode(grammarAccess.getInPatternAccess().getFilterExpCSParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_28);
                            lv_filter_2_0=ruleExpCS();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getInPatternRule());
                            						}
                            						set(
                            							current,
                            							"filter",
                            							lv_filter_2_0,
                            							"org.xtext.example.mydsl.MyAtl.ExpCS");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,51,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getInPatternAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // InternalMyAtl.g:1559:1: entryRuleInPatternElement returns [EObject current=null] : iv_ruleInPatternElement= ruleInPatternElement EOF ;
    public final EObject entryRuleInPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPatternElement = null;


        try {
            // InternalMyAtl.g:1559:57: (iv_ruleInPatternElement= ruleInPatternElement EOF )
            // InternalMyAtl.g:1560:2: iv_ruleInPatternElement= ruleInPatternElement EOF
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
    // InternalMyAtl.g:1566:1: ruleInPatternElement returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) ) ;
    public final EObject ruleInPatternElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_varName_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1572:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) ) )
            // InternalMyAtl.g:1573:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) )
            {
            // InternalMyAtl.g:1573:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) )
            // InternalMyAtl.g:1574:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) )
            {
            // InternalMyAtl.g:1574:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1575:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1575:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1576:5: lv_varName_0_0= ruleUnrestrictedName
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
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getInPatternElementAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:1597:3: ( (lv_type_2_0= ruleATLType ) )
            // InternalMyAtl.g:1598:4: (lv_type_2_0= ruleATLType )
            {
            // InternalMyAtl.g:1598:4: (lv_type_2_0= ruleATLType )
            // InternalMyAtl.g:1599:5: lv_type_2_0= ruleATLType
            {

            					newCompositeNode(grammarAccess.getInPatternElementAccess().getTypeATLTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleATLType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInPatternElementRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.mydsl.MyAtl.ATLType");
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
    // $ANTLR end "ruleInPatternElement"


    // $ANTLR start "entryRuleOutPattern"
    // InternalMyAtl.g:1620:1: entryRuleOutPattern returns [EObject current=null] : iv_ruleOutPattern= ruleOutPattern EOF ;
    public final EObject entryRuleOutPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPattern = null;


        try {
            // InternalMyAtl.g:1620:51: (iv_ruleOutPattern= ruleOutPattern EOF )
            // InternalMyAtl.g:1621:2: iv_ruleOutPattern= ruleOutPattern EOF
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
    // InternalMyAtl.g:1627:1: ruleOutPattern returns [EObject current=null] : ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* ) ;
    public final EObject ruleOutPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1633:2: ( ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* ) )
            // InternalMyAtl.g:1634:2: ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* )
            {
            // InternalMyAtl.g:1634:2: ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* )
            // InternalMyAtl.g:1635:3: ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )*
            {
            // InternalMyAtl.g:1635:3: ( (lv_elements_0_0= ruleOutPatternElement ) )
            // InternalMyAtl.g:1636:4: (lv_elements_0_0= ruleOutPatternElement )
            {
            // InternalMyAtl.g:1636:4: (lv_elements_0_0= ruleOutPatternElement )
            // InternalMyAtl.g:1637:5: lv_elements_0_0= ruleOutPatternElement
            {

            					newCompositeNode(grammarAccess.getOutPatternAccess().getElementsOutPatternElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
            lv_elements_0_0=ruleOutPatternElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutPatternRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"org.xtext.example.mydsl.MyAtl.OutPatternElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:1654:3: (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==22) ) {
                    int LA37_2 = input.LA(2);

                    if ( (LA37_2==RULE_SIMPLE_ID||LA37_2==57) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalMyAtl.g:1655:4: otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_20); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOutPatternAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyAtl.g:1659:4: ( (lv_elements_2_0= ruleOutPatternElement ) )
            	    // InternalMyAtl.g:1660:5: (lv_elements_2_0= ruleOutPatternElement )
            	    {
            	    // InternalMyAtl.g:1660:5: (lv_elements_2_0= ruleOutPatternElement )
            	    // InternalMyAtl.g:1661:6: lv_elements_2_0= ruleOutPatternElement
            	    {

            	    						newCompositeNode(grammarAccess.getOutPatternAccess().getElementsOutPatternElementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_elements_2_0=ruleOutPatternElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOutPatternRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_2_0,
            	    							"org.xtext.example.mydsl.MyAtl.OutPatternElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalMyAtl.g:1683:1: entryRuleOutPatternElement returns [EObject current=null] : iv_ruleOutPatternElement= ruleOutPatternElement EOF ;
    public final EObject entryRuleOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPatternElement = null;


        try {
            // InternalMyAtl.g:1683:58: (iv_ruleOutPatternElement= ruleOutPatternElement EOF )
            // InternalMyAtl.g:1684:2: iv_ruleOutPatternElement= ruleOutPatternElement EOF
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
    // InternalMyAtl.g:1690:1: ruleOutPatternElement returns [EObject current=null] : (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement ) ;
    public final EObject ruleOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleOutPatternElement_0 = null;

        EObject this_ForEachOutPatternElement_1 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1696:2: ( (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement ) )
            // InternalMyAtl.g:1697:2: (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement )
            {
            // InternalMyAtl.g:1697:2: (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_SIMPLE_ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==57) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyAtl.g:1698:3: this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement
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
                    // InternalMyAtl.g:1707:3: this_ForEachOutPatternElement_1= ruleForEachOutPatternElement
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
    // InternalMyAtl.g:1719:1: entryRuleSimpleOutPatternElement returns [EObject current=null] : iv_ruleSimpleOutPatternElement= ruleSimpleOutPatternElement EOF ;
    public final EObject entryRuleSimpleOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOutPatternElement = null;


        try {
            // InternalMyAtl.g:1719:64: (iv_ruleSimpleOutPatternElement= ruleSimpleOutPatternElement EOF )
            // InternalMyAtl.g:1720:2: iv_ruleSimpleOutPatternElement= ruleSimpleOutPatternElement EOF
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
    // InternalMyAtl.g:1726:1: ruleSimpleOutPatternElement returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )? ) ;
    public final EObject ruleSimpleOutPatternElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_varName_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_bindings_4_0 = null;

        EObject lv_bindings_6_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1732:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )? ) )
            // InternalMyAtl.g:1733:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )? )
            {
            // InternalMyAtl.g:1733:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )? )
            // InternalMyAtl.g:1734:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )?
            {
            // InternalMyAtl.g:1734:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1735:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1735:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1736:5: lv_varName_0_0= ruleUnrestrictedName
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
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleOutPatternElementAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:1757:3: ( (lv_type_2_0= ruleATLType ) )
            // InternalMyAtl.g:1758:4: (lv_type_2_0= ruleATLType )
            {
            // InternalMyAtl.g:1758:4: (lv_type_2_0= ruleATLType )
            // InternalMyAtl.g:1759:5: lv_type_2_0= ruleATLType
            {

            					newCompositeNode(grammarAccess.getSimpleOutPatternElementAccess().getTypeATLTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_36);
            lv_type_2_0=ruleATLType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleOutPatternElementRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.mydsl.MyAtl.ATLType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:1776:3: (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyAtl.g:1777:4: otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,50,FOLLOW_30); 

                    				newLeafNode(otherlv_3, grammarAccess.getSimpleOutPatternElementAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMyAtl.g:1781:4: ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_SIMPLE_ID) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalMyAtl.g:1782:5: ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )*
                            {
                            // InternalMyAtl.g:1782:5: ( (lv_bindings_4_0= ruleBinding ) )
                            // InternalMyAtl.g:1783:6: (lv_bindings_4_0= ruleBinding )
                            {
                            // InternalMyAtl.g:1783:6: (lv_bindings_4_0= ruleBinding )
                            // InternalMyAtl.g:1784:7: lv_bindings_4_0= ruleBinding
                            {

                            							newCompositeNode(grammarAccess.getSimpleOutPatternElementAccess().getBindingsBindingParserRuleCall_3_1_0_0());
                            						
                            pushFollow(FOLLOW_31);
                            lv_bindings_4_0=ruleBinding();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSimpleOutPatternElementRule());
                            							}
                            							add(
                            								current,
                            								"bindings",
                            								lv_bindings_4_0,
                            								"org.xtext.example.mydsl.MyAtl.Binding");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyAtl.g:1801:5: (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==22) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // InternalMyAtl.g:1802:6: otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) )
                            	    {
                            	    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                            	    						newLeafNode(otherlv_5, grammarAccess.getSimpleOutPatternElementAccess().getCommaKeyword_3_1_1_0());
                            	    					
                            	    // InternalMyAtl.g:1806:6: ( (lv_bindings_6_0= ruleBinding ) )
                            	    // InternalMyAtl.g:1807:7: (lv_bindings_6_0= ruleBinding )
                            	    {
                            	    // InternalMyAtl.g:1807:7: (lv_bindings_6_0= ruleBinding )
                            	    // InternalMyAtl.g:1808:8: lv_bindings_6_0= ruleBinding
                            	    {

                            	    								newCompositeNode(grammarAccess.getSimpleOutPatternElementAccess().getBindingsBindingParserRuleCall_3_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_31);
                            	    lv_bindings_6_0=ruleBinding();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getSimpleOutPatternElementRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"bindings",
                            	    									lv_bindings_6_0,
                            	    									"org.xtext.example.mydsl.MyAtl.Binding");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop39;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,51,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getSimpleOutPatternElementAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // InternalMyAtl.g:1836:1: entryRuleForEachOutPatternElement returns [EObject current=null] : iv_ruleForEachOutPatternElement= ruleForEachOutPatternElement EOF ;
    public final EObject entryRuleForEachOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachOutPatternElement = null;


        try {
            // InternalMyAtl.g:1836:65: (iv_ruleForEachOutPatternElement= ruleForEachOutPatternElement EOF )
            // InternalMyAtl.g:1837:2: iv_ruleForEachOutPatternElement= ruleForEachOutPatternElement EOF
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
    // InternalMyAtl.g:1843:1: ruleForEachOutPatternElement returns [EObject current=null] : (otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy' ) ;
    public final EObject ruleForEachOutPatternElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_collection_1_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1849:2: ( (otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy' ) )
            // InternalMyAtl.g:1850:2: (otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy' )
            {
            // InternalMyAtl.g:1850:2: (otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy' )
            // InternalMyAtl.g:1851:3: otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachOutPatternElementAccess().getXxxKeyword_0());
            		
            // InternalMyAtl.g:1855:3: ( (lv_collection_1_0= ruleExpCS ) )
            // InternalMyAtl.g:1856:4: (lv_collection_1_0= ruleExpCS )
            {
            // InternalMyAtl.g:1856:4: (lv_collection_1_0= ruleExpCS )
            // InternalMyAtl.g:1857:5: lv_collection_1_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getForEachOutPatternElementAccess().getCollectionExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_collection_1_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachOutPatternElementRule());
            					}
            					set(
            						current,
            						"collection",
            						lv_collection_1_0,
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,58,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachOutPatternElementAccess().getYyyKeyword_2());
            		

            }


            }


            	leaveRule();

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
    // InternalMyAtl.g:1882:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalMyAtl.g:1882:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalMyAtl.g:1883:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalMyAtl.g:1889:1: ruleBinding returns [EObject current=null] : ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_propertyName_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1895:2: ( ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) ) ) )
            // InternalMyAtl.g:1896:2: ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) ) )
            {
            // InternalMyAtl.g:1896:2: ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) ) )
            // InternalMyAtl.g:1897:3: ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) )
            {
            // InternalMyAtl.g:1897:3: ( (lv_propertyName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1898:4: (lv_propertyName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1898:4: (lv_propertyName_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1899:5: lv_propertyName_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getPropertyNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
            lv_propertyName_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"propertyName",
            						lv_propertyName_0_0,
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,59,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_1());
            		
            // InternalMyAtl.g:1920:3: ( (lv_value_2_0= ruleExpCS ) )
            // InternalMyAtl.g:1921:4: (lv_value_2_0= ruleExpCS )
            {
            // InternalMyAtl.g:1921:4: (lv_value_2_0= ruleExpCS )
            // InternalMyAtl.g:1922:5: lv_value_2_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getValueExpCSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleActionBlock"
    // InternalMyAtl.g:1943:1: entryRuleActionBlock returns [EObject current=null] : iv_ruleActionBlock= ruleActionBlock EOF ;
    public final EObject entryRuleActionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionBlock = null;


        try {
            // InternalMyAtl.g:1943:52: (iv_ruleActionBlock= ruleActionBlock EOF )
            // InternalMyAtl.g:1944:2: iv_ruleActionBlock= ruleActionBlock EOF
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
    // InternalMyAtl.g:1950:1: ruleActionBlock returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )+ ;
    public final EObject ruleActionBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1956:2: ( ( (lv_statements_0_0= ruleStatement ) )+ )
            // InternalMyAtl.g:1957:2: ( (lv_statements_0_0= ruleStatement ) )+
            {
            // InternalMyAtl.g:1957:2: ( (lv_statements_0_0= ruleStatement ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_SIMPLE_ID && LA42_0<=RULE_BIG_INT)||LA42_0==27||LA42_0==46||LA42_0==50||(LA42_0>=62 && LA42_0<=64)||LA42_0==77||(LA42_0>=79 && LA42_0<=81)||LA42_0==84||(LA42_0>=88 && LA42_0<=89)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMyAtl.g:1958:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalMyAtl.g:1958:3: (lv_statements_0_0= ruleStatement )
            	    // InternalMyAtl.g:1959:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getActionBlockAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_41);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getActionBlockRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"org.xtext.example.mydsl.MyAtl.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
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
    // InternalMyAtl.g:1979:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyAtl.g:1979:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyAtl.g:1980:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMyAtl.g:1986:1: ruleStatement returns [EObject current=null] : this_BindingStat_0= ruleBindingStat ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_BindingStat_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1992:2: (this_BindingStat_0= ruleBindingStat )
            // InternalMyAtl.g:1993:2: this_BindingStat_0= ruleBindingStat
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
    // InternalMyAtl.g:2004:1: entryRuleBindingStat returns [EObject current=null] : iv_ruleBindingStat= ruleBindingStat EOF ;
    public final EObject entryRuleBindingStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingStat = null;


        try {
            // InternalMyAtl.g:2004:52: (iv_ruleBindingStat= ruleBindingStat EOF )
            // InternalMyAtl.g:2005:2: iv_ruleBindingStat= ruleBindingStat EOF
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
    // InternalMyAtl.g:2011:1: ruleBindingStat returns [EObject current=null] : ( ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';' ) ;
    public final EObject ruleBindingStat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_source_0_0 = null;

        AntlrDatatypeRuleToken lv_propertyName_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2017:2: ( ( ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';' ) )
            // InternalMyAtl.g:2018:2: ( ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';' )
            {
            // InternalMyAtl.g:2018:2: ( ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';' )
            // InternalMyAtl.g:2019:3: ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';'
            {
            // InternalMyAtl.g:2019:3: ( (lv_source_0_0= ruleExpCS ) )
            // InternalMyAtl.g:2020:4: (lv_source_0_0= ruleExpCS )
            {
            // InternalMyAtl.g:2020:4: (lv_source_0_0= ruleExpCS )
            // InternalMyAtl.g:2021:5: lv_source_0_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getBindingStatAccess().getSourceExpCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
            lv_source_0_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingStatRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_0_0,
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingStatAccess().getFullStopKeyword_1());
            		
            // InternalMyAtl.g:2042:3: ( (lv_propertyName_2_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:2043:4: (lv_propertyName_2_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:2043:4: (lv_propertyName_2_0= ruleUnrestrictedName )
            // InternalMyAtl.g:2044:5: lv_propertyName_2_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getBindingStatAccess().getPropertyNameUnrestrictedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_40);
            lv_propertyName_2_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingStatRule());
            					}
            					set(
            						current,
            						"propertyName",
            						lv_propertyName_2_0,
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,59,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getBindingStatAccess().getLessThanSignHyphenMinusKeyword_3());
            		
            // InternalMyAtl.g:2065:3: ( (lv_value_4_0= ruleExpCS ) )
            // InternalMyAtl.g:2066:4: (lv_value_4_0= ruleExpCS )
            {
            // InternalMyAtl.g:2066:4: (lv_value_4_0= ruleExpCS )
            // InternalMyAtl.g:2067:5: lv_value_4_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getBindingStatAccess().getValueExpCSParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_value_4_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingStatRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBindingStatAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleATLType"
    // InternalMyAtl.g:2092:1: entryRuleATLType returns [EObject current=null] : iv_ruleATLType= ruleATLType EOF ;
    public final EObject entryRuleATLType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATLType = null;


        try {
            // InternalMyAtl.g:2092:48: (iv_ruleATLType= ruleATLType EOF )
            // InternalMyAtl.g:2093:2: iv_ruleATLType= ruleATLType EOF
            {
             newCompositeNode(grammarAccess.getATLTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleATLType=ruleATLType();

            state._fsp--;

             current =iv_ruleATLType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleATLType"


    // $ANTLR start "ruleATLType"
    // InternalMyAtl.g:2099:1: ruleATLType returns [EObject current=null] : ( ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleATLType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_modelName_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2105:2: ( ( ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) ) ) )
            // InternalMyAtl.g:2106:2: ( ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) ) )
            {
            // InternalMyAtl.g:2106:2: ( ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) ) )
            // InternalMyAtl.g:2107:3: ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) )
            {
            // InternalMyAtl.g:2107:3: ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_SIMPLE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==61) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalMyAtl.g:2108:4: ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!'
                    {
                    // InternalMyAtl.g:2108:4: ( (lv_modelName_0_0= ruleATLModelName ) )
                    // InternalMyAtl.g:2109:5: (lv_modelName_0_0= ruleATLModelName )
                    {
                    // InternalMyAtl.g:2109:5: (lv_modelName_0_0= ruleATLModelName )
                    // InternalMyAtl.g:2110:6: lv_modelName_0_0= ruleATLModelName
                    {

                    						newCompositeNode(grammarAccess.getATLTypeAccess().getModelNameATLModelNameParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_modelName_0_0=ruleATLModelName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getATLTypeRule());
                    						}
                    						set(
                    							current,
                    							"modelName",
                    							lv_modelName_0_0,
                    							"org.xtext.example.mydsl.MyAtl.ATLModelName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,61,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getATLTypeAccess().getExclamationMarkKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:2132:3: ( (lv_type_2_0= ruleTypeExpCS ) )
            // InternalMyAtl.g:2133:4: (lv_type_2_0= ruleTypeExpCS )
            {
            // InternalMyAtl.g:2133:4: (lv_type_2_0= ruleTypeExpCS )
            // InternalMyAtl.g:2134:5: lv_type_2_0= ruleTypeExpCS
            {

            					newCompositeNode(grammarAccess.getATLTypeAccess().getTypeTypeExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleTypeExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getATLTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.mydsl.MyAtl.TypeExpCS");
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
    // $ANTLR end "ruleATLType"


    // $ANTLR start "entryRuleATLModelName"
    // InternalMyAtl.g:2155:1: entryRuleATLModelName returns [String current=null] : iv_ruleATLModelName= ruleATLModelName EOF ;
    public final String entryRuleATLModelName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATLModelName = null;


        try {
            // InternalMyAtl.g:2155:52: (iv_ruleATLModelName= ruleATLModelName EOF )
            // InternalMyAtl.g:2156:2: iv_ruleATLModelName= ruleATLModelName EOF
            {
             newCompositeNode(grammarAccess.getATLModelNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleATLModelName=ruleATLModelName();

            state._fsp--;

             current =iv_ruleATLModelName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleATLModelName"


    // $ANTLR start "ruleATLModelName"
    // InternalMyAtl.g:2162:1: ruleATLModelName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_UnrestrictedName_0= ruleUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleATLModelName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2168:2: (this_UnrestrictedName_0= ruleUnrestrictedName )
            // InternalMyAtl.g:2169:2: this_UnrestrictedName_0= ruleUnrestrictedName
            {

            		newCompositeNode(grammarAccess.getATLModelNameAccess().getUnrestrictedNameParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_UnrestrictedName_0=ruleUnrestrictedName();

            state._fsp--;


            		current.merge(this_UnrestrictedName_0);
            	

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
    // $ANTLR end "ruleATLModelName"


    // $ANTLR start "entryRuleEssentialOCLPrefixOperator"
    // InternalMyAtl.g:2182:1: entryRuleEssentialOCLPrefixOperator returns [String current=null] : iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF ;
    public final String entryRuleEssentialOCLPrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLPrefixOperator = null;


        try {
            // InternalMyAtl.g:2182:66: (iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF )
            // InternalMyAtl.g:2183:2: iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF
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
    // InternalMyAtl.g:2189:1: ruleEssentialOCLPrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLPrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtl.g:2195:2: ( (kw= '-' | kw= 'not' ) )
            // InternalMyAtl.g:2196:2: (kw= '-' | kw= 'not' )
            {
            // InternalMyAtl.g:2196:2: (kw= '-' | kw= 'not' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==62) ) {
                alt44=1;
            }
            else if ( (LA44_0==63) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyAtl.g:2197:3: kw= '-'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLPrefixOperatorAccess().getHyphenMinusKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:2203:3: kw= 'not'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

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
    // InternalMyAtl.g:2212:1: entryRuleEssentialOCLInfixOperator returns [String current=null] : iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF ;
    public final String entryRuleEssentialOCLInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperator = null;


        try {
            // InternalMyAtl.g:2212:65: (iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF )
            // InternalMyAtl.g:2213:2: iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF
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
    // InternalMyAtl.g:2219:1: ruleEssentialOCLInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtl.g:2225:2: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) )
            // InternalMyAtl.g:2226:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            {
            // InternalMyAtl.g:2226:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            int alt45=14;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt45=1;
                }
                break;
            case 65:
                {
                alt45=2;
                }
                break;
            case 66:
                {
                alt45=3;
                }
                break;
            case 62:
                {
                alt45=4;
                }
                break;
            case 67:
                {
                alt45=5;
                }
                break;
            case 68:
                {
                alt45=6;
                }
                break;
            case 69:
                {
                alt45=7;
                }
                break;
            case 70:
                {
                alt45=8;
                }
                break;
            case 53:
                {
                alt45=9;
                }
                break;
            case 71:
                {
                alt45=10;
                }
                break;
            case 72:
                {
                alt45=11;
                }
                break;
            case 73:
                {
                alt45=12;
                }
                break;
            case 74:
                {
                alt45=13;
                }
                break;
            case 75:
                {
                alt45=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalMyAtl.g:2227:3: kw= '*'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:2233:3: kw= '/'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyAtl.g:2239:3: kw= '+'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getPlusSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyAtl.g:2245:3: kw= '-'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getHyphenMinusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyAtl.g:2251:3: kw= '>'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyAtl.g:2257:3: kw= '<'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyAtl.g:2263:3: kw= '>='
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignEqualsSignKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyAtl.g:2269:3: kw= '<='
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignEqualsSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalMyAtl.g:2275:3: kw= '='
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getEqualsSignKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalMyAtl.g:2281:3: kw= '<>'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignGreaterThanSignKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalMyAtl.g:2287:3: kw= 'and'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getAndKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalMyAtl.g:2293:3: kw= 'or'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getOrKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalMyAtl.g:2299:3: kw= 'xor'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getXorKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalMyAtl.g:2305:3: kw= 'implies'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

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
    // InternalMyAtl.g:2314:1: entryRuleEssentialOCLNavigationOperator returns [String current=null] : iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF ;
    public final String entryRuleEssentialOCLNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperator = null;


        try {
            // InternalMyAtl.g:2314:70: (iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF )
            // InternalMyAtl.g:2315:2: iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF
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
    // InternalMyAtl.g:2321:1: ruleEssentialOCLNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtl.g:2327:2: ( (kw= '.' | kw= '->' ) )
            // InternalMyAtl.g:2328:2: (kw= '.' | kw= '->' )
            {
            // InternalMyAtl.g:2328:2: (kw= '.' | kw= '->' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==60) ) {
                alt46=1;
            }
            else if ( (LA46_0==76) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyAtl.g:2329:3: kw= '.'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorAccess().getFullStopKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:2335:3: kw= '->'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

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
    // InternalMyAtl.g:2344:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalMyAtl.g:2344:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMyAtl.g:2345:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalMyAtl.g:2351:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;


        	enterRule();

        try {
            // InternalMyAtl.g:2357:2: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // InternalMyAtl.g:2358:2: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
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
    // InternalMyAtl.g:2368:1: entryRulePrefixOperator returns [String current=null] : iv_rulePrefixOperator= rulePrefixOperator EOF ;
    public final String entryRulePrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixOperator = null;


        try {
            // InternalMyAtl.g:2368:54: (iv_rulePrefixOperator= rulePrefixOperator EOF )
            // InternalMyAtl.g:2369:2: iv_rulePrefixOperator= rulePrefixOperator EOF
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
    // InternalMyAtl.g:2375:1: rulePrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator ;
    public final AntlrDatatypeRuleToken rulePrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLPrefixOperator_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2381:2: (this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator )
            // InternalMyAtl.g:2382:2: this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator
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
    // InternalMyAtl.g:2395:1: entryRuleInfixOperator returns [String current=null] : iv_ruleInfixOperator= ruleInfixOperator EOF ;
    public final String entryRuleInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperator = null;


        try {
            // InternalMyAtl.g:2395:53: (iv_ruleInfixOperator= ruleInfixOperator EOF )
            // InternalMyAtl.g:2396:2: iv_ruleInfixOperator= ruleInfixOperator EOF
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
    // InternalMyAtl.g:2402:1: ruleInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator ;
    public final AntlrDatatypeRuleToken ruleInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperator_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2408:2: (this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator )
            // InternalMyAtl.g:2409:2: this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator
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
    // InternalMyAtl.g:2422:1: entryRuleNavigationOperator returns [String current=null] : iv_ruleNavigationOperator= ruleNavigationOperator EOF ;
    public final String entryRuleNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperator = null;


        try {
            // InternalMyAtl.g:2422:58: (iv_ruleNavigationOperator= ruleNavigationOperator EOF )
            // InternalMyAtl.g:2423:2: iv_ruleNavigationOperator= ruleNavigationOperator EOF
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
    // InternalMyAtl.g:2429:1: ruleNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator ;
    public final AntlrDatatypeRuleToken ruleNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperator_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2435:2: (this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator )
            // InternalMyAtl.g:2436:2: this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator
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


    // $ANTLR start "entryRuleCollectionTypeCS"
    // InternalMyAtl.g:2449:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // InternalMyAtl.g:2449:57: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // InternalMyAtl.g:2450:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
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
    // InternalMyAtl.g:2456:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? ) ;
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
            // InternalMyAtl.g:2462:2: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? ) )
            // InternalMyAtl.g:2463:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? )
            {
            // InternalMyAtl.g:2463:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? )
            // InternalMyAtl.g:2464:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )?
            {
            // InternalMyAtl.g:2464:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // InternalMyAtl.g:2465:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // InternalMyAtl.g:2465:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // InternalMyAtl.g:2466:5: lv_name_0_0= ruleCollectionTypeIdentifier
            {

            					newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
            lv_name_0_0=ruleCollectionTypeIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyAtl.CollectionTypeIdentifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:2483:3: ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )?
            int alt47=3;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // InternalMyAtl.g:2484:4: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
                    {
                    // InternalMyAtl.g:2484:4: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
                    // InternalMyAtl.g:2485:5: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_35); 

                    					newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalMyAtl.g:2489:5: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:2490:6: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:2490:6: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyAtl.g:2491:7: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    							newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_28);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                    							}
                    							set(
                    								current,
                    								"ownedType",
                    								lv_ownedType_2_0,
                    								"org.xtext.example.mydsl.MyAtl.TypeExpCS");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,51,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:2514:4: (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' )
                    {
                    // InternalMyAtl.g:2514:4: (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' )
                    // InternalMyAtl.g:2515:5: otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>'
                    {
                    otherlv_4=(Token)match(input,68,FOLLOW_35); 

                    					newLeafNode(otherlv_4, grammarAccess.getCollectionTypeCSAccess().getLessThanSignKeyword_1_1_0());
                    				
                    // InternalMyAtl.g:2519:5: ( (lv_ownedType_5_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:2520:6: (lv_ownedType_5_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:2520:6: (lv_ownedType_5_0= ruleTypeExpCS )
                    // InternalMyAtl.g:2521:7: lv_ownedType_5_0= ruleTypeExpCS
                    {

                    							newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_45);
                    lv_ownedType_5_0=ruleTypeExpCS();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                    							}
                    							set(
                    								current,
                    								"ownedType",
                    								lv_ownedType_5_0,
                    								"org.xtext.example.mydsl.MyAtl.TypeExpCS");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,67,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTupleTypeCS"
    // InternalMyAtl.g:2548:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // InternalMyAtl.g:2548:52: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // InternalMyAtl.g:2549:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
             newCompositeNode(grammarAccess.getTupleTypeCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();

            state._fsp--;

             current =iv_ruleTupleTypeCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleTypeCS"


    // $ANTLR start "ruleTupleTypeCS"
    // InternalMyAtl.g:2555:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) ) ;
    public final EObject ruleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_backtrack_11_0=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;

        EObject lv_ownedParts_7_0 = null;

        EObject lv_ownedParts_9_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2561:2: ( ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) ) )
            // InternalMyAtl.g:2562:2: ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) )
            {
            // InternalMyAtl.g:2562:2: ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) )
            // InternalMyAtl.g:2563:3: ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) )
            {
            // InternalMyAtl.g:2563:3: ( (lv_name_0_0= 'Tuple' ) )
            // InternalMyAtl.g:2564:4: (lv_name_0_0= 'Tuple' )
            {
            // InternalMyAtl.g:2564:4: (lv_name_0_0= 'Tuple' )
            // InternalMyAtl.g:2565:5: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_46); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTupleTypeCSAccess().getNameTupleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTupleTypeCSRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Tuple");
            				

            }


            }

            // InternalMyAtl.g:2577:3: ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )?
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==50) ) {
                alt52=1;
            }
            else if ( (LA52_0==68) ) {
                alt52=2;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyAtl.g:2578:4: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' )
                    {
                    // InternalMyAtl.g:2578:4: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' )
                    // InternalMyAtl.g:2579:5: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_30); 

                    					newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalMyAtl.g:2583:5: ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_SIMPLE_ID) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalMyAtl.g:2584:6: ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )*
                            {
                            // InternalMyAtl.g:2584:6: ( (lv_ownedParts_2_0= ruletuplePartCS ) )
                            // InternalMyAtl.g:2585:7: (lv_ownedParts_2_0= ruletuplePartCS )
                            {
                            // InternalMyAtl.g:2585:7: (lv_ownedParts_2_0= ruletuplePartCS )
                            // InternalMyAtl.g:2586:8: lv_ownedParts_2_0= ruletuplePartCS
                            {

                            								newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_0_1_0_0());
                            							
                            pushFollow(FOLLOW_31);
                            lv_ownedParts_2_0=ruletuplePartCS();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            								}
                            								add(
                            									current,
                            									"ownedParts",
                            									lv_ownedParts_2_0,
                            									"org.xtext.example.mydsl.MyAtl.tuplePartCS");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMyAtl.g:2603:6: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==22) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // InternalMyAtl.g:2604:7: otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                            	    							newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_0_1_1_0());
                            	    						
                            	    // InternalMyAtl.g:2608:7: ( (lv_ownedParts_4_0= ruletuplePartCS ) )
                            	    // InternalMyAtl.g:2609:8: (lv_ownedParts_4_0= ruletuplePartCS )
                            	    {
                            	    // InternalMyAtl.g:2609:8: (lv_ownedParts_4_0= ruletuplePartCS )
                            	    // InternalMyAtl.g:2610:9: lv_ownedParts_4_0= ruletuplePartCS
                            	    {

                            	    									newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_0_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_31);
                            	    lv_ownedParts_4_0=ruletuplePartCS();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"ownedParts",
                            	    										lv_ownedParts_4_0,
                            	    										"org.xtext.example.mydsl.MyAtl.tuplePartCS");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop48;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,51,FOLLOW_47); 

                    					newLeafNode(otherlv_5, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:2635:4: (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' )
                    {
                    // InternalMyAtl.g:2635:4: (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' )
                    // InternalMyAtl.g:2636:5: otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>'
                    {
                    otherlv_6=(Token)match(input,68,FOLLOW_48); 

                    					newLeafNode(otherlv_6, grammarAccess.getTupleTypeCSAccess().getLessThanSignKeyword_1_1_0());
                    				
                    // InternalMyAtl.g:2640:5: ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==RULE_SIMPLE_ID) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalMyAtl.g:2641:6: ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )*
                            {
                            // InternalMyAtl.g:2641:6: ( (lv_ownedParts_7_0= ruletuplePartCS ) )
                            // InternalMyAtl.g:2642:7: (lv_ownedParts_7_0= ruletuplePartCS )
                            {
                            // InternalMyAtl.g:2642:7: (lv_ownedParts_7_0= ruletuplePartCS )
                            // InternalMyAtl.g:2643:8: lv_ownedParts_7_0= ruletuplePartCS
                            {

                            								newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_0_0());
                            							
                            pushFollow(FOLLOW_49);
                            lv_ownedParts_7_0=ruletuplePartCS();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            								}
                            								add(
                            									current,
                            									"ownedParts",
                            									lv_ownedParts_7_0,
                            									"org.xtext.example.mydsl.MyAtl.tuplePartCS");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMyAtl.g:2660:6: (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )*
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==22) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // InternalMyAtl.g:2661:7: otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) )
                            	    {
                            	    otherlv_8=(Token)match(input,22,FOLLOW_3); 

                            	    							newLeafNode(otherlv_8, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_1_0());
                            	    						
                            	    // InternalMyAtl.g:2665:7: ( (lv_ownedParts_9_0= ruletuplePartCS ) )
                            	    // InternalMyAtl.g:2666:8: (lv_ownedParts_9_0= ruletuplePartCS )
                            	    {
                            	    // InternalMyAtl.g:2666:8: (lv_ownedParts_9_0= ruletuplePartCS )
                            	    // InternalMyAtl.g:2667:9: lv_ownedParts_9_0= ruletuplePartCS
                            	    {

                            	    									newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_49);
                            	    lv_ownedParts_9_0=ruletuplePartCS();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"ownedParts",
                            	    										lv_ownedParts_9_0,
                            	    										"org.xtext.example.mydsl.MyAtl.tuplePartCS");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop50;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,67,FOLLOW_47); 

                    					newLeafNode(otherlv_10, grammarAccess.getTupleTypeCSAccess().getGreaterThanSignKeyword_1_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalMyAtl.g:2692:3: ( (lv_backtrack_11_0= 'true' ) )
            // InternalMyAtl.g:2693:4: (lv_backtrack_11_0= 'true' )
            {
            // InternalMyAtl.g:2693:4: (lv_backtrack_11_0= 'true' )
            // InternalMyAtl.g:2694:5: lv_backtrack_11_0= 'true'
            {
            lv_backtrack_11_0=(Token)match(input,77,FOLLOW_2); 

            					newLeafNode(lv_backtrack_11_0, grammarAccess.getTupleTypeCSAccess().getBacktrackTrueKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTupleTypeCSRule());
            					}
            					setWithLastConsumed(current, "backtrack", lv_backtrack_11_0, "true");
            				

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
    // $ANTLR end "ruleTupleTypeCS"


    // $ANTLR start "entryRuletuplePartCS"
    // InternalMyAtl.g:2710:1: entryRuletuplePartCS returns [EObject current=null] : iv_ruletuplePartCS= ruletuplePartCS EOF ;
    public final EObject entryRuletuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletuplePartCS = null;


        try {
            // InternalMyAtl.g:2710:52: (iv_ruletuplePartCS= ruletuplePartCS EOF )
            // InternalMyAtl.g:2711:2: iv_ruletuplePartCS= ruletuplePartCS EOF
            {
             newCompositeNode(grammarAccess.getTuplePartCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletuplePartCS=ruletuplePartCS();

            state._fsp--;

             current =iv_ruletuplePartCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletuplePartCS"


    // $ANTLR start "ruletuplePartCS"
    // InternalMyAtl.g:2717:1: ruletuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruletuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2723:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalMyAtl.g:2724:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalMyAtl.g:2724:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalMyAtl.g:2725:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalMyAtl.g:2725:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:2726:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:2726:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:2727:5: lv_name_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:2748:3: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalMyAtl.g:2749:4: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalMyAtl.g:2749:4: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalMyAtl.g:2750:5: lv_ownedType_2_0= ruleTypeExpCS
            {

            					newCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedType_2_0=ruleTypeExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
            					}
            					set(
            						current,
            						"ownedType",
            						lv_ownedType_2_0,
            						"org.xtext.example.mydsl.MyAtl.TypeExpCS");
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
    // $ANTLR end "ruletuplePartCS"


    // $ANTLR start "entryRuleCollectionLiteralPartCS"
    // InternalMyAtl.g:2771:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // InternalMyAtl.g:2771:64: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // InternalMyAtl.g:2772:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
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
    // InternalMyAtl.g:2778:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressionCS_0_0 = null;

        EObject lv_lastExpressionCS_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2784:2: ( ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) )
            // InternalMyAtl.g:2785:2: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtl.g:2785:2: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            // InternalMyAtl.g:2786:3: ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            {
            // InternalMyAtl.g:2786:3: ( (lv_expressionCS_0_0= ruleExpCS ) )
            // InternalMyAtl.g:2787:4: (lv_expressionCS_0_0= ruleExpCS )
            {
            // InternalMyAtl.g:2787:4: (lv_expressionCS_0_0= ruleExpCS )
            // InternalMyAtl.g:2788:5: lv_expressionCS_0_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSExpCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_50);
            lv_expressionCS_0_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
            					}
            					set(
            						current,
            						"expressionCS",
            						lv_expressionCS_0_0,
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:2805:3: (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==78) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyAtl.g:2806:4: otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    {
                    otherlv_1=(Token)match(input,78,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_1_0());
                    			
                    // InternalMyAtl.g:2810:4: ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    // InternalMyAtl.g:2811:5: (lv_lastExpressionCS_2_0= ruleExpCS )
                    {
                    // InternalMyAtl.g:2811:5: (lv_lastExpressionCS_2_0= ruleExpCS )
                    // InternalMyAtl.g:2812:6: lv_lastExpressionCS_2_0= ruleExpCS
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
                    							"org.xtext.example.mydsl.MyAtl.ExpCS");
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
    // InternalMyAtl.g:2834:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // InternalMyAtl.g:2834:62: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // InternalMyAtl.g:2835:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
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
    // InternalMyAtl.g:2841:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
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
            // InternalMyAtl.g:2847:2: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // InternalMyAtl.g:2848:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // InternalMyAtl.g:2848:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt54=6;
            switch ( input.LA(1) ) {
            case RULE_BIG_INT:
                {
                alt54=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt54=2;
                }
                break;
            case 77:
            case 79:
                {
                alt54=3;
                }
                break;
            case 64:
                {
                alt54=4;
                }
                break;
            case 80:
                {
                alt54=5;
                }
                break;
            case 81:
                {
                alt54=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalMyAtl.g:2849:3: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
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
                    // InternalMyAtl.g:2858:3: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
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
                    // InternalMyAtl.g:2867:3: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
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
                    // InternalMyAtl.g:2876:3: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
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
                    // InternalMyAtl.g:2885:3: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
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
                    // InternalMyAtl.g:2894:3: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
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
    // InternalMyAtl.g:2906:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // InternalMyAtl.g:2906:58: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // InternalMyAtl.g:2907:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
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
    // InternalMyAtl.g:2913:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
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
            // InternalMyAtl.g:2919:2: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // InternalMyAtl.g:2920:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // InternalMyAtl.g:2920:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // InternalMyAtl.g:2921:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyAtl.g:2929:3: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // InternalMyAtl.g:2930:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // InternalMyAtl.g:2930:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // InternalMyAtl.g:2931:5: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {

            					newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_ownedParts_2_0=ruleTupleLiteralPartCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            					}
            					add(
            						current,
            						"ownedParts",
            						lv_ownedParts_2_0,
            						"org.xtext.example.mydsl.MyAtl.TupleLiteralPartCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:2948:3: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==22) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalMyAtl.g:2949:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyAtl.g:2953:4: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // InternalMyAtl.g:2954:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // InternalMyAtl.g:2954:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // InternalMyAtl.g:2955:6: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {

            	    						newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_ownedParts_4_0=ruleTupleLiteralPartCS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedParts",
            	    							lv_ownedParts_4_0,
            	    							"org.xtext.example.mydsl.MyAtl.TupleLiteralPartCS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_5=(Token)match(input,44,FOLLOW_2); 

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
    // InternalMyAtl.g:2981:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // InternalMyAtl.g:2981:59: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // InternalMyAtl.g:2982:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
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
    // InternalMyAtl.g:2988:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2994:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // InternalMyAtl.g:2995:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // InternalMyAtl.g:2995:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // InternalMyAtl.g:2996:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // InternalMyAtl.g:2996:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:2997:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:2997:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:2998:5: lv_name_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_51);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:3015:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==21) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyAtl.g:3016:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyAtl.g:3020:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:3021:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:3021:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyAtl.g:3022:6: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_2_0,
                    							"org.xtext.example.mydsl.MyAtl.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,53,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
            		
            // InternalMyAtl.g:3044:3: ( (lv_initExpression_4_0= ruleExpCS ) )
            // InternalMyAtl.g:3045:4: (lv_initExpression_4_0= ruleExpCS )
            {
            // InternalMyAtl.g:3045:4: (lv_initExpression_4_0= ruleExpCS )
            // InternalMyAtl.g:3046:5: lv_initExpression_4_0= ruleExpCS
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
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
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
    // InternalMyAtl.g:3067:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // InternalMyAtl.g:3067:59: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // InternalMyAtl.g:3068:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
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
    // InternalMyAtl.g:3074:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= RULE_BIG_INT ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyAtl.g:3080:2: ( ( (lv_name_0_0= RULE_BIG_INT ) ) )
            // InternalMyAtl.g:3081:2: ( (lv_name_0_0= RULE_BIG_INT ) )
            {
            // InternalMyAtl.g:3081:2: ( (lv_name_0_0= RULE_BIG_INT ) )
            // InternalMyAtl.g:3082:3: (lv_name_0_0= RULE_BIG_INT )
            {
            // InternalMyAtl.g:3082:3: (lv_name_0_0= RULE_BIG_INT )
            // InternalMyAtl.g:3083:4: lv_name_0_0= RULE_BIG_INT
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
            					"org.xtext.example.mydsl.MyAtl.BIG_INT");
            			

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
    // InternalMyAtl.g:3102:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // InternalMyAtl.g:3102:59: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // InternalMyAtl.g:3103:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
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
    // InternalMyAtl.g:3109:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleStringLiteral ) ) ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3115:2: ( ( (lv_name_0_0= ruleStringLiteral ) ) )
            // InternalMyAtl.g:3116:2: ( (lv_name_0_0= ruleStringLiteral ) )
            {
            // InternalMyAtl.g:3116:2: ( (lv_name_0_0= ruleStringLiteral ) )
            // InternalMyAtl.g:3117:3: (lv_name_0_0= ruleStringLiteral )
            {
            // InternalMyAtl.g:3117:3: (lv_name_0_0= ruleStringLiteral )
            // InternalMyAtl.g:3118:4: lv_name_0_0= ruleStringLiteral
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
            					"org.xtext.example.mydsl.MyAtl.StringLiteral");
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
    // InternalMyAtl.g:3138:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // InternalMyAtl.g:3138:60: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // InternalMyAtl.g:3139:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
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
    // InternalMyAtl.g:3145:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyAtl.g:3151:2: ( ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) )
            // InternalMyAtl.g:3152:2: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            {
            // InternalMyAtl.g:3152:2: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==77) ) {
                alt57=1;
            }
            else if ( (LA57_0==79) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyAtl.g:3153:3: ( (lv_name_0_0= 'true' ) )
                    {
                    // InternalMyAtl.g:3153:3: ( (lv_name_0_0= 'true' ) )
                    // InternalMyAtl.g:3154:4: (lv_name_0_0= 'true' )
                    {
                    // InternalMyAtl.g:3154:4: (lv_name_0_0= 'true' )
                    // InternalMyAtl.g:3155:5: lv_name_0_0= 'true'
                    {
                    lv_name_0_0=(Token)match(input,77,FOLLOW_2); 

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
                    // InternalMyAtl.g:3168:3: ( (lv_name_1_0= 'false' ) )
                    {
                    // InternalMyAtl.g:3168:3: ( (lv_name_1_0= 'false' ) )
                    // InternalMyAtl.g:3169:4: (lv_name_1_0= 'false' )
                    {
                    // InternalMyAtl.g:3169:4: (lv_name_1_0= 'false' )
                    // InternalMyAtl.g:3170:5: lv_name_1_0= 'false'
                    {
                    lv_name_1_0=(Token)match(input,79,FOLLOW_2); 

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
    // InternalMyAtl.g:3186:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // InternalMyAtl.g:3186:69: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // InternalMyAtl.g:3187:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
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
    // InternalMyAtl.g:3193:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtl.g:3199:2: ( ( () otherlv_1= '*' ) )
            // InternalMyAtl.g:3200:2: ( () otherlv_1= '*' )
            {
            // InternalMyAtl.g:3200:2: ( () otherlv_1= '*' )
            // InternalMyAtl.g:3201:3: () otherlv_1= '*'
            {
            // InternalMyAtl.g:3201:3: ()
            // InternalMyAtl.g:3202:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_2); 

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
    // InternalMyAtl.g:3216:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // InternalMyAtl.g:3216:60: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // InternalMyAtl.g:3217:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
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
    // InternalMyAtl.g:3223:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtl.g:3229:2: ( ( () otherlv_1= 'invalid' ) )
            // InternalMyAtl.g:3230:2: ( () otherlv_1= 'invalid' )
            {
            // InternalMyAtl.g:3230:2: ( () otherlv_1= 'invalid' )
            // InternalMyAtl.g:3231:3: () otherlv_1= 'invalid'
            {
            // InternalMyAtl.g:3231:3: ()
            // InternalMyAtl.g:3232:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,80,FOLLOW_2); 

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
    // InternalMyAtl.g:3246:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // InternalMyAtl.g:3246:57: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // InternalMyAtl.g:3247:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
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
    // InternalMyAtl.g:3253:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtl.g:3259:2: ( ( () otherlv_1= 'null' ) )
            // InternalMyAtl.g:3260:2: ( () otherlv_1= 'null' )
            {
            // InternalMyAtl.g:3260:2: ( () otherlv_1= 'null' )
            // InternalMyAtl.g:3261:3: () otherlv_1= 'null'
            {
            // InternalMyAtl.g:3261:3: ()
            // InternalMyAtl.g:3262:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_2); 

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


    // $ANTLR start "entryRulePrimitiveTypeCS"
    // InternalMyAtl.g:3276:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // InternalMyAtl.g:3276:56: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // InternalMyAtl.g:3277:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
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
    // InternalMyAtl.g:3283:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3289:2: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // InternalMyAtl.g:3290:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // InternalMyAtl.g:3290:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // InternalMyAtl.g:3291:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // InternalMyAtl.g:3291:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // InternalMyAtl.g:3292:4: lv_name_0_0= rulePrimitiveTypeIdentifier
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
            					"org.xtext.example.mydsl.MyAtl.PrimitiveTypeIdentifier");
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


    // $ANTLR start "entryRuleTypeLiteralCS"
    // InternalMyAtl.g:3312:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // InternalMyAtl.g:3312:54: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // InternalMyAtl.g:3313:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
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
    // InternalMyAtl.g:3319:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_TupleTypeCS_1 = null;

        EObject this_CollectionTypeCS_2 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3325:2: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS ) )
            // InternalMyAtl.g:3326:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS )
            {
            // InternalMyAtl.g:3326:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS )
            int alt58=3;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt58=1;
                }
                break;
            case 27:
                {
                alt58=2;
                }
                break;
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt58=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalMyAtl.g:3327:3: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
                    {

                    			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveTypeCS_0=rulePrimitiveTypeCS();

                    state._fsp--;


                    			current = this_PrimitiveTypeCS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:3336:3: this_TupleTypeCS_1= ruleTupleTypeCS
                    {

                    			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getTupleTypeCSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TupleTypeCS_1=ruleTupleTypeCS();

                    state._fsp--;


                    			current = this_TupleTypeCS_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyAtl.g:3345:3: this_CollectionTypeCS_2= ruleCollectionTypeCS
                    {

                    			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getCollectionTypeCSParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollectionTypeCS_2=ruleCollectionTypeCS();

                    state._fsp--;


                    			current = this_CollectionTypeCS_2;
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
    // $ANTLR end "ruleTypeLiteralCS"


    // $ANTLR start "entryRuleTypeNameExpCS"
    // InternalMyAtl.g:3357:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // InternalMyAtl.g:3357:54: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // InternalMyAtl.g:3358:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
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
    // InternalMyAtl.g:3364:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_namespace_0_0 = null;

        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        AntlrDatatypeRuleToken lv_element_4_0 = null;

        AntlrDatatypeRuleToken lv_element_5_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3370:2: ( ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) )
            // InternalMyAtl.g:3371:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            {
            // InternalMyAtl.g:3371:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_SIMPLE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==EOF||LA60_1==18||LA60_1==22||(LA60_1>=43 && LA60_1<=47)||(LA60_1>=50 && LA60_1<=51)||LA60_1==53||LA60_1==67||LA60_1==83) ) {
                    alt60=2;
                }
                else if ( (LA60_1==82) ) {
                    alt60=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyAtl.g:3372:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    {
                    // InternalMyAtl.g:3372:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    // InternalMyAtl.g:3373:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) )
                    {
                    // InternalMyAtl.g:3373:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* )
                    // InternalMyAtl.g:3374:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    {
                    // InternalMyAtl.g:3374:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) )
                    // InternalMyAtl.g:3375:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    {
                    // InternalMyAtl.g:3375:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    // InternalMyAtl.g:3376:7: lv_namespace_0_0= ruleUnrestrictedName
                    {

                    							newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getNamespaceUnrestrictedNameParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_52);
                    lv_namespace_0_0=ruleUnrestrictedName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                    							}
                    							add(
                    								current,
                    								"namespace",
                    								lv_namespace_0_0,
                    								"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,82,FOLLOW_35); 

                    					newLeafNode(otherlv_1, grammarAccess.getTypeNameExpCSAccess().getColonColonKeyword_0_0_1());
                    				
                    // InternalMyAtl.g:3397:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    loop59:
                    do {
                        int alt59=2;
                        alt59 = dfa59.predict(input);
                        switch (alt59) {
                    	case 1 :
                    	    // InternalMyAtl.g:3398:6: ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::'
                    	    {
                    	    // InternalMyAtl.g:3398:6: ( (lv_namespace_2_0= ruleUnreservedName ) )
                    	    // InternalMyAtl.g:3399:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    {
                    	    // InternalMyAtl.g:3399:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    // InternalMyAtl.g:3400:8: lv_namespace_2_0= ruleUnreservedName
                    	    {

                    	    								newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getNamespaceUnreservedNameParserRuleCall_0_0_2_0_0());
                    	    							
                    	    pushFollow(FOLLOW_52);
                    	    lv_namespace_2_0=ruleUnreservedName();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"namespace",
                    	    									lv_namespace_2_0,
                    	    									"org.xtext.example.mydsl.MyAtl.UnreservedName");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    otherlv_3=(Token)match(input,82,FOLLOW_35); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getTypeNameExpCSAccess().getColonColonKeyword_0_0_2_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }

                    // InternalMyAtl.g:3423:4: ( (lv_element_4_0= ruleUnreservedName ) )
                    // InternalMyAtl.g:3424:5: (lv_element_4_0= ruleUnreservedName )
                    {
                    // InternalMyAtl.g:3424:5: (lv_element_4_0= ruleUnreservedName )
                    // InternalMyAtl.g:3425:6: lv_element_4_0= ruleUnreservedName
                    {

                    						newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getElementUnreservedNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_element_4_0=ruleUnreservedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_4_0,
                    							"org.xtext.example.mydsl.MyAtl.UnreservedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:3444:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    {
                    // InternalMyAtl.g:3444:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    // InternalMyAtl.g:3445:4: (lv_element_5_0= ruleUnrestrictedName )
                    {
                    // InternalMyAtl.g:3445:4: (lv_element_5_0= ruleUnrestrictedName )
                    // InternalMyAtl.g:3446:5: lv_element_5_0= ruleUnrestrictedName
                    {

                    					newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getElementUnrestrictedNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_element_5_0=ruleUnrestrictedName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                    					}
                    					set(
                    						current,
                    						"element",
                    						lv_element_5_0,
                    						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleTypeNameExpCS"


    // $ANTLR start "entryRuleTypeExpCS"
    // InternalMyAtl.g:3467:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // InternalMyAtl.g:3467:50: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // InternalMyAtl.g:3468:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
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
    // InternalMyAtl.g:3474:1: ruleTypeExpCS returns [EObject current=null] : (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3480:2: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) )
            // InternalMyAtl.g:3481:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            {
            // InternalMyAtl.g:3481:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_SIMPLE_ID) ) {
                alt61=1;
            }
            else if ( ((LA61_0>=27 && LA61_0<=40)) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyAtl.g:3482:3: this_TypeNameExpCS_0= ruleTypeNameExpCS
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
                    // InternalMyAtl.g:3491:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
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
    // InternalMyAtl.g:3503:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // InternalMyAtl.g:3503:56: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // InternalMyAtl.g:3504:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
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
    // InternalMyAtl.g:3510:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_init_4_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3516:2: ( ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? ) )
            // InternalMyAtl.g:3517:2: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtl.g:3517:2: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )
            // InternalMyAtl.g:3518:3: ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
            {
            // InternalMyAtl.g:3518:3: ( (lv_name_0_0= ruleNavigatingArgExpCS ) )
            // InternalMyAtl.g:3519:4: (lv_name_0_0= ruleNavigatingArgExpCS )
            {
            // InternalMyAtl.g:3519:4: (lv_name_0_0= ruleNavigatingArgExpCS )
            // InternalMyAtl.g:3520:5: lv_name_0_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_53);
            lv_name_0_0=ruleNavigatingArgExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyAtl.NavigatingArgExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:3537:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==21) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMyAtl.g:3538:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyAtl.g:3542:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:3543:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:3543:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyAtl.g:3544:6: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_2_0,
                    							"org.xtext.example.mydsl.MyAtl.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyAtl.g:3562:3: (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==53) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMyAtl.g:3563:4: otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) )
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalMyAtl.g:3567:4: ( (lv_init_4_0= ruleExpCS ) )
                    // InternalMyAtl.g:3568:5: (lv_init_4_0= ruleExpCS )
                    {
                    // InternalMyAtl.g:3568:5: (lv_init_4_0= ruleExpCS )
                    // InternalMyAtl.g:3569:6: lv_init_4_0= ruleExpCS
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
                    							"org.xtext.example.mydsl.MyAtl.ExpCS");
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
    // InternalMyAtl.g:3591:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // InternalMyAtl.g:3591:59: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // InternalMyAtl.g:3592:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
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
    // InternalMyAtl.g:3598:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // InternalMyAtl.g:3604:2: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyAtl.g:3605:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtl.g:3605:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyAtl.g:3606:3: ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyAtl.g:3606:3: ( (lv_prefix_0_0= '|' ) )
            // InternalMyAtl.g:3607:4: (lv_prefix_0_0= '|' )
            {
            // InternalMyAtl.g:3607:4: (lv_prefix_0_0= '|' )
            // InternalMyAtl.g:3608:5: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,83,FOLLOW_23); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, "|");
            				

            }


            }

            // InternalMyAtl.g:3620:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyAtl.g:3621:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyAtl.g:3621:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyAtl.g:3622:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_53);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyAtl.NavigatingArgExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:3639:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==21) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMyAtl.g:3640:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_35); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyAtl.g:3644:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:3645:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:3645:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyAtl.g:3646:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_3_0,
                    							"org.xtext.example.mydsl.MyAtl.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyAtl.g:3664:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==53) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyAtl.g:3665:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyAtl.g:3669:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyAtl.g:3670:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyAtl.g:3670:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyAtl.g:3671:6: lv_init_5_0= ruleExpCS
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
                    							"org.xtext.example.mydsl.MyAtl.ExpCS");
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
    // InternalMyAtl.g:3693:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // InternalMyAtl.g:3693:61: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // InternalMyAtl.g:3694:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
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
    // InternalMyAtl.g:3700:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // InternalMyAtl.g:3706:2: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyAtl.g:3707:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtl.g:3707:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyAtl.g:3708:3: ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyAtl.g:3708:3: ( (lv_prefix_0_0= ',' ) )
            // InternalMyAtl.g:3709:4: (lv_prefix_0_0= ',' )
            {
            // InternalMyAtl.g:3709:4: (lv_prefix_0_0= ',' )
            // InternalMyAtl.g:3710:5: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,22,FOLLOW_23); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ",");
            				

            }


            }

            // InternalMyAtl.g:3722:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyAtl.g:3723:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyAtl.g:3723:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyAtl.g:3724:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_53);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyAtl.NavigatingArgExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:3741:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==21) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalMyAtl.g:3742:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_35); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyAtl.g:3746:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:3747:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:3747:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyAtl.g:3748:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_3_0,
                    							"org.xtext.example.mydsl.MyAtl.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyAtl.g:3766:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==53) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyAtl.g:3767:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyAtl.g:3771:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyAtl.g:3772:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyAtl.g:3772:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyAtl.g:3773:6: lv_init_5_0= ruleExpCS
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
                    							"org.xtext.example.mydsl.MyAtl.ExpCS");
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
    // InternalMyAtl.g:3795:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // InternalMyAtl.g:3795:60: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // InternalMyAtl.g:3796:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
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
    // InternalMyAtl.g:3802:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // InternalMyAtl.g:3808:2: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyAtl.g:3809:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtl.g:3809:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyAtl.g:3810:3: ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyAtl.g:3810:3: ( (lv_prefix_0_0= ';' ) )
            // InternalMyAtl.g:3811:4: (lv_prefix_0_0= ';' )
            {
            // InternalMyAtl.g:3811:4: (lv_prefix_0_0= ';' )
            // InternalMyAtl.g:3812:5: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,18,FOLLOW_23); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ";");
            				

            }


            }

            // InternalMyAtl.g:3824:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyAtl.g:3825:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyAtl.g:3825:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyAtl.g:3826:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_53);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyAtl.NavigatingArgExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:3843:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==21) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalMyAtl.g:3844:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_35); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyAtl.g:3848:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:3849:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:3849:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyAtl.g:3850:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_3_0,
                    							"org.xtext.example.mydsl.MyAtl.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyAtl.g:3868:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==53) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyAtl.g:3869:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyAtl.g:3873:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyAtl.g:3874:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyAtl.g:3874:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyAtl.g:3875:6: lv_init_5_0= ruleExpCS
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
                    							"org.xtext.example.mydsl.MyAtl.ExpCS");
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
    // InternalMyAtl.g:3897:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // InternalMyAtl.g:3897:59: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // InternalMyAtl.g:3898:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
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
    // InternalMyAtl.g:3904:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3910:2: (this_ExpCS_0= ruleExpCS )
            // InternalMyAtl.g:3911:2: this_ExpCS_0= ruleExpCS
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
    // InternalMyAtl.g:3922:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // InternalMyAtl.g:3922:48: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // InternalMyAtl.g:3923:2: iv_ruleIfExpCS= ruleIfExpCS EOF
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
    // InternalMyAtl.g:3929:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) ;
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
            // InternalMyAtl.g:3935:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) )
            // InternalMyAtl.g:3936:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            {
            // InternalMyAtl.g:3936:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            // InternalMyAtl.g:3937:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
            		
            // InternalMyAtl.g:3941:3: ( (lv_condition_1_0= ruleExpCS ) )
            // InternalMyAtl.g:3942:4: (lv_condition_1_0= ruleExpCS )
            {
            // InternalMyAtl.g:3942:4: (lv_condition_1_0= ruleExpCS )
            // InternalMyAtl.g:3943:5: lv_condition_1_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getConditionExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_55);
            lv_condition_1_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,85,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
            		
            // InternalMyAtl.g:3964:3: ( (lv_thenExpression_3_0= ruleExpCS ) )
            // InternalMyAtl.g:3965:4: (lv_thenExpression_3_0= ruleExpCS )
            {
            // InternalMyAtl.g:3965:4: (lv_thenExpression_3_0= ruleExpCS )
            // InternalMyAtl.g:3966:5: lv_thenExpression_3_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getThenExpressionExpCSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_56);
            lv_thenExpression_3_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            					}
            					set(
            						current,
            						"thenExpression",
            						lv_thenExpression_3_0,
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,86,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getIfExpCSAccess().getElseKeyword_4());
            		
            // InternalMyAtl.g:3987:3: ( (lv_elseExpression_5_0= ruleExpCS ) )
            // InternalMyAtl.g:3988:4: (lv_elseExpression_5_0= ruleExpCS )
            {
            // InternalMyAtl.g:3988:4: (lv_elseExpression_5_0= ruleExpCS )
            // InternalMyAtl.g:3989:5: lv_elseExpression_5_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getElseExpressionExpCSParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_57);
            lv_elseExpression_5_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            					}
            					set(
            						current,
            						"elseExpression",
            						lv_elseExpression_5_0,
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,87,FOLLOW_2); 

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
    // InternalMyAtl.g:4014:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // InternalMyAtl.g:4014:49: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // InternalMyAtl.g:4015:2: iv_ruleLetExpCS= ruleLetExpCS EOF
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
    // InternalMyAtl.g:4021:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) ;
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
            // InternalMyAtl.g:4027:2: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) )
            // InternalMyAtl.g:4028:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            {
            // InternalMyAtl.g:4028:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            // InternalMyAtl.g:4029:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,88,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
            		
            // InternalMyAtl.g:4033:3: ( (lv_variable_1_0= ruleLetVariableCS ) )
            // InternalMyAtl.g:4034:4: (lv_variable_1_0= ruleLetVariableCS )
            {
            // InternalMyAtl.g:4034:4: (lv_variable_1_0= ruleLetVariableCS )
            // InternalMyAtl.g:4035:5: lv_variable_1_0= ruleLetVariableCS
            {

            					newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_58);
            lv_variable_1_0=ruleLetVariableCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            					}
            					add(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"org.xtext.example.mydsl.MyAtl.LetVariableCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:4052:3: (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==22) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalMyAtl.g:4053:4: otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyAtl.g:4057:4: ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    // InternalMyAtl.g:4058:5: (lv_variable_3_0= ruleLetVariableCS )
            	    {
            	    // InternalMyAtl.g:4058:5: (lv_variable_3_0= ruleLetVariableCS )
            	    // InternalMyAtl.g:4059:6: lv_variable_3_0= ruleLetVariableCS
            	    {

            	    						newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_58);
            	    lv_variable_3_0=ruleLetVariableCS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variable",
            	    							lv_variable_3_0,
            	    							"org.xtext.example.mydsl.MyAtl.LetVariableCS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
            		
            // InternalMyAtl.g:4081:3: ( (lv_in_5_0= ruleExpCS ) )
            // InternalMyAtl.g:4082:4: (lv_in_5_0= ruleExpCS )
            {
            // InternalMyAtl.g:4082:4: (lv_in_5_0= ruleExpCS )
            // InternalMyAtl.g:4083:5: lv_in_5_0= ruleExpCS
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
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
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
    // InternalMyAtl.g:4104:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // InternalMyAtl.g:4104:54: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // InternalMyAtl.g:4105:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
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
    // InternalMyAtl.g:4111:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4117:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // InternalMyAtl.g:4118:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // InternalMyAtl.g:4118:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // InternalMyAtl.g:4119:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // InternalMyAtl.g:4119:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:4120:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:4120:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:4121:5: lv_name_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_51);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:4138:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==21) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalMyAtl.g:4139:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getLetVariableCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyAtl.g:4143:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:4144:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:4144:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyAtl.g:4145:6: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_2_0,
                    							"org.xtext.example.mydsl.MyAtl.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,53,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_2());
            		
            // InternalMyAtl.g:4167:3: ( (lv_initExpression_4_0= ruleExpCS ) )
            // InternalMyAtl.g:4168:4: (lv_initExpression_4_0= ruleExpCS )
            {
            // InternalMyAtl.g:4168:4: (lv_initExpression_4_0= ruleExpCS )
            // InternalMyAtl.g:4169:5: lv_initExpression_4_0= ruleExpCS
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
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
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
    // InternalMyAtl.g:4190:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // InternalMyAtl.g:4190:52: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // InternalMyAtl.g:4191:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
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
    // InternalMyAtl.g:4197:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_source_1_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4203:2: ( (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // InternalMyAtl.g:4204:2: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // InternalMyAtl.g:4204:2: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // InternalMyAtl.g:4205:3: otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyAtl.g:4209:3: ( (lv_source_1_0= ruleExpCS ) )
            // InternalMyAtl.g:4210:4: (lv_source_1_0= ruleExpCS )
            {
            // InternalMyAtl.g:4210:4: (lv_source_1_0= ruleExpCS )
            // InternalMyAtl.g:4211:5: lv_source_1_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getNestedExpCSAccess().getSourceExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_source_1_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNestedExpCSRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_1_0,
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,51,FOLLOW_2); 

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
    // InternalMyAtl.g:4236:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // InternalMyAtl.g:4236:50: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // InternalMyAtl.g:4237:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
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
    // InternalMyAtl.g:4243:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtl.g:4249:2: ( ( () otherlv_1= 'self' ) )
            // InternalMyAtl.g:4250:2: ( () otherlv_1= 'self' )
            {
            // InternalMyAtl.g:4250:2: ( () otherlv_1= 'self' )
            // InternalMyAtl.g:4251:3: () otherlv_1= 'self'
            {
            // InternalMyAtl.g:4251:3: ()
            // InternalMyAtl.g:4252:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelfExpCSAccess().getSelfExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,89,FOLLOW_2); 

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
    // InternalMyAtl.g:4266:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // InternalMyAtl.g:4266:53: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // InternalMyAtl.g:4267:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
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
    // InternalMyAtl.g:4273:1: rulePrimaryExpCS returns [EObject current=null] : (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_LetExpCS_4= ruleLetExpCS | this_IfExpCS_5= ruleIfExpCS | this_NestedExpCS_6= ruleNestedExpCS | this_StringExpCs_7= ruleStringExpCs ) ;
    public final EObject rulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NavigatingExpCS_0 = null;

        EObject this_SelfExpCS_1 = null;

        EObject this_PrimitiveLiteralExpCS_2 = null;

        EObject this_TupleLiteralExpCS_3 = null;

        EObject this_LetExpCS_4 = null;

        EObject this_IfExpCS_5 = null;

        EObject this_NestedExpCS_6 = null;

        EObject this_StringExpCs_7 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4279:2: ( (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_LetExpCS_4= ruleLetExpCS | this_IfExpCS_5= ruleIfExpCS | this_NestedExpCS_6= ruleNestedExpCS | this_StringExpCs_7= ruleStringExpCs ) )
            // InternalMyAtl.g:4280:2: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_LetExpCS_4= ruleLetExpCS | this_IfExpCS_5= ruleIfExpCS | this_NestedExpCS_6= ruleNestedExpCS | this_StringExpCs_7= ruleStringExpCs )
            {
            // InternalMyAtl.g:4280:2: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_LetExpCS_4= ruleLetExpCS | this_IfExpCS_5= ruleIfExpCS | this_NestedExpCS_6= ruleNestedExpCS | this_StringExpCs_7= ruleStringExpCs )
            int alt72=8;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
                {
                alt72=1;
                }
                break;
            case 89:
                {
                alt72=2;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
            case RULE_BIG_INT:
            case 64:
            case 77:
            case 79:
            case 80:
            case 81:
                {
                alt72=3;
                }
                break;
            case 27:
                {
                alt72=4;
                }
                break;
            case 88:
                {
                alt72=5;
                }
                break;
            case 84:
                {
                alt72=6;
                }
                break;
            case 50:
                {
                alt72=7;
                }
                break;
            case 46:
                {
                alt72=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalMyAtl.g:4281:3: this_NavigatingExpCS_0= ruleNavigatingExpCS
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
                    // InternalMyAtl.g:4290:3: this_SelfExpCS_1= ruleSelfExpCS
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
                    // InternalMyAtl.g:4299:3: this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS
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
                    // InternalMyAtl.g:4308:3: this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS
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
                    // InternalMyAtl.g:4317:3: this_LetExpCS_4= ruleLetExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLetExpCSParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetExpCS_4=ruleLetExpCS();

                    state._fsp--;


                    			current = this_LetExpCS_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyAtl.g:4326:3: this_IfExpCS_5= ruleIfExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfExpCS_5=ruleIfExpCS();

                    state._fsp--;


                    			current = this_IfExpCS_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyAtl.g:4335:3: this_NestedExpCS_6= ruleNestedExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_NestedExpCS_6=ruleNestedExpCS();

                    state._fsp--;


                    			current = this_NestedExpCS_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyAtl.g:4344:3: this_StringExpCs_7= ruleStringExpCs
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getStringExpCsParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringExpCs_7=ruleStringExpCs();

                    state._fsp--;


                    			current = this_StringExpCs_7;
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


    // $ANTLR start "entryRuleStringExpCs"
    // InternalMyAtl.g:4356:1: entryRuleStringExpCs returns [EObject current=null] : iv_ruleStringExpCs= ruleStringExpCs EOF ;
    public final EObject entryRuleStringExpCs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpCs = null;


        try {
            // InternalMyAtl.g:4356:52: (iv_ruleStringExpCs= ruleStringExpCs EOF )
            // InternalMyAtl.g:4357:2: iv_ruleStringExpCs= ruleStringExpCs EOF
            {
             newCompositeNode(grammarAccess.getStringExpCsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringExpCs=ruleStringExpCs();

            state._fsp--;

             current =iv_ruleStringExpCs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringExpCs"


    // $ANTLR start "ruleStringExpCs"
    // InternalMyAtl.g:4363:1: ruleStringExpCs returns [EObject current=null] : ( (lv_name_0_0= '...' ) ) ;
    public final EObject ruleStringExpCs() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyAtl.g:4369:2: ( ( (lv_name_0_0= '...' ) ) )
            // InternalMyAtl.g:4370:2: ( (lv_name_0_0= '...' ) )
            {
            // InternalMyAtl.g:4370:2: ( (lv_name_0_0= '...' ) )
            // InternalMyAtl.g:4371:3: (lv_name_0_0= '...' )
            {
            // InternalMyAtl.g:4371:3: (lv_name_0_0= '...' )
            // InternalMyAtl.g:4372:4: lv_name_0_0= '...'
            {
            lv_name_0_0=(Token)match(input,46,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStringExpCsAccess().getNameFullStopFullStopFullStopKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringExpCsRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "...");
            			

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
    // $ANTLR end "ruleStringExpCs"


    // $ANTLR start "entryRuleNameExpCS"
    // InternalMyAtl.g:4387:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // InternalMyAtl.g:4387:50: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // InternalMyAtl.g:4388:2: iv_ruleNameExpCS= ruleNameExpCS EOF
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
    // InternalMyAtl.g:4394:1: ruleNameExpCS returns [EObject current=null] : ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) ;
    public final EObject ruleNameExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_namespace_0_0 = null;

        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        AntlrDatatypeRuleToken lv_element_4_0 = null;

        AntlrDatatypeRuleToken lv_element_5_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4400:2: ( ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) )
            // InternalMyAtl.g:4401:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            {
            // InternalMyAtl.g:4401:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_SIMPLE_ID) ) {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==EOF||LA74_1==RULE_SIMPLE_ID||LA74_1==18||(LA74_1>=21 && LA74_1<=25)||LA74_1==44||(LA74_1>=50 && LA74_1<=51)||LA74_1==53||LA74_1==58||LA74_1==60||LA74_1==62||(LA74_1>=64 && LA74_1<=76)||LA74_1==78||LA74_1==83||(LA74_1>=85 && LA74_1<=87)||(LA74_1>=90 && LA74_1<=91)) ) {
                    alt74=2;
                }
                else if ( (LA74_1==82) ) {
                    alt74=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalMyAtl.g:4402:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    {
                    // InternalMyAtl.g:4402:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    // InternalMyAtl.g:4403:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) )
                    {
                    // InternalMyAtl.g:4403:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* )
                    // InternalMyAtl.g:4404:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    {
                    // InternalMyAtl.g:4404:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) )
                    // InternalMyAtl.g:4405:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    {
                    // InternalMyAtl.g:4405:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    // InternalMyAtl.g:4406:7: lv_namespace_0_0= ruleUnrestrictedName
                    {

                    							newCompositeNode(grammarAccess.getNameExpCSAccess().getNamespaceUnrestrictedNameParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_52);
                    lv_namespace_0_0=ruleUnrestrictedName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                    							}
                    							add(
                    								current,
                    								"namespace",
                    								lv_namespace_0_0,
                    								"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,82,FOLLOW_35); 

                    					newLeafNode(otherlv_1, grammarAccess.getNameExpCSAccess().getColonColonKeyword_0_0_1());
                    				
                    // InternalMyAtl.g:4427:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    loop73:
                    do {
                        int alt73=2;
                        alt73 = dfa73.predict(input);
                        switch (alt73) {
                    	case 1 :
                    	    // InternalMyAtl.g:4428:6: ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::'
                    	    {
                    	    // InternalMyAtl.g:4428:6: ( (lv_namespace_2_0= ruleUnreservedName ) )
                    	    // InternalMyAtl.g:4429:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    {
                    	    // InternalMyAtl.g:4429:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    // InternalMyAtl.g:4430:8: lv_namespace_2_0= ruleUnreservedName
                    	    {

                    	    								newCompositeNode(grammarAccess.getNameExpCSAccess().getNamespaceUnreservedNameParserRuleCall_0_0_2_0_0());
                    	    							
                    	    pushFollow(FOLLOW_52);
                    	    lv_namespace_2_0=ruleUnreservedName();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"namespace",
                    	    									lv_namespace_2_0,
                    	    									"org.xtext.example.mydsl.MyAtl.UnreservedName");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    otherlv_3=(Token)match(input,82,FOLLOW_35); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getNameExpCSAccess().getColonColonKeyword_0_0_2_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }

                    // InternalMyAtl.g:4453:4: ( (lv_element_4_0= ruleUnreservedName ) )
                    // InternalMyAtl.g:4454:5: (lv_element_4_0= ruleUnreservedName )
                    {
                    // InternalMyAtl.g:4454:5: (lv_element_4_0= ruleUnreservedName )
                    // InternalMyAtl.g:4455:6: lv_element_4_0= ruleUnreservedName
                    {

                    						newCompositeNode(grammarAccess.getNameExpCSAccess().getElementUnreservedNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_element_4_0=ruleUnreservedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_4_0,
                    							"org.xtext.example.mydsl.MyAtl.UnreservedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:4474:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    {
                    // InternalMyAtl.g:4474:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    // InternalMyAtl.g:4475:4: (lv_element_5_0= ruleUnrestrictedName )
                    {
                    // InternalMyAtl.g:4475:4: (lv_element_5_0= ruleUnrestrictedName )
                    // InternalMyAtl.g:4476:5: lv_element_5_0= ruleUnrestrictedName
                    {

                    					newCompositeNode(grammarAccess.getNameExpCSAccess().getElementUnrestrictedNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_element_5_0=ruleUnrestrictedName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                    					}
                    					set(
                    						current,
                    						"element",
                    						lv_element_5_0,
                    						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleNameExpCS"


    // $ANTLR start "entryRuleExpCS"
    // InternalMyAtl.g:4497:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // InternalMyAtl.g:4497:46: (iv_ruleExpCS= ruleExpCS EOF )
            // InternalMyAtl.g:4498:2: iv_ruleExpCS= ruleExpCS EOF
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
    // InternalMyAtl.g:4504:1: ruleExpCS returns [EObject current=null] : this_InfixedExpCS_0= ruleInfixedExpCS ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixedExpCS_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4510:2: (this_InfixedExpCS_0= ruleInfixedExpCS )
            // InternalMyAtl.g:4511:2: this_InfixedExpCS_0= ruleInfixedExpCS
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
    // InternalMyAtl.g:4522:1: entryRuleInfixedExpCS returns [EObject current=null] : iv_ruleInfixedExpCS= ruleInfixedExpCS EOF ;
    public final EObject entryRuleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixedExpCS = null;


        try {
            // InternalMyAtl.g:4522:53: (iv_ruleInfixedExpCS= ruleInfixedExpCS EOF )
            // InternalMyAtl.g:4523:2: iv_ruleInfixedExpCS= ruleInfixedExpCS EOF
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
    // InternalMyAtl.g:4529:1: ruleInfixedExpCS returns [EObject current=null] : (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) ;
    public final EObject ruleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4535:2: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) )
            // InternalMyAtl.g:4536:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            {
            // InternalMyAtl.g:4536:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            // InternalMyAtl.g:4537:3: this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getInfixedExpCSAccess().getPrefixedExpCSParserRuleCall_0());
            		
            pushFollow(FOLLOW_59);
            this_PrefixedExpCS_0=rulePrefixedExpCS();

            state._fsp--;


            			current = this_PrefixedExpCS_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyAtl.g:4545:3: ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // InternalMyAtl.g:4546:4: () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    {
                    // InternalMyAtl.g:4546:4: ()
                    // InternalMyAtl.g:4547:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMyAtl.g:4553:4: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=2;
                        alt75 = dfa75.predict(input);
                        switch (alt75) {
                    	case 1 :
                    	    // InternalMyAtl.g:4554:5: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    {
                    	    // InternalMyAtl.g:4554:5: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) )
                    	    // InternalMyAtl.g:4555:6: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    {
                    	    // InternalMyAtl.g:4555:6: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    // InternalMyAtl.g:4556:7: lv_ownedOperator_2_0= ruleBinaryOperatorCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_ownedOperator_2_0=ruleBinaryOperatorCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInfixedExpCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedOperator",
                    	    								lv_ownedOperator_2_0,
                    	    								"org.xtext.example.mydsl.MyAtl.BinaryOperatorCS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalMyAtl.g:4573:5: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    // InternalMyAtl.g:4574:6: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    {
                    	    // InternalMyAtl.g:4574:6: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    // InternalMyAtl.g:4575:7: lv_ownedExpression_3_0= rulePrefixedExpCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_59);
                    	    lv_ownedExpression_3_0=rulePrefixedExpCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInfixedExpCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedExpression",
                    	    								lv_ownedExpression_3_0,
                    	    								"org.xtext.example.mydsl.MyAtl.PrefixedExpCS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt75 >= 1 ) break loop75;
                                EarlyExitException eee =
                                    new EarlyExitException(75, input);
                                throw eee;
                        }
                        cnt75++;
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
    // InternalMyAtl.g:4598:1: entryRuleBinaryOperatorCS returns [EObject current=null] : iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF ;
    public final EObject entryRuleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperatorCS = null;


        try {
            // InternalMyAtl.g:4598:57: (iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF )
            // InternalMyAtl.g:4599:2: iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF
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
    // InternalMyAtl.g:4605:1: ruleBinaryOperatorCS returns [EObject current=null] : (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) ;
    public final EObject ruleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixOperatorCS_0 = null;

        EObject this_NavigationOperatorCS_1 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4611:2: ( (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) )
            // InternalMyAtl.g:4612:2: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            {
            // InternalMyAtl.g:4612:2: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==53||LA77_0==62||(LA77_0>=64 && LA77_0<=75)) ) {
                alt77=1;
            }
            else if ( (LA77_0==60||LA77_0==76) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalMyAtl.g:4613:3: this_InfixOperatorCS_0= ruleInfixOperatorCS
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
                    // InternalMyAtl.g:4622:3: this_NavigationOperatorCS_1= ruleNavigationOperatorCS
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
    // InternalMyAtl.g:4634:1: entryRuleInfixOperatorCS returns [EObject current=null] : iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF ;
    public final EObject entryRuleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOperatorCS = null;


        try {
            // InternalMyAtl.g:4634:56: (iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF )
            // InternalMyAtl.g:4635:2: iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF
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
    // InternalMyAtl.g:4641:1: ruleInfixOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleInfixOperator ) ) ;
    public final EObject ruleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4647:2: ( ( (lv_name_0_0= ruleInfixOperator ) ) )
            // InternalMyAtl.g:4648:2: ( (lv_name_0_0= ruleInfixOperator ) )
            {
            // InternalMyAtl.g:4648:2: ( (lv_name_0_0= ruleInfixOperator ) )
            // InternalMyAtl.g:4649:3: (lv_name_0_0= ruleInfixOperator )
            {
            // InternalMyAtl.g:4649:3: (lv_name_0_0= ruleInfixOperator )
            // InternalMyAtl.g:4650:4: lv_name_0_0= ruleInfixOperator
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
            					"org.xtext.example.mydsl.MyAtl.InfixOperator");
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
    // InternalMyAtl.g:4670:1: entryRuleNavigationOperatorCS returns [EObject current=null] : iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF ;
    public final EObject entryRuleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationOperatorCS = null;


        try {
            // InternalMyAtl.g:4670:61: (iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF )
            // InternalMyAtl.g:4671:2: iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF
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
    // InternalMyAtl.g:4677:1: ruleNavigationOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleNavigationOperator ) ) ;
    public final EObject ruleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4683:2: ( ( (lv_name_0_0= ruleNavigationOperator ) ) )
            // InternalMyAtl.g:4684:2: ( (lv_name_0_0= ruleNavigationOperator ) )
            {
            // InternalMyAtl.g:4684:2: ( (lv_name_0_0= ruleNavigationOperator ) )
            // InternalMyAtl.g:4685:3: (lv_name_0_0= ruleNavigationOperator )
            {
            // InternalMyAtl.g:4685:3: (lv_name_0_0= ruleNavigationOperator )
            // InternalMyAtl.g:4686:4: lv_name_0_0= ruleNavigationOperator
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
            					"org.xtext.example.mydsl.MyAtl.NavigationOperator");
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
    // InternalMyAtl.g:4706:1: entryRulePrefixedExpCS returns [EObject current=null] : iv_rulePrefixedExpCS= rulePrefixedExpCS EOF ;
    public final EObject entryRulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedExpCS = null;


        try {
            // InternalMyAtl.g:4706:54: (iv_rulePrefixedExpCS= rulePrefixedExpCS EOF )
            // InternalMyAtl.g:4707:2: iv_rulePrefixedExpCS= rulePrefixedExpCS EOF
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
    // InternalMyAtl.g:4713:1: rulePrefixedExpCS returns [EObject current=null] : (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) ;
    public final EObject rulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4719:2: ( (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) )
            // InternalMyAtl.g:4720:2: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            {
            // InternalMyAtl.g:4720:2: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=RULE_SIMPLE_ID && LA79_0<=RULE_BIG_INT)||LA79_0==27||LA79_0==46||LA79_0==50||LA79_0==64||LA79_0==77||(LA79_0>=79 && LA79_0<=81)||LA79_0==84||(LA79_0>=88 && LA79_0<=89)) ) {
                alt79=1;
            }
            else if ( ((LA79_0>=62 && LA79_0<=63)) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalMyAtl.g:4721:3: this_PrimaryExpCS_0= rulePrimaryExpCS
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
                    // InternalMyAtl.g:4730:3: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    {
                    // InternalMyAtl.g:4730:3: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    // InternalMyAtl.g:4731:4: () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    {
                    // InternalMyAtl.g:4731:4: ()
                    // InternalMyAtl.g:4732:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrefixedExpCSAccess().getPrefixExpCSAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMyAtl.g:4738:4: ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+
                    int cnt78=0;
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( ((LA78_0>=62 && LA78_0<=63)) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalMyAtl.g:4739:5: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    {
                    	    // InternalMyAtl.g:4739:5: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    // InternalMyAtl.g:4740:6: lv_ownedOperator_2_0= ruleUnaryOperatorCS
                    	    {

                    	    						newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_23);
                    	    lv_ownedOperator_2_0=ruleUnaryOperatorCS();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPrefixedExpCSRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ownedOperator",
                    	    							lv_ownedOperator_2_0,
                    	    							"org.xtext.example.mydsl.MyAtl.UnaryOperatorCS");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt78 >= 1 ) break loop78;
                                EarlyExitException eee =
                                    new EarlyExitException(78, input);
                                throw eee;
                        }
                        cnt78++;
                    } while (true);

                    // InternalMyAtl.g:4757:4: ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    // InternalMyAtl.g:4758:5: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    {
                    // InternalMyAtl.g:4758:5: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    // InternalMyAtl.g:4759:6: lv_ownedExpression_3_0= rulePrimaryExpCS
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
                    							"org.xtext.example.mydsl.MyAtl.PrimaryExpCS");
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
    // InternalMyAtl.g:4781:1: entryRuleUnaryOperatorCS returns [EObject current=null] : iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF ;
    public final EObject entryRuleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperatorCS = null;


        try {
            // InternalMyAtl.g:4781:56: (iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF )
            // InternalMyAtl.g:4782:2: iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF
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
    // InternalMyAtl.g:4788:1: ruleUnaryOperatorCS returns [EObject current=null] : ( (lv_name_0_0= rulePrefixOperator ) ) ;
    public final EObject ruleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4794:2: ( ( (lv_name_0_0= rulePrefixOperator ) ) )
            // InternalMyAtl.g:4795:2: ( (lv_name_0_0= rulePrefixOperator ) )
            {
            // InternalMyAtl.g:4795:2: ( (lv_name_0_0= rulePrefixOperator ) )
            // InternalMyAtl.g:4796:3: (lv_name_0_0= rulePrefixOperator )
            {
            // InternalMyAtl.g:4796:3: (lv_name_0_0= rulePrefixOperator )
            // InternalMyAtl.g:4797:4: lv_name_0_0= rulePrefixOperator
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
            					"org.xtext.example.mydsl.MyAtl.PrefixOperator");
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
    // InternalMyAtl.g:4817:1: entryRuleIndexExpCS returns [EObject current=null] : iv_ruleIndexExpCS= ruleIndexExpCS EOF ;
    public final EObject entryRuleIndexExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexExpCS = null;


        try {
            // InternalMyAtl.g:4817:51: (iv_ruleIndexExpCS= ruleIndexExpCS EOF )
            // InternalMyAtl.g:4818:2: iv_ruleIndexExpCS= ruleIndexExpCS EOF
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
    // InternalMyAtl.g:4824:1: ruleIndexExpCS returns [EObject current=null] : (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? ) ;
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
            // InternalMyAtl.g:4830:2: ( (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? ) )
            // InternalMyAtl.g:4831:2: (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? )
            {
            // InternalMyAtl.g:4831:2: (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? )
            // InternalMyAtl.g:4832:3: this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )?
            {

            			newCompositeNode(grammarAccess.getIndexExpCSAccess().getNameExpCSParserRuleCall_0());
            		
            pushFollow(FOLLOW_60);
            this_NameExpCS_0=ruleNameExpCS();

            state._fsp--;


            			current = this_NameExpCS_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyAtl.g:4840:3: ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==90) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalMyAtl.g:4841:4: () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )?
                    {
                    // InternalMyAtl.g:4841:4: ()
                    // InternalMyAtl.g:4842:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getIndexExpCSAccess().getIndexExpCSNamedExpAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,90,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    // InternalMyAtl.g:4852:4: ( (lv_firstIndexes_3_0= ruleExpCS ) )
                    // InternalMyAtl.g:4853:5: (lv_firstIndexes_3_0= ruleExpCS )
                    {
                    // InternalMyAtl.g:4853:5: (lv_firstIndexes_3_0= ruleExpCS )
                    // InternalMyAtl.g:4854:6: lv_firstIndexes_3_0= ruleExpCS
                    {

                    						newCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_firstIndexes_3_0=ruleExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
                    						}
                    						add(
                    							current,
                    							"firstIndexes",
                    							lv_firstIndexes_3_0,
                    							"org.xtext.example.mydsl.MyAtl.ExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyAtl.g:4871:4: (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==22) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalMyAtl.g:4872:5: otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_23); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalMyAtl.g:4876:5: ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    // InternalMyAtl.g:4877:6: (lv_firstIndexes_5_0= ruleExpCS )
                    	    {
                    	    // InternalMyAtl.g:4877:6: (lv_firstIndexes_5_0= ruleExpCS )
                    	    // InternalMyAtl.g:4878:7: lv_firstIndexes_5_0= ruleExpCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_61);
                    	    lv_firstIndexes_5_0=ruleExpCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"firstIndexes",
                    	    								lv_firstIndexes_5_0,
                    	    								"org.xtext.example.mydsl.MyAtl.ExpCS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,91,FOLLOW_60); 

                    				newLeafNode(otherlv_6, grammarAccess.getIndexExpCSAccess().getRightSquareBracketKeyword_1_4());
                    			
                    // InternalMyAtl.g:4900:4: (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==90) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalMyAtl.g:4901:5: otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']'
                            {
                            otherlv_7=(Token)match(input,90,FOLLOW_23); 

                            					newLeafNode(otherlv_7, grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_5_0());
                            				
                            // InternalMyAtl.g:4905:5: ( (lv_secondIndexes_8_0= ruleExpCS ) )
                            // InternalMyAtl.g:4906:6: (lv_secondIndexes_8_0= ruleExpCS )
                            {
                            // InternalMyAtl.g:4906:6: (lv_secondIndexes_8_0= ruleExpCS )
                            // InternalMyAtl.g:4907:7: lv_secondIndexes_8_0= ruleExpCS
                            {

                            							newCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_1_0());
                            						
                            pushFollow(FOLLOW_61);
                            lv_secondIndexes_8_0=ruleExpCS();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
                            							}
                            							add(
                            								current,
                            								"secondIndexes",
                            								lv_secondIndexes_8_0,
                            								"org.xtext.example.mydsl.MyAtl.ExpCS");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyAtl.g:4924:5: (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )*
                            loop81:
                            do {
                                int alt81=2;
                                int LA81_0 = input.LA(1);

                                if ( (LA81_0==22) ) {
                                    alt81=1;
                                }


                                switch (alt81) {
                            	case 1 :
                            	    // InternalMyAtl.g:4925:6: otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    {
                            	    otherlv_9=(Token)match(input,22,FOLLOW_23); 

                            	    						newLeafNode(otherlv_9, grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_5_2_0());
                            	    					
                            	    // InternalMyAtl.g:4929:6: ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    // InternalMyAtl.g:4930:7: (lv_secondIndexes_10_0= ruleExpCS )
                            	    {
                            	    // InternalMyAtl.g:4930:7: (lv_secondIndexes_10_0= ruleExpCS )
                            	    // InternalMyAtl.g:4931:8: lv_secondIndexes_10_0= ruleExpCS
                            	    {

                            	    								newCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_61);
                            	    lv_secondIndexes_10_0=ruleExpCS();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"secondIndexes",
                            	    									lv_secondIndexes_10_0,
                            	    									"org.xtext.example.mydsl.MyAtl.ExpCS");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop81;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,91,FOLLOW_2); 

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
    // InternalMyAtl.g:4959:1: entryRuleNavigatingExpCS_Base returns [EObject current=null] : iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF ;
    public final EObject entryRuleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS_Base = null;


        try {
            // InternalMyAtl.g:4959:61: (iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF )
            // InternalMyAtl.g:4960:2: iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF
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
    // InternalMyAtl.g:4966:1: ruleNavigatingExpCS_Base returns [EObject current=null] : this_IndexExpCS_0= ruleIndexExpCS ;
    public final EObject ruleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject this_IndexExpCS_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4972:2: (this_IndexExpCS_0= ruleIndexExpCS )
            // InternalMyAtl.g:4973:2: this_IndexExpCS_0= ruleIndexExpCS
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
    // InternalMyAtl.g:4984:1: entryRuleNavigatingExpCS returns [EObject current=null] : iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF ;
    public final EObject entryRuleNavigatingExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS = null;


        try {
            // InternalMyAtl.g:4984:56: (iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF )
            // InternalMyAtl.g:4985:2: iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF
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
    // InternalMyAtl.g:4991:1: ruleNavigatingExpCS returns [EObject current=null] : (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? ) ;
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
            // InternalMyAtl.g:4997:2: ( (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? ) )
            // InternalMyAtl.g:4998:2: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? )
            {
            // InternalMyAtl.g:4998:2: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? )
            // InternalMyAtl.g:4999:3: this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )?
            {

            			newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCS_BaseParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_NavigatingExpCS_Base_0=ruleNavigatingExpCS_Base();

            state._fsp--;


            			current = this_NavigatingExpCS_Base_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyAtl.g:5007:3: ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==50) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalMyAtl.g:5008:4: () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')'
                    {
                    // InternalMyAtl.g:5008:4: ()
                    // InternalMyAtl.g:5009:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCSNamedExpAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,50,FOLLOW_37); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingExpCSAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalMyAtl.g:5019:4: ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( ((LA89_0>=RULE_SIMPLE_ID && LA89_0<=RULE_BIG_INT)||LA89_0==27||LA89_0==46||LA89_0==50||(LA89_0>=62 && LA89_0<=64)||LA89_0==77||(LA89_0>=79 && LA89_0<=81)||LA89_0==84||(LA89_0>=88 && LA89_0<=89)) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalMyAtl.g:5020:5: ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )?
                            {
                            // InternalMyAtl.g:5020:5: ( (lv_argument_3_0= ruleNavigatingArgCS ) )
                            // InternalMyAtl.g:5021:6: (lv_argument_3_0= ruleNavigatingArgCS )
                            {
                            // InternalMyAtl.g:5021:6: (lv_argument_3_0= ruleNavigatingArgCS )
                            // InternalMyAtl.g:5022:7: lv_argument_3_0= ruleNavigatingArgCS
                            {

                            							newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingArgCSParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_62);
                            lv_argument_3_0=ruleNavigatingArgCS();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                            							}
                            							add(
                            								current,
                            								"argument",
                            								lv_argument_3_0,
                            								"org.xtext.example.mydsl.MyAtl.NavigatingArgCS");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyAtl.g:5039:5: ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )*
                            loop84:
                            do {
                                int alt84=2;
                                int LA84_0 = input.LA(1);

                                if ( (LA84_0==22) ) {
                                    alt84=1;
                                }


                                switch (alt84) {
                            	case 1 :
                            	    // InternalMyAtl.g:5040:6: (lv_argument_4_0= ruleNavigatingCommaArgCS )
                            	    {
                            	    // InternalMyAtl.g:5040:6: (lv_argument_4_0= ruleNavigatingCommaArgCS )
                            	    // InternalMyAtl.g:5041:7: lv_argument_4_0= ruleNavigatingCommaArgCS
                            	    {

                            	    							newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_62);
                            	    lv_argument_4_0=ruleNavigatingCommaArgCS();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"argument",
                            	    								lv_argument_4_0,
                            	    								"org.xtext.example.mydsl.MyAtl.NavigatingCommaArgCS");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop84;
                                }
                            } while (true);

                            // InternalMyAtl.g:5058:5: ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )?
                            int alt86=2;
                            int LA86_0 = input.LA(1);

                            if ( (LA86_0==18) ) {
                                alt86=1;
                            }
                            switch (alt86) {
                                case 1 :
                                    // InternalMyAtl.g:5059:6: ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )*
                                    {
                                    // InternalMyAtl.g:5059:6: ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) )
                                    // InternalMyAtl.g:5060:7: (lv_argument_5_0= ruleNavigatingSemiArgCS )
                                    {
                                    // InternalMyAtl.g:5060:7: (lv_argument_5_0= ruleNavigatingSemiArgCS )
                                    // InternalMyAtl.g:5061:8: lv_argument_5_0= ruleNavigatingSemiArgCS
                                    {

                                    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingSemiArgCSParserRuleCall_1_2_2_0_0());
                                    							
                                    pushFollow(FOLLOW_63);
                                    lv_argument_5_0=ruleNavigatingSemiArgCS();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    								}
                                    								add(
                                    									current,
                                    									"argument",
                                    									lv_argument_5_0,
                                    									"org.xtext.example.mydsl.MyAtl.NavigatingSemiArgCS");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    // InternalMyAtl.g:5078:6: ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )*
                                    loop85:
                                    do {
                                        int alt85=2;
                                        int LA85_0 = input.LA(1);

                                        if ( (LA85_0==22) ) {
                                            alt85=1;
                                        }


                                        switch (alt85) {
                                    	case 1 :
                                    	    // InternalMyAtl.g:5079:7: (lv_argument_6_0= ruleNavigatingCommaArgCS )
                                    	    {
                                    	    // InternalMyAtl.g:5079:7: (lv_argument_6_0= ruleNavigatingCommaArgCS )
                                    	    // InternalMyAtl.g:5080:8: lv_argument_6_0= ruleNavigatingCommaArgCS
                                    	    {

                                    	    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_2_1_0());
                                    	    							
                                    	    pushFollow(FOLLOW_63);
                                    	    lv_argument_6_0=ruleNavigatingCommaArgCS();

                                    	    state._fsp--;


                                    	    								if (current==null) {
                                    	    									current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    	    								}
                                    	    								add(
                                    	    									current,
                                    	    									"argument",
                                    	    									lv_argument_6_0,
                                    	    									"org.xtext.example.mydsl.MyAtl.NavigatingCommaArgCS");
                                    	    								afterParserOrEnumRuleCall();
                                    	    							

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop85;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            // InternalMyAtl.g:5098:5: ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )?
                            int alt88=2;
                            int LA88_0 = input.LA(1);

                            if ( (LA88_0==83) ) {
                                alt88=1;
                            }
                            switch (alt88) {
                                case 1 :
                                    // InternalMyAtl.g:5099:6: ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )*
                                    {
                                    // InternalMyAtl.g:5099:6: ( (lv_argument_7_0= ruleNavigatingBarArgCS ) )
                                    // InternalMyAtl.g:5100:7: (lv_argument_7_0= ruleNavigatingBarArgCS )
                                    {
                                    // InternalMyAtl.g:5100:7: (lv_argument_7_0= ruleNavigatingBarArgCS )
                                    // InternalMyAtl.g:5101:8: lv_argument_7_0= ruleNavigatingBarArgCS
                                    {

                                    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingBarArgCSParserRuleCall_1_2_3_0_0());
                                    							
                                    pushFollow(FOLLOW_31);
                                    lv_argument_7_0=ruleNavigatingBarArgCS();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    								}
                                    								add(
                                    									current,
                                    									"argument",
                                    									lv_argument_7_0,
                                    									"org.xtext.example.mydsl.MyAtl.NavigatingBarArgCS");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    // InternalMyAtl.g:5118:6: ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )*
                                    loop87:
                                    do {
                                        int alt87=2;
                                        int LA87_0 = input.LA(1);

                                        if ( (LA87_0==22) ) {
                                            alt87=1;
                                        }


                                        switch (alt87) {
                                    	case 1 :
                                    	    // InternalMyAtl.g:5119:7: (lv_argument_8_0= ruleNavigatingCommaArgCS )
                                    	    {
                                    	    // InternalMyAtl.g:5119:7: (lv_argument_8_0= ruleNavigatingCommaArgCS )
                                    	    // InternalMyAtl.g:5120:8: lv_argument_8_0= ruleNavigatingCommaArgCS
                                    	    {

                                    	    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_3_1_0());
                                    	    							
                                    	    pushFollow(FOLLOW_31);
                                    	    lv_argument_8_0=ruleNavigatingCommaArgCS();

                                    	    state._fsp--;


                                    	    								if (current==null) {
                                    	    									current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    	    								}
                                    	    								add(
                                    	    									current,
                                    	    									"argument",
                                    	    									lv_argument_8_0,
                                    	    									"org.xtext.example.mydsl.MyAtl.NavigatingCommaArgCS");
                                    	    								afterParserOrEnumRuleCall();
                                    	    							

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop87;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,51,FOLLOW_2); 

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


    protected DFA47 dfa47 = new DFA47(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA75 dfa75 = new DFA75(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\1\3\30\uffff";
    static final String dfa_3s = "\1\22\1\4\2\uffff\1\62\1\52\2\uffff\1\4\17\62\1\4";
    static final String dfa_4s = "\1\123\1\131\2\uffff\1\132\1\115\2\uffff\1\50\17\132\1\50";
    static final String dfa_5s = "\2\uffff\1\2\1\3\2\uffff\2\1\21\uffff";
    static final String dfa_6s = "\31\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\3\uffff\1\3\24\uffff\5\3\2\uffff\1\1\1\3\1\uffff\1\3\15\uffff\1\3\1\2\16\uffff\1\3",
            "\1\4\2\3\24\uffff\1\5\15\6\5\uffff\1\3\3\uffff\2\3\12\uffff\3\3\14\uffff\1\3\1\uffff\3\3\2\uffff\1\3\3\uffff\2\3",
            "",
            "",
            "\1\3\1\7\1\uffff\1\3\5\uffff\2\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\10\7\uffff\1\3",
            "\1\3\7\uffff\1\7\21\uffff\1\7\10\uffff\1\7",
            "",
            "",
            "\1\11\26\uffff\1\27\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\12\1\13\1\14\1\15\1\16",
            "\1\3\1\7\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\7\uffff\1\3",
            "\1\3\1\7\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\7\uffff\1\3",
            "\1\3\1\7\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\7\uffff\1\3",
            "\1\3\1\7\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\7\uffff\1\3",
            "\1\3\1\7\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\7\uffff\1\3",
            "\1\3\1\7\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\7\uffff\1\3",
            "\1\3\1\7\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\7\uffff\1\3",
            "\1\3\1\7\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\7\uffff\1\3",
            "\1\3\1\7\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\7\uffff\1\3",
            "\1\3\1\7\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\7\uffff\1\3",
            "\1\3\1\7\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\7\uffff\1\3",
            "\1\3\1\7\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\7\uffff\1\3",
            "\1\3\1\7\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\7\uffff\1\3",
            "\1\3\1\7\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\7\uffff\1\3",
            "\1\3\1\7\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\7\uffff\1\3",
            "\1\11\26\uffff\1\27\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\12\1\13\1\14\1\15\1\16"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2483:3: ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )?";
        }
    }
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\1\uffff\17\20\2\uffff";
    static final String dfa_10s = "\1\4\17\22\2\uffff";
    static final String dfa_11s = "\1\50\17\123\2\uffff";
    static final String dfa_12s = "\20\uffff\1\2\1\1";
    static final String dfa_13s = "\22\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\26\uffff\1\17\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\2\1\3\1\4\1\5\1\6",
            "\1\20\3\uffff\1\20\24\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\16\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\24\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\16\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\24\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\16\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\24\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\16\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\24\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\16\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\24\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\16\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\24\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\16\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\24\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\16\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\24\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\16\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\24\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\16\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\24\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\16\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\24\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\16\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\24\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\16\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\24\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\16\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\24\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\16\uffff\1\21\1\20",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 3397:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*";
        }
    }
    static final String dfa_15s = "\1\uffff\17\21\2\uffff";
    static final String dfa_16s = "\20\4\2\uffff";
    static final String dfa_17s = "\1\50\17\133\2\uffff";
    static final String dfa_18s = "\20\uffff\1\1\1\2";
    static final String[] dfa_19s = {
            "\1\1\26\uffff\1\17\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\2\1\3\1\4\1\5\1\6",
            "\1\21\15\uffff\1\21\2\uffff\5\21\22\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\2\uffff\2\21",
            "\1\21\15\uffff\1\21\2\uffff\5\21\22\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\2\uffff\2\21",
            "\1\21\15\uffff\1\21\2\uffff\5\21\22\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\2\uffff\2\21",
            "\1\21\15\uffff\1\21\2\uffff\5\21\22\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\2\uffff\2\21",
            "\1\21\15\uffff\1\21\2\uffff\5\21\22\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\2\uffff\2\21",
            "\1\21\15\uffff\1\21\2\uffff\5\21\22\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\2\uffff\2\21",
            "\1\21\15\uffff\1\21\2\uffff\5\21\22\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\2\uffff\2\21",
            "\1\21\15\uffff\1\21\2\uffff\5\21\22\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\2\uffff\2\21",
            "\1\21\15\uffff\1\21\2\uffff\5\21\22\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\2\uffff\2\21",
            "\1\21\15\uffff\1\21\2\uffff\5\21\22\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\2\uffff\2\21",
            "\1\21\15\uffff\1\21\2\uffff\5\21\22\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\2\uffff\2\21",
            "\1\21\15\uffff\1\21\2\uffff\5\21\22\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\2\uffff\2\21",
            "\1\21\15\uffff\1\21\2\uffff\5\21\22\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\2\uffff\2\21",
            "\1\21\15\uffff\1\21\2\uffff\5\21\22\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\2\uffff\2\21",
            "\1\21\15\uffff\1\21\2\uffff\5\21\22\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\2\uffff\2\21",
            "",
            ""
    };
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_8;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_13;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()* loopback of 4427:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*";
        }
    }
    static final String dfa_20s = "\1\21\21\uffff";
    static final String dfa_21s = "\1\22\21\uffff";
    static final String dfa_22s = "\1\133\21\uffff";
    static final String dfa_23s = "\1\uffff\20\1\1\2";
    static final String[] dfa_24s = {
            "\1\21\2\uffff\2\21\1\uffff\1\21\23\uffff\1\21\6\uffff\1\21\1\uffff\1\11\4\uffff\1\21\1\uffff\1\17\1\uffff\1\4\1\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\12\1\13\1\14\1\15\1\16\1\20\1\uffff\1\21\4\uffff\1\21\1\uffff\3\21\3\uffff\1\21",
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
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_8;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_13;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "4545:3: ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?";
        }
    }
    static final String dfa_25s = "\1\1\21\uffff";
    static final String dfa_26s = "\1\uffff\1\2\20\1";
    static final String[] dfa_27s = {
            "\1\1\2\uffff\2\1\1\uffff\1\1\23\uffff\1\1\6\uffff\1\1\1\uffff\1\3\4\uffff\1\1\1\uffff\1\2\1\uffff\1\7\1\uffff\1\4\1\5\1\6\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\uffff\1\1\4\uffff\1\1\1\uffff\3\1\3\uffff\1\1",
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
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = dfa_8;
            this.eof = dfa_25;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_26;
            this.special = dfa_13;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "()+ loopback of 4553:4: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003200010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003600010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0053020004000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0053020000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000D00000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000900000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xC004400008000070L,0x000000000313A001L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0004040000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0024000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000400000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0180000000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000001FFF8000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xC00C400008000070L,0x000000000313A001L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xC004400008000072L,0x000000000313A001L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000000L,0x0000000000002010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000008L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000200000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000200002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x5020000000000002L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000400000L,0x0000000008000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0008000000440000L,0x0000000000080000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0008000000400000L,0x0000000000080000L});

}