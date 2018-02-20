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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SIMPLE_ID", "RULE_SINGLE_QUOTED_STRING", "RULE_BIG_INT", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_DOCUMENTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "RULE_ID", "RULE_INT", "RULE_STRING", "'module'", "';'", "'create'", "'OUT'", "':'", "','", "'from'", "'IN'", "'uses'", "'Tuple'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'rule'", "'{'", "'using'", "'}'", "'to'", "'...'", "'do'", "'entrypoint'", "'endpoint'", "'('", "')'", "'query'", "'='", "'helper'", "'context'", "'def'", "'xxx'", "'yyy'", "'<-'", "'.'", "'!'", "'-'", "'not'", "'*'", "'/'", "'+'", "'>'", "'<'", "'>='", "'<='", "'<>'", "'and'", "'or'", "'xor'", "'implies'", "'->'", "'true'", "'false'", "'invalid'", "'null'", "'::'", "'|'", "'if'", "'then'", "'else'", "'endif'", "'let'", "'in'", "'self'", "'['", "']'"
    };
    public static final int T__50=50;
    public static final int T__90=90;
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
    // InternalMyAtl.g:71:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' otherlv_10= 'IN' otherlv_11= ':' ( (lv_inModels_12_0= ruleNameExpCS ) ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* otherlv_15= ';' (otherlv_16= 'uses' ( (lv_varName_17_0= ruleNameExpCS ) ) otherlv_18= ';' )? ( (lv_elements_19_0= ruleModuleElement ) )* ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_outModels_6_0 = null;

        EObject lv_outModels_8_0 = null;

        EObject lv_inModels_12_0 = null;

        EObject lv_inModels_14_0 = null;

        EObject lv_varName_17_0 = null;

        EObject lv_elements_19_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:77:2: ( (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' otherlv_10= 'IN' otherlv_11= ':' ( (lv_inModels_12_0= ruleNameExpCS ) ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* otherlv_15= ';' (otherlv_16= 'uses' ( (lv_varName_17_0= ruleNameExpCS ) ) otherlv_18= ';' )? ( (lv_elements_19_0= ruleModuleElement ) )* ) )
            // InternalMyAtl.g:78:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' otherlv_10= 'IN' otherlv_11= ':' ( (lv_inModels_12_0= ruleNameExpCS ) ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* otherlv_15= ';' (otherlv_16= 'uses' ( (lv_varName_17_0= ruleNameExpCS ) ) otherlv_18= ';' )? ( (lv_elements_19_0= ruleModuleElement ) )* )
            {
            // InternalMyAtl.g:78:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' otherlv_10= 'IN' otherlv_11= ':' ( (lv_inModels_12_0= ruleNameExpCS ) ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* otherlv_15= ';' (otherlv_16= 'uses' ( (lv_varName_17_0= ruleNameExpCS ) ) otherlv_18= ';' )? ( (lv_elements_19_0= ruleModuleElement ) )* )
            // InternalMyAtl.g:79:3: otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' otherlv_10= 'IN' otherlv_11= ':' ( (lv_inModels_12_0= ruleNameExpCS ) ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* otherlv_15= ';' (otherlv_16= 'uses' ( (lv_varName_17_0= ruleNameExpCS ) ) otherlv_18= ';' )? ( (lv_elements_19_0= ruleModuleElement ) )*
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
            		
            otherlv_10=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getModuleAccess().getINKeyword_9());
            		
            otherlv_11=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getModuleAccess().getColonKeyword_10());
            		
            // InternalMyAtl.g:174:3: ( (lv_inModels_12_0= ruleNameExpCS ) )
            // InternalMyAtl.g:175:4: (lv_inModels_12_0= ruleNameExpCS )
            {
            // InternalMyAtl.g:175:4: (lv_inModels_12_0= ruleNameExpCS )
            // InternalMyAtl.g:176:5: lv_inModels_12_0= ruleNameExpCS
            {

            					newCompositeNode(grammarAccess.getModuleAccess().getInModelsNameExpCSParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_10);
            lv_inModels_12_0=ruleNameExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuleRule());
            					}
            					add(
            						current,
            						"inModels",
            						lv_inModels_12_0,
            						"org.xtext.example.mydsl.MyAtl.NameExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:193:3: (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyAtl.g:194:4: otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) )
            	    {
            	    otherlv_13=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_13, grammarAccess.getModuleAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalMyAtl.g:198:4: ( (lv_inModels_14_0= ruleNameExpCS ) )
            	    // InternalMyAtl.g:199:5: (lv_inModels_14_0= ruleNameExpCS )
            	    {
            	    // InternalMyAtl.g:199:5: (lv_inModels_14_0= ruleNameExpCS )
            	    // InternalMyAtl.g:200:6: lv_inModels_14_0= ruleNameExpCS
            	    {

            	    						newCompositeNode(grammarAccess.getModuleAccess().getInModelsNameExpCSParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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
            	    break loop2;
                }
            } while (true);

            otherlv_15=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getModuleAccess().getSemicolonKeyword_13());
            		
            // InternalMyAtl.g:222:3: (otherlv_16= 'uses' ( (lv_varName_17_0= ruleNameExpCS ) ) otherlv_18= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyAtl.g:223:4: otherlv_16= 'uses' ( (lv_varName_17_0= ruleNameExpCS ) ) otherlv_18= ';'
                    {
                    otherlv_16=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getModuleAccess().getUsesKeyword_14_0());
                    			
                    // InternalMyAtl.g:227:4: ( (lv_varName_17_0= ruleNameExpCS ) )
                    // InternalMyAtl.g:228:5: (lv_varName_17_0= ruleNameExpCS )
                    {
                    // InternalMyAtl.g:228:5: (lv_varName_17_0= ruleNameExpCS )
                    // InternalMyAtl.g:229:6: lv_varName_17_0= ruleNameExpCS
                    {

                    						newCompositeNode(grammarAccess.getModuleAccess().getVarNameNameExpCSParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_varName_17_0=ruleNameExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModuleRule());
                    						}
                    						set(
                    							current,
                    							"varName",
                    							lv_varName_17_0,
                    							"org.xtext.example.mydsl.MyAtl.NameExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_18, grammarAccess.getModuleAccess().getSemicolonKeyword_14_2());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:251:3: ( (lv_elements_19_0= ruleModuleElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==40||(LA4_0>=47 && LA4_0<=48)||LA4_0==51||LA4_0==53) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyAtl.g:252:4: (lv_elements_19_0= ruleModuleElement )
            	    {
            	    // InternalMyAtl.g:252:4: (lv_elements_19_0= ruleModuleElement )
            	    // InternalMyAtl.g:253:5: lv_elements_19_0= ruleModuleElement
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getElementsModuleElementParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_elements_19_0=ruleModuleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_19_0,
            	    						"org.xtext.example.mydsl.MyAtl.ModuleElement");
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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleEssentialOCLUnreservedName"
    // InternalMyAtl.g:274:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // InternalMyAtl.g:274:66: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // InternalMyAtl.g:275:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
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
    // InternalMyAtl.g:281:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:287:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) )
            // InternalMyAtl.g:288:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            {
            // InternalMyAtl.g:288:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
                {
                alt5=1;
                }
                break;
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt5=2;
                }
                break;
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyAtl.g:289:3: this_UnrestrictedName_0= ruleUnrestrictedName
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
                    // InternalMyAtl.g:300:3: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
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
                    // InternalMyAtl.g:311:3: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
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
                    // InternalMyAtl.g:322:3: kw= 'Tuple'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

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
    // InternalMyAtl.g:331:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // InternalMyAtl.g:331:54: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // InternalMyAtl.g:332:2: iv_ruleUnreservedName= ruleUnreservedName EOF
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
    // InternalMyAtl.g:338:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:344:2: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // InternalMyAtl.g:345:2: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
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
    // InternalMyAtl.g:358:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // InternalMyAtl.g:358:63: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // InternalMyAtl.g:359:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
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
    // InternalMyAtl.g:365:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtl.g:371:2: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // InternalMyAtl.g:372:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // InternalMyAtl.g:372:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            case 30:
                {
                alt6=4;
                }
                break;
            case 31:
                {
                alt6=5;
                }
                break;
            case 32:
                {
                alt6=6;
                }
                break;
            case 33:
                {
                alt6=7;
                }
                break;
            case 34:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyAtl.g:373:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:379:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyAtl.g:385:3: kw= 'Real'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyAtl.g:391:3: kw= 'String'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyAtl.g:397:3: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyAtl.g:403:3: kw= 'OclAny'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyAtl.g:409:3: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyAtl.g:415:3: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

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
    // InternalMyAtl.g:424:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // InternalMyAtl.g:424:64: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // InternalMyAtl.g:425:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
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
    // InternalMyAtl.g:431:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtl.g:437:2: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // InternalMyAtl.g:438:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // InternalMyAtl.g:438:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt7=1;
                }
                break;
            case 36:
                {
                alt7=2;
                }
                break;
            case 37:
                {
                alt7=3;
                }
                break;
            case 38:
                {
                alt7=4;
                }
                break;
            case 39:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyAtl.g:439:3: kw= 'Set'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:445:3: kw= 'Bag'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyAtl.g:451:3: kw= 'Sequence'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyAtl.g:457:3: kw= 'Collection'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyAtl.g:463:3: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

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
    // InternalMyAtl.g:472:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // InternalMyAtl.g:472:56: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // InternalMyAtl.g:473:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
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
    // InternalMyAtl.g:479:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:485:2: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // InternalMyAtl.g:486:2: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
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
    // InternalMyAtl.g:499:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // InternalMyAtl.g:499:68: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // InternalMyAtl.g:500:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
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
    // InternalMyAtl.g:506:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SIMPLE_ID_0= RULE_SIMPLE_ID ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;


        	enterRule();

        try {
            // InternalMyAtl.g:512:2: (this_SIMPLE_ID_0= RULE_SIMPLE_ID )
            // InternalMyAtl.g:513:2: this_SIMPLE_ID_0= RULE_SIMPLE_ID
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
    // InternalMyAtl.g:523:1: entryRuleModuleElement returns [EObject current=null] : iv_ruleModuleElement= ruleModuleElement EOF ;
    public final EObject entryRuleModuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleElement = null;


        try {
            // InternalMyAtl.g:523:54: (iv_ruleModuleElement= ruleModuleElement EOF )
            // InternalMyAtl.g:524:2: iv_ruleModuleElement= ruleModuleElement EOF
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
    // InternalMyAtl.g:530:1: ruleModuleElement returns [EObject current=null] : (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule | this_QueryRule_3= ruleQueryRule ) ;
    public final EObject ruleModuleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Helper_0 = null;

        EObject this_MatchedRule_1 = null;

        EObject this_CalledRule_2 = null;

        EObject this_QueryRule_3 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:536:2: ( (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule | this_QueryRule_3= ruleQueryRule ) )
            // InternalMyAtl.g:537:2: (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule | this_QueryRule_3= ruleQueryRule )
            {
            // InternalMyAtl.g:537:2: (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule | this_QueryRule_3= ruleQueryRule )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt8=1;
                }
                break;
            case 40:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_SIMPLE_ID) ) {
                    int LA8_5 = input.LA(3);

                    if ( (LA8_5==49) ) {
                        alt8=3;
                    }
                    else if ( (LA8_5==41) ) {
                        int LA8_6 = input.LA(4);

                        if ( (LA8_6==42||LA8_6==44) ) {
                            alt8=3;
                        }
                        else if ( (LA8_6==23) ) {
                            alt8=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case 47:
            case 48:
                {
                alt8=3;
                }
                break;
            case 51:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyAtl.g:538:3: this_Helper_0= ruleHelper
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
                    // InternalMyAtl.g:547:3: this_MatchedRule_1= ruleMatchedRule
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
                    // InternalMyAtl.g:556:3: this_CalledRule_2= ruleCalledRule
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
                    // InternalMyAtl.g:565:3: this_QueryRule_3= ruleQueryRule
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
    // InternalMyAtl.g:577:1: entryRuleMatchedRule returns [EObject current=null] : iv_ruleMatchedRule= ruleMatchedRule EOF ;
    public final EObject entryRuleMatchedRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchedRule = null;


        try {
            // InternalMyAtl.g:577:52: (iv_ruleMatchedRule= ruleMatchedRule EOF )
            // InternalMyAtl.g:578:2: iv_ruleMatchedRule= ruleMatchedRule EOF
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
    // InternalMyAtl.g:584:1: ruleMatchedRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= '...' )? (otherlv_12= ',' )? (otherlv_13= 'do' otherlv_14= '{' ( (lv_actionBlock_15_0= ruleActionBlock ) ) otherlv_16= '}' )? (otherlv_17= ',' )? otherlv_18= '}' ) ;
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
            // InternalMyAtl.g:590:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= '...' )? (otherlv_12= ',' )? (otherlv_13= 'do' otherlv_14= '{' ( (lv_actionBlock_15_0= ruleActionBlock ) ) otherlv_16= '}' )? (otherlv_17= ',' )? otherlv_18= '}' ) )
            // InternalMyAtl.g:591:2: (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= '...' )? (otherlv_12= ',' )? (otherlv_13= 'do' otherlv_14= '{' ( (lv_actionBlock_15_0= ruleActionBlock ) ) otherlv_16= '}' )? (otherlv_17= ',' )? otherlv_18= '}' )
            {
            // InternalMyAtl.g:591:2: (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= '...' )? (otherlv_12= ',' )? (otherlv_13= 'do' otherlv_14= '{' ( (lv_actionBlock_15_0= ruleActionBlock ) ) otherlv_16= '}' )? (otherlv_17= ',' )? otherlv_18= '}' )
            // InternalMyAtl.g:592:3: otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= '...' )? (otherlv_12= ',' )? (otherlv_13= 'do' otherlv_14= '{' ( (lv_actionBlock_15_0= ruleActionBlock ) ) otherlv_16= '}' )? (otherlv_17= ',' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchedRuleAccess().getRuleKeyword_0());
            		
            // InternalMyAtl.g:596:3: ( (lv_name_1_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:597:4: (lv_name_1_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:597:4: (lv_name_1_0= ruleUnrestrictedName )
            // InternalMyAtl.g:598:5: lv_name_1_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getMatchedRuleAccess().getNameUnrestrictedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,41,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMatchedRuleAccess().getFromKeyword_3());
            		
            // InternalMyAtl.g:623:3: ( (lv_inPattern_4_0= ruleInPattern ) )
            // InternalMyAtl.g:624:4: (lv_inPattern_4_0= ruleInPattern )
            {
            // InternalMyAtl.g:624:4: (lv_inPattern_4_0= ruleInPattern )
            // InternalMyAtl.g:625:5: lv_inPattern_4_0= ruleInPattern
            {

            					newCompositeNode(grammarAccess.getMatchedRuleAccess().getInPatternInPatternParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalMyAtl.g:642:3: (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==42) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyAtl.g:643:4: otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getMatchedRuleAccess().getUsingKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,41,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyAtl.g:651:4: ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_SIMPLE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyAtl.g:652:5: (lv_variables_7_0= ruleRuleVariableDeclaration )
                    	    {
                    	    // InternalMyAtl.g:652:5: (lv_variables_7_0= ruleRuleVariableDeclaration )
                    	    // InternalMyAtl.g:653:6: lv_variables_7_0= ruleRuleVariableDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getMatchedRuleAccess().getVariablesRuleVariableDeclarationParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
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
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,43,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getMatchedRuleAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,44,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getMatchedRuleAccess().getToKeyword_6());
            		
            // InternalMyAtl.g:679:3: ( (lv_outPattern_10_0= ruleOutPattern ) )
            // InternalMyAtl.g:680:4: (lv_outPattern_10_0= ruleOutPattern )
            {
            // InternalMyAtl.g:680:4: (lv_outPattern_10_0= ruleOutPattern )
            // InternalMyAtl.g:681:5: lv_outPattern_10_0= ruleOutPattern
            {

            					newCompositeNode(grammarAccess.getMatchedRuleAccess().getOutPatternOutPatternParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalMyAtl.g:698:3: (otherlv_11= '...' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==45) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyAtl.g:699:4: otherlv_11= '...'
                    {
                    otherlv_11=(Token)match(input,45,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getMatchedRuleAccess().getFullStopFullStopFullStopKeyword_8());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:704:3: (otherlv_12= ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyAtl.g:705:4: otherlv_12= ','
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_12, grammarAccess.getMatchedRuleAccess().getCommaKeyword_9());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:710:3: (otherlv_13= 'do' otherlv_14= '{' ( (lv_actionBlock_15_0= ruleActionBlock ) ) otherlv_16= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==46) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyAtl.g:711:4: otherlv_13= 'do' otherlv_14= '{' ( (lv_actionBlock_15_0= ruleActionBlock ) ) otherlv_16= '}'
                    {
                    otherlv_13=(Token)match(input,46,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getMatchedRuleAccess().getDoKeyword_10_0());
                    			
                    otherlv_14=(Token)match(input,41,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalMyAtl.g:719:4: ( (lv_actionBlock_15_0= ruleActionBlock ) )
                    // InternalMyAtl.g:720:5: (lv_actionBlock_15_0= ruleActionBlock )
                    {
                    // InternalMyAtl.g:720:5: (lv_actionBlock_15_0= ruleActionBlock )
                    // InternalMyAtl.g:721:6: lv_actionBlock_15_0= ruleActionBlock
                    {

                    						newCompositeNode(grammarAccess.getMatchedRuleAccess().getActionBlockActionBlockParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    otherlv_16=(Token)match(input,43,FOLLOW_23); 

                    				newLeafNode(otherlv_16, grammarAccess.getMatchedRuleAccess().getRightCurlyBracketKeyword_10_3());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:743:3: (otherlv_17= ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyAtl.g:744:4: otherlv_17= ','
                    {
                    otherlv_17=(Token)match(input,22,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getMatchedRuleAccess().getCommaKeyword_11());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,43,FOLLOW_2); 

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
    // InternalMyAtl.g:757:1: entryRuleCalledRule returns [EObject current=null] : iv_ruleCalledRule= ruleCalledRule EOF ;
    public final EObject entryRuleCalledRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalledRule = null;


        try {
            // InternalMyAtl.g:757:51: (iv_ruleCalledRule= ruleCalledRule EOF )
            // InternalMyAtl.g:758:2: iv_ruleCalledRule= ruleCalledRule EOF
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
    // InternalMyAtl.g:764:1: ruleCalledRule returns [EObject current=null] : ( (otherlv_0= 'entrypoint' | otherlv_1= 'endpoint' )? otherlv_2= 'rule' ( (lv_name_3_0= ruleUnrestrictedName ) ) (otherlv_4= '(' otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'using' otherlv_8= '{' ( (lv_variables_9_0= ruleRuleVariableDeclaration ) )* otherlv_10= '}' )? otherlv_11= 'to' ( (lv_outPattern_12_0= ruleOutPattern ) ) (otherlv_13= '...' )? (otherlv_14= ',' )? (otherlv_15= 'do' otherlv_16= '{' ( (lv_actionBlock_17_0= ruleActionBlock ) ) otherlv_18= '}' )? (otherlv_19= ',' )? otherlv_20= '}' ) ;
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
            // InternalMyAtl.g:770:2: ( ( (otherlv_0= 'entrypoint' | otherlv_1= 'endpoint' )? otherlv_2= 'rule' ( (lv_name_3_0= ruleUnrestrictedName ) ) (otherlv_4= '(' otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'using' otherlv_8= '{' ( (lv_variables_9_0= ruleRuleVariableDeclaration ) )* otherlv_10= '}' )? otherlv_11= 'to' ( (lv_outPattern_12_0= ruleOutPattern ) ) (otherlv_13= '...' )? (otherlv_14= ',' )? (otherlv_15= 'do' otherlv_16= '{' ( (lv_actionBlock_17_0= ruleActionBlock ) ) otherlv_18= '}' )? (otherlv_19= ',' )? otherlv_20= '}' ) )
            // InternalMyAtl.g:771:2: ( (otherlv_0= 'entrypoint' | otherlv_1= 'endpoint' )? otherlv_2= 'rule' ( (lv_name_3_0= ruleUnrestrictedName ) ) (otherlv_4= '(' otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'using' otherlv_8= '{' ( (lv_variables_9_0= ruleRuleVariableDeclaration ) )* otherlv_10= '}' )? otherlv_11= 'to' ( (lv_outPattern_12_0= ruleOutPattern ) ) (otherlv_13= '...' )? (otherlv_14= ',' )? (otherlv_15= 'do' otherlv_16= '{' ( (lv_actionBlock_17_0= ruleActionBlock ) ) otherlv_18= '}' )? (otherlv_19= ',' )? otherlv_20= '}' )
            {
            // InternalMyAtl.g:771:2: ( (otherlv_0= 'entrypoint' | otherlv_1= 'endpoint' )? otherlv_2= 'rule' ( (lv_name_3_0= ruleUnrestrictedName ) ) (otherlv_4= '(' otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'using' otherlv_8= '{' ( (lv_variables_9_0= ruleRuleVariableDeclaration ) )* otherlv_10= '}' )? otherlv_11= 'to' ( (lv_outPattern_12_0= ruleOutPattern ) ) (otherlv_13= '...' )? (otherlv_14= ',' )? (otherlv_15= 'do' otherlv_16= '{' ( (lv_actionBlock_17_0= ruleActionBlock ) ) otherlv_18= '}' )? (otherlv_19= ',' )? otherlv_20= '}' )
            // InternalMyAtl.g:772:3: (otherlv_0= 'entrypoint' | otherlv_1= 'endpoint' )? otherlv_2= 'rule' ( (lv_name_3_0= ruleUnrestrictedName ) ) (otherlv_4= '(' otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'using' otherlv_8= '{' ( (lv_variables_9_0= ruleRuleVariableDeclaration ) )* otherlv_10= '}' )? otherlv_11= 'to' ( (lv_outPattern_12_0= ruleOutPattern ) ) (otherlv_13= '...' )? (otherlv_14= ',' )? (otherlv_15= 'do' otherlv_16= '{' ( (lv_actionBlock_17_0= ruleActionBlock ) ) otherlv_18= '}' )? (otherlv_19= ',' )? otherlv_20= '}'
            {
            // InternalMyAtl.g:772:3: (otherlv_0= 'entrypoint' | otherlv_1= 'endpoint' )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==47) ) {
                alt15=1;
            }
            else if ( (LA15_0==48) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyAtl.g:773:4: otherlv_0= 'entrypoint'
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getCalledRuleAccess().getEntrypointKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:778:4: otherlv_1= 'endpoint'
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getCalledRuleAccess().getEndpointKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCalledRuleAccess().getRuleKeyword_1());
            		
            // InternalMyAtl.g:787:3: ( (lv_name_3_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:788:4: (lv_name_3_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:788:4: (lv_name_3_0= ruleUnrestrictedName )
            // InternalMyAtl.g:789:5: lv_name_3_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getCalledRuleAccess().getNameUnrestrictedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalMyAtl.g:806:3: (otherlv_4= '(' otherlv_5= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==49) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyAtl.g:807:4: otherlv_4= '(' otherlv_5= ')'
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getCalledRuleAccess().getLeftParenthesisKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,50,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getCalledRuleAccess().getRightParenthesisKeyword_3_1());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,41,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyAtl.g:820:3: (otherlv_7= 'using' otherlv_8= '{' ( (lv_variables_9_0= ruleRuleVariableDeclaration ) )* otherlv_10= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==42) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyAtl.g:821:4: otherlv_7= 'using' otherlv_8= '{' ( (lv_variables_9_0= ruleRuleVariableDeclaration ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getCalledRuleAccess().getUsingKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,41,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyAtl.g:829:4: ( (lv_variables_9_0= ruleRuleVariableDeclaration ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_SIMPLE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalMyAtl.g:830:5: (lv_variables_9_0= ruleRuleVariableDeclaration )
                    	    {
                    	    // InternalMyAtl.g:830:5: (lv_variables_9_0= ruleRuleVariableDeclaration )
                    	    // InternalMyAtl.g:831:6: lv_variables_9_0= ruleRuleVariableDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getCalledRuleAccess().getVariablesRuleVariableDeclarationParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
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
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,43,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getCalledRuleAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,44,FOLLOW_18); 

            			newLeafNode(otherlv_11, grammarAccess.getCalledRuleAccess().getToKeyword_6());
            		
            // InternalMyAtl.g:857:3: ( (lv_outPattern_12_0= ruleOutPattern ) )
            // InternalMyAtl.g:858:4: (lv_outPattern_12_0= ruleOutPattern )
            {
            // InternalMyAtl.g:858:4: (lv_outPattern_12_0= ruleOutPattern )
            // InternalMyAtl.g:859:5: lv_outPattern_12_0= ruleOutPattern
            {

            					newCompositeNode(grammarAccess.getCalledRuleAccess().getOutPatternOutPatternParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalMyAtl.g:876:3: (otherlv_13= '...' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyAtl.g:877:4: otherlv_13= '...'
                    {
                    otherlv_13=(Token)match(input,45,FOLLOW_20); 

                    				newLeafNode(otherlv_13, grammarAccess.getCalledRuleAccess().getFullStopFullStopFullStopKeyword_8());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:882:3: (otherlv_14= ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyAtl.g:883:4: otherlv_14= ','
                    {
                    otherlv_14=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_14, grammarAccess.getCalledRuleAccess().getCommaKeyword_9());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:888:3: (otherlv_15= 'do' otherlv_16= '{' ( (lv_actionBlock_17_0= ruleActionBlock ) ) otherlv_18= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyAtl.g:889:4: otherlv_15= 'do' otherlv_16= '{' ( (lv_actionBlock_17_0= ruleActionBlock ) ) otherlv_18= '}'
                    {
                    otherlv_15=(Token)match(input,46,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getCalledRuleAccess().getDoKeyword_10_0());
                    			
                    otherlv_16=(Token)match(input,41,FOLLOW_21); 

                    				newLeafNode(otherlv_16, grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalMyAtl.g:897:4: ( (lv_actionBlock_17_0= ruleActionBlock ) )
                    // InternalMyAtl.g:898:5: (lv_actionBlock_17_0= ruleActionBlock )
                    {
                    // InternalMyAtl.g:898:5: (lv_actionBlock_17_0= ruleActionBlock )
                    // InternalMyAtl.g:899:6: lv_actionBlock_17_0= ruleActionBlock
                    {

                    						newCompositeNode(grammarAccess.getCalledRuleAccess().getActionBlockActionBlockParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    otherlv_18=(Token)match(input,43,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getCalledRuleAccess().getRightCurlyBracketKeyword_10_3());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:921:3: (otherlv_19= ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyAtl.g:922:4: otherlv_19= ','
                    {
                    otherlv_19=(Token)match(input,22,FOLLOW_22); 

                    				newLeafNode(otherlv_19, grammarAccess.getCalledRuleAccess().getCommaKeyword_11());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,43,FOLLOW_2); 

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
    // InternalMyAtl.g:935:1: entryRuleQueryRule returns [EObject current=null] : iv_ruleQueryRule= ruleQueryRule EOF ;
    public final EObject entryRuleQueryRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryRule = null;


        try {
            // InternalMyAtl.g:935:50: (iv_ruleQueryRule= ruleQueryRule EOF )
            // InternalMyAtl.g:936:2: iv_ruleQueryRule= ruleQueryRule EOF
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
    // InternalMyAtl.g:942:1: ruleQueryRule returns [EObject current=null] : (otherlv_0= 'query' ( (lv_name_1_0= ruleUnrestrictedName ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )* )? otherlv_6= ')' )? otherlv_7= '=' ( (lv_initExpression_8_0= ruleExpCS ) ) otherlv_9= ';' ) ;
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
            // InternalMyAtl.g:948:2: ( (otherlv_0= 'query' ( (lv_name_1_0= ruleUnrestrictedName ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )* )? otherlv_6= ')' )? otherlv_7= '=' ( (lv_initExpression_8_0= ruleExpCS ) ) otherlv_9= ';' ) )
            // InternalMyAtl.g:949:2: (otherlv_0= 'query' ( (lv_name_1_0= ruleUnrestrictedName ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )* )? otherlv_6= ')' )? otherlv_7= '=' ( (lv_initExpression_8_0= ruleExpCS ) ) otherlv_9= ';' )
            {
            // InternalMyAtl.g:949:2: (otherlv_0= 'query' ( (lv_name_1_0= ruleUnrestrictedName ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )* )? otherlv_6= ')' )? otherlv_7= '=' ( (lv_initExpression_8_0= ruleExpCS ) ) otherlv_9= ';' )
            // InternalMyAtl.g:950:3: otherlv_0= 'query' ( (lv_name_1_0= ruleUnrestrictedName ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )* )? otherlv_6= ')' )? otherlv_7= '=' ( (lv_initExpression_8_0= ruleExpCS ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryRuleAccess().getQueryKeyword_0());
            		
            // InternalMyAtl.g:954:3: ( (lv_name_1_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:955:4: (lv_name_1_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:955:4: (lv_name_1_0= ruleUnrestrictedName )
            // InternalMyAtl.g:956:5: lv_name_1_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getQueryRuleAccess().getNameUnrestrictedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalMyAtl.g:973:3: (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )* )? otherlv_6= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==49) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyAtl.g:974:4: otherlv_2= '(' ( ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getQueryRuleAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMyAtl.g:978:4: ( ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_SIMPLE_ID) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalMyAtl.g:979:5: ( (lv_parameters_3_0= ruleATLParameterCS ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )*
                            {
                            // InternalMyAtl.g:979:5: ( (lv_parameters_3_0= ruleATLParameterCS ) )
                            // InternalMyAtl.g:980:6: (lv_parameters_3_0= ruleATLParameterCS )
                            {
                            // InternalMyAtl.g:980:6: (lv_parameters_3_0= ruleATLParameterCS )
                            // InternalMyAtl.g:981:7: lv_parameters_3_0= ruleATLParameterCS
                            {

                            							newCompositeNode(grammarAccess.getQueryRuleAccess().getParametersATLParameterCSParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_29);
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

                            // InternalMyAtl.g:998:5: (otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==22) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // InternalMyAtl.g:999:6: otherlv_4= ',' ( (lv_parameters_5_0= ruleATLParameterCS ) )
                            	    {
                            	    otherlv_4=(Token)match(input,22,FOLLOW_3); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getQueryRuleAccess().getCommaKeyword_2_1_1_0());
                            	    					
                            	    // InternalMyAtl.g:1003:6: ( (lv_parameters_5_0= ruleATLParameterCS ) )
                            	    // InternalMyAtl.g:1004:7: (lv_parameters_5_0= ruleATLParameterCS )
                            	    {
                            	    // InternalMyAtl.g:1004:7: (lv_parameters_5_0= ruleATLParameterCS )
                            	    // InternalMyAtl.g:1005:8: lv_parameters_5_0= ruleATLParameterCS
                            	    {

                            	    								newCompositeNode(grammarAccess.getQueryRuleAccess().getParametersATLParameterCSParserRuleCall_2_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_29);
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
                            	    break loop23;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,50,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getQueryRuleAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,52,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getQueryRuleAccess().getEqualsSignKeyword_3());
            		
            // InternalMyAtl.g:1033:3: ( (lv_initExpression_8_0= ruleExpCS ) )
            // InternalMyAtl.g:1034:4: (lv_initExpression_8_0= ruleExpCS )
            {
            // InternalMyAtl.g:1034:4: (lv_initExpression_8_0= ruleExpCS )
            // InternalMyAtl.g:1035:5: lv_initExpression_8_0= ruleExpCS
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
    // InternalMyAtl.g:1060:1: entryRuleHelper returns [EObject current=null] : iv_ruleHelper= ruleHelper EOF ;
    public final EObject entryRuleHelper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelper = null;


        try {
            // InternalMyAtl.g:1060:47: (iv_ruleHelper= ruleHelper EOF )
            // InternalMyAtl.g:1061:2: iv_ruleHelper= ruleHelper EOF
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
    // InternalMyAtl.g:1067:1: ruleHelper returns [EObject current=null] : (otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_name_2_0= ruleUnrestrictedName ) )? ( (lv_definition_3_0= ruleATLDefCS ) ) ) ;
    public final EObject ruleHelper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_definition_3_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1073:2: ( (otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_name_2_0= ruleUnrestrictedName ) )? ( (lv_definition_3_0= ruleATLDefCS ) ) ) )
            // InternalMyAtl.g:1074:2: (otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_name_2_0= ruleUnrestrictedName ) )? ( (lv_definition_3_0= ruleATLDefCS ) ) )
            {
            // InternalMyAtl.g:1074:2: (otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_name_2_0= ruleUnrestrictedName ) )? ( (lv_definition_3_0= ruleATLDefCS ) ) )
            // InternalMyAtl.g:1075:3: otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_name_2_0= ruleUnrestrictedName ) )? ( (lv_definition_3_0= ruleATLDefCS ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getHelperAccess().getHelperKeyword_0());
            		
            // InternalMyAtl.g:1079:3: (otherlv_1= 'context' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==54) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyAtl.g:1080:4: otherlv_1= 'context'
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getHelperAccess().getContextKeyword_1());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:1085:3: ( (lv_name_2_0= ruleUnrestrictedName ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_SIMPLE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyAtl.g:1086:4: (lv_name_2_0= ruleUnrestrictedName )
                    {
                    // InternalMyAtl.g:1086:4: (lv_name_2_0= ruleUnrestrictedName )
                    // InternalMyAtl.g:1087:5: lv_name_2_0= ruleUnrestrictedName
                    {

                    					newCompositeNode(grammarAccess.getHelperAccess().getNameUnrestrictedNameParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_31);
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

            // InternalMyAtl.g:1104:3: ( (lv_definition_3_0= ruleATLDefCS ) )
            // InternalMyAtl.g:1105:4: (lv_definition_3_0= ruleATLDefCS )
            {
            // InternalMyAtl.g:1105:4: (lv_definition_3_0= ruleATLDefCS )
            // InternalMyAtl.g:1106:5: lv_definition_3_0= ruleATLDefCS
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
    // InternalMyAtl.g:1127:1: entryRuleATLDefCS returns [EObject current=null] : iv_ruleATLDefCS= ruleATLDefCS EOF ;
    public final EObject entryRuleATLDefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATLDefCS = null;


        try {
            // InternalMyAtl.g:1127:49: (iv_ruleATLDefCS= ruleATLDefCS EOF )
            // InternalMyAtl.g:1128:2: iv_ruleATLDefCS= ruleATLDefCS EOF
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
    // InternalMyAtl.g:1134:1: ruleATLDefCS returns [EObject current=null] : (otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';' ) ;
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
            // InternalMyAtl.g:1140:2: ( (otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';' ) )
            // InternalMyAtl.g:1141:2: (otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';' )
            {
            // InternalMyAtl.g:1141:2: (otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';' )
            // InternalMyAtl.g:1142:3: otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getATLDefCSAccess().getDefKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getATLDefCSAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:1150:3: ( (lv_varName_2_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1151:4: (lv_varName_2_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1151:4: (lv_varName_2_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1152:5: lv_varName_2_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getATLDefCSAccess().getVarNameUnrestrictedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalMyAtl.g:1169:3: (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==49) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyAtl.g:1170:4: otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getATLDefCSAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMyAtl.g:1174:4: ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_SIMPLE_ID) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalMyAtl.g:1175:5: ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )*
                            {
                            // InternalMyAtl.g:1175:5: ( (lv_parameters_4_0= ruleATLParameterCS ) )
                            // InternalMyAtl.g:1176:6: (lv_parameters_4_0= ruleATLParameterCS )
                            {
                            // InternalMyAtl.g:1176:6: (lv_parameters_4_0= ruleATLParameterCS )
                            // InternalMyAtl.g:1177:7: lv_parameters_4_0= ruleATLParameterCS
                            {

                            							newCompositeNode(grammarAccess.getATLDefCSAccess().getParametersATLParameterCSParserRuleCall_3_1_0_0());
                            						
                            pushFollow(FOLLOW_29);
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

                            // InternalMyAtl.g:1194:5: (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==22) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // InternalMyAtl.g:1195:6: otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) )
                            	    {
                            	    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                            	    						newLeafNode(otherlv_5, grammarAccess.getATLDefCSAccess().getCommaKeyword_3_1_1_0());
                            	    					
                            	    // InternalMyAtl.g:1199:6: ( (lv_parameters_6_0= ruleATLParameterCS ) )
                            	    // InternalMyAtl.g:1200:7: (lv_parameters_6_0= ruleATLParameterCS )
                            	    {
                            	    // InternalMyAtl.g:1200:7: (lv_parameters_6_0= ruleATLParameterCS )
                            	    // InternalMyAtl.g:1201:8: lv_parameters_6_0= ruleATLParameterCS
                            	    {

                            	    								newCompositeNode(grammarAccess.getATLDefCSAccess().getParametersATLParameterCSParserRuleCall_3_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_29);
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
                            	    break loop28;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,50,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getATLDefCSAccess().getRightParenthesisKeyword_3_2());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FOLLOW_33); 

            			newLeafNode(otherlv_8, grammarAccess.getATLDefCSAccess().getColonKeyword_4());
            		
            // InternalMyAtl.g:1229:3: ( (lv_type_9_0= ruleATLType ) )
            // InternalMyAtl.g:1230:4: (lv_type_9_0= ruleATLType )
            {
            // InternalMyAtl.g:1230:4: (lv_type_9_0= ruleATLType )
            // InternalMyAtl.g:1231:5: lv_type_9_0= ruleATLType
            {

            					newCompositeNode(grammarAccess.getATLDefCSAccess().getTypeATLTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_10=(Token)match(input,52,FOLLOW_21); 

            			newLeafNode(otherlv_10, grammarAccess.getATLDefCSAccess().getEqualsSignKeyword_6());
            		
            // InternalMyAtl.g:1252:3: ( (lv_initExpression_11_0= ruleExpCS ) )
            // InternalMyAtl.g:1253:4: (lv_initExpression_11_0= ruleExpCS )
            {
            // InternalMyAtl.g:1253:4: (lv_initExpression_11_0= ruleExpCS )
            // InternalMyAtl.g:1254:5: lv_initExpression_11_0= ruleExpCS
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
    // InternalMyAtl.g:1279:1: entryRuleATLParameterCS returns [EObject current=null] : iv_ruleATLParameterCS= ruleATLParameterCS EOF ;
    public final EObject entryRuleATLParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATLParameterCS = null;


        try {
            // InternalMyAtl.g:1279:55: (iv_ruleATLParameterCS= ruleATLParameterCS EOF )
            // InternalMyAtl.g:1280:2: iv_ruleATLParameterCS= ruleATLParameterCS EOF
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
    // InternalMyAtl.g:1286:1: ruleATLParameterCS returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) ) ;
    public final EObject ruleATLParameterCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_varName_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1292:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) ) )
            // InternalMyAtl.g:1293:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) )
            {
            // InternalMyAtl.g:1293:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) )
            // InternalMyAtl.g:1294:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) )
            {
            // InternalMyAtl.g:1294:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1295:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1295:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1296:5: lv_varName_0_0= ruleUnrestrictedName
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

            otherlv_1=(Token)match(input,21,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getATLParameterCSAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:1317:3: ( (lv_type_2_0= ruleATLType ) )
            // InternalMyAtl.g:1318:4: (lv_type_2_0= ruleATLType )
            {
            // InternalMyAtl.g:1318:4: (lv_type_2_0= ruleATLType )
            // InternalMyAtl.g:1319:5: lv_type_2_0= ruleATLType
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
    // InternalMyAtl.g:1340:1: entryRuleRuleVariableDeclaration returns [EObject current=null] : iv_ruleRuleVariableDeclaration= ruleRuleVariableDeclaration EOF ;
    public final EObject entryRuleRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleVariableDeclaration = null;


        try {
            // InternalMyAtl.g:1340:64: (iv_ruleRuleVariableDeclaration= ruleRuleVariableDeclaration EOF )
            // InternalMyAtl.g:1341:2: iv_ruleRuleVariableDeclaration= ruleRuleVariableDeclaration EOF
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
    // InternalMyAtl.g:1347:1: ruleRuleVariableDeclaration returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';' ) ;
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
            // InternalMyAtl.g:1353:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';' ) )
            // InternalMyAtl.g:1354:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';' )
            {
            // InternalMyAtl.g:1354:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';' )
            // InternalMyAtl.g:1355:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';'
            {
            // InternalMyAtl.g:1355:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1356:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1356:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1357:5: lv_varName_0_0= ruleUnrestrictedName
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

            otherlv_1=(Token)match(input,21,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleVariableDeclarationAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:1378:3: ( (lv_type_2_0= ruleATLType ) )
            // InternalMyAtl.g:1379:4: (lv_type_2_0= ruleATLType )
            {
            // InternalMyAtl.g:1379:4: (lv_type_2_0= ruleATLType )
            // InternalMyAtl.g:1380:5: lv_type_2_0= ruleATLType
            {

            					newCompositeNode(grammarAccess.getRuleVariableDeclarationAccess().getTypeATLTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,52,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleVariableDeclarationAccess().getEqualsSignKeyword_3());
            		
            // InternalMyAtl.g:1401:3: ( (lv_initExpression_4_0= ruleExpCS ) )
            // InternalMyAtl.g:1402:4: (lv_initExpression_4_0= ruleExpCS )
            {
            // InternalMyAtl.g:1402:4: (lv_initExpression_4_0= ruleExpCS )
            // InternalMyAtl.g:1403:5: lv_initExpression_4_0= ruleExpCS
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
    // InternalMyAtl.g:1428:1: entryRuleInPattern returns [EObject current=null] : iv_ruleInPattern= ruleInPattern EOF ;
    public final EObject entryRuleInPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPattern = null;


        try {
            // InternalMyAtl.g:1428:50: (iv_ruleInPattern= ruleInPattern EOF )
            // InternalMyAtl.g:1429:2: iv_ruleInPattern= ruleInPattern EOF
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
    // InternalMyAtl.g:1435:1: ruleInPattern returns [EObject current=null] : ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )? ) ;
    public final EObject ruleInPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_0_0 = null;

        EObject lv_filter_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1441:2: ( ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )? ) )
            // InternalMyAtl.g:1442:2: ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )? )
            {
            // InternalMyAtl.g:1442:2: ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )? )
            // InternalMyAtl.g:1443:3: ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )?
            {
            // InternalMyAtl.g:1443:3: ( (lv_elements_0_0= ruleInPatternElement ) )
            // InternalMyAtl.g:1444:4: (lv_elements_0_0= ruleInPatternElement )
            {
            // InternalMyAtl.g:1444:4: (lv_elements_0_0= ruleInPatternElement )
            // InternalMyAtl.g:1445:5: lv_elements_0_0= ruleInPatternElement
            {

            					newCompositeNode(grammarAccess.getInPatternAccess().getElementsInPatternElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalMyAtl.g:1462:3: (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyAtl.g:1463:4: otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getInPatternAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMyAtl.g:1467:4: ( (lv_filter_2_0= ruleExpCS ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( ((LA31_0>=RULE_SIMPLE_ID && LA31_0<=RULE_BIG_INT)||LA31_0==26||LA31_0==45||LA31_0==49||(LA31_0>=61 && LA31_0<=63)||(LA31_0>=76 && LA31_0<=79)||LA31_0==82||LA31_0==86||LA31_0==88) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalMyAtl.g:1468:5: (lv_filter_2_0= ruleExpCS )
                            {
                            // InternalMyAtl.g:1468:5: (lv_filter_2_0= ruleExpCS )
                            // InternalMyAtl.g:1469:6: lv_filter_2_0= ruleExpCS
                            {

                            						newCompositeNode(grammarAccess.getInPatternAccess().getFilterExpCSParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_26);
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

                    otherlv_3=(Token)match(input,50,FOLLOW_2); 

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
    // InternalMyAtl.g:1495:1: entryRuleInPatternElement returns [EObject current=null] : iv_ruleInPatternElement= ruleInPatternElement EOF ;
    public final EObject entryRuleInPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPatternElement = null;


        try {
            // InternalMyAtl.g:1495:57: (iv_ruleInPatternElement= ruleInPatternElement EOF )
            // InternalMyAtl.g:1496:2: iv_ruleInPatternElement= ruleInPatternElement EOF
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
    // InternalMyAtl.g:1502:1: ruleInPatternElement returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) ) ;
    public final EObject ruleInPatternElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_varName_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1508:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) ) )
            // InternalMyAtl.g:1509:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) )
            {
            // InternalMyAtl.g:1509:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) )
            // InternalMyAtl.g:1510:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) )
            {
            // InternalMyAtl.g:1510:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1511:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1511:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1512:5: lv_varName_0_0= ruleUnrestrictedName
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

            otherlv_1=(Token)match(input,21,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getInPatternElementAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:1533:3: ( (lv_type_2_0= ruleATLType ) )
            // InternalMyAtl.g:1534:4: (lv_type_2_0= ruleATLType )
            {
            // InternalMyAtl.g:1534:4: (lv_type_2_0= ruleATLType )
            // InternalMyAtl.g:1535:5: lv_type_2_0= ruleATLType
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
    // InternalMyAtl.g:1556:1: entryRuleOutPattern returns [EObject current=null] : iv_ruleOutPattern= ruleOutPattern EOF ;
    public final EObject entryRuleOutPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPattern = null;


        try {
            // InternalMyAtl.g:1556:51: (iv_ruleOutPattern= ruleOutPattern EOF )
            // InternalMyAtl.g:1557:2: iv_ruleOutPattern= ruleOutPattern EOF
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
    // InternalMyAtl.g:1563:1: ruleOutPattern returns [EObject current=null] : ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* ) ;
    public final EObject ruleOutPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1569:2: ( ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* ) )
            // InternalMyAtl.g:1570:2: ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* )
            {
            // InternalMyAtl.g:1570:2: ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* )
            // InternalMyAtl.g:1571:3: ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )*
            {
            // InternalMyAtl.g:1571:3: ( (lv_elements_0_0= ruleOutPatternElement ) )
            // InternalMyAtl.g:1572:4: (lv_elements_0_0= ruleOutPatternElement )
            {
            // InternalMyAtl.g:1572:4: (lv_elements_0_0= ruleOutPatternElement )
            // InternalMyAtl.g:1573:5: lv_elements_0_0= ruleOutPatternElement
            {

            					newCompositeNode(grammarAccess.getOutPatternAccess().getElementsOutPatternElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalMyAtl.g:1590:3: (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==22) ) {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==RULE_SIMPLE_ID||LA33_2==56) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyAtl.g:1591:4: otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_18); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOutPatternAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyAtl.g:1595:4: ( (lv_elements_2_0= ruleOutPatternElement ) )
            	    // InternalMyAtl.g:1596:5: (lv_elements_2_0= ruleOutPatternElement )
            	    {
            	    // InternalMyAtl.g:1596:5: (lv_elements_2_0= ruleOutPatternElement )
            	    // InternalMyAtl.g:1597:6: lv_elements_2_0= ruleOutPatternElement
            	    {

            	    						newCompositeNode(grammarAccess.getOutPatternAccess().getElementsOutPatternElementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
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
            	    break loop33;
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
    // InternalMyAtl.g:1619:1: entryRuleOutPatternElement returns [EObject current=null] : iv_ruleOutPatternElement= ruleOutPatternElement EOF ;
    public final EObject entryRuleOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPatternElement = null;


        try {
            // InternalMyAtl.g:1619:58: (iv_ruleOutPatternElement= ruleOutPatternElement EOF )
            // InternalMyAtl.g:1620:2: iv_ruleOutPatternElement= ruleOutPatternElement EOF
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
    // InternalMyAtl.g:1626:1: ruleOutPatternElement returns [EObject current=null] : (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement ) ;
    public final EObject ruleOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleOutPatternElement_0 = null;

        EObject this_ForEachOutPatternElement_1 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1632:2: ( (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement ) )
            // InternalMyAtl.g:1633:2: (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement )
            {
            // InternalMyAtl.g:1633:2: (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_SIMPLE_ID) ) {
                alt34=1;
            }
            else if ( (LA34_0==56) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyAtl.g:1634:3: this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement
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
                    // InternalMyAtl.g:1643:3: this_ForEachOutPatternElement_1= ruleForEachOutPatternElement
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
    // InternalMyAtl.g:1655:1: entryRuleSimpleOutPatternElement returns [EObject current=null] : iv_ruleSimpleOutPatternElement= ruleSimpleOutPatternElement EOF ;
    public final EObject entryRuleSimpleOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOutPatternElement = null;


        try {
            // InternalMyAtl.g:1655:64: (iv_ruleSimpleOutPatternElement= ruleSimpleOutPatternElement EOF )
            // InternalMyAtl.g:1656:2: iv_ruleSimpleOutPatternElement= ruleSimpleOutPatternElement EOF
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
    // InternalMyAtl.g:1662:1: ruleSimpleOutPatternElement returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )? ) ;
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
            // InternalMyAtl.g:1668:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )? ) )
            // InternalMyAtl.g:1669:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )? )
            {
            // InternalMyAtl.g:1669:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )? )
            // InternalMyAtl.g:1670:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )?
            {
            // InternalMyAtl.g:1670:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1671:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1671:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1672:5: lv_varName_0_0= ruleUnrestrictedName
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

            otherlv_1=(Token)match(input,21,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleOutPatternElementAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:1693:3: ( (lv_type_2_0= ruleATLType ) )
            // InternalMyAtl.g:1694:4: (lv_type_2_0= ruleATLType )
            {
            // InternalMyAtl.g:1694:4: (lv_type_2_0= ruleATLType )
            // InternalMyAtl.g:1695:5: lv_type_2_0= ruleATLType
            {

            					newCompositeNode(grammarAccess.getSimpleOutPatternElementAccess().getTypeATLTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalMyAtl.g:1712:3: (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyAtl.g:1713:4: otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getSimpleOutPatternElementAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMyAtl.g:1717:4: ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_SIMPLE_ID) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalMyAtl.g:1718:5: ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )*
                            {
                            // InternalMyAtl.g:1718:5: ( (lv_bindings_4_0= ruleBinding ) )
                            // InternalMyAtl.g:1719:6: (lv_bindings_4_0= ruleBinding )
                            {
                            // InternalMyAtl.g:1719:6: (lv_bindings_4_0= ruleBinding )
                            // InternalMyAtl.g:1720:7: lv_bindings_4_0= ruleBinding
                            {

                            							newCompositeNode(grammarAccess.getSimpleOutPatternElementAccess().getBindingsBindingParserRuleCall_3_1_0_0());
                            						
                            pushFollow(FOLLOW_29);
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

                            // InternalMyAtl.g:1737:5: (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==22) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // InternalMyAtl.g:1738:6: otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) )
                            	    {
                            	    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                            	    						newLeafNode(otherlv_5, grammarAccess.getSimpleOutPatternElementAccess().getCommaKeyword_3_1_1_0());
                            	    					
                            	    // InternalMyAtl.g:1742:6: ( (lv_bindings_6_0= ruleBinding ) )
                            	    // InternalMyAtl.g:1743:7: (lv_bindings_6_0= ruleBinding )
                            	    {
                            	    // InternalMyAtl.g:1743:7: (lv_bindings_6_0= ruleBinding )
                            	    // InternalMyAtl.g:1744:8: lv_bindings_6_0= ruleBinding
                            	    {

                            	    								newCompositeNode(grammarAccess.getSimpleOutPatternElementAccess().getBindingsBindingParserRuleCall_3_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_29);
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
                            	    break loop35;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,50,FOLLOW_2); 

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
    // InternalMyAtl.g:1772:1: entryRuleForEachOutPatternElement returns [EObject current=null] : iv_ruleForEachOutPatternElement= ruleForEachOutPatternElement EOF ;
    public final EObject entryRuleForEachOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachOutPatternElement = null;


        try {
            // InternalMyAtl.g:1772:65: (iv_ruleForEachOutPatternElement= ruleForEachOutPatternElement EOF )
            // InternalMyAtl.g:1773:2: iv_ruleForEachOutPatternElement= ruleForEachOutPatternElement EOF
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
    // InternalMyAtl.g:1779:1: ruleForEachOutPatternElement returns [EObject current=null] : (otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy' ) ;
    public final EObject ruleForEachOutPatternElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_collection_1_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1785:2: ( (otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy' ) )
            // InternalMyAtl.g:1786:2: (otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy' )
            {
            // InternalMyAtl.g:1786:2: (otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy' )
            // InternalMyAtl.g:1787:3: otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachOutPatternElementAccess().getXxxKeyword_0());
            		
            // InternalMyAtl.g:1791:3: ( (lv_collection_1_0= ruleExpCS ) )
            // InternalMyAtl.g:1792:4: (lv_collection_1_0= ruleExpCS )
            {
            // InternalMyAtl.g:1792:4: (lv_collection_1_0= ruleExpCS )
            // InternalMyAtl.g:1793:5: lv_collection_1_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getForEachOutPatternElementAccess().getCollectionExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
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

            otherlv_2=(Token)match(input,57,FOLLOW_2); 

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
    // InternalMyAtl.g:1818:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalMyAtl.g:1818:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalMyAtl.g:1819:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalMyAtl.g:1825:1: ruleBinding returns [EObject current=null] : ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_propertyName_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1831:2: ( ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) ) ) )
            // InternalMyAtl.g:1832:2: ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) ) )
            {
            // InternalMyAtl.g:1832:2: ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) ) )
            // InternalMyAtl.g:1833:3: ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) )
            {
            // InternalMyAtl.g:1833:3: ( (lv_propertyName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1834:4: (lv_propertyName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1834:4: (lv_propertyName_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1835:5: lv_propertyName_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getPropertyNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
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

            otherlv_1=(Token)match(input,58,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_1());
            		
            // InternalMyAtl.g:1856:3: ( (lv_value_2_0= ruleExpCS ) )
            // InternalMyAtl.g:1857:4: (lv_value_2_0= ruleExpCS )
            {
            // InternalMyAtl.g:1857:4: (lv_value_2_0= ruleExpCS )
            // InternalMyAtl.g:1858:5: lv_value_2_0= ruleExpCS
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
    // InternalMyAtl.g:1879:1: entryRuleActionBlock returns [EObject current=null] : iv_ruleActionBlock= ruleActionBlock EOF ;
    public final EObject entryRuleActionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionBlock = null;


        try {
            // InternalMyAtl.g:1879:52: (iv_ruleActionBlock= ruleActionBlock EOF )
            // InternalMyAtl.g:1880:2: iv_ruleActionBlock= ruleActionBlock EOF
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
    // InternalMyAtl.g:1886:1: ruleActionBlock returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )+ ;
    public final EObject ruleActionBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1892:2: ( ( (lv_statements_0_0= ruleStatement ) )+ )
            // InternalMyAtl.g:1893:2: ( (lv_statements_0_0= ruleStatement ) )+
            {
            // InternalMyAtl.g:1893:2: ( (lv_statements_0_0= ruleStatement ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_SIMPLE_ID && LA38_0<=RULE_BIG_INT)||LA38_0==26||LA38_0==45||LA38_0==49||(LA38_0>=61 && LA38_0<=63)||(LA38_0>=76 && LA38_0<=79)||LA38_0==82||LA38_0==86||LA38_0==88) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMyAtl.g:1894:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalMyAtl.g:1894:3: (lv_statements_0_0= ruleStatement )
            	    // InternalMyAtl.g:1895:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getActionBlockAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_39);
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
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
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
    // InternalMyAtl.g:1915:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyAtl.g:1915:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyAtl.g:1916:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMyAtl.g:1922:1: ruleStatement returns [EObject current=null] : this_BindingStat_0= ruleBindingStat ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_BindingStat_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1928:2: (this_BindingStat_0= ruleBindingStat )
            // InternalMyAtl.g:1929:2: this_BindingStat_0= ruleBindingStat
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
    // InternalMyAtl.g:1940:1: entryRuleBindingStat returns [EObject current=null] : iv_ruleBindingStat= ruleBindingStat EOF ;
    public final EObject entryRuleBindingStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingStat = null;


        try {
            // InternalMyAtl.g:1940:52: (iv_ruleBindingStat= ruleBindingStat EOF )
            // InternalMyAtl.g:1941:2: iv_ruleBindingStat= ruleBindingStat EOF
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
    // InternalMyAtl.g:1947:1: ruleBindingStat returns [EObject current=null] : ( ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';' ) ;
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
            // InternalMyAtl.g:1953:2: ( ( ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';' ) )
            // InternalMyAtl.g:1954:2: ( ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';' )
            {
            // InternalMyAtl.g:1954:2: ( ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';' )
            // InternalMyAtl.g:1955:3: ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';'
            {
            // InternalMyAtl.g:1955:3: ( (lv_source_0_0= ruleExpCS ) )
            // InternalMyAtl.g:1956:4: (lv_source_0_0= ruleExpCS )
            {
            // InternalMyAtl.g:1956:4: (lv_source_0_0= ruleExpCS )
            // InternalMyAtl.g:1957:5: lv_source_0_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getBindingStatAccess().getSourceExpCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
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

            otherlv_1=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingStatAccess().getFullStopKeyword_1());
            		
            // InternalMyAtl.g:1978:3: ( (lv_propertyName_2_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1979:4: (lv_propertyName_2_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1979:4: (lv_propertyName_2_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1980:5: lv_propertyName_2_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getBindingStatAccess().getPropertyNameUnrestrictedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_38);
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

            otherlv_3=(Token)match(input,58,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getBindingStatAccess().getLessThanSignHyphenMinusKeyword_3());
            		
            // InternalMyAtl.g:2001:3: ( (lv_value_4_0= ruleExpCS ) )
            // InternalMyAtl.g:2002:4: (lv_value_4_0= ruleExpCS )
            {
            // InternalMyAtl.g:2002:4: (lv_value_4_0= ruleExpCS )
            // InternalMyAtl.g:2003:5: lv_value_4_0= ruleExpCS
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
    // InternalMyAtl.g:2028:1: entryRuleATLType returns [EObject current=null] : iv_ruleATLType= ruleATLType EOF ;
    public final EObject entryRuleATLType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATLType = null;


        try {
            // InternalMyAtl.g:2028:48: (iv_ruleATLType= ruleATLType EOF )
            // InternalMyAtl.g:2029:2: iv_ruleATLType= ruleATLType EOF
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
    // InternalMyAtl.g:2035:1: ruleATLType returns [EObject current=null] : ( ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleATLType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_modelName_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2041:2: ( ( ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) ) ) )
            // InternalMyAtl.g:2042:2: ( ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) ) )
            {
            // InternalMyAtl.g:2042:2: ( ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) ) )
            // InternalMyAtl.g:2043:3: ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) )
            {
            // InternalMyAtl.g:2043:3: ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_SIMPLE_ID) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==60) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalMyAtl.g:2044:4: ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!'
                    {
                    // InternalMyAtl.g:2044:4: ( (lv_modelName_0_0= ruleATLModelName ) )
                    // InternalMyAtl.g:2045:5: (lv_modelName_0_0= ruleATLModelName )
                    {
                    // InternalMyAtl.g:2045:5: (lv_modelName_0_0= ruleATLModelName )
                    // InternalMyAtl.g:2046:6: lv_modelName_0_0= ruleATLModelName
                    {

                    						newCompositeNode(grammarAccess.getATLTypeAccess().getModelNameATLModelNameParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    otherlv_1=(Token)match(input,60,FOLLOW_33); 

                    				newLeafNode(otherlv_1, grammarAccess.getATLTypeAccess().getExclamationMarkKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:2068:3: ( (lv_type_2_0= ruleTypeExpCS ) )
            // InternalMyAtl.g:2069:4: (lv_type_2_0= ruleTypeExpCS )
            {
            // InternalMyAtl.g:2069:4: (lv_type_2_0= ruleTypeExpCS )
            // InternalMyAtl.g:2070:5: lv_type_2_0= ruleTypeExpCS
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
    // InternalMyAtl.g:2091:1: entryRuleATLModelName returns [String current=null] : iv_ruleATLModelName= ruleATLModelName EOF ;
    public final String entryRuleATLModelName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATLModelName = null;


        try {
            // InternalMyAtl.g:2091:52: (iv_ruleATLModelName= ruleATLModelName EOF )
            // InternalMyAtl.g:2092:2: iv_ruleATLModelName= ruleATLModelName EOF
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
    // InternalMyAtl.g:2098:1: ruleATLModelName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_UnrestrictedName_0= ruleUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleATLModelName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2104:2: (this_UnrestrictedName_0= ruleUnrestrictedName )
            // InternalMyAtl.g:2105:2: this_UnrestrictedName_0= ruleUnrestrictedName
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
    // InternalMyAtl.g:2118:1: entryRuleEssentialOCLPrefixOperator returns [String current=null] : iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF ;
    public final String entryRuleEssentialOCLPrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLPrefixOperator = null;


        try {
            // InternalMyAtl.g:2118:66: (iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF )
            // InternalMyAtl.g:2119:2: iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF
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
    // InternalMyAtl.g:2125:1: ruleEssentialOCLPrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLPrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtl.g:2131:2: ( (kw= '-' | kw= 'not' ) )
            // InternalMyAtl.g:2132:2: (kw= '-' | kw= 'not' )
            {
            // InternalMyAtl.g:2132:2: (kw= '-' | kw= 'not' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==61) ) {
                alt40=1;
            }
            else if ( (LA40_0==62) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyAtl.g:2133:3: kw= '-'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLPrefixOperatorAccess().getHyphenMinusKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:2139:3: kw= 'not'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

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
    // InternalMyAtl.g:2148:1: entryRuleEssentialOCLInfixOperator returns [String current=null] : iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF ;
    public final String entryRuleEssentialOCLInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperator = null;


        try {
            // InternalMyAtl.g:2148:65: (iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF )
            // InternalMyAtl.g:2149:2: iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF
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
    // InternalMyAtl.g:2155:1: ruleEssentialOCLInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtl.g:2161:2: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) )
            // InternalMyAtl.g:2162:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            {
            // InternalMyAtl.g:2162:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            int alt41=14;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt41=1;
                }
                break;
            case 64:
                {
                alt41=2;
                }
                break;
            case 65:
                {
                alt41=3;
                }
                break;
            case 61:
                {
                alt41=4;
                }
                break;
            case 66:
                {
                alt41=5;
                }
                break;
            case 67:
                {
                alt41=6;
                }
                break;
            case 68:
                {
                alt41=7;
                }
                break;
            case 69:
                {
                alt41=8;
                }
                break;
            case 52:
                {
                alt41=9;
                }
                break;
            case 70:
                {
                alt41=10;
                }
                break;
            case 71:
                {
                alt41=11;
                }
                break;
            case 72:
                {
                alt41=12;
                }
                break;
            case 73:
                {
                alt41=13;
                }
                break;
            case 74:
                {
                alt41=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalMyAtl.g:2163:3: kw= '*'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:2169:3: kw= '/'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyAtl.g:2175:3: kw= '+'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getPlusSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyAtl.g:2181:3: kw= '-'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getHyphenMinusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyAtl.g:2187:3: kw= '>'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyAtl.g:2193:3: kw= '<'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyAtl.g:2199:3: kw= '>='
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignEqualsSignKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyAtl.g:2205:3: kw= '<='
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignEqualsSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalMyAtl.g:2211:3: kw= '='
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getEqualsSignKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalMyAtl.g:2217:3: kw= '<>'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignGreaterThanSignKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalMyAtl.g:2223:3: kw= 'and'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getAndKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalMyAtl.g:2229:3: kw= 'or'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getOrKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalMyAtl.g:2235:3: kw= 'xor'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getXorKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalMyAtl.g:2241:3: kw= 'implies'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

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
    // InternalMyAtl.g:2250:1: entryRuleEssentialOCLNavigationOperator returns [String current=null] : iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF ;
    public final String entryRuleEssentialOCLNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperator = null;


        try {
            // InternalMyAtl.g:2250:70: (iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF )
            // InternalMyAtl.g:2251:2: iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF
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
    // InternalMyAtl.g:2257:1: ruleEssentialOCLNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtl.g:2263:2: ( (kw= '.' | kw= '->' ) )
            // InternalMyAtl.g:2264:2: (kw= '.' | kw= '->' )
            {
            // InternalMyAtl.g:2264:2: (kw= '.' | kw= '->' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==59) ) {
                alt42=1;
            }
            else if ( (LA42_0==75) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyAtl.g:2265:3: kw= '.'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorAccess().getFullStopKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:2271:3: kw= '->'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

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
    // InternalMyAtl.g:2280:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalMyAtl.g:2280:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMyAtl.g:2281:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalMyAtl.g:2287:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;


        	enterRule();

        try {
            // InternalMyAtl.g:2293:2: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // InternalMyAtl.g:2294:2: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
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
    // InternalMyAtl.g:2304:1: entryRulePrefixOperator returns [String current=null] : iv_rulePrefixOperator= rulePrefixOperator EOF ;
    public final String entryRulePrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixOperator = null;


        try {
            // InternalMyAtl.g:2304:54: (iv_rulePrefixOperator= rulePrefixOperator EOF )
            // InternalMyAtl.g:2305:2: iv_rulePrefixOperator= rulePrefixOperator EOF
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
    // InternalMyAtl.g:2311:1: rulePrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator ;
    public final AntlrDatatypeRuleToken rulePrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLPrefixOperator_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2317:2: (this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator )
            // InternalMyAtl.g:2318:2: this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator
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
    // InternalMyAtl.g:2331:1: entryRuleInfixOperator returns [String current=null] : iv_ruleInfixOperator= ruleInfixOperator EOF ;
    public final String entryRuleInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperator = null;


        try {
            // InternalMyAtl.g:2331:53: (iv_ruleInfixOperator= ruleInfixOperator EOF )
            // InternalMyAtl.g:2332:2: iv_ruleInfixOperator= ruleInfixOperator EOF
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
    // InternalMyAtl.g:2338:1: ruleInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator ;
    public final AntlrDatatypeRuleToken ruleInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperator_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2344:2: (this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator )
            // InternalMyAtl.g:2345:2: this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator
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
    // InternalMyAtl.g:2358:1: entryRuleNavigationOperator returns [String current=null] : iv_ruleNavigationOperator= ruleNavigationOperator EOF ;
    public final String entryRuleNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperator = null;


        try {
            // InternalMyAtl.g:2358:58: (iv_ruleNavigationOperator= ruleNavigationOperator EOF )
            // InternalMyAtl.g:2359:2: iv_ruleNavigationOperator= ruleNavigationOperator EOF
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
    // InternalMyAtl.g:2365:1: ruleNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator ;
    public final AntlrDatatypeRuleToken ruleNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperator_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2371:2: (this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator )
            // InternalMyAtl.g:2372:2: this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator
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
    // InternalMyAtl.g:2385:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // InternalMyAtl.g:2385:57: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // InternalMyAtl.g:2386:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
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
    // InternalMyAtl.g:2392:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( ( (otherlv_1= '(' | otherlv_2= '{' ) ( (lv_ownedType_3_0= ruleTypeExpCS ) )? (otherlv_4= ')' | otherlv_5= '}' ) ) | (otherlv_6= '<' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) otherlv_8= '>' ) )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedType_7_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2398:2: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( ( (otherlv_1= '(' | otherlv_2= '{' ) ( (lv_ownedType_3_0= ruleTypeExpCS ) )? (otherlv_4= ')' | otherlv_5= '}' ) ) | (otherlv_6= '<' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) otherlv_8= '>' ) )? ) )
            // InternalMyAtl.g:2399:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( ( (otherlv_1= '(' | otherlv_2= '{' ) ( (lv_ownedType_3_0= ruleTypeExpCS ) )? (otherlv_4= ')' | otherlv_5= '}' ) ) | (otherlv_6= '<' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) otherlv_8= '>' ) )? )
            {
            // InternalMyAtl.g:2399:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( ( (otherlv_1= '(' | otherlv_2= '{' ) ( (lv_ownedType_3_0= ruleTypeExpCS ) )? (otherlv_4= ')' | otherlv_5= '}' ) ) | (otherlv_6= '<' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) otherlv_8= '>' ) )? )
            // InternalMyAtl.g:2400:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( ( (otherlv_1= '(' | otherlv_2= '{' ) ( (lv_ownedType_3_0= ruleTypeExpCS ) )? (otherlv_4= ')' | otherlv_5= '}' ) ) | (otherlv_6= '<' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) otherlv_8= '>' ) )?
            {
            // InternalMyAtl.g:2400:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // InternalMyAtl.g:2401:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // InternalMyAtl.g:2401:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // InternalMyAtl.g:2402:5: lv_name_0_0= ruleCollectionTypeIdentifier
            {

            					newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalMyAtl.g:2419:3: ( ( (otherlv_1= '(' | otherlv_2= '{' ) ( (lv_ownedType_3_0= ruleTypeExpCS ) )? (otherlv_4= ')' | otherlv_5= '}' ) ) | (otherlv_6= '<' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) otherlv_8= '>' ) )?
            int alt46=3;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalMyAtl.g:2420:4: ( (otherlv_1= '(' | otherlv_2= '{' ) ( (lv_ownedType_3_0= ruleTypeExpCS ) )? (otherlv_4= ')' | otherlv_5= '}' ) )
                    {
                    // InternalMyAtl.g:2420:4: ( (otherlv_1= '(' | otherlv_2= '{' ) ( (lv_ownedType_3_0= ruleTypeExpCS ) )? (otherlv_4= ')' | otherlv_5= '}' ) )
                    // InternalMyAtl.g:2421:5: (otherlv_1= '(' | otherlv_2= '{' ) ( (lv_ownedType_3_0= ruleTypeExpCS ) )? (otherlv_4= ')' | otherlv_5= '}' )
                    {
                    // InternalMyAtl.g:2421:5: (otherlv_1= '(' | otherlv_2= '{' )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==49) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==41) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalMyAtl.g:2422:6: otherlv_1= '('
                            {
                            otherlv_1=(Token)match(input,49,FOLLOW_43); 

                            						newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalMyAtl.g:2427:6: otherlv_2= '{'
                            {
                            otherlv_2=(Token)match(input,41,FOLLOW_43); 

                            						newLeafNode(otherlv_2, grammarAccess.getCollectionTypeCSAccess().getLeftCurlyBracketKeyword_1_0_0_1());
                            					

                            }
                            break;

                    }

                    // InternalMyAtl.g:2432:5: ( (lv_ownedType_3_0= ruleTypeExpCS ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_SIMPLE_ID||(LA44_0>=26 && LA44_0<=39)) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalMyAtl.g:2433:6: (lv_ownedType_3_0= ruleTypeExpCS )
                            {
                            // InternalMyAtl.g:2433:6: (lv_ownedType_3_0= ruleTypeExpCS )
                            // InternalMyAtl.g:2434:7: lv_ownedType_3_0= ruleTypeExpCS
                            {

                            							newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_44);
                            lv_ownedType_3_0=ruleTypeExpCS();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                            							}
                            							set(
                            								current,
                            								"ownedType",
                            								lv_ownedType_3_0,
                            								"org.xtext.example.mydsl.MyAtl.TypeExpCS");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalMyAtl.g:2451:5: (otherlv_4= ')' | otherlv_5= '}' )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==50) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==43) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalMyAtl.g:2452:6: otherlv_4= ')'
                            {
                            otherlv_4=(Token)match(input,50,FOLLOW_2); 

                            						newLeafNode(otherlv_4, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_0_2_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalMyAtl.g:2457:6: otherlv_5= '}'
                            {
                            otherlv_5=(Token)match(input,43,FOLLOW_2); 

                            						newLeafNode(otherlv_5, grammarAccess.getCollectionTypeCSAccess().getRightCurlyBracketKeyword_1_0_2_1());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:2464:4: (otherlv_6= '<' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) otherlv_8= '>' )
                    {
                    // InternalMyAtl.g:2464:4: (otherlv_6= '<' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) otherlv_8= '>' )
                    // InternalMyAtl.g:2465:5: otherlv_6= '<' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) otherlv_8= '>'
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_33); 

                    					newLeafNode(otherlv_6, grammarAccess.getCollectionTypeCSAccess().getLessThanSignKeyword_1_1_0());
                    				
                    // InternalMyAtl.g:2469:5: ( (lv_ownedType_7_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:2470:6: (lv_ownedType_7_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:2470:6: (lv_ownedType_7_0= ruleTypeExpCS )
                    // InternalMyAtl.g:2471:7: lv_ownedType_7_0= ruleTypeExpCS
                    {

                    							newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_45);
                    lv_ownedType_7_0=ruleTypeExpCS();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                    							}
                    							set(
                    								current,
                    								"ownedType",
                    								lv_ownedType_7_0,
                    								"org.xtext.example.mydsl.MyAtl.TypeExpCS");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,66,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getCollectionTypeCSAccess().getGreaterThanSignKeyword_1_1_2());
                    				

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
    // InternalMyAtl.g:2498:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // InternalMyAtl.g:2498:52: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // InternalMyAtl.g:2499:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
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
    // InternalMyAtl.g:2505:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) ) ;
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
            // InternalMyAtl.g:2511:2: ( ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) ) )
            // InternalMyAtl.g:2512:2: ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) )
            {
            // InternalMyAtl.g:2512:2: ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) )
            // InternalMyAtl.g:2513:3: ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) )
            {
            // InternalMyAtl.g:2513:3: ( (lv_name_0_0= 'Tuple' ) )
            // InternalMyAtl.g:2514:4: (lv_name_0_0= 'Tuple' )
            {
            // InternalMyAtl.g:2514:4: (lv_name_0_0= 'Tuple' )
            // InternalMyAtl.g:2515:5: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,26,FOLLOW_46); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTupleTypeCSAccess().getNameTupleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTupleTypeCSRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Tuple");
            				

            }


            }

            // InternalMyAtl.g:2527:3: ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )?
            int alt51=3;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==49) ) {
                alt51=1;
            }
            else if ( (LA51_0==67) ) {
                alt51=2;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyAtl.g:2528:4: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' )
                    {
                    // InternalMyAtl.g:2528:4: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' )
                    // InternalMyAtl.g:2529:5: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_28); 

                    					newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalMyAtl.g:2533:5: ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_SIMPLE_ID) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalMyAtl.g:2534:6: ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )*
                            {
                            // InternalMyAtl.g:2534:6: ( (lv_ownedParts_2_0= ruletuplePartCS ) )
                            // InternalMyAtl.g:2535:7: (lv_ownedParts_2_0= ruletuplePartCS )
                            {
                            // InternalMyAtl.g:2535:7: (lv_ownedParts_2_0= ruletuplePartCS )
                            // InternalMyAtl.g:2536:8: lv_ownedParts_2_0= ruletuplePartCS
                            {

                            								newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_0_1_0_0());
                            							
                            pushFollow(FOLLOW_29);
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

                            // InternalMyAtl.g:2553:6: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )*
                            loop47:
                            do {
                                int alt47=2;
                                int LA47_0 = input.LA(1);

                                if ( (LA47_0==22) ) {
                                    alt47=1;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // InternalMyAtl.g:2554:7: otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                            	    							newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_0_1_1_0());
                            	    						
                            	    // InternalMyAtl.g:2558:7: ( (lv_ownedParts_4_0= ruletuplePartCS ) )
                            	    // InternalMyAtl.g:2559:8: (lv_ownedParts_4_0= ruletuplePartCS )
                            	    {
                            	    // InternalMyAtl.g:2559:8: (lv_ownedParts_4_0= ruletuplePartCS )
                            	    // InternalMyAtl.g:2560:9: lv_ownedParts_4_0= ruletuplePartCS
                            	    {

                            	    									newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_0_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_29);
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
                            	    break loop47;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,50,FOLLOW_47); 

                    					newLeafNode(otherlv_5, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:2585:4: (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' )
                    {
                    // InternalMyAtl.g:2585:4: (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' )
                    // InternalMyAtl.g:2586:5: otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>'
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_48); 

                    					newLeafNode(otherlv_6, grammarAccess.getTupleTypeCSAccess().getLessThanSignKeyword_1_1_0());
                    				
                    // InternalMyAtl.g:2590:5: ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_SIMPLE_ID) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalMyAtl.g:2591:6: ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )*
                            {
                            // InternalMyAtl.g:2591:6: ( (lv_ownedParts_7_0= ruletuplePartCS ) )
                            // InternalMyAtl.g:2592:7: (lv_ownedParts_7_0= ruletuplePartCS )
                            {
                            // InternalMyAtl.g:2592:7: (lv_ownedParts_7_0= ruletuplePartCS )
                            // InternalMyAtl.g:2593:8: lv_ownedParts_7_0= ruletuplePartCS
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

                            // InternalMyAtl.g:2610:6: (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )*
                            loop49:
                            do {
                                int alt49=2;
                                int LA49_0 = input.LA(1);

                                if ( (LA49_0==22) ) {
                                    alt49=1;
                                }


                                switch (alt49) {
                            	case 1 :
                            	    // InternalMyAtl.g:2611:7: otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) )
                            	    {
                            	    otherlv_8=(Token)match(input,22,FOLLOW_3); 

                            	    							newLeafNode(otherlv_8, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_1_0());
                            	    						
                            	    // InternalMyAtl.g:2615:7: ( (lv_ownedParts_9_0= ruletuplePartCS ) )
                            	    // InternalMyAtl.g:2616:8: (lv_ownedParts_9_0= ruletuplePartCS )
                            	    {
                            	    // InternalMyAtl.g:2616:8: (lv_ownedParts_9_0= ruletuplePartCS )
                            	    // InternalMyAtl.g:2617:9: lv_ownedParts_9_0= ruletuplePartCS
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
                            	    break loop49;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,66,FOLLOW_47); 

                    					newLeafNode(otherlv_10, grammarAccess.getTupleTypeCSAccess().getGreaterThanSignKeyword_1_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalMyAtl.g:2642:3: ( (lv_backtrack_11_0= 'true' ) )
            // InternalMyAtl.g:2643:4: (lv_backtrack_11_0= 'true' )
            {
            // InternalMyAtl.g:2643:4: (lv_backtrack_11_0= 'true' )
            // InternalMyAtl.g:2644:5: lv_backtrack_11_0= 'true'
            {
            lv_backtrack_11_0=(Token)match(input,76,FOLLOW_2); 

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
    // InternalMyAtl.g:2660:1: entryRuletuplePartCS returns [EObject current=null] : iv_ruletuplePartCS= ruletuplePartCS EOF ;
    public final EObject entryRuletuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletuplePartCS = null;


        try {
            // InternalMyAtl.g:2660:52: (iv_ruletuplePartCS= ruletuplePartCS EOF )
            // InternalMyAtl.g:2661:2: iv_ruletuplePartCS= ruletuplePartCS EOF
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
    // InternalMyAtl.g:2667:1: ruletuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruletuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2673:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalMyAtl.g:2674:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalMyAtl.g:2674:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalMyAtl.g:2675:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalMyAtl.g:2675:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:2676:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:2676:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:2677:5: lv_name_0_0= ruleUnrestrictedName
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

            otherlv_1=(Token)match(input,21,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:2698:3: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalMyAtl.g:2699:4: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalMyAtl.g:2699:4: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalMyAtl.g:2700:5: lv_ownedType_2_0= ruleTypeExpCS
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


    // $ANTLR start "entryRulePrimitiveLiteralExpCS"
    // InternalMyAtl.g:2721:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // InternalMyAtl.g:2721:62: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // InternalMyAtl.g:2722:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
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
    // InternalMyAtl.g:2728:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
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
            // InternalMyAtl.g:2734:2: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // InternalMyAtl.g:2735:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // InternalMyAtl.g:2735:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt52=6;
            switch ( input.LA(1) ) {
            case RULE_BIG_INT:
                {
                alt52=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt52=2;
                }
                break;
            case 76:
            case 77:
                {
                alt52=3;
                }
                break;
            case 63:
                {
                alt52=4;
                }
                break;
            case 78:
                {
                alt52=5;
                }
                break;
            case 79:
                {
                alt52=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalMyAtl.g:2736:3: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
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
                    // InternalMyAtl.g:2745:3: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
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
                    // InternalMyAtl.g:2754:3: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
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
                    // InternalMyAtl.g:2763:3: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
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
                    // InternalMyAtl.g:2772:3: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
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
                    // InternalMyAtl.g:2781:3: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
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
    // InternalMyAtl.g:2793:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // InternalMyAtl.g:2793:58: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // InternalMyAtl.g:2794:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
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
    // InternalMyAtl.g:2800:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
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
            // InternalMyAtl.g:2806:2: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // InternalMyAtl.g:2807:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // InternalMyAtl.g:2807:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // InternalMyAtl.g:2808:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyAtl.g:2816:3: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // InternalMyAtl.g:2817:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // InternalMyAtl.g:2817:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // InternalMyAtl.g:2818:5: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {

            					newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalMyAtl.g:2835:3: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==22) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalMyAtl.g:2836:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyAtl.g:2840:4: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // InternalMyAtl.g:2841:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // InternalMyAtl.g:2841:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // InternalMyAtl.g:2842:6: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {

            	    						newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
            	    break loop53;
                }
            } while (true);

            otherlv_5=(Token)match(input,43,FOLLOW_2); 

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
    // InternalMyAtl.g:2868:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // InternalMyAtl.g:2868:59: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // InternalMyAtl.g:2869:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
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
    // InternalMyAtl.g:2875:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2881:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // InternalMyAtl.g:2882:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // InternalMyAtl.g:2882:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // InternalMyAtl.g:2883:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // InternalMyAtl.g:2883:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:2884:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:2884:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:2885:5: lv_name_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_50);
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

            // InternalMyAtl.g:2902:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==21) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyAtl.g:2903:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_33); 

                    				newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyAtl.g:2907:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:2908:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:2908:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyAtl.g:2909:6: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,52,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
            		
            // InternalMyAtl.g:2931:3: ( (lv_initExpression_4_0= ruleExpCS ) )
            // InternalMyAtl.g:2932:4: (lv_initExpression_4_0= ruleExpCS )
            {
            // InternalMyAtl.g:2932:4: (lv_initExpression_4_0= ruleExpCS )
            // InternalMyAtl.g:2933:5: lv_initExpression_4_0= ruleExpCS
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
    // InternalMyAtl.g:2954:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // InternalMyAtl.g:2954:59: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // InternalMyAtl.g:2955:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
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
    // InternalMyAtl.g:2961:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= RULE_BIG_INT ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyAtl.g:2967:2: ( ( (lv_name_0_0= RULE_BIG_INT ) ) )
            // InternalMyAtl.g:2968:2: ( (lv_name_0_0= RULE_BIG_INT ) )
            {
            // InternalMyAtl.g:2968:2: ( (lv_name_0_0= RULE_BIG_INT ) )
            // InternalMyAtl.g:2969:3: (lv_name_0_0= RULE_BIG_INT )
            {
            // InternalMyAtl.g:2969:3: (lv_name_0_0= RULE_BIG_INT )
            // InternalMyAtl.g:2970:4: lv_name_0_0= RULE_BIG_INT
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
    // InternalMyAtl.g:2989:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // InternalMyAtl.g:2989:59: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // InternalMyAtl.g:2990:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
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
    // InternalMyAtl.g:2996:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleStringLiteral ) ) ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3002:2: ( ( (lv_name_0_0= ruleStringLiteral ) ) )
            // InternalMyAtl.g:3003:2: ( (lv_name_0_0= ruleStringLiteral ) )
            {
            // InternalMyAtl.g:3003:2: ( (lv_name_0_0= ruleStringLiteral ) )
            // InternalMyAtl.g:3004:3: (lv_name_0_0= ruleStringLiteral )
            {
            // InternalMyAtl.g:3004:3: (lv_name_0_0= ruleStringLiteral )
            // InternalMyAtl.g:3005:4: lv_name_0_0= ruleStringLiteral
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
    // InternalMyAtl.g:3025:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // InternalMyAtl.g:3025:60: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // InternalMyAtl.g:3026:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
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
    // InternalMyAtl.g:3032:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyAtl.g:3038:2: ( ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) )
            // InternalMyAtl.g:3039:2: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            {
            // InternalMyAtl.g:3039:2: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==76) ) {
                alt55=1;
            }
            else if ( (LA55_0==77) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyAtl.g:3040:3: ( (lv_name_0_0= 'true' ) )
                    {
                    // InternalMyAtl.g:3040:3: ( (lv_name_0_0= 'true' ) )
                    // InternalMyAtl.g:3041:4: (lv_name_0_0= 'true' )
                    {
                    // InternalMyAtl.g:3041:4: (lv_name_0_0= 'true' )
                    // InternalMyAtl.g:3042:5: lv_name_0_0= 'true'
                    {
                    lv_name_0_0=(Token)match(input,76,FOLLOW_2); 

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
                    // InternalMyAtl.g:3055:3: ( (lv_name_1_0= 'false' ) )
                    {
                    // InternalMyAtl.g:3055:3: ( (lv_name_1_0= 'false' ) )
                    // InternalMyAtl.g:3056:4: (lv_name_1_0= 'false' )
                    {
                    // InternalMyAtl.g:3056:4: (lv_name_1_0= 'false' )
                    // InternalMyAtl.g:3057:5: lv_name_1_0= 'false'
                    {
                    lv_name_1_0=(Token)match(input,77,FOLLOW_2); 

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
    // InternalMyAtl.g:3073:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // InternalMyAtl.g:3073:69: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // InternalMyAtl.g:3074:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
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
    // InternalMyAtl.g:3080:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtl.g:3086:2: ( ( () otherlv_1= '*' ) )
            // InternalMyAtl.g:3087:2: ( () otherlv_1= '*' )
            {
            // InternalMyAtl.g:3087:2: ( () otherlv_1= '*' )
            // InternalMyAtl.g:3088:3: () otherlv_1= '*'
            {
            // InternalMyAtl.g:3088:3: ()
            // InternalMyAtl.g:3089:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_2); 

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
    // InternalMyAtl.g:3103:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // InternalMyAtl.g:3103:60: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // InternalMyAtl.g:3104:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
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
    // InternalMyAtl.g:3110:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtl.g:3116:2: ( ( () otherlv_1= 'invalid' ) )
            // InternalMyAtl.g:3117:2: ( () otherlv_1= 'invalid' )
            {
            // InternalMyAtl.g:3117:2: ( () otherlv_1= 'invalid' )
            // InternalMyAtl.g:3118:3: () otherlv_1= 'invalid'
            {
            // InternalMyAtl.g:3118:3: ()
            // InternalMyAtl.g:3119:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_2); 

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
    // InternalMyAtl.g:3133:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // InternalMyAtl.g:3133:57: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // InternalMyAtl.g:3134:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
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
    // InternalMyAtl.g:3140:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtl.g:3146:2: ( ( () otherlv_1= 'null' ) )
            // InternalMyAtl.g:3147:2: ( () otherlv_1= 'null' )
            {
            // InternalMyAtl.g:3147:2: ( () otherlv_1= 'null' )
            // InternalMyAtl.g:3148:3: () otherlv_1= 'null'
            {
            // InternalMyAtl.g:3148:3: ()
            // InternalMyAtl.g:3149:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_2); 

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
    // InternalMyAtl.g:3163:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // InternalMyAtl.g:3163:56: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // InternalMyAtl.g:3164:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
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
    // InternalMyAtl.g:3170:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3176:2: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // InternalMyAtl.g:3177:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // InternalMyAtl.g:3177:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // InternalMyAtl.g:3178:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // InternalMyAtl.g:3178:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // InternalMyAtl.g:3179:4: lv_name_0_0= rulePrimitiveTypeIdentifier
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
    // InternalMyAtl.g:3199:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // InternalMyAtl.g:3199:54: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // InternalMyAtl.g:3200:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
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
    // InternalMyAtl.g:3206:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_TupleTypeCS_1 = null;

        EObject this_CollectionTypeCS_2 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3212:2: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS ) )
            // InternalMyAtl.g:3213:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS )
            {
            // InternalMyAtl.g:3213:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt56=1;
                }
                break;
            case 26:
                {
                alt56=2;
                }
                break;
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt56=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalMyAtl.g:3214:3: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
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
                    // InternalMyAtl.g:3223:3: this_TupleTypeCS_1= ruleTupleTypeCS
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
                    // InternalMyAtl.g:3232:3: this_CollectionTypeCS_2= ruleCollectionTypeCS
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
    // InternalMyAtl.g:3244:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // InternalMyAtl.g:3244:54: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // InternalMyAtl.g:3245:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
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
    // InternalMyAtl.g:3251:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) ;
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
            // InternalMyAtl.g:3257:2: ( ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) )
            // InternalMyAtl.g:3258:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            {
            // InternalMyAtl.g:3258:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_SIMPLE_ID) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==EOF||LA58_1==18||LA58_1==22||(LA58_1>=42 && LA58_1<=46)||(LA58_1>=49 && LA58_1<=50)||LA58_1==52||LA58_1==66||LA58_1==81) ) {
                    alt58=2;
                }
                else if ( (LA58_1==80) ) {
                    alt58=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyAtl.g:3259:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    {
                    // InternalMyAtl.g:3259:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    // InternalMyAtl.g:3260:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) )
                    {
                    // InternalMyAtl.g:3260:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* )
                    // InternalMyAtl.g:3261:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    {
                    // InternalMyAtl.g:3261:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) )
                    // InternalMyAtl.g:3262:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    {
                    // InternalMyAtl.g:3262:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    // InternalMyAtl.g:3263:7: lv_namespace_0_0= ruleUnrestrictedName
                    {

                    							newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getNamespaceUnrestrictedNameParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_51);
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

                    otherlv_1=(Token)match(input,80,FOLLOW_33); 

                    					newLeafNode(otherlv_1, grammarAccess.getTypeNameExpCSAccess().getColonColonKeyword_0_0_1());
                    				
                    // InternalMyAtl.g:3284:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    loop57:
                    do {
                        int alt57=2;
                        alt57 = dfa57.predict(input);
                        switch (alt57) {
                    	case 1 :
                    	    // InternalMyAtl.g:3285:6: ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::'
                    	    {
                    	    // InternalMyAtl.g:3285:6: ( (lv_namespace_2_0= ruleUnreservedName ) )
                    	    // InternalMyAtl.g:3286:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    {
                    	    // InternalMyAtl.g:3286:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    // InternalMyAtl.g:3287:8: lv_namespace_2_0= ruleUnreservedName
                    	    {

                    	    								newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getNamespaceUnreservedNameParserRuleCall_0_0_2_0_0());
                    	    							
                    	    pushFollow(FOLLOW_51);
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

                    	    otherlv_3=(Token)match(input,80,FOLLOW_33); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getTypeNameExpCSAccess().getColonColonKeyword_0_0_2_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }

                    // InternalMyAtl.g:3310:4: ( (lv_element_4_0= ruleUnreservedName ) )
                    // InternalMyAtl.g:3311:5: (lv_element_4_0= ruleUnreservedName )
                    {
                    // InternalMyAtl.g:3311:5: (lv_element_4_0= ruleUnreservedName )
                    // InternalMyAtl.g:3312:6: lv_element_4_0= ruleUnreservedName
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
                    // InternalMyAtl.g:3331:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    {
                    // InternalMyAtl.g:3331:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    // InternalMyAtl.g:3332:4: (lv_element_5_0= ruleUnrestrictedName )
                    {
                    // InternalMyAtl.g:3332:4: (lv_element_5_0= ruleUnrestrictedName )
                    // InternalMyAtl.g:3333:5: lv_element_5_0= ruleUnrestrictedName
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
    // InternalMyAtl.g:3354:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // InternalMyAtl.g:3354:50: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // InternalMyAtl.g:3355:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
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
    // InternalMyAtl.g:3361:1: ruleTypeExpCS returns [EObject current=null] : (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3367:2: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) )
            // InternalMyAtl.g:3368:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            {
            // InternalMyAtl.g:3368:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_SIMPLE_ID) ) {
                alt59=1;
            }
            else if ( ((LA59_0>=26 && LA59_0<=39)) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyAtl.g:3369:3: this_TypeNameExpCS_0= ruleTypeNameExpCS
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
                    // InternalMyAtl.g:3378:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
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
    // InternalMyAtl.g:3390:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // InternalMyAtl.g:3390:56: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // InternalMyAtl.g:3391:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
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
    // InternalMyAtl.g:3397:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_init_4_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3403:2: ( ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? ) )
            // InternalMyAtl.g:3404:2: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtl.g:3404:2: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )
            // InternalMyAtl.g:3405:3: ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
            {
            // InternalMyAtl.g:3405:3: ( (lv_name_0_0= ruleNavigatingArgExpCS ) )
            // InternalMyAtl.g:3406:4: (lv_name_0_0= ruleNavigatingArgExpCS )
            {
            // InternalMyAtl.g:3406:4: (lv_name_0_0= ruleNavigatingArgExpCS )
            // InternalMyAtl.g:3407:5: lv_name_0_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_52);
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

            // InternalMyAtl.g:3424:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==21) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyAtl.g:3425:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_33); 

                    				newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyAtl.g:3429:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:3430:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:3430:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyAtl.g:3431:6: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_53);
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

            // InternalMyAtl.g:3449:3: (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==52) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyAtl.g:3450:4: otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) )
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalMyAtl.g:3454:4: ( (lv_init_4_0= ruleExpCS ) )
                    // InternalMyAtl.g:3455:5: (lv_init_4_0= ruleExpCS )
                    {
                    // InternalMyAtl.g:3455:5: (lv_init_4_0= ruleExpCS )
                    // InternalMyAtl.g:3456:6: lv_init_4_0= ruleExpCS
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
    // InternalMyAtl.g:3478:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // InternalMyAtl.g:3478:59: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // InternalMyAtl.g:3479:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
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
    // InternalMyAtl.g:3485:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // InternalMyAtl.g:3491:2: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyAtl.g:3492:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtl.g:3492:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyAtl.g:3493:3: ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyAtl.g:3493:3: ( (lv_prefix_0_0= '|' ) )
            // InternalMyAtl.g:3494:4: (lv_prefix_0_0= '|' )
            {
            // InternalMyAtl.g:3494:4: (lv_prefix_0_0= '|' )
            // InternalMyAtl.g:3495:5: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,81,FOLLOW_21); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, "|");
            				

            }


            }

            // InternalMyAtl.g:3507:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyAtl.g:3508:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyAtl.g:3508:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyAtl.g:3509:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_52);
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

            // InternalMyAtl.g:3526:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==21) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMyAtl.g:3527:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_33); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyAtl.g:3531:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:3532:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:3532:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyAtl.g:3533:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_53);
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

            // InternalMyAtl.g:3551:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==52) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMyAtl.g:3552:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyAtl.g:3556:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyAtl.g:3557:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyAtl.g:3557:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyAtl.g:3558:6: lv_init_5_0= ruleExpCS
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
    // InternalMyAtl.g:3580:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // InternalMyAtl.g:3580:61: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // InternalMyAtl.g:3581:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
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
    // InternalMyAtl.g:3587:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // InternalMyAtl.g:3593:2: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyAtl.g:3594:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtl.g:3594:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyAtl.g:3595:3: ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyAtl.g:3595:3: ( (lv_prefix_0_0= ',' ) )
            // InternalMyAtl.g:3596:4: (lv_prefix_0_0= ',' )
            {
            // InternalMyAtl.g:3596:4: (lv_prefix_0_0= ',' )
            // InternalMyAtl.g:3597:5: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,22,FOLLOW_21); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ",");
            				

            }


            }

            // InternalMyAtl.g:3609:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyAtl.g:3610:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyAtl.g:3610:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyAtl.g:3611:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_52);
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

            // InternalMyAtl.g:3628:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==21) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMyAtl.g:3629:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_33); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyAtl.g:3633:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:3634:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:3634:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyAtl.g:3635:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_53);
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

            // InternalMyAtl.g:3653:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==52) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyAtl.g:3654:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyAtl.g:3658:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyAtl.g:3659:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyAtl.g:3659:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyAtl.g:3660:6: lv_init_5_0= ruleExpCS
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
    // InternalMyAtl.g:3682:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // InternalMyAtl.g:3682:60: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // InternalMyAtl.g:3683:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
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
    // InternalMyAtl.g:3689:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // InternalMyAtl.g:3695:2: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyAtl.g:3696:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtl.g:3696:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyAtl.g:3697:3: ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyAtl.g:3697:3: ( (lv_prefix_0_0= ';' ) )
            // InternalMyAtl.g:3698:4: (lv_prefix_0_0= ';' )
            {
            // InternalMyAtl.g:3698:4: (lv_prefix_0_0= ';' )
            // InternalMyAtl.g:3699:5: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,18,FOLLOW_21); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ";");
            				

            }


            }

            // InternalMyAtl.g:3711:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyAtl.g:3712:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyAtl.g:3712:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyAtl.g:3713:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_52);
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

            // InternalMyAtl.g:3730:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==21) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalMyAtl.g:3731:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_33); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyAtl.g:3735:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:3736:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:3736:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyAtl.g:3737:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_53);
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

            // InternalMyAtl.g:3755:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==52) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyAtl.g:3756:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyAtl.g:3760:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyAtl.g:3761:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyAtl.g:3761:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyAtl.g:3762:6: lv_init_5_0= ruleExpCS
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
    // InternalMyAtl.g:3784:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // InternalMyAtl.g:3784:59: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // InternalMyAtl.g:3785:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
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
    // InternalMyAtl.g:3791:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3797:2: (this_ExpCS_0= ruleExpCS )
            // InternalMyAtl.g:3798:2: this_ExpCS_0= ruleExpCS
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
    // InternalMyAtl.g:3809:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // InternalMyAtl.g:3809:48: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // InternalMyAtl.g:3810:2: iv_ruleIfExpCS= ruleIfExpCS EOF
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
    // InternalMyAtl.g:3816:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) ;
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
            // InternalMyAtl.g:3822:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) )
            // InternalMyAtl.g:3823:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            {
            // InternalMyAtl.g:3823:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            // InternalMyAtl.g:3824:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
            		
            // InternalMyAtl.g:3828:3: ( (lv_condition_1_0= ruleExpCS ) )
            // InternalMyAtl.g:3829:4: (lv_condition_1_0= ruleExpCS )
            {
            // InternalMyAtl.g:3829:4: (lv_condition_1_0= ruleExpCS )
            // InternalMyAtl.g:3830:5: lv_condition_1_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getConditionExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_54);
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

            otherlv_2=(Token)match(input,83,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
            		
            // InternalMyAtl.g:3851:3: ( (lv_thenExpression_3_0= ruleExpCS ) )
            // InternalMyAtl.g:3852:4: (lv_thenExpression_3_0= ruleExpCS )
            {
            // InternalMyAtl.g:3852:4: (lv_thenExpression_3_0= ruleExpCS )
            // InternalMyAtl.g:3853:5: lv_thenExpression_3_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getThenExpressionExpCSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_55);
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

            otherlv_4=(Token)match(input,84,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getIfExpCSAccess().getElseKeyword_4());
            		
            // InternalMyAtl.g:3874:3: ( (lv_elseExpression_5_0= ruleExpCS ) )
            // InternalMyAtl.g:3875:4: (lv_elseExpression_5_0= ruleExpCS )
            {
            // InternalMyAtl.g:3875:4: (lv_elseExpression_5_0= ruleExpCS )
            // InternalMyAtl.g:3876:5: lv_elseExpression_5_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getElseExpressionExpCSParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_56);
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

            otherlv_6=(Token)match(input,85,FOLLOW_2); 

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
    // InternalMyAtl.g:3901:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // InternalMyAtl.g:3901:49: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // InternalMyAtl.g:3902:2: iv_ruleLetExpCS= ruleLetExpCS EOF
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
    // InternalMyAtl.g:3908:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) ;
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
            // InternalMyAtl.g:3914:2: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) )
            // InternalMyAtl.g:3915:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            {
            // InternalMyAtl.g:3915:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            // InternalMyAtl.g:3916:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
            		
            // InternalMyAtl.g:3920:3: ( (lv_variable_1_0= ruleLetVariableCS ) )
            // InternalMyAtl.g:3921:4: (lv_variable_1_0= ruleLetVariableCS )
            {
            // InternalMyAtl.g:3921:4: (lv_variable_1_0= ruleLetVariableCS )
            // InternalMyAtl.g:3922:5: lv_variable_1_0= ruleLetVariableCS
            {

            					newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_57);
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

            // InternalMyAtl.g:3939:3: (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==22) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalMyAtl.g:3940:4: otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyAtl.g:3944:4: ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    // InternalMyAtl.g:3945:5: (lv_variable_3_0= ruleLetVariableCS )
            	    {
            	    // InternalMyAtl.g:3945:5: (lv_variable_3_0= ruleLetVariableCS )
            	    // InternalMyAtl.g:3946:6: lv_variable_3_0= ruleLetVariableCS
            	    {

            	    						newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_57);
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
            	    break loop68;
                }
            } while (true);

            otherlv_4=(Token)match(input,87,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
            		
            // InternalMyAtl.g:3968:3: ( (lv_in_5_0= ruleExpCS ) )
            // InternalMyAtl.g:3969:4: (lv_in_5_0= ruleExpCS )
            {
            // InternalMyAtl.g:3969:4: (lv_in_5_0= ruleExpCS )
            // InternalMyAtl.g:3970:5: lv_in_5_0= ruleExpCS
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
    // InternalMyAtl.g:3991:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // InternalMyAtl.g:3991:54: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // InternalMyAtl.g:3992:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
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
    // InternalMyAtl.g:3998:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4004:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // InternalMyAtl.g:4005:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // InternalMyAtl.g:4005:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // InternalMyAtl.g:4006:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // InternalMyAtl.g:4006:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:4007:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:4007:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:4008:5: lv_name_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_50);
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

            // InternalMyAtl.g:4025:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==21) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyAtl.g:4026:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_33); 

                    				newLeafNode(otherlv_1, grammarAccess.getLetVariableCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyAtl.g:4030:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:4031:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:4031:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyAtl.g:4032:6: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,52,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_2());
            		
            // InternalMyAtl.g:4054:3: ( (lv_initExpression_4_0= ruleExpCS ) )
            // InternalMyAtl.g:4055:4: (lv_initExpression_4_0= ruleExpCS )
            {
            // InternalMyAtl.g:4055:4: (lv_initExpression_4_0= ruleExpCS )
            // InternalMyAtl.g:4056:5: lv_initExpression_4_0= ruleExpCS
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
    // InternalMyAtl.g:4077:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // InternalMyAtl.g:4077:52: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // InternalMyAtl.g:4078:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
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
    // InternalMyAtl.g:4084:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_source_1_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4090:2: ( (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // InternalMyAtl.g:4091:2: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // InternalMyAtl.g:4091:2: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // InternalMyAtl.g:4092:3: otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyAtl.g:4096:3: ( (lv_source_1_0= ruleExpCS ) )
            // InternalMyAtl.g:4097:4: (lv_source_1_0= ruleExpCS )
            {
            // InternalMyAtl.g:4097:4: (lv_source_1_0= ruleExpCS )
            // InternalMyAtl.g:4098:5: lv_source_1_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getNestedExpCSAccess().getSourceExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_2=(Token)match(input,50,FOLLOW_2); 

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
    // InternalMyAtl.g:4123:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // InternalMyAtl.g:4123:50: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // InternalMyAtl.g:4124:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
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
    // InternalMyAtl.g:4130:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtl.g:4136:2: ( ( () otherlv_1= 'self' ) )
            // InternalMyAtl.g:4137:2: ( () otherlv_1= 'self' )
            {
            // InternalMyAtl.g:4137:2: ( () otherlv_1= 'self' )
            // InternalMyAtl.g:4138:3: () otherlv_1= 'self'
            {
            // InternalMyAtl.g:4138:3: ()
            // InternalMyAtl.g:4139:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelfExpCSAccess().getSelfExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,88,FOLLOW_2); 

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
    // InternalMyAtl.g:4153:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // InternalMyAtl.g:4153:53: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // InternalMyAtl.g:4154:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
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
    // InternalMyAtl.g:4160:1: rulePrimaryExpCS returns [EObject current=null] : (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_LetExpCS_4= ruleLetExpCS | this_IfExpCS_5= ruleIfExpCS | this_NestedExpCS_6= ruleNestedExpCS | this_StringExpCs_7= ruleStringExpCs ) ;
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
            // InternalMyAtl.g:4166:2: ( (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_LetExpCS_4= ruleLetExpCS | this_IfExpCS_5= ruleIfExpCS | this_NestedExpCS_6= ruleNestedExpCS | this_StringExpCs_7= ruleStringExpCs ) )
            // InternalMyAtl.g:4167:2: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_LetExpCS_4= ruleLetExpCS | this_IfExpCS_5= ruleIfExpCS | this_NestedExpCS_6= ruleNestedExpCS | this_StringExpCs_7= ruleStringExpCs )
            {
            // InternalMyAtl.g:4167:2: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_LetExpCS_4= ruleLetExpCS | this_IfExpCS_5= ruleIfExpCS | this_NestedExpCS_6= ruleNestedExpCS | this_StringExpCs_7= ruleStringExpCs )
            int alt70=8;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
                {
                alt70=1;
                }
                break;
            case 88:
                {
                alt70=2;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
            case RULE_BIG_INT:
            case 63:
            case 76:
            case 77:
            case 78:
            case 79:
                {
                alt70=3;
                }
                break;
            case 26:
                {
                alt70=4;
                }
                break;
            case 86:
                {
                alt70=5;
                }
                break;
            case 82:
                {
                alt70=6;
                }
                break;
            case 49:
                {
                alt70=7;
                }
                break;
            case 45:
                {
                alt70=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalMyAtl.g:4168:3: this_NavigatingExpCS_0= ruleNavigatingExpCS
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
                    // InternalMyAtl.g:4177:3: this_SelfExpCS_1= ruleSelfExpCS
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
                    // InternalMyAtl.g:4186:3: this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS
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
                    // InternalMyAtl.g:4195:3: this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS
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
                    // InternalMyAtl.g:4204:3: this_LetExpCS_4= ruleLetExpCS
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
                    // InternalMyAtl.g:4213:3: this_IfExpCS_5= ruleIfExpCS
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
                    // InternalMyAtl.g:4222:3: this_NestedExpCS_6= ruleNestedExpCS
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
                    // InternalMyAtl.g:4231:3: this_StringExpCs_7= ruleStringExpCs
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
    // InternalMyAtl.g:4243:1: entryRuleStringExpCs returns [EObject current=null] : iv_ruleStringExpCs= ruleStringExpCs EOF ;
    public final EObject entryRuleStringExpCs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpCs = null;


        try {
            // InternalMyAtl.g:4243:52: (iv_ruleStringExpCs= ruleStringExpCs EOF )
            // InternalMyAtl.g:4244:2: iv_ruleStringExpCs= ruleStringExpCs EOF
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
    // InternalMyAtl.g:4250:1: ruleStringExpCs returns [EObject current=null] : ( (lv_name_0_0= '...' ) ) ;
    public final EObject ruleStringExpCs() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyAtl.g:4256:2: ( ( (lv_name_0_0= '...' ) ) )
            // InternalMyAtl.g:4257:2: ( (lv_name_0_0= '...' ) )
            {
            // InternalMyAtl.g:4257:2: ( (lv_name_0_0= '...' ) )
            // InternalMyAtl.g:4258:3: (lv_name_0_0= '...' )
            {
            // InternalMyAtl.g:4258:3: (lv_name_0_0= '...' )
            // InternalMyAtl.g:4259:4: lv_name_0_0= '...'
            {
            lv_name_0_0=(Token)match(input,45,FOLLOW_2); 

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
    // InternalMyAtl.g:4274:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // InternalMyAtl.g:4274:50: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // InternalMyAtl.g:4275:2: iv_ruleNameExpCS= ruleNameExpCS EOF
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
    // InternalMyAtl.g:4281:1: ruleNameExpCS returns [EObject current=null] : ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) ;
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
            // InternalMyAtl.g:4287:2: ( ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) )
            // InternalMyAtl.g:4288:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            {
            // InternalMyAtl.g:4288:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_SIMPLE_ID) ) {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==80) ) {
                    alt72=1;
                }
                else if ( (LA72_1==EOF||LA72_1==18||(LA72_1>=21 && LA72_1<=23)||LA72_1==43||(LA72_1>=49 && LA72_1<=50)||LA72_1==52||LA72_1==57||LA72_1==59||LA72_1==61||(LA72_1>=63 && LA72_1<=75)||LA72_1==81||(LA72_1>=83 && LA72_1<=85)||LA72_1==87||(LA72_1>=89 && LA72_1<=90)) ) {
                    alt72=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalMyAtl.g:4289:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    {
                    // InternalMyAtl.g:4289:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    // InternalMyAtl.g:4290:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) )
                    {
                    // InternalMyAtl.g:4290:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* )
                    // InternalMyAtl.g:4291:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    {
                    // InternalMyAtl.g:4291:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) )
                    // InternalMyAtl.g:4292:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    {
                    // InternalMyAtl.g:4292:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    // InternalMyAtl.g:4293:7: lv_namespace_0_0= ruleUnrestrictedName
                    {

                    							newCompositeNode(grammarAccess.getNameExpCSAccess().getNamespaceUnrestrictedNameParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_51);
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

                    otherlv_1=(Token)match(input,80,FOLLOW_33); 

                    					newLeafNode(otherlv_1, grammarAccess.getNameExpCSAccess().getColonColonKeyword_0_0_1());
                    				
                    // InternalMyAtl.g:4314:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    loop71:
                    do {
                        int alt71=2;
                        alt71 = dfa71.predict(input);
                        switch (alt71) {
                    	case 1 :
                    	    // InternalMyAtl.g:4315:6: ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::'
                    	    {
                    	    // InternalMyAtl.g:4315:6: ( (lv_namespace_2_0= ruleUnreservedName ) )
                    	    // InternalMyAtl.g:4316:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    {
                    	    // InternalMyAtl.g:4316:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    // InternalMyAtl.g:4317:8: lv_namespace_2_0= ruleUnreservedName
                    	    {

                    	    								newCompositeNode(grammarAccess.getNameExpCSAccess().getNamespaceUnreservedNameParserRuleCall_0_0_2_0_0());
                    	    							
                    	    pushFollow(FOLLOW_51);
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

                    	    otherlv_3=(Token)match(input,80,FOLLOW_33); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getNameExpCSAccess().getColonColonKeyword_0_0_2_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);


                    }

                    // InternalMyAtl.g:4340:4: ( (lv_element_4_0= ruleUnreservedName ) )
                    // InternalMyAtl.g:4341:5: (lv_element_4_0= ruleUnreservedName )
                    {
                    // InternalMyAtl.g:4341:5: (lv_element_4_0= ruleUnreservedName )
                    // InternalMyAtl.g:4342:6: lv_element_4_0= ruleUnreservedName
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
                    // InternalMyAtl.g:4361:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    {
                    // InternalMyAtl.g:4361:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    // InternalMyAtl.g:4362:4: (lv_element_5_0= ruleUnrestrictedName )
                    {
                    // InternalMyAtl.g:4362:4: (lv_element_5_0= ruleUnrestrictedName )
                    // InternalMyAtl.g:4363:5: lv_element_5_0= ruleUnrestrictedName
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
    // InternalMyAtl.g:4384:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // InternalMyAtl.g:4384:46: (iv_ruleExpCS= ruleExpCS EOF )
            // InternalMyAtl.g:4385:2: iv_ruleExpCS= ruleExpCS EOF
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
    // InternalMyAtl.g:4391:1: ruleExpCS returns [EObject current=null] : this_InfixedExpCS_0= ruleInfixedExpCS ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixedExpCS_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4397:2: (this_InfixedExpCS_0= ruleInfixedExpCS )
            // InternalMyAtl.g:4398:2: this_InfixedExpCS_0= ruleInfixedExpCS
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
    // InternalMyAtl.g:4409:1: entryRuleInfixedExpCS returns [EObject current=null] : iv_ruleInfixedExpCS= ruleInfixedExpCS EOF ;
    public final EObject entryRuleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixedExpCS = null;


        try {
            // InternalMyAtl.g:4409:53: (iv_ruleInfixedExpCS= ruleInfixedExpCS EOF )
            // InternalMyAtl.g:4410:2: iv_ruleInfixedExpCS= ruleInfixedExpCS EOF
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
    // InternalMyAtl.g:4416:1: ruleInfixedExpCS returns [EObject current=null] : (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) ;
    public final EObject ruleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4422:2: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) )
            // InternalMyAtl.g:4423:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            {
            // InternalMyAtl.g:4423:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            // InternalMyAtl.g:4424:3: this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getInfixedExpCSAccess().getPrefixedExpCSParserRuleCall_0());
            		
            pushFollow(FOLLOW_58);
            this_PrefixedExpCS_0=rulePrefixedExpCS();

            state._fsp--;


            			current = this_PrefixedExpCS_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyAtl.g:4432:3: ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // InternalMyAtl.g:4433:4: () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    {
                    // InternalMyAtl.g:4433:4: ()
                    // InternalMyAtl.g:4434:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMyAtl.g:4440:4: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    int cnt73=0;
                    loop73:
                    do {
                        int alt73=2;
                        alt73 = dfa73.predict(input);
                        switch (alt73) {
                    	case 1 :
                    	    // InternalMyAtl.g:4441:5: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    {
                    	    // InternalMyAtl.g:4441:5: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) )
                    	    // InternalMyAtl.g:4442:6: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    {
                    	    // InternalMyAtl.g:4442:6: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    // InternalMyAtl.g:4443:7: lv_ownedOperator_2_0= ruleBinaryOperatorCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
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

                    	    // InternalMyAtl.g:4460:5: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    // InternalMyAtl.g:4461:6: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    {
                    	    // InternalMyAtl.g:4461:6: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    // InternalMyAtl.g:4462:7: lv_ownedExpression_3_0= rulePrefixedExpCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_58);
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
                    	    if ( cnt73 >= 1 ) break loop73;
                                EarlyExitException eee =
                                    new EarlyExitException(73, input);
                                throw eee;
                        }
                        cnt73++;
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
    // InternalMyAtl.g:4485:1: entryRuleBinaryOperatorCS returns [EObject current=null] : iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF ;
    public final EObject entryRuleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperatorCS = null;


        try {
            // InternalMyAtl.g:4485:57: (iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF )
            // InternalMyAtl.g:4486:2: iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF
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
    // InternalMyAtl.g:4492:1: ruleBinaryOperatorCS returns [EObject current=null] : (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) ;
    public final EObject ruleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixOperatorCS_0 = null;

        EObject this_NavigationOperatorCS_1 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4498:2: ( (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) )
            // InternalMyAtl.g:4499:2: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            {
            // InternalMyAtl.g:4499:2: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==52||LA75_0==61||(LA75_0>=63 && LA75_0<=74)) ) {
                alt75=1;
            }
            else if ( (LA75_0==59||LA75_0==75) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalMyAtl.g:4500:3: this_InfixOperatorCS_0= ruleInfixOperatorCS
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
                    // InternalMyAtl.g:4509:3: this_NavigationOperatorCS_1= ruleNavigationOperatorCS
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
    // InternalMyAtl.g:4521:1: entryRuleInfixOperatorCS returns [EObject current=null] : iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF ;
    public final EObject entryRuleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOperatorCS = null;


        try {
            // InternalMyAtl.g:4521:56: (iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF )
            // InternalMyAtl.g:4522:2: iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF
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
    // InternalMyAtl.g:4528:1: ruleInfixOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleInfixOperator ) ) ;
    public final EObject ruleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4534:2: ( ( (lv_name_0_0= ruleInfixOperator ) ) )
            // InternalMyAtl.g:4535:2: ( (lv_name_0_0= ruleInfixOperator ) )
            {
            // InternalMyAtl.g:4535:2: ( (lv_name_0_0= ruleInfixOperator ) )
            // InternalMyAtl.g:4536:3: (lv_name_0_0= ruleInfixOperator )
            {
            // InternalMyAtl.g:4536:3: (lv_name_0_0= ruleInfixOperator )
            // InternalMyAtl.g:4537:4: lv_name_0_0= ruleInfixOperator
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
    // InternalMyAtl.g:4557:1: entryRuleNavigationOperatorCS returns [EObject current=null] : iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF ;
    public final EObject entryRuleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationOperatorCS = null;


        try {
            // InternalMyAtl.g:4557:61: (iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF )
            // InternalMyAtl.g:4558:2: iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF
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
    // InternalMyAtl.g:4564:1: ruleNavigationOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleNavigationOperator ) ) ;
    public final EObject ruleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4570:2: ( ( (lv_name_0_0= ruleNavigationOperator ) ) )
            // InternalMyAtl.g:4571:2: ( (lv_name_0_0= ruleNavigationOperator ) )
            {
            // InternalMyAtl.g:4571:2: ( (lv_name_0_0= ruleNavigationOperator ) )
            // InternalMyAtl.g:4572:3: (lv_name_0_0= ruleNavigationOperator )
            {
            // InternalMyAtl.g:4572:3: (lv_name_0_0= ruleNavigationOperator )
            // InternalMyAtl.g:4573:4: lv_name_0_0= ruleNavigationOperator
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
    // InternalMyAtl.g:4593:1: entryRulePrefixedExpCS returns [EObject current=null] : iv_rulePrefixedExpCS= rulePrefixedExpCS EOF ;
    public final EObject entryRulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedExpCS = null;


        try {
            // InternalMyAtl.g:4593:54: (iv_rulePrefixedExpCS= rulePrefixedExpCS EOF )
            // InternalMyAtl.g:4594:2: iv_rulePrefixedExpCS= rulePrefixedExpCS EOF
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
    // InternalMyAtl.g:4600:1: rulePrefixedExpCS returns [EObject current=null] : (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) ;
    public final EObject rulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4606:2: ( (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) )
            // InternalMyAtl.g:4607:2: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            {
            // InternalMyAtl.g:4607:2: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=RULE_SIMPLE_ID && LA77_0<=RULE_BIG_INT)||LA77_0==26||LA77_0==45||LA77_0==49||LA77_0==63||(LA77_0>=76 && LA77_0<=79)||LA77_0==82||LA77_0==86||LA77_0==88) ) {
                alt77=1;
            }
            else if ( ((LA77_0>=61 && LA77_0<=62)) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalMyAtl.g:4608:3: this_PrimaryExpCS_0= rulePrimaryExpCS
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
                    // InternalMyAtl.g:4617:3: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    {
                    // InternalMyAtl.g:4617:3: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    // InternalMyAtl.g:4618:4: () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    {
                    // InternalMyAtl.g:4618:4: ()
                    // InternalMyAtl.g:4619:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrefixedExpCSAccess().getPrefixExpCSAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMyAtl.g:4625:4: ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+
                    int cnt76=0;
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( ((LA76_0>=61 && LA76_0<=62)) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalMyAtl.g:4626:5: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    {
                    	    // InternalMyAtl.g:4626:5: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    // InternalMyAtl.g:4627:6: lv_ownedOperator_2_0= ruleUnaryOperatorCS
                    	    {

                    	    						newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
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
                    	    if ( cnt76 >= 1 ) break loop76;
                                EarlyExitException eee =
                                    new EarlyExitException(76, input);
                                throw eee;
                        }
                        cnt76++;
                    } while (true);

                    // InternalMyAtl.g:4644:4: ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    // InternalMyAtl.g:4645:5: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    {
                    // InternalMyAtl.g:4645:5: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    // InternalMyAtl.g:4646:6: lv_ownedExpression_3_0= rulePrimaryExpCS
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
    // InternalMyAtl.g:4668:1: entryRuleUnaryOperatorCS returns [EObject current=null] : iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF ;
    public final EObject entryRuleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperatorCS = null;


        try {
            // InternalMyAtl.g:4668:56: (iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF )
            // InternalMyAtl.g:4669:2: iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF
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
    // InternalMyAtl.g:4675:1: ruleUnaryOperatorCS returns [EObject current=null] : ( (lv_name_0_0= rulePrefixOperator ) ) ;
    public final EObject ruleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4681:2: ( ( (lv_name_0_0= rulePrefixOperator ) ) )
            // InternalMyAtl.g:4682:2: ( (lv_name_0_0= rulePrefixOperator ) )
            {
            // InternalMyAtl.g:4682:2: ( (lv_name_0_0= rulePrefixOperator ) )
            // InternalMyAtl.g:4683:3: (lv_name_0_0= rulePrefixOperator )
            {
            // InternalMyAtl.g:4683:3: (lv_name_0_0= rulePrefixOperator )
            // InternalMyAtl.g:4684:4: lv_name_0_0= rulePrefixOperator
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
    // InternalMyAtl.g:4704:1: entryRuleIndexExpCS returns [EObject current=null] : iv_ruleIndexExpCS= ruleIndexExpCS EOF ;
    public final EObject entryRuleIndexExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexExpCS = null;


        try {
            // InternalMyAtl.g:4704:51: (iv_ruleIndexExpCS= ruleIndexExpCS EOF )
            // InternalMyAtl.g:4705:2: iv_ruleIndexExpCS= ruleIndexExpCS EOF
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
    // InternalMyAtl.g:4711:1: ruleIndexExpCS returns [EObject current=null] : (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? ) ;
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
            // InternalMyAtl.g:4717:2: ( (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? ) )
            // InternalMyAtl.g:4718:2: (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? )
            {
            // InternalMyAtl.g:4718:2: (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? )
            // InternalMyAtl.g:4719:3: this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )?
            {

            			newCompositeNode(grammarAccess.getIndexExpCSAccess().getNameExpCSParserRuleCall_0());
            		
            pushFollow(FOLLOW_59);
            this_NameExpCS_0=ruleNameExpCS();

            state._fsp--;


            			current = this_NameExpCS_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyAtl.g:4727:3: ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==89) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalMyAtl.g:4728:4: () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )?
                    {
                    // InternalMyAtl.g:4728:4: ()
                    // InternalMyAtl.g:4729:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getIndexExpCSAccess().getIndexExpCSNamedExpAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,89,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    // InternalMyAtl.g:4739:4: ( (lv_firstIndexes_3_0= ruleExpCS ) )
                    // InternalMyAtl.g:4740:5: (lv_firstIndexes_3_0= ruleExpCS )
                    {
                    // InternalMyAtl.g:4740:5: (lv_firstIndexes_3_0= ruleExpCS )
                    // InternalMyAtl.g:4741:6: lv_firstIndexes_3_0= ruleExpCS
                    {

                    						newCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_60);
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

                    // InternalMyAtl.g:4758:4: (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==22) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalMyAtl.g:4759:5: otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_21); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalMyAtl.g:4763:5: ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    // InternalMyAtl.g:4764:6: (lv_firstIndexes_5_0= ruleExpCS )
                    	    {
                    	    // InternalMyAtl.g:4764:6: (lv_firstIndexes_5_0= ruleExpCS )
                    	    // InternalMyAtl.g:4765:7: lv_firstIndexes_5_0= ruleExpCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_60);
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
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,90,FOLLOW_59); 

                    				newLeafNode(otherlv_6, grammarAccess.getIndexExpCSAccess().getRightSquareBracketKeyword_1_4());
                    			
                    // InternalMyAtl.g:4787:4: (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==89) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalMyAtl.g:4788:5: otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']'
                            {
                            otherlv_7=(Token)match(input,89,FOLLOW_21); 

                            					newLeafNode(otherlv_7, grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_5_0());
                            				
                            // InternalMyAtl.g:4792:5: ( (lv_secondIndexes_8_0= ruleExpCS ) )
                            // InternalMyAtl.g:4793:6: (lv_secondIndexes_8_0= ruleExpCS )
                            {
                            // InternalMyAtl.g:4793:6: (lv_secondIndexes_8_0= ruleExpCS )
                            // InternalMyAtl.g:4794:7: lv_secondIndexes_8_0= ruleExpCS
                            {

                            							newCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_1_0());
                            						
                            pushFollow(FOLLOW_60);
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

                            // InternalMyAtl.g:4811:5: (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )*
                            loop79:
                            do {
                                int alt79=2;
                                int LA79_0 = input.LA(1);

                                if ( (LA79_0==22) ) {
                                    alt79=1;
                                }


                                switch (alt79) {
                            	case 1 :
                            	    // InternalMyAtl.g:4812:6: otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    {
                            	    otherlv_9=(Token)match(input,22,FOLLOW_21); 

                            	    						newLeafNode(otherlv_9, grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_5_2_0());
                            	    					
                            	    // InternalMyAtl.g:4816:6: ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    // InternalMyAtl.g:4817:7: (lv_secondIndexes_10_0= ruleExpCS )
                            	    {
                            	    // InternalMyAtl.g:4817:7: (lv_secondIndexes_10_0= ruleExpCS )
                            	    // InternalMyAtl.g:4818:8: lv_secondIndexes_10_0= ruleExpCS
                            	    {

                            	    								newCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_60);
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
                            	    break loop79;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,90,FOLLOW_2); 

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
    // InternalMyAtl.g:4846:1: entryRuleNavigatingExpCS_Base returns [EObject current=null] : iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF ;
    public final EObject entryRuleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS_Base = null;


        try {
            // InternalMyAtl.g:4846:61: (iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF )
            // InternalMyAtl.g:4847:2: iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF
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
    // InternalMyAtl.g:4853:1: ruleNavigatingExpCS_Base returns [EObject current=null] : this_IndexExpCS_0= ruleIndexExpCS ;
    public final EObject ruleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject this_IndexExpCS_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4859:2: (this_IndexExpCS_0= ruleIndexExpCS )
            // InternalMyAtl.g:4860:2: this_IndexExpCS_0= ruleIndexExpCS
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
    // InternalMyAtl.g:4871:1: entryRuleNavigatingExpCS returns [EObject current=null] : iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF ;
    public final EObject entryRuleNavigatingExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS = null;


        try {
            // InternalMyAtl.g:4871:56: (iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF )
            // InternalMyAtl.g:4872:2: iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF
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
    // InternalMyAtl.g:4878:1: ruleNavigatingExpCS returns [EObject current=null] : (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? ) ;
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
            // InternalMyAtl.g:4884:2: ( (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? ) )
            // InternalMyAtl.g:4885:2: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? )
            {
            // InternalMyAtl.g:4885:2: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? )
            // InternalMyAtl.g:4886:3: this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )?
            {

            			newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCS_BaseParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_NavigatingExpCS_Base_0=ruleNavigatingExpCS_Base();

            state._fsp--;


            			current = this_NavigatingExpCS_Base_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyAtl.g:4894:3: ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==49) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalMyAtl.g:4895:4: () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')'
                    {
                    // InternalMyAtl.g:4895:4: ()
                    // InternalMyAtl.g:4896:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCSNamedExpAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,49,FOLLOW_35); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingExpCSAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalMyAtl.g:4906:4: ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( ((LA87_0>=RULE_SIMPLE_ID && LA87_0<=RULE_BIG_INT)||LA87_0==26||LA87_0==45||LA87_0==49||(LA87_0>=61 && LA87_0<=63)||(LA87_0>=76 && LA87_0<=79)||LA87_0==82||LA87_0==86||LA87_0==88) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalMyAtl.g:4907:5: ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )?
                            {
                            // InternalMyAtl.g:4907:5: ( (lv_argument_3_0= ruleNavigatingArgCS ) )
                            // InternalMyAtl.g:4908:6: (lv_argument_3_0= ruleNavigatingArgCS )
                            {
                            // InternalMyAtl.g:4908:6: (lv_argument_3_0= ruleNavigatingArgCS )
                            // InternalMyAtl.g:4909:7: lv_argument_3_0= ruleNavigatingArgCS
                            {

                            							newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingArgCSParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_61);
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

                            // InternalMyAtl.g:4926:5: ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )*
                            loop82:
                            do {
                                int alt82=2;
                                int LA82_0 = input.LA(1);

                                if ( (LA82_0==22) ) {
                                    alt82=1;
                                }


                                switch (alt82) {
                            	case 1 :
                            	    // InternalMyAtl.g:4927:6: (lv_argument_4_0= ruleNavigatingCommaArgCS )
                            	    {
                            	    // InternalMyAtl.g:4927:6: (lv_argument_4_0= ruleNavigatingCommaArgCS )
                            	    // InternalMyAtl.g:4928:7: lv_argument_4_0= ruleNavigatingCommaArgCS
                            	    {

                            	    							newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_61);
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
                            	    break loop82;
                                }
                            } while (true);

                            // InternalMyAtl.g:4945:5: ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )?
                            int alt84=2;
                            int LA84_0 = input.LA(1);

                            if ( (LA84_0==18) ) {
                                alt84=1;
                            }
                            switch (alt84) {
                                case 1 :
                                    // InternalMyAtl.g:4946:6: ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )*
                                    {
                                    // InternalMyAtl.g:4946:6: ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) )
                                    // InternalMyAtl.g:4947:7: (lv_argument_5_0= ruleNavigatingSemiArgCS )
                                    {
                                    // InternalMyAtl.g:4947:7: (lv_argument_5_0= ruleNavigatingSemiArgCS )
                                    // InternalMyAtl.g:4948:8: lv_argument_5_0= ruleNavigatingSemiArgCS
                                    {

                                    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingSemiArgCSParserRuleCall_1_2_2_0_0());
                                    							
                                    pushFollow(FOLLOW_62);
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

                                    // InternalMyAtl.g:4965:6: ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )*
                                    loop83:
                                    do {
                                        int alt83=2;
                                        int LA83_0 = input.LA(1);

                                        if ( (LA83_0==22) ) {
                                            alt83=1;
                                        }


                                        switch (alt83) {
                                    	case 1 :
                                    	    // InternalMyAtl.g:4966:7: (lv_argument_6_0= ruleNavigatingCommaArgCS )
                                    	    {
                                    	    // InternalMyAtl.g:4966:7: (lv_argument_6_0= ruleNavigatingCommaArgCS )
                                    	    // InternalMyAtl.g:4967:8: lv_argument_6_0= ruleNavigatingCommaArgCS
                                    	    {

                                    	    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_2_1_0());
                                    	    							
                                    	    pushFollow(FOLLOW_62);
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
                                    	    break loop83;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            // InternalMyAtl.g:4985:5: ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )?
                            int alt86=2;
                            int LA86_0 = input.LA(1);

                            if ( (LA86_0==81) ) {
                                alt86=1;
                            }
                            switch (alt86) {
                                case 1 :
                                    // InternalMyAtl.g:4986:6: ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )*
                                    {
                                    // InternalMyAtl.g:4986:6: ( (lv_argument_7_0= ruleNavigatingBarArgCS ) )
                                    // InternalMyAtl.g:4987:7: (lv_argument_7_0= ruleNavigatingBarArgCS )
                                    {
                                    // InternalMyAtl.g:4987:7: (lv_argument_7_0= ruleNavigatingBarArgCS )
                                    // InternalMyAtl.g:4988:8: lv_argument_7_0= ruleNavigatingBarArgCS
                                    {

                                    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingBarArgCSParserRuleCall_1_2_3_0_0());
                                    							
                                    pushFollow(FOLLOW_29);
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

                                    // InternalMyAtl.g:5005:6: ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )*
                                    loop85:
                                    do {
                                        int alt85=2;
                                        int LA85_0 = input.LA(1);

                                        if ( (LA85_0==22) ) {
                                            alt85=1;
                                        }


                                        switch (alt85) {
                                    	case 1 :
                                    	    // InternalMyAtl.g:5006:7: (lv_argument_8_0= ruleNavigatingCommaArgCS )
                                    	    {
                                    	    // InternalMyAtl.g:5006:7: (lv_argument_8_0= ruleNavigatingCommaArgCS )
                                    	    // InternalMyAtl.g:5007:8: lv_argument_8_0= ruleNavigatingCommaArgCS
                                    	    {

                                    	    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_3_1_0());
                                    	    							
                                    	    pushFollow(FOLLOW_29);
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
                                    	    break loop85;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,50,FOLLOW_2); 

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
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA73 dfa73 = new DFA73(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\4\31\uffff";
    static final String dfa_3s = "\1\22\1\4\3\uffff\1\53\1\51\2\uffff\1\4\17\53\1\4";
    static final String dfa_4s = "\1\121\1\130\3\uffff\1\131\1\114\2\uffff\1\47\17\131\1\47";
    static final String dfa_5s = "\2\uffff\1\1\1\2\1\3\2\uffff\2\1\21\uffff";
    static final String dfa_6s = "\32\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\3\uffff\1\4\22\uffff\1\2\5\4\2\uffff\1\1\1\4\1\uffff\1\4\15\uffff\1\4\1\3\15\uffff\1\4",
            "\1\5\2\4\23\uffff\1\6\15\7\3\uffff\1\7\1\uffff\1\4\3\uffff\1\4\1\7\12\uffff\3\4\14\uffff\4\4\2\uffff\1\4\3\uffff\1\4\1\uffff\1\4",
            "",
            "",
            "",
            "\1\10\5\uffff\1\4\1\10\1\uffff\1\4\5\uffff\2\4\1\uffff\1\4\1\uffff\15\4\4\uffff\1\11\10\uffff\1\4",
            "\1\4\7\uffff\1\10\21\uffff\1\10\10\uffff\1\10",
            "",
            "",
            "\1\12\25\uffff\1\30\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\13\1\14\1\15\1\16\1\17",
            "\1\10\5\uffff\1\4\1\10\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff\15\4\4\uffff\1\31\10\uffff\1\4",
            "\1\10\5\uffff\1\4\1\10\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff\15\4\4\uffff\1\31\10\uffff\1\4",
            "\1\10\5\uffff\1\4\1\10\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff\15\4\4\uffff\1\31\10\uffff\1\4",
            "\1\10\5\uffff\1\4\1\10\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff\15\4\4\uffff\1\31\10\uffff\1\4",
            "\1\10\5\uffff\1\4\1\10\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff\15\4\4\uffff\1\31\10\uffff\1\4",
            "\1\10\5\uffff\1\4\1\10\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff\15\4\4\uffff\1\31\10\uffff\1\4",
            "\1\10\5\uffff\1\4\1\10\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff\15\4\4\uffff\1\31\10\uffff\1\4",
            "\1\10\5\uffff\1\4\1\10\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff\15\4\4\uffff\1\31\10\uffff\1\4",
            "\1\10\5\uffff\1\4\1\10\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff\15\4\4\uffff\1\31\10\uffff\1\4",
            "\1\10\5\uffff\1\4\1\10\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff\15\4\4\uffff\1\31\10\uffff\1\4",
            "\1\10\5\uffff\1\4\1\10\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff\15\4\4\uffff\1\31\10\uffff\1\4",
            "\1\10\5\uffff\1\4\1\10\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff\15\4\4\uffff\1\31\10\uffff\1\4",
            "\1\10\5\uffff\1\4\1\10\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff\15\4\4\uffff\1\31\10\uffff\1\4",
            "\1\10\5\uffff\1\4\1\10\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff\15\4\4\uffff\1\31\10\uffff\1\4",
            "\1\10\5\uffff\1\4\1\10\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff\15\4\4\uffff\1\31\10\uffff\1\4",
            "\1\12\25\uffff\1\30\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\13\1\14\1\15\1\16\1\17"
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
            return "2419:3: ( ( (otherlv_1= '(' | otherlv_2= '{' ) ( (lv_ownedType_3_0= ruleTypeExpCS ) )? (otherlv_4= ')' | otherlv_5= '}' ) ) | (otherlv_6= '<' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) otherlv_8= '>' ) )?";
        }
    }
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\1\uffff\17\20\2\uffff";
    static final String dfa_10s = "\1\4\17\22\2\uffff";
    static final String dfa_11s = "\1\47\17\121\2\uffff";
    static final String dfa_12s = "\20\uffff\1\2\1\1";
    static final String dfa_13s = "\22\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\25\uffff\1\17\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\2\1\3\1\4\1\5\1\6",
            "\1\20\3\uffff\1\20\23\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\15\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\23\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\15\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\23\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\15\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\23\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\15\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\23\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\15\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\23\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\15\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\23\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\15\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\23\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\15\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\23\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\15\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\23\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\15\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\23\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\15\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\23\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\15\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\23\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\15\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\23\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\15\uffff\1\21\1\20",
            "\1\20\3\uffff\1\20\23\uffff\5\20\2\uffff\2\20\1\uffff\1\20\15\uffff\1\20\15\uffff\1\21\1\20",
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

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 3284:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*";
        }
    }
    static final String dfa_15s = "\1\uffff\17\21\2\uffff";
    static final String dfa_16s = "\1\47\17\132\2\uffff";
    static final String dfa_17s = "\20\uffff\1\1\1\2";
    static final String[] dfa_18s = {
            "\1\1\25\uffff\1\17\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\2\1\3\1\4\1\5\1\6",
            "\1\21\2\uffff\3\21\23\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\4\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\23\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\4\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\23\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\4\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\23\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\4\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\23\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\4\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\23\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\4\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\23\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\4\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\23\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\4\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\23\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\4\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\23\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\4\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\23\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\4\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\23\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\4\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\23\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\4\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\23\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\4\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\23\uffff\1\21\5\uffff\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\4\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "",
            ""
    };
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_8;
            this.eof = dfa_15;
            this.min = dfa_10;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_13;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "()* loopback of 4314:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*";
        }
    }
    static final String dfa_19s = "\1\21\21\uffff";
    static final String dfa_20s = "\1\22\21\uffff";
    static final String dfa_21s = "\1\132\21\uffff";
    static final String dfa_22s = "\1\uffff\20\1\1\2";
    static final String[] dfa_23s = {
            "\1\21\2\uffff\2\21\24\uffff\1\21\6\uffff\1\21\1\uffff\1\11\4\uffff\1\21\1\uffff\1\17\1\uffff\1\4\1\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\12\1\13\1\14\1\15\1\16\1\20\5\uffff\1\21\1\uffff\3\21\1\uffff\1\21\2\uffff\1\21",
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
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = dfa_8;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_13;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "4432:3: ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?";
        }
    }
    static final String dfa_24s = "\1\1\21\uffff";
    static final String dfa_25s = "\1\uffff\1\2\20\1";
    static final String[] dfa_26s = {
            "\1\1\2\uffff\2\1\24\uffff\1\1\6\uffff\1\1\1\uffff\1\3\4\uffff\1\1\1\uffff\1\2\1\uffff\1\7\1\uffff\1\4\1\5\1\6\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\5\uffff\1\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1",
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
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_8;
            this.eof = dfa_24;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_25;
            this.special = dfa_13;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()+ loopback of 4440:4: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+";
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0029810002000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0029810000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000680000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000480000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xE002200004000070L,0x000000000144F000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00C0000000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000FFFC000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0xE006200004000070L,0x000000000144F000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xE002200004000072L,0x000000000144F000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002020000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000408FFFC000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004080000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000000000L,0x0000000000001008L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000004L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000200000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000200002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000400000L,0x0000000000800000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0xA810000000000002L,0x0000000000000FFFL});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000400000L,0x0000000004000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0004000000440000L,0x0000000000020000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0004000000400000L,0x0000000000020000L});

}