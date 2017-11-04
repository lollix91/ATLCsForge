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
import org.xtext.example.mydsl.services.MyATLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyATLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SIMPLE_ID", "RULE_SINGLE_QUOTED_STRING", "RULE_BIG_INT", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_DOCUMENTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "RULE_ID", "RULE_INT", "RULE_STRING", "'module'", "';'", "'create'", "'OUT'", "':'", "','", "'from'", "'IN'", "'Tuple'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'rule'", "'{'", "'using'", "'}'", "'to'", "'do'", "'entrypoint'", "'('", "')'", "'helper'", "'context'", "'def'", "'='", "'xxx'", "'yyy'", "'<-'", "'.'", "'!'", "'-'", "'not'", "'*'", "'/'", "'+'", "'>'", "'<'", "'>='", "'<='", "'<>'", "'and'", "'or'", "'xor'", "'implies'", "'->'", "'true'", "'..'", "'false'", "'invalid'", "'null'", "'::'", "'|'", "'if'", "'then'", "'else'", "'endif'", "'let'", "'in'", "'self'", "'['", "']'"
    };
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


        public InternalMyATLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyATLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyATLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyATL.g"; }



     	private MyATLGrammarAccess grammarAccess;

        public InternalMyATLParser(TokenStream input, MyATLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Module";
       	}

       	@Override
       	protected MyATLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModule"
    // InternalMyATL.g:64:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalMyATL.g:64:47: (iv_ruleModule= ruleModule EOF )
            // InternalMyATL.g:65:2: iv_ruleModule= ruleModule EOF
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
    // InternalMyATL.g:71:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' otherlv_10= 'IN' otherlv_11= ':' ( (lv_inModels_12_0= ruleNameExpCS ) ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* otherlv_15= ';' ( (lv_elements_16_0= ruleModuleElement ) )* ) ;
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_outModels_6_0 = null;

        EObject lv_outModels_8_0 = null;

        EObject lv_inModels_12_0 = null;

        EObject lv_inModels_14_0 = null;

        EObject lv_elements_16_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:77:2: ( (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' otherlv_10= 'IN' otherlv_11= ':' ( (lv_inModels_12_0= ruleNameExpCS ) ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* otherlv_15= ';' ( (lv_elements_16_0= ruleModuleElement ) )* ) )
            // InternalMyATL.g:78:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' otherlv_10= 'IN' otherlv_11= ':' ( (lv_inModels_12_0= ruleNameExpCS ) ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* otherlv_15= ';' ( (lv_elements_16_0= ruleModuleElement ) )* )
            {
            // InternalMyATL.g:78:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' otherlv_10= 'IN' otherlv_11= ':' ( (lv_inModels_12_0= ruleNameExpCS ) ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* otherlv_15= ';' ( (lv_elements_16_0= ruleModuleElement ) )* )
            // InternalMyATL.g:79:3: otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' otherlv_10= 'IN' otherlv_11= ':' ( (lv_inModels_12_0= ruleNameExpCS ) ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* otherlv_15= ';' ( (lv_elements_16_0= ruleModuleElement ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
            		
            // InternalMyATL.g:83:3: ( (lv_name_1_0= ruleUnrestrictedName ) )
            // InternalMyATL.g:84:4: (lv_name_1_0= ruleUnrestrictedName )
            {
            // InternalMyATL.g:84:4: (lv_name_1_0= ruleUnrestrictedName )
            // InternalMyATL.g:85:5: lv_name_1_0= ruleUnrestrictedName
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
            						"org.xtext.example.mydsl.MyATL.UnrestrictedName");
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
            		
            // InternalMyATL.g:118:3: ( (lv_outModels_6_0= ruleNameExpCS ) )
            // InternalMyATL.g:119:4: (lv_outModels_6_0= ruleNameExpCS )
            {
            // InternalMyATL.g:119:4: (lv_outModels_6_0= ruleNameExpCS )
            // InternalMyATL.g:120:5: lv_outModels_6_0= ruleNameExpCS
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
            						"org.xtext.example.mydsl.MyATL.NameExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:137:3: (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyATL.g:138:4: otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getModuleAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyATL.g:142:4: ( (lv_outModels_8_0= ruleNameExpCS ) )
            	    // InternalMyATL.g:143:5: (lv_outModels_8_0= ruleNameExpCS )
            	    {
            	    // InternalMyATL.g:143:5: (lv_outModels_8_0= ruleNameExpCS )
            	    // InternalMyATL.g:144:6: lv_outModels_8_0= ruleNameExpCS
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
            	    							"org.xtext.example.mydsl.MyATL.NameExpCS");
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
            		
            // InternalMyATL.g:174:3: ( (lv_inModels_12_0= ruleNameExpCS ) )
            // InternalMyATL.g:175:4: (lv_inModels_12_0= ruleNameExpCS )
            {
            // InternalMyATL.g:175:4: (lv_inModels_12_0= ruleNameExpCS )
            // InternalMyATL.g:176:5: lv_inModels_12_0= ruleNameExpCS
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
            						"org.xtext.example.mydsl.MyATL.NameExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:193:3: (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyATL.g:194:4: otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) )
            	    {
            	    otherlv_13=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_13, grammarAccess.getModuleAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalMyATL.g:198:4: ( (lv_inModels_14_0= ruleNameExpCS ) )
            	    // InternalMyATL.g:199:5: (lv_inModels_14_0= ruleNameExpCS )
            	    {
            	    // InternalMyATL.g:199:5: (lv_inModels_14_0= ruleNameExpCS )
            	    // InternalMyATL.g:200:6: lv_inModels_14_0= ruleNameExpCS
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
            	    							"org.xtext.example.mydsl.MyATL.NameExpCS");
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
            		
            // InternalMyATL.g:222:3: ( (lv_elements_16_0= ruleModuleElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==39||LA3_0==45||LA3_0==48) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyATL.g:223:4: (lv_elements_16_0= ruleModuleElement )
            	    {
            	    // InternalMyATL.g:223:4: (lv_elements_16_0= ruleModuleElement )
            	    // InternalMyATL.g:224:5: lv_elements_16_0= ruleModuleElement
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getElementsModuleElementParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_elements_16_0=ruleModuleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_16_0,
            	    						"org.xtext.example.mydsl.MyATL.ModuleElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalMyATL.g:245:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // InternalMyATL.g:245:66: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // InternalMyATL.g:246:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
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
    // InternalMyATL.g:252:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;



        	enterRule();

        try {
            // InternalMyATL.g:258:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) )
            // InternalMyATL.g:259:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            {
            // InternalMyATL.g:259:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
                {
                alt4=1;
                }
                break;
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt4=2;
                }
                break;
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyATL.g:260:3: this_UnrestrictedName_0= ruleUnrestrictedName
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
                    // InternalMyATL.g:271:3: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
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
                    // InternalMyATL.g:282:3: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
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
                    // InternalMyATL.g:293:3: kw= 'Tuple'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

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
    // InternalMyATL.g:302:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // InternalMyATL.g:302:54: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // InternalMyATL.g:303:2: iv_ruleUnreservedName= ruleUnreservedName EOF
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
    // InternalMyATL.g:309:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:315:2: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // InternalMyATL.g:316:2: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
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
    // InternalMyATL.g:329:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // InternalMyATL.g:329:63: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // InternalMyATL.g:330:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
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
    // InternalMyATL.g:336:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyATL.g:342:2: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // InternalMyATL.g:343:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // InternalMyATL.g:343:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 29:
                {
                alt5=4;
                }
                break;
            case 30:
                {
                alt5=5;
                }
                break;
            case 31:
                {
                alt5=6;
                }
                break;
            case 32:
                {
                alt5=7;
                }
                break;
            case 33:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyATL.g:344:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyATL.g:350:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyATL.g:356:3: kw= 'Real'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyATL.g:362:3: kw= 'String'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyATL.g:368:3: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyATL.g:374:3: kw= 'OclAny'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyATL.g:380:3: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyATL.g:386:3: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

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
    // InternalMyATL.g:395:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // InternalMyATL.g:395:64: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // InternalMyATL.g:396:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
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
    // InternalMyATL.g:402:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyATL.g:408:2: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // InternalMyATL.g:409:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // InternalMyATL.g:409:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt6=1;
                }
                break;
            case 35:
                {
                alt6=2;
                }
                break;
            case 36:
                {
                alt6=3;
                }
                break;
            case 37:
                {
                alt6=4;
                }
                break;
            case 38:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyATL.g:410:3: kw= 'Set'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyATL.g:416:3: kw= 'Bag'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyATL.g:422:3: kw= 'Sequence'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyATL.g:428:3: kw= 'Collection'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyATL.g:434:3: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

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
    // InternalMyATL.g:443:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // InternalMyATL.g:443:56: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // InternalMyATL.g:444:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
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
    // InternalMyATL.g:450:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:456:2: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // InternalMyATL.g:457:2: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
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
    // InternalMyATL.g:470:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // InternalMyATL.g:470:68: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // InternalMyATL.g:471:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
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
    // InternalMyATL.g:477:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SIMPLE_ID_0= RULE_SIMPLE_ID ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;


        	enterRule();

        try {
            // InternalMyATL.g:483:2: (this_SIMPLE_ID_0= RULE_SIMPLE_ID )
            // InternalMyATL.g:484:2: this_SIMPLE_ID_0= RULE_SIMPLE_ID
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
    // InternalMyATL.g:494:1: entryRuleModuleElement returns [EObject current=null] : iv_ruleModuleElement= ruleModuleElement EOF ;
    public final EObject entryRuleModuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleElement = null;


        try {
            // InternalMyATL.g:494:54: (iv_ruleModuleElement= ruleModuleElement EOF )
            // InternalMyATL.g:495:2: iv_ruleModuleElement= ruleModuleElement EOF
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
    // InternalMyATL.g:501:1: ruleModuleElement returns [EObject current=null] : (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule ) ;
    public final EObject ruleModuleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Helper_0 = null;

        EObject this_MatchedRule_1 = null;

        EObject this_CalledRule_2 = null;



        	enterRule();

        try {
            // InternalMyATL.g:507:2: ( (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule ) )
            // InternalMyATL.g:508:2: (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule )
            {
            // InternalMyATL.g:508:2: (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt7=1;
                }
                break;
            case 39:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==RULE_SIMPLE_ID) ) {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==46) ) {
                        alt7=3;
                    }
                    else if ( (LA7_4==40) ) {
                        int LA7_5 = input.LA(4);

                        if ( (LA7_5==41||LA7_5==43) ) {
                            alt7=3;
                        }
                        else if ( (LA7_5==23) ) {
                            alt7=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyATL.g:509:3: this_Helper_0= ruleHelper
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
                    // InternalMyATL.g:518:3: this_MatchedRule_1= ruleMatchedRule
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
                    // InternalMyATL.g:527:3: this_CalledRule_2= ruleCalledRule
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
    // InternalMyATL.g:539:1: entryRuleMatchedRule returns [EObject current=null] : iv_ruleMatchedRule= ruleMatchedRule EOF ;
    public final EObject entryRuleMatchedRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchedRule = null;


        try {
            // InternalMyATL.g:539:52: (iv_ruleMatchedRule= ruleMatchedRule EOF )
            // InternalMyATL.g:540:2: iv_ruleMatchedRule= ruleMatchedRule EOF
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
    // InternalMyATL.g:546:1: ruleMatchedRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // InternalMyATL.g:552:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalMyATL.g:553:2: (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalMyATL.g:553:2: (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )? otherlv_15= '}' )
            // InternalMyATL.g:554:3: otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchedRuleAccess().getRuleKeyword_0());
            		
            // InternalMyATL.g:558:3: ( (lv_name_1_0= ruleUnrestrictedName ) )
            // InternalMyATL.g:559:4: (lv_name_1_0= ruleUnrestrictedName )
            {
            // InternalMyATL.g:559:4: (lv_name_1_0= ruleUnrestrictedName )
            // InternalMyATL.g:560:5: lv_name_1_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getMatchedRuleAccess().getNameUnrestrictedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatchedRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyATL.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMatchedRuleAccess().getFromKeyword_3());
            		
            // InternalMyATL.g:585:3: ( (lv_inPattern_4_0= ruleInPattern ) )
            // InternalMyATL.g:586:4: (lv_inPattern_4_0= ruleInPattern )
            {
            // InternalMyATL.g:586:4: (lv_inPattern_4_0= ruleInPattern )
            // InternalMyATL.g:587:5: lv_inPattern_4_0= ruleInPattern
            {

            					newCompositeNode(grammarAccess.getMatchedRuleAccess().getInPatternInPatternParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_inPattern_4_0=ruleInPattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatchedRuleRule());
            					}
            					set(
            						current,
            						"inPattern",
            						lv_inPattern_4_0,
            						"org.xtext.example.mydsl.MyATL.InPattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:604:3: (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyATL.g:605:4: otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getMatchedRuleAccess().getUsingKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,40,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyATL.g:613:4: ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_SIMPLE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyATL.g:614:5: (lv_variables_7_0= ruleRuleVariableDeclaration )
                    	    {
                    	    // InternalMyATL.g:614:5: (lv_variables_7_0= ruleRuleVariableDeclaration )
                    	    // InternalMyATL.g:615:6: lv_variables_7_0= ruleRuleVariableDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getMatchedRuleAccess().getVariablesRuleVariableDeclarationParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_variables_7_0=ruleRuleVariableDeclaration();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMatchedRuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_7_0,
                    	    							"org.xtext.example.mydsl.MyATL.RuleVariableDeclaration");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,42,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getMatchedRuleAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,43,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getMatchedRuleAccess().getToKeyword_6());
            		
            // InternalMyATL.g:641:3: ( (lv_outPattern_10_0= ruleOutPattern ) )
            // InternalMyATL.g:642:4: (lv_outPattern_10_0= ruleOutPattern )
            {
            // InternalMyATL.g:642:4: (lv_outPattern_10_0= ruleOutPattern )
            // InternalMyATL.g:643:5: lv_outPattern_10_0= ruleOutPattern
            {

            					newCompositeNode(grammarAccess.getMatchedRuleAccess().getOutPatternOutPatternParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_18);
            lv_outPattern_10_0=ruleOutPattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatchedRuleRule());
            					}
            					set(
            						current,
            						"outPattern",
            						lv_outPattern_10_0,
            						"org.xtext.example.mydsl.MyATL.OutPattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:660:3: (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==44) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyATL.g:661:4: otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,44,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getMatchedRuleAccess().getDoKeyword_8_0());
                    			
                    otherlv_12=(Token)match(input,40,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMyATL.g:669:4: ( (lv_actionBlock_13_0= ruleActionBlock ) )
                    // InternalMyATL.g:670:5: (lv_actionBlock_13_0= ruleActionBlock )
                    {
                    // InternalMyATL.g:670:5: (lv_actionBlock_13_0= ruleActionBlock )
                    // InternalMyATL.g:671:6: lv_actionBlock_13_0= ruleActionBlock
                    {

                    						newCompositeNode(grammarAccess.getMatchedRuleAccess().getActionBlockActionBlockParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_actionBlock_13_0=ruleActionBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMatchedRuleRule());
                    						}
                    						set(
                    							current,
                    							"actionBlock",
                    							lv_actionBlock_13_0,
                    							"org.xtext.example.mydsl.MyATL.ActionBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,42,FOLLOW_20); 

                    				newLeafNode(otherlv_14, grammarAccess.getMatchedRuleAccess().getRightCurlyBracketKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,42,FOLLOW_2); 

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
    // InternalMyATL.g:701:1: entryRuleCalledRule returns [EObject current=null] : iv_ruleCalledRule= ruleCalledRule EOF ;
    public final EObject entryRuleCalledRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalledRule = null;


        try {
            // InternalMyATL.g:701:51: (iv_ruleCalledRule= ruleCalledRule EOF )
            // InternalMyATL.g:702:2: iv_ruleCalledRule= ruleCalledRule EOF
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
    // InternalMyATL.g:708:1: ruleCalledRule returns [EObject current=null] : ( (otherlv_0= 'entrypoint' )? otherlv_1= 'rule' ( (lv_name_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' otherlv_4= ')' )? otherlv_5= '{' (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )? otherlv_10= 'to' ( (lv_outPattern_11_0= ruleOutPattern ) ) (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalMyATL.g:714:2: ( ( (otherlv_0= 'entrypoint' )? otherlv_1= 'rule' ( (lv_name_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' otherlv_4= ')' )? otherlv_5= '{' (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )? otherlv_10= 'to' ( (lv_outPattern_11_0= ruleOutPattern ) ) (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalMyATL.g:715:2: ( (otherlv_0= 'entrypoint' )? otherlv_1= 'rule' ( (lv_name_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' otherlv_4= ')' )? otherlv_5= '{' (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )? otherlv_10= 'to' ( (lv_outPattern_11_0= ruleOutPattern ) ) (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalMyATL.g:715:2: ( (otherlv_0= 'entrypoint' )? otherlv_1= 'rule' ( (lv_name_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' otherlv_4= ')' )? otherlv_5= '{' (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )? otherlv_10= 'to' ( (lv_outPattern_11_0= ruleOutPattern ) ) (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )? otherlv_16= '}' )
            // InternalMyATL.g:716:3: (otherlv_0= 'entrypoint' )? otherlv_1= 'rule' ( (lv_name_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' otherlv_4= ')' )? otherlv_5= '{' (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )? otherlv_10= 'to' ( (lv_outPattern_11_0= ruleOutPattern ) ) (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalMyATL.g:716:3: (otherlv_0= 'entrypoint' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==45) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyATL.g:717:4: otherlv_0= 'entrypoint'
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getCalledRuleAccess().getEntrypointKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCalledRuleAccess().getRuleKeyword_1());
            		
            // InternalMyATL.g:726:3: ( (lv_name_2_0= ruleUnrestrictedName ) )
            // InternalMyATL.g:727:4: (lv_name_2_0= ruleUnrestrictedName )
            {
            // InternalMyATL.g:727:4: (lv_name_2_0= ruleUnrestrictedName )
            // InternalMyATL.g:728:5: lv_name_2_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getCalledRuleAccess().getNameUnrestrictedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_2_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalledRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyATL.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:745:3: (otherlv_3= '(' otherlv_4= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==46) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyATL.g:746:4: otherlv_3= '(' otherlv_4= ')'
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getCalledRuleAccess().getLeftParenthesisKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,47,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getCalledRuleAccess().getRightParenthesisKeyword_3_1());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,40,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyATL.g:759:3: (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyATL.g:760:4: otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getCalledRuleAccess().getUsingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,40,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyATL.g:768:4: ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_SIMPLE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyATL.g:769:5: (lv_variables_8_0= ruleRuleVariableDeclaration )
                    	    {
                    	    // InternalMyATL.g:769:5: (lv_variables_8_0= ruleRuleVariableDeclaration )
                    	    // InternalMyATL.g:770:6: lv_variables_8_0= ruleRuleVariableDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getCalledRuleAccess().getVariablesRuleVariableDeclarationParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_variables_8_0=ruleRuleVariableDeclaration();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCalledRuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_8_0,
                    	    							"org.xtext.example.mydsl.MyATL.RuleVariableDeclaration");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,42,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getCalledRuleAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,43,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getCalledRuleAccess().getToKeyword_6());
            		
            // InternalMyATL.g:796:3: ( (lv_outPattern_11_0= ruleOutPattern ) )
            // InternalMyATL.g:797:4: (lv_outPattern_11_0= ruleOutPattern )
            {
            // InternalMyATL.g:797:4: (lv_outPattern_11_0= ruleOutPattern )
            // InternalMyATL.g:798:5: lv_outPattern_11_0= ruleOutPattern
            {

            					newCompositeNode(grammarAccess.getCalledRuleAccess().getOutPatternOutPatternParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_18);
            lv_outPattern_11_0=ruleOutPattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalledRuleRule());
            					}
            					set(
            						current,
            						"outPattern",
            						lv_outPattern_11_0,
            						"org.xtext.example.mydsl.MyATL.OutPattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:815:3: (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==44) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyATL.g:816:4: otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,44,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getCalledRuleAccess().getDoKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,40,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMyATL.g:824:4: ( (lv_actionBlock_14_0= ruleActionBlock ) )
                    // InternalMyATL.g:825:5: (lv_actionBlock_14_0= ruleActionBlock )
                    {
                    // InternalMyATL.g:825:5: (lv_actionBlock_14_0= ruleActionBlock )
                    // InternalMyATL.g:826:6: lv_actionBlock_14_0= ruleActionBlock
                    {

                    						newCompositeNode(grammarAccess.getCalledRuleAccess().getActionBlockActionBlockParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_actionBlock_14_0=ruleActionBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalledRuleRule());
                    						}
                    						set(
                    							current,
                    							"actionBlock",
                    							lv_actionBlock_14_0,
                    							"org.xtext.example.mydsl.MyATL.ActionBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,42,FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getCalledRuleAccess().getRightCurlyBracketKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,42,FOLLOW_2); 

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
    // InternalMyATL.g:856:1: entryRuleHelper returns [EObject current=null] : iv_ruleHelper= ruleHelper EOF ;
    public final EObject entryRuleHelper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelper = null;


        try {
            // InternalMyATL.g:856:47: (iv_ruleHelper= ruleHelper EOF )
            // InternalMyATL.g:857:2: iv_ruleHelper= ruleHelper EOF
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
    // InternalMyATL.g:863:1: ruleHelper returns [EObject current=null] : (otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_definition_2_0= ruleATLDefCS ) ) ) ;
    public final EObject ruleHelper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_definition_2_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:869:2: ( (otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_definition_2_0= ruleATLDefCS ) ) ) )
            // InternalMyATL.g:870:2: (otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_definition_2_0= ruleATLDefCS ) ) )
            {
            // InternalMyATL.g:870:2: (otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_definition_2_0= ruleATLDefCS ) ) )
            // InternalMyATL.g:871:3: otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_definition_2_0= ruleATLDefCS ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getHelperAccess().getHelperKeyword_0());
            		
            // InternalMyATL.g:875:3: (otherlv_1= 'context' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==49) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyATL.g:876:4: otherlv_1= 'context'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getHelperAccess().getContextKeyword_1());
                    			

                    }
                    break;

            }

            // InternalMyATL.g:881:3: ( (lv_definition_2_0= ruleATLDefCS ) )
            // InternalMyATL.g:882:4: (lv_definition_2_0= ruleATLDefCS )
            {
            // InternalMyATL.g:882:4: (lv_definition_2_0= ruleATLDefCS )
            // InternalMyATL.g:883:5: lv_definition_2_0= ruleATLDefCS
            {

            					newCompositeNode(grammarAccess.getHelperAccess().getDefinitionATLDefCSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_definition_2_0=ruleATLDefCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHelperRule());
            					}
            					set(
            						current,
            						"definition",
            						lv_definition_2_0,
            						"org.xtext.example.mydsl.MyATL.ATLDefCS");
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
    // InternalMyATL.g:904:1: entryRuleATLDefCS returns [EObject current=null] : iv_ruleATLDefCS= ruleATLDefCS EOF ;
    public final EObject entryRuleATLDefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATLDefCS = null;


        try {
            // InternalMyATL.g:904:49: (iv_ruleATLDefCS= ruleATLDefCS EOF )
            // InternalMyATL.g:905:2: iv_ruleATLDefCS= ruleATLDefCS EOF
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
    // InternalMyATL.g:911:1: ruleATLDefCS returns [EObject current=null] : (otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';' ) ;
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
            // InternalMyATL.g:917:2: ( (otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';' ) )
            // InternalMyATL.g:918:2: (otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';' )
            {
            // InternalMyATL.g:918:2: (otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';' )
            // InternalMyATL.g:919:3: otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getATLDefCSAccess().getDefKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getATLDefCSAccess().getColonKeyword_1());
            		
            // InternalMyATL.g:927:3: ( (lv_varName_2_0= ruleUnrestrictedName ) )
            // InternalMyATL.g:928:4: (lv_varName_2_0= ruleUnrestrictedName )
            {
            // InternalMyATL.g:928:4: (lv_varName_2_0= ruleUnrestrictedName )
            // InternalMyATL.g:929:5: lv_varName_2_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getATLDefCSAccess().getVarNameUnrestrictedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_varName_2_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getATLDefCSRule());
            					}
            					set(
            						current,
            						"varName",
            						lv_varName_2_0,
            						"org.xtext.example.mydsl.MyATL.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:946:3: (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyATL.g:947:4: otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getATLDefCSAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMyATL.g:951:4: ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_SIMPLE_ID) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMyATL.g:952:5: ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )*
                            {
                            // InternalMyATL.g:952:5: ( (lv_parameters_4_0= ruleATLParameterCS ) )
                            // InternalMyATL.g:953:6: (lv_parameters_4_0= ruleATLParameterCS )
                            {
                            // InternalMyATL.g:953:6: (lv_parameters_4_0= ruleATLParameterCS )
                            // InternalMyATL.g:954:7: lv_parameters_4_0= ruleATLParameterCS
                            {

                            							newCompositeNode(grammarAccess.getATLDefCSAccess().getParametersATLParameterCSParserRuleCall_3_1_0_0());
                            						
                            pushFollow(FOLLOW_27);
                            lv_parameters_4_0=ruleATLParameterCS();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getATLDefCSRule());
                            							}
                            							add(
                            								current,
                            								"parameters",
                            								lv_parameters_4_0,
                            								"org.xtext.example.mydsl.MyATL.ATLParameterCS");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyATL.g:971:5: (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==22) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // InternalMyATL.g:972:6: otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) )
                            	    {
                            	    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                            	    						newLeafNode(otherlv_5, grammarAccess.getATLDefCSAccess().getCommaKeyword_3_1_1_0());
                            	    					
                            	    // InternalMyATL.g:976:6: ( (lv_parameters_6_0= ruleATLParameterCS ) )
                            	    // InternalMyATL.g:977:7: (lv_parameters_6_0= ruleATLParameterCS )
                            	    {
                            	    // InternalMyATL.g:977:7: (lv_parameters_6_0= ruleATLParameterCS )
                            	    // InternalMyATL.g:978:8: lv_parameters_6_0= ruleATLParameterCS
                            	    {

                            	    								newCompositeNode(grammarAccess.getATLDefCSAccess().getParametersATLParameterCSParserRuleCall_3_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_27);
                            	    lv_parameters_6_0=ruleATLParameterCS();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getATLDefCSRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"parameters",
                            	    									lv_parameters_6_0,
                            	    									"org.xtext.example.mydsl.MyATL.ATLParameterCS");
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

                    otherlv_7=(Token)match(input,47,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getATLDefCSAccess().getRightParenthesisKeyword_3_2());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FOLLOW_28); 

            			newLeafNode(otherlv_8, grammarAccess.getATLDefCSAccess().getColonKeyword_4());
            		
            // InternalMyATL.g:1006:3: ( (lv_type_9_0= ruleATLType ) )
            // InternalMyATL.g:1007:4: (lv_type_9_0= ruleATLType )
            {
            // InternalMyATL.g:1007:4: (lv_type_9_0= ruleATLType )
            // InternalMyATL.g:1008:5: lv_type_9_0= ruleATLType
            {

            					newCompositeNode(grammarAccess.getATLDefCSAccess().getTypeATLTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_29);
            lv_type_9_0=ruleATLType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getATLDefCSRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_9_0,
            						"org.xtext.example.mydsl.MyATL.ATLType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,51,FOLLOW_19); 

            			newLeafNode(otherlv_10, grammarAccess.getATLDefCSAccess().getEqualsSignKeyword_6());
            		
            // InternalMyATL.g:1029:3: ( (lv_initExpression_11_0= ruleExpCS ) )
            // InternalMyATL.g:1030:4: (lv_initExpression_11_0= ruleExpCS )
            {
            // InternalMyATL.g:1030:4: (lv_initExpression_11_0= ruleExpCS )
            // InternalMyATL.g:1031:5: lv_initExpression_11_0= ruleExpCS
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
            						"org.xtext.example.mydsl.MyATL.ExpCS");
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
    // InternalMyATL.g:1056:1: entryRuleATLParameterCS returns [EObject current=null] : iv_ruleATLParameterCS= ruleATLParameterCS EOF ;
    public final EObject entryRuleATLParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATLParameterCS = null;


        try {
            // InternalMyATL.g:1056:55: (iv_ruleATLParameterCS= ruleATLParameterCS EOF )
            // InternalMyATL.g:1057:2: iv_ruleATLParameterCS= ruleATLParameterCS EOF
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
    // InternalMyATL.g:1063:1: ruleATLParameterCS returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) ) ;
    public final EObject ruleATLParameterCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_varName_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:1069:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) ) )
            // InternalMyATL.g:1070:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) )
            {
            // InternalMyATL.g:1070:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) )
            // InternalMyATL.g:1071:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) )
            {
            // InternalMyATL.g:1071:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyATL.g:1072:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyATL.g:1072:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyATL.g:1073:5: lv_varName_0_0= ruleUnrestrictedName
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
            						"org.xtext.example.mydsl.MyATL.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getATLParameterCSAccess().getColonKeyword_1());
            		
            // InternalMyATL.g:1094:3: ( (lv_type_2_0= ruleATLType ) )
            // InternalMyATL.g:1095:4: (lv_type_2_0= ruleATLType )
            {
            // InternalMyATL.g:1095:4: (lv_type_2_0= ruleATLType )
            // InternalMyATL.g:1096:5: lv_type_2_0= ruleATLType
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
            						"org.xtext.example.mydsl.MyATL.ATLType");
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
    // InternalMyATL.g:1117:1: entryRuleRuleVariableDeclaration returns [EObject current=null] : iv_ruleRuleVariableDeclaration= ruleRuleVariableDeclaration EOF ;
    public final EObject entryRuleRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleVariableDeclaration = null;


        try {
            // InternalMyATL.g:1117:64: (iv_ruleRuleVariableDeclaration= ruleRuleVariableDeclaration EOF )
            // InternalMyATL.g:1118:2: iv_ruleRuleVariableDeclaration= ruleRuleVariableDeclaration EOF
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
    // InternalMyATL.g:1124:1: ruleRuleVariableDeclaration returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';' ) ;
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
            // InternalMyATL.g:1130:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';' ) )
            // InternalMyATL.g:1131:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';' )
            {
            // InternalMyATL.g:1131:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';' )
            // InternalMyATL.g:1132:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';'
            {
            // InternalMyATL.g:1132:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyATL.g:1133:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyATL.g:1133:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyATL.g:1134:5: lv_varName_0_0= ruleUnrestrictedName
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
            						"org.xtext.example.mydsl.MyATL.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleVariableDeclarationAccess().getColonKeyword_1());
            		
            // InternalMyATL.g:1155:3: ( (lv_type_2_0= ruleATLType ) )
            // InternalMyATL.g:1156:4: (lv_type_2_0= ruleATLType )
            {
            // InternalMyATL.g:1156:4: (lv_type_2_0= ruleATLType )
            // InternalMyATL.g:1157:5: lv_type_2_0= ruleATLType
            {

            					newCompositeNode(grammarAccess.getRuleVariableDeclarationAccess().getTypeATLTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
            lv_type_2_0=ruleATLType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleVariableDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.mydsl.MyATL.ATLType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleVariableDeclarationAccess().getEqualsSignKeyword_3());
            		
            // InternalMyATL.g:1178:3: ( (lv_initExpression_4_0= ruleExpCS ) )
            // InternalMyATL.g:1179:4: (lv_initExpression_4_0= ruleExpCS )
            {
            // InternalMyATL.g:1179:4: (lv_initExpression_4_0= ruleExpCS )
            // InternalMyATL.g:1180:5: lv_initExpression_4_0= ruleExpCS
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
            						"org.xtext.example.mydsl.MyATL.ExpCS");
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
    // InternalMyATL.g:1205:1: entryRuleInPattern returns [EObject current=null] : iv_ruleInPattern= ruleInPattern EOF ;
    public final EObject entryRuleInPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPattern = null;


        try {
            // InternalMyATL.g:1205:50: (iv_ruleInPattern= ruleInPattern EOF )
            // InternalMyATL.g:1206:2: iv_ruleInPattern= ruleInPattern EOF
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
    // InternalMyATL.g:1212:1: ruleInPattern returns [EObject current=null] : ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )? ) ;
    public final EObject ruleInPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_0_0 = null;

        EObject lv_filter_2_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:1218:2: ( ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )? ) )
            // InternalMyATL.g:1219:2: ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )? )
            {
            // InternalMyATL.g:1219:2: ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )? )
            // InternalMyATL.g:1220:3: ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )?
            {
            // InternalMyATL.g:1220:3: ( (lv_elements_0_0= ruleInPatternElement ) )
            // InternalMyATL.g:1221:4: (lv_elements_0_0= ruleInPatternElement )
            {
            // InternalMyATL.g:1221:4: (lv_elements_0_0= ruleInPatternElement )
            // InternalMyATL.g:1222:5: lv_elements_0_0= ruleInPatternElement
            {

            					newCompositeNode(grammarAccess.getInPatternAccess().getElementsInPatternElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_elements_0_0=ruleInPatternElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInPatternRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"org.xtext.example.mydsl.MyATL.InPatternElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:1239:3: (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyATL.g:1240:4: otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getInPatternAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMyATL.g:1244:4: ( (lv_filter_2_0= ruleExpCS ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=RULE_SIMPLE_ID && LA20_0<=RULE_BIG_INT)||LA20_0==25||LA20_0==46||(LA20_0>=57 && LA20_0<=59)||LA20_0==72||(LA20_0>=74 && LA20_0<=76)||LA20_0==79||LA20_0==83||LA20_0==85) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalMyATL.g:1245:5: (lv_filter_2_0= ruleExpCS )
                            {
                            // InternalMyATL.g:1245:5: (lv_filter_2_0= ruleExpCS )
                            // InternalMyATL.g:1246:6: lv_filter_2_0= ruleExpCS
                            {

                            						newCompositeNode(grammarAccess.getInPatternAccess().getFilterExpCSParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_23);
                            lv_filter_2_0=ruleExpCS();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getInPatternRule());
                            						}
                            						set(
                            							current,
                            							"filter",
                            							lv_filter_2_0,
                            							"org.xtext.example.mydsl.MyATL.ExpCS");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,47,FOLLOW_2); 

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
    // InternalMyATL.g:1272:1: entryRuleInPatternElement returns [EObject current=null] : iv_ruleInPatternElement= ruleInPatternElement EOF ;
    public final EObject entryRuleInPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPatternElement = null;


        try {
            // InternalMyATL.g:1272:57: (iv_ruleInPatternElement= ruleInPatternElement EOF )
            // InternalMyATL.g:1273:2: iv_ruleInPatternElement= ruleInPatternElement EOF
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
    // InternalMyATL.g:1279:1: ruleInPatternElement returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) ) ;
    public final EObject ruleInPatternElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_varName_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:1285:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) ) )
            // InternalMyATL.g:1286:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) )
            {
            // InternalMyATL.g:1286:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) )
            // InternalMyATL.g:1287:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) )
            {
            // InternalMyATL.g:1287:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyATL.g:1288:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyATL.g:1288:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyATL.g:1289:5: lv_varName_0_0= ruleUnrestrictedName
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
            						"org.xtext.example.mydsl.MyATL.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getInPatternElementAccess().getColonKeyword_1());
            		
            // InternalMyATL.g:1310:3: ( (lv_type_2_0= ruleATLType ) )
            // InternalMyATL.g:1311:4: (lv_type_2_0= ruleATLType )
            {
            // InternalMyATL.g:1311:4: (lv_type_2_0= ruleATLType )
            // InternalMyATL.g:1312:5: lv_type_2_0= ruleATLType
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
            						"org.xtext.example.mydsl.MyATL.ATLType");
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
    // InternalMyATL.g:1333:1: entryRuleOutPattern returns [EObject current=null] : iv_ruleOutPattern= ruleOutPattern EOF ;
    public final EObject entryRuleOutPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPattern = null;


        try {
            // InternalMyATL.g:1333:51: (iv_ruleOutPattern= ruleOutPattern EOF )
            // InternalMyATL.g:1334:2: iv_ruleOutPattern= ruleOutPattern EOF
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
    // InternalMyATL.g:1340:1: ruleOutPattern returns [EObject current=null] : ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* ) ;
    public final EObject ruleOutPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:1346:2: ( ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* ) )
            // InternalMyATL.g:1347:2: ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* )
            {
            // InternalMyATL.g:1347:2: ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* )
            // InternalMyATL.g:1348:3: ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )*
            {
            // InternalMyATL.g:1348:3: ( (lv_elements_0_0= ruleOutPatternElement ) )
            // InternalMyATL.g:1349:4: (lv_elements_0_0= ruleOutPatternElement )
            {
            // InternalMyATL.g:1349:4: (lv_elements_0_0= ruleOutPatternElement )
            // InternalMyATL.g:1350:5: lv_elements_0_0= ruleOutPatternElement
            {

            					newCompositeNode(grammarAccess.getOutPatternAccess().getElementsOutPatternElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_elements_0_0=ruleOutPatternElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutPatternRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"org.xtext.example.mydsl.MyATL.OutPatternElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:1367:3: (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyATL.g:1368:4: otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_17); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOutPatternAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyATL.g:1372:4: ( (lv_elements_2_0= ruleOutPatternElement ) )
            	    // InternalMyATL.g:1373:5: (lv_elements_2_0= ruleOutPatternElement )
            	    {
            	    // InternalMyATL.g:1373:5: (lv_elements_2_0= ruleOutPatternElement )
            	    // InternalMyATL.g:1374:6: lv_elements_2_0= ruleOutPatternElement
            	    {

            	    						newCompositeNode(grammarAccess.getOutPatternAccess().getElementsOutPatternElementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_elements_2_0=ruleOutPatternElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOutPatternRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_2_0,
            	    							"org.xtext.example.mydsl.MyATL.OutPatternElement");
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


            }


            	leaveRule();

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
    // InternalMyATL.g:1396:1: entryRuleOutPatternElement returns [EObject current=null] : iv_ruleOutPatternElement= ruleOutPatternElement EOF ;
    public final EObject entryRuleOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPatternElement = null;


        try {
            // InternalMyATL.g:1396:58: (iv_ruleOutPatternElement= ruleOutPatternElement EOF )
            // InternalMyATL.g:1397:2: iv_ruleOutPatternElement= ruleOutPatternElement EOF
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
    // InternalMyATL.g:1403:1: ruleOutPatternElement returns [EObject current=null] : (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement ) ;
    public final EObject ruleOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleOutPatternElement_0 = null;

        EObject this_ForEachOutPatternElement_1 = null;



        	enterRule();

        try {
            // InternalMyATL.g:1409:2: ( (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement ) )
            // InternalMyATL.g:1410:2: (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement )
            {
            // InternalMyATL.g:1410:2: (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_SIMPLE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==52) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyATL.g:1411:3: this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement
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
                    // InternalMyATL.g:1420:3: this_ForEachOutPatternElement_1= ruleForEachOutPatternElement
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
    // InternalMyATL.g:1432:1: entryRuleSimpleOutPatternElement returns [EObject current=null] : iv_ruleSimpleOutPatternElement= ruleSimpleOutPatternElement EOF ;
    public final EObject entryRuleSimpleOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOutPatternElement = null;


        try {
            // InternalMyATL.g:1432:64: (iv_ruleSimpleOutPatternElement= ruleSimpleOutPatternElement EOF )
            // InternalMyATL.g:1433:2: iv_ruleSimpleOutPatternElement= ruleSimpleOutPatternElement EOF
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
    // InternalMyATL.g:1439:1: ruleSimpleOutPatternElement returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )? ) ;
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
            // InternalMyATL.g:1445:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )? ) )
            // InternalMyATL.g:1446:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )? )
            {
            // InternalMyATL.g:1446:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )? )
            // InternalMyATL.g:1447:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )?
            {
            // InternalMyATL.g:1447:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyATL.g:1448:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyATL.g:1448:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyATL.g:1449:5: lv_varName_0_0= ruleUnrestrictedName
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
            						"org.xtext.example.mydsl.MyATL.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleOutPatternElementAccess().getColonKeyword_1());
            		
            // InternalMyATL.g:1470:3: ( (lv_type_2_0= ruleATLType ) )
            // InternalMyATL.g:1471:4: (lv_type_2_0= ruleATLType )
            {
            // InternalMyATL.g:1471:4: (lv_type_2_0= ruleATLType )
            // InternalMyATL.g:1472:5: lv_type_2_0= ruleATLType
            {

            					newCompositeNode(grammarAccess.getSimpleOutPatternElementAccess().getTypeATLTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_type_2_0=ruleATLType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleOutPatternElementRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.mydsl.MyATL.ATLType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:1489:3: (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyATL.g:1490:4: otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getSimpleOutPatternElementAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMyATL.g:1494:4: ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_SIMPLE_ID) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalMyATL.g:1495:5: ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )*
                            {
                            // InternalMyATL.g:1495:5: ( (lv_bindings_4_0= ruleBinding ) )
                            // InternalMyATL.g:1496:6: (lv_bindings_4_0= ruleBinding )
                            {
                            // InternalMyATL.g:1496:6: (lv_bindings_4_0= ruleBinding )
                            // InternalMyATL.g:1497:7: lv_bindings_4_0= ruleBinding
                            {

                            							newCompositeNode(grammarAccess.getSimpleOutPatternElementAccess().getBindingsBindingParserRuleCall_3_1_0_0());
                            						
                            pushFollow(FOLLOW_27);
                            lv_bindings_4_0=ruleBinding();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSimpleOutPatternElementRule());
                            							}
                            							add(
                            								current,
                            								"bindings",
                            								lv_bindings_4_0,
                            								"org.xtext.example.mydsl.MyATL.Binding");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyATL.g:1514:5: (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==22) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // InternalMyATL.g:1515:6: otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) )
                            	    {
                            	    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                            	    						newLeafNode(otherlv_5, grammarAccess.getSimpleOutPatternElementAccess().getCommaKeyword_3_1_1_0());
                            	    					
                            	    // InternalMyATL.g:1519:6: ( (lv_bindings_6_0= ruleBinding ) )
                            	    // InternalMyATL.g:1520:7: (lv_bindings_6_0= ruleBinding )
                            	    {
                            	    // InternalMyATL.g:1520:7: (lv_bindings_6_0= ruleBinding )
                            	    // InternalMyATL.g:1521:8: lv_bindings_6_0= ruleBinding
                            	    {

                            	    								newCompositeNode(grammarAccess.getSimpleOutPatternElementAccess().getBindingsBindingParserRuleCall_3_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_27);
                            	    lv_bindings_6_0=ruleBinding();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getSimpleOutPatternElementRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"bindings",
                            	    									lv_bindings_6_0,
                            	    									"org.xtext.example.mydsl.MyATL.Binding");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,47,FOLLOW_2); 

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
    // InternalMyATL.g:1549:1: entryRuleForEachOutPatternElement returns [EObject current=null] : iv_ruleForEachOutPatternElement= ruleForEachOutPatternElement EOF ;
    public final EObject entryRuleForEachOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachOutPatternElement = null;


        try {
            // InternalMyATL.g:1549:65: (iv_ruleForEachOutPatternElement= ruleForEachOutPatternElement EOF )
            // InternalMyATL.g:1550:2: iv_ruleForEachOutPatternElement= ruleForEachOutPatternElement EOF
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
    // InternalMyATL.g:1556:1: ruleForEachOutPatternElement returns [EObject current=null] : (otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy' ) ;
    public final EObject ruleForEachOutPatternElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_collection_1_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:1562:2: ( (otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy' ) )
            // InternalMyATL.g:1563:2: (otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy' )
            {
            // InternalMyATL.g:1563:2: (otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy' )
            // InternalMyATL.g:1564:3: otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachOutPatternElementAccess().getXxxKeyword_0());
            		
            // InternalMyATL.g:1568:3: ( (lv_collection_1_0= ruleExpCS ) )
            // InternalMyATL.g:1569:4: (lv_collection_1_0= ruleExpCS )
            {
            // InternalMyATL.g:1569:4: (lv_collection_1_0= ruleExpCS )
            // InternalMyATL.g:1570:5: lv_collection_1_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getForEachOutPatternElementAccess().getCollectionExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_collection_1_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachOutPatternElementRule());
            					}
            					set(
            						current,
            						"collection",
            						lv_collection_1_0,
            						"org.xtext.example.mydsl.MyATL.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_2); 

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
    // InternalMyATL.g:1595:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalMyATL.g:1595:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalMyATL.g:1596:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalMyATL.g:1602:1: ruleBinding returns [EObject current=null] : ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_propertyName_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:1608:2: ( ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) ) ) )
            // InternalMyATL.g:1609:2: ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) ) )
            {
            // InternalMyATL.g:1609:2: ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) ) )
            // InternalMyATL.g:1610:3: ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) )
            {
            // InternalMyATL.g:1610:3: ( (lv_propertyName_0_0= ruleUnrestrictedName ) )
            // InternalMyATL.g:1611:4: (lv_propertyName_0_0= ruleUnrestrictedName )
            {
            // InternalMyATL.g:1611:4: (lv_propertyName_0_0= ruleUnrestrictedName )
            // InternalMyATL.g:1612:5: lv_propertyName_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getPropertyNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_propertyName_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"propertyName",
            						lv_propertyName_0_0,
            						"org.xtext.example.mydsl.MyATL.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_1());
            		
            // InternalMyATL.g:1633:3: ( (lv_value_2_0= ruleExpCS ) )
            // InternalMyATL.g:1634:4: (lv_value_2_0= ruleExpCS )
            {
            // InternalMyATL.g:1634:4: (lv_value_2_0= ruleExpCS )
            // InternalMyATL.g:1635:5: lv_value_2_0= ruleExpCS
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
            						"org.xtext.example.mydsl.MyATL.ExpCS");
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
    // InternalMyATL.g:1656:1: entryRuleActionBlock returns [EObject current=null] : iv_ruleActionBlock= ruleActionBlock EOF ;
    public final EObject entryRuleActionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionBlock = null;


        try {
            // InternalMyATL.g:1656:52: (iv_ruleActionBlock= ruleActionBlock EOF )
            // InternalMyATL.g:1657:2: iv_ruleActionBlock= ruleActionBlock EOF
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
    // InternalMyATL.g:1663:1: ruleActionBlock returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )+ ;
    public final EObject ruleActionBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:1669:2: ( ( (lv_statements_0_0= ruleStatement ) )+ )
            // InternalMyATL.g:1670:2: ( (lv_statements_0_0= ruleStatement ) )+
            {
            // InternalMyATL.g:1670:2: ( (lv_statements_0_0= ruleStatement ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_SIMPLE_ID && LA27_0<=RULE_BIG_INT)||LA27_0==25||LA27_0==46||(LA27_0>=57 && LA27_0<=59)||LA27_0==72||(LA27_0>=74 && LA27_0<=76)||LA27_0==79||LA27_0==83||LA27_0==85) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyATL.g:1671:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalMyATL.g:1671:3: (lv_statements_0_0= ruleStatement )
            	    // InternalMyATL.g:1672:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getActionBlockAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_35);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getActionBlockRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"org.xtext.example.mydsl.MyATL.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
    // InternalMyATL.g:1692:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyATL.g:1692:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyATL.g:1693:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMyATL.g:1699:1: ruleStatement returns [EObject current=null] : this_BindingStat_0= ruleBindingStat ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_BindingStat_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:1705:2: (this_BindingStat_0= ruleBindingStat )
            // InternalMyATL.g:1706:2: this_BindingStat_0= ruleBindingStat
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
    // InternalMyATL.g:1717:1: entryRuleBindingStat returns [EObject current=null] : iv_ruleBindingStat= ruleBindingStat EOF ;
    public final EObject entryRuleBindingStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingStat = null;


        try {
            // InternalMyATL.g:1717:52: (iv_ruleBindingStat= ruleBindingStat EOF )
            // InternalMyATL.g:1718:2: iv_ruleBindingStat= ruleBindingStat EOF
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
    // InternalMyATL.g:1724:1: ruleBindingStat returns [EObject current=null] : ( ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';' ) ;
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
            // InternalMyATL.g:1730:2: ( ( ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';' ) )
            // InternalMyATL.g:1731:2: ( ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';' )
            {
            // InternalMyATL.g:1731:2: ( ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';' )
            // InternalMyATL.g:1732:3: ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';'
            {
            // InternalMyATL.g:1732:3: ( (lv_source_0_0= ruleExpCS ) )
            // InternalMyATL.g:1733:4: (lv_source_0_0= ruleExpCS )
            {
            // InternalMyATL.g:1733:4: (lv_source_0_0= ruleExpCS )
            // InternalMyATL.g:1734:5: lv_source_0_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getBindingStatAccess().getSourceExpCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_source_0_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingStatRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_0_0,
            						"org.xtext.example.mydsl.MyATL.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingStatAccess().getFullStopKeyword_1());
            		
            // InternalMyATL.g:1755:3: ( (lv_propertyName_2_0= ruleUnrestrictedName ) )
            // InternalMyATL.g:1756:4: (lv_propertyName_2_0= ruleUnrestrictedName )
            {
            // InternalMyATL.g:1756:4: (lv_propertyName_2_0= ruleUnrestrictedName )
            // InternalMyATL.g:1757:5: lv_propertyName_2_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getBindingStatAccess().getPropertyNameUnrestrictedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
            lv_propertyName_2_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingStatRule());
            					}
            					set(
            						current,
            						"propertyName",
            						lv_propertyName_2_0,
            						"org.xtext.example.mydsl.MyATL.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,54,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getBindingStatAccess().getLessThanSignHyphenMinusKeyword_3());
            		
            // InternalMyATL.g:1778:3: ( (lv_value_4_0= ruleExpCS ) )
            // InternalMyATL.g:1779:4: (lv_value_4_0= ruleExpCS )
            {
            // InternalMyATL.g:1779:4: (lv_value_4_0= ruleExpCS )
            // InternalMyATL.g:1780:5: lv_value_4_0= ruleExpCS
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
            						"org.xtext.example.mydsl.MyATL.ExpCS");
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
    // InternalMyATL.g:1805:1: entryRuleATLType returns [EObject current=null] : iv_ruleATLType= ruleATLType EOF ;
    public final EObject entryRuleATLType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATLType = null;


        try {
            // InternalMyATL.g:1805:48: (iv_ruleATLType= ruleATLType EOF )
            // InternalMyATL.g:1806:2: iv_ruleATLType= ruleATLType EOF
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
    // InternalMyATL.g:1812:1: ruleATLType returns [EObject current=null] : ( ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleATLType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_modelName_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:1818:2: ( ( ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) ) ) )
            // InternalMyATL.g:1819:2: ( ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) ) )
            {
            // InternalMyATL.g:1819:2: ( ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) ) )
            // InternalMyATL.g:1820:3: ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) )
            {
            // InternalMyATL.g:1820:3: ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_SIMPLE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==56) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalMyATL.g:1821:4: ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!'
                    {
                    // InternalMyATL.g:1821:4: ( (lv_modelName_0_0= ruleATLModelName ) )
                    // InternalMyATL.g:1822:5: (lv_modelName_0_0= ruleATLModelName )
                    {
                    // InternalMyATL.g:1822:5: (lv_modelName_0_0= ruleATLModelName )
                    // InternalMyATL.g:1823:6: lv_modelName_0_0= ruleATLModelName
                    {

                    						newCompositeNode(grammarAccess.getATLTypeAccess().getModelNameATLModelNameParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_modelName_0_0=ruleATLModelName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getATLTypeRule());
                    						}
                    						set(
                    							current,
                    							"modelName",
                    							lv_modelName_0_0,
                    							"org.xtext.example.mydsl.MyATL.ATLModelName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,56,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getATLTypeAccess().getExclamationMarkKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyATL.g:1845:3: ( (lv_type_2_0= ruleTypeExpCS ) )
            // InternalMyATL.g:1846:4: (lv_type_2_0= ruleTypeExpCS )
            {
            // InternalMyATL.g:1846:4: (lv_type_2_0= ruleTypeExpCS )
            // InternalMyATL.g:1847:5: lv_type_2_0= ruleTypeExpCS
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
            						"org.xtext.example.mydsl.MyATL.TypeExpCS");
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
    // InternalMyATL.g:1868:1: entryRuleATLModelName returns [String current=null] : iv_ruleATLModelName= ruleATLModelName EOF ;
    public final String entryRuleATLModelName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATLModelName = null;


        try {
            // InternalMyATL.g:1868:52: (iv_ruleATLModelName= ruleATLModelName EOF )
            // InternalMyATL.g:1869:2: iv_ruleATLModelName= ruleATLModelName EOF
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
    // InternalMyATL.g:1875:1: ruleATLModelName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_UnrestrictedName_0= ruleUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleATLModelName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:1881:2: (this_UnrestrictedName_0= ruleUnrestrictedName )
            // InternalMyATL.g:1882:2: this_UnrestrictedName_0= ruleUnrestrictedName
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
    // InternalMyATL.g:1895:1: entryRuleEssentialOCLPrefixOperator returns [String current=null] : iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF ;
    public final String entryRuleEssentialOCLPrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLPrefixOperator = null;


        try {
            // InternalMyATL.g:1895:66: (iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF )
            // InternalMyATL.g:1896:2: iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF
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
    // InternalMyATL.g:1902:1: ruleEssentialOCLPrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLPrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyATL.g:1908:2: ( (kw= '-' | kw= 'not' ) )
            // InternalMyATL.g:1909:2: (kw= '-' | kw= 'not' )
            {
            // InternalMyATL.g:1909:2: (kw= '-' | kw= 'not' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==57) ) {
                alt29=1;
            }
            else if ( (LA29_0==58) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyATL.g:1910:3: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLPrefixOperatorAccess().getHyphenMinusKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyATL.g:1916:3: kw= 'not'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

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
    // InternalMyATL.g:1925:1: entryRuleEssentialOCLInfixOperator returns [String current=null] : iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF ;
    public final String entryRuleEssentialOCLInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperator = null;


        try {
            // InternalMyATL.g:1925:65: (iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF )
            // InternalMyATL.g:1926:2: iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF
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
    // InternalMyATL.g:1932:1: ruleEssentialOCLInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyATL.g:1938:2: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) )
            // InternalMyATL.g:1939:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            {
            // InternalMyATL.g:1939:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            int alt30=14;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt30=1;
                }
                break;
            case 60:
                {
                alt30=2;
                }
                break;
            case 61:
                {
                alt30=3;
                }
                break;
            case 57:
                {
                alt30=4;
                }
                break;
            case 62:
                {
                alt30=5;
                }
                break;
            case 63:
                {
                alt30=6;
                }
                break;
            case 64:
                {
                alt30=7;
                }
                break;
            case 65:
                {
                alt30=8;
                }
                break;
            case 51:
                {
                alt30=9;
                }
                break;
            case 66:
                {
                alt30=10;
                }
                break;
            case 67:
                {
                alt30=11;
                }
                break;
            case 68:
                {
                alt30=12;
                }
                break;
            case 69:
                {
                alt30=13;
                }
                break;
            case 70:
                {
                alt30=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalMyATL.g:1940:3: kw= '*'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyATL.g:1946:3: kw= '/'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyATL.g:1952:3: kw= '+'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getPlusSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyATL.g:1958:3: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getHyphenMinusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyATL.g:1964:3: kw= '>'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyATL.g:1970:3: kw= '<'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyATL.g:1976:3: kw= '>='
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignEqualsSignKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyATL.g:1982:3: kw= '<='
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignEqualsSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalMyATL.g:1988:3: kw= '='
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getEqualsSignKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalMyATL.g:1994:3: kw= '<>'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignGreaterThanSignKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalMyATL.g:2000:3: kw= 'and'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getAndKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalMyATL.g:2006:3: kw= 'or'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getOrKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalMyATL.g:2012:3: kw= 'xor'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getXorKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalMyATL.g:2018:3: kw= 'implies'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

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
    // InternalMyATL.g:2027:1: entryRuleEssentialOCLNavigationOperator returns [String current=null] : iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF ;
    public final String entryRuleEssentialOCLNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperator = null;


        try {
            // InternalMyATL.g:2027:70: (iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF )
            // InternalMyATL.g:2028:2: iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF
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
    // InternalMyATL.g:2034:1: ruleEssentialOCLNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyATL.g:2040:2: ( (kw= '.' | kw= '->' ) )
            // InternalMyATL.g:2041:2: (kw= '.' | kw= '->' )
            {
            // InternalMyATL.g:2041:2: (kw= '.' | kw= '->' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==55) ) {
                alt31=1;
            }
            else if ( (LA31_0==71) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyATL.g:2042:3: kw= '.'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorAccess().getFullStopKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyATL.g:2048:3: kw= '->'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

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
    // InternalMyATL.g:2057:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalMyATL.g:2057:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMyATL.g:2058:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalMyATL.g:2064:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;


        	enterRule();

        try {
            // InternalMyATL.g:2070:2: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // InternalMyATL.g:2071:2: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
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
    // InternalMyATL.g:2081:1: entryRulePrefixOperator returns [String current=null] : iv_rulePrefixOperator= rulePrefixOperator EOF ;
    public final String entryRulePrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixOperator = null;


        try {
            // InternalMyATL.g:2081:54: (iv_rulePrefixOperator= rulePrefixOperator EOF )
            // InternalMyATL.g:2082:2: iv_rulePrefixOperator= rulePrefixOperator EOF
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
    // InternalMyATL.g:2088:1: rulePrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator ;
    public final AntlrDatatypeRuleToken rulePrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLPrefixOperator_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:2094:2: (this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator )
            // InternalMyATL.g:2095:2: this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator
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
    // InternalMyATL.g:2108:1: entryRuleInfixOperator returns [String current=null] : iv_ruleInfixOperator= ruleInfixOperator EOF ;
    public final String entryRuleInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperator = null;


        try {
            // InternalMyATL.g:2108:53: (iv_ruleInfixOperator= ruleInfixOperator EOF )
            // InternalMyATL.g:2109:2: iv_ruleInfixOperator= ruleInfixOperator EOF
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
    // InternalMyATL.g:2115:1: ruleInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator ;
    public final AntlrDatatypeRuleToken ruleInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperator_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:2121:2: (this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator )
            // InternalMyATL.g:2122:2: this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator
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
    // InternalMyATL.g:2135:1: entryRuleNavigationOperator returns [String current=null] : iv_ruleNavigationOperator= ruleNavigationOperator EOF ;
    public final String entryRuleNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperator = null;


        try {
            // InternalMyATL.g:2135:58: (iv_ruleNavigationOperator= ruleNavigationOperator EOF )
            // InternalMyATL.g:2136:2: iv_ruleNavigationOperator= ruleNavigationOperator EOF
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
    // InternalMyATL.g:2142:1: ruleNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator ;
    public final AntlrDatatypeRuleToken ruleNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperator_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:2148:2: (this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator )
            // InternalMyATL.g:2149:2: this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator
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
    // InternalMyATL.g:2162:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // InternalMyATL.g:2162:57: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // InternalMyATL.g:2163:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
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
    // InternalMyATL.g:2169:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? ( (lv_backtrack_7_0= 'true' ) ) ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_backtrack_7_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedType_5_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:2175:2: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? ( (lv_backtrack_7_0= 'true' ) ) ) )
            // InternalMyATL.g:2176:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? ( (lv_backtrack_7_0= 'true' ) ) )
            {
            // InternalMyATL.g:2176:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? ( (lv_backtrack_7_0= 'true' ) ) )
            // InternalMyATL.g:2177:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? ( (lv_backtrack_7_0= 'true' ) )
            {
            // InternalMyATL.g:2177:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // InternalMyATL.g:2178:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // InternalMyATL.g:2178:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // InternalMyATL.g:2179:5: lv_name_0_0= ruleCollectionTypeIdentifier
            {

            					newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
            lv_name_0_0=ruleCollectionTypeIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyATL.CollectionTypeIdentifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:2196:3: ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )?
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            else if ( (LA32_0==63) ) {
                alt32=2;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyATL.g:2197:4: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
                    {
                    // InternalMyATL.g:2197:4: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
                    // InternalMyATL.g:2198:5: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_28); 

                    					newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalMyATL.g:2202:5: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyATL.g:2203:6: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyATL.g:2203:6: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyATL.g:2204:7: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    							newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                    							}
                    							set(
                    								current,
                    								"ownedType",
                    								lv_ownedType_2_0,
                    								"org.xtext.example.mydsl.MyATL.TypeExpCS");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,47,FOLLOW_39); 

                    					newLeafNode(otherlv_3, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyATL.g:2227:4: (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' )
                    {
                    // InternalMyATL.g:2227:4: (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' )
                    // InternalMyATL.g:2228:5: otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>'
                    {
                    otherlv_4=(Token)match(input,63,FOLLOW_28); 

                    					newLeafNode(otherlv_4, grammarAccess.getCollectionTypeCSAccess().getLessThanSignKeyword_1_1_0());
                    				
                    // InternalMyATL.g:2232:5: ( (lv_ownedType_5_0= ruleTypeExpCS ) )
                    // InternalMyATL.g:2233:6: (lv_ownedType_5_0= ruleTypeExpCS )
                    {
                    // InternalMyATL.g:2233:6: (lv_ownedType_5_0= ruleTypeExpCS )
                    // InternalMyATL.g:2234:7: lv_ownedType_5_0= ruleTypeExpCS
                    {

                    							newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_40);
                    lv_ownedType_5_0=ruleTypeExpCS();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                    							}
                    							set(
                    								current,
                    								"ownedType",
                    								lv_ownedType_5_0,
                    								"org.xtext.example.mydsl.MyATL.TypeExpCS");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,62,FOLLOW_39); 

                    					newLeafNode(otherlv_6, grammarAccess.getCollectionTypeCSAccess().getGreaterThanSignKeyword_1_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalMyATL.g:2257:3: ( (lv_backtrack_7_0= 'true' ) )
            // InternalMyATL.g:2258:4: (lv_backtrack_7_0= 'true' )
            {
            // InternalMyATL.g:2258:4: (lv_backtrack_7_0= 'true' )
            // InternalMyATL.g:2259:5: lv_backtrack_7_0= 'true'
            {
            lv_backtrack_7_0=(Token)match(input,72,FOLLOW_2); 

            					newLeafNode(lv_backtrack_7_0, grammarAccess.getCollectionTypeCSAccess().getBacktrackTrueKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollectionTypeCSRule());
            					}
            					setWithLastConsumed(current, "backtrack", lv_backtrack_7_0, "true");
            				

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
    // $ANTLR end "ruleCollectionTypeCS"


    // $ANTLR start "entryRuleTupleTypeCS"
    // InternalMyATL.g:2275:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // InternalMyATL.g:2275:52: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // InternalMyATL.g:2276:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
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
    // InternalMyATL.g:2282:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) ) ;
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
            // InternalMyATL.g:2288:2: ( ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) ) )
            // InternalMyATL.g:2289:2: ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) )
            {
            // InternalMyATL.g:2289:2: ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) )
            // InternalMyATL.g:2290:3: ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) )
            {
            // InternalMyATL.g:2290:3: ( (lv_name_0_0= 'Tuple' ) )
            // InternalMyATL.g:2291:4: (lv_name_0_0= 'Tuple' )
            {
            // InternalMyATL.g:2291:4: (lv_name_0_0= 'Tuple' )
            // InternalMyATL.g:2292:5: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,25,FOLLOW_38); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTupleTypeCSAccess().getNameTupleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTupleTypeCSRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Tuple");
            				

            }


            }

            // InternalMyATL.g:2304:3: ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )?
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                alt37=1;
            }
            else if ( (LA37_0==63) ) {
                alt37=2;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyATL.g:2305:4: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' )
                    {
                    // InternalMyATL.g:2305:4: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' )
                    // InternalMyATL.g:2306:5: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_26); 

                    					newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalMyATL.g:2310:5: ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_SIMPLE_ID) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalMyATL.g:2311:6: ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )*
                            {
                            // InternalMyATL.g:2311:6: ( (lv_ownedParts_2_0= ruletuplePartCS ) )
                            // InternalMyATL.g:2312:7: (lv_ownedParts_2_0= ruletuplePartCS )
                            {
                            // InternalMyATL.g:2312:7: (lv_ownedParts_2_0= ruletuplePartCS )
                            // InternalMyATL.g:2313:8: lv_ownedParts_2_0= ruletuplePartCS
                            {

                            								newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_0_1_0_0());
                            							
                            pushFollow(FOLLOW_27);
                            lv_ownedParts_2_0=ruletuplePartCS();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            								}
                            								add(
                            									current,
                            									"ownedParts",
                            									lv_ownedParts_2_0,
                            									"org.xtext.example.mydsl.MyATL.tuplePartCS");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMyATL.g:2330:6: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==22) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // InternalMyATL.g:2331:7: otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                            	    							newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_0_1_1_0());
                            	    						
                            	    // InternalMyATL.g:2335:7: ( (lv_ownedParts_4_0= ruletuplePartCS ) )
                            	    // InternalMyATL.g:2336:8: (lv_ownedParts_4_0= ruletuplePartCS )
                            	    {
                            	    // InternalMyATL.g:2336:8: (lv_ownedParts_4_0= ruletuplePartCS )
                            	    // InternalMyATL.g:2337:9: lv_ownedParts_4_0= ruletuplePartCS
                            	    {

                            	    									newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_0_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_27);
                            	    lv_ownedParts_4_0=ruletuplePartCS();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"ownedParts",
                            	    										lv_ownedParts_4_0,
                            	    										"org.xtext.example.mydsl.MyATL.tuplePartCS");
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
                            break;

                    }

                    otherlv_5=(Token)match(input,47,FOLLOW_39); 

                    					newLeafNode(otherlv_5, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyATL.g:2362:4: (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' )
                    {
                    // InternalMyATL.g:2362:4: (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' )
                    // InternalMyATL.g:2363:5: otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>'
                    {
                    otherlv_6=(Token)match(input,63,FOLLOW_41); 

                    					newLeafNode(otherlv_6, grammarAccess.getTupleTypeCSAccess().getLessThanSignKeyword_1_1_0());
                    				
                    // InternalMyATL.g:2367:5: ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_SIMPLE_ID) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalMyATL.g:2368:6: ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )*
                            {
                            // InternalMyATL.g:2368:6: ( (lv_ownedParts_7_0= ruletuplePartCS ) )
                            // InternalMyATL.g:2369:7: (lv_ownedParts_7_0= ruletuplePartCS )
                            {
                            // InternalMyATL.g:2369:7: (lv_ownedParts_7_0= ruletuplePartCS )
                            // InternalMyATL.g:2370:8: lv_ownedParts_7_0= ruletuplePartCS
                            {

                            								newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_0_0());
                            							
                            pushFollow(FOLLOW_42);
                            lv_ownedParts_7_0=ruletuplePartCS();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            								}
                            								add(
                            									current,
                            									"ownedParts",
                            									lv_ownedParts_7_0,
                            									"org.xtext.example.mydsl.MyATL.tuplePartCS");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMyATL.g:2387:6: (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==22) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // InternalMyATL.g:2388:7: otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) )
                            	    {
                            	    otherlv_8=(Token)match(input,22,FOLLOW_3); 

                            	    							newLeafNode(otherlv_8, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_1_0());
                            	    						
                            	    // InternalMyATL.g:2392:7: ( (lv_ownedParts_9_0= ruletuplePartCS ) )
                            	    // InternalMyATL.g:2393:8: (lv_ownedParts_9_0= ruletuplePartCS )
                            	    {
                            	    // InternalMyATL.g:2393:8: (lv_ownedParts_9_0= ruletuplePartCS )
                            	    // InternalMyATL.g:2394:9: lv_ownedParts_9_0= ruletuplePartCS
                            	    {

                            	    									newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_42);
                            	    lv_ownedParts_9_0=ruletuplePartCS();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"ownedParts",
                            	    										lv_ownedParts_9_0,
                            	    										"org.xtext.example.mydsl.MyATL.tuplePartCS");
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

                    otherlv_10=(Token)match(input,62,FOLLOW_39); 

                    					newLeafNode(otherlv_10, grammarAccess.getTupleTypeCSAccess().getGreaterThanSignKeyword_1_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalMyATL.g:2419:3: ( (lv_backtrack_11_0= 'true' ) )
            // InternalMyATL.g:2420:4: (lv_backtrack_11_0= 'true' )
            {
            // InternalMyATL.g:2420:4: (lv_backtrack_11_0= 'true' )
            // InternalMyATL.g:2421:5: lv_backtrack_11_0= 'true'
            {
            lv_backtrack_11_0=(Token)match(input,72,FOLLOW_2); 

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
    // InternalMyATL.g:2437:1: entryRuletuplePartCS returns [EObject current=null] : iv_ruletuplePartCS= ruletuplePartCS EOF ;
    public final EObject entryRuletuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletuplePartCS = null;


        try {
            // InternalMyATL.g:2437:52: (iv_ruletuplePartCS= ruletuplePartCS EOF )
            // InternalMyATL.g:2438:2: iv_ruletuplePartCS= ruletuplePartCS EOF
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
    // InternalMyATL.g:2444:1: ruletuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruletuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:2450:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalMyATL.g:2451:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalMyATL.g:2451:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalMyATL.g:2452:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalMyATL.g:2452:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyATL.g:2453:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyATL.g:2453:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyATL.g:2454:5: lv_name_0_0= ruleUnrestrictedName
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
            						"org.xtext.example.mydsl.MyATL.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
            		
            // InternalMyATL.g:2475:3: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalMyATL.g:2476:4: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalMyATL.g:2476:4: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalMyATL.g:2477:5: lv_ownedType_2_0= ruleTypeExpCS
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
            						"org.xtext.example.mydsl.MyATL.TypeExpCS");
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
    // InternalMyATL.g:2498:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // InternalMyATL.g:2498:64: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // InternalMyATL.g:2499:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
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
    // InternalMyATL.g:2505:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ( (lv_backtrack_3_0= 'true' ) ) ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_backtrack_3_0=null;
        EObject lv_expressionCS_0_0 = null;

        EObject lv_lastExpressionCS_2_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:2511:2: ( ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ( (lv_backtrack_3_0= 'true' ) ) ) )
            // InternalMyATL.g:2512:2: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ( (lv_backtrack_3_0= 'true' ) ) )
            {
            // InternalMyATL.g:2512:2: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ( (lv_backtrack_3_0= 'true' ) ) )
            // InternalMyATL.g:2513:3: ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ( (lv_backtrack_3_0= 'true' ) )
            {
            // InternalMyATL.g:2513:3: ( (lv_expressionCS_0_0= ruleExpCS ) )
            // InternalMyATL.g:2514:4: (lv_expressionCS_0_0= ruleExpCS )
            {
            // InternalMyATL.g:2514:4: (lv_expressionCS_0_0= ruleExpCS )
            // InternalMyATL.g:2515:5: lv_expressionCS_0_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSExpCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
            lv_expressionCS_0_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
            					}
            					set(
            						current,
            						"expressionCS",
            						lv_expressionCS_0_0,
            						"org.xtext.example.mydsl.MyATL.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:2532:3: (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==73) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyATL.g:2533:4: otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    {
                    otherlv_1=(Token)match(input,73,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_1_0());
                    			
                    // InternalMyATL.g:2537:4: ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    // InternalMyATL.g:2538:5: (lv_lastExpressionCS_2_0= ruleExpCS )
                    {
                    // InternalMyATL.g:2538:5: (lv_lastExpressionCS_2_0= ruleExpCS )
                    // InternalMyATL.g:2539:6: lv_lastExpressionCS_2_0= ruleExpCS
                    {

                    						newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_lastExpressionCS_2_0=ruleExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                    						}
                    						set(
                    							current,
                    							"lastExpressionCS",
                    							lv_lastExpressionCS_2_0,
                    							"org.xtext.example.mydsl.MyATL.ExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyATL.g:2557:3: ( (lv_backtrack_3_0= 'true' ) )
            // InternalMyATL.g:2558:4: (lv_backtrack_3_0= 'true' )
            {
            // InternalMyATL.g:2558:4: (lv_backtrack_3_0= 'true' )
            // InternalMyATL.g:2559:5: lv_backtrack_3_0= 'true'
            {
            lv_backtrack_3_0=(Token)match(input,72,FOLLOW_2); 

            					newLeafNode(lv_backtrack_3_0, grammarAccess.getCollectionLiteralPartCSAccess().getBacktrackTrueKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollectionLiteralPartCSRule());
            					}
            					setWithLastConsumed(current, "backtrack", lv_backtrack_3_0, "true");
            				

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
    // $ANTLR end "ruleCollectionLiteralPartCS"


    // $ANTLR start "entryRulePrimitiveLiteralExpCS"
    // InternalMyATL.g:2575:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // InternalMyATL.g:2575:62: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // InternalMyATL.g:2576:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
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
    // InternalMyATL.g:2582:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
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
            // InternalMyATL.g:2588:2: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // InternalMyATL.g:2589:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // InternalMyATL.g:2589:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt39=6;
            switch ( input.LA(1) ) {
            case RULE_BIG_INT:
                {
                alt39=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt39=2;
                }
                break;
            case 72:
            case 74:
                {
                alt39=3;
                }
                break;
            case 59:
                {
                alt39=4;
                }
                break;
            case 75:
                {
                alt39=5;
                }
                break;
            case 76:
                {
                alt39=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalMyATL.g:2590:3: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
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
                    // InternalMyATL.g:2599:3: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
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
                    // InternalMyATL.g:2608:3: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
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
                    // InternalMyATL.g:2617:3: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
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
                    // InternalMyATL.g:2626:3: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
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
                    // InternalMyATL.g:2635:3: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
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
    // InternalMyATL.g:2647:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // InternalMyATL.g:2647:58: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // InternalMyATL.g:2648:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
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
    // InternalMyATL.g:2654:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
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
            // InternalMyATL.g:2660:2: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // InternalMyATL.g:2661:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // InternalMyATL.g:2661:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // InternalMyATL.g:2662:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyATL.g:2670:3: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // InternalMyATL.g:2671:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // InternalMyATL.g:2671:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // InternalMyATL.g:2672:5: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {

            					newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_44);
            lv_ownedParts_2_0=ruleTupleLiteralPartCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            					}
            					add(
            						current,
            						"ownedParts",
            						lv_ownedParts_2_0,
            						"org.xtext.example.mydsl.MyATL.TupleLiteralPartCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:2689:3: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==22) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMyATL.g:2690:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyATL.g:2694:4: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // InternalMyATL.g:2695:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // InternalMyATL.g:2695:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // InternalMyATL.g:2696:6: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {

            	    						newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
            	    lv_ownedParts_4_0=ruleTupleLiteralPartCS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedParts",
            	    							lv_ownedParts_4_0,
            	    							"org.xtext.example.mydsl.MyATL.TupleLiteralPartCS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_5=(Token)match(input,42,FOLLOW_2); 

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
    // InternalMyATL.g:2722:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // InternalMyATL.g:2722:59: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // InternalMyATL.g:2723:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
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
    // InternalMyATL.g:2729:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:2735:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // InternalMyATL.g:2736:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // InternalMyATL.g:2736:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // InternalMyATL.g:2737:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // InternalMyATL.g:2737:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyATL.g:2738:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyATL.g:2738:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyATL.g:2739:5: lv_name_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_45);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyATL.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:2756:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==21) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyATL.g:2757:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyATL.g:2761:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyATL.g:2762:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyATL.g:2762:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyATL.g:2763:6: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_2_0,
                    							"org.xtext.example.mydsl.MyATL.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,51,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
            		
            // InternalMyATL.g:2785:3: ( (lv_initExpression_4_0= ruleExpCS ) )
            // InternalMyATL.g:2786:4: (lv_initExpression_4_0= ruleExpCS )
            {
            // InternalMyATL.g:2786:4: (lv_initExpression_4_0= ruleExpCS )
            // InternalMyATL.g:2787:5: lv_initExpression_4_0= ruleExpCS
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
            						"org.xtext.example.mydsl.MyATL.ExpCS");
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
    // InternalMyATL.g:2808:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // InternalMyATL.g:2808:59: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // InternalMyATL.g:2809:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
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
    // InternalMyATL.g:2815:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= RULE_BIG_INT ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyATL.g:2821:2: ( ( (lv_name_0_0= RULE_BIG_INT ) ) )
            // InternalMyATL.g:2822:2: ( (lv_name_0_0= RULE_BIG_INT ) )
            {
            // InternalMyATL.g:2822:2: ( (lv_name_0_0= RULE_BIG_INT ) )
            // InternalMyATL.g:2823:3: (lv_name_0_0= RULE_BIG_INT )
            {
            // InternalMyATL.g:2823:3: (lv_name_0_0= RULE_BIG_INT )
            // InternalMyATL.g:2824:4: lv_name_0_0= RULE_BIG_INT
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
            					"org.xtext.example.mydsl.MyATL.BIG_INT");
            			

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
    // InternalMyATL.g:2843:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // InternalMyATL.g:2843:59: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // InternalMyATL.g:2844:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
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
    // InternalMyATL.g:2850:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleStringLiteral ) ) ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:2856:2: ( ( (lv_name_0_0= ruleStringLiteral ) ) )
            // InternalMyATL.g:2857:2: ( (lv_name_0_0= ruleStringLiteral ) )
            {
            // InternalMyATL.g:2857:2: ( (lv_name_0_0= ruleStringLiteral ) )
            // InternalMyATL.g:2858:3: (lv_name_0_0= ruleStringLiteral )
            {
            // InternalMyATL.g:2858:3: (lv_name_0_0= ruleStringLiteral )
            // InternalMyATL.g:2859:4: lv_name_0_0= ruleStringLiteral
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
            					"org.xtext.example.mydsl.MyATL.StringLiteral");
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
    // InternalMyATL.g:2879:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // InternalMyATL.g:2879:60: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // InternalMyATL.g:2880:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
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
    // InternalMyATL.g:2886:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyATL.g:2892:2: ( ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) )
            // InternalMyATL.g:2893:2: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            {
            // InternalMyATL.g:2893:2: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==72) ) {
                alt42=1;
            }
            else if ( (LA42_0==74) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyATL.g:2894:3: ( (lv_name_0_0= 'true' ) )
                    {
                    // InternalMyATL.g:2894:3: ( (lv_name_0_0= 'true' ) )
                    // InternalMyATL.g:2895:4: (lv_name_0_0= 'true' )
                    {
                    // InternalMyATL.g:2895:4: (lv_name_0_0= 'true' )
                    // InternalMyATL.g:2896:5: lv_name_0_0= 'true'
                    {
                    lv_name_0_0=(Token)match(input,72,FOLLOW_2); 

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
                    // InternalMyATL.g:2909:3: ( (lv_name_1_0= 'false' ) )
                    {
                    // InternalMyATL.g:2909:3: ( (lv_name_1_0= 'false' ) )
                    // InternalMyATL.g:2910:4: (lv_name_1_0= 'false' )
                    {
                    // InternalMyATL.g:2910:4: (lv_name_1_0= 'false' )
                    // InternalMyATL.g:2911:5: lv_name_1_0= 'false'
                    {
                    lv_name_1_0=(Token)match(input,74,FOLLOW_2); 

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
    // InternalMyATL.g:2927:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // InternalMyATL.g:2927:69: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // InternalMyATL.g:2928:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
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
    // InternalMyATL.g:2934:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyATL.g:2940:2: ( ( () otherlv_1= '*' ) )
            // InternalMyATL.g:2941:2: ( () otherlv_1= '*' )
            {
            // InternalMyATL.g:2941:2: ( () otherlv_1= '*' )
            // InternalMyATL.g:2942:3: () otherlv_1= '*'
            {
            // InternalMyATL.g:2942:3: ()
            // InternalMyATL.g:2943:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_2); 

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
    // InternalMyATL.g:2957:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // InternalMyATL.g:2957:60: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // InternalMyATL.g:2958:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
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
    // InternalMyATL.g:2964:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyATL.g:2970:2: ( ( () otherlv_1= 'invalid' ) )
            // InternalMyATL.g:2971:2: ( () otherlv_1= 'invalid' )
            {
            // InternalMyATL.g:2971:2: ( () otherlv_1= 'invalid' )
            // InternalMyATL.g:2972:3: () otherlv_1= 'invalid'
            {
            // InternalMyATL.g:2972:3: ()
            // InternalMyATL.g:2973:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,75,FOLLOW_2); 

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
    // InternalMyATL.g:2987:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // InternalMyATL.g:2987:57: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // InternalMyATL.g:2988:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
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
    // InternalMyATL.g:2994:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyATL.g:3000:2: ( ( () otherlv_1= 'null' ) )
            // InternalMyATL.g:3001:2: ( () otherlv_1= 'null' )
            {
            // InternalMyATL.g:3001:2: ( () otherlv_1= 'null' )
            // InternalMyATL.g:3002:3: () otherlv_1= 'null'
            {
            // InternalMyATL.g:3002:3: ()
            // InternalMyATL.g:3003:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_2); 

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
    // InternalMyATL.g:3017:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // InternalMyATL.g:3017:56: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // InternalMyATL.g:3018:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
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
    // InternalMyATL.g:3024:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:3030:2: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // InternalMyATL.g:3031:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // InternalMyATL.g:3031:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // InternalMyATL.g:3032:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // InternalMyATL.g:3032:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // InternalMyATL.g:3033:4: lv_name_0_0= rulePrimitiveTypeIdentifier
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
            					"org.xtext.example.mydsl.MyATL.PrimitiveTypeIdentifier");
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
    // InternalMyATL.g:3053:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // InternalMyATL.g:3053:54: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // InternalMyATL.g:3054:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
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
    // InternalMyATL.g:3060:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_TupleTypeCS_1 = null;

        EObject this_CollectionTypeCS_2 = null;



        	enterRule();

        try {
            // InternalMyATL.g:3066:2: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS ) )
            // InternalMyATL.g:3067:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS )
            {
            // InternalMyATL.g:3067:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt43=1;
                }
                break;
            case 25:
                {
                alt43=2;
                }
                break;
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalMyATL.g:3068:3: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
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
                    // InternalMyATL.g:3077:3: this_TupleTypeCS_1= ruleTupleTypeCS
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
                    // InternalMyATL.g:3086:3: this_CollectionTypeCS_2= ruleCollectionTypeCS
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
    // InternalMyATL.g:3098:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // InternalMyATL.g:3098:54: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // InternalMyATL.g:3099:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
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
    // InternalMyATL.g:3105:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) ;
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
            // InternalMyATL.g:3111:2: ( ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) )
            // InternalMyATL.g:3112:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            {
            // InternalMyATL.g:3112:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_SIMPLE_ID) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==EOF||LA45_1==18||LA45_1==22||(LA45_1>=41 && LA45_1<=44)||(LA45_1>=46 && LA45_1<=47)||LA45_1==51||LA45_1==62||LA45_1==78) ) {
                    alt45=2;
                }
                else if ( (LA45_1==77) ) {
                    alt45=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyATL.g:3113:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    {
                    // InternalMyATL.g:3113:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    // InternalMyATL.g:3114:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) )
                    {
                    // InternalMyATL.g:3114:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* )
                    // InternalMyATL.g:3115:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    {
                    // InternalMyATL.g:3115:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) )
                    // InternalMyATL.g:3116:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    {
                    // InternalMyATL.g:3116:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    // InternalMyATL.g:3117:7: lv_namespace_0_0= ruleUnrestrictedName
                    {

                    							newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getNamespaceUnrestrictedNameParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_46);
                    lv_namespace_0_0=ruleUnrestrictedName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                    							}
                    							add(
                    								current,
                    								"namespace",
                    								lv_namespace_0_0,
                    								"org.xtext.example.mydsl.MyATL.UnrestrictedName");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,77,FOLLOW_28); 

                    					newLeafNode(otherlv_1, grammarAccess.getTypeNameExpCSAccess().getColonColonKeyword_0_0_1());
                    				
                    // InternalMyATL.g:3138:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    loop44:
                    do {
                        int alt44=2;
                        alt44 = dfa44.predict(input);
                        switch (alt44) {
                    	case 1 :
                    	    // InternalMyATL.g:3139:6: ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::'
                    	    {
                    	    // InternalMyATL.g:3139:6: ( (lv_namespace_2_0= ruleUnreservedName ) )
                    	    // InternalMyATL.g:3140:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    {
                    	    // InternalMyATL.g:3140:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    // InternalMyATL.g:3141:8: lv_namespace_2_0= ruleUnreservedName
                    	    {

                    	    								newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getNamespaceUnreservedNameParserRuleCall_0_0_2_0_0());
                    	    							
                    	    pushFollow(FOLLOW_46);
                    	    lv_namespace_2_0=ruleUnreservedName();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"namespace",
                    	    									lv_namespace_2_0,
                    	    									"org.xtext.example.mydsl.MyATL.UnreservedName");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    otherlv_3=(Token)match(input,77,FOLLOW_28); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getTypeNameExpCSAccess().getColonColonKeyword_0_0_2_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }

                    // InternalMyATL.g:3164:4: ( (lv_element_4_0= ruleUnreservedName ) )
                    // InternalMyATL.g:3165:5: (lv_element_4_0= ruleUnreservedName )
                    {
                    // InternalMyATL.g:3165:5: (lv_element_4_0= ruleUnreservedName )
                    // InternalMyATL.g:3166:6: lv_element_4_0= ruleUnreservedName
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
                    							"org.xtext.example.mydsl.MyATL.UnreservedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyATL.g:3185:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    {
                    // InternalMyATL.g:3185:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    // InternalMyATL.g:3186:4: (lv_element_5_0= ruleUnrestrictedName )
                    {
                    // InternalMyATL.g:3186:4: (lv_element_5_0= ruleUnrestrictedName )
                    // InternalMyATL.g:3187:5: lv_element_5_0= ruleUnrestrictedName
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
                    						"org.xtext.example.mydsl.MyATL.UnrestrictedName");
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
    // InternalMyATL.g:3208:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // InternalMyATL.g:3208:50: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // InternalMyATL.g:3209:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
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
    // InternalMyATL.g:3215:1: ruleTypeExpCS returns [EObject current=null] : (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;



        	enterRule();

        try {
            // InternalMyATL.g:3221:2: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) )
            // InternalMyATL.g:3222:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            {
            // InternalMyATL.g:3222:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_SIMPLE_ID) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=25 && LA46_0<=38)) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyATL.g:3223:3: this_TypeNameExpCS_0= ruleTypeNameExpCS
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
                    // InternalMyATL.g:3232:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
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
    // InternalMyATL.g:3244:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // InternalMyATL.g:3244:56: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // InternalMyATL.g:3245:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
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
    // InternalMyATL.g:3251:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_init_4_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:3257:2: ( ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? ) )
            // InternalMyATL.g:3258:2: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )
            {
            // InternalMyATL.g:3258:2: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )
            // InternalMyATL.g:3259:3: ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
            {
            // InternalMyATL.g:3259:3: ( (lv_name_0_0= ruleNavigatingArgExpCS ) )
            // InternalMyATL.g:3260:4: (lv_name_0_0= ruleNavigatingArgExpCS )
            {
            // InternalMyATL.g:3260:4: (lv_name_0_0= ruleNavigatingArgExpCS )
            // InternalMyATL.g:3261:5: lv_name_0_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_47);
            lv_name_0_0=ruleNavigatingArgExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyATL.NavigatingArgExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:3278:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==21) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyATL.g:3279:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyATL.g:3283:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyATL.g:3284:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyATL.g:3284:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyATL.g:3285:6: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_2_0,
                    							"org.xtext.example.mydsl.MyATL.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyATL.g:3303:3: (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==51) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyATL.g:3304:4: otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalMyATL.g:3308:4: ( (lv_init_4_0= ruleExpCS ) )
                    // InternalMyATL.g:3309:5: (lv_init_4_0= ruleExpCS )
                    {
                    // InternalMyATL.g:3309:5: (lv_init_4_0= ruleExpCS )
                    // InternalMyATL.g:3310:6: lv_init_4_0= ruleExpCS
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
                    							"org.xtext.example.mydsl.MyATL.ExpCS");
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
    // InternalMyATL.g:3332:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // InternalMyATL.g:3332:59: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // InternalMyATL.g:3333:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
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
    // InternalMyATL.g:3339:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // InternalMyATL.g:3345:2: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyATL.g:3346:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyATL.g:3346:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyATL.g:3347:3: ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyATL.g:3347:3: ( (lv_prefix_0_0= '|' ) )
            // InternalMyATL.g:3348:4: (lv_prefix_0_0= '|' )
            {
            // InternalMyATL.g:3348:4: (lv_prefix_0_0= '|' )
            // InternalMyATL.g:3349:5: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,78,FOLLOW_19); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, "|");
            				

            }


            }

            // InternalMyATL.g:3361:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyATL.g:3362:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyATL.g:3362:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyATL.g:3363:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyATL.NavigatingArgExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:3380:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==21) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyATL.g:3381:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyATL.g:3385:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyATL.g:3386:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyATL.g:3386:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyATL.g:3387:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_3_0,
                    							"org.xtext.example.mydsl.MyATL.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyATL.g:3405:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==51) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyATL.g:3406:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyATL.g:3410:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyATL.g:3411:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyATL.g:3411:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyATL.g:3412:6: lv_init_5_0= ruleExpCS
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
                    							"org.xtext.example.mydsl.MyATL.ExpCS");
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
    // InternalMyATL.g:3434:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // InternalMyATL.g:3434:61: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // InternalMyATL.g:3435:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
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
    // InternalMyATL.g:3441:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // InternalMyATL.g:3447:2: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyATL.g:3448:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyATL.g:3448:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyATL.g:3449:3: ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyATL.g:3449:3: ( (lv_prefix_0_0= ',' ) )
            // InternalMyATL.g:3450:4: (lv_prefix_0_0= ',' )
            {
            // InternalMyATL.g:3450:4: (lv_prefix_0_0= ',' )
            // InternalMyATL.g:3451:5: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,22,FOLLOW_19); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ",");
            				

            }


            }

            // InternalMyATL.g:3463:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyATL.g:3464:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyATL.g:3464:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyATL.g:3465:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyATL.NavigatingArgExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:3482:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==21) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyATL.g:3483:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyATL.g:3487:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyATL.g:3488:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyATL.g:3488:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyATL.g:3489:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_3_0,
                    							"org.xtext.example.mydsl.MyATL.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyATL.g:3507:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==51) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyATL.g:3508:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyATL.g:3512:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyATL.g:3513:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyATL.g:3513:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyATL.g:3514:6: lv_init_5_0= ruleExpCS
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
                    							"org.xtext.example.mydsl.MyATL.ExpCS");
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
    // InternalMyATL.g:3536:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // InternalMyATL.g:3536:60: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // InternalMyATL.g:3537:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
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
    // InternalMyATL.g:3543:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // InternalMyATL.g:3549:2: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyATL.g:3550:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyATL.g:3550:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyATL.g:3551:3: ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyATL.g:3551:3: ( (lv_prefix_0_0= ';' ) )
            // InternalMyATL.g:3552:4: (lv_prefix_0_0= ';' )
            {
            // InternalMyATL.g:3552:4: (lv_prefix_0_0= ';' )
            // InternalMyATL.g:3553:5: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,18,FOLLOW_19); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ";");
            				

            }


            }

            // InternalMyATL.g:3565:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyATL.g:3566:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyATL.g:3566:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyATL.g:3567:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyATL.NavigatingArgExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:3584:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==21) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyATL.g:3585:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyATL.g:3589:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyATL.g:3590:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyATL.g:3590:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyATL.g:3591:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_3_0,
                    							"org.xtext.example.mydsl.MyATL.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyATL.g:3609:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==51) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyATL.g:3610:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyATL.g:3614:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyATL.g:3615:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyATL.g:3615:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyATL.g:3616:6: lv_init_5_0= ruleExpCS
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
                    							"org.xtext.example.mydsl.MyATL.ExpCS");
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
    // InternalMyATL.g:3638:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // InternalMyATL.g:3638:59: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // InternalMyATL.g:3639:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
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
    // InternalMyATL.g:3645:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:3651:2: (this_ExpCS_0= ruleExpCS )
            // InternalMyATL.g:3652:2: this_ExpCS_0= ruleExpCS
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
    // InternalMyATL.g:3663:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // InternalMyATL.g:3663:48: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // InternalMyATL.g:3664:2: iv_ruleIfExpCS= ruleIfExpCS EOF
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
    // InternalMyATL.g:3670:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) ;
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
            // InternalMyATL.g:3676:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) )
            // InternalMyATL.g:3677:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            {
            // InternalMyATL.g:3677:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            // InternalMyATL.g:3678:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
            		
            // InternalMyATL.g:3682:3: ( (lv_condition_1_0= ruleExpCS ) )
            // InternalMyATL.g:3683:4: (lv_condition_1_0= ruleExpCS )
            {
            // InternalMyATL.g:3683:4: (lv_condition_1_0= ruleExpCS )
            // InternalMyATL.g:3684:5: lv_condition_1_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getConditionExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_49);
            lv_condition_1_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.xtext.example.mydsl.MyATL.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,80,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
            		
            // InternalMyATL.g:3705:3: ( (lv_thenExpression_3_0= ruleExpCS ) )
            // InternalMyATL.g:3706:4: (lv_thenExpression_3_0= ruleExpCS )
            {
            // InternalMyATL.g:3706:4: (lv_thenExpression_3_0= ruleExpCS )
            // InternalMyATL.g:3707:5: lv_thenExpression_3_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getThenExpressionExpCSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_50);
            lv_thenExpression_3_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            					}
            					set(
            						current,
            						"thenExpression",
            						lv_thenExpression_3_0,
            						"org.xtext.example.mydsl.MyATL.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,81,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getIfExpCSAccess().getElseKeyword_4());
            		
            // InternalMyATL.g:3728:3: ( (lv_elseExpression_5_0= ruleExpCS ) )
            // InternalMyATL.g:3729:4: (lv_elseExpression_5_0= ruleExpCS )
            {
            // InternalMyATL.g:3729:4: (lv_elseExpression_5_0= ruleExpCS )
            // InternalMyATL.g:3730:5: lv_elseExpression_5_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getElseExpressionExpCSParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_51);
            lv_elseExpression_5_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            					}
            					set(
            						current,
            						"elseExpression",
            						lv_elseExpression_5_0,
            						"org.xtext.example.mydsl.MyATL.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,82,FOLLOW_2); 

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
    // InternalMyATL.g:3755:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // InternalMyATL.g:3755:49: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // InternalMyATL.g:3756:2: iv_ruleLetExpCS= ruleLetExpCS EOF
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
    // InternalMyATL.g:3762:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) ;
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
            // InternalMyATL.g:3768:2: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) )
            // InternalMyATL.g:3769:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            {
            // InternalMyATL.g:3769:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            // InternalMyATL.g:3770:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
            		
            // InternalMyATL.g:3774:3: ( (lv_variable_1_0= ruleLetVariableCS ) )
            // InternalMyATL.g:3775:4: (lv_variable_1_0= ruleLetVariableCS )
            {
            // InternalMyATL.g:3775:4: (lv_variable_1_0= ruleLetVariableCS )
            // InternalMyATL.g:3776:5: lv_variable_1_0= ruleLetVariableCS
            {

            					newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_52);
            lv_variable_1_0=ruleLetVariableCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            					}
            					add(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"org.xtext.example.mydsl.MyATL.LetVariableCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:3793:3: (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==22) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalMyATL.g:3794:4: otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyATL.g:3798:4: ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    // InternalMyATL.g:3799:5: (lv_variable_3_0= ruleLetVariableCS )
            	    {
            	    // InternalMyATL.g:3799:5: (lv_variable_3_0= ruleLetVariableCS )
            	    // InternalMyATL.g:3800:6: lv_variable_3_0= ruleLetVariableCS
            	    {

            	    						newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_52);
            	    lv_variable_3_0=ruleLetVariableCS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variable",
            	    							lv_variable_3_0,
            	    							"org.xtext.example.mydsl.MyATL.LetVariableCS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_4=(Token)match(input,84,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
            		
            // InternalMyATL.g:3822:3: ( (lv_in_5_0= ruleExpCS ) )
            // InternalMyATL.g:3823:4: (lv_in_5_0= ruleExpCS )
            {
            // InternalMyATL.g:3823:4: (lv_in_5_0= ruleExpCS )
            // InternalMyATL.g:3824:5: lv_in_5_0= ruleExpCS
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
            						"org.xtext.example.mydsl.MyATL.ExpCS");
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
    // InternalMyATL.g:3845:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // InternalMyATL.g:3845:54: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // InternalMyATL.g:3846:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
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
    // InternalMyATL.g:3852:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:3858:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // InternalMyATL.g:3859:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // InternalMyATL.g:3859:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // InternalMyATL.g:3860:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // InternalMyATL.g:3860:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyATL.g:3861:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyATL.g:3861:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyATL.g:3862:5: lv_name_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_45);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyATL.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyATL.g:3879:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==21) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyATL.g:3880:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getLetVariableCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyATL.g:3884:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyATL.g:3885:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyATL.g:3885:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyATL.g:3886:6: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_2_0,
                    							"org.xtext.example.mydsl.MyATL.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,51,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_2());
            		
            // InternalMyATL.g:3908:3: ( (lv_initExpression_4_0= ruleExpCS ) )
            // InternalMyATL.g:3909:4: (lv_initExpression_4_0= ruleExpCS )
            {
            // InternalMyATL.g:3909:4: (lv_initExpression_4_0= ruleExpCS )
            // InternalMyATL.g:3910:5: lv_initExpression_4_0= ruleExpCS
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
            						"org.xtext.example.mydsl.MyATL.ExpCS");
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
    // InternalMyATL.g:3931:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // InternalMyATL.g:3931:52: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // InternalMyATL.g:3932:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
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
    // InternalMyATL.g:3938:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_source_1_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:3944:2: ( (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // InternalMyATL.g:3945:2: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // InternalMyATL.g:3945:2: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // InternalMyATL.g:3946:3: otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyATL.g:3950:3: ( (lv_source_1_0= ruleExpCS ) )
            // InternalMyATL.g:3951:4: (lv_source_1_0= ruleExpCS )
            {
            // InternalMyATL.g:3951:4: (lv_source_1_0= ruleExpCS )
            // InternalMyATL.g:3952:5: lv_source_1_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getNestedExpCSAccess().getSourceExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_source_1_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNestedExpCSRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_1_0,
            						"org.xtext.example.mydsl.MyATL.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_2); 

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
    // InternalMyATL.g:3977:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // InternalMyATL.g:3977:50: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // InternalMyATL.g:3978:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
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
    // InternalMyATL.g:3984:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyATL.g:3990:2: ( ( () otherlv_1= 'self' ) )
            // InternalMyATL.g:3991:2: ( () otherlv_1= 'self' )
            {
            // InternalMyATL.g:3991:2: ( () otherlv_1= 'self' )
            // InternalMyATL.g:3992:3: () otherlv_1= 'self'
            {
            // InternalMyATL.g:3992:3: ()
            // InternalMyATL.g:3993:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelfExpCSAccess().getSelfExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,85,FOLLOW_2); 

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
    // InternalMyATL.g:4007:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // InternalMyATL.g:4007:53: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // InternalMyATL.g:4008:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
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
    // InternalMyATL.g:4014:1: rulePrimaryExpCS returns [EObject current=null] : (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_LetExpCS_4= ruleLetExpCS | this_IfExpCS_5= ruleIfExpCS | this_NestedExpCS_6= ruleNestedExpCS ) ;
    public final EObject rulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NavigatingExpCS_0 = null;

        EObject this_SelfExpCS_1 = null;

        EObject this_PrimitiveLiteralExpCS_2 = null;

        EObject this_TupleLiteralExpCS_3 = null;

        EObject this_LetExpCS_4 = null;

        EObject this_IfExpCS_5 = null;

        EObject this_NestedExpCS_6 = null;



        	enterRule();

        try {
            // InternalMyATL.g:4020:2: ( (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_LetExpCS_4= ruleLetExpCS | this_IfExpCS_5= ruleIfExpCS | this_NestedExpCS_6= ruleNestedExpCS ) )
            // InternalMyATL.g:4021:2: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_LetExpCS_4= ruleLetExpCS | this_IfExpCS_5= ruleIfExpCS | this_NestedExpCS_6= ruleNestedExpCS )
            {
            // InternalMyATL.g:4021:2: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_LetExpCS_4= ruleLetExpCS | this_IfExpCS_5= ruleIfExpCS | this_NestedExpCS_6= ruleNestedExpCS )
            int alt57=7;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
                {
                alt57=1;
                }
                break;
            case 85:
                {
                alt57=2;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
            case RULE_BIG_INT:
            case 59:
            case 72:
            case 74:
            case 75:
            case 76:
                {
                alt57=3;
                }
                break;
            case 25:
                {
                alt57=4;
                }
                break;
            case 83:
                {
                alt57=5;
                }
                break;
            case 79:
                {
                alt57=6;
                }
                break;
            case 46:
                {
                alt57=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalMyATL.g:4022:3: this_NavigatingExpCS_0= ruleNavigatingExpCS
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
                    // InternalMyATL.g:4031:3: this_SelfExpCS_1= ruleSelfExpCS
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
                    // InternalMyATL.g:4040:3: this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS
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
                    // InternalMyATL.g:4049:3: this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS
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
                    // InternalMyATL.g:4058:3: this_LetExpCS_4= ruleLetExpCS
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
                    // InternalMyATL.g:4067:3: this_IfExpCS_5= ruleIfExpCS
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
                    // InternalMyATL.g:4076:3: this_NestedExpCS_6= ruleNestedExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_NestedExpCS_6=ruleNestedExpCS();

                    state._fsp--;


                    			current = this_NestedExpCS_6;
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
    // InternalMyATL.g:4088:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // InternalMyATL.g:4088:50: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // InternalMyATL.g:4089:2: iv_ruleNameExpCS= ruleNameExpCS EOF
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
    // InternalMyATL.g:4095:1: ruleNameExpCS returns [EObject current=null] : ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) ;
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
            // InternalMyATL.g:4101:2: ( ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) )
            // InternalMyATL.g:4102:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            {
            // InternalMyATL.g:4102:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_SIMPLE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==77) ) {
                    alt59=1;
                }
                else if ( (LA59_1==EOF||LA59_1==18||(LA59_1>=21 && LA59_1<=23)||LA59_1==42||(LA59_1>=46 && LA59_1<=47)||LA59_1==51||LA59_1==53||LA59_1==55||LA59_1==57||(LA59_1>=59 && LA59_1<=73)||LA59_1==78||(LA59_1>=80 && LA59_1<=82)||LA59_1==84||(LA59_1>=86 && LA59_1<=87)) ) {
                    alt59=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyATL.g:4103:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    {
                    // InternalMyATL.g:4103:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    // InternalMyATL.g:4104:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) )
                    {
                    // InternalMyATL.g:4104:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* )
                    // InternalMyATL.g:4105:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    {
                    // InternalMyATL.g:4105:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) )
                    // InternalMyATL.g:4106:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    {
                    // InternalMyATL.g:4106:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    // InternalMyATL.g:4107:7: lv_namespace_0_0= ruleUnrestrictedName
                    {

                    							newCompositeNode(grammarAccess.getNameExpCSAccess().getNamespaceUnrestrictedNameParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_46);
                    lv_namespace_0_0=ruleUnrestrictedName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                    							}
                    							add(
                    								current,
                    								"namespace",
                    								lv_namespace_0_0,
                    								"org.xtext.example.mydsl.MyATL.UnrestrictedName");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,77,FOLLOW_28); 

                    					newLeafNode(otherlv_1, grammarAccess.getNameExpCSAccess().getColonColonKeyword_0_0_1());
                    				
                    // InternalMyATL.g:4128:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    loop58:
                    do {
                        int alt58=2;
                        alt58 = dfa58.predict(input);
                        switch (alt58) {
                    	case 1 :
                    	    // InternalMyATL.g:4129:6: ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::'
                    	    {
                    	    // InternalMyATL.g:4129:6: ( (lv_namespace_2_0= ruleUnreservedName ) )
                    	    // InternalMyATL.g:4130:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    {
                    	    // InternalMyATL.g:4130:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    // InternalMyATL.g:4131:8: lv_namespace_2_0= ruleUnreservedName
                    	    {

                    	    								newCompositeNode(grammarAccess.getNameExpCSAccess().getNamespaceUnreservedNameParserRuleCall_0_0_2_0_0());
                    	    							
                    	    pushFollow(FOLLOW_46);
                    	    lv_namespace_2_0=ruleUnreservedName();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"namespace",
                    	    									lv_namespace_2_0,
                    	    									"org.xtext.example.mydsl.MyATL.UnreservedName");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    otherlv_3=(Token)match(input,77,FOLLOW_28); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getNameExpCSAccess().getColonColonKeyword_0_0_2_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }

                    // InternalMyATL.g:4154:4: ( (lv_element_4_0= ruleUnreservedName ) )
                    // InternalMyATL.g:4155:5: (lv_element_4_0= ruleUnreservedName )
                    {
                    // InternalMyATL.g:4155:5: (lv_element_4_0= ruleUnreservedName )
                    // InternalMyATL.g:4156:6: lv_element_4_0= ruleUnreservedName
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
                    							"org.xtext.example.mydsl.MyATL.UnreservedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyATL.g:4175:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    {
                    // InternalMyATL.g:4175:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    // InternalMyATL.g:4176:4: (lv_element_5_0= ruleUnrestrictedName )
                    {
                    // InternalMyATL.g:4176:4: (lv_element_5_0= ruleUnrestrictedName )
                    // InternalMyATL.g:4177:5: lv_element_5_0= ruleUnrestrictedName
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
                    						"org.xtext.example.mydsl.MyATL.UnrestrictedName");
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
    // InternalMyATL.g:4198:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // InternalMyATL.g:4198:46: (iv_ruleExpCS= ruleExpCS EOF )
            // InternalMyATL.g:4199:2: iv_ruleExpCS= ruleExpCS EOF
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
    // InternalMyATL.g:4205:1: ruleExpCS returns [EObject current=null] : this_InfixedExpCS_0= ruleInfixedExpCS ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixedExpCS_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:4211:2: (this_InfixedExpCS_0= ruleInfixedExpCS )
            // InternalMyATL.g:4212:2: this_InfixedExpCS_0= ruleInfixedExpCS
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
    // InternalMyATL.g:4223:1: entryRuleInfixedExpCS returns [EObject current=null] : iv_ruleInfixedExpCS= ruleInfixedExpCS EOF ;
    public final EObject entryRuleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixedExpCS = null;


        try {
            // InternalMyATL.g:4223:53: (iv_ruleInfixedExpCS= ruleInfixedExpCS EOF )
            // InternalMyATL.g:4224:2: iv_ruleInfixedExpCS= ruleInfixedExpCS EOF
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
    // InternalMyATL.g:4230:1: ruleInfixedExpCS returns [EObject current=null] : (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) ;
    public final EObject ruleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:4236:2: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) )
            // InternalMyATL.g:4237:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            {
            // InternalMyATL.g:4237:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            // InternalMyATL.g:4238:3: this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getInfixedExpCSAccess().getPrefixedExpCSParserRuleCall_0());
            		
            pushFollow(FOLLOW_53);
            this_PrefixedExpCS_0=rulePrefixedExpCS();

            state._fsp--;


            			current = this_PrefixedExpCS_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyATL.g:4246:3: ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // InternalMyATL.g:4247:4: () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    {
                    // InternalMyATL.g:4247:4: ()
                    // InternalMyATL.g:4248:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMyATL.g:4254:4: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        alt60 = dfa60.predict(input);
                        switch (alt60) {
                    	case 1 :
                    	    // InternalMyATL.g:4255:5: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    {
                    	    // InternalMyATL.g:4255:5: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) )
                    	    // InternalMyATL.g:4256:6: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    {
                    	    // InternalMyATL.g:4256:6: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    // InternalMyATL.g:4257:7: lv_ownedOperator_2_0= ruleBinaryOperatorCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_ownedOperator_2_0=ruleBinaryOperatorCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInfixedExpCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedOperator",
                    	    								lv_ownedOperator_2_0,
                    	    								"org.xtext.example.mydsl.MyATL.BinaryOperatorCS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalMyATL.g:4274:5: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    // InternalMyATL.g:4275:6: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    {
                    	    // InternalMyATL.g:4275:6: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    // InternalMyATL.g:4276:7: lv_ownedExpression_3_0= rulePrefixedExpCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_53);
                    	    lv_ownedExpression_3_0=rulePrefixedExpCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInfixedExpCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedExpression",
                    	    								lv_ownedExpression_3_0,
                    	    								"org.xtext.example.mydsl.MyATL.PrefixedExpCS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt60 >= 1 ) break loop60;
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
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
    // InternalMyATL.g:4299:1: entryRuleBinaryOperatorCS returns [EObject current=null] : iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF ;
    public final EObject entryRuleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperatorCS = null;


        try {
            // InternalMyATL.g:4299:57: (iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF )
            // InternalMyATL.g:4300:2: iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF
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
    // InternalMyATL.g:4306:1: ruleBinaryOperatorCS returns [EObject current=null] : (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) ;
    public final EObject ruleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixOperatorCS_0 = null;

        EObject this_NavigationOperatorCS_1 = null;



        	enterRule();

        try {
            // InternalMyATL.g:4312:2: ( (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) )
            // InternalMyATL.g:4313:2: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            {
            // InternalMyATL.g:4313:2: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==51||LA62_0==57||(LA62_0>=59 && LA62_0<=70)) ) {
                alt62=1;
            }
            else if ( (LA62_0==55||LA62_0==71) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalMyATL.g:4314:3: this_InfixOperatorCS_0= ruleInfixOperatorCS
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
                    // InternalMyATL.g:4323:3: this_NavigationOperatorCS_1= ruleNavigationOperatorCS
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
    // InternalMyATL.g:4335:1: entryRuleInfixOperatorCS returns [EObject current=null] : iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF ;
    public final EObject entryRuleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOperatorCS = null;


        try {
            // InternalMyATL.g:4335:56: (iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF )
            // InternalMyATL.g:4336:2: iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF
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
    // InternalMyATL.g:4342:1: ruleInfixOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleInfixOperator ) ) ;
    public final EObject ruleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:4348:2: ( ( (lv_name_0_0= ruleInfixOperator ) ) )
            // InternalMyATL.g:4349:2: ( (lv_name_0_0= ruleInfixOperator ) )
            {
            // InternalMyATL.g:4349:2: ( (lv_name_0_0= ruleInfixOperator ) )
            // InternalMyATL.g:4350:3: (lv_name_0_0= ruleInfixOperator )
            {
            // InternalMyATL.g:4350:3: (lv_name_0_0= ruleInfixOperator )
            // InternalMyATL.g:4351:4: lv_name_0_0= ruleInfixOperator
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
            					"org.xtext.example.mydsl.MyATL.InfixOperator");
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
    // InternalMyATL.g:4371:1: entryRuleNavigationOperatorCS returns [EObject current=null] : iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF ;
    public final EObject entryRuleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationOperatorCS = null;


        try {
            // InternalMyATL.g:4371:61: (iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF )
            // InternalMyATL.g:4372:2: iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF
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
    // InternalMyATL.g:4378:1: ruleNavigationOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleNavigationOperator ) ) ;
    public final EObject ruleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:4384:2: ( ( (lv_name_0_0= ruleNavigationOperator ) ) )
            // InternalMyATL.g:4385:2: ( (lv_name_0_0= ruleNavigationOperator ) )
            {
            // InternalMyATL.g:4385:2: ( (lv_name_0_0= ruleNavigationOperator ) )
            // InternalMyATL.g:4386:3: (lv_name_0_0= ruleNavigationOperator )
            {
            // InternalMyATL.g:4386:3: (lv_name_0_0= ruleNavigationOperator )
            // InternalMyATL.g:4387:4: lv_name_0_0= ruleNavigationOperator
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
            					"org.xtext.example.mydsl.MyATL.NavigationOperator");
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
    // InternalMyATL.g:4407:1: entryRulePrefixedExpCS returns [EObject current=null] : iv_rulePrefixedExpCS= rulePrefixedExpCS EOF ;
    public final EObject entryRulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedExpCS = null;


        try {
            // InternalMyATL.g:4407:54: (iv_rulePrefixedExpCS= rulePrefixedExpCS EOF )
            // InternalMyATL.g:4408:2: iv_rulePrefixedExpCS= rulePrefixedExpCS EOF
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
    // InternalMyATL.g:4414:1: rulePrefixedExpCS returns [EObject current=null] : (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) ;
    public final EObject rulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:4420:2: ( (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) )
            // InternalMyATL.g:4421:2: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            {
            // InternalMyATL.g:4421:2: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_SIMPLE_ID && LA64_0<=RULE_BIG_INT)||LA64_0==25||LA64_0==46||LA64_0==59||LA64_0==72||(LA64_0>=74 && LA64_0<=76)||LA64_0==79||LA64_0==83||LA64_0==85) ) {
                alt64=1;
            }
            else if ( ((LA64_0>=57 && LA64_0<=58)) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalMyATL.g:4422:3: this_PrimaryExpCS_0= rulePrimaryExpCS
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
                    // InternalMyATL.g:4431:3: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    {
                    // InternalMyATL.g:4431:3: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    // InternalMyATL.g:4432:4: () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    {
                    // InternalMyATL.g:4432:4: ()
                    // InternalMyATL.g:4433:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrefixedExpCSAccess().getPrefixExpCSAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMyATL.g:4439:4: ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+
                    int cnt63=0;
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( ((LA63_0>=57 && LA63_0<=58)) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalMyATL.g:4440:5: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    {
                    	    // InternalMyATL.g:4440:5: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    // InternalMyATL.g:4441:6: lv_ownedOperator_2_0= ruleUnaryOperatorCS
                    	    {

                    	    						newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_ownedOperator_2_0=ruleUnaryOperatorCS();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPrefixedExpCSRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ownedOperator",
                    	    							lv_ownedOperator_2_0,
                    	    							"org.xtext.example.mydsl.MyATL.UnaryOperatorCS");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt63 >= 1 ) break loop63;
                                EarlyExitException eee =
                                    new EarlyExitException(63, input);
                                throw eee;
                        }
                        cnt63++;
                    } while (true);

                    // InternalMyATL.g:4458:4: ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    // InternalMyATL.g:4459:5: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    {
                    // InternalMyATL.g:4459:5: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    // InternalMyATL.g:4460:6: lv_ownedExpression_3_0= rulePrimaryExpCS
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
                    							"org.xtext.example.mydsl.MyATL.PrimaryExpCS");
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
    // InternalMyATL.g:4482:1: entryRuleUnaryOperatorCS returns [EObject current=null] : iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF ;
    public final EObject entryRuleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperatorCS = null;


        try {
            // InternalMyATL.g:4482:56: (iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF )
            // InternalMyATL.g:4483:2: iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF
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
    // InternalMyATL.g:4489:1: ruleUnaryOperatorCS returns [EObject current=null] : ( (lv_name_0_0= rulePrefixOperator ) ) ;
    public final EObject ruleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:4495:2: ( ( (lv_name_0_0= rulePrefixOperator ) ) )
            // InternalMyATL.g:4496:2: ( (lv_name_0_0= rulePrefixOperator ) )
            {
            // InternalMyATL.g:4496:2: ( (lv_name_0_0= rulePrefixOperator ) )
            // InternalMyATL.g:4497:3: (lv_name_0_0= rulePrefixOperator )
            {
            // InternalMyATL.g:4497:3: (lv_name_0_0= rulePrefixOperator )
            // InternalMyATL.g:4498:4: lv_name_0_0= rulePrefixOperator
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
            					"org.xtext.example.mydsl.MyATL.PrefixOperator");
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
    // InternalMyATL.g:4518:1: entryRuleIndexExpCS returns [EObject current=null] : iv_ruleIndexExpCS= ruleIndexExpCS EOF ;
    public final EObject entryRuleIndexExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexExpCS = null;


        try {
            // InternalMyATL.g:4518:51: (iv_ruleIndexExpCS= ruleIndexExpCS EOF )
            // InternalMyATL.g:4519:2: iv_ruleIndexExpCS= ruleIndexExpCS EOF
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
    // InternalMyATL.g:4525:1: ruleIndexExpCS returns [EObject current=null] : (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? ) ;
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
            // InternalMyATL.g:4531:2: ( (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? ) )
            // InternalMyATL.g:4532:2: (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? )
            {
            // InternalMyATL.g:4532:2: (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? )
            // InternalMyATL.g:4533:3: this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )?
            {

            			newCompositeNode(grammarAccess.getIndexExpCSAccess().getNameExpCSParserRuleCall_0());
            		
            pushFollow(FOLLOW_54);
            this_NameExpCS_0=ruleNameExpCS();

            state._fsp--;


            			current = this_NameExpCS_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyATL.g:4541:3: ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==86) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalMyATL.g:4542:4: () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )?
                    {
                    // InternalMyATL.g:4542:4: ()
                    // InternalMyATL.g:4543:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getIndexExpCSAccess().getIndexExpCSNamedExpAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,86,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    // InternalMyATL.g:4553:4: ( (lv_firstIndexes_3_0= ruleExpCS ) )
                    // InternalMyATL.g:4554:5: (lv_firstIndexes_3_0= ruleExpCS )
                    {
                    // InternalMyATL.g:4554:5: (lv_firstIndexes_3_0= ruleExpCS )
                    // InternalMyATL.g:4555:6: lv_firstIndexes_3_0= ruleExpCS
                    {

                    						newCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_firstIndexes_3_0=ruleExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
                    						}
                    						add(
                    							current,
                    							"firstIndexes",
                    							lv_firstIndexes_3_0,
                    							"org.xtext.example.mydsl.MyATL.ExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyATL.g:4572:4: (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==22) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalMyATL.g:4573:5: otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_19); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalMyATL.g:4577:5: ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    // InternalMyATL.g:4578:6: (lv_firstIndexes_5_0= ruleExpCS )
                    	    {
                    	    // InternalMyATL.g:4578:6: (lv_firstIndexes_5_0= ruleExpCS )
                    	    // InternalMyATL.g:4579:7: lv_firstIndexes_5_0= ruleExpCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_55);
                    	    lv_firstIndexes_5_0=ruleExpCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"firstIndexes",
                    	    								lv_firstIndexes_5_0,
                    	    								"org.xtext.example.mydsl.MyATL.ExpCS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,87,FOLLOW_54); 

                    				newLeafNode(otherlv_6, grammarAccess.getIndexExpCSAccess().getRightSquareBracketKeyword_1_4());
                    			
                    // InternalMyATL.g:4601:4: (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==86) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalMyATL.g:4602:5: otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']'
                            {
                            otherlv_7=(Token)match(input,86,FOLLOW_19); 

                            					newLeafNode(otherlv_7, grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_5_0());
                            				
                            // InternalMyATL.g:4606:5: ( (lv_secondIndexes_8_0= ruleExpCS ) )
                            // InternalMyATL.g:4607:6: (lv_secondIndexes_8_0= ruleExpCS )
                            {
                            // InternalMyATL.g:4607:6: (lv_secondIndexes_8_0= ruleExpCS )
                            // InternalMyATL.g:4608:7: lv_secondIndexes_8_0= ruleExpCS
                            {

                            							newCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_1_0());
                            						
                            pushFollow(FOLLOW_55);
                            lv_secondIndexes_8_0=ruleExpCS();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
                            							}
                            							add(
                            								current,
                            								"secondIndexes",
                            								lv_secondIndexes_8_0,
                            								"org.xtext.example.mydsl.MyATL.ExpCS");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyATL.g:4625:5: (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )*
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( (LA66_0==22) ) {
                                    alt66=1;
                                }


                                switch (alt66) {
                            	case 1 :
                            	    // InternalMyATL.g:4626:6: otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    {
                            	    otherlv_9=(Token)match(input,22,FOLLOW_19); 

                            	    						newLeafNode(otherlv_9, grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_5_2_0());
                            	    					
                            	    // InternalMyATL.g:4630:6: ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    // InternalMyATL.g:4631:7: (lv_secondIndexes_10_0= ruleExpCS )
                            	    {
                            	    // InternalMyATL.g:4631:7: (lv_secondIndexes_10_0= ruleExpCS )
                            	    // InternalMyATL.g:4632:8: lv_secondIndexes_10_0= ruleExpCS
                            	    {

                            	    								newCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_55);
                            	    lv_secondIndexes_10_0=ruleExpCS();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"secondIndexes",
                            	    									lv_secondIndexes_10_0,
                            	    									"org.xtext.example.mydsl.MyATL.ExpCS");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop66;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,87,FOLLOW_2); 

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
    // InternalMyATL.g:4660:1: entryRuleNavigatingExpCS_Base returns [EObject current=null] : iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF ;
    public final EObject entryRuleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS_Base = null;


        try {
            // InternalMyATL.g:4660:61: (iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF )
            // InternalMyATL.g:4661:2: iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF
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
    // InternalMyATL.g:4667:1: ruleNavigatingExpCS_Base returns [EObject current=null] : this_IndexExpCS_0= ruleIndexExpCS ;
    public final EObject ruleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject this_IndexExpCS_0 = null;



        	enterRule();

        try {
            // InternalMyATL.g:4673:2: (this_IndexExpCS_0= ruleIndexExpCS )
            // InternalMyATL.g:4674:2: this_IndexExpCS_0= ruleIndexExpCS
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
    // InternalMyATL.g:4685:1: entryRuleNavigatingExpCS returns [EObject current=null] : iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF ;
    public final EObject entryRuleNavigatingExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS = null;


        try {
            // InternalMyATL.g:4685:56: (iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF )
            // InternalMyATL.g:4686:2: iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF
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
    // InternalMyATL.g:4692:1: ruleNavigatingExpCS returns [EObject current=null] : (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? ) ;
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
            // InternalMyATL.g:4698:2: ( (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? ) )
            // InternalMyATL.g:4699:2: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? )
            {
            // InternalMyATL.g:4699:2: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? )
            // InternalMyATL.g:4700:3: this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )?
            {

            			newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCS_BaseParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_NavigatingExpCS_Base_0=ruleNavigatingExpCS_Base();

            state._fsp--;


            			current = this_NavigatingExpCS_Base_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyATL.g:4708:3: ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==46) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalMyATL.g:4709:4: () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')'
                    {
                    // InternalMyATL.g:4709:4: ()
                    // InternalMyATL.g:4710:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCSNamedExpAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,46,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingExpCSAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalMyATL.g:4720:4: ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( ((LA74_0>=RULE_SIMPLE_ID && LA74_0<=RULE_BIG_INT)||LA74_0==25||LA74_0==46||(LA74_0>=57 && LA74_0<=59)||LA74_0==72||(LA74_0>=74 && LA74_0<=76)||LA74_0==79||LA74_0==83||LA74_0==85) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalMyATL.g:4721:5: ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )?
                            {
                            // InternalMyATL.g:4721:5: ( (lv_argument_3_0= ruleNavigatingArgCS ) )
                            // InternalMyATL.g:4722:6: (lv_argument_3_0= ruleNavigatingArgCS )
                            {
                            // InternalMyATL.g:4722:6: (lv_argument_3_0= ruleNavigatingArgCS )
                            // InternalMyATL.g:4723:7: lv_argument_3_0= ruleNavigatingArgCS
                            {

                            							newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingArgCSParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_56);
                            lv_argument_3_0=ruleNavigatingArgCS();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                            							}
                            							add(
                            								current,
                            								"argument",
                            								lv_argument_3_0,
                            								"org.xtext.example.mydsl.MyATL.NavigatingArgCS");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyATL.g:4740:5: ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )*
                            loop69:
                            do {
                                int alt69=2;
                                int LA69_0 = input.LA(1);

                                if ( (LA69_0==22) ) {
                                    alt69=1;
                                }


                                switch (alt69) {
                            	case 1 :
                            	    // InternalMyATL.g:4741:6: (lv_argument_4_0= ruleNavigatingCommaArgCS )
                            	    {
                            	    // InternalMyATL.g:4741:6: (lv_argument_4_0= ruleNavigatingCommaArgCS )
                            	    // InternalMyATL.g:4742:7: lv_argument_4_0= ruleNavigatingCommaArgCS
                            	    {

                            	    							newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_56);
                            	    lv_argument_4_0=ruleNavigatingCommaArgCS();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"argument",
                            	    								lv_argument_4_0,
                            	    								"org.xtext.example.mydsl.MyATL.NavigatingCommaArgCS");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop69;
                                }
                            } while (true);

                            // InternalMyATL.g:4759:5: ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )?
                            int alt71=2;
                            int LA71_0 = input.LA(1);

                            if ( (LA71_0==18) ) {
                                alt71=1;
                            }
                            switch (alt71) {
                                case 1 :
                                    // InternalMyATL.g:4760:6: ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )*
                                    {
                                    // InternalMyATL.g:4760:6: ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) )
                                    // InternalMyATL.g:4761:7: (lv_argument_5_0= ruleNavigatingSemiArgCS )
                                    {
                                    // InternalMyATL.g:4761:7: (lv_argument_5_0= ruleNavigatingSemiArgCS )
                                    // InternalMyATL.g:4762:8: lv_argument_5_0= ruleNavigatingSemiArgCS
                                    {

                                    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingSemiArgCSParserRuleCall_1_2_2_0_0());
                                    							
                                    pushFollow(FOLLOW_57);
                                    lv_argument_5_0=ruleNavigatingSemiArgCS();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    								}
                                    								add(
                                    									current,
                                    									"argument",
                                    									lv_argument_5_0,
                                    									"org.xtext.example.mydsl.MyATL.NavigatingSemiArgCS");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    // InternalMyATL.g:4779:6: ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )*
                                    loop70:
                                    do {
                                        int alt70=2;
                                        int LA70_0 = input.LA(1);

                                        if ( (LA70_0==22) ) {
                                            alt70=1;
                                        }


                                        switch (alt70) {
                                    	case 1 :
                                    	    // InternalMyATL.g:4780:7: (lv_argument_6_0= ruleNavigatingCommaArgCS )
                                    	    {
                                    	    // InternalMyATL.g:4780:7: (lv_argument_6_0= ruleNavigatingCommaArgCS )
                                    	    // InternalMyATL.g:4781:8: lv_argument_6_0= ruleNavigatingCommaArgCS
                                    	    {

                                    	    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_2_1_0());
                                    	    							
                                    	    pushFollow(FOLLOW_57);
                                    	    lv_argument_6_0=ruleNavigatingCommaArgCS();

                                    	    state._fsp--;


                                    	    								if (current==null) {
                                    	    									current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    	    								}
                                    	    								add(
                                    	    									current,
                                    	    									"argument",
                                    	    									lv_argument_6_0,
                                    	    									"org.xtext.example.mydsl.MyATL.NavigatingCommaArgCS");
                                    	    								afterParserOrEnumRuleCall();
                                    	    							

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop70;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            // InternalMyATL.g:4799:5: ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )?
                            int alt73=2;
                            int LA73_0 = input.LA(1);

                            if ( (LA73_0==78) ) {
                                alt73=1;
                            }
                            switch (alt73) {
                                case 1 :
                                    // InternalMyATL.g:4800:6: ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )*
                                    {
                                    // InternalMyATL.g:4800:6: ( (lv_argument_7_0= ruleNavigatingBarArgCS ) )
                                    // InternalMyATL.g:4801:7: (lv_argument_7_0= ruleNavigatingBarArgCS )
                                    {
                                    // InternalMyATL.g:4801:7: (lv_argument_7_0= ruleNavigatingBarArgCS )
                                    // InternalMyATL.g:4802:8: lv_argument_7_0= ruleNavigatingBarArgCS
                                    {

                                    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingBarArgCSParserRuleCall_1_2_3_0_0());
                                    							
                                    pushFollow(FOLLOW_27);
                                    lv_argument_7_0=ruleNavigatingBarArgCS();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    								}
                                    								add(
                                    									current,
                                    									"argument",
                                    									lv_argument_7_0,
                                    									"org.xtext.example.mydsl.MyATL.NavigatingBarArgCS");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    // InternalMyATL.g:4819:6: ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )*
                                    loop72:
                                    do {
                                        int alt72=2;
                                        int LA72_0 = input.LA(1);

                                        if ( (LA72_0==22) ) {
                                            alt72=1;
                                        }


                                        switch (alt72) {
                                    	case 1 :
                                    	    // InternalMyATL.g:4820:7: (lv_argument_8_0= ruleNavigatingCommaArgCS )
                                    	    {
                                    	    // InternalMyATL.g:4820:7: (lv_argument_8_0= ruleNavigatingCommaArgCS )
                                    	    // InternalMyATL.g:4821:8: lv_argument_8_0= ruleNavigatingCommaArgCS
                                    	    {

                                    	    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_3_1_0());
                                    	    							
                                    	    pushFollow(FOLLOW_27);
                                    	    lv_argument_8_0=ruleNavigatingCommaArgCS();

                                    	    state._fsp--;


                                    	    								if (current==null) {
                                    	    									current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    	    								}
                                    	    								add(
                                    	    									current,
                                    	    									"argument",
                                    	    									lv_argument_8_0,
                                    	    									"org.xtext.example.mydsl.MyATL.NavigatingCommaArgCS");
                                    	    								afterParserOrEnumRuleCall();
                                    	    							

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop72;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,47,FOLLOW_2); 

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


    protected DFA44 dfa44 = new DFA44(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA60 dfa60 = new DFA60(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\uffff\17\21\2\uffff";
    static final String dfa_3s = "\1\4\17\22\2\uffff";
    static final String dfa_4s = "\1\46\17\116\2\uffff";
    static final String dfa_5s = "\20\uffff\1\1\1\2";
    static final String dfa_6s = "\22\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\24\uffff\1\17\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\2\1\3\1\4\1\5\1\6",
            "\1\21\3\uffff\1\21\22\uffff\4\21\1\uffff\2\21\3\uffff\1\21\12\uffff\1\21\16\uffff\1\20\1\21",
            "\1\21\3\uffff\1\21\22\uffff\4\21\1\uffff\2\21\3\uffff\1\21\12\uffff\1\21\16\uffff\1\20\1\21",
            "\1\21\3\uffff\1\21\22\uffff\4\21\1\uffff\2\21\3\uffff\1\21\12\uffff\1\21\16\uffff\1\20\1\21",
            "\1\21\3\uffff\1\21\22\uffff\4\21\1\uffff\2\21\3\uffff\1\21\12\uffff\1\21\16\uffff\1\20\1\21",
            "\1\21\3\uffff\1\21\22\uffff\4\21\1\uffff\2\21\3\uffff\1\21\12\uffff\1\21\16\uffff\1\20\1\21",
            "\1\21\3\uffff\1\21\22\uffff\4\21\1\uffff\2\21\3\uffff\1\21\12\uffff\1\21\16\uffff\1\20\1\21",
            "\1\21\3\uffff\1\21\22\uffff\4\21\1\uffff\2\21\3\uffff\1\21\12\uffff\1\21\16\uffff\1\20\1\21",
            "\1\21\3\uffff\1\21\22\uffff\4\21\1\uffff\2\21\3\uffff\1\21\12\uffff\1\21\16\uffff\1\20\1\21",
            "\1\21\3\uffff\1\21\22\uffff\4\21\1\uffff\2\21\3\uffff\1\21\12\uffff\1\21\16\uffff\1\20\1\21",
            "\1\21\3\uffff\1\21\22\uffff\4\21\1\uffff\2\21\3\uffff\1\21\12\uffff\1\21\16\uffff\1\20\1\21",
            "\1\21\3\uffff\1\21\22\uffff\4\21\1\uffff\2\21\3\uffff\1\21\12\uffff\1\21\16\uffff\1\20\1\21",
            "\1\21\3\uffff\1\21\22\uffff\4\21\1\uffff\2\21\3\uffff\1\21\12\uffff\1\21\16\uffff\1\20\1\21",
            "\1\21\3\uffff\1\21\22\uffff\4\21\1\uffff\2\21\3\uffff\1\21\12\uffff\1\21\16\uffff\1\20\1\21",
            "\1\21\3\uffff\1\21\22\uffff\4\21\1\uffff\2\21\3\uffff\1\21\12\uffff\1\21\16\uffff\1\20\1\21",
            "\1\21\3\uffff\1\21\22\uffff\4\21\1\uffff\2\21\3\uffff\1\21\12\uffff\1\21\16\uffff\1\20\1\21",
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

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 3138:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*";
        }
    }
    static final String dfa_8s = "\1\46\17\127\2\uffff";
    static final String[] dfa_9s = {
            "\1\1\24\uffff\1\17\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\2\1\3\1\4\1\5\1\6",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\17\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\17\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\17\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\17\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\17\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\17\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\17\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\17\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\17\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\17\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\17\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\17\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\17\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\17\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\17\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "",
            ""
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[][] dfa_9 = unpackEncodedStringArray(dfa_9s);

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_8;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_9;
        }
        public String getDescription() {
            return "()* loopback of 4128:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*";
        }
    }
    static final String dfa_10s = "\1\21\21\uffff";
    static final String dfa_11s = "\1\22\21\uffff";
    static final String dfa_12s = "\1\127\21\uffff";
    static final String dfa_13s = "\1\uffff\20\1\1\2";
    static final String[] dfa_14s = {
            "\1\21\2\uffff\2\21\23\uffff\1\21\4\uffff\1\21\3\uffff\1\11\1\uffff\1\21\1\uffff\1\17\1\uffff\1\4\1\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\12\1\13\1\14\1\15\1\16\1\20\2\21\4\uffff\1\21\1\uffff\3\21\1\uffff\1\21\2\uffff\1\21",
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
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final char[] dfa_12 = DFA.unpackEncodedStringToUnsignedChars(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_1;
            this.eof = dfa_10;
            this.min = dfa_11;
            this.max = dfa_12;
            this.accept = dfa_13;
            this.special = dfa_6;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4246:3: ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?";
        }
    }
    static final String dfa_15s = "\1\1\21\uffff";
    static final String dfa_16s = "\1\uffff\1\2\20\1";
    static final String[] dfa_17s = {
            "\1\1\2\uffff\2\1\23\uffff\1\1\4\uffff\1\1\3\uffff\1\3\1\uffff\1\1\1\uffff\1\2\1\uffff\1\7\1\uffff\1\4\1\5\1\6\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\2\1\4\uffff\1\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1",
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
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = dfa_1;
            this.eof = dfa_15;
            this.min = dfa_11;
            this.max = dfa_12;
            this.accept = dfa_16;
            this.special = dfa_6;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "()+ loopback of 4254:4: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+";
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001208000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0E00400002000070L,0x0000000000289D00L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000007FFE000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0E00C00002000070L,0x0000000000289D00L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0E00400002000072L,0x0000000000289D00L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x8000400000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x4000000000400000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008000000200002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000400000L,0x0000000000100000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xFA88000000000002L,0x00000000000000FFL});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000400000L,0x0000000000800000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000800000440000L,0x0000000000004000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000800000400000L,0x0000000000004000L});

}