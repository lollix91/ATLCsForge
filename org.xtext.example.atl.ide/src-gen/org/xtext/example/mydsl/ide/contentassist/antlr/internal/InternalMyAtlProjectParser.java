package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyAtlProjectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyAtlProjectParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SINGLE_QUOTED_STRING", "RULE_SIMPLE_ID", "RULE_BIG_INT", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_DOCUMENTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'not'", "'*'", "'/'", "'+'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", "'and'", "'or'", "'xor'", "'implies'", "'.'", "'->'", "'Tuple'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'module'", "';'", "'create'", "'OUT'", "':'", "'from'", "'IN'", "'rule'", "'{'", "'to'", "'}'", "'using'", "'do'", "'entrypoint'", "'('", "')'", "'helper'", "'context'", "','", "'xxx'", "'yyy'", "'<-'", "'..'", "'invalid'", "'null'", "'if'", "'then'", "'else'", "'endif'", "'let'", "'in'", "'self'", "'['", "']'", "'true'", "'false'", "'|'"
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

    	public void setGrammarAccess(MyAtlProjectGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModule"
    // InternalMyAtlProject.g:53:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:54:1: ( ruleModule EOF )
            // InternalMyAtlProject.g:55:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalMyAtlProject.g:62:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:66:2: ( ( ( rule__Module__Group__0 ) ) )
            // InternalMyAtlProject.g:67:2: ( ( rule__Module__Group__0 ) )
            {
            // InternalMyAtlProject.g:67:2: ( ( rule__Module__Group__0 ) )
            // InternalMyAtlProject.g:68:3: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // InternalMyAtlProject.g:69:3: ( rule__Module__Group__0 )
            // InternalMyAtlProject.g:69:4: rule__Module__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleModuleElement"
    // InternalMyAtlProject.g:78:1: entryRuleModuleElement : ruleModuleElement EOF ;
    public final void entryRuleModuleElement() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:79:1: ( ruleModuleElement EOF )
            // InternalMyAtlProject.g:80:1: ruleModuleElement EOF
            {
             before(grammarAccess.getModuleElementRule()); 
            pushFollow(FOLLOW_1);
            ruleModuleElement();

            state._fsp--;

             after(grammarAccess.getModuleElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModuleElement"


    // $ANTLR start "ruleModuleElement"
    // InternalMyAtlProject.g:87:1: ruleModuleElement : ( ( rule__ModuleElement__Alternatives ) ) ;
    public final void ruleModuleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:91:2: ( ( ( rule__ModuleElement__Alternatives ) ) )
            // InternalMyAtlProject.g:92:2: ( ( rule__ModuleElement__Alternatives ) )
            {
            // InternalMyAtlProject.g:92:2: ( ( rule__ModuleElement__Alternatives ) )
            // InternalMyAtlProject.g:93:3: ( rule__ModuleElement__Alternatives )
            {
             before(grammarAccess.getModuleElementAccess().getAlternatives()); 
            // InternalMyAtlProject.g:94:3: ( rule__ModuleElement__Alternatives )
            // InternalMyAtlProject.g:94:4: rule__ModuleElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModuleElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModuleElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModuleElement"


    // $ANTLR start "entryRuleMatchedRule"
    // InternalMyAtlProject.g:103:1: entryRuleMatchedRule : ruleMatchedRule EOF ;
    public final void entryRuleMatchedRule() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:104:1: ( ruleMatchedRule EOF )
            // InternalMyAtlProject.g:105:1: ruleMatchedRule EOF
            {
             before(grammarAccess.getMatchedRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleMatchedRule();

            state._fsp--;

             after(grammarAccess.getMatchedRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatchedRule"


    // $ANTLR start "ruleMatchedRule"
    // InternalMyAtlProject.g:112:1: ruleMatchedRule : ( ( rule__MatchedRule__Group__0 ) ) ;
    public final void ruleMatchedRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:116:2: ( ( ( rule__MatchedRule__Group__0 ) ) )
            // InternalMyAtlProject.g:117:2: ( ( rule__MatchedRule__Group__0 ) )
            {
            // InternalMyAtlProject.g:117:2: ( ( rule__MatchedRule__Group__0 ) )
            // InternalMyAtlProject.g:118:3: ( rule__MatchedRule__Group__0 )
            {
             before(grammarAccess.getMatchedRuleAccess().getGroup()); 
            // InternalMyAtlProject.g:119:3: ( rule__MatchedRule__Group__0 )
            // InternalMyAtlProject.g:119:4: rule__MatchedRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatchedRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatchedRule"


    // $ANTLR start "entryRuleCalledRule"
    // InternalMyAtlProject.g:128:1: entryRuleCalledRule : ruleCalledRule EOF ;
    public final void entryRuleCalledRule() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:129:1: ( ruleCalledRule EOF )
            // InternalMyAtlProject.g:130:1: ruleCalledRule EOF
            {
             before(grammarAccess.getCalledRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleCalledRule();

            state._fsp--;

             after(grammarAccess.getCalledRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalledRule"


    // $ANTLR start "ruleCalledRule"
    // InternalMyAtlProject.g:137:1: ruleCalledRule : ( ( rule__CalledRule__Group__0 ) ) ;
    public final void ruleCalledRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:141:2: ( ( ( rule__CalledRule__Group__0 ) ) )
            // InternalMyAtlProject.g:142:2: ( ( rule__CalledRule__Group__0 ) )
            {
            // InternalMyAtlProject.g:142:2: ( ( rule__CalledRule__Group__0 ) )
            // InternalMyAtlProject.g:143:3: ( rule__CalledRule__Group__0 )
            {
             before(grammarAccess.getCalledRuleAccess().getGroup()); 
            // InternalMyAtlProject.g:144:3: ( rule__CalledRule__Group__0 )
            // InternalMyAtlProject.g:144:4: rule__CalledRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CalledRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalledRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalledRule"


    // $ANTLR start "entryRuleHelper"
    // InternalMyAtlProject.g:153:1: entryRuleHelper : ruleHelper EOF ;
    public final void entryRuleHelper() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:154:1: ( ruleHelper EOF )
            // InternalMyAtlProject.g:155:1: ruleHelper EOF
            {
             before(grammarAccess.getHelperRule()); 
            pushFollow(FOLLOW_1);
            ruleHelper();

            state._fsp--;

             after(grammarAccess.getHelperRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHelper"


    // $ANTLR start "ruleHelper"
    // InternalMyAtlProject.g:162:1: ruleHelper : ( ( rule__Helper__Group__0 ) ) ;
    public final void ruleHelper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:166:2: ( ( ( rule__Helper__Group__0 ) ) )
            // InternalMyAtlProject.g:167:2: ( ( rule__Helper__Group__0 ) )
            {
            // InternalMyAtlProject.g:167:2: ( ( rule__Helper__Group__0 ) )
            // InternalMyAtlProject.g:168:3: ( rule__Helper__Group__0 )
            {
             before(grammarAccess.getHelperAccess().getGroup()); 
            // InternalMyAtlProject.g:169:3: ( rule__Helper__Group__0 )
            // InternalMyAtlProject.g:169:4: rule__Helper__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Helper__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHelperAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHelper"


    // $ANTLR start "entryRuleRuleVariableDeclaration"
    // InternalMyAtlProject.g:178:1: entryRuleRuleVariableDeclaration : ruleRuleVariableDeclaration EOF ;
    public final void entryRuleRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:179:1: ( ruleRuleVariableDeclaration EOF )
            // InternalMyAtlProject.g:180:1: ruleRuleVariableDeclaration EOF
            {
             before(grammarAccess.getRuleVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getRuleVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleVariableDeclaration"


    // $ANTLR start "ruleRuleVariableDeclaration"
    // InternalMyAtlProject.g:187:1: ruleRuleVariableDeclaration : ( ( rule__RuleVariableDeclaration__Group__0 ) ) ;
    public final void ruleRuleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:191:2: ( ( ( rule__RuleVariableDeclaration__Group__0 ) ) )
            // InternalMyAtlProject.g:192:2: ( ( rule__RuleVariableDeclaration__Group__0 ) )
            {
            // InternalMyAtlProject.g:192:2: ( ( rule__RuleVariableDeclaration__Group__0 ) )
            // InternalMyAtlProject.g:193:3: ( rule__RuleVariableDeclaration__Group__0 )
            {
             before(grammarAccess.getRuleVariableDeclarationAccess().getGroup()); 
            // InternalMyAtlProject.g:194:3: ( rule__RuleVariableDeclaration__Group__0 )
            // InternalMyAtlProject.g:194:4: rule__RuleVariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleVariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleVariableDeclaration"


    // $ANTLR start "entryRuleInPattern"
    // InternalMyAtlProject.g:203:1: entryRuleInPattern : ruleInPattern EOF ;
    public final void entryRuleInPattern() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:204:1: ( ruleInPattern EOF )
            // InternalMyAtlProject.g:205:1: ruleInPattern EOF
            {
             before(grammarAccess.getInPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleInPattern();

            state._fsp--;

             after(grammarAccess.getInPatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInPattern"


    // $ANTLR start "ruleInPattern"
    // InternalMyAtlProject.g:212:1: ruleInPattern : ( ( rule__InPattern__Group__0 ) ) ;
    public final void ruleInPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:216:2: ( ( ( rule__InPattern__Group__0 ) ) )
            // InternalMyAtlProject.g:217:2: ( ( rule__InPattern__Group__0 ) )
            {
            // InternalMyAtlProject.g:217:2: ( ( rule__InPattern__Group__0 ) )
            // InternalMyAtlProject.g:218:3: ( rule__InPattern__Group__0 )
            {
             before(grammarAccess.getInPatternAccess().getGroup()); 
            // InternalMyAtlProject.g:219:3: ( rule__InPattern__Group__0 )
            // InternalMyAtlProject.g:219:4: rule__InPattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInPattern"


    // $ANTLR start "entryRuleInPatternElement"
    // InternalMyAtlProject.g:228:1: entryRuleInPatternElement : ruleInPatternElement EOF ;
    public final void entryRuleInPatternElement() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:229:1: ( ruleInPatternElement EOF )
            // InternalMyAtlProject.g:230:1: ruleInPatternElement EOF
            {
             before(grammarAccess.getInPatternElementRule()); 
            pushFollow(FOLLOW_1);
            ruleInPatternElement();

            state._fsp--;

             after(grammarAccess.getInPatternElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInPatternElement"


    // $ANTLR start "ruleInPatternElement"
    // InternalMyAtlProject.g:237:1: ruleInPatternElement : ( ( rule__InPatternElement__Group__0 ) ) ;
    public final void ruleInPatternElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:241:2: ( ( ( rule__InPatternElement__Group__0 ) ) )
            // InternalMyAtlProject.g:242:2: ( ( rule__InPatternElement__Group__0 ) )
            {
            // InternalMyAtlProject.g:242:2: ( ( rule__InPatternElement__Group__0 ) )
            // InternalMyAtlProject.g:243:3: ( rule__InPatternElement__Group__0 )
            {
             before(grammarAccess.getInPatternElementAccess().getGroup()); 
            // InternalMyAtlProject.g:244:3: ( rule__InPatternElement__Group__0 )
            // InternalMyAtlProject.g:244:4: rule__InPatternElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InPatternElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInPatternElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInPatternElement"


    // $ANTLR start "entryRuleOutPattern"
    // InternalMyAtlProject.g:253:1: entryRuleOutPattern : ruleOutPattern EOF ;
    public final void entryRuleOutPattern() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:254:1: ( ruleOutPattern EOF )
            // InternalMyAtlProject.g:255:1: ruleOutPattern EOF
            {
             before(grammarAccess.getOutPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleOutPattern();

            state._fsp--;

             after(grammarAccess.getOutPatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutPattern"


    // $ANTLR start "ruleOutPattern"
    // InternalMyAtlProject.g:262:1: ruleOutPattern : ( ( rule__OutPattern__Group__0 ) ) ;
    public final void ruleOutPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:266:2: ( ( ( rule__OutPattern__Group__0 ) ) )
            // InternalMyAtlProject.g:267:2: ( ( rule__OutPattern__Group__0 ) )
            {
            // InternalMyAtlProject.g:267:2: ( ( rule__OutPattern__Group__0 ) )
            // InternalMyAtlProject.g:268:3: ( rule__OutPattern__Group__0 )
            {
             before(grammarAccess.getOutPatternAccess().getGroup()); 
            // InternalMyAtlProject.g:269:3: ( rule__OutPattern__Group__0 )
            // InternalMyAtlProject.g:269:4: rule__OutPattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutPattern"


    // $ANTLR start "entryRuleOutPatternElement"
    // InternalMyAtlProject.g:278:1: entryRuleOutPatternElement : ruleOutPatternElement EOF ;
    public final void entryRuleOutPatternElement() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:279:1: ( ruleOutPatternElement EOF )
            // InternalMyAtlProject.g:280:1: ruleOutPatternElement EOF
            {
             before(grammarAccess.getOutPatternElementRule()); 
            pushFollow(FOLLOW_1);
            ruleOutPatternElement();

            state._fsp--;

             after(grammarAccess.getOutPatternElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutPatternElement"


    // $ANTLR start "ruleOutPatternElement"
    // InternalMyAtlProject.g:287:1: ruleOutPatternElement : ( ( rule__OutPatternElement__Alternatives ) ) ;
    public final void ruleOutPatternElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:291:2: ( ( ( rule__OutPatternElement__Alternatives ) ) )
            // InternalMyAtlProject.g:292:2: ( ( rule__OutPatternElement__Alternatives ) )
            {
            // InternalMyAtlProject.g:292:2: ( ( rule__OutPatternElement__Alternatives ) )
            // InternalMyAtlProject.g:293:3: ( rule__OutPatternElement__Alternatives )
            {
             before(grammarAccess.getOutPatternElementAccess().getAlternatives()); 
            // InternalMyAtlProject.g:294:3: ( rule__OutPatternElement__Alternatives )
            // InternalMyAtlProject.g:294:4: rule__OutPatternElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OutPatternElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOutPatternElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutPatternElement"


    // $ANTLR start "entryRuleSimpleOutPatternElement"
    // InternalMyAtlProject.g:303:1: entryRuleSimpleOutPatternElement : ruleSimpleOutPatternElement EOF ;
    public final void entryRuleSimpleOutPatternElement() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:304:1: ( ruleSimpleOutPatternElement EOF )
            // InternalMyAtlProject.g:305:1: ruleSimpleOutPatternElement EOF
            {
             before(grammarAccess.getSimpleOutPatternElementRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleOutPatternElement();

            state._fsp--;

             after(grammarAccess.getSimpleOutPatternElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleOutPatternElement"


    // $ANTLR start "ruleSimpleOutPatternElement"
    // InternalMyAtlProject.g:312:1: ruleSimpleOutPatternElement : ( ( rule__SimpleOutPatternElement__Group__0 ) ) ;
    public final void ruleSimpleOutPatternElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:316:2: ( ( ( rule__SimpleOutPatternElement__Group__0 ) ) )
            // InternalMyAtlProject.g:317:2: ( ( rule__SimpleOutPatternElement__Group__0 ) )
            {
            // InternalMyAtlProject.g:317:2: ( ( rule__SimpleOutPatternElement__Group__0 ) )
            // InternalMyAtlProject.g:318:3: ( rule__SimpleOutPatternElement__Group__0 )
            {
             before(grammarAccess.getSimpleOutPatternElementAccess().getGroup()); 
            // InternalMyAtlProject.g:319:3: ( rule__SimpleOutPatternElement__Group__0 )
            // InternalMyAtlProject.g:319:4: rule__SimpleOutPatternElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleOutPatternElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleOutPatternElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleOutPatternElement"


    // $ANTLR start "entryRuleForEachOutPatternElement"
    // InternalMyAtlProject.g:328:1: entryRuleForEachOutPatternElement : ruleForEachOutPatternElement EOF ;
    public final void entryRuleForEachOutPatternElement() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:329:1: ( ruleForEachOutPatternElement EOF )
            // InternalMyAtlProject.g:330:1: ruleForEachOutPatternElement EOF
            {
             before(grammarAccess.getForEachOutPatternElementRule()); 
            pushFollow(FOLLOW_1);
            ruleForEachOutPatternElement();

            state._fsp--;

             after(grammarAccess.getForEachOutPatternElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForEachOutPatternElement"


    // $ANTLR start "ruleForEachOutPatternElement"
    // InternalMyAtlProject.g:337:1: ruleForEachOutPatternElement : ( ( rule__ForEachOutPatternElement__Group__0 ) ) ;
    public final void ruleForEachOutPatternElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:341:2: ( ( ( rule__ForEachOutPatternElement__Group__0 ) ) )
            // InternalMyAtlProject.g:342:2: ( ( rule__ForEachOutPatternElement__Group__0 ) )
            {
            // InternalMyAtlProject.g:342:2: ( ( rule__ForEachOutPatternElement__Group__0 ) )
            // InternalMyAtlProject.g:343:3: ( rule__ForEachOutPatternElement__Group__0 )
            {
             before(grammarAccess.getForEachOutPatternElementAccess().getGroup()); 
            // InternalMyAtlProject.g:344:3: ( rule__ForEachOutPatternElement__Group__0 )
            // InternalMyAtlProject.g:344:4: rule__ForEachOutPatternElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForEachOutPatternElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForEachOutPatternElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForEachOutPatternElement"


    // $ANTLR start "entryRuleBinding"
    // InternalMyAtlProject.g:353:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:354:1: ( ruleBinding EOF )
            // InternalMyAtlProject.g:355:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalMyAtlProject.g:362:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:366:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalMyAtlProject.g:367:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalMyAtlProject.g:367:2: ( ( rule__Binding__Group__0 ) )
            // InternalMyAtlProject.g:368:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalMyAtlProject.g:369:3: ( rule__Binding__Group__0 )
            // InternalMyAtlProject.g:369:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleActionBlock"
    // InternalMyAtlProject.g:378:1: entryRuleActionBlock : ruleActionBlock EOF ;
    public final void entryRuleActionBlock() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:379:1: ( ruleActionBlock EOF )
            // InternalMyAtlProject.g:380:1: ruleActionBlock EOF
            {
             before(grammarAccess.getActionBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleActionBlock();

            state._fsp--;

             after(grammarAccess.getActionBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActionBlock"


    // $ANTLR start "ruleActionBlock"
    // InternalMyAtlProject.g:387:1: ruleActionBlock : ( ( ( rule__ActionBlock__StatementsAssignment ) ) ( ( rule__ActionBlock__StatementsAssignment )* ) ) ;
    public final void ruleActionBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:391:2: ( ( ( ( rule__ActionBlock__StatementsAssignment ) ) ( ( rule__ActionBlock__StatementsAssignment )* ) ) )
            // InternalMyAtlProject.g:392:2: ( ( ( rule__ActionBlock__StatementsAssignment ) ) ( ( rule__ActionBlock__StatementsAssignment )* ) )
            {
            // InternalMyAtlProject.g:392:2: ( ( ( rule__ActionBlock__StatementsAssignment ) ) ( ( rule__ActionBlock__StatementsAssignment )* ) )
            // InternalMyAtlProject.g:393:3: ( ( rule__ActionBlock__StatementsAssignment ) ) ( ( rule__ActionBlock__StatementsAssignment )* )
            {
            // InternalMyAtlProject.g:393:3: ( ( rule__ActionBlock__StatementsAssignment ) )
            // InternalMyAtlProject.g:394:4: ( rule__ActionBlock__StatementsAssignment )
            {
             before(grammarAccess.getActionBlockAccess().getStatementsAssignment()); 
            // InternalMyAtlProject.g:395:4: ( rule__ActionBlock__StatementsAssignment )
            // InternalMyAtlProject.g:395:5: rule__ActionBlock__StatementsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__ActionBlock__StatementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getActionBlockAccess().getStatementsAssignment()); 

            }

            // InternalMyAtlProject.g:398:3: ( ( rule__ActionBlock__StatementsAssignment )* )
            // InternalMyAtlProject.g:399:4: ( rule__ActionBlock__StatementsAssignment )*
            {
             before(grammarAccess.getActionBlockAccess().getStatementsAssignment()); 
            // InternalMyAtlProject.g:400:4: ( rule__ActionBlock__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SIMPLE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyAtlProject.g:400:5: rule__ActionBlock__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ActionBlock__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getActionBlockAccess().getStatementsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionBlock"


    // $ANTLR start "entryRuleStatement"
    // InternalMyAtlProject.g:410:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:411:1: ( ruleStatement EOF )
            // InternalMyAtlProject.g:412:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyAtlProject.g:419:1: ruleStatement : ( ruleBindingStat ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:423:2: ( ( ruleBindingStat ) )
            // InternalMyAtlProject.g:424:2: ( ruleBindingStat )
            {
            // InternalMyAtlProject.g:424:2: ( ruleBindingStat )
            // InternalMyAtlProject.g:425:3: ruleBindingStat
            {
             before(grammarAccess.getStatementAccess().getBindingStatParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleBindingStat();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getBindingStatParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleBindingStat"
    // InternalMyAtlProject.g:435:1: entryRuleBindingStat : ruleBindingStat EOF ;
    public final void entryRuleBindingStat() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:436:1: ( ruleBindingStat EOF )
            // InternalMyAtlProject.g:437:1: ruleBindingStat EOF
            {
             before(grammarAccess.getBindingStatRule()); 
            pushFollow(FOLLOW_1);
            ruleBindingStat();

            state._fsp--;

             after(grammarAccess.getBindingStatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBindingStat"


    // $ANTLR start "ruleBindingStat"
    // InternalMyAtlProject.g:444:1: ruleBindingStat : ( ( rule__BindingStat__Group__0 ) ) ;
    public final void ruleBindingStat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:448:2: ( ( ( rule__BindingStat__Group__0 ) ) )
            // InternalMyAtlProject.g:449:2: ( ( rule__BindingStat__Group__0 ) )
            {
            // InternalMyAtlProject.g:449:2: ( ( rule__BindingStat__Group__0 ) )
            // InternalMyAtlProject.g:450:3: ( rule__BindingStat__Group__0 )
            {
             before(grammarAccess.getBindingStatAccess().getGroup()); 
            // InternalMyAtlProject.g:451:3: ( rule__BindingStat__Group__0 )
            // InternalMyAtlProject.g:451:4: rule__BindingStat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BindingStat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingStatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBindingStat"


    // $ANTLR start "entryRuleEssentialOCLPrefixOperator"
    // InternalMyAtlProject.g:460:1: entryRuleEssentialOCLPrefixOperator : ruleEssentialOCLPrefixOperator EOF ;
    public final void entryRuleEssentialOCLPrefixOperator() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:461:1: ( ruleEssentialOCLPrefixOperator EOF )
            // InternalMyAtlProject.g:462:1: ruleEssentialOCLPrefixOperator EOF
            {
             before(grammarAccess.getEssentialOCLPrefixOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleEssentialOCLPrefixOperator();

            state._fsp--;

             after(grammarAccess.getEssentialOCLPrefixOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEssentialOCLPrefixOperator"


    // $ANTLR start "ruleEssentialOCLPrefixOperator"
    // InternalMyAtlProject.g:469:1: ruleEssentialOCLPrefixOperator : ( ( rule__EssentialOCLPrefixOperator__Alternatives ) ) ;
    public final void ruleEssentialOCLPrefixOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:473:2: ( ( ( rule__EssentialOCLPrefixOperator__Alternatives ) ) )
            // InternalMyAtlProject.g:474:2: ( ( rule__EssentialOCLPrefixOperator__Alternatives ) )
            {
            // InternalMyAtlProject.g:474:2: ( ( rule__EssentialOCLPrefixOperator__Alternatives ) )
            // InternalMyAtlProject.g:475:3: ( rule__EssentialOCLPrefixOperator__Alternatives )
            {
             before(grammarAccess.getEssentialOCLPrefixOperatorAccess().getAlternatives()); 
            // InternalMyAtlProject.g:476:3: ( rule__EssentialOCLPrefixOperator__Alternatives )
            // InternalMyAtlProject.g:476:4: rule__EssentialOCLPrefixOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EssentialOCLPrefixOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEssentialOCLPrefixOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEssentialOCLPrefixOperator"


    // $ANTLR start "entryRuleEssentialOCLInfixOperator"
    // InternalMyAtlProject.g:485:1: entryRuleEssentialOCLInfixOperator : ruleEssentialOCLInfixOperator EOF ;
    public final void entryRuleEssentialOCLInfixOperator() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:486:1: ( ruleEssentialOCLInfixOperator EOF )
            // InternalMyAtlProject.g:487:1: ruleEssentialOCLInfixOperator EOF
            {
             before(grammarAccess.getEssentialOCLInfixOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleEssentialOCLInfixOperator();

            state._fsp--;

             after(grammarAccess.getEssentialOCLInfixOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEssentialOCLInfixOperator"


    // $ANTLR start "ruleEssentialOCLInfixOperator"
    // InternalMyAtlProject.g:494:1: ruleEssentialOCLInfixOperator : ( ( rule__EssentialOCLInfixOperator__Alternatives ) ) ;
    public final void ruleEssentialOCLInfixOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:498:2: ( ( ( rule__EssentialOCLInfixOperator__Alternatives ) ) )
            // InternalMyAtlProject.g:499:2: ( ( rule__EssentialOCLInfixOperator__Alternatives ) )
            {
            // InternalMyAtlProject.g:499:2: ( ( rule__EssentialOCLInfixOperator__Alternatives ) )
            // InternalMyAtlProject.g:500:3: ( rule__EssentialOCLInfixOperator__Alternatives )
            {
             before(grammarAccess.getEssentialOCLInfixOperatorAccess().getAlternatives()); 
            // InternalMyAtlProject.g:501:3: ( rule__EssentialOCLInfixOperator__Alternatives )
            // InternalMyAtlProject.g:501:4: rule__EssentialOCLInfixOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EssentialOCLInfixOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEssentialOCLInfixOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEssentialOCLInfixOperator"


    // $ANTLR start "entryRuleEssentialOCLNavigationOperator"
    // InternalMyAtlProject.g:510:1: entryRuleEssentialOCLNavigationOperator : ruleEssentialOCLNavigationOperator EOF ;
    public final void entryRuleEssentialOCLNavigationOperator() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:511:1: ( ruleEssentialOCLNavigationOperator EOF )
            // InternalMyAtlProject.g:512:1: ruleEssentialOCLNavigationOperator EOF
            {
             before(grammarAccess.getEssentialOCLNavigationOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleEssentialOCLNavigationOperator();

            state._fsp--;

             after(grammarAccess.getEssentialOCLNavigationOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEssentialOCLNavigationOperator"


    // $ANTLR start "ruleEssentialOCLNavigationOperator"
    // InternalMyAtlProject.g:519:1: ruleEssentialOCLNavigationOperator : ( ( rule__EssentialOCLNavigationOperator__Alternatives ) ) ;
    public final void ruleEssentialOCLNavigationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:523:2: ( ( ( rule__EssentialOCLNavigationOperator__Alternatives ) ) )
            // InternalMyAtlProject.g:524:2: ( ( rule__EssentialOCLNavigationOperator__Alternatives ) )
            {
            // InternalMyAtlProject.g:524:2: ( ( rule__EssentialOCLNavigationOperator__Alternatives ) )
            // InternalMyAtlProject.g:525:3: ( rule__EssentialOCLNavigationOperator__Alternatives )
            {
             before(grammarAccess.getEssentialOCLNavigationOperatorAccess().getAlternatives()); 
            // InternalMyAtlProject.g:526:3: ( rule__EssentialOCLNavigationOperator__Alternatives )
            // InternalMyAtlProject.g:526:4: rule__EssentialOCLNavigationOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EssentialOCLNavigationOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEssentialOCLNavigationOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEssentialOCLNavigationOperator"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMyAtlProject.g:535:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:536:1: ( ruleStringLiteral EOF )
            // InternalMyAtlProject.g:537:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMyAtlProject.g:544:1: ruleStringLiteral : ( RULE_SINGLE_QUOTED_STRING ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:548:2: ( ( RULE_SINGLE_QUOTED_STRING ) )
            // InternalMyAtlProject.g:549:2: ( RULE_SINGLE_QUOTED_STRING )
            {
            // InternalMyAtlProject.g:549:2: ( RULE_SINGLE_QUOTED_STRING )
            // InternalMyAtlProject.g:550:3: RULE_SINGLE_QUOTED_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall()); 
            match(input,RULE_SINGLE_QUOTED_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRulePrefixOperator"
    // InternalMyAtlProject.g:560:1: entryRulePrefixOperator : rulePrefixOperator EOF ;
    public final void entryRulePrefixOperator() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:561:1: ( rulePrefixOperator EOF )
            // InternalMyAtlProject.g:562:1: rulePrefixOperator EOF
            {
             before(grammarAccess.getPrefixOperatorRule()); 
            pushFollow(FOLLOW_1);
            rulePrefixOperator();

            state._fsp--;

             after(grammarAccess.getPrefixOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefixOperator"


    // $ANTLR start "rulePrefixOperator"
    // InternalMyAtlProject.g:569:1: rulePrefixOperator : ( ruleEssentialOCLPrefixOperator ) ;
    public final void rulePrefixOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:573:2: ( ( ruleEssentialOCLPrefixOperator ) )
            // InternalMyAtlProject.g:574:2: ( ruleEssentialOCLPrefixOperator )
            {
            // InternalMyAtlProject.g:574:2: ( ruleEssentialOCLPrefixOperator )
            // InternalMyAtlProject.g:575:3: ruleEssentialOCLPrefixOperator
            {
             before(grammarAccess.getPrefixOperatorAccess().getEssentialOCLPrefixOperatorParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleEssentialOCLPrefixOperator();

            state._fsp--;

             after(grammarAccess.getPrefixOperatorAccess().getEssentialOCLPrefixOperatorParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefixOperator"


    // $ANTLR start "entryRuleInfixOperator"
    // InternalMyAtlProject.g:585:1: entryRuleInfixOperator : ruleInfixOperator EOF ;
    public final void entryRuleInfixOperator() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:586:1: ( ruleInfixOperator EOF )
            // InternalMyAtlProject.g:587:1: ruleInfixOperator EOF
            {
             before(grammarAccess.getInfixOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleInfixOperator();

            state._fsp--;

             after(grammarAccess.getInfixOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInfixOperator"


    // $ANTLR start "ruleInfixOperator"
    // InternalMyAtlProject.g:594:1: ruleInfixOperator : ( ruleEssentialOCLInfixOperator ) ;
    public final void ruleInfixOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:598:2: ( ( ruleEssentialOCLInfixOperator ) )
            // InternalMyAtlProject.g:599:2: ( ruleEssentialOCLInfixOperator )
            {
            // InternalMyAtlProject.g:599:2: ( ruleEssentialOCLInfixOperator )
            // InternalMyAtlProject.g:600:3: ruleEssentialOCLInfixOperator
            {
             before(grammarAccess.getInfixOperatorAccess().getEssentialOCLInfixOperatorParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleEssentialOCLInfixOperator();

            state._fsp--;

             after(grammarAccess.getInfixOperatorAccess().getEssentialOCLInfixOperatorParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInfixOperator"


    // $ANTLR start "entryRuleNavigationOperator"
    // InternalMyAtlProject.g:610:1: entryRuleNavigationOperator : ruleNavigationOperator EOF ;
    public final void entryRuleNavigationOperator() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:611:1: ( ruleNavigationOperator EOF )
            // InternalMyAtlProject.g:612:1: ruleNavigationOperator EOF
            {
             before(grammarAccess.getNavigationOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigationOperator();

            state._fsp--;

             after(grammarAccess.getNavigationOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavigationOperator"


    // $ANTLR start "ruleNavigationOperator"
    // InternalMyAtlProject.g:619:1: ruleNavigationOperator : ( ruleEssentialOCLNavigationOperator ) ;
    public final void ruleNavigationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:623:2: ( ( ruleEssentialOCLNavigationOperator ) )
            // InternalMyAtlProject.g:624:2: ( ruleEssentialOCLNavigationOperator )
            {
            // InternalMyAtlProject.g:624:2: ( ruleEssentialOCLNavigationOperator )
            // InternalMyAtlProject.g:625:3: ruleEssentialOCLNavigationOperator
            {
             before(grammarAccess.getNavigationOperatorAccess().getEssentialOCLNavigationOperatorParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleEssentialOCLNavigationOperator();

            state._fsp--;

             after(grammarAccess.getNavigationOperatorAccess().getEssentialOCLNavigationOperatorParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigationOperator"


    // $ANTLR start "entryRuleEssentialOCLUnrestrictedName"
    // InternalMyAtlProject.g:635:1: entryRuleEssentialOCLUnrestrictedName : ruleEssentialOCLUnrestrictedName EOF ;
    public final void entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:636:1: ( ruleEssentialOCLUnrestrictedName EOF )
            // InternalMyAtlProject.g:637:1: ruleEssentialOCLUnrestrictedName EOF
            {
             before(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleEssentialOCLUnrestrictedName();

            state._fsp--;

             after(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEssentialOCLUnrestrictedName"


    // $ANTLR start "ruleEssentialOCLUnrestrictedName"
    // InternalMyAtlProject.g:644:1: ruleEssentialOCLUnrestrictedName : ( RULE_SIMPLE_ID ) ;
    public final void ruleEssentialOCLUnrestrictedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:648:2: ( ( RULE_SIMPLE_ID ) )
            // InternalMyAtlProject.g:649:2: ( RULE_SIMPLE_ID )
            {
            // InternalMyAtlProject.g:649:2: ( RULE_SIMPLE_ID )
            // InternalMyAtlProject.g:650:3: RULE_SIMPLE_ID
            {
             before(grammarAccess.getEssentialOCLUnrestrictedNameAccess().getSIMPLE_IDTerminalRuleCall()); 
            match(input,RULE_SIMPLE_ID,FOLLOW_2); 
             after(grammarAccess.getEssentialOCLUnrestrictedNameAccess().getSIMPLE_IDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEssentialOCLUnrestrictedName"


    // $ANTLR start "entryRuleUnrestrictedName"
    // InternalMyAtlProject.g:660:1: entryRuleUnrestrictedName : ruleUnrestrictedName EOF ;
    public final void entryRuleUnrestrictedName() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:661:1: ( ruleUnrestrictedName EOF )
            // InternalMyAtlProject.g:662:1: ruleUnrestrictedName EOF
            {
             before(grammarAccess.getUnrestrictedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleUnrestrictedName();

            state._fsp--;

             after(grammarAccess.getUnrestrictedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnrestrictedName"


    // $ANTLR start "ruleUnrestrictedName"
    // InternalMyAtlProject.g:669:1: ruleUnrestrictedName : ( ruleEssentialOCLUnrestrictedName ) ;
    public final void ruleUnrestrictedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:673:2: ( ( ruleEssentialOCLUnrestrictedName ) )
            // InternalMyAtlProject.g:674:2: ( ruleEssentialOCLUnrestrictedName )
            {
            // InternalMyAtlProject.g:674:2: ( ruleEssentialOCLUnrestrictedName )
            // InternalMyAtlProject.g:675:3: ruleEssentialOCLUnrestrictedName
            {
             before(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleEssentialOCLUnrestrictedName();

            state._fsp--;

             after(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnrestrictedName"


    // $ANTLR start "entryRuleEssentialOCLUnreservedName"
    // InternalMyAtlProject.g:685:1: entryRuleEssentialOCLUnreservedName : ruleEssentialOCLUnreservedName EOF ;
    public final void entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:686:1: ( ruleEssentialOCLUnreservedName EOF )
            // InternalMyAtlProject.g:687:1: ruleEssentialOCLUnreservedName EOF
            {
             before(grammarAccess.getEssentialOCLUnreservedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleEssentialOCLUnreservedName();

            state._fsp--;

             after(grammarAccess.getEssentialOCLUnreservedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEssentialOCLUnreservedName"


    // $ANTLR start "ruleEssentialOCLUnreservedName"
    // InternalMyAtlProject.g:694:1: ruleEssentialOCLUnreservedName : ( ( rule__EssentialOCLUnreservedName__Alternatives ) ) ;
    public final void ruleEssentialOCLUnreservedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:698:2: ( ( ( rule__EssentialOCLUnreservedName__Alternatives ) ) )
            // InternalMyAtlProject.g:699:2: ( ( rule__EssentialOCLUnreservedName__Alternatives ) )
            {
            // InternalMyAtlProject.g:699:2: ( ( rule__EssentialOCLUnreservedName__Alternatives ) )
            // InternalMyAtlProject.g:700:3: ( rule__EssentialOCLUnreservedName__Alternatives )
            {
             before(grammarAccess.getEssentialOCLUnreservedNameAccess().getAlternatives()); 
            // InternalMyAtlProject.g:701:3: ( rule__EssentialOCLUnreservedName__Alternatives )
            // InternalMyAtlProject.g:701:4: rule__EssentialOCLUnreservedName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EssentialOCLUnreservedName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEssentialOCLUnreservedNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEssentialOCLUnreservedName"


    // $ANTLR start "entryRulePrimitiveTypeIdentifier"
    // InternalMyAtlProject.g:710:1: entryRulePrimitiveTypeIdentifier : rulePrimitiveTypeIdentifier EOF ;
    public final void entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:711:1: ( rulePrimitiveTypeIdentifier EOF )
            // InternalMyAtlProject.g:712:1: rulePrimitiveTypeIdentifier EOF
            {
             before(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveTypeIdentifier();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveTypeIdentifier"


    // $ANTLR start "rulePrimitiveTypeIdentifier"
    // InternalMyAtlProject.g:719:1: rulePrimitiveTypeIdentifier : ( ( rule__PrimitiveTypeIdentifier__Alternatives ) ) ;
    public final void rulePrimitiveTypeIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:723:2: ( ( ( rule__PrimitiveTypeIdentifier__Alternatives ) ) )
            // InternalMyAtlProject.g:724:2: ( ( rule__PrimitiveTypeIdentifier__Alternatives ) )
            {
            // InternalMyAtlProject.g:724:2: ( ( rule__PrimitiveTypeIdentifier__Alternatives ) )
            // InternalMyAtlProject.g:725:3: ( rule__PrimitiveTypeIdentifier__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeIdentifierAccess().getAlternatives()); 
            // InternalMyAtlProject.g:726:3: ( rule__PrimitiveTypeIdentifier__Alternatives )
            // InternalMyAtlProject.g:726:4: rule__PrimitiveTypeIdentifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeIdentifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeIdentifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveTypeIdentifier"


    // $ANTLR start "entryRulePrimitiveTypeCS"
    // InternalMyAtlProject.g:735:1: entryRulePrimitiveTypeCS : rulePrimitiveTypeCS EOF ;
    public final void entryRulePrimitiveTypeCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:736:1: ( rulePrimitiveTypeCS EOF )
            // InternalMyAtlProject.g:737:1: rulePrimitiveTypeCS EOF
            {
             before(grammarAccess.getPrimitiveTypeCSRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveTypeCS();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveTypeCS"


    // $ANTLR start "rulePrimitiveTypeCS"
    // InternalMyAtlProject.g:744:1: rulePrimitiveTypeCS : ( ( rule__PrimitiveTypeCS__NameAssignment ) ) ;
    public final void rulePrimitiveTypeCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:748:2: ( ( ( rule__PrimitiveTypeCS__NameAssignment ) ) )
            // InternalMyAtlProject.g:749:2: ( ( rule__PrimitiveTypeCS__NameAssignment ) )
            {
            // InternalMyAtlProject.g:749:2: ( ( rule__PrimitiveTypeCS__NameAssignment ) )
            // InternalMyAtlProject.g:750:3: ( rule__PrimitiveTypeCS__NameAssignment )
            {
             before(grammarAccess.getPrimitiveTypeCSAccess().getNameAssignment()); 
            // InternalMyAtlProject.g:751:3: ( rule__PrimitiveTypeCS__NameAssignment )
            // InternalMyAtlProject.g:751:4: rule__PrimitiveTypeCS__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeCS__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeCSAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveTypeCS"


    // $ANTLR start "entryRuleCollectionTypeIdentifier"
    // InternalMyAtlProject.g:760:1: entryRuleCollectionTypeIdentifier : ruleCollectionTypeIdentifier EOF ;
    public final void entryRuleCollectionTypeIdentifier() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:761:1: ( ruleCollectionTypeIdentifier EOF )
            // InternalMyAtlProject.g:762:1: ruleCollectionTypeIdentifier EOF
            {
             before(grammarAccess.getCollectionTypeIdentifierRule()); 
            pushFollow(FOLLOW_1);
            ruleCollectionTypeIdentifier();

            state._fsp--;

             after(grammarAccess.getCollectionTypeIdentifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollectionTypeIdentifier"


    // $ANTLR start "ruleCollectionTypeIdentifier"
    // InternalMyAtlProject.g:769:1: ruleCollectionTypeIdentifier : ( ( rule__CollectionTypeIdentifier__Alternatives ) ) ;
    public final void ruleCollectionTypeIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:773:2: ( ( ( rule__CollectionTypeIdentifier__Alternatives ) ) )
            // InternalMyAtlProject.g:774:2: ( ( rule__CollectionTypeIdentifier__Alternatives ) )
            {
            // InternalMyAtlProject.g:774:2: ( ( rule__CollectionTypeIdentifier__Alternatives ) )
            // InternalMyAtlProject.g:775:3: ( rule__CollectionTypeIdentifier__Alternatives )
            {
             before(grammarAccess.getCollectionTypeIdentifierAccess().getAlternatives()); 
            // InternalMyAtlProject.g:776:3: ( rule__CollectionTypeIdentifier__Alternatives )
            // InternalMyAtlProject.g:776:4: rule__CollectionTypeIdentifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CollectionTypeIdentifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCollectionTypeIdentifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollectionTypeIdentifier"


    // $ANTLR start "entryRuleCollectionTypeCS"
    // InternalMyAtlProject.g:785:1: entryRuleCollectionTypeCS : ruleCollectionTypeCS EOF ;
    public final void entryRuleCollectionTypeCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:786:1: ( ruleCollectionTypeCS EOF )
            // InternalMyAtlProject.g:787:1: ruleCollectionTypeCS EOF
            {
             before(grammarAccess.getCollectionTypeCSRule()); 
            pushFollow(FOLLOW_1);
            ruleCollectionTypeCS();

            state._fsp--;

             after(grammarAccess.getCollectionTypeCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollectionTypeCS"


    // $ANTLR start "ruleCollectionTypeCS"
    // InternalMyAtlProject.g:794:1: ruleCollectionTypeCS : ( ( rule__CollectionTypeCS__Group__0 ) ) ;
    public final void ruleCollectionTypeCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:798:2: ( ( ( rule__CollectionTypeCS__Group__0 ) ) )
            // InternalMyAtlProject.g:799:2: ( ( rule__CollectionTypeCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:799:2: ( ( rule__CollectionTypeCS__Group__0 ) )
            // InternalMyAtlProject.g:800:3: ( rule__CollectionTypeCS__Group__0 )
            {
             before(grammarAccess.getCollectionTypeCSAccess().getGroup()); 
            // InternalMyAtlProject.g:801:3: ( rule__CollectionTypeCS__Group__0 )
            // InternalMyAtlProject.g:801:4: rule__CollectionTypeCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionTypeCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionTypeCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollectionTypeCS"


    // $ANTLR start "entryRuleCollectionLiteralExpCS"
    // InternalMyAtlProject.g:810:1: entryRuleCollectionLiteralExpCS : ruleCollectionLiteralExpCS EOF ;
    public final void entryRuleCollectionLiteralExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:811:1: ( ruleCollectionLiteralExpCS EOF )
            // InternalMyAtlProject.g:812:1: ruleCollectionLiteralExpCS EOF
            {
             before(grammarAccess.getCollectionLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleCollectionLiteralExpCS();

            state._fsp--;

             after(grammarAccess.getCollectionLiteralExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollectionLiteralExpCS"


    // $ANTLR start "ruleCollectionLiteralExpCS"
    // InternalMyAtlProject.g:819:1: ruleCollectionLiteralExpCS : ( ( rule__CollectionLiteralExpCS__Group__0 ) ) ;
    public final void ruleCollectionLiteralExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:823:2: ( ( ( rule__CollectionLiteralExpCS__Group__0 ) ) )
            // InternalMyAtlProject.g:824:2: ( ( rule__CollectionLiteralExpCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:824:2: ( ( rule__CollectionLiteralExpCS__Group__0 ) )
            // InternalMyAtlProject.g:825:3: ( rule__CollectionLiteralExpCS__Group__0 )
            {
             before(grammarAccess.getCollectionLiteralExpCSAccess().getGroup()); 
            // InternalMyAtlProject.g:826:3: ( rule__CollectionLiteralExpCS__Group__0 )
            // InternalMyAtlProject.g:826:4: rule__CollectionLiteralExpCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionLiteralExpCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionLiteralExpCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollectionLiteralExpCS"


    // $ANTLR start "entryRuleCollectionLiteralPartCS"
    // InternalMyAtlProject.g:835:1: entryRuleCollectionLiteralPartCS : ruleCollectionLiteralPartCS EOF ;
    public final void entryRuleCollectionLiteralPartCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:836:1: ( ruleCollectionLiteralPartCS EOF )
            // InternalMyAtlProject.g:837:1: ruleCollectionLiteralPartCS EOF
            {
             before(grammarAccess.getCollectionLiteralPartCSRule()); 
            pushFollow(FOLLOW_1);
            ruleCollectionLiteralPartCS();

            state._fsp--;

             after(grammarAccess.getCollectionLiteralPartCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollectionLiteralPartCS"


    // $ANTLR start "ruleCollectionLiteralPartCS"
    // InternalMyAtlProject.g:844:1: ruleCollectionLiteralPartCS : ( ( rule__CollectionLiteralPartCS__Group__0 ) ) ;
    public final void ruleCollectionLiteralPartCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:848:2: ( ( ( rule__CollectionLiteralPartCS__Group__0 ) ) )
            // InternalMyAtlProject.g:849:2: ( ( rule__CollectionLiteralPartCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:849:2: ( ( rule__CollectionLiteralPartCS__Group__0 ) )
            // InternalMyAtlProject.g:850:3: ( rule__CollectionLiteralPartCS__Group__0 )
            {
             before(grammarAccess.getCollectionLiteralPartCSAccess().getGroup()); 
            // InternalMyAtlProject.g:851:3: ( rule__CollectionLiteralPartCS__Group__0 )
            // InternalMyAtlProject.g:851:4: rule__CollectionLiteralPartCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionLiteralPartCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionLiteralPartCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollectionLiteralPartCS"


    // $ANTLR start "entryRulePrimitiveLiteralExpCS"
    // InternalMyAtlProject.g:860:1: entryRulePrimitiveLiteralExpCS : rulePrimitiveLiteralExpCS EOF ;
    public final void entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:861:1: ( rulePrimitiveLiteralExpCS EOF )
            // InternalMyAtlProject.g:862:1: rulePrimitiveLiteralExpCS EOF
            {
             before(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveLiteralExpCS();

            state._fsp--;

             after(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveLiteralExpCS"


    // $ANTLR start "rulePrimitiveLiteralExpCS"
    // InternalMyAtlProject.g:869:1: rulePrimitiveLiteralExpCS : ( ( rule__PrimitiveLiteralExpCS__Alternatives ) ) ;
    public final void rulePrimitiveLiteralExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:873:2: ( ( ( rule__PrimitiveLiteralExpCS__Alternatives ) ) )
            // InternalMyAtlProject.g:874:2: ( ( rule__PrimitiveLiteralExpCS__Alternatives ) )
            {
            // InternalMyAtlProject.g:874:2: ( ( rule__PrimitiveLiteralExpCS__Alternatives ) )
            // InternalMyAtlProject.g:875:3: ( rule__PrimitiveLiteralExpCS__Alternatives )
            {
             before(grammarAccess.getPrimitiveLiteralExpCSAccess().getAlternatives()); 
            // InternalMyAtlProject.g:876:3: ( rule__PrimitiveLiteralExpCS__Alternatives )
            // InternalMyAtlProject.g:876:4: rule__PrimitiveLiteralExpCS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveLiteralExpCS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveLiteralExpCSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralExpCS"
    // InternalMyAtlProject.g:885:1: entryRuleTupleLiteralExpCS : ruleTupleLiteralExpCS EOF ;
    public final void entryRuleTupleLiteralExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:886:1: ( ruleTupleLiteralExpCS EOF )
            // InternalMyAtlProject.g:887:1: ruleTupleLiteralExpCS EOF
            {
             before(grammarAccess.getTupleLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleTupleLiteralExpCS();

            state._fsp--;

             after(grammarAccess.getTupleLiteralExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTupleLiteralExpCS"


    // $ANTLR start "ruleTupleLiteralExpCS"
    // InternalMyAtlProject.g:894:1: ruleTupleLiteralExpCS : ( ( rule__TupleLiteralExpCS__Group__0 ) ) ;
    public final void ruleTupleLiteralExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:898:2: ( ( ( rule__TupleLiteralExpCS__Group__0 ) ) )
            // InternalMyAtlProject.g:899:2: ( ( rule__TupleLiteralExpCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:899:2: ( ( rule__TupleLiteralExpCS__Group__0 ) )
            // InternalMyAtlProject.g:900:3: ( rule__TupleLiteralExpCS__Group__0 )
            {
             before(grammarAccess.getTupleLiteralExpCSAccess().getGroup()); 
            // InternalMyAtlProject.g:901:3: ( rule__TupleLiteralExpCS__Group__0 )
            // InternalMyAtlProject.g:901:4: rule__TupleLiteralExpCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TupleLiteralExpCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTupleLiteralExpCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTupleLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralPartCS"
    // InternalMyAtlProject.g:910:1: entryRuleTupleLiteralPartCS : ruleTupleLiteralPartCS EOF ;
    public final void entryRuleTupleLiteralPartCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:911:1: ( ruleTupleLiteralPartCS EOF )
            // InternalMyAtlProject.g:912:1: ruleTupleLiteralPartCS EOF
            {
             before(grammarAccess.getTupleLiteralPartCSRule()); 
            pushFollow(FOLLOW_1);
            ruleTupleLiteralPartCS();

            state._fsp--;

             after(grammarAccess.getTupleLiteralPartCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTupleLiteralPartCS"


    // $ANTLR start "ruleTupleLiteralPartCS"
    // InternalMyAtlProject.g:919:1: ruleTupleLiteralPartCS : ( ( rule__TupleLiteralPartCS__Group__0 ) ) ;
    public final void ruleTupleLiteralPartCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:923:2: ( ( ( rule__TupleLiteralPartCS__Group__0 ) ) )
            // InternalMyAtlProject.g:924:2: ( ( rule__TupleLiteralPartCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:924:2: ( ( rule__TupleLiteralPartCS__Group__0 ) )
            // InternalMyAtlProject.g:925:3: ( rule__TupleLiteralPartCS__Group__0 )
            {
             before(grammarAccess.getTupleLiteralPartCSAccess().getGroup()); 
            // InternalMyAtlProject.g:926:3: ( rule__TupleLiteralPartCS__Group__0 )
            // InternalMyAtlProject.g:926:4: rule__TupleLiteralPartCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TupleLiteralPartCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTupleLiteralPartCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTupleLiteralPartCS"


    // $ANTLR start "entryRuleNumberLiteralExpCS"
    // InternalMyAtlProject.g:935:1: entryRuleNumberLiteralExpCS : ruleNumberLiteralExpCS EOF ;
    public final void entryRuleNumberLiteralExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:936:1: ( ruleNumberLiteralExpCS EOF )
            // InternalMyAtlProject.g:937:1: ruleNumberLiteralExpCS EOF
            {
             before(grammarAccess.getNumberLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteralExpCS();

            state._fsp--;

             after(grammarAccess.getNumberLiteralExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberLiteralExpCS"


    // $ANTLR start "ruleNumberLiteralExpCS"
    // InternalMyAtlProject.g:944:1: ruleNumberLiteralExpCS : ( ( rule__NumberLiteralExpCS__NameAssignment ) ) ;
    public final void ruleNumberLiteralExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:948:2: ( ( ( rule__NumberLiteralExpCS__NameAssignment ) ) )
            // InternalMyAtlProject.g:949:2: ( ( rule__NumberLiteralExpCS__NameAssignment ) )
            {
            // InternalMyAtlProject.g:949:2: ( ( rule__NumberLiteralExpCS__NameAssignment ) )
            // InternalMyAtlProject.g:950:3: ( rule__NumberLiteralExpCS__NameAssignment )
            {
             before(grammarAccess.getNumberLiteralExpCSAccess().getNameAssignment()); 
            // InternalMyAtlProject.g:951:3: ( rule__NumberLiteralExpCS__NameAssignment )
            // InternalMyAtlProject.g:951:4: rule__NumberLiteralExpCS__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteralExpCS__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralExpCSAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteralExpCS"


    // $ANTLR start "entryRuleStringLiteralExpCS"
    // InternalMyAtlProject.g:960:1: entryRuleStringLiteralExpCS : ruleStringLiteralExpCS EOF ;
    public final void entryRuleStringLiteralExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:961:1: ( ruleStringLiteralExpCS EOF )
            // InternalMyAtlProject.g:962:1: ruleStringLiteralExpCS EOF
            {
             before(grammarAccess.getStringLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteralExpCS();

            state._fsp--;

             after(grammarAccess.getStringLiteralExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteralExpCS"


    // $ANTLR start "ruleStringLiteralExpCS"
    // InternalMyAtlProject.g:969:1: ruleStringLiteralExpCS : ( ( rule__StringLiteralExpCS__NameAssignment ) ) ;
    public final void ruleStringLiteralExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:973:2: ( ( ( rule__StringLiteralExpCS__NameAssignment ) ) )
            // InternalMyAtlProject.g:974:2: ( ( rule__StringLiteralExpCS__NameAssignment ) )
            {
            // InternalMyAtlProject.g:974:2: ( ( rule__StringLiteralExpCS__NameAssignment ) )
            // InternalMyAtlProject.g:975:3: ( rule__StringLiteralExpCS__NameAssignment )
            {
             before(grammarAccess.getStringLiteralExpCSAccess().getNameAssignment()); 
            // InternalMyAtlProject.g:976:3: ( rule__StringLiteralExpCS__NameAssignment )
            // InternalMyAtlProject.g:976:4: rule__StringLiteralExpCS__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteralExpCS__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralExpCSAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteralExpCS"


    // $ANTLR start "entryRuleBooleanLiteralExpCS"
    // InternalMyAtlProject.g:985:1: entryRuleBooleanLiteralExpCS : ruleBooleanLiteralExpCS EOF ;
    public final void entryRuleBooleanLiteralExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:986:1: ( ruleBooleanLiteralExpCS EOF )
            // InternalMyAtlProject.g:987:1: ruleBooleanLiteralExpCS EOF
            {
             before(grammarAccess.getBooleanLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanLiteralExpCS();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanLiteralExpCS"


    // $ANTLR start "ruleBooleanLiteralExpCS"
    // InternalMyAtlProject.g:994:1: ruleBooleanLiteralExpCS : ( ( rule__BooleanLiteralExpCS__Alternatives ) ) ;
    public final void ruleBooleanLiteralExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:998:2: ( ( ( rule__BooleanLiteralExpCS__Alternatives ) ) )
            // InternalMyAtlProject.g:999:2: ( ( rule__BooleanLiteralExpCS__Alternatives ) )
            {
            // InternalMyAtlProject.g:999:2: ( ( rule__BooleanLiteralExpCS__Alternatives ) )
            // InternalMyAtlProject.g:1000:3: ( rule__BooleanLiteralExpCS__Alternatives )
            {
             before(grammarAccess.getBooleanLiteralExpCSAccess().getAlternatives()); 
            // InternalMyAtlProject.g:1001:3: ( rule__BooleanLiteralExpCS__Alternatives )
            // InternalMyAtlProject.g:1001:4: rule__BooleanLiteralExpCS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteralExpCS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralExpCSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteralExpCS"


    // $ANTLR start "entryRuleUnlimitedNaturalLiteralExpCS"
    // InternalMyAtlProject.g:1010:1: entryRuleUnlimitedNaturalLiteralExpCS : ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final void entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1011:1: ( ruleUnlimitedNaturalLiteralExpCS EOF )
            // InternalMyAtlProject.g:1012:1: ruleUnlimitedNaturalLiteralExpCS EOF
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;

             after(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "ruleUnlimitedNaturalLiteralExpCS"
    // InternalMyAtlProject.g:1019:1: ruleUnlimitedNaturalLiteralExpCS : ( ( rule__UnlimitedNaturalLiteralExpCS__Group__0 ) ) ;
    public final void ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1023:2: ( ( ( rule__UnlimitedNaturalLiteralExpCS__Group__0 ) ) )
            // InternalMyAtlProject.g:1024:2: ( ( rule__UnlimitedNaturalLiteralExpCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:1024:2: ( ( rule__UnlimitedNaturalLiteralExpCS__Group__0 ) )
            // InternalMyAtlProject.g:1025:3: ( rule__UnlimitedNaturalLiteralExpCS__Group__0 )
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getGroup()); 
            // InternalMyAtlProject.g:1026:3: ( rule__UnlimitedNaturalLiteralExpCS__Group__0 )
            // InternalMyAtlProject.g:1026:4: rule__UnlimitedNaturalLiteralExpCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnlimitedNaturalLiteralExpCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "entryRuleInvalidLiteralExpCS"
    // InternalMyAtlProject.g:1035:1: entryRuleInvalidLiteralExpCS : ruleInvalidLiteralExpCS EOF ;
    public final void entryRuleInvalidLiteralExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1036:1: ( ruleInvalidLiteralExpCS EOF )
            // InternalMyAtlProject.g:1037:1: ruleInvalidLiteralExpCS EOF
            {
             before(grammarAccess.getInvalidLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleInvalidLiteralExpCS();

            state._fsp--;

             after(grammarAccess.getInvalidLiteralExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInvalidLiteralExpCS"


    // $ANTLR start "ruleInvalidLiteralExpCS"
    // InternalMyAtlProject.g:1044:1: ruleInvalidLiteralExpCS : ( ( rule__InvalidLiteralExpCS__Group__0 ) ) ;
    public final void ruleInvalidLiteralExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1048:2: ( ( ( rule__InvalidLiteralExpCS__Group__0 ) ) )
            // InternalMyAtlProject.g:1049:2: ( ( rule__InvalidLiteralExpCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:1049:2: ( ( rule__InvalidLiteralExpCS__Group__0 ) )
            // InternalMyAtlProject.g:1050:3: ( rule__InvalidLiteralExpCS__Group__0 )
            {
             before(grammarAccess.getInvalidLiteralExpCSAccess().getGroup()); 
            // InternalMyAtlProject.g:1051:3: ( rule__InvalidLiteralExpCS__Group__0 )
            // InternalMyAtlProject.g:1051:4: rule__InvalidLiteralExpCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InvalidLiteralExpCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInvalidLiteralExpCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInvalidLiteralExpCS"


    // $ANTLR start "entryRuleNullLiteralExpCS"
    // InternalMyAtlProject.g:1060:1: entryRuleNullLiteralExpCS : ruleNullLiteralExpCS EOF ;
    public final void entryRuleNullLiteralExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1061:1: ( ruleNullLiteralExpCS EOF )
            // InternalMyAtlProject.g:1062:1: ruleNullLiteralExpCS EOF
            {
             before(grammarAccess.getNullLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleNullLiteralExpCS();

            state._fsp--;

             after(grammarAccess.getNullLiteralExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullLiteralExpCS"


    // $ANTLR start "ruleNullLiteralExpCS"
    // InternalMyAtlProject.g:1069:1: ruleNullLiteralExpCS : ( ( rule__NullLiteralExpCS__Group__0 ) ) ;
    public final void ruleNullLiteralExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1073:2: ( ( ( rule__NullLiteralExpCS__Group__0 ) ) )
            // InternalMyAtlProject.g:1074:2: ( ( rule__NullLiteralExpCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:1074:2: ( ( rule__NullLiteralExpCS__Group__0 ) )
            // InternalMyAtlProject.g:1075:3: ( rule__NullLiteralExpCS__Group__0 )
            {
             before(grammarAccess.getNullLiteralExpCSAccess().getGroup()); 
            // InternalMyAtlProject.g:1076:3: ( rule__NullLiteralExpCS__Group__0 )
            // InternalMyAtlProject.g:1076:4: rule__NullLiteralExpCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NullLiteralExpCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNullLiteralExpCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullLiteralExpCS"


    // $ANTLR start "entryRuleTypeLiteralCS"
    // InternalMyAtlProject.g:1085:1: entryRuleTypeLiteralCS : ruleTypeLiteralCS EOF ;
    public final void entryRuleTypeLiteralCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1086:1: ( ruleTypeLiteralCS EOF )
            // InternalMyAtlProject.g:1087:1: ruleTypeLiteralCS EOF
            {
             before(grammarAccess.getTypeLiteralCSRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeLiteralCS();

            state._fsp--;

             after(grammarAccess.getTypeLiteralCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeLiteralCS"


    // $ANTLR start "ruleTypeLiteralCS"
    // InternalMyAtlProject.g:1094:1: ruleTypeLiteralCS : ( rulePrimitiveTypeCS ) ;
    public final void ruleTypeLiteralCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1098:2: ( ( rulePrimitiveTypeCS ) )
            // InternalMyAtlProject.g:1099:2: ( rulePrimitiveTypeCS )
            {
            // InternalMyAtlProject.g:1099:2: ( rulePrimitiveTypeCS )
            // InternalMyAtlProject.g:1100:3: rulePrimitiveTypeCS
            {
             before(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveTypeCS();

            state._fsp--;

             after(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeLiteralCS"


    // $ANTLR start "entryRuleTypeLiteralExpCS"
    // InternalMyAtlProject.g:1110:1: entryRuleTypeLiteralExpCS : ruleTypeLiteralExpCS EOF ;
    public final void entryRuleTypeLiteralExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1111:1: ( ruleTypeLiteralExpCS EOF )
            // InternalMyAtlProject.g:1112:1: ruleTypeLiteralExpCS EOF
            {
             before(grammarAccess.getTypeLiteralExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeLiteralExpCS();

            state._fsp--;

             after(grammarAccess.getTypeLiteralExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeLiteralExpCS"


    // $ANTLR start "ruleTypeLiteralExpCS"
    // InternalMyAtlProject.g:1119:1: ruleTypeLiteralExpCS : ( ( rule__TypeLiteralExpCS__OwnedTypeAssignment ) ) ;
    public final void ruleTypeLiteralExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1123:2: ( ( ( rule__TypeLiteralExpCS__OwnedTypeAssignment ) ) )
            // InternalMyAtlProject.g:1124:2: ( ( rule__TypeLiteralExpCS__OwnedTypeAssignment ) )
            {
            // InternalMyAtlProject.g:1124:2: ( ( rule__TypeLiteralExpCS__OwnedTypeAssignment ) )
            // InternalMyAtlProject.g:1125:3: ( rule__TypeLiteralExpCS__OwnedTypeAssignment )
            {
             before(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeAssignment()); 
            // InternalMyAtlProject.g:1126:3: ( rule__TypeLiteralExpCS__OwnedTypeAssignment )
            // InternalMyAtlProject.g:1126:4: rule__TypeLiteralExpCS__OwnedTypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeLiteralExpCS__OwnedTypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeLiteralExpCS"


    // $ANTLR start "entryRuleTypeNameExpCS"
    // InternalMyAtlProject.g:1135:1: entryRuleTypeNameExpCS : ruleTypeNameExpCS EOF ;
    public final void entryRuleTypeNameExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1136:1: ( ruleTypeNameExpCS EOF )
            // InternalMyAtlProject.g:1137:1: ruleTypeNameExpCS EOF
            {
             before(grammarAccess.getTypeNameExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeNameExpCS();

            state._fsp--;

             after(grammarAccess.getTypeNameExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeNameExpCS"


    // $ANTLR start "ruleTypeNameExpCS"
    // InternalMyAtlProject.g:1144:1: ruleTypeNameExpCS : ( ruleEssentialOCLUnrestrictedName ) ;
    public final void ruleTypeNameExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1148:2: ( ( ruleEssentialOCLUnrestrictedName ) )
            // InternalMyAtlProject.g:1149:2: ( ruleEssentialOCLUnrestrictedName )
            {
            // InternalMyAtlProject.g:1149:2: ( ruleEssentialOCLUnrestrictedName )
            // InternalMyAtlProject.g:1150:3: ruleEssentialOCLUnrestrictedName
            {
             before(grammarAccess.getTypeNameExpCSAccess().getEssentialOCLUnrestrictedNameParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleEssentialOCLUnrestrictedName();

            state._fsp--;

             after(grammarAccess.getTypeNameExpCSAccess().getEssentialOCLUnrestrictedNameParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeNameExpCS"


    // $ANTLR start "entryRuleTypeExpCS"
    // InternalMyAtlProject.g:1160:1: entryRuleTypeExpCS : ruleTypeExpCS EOF ;
    public final void entryRuleTypeExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1161:1: ( ruleTypeExpCS EOF )
            // InternalMyAtlProject.g:1162:1: ruleTypeExpCS EOF
            {
             before(grammarAccess.getTypeExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeExpCS();

            state._fsp--;

             after(grammarAccess.getTypeExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeExpCS"


    // $ANTLR start "ruleTypeExpCS"
    // InternalMyAtlProject.g:1169:1: ruleTypeExpCS : ( ( rule__TypeExpCS__Alternatives ) ) ;
    public final void ruleTypeExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1173:2: ( ( ( rule__TypeExpCS__Alternatives ) ) )
            // InternalMyAtlProject.g:1174:2: ( ( rule__TypeExpCS__Alternatives ) )
            {
            // InternalMyAtlProject.g:1174:2: ( ( rule__TypeExpCS__Alternatives ) )
            // InternalMyAtlProject.g:1175:3: ( rule__TypeExpCS__Alternatives )
            {
             before(grammarAccess.getTypeExpCSAccess().getAlternatives()); 
            // InternalMyAtlProject.g:1176:3: ( rule__TypeExpCS__Alternatives )
            // InternalMyAtlProject.g:1176:4: rule__TypeExpCS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpCS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpCSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeExpCS"


    // $ANTLR start "entryRuleNavigatingArgCS"
    // InternalMyAtlProject.g:1185:1: entryRuleNavigatingArgCS : ruleNavigatingArgCS EOF ;
    public final void entryRuleNavigatingArgCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1186:1: ( ruleNavigatingArgCS EOF )
            // InternalMyAtlProject.g:1187:1: ruleNavigatingArgCS EOF
            {
             before(grammarAccess.getNavigatingArgCSRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigatingArgCS();

            state._fsp--;

             after(grammarAccess.getNavigatingArgCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavigatingArgCS"


    // $ANTLR start "ruleNavigatingArgCS"
    // InternalMyAtlProject.g:1194:1: ruleNavigatingArgCS : ( ( rule__NavigatingArgCS__Group__0 ) ) ;
    public final void ruleNavigatingArgCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1198:2: ( ( ( rule__NavigatingArgCS__Group__0 ) ) )
            // InternalMyAtlProject.g:1199:2: ( ( rule__NavigatingArgCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:1199:2: ( ( rule__NavigatingArgCS__Group__0 ) )
            // InternalMyAtlProject.g:1200:3: ( rule__NavigatingArgCS__Group__0 )
            {
             before(grammarAccess.getNavigatingArgCSAccess().getGroup()); 
            // InternalMyAtlProject.g:1201:3: ( rule__NavigatingArgCS__Group__0 )
            // InternalMyAtlProject.g:1201:4: rule__NavigatingArgCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingArgCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingArgCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigatingArgCS"


    // $ANTLR start "entryRuleNavigatingBarArgCS"
    // InternalMyAtlProject.g:1210:1: entryRuleNavigatingBarArgCS : ruleNavigatingBarArgCS EOF ;
    public final void entryRuleNavigatingBarArgCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1211:1: ( ruleNavigatingBarArgCS EOF )
            // InternalMyAtlProject.g:1212:1: ruleNavigatingBarArgCS EOF
            {
             before(grammarAccess.getNavigatingBarArgCSRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigatingBarArgCS();

            state._fsp--;

             after(grammarAccess.getNavigatingBarArgCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavigatingBarArgCS"


    // $ANTLR start "ruleNavigatingBarArgCS"
    // InternalMyAtlProject.g:1219:1: ruleNavigatingBarArgCS : ( ( rule__NavigatingBarArgCS__Group__0 ) ) ;
    public final void ruleNavigatingBarArgCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1223:2: ( ( ( rule__NavigatingBarArgCS__Group__0 ) ) )
            // InternalMyAtlProject.g:1224:2: ( ( rule__NavigatingBarArgCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:1224:2: ( ( rule__NavigatingBarArgCS__Group__0 ) )
            // InternalMyAtlProject.g:1225:3: ( rule__NavigatingBarArgCS__Group__0 )
            {
             before(grammarAccess.getNavigatingBarArgCSAccess().getGroup()); 
            // InternalMyAtlProject.g:1226:3: ( rule__NavigatingBarArgCS__Group__0 )
            // InternalMyAtlProject.g:1226:4: rule__NavigatingBarArgCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingBarArgCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingBarArgCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigatingBarArgCS"


    // $ANTLR start "entryRuleNavigatingCommaArgCS"
    // InternalMyAtlProject.g:1235:1: entryRuleNavigatingCommaArgCS : ruleNavigatingCommaArgCS EOF ;
    public final void entryRuleNavigatingCommaArgCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1236:1: ( ruleNavigatingCommaArgCS EOF )
            // InternalMyAtlProject.g:1237:1: ruleNavigatingCommaArgCS EOF
            {
             before(grammarAccess.getNavigatingCommaArgCSRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigatingCommaArgCS();

            state._fsp--;

             after(grammarAccess.getNavigatingCommaArgCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavigatingCommaArgCS"


    // $ANTLR start "ruleNavigatingCommaArgCS"
    // InternalMyAtlProject.g:1244:1: ruleNavigatingCommaArgCS : ( ( rule__NavigatingCommaArgCS__Group__0 ) ) ;
    public final void ruleNavigatingCommaArgCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1248:2: ( ( ( rule__NavigatingCommaArgCS__Group__0 ) ) )
            // InternalMyAtlProject.g:1249:2: ( ( rule__NavigatingCommaArgCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:1249:2: ( ( rule__NavigatingCommaArgCS__Group__0 ) )
            // InternalMyAtlProject.g:1250:3: ( rule__NavigatingCommaArgCS__Group__0 )
            {
             before(grammarAccess.getNavigatingCommaArgCSAccess().getGroup()); 
            // InternalMyAtlProject.g:1251:3: ( rule__NavigatingCommaArgCS__Group__0 )
            // InternalMyAtlProject.g:1251:4: rule__NavigatingCommaArgCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingCommaArgCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingCommaArgCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigatingCommaArgCS"


    // $ANTLR start "entryRuleNavigatingSemiArgCS"
    // InternalMyAtlProject.g:1260:1: entryRuleNavigatingSemiArgCS : ruleNavigatingSemiArgCS EOF ;
    public final void entryRuleNavigatingSemiArgCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1261:1: ( ruleNavigatingSemiArgCS EOF )
            // InternalMyAtlProject.g:1262:1: ruleNavigatingSemiArgCS EOF
            {
             before(grammarAccess.getNavigatingSemiArgCSRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigatingSemiArgCS();

            state._fsp--;

             after(grammarAccess.getNavigatingSemiArgCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavigatingSemiArgCS"


    // $ANTLR start "ruleNavigatingSemiArgCS"
    // InternalMyAtlProject.g:1269:1: ruleNavigatingSemiArgCS : ( ( rule__NavigatingSemiArgCS__Group__0 ) ) ;
    public final void ruleNavigatingSemiArgCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1273:2: ( ( ( rule__NavigatingSemiArgCS__Group__0 ) ) )
            // InternalMyAtlProject.g:1274:2: ( ( rule__NavigatingSemiArgCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:1274:2: ( ( rule__NavigatingSemiArgCS__Group__0 ) )
            // InternalMyAtlProject.g:1275:3: ( rule__NavigatingSemiArgCS__Group__0 )
            {
             before(grammarAccess.getNavigatingSemiArgCSAccess().getGroup()); 
            // InternalMyAtlProject.g:1276:3: ( rule__NavigatingSemiArgCS__Group__0 )
            // InternalMyAtlProject.g:1276:4: rule__NavigatingSemiArgCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingSemiArgCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingSemiArgCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigatingSemiArgCS"


    // $ANTLR start "entryRuleNavigatingArgExpCS"
    // InternalMyAtlProject.g:1285:1: entryRuleNavigatingArgExpCS : ruleNavigatingArgExpCS EOF ;
    public final void entryRuleNavigatingArgExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1286:1: ( ruleNavigatingArgExpCS EOF )
            // InternalMyAtlProject.g:1287:1: ruleNavigatingArgExpCS EOF
            {
             before(grammarAccess.getNavigatingArgExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigatingArgExpCS();

            state._fsp--;

             after(grammarAccess.getNavigatingArgExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavigatingArgExpCS"


    // $ANTLR start "ruleNavigatingArgExpCS"
    // InternalMyAtlProject.g:1294:1: ruleNavigatingArgExpCS : ( ruleExpCS ) ;
    public final void ruleNavigatingArgExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1298:2: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:1299:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:1299:2: ( ruleExpCS )
            // InternalMyAtlProject.g:1300:3: ruleExpCS
            {
             before(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigatingArgExpCS"


    // $ANTLR start "entryRuleIfExpCS"
    // InternalMyAtlProject.g:1310:1: entryRuleIfExpCS : ruleIfExpCS EOF ;
    public final void entryRuleIfExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1311:1: ( ruleIfExpCS EOF )
            // InternalMyAtlProject.g:1312:1: ruleIfExpCS EOF
            {
             before(grammarAccess.getIfExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleIfExpCS();

            state._fsp--;

             after(grammarAccess.getIfExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfExpCS"


    // $ANTLR start "ruleIfExpCS"
    // InternalMyAtlProject.g:1319:1: ruleIfExpCS : ( ( rule__IfExpCS__Group__0 ) ) ;
    public final void ruleIfExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1323:2: ( ( ( rule__IfExpCS__Group__0 ) ) )
            // InternalMyAtlProject.g:1324:2: ( ( rule__IfExpCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:1324:2: ( ( rule__IfExpCS__Group__0 ) )
            // InternalMyAtlProject.g:1325:3: ( rule__IfExpCS__Group__0 )
            {
             before(grammarAccess.getIfExpCSAccess().getGroup()); 
            // InternalMyAtlProject.g:1326:3: ( rule__IfExpCS__Group__0 )
            // InternalMyAtlProject.g:1326:4: rule__IfExpCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfExpCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfExpCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfExpCS"


    // $ANTLR start "entryRuleLetExpCS"
    // InternalMyAtlProject.g:1335:1: entryRuleLetExpCS : ruleLetExpCS EOF ;
    public final void entryRuleLetExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1336:1: ( ruleLetExpCS EOF )
            // InternalMyAtlProject.g:1337:1: ruleLetExpCS EOF
            {
             before(grammarAccess.getLetExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleLetExpCS();

            state._fsp--;

             after(grammarAccess.getLetExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLetExpCS"


    // $ANTLR start "ruleLetExpCS"
    // InternalMyAtlProject.g:1344:1: ruleLetExpCS : ( ( rule__LetExpCS__Group__0 ) ) ;
    public final void ruleLetExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1348:2: ( ( ( rule__LetExpCS__Group__0 ) ) )
            // InternalMyAtlProject.g:1349:2: ( ( rule__LetExpCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:1349:2: ( ( rule__LetExpCS__Group__0 ) )
            // InternalMyAtlProject.g:1350:3: ( rule__LetExpCS__Group__0 )
            {
             before(grammarAccess.getLetExpCSAccess().getGroup()); 
            // InternalMyAtlProject.g:1351:3: ( rule__LetExpCS__Group__0 )
            // InternalMyAtlProject.g:1351:4: rule__LetExpCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LetExpCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetExpCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLetExpCS"


    // $ANTLR start "entryRuleLetVariableCS"
    // InternalMyAtlProject.g:1360:1: entryRuleLetVariableCS : ruleLetVariableCS EOF ;
    public final void entryRuleLetVariableCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1361:1: ( ruleLetVariableCS EOF )
            // InternalMyAtlProject.g:1362:1: ruleLetVariableCS EOF
            {
             before(grammarAccess.getLetVariableCSRule()); 
            pushFollow(FOLLOW_1);
            ruleLetVariableCS();

            state._fsp--;

             after(grammarAccess.getLetVariableCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLetVariableCS"


    // $ANTLR start "ruleLetVariableCS"
    // InternalMyAtlProject.g:1369:1: ruleLetVariableCS : ( ( rule__LetVariableCS__Group__0 ) ) ;
    public final void ruleLetVariableCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1373:2: ( ( ( rule__LetVariableCS__Group__0 ) ) )
            // InternalMyAtlProject.g:1374:2: ( ( rule__LetVariableCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:1374:2: ( ( rule__LetVariableCS__Group__0 ) )
            // InternalMyAtlProject.g:1375:3: ( rule__LetVariableCS__Group__0 )
            {
             before(grammarAccess.getLetVariableCSAccess().getGroup()); 
            // InternalMyAtlProject.g:1376:3: ( rule__LetVariableCS__Group__0 )
            // InternalMyAtlProject.g:1376:4: rule__LetVariableCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LetVariableCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetVariableCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLetVariableCS"


    // $ANTLR start "entryRuleNestedExpCS"
    // InternalMyAtlProject.g:1385:1: entryRuleNestedExpCS : ruleNestedExpCS EOF ;
    public final void entryRuleNestedExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1386:1: ( ruleNestedExpCS EOF )
            // InternalMyAtlProject.g:1387:1: ruleNestedExpCS EOF
            {
             before(grammarAccess.getNestedExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleNestedExpCS();

            state._fsp--;

             after(grammarAccess.getNestedExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNestedExpCS"


    // $ANTLR start "ruleNestedExpCS"
    // InternalMyAtlProject.g:1394:1: ruleNestedExpCS : ( ( rule__NestedExpCS__Group__0 ) ) ;
    public final void ruleNestedExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1398:2: ( ( ( rule__NestedExpCS__Group__0 ) ) )
            // InternalMyAtlProject.g:1399:2: ( ( rule__NestedExpCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:1399:2: ( ( rule__NestedExpCS__Group__0 ) )
            // InternalMyAtlProject.g:1400:3: ( rule__NestedExpCS__Group__0 )
            {
             before(grammarAccess.getNestedExpCSAccess().getGroup()); 
            // InternalMyAtlProject.g:1401:3: ( rule__NestedExpCS__Group__0 )
            // InternalMyAtlProject.g:1401:4: rule__NestedExpCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NestedExpCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNestedExpCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNestedExpCS"


    // $ANTLR start "entryRuleSelfExpCS"
    // InternalMyAtlProject.g:1410:1: entryRuleSelfExpCS : ruleSelfExpCS EOF ;
    public final void entryRuleSelfExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1411:1: ( ruleSelfExpCS EOF )
            // InternalMyAtlProject.g:1412:1: ruleSelfExpCS EOF
            {
             before(grammarAccess.getSelfExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleSelfExpCS();

            state._fsp--;

             after(grammarAccess.getSelfExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelfExpCS"


    // $ANTLR start "ruleSelfExpCS"
    // InternalMyAtlProject.g:1419:1: ruleSelfExpCS : ( ( rule__SelfExpCS__Group__0 ) ) ;
    public final void ruleSelfExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1423:2: ( ( ( rule__SelfExpCS__Group__0 ) ) )
            // InternalMyAtlProject.g:1424:2: ( ( rule__SelfExpCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:1424:2: ( ( rule__SelfExpCS__Group__0 ) )
            // InternalMyAtlProject.g:1425:3: ( rule__SelfExpCS__Group__0 )
            {
             before(grammarAccess.getSelfExpCSAccess().getGroup()); 
            // InternalMyAtlProject.g:1426:3: ( rule__SelfExpCS__Group__0 )
            // InternalMyAtlProject.g:1426:4: rule__SelfExpCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelfExpCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelfExpCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelfExpCS"


    // $ANTLR start "entryRulePrimaryExpCS"
    // InternalMyAtlProject.g:1435:1: entryRulePrimaryExpCS : rulePrimaryExpCS EOF ;
    public final void entryRulePrimaryExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1436:1: ( rulePrimaryExpCS EOF )
            // InternalMyAtlProject.g:1437:1: rulePrimaryExpCS EOF
            {
             before(grammarAccess.getPrimaryExpCSRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpCS();

            state._fsp--;

             after(grammarAccess.getPrimaryExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpCS"


    // $ANTLR start "rulePrimaryExpCS"
    // InternalMyAtlProject.g:1444:1: rulePrimaryExpCS : ( ( rule__PrimaryExpCS__Alternatives ) ) ;
    public final void rulePrimaryExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1448:2: ( ( ( rule__PrimaryExpCS__Alternatives ) ) )
            // InternalMyAtlProject.g:1449:2: ( ( rule__PrimaryExpCS__Alternatives ) )
            {
            // InternalMyAtlProject.g:1449:2: ( ( rule__PrimaryExpCS__Alternatives ) )
            // InternalMyAtlProject.g:1450:3: ( rule__PrimaryExpCS__Alternatives )
            {
             before(grammarAccess.getPrimaryExpCSAccess().getAlternatives()); 
            // InternalMyAtlProject.g:1451:3: ( rule__PrimaryExpCS__Alternatives )
            // InternalMyAtlProject.g:1451:4: rule__PrimaryExpCS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpCS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpCSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpCS"


    // $ANTLR start "entryRuleNameExpCS"
    // InternalMyAtlProject.g:1460:1: entryRuleNameExpCS : ruleNameExpCS EOF ;
    public final void entryRuleNameExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1461:1: ( ruleNameExpCS EOF )
            // InternalMyAtlProject.g:1462:1: ruleNameExpCS EOF
            {
             before(grammarAccess.getNameExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleNameExpCS();

            state._fsp--;

             after(grammarAccess.getNameExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNameExpCS"


    // $ANTLR start "ruleNameExpCS"
    // InternalMyAtlProject.g:1469:1: ruleNameExpCS : ( ruleEssentialOCLUnrestrictedName ) ;
    public final void ruleNameExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1473:2: ( ( ruleEssentialOCLUnrestrictedName ) )
            // InternalMyAtlProject.g:1474:2: ( ruleEssentialOCLUnrestrictedName )
            {
            // InternalMyAtlProject.g:1474:2: ( ruleEssentialOCLUnrestrictedName )
            // InternalMyAtlProject.g:1475:3: ruleEssentialOCLUnrestrictedName
            {
             before(grammarAccess.getNameExpCSAccess().getEssentialOCLUnrestrictedNameParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleEssentialOCLUnrestrictedName();

            state._fsp--;

             after(grammarAccess.getNameExpCSAccess().getEssentialOCLUnrestrictedNameParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameExpCS"


    // $ANTLR start "entryRuleExpCS"
    // InternalMyAtlProject.g:1485:1: entryRuleExpCS : ruleExpCS EOF ;
    public final void entryRuleExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1486:1: ( ruleExpCS EOF )
            // InternalMyAtlProject.g:1487:1: ruleExpCS EOF
            {
             before(grammarAccess.getExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpCS"


    // $ANTLR start "ruleExpCS"
    // InternalMyAtlProject.g:1494:1: ruleExpCS : ( ruleInfixedExpCS ) ;
    public final void ruleExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1498:2: ( ( ruleInfixedExpCS ) )
            // InternalMyAtlProject.g:1499:2: ( ruleInfixedExpCS )
            {
            // InternalMyAtlProject.g:1499:2: ( ruleInfixedExpCS )
            // InternalMyAtlProject.g:1500:3: ruleInfixedExpCS
            {
             before(grammarAccess.getExpCSAccess().getInfixedExpCSParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleInfixedExpCS();

            state._fsp--;

             after(grammarAccess.getExpCSAccess().getInfixedExpCSParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpCS"


    // $ANTLR start "entryRuleInfixedExpCS"
    // InternalMyAtlProject.g:1510:1: entryRuleInfixedExpCS : ruleInfixedExpCS EOF ;
    public final void entryRuleInfixedExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1511:1: ( ruleInfixedExpCS EOF )
            // InternalMyAtlProject.g:1512:1: ruleInfixedExpCS EOF
            {
             before(grammarAccess.getInfixedExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleInfixedExpCS();

            state._fsp--;

             after(grammarAccess.getInfixedExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInfixedExpCS"


    // $ANTLR start "ruleInfixedExpCS"
    // InternalMyAtlProject.g:1519:1: ruleInfixedExpCS : ( ( rule__InfixedExpCS__Group__0 ) ) ;
    public final void ruleInfixedExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1523:2: ( ( ( rule__InfixedExpCS__Group__0 ) ) )
            // InternalMyAtlProject.g:1524:2: ( ( rule__InfixedExpCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:1524:2: ( ( rule__InfixedExpCS__Group__0 ) )
            // InternalMyAtlProject.g:1525:3: ( rule__InfixedExpCS__Group__0 )
            {
             before(grammarAccess.getInfixedExpCSAccess().getGroup()); 
            // InternalMyAtlProject.g:1526:3: ( rule__InfixedExpCS__Group__0 )
            // InternalMyAtlProject.g:1526:4: rule__InfixedExpCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InfixedExpCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInfixedExpCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInfixedExpCS"


    // $ANTLR start "entryRuleBinaryOperatorCS"
    // InternalMyAtlProject.g:1535:1: entryRuleBinaryOperatorCS : ruleBinaryOperatorCS EOF ;
    public final void entryRuleBinaryOperatorCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1536:1: ( ruleBinaryOperatorCS EOF )
            // InternalMyAtlProject.g:1537:1: ruleBinaryOperatorCS EOF
            {
             before(grammarAccess.getBinaryOperatorCSRule()); 
            pushFollow(FOLLOW_1);
            ruleBinaryOperatorCS();

            state._fsp--;

             after(grammarAccess.getBinaryOperatorCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinaryOperatorCS"


    // $ANTLR start "ruleBinaryOperatorCS"
    // InternalMyAtlProject.g:1544:1: ruleBinaryOperatorCS : ( ( rule__BinaryOperatorCS__Alternatives ) ) ;
    public final void ruleBinaryOperatorCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1548:2: ( ( ( rule__BinaryOperatorCS__Alternatives ) ) )
            // InternalMyAtlProject.g:1549:2: ( ( rule__BinaryOperatorCS__Alternatives ) )
            {
            // InternalMyAtlProject.g:1549:2: ( ( rule__BinaryOperatorCS__Alternatives ) )
            // InternalMyAtlProject.g:1550:3: ( rule__BinaryOperatorCS__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorCSAccess().getAlternatives()); 
            // InternalMyAtlProject.g:1551:3: ( rule__BinaryOperatorCS__Alternatives )
            // InternalMyAtlProject.g:1551:4: rule__BinaryOperatorCS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryOperatorCS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperatorCSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryOperatorCS"


    // $ANTLR start "entryRuleInfixOperatorCS"
    // InternalMyAtlProject.g:1560:1: entryRuleInfixOperatorCS : ruleInfixOperatorCS EOF ;
    public final void entryRuleInfixOperatorCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1561:1: ( ruleInfixOperatorCS EOF )
            // InternalMyAtlProject.g:1562:1: ruleInfixOperatorCS EOF
            {
             before(grammarAccess.getInfixOperatorCSRule()); 
            pushFollow(FOLLOW_1);
            ruleInfixOperatorCS();

            state._fsp--;

             after(grammarAccess.getInfixOperatorCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInfixOperatorCS"


    // $ANTLR start "ruleInfixOperatorCS"
    // InternalMyAtlProject.g:1569:1: ruleInfixOperatorCS : ( ( rule__InfixOperatorCS__NameAssignment ) ) ;
    public final void ruleInfixOperatorCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1573:2: ( ( ( rule__InfixOperatorCS__NameAssignment ) ) )
            // InternalMyAtlProject.g:1574:2: ( ( rule__InfixOperatorCS__NameAssignment ) )
            {
            // InternalMyAtlProject.g:1574:2: ( ( rule__InfixOperatorCS__NameAssignment ) )
            // InternalMyAtlProject.g:1575:3: ( rule__InfixOperatorCS__NameAssignment )
            {
             before(grammarAccess.getInfixOperatorCSAccess().getNameAssignment()); 
            // InternalMyAtlProject.g:1576:3: ( rule__InfixOperatorCS__NameAssignment )
            // InternalMyAtlProject.g:1576:4: rule__InfixOperatorCS__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperatorCS__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInfixOperatorCSAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInfixOperatorCS"


    // $ANTLR start "entryRuleNavigationOperatorCS"
    // InternalMyAtlProject.g:1585:1: entryRuleNavigationOperatorCS : ruleNavigationOperatorCS EOF ;
    public final void entryRuleNavigationOperatorCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1586:1: ( ruleNavigationOperatorCS EOF )
            // InternalMyAtlProject.g:1587:1: ruleNavigationOperatorCS EOF
            {
             before(grammarAccess.getNavigationOperatorCSRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigationOperatorCS();

            state._fsp--;

             after(grammarAccess.getNavigationOperatorCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavigationOperatorCS"


    // $ANTLR start "ruleNavigationOperatorCS"
    // InternalMyAtlProject.g:1594:1: ruleNavigationOperatorCS : ( ( rule__NavigationOperatorCS__NameAssignment ) ) ;
    public final void ruleNavigationOperatorCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1598:2: ( ( ( rule__NavigationOperatorCS__NameAssignment ) ) )
            // InternalMyAtlProject.g:1599:2: ( ( rule__NavigationOperatorCS__NameAssignment ) )
            {
            // InternalMyAtlProject.g:1599:2: ( ( rule__NavigationOperatorCS__NameAssignment ) )
            // InternalMyAtlProject.g:1600:3: ( rule__NavigationOperatorCS__NameAssignment )
            {
             before(grammarAccess.getNavigationOperatorCSAccess().getNameAssignment()); 
            // InternalMyAtlProject.g:1601:3: ( rule__NavigationOperatorCS__NameAssignment )
            // InternalMyAtlProject.g:1601:4: rule__NavigationOperatorCS__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NavigationOperatorCS__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNavigationOperatorCSAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigationOperatorCS"


    // $ANTLR start "entryRulePrefixedExpCS"
    // InternalMyAtlProject.g:1610:1: entryRulePrefixedExpCS : rulePrefixedExpCS EOF ;
    public final void entryRulePrefixedExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1611:1: ( rulePrefixedExpCS EOF )
            // InternalMyAtlProject.g:1612:1: rulePrefixedExpCS EOF
            {
             before(grammarAccess.getPrefixedExpCSRule()); 
            pushFollow(FOLLOW_1);
            rulePrefixedExpCS();

            state._fsp--;

             after(grammarAccess.getPrefixedExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefixedExpCS"


    // $ANTLR start "rulePrefixedExpCS"
    // InternalMyAtlProject.g:1619:1: rulePrefixedExpCS : ( ( rule__PrefixedExpCS__Alternatives ) ) ;
    public final void rulePrefixedExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1623:2: ( ( ( rule__PrefixedExpCS__Alternatives ) ) )
            // InternalMyAtlProject.g:1624:2: ( ( rule__PrefixedExpCS__Alternatives ) )
            {
            // InternalMyAtlProject.g:1624:2: ( ( rule__PrefixedExpCS__Alternatives ) )
            // InternalMyAtlProject.g:1625:3: ( rule__PrefixedExpCS__Alternatives )
            {
             before(grammarAccess.getPrefixedExpCSAccess().getAlternatives()); 
            // InternalMyAtlProject.g:1626:3: ( rule__PrefixedExpCS__Alternatives )
            // InternalMyAtlProject.g:1626:4: rule__PrefixedExpCS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrefixedExpCS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrefixedExpCSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefixedExpCS"


    // $ANTLR start "entryRuleUnaryOperatorCS"
    // InternalMyAtlProject.g:1635:1: entryRuleUnaryOperatorCS : ruleUnaryOperatorCS EOF ;
    public final void entryRuleUnaryOperatorCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1636:1: ( ruleUnaryOperatorCS EOF )
            // InternalMyAtlProject.g:1637:1: ruleUnaryOperatorCS EOF
            {
             before(grammarAccess.getUnaryOperatorCSRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryOperatorCS();

            state._fsp--;

             after(grammarAccess.getUnaryOperatorCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryOperatorCS"


    // $ANTLR start "ruleUnaryOperatorCS"
    // InternalMyAtlProject.g:1644:1: ruleUnaryOperatorCS : ( ( rule__UnaryOperatorCS__NameAssignment ) ) ;
    public final void ruleUnaryOperatorCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1648:2: ( ( ( rule__UnaryOperatorCS__NameAssignment ) ) )
            // InternalMyAtlProject.g:1649:2: ( ( rule__UnaryOperatorCS__NameAssignment ) )
            {
            // InternalMyAtlProject.g:1649:2: ( ( rule__UnaryOperatorCS__NameAssignment ) )
            // InternalMyAtlProject.g:1650:3: ( rule__UnaryOperatorCS__NameAssignment )
            {
             before(grammarAccess.getUnaryOperatorCSAccess().getNameAssignment()); 
            // InternalMyAtlProject.g:1651:3: ( rule__UnaryOperatorCS__NameAssignment )
            // InternalMyAtlProject.g:1651:4: rule__UnaryOperatorCS__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperatorCS__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOperatorCSAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryOperatorCS"


    // $ANTLR start "entryRuleIndexExpCS"
    // InternalMyAtlProject.g:1660:1: entryRuleIndexExpCS : ruleIndexExpCS EOF ;
    public final void entryRuleIndexExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1661:1: ( ruleIndexExpCS EOF )
            // InternalMyAtlProject.g:1662:1: ruleIndexExpCS EOF
            {
             before(grammarAccess.getIndexExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleIndexExpCS();

            state._fsp--;

             after(grammarAccess.getIndexExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIndexExpCS"


    // $ANTLR start "ruleIndexExpCS"
    // InternalMyAtlProject.g:1669:1: ruleIndexExpCS : ( ( rule__IndexExpCS__Group__0 ) ) ;
    public final void ruleIndexExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1673:2: ( ( ( rule__IndexExpCS__Group__0 ) ) )
            // InternalMyAtlProject.g:1674:2: ( ( rule__IndexExpCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:1674:2: ( ( rule__IndexExpCS__Group__0 ) )
            // InternalMyAtlProject.g:1675:3: ( rule__IndexExpCS__Group__0 )
            {
             before(grammarAccess.getIndexExpCSAccess().getGroup()); 
            // InternalMyAtlProject.g:1676:3: ( rule__IndexExpCS__Group__0 )
            // InternalMyAtlProject.g:1676:4: rule__IndexExpCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IndexExpCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndexExpCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIndexExpCS"


    // $ANTLR start "entryRuleNavigatingExpCS_Base"
    // InternalMyAtlProject.g:1685:1: entryRuleNavigatingExpCS_Base : ruleNavigatingExpCS_Base EOF ;
    public final void entryRuleNavigatingExpCS_Base() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1686:1: ( ruleNavigatingExpCS_Base EOF )
            // InternalMyAtlProject.g:1687:1: ruleNavigatingExpCS_Base EOF
            {
             before(grammarAccess.getNavigatingExpCS_BaseRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigatingExpCS_Base();

            state._fsp--;

             after(grammarAccess.getNavigatingExpCS_BaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavigatingExpCS_Base"


    // $ANTLR start "ruleNavigatingExpCS_Base"
    // InternalMyAtlProject.g:1694:1: ruleNavigatingExpCS_Base : ( ruleIndexExpCS ) ;
    public final void ruleNavigatingExpCS_Base() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1698:2: ( ( ruleIndexExpCS ) )
            // InternalMyAtlProject.g:1699:2: ( ruleIndexExpCS )
            {
            // InternalMyAtlProject.g:1699:2: ( ruleIndexExpCS )
            // InternalMyAtlProject.g:1700:3: ruleIndexExpCS
            {
             before(grammarAccess.getNavigatingExpCS_BaseAccess().getIndexExpCSParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleIndexExpCS();

            state._fsp--;

             after(grammarAccess.getNavigatingExpCS_BaseAccess().getIndexExpCSParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigatingExpCS_Base"


    // $ANTLR start "entryRuleNavigatingExpCS"
    // InternalMyAtlProject.g:1710:1: entryRuleNavigatingExpCS : ruleNavigatingExpCS EOF ;
    public final void entryRuleNavigatingExpCS() throws RecognitionException {
        try {
            // InternalMyAtlProject.g:1711:1: ( ruleNavigatingExpCS EOF )
            // InternalMyAtlProject.g:1712:1: ruleNavigatingExpCS EOF
            {
             before(grammarAccess.getNavigatingExpCSRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigatingExpCS();

            state._fsp--;

             after(grammarAccess.getNavigatingExpCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavigatingExpCS"


    // $ANTLR start "ruleNavigatingExpCS"
    // InternalMyAtlProject.g:1719:1: ruleNavigatingExpCS : ( ( rule__NavigatingExpCS__Group__0 ) ) ;
    public final void ruleNavigatingExpCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1723:2: ( ( ( rule__NavigatingExpCS__Group__0 ) ) )
            // InternalMyAtlProject.g:1724:2: ( ( rule__NavigatingExpCS__Group__0 ) )
            {
            // InternalMyAtlProject.g:1724:2: ( ( rule__NavigatingExpCS__Group__0 ) )
            // InternalMyAtlProject.g:1725:3: ( rule__NavigatingExpCS__Group__0 )
            {
             before(grammarAccess.getNavigatingExpCSAccess().getGroup()); 
            // InternalMyAtlProject.g:1726:3: ( rule__NavigatingExpCS__Group__0 )
            // InternalMyAtlProject.g:1726:4: rule__NavigatingExpCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingExpCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigatingExpCS"


    // $ANTLR start "rule__ModuleElement__Alternatives"
    // InternalMyAtlProject.g:1734:1: rule__ModuleElement__Alternatives : ( ( ruleHelper ) | ( ruleMatchedRule ) | ( ruleCalledRule ) );
    public final void rule__ModuleElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1738:1: ( ( ruleHelper ) | ( ruleMatchedRule ) | ( ruleCalledRule ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt2=1;
                }
                break;
            case 52:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_SIMPLE_ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==53) ) {
                        int LA2_5 = input.LA(4);

                        if ( (LA2_5==50) ) {
                            alt2=2;
                        }
                        else if ( (LA2_5==54||LA2_5==56) ) {
                            alt2=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA2_4==59) ) {
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
            case 58:
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
                    // InternalMyAtlProject.g:1739:2: ( ruleHelper )
                    {
                    // InternalMyAtlProject.g:1739:2: ( ruleHelper )
                    // InternalMyAtlProject.g:1740:3: ruleHelper
                    {
                     before(grammarAccess.getModuleElementAccess().getHelperParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleHelper();

                    state._fsp--;

                     after(grammarAccess.getModuleElementAccess().getHelperParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:1745:2: ( ruleMatchedRule )
                    {
                    // InternalMyAtlProject.g:1745:2: ( ruleMatchedRule )
                    // InternalMyAtlProject.g:1746:3: ruleMatchedRule
                    {
                     before(grammarAccess.getModuleElementAccess().getMatchedRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMatchedRule();

                    state._fsp--;

                     after(grammarAccess.getModuleElementAccess().getMatchedRuleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyAtlProject.g:1751:2: ( ruleCalledRule )
                    {
                    // InternalMyAtlProject.g:1751:2: ( ruleCalledRule )
                    // InternalMyAtlProject.g:1752:3: ruleCalledRule
                    {
                     before(grammarAccess.getModuleElementAccess().getCalledRuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCalledRule();

                    state._fsp--;

                     after(grammarAccess.getModuleElementAccess().getCalledRuleParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleElement__Alternatives"


    // $ANTLR start "rule__OutPatternElement__Alternatives"
    // InternalMyAtlProject.g:1761:1: rule__OutPatternElement__Alternatives : ( ( ruleSimpleOutPatternElement ) | ( ruleForEachOutPatternElement ) );
    public final void rule__OutPatternElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1765:1: ( ( ruleSimpleOutPatternElement ) | ( ruleForEachOutPatternElement ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_SIMPLE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==64) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyAtlProject.g:1766:2: ( ruleSimpleOutPatternElement )
                    {
                    // InternalMyAtlProject.g:1766:2: ( ruleSimpleOutPatternElement )
                    // InternalMyAtlProject.g:1767:3: ruleSimpleOutPatternElement
                    {
                     before(grammarAccess.getOutPatternElementAccess().getSimpleOutPatternElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleOutPatternElement();

                    state._fsp--;

                     after(grammarAccess.getOutPatternElementAccess().getSimpleOutPatternElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:1772:2: ( ruleForEachOutPatternElement )
                    {
                    // InternalMyAtlProject.g:1772:2: ( ruleForEachOutPatternElement )
                    // InternalMyAtlProject.g:1773:3: ruleForEachOutPatternElement
                    {
                     before(grammarAccess.getOutPatternElementAccess().getForEachOutPatternElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleForEachOutPatternElement();

                    state._fsp--;

                     after(grammarAccess.getOutPatternElementAccess().getForEachOutPatternElementParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPatternElement__Alternatives"


    // $ANTLR start "rule__EssentialOCLPrefixOperator__Alternatives"
    // InternalMyAtlProject.g:1782:1: rule__EssentialOCLPrefixOperator__Alternatives : ( ( '-' ) | ( 'not' ) );
    public final void rule__EssentialOCLPrefixOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1786:1: ( ( '-' ) | ( 'not' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyAtlProject.g:1787:2: ( '-' )
                    {
                    // InternalMyAtlProject.g:1787:2: ( '-' )
                    // InternalMyAtlProject.g:1788:3: '-'
                    {
                     before(grammarAccess.getEssentialOCLPrefixOperatorAccess().getHyphenMinusKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLPrefixOperatorAccess().getHyphenMinusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:1793:2: ( 'not' )
                    {
                    // InternalMyAtlProject.g:1793:2: ( 'not' )
                    // InternalMyAtlProject.g:1794:3: 'not'
                    {
                     before(grammarAccess.getEssentialOCLPrefixOperatorAccess().getNotKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLPrefixOperatorAccess().getNotKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EssentialOCLPrefixOperator__Alternatives"


    // $ANTLR start "rule__EssentialOCLInfixOperator__Alternatives"
    // InternalMyAtlProject.g:1803:1: rule__EssentialOCLInfixOperator__Alternatives : ( ( '*' ) | ( '/' ) | ( '+' ) | ( '-' ) | ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '=' ) | ( '<>' ) | ( 'and' ) | ( 'or' ) | ( 'xor' ) | ( 'implies' ) );
    public final void rule__EssentialOCLInfixOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1807:1: ( ( '*' ) | ( '/' ) | ( '+' ) | ( '-' ) | ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '=' ) | ( '<>' ) | ( 'and' ) | ( 'or' ) | ( 'xor' ) | ( 'implies' ) )
            int alt5=14;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 19:
                {
                alt5=5;
                }
                break;
            case 20:
                {
                alt5=6;
                }
                break;
            case 21:
                {
                alt5=7;
                }
                break;
            case 22:
                {
                alt5=8;
                }
                break;
            case 23:
                {
                alt5=9;
                }
                break;
            case 24:
                {
                alt5=10;
                }
                break;
            case 25:
                {
                alt5=11;
                }
                break;
            case 26:
                {
                alt5=12;
                }
                break;
            case 27:
                {
                alt5=13;
                }
                break;
            case 28:
                {
                alt5=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyAtlProject.g:1808:2: ( '*' )
                    {
                    // InternalMyAtlProject.g:1808:2: ( '*' )
                    // InternalMyAtlProject.g:1809:3: '*'
                    {
                     before(grammarAccess.getEssentialOCLInfixOperatorAccess().getAsteriskKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLInfixOperatorAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:1814:2: ( '/' )
                    {
                    // InternalMyAtlProject.g:1814:2: ( '/' )
                    // InternalMyAtlProject.g:1815:3: '/'
                    {
                     before(grammarAccess.getEssentialOCLInfixOperatorAccess().getSolidusKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLInfixOperatorAccess().getSolidusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyAtlProject.g:1820:2: ( '+' )
                    {
                    // InternalMyAtlProject.g:1820:2: ( '+' )
                    // InternalMyAtlProject.g:1821:3: '+'
                    {
                     before(grammarAccess.getEssentialOCLInfixOperatorAccess().getPlusSignKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLInfixOperatorAccess().getPlusSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyAtlProject.g:1826:2: ( '-' )
                    {
                    // InternalMyAtlProject.g:1826:2: ( '-' )
                    // InternalMyAtlProject.g:1827:3: '-'
                    {
                     before(grammarAccess.getEssentialOCLInfixOperatorAccess().getHyphenMinusKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLInfixOperatorAccess().getHyphenMinusKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyAtlProject.g:1832:2: ( '>' )
                    {
                    // InternalMyAtlProject.g:1832:2: ( '>' )
                    // InternalMyAtlProject.g:1833:3: '>'
                    {
                     before(grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignKeyword_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyAtlProject.g:1838:2: ( '<' )
                    {
                    // InternalMyAtlProject.g:1838:2: ( '<' )
                    // InternalMyAtlProject.g:1839:3: '<'
                    {
                     before(grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignKeyword_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyAtlProject.g:1844:2: ( '>=' )
                    {
                    // InternalMyAtlProject.g:1844:2: ( '>=' )
                    // InternalMyAtlProject.g:1845:3: '>='
                    {
                     before(grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLInfixOperatorAccess().getGreaterThanSignEqualsSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyAtlProject.g:1850:2: ( '<=' )
                    {
                    // InternalMyAtlProject.g:1850:2: ( '<=' )
                    // InternalMyAtlProject.g:1851:3: '<='
                    {
                     before(grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignEqualsSignKeyword_7()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignEqualsSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyAtlProject.g:1856:2: ( '=' )
                    {
                    // InternalMyAtlProject.g:1856:2: ( '=' )
                    // InternalMyAtlProject.g:1857:3: '='
                    {
                     before(grammarAccess.getEssentialOCLInfixOperatorAccess().getEqualsSignKeyword_8()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLInfixOperatorAccess().getEqualsSignKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyAtlProject.g:1862:2: ( '<>' )
                    {
                    // InternalMyAtlProject.g:1862:2: ( '<>' )
                    // InternalMyAtlProject.g:1863:3: '<>'
                    {
                     before(grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignGreaterThanSignKeyword_9()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLInfixOperatorAccess().getLessThanSignGreaterThanSignKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyAtlProject.g:1868:2: ( 'and' )
                    {
                    // InternalMyAtlProject.g:1868:2: ( 'and' )
                    // InternalMyAtlProject.g:1869:3: 'and'
                    {
                     before(grammarAccess.getEssentialOCLInfixOperatorAccess().getAndKeyword_10()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLInfixOperatorAccess().getAndKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyAtlProject.g:1874:2: ( 'or' )
                    {
                    // InternalMyAtlProject.g:1874:2: ( 'or' )
                    // InternalMyAtlProject.g:1875:3: 'or'
                    {
                     before(grammarAccess.getEssentialOCLInfixOperatorAccess().getOrKeyword_11()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLInfixOperatorAccess().getOrKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyAtlProject.g:1880:2: ( 'xor' )
                    {
                    // InternalMyAtlProject.g:1880:2: ( 'xor' )
                    // InternalMyAtlProject.g:1881:3: 'xor'
                    {
                     before(grammarAccess.getEssentialOCLInfixOperatorAccess().getXorKeyword_12()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLInfixOperatorAccess().getXorKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyAtlProject.g:1886:2: ( 'implies' )
                    {
                    // InternalMyAtlProject.g:1886:2: ( 'implies' )
                    // InternalMyAtlProject.g:1887:3: 'implies'
                    {
                     before(grammarAccess.getEssentialOCLInfixOperatorAccess().getImpliesKeyword_13()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLInfixOperatorAccess().getImpliesKeyword_13()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EssentialOCLInfixOperator__Alternatives"


    // $ANTLR start "rule__EssentialOCLNavigationOperator__Alternatives"
    // InternalMyAtlProject.g:1896:1: rule__EssentialOCLNavigationOperator__Alternatives : ( ( '.' ) | ( '->' ) );
    public final void rule__EssentialOCLNavigationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1900:1: ( ( '.' ) | ( '->' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==30) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyAtlProject.g:1901:2: ( '.' )
                    {
                    // InternalMyAtlProject.g:1901:2: ( '.' )
                    // InternalMyAtlProject.g:1902:3: '.'
                    {
                     before(grammarAccess.getEssentialOCLNavigationOperatorAccess().getFullStopKeyword_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLNavigationOperatorAccess().getFullStopKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:1907:2: ( '->' )
                    {
                    // InternalMyAtlProject.g:1907:2: ( '->' )
                    // InternalMyAtlProject.g:1908:3: '->'
                    {
                     before(grammarAccess.getEssentialOCLNavigationOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLNavigationOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EssentialOCLNavigationOperator__Alternatives"


    // $ANTLR start "rule__EssentialOCLUnreservedName__Alternatives"
    // InternalMyAtlProject.g:1917:1: rule__EssentialOCLUnreservedName__Alternatives : ( ( ruleUnrestrictedName ) | ( ruleCollectionTypeIdentifier ) | ( rulePrimitiveTypeIdentifier ) | ( 'Tuple' ) );
    public final void rule__EssentialOCLUnreservedName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1921:1: ( ( ruleUnrestrictedName ) | ( ruleCollectionTypeIdentifier ) | ( rulePrimitiveTypeIdentifier ) | ( 'Tuple' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
                {
                alt7=1;
                }
                break;
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt7=2;
                }
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt7=3;
                }
                break;
            case 31:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyAtlProject.g:1922:2: ( ruleUnrestrictedName )
                    {
                    // InternalMyAtlProject.g:1922:2: ( ruleUnrestrictedName )
                    // InternalMyAtlProject.g:1923:3: ruleUnrestrictedName
                    {
                     before(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUnrestrictedName();

                    state._fsp--;

                     after(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:1928:2: ( ruleCollectionTypeIdentifier )
                    {
                    // InternalMyAtlProject.g:1928:2: ( ruleCollectionTypeIdentifier )
                    // InternalMyAtlProject.g:1929:3: ruleCollectionTypeIdentifier
                    {
                     before(grammarAccess.getEssentialOCLUnreservedNameAccess().getCollectionTypeIdentifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCollectionTypeIdentifier();

                    state._fsp--;

                     after(grammarAccess.getEssentialOCLUnreservedNameAccess().getCollectionTypeIdentifierParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyAtlProject.g:1934:2: ( rulePrimitiveTypeIdentifier )
                    {
                    // InternalMyAtlProject.g:1934:2: ( rulePrimitiveTypeIdentifier )
                    // InternalMyAtlProject.g:1935:3: rulePrimitiveTypeIdentifier
                    {
                     before(grammarAccess.getEssentialOCLUnreservedNameAccess().getPrimitiveTypeIdentifierParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveTypeIdentifier();

                    state._fsp--;

                     after(grammarAccess.getEssentialOCLUnreservedNameAccess().getPrimitiveTypeIdentifierParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyAtlProject.g:1940:2: ( 'Tuple' )
                    {
                    // InternalMyAtlProject.g:1940:2: ( 'Tuple' )
                    // InternalMyAtlProject.g:1941:3: 'Tuple'
                    {
                     before(grammarAccess.getEssentialOCLUnreservedNameAccess().getTupleKeyword_3()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getEssentialOCLUnreservedNameAccess().getTupleKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EssentialOCLUnreservedName__Alternatives"


    // $ANTLR start "rule__PrimitiveTypeIdentifier__Alternatives"
    // InternalMyAtlProject.g:1950:1: rule__PrimitiveTypeIdentifier__Alternatives : ( ( 'Boolean' ) | ( 'Integer' ) | ( 'Real' ) | ( 'String' ) | ( 'UnlimitedNatural' ) | ( 'OclAny' ) | ( 'OclInvalid' ) | ( 'OclVoid' ) );
    public final void rule__PrimitiveTypeIdentifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:1954:1: ( ( 'Boolean' ) | ( 'Integer' ) | ( 'Real' ) | ( 'String' ) | ( 'UnlimitedNatural' ) | ( 'OclAny' ) | ( 'OclInvalid' ) | ( 'OclVoid' ) )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 34:
                {
                alt8=3;
                }
                break;
            case 35:
                {
                alt8=4;
                }
                break;
            case 36:
                {
                alt8=5;
                }
                break;
            case 37:
                {
                alt8=6;
                }
                break;
            case 38:
                {
                alt8=7;
                }
                break;
            case 39:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyAtlProject.g:1955:2: ( 'Boolean' )
                    {
                    // InternalMyAtlProject.g:1955:2: ( 'Boolean' )
                    // InternalMyAtlProject.g:1956:3: 'Boolean'
                    {
                     before(grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:1961:2: ( 'Integer' )
                    {
                    // InternalMyAtlProject.g:1961:2: ( 'Integer' )
                    // InternalMyAtlProject.g:1962:3: 'Integer'
                    {
                     before(grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyAtlProject.g:1967:2: ( 'Real' )
                    {
                    // InternalMyAtlProject.g:1967:2: ( 'Real' )
                    // InternalMyAtlProject.g:1968:3: 'Real'
                    {
                     before(grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyAtlProject.g:1973:2: ( 'String' )
                    {
                    // InternalMyAtlProject.g:1973:2: ( 'String' )
                    // InternalMyAtlProject.g:1974:3: 'String'
                    {
                     before(grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyAtlProject.g:1979:2: ( 'UnlimitedNatural' )
                    {
                    // InternalMyAtlProject.g:1979:2: ( 'UnlimitedNatural' )
                    // InternalMyAtlProject.g:1980:3: 'UnlimitedNatural'
                    {
                     before(grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyAtlProject.g:1985:2: ( 'OclAny' )
                    {
                    // InternalMyAtlProject.g:1985:2: ( 'OclAny' )
                    // InternalMyAtlProject.g:1986:3: 'OclAny'
                    {
                     before(grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyAtlProject.g:1991:2: ( 'OclInvalid' )
                    {
                    // InternalMyAtlProject.g:1991:2: ( 'OclInvalid' )
                    // InternalMyAtlProject.g:1992:3: 'OclInvalid'
                    {
                     before(grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyAtlProject.g:1997:2: ( 'OclVoid' )
                    {
                    // InternalMyAtlProject.g:1997:2: ( 'OclVoid' )
                    // InternalMyAtlProject.g:1998:3: 'OclVoid'
                    {
                     before(grammarAccess.getPrimitiveTypeIdentifierAccess().getOclVoidKeyword_7()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeIdentifierAccess().getOclVoidKeyword_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeIdentifier__Alternatives"


    // $ANTLR start "rule__CollectionTypeIdentifier__Alternatives"
    // InternalMyAtlProject.g:2007:1: rule__CollectionTypeIdentifier__Alternatives : ( ( 'Set' ) | ( 'Bag' ) | ( 'Sequence' ) | ( 'Collection' ) | ( 'OrderedSet' ) );
    public final void rule__CollectionTypeIdentifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2011:1: ( ( 'Set' ) | ( 'Bag' ) | ( 'Sequence' ) | ( 'Collection' ) | ( 'OrderedSet' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt9=1;
                }
                break;
            case 41:
                {
                alt9=2;
                }
                break;
            case 42:
                {
                alt9=3;
                }
                break;
            case 43:
                {
                alt9=4;
                }
                break;
            case 44:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyAtlProject.g:2012:2: ( 'Set' )
                    {
                    // InternalMyAtlProject.g:2012:2: ( 'Set' )
                    // InternalMyAtlProject.g:2013:3: 'Set'
                    {
                     before(grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:2018:2: ( 'Bag' )
                    {
                    // InternalMyAtlProject.g:2018:2: ( 'Bag' )
                    // InternalMyAtlProject.g:2019:3: 'Bag'
                    {
                     before(grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyAtlProject.g:2024:2: ( 'Sequence' )
                    {
                    // InternalMyAtlProject.g:2024:2: ( 'Sequence' )
                    // InternalMyAtlProject.g:2025:3: 'Sequence'
                    {
                     before(grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyAtlProject.g:2030:2: ( 'Collection' )
                    {
                    // InternalMyAtlProject.g:2030:2: ( 'Collection' )
                    // InternalMyAtlProject.g:2031:3: 'Collection'
                    {
                     before(grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyAtlProject.g:2036:2: ( 'OrderedSet' )
                    {
                    // InternalMyAtlProject.g:2036:2: ( 'OrderedSet' )
                    // InternalMyAtlProject.g:2037:3: 'OrderedSet'
                    {
                     before(grammarAccess.getCollectionTypeIdentifierAccess().getOrderedSetKeyword_4()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getCollectionTypeIdentifierAccess().getOrderedSetKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeIdentifier__Alternatives"


    // $ANTLR start "rule__CollectionTypeCS__Alternatives_1"
    // InternalMyAtlProject.g:2046:1: rule__CollectionTypeCS__Alternatives_1 : ( ( ( rule__CollectionTypeCS__Group_1_0__0 ) ) | ( ( rule__CollectionTypeCS__Group_1_1__0 ) ) );
    public final void rule__CollectionTypeCS__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2050:1: ( ( ( rule__CollectionTypeCS__Group_1_0__0 ) ) | ( ( rule__CollectionTypeCS__Group_1_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==59) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyAtlProject.g:2051:2: ( ( rule__CollectionTypeCS__Group_1_0__0 ) )
                    {
                    // InternalMyAtlProject.g:2051:2: ( ( rule__CollectionTypeCS__Group_1_0__0 ) )
                    // InternalMyAtlProject.g:2052:3: ( rule__CollectionTypeCS__Group_1_0__0 )
                    {
                     before(grammarAccess.getCollectionTypeCSAccess().getGroup_1_0()); 
                    // InternalMyAtlProject.g:2053:3: ( rule__CollectionTypeCS__Group_1_0__0 )
                    // InternalMyAtlProject.g:2053:4: rule__CollectionTypeCS__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectionTypeCS__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCollectionTypeCSAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:2057:2: ( ( rule__CollectionTypeCS__Group_1_1__0 ) )
                    {
                    // InternalMyAtlProject.g:2057:2: ( ( rule__CollectionTypeCS__Group_1_1__0 ) )
                    // InternalMyAtlProject.g:2058:3: ( rule__CollectionTypeCS__Group_1_1__0 )
                    {
                     before(grammarAccess.getCollectionTypeCSAccess().getGroup_1_1()); 
                    // InternalMyAtlProject.g:2059:3: ( rule__CollectionTypeCS__Group_1_1__0 )
                    // InternalMyAtlProject.g:2059:4: rule__CollectionTypeCS__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectionTypeCS__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCollectionTypeCSAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__Alternatives_1"


    // $ANTLR start "rule__PrimitiveLiteralExpCS__Alternatives"
    // InternalMyAtlProject.g:2067:1: rule__PrimitiveLiteralExpCS__Alternatives : ( ( ruleNumberLiteralExpCS ) | ( ruleStringLiteralExpCS ) | ( ruleBooleanLiteralExpCS ) | ( ruleUnlimitedNaturalLiteralExpCS ) | ( ruleInvalidLiteralExpCS ) | ( ruleNullLiteralExpCS ) );
    public final void rule__PrimitiveLiteralExpCS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2071:1: ( ( ruleNumberLiteralExpCS ) | ( ruleStringLiteralExpCS ) | ( ruleBooleanLiteralExpCS ) | ( ruleUnlimitedNaturalLiteralExpCS ) | ( ruleInvalidLiteralExpCS ) | ( ruleNullLiteralExpCS ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case RULE_BIG_INT:
                {
                alt11=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt11=2;
                }
                break;
            case 79:
            case 80:
                {
                alt11=3;
                }
                break;
            case 16:
                {
                alt11=4;
                }
                break;
            case 68:
                {
                alt11=5;
                }
                break;
            case 69:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyAtlProject.g:2072:2: ( ruleNumberLiteralExpCS )
                    {
                    // InternalMyAtlProject.g:2072:2: ( ruleNumberLiteralExpCS )
                    // InternalMyAtlProject.g:2073:3: ruleNumberLiteralExpCS
                    {
                     before(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteralExpCS();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:2078:2: ( ruleStringLiteralExpCS )
                    {
                    // InternalMyAtlProject.g:2078:2: ( ruleStringLiteralExpCS )
                    // InternalMyAtlProject.g:2079:3: ruleStringLiteralExpCS
                    {
                     before(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteralExpCS();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyAtlProject.g:2084:2: ( ruleBooleanLiteralExpCS )
                    {
                    // InternalMyAtlProject.g:2084:2: ( ruleBooleanLiteralExpCS )
                    // InternalMyAtlProject.g:2085:3: ruleBooleanLiteralExpCS
                    {
                     before(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanLiteralExpCS();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyAtlProject.g:2090:2: ( ruleUnlimitedNaturalLiteralExpCS )
                    {
                    // InternalMyAtlProject.g:2090:2: ( ruleUnlimitedNaturalLiteralExpCS )
                    // InternalMyAtlProject.g:2091:3: ruleUnlimitedNaturalLiteralExpCS
                    {
                     before(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleUnlimitedNaturalLiteralExpCS();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyAtlProject.g:2096:2: ( ruleInvalidLiteralExpCS )
                    {
                    // InternalMyAtlProject.g:2096:2: ( ruleInvalidLiteralExpCS )
                    // InternalMyAtlProject.g:2097:3: ruleInvalidLiteralExpCS
                    {
                     before(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleInvalidLiteralExpCS();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyAtlProject.g:2102:2: ( ruleNullLiteralExpCS )
                    {
                    // InternalMyAtlProject.g:2102:2: ( ruleNullLiteralExpCS )
                    // InternalMyAtlProject.g:2103:3: ruleNullLiteralExpCS
                    {
                     before(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNullLiteralExpCS();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveLiteralExpCS__Alternatives"


    // $ANTLR start "rule__BooleanLiteralExpCS__Alternatives"
    // InternalMyAtlProject.g:2112:1: rule__BooleanLiteralExpCS__Alternatives : ( ( ( rule__BooleanLiteralExpCS__NameAssignment_0 ) ) | ( ( rule__BooleanLiteralExpCS__NameAssignment_1 ) ) );
    public final void rule__BooleanLiteralExpCS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2116:1: ( ( ( rule__BooleanLiteralExpCS__NameAssignment_0 ) ) | ( ( rule__BooleanLiteralExpCS__NameAssignment_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==79) ) {
                alt12=1;
            }
            else if ( (LA12_0==80) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyAtlProject.g:2117:2: ( ( rule__BooleanLiteralExpCS__NameAssignment_0 ) )
                    {
                    // InternalMyAtlProject.g:2117:2: ( ( rule__BooleanLiteralExpCS__NameAssignment_0 ) )
                    // InternalMyAtlProject.g:2118:3: ( rule__BooleanLiteralExpCS__NameAssignment_0 )
                    {
                     before(grammarAccess.getBooleanLiteralExpCSAccess().getNameAssignment_0()); 
                    // InternalMyAtlProject.g:2119:3: ( rule__BooleanLiteralExpCS__NameAssignment_0 )
                    // InternalMyAtlProject.g:2119:4: rule__BooleanLiteralExpCS__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanLiteralExpCS__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanLiteralExpCSAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:2123:2: ( ( rule__BooleanLiteralExpCS__NameAssignment_1 ) )
                    {
                    // InternalMyAtlProject.g:2123:2: ( ( rule__BooleanLiteralExpCS__NameAssignment_1 ) )
                    // InternalMyAtlProject.g:2124:3: ( rule__BooleanLiteralExpCS__NameAssignment_1 )
                    {
                     before(grammarAccess.getBooleanLiteralExpCSAccess().getNameAssignment_1()); 
                    // InternalMyAtlProject.g:2125:3: ( rule__BooleanLiteralExpCS__NameAssignment_1 )
                    // InternalMyAtlProject.g:2125:4: rule__BooleanLiteralExpCS__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanLiteralExpCS__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanLiteralExpCSAccess().getNameAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteralExpCS__Alternatives"


    // $ANTLR start "rule__TypeExpCS__Alternatives"
    // InternalMyAtlProject.g:2133:1: rule__TypeExpCS__Alternatives : ( ( ruleTypeNameExpCS ) | ( ruleTypeLiteralCS ) );
    public final void rule__TypeExpCS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2137:1: ( ( ruleTypeNameExpCS ) | ( ruleTypeLiteralCS ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_SIMPLE_ID) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=32 && LA13_0<=39)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyAtlProject.g:2138:2: ( ruleTypeNameExpCS )
                    {
                    // InternalMyAtlProject.g:2138:2: ( ruleTypeNameExpCS )
                    // InternalMyAtlProject.g:2139:3: ruleTypeNameExpCS
                    {
                     before(grammarAccess.getTypeExpCSAccess().getTypeNameExpCSParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeNameExpCS();

                    state._fsp--;

                     after(grammarAccess.getTypeExpCSAccess().getTypeNameExpCSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:2144:2: ( ruleTypeLiteralCS )
                    {
                    // InternalMyAtlProject.g:2144:2: ( ruleTypeLiteralCS )
                    // InternalMyAtlProject.g:2145:3: ruleTypeLiteralCS
                    {
                     before(grammarAccess.getTypeExpCSAccess().getTypeLiteralCSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeLiteralCS();

                    state._fsp--;

                     after(grammarAccess.getTypeExpCSAccess().getTypeLiteralCSParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpCS__Alternatives"


    // $ANTLR start "rule__PrimaryExpCS__Alternatives"
    // InternalMyAtlProject.g:2154:1: rule__PrimaryExpCS__Alternatives : ( ( ruleNavigatingExpCS ) | ( ruleSelfExpCS ) | ( rulePrimitiveLiteralExpCS ) | ( ruleTupleLiteralExpCS ) | ( ruleCollectionLiteralExpCS ) | ( ruleTypeLiteralExpCS ) | ( ruleLetExpCS ) | ( ruleIfExpCS ) | ( ruleNestedExpCS ) );
    public final void rule__PrimaryExpCS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2158:1: ( ( ruleNavigatingExpCS ) | ( ruleSelfExpCS ) | ( rulePrimitiveLiteralExpCS ) | ( ruleTupleLiteralExpCS ) | ( ruleCollectionLiteralExpCS ) | ( ruleTypeLiteralExpCS ) | ( ruleLetExpCS ) | ( ruleIfExpCS ) | ( ruleNestedExpCS ) )
            int alt14=9;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
                {
                alt14=1;
                }
                break;
            case 76:
                {
                alt14=2;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
            case RULE_BIG_INT:
            case 16:
            case 68:
            case 69:
            case 79:
            case 80:
                {
                alt14=3;
                }
                break;
            case 31:
                {
                alt14=4;
                }
                break;
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt14=5;
                }
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt14=6;
                }
                break;
            case 74:
                {
                alt14=7;
                }
                break;
            case 70:
                {
                alt14=8;
                }
                break;
            case 59:
                {
                alt14=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyAtlProject.g:2159:2: ( ruleNavigatingExpCS )
                    {
                    // InternalMyAtlProject.g:2159:2: ( ruleNavigatingExpCS )
                    // InternalMyAtlProject.g:2160:3: ruleNavigatingExpCS
                    {
                     before(grammarAccess.getPrimaryExpCSAccess().getNavigatingExpCSParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNavigatingExpCS();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpCSAccess().getNavigatingExpCSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:2165:2: ( ruleSelfExpCS )
                    {
                    // InternalMyAtlProject.g:2165:2: ( ruleSelfExpCS )
                    // InternalMyAtlProject.g:2166:3: ruleSelfExpCS
                    {
                     before(grammarAccess.getPrimaryExpCSAccess().getSelfExpCSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSelfExpCS();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpCSAccess().getSelfExpCSParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyAtlProject.g:2171:2: ( rulePrimitiveLiteralExpCS )
                    {
                    // InternalMyAtlProject.g:2171:2: ( rulePrimitiveLiteralExpCS )
                    // InternalMyAtlProject.g:2172:3: rulePrimitiveLiteralExpCS
                    {
                     before(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveLiteralExpCS();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyAtlProject.g:2177:2: ( ruleTupleLiteralExpCS )
                    {
                    // InternalMyAtlProject.g:2177:2: ( ruleTupleLiteralExpCS )
                    // InternalMyAtlProject.g:2178:3: ruleTupleLiteralExpCS
                    {
                     before(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTupleLiteralExpCS();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyAtlProject.g:2183:2: ( ruleCollectionLiteralExpCS )
                    {
                    // InternalMyAtlProject.g:2183:2: ( ruleCollectionLiteralExpCS )
                    // InternalMyAtlProject.g:2184:3: ruleCollectionLiteralExpCS
                    {
                     before(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCollectionLiteralExpCS();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyAtlProject.g:2189:2: ( ruleTypeLiteralExpCS )
                    {
                    // InternalMyAtlProject.g:2189:2: ( ruleTypeLiteralExpCS )
                    // InternalMyAtlProject.g:2190:3: ruleTypeLiteralExpCS
                    {
                     before(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeLiteralExpCS();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyAtlProject.g:2195:2: ( ruleLetExpCS )
                    {
                    // InternalMyAtlProject.g:2195:2: ( ruleLetExpCS )
                    // InternalMyAtlProject.g:2196:3: ruleLetExpCS
                    {
                     before(grammarAccess.getPrimaryExpCSAccess().getLetExpCSParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleLetExpCS();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpCSAccess().getLetExpCSParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyAtlProject.g:2201:2: ( ruleIfExpCS )
                    {
                    // InternalMyAtlProject.g:2201:2: ( ruleIfExpCS )
                    // InternalMyAtlProject.g:2202:3: ruleIfExpCS
                    {
                     before(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleIfExpCS();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyAtlProject.g:2207:2: ( ruleNestedExpCS )
                    {
                    // InternalMyAtlProject.g:2207:2: ( ruleNestedExpCS )
                    // InternalMyAtlProject.g:2208:3: ruleNestedExpCS
                    {
                     before(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleNestedExpCS();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpCS__Alternatives"


    // $ANTLR start "rule__BinaryOperatorCS__Alternatives"
    // InternalMyAtlProject.g:2217:1: rule__BinaryOperatorCS__Alternatives : ( ( ruleInfixOperatorCS ) | ( ruleNavigationOperatorCS ) );
    public final void rule__BinaryOperatorCS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2221:1: ( ( ruleInfixOperatorCS ) | ( ruleNavigationOperatorCS ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14||(LA15_0>=16 && LA15_0<=28)) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=29 && LA15_0<=30)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyAtlProject.g:2222:2: ( ruleInfixOperatorCS )
                    {
                    // InternalMyAtlProject.g:2222:2: ( ruleInfixOperatorCS )
                    // InternalMyAtlProject.g:2223:3: ruleInfixOperatorCS
                    {
                     before(grammarAccess.getBinaryOperatorCSAccess().getInfixOperatorCSParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInfixOperatorCS();

                    state._fsp--;

                     after(grammarAccess.getBinaryOperatorCSAccess().getInfixOperatorCSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:2228:2: ( ruleNavigationOperatorCS )
                    {
                    // InternalMyAtlProject.g:2228:2: ( ruleNavigationOperatorCS )
                    // InternalMyAtlProject.g:2229:3: ruleNavigationOperatorCS
                    {
                     before(grammarAccess.getBinaryOperatorCSAccess().getNavigationOperatorCSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNavigationOperatorCS();

                    state._fsp--;

                     after(grammarAccess.getBinaryOperatorCSAccess().getNavigationOperatorCSParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperatorCS__Alternatives"


    // $ANTLR start "rule__PrefixedExpCS__Alternatives"
    // InternalMyAtlProject.g:2238:1: rule__PrefixedExpCS__Alternatives : ( ( rulePrimaryExpCS ) | ( ( rule__PrefixedExpCS__Group_1__0 ) ) );
    public final void rule__PrefixedExpCS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2242:1: ( ( rulePrimaryExpCS ) | ( ( rule__PrefixedExpCS__Group_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_SINGLE_QUOTED_STRING && LA16_0<=RULE_BIG_INT)||LA16_0==16||(LA16_0>=31 && LA16_0<=44)||LA16_0==59||(LA16_0>=68 && LA16_0<=70)||LA16_0==74||LA16_0==76||(LA16_0>=79 && LA16_0<=80)) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=14 && LA16_0<=15)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyAtlProject.g:2243:2: ( rulePrimaryExpCS )
                    {
                    // InternalMyAtlProject.g:2243:2: ( rulePrimaryExpCS )
                    // InternalMyAtlProject.g:2244:3: rulePrimaryExpCS
                    {
                     before(grammarAccess.getPrefixedExpCSAccess().getPrimaryExpCSParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryExpCS();

                    state._fsp--;

                     after(grammarAccess.getPrefixedExpCSAccess().getPrimaryExpCSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyAtlProject.g:2249:2: ( ( rule__PrefixedExpCS__Group_1__0 ) )
                    {
                    // InternalMyAtlProject.g:2249:2: ( ( rule__PrefixedExpCS__Group_1__0 ) )
                    // InternalMyAtlProject.g:2250:3: ( rule__PrefixedExpCS__Group_1__0 )
                    {
                     before(grammarAccess.getPrefixedExpCSAccess().getGroup_1()); 
                    // InternalMyAtlProject.g:2251:3: ( rule__PrefixedExpCS__Group_1__0 )
                    // InternalMyAtlProject.g:2251:4: rule__PrefixedExpCS__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrefixedExpCS__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrefixedExpCSAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixedExpCS__Alternatives"


    // $ANTLR start "rule__Module__Group__0"
    // InternalMyAtlProject.g:2259:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2263:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalMyAtlProject.g:2264:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // InternalMyAtlProject.g:2271:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2275:1: ( ( 'module' ) )
            // InternalMyAtlProject.g:2276:1: ( 'module' )
            {
            // InternalMyAtlProject.g:2276:1: ( 'module' )
            // InternalMyAtlProject.g:2277:2: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // InternalMyAtlProject.g:2286:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2290:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalMyAtlProject.g:2291:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // InternalMyAtlProject.g:2298:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2302:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // InternalMyAtlProject.g:2303:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // InternalMyAtlProject.g:2303:1: ( ( rule__Module__NameAssignment_1 ) )
            // InternalMyAtlProject.g:2304:2: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // InternalMyAtlProject.g:2305:2: ( rule__Module__NameAssignment_1 )
            // InternalMyAtlProject.g:2305:3: rule__Module__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Module__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // InternalMyAtlProject.g:2313:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2317:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalMyAtlProject.g:2318:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // InternalMyAtlProject.g:2325:1: rule__Module__Group__2__Impl : ( ';' ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2329:1: ( ( ';' ) )
            // InternalMyAtlProject.g:2330:1: ( ';' )
            {
            // InternalMyAtlProject.g:2330:1: ( ';' )
            // InternalMyAtlProject.g:2331:2: ';'
            {
             before(grammarAccess.getModuleAccess().getSemicolonKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // InternalMyAtlProject.g:2340:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2344:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalMyAtlProject.g:2345:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // InternalMyAtlProject.g:2352:1: rule__Module__Group__3__Impl : ( 'create' ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2356:1: ( ( 'create' ) )
            // InternalMyAtlProject.g:2357:1: ( 'create' )
            {
            // InternalMyAtlProject.g:2357:1: ( 'create' )
            // InternalMyAtlProject.g:2358:2: 'create'
            {
             before(grammarAccess.getModuleAccess().getCreateKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getCreateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Module__Group__4"
    // InternalMyAtlProject.g:2367:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2371:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // InternalMyAtlProject.g:2372:2: rule__Module__Group__4__Impl rule__Module__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Module__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4"


    // $ANTLR start "rule__Module__Group__4__Impl"
    // InternalMyAtlProject.g:2379:1: rule__Module__Group__4__Impl : ( 'OUT' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2383:1: ( ( 'OUT' ) )
            // InternalMyAtlProject.g:2384:1: ( 'OUT' )
            {
            // InternalMyAtlProject.g:2384:1: ( 'OUT' )
            // InternalMyAtlProject.g:2385:2: 'OUT'
            {
             before(grammarAccess.getModuleAccess().getOUTKeyword_4()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getOUTKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4__Impl"


    // $ANTLR start "rule__Module__Group__5"
    // InternalMyAtlProject.g:2394:1: rule__Module__Group__5 : rule__Module__Group__5__Impl rule__Module__Group__6 ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2398:1: ( rule__Module__Group__5__Impl rule__Module__Group__6 )
            // InternalMyAtlProject.g:2399:2: rule__Module__Group__5__Impl rule__Module__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Module__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5"


    // $ANTLR start "rule__Module__Group__5__Impl"
    // InternalMyAtlProject.g:2406:1: rule__Module__Group__5__Impl : ( ':' ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2410:1: ( ( ':' ) )
            // InternalMyAtlProject.g:2411:1: ( ':' )
            {
            // InternalMyAtlProject.g:2411:1: ( ':' )
            // InternalMyAtlProject.g:2412:2: ':'
            {
             before(grammarAccess.getModuleAccess().getColonKeyword_5()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5__Impl"


    // $ANTLR start "rule__Module__Group__6"
    // InternalMyAtlProject.g:2421:1: rule__Module__Group__6 : rule__Module__Group__6__Impl rule__Module__Group__7 ;
    public final void rule__Module__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2425:1: ( rule__Module__Group__6__Impl rule__Module__Group__7 )
            // InternalMyAtlProject.g:2426:2: rule__Module__Group__6__Impl rule__Module__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Module__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__6"


    // $ANTLR start "rule__Module__Group__6__Impl"
    // InternalMyAtlProject.g:2433:1: rule__Module__Group__6__Impl : ( 'from' ) ;
    public final void rule__Module__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2437:1: ( ( 'from' ) )
            // InternalMyAtlProject.g:2438:1: ( 'from' )
            {
            // InternalMyAtlProject.g:2438:1: ( 'from' )
            // InternalMyAtlProject.g:2439:2: 'from'
            {
             before(grammarAccess.getModuleAccess().getFromKeyword_6()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getFromKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__6__Impl"


    // $ANTLR start "rule__Module__Group__7"
    // InternalMyAtlProject.g:2448:1: rule__Module__Group__7 : rule__Module__Group__7__Impl rule__Module__Group__8 ;
    public final void rule__Module__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2452:1: ( rule__Module__Group__7__Impl rule__Module__Group__8 )
            // InternalMyAtlProject.g:2453:2: rule__Module__Group__7__Impl rule__Module__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Module__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__7"


    // $ANTLR start "rule__Module__Group__7__Impl"
    // InternalMyAtlProject.g:2460:1: rule__Module__Group__7__Impl : ( 'IN' ) ;
    public final void rule__Module__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2464:1: ( ( 'IN' ) )
            // InternalMyAtlProject.g:2465:1: ( 'IN' )
            {
            // InternalMyAtlProject.g:2465:1: ( 'IN' )
            // InternalMyAtlProject.g:2466:2: 'IN'
            {
             before(grammarAccess.getModuleAccess().getINKeyword_7()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getINKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__7__Impl"


    // $ANTLR start "rule__Module__Group__8"
    // InternalMyAtlProject.g:2475:1: rule__Module__Group__8 : rule__Module__Group__8__Impl rule__Module__Group__9 ;
    public final void rule__Module__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2479:1: ( rule__Module__Group__8__Impl rule__Module__Group__9 )
            // InternalMyAtlProject.g:2480:2: rule__Module__Group__8__Impl rule__Module__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Module__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__8"


    // $ANTLR start "rule__Module__Group__8__Impl"
    // InternalMyAtlProject.g:2487:1: rule__Module__Group__8__Impl : ( ':' ) ;
    public final void rule__Module__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2491:1: ( ( ':' ) )
            // InternalMyAtlProject.g:2492:1: ( ':' )
            {
            // InternalMyAtlProject.g:2492:1: ( ':' )
            // InternalMyAtlProject.g:2493:2: ':'
            {
             before(grammarAccess.getModuleAccess().getColonKeyword_8()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getColonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__8__Impl"


    // $ANTLR start "rule__Module__Group__9"
    // InternalMyAtlProject.g:2502:1: rule__Module__Group__9 : rule__Module__Group__9__Impl ;
    public final void rule__Module__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2506:1: ( rule__Module__Group__9__Impl )
            // InternalMyAtlProject.g:2507:2: rule__Module__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__9"


    // $ANTLR start "rule__Module__Group__9__Impl"
    // InternalMyAtlProject.g:2513:1: rule__Module__Group__9__Impl : ( ( rule__Module__ElementsAssignment_9 )* ) ;
    public final void rule__Module__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2517:1: ( ( ( rule__Module__ElementsAssignment_9 )* ) )
            // InternalMyAtlProject.g:2518:1: ( ( rule__Module__ElementsAssignment_9 )* )
            {
            // InternalMyAtlProject.g:2518:1: ( ( rule__Module__ElementsAssignment_9 )* )
            // InternalMyAtlProject.g:2519:2: ( rule__Module__ElementsAssignment_9 )*
            {
             before(grammarAccess.getModuleAccess().getElementsAssignment_9()); 
            // InternalMyAtlProject.g:2520:2: ( rule__Module__ElementsAssignment_9 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==52||LA17_0==58||LA17_0==61) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyAtlProject.g:2520:3: rule__Module__ElementsAssignment_9
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Module__ElementsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getElementsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__9__Impl"


    // $ANTLR start "rule__MatchedRule__Group__0"
    // InternalMyAtlProject.g:2529:1: rule__MatchedRule__Group__0 : rule__MatchedRule__Group__0__Impl rule__MatchedRule__Group__1 ;
    public final void rule__MatchedRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2533:1: ( rule__MatchedRule__Group__0__Impl rule__MatchedRule__Group__1 )
            // InternalMyAtlProject.g:2534:2: rule__MatchedRule__Group__0__Impl rule__MatchedRule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MatchedRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__0"


    // $ANTLR start "rule__MatchedRule__Group__0__Impl"
    // InternalMyAtlProject.g:2541:1: rule__MatchedRule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__MatchedRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2545:1: ( ( 'rule' ) )
            // InternalMyAtlProject.g:2546:1: ( 'rule' )
            {
            // InternalMyAtlProject.g:2546:1: ( 'rule' )
            // InternalMyAtlProject.g:2547:2: 'rule'
            {
             before(grammarAccess.getMatchedRuleAccess().getRuleKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMatchedRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__0__Impl"


    // $ANTLR start "rule__MatchedRule__Group__1"
    // InternalMyAtlProject.g:2556:1: rule__MatchedRule__Group__1 : rule__MatchedRule__Group__1__Impl rule__MatchedRule__Group__2 ;
    public final void rule__MatchedRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2560:1: ( rule__MatchedRule__Group__1__Impl rule__MatchedRule__Group__2 )
            // InternalMyAtlProject.g:2561:2: rule__MatchedRule__Group__1__Impl rule__MatchedRule__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__MatchedRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__1"


    // $ANTLR start "rule__MatchedRule__Group__1__Impl"
    // InternalMyAtlProject.g:2568:1: rule__MatchedRule__Group__1__Impl : ( ( rule__MatchedRule__NameAssignment_1 ) ) ;
    public final void rule__MatchedRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2572:1: ( ( ( rule__MatchedRule__NameAssignment_1 ) ) )
            // InternalMyAtlProject.g:2573:1: ( ( rule__MatchedRule__NameAssignment_1 ) )
            {
            // InternalMyAtlProject.g:2573:1: ( ( rule__MatchedRule__NameAssignment_1 ) )
            // InternalMyAtlProject.g:2574:2: ( rule__MatchedRule__NameAssignment_1 )
            {
             before(grammarAccess.getMatchedRuleAccess().getNameAssignment_1()); 
            // InternalMyAtlProject.g:2575:2: ( rule__MatchedRule__NameAssignment_1 )
            // InternalMyAtlProject.g:2575:3: rule__MatchedRule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MatchedRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchedRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__1__Impl"


    // $ANTLR start "rule__MatchedRule__Group__2"
    // InternalMyAtlProject.g:2583:1: rule__MatchedRule__Group__2 : rule__MatchedRule__Group__2__Impl rule__MatchedRule__Group__3 ;
    public final void rule__MatchedRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2587:1: ( rule__MatchedRule__Group__2__Impl rule__MatchedRule__Group__3 )
            // InternalMyAtlProject.g:2588:2: rule__MatchedRule__Group__2__Impl rule__MatchedRule__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__MatchedRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__2"


    // $ANTLR start "rule__MatchedRule__Group__2__Impl"
    // InternalMyAtlProject.g:2595:1: rule__MatchedRule__Group__2__Impl : ( '{' ) ;
    public final void rule__MatchedRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2599:1: ( ( '{' ) )
            // InternalMyAtlProject.g:2600:1: ( '{' )
            {
            // InternalMyAtlProject.g:2600:1: ( '{' )
            // InternalMyAtlProject.g:2601:2: '{'
            {
             before(grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__2__Impl"


    // $ANTLR start "rule__MatchedRule__Group__3"
    // InternalMyAtlProject.g:2610:1: rule__MatchedRule__Group__3 : rule__MatchedRule__Group__3__Impl rule__MatchedRule__Group__4 ;
    public final void rule__MatchedRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2614:1: ( rule__MatchedRule__Group__3__Impl rule__MatchedRule__Group__4 )
            // InternalMyAtlProject.g:2615:2: rule__MatchedRule__Group__3__Impl rule__MatchedRule__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__MatchedRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__3"


    // $ANTLR start "rule__MatchedRule__Group__3__Impl"
    // InternalMyAtlProject.g:2622:1: rule__MatchedRule__Group__3__Impl : ( 'from' ) ;
    public final void rule__MatchedRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2626:1: ( ( 'from' ) )
            // InternalMyAtlProject.g:2627:1: ( 'from' )
            {
            // InternalMyAtlProject.g:2627:1: ( 'from' )
            // InternalMyAtlProject.g:2628:2: 'from'
            {
             before(grammarAccess.getMatchedRuleAccess().getFromKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMatchedRuleAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__3__Impl"


    // $ANTLR start "rule__MatchedRule__Group__4"
    // InternalMyAtlProject.g:2637:1: rule__MatchedRule__Group__4 : rule__MatchedRule__Group__4__Impl rule__MatchedRule__Group__5 ;
    public final void rule__MatchedRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2641:1: ( rule__MatchedRule__Group__4__Impl rule__MatchedRule__Group__5 )
            // InternalMyAtlProject.g:2642:2: rule__MatchedRule__Group__4__Impl rule__MatchedRule__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__MatchedRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__4"


    // $ANTLR start "rule__MatchedRule__Group__4__Impl"
    // InternalMyAtlProject.g:2649:1: rule__MatchedRule__Group__4__Impl : ( ( rule__MatchedRule__InPatternAssignment_4 ) ) ;
    public final void rule__MatchedRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2653:1: ( ( ( rule__MatchedRule__InPatternAssignment_4 ) ) )
            // InternalMyAtlProject.g:2654:1: ( ( rule__MatchedRule__InPatternAssignment_4 ) )
            {
            // InternalMyAtlProject.g:2654:1: ( ( rule__MatchedRule__InPatternAssignment_4 ) )
            // InternalMyAtlProject.g:2655:2: ( rule__MatchedRule__InPatternAssignment_4 )
            {
             before(grammarAccess.getMatchedRuleAccess().getInPatternAssignment_4()); 
            // InternalMyAtlProject.g:2656:2: ( rule__MatchedRule__InPatternAssignment_4 )
            // InternalMyAtlProject.g:2656:3: rule__MatchedRule__InPatternAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MatchedRule__InPatternAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMatchedRuleAccess().getInPatternAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__4__Impl"


    // $ANTLR start "rule__MatchedRule__Group__5"
    // InternalMyAtlProject.g:2664:1: rule__MatchedRule__Group__5 : rule__MatchedRule__Group__5__Impl rule__MatchedRule__Group__6 ;
    public final void rule__MatchedRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2668:1: ( rule__MatchedRule__Group__5__Impl rule__MatchedRule__Group__6 )
            // InternalMyAtlProject.g:2669:2: rule__MatchedRule__Group__5__Impl rule__MatchedRule__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__MatchedRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__5"


    // $ANTLR start "rule__MatchedRule__Group__5__Impl"
    // InternalMyAtlProject.g:2676:1: rule__MatchedRule__Group__5__Impl : ( ( rule__MatchedRule__Group_5__0 )? ) ;
    public final void rule__MatchedRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2680:1: ( ( ( rule__MatchedRule__Group_5__0 )? ) )
            // InternalMyAtlProject.g:2681:1: ( ( rule__MatchedRule__Group_5__0 )? )
            {
            // InternalMyAtlProject.g:2681:1: ( ( rule__MatchedRule__Group_5__0 )? )
            // InternalMyAtlProject.g:2682:2: ( rule__MatchedRule__Group_5__0 )?
            {
             before(grammarAccess.getMatchedRuleAccess().getGroup_5()); 
            // InternalMyAtlProject.g:2683:2: ( rule__MatchedRule__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==56) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyAtlProject.g:2683:3: rule__MatchedRule__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MatchedRule__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchedRuleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__5__Impl"


    // $ANTLR start "rule__MatchedRule__Group__6"
    // InternalMyAtlProject.g:2691:1: rule__MatchedRule__Group__6 : rule__MatchedRule__Group__6__Impl rule__MatchedRule__Group__7 ;
    public final void rule__MatchedRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2695:1: ( rule__MatchedRule__Group__6__Impl rule__MatchedRule__Group__7 )
            // InternalMyAtlProject.g:2696:2: rule__MatchedRule__Group__6__Impl rule__MatchedRule__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__MatchedRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__6"


    // $ANTLR start "rule__MatchedRule__Group__6__Impl"
    // InternalMyAtlProject.g:2703:1: rule__MatchedRule__Group__6__Impl : ( 'to' ) ;
    public final void rule__MatchedRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2707:1: ( ( 'to' ) )
            // InternalMyAtlProject.g:2708:1: ( 'to' )
            {
            // InternalMyAtlProject.g:2708:1: ( 'to' )
            // InternalMyAtlProject.g:2709:2: 'to'
            {
             before(grammarAccess.getMatchedRuleAccess().getToKeyword_6()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getMatchedRuleAccess().getToKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__6__Impl"


    // $ANTLR start "rule__MatchedRule__Group__7"
    // InternalMyAtlProject.g:2718:1: rule__MatchedRule__Group__7 : rule__MatchedRule__Group__7__Impl rule__MatchedRule__Group__8 ;
    public final void rule__MatchedRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2722:1: ( rule__MatchedRule__Group__7__Impl rule__MatchedRule__Group__8 )
            // InternalMyAtlProject.g:2723:2: rule__MatchedRule__Group__7__Impl rule__MatchedRule__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__MatchedRule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__7"


    // $ANTLR start "rule__MatchedRule__Group__7__Impl"
    // InternalMyAtlProject.g:2730:1: rule__MatchedRule__Group__7__Impl : ( ( rule__MatchedRule__OutPatternAssignment_7 ) ) ;
    public final void rule__MatchedRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2734:1: ( ( ( rule__MatchedRule__OutPatternAssignment_7 ) ) )
            // InternalMyAtlProject.g:2735:1: ( ( rule__MatchedRule__OutPatternAssignment_7 ) )
            {
            // InternalMyAtlProject.g:2735:1: ( ( rule__MatchedRule__OutPatternAssignment_7 ) )
            // InternalMyAtlProject.g:2736:2: ( rule__MatchedRule__OutPatternAssignment_7 )
            {
             before(grammarAccess.getMatchedRuleAccess().getOutPatternAssignment_7()); 
            // InternalMyAtlProject.g:2737:2: ( rule__MatchedRule__OutPatternAssignment_7 )
            // InternalMyAtlProject.g:2737:3: rule__MatchedRule__OutPatternAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__MatchedRule__OutPatternAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMatchedRuleAccess().getOutPatternAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__7__Impl"


    // $ANTLR start "rule__MatchedRule__Group__8"
    // InternalMyAtlProject.g:2745:1: rule__MatchedRule__Group__8 : rule__MatchedRule__Group__8__Impl rule__MatchedRule__Group__9 ;
    public final void rule__MatchedRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2749:1: ( rule__MatchedRule__Group__8__Impl rule__MatchedRule__Group__9 )
            // InternalMyAtlProject.g:2750:2: rule__MatchedRule__Group__8__Impl rule__MatchedRule__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__MatchedRule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__8"


    // $ANTLR start "rule__MatchedRule__Group__8__Impl"
    // InternalMyAtlProject.g:2757:1: rule__MatchedRule__Group__8__Impl : ( ( rule__MatchedRule__Group_8__0 )? ) ;
    public final void rule__MatchedRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2761:1: ( ( ( rule__MatchedRule__Group_8__0 )? ) )
            // InternalMyAtlProject.g:2762:1: ( ( rule__MatchedRule__Group_8__0 )? )
            {
            // InternalMyAtlProject.g:2762:1: ( ( rule__MatchedRule__Group_8__0 )? )
            // InternalMyAtlProject.g:2763:2: ( rule__MatchedRule__Group_8__0 )?
            {
             before(grammarAccess.getMatchedRuleAccess().getGroup_8()); 
            // InternalMyAtlProject.g:2764:2: ( rule__MatchedRule__Group_8__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==57) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyAtlProject.g:2764:3: rule__MatchedRule__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MatchedRule__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchedRuleAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__8__Impl"


    // $ANTLR start "rule__MatchedRule__Group__9"
    // InternalMyAtlProject.g:2772:1: rule__MatchedRule__Group__9 : rule__MatchedRule__Group__9__Impl ;
    public final void rule__MatchedRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2776:1: ( rule__MatchedRule__Group__9__Impl )
            // InternalMyAtlProject.g:2777:2: rule__MatchedRule__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__9"


    // $ANTLR start "rule__MatchedRule__Group__9__Impl"
    // InternalMyAtlProject.g:2783:1: rule__MatchedRule__Group__9__Impl : ( '}' ) ;
    public final void rule__MatchedRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2787:1: ( ( '}' ) )
            // InternalMyAtlProject.g:2788:1: ( '}' )
            {
            // InternalMyAtlProject.g:2788:1: ( '}' )
            // InternalMyAtlProject.g:2789:2: '}'
            {
             before(grammarAccess.getMatchedRuleAccess().getRightCurlyBracketKeyword_9()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getMatchedRuleAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group__9__Impl"


    // $ANTLR start "rule__MatchedRule__Group_5__0"
    // InternalMyAtlProject.g:2799:1: rule__MatchedRule__Group_5__0 : rule__MatchedRule__Group_5__0__Impl rule__MatchedRule__Group_5__1 ;
    public final void rule__MatchedRule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2803:1: ( rule__MatchedRule__Group_5__0__Impl rule__MatchedRule__Group_5__1 )
            // InternalMyAtlProject.g:2804:2: rule__MatchedRule__Group_5__0__Impl rule__MatchedRule__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__MatchedRule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group_5__0"


    // $ANTLR start "rule__MatchedRule__Group_5__0__Impl"
    // InternalMyAtlProject.g:2811:1: rule__MatchedRule__Group_5__0__Impl : ( 'using' ) ;
    public final void rule__MatchedRule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2815:1: ( ( 'using' ) )
            // InternalMyAtlProject.g:2816:1: ( 'using' )
            {
            // InternalMyAtlProject.g:2816:1: ( 'using' )
            // InternalMyAtlProject.g:2817:2: 'using'
            {
             before(grammarAccess.getMatchedRuleAccess().getUsingKeyword_5_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getMatchedRuleAccess().getUsingKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group_5__0__Impl"


    // $ANTLR start "rule__MatchedRule__Group_5__1"
    // InternalMyAtlProject.g:2826:1: rule__MatchedRule__Group_5__1 : rule__MatchedRule__Group_5__1__Impl rule__MatchedRule__Group_5__2 ;
    public final void rule__MatchedRule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2830:1: ( rule__MatchedRule__Group_5__1__Impl rule__MatchedRule__Group_5__2 )
            // InternalMyAtlProject.g:2831:2: rule__MatchedRule__Group_5__1__Impl rule__MatchedRule__Group_5__2
            {
            pushFollow(FOLLOW_17);
            rule__MatchedRule__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group_5__1"


    // $ANTLR start "rule__MatchedRule__Group_5__1__Impl"
    // InternalMyAtlProject.g:2838:1: rule__MatchedRule__Group_5__1__Impl : ( '{' ) ;
    public final void rule__MatchedRule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2842:1: ( ( '{' ) )
            // InternalMyAtlProject.g:2843:1: ( '{' )
            {
            // InternalMyAtlProject.g:2843:1: ( '{' )
            // InternalMyAtlProject.g:2844:2: '{'
            {
             before(grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group_5__1__Impl"


    // $ANTLR start "rule__MatchedRule__Group_5__2"
    // InternalMyAtlProject.g:2853:1: rule__MatchedRule__Group_5__2 : rule__MatchedRule__Group_5__2__Impl rule__MatchedRule__Group_5__3 ;
    public final void rule__MatchedRule__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2857:1: ( rule__MatchedRule__Group_5__2__Impl rule__MatchedRule__Group_5__3 )
            // InternalMyAtlProject.g:2858:2: rule__MatchedRule__Group_5__2__Impl rule__MatchedRule__Group_5__3
            {
            pushFollow(FOLLOW_17);
            rule__MatchedRule__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group_5__2"


    // $ANTLR start "rule__MatchedRule__Group_5__2__Impl"
    // InternalMyAtlProject.g:2865:1: rule__MatchedRule__Group_5__2__Impl : ( ( rule__MatchedRule__VariablesAssignment_5_2 )* ) ;
    public final void rule__MatchedRule__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2869:1: ( ( ( rule__MatchedRule__VariablesAssignment_5_2 )* ) )
            // InternalMyAtlProject.g:2870:1: ( ( rule__MatchedRule__VariablesAssignment_5_2 )* )
            {
            // InternalMyAtlProject.g:2870:1: ( ( rule__MatchedRule__VariablesAssignment_5_2 )* )
            // InternalMyAtlProject.g:2871:2: ( rule__MatchedRule__VariablesAssignment_5_2 )*
            {
             before(grammarAccess.getMatchedRuleAccess().getVariablesAssignment_5_2()); 
            // InternalMyAtlProject.g:2872:2: ( rule__MatchedRule__VariablesAssignment_5_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_SIMPLE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyAtlProject.g:2872:3: rule__MatchedRule__VariablesAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__MatchedRule__VariablesAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMatchedRuleAccess().getVariablesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group_5__2__Impl"


    // $ANTLR start "rule__MatchedRule__Group_5__3"
    // InternalMyAtlProject.g:2880:1: rule__MatchedRule__Group_5__3 : rule__MatchedRule__Group_5__3__Impl ;
    public final void rule__MatchedRule__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2884:1: ( rule__MatchedRule__Group_5__3__Impl )
            // InternalMyAtlProject.g:2885:2: rule__MatchedRule__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group_5__3"


    // $ANTLR start "rule__MatchedRule__Group_5__3__Impl"
    // InternalMyAtlProject.g:2891:1: rule__MatchedRule__Group_5__3__Impl : ( '}' ) ;
    public final void rule__MatchedRule__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2895:1: ( ( '}' ) )
            // InternalMyAtlProject.g:2896:1: ( '}' )
            {
            // InternalMyAtlProject.g:2896:1: ( '}' )
            // InternalMyAtlProject.g:2897:2: '}'
            {
             before(grammarAccess.getMatchedRuleAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getMatchedRuleAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group_5__3__Impl"


    // $ANTLR start "rule__MatchedRule__Group_8__0"
    // InternalMyAtlProject.g:2907:1: rule__MatchedRule__Group_8__0 : rule__MatchedRule__Group_8__0__Impl rule__MatchedRule__Group_8__1 ;
    public final void rule__MatchedRule__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2911:1: ( rule__MatchedRule__Group_8__0__Impl rule__MatchedRule__Group_8__1 )
            // InternalMyAtlProject.g:2912:2: rule__MatchedRule__Group_8__0__Impl rule__MatchedRule__Group_8__1
            {
            pushFollow(FOLLOW_13);
            rule__MatchedRule__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group_8__0"


    // $ANTLR start "rule__MatchedRule__Group_8__0__Impl"
    // InternalMyAtlProject.g:2919:1: rule__MatchedRule__Group_8__0__Impl : ( 'do' ) ;
    public final void rule__MatchedRule__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2923:1: ( ( 'do' ) )
            // InternalMyAtlProject.g:2924:1: ( 'do' )
            {
            // InternalMyAtlProject.g:2924:1: ( 'do' )
            // InternalMyAtlProject.g:2925:2: 'do'
            {
             before(grammarAccess.getMatchedRuleAccess().getDoKeyword_8_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getMatchedRuleAccess().getDoKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group_8__0__Impl"


    // $ANTLR start "rule__MatchedRule__Group_8__1"
    // InternalMyAtlProject.g:2934:1: rule__MatchedRule__Group_8__1 : rule__MatchedRule__Group_8__1__Impl rule__MatchedRule__Group_8__2 ;
    public final void rule__MatchedRule__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2938:1: ( rule__MatchedRule__Group_8__1__Impl rule__MatchedRule__Group_8__2 )
            // InternalMyAtlProject.g:2939:2: rule__MatchedRule__Group_8__1__Impl rule__MatchedRule__Group_8__2
            {
            pushFollow(FOLLOW_4);
            rule__MatchedRule__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group_8__1"


    // $ANTLR start "rule__MatchedRule__Group_8__1__Impl"
    // InternalMyAtlProject.g:2946:1: rule__MatchedRule__Group_8__1__Impl : ( '{' ) ;
    public final void rule__MatchedRule__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2950:1: ( ( '{' ) )
            // InternalMyAtlProject.g:2951:1: ( '{' )
            {
            // InternalMyAtlProject.g:2951:1: ( '{' )
            // InternalMyAtlProject.g:2952:2: '{'
            {
             before(grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group_8__1__Impl"


    // $ANTLR start "rule__MatchedRule__Group_8__2"
    // InternalMyAtlProject.g:2961:1: rule__MatchedRule__Group_8__2 : rule__MatchedRule__Group_8__2__Impl rule__MatchedRule__Group_8__3 ;
    public final void rule__MatchedRule__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2965:1: ( rule__MatchedRule__Group_8__2__Impl rule__MatchedRule__Group_8__3 )
            // InternalMyAtlProject.g:2966:2: rule__MatchedRule__Group_8__2__Impl rule__MatchedRule__Group_8__3
            {
            pushFollow(FOLLOW_18);
            rule__MatchedRule__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group_8__2"


    // $ANTLR start "rule__MatchedRule__Group_8__2__Impl"
    // InternalMyAtlProject.g:2973:1: rule__MatchedRule__Group_8__2__Impl : ( ( rule__MatchedRule__ActionBlockAssignment_8_2 ) ) ;
    public final void rule__MatchedRule__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2977:1: ( ( ( rule__MatchedRule__ActionBlockAssignment_8_2 ) ) )
            // InternalMyAtlProject.g:2978:1: ( ( rule__MatchedRule__ActionBlockAssignment_8_2 ) )
            {
            // InternalMyAtlProject.g:2978:1: ( ( rule__MatchedRule__ActionBlockAssignment_8_2 ) )
            // InternalMyAtlProject.g:2979:2: ( rule__MatchedRule__ActionBlockAssignment_8_2 )
            {
             before(grammarAccess.getMatchedRuleAccess().getActionBlockAssignment_8_2()); 
            // InternalMyAtlProject.g:2980:2: ( rule__MatchedRule__ActionBlockAssignment_8_2 )
            // InternalMyAtlProject.g:2980:3: rule__MatchedRule__ActionBlockAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__MatchedRule__ActionBlockAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getMatchedRuleAccess().getActionBlockAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group_8__2__Impl"


    // $ANTLR start "rule__MatchedRule__Group_8__3"
    // InternalMyAtlProject.g:2988:1: rule__MatchedRule__Group_8__3 : rule__MatchedRule__Group_8__3__Impl ;
    public final void rule__MatchedRule__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:2992:1: ( rule__MatchedRule__Group_8__3__Impl )
            // InternalMyAtlProject.g:2993:2: rule__MatchedRule__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchedRule__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group_8__3"


    // $ANTLR start "rule__MatchedRule__Group_8__3__Impl"
    // InternalMyAtlProject.g:2999:1: rule__MatchedRule__Group_8__3__Impl : ( '}' ) ;
    public final void rule__MatchedRule__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3003:1: ( ( '}' ) )
            // InternalMyAtlProject.g:3004:1: ( '}' )
            {
            // InternalMyAtlProject.g:3004:1: ( '}' )
            // InternalMyAtlProject.g:3005:2: '}'
            {
             before(grammarAccess.getMatchedRuleAccess().getRightCurlyBracketKeyword_8_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getMatchedRuleAccess().getRightCurlyBracketKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__Group_8__3__Impl"


    // $ANTLR start "rule__CalledRule__Group__0"
    // InternalMyAtlProject.g:3015:1: rule__CalledRule__Group__0 : rule__CalledRule__Group__0__Impl rule__CalledRule__Group__1 ;
    public final void rule__CalledRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3019:1: ( rule__CalledRule__Group__0__Impl rule__CalledRule__Group__1 )
            // InternalMyAtlProject.g:3020:2: rule__CalledRule__Group__0__Impl rule__CalledRule__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__CalledRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalledRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__0"


    // $ANTLR start "rule__CalledRule__Group__0__Impl"
    // InternalMyAtlProject.g:3027:1: rule__CalledRule__Group__0__Impl : ( ( 'entrypoint' )? ) ;
    public final void rule__CalledRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3031:1: ( ( ( 'entrypoint' )? ) )
            // InternalMyAtlProject.g:3032:1: ( ( 'entrypoint' )? )
            {
            // InternalMyAtlProject.g:3032:1: ( ( 'entrypoint' )? )
            // InternalMyAtlProject.g:3033:2: ( 'entrypoint' )?
            {
             before(grammarAccess.getCalledRuleAccess().getEntrypointKeyword_0()); 
            // InternalMyAtlProject.g:3034:2: ( 'entrypoint' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==58) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyAtlProject.g:3034:3: 'entrypoint'
                    {
                    match(input,58,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCalledRuleAccess().getEntrypointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__0__Impl"


    // $ANTLR start "rule__CalledRule__Group__1"
    // InternalMyAtlProject.g:3042:1: rule__CalledRule__Group__1 : rule__CalledRule__Group__1__Impl rule__CalledRule__Group__2 ;
    public final void rule__CalledRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3046:1: ( rule__CalledRule__Group__1__Impl rule__CalledRule__Group__2 )
            // InternalMyAtlProject.g:3047:2: rule__CalledRule__Group__1__Impl rule__CalledRule__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CalledRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalledRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__1"


    // $ANTLR start "rule__CalledRule__Group__1__Impl"
    // InternalMyAtlProject.g:3054:1: rule__CalledRule__Group__1__Impl : ( 'rule' ) ;
    public final void rule__CalledRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3058:1: ( ( 'rule' ) )
            // InternalMyAtlProject.g:3059:1: ( 'rule' )
            {
            // InternalMyAtlProject.g:3059:1: ( 'rule' )
            // InternalMyAtlProject.g:3060:2: 'rule'
            {
             before(grammarAccess.getCalledRuleAccess().getRuleKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCalledRuleAccess().getRuleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__1__Impl"


    // $ANTLR start "rule__CalledRule__Group__2"
    // InternalMyAtlProject.g:3069:1: rule__CalledRule__Group__2 : rule__CalledRule__Group__2__Impl rule__CalledRule__Group__3 ;
    public final void rule__CalledRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3073:1: ( rule__CalledRule__Group__2__Impl rule__CalledRule__Group__3 )
            // InternalMyAtlProject.g:3074:2: rule__CalledRule__Group__2__Impl rule__CalledRule__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__CalledRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalledRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__2"


    // $ANTLR start "rule__CalledRule__Group__2__Impl"
    // InternalMyAtlProject.g:3081:1: rule__CalledRule__Group__2__Impl : ( ( rule__CalledRule__NameAssignment_2 ) ) ;
    public final void rule__CalledRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3085:1: ( ( ( rule__CalledRule__NameAssignment_2 ) ) )
            // InternalMyAtlProject.g:3086:1: ( ( rule__CalledRule__NameAssignment_2 ) )
            {
            // InternalMyAtlProject.g:3086:1: ( ( rule__CalledRule__NameAssignment_2 ) )
            // InternalMyAtlProject.g:3087:2: ( rule__CalledRule__NameAssignment_2 )
            {
             before(grammarAccess.getCalledRuleAccess().getNameAssignment_2()); 
            // InternalMyAtlProject.g:3088:2: ( rule__CalledRule__NameAssignment_2 )
            // InternalMyAtlProject.g:3088:3: rule__CalledRule__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CalledRule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCalledRuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__2__Impl"


    // $ANTLR start "rule__CalledRule__Group__3"
    // InternalMyAtlProject.g:3096:1: rule__CalledRule__Group__3 : rule__CalledRule__Group__3__Impl rule__CalledRule__Group__4 ;
    public final void rule__CalledRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3100:1: ( rule__CalledRule__Group__3__Impl rule__CalledRule__Group__4 )
            // InternalMyAtlProject.g:3101:2: rule__CalledRule__Group__3__Impl rule__CalledRule__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__CalledRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalledRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__3"


    // $ANTLR start "rule__CalledRule__Group__3__Impl"
    // InternalMyAtlProject.g:3108:1: rule__CalledRule__Group__3__Impl : ( ( rule__CalledRule__Group_3__0 )? ) ;
    public final void rule__CalledRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3112:1: ( ( ( rule__CalledRule__Group_3__0 )? ) )
            // InternalMyAtlProject.g:3113:1: ( ( rule__CalledRule__Group_3__0 )? )
            {
            // InternalMyAtlProject.g:3113:1: ( ( rule__CalledRule__Group_3__0 )? )
            // InternalMyAtlProject.g:3114:2: ( rule__CalledRule__Group_3__0 )?
            {
             before(grammarAccess.getCalledRuleAccess().getGroup_3()); 
            // InternalMyAtlProject.g:3115:2: ( rule__CalledRule__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==59) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyAtlProject.g:3115:3: rule__CalledRule__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CalledRule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalledRuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__3__Impl"


    // $ANTLR start "rule__CalledRule__Group__4"
    // InternalMyAtlProject.g:3123:1: rule__CalledRule__Group__4 : rule__CalledRule__Group__4__Impl rule__CalledRule__Group__5 ;
    public final void rule__CalledRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3127:1: ( rule__CalledRule__Group__4__Impl rule__CalledRule__Group__5 )
            // InternalMyAtlProject.g:3128:2: rule__CalledRule__Group__4__Impl rule__CalledRule__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__CalledRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalledRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__4"


    // $ANTLR start "rule__CalledRule__Group__4__Impl"
    // InternalMyAtlProject.g:3135:1: rule__CalledRule__Group__4__Impl : ( '{' ) ;
    public final void rule__CalledRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3139:1: ( ( '{' ) )
            // InternalMyAtlProject.g:3140:1: ( '{' )
            {
            // InternalMyAtlProject.g:3140:1: ( '{' )
            // InternalMyAtlProject.g:3141:2: '{'
            {
             before(grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__4__Impl"


    // $ANTLR start "rule__CalledRule__Group__5"
    // InternalMyAtlProject.g:3150:1: rule__CalledRule__Group__5 : rule__CalledRule__Group__5__Impl rule__CalledRule__Group__6 ;
    public final void rule__CalledRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3154:1: ( rule__CalledRule__Group__5__Impl rule__CalledRule__Group__6 )
            // InternalMyAtlProject.g:3155:2: rule__CalledRule__Group__5__Impl rule__CalledRule__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__CalledRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalledRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__5"


    // $ANTLR start "rule__CalledRule__Group__5__Impl"
    // InternalMyAtlProject.g:3162:1: rule__CalledRule__Group__5__Impl : ( ( rule__CalledRule__Group_5__0 )? ) ;
    public final void rule__CalledRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3166:1: ( ( ( rule__CalledRule__Group_5__0 )? ) )
            // InternalMyAtlProject.g:3167:1: ( ( rule__CalledRule__Group_5__0 )? )
            {
            // InternalMyAtlProject.g:3167:1: ( ( rule__CalledRule__Group_5__0 )? )
            // InternalMyAtlProject.g:3168:2: ( rule__CalledRule__Group_5__0 )?
            {
             before(grammarAccess.getCalledRuleAccess().getGroup_5()); 
            // InternalMyAtlProject.g:3169:2: ( rule__CalledRule__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==56) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyAtlProject.g:3169:3: rule__CalledRule__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CalledRule__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalledRuleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__5__Impl"


    // $ANTLR start "rule__CalledRule__Group__6"
    // InternalMyAtlProject.g:3177:1: rule__CalledRule__Group__6 : rule__CalledRule__Group__6__Impl rule__CalledRule__Group__7 ;
    public final void rule__CalledRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3181:1: ( rule__CalledRule__Group__6__Impl rule__CalledRule__Group__7 )
            // InternalMyAtlProject.g:3182:2: rule__CalledRule__Group__6__Impl rule__CalledRule__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__CalledRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalledRule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__6"


    // $ANTLR start "rule__CalledRule__Group__6__Impl"
    // InternalMyAtlProject.g:3189:1: rule__CalledRule__Group__6__Impl : ( 'to' ) ;
    public final void rule__CalledRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3193:1: ( ( 'to' ) )
            // InternalMyAtlProject.g:3194:1: ( 'to' )
            {
            // InternalMyAtlProject.g:3194:1: ( 'to' )
            // InternalMyAtlProject.g:3195:2: 'to'
            {
             before(grammarAccess.getCalledRuleAccess().getToKeyword_6()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCalledRuleAccess().getToKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__6__Impl"


    // $ANTLR start "rule__CalledRule__Group__7"
    // InternalMyAtlProject.g:3204:1: rule__CalledRule__Group__7 : rule__CalledRule__Group__7__Impl rule__CalledRule__Group__8 ;
    public final void rule__CalledRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3208:1: ( rule__CalledRule__Group__7__Impl rule__CalledRule__Group__8 )
            // InternalMyAtlProject.g:3209:2: rule__CalledRule__Group__7__Impl rule__CalledRule__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__CalledRule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalledRule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__7"


    // $ANTLR start "rule__CalledRule__Group__7__Impl"
    // InternalMyAtlProject.g:3216:1: rule__CalledRule__Group__7__Impl : ( ( rule__CalledRule__OutPatternAssignment_7 ) ) ;
    public final void rule__CalledRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3220:1: ( ( ( rule__CalledRule__OutPatternAssignment_7 ) ) )
            // InternalMyAtlProject.g:3221:1: ( ( rule__CalledRule__OutPatternAssignment_7 ) )
            {
            // InternalMyAtlProject.g:3221:1: ( ( rule__CalledRule__OutPatternAssignment_7 ) )
            // InternalMyAtlProject.g:3222:2: ( rule__CalledRule__OutPatternAssignment_7 )
            {
             before(grammarAccess.getCalledRuleAccess().getOutPatternAssignment_7()); 
            // InternalMyAtlProject.g:3223:2: ( rule__CalledRule__OutPatternAssignment_7 )
            // InternalMyAtlProject.g:3223:3: rule__CalledRule__OutPatternAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__CalledRule__OutPatternAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCalledRuleAccess().getOutPatternAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__7__Impl"


    // $ANTLR start "rule__CalledRule__Group__8"
    // InternalMyAtlProject.g:3231:1: rule__CalledRule__Group__8 : rule__CalledRule__Group__8__Impl rule__CalledRule__Group__9 ;
    public final void rule__CalledRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3235:1: ( rule__CalledRule__Group__8__Impl rule__CalledRule__Group__9 )
            // InternalMyAtlProject.g:3236:2: rule__CalledRule__Group__8__Impl rule__CalledRule__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__CalledRule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalledRule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__8"


    // $ANTLR start "rule__CalledRule__Group__8__Impl"
    // InternalMyAtlProject.g:3243:1: rule__CalledRule__Group__8__Impl : ( ( rule__CalledRule__Group_8__0 )? ) ;
    public final void rule__CalledRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3247:1: ( ( ( rule__CalledRule__Group_8__0 )? ) )
            // InternalMyAtlProject.g:3248:1: ( ( rule__CalledRule__Group_8__0 )? )
            {
            // InternalMyAtlProject.g:3248:1: ( ( rule__CalledRule__Group_8__0 )? )
            // InternalMyAtlProject.g:3249:2: ( rule__CalledRule__Group_8__0 )?
            {
             before(grammarAccess.getCalledRuleAccess().getGroup_8()); 
            // InternalMyAtlProject.g:3250:2: ( rule__CalledRule__Group_8__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==57) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyAtlProject.g:3250:3: rule__CalledRule__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CalledRule__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalledRuleAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__8__Impl"


    // $ANTLR start "rule__CalledRule__Group__9"
    // InternalMyAtlProject.g:3258:1: rule__CalledRule__Group__9 : rule__CalledRule__Group__9__Impl ;
    public final void rule__CalledRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3262:1: ( rule__CalledRule__Group__9__Impl )
            // InternalMyAtlProject.g:3263:2: rule__CalledRule__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CalledRule__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__9"


    // $ANTLR start "rule__CalledRule__Group__9__Impl"
    // InternalMyAtlProject.g:3269:1: rule__CalledRule__Group__9__Impl : ( '}' ) ;
    public final void rule__CalledRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3273:1: ( ( '}' ) )
            // InternalMyAtlProject.g:3274:1: ( '}' )
            {
            // InternalMyAtlProject.g:3274:1: ( '}' )
            // InternalMyAtlProject.g:3275:2: '}'
            {
             before(grammarAccess.getCalledRuleAccess().getRightCurlyBracketKeyword_9()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCalledRuleAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group__9__Impl"


    // $ANTLR start "rule__CalledRule__Group_3__0"
    // InternalMyAtlProject.g:3285:1: rule__CalledRule__Group_3__0 : rule__CalledRule__Group_3__0__Impl rule__CalledRule__Group_3__1 ;
    public final void rule__CalledRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3289:1: ( rule__CalledRule__Group_3__0__Impl rule__CalledRule__Group_3__1 )
            // InternalMyAtlProject.g:3290:2: rule__CalledRule__Group_3__0__Impl rule__CalledRule__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__CalledRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalledRule__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_3__0"


    // $ANTLR start "rule__CalledRule__Group_3__0__Impl"
    // InternalMyAtlProject.g:3297:1: rule__CalledRule__Group_3__0__Impl : ( '(' ) ;
    public final void rule__CalledRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3301:1: ( ( '(' ) )
            // InternalMyAtlProject.g:3302:1: ( '(' )
            {
            // InternalMyAtlProject.g:3302:1: ( '(' )
            // InternalMyAtlProject.g:3303:2: '('
            {
             before(grammarAccess.getCalledRuleAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getCalledRuleAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_3__0__Impl"


    // $ANTLR start "rule__CalledRule__Group_3__1"
    // InternalMyAtlProject.g:3312:1: rule__CalledRule__Group_3__1 : rule__CalledRule__Group_3__1__Impl ;
    public final void rule__CalledRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3316:1: ( rule__CalledRule__Group_3__1__Impl )
            // InternalMyAtlProject.g:3317:2: rule__CalledRule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CalledRule__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_3__1"


    // $ANTLR start "rule__CalledRule__Group_3__1__Impl"
    // InternalMyAtlProject.g:3323:1: rule__CalledRule__Group_3__1__Impl : ( ')' ) ;
    public final void rule__CalledRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3327:1: ( ( ')' ) )
            // InternalMyAtlProject.g:3328:1: ( ')' )
            {
            // InternalMyAtlProject.g:3328:1: ( ')' )
            // InternalMyAtlProject.g:3329:2: ')'
            {
             before(grammarAccess.getCalledRuleAccess().getRightParenthesisKeyword_3_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getCalledRuleAccess().getRightParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_3__1__Impl"


    // $ANTLR start "rule__CalledRule__Group_5__0"
    // InternalMyAtlProject.g:3339:1: rule__CalledRule__Group_5__0 : rule__CalledRule__Group_5__0__Impl rule__CalledRule__Group_5__1 ;
    public final void rule__CalledRule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3343:1: ( rule__CalledRule__Group_5__0__Impl rule__CalledRule__Group_5__1 )
            // InternalMyAtlProject.g:3344:2: rule__CalledRule__Group_5__0__Impl rule__CalledRule__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__CalledRule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalledRule__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_5__0"


    // $ANTLR start "rule__CalledRule__Group_5__0__Impl"
    // InternalMyAtlProject.g:3351:1: rule__CalledRule__Group_5__0__Impl : ( 'using' ) ;
    public final void rule__CalledRule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3355:1: ( ( 'using' ) )
            // InternalMyAtlProject.g:3356:1: ( 'using' )
            {
            // InternalMyAtlProject.g:3356:1: ( 'using' )
            // InternalMyAtlProject.g:3357:2: 'using'
            {
             before(grammarAccess.getCalledRuleAccess().getUsingKeyword_5_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getCalledRuleAccess().getUsingKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_5__0__Impl"


    // $ANTLR start "rule__CalledRule__Group_5__1"
    // InternalMyAtlProject.g:3366:1: rule__CalledRule__Group_5__1 : rule__CalledRule__Group_5__1__Impl rule__CalledRule__Group_5__2 ;
    public final void rule__CalledRule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3370:1: ( rule__CalledRule__Group_5__1__Impl rule__CalledRule__Group_5__2 )
            // InternalMyAtlProject.g:3371:2: rule__CalledRule__Group_5__1__Impl rule__CalledRule__Group_5__2
            {
            pushFollow(FOLLOW_17);
            rule__CalledRule__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalledRule__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_5__1"


    // $ANTLR start "rule__CalledRule__Group_5__1__Impl"
    // InternalMyAtlProject.g:3378:1: rule__CalledRule__Group_5__1__Impl : ( '{' ) ;
    public final void rule__CalledRule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3382:1: ( ( '{' ) )
            // InternalMyAtlProject.g:3383:1: ( '{' )
            {
            // InternalMyAtlProject.g:3383:1: ( '{' )
            // InternalMyAtlProject.g:3384:2: '{'
            {
             before(grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_5__1__Impl"


    // $ANTLR start "rule__CalledRule__Group_5__2"
    // InternalMyAtlProject.g:3393:1: rule__CalledRule__Group_5__2 : rule__CalledRule__Group_5__2__Impl rule__CalledRule__Group_5__3 ;
    public final void rule__CalledRule__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3397:1: ( rule__CalledRule__Group_5__2__Impl rule__CalledRule__Group_5__3 )
            // InternalMyAtlProject.g:3398:2: rule__CalledRule__Group_5__2__Impl rule__CalledRule__Group_5__3
            {
            pushFollow(FOLLOW_17);
            rule__CalledRule__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalledRule__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_5__2"


    // $ANTLR start "rule__CalledRule__Group_5__2__Impl"
    // InternalMyAtlProject.g:3405:1: rule__CalledRule__Group_5__2__Impl : ( ( rule__CalledRule__VariablesAssignment_5_2 )* ) ;
    public final void rule__CalledRule__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3409:1: ( ( ( rule__CalledRule__VariablesAssignment_5_2 )* ) )
            // InternalMyAtlProject.g:3410:1: ( ( rule__CalledRule__VariablesAssignment_5_2 )* )
            {
            // InternalMyAtlProject.g:3410:1: ( ( rule__CalledRule__VariablesAssignment_5_2 )* )
            // InternalMyAtlProject.g:3411:2: ( rule__CalledRule__VariablesAssignment_5_2 )*
            {
             before(grammarAccess.getCalledRuleAccess().getVariablesAssignment_5_2()); 
            // InternalMyAtlProject.g:3412:2: ( rule__CalledRule__VariablesAssignment_5_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_SIMPLE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyAtlProject.g:3412:3: rule__CalledRule__VariablesAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__CalledRule__VariablesAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getCalledRuleAccess().getVariablesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_5__2__Impl"


    // $ANTLR start "rule__CalledRule__Group_5__3"
    // InternalMyAtlProject.g:3420:1: rule__CalledRule__Group_5__3 : rule__CalledRule__Group_5__3__Impl ;
    public final void rule__CalledRule__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3424:1: ( rule__CalledRule__Group_5__3__Impl )
            // InternalMyAtlProject.g:3425:2: rule__CalledRule__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CalledRule__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_5__3"


    // $ANTLR start "rule__CalledRule__Group_5__3__Impl"
    // InternalMyAtlProject.g:3431:1: rule__CalledRule__Group_5__3__Impl : ( '}' ) ;
    public final void rule__CalledRule__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3435:1: ( ( '}' ) )
            // InternalMyAtlProject.g:3436:1: ( '}' )
            {
            // InternalMyAtlProject.g:3436:1: ( '}' )
            // InternalMyAtlProject.g:3437:2: '}'
            {
             before(grammarAccess.getCalledRuleAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCalledRuleAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_5__3__Impl"


    // $ANTLR start "rule__CalledRule__Group_8__0"
    // InternalMyAtlProject.g:3447:1: rule__CalledRule__Group_8__0 : rule__CalledRule__Group_8__0__Impl rule__CalledRule__Group_8__1 ;
    public final void rule__CalledRule__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3451:1: ( rule__CalledRule__Group_8__0__Impl rule__CalledRule__Group_8__1 )
            // InternalMyAtlProject.g:3452:2: rule__CalledRule__Group_8__0__Impl rule__CalledRule__Group_8__1
            {
            pushFollow(FOLLOW_13);
            rule__CalledRule__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalledRule__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_8__0"


    // $ANTLR start "rule__CalledRule__Group_8__0__Impl"
    // InternalMyAtlProject.g:3459:1: rule__CalledRule__Group_8__0__Impl : ( 'do' ) ;
    public final void rule__CalledRule__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3463:1: ( ( 'do' ) )
            // InternalMyAtlProject.g:3464:1: ( 'do' )
            {
            // InternalMyAtlProject.g:3464:1: ( 'do' )
            // InternalMyAtlProject.g:3465:2: 'do'
            {
             before(grammarAccess.getCalledRuleAccess().getDoKeyword_8_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getCalledRuleAccess().getDoKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_8__0__Impl"


    // $ANTLR start "rule__CalledRule__Group_8__1"
    // InternalMyAtlProject.g:3474:1: rule__CalledRule__Group_8__1 : rule__CalledRule__Group_8__1__Impl rule__CalledRule__Group_8__2 ;
    public final void rule__CalledRule__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3478:1: ( rule__CalledRule__Group_8__1__Impl rule__CalledRule__Group_8__2 )
            // InternalMyAtlProject.g:3479:2: rule__CalledRule__Group_8__1__Impl rule__CalledRule__Group_8__2
            {
            pushFollow(FOLLOW_4);
            rule__CalledRule__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalledRule__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_8__1"


    // $ANTLR start "rule__CalledRule__Group_8__1__Impl"
    // InternalMyAtlProject.g:3486:1: rule__CalledRule__Group_8__1__Impl : ( '{' ) ;
    public final void rule__CalledRule__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3490:1: ( ( '{' ) )
            // InternalMyAtlProject.g:3491:1: ( '{' )
            {
            // InternalMyAtlProject.g:3491:1: ( '{' )
            // InternalMyAtlProject.g:3492:2: '{'
            {
             before(grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_8__1__Impl"


    // $ANTLR start "rule__CalledRule__Group_8__2"
    // InternalMyAtlProject.g:3501:1: rule__CalledRule__Group_8__2 : rule__CalledRule__Group_8__2__Impl rule__CalledRule__Group_8__3 ;
    public final void rule__CalledRule__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3505:1: ( rule__CalledRule__Group_8__2__Impl rule__CalledRule__Group_8__3 )
            // InternalMyAtlProject.g:3506:2: rule__CalledRule__Group_8__2__Impl rule__CalledRule__Group_8__3
            {
            pushFollow(FOLLOW_18);
            rule__CalledRule__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalledRule__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_8__2"


    // $ANTLR start "rule__CalledRule__Group_8__2__Impl"
    // InternalMyAtlProject.g:3513:1: rule__CalledRule__Group_8__2__Impl : ( ( rule__CalledRule__ActionBlockAssignment_8_2 ) ) ;
    public final void rule__CalledRule__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3517:1: ( ( ( rule__CalledRule__ActionBlockAssignment_8_2 ) ) )
            // InternalMyAtlProject.g:3518:1: ( ( rule__CalledRule__ActionBlockAssignment_8_2 ) )
            {
            // InternalMyAtlProject.g:3518:1: ( ( rule__CalledRule__ActionBlockAssignment_8_2 ) )
            // InternalMyAtlProject.g:3519:2: ( rule__CalledRule__ActionBlockAssignment_8_2 )
            {
             before(grammarAccess.getCalledRuleAccess().getActionBlockAssignment_8_2()); 
            // InternalMyAtlProject.g:3520:2: ( rule__CalledRule__ActionBlockAssignment_8_2 )
            // InternalMyAtlProject.g:3520:3: rule__CalledRule__ActionBlockAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__CalledRule__ActionBlockAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getCalledRuleAccess().getActionBlockAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_8__2__Impl"


    // $ANTLR start "rule__CalledRule__Group_8__3"
    // InternalMyAtlProject.g:3528:1: rule__CalledRule__Group_8__3 : rule__CalledRule__Group_8__3__Impl ;
    public final void rule__CalledRule__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3532:1: ( rule__CalledRule__Group_8__3__Impl )
            // InternalMyAtlProject.g:3533:2: rule__CalledRule__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CalledRule__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_8__3"


    // $ANTLR start "rule__CalledRule__Group_8__3__Impl"
    // InternalMyAtlProject.g:3539:1: rule__CalledRule__Group_8__3__Impl : ( '}' ) ;
    public final void rule__CalledRule__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3543:1: ( ( '}' ) )
            // InternalMyAtlProject.g:3544:1: ( '}' )
            {
            // InternalMyAtlProject.g:3544:1: ( '}' )
            // InternalMyAtlProject.g:3545:2: '}'
            {
             before(grammarAccess.getCalledRuleAccess().getRightCurlyBracketKeyword_8_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCalledRuleAccess().getRightCurlyBracketKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__Group_8__3__Impl"


    // $ANTLR start "rule__Helper__Group__0"
    // InternalMyAtlProject.g:3555:1: rule__Helper__Group__0 : rule__Helper__Group__0__Impl rule__Helper__Group__1 ;
    public final void rule__Helper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3559:1: ( rule__Helper__Group__0__Impl rule__Helper__Group__1 )
            // InternalMyAtlProject.g:3560:2: rule__Helper__Group__0__Impl rule__Helper__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Helper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Helper__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Helper__Group__0"


    // $ANTLR start "rule__Helper__Group__0__Impl"
    // InternalMyAtlProject.g:3567:1: rule__Helper__Group__0__Impl : ( 'helper' ) ;
    public final void rule__Helper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3571:1: ( ( 'helper' ) )
            // InternalMyAtlProject.g:3572:1: ( 'helper' )
            {
            // InternalMyAtlProject.g:3572:1: ( 'helper' )
            // InternalMyAtlProject.g:3573:2: 'helper'
            {
             before(grammarAccess.getHelperAccess().getHelperKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getHelperAccess().getHelperKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Helper__Group__0__Impl"


    // $ANTLR start "rule__Helper__Group__1"
    // InternalMyAtlProject.g:3582:1: rule__Helper__Group__1 : rule__Helper__Group__1__Impl ;
    public final void rule__Helper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3586:1: ( rule__Helper__Group__1__Impl )
            // InternalMyAtlProject.g:3587:2: rule__Helper__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Helper__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Helper__Group__1"


    // $ANTLR start "rule__Helper__Group__1__Impl"
    // InternalMyAtlProject.g:3593:1: rule__Helper__Group__1__Impl : ( ( 'context' )? ) ;
    public final void rule__Helper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3597:1: ( ( ( 'context' )? ) )
            // InternalMyAtlProject.g:3598:1: ( ( 'context' )? )
            {
            // InternalMyAtlProject.g:3598:1: ( ( 'context' )? )
            // InternalMyAtlProject.g:3599:2: ( 'context' )?
            {
             before(grammarAccess.getHelperAccess().getContextKeyword_1()); 
            // InternalMyAtlProject.g:3600:2: ( 'context' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==62) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyAtlProject.g:3600:3: 'context'
                    {
                    match(input,62,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHelperAccess().getContextKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Helper__Group__1__Impl"


    // $ANTLR start "rule__RuleVariableDeclaration__Group__0"
    // InternalMyAtlProject.g:3609:1: rule__RuleVariableDeclaration__Group__0 : rule__RuleVariableDeclaration__Group__0__Impl rule__RuleVariableDeclaration__Group__1 ;
    public final void rule__RuleVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3613:1: ( rule__RuleVariableDeclaration__Group__0__Impl rule__RuleVariableDeclaration__Group__1 )
            // InternalMyAtlProject.g:3614:2: rule__RuleVariableDeclaration__Group__0__Impl rule__RuleVariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RuleVariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleVariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVariableDeclaration__Group__0"


    // $ANTLR start "rule__RuleVariableDeclaration__Group__0__Impl"
    // InternalMyAtlProject.g:3621:1: rule__RuleVariableDeclaration__Group__0__Impl : ( ( rule__RuleVariableDeclaration__VarNameAssignment_0 ) ) ;
    public final void rule__RuleVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3625:1: ( ( ( rule__RuleVariableDeclaration__VarNameAssignment_0 ) ) )
            // InternalMyAtlProject.g:3626:1: ( ( rule__RuleVariableDeclaration__VarNameAssignment_0 ) )
            {
            // InternalMyAtlProject.g:3626:1: ( ( rule__RuleVariableDeclaration__VarNameAssignment_0 ) )
            // InternalMyAtlProject.g:3627:2: ( rule__RuleVariableDeclaration__VarNameAssignment_0 )
            {
             before(grammarAccess.getRuleVariableDeclarationAccess().getVarNameAssignment_0()); 
            // InternalMyAtlProject.g:3628:2: ( rule__RuleVariableDeclaration__VarNameAssignment_0 )
            // InternalMyAtlProject.g:3628:3: rule__RuleVariableDeclaration__VarNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RuleVariableDeclaration__VarNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleVariableDeclarationAccess().getVarNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__RuleVariableDeclaration__Group__1"
    // InternalMyAtlProject.g:3636:1: rule__RuleVariableDeclaration__Group__1 : rule__RuleVariableDeclaration__Group__1__Impl rule__RuleVariableDeclaration__Group__2 ;
    public final void rule__RuleVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3640:1: ( rule__RuleVariableDeclaration__Group__1__Impl rule__RuleVariableDeclaration__Group__2 )
            // InternalMyAtlProject.g:3641:2: rule__RuleVariableDeclaration__Group__1__Impl rule__RuleVariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__RuleVariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleVariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVariableDeclaration__Group__1"


    // $ANTLR start "rule__RuleVariableDeclaration__Group__1__Impl"
    // InternalMyAtlProject.g:3648:1: rule__RuleVariableDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__RuleVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3652:1: ( ( ':' ) )
            // InternalMyAtlProject.g:3653:1: ( ':' )
            {
            // InternalMyAtlProject.g:3653:1: ( ':' )
            // InternalMyAtlProject.g:3654:2: ':'
            {
             before(grammarAccess.getRuleVariableDeclarationAccess().getColonKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRuleVariableDeclarationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__RuleVariableDeclaration__Group__2"
    // InternalMyAtlProject.g:3663:1: rule__RuleVariableDeclaration__Group__2 : rule__RuleVariableDeclaration__Group__2__Impl ;
    public final void rule__RuleVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3667:1: ( rule__RuleVariableDeclaration__Group__2__Impl )
            // InternalMyAtlProject.g:3668:2: rule__RuleVariableDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleVariableDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVariableDeclaration__Group__2"


    // $ANTLR start "rule__RuleVariableDeclaration__Group__2__Impl"
    // InternalMyAtlProject.g:3674:1: rule__RuleVariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__RuleVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3678:1: ( ( '=' ) )
            // InternalMyAtlProject.g:3679:1: ( '=' )
            {
            // InternalMyAtlProject.g:3679:1: ( '=' )
            // InternalMyAtlProject.g:3680:2: '='
            {
             before(grammarAccess.getRuleVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleVariableDeclarationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__InPattern__Group__0"
    // InternalMyAtlProject.g:3690:1: rule__InPattern__Group__0 : rule__InPattern__Group__0__Impl rule__InPattern__Group__1 ;
    public final void rule__InPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3694:1: ( rule__InPattern__Group__0__Impl rule__InPattern__Group__1 )
            // InternalMyAtlProject.g:3695:2: rule__InPattern__Group__0__Impl rule__InPattern__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__InPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPattern__Group__0"


    // $ANTLR start "rule__InPattern__Group__0__Impl"
    // InternalMyAtlProject.g:3702:1: rule__InPattern__Group__0__Impl : ( ( rule__InPattern__ElementsAssignment_0 ) ) ;
    public final void rule__InPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3706:1: ( ( ( rule__InPattern__ElementsAssignment_0 ) ) )
            // InternalMyAtlProject.g:3707:1: ( ( rule__InPattern__ElementsAssignment_0 ) )
            {
            // InternalMyAtlProject.g:3707:1: ( ( rule__InPattern__ElementsAssignment_0 ) )
            // InternalMyAtlProject.g:3708:2: ( rule__InPattern__ElementsAssignment_0 )
            {
             before(grammarAccess.getInPatternAccess().getElementsAssignment_0()); 
            // InternalMyAtlProject.g:3709:2: ( rule__InPattern__ElementsAssignment_0 )
            // InternalMyAtlProject.g:3709:3: rule__InPattern__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InPattern__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInPatternAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPattern__Group__0__Impl"


    // $ANTLR start "rule__InPattern__Group__1"
    // InternalMyAtlProject.g:3717:1: rule__InPattern__Group__1 : rule__InPattern__Group__1__Impl ;
    public final void rule__InPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3721:1: ( rule__InPattern__Group__1__Impl )
            // InternalMyAtlProject.g:3722:2: rule__InPattern__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InPattern__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPattern__Group__1"


    // $ANTLR start "rule__InPattern__Group__1__Impl"
    // InternalMyAtlProject.g:3728:1: rule__InPattern__Group__1__Impl : ( ( rule__InPattern__Group_1__0 )? ) ;
    public final void rule__InPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3732:1: ( ( ( rule__InPattern__Group_1__0 )? ) )
            // InternalMyAtlProject.g:3733:1: ( ( rule__InPattern__Group_1__0 )? )
            {
            // InternalMyAtlProject.g:3733:1: ( ( rule__InPattern__Group_1__0 )? )
            // InternalMyAtlProject.g:3734:2: ( rule__InPattern__Group_1__0 )?
            {
             before(grammarAccess.getInPatternAccess().getGroup_1()); 
            // InternalMyAtlProject.g:3735:2: ( rule__InPattern__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==59) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyAtlProject.g:3735:3: rule__InPattern__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InPattern__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInPatternAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPattern__Group__1__Impl"


    // $ANTLR start "rule__InPattern__Group_1__0"
    // InternalMyAtlProject.g:3744:1: rule__InPattern__Group_1__0 : rule__InPattern__Group_1__0__Impl rule__InPattern__Group_1__1 ;
    public final void rule__InPattern__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3748:1: ( rule__InPattern__Group_1__0__Impl rule__InPattern__Group_1__1 )
            // InternalMyAtlProject.g:3749:2: rule__InPattern__Group_1__0__Impl rule__InPattern__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__InPattern__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InPattern__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPattern__Group_1__0"


    // $ANTLR start "rule__InPattern__Group_1__0__Impl"
    // InternalMyAtlProject.g:3756:1: rule__InPattern__Group_1__0__Impl : ( '(' ) ;
    public final void rule__InPattern__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3760:1: ( ( '(' ) )
            // InternalMyAtlProject.g:3761:1: ( '(' )
            {
            // InternalMyAtlProject.g:3761:1: ( '(' )
            // InternalMyAtlProject.g:3762:2: '('
            {
             before(grammarAccess.getInPatternAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getInPatternAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPattern__Group_1__0__Impl"


    // $ANTLR start "rule__InPattern__Group_1__1"
    // InternalMyAtlProject.g:3771:1: rule__InPattern__Group_1__1 : rule__InPattern__Group_1__1__Impl ;
    public final void rule__InPattern__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3775:1: ( rule__InPattern__Group_1__1__Impl )
            // InternalMyAtlProject.g:3776:2: rule__InPattern__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InPattern__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPattern__Group_1__1"


    // $ANTLR start "rule__InPattern__Group_1__1__Impl"
    // InternalMyAtlProject.g:3782:1: rule__InPattern__Group_1__1__Impl : ( ')' ) ;
    public final void rule__InPattern__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3786:1: ( ( ')' ) )
            // InternalMyAtlProject.g:3787:1: ( ')' )
            {
            // InternalMyAtlProject.g:3787:1: ( ')' )
            // InternalMyAtlProject.g:3788:2: ')'
            {
             before(grammarAccess.getInPatternAccess().getRightParenthesisKeyword_1_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getInPatternAccess().getRightParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPattern__Group_1__1__Impl"


    // $ANTLR start "rule__InPatternElement__Group__0"
    // InternalMyAtlProject.g:3798:1: rule__InPatternElement__Group__0 : rule__InPatternElement__Group__0__Impl rule__InPatternElement__Group__1 ;
    public final void rule__InPatternElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3802:1: ( rule__InPatternElement__Group__0__Impl rule__InPatternElement__Group__1 )
            // InternalMyAtlProject.g:3803:2: rule__InPatternElement__Group__0__Impl rule__InPatternElement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__InPatternElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InPatternElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPatternElement__Group__0"


    // $ANTLR start "rule__InPatternElement__Group__0__Impl"
    // InternalMyAtlProject.g:3810:1: rule__InPatternElement__Group__0__Impl : ( ( rule__InPatternElement__VarNameAssignment_0 ) ) ;
    public final void rule__InPatternElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3814:1: ( ( ( rule__InPatternElement__VarNameAssignment_0 ) ) )
            // InternalMyAtlProject.g:3815:1: ( ( rule__InPatternElement__VarNameAssignment_0 ) )
            {
            // InternalMyAtlProject.g:3815:1: ( ( rule__InPatternElement__VarNameAssignment_0 ) )
            // InternalMyAtlProject.g:3816:2: ( rule__InPatternElement__VarNameAssignment_0 )
            {
             before(grammarAccess.getInPatternElementAccess().getVarNameAssignment_0()); 
            // InternalMyAtlProject.g:3817:2: ( rule__InPatternElement__VarNameAssignment_0 )
            // InternalMyAtlProject.g:3817:3: rule__InPatternElement__VarNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InPatternElement__VarNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInPatternElementAccess().getVarNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPatternElement__Group__0__Impl"


    // $ANTLR start "rule__InPatternElement__Group__1"
    // InternalMyAtlProject.g:3825:1: rule__InPatternElement__Group__1 : rule__InPatternElement__Group__1__Impl ;
    public final void rule__InPatternElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3829:1: ( rule__InPatternElement__Group__1__Impl )
            // InternalMyAtlProject.g:3830:2: rule__InPatternElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InPatternElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPatternElement__Group__1"


    // $ANTLR start "rule__InPatternElement__Group__1__Impl"
    // InternalMyAtlProject.g:3836:1: rule__InPatternElement__Group__1__Impl : ( ':' ) ;
    public final void rule__InPatternElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3840:1: ( ( ':' ) )
            // InternalMyAtlProject.g:3841:1: ( ':' )
            {
            // InternalMyAtlProject.g:3841:1: ( ':' )
            // InternalMyAtlProject.g:3842:2: ':'
            {
             before(grammarAccess.getInPatternElementAccess().getColonKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getInPatternElementAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPatternElement__Group__1__Impl"


    // $ANTLR start "rule__OutPattern__Group__0"
    // InternalMyAtlProject.g:3852:1: rule__OutPattern__Group__0 : rule__OutPattern__Group__0__Impl rule__OutPattern__Group__1 ;
    public final void rule__OutPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3856:1: ( rule__OutPattern__Group__0__Impl rule__OutPattern__Group__1 )
            // InternalMyAtlProject.g:3857:2: rule__OutPattern__Group__0__Impl rule__OutPattern__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__OutPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPattern__Group__0"


    // $ANTLR start "rule__OutPattern__Group__0__Impl"
    // InternalMyAtlProject.g:3864:1: rule__OutPattern__Group__0__Impl : ( ( rule__OutPattern__ElementsAssignment_0 ) ) ;
    public final void rule__OutPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3868:1: ( ( ( rule__OutPattern__ElementsAssignment_0 ) ) )
            // InternalMyAtlProject.g:3869:1: ( ( rule__OutPattern__ElementsAssignment_0 ) )
            {
            // InternalMyAtlProject.g:3869:1: ( ( rule__OutPattern__ElementsAssignment_0 ) )
            // InternalMyAtlProject.g:3870:2: ( rule__OutPattern__ElementsAssignment_0 )
            {
             before(grammarAccess.getOutPatternAccess().getElementsAssignment_0()); 
            // InternalMyAtlProject.g:3871:2: ( rule__OutPattern__ElementsAssignment_0 )
            // InternalMyAtlProject.g:3871:3: rule__OutPattern__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OutPattern__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOutPatternAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPattern__Group__0__Impl"


    // $ANTLR start "rule__OutPattern__Group__1"
    // InternalMyAtlProject.g:3879:1: rule__OutPattern__Group__1 : rule__OutPattern__Group__1__Impl ;
    public final void rule__OutPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3883:1: ( rule__OutPattern__Group__1__Impl )
            // InternalMyAtlProject.g:3884:2: rule__OutPattern__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutPattern__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPattern__Group__1"


    // $ANTLR start "rule__OutPattern__Group__1__Impl"
    // InternalMyAtlProject.g:3890:1: rule__OutPattern__Group__1__Impl : ( ( rule__OutPattern__Group_1__0 )* ) ;
    public final void rule__OutPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3894:1: ( ( ( rule__OutPattern__Group_1__0 )* ) )
            // InternalMyAtlProject.g:3895:1: ( ( rule__OutPattern__Group_1__0 )* )
            {
            // InternalMyAtlProject.g:3895:1: ( ( rule__OutPattern__Group_1__0 )* )
            // InternalMyAtlProject.g:3896:2: ( rule__OutPattern__Group_1__0 )*
            {
             before(grammarAccess.getOutPatternAccess().getGroup_1()); 
            // InternalMyAtlProject.g:3897:2: ( rule__OutPattern__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==63) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyAtlProject.g:3897:3: rule__OutPattern__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__OutPattern__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getOutPatternAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPattern__Group__1__Impl"


    // $ANTLR start "rule__OutPattern__Group_1__0"
    // InternalMyAtlProject.g:3906:1: rule__OutPattern__Group_1__0 : rule__OutPattern__Group_1__0__Impl rule__OutPattern__Group_1__1 ;
    public final void rule__OutPattern__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3910:1: ( rule__OutPattern__Group_1__0__Impl rule__OutPattern__Group_1__1 )
            // InternalMyAtlProject.g:3911:2: rule__OutPattern__Group_1__0__Impl rule__OutPattern__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__OutPattern__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutPattern__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPattern__Group_1__0"


    // $ANTLR start "rule__OutPattern__Group_1__0__Impl"
    // InternalMyAtlProject.g:3918:1: rule__OutPattern__Group_1__0__Impl : ( ',' ) ;
    public final void rule__OutPattern__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3922:1: ( ( ',' ) )
            // InternalMyAtlProject.g:3923:1: ( ',' )
            {
            // InternalMyAtlProject.g:3923:1: ( ',' )
            // InternalMyAtlProject.g:3924:2: ','
            {
             before(grammarAccess.getOutPatternAccess().getCommaKeyword_1_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getOutPatternAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPattern__Group_1__0__Impl"


    // $ANTLR start "rule__OutPattern__Group_1__1"
    // InternalMyAtlProject.g:3933:1: rule__OutPattern__Group_1__1 : rule__OutPattern__Group_1__1__Impl ;
    public final void rule__OutPattern__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3937:1: ( rule__OutPattern__Group_1__1__Impl )
            // InternalMyAtlProject.g:3938:2: rule__OutPattern__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutPattern__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPattern__Group_1__1"


    // $ANTLR start "rule__OutPattern__Group_1__1__Impl"
    // InternalMyAtlProject.g:3944:1: rule__OutPattern__Group_1__1__Impl : ( ( rule__OutPattern__ElementsAssignment_1_1 ) ) ;
    public final void rule__OutPattern__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3948:1: ( ( ( rule__OutPattern__ElementsAssignment_1_1 ) ) )
            // InternalMyAtlProject.g:3949:1: ( ( rule__OutPattern__ElementsAssignment_1_1 ) )
            {
            // InternalMyAtlProject.g:3949:1: ( ( rule__OutPattern__ElementsAssignment_1_1 ) )
            // InternalMyAtlProject.g:3950:2: ( rule__OutPattern__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getOutPatternAccess().getElementsAssignment_1_1()); 
            // InternalMyAtlProject.g:3951:2: ( rule__OutPattern__ElementsAssignment_1_1 )
            // InternalMyAtlProject.g:3951:3: rule__OutPattern__ElementsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OutPattern__ElementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOutPatternAccess().getElementsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPattern__Group_1__1__Impl"


    // $ANTLR start "rule__SimpleOutPatternElement__Group__0"
    // InternalMyAtlProject.g:3960:1: rule__SimpleOutPatternElement__Group__0 : rule__SimpleOutPatternElement__Group__0__Impl rule__SimpleOutPatternElement__Group__1 ;
    public final void rule__SimpleOutPatternElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3964:1: ( rule__SimpleOutPatternElement__Group__0__Impl rule__SimpleOutPatternElement__Group__1 )
            // InternalMyAtlProject.g:3965:2: rule__SimpleOutPatternElement__Group__0__Impl rule__SimpleOutPatternElement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SimpleOutPatternElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleOutPatternElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group__0"


    // $ANTLR start "rule__SimpleOutPatternElement__Group__0__Impl"
    // InternalMyAtlProject.g:3972:1: rule__SimpleOutPatternElement__Group__0__Impl : ( ( rule__SimpleOutPatternElement__VarNameAssignment_0 ) ) ;
    public final void rule__SimpleOutPatternElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3976:1: ( ( ( rule__SimpleOutPatternElement__VarNameAssignment_0 ) ) )
            // InternalMyAtlProject.g:3977:1: ( ( rule__SimpleOutPatternElement__VarNameAssignment_0 ) )
            {
            // InternalMyAtlProject.g:3977:1: ( ( rule__SimpleOutPatternElement__VarNameAssignment_0 ) )
            // InternalMyAtlProject.g:3978:2: ( rule__SimpleOutPatternElement__VarNameAssignment_0 )
            {
             before(grammarAccess.getSimpleOutPatternElementAccess().getVarNameAssignment_0()); 
            // InternalMyAtlProject.g:3979:2: ( rule__SimpleOutPatternElement__VarNameAssignment_0 )
            // InternalMyAtlProject.g:3979:3: rule__SimpleOutPatternElement__VarNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleOutPatternElement__VarNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleOutPatternElementAccess().getVarNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group__0__Impl"


    // $ANTLR start "rule__SimpleOutPatternElement__Group__1"
    // InternalMyAtlProject.g:3987:1: rule__SimpleOutPatternElement__Group__1 : rule__SimpleOutPatternElement__Group__1__Impl rule__SimpleOutPatternElement__Group__2 ;
    public final void rule__SimpleOutPatternElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:3991:1: ( rule__SimpleOutPatternElement__Group__1__Impl rule__SimpleOutPatternElement__Group__2 )
            // InternalMyAtlProject.g:3992:2: rule__SimpleOutPatternElement__Group__1__Impl rule__SimpleOutPatternElement__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__SimpleOutPatternElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleOutPatternElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group__1"


    // $ANTLR start "rule__SimpleOutPatternElement__Group__1__Impl"
    // InternalMyAtlProject.g:3999:1: rule__SimpleOutPatternElement__Group__1__Impl : ( ':' ) ;
    public final void rule__SimpleOutPatternElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4003:1: ( ( ':' ) )
            // InternalMyAtlProject.g:4004:1: ( ':' )
            {
            // InternalMyAtlProject.g:4004:1: ( ':' )
            // InternalMyAtlProject.g:4005:2: ':'
            {
             before(grammarAccess.getSimpleOutPatternElementAccess().getColonKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSimpleOutPatternElementAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group__1__Impl"


    // $ANTLR start "rule__SimpleOutPatternElement__Group__2"
    // InternalMyAtlProject.g:4014:1: rule__SimpleOutPatternElement__Group__2 : rule__SimpleOutPatternElement__Group__2__Impl ;
    public final void rule__SimpleOutPatternElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4018:1: ( rule__SimpleOutPatternElement__Group__2__Impl )
            // InternalMyAtlProject.g:4019:2: rule__SimpleOutPatternElement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleOutPatternElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group__2"


    // $ANTLR start "rule__SimpleOutPatternElement__Group__2__Impl"
    // InternalMyAtlProject.g:4025:1: rule__SimpleOutPatternElement__Group__2__Impl : ( ( rule__SimpleOutPatternElement__Group_2__0 )? ) ;
    public final void rule__SimpleOutPatternElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4029:1: ( ( ( rule__SimpleOutPatternElement__Group_2__0 )? ) )
            // InternalMyAtlProject.g:4030:1: ( ( rule__SimpleOutPatternElement__Group_2__0 )? )
            {
            // InternalMyAtlProject.g:4030:1: ( ( rule__SimpleOutPatternElement__Group_2__0 )? )
            // InternalMyAtlProject.g:4031:2: ( rule__SimpleOutPatternElement__Group_2__0 )?
            {
             before(grammarAccess.getSimpleOutPatternElementAccess().getGroup_2()); 
            // InternalMyAtlProject.g:4032:2: ( rule__SimpleOutPatternElement__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==59) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyAtlProject.g:4032:3: rule__SimpleOutPatternElement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleOutPatternElement__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleOutPatternElementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group__2__Impl"


    // $ANTLR start "rule__SimpleOutPatternElement__Group_2__0"
    // InternalMyAtlProject.g:4041:1: rule__SimpleOutPatternElement__Group_2__0 : rule__SimpleOutPatternElement__Group_2__0__Impl rule__SimpleOutPatternElement__Group_2__1 ;
    public final void rule__SimpleOutPatternElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4045:1: ( rule__SimpleOutPatternElement__Group_2__0__Impl rule__SimpleOutPatternElement__Group_2__1 )
            // InternalMyAtlProject.g:4046:2: rule__SimpleOutPatternElement__Group_2__0__Impl rule__SimpleOutPatternElement__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__SimpleOutPatternElement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleOutPatternElement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group_2__0"


    // $ANTLR start "rule__SimpleOutPatternElement__Group_2__0__Impl"
    // InternalMyAtlProject.g:4053:1: rule__SimpleOutPatternElement__Group_2__0__Impl : ( '(' ) ;
    public final void rule__SimpleOutPatternElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4057:1: ( ( '(' ) )
            // InternalMyAtlProject.g:4058:1: ( '(' )
            {
            // InternalMyAtlProject.g:4058:1: ( '(' )
            // InternalMyAtlProject.g:4059:2: '('
            {
             before(grammarAccess.getSimpleOutPatternElementAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getSimpleOutPatternElementAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group_2__0__Impl"


    // $ANTLR start "rule__SimpleOutPatternElement__Group_2__1"
    // InternalMyAtlProject.g:4068:1: rule__SimpleOutPatternElement__Group_2__1 : rule__SimpleOutPatternElement__Group_2__1__Impl rule__SimpleOutPatternElement__Group_2__2 ;
    public final void rule__SimpleOutPatternElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4072:1: ( rule__SimpleOutPatternElement__Group_2__1__Impl rule__SimpleOutPatternElement__Group_2__2 )
            // InternalMyAtlProject.g:4073:2: rule__SimpleOutPatternElement__Group_2__1__Impl rule__SimpleOutPatternElement__Group_2__2
            {
            pushFollow(FOLLOW_26);
            rule__SimpleOutPatternElement__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleOutPatternElement__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group_2__1"


    // $ANTLR start "rule__SimpleOutPatternElement__Group_2__1__Impl"
    // InternalMyAtlProject.g:4080:1: rule__SimpleOutPatternElement__Group_2__1__Impl : ( ( rule__SimpleOutPatternElement__Group_2_1__0 )? ) ;
    public final void rule__SimpleOutPatternElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4084:1: ( ( ( rule__SimpleOutPatternElement__Group_2_1__0 )? ) )
            // InternalMyAtlProject.g:4085:1: ( ( rule__SimpleOutPatternElement__Group_2_1__0 )? )
            {
            // InternalMyAtlProject.g:4085:1: ( ( rule__SimpleOutPatternElement__Group_2_1__0 )? )
            // InternalMyAtlProject.g:4086:2: ( rule__SimpleOutPatternElement__Group_2_1__0 )?
            {
             before(grammarAccess.getSimpleOutPatternElementAccess().getGroup_2_1()); 
            // InternalMyAtlProject.g:4087:2: ( rule__SimpleOutPatternElement__Group_2_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_SIMPLE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyAtlProject.g:4087:3: rule__SimpleOutPatternElement__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleOutPatternElement__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleOutPatternElementAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group_2__1__Impl"


    // $ANTLR start "rule__SimpleOutPatternElement__Group_2__2"
    // InternalMyAtlProject.g:4095:1: rule__SimpleOutPatternElement__Group_2__2 : rule__SimpleOutPatternElement__Group_2__2__Impl ;
    public final void rule__SimpleOutPatternElement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4099:1: ( rule__SimpleOutPatternElement__Group_2__2__Impl )
            // InternalMyAtlProject.g:4100:2: rule__SimpleOutPatternElement__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleOutPatternElement__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group_2__2"


    // $ANTLR start "rule__SimpleOutPatternElement__Group_2__2__Impl"
    // InternalMyAtlProject.g:4106:1: rule__SimpleOutPatternElement__Group_2__2__Impl : ( ')' ) ;
    public final void rule__SimpleOutPatternElement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4110:1: ( ( ')' ) )
            // InternalMyAtlProject.g:4111:1: ( ')' )
            {
            // InternalMyAtlProject.g:4111:1: ( ')' )
            // InternalMyAtlProject.g:4112:2: ')'
            {
             before(grammarAccess.getSimpleOutPatternElementAccess().getRightParenthesisKeyword_2_2()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getSimpleOutPatternElementAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group_2__2__Impl"


    // $ANTLR start "rule__SimpleOutPatternElement__Group_2_1__0"
    // InternalMyAtlProject.g:4122:1: rule__SimpleOutPatternElement__Group_2_1__0 : rule__SimpleOutPatternElement__Group_2_1__0__Impl rule__SimpleOutPatternElement__Group_2_1__1 ;
    public final void rule__SimpleOutPatternElement__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4126:1: ( rule__SimpleOutPatternElement__Group_2_1__0__Impl rule__SimpleOutPatternElement__Group_2_1__1 )
            // InternalMyAtlProject.g:4127:2: rule__SimpleOutPatternElement__Group_2_1__0__Impl rule__SimpleOutPatternElement__Group_2_1__1
            {
            pushFollow(FOLLOW_24);
            rule__SimpleOutPatternElement__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleOutPatternElement__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group_2_1__0"


    // $ANTLR start "rule__SimpleOutPatternElement__Group_2_1__0__Impl"
    // InternalMyAtlProject.g:4134:1: rule__SimpleOutPatternElement__Group_2_1__0__Impl : ( ( rule__SimpleOutPatternElement__BindingsAssignment_2_1_0 ) ) ;
    public final void rule__SimpleOutPatternElement__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4138:1: ( ( ( rule__SimpleOutPatternElement__BindingsAssignment_2_1_0 ) ) )
            // InternalMyAtlProject.g:4139:1: ( ( rule__SimpleOutPatternElement__BindingsAssignment_2_1_0 ) )
            {
            // InternalMyAtlProject.g:4139:1: ( ( rule__SimpleOutPatternElement__BindingsAssignment_2_1_0 ) )
            // InternalMyAtlProject.g:4140:2: ( rule__SimpleOutPatternElement__BindingsAssignment_2_1_0 )
            {
             before(grammarAccess.getSimpleOutPatternElementAccess().getBindingsAssignment_2_1_0()); 
            // InternalMyAtlProject.g:4141:2: ( rule__SimpleOutPatternElement__BindingsAssignment_2_1_0 )
            // InternalMyAtlProject.g:4141:3: rule__SimpleOutPatternElement__BindingsAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleOutPatternElement__BindingsAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleOutPatternElementAccess().getBindingsAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group_2_1__0__Impl"


    // $ANTLR start "rule__SimpleOutPatternElement__Group_2_1__1"
    // InternalMyAtlProject.g:4149:1: rule__SimpleOutPatternElement__Group_2_1__1 : rule__SimpleOutPatternElement__Group_2_1__1__Impl ;
    public final void rule__SimpleOutPatternElement__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4153:1: ( rule__SimpleOutPatternElement__Group_2_1__1__Impl )
            // InternalMyAtlProject.g:4154:2: rule__SimpleOutPatternElement__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleOutPatternElement__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group_2_1__1"


    // $ANTLR start "rule__SimpleOutPatternElement__Group_2_1__1__Impl"
    // InternalMyAtlProject.g:4160:1: rule__SimpleOutPatternElement__Group_2_1__1__Impl : ( ( rule__SimpleOutPatternElement__Group_2_1_1__0 )* ) ;
    public final void rule__SimpleOutPatternElement__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4164:1: ( ( ( rule__SimpleOutPatternElement__Group_2_1_1__0 )* ) )
            // InternalMyAtlProject.g:4165:1: ( ( rule__SimpleOutPatternElement__Group_2_1_1__0 )* )
            {
            // InternalMyAtlProject.g:4165:1: ( ( rule__SimpleOutPatternElement__Group_2_1_1__0 )* )
            // InternalMyAtlProject.g:4166:2: ( rule__SimpleOutPatternElement__Group_2_1_1__0 )*
            {
             before(grammarAccess.getSimpleOutPatternElementAccess().getGroup_2_1_1()); 
            // InternalMyAtlProject.g:4167:2: ( rule__SimpleOutPatternElement__Group_2_1_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==63) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyAtlProject.g:4167:3: rule__SimpleOutPatternElement__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__SimpleOutPatternElement__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getSimpleOutPatternElementAccess().getGroup_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group_2_1__1__Impl"


    // $ANTLR start "rule__SimpleOutPatternElement__Group_2_1_1__0"
    // InternalMyAtlProject.g:4176:1: rule__SimpleOutPatternElement__Group_2_1_1__0 : rule__SimpleOutPatternElement__Group_2_1_1__0__Impl rule__SimpleOutPatternElement__Group_2_1_1__1 ;
    public final void rule__SimpleOutPatternElement__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4180:1: ( rule__SimpleOutPatternElement__Group_2_1_1__0__Impl rule__SimpleOutPatternElement__Group_2_1_1__1 )
            // InternalMyAtlProject.g:4181:2: rule__SimpleOutPatternElement__Group_2_1_1__0__Impl rule__SimpleOutPatternElement__Group_2_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__SimpleOutPatternElement__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleOutPatternElement__Group_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group_2_1_1__0"


    // $ANTLR start "rule__SimpleOutPatternElement__Group_2_1_1__0__Impl"
    // InternalMyAtlProject.g:4188:1: rule__SimpleOutPatternElement__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__SimpleOutPatternElement__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4192:1: ( ( ',' ) )
            // InternalMyAtlProject.g:4193:1: ( ',' )
            {
            // InternalMyAtlProject.g:4193:1: ( ',' )
            // InternalMyAtlProject.g:4194:2: ','
            {
             before(grammarAccess.getSimpleOutPatternElementAccess().getCommaKeyword_2_1_1_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getSimpleOutPatternElementAccess().getCommaKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__SimpleOutPatternElement__Group_2_1_1__1"
    // InternalMyAtlProject.g:4203:1: rule__SimpleOutPatternElement__Group_2_1_1__1 : rule__SimpleOutPatternElement__Group_2_1_1__1__Impl ;
    public final void rule__SimpleOutPatternElement__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4207:1: ( rule__SimpleOutPatternElement__Group_2_1_1__1__Impl )
            // InternalMyAtlProject.g:4208:2: rule__SimpleOutPatternElement__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleOutPatternElement__Group_2_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group_2_1_1__1"


    // $ANTLR start "rule__SimpleOutPatternElement__Group_2_1_1__1__Impl"
    // InternalMyAtlProject.g:4214:1: rule__SimpleOutPatternElement__Group_2_1_1__1__Impl : ( ( rule__SimpleOutPatternElement__BindingsAssignment_2_1_1_1 ) ) ;
    public final void rule__SimpleOutPatternElement__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4218:1: ( ( ( rule__SimpleOutPatternElement__BindingsAssignment_2_1_1_1 ) ) )
            // InternalMyAtlProject.g:4219:1: ( ( rule__SimpleOutPatternElement__BindingsAssignment_2_1_1_1 ) )
            {
            // InternalMyAtlProject.g:4219:1: ( ( rule__SimpleOutPatternElement__BindingsAssignment_2_1_1_1 ) )
            // InternalMyAtlProject.g:4220:2: ( rule__SimpleOutPatternElement__BindingsAssignment_2_1_1_1 )
            {
             before(grammarAccess.getSimpleOutPatternElementAccess().getBindingsAssignment_2_1_1_1()); 
            // InternalMyAtlProject.g:4221:2: ( rule__SimpleOutPatternElement__BindingsAssignment_2_1_1_1 )
            // InternalMyAtlProject.g:4221:3: rule__SimpleOutPatternElement__BindingsAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleOutPatternElement__BindingsAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleOutPatternElementAccess().getBindingsAssignment_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__ForEachOutPatternElement__Group__0"
    // InternalMyAtlProject.g:4230:1: rule__ForEachOutPatternElement__Group__0 : rule__ForEachOutPatternElement__Group__0__Impl rule__ForEachOutPatternElement__Group__1 ;
    public final void rule__ForEachOutPatternElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4234:1: ( rule__ForEachOutPatternElement__Group__0__Impl rule__ForEachOutPatternElement__Group__1 )
            // InternalMyAtlProject.g:4235:2: rule__ForEachOutPatternElement__Group__0__Impl rule__ForEachOutPatternElement__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ForEachOutPatternElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachOutPatternElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachOutPatternElement__Group__0"


    // $ANTLR start "rule__ForEachOutPatternElement__Group__0__Impl"
    // InternalMyAtlProject.g:4242:1: rule__ForEachOutPatternElement__Group__0__Impl : ( 'xxx' ) ;
    public final void rule__ForEachOutPatternElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4246:1: ( ( 'xxx' ) )
            // InternalMyAtlProject.g:4247:1: ( 'xxx' )
            {
            // InternalMyAtlProject.g:4247:1: ( 'xxx' )
            // InternalMyAtlProject.g:4248:2: 'xxx'
            {
             before(grammarAccess.getForEachOutPatternElementAccess().getXxxKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getForEachOutPatternElementAccess().getXxxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachOutPatternElement__Group__0__Impl"


    // $ANTLR start "rule__ForEachOutPatternElement__Group__1"
    // InternalMyAtlProject.g:4257:1: rule__ForEachOutPatternElement__Group__1 : rule__ForEachOutPatternElement__Group__1__Impl ;
    public final void rule__ForEachOutPatternElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4261:1: ( rule__ForEachOutPatternElement__Group__1__Impl )
            // InternalMyAtlProject.g:4262:2: rule__ForEachOutPatternElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEachOutPatternElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachOutPatternElement__Group__1"


    // $ANTLR start "rule__ForEachOutPatternElement__Group__1__Impl"
    // InternalMyAtlProject.g:4268:1: rule__ForEachOutPatternElement__Group__1__Impl : ( 'yyy' ) ;
    public final void rule__ForEachOutPatternElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4272:1: ( ( 'yyy' ) )
            // InternalMyAtlProject.g:4273:1: ( 'yyy' )
            {
            // InternalMyAtlProject.g:4273:1: ( 'yyy' )
            // InternalMyAtlProject.g:4274:2: 'yyy'
            {
             before(grammarAccess.getForEachOutPatternElementAccess().getYyyKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getForEachOutPatternElementAccess().getYyyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachOutPatternElement__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalMyAtlProject.g:4284:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4288:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalMyAtlProject.g:4289:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalMyAtlProject.g:4296:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__PropertyNameAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4300:1: ( ( ( rule__Binding__PropertyNameAssignment_0 ) ) )
            // InternalMyAtlProject.g:4301:1: ( ( rule__Binding__PropertyNameAssignment_0 ) )
            {
            // InternalMyAtlProject.g:4301:1: ( ( rule__Binding__PropertyNameAssignment_0 ) )
            // InternalMyAtlProject.g:4302:2: ( rule__Binding__PropertyNameAssignment_0 )
            {
             before(grammarAccess.getBindingAccess().getPropertyNameAssignment_0()); 
            // InternalMyAtlProject.g:4303:2: ( rule__Binding__PropertyNameAssignment_0 )
            // InternalMyAtlProject.g:4303:3: rule__Binding__PropertyNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__PropertyNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getPropertyNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // InternalMyAtlProject.g:4311:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4315:1: ( rule__Binding__Group__1__Impl )
            // InternalMyAtlProject.g:4316:2: rule__Binding__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalMyAtlProject.g:4322:1: rule__Binding__Group__1__Impl : ( '<-' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4326:1: ( ( '<-' ) )
            // InternalMyAtlProject.g:4327:1: ( '<-' )
            {
            // InternalMyAtlProject.g:4327:1: ( '<-' )
            // InternalMyAtlProject.g:4328:2: '<-'
            {
             before(grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__BindingStat__Group__0"
    // InternalMyAtlProject.g:4338:1: rule__BindingStat__Group__0 : rule__BindingStat__Group__0__Impl rule__BindingStat__Group__1 ;
    public final void rule__BindingStat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4342:1: ( rule__BindingStat__Group__0__Impl rule__BindingStat__Group__1 )
            // InternalMyAtlProject.g:4343:2: rule__BindingStat__Group__0__Impl rule__BindingStat__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__BindingStat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BindingStat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingStat__Group__0"


    // $ANTLR start "rule__BindingStat__Group__0__Impl"
    // InternalMyAtlProject.g:4350:1: rule__BindingStat__Group__0__Impl : ( ( rule__BindingStat__PropertyNameAssignment_0 ) ) ;
    public final void rule__BindingStat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4354:1: ( ( ( rule__BindingStat__PropertyNameAssignment_0 ) ) )
            // InternalMyAtlProject.g:4355:1: ( ( rule__BindingStat__PropertyNameAssignment_0 ) )
            {
            // InternalMyAtlProject.g:4355:1: ( ( rule__BindingStat__PropertyNameAssignment_0 ) )
            // InternalMyAtlProject.g:4356:2: ( rule__BindingStat__PropertyNameAssignment_0 )
            {
             before(grammarAccess.getBindingStatAccess().getPropertyNameAssignment_0()); 
            // InternalMyAtlProject.g:4357:2: ( rule__BindingStat__PropertyNameAssignment_0 )
            // InternalMyAtlProject.g:4357:3: rule__BindingStat__PropertyNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BindingStat__PropertyNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBindingStatAccess().getPropertyNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingStat__Group__0__Impl"


    // $ANTLR start "rule__BindingStat__Group__1"
    // InternalMyAtlProject.g:4365:1: rule__BindingStat__Group__1 : rule__BindingStat__Group__1__Impl ;
    public final void rule__BindingStat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4369:1: ( rule__BindingStat__Group__1__Impl )
            // InternalMyAtlProject.g:4370:2: rule__BindingStat__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BindingStat__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingStat__Group__1"


    // $ANTLR start "rule__BindingStat__Group__1__Impl"
    // InternalMyAtlProject.g:4376:1: rule__BindingStat__Group__1__Impl : ( '<-' ) ;
    public final void rule__BindingStat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4380:1: ( ( '<-' ) )
            // InternalMyAtlProject.g:4381:1: ( '<-' )
            {
            // InternalMyAtlProject.g:4381:1: ( '<-' )
            // InternalMyAtlProject.g:4382:2: '<-'
            {
             before(grammarAccess.getBindingStatAccess().getLessThanSignHyphenMinusKeyword_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getBindingStatAccess().getLessThanSignHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingStat__Group__1__Impl"


    // $ANTLR start "rule__CollectionTypeCS__Group__0"
    // InternalMyAtlProject.g:4392:1: rule__CollectionTypeCS__Group__0 : rule__CollectionTypeCS__Group__0__Impl rule__CollectionTypeCS__Group__1 ;
    public final void rule__CollectionTypeCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4396:1: ( rule__CollectionTypeCS__Group__0__Impl rule__CollectionTypeCS__Group__1 )
            // InternalMyAtlProject.g:4397:2: rule__CollectionTypeCS__Group__0__Impl rule__CollectionTypeCS__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__CollectionTypeCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionTypeCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__Group__0"


    // $ANTLR start "rule__CollectionTypeCS__Group__0__Impl"
    // InternalMyAtlProject.g:4404:1: rule__CollectionTypeCS__Group__0__Impl : ( ( rule__CollectionTypeCS__NameAssignment_0 ) ) ;
    public final void rule__CollectionTypeCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4408:1: ( ( ( rule__CollectionTypeCS__NameAssignment_0 ) ) )
            // InternalMyAtlProject.g:4409:1: ( ( rule__CollectionTypeCS__NameAssignment_0 ) )
            {
            // InternalMyAtlProject.g:4409:1: ( ( rule__CollectionTypeCS__NameAssignment_0 ) )
            // InternalMyAtlProject.g:4410:2: ( rule__CollectionTypeCS__NameAssignment_0 )
            {
             before(grammarAccess.getCollectionTypeCSAccess().getNameAssignment_0()); 
            // InternalMyAtlProject.g:4411:2: ( rule__CollectionTypeCS__NameAssignment_0 )
            // InternalMyAtlProject.g:4411:3: rule__CollectionTypeCS__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionTypeCS__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionTypeCSAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__Group__0__Impl"


    // $ANTLR start "rule__CollectionTypeCS__Group__1"
    // InternalMyAtlProject.g:4419:1: rule__CollectionTypeCS__Group__1 : rule__CollectionTypeCS__Group__1__Impl ;
    public final void rule__CollectionTypeCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4423:1: ( rule__CollectionTypeCS__Group__1__Impl )
            // InternalMyAtlProject.g:4424:2: rule__CollectionTypeCS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionTypeCS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__Group__1"


    // $ANTLR start "rule__CollectionTypeCS__Group__1__Impl"
    // InternalMyAtlProject.g:4430:1: rule__CollectionTypeCS__Group__1__Impl : ( ( rule__CollectionTypeCS__Alternatives_1 )? ) ;
    public final void rule__CollectionTypeCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4434:1: ( ( ( rule__CollectionTypeCS__Alternatives_1 )? ) )
            // InternalMyAtlProject.g:4435:1: ( ( rule__CollectionTypeCS__Alternatives_1 )? )
            {
            // InternalMyAtlProject.g:4435:1: ( ( rule__CollectionTypeCS__Alternatives_1 )? )
            // InternalMyAtlProject.g:4436:2: ( rule__CollectionTypeCS__Alternatives_1 )?
            {
             before(grammarAccess.getCollectionTypeCSAccess().getAlternatives_1()); 
            // InternalMyAtlProject.g:4437:2: ( rule__CollectionTypeCS__Alternatives_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20||LA32_0==59) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyAtlProject.g:4437:3: rule__CollectionTypeCS__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectionTypeCS__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionTypeCSAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__Group__1__Impl"


    // $ANTLR start "rule__CollectionTypeCS__Group_1_0__0"
    // InternalMyAtlProject.g:4446:1: rule__CollectionTypeCS__Group_1_0__0 : rule__CollectionTypeCS__Group_1_0__0__Impl rule__CollectionTypeCS__Group_1_0__1 ;
    public final void rule__CollectionTypeCS__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4450:1: ( rule__CollectionTypeCS__Group_1_0__0__Impl rule__CollectionTypeCS__Group_1_0__1 )
            // InternalMyAtlProject.g:4451:2: rule__CollectionTypeCS__Group_1_0__0__Impl rule__CollectionTypeCS__Group_1_0__1
            {
            pushFollow(FOLLOW_30);
            rule__CollectionTypeCS__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionTypeCS__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__Group_1_0__0"


    // $ANTLR start "rule__CollectionTypeCS__Group_1_0__0__Impl"
    // InternalMyAtlProject.g:4458:1: rule__CollectionTypeCS__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__CollectionTypeCS__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4462:1: ( ( '(' ) )
            // InternalMyAtlProject.g:4463:1: ( '(' )
            {
            // InternalMyAtlProject.g:4463:1: ( '(' )
            // InternalMyAtlProject.g:4464:2: '('
            {
             before(grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__Group_1_0__0__Impl"


    // $ANTLR start "rule__CollectionTypeCS__Group_1_0__1"
    // InternalMyAtlProject.g:4473:1: rule__CollectionTypeCS__Group_1_0__1 : rule__CollectionTypeCS__Group_1_0__1__Impl rule__CollectionTypeCS__Group_1_0__2 ;
    public final void rule__CollectionTypeCS__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4477:1: ( rule__CollectionTypeCS__Group_1_0__1__Impl rule__CollectionTypeCS__Group_1_0__2 )
            // InternalMyAtlProject.g:4478:2: rule__CollectionTypeCS__Group_1_0__1__Impl rule__CollectionTypeCS__Group_1_0__2
            {
            pushFollow(FOLLOW_20);
            rule__CollectionTypeCS__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionTypeCS__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__Group_1_0__1"


    // $ANTLR start "rule__CollectionTypeCS__Group_1_0__1__Impl"
    // InternalMyAtlProject.g:4485:1: rule__CollectionTypeCS__Group_1_0__1__Impl : ( ( rule__CollectionTypeCS__OwnedTypeAssignment_1_0_1 ) ) ;
    public final void rule__CollectionTypeCS__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4489:1: ( ( ( rule__CollectionTypeCS__OwnedTypeAssignment_1_0_1 ) ) )
            // InternalMyAtlProject.g:4490:1: ( ( rule__CollectionTypeCS__OwnedTypeAssignment_1_0_1 ) )
            {
            // InternalMyAtlProject.g:4490:1: ( ( rule__CollectionTypeCS__OwnedTypeAssignment_1_0_1 ) )
            // InternalMyAtlProject.g:4491:2: ( rule__CollectionTypeCS__OwnedTypeAssignment_1_0_1 )
            {
             before(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeAssignment_1_0_1()); 
            // InternalMyAtlProject.g:4492:2: ( rule__CollectionTypeCS__OwnedTypeAssignment_1_0_1 )
            // InternalMyAtlProject.g:4492:3: rule__CollectionTypeCS__OwnedTypeAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CollectionTypeCS__OwnedTypeAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__Group_1_0__1__Impl"


    // $ANTLR start "rule__CollectionTypeCS__Group_1_0__2"
    // InternalMyAtlProject.g:4500:1: rule__CollectionTypeCS__Group_1_0__2 : rule__CollectionTypeCS__Group_1_0__2__Impl ;
    public final void rule__CollectionTypeCS__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4504:1: ( rule__CollectionTypeCS__Group_1_0__2__Impl )
            // InternalMyAtlProject.g:4505:2: rule__CollectionTypeCS__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionTypeCS__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__Group_1_0__2"


    // $ANTLR start "rule__CollectionTypeCS__Group_1_0__2__Impl"
    // InternalMyAtlProject.g:4511:1: rule__CollectionTypeCS__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__CollectionTypeCS__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4515:1: ( ( ')' ) )
            // InternalMyAtlProject.g:4516:1: ( ')' )
            {
            // InternalMyAtlProject.g:4516:1: ( ')' )
            // InternalMyAtlProject.g:4517:2: ')'
            {
             before(grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_0_2()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__Group_1_0__2__Impl"


    // $ANTLR start "rule__CollectionTypeCS__Group_1_1__0"
    // InternalMyAtlProject.g:4527:1: rule__CollectionTypeCS__Group_1_1__0 : rule__CollectionTypeCS__Group_1_1__0__Impl rule__CollectionTypeCS__Group_1_1__1 ;
    public final void rule__CollectionTypeCS__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4531:1: ( rule__CollectionTypeCS__Group_1_1__0__Impl rule__CollectionTypeCS__Group_1_1__1 )
            // InternalMyAtlProject.g:4532:2: rule__CollectionTypeCS__Group_1_1__0__Impl rule__CollectionTypeCS__Group_1_1__1
            {
            pushFollow(FOLLOW_30);
            rule__CollectionTypeCS__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionTypeCS__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__Group_1_1__0"


    // $ANTLR start "rule__CollectionTypeCS__Group_1_1__0__Impl"
    // InternalMyAtlProject.g:4539:1: rule__CollectionTypeCS__Group_1_1__0__Impl : ( '<' ) ;
    public final void rule__CollectionTypeCS__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4543:1: ( ( '<' ) )
            // InternalMyAtlProject.g:4544:1: ( '<' )
            {
            // InternalMyAtlProject.g:4544:1: ( '<' )
            // InternalMyAtlProject.g:4545:2: '<'
            {
             before(grammarAccess.getCollectionTypeCSAccess().getLessThanSignKeyword_1_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCollectionTypeCSAccess().getLessThanSignKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__Group_1_1__0__Impl"


    // $ANTLR start "rule__CollectionTypeCS__Group_1_1__1"
    // InternalMyAtlProject.g:4554:1: rule__CollectionTypeCS__Group_1_1__1 : rule__CollectionTypeCS__Group_1_1__1__Impl rule__CollectionTypeCS__Group_1_1__2 ;
    public final void rule__CollectionTypeCS__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4558:1: ( rule__CollectionTypeCS__Group_1_1__1__Impl rule__CollectionTypeCS__Group_1_1__2 )
            // InternalMyAtlProject.g:4559:2: rule__CollectionTypeCS__Group_1_1__1__Impl rule__CollectionTypeCS__Group_1_1__2
            {
            pushFollow(FOLLOW_31);
            rule__CollectionTypeCS__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionTypeCS__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__Group_1_1__1"


    // $ANTLR start "rule__CollectionTypeCS__Group_1_1__1__Impl"
    // InternalMyAtlProject.g:4566:1: rule__CollectionTypeCS__Group_1_1__1__Impl : ( ( rule__CollectionTypeCS__OwnedTypeAssignment_1_1_1 ) ) ;
    public final void rule__CollectionTypeCS__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4570:1: ( ( ( rule__CollectionTypeCS__OwnedTypeAssignment_1_1_1 ) ) )
            // InternalMyAtlProject.g:4571:1: ( ( rule__CollectionTypeCS__OwnedTypeAssignment_1_1_1 ) )
            {
            // InternalMyAtlProject.g:4571:1: ( ( rule__CollectionTypeCS__OwnedTypeAssignment_1_1_1 ) )
            // InternalMyAtlProject.g:4572:2: ( rule__CollectionTypeCS__OwnedTypeAssignment_1_1_1 )
            {
             before(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeAssignment_1_1_1()); 
            // InternalMyAtlProject.g:4573:2: ( rule__CollectionTypeCS__OwnedTypeAssignment_1_1_1 )
            // InternalMyAtlProject.g:4573:3: rule__CollectionTypeCS__OwnedTypeAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CollectionTypeCS__OwnedTypeAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__Group_1_1__1__Impl"


    // $ANTLR start "rule__CollectionTypeCS__Group_1_1__2"
    // InternalMyAtlProject.g:4581:1: rule__CollectionTypeCS__Group_1_1__2 : rule__CollectionTypeCS__Group_1_1__2__Impl ;
    public final void rule__CollectionTypeCS__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4585:1: ( rule__CollectionTypeCS__Group_1_1__2__Impl )
            // InternalMyAtlProject.g:4586:2: rule__CollectionTypeCS__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionTypeCS__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__Group_1_1__2"


    // $ANTLR start "rule__CollectionTypeCS__Group_1_1__2__Impl"
    // InternalMyAtlProject.g:4592:1: rule__CollectionTypeCS__Group_1_1__2__Impl : ( '>' ) ;
    public final void rule__CollectionTypeCS__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4596:1: ( ( '>' ) )
            // InternalMyAtlProject.g:4597:1: ( '>' )
            {
            // InternalMyAtlProject.g:4597:1: ( '>' )
            // InternalMyAtlProject.g:4598:2: '>'
            {
             before(grammarAccess.getCollectionTypeCSAccess().getGreaterThanSignKeyword_1_1_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCollectionTypeCSAccess().getGreaterThanSignKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__Group_1_1__2__Impl"


    // $ANTLR start "rule__CollectionLiteralExpCS__Group__0"
    // InternalMyAtlProject.g:4608:1: rule__CollectionLiteralExpCS__Group__0 : rule__CollectionLiteralExpCS__Group__0__Impl rule__CollectionLiteralExpCS__Group__1 ;
    public final void rule__CollectionLiteralExpCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4612:1: ( rule__CollectionLiteralExpCS__Group__0__Impl rule__CollectionLiteralExpCS__Group__1 )
            // InternalMyAtlProject.g:4613:2: rule__CollectionLiteralExpCS__Group__0__Impl rule__CollectionLiteralExpCS__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__CollectionLiteralExpCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionLiteralExpCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__Group__0"


    // $ANTLR start "rule__CollectionLiteralExpCS__Group__0__Impl"
    // InternalMyAtlProject.g:4620:1: rule__CollectionLiteralExpCS__Group__0__Impl : ( ( rule__CollectionLiteralExpCS__OwnedTypeAssignment_0 ) ) ;
    public final void rule__CollectionLiteralExpCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4624:1: ( ( ( rule__CollectionLiteralExpCS__OwnedTypeAssignment_0 ) ) )
            // InternalMyAtlProject.g:4625:1: ( ( rule__CollectionLiteralExpCS__OwnedTypeAssignment_0 ) )
            {
            // InternalMyAtlProject.g:4625:1: ( ( rule__CollectionLiteralExpCS__OwnedTypeAssignment_0 ) )
            // InternalMyAtlProject.g:4626:2: ( rule__CollectionLiteralExpCS__OwnedTypeAssignment_0 )
            {
             before(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeAssignment_0()); 
            // InternalMyAtlProject.g:4627:2: ( rule__CollectionLiteralExpCS__OwnedTypeAssignment_0 )
            // InternalMyAtlProject.g:4627:3: rule__CollectionLiteralExpCS__OwnedTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionLiteralExpCS__OwnedTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__Group__0__Impl"


    // $ANTLR start "rule__CollectionLiteralExpCS__Group__1"
    // InternalMyAtlProject.g:4635:1: rule__CollectionLiteralExpCS__Group__1 : rule__CollectionLiteralExpCS__Group__1__Impl rule__CollectionLiteralExpCS__Group__2 ;
    public final void rule__CollectionLiteralExpCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4639:1: ( rule__CollectionLiteralExpCS__Group__1__Impl rule__CollectionLiteralExpCS__Group__2 )
            // InternalMyAtlProject.g:4640:2: rule__CollectionLiteralExpCS__Group__1__Impl rule__CollectionLiteralExpCS__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__CollectionLiteralExpCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionLiteralExpCS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__Group__1"


    // $ANTLR start "rule__CollectionLiteralExpCS__Group__1__Impl"
    // InternalMyAtlProject.g:4647:1: rule__CollectionLiteralExpCS__Group__1__Impl : ( '{' ) ;
    public final void rule__CollectionLiteralExpCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4651:1: ( ( '{' ) )
            // InternalMyAtlProject.g:4652:1: ( '{' )
            {
            // InternalMyAtlProject.g:4652:1: ( '{' )
            // InternalMyAtlProject.g:4653:2: '{'
            {
             before(grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__Group__1__Impl"


    // $ANTLR start "rule__CollectionLiteralExpCS__Group__2"
    // InternalMyAtlProject.g:4662:1: rule__CollectionLiteralExpCS__Group__2 : rule__CollectionLiteralExpCS__Group__2__Impl rule__CollectionLiteralExpCS__Group__3 ;
    public final void rule__CollectionLiteralExpCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4666:1: ( rule__CollectionLiteralExpCS__Group__2__Impl rule__CollectionLiteralExpCS__Group__3 )
            // InternalMyAtlProject.g:4667:2: rule__CollectionLiteralExpCS__Group__2__Impl rule__CollectionLiteralExpCS__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__CollectionLiteralExpCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionLiteralExpCS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__Group__2"


    // $ANTLR start "rule__CollectionLiteralExpCS__Group__2__Impl"
    // InternalMyAtlProject.g:4674:1: rule__CollectionLiteralExpCS__Group__2__Impl : ( ( rule__CollectionLiteralExpCS__Group_2__0 )? ) ;
    public final void rule__CollectionLiteralExpCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4678:1: ( ( ( rule__CollectionLiteralExpCS__Group_2__0 )? ) )
            // InternalMyAtlProject.g:4679:1: ( ( rule__CollectionLiteralExpCS__Group_2__0 )? )
            {
            // InternalMyAtlProject.g:4679:1: ( ( rule__CollectionLiteralExpCS__Group_2__0 )? )
            // InternalMyAtlProject.g:4680:2: ( rule__CollectionLiteralExpCS__Group_2__0 )?
            {
             before(grammarAccess.getCollectionLiteralExpCSAccess().getGroup_2()); 
            // InternalMyAtlProject.g:4681:2: ( rule__CollectionLiteralExpCS__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_SINGLE_QUOTED_STRING && LA33_0<=RULE_BIG_INT)||(LA33_0>=14 && LA33_0<=16)||(LA33_0>=31 && LA33_0<=44)||LA33_0==59||(LA33_0>=68 && LA33_0<=70)||LA33_0==74||LA33_0==76||(LA33_0>=79 && LA33_0<=80)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyAtlProject.g:4681:3: rule__CollectionLiteralExpCS__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectionLiteralExpCS__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionLiteralExpCSAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__Group__2__Impl"


    // $ANTLR start "rule__CollectionLiteralExpCS__Group__3"
    // InternalMyAtlProject.g:4689:1: rule__CollectionLiteralExpCS__Group__3 : rule__CollectionLiteralExpCS__Group__3__Impl ;
    public final void rule__CollectionLiteralExpCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4693:1: ( rule__CollectionLiteralExpCS__Group__3__Impl )
            // InternalMyAtlProject.g:4694:2: rule__CollectionLiteralExpCS__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionLiteralExpCS__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__Group__3"


    // $ANTLR start "rule__CollectionLiteralExpCS__Group__3__Impl"
    // InternalMyAtlProject.g:4700:1: rule__CollectionLiteralExpCS__Group__3__Impl : ( '}' ) ;
    public final void rule__CollectionLiteralExpCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4704:1: ( ( '}' ) )
            // InternalMyAtlProject.g:4705:1: ( '}' )
            {
            // InternalMyAtlProject.g:4705:1: ( '}' )
            // InternalMyAtlProject.g:4706:2: '}'
            {
             before(grammarAccess.getCollectionLiteralExpCSAccess().getRightCurlyBracketKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCollectionLiteralExpCSAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__Group__3__Impl"


    // $ANTLR start "rule__CollectionLiteralExpCS__Group_2__0"
    // InternalMyAtlProject.g:4716:1: rule__CollectionLiteralExpCS__Group_2__0 : rule__CollectionLiteralExpCS__Group_2__0__Impl rule__CollectionLiteralExpCS__Group_2__1 ;
    public final void rule__CollectionLiteralExpCS__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4720:1: ( rule__CollectionLiteralExpCS__Group_2__0__Impl rule__CollectionLiteralExpCS__Group_2__1 )
            // InternalMyAtlProject.g:4721:2: rule__CollectionLiteralExpCS__Group_2__0__Impl rule__CollectionLiteralExpCS__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__CollectionLiteralExpCS__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionLiteralExpCS__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__Group_2__0"


    // $ANTLR start "rule__CollectionLiteralExpCS__Group_2__0__Impl"
    // InternalMyAtlProject.g:4728:1: rule__CollectionLiteralExpCS__Group_2__0__Impl : ( ( rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_0 ) ) ;
    public final void rule__CollectionLiteralExpCS__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4732:1: ( ( ( rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_0 ) ) )
            // InternalMyAtlProject.g:4733:1: ( ( rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_0 ) )
            {
            // InternalMyAtlProject.g:4733:1: ( ( rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_0 ) )
            // InternalMyAtlProject.g:4734:2: ( rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_0 )
            {
             before(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsAssignment_2_0()); 
            // InternalMyAtlProject.g:4735:2: ( rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_0 )
            // InternalMyAtlProject.g:4735:3: rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__Group_2__0__Impl"


    // $ANTLR start "rule__CollectionLiteralExpCS__Group_2__1"
    // InternalMyAtlProject.g:4743:1: rule__CollectionLiteralExpCS__Group_2__1 : rule__CollectionLiteralExpCS__Group_2__1__Impl ;
    public final void rule__CollectionLiteralExpCS__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4747:1: ( rule__CollectionLiteralExpCS__Group_2__1__Impl )
            // InternalMyAtlProject.g:4748:2: rule__CollectionLiteralExpCS__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionLiteralExpCS__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__Group_2__1"


    // $ANTLR start "rule__CollectionLiteralExpCS__Group_2__1__Impl"
    // InternalMyAtlProject.g:4754:1: rule__CollectionLiteralExpCS__Group_2__1__Impl : ( ( rule__CollectionLiteralExpCS__Group_2_1__0 )* ) ;
    public final void rule__CollectionLiteralExpCS__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4758:1: ( ( ( rule__CollectionLiteralExpCS__Group_2_1__0 )* ) )
            // InternalMyAtlProject.g:4759:1: ( ( rule__CollectionLiteralExpCS__Group_2_1__0 )* )
            {
            // InternalMyAtlProject.g:4759:1: ( ( rule__CollectionLiteralExpCS__Group_2_1__0 )* )
            // InternalMyAtlProject.g:4760:2: ( rule__CollectionLiteralExpCS__Group_2_1__0 )*
            {
             before(grammarAccess.getCollectionLiteralExpCSAccess().getGroup_2_1()); 
            // InternalMyAtlProject.g:4761:2: ( rule__CollectionLiteralExpCS__Group_2_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==63) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyAtlProject.g:4761:3: rule__CollectionLiteralExpCS__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__CollectionLiteralExpCS__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getCollectionLiteralExpCSAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__Group_2__1__Impl"


    // $ANTLR start "rule__CollectionLiteralExpCS__Group_2_1__0"
    // InternalMyAtlProject.g:4770:1: rule__CollectionLiteralExpCS__Group_2_1__0 : rule__CollectionLiteralExpCS__Group_2_1__0__Impl rule__CollectionLiteralExpCS__Group_2_1__1 ;
    public final void rule__CollectionLiteralExpCS__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4774:1: ( rule__CollectionLiteralExpCS__Group_2_1__0__Impl rule__CollectionLiteralExpCS__Group_2_1__1 )
            // InternalMyAtlProject.g:4775:2: rule__CollectionLiteralExpCS__Group_2_1__0__Impl rule__CollectionLiteralExpCS__Group_2_1__1
            {
            pushFollow(FOLLOW_33);
            rule__CollectionLiteralExpCS__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionLiteralExpCS__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__Group_2_1__0"


    // $ANTLR start "rule__CollectionLiteralExpCS__Group_2_1__0__Impl"
    // InternalMyAtlProject.g:4782:1: rule__CollectionLiteralExpCS__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__CollectionLiteralExpCS__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4786:1: ( ( ',' ) )
            // InternalMyAtlProject.g:4787:1: ( ',' )
            {
            // InternalMyAtlProject.g:4787:1: ( ',' )
            // InternalMyAtlProject.g:4788:2: ','
            {
             before(grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__Group_2_1__0__Impl"


    // $ANTLR start "rule__CollectionLiteralExpCS__Group_2_1__1"
    // InternalMyAtlProject.g:4797:1: rule__CollectionLiteralExpCS__Group_2_1__1 : rule__CollectionLiteralExpCS__Group_2_1__1__Impl ;
    public final void rule__CollectionLiteralExpCS__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4801:1: ( rule__CollectionLiteralExpCS__Group_2_1__1__Impl )
            // InternalMyAtlProject.g:4802:2: rule__CollectionLiteralExpCS__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionLiteralExpCS__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__Group_2_1__1"


    // $ANTLR start "rule__CollectionLiteralExpCS__Group_2_1__1__Impl"
    // InternalMyAtlProject.g:4808:1: rule__CollectionLiteralExpCS__Group_2_1__1__Impl : ( ( rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_1_1 ) ) ;
    public final void rule__CollectionLiteralExpCS__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4812:1: ( ( ( rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_1_1 ) ) )
            // InternalMyAtlProject.g:4813:1: ( ( rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_1_1 ) )
            {
            // InternalMyAtlProject.g:4813:1: ( ( rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_1_1 ) )
            // InternalMyAtlProject.g:4814:2: ( rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_1_1 )
            {
             before(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsAssignment_2_1_1()); 
            // InternalMyAtlProject.g:4815:2: ( rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_1_1 )
            // InternalMyAtlProject.g:4815:3: rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__Group_2_1__1__Impl"


    // $ANTLR start "rule__CollectionLiteralPartCS__Group__0"
    // InternalMyAtlProject.g:4824:1: rule__CollectionLiteralPartCS__Group__0 : rule__CollectionLiteralPartCS__Group__0__Impl rule__CollectionLiteralPartCS__Group__1 ;
    public final void rule__CollectionLiteralPartCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4828:1: ( rule__CollectionLiteralPartCS__Group__0__Impl rule__CollectionLiteralPartCS__Group__1 )
            // InternalMyAtlProject.g:4829:2: rule__CollectionLiteralPartCS__Group__0__Impl rule__CollectionLiteralPartCS__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__CollectionLiteralPartCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionLiteralPartCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralPartCS__Group__0"


    // $ANTLR start "rule__CollectionLiteralPartCS__Group__0__Impl"
    // InternalMyAtlProject.g:4836:1: rule__CollectionLiteralPartCS__Group__0__Impl : ( ( rule__CollectionLiteralPartCS__ExpressionCSAssignment_0 ) ) ;
    public final void rule__CollectionLiteralPartCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4840:1: ( ( ( rule__CollectionLiteralPartCS__ExpressionCSAssignment_0 ) ) )
            // InternalMyAtlProject.g:4841:1: ( ( rule__CollectionLiteralPartCS__ExpressionCSAssignment_0 ) )
            {
            // InternalMyAtlProject.g:4841:1: ( ( rule__CollectionLiteralPartCS__ExpressionCSAssignment_0 ) )
            // InternalMyAtlProject.g:4842:2: ( rule__CollectionLiteralPartCS__ExpressionCSAssignment_0 )
            {
             before(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSAssignment_0()); 
            // InternalMyAtlProject.g:4843:2: ( rule__CollectionLiteralPartCS__ExpressionCSAssignment_0 )
            // InternalMyAtlProject.g:4843:3: rule__CollectionLiteralPartCS__ExpressionCSAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionLiteralPartCS__ExpressionCSAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralPartCS__Group__0__Impl"


    // $ANTLR start "rule__CollectionLiteralPartCS__Group__1"
    // InternalMyAtlProject.g:4851:1: rule__CollectionLiteralPartCS__Group__1 : rule__CollectionLiteralPartCS__Group__1__Impl ;
    public final void rule__CollectionLiteralPartCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4855:1: ( rule__CollectionLiteralPartCS__Group__1__Impl )
            // InternalMyAtlProject.g:4856:2: rule__CollectionLiteralPartCS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionLiteralPartCS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralPartCS__Group__1"


    // $ANTLR start "rule__CollectionLiteralPartCS__Group__1__Impl"
    // InternalMyAtlProject.g:4862:1: rule__CollectionLiteralPartCS__Group__1__Impl : ( ( rule__CollectionLiteralPartCS__Group_1__0 )? ) ;
    public final void rule__CollectionLiteralPartCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4866:1: ( ( ( rule__CollectionLiteralPartCS__Group_1__0 )? ) )
            // InternalMyAtlProject.g:4867:1: ( ( rule__CollectionLiteralPartCS__Group_1__0 )? )
            {
            // InternalMyAtlProject.g:4867:1: ( ( rule__CollectionLiteralPartCS__Group_1__0 )? )
            // InternalMyAtlProject.g:4868:2: ( rule__CollectionLiteralPartCS__Group_1__0 )?
            {
             before(grammarAccess.getCollectionLiteralPartCSAccess().getGroup_1()); 
            // InternalMyAtlProject.g:4869:2: ( rule__CollectionLiteralPartCS__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==67) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyAtlProject.g:4869:3: rule__CollectionLiteralPartCS__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectionLiteralPartCS__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionLiteralPartCSAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralPartCS__Group__1__Impl"


    // $ANTLR start "rule__CollectionLiteralPartCS__Group_1__0"
    // InternalMyAtlProject.g:4878:1: rule__CollectionLiteralPartCS__Group_1__0 : rule__CollectionLiteralPartCS__Group_1__0__Impl rule__CollectionLiteralPartCS__Group_1__1 ;
    public final void rule__CollectionLiteralPartCS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4882:1: ( rule__CollectionLiteralPartCS__Group_1__0__Impl rule__CollectionLiteralPartCS__Group_1__1 )
            // InternalMyAtlProject.g:4883:2: rule__CollectionLiteralPartCS__Group_1__0__Impl rule__CollectionLiteralPartCS__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__CollectionLiteralPartCS__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionLiteralPartCS__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralPartCS__Group_1__0"


    // $ANTLR start "rule__CollectionLiteralPartCS__Group_1__0__Impl"
    // InternalMyAtlProject.g:4890:1: rule__CollectionLiteralPartCS__Group_1__0__Impl : ( '..' ) ;
    public final void rule__CollectionLiteralPartCS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4894:1: ( ( '..' ) )
            // InternalMyAtlProject.g:4895:1: ( '..' )
            {
            // InternalMyAtlProject.g:4895:1: ( '..' )
            // InternalMyAtlProject.g:4896:2: '..'
            {
             before(grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_1_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralPartCS__Group_1__0__Impl"


    // $ANTLR start "rule__CollectionLiteralPartCS__Group_1__1"
    // InternalMyAtlProject.g:4905:1: rule__CollectionLiteralPartCS__Group_1__1 : rule__CollectionLiteralPartCS__Group_1__1__Impl ;
    public final void rule__CollectionLiteralPartCS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4909:1: ( rule__CollectionLiteralPartCS__Group_1__1__Impl )
            // InternalMyAtlProject.g:4910:2: rule__CollectionLiteralPartCS__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionLiteralPartCS__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralPartCS__Group_1__1"


    // $ANTLR start "rule__CollectionLiteralPartCS__Group_1__1__Impl"
    // InternalMyAtlProject.g:4916:1: rule__CollectionLiteralPartCS__Group_1__1__Impl : ( ( rule__CollectionLiteralPartCS__LastExpressionCSAssignment_1_1 ) ) ;
    public final void rule__CollectionLiteralPartCS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4920:1: ( ( ( rule__CollectionLiteralPartCS__LastExpressionCSAssignment_1_1 ) ) )
            // InternalMyAtlProject.g:4921:1: ( ( rule__CollectionLiteralPartCS__LastExpressionCSAssignment_1_1 ) )
            {
            // InternalMyAtlProject.g:4921:1: ( ( rule__CollectionLiteralPartCS__LastExpressionCSAssignment_1_1 ) )
            // InternalMyAtlProject.g:4922:2: ( rule__CollectionLiteralPartCS__LastExpressionCSAssignment_1_1 )
            {
             before(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSAssignment_1_1()); 
            // InternalMyAtlProject.g:4923:2: ( rule__CollectionLiteralPartCS__LastExpressionCSAssignment_1_1 )
            // InternalMyAtlProject.g:4923:3: rule__CollectionLiteralPartCS__LastExpressionCSAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CollectionLiteralPartCS__LastExpressionCSAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralPartCS__Group_1__1__Impl"


    // $ANTLR start "rule__TupleLiteralExpCS__Group__0"
    // InternalMyAtlProject.g:4932:1: rule__TupleLiteralExpCS__Group__0 : rule__TupleLiteralExpCS__Group__0__Impl rule__TupleLiteralExpCS__Group__1 ;
    public final void rule__TupleLiteralExpCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4936:1: ( rule__TupleLiteralExpCS__Group__0__Impl rule__TupleLiteralExpCS__Group__1 )
            // InternalMyAtlProject.g:4937:2: rule__TupleLiteralExpCS__Group__0__Impl rule__TupleLiteralExpCS__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__TupleLiteralExpCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleLiteralExpCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralExpCS__Group__0"


    // $ANTLR start "rule__TupleLiteralExpCS__Group__0__Impl"
    // InternalMyAtlProject.g:4944:1: rule__TupleLiteralExpCS__Group__0__Impl : ( 'Tuple' ) ;
    public final void rule__TupleLiteralExpCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4948:1: ( ( 'Tuple' ) )
            // InternalMyAtlProject.g:4949:1: ( 'Tuple' )
            {
            // InternalMyAtlProject.g:4949:1: ( 'Tuple' )
            // InternalMyAtlProject.g:4950:2: 'Tuple'
            {
             before(grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralExpCS__Group__0__Impl"


    // $ANTLR start "rule__TupleLiteralExpCS__Group__1"
    // InternalMyAtlProject.g:4959:1: rule__TupleLiteralExpCS__Group__1 : rule__TupleLiteralExpCS__Group__1__Impl rule__TupleLiteralExpCS__Group__2 ;
    public final void rule__TupleLiteralExpCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4963:1: ( rule__TupleLiteralExpCS__Group__1__Impl rule__TupleLiteralExpCS__Group__2 )
            // InternalMyAtlProject.g:4964:2: rule__TupleLiteralExpCS__Group__1__Impl rule__TupleLiteralExpCS__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TupleLiteralExpCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleLiteralExpCS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralExpCS__Group__1"


    // $ANTLR start "rule__TupleLiteralExpCS__Group__1__Impl"
    // InternalMyAtlProject.g:4971:1: rule__TupleLiteralExpCS__Group__1__Impl : ( '{' ) ;
    public final void rule__TupleLiteralExpCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4975:1: ( ( '{' ) )
            // InternalMyAtlProject.g:4976:1: ( '{' )
            {
            // InternalMyAtlProject.g:4976:1: ( '{' )
            // InternalMyAtlProject.g:4977:2: '{'
            {
             before(grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralExpCS__Group__1__Impl"


    // $ANTLR start "rule__TupleLiteralExpCS__Group__2"
    // InternalMyAtlProject.g:4986:1: rule__TupleLiteralExpCS__Group__2 : rule__TupleLiteralExpCS__Group__2__Impl rule__TupleLiteralExpCS__Group__3 ;
    public final void rule__TupleLiteralExpCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:4990:1: ( rule__TupleLiteralExpCS__Group__2__Impl rule__TupleLiteralExpCS__Group__3 )
            // InternalMyAtlProject.g:4991:2: rule__TupleLiteralExpCS__Group__2__Impl rule__TupleLiteralExpCS__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__TupleLiteralExpCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleLiteralExpCS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralExpCS__Group__2"


    // $ANTLR start "rule__TupleLiteralExpCS__Group__2__Impl"
    // InternalMyAtlProject.g:4998:1: rule__TupleLiteralExpCS__Group__2__Impl : ( ( rule__TupleLiteralExpCS__OwnedPartsAssignment_2 ) ) ;
    public final void rule__TupleLiteralExpCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5002:1: ( ( ( rule__TupleLiteralExpCS__OwnedPartsAssignment_2 ) ) )
            // InternalMyAtlProject.g:5003:1: ( ( rule__TupleLiteralExpCS__OwnedPartsAssignment_2 ) )
            {
            // InternalMyAtlProject.g:5003:1: ( ( rule__TupleLiteralExpCS__OwnedPartsAssignment_2 ) )
            // InternalMyAtlProject.g:5004:2: ( rule__TupleLiteralExpCS__OwnedPartsAssignment_2 )
            {
             before(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsAssignment_2()); 
            // InternalMyAtlProject.g:5005:2: ( rule__TupleLiteralExpCS__OwnedPartsAssignment_2 )
            // InternalMyAtlProject.g:5005:3: rule__TupleLiteralExpCS__OwnedPartsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TupleLiteralExpCS__OwnedPartsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralExpCS__Group__2__Impl"


    // $ANTLR start "rule__TupleLiteralExpCS__Group__3"
    // InternalMyAtlProject.g:5013:1: rule__TupleLiteralExpCS__Group__3 : rule__TupleLiteralExpCS__Group__3__Impl rule__TupleLiteralExpCS__Group__4 ;
    public final void rule__TupleLiteralExpCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5017:1: ( rule__TupleLiteralExpCS__Group__3__Impl rule__TupleLiteralExpCS__Group__4 )
            // InternalMyAtlProject.g:5018:2: rule__TupleLiteralExpCS__Group__3__Impl rule__TupleLiteralExpCS__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__TupleLiteralExpCS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleLiteralExpCS__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralExpCS__Group__3"


    // $ANTLR start "rule__TupleLiteralExpCS__Group__3__Impl"
    // InternalMyAtlProject.g:5025:1: rule__TupleLiteralExpCS__Group__3__Impl : ( ( rule__TupleLiteralExpCS__Group_3__0 )* ) ;
    public final void rule__TupleLiteralExpCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5029:1: ( ( ( rule__TupleLiteralExpCS__Group_3__0 )* ) )
            // InternalMyAtlProject.g:5030:1: ( ( rule__TupleLiteralExpCS__Group_3__0 )* )
            {
            // InternalMyAtlProject.g:5030:1: ( ( rule__TupleLiteralExpCS__Group_3__0 )* )
            // InternalMyAtlProject.g:5031:2: ( rule__TupleLiteralExpCS__Group_3__0 )*
            {
             before(grammarAccess.getTupleLiteralExpCSAccess().getGroup_3()); 
            // InternalMyAtlProject.g:5032:2: ( rule__TupleLiteralExpCS__Group_3__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==63) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMyAtlProject.g:5032:3: rule__TupleLiteralExpCS__Group_3__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__TupleLiteralExpCS__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getTupleLiteralExpCSAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralExpCS__Group__3__Impl"


    // $ANTLR start "rule__TupleLiteralExpCS__Group__4"
    // InternalMyAtlProject.g:5040:1: rule__TupleLiteralExpCS__Group__4 : rule__TupleLiteralExpCS__Group__4__Impl ;
    public final void rule__TupleLiteralExpCS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5044:1: ( rule__TupleLiteralExpCS__Group__4__Impl )
            // InternalMyAtlProject.g:5045:2: rule__TupleLiteralExpCS__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TupleLiteralExpCS__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralExpCS__Group__4"


    // $ANTLR start "rule__TupleLiteralExpCS__Group__4__Impl"
    // InternalMyAtlProject.g:5051:1: rule__TupleLiteralExpCS__Group__4__Impl : ( '}' ) ;
    public final void rule__TupleLiteralExpCS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5055:1: ( ( '}' ) )
            // InternalMyAtlProject.g:5056:1: ( '}' )
            {
            // InternalMyAtlProject.g:5056:1: ( '}' )
            // InternalMyAtlProject.g:5057:2: '}'
            {
             before(grammarAccess.getTupleLiteralExpCSAccess().getRightCurlyBracketKeyword_4()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTupleLiteralExpCSAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralExpCS__Group__4__Impl"


    // $ANTLR start "rule__TupleLiteralExpCS__Group_3__0"
    // InternalMyAtlProject.g:5067:1: rule__TupleLiteralExpCS__Group_3__0 : rule__TupleLiteralExpCS__Group_3__0__Impl rule__TupleLiteralExpCS__Group_3__1 ;
    public final void rule__TupleLiteralExpCS__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5071:1: ( rule__TupleLiteralExpCS__Group_3__0__Impl rule__TupleLiteralExpCS__Group_3__1 )
            // InternalMyAtlProject.g:5072:2: rule__TupleLiteralExpCS__Group_3__0__Impl rule__TupleLiteralExpCS__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TupleLiteralExpCS__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleLiteralExpCS__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralExpCS__Group_3__0"


    // $ANTLR start "rule__TupleLiteralExpCS__Group_3__0__Impl"
    // InternalMyAtlProject.g:5079:1: rule__TupleLiteralExpCS__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TupleLiteralExpCS__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5083:1: ( ( ',' ) )
            // InternalMyAtlProject.g:5084:1: ( ',' )
            {
            // InternalMyAtlProject.g:5084:1: ( ',' )
            // InternalMyAtlProject.g:5085:2: ','
            {
             before(grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralExpCS__Group_3__0__Impl"


    // $ANTLR start "rule__TupleLiteralExpCS__Group_3__1"
    // InternalMyAtlProject.g:5094:1: rule__TupleLiteralExpCS__Group_3__1 : rule__TupleLiteralExpCS__Group_3__1__Impl ;
    public final void rule__TupleLiteralExpCS__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5098:1: ( rule__TupleLiteralExpCS__Group_3__1__Impl )
            // InternalMyAtlProject.g:5099:2: rule__TupleLiteralExpCS__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TupleLiteralExpCS__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralExpCS__Group_3__1"


    // $ANTLR start "rule__TupleLiteralExpCS__Group_3__1__Impl"
    // InternalMyAtlProject.g:5105:1: rule__TupleLiteralExpCS__Group_3__1__Impl : ( ( rule__TupleLiteralExpCS__OwnedPartsAssignment_3_1 ) ) ;
    public final void rule__TupleLiteralExpCS__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5109:1: ( ( ( rule__TupleLiteralExpCS__OwnedPartsAssignment_3_1 ) ) )
            // InternalMyAtlProject.g:5110:1: ( ( rule__TupleLiteralExpCS__OwnedPartsAssignment_3_1 ) )
            {
            // InternalMyAtlProject.g:5110:1: ( ( rule__TupleLiteralExpCS__OwnedPartsAssignment_3_1 ) )
            // InternalMyAtlProject.g:5111:2: ( rule__TupleLiteralExpCS__OwnedPartsAssignment_3_1 )
            {
             before(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsAssignment_3_1()); 
            // InternalMyAtlProject.g:5112:2: ( rule__TupleLiteralExpCS__OwnedPartsAssignment_3_1 )
            // InternalMyAtlProject.g:5112:3: rule__TupleLiteralExpCS__OwnedPartsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TupleLiteralExpCS__OwnedPartsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralExpCS__Group_3__1__Impl"


    // $ANTLR start "rule__TupleLiteralPartCS__Group__0"
    // InternalMyAtlProject.g:5121:1: rule__TupleLiteralPartCS__Group__0 : rule__TupleLiteralPartCS__Group__0__Impl rule__TupleLiteralPartCS__Group__1 ;
    public final void rule__TupleLiteralPartCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5125:1: ( rule__TupleLiteralPartCS__Group__0__Impl rule__TupleLiteralPartCS__Group__1 )
            // InternalMyAtlProject.g:5126:2: rule__TupleLiteralPartCS__Group__0__Impl rule__TupleLiteralPartCS__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__TupleLiteralPartCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleLiteralPartCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralPartCS__Group__0"


    // $ANTLR start "rule__TupleLiteralPartCS__Group__0__Impl"
    // InternalMyAtlProject.g:5133:1: rule__TupleLiteralPartCS__Group__0__Impl : ( ( rule__TupleLiteralPartCS__NameAssignment_0 ) ) ;
    public final void rule__TupleLiteralPartCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5137:1: ( ( ( rule__TupleLiteralPartCS__NameAssignment_0 ) ) )
            // InternalMyAtlProject.g:5138:1: ( ( rule__TupleLiteralPartCS__NameAssignment_0 ) )
            {
            // InternalMyAtlProject.g:5138:1: ( ( rule__TupleLiteralPartCS__NameAssignment_0 ) )
            // InternalMyAtlProject.g:5139:2: ( rule__TupleLiteralPartCS__NameAssignment_0 )
            {
             before(grammarAccess.getTupleLiteralPartCSAccess().getNameAssignment_0()); 
            // InternalMyAtlProject.g:5140:2: ( rule__TupleLiteralPartCS__NameAssignment_0 )
            // InternalMyAtlProject.g:5140:3: rule__TupleLiteralPartCS__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TupleLiteralPartCS__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTupleLiteralPartCSAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralPartCS__Group__0__Impl"


    // $ANTLR start "rule__TupleLiteralPartCS__Group__1"
    // InternalMyAtlProject.g:5148:1: rule__TupleLiteralPartCS__Group__1 : rule__TupleLiteralPartCS__Group__1__Impl rule__TupleLiteralPartCS__Group__2 ;
    public final void rule__TupleLiteralPartCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5152:1: ( rule__TupleLiteralPartCS__Group__1__Impl rule__TupleLiteralPartCS__Group__2 )
            // InternalMyAtlProject.g:5153:2: rule__TupleLiteralPartCS__Group__1__Impl rule__TupleLiteralPartCS__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__TupleLiteralPartCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleLiteralPartCS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralPartCS__Group__1"


    // $ANTLR start "rule__TupleLiteralPartCS__Group__1__Impl"
    // InternalMyAtlProject.g:5160:1: rule__TupleLiteralPartCS__Group__1__Impl : ( ( rule__TupleLiteralPartCS__Group_1__0 )? ) ;
    public final void rule__TupleLiteralPartCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5164:1: ( ( ( rule__TupleLiteralPartCS__Group_1__0 )? ) )
            // InternalMyAtlProject.g:5165:1: ( ( rule__TupleLiteralPartCS__Group_1__0 )? )
            {
            // InternalMyAtlProject.g:5165:1: ( ( rule__TupleLiteralPartCS__Group_1__0 )? )
            // InternalMyAtlProject.g:5166:2: ( rule__TupleLiteralPartCS__Group_1__0 )?
            {
             before(grammarAccess.getTupleLiteralPartCSAccess().getGroup_1()); 
            // InternalMyAtlProject.g:5167:2: ( rule__TupleLiteralPartCS__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyAtlProject.g:5167:3: rule__TupleLiteralPartCS__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TupleLiteralPartCS__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTupleLiteralPartCSAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralPartCS__Group__1__Impl"


    // $ANTLR start "rule__TupleLiteralPartCS__Group__2"
    // InternalMyAtlProject.g:5175:1: rule__TupleLiteralPartCS__Group__2 : rule__TupleLiteralPartCS__Group__2__Impl rule__TupleLiteralPartCS__Group__3 ;
    public final void rule__TupleLiteralPartCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5179:1: ( rule__TupleLiteralPartCS__Group__2__Impl rule__TupleLiteralPartCS__Group__3 )
            // InternalMyAtlProject.g:5180:2: rule__TupleLiteralPartCS__Group__2__Impl rule__TupleLiteralPartCS__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__TupleLiteralPartCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleLiteralPartCS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralPartCS__Group__2"


    // $ANTLR start "rule__TupleLiteralPartCS__Group__2__Impl"
    // InternalMyAtlProject.g:5187:1: rule__TupleLiteralPartCS__Group__2__Impl : ( '=' ) ;
    public final void rule__TupleLiteralPartCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5191:1: ( ( '=' ) )
            // InternalMyAtlProject.g:5192:1: ( '=' )
            {
            // InternalMyAtlProject.g:5192:1: ( '=' )
            // InternalMyAtlProject.g:5193:2: '='
            {
             before(grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralPartCS__Group__2__Impl"


    // $ANTLR start "rule__TupleLiteralPartCS__Group__3"
    // InternalMyAtlProject.g:5202:1: rule__TupleLiteralPartCS__Group__3 : rule__TupleLiteralPartCS__Group__3__Impl ;
    public final void rule__TupleLiteralPartCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5206:1: ( rule__TupleLiteralPartCS__Group__3__Impl )
            // InternalMyAtlProject.g:5207:2: rule__TupleLiteralPartCS__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TupleLiteralPartCS__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralPartCS__Group__3"


    // $ANTLR start "rule__TupleLiteralPartCS__Group__3__Impl"
    // InternalMyAtlProject.g:5213:1: rule__TupleLiteralPartCS__Group__3__Impl : ( ( rule__TupleLiteralPartCS__InitExpressionAssignment_3 ) ) ;
    public final void rule__TupleLiteralPartCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5217:1: ( ( ( rule__TupleLiteralPartCS__InitExpressionAssignment_3 ) ) )
            // InternalMyAtlProject.g:5218:1: ( ( rule__TupleLiteralPartCS__InitExpressionAssignment_3 ) )
            {
            // InternalMyAtlProject.g:5218:1: ( ( rule__TupleLiteralPartCS__InitExpressionAssignment_3 ) )
            // InternalMyAtlProject.g:5219:2: ( rule__TupleLiteralPartCS__InitExpressionAssignment_3 )
            {
             before(grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionAssignment_3()); 
            // InternalMyAtlProject.g:5220:2: ( rule__TupleLiteralPartCS__InitExpressionAssignment_3 )
            // InternalMyAtlProject.g:5220:3: rule__TupleLiteralPartCS__InitExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TupleLiteralPartCS__InitExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralPartCS__Group__3__Impl"


    // $ANTLR start "rule__TupleLiteralPartCS__Group_1__0"
    // InternalMyAtlProject.g:5229:1: rule__TupleLiteralPartCS__Group_1__0 : rule__TupleLiteralPartCS__Group_1__0__Impl rule__TupleLiteralPartCS__Group_1__1 ;
    public final void rule__TupleLiteralPartCS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5233:1: ( rule__TupleLiteralPartCS__Group_1__0__Impl rule__TupleLiteralPartCS__Group_1__1 )
            // InternalMyAtlProject.g:5234:2: rule__TupleLiteralPartCS__Group_1__0__Impl rule__TupleLiteralPartCS__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__TupleLiteralPartCS__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleLiteralPartCS__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralPartCS__Group_1__0"


    // $ANTLR start "rule__TupleLiteralPartCS__Group_1__0__Impl"
    // InternalMyAtlProject.g:5241:1: rule__TupleLiteralPartCS__Group_1__0__Impl : ( ':' ) ;
    public final void rule__TupleLiteralPartCS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5245:1: ( ( ':' ) )
            // InternalMyAtlProject.g:5246:1: ( ':' )
            {
            // InternalMyAtlProject.g:5246:1: ( ':' )
            // InternalMyAtlProject.g:5247:2: ':'
            {
             before(grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralPartCS__Group_1__0__Impl"


    // $ANTLR start "rule__TupleLiteralPartCS__Group_1__1"
    // InternalMyAtlProject.g:5256:1: rule__TupleLiteralPartCS__Group_1__1 : rule__TupleLiteralPartCS__Group_1__1__Impl ;
    public final void rule__TupleLiteralPartCS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5260:1: ( rule__TupleLiteralPartCS__Group_1__1__Impl )
            // InternalMyAtlProject.g:5261:2: rule__TupleLiteralPartCS__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TupleLiteralPartCS__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralPartCS__Group_1__1"


    // $ANTLR start "rule__TupleLiteralPartCS__Group_1__1__Impl"
    // InternalMyAtlProject.g:5267:1: rule__TupleLiteralPartCS__Group_1__1__Impl : ( ( rule__TupleLiteralPartCS__OwnedTypeAssignment_1_1 ) ) ;
    public final void rule__TupleLiteralPartCS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5271:1: ( ( ( rule__TupleLiteralPartCS__OwnedTypeAssignment_1_1 ) ) )
            // InternalMyAtlProject.g:5272:1: ( ( rule__TupleLiteralPartCS__OwnedTypeAssignment_1_1 ) )
            {
            // InternalMyAtlProject.g:5272:1: ( ( rule__TupleLiteralPartCS__OwnedTypeAssignment_1_1 ) )
            // InternalMyAtlProject.g:5273:2: ( rule__TupleLiteralPartCS__OwnedTypeAssignment_1_1 )
            {
             before(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeAssignment_1_1()); 
            // InternalMyAtlProject.g:5274:2: ( rule__TupleLiteralPartCS__OwnedTypeAssignment_1_1 )
            // InternalMyAtlProject.g:5274:3: rule__TupleLiteralPartCS__OwnedTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TupleLiteralPartCS__OwnedTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralPartCS__Group_1__1__Impl"


    // $ANTLR start "rule__UnlimitedNaturalLiteralExpCS__Group__0"
    // InternalMyAtlProject.g:5283:1: rule__UnlimitedNaturalLiteralExpCS__Group__0 : rule__UnlimitedNaturalLiteralExpCS__Group__0__Impl rule__UnlimitedNaturalLiteralExpCS__Group__1 ;
    public final void rule__UnlimitedNaturalLiteralExpCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5287:1: ( rule__UnlimitedNaturalLiteralExpCS__Group__0__Impl rule__UnlimitedNaturalLiteralExpCS__Group__1 )
            // InternalMyAtlProject.g:5288:2: rule__UnlimitedNaturalLiteralExpCS__Group__0__Impl rule__UnlimitedNaturalLiteralExpCS__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__UnlimitedNaturalLiteralExpCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnlimitedNaturalLiteralExpCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnlimitedNaturalLiteralExpCS__Group__0"


    // $ANTLR start "rule__UnlimitedNaturalLiteralExpCS__Group__0__Impl"
    // InternalMyAtlProject.g:5295:1: rule__UnlimitedNaturalLiteralExpCS__Group__0__Impl : ( () ) ;
    public final void rule__UnlimitedNaturalLiteralExpCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5299:1: ( ( () ) )
            // InternalMyAtlProject.g:5300:1: ( () )
            {
            // InternalMyAtlProject.g:5300:1: ( () )
            // InternalMyAtlProject.g:5301:2: ()
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0()); 
            // InternalMyAtlProject.g:5302:2: ()
            // InternalMyAtlProject.g:5302:3: 
            {
            }

             after(grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnlimitedNaturalLiteralExpCS__Group__0__Impl"


    // $ANTLR start "rule__UnlimitedNaturalLiteralExpCS__Group__1"
    // InternalMyAtlProject.g:5310:1: rule__UnlimitedNaturalLiteralExpCS__Group__1 : rule__UnlimitedNaturalLiteralExpCS__Group__1__Impl ;
    public final void rule__UnlimitedNaturalLiteralExpCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5314:1: ( rule__UnlimitedNaturalLiteralExpCS__Group__1__Impl )
            // InternalMyAtlProject.g:5315:2: rule__UnlimitedNaturalLiteralExpCS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnlimitedNaturalLiteralExpCS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnlimitedNaturalLiteralExpCS__Group__1"


    // $ANTLR start "rule__UnlimitedNaturalLiteralExpCS__Group__1__Impl"
    // InternalMyAtlProject.g:5321:1: rule__UnlimitedNaturalLiteralExpCS__Group__1__Impl : ( '*' ) ;
    public final void rule__UnlimitedNaturalLiteralExpCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5325:1: ( ( '*' ) )
            // InternalMyAtlProject.g:5326:1: ( '*' )
            {
            // InternalMyAtlProject.g:5326:1: ( '*' )
            // InternalMyAtlProject.g:5327:2: '*'
            {
             before(grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getAsteriskKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnlimitedNaturalLiteralExpCS__Group__1__Impl"


    // $ANTLR start "rule__InvalidLiteralExpCS__Group__0"
    // InternalMyAtlProject.g:5337:1: rule__InvalidLiteralExpCS__Group__0 : rule__InvalidLiteralExpCS__Group__0__Impl rule__InvalidLiteralExpCS__Group__1 ;
    public final void rule__InvalidLiteralExpCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5341:1: ( rule__InvalidLiteralExpCS__Group__0__Impl rule__InvalidLiteralExpCS__Group__1 )
            // InternalMyAtlProject.g:5342:2: rule__InvalidLiteralExpCS__Group__0__Impl rule__InvalidLiteralExpCS__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__InvalidLiteralExpCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvalidLiteralExpCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvalidLiteralExpCS__Group__0"


    // $ANTLR start "rule__InvalidLiteralExpCS__Group__0__Impl"
    // InternalMyAtlProject.g:5349:1: rule__InvalidLiteralExpCS__Group__0__Impl : ( () ) ;
    public final void rule__InvalidLiteralExpCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5353:1: ( ( () ) )
            // InternalMyAtlProject.g:5354:1: ( () )
            {
            // InternalMyAtlProject.g:5354:1: ( () )
            // InternalMyAtlProject.g:5355:2: ()
            {
             before(grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0()); 
            // InternalMyAtlProject.g:5356:2: ()
            // InternalMyAtlProject.g:5356:3: 
            {
            }

             after(grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvalidLiteralExpCS__Group__0__Impl"


    // $ANTLR start "rule__InvalidLiteralExpCS__Group__1"
    // InternalMyAtlProject.g:5364:1: rule__InvalidLiteralExpCS__Group__1 : rule__InvalidLiteralExpCS__Group__1__Impl ;
    public final void rule__InvalidLiteralExpCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5368:1: ( rule__InvalidLiteralExpCS__Group__1__Impl )
            // InternalMyAtlProject.g:5369:2: rule__InvalidLiteralExpCS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InvalidLiteralExpCS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvalidLiteralExpCS__Group__1"


    // $ANTLR start "rule__InvalidLiteralExpCS__Group__1__Impl"
    // InternalMyAtlProject.g:5375:1: rule__InvalidLiteralExpCS__Group__1__Impl : ( 'invalid' ) ;
    public final void rule__InvalidLiteralExpCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5379:1: ( ( 'invalid' ) )
            // InternalMyAtlProject.g:5380:1: ( 'invalid' )
            {
            // InternalMyAtlProject.g:5380:1: ( 'invalid' )
            // InternalMyAtlProject.g:5381:2: 'invalid'
            {
             before(grammarAccess.getInvalidLiteralExpCSAccess().getInvalidKeyword_1()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getInvalidLiteralExpCSAccess().getInvalidKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvalidLiteralExpCS__Group__1__Impl"


    // $ANTLR start "rule__NullLiteralExpCS__Group__0"
    // InternalMyAtlProject.g:5391:1: rule__NullLiteralExpCS__Group__0 : rule__NullLiteralExpCS__Group__0__Impl rule__NullLiteralExpCS__Group__1 ;
    public final void rule__NullLiteralExpCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5395:1: ( rule__NullLiteralExpCS__Group__0__Impl rule__NullLiteralExpCS__Group__1 )
            // InternalMyAtlProject.g:5396:2: rule__NullLiteralExpCS__Group__0__Impl rule__NullLiteralExpCS__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__NullLiteralExpCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullLiteralExpCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteralExpCS__Group__0"


    // $ANTLR start "rule__NullLiteralExpCS__Group__0__Impl"
    // InternalMyAtlProject.g:5403:1: rule__NullLiteralExpCS__Group__0__Impl : ( () ) ;
    public final void rule__NullLiteralExpCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5407:1: ( ( () ) )
            // InternalMyAtlProject.g:5408:1: ( () )
            {
            // InternalMyAtlProject.g:5408:1: ( () )
            // InternalMyAtlProject.g:5409:2: ()
            {
             before(grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0()); 
            // InternalMyAtlProject.g:5410:2: ()
            // InternalMyAtlProject.g:5410:3: 
            {
            }

             after(grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteralExpCS__Group__0__Impl"


    // $ANTLR start "rule__NullLiteralExpCS__Group__1"
    // InternalMyAtlProject.g:5418:1: rule__NullLiteralExpCS__Group__1 : rule__NullLiteralExpCS__Group__1__Impl ;
    public final void rule__NullLiteralExpCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5422:1: ( rule__NullLiteralExpCS__Group__1__Impl )
            // InternalMyAtlProject.g:5423:2: rule__NullLiteralExpCS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NullLiteralExpCS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteralExpCS__Group__1"


    // $ANTLR start "rule__NullLiteralExpCS__Group__1__Impl"
    // InternalMyAtlProject.g:5429:1: rule__NullLiteralExpCS__Group__1__Impl : ( 'null' ) ;
    public final void rule__NullLiteralExpCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5433:1: ( ( 'null' ) )
            // InternalMyAtlProject.g:5434:1: ( 'null' )
            {
            // InternalMyAtlProject.g:5434:1: ( 'null' )
            // InternalMyAtlProject.g:5435:2: 'null'
            {
             before(grammarAccess.getNullLiteralExpCSAccess().getNullKeyword_1()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getNullLiteralExpCSAccess().getNullKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteralExpCS__Group__1__Impl"


    // $ANTLR start "rule__NavigatingArgCS__Group__0"
    // InternalMyAtlProject.g:5445:1: rule__NavigatingArgCS__Group__0 : rule__NavigatingArgCS__Group__0__Impl rule__NavigatingArgCS__Group__1 ;
    public final void rule__NavigatingArgCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5449:1: ( rule__NavigatingArgCS__Group__0__Impl rule__NavigatingArgCS__Group__1 )
            // InternalMyAtlProject.g:5450:2: rule__NavigatingArgCS__Group__0__Impl rule__NavigatingArgCS__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__NavigatingArgCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingArgCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingArgCS__Group__0"


    // $ANTLR start "rule__NavigatingArgCS__Group__0__Impl"
    // InternalMyAtlProject.g:5457:1: rule__NavigatingArgCS__Group__0__Impl : ( ( rule__NavigatingArgCS__NameAssignment_0 ) ) ;
    public final void rule__NavigatingArgCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5461:1: ( ( ( rule__NavigatingArgCS__NameAssignment_0 ) ) )
            // InternalMyAtlProject.g:5462:1: ( ( rule__NavigatingArgCS__NameAssignment_0 ) )
            {
            // InternalMyAtlProject.g:5462:1: ( ( rule__NavigatingArgCS__NameAssignment_0 ) )
            // InternalMyAtlProject.g:5463:2: ( rule__NavigatingArgCS__NameAssignment_0 )
            {
             before(grammarAccess.getNavigatingArgCSAccess().getNameAssignment_0()); 
            // InternalMyAtlProject.g:5464:2: ( rule__NavigatingArgCS__NameAssignment_0 )
            // InternalMyAtlProject.g:5464:3: rule__NavigatingArgCS__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingArgCS__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingArgCSAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingArgCS__Group__0__Impl"


    // $ANTLR start "rule__NavigatingArgCS__Group__1"
    // InternalMyAtlProject.g:5472:1: rule__NavigatingArgCS__Group__1 : rule__NavigatingArgCS__Group__1__Impl rule__NavigatingArgCS__Group__2 ;
    public final void rule__NavigatingArgCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5476:1: ( rule__NavigatingArgCS__Group__1__Impl rule__NavigatingArgCS__Group__2 )
            // InternalMyAtlProject.g:5477:2: rule__NavigatingArgCS__Group__1__Impl rule__NavigatingArgCS__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__NavigatingArgCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingArgCS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingArgCS__Group__1"


    // $ANTLR start "rule__NavigatingArgCS__Group__1__Impl"
    // InternalMyAtlProject.g:5484:1: rule__NavigatingArgCS__Group__1__Impl : ( ( rule__NavigatingArgCS__Group_1__0 )? ) ;
    public final void rule__NavigatingArgCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5488:1: ( ( ( rule__NavigatingArgCS__Group_1__0 )? ) )
            // InternalMyAtlProject.g:5489:1: ( ( rule__NavigatingArgCS__Group_1__0 )? )
            {
            // InternalMyAtlProject.g:5489:1: ( ( rule__NavigatingArgCS__Group_1__0 )? )
            // InternalMyAtlProject.g:5490:2: ( rule__NavigatingArgCS__Group_1__0 )?
            {
             before(grammarAccess.getNavigatingArgCSAccess().getGroup_1()); 
            // InternalMyAtlProject.g:5491:2: ( rule__NavigatingArgCS__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyAtlProject.g:5491:3: rule__NavigatingArgCS__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigatingArgCS__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavigatingArgCSAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingArgCS__Group__1__Impl"


    // $ANTLR start "rule__NavigatingArgCS__Group__2"
    // InternalMyAtlProject.g:5499:1: rule__NavigatingArgCS__Group__2 : rule__NavigatingArgCS__Group__2__Impl ;
    public final void rule__NavigatingArgCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5503:1: ( rule__NavigatingArgCS__Group__2__Impl )
            // InternalMyAtlProject.g:5504:2: rule__NavigatingArgCS__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingArgCS__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingArgCS__Group__2"


    // $ANTLR start "rule__NavigatingArgCS__Group__2__Impl"
    // InternalMyAtlProject.g:5510:1: rule__NavigatingArgCS__Group__2__Impl : ( ( rule__NavigatingArgCS__Group_2__0 )? ) ;
    public final void rule__NavigatingArgCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5514:1: ( ( ( rule__NavigatingArgCS__Group_2__0 )? ) )
            // InternalMyAtlProject.g:5515:1: ( ( rule__NavigatingArgCS__Group_2__0 )? )
            {
            // InternalMyAtlProject.g:5515:1: ( ( rule__NavigatingArgCS__Group_2__0 )? )
            // InternalMyAtlProject.g:5516:2: ( rule__NavigatingArgCS__Group_2__0 )?
            {
             before(grammarAccess.getNavigatingArgCSAccess().getGroup_2()); 
            // InternalMyAtlProject.g:5517:2: ( rule__NavigatingArgCS__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==23) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyAtlProject.g:5517:3: rule__NavigatingArgCS__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigatingArgCS__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavigatingArgCSAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingArgCS__Group__2__Impl"


    // $ANTLR start "rule__NavigatingArgCS__Group_1__0"
    // InternalMyAtlProject.g:5526:1: rule__NavigatingArgCS__Group_1__0 : rule__NavigatingArgCS__Group_1__0__Impl rule__NavigatingArgCS__Group_1__1 ;
    public final void rule__NavigatingArgCS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5530:1: ( rule__NavigatingArgCS__Group_1__0__Impl rule__NavigatingArgCS__Group_1__1 )
            // InternalMyAtlProject.g:5531:2: rule__NavigatingArgCS__Group_1__0__Impl rule__NavigatingArgCS__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__NavigatingArgCS__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingArgCS__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingArgCS__Group_1__0"


    // $ANTLR start "rule__NavigatingArgCS__Group_1__0__Impl"
    // InternalMyAtlProject.g:5538:1: rule__NavigatingArgCS__Group_1__0__Impl : ( ':' ) ;
    public final void rule__NavigatingArgCS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5542:1: ( ( ':' ) )
            // InternalMyAtlProject.g:5543:1: ( ':' )
            {
            // InternalMyAtlProject.g:5543:1: ( ':' )
            // InternalMyAtlProject.g:5544:2: ':'
            {
             before(grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingArgCS__Group_1__0__Impl"


    // $ANTLR start "rule__NavigatingArgCS__Group_1__1"
    // InternalMyAtlProject.g:5553:1: rule__NavigatingArgCS__Group_1__1 : rule__NavigatingArgCS__Group_1__1__Impl ;
    public final void rule__NavigatingArgCS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5557:1: ( rule__NavigatingArgCS__Group_1__1__Impl )
            // InternalMyAtlProject.g:5558:2: rule__NavigatingArgCS__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingArgCS__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingArgCS__Group_1__1"


    // $ANTLR start "rule__NavigatingArgCS__Group_1__1__Impl"
    // InternalMyAtlProject.g:5564:1: rule__NavigatingArgCS__Group_1__1__Impl : ( ( rule__NavigatingArgCS__OwnedTypeAssignment_1_1 ) ) ;
    public final void rule__NavigatingArgCS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5568:1: ( ( ( rule__NavigatingArgCS__OwnedTypeAssignment_1_1 ) ) )
            // InternalMyAtlProject.g:5569:1: ( ( rule__NavigatingArgCS__OwnedTypeAssignment_1_1 ) )
            {
            // InternalMyAtlProject.g:5569:1: ( ( rule__NavigatingArgCS__OwnedTypeAssignment_1_1 ) )
            // InternalMyAtlProject.g:5570:2: ( rule__NavigatingArgCS__OwnedTypeAssignment_1_1 )
            {
             before(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeAssignment_1_1()); 
            // InternalMyAtlProject.g:5571:2: ( rule__NavigatingArgCS__OwnedTypeAssignment_1_1 )
            // InternalMyAtlProject.g:5571:3: rule__NavigatingArgCS__OwnedTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingArgCS__OwnedTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingArgCS__Group_1__1__Impl"


    // $ANTLR start "rule__NavigatingArgCS__Group_2__0"
    // InternalMyAtlProject.g:5580:1: rule__NavigatingArgCS__Group_2__0 : rule__NavigatingArgCS__Group_2__0__Impl rule__NavigatingArgCS__Group_2__1 ;
    public final void rule__NavigatingArgCS__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5584:1: ( rule__NavigatingArgCS__Group_2__0__Impl rule__NavigatingArgCS__Group_2__1 )
            // InternalMyAtlProject.g:5585:2: rule__NavigatingArgCS__Group_2__0__Impl rule__NavigatingArgCS__Group_2__1
            {
            pushFollow(FOLLOW_33);
            rule__NavigatingArgCS__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingArgCS__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingArgCS__Group_2__0"


    // $ANTLR start "rule__NavigatingArgCS__Group_2__0__Impl"
    // InternalMyAtlProject.g:5592:1: rule__NavigatingArgCS__Group_2__0__Impl : ( '=' ) ;
    public final void rule__NavigatingArgCS__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5596:1: ( ( '=' ) )
            // InternalMyAtlProject.g:5597:1: ( '=' )
            {
            // InternalMyAtlProject.g:5597:1: ( '=' )
            // InternalMyAtlProject.g:5598:2: '='
            {
             before(grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingArgCS__Group_2__0__Impl"


    // $ANTLR start "rule__NavigatingArgCS__Group_2__1"
    // InternalMyAtlProject.g:5607:1: rule__NavigatingArgCS__Group_2__1 : rule__NavigatingArgCS__Group_2__1__Impl ;
    public final void rule__NavigatingArgCS__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5611:1: ( rule__NavigatingArgCS__Group_2__1__Impl )
            // InternalMyAtlProject.g:5612:2: rule__NavigatingArgCS__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingArgCS__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingArgCS__Group_2__1"


    // $ANTLR start "rule__NavigatingArgCS__Group_2__1__Impl"
    // InternalMyAtlProject.g:5618:1: rule__NavigatingArgCS__Group_2__1__Impl : ( ( rule__NavigatingArgCS__InitAssignment_2_1 ) ) ;
    public final void rule__NavigatingArgCS__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5622:1: ( ( ( rule__NavigatingArgCS__InitAssignment_2_1 ) ) )
            // InternalMyAtlProject.g:5623:1: ( ( rule__NavigatingArgCS__InitAssignment_2_1 ) )
            {
            // InternalMyAtlProject.g:5623:1: ( ( rule__NavigatingArgCS__InitAssignment_2_1 ) )
            // InternalMyAtlProject.g:5624:2: ( rule__NavigatingArgCS__InitAssignment_2_1 )
            {
             before(grammarAccess.getNavigatingArgCSAccess().getInitAssignment_2_1()); 
            // InternalMyAtlProject.g:5625:2: ( rule__NavigatingArgCS__InitAssignment_2_1 )
            // InternalMyAtlProject.g:5625:3: rule__NavigatingArgCS__InitAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingArgCS__InitAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingArgCSAccess().getInitAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingArgCS__Group_2__1__Impl"


    // $ANTLR start "rule__NavigatingBarArgCS__Group__0"
    // InternalMyAtlProject.g:5634:1: rule__NavigatingBarArgCS__Group__0 : rule__NavigatingBarArgCS__Group__0__Impl rule__NavigatingBarArgCS__Group__1 ;
    public final void rule__NavigatingBarArgCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5638:1: ( rule__NavigatingBarArgCS__Group__0__Impl rule__NavigatingBarArgCS__Group__1 )
            // InternalMyAtlProject.g:5639:2: rule__NavigatingBarArgCS__Group__0__Impl rule__NavigatingBarArgCS__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__NavigatingBarArgCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingBarArgCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__Group__0"


    // $ANTLR start "rule__NavigatingBarArgCS__Group__0__Impl"
    // InternalMyAtlProject.g:5646:1: rule__NavigatingBarArgCS__Group__0__Impl : ( ( rule__NavigatingBarArgCS__PrefixAssignment_0 ) ) ;
    public final void rule__NavigatingBarArgCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5650:1: ( ( ( rule__NavigatingBarArgCS__PrefixAssignment_0 ) ) )
            // InternalMyAtlProject.g:5651:1: ( ( rule__NavigatingBarArgCS__PrefixAssignment_0 ) )
            {
            // InternalMyAtlProject.g:5651:1: ( ( rule__NavigatingBarArgCS__PrefixAssignment_0 ) )
            // InternalMyAtlProject.g:5652:2: ( rule__NavigatingBarArgCS__PrefixAssignment_0 )
            {
             before(grammarAccess.getNavigatingBarArgCSAccess().getPrefixAssignment_0()); 
            // InternalMyAtlProject.g:5653:2: ( rule__NavigatingBarArgCS__PrefixAssignment_0 )
            // InternalMyAtlProject.g:5653:3: rule__NavigatingBarArgCS__PrefixAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingBarArgCS__PrefixAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingBarArgCSAccess().getPrefixAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__Group__0__Impl"


    // $ANTLR start "rule__NavigatingBarArgCS__Group__1"
    // InternalMyAtlProject.g:5661:1: rule__NavigatingBarArgCS__Group__1 : rule__NavigatingBarArgCS__Group__1__Impl rule__NavigatingBarArgCS__Group__2 ;
    public final void rule__NavigatingBarArgCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5665:1: ( rule__NavigatingBarArgCS__Group__1__Impl rule__NavigatingBarArgCS__Group__2 )
            // InternalMyAtlProject.g:5666:2: rule__NavigatingBarArgCS__Group__1__Impl rule__NavigatingBarArgCS__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__NavigatingBarArgCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingBarArgCS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__Group__1"


    // $ANTLR start "rule__NavigatingBarArgCS__Group__1__Impl"
    // InternalMyAtlProject.g:5673:1: rule__NavigatingBarArgCS__Group__1__Impl : ( ( rule__NavigatingBarArgCS__NameAssignment_1 ) ) ;
    public final void rule__NavigatingBarArgCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5677:1: ( ( ( rule__NavigatingBarArgCS__NameAssignment_1 ) ) )
            // InternalMyAtlProject.g:5678:1: ( ( rule__NavigatingBarArgCS__NameAssignment_1 ) )
            {
            // InternalMyAtlProject.g:5678:1: ( ( rule__NavigatingBarArgCS__NameAssignment_1 ) )
            // InternalMyAtlProject.g:5679:2: ( rule__NavigatingBarArgCS__NameAssignment_1 )
            {
             before(grammarAccess.getNavigatingBarArgCSAccess().getNameAssignment_1()); 
            // InternalMyAtlProject.g:5680:2: ( rule__NavigatingBarArgCS__NameAssignment_1 )
            // InternalMyAtlProject.g:5680:3: rule__NavigatingBarArgCS__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingBarArgCS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingBarArgCSAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__Group__1__Impl"


    // $ANTLR start "rule__NavigatingBarArgCS__Group__2"
    // InternalMyAtlProject.g:5688:1: rule__NavigatingBarArgCS__Group__2 : rule__NavigatingBarArgCS__Group__2__Impl rule__NavigatingBarArgCS__Group__3 ;
    public final void rule__NavigatingBarArgCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5692:1: ( rule__NavigatingBarArgCS__Group__2__Impl rule__NavigatingBarArgCS__Group__3 )
            // InternalMyAtlProject.g:5693:2: rule__NavigatingBarArgCS__Group__2__Impl rule__NavigatingBarArgCS__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__NavigatingBarArgCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingBarArgCS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__Group__2"


    // $ANTLR start "rule__NavigatingBarArgCS__Group__2__Impl"
    // InternalMyAtlProject.g:5700:1: rule__NavigatingBarArgCS__Group__2__Impl : ( ( rule__NavigatingBarArgCS__Group_2__0 )? ) ;
    public final void rule__NavigatingBarArgCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5704:1: ( ( ( rule__NavigatingBarArgCS__Group_2__0 )? ) )
            // InternalMyAtlProject.g:5705:1: ( ( rule__NavigatingBarArgCS__Group_2__0 )? )
            {
            // InternalMyAtlProject.g:5705:1: ( ( rule__NavigatingBarArgCS__Group_2__0 )? )
            // InternalMyAtlProject.g:5706:2: ( rule__NavigatingBarArgCS__Group_2__0 )?
            {
             before(grammarAccess.getNavigatingBarArgCSAccess().getGroup_2()); 
            // InternalMyAtlProject.g:5707:2: ( rule__NavigatingBarArgCS__Group_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyAtlProject.g:5707:3: rule__NavigatingBarArgCS__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigatingBarArgCS__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavigatingBarArgCSAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__Group__2__Impl"


    // $ANTLR start "rule__NavigatingBarArgCS__Group__3"
    // InternalMyAtlProject.g:5715:1: rule__NavigatingBarArgCS__Group__3 : rule__NavigatingBarArgCS__Group__3__Impl ;
    public final void rule__NavigatingBarArgCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5719:1: ( rule__NavigatingBarArgCS__Group__3__Impl )
            // InternalMyAtlProject.g:5720:2: rule__NavigatingBarArgCS__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingBarArgCS__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__Group__3"


    // $ANTLR start "rule__NavigatingBarArgCS__Group__3__Impl"
    // InternalMyAtlProject.g:5726:1: rule__NavigatingBarArgCS__Group__3__Impl : ( ( rule__NavigatingBarArgCS__Group_3__0 )? ) ;
    public final void rule__NavigatingBarArgCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5730:1: ( ( ( rule__NavigatingBarArgCS__Group_3__0 )? ) )
            // InternalMyAtlProject.g:5731:1: ( ( rule__NavigatingBarArgCS__Group_3__0 )? )
            {
            // InternalMyAtlProject.g:5731:1: ( ( rule__NavigatingBarArgCS__Group_3__0 )? )
            // InternalMyAtlProject.g:5732:2: ( rule__NavigatingBarArgCS__Group_3__0 )?
            {
             before(grammarAccess.getNavigatingBarArgCSAccess().getGroup_3()); 
            // InternalMyAtlProject.g:5733:2: ( rule__NavigatingBarArgCS__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==23) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyAtlProject.g:5733:3: rule__NavigatingBarArgCS__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigatingBarArgCS__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavigatingBarArgCSAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__Group__3__Impl"


    // $ANTLR start "rule__NavigatingBarArgCS__Group_2__0"
    // InternalMyAtlProject.g:5742:1: rule__NavigatingBarArgCS__Group_2__0 : rule__NavigatingBarArgCS__Group_2__0__Impl rule__NavigatingBarArgCS__Group_2__1 ;
    public final void rule__NavigatingBarArgCS__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5746:1: ( rule__NavigatingBarArgCS__Group_2__0__Impl rule__NavigatingBarArgCS__Group_2__1 )
            // InternalMyAtlProject.g:5747:2: rule__NavigatingBarArgCS__Group_2__0__Impl rule__NavigatingBarArgCS__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__NavigatingBarArgCS__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingBarArgCS__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__Group_2__0"


    // $ANTLR start "rule__NavigatingBarArgCS__Group_2__0__Impl"
    // InternalMyAtlProject.g:5754:1: rule__NavigatingBarArgCS__Group_2__0__Impl : ( ':' ) ;
    public final void rule__NavigatingBarArgCS__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5758:1: ( ( ':' ) )
            // InternalMyAtlProject.g:5759:1: ( ':' )
            {
            // InternalMyAtlProject.g:5759:1: ( ':' )
            // InternalMyAtlProject.g:5760:2: ':'
            {
             before(grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__Group_2__0__Impl"


    // $ANTLR start "rule__NavigatingBarArgCS__Group_2__1"
    // InternalMyAtlProject.g:5769:1: rule__NavigatingBarArgCS__Group_2__1 : rule__NavigatingBarArgCS__Group_2__1__Impl ;
    public final void rule__NavigatingBarArgCS__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5773:1: ( rule__NavigatingBarArgCS__Group_2__1__Impl )
            // InternalMyAtlProject.g:5774:2: rule__NavigatingBarArgCS__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingBarArgCS__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__Group_2__1"


    // $ANTLR start "rule__NavigatingBarArgCS__Group_2__1__Impl"
    // InternalMyAtlProject.g:5780:1: rule__NavigatingBarArgCS__Group_2__1__Impl : ( ( rule__NavigatingBarArgCS__OwnedTypeAssignment_2_1 ) ) ;
    public final void rule__NavigatingBarArgCS__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5784:1: ( ( ( rule__NavigatingBarArgCS__OwnedTypeAssignment_2_1 ) ) )
            // InternalMyAtlProject.g:5785:1: ( ( rule__NavigatingBarArgCS__OwnedTypeAssignment_2_1 ) )
            {
            // InternalMyAtlProject.g:5785:1: ( ( rule__NavigatingBarArgCS__OwnedTypeAssignment_2_1 ) )
            // InternalMyAtlProject.g:5786:2: ( rule__NavigatingBarArgCS__OwnedTypeAssignment_2_1 )
            {
             before(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeAssignment_2_1()); 
            // InternalMyAtlProject.g:5787:2: ( rule__NavigatingBarArgCS__OwnedTypeAssignment_2_1 )
            // InternalMyAtlProject.g:5787:3: rule__NavigatingBarArgCS__OwnedTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingBarArgCS__OwnedTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__Group_2__1__Impl"


    // $ANTLR start "rule__NavigatingBarArgCS__Group_3__0"
    // InternalMyAtlProject.g:5796:1: rule__NavigatingBarArgCS__Group_3__0 : rule__NavigatingBarArgCS__Group_3__0__Impl rule__NavigatingBarArgCS__Group_3__1 ;
    public final void rule__NavigatingBarArgCS__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5800:1: ( rule__NavigatingBarArgCS__Group_3__0__Impl rule__NavigatingBarArgCS__Group_3__1 )
            // InternalMyAtlProject.g:5801:2: rule__NavigatingBarArgCS__Group_3__0__Impl rule__NavigatingBarArgCS__Group_3__1
            {
            pushFollow(FOLLOW_33);
            rule__NavigatingBarArgCS__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingBarArgCS__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__Group_3__0"


    // $ANTLR start "rule__NavigatingBarArgCS__Group_3__0__Impl"
    // InternalMyAtlProject.g:5808:1: rule__NavigatingBarArgCS__Group_3__0__Impl : ( '=' ) ;
    public final void rule__NavigatingBarArgCS__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5812:1: ( ( '=' ) )
            // InternalMyAtlProject.g:5813:1: ( '=' )
            {
            // InternalMyAtlProject.g:5813:1: ( '=' )
            // InternalMyAtlProject.g:5814:2: '='
            {
             before(grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__Group_3__0__Impl"


    // $ANTLR start "rule__NavigatingBarArgCS__Group_3__1"
    // InternalMyAtlProject.g:5823:1: rule__NavigatingBarArgCS__Group_3__1 : rule__NavigatingBarArgCS__Group_3__1__Impl ;
    public final void rule__NavigatingBarArgCS__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5827:1: ( rule__NavigatingBarArgCS__Group_3__1__Impl )
            // InternalMyAtlProject.g:5828:2: rule__NavigatingBarArgCS__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingBarArgCS__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__Group_3__1"


    // $ANTLR start "rule__NavigatingBarArgCS__Group_3__1__Impl"
    // InternalMyAtlProject.g:5834:1: rule__NavigatingBarArgCS__Group_3__1__Impl : ( ( rule__NavigatingBarArgCS__InitAssignment_3_1 ) ) ;
    public final void rule__NavigatingBarArgCS__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5838:1: ( ( ( rule__NavigatingBarArgCS__InitAssignment_3_1 ) ) )
            // InternalMyAtlProject.g:5839:1: ( ( rule__NavigatingBarArgCS__InitAssignment_3_1 ) )
            {
            // InternalMyAtlProject.g:5839:1: ( ( rule__NavigatingBarArgCS__InitAssignment_3_1 ) )
            // InternalMyAtlProject.g:5840:2: ( rule__NavigatingBarArgCS__InitAssignment_3_1 )
            {
             before(grammarAccess.getNavigatingBarArgCSAccess().getInitAssignment_3_1()); 
            // InternalMyAtlProject.g:5841:2: ( rule__NavigatingBarArgCS__InitAssignment_3_1 )
            // InternalMyAtlProject.g:5841:3: rule__NavigatingBarArgCS__InitAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingBarArgCS__InitAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingBarArgCSAccess().getInitAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__Group_3__1__Impl"


    // $ANTLR start "rule__NavigatingCommaArgCS__Group__0"
    // InternalMyAtlProject.g:5850:1: rule__NavigatingCommaArgCS__Group__0 : rule__NavigatingCommaArgCS__Group__0__Impl rule__NavigatingCommaArgCS__Group__1 ;
    public final void rule__NavigatingCommaArgCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5854:1: ( rule__NavigatingCommaArgCS__Group__0__Impl rule__NavigatingCommaArgCS__Group__1 )
            // InternalMyAtlProject.g:5855:2: rule__NavigatingCommaArgCS__Group__0__Impl rule__NavigatingCommaArgCS__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__NavigatingCommaArgCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingCommaArgCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__Group__0"


    // $ANTLR start "rule__NavigatingCommaArgCS__Group__0__Impl"
    // InternalMyAtlProject.g:5862:1: rule__NavigatingCommaArgCS__Group__0__Impl : ( ( rule__NavigatingCommaArgCS__PrefixAssignment_0 ) ) ;
    public final void rule__NavigatingCommaArgCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5866:1: ( ( ( rule__NavigatingCommaArgCS__PrefixAssignment_0 ) ) )
            // InternalMyAtlProject.g:5867:1: ( ( rule__NavigatingCommaArgCS__PrefixAssignment_0 ) )
            {
            // InternalMyAtlProject.g:5867:1: ( ( rule__NavigatingCommaArgCS__PrefixAssignment_0 ) )
            // InternalMyAtlProject.g:5868:2: ( rule__NavigatingCommaArgCS__PrefixAssignment_0 )
            {
             before(grammarAccess.getNavigatingCommaArgCSAccess().getPrefixAssignment_0()); 
            // InternalMyAtlProject.g:5869:2: ( rule__NavigatingCommaArgCS__PrefixAssignment_0 )
            // InternalMyAtlProject.g:5869:3: rule__NavigatingCommaArgCS__PrefixAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingCommaArgCS__PrefixAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingCommaArgCSAccess().getPrefixAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__Group__0__Impl"


    // $ANTLR start "rule__NavigatingCommaArgCS__Group__1"
    // InternalMyAtlProject.g:5877:1: rule__NavigatingCommaArgCS__Group__1 : rule__NavigatingCommaArgCS__Group__1__Impl rule__NavigatingCommaArgCS__Group__2 ;
    public final void rule__NavigatingCommaArgCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5881:1: ( rule__NavigatingCommaArgCS__Group__1__Impl rule__NavigatingCommaArgCS__Group__2 )
            // InternalMyAtlProject.g:5882:2: rule__NavigatingCommaArgCS__Group__1__Impl rule__NavigatingCommaArgCS__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__NavigatingCommaArgCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingCommaArgCS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__Group__1"


    // $ANTLR start "rule__NavigatingCommaArgCS__Group__1__Impl"
    // InternalMyAtlProject.g:5889:1: rule__NavigatingCommaArgCS__Group__1__Impl : ( ( rule__NavigatingCommaArgCS__NameAssignment_1 ) ) ;
    public final void rule__NavigatingCommaArgCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5893:1: ( ( ( rule__NavigatingCommaArgCS__NameAssignment_1 ) ) )
            // InternalMyAtlProject.g:5894:1: ( ( rule__NavigatingCommaArgCS__NameAssignment_1 ) )
            {
            // InternalMyAtlProject.g:5894:1: ( ( rule__NavigatingCommaArgCS__NameAssignment_1 ) )
            // InternalMyAtlProject.g:5895:2: ( rule__NavigatingCommaArgCS__NameAssignment_1 )
            {
             before(grammarAccess.getNavigatingCommaArgCSAccess().getNameAssignment_1()); 
            // InternalMyAtlProject.g:5896:2: ( rule__NavigatingCommaArgCS__NameAssignment_1 )
            // InternalMyAtlProject.g:5896:3: rule__NavigatingCommaArgCS__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingCommaArgCS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingCommaArgCSAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__Group__1__Impl"


    // $ANTLR start "rule__NavigatingCommaArgCS__Group__2"
    // InternalMyAtlProject.g:5904:1: rule__NavigatingCommaArgCS__Group__2 : rule__NavigatingCommaArgCS__Group__2__Impl rule__NavigatingCommaArgCS__Group__3 ;
    public final void rule__NavigatingCommaArgCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5908:1: ( rule__NavigatingCommaArgCS__Group__2__Impl rule__NavigatingCommaArgCS__Group__3 )
            // InternalMyAtlProject.g:5909:2: rule__NavigatingCommaArgCS__Group__2__Impl rule__NavigatingCommaArgCS__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__NavigatingCommaArgCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingCommaArgCS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__Group__2"


    // $ANTLR start "rule__NavigatingCommaArgCS__Group__2__Impl"
    // InternalMyAtlProject.g:5916:1: rule__NavigatingCommaArgCS__Group__2__Impl : ( ( rule__NavigatingCommaArgCS__Group_2__0 )? ) ;
    public final void rule__NavigatingCommaArgCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5920:1: ( ( ( rule__NavigatingCommaArgCS__Group_2__0 )? ) )
            // InternalMyAtlProject.g:5921:1: ( ( rule__NavigatingCommaArgCS__Group_2__0 )? )
            {
            // InternalMyAtlProject.g:5921:1: ( ( rule__NavigatingCommaArgCS__Group_2__0 )? )
            // InternalMyAtlProject.g:5922:2: ( rule__NavigatingCommaArgCS__Group_2__0 )?
            {
             before(grammarAccess.getNavigatingCommaArgCSAccess().getGroup_2()); 
            // InternalMyAtlProject.g:5923:2: ( rule__NavigatingCommaArgCS__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==49) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyAtlProject.g:5923:3: rule__NavigatingCommaArgCS__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigatingCommaArgCS__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavigatingCommaArgCSAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__Group__2__Impl"


    // $ANTLR start "rule__NavigatingCommaArgCS__Group__3"
    // InternalMyAtlProject.g:5931:1: rule__NavigatingCommaArgCS__Group__3 : rule__NavigatingCommaArgCS__Group__3__Impl ;
    public final void rule__NavigatingCommaArgCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5935:1: ( rule__NavigatingCommaArgCS__Group__3__Impl )
            // InternalMyAtlProject.g:5936:2: rule__NavigatingCommaArgCS__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingCommaArgCS__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__Group__3"


    // $ANTLR start "rule__NavigatingCommaArgCS__Group__3__Impl"
    // InternalMyAtlProject.g:5942:1: rule__NavigatingCommaArgCS__Group__3__Impl : ( ( rule__NavigatingCommaArgCS__Group_3__0 )? ) ;
    public final void rule__NavigatingCommaArgCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5946:1: ( ( ( rule__NavigatingCommaArgCS__Group_3__0 )? ) )
            // InternalMyAtlProject.g:5947:1: ( ( rule__NavigatingCommaArgCS__Group_3__0 )? )
            {
            // InternalMyAtlProject.g:5947:1: ( ( rule__NavigatingCommaArgCS__Group_3__0 )? )
            // InternalMyAtlProject.g:5948:2: ( rule__NavigatingCommaArgCS__Group_3__0 )?
            {
             before(grammarAccess.getNavigatingCommaArgCSAccess().getGroup_3()); 
            // InternalMyAtlProject.g:5949:2: ( rule__NavigatingCommaArgCS__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==23) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyAtlProject.g:5949:3: rule__NavigatingCommaArgCS__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigatingCommaArgCS__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavigatingCommaArgCSAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__Group__3__Impl"


    // $ANTLR start "rule__NavigatingCommaArgCS__Group_2__0"
    // InternalMyAtlProject.g:5958:1: rule__NavigatingCommaArgCS__Group_2__0 : rule__NavigatingCommaArgCS__Group_2__0__Impl rule__NavigatingCommaArgCS__Group_2__1 ;
    public final void rule__NavigatingCommaArgCS__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5962:1: ( rule__NavigatingCommaArgCS__Group_2__0__Impl rule__NavigatingCommaArgCS__Group_2__1 )
            // InternalMyAtlProject.g:5963:2: rule__NavigatingCommaArgCS__Group_2__0__Impl rule__NavigatingCommaArgCS__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__NavigatingCommaArgCS__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingCommaArgCS__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__Group_2__0"


    // $ANTLR start "rule__NavigatingCommaArgCS__Group_2__0__Impl"
    // InternalMyAtlProject.g:5970:1: rule__NavigatingCommaArgCS__Group_2__0__Impl : ( ':' ) ;
    public final void rule__NavigatingCommaArgCS__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5974:1: ( ( ':' ) )
            // InternalMyAtlProject.g:5975:1: ( ':' )
            {
            // InternalMyAtlProject.g:5975:1: ( ':' )
            // InternalMyAtlProject.g:5976:2: ':'
            {
             before(grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__Group_2__0__Impl"


    // $ANTLR start "rule__NavigatingCommaArgCS__Group_2__1"
    // InternalMyAtlProject.g:5985:1: rule__NavigatingCommaArgCS__Group_2__1 : rule__NavigatingCommaArgCS__Group_2__1__Impl ;
    public final void rule__NavigatingCommaArgCS__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:5989:1: ( rule__NavigatingCommaArgCS__Group_2__1__Impl )
            // InternalMyAtlProject.g:5990:2: rule__NavigatingCommaArgCS__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingCommaArgCS__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__Group_2__1"


    // $ANTLR start "rule__NavigatingCommaArgCS__Group_2__1__Impl"
    // InternalMyAtlProject.g:5996:1: rule__NavigatingCommaArgCS__Group_2__1__Impl : ( ( rule__NavigatingCommaArgCS__OwnedTypeAssignment_2_1 ) ) ;
    public final void rule__NavigatingCommaArgCS__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6000:1: ( ( ( rule__NavigatingCommaArgCS__OwnedTypeAssignment_2_1 ) ) )
            // InternalMyAtlProject.g:6001:1: ( ( rule__NavigatingCommaArgCS__OwnedTypeAssignment_2_1 ) )
            {
            // InternalMyAtlProject.g:6001:1: ( ( rule__NavigatingCommaArgCS__OwnedTypeAssignment_2_1 ) )
            // InternalMyAtlProject.g:6002:2: ( rule__NavigatingCommaArgCS__OwnedTypeAssignment_2_1 )
            {
             before(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeAssignment_2_1()); 
            // InternalMyAtlProject.g:6003:2: ( rule__NavigatingCommaArgCS__OwnedTypeAssignment_2_1 )
            // InternalMyAtlProject.g:6003:3: rule__NavigatingCommaArgCS__OwnedTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingCommaArgCS__OwnedTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__Group_2__1__Impl"


    // $ANTLR start "rule__NavigatingCommaArgCS__Group_3__0"
    // InternalMyAtlProject.g:6012:1: rule__NavigatingCommaArgCS__Group_3__0 : rule__NavigatingCommaArgCS__Group_3__0__Impl rule__NavigatingCommaArgCS__Group_3__1 ;
    public final void rule__NavigatingCommaArgCS__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6016:1: ( rule__NavigatingCommaArgCS__Group_3__0__Impl rule__NavigatingCommaArgCS__Group_3__1 )
            // InternalMyAtlProject.g:6017:2: rule__NavigatingCommaArgCS__Group_3__0__Impl rule__NavigatingCommaArgCS__Group_3__1
            {
            pushFollow(FOLLOW_33);
            rule__NavigatingCommaArgCS__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingCommaArgCS__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__Group_3__0"


    // $ANTLR start "rule__NavigatingCommaArgCS__Group_3__0__Impl"
    // InternalMyAtlProject.g:6024:1: rule__NavigatingCommaArgCS__Group_3__0__Impl : ( '=' ) ;
    public final void rule__NavigatingCommaArgCS__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6028:1: ( ( '=' ) )
            // InternalMyAtlProject.g:6029:1: ( '=' )
            {
            // InternalMyAtlProject.g:6029:1: ( '=' )
            // InternalMyAtlProject.g:6030:2: '='
            {
             before(grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__Group_3__0__Impl"


    // $ANTLR start "rule__NavigatingCommaArgCS__Group_3__1"
    // InternalMyAtlProject.g:6039:1: rule__NavigatingCommaArgCS__Group_3__1 : rule__NavigatingCommaArgCS__Group_3__1__Impl ;
    public final void rule__NavigatingCommaArgCS__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6043:1: ( rule__NavigatingCommaArgCS__Group_3__1__Impl )
            // InternalMyAtlProject.g:6044:2: rule__NavigatingCommaArgCS__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingCommaArgCS__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__Group_3__1"


    // $ANTLR start "rule__NavigatingCommaArgCS__Group_3__1__Impl"
    // InternalMyAtlProject.g:6050:1: rule__NavigatingCommaArgCS__Group_3__1__Impl : ( ( rule__NavigatingCommaArgCS__InitAssignment_3_1 ) ) ;
    public final void rule__NavigatingCommaArgCS__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6054:1: ( ( ( rule__NavigatingCommaArgCS__InitAssignment_3_1 ) ) )
            // InternalMyAtlProject.g:6055:1: ( ( rule__NavigatingCommaArgCS__InitAssignment_3_1 ) )
            {
            // InternalMyAtlProject.g:6055:1: ( ( rule__NavigatingCommaArgCS__InitAssignment_3_1 ) )
            // InternalMyAtlProject.g:6056:2: ( rule__NavigatingCommaArgCS__InitAssignment_3_1 )
            {
             before(grammarAccess.getNavigatingCommaArgCSAccess().getInitAssignment_3_1()); 
            // InternalMyAtlProject.g:6057:2: ( rule__NavigatingCommaArgCS__InitAssignment_3_1 )
            // InternalMyAtlProject.g:6057:3: rule__NavigatingCommaArgCS__InitAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingCommaArgCS__InitAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingCommaArgCSAccess().getInitAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__Group_3__1__Impl"


    // $ANTLR start "rule__NavigatingSemiArgCS__Group__0"
    // InternalMyAtlProject.g:6066:1: rule__NavigatingSemiArgCS__Group__0 : rule__NavigatingSemiArgCS__Group__0__Impl rule__NavigatingSemiArgCS__Group__1 ;
    public final void rule__NavigatingSemiArgCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6070:1: ( rule__NavigatingSemiArgCS__Group__0__Impl rule__NavigatingSemiArgCS__Group__1 )
            // InternalMyAtlProject.g:6071:2: rule__NavigatingSemiArgCS__Group__0__Impl rule__NavigatingSemiArgCS__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__NavigatingSemiArgCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingSemiArgCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__Group__0"


    // $ANTLR start "rule__NavigatingSemiArgCS__Group__0__Impl"
    // InternalMyAtlProject.g:6078:1: rule__NavigatingSemiArgCS__Group__0__Impl : ( ( rule__NavigatingSemiArgCS__PrefixAssignment_0 ) ) ;
    public final void rule__NavigatingSemiArgCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6082:1: ( ( ( rule__NavigatingSemiArgCS__PrefixAssignment_0 ) ) )
            // InternalMyAtlProject.g:6083:1: ( ( rule__NavigatingSemiArgCS__PrefixAssignment_0 ) )
            {
            // InternalMyAtlProject.g:6083:1: ( ( rule__NavigatingSemiArgCS__PrefixAssignment_0 ) )
            // InternalMyAtlProject.g:6084:2: ( rule__NavigatingSemiArgCS__PrefixAssignment_0 )
            {
             before(grammarAccess.getNavigatingSemiArgCSAccess().getPrefixAssignment_0()); 
            // InternalMyAtlProject.g:6085:2: ( rule__NavigatingSemiArgCS__PrefixAssignment_0 )
            // InternalMyAtlProject.g:6085:3: rule__NavigatingSemiArgCS__PrefixAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingSemiArgCS__PrefixAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingSemiArgCSAccess().getPrefixAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__Group__0__Impl"


    // $ANTLR start "rule__NavigatingSemiArgCS__Group__1"
    // InternalMyAtlProject.g:6093:1: rule__NavigatingSemiArgCS__Group__1 : rule__NavigatingSemiArgCS__Group__1__Impl rule__NavigatingSemiArgCS__Group__2 ;
    public final void rule__NavigatingSemiArgCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6097:1: ( rule__NavigatingSemiArgCS__Group__1__Impl rule__NavigatingSemiArgCS__Group__2 )
            // InternalMyAtlProject.g:6098:2: rule__NavigatingSemiArgCS__Group__1__Impl rule__NavigatingSemiArgCS__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__NavigatingSemiArgCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingSemiArgCS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__Group__1"


    // $ANTLR start "rule__NavigatingSemiArgCS__Group__1__Impl"
    // InternalMyAtlProject.g:6105:1: rule__NavigatingSemiArgCS__Group__1__Impl : ( ( rule__NavigatingSemiArgCS__NameAssignment_1 ) ) ;
    public final void rule__NavigatingSemiArgCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6109:1: ( ( ( rule__NavigatingSemiArgCS__NameAssignment_1 ) ) )
            // InternalMyAtlProject.g:6110:1: ( ( rule__NavigatingSemiArgCS__NameAssignment_1 ) )
            {
            // InternalMyAtlProject.g:6110:1: ( ( rule__NavigatingSemiArgCS__NameAssignment_1 ) )
            // InternalMyAtlProject.g:6111:2: ( rule__NavigatingSemiArgCS__NameAssignment_1 )
            {
             before(grammarAccess.getNavigatingSemiArgCSAccess().getNameAssignment_1()); 
            // InternalMyAtlProject.g:6112:2: ( rule__NavigatingSemiArgCS__NameAssignment_1 )
            // InternalMyAtlProject.g:6112:3: rule__NavigatingSemiArgCS__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingSemiArgCS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingSemiArgCSAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__Group__1__Impl"


    // $ANTLR start "rule__NavigatingSemiArgCS__Group__2"
    // InternalMyAtlProject.g:6120:1: rule__NavigatingSemiArgCS__Group__2 : rule__NavigatingSemiArgCS__Group__2__Impl rule__NavigatingSemiArgCS__Group__3 ;
    public final void rule__NavigatingSemiArgCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6124:1: ( rule__NavigatingSemiArgCS__Group__2__Impl rule__NavigatingSemiArgCS__Group__3 )
            // InternalMyAtlProject.g:6125:2: rule__NavigatingSemiArgCS__Group__2__Impl rule__NavigatingSemiArgCS__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__NavigatingSemiArgCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingSemiArgCS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__Group__2"


    // $ANTLR start "rule__NavigatingSemiArgCS__Group__2__Impl"
    // InternalMyAtlProject.g:6132:1: rule__NavigatingSemiArgCS__Group__2__Impl : ( ( rule__NavigatingSemiArgCS__Group_2__0 )? ) ;
    public final void rule__NavigatingSemiArgCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6136:1: ( ( ( rule__NavigatingSemiArgCS__Group_2__0 )? ) )
            // InternalMyAtlProject.g:6137:1: ( ( rule__NavigatingSemiArgCS__Group_2__0 )? )
            {
            // InternalMyAtlProject.g:6137:1: ( ( rule__NavigatingSemiArgCS__Group_2__0 )? )
            // InternalMyAtlProject.g:6138:2: ( rule__NavigatingSemiArgCS__Group_2__0 )?
            {
             before(grammarAccess.getNavigatingSemiArgCSAccess().getGroup_2()); 
            // InternalMyAtlProject.g:6139:2: ( rule__NavigatingSemiArgCS__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==49) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyAtlProject.g:6139:3: rule__NavigatingSemiArgCS__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigatingSemiArgCS__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavigatingSemiArgCSAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__Group__2__Impl"


    // $ANTLR start "rule__NavigatingSemiArgCS__Group__3"
    // InternalMyAtlProject.g:6147:1: rule__NavigatingSemiArgCS__Group__3 : rule__NavigatingSemiArgCS__Group__3__Impl ;
    public final void rule__NavigatingSemiArgCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6151:1: ( rule__NavigatingSemiArgCS__Group__3__Impl )
            // InternalMyAtlProject.g:6152:2: rule__NavigatingSemiArgCS__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingSemiArgCS__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__Group__3"


    // $ANTLR start "rule__NavigatingSemiArgCS__Group__3__Impl"
    // InternalMyAtlProject.g:6158:1: rule__NavigatingSemiArgCS__Group__3__Impl : ( ( rule__NavigatingSemiArgCS__Group_3__0 )? ) ;
    public final void rule__NavigatingSemiArgCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6162:1: ( ( ( rule__NavigatingSemiArgCS__Group_3__0 )? ) )
            // InternalMyAtlProject.g:6163:1: ( ( rule__NavigatingSemiArgCS__Group_3__0 )? )
            {
            // InternalMyAtlProject.g:6163:1: ( ( rule__NavigatingSemiArgCS__Group_3__0 )? )
            // InternalMyAtlProject.g:6164:2: ( rule__NavigatingSemiArgCS__Group_3__0 )?
            {
             before(grammarAccess.getNavigatingSemiArgCSAccess().getGroup_3()); 
            // InternalMyAtlProject.g:6165:2: ( rule__NavigatingSemiArgCS__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==23) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyAtlProject.g:6165:3: rule__NavigatingSemiArgCS__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigatingSemiArgCS__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavigatingSemiArgCSAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__Group__3__Impl"


    // $ANTLR start "rule__NavigatingSemiArgCS__Group_2__0"
    // InternalMyAtlProject.g:6174:1: rule__NavigatingSemiArgCS__Group_2__0 : rule__NavigatingSemiArgCS__Group_2__0__Impl rule__NavigatingSemiArgCS__Group_2__1 ;
    public final void rule__NavigatingSemiArgCS__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6178:1: ( rule__NavigatingSemiArgCS__Group_2__0__Impl rule__NavigatingSemiArgCS__Group_2__1 )
            // InternalMyAtlProject.g:6179:2: rule__NavigatingSemiArgCS__Group_2__0__Impl rule__NavigatingSemiArgCS__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__NavigatingSemiArgCS__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingSemiArgCS__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__Group_2__0"


    // $ANTLR start "rule__NavigatingSemiArgCS__Group_2__0__Impl"
    // InternalMyAtlProject.g:6186:1: rule__NavigatingSemiArgCS__Group_2__0__Impl : ( ':' ) ;
    public final void rule__NavigatingSemiArgCS__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6190:1: ( ( ':' ) )
            // InternalMyAtlProject.g:6191:1: ( ':' )
            {
            // InternalMyAtlProject.g:6191:1: ( ':' )
            // InternalMyAtlProject.g:6192:2: ':'
            {
             before(grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__Group_2__0__Impl"


    // $ANTLR start "rule__NavigatingSemiArgCS__Group_2__1"
    // InternalMyAtlProject.g:6201:1: rule__NavigatingSemiArgCS__Group_2__1 : rule__NavigatingSemiArgCS__Group_2__1__Impl ;
    public final void rule__NavigatingSemiArgCS__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6205:1: ( rule__NavigatingSemiArgCS__Group_2__1__Impl )
            // InternalMyAtlProject.g:6206:2: rule__NavigatingSemiArgCS__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingSemiArgCS__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__Group_2__1"


    // $ANTLR start "rule__NavigatingSemiArgCS__Group_2__1__Impl"
    // InternalMyAtlProject.g:6212:1: rule__NavigatingSemiArgCS__Group_2__1__Impl : ( ( rule__NavigatingSemiArgCS__OwnedTypeAssignment_2_1 ) ) ;
    public final void rule__NavigatingSemiArgCS__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6216:1: ( ( ( rule__NavigatingSemiArgCS__OwnedTypeAssignment_2_1 ) ) )
            // InternalMyAtlProject.g:6217:1: ( ( rule__NavigatingSemiArgCS__OwnedTypeAssignment_2_1 ) )
            {
            // InternalMyAtlProject.g:6217:1: ( ( rule__NavigatingSemiArgCS__OwnedTypeAssignment_2_1 ) )
            // InternalMyAtlProject.g:6218:2: ( rule__NavigatingSemiArgCS__OwnedTypeAssignment_2_1 )
            {
             before(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeAssignment_2_1()); 
            // InternalMyAtlProject.g:6219:2: ( rule__NavigatingSemiArgCS__OwnedTypeAssignment_2_1 )
            // InternalMyAtlProject.g:6219:3: rule__NavigatingSemiArgCS__OwnedTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingSemiArgCS__OwnedTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__Group_2__1__Impl"


    // $ANTLR start "rule__NavigatingSemiArgCS__Group_3__0"
    // InternalMyAtlProject.g:6228:1: rule__NavigatingSemiArgCS__Group_3__0 : rule__NavigatingSemiArgCS__Group_3__0__Impl rule__NavigatingSemiArgCS__Group_3__1 ;
    public final void rule__NavigatingSemiArgCS__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6232:1: ( rule__NavigatingSemiArgCS__Group_3__0__Impl rule__NavigatingSemiArgCS__Group_3__1 )
            // InternalMyAtlProject.g:6233:2: rule__NavigatingSemiArgCS__Group_3__0__Impl rule__NavigatingSemiArgCS__Group_3__1
            {
            pushFollow(FOLLOW_33);
            rule__NavigatingSemiArgCS__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingSemiArgCS__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__Group_3__0"


    // $ANTLR start "rule__NavigatingSemiArgCS__Group_3__0__Impl"
    // InternalMyAtlProject.g:6240:1: rule__NavigatingSemiArgCS__Group_3__0__Impl : ( '=' ) ;
    public final void rule__NavigatingSemiArgCS__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6244:1: ( ( '=' ) )
            // InternalMyAtlProject.g:6245:1: ( '=' )
            {
            // InternalMyAtlProject.g:6245:1: ( '=' )
            // InternalMyAtlProject.g:6246:2: '='
            {
             before(grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__Group_3__0__Impl"


    // $ANTLR start "rule__NavigatingSemiArgCS__Group_3__1"
    // InternalMyAtlProject.g:6255:1: rule__NavigatingSemiArgCS__Group_3__1 : rule__NavigatingSemiArgCS__Group_3__1__Impl ;
    public final void rule__NavigatingSemiArgCS__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6259:1: ( rule__NavigatingSemiArgCS__Group_3__1__Impl )
            // InternalMyAtlProject.g:6260:2: rule__NavigatingSemiArgCS__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingSemiArgCS__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__Group_3__1"


    // $ANTLR start "rule__NavigatingSemiArgCS__Group_3__1__Impl"
    // InternalMyAtlProject.g:6266:1: rule__NavigatingSemiArgCS__Group_3__1__Impl : ( ( rule__NavigatingSemiArgCS__InitAssignment_3_1 ) ) ;
    public final void rule__NavigatingSemiArgCS__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6270:1: ( ( ( rule__NavigatingSemiArgCS__InitAssignment_3_1 ) ) )
            // InternalMyAtlProject.g:6271:1: ( ( rule__NavigatingSemiArgCS__InitAssignment_3_1 ) )
            {
            // InternalMyAtlProject.g:6271:1: ( ( rule__NavigatingSemiArgCS__InitAssignment_3_1 ) )
            // InternalMyAtlProject.g:6272:2: ( rule__NavigatingSemiArgCS__InitAssignment_3_1 )
            {
             before(grammarAccess.getNavigatingSemiArgCSAccess().getInitAssignment_3_1()); 
            // InternalMyAtlProject.g:6273:2: ( rule__NavigatingSemiArgCS__InitAssignment_3_1 )
            // InternalMyAtlProject.g:6273:3: rule__NavigatingSemiArgCS__InitAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingSemiArgCS__InitAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingSemiArgCSAccess().getInitAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__Group_3__1__Impl"


    // $ANTLR start "rule__IfExpCS__Group__0"
    // InternalMyAtlProject.g:6282:1: rule__IfExpCS__Group__0 : rule__IfExpCS__Group__0__Impl rule__IfExpCS__Group__1 ;
    public final void rule__IfExpCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6286:1: ( rule__IfExpCS__Group__0__Impl rule__IfExpCS__Group__1 )
            // InternalMyAtlProject.g:6287:2: rule__IfExpCS__Group__0__Impl rule__IfExpCS__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__IfExpCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpCS__Group__0"


    // $ANTLR start "rule__IfExpCS__Group__0__Impl"
    // InternalMyAtlProject.g:6294:1: rule__IfExpCS__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfExpCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6298:1: ( ( 'if' ) )
            // InternalMyAtlProject.g:6299:1: ( 'if' )
            {
            // InternalMyAtlProject.g:6299:1: ( 'if' )
            // InternalMyAtlProject.g:6300:2: 'if'
            {
             before(grammarAccess.getIfExpCSAccess().getIfKeyword_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getIfExpCSAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpCS__Group__0__Impl"


    // $ANTLR start "rule__IfExpCS__Group__1"
    // InternalMyAtlProject.g:6309:1: rule__IfExpCS__Group__1 : rule__IfExpCS__Group__1__Impl rule__IfExpCS__Group__2 ;
    public final void rule__IfExpCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6313:1: ( rule__IfExpCS__Group__1__Impl rule__IfExpCS__Group__2 )
            // InternalMyAtlProject.g:6314:2: rule__IfExpCS__Group__1__Impl rule__IfExpCS__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__IfExpCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpCS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpCS__Group__1"


    // $ANTLR start "rule__IfExpCS__Group__1__Impl"
    // InternalMyAtlProject.g:6321:1: rule__IfExpCS__Group__1__Impl : ( ( rule__IfExpCS__ConditionAssignment_1 ) ) ;
    public final void rule__IfExpCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6325:1: ( ( ( rule__IfExpCS__ConditionAssignment_1 ) ) )
            // InternalMyAtlProject.g:6326:1: ( ( rule__IfExpCS__ConditionAssignment_1 ) )
            {
            // InternalMyAtlProject.g:6326:1: ( ( rule__IfExpCS__ConditionAssignment_1 ) )
            // InternalMyAtlProject.g:6327:2: ( rule__IfExpCS__ConditionAssignment_1 )
            {
             before(grammarAccess.getIfExpCSAccess().getConditionAssignment_1()); 
            // InternalMyAtlProject.g:6328:2: ( rule__IfExpCS__ConditionAssignment_1 )
            // InternalMyAtlProject.g:6328:3: rule__IfExpCS__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfExpCS__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfExpCSAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpCS__Group__1__Impl"


    // $ANTLR start "rule__IfExpCS__Group__2"
    // InternalMyAtlProject.g:6336:1: rule__IfExpCS__Group__2 : rule__IfExpCS__Group__2__Impl rule__IfExpCS__Group__3 ;
    public final void rule__IfExpCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6340:1: ( rule__IfExpCS__Group__2__Impl rule__IfExpCS__Group__3 )
            // InternalMyAtlProject.g:6341:2: rule__IfExpCS__Group__2__Impl rule__IfExpCS__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__IfExpCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpCS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpCS__Group__2"


    // $ANTLR start "rule__IfExpCS__Group__2__Impl"
    // InternalMyAtlProject.g:6348:1: rule__IfExpCS__Group__2__Impl : ( 'then' ) ;
    public final void rule__IfExpCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6352:1: ( ( 'then' ) )
            // InternalMyAtlProject.g:6353:1: ( 'then' )
            {
            // InternalMyAtlProject.g:6353:1: ( 'then' )
            // InternalMyAtlProject.g:6354:2: 'then'
            {
             before(grammarAccess.getIfExpCSAccess().getThenKeyword_2()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getIfExpCSAccess().getThenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpCS__Group__2__Impl"


    // $ANTLR start "rule__IfExpCS__Group__3"
    // InternalMyAtlProject.g:6363:1: rule__IfExpCS__Group__3 : rule__IfExpCS__Group__3__Impl rule__IfExpCS__Group__4 ;
    public final void rule__IfExpCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6367:1: ( rule__IfExpCS__Group__3__Impl rule__IfExpCS__Group__4 )
            // InternalMyAtlProject.g:6368:2: rule__IfExpCS__Group__3__Impl rule__IfExpCS__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__IfExpCS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpCS__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpCS__Group__3"


    // $ANTLR start "rule__IfExpCS__Group__3__Impl"
    // InternalMyAtlProject.g:6375:1: rule__IfExpCS__Group__3__Impl : ( ( rule__IfExpCS__ThenExpressionAssignment_3 ) ) ;
    public final void rule__IfExpCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6379:1: ( ( ( rule__IfExpCS__ThenExpressionAssignment_3 ) ) )
            // InternalMyAtlProject.g:6380:1: ( ( rule__IfExpCS__ThenExpressionAssignment_3 ) )
            {
            // InternalMyAtlProject.g:6380:1: ( ( rule__IfExpCS__ThenExpressionAssignment_3 ) )
            // InternalMyAtlProject.g:6381:2: ( rule__IfExpCS__ThenExpressionAssignment_3 )
            {
             before(grammarAccess.getIfExpCSAccess().getThenExpressionAssignment_3()); 
            // InternalMyAtlProject.g:6382:2: ( rule__IfExpCS__ThenExpressionAssignment_3 )
            // InternalMyAtlProject.g:6382:3: rule__IfExpCS__ThenExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IfExpCS__ThenExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfExpCSAccess().getThenExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpCS__Group__3__Impl"


    // $ANTLR start "rule__IfExpCS__Group__4"
    // InternalMyAtlProject.g:6390:1: rule__IfExpCS__Group__4 : rule__IfExpCS__Group__4__Impl rule__IfExpCS__Group__5 ;
    public final void rule__IfExpCS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6394:1: ( rule__IfExpCS__Group__4__Impl rule__IfExpCS__Group__5 )
            // InternalMyAtlProject.g:6395:2: rule__IfExpCS__Group__4__Impl rule__IfExpCS__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__IfExpCS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpCS__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpCS__Group__4"


    // $ANTLR start "rule__IfExpCS__Group__4__Impl"
    // InternalMyAtlProject.g:6402:1: rule__IfExpCS__Group__4__Impl : ( 'else' ) ;
    public final void rule__IfExpCS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6406:1: ( ( 'else' ) )
            // InternalMyAtlProject.g:6407:1: ( 'else' )
            {
            // InternalMyAtlProject.g:6407:1: ( 'else' )
            // InternalMyAtlProject.g:6408:2: 'else'
            {
             before(grammarAccess.getIfExpCSAccess().getElseKeyword_4()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getIfExpCSAccess().getElseKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpCS__Group__4__Impl"


    // $ANTLR start "rule__IfExpCS__Group__5"
    // InternalMyAtlProject.g:6417:1: rule__IfExpCS__Group__5 : rule__IfExpCS__Group__5__Impl rule__IfExpCS__Group__6 ;
    public final void rule__IfExpCS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6421:1: ( rule__IfExpCS__Group__5__Impl rule__IfExpCS__Group__6 )
            // InternalMyAtlProject.g:6422:2: rule__IfExpCS__Group__5__Impl rule__IfExpCS__Group__6
            {
            pushFollow(FOLLOW_42);
            rule__IfExpCS__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpCS__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpCS__Group__5"


    // $ANTLR start "rule__IfExpCS__Group__5__Impl"
    // InternalMyAtlProject.g:6429:1: rule__IfExpCS__Group__5__Impl : ( ( rule__IfExpCS__ElseExpressionAssignment_5 ) ) ;
    public final void rule__IfExpCS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6433:1: ( ( ( rule__IfExpCS__ElseExpressionAssignment_5 ) ) )
            // InternalMyAtlProject.g:6434:1: ( ( rule__IfExpCS__ElseExpressionAssignment_5 ) )
            {
            // InternalMyAtlProject.g:6434:1: ( ( rule__IfExpCS__ElseExpressionAssignment_5 ) )
            // InternalMyAtlProject.g:6435:2: ( rule__IfExpCS__ElseExpressionAssignment_5 )
            {
             before(grammarAccess.getIfExpCSAccess().getElseExpressionAssignment_5()); 
            // InternalMyAtlProject.g:6436:2: ( rule__IfExpCS__ElseExpressionAssignment_5 )
            // InternalMyAtlProject.g:6436:3: rule__IfExpCS__ElseExpressionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__IfExpCS__ElseExpressionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIfExpCSAccess().getElseExpressionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpCS__Group__5__Impl"


    // $ANTLR start "rule__IfExpCS__Group__6"
    // InternalMyAtlProject.g:6444:1: rule__IfExpCS__Group__6 : rule__IfExpCS__Group__6__Impl ;
    public final void rule__IfExpCS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6448:1: ( rule__IfExpCS__Group__6__Impl )
            // InternalMyAtlProject.g:6449:2: rule__IfExpCS__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfExpCS__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpCS__Group__6"


    // $ANTLR start "rule__IfExpCS__Group__6__Impl"
    // InternalMyAtlProject.g:6455:1: rule__IfExpCS__Group__6__Impl : ( 'endif' ) ;
    public final void rule__IfExpCS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6459:1: ( ( 'endif' ) )
            // InternalMyAtlProject.g:6460:1: ( 'endif' )
            {
            // InternalMyAtlProject.g:6460:1: ( 'endif' )
            // InternalMyAtlProject.g:6461:2: 'endif'
            {
             before(grammarAccess.getIfExpCSAccess().getEndifKeyword_6()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getIfExpCSAccess().getEndifKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpCS__Group__6__Impl"


    // $ANTLR start "rule__LetExpCS__Group__0"
    // InternalMyAtlProject.g:6471:1: rule__LetExpCS__Group__0 : rule__LetExpCS__Group__0__Impl rule__LetExpCS__Group__1 ;
    public final void rule__LetExpCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6475:1: ( rule__LetExpCS__Group__0__Impl rule__LetExpCS__Group__1 )
            // InternalMyAtlProject.g:6476:2: rule__LetExpCS__Group__0__Impl rule__LetExpCS__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LetExpCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetExpCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpCS__Group__0"


    // $ANTLR start "rule__LetExpCS__Group__0__Impl"
    // InternalMyAtlProject.g:6483:1: rule__LetExpCS__Group__0__Impl : ( 'let' ) ;
    public final void rule__LetExpCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6487:1: ( ( 'let' ) )
            // InternalMyAtlProject.g:6488:1: ( 'let' )
            {
            // InternalMyAtlProject.g:6488:1: ( 'let' )
            // InternalMyAtlProject.g:6489:2: 'let'
            {
             before(grammarAccess.getLetExpCSAccess().getLetKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getLetExpCSAccess().getLetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpCS__Group__0__Impl"


    // $ANTLR start "rule__LetExpCS__Group__1"
    // InternalMyAtlProject.g:6498:1: rule__LetExpCS__Group__1 : rule__LetExpCS__Group__1__Impl rule__LetExpCS__Group__2 ;
    public final void rule__LetExpCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6502:1: ( rule__LetExpCS__Group__1__Impl rule__LetExpCS__Group__2 )
            // InternalMyAtlProject.g:6503:2: rule__LetExpCS__Group__1__Impl rule__LetExpCS__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__LetExpCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetExpCS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpCS__Group__1"


    // $ANTLR start "rule__LetExpCS__Group__1__Impl"
    // InternalMyAtlProject.g:6510:1: rule__LetExpCS__Group__1__Impl : ( ( rule__LetExpCS__VariableAssignment_1 ) ) ;
    public final void rule__LetExpCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6514:1: ( ( ( rule__LetExpCS__VariableAssignment_1 ) ) )
            // InternalMyAtlProject.g:6515:1: ( ( rule__LetExpCS__VariableAssignment_1 ) )
            {
            // InternalMyAtlProject.g:6515:1: ( ( rule__LetExpCS__VariableAssignment_1 ) )
            // InternalMyAtlProject.g:6516:2: ( rule__LetExpCS__VariableAssignment_1 )
            {
             before(grammarAccess.getLetExpCSAccess().getVariableAssignment_1()); 
            // InternalMyAtlProject.g:6517:2: ( rule__LetExpCS__VariableAssignment_1 )
            // InternalMyAtlProject.g:6517:3: rule__LetExpCS__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LetExpCS__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLetExpCSAccess().getVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpCS__Group__1__Impl"


    // $ANTLR start "rule__LetExpCS__Group__2"
    // InternalMyAtlProject.g:6525:1: rule__LetExpCS__Group__2 : rule__LetExpCS__Group__2__Impl rule__LetExpCS__Group__3 ;
    public final void rule__LetExpCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6529:1: ( rule__LetExpCS__Group__2__Impl rule__LetExpCS__Group__3 )
            // InternalMyAtlProject.g:6530:2: rule__LetExpCS__Group__2__Impl rule__LetExpCS__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__LetExpCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetExpCS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpCS__Group__2"


    // $ANTLR start "rule__LetExpCS__Group__2__Impl"
    // InternalMyAtlProject.g:6537:1: rule__LetExpCS__Group__2__Impl : ( ( rule__LetExpCS__Group_2__0 )* ) ;
    public final void rule__LetExpCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6541:1: ( ( ( rule__LetExpCS__Group_2__0 )* ) )
            // InternalMyAtlProject.g:6542:1: ( ( rule__LetExpCS__Group_2__0 )* )
            {
            // InternalMyAtlProject.g:6542:1: ( ( rule__LetExpCS__Group_2__0 )* )
            // InternalMyAtlProject.g:6543:2: ( rule__LetExpCS__Group_2__0 )*
            {
             before(grammarAccess.getLetExpCSAccess().getGroup_2()); 
            // InternalMyAtlProject.g:6544:2: ( rule__LetExpCS__Group_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==63) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMyAtlProject.g:6544:3: rule__LetExpCS__Group_2__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__LetExpCS__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getLetExpCSAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpCS__Group__2__Impl"


    // $ANTLR start "rule__LetExpCS__Group__3"
    // InternalMyAtlProject.g:6552:1: rule__LetExpCS__Group__3 : rule__LetExpCS__Group__3__Impl rule__LetExpCS__Group__4 ;
    public final void rule__LetExpCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6556:1: ( rule__LetExpCS__Group__3__Impl rule__LetExpCS__Group__4 )
            // InternalMyAtlProject.g:6557:2: rule__LetExpCS__Group__3__Impl rule__LetExpCS__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__LetExpCS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetExpCS__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpCS__Group__3"


    // $ANTLR start "rule__LetExpCS__Group__3__Impl"
    // InternalMyAtlProject.g:6564:1: rule__LetExpCS__Group__3__Impl : ( 'in' ) ;
    public final void rule__LetExpCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6568:1: ( ( 'in' ) )
            // InternalMyAtlProject.g:6569:1: ( 'in' )
            {
            // InternalMyAtlProject.g:6569:1: ( 'in' )
            // InternalMyAtlProject.g:6570:2: 'in'
            {
             before(grammarAccess.getLetExpCSAccess().getInKeyword_3()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getLetExpCSAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpCS__Group__3__Impl"


    // $ANTLR start "rule__LetExpCS__Group__4"
    // InternalMyAtlProject.g:6579:1: rule__LetExpCS__Group__4 : rule__LetExpCS__Group__4__Impl ;
    public final void rule__LetExpCS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6583:1: ( rule__LetExpCS__Group__4__Impl )
            // InternalMyAtlProject.g:6584:2: rule__LetExpCS__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetExpCS__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpCS__Group__4"


    // $ANTLR start "rule__LetExpCS__Group__4__Impl"
    // InternalMyAtlProject.g:6590:1: rule__LetExpCS__Group__4__Impl : ( ( rule__LetExpCS__InAssignment_4 ) ) ;
    public final void rule__LetExpCS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6594:1: ( ( ( rule__LetExpCS__InAssignment_4 ) ) )
            // InternalMyAtlProject.g:6595:1: ( ( rule__LetExpCS__InAssignment_4 ) )
            {
            // InternalMyAtlProject.g:6595:1: ( ( rule__LetExpCS__InAssignment_4 ) )
            // InternalMyAtlProject.g:6596:2: ( rule__LetExpCS__InAssignment_4 )
            {
             before(grammarAccess.getLetExpCSAccess().getInAssignment_4()); 
            // InternalMyAtlProject.g:6597:2: ( rule__LetExpCS__InAssignment_4 )
            // InternalMyAtlProject.g:6597:3: rule__LetExpCS__InAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LetExpCS__InAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLetExpCSAccess().getInAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpCS__Group__4__Impl"


    // $ANTLR start "rule__LetExpCS__Group_2__0"
    // InternalMyAtlProject.g:6606:1: rule__LetExpCS__Group_2__0 : rule__LetExpCS__Group_2__0__Impl rule__LetExpCS__Group_2__1 ;
    public final void rule__LetExpCS__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6610:1: ( rule__LetExpCS__Group_2__0__Impl rule__LetExpCS__Group_2__1 )
            // InternalMyAtlProject.g:6611:2: rule__LetExpCS__Group_2__0__Impl rule__LetExpCS__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__LetExpCS__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetExpCS__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpCS__Group_2__0"


    // $ANTLR start "rule__LetExpCS__Group_2__0__Impl"
    // InternalMyAtlProject.g:6618:1: rule__LetExpCS__Group_2__0__Impl : ( ',' ) ;
    public final void rule__LetExpCS__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6622:1: ( ( ',' ) )
            // InternalMyAtlProject.g:6623:1: ( ',' )
            {
            // InternalMyAtlProject.g:6623:1: ( ',' )
            // InternalMyAtlProject.g:6624:2: ','
            {
             before(grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpCS__Group_2__0__Impl"


    // $ANTLR start "rule__LetExpCS__Group_2__1"
    // InternalMyAtlProject.g:6633:1: rule__LetExpCS__Group_2__1 : rule__LetExpCS__Group_2__1__Impl ;
    public final void rule__LetExpCS__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6637:1: ( rule__LetExpCS__Group_2__1__Impl )
            // InternalMyAtlProject.g:6638:2: rule__LetExpCS__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetExpCS__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpCS__Group_2__1"


    // $ANTLR start "rule__LetExpCS__Group_2__1__Impl"
    // InternalMyAtlProject.g:6644:1: rule__LetExpCS__Group_2__1__Impl : ( ( rule__LetExpCS__VariableAssignment_2_1 ) ) ;
    public final void rule__LetExpCS__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6648:1: ( ( ( rule__LetExpCS__VariableAssignment_2_1 ) ) )
            // InternalMyAtlProject.g:6649:1: ( ( rule__LetExpCS__VariableAssignment_2_1 ) )
            {
            // InternalMyAtlProject.g:6649:1: ( ( rule__LetExpCS__VariableAssignment_2_1 ) )
            // InternalMyAtlProject.g:6650:2: ( rule__LetExpCS__VariableAssignment_2_1 )
            {
             before(grammarAccess.getLetExpCSAccess().getVariableAssignment_2_1()); 
            // InternalMyAtlProject.g:6651:2: ( rule__LetExpCS__VariableAssignment_2_1 )
            // InternalMyAtlProject.g:6651:3: rule__LetExpCS__VariableAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LetExpCS__VariableAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLetExpCSAccess().getVariableAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpCS__Group_2__1__Impl"


    // $ANTLR start "rule__LetVariableCS__Group__0"
    // InternalMyAtlProject.g:6660:1: rule__LetVariableCS__Group__0 : rule__LetVariableCS__Group__0__Impl rule__LetVariableCS__Group__1 ;
    public final void rule__LetVariableCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6664:1: ( rule__LetVariableCS__Group__0__Impl rule__LetVariableCS__Group__1 )
            // InternalMyAtlProject.g:6665:2: rule__LetVariableCS__Group__0__Impl rule__LetVariableCS__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__LetVariableCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetVariableCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetVariableCS__Group__0"


    // $ANTLR start "rule__LetVariableCS__Group__0__Impl"
    // InternalMyAtlProject.g:6672:1: rule__LetVariableCS__Group__0__Impl : ( ( rule__LetVariableCS__NameAssignment_0 ) ) ;
    public final void rule__LetVariableCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6676:1: ( ( ( rule__LetVariableCS__NameAssignment_0 ) ) )
            // InternalMyAtlProject.g:6677:1: ( ( rule__LetVariableCS__NameAssignment_0 ) )
            {
            // InternalMyAtlProject.g:6677:1: ( ( rule__LetVariableCS__NameAssignment_0 ) )
            // InternalMyAtlProject.g:6678:2: ( rule__LetVariableCS__NameAssignment_0 )
            {
             before(grammarAccess.getLetVariableCSAccess().getNameAssignment_0()); 
            // InternalMyAtlProject.g:6679:2: ( rule__LetVariableCS__NameAssignment_0 )
            // InternalMyAtlProject.g:6679:3: rule__LetVariableCS__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LetVariableCS__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLetVariableCSAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetVariableCS__Group__0__Impl"


    // $ANTLR start "rule__LetVariableCS__Group__1"
    // InternalMyAtlProject.g:6687:1: rule__LetVariableCS__Group__1 : rule__LetVariableCS__Group__1__Impl rule__LetVariableCS__Group__2 ;
    public final void rule__LetVariableCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6691:1: ( rule__LetVariableCS__Group__1__Impl rule__LetVariableCS__Group__2 )
            // InternalMyAtlProject.g:6692:2: rule__LetVariableCS__Group__1__Impl rule__LetVariableCS__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__LetVariableCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetVariableCS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetVariableCS__Group__1"


    // $ANTLR start "rule__LetVariableCS__Group__1__Impl"
    // InternalMyAtlProject.g:6699:1: rule__LetVariableCS__Group__1__Impl : ( ( rule__LetVariableCS__Group_1__0 )? ) ;
    public final void rule__LetVariableCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6703:1: ( ( ( rule__LetVariableCS__Group_1__0 )? ) )
            // InternalMyAtlProject.g:6704:1: ( ( rule__LetVariableCS__Group_1__0 )? )
            {
            // InternalMyAtlProject.g:6704:1: ( ( rule__LetVariableCS__Group_1__0 )? )
            // InternalMyAtlProject.g:6705:2: ( rule__LetVariableCS__Group_1__0 )?
            {
             before(grammarAccess.getLetVariableCSAccess().getGroup_1()); 
            // InternalMyAtlProject.g:6706:2: ( rule__LetVariableCS__Group_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyAtlProject.g:6706:3: rule__LetVariableCS__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LetVariableCS__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLetVariableCSAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetVariableCS__Group__1__Impl"


    // $ANTLR start "rule__LetVariableCS__Group__2"
    // InternalMyAtlProject.g:6714:1: rule__LetVariableCS__Group__2 : rule__LetVariableCS__Group__2__Impl rule__LetVariableCS__Group__3 ;
    public final void rule__LetVariableCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6718:1: ( rule__LetVariableCS__Group__2__Impl rule__LetVariableCS__Group__3 )
            // InternalMyAtlProject.g:6719:2: rule__LetVariableCS__Group__2__Impl rule__LetVariableCS__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__LetVariableCS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetVariableCS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetVariableCS__Group__2"


    // $ANTLR start "rule__LetVariableCS__Group__2__Impl"
    // InternalMyAtlProject.g:6726:1: rule__LetVariableCS__Group__2__Impl : ( '=' ) ;
    public final void rule__LetVariableCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6730:1: ( ( '=' ) )
            // InternalMyAtlProject.g:6731:1: ( '=' )
            {
            // InternalMyAtlProject.g:6731:1: ( '=' )
            // InternalMyAtlProject.g:6732:2: '='
            {
             before(grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetVariableCS__Group__2__Impl"


    // $ANTLR start "rule__LetVariableCS__Group__3"
    // InternalMyAtlProject.g:6741:1: rule__LetVariableCS__Group__3 : rule__LetVariableCS__Group__3__Impl ;
    public final void rule__LetVariableCS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6745:1: ( rule__LetVariableCS__Group__3__Impl )
            // InternalMyAtlProject.g:6746:2: rule__LetVariableCS__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetVariableCS__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetVariableCS__Group__3"


    // $ANTLR start "rule__LetVariableCS__Group__3__Impl"
    // InternalMyAtlProject.g:6752:1: rule__LetVariableCS__Group__3__Impl : ( ( rule__LetVariableCS__InitExpressionAssignment_3 ) ) ;
    public final void rule__LetVariableCS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6756:1: ( ( ( rule__LetVariableCS__InitExpressionAssignment_3 ) ) )
            // InternalMyAtlProject.g:6757:1: ( ( rule__LetVariableCS__InitExpressionAssignment_3 ) )
            {
            // InternalMyAtlProject.g:6757:1: ( ( rule__LetVariableCS__InitExpressionAssignment_3 ) )
            // InternalMyAtlProject.g:6758:2: ( rule__LetVariableCS__InitExpressionAssignment_3 )
            {
             before(grammarAccess.getLetVariableCSAccess().getInitExpressionAssignment_3()); 
            // InternalMyAtlProject.g:6759:2: ( rule__LetVariableCS__InitExpressionAssignment_3 )
            // InternalMyAtlProject.g:6759:3: rule__LetVariableCS__InitExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LetVariableCS__InitExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLetVariableCSAccess().getInitExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetVariableCS__Group__3__Impl"


    // $ANTLR start "rule__LetVariableCS__Group_1__0"
    // InternalMyAtlProject.g:6768:1: rule__LetVariableCS__Group_1__0 : rule__LetVariableCS__Group_1__0__Impl rule__LetVariableCS__Group_1__1 ;
    public final void rule__LetVariableCS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6772:1: ( rule__LetVariableCS__Group_1__0__Impl rule__LetVariableCS__Group_1__1 )
            // InternalMyAtlProject.g:6773:2: rule__LetVariableCS__Group_1__0__Impl rule__LetVariableCS__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__LetVariableCS__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetVariableCS__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetVariableCS__Group_1__0"


    // $ANTLR start "rule__LetVariableCS__Group_1__0__Impl"
    // InternalMyAtlProject.g:6780:1: rule__LetVariableCS__Group_1__0__Impl : ( ':' ) ;
    public final void rule__LetVariableCS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6784:1: ( ( ':' ) )
            // InternalMyAtlProject.g:6785:1: ( ':' )
            {
            // InternalMyAtlProject.g:6785:1: ( ':' )
            // InternalMyAtlProject.g:6786:2: ':'
            {
             before(grammarAccess.getLetVariableCSAccess().getColonKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLetVariableCSAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetVariableCS__Group_1__0__Impl"


    // $ANTLR start "rule__LetVariableCS__Group_1__1"
    // InternalMyAtlProject.g:6795:1: rule__LetVariableCS__Group_1__1 : rule__LetVariableCS__Group_1__1__Impl ;
    public final void rule__LetVariableCS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6799:1: ( rule__LetVariableCS__Group_1__1__Impl )
            // InternalMyAtlProject.g:6800:2: rule__LetVariableCS__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetVariableCS__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetVariableCS__Group_1__1"


    // $ANTLR start "rule__LetVariableCS__Group_1__1__Impl"
    // InternalMyAtlProject.g:6806:1: rule__LetVariableCS__Group_1__1__Impl : ( ( rule__LetVariableCS__OwnedTypeAssignment_1_1 ) ) ;
    public final void rule__LetVariableCS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6810:1: ( ( ( rule__LetVariableCS__OwnedTypeAssignment_1_1 ) ) )
            // InternalMyAtlProject.g:6811:1: ( ( rule__LetVariableCS__OwnedTypeAssignment_1_1 ) )
            {
            // InternalMyAtlProject.g:6811:1: ( ( rule__LetVariableCS__OwnedTypeAssignment_1_1 ) )
            // InternalMyAtlProject.g:6812:2: ( rule__LetVariableCS__OwnedTypeAssignment_1_1 )
            {
             before(grammarAccess.getLetVariableCSAccess().getOwnedTypeAssignment_1_1()); 
            // InternalMyAtlProject.g:6813:2: ( rule__LetVariableCS__OwnedTypeAssignment_1_1 )
            // InternalMyAtlProject.g:6813:3: rule__LetVariableCS__OwnedTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LetVariableCS__OwnedTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLetVariableCSAccess().getOwnedTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetVariableCS__Group_1__1__Impl"


    // $ANTLR start "rule__NestedExpCS__Group__0"
    // InternalMyAtlProject.g:6822:1: rule__NestedExpCS__Group__0 : rule__NestedExpCS__Group__0__Impl rule__NestedExpCS__Group__1 ;
    public final void rule__NestedExpCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6826:1: ( rule__NestedExpCS__Group__0__Impl rule__NestedExpCS__Group__1 )
            // InternalMyAtlProject.g:6827:2: rule__NestedExpCS__Group__0__Impl rule__NestedExpCS__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__NestedExpCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedExpCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpCS__Group__0"


    // $ANTLR start "rule__NestedExpCS__Group__0__Impl"
    // InternalMyAtlProject.g:6834:1: rule__NestedExpCS__Group__0__Impl : ( '(' ) ;
    public final void rule__NestedExpCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6838:1: ( ( '(' ) )
            // InternalMyAtlProject.g:6839:1: ( '(' )
            {
            // InternalMyAtlProject.g:6839:1: ( '(' )
            // InternalMyAtlProject.g:6840:2: '('
            {
             before(grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpCS__Group__0__Impl"


    // $ANTLR start "rule__NestedExpCS__Group__1"
    // InternalMyAtlProject.g:6849:1: rule__NestedExpCS__Group__1 : rule__NestedExpCS__Group__1__Impl rule__NestedExpCS__Group__2 ;
    public final void rule__NestedExpCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6853:1: ( rule__NestedExpCS__Group__1__Impl rule__NestedExpCS__Group__2 )
            // InternalMyAtlProject.g:6854:2: rule__NestedExpCS__Group__1__Impl rule__NestedExpCS__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__NestedExpCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedExpCS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpCS__Group__1"


    // $ANTLR start "rule__NestedExpCS__Group__1__Impl"
    // InternalMyAtlProject.g:6861:1: rule__NestedExpCS__Group__1__Impl : ( ( rule__NestedExpCS__SourceAssignment_1 ) ) ;
    public final void rule__NestedExpCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6865:1: ( ( ( rule__NestedExpCS__SourceAssignment_1 ) ) )
            // InternalMyAtlProject.g:6866:1: ( ( rule__NestedExpCS__SourceAssignment_1 ) )
            {
            // InternalMyAtlProject.g:6866:1: ( ( rule__NestedExpCS__SourceAssignment_1 ) )
            // InternalMyAtlProject.g:6867:2: ( rule__NestedExpCS__SourceAssignment_1 )
            {
             before(grammarAccess.getNestedExpCSAccess().getSourceAssignment_1()); 
            // InternalMyAtlProject.g:6868:2: ( rule__NestedExpCS__SourceAssignment_1 )
            // InternalMyAtlProject.g:6868:3: rule__NestedExpCS__SourceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NestedExpCS__SourceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNestedExpCSAccess().getSourceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpCS__Group__1__Impl"


    // $ANTLR start "rule__NestedExpCS__Group__2"
    // InternalMyAtlProject.g:6876:1: rule__NestedExpCS__Group__2 : rule__NestedExpCS__Group__2__Impl ;
    public final void rule__NestedExpCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6880:1: ( rule__NestedExpCS__Group__2__Impl )
            // InternalMyAtlProject.g:6881:2: rule__NestedExpCS__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NestedExpCS__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpCS__Group__2"


    // $ANTLR start "rule__NestedExpCS__Group__2__Impl"
    // InternalMyAtlProject.g:6887:1: rule__NestedExpCS__Group__2__Impl : ( ')' ) ;
    public final void rule__NestedExpCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6891:1: ( ( ')' ) )
            // InternalMyAtlProject.g:6892:1: ( ')' )
            {
            // InternalMyAtlProject.g:6892:1: ( ')' )
            // InternalMyAtlProject.g:6893:2: ')'
            {
             before(grammarAccess.getNestedExpCSAccess().getRightParenthesisKeyword_2()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getNestedExpCSAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpCS__Group__2__Impl"


    // $ANTLR start "rule__SelfExpCS__Group__0"
    // InternalMyAtlProject.g:6903:1: rule__SelfExpCS__Group__0 : rule__SelfExpCS__Group__0__Impl rule__SelfExpCS__Group__1 ;
    public final void rule__SelfExpCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6907:1: ( rule__SelfExpCS__Group__0__Impl rule__SelfExpCS__Group__1 )
            // InternalMyAtlProject.g:6908:2: rule__SelfExpCS__Group__0__Impl rule__SelfExpCS__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__SelfExpCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelfExpCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfExpCS__Group__0"


    // $ANTLR start "rule__SelfExpCS__Group__0__Impl"
    // InternalMyAtlProject.g:6915:1: rule__SelfExpCS__Group__0__Impl : ( () ) ;
    public final void rule__SelfExpCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6919:1: ( ( () ) )
            // InternalMyAtlProject.g:6920:1: ( () )
            {
            // InternalMyAtlProject.g:6920:1: ( () )
            // InternalMyAtlProject.g:6921:2: ()
            {
             before(grammarAccess.getSelfExpCSAccess().getSelfExpCSAction_0()); 
            // InternalMyAtlProject.g:6922:2: ()
            // InternalMyAtlProject.g:6922:3: 
            {
            }

             after(grammarAccess.getSelfExpCSAccess().getSelfExpCSAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfExpCS__Group__0__Impl"


    // $ANTLR start "rule__SelfExpCS__Group__1"
    // InternalMyAtlProject.g:6930:1: rule__SelfExpCS__Group__1 : rule__SelfExpCS__Group__1__Impl ;
    public final void rule__SelfExpCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6934:1: ( rule__SelfExpCS__Group__1__Impl )
            // InternalMyAtlProject.g:6935:2: rule__SelfExpCS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelfExpCS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfExpCS__Group__1"


    // $ANTLR start "rule__SelfExpCS__Group__1__Impl"
    // InternalMyAtlProject.g:6941:1: rule__SelfExpCS__Group__1__Impl : ( 'self' ) ;
    public final void rule__SelfExpCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6945:1: ( ( 'self' ) )
            // InternalMyAtlProject.g:6946:1: ( 'self' )
            {
            // InternalMyAtlProject.g:6946:1: ( 'self' )
            // InternalMyAtlProject.g:6947:2: 'self'
            {
             before(grammarAccess.getSelfExpCSAccess().getSelfKeyword_1()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getSelfExpCSAccess().getSelfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfExpCS__Group__1__Impl"


    // $ANTLR start "rule__InfixedExpCS__Group__0"
    // InternalMyAtlProject.g:6957:1: rule__InfixedExpCS__Group__0 : rule__InfixedExpCS__Group__0__Impl rule__InfixedExpCS__Group__1 ;
    public final void rule__InfixedExpCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6961:1: ( rule__InfixedExpCS__Group__0__Impl rule__InfixedExpCS__Group__1 )
            // InternalMyAtlProject.g:6962:2: rule__InfixedExpCS__Group__0__Impl rule__InfixedExpCS__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__InfixedExpCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InfixedExpCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixedExpCS__Group__0"


    // $ANTLR start "rule__InfixedExpCS__Group__0__Impl"
    // InternalMyAtlProject.g:6969:1: rule__InfixedExpCS__Group__0__Impl : ( rulePrefixedExpCS ) ;
    public final void rule__InfixedExpCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6973:1: ( ( rulePrefixedExpCS ) )
            // InternalMyAtlProject.g:6974:1: ( rulePrefixedExpCS )
            {
            // InternalMyAtlProject.g:6974:1: ( rulePrefixedExpCS )
            // InternalMyAtlProject.g:6975:2: rulePrefixedExpCS
            {
             before(grammarAccess.getInfixedExpCSAccess().getPrefixedExpCSParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrefixedExpCS();

            state._fsp--;

             after(grammarAccess.getInfixedExpCSAccess().getPrefixedExpCSParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixedExpCS__Group__0__Impl"


    // $ANTLR start "rule__InfixedExpCS__Group__1"
    // InternalMyAtlProject.g:6984:1: rule__InfixedExpCS__Group__1 : rule__InfixedExpCS__Group__1__Impl ;
    public final void rule__InfixedExpCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6988:1: ( rule__InfixedExpCS__Group__1__Impl )
            // InternalMyAtlProject.g:6989:2: rule__InfixedExpCS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixedExpCS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixedExpCS__Group__1"


    // $ANTLR start "rule__InfixedExpCS__Group__1__Impl"
    // InternalMyAtlProject.g:6995:1: rule__InfixedExpCS__Group__1__Impl : ( ( rule__InfixedExpCS__Group_1__0 )? ) ;
    public final void rule__InfixedExpCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:6999:1: ( ( ( rule__InfixedExpCS__Group_1__0 )? ) )
            // InternalMyAtlProject.g:7000:1: ( ( rule__InfixedExpCS__Group_1__0 )? )
            {
            // InternalMyAtlProject.g:7000:1: ( ( rule__InfixedExpCS__Group_1__0 )? )
            // InternalMyAtlProject.g:7001:2: ( rule__InfixedExpCS__Group_1__0 )?
            {
             before(grammarAccess.getInfixedExpCSAccess().getGroup_1()); 
            // InternalMyAtlProject.g:7002:2: ( rule__InfixedExpCS__Group_1__0 )?
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // InternalMyAtlProject.g:7002:3: rule__InfixedExpCS__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfixedExpCS__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInfixedExpCSAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixedExpCS__Group__1__Impl"


    // $ANTLR start "rule__InfixedExpCS__Group_1__0"
    // InternalMyAtlProject.g:7011:1: rule__InfixedExpCS__Group_1__0 : rule__InfixedExpCS__Group_1__0__Impl rule__InfixedExpCS__Group_1__1 ;
    public final void rule__InfixedExpCS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7015:1: ( rule__InfixedExpCS__Group_1__0__Impl rule__InfixedExpCS__Group_1__1 )
            // InternalMyAtlProject.g:7016:2: rule__InfixedExpCS__Group_1__0__Impl rule__InfixedExpCS__Group_1__1
            {
            pushFollow(FOLLOW_45);
            rule__InfixedExpCS__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InfixedExpCS__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixedExpCS__Group_1__0"


    // $ANTLR start "rule__InfixedExpCS__Group_1__0__Impl"
    // InternalMyAtlProject.g:7023:1: rule__InfixedExpCS__Group_1__0__Impl : ( () ) ;
    public final void rule__InfixedExpCS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7027:1: ( ( () ) )
            // InternalMyAtlProject.g:7028:1: ( () )
            {
            // InternalMyAtlProject.g:7028:1: ( () )
            // InternalMyAtlProject.g:7029:2: ()
            {
             before(grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0()); 
            // InternalMyAtlProject.g:7030:2: ()
            // InternalMyAtlProject.g:7030:3: 
            {
            }

             after(grammarAccess.getInfixedExpCSAccess().getInfixExpCSOwnedExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixedExpCS__Group_1__0__Impl"


    // $ANTLR start "rule__InfixedExpCS__Group_1__1"
    // InternalMyAtlProject.g:7038:1: rule__InfixedExpCS__Group_1__1 : rule__InfixedExpCS__Group_1__1__Impl ;
    public final void rule__InfixedExpCS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7042:1: ( rule__InfixedExpCS__Group_1__1__Impl )
            // InternalMyAtlProject.g:7043:2: rule__InfixedExpCS__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixedExpCS__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixedExpCS__Group_1__1"


    // $ANTLR start "rule__InfixedExpCS__Group_1__1__Impl"
    // InternalMyAtlProject.g:7049:1: rule__InfixedExpCS__Group_1__1__Impl : ( ( ( rule__InfixedExpCS__Group_1_1__0 ) ) ( ( rule__InfixedExpCS__Group_1_1__0 )* ) ) ;
    public final void rule__InfixedExpCS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7053:1: ( ( ( ( rule__InfixedExpCS__Group_1_1__0 ) ) ( ( rule__InfixedExpCS__Group_1_1__0 )* ) ) )
            // InternalMyAtlProject.g:7054:1: ( ( ( rule__InfixedExpCS__Group_1_1__0 ) ) ( ( rule__InfixedExpCS__Group_1_1__0 )* ) )
            {
            // InternalMyAtlProject.g:7054:1: ( ( ( rule__InfixedExpCS__Group_1_1__0 ) ) ( ( rule__InfixedExpCS__Group_1_1__0 )* ) )
            // InternalMyAtlProject.g:7055:2: ( ( rule__InfixedExpCS__Group_1_1__0 ) ) ( ( rule__InfixedExpCS__Group_1_1__0 )* )
            {
            // InternalMyAtlProject.g:7055:2: ( ( rule__InfixedExpCS__Group_1_1__0 ) )
            // InternalMyAtlProject.g:7056:3: ( rule__InfixedExpCS__Group_1_1__0 )
            {
             before(grammarAccess.getInfixedExpCSAccess().getGroup_1_1()); 
            // InternalMyAtlProject.g:7057:3: ( rule__InfixedExpCS__Group_1_1__0 )
            // InternalMyAtlProject.g:7057:4: rule__InfixedExpCS__Group_1_1__0
            {
            pushFollow(FOLLOW_46);
            rule__InfixedExpCS__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getInfixedExpCSAccess().getGroup_1_1()); 

            }

            // InternalMyAtlProject.g:7060:2: ( ( rule__InfixedExpCS__Group_1_1__0 )* )
            // InternalMyAtlProject.g:7061:3: ( rule__InfixedExpCS__Group_1_1__0 )*
            {
             before(grammarAccess.getInfixedExpCSAccess().getGroup_1_1()); 
            // InternalMyAtlProject.g:7062:3: ( rule__InfixedExpCS__Group_1_1__0 )*
            loop49:
            do {
                int alt49=2;
                alt49 = dfa49.predict(input);
                switch (alt49) {
            	case 1 :
            	    // InternalMyAtlProject.g:7062:4: rule__InfixedExpCS__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__InfixedExpCS__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getInfixedExpCSAccess().getGroup_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixedExpCS__Group_1__1__Impl"


    // $ANTLR start "rule__InfixedExpCS__Group_1_1__0"
    // InternalMyAtlProject.g:7072:1: rule__InfixedExpCS__Group_1_1__0 : rule__InfixedExpCS__Group_1_1__0__Impl rule__InfixedExpCS__Group_1_1__1 ;
    public final void rule__InfixedExpCS__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7076:1: ( rule__InfixedExpCS__Group_1_1__0__Impl rule__InfixedExpCS__Group_1_1__1 )
            // InternalMyAtlProject.g:7077:2: rule__InfixedExpCS__Group_1_1__0__Impl rule__InfixedExpCS__Group_1_1__1
            {
            pushFollow(FOLLOW_33);
            rule__InfixedExpCS__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InfixedExpCS__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixedExpCS__Group_1_1__0"


    // $ANTLR start "rule__InfixedExpCS__Group_1_1__0__Impl"
    // InternalMyAtlProject.g:7084:1: rule__InfixedExpCS__Group_1_1__0__Impl : ( ( rule__InfixedExpCS__OwnedOperatorAssignment_1_1_0 ) ) ;
    public final void rule__InfixedExpCS__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7088:1: ( ( ( rule__InfixedExpCS__OwnedOperatorAssignment_1_1_0 ) ) )
            // InternalMyAtlProject.g:7089:1: ( ( rule__InfixedExpCS__OwnedOperatorAssignment_1_1_0 ) )
            {
            // InternalMyAtlProject.g:7089:1: ( ( rule__InfixedExpCS__OwnedOperatorAssignment_1_1_0 ) )
            // InternalMyAtlProject.g:7090:2: ( rule__InfixedExpCS__OwnedOperatorAssignment_1_1_0 )
            {
             before(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorAssignment_1_1_0()); 
            // InternalMyAtlProject.g:7091:2: ( rule__InfixedExpCS__OwnedOperatorAssignment_1_1_0 )
            // InternalMyAtlProject.g:7091:3: rule__InfixedExpCS__OwnedOperatorAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__InfixedExpCS__OwnedOperatorAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixedExpCS__Group_1_1__0__Impl"


    // $ANTLR start "rule__InfixedExpCS__Group_1_1__1"
    // InternalMyAtlProject.g:7099:1: rule__InfixedExpCS__Group_1_1__1 : rule__InfixedExpCS__Group_1_1__1__Impl ;
    public final void rule__InfixedExpCS__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7103:1: ( rule__InfixedExpCS__Group_1_1__1__Impl )
            // InternalMyAtlProject.g:7104:2: rule__InfixedExpCS__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixedExpCS__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixedExpCS__Group_1_1__1"


    // $ANTLR start "rule__InfixedExpCS__Group_1_1__1__Impl"
    // InternalMyAtlProject.g:7110:1: rule__InfixedExpCS__Group_1_1__1__Impl : ( ( rule__InfixedExpCS__OwnedExpressionAssignment_1_1_1 ) ) ;
    public final void rule__InfixedExpCS__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7114:1: ( ( ( rule__InfixedExpCS__OwnedExpressionAssignment_1_1_1 ) ) )
            // InternalMyAtlProject.g:7115:1: ( ( rule__InfixedExpCS__OwnedExpressionAssignment_1_1_1 ) )
            {
            // InternalMyAtlProject.g:7115:1: ( ( rule__InfixedExpCS__OwnedExpressionAssignment_1_1_1 ) )
            // InternalMyAtlProject.g:7116:2: ( rule__InfixedExpCS__OwnedExpressionAssignment_1_1_1 )
            {
             before(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionAssignment_1_1_1()); 
            // InternalMyAtlProject.g:7117:2: ( rule__InfixedExpCS__OwnedExpressionAssignment_1_1_1 )
            // InternalMyAtlProject.g:7117:3: rule__InfixedExpCS__OwnedExpressionAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InfixedExpCS__OwnedExpressionAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixedExpCS__Group_1_1__1__Impl"


    // $ANTLR start "rule__PrefixedExpCS__Group_1__0"
    // InternalMyAtlProject.g:7126:1: rule__PrefixedExpCS__Group_1__0 : rule__PrefixedExpCS__Group_1__0__Impl rule__PrefixedExpCS__Group_1__1 ;
    public final void rule__PrefixedExpCS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7130:1: ( rule__PrefixedExpCS__Group_1__0__Impl rule__PrefixedExpCS__Group_1__1 )
            // InternalMyAtlProject.g:7131:2: rule__PrefixedExpCS__Group_1__0__Impl rule__PrefixedExpCS__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__PrefixedExpCS__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrefixedExpCS__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixedExpCS__Group_1__0"


    // $ANTLR start "rule__PrefixedExpCS__Group_1__0__Impl"
    // InternalMyAtlProject.g:7138:1: rule__PrefixedExpCS__Group_1__0__Impl : ( () ) ;
    public final void rule__PrefixedExpCS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7142:1: ( ( () ) )
            // InternalMyAtlProject.g:7143:1: ( () )
            {
            // InternalMyAtlProject.g:7143:1: ( () )
            // InternalMyAtlProject.g:7144:2: ()
            {
             before(grammarAccess.getPrefixedExpCSAccess().getPrefixExpCSAction_1_0()); 
            // InternalMyAtlProject.g:7145:2: ()
            // InternalMyAtlProject.g:7145:3: 
            {
            }

             after(grammarAccess.getPrefixedExpCSAccess().getPrefixExpCSAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixedExpCS__Group_1__0__Impl"


    // $ANTLR start "rule__PrefixedExpCS__Group_1__1"
    // InternalMyAtlProject.g:7153:1: rule__PrefixedExpCS__Group_1__1 : rule__PrefixedExpCS__Group_1__1__Impl rule__PrefixedExpCS__Group_1__2 ;
    public final void rule__PrefixedExpCS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7157:1: ( rule__PrefixedExpCS__Group_1__1__Impl rule__PrefixedExpCS__Group_1__2 )
            // InternalMyAtlProject.g:7158:2: rule__PrefixedExpCS__Group_1__1__Impl rule__PrefixedExpCS__Group_1__2
            {
            pushFollow(FOLLOW_47);
            rule__PrefixedExpCS__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrefixedExpCS__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixedExpCS__Group_1__1"


    // $ANTLR start "rule__PrefixedExpCS__Group_1__1__Impl"
    // InternalMyAtlProject.g:7165:1: rule__PrefixedExpCS__Group_1__1__Impl : ( ( ( rule__PrefixedExpCS__OwnedOperatorAssignment_1_1 ) ) ( ( rule__PrefixedExpCS__OwnedOperatorAssignment_1_1 )* ) ) ;
    public final void rule__PrefixedExpCS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7169:1: ( ( ( ( rule__PrefixedExpCS__OwnedOperatorAssignment_1_1 ) ) ( ( rule__PrefixedExpCS__OwnedOperatorAssignment_1_1 )* ) ) )
            // InternalMyAtlProject.g:7170:1: ( ( ( rule__PrefixedExpCS__OwnedOperatorAssignment_1_1 ) ) ( ( rule__PrefixedExpCS__OwnedOperatorAssignment_1_1 )* ) )
            {
            // InternalMyAtlProject.g:7170:1: ( ( ( rule__PrefixedExpCS__OwnedOperatorAssignment_1_1 ) ) ( ( rule__PrefixedExpCS__OwnedOperatorAssignment_1_1 )* ) )
            // InternalMyAtlProject.g:7171:2: ( ( rule__PrefixedExpCS__OwnedOperatorAssignment_1_1 ) ) ( ( rule__PrefixedExpCS__OwnedOperatorAssignment_1_1 )* )
            {
            // InternalMyAtlProject.g:7171:2: ( ( rule__PrefixedExpCS__OwnedOperatorAssignment_1_1 ) )
            // InternalMyAtlProject.g:7172:3: ( rule__PrefixedExpCS__OwnedOperatorAssignment_1_1 )
            {
             before(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorAssignment_1_1()); 
            // InternalMyAtlProject.g:7173:3: ( rule__PrefixedExpCS__OwnedOperatorAssignment_1_1 )
            // InternalMyAtlProject.g:7173:4: rule__PrefixedExpCS__OwnedOperatorAssignment_1_1
            {
            pushFollow(FOLLOW_48);
            rule__PrefixedExpCS__OwnedOperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorAssignment_1_1()); 

            }

            // InternalMyAtlProject.g:7176:2: ( ( rule__PrefixedExpCS__OwnedOperatorAssignment_1_1 )* )
            // InternalMyAtlProject.g:7177:3: ( rule__PrefixedExpCS__OwnedOperatorAssignment_1_1 )*
            {
             before(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorAssignment_1_1()); 
            // InternalMyAtlProject.g:7178:3: ( rule__PrefixedExpCS__OwnedOperatorAssignment_1_1 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=14 && LA50_0<=15)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMyAtlProject.g:7178:4: rule__PrefixedExpCS__OwnedOperatorAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__PrefixedExpCS__OwnedOperatorAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorAssignment_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixedExpCS__Group_1__1__Impl"


    // $ANTLR start "rule__PrefixedExpCS__Group_1__2"
    // InternalMyAtlProject.g:7187:1: rule__PrefixedExpCS__Group_1__2 : rule__PrefixedExpCS__Group_1__2__Impl ;
    public final void rule__PrefixedExpCS__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7191:1: ( rule__PrefixedExpCS__Group_1__2__Impl )
            // InternalMyAtlProject.g:7192:2: rule__PrefixedExpCS__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrefixedExpCS__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixedExpCS__Group_1__2"


    // $ANTLR start "rule__PrefixedExpCS__Group_1__2__Impl"
    // InternalMyAtlProject.g:7198:1: rule__PrefixedExpCS__Group_1__2__Impl : ( ( rule__PrefixedExpCS__OwnedExpressionAssignment_1_2 ) ) ;
    public final void rule__PrefixedExpCS__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7202:1: ( ( ( rule__PrefixedExpCS__OwnedExpressionAssignment_1_2 ) ) )
            // InternalMyAtlProject.g:7203:1: ( ( rule__PrefixedExpCS__OwnedExpressionAssignment_1_2 ) )
            {
            // InternalMyAtlProject.g:7203:1: ( ( rule__PrefixedExpCS__OwnedExpressionAssignment_1_2 ) )
            // InternalMyAtlProject.g:7204:2: ( rule__PrefixedExpCS__OwnedExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrefixedExpCSAccess().getOwnedExpressionAssignment_1_2()); 
            // InternalMyAtlProject.g:7205:2: ( rule__PrefixedExpCS__OwnedExpressionAssignment_1_2 )
            // InternalMyAtlProject.g:7205:3: rule__PrefixedExpCS__OwnedExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PrefixedExpCS__OwnedExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrefixedExpCSAccess().getOwnedExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixedExpCS__Group_1__2__Impl"


    // $ANTLR start "rule__IndexExpCS__Group__0"
    // InternalMyAtlProject.g:7214:1: rule__IndexExpCS__Group__0 : rule__IndexExpCS__Group__0__Impl rule__IndexExpCS__Group__1 ;
    public final void rule__IndexExpCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7218:1: ( rule__IndexExpCS__Group__0__Impl rule__IndexExpCS__Group__1 )
            // InternalMyAtlProject.g:7219:2: rule__IndexExpCS__Group__0__Impl rule__IndexExpCS__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__IndexExpCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexExpCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group__0"


    // $ANTLR start "rule__IndexExpCS__Group__0__Impl"
    // InternalMyAtlProject.g:7226:1: rule__IndexExpCS__Group__0__Impl : ( ruleNameExpCS ) ;
    public final void rule__IndexExpCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7230:1: ( ( ruleNameExpCS ) )
            // InternalMyAtlProject.g:7231:1: ( ruleNameExpCS )
            {
            // InternalMyAtlProject.g:7231:1: ( ruleNameExpCS )
            // InternalMyAtlProject.g:7232:2: ruleNameExpCS
            {
             before(grammarAccess.getIndexExpCSAccess().getNameExpCSParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNameExpCS();

            state._fsp--;

             after(grammarAccess.getIndexExpCSAccess().getNameExpCSParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group__0__Impl"


    // $ANTLR start "rule__IndexExpCS__Group__1"
    // InternalMyAtlProject.g:7241:1: rule__IndexExpCS__Group__1 : rule__IndexExpCS__Group__1__Impl ;
    public final void rule__IndexExpCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7245:1: ( rule__IndexExpCS__Group__1__Impl )
            // InternalMyAtlProject.g:7246:2: rule__IndexExpCS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndexExpCS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group__1"


    // $ANTLR start "rule__IndexExpCS__Group__1__Impl"
    // InternalMyAtlProject.g:7252:1: rule__IndexExpCS__Group__1__Impl : ( ( rule__IndexExpCS__Group_1__0 )? ) ;
    public final void rule__IndexExpCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7256:1: ( ( ( rule__IndexExpCS__Group_1__0 )? ) )
            // InternalMyAtlProject.g:7257:1: ( ( rule__IndexExpCS__Group_1__0 )? )
            {
            // InternalMyAtlProject.g:7257:1: ( ( rule__IndexExpCS__Group_1__0 )? )
            // InternalMyAtlProject.g:7258:2: ( rule__IndexExpCS__Group_1__0 )?
            {
             before(grammarAccess.getIndexExpCSAccess().getGroup_1()); 
            // InternalMyAtlProject.g:7259:2: ( rule__IndexExpCS__Group_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==77) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyAtlProject.g:7259:3: rule__IndexExpCS__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IndexExpCS__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIndexExpCSAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group__1__Impl"


    // $ANTLR start "rule__IndexExpCS__Group_1__0"
    // InternalMyAtlProject.g:7268:1: rule__IndexExpCS__Group_1__0 : rule__IndexExpCS__Group_1__0__Impl rule__IndexExpCS__Group_1__1 ;
    public final void rule__IndexExpCS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7272:1: ( rule__IndexExpCS__Group_1__0__Impl rule__IndexExpCS__Group_1__1 )
            // InternalMyAtlProject.g:7273:2: rule__IndexExpCS__Group_1__0__Impl rule__IndexExpCS__Group_1__1
            {
            pushFollow(FOLLOW_49);
            rule__IndexExpCS__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexExpCS__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1__0"


    // $ANTLR start "rule__IndexExpCS__Group_1__0__Impl"
    // InternalMyAtlProject.g:7280:1: rule__IndexExpCS__Group_1__0__Impl : ( () ) ;
    public final void rule__IndexExpCS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7284:1: ( ( () ) )
            // InternalMyAtlProject.g:7285:1: ( () )
            {
            // InternalMyAtlProject.g:7285:1: ( () )
            // InternalMyAtlProject.g:7286:2: ()
            {
             before(grammarAccess.getIndexExpCSAccess().getIndexExpCSNamedExpAction_1_0()); 
            // InternalMyAtlProject.g:7287:2: ()
            // InternalMyAtlProject.g:7287:3: 
            {
            }

             after(grammarAccess.getIndexExpCSAccess().getIndexExpCSNamedExpAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1__0__Impl"


    // $ANTLR start "rule__IndexExpCS__Group_1__1"
    // InternalMyAtlProject.g:7295:1: rule__IndexExpCS__Group_1__1 : rule__IndexExpCS__Group_1__1__Impl rule__IndexExpCS__Group_1__2 ;
    public final void rule__IndexExpCS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7299:1: ( rule__IndexExpCS__Group_1__1__Impl rule__IndexExpCS__Group_1__2 )
            // InternalMyAtlProject.g:7300:2: rule__IndexExpCS__Group_1__1__Impl rule__IndexExpCS__Group_1__2
            {
            pushFollow(FOLLOW_33);
            rule__IndexExpCS__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexExpCS__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1__1"


    // $ANTLR start "rule__IndexExpCS__Group_1__1__Impl"
    // InternalMyAtlProject.g:7307:1: rule__IndexExpCS__Group_1__1__Impl : ( '[' ) ;
    public final void rule__IndexExpCS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7311:1: ( ( '[' ) )
            // InternalMyAtlProject.g:7312:1: ( '[' )
            {
            // InternalMyAtlProject.g:7312:1: ( '[' )
            // InternalMyAtlProject.g:7313:2: '['
            {
             before(grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1__1__Impl"


    // $ANTLR start "rule__IndexExpCS__Group_1__2"
    // InternalMyAtlProject.g:7322:1: rule__IndexExpCS__Group_1__2 : rule__IndexExpCS__Group_1__2__Impl rule__IndexExpCS__Group_1__3 ;
    public final void rule__IndexExpCS__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7326:1: ( rule__IndexExpCS__Group_1__2__Impl rule__IndexExpCS__Group_1__3 )
            // InternalMyAtlProject.g:7327:2: rule__IndexExpCS__Group_1__2__Impl rule__IndexExpCS__Group_1__3
            {
            pushFollow(FOLLOW_50);
            rule__IndexExpCS__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexExpCS__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1__2"


    // $ANTLR start "rule__IndexExpCS__Group_1__2__Impl"
    // InternalMyAtlProject.g:7334:1: rule__IndexExpCS__Group_1__2__Impl : ( ( rule__IndexExpCS__FirstIndexesAssignment_1_2 ) ) ;
    public final void rule__IndexExpCS__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7338:1: ( ( ( rule__IndexExpCS__FirstIndexesAssignment_1_2 ) ) )
            // InternalMyAtlProject.g:7339:1: ( ( rule__IndexExpCS__FirstIndexesAssignment_1_2 ) )
            {
            // InternalMyAtlProject.g:7339:1: ( ( rule__IndexExpCS__FirstIndexesAssignment_1_2 ) )
            // InternalMyAtlProject.g:7340:2: ( rule__IndexExpCS__FirstIndexesAssignment_1_2 )
            {
             before(grammarAccess.getIndexExpCSAccess().getFirstIndexesAssignment_1_2()); 
            // InternalMyAtlProject.g:7341:2: ( rule__IndexExpCS__FirstIndexesAssignment_1_2 )
            // InternalMyAtlProject.g:7341:3: rule__IndexExpCS__FirstIndexesAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__IndexExpCS__FirstIndexesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getIndexExpCSAccess().getFirstIndexesAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1__2__Impl"


    // $ANTLR start "rule__IndexExpCS__Group_1__3"
    // InternalMyAtlProject.g:7349:1: rule__IndexExpCS__Group_1__3 : rule__IndexExpCS__Group_1__3__Impl rule__IndexExpCS__Group_1__4 ;
    public final void rule__IndexExpCS__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7353:1: ( rule__IndexExpCS__Group_1__3__Impl rule__IndexExpCS__Group_1__4 )
            // InternalMyAtlProject.g:7354:2: rule__IndexExpCS__Group_1__3__Impl rule__IndexExpCS__Group_1__4
            {
            pushFollow(FOLLOW_50);
            rule__IndexExpCS__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexExpCS__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1__3"


    // $ANTLR start "rule__IndexExpCS__Group_1__3__Impl"
    // InternalMyAtlProject.g:7361:1: rule__IndexExpCS__Group_1__3__Impl : ( ( rule__IndexExpCS__Group_1_3__0 )* ) ;
    public final void rule__IndexExpCS__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7365:1: ( ( ( rule__IndexExpCS__Group_1_3__0 )* ) )
            // InternalMyAtlProject.g:7366:1: ( ( rule__IndexExpCS__Group_1_3__0 )* )
            {
            // InternalMyAtlProject.g:7366:1: ( ( rule__IndexExpCS__Group_1_3__0 )* )
            // InternalMyAtlProject.g:7367:2: ( rule__IndexExpCS__Group_1_3__0 )*
            {
             before(grammarAccess.getIndexExpCSAccess().getGroup_1_3()); 
            // InternalMyAtlProject.g:7368:2: ( rule__IndexExpCS__Group_1_3__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==63) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalMyAtlProject.g:7368:3: rule__IndexExpCS__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__IndexExpCS__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getIndexExpCSAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1__3__Impl"


    // $ANTLR start "rule__IndexExpCS__Group_1__4"
    // InternalMyAtlProject.g:7376:1: rule__IndexExpCS__Group_1__4 : rule__IndexExpCS__Group_1__4__Impl rule__IndexExpCS__Group_1__5 ;
    public final void rule__IndexExpCS__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7380:1: ( rule__IndexExpCS__Group_1__4__Impl rule__IndexExpCS__Group_1__5 )
            // InternalMyAtlProject.g:7381:2: rule__IndexExpCS__Group_1__4__Impl rule__IndexExpCS__Group_1__5
            {
            pushFollow(FOLLOW_49);
            rule__IndexExpCS__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexExpCS__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1__4"


    // $ANTLR start "rule__IndexExpCS__Group_1__4__Impl"
    // InternalMyAtlProject.g:7388:1: rule__IndexExpCS__Group_1__4__Impl : ( ']' ) ;
    public final void rule__IndexExpCS__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7392:1: ( ( ']' ) )
            // InternalMyAtlProject.g:7393:1: ( ']' )
            {
            // InternalMyAtlProject.g:7393:1: ( ']' )
            // InternalMyAtlProject.g:7394:2: ']'
            {
             before(grammarAccess.getIndexExpCSAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getIndexExpCSAccess().getRightSquareBracketKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1__4__Impl"


    // $ANTLR start "rule__IndexExpCS__Group_1__5"
    // InternalMyAtlProject.g:7403:1: rule__IndexExpCS__Group_1__5 : rule__IndexExpCS__Group_1__5__Impl ;
    public final void rule__IndexExpCS__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7407:1: ( rule__IndexExpCS__Group_1__5__Impl )
            // InternalMyAtlProject.g:7408:2: rule__IndexExpCS__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndexExpCS__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1__5"


    // $ANTLR start "rule__IndexExpCS__Group_1__5__Impl"
    // InternalMyAtlProject.g:7414:1: rule__IndexExpCS__Group_1__5__Impl : ( ( rule__IndexExpCS__Group_1_5__0 )? ) ;
    public final void rule__IndexExpCS__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7418:1: ( ( ( rule__IndexExpCS__Group_1_5__0 )? ) )
            // InternalMyAtlProject.g:7419:1: ( ( rule__IndexExpCS__Group_1_5__0 )? )
            {
            // InternalMyAtlProject.g:7419:1: ( ( rule__IndexExpCS__Group_1_5__0 )? )
            // InternalMyAtlProject.g:7420:2: ( rule__IndexExpCS__Group_1_5__0 )?
            {
             before(grammarAccess.getIndexExpCSAccess().getGroup_1_5()); 
            // InternalMyAtlProject.g:7421:2: ( rule__IndexExpCS__Group_1_5__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==77) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyAtlProject.g:7421:3: rule__IndexExpCS__Group_1_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IndexExpCS__Group_1_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIndexExpCSAccess().getGroup_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1__5__Impl"


    // $ANTLR start "rule__IndexExpCS__Group_1_3__0"
    // InternalMyAtlProject.g:7430:1: rule__IndexExpCS__Group_1_3__0 : rule__IndexExpCS__Group_1_3__0__Impl rule__IndexExpCS__Group_1_3__1 ;
    public final void rule__IndexExpCS__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7434:1: ( rule__IndexExpCS__Group_1_3__0__Impl rule__IndexExpCS__Group_1_3__1 )
            // InternalMyAtlProject.g:7435:2: rule__IndexExpCS__Group_1_3__0__Impl rule__IndexExpCS__Group_1_3__1
            {
            pushFollow(FOLLOW_33);
            rule__IndexExpCS__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexExpCS__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1_3__0"


    // $ANTLR start "rule__IndexExpCS__Group_1_3__0__Impl"
    // InternalMyAtlProject.g:7442:1: rule__IndexExpCS__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__IndexExpCS__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7446:1: ( ( ',' ) )
            // InternalMyAtlProject.g:7447:1: ( ',' )
            {
            // InternalMyAtlProject.g:7447:1: ( ',' )
            // InternalMyAtlProject.g:7448:2: ','
            {
             before(grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_3_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1_3__0__Impl"


    // $ANTLR start "rule__IndexExpCS__Group_1_3__1"
    // InternalMyAtlProject.g:7457:1: rule__IndexExpCS__Group_1_3__1 : rule__IndexExpCS__Group_1_3__1__Impl ;
    public final void rule__IndexExpCS__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7461:1: ( rule__IndexExpCS__Group_1_3__1__Impl )
            // InternalMyAtlProject.g:7462:2: rule__IndexExpCS__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndexExpCS__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1_3__1"


    // $ANTLR start "rule__IndexExpCS__Group_1_3__1__Impl"
    // InternalMyAtlProject.g:7468:1: rule__IndexExpCS__Group_1_3__1__Impl : ( ( rule__IndexExpCS__FirstIndexesAssignment_1_3_1 ) ) ;
    public final void rule__IndexExpCS__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7472:1: ( ( ( rule__IndexExpCS__FirstIndexesAssignment_1_3_1 ) ) )
            // InternalMyAtlProject.g:7473:1: ( ( rule__IndexExpCS__FirstIndexesAssignment_1_3_1 ) )
            {
            // InternalMyAtlProject.g:7473:1: ( ( rule__IndexExpCS__FirstIndexesAssignment_1_3_1 ) )
            // InternalMyAtlProject.g:7474:2: ( rule__IndexExpCS__FirstIndexesAssignment_1_3_1 )
            {
             before(grammarAccess.getIndexExpCSAccess().getFirstIndexesAssignment_1_3_1()); 
            // InternalMyAtlProject.g:7475:2: ( rule__IndexExpCS__FirstIndexesAssignment_1_3_1 )
            // InternalMyAtlProject.g:7475:3: rule__IndexExpCS__FirstIndexesAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__IndexExpCS__FirstIndexesAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIndexExpCSAccess().getFirstIndexesAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1_3__1__Impl"


    // $ANTLR start "rule__IndexExpCS__Group_1_5__0"
    // InternalMyAtlProject.g:7484:1: rule__IndexExpCS__Group_1_5__0 : rule__IndexExpCS__Group_1_5__0__Impl rule__IndexExpCS__Group_1_5__1 ;
    public final void rule__IndexExpCS__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7488:1: ( rule__IndexExpCS__Group_1_5__0__Impl rule__IndexExpCS__Group_1_5__1 )
            // InternalMyAtlProject.g:7489:2: rule__IndexExpCS__Group_1_5__0__Impl rule__IndexExpCS__Group_1_5__1
            {
            pushFollow(FOLLOW_33);
            rule__IndexExpCS__Group_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexExpCS__Group_1_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1_5__0"


    // $ANTLR start "rule__IndexExpCS__Group_1_5__0__Impl"
    // InternalMyAtlProject.g:7496:1: rule__IndexExpCS__Group_1_5__0__Impl : ( '[' ) ;
    public final void rule__IndexExpCS__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7500:1: ( ( '[' ) )
            // InternalMyAtlProject.g:7501:1: ( '[' )
            {
            // InternalMyAtlProject.g:7501:1: ( '[' )
            // InternalMyAtlProject.g:7502:2: '['
            {
             before(grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_5_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getIndexExpCSAccess().getLeftSquareBracketKeyword_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1_5__0__Impl"


    // $ANTLR start "rule__IndexExpCS__Group_1_5__1"
    // InternalMyAtlProject.g:7511:1: rule__IndexExpCS__Group_1_5__1 : rule__IndexExpCS__Group_1_5__1__Impl rule__IndexExpCS__Group_1_5__2 ;
    public final void rule__IndexExpCS__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7515:1: ( rule__IndexExpCS__Group_1_5__1__Impl rule__IndexExpCS__Group_1_5__2 )
            // InternalMyAtlProject.g:7516:2: rule__IndexExpCS__Group_1_5__1__Impl rule__IndexExpCS__Group_1_5__2
            {
            pushFollow(FOLLOW_50);
            rule__IndexExpCS__Group_1_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexExpCS__Group_1_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1_5__1"


    // $ANTLR start "rule__IndexExpCS__Group_1_5__1__Impl"
    // InternalMyAtlProject.g:7523:1: rule__IndexExpCS__Group_1_5__1__Impl : ( ( rule__IndexExpCS__SecondIndexesAssignment_1_5_1 ) ) ;
    public final void rule__IndexExpCS__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7527:1: ( ( ( rule__IndexExpCS__SecondIndexesAssignment_1_5_1 ) ) )
            // InternalMyAtlProject.g:7528:1: ( ( rule__IndexExpCS__SecondIndexesAssignment_1_5_1 ) )
            {
            // InternalMyAtlProject.g:7528:1: ( ( rule__IndexExpCS__SecondIndexesAssignment_1_5_1 ) )
            // InternalMyAtlProject.g:7529:2: ( rule__IndexExpCS__SecondIndexesAssignment_1_5_1 )
            {
             before(grammarAccess.getIndexExpCSAccess().getSecondIndexesAssignment_1_5_1()); 
            // InternalMyAtlProject.g:7530:2: ( rule__IndexExpCS__SecondIndexesAssignment_1_5_1 )
            // InternalMyAtlProject.g:7530:3: rule__IndexExpCS__SecondIndexesAssignment_1_5_1
            {
            pushFollow(FOLLOW_2);
            rule__IndexExpCS__SecondIndexesAssignment_1_5_1();

            state._fsp--;


            }

             after(grammarAccess.getIndexExpCSAccess().getSecondIndexesAssignment_1_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1_5__1__Impl"


    // $ANTLR start "rule__IndexExpCS__Group_1_5__2"
    // InternalMyAtlProject.g:7538:1: rule__IndexExpCS__Group_1_5__2 : rule__IndexExpCS__Group_1_5__2__Impl rule__IndexExpCS__Group_1_5__3 ;
    public final void rule__IndexExpCS__Group_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7542:1: ( rule__IndexExpCS__Group_1_5__2__Impl rule__IndexExpCS__Group_1_5__3 )
            // InternalMyAtlProject.g:7543:2: rule__IndexExpCS__Group_1_5__2__Impl rule__IndexExpCS__Group_1_5__3
            {
            pushFollow(FOLLOW_50);
            rule__IndexExpCS__Group_1_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexExpCS__Group_1_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1_5__2"


    // $ANTLR start "rule__IndexExpCS__Group_1_5__2__Impl"
    // InternalMyAtlProject.g:7550:1: rule__IndexExpCS__Group_1_5__2__Impl : ( ( rule__IndexExpCS__Group_1_5_2__0 )* ) ;
    public final void rule__IndexExpCS__Group_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7554:1: ( ( ( rule__IndexExpCS__Group_1_5_2__0 )* ) )
            // InternalMyAtlProject.g:7555:1: ( ( rule__IndexExpCS__Group_1_5_2__0 )* )
            {
            // InternalMyAtlProject.g:7555:1: ( ( rule__IndexExpCS__Group_1_5_2__0 )* )
            // InternalMyAtlProject.g:7556:2: ( rule__IndexExpCS__Group_1_5_2__0 )*
            {
             before(grammarAccess.getIndexExpCSAccess().getGroup_1_5_2()); 
            // InternalMyAtlProject.g:7557:2: ( rule__IndexExpCS__Group_1_5_2__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==63) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalMyAtlProject.g:7557:3: rule__IndexExpCS__Group_1_5_2__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__IndexExpCS__Group_1_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getIndexExpCSAccess().getGroup_1_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1_5__2__Impl"


    // $ANTLR start "rule__IndexExpCS__Group_1_5__3"
    // InternalMyAtlProject.g:7565:1: rule__IndexExpCS__Group_1_5__3 : rule__IndexExpCS__Group_1_5__3__Impl ;
    public final void rule__IndexExpCS__Group_1_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7569:1: ( rule__IndexExpCS__Group_1_5__3__Impl )
            // InternalMyAtlProject.g:7570:2: rule__IndexExpCS__Group_1_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndexExpCS__Group_1_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1_5__3"


    // $ANTLR start "rule__IndexExpCS__Group_1_5__3__Impl"
    // InternalMyAtlProject.g:7576:1: rule__IndexExpCS__Group_1_5__3__Impl : ( ']' ) ;
    public final void rule__IndexExpCS__Group_1_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7580:1: ( ( ']' ) )
            // InternalMyAtlProject.g:7581:1: ( ']' )
            {
            // InternalMyAtlProject.g:7581:1: ( ']' )
            // InternalMyAtlProject.g:7582:2: ']'
            {
             before(grammarAccess.getIndexExpCSAccess().getRightSquareBracketKeyword_1_5_3()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getIndexExpCSAccess().getRightSquareBracketKeyword_1_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1_5__3__Impl"


    // $ANTLR start "rule__IndexExpCS__Group_1_5_2__0"
    // InternalMyAtlProject.g:7592:1: rule__IndexExpCS__Group_1_5_2__0 : rule__IndexExpCS__Group_1_5_2__0__Impl rule__IndexExpCS__Group_1_5_2__1 ;
    public final void rule__IndexExpCS__Group_1_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7596:1: ( rule__IndexExpCS__Group_1_5_2__0__Impl rule__IndexExpCS__Group_1_5_2__1 )
            // InternalMyAtlProject.g:7597:2: rule__IndexExpCS__Group_1_5_2__0__Impl rule__IndexExpCS__Group_1_5_2__1
            {
            pushFollow(FOLLOW_33);
            rule__IndexExpCS__Group_1_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexExpCS__Group_1_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1_5_2__0"


    // $ANTLR start "rule__IndexExpCS__Group_1_5_2__0__Impl"
    // InternalMyAtlProject.g:7604:1: rule__IndexExpCS__Group_1_5_2__0__Impl : ( ',' ) ;
    public final void rule__IndexExpCS__Group_1_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7608:1: ( ( ',' ) )
            // InternalMyAtlProject.g:7609:1: ( ',' )
            {
            // InternalMyAtlProject.g:7609:1: ( ',' )
            // InternalMyAtlProject.g:7610:2: ','
            {
             before(grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_5_2_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getIndexExpCSAccess().getCommaKeyword_1_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1_5_2__0__Impl"


    // $ANTLR start "rule__IndexExpCS__Group_1_5_2__1"
    // InternalMyAtlProject.g:7619:1: rule__IndexExpCS__Group_1_5_2__1 : rule__IndexExpCS__Group_1_5_2__1__Impl ;
    public final void rule__IndexExpCS__Group_1_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7623:1: ( rule__IndexExpCS__Group_1_5_2__1__Impl )
            // InternalMyAtlProject.g:7624:2: rule__IndexExpCS__Group_1_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndexExpCS__Group_1_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1_5_2__1"


    // $ANTLR start "rule__IndexExpCS__Group_1_5_2__1__Impl"
    // InternalMyAtlProject.g:7630:1: rule__IndexExpCS__Group_1_5_2__1__Impl : ( ( rule__IndexExpCS__SecondIndexesAssignment_1_5_2_1 ) ) ;
    public final void rule__IndexExpCS__Group_1_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7634:1: ( ( ( rule__IndexExpCS__SecondIndexesAssignment_1_5_2_1 ) ) )
            // InternalMyAtlProject.g:7635:1: ( ( rule__IndexExpCS__SecondIndexesAssignment_1_5_2_1 ) )
            {
            // InternalMyAtlProject.g:7635:1: ( ( rule__IndexExpCS__SecondIndexesAssignment_1_5_2_1 ) )
            // InternalMyAtlProject.g:7636:2: ( rule__IndexExpCS__SecondIndexesAssignment_1_5_2_1 )
            {
             before(grammarAccess.getIndexExpCSAccess().getSecondIndexesAssignment_1_5_2_1()); 
            // InternalMyAtlProject.g:7637:2: ( rule__IndexExpCS__SecondIndexesAssignment_1_5_2_1 )
            // InternalMyAtlProject.g:7637:3: rule__IndexExpCS__SecondIndexesAssignment_1_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__IndexExpCS__SecondIndexesAssignment_1_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIndexExpCSAccess().getSecondIndexesAssignment_1_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__Group_1_5_2__1__Impl"


    // $ANTLR start "rule__NavigatingExpCS__Group__0"
    // InternalMyAtlProject.g:7646:1: rule__NavigatingExpCS__Group__0 : rule__NavigatingExpCS__Group__0__Impl rule__NavigatingExpCS__Group__1 ;
    public final void rule__NavigatingExpCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7650:1: ( rule__NavigatingExpCS__Group__0__Impl rule__NavigatingExpCS__Group__1 )
            // InternalMyAtlProject.g:7651:2: rule__NavigatingExpCS__Group__0__Impl rule__NavigatingExpCS__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__NavigatingExpCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group__0"


    // $ANTLR start "rule__NavigatingExpCS__Group__0__Impl"
    // InternalMyAtlProject.g:7658:1: rule__NavigatingExpCS__Group__0__Impl : ( ruleNavigatingExpCS_Base ) ;
    public final void rule__NavigatingExpCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7662:1: ( ( ruleNavigatingExpCS_Base ) )
            // InternalMyAtlProject.g:7663:1: ( ruleNavigatingExpCS_Base )
            {
            // InternalMyAtlProject.g:7663:1: ( ruleNavigatingExpCS_Base )
            // InternalMyAtlProject.g:7664:2: ruleNavigatingExpCS_Base
            {
             before(grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCS_BaseParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigatingExpCS_Base();

            state._fsp--;

             after(grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCS_BaseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group__0__Impl"


    // $ANTLR start "rule__NavigatingExpCS__Group__1"
    // InternalMyAtlProject.g:7673:1: rule__NavigatingExpCS__Group__1 : rule__NavigatingExpCS__Group__1__Impl ;
    public final void rule__NavigatingExpCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7677:1: ( rule__NavigatingExpCS__Group__1__Impl )
            // InternalMyAtlProject.g:7678:2: rule__NavigatingExpCS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group__1"


    // $ANTLR start "rule__NavigatingExpCS__Group__1__Impl"
    // InternalMyAtlProject.g:7684:1: rule__NavigatingExpCS__Group__1__Impl : ( ( rule__NavigatingExpCS__Group_1__0 )? ) ;
    public final void rule__NavigatingExpCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7688:1: ( ( ( rule__NavigatingExpCS__Group_1__0 )? ) )
            // InternalMyAtlProject.g:7689:1: ( ( rule__NavigatingExpCS__Group_1__0 )? )
            {
            // InternalMyAtlProject.g:7689:1: ( ( rule__NavigatingExpCS__Group_1__0 )? )
            // InternalMyAtlProject.g:7690:2: ( rule__NavigatingExpCS__Group_1__0 )?
            {
             before(grammarAccess.getNavigatingExpCSAccess().getGroup_1()); 
            // InternalMyAtlProject.g:7691:2: ( rule__NavigatingExpCS__Group_1__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==59) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyAtlProject.g:7691:3: rule__NavigatingExpCS__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigatingExpCS__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavigatingExpCSAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group__1__Impl"


    // $ANTLR start "rule__NavigatingExpCS__Group_1__0"
    // InternalMyAtlProject.g:7700:1: rule__NavigatingExpCS__Group_1__0 : rule__NavigatingExpCS__Group_1__0__Impl rule__NavigatingExpCS__Group_1__1 ;
    public final void rule__NavigatingExpCS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7704:1: ( rule__NavigatingExpCS__Group_1__0__Impl rule__NavigatingExpCS__Group_1__1 )
            // InternalMyAtlProject.g:7705:2: rule__NavigatingExpCS__Group_1__0__Impl rule__NavigatingExpCS__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__NavigatingExpCS__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1__0"


    // $ANTLR start "rule__NavigatingExpCS__Group_1__0__Impl"
    // InternalMyAtlProject.g:7712:1: rule__NavigatingExpCS__Group_1__0__Impl : ( () ) ;
    public final void rule__NavigatingExpCS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7716:1: ( ( () ) )
            // InternalMyAtlProject.g:7717:1: ( () )
            {
            // InternalMyAtlProject.g:7717:1: ( () )
            // InternalMyAtlProject.g:7718:2: ()
            {
             before(grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCSNamedExpAction_1_0()); 
            // InternalMyAtlProject.g:7719:2: ()
            // InternalMyAtlProject.g:7719:3: 
            {
            }

             after(grammarAccess.getNavigatingExpCSAccess().getNavigatingExpCSNamedExpAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1__0__Impl"


    // $ANTLR start "rule__NavigatingExpCS__Group_1__1"
    // InternalMyAtlProject.g:7727:1: rule__NavigatingExpCS__Group_1__1 : rule__NavigatingExpCS__Group_1__1__Impl rule__NavigatingExpCS__Group_1__2 ;
    public final void rule__NavigatingExpCS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7731:1: ( rule__NavigatingExpCS__Group_1__1__Impl rule__NavigatingExpCS__Group_1__2 )
            // InternalMyAtlProject.g:7732:2: rule__NavigatingExpCS__Group_1__1__Impl rule__NavigatingExpCS__Group_1__2
            {
            pushFollow(FOLLOW_51);
            rule__NavigatingExpCS__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1__1"


    // $ANTLR start "rule__NavigatingExpCS__Group_1__1__Impl"
    // InternalMyAtlProject.g:7739:1: rule__NavigatingExpCS__Group_1__1__Impl : ( '(' ) ;
    public final void rule__NavigatingExpCS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7743:1: ( ( '(' ) )
            // InternalMyAtlProject.g:7744:1: ( '(' )
            {
            // InternalMyAtlProject.g:7744:1: ( '(' )
            // InternalMyAtlProject.g:7745:2: '('
            {
             before(grammarAccess.getNavigatingExpCSAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getNavigatingExpCSAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1__1__Impl"


    // $ANTLR start "rule__NavigatingExpCS__Group_1__2"
    // InternalMyAtlProject.g:7754:1: rule__NavigatingExpCS__Group_1__2 : rule__NavigatingExpCS__Group_1__2__Impl rule__NavigatingExpCS__Group_1__3 ;
    public final void rule__NavigatingExpCS__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7758:1: ( rule__NavigatingExpCS__Group_1__2__Impl rule__NavigatingExpCS__Group_1__3 )
            // InternalMyAtlProject.g:7759:2: rule__NavigatingExpCS__Group_1__2__Impl rule__NavigatingExpCS__Group_1__3
            {
            pushFollow(FOLLOW_51);
            rule__NavigatingExpCS__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1__2"


    // $ANTLR start "rule__NavigatingExpCS__Group_1__2__Impl"
    // InternalMyAtlProject.g:7766:1: rule__NavigatingExpCS__Group_1__2__Impl : ( ( rule__NavigatingExpCS__Group_1_2__0 )? ) ;
    public final void rule__NavigatingExpCS__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7770:1: ( ( ( rule__NavigatingExpCS__Group_1_2__0 )? ) )
            // InternalMyAtlProject.g:7771:1: ( ( rule__NavigatingExpCS__Group_1_2__0 )? )
            {
            // InternalMyAtlProject.g:7771:1: ( ( rule__NavigatingExpCS__Group_1_2__0 )? )
            // InternalMyAtlProject.g:7772:2: ( rule__NavigatingExpCS__Group_1_2__0 )?
            {
             before(grammarAccess.getNavigatingExpCSAccess().getGroup_1_2()); 
            // InternalMyAtlProject.g:7773:2: ( rule__NavigatingExpCS__Group_1_2__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_SINGLE_QUOTED_STRING && LA56_0<=RULE_BIG_INT)||(LA56_0>=14 && LA56_0<=16)||(LA56_0>=31 && LA56_0<=44)||LA56_0==59||(LA56_0>=68 && LA56_0<=70)||LA56_0==74||LA56_0==76||(LA56_0>=79 && LA56_0<=80)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyAtlProject.g:7773:3: rule__NavigatingExpCS__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigatingExpCS__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavigatingExpCSAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1__2__Impl"


    // $ANTLR start "rule__NavigatingExpCS__Group_1__3"
    // InternalMyAtlProject.g:7781:1: rule__NavigatingExpCS__Group_1__3 : rule__NavigatingExpCS__Group_1__3__Impl ;
    public final void rule__NavigatingExpCS__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7785:1: ( rule__NavigatingExpCS__Group_1__3__Impl )
            // InternalMyAtlProject.g:7786:2: rule__NavigatingExpCS__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1__3"


    // $ANTLR start "rule__NavigatingExpCS__Group_1__3__Impl"
    // InternalMyAtlProject.g:7792:1: rule__NavigatingExpCS__Group_1__3__Impl : ( ')' ) ;
    public final void rule__NavigatingExpCS__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7796:1: ( ( ')' ) )
            // InternalMyAtlProject.g:7797:1: ( ')' )
            {
            // InternalMyAtlProject.g:7797:1: ( ')' )
            // InternalMyAtlProject.g:7798:2: ')'
            {
             before(grammarAccess.getNavigatingExpCSAccess().getRightParenthesisKeyword_1_3()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getNavigatingExpCSAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1__3__Impl"


    // $ANTLR start "rule__NavigatingExpCS__Group_1_2__0"
    // InternalMyAtlProject.g:7808:1: rule__NavigatingExpCS__Group_1_2__0 : rule__NavigatingExpCS__Group_1_2__0__Impl rule__NavigatingExpCS__Group_1_2__1 ;
    public final void rule__NavigatingExpCS__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7812:1: ( rule__NavigatingExpCS__Group_1_2__0__Impl rule__NavigatingExpCS__Group_1_2__1 )
            // InternalMyAtlProject.g:7813:2: rule__NavigatingExpCS__Group_1_2__0__Impl rule__NavigatingExpCS__Group_1_2__1
            {
            pushFollow(FOLLOW_52);
            rule__NavigatingExpCS__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1_2__0"


    // $ANTLR start "rule__NavigatingExpCS__Group_1_2__0__Impl"
    // InternalMyAtlProject.g:7820:1: rule__NavigatingExpCS__Group_1_2__0__Impl : ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_0 ) ) ;
    public final void rule__NavigatingExpCS__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7824:1: ( ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_0 ) ) )
            // InternalMyAtlProject.g:7825:1: ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_0 ) )
            {
            // InternalMyAtlProject.g:7825:1: ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_0 ) )
            // InternalMyAtlProject.g:7826:2: ( rule__NavigatingExpCS__ArgumentAssignment_1_2_0 )
            {
             before(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_0()); 
            // InternalMyAtlProject.g:7827:2: ( rule__NavigatingExpCS__ArgumentAssignment_1_2_0 )
            // InternalMyAtlProject.g:7827:3: rule__NavigatingExpCS__ArgumentAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__ArgumentAssignment_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1_2__0__Impl"


    // $ANTLR start "rule__NavigatingExpCS__Group_1_2__1"
    // InternalMyAtlProject.g:7835:1: rule__NavigatingExpCS__Group_1_2__1 : rule__NavigatingExpCS__Group_1_2__1__Impl rule__NavigatingExpCS__Group_1_2__2 ;
    public final void rule__NavigatingExpCS__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7839:1: ( rule__NavigatingExpCS__Group_1_2__1__Impl rule__NavigatingExpCS__Group_1_2__2 )
            // InternalMyAtlProject.g:7840:2: rule__NavigatingExpCS__Group_1_2__1__Impl rule__NavigatingExpCS__Group_1_2__2
            {
            pushFollow(FOLLOW_52);
            rule__NavigatingExpCS__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1_2__1"


    // $ANTLR start "rule__NavigatingExpCS__Group_1_2__1__Impl"
    // InternalMyAtlProject.g:7847:1: rule__NavigatingExpCS__Group_1_2__1__Impl : ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_1 )* ) ;
    public final void rule__NavigatingExpCS__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7851:1: ( ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_1 )* ) )
            // InternalMyAtlProject.g:7852:1: ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_1 )* )
            {
            // InternalMyAtlProject.g:7852:1: ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_1 )* )
            // InternalMyAtlProject.g:7853:2: ( rule__NavigatingExpCS__ArgumentAssignment_1_2_1 )*
            {
             before(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_1()); 
            // InternalMyAtlProject.g:7854:2: ( rule__NavigatingExpCS__ArgumentAssignment_1_2_1 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==63) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalMyAtlProject.g:7854:3: rule__NavigatingExpCS__ArgumentAssignment_1_2_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__NavigatingExpCS__ArgumentAssignment_1_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1_2__1__Impl"


    // $ANTLR start "rule__NavigatingExpCS__Group_1_2__2"
    // InternalMyAtlProject.g:7862:1: rule__NavigatingExpCS__Group_1_2__2 : rule__NavigatingExpCS__Group_1_2__2__Impl rule__NavigatingExpCS__Group_1_2__3 ;
    public final void rule__NavigatingExpCS__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7866:1: ( rule__NavigatingExpCS__Group_1_2__2__Impl rule__NavigatingExpCS__Group_1_2__3 )
            // InternalMyAtlProject.g:7867:2: rule__NavigatingExpCS__Group_1_2__2__Impl rule__NavigatingExpCS__Group_1_2__3
            {
            pushFollow(FOLLOW_52);
            rule__NavigatingExpCS__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__Group_1_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1_2__2"


    // $ANTLR start "rule__NavigatingExpCS__Group_1_2__2__Impl"
    // InternalMyAtlProject.g:7874:1: rule__NavigatingExpCS__Group_1_2__2__Impl : ( ( rule__NavigatingExpCS__Group_1_2_2__0 )? ) ;
    public final void rule__NavigatingExpCS__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7878:1: ( ( ( rule__NavigatingExpCS__Group_1_2_2__0 )? ) )
            // InternalMyAtlProject.g:7879:1: ( ( rule__NavigatingExpCS__Group_1_2_2__0 )? )
            {
            // InternalMyAtlProject.g:7879:1: ( ( rule__NavigatingExpCS__Group_1_2_2__0 )? )
            // InternalMyAtlProject.g:7880:2: ( rule__NavigatingExpCS__Group_1_2_2__0 )?
            {
             before(grammarAccess.getNavigatingExpCSAccess().getGroup_1_2_2()); 
            // InternalMyAtlProject.g:7881:2: ( rule__NavigatingExpCS__Group_1_2_2__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==46) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyAtlProject.g:7881:3: rule__NavigatingExpCS__Group_1_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigatingExpCS__Group_1_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavigatingExpCSAccess().getGroup_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1_2__2__Impl"


    // $ANTLR start "rule__NavigatingExpCS__Group_1_2__3"
    // InternalMyAtlProject.g:7889:1: rule__NavigatingExpCS__Group_1_2__3 : rule__NavigatingExpCS__Group_1_2__3__Impl ;
    public final void rule__NavigatingExpCS__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7893:1: ( rule__NavigatingExpCS__Group_1_2__3__Impl )
            // InternalMyAtlProject.g:7894:2: rule__NavigatingExpCS__Group_1_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__Group_1_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1_2__3"


    // $ANTLR start "rule__NavigatingExpCS__Group_1_2__3__Impl"
    // InternalMyAtlProject.g:7900:1: rule__NavigatingExpCS__Group_1_2__3__Impl : ( ( rule__NavigatingExpCS__Group_1_2_3__0 )? ) ;
    public final void rule__NavigatingExpCS__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7904:1: ( ( ( rule__NavigatingExpCS__Group_1_2_3__0 )? ) )
            // InternalMyAtlProject.g:7905:1: ( ( rule__NavigatingExpCS__Group_1_2_3__0 )? )
            {
            // InternalMyAtlProject.g:7905:1: ( ( rule__NavigatingExpCS__Group_1_2_3__0 )? )
            // InternalMyAtlProject.g:7906:2: ( rule__NavigatingExpCS__Group_1_2_3__0 )?
            {
             before(grammarAccess.getNavigatingExpCSAccess().getGroup_1_2_3()); 
            // InternalMyAtlProject.g:7907:2: ( rule__NavigatingExpCS__Group_1_2_3__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==81) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyAtlProject.g:7907:3: rule__NavigatingExpCS__Group_1_2_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigatingExpCS__Group_1_2_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavigatingExpCSAccess().getGroup_1_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1_2__3__Impl"


    // $ANTLR start "rule__NavigatingExpCS__Group_1_2_2__0"
    // InternalMyAtlProject.g:7916:1: rule__NavigatingExpCS__Group_1_2_2__0 : rule__NavigatingExpCS__Group_1_2_2__0__Impl rule__NavigatingExpCS__Group_1_2_2__1 ;
    public final void rule__NavigatingExpCS__Group_1_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7920:1: ( rule__NavigatingExpCS__Group_1_2_2__0__Impl rule__NavigatingExpCS__Group_1_2_2__1 )
            // InternalMyAtlProject.g:7921:2: rule__NavigatingExpCS__Group_1_2_2__0__Impl rule__NavigatingExpCS__Group_1_2_2__1
            {
            pushFollow(FOLLOW_24);
            rule__NavigatingExpCS__Group_1_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__Group_1_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1_2_2__0"


    // $ANTLR start "rule__NavigatingExpCS__Group_1_2_2__0__Impl"
    // InternalMyAtlProject.g:7928:1: rule__NavigatingExpCS__Group_1_2_2__0__Impl : ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_2_0 ) ) ;
    public final void rule__NavigatingExpCS__Group_1_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7932:1: ( ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_2_0 ) ) )
            // InternalMyAtlProject.g:7933:1: ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_2_0 ) )
            {
            // InternalMyAtlProject.g:7933:1: ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_2_0 ) )
            // InternalMyAtlProject.g:7934:2: ( rule__NavigatingExpCS__ArgumentAssignment_1_2_2_0 )
            {
             before(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_2_0()); 
            // InternalMyAtlProject.g:7935:2: ( rule__NavigatingExpCS__ArgumentAssignment_1_2_2_0 )
            // InternalMyAtlProject.g:7935:3: rule__NavigatingExpCS__ArgumentAssignment_1_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__ArgumentAssignment_1_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1_2_2__0__Impl"


    // $ANTLR start "rule__NavigatingExpCS__Group_1_2_2__1"
    // InternalMyAtlProject.g:7943:1: rule__NavigatingExpCS__Group_1_2_2__1 : rule__NavigatingExpCS__Group_1_2_2__1__Impl ;
    public final void rule__NavigatingExpCS__Group_1_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7947:1: ( rule__NavigatingExpCS__Group_1_2_2__1__Impl )
            // InternalMyAtlProject.g:7948:2: rule__NavigatingExpCS__Group_1_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__Group_1_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1_2_2__1"


    // $ANTLR start "rule__NavigatingExpCS__Group_1_2_2__1__Impl"
    // InternalMyAtlProject.g:7954:1: rule__NavigatingExpCS__Group_1_2_2__1__Impl : ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_2_1 )* ) ;
    public final void rule__NavigatingExpCS__Group_1_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7958:1: ( ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_2_1 )* ) )
            // InternalMyAtlProject.g:7959:1: ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_2_1 )* )
            {
            // InternalMyAtlProject.g:7959:1: ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_2_1 )* )
            // InternalMyAtlProject.g:7960:2: ( rule__NavigatingExpCS__ArgumentAssignment_1_2_2_1 )*
            {
             before(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_2_1()); 
            // InternalMyAtlProject.g:7961:2: ( rule__NavigatingExpCS__ArgumentAssignment_1_2_2_1 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==63) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalMyAtlProject.g:7961:3: rule__NavigatingExpCS__ArgumentAssignment_1_2_2_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__NavigatingExpCS__ArgumentAssignment_1_2_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

             after(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1_2_2__1__Impl"


    // $ANTLR start "rule__NavigatingExpCS__Group_1_2_3__0"
    // InternalMyAtlProject.g:7970:1: rule__NavigatingExpCS__Group_1_2_3__0 : rule__NavigatingExpCS__Group_1_2_3__0__Impl rule__NavigatingExpCS__Group_1_2_3__1 ;
    public final void rule__NavigatingExpCS__Group_1_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7974:1: ( rule__NavigatingExpCS__Group_1_2_3__0__Impl rule__NavigatingExpCS__Group_1_2_3__1 )
            // InternalMyAtlProject.g:7975:2: rule__NavigatingExpCS__Group_1_2_3__0__Impl rule__NavigatingExpCS__Group_1_2_3__1
            {
            pushFollow(FOLLOW_24);
            rule__NavigatingExpCS__Group_1_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__Group_1_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1_2_3__0"


    // $ANTLR start "rule__NavigatingExpCS__Group_1_2_3__0__Impl"
    // InternalMyAtlProject.g:7982:1: rule__NavigatingExpCS__Group_1_2_3__0__Impl : ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_3_0 ) ) ;
    public final void rule__NavigatingExpCS__Group_1_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:7986:1: ( ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_3_0 ) ) )
            // InternalMyAtlProject.g:7987:1: ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_3_0 ) )
            {
            // InternalMyAtlProject.g:7987:1: ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_3_0 ) )
            // InternalMyAtlProject.g:7988:2: ( rule__NavigatingExpCS__ArgumentAssignment_1_2_3_0 )
            {
             before(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_3_0()); 
            // InternalMyAtlProject.g:7989:2: ( rule__NavigatingExpCS__ArgumentAssignment_1_2_3_0 )
            // InternalMyAtlProject.g:7989:3: rule__NavigatingExpCS__ArgumentAssignment_1_2_3_0
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__ArgumentAssignment_1_2_3_0();

            state._fsp--;


            }

             after(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1_2_3__0__Impl"


    // $ANTLR start "rule__NavigatingExpCS__Group_1_2_3__1"
    // InternalMyAtlProject.g:7997:1: rule__NavigatingExpCS__Group_1_2_3__1 : rule__NavigatingExpCS__Group_1_2_3__1__Impl ;
    public final void rule__NavigatingExpCS__Group_1_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8001:1: ( rule__NavigatingExpCS__Group_1_2_3__1__Impl )
            // InternalMyAtlProject.g:8002:2: rule__NavigatingExpCS__Group_1_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatingExpCS__Group_1_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1_2_3__1"


    // $ANTLR start "rule__NavigatingExpCS__Group_1_2_3__1__Impl"
    // InternalMyAtlProject.g:8008:1: rule__NavigatingExpCS__Group_1_2_3__1__Impl : ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_3_1 )* ) ;
    public final void rule__NavigatingExpCS__Group_1_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8012:1: ( ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_3_1 )* ) )
            // InternalMyAtlProject.g:8013:1: ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_3_1 )* )
            {
            // InternalMyAtlProject.g:8013:1: ( ( rule__NavigatingExpCS__ArgumentAssignment_1_2_3_1 )* )
            // InternalMyAtlProject.g:8014:2: ( rule__NavigatingExpCS__ArgumentAssignment_1_2_3_1 )*
            {
             before(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_3_1()); 
            // InternalMyAtlProject.g:8015:2: ( rule__NavigatingExpCS__ArgumentAssignment_1_2_3_1 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==63) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalMyAtlProject.g:8015:3: rule__NavigatingExpCS__ArgumentAssignment_1_2_3_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__NavigatingExpCS__ArgumentAssignment_1_2_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__Group_1_2_3__1__Impl"


    // $ANTLR start "rule__Module__NameAssignment_1"
    // InternalMyAtlProject.g:8024:1: rule__Module__NameAssignment_1 : ( ruleUnrestrictedName ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8028:1: ( ( ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:8029:2: ( ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:8029:2: ( ruleUnrestrictedName )
            // InternalMyAtlProject.g:8030:3: ruleUnrestrictedName
            {
             before(grammarAccess.getModuleAccess().getNameUnrestrictedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnrestrictedName();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getNameUnrestrictedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__NameAssignment_1"


    // $ANTLR start "rule__Module__ElementsAssignment_9"
    // InternalMyAtlProject.g:8039:1: rule__Module__ElementsAssignment_9 : ( ruleModuleElement ) ;
    public final void rule__Module__ElementsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8043:1: ( ( ruleModuleElement ) )
            // InternalMyAtlProject.g:8044:2: ( ruleModuleElement )
            {
            // InternalMyAtlProject.g:8044:2: ( ruleModuleElement )
            // InternalMyAtlProject.g:8045:3: ruleModuleElement
            {
             before(grammarAccess.getModuleAccess().getElementsModuleElementParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleModuleElement();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getElementsModuleElementParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__ElementsAssignment_9"


    // $ANTLR start "rule__MatchedRule__NameAssignment_1"
    // InternalMyAtlProject.g:8054:1: rule__MatchedRule__NameAssignment_1 : ( ruleUnrestrictedName ) ;
    public final void rule__MatchedRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8058:1: ( ( ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:8059:2: ( ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:8059:2: ( ruleUnrestrictedName )
            // InternalMyAtlProject.g:8060:3: ruleUnrestrictedName
            {
             before(grammarAccess.getMatchedRuleAccess().getNameUnrestrictedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnrestrictedName();

            state._fsp--;

             after(grammarAccess.getMatchedRuleAccess().getNameUnrestrictedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__NameAssignment_1"


    // $ANTLR start "rule__MatchedRule__InPatternAssignment_4"
    // InternalMyAtlProject.g:8069:1: rule__MatchedRule__InPatternAssignment_4 : ( ruleInPattern ) ;
    public final void rule__MatchedRule__InPatternAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8073:1: ( ( ruleInPattern ) )
            // InternalMyAtlProject.g:8074:2: ( ruleInPattern )
            {
            // InternalMyAtlProject.g:8074:2: ( ruleInPattern )
            // InternalMyAtlProject.g:8075:3: ruleInPattern
            {
             before(grammarAccess.getMatchedRuleAccess().getInPatternInPatternParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInPattern();

            state._fsp--;

             after(grammarAccess.getMatchedRuleAccess().getInPatternInPatternParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__InPatternAssignment_4"


    // $ANTLR start "rule__MatchedRule__VariablesAssignment_5_2"
    // InternalMyAtlProject.g:8084:1: rule__MatchedRule__VariablesAssignment_5_2 : ( ruleRuleVariableDeclaration ) ;
    public final void rule__MatchedRule__VariablesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8088:1: ( ( ruleRuleVariableDeclaration ) )
            // InternalMyAtlProject.g:8089:2: ( ruleRuleVariableDeclaration )
            {
            // InternalMyAtlProject.g:8089:2: ( ruleRuleVariableDeclaration )
            // InternalMyAtlProject.g:8090:3: ruleRuleVariableDeclaration
            {
             before(grammarAccess.getMatchedRuleAccess().getVariablesRuleVariableDeclarationParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getMatchedRuleAccess().getVariablesRuleVariableDeclarationParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__VariablesAssignment_5_2"


    // $ANTLR start "rule__MatchedRule__OutPatternAssignment_7"
    // InternalMyAtlProject.g:8099:1: rule__MatchedRule__OutPatternAssignment_7 : ( ruleOutPattern ) ;
    public final void rule__MatchedRule__OutPatternAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8103:1: ( ( ruleOutPattern ) )
            // InternalMyAtlProject.g:8104:2: ( ruleOutPattern )
            {
            // InternalMyAtlProject.g:8104:2: ( ruleOutPattern )
            // InternalMyAtlProject.g:8105:3: ruleOutPattern
            {
             before(grammarAccess.getMatchedRuleAccess().getOutPatternOutPatternParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleOutPattern();

            state._fsp--;

             after(grammarAccess.getMatchedRuleAccess().getOutPatternOutPatternParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__OutPatternAssignment_7"


    // $ANTLR start "rule__MatchedRule__ActionBlockAssignment_8_2"
    // InternalMyAtlProject.g:8114:1: rule__MatchedRule__ActionBlockAssignment_8_2 : ( ruleActionBlock ) ;
    public final void rule__MatchedRule__ActionBlockAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8118:1: ( ( ruleActionBlock ) )
            // InternalMyAtlProject.g:8119:2: ( ruleActionBlock )
            {
            // InternalMyAtlProject.g:8119:2: ( ruleActionBlock )
            // InternalMyAtlProject.g:8120:3: ruleActionBlock
            {
             before(grammarAccess.getMatchedRuleAccess().getActionBlockActionBlockParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActionBlock();

            state._fsp--;

             after(grammarAccess.getMatchedRuleAccess().getActionBlockActionBlockParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchedRule__ActionBlockAssignment_8_2"


    // $ANTLR start "rule__CalledRule__NameAssignment_2"
    // InternalMyAtlProject.g:8129:1: rule__CalledRule__NameAssignment_2 : ( ruleUnrestrictedName ) ;
    public final void rule__CalledRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8133:1: ( ( ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:8134:2: ( ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:8134:2: ( ruleUnrestrictedName )
            // InternalMyAtlProject.g:8135:3: ruleUnrestrictedName
            {
             before(grammarAccess.getCalledRuleAccess().getNameUnrestrictedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnrestrictedName();

            state._fsp--;

             after(grammarAccess.getCalledRuleAccess().getNameUnrestrictedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__NameAssignment_2"


    // $ANTLR start "rule__CalledRule__VariablesAssignment_5_2"
    // InternalMyAtlProject.g:8144:1: rule__CalledRule__VariablesAssignment_5_2 : ( ruleRuleVariableDeclaration ) ;
    public final void rule__CalledRule__VariablesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8148:1: ( ( ruleRuleVariableDeclaration ) )
            // InternalMyAtlProject.g:8149:2: ( ruleRuleVariableDeclaration )
            {
            // InternalMyAtlProject.g:8149:2: ( ruleRuleVariableDeclaration )
            // InternalMyAtlProject.g:8150:3: ruleRuleVariableDeclaration
            {
             before(grammarAccess.getCalledRuleAccess().getVariablesRuleVariableDeclarationParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getCalledRuleAccess().getVariablesRuleVariableDeclarationParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__VariablesAssignment_5_2"


    // $ANTLR start "rule__CalledRule__OutPatternAssignment_7"
    // InternalMyAtlProject.g:8159:1: rule__CalledRule__OutPatternAssignment_7 : ( ruleOutPattern ) ;
    public final void rule__CalledRule__OutPatternAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8163:1: ( ( ruleOutPattern ) )
            // InternalMyAtlProject.g:8164:2: ( ruleOutPattern )
            {
            // InternalMyAtlProject.g:8164:2: ( ruleOutPattern )
            // InternalMyAtlProject.g:8165:3: ruleOutPattern
            {
             before(grammarAccess.getCalledRuleAccess().getOutPatternOutPatternParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleOutPattern();

            state._fsp--;

             after(grammarAccess.getCalledRuleAccess().getOutPatternOutPatternParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__OutPatternAssignment_7"


    // $ANTLR start "rule__CalledRule__ActionBlockAssignment_8_2"
    // InternalMyAtlProject.g:8174:1: rule__CalledRule__ActionBlockAssignment_8_2 : ( ruleActionBlock ) ;
    public final void rule__CalledRule__ActionBlockAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8178:1: ( ( ruleActionBlock ) )
            // InternalMyAtlProject.g:8179:2: ( ruleActionBlock )
            {
            // InternalMyAtlProject.g:8179:2: ( ruleActionBlock )
            // InternalMyAtlProject.g:8180:3: ruleActionBlock
            {
             before(grammarAccess.getCalledRuleAccess().getActionBlockActionBlockParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActionBlock();

            state._fsp--;

             after(grammarAccess.getCalledRuleAccess().getActionBlockActionBlockParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalledRule__ActionBlockAssignment_8_2"


    // $ANTLR start "rule__RuleVariableDeclaration__VarNameAssignment_0"
    // InternalMyAtlProject.g:8189:1: rule__RuleVariableDeclaration__VarNameAssignment_0 : ( ruleUnrestrictedName ) ;
    public final void rule__RuleVariableDeclaration__VarNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8193:1: ( ( ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:8194:2: ( ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:8194:2: ( ruleUnrestrictedName )
            // InternalMyAtlProject.g:8195:3: ruleUnrestrictedName
            {
             before(grammarAccess.getRuleVariableDeclarationAccess().getVarNameUnrestrictedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnrestrictedName();

            state._fsp--;

             after(grammarAccess.getRuleVariableDeclarationAccess().getVarNameUnrestrictedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleVariableDeclaration__VarNameAssignment_0"


    // $ANTLR start "rule__InPattern__ElementsAssignment_0"
    // InternalMyAtlProject.g:8204:1: rule__InPattern__ElementsAssignment_0 : ( ruleInPatternElement ) ;
    public final void rule__InPattern__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8208:1: ( ( ruleInPatternElement ) )
            // InternalMyAtlProject.g:8209:2: ( ruleInPatternElement )
            {
            // InternalMyAtlProject.g:8209:2: ( ruleInPatternElement )
            // InternalMyAtlProject.g:8210:3: ruleInPatternElement
            {
             before(grammarAccess.getInPatternAccess().getElementsInPatternElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInPatternElement();

            state._fsp--;

             after(grammarAccess.getInPatternAccess().getElementsInPatternElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPattern__ElementsAssignment_0"


    // $ANTLR start "rule__InPatternElement__VarNameAssignment_0"
    // InternalMyAtlProject.g:8219:1: rule__InPatternElement__VarNameAssignment_0 : ( ruleUnrestrictedName ) ;
    public final void rule__InPatternElement__VarNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8223:1: ( ( ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:8224:2: ( ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:8224:2: ( ruleUnrestrictedName )
            // InternalMyAtlProject.g:8225:3: ruleUnrestrictedName
            {
             before(grammarAccess.getInPatternElementAccess().getVarNameUnrestrictedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnrestrictedName();

            state._fsp--;

             after(grammarAccess.getInPatternElementAccess().getVarNameUnrestrictedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPatternElement__VarNameAssignment_0"


    // $ANTLR start "rule__OutPattern__ElementsAssignment_0"
    // InternalMyAtlProject.g:8234:1: rule__OutPattern__ElementsAssignment_0 : ( ruleOutPatternElement ) ;
    public final void rule__OutPattern__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8238:1: ( ( ruleOutPatternElement ) )
            // InternalMyAtlProject.g:8239:2: ( ruleOutPatternElement )
            {
            // InternalMyAtlProject.g:8239:2: ( ruleOutPatternElement )
            // InternalMyAtlProject.g:8240:3: ruleOutPatternElement
            {
             before(grammarAccess.getOutPatternAccess().getElementsOutPatternElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOutPatternElement();

            state._fsp--;

             after(grammarAccess.getOutPatternAccess().getElementsOutPatternElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPattern__ElementsAssignment_0"


    // $ANTLR start "rule__OutPattern__ElementsAssignment_1_1"
    // InternalMyAtlProject.g:8249:1: rule__OutPattern__ElementsAssignment_1_1 : ( ruleOutPatternElement ) ;
    public final void rule__OutPattern__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8253:1: ( ( ruleOutPatternElement ) )
            // InternalMyAtlProject.g:8254:2: ( ruleOutPatternElement )
            {
            // InternalMyAtlProject.g:8254:2: ( ruleOutPatternElement )
            // InternalMyAtlProject.g:8255:3: ruleOutPatternElement
            {
             before(grammarAccess.getOutPatternAccess().getElementsOutPatternElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutPatternElement();

            state._fsp--;

             after(grammarAccess.getOutPatternAccess().getElementsOutPatternElementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPattern__ElementsAssignment_1_1"


    // $ANTLR start "rule__SimpleOutPatternElement__VarNameAssignment_0"
    // InternalMyAtlProject.g:8264:1: rule__SimpleOutPatternElement__VarNameAssignment_0 : ( ruleUnrestrictedName ) ;
    public final void rule__SimpleOutPatternElement__VarNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8268:1: ( ( ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:8269:2: ( ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:8269:2: ( ruleUnrestrictedName )
            // InternalMyAtlProject.g:8270:3: ruleUnrestrictedName
            {
             before(grammarAccess.getSimpleOutPatternElementAccess().getVarNameUnrestrictedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnrestrictedName();

            state._fsp--;

             after(grammarAccess.getSimpleOutPatternElementAccess().getVarNameUnrestrictedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__VarNameAssignment_0"


    // $ANTLR start "rule__SimpleOutPatternElement__BindingsAssignment_2_1_0"
    // InternalMyAtlProject.g:8279:1: rule__SimpleOutPatternElement__BindingsAssignment_2_1_0 : ( ruleBinding ) ;
    public final void rule__SimpleOutPatternElement__BindingsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8283:1: ( ( ruleBinding ) )
            // InternalMyAtlProject.g:8284:2: ( ruleBinding )
            {
            // InternalMyAtlProject.g:8284:2: ( ruleBinding )
            // InternalMyAtlProject.g:8285:3: ruleBinding
            {
             before(grammarAccess.getSimpleOutPatternElementAccess().getBindingsBindingParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getSimpleOutPatternElementAccess().getBindingsBindingParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__BindingsAssignment_2_1_0"


    // $ANTLR start "rule__SimpleOutPatternElement__BindingsAssignment_2_1_1_1"
    // InternalMyAtlProject.g:8294:1: rule__SimpleOutPatternElement__BindingsAssignment_2_1_1_1 : ( ruleBinding ) ;
    public final void rule__SimpleOutPatternElement__BindingsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8298:1: ( ( ruleBinding ) )
            // InternalMyAtlProject.g:8299:2: ( ruleBinding )
            {
            // InternalMyAtlProject.g:8299:2: ( ruleBinding )
            // InternalMyAtlProject.g:8300:3: ruleBinding
            {
             before(grammarAccess.getSimpleOutPatternElementAccess().getBindingsBindingParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getSimpleOutPatternElementAccess().getBindingsBindingParserRuleCall_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOutPatternElement__BindingsAssignment_2_1_1_1"


    // $ANTLR start "rule__Binding__PropertyNameAssignment_0"
    // InternalMyAtlProject.g:8309:1: rule__Binding__PropertyNameAssignment_0 : ( ruleUnrestrictedName ) ;
    public final void rule__Binding__PropertyNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8313:1: ( ( ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:8314:2: ( ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:8314:2: ( ruleUnrestrictedName )
            // InternalMyAtlProject.g:8315:3: ruleUnrestrictedName
            {
             before(grammarAccess.getBindingAccess().getPropertyNameUnrestrictedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnrestrictedName();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getPropertyNameUnrestrictedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__PropertyNameAssignment_0"


    // $ANTLR start "rule__ActionBlock__StatementsAssignment"
    // InternalMyAtlProject.g:8324:1: rule__ActionBlock__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__ActionBlock__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8328:1: ( ( ruleStatement ) )
            // InternalMyAtlProject.g:8329:2: ( ruleStatement )
            {
            // InternalMyAtlProject.g:8329:2: ( ruleStatement )
            // InternalMyAtlProject.g:8330:3: ruleStatement
            {
             before(grammarAccess.getActionBlockAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getActionBlockAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionBlock__StatementsAssignment"


    // $ANTLR start "rule__BindingStat__PropertyNameAssignment_0"
    // InternalMyAtlProject.g:8339:1: rule__BindingStat__PropertyNameAssignment_0 : ( ruleUnrestrictedName ) ;
    public final void rule__BindingStat__PropertyNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8343:1: ( ( ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:8344:2: ( ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:8344:2: ( ruleUnrestrictedName )
            // InternalMyAtlProject.g:8345:3: ruleUnrestrictedName
            {
             before(grammarAccess.getBindingStatAccess().getPropertyNameUnrestrictedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnrestrictedName();

            state._fsp--;

             after(grammarAccess.getBindingStatAccess().getPropertyNameUnrestrictedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingStat__PropertyNameAssignment_0"


    // $ANTLR start "rule__PrimitiveTypeCS__NameAssignment"
    // InternalMyAtlProject.g:8354:1: rule__PrimitiveTypeCS__NameAssignment : ( rulePrimitiveTypeIdentifier ) ;
    public final void rule__PrimitiveTypeCS__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8358:1: ( ( rulePrimitiveTypeIdentifier ) )
            // InternalMyAtlProject.g:8359:2: ( rulePrimitiveTypeIdentifier )
            {
            // InternalMyAtlProject.g:8359:2: ( rulePrimitiveTypeIdentifier )
            // InternalMyAtlProject.g:8360:3: rulePrimitiveTypeIdentifier
            {
             before(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveTypeIdentifier();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeCS__NameAssignment"


    // $ANTLR start "rule__CollectionTypeCS__NameAssignment_0"
    // InternalMyAtlProject.g:8369:1: rule__CollectionTypeCS__NameAssignment_0 : ( ruleCollectionTypeIdentifier ) ;
    public final void rule__CollectionTypeCS__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8373:1: ( ( ruleCollectionTypeIdentifier ) )
            // InternalMyAtlProject.g:8374:2: ( ruleCollectionTypeIdentifier )
            {
            // InternalMyAtlProject.g:8374:2: ( ruleCollectionTypeIdentifier )
            // InternalMyAtlProject.g:8375:3: ruleCollectionTypeIdentifier
            {
             before(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionTypeIdentifier();

            state._fsp--;

             after(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__NameAssignment_0"


    // $ANTLR start "rule__CollectionTypeCS__OwnedTypeAssignment_1_0_1"
    // InternalMyAtlProject.g:8384:1: rule__CollectionTypeCS__OwnedTypeAssignment_1_0_1 : ( ruleTypeExpCS ) ;
    public final void rule__CollectionTypeCS__OwnedTypeAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8388:1: ( ( ruleTypeExpCS ) )
            // InternalMyAtlProject.g:8389:2: ( ruleTypeExpCS )
            {
            // InternalMyAtlProject.g:8389:2: ( ruleTypeExpCS )
            // InternalMyAtlProject.g:8390:3: ruleTypeExpCS
            {
             before(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeExpCS();

            state._fsp--;

             after(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__OwnedTypeAssignment_1_0_1"


    // $ANTLR start "rule__CollectionTypeCS__OwnedTypeAssignment_1_1_1"
    // InternalMyAtlProject.g:8399:1: rule__CollectionTypeCS__OwnedTypeAssignment_1_1_1 : ( ruleTypeExpCS ) ;
    public final void rule__CollectionTypeCS__OwnedTypeAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8403:1: ( ( ruleTypeExpCS ) )
            // InternalMyAtlProject.g:8404:2: ( ruleTypeExpCS )
            {
            // InternalMyAtlProject.g:8404:2: ( ruleTypeExpCS )
            // InternalMyAtlProject.g:8405:3: ruleTypeExpCS
            {
             before(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeExpCS();

            state._fsp--;

             after(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionTypeCS__OwnedTypeAssignment_1_1_1"


    // $ANTLR start "rule__CollectionLiteralExpCS__OwnedTypeAssignment_0"
    // InternalMyAtlProject.g:8414:1: rule__CollectionLiteralExpCS__OwnedTypeAssignment_0 : ( ruleCollectionTypeCS ) ;
    public final void rule__CollectionLiteralExpCS__OwnedTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8418:1: ( ( ruleCollectionTypeCS ) )
            // InternalMyAtlProject.g:8419:2: ( ruleCollectionTypeCS )
            {
            // InternalMyAtlProject.g:8419:2: ( ruleCollectionTypeCS )
            // InternalMyAtlProject.g:8420:3: ruleCollectionTypeCS
            {
             before(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionTypeCS();

            state._fsp--;

             after(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__OwnedTypeAssignment_0"


    // $ANTLR start "rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_0"
    // InternalMyAtlProject.g:8429:1: rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_0 : ( ruleCollectionLiteralPartCS ) ;
    public final void rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8433:1: ( ( ruleCollectionLiteralPartCS ) )
            // InternalMyAtlProject.g:8434:2: ( ruleCollectionLiteralPartCS )
            {
            // InternalMyAtlProject.g:8434:2: ( ruleCollectionLiteralPartCS )
            // InternalMyAtlProject.g:8435:3: ruleCollectionLiteralPartCS
            {
             before(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionLiteralPartCS();

            state._fsp--;

             after(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_0"


    // $ANTLR start "rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_1_1"
    // InternalMyAtlProject.g:8444:1: rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_1_1 : ( ruleCollectionLiteralPartCS ) ;
    public final void rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8448:1: ( ( ruleCollectionLiteralPartCS ) )
            // InternalMyAtlProject.g:8449:2: ( ruleCollectionLiteralPartCS )
            {
            // InternalMyAtlProject.g:8449:2: ( ruleCollectionLiteralPartCS )
            // InternalMyAtlProject.g:8450:3: ruleCollectionLiteralPartCS
            {
             before(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionLiteralPartCS();

            state._fsp--;

             after(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_1_1"


    // $ANTLR start "rule__CollectionLiteralPartCS__ExpressionCSAssignment_0"
    // InternalMyAtlProject.g:8459:1: rule__CollectionLiteralPartCS__ExpressionCSAssignment_0 : ( ruleExpCS ) ;
    public final void rule__CollectionLiteralPartCS__ExpressionCSAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8463:1: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:8464:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:8464:2: ( ruleExpCS )
            // InternalMyAtlProject.g:8465:3: ruleExpCS
            {
             before(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSExpCSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSExpCSParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralPartCS__ExpressionCSAssignment_0"


    // $ANTLR start "rule__CollectionLiteralPartCS__LastExpressionCSAssignment_1_1"
    // InternalMyAtlProject.g:8474:1: rule__CollectionLiteralPartCS__LastExpressionCSAssignment_1_1 : ( ruleExpCS ) ;
    public final void rule__CollectionLiteralPartCS__LastExpressionCSAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8478:1: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:8479:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:8479:2: ( ruleExpCS )
            // InternalMyAtlProject.g:8480:3: ruleExpCS
            {
             before(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSExpCSParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSExpCSParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionLiteralPartCS__LastExpressionCSAssignment_1_1"


    // $ANTLR start "rule__TupleLiteralExpCS__OwnedPartsAssignment_2"
    // InternalMyAtlProject.g:8489:1: rule__TupleLiteralExpCS__OwnedPartsAssignment_2 : ( ruleTupleLiteralPartCS ) ;
    public final void rule__TupleLiteralExpCS__OwnedPartsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8493:1: ( ( ruleTupleLiteralPartCS ) )
            // InternalMyAtlProject.g:8494:2: ( ruleTupleLiteralPartCS )
            {
            // InternalMyAtlProject.g:8494:2: ( ruleTupleLiteralPartCS )
            // InternalMyAtlProject.g:8495:3: ruleTupleLiteralPartCS
            {
             before(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTupleLiteralPartCS();

            state._fsp--;

             after(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralExpCS__OwnedPartsAssignment_2"


    // $ANTLR start "rule__TupleLiteralExpCS__OwnedPartsAssignment_3_1"
    // InternalMyAtlProject.g:8504:1: rule__TupleLiteralExpCS__OwnedPartsAssignment_3_1 : ( ruleTupleLiteralPartCS ) ;
    public final void rule__TupleLiteralExpCS__OwnedPartsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8508:1: ( ( ruleTupleLiteralPartCS ) )
            // InternalMyAtlProject.g:8509:2: ( ruleTupleLiteralPartCS )
            {
            // InternalMyAtlProject.g:8509:2: ( ruleTupleLiteralPartCS )
            // InternalMyAtlProject.g:8510:3: ruleTupleLiteralPartCS
            {
             before(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTupleLiteralPartCS();

            state._fsp--;

             after(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralExpCS__OwnedPartsAssignment_3_1"


    // $ANTLR start "rule__TupleLiteralPartCS__NameAssignment_0"
    // InternalMyAtlProject.g:8519:1: rule__TupleLiteralPartCS__NameAssignment_0 : ( ruleUnrestrictedName ) ;
    public final void rule__TupleLiteralPartCS__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8523:1: ( ( ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:8524:2: ( ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:8524:2: ( ruleUnrestrictedName )
            // InternalMyAtlProject.g:8525:3: ruleUnrestrictedName
            {
             before(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnrestrictedName();

            state._fsp--;

             after(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralPartCS__NameAssignment_0"


    // $ANTLR start "rule__TupleLiteralPartCS__OwnedTypeAssignment_1_1"
    // InternalMyAtlProject.g:8534:1: rule__TupleLiteralPartCS__OwnedTypeAssignment_1_1 : ( ruleTypeExpCS ) ;
    public final void rule__TupleLiteralPartCS__OwnedTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8538:1: ( ( ruleTypeExpCS ) )
            // InternalMyAtlProject.g:8539:2: ( ruleTypeExpCS )
            {
            // InternalMyAtlProject.g:8539:2: ( ruleTypeExpCS )
            // InternalMyAtlProject.g:8540:3: ruleTypeExpCS
            {
             before(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeExpCS();

            state._fsp--;

             after(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralPartCS__OwnedTypeAssignment_1_1"


    // $ANTLR start "rule__TupleLiteralPartCS__InitExpressionAssignment_3"
    // InternalMyAtlProject.g:8549:1: rule__TupleLiteralPartCS__InitExpressionAssignment_3 : ( ruleExpCS ) ;
    public final void rule__TupleLiteralPartCS__InitExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8553:1: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:8554:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:8554:2: ( ruleExpCS )
            // InternalMyAtlProject.g:8555:3: ruleExpCS
            {
             before(grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionExpCSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionExpCSParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleLiteralPartCS__InitExpressionAssignment_3"


    // $ANTLR start "rule__NumberLiteralExpCS__NameAssignment"
    // InternalMyAtlProject.g:8564:1: rule__NumberLiteralExpCS__NameAssignment : ( RULE_BIG_INT ) ;
    public final void rule__NumberLiteralExpCS__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8568:1: ( ( RULE_BIG_INT ) )
            // InternalMyAtlProject.g:8569:2: ( RULE_BIG_INT )
            {
            // InternalMyAtlProject.g:8569:2: ( RULE_BIG_INT )
            // InternalMyAtlProject.g:8570:3: RULE_BIG_INT
            {
             before(grammarAccess.getNumberLiteralExpCSAccess().getNameBIG_INTTerminalRuleCall_0()); 
            match(input,RULE_BIG_INT,FOLLOW_2); 
             after(grammarAccess.getNumberLiteralExpCSAccess().getNameBIG_INTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteralExpCS__NameAssignment"


    // $ANTLR start "rule__StringLiteralExpCS__NameAssignment"
    // InternalMyAtlProject.g:8579:1: rule__StringLiteralExpCS__NameAssignment : ( ruleStringLiteral ) ;
    public final void rule__StringLiteralExpCS__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8583:1: ( ( ruleStringLiteral ) )
            // InternalMyAtlProject.g:8584:2: ( ruleStringLiteral )
            {
            // InternalMyAtlProject.g:8584:2: ( ruleStringLiteral )
            // InternalMyAtlProject.g:8585:3: ruleStringLiteral
            {
             before(grammarAccess.getStringLiteralExpCSAccess().getNameStringLiteralParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralExpCSAccess().getNameStringLiteralParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteralExpCS__NameAssignment"


    // $ANTLR start "rule__BooleanLiteralExpCS__NameAssignment_0"
    // InternalMyAtlProject.g:8594:1: rule__BooleanLiteralExpCS__NameAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__BooleanLiteralExpCS__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8598:1: ( ( ( 'true' ) ) )
            // InternalMyAtlProject.g:8599:2: ( ( 'true' ) )
            {
            // InternalMyAtlProject.g:8599:2: ( ( 'true' ) )
            // InternalMyAtlProject.g:8600:3: ( 'true' )
            {
             before(grammarAccess.getBooleanLiteralExpCSAccess().getNameTrueKeyword_0_0()); 
            // InternalMyAtlProject.g:8601:3: ( 'true' )
            // InternalMyAtlProject.g:8602:4: 'true'
            {
             before(grammarAccess.getBooleanLiteralExpCSAccess().getNameTrueKeyword_0_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getBooleanLiteralExpCSAccess().getNameTrueKeyword_0_0()); 

            }

             after(grammarAccess.getBooleanLiteralExpCSAccess().getNameTrueKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteralExpCS__NameAssignment_0"


    // $ANTLR start "rule__BooleanLiteralExpCS__NameAssignment_1"
    // InternalMyAtlProject.g:8613:1: rule__BooleanLiteralExpCS__NameAssignment_1 : ( ( 'false' ) ) ;
    public final void rule__BooleanLiteralExpCS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8617:1: ( ( ( 'false' ) ) )
            // InternalMyAtlProject.g:8618:2: ( ( 'false' ) )
            {
            // InternalMyAtlProject.g:8618:2: ( ( 'false' ) )
            // InternalMyAtlProject.g:8619:3: ( 'false' )
            {
             before(grammarAccess.getBooleanLiteralExpCSAccess().getNameFalseKeyword_1_0()); 
            // InternalMyAtlProject.g:8620:3: ( 'false' )
            // InternalMyAtlProject.g:8621:4: 'false'
            {
             before(grammarAccess.getBooleanLiteralExpCSAccess().getNameFalseKeyword_1_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getBooleanLiteralExpCSAccess().getNameFalseKeyword_1_0()); 

            }

             after(grammarAccess.getBooleanLiteralExpCSAccess().getNameFalseKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteralExpCS__NameAssignment_1"


    // $ANTLR start "rule__TypeLiteralExpCS__OwnedTypeAssignment"
    // InternalMyAtlProject.g:8632:1: rule__TypeLiteralExpCS__OwnedTypeAssignment : ( ruleTypeLiteralCS ) ;
    public final void rule__TypeLiteralExpCS__OwnedTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8636:1: ( ( ruleTypeLiteralCS ) )
            // InternalMyAtlProject.g:8637:2: ( ruleTypeLiteralCS )
            {
            // InternalMyAtlProject.g:8637:2: ( ruleTypeLiteralCS )
            // InternalMyAtlProject.g:8638:3: ruleTypeLiteralCS
            {
             before(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralCSParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeLiteralCS();

            state._fsp--;

             after(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralCSParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteralExpCS__OwnedTypeAssignment"


    // $ANTLR start "rule__NavigatingArgCS__NameAssignment_0"
    // InternalMyAtlProject.g:8647:1: rule__NavigatingArgCS__NameAssignment_0 : ( ruleNavigatingArgExpCS ) ;
    public final void rule__NavigatingArgCS__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8651:1: ( ( ruleNavigatingArgExpCS ) )
            // InternalMyAtlProject.g:8652:2: ( ruleNavigatingArgExpCS )
            {
            // InternalMyAtlProject.g:8652:2: ( ruleNavigatingArgExpCS )
            // InternalMyAtlProject.g:8653:3: ruleNavigatingArgExpCS
            {
             before(grammarAccess.getNavigatingArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigatingArgExpCS();

            state._fsp--;

             after(grammarAccess.getNavigatingArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingArgCS__NameAssignment_0"


    // $ANTLR start "rule__NavigatingArgCS__OwnedTypeAssignment_1_1"
    // InternalMyAtlProject.g:8662:1: rule__NavigatingArgCS__OwnedTypeAssignment_1_1 : ( ruleTypeExpCS ) ;
    public final void rule__NavigatingArgCS__OwnedTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8666:1: ( ( ruleTypeExpCS ) )
            // InternalMyAtlProject.g:8667:2: ( ruleTypeExpCS )
            {
            // InternalMyAtlProject.g:8667:2: ( ruleTypeExpCS )
            // InternalMyAtlProject.g:8668:3: ruleTypeExpCS
            {
             before(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeExpCS();

            state._fsp--;

             after(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingArgCS__OwnedTypeAssignment_1_1"


    // $ANTLR start "rule__NavigatingArgCS__InitAssignment_2_1"
    // InternalMyAtlProject.g:8677:1: rule__NavigatingArgCS__InitAssignment_2_1 : ( ruleExpCS ) ;
    public final void rule__NavigatingArgCS__InitAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8681:1: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:8682:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:8682:2: ( ruleExpCS )
            // InternalMyAtlProject.g:8683:3: ruleExpCS
            {
             before(grammarAccess.getNavigatingArgCSAccess().getInitExpCSParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getNavigatingArgCSAccess().getInitExpCSParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingArgCS__InitAssignment_2_1"


    // $ANTLR start "rule__NavigatingBarArgCS__PrefixAssignment_0"
    // InternalMyAtlProject.g:8692:1: rule__NavigatingBarArgCS__PrefixAssignment_0 : ( ( '|' ) ) ;
    public final void rule__NavigatingBarArgCS__PrefixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8696:1: ( ( ( '|' ) ) )
            // InternalMyAtlProject.g:8697:2: ( ( '|' ) )
            {
            // InternalMyAtlProject.g:8697:2: ( ( '|' ) )
            // InternalMyAtlProject.g:8698:3: ( '|' )
            {
             before(grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0()); 
            // InternalMyAtlProject.g:8699:3: ( '|' )
            // InternalMyAtlProject.g:8700:4: '|'
            {
             before(grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0()); 

            }

             after(grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__PrefixAssignment_0"


    // $ANTLR start "rule__NavigatingBarArgCS__NameAssignment_1"
    // InternalMyAtlProject.g:8711:1: rule__NavigatingBarArgCS__NameAssignment_1 : ( ruleNavigatingArgExpCS ) ;
    public final void rule__NavigatingBarArgCS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8715:1: ( ( ruleNavigatingArgExpCS ) )
            // InternalMyAtlProject.g:8716:2: ( ruleNavigatingArgExpCS )
            {
            // InternalMyAtlProject.g:8716:2: ( ruleNavigatingArgExpCS )
            // InternalMyAtlProject.g:8717:3: ruleNavigatingArgExpCS
            {
             before(grammarAccess.getNavigatingBarArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigatingArgExpCS();

            state._fsp--;

             after(grammarAccess.getNavigatingBarArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__NameAssignment_1"


    // $ANTLR start "rule__NavigatingBarArgCS__OwnedTypeAssignment_2_1"
    // InternalMyAtlProject.g:8726:1: rule__NavigatingBarArgCS__OwnedTypeAssignment_2_1 : ( ruleTypeExpCS ) ;
    public final void rule__NavigatingBarArgCS__OwnedTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8730:1: ( ( ruleTypeExpCS ) )
            // InternalMyAtlProject.g:8731:2: ( ruleTypeExpCS )
            {
            // InternalMyAtlProject.g:8731:2: ( ruleTypeExpCS )
            // InternalMyAtlProject.g:8732:3: ruleTypeExpCS
            {
             before(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeExpCS();

            state._fsp--;

             after(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__OwnedTypeAssignment_2_1"


    // $ANTLR start "rule__NavigatingBarArgCS__InitAssignment_3_1"
    // InternalMyAtlProject.g:8741:1: rule__NavigatingBarArgCS__InitAssignment_3_1 : ( ruleExpCS ) ;
    public final void rule__NavigatingBarArgCS__InitAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8745:1: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:8746:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:8746:2: ( ruleExpCS )
            // InternalMyAtlProject.g:8747:3: ruleExpCS
            {
             before(grammarAccess.getNavigatingBarArgCSAccess().getInitExpCSParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getNavigatingBarArgCSAccess().getInitExpCSParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingBarArgCS__InitAssignment_3_1"


    // $ANTLR start "rule__NavigatingCommaArgCS__PrefixAssignment_0"
    // InternalMyAtlProject.g:8756:1: rule__NavigatingCommaArgCS__PrefixAssignment_0 : ( ( ',' ) ) ;
    public final void rule__NavigatingCommaArgCS__PrefixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8760:1: ( ( ( ',' ) ) )
            // InternalMyAtlProject.g:8761:2: ( ( ',' ) )
            {
            // InternalMyAtlProject.g:8761:2: ( ( ',' ) )
            // InternalMyAtlProject.g:8762:3: ( ',' )
            {
             before(grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0()); 
            // InternalMyAtlProject.g:8763:3: ( ',' )
            // InternalMyAtlProject.g:8764:4: ','
            {
             before(grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0()); 

            }

             after(grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__PrefixAssignment_0"


    // $ANTLR start "rule__NavigatingCommaArgCS__NameAssignment_1"
    // InternalMyAtlProject.g:8775:1: rule__NavigatingCommaArgCS__NameAssignment_1 : ( ruleNavigatingArgExpCS ) ;
    public final void rule__NavigatingCommaArgCS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8779:1: ( ( ruleNavigatingArgExpCS ) )
            // InternalMyAtlProject.g:8780:2: ( ruleNavigatingArgExpCS )
            {
            // InternalMyAtlProject.g:8780:2: ( ruleNavigatingArgExpCS )
            // InternalMyAtlProject.g:8781:3: ruleNavigatingArgExpCS
            {
             before(grammarAccess.getNavigatingCommaArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigatingArgExpCS();

            state._fsp--;

             after(grammarAccess.getNavigatingCommaArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__NameAssignment_1"


    // $ANTLR start "rule__NavigatingCommaArgCS__OwnedTypeAssignment_2_1"
    // InternalMyAtlProject.g:8790:1: rule__NavigatingCommaArgCS__OwnedTypeAssignment_2_1 : ( ruleTypeExpCS ) ;
    public final void rule__NavigatingCommaArgCS__OwnedTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8794:1: ( ( ruleTypeExpCS ) )
            // InternalMyAtlProject.g:8795:2: ( ruleTypeExpCS )
            {
            // InternalMyAtlProject.g:8795:2: ( ruleTypeExpCS )
            // InternalMyAtlProject.g:8796:3: ruleTypeExpCS
            {
             before(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeExpCS();

            state._fsp--;

             after(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__OwnedTypeAssignment_2_1"


    // $ANTLR start "rule__NavigatingCommaArgCS__InitAssignment_3_1"
    // InternalMyAtlProject.g:8805:1: rule__NavigatingCommaArgCS__InitAssignment_3_1 : ( ruleExpCS ) ;
    public final void rule__NavigatingCommaArgCS__InitAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8809:1: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:8810:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:8810:2: ( ruleExpCS )
            // InternalMyAtlProject.g:8811:3: ruleExpCS
            {
             before(grammarAccess.getNavigatingCommaArgCSAccess().getInitExpCSParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getNavigatingCommaArgCSAccess().getInitExpCSParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingCommaArgCS__InitAssignment_3_1"


    // $ANTLR start "rule__NavigatingSemiArgCS__PrefixAssignment_0"
    // InternalMyAtlProject.g:8820:1: rule__NavigatingSemiArgCS__PrefixAssignment_0 : ( ( ';' ) ) ;
    public final void rule__NavigatingSemiArgCS__PrefixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8824:1: ( ( ( ';' ) ) )
            // InternalMyAtlProject.g:8825:2: ( ( ';' ) )
            {
            // InternalMyAtlProject.g:8825:2: ( ( ';' ) )
            // InternalMyAtlProject.g:8826:3: ( ';' )
            {
             before(grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0()); 
            // InternalMyAtlProject.g:8827:3: ( ';' )
            // InternalMyAtlProject.g:8828:4: ';'
            {
             before(grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0()); 

            }

             after(grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__PrefixAssignment_0"


    // $ANTLR start "rule__NavigatingSemiArgCS__NameAssignment_1"
    // InternalMyAtlProject.g:8839:1: rule__NavigatingSemiArgCS__NameAssignment_1 : ( ruleNavigatingArgExpCS ) ;
    public final void rule__NavigatingSemiArgCS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8843:1: ( ( ruleNavigatingArgExpCS ) )
            // InternalMyAtlProject.g:8844:2: ( ruleNavigatingArgExpCS )
            {
            // InternalMyAtlProject.g:8844:2: ( ruleNavigatingArgExpCS )
            // InternalMyAtlProject.g:8845:3: ruleNavigatingArgExpCS
            {
             before(grammarAccess.getNavigatingSemiArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigatingArgExpCS();

            state._fsp--;

             after(grammarAccess.getNavigatingSemiArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__NameAssignment_1"


    // $ANTLR start "rule__NavigatingSemiArgCS__OwnedTypeAssignment_2_1"
    // InternalMyAtlProject.g:8854:1: rule__NavigatingSemiArgCS__OwnedTypeAssignment_2_1 : ( ruleTypeExpCS ) ;
    public final void rule__NavigatingSemiArgCS__OwnedTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8858:1: ( ( ruleTypeExpCS ) )
            // InternalMyAtlProject.g:8859:2: ( ruleTypeExpCS )
            {
            // InternalMyAtlProject.g:8859:2: ( ruleTypeExpCS )
            // InternalMyAtlProject.g:8860:3: ruleTypeExpCS
            {
             before(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeExpCS();

            state._fsp--;

             after(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__OwnedTypeAssignment_2_1"


    // $ANTLR start "rule__NavigatingSemiArgCS__InitAssignment_3_1"
    // InternalMyAtlProject.g:8869:1: rule__NavigatingSemiArgCS__InitAssignment_3_1 : ( ruleExpCS ) ;
    public final void rule__NavigatingSemiArgCS__InitAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8873:1: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:8874:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:8874:2: ( ruleExpCS )
            // InternalMyAtlProject.g:8875:3: ruleExpCS
            {
             before(grammarAccess.getNavigatingSemiArgCSAccess().getInitExpCSParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getNavigatingSemiArgCSAccess().getInitExpCSParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingSemiArgCS__InitAssignment_3_1"


    // $ANTLR start "rule__IfExpCS__ConditionAssignment_1"
    // InternalMyAtlProject.g:8884:1: rule__IfExpCS__ConditionAssignment_1 : ( ruleExpCS ) ;
    public final void rule__IfExpCS__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8888:1: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:8889:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:8889:2: ( ruleExpCS )
            // InternalMyAtlProject.g:8890:3: ruleExpCS
            {
             before(grammarAccess.getIfExpCSAccess().getConditionExpCSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getIfExpCSAccess().getConditionExpCSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpCS__ConditionAssignment_1"


    // $ANTLR start "rule__IfExpCS__ThenExpressionAssignment_3"
    // InternalMyAtlProject.g:8899:1: rule__IfExpCS__ThenExpressionAssignment_3 : ( ruleExpCS ) ;
    public final void rule__IfExpCS__ThenExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8903:1: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:8904:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:8904:2: ( ruleExpCS )
            // InternalMyAtlProject.g:8905:3: ruleExpCS
            {
             before(grammarAccess.getIfExpCSAccess().getThenExpressionExpCSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getIfExpCSAccess().getThenExpressionExpCSParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpCS__ThenExpressionAssignment_3"


    // $ANTLR start "rule__IfExpCS__ElseExpressionAssignment_5"
    // InternalMyAtlProject.g:8914:1: rule__IfExpCS__ElseExpressionAssignment_5 : ( ruleExpCS ) ;
    public final void rule__IfExpCS__ElseExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8918:1: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:8919:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:8919:2: ( ruleExpCS )
            // InternalMyAtlProject.g:8920:3: ruleExpCS
            {
             before(grammarAccess.getIfExpCSAccess().getElseExpressionExpCSParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getIfExpCSAccess().getElseExpressionExpCSParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpCS__ElseExpressionAssignment_5"


    // $ANTLR start "rule__LetExpCS__VariableAssignment_1"
    // InternalMyAtlProject.g:8929:1: rule__LetExpCS__VariableAssignment_1 : ( ruleLetVariableCS ) ;
    public final void rule__LetExpCS__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8933:1: ( ( ruleLetVariableCS ) )
            // InternalMyAtlProject.g:8934:2: ( ruleLetVariableCS )
            {
            // InternalMyAtlProject.g:8934:2: ( ruleLetVariableCS )
            // InternalMyAtlProject.g:8935:3: ruleLetVariableCS
            {
             before(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLetVariableCS();

            state._fsp--;

             after(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpCS__VariableAssignment_1"


    // $ANTLR start "rule__LetExpCS__VariableAssignment_2_1"
    // InternalMyAtlProject.g:8944:1: rule__LetExpCS__VariableAssignment_2_1 : ( ruleLetVariableCS ) ;
    public final void rule__LetExpCS__VariableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8948:1: ( ( ruleLetVariableCS ) )
            // InternalMyAtlProject.g:8949:2: ( ruleLetVariableCS )
            {
            // InternalMyAtlProject.g:8949:2: ( ruleLetVariableCS )
            // InternalMyAtlProject.g:8950:3: ruleLetVariableCS
            {
             before(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLetVariableCS();

            state._fsp--;

             after(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpCS__VariableAssignment_2_1"


    // $ANTLR start "rule__LetExpCS__InAssignment_4"
    // InternalMyAtlProject.g:8959:1: rule__LetExpCS__InAssignment_4 : ( ruleExpCS ) ;
    public final void rule__LetExpCS__InAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8963:1: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:8964:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:8964:2: ( ruleExpCS )
            // InternalMyAtlProject.g:8965:3: ruleExpCS
            {
             before(grammarAccess.getLetExpCSAccess().getInExpCSParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getLetExpCSAccess().getInExpCSParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpCS__InAssignment_4"


    // $ANTLR start "rule__LetVariableCS__NameAssignment_0"
    // InternalMyAtlProject.g:8974:1: rule__LetVariableCS__NameAssignment_0 : ( ruleUnrestrictedName ) ;
    public final void rule__LetVariableCS__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8978:1: ( ( ruleUnrestrictedName ) )
            // InternalMyAtlProject.g:8979:2: ( ruleUnrestrictedName )
            {
            // InternalMyAtlProject.g:8979:2: ( ruleUnrestrictedName )
            // InternalMyAtlProject.g:8980:3: ruleUnrestrictedName
            {
             before(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnrestrictedName();

            state._fsp--;

             after(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetVariableCS__NameAssignment_0"


    // $ANTLR start "rule__LetVariableCS__OwnedTypeAssignment_1_1"
    // InternalMyAtlProject.g:8989:1: rule__LetVariableCS__OwnedTypeAssignment_1_1 : ( ruleTypeExpCS ) ;
    public final void rule__LetVariableCS__OwnedTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:8993:1: ( ( ruleTypeExpCS ) )
            // InternalMyAtlProject.g:8994:2: ( ruleTypeExpCS )
            {
            // InternalMyAtlProject.g:8994:2: ( ruleTypeExpCS )
            // InternalMyAtlProject.g:8995:3: ruleTypeExpCS
            {
             before(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeExpCS();

            state._fsp--;

             after(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetVariableCS__OwnedTypeAssignment_1_1"


    // $ANTLR start "rule__LetVariableCS__InitExpressionAssignment_3"
    // InternalMyAtlProject.g:9004:1: rule__LetVariableCS__InitExpressionAssignment_3 : ( ruleExpCS ) ;
    public final void rule__LetVariableCS__InitExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9008:1: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:9009:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:9009:2: ( ruleExpCS )
            // InternalMyAtlProject.g:9010:3: ruleExpCS
            {
             before(grammarAccess.getLetVariableCSAccess().getInitExpressionExpCSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getLetVariableCSAccess().getInitExpressionExpCSParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetVariableCS__InitExpressionAssignment_3"


    // $ANTLR start "rule__NestedExpCS__SourceAssignment_1"
    // InternalMyAtlProject.g:9019:1: rule__NestedExpCS__SourceAssignment_1 : ( ruleExpCS ) ;
    public final void rule__NestedExpCS__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9023:1: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:9024:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:9024:2: ( ruleExpCS )
            // InternalMyAtlProject.g:9025:3: ruleExpCS
            {
             before(grammarAccess.getNestedExpCSAccess().getSourceExpCSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getNestedExpCSAccess().getSourceExpCSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpCS__SourceAssignment_1"


    // $ANTLR start "rule__InfixedExpCS__OwnedOperatorAssignment_1_1_0"
    // InternalMyAtlProject.g:9034:1: rule__InfixedExpCS__OwnedOperatorAssignment_1_1_0 : ( ruleBinaryOperatorCS ) ;
    public final void rule__InfixedExpCS__OwnedOperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9038:1: ( ( ruleBinaryOperatorCS ) )
            // InternalMyAtlProject.g:9039:2: ( ruleBinaryOperatorCS )
            {
            // InternalMyAtlProject.g:9039:2: ( ruleBinaryOperatorCS )
            // InternalMyAtlProject.g:9040:3: ruleBinaryOperatorCS
            {
             before(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBinaryOperatorCS();

            state._fsp--;

             after(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixedExpCS__OwnedOperatorAssignment_1_1_0"


    // $ANTLR start "rule__InfixedExpCS__OwnedExpressionAssignment_1_1_1"
    // InternalMyAtlProject.g:9049:1: rule__InfixedExpCS__OwnedExpressionAssignment_1_1_1 : ( rulePrefixedExpCS ) ;
    public final void rule__InfixedExpCS__OwnedExpressionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9053:1: ( ( rulePrefixedExpCS ) )
            // InternalMyAtlProject.g:9054:2: ( rulePrefixedExpCS )
            {
            // InternalMyAtlProject.g:9054:2: ( rulePrefixedExpCS )
            // InternalMyAtlProject.g:9055:3: rulePrefixedExpCS
            {
             before(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrefixedExpCS();

            state._fsp--;

             after(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixedExpCS__OwnedExpressionAssignment_1_1_1"


    // $ANTLR start "rule__InfixOperatorCS__NameAssignment"
    // InternalMyAtlProject.g:9064:1: rule__InfixOperatorCS__NameAssignment : ( ruleInfixOperator ) ;
    public final void rule__InfixOperatorCS__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9068:1: ( ( ruleInfixOperator ) )
            // InternalMyAtlProject.g:9069:2: ( ruleInfixOperator )
            {
            // InternalMyAtlProject.g:9069:2: ( ruleInfixOperator )
            // InternalMyAtlProject.g:9070:3: ruleInfixOperator
            {
             before(grammarAccess.getInfixOperatorCSAccess().getNameInfixOperatorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInfixOperator();

            state._fsp--;

             after(grammarAccess.getInfixOperatorCSAccess().getNameInfixOperatorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperatorCS__NameAssignment"


    // $ANTLR start "rule__NavigationOperatorCS__NameAssignment"
    // InternalMyAtlProject.g:9079:1: rule__NavigationOperatorCS__NameAssignment : ( ruleNavigationOperator ) ;
    public final void rule__NavigationOperatorCS__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9083:1: ( ( ruleNavigationOperator ) )
            // InternalMyAtlProject.g:9084:2: ( ruleNavigationOperator )
            {
            // InternalMyAtlProject.g:9084:2: ( ruleNavigationOperator )
            // InternalMyAtlProject.g:9085:3: ruleNavigationOperator
            {
             before(grammarAccess.getNavigationOperatorCSAccess().getNameNavigationOperatorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigationOperator();

            state._fsp--;

             after(grammarAccess.getNavigationOperatorCSAccess().getNameNavigationOperatorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationOperatorCS__NameAssignment"


    // $ANTLR start "rule__PrefixedExpCS__OwnedOperatorAssignment_1_1"
    // InternalMyAtlProject.g:9094:1: rule__PrefixedExpCS__OwnedOperatorAssignment_1_1 : ( ruleUnaryOperatorCS ) ;
    public final void rule__PrefixedExpCS__OwnedOperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9098:1: ( ( ruleUnaryOperatorCS ) )
            // InternalMyAtlProject.g:9099:2: ( ruleUnaryOperatorCS )
            {
            // InternalMyAtlProject.g:9099:2: ( ruleUnaryOperatorCS )
            // InternalMyAtlProject.g:9100:3: ruleUnaryOperatorCS
            {
             before(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOperatorCS();

            state._fsp--;

             after(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixedExpCS__OwnedOperatorAssignment_1_1"


    // $ANTLR start "rule__PrefixedExpCS__OwnedExpressionAssignment_1_2"
    // InternalMyAtlProject.g:9109:1: rule__PrefixedExpCS__OwnedExpressionAssignment_1_2 : ( rulePrimaryExpCS ) ;
    public final void rule__PrefixedExpCS__OwnedExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9113:1: ( ( rulePrimaryExpCS ) )
            // InternalMyAtlProject.g:9114:2: ( rulePrimaryExpCS )
            {
            // InternalMyAtlProject.g:9114:2: ( rulePrimaryExpCS )
            // InternalMyAtlProject.g:9115:3: rulePrimaryExpCS
            {
             before(grammarAccess.getPrefixedExpCSAccess().getOwnedExpressionPrimaryExpCSParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpCS();

            state._fsp--;

             after(grammarAccess.getPrefixedExpCSAccess().getOwnedExpressionPrimaryExpCSParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixedExpCS__OwnedExpressionAssignment_1_2"


    // $ANTLR start "rule__UnaryOperatorCS__NameAssignment"
    // InternalMyAtlProject.g:9124:1: rule__UnaryOperatorCS__NameAssignment : ( rulePrefixOperator ) ;
    public final void rule__UnaryOperatorCS__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9128:1: ( ( rulePrefixOperator ) )
            // InternalMyAtlProject.g:9129:2: ( rulePrefixOperator )
            {
            // InternalMyAtlProject.g:9129:2: ( rulePrefixOperator )
            // InternalMyAtlProject.g:9130:3: rulePrefixOperator
            {
             before(grammarAccess.getUnaryOperatorCSAccess().getNamePrefixOperatorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrefixOperator();

            state._fsp--;

             after(grammarAccess.getUnaryOperatorCSAccess().getNamePrefixOperatorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperatorCS__NameAssignment"


    // $ANTLR start "rule__IndexExpCS__FirstIndexesAssignment_1_2"
    // InternalMyAtlProject.g:9139:1: rule__IndexExpCS__FirstIndexesAssignment_1_2 : ( ruleExpCS ) ;
    public final void rule__IndexExpCS__FirstIndexesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9143:1: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:9144:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:9144:2: ( ruleExpCS )
            // InternalMyAtlProject.g:9145:3: ruleExpCS
            {
             before(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__FirstIndexesAssignment_1_2"


    // $ANTLR start "rule__IndexExpCS__FirstIndexesAssignment_1_3_1"
    // InternalMyAtlProject.g:9154:1: rule__IndexExpCS__FirstIndexesAssignment_1_3_1 : ( ruleExpCS ) ;
    public final void rule__IndexExpCS__FirstIndexesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9158:1: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:9159:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:9159:2: ( ruleExpCS )
            // InternalMyAtlProject.g:9160:3: ruleExpCS
            {
             before(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getIndexExpCSAccess().getFirstIndexesExpCSParserRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__FirstIndexesAssignment_1_3_1"


    // $ANTLR start "rule__IndexExpCS__SecondIndexesAssignment_1_5_1"
    // InternalMyAtlProject.g:9169:1: rule__IndexExpCS__SecondIndexesAssignment_1_5_1 : ( ruleExpCS ) ;
    public final void rule__IndexExpCS__SecondIndexesAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9173:1: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:9174:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:9174:2: ( ruleExpCS )
            // InternalMyAtlProject.g:9175:3: ruleExpCS
            {
             before(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__SecondIndexesAssignment_1_5_1"


    // $ANTLR start "rule__IndexExpCS__SecondIndexesAssignment_1_5_2_1"
    // InternalMyAtlProject.g:9184:1: rule__IndexExpCS__SecondIndexesAssignment_1_5_2_1 : ( ruleExpCS ) ;
    public final void rule__IndexExpCS__SecondIndexesAssignment_1_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9188:1: ( ( ruleExpCS ) )
            // InternalMyAtlProject.g:9189:2: ( ruleExpCS )
            {
            // InternalMyAtlProject.g:9189:2: ( ruleExpCS )
            // InternalMyAtlProject.g:9190:3: ruleExpCS
            {
             before(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCS();

            state._fsp--;

             after(grammarAccess.getIndexExpCSAccess().getSecondIndexesExpCSParserRuleCall_1_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexExpCS__SecondIndexesAssignment_1_5_2_1"


    // $ANTLR start "rule__NavigatingExpCS__ArgumentAssignment_1_2_0"
    // InternalMyAtlProject.g:9199:1: rule__NavigatingExpCS__ArgumentAssignment_1_2_0 : ( ruleNavigatingArgCS ) ;
    public final void rule__NavigatingExpCS__ArgumentAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9203:1: ( ( ruleNavigatingArgCS ) )
            // InternalMyAtlProject.g:9204:2: ( ruleNavigatingArgCS )
            {
            // InternalMyAtlProject.g:9204:2: ( ruleNavigatingArgCS )
            // InternalMyAtlProject.g:9205:3: ruleNavigatingArgCS
            {
             before(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingArgCSParserRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigatingArgCS();

            state._fsp--;

             after(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingArgCSParserRuleCall_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__ArgumentAssignment_1_2_0"


    // $ANTLR start "rule__NavigatingExpCS__ArgumentAssignment_1_2_1"
    // InternalMyAtlProject.g:9214:1: rule__NavigatingExpCS__ArgumentAssignment_1_2_1 : ( ruleNavigatingCommaArgCS ) ;
    public final void rule__NavigatingExpCS__ArgumentAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9218:1: ( ( ruleNavigatingCommaArgCS ) )
            // InternalMyAtlProject.g:9219:2: ( ruleNavigatingCommaArgCS )
            {
            // InternalMyAtlProject.g:9219:2: ( ruleNavigatingCommaArgCS )
            // InternalMyAtlProject.g:9220:3: ruleNavigatingCommaArgCS
            {
             before(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigatingCommaArgCS();

            state._fsp--;

             after(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__ArgumentAssignment_1_2_1"


    // $ANTLR start "rule__NavigatingExpCS__ArgumentAssignment_1_2_2_0"
    // InternalMyAtlProject.g:9229:1: rule__NavigatingExpCS__ArgumentAssignment_1_2_2_0 : ( ruleNavigatingSemiArgCS ) ;
    public final void rule__NavigatingExpCS__ArgumentAssignment_1_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9233:1: ( ( ruleNavigatingSemiArgCS ) )
            // InternalMyAtlProject.g:9234:2: ( ruleNavigatingSemiArgCS )
            {
            // InternalMyAtlProject.g:9234:2: ( ruleNavigatingSemiArgCS )
            // InternalMyAtlProject.g:9235:3: ruleNavigatingSemiArgCS
            {
             before(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingSemiArgCSParserRuleCall_1_2_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigatingSemiArgCS();

            state._fsp--;

             after(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingSemiArgCSParserRuleCall_1_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__ArgumentAssignment_1_2_2_0"


    // $ANTLR start "rule__NavigatingExpCS__ArgumentAssignment_1_2_2_1"
    // InternalMyAtlProject.g:9244:1: rule__NavigatingExpCS__ArgumentAssignment_1_2_2_1 : ( ruleNavigatingCommaArgCS ) ;
    public final void rule__NavigatingExpCS__ArgumentAssignment_1_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9248:1: ( ( ruleNavigatingCommaArgCS ) )
            // InternalMyAtlProject.g:9249:2: ( ruleNavigatingCommaArgCS )
            {
            // InternalMyAtlProject.g:9249:2: ( ruleNavigatingCommaArgCS )
            // InternalMyAtlProject.g:9250:3: ruleNavigatingCommaArgCS
            {
             before(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigatingCommaArgCS();

            state._fsp--;

             after(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__ArgumentAssignment_1_2_2_1"


    // $ANTLR start "rule__NavigatingExpCS__ArgumentAssignment_1_2_3_0"
    // InternalMyAtlProject.g:9259:1: rule__NavigatingExpCS__ArgumentAssignment_1_2_3_0 : ( ruleNavigatingBarArgCS ) ;
    public final void rule__NavigatingExpCS__ArgumentAssignment_1_2_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9263:1: ( ( ruleNavigatingBarArgCS ) )
            // InternalMyAtlProject.g:9264:2: ( ruleNavigatingBarArgCS )
            {
            // InternalMyAtlProject.g:9264:2: ( ruleNavigatingBarArgCS )
            // InternalMyAtlProject.g:9265:3: ruleNavigatingBarArgCS
            {
             before(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingBarArgCSParserRuleCall_1_2_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigatingBarArgCS();

            state._fsp--;

             after(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingBarArgCSParserRuleCall_1_2_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__ArgumentAssignment_1_2_3_0"


    // $ANTLR start "rule__NavigatingExpCS__ArgumentAssignment_1_2_3_1"
    // InternalMyAtlProject.g:9274:1: rule__NavigatingExpCS__ArgumentAssignment_1_2_3_1 : ( ruleNavigatingCommaArgCS ) ;
    public final void rule__NavigatingExpCS__ArgumentAssignment_1_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyAtlProject.g:9278:1: ( ( ruleNavigatingCommaArgCS ) )
            // InternalMyAtlProject.g:9279:2: ( ruleNavigatingCommaArgCS )
            {
            // InternalMyAtlProject.g:9279:2: ( ruleNavigatingCommaArgCS )
            // InternalMyAtlProject.g:9280:3: ruleNavigatingCommaArgCS
            {
             before(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigatingCommaArgCS();

            state._fsp--;

             after(grammarAccess.getNavigatingExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_1_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatingExpCS__ArgumentAssignment_1_2_3_1"

    // Delegated rules


    protected DFA48 dfa48 = new DFA48(this);
    protected DFA49 dfa49 = new DFA49(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\21\21\uffff";
    static final String dfa_3s = "\1\16\21\uffff";
    static final String dfa_4s = "\1\121\21\uffff";
    static final String dfa_5s = "\1\uffff\20\1\1\2";
    static final String dfa_6s = "\22\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\1\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\17\uffff\1\21\2\uffff\1\21\5\uffff\1\21\4\uffff\1\21\2\uffff\1\21\3\uffff\1\21\3\uffff\3\21\1\uffff\1\21\2\uffff\1\21\2\uffff\1\21",
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

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "7002:2: ( rule__InfixedExpCS__Group_1__0 )?";
        }
    }
    static final String dfa_8s = "\1\1\21\uffff";
    static final String dfa_9s = "\1\uffff\1\2\20\1";
    static final String[] dfa_10s = {
            "\1\6\1\uffff\1\3\1\4\1\5\1\7\1\10\1\11\1\12\1\2\1\13\1\14\1\15\1\16\1\17\1\20\1\21\17\uffff\1\1\2\uffff\1\1\5\uffff\1\1\4\uffff\1\1\2\uffff\1\1\3\uffff\1\1\3\uffff\3\1\1\uffff\1\1\2\uffff\1\1\2\uffff\1\1",
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

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_9;
            this.special = dfa_6;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "()* loopback of 7062:3: ( rule__InfixedExpCS__Group_1_1__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x2410000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x2410000000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000001L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0080000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0820000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x1000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0800000000100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000FF00000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x08801FFF8001C070L,0x0000000000019470L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x08001FFF8001C070L,0x0000000000019470L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x8080000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000010050L,0x0000000000018030L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000007FFF4000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000000007FFF4002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x08001FFF80010070L,0x0000000000019470L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x08001FFF8001C072L,0x0000000000019470L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x18001FFF8001C070L,0x0000000000019470L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000400000000000L,0x0000000000020000L});

}