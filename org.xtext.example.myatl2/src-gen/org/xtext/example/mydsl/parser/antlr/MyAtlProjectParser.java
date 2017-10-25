/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalMyAtlProjectParser;
import org.xtext.example.mydsl.services.MyAtlProjectGrammarAccess;

public class MyAtlProjectParser extends AbstractAntlrParser {

	@Inject
	private MyAtlProjectGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_DOCUMENTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyAtlProjectParser createParser(XtextTokenStream stream) {
		return new InternalMyAtlProjectParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Module";
	}

	public MyAtlProjectGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyAtlProjectGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
