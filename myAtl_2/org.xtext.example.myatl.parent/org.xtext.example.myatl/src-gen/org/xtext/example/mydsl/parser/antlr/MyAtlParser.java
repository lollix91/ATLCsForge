/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalMyAtlParser;
import org.xtext.example.mydsl.services.MyAtlGrammarAccess;

public class MyAtlParser extends AbstractAntlrParser {

	@Inject
	private MyAtlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyAtlParser createParser(XtextTokenStream stream) {
		return new InternalMyAtlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Module";
	}

	public MyAtlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyAtlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}