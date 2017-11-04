/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalMyATLParser;
import org.xtext.example.mydsl.services.MyATLGrammarAccess;

public class MyATLParser extends AbstractAntlrParser {

	@Inject
	private MyATLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyATLParser createParser(XtextTokenStream stream) {
		return new InternalMyATLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Module";
	}

	public MyATLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyATLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}