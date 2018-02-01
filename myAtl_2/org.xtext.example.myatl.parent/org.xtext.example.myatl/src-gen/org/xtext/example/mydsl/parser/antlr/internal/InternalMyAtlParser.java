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
    // InternalMyAtl.g:71:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' otherlv_10= 'IN' otherlv_11= ':' ( (lv_inModels_12_0= ruleNameExpCS ) ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* otherlv_15= ';' ( (lv_elements_16_0= ruleModuleElement ) )* ) ;
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
            // InternalMyAtl.g:77:2: ( (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' otherlv_10= 'IN' otherlv_11= ':' ( (lv_inModels_12_0= ruleNameExpCS ) ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* otherlv_15= ';' ( (lv_elements_16_0= ruleModuleElement ) )* ) )
            // InternalMyAtl.g:78:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' otherlv_10= 'IN' otherlv_11= ':' ( (lv_inModels_12_0= ruleNameExpCS ) ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* otherlv_15= ';' ( (lv_elements_16_0= ruleModuleElement ) )* )
            {
            // InternalMyAtl.g:78:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' otherlv_10= 'IN' otherlv_11= ':' ( (lv_inModels_12_0= ruleNameExpCS ) ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* otherlv_15= ';' ( (lv_elements_16_0= ruleModuleElement ) )* )
            // InternalMyAtl.g:79:3: otherlv_0= 'module' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= ';' otherlv_3= 'create' otherlv_4= 'OUT' otherlv_5= ':' ( (lv_outModels_6_0= ruleNameExpCS ) ) (otherlv_7= ',' ( (lv_outModels_8_0= ruleNameExpCS ) ) )* otherlv_9= 'from' otherlv_10= 'IN' otherlv_11= ':' ( (lv_inModels_12_0= ruleNameExpCS ) ) (otherlv_13= ',' ( (lv_inModels_14_0= ruleNameExpCS ) ) )* otherlv_15= ';' ( (lv_elements_16_0= ruleModuleElement ) )*
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
            		
            // InternalMyAtl.g:222:3: ( (lv_elements_16_0= ruleModuleElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==39||LA3_0==45||LA3_0==48) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyAtl.g:223:4: (lv_elements_16_0= ruleModuleElement )
            	    {
            	    // InternalMyAtl.g:223:4: (lv_elements_16_0= ruleModuleElement )
            	    // InternalMyAtl.g:224:5: lv_elements_16_0= ruleModuleElement
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
            	    						"org.xtext.example.mydsl.MyAtl.ModuleElement");
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
    // InternalMyAtl.g:245:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // InternalMyAtl.g:245:66: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // InternalMyAtl.g:246:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
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
    // InternalMyAtl.g:252:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:258:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) )
            // InternalMyAtl.g:259:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            {
            // InternalMyAtl.g:259:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
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
                    // InternalMyAtl.g:260:3: this_UnrestrictedName_0= ruleUnrestrictedName
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
                    // InternalMyAtl.g:271:3: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
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
                    // InternalMyAtl.g:282:3: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
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
                    // InternalMyAtl.g:293:3: kw= 'Tuple'
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
    // InternalMyAtl.g:302:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // InternalMyAtl.g:302:54: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // InternalMyAtl.g:303:2: iv_ruleUnreservedName= ruleUnreservedName EOF
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
    // InternalMyAtl.g:309:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:315:2: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // InternalMyAtl.g:316:2: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
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
    // InternalMyAtl.g:329:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // InternalMyAtl.g:329:63: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // InternalMyAtl.g:330:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
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
    // InternalMyAtl.g:336:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtl.g:342:2: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // InternalMyAtl.g:343:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // InternalMyAtl.g:343:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
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
                    // InternalMyAtl.g:344:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:350:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyAtl.g:356:3: kw= 'Real'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyAtl.g:362:3: kw= 'String'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyAtl.g:368:3: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyAtl.g:374:3: kw= 'OclAny'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyAtl.g:380:3: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyAtl.g:386:3: kw= 'OclVoid'
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
    // InternalMyAtl.g:395:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // InternalMyAtl.g:395:64: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // InternalMyAtl.g:396:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
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
    // InternalMyAtl.g:402:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtl.g:408:2: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // InternalMyAtl.g:409:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // InternalMyAtl.g:409:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
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
                    // InternalMyAtl.g:410:3: kw= 'Set'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:416:3: kw= 'Bag'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyAtl.g:422:3: kw= 'Sequence'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyAtl.g:428:3: kw= 'Collection'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyAtl.g:434:3: kw= 'OrderedSet'
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
    // InternalMyAtl.g:443:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // InternalMyAtl.g:443:56: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // InternalMyAtl.g:444:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
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
    // InternalMyAtl.g:450:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:456:2: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // InternalMyAtl.g:457:2: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
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
    // InternalMyAtl.g:470:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // InternalMyAtl.g:470:68: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // InternalMyAtl.g:471:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
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
    // InternalMyAtl.g:477:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SIMPLE_ID_0= RULE_SIMPLE_ID ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;


        	enterRule();

        try {
            // InternalMyAtl.g:483:2: (this_SIMPLE_ID_0= RULE_SIMPLE_ID )
            // InternalMyAtl.g:484:2: this_SIMPLE_ID_0= RULE_SIMPLE_ID
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
    // InternalMyAtl.g:494:1: entryRuleModuleElement returns [EObject current=null] : iv_ruleModuleElement= ruleModuleElement EOF ;
    public final EObject entryRuleModuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleElement = null;


        try {
            // InternalMyAtl.g:494:54: (iv_ruleModuleElement= ruleModuleElement EOF )
            // InternalMyAtl.g:495:2: iv_ruleModuleElement= ruleModuleElement EOF
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
    // InternalMyAtl.g:501:1: ruleModuleElement returns [EObject current=null] : (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule ) ;
    public final EObject ruleModuleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Helper_0 = null;

        EObject this_MatchedRule_1 = null;

        EObject this_CalledRule_2 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:507:2: ( (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule ) )
            // InternalMyAtl.g:508:2: (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule )
            {
            // InternalMyAtl.g:508:2: (this_Helper_0= ruleHelper | this_MatchedRule_1= ruleMatchedRule | this_CalledRule_2= ruleCalledRule )
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
                    // InternalMyAtl.g:509:3: this_Helper_0= ruleHelper
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
                    // InternalMyAtl.g:518:3: this_MatchedRule_1= ruleMatchedRule
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
                    // InternalMyAtl.g:527:3: this_CalledRule_2= ruleCalledRule
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
    // InternalMyAtl.g:539:1: entryRuleMatchedRule returns [EObject current=null] : iv_ruleMatchedRule= ruleMatchedRule EOF ;
    public final EObject entryRuleMatchedRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchedRule = null;


        try {
            // InternalMyAtl.g:539:52: (iv_ruleMatchedRule= ruleMatchedRule EOF )
            // InternalMyAtl.g:540:2: iv_ruleMatchedRule= ruleMatchedRule EOF
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
    // InternalMyAtl.g:546:1: ruleMatchedRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // InternalMyAtl.g:552:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalMyAtl.g:553:2: (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalMyAtl.g:553:2: (otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )? otherlv_15= '}' )
            // InternalMyAtl.g:554:3: otherlv_0= 'rule' ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPattern_4_0= ruleInPattern ) ) (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )? otherlv_9= 'to' ( (lv_outPattern_10_0= ruleOutPattern ) ) (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchedRuleAccess().getRuleKeyword_0());
            		
            // InternalMyAtl.g:558:3: ( (lv_name_1_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:559:4: (lv_name_1_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:559:4: (lv_name_1_0= ruleUnrestrictedName )
            // InternalMyAtl.g:560:5: lv_name_1_0= ruleUnrestrictedName
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
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMatchedRuleAccess().getFromKeyword_3());
            		
            // InternalMyAtl.g:585:3: ( (lv_inPattern_4_0= ruleInPattern ) )
            // InternalMyAtl.g:586:4: (lv_inPattern_4_0= ruleInPattern )
            {
            // InternalMyAtl.g:586:4: (lv_inPattern_4_0= ruleInPattern )
            // InternalMyAtl.g:587:5: lv_inPattern_4_0= ruleInPattern
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
            						"org.xtext.example.mydsl.MyAtl.InPattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:604:3: (otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyAtl.g:605:4: otherlv_5= 'using' otherlv_6= '{' ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )* otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getMatchedRuleAccess().getUsingKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,40,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyAtl.g:613:4: ( (lv_variables_7_0= ruleRuleVariableDeclaration ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_SIMPLE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyAtl.g:614:5: (lv_variables_7_0= ruleRuleVariableDeclaration )
                    	    {
                    	    // InternalMyAtl.g:614:5: (lv_variables_7_0= ruleRuleVariableDeclaration )
                    	    // InternalMyAtl.g:615:6: lv_variables_7_0= ruleRuleVariableDeclaration
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
                    	    							"org.xtext.example.mydsl.MyAtl.RuleVariableDeclaration");
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
            		
            // InternalMyAtl.g:641:3: ( (lv_outPattern_10_0= ruleOutPattern ) )
            // InternalMyAtl.g:642:4: (lv_outPattern_10_0= ruleOutPattern )
            {
            // InternalMyAtl.g:642:4: (lv_outPattern_10_0= ruleOutPattern )
            // InternalMyAtl.g:643:5: lv_outPattern_10_0= ruleOutPattern
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
            						"org.xtext.example.mydsl.MyAtl.OutPattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:660:3: (otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==44) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyAtl.g:661:4: otherlv_11= 'do' otherlv_12= '{' ( (lv_actionBlock_13_0= ruleActionBlock ) ) otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,44,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getMatchedRuleAccess().getDoKeyword_8_0());
                    			
                    otherlv_12=(Token)match(input,40,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMyAtl.g:669:4: ( (lv_actionBlock_13_0= ruleActionBlock ) )
                    // InternalMyAtl.g:670:5: (lv_actionBlock_13_0= ruleActionBlock )
                    {
                    // InternalMyAtl.g:670:5: (lv_actionBlock_13_0= ruleActionBlock )
                    // InternalMyAtl.g:671:6: lv_actionBlock_13_0= ruleActionBlock
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
                    							"org.xtext.example.mydsl.MyAtl.ActionBlock");
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
    // InternalMyAtl.g:701:1: entryRuleCalledRule returns [EObject current=null] : iv_ruleCalledRule= ruleCalledRule EOF ;
    public final EObject entryRuleCalledRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalledRule = null;


        try {
            // InternalMyAtl.g:701:51: (iv_ruleCalledRule= ruleCalledRule EOF )
            // InternalMyAtl.g:702:2: iv_ruleCalledRule= ruleCalledRule EOF
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
    // InternalMyAtl.g:708:1: ruleCalledRule returns [EObject current=null] : ( (otherlv_0= 'entrypoint' )? otherlv_1= 'rule' ( (lv_name_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' otherlv_4= ')' )? otherlv_5= '{' (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )? otherlv_10= 'to' ( (lv_outPattern_11_0= ruleOutPattern ) ) (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalMyAtl.g:714:2: ( ( (otherlv_0= 'entrypoint' )? otherlv_1= 'rule' ( (lv_name_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' otherlv_4= ')' )? otherlv_5= '{' (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )? otherlv_10= 'to' ( (lv_outPattern_11_0= ruleOutPattern ) ) (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalMyAtl.g:715:2: ( (otherlv_0= 'entrypoint' )? otherlv_1= 'rule' ( (lv_name_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' otherlv_4= ')' )? otherlv_5= '{' (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )? otherlv_10= 'to' ( (lv_outPattern_11_0= ruleOutPattern ) ) (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalMyAtl.g:715:2: ( (otherlv_0= 'entrypoint' )? otherlv_1= 'rule' ( (lv_name_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' otherlv_4= ')' )? otherlv_5= '{' (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )? otherlv_10= 'to' ( (lv_outPattern_11_0= ruleOutPattern ) ) (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )? otherlv_16= '}' )
            // InternalMyAtl.g:716:3: (otherlv_0= 'entrypoint' )? otherlv_1= 'rule' ( (lv_name_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' otherlv_4= ')' )? otherlv_5= '{' (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )? otherlv_10= 'to' ( (lv_outPattern_11_0= ruleOutPattern ) ) (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalMyAtl.g:716:3: (otherlv_0= 'entrypoint' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==45) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyAtl.g:717:4: otherlv_0= 'entrypoint'
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getCalledRuleAccess().getEntrypointKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCalledRuleAccess().getRuleKeyword_1());
            		
            // InternalMyAtl.g:726:3: ( (lv_name_2_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:727:4: (lv_name_2_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:727:4: (lv_name_2_0= ruleUnrestrictedName )
            // InternalMyAtl.g:728:5: lv_name_2_0= ruleUnrestrictedName
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
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:745:3: (otherlv_3= '(' otherlv_4= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==46) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyAtl.g:746:4: otherlv_3= '(' otherlv_4= ')'
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
            		
            // InternalMyAtl.g:759:3: (otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyAtl.g:760:4: otherlv_6= 'using' otherlv_7= '{' ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getCalledRuleAccess().getUsingKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,40,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyAtl.g:768:4: ( (lv_variables_8_0= ruleRuleVariableDeclaration ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_SIMPLE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyAtl.g:769:5: (lv_variables_8_0= ruleRuleVariableDeclaration )
                    	    {
                    	    // InternalMyAtl.g:769:5: (lv_variables_8_0= ruleRuleVariableDeclaration )
                    	    // InternalMyAtl.g:770:6: lv_variables_8_0= ruleRuleVariableDeclaration
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
                    	    							"org.xtext.example.mydsl.MyAtl.RuleVariableDeclaration");
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
            		
            // InternalMyAtl.g:796:3: ( (lv_outPattern_11_0= ruleOutPattern ) )
            // InternalMyAtl.g:797:4: (lv_outPattern_11_0= ruleOutPattern )
            {
            // InternalMyAtl.g:797:4: (lv_outPattern_11_0= ruleOutPattern )
            // InternalMyAtl.g:798:5: lv_outPattern_11_0= ruleOutPattern
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
            						"org.xtext.example.mydsl.MyAtl.OutPattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:815:3: (otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==44) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyAtl.g:816:4: otherlv_12= 'do' otherlv_13= '{' ( (lv_actionBlock_14_0= ruleActionBlock ) ) otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,44,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getCalledRuleAccess().getDoKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,40,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMyAtl.g:824:4: ( (lv_actionBlock_14_0= ruleActionBlock ) )
                    // InternalMyAtl.g:825:5: (lv_actionBlock_14_0= ruleActionBlock )
                    {
                    // InternalMyAtl.g:825:5: (lv_actionBlock_14_0= ruleActionBlock )
                    // InternalMyAtl.g:826:6: lv_actionBlock_14_0= ruleActionBlock
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
                    							"org.xtext.example.mydsl.MyAtl.ActionBlock");
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
    // InternalMyAtl.g:856:1: entryRuleHelper returns [EObject current=null] : iv_ruleHelper= ruleHelper EOF ;
    public final EObject entryRuleHelper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelper = null;


        try {
            // InternalMyAtl.g:856:47: (iv_ruleHelper= ruleHelper EOF )
            // InternalMyAtl.g:857:2: iv_ruleHelper= ruleHelper EOF
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
    // InternalMyAtl.g:863:1: ruleHelper returns [EObject current=null] : (otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_name_2_0= ruleUnrestrictedName ) )? ( (lv_definition_3_0= ruleATLDefCS ) ) ) ;
    public final EObject ruleHelper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_definition_3_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:869:2: ( (otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_name_2_0= ruleUnrestrictedName ) )? ( (lv_definition_3_0= ruleATLDefCS ) ) ) )
            // InternalMyAtl.g:870:2: (otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_name_2_0= ruleUnrestrictedName ) )? ( (lv_definition_3_0= ruleATLDefCS ) ) )
            {
            // InternalMyAtl.g:870:2: (otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_name_2_0= ruleUnrestrictedName ) )? ( (lv_definition_3_0= ruleATLDefCS ) ) )
            // InternalMyAtl.g:871:3: otherlv_0= 'helper' (otherlv_1= 'context' )? ( (lv_name_2_0= ruleUnrestrictedName ) )? ( (lv_definition_3_0= ruleATLDefCS ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getHelperAccess().getHelperKeyword_0());
            		
            // InternalMyAtl.g:875:3: (otherlv_1= 'context' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==49) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyAtl.g:876:4: otherlv_1= 'context'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getHelperAccess().getContextKeyword_1());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:881:3: ( (lv_name_2_0= ruleUnrestrictedName ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_SIMPLE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyAtl.g:882:4: (lv_name_2_0= ruleUnrestrictedName )
                    {
                    // InternalMyAtl.g:882:4: (lv_name_2_0= ruleUnrestrictedName )
                    // InternalMyAtl.g:883:5: lv_name_2_0= ruleUnrestrictedName
                    {

                    					newCompositeNode(grammarAccess.getHelperAccess().getNameUnrestrictedNameParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_24);
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

            // InternalMyAtl.g:900:3: ( (lv_definition_3_0= ruleATLDefCS ) )
            // InternalMyAtl.g:901:4: (lv_definition_3_0= ruleATLDefCS )
            {
            // InternalMyAtl.g:901:4: (lv_definition_3_0= ruleATLDefCS )
            // InternalMyAtl.g:902:5: lv_definition_3_0= ruleATLDefCS
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
    // InternalMyAtl.g:923:1: entryRuleATLDefCS returns [EObject current=null] : iv_ruleATLDefCS= ruleATLDefCS EOF ;
    public final EObject entryRuleATLDefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATLDefCS = null;


        try {
            // InternalMyAtl.g:923:49: (iv_ruleATLDefCS= ruleATLDefCS EOF )
            // InternalMyAtl.g:924:2: iv_ruleATLDefCS= ruleATLDefCS EOF
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
    // InternalMyAtl.g:930:1: ruleATLDefCS returns [EObject current=null] : (otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';' ) ;
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
            // InternalMyAtl.g:936:2: ( (otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';' ) )
            // InternalMyAtl.g:937:2: (otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';' )
            {
            // InternalMyAtl.g:937:2: (otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';' )
            // InternalMyAtl.g:938:3: otherlv_0= 'def' otherlv_1= ':' ( (lv_varName_2_0= ruleUnrestrictedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )? otherlv_8= ':' ( (lv_type_9_0= ruleATLType ) ) otherlv_10= '=' ( (lv_initExpression_11_0= ruleExpCS ) ) otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getATLDefCSAccess().getDefKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getATLDefCSAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:946:3: ( (lv_varName_2_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:947:4: (lv_varName_2_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:947:4: (lv_varName_2_0= ruleUnrestrictedName )
            // InternalMyAtl.g:948:5: lv_varName_2_0= ruleUnrestrictedName
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
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:965:3: (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyAtl.g:966:4: otherlv_3= '(' ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getATLDefCSAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMyAtl.g:970:4: ( ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_SIMPLE_ID) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalMyAtl.g:971:5: ( (lv_parameters_4_0= ruleATLParameterCS ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )*
                            {
                            // InternalMyAtl.g:971:5: ( (lv_parameters_4_0= ruleATLParameterCS ) )
                            // InternalMyAtl.g:972:6: (lv_parameters_4_0= ruleATLParameterCS )
                            {
                            // InternalMyAtl.g:972:6: (lv_parameters_4_0= ruleATLParameterCS )
                            // InternalMyAtl.g:973:7: lv_parameters_4_0= ruleATLParameterCS
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
                            								"org.xtext.example.mydsl.MyAtl.ATLParameterCS");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyAtl.g:990:5: (otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==22) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // InternalMyAtl.g:991:6: otherlv_5= ',' ( (lv_parameters_6_0= ruleATLParameterCS ) )
                            	    {
                            	    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                            	    						newLeafNode(otherlv_5, grammarAccess.getATLDefCSAccess().getCommaKeyword_3_1_1_0());
                            	    					
                            	    // InternalMyAtl.g:995:6: ( (lv_parameters_6_0= ruleATLParameterCS ) )
                            	    // InternalMyAtl.g:996:7: (lv_parameters_6_0= ruleATLParameterCS )
                            	    {
                            	    // InternalMyAtl.g:996:7: (lv_parameters_6_0= ruleATLParameterCS )
                            	    // InternalMyAtl.g:997:8: lv_parameters_6_0= ruleATLParameterCS
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
                            	    									"org.xtext.example.mydsl.MyAtl.ATLParameterCS");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
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
            		
            // InternalMyAtl.g:1025:3: ( (lv_type_9_0= ruleATLType ) )
            // InternalMyAtl.g:1026:4: (lv_type_9_0= ruleATLType )
            {
            // InternalMyAtl.g:1026:4: (lv_type_9_0= ruleATLType )
            // InternalMyAtl.g:1027:5: lv_type_9_0= ruleATLType
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
            						"org.xtext.example.mydsl.MyAtl.ATLType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,51,FOLLOW_19); 

            			newLeafNode(otherlv_10, grammarAccess.getATLDefCSAccess().getEqualsSignKeyword_6());
            		
            // InternalMyAtl.g:1048:3: ( (lv_initExpression_11_0= ruleExpCS ) )
            // InternalMyAtl.g:1049:4: (lv_initExpression_11_0= ruleExpCS )
            {
            // InternalMyAtl.g:1049:4: (lv_initExpression_11_0= ruleExpCS )
            // InternalMyAtl.g:1050:5: lv_initExpression_11_0= ruleExpCS
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
    // InternalMyAtl.g:1075:1: entryRuleATLParameterCS returns [EObject current=null] : iv_ruleATLParameterCS= ruleATLParameterCS EOF ;
    public final EObject entryRuleATLParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATLParameterCS = null;


        try {
            // InternalMyAtl.g:1075:55: (iv_ruleATLParameterCS= ruleATLParameterCS EOF )
            // InternalMyAtl.g:1076:2: iv_ruleATLParameterCS= ruleATLParameterCS EOF
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
    // InternalMyAtl.g:1082:1: ruleATLParameterCS returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) ) ;
    public final EObject ruleATLParameterCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_varName_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1088:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) ) )
            // InternalMyAtl.g:1089:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) )
            {
            // InternalMyAtl.g:1089:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) )
            // InternalMyAtl.g:1090:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) )
            {
            // InternalMyAtl.g:1090:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1091:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1091:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1092:5: lv_varName_0_0= ruleUnrestrictedName
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

            otherlv_1=(Token)match(input,21,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getATLParameterCSAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:1113:3: ( (lv_type_2_0= ruleATLType ) )
            // InternalMyAtl.g:1114:4: (lv_type_2_0= ruleATLType )
            {
            // InternalMyAtl.g:1114:4: (lv_type_2_0= ruleATLType )
            // InternalMyAtl.g:1115:5: lv_type_2_0= ruleATLType
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
    // InternalMyAtl.g:1136:1: entryRuleRuleVariableDeclaration returns [EObject current=null] : iv_ruleRuleVariableDeclaration= ruleRuleVariableDeclaration EOF ;
    public final EObject entryRuleRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleVariableDeclaration = null;


        try {
            // InternalMyAtl.g:1136:64: (iv_ruleRuleVariableDeclaration= ruleRuleVariableDeclaration EOF )
            // InternalMyAtl.g:1137:2: iv_ruleRuleVariableDeclaration= ruleRuleVariableDeclaration EOF
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
    // InternalMyAtl.g:1143:1: ruleRuleVariableDeclaration returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';' ) ;
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
            // InternalMyAtl.g:1149:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';' ) )
            // InternalMyAtl.g:1150:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';' )
            {
            // InternalMyAtl.g:1150:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';' )
            // InternalMyAtl.g:1151:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) otherlv_5= ';'
            {
            // InternalMyAtl.g:1151:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1152:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1152:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1153:5: lv_varName_0_0= ruleUnrestrictedName
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

            otherlv_1=(Token)match(input,21,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleVariableDeclarationAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:1174:3: ( (lv_type_2_0= ruleATLType ) )
            // InternalMyAtl.g:1175:4: (lv_type_2_0= ruleATLType )
            {
            // InternalMyAtl.g:1175:4: (lv_type_2_0= ruleATLType )
            // InternalMyAtl.g:1176:5: lv_type_2_0= ruleATLType
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
            						"org.xtext.example.mydsl.MyAtl.ATLType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleVariableDeclarationAccess().getEqualsSignKeyword_3());
            		
            // InternalMyAtl.g:1197:3: ( (lv_initExpression_4_0= ruleExpCS ) )
            // InternalMyAtl.g:1198:4: (lv_initExpression_4_0= ruleExpCS )
            {
            // InternalMyAtl.g:1198:4: (lv_initExpression_4_0= ruleExpCS )
            // InternalMyAtl.g:1199:5: lv_initExpression_4_0= ruleExpCS
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
    // InternalMyAtl.g:1224:1: entryRuleInPattern returns [EObject current=null] : iv_ruleInPattern= ruleInPattern EOF ;
    public final EObject entryRuleInPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPattern = null;


        try {
            // InternalMyAtl.g:1224:50: (iv_ruleInPattern= ruleInPattern EOF )
            // InternalMyAtl.g:1225:2: iv_ruleInPattern= ruleInPattern EOF
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
    // InternalMyAtl.g:1231:1: ruleInPattern returns [EObject current=null] : ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )? ) ;
    public final EObject ruleInPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_0_0 = null;

        EObject lv_filter_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1237:2: ( ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )? ) )
            // InternalMyAtl.g:1238:2: ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )? )
            {
            // InternalMyAtl.g:1238:2: ( ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )? )
            // InternalMyAtl.g:1239:3: ( (lv_elements_0_0= ruleInPatternElement ) ) (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )?
            {
            // InternalMyAtl.g:1239:3: ( (lv_elements_0_0= ruleInPatternElement ) )
            // InternalMyAtl.g:1240:4: (lv_elements_0_0= ruleInPatternElement )
            {
            // InternalMyAtl.g:1240:4: (lv_elements_0_0= ruleInPatternElement )
            // InternalMyAtl.g:1241:5: lv_elements_0_0= ruleInPatternElement
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
            						"org.xtext.example.mydsl.MyAtl.InPatternElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:1258:3: (otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyAtl.g:1259:4: otherlv_1= '(' ( (lv_filter_2_0= ruleExpCS ) )? otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getInPatternAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMyAtl.g:1263:4: ( (lv_filter_2_0= ruleExpCS ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=RULE_SIMPLE_ID && LA21_0<=RULE_BIG_INT)||LA21_0==25||LA21_0==46||(LA21_0>=57 && LA21_0<=59)||LA21_0==72||(LA21_0>=74 && LA21_0<=76)||LA21_0==79||LA21_0==83||LA21_0==85) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMyAtl.g:1264:5: (lv_filter_2_0= ruleExpCS )
                            {
                            // InternalMyAtl.g:1264:5: (lv_filter_2_0= ruleExpCS )
                            // InternalMyAtl.g:1265:6: lv_filter_2_0= ruleExpCS
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
                            							"org.xtext.example.mydsl.MyAtl.ExpCS");
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
    // InternalMyAtl.g:1291:1: entryRuleInPatternElement returns [EObject current=null] : iv_ruleInPatternElement= ruleInPatternElement EOF ;
    public final EObject entryRuleInPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPatternElement = null;


        try {
            // InternalMyAtl.g:1291:57: (iv_ruleInPatternElement= ruleInPatternElement EOF )
            // InternalMyAtl.g:1292:2: iv_ruleInPatternElement= ruleInPatternElement EOF
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
    // InternalMyAtl.g:1298:1: ruleInPatternElement returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) ) ;
    public final EObject ruleInPatternElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_varName_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1304:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) ) )
            // InternalMyAtl.g:1305:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) )
            {
            // InternalMyAtl.g:1305:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) )
            // InternalMyAtl.g:1306:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) )
            {
            // InternalMyAtl.g:1306:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1307:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1307:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1308:5: lv_varName_0_0= ruleUnrestrictedName
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

            otherlv_1=(Token)match(input,21,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getInPatternElementAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:1329:3: ( (lv_type_2_0= ruleATLType ) )
            // InternalMyAtl.g:1330:4: (lv_type_2_0= ruleATLType )
            {
            // InternalMyAtl.g:1330:4: (lv_type_2_0= ruleATLType )
            // InternalMyAtl.g:1331:5: lv_type_2_0= ruleATLType
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
    // InternalMyAtl.g:1352:1: entryRuleOutPattern returns [EObject current=null] : iv_ruleOutPattern= ruleOutPattern EOF ;
    public final EObject entryRuleOutPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPattern = null;


        try {
            // InternalMyAtl.g:1352:51: (iv_ruleOutPattern= ruleOutPattern EOF )
            // InternalMyAtl.g:1353:2: iv_ruleOutPattern= ruleOutPattern EOF
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
    // InternalMyAtl.g:1359:1: ruleOutPattern returns [EObject current=null] : ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* ) ;
    public final EObject ruleOutPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1365:2: ( ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* ) )
            // InternalMyAtl.g:1366:2: ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* )
            {
            // InternalMyAtl.g:1366:2: ( ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )* )
            // InternalMyAtl.g:1367:3: ( (lv_elements_0_0= ruleOutPatternElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )*
            {
            // InternalMyAtl.g:1367:3: ( (lv_elements_0_0= ruleOutPatternElement ) )
            // InternalMyAtl.g:1368:4: (lv_elements_0_0= ruleOutPatternElement )
            {
            // InternalMyAtl.g:1368:4: (lv_elements_0_0= ruleOutPatternElement )
            // InternalMyAtl.g:1369:5: lv_elements_0_0= ruleOutPatternElement
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
            						"org.xtext.example.mydsl.MyAtl.OutPatternElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:1386:3: (otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==22) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyAtl.g:1387:4: otherlv_1= ',' ( (lv_elements_2_0= ruleOutPatternElement ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_17); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOutPatternAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyAtl.g:1391:4: ( (lv_elements_2_0= ruleOutPatternElement ) )
            	    // InternalMyAtl.g:1392:5: (lv_elements_2_0= ruleOutPatternElement )
            	    {
            	    // InternalMyAtl.g:1392:5: (lv_elements_2_0= ruleOutPatternElement )
            	    // InternalMyAtl.g:1393:6: lv_elements_2_0= ruleOutPatternElement
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
            	    							"org.xtext.example.mydsl.MyAtl.OutPatternElement");
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


            }


            	leaveRule();

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
    // InternalMyAtl.g:1415:1: entryRuleOutPatternElement returns [EObject current=null] : iv_ruleOutPatternElement= ruleOutPatternElement EOF ;
    public final EObject entryRuleOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPatternElement = null;


        try {
            // InternalMyAtl.g:1415:58: (iv_ruleOutPatternElement= ruleOutPatternElement EOF )
            // InternalMyAtl.g:1416:2: iv_ruleOutPatternElement= ruleOutPatternElement EOF
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
    // InternalMyAtl.g:1422:1: ruleOutPatternElement returns [EObject current=null] : (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement ) ;
    public final EObject ruleOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleOutPatternElement_0 = null;

        EObject this_ForEachOutPatternElement_1 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1428:2: ( (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement ) )
            // InternalMyAtl.g:1429:2: (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement )
            {
            // InternalMyAtl.g:1429:2: (this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement | this_ForEachOutPatternElement_1= ruleForEachOutPatternElement )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_SIMPLE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==52) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyAtl.g:1430:3: this_SimpleOutPatternElement_0= ruleSimpleOutPatternElement
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
                    // InternalMyAtl.g:1439:3: this_ForEachOutPatternElement_1= ruleForEachOutPatternElement
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
    // InternalMyAtl.g:1451:1: entryRuleSimpleOutPatternElement returns [EObject current=null] : iv_ruleSimpleOutPatternElement= ruleSimpleOutPatternElement EOF ;
    public final EObject entryRuleSimpleOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOutPatternElement = null;


        try {
            // InternalMyAtl.g:1451:64: (iv_ruleSimpleOutPatternElement= ruleSimpleOutPatternElement EOF )
            // InternalMyAtl.g:1452:2: iv_ruleSimpleOutPatternElement= ruleSimpleOutPatternElement EOF
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
    // InternalMyAtl.g:1458:1: ruleSimpleOutPatternElement returns [EObject current=null] : ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )? ) ;
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
            // InternalMyAtl.g:1464:2: ( ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )? ) )
            // InternalMyAtl.g:1465:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )? )
            {
            // InternalMyAtl.g:1465:2: ( ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )? )
            // InternalMyAtl.g:1466:3: ( (lv_varName_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleATLType ) ) (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )?
            {
            // InternalMyAtl.g:1466:3: ( (lv_varName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1467:4: (lv_varName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1467:4: (lv_varName_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1468:5: lv_varName_0_0= ruleUnrestrictedName
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

            otherlv_1=(Token)match(input,21,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleOutPatternElementAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:1489:3: ( (lv_type_2_0= ruleATLType ) )
            // InternalMyAtl.g:1490:4: (lv_type_2_0= ruleATLType )
            {
            // InternalMyAtl.g:1490:4: (lv_type_2_0= ruleATLType )
            // InternalMyAtl.g:1491:5: lv_type_2_0= ruleATLType
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
            						"org.xtext.example.mydsl.MyAtl.ATLType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:1508:3: (otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyAtl.g:1509:4: otherlv_3= '(' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getSimpleOutPatternElementAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMyAtl.g:1513:4: ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_SIMPLE_ID) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalMyAtl.g:1514:5: ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )*
                            {
                            // InternalMyAtl.g:1514:5: ( (lv_bindings_4_0= ruleBinding ) )
                            // InternalMyAtl.g:1515:6: (lv_bindings_4_0= ruleBinding )
                            {
                            // InternalMyAtl.g:1515:6: (lv_bindings_4_0= ruleBinding )
                            // InternalMyAtl.g:1516:7: lv_bindings_4_0= ruleBinding
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
                            								"org.xtext.example.mydsl.MyAtl.Binding");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyAtl.g:1533:5: (otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==22) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalMyAtl.g:1534:6: otherlv_5= ',' ( (lv_bindings_6_0= ruleBinding ) )
                            	    {
                            	    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                            	    						newLeafNode(otherlv_5, grammarAccess.getSimpleOutPatternElementAccess().getCommaKeyword_3_1_1_0());
                            	    					
                            	    // InternalMyAtl.g:1538:6: ( (lv_bindings_6_0= ruleBinding ) )
                            	    // InternalMyAtl.g:1539:7: (lv_bindings_6_0= ruleBinding )
                            	    {
                            	    // InternalMyAtl.g:1539:7: (lv_bindings_6_0= ruleBinding )
                            	    // InternalMyAtl.g:1540:8: lv_bindings_6_0= ruleBinding
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
                            	    									"org.xtext.example.mydsl.MyAtl.Binding");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop25;
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
    // InternalMyAtl.g:1568:1: entryRuleForEachOutPatternElement returns [EObject current=null] : iv_ruleForEachOutPatternElement= ruleForEachOutPatternElement EOF ;
    public final EObject entryRuleForEachOutPatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachOutPatternElement = null;


        try {
            // InternalMyAtl.g:1568:65: (iv_ruleForEachOutPatternElement= ruleForEachOutPatternElement EOF )
            // InternalMyAtl.g:1569:2: iv_ruleForEachOutPatternElement= ruleForEachOutPatternElement EOF
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
    // InternalMyAtl.g:1575:1: ruleForEachOutPatternElement returns [EObject current=null] : (otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy' ) ;
    public final EObject ruleForEachOutPatternElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_collection_1_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1581:2: ( (otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy' ) )
            // InternalMyAtl.g:1582:2: (otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy' )
            {
            // InternalMyAtl.g:1582:2: (otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy' )
            // InternalMyAtl.g:1583:3: otherlv_0= 'xxx' ( (lv_collection_1_0= ruleExpCS ) ) otherlv_2= 'yyy'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachOutPatternElementAccess().getXxxKeyword_0());
            		
            // InternalMyAtl.g:1587:3: ( (lv_collection_1_0= ruleExpCS ) )
            // InternalMyAtl.g:1588:4: (lv_collection_1_0= ruleExpCS )
            {
            // InternalMyAtl.g:1588:4: (lv_collection_1_0= ruleExpCS )
            // InternalMyAtl.g:1589:5: lv_collection_1_0= ruleExpCS
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
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
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
    // InternalMyAtl.g:1614:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalMyAtl.g:1614:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalMyAtl.g:1615:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalMyAtl.g:1621:1: ruleBinding returns [EObject current=null] : ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_propertyName_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1627:2: ( ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) ) ) )
            // InternalMyAtl.g:1628:2: ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) ) )
            {
            // InternalMyAtl.g:1628:2: ( ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) ) )
            // InternalMyAtl.g:1629:3: ( (lv_propertyName_0_0= ruleUnrestrictedName ) ) otherlv_1= '<-' ( (lv_value_2_0= ruleExpCS ) )
            {
            // InternalMyAtl.g:1629:3: ( (lv_propertyName_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1630:4: (lv_propertyName_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1630:4: (lv_propertyName_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1631:5: lv_propertyName_0_0= ruleUnrestrictedName
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
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_1());
            		
            // InternalMyAtl.g:1652:3: ( (lv_value_2_0= ruleExpCS ) )
            // InternalMyAtl.g:1653:4: (lv_value_2_0= ruleExpCS )
            {
            // InternalMyAtl.g:1653:4: (lv_value_2_0= ruleExpCS )
            // InternalMyAtl.g:1654:5: lv_value_2_0= ruleExpCS
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
    // InternalMyAtl.g:1675:1: entryRuleActionBlock returns [EObject current=null] : iv_ruleActionBlock= ruleActionBlock EOF ;
    public final EObject entryRuleActionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionBlock = null;


        try {
            // InternalMyAtl.g:1675:52: (iv_ruleActionBlock= ruleActionBlock EOF )
            // InternalMyAtl.g:1676:2: iv_ruleActionBlock= ruleActionBlock EOF
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
    // InternalMyAtl.g:1682:1: ruleActionBlock returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )+ ;
    public final EObject ruleActionBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1688:2: ( ( (lv_statements_0_0= ruleStatement ) )+ )
            // InternalMyAtl.g:1689:2: ( (lv_statements_0_0= ruleStatement ) )+
            {
            // InternalMyAtl.g:1689:2: ( (lv_statements_0_0= ruleStatement ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_SIMPLE_ID && LA28_0<=RULE_BIG_INT)||LA28_0==25||LA28_0==46||(LA28_0>=57 && LA28_0<=59)||LA28_0==72||(LA28_0>=74 && LA28_0<=76)||LA28_0==79||LA28_0==83||LA28_0==85) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyAtl.g:1690:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalMyAtl.g:1690:3: (lv_statements_0_0= ruleStatement )
            	    // InternalMyAtl.g:1691:4: lv_statements_0_0= ruleStatement
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
            	    					"org.xtext.example.mydsl.MyAtl.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    // InternalMyAtl.g:1711:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyAtl.g:1711:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyAtl.g:1712:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMyAtl.g:1718:1: ruleStatement returns [EObject current=null] : this_BindingStat_0= ruleBindingStat ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_BindingStat_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1724:2: (this_BindingStat_0= ruleBindingStat )
            // InternalMyAtl.g:1725:2: this_BindingStat_0= ruleBindingStat
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
    // InternalMyAtl.g:1736:1: entryRuleBindingStat returns [EObject current=null] : iv_ruleBindingStat= ruleBindingStat EOF ;
    public final EObject entryRuleBindingStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingStat = null;


        try {
            // InternalMyAtl.g:1736:52: (iv_ruleBindingStat= ruleBindingStat EOF )
            // InternalMyAtl.g:1737:2: iv_ruleBindingStat= ruleBindingStat EOF
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
    // InternalMyAtl.g:1743:1: ruleBindingStat returns [EObject current=null] : ( ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';' ) ;
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
            // InternalMyAtl.g:1749:2: ( ( ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';' ) )
            // InternalMyAtl.g:1750:2: ( ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';' )
            {
            // InternalMyAtl.g:1750:2: ( ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';' )
            // InternalMyAtl.g:1751:3: ( (lv_source_0_0= ruleExpCS ) ) otherlv_1= '.' ( (lv_propertyName_2_0= ruleUnrestrictedName ) ) otherlv_3= '<-' ( (lv_value_4_0= ruleExpCS ) ) otherlv_5= ';'
            {
            // InternalMyAtl.g:1751:3: ( (lv_source_0_0= ruleExpCS ) )
            // InternalMyAtl.g:1752:4: (lv_source_0_0= ruleExpCS )
            {
            // InternalMyAtl.g:1752:4: (lv_source_0_0= ruleExpCS )
            // InternalMyAtl.g:1753:5: lv_source_0_0= ruleExpCS
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
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingStatAccess().getFullStopKeyword_1());
            		
            // InternalMyAtl.g:1774:3: ( (lv_propertyName_2_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:1775:4: (lv_propertyName_2_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:1775:4: (lv_propertyName_2_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1776:5: lv_propertyName_2_0= ruleUnrestrictedName
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
            						"org.xtext.example.mydsl.MyAtl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,54,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getBindingStatAccess().getLessThanSignHyphenMinusKeyword_3());
            		
            // InternalMyAtl.g:1797:3: ( (lv_value_4_0= ruleExpCS ) )
            // InternalMyAtl.g:1798:4: (lv_value_4_0= ruleExpCS )
            {
            // InternalMyAtl.g:1798:4: (lv_value_4_0= ruleExpCS )
            // InternalMyAtl.g:1799:5: lv_value_4_0= ruleExpCS
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
    // InternalMyAtl.g:1824:1: entryRuleATLType returns [EObject current=null] : iv_ruleATLType= ruleATLType EOF ;
    public final EObject entryRuleATLType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATLType = null;


        try {
            // InternalMyAtl.g:1824:48: (iv_ruleATLType= ruleATLType EOF )
            // InternalMyAtl.g:1825:2: iv_ruleATLType= ruleATLType EOF
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
    // InternalMyAtl.g:1831:1: ruleATLType returns [EObject current=null] : ( ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleATLType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_modelName_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1837:2: ( ( ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) ) ) )
            // InternalMyAtl.g:1838:2: ( ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) ) )
            {
            // InternalMyAtl.g:1838:2: ( ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) ) )
            // InternalMyAtl.g:1839:3: ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )? ( (lv_type_2_0= ruleTypeExpCS ) )
            {
            // InternalMyAtl.g:1839:3: ( ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_SIMPLE_ID) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==56) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalMyAtl.g:1840:4: ( (lv_modelName_0_0= ruleATLModelName ) ) otherlv_1= '!'
                    {
                    // InternalMyAtl.g:1840:4: ( (lv_modelName_0_0= ruleATLModelName ) )
                    // InternalMyAtl.g:1841:5: (lv_modelName_0_0= ruleATLModelName )
                    {
                    // InternalMyAtl.g:1841:5: (lv_modelName_0_0= ruleATLModelName )
                    // InternalMyAtl.g:1842:6: lv_modelName_0_0= ruleATLModelName
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
                    							"org.xtext.example.mydsl.MyAtl.ATLModelName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,56,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getATLTypeAccess().getExclamationMarkKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyAtl.g:1864:3: ( (lv_type_2_0= ruleTypeExpCS ) )
            // InternalMyAtl.g:1865:4: (lv_type_2_0= ruleTypeExpCS )
            {
            // InternalMyAtl.g:1865:4: (lv_type_2_0= ruleTypeExpCS )
            // InternalMyAtl.g:1866:5: lv_type_2_0= ruleTypeExpCS
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
    // InternalMyAtl.g:1887:1: entryRuleATLModelName returns [String current=null] : iv_ruleATLModelName= ruleATLModelName EOF ;
    public final String entryRuleATLModelName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATLModelName = null;


        try {
            // InternalMyAtl.g:1887:52: (iv_ruleATLModelName= ruleATLModelName EOF )
            // InternalMyAtl.g:1888:2: iv_ruleATLModelName= ruleATLModelName EOF
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
    // InternalMyAtl.g:1894:1: ruleATLModelName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_UnrestrictedName_0= ruleUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleATLModelName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:1900:2: (this_UnrestrictedName_0= ruleUnrestrictedName )
            // InternalMyAtl.g:1901:2: this_UnrestrictedName_0= ruleUnrestrictedName
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
    // InternalMyAtl.g:1914:1: entryRuleEssentialOCLPrefixOperator returns [String current=null] : iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF ;
    public final String entryRuleEssentialOCLPrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLPrefixOperator = null;


        try {
            // InternalMyAtl.g:1914:66: (iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF )
            // InternalMyAtl.g:1915:2: iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF
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
    // InternalMyAtl.g:1921:1: ruleEssentialOCLPrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLPrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtl.g:1927:2: ( (kw= '-' | kw= 'not' ) )
            // InternalMyAtl.g:1928:2: (kw= '-' | kw= 'not' )
            {
            // InternalMyAtl.g:1928:2: (kw= '-' | kw= 'not' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==57) ) {
                alt30=1;
            }
            else if ( (LA30_0==58) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyAtl.g:1929:3: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLPrefixOperatorAccess().getHyphenMinusKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:1935:3: kw= 'not'
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
    // InternalMyAtl.g:1944:1: entryRuleEssentialOCLInfixOperator returns [String current=null] : iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF ;
    public final String entryRuleEssentialOCLInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperator = null;


        try {
            // InternalMyAtl.g:1944:65: (iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF )
            // InternalMyAtl.g:1945:2: iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF
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
    // InternalMyAtl.g:1951:1: ruleEssentialOCLInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtl.g:1957:2: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) )
            // InternalMyAtl.g:1958:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            {
            // InternalMyAtl.g:1958:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            int alt31=14;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt31=1;
                }
                break;
            case 60:
                {
                alt31=2;
                }
                break;
            case 61:
                {
                alt31=3;
                }
                break;
            case 57:
                {
                alt31=4;
                }
                break;
            case 62:
                {
                alt31=5;
                }
                break;
            case 63:
                {
                alt31=6;
                }
                break;
            case 64:
                {
                alt31=7;
                }
                break;
            case 65:
                {
                alt31=8;
                }
                break;
            case 51:
                {
                alt31=9;
                }
                break;
            case 66:
                {
                alt31=10;
                }
                break;
            case 67:
                {
                alt31=11;
                }
                break;
            case 68:
                {
                alt31=12;
                }
                break;
            case 69:
                {
                alt31=13;
                }
                break;
            case 70:
                {
                alt31=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalMyAtl.g:1959:3: kw= '*'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:1965:3: kw= '/'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyAtl.g:1971:3: kw= '+'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getPlusSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyAtl.g:1977:3: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getHyphenMinusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyAtl.g:1983:3: kw= '>'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyAtl.g:1989:3: kw= '<'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyAtl.g:1995:3: kw= '>='
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignEqualsSignKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyAtl.g:2001:3: kw= '<='
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignEqualsSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalMyAtl.g:2007:3: kw= '='
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getEqualsSignKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalMyAtl.g:2013:3: kw= '<>'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignGreaterThanSignKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalMyAtl.g:2019:3: kw= 'and'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getAndKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalMyAtl.g:2025:3: kw= 'or'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getOrKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalMyAtl.g:2031:3: kw= 'xor'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getXorKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalMyAtl.g:2037:3: kw= 'implies'
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
    // InternalMyAtl.g:2046:1: entryRuleEssentialOCLNavigationOperator returns [String current=null] : iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF ;
    public final String entryRuleEssentialOCLNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperator = null;


        try {
            // InternalMyAtl.g:2046:70: (iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF )
            // InternalMyAtl.g:2047:2: iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF
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
    // InternalMyAtl.g:2053:1: ruleEssentialOCLNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyAtl.g:2059:2: ( (kw= '.' | kw= '->' ) )
            // InternalMyAtl.g:2060:2: (kw= '.' | kw= '->' )
            {
            // InternalMyAtl.g:2060:2: (kw= '.' | kw= '->' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==55) ) {
                alt32=1;
            }
            else if ( (LA32_0==71) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyAtl.g:2061:3: kw= '.'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorAccess().getFullStopKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:2067:3: kw= '->'
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
    // InternalMyAtl.g:2076:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalMyAtl.g:2076:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMyAtl.g:2077:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalMyAtl.g:2083:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;


        	enterRule();

        try {
            // InternalMyAtl.g:2089:2: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // InternalMyAtl.g:2090:2: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
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
    // InternalMyAtl.g:2100:1: entryRulePrefixOperator returns [String current=null] : iv_rulePrefixOperator= rulePrefixOperator EOF ;
    public final String entryRulePrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixOperator = null;


        try {
            // InternalMyAtl.g:2100:54: (iv_rulePrefixOperator= rulePrefixOperator EOF )
            // InternalMyAtl.g:2101:2: iv_rulePrefixOperator= rulePrefixOperator EOF
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
    // InternalMyAtl.g:2107:1: rulePrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator ;
    public final AntlrDatatypeRuleToken rulePrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLPrefixOperator_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2113:2: (this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator )
            // InternalMyAtl.g:2114:2: this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator
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
    // InternalMyAtl.g:2127:1: entryRuleInfixOperator returns [String current=null] : iv_ruleInfixOperator= ruleInfixOperator EOF ;
    public final String entryRuleInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperator = null;


        try {
            // InternalMyAtl.g:2127:53: (iv_ruleInfixOperator= ruleInfixOperator EOF )
            // InternalMyAtl.g:2128:2: iv_ruleInfixOperator= ruleInfixOperator EOF
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
    // InternalMyAtl.g:2134:1: ruleInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator ;
    public final AntlrDatatypeRuleToken ruleInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperator_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2140:2: (this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator )
            // InternalMyAtl.g:2141:2: this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator
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
    // InternalMyAtl.g:2154:1: entryRuleNavigationOperator returns [String current=null] : iv_ruleNavigationOperator= ruleNavigationOperator EOF ;
    public final String entryRuleNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperator = null;


        try {
            // InternalMyAtl.g:2154:58: (iv_ruleNavigationOperator= ruleNavigationOperator EOF )
            // InternalMyAtl.g:2155:2: iv_ruleNavigationOperator= ruleNavigationOperator EOF
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
    // InternalMyAtl.g:2161:1: ruleNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator ;
    public final AntlrDatatypeRuleToken ruleNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperator_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2167:2: (this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator )
            // InternalMyAtl.g:2168:2: this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator
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
    // InternalMyAtl.g:2181:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // InternalMyAtl.g:2181:57: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // InternalMyAtl.g:2182:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
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
    // InternalMyAtl.g:2188:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? ) ;
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
            // InternalMyAtl.g:2194:2: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? ) )
            // InternalMyAtl.g:2195:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? )
            {
            // InternalMyAtl.g:2195:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? )
            // InternalMyAtl.g:2196:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )?
            {
            // InternalMyAtl.g:2196:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // InternalMyAtl.g:2197:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // InternalMyAtl.g:2197:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // InternalMyAtl.g:2198:5: lv_name_0_0= ruleCollectionTypeIdentifier
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
            						"org.xtext.example.mydsl.MyAtl.CollectionTypeIdentifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyAtl.g:2215:3: ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )?
            int alt33=3;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalMyAtl.g:2216:4: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
                    {
                    // InternalMyAtl.g:2216:4: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
                    // InternalMyAtl.g:2217:5: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_28); 

                    					newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalMyAtl.g:2221:5: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:2222:6: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:2222:6: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyAtl.g:2223:7: lv_ownedType_2_0= ruleTypeExpCS
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
                    								"org.xtext.example.mydsl.MyAtl.TypeExpCS");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,47,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:2246:4: (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' )
                    {
                    // InternalMyAtl.g:2246:4: (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' )
                    // InternalMyAtl.g:2247:5: otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>'
                    {
                    otherlv_4=(Token)match(input,63,FOLLOW_28); 

                    					newLeafNode(otherlv_4, grammarAccess.getCollectionTypeCSAccess().getLessThanSignKeyword_1_1_0());
                    				
                    // InternalMyAtl.g:2251:5: ( (lv_ownedType_5_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:2252:6: (lv_ownedType_5_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:2252:6: (lv_ownedType_5_0= ruleTypeExpCS )
                    // InternalMyAtl.g:2253:7: lv_ownedType_5_0= ruleTypeExpCS
                    {

                    							newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_39);
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

                    otherlv_6=(Token)match(input,62,FOLLOW_2); 

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
    // InternalMyAtl.g:2280:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // InternalMyAtl.g:2280:52: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // InternalMyAtl.g:2281:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
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
    // InternalMyAtl.g:2287:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) ) ;
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
            // InternalMyAtl.g:2293:2: ( ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) ) )
            // InternalMyAtl.g:2294:2: ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) )
            {
            // InternalMyAtl.g:2294:2: ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) )
            // InternalMyAtl.g:2295:3: ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) )
            {
            // InternalMyAtl.g:2295:3: ( (lv_name_0_0= 'Tuple' ) )
            // InternalMyAtl.g:2296:4: (lv_name_0_0= 'Tuple' )
            {
            // InternalMyAtl.g:2296:4: (lv_name_0_0= 'Tuple' )
            // InternalMyAtl.g:2297:5: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,25,FOLLOW_40); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTupleTypeCSAccess().getNameTupleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTupleTypeCSRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Tuple");
            				

            }


            }

            // InternalMyAtl.g:2309:3: ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )?
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==46) ) {
                alt38=1;
            }
            else if ( (LA38_0==63) ) {
                alt38=2;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyAtl.g:2310:4: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' )
                    {
                    // InternalMyAtl.g:2310:4: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' )
                    // InternalMyAtl.g:2311:5: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_26); 

                    					newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalMyAtl.g:2315:5: ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_SIMPLE_ID) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalMyAtl.g:2316:6: ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )*
                            {
                            // InternalMyAtl.g:2316:6: ( (lv_ownedParts_2_0= ruletuplePartCS ) )
                            // InternalMyAtl.g:2317:7: (lv_ownedParts_2_0= ruletuplePartCS )
                            {
                            // InternalMyAtl.g:2317:7: (lv_ownedParts_2_0= ruletuplePartCS )
                            // InternalMyAtl.g:2318:8: lv_ownedParts_2_0= ruletuplePartCS
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
                            									"org.xtext.example.mydsl.MyAtl.tuplePartCS");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMyAtl.g:2335:6: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==22) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // InternalMyAtl.g:2336:7: otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                            	    							newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_0_1_1_0());
                            	    						
                            	    // InternalMyAtl.g:2340:7: ( (lv_ownedParts_4_0= ruletuplePartCS ) )
                            	    // InternalMyAtl.g:2341:8: (lv_ownedParts_4_0= ruletuplePartCS )
                            	    {
                            	    // InternalMyAtl.g:2341:8: (lv_ownedParts_4_0= ruletuplePartCS )
                            	    // InternalMyAtl.g:2342:9: lv_ownedParts_4_0= ruletuplePartCS
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
                            	    										"org.xtext.example.mydsl.MyAtl.tuplePartCS");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,47,FOLLOW_41); 

                    					newLeafNode(otherlv_5, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtl.g:2367:4: (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' )
                    {
                    // InternalMyAtl.g:2367:4: (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' )
                    // InternalMyAtl.g:2368:5: otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>'
                    {
                    otherlv_6=(Token)match(input,63,FOLLOW_42); 

                    					newLeafNode(otherlv_6, grammarAccess.getTupleTypeCSAccess().getLessThanSignKeyword_1_1_0());
                    				
                    // InternalMyAtl.g:2372:5: ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_SIMPLE_ID) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalMyAtl.g:2373:6: ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )*
                            {
                            // InternalMyAtl.g:2373:6: ( (lv_ownedParts_7_0= ruletuplePartCS ) )
                            // InternalMyAtl.g:2374:7: (lv_ownedParts_7_0= ruletuplePartCS )
                            {
                            // InternalMyAtl.g:2374:7: (lv_ownedParts_7_0= ruletuplePartCS )
                            // InternalMyAtl.g:2375:8: lv_ownedParts_7_0= ruletuplePartCS
                            {

                            								newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_0_0());
                            							
                            pushFollow(FOLLOW_43);
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

                            // InternalMyAtl.g:2392:6: (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==22) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // InternalMyAtl.g:2393:7: otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) )
                            	    {
                            	    otherlv_8=(Token)match(input,22,FOLLOW_3); 

                            	    							newLeafNode(otherlv_8, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_1_0());
                            	    						
                            	    // InternalMyAtl.g:2397:7: ( (lv_ownedParts_9_0= ruletuplePartCS ) )
                            	    // InternalMyAtl.g:2398:8: (lv_ownedParts_9_0= ruletuplePartCS )
                            	    {
                            	    // InternalMyAtl.g:2398:8: (lv_ownedParts_9_0= ruletuplePartCS )
                            	    // InternalMyAtl.g:2399:9: lv_ownedParts_9_0= ruletuplePartCS
                            	    {

                            	    									newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_43);
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
                            	    break loop36;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,62,FOLLOW_41); 

                    					newLeafNode(otherlv_10, grammarAccess.getTupleTypeCSAccess().getGreaterThanSignKeyword_1_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalMyAtl.g:2424:3: ( (lv_backtrack_11_0= 'true' ) )
            // InternalMyAtl.g:2425:4: (lv_backtrack_11_0= 'true' )
            {
            // InternalMyAtl.g:2425:4: (lv_backtrack_11_0= 'true' )
            // InternalMyAtl.g:2426:5: lv_backtrack_11_0= 'true'
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
    // InternalMyAtl.g:2442:1: entryRuletuplePartCS returns [EObject current=null] : iv_ruletuplePartCS= ruletuplePartCS EOF ;
    public final EObject entryRuletuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletuplePartCS = null;


        try {
            // InternalMyAtl.g:2442:52: (iv_ruletuplePartCS= ruletuplePartCS EOF )
            // InternalMyAtl.g:2443:2: iv_ruletuplePartCS= ruletuplePartCS EOF
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
    // InternalMyAtl.g:2449:1: ruletuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruletuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2455:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalMyAtl.g:2456:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalMyAtl.g:2456:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalMyAtl.g:2457:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalMyAtl.g:2457:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:2458:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:2458:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:2459:5: lv_name_0_0= ruleUnrestrictedName
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

            otherlv_1=(Token)match(input,21,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
            		
            // InternalMyAtl.g:2480:3: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalMyAtl.g:2481:4: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalMyAtl.g:2481:4: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalMyAtl.g:2482:5: lv_ownedType_2_0= ruleTypeExpCS
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
    // InternalMyAtl.g:2503:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // InternalMyAtl.g:2503:64: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // InternalMyAtl.g:2504:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
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
    // InternalMyAtl.g:2510:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressionCS_0_0 = null;

        EObject lv_lastExpressionCS_2_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2516:2: ( ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) )
            // InternalMyAtl.g:2517:2: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtl.g:2517:2: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            // InternalMyAtl.g:2518:3: ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            {
            // InternalMyAtl.g:2518:3: ( (lv_expressionCS_0_0= ruleExpCS ) )
            // InternalMyAtl.g:2519:4: (lv_expressionCS_0_0= ruleExpCS )
            {
            // InternalMyAtl.g:2519:4: (lv_expressionCS_0_0= ruleExpCS )
            // InternalMyAtl.g:2520:5: lv_expressionCS_0_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSExpCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
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

            // InternalMyAtl.g:2537:3: (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==73) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyAtl.g:2538:4: otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    {
                    otherlv_1=(Token)match(input,73,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_1_0());
                    			
                    // InternalMyAtl.g:2542:4: ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    // InternalMyAtl.g:2543:5: (lv_lastExpressionCS_2_0= ruleExpCS )
                    {
                    // InternalMyAtl.g:2543:5: (lv_lastExpressionCS_2_0= ruleExpCS )
                    // InternalMyAtl.g:2544:6: lv_lastExpressionCS_2_0= ruleExpCS
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
    // InternalMyAtl.g:2566:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // InternalMyAtl.g:2566:62: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // InternalMyAtl.g:2567:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
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
    // InternalMyAtl.g:2573:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
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
            // InternalMyAtl.g:2579:2: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // InternalMyAtl.g:2580:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // InternalMyAtl.g:2580:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt40=6;
            switch ( input.LA(1) ) {
            case RULE_BIG_INT:
                {
                alt40=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt40=2;
                }
                break;
            case 72:
            case 74:
                {
                alt40=3;
                }
                break;
            case 59:
                {
                alt40=4;
                }
                break;
            case 75:
                {
                alt40=5;
                }
                break;
            case 76:
                {
                alt40=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalMyAtl.g:2581:3: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
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
                    // InternalMyAtl.g:2590:3: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
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
                    // InternalMyAtl.g:2599:3: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
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
                    // InternalMyAtl.g:2608:3: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
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
                    // InternalMyAtl.g:2617:3: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
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
                    // InternalMyAtl.g:2626:3: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
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
    // InternalMyAtl.g:2638:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // InternalMyAtl.g:2638:58: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // InternalMyAtl.g:2639:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
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
    // InternalMyAtl.g:2645:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
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
            // InternalMyAtl.g:2651:2: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // InternalMyAtl.g:2652:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // InternalMyAtl.g:2652:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // InternalMyAtl.g:2653:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyAtl.g:2661:3: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // InternalMyAtl.g:2662:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // InternalMyAtl.g:2662:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // InternalMyAtl.g:2663:5: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {

            					newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_45);
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

            // InternalMyAtl.g:2680:3: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==22) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMyAtl.g:2681:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyAtl.g:2685:4: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // InternalMyAtl.g:2686:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // InternalMyAtl.g:2686:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // InternalMyAtl.g:2687:6: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {

            	    						newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_45);
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
            	    break loop41;
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
    // InternalMyAtl.g:2713:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // InternalMyAtl.g:2713:59: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // InternalMyAtl.g:2714:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
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
    // InternalMyAtl.g:2720:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2726:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // InternalMyAtl.g:2727:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // InternalMyAtl.g:2727:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // InternalMyAtl.g:2728:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // InternalMyAtl.g:2728:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:2729:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:2729:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:2730:5: lv_name_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_46);
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

            // InternalMyAtl.g:2747:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==21) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyAtl.g:2748:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyAtl.g:2752:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:2753:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:2753:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyAtl.g:2754:6: lv_ownedType_2_0= ruleTypeExpCS
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
                    							"org.xtext.example.mydsl.MyAtl.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,51,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
            		
            // InternalMyAtl.g:2776:3: ( (lv_initExpression_4_0= ruleExpCS ) )
            // InternalMyAtl.g:2777:4: (lv_initExpression_4_0= ruleExpCS )
            {
            // InternalMyAtl.g:2777:4: (lv_initExpression_4_0= ruleExpCS )
            // InternalMyAtl.g:2778:5: lv_initExpression_4_0= ruleExpCS
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
    // InternalMyAtl.g:2799:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // InternalMyAtl.g:2799:59: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // InternalMyAtl.g:2800:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
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
    // InternalMyAtl.g:2806:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= RULE_BIG_INT ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyAtl.g:2812:2: ( ( (lv_name_0_0= RULE_BIG_INT ) ) )
            // InternalMyAtl.g:2813:2: ( (lv_name_0_0= RULE_BIG_INT ) )
            {
            // InternalMyAtl.g:2813:2: ( (lv_name_0_0= RULE_BIG_INT ) )
            // InternalMyAtl.g:2814:3: (lv_name_0_0= RULE_BIG_INT )
            {
            // InternalMyAtl.g:2814:3: (lv_name_0_0= RULE_BIG_INT )
            // InternalMyAtl.g:2815:4: lv_name_0_0= RULE_BIG_INT
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
    // InternalMyAtl.g:2834:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // InternalMyAtl.g:2834:59: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // InternalMyAtl.g:2835:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
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
    // InternalMyAtl.g:2841:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleStringLiteral ) ) ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:2847:2: ( ( (lv_name_0_0= ruleStringLiteral ) ) )
            // InternalMyAtl.g:2848:2: ( (lv_name_0_0= ruleStringLiteral ) )
            {
            // InternalMyAtl.g:2848:2: ( (lv_name_0_0= ruleStringLiteral ) )
            // InternalMyAtl.g:2849:3: (lv_name_0_0= ruleStringLiteral )
            {
            // InternalMyAtl.g:2849:3: (lv_name_0_0= ruleStringLiteral )
            // InternalMyAtl.g:2850:4: lv_name_0_0= ruleStringLiteral
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
    // InternalMyAtl.g:2870:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // InternalMyAtl.g:2870:60: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // InternalMyAtl.g:2871:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
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
    // InternalMyAtl.g:2877:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyAtl.g:2883:2: ( ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) )
            // InternalMyAtl.g:2884:2: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            {
            // InternalMyAtl.g:2884:2: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==72) ) {
                alt43=1;
            }
            else if ( (LA43_0==74) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyAtl.g:2885:3: ( (lv_name_0_0= 'true' ) )
                    {
                    // InternalMyAtl.g:2885:3: ( (lv_name_0_0= 'true' ) )
                    // InternalMyAtl.g:2886:4: (lv_name_0_0= 'true' )
                    {
                    // InternalMyAtl.g:2886:4: (lv_name_0_0= 'true' )
                    // InternalMyAtl.g:2887:5: lv_name_0_0= 'true'
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
                    // InternalMyAtl.g:2900:3: ( (lv_name_1_0= 'false' ) )
                    {
                    // InternalMyAtl.g:2900:3: ( (lv_name_1_0= 'false' ) )
                    // InternalMyAtl.g:2901:4: (lv_name_1_0= 'false' )
                    {
                    // InternalMyAtl.g:2901:4: (lv_name_1_0= 'false' )
                    // InternalMyAtl.g:2902:5: lv_name_1_0= 'false'
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
    // InternalMyAtl.g:2918:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // InternalMyAtl.g:2918:69: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // InternalMyAtl.g:2919:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
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
    // InternalMyAtl.g:2925:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtl.g:2931:2: ( ( () otherlv_1= '*' ) )
            // InternalMyAtl.g:2932:2: ( () otherlv_1= '*' )
            {
            // InternalMyAtl.g:2932:2: ( () otherlv_1= '*' )
            // InternalMyAtl.g:2933:3: () otherlv_1= '*'
            {
            // InternalMyAtl.g:2933:3: ()
            // InternalMyAtl.g:2934:4: 
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
    // InternalMyAtl.g:2948:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // InternalMyAtl.g:2948:60: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // InternalMyAtl.g:2949:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
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
    // InternalMyAtl.g:2955:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtl.g:2961:2: ( ( () otherlv_1= 'invalid' ) )
            // InternalMyAtl.g:2962:2: ( () otherlv_1= 'invalid' )
            {
            // InternalMyAtl.g:2962:2: ( () otherlv_1= 'invalid' )
            // InternalMyAtl.g:2963:3: () otherlv_1= 'invalid'
            {
            // InternalMyAtl.g:2963:3: ()
            // InternalMyAtl.g:2964:4: 
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
    // InternalMyAtl.g:2978:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // InternalMyAtl.g:2978:57: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // InternalMyAtl.g:2979:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
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
    // InternalMyAtl.g:2985:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtl.g:2991:2: ( ( () otherlv_1= 'null' ) )
            // InternalMyAtl.g:2992:2: ( () otherlv_1= 'null' )
            {
            // InternalMyAtl.g:2992:2: ( () otherlv_1= 'null' )
            // InternalMyAtl.g:2993:3: () otherlv_1= 'null'
            {
            // InternalMyAtl.g:2993:3: ()
            // InternalMyAtl.g:2994:4: 
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
    // InternalMyAtl.g:3008:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // InternalMyAtl.g:3008:56: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // InternalMyAtl.g:3009:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
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
    // InternalMyAtl.g:3015:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3021:2: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // InternalMyAtl.g:3022:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // InternalMyAtl.g:3022:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // InternalMyAtl.g:3023:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // InternalMyAtl.g:3023:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // InternalMyAtl.g:3024:4: lv_name_0_0= rulePrimitiveTypeIdentifier
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
    // InternalMyAtl.g:3044:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // InternalMyAtl.g:3044:54: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // InternalMyAtl.g:3045:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
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
    // InternalMyAtl.g:3051:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_TupleTypeCS_1 = null;

        EObject this_CollectionTypeCS_2 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3057:2: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS ) )
            // InternalMyAtl.g:3058:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS )
            {
            // InternalMyAtl.g:3058:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS )
            int alt44=3;
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
                alt44=1;
                }
                break;
            case 25:
                {
                alt44=2;
                }
                break;
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalMyAtl.g:3059:3: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
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
                    // InternalMyAtl.g:3068:3: this_TupleTypeCS_1= ruleTupleTypeCS
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
                    // InternalMyAtl.g:3077:3: this_CollectionTypeCS_2= ruleCollectionTypeCS
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
    // InternalMyAtl.g:3089:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // InternalMyAtl.g:3089:54: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // InternalMyAtl.g:3090:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
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
    // InternalMyAtl.g:3096:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) ;
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
            // InternalMyAtl.g:3102:2: ( ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) )
            // InternalMyAtl.g:3103:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            {
            // InternalMyAtl.g:3103:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_SIMPLE_ID) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==EOF||LA46_1==18||LA46_1==22||(LA46_1>=41 && LA46_1<=44)||(LA46_1>=46 && LA46_1<=47)||LA46_1==51||LA46_1==62||LA46_1==78) ) {
                    alt46=2;
                }
                else if ( (LA46_1==77) ) {
                    alt46=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyAtl.g:3104:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    {
                    // InternalMyAtl.g:3104:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    // InternalMyAtl.g:3105:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) )
                    {
                    // InternalMyAtl.g:3105:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* )
                    // InternalMyAtl.g:3106:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    {
                    // InternalMyAtl.g:3106:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) )
                    // InternalMyAtl.g:3107:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    {
                    // InternalMyAtl.g:3107:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    // InternalMyAtl.g:3108:7: lv_namespace_0_0= ruleUnrestrictedName
                    {

                    							newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getNamespaceUnrestrictedNameParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_47);
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

                    otherlv_1=(Token)match(input,77,FOLLOW_28); 

                    					newLeafNode(otherlv_1, grammarAccess.getTypeNameExpCSAccess().getColonColonKeyword_0_0_1());
                    				
                    // InternalMyAtl.g:3129:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    loop45:
                    do {
                        int alt45=2;
                        alt45 = dfa45.predict(input);
                        switch (alt45) {
                    	case 1 :
                    	    // InternalMyAtl.g:3130:6: ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::'
                    	    {
                    	    // InternalMyAtl.g:3130:6: ( (lv_namespace_2_0= ruleUnreservedName ) )
                    	    // InternalMyAtl.g:3131:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    {
                    	    // InternalMyAtl.g:3131:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    // InternalMyAtl.g:3132:8: lv_namespace_2_0= ruleUnreservedName
                    	    {

                    	    								newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getNamespaceUnreservedNameParserRuleCall_0_0_2_0_0());
                    	    							
                    	    pushFollow(FOLLOW_47);
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

                    	    otherlv_3=(Token)match(input,77,FOLLOW_28); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getTypeNameExpCSAccess().getColonColonKeyword_0_0_2_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }

                    // InternalMyAtl.g:3155:4: ( (lv_element_4_0= ruleUnreservedName ) )
                    // InternalMyAtl.g:3156:5: (lv_element_4_0= ruleUnreservedName )
                    {
                    // InternalMyAtl.g:3156:5: (lv_element_4_0= ruleUnreservedName )
                    // InternalMyAtl.g:3157:6: lv_element_4_0= ruleUnreservedName
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
                    // InternalMyAtl.g:3176:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    {
                    // InternalMyAtl.g:3176:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    // InternalMyAtl.g:3177:4: (lv_element_5_0= ruleUnrestrictedName )
                    {
                    // InternalMyAtl.g:3177:4: (lv_element_5_0= ruleUnrestrictedName )
                    // InternalMyAtl.g:3178:5: lv_element_5_0= ruleUnrestrictedName
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
    // InternalMyAtl.g:3199:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // InternalMyAtl.g:3199:50: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // InternalMyAtl.g:3200:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
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
    // InternalMyAtl.g:3206:1: ruleTypeExpCS returns [EObject current=null] : (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3212:2: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) )
            // InternalMyAtl.g:3213:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            {
            // InternalMyAtl.g:3213:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_SIMPLE_ID) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=25 && LA47_0<=38)) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyAtl.g:3214:3: this_TypeNameExpCS_0= ruleTypeNameExpCS
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
                    // InternalMyAtl.g:3223:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
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
    // InternalMyAtl.g:3235:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // InternalMyAtl.g:3235:56: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // InternalMyAtl.g:3236:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
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
    // InternalMyAtl.g:3242:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_init_4_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3248:2: ( ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? ) )
            // InternalMyAtl.g:3249:2: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtl.g:3249:2: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )
            // InternalMyAtl.g:3250:3: ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
            {
            // InternalMyAtl.g:3250:3: ( (lv_name_0_0= ruleNavigatingArgExpCS ) )
            // InternalMyAtl.g:3251:4: (lv_name_0_0= ruleNavigatingArgExpCS )
            {
            // InternalMyAtl.g:3251:4: (lv_name_0_0= ruleNavigatingArgExpCS )
            // InternalMyAtl.g:3252:5: lv_name_0_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_48);
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

            // InternalMyAtl.g:3269:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==21) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyAtl.g:3270:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyAtl.g:3274:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:3275:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:3275:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyAtl.g:3276:6: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_49);
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

            // InternalMyAtl.g:3294:3: (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==51) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyAtl.g:3295:4: otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalMyAtl.g:3299:4: ( (lv_init_4_0= ruleExpCS ) )
                    // InternalMyAtl.g:3300:5: (lv_init_4_0= ruleExpCS )
                    {
                    // InternalMyAtl.g:3300:5: (lv_init_4_0= ruleExpCS )
                    // InternalMyAtl.g:3301:6: lv_init_4_0= ruleExpCS
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
    // InternalMyAtl.g:3323:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // InternalMyAtl.g:3323:59: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // InternalMyAtl.g:3324:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
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
    // InternalMyAtl.g:3330:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // InternalMyAtl.g:3336:2: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyAtl.g:3337:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtl.g:3337:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyAtl.g:3338:3: ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyAtl.g:3338:3: ( (lv_prefix_0_0= '|' ) )
            // InternalMyAtl.g:3339:4: (lv_prefix_0_0= '|' )
            {
            // InternalMyAtl.g:3339:4: (lv_prefix_0_0= '|' )
            // InternalMyAtl.g:3340:5: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,78,FOLLOW_19); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, "|");
            				

            }


            }

            // InternalMyAtl.g:3352:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyAtl.g:3353:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyAtl.g:3353:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyAtl.g:3354:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
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

            // InternalMyAtl.g:3371:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==21) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyAtl.g:3372:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyAtl.g:3376:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:3377:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:3377:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyAtl.g:3378:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_49);
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

            // InternalMyAtl.g:3396:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==51) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyAtl.g:3397:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyAtl.g:3401:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyAtl.g:3402:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyAtl.g:3402:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyAtl.g:3403:6: lv_init_5_0= ruleExpCS
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
    // InternalMyAtl.g:3425:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // InternalMyAtl.g:3425:61: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // InternalMyAtl.g:3426:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
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
    // InternalMyAtl.g:3432:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // InternalMyAtl.g:3438:2: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyAtl.g:3439:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtl.g:3439:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyAtl.g:3440:3: ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyAtl.g:3440:3: ( (lv_prefix_0_0= ',' ) )
            // InternalMyAtl.g:3441:4: (lv_prefix_0_0= ',' )
            {
            // InternalMyAtl.g:3441:4: (lv_prefix_0_0= ',' )
            // InternalMyAtl.g:3442:5: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,22,FOLLOW_19); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ",");
            				

            }


            }

            // InternalMyAtl.g:3454:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyAtl.g:3455:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyAtl.g:3455:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyAtl.g:3456:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
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

            // InternalMyAtl.g:3473:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==21) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyAtl.g:3474:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyAtl.g:3478:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:3479:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:3479:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyAtl.g:3480:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_49);
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

            // InternalMyAtl.g:3498:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==51) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyAtl.g:3499:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyAtl.g:3503:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyAtl.g:3504:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyAtl.g:3504:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyAtl.g:3505:6: lv_init_5_0= ruleExpCS
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
    // InternalMyAtl.g:3527:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // InternalMyAtl.g:3527:60: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // InternalMyAtl.g:3528:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
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
    // InternalMyAtl.g:3534:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // InternalMyAtl.g:3540:2: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyAtl.g:3541:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyAtl.g:3541:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyAtl.g:3542:3: ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyAtl.g:3542:3: ( (lv_prefix_0_0= ';' ) )
            // InternalMyAtl.g:3543:4: (lv_prefix_0_0= ';' )
            {
            // InternalMyAtl.g:3543:4: (lv_prefix_0_0= ';' )
            // InternalMyAtl.g:3544:5: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,18,FOLLOW_19); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ";");
            				

            }


            }

            // InternalMyAtl.g:3556:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyAtl.g:3557:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyAtl.g:3557:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyAtl.g:3558:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
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

            // InternalMyAtl.g:3575:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==21) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyAtl.g:3576:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyAtl.g:3580:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:3581:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:3581:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyAtl.g:3582:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_49);
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

            // InternalMyAtl.g:3600:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==51) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyAtl.g:3601:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyAtl.g:3605:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyAtl.g:3606:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyAtl.g:3606:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyAtl.g:3607:6: lv_init_5_0= ruleExpCS
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
    // InternalMyAtl.g:3629:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // InternalMyAtl.g:3629:59: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // InternalMyAtl.g:3630:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
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
    // InternalMyAtl.g:3636:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3642:2: (this_ExpCS_0= ruleExpCS )
            // InternalMyAtl.g:3643:2: this_ExpCS_0= ruleExpCS
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
    // InternalMyAtl.g:3654:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // InternalMyAtl.g:3654:48: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // InternalMyAtl.g:3655:2: iv_ruleIfExpCS= ruleIfExpCS EOF
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
    // InternalMyAtl.g:3661:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) ;
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
            // InternalMyAtl.g:3667:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) )
            // InternalMyAtl.g:3668:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            {
            // InternalMyAtl.g:3668:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            // InternalMyAtl.g:3669:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
            		
            // InternalMyAtl.g:3673:3: ( (lv_condition_1_0= ruleExpCS ) )
            // InternalMyAtl.g:3674:4: (lv_condition_1_0= ruleExpCS )
            {
            // InternalMyAtl.g:3674:4: (lv_condition_1_0= ruleExpCS )
            // InternalMyAtl.g:3675:5: lv_condition_1_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getConditionExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_50);
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

            otherlv_2=(Token)match(input,80,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
            		
            // InternalMyAtl.g:3696:3: ( (lv_thenExpression_3_0= ruleExpCS ) )
            // InternalMyAtl.g:3697:4: (lv_thenExpression_3_0= ruleExpCS )
            {
            // InternalMyAtl.g:3697:4: (lv_thenExpression_3_0= ruleExpCS )
            // InternalMyAtl.g:3698:5: lv_thenExpression_3_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getThenExpressionExpCSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_51);
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

            otherlv_4=(Token)match(input,81,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getIfExpCSAccess().getElseKeyword_4());
            		
            // InternalMyAtl.g:3719:3: ( (lv_elseExpression_5_0= ruleExpCS ) )
            // InternalMyAtl.g:3720:4: (lv_elseExpression_5_0= ruleExpCS )
            {
            // InternalMyAtl.g:3720:4: (lv_elseExpression_5_0= ruleExpCS )
            // InternalMyAtl.g:3721:5: lv_elseExpression_5_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getElseExpressionExpCSParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_52);
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
    // InternalMyAtl.g:3746:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // InternalMyAtl.g:3746:49: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // InternalMyAtl.g:3747:2: iv_ruleLetExpCS= ruleLetExpCS EOF
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
    // InternalMyAtl.g:3753:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) ;
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
            // InternalMyAtl.g:3759:2: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) )
            // InternalMyAtl.g:3760:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            {
            // InternalMyAtl.g:3760:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            // InternalMyAtl.g:3761:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
            		
            // InternalMyAtl.g:3765:3: ( (lv_variable_1_0= ruleLetVariableCS ) )
            // InternalMyAtl.g:3766:4: (lv_variable_1_0= ruleLetVariableCS )
            {
            // InternalMyAtl.g:3766:4: (lv_variable_1_0= ruleLetVariableCS )
            // InternalMyAtl.g:3767:5: lv_variable_1_0= ruleLetVariableCS
            {

            					newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_53);
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

            // InternalMyAtl.g:3784:3: (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==22) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalMyAtl.g:3785:4: otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyAtl.g:3789:4: ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    // InternalMyAtl.g:3790:5: (lv_variable_3_0= ruleLetVariableCS )
            	    {
            	    // InternalMyAtl.g:3790:5: (lv_variable_3_0= ruleLetVariableCS )
            	    // InternalMyAtl.g:3791:6: lv_variable_3_0= ruleLetVariableCS
            	    {

            	    						newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_53);
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
            	    break loop56;
                }
            } while (true);

            otherlv_4=(Token)match(input,84,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
            		
            // InternalMyAtl.g:3813:3: ( (lv_in_5_0= ruleExpCS ) )
            // InternalMyAtl.g:3814:4: (lv_in_5_0= ruleExpCS )
            {
            // InternalMyAtl.g:3814:4: (lv_in_5_0= ruleExpCS )
            // InternalMyAtl.g:3815:5: lv_in_5_0= ruleExpCS
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
    // InternalMyAtl.g:3836:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // InternalMyAtl.g:3836:54: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // InternalMyAtl.g:3837:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
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
    // InternalMyAtl.g:3843:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3849:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // InternalMyAtl.g:3850:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // InternalMyAtl.g:3850:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // InternalMyAtl.g:3851:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // InternalMyAtl.g:3851:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyAtl.g:3852:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyAtl.g:3852:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyAtl.g:3853:5: lv_name_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_46);
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

            // InternalMyAtl.g:3870:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==21) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyAtl.g:3871:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getLetVariableCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyAtl.g:3875:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyAtl.g:3876:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyAtl.g:3876:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyAtl.g:3877:6: lv_ownedType_2_0= ruleTypeExpCS
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
                    							"org.xtext.example.mydsl.MyAtl.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,51,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_2());
            		
            // InternalMyAtl.g:3899:3: ( (lv_initExpression_4_0= ruleExpCS ) )
            // InternalMyAtl.g:3900:4: (lv_initExpression_4_0= ruleExpCS )
            {
            // InternalMyAtl.g:3900:4: (lv_initExpression_4_0= ruleExpCS )
            // InternalMyAtl.g:3901:5: lv_initExpression_4_0= ruleExpCS
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
    // InternalMyAtl.g:3922:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // InternalMyAtl.g:3922:52: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // InternalMyAtl.g:3923:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
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
    // InternalMyAtl.g:3929:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_source_1_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:3935:2: ( (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // InternalMyAtl.g:3936:2: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // InternalMyAtl.g:3936:2: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // InternalMyAtl.g:3937:3: otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyAtl.g:3941:3: ( (lv_source_1_0= ruleExpCS ) )
            // InternalMyAtl.g:3942:4: (lv_source_1_0= ruleExpCS )
            {
            // InternalMyAtl.g:3942:4: (lv_source_1_0= ruleExpCS )
            // InternalMyAtl.g:3943:5: lv_source_1_0= ruleExpCS
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
            						"org.xtext.example.mydsl.MyAtl.ExpCS");
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
    // InternalMyAtl.g:3968:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // InternalMyAtl.g:3968:50: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // InternalMyAtl.g:3969:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
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
    // InternalMyAtl.g:3975:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyAtl.g:3981:2: ( ( () otherlv_1= 'self' ) )
            // InternalMyAtl.g:3982:2: ( () otherlv_1= 'self' )
            {
            // InternalMyAtl.g:3982:2: ( () otherlv_1= 'self' )
            // InternalMyAtl.g:3983:3: () otherlv_1= 'self'
            {
            // InternalMyAtl.g:3983:3: ()
            // InternalMyAtl.g:3984:4: 
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
    // InternalMyAtl.g:3998:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // InternalMyAtl.g:3998:53: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // InternalMyAtl.g:3999:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
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
    // InternalMyAtl.g:4005:1: rulePrimaryExpCS returns [EObject current=null] : (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_LetExpCS_4= ruleLetExpCS | this_IfExpCS_5= ruleIfExpCS | this_NestedExpCS_6= ruleNestedExpCS ) ;
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
            // InternalMyAtl.g:4011:2: ( (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_LetExpCS_4= ruleLetExpCS | this_IfExpCS_5= ruleIfExpCS | this_NestedExpCS_6= ruleNestedExpCS ) )
            // InternalMyAtl.g:4012:2: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_LetExpCS_4= ruleLetExpCS | this_IfExpCS_5= ruleIfExpCS | this_NestedExpCS_6= ruleNestedExpCS )
            {
            // InternalMyAtl.g:4012:2: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_LetExpCS_4= ruleLetExpCS | this_IfExpCS_5= ruleIfExpCS | this_NestedExpCS_6= ruleNestedExpCS )
            int alt58=7;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
                {
                alt58=1;
                }
                break;
            case 85:
                {
                alt58=2;
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
                alt58=3;
                }
                break;
            case 25:
                {
                alt58=4;
                }
                break;
            case 83:
                {
                alt58=5;
                }
                break;
            case 79:
                {
                alt58=6;
                }
                break;
            case 46:
                {
                alt58=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalMyAtl.g:4013:3: this_NavigatingExpCS_0= ruleNavigatingExpCS
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
                    // InternalMyAtl.g:4022:3: this_SelfExpCS_1= ruleSelfExpCS
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
                    // InternalMyAtl.g:4031:3: this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS
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
                    // InternalMyAtl.g:4040:3: this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS
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
                    // InternalMyAtl.g:4049:3: this_LetExpCS_4= ruleLetExpCS
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
                    // InternalMyAtl.g:4058:3: this_IfExpCS_5= ruleIfExpCS
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
                    // InternalMyAtl.g:4067:3: this_NestedExpCS_6= ruleNestedExpCS
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
    // InternalMyAtl.g:4079:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // InternalMyAtl.g:4079:50: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // InternalMyAtl.g:4080:2: iv_ruleNameExpCS= ruleNameExpCS EOF
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
    // InternalMyAtl.g:4086:1: ruleNameExpCS returns [EObject current=null] : ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) ;
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
            // InternalMyAtl.g:4092:2: ( ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) )
            // InternalMyAtl.g:4093:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            {
            // InternalMyAtl.g:4093:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_SIMPLE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==EOF||LA60_1==18||(LA60_1>=21 && LA60_1<=23)||LA60_1==42||(LA60_1>=46 && LA60_1<=47)||LA60_1==51||LA60_1==53||LA60_1==55||LA60_1==57||(LA60_1>=59 && LA60_1<=71)||LA60_1==73||LA60_1==78||(LA60_1>=80 && LA60_1<=82)||LA60_1==84||(LA60_1>=86 && LA60_1<=87)) ) {
                    alt60=2;
                }
                else if ( (LA60_1==77) ) {
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
                    // InternalMyAtl.g:4094:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    {
                    // InternalMyAtl.g:4094:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    // InternalMyAtl.g:4095:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) )
                    {
                    // InternalMyAtl.g:4095:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* )
                    // InternalMyAtl.g:4096:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    {
                    // InternalMyAtl.g:4096:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) )
                    // InternalMyAtl.g:4097:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    {
                    // InternalMyAtl.g:4097:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    // InternalMyAtl.g:4098:7: lv_namespace_0_0= ruleUnrestrictedName
                    {

                    							newCompositeNode(grammarAccess.getNameExpCSAccess().getNamespaceUnrestrictedNameParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_47);
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

                    otherlv_1=(Token)match(input,77,FOLLOW_28); 

                    					newLeafNode(otherlv_1, grammarAccess.getNameExpCSAccess().getColonColonKeyword_0_0_1());
                    				
                    // InternalMyAtl.g:4119:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    loop59:
                    do {
                        int alt59=2;
                        alt59 = dfa59.predict(input);
                        switch (alt59) {
                    	case 1 :
                    	    // InternalMyAtl.g:4120:6: ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::'
                    	    {
                    	    // InternalMyAtl.g:4120:6: ( (lv_namespace_2_0= ruleUnreservedName ) )
                    	    // InternalMyAtl.g:4121:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    {
                    	    // InternalMyAtl.g:4121:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    // InternalMyAtl.g:4122:8: lv_namespace_2_0= ruleUnreservedName
                    	    {

                    	    								newCompositeNode(grammarAccess.getNameExpCSAccess().getNamespaceUnreservedNameParserRuleCall_0_0_2_0_0());
                    	    							
                    	    pushFollow(FOLLOW_47);
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

                    	    otherlv_3=(Token)match(input,77,FOLLOW_28); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getNameExpCSAccess().getColonColonKeyword_0_0_2_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }

                    // InternalMyAtl.g:4145:4: ( (lv_element_4_0= ruleUnreservedName ) )
                    // InternalMyAtl.g:4146:5: (lv_element_4_0= ruleUnreservedName )
                    {
                    // InternalMyAtl.g:4146:5: (lv_element_4_0= ruleUnreservedName )
                    // InternalMyAtl.g:4147:6: lv_element_4_0= ruleUnreservedName
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
                    // InternalMyAtl.g:4166:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    {
                    // InternalMyAtl.g:4166:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    // InternalMyAtl.g:4167:4: (lv_element_5_0= ruleUnrestrictedName )
                    {
                    // InternalMyAtl.g:4167:4: (lv_element_5_0= ruleUnrestrictedName )
                    // InternalMyAtl.g:4168:5: lv_element_5_0= ruleUnrestrictedName
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
    // InternalMyAtl.g:4189:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // InternalMyAtl.g:4189:46: (iv_ruleExpCS= ruleExpCS EOF )
            // InternalMyAtl.g:4190:2: iv_ruleExpCS= ruleExpCS EOF
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
    // InternalMyAtl.g:4196:1: ruleExpCS returns [EObject current=null] : this_InfixedExpCS_0= ruleInfixedExpCS ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixedExpCS_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4202:2: (this_InfixedExpCS_0= ruleInfixedExpCS )
            // InternalMyAtl.g:4203:2: this_InfixedExpCS_0= ruleInfixedExpCS
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
    // InternalMyAtl.g:4214:1: entryRuleInfixedExpCS returns [EObject current=null] : iv_ruleInfixedExpCS= ruleInfixedExpCS EOF ;
    public final EObject entryRuleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixedExpCS = null;


        try {
            // InternalMyAtl.g:4214:53: (iv_ruleInfixedExpCS= ruleInfixedExpCS EOF )
            // InternalMyAtl.g:4215:2: iv_ruleInfixedExpCS= ruleInfixedExpCS EOF
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
    // InternalMyAtl.g:4221:1: ruleInfixedExpCS returns [EObject current=null] : (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) ;
    public final EObject ruleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4227:2: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) )
            // InternalMyAtl.g:4228:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            {
            // InternalMyAtl.g:4228:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            // InternalMyAtl.g:4229:3: this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getInfixedExpCSAccess().getPrefixedExpCSParserRuleCall_0());
            		
            pushFollow(FOLLOW_54);
            this_PrefixedExpCS_0=rulePrefixedExpCS();

            state._fsp--;


            			current = this_PrefixedExpCS_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyAtl.g:4237:3: ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // InternalMyAtl.g:4238:4: () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    {
                    // InternalMyAtl.g:4238:4: ()
                    // InternalMyAtl.g:4239:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMyAtl.g:4245:4: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    int cnt61=0;
                    loop61:
                    do {
                        int alt61=2;
                        alt61 = dfa61.predict(input);
                        switch (alt61) {
                    	case 1 :
                    	    // InternalMyAtl.g:4246:5: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    {
                    	    // InternalMyAtl.g:4246:5: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) )
                    	    // InternalMyAtl.g:4247:6: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    {
                    	    // InternalMyAtl.g:4247:6: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    // InternalMyAtl.g:4248:7: lv_ownedOperator_2_0= ruleBinaryOperatorCS
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
                    	    								"org.xtext.example.mydsl.MyAtl.BinaryOperatorCS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalMyAtl.g:4265:5: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    // InternalMyAtl.g:4266:6: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    {
                    	    // InternalMyAtl.g:4266:6: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    // InternalMyAtl.g:4267:7: lv_ownedExpression_3_0= rulePrefixedExpCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_54);
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
                    	    if ( cnt61 >= 1 ) break loop61;
                                EarlyExitException eee =
                                    new EarlyExitException(61, input);
                                throw eee;
                        }
                        cnt61++;
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
    // InternalMyAtl.g:4290:1: entryRuleBinaryOperatorCS returns [EObject current=null] : iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF ;
    public final EObject entryRuleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperatorCS = null;


        try {
            // InternalMyAtl.g:4290:57: (iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF )
            // InternalMyAtl.g:4291:2: iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF
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
    // InternalMyAtl.g:4297:1: ruleBinaryOperatorCS returns [EObject current=null] : (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) ;
    public final EObject ruleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixOperatorCS_0 = null;

        EObject this_NavigationOperatorCS_1 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4303:2: ( (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) )
            // InternalMyAtl.g:4304:2: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            {
            // InternalMyAtl.g:4304:2: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==51||LA63_0==57||(LA63_0>=59 && LA63_0<=70)) ) {
                alt63=1;
            }
            else if ( (LA63_0==55||LA63_0==71) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalMyAtl.g:4305:3: this_InfixOperatorCS_0= ruleInfixOperatorCS
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
                    // InternalMyAtl.g:4314:3: this_NavigationOperatorCS_1= ruleNavigationOperatorCS
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
    // InternalMyAtl.g:4326:1: entryRuleInfixOperatorCS returns [EObject current=null] : iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF ;
    public final EObject entryRuleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOperatorCS = null;


        try {
            // InternalMyAtl.g:4326:56: (iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF )
            // InternalMyAtl.g:4327:2: iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF
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
    // InternalMyAtl.g:4333:1: ruleInfixOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleInfixOperator ) ) ;
    public final EObject ruleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4339:2: ( ( (lv_name_0_0= ruleInfixOperator ) ) )
            // InternalMyAtl.g:4340:2: ( (lv_name_0_0= ruleInfixOperator ) )
            {
            // InternalMyAtl.g:4340:2: ( (lv_name_0_0= ruleInfixOperator ) )
            // InternalMyAtl.g:4341:3: (lv_name_0_0= ruleInfixOperator )
            {
            // InternalMyAtl.g:4341:3: (lv_name_0_0= ruleInfixOperator )
            // InternalMyAtl.g:4342:4: lv_name_0_0= ruleInfixOperator
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
    // InternalMyAtl.g:4362:1: entryRuleNavigationOperatorCS returns [EObject current=null] : iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF ;
    public final EObject entryRuleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationOperatorCS = null;


        try {
            // InternalMyAtl.g:4362:61: (iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF )
            // InternalMyAtl.g:4363:2: iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF
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
    // InternalMyAtl.g:4369:1: ruleNavigationOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleNavigationOperator ) ) ;
    public final EObject ruleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4375:2: ( ( (lv_name_0_0= ruleNavigationOperator ) ) )
            // InternalMyAtl.g:4376:2: ( (lv_name_0_0= ruleNavigationOperator ) )
            {
            // InternalMyAtl.g:4376:2: ( (lv_name_0_0= ruleNavigationOperator ) )
            // InternalMyAtl.g:4377:3: (lv_name_0_0= ruleNavigationOperator )
            {
            // InternalMyAtl.g:4377:3: (lv_name_0_0= ruleNavigationOperator )
            // InternalMyAtl.g:4378:4: lv_name_0_0= ruleNavigationOperator
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
    // InternalMyAtl.g:4398:1: entryRulePrefixedExpCS returns [EObject current=null] : iv_rulePrefixedExpCS= rulePrefixedExpCS EOF ;
    public final EObject entryRulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedExpCS = null;


        try {
            // InternalMyAtl.g:4398:54: (iv_rulePrefixedExpCS= rulePrefixedExpCS EOF )
            // InternalMyAtl.g:4399:2: iv_rulePrefixedExpCS= rulePrefixedExpCS EOF
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
    // InternalMyAtl.g:4405:1: rulePrefixedExpCS returns [EObject current=null] : (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) ;
    public final EObject rulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4411:2: ( (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) )
            // InternalMyAtl.g:4412:2: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            {
            // InternalMyAtl.g:4412:2: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_SIMPLE_ID && LA65_0<=RULE_BIG_INT)||LA65_0==25||LA65_0==46||LA65_0==59||LA65_0==72||(LA65_0>=74 && LA65_0<=76)||LA65_0==79||LA65_0==83||LA65_0==85) ) {
                alt65=1;
            }
            else if ( ((LA65_0>=57 && LA65_0<=58)) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyAtl.g:4413:3: this_PrimaryExpCS_0= rulePrimaryExpCS
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
                    // InternalMyAtl.g:4422:3: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    {
                    // InternalMyAtl.g:4422:3: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    // InternalMyAtl.g:4423:4: () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    {
                    // InternalMyAtl.g:4423:4: ()
                    // InternalMyAtl.g:4424:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrefixedExpCSAccess().getPrefixExpCSAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMyAtl.g:4430:4: ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( ((LA64_0>=57 && LA64_0<=58)) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalMyAtl.g:4431:5: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    {
                    	    // InternalMyAtl.g:4431:5: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    // InternalMyAtl.g:4432:6: lv_ownedOperator_2_0= ruleUnaryOperatorCS
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
                    	    							"org.xtext.example.mydsl.MyAtl.UnaryOperatorCS");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt64 >= 1 ) break loop64;
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);

                    // InternalMyAtl.g:4449:4: ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    // InternalMyAtl.g:4450:5: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    {
                    // InternalMyAtl.g:4450:5: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    // InternalMyAtl.g:4451:6: lv_ownedExpression_3_0= rulePrimaryExpCS
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
    // InternalMyAtl.g:4473:1: entryRuleUnaryOperatorCS returns [EObject current=null] : iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF ;
    public final EObject entryRuleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperatorCS = null;


        try {
            // InternalMyAtl.g:4473:56: (iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF )
            // InternalMyAtl.g:4474:2: iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF
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
    // InternalMyAtl.g:4480:1: ruleUnaryOperatorCS returns [EObject current=null] : ( (lv_name_0_0= rulePrefixOperator ) ) ;
    public final EObject ruleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4486:2: ( ( (lv_name_0_0= rulePrefixOperator ) ) )
            // InternalMyAtl.g:4487:2: ( (lv_name_0_0= rulePrefixOperator ) )
            {
            // InternalMyAtl.g:4487:2: ( (lv_name_0_0= rulePrefixOperator ) )
            // InternalMyAtl.g:4488:3: (lv_name_0_0= rulePrefixOperator )
            {
            // InternalMyAtl.g:4488:3: (lv_name_0_0= rulePrefixOperator )
            // InternalMyAtl.g:4489:4: lv_name_0_0= rulePrefixOperator
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
    // InternalMyAtl.g:4509:1: entryRuleIndexExpCS returns [EObject current=null] : iv_ruleIndexExpCS= ruleIndexExpCS EOF ;
    public final EObject entryRuleIndexExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexExpCS = null;


        try {
            // InternalMyAtl.g:4509:51: (iv_ruleIndexExpCS= ruleIndexExpCS EOF )
            // InternalMyAtl.g:4510:2: iv_ruleIndexExpCS= ruleIndexExpCS EOF
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
    // InternalMyAtl.g:4516:1: ruleIndexExpCS returns [EObject current=null] : (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? ) ;
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
            // InternalMyAtl.g:4522:2: ( (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? ) )
            // InternalMyAtl.g:4523:2: (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? )
            {
            // InternalMyAtl.g:4523:2: (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? )
            // InternalMyAtl.g:4524:3: this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )?
            {

            			newCompositeNode(grammarAccess.getIndexExpCSAccess().getNameExpCSParserRuleCall_0());
            		
            pushFollow(FOLLOW_55);
            this_NameExpCS_0=ruleNameExpCS();

            state._fsp--;


            			current = this_NameExpCS_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyAtl.g:4532:3: ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==86) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyAtl.g:4533:4: () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )?
                    {
                    // InternalMyAtl.g:4533:4: ()
                    // InternalMyAtl.g:4534:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getIndexExpCSAccess().getIndexExpCSNamedExpAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,86,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    // InternalMyAtl.g:4544:4: ( (lv_firstIndexes_3_0= ruleExpCS ) )
                    // InternalMyAtl.g:4545:5: (lv_firstIndexes_3_0= ruleExpCS )
                    {
                    // InternalMyAtl.g:4545:5: (lv_firstIndexes_3_0= ruleExpCS )
                    // InternalMyAtl.g:4546:6: lv_firstIndexes_3_0= ruleExpCS
                    {

                    						newCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_56);
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

                    // InternalMyAtl.g:4563:4: (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==22) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalMyAtl.g:4564:5: otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_19); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalMyAtl.g:4568:5: ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    // InternalMyAtl.g:4569:6: (lv_firstIndexes_5_0= ruleExpCS )
                    	    {
                    	    // InternalMyAtl.g:4569:6: (lv_firstIndexes_5_0= ruleExpCS )
                    	    // InternalMyAtl.g:4570:7: lv_firstIndexes_5_0= ruleExpCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_56);
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
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,87,FOLLOW_55); 

                    				newLeafNode(otherlv_6, grammarAccess.getIndexExpCSAccess().getRightSquareBracketKeyword_1_4());
                    			
                    // InternalMyAtl.g:4592:4: (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==86) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalMyAtl.g:4593:5: otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']'
                            {
                            otherlv_7=(Token)match(input,86,FOLLOW_19); 

                            					newLeafNode(otherlv_7, grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_5_0());
                            				
                            // InternalMyAtl.g:4597:5: ( (lv_secondIndexes_8_0= ruleExpCS ) )
                            // InternalMyAtl.g:4598:6: (lv_secondIndexes_8_0= ruleExpCS )
                            {
                            // InternalMyAtl.g:4598:6: (lv_secondIndexes_8_0= ruleExpCS )
                            // InternalMyAtl.g:4599:7: lv_secondIndexes_8_0= ruleExpCS
                            {

                            							newCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_1_0());
                            						
                            pushFollow(FOLLOW_56);
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

                            // InternalMyAtl.g:4616:5: (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )*
                            loop67:
                            do {
                                int alt67=2;
                                int LA67_0 = input.LA(1);

                                if ( (LA67_0==22) ) {
                                    alt67=1;
                                }


                                switch (alt67) {
                            	case 1 :
                            	    // InternalMyAtl.g:4617:6: otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    {
                            	    otherlv_9=(Token)match(input,22,FOLLOW_19); 

                            	    						newLeafNode(otherlv_9, grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_5_2_0());
                            	    					
                            	    // InternalMyAtl.g:4621:6: ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    // InternalMyAtl.g:4622:7: (lv_secondIndexes_10_0= ruleExpCS )
                            	    {
                            	    // InternalMyAtl.g:4622:7: (lv_secondIndexes_10_0= ruleExpCS )
                            	    // InternalMyAtl.g:4623:8: lv_secondIndexes_10_0= ruleExpCS
                            	    {

                            	    								newCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_56);
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
                            	    break loop67;
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
    // InternalMyAtl.g:4651:1: entryRuleNavigatingExpCS_Base returns [EObject current=null] : iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF ;
    public final EObject entryRuleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS_Base = null;


        try {
            // InternalMyAtl.g:4651:61: (iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF )
            // InternalMyAtl.g:4652:2: iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF
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
    // InternalMyAtl.g:4658:1: ruleNavigatingExpCS_Base returns [EObject current=null] : this_IndexExpCS_0= ruleIndexExpCS ;
    public final EObject ruleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject this_IndexExpCS_0 = null;



        	enterRule();

        try {
            // InternalMyAtl.g:4664:2: (this_IndexExpCS_0= ruleIndexExpCS )
            // InternalMyAtl.g:4665:2: this_IndexExpCS_0= ruleIndexExpCS
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
    // InternalMyAtl.g:4676:1: entryRuleNavigatingExpCS returns [EObject current=null] : iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF ;
    public final EObject entryRuleNavigatingExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS = null;


        try {
            // InternalMyAtl.g:4676:56: (iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF )
            // InternalMyAtl.g:4677:2: iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF
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
    // InternalMyAtl.g:4683:1: ruleNavigatingExpCS returns [EObject current=null] : (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? ) ;
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
            // InternalMyAtl.g:4689:2: ( (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? ) )
            // InternalMyAtl.g:4690:2: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? )
            {
            // InternalMyAtl.g:4690:2: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? )
            // InternalMyAtl.g:4691:3: this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )?
            {

            			newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCS_BaseParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_NavigatingExpCS_Base_0=ruleNavigatingExpCS_Base();

            state._fsp--;


            			current = this_NavigatingExpCS_Base_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyAtl.g:4699:3: ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==46) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalMyAtl.g:4700:4: () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')'
                    {
                    // InternalMyAtl.g:4700:4: ()
                    // InternalMyAtl.g:4701:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCSNamedExpAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,46,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingExpCSAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalMyAtl.g:4711:4: ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( ((LA75_0>=RULE_SIMPLE_ID && LA75_0<=RULE_BIG_INT)||LA75_0==25||LA75_0==46||(LA75_0>=57 && LA75_0<=59)||LA75_0==72||(LA75_0>=74 && LA75_0<=76)||LA75_0==79||LA75_0==83||LA75_0==85) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalMyAtl.g:4712:5: ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )?
                            {
                            // InternalMyAtl.g:4712:5: ( (lv_argument_3_0= ruleNavigatingArgCS ) )
                            // InternalMyAtl.g:4713:6: (lv_argument_3_0= ruleNavigatingArgCS )
                            {
                            // InternalMyAtl.g:4713:6: (lv_argument_3_0= ruleNavigatingArgCS )
                            // InternalMyAtl.g:4714:7: lv_argument_3_0= ruleNavigatingArgCS
                            {

                            							newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingArgCSParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_57);
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

                            // InternalMyAtl.g:4731:5: ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )*
                            loop70:
                            do {
                                int alt70=2;
                                int LA70_0 = input.LA(1);

                                if ( (LA70_0==22) ) {
                                    alt70=1;
                                }


                                switch (alt70) {
                            	case 1 :
                            	    // InternalMyAtl.g:4732:6: (lv_argument_4_0= ruleNavigatingCommaArgCS )
                            	    {
                            	    // InternalMyAtl.g:4732:6: (lv_argument_4_0= ruleNavigatingCommaArgCS )
                            	    // InternalMyAtl.g:4733:7: lv_argument_4_0= ruleNavigatingCommaArgCS
                            	    {

                            	    							newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_57);
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
                            	    break loop70;
                                }
                            } while (true);

                            // InternalMyAtl.g:4750:5: ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )?
                            int alt72=2;
                            int LA72_0 = input.LA(1);

                            if ( (LA72_0==18) ) {
                                alt72=1;
                            }
                            switch (alt72) {
                                case 1 :
                                    // InternalMyAtl.g:4751:6: ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )*
                                    {
                                    // InternalMyAtl.g:4751:6: ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) )
                                    // InternalMyAtl.g:4752:7: (lv_argument_5_0= ruleNavigatingSemiArgCS )
                                    {
                                    // InternalMyAtl.g:4752:7: (lv_argument_5_0= ruleNavigatingSemiArgCS )
                                    // InternalMyAtl.g:4753:8: lv_argument_5_0= ruleNavigatingSemiArgCS
                                    {

                                    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingSemiArgCSParserRuleCall_1_2_2_0_0());
                                    							
                                    pushFollow(FOLLOW_58);
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

                                    // InternalMyAtl.g:4770:6: ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )*
                                    loop71:
                                    do {
                                        int alt71=2;
                                        int LA71_0 = input.LA(1);

                                        if ( (LA71_0==22) ) {
                                            alt71=1;
                                        }


                                        switch (alt71) {
                                    	case 1 :
                                    	    // InternalMyAtl.g:4771:7: (lv_argument_6_0= ruleNavigatingCommaArgCS )
                                    	    {
                                    	    // InternalMyAtl.g:4771:7: (lv_argument_6_0= ruleNavigatingCommaArgCS )
                                    	    // InternalMyAtl.g:4772:8: lv_argument_6_0= ruleNavigatingCommaArgCS
                                    	    {

                                    	    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_2_1_0());
                                    	    							
                                    	    pushFollow(FOLLOW_58);
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
                                    	    break loop71;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            // InternalMyAtl.g:4790:5: ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )?
                            int alt74=2;
                            int LA74_0 = input.LA(1);

                            if ( (LA74_0==78) ) {
                                alt74=1;
                            }
                            switch (alt74) {
                                case 1 :
                                    // InternalMyAtl.g:4791:6: ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )*
                                    {
                                    // InternalMyAtl.g:4791:6: ( (lv_argument_7_0= ruleNavigatingBarArgCS ) )
                                    // InternalMyAtl.g:4792:7: (lv_argument_7_0= ruleNavigatingBarArgCS )
                                    {
                                    // InternalMyAtl.g:4792:7: (lv_argument_7_0= ruleNavigatingBarArgCS )
                                    // InternalMyAtl.g:4793:8: lv_argument_7_0= ruleNavigatingBarArgCS
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
                                    									"org.xtext.example.mydsl.MyAtl.NavigatingBarArgCS");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    // InternalMyAtl.g:4810:6: ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )*
                                    loop73:
                                    do {
                                        int alt73=2;
                                        int LA73_0 = input.LA(1);

                                        if ( (LA73_0==22) ) {
                                            alt73=1;
                                        }


                                        switch (alt73) {
                                    	case 1 :
                                    	    // InternalMyAtl.g:4811:7: (lv_argument_8_0= ruleNavigatingCommaArgCS )
                                    	    {
                                    	    // InternalMyAtl.g:4811:7: (lv_argument_8_0= ruleNavigatingCommaArgCS )
                                    	    // InternalMyAtl.g:4812:8: lv_argument_8_0= ruleNavigatingCommaArgCS
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
                                    	    									"org.xtext.example.mydsl.MyAtl.NavigatingCommaArgCS");
                                    	    								afterParserOrEnumRuleCall();
                                    	    							

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop73;
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


    protected DFA33 dfa33 = new DFA33(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA61 dfa61 = new DFA61(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\1\3\30\uffff";
    static final String dfa_3s = "\1\22\1\4\2\uffff\1\56\1\50\1\uffff\1\4\1\uffff\17\56\1\4";
    static final String dfa_4s = "\1\116\1\125\2\uffff\1\126\1\110\1\uffff\1\46\1\uffff\17\126\1\46";
    static final String dfa_5s = "\2\uffff\1\2\1\3\2\uffff\1\1\1\uffff\1\1\20\uffff";
    static final String dfa_6s = "\31\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\3\uffff\1\3\22\uffff\4\3\1\uffff\1\1\1\3\3\uffff\1\3\12\uffff\1\3\1\2\16\uffff\1\3",
            "\1\4\2\3\22\uffff\1\5\15\6\7\uffff\2\3\11\uffff\3\3\14\uffff\1\3\1\uffff\3\3\2\uffff\1\3\3\uffff\1\3\1\uffff\1\3",
            "",
            "",
            "\1\3\1\10\3\uffff\1\3\2\uffff\2\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\7\10\uffff\1\3",
            "\1\3\5\uffff\1\10\20\uffff\1\10\10\uffff\1\10",
            "",
            "\1\11\24\uffff\1\27\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\12\1\13\1\14\1\15\1\16",
            "",
            "\1\3\1\10\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\10\uffff\1\3",
            "\1\3\1\10\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\10\uffff\1\3",
            "\1\3\1\10\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\10\uffff\1\3",
            "\1\3\1\10\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\10\uffff\1\3",
            "\1\3\1\10\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\10\uffff\1\3",
            "\1\3\1\10\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\10\uffff\1\3",
            "\1\3\1\10\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\10\uffff\1\3",
            "\1\3\1\10\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\10\uffff\1\3",
            "\1\3\1\10\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\10\uffff\1\3",
            "\1\3\1\10\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\10\uffff\1\3",
            "\1\3\1\10\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\10\uffff\1\3",
            "\1\3\1\10\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\10\uffff\1\3",
            "\1\3\1\10\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\10\uffff\1\3",
            "\1\3\1\10\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\10\uffff\1\3",
            "\1\3\1\10\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\1\uffff\15\3\5\uffff\1\30\10\uffff\1\3",
            "\1\11\24\uffff\1\27\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\12\1\13\1\14\1\15\1\16"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2215:3: ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )?";
        }
    }
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\1\uffff\17\21\2\uffff";
    static final String dfa_10s = "\1\4\17\22\2\uffff";
    static final String dfa_11s = "\1\46\17\116\2\uffff";
    static final String dfa_12s = "\20\uffff\1\1\1\2";
    static final String dfa_13s = "\22\uffff}>";
    static final String[] dfa_14s = {
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 3129:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*";
        }
    }
    static final String dfa_15s = "\1\46\17\127\2\uffff";
    static final String[] dfa_16s = {
            "\1\1\24\uffff\1\17\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\2\1\3\1\4\1\5\1\6",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "\1\21\2\uffff\3\21\22\uffff\1\21\3\uffff\2\21\3\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\15\21\1\uffff\1\21\3\uffff\1\20\1\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21",
            "",
            ""
    };
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[][] dfa_16 = unpackEncodedStringArray(dfa_16s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_15;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "()* loopback of 4119:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*";
        }
    }
    static final String dfa_17s = "\1\21\21\uffff";
    static final String dfa_18s = "\1\22\21\uffff";
    static final String dfa_19s = "\1\127\21\uffff";
    static final String dfa_20s = "\1\uffff\20\1\1\2";
    static final String[] dfa_21s = {
            "\1\21\2\uffff\2\21\23\uffff\1\21\4\uffff\1\21\3\uffff\1\11\1\uffff\1\21\1\uffff\1\17\1\uffff\1\4\1\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\12\1\13\1\14\1\15\1\16\1\20\1\uffff\1\21\4\uffff\1\21\1\uffff\3\21\1\uffff\1\21\2\uffff\1\21",
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
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_8;
            this.eof = dfa_17;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_13;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "4237:3: ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?";
        }
    }
    static final String dfa_22s = "\1\1\21\uffff";
    static final String dfa_23s = "\1\uffff\1\2\20\1";
    static final String[] dfa_24s = {
            "\1\1\2\uffff\2\1\23\uffff\1\1\4\uffff\1\1\3\uffff\1\3\1\uffff\1\1\1\uffff\1\2\1\uffff\1\7\1\uffff\1\4\1\5\1\6\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\uffff\1\1\4\uffff\1\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1",
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
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_8;
            this.eof = dfa_22;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_23;
            this.special = dfa_13;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()+ loopback of 4245:4: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+";
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
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0006000000000010L});
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
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x8000400000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000400000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x4000000000400000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000200002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000400000L,0x0000000000100000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xFA88000000000002L,0x00000000000000FFL});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000400000L,0x0000000000800000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000800000440000L,0x0000000000004000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000800000400000L,0x0000000000004000L});

}