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
import org.xtext.example.mydsl.services.MyOclGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyOclParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SIMPLE_ID", "RULE_UNQUOTED_STRING", "RULE_SINGLE_QUOTED_STRING", "RULE_BIG_INT", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_DOCUMENTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "RULE_ID", "RULE_INT", "RULE_STRING", "'context'", "'inv'", "'^'", "'^^'", "'('", "')'", "':'", "'static'", "'def'", "','", "'='", "'import'", "'include'", "'library'", "'::*'", "'pre'", "'post'", "'body'", "'package'", "'endpackage'", "'derive'", "'init'", "'::'", "'<'", "'>'", "'?'", "'-'", "'not'", "'*'", "'/'", "'+'", "'>='", "'<='", "'<>'", "'and'", "'or'", "'xor'", "'implies'", "'.'", "'->'", "'Tuple'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'true'", "'{'", "'}'", "'..'", "'false'", "'invalid'", "'null'", "'|'", "';'", "'if'", "'then'", "'else'", "'endif'", "'let'", "'in'", "'self'", "'['", "']'"
    };
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
    public static final int RULE_UNQUOTED_STRING=5;
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
    public static final int RULE_SINGLE_QUOTED_STRING=6;
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


        public InternalMyOclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyOclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyOclParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyOcl.g"; }



     	private MyOclGrammarAccess grammarAccess;

        public InternalMyOclParser(TokenStream input, MyOclGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CompleteOCLDocumentCS";
       	}

       	@Override
       	protected MyOclGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCompleteOCLDocumentCS"
    // InternalMyOcl.g:64:1: entryRuleCompleteOCLDocumentCS returns [EObject current=null] : iv_ruleCompleteOCLDocumentCS= ruleCompleteOCLDocumentCS EOF ;
    public final EObject entryRuleCompleteOCLDocumentCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompleteOCLDocumentCS = null;


        try {
            // InternalMyOcl.g:64:62: (iv_ruleCompleteOCLDocumentCS= ruleCompleteOCLDocumentCS EOF )
            // InternalMyOcl.g:65:2: iv_ruleCompleteOCLDocumentCS= ruleCompleteOCLDocumentCS EOF
            {
             newCompositeNode(grammarAccess.getCompleteOCLDocumentCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompleteOCLDocumentCS=ruleCompleteOCLDocumentCS();

            state._fsp--;

             current =iv_ruleCompleteOCLDocumentCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompleteOCLDocumentCS"


    // $ANTLR start "ruleCompleteOCLDocumentCS"
    // InternalMyOcl.g:71:1: ruleCompleteOCLDocumentCS returns [EObject current=null] : ( ( (lv_ownedImports_0_0= ruleImportCS ) )* ( ( (lv_ownedPackages_1_0= rulePackageDeclarationCS ) ) | ( (lv_ownedContexts_2_0= ruleContextDeclCS ) ) )* ) ;
    public final EObject ruleCompleteOCLDocumentCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedImports_0_0 = null;

        EObject lv_ownedPackages_1_0 = null;

        EObject lv_ownedContexts_2_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:77:2: ( ( ( (lv_ownedImports_0_0= ruleImportCS ) )* ( ( (lv_ownedPackages_1_0= rulePackageDeclarationCS ) ) | ( (lv_ownedContexts_2_0= ruleContextDeclCS ) ) )* ) )
            // InternalMyOcl.g:78:2: ( ( (lv_ownedImports_0_0= ruleImportCS ) )* ( ( (lv_ownedPackages_1_0= rulePackageDeclarationCS ) ) | ( (lv_ownedContexts_2_0= ruleContextDeclCS ) ) )* )
            {
            // InternalMyOcl.g:78:2: ( ( (lv_ownedImports_0_0= ruleImportCS ) )* ( ( (lv_ownedPackages_1_0= rulePackageDeclarationCS ) ) | ( (lv_ownedContexts_2_0= ruleContextDeclCS ) ) )* )
            // InternalMyOcl.g:79:3: ( (lv_ownedImports_0_0= ruleImportCS ) )* ( ( (lv_ownedPackages_1_0= rulePackageDeclarationCS ) ) | ( (lv_ownedContexts_2_0= ruleContextDeclCS ) ) )*
            {
            // InternalMyOcl.g:79:3: ( (lv_ownedImports_0_0= ruleImportCS ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=29 && LA1_0<=31)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyOcl.g:80:4: (lv_ownedImports_0_0= ruleImportCS )
            	    {
            	    // InternalMyOcl.g:80:4: (lv_ownedImports_0_0= ruleImportCS )
            	    // InternalMyOcl.g:81:5: lv_ownedImports_0_0= ruleImportCS
            	    {

            	    					newCompositeNode(grammarAccess.getCompleteOCLDocumentCSAccess().getOwnedImportsImportCSParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_ownedImports_0_0=ruleImportCS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompleteOCLDocumentCSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedImports",
            	    						lv_ownedImports_0_0,
            	    						"org.xtext.example.mydsl.MyOcl.ImportCS");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyOcl.g:98:3: ( ( (lv_ownedPackages_1_0= rulePackageDeclarationCS ) ) | ( (lv_ownedContexts_2_0= ruleContextDeclCS ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==36) ) {
                    alt2=1;
                }
                else if ( (LA2_0==18) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyOcl.g:99:4: ( (lv_ownedPackages_1_0= rulePackageDeclarationCS ) )
            	    {
            	    // InternalMyOcl.g:99:4: ( (lv_ownedPackages_1_0= rulePackageDeclarationCS ) )
            	    // InternalMyOcl.g:100:5: (lv_ownedPackages_1_0= rulePackageDeclarationCS )
            	    {
            	    // InternalMyOcl.g:100:5: (lv_ownedPackages_1_0= rulePackageDeclarationCS )
            	    // InternalMyOcl.g:101:6: lv_ownedPackages_1_0= rulePackageDeclarationCS
            	    {

            	    						newCompositeNode(grammarAccess.getCompleteOCLDocumentCSAccess().getOwnedPackagesPackageDeclarationCSParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_ownedPackages_1_0=rulePackageDeclarationCS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompleteOCLDocumentCSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedPackages",
            	    							lv_ownedPackages_1_0,
            	    							"org.xtext.example.mydsl.MyOcl.PackageDeclarationCS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyOcl.g:119:4: ( (lv_ownedContexts_2_0= ruleContextDeclCS ) )
            	    {
            	    // InternalMyOcl.g:119:4: ( (lv_ownedContexts_2_0= ruleContextDeclCS ) )
            	    // InternalMyOcl.g:120:5: (lv_ownedContexts_2_0= ruleContextDeclCS )
            	    {
            	    // InternalMyOcl.g:120:5: (lv_ownedContexts_2_0= ruleContextDeclCS )
            	    // InternalMyOcl.g:121:6: lv_ownedContexts_2_0= ruleContextDeclCS
            	    {

            	    						newCompositeNode(grammarAccess.getCompleteOCLDocumentCSAccess().getOwnedContextsContextDeclCSParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_ownedContexts_2_0=ruleContextDeclCS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompleteOCLDocumentCSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedContexts",
            	    							lv_ownedContexts_2_0,
            	    							"org.xtext.example.mydsl.MyOcl.ContextDeclCS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleCompleteOCLDocumentCS"


    // $ANTLR start "entryRuleClassifierContextDeclCS"
    // InternalMyOcl.g:143:1: entryRuleClassifierContextDeclCS returns [EObject current=null] : iv_ruleClassifierContextDeclCS= ruleClassifierContextDeclCS EOF ;
    public final EObject entryRuleClassifierContextDeclCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierContextDeclCS = null;


        try {
            // InternalMyOcl.g:143:64: (iv_ruleClassifierContextDeclCS= ruleClassifierContextDeclCS EOF )
            // InternalMyOcl.g:144:2: iv_ruleClassifierContextDeclCS= ruleClassifierContextDeclCS EOF
            {
             newCompositeNode(grammarAccess.getClassifierContextDeclCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassifierContextDeclCS=ruleClassifierContextDeclCS();

            state._fsp--;

             current =iv_ruleClassifierContextDeclCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassifierContextDeclCS"


    // $ANTLR start "ruleClassifierContextDeclCS"
    // InternalMyOcl.g:150:1: ruleClassifierContextDeclCS returns [EObject current=null] : (otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_selfName_2_0= ruleUnrestrictedName ) )? ( (lv_ownedPathName_3_0= rulepathNameCS ) ) ( (otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) ) ) | ( (lv_ownedDefinitions_6_0= ruleDefCS ) ) )+ ) ;
    public final EObject ruleClassifierContextDeclCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_ownedSignature_1_0 = null;

        AntlrDatatypeRuleToken lv_selfName_2_0 = null;

        EObject lv_ownedPathName_3_0 = null;

        EObject lv_ownedInvariants_5_0 = null;

        EObject lv_ownedDefinitions_6_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:156:2: ( (otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_selfName_2_0= ruleUnrestrictedName ) )? ( (lv_ownedPathName_3_0= rulepathNameCS ) ) ( (otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) ) ) | ( (lv_ownedDefinitions_6_0= ruleDefCS ) ) )+ ) )
            // InternalMyOcl.g:157:2: (otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_selfName_2_0= ruleUnrestrictedName ) )? ( (lv_ownedPathName_3_0= rulepathNameCS ) ) ( (otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) ) ) | ( (lv_ownedDefinitions_6_0= ruleDefCS ) ) )+ )
            {
            // InternalMyOcl.g:157:2: (otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_selfName_2_0= ruleUnrestrictedName ) )? ( (lv_ownedPathName_3_0= rulepathNameCS ) ) ( (otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) ) ) | ( (lv_ownedDefinitions_6_0= ruleDefCS ) ) )+ )
            // InternalMyOcl.g:158:3: otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_selfName_2_0= ruleUnrestrictedName ) )? ( (lv_ownedPathName_3_0= rulepathNameCS ) ) ( (otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) ) ) | ( (lv_ownedDefinitions_6_0= ruleDefCS ) ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getClassifierContextDeclCSAccess().getContextKeyword_0());
            		
            // InternalMyOcl.g:162:3: ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22||LA3_0==41) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyOcl.g:163:4: (lv_ownedSignature_1_0= ruleTemplateSignatureCS )
                    {
                    // InternalMyOcl.g:163:4: (lv_ownedSignature_1_0= ruleTemplateSignatureCS )
                    // InternalMyOcl.g:164:5: lv_ownedSignature_1_0= ruleTemplateSignatureCS
                    {

                    					newCompositeNode(grammarAccess.getClassifierContextDeclCSAccess().getOwnedSignatureTemplateSignatureCSParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_ownedSignature_1_0=ruleTemplateSignatureCS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassifierContextDeclCSRule());
                    					}
                    					set(
                    						current,
                    						"ownedSignature",
                    						lv_ownedSignature_1_0,
                    						"org.xtext.example.mydsl.MyOcl.TemplateSignatureCS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyOcl.g:181:3: ( (lv_selfName_2_0= ruleUnrestrictedName ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SIMPLE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_SIMPLE_ID) ) {
                    alt4=1;
                }
            }
            else if ( ((LA4_0>=29 && LA4_0<=31)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyOcl.g:182:4: (lv_selfName_2_0= ruleUnrestrictedName )
                    {
                    // InternalMyOcl.g:182:4: (lv_selfName_2_0= ruleUnrestrictedName )
                    // InternalMyOcl.g:183:5: lv_selfName_2_0= ruleUnrestrictedName
                    {

                    					newCompositeNode(grammarAccess.getClassifierContextDeclCSAccess().getSelfNameUnrestrictedNameParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_selfName_2_0=ruleUnrestrictedName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassifierContextDeclCSRule());
                    					}
                    					set(
                    						current,
                    						"selfName",
                    						lv_selfName_2_0,
                    						"org.xtext.example.mydsl.MyOcl.UnrestrictedName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyOcl.g:200:3: ( (lv_ownedPathName_3_0= rulepathNameCS ) )
            // InternalMyOcl.g:201:4: (lv_ownedPathName_3_0= rulepathNameCS )
            {
            // InternalMyOcl.g:201:4: (lv_ownedPathName_3_0= rulepathNameCS )
            // InternalMyOcl.g:202:5: lv_ownedPathName_3_0= rulepathNameCS
            {

            					newCompositeNode(grammarAccess.getClassifierContextDeclCSAccess().getOwnedPathNamePathNameCSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_ownedPathName_3_0=rulepathNameCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassifierContextDeclCSRule());
            					}
            					set(
            						current,
            						"ownedPathName",
            						lv_ownedPathName_3_0,
            						"org.xtext.example.mydsl.MyOcl.pathNameCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyOcl.g:219:3: ( (otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) ) ) | ( (lv_ownedDefinitions_6_0= ruleDefCS ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }
                else if ( ((LA5_0>=25 && LA5_0<=26)) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyOcl.g:220:4: (otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) ) )
            	    {
            	    // InternalMyOcl.g:220:4: (otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) ) )
            	    // InternalMyOcl.g:221:5: otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_7); 

            	    					newLeafNode(otherlv_4, grammarAccess.getClassifierContextDeclCSAccess().getInvKeyword_4_0_0());
            	    				
            	    // InternalMyOcl.g:225:5: ( (lv_ownedInvariants_5_0= ruleConstraintCS ) )
            	    // InternalMyOcl.g:226:6: (lv_ownedInvariants_5_0= ruleConstraintCS )
            	    {
            	    // InternalMyOcl.g:226:6: (lv_ownedInvariants_5_0= ruleConstraintCS )
            	    // InternalMyOcl.g:227:7: lv_ownedInvariants_5_0= ruleConstraintCS
            	    {

            	    							newCompositeNode(grammarAccess.getClassifierContextDeclCSAccess().getOwnedInvariantsConstraintCSParserRuleCall_4_0_1_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_ownedInvariants_5_0=ruleConstraintCS();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getClassifierContextDeclCSRule());
            	    							}
            	    							add(
            	    								current,
            	    								"ownedInvariants",
            	    								lv_ownedInvariants_5_0,
            	    								"org.xtext.example.mydsl.MyOcl.ConstraintCS");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyOcl.g:246:4: ( (lv_ownedDefinitions_6_0= ruleDefCS ) )
            	    {
            	    // InternalMyOcl.g:246:4: ( (lv_ownedDefinitions_6_0= ruleDefCS ) )
            	    // InternalMyOcl.g:247:5: (lv_ownedDefinitions_6_0= ruleDefCS )
            	    {
            	    // InternalMyOcl.g:247:5: (lv_ownedDefinitions_6_0= ruleDefCS )
            	    // InternalMyOcl.g:248:6: lv_ownedDefinitions_6_0= ruleDefCS
            	    {

            	    						newCompositeNode(grammarAccess.getClassifierContextDeclCSAccess().getOwnedDefinitionsDefCSParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_ownedDefinitions_6_0=ruleDefCS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassifierContextDeclCSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedDefinitions",
            	    							lv_ownedDefinitions_6_0,
            	    							"org.xtext.example.mydsl.MyOcl.DefCS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


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


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassifierContextDeclCS"


    // $ANTLR start "entryRuleCompleteOCLNavigationOperatorName"
    // InternalMyOcl.g:270:1: entryRuleCompleteOCLNavigationOperatorName returns [String current=null] : iv_ruleCompleteOCLNavigationOperatorName= ruleCompleteOCLNavigationOperatorName EOF ;
    public final String entryRuleCompleteOCLNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompleteOCLNavigationOperatorName = null;


        try {
            // InternalMyOcl.g:270:73: (iv_ruleCompleteOCLNavigationOperatorName= ruleCompleteOCLNavigationOperatorName EOF )
            // InternalMyOcl.g:271:2: iv_ruleCompleteOCLNavigationOperatorName= ruleCompleteOCLNavigationOperatorName EOF
            {
             newCompositeNode(grammarAccess.getCompleteOCLNavigationOperatorNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompleteOCLNavigationOperatorName=ruleCompleteOCLNavigationOperatorName();

            state._fsp--;

             current =iv_ruleCompleteOCLNavigationOperatorName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompleteOCLNavigationOperatorName"


    // $ANTLR start "ruleCompleteOCLNavigationOperatorName"
    // InternalMyOcl.g:277:1: ruleCompleteOCLNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '^' | kw= '^^' ) ;
    public final AntlrDatatypeRuleToken ruleCompleteOCLNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyOcl.g:283:2: ( (kw= '^' | kw= '^^' ) )
            // InternalMyOcl.g:284:2: (kw= '^' | kw= '^^' )
            {
            // InternalMyOcl.g:284:2: (kw= '^' | kw= '^^' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyOcl.g:285:3: kw= '^'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompleteOCLNavigationOperatorNameAccess().getCircumflexAccentKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyOcl.g:291:3: kw= '^^'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompleteOCLNavigationOperatorNameAccess().getCircumflexAccentCircumflexAccentKeyword_1());
                    		

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
    // $ANTLR end "ruleCompleteOCLNavigationOperatorName"


    // $ANTLR start "entryRuleConstraintCS"
    // InternalMyOcl.g:300:1: entryRuleConstraintCS returns [EObject current=null] : iv_ruleConstraintCS= ruleConstraintCS EOF ;
    public final EObject entryRuleConstraintCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintCS = null;


        try {
            // InternalMyOcl.g:300:53: (iv_ruleConstraintCS= ruleConstraintCS EOF )
            // InternalMyOcl.g:301:2: iv_ruleConstraintCS= ruleConstraintCS EOF
            {
             newCompositeNode(grammarAccess.getConstraintCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintCS=ruleConstraintCS();

            state._fsp--;

             current =iv_ruleConstraintCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintCS"


    // $ANTLR start "ruleConstraintCS"
    // InternalMyOcl.g:307:1: ruleConstraintCS returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')' )? )? otherlv_4= ':' ( (lv_ownedSpecification_5_0= ruleSpecificationCS ) ) ) ;
    public final EObject ruleConstraintCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedMessageSpecification_2_0 = null;

        EObject lv_ownedSpecification_5_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:313:2: ( ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')' )? )? otherlv_4= ':' ( (lv_ownedSpecification_5_0= ruleSpecificationCS ) ) ) )
            // InternalMyOcl.g:314:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')' )? )? otherlv_4= ':' ( (lv_ownedSpecification_5_0= ruleSpecificationCS ) ) )
            {
            // InternalMyOcl.g:314:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')' )? )? otherlv_4= ':' ( (lv_ownedSpecification_5_0= ruleSpecificationCS ) ) )
            // InternalMyOcl.g:315:3: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')' )? )? otherlv_4= ':' ( (lv_ownedSpecification_5_0= ruleSpecificationCS ) )
            {
            // InternalMyOcl.g:315:3: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')' )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_SIMPLE_ID||(LA8_0>=29 && LA8_0<=31)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyOcl.g:316:4: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')' )?
                    {
                    // InternalMyOcl.g:316:4: ( (lv_name_0_0= ruleUnrestrictedName ) )
                    // InternalMyOcl.g:317:5: (lv_name_0_0= ruleUnrestrictedName )
                    {
                    // InternalMyOcl.g:317:5: (lv_name_0_0= ruleUnrestrictedName )
                    // InternalMyOcl.g:318:6: lv_name_0_0= ruleUnrestrictedName
                    {

                    						newCompositeNode(grammarAccess.getConstraintCSAccess().getNameUnrestrictedNameParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_name_0_0=ruleUnrestrictedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintCSRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.xtext.example.mydsl.MyOcl.UnrestrictedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyOcl.g:335:4: (otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==22) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyOcl.g:336:5: otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')'
                            {
                            otherlv_1=(Token)match(input,22,FOLLOW_10); 

                            					newLeafNode(otherlv_1, grammarAccess.getConstraintCSAccess().getLeftParenthesisKeyword_0_1_0());
                            				
                            // InternalMyOcl.g:340:5: ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) )
                            // InternalMyOcl.g:341:6: (lv_ownedMessageSpecification_2_0= ruleSpecificationCS )
                            {
                            // InternalMyOcl.g:341:6: (lv_ownedMessageSpecification_2_0= ruleSpecificationCS )
                            // InternalMyOcl.g:342:7: lv_ownedMessageSpecification_2_0= ruleSpecificationCS
                            {

                            							newCompositeNode(grammarAccess.getConstraintCSAccess().getOwnedMessageSpecificationSpecificationCSParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_11);
                            lv_ownedMessageSpecification_2_0=ruleSpecificationCS();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getConstraintCSRule());
                            							}
                            							set(
                            								current,
                            								"ownedMessageSpecification",
                            								lv_ownedMessageSpecification_2_0,
                            								"org.xtext.example.mydsl.MyOcl.SpecificationCS");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_3=(Token)match(input,23,FOLLOW_12); 

                            					newLeafNode(otherlv_3, grammarAccess.getConstraintCSAccess().getRightParenthesisKeyword_0_1_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintCSAccess().getColonKeyword_1());
            		
            // InternalMyOcl.g:369:3: ( (lv_ownedSpecification_5_0= ruleSpecificationCS ) )
            // InternalMyOcl.g:370:4: (lv_ownedSpecification_5_0= ruleSpecificationCS )
            {
            // InternalMyOcl.g:370:4: (lv_ownedSpecification_5_0= ruleSpecificationCS )
            // InternalMyOcl.g:371:5: lv_ownedSpecification_5_0= ruleSpecificationCS
            {

            					newCompositeNode(grammarAccess.getConstraintCSAccess().getOwnedSpecificationSpecificationCSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedSpecification_5_0=ruleSpecificationCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintCSRule());
            					}
            					set(
            						current,
            						"ownedSpecification",
            						lv_ownedSpecification_5_0,
            						"org.xtext.example.mydsl.MyOcl.SpecificationCS");
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
    // $ANTLR end "ruleConstraintCS"


    // $ANTLR start "entryRuleContextDeclCS"
    // InternalMyOcl.g:392:1: entryRuleContextDeclCS returns [EObject current=null] : iv_ruleContextDeclCS= ruleContextDeclCS EOF ;
    public final EObject entryRuleContextDeclCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextDeclCS = null;


        try {
            // InternalMyOcl.g:392:54: (iv_ruleContextDeclCS= ruleContextDeclCS EOF )
            // InternalMyOcl.g:393:2: iv_ruleContextDeclCS= ruleContextDeclCS EOF
            {
             newCompositeNode(grammarAccess.getContextDeclCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextDeclCS=ruleContextDeclCS();

            state._fsp--;

             current =iv_ruleContextDeclCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContextDeclCS"


    // $ANTLR start "ruleContextDeclCS"
    // InternalMyOcl.g:399:1: ruleContextDeclCS returns [EObject current=null] : (this_PropertyContextDeclCS_0= rulePropertyContextDeclCS | this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS | this_OperationContextDeclCS_2= ruleOperationContextDeclCS ) ;
    public final EObject ruleContextDeclCS() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyContextDeclCS_0 = null;

        EObject this_ClassifierContextDeclCS_1 = null;

        EObject this_OperationContextDeclCS_2 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:405:2: ( (this_PropertyContextDeclCS_0= rulePropertyContextDeclCS | this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS | this_OperationContextDeclCS_2= ruleOperationContextDeclCS ) )
            // InternalMyOcl.g:406:2: (this_PropertyContextDeclCS_0= rulePropertyContextDeclCS | this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS | this_OperationContextDeclCS_2= ruleOperationContextDeclCS )
            {
            // InternalMyOcl.g:406:2: (this_PropertyContextDeclCS_0= rulePropertyContextDeclCS | this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS | this_OperationContextDeclCS_2= ruleOperationContextDeclCS )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalMyOcl.g:407:3: this_PropertyContextDeclCS_0= rulePropertyContextDeclCS
                    {

                    			newCompositeNode(grammarAccess.getContextDeclCSAccess().getPropertyContextDeclCSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertyContextDeclCS_0=rulePropertyContextDeclCS();

                    state._fsp--;


                    			current = this_PropertyContextDeclCS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyOcl.g:416:3: this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS
                    {

                    			newCompositeNode(grammarAccess.getContextDeclCSAccess().getClassifierContextDeclCSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassifierContextDeclCS_1=ruleClassifierContextDeclCS();

                    state._fsp--;


                    			current = this_ClassifierContextDeclCS_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyOcl.g:425:3: this_OperationContextDeclCS_2= ruleOperationContextDeclCS
                    {

                    			newCompositeNode(grammarAccess.getContextDeclCSAccess().getOperationContextDeclCSParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationContextDeclCS_2=ruleOperationContextDeclCS();

                    state._fsp--;


                    			current = this_OperationContextDeclCS_2;
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
    // $ANTLR end "ruleContextDeclCS"


    // $ANTLR start "entryRuleDefCS"
    // InternalMyOcl.g:437:1: entryRuleDefCS returns [EObject current=null] : iv_ruleDefCS= ruleDefCS EOF ;
    public final EObject entryRuleDefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefCS = null;


        try {
            // InternalMyOcl.g:437:46: (iv_ruleDefCS= ruleDefCS EOF )
            // InternalMyOcl.g:438:2: iv_ruleDefCS= ruleDefCS EOF
            {
             newCompositeNode(grammarAccess.getDefCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefCS=ruleDefCS();

            state._fsp--;

             current =iv_ruleDefCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefCS"


    // $ANTLR start "ruleDefCS"
    // InternalMyOcl.g:444:1: ruleDefCS returns [EObject current=null] : (this_DefOperationCS_0= ruleDefOperationCS | this_DefPropertyCS_1= ruleDefPropertyCS ) ;
    public final EObject ruleDefCS() throws RecognitionException {
        EObject current = null;

        EObject this_DefOperationCS_0 = null;

        EObject this_DefPropertyCS_1 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:450:2: ( (this_DefOperationCS_0= ruleDefOperationCS | this_DefPropertyCS_1= ruleDefPropertyCS ) )
            // InternalMyOcl.g:451:2: (this_DefOperationCS_0= ruleDefOperationCS | this_DefPropertyCS_1= ruleDefPropertyCS )
            {
            // InternalMyOcl.g:451:2: (this_DefOperationCS_0= ruleDefOperationCS | this_DefPropertyCS_1= ruleDefPropertyCS )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalMyOcl.g:452:3: this_DefOperationCS_0= ruleDefOperationCS
                    {

                    			newCompositeNode(grammarAccess.getDefCSAccess().getDefOperationCSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefOperationCS_0=ruleDefOperationCS();

                    state._fsp--;


                    			current = this_DefOperationCS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyOcl.g:461:3: this_DefPropertyCS_1= ruleDefPropertyCS
                    {

                    			newCompositeNode(grammarAccess.getDefCSAccess().getDefPropertyCSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefPropertyCS_1=ruleDefPropertyCS();

                    state._fsp--;


                    			current = this_DefPropertyCS_1;
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
    // $ANTLR end "ruleDefCS"


    // $ANTLR start "entryRuleDefOperationCS"
    // InternalMyOcl.g:473:1: entryRuleDefOperationCS returns [EObject current=null] : iv_ruleDefOperationCS= ruleDefOperationCS EOF ;
    public final EObject entryRuleDefOperationCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefOperationCS = null;


        try {
            // InternalMyOcl.g:473:55: (iv_ruleDefOperationCS= ruleDefOperationCS EOF )
            // InternalMyOcl.g:474:2: iv_ruleDefOperationCS= ruleDefOperationCS EOF
            {
             newCompositeNode(grammarAccess.getDefOperationCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefOperationCS=ruleDefOperationCS();

            state._fsp--;

             current =iv_ruleDefOperationCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefOperationCS"


    // $ANTLR start "ruleDefOperationCS"
    // InternalMyOcl.g:480:1: ruleDefOperationCS returns [EObject current=null] : ( ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_ownedSignature_4_0= ruleTemplateSignatureCS ) )? ( (lv_name_5_0= ruleUnrestrictedName ) ) otherlv_6= '(' ( ( (lv_ownedParameters_7_0= ruleDefParameterCS ) ) (otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )? otherlv_13= '=' ( (lv_ownedSpecification_14_0= ruleSpecificationCS ) ) ) ;
    public final EObject ruleDefOperationCS() throws RecognitionException {
        EObject current = null;

        Token lv_isStatic_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_ownedSignature_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_ownedParameters_7_0 = null;

        EObject lv_ownedParameters_9_0 = null;

        EObject lv_ownedType_12_0 = null;

        EObject lv_ownedSpecification_14_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:486:2: ( ( ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_ownedSignature_4_0= ruleTemplateSignatureCS ) )? ( (lv_name_5_0= ruleUnrestrictedName ) ) otherlv_6= '(' ( ( (lv_ownedParameters_7_0= ruleDefParameterCS ) ) (otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )? otherlv_13= '=' ( (lv_ownedSpecification_14_0= ruleSpecificationCS ) ) ) )
            // InternalMyOcl.g:487:2: ( ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_ownedSignature_4_0= ruleTemplateSignatureCS ) )? ( (lv_name_5_0= ruleUnrestrictedName ) ) otherlv_6= '(' ( ( (lv_ownedParameters_7_0= ruleDefParameterCS ) ) (otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )? otherlv_13= '=' ( (lv_ownedSpecification_14_0= ruleSpecificationCS ) ) )
            {
            // InternalMyOcl.g:487:2: ( ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_ownedSignature_4_0= ruleTemplateSignatureCS ) )? ( (lv_name_5_0= ruleUnrestrictedName ) ) otherlv_6= '(' ( ( (lv_ownedParameters_7_0= ruleDefParameterCS ) ) (otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )? otherlv_13= '=' ( (lv_ownedSpecification_14_0= ruleSpecificationCS ) ) )
            // InternalMyOcl.g:488:3: ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_ownedSignature_4_0= ruleTemplateSignatureCS ) )? ( (lv_name_5_0= ruleUnrestrictedName ) ) otherlv_6= '(' ( ( (lv_ownedParameters_7_0= ruleDefParameterCS ) ) (otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )? otherlv_13= '=' ( (lv_ownedSpecification_14_0= ruleSpecificationCS ) )
            {
            // InternalMyOcl.g:488:3: ( (lv_isStatic_0_0= 'static' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyOcl.g:489:4: (lv_isStatic_0_0= 'static' )
                    {
                    // InternalMyOcl.g:489:4: (lv_isStatic_0_0= 'static' )
                    // InternalMyOcl.g:490:5: lv_isStatic_0_0= 'static'
                    {
                    lv_isStatic_0_0=(Token)match(input,25,FOLLOW_13); 

                    					newLeafNode(lv_isStatic_0_0, grammarAccess.getDefOperationCSAccess().getIsStaticStaticKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefOperationCSRule());
                    					}
                    					setWithLastConsumed(current, "isStatic", true, "static");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDefOperationCSAccess().getDefKeyword_1());
            		
            // InternalMyOcl.g:506:3: ( ruleUnrestrictedName )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_SIMPLE_ID||(LA12_0>=29 && LA12_0<=31)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyOcl.g:507:4: ruleUnrestrictedName
                    {

                    				newCompositeNode(grammarAccess.getDefOperationCSAccess().getUnrestrictedNameParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_12);
                    ruleUnrestrictedName();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDefOperationCSAccess().getColonKeyword_3());
            		
            // InternalMyOcl.g:519:3: ( (lv_ownedSignature_4_0= ruleTemplateSignatureCS ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22||LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyOcl.g:520:4: (lv_ownedSignature_4_0= ruleTemplateSignatureCS )
                    {
                    // InternalMyOcl.g:520:4: (lv_ownedSignature_4_0= ruleTemplateSignatureCS )
                    // InternalMyOcl.g:521:5: lv_ownedSignature_4_0= ruleTemplateSignatureCS
                    {

                    					newCompositeNode(grammarAccess.getDefOperationCSAccess().getOwnedSignatureTemplateSignatureCSParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_ownedSignature_4_0=ruleTemplateSignatureCS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDefOperationCSRule());
                    					}
                    					set(
                    						current,
                    						"ownedSignature",
                    						lv_ownedSignature_4_0,
                    						"org.xtext.example.mydsl.MyOcl.TemplateSignatureCS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyOcl.g:538:3: ( (lv_name_5_0= ruleUnrestrictedName ) )
            // InternalMyOcl.g:539:4: (lv_name_5_0= ruleUnrestrictedName )
            {
            // InternalMyOcl.g:539:4: (lv_name_5_0= ruleUnrestrictedName )
            // InternalMyOcl.g:540:5: lv_name_5_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getDefOperationCSAccess().getNameUnrestrictedNameParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_5_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefOperationCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.xtext.example.mydsl.MyOcl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getDefOperationCSAccess().getLeftParenthesisKeyword_6());
            		
            // InternalMyOcl.g:561:3: ( ( (lv_ownedParameters_7_0= ruleDefParameterCS ) ) (otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_SIMPLE_ID||(LA15_0>=29 && LA15_0<=31)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyOcl.g:562:4: ( (lv_ownedParameters_7_0= ruleDefParameterCS ) ) (otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) ) )*
                    {
                    // InternalMyOcl.g:562:4: ( (lv_ownedParameters_7_0= ruleDefParameterCS ) )
                    // InternalMyOcl.g:563:5: (lv_ownedParameters_7_0= ruleDefParameterCS )
                    {
                    // InternalMyOcl.g:563:5: (lv_ownedParameters_7_0= ruleDefParameterCS )
                    // InternalMyOcl.g:564:6: lv_ownedParameters_7_0= ruleDefParameterCS
                    {

                    						newCompositeNode(grammarAccess.getDefOperationCSAccess().getOwnedParametersDefParameterCSParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_ownedParameters_7_0=ruleDefParameterCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefOperationCSRule());
                    						}
                    						add(
                    							current,
                    							"ownedParameters",
                    							lv_ownedParameters_7_0,
                    							"org.xtext.example.mydsl.MyOcl.DefParameterCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyOcl.g:581:4: (otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==27) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyOcl.g:582:5: otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) )
                    	    {
                    	    otherlv_8=(Token)match(input,27,FOLLOW_14); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDefOperationCSAccess().getCommaKeyword_7_1_0());
                    	    				
                    	    // InternalMyOcl.g:586:5: ( (lv_ownedParameters_9_0= ruleDefParameterCS ) )
                    	    // InternalMyOcl.g:587:6: (lv_ownedParameters_9_0= ruleDefParameterCS )
                    	    {
                    	    // InternalMyOcl.g:587:6: (lv_ownedParameters_9_0= ruleDefParameterCS )
                    	    // InternalMyOcl.g:588:7: lv_ownedParameters_9_0= ruleDefParameterCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getDefOperationCSAccess().getOwnedParametersDefParameterCSParserRuleCall_7_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_ownedParameters_9_0=ruleDefParameterCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDefOperationCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedParameters",
                    	    								lv_ownedParameters_9_0,
                    	    								"org.xtext.example.mydsl.MyOcl.DefParameterCS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getDefOperationCSAccess().getRightParenthesisKeyword_8());
            		
            otherlv_11=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_11, grammarAccess.getDefOperationCSAccess().getColonKeyword_9());
            		
            // InternalMyOcl.g:615:3: ( (lv_ownedType_12_0= ruleTypeExpCS ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_SIMPLE_ID||(LA16_0>=29 && LA16_0<=31)||(LA16_0>=58 && LA16_0<=71)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyOcl.g:616:4: (lv_ownedType_12_0= ruleTypeExpCS )
                    {
                    // InternalMyOcl.g:616:4: (lv_ownedType_12_0= ruleTypeExpCS )
                    // InternalMyOcl.g:617:5: lv_ownedType_12_0= ruleTypeExpCS
                    {

                    					newCompositeNode(grammarAccess.getDefOperationCSAccess().getOwnedTypeTypeExpCSParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_ownedType_12_0=ruleTypeExpCS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDefOperationCSRule());
                    					}
                    					set(
                    						current,
                    						"ownedType",
                    						lv_ownedType_12_0,
                    						"org.xtext.example.mydsl.MyOcl.TypeExpCS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getDefOperationCSAccess().getEqualsSignKeyword_11());
            		
            // InternalMyOcl.g:638:3: ( (lv_ownedSpecification_14_0= ruleSpecificationCS ) )
            // InternalMyOcl.g:639:4: (lv_ownedSpecification_14_0= ruleSpecificationCS )
            {
            // InternalMyOcl.g:639:4: (lv_ownedSpecification_14_0= ruleSpecificationCS )
            // InternalMyOcl.g:640:5: lv_ownedSpecification_14_0= ruleSpecificationCS
            {

            					newCompositeNode(grammarAccess.getDefOperationCSAccess().getOwnedSpecificationSpecificationCSParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedSpecification_14_0=ruleSpecificationCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefOperationCSRule());
            					}
            					set(
            						current,
            						"ownedSpecification",
            						lv_ownedSpecification_14_0,
            						"org.xtext.example.mydsl.MyOcl.SpecificationCS");
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
    // $ANTLR end "ruleDefOperationCS"


    // $ANTLR start "entryRuleDefParameterCS"
    // InternalMyOcl.g:661:1: entryRuleDefParameterCS returns [EObject current=null] : iv_ruleDefParameterCS= ruleDefParameterCS EOF ;
    public final EObject entryRuleDefParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefParameterCS = null;


        try {
            // InternalMyOcl.g:661:55: (iv_ruleDefParameterCS= ruleDefParameterCS EOF )
            // InternalMyOcl.g:662:2: iv_ruleDefParameterCS= ruleDefParameterCS EOF
            {
             newCompositeNode(grammarAccess.getDefParameterCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefParameterCS=ruleDefParameterCS();

            state._fsp--;

             current =iv_ruleDefParameterCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefParameterCS"


    // $ANTLR start "ruleDefParameterCS"
    // InternalMyOcl.g:668:1: ruleDefParameterCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleDefParameterCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:674:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalMyOcl.g:675:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalMyOcl.g:675:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalMyOcl.g:676:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalMyOcl.g:676:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyOcl.g:677:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyOcl.g:677:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyOcl.g:678:5: lv_name_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getDefParameterCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefParameterCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyOcl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDefParameterCSAccess().getColonKeyword_1());
            		
            // InternalMyOcl.g:699:3: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalMyOcl.g:700:4: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalMyOcl.g:700:4: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalMyOcl.g:701:5: lv_ownedType_2_0= ruleTypeExpCS
            {

            					newCompositeNode(grammarAccess.getDefParameterCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedType_2_0=ruleTypeExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefParameterCSRule());
            					}
            					set(
            						current,
            						"ownedType",
            						lv_ownedType_2_0,
            						"org.xtext.example.mydsl.MyOcl.TypeExpCS");
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
    // $ANTLR end "ruleDefParameterCS"


    // $ANTLR start "entryRuleDefPropertyCS"
    // InternalMyOcl.g:722:1: entryRuleDefPropertyCS returns [EObject current=null] : iv_ruleDefPropertyCS= ruleDefPropertyCS EOF ;
    public final EObject entryRuleDefPropertyCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefPropertyCS = null;


        try {
            // InternalMyOcl.g:722:54: (iv_ruleDefPropertyCS= ruleDefPropertyCS EOF )
            // InternalMyOcl.g:723:2: iv_ruleDefPropertyCS= ruleDefPropertyCS EOF
            {
             newCompositeNode(grammarAccess.getDefPropertyCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefPropertyCS=ruleDefPropertyCS();

            state._fsp--;

             current =iv_ruleDefPropertyCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefPropertyCS"


    // $ANTLR start "ruleDefPropertyCS"
    // InternalMyOcl.g:729:1: ruleDefPropertyCS returns [EObject current=null] : ( ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_name_4_0= ruleUnrestrictedName ) ) otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) otherlv_7= '=' ( (lv_ownedSpecification_8_0= ruleSpecificationCS ) ) ) ;
    public final EObject ruleDefPropertyCS() throws RecognitionException {
        EObject current = null;

        Token lv_isStatic_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_ownedType_6_0 = null;

        EObject lv_ownedSpecification_8_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:735:2: ( ( ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_name_4_0= ruleUnrestrictedName ) ) otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) otherlv_7= '=' ( (lv_ownedSpecification_8_0= ruleSpecificationCS ) ) ) )
            // InternalMyOcl.g:736:2: ( ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_name_4_0= ruleUnrestrictedName ) ) otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) otherlv_7= '=' ( (lv_ownedSpecification_8_0= ruleSpecificationCS ) ) )
            {
            // InternalMyOcl.g:736:2: ( ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_name_4_0= ruleUnrestrictedName ) ) otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) otherlv_7= '=' ( (lv_ownedSpecification_8_0= ruleSpecificationCS ) ) )
            // InternalMyOcl.g:737:3: ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_name_4_0= ruleUnrestrictedName ) ) otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) otherlv_7= '=' ( (lv_ownedSpecification_8_0= ruleSpecificationCS ) )
            {
            // InternalMyOcl.g:737:3: ( (lv_isStatic_0_0= 'static' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyOcl.g:738:4: (lv_isStatic_0_0= 'static' )
                    {
                    // InternalMyOcl.g:738:4: (lv_isStatic_0_0= 'static' )
                    // InternalMyOcl.g:739:5: lv_isStatic_0_0= 'static'
                    {
                    lv_isStatic_0_0=(Token)match(input,25,FOLLOW_13); 

                    					newLeafNode(lv_isStatic_0_0, grammarAccess.getDefPropertyCSAccess().getIsStaticStaticKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefPropertyCSRule());
                    					}
                    					setWithLastConsumed(current, "isStatic", true, "static");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDefPropertyCSAccess().getDefKeyword_1());
            		
            // InternalMyOcl.g:755:3: ( ruleUnrestrictedName )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_SIMPLE_ID||(LA18_0>=29 && LA18_0<=31)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyOcl.g:756:4: ruleUnrestrictedName
                    {

                    				newCompositeNode(grammarAccess.getDefPropertyCSAccess().getUnrestrictedNameParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_12);
                    ruleUnrestrictedName();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getDefPropertyCSAccess().getColonKeyword_3());
            		
            // InternalMyOcl.g:768:3: ( (lv_name_4_0= ruleUnrestrictedName ) )
            // InternalMyOcl.g:769:4: (lv_name_4_0= ruleUnrestrictedName )
            {
            // InternalMyOcl.g:769:4: (lv_name_4_0= ruleUnrestrictedName )
            // InternalMyOcl.g:770:5: lv_name_4_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getDefPropertyCSAccess().getNameUnrestrictedNameParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_4_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefPropertyCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.MyOcl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getDefPropertyCSAccess().getColonKeyword_5());
            		
            // InternalMyOcl.g:791:3: ( (lv_ownedType_6_0= ruleTypeExpCS ) )
            // InternalMyOcl.g:792:4: (lv_ownedType_6_0= ruleTypeExpCS )
            {
            // InternalMyOcl.g:792:4: (lv_ownedType_6_0= ruleTypeExpCS )
            // InternalMyOcl.g:793:5: lv_ownedType_6_0= ruleTypeExpCS
            {

            					newCompositeNode(grammarAccess.getDefPropertyCSAccess().getOwnedTypeTypeExpCSParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
            lv_ownedType_6_0=ruleTypeExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefPropertyCSRule());
            					}
            					set(
            						current,
            						"ownedType",
            						lv_ownedType_6_0,
            						"org.xtext.example.mydsl.MyOcl.TypeExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getDefPropertyCSAccess().getEqualsSignKeyword_7());
            		
            // InternalMyOcl.g:814:3: ( (lv_ownedSpecification_8_0= ruleSpecificationCS ) )
            // InternalMyOcl.g:815:4: (lv_ownedSpecification_8_0= ruleSpecificationCS )
            {
            // InternalMyOcl.g:815:4: (lv_ownedSpecification_8_0= ruleSpecificationCS )
            // InternalMyOcl.g:816:5: lv_ownedSpecification_8_0= ruleSpecificationCS
            {

            					newCompositeNode(grammarAccess.getDefPropertyCSAccess().getOwnedSpecificationSpecificationCSParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedSpecification_8_0=ruleSpecificationCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefPropertyCSRule());
            					}
            					set(
            						current,
            						"ownedSpecification",
            						lv_ownedSpecification_8_0,
            						"org.xtext.example.mydsl.MyOcl.SpecificationCS");
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
    // $ANTLR end "ruleDefPropertyCS"


    // $ANTLR start "entryRuleImportCS"
    // InternalMyOcl.g:837:1: entryRuleImportCS returns [EObject current=null] : iv_ruleImportCS= ruleImportCS EOF ;
    public final EObject entryRuleImportCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportCS = null;


        try {
            // InternalMyOcl.g:837:49: (iv_ruleImportCS= ruleImportCS EOF )
            // InternalMyOcl.g:838:2: iv_ruleImportCS= ruleImportCS EOF
            {
             newCompositeNode(grammarAccess.getImportCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportCS=ruleImportCS();

            state._fsp--;

             current =iv_ruleImportCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportCS"


    // $ANTLR start "ruleImportCS"
    // InternalMyOcl.g:844:1: ruleImportCS returns [EObject current=null] : ( (otherlv_0= 'import' | otherlv_1= 'include' | otherlv_2= 'library' ) ( ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= ':' )? ( (lv_ownedPathName_5_0= ruleURIPathNameCS ) ) ( (lv_isAll_6_0= '::*' ) )? ) ;
    public final EObject ruleImportCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_isAll_6_0=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_ownedPathName_5_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:850:2: ( ( (otherlv_0= 'import' | otherlv_1= 'include' | otherlv_2= 'library' ) ( ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= ':' )? ( (lv_ownedPathName_5_0= ruleURIPathNameCS ) ) ( (lv_isAll_6_0= '::*' ) )? ) )
            // InternalMyOcl.g:851:2: ( (otherlv_0= 'import' | otherlv_1= 'include' | otherlv_2= 'library' ) ( ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= ':' )? ( (lv_ownedPathName_5_0= ruleURIPathNameCS ) ) ( (lv_isAll_6_0= '::*' ) )? )
            {
            // InternalMyOcl.g:851:2: ( (otherlv_0= 'import' | otherlv_1= 'include' | otherlv_2= 'library' ) ( ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= ':' )? ( (lv_ownedPathName_5_0= ruleURIPathNameCS ) ) ( (lv_isAll_6_0= '::*' ) )? )
            // InternalMyOcl.g:852:3: (otherlv_0= 'import' | otherlv_1= 'include' | otherlv_2= 'library' ) ( ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= ':' )? ( (lv_ownedPathName_5_0= ruleURIPathNameCS ) ) ( (lv_isAll_6_0= '::*' ) )?
            {
            // InternalMyOcl.g:852:3: (otherlv_0= 'import' | otherlv_1= 'include' | otherlv_2= 'library' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt19=1;
                }
                break;
            case 30:
                {
                alt19=2;
                }
                break;
            case 31:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMyOcl.g:853:4: otherlv_0= 'import'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getImportCSAccess().getImportKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyOcl.g:858:4: otherlv_1= 'include'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getImportCSAccess().getIncludeKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyOcl.g:863:4: otherlv_2= 'library'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getImportCSAccess().getLibraryKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalMyOcl.g:868:3: ( ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= ':' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_SIMPLE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==24) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalMyOcl.g:869:4: ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= ':'
                    {
                    // InternalMyOcl.g:869:4: ( (lv_name_3_0= ruleIdentifier ) )
                    // InternalMyOcl.g:870:5: (lv_name_3_0= ruleIdentifier )
                    {
                    // InternalMyOcl.g:870:5: (lv_name_3_0= ruleIdentifier )
                    // InternalMyOcl.g:871:6: lv_name_3_0= ruleIdentifier
                    {

                    						newCompositeNode(grammarAccess.getImportCSAccess().getNameIdentifierParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_name_3_0=ruleIdentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImportCSRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.xtext.example.mydsl.MyOcl.Identifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getImportCSAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalMyOcl.g:893:3: ( (lv_ownedPathName_5_0= ruleURIPathNameCS ) )
            // InternalMyOcl.g:894:4: (lv_ownedPathName_5_0= ruleURIPathNameCS )
            {
            // InternalMyOcl.g:894:4: (lv_ownedPathName_5_0= ruleURIPathNameCS )
            // InternalMyOcl.g:895:5: lv_ownedPathName_5_0= ruleURIPathNameCS
            {

            					newCompositeNode(grammarAccess.getImportCSAccess().getOwnedPathNameURIPathNameCSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_ownedPathName_5_0=ruleURIPathNameCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportCSRule());
            					}
            					set(
            						current,
            						"ownedPathName",
            						lv_ownedPathName_5_0,
            						"org.xtext.example.mydsl.MyOcl.URIPathNameCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyOcl.g:912:3: ( (lv_isAll_6_0= '::*' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyOcl.g:913:4: (lv_isAll_6_0= '::*' )
                    {
                    // InternalMyOcl.g:913:4: (lv_isAll_6_0= '::*' )
                    // InternalMyOcl.g:914:5: lv_isAll_6_0= '::*'
                    {
                    lv_isAll_6_0=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_isAll_6_0, grammarAccess.getImportCSAccess().getIsAllColonColonAsteriskKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImportCSRule());
                    					}
                    					setWithLastConsumed(current, "isAll", true, "::*");
                    				

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
    // $ANTLR end "ruleImportCS"


    // $ANTLR start "entryRuleURIPathNameCS"
    // InternalMyOcl.g:930:1: entryRuleURIPathNameCS returns [EObject current=null] : iv_ruleURIPathNameCS= ruleURIPathNameCS EOF ;
    public final EObject entryRuleURIPathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIPathNameCS = null;


        try {
            // InternalMyOcl.g:930:54: (iv_ruleURIPathNameCS= ruleURIPathNameCS EOF )
            // InternalMyOcl.g:931:2: iv_ruleURIPathNameCS= ruleURIPathNameCS EOF
            {
             newCompositeNode(grammarAccess.getURIPathNameCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURIPathNameCS=ruleURIPathNameCS();

            state._fsp--;

             current =iv_ruleURIPathNameCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURIPathNameCS"


    // $ANTLR start "ruleURIPathNameCS"
    // InternalMyOcl.g:937:1: ruleURIPathNameCS returns [EObject current=null] : this_pathNameCS_0= rulepathNameCS ;
    public final EObject ruleURIPathNameCS() throws RecognitionException {
        EObject current = null;

        EObject this_pathNameCS_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:943:2: (this_pathNameCS_0= rulepathNameCS )
            // InternalMyOcl.g:944:2: this_pathNameCS_0= rulepathNameCS
            {

            		newCompositeNode(grammarAccess.getURIPathNameCSAccess().getPathNameCSParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_pathNameCS_0=rulepathNameCS();

            state._fsp--;


            		current = this_pathNameCS_0;
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
    // $ANTLR end "ruleURIPathNameCS"


    // $ANTLR start "entryRuleIdentifier"
    // InternalMyOcl.g:955:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // InternalMyOcl.g:955:50: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalMyOcl.g:956:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalMyOcl.g:962:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SIMPLE_ID_0= RULE_SIMPLE_ID ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;


        	enterRule();

        try {
            // InternalMyOcl.g:968:2: (this_SIMPLE_ID_0= RULE_SIMPLE_ID )
            // InternalMyOcl.g:969:2: this_SIMPLE_ID_0= RULE_SIMPLE_ID
            {
            this_SIMPLE_ID_0=(Token)match(input,RULE_SIMPLE_ID,FOLLOW_2); 

            		current.merge(this_SIMPLE_ID_0);
            	

            		newLeafNode(this_SIMPLE_ID_0, grammarAccess.getIdentifierAccess().getSIMPLE_IDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleOperationContextDeclCS"
    // InternalMyOcl.g:979:1: entryRuleOperationContextDeclCS returns [EObject current=null] : iv_ruleOperationContextDeclCS= ruleOperationContextDeclCS EOF ;
    public final EObject entryRuleOperationContextDeclCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationContextDeclCS = null;


        try {
            // InternalMyOcl.g:979:63: (iv_ruleOperationContextDeclCS= ruleOperationContextDeclCS EOF )
            // InternalMyOcl.g:980:2: iv_ruleOperationContextDeclCS= ruleOperationContextDeclCS EOF
            {
             newCompositeNode(grammarAccess.getOperationContextDeclCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationContextDeclCS=ruleOperationContextDeclCS();

            state._fsp--;

             current =iv_ruleOperationContextDeclCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationContextDeclCS"


    // $ANTLR start "ruleOperationContextDeclCS"
    // InternalMyOcl.g:986:1: ruleOperationContextDeclCS returns [EObject current=null] : (otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_ownedPathName_2_0= rulepathNameCS ) ) otherlv_3= '(' ( ( (lv_ownedParameters_4_0= ruleParameterCS ) ) (otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) )? ( (otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) ) ) | (otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) ) ) | (otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) ) ) )* ) ;
    public final EObject ruleOperationContextDeclCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_ownedSignature_1_0 = null;

        EObject lv_ownedPathName_2_0 = null;

        EObject lv_ownedParameters_4_0 = null;

        EObject lv_ownedParameters_6_0 = null;

        EObject lv_ownedType_9_0 = null;

        EObject lv_ownedPreconditions_11_0 = null;

        EObject lv_ownedPostconditions_13_0 = null;

        EObject lv_ownedBodies_17_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:992:2: ( (otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_ownedPathName_2_0= rulepathNameCS ) ) otherlv_3= '(' ( ( (lv_ownedParameters_4_0= ruleParameterCS ) ) (otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) )? ( (otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) ) ) | (otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) ) ) | (otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) ) ) )* ) )
            // InternalMyOcl.g:993:2: (otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_ownedPathName_2_0= rulepathNameCS ) ) otherlv_3= '(' ( ( (lv_ownedParameters_4_0= ruleParameterCS ) ) (otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) )? ( (otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) ) ) | (otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) ) ) | (otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) ) ) )* )
            {
            // InternalMyOcl.g:993:2: (otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_ownedPathName_2_0= rulepathNameCS ) ) otherlv_3= '(' ( ( (lv_ownedParameters_4_0= ruleParameterCS ) ) (otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) )? ( (otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) ) ) | (otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) ) ) | (otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) ) ) )* )
            // InternalMyOcl.g:994:3: otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_ownedPathName_2_0= rulepathNameCS ) ) otherlv_3= '(' ( ( (lv_ownedParameters_4_0= ruleParameterCS ) ) (otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) )? ( (otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) ) ) | (otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) ) ) | (otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationContextDeclCSAccess().getContextKeyword_0());
            		
            // InternalMyOcl.g:998:3: ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22||LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyOcl.g:999:4: (lv_ownedSignature_1_0= ruleTemplateSignatureCS )
                    {
                    // InternalMyOcl.g:999:4: (lv_ownedSignature_1_0= ruleTemplateSignatureCS )
                    // InternalMyOcl.g:1000:5: lv_ownedSignature_1_0= ruleTemplateSignatureCS
                    {

                    					newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedSignatureTemplateSignatureCSParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_ownedSignature_1_0=ruleTemplateSignatureCS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperationContextDeclCSRule());
                    					}
                    					set(
                    						current,
                    						"ownedSignature",
                    						lv_ownedSignature_1_0,
                    						"org.xtext.example.mydsl.MyOcl.TemplateSignatureCS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyOcl.g:1017:3: ( (lv_ownedPathName_2_0= rulepathNameCS ) )
            // InternalMyOcl.g:1018:4: (lv_ownedPathName_2_0= rulepathNameCS )
            {
            // InternalMyOcl.g:1018:4: (lv_ownedPathName_2_0= rulepathNameCS )
            // InternalMyOcl.g:1019:5: lv_ownedPathName_2_0= rulepathNameCS
            {

            					newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedPathNamePathNameCSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_ownedPathName_2_0=rulepathNameCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationContextDeclCSRule());
            					}
            					set(
            						current,
            						"ownedPathName",
            						lv_ownedPathName_2_0,
            						"org.xtext.example.mydsl.MyOcl.pathNameCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationContextDeclCSAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyOcl.g:1040:3: ( ( (lv_ownedParameters_4_0= ruleParameterCS ) ) (otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_SIMPLE_ID||(LA24_0>=29 && LA24_0<=31)||(LA24_0>=58 && LA24_0<=71)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyOcl.g:1041:4: ( (lv_ownedParameters_4_0= ruleParameterCS ) ) (otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) ) )*
                    {
                    // InternalMyOcl.g:1041:4: ( (lv_ownedParameters_4_0= ruleParameterCS ) )
                    // InternalMyOcl.g:1042:5: (lv_ownedParameters_4_0= ruleParameterCS )
                    {
                    // InternalMyOcl.g:1042:5: (lv_ownedParameters_4_0= ruleParameterCS )
                    // InternalMyOcl.g:1043:6: lv_ownedParameters_4_0= ruleParameterCS
                    {

                    						newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedParametersParameterCSParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_ownedParameters_4_0=ruleParameterCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationContextDeclCSRule());
                    						}
                    						add(
                    							current,
                    							"ownedParameters",
                    							lv_ownedParameters_4_0,
                    							"org.xtext.example.mydsl.MyOcl.ParameterCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyOcl.g:1060:4: (otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==27) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalMyOcl.g:1061:5: otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_20); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getOperationContextDeclCSAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalMyOcl.g:1065:5: ( (lv_ownedParameters_6_0= ruleParameterCS ) )
                    	    // InternalMyOcl.g:1066:6: (lv_ownedParameters_6_0= ruleParameterCS )
                    	    {
                    	    // InternalMyOcl.g:1066:6: (lv_ownedParameters_6_0= ruleParameterCS )
                    	    // InternalMyOcl.g:1067:7: lv_ownedParameters_6_0= ruleParameterCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedParametersParameterCSParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_ownedParameters_6_0=ruleParameterCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationContextDeclCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedParameters",
                    	    								lv_ownedParameters_6_0,
                    	    								"org.xtext.example.mydsl.MyOcl.ParameterCS");
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

            otherlv_7=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getOperationContextDeclCSAccess().getRightParenthesisKeyword_5());
            		
            otherlv_8=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getOperationContextDeclCSAccess().getColonKeyword_6());
            		
            // InternalMyOcl.g:1094:3: ( (lv_ownedType_9_0= ruleTypeExpCS ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_SIMPLE_ID||(LA25_0>=29 && LA25_0<=31)||(LA25_0>=58 && LA25_0<=71)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyOcl.g:1095:4: (lv_ownedType_9_0= ruleTypeExpCS )
                    {
                    // InternalMyOcl.g:1095:4: (lv_ownedType_9_0= ruleTypeExpCS )
                    // InternalMyOcl.g:1096:5: lv_ownedType_9_0= ruleTypeExpCS
                    {

                    					newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedTypeTypeExpCSParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_ownedType_9_0=ruleTypeExpCS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperationContextDeclCSRule());
                    					}
                    					set(
                    						current,
                    						"ownedType",
                    						lv_ownedType_9_0,
                    						"org.xtext.example.mydsl.MyOcl.TypeExpCS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyOcl.g:1113:3: ( (otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) ) ) | (otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) ) ) | (otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) ) ) )*
            loop27:
            do {
                int alt27=4;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    alt27=1;
                    }
                    break;
                case 34:
                    {
                    alt27=2;
                    }
                    break;
                case 35:
                    {
                    alt27=3;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // InternalMyOcl.g:1114:4: (otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) ) )
            	    {
            	    // InternalMyOcl.g:1114:4: (otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) ) )
            	    // InternalMyOcl.g:1115:5: otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) )
            	    {
            	    otherlv_10=(Token)match(input,33,FOLLOW_7); 

            	    					newLeafNode(otherlv_10, grammarAccess.getOperationContextDeclCSAccess().getPreKeyword_8_0_0());
            	    				
            	    // InternalMyOcl.g:1119:5: ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) )
            	    // InternalMyOcl.g:1120:6: (lv_ownedPreconditions_11_0= ruleConstraintCS )
            	    {
            	    // InternalMyOcl.g:1120:6: (lv_ownedPreconditions_11_0= ruleConstraintCS )
            	    // InternalMyOcl.g:1121:7: lv_ownedPreconditions_11_0= ruleConstraintCS
            	    {

            	    							newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedPreconditionsConstraintCSParserRuleCall_8_0_1_0());
            	    						
            	    pushFollow(FOLLOW_24);
            	    lv_ownedPreconditions_11_0=ruleConstraintCS();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getOperationContextDeclCSRule());
            	    							}
            	    							add(
            	    								current,
            	    								"ownedPreconditions",
            	    								lv_ownedPreconditions_11_0,
            	    								"org.xtext.example.mydsl.MyOcl.ConstraintCS");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyOcl.g:1140:4: (otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) ) )
            	    {
            	    // InternalMyOcl.g:1140:4: (otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) ) )
            	    // InternalMyOcl.g:1141:5: otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) )
            	    {
            	    otherlv_12=(Token)match(input,34,FOLLOW_7); 

            	    					newLeafNode(otherlv_12, grammarAccess.getOperationContextDeclCSAccess().getPostKeyword_8_1_0());
            	    				
            	    // InternalMyOcl.g:1145:5: ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) )
            	    // InternalMyOcl.g:1146:6: (lv_ownedPostconditions_13_0= ruleConstraintCS )
            	    {
            	    // InternalMyOcl.g:1146:6: (lv_ownedPostconditions_13_0= ruleConstraintCS )
            	    // InternalMyOcl.g:1147:7: lv_ownedPostconditions_13_0= ruleConstraintCS
            	    {

            	    							newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedPostconditionsConstraintCSParserRuleCall_8_1_1_0());
            	    						
            	    pushFollow(FOLLOW_24);
            	    lv_ownedPostconditions_13_0=ruleConstraintCS();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getOperationContextDeclCSRule());
            	    							}
            	    							add(
            	    								current,
            	    								"ownedPostconditions",
            	    								lv_ownedPostconditions_13_0,
            	    								"org.xtext.example.mydsl.MyOcl.ConstraintCS");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyOcl.g:1166:4: (otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) ) )
            	    {
            	    // InternalMyOcl.g:1166:4: (otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) ) )
            	    // InternalMyOcl.g:1167:5: otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) )
            	    {
            	    otherlv_14=(Token)match(input,35,FOLLOW_7); 

            	    					newLeafNode(otherlv_14, grammarAccess.getOperationContextDeclCSAccess().getBodyKeyword_8_2_0());
            	    				
            	    // InternalMyOcl.g:1171:5: ( ruleUnrestrictedName )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==RULE_SIMPLE_ID||(LA26_0>=29 && LA26_0<=31)) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalMyOcl.g:1172:6: ruleUnrestrictedName
            	            {

            	            						newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getUnrestrictedNameParserRuleCall_8_2_1());
            	            					
            	            pushFollow(FOLLOW_12);
            	            ruleUnrestrictedName();

            	            state._fsp--;


            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }

            	    otherlv_16=(Token)match(input,24,FOLLOW_10); 

            	    					newLeafNode(otherlv_16, grammarAccess.getOperationContextDeclCSAccess().getColonKeyword_8_2_2());
            	    				
            	    // InternalMyOcl.g:1184:5: ( (lv_ownedBodies_17_0= ruleSpecificationCS ) )
            	    // InternalMyOcl.g:1185:6: (lv_ownedBodies_17_0= ruleSpecificationCS )
            	    {
            	    // InternalMyOcl.g:1185:6: (lv_ownedBodies_17_0= ruleSpecificationCS )
            	    // InternalMyOcl.g:1186:7: lv_ownedBodies_17_0= ruleSpecificationCS
            	    {

            	    							newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedBodiesSpecificationCSParserRuleCall_8_2_3_0());
            	    						
            	    pushFollow(FOLLOW_24);
            	    lv_ownedBodies_17_0=ruleSpecificationCS();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getOperationContextDeclCSRule());
            	    							}
            	    							add(
            	    								current,
            	    								"ownedBodies",
            	    								lv_ownedBodies_17_0,
            	    								"org.xtext.example.mydsl.MyOcl.SpecificationCS");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "ruleOperationContextDeclCS"


    // $ANTLR start "entryRulePackageDeclarationCS"
    // InternalMyOcl.g:1209:1: entryRulePackageDeclarationCS returns [EObject current=null] : iv_rulePackageDeclarationCS= rulePackageDeclarationCS EOF ;
    public final EObject entryRulePackageDeclarationCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclarationCS = null;


        try {
            // InternalMyOcl.g:1209:61: (iv_rulePackageDeclarationCS= rulePackageDeclarationCS EOF )
            // InternalMyOcl.g:1210:2: iv_rulePackageDeclarationCS= rulePackageDeclarationCS EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationCSRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDeclarationCS=rulePackageDeclarationCS();

            state._fsp--;

             current =iv_rulePackageDeclarationCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclarationCS"


    // $ANTLR start "rulePackageDeclarationCS"
    // InternalMyOcl.g:1216:1: rulePackageDeclarationCS returns [EObject current=null] : (otherlv_0= 'package' ( (lv_ownedPathName_1_0= rulepathNameCS ) ) (otherlv_2= 'inv' ( (lv_ownedInvariants_3_0= ruleConstraintCS ) ) )* ( (lv_ownedContexts_4_0= ruleContextDeclCS ) )* otherlv_5= 'endpackage' ) ;
    public final EObject rulePackageDeclarationCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_ownedPathName_1_0 = null;

        EObject lv_ownedInvariants_3_0 = null;

        EObject lv_ownedContexts_4_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:1222:2: ( (otherlv_0= 'package' ( (lv_ownedPathName_1_0= rulepathNameCS ) ) (otherlv_2= 'inv' ( (lv_ownedInvariants_3_0= ruleConstraintCS ) ) )* ( (lv_ownedContexts_4_0= ruleContextDeclCS ) )* otherlv_5= 'endpackage' ) )
            // InternalMyOcl.g:1223:2: (otherlv_0= 'package' ( (lv_ownedPathName_1_0= rulepathNameCS ) ) (otherlv_2= 'inv' ( (lv_ownedInvariants_3_0= ruleConstraintCS ) ) )* ( (lv_ownedContexts_4_0= ruleContextDeclCS ) )* otherlv_5= 'endpackage' )
            {
            // InternalMyOcl.g:1223:2: (otherlv_0= 'package' ( (lv_ownedPathName_1_0= rulepathNameCS ) ) (otherlv_2= 'inv' ( (lv_ownedInvariants_3_0= ruleConstraintCS ) ) )* ( (lv_ownedContexts_4_0= ruleContextDeclCS ) )* otherlv_5= 'endpackage' )
            // InternalMyOcl.g:1224:3: otherlv_0= 'package' ( (lv_ownedPathName_1_0= rulepathNameCS ) ) (otherlv_2= 'inv' ( (lv_ownedInvariants_3_0= ruleConstraintCS ) ) )* ( (lv_ownedContexts_4_0= ruleContextDeclCS ) )* otherlv_5= 'endpackage'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationCSAccess().getPackageKeyword_0());
            		
            // InternalMyOcl.g:1228:3: ( (lv_ownedPathName_1_0= rulepathNameCS ) )
            // InternalMyOcl.g:1229:4: (lv_ownedPathName_1_0= rulepathNameCS )
            {
            // InternalMyOcl.g:1229:4: (lv_ownedPathName_1_0= rulepathNameCS )
            // InternalMyOcl.g:1230:5: lv_ownedPathName_1_0= rulepathNameCS
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationCSAccess().getOwnedPathNamePathNameCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_ownedPathName_1_0=rulepathNameCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDeclarationCSRule());
            					}
            					set(
            						current,
            						"ownedPathName",
            						lv_ownedPathName_1_0,
            						"org.xtext.example.mydsl.MyOcl.pathNameCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyOcl.g:1247:3: (otherlv_2= 'inv' ( (lv_ownedInvariants_3_0= ruleConstraintCS ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==19) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyOcl.g:1248:4: otherlv_2= 'inv' ( (lv_ownedInvariants_3_0= ruleConstraintCS ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationCSAccess().getInvKeyword_2_0());
            	    			
            	    // InternalMyOcl.g:1252:4: ( (lv_ownedInvariants_3_0= ruleConstraintCS ) )
            	    // InternalMyOcl.g:1253:5: (lv_ownedInvariants_3_0= ruleConstraintCS )
            	    {
            	    // InternalMyOcl.g:1253:5: (lv_ownedInvariants_3_0= ruleConstraintCS )
            	    // InternalMyOcl.g:1254:6: lv_ownedInvariants_3_0= ruleConstraintCS
            	    {

            	    						newCompositeNode(grammarAccess.getPackageDeclarationCSAccess().getOwnedInvariantsConstraintCSParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_ownedInvariants_3_0=ruleConstraintCS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackageDeclarationCSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedInvariants",
            	    							lv_ownedInvariants_3_0,
            	    							"org.xtext.example.mydsl.MyOcl.ConstraintCS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalMyOcl.g:1272:3: ( (lv_ownedContexts_4_0= ruleContextDeclCS ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==18) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyOcl.g:1273:4: (lv_ownedContexts_4_0= ruleContextDeclCS )
            	    {
            	    // InternalMyOcl.g:1273:4: (lv_ownedContexts_4_0= ruleContextDeclCS )
            	    // InternalMyOcl.g:1274:5: lv_ownedContexts_4_0= ruleContextDeclCS
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDeclarationCSAccess().getOwnedContextsContextDeclCSParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_ownedContexts_4_0=ruleContextDeclCS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDeclarationCSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedContexts",
            	    						lv_ownedContexts_4_0,
            	    						"org.xtext.example.mydsl.MyOcl.ContextDeclCS");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_5=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPackageDeclarationCSAccess().getEndpackageKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclarationCS"


    // $ANTLR start "entryRuleParameterCS"
    // InternalMyOcl.g:1299:1: entryRuleParameterCS returns [EObject current=null] : iv_ruleParameterCS= ruleParameterCS EOF ;
    public final EObject entryRuleParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterCS = null;


        try {
            // InternalMyOcl.g:1299:52: (iv_ruleParameterCS= ruleParameterCS EOF )
            // InternalMyOcl.g:1300:2: iv_ruleParameterCS= ruleParameterCS EOF
            {
             newCompositeNode(grammarAccess.getParameterCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterCS=ruleParameterCS();

            state._fsp--;

             current =iv_ruleParameterCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterCS"


    // $ANTLR start "ruleParameterCS"
    // InternalMyOcl.g:1306:1: ruleParameterCS returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' )? ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleParameterCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:1312:2: ( ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' )? ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalMyOcl.g:1313:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' )? ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalMyOcl.g:1313:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' )? ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalMyOcl.g:1314:3: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' )? ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalMyOcl.g:1314:3: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' )?
            int alt30=2;
            switch ( input.LA(1) ) {
                case RULE_SIMPLE_ID:
                    {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==24) ) {
                        alt30=1;
                    }
                    }
                    break;
                case 29:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (LA30_2==24) ) {
                        alt30=1;
                    }
                    }
                    break;
                case 30:
                    {
                    int LA30_3 = input.LA(2);

                    if ( (LA30_3==24) ) {
                        alt30=1;
                    }
                    }
                    break;
                case 31:
                    {
                    int LA30_4 = input.LA(2);

                    if ( (LA30_4==24) ) {
                        alt30=1;
                    }
                    }
                    break;
            }

            switch (alt30) {
                case 1 :
                    // InternalMyOcl.g:1315:4: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':'
                    {
                    // InternalMyOcl.g:1315:4: ( (lv_name_0_0= ruleUnrestrictedName ) )
                    // InternalMyOcl.g:1316:5: (lv_name_0_0= ruleUnrestrictedName )
                    {
                    // InternalMyOcl.g:1316:5: (lv_name_0_0= ruleUnrestrictedName )
                    // InternalMyOcl.g:1317:6: lv_name_0_0= ruleUnrestrictedName
                    {

                    						newCompositeNode(grammarAccess.getParameterCSAccess().getNameUnrestrictedNameParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_name_0_0=ruleUnrestrictedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterCSRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.xtext.example.mydsl.MyOcl.UnrestrictedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterCSAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyOcl.g:1339:3: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalMyOcl.g:1340:4: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalMyOcl.g:1340:4: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalMyOcl.g:1341:5: lv_ownedType_2_0= ruleTypeExpCS
            {

            					newCompositeNode(grammarAccess.getParameterCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedType_2_0=ruleTypeExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterCSRule());
            					}
            					set(
            						current,
            						"ownedType",
            						lv_ownedType_2_0,
            						"org.xtext.example.mydsl.MyOcl.TypeExpCS");
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
    // $ANTLR end "ruleParameterCS"


    // $ANTLR start "entryRulePropertyContextDeclCS"
    // InternalMyOcl.g:1362:1: entryRulePropertyContextDeclCS returns [EObject current=null] : iv_rulePropertyContextDeclCS= rulePropertyContextDeclCS EOF ;
    public final EObject entryRulePropertyContextDeclCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyContextDeclCS = null;


        try {
            // InternalMyOcl.g:1362:62: (iv_rulePropertyContextDeclCS= rulePropertyContextDeclCS EOF )
            // InternalMyOcl.g:1363:2: iv_rulePropertyContextDeclCS= rulePropertyContextDeclCS EOF
            {
             newCompositeNode(grammarAccess.getPropertyContextDeclCSRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyContextDeclCS=rulePropertyContextDeclCS();

            state._fsp--;

             current =iv_rulePropertyContextDeclCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyContextDeclCS"


    // $ANTLR start "rulePropertyContextDeclCS"
    // InternalMyOcl.g:1369:1: rulePropertyContextDeclCS returns [EObject current=null] : (otherlv_0= 'context' ( (lv_ownedPathName_1_0= rulepathNameCS ) ) otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( (otherlv_4= 'derive' ( (lv_ownedDerivedInvariants_5_0= ruleConstraintCS ) ) ) | (otherlv_6= 'init' otherlv_7= ':' ( (lv_ownedDefaultExpressions_8_0= ruleSpecificationCS ) ) ) )* ) ;
    public final EObject rulePropertyContextDeclCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_ownedPathName_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedDerivedInvariants_5_0 = null;

        EObject lv_ownedDefaultExpressions_8_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:1375:2: ( (otherlv_0= 'context' ( (lv_ownedPathName_1_0= rulepathNameCS ) ) otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( (otherlv_4= 'derive' ( (lv_ownedDerivedInvariants_5_0= ruleConstraintCS ) ) ) | (otherlv_6= 'init' otherlv_7= ':' ( (lv_ownedDefaultExpressions_8_0= ruleSpecificationCS ) ) ) )* ) )
            // InternalMyOcl.g:1376:2: (otherlv_0= 'context' ( (lv_ownedPathName_1_0= rulepathNameCS ) ) otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( (otherlv_4= 'derive' ( (lv_ownedDerivedInvariants_5_0= ruleConstraintCS ) ) ) | (otherlv_6= 'init' otherlv_7= ':' ( (lv_ownedDefaultExpressions_8_0= ruleSpecificationCS ) ) ) )* )
            {
            // InternalMyOcl.g:1376:2: (otherlv_0= 'context' ( (lv_ownedPathName_1_0= rulepathNameCS ) ) otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( (otherlv_4= 'derive' ( (lv_ownedDerivedInvariants_5_0= ruleConstraintCS ) ) ) | (otherlv_6= 'init' otherlv_7= ':' ( (lv_ownedDefaultExpressions_8_0= ruleSpecificationCS ) ) ) )* )
            // InternalMyOcl.g:1377:3: otherlv_0= 'context' ( (lv_ownedPathName_1_0= rulepathNameCS ) ) otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( (otherlv_4= 'derive' ( (lv_ownedDerivedInvariants_5_0= ruleConstraintCS ) ) ) | (otherlv_6= 'init' otherlv_7= ':' ( (lv_ownedDefaultExpressions_8_0= ruleSpecificationCS ) ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyContextDeclCSAccess().getContextKeyword_0());
            		
            // InternalMyOcl.g:1381:3: ( (lv_ownedPathName_1_0= rulepathNameCS ) )
            // InternalMyOcl.g:1382:4: (lv_ownedPathName_1_0= rulepathNameCS )
            {
            // InternalMyOcl.g:1382:4: (lv_ownedPathName_1_0= rulepathNameCS )
            // InternalMyOcl.g:1383:5: lv_ownedPathName_1_0= rulepathNameCS
            {

            					newCompositeNode(grammarAccess.getPropertyContextDeclCSAccess().getOwnedPathNamePathNameCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_ownedPathName_1_0=rulepathNameCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyContextDeclCSRule());
            					}
            					set(
            						current,
            						"ownedPathName",
            						lv_ownedPathName_1_0,
            						"org.xtext.example.mydsl.MyOcl.pathNameCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyContextDeclCSAccess().getColonKeyword_2());
            		
            // InternalMyOcl.g:1404:3: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
            // InternalMyOcl.g:1405:4: (lv_ownedType_3_0= ruleTypeExpCS )
            {
            // InternalMyOcl.g:1405:4: (lv_ownedType_3_0= ruleTypeExpCS )
            // InternalMyOcl.g:1406:5: lv_ownedType_3_0= ruleTypeExpCS
            {

            					newCompositeNode(grammarAccess.getPropertyContextDeclCSAccess().getOwnedTypeTypeExpCSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_ownedType_3_0=ruleTypeExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyContextDeclCSRule());
            					}
            					set(
            						current,
            						"ownedType",
            						lv_ownedType_3_0,
            						"org.xtext.example.mydsl.MyOcl.TypeExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyOcl.g:1423:3: ( (otherlv_4= 'derive' ( (lv_ownedDerivedInvariants_5_0= ruleConstraintCS ) ) ) | (otherlv_6= 'init' otherlv_7= ':' ( (lv_ownedDefaultExpressions_8_0= ruleSpecificationCS ) ) ) )*
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==38) ) {
                    alt31=1;
                }
                else if ( (LA31_0==39) ) {
                    alt31=2;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyOcl.g:1424:4: (otherlv_4= 'derive' ( (lv_ownedDerivedInvariants_5_0= ruleConstraintCS ) ) )
            	    {
            	    // InternalMyOcl.g:1424:4: (otherlv_4= 'derive' ( (lv_ownedDerivedInvariants_5_0= ruleConstraintCS ) ) )
            	    // InternalMyOcl.g:1425:5: otherlv_4= 'derive' ( (lv_ownedDerivedInvariants_5_0= ruleConstraintCS ) )
            	    {
            	    otherlv_4=(Token)match(input,38,FOLLOW_7); 

            	    					newLeafNode(otherlv_4, grammarAccess.getPropertyContextDeclCSAccess().getDeriveKeyword_4_0_0());
            	    				
            	    // InternalMyOcl.g:1429:5: ( (lv_ownedDerivedInvariants_5_0= ruleConstraintCS ) )
            	    // InternalMyOcl.g:1430:6: (lv_ownedDerivedInvariants_5_0= ruleConstraintCS )
            	    {
            	    // InternalMyOcl.g:1430:6: (lv_ownedDerivedInvariants_5_0= ruleConstraintCS )
            	    // InternalMyOcl.g:1431:7: lv_ownedDerivedInvariants_5_0= ruleConstraintCS
            	    {

            	    							newCompositeNode(grammarAccess.getPropertyContextDeclCSAccess().getOwnedDerivedInvariantsConstraintCSParserRuleCall_4_0_1_0());
            	    						
            	    pushFollow(FOLLOW_27);
            	    lv_ownedDerivedInvariants_5_0=ruleConstraintCS();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPropertyContextDeclCSRule());
            	    							}
            	    							add(
            	    								current,
            	    								"ownedDerivedInvariants",
            	    								lv_ownedDerivedInvariants_5_0,
            	    								"org.xtext.example.mydsl.MyOcl.ConstraintCS");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyOcl.g:1450:4: (otherlv_6= 'init' otherlv_7= ':' ( (lv_ownedDefaultExpressions_8_0= ruleSpecificationCS ) ) )
            	    {
            	    // InternalMyOcl.g:1450:4: (otherlv_6= 'init' otherlv_7= ':' ( (lv_ownedDefaultExpressions_8_0= ruleSpecificationCS ) ) )
            	    // InternalMyOcl.g:1451:5: otherlv_6= 'init' otherlv_7= ':' ( (lv_ownedDefaultExpressions_8_0= ruleSpecificationCS ) )
            	    {
            	    otherlv_6=(Token)match(input,39,FOLLOW_12); 

            	    					newLeafNode(otherlv_6, grammarAccess.getPropertyContextDeclCSAccess().getInitKeyword_4_1_0());
            	    				
            	    otherlv_7=(Token)match(input,24,FOLLOW_10); 

            	    					newLeafNode(otherlv_7, grammarAccess.getPropertyContextDeclCSAccess().getColonKeyword_4_1_1());
            	    				
            	    // InternalMyOcl.g:1459:5: ( (lv_ownedDefaultExpressions_8_0= ruleSpecificationCS ) )
            	    // InternalMyOcl.g:1460:6: (lv_ownedDefaultExpressions_8_0= ruleSpecificationCS )
            	    {
            	    // InternalMyOcl.g:1460:6: (lv_ownedDefaultExpressions_8_0= ruleSpecificationCS )
            	    // InternalMyOcl.g:1461:7: lv_ownedDefaultExpressions_8_0= ruleSpecificationCS
            	    {

            	    							newCompositeNode(grammarAccess.getPropertyContextDeclCSAccess().getOwnedDefaultExpressionsSpecificationCSParserRuleCall_4_1_2_0());
            	    						
            	    pushFollow(FOLLOW_27);
            	    lv_ownedDefaultExpressions_8_0=ruleSpecificationCS();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPropertyContextDeclCSRule());
            	    							}
            	    							add(
            	    								current,
            	    								"ownedDefaultExpressions",
            	    								lv_ownedDefaultExpressions_8_0,
            	    								"org.xtext.example.mydsl.MyOcl.SpecificationCS");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "rulePropertyContextDeclCS"


    // $ANTLR start "entryRuleSpecificationCS"
    // InternalMyOcl.g:1484:1: entryRuleSpecificationCS returns [EObject current=null] : iv_ruleSpecificationCS= ruleSpecificationCS EOF ;
    public final EObject entryRuleSpecificationCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecificationCS = null;


        try {
            // InternalMyOcl.g:1484:56: (iv_ruleSpecificationCS= ruleSpecificationCS EOF )
            // InternalMyOcl.g:1485:2: iv_ruleSpecificationCS= ruleSpecificationCS EOF
            {
             newCompositeNode(grammarAccess.getSpecificationCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecificationCS=ruleSpecificationCS();

            state._fsp--;

             current =iv_ruleSpecificationCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecificationCS"


    // $ANTLR start "ruleSpecificationCS"
    // InternalMyOcl.g:1491:1: ruleSpecificationCS returns [EObject current=null] : ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) | ( (lv_exprString_1_0= RULE_UNQUOTED_STRING ) ) ) ;
    public final EObject ruleSpecificationCS() throws RecognitionException {
        EObject current = null;

        Token lv_exprString_1_0=null;
        EObject lv_ownedExpression_0_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:1497:2: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) | ( (lv_exprString_1_0= RULE_UNQUOTED_STRING ) ) ) )
            // InternalMyOcl.g:1498:2: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) | ( (lv_exprString_1_0= RULE_UNQUOTED_STRING ) ) )
            {
            // InternalMyOcl.g:1498:2: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) | ( (lv_exprString_1_0= RULE_UNQUOTED_STRING ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_SIMPLE_ID||(LA32_0>=RULE_SINGLE_QUOTED_STRING && LA32_0<=RULE_BIG_INT)||LA32_0==22||(LA32_0>=29 && LA32_0<=31)||(LA32_0>=44 && LA32_0<=46)||LA32_0==58||(LA32_0>=67 && LA32_0<=72)||(LA32_0>=76 && LA32_0<=78)||LA32_0==81||LA32_0==85||LA32_0==87) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_UNQUOTED_STRING) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyOcl.g:1499:3: ( (lv_ownedExpression_0_0= ruleExpCS ) )
                    {
                    // InternalMyOcl.g:1499:3: ( (lv_ownedExpression_0_0= ruleExpCS ) )
                    // InternalMyOcl.g:1500:4: (lv_ownedExpression_0_0= ruleExpCS )
                    {
                    // InternalMyOcl.g:1500:4: (lv_ownedExpression_0_0= ruleExpCS )
                    // InternalMyOcl.g:1501:5: lv_ownedExpression_0_0= ruleExpCS
                    {

                    					newCompositeNode(grammarAccess.getSpecificationCSAccess().getOwnedExpressionExpCSParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ownedExpression_0_0=ruleExpCS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpecificationCSRule());
                    					}
                    					set(
                    						current,
                    						"ownedExpression",
                    						lv_ownedExpression_0_0,
                    						"org.xtext.example.mydsl.MyOcl.ExpCS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyOcl.g:1519:3: ( (lv_exprString_1_0= RULE_UNQUOTED_STRING ) )
                    {
                    // InternalMyOcl.g:1519:3: ( (lv_exprString_1_0= RULE_UNQUOTED_STRING ) )
                    // InternalMyOcl.g:1520:4: (lv_exprString_1_0= RULE_UNQUOTED_STRING )
                    {
                    // InternalMyOcl.g:1520:4: (lv_exprString_1_0= RULE_UNQUOTED_STRING )
                    // InternalMyOcl.g:1521:5: lv_exprString_1_0= RULE_UNQUOTED_STRING
                    {
                    lv_exprString_1_0=(Token)match(input,RULE_UNQUOTED_STRING,FOLLOW_2); 

                    					newLeafNode(lv_exprString_1_0, grammarAccess.getSpecificationCSAccess().getExprStringUNQUOTED_STRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSpecificationCSRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"exprString",
                    						lv_exprString_1_0,
                    						"org.xtext.example.mydsl.MyOcl.UNQUOTED_STRING");
                    				

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
    // $ANTLR end "ruleSpecificationCS"


    // $ANTLR start "entryRulepathNameCS"
    // InternalMyOcl.g:1541:1: entryRulepathNameCS returns [EObject current=null] : iv_rulepathNameCS= rulepathNameCS EOF ;
    public final EObject entryRulepathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepathNameCS = null;


        try {
            // InternalMyOcl.g:1541:51: (iv_rulepathNameCS= rulepathNameCS EOF )
            // InternalMyOcl.g:1542:2: iv_rulepathNameCS= rulepathNameCS EOF
            {
             newCompositeNode(grammarAccess.getPathNameCSRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepathNameCS=rulepathNameCS();

            state._fsp--;

             current =iv_rulepathNameCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepathNameCS"


    // $ANTLR start "rulepathNameCS"
    // InternalMyOcl.g:1548:1: rulepathNameCS returns [EObject current=null] : ( ( (lv_name_0_0= rulesimpleNameCS ) ) otherlv_1= '::' ruleUnrestrictedName2 ) ;
    public final EObject rulepathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:1554:2: ( ( ( (lv_name_0_0= rulesimpleNameCS ) ) otherlv_1= '::' ruleUnrestrictedName2 ) )
            // InternalMyOcl.g:1555:2: ( ( (lv_name_0_0= rulesimpleNameCS ) ) otherlv_1= '::' ruleUnrestrictedName2 )
            {
            // InternalMyOcl.g:1555:2: ( ( (lv_name_0_0= rulesimpleNameCS ) ) otherlv_1= '::' ruleUnrestrictedName2 )
            // InternalMyOcl.g:1556:3: ( (lv_name_0_0= rulesimpleNameCS ) ) otherlv_1= '::' ruleUnrestrictedName2
            {
            // InternalMyOcl.g:1556:3: ( (lv_name_0_0= rulesimpleNameCS ) )
            // InternalMyOcl.g:1557:4: (lv_name_0_0= rulesimpleNameCS )
            {
            // InternalMyOcl.g:1557:4: (lv_name_0_0= rulesimpleNameCS )
            // InternalMyOcl.g:1558:5: lv_name_0_0= rulesimpleNameCS
            {

            					newCompositeNode(grammarAccess.getPathNameCSAccess().getNameSimpleNameCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_name_0_0=rulesimpleNameCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPathNameCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyOcl.simpleNameCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1());
            		

            			newCompositeNode(grammarAccess.getPathNameCSAccess().getUnrestrictedName2ParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            ruleUnrestrictedName2();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepathNameCS"


    // $ANTLR start "entryRulesimpleNameCS"
    // InternalMyOcl.g:1590:1: entryRulesimpleNameCS returns [String current=null] : iv_rulesimpleNameCS= rulesimpleNameCS EOF ;
    public final String entryRulesimpleNameCS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesimpleNameCS = null;


        try {
            // InternalMyOcl.g:1590:52: (iv_rulesimpleNameCS= rulesimpleNameCS EOF )
            // InternalMyOcl.g:1591:2: iv_rulesimpleNameCS= rulesimpleNameCS EOF
            {
             newCompositeNode(grammarAccess.getSimpleNameCSRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimpleNameCS=rulesimpleNameCS();

            state._fsp--;

             current =iv_rulesimpleNameCS.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimpleNameCS"


    // $ANTLR start "rulesimpleNameCS"
    // InternalMyOcl.g:1597:1: rulesimpleNameCS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SIMPLE_ID_0= RULE_SIMPLE_ID ;
    public final AntlrDatatypeRuleToken rulesimpleNameCS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;


        	enterRule();

        try {
            // InternalMyOcl.g:1603:2: (this_SIMPLE_ID_0= RULE_SIMPLE_ID )
            // InternalMyOcl.g:1604:2: this_SIMPLE_ID_0= RULE_SIMPLE_ID
            {
            this_SIMPLE_ID_0=(Token)match(input,RULE_SIMPLE_ID,FOLLOW_2); 

            		current.merge(this_SIMPLE_ID_0);
            	

            		newLeafNode(this_SIMPLE_ID_0, grammarAccess.getSimpleNameCSAccess().getSIMPLE_IDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimpleNameCS"


    // $ANTLR start "entryRuleTemplateSignatureCS"
    // InternalMyOcl.g:1614:1: entryRuleTemplateSignatureCS returns [EObject current=null] : iv_ruleTemplateSignatureCS= ruleTemplateSignatureCS EOF ;
    public final EObject entryRuleTemplateSignatureCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSignatureCS = null;


        try {
            // InternalMyOcl.g:1614:60: (iv_ruleTemplateSignatureCS= ruleTemplateSignatureCS EOF )
            // InternalMyOcl.g:1615:2: iv_ruleTemplateSignatureCS= ruleTemplateSignatureCS EOF
            {
             newCompositeNode(grammarAccess.getTemplateSignatureCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplateSignatureCS=ruleTemplateSignatureCS();

            state._fsp--;

             current =iv_ruleTemplateSignatureCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateSignatureCS"


    // $ANTLR start "ruleTemplateSignatureCS"
    // InternalMyOcl.g:1621:1: ruleTemplateSignatureCS returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')' ) | (otherlv_5= '<' ( (lv_ownedParameters_6_0= ruleTypeParameterCS ) ) (otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) ) )* otherlv_9= '>' ) ) ;
    public final EObject ruleTemplateSignatureCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_ownedParameters_1_0 = null;

        EObject lv_ownedParameters_3_0 = null;

        EObject lv_ownedParameters_6_0 = null;

        EObject lv_ownedParameters_8_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:1627:2: ( ( (otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')' ) | (otherlv_5= '<' ( (lv_ownedParameters_6_0= ruleTypeParameterCS ) ) (otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) ) )* otherlv_9= '>' ) ) )
            // InternalMyOcl.g:1628:2: ( (otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')' ) | (otherlv_5= '<' ( (lv_ownedParameters_6_0= ruleTypeParameterCS ) ) (otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) ) )* otherlv_9= '>' ) )
            {
            // InternalMyOcl.g:1628:2: ( (otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')' ) | (otherlv_5= '<' ( (lv_ownedParameters_6_0= ruleTypeParameterCS ) ) (otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) ) )* otherlv_9= '>' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==22) ) {
                alt35=1;
            }
            else if ( (LA35_0==41) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyOcl.g:1629:3: (otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')' )
                    {
                    // InternalMyOcl.g:1629:3: (otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')' )
                    // InternalMyOcl.g:1630:4: otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_30); 

                    				newLeafNode(otherlv_0, grammarAccess.getTemplateSignatureCSAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalMyOcl.g:1634:4: ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) )
                    // InternalMyOcl.g:1635:5: (lv_ownedParameters_1_0= ruleTypeParameterCS )
                    {
                    // InternalMyOcl.g:1635:5: (lv_ownedParameters_1_0= ruleTypeParameterCS )
                    // InternalMyOcl.g:1636:6: lv_ownedParameters_1_0= ruleTypeParameterCS
                    {

                    						newCompositeNode(grammarAccess.getTemplateSignatureCSAccess().getOwnedParametersTypeParameterCSParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_ownedParameters_1_0=ruleTypeParameterCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemplateSignatureCSRule());
                    						}
                    						add(
                    							current,
                    							"ownedParameters",
                    							lv_ownedParameters_1_0,
                    							"org.xtext.example.mydsl.MyOcl.TypeParameterCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyOcl.g:1653:4: (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==27) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalMyOcl.g:1654:5: otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) )
                    	    {
                    	    otherlv_2=(Token)match(input,27,FOLLOW_30); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getTemplateSignatureCSAccess().getCommaKeyword_0_2_0());
                    	    				
                    	    // InternalMyOcl.g:1658:5: ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) )
                    	    // InternalMyOcl.g:1659:6: (lv_ownedParameters_3_0= ruleTypeParameterCS )
                    	    {
                    	    // InternalMyOcl.g:1659:6: (lv_ownedParameters_3_0= ruleTypeParameterCS )
                    	    // InternalMyOcl.g:1660:7: lv_ownedParameters_3_0= ruleTypeParameterCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemplateSignatureCSAccess().getOwnedParametersTypeParameterCSParserRuleCall_0_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_ownedParameters_3_0=ruleTypeParameterCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemplateSignatureCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedParameters",
                    	    								lv_ownedParameters_3_0,
                    	    								"org.xtext.example.mydsl.MyOcl.TypeParameterCS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTemplateSignatureCSAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyOcl.g:1684:3: (otherlv_5= '<' ( (lv_ownedParameters_6_0= ruleTypeParameterCS ) ) (otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) ) )* otherlv_9= '>' )
                    {
                    // InternalMyOcl.g:1684:3: (otherlv_5= '<' ( (lv_ownedParameters_6_0= ruleTypeParameterCS ) ) (otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) ) )* otherlv_9= '>' )
                    // InternalMyOcl.g:1685:4: otherlv_5= '<' ( (lv_ownedParameters_6_0= ruleTypeParameterCS ) ) (otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) ) )* otherlv_9= '>'
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_30); 

                    				newLeafNode(otherlv_5, grammarAccess.getTemplateSignatureCSAccess().getLessThanSignKeyword_1_0());
                    			
                    // InternalMyOcl.g:1689:4: ( (lv_ownedParameters_6_0= ruleTypeParameterCS ) )
                    // InternalMyOcl.g:1690:5: (lv_ownedParameters_6_0= ruleTypeParameterCS )
                    {
                    // InternalMyOcl.g:1690:5: (lv_ownedParameters_6_0= ruleTypeParameterCS )
                    // InternalMyOcl.g:1691:6: lv_ownedParameters_6_0= ruleTypeParameterCS
                    {

                    						newCompositeNode(grammarAccess.getTemplateSignatureCSAccess().getOwnedParametersTypeParameterCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_ownedParameters_6_0=ruleTypeParameterCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemplateSignatureCSRule());
                    						}
                    						add(
                    							current,
                    							"ownedParameters",
                    							lv_ownedParameters_6_0,
                    							"org.xtext.example.mydsl.MyOcl.TypeParameterCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyOcl.g:1708:4: (otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==27) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalMyOcl.g:1709:5: otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_30); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTemplateSignatureCSAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalMyOcl.g:1713:5: ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) )
                    	    // InternalMyOcl.g:1714:6: (lv_ownedParameters_8_0= ruleTypeParameterCS )
                    	    {
                    	    // InternalMyOcl.g:1714:6: (lv_ownedParameters_8_0= ruleTypeParameterCS )
                    	    // InternalMyOcl.g:1715:7: lv_ownedParameters_8_0= ruleTypeParameterCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemplateSignatureCSAccess().getOwnedParametersTypeParameterCSParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_ownedParameters_8_0=ruleTypeParameterCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemplateSignatureCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedParameters",
                    	    								lv_ownedParameters_8_0,
                    	    								"org.xtext.example.mydsl.MyOcl.TypeParameterCS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getTemplateSignatureCSAccess().getGreaterThanSignKeyword_1_3());
                    			

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
    // $ANTLR end "ruleTemplateSignatureCS"


    // $ANTLR start "entryRuleTypeParameterCS"
    // InternalMyOcl.g:1742:1: entryRuleTypeParameterCS returns [EObject current=null] : iv_ruleTypeParameterCS= ruleTypeParameterCS EOF ;
    public final EObject entryRuleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeParameterCS = null;


        try {
            // InternalMyOcl.g:1742:56: (iv_ruleTypeParameterCS= ruleTypeParameterCS EOF )
            // InternalMyOcl.g:1743:2: iv_ruleTypeParameterCS= ruleTypeParameterCS EOF
            {
             newCompositeNode(grammarAccess.getTypeParameterCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeParameterCS=ruleTypeParameterCS();

            state._fsp--;

             current =iv_ruleTypeParameterCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeParameterCS"


    // $ANTLR start "ruleTypeParameterCS"
    // InternalMyOcl.g:1749:1: ruleTypeParameterCS returns [EObject current=null] : this_PrimitiveTypeCS_0= rulePrimitiveTypeCS ;
    public final EObject ruleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:1755:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS )
            // InternalMyOcl.g:1756:2: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
            {

            		newCompositeNode(grammarAccess.getTypeParameterCSAccess().getPrimitiveTypeCSParserRuleCall());
            	
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
    // $ANTLR end "ruleTypeParameterCS"


    // $ANTLR start "entryRuleUnrestrictedName"
    // InternalMyOcl.g:1767:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // InternalMyOcl.g:1767:56: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // InternalMyOcl.g:1768:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
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
    // InternalMyOcl.g:1774:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName | kw= 'import' | kw= 'include' | kw= 'library' ) ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:1780:2: ( (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName | kw= 'import' | kw= 'include' | kw= 'library' ) )
            // InternalMyOcl.g:1781:2: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName | kw= 'import' | kw= 'include' | kw= 'library' )
            {
            // InternalMyOcl.g:1781:2: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName | kw= 'import' | kw= 'include' | kw= 'library' )
            int alt36=4;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
                {
                alt36=1;
                }
                break;
            case 29:
                {
                alt36=2;
                }
                break;
            case 30:
                {
                alt36=3;
                }
                break;
            case 31:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalMyOcl.g:1782:3: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
                    {

                    			newCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EssentialOCLUnrestrictedName_0=ruleEssentialOCLUnrestrictedName();

                    state._fsp--;


                    			current.merge(this_EssentialOCLUnrestrictedName_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyOcl.g:1793:3: kw= 'import'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnrestrictedNameAccess().getImportKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyOcl.g:1799:3: kw= 'include'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnrestrictedNameAccess().getIncludeKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyOcl.g:1805:3: kw= 'library'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnrestrictedNameAccess().getLibraryKeyword_3());
                    		

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
    // $ANTLR end "ruleUnrestrictedName"


    // $ANTLR start "entryRuleNavigatingArgExpCS"
    // InternalMyOcl.g:1814:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // InternalMyOcl.g:1814:59: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // InternalMyOcl.g:1815:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
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
    // InternalMyOcl.g:1821:1: ruleNavigatingArgExpCS returns [EObject current=null] : ( ( () otherlv_1= '?' ) | this_ExpCS_2= ruleExpCS ) ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ExpCS_2 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:1827:2: ( ( ( () otherlv_1= '?' ) | this_ExpCS_2= ruleExpCS ) )
            // InternalMyOcl.g:1828:2: ( ( () otherlv_1= '?' ) | this_ExpCS_2= ruleExpCS )
            {
            // InternalMyOcl.g:1828:2: ( ( () otherlv_1= '?' ) | this_ExpCS_2= ruleExpCS )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_SIMPLE_ID||(LA37_0>=RULE_SINGLE_QUOTED_STRING && LA37_0<=RULE_BIG_INT)||LA37_0==22||(LA37_0>=29 && LA37_0<=31)||(LA37_0>=44 && LA37_0<=46)||LA37_0==58||(LA37_0>=67 && LA37_0<=72)||(LA37_0>=76 && LA37_0<=78)||LA37_0==81||LA37_0==85||LA37_0==87) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyOcl.g:1829:3: ( () otherlv_1= '?' )
                    {
                    // InternalMyOcl.g:1829:3: ( () otherlv_1= '?' )
                    // InternalMyOcl.g:1830:4: () otherlv_1= '?'
                    {
                    // InternalMyOcl.g:1830:4: ()
                    // InternalMyOcl.g:1831:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNavigatingArgExpCSAccess().getOCLMessageArgCSAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getNavigatingArgExpCSAccess().getQuestionMarkKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyOcl.g:1843:3: this_ExpCS_2= ruleExpCS
                    {

                    			newCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpCS_2=ruleExpCS();

                    state._fsp--;


                    			current = this_ExpCS_2;
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
    // $ANTLR end "ruleNavigatingArgExpCS"


    // $ANTLR start "entryRuleEssentialOCLNavigationOperatorName"
    // InternalMyOcl.g:1855:1: entryRuleEssentialOCLNavigationOperatorName returns [String current=null] : iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF ;
    public final String entryRuleEssentialOCLNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperatorName = null;


        try {
            // InternalMyOcl.g:1855:74: (iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF )
            // InternalMyOcl.g:1856:2: iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF
            {
             newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEssentialOCLNavigationOperatorName=ruleEssentialOCLNavigationOperatorName();

            state._fsp--;

             current =iv_ruleEssentialOCLNavigationOperatorName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLNavigationOperatorName"


    // $ANTLR start "ruleEssentialOCLNavigationOperatorName"
    // InternalMyOcl.g:1862:1: ruleEssentialOCLNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperator_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:1868:2: (this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator )
            // InternalMyOcl.g:1869:2: this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator
            {

            		newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getEssentialOCLNavigationOperatorParserRuleCall());
            	
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
    // $ANTLR end "ruleEssentialOCLNavigationOperatorName"


    // $ANTLR start "entryRuleEssentialOCLPrefixOperator"
    // InternalMyOcl.g:1882:1: entryRuleEssentialOCLPrefixOperator returns [String current=null] : iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF ;
    public final String entryRuleEssentialOCLPrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLPrefixOperator = null;


        try {
            // InternalMyOcl.g:1882:66: (iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF )
            // InternalMyOcl.g:1883:2: iv_ruleEssentialOCLPrefixOperator= ruleEssentialOCLPrefixOperator EOF
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
    // InternalMyOcl.g:1889:1: ruleEssentialOCLPrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLPrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyOcl.g:1895:2: ( (kw= '-' | kw= 'not' ) )
            // InternalMyOcl.g:1896:2: (kw= '-' | kw= 'not' )
            {
            // InternalMyOcl.g:1896:2: (kw= '-' | kw= 'not' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            else if ( (LA38_0==45) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyOcl.g:1897:3: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLPrefixOperatorAccess().getHyphenMinusKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyOcl.g:1903:3: kw= 'not'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

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
    // InternalMyOcl.g:1912:1: entryRuleEssentialOCLInfixOperator returns [String current=null] : iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF ;
    public final String entryRuleEssentialOCLInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperator = null;


        try {
            // InternalMyOcl.g:1912:65: (iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF )
            // InternalMyOcl.g:1913:2: iv_ruleEssentialOCLInfixOperator= ruleEssentialOCLInfixOperator EOF
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
    // InternalMyOcl.g:1919:1: ruleEssentialOCLInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyOcl.g:1925:2: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) )
            // InternalMyOcl.g:1926:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            {
            // InternalMyOcl.g:1926:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            int alt39=14;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt39=1;
                }
                break;
            case 47:
                {
                alt39=2;
                }
                break;
            case 48:
                {
                alt39=3;
                }
                break;
            case 44:
                {
                alt39=4;
                }
                break;
            case 42:
                {
                alt39=5;
                }
                break;
            case 41:
                {
                alt39=6;
                }
                break;
            case 49:
                {
                alt39=7;
                }
                break;
            case 50:
                {
                alt39=8;
                }
                break;
            case 28:
                {
                alt39=9;
                }
                break;
            case 51:
                {
                alt39=10;
                }
                break;
            case 52:
                {
                alt39=11;
                }
                break;
            case 53:
                {
                alt39=12;
                }
                break;
            case 54:
                {
                alt39=13;
                }
                break;
            case 55:
                {
                alt39=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalMyOcl.g:1927:3: kw= '*'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyOcl.g:1933:3: kw= '/'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyOcl.g:1939:3: kw= '+'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getPlusSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyOcl.g:1945:3: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getHyphenMinusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyOcl.g:1951:3: kw= '>'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyOcl.g:1957:3: kw= '<'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyOcl.g:1963:3: kw= '>='
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignEqualsSignKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyOcl.g:1969:3: kw= '<='
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignEqualsSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalMyOcl.g:1975:3: kw= '='
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getEqualsSignKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalMyOcl.g:1981:3: kw= '<>'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignGreaterThanSignKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalMyOcl.g:1987:3: kw= 'and'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getAndKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalMyOcl.g:1993:3: kw= 'or'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getOrKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalMyOcl.g:1999:3: kw= 'xor'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorAccess().getXorKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalMyOcl.g:2005:3: kw= 'implies'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

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
    // InternalMyOcl.g:2014:1: entryRuleEssentialOCLNavigationOperator returns [String current=null] : iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF ;
    public final String entryRuleEssentialOCLNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperator = null;


        try {
            // InternalMyOcl.g:2014:70: (iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF )
            // InternalMyOcl.g:2015:2: iv_ruleEssentialOCLNavigationOperator= ruleEssentialOCLNavigationOperator EOF
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
    // InternalMyOcl.g:2021:1: ruleEssentialOCLNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyOcl.g:2027:2: ( (kw= '.' | kw= '->' ) )
            // InternalMyOcl.g:2028:2: (kw= '.' | kw= '->' )
            {
            // InternalMyOcl.g:2028:2: (kw= '.' | kw= '->' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==56) ) {
                alt40=1;
            }
            else if ( (LA40_0==57) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyOcl.g:2029:3: kw= '.'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorAccess().getFullStopKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyOcl.g:2035:3: kw= '->'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

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
    // InternalMyOcl.g:2044:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalMyOcl.g:2044:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMyOcl.g:2045:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalMyOcl.g:2051:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;


        	enterRule();

        try {
            // InternalMyOcl.g:2057:2: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // InternalMyOcl.g:2058:2: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
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
    // InternalMyOcl.g:2068:1: entryRulePrefixOperator returns [String current=null] : iv_rulePrefixOperator= rulePrefixOperator EOF ;
    public final String entryRulePrefixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixOperator = null;


        try {
            // InternalMyOcl.g:2068:54: (iv_rulePrefixOperator= rulePrefixOperator EOF )
            // InternalMyOcl.g:2069:2: iv_rulePrefixOperator= rulePrefixOperator EOF
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
    // InternalMyOcl.g:2075:1: rulePrefixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator ;
    public final AntlrDatatypeRuleToken rulePrefixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLPrefixOperator_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:2081:2: (this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator )
            // InternalMyOcl.g:2082:2: this_EssentialOCLPrefixOperator_0= ruleEssentialOCLPrefixOperator
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
    // InternalMyOcl.g:2095:1: entryRuleInfixOperator returns [String current=null] : iv_ruleInfixOperator= ruleInfixOperator EOF ;
    public final String entryRuleInfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperator = null;


        try {
            // InternalMyOcl.g:2095:53: (iv_ruleInfixOperator= ruleInfixOperator EOF )
            // InternalMyOcl.g:2096:2: iv_ruleInfixOperator= ruleInfixOperator EOF
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
    // InternalMyOcl.g:2102:1: ruleInfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator ;
    public final AntlrDatatypeRuleToken ruleInfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperator_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:2108:2: (this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator )
            // InternalMyOcl.g:2109:2: this_EssentialOCLInfixOperator_0= ruleEssentialOCLInfixOperator
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
    // InternalMyOcl.g:2122:1: entryRuleNavigationOperator returns [String current=null] : iv_ruleNavigationOperator= ruleNavigationOperator EOF ;
    public final String entryRuleNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperator = null;


        try {
            // InternalMyOcl.g:2122:58: (iv_ruleNavigationOperator= ruleNavigationOperator EOF )
            // InternalMyOcl.g:2123:2: iv_ruleNavigationOperator= ruleNavigationOperator EOF
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
    // InternalMyOcl.g:2129:1: ruleNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator ;
    public final AntlrDatatypeRuleToken ruleNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperator_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:2135:2: (this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator )
            // InternalMyOcl.g:2136:2: this_EssentialOCLNavigationOperator_0= ruleEssentialOCLNavigationOperator
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
    // InternalMyOcl.g:2149:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // InternalMyOcl.g:2149:68: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // InternalMyOcl.g:2150:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
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
    // InternalMyOcl.g:2156:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SIMPLE_ID_0= RULE_SIMPLE_ID ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;


        	enterRule();

        try {
            // InternalMyOcl.g:2162:2: (this_SIMPLE_ID_0= RULE_SIMPLE_ID )
            // InternalMyOcl.g:2163:2: this_SIMPLE_ID_0= RULE_SIMPLE_ID
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


    // $ANTLR start "entryRuleUnrestrictedName2"
    // InternalMyOcl.g:2173:1: entryRuleUnrestrictedName2 returns [String current=null] : iv_ruleUnrestrictedName2= ruleUnrestrictedName2 EOF ;
    public final String entryRuleUnrestrictedName2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName2 = null;


        try {
            // InternalMyOcl.g:2173:57: (iv_ruleUnrestrictedName2= ruleUnrestrictedName2 EOF )
            // InternalMyOcl.g:2174:2: iv_ruleUnrestrictedName2= ruleUnrestrictedName2 EOF
            {
             newCompositeNode(grammarAccess.getUnrestrictedName2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnrestrictedName2=ruleUnrestrictedName2();

            state._fsp--;

             current =iv_ruleUnrestrictedName2.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnrestrictedName2"


    // $ANTLR start "ruleUnrestrictedName2"
    // InternalMyOcl.g:2180:1: ruleUnrestrictedName2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:2186:2: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // InternalMyOcl.g:2187:2: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
            {

            		newCompositeNode(grammarAccess.getUnrestrictedName2Access().getEssentialOCLUnrestrictedNameParserRuleCall());
            	
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
    // $ANTLR end "ruleUnrestrictedName2"


    // $ANTLR start "entryRuleEssentialOCLUnreservedName"
    // InternalMyOcl.g:2200:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // InternalMyOcl.g:2200:66: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // InternalMyOcl.g:2201:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
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
    // InternalMyOcl.g:2207:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:2213:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) )
            // InternalMyOcl.g:2214:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            {
            // InternalMyOcl.g:2214:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            int alt41=4;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
            case 29:
            case 30:
            case 31:
                {
                alt41=1;
                }
                break;
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                {
                alt41=2;
                }
                break;
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt41=3;
                }
                break;
            case 58:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalMyOcl.g:2215:3: this_UnrestrictedName_0= ruleUnrestrictedName
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
                    // InternalMyOcl.g:2226:3: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
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
                    // InternalMyOcl.g:2237:3: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
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
                    // InternalMyOcl.g:2248:3: kw= 'Tuple'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

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
    // InternalMyOcl.g:2257:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // InternalMyOcl.g:2257:54: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // InternalMyOcl.g:2258:2: iv_ruleUnreservedName= ruleUnreservedName EOF
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
    // InternalMyOcl.g:2264:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:2270:2: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // InternalMyOcl.g:2271:2: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
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
    // InternalMyOcl.g:2284:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // InternalMyOcl.g:2284:63: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // InternalMyOcl.g:2285:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
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
    // InternalMyOcl.g:2291:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyOcl.g:2297:2: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // InternalMyOcl.g:2298:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // InternalMyOcl.g:2298:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt42=8;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt42=1;
                }
                break;
            case 60:
                {
                alt42=2;
                }
                break;
            case 61:
                {
                alt42=3;
                }
                break;
            case 62:
                {
                alt42=4;
                }
                break;
            case 63:
                {
                alt42=5;
                }
                break;
            case 64:
                {
                alt42=6;
                }
                break;
            case 65:
                {
                alt42=7;
                }
                break;
            case 66:
                {
                alt42=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalMyOcl.g:2299:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyOcl.g:2305:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyOcl.g:2311:3: kw= 'Real'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyOcl.g:2317:3: kw= 'String'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyOcl.g:2323:3: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyOcl.g:2329:3: kw= 'OclAny'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyOcl.g:2335:3: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyOcl.g:2341:3: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

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
    // InternalMyOcl.g:2350:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // InternalMyOcl.g:2350:56: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // InternalMyOcl.g:2351:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
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
    // InternalMyOcl.g:2357:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:2363:2: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // InternalMyOcl.g:2364:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // InternalMyOcl.g:2364:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // InternalMyOcl.g:2365:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // InternalMyOcl.g:2365:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // InternalMyOcl.g:2366:4: lv_name_0_0= rulePrimitiveTypeIdentifier
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
            					"org.xtext.example.mydsl.MyOcl.PrimitiveTypeIdentifier");
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
    // InternalMyOcl.g:2386:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // InternalMyOcl.g:2386:64: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // InternalMyOcl.g:2387:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
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
    // InternalMyOcl.g:2393:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyOcl.g:2399:2: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // InternalMyOcl.g:2400:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // InternalMyOcl.g:2400:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt43=5;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt43=1;
                }
                break;
            case 68:
                {
                alt43=2;
                }
                break;
            case 69:
                {
                alt43=3;
                }
                break;
            case 70:
                {
                alt43=4;
                }
                break;
            case 71:
                {
                alt43=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalMyOcl.g:2401:3: kw= 'Set'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyOcl.g:2407:3: kw= 'Bag'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyOcl.g:2413:3: kw= 'Sequence'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyOcl.g:2419:3: kw= 'Collection'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyOcl.g:2425:3: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

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
    // InternalMyOcl.g:2434:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // InternalMyOcl.g:2434:57: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // InternalMyOcl.g:2435:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
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
    // InternalMyOcl.g:2441:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? ) ;
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
            // InternalMyOcl.g:2447:2: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? ) )
            // InternalMyOcl.g:2448:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? )
            {
            // InternalMyOcl.g:2448:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )? )
            // InternalMyOcl.g:2449:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )?
            {
            // InternalMyOcl.g:2449:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // InternalMyOcl.g:2450:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // InternalMyOcl.g:2450:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // InternalMyOcl.g:2451:5: lv_name_0_0= ruleCollectionTypeIdentifier
            {

            					newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_name_0_0=ruleCollectionTypeIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyOcl.CollectionTypeIdentifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyOcl.g:2468:3: ( (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) | (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' ) )?
            int alt44=3;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==22) ) {
                alt44=1;
            }
            else if ( (LA44_0==41) ) {
                alt44=2;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyOcl.g:2469:4: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
                    {
                    // InternalMyOcl.g:2469:4: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
                    // InternalMyOcl.g:2470:5: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_20); 

                    					newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalMyOcl.g:2474:5: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyOcl.g:2475:6: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyOcl.g:2475:6: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyOcl.g:2476:7: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    							newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_11);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                    							}
                    							set(
                    								current,
                    								"ownedType",
                    								lv_ownedType_2_0,
                    								"org.xtext.example.mydsl.MyOcl.TypeExpCS");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyOcl.g:2499:4: (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' )
                    {
                    // InternalMyOcl.g:2499:4: (otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>' )
                    // InternalMyOcl.g:2500:5: otherlv_4= '<' ( (lv_ownedType_5_0= ruleTypeExpCS ) ) otherlv_6= '>'
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_20); 

                    					newLeafNode(otherlv_4, grammarAccess.getCollectionTypeCSAccess().getLessThanSignKeyword_1_1_0());
                    				
                    // InternalMyOcl.g:2504:5: ( (lv_ownedType_5_0= ruleTypeExpCS ) )
                    // InternalMyOcl.g:2505:6: (lv_ownedType_5_0= ruleTypeExpCS )
                    {
                    // InternalMyOcl.g:2505:6: (lv_ownedType_5_0= ruleTypeExpCS )
                    // InternalMyOcl.g:2506:7: lv_ownedType_5_0= ruleTypeExpCS
                    {

                    							newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_33);
                    lv_ownedType_5_0=ruleTypeExpCS();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                    							}
                    							set(
                    								current,
                    								"ownedType",
                    								lv_ownedType_5_0,
                    								"org.xtext.example.mydsl.MyOcl.TypeExpCS");
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


    // $ANTLR start "entryRuleTupleTypeCS"
    // InternalMyOcl.g:2533:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // InternalMyOcl.g:2533:52: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // InternalMyOcl.g:2534:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
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
    // InternalMyOcl.g:2540:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) ) ;
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
            // InternalMyOcl.g:2546:2: ( ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) ) )
            // InternalMyOcl.g:2547:2: ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) )
            {
            // InternalMyOcl.g:2547:2: ( ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) ) )
            // InternalMyOcl.g:2548:3: ( (lv_name_0_0= 'Tuple' ) ) ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )? ( (lv_backtrack_11_0= 'true' ) )
            {
            // InternalMyOcl.g:2548:3: ( (lv_name_0_0= 'Tuple' ) )
            // InternalMyOcl.g:2549:4: (lv_name_0_0= 'Tuple' )
            {
            // InternalMyOcl.g:2549:4: (lv_name_0_0= 'Tuple' )
            // InternalMyOcl.g:2550:5: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,58,FOLLOW_34); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTupleTypeCSAccess().getNameTupleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTupleTypeCSRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Tuple");
            				

            }


            }

            // InternalMyOcl.g:2562:3: ( (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' ) | (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' ) )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==22) ) {
                alt49=1;
            }
            else if ( (LA49_0==41) ) {
                alt49=2;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyOcl.g:2563:4: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' )
                    {
                    // InternalMyOcl.g:2563:4: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')' )
                    // InternalMyOcl.g:2564:5: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_16); 

                    					newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalMyOcl.g:2568:5: ( ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )* )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_SIMPLE_ID||(LA46_0>=29 && LA46_0<=31)) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalMyOcl.g:2569:6: ( (lv_ownedParts_2_0= ruletuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )*
                            {
                            // InternalMyOcl.g:2569:6: ( (lv_ownedParts_2_0= ruletuplePartCS ) )
                            // InternalMyOcl.g:2570:7: (lv_ownedParts_2_0= ruletuplePartCS )
                            {
                            // InternalMyOcl.g:2570:7: (lv_ownedParts_2_0= ruletuplePartCS )
                            // InternalMyOcl.g:2571:8: lv_ownedParts_2_0= ruletuplePartCS
                            {

                            								newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_0_1_0_0());
                            							
                            pushFollow(FOLLOW_17);
                            lv_ownedParts_2_0=ruletuplePartCS();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            								}
                            								add(
                            									current,
                            									"ownedParts",
                            									lv_ownedParts_2_0,
                            									"org.xtext.example.mydsl.MyOcl.tuplePartCS");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMyOcl.g:2588:6: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==27) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // InternalMyOcl.g:2589:7: otherlv_3= ',' ( (lv_ownedParts_4_0= ruletuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,27,FOLLOW_14); 

                            	    							newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_0_1_1_0());
                            	    						
                            	    // InternalMyOcl.g:2593:7: ( (lv_ownedParts_4_0= ruletuplePartCS ) )
                            	    // InternalMyOcl.g:2594:8: (lv_ownedParts_4_0= ruletuplePartCS )
                            	    {
                            	    // InternalMyOcl.g:2594:8: (lv_ownedParts_4_0= ruletuplePartCS )
                            	    // InternalMyOcl.g:2595:9: lv_ownedParts_4_0= ruletuplePartCS
                            	    {

                            	    									newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_0_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_17);
                            	    lv_ownedParts_4_0=ruletuplePartCS();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"ownedParts",
                            	    										lv_ownedParts_4_0,
                            	    										"org.xtext.example.mydsl.MyOcl.tuplePartCS");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_35); 

                    					newLeafNode(otherlv_5, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyOcl.g:2620:4: (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' )
                    {
                    // InternalMyOcl.g:2620:4: (otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>' )
                    // InternalMyOcl.g:2621:5: otherlv_6= '<' ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )? otherlv_10= '>'
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_36); 

                    					newLeafNode(otherlv_6, grammarAccess.getTupleTypeCSAccess().getLessThanSignKeyword_1_1_0());
                    				
                    // InternalMyOcl.g:2625:5: ( ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )* )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_SIMPLE_ID||(LA48_0>=29 && LA48_0<=31)) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalMyOcl.g:2626:6: ( (lv_ownedParts_7_0= ruletuplePartCS ) ) (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )*
                            {
                            // InternalMyOcl.g:2626:6: ( (lv_ownedParts_7_0= ruletuplePartCS ) )
                            // InternalMyOcl.g:2627:7: (lv_ownedParts_7_0= ruletuplePartCS )
                            {
                            // InternalMyOcl.g:2627:7: (lv_ownedParts_7_0= ruletuplePartCS )
                            // InternalMyOcl.g:2628:8: lv_ownedParts_7_0= ruletuplePartCS
                            {

                            								newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_0_0());
                            							
                            pushFollow(FOLLOW_31);
                            lv_ownedParts_7_0=ruletuplePartCS();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            								}
                            								add(
                            									current,
                            									"ownedParts",
                            									lv_ownedParts_7_0,
                            									"org.xtext.example.mydsl.MyOcl.tuplePartCS");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMyOcl.g:2645:6: (otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) ) )*
                            loop47:
                            do {
                                int alt47=2;
                                int LA47_0 = input.LA(1);

                                if ( (LA47_0==27) ) {
                                    alt47=1;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // InternalMyOcl.g:2646:7: otherlv_8= ',' ( (lv_ownedParts_9_0= ruletuplePartCS ) )
                            	    {
                            	    otherlv_8=(Token)match(input,27,FOLLOW_14); 

                            	    							newLeafNode(otherlv_8, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_1_0());
                            	    						
                            	    // InternalMyOcl.g:2650:7: ( (lv_ownedParts_9_0= ruletuplePartCS ) )
                            	    // InternalMyOcl.g:2651:8: (lv_ownedParts_9_0= ruletuplePartCS )
                            	    {
                            	    // InternalMyOcl.g:2651:8: (lv_ownedParts_9_0= ruletuplePartCS )
                            	    // InternalMyOcl.g:2652:9: lv_ownedParts_9_0= ruletuplePartCS
                            	    {

                            	    									newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_31);
                            	    lv_ownedParts_9_0=ruletuplePartCS();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"ownedParts",
                            	    										lv_ownedParts_9_0,
                            	    										"org.xtext.example.mydsl.MyOcl.tuplePartCS");
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

                    otherlv_10=(Token)match(input,42,FOLLOW_35); 

                    					newLeafNode(otherlv_10, grammarAccess.getTupleTypeCSAccess().getGreaterThanSignKeyword_1_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalMyOcl.g:2677:3: ( (lv_backtrack_11_0= 'true' ) )
            // InternalMyOcl.g:2678:4: (lv_backtrack_11_0= 'true' )
            {
            // InternalMyOcl.g:2678:4: (lv_backtrack_11_0= 'true' )
            // InternalMyOcl.g:2679:5: lv_backtrack_11_0= 'true'
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
    // InternalMyOcl.g:2695:1: entryRuletuplePartCS returns [EObject current=null] : iv_ruletuplePartCS= ruletuplePartCS EOF ;
    public final EObject entryRuletuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletuplePartCS = null;


        try {
            // InternalMyOcl.g:2695:52: (iv_ruletuplePartCS= ruletuplePartCS EOF )
            // InternalMyOcl.g:2696:2: iv_ruletuplePartCS= ruletuplePartCS EOF
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
    // InternalMyOcl.g:2702:1: ruletuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruletuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:2708:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalMyOcl.g:2709:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalMyOcl.g:2709:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalMyOcl.g:2710:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalMyOcl.g:2710:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyOcl.g:2711:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyOcl.g:2711:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyOcl.g:2712:5: lv_name_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyOcl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
            		
            // InternalMyOcl.g:2733:3: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalMyOcl.g:2734:4: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalMyOcl.g:2734:4: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalMyOcl.g:2735:5: lv_ownedType_2_0= ruleTypeExpCS
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
            						"org.xtext.example.mydsl.MyOcl.TypeExpCS");
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


    // $ANTLR start "entryRuleCollectionLiteralExpCS"
    // InternalMyOcl.g:2756:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // InternalMyOcl.g:2756:63: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // InternalMyOcl.g:2757:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
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
    // InternalMyOcl.g:2763:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
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
            // InternalMyOcl.g:2769:2: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalMyOcl.g:2770:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalMyOcl.g:2770:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalMyOcl.g:2771:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalMyOcl.g:2771:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalMyOcl.g:2772:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalMyOcl.g:2772:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalMyOcl.g:2773:5: lv_ownedType_0_0= ruleCollectionTypeCS
            {

            					newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
            					}
            					set(
            						current,
            						"ownedType",
            						lv_ownedType_0_0,
            						"org.xtext.example.mydsl.MyOcl.CollectionTypeCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,73,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyOcl.g:2794:3: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_SIMPLE_ID||(LA51_0>=RULE_SINGLE_QUOTED_STRING && LA51_0<=RULE_BIG_INT)||LA51_0==22||(LA51_0>=29 && LA51_0<=31)||(LA51_0>=44 && LA51_0<=46)||LA51_0==58||(LA51_0>=67 && LA51_0<=72)||(LA51_0>=76 && LA51_0<=78)||LA51_0==81||LA51_0==85||LA51_0==87) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyOcl.g:2795:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // InternalMyOcl.g:2795:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // InternalMyOcl.g:2796:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // InternalMyOcl.g:2796:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // InternalMyOcl.g:2797:6: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {

                    						newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_ownedParts_2_0=ruleCollectionLiteralPartCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                    						}
                    						add(
                    							current,
                    							"ownedParts",
                    							lv_ownedParts_2_0,
                    							"org.xtext.example.mydsl.MyOcl.CollectionLiteralPartCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyOcl.g:2814:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==27) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalMyOcl.g:2815:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FOLLOW_40); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMyOcl.g:2819:5: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // InternalMyOcl.g:2820:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // InternalMyOcl.g:2820:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // InternalMyOcl.g:2821:7: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
                    	    lv_ownedParts_4_0=ruleCollectionLiteralPartCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedParts",
                    	    								lv_ownedParts_4_0,
                    	    								"org.xtext.example.mydsl.MyOcl.CollectionLiteralPartCS");
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

            otherlv_5=(Token)match(input,74,FOLLOW_2); 

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
    // InternalMyOcl.g:2848:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // InternalMyOcl.g:2848:64: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // InternalMyOcl.g:2849:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
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
    // InternalMyOcl.g:2855:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressionCS_0_0 = null;

        EObject lv_lastExpressionCS_2_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:2861:2: ( ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) )
            // InternalMyOcl.g:2862:2: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            {
            // InternalMyOcl.g:2862:2: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            // InternalMyOcl.g:2863:3: ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            {
            // InternalMyOcl.g:2863:3: ( (lv_expressionCS_0_0= ruleExpCS ) )
            // InternalMyOcl.g:2864:4: (lv_expressionCS_0_0= ruleExpCS )
            {
            // InternalMyOcl.g:2864:4: (lv_expressionCS_0_0= ruleExpCS )
            // InternalMyOcl.g:2865:5: lv_expressionCS_0_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSExpCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
            lv_expressionCS_0_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
            					}
            					set(
            						current,
            						"expressionCS",
            						lv_expressionCS_0_0,
            						"org.xtext.example.mydsl.MyOcl.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyOcl.g:2882:3: (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==75) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyOcl.g:2883:4: otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    {
                    otherlv_1=(Token)match(input,75,FOLLOW_40); 

                    				newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_1_0());
                    			
                    // InternalMyOcl.g:2887:4: ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    // InternalMyOcl.g:2888:5: (lv_lastExpressionCS_2_0= ruleExpCS )
                    {
                    // InternalMyOcl.g:2888:5: (lv_lastExpressionCS_2_0= ruleExpCS )
                    // InternalMyOcl.g:2889:6: lv_lastExpressionCS_2_0= ruleExpCS
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
                    							"org.xtext.example.mydsl.MyOcl.ExpCS");
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
    // InternalMyOcl.g:2911:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // InternalMyOcl.g:2911:62: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // InternalMyOcl.g:2912:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
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
    // InternalMyOcl.g:2918:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
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
            // InternalMyOcl.g:2924:2: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // InternalMyOcl.g:2925:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // InternalMyOcl.g:2925:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt53=6;
            switch ( input.LA(1) ) {
            case RULE_BIG_INT:
                {
                alt53=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt53=2;
                }
                break;
            case 72:
            case 76:
                {
                alt53=3;
                }
                break;
            case 46:
                {
                alt53=4;
                }
                break;
            case 77:
                {
                alt53=5;
                }
                break;
            case 78:
                {
                alt53=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalMyOcl.g:2926:3: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
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
                    // InternalMyOcl.g:2935:3: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
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
                    // InternalMyOcl.g:2944:3: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
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
                    // InternalMyOcl.g:2953:3: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
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
                    // InternalMyOcl.g:2962:3: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
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
                    // InternalMyOcl.g:2971:3: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
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
    // InternalMyOcl.g:2983:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // InternalMyOcl.g:2983:58: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // InternalMyOcl.g:2984:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
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
    // InternalMyOcl.g:2990:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
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
            // InternalMyOcl.g:2996:2: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // InternalMyOcl.g:2997:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // InternalMyOcl.g:2997:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // InternalMyOcl.g:2998:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
            		
            otherlv_1=(Token)match(input,73,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyOcl.g:3006:3: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // InternalMyOcl.g:3007:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // InternalMyOcl.g:3007:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // InternalMyOcl.g:3008:5: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {

            					newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_ownedParts_2_0=ruleTupleLiteralPartCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            					}
            					add(
            						current,
            						"ownedParts",
            						lv_ownedParts_2_0,
            						"org.xtext.example.mydsl.MyOcl.TupleLiteralPartCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyOcl.g:3025:3: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==27) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalMyOcl.g:3026:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_14); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyOcl.g:3030:4: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // InternalMyOcl.g:3031:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // InternalMyOcl.g:3031:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // InternalMyOcl.g:3032:6: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {

            	    						newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_ownedParts_4_0=ruleTupleLiteralPartCS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedParts",
            	    							lv_ownedParts_4_0,
            	    							"org.xtext.example.mydsl.MyOcl.TupleLiteralPartCS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_5=(Token)match(input,74,FOLLOW_2); 

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
    // InternalMyOcl.g:3058:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // InternalMyOcl.g:3058:59: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // InternalMyOcl.g:3059:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
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
    // InternalMyOcl.g:3065:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:3071:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // InternalMyOcl.g:3072:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // InternalMyOcl.g:3072:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // InternalMyOcl.g:3073:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // InternalMyOcl.g:3073:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyOcl.g:3074:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyOcl.g:3074:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyOcl.g:3075:5: lv_name_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyOcl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyOcl.g:3092:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==24) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyOcl.g:3093:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyOcl.g:3097:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyOcl.g:3098:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyOcl.g:3098:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyOcl.g:3099:6: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_2_0,
                    							"org.xtext.example.mydsl.MyOcl.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,28,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
            		
            // InternalMyOcl.g:3121:3: ( (lv_initExpression_4_0= ruleExpCS ) )
            // InternalMyOcl.g:3122:4: (lv_initExpression_4_0= ruleExpCS )
            {
            // InternalMyOcl.g:3122:4: (lv_initExpression_4_0= ruleExpCS )
            // InternalMyOcl.g:3123:5: lv_initExpression_4_0= ruleExpCS
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
            						"org.xtext.example.mydsl.MyOcl.ExpCS");
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
    // InternalMyOcl.g:3144:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // InternalMyOcl.g:3144:59: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // InternalMyOcl.g:3145:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
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
    // InternalMyOcl.g:3151:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= RULE_BIG_INT ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyOcl.g:3157:2: ( ( (lv_name_0_0= RULE_BIG_INT ) ) )
            // InternalMyOcl.g:3158:2: ( (lv_name_0_0= RULE_BIG_INT ) )
            {
            // InternalMyOcl.g:3158:2: ( (lv_name_0_0= RULE_BIG_INT ) )
            // InternalMyOcl.g:3159:3: (lv_name_0_0= RULE_BIG_INT )
            {
            // InternalMyOcl.g:3159:3: (lv_name_0_0= RULE_BIG_INT )
            // InternalMyOcl.g:3160:4: lv_name_0_0= RULE_BIG_INT
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
            					"org.xtext.example.mydsl.MyOcl.BIG_INT");
            			

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
    // InternalMyOcl.g:3179:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // InternalMyOcl.g:3179:59: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // InternalMyOcl.g:3180:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
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
    // InternalMyOcl.g:3186:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleStringLiteral ) ) ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:3192:2: ( ( (lv_name_0_0= ruleStringLiteral ) ) )
            // InternalMyOcl.g:3193:2: ( (lv_name_0_0= ruleStringLiteral ) )
            {
            // InternalMyOcl.g:3193:2: ( (lv_name_0_0= ruleStringLiteral ) )
            // InternalMyOcl.g:3194:3: (lv_name_0_0= ruleStringLiteral )
            {
            // InternalMyOcl.g:3194:3: (lv_name_0_0= ruleStringLiteral )
            // InternalMyOcl.g:3195:4: lv_name_0_0= ruleStringLiteral
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
            					"org.xtext.example.mydsl.MyOcl.StringLiteral");
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
    // InternalMyOcl.g:3215:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // InternalMyOcl.g:3215:60: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // InternalMyOcl.g:3216:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
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
    // InternalMyOcl.g:3222:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyOcl.g:3228:2: ( ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) )
            // InternalMyOcl.g:3229:2: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            {
            // InternalMyOcl.g:3229:2: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==72) ) {
                alt56=1;
            }
            else if ( (LA56_0==76) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyOcl.g:3230:3: ( (lv_name_0_0= 'true' ) )
                    {
                    // InternalMyOcl.g:3230:3: ( (lv_name_0_0= 'true' ) )
                    // InternalMyOcl.g:3231:4: (lv_name_0_0= 'true' )
                    {
                    // InternalMyOcl.g:3231:4: (lv_name_0_0= 'true' )
                    // InternalMyOcl.g:3232:5: lv_name_0_0= 'true'
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
                    // InternalMyOcl.g:3245:3: ( (lv_name_1_0= 'false' ) )
                    {
                    // InternalMyOcl.g:3245:3: ( (lv_name_1_0= 'false' ) )
                    // InternalMyOcl.g:3246:4: (lv_name_1_0= 'false' )
                    {
                    // InternalMyOcl.g:3246:4: (lv_name_1_0= 'false' )
                    // InternalMyOcl.g:3247:5: lv_name_1_0= 'false'
                    {
                    lv_name_1_0=(Token)match(input,76,FOLLOW_2); 

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
    // InternalMyOcl.g:3263:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // InternalMyOcl.g:3263:69: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // InternalMyOcl.g:3264:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
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
    // InternalMyOcl.g:3270:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyOcl.g:3276:2: ( ( () otherlv_1= '*' ) )
            // InternalMyOcl.g:3277:2: ( () otherlv_1= '*' )
            {
            // InternalMyOcl.g:3277:2: ( () otherlv_1= '*' )
            // InternalMyOcl.g:3278:3: () otherlv_1= '*'
            {
            // InternalMyOcl.g:3278:3: ()
            // InternalMyOcl.g:3279:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

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
    // InternalMyOcl.g:3293:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // InternalMyOcl.g:3293:60: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // InternalMyOcl.g:3294:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
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
    // InternalMyOcl.g:3300:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyOcl.g:3306:2: ( ( () otherlv_1= 'invalid' ) )
            // InternalMyOcl.g:3307:2: ( () otherlv_1= 'invalid' )
            {
            // InternalMyOcl.g:3307:2: ( () otherlv_1= 'invalid' )
            // InternalMyOcl.g:3308:3: () otherlv_1= 'invalid'
            {
            // InternalMyOcl.g:3308:3: ()
            // InternalMyOcl.g:3309:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_2); 

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
    // InternalMyOcl.g:3323:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // InternalMyOcl.g:3323:57: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // InternalMyOcl.g:3324:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
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
    // InternalMyOcl.g:3330:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyOcl.g:3336:2: ( ( () otherlv_1= 'null' ) )
            // InternalMyOcl.g:3337:2: ( () otherlv_1= 'null' )
            {
            // InternalMyOcl.g:3337:2: ( () otherlv_1= 'null' )
            // InternalMyOcl.g:3338:3: () otherlv_1= 'null'
            {
            // InternalMyOcl.g:3338:3: ()
            // InternalMyOcl.g:3339:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_2); 

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
    // InternalMyOcl.g:3353:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // InternalMyOcl.g:3353:54: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // InternalMyOcl.g:3354:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
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
    // InternalMyOcl.g:3360:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_TupleTypeCS_1 = null;

        EObject this_CollectionTypeCS_2 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:3366:2: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS ) )
            // InternalMyOcl.g:3367:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS )
            {
            // InternalMyOcl.g:3367:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_TupleTypeCS_1= ruleTupleTypeCS | this_CollectionTypeCS_2= ruleCollectionTypeCS )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt57=1;
                }
                break;
            case 58:
                {
                alt57=2;
                }
                break;
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalMyOcl.g:3368:3: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
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
                    // InternalMyOcl.g:3377:3: this_TupleTypeCS_1= ruleTupleTypeCS
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
                    // InternalMyOcl.g:3386:3: this_CollectionTypeCS_2= ruleCollectionTypeCS
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
    // InternalMyOcl.g:3398:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // InternalMyOcl.g:3398:54: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // InternalMyOcl.g:3399:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
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
    // InternalMyOcl.g:3405:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) ;
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
            // InternalMyOcl.g:3411:2: ( ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) )
            // InternalMyOcl.g:3412:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            {
            // InternalMyOcl.g:3412:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            int alt59=2;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
                {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==EOF||LA59_1==18||LA59_1==23||(LA59_1>=27 && LA59_1<=28)||(LA59_1>=33 && LA59_1<=39)||LA59_1==42||(LA59_1>=79 && LA59_1<=80)) ) {
                    alt59=2;
                }
                else if ( (LA59_1==40) ) {
                    alt59=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                int LA59_2 = input.LA(2);

                if ( (LA59_2==EOF||LA59_2==18||LA59_2==23||(LA59_2>=27 && LA59_2<=28)||(LA59_2>=33 && LA59_2<=39)||LA59_2==42||(LA59_2>=79 && LA59_2<=80)) ) {
                    alt59=2;
                }
                else if ( (LA59_2==40) ) {
                    alt59=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 2, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                int LA59_3 = input.LA(2);

                if ( (LA59_3==EOF||LA59_3==18||LA59_3==23||(LA59_3>=27 && LA59_3<=28)||(LA59_3>=33 && LA59_3<=39)||LA59_3==42||(LA59_3>=79 && LA59_3<=80)) ) {
                    alt59=2;
                }
                else if ( (LA59_3==40) ) {
                    alt59=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 3, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                int LA59_4 = input.LA(2);

                if ( (LA59_4==40) ) {
                    alt59=1;
                }
                else if ( (LA59_4==EOF||LA59_4==18||LA59_4==23||(LA59_4>=27 && LA59_4<=28)||(LA59_4>=33 && LA59_4<=39)||LA59_4==42||(LA59_4>=79 && LA59_4<=80)) ) {
                    alt59=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalMyOcl.g:3413:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    {
                    // InternalMyOcl.g:3413:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    // InternalMyOcl.g:3414:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) )
                    {
                    // InternalMyOcl.g:3414:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* )
                    // InternalMyOcl.g:3415:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    {
                    // InternalMyOcl.g:3415:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) )
                    // InternalMyOcl.g:3416:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    {
                    // InternalMyOcl.g:3416:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    // InternalMyOcl.g:3417:7: lv_namespace_0_0= ruleUnrestrictedName
                    {

                    							newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getNamespaceUnrestrictedNameParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_28);
                    lv_namespace_0_0=ruleUnrestrictedName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                    							}
                    							add(
                    								current,
                    								"namespace",
                    								lv_namespace_0_0,
                    								"org.xtext.example.mydsl.MyOcl.UnrestrictedName");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,40,FOLLOW_20); 

                    					newLeafNode(otherlv_1, grammarAccess.getTypeNameExpCSAccess().getColonColonKeyword_0_0_1());
                    				
                    // InternalMyOcl.g:3438:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    loop58:
                    do {
                        int alt58=2;
                        alt58 = dfa58.predict(input);
                        switch (alt58) {
                    	case 1 :
                    	    // InternalMyOcl.g:3439:6: ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::'
                    	    {
                    	    // InternalMyOcl.g:3439:6: ( (lv_namespace_2_0= ruleUnreservedName ) )
                    	    // InternalMyOcl.g:3440:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    {
                    	    // InternalMyOcl.g:3440:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    // InternalMyOcl.g:3441:8: lv_namespace_2_0= ruleUnreservedName
                    	    {

                    	    								newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getNamespaceUnreservedNameParserRuleCall_0_0_2_0_0());
                    	    							
                    	    pushFollow(FOLLOW_28);
                    	    lv_namespace_2_0=ruleUnreservedName();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"namespace",
                    	    									lv_namespace_2_0,
                    	    									"org.xtext.example.mydsl.MyOcl.UnreservedName");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    otherlv_3=(Token)match(input,40,FOLLOW_20); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getTypeNameExpCSAccess().getColonColonKeyword_0_0_2_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }

                    // InternalMyOcl.g:3464:4: ( (lv_element_4_0= ruleUnreservedName ) )
                    // InternalMyOcl.g:3465:5: (lv_element_4_0= ruleUnreservedName )
                    {
                    // InternalMyOcl.g:3465:5: (lv_element_4_0= ruleUnreservedName )
                    // InternalMyOcl.g:3466:6: lv_element_4_0= ruleUnreservedName
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
                    							"org.xtext.example.mydsl.MyOcl.UnreservedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyOcl.g:3485:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    {
                    // InternalMyOcl.g:3485:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    // InternalMyOcl.g:3486:4: (lv_element_5_0= ruleUnrestrictedName )
                    {
                    // InternalMyOcl.g:3486:4: (lv_element_5_0= ruleUnrestrictedName )
                    // InternalMyOcl.g:3487:5: lv_element_5_0= ruleUnrestrictedName
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
                    						"org.xtext.example.mydsl.MyOcl.UnrestrictedName");
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
    // InternalMyOcl.g:3508:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // InternalMyOcl.g:3508:50: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // InternalMyOcl.g:3509:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
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
    // InternalMyOcl.g:3515:1: ruleTypeExpCS returns [EObject current=null] : (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:3521:2: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) )
            // InternalMyOcl.g:3522:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            {
            // InternalMyOcl.g:3522:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_SIMPLE_ID||(LA60_0>=29 && LA60_0<=31)) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=58 && LA60_0<=71)) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyOcl.g:3523:3: this_TypeNameExpCS_0= ruleTypeNameExpCS
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
                    // InternalMyOcl.g:3532:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
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
    // InternalMyOcl.g:3544:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // InternalMyOcl.g:3544:56: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // InternalMyOcl.g:3545:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
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
    // InternalMyOcl.g:3551:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_init_4_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:3557:2: ( ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? ) )
            // InternalMyOcl.g:3558:2: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )
            {
            // InternalMyOcl.g:3558:2: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )
            // InternalMyOcl.g:3559:3: ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
            {
            // InternalMyOcl.g:3559:3: ( (lv_name_0_0= ruleNavigatingArgExpCS ) )
            // InternalMyOcl.g:3560:4: (lv_name_0_0= ruleNavigatingArgExpCS )
            {
            // InternalMyOcl.g:3560:4: (lv_name_0_0= ruleNavigatingArgExpCS )
            // InternalMyOcl.g:3561:5: lv_name_0_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
            lv_name_0_0=ruleNavigatingArgExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyOcl.NavigatingArgExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyOcl.g:3578:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==24) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyOcl.g:3579:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyOcl.g:3583:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyOcl.g:3584:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyOcl.g:3584:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyOcl.g:3585:6: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_2_0,
                    							"org.xtext.example.mydsl.MyOcl.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyOcl.g:3603:3: (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==28) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMyOcl.g:3604:4: otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_40); 

                    				newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalMyOcl.g:3608:4: ( (lv_init_4_0= ruleExpCS ) )
                    // InternalMyOcl.g:3609:5: (lv_init_4_0= ruleExpCS )
                    {
                    // InternalMyOcl.g:3609:5: (lv_init_4_0= ruleExpCS )
                    // InternalMyOcl.g:3610:6: lv_init_4_0= ruleExpCS
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
                    							"org.xtext.example.mydsl.MyOcl.ExpCS");
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
    // InternalMyOcl.g:3632:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // InternalMyOcl.g:3632:59: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // InternalMyOcl.g:3633:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
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
    // InternalMyOcl.g:3639:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // InternalMyOcl.g:3645:2: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyOcl.g:3646:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyOcl.g:3646:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyOcl.g:3647:3: ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyOcl.g:3647:3: ( (lv_prefix_0_0= '|' ) )
            // InternalMyOcl.g:3648:4: (lv_prefix_0_0= '|' )
            {
            // InternalMyOcl.g:3648:4: (lv_prefix_0_0= '|' )
            // InternalMyOcl.g:3649:5: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,79,FOLLOW_45); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, "|");
            				

            }


            }

            // InternalMyOcl.g:3661:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyOcl.g:3662:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyOcl.g:3662:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyOcl.g:3663:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_43);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyOcl.NavigatingArgExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyOcl.g:3680:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==24) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMyOcl.g:3681:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyOcl.g:3685:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyOcl.g:3686:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyOcl.g:3686:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyOcl.g:3687:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_3_0,
                    							"org.xtext.example.mydsl.MyOcl.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyOcl.g:3705:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==28) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMyOcl.g:3706:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyOcl.g:3710:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyOcl.g:3711:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyOcl.g:3711:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyOcl.g:3712:6: lv_init_5_0= ruleExpCS
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
                    							"org.xtext.example.mydsl.MyOcl.ExpCS");
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
    // InternalMyOcl.g:3734:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // InternalMyOcl.g:3734:61: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // InternalMyOcl.g:3735:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
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
    // InternalMyOcl.g:3741:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // InternalMyOcl.g:3747:2: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyOcl.g:3748:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyOcl.g:3748:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyOcl.g:3749:3: ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyOcl.g:3749:3: ( (lv_prefix_0_0= ',' ) )
            // InternalMyOcl.g:3750:4: (lv_prefix_0_0= ',' )
            {
            // InternalMyOcl.g:3750:4: (lv_prefix_0_0= ',' )
            // InternalMyOcl.g:3751:5: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,27,FOLLOW_45); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ",");
            				

            }


            }

            // InternalMyOcl.g:3763:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyOcl.g:3764:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyOcl.g:3764:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyOcl.g:3765:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_43);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyOcl.NavigatingArgExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyOcl.g:3782:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==24) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyOcl.g:3783:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyOcl.g:3787:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyOcl.g:3788:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyOcl.g:3788:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyOcl.g:3789:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_3_0,
                    							"org.xtext.example.mydsl.MyOcl.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyOcl.g:3807:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==28) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalMyOcl.g:3808:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyOcl.g:3812:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyOcl.g:3813:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyOcl.g:3813:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyOcl.g:3814:6: lv_init_5_0= ruleExpCS
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
                    							"org.xtext.example.mydsl.MyOcl.ExpCS");
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
    // InternalMyOcl.g:3836:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // InternalMyOcl.g:3836:60: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // InternalMyOcl.g:3837:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
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
    // InternalMyOcl.g:3843:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) ;
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
            // InternalMyOcl.g:3849:2: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? ) )
            // InternalMyOcl.g:3850:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            {
            // InternalMyOcl.g:3850:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )
            // InternalMyOcl.g:3851:3: ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            {
            // InternalMyOcl.g:3851:3: ( (lv_prefix_0_0= ';' ) )
            // InternalMyOcl.g:3852:4: (lv_prefix_0_0= ';' )
            {
            // InternalMyOcl.g:3852:4: (lv_prefix_0_0= ';' )
            // InternalMyOcl.g:3853:5: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,80,FOLLOW_45); 

            					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
            					}
            					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ";");
            				

            }


            }

            // InternalMyOcl.g:3865:3: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // InternalMyOcl.g:3866:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // InternalMyOcl.g:3866:4: (lv_name_1_0= ruleNavigatingArgExpCS )
            // InternalMyOcl.g:3867:5: lv_name_1_0= ruleNavigatingArgExpCS
            {

            					newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_43);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyOcl.NavigatingArgExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyOcl.g:3884:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==24) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyOcl.g:3885:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                    			
                    // InternalMyOcl.g:3889:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalMyOcl.g:3890:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalMyOcl.g:3890:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalMyOcl.g:3891:6: lv_ownedType_3_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_3_0,
                    							"org.xtext.example.mydsl.MyOcl.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyOcl.g:3909:3: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==28) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalMyOcl.g:3910:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyOcl.g:3914:4: ( (lv_init_5_0= ruleExpCS ) )
                    // InternalMyOcl.g:3915:5: (lv_init_5_0= ruleExpCS )
                    {
                    // InternalMyOcl.g:3915:5: (lv_init_5_0= ruleExpCS )
                    // InternalMyOcl.g:3916:6: lv_init_5_0= ruleExpCS
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
                    							"org.xtext.example.mydsl.MyOcl.ExpCS");
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


    // $ANTLR start "entryRuleIfExpCS"
    // InternalMyOcl.g:3938:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // InternalMyOcl.g:3938:48: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // InternalMyOcl.g:3939:2: iv_ruleIfExpCS= ruleIfExpCS EOF
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
    // InternalMyOcl.g:3945:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) ;
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
            // InternalMyOcl.g:3951:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) )
            // InternalMyOcl.g:3952:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            {
            // InternalMyOcl.g:3952:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            // InternalMyOcl.g:3953:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
            		
            // InternalMyOcl.g:3957:3: ( (lv_condition_1_0= ruleExpCS ) )
            // InternalMyOcl.g:3958:4: (lv_condition_1_0= ruleExpCS )
            {
            // InternalMyOcl.g:3958:4: (lv_condition_1_0= ruleExpCS )
            // InternalMyOcl.g:3959:5: lv_condition_1_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getConditionExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_46);
            lv_condition_1_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.xtext.example.mydsl.MyOcl.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,82,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
            		
            // InternalMyOcl.g:3980:3: ( (lv_thenExpression_3_0= ruleExpCS ) )
            // InternalMyOcl.g:3981:4: (lv_thenExpression_3_0= ruleExpCS )
            {
            // InternalMyOcl.g:3981:4: (lv_thenExpression_3_0= ruleExpCS )
            // InternalMyOcl.g:3982:5: lv_thenExpression_3_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getThenExpressionExpCSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_47);
            lv_thenExpression_3_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            					}
            					set(
            						current,
            						"thenExpression",
            						lv_thenExpression_3_0,
            						"org.xtext.example.mydsl.MyOcl.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,83,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getIfExpCSAccess().getElseKeyword_4());
            		
            // InternalMyOcl.g:4003:3: ( (lv_elseExpression_5_0= ruleExpCS ) )
            // InternalMyOcl.g:4004:4: (lv_elseExpression_5_0= ruleExpCS )
            {
            // InternalMyOcl.g:4004:4: (lv_elseExpression_5_0= ruleExpCS )
            // InternalMyOcl.g:4005:5: lv_elseExpression_5_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getIfExpCSAccess().getElseExpressionExpCSParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_48);
            lv_elseExpression_5_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            					}
            					set(
            						current,
            						"elseExpression",
            						lv_elseExpression_5_0,
            						"org.xtext.example.mydsl.MyOcl.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,84,FOLLOW_2); 

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
    // InternalMyOcl.g:4030:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // InternalMyOcl.g:4030:49: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // InternalMyOcl.g:4031:2: iv_ruleLetExpCS= ruleLetExpCS EOF
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
    // InternalMyOcl.g:4037:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) ;
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
            // InternalMyOcl.g:4043:2: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) )
            // InternalMyOcl.g:4044:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            {
            // InternalMyOcl.g:4044:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            // InternalMyOcl.g:4045:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,85,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
            		
            // InternalMyOcl.g:4049:3: ( (lv_variable_1_0= ruleLetVariableCS ) )
            // InternalMyOcl.g:4050:4: (lv_variable_1_0= ruleLetVariableCS )
            {
            // InternalMyOcl.g:4050:4: (lv_variable_1_0= ruleLetVariableCS )
            // InternalMyOcl.g:4051:5: lv_variable_1_0= ruleLetVariableCS
            {

            					newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_49);
            lv_variable_1_0=ruleLetVariableCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            					}
            					add(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"org.xtext.example.mydsl.MyOcl.LetVariableCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyOcl.g:4068:3: (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==27) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalMyOcl.g:4069:4: otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyOcl.g:4073:4: ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    // InternalMyOcl.g:4074:5: (lv_variable_3_0= ruleLetVariableCS )
            	    {
            	    // InternalMyOcl.g:4074:5: (lv_variable_3_0= ruleLetVariableCS )
            	    // InternalMyOcl.g:4075:6: lv_variable_3_0= ruleLetVariableCS
            	    {

            	    						newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_49);
            	    lv_variable_3_0=ruleLetVariableCS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variable",
            	    							lv_variable_3_0,
            	    							"org.xtext.example.mydsl.MyOcl.LetVariableCS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            otherlv_4=(Token)match(input,86,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
            		
            // InternalMyOcl.g:4097:3: ( (lv_in_5_0= ruleExpCS ) )
            // InternalMyOcl.g:4098:4: (lv_in_5_0= ruleExpCS )
            {
            // InternalMyOcl.g:4098:4: (lv_in_5_0= ruleExpCS )
            // InternalMyOcl.g:4099:5: lv_in_5_0= ruleExpCS
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
            						"org.xtext.example.mydsl.MyOcl.ExpCS");
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
    // InternalMyOcl.g:4120:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // InternalMyOcl.g:4120:54: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // InternalMyOcl.g:4121:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
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
    // InternalMyOcl.g:4127:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:4133:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // InternalMyOcl.g:4134:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // InternalMyOcl.g:4134:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // InternalMyOcl.g:4135:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // InternalMyOcl.g:4135:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalMyOcl.g:4136:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalMyOcl.g:4136:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalMyOcl.g:4137:5: lv_name_0_0= ruleUnrestrictedName
            {

            					newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyOcl.UnrestrictedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyOcl.g:4154:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==24) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalMyOcl.g:4155:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getLetVariableCSAccess().getColonKeyword_1_0());
                    			
                    // InternalMyOcl.g:4159:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalMyOcl.g:4160:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalMyOcl.g:4160:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalMyOcl.g:4161:6: lv_ownedType_2_0= ruleTypeExpCS
                    {

                    						newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                    						}
                    						set(
                    							current,
                    							"ownedType",
                    							lv_ownedType_2_0,
                    							"org.xtext.example.mydsl.MyOcl.TypeExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,28,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_2());
            		
            // InternalMyOcl.g:4183:3: ( (lv_initExpression_4_0= ruleExpCS ) )
            // InternalMyOcl.g:4184:4: (lv_initExpression_4_0= ruleExpCS )
            {
            // InternalMyOcl.g:4184:4: (lv_initExpression_4_0= ruleExpCS )
            // InternalMyOcl.g:4185:5: lv_initExpression_4_0= ruleExpCS
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
            						"org.xtext.example.mydsl.MyOcl.ExpCS");
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
    // InternalMyOcl.g:4206:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // InternalMyOcl.g:4206:52: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // InternalMyOcl.g:4207:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
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
    // InternalMyOcl.g:4213:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_source_1_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:4219:2: ( (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // InternalMyOcl.g:4220:2: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // InternalMyOcl.g:4220:2: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // InternalMyOcl.g:4221:3: otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyOcl.g:4225:3: ( (lv_source_1_0= ruleExpCS ) )
            // InternalMyOcl.g:4226:4: (lv_source_1_0= ruleExpCS )
            {
            // InternalMyOcl.g:4226:4: (lv_source_1_0= ruleExpCS )
            // InternalMyOcl.g:4227:5: lv_source_1_0= ruleExpCS
            {

            					newCompositeNode(grammarAccess.getNestedExpCSAccess().getSourceExpCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_source_1_0=ruleExpCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNestedExpCSRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_1_0,
            						"org.xtext.example.mydsl.MyOcl.ExpCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMyOcl.g:4252:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // InternalMyOcl.g:4252:50: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // InternalMyOcl.g:4253:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
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
    // InternalMyOcl.g:4259:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyOcl.g:4265:2: ( ( () otherlv_1= 'self' ) )
            // InternalMyOcl.g:4266:2: ( () otherlv_1= 'self' )
            {
            // InternalMyOcl.g:4266:2: ( () otherlv_1= 'self' )
            // InternalMyOcl.g:4267:3: () otherlv_1= 'self'
            {
            // InternalMyOcl.g:4267:3: ()
            // InternalMyOcl.g:4268:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelfExpCSAccess().getSelfExpCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,87,FOLLOW_2); 

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
    // InternalMyOcl.g:4282:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // InternalMyOcl.g:4282:53: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // InternalMyOcl.g:4283:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
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
    // InternalMyOcl.g:4289:1: rulePrimaryExpCS returns [EObject current=null] : (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_LetExpCS_5= ruleLetExpCS | this_IfExpCS_6= ruleIfExpCS | this_NestedExpCS_7= ruleNestedExpCS ) ;
    public final EObject rulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NavigatingExpCS_0 = null;

        EObject this_SelfExpCS_1 = null;

        EObject this_PrimitiveLiteralExpCS_2 = null;

        EObject this_TupleLiteralExpCS_3 = null;

        EObject this_CollectionLiteralExpCS_4 = null;

        EObject this_LetExpCS_5 = null;

        EObject this_IfExpCS_6 = null;

        EObject this_NestedExpCS_7 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:4295:2: ( (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_LetExpCS_5= ruleLetExpCS | this_IfExpCS_6= ruleIfExpCS | this_NestedExpCS_7= ruleNestedExpCS ) )
            // InternalMyOcl.g:4296:2: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_LetExpCS_5= ruleLetExpCS | this_IfExpCS_6= ruleIfExpCS | this_NestedExpCS_7= ruleNestedExpCS )
            {
            // InternalMyOcl.g:4296:2: (this_NavigatingExpCS_0= ruleNavigatingExpCS | this_SelfExpCS_1= ruleSelfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS | this_LetExpCS_5= ruleLetExpCS | this_IfExpCS_6= ruleIfExpCS | this_NestedExpCS_7= ruleNestedExpCS )
            int alt71=8;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
            case 29:
            case 30:
            case 31:
                {
                alt71=1;
                }
                break;
            case 87:
                {
                alt71=2;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
            case RULE_BIG_INT:
            case 46:
            case 72:
            case 76:
            case 77:
            case 78:
                {
                alt71=3;
                }
                break;
            case 58:
                {
                alt71=4;
                }
                break;
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                {
                alt71=5;
                }
                break;
            case 85:
                {
                alt71=6;
                }
                break;
            case 81:
                {
                alt71=7;
                }
                break;
            case 22:
                {
                alt71=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalMyOcl.g:4297:3: this_NavigatingExpCS_0= ruleNavigatingExpCS
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
                    // InternalMyOcl.g:4306:3: this_SelfExpCS_1= ruleSelfExpCS
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
                    // InternalMyOcl.g:4315:3: this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS
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
                    // InternalMyOcl.g:4324:3: this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS
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
                    // InternalMyOcl.g:4333:3: this_CollectionLiteralExpCS_4= ruleCollectionLiteralExpCS
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
                    // InternalMyOcl.g:4342:3: this_LetExpCS_5= ruleLetExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLetExpCSParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetExpCS_5=ruleLetExpCS();

                    state._fsp--;


                    			current = this_LetExpCS_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyOcl.g:4351:3: this_IfExpCS_6= ruleIfExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfExpCS_6=ruleIfExpCS();

                    state._fsp--;


                    			current = this_IfExpCS_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyOcl.g:4360:3: this_NestedExpCS_7= ruleNestedExpCS
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_NestedExpCS_7=ruleNestedExpCS();

                    state._fsp--;


                    			current = this_NestedExpCS_7;
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
    // InternalMyOcl.g:4372:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // InternalMyOcl.g:4372:50: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // InternalMyOcl.g:4373:2: iv_ruleNameExpCS= ruleNameExpCS EOF
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
    // InternalMyOcl.g:4379:1: ruleNameExpCS returns [EObject current=null] : ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) ;
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
            // InternalMyOcl.g:4385:2: ( ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) ) )
            // InternalMyOcl.g:4386:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            {
            // InternalMyOcl.g:4386:2: ( ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) ) | ( (lv_element_5_0= ruleUnrestrictedName ) ) )
            int alt73=2;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
                {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==40) ) {
                    alt73=1;
                }
                else if ( (LA73_1==EOF||(LA73_1>=18 && LA73_1<=19)||(LA73_1>=22 && LA73_1<=28)||(LA73_1>=33 && LA73_1<=39)||(LA73_1>=41 && LA73_1<=42)||LA73_1==44||(LA73_1>=46 && LA73_1<=57)||(LA73_1>=74 && LA73_1<=75)||(LA73_1>=79 && LA73_1<=80)||(LA73_1>=82 && LA73_1<=84)||LA73_1==86||(LA73_1>=88 && LA73_1<=89)) ) {
                    alt73=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==40) ) {
                    alt73=1;
                }
                else if ( (LA73_2==EOF||(LA73_2>=18 && LA73_2<=19)||(LA73_2>=22 && LA73_2<=28)||(LA73_2>=33 && LA73_2<=39)||(LA73_2>=41 && LA73_2<=42)||LA73_2==44||(LA73_2>=46 && LA73_2<=57)||(LA73_2>=74 && LA73_2<=75)||(LA73_2>=79 && LA73_2<=80)||(LA73_2>=82 && LA73_2<=84)||LA73_2==86||(LA73_2>=88 && LA73_2<=89)) ) {
                    alt73=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 2, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                int LA73_3 = input.LA(2);

                if ( (LA73_3==EOF||(LA73_3>=18 && LA73_3<=19)||(LA73_3>=22 && LA73_3<=28)||(LA73_3>=33 && LA73_3<=39)||(LA73_3>=41 && LA73_3<=42)||LA73_3==44||(LA73_3>=46 && LA73_3<=57)||(LA73_3>=74 && LA73_3<=75)||(LA73_3>=79 && LA73_3<=80)||(LA73_3>=82 && LA73_3<=84)||LA73_3==86||(LA73_3>=88 && LA73_3<=89)) ) {
                    alt73=2;
                }
                else if ( (LA73_3==40) ) {
                    alt73=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 3, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                int LA73_4 = input.LA(2);

                if ( (LA73_4==EOF||(LA73_4>=18 && LA73_4<=19)||(LA73_4>=22 && LA73_4<=28)||(LA73_4>=33 && LA73_4<=39)||(LA73_4>=41 && LA73_4<=42)||LA73_4==44||(LA73_4>=46 && LA73_4<=57)||(LA73_4>=74 && LA73_4<=75)||(LA73_4>=79 && LA73_4<=80)||(LA73_4>=82 && LA73_4<=84)||LA73_4==86||(LA73_4>=88 && LA73_4<=89)) ) {
                    alt73=2;
                }
                else if ( (LA73_4==40) ) {
                    alt73=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalMyOcl.g:4387:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    {
                    // InternalMyOcl.g:4387:3: ( ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) ) )
                    // InternalMyOcl.g:4388:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* ) ( (lv_element_4_0= ruleUnreservedName ) )
                    {
                    // InternalMyOcl.g:4388:4: ( ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )* )
                    // InternalMyOcl.g:4389:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) ) otherlv_1= '::' ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    {
                    // InternalMyOcl.g:4389:5: ( (lv_namespace_0_0= ruleUnrestrictedName ) )
                    // InternalMyOcl.g:4390:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    {
                    // InternalMyOcl.g:4390:6: (lv_namespace_0_0= ruleUnrestrictedName )
                    // InternalMyOcl.g:4391:7: lv_namespace_0_0= ruleUnrestrictedName
                    {

                    							newCompositeNode(grammarAccess.getNameExpCSAccess().getNamespaceUnrestrictedNameParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_28);
                    lv_namespace_0_0=ruleUnrestrictedName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                    							}
                    							add(
                    								current,
                    								"namespace",
                    								lv_namespace_0_0,
                    								"org.xtext.example.mydsl.MyOcl.UnrestrictedName");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,40,FOLLOW_20); 

                    					newLeafNode(otherlv_1, grammarAccess.getNameExpCSAccess().getColonColonKeyword_0_0_1());
                    				
                    // InternalMyOcl.g:4412:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*
                    loop72:
                    do {
                        int alt72=2;
                        alt72 = dfa72.predict(input);
                        switch (alt72) {
                    	case 1 :
                    	    // InternalMyOcl.g:4413:6: ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::'
                    	    {
                    	    // InternalMyOcl.g:4413:6: ( (lv_namespace_2_0= ruleUnreservedName ) )
                    	    // InternalMyOcl.g:4414:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    {
                    	    // InternalMyOcl.g:4414:7: (lv_namespace_2_0= ruleUnreservedName )
                    	    // InternalMyOcl.g:4415:8: lv_namespace_2_0= ruleUnreservedName
                    	    {

                    	    								newCompositeNode(grammarAccess.getNameExpCSAccess().getNamespaceUnreservedNameParserRuleCall_0_0_2_0_0());
                    	    							
                    	    pushFollow(FOLLOW_28);
                    	    lv_namespace_2_0=ruleUnreservedName();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"namespace",
                    	    									lv_namespace_2_0,
                    	    									"org.xtext.example.mydsl.MyOcl.UnreservedName");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    otherlv_3=(Token)match(input,40,FOLLOW_20); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getNameExpCSAccess().getColonColonKeyword_0_0_2_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);


                    }

                    // InternalMyOcl.g:4438:4: ( (lv_element_4_0= ruleUnreservedName ) )
                    // InternalMyOcl.g:4439:5: (lv_element_4_0= ruleUnreservedName )
                    {
                    // InternalMyOcl.g:4439:5: (lv_element_4_0= ruleUnreservedName )
                    // InternalMyOcl.g:4440:6: lv_element_4_0= ruleUnreservedName
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
                    							"org.xtext.example.mydsl.MyOcl.UnreservedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyOcl.g:4459:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    {
                    // InternalMyOcl.g:4459:3: ( (lv_element_5_0= ruleUnrestrictedName ) )
                    // InternalMyOcl.g:4460:4: (lv_element_5_0= ruleUnrestrictedName )
                    {
                    // InternalMyOcl.g:4460:4: (lv_element_5_0= ruleUnrestrictedName )
                    // InternalMyOcl.g:4461:5: lv_element_5_0= ruleUnrestrictedName
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
                    						"org.xtext.example.mydsl.MyOcl.UnrestrictedName");
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
    // InternalMyOcl.g:4482:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // InternalMyOcl.g:4482:46: (iv_ruleExpCS= ruleExpCS EOF )
            // InternalMyOcl.g:4483:2: iv_ruleExpCS= ruleExpCS EOF
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
    // InternalMyOcl.g:4489:1: ruleExpCS returns [EObject current=null] : this_InfixedExpCS_0= ruleInfixedExpCS ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixedExpCS_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:4495:2: (this_InfixedExpCS_0= ruleInfixedExpCS )
            // InternalMyOcl.g:4496:2: this_InfixedExpCS_0= ruleInfixedExpCS
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
    // InternalMyOcl.g:4507:1: entryRuleInfixedExpCS returns [EObject current=null] : iv_ruleInfixedExpCS= ruleInfixedExpCS EOF ;
    public final EObject entryRuleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixedExpCS = null;


        try {
            // InternalMyOcl.g:4507:53: (iv_ruleInfixedExpCS= ruleInfixedExpCS EOF )
            // InternalMyOcl.g:4508:2: iv_ruleInfixedExpCS= ruleInfixedExpCS EOF
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
    // InternalMyOcl.g:4514:1: ruleInfixedExpCS returns [EObject current=null] : (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) ;
    public final EObject ruleInfixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:4520:2: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? ) )
            // InternalMyOcl.g:4521:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            {
            // InternalMyOcl.g:4521:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )? )
            // InternalMyOcl.g:4522:3: this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getInfixedExpCSAccess().getPrefixedExpCSParserRuleCall_0());
            		
            pushFollow(FOLLOW_50);
            this_PrefixedExpCS_0=rulePrefixedExpCS();

            state._fsp--;


            			current = this_PrefixedExpCS_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyOcl.g:4530:3: ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // InternalMyOcl.g:4531:4: () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    {
                    // InternalMyOcl.g:4531:4: ()
                    // InternalMyOcl.g:4532:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMyOcl.g:4538:4: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+
                    int cnt74=0;
                    loop74:
                    do {
                        int alt74=2;
                        alt74 = dfa74.predict(input);
                        switch (alt74) {
                    	case 1 :
                    	    // InternalMyOcl.g:4539:5: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    {
                    	    // InternalMyOcl.g:4539:5: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) )
                    	    // InternalMyOcl.g:4540:6: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    {
                    	    // InternalMyOcl.g:4540:6: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                    	    // InternalMyOcl.g:4541:7: lv_ownedOperator_2_0= ruleBinaryOperatorCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
                    	    lv_ownedOperator_2_0=ruleBinaryOperatorCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInfixedExpCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedOperator",
                    	    								lv_ownedOperator_2_0,
                    	    								"org.xtext.example.mydsl.MyOcl.BinaryOperatorCS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalMyOcl.g:4558:5: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                    	    // InternalMyOcl.g:4559:6: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    {
                    	    // InternalMyOcl.g:4559:6: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                    	    // InternalMyOcl.g:4560:7: lv_ownedExpression_3_0= rulePrefixedExpCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
                    	    lv_ownedExpression_3_0=rulePrefixedExpCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInfixedExpCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedExpression",
                    	    								lv_ownedExpression_3_0,
                    	    								"org.xtext.example.mydsl.MyOcl.PrefixedExpCS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt74 >= 1 ) break loop74;
                                EarlyExitException eee =
                                    new EarlyExitException(74, input);
                                throw eee;
                        }
                        cnt74++;
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
    // InternalMyOcl.g:4583:1: entryRuleBinaryOperatorCS returns [EObject current=null] : iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF ;
    public final EObject entryRuleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperatorCS = null;


        try {
            // InternalMyOcl.g:4583:57: (iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF )
            // InternalMyOcl.g:4584:2: iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF
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
    // InternalMyOcl.g:4590:1: ruleBinaryOperatorCS returns [EObject current=null] : (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) ;
    public final EObject ruleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixOperatorCS_0 = null;

        EObject this_NavigationOperatorCS_1 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:4596:2: ( (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) )
            // InternalMyOcl.g:4597:2: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            {
            // InternalMyOcl.g:4597:2: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==28||(LA76_0>=41 && LA76_0<=42)||LA76_0==44||(LA76_0>=46 && LA76_0<=55)) ) {
                alt76=1;
            }
            else if ( ((LA76_0>=56 && LA76_0<=57)) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalMyOcl.g:4598:3: this_InfixOperatorCS_0= ruleInfixOperatorCS
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
                    // InternalMyOcl.g:4607:3: this_NavigationOperatorCS_1= ruleNavigationOperatorCS
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
    // InternalMyOcl.g:4619:1: entryRuleInfixOperatorCS returns [EObject current=null] : iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF ;
    public final EObject entryRuleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOperatorCS = null;


        try {
            // InternalMyOcl.g:4619:56: (iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF )
            // InternalMyOcl.g:4620:2: iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF
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
    // InternalMyOcl.g:4626:1: ruleInfixOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleInfixOperator ) ) ;
    public final EObject ruleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:4632:2: ( ( (lv_name_0_0= ruleInfixOperator ) ) )
            // InternalMyOcl.g:4633:2: ( (lv_name_0_0= ruleInfixOperator ) )
            {
            // InternalMyOcl.g:4633:2: ( (lv_name_0_0= ruleInfixOperator ) )
            // InternalMyOcl.g:4634:3: (lv_name_0_0= ruleInfixOperator )
            {
            // InternalMyOcl.g:4634:3: (lv_name_0_0= ruleInfixOperator )
            // InternalMyOcl.g:4635:4: lv_name_0_0= ruleInfixOperator
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
            					"org.xtext.example.mydsl.MyOcl.InfixOperator");
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
    // InternalMyOcl.g:4655:1: entryRuleNavigationOperatorCS returns [EObject current=null] : iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF ;
    public final EObject entryRuleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationOperatorCS = null;


        try {
            // InternalMyOcl.g:4655:61: (iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF )
            // InternalMyOcl.g:4656:2: iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF
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
    // InternalMyOcl.g:4662:1: ruleNavigationOperatorCS returns [EObject current=null] : ( (lv_name_0_0= ruleNavigationOperator ) ) ;
    public final EObject ruleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:4668:2: ( ( (lv_name_0_0= ruleNavigationOperator ) ) )
            // InternalMyOcl.g:4669:2: ( (lv_name_0_0= ruleNavigationOperator ) )
            {
            // InternalMyOcl.g:4669:2: ( (lv_name_0_0= ruleNavigationOperator ) )
            // InternalMyOcl.g:4670:3: (lv_name_0_0= ruleNavigationOperator )
            {
            // InternalMyOcl.g:4670:3: (lv_name_0_0= ruleNavigationOperator )
            // InternalMyOcl.g:4671:4: lv_name_0_0= ruleNavigationOperator
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
            					"org.xtext.example.mydsl.MyOcl.NavigationOperator");
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
    // InternalMyOcl.g:4691:1: entryRulePrefixedExpCS returns [EObject current=null] : iv_rulePrefixedExpCS= rulePrefixedExpCS EOF ;
    public final EObject entryRulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedExpCS = null;


        try {
            // InternalMyOcl.g:4691:54: (iv_rulePrefixedExpCS= rulePrefixedExpCS EOF )
            // InternalMyOcl.g:4692:2: iv_rulePrefixedExpCS= rulePrefixedExpCS EOF
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
    // InternalMyOcl.g:4698:1: rulePrefixedExpCS returns [EObject current=null] : (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) ;
    public final EObject rulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:4704:2: ( (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) ) )
            // InternalMyOcl.g:4705:2: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            {
            // InternalMyOcl.g:4705:2: (this_PrimaryExpCS_0= rulePrimaryExpCS | ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_SIMPLE_ID||(LA78_0>=RULE_SINGLE_QUOTED_STRING && LA78_0<=RULE_BIG_INT)||LA78_0==22||(LA78_0>=29 && LA78_0<=31)||LA78_0==46||LA78_0==58||(LA78_0>=67 && LA78_0<=72)||(LA78_0>=76 && LA78_0<=78)||LA78_0==81||LA78_0==85||LA78_0==87) ) {
                alt78=1;
            }
            else if ( ((LA78_0>=44 && LA78_0<=45)) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalMyOcl.g:4706:3: this_PrimaryExpCS_0= rulePrimaryExpCS
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
                    // InternalMyOcl.g:4715:3: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    {
                    // InternalMyOcl.g:4715:3: ( () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) ) )
                    // InternalMyOcl.g:4716:4: () ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    {
                    // InternalMyOcl.g:4716:4: ()
                    // InternalMyOcl.g:4717:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrefixedExpCSAccess().getPrefixExpCSAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMyOcl.g:4723:4: ( (lv_ownedOperator_2_0= ruleUnaryOperatorCS ) )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( ((LA77_0>=44 && LA77_0<=45)) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalMyOcl.g:4724:5: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    {
                    	    // InternalMyOcl.g:4724:5: (lv_ownedOperator_2_0= ruleUnaryOperatorCS )
                    	    // InternalMyOcl.g:4725:6: lv_ownedOperator_2_0= ruleUnaryOperatorCS
                    	    {

                    	    						newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_40);
                    	    lv_ownedOperator_2_0=ruleUnaryOperatorCS();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPrefixedExpCSRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ownedOperator",
                    	    							lv_ownedOperator_2_0,
                    	    							"org.xtext.example.mydsl.MyOcl.UnaryOperatorCS");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt77 >= 1 ) break loop77;
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);

                    // InternalMyOcl.g:4742:4: ( (lv_ownedExpression_3_0= rulePrimaryExpCS ) )
                    // InternalMyOcl.g:4743:5: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    {
                    // InternalMyOcl.g:4743:5: (lv_ownedExpression_3_0= rulePrimaryExpCS )
                    // InternalMyOcl.g:4744:6: lv_ownedExpression_3_0= rulePrimaryExpCS
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
                    							"org.xtext.example.mydsl.MyOcl.PrimaryExpCS");
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
    // InternalMyOcl.g:4766:1: entryRuleUnaryOperatorCS returns [EObject current=null] : iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF ;
    public final EObject entryRuleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperatorCS = null;


        try {
            // InternalMyOcl.g:4766:56: (iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF )
            // InternalMyOcl.g:4767:2: iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF
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
    // InternalMyOcl.g:4773:1: ruleUnaryOperatorCS returns [EObject current=null] : ( (lv_name_0_0= rulePrefixOperator ) ) ;
    public final EObject ruleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:4779:2: ( ( (lv_name_0_0= rulePrefixOperator ) ) )
            // InternalMyOcl.g:4780:2: ( (lv_name_0_0= rulePrefixOperator ) )
            {
            // InternalMyOcl.g:4780:2: ( (lv_name_0_0= rulePrefixOperator ) )
            // InternalMyOcl.g:4781:3: (lv_name_0_0= rulePrefixOperator )
            {
            // InternalMyOcl.g:4781:3: (lv_name_0_0= rulePrefixOperator )
            // InternalMyOcl.g:4782:4: lv_name_0_0= rulePrefixOperator
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
            					"org.xtext.example.mydsl.MyOcl.PrefixOperator");
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
    // InternalMyOcl.g:4802:1: entryRuleIndexExpCS returns [EObject current=null] : iv_ruleIndexExpCS= ruleIndexExpCS EOF ;
    public final EObject entryRuleIndexExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexExpCS = null;


        try {
            // InternalMyOcl.g:4802:51: (iv_ruleIndexExpCS= ruleIndexExpCS EOF )
            // InternalMyOcl.g:4803:2: iv_ruleIndexExpCS= ruleIndexExpCS EOF
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
    // InternalMyOcl.g:4809:1: ruleIndexExpCS returns [EObject current=null] : (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? ) ;
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
            // InternalMyOcl.g:4815:2: ( (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? ) )
            // InternalMyOcl.g:4816:2: (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? )
            {
            // InternalMyOcl.g:4816:2: (this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )? )
            // InternalMyOcl.g:4817:3: this_NameExpCS_0= ruleNameExpCS ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )?
            {

            			newCompositeNode(grammarAccess.getIndexExpCSAccess().getNameExpCSParserRuleCall_0());
            		
            pushFollow(FOLLOW_51);
            this_NameExpCS_0=ruleNameExpCS();

            state._fsp--;


            			current = this_NameExpCS_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyOcl.g:4825:3: ( () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )? )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==88) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalMyOcl.g:4826:4: () otherlv_2= '[' ( (lv_firstIndexes_3_0= ruleExpCS ) ) (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )* otherlv_6= ']' (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )?
                    {
                    // InternalMyOcl.g:4826:4: ()
                    // InternalMyOcl.g:4827:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getIndexExpCSAccess().getIndexExpCSNamedExpAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,88,FOLLOW_40); 

                    				newLeafNode(otherlv_2, grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    // InternalMyOcl.g:4837:4: ( (lv_firstIndexes_3_0= ruleExpCS ) )
                    // InternalMyOcl.g:4838:5: (lv_firstIndexes_3_0= ruleExpCS )
                    {
                    // InternalMyOcl.g:4838:5: (lv_firstIndexes_3_0= ruleExpCS )
                    // InternalMyOcl.g:4839:6: lv_firstIndexes_3_0= ruleExpCS
                    {

                    						newCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_firstIndexes_3_0=ruleExpCS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
                    						}
                    						add(
                    							current,
                    							"firstIndexes",
                    							lv_firstIndexes_3_0,
                    							"org.xtext.example.mydsl.MyOcl.ExpCS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyOcl.g:4856:4: (otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==27) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalMyOcl.g:4857:5: otherlv_4= ',' ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    {
                    	    otherlv_4=(Token)match(input,27,FOLLOW_40); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalMyOcl.g:4861:5: ( (lv_firstIndexes_5_0= ruleExpCS ) )
                    	    // InternalMyOcl.g:4862:6: (lv_firstIndexes_5_0= ruleExpCS )
                    	    {
                    	    // InternalMyOcl.g:4862:6: (lv_firstIndexes_5_0= ruleExpCS )
                    	    // InternalMyOcl.g:4863:7: lv_firstIndexes_5_0= ruleExpCS
                    	    {

                    	    							newCompositeNode(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_52);
                    	    lv_firstIndexes_5_0=ruleExpCS();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"firstIndexes",
                    	    								lv_firstIndexes_5_0,
                    	    								"org.xtext.example.mydsl.MyOcl.ExpCS");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,89,FOLLOW_51); 

                    				newLeafNode(otherlv_6, grammarAccess.getIndexExpCSAccess().getRightSquareBracketKeyword_1_4());
                    			
                    // InternalMyOcl.g:4885:4: (otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']' )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==88) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalMyOcl.g:4886:5: otherlv_7= '[' ( (lv_secondIndexes_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )* otherlv_11= ']'
                            {
                            otherlv_7=(Token)match(input,88,FOLLOW_40); 

                            					newLeafNode(otherlv_7, grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_5_0());
                            				
                            // InternalMyOcl.g:4890:5: ( (lv_secondIndexes_8_0= ruleExpCS ) )
                            // InternalMyOcl.g:4891:6: (lv_secondIndexes_8_0= ruleExpCS )
                            {
                            // InternalMyOcl.g:4891:6: (lv_secondIndexes_8_0= ruleExpCS )
                            // InternalMyOcl.g:4892:7: lv_secondIndexes_8_0= ruleExpCS
                            {

                            							newCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_1_0());
                            						
                            pushFollow(FOLLOW_52);
                            lv_secondIndexes_8_0=ruleExpCS();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
                            							}
                            							add(
                            								current,
                            								"secondIndexes",
                            								lv_secondIndexes_8_0,
                            								"org.xtext.example.mydsl.MyOcl.ExpCS");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyOcl.g:4909:5: (otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) ) )*
                            loop80:
                            do {
                                int alt80=2;
                                int LA80_0 = input.LA(1);

                                if ( (LA80_0==27) ) {
                                    alt80=1;
                                }


                                switch (alt80) {
                            	case 1 :
                            	    // InternalMyOcl.g:4910:6: otherlv_9= ',' ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    {
                            	    otherlv_9=(Token)match(input,27,FOLLOW_40); 

                            	    						newLeafNode(otherlv_9, grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_5_2_0());
                            	    					
                            	    // InternalMyOcl.g:4914:6: ( (lv_secondIndexes_10_0= ruleExpCS ) )
                            	    // InternalMyOcl.g:4915:7: (lv_secondIndexes_10_0= ruleExpCS )
                            	    {
                            	    // InternalMyOcl.g:4915:7: (lv_secondIndexes_10_0= ruleExpCS )
                            	    // InternalMyOcl.g:4916:8: lv_secondIndexes_10_0= ruleExpCS
                            	    {

                            	    								newCompositeNode(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_52);
                            	    lv_secondIndexes_10_0=ruleExpCS();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getIndexExpCSRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"secondIndexes",
                            	    									lv_secondIndexes_10_0,
                            	    									"org.xtext.example.mydsl.MyOcl.ExpCS");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop80;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,89,FOLLOW_2); 

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
    // InternalMyOcl.g:4944:1: entryRuleNavigatingExpCS_Base returns [EObject current=null] : iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF ;
    public final EObject entryRuleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS_Base = null;


        try {
            // InternalMyOcl.g:4944:61: (iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF )
            // InternalMyOcl.g:4945:2: iv_ruleNavigatingExpCS_Base= ruleNavigatingExpCS_Base EOF
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
    // InternalMyOcl.g:4951:1: ruleNavigatingExpCS_Base returns [EObject current=null] : this_IndexExpCS_0= ruleIndexExpCS ;
    public final EObject ruleNavigatingExpCS_Base() throws RecognitionException {
        EObject current = null;

        EObject this_IndexExpCS_0 = null;



        	enterRule();

        try {
            // InternalMyOcl.g:4957:2: (this_IndexExpCS_0= ruleIndexExpCS )
            // InternalMyOcl.g:4958:2: this_IndexExpCS_0= ruleIndexExpCS
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
    // InternalMyOcl.g:4969:1: entryRuleNavigatingExpCS returns [EObject current=null] : iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF ;
    public final EObject entryRuleNavigatingExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExpCS = null;


        try {
            // InternalMyOcl.g:4969:56: (iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF )
            // InternalMyOcl.g:4970:2: iv_ruleNavigatingExpCS= ruleNavigatingExpCS EOF
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
    // InternalMyOcl.g:4976:1: ruleNavigatingExpCS returns [EObject current=null] : (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? ) ;
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
            // InternalMyOcl.g:4982:2: ( (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? ) )
            // InternalMyOcl.g:4983:2: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? )
            {
            // InternalMyOcl.g:4983:2: (this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )? )
            // InternalMyOcl.g:4984:3: this_NavigatingExpCS_Base_0= ruleNavigatingExpCS_Base ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )?
            {

            			newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCS_BaseParserRuleCall_0());
            		
            pushFollow(FOLLOW_53);
            this_NavigatingExpCS_Base_0=ruleNavigatingExpCS_Base();

            state._fsp--;


            			current = this_NavigatingExpCS_Base_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyOcl.g:4992:3: ( () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==22) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalMyOcl.g:4993:4: () otherlv_2= '(' ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_9= ')'
                    {
                    // InternalMyOcl.g:4993:4: ()
                    // InternalMyOcl.g:4994:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCSNamedExpAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_54); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatingExpCSAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalMyOcl.g:5004:4: ( ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )? )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==RULE_SIMPLE_ID||(LA88_0>=RULE_SINGLE_QUOTED_STRING && LA88_0<=RULE_BIG_INT)||LA88_0==22||(LA88_0>=29 && LA88_0<=31)||(LA88_0>=43 && LA88_0<=46)||LA88_0==58||(LA88_0>=67 && LA88_0<=72)||(LA88_0>=76 && LA88_0<=78)||LA88_0==81||LA88_0==85||LA88_0==87) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // InternalMyOcl.g:5005:5: ( (lv_argument_3_0= ruleNavigatingArgCS ) ) ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )?
                            {
                            // InternalMyOcl.g:5005:5: ( (lv_argument_3_0= ruleNavigatingArgCS ) )
                            // InternalMyOcl.g:5006:6: (lv_argument_3_0= ruleNavigatingArgCS )
                            {
                            // InternalMyOcl.g:5006:6: (lv_argument_3_0= ruleNavigatingArgCS )
                            // InternalMyOcl.g:5007:7: lv_argument_3_0= ruleNavigatingArgCS
                            {

                            							newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingArgCSParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_55);
                            lv_argument_3_0=ruleNavigatingArgCS();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                            							}
                            							add(
                            								current,
                            								"argument",
                            								lv_argument_3_0,
                            								"org.xtext.example.mydsl.MyOcl.NavigatingArgCS");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyOcl.g:5024:5: ( (lv_argument_4_0= ruleNavigatingCommaArgCS ) )*
                            loop83:
                            do {
                                int alt83=2;
                                int LA83_0 = input.LA(1);

                                if ( (LA83_0==27) ) {
                                    alt83=1;
                                }


                                switch (alt83) {
                            	case 1 :
                            	    // InternalMyOcl.g:5025:6: (lv_argument_4_0= ruleNavigatingCommaArgCS )
                            	    {
                            	    // InternalMyOcl.g:5025:6: (lv_argument_4_0= ruleNavigatingCommaArgCS )
                            	    // InternalMyOcl.g:5026:7: lv_argument_4_0= ruleNavigatingCommaArgCS
                            	    {

                            	    							newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_55);
                            	    lv_argument_4_0=ruleNavigatingCommaArgCS();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"argument",
                            	    								lv_argument_4_0,
                            	    								"org.xtext.example.mydsl.MyOcl.NavigatingCommaArgCS");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop83;
                                }
                            } while (true);

                            // InternalMyOcl.g:5043:5: ( ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )* )?
                            int alt85=2;
                            int LA85_0 = input.LA(1);

                            if ( (LA85_0==80) ) {
                                alt85=1;
                            }
                            switch (alt85) {
                                case 1 :
                                    // InternalMyOcl.g:5044:6: ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )*
                                    {
                                    // InternalMyOcl.g:5044:6: ( (lv_argument_5_0= ruleNavigatingSemiArgCS ) )
                                    // InternalMyOcl.g:5045:7: (lv_argument_5_0= ruleNavigatingSemiArgCS )
                                    {
                                    // InternalMyOcl.g:5045:7: (lv_argument_5_0= ruleNavigatingSemiArgCS )
                                    // InternalMyOcl.g:5046:8: lv_argument_5_0= ruleNavigatingSemiArgCS
                                    {

                                    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingSemiArgCSParserRuleCall_1_2_2_0_0());
                                    							
                                    pushFollow(FOLLOW_56);
                                    lv_argument_5_0=ruleNavigatingSemiArgCS();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    								}
                                    								add(
                                    									current,
                                    									"argument",
                                    									lv_argument_5_0,
                                    									"org.xtext.example.mydsl.MyOcl.NavigatingSemiArgCS");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    // InternalMyOcl.g:5063:6: ( (lv_argument_6_0= ruleNavigatingCommaArgCS ) )*
                                    loop84:
                                    do {
                                        int alt84=2;
                                        int LA84_0 = input.LA(1);

                                        if ( (LA84_0==27) ) {
                                            alt84=1;
                                        }


                                        switch (alt84) {
                                    	case 1 :
                                    	    // InternalMyOcl.g:5064:7: (lv_argument_6_0= ruleNavigatingCommaArgCS )
                                    	    {
                                    	    // InternalMyOcl.g:5064:7: (lv_argument_6_0= ruleNavigatingCommaArgCS )
                                    	    // InternalMyOcl.g:5065:8: lv_argument_6_0= ruleNavigatingCommaArgCS
                                    	    {

                                    	    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_2_1_0());
                                    	    							
                                    	    pushFollow(FOLLOW_56);
                                    	    lv_argument_6_0=ruleNavigatingCommaArgCS();

                                    	    state._fsp--;


                                    	    								if (current==null) {
                                    	    									current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    	    								}
                                    	    								add(
                                    	    									current,
                                    	    									"argument",
                                    	    									lv_argument_6_0,
                                    	    									"org.xtext.example.mydsl.MyOcl.NavigatingCommaArgCS");
                                    	    								afterParserOrEnumRuleCall();
                                    	    							

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop84;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            // InternalMyOcl.g:5083:5: ( ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )* )?
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==79) ) {
                                alt87=1;
                            }
                            switch (alt87) {
                                case 1 :
                                    // InternalMyOcl.g:5084:6: ( (lv_argument_7_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )*
                                    {
                                    // InternalMyOcl.g:5084:6: ( (lv_argument_7_0= ruleNavigatingBarArgCS ) )
                                    // InternalMyOcl.g:5085:7: (lv_argument_7_0= ruleNavigatingBarArgCS )
                                    {
                                    // InternalMyOcl.g:5085:7: (lv_argument_7_0= ruleNavigatingBarArgCS )
                                    // InternalMyOcl.g:5086:8: lv_argument_7_0= ruleNavigatingBarArgCS
                                    {

                                    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingBarArgCSParserRuleCall_1_2_3_0_0());
                                    							
                                    pushFollow(FOLLOW_17);
                                    lv_argument_7_0=ruleNavigatingBarArgCS();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    								}
                                    								add(
                                    									current,
                                    									"argument",
                                    									lv_argument_7_0,
                                    									"org.xtext.example.mydsl.MyOcl.NavigatingBarArgCS");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    // InternalMyOcl.g:5103:6: ( (lv_argument_8_0= ruleNavigatingCommaArgCS ) )*
                                    loop86:
                                    do {
                                        int alt86=2;
                                        int LA86_0 = input.LA(1);

                                        if ( (LA86_0==27) ) {
                                            alt86=1;
                                        }


                                        switch (alt86) {
                                    	case 1 :
                                    	    // InternalMyOcl.g:5104:7: (lv_argument_8_0= ruleNavigatingCommaArgCS )
                                    	    {
                                    	    // InternalMyOcl.g:5104:7: (lv_argument_8_0= ruleNavigatingCommaArgCS )
                                    	    // InternalMyOcl.g:5105:8: lv_argument_8_0= ruleNavigatingCommaArgCS
                                    	    {

                                    	    								newCompositeNode(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_3_1_0());
                                    	    							
                                    	    pushFollow(FOLLOW_17);
                                    	    lv_argument_8_0=ruleNavigatingCommaArgCS();

                                    	    state._fsp--;


                                    	    								if (current==null) {
                                    	    									current = createModelElementForParent(grammarAccess.getNavigatingExpCSRule());
                                    	    								}
                                    	    								add(
                                    	    									current,
                                    	    									"argument",
                                    	    									lv_argument_8_0,
                                    	    									"org.xtext.example.mydsl.MyOcl.NavigatingCommaArgCS");
                                    	    								afterParserOrEnumRuleCall();
                                    	    							

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop86;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,23,FOLLOW_2); 

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


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA74 dfa74 = new DFA74(this);
    static final String dfa_1s = "\61\uffff";
    static final String dfa_2s = "\1\22\1\4\2\73\1\4\1\uffff\10\27\10\33\1\4\1\73\1\4\1\73\1\4\1\23\10\27\1\4\10\33\2\uffff\1\4\1\23";
    static final String dfa_3s = "\1\22\1\51\2\102\1\50\1\uffff\10\33\10\52\1\4\1\102\1\37\1\102\1\37\1\32\10\33\1\50\10\52\2\uffff\1\4\1\32";
    static final String dfa_4s = "\5\uffff\1\2\47\uffff\1\1\1\3\2\uffff";
    static final String dfa_5s = "\61\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\4\21\uffff\1\2\6\uffff\3\5\11\uffff\1\3",
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\5\43\uffff\1\26",
            "",
            "\1\30\3\uffff\1\27",
            "\1\30\3\uffff\1\27",
            "\1\30\3\uffff\1\27",
            "\1\30\3\uffff\1\27",
            "\1\30\3\uffff\1\27",
            "\1\30\3\uffff\1\27",
            "\1\30\3\uffff\1\27",
            "\1\30\3\uffff\1\27",
            "\1\31\16\uffff\1\32",
            "\1\31\16\uffff\1\32",
            "\1\31\16\uffff\1\32",
            "\1\31\16\uffff\1\32",
            "\1\31\16\uffff\1\32",
            "\1\31\16\uffff\1\32",
            "\1\31\16\uffff\1\32",
            "\1\31\16\uffff\1\32",
            "\1\33",
            "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\44\30\uffff\3\5",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54",
            "\1\44\30\uffff\3\5",
            "\1\5\2\uffff\1\56\1\uffff\1\55\2\5",
            "\1\30\3\uffff\1\27",
            "\1\30\3\uffff\1\27",
            "\1\30\3\uffff\1\27",
            "\1\30\3\uffff\1\27",
            "\1\30\3\uffff\1\27",
            "\1\30\3\uffff\1\27",
            "\1\30\3\uffff\1\27",
            "\1\30\3\uffff\1\27",
            "\1\5\43\uffff\1\57",
            "\1\31\16\uffff\1\32",
            "\1\31\16\uffff\1\32",
            "\1\31\16\uffff\1\32",
            "\1\31\16\uffff\1\32",
            "\1\31\16\uffff\1\32",
            "\1\31\16\uffff\1\32",
            "\1\31\16\uffff\1\32",
            "\1\31\16\uffff\1\32",
            "",
            "",
            "\1\60",
            "\1\5\2\uffff\1\56\2\uffff\2\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "406:2: (this_PropertyContextDeclCS_0= rulePropertyContextDeclCS | this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS | this_OperationContextDeclCS_2= ruleOperationContextDeclCS )";
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\31\1\32\1\4\4\30\1\4\1\uffff\4\26\1\uffff";
    static final String dfa_9s = "\2\32\1\37\4\30\1\51\1\uffff\4\30\1\uffff";
    static final String dfa_10s = "\10\uffff\1\1\4\uffff\1\2";
    static final String dfa_11s = "\16\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\2",
            "\1\2",
            "\1\3\23\uffff\1\7\4\uffff\1\4\1\5\1\6",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\11\21\uffff\1\10\6\uffff\1\12\1\13\1\14\11\uffff\1\10",
            "",
            "\1\10\1\uffff\1\15",
            "\1\10\1\uffff\1\15",
            "\1\10\1\uffff\1\15",
            "\1\10\1\uffff\1\15",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "451:2: (this_DefOperationCS_0= ruleDefOperationCS | this_DefPropertyCS_1= ruleDefPropertyCS )";
        }
    }
    static final String dfa_13s = "\25\uffff";
    static final String dfa_14s = "\1\uffff\22\24\2\uffff";
    static final String dfa_15s = "\1\4\22\22\2\uffff";
    static final String dfa_16s = "\1\107\22\120\2\uffff";
    static final String dfa_17s = "\23\uffff\1\1\1\2";
    static final String dfa_18s = "\25\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\30\uffff\1\2\1\3\1\4\32\uffff\1\22\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\5\1\6\1\7\1\10\1\11",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "\1\24\4\uffff\1\24\3\uffff\2\24\4\uffff\7\24\1\23\1\uffff\1\24\44\uffff\2\24",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()* loopback of 3438:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*";
        }
    }
    static final String dfa_20s = "\1\uffff\22\23\2\uffff";
    static final String dfa_21s = "\1\107\22\131\2\uffff";
    static final String dfa_22s = "\23\uffff\1\2\1\1";
    static final String[] dfa_23s = {
            "\1\1\30\uffff\1\2\1\3\1\4\32\uffff\1\22\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\5\1\6\1\7\1\10\1\11",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "\2\23\2\uffff\7\23\4\uffff\7\23\1\24\2\23\1\uffff\1\23\1\uffff\14\23\20\uffff\2\23\3\uffff\2\23\1\uffff\3\23\1\uffff\1\23\1\uffff\2\23",
            "",
            ""
    };
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_13;
            this.eof = dfa_20;
            this.min = dfa_15;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_18;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "()* loopback of 4412:5: ( ( (lv_namespace_2_0= ruleUnreservedName ) ) otherlv_3= '::' )*";
        }
    }
    static final String dfa_24s = "\22\uffff";
    static final String dfa_25s = "\1\21\21\uffff";
    static final String dfa_26s = "\1\22\21\uffff";
    static final String dfa_27s = "\1\131\21\uffff";
    static final String dfa_28s = "\1\uffff\20\1\1\2";
    static final String dfa_29s = "\22\uffff}>";
    static final String[] dfa_30s = {
            "\2\21\3\uffff\5\21\1\11\4\uffff\7\21\1\uffff\1\6\1\5\1\uffff\1\4\1\uffff\1\1\1\2\1\3\1\7\1\10\1\12\1\13\1\14\1\15\1\16\1\17\1\20\20\uffff\2\21\3\uffff\2\21\1\uffff\3\21\1\uffff\1\21\2\uffff\1\21",
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
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = dfa_24;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "4530:3: ( () ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+ )?";
        }
    }
    static final String dfa_31s = "\1\1\21\uffff";
    static final String dfa_32s = "\1\uffff\1\2\20\1";
    static final String[] dfa_33s = {
            "\2\1\3\uffff\5\1\1\2\4\uffff\7\1\1\uffff\1\10\1\7\1\uffff\1\6\1\uffff\1\3\1\4\1\5\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\20\uffff\2\1\3\uffff\2\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1",
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
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = dfa_24;
            this.eof = dfa_31;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_32;
            this.special = dfa_29;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "()+ loopback of 4538:4: ( ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000010E0040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000200E0400010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000006080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000E1000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000006080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x04007000E04000F0L,0x0000000000A271F8L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000E0000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000E0800010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xFC000000F0000010L,0x00000000000000FFL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xFC000000E0000010L,0x00000000000000FFL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0xFC000000E0800010L,0x00000000000000FFL});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xFC00000EE0000012L,0x00000000000000FFL});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000E00000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000030000C0000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040008000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000400002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000400000L,0x0000000000000100L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000400E0000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x04007000E04000D0L,0x0000000000A275F8L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x04007000E04000D0L,0x0000000000A271F8L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000011000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x04007800E04000D0L,0x0000000000A271F8L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000008000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x03FFD60010000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000008000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x04007800E0C000D0L,0x0000000000A271F8L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000008800000L,0x0000000000018000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000008800000L,0x0000000000008000L});

}